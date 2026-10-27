package com.beizi.ad.lance.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class q {
    private static java.lang.String a = "SystemUtil";

    static {
            return
    }

    public q() {
            r1 = this;
            r1.<init>()
            return
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
            boolean r0 = a(r1)
            if (r0 == 0) goto L16
            return r2
        L16:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/system/xbin/su"
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L2a
            boolean r0 = a(r1)
            if (r0 == 0) goto L2a
            return r2
        L2a:
            java.lang.String r0 = "no"
            return r0
    }

    public static java.lang.String a(android.content.Context r1, java.lang.String r2) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r0 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: java.lang.Throwable -> L12
            int r1 = r1.versionCode     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L12
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            java.lang.String r1 = ""
            return r1
    }

    private static boolean a(java.lang.String r4) {
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

    public static java.lang.String b() {
            java.lang.String r0 = ""
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "mounted"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L36
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L36
            android.os.StatFs r2 = new android.os.StatFs     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> L36
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L36
            int r1 = r2.getBlockSize()     // Catch: java.lang.Throwable -> L36
            long r3 = (long) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r2.getBlockCount()     // Catch: java.lang.Throwable -> L36
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r5.<init>()     // Catch: java.lang.Throwable -> L36
            long r1 = r1 * r3
            r5.append(r1)     // Catch: java.lang.Throwable -> L36
            r5.append(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L36
        L36:
            return r0
    }

    public static java.lang.String b(android.content.Context r2) {
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L14
            java.lang.String r0 = "com.huawei.appmarket"
            r1 = 0
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r0, r1)     // Catch: java.lang.Throwable -> L14
            int r2 = r2.versionCode     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L14
            return r2
        L14:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String b(android.content.Context r1, java.lang.String r2) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r0 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = r1.versionName     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            java.lang.String r1 = ""
            return r1
    }

    public static long c() {
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 7
            int r0 = r0.get(r1)
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            switch(r0) {
                case 1: goto L1c;
                case 2: goto L1c;
                case 3: goto L13;
                case 4: goto L1c;
                case 5: goto L13;
                case 6: goto L1c;
                case 7: goto L13;
                default: goto L12;
            }
        L12:
            goto L27
        L13:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L27
        L1c:
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L27:
            long r0 = r1.longValue()
            return r0
    }

    public static java.lang.String c(android.content.Context r0) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    public static int d(android.content.Context r0) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            return r0
    }

    public static java.lang.String e(android.content.Context r0) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    public static int f(android.content.Context r0) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            return r0
    }

    public static int g(android.content.Context r0) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            return r0
    }

    public static int h(android.content.Context r2) {
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
            int r2 = (int) r2
            return r2
    }

    public static java.lang.String i(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r0 = 2
            if (r1 != r0) goto L10
            java.lang.String r1 = "2"
            return r1
        L10:
            java.lang.String r1 = "1"
            return r1
    }

    public static java.lang.String j(android.content.Context r3) {
            java.lang.String r0 = ""
            java.lang.String r1 = "activity"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> L24
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3     // Catch: java.lang.Throwable -> L24
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            r3.getMemoryInfo(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r3.<init>()     // Catch: java.lang.Throwable -> L24
            long r1 = r1.totalMem     // Catch: java.lang.Throwable -> L24
            r3.append(r1)     // Catch: java.lang.Throwable -> L24
            r3.append(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L24
            return r3
        L24:
            return r0
    }

    public static java.lang.String k(android.content.Context r1) {
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r0 = "android_id"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r0)
            if (r1 == 0) goto Ld
            return r1
        Ld:
            java.lang.String r1 = ""
            return r1
    }
}
