package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ap {
    private static java.lang.String a = "SystemUtil";

    static {
            return
    }

    public ap() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static long a(android.content.Context r2) {
            com.beizi.fusion.tool.PackageUtil r0 = com.beizi.fusion.tool.PackageUtil.getInstance()     // Catch: java.lang.Throwable -> Ld
            android.content.pm.PackageInfo r2 = r0.getPackageInfo(r2)     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto Ld
            long r0 = r2.firstInstallTime     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public static java.lang.String a() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/system/bin/su"
            r0.<init>(r1)
            boolean r0 = r0.exists()
            java.lang.String r2 = "yes"
            if (r0 == 0) goto L16
            boolean r0 = c(r1)
            if (r0 == 0) goto L16
            return r2
        L16:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/system/xbin/su"
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L2a
            boolean r0 = c(r1)
            if (r0 == 0) goto L2a
            return r2
        L2a:
            java.lang.String r0 = "no"
            return r0
    }

    public static void a(android.view.View r2) {
            if (r2 == 0) goto Lf
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto Lf
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r2)
        Lf:
            return
    }

    public static boolean a(android.content.Context r2, java.lang.String r3) {
            r0 = 0
            if (r2 == 0) goto L19
            if (r3 == 0) goto L19
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lc
            goto L19
        Lc:
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L15
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = 0
        L16:
            if (r2 == 0) goto L19
            r0 = 1
        L19:
            return r0
    }

    public static boolean a(java.lang.String r1) {
            r0 = 1
            java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L5
            return r0
        L5:
            r1 = 0
            return r1
    }

    public static int b(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static long b(android.content.Context r2) {
            com.beizi.fusion.tool.PackageUtil r0 = com.beizi.fusion.tool.PackageUtil.getInstance()     // Catch: java.lang.Throwable -> Ld
            android.content.pm.PackageInfo r2 = r0.getPackageInfo(r2)     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto Ld
            long r0 = r2.lastUpdateTime     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public static void b(java.lang.String r1) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            return
    }

    public static boolean b() {
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Throwable -> L2a
        L4:
            boolean r1 = r0.hasMoreElements()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.Throwable -> L2a
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "tun0"
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L2a
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L2a
            if (r2 != 0) goto L28
            java.lang.String r2 = "ppp0"
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L4
        L28:
            r0 = 1
            return r0
        L2a:
            r0 = 0
            return r0
    }

    public static java.lang.String c(android.content.Context r1) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            return r0
    }

    private static boolean c(java.lang.String r4) {
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            r2.<init>()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            java.lang.String r3 = "ls -l "
            r2.append(r3)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            r2.append(r4)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            java.lang.Process r0 = r1.exec(r4)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            java.io.InputStream r2 = r0.getInputStream()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            java.lang.String r4 = r4.readLine()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            if (r4 == 0) goto L4b
            int r1 = r4.length()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            r2 = 4
            if (r1 < r2) goto L4b
            r1 = 3
            char r4 = r4.charAt(r1)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            r1 = 115(0x73, float:1.61E-43)
            if (r4 == r1) goto L42
            r1 = 120(0x78, float:1.68E-43)
            if (r4 != r1) goto L4b
        L42:
            r0.destroy()
            r4 = 1
            return r4
        L47:
            r4 = move-exception
            goto L4f
        L49:
            goto L55
        L4b:
            r0.destroy()
            goto L58
        L4f:
            if (r0 == 0) goto L54
            r0.destroy()
        L54:
            throw r4
        L55:
            if (r0 == 0) goto L58
            goto L4b
        L58:
            r4 = 0
            return r4
    }

    public static java.lang.String d(android.content.Context r1) {
            com.beizi.fusion.tool.PackageUtil r0 = com.beizi.fusion.tool.PackageUtil.getInstance()     // Catch: java.lang.Throwable -> Ld
            android.content.pm.PackageInfo r1 = r0.getPackageInfo(r1)     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Ld
            java.lang.String r1 = r1.versionName     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            java.lang.String r1 = ""
            return r1
    }

    public static int e(android.content.Context r1) {
            com.beizi.fusion.tool.PackageUtil r0 = com.beizi.fusion.tool.PackageUtil.getInstance()     // Catch: java.lang.Throwable -> Ld
            android.content.pm.PackageInfo r1 = r0.getPackageInfo(r1)     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Ld
            int r1 = r1.versionCode     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public static boolean f(android.content.Context r1) {
            r0 = 0
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch: java.lang.Throwable -> Ld
            int r1 = r1.flags     // Catch: java.lang.Throwable -> Ld
            r1 = r1 & 2
            if (r1 == 0) goto Ld
            r1 = 1
            return r1
        Ld:
            return r0
    }

    public static boolean g(android.content.Context r2) {
            r0 = 0
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "adb_enabled"
            int r2 = android.provider.Settings.Secure.getInt(r2, r1, r0)     // Catch: java.lang.Throwable -> Lf
            if (r2 <= 0) goto Lf
            r2 = 1
            return r2
        Lf:
            return r0
    }

    public static boolean h(android.content.Context r2) {
            r2 = 0
            java.lang.String r0 = "http.proxyHost"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "http.proxyPort"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L10
            goto L12
        L10:
            java.lang.String r1 = "-1"
        L12:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L20
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L20
            r0 = -1
            if (r1 == r0) goto L20
            r2 = 1
        L20:
            return r2
    }

    public static float i(android.content.Context r2) {
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            float r2 = (float) r2
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto L1c
            r0 = 1065353216(0x3f800000, float:1.0)
        L1c:
            float r2 = r2 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            return r2
    }

    public static float j(android.content.Context r1) {
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            float r0 = (float) r0
            int r1 = b(r1, r0)
            float r1 = (float) r1
            return r1
    }

    public static float k(android.content.Context r0) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            float r0 = (float) r0
            return r0
    }

    public static float l(android.content.Context r0) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            float r0 = (float) r0
            return r0
    }

    public static int m(android.content.Context r0) {
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            return r0
    }

    public static int n(android.content.Context r0) {
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            return r0
    }

    public static java.lang.Long o(android.content.Context r3) {
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            if (r3 != 0) goto L9
            return r0
        L9:
            com.beizi.fusion.tool.PackageUtil r1 = com.beizi.fusion.tool.PackageUtil.getInstance()     // Catch: java.lang.Exception -> L1a
            android.content.pm.PackageInfo r3 = r1.getPackageInfo(r3)     // Catch: java.lang.Exception -> L1a
            if (r3 == 0) goto L1a
            long r1 = r3.lastUpdateTime     // Catch: java.lang.Exception -> L1a
            java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L1a
            return r3
        L1a:
            return r0
    }
}
