package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class n4 {
    public static final java.lang.String a = "harmony";

    public n4() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a() {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "getDeviceBoard"
            java.lang.String r0 = r0.e(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L26
            java.lang.String r0 = android.os.Build.BOARD
            java.lang.String r0 = r0.toLowerCase()
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            r2.b(r1, r0)
        L26:
            return r0
    }

    public static java.lang.String a(android.content.Context r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\n\n2. 设备宽度:\n\t\t"
            r0.append(r1)
            int r1 = c(r2)
            r0.append(r1)
            java.lang.String r1 = "\n\n3. 设备高度:\n\t\t"
            r0.append(r1)
            int r2 = b(r2)
            r0.append(r2)
            java.lang.String r2 = "\n\n10. 系统默认语言:\n\t\t"
            r0.append(r2)
            java.lang.String r2 = c()
            r0.append(r2)
            java.lang.String r2 = "\n\n11. 硬件序列号(设备名):\n\t\t"
            r0.append(r2)
            java.lang.String r2 = l()
            r0.append(r2)
            java.lang.String r2 = "\n\n12. 手机型号:\n\t\t"
            r0.append(r2)
            java.lang.String r2 = p()
            r0.append(r2)
            java.lang.String r2 = "\n\n13. 生产厂商:\n\t\t"
            r0.append(r2)
            java.lang.String r2 = i()
            r0.append(r2)
            java.lang.String r2 = "\n\n14. 手机Fingerprint标识:\n\t\t"
            r0.append(r2)
            java.lang.String r2 = f()
            r0.append(r2)
            java.lang.String r2 = "\n\n15. Android 版本:\n\t\t"
            r0.append(r2)
            java.lang.String r2 = q()
            r0.append(r2)
            java.lang.String r2 = "\n\n16. Android SDK版本:\n\t\t"
            r0.append(r2)
            int r2 = k()
            r0.append(r2)
            java.lang.String r2 = "\n\n17. 安全patch 时间:\n\t\t"
            r0.append(r2)
            java.lang.String r2 = l.r.a()
            r0.append(r2)
            java.lang.String r2 = "\n\n19. 版本类型:\n\t\t"
            r0.append(r2)
            java.lang.String r2 = android.os.Build.TYPE
            r0.append(r2)
            java.lang.String r2 = "\n\n20. 用户名:\n\t\t"
            r0.append(r2)
            java.lang.String r2 = n()
            r0.append(r2)
            java.lang.String r2 = "\n\n21. 产品名:\n\t\t"
            r0.append(r2)
            java.lang.String r2 = j()
            r0.append(r2)
            java.lang.String r2 = "\n\n22. ID:\n\t\t"
            r0.append(r2)
            java.lang.String r2 = o()
            r0.append(r2)
            java.lang.String r2 = "\n\n23. 显示ID:\n\t\t"
            r0.append(r2)
            java.lang.String r2 = e()
            r0.append(r2)
            java.lang.String r2 = "\n\n24. 硬件名:\n\t\t"
            r0.append(r2)
            java.lang.String r2 = g()
            r0.append(r2)
            java.lang.String r2 = "\n\n25. 产品名:\n\t\t"
            r0.append(r2)
            java.lang.String r2 = d()
            r0.append(r2)
            java.lang.String r2 = "\n\n26. Bootloader:\n\t\t"
            r0.append(r2)
            java.lang.String r2 = android.os.Build.BOOTLOADER
            r0.append(r2)
            java.lang.String r2 = "\n\n27. 主板名:\n\t\t"
            r0.append(r2)
            java.lang.String r2 = a()
            r0.append(r2)
            java.lang.String r2 = "\n\n28. CodeName:\n\t\t"
            r0.append(r2)
            java.lang.String r2 = android.os.Build.VERSION.CODENAME
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static int b(android.content.Context r2) {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "getDeviceHeight"
            int r0 = r0.c(r1)
            if (r0 != 0) goto L1e
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.heightPixels
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            r0.a(r1, r2)
            return r2
        L1e:
            return r0
    }

    public static java.lang.String b() {
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r0 = r0.toLowerCase()
            return r0
    }

    public static int c(android.content.Context r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "getDeviceWidth"
            int r0 = r0.c(r1)
            if (r0 != 0) goto L22
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            r0.a(r1, r2)
            return r2
        L22:
            return r0
    }

    public static java.lang.String c() {
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r0 = r0.toLowerCase()
            return r0
    }

    public static java.lang.String d() {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "getDeviceDevice"
            java.lang.String r0 = r0.e(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L26
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r0 = r0.toLowerCase()
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            r2.b(r1, r0)
        L26:
            return r0
    }

    public static boolean d(android.content.Context r2) {
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r0 = "adb_enabled"
            r1 = 0
            int r2 = android.provider.Settings.Secure.getInt(r2, r0, r1)
            if (r2 == 0) goto Lf
            r2 = 1
            return r2
        Lf:
            return r1
    }

    public static java.lang.String e() {
            java.lang.String r0 = android.os.Build.DISPLAY
            java.lang.String r0 = r0.toLowerCase()
            return r0
    }

    public static boolean e(android.content.Context r2) {
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r0 = "development_settings_enabled"
            r1 = 0
            int r2 = android.provider.Settings.Secure.getInt(r2, r0, r1)
            if (r2 == 0) goto Lf
            r2 = 1
            return r2
        Lf:
            return r1
    }

    public static java.lang.String f() {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "getDeviceFubgerprint"
            java.lang.String r0 = r0.e(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L26
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r0 = r0.toLowerCase()
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            r2.b(r1, r0)
        L26:
            return r0
    }

    public static java.lang.String g() {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "getDeviceHardware"
            java.lang.String r0 = r0.e(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L26
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r0 = r0.toLowerCase()
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            r2.b(r1, r0)
        L26:
            return r0
    }

    public static java.lang.String h() {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "getDeviceHost"
            java.lang.String r0 = r0.e(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L26
            java.lang.String r0 = android.os.Build.HOST
            java.lang.String r0 = r0.toLowerCase()
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            r2.b(r1, r0)
        L26:
            return r0
    }

    public static java.lang.String i() {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "getDeviceManufacturer"
            java.lang.String r0 = r0.e(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L1d
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r0 = r0.toLowerCase()
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            r2.b(r1, r0)
        L1d:
            return r0
    }

    public static java.lang.String j() {
            java.lang.String r0 = android.os.Build.PRODUCT
            java.lang.String r0 = r0.toLowerCase()
            return r0
    }

    public static int k() {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "getDeviceSDK"
            int r0 = r0.c(r1)
            if (r0 != 0) goto L15
            int r0 = android.os.Build.VERSION.SDK_INT
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            r2.a(r1, r0)
        L15:
            return r0
    }

    public static java.lang.String l() {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "getDeviceSerial"
            java.lang.String r0 = r0.e(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L1d
            java.lang.String r0 = android.os.Build.SERIAL
            java.lang.String r0 = r0.toLowerCase()
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            r2.b(r1, r0)
        L1d:
            return r0
    }

    public static java.lang.String m() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Local:"
            r0.append(r1)
            java.util.Locale r2 = java.util.Locale.GERMAN
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "wangjie"
            com.acse.ottn.h2.a(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.util.Locale r3 = java.util.Locale.ENGLISH
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.util.Locale r3 = java.util.Locale.US
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.util.Locale r3 = java.util.Locale.CHINESE
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.util.Locale r3 = java.util.Locale.TAIWAN
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.util.Locale r3 = java.util.Locale.FRANCE
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.util.Locale r3 = java.util.Locale.FRENCH
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.util.Locale r3 = java.util.Locale.GERMANY
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.util.Locale r3 = java.util.Locale.ITALIAN
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.util.Locale r3 = java.util.Locale.JAPAN
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.util.Locale r1 = java.util.Locale.JAPANESE
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r2, r0)
            java.util.Locale[] r0 = java.util.Locale.getAvailableLocales()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String n() {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "getDeviceUser"
            java.lang.String r0 = r0.e(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L1d
            java.lang.String r0 = android.os.Build.USER
            java.lang.String r0 = r0.toLowerCase()
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            r2.b(r1, r0)
        L1d:
            return r0
    }

    public static java.lang.String o() {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "getMobileId"
            java.lang.String r0 = r0.e(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L1d
            java.lang.String r0 = android.os.Build.ID
            java.lang.String r0 = r0.toLowerCase()
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            r2.b(r1, r0)
        L1d:
            return r0
    }

    public static java.lang.String p() {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "getSystemModel"
            java.lang.String r0 = r0.e(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L26
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r0 = r0.toLowerCase()
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            r2.b(r1, r0)
        L26:
            return r0
    }

    public static java.lang.String q() {
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            java.lang.String r0 = r0.toLowerCase()
            return r0
    }

    public static java.lang.String r() {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.String r1 = ""
            if (r0 != 0) goto L9
            return r1
        L9:
            com.acse.ottn.s0 r0 = com.acse.ottn.s0.d()
            java.lang.String r0 = r0.a()
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.String r3 = "app_version_time"
            java.lang.String r2 = r2.e(r3)
            boolean r2 = r0.equals(r2)
            java.lang.String r4 = "app_version_code"
            if (r2 == 0) goto L2c
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r0 = r0.e(r4)
            return r0
        L2c:
            android.content.Context r2 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r5 = "0"
            android.content.Context r6 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            java.lang.String r6 = r6.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            r7 = 0
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r6, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            r6.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            int r7 = r2.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            r6.append(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            r6.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            java.lang.String r5 = r6.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            java.lang.String r1 = r2.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            java.lang.String r6 = "appName"
            r2.b(r6, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
        L5f:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            r1.b(r3, r0)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            r0.b(r4, r5)
            return r5
    }

    public static java.lang.String s() {
            java.lang.String r0 = android.os.Build.VERSION.INCREMENTAL
            return r0
    }

    public static boolean t() {
            r0 = 0
            java.lang.String r1 = "com.huawei.system.BuildEx"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L24
            java.lang.String r2 = "getOsBrand"
            r3 = 0
            java.lang.reflect.Method r2 = r1.getMethod(r2, r3)     // Catch: java.lang.Exception -> L24
            java.lang.ClassLoader r4 = r1.getClassLoader()     // Catch: java.lang.Exception -> L24
            if (r4 == 0) goto L24
            java.lang.ClassLoader r4 = r4.getParent()     // Catch: java.lang.Exception -> L24
            if (r4 != 0) goto L24
            java.lang.String r4 = "harmony"
            java.lang.Object r1 = r2.invoke(r1, r3)     // Catch: java.lang.Exception -> L24
            boolean r0 = r4.equals(r1)     // Catch: java.lang.Exception -> L24
        L24:
            return r0
    }
}
