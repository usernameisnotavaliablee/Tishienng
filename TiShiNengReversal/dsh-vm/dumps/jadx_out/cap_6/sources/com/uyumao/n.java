package com.uyumao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class n {
    public static java.lang.String a = null;
    public static java.lang.String b = null;
    public static java.lang.String c = null;
    public static java.lang.String d = "";

    public n() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.Object a(java.lang.Object r0, java.lang.String r1, int r2) {
            android.content.pm.PackageManager r0 = (android.content.pm.PackageManager) r0     // Catch: java.lang.Throwable -> L7
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static java.lang.String a() {
            java.lang.String r0 = com.uyumao.n.c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lc
            java.lang.String r0 = android.os.Build.BOARD
            com.uyumao.n.c = r0
        Lc:
            java.lang.String r0 = com.uyumao.n.c
            return r0
    }

    public static java.lang.String a(int r5) {
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L36
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r3.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = "/proc/"
            r3.append(r4)     // Catch: java.lang.Throwable -> L36
            r3.append(r5)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = "/cmdline"
            r3.append(r5)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L36
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L36
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r1.readLine()     // Catch: java.lang.Throwable -> L30
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L30
            if (r2 != 0) goto L32
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            goto L38
        L32:
            r1.close()     // Catch: java.lang.Throwable -> L35
        L35:
            return r5
        L36:
            r1 = r0
        L38:
            if (r1 == 0) goto L3d
            r1.close()     // Catch: java.lang.Throwable -> L3d
        L3d:
            return r0
    }

    public static void a(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public static boolean a(android.content.Context r1) {
            java.lang.String r0 = "android.permission.QUERY_ALL_PACKAGES"
            boolean r1 = com.umeng.commonsdk.utils.UMUtils.checkPermission(r1, r0)
            return r1
    }

    public static java.lang.String b() {
            java.lang.String r0 = com.uyumao.n.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L16
            java.lang.String r0 = android.os.Build.BRAND
            com.uyumao.n.a = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L16
            java.lang.String r0 = android.os.Build.MANUFACTURER
            com.uyumao.n.a = r0
        L16:
            java.lang.String r0 = com.uyumao.n.a
            return r0
    }

    public static java.lang.String b(android.content.Context r3) {
            java.lang.String r0 = com.uyumao.n.d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L5d
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L5d
            r1 = 28
            if (r0 < r1) goto L13
            java.lang.String r0 = androidx.work.impl.utils.d.a()     // Catch: java.lang.Throwable -> L5d
            goto L15
        L13:
            java.lang.String r0 = ""
        L15:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5b
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = a(r0)     // Catch: java.lang.Throwable -> L5d
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L5d
            if (r2 != 0) goto L2c
            com.uyumao.n.d = r1     // Catch: java.lang.Throwable -> L5d
            goto L5d
        L2c:
            java.lang.String r1 = "activity"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> L5d
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L5d
            java.util.List r3 = r3.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L5d
            int r1 = r3.size()     // Catch: java.lang.Throwable -> L5d
            if (r1 <= 0) goto L5d
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L5d
        L46:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L5d
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Throwable -> L5d
            int r2 = r1.pid     // Catch: java.lang.Throwable -> L5d
            if (r2 != r0) goto L46
            java.lang.String r3 = r1.processName     // Catch: java.lang.Throwable -> L5d
            com.uyumao.n.d = r3     // Catch: java.lang.Throwable -> L5d
            goto L5d
        L5b:
            com.uyumao.n.d = r0     // Catch: java.lang.Throwable -> L5d
        L5d:
            java.lang.String r3 = com.uyumao.n.d
            return r3
    }

    public static java.lang.String c() {
            java.lang.String r0 = com.uyumao.n.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lc
            java.lang.String r0 = android.os.Build.MODEL
            com.uyumao.n.b = r0
        Lc:
            java.lang.String r0 = com.uyumao.n.b
            return r0
    }

    public static boolean c(android.content.Context r2) {
            java.lang.String r0 = b(r2)     // Catch: java.lang.Exception -> L24
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Exception -> L24
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Exception -> L24
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> L24
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L24
            if (r1 != 0) goto L24
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L24
            if (r1 != 0) goto L24
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Exception -> L24
            if (r2 == 0) goto L24
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }
}
