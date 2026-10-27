package com.bytedance.j.xt.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g {
    private static final java.lang.CharSequence a = null;
    private static final java.lang.CharSequence b = null;
    private static final java.lang.CharSequence c = null;

    static {
            java.lang.String r0 = "sony"
            com.bytedance.j.xt.tl.g.a = r0
            java.lang.String r0 = "amigo"
            com.bytedance.j.xt.tl.g.b = r0
            java.lang.String r0 = "funtouch"
            com.bytedance.j.xt.tl.g.c = r0
            return
    }

    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = android.os.Build.DISPLAY
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            java.lang.String r1 = "ro.gn.sv.version"
            java.lang.String r1 = e(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static boolean b() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = android.os.Build.MANUFACTURER
            r0.append(r1)
            java.lang.String r1 = android.os.Build.BRAND
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto L1b
            return r2
        L1b:
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "360"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L35
            java.lang.String r1 = "qiku"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L34
            goto L35
        L34:
            return r2
        L35:
            r0 = 1
            return r0
    }

    public static boolean c() {
            java.lang.String r0 = "ro.letv.release.version"
            java.lang.String r0 = e(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static java.lang.String d() {
            boolean r0 = com.bytedance.j.xt.tl.d.a()
            if (r0 == 0) goto Lb
            java.lang.String r0 = h()
            return r0
        Lb:
            boolean r0 = com.bytedance.j.xt.tl.d.d()
            if (r0 == 0) goto L16
            java.lang.String r0 = m()
            return r0
        L16:
            boolean r0 = f()
            if (r0 == 0) goto L21
            java.lang.String r0 = n()
            return r0
        L21:
            java.lang.String r0 = i()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L2c
            return r0
        L2c:
            boolean r0 = l()
            if (r0 == 0) goto L37
            java.lang.String r0 = j()
            return r0
        L37:
            boolean r0 = g()
            if (r0 == 0) goto L42
            java.lang.String r0 = a()
            return r0
        L42:
            boolean r0 = b()
            if (r0 == 0) goto L4d
            java.lang.String r0 = o()
            return r0
        L4d:
            java.lang.String r0 = k()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L58
            return r0
        L58:
            java.lang.String r0 = android.os.Build.DISPLAY
            return r0
    }

    private static java.lang.String e(java.lang.String r4) {
            java.lang.String r0 = ""
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "getprop "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r2.concat(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.Process r4 = r1.exec(r4)     // Catch: java.lang.Throwable -> L2f
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2f
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2f
            java.io.InputStream r3 = r4.getInputStream()     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2f
            r3 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L30
            r4.destroy()     // Catch: java.lang.Throwable -> L30
            com.bytedance.j.xt.tl.h.a(r1)
            return r0
        L2f:
            r1 = 0
        L30:
            com.bytedance.j.xt.tl.h.a(r1)
            return r0
    }

    public static boolean f() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L17
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "oppo"
            boolean r0 = r0.contains(r1)
            return r0
        L17:
            r0 = 0
            return r0
    }

    public static boolean g() {
            java.lang.String r0 = android.os.Build.DISPLAY
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1a
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.CharSequence r1 = com.bytedance.j.xt.tl.g.b
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    public static java.lang.String h() {
            boolean r0 = com.bytedance.j.xt.tl.d.a()
            if (r0 == 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "miui_"
            r0.<init>(r1)
            java.lang.String r1 = "ro.miui.ui.version.name"
            java.lang.String r1 = e(r1)
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            java.lang.String r1 = android.os.Build.VERSION.INCREMENTAL
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L25:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String i() {
            java.lang.String r0 = com.bytedance.j.xt.tl.d.b()
            if (r0 == 0) goto L2d
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r0.toLowerCase(r1)
            java.lang.String r2 = "emotionui"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "_"
            r1.append(r0)
            java.lang.String r0 = android.os.Build.DISPLAY
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L2d:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String j() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ro.vivo.os.build.display.id"
            java.lang.String r1 = e(r1)
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            java.lang.String r1 = "ro.vivo.product.version"
            java.lang.String r1 = e(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String k() {
            boolean r0 = c()
            if (r0 == 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "eui_"
            r0.<init>(r1)
            java.lang.String r1 = "ro.letv.release.version"
            java.lang.String r1 = e(r1)
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            java.lang.String r1 = android.os.Build.DISPLAY
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L25:
            java.lang.String r0 = ""
            return r0
    }

    public static boolean l() {
            java.lang.String r0 = "ro.vivo.os.build.display.id"
            java.lang.String r0 = e(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1e
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.CharSequence r1 = com.bytedance.j.xt.tl.g.c
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1e
            r0 = 1
            return r0
        L1e:
            r0 = 0
            return r0
    }

    public static java.lang.String m() {
            java.lang.String r0 = android.os.Build.DISPLAY
            if (r0 == 0) goto L15
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r0.toLowerCase(r1)
            java.lang.String r2 = "flyme"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L15
            return r0
        L15:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String n() {
            boolean r0 = f()
            if (r0 == 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "coloros_"
            r0.<init>(r1)
            java.lang.String r1 = "ro.build.version.opporom"
            java.lang.String r1 = e(r1)
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            java.lang.String r1 = android.os.Build.DISPLAY
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L25:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String o() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ro.build.uiversion"
            java.lang.String r1 = e(r1)
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            java.lang.String r1 = android.os.Build.DISPLAY
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
