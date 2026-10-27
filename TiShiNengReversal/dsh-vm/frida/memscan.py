#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
memscan.py —— 纯 native 内存扫描 dump 驱动（不走 Java bridge）。
用法: <pyvenv>/bin/python memscan.py [wait_seconds=55]
"""
import frida, sys, time, os, hashlib

BASE = os.path.dirname(os.path.abspath(__file__))
OUT = os.path.join(os.path.dirname(BASE), 'dumps', 'memscan')
os.makedirs(OUT, exist_ok=True)
WAIT = int(sys.argv[1]) if len(sys.argv) > 1 else 55

def on_message(message, data):
    if message.get('type') == 'error':
        print('[ERROR]', message.get('description', ''), flush=True)
        if message.get('stack'):
            print('[STACK]', message.get('stack'), flush=True)
        return
    payload = message.get('payload', {})
    if payload.get('type') == 'log':
        print(payload.get('msg', ''), flush=True)
    elif payload.get('type') == 'dex':
        idx = payload.get('idx', 0)
        size = payload.get('size', 0)
        addr = payload.get('addr', 'unknown')
        if data:
            md5 = hashlib.md5(data).hexdigest()
            fn = os.path.join(OUT, 'mem_%03d_%s_sz%d.dex' % (idx, md5[:8], size))
            with open(fn, 'wb') as f:
                f.write(data)
            print('[SAVED] %s addr=%s size=%d md5=%s' % (os.path.basename(fn), addr, size, md5[:8]), flush=True)
        else:
            print('[EMPTY] dex idx=%d addr=%s size=%d (no data)' % (idx, addr, size), flush=True)
    elif payload.get('type') == 'scan_done':
        print('[SCAN DONE] total dex found=%d' % payload.get('count', 0), flush=True)

def main():
    dev = frida.get_usb_device(timeout=15)
    print('[*] device ok:', dev, flush=True)
    js = open(os.path.join(BASE, 'memscan.js'), encoding='utf-8').read()
    pid = dev.spawn(['com.bxkj.student'])
    print('[*] spawned pid=%d' % pid, flush=True)
    session = dev.attach(pid)
    script = session.create_script(js)
    script.on('message', on_message)
    script.load()
    dev.resume(pid)
    print('[*] resumed, waiting %ds ...' % WAIT, flush=True)
    time.sleep(WAIT)
    try:
        session.detach()
    except Exception:
        pass
    try:
        dev.kill(pid)
    except Exception:
        pass
    print('[*] killed pid=%d' % pid, flush=True)

if __name__ == '__main__':
    main()
