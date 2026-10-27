package com.bytedance.j.xt.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d {
    private static boolean a;

    static {
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a() {
            boolean r0 = com.bytedance.j.xt.tl.d.a
            if (r0 != 0) goto L11
            r0 = 1
            java.lang.String r1 = "miui.os.Build"
            java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> Lf
            com.bytedance.j.xt.ae.xt.a = r0     // Catch: java.lang.Exception -> Lf
            com.bytedance.j.xt.tl.d.a = r0     // Catch: java.lang.Exception -> Lf
            return r0
        Lf:
            com.bytedance.j.xt.tl.d.a = r0
        L11:
            boolean r0 = com.bytedance.j.xt.ae.xt.a
            return r0
    }

    public static java.lang.String b() {
            java.lang.String r0 = "ro.build.version.emui"
            java.lang.String r0 = e(r0)
            return r0
    }

    public static boolean c(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto La
            java.lang.String r1 = b()
        La:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L22
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "emotionui"
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto L22
            r1 = 1
            return r1
        L22:
            boolean r1 = f()
            return r1
    }

    public static boolean d() {
            java.lang.String r0 = android.os.Build.DISPLAY
            java.lang.String r1 = "Flyme"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L17
            java.lang.String r0 = android.os.Build.USER
            java.lang.String r1 = "flyme"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    private static java.lang.String e(java.lang.String r3) {
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "getprop "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r2.concat(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.Process r3 = r1.exec(r3)     // Catch: java.lang.Throwable -> L2e
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2e
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2e
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Throwable -> L2e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2e
            r3 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L2f
            r1.close()     // Catch: java.lang.Throwable -> L2f
            com.bytedance.j.xt.tl.h.a(r1)
            return r0
        L2e:
            r1 = r0
        L2f:
            com.bytedance.j.xt.tl.h.a(r1)
            return r0
    }

    public static boolean f() {
            r0 = 0
            java.lang.String r1 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L30
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "huawei"
            if (r2 != 0) goto L19
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = r1.toLowerCase(r2)     // Catch: java.lang.Throwable -> L30
            boolean r1 = r1.startsWith(r3)     // Catch: java.lang.Throwable -> L30
            if (r1 != 0) goto L2f
        L19:
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L30
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L30
            if (r2 != 0) goto L30
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = r1.toLowerCase(r2)     // Catch: java.lang.Throwable -> L30
            boolean r1 = r1.startsWith(r3)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L30
        L2f:
            r0 = 1
        L30:
            return r0
    }
}
