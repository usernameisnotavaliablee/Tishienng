package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class a {
    private static final java.lang.CharSequence cw = null;
    public static boolean j;
    private static final java.util.concurrent.ExecutorService m = null;
    private static final java.lang.CharSequence r = null;
    private static final java.lang.CharSequence up = null;
    public static boolean xt;


    public static class j implements java.util.concurrent.Callable<java.lang.String> {
        private final java.lang.String j;

        public j(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                return
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.String call() throws java.lang.Exception {
                r1 = this;
                java.lang.String r0 = r1.call2()
                return r0
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public java.lang.String call2() throws java.lang.Exception {
                r5 = this;
                long r0 = java.lang.System.currentTimeMillis()
                java.lang.String r2 = r5.j
                java.lang.String r2 = com.bytedance.msdk.tl.a.j(r2)
                long r3 = java.lang.System.currentTimeMillis()
                long r3 = r3 - r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "property:"
                r0.<init>(r1)
                r0.append(r2)
                java.lang.String r1 = ",getSystemProperty use time :"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "RomUtils"
                com.bytedance.msdk.j.up.cw.j(r1, r0)
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 != 0) goto L4c
                java.lang.String r0 = "SP-getPropertyFromSP:"
                java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L4c
                java.lang.String r0 = r0.concat(r3)     // Catch: java.lang.Throwable -> L4c
                com.bytedance.msdk.j.up.cw.cw(r1, r0)     // Catch: java.lang.Throwable -> L4c
                java.lang.String r0 = "rom_info"
                android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L4c
                com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)     // Catch: java.lang.Throwable -> L4c
                java.lang.String r1 = "rom_property_info"
                r0.j(r1, r2)     // Catch: java.lang.Throwable -> L4c
            L4c:
                return r2
        }
    }

    static {
            java.lang.String r0 = "sony"
            com.bytedance.msdk.tl.a.cw = r0
            java.lang.String r0 = "amigo"
            com.bytedance.msdk.tl.a.r = r0
            java.lang.String r0 = "funtouch"
            com.bytedance.msdk.tl.a.up = r0
            com.bytedance.msdk.tl.a$1 r0 = new com.bytedance.msdk.tl.a$1
            r0.<init>()
            java.lang.String r1 = "romutils"
            r2 = 2
            java.util.concurrent.ExecutorService r0 = com.bytedance.msdk.j.up.m.j(r1, r2, r0)
            com.bytedance.msdk.tl.a.m = r0
            r0 = 0
            com.bytedance.msdk.tl.a.j = r0
            com.bytedance.msdk.tl.a.xt = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean ae() {
            java.lang.String r0 = "ro.vivo.os.build.display.id"
            java.lang.String r0 = cw(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1a
            java.lang.String r0 = r0.toLowerCase()
            java.lang.CharSequence r1 = com.bytedance.msdk.tl.a.up
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    public static java.lang.String av() {
            boolean r0 = az()
            if (r0 == 0) goto L17
            java.lang.String r0 = "ro.smartisan.version"
            java.lang.String r0 = cw(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "smartisan_"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.Throwable -> L17
            return r0
        L17:
            java.lang.String r0 = android.os.Build.DISPLAY
            return r0
    }

    public static boolean az() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "smartisan"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L15
            java.lang.String r0 = android.os.Build.BRAND
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    public static java.lang.String cw() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ro.build.uiversion"
            java.lang.String r1 = cw(r1)
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            java.lang.String r1 = android.os.Build.DISPLAY
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.String cw(java.lang.String r5) {
            java.lang.String r0 = ""
            java.lang.String r1 = kt()     // Catch: java.lang.Throwable -> L29
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2b
            com.bytedance.msdk.tl.a$j r2 = new com.bytedance.msdk.tl.a$j     // Catch: java.lang.Throwable -> L27
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L27
            java.util.concurrent.FutureTask r5 = new java.util.concurrent.FutureTask     // Catch: java.lang.Throwable -> L27
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L27
            java.util.concurrent.ExecutorService r2 = com.bytedance.msdk.tl.a.m     // Catch: java.lang.Throwable -> L27
            r2.execute(r5)     // Catch: java.lang.Throwable -> L27
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L27
            r3 = 1
            java.lang.Object r5 = r5.get(r3, r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L27
            r1 = r5
            goto L2b
        L27:
            goto L2b
        L29:
            r1 = r0
        L2b:
            if (r1 != 0) goto L2e
            return r0
        L2e:
            return r1
    }

    public static java.lang.String g() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = android.os.Build.DISPLAY
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            java.lang.String r1 = "ro.gn.sv.version"
            java.lang.String r1 = cw(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String i() {
            java.lang.String r0 = android.os.Build.DISPLAY
            if (r0 == 0) goto L11
            java.lang.String r1 = r0.toLowerCase()
            java.lang.String r2 = "flyme"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L11
            return r0
        L11:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String j() {
            boolean r0 = az()
            if (r0 == 0) goto Lb
            java.lang.String r0 = av()
            return r0
        Lb:
            boolean r0 = up()
            if (r0 == 0) goto L16
            java.lang.String r0 = vl()
            return r0
        L16:
            boolean r0 = xt()
            if (r0 == 0) goto L21
            java.lang.String r0 = i()
            return r0
        L21:
            boolean r0 = w()
            if (r0 == 0) goto L2c
            java.lang.String r0 = mi()
            return r0
        L2c:
            java.lang.String r0 = jy()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L37
            return r0
        L37:
            boolean r0 = ae()
            if (r0 == 0) goto L42
            java.lang.String r0 = m()
            return r0
        L42:
            boolean r0 = tl()
            if (r0 == 0) goto L4d
            java.lang.String r0 = g()
            return r0
        L4d:
            boolean r0 = r()
            if (r0 == 0) goto L58
            java.lang.String r0 = cw()
            return r0
        L58:
            java.lang.String r0 = oq()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L63
            return r0
        L63:
            java.lang.String r0 = android.os.Build.DISPLAY
            return r0
    }

    static /* synthetic */ java.lang.String j(java.lang.String r0) {
            java.lang.String r0 = xt(r0)
            return r0
    }

    public static java.lang.String jy() {
            java.lang.String r0 = ws()
            if (r0 == 0) goto L29
            java.lang.String r1 = r0.toLowerCase()
            java.lang.String r2 = "emotionui"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "_"
            r1.append(r0)
            java.lang.String r0 = android.os.Build.DISPLAY
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L29:
            java.lang.String r0 = ""
            return r0
    }

    private static java.lang.String kt() {
            java.lang.String r0 = ""
            java.lang.String r1 = "rom_info"
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.tl.l r1 = com.bytedance.msdk.tl.l.j(r1, r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "rom_property_info"
            java.lang.String r1 = r1.xt(r2, r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "RomUtils"
            java.lang.String r3 = "get Property From SP...="
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L22
            com.bytedance.msdk.j.up.cw.xt(r2, r3)     // Catch: java.lang.Throwable -> L22
            return r1
        L22:
            return r0
    }

    public static java.lang.String m() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ro.vivo.os.build.display.id"
            java.lang.String r1 = cw(r1)
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            java.lang.String r1 = "ro.vivo.product.version"
            java.lang.String r1 = cw(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String mi() {
            boolean r0 = w()
            if (r0 == 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "coloros_"
            r0.<init>(r1)
            java.lang.String r1 = "ro.build.version.opporom"
            java.lang.String r1 = cw(r1)
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

    public static java.lang.String oq() {
            boolean r0 = qv()
            if (r0 == 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "eui_"
            r0.<init>(r1)
            java.lang.String r1 = "ro.letv.release.version"
            java.lang.String r1 = cw(r1)
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

    public static boolean qv() {
            java.lang.String r0 = "ro.letv.release.version"
            java.lang.String r0 = cw(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static boolean r() {
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
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "360"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L31
            java.lang.String r1 = "qiku"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L30
            goto L31
        L30:
            return r2
        L31:
            r0 = 1
            return r0
    }

    public static boolean tl() {
            java.lang.String r0 = android.os.Build.DISPLAY
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L16
            java.lang.String r0 = r0.toLowerCase()
            java.lang.CharSequence r1 = com.bytedance.msdk.tl.a.r
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public static boolean up() {
            boolean r0 = com.bytedance.msdk.tl.a.xt
            if (r0 != 0) goto L11
            r0 = 1
            java.lang.String r1 = "miui.os.Build"
            java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> Lf
            com.bytedance.msdk.tl.a.j = r0     // Catch: java.lang.Exception -> Lf
            com.bytedance.msdk.tl.a.xt = r0     // Catch: java.lang.Exception -> Lf
            return r0
        Lf:
            com.bytedance.msdk.tl.a.xt = r0
        L11:
            boolean r0 = com.bytedance.msdk.tl.a.j
            return r0
    }

    public static java.lang.String vl() {
            boolean r0 = up()
            if (r0 == 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "miui_"
            r0.<init>(r1)
            java.lang.String r1 = "ro.miui.ui.version.name"
            java.lang.String r1 = cw(r1)
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

    public static boolean w() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L16
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "oppo"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public static java.lang.String ws() {
            java.lang.String r0 = "ro.build.version.emui"
            java.lang.String r0 = cw(r0)
            return r0
    }

    private static java.lang.String xt(java.lang.String r1) {
            java.lang.Class<com.bytedance.sdk.component.r.up> r0 = com.bytedance.sdk.component.r.up.class
            java.lang.Object r0 = com.bytedance.sdk.openadsdk.ats.AutoService.j(r0)
            com.bytedance.sdk.component.r.up r0 = (com.bytedance.sdk.component.r.up) r0
            if (r0 == 0) goto Lf
            java.lang.String r1 = r0.j(r1)
            return r1
        Lf:
            java.lang.String r1 = ""
            return r1
    }

    public static boolean xt() {
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
}
