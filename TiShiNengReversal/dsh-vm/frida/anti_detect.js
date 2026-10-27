/*
 * anti_detect.js —— 体适能 模拟器/调试检测绕过 (Apple Silicon AVD, 真 arm64, 无 houdini)
 * 与 unidbg_harness/anti_detect.js 的差别: 本文件在真 arm64 上运行,
 * native Interceptor.replace 对 libemulator_check 的导出是【有效的】。
 */
Java.perform(function () {
    console.log('[*] anti_detect loaded');

    // ---- 1) snail.antifake 模拟器检测 (Java 层) ----
    try {
        var Emu = Java.use('com.snail.antifake.jni.EmulatorDetectUtil');
        Emu.detect.overload('android.content.Context').implementation = function (c) {
            console.log('[+] EmulatorDetectUtil.detect -> false (bypassed)');
            return false;
        };
    } catch (e) { console.log('[-] no EmulatorDetectUtil(Java): ' + e); }

    try {
        ['com.snail.antifake.PhoneUtil', 'com.snail.antifake.deviceid.AntiFakeUtil'].forEach(function (cn) {
            try {
                var C = Java.use(cn);
                C.class.getDeclaredMethods().forEach(function (m) {
                    if (m.getReturnType().getName() === 'boolean') {
                        try { C[m.getName()].implementation = function () { return false; }; } catch (e) {}
                    }
                });
            } catch (e) {}
        });
    } catch (e) {}

    // ---- 2) native 检测: libemulator_check 导出 (真 arm64 上有效) ----
    try {
        var addr = Module.findExportByName('libemulator_check.so',
            'Java_com_snail_antifake_jni_EmulatorDetectUtil_detect');
        if (addr) {
            Interceptor.replace(addr, new NativeCallback(function () {
                console.log('[+] native EmulatorDetectUtil_detect -> 0 (replaced)');
                return 0;
            }, 'int', ['pointer', 'pointer']));
        } else {
            console.log('[-] libemulator_check export not found');
        }
    } catch (e) { console.log('[-] native replace: ' + e); }

    // ---- 3) Build 字段伪装 (Pixel 6 / raven) ----
    try {
        var Build = Java.use('android.os.Build');
        Build.FINGERPRINT.value = 'google/raven/raven:13/TQ3A.230805.001/10316531:user/release-keys';
        Build.MODEL.value = 'Pixel 6';
        Build.MANUFACTURER.value = 'Google';
        Build.BRAND.value = 'google';
        Build.PRODUCT.value = 'raven';
        Build.HARDWARE.value = 'raven';
        Build.DEVICE.value = 'raven';
        Build.BOARD.value = 'raven';
        console.log('[+] Build fields spoofed');
    } catch (e) { console.log('[-] Build spoof: ' + e); }

    // ---- 4) 文件存在性检测 (qemu/模拟器特征路径) ----
    try {
        var File = Java.use('java.io.File');
        var blocked = ['qemu', 'houdini', 'genymotion', 'vbox', 'ttvm', 'nox', 'ldplayer',
            'microvirt', '/dev/socket/qemud', '/dev/qemu_pipe', 'goldfish', 'ranchu'];
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

    // ---- 5) 系统属性检测 ----
    try {
        var SystemProperties = Java.use('android.os.SystemProperties');
        var fake = {
            'ro.kernel.qemu': '0', 'ro.hardware': 'raven', 'ro.product.model': 'Pixel 6',
            'ro.bootmode': 'unknown', 'ro.secure': '1', 'ro.debuggable': '0',
            'init.svc.qemu-props': '', 'qemu.sf.lcd_density': '', 'ro.boot.qemu': '0'
        };
        var origGet = SystemProperties.get.overload('java.lang.String');
        origGet.implementation = function (k) {
            if (fake[k] !== undefined) { console.log('[+] prop ' + k + ' -> ' + fake[k]); return fake[k]; }
            return this.get(k);
        };
    } catch (e) { console.log('[-] SystemProperties: ' + e); }

    console.log('[*] anti_detect setup done');
});
