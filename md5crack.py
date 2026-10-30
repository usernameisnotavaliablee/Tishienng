#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
md5crack.py — 无盐 MD5 爆破 / 字典碰撞，实时进度显示。

用法:
    python3 md5crack.py <md5>
    python3 md5crack.py <md5> -w rockyou.txt
    python3 md5crack.py <md5> -c 0123456789 -m 8 -j 8
    python3 md5crack.py <md5> --preset alnum -m 6
    python3 md5crack.py <md5> -w d.txt --no-brute

流程: 先跑字典(如果有), 再暴力枚举。
退出码: 0 = 找到, 1 = 未找到。
"""

import argparse
import hashlib
import multiprocessing as mp
import os
import queue
import re
import sys
import time

PRESETS = {
    "digits": "0123456789",
    "lower": "abcdefghijklmnopqrstuvwxyz",
    "upper": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
    "alpha": "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ",
    "alnum": "abcdefghijklmnopqrstuvwxyz0123456789",
    "alnum_upper": "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789",
    "hex": "0123456789abcdef",
    "full": "".join(chr(c) for c in range(0x20, 0x7F)),
}


# ---------------------------------------------------------------- 格式化

def fmt_num(n):
    if n is None:
        return "?"
    n = float(n)
    for unit in ("", "K", "M", "G", "T", "P", "E"):
        if abs(n) < 1000.0 or unit == "E":
            if unit == "":
                return f"{int(n)}"
            return f"{n:.2f}{unit}"
        n /= 1000.0
    return f"{n:.2f}E"


def fmt_time(s):
    if s is None or s != s or s == float("inf") or s < 0:
        return "--:--:--"
    s = int(s)
    h, r = divmod(s, 3600)
    m, sec = divmod(r, 60)
    if h:
        return f"{h:02d}:{m:02d}:{sec:02d}"
    return f"{m:02d}:{sec:02d}"


def render(tag, done, total, rate, elapsed, eta, extra=""):
    pct = (100.0 * done / total) if total else 0.0
    line = (
        f"[{tag}] {pct:6.2f}% | {fmt_num(done)}/{fmt_num(total)}"
        f" | {fmt_num(rate)}/s | {fmt_time(elapsed)} ETA {fmt_time(eta)}"
    )
    if extra:
        line += f" | {extra}"
    sys.stdout.write("\r" + line + "\x1b[K")
    sys.stdout.flush()


def done_line(msg):
    sys.stdout.write("\r" + " " * 10 + "\x1b[K")  # 清掉进度条残留
    sys.stdout.write("\r" + msg + "\n")
    sys.stdout.flush()


# ---------------------------------------------------------------- 字典模式

def run_wordlist(target_bin, path, poll=0.3):
    """按行读字典, 命中返回 bytes 明文, 否则 None。"""
    total = os.path.getsize(path)
    md5 = hashlib.md5
    start = time.time()
    last_t = start
    last_b = 0
    read = 0
    lines = 0
    rate = 0.0
    hit = None
    try:
        with open(path, "rb") as f:
            for raw in f:
                read += len(raw)
                lines += 1
                w = raw.strip()
                if not w:
                    continue
                if md5(w).digest() == target_bin:
                    hit = w
                    break
                now = time.time()
                if now - last_t >= poll:
                    rate = (read - last_b) / (now - last_t)
                    elapsed = now - start
                    eta = (total - read) / rate if rate > 0 else None
                    render("字典", read, total, rate, elapsed, eta,
                           f"行 {fmt_num(lines)}")
                    last_t, last_b = now, read
    except FileNotFoundError:
        done_line(f"[字典] 文件不存在: {path}")
        return None
    if hit is not None:
        done_line(f"[字典] 命中, 行 {lines}: {hit.decode('utf-8', 'replace')}")
    else:
        done_line(f"[字典] 扫描完毕 ({fmt_num(lines)} 行), 未命中")
    return hit


# ---------------------------------------------------------------- 爆破 worker

def _brute_worker(target_bin, charset_bytes, minlen, maxlen, heads,
                  counter, outq, stop, chunk):
    """每个 worker 负责首字符落在 heads 里的全部候选。"""
    md5 = hashlib.md5
    n = len(charset_bytes)
    wid = heads[0] if heads else "-"
    total_local = 0
    flushed = 0
    cur = ""

    def flush():
        nonlocal flushed
        pend = total_local - flushed
        if pend:
            with counter.get_lock():
                counter.value += pend
            flushed = total_local
        outq.put(("p", wid, total_local, cur))

    try:
        for h0 in heads:
            if stop.value:
                return
            h0b = h0.encode()
            plen = len(h0b)
            for L in range(minlen, maxlen + 1):
                if stop.value:
                    return
                rest = L - plen
                if rest < 0:
                    continue

                # 长度 == 首字符长度: 单个候选
                if rest == 0:
                    total_local += 1
                    cur = h0
                    if md5(h0b).digest() == target_bin:
                        outq.put(("found", h0))
                        stop.value = 1
                        return
                    if total_local - flushed >= chunk:
                        flush()
                    continue

                # 里程表式枚举剩余位, 每步只改 1 字节
                buf = bytearray(L)
                buf[:plen] = h0b
                z = charset_bytes[0]
                idxs = [0] * rest
                while True:
                    if md5(buf).digest() == target_bin:
                        outq.put(("found", buf.decode("utf-8", "replace")))
                        stop.value = 1
                        return
                    total_local += 1

                    k = rest - 1
                    while k >= 0:
                        idxs[k] += 1
                        if idxs[k] < n:
                            buf[plen + k] = charset_bytes[idxs[k]]
                            break
                        idxs[k] = 0
                        buf[plen + k] = z
                        k -= 1
                    if k < 0:
                        break

                    if total_local - flushed >= chunk:
                        cur = buf.decode("utf-8", "replace")
                        flush()
                        if stop.value:
                            return
    finally:
        flush()


# ---------------------------------------------------------------- 爆破主控

def run_brute(target_bin, charset, minlen, maxlen, jobs, chunk=4096):
    n = len(charset)
    total = sum(n ** L for L in range(minlen, maxlen + 1))

    # 按首字符轮转分桶, 各桶候选量均衡
    buckets = [[] for _ in range(jobs)]
    for i, ch in enumerate(charset):
        buckets[i % jobs].append(ch)
    buckets = [b for b in buckets if b]
    jobs = len(buckets)

    charset_bytes = charset.encode()
    counter = mp.Value("Q", 0)
    stop = mp.Value("b", 0)
    outq = mp.Queue()

    procs = [
        mp.Process(
            target=_brute_worker,
            args=(target_bin, charset_bytes, minlen, maxlen, b,
                  counter, outq, stop, chunk),
            daemon=True,
        )
        for b in buckets
    ]
    for p in procs:
        p.start()

    start = time.time()
    last_t = start
    last_c = 0
    rate = 0.0
    found = None
    cur_map = {}

    try:
        while True:
            time.sleep(0.2)
            while True:
                try:
                    msg = outq.get_nowait()
                except queue.Empty:
                    break
                if msg[0] == "found":
                    found = msg[1]
                    stop.value = 1
                elif msg[0] == "p":
                    cur_map[msg[1]] = msg[3]

            now = time.time()
            tried = counter.value
            dt = now - last_t
            if dt >= 0.4:
                rate = (tried - last_c) / dt if tried >= last_c else 0.0
                last_t, last_c = now, tried

            elapsed = now - start
            eta = (total - tried) / rate if rate > 0 else None
            extra = " ".join(v for v in list(cur_map.values())[:2] if v)
            render("爆破", tried, total, rate, elapsed, eta,
                   f"{jobs}核 {extra}".strip())

            if found or stop.value or not any(p.is_alive() for p in procs):
                break
    except KeyboardInterrupt:
        stop.value = 1
        done_line("[爆破] 用户中断")
    finally:
        stop.value = 1
        for p in procs:
            p.join(timeout=2)
        for p in procs:
            if p.is_alive():
                p.terminate()

    if found is not None:
        done_line(f"[爆破] 命中: {found}")
    else:
        done_line(f"[爆破] 空间已穷尽 ({fmt_num(total)} 个候选), 未命中")
    return found


# ---------------------------------------------------------------- entry

def main():
    ap = argparse.ArgumentParser(
        description="无盐 MD5 爆破/字典碰撞 (实时进度)",
        formatter_class=argparse.RawDescriptionHelpFormatter,
    )
    ap.add_argument("hash", help="32 位十六进制 MD5")
    ap.add_argument("-w", "--wordlist", help="字典文件路径, 每行一个候选")
    ap.add_argument("-c", "--charset", help="自定义字符集, 如 'abc123'")
    ap.add_argument("--preset", default="alnum",
                    help="字符集预设: " + ", ".join(PRESETS) + " (默认 alnum)")
    ap.add_argument("--minlen", type=int, default=1, help="最短长度 (默认 1)")
    ap.add_argument("-m", "--maxlen", type=int, default=6, help="最长长度 (默认 6)")
    ap.add_argument("-j", "--jobs", type=int, default=os.cpu_count() or 1,
                    help="并行进程数 (默认 CPU 核数)")
    ap.add_argument("--no-brute", action="store_true", help="只跑字典, 不爆破")
    args = ap.parse_args()

    target = args.hash.strip().lower()
    if not re.fullmatch(r"[0-9a-f]{32}", target):
        sys.exit("错误: 需要 32 位十六进制 MD5, 收到: %r" % args.hash)
    target_bin = bytes.fromhex(target)

    # 1) 字典
    if args.wordlist:
        hit = run_wordlist(target_bin, args.wordlist)
        if hit is not None:
            done_line("明文: " + hit.decode("utf-8", "replace"))
            return 0
        if args.no_brute:
            done_line("未找到 (仅字典模式)")
            return 1

    if args.no_brute:
        done_line("未找到 (未指定字典且 --no-brute)")
        return 1

    # 2) 爆破
    charset = args.charset if args.charset else PRESETS.get(args.preset)
    if not charset:
        sys.exit("错误: 未知 preset %r, 可选: %s"
                 % (args.preset, ", ".join(PRESETS)))
    if args.minlen < 1:
        sys.exit("错误: --minlen 必须 >= 1")
    if args.maxlen < args.minlen:
        sys.exit("错误: --maxlen 必须 >= --minlen")
    jobs = max(1, min(args.jobs, len(charset)))

    space = sum(len(charset) ** L for L in range(args.minlen, args.maxlen + 1))
    sys.stdout.write(
        f"目标 MD5 : {target}\n"
        f"字符集   : {charset!r} ({len(charset)} 个字符)\n"
        f"长度范围 : {args.minlen} .. {args.maxlen}\n"
        f"搜索空间 : {fmt_num(space)} 个候选\n"
        f"进程数   : {jobs}\n"
    )
    if space > 10 ** 13:
        sys.stdout.write(
            "警告: 搜索空间 > 10T, 按 ~1M/s/核 估算需天级时间。"
            "考虑缩小 -m 或换字典。\n")
    sys.stdout.flush()

    hit = run_brute(target_bin, charset, args.minlen, args.maxlen, jobs)
    if hit is not None:
        print("明文: " + hit)
        return 0
    print("未找到")
    return 1


if __name__ == "__main__":
    try:
        mp.set_start_method("fork")
    except (RuntimeError, ValueError):
        pass
    sys.exit(main())
