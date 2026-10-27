#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
force_load.py —— spawn 体适能 + anti_detect + capture_dex, 等启动完成后
                 按 manifest 全组件类名强制 loadClass 扩大解密覆盖面。
用法: <pyvenv>/bin/python force_load.py [wait_seconds=35]
日志: dsh-vm/logs/force_load.log (重定向由调用方决定)

改动记录(subagent_a):
  1) 加 frida_legacy_compat.patch_frida() —— Frida 17 默认不再对 plain JS
     注入 Java bridge，导致 "ReferenceError: 'Java' is not defined"。
     该补丁恢复 Frida 16 行为，让 Java.perform 直接可用。
  2) 修复 fl_src 里 Python % 字符串格式化与 JS %d 占位符冲突导致的
     "not enough arguments for format string" —— 改为字符串拼接。
  3) 所有 print 加 flush=True 便于实时观察进度。
"""
import frida, sys, time, json, os
try:
    import frida_legacy_compat
    frida_legacy_compat.patch_frida()
except ImportError:
    pass

BASE = os.path.dirname(os.path.abspath(__file__))
CLASSES = [l.strip() for l in open(os.path.join(BASE, 'classes.txt'), encoding='utf-8') if l.strip()]
WAIT = int(sys.argv[1]) if len(sys.argv) > 1 else 35

def on_message(message, data):
    if message.get('type') == 'error':
        print('[ERROR]', message.get('description', ''), flush=True)
        if message.get('stack'):
            print('[STACK]', message.get('stack'), flush=True)
    else:
        print(message.get('payload', ''), flush=True)

def main():
    dev = frida.get_usb_device(timeout=15)
    print('[*] device ok:', dev, flush=True)
    ad = open(os.path.join(BASE, 'anti_detect.js'), encoding='utf-8').read()
    cap = open(os.path.join(BASE, 'capture_dex.js'), encoding='utf-8').read()
    pid = dev.spawn(['com.bxkj.student'])
    print('[*] spawned pid=%d' % pid, flush=True)
    session = dev.attach(pid)
    script = session.create_script(ad + '\n' + cap)
    script.on('message', on_message)
    script.load()
    dev.resume(pid)
    print('[*] resumed, waiting %ds for app to reach login ...' % WAIT, flush=True)
    time.sleep(WAIT)

    names_json = json.dumps(CLASSES)
    fl_src = (
        "Java.perform(function () {\n"
        "    var names = " + names_json + ";\n"
        "    var cl = null;\n"
        "    try {\n"
        "        var app = Java.use('android.app.ActivityThread').currentApplication();\n"
        "        if (app) cl = app.getClassLoader();\n"
        "    } catch (e) {}\n"
        "    if (!cl) {\n"
        "        Java.enumerateClassLoaders({\n"
        "            onMatch: function (l) {\n"
        "                try { l.loadClass('com.bxkj.student.splash.SplashActivity'); cl = l; return 'stop'; }\n"
        "                catch (e) {}\n"
        "            },\n"
        "            onComplete: function () {}\n"
        "        });\n"
        "    }\n"
        "    if (!cl) { console.log('[FL] no classloader found'); return; }\n"
        "    console.log('[FL] classloader: ' + cl);\n"
        "    var ok = 0, fail = 0, failed = [];\n"
        "    names.forEach(function (n) {\n"
        "        try { cl.loadClass(n); ok++; }\n"
        "        catch (e) { fail++; failed.push(n); }\n"
        "    });\n"
        "    console.log('[FL DONE] total=' + names.length + ' ok=' + ok + ' fail=' + fail);\n"
        "    if (fail) console.log('[FL FAILED] ' + failed.join(','));\n"
        "});\n"
    )

    script2 = session.create_script(fl_src)
    script2.on('message', on_message)
    script2.load()
    time.sleep(15)
    print('[*] done. detaching & killing.', flush=True)
    session.detach()
    dev.kill(pid)
    print('[*] killed pid=%d' % pid, flush=True)

if __name__ == '__main__':
    main()
