/*
 * anti_detect.js —— frida 反检测注入脚本 (体适能 / com.bxkj.student)
 * 用法: frida -U -f com.bxkj.student -l anti_detect.js --no-pause
 *      (配合 frida-dexdump: 先注入挂住, 再 frida-dexdump -U -p <pid> -o ./dump)
 *
 * 目的: 让 App 在【MuMu Player 12 (root) + houdini】上能跑过模拟器/调试检测,
 *      从而让 360 在内存里把真业务 dex 解出来, 供 frida-dexdump 扫内存。
 *
 * ⚠️ 重要前提 (无Root单PC的关键卡点):
 *   houdini 是把 ARM 指令翻译成 x86 跑。frida 默认是 x86 agent, 它只能 hook
 *   "运行在 x86 上的代码" —— 即 ART/Java 层、以及编译成 x86 的 SO。
 *   而 libtsnsecret / libemulator_check 等 ARM64 SO 是被 houdini 翻译执行的,
 *   frida 的 Interceptor 对这些【ARM native 函数】基本 hook 不到 (找不到 x86 入口)。
 *   => 所以下面的 native 兜底很可能失效, 必须主要靠【Java 层】hook 过检测。
 *      检测点若在 native 且无 Java 入口可改, MuMu+frida 这条路就会卡 (见手册成功率)。
 */

Java.perform(function () {
    console.log("[*] anti_detect loaded");

    // ---- 1) com.snail.antifake 模拟器检测 (Java 层, 大概率能过) ----
    try {
        var Emu = Java.use('com.snail.antifake.jni.EmulatorDetectUtil');
        Emu.detect.overload('android.content.Context').implementation = function (c) {
            console.log('[+] EmulatorDetectUtil.detect -> false (bypassed)');
            return false;
        };
    } catch (e) { console.log('[-] no EmulatorDetectUtil(Java): ' + e); }

    // 部分版本检测方法名不同, 批量扫 com.snail.antifake.* 把返回布尔的检测方法翻成 false
    try {
        var classes = ['com.snail.antifake.PhoneUtil', 'com.snail.antifake.deviceid.AntiFakeUtil'];
        classes.forEach(function (cn) {
            try {
                var C = Java.use(cn);
                C.class.getDeclaredMethods().forEach(function (m) {
                    var name = m.getName();
                    if (m.getReturnType().getName() === 'boolean') {
                        try { C[name].implementation = function () { return false; }; } catch (e) {}
                    }
                });
            } catch (e) {}
        });
    } catch (e) {}

    // ---- 2) Build 字段伪装 (很多模拟器检测看这些) ----
    try {
        var Build = Java.use('android.os.Build');
        Build.FINGERPRINT.value = 'google/raven/raven:13/TQ3A.230805.001/10316531:user/release-keys';
        Build.MODEL.value = 'Pixel 6';
        Build.MANUFACTURER.value = 'Google';
        Build.BRAND.value = 'google';
        Build.PRODUCT.value = 'raven';
        Build.HARDWARE.value = 'raven';
        console.log('[+] Build fields spoofed');
    } catch (e) { console.log('[-] Build spoof: ' + e); }

    // ---- 3) 文件存在性检测 (qemu/houdini 特征文件) ----
    try {
        var File = Java.use('java.io.File');
        var blocked = ['qemu', 'houdini', 'genymotion', 'vbox', 'ttVM', 'nox', 'ldplayer', 'microvirt', '/dev/socket/qemud', '/dev/qemu_pipe'];
        File.exists.implementation = function () {
            var p = this.getAbsolutePath();
            for (var i = 0; i < blocked.length; i++) {
                if (p.toLowerCase().indexOf(blocked[i]) >= 0) {
                    console.log('[+] File.exists hide -> ' + p);
                    return false;
                }
            }
            return this.exists();
        };
    } catch (e) { console.log('[-] File hook: ' + e); }

    // ---- 4) 系统属性检测 (ro.kernel.qemu 等) ----
    try {
        var SystemProperties = Java.use('android.os.SystemProperties');
        var fake = {
            'ro.kernel.qemu': '0', 'ro.hardware': 'raven', 'ro.product.model': 'Pixel 6',
            'ro.bootmode': 'unknown', 'ro.secure': '1', 'ro.debuggable': '0'
        };
        SystemProperties.get.overload('java.lang.String').implementation = function (k) {
            if (fake[k] !== undefined) { console.log('[+] prop ' + k + ' -> ' + fake[k]); return fake[k]; }
            return this.get(k);
        };
    } catch (e) { console.log('[-] SystemProperties: ' + e); }

    // ---- 5) native 兜底 (houdini 下大概率无效, 留作非翻译SO的尝试) ----
    try {
        var addr = Module.findExportByName('libemulator_check.so',
            'Java_com_snail_antifake_jni_EmulatorDetectUtil_detect');
        if (addr) {
            Interceptor.replace(addr, new NativeCallback(function () {
                console.log('[+] native detect replaced -> 0'); return 0;
            }, 'int', ['pointer', 'pointer']));
        } else {
            console.log('[-] libemulator_check export not found via x86 agent (houdini? 预期之中)');
        }
    } catch (e) { console.log('[-] native replace: ' + e); }

    console.log("[*] anti_detect setup done — 现在让 App 走到业务页, 再跑 frida-dexdump");
});
