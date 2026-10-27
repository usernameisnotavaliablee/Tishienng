#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
dump_dex.py —— am start 启动 app 后 attach，跑 dump_dex.js 落盘 dex 到设备
               files/dexcap/，之后 adb pull。
用法: <pyvenv16>/bin/python dump_dex.py [wait=35]
"""
import frida, sys, time, os, subprocess

ADB = '/Users/mac/Desktop/tishineng.apk/sdk/platform-tools/platform-tools/adb'
BASE = os.path.dirname(os.path.abspath(__file__))
WAIT = int(sys.argv[1]) if len(sys.argv) > 1 else 35

def sh(*a):
    return subprocess.check_output(a, text=True).strip()

def on_message(message, data):
    if message.get('type') == 'error':
        print('[ERROR]', message.get('description', ''), flush=True)
        return
    p = message.get('payload', {})
    if p.get('type') == 'log':
        print(p.get('msg', ''), flush=True)

def main():
    # 清空 dexcap 并启动
    sh(ADB, 'shell', 'am', 'force-stop', 'com.bxkj.student')
    sh(ADB, 'shell', 'rm', '-rf', '/data/data/com.bxkj.student/files/dexcap')
    sh(ADB, 'shell', 'mkdir', '-p', '/data/data/com.bxkj.student/files/dexcap')
    sh(ADB, 'shell', 'am', 'start', '-n', 'com.bxkj.student/com.bxkj.student.splash.SplashActivity')
    print('[*] app launched, waiting 2s ...', flush=True)
    time.sleep(2)
    pid = int(sh(ADB, 'shell', 'pidof', 'com.bxkj.student'))
    print('[*] pid=%d' % pid, flush=True)

    dev = frida.get_usb_device(timeout=15)
    session = dev.attach(pid)
    js = open(os.path.join(BASE, 'dump_dex.js'), encoding='utf-8').read()
    script = session.create_script(js)
    script.on('message', on_message)
    script.load()
    print('[*] dump script loaded, waiting %ds ...' % WAIT, flush=True)
    time.sleep(WAIT)
    try:
        session.detach()
    except Exception:
        pass
    print('[*] done' % pid, flush=True)

if __name__ == '__main__':
    main()
