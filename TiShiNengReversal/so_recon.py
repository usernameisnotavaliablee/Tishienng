#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""SO 侦察器：ELF 元信息 + 动态符号(导出/导入) + 有意义字符串扫描。
纯静态，离线。用于排定哪些 SO 值得深挖反汇编。"""
import sys, re, io
from elftools.elf.elffile import ELFFile

INTEREST = re.compile(
    rb'(AES|RSA|ECB|CBC|GCM|CTR|cipher|encrypt|decrypt|md5|sha1|sha256|hmac|'
    rb'_KEY|secret|token|sign|auth|nonce|salt|pkcs|base64|'
    rb'http[s]?://|\.com|\.cn|\.tsnkj|\.boxkj|\.bxkj|/dev/|/proc/|/sys/|/sdcard/|'
    rb'qemu|goldfish|genymotion|nox|bluestacks|ro\.|getprop|su\b|magisk|xposed|frida|TracerPid|ptrace|'
    rb'imei|imsi|android_id|oaid|mac|serial|boot_id|BootMark|UpdateMark|'
    rb'JNI|RegisterNatives|System\.loadLibrary|Ljava|Lcom/|nlohmann|openssl|'
    rb'getInstalledPackages|accessibilit|taobao|tbopen|alibc|jingdong|market://)',
    re.IGNORECASE)

def strings_from_section(data, minlen=5):
    out, cur = [], bytearray()
    for b in data:
        if 32 <= b < 127:
            cur.append(b)
        else:
            if len(cur) >= minlen:
                out.append(bytes(cur))
            cur = bytearray()
    if len(cur) >= minlen:
        out.append(bytes(cur))
    return out

def analyze(path):
    print("=" * 78)
    print("FILE:", path)
    with open(path, 'rb') as f:
        elf = ELFFile(f)
        print("  arch =", elf.get_machine_arch(), "| class =", elf.elfclass,
              "| type =", elf['e_type'])
        # 动态符号
        exp, imp = [], []
        for secname in ('.dynsym', '.symtab'):
            sec = elf.get_section_by_name(secname)
            if not sec:
                continue
            for sym in sec.iter_symbols():
                n = sym.name
                if not n:
                    continue
                shndx = sym['st_shndx']
                info = sym['st_info']
                if info['type'] in ('STT_FUNC', 'STT_OBJECT'):
                    if shndx == 'SHN_UNDEF':
                        imp.append(n)
                    else:
                        exp.append((n, sym['st_value']))
            break
        # 只显示业务相关导出(过滤 std:: 噪声)
        def biz(n):
            return not n.startswith(('_Z', 'std', '__')) or re.search(
                r'aes|rsa|auth|sign|decrypt|encrypt|generate|native|getSignature|format|Secret|devInfo|Boot|detect|emulator|jiagu|Dyn|Crypt', n, re.I)
        ex_biz = [(n, a) for n, a in exp if biz(n)]
        print(f"  exports total={len(exp)}  imports total={len(imp)}")
        print("  -- 业务相关导出符号(名, 地址) --")
        for n, a in ex_biz[:80]:
            print(f"     0x{a:08x}  {n}")
        # 关注的导入(看它调什么系统/openssl 函数)
        imp_hot = [n for n in imp if re.search(
            r'AES|EVP|RSA|MD5|SHA|HMAC|BIO|popen|system|open|read|fopen|getprop|__system_property|ptrace|fork|exec|socket', n)]
        print("  -- 关注的导入(openssl/系统调用) --")
        print("    ", ", ".join(sorted(set(imp_hot))[:60]))
        # 字符串
        f.seek(0)
        raw = f.read()
    hits = []
    for s in strings_from_section(raw, 5):
        if INTEREST.search(s):
            try:
                hits.append(s.decode('latin1'))
            except Exception:
                pass
    seen, uniq = set(), []
    for h in hits:
        if h not in seen:
            seen.add(h); uniq.append(h)
    print(f"  -- 有意义字符串 {len(uniq)} 条(去重，截前 120) --")
    for h in uniq[:120]:
        print("    |", h)

if __name__ == '__main__':
    for p in sys.argv[1:]:
        try:
            analyze(p)
        except Exception as e:
            print("ERR", p, e)
