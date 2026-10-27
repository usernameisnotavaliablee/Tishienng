package com.ss.android.socialbase.appdownloader.m;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e {
    public static java.lang.String a = null;
    private static java.lang.String b = "";
    public static java.lang.String c = "";
    private static java.lang.String d;
    private static java.lang.String e;
    public static java.lang.String f;
    private static java.lang.String g;
    private static java.lang.Boolean h;

    static {
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a() {
            java.lang.String r0 = "SAMSUNG"
            boolean r0 = i(r0)
            return r0
    }

    public static boolean b() {
            java.lang.Boolean r0 = com.ss.android.socialbase.appdownloader.m.e.h
            if (r0 != 0) goto L14
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.d.a()
            java.lang.String r1 = "harmony"
            boolean r0 = r0.equals(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.ss.android.socialbase.appdownloader.m.e.h = r0
        L14:
            java.lang.Boolean r0 = com.ss.android.socialbase.appdownloader.m.e.h
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static boolean c() {
            l()
            java.lang.String r0 = "V12"
            java.lang.String r1 = com.ss.android.socialbase.appdownloader.m.e.g
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static java.lang.String d(java.lang.String r5) throws java.lang.Throwable {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]
            r3 = 0
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2[r3] = r4
            java.lang.String r4 = "get"
            java.lang.reflect.Method r0 = r0.getMethod(r4, r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            r5 = 0
            java.lang.Object r5 = r0.invoke(r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            return r5
    }

    public static boolean e() {
            java.lang.String r0 = "MIUI"
            boolean r0 = i(r0)
            return r0
    }

    public static java.lang.String f() {
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.e
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            i(r0)
        L9:
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.e
            return r0
    }

    public static boolean g() {
            java.lang.String r0 = android.os.Build.BRAND
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "honor"
            if (r1 != 0) goto L14
            java.lang.String r0 = r0.toLowerCase()
            boolean r0 = r0.startsWith(r2)
            if (r0 != 0) goto L26
        L14:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L28
            java.lang.String r0 = r0.toLowerCase()
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L28
        L26:
            r0 = 1
            return r0
        L28:
            r0 = 0
            return r0
    }

    public static boolean h() {
            java.lang.String r0 = "EMUI"
            boolean r0 = i(r0)
            if (r0 != 0) goto L13
            java.lang.String r0 = "MAGICUI"
            boolean r0 = i(r0)
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    public static boolean i(java.lang.String r3) {
            t()
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.d
            if (r0 == 0) goto Lc
            boolean r3 = r0.equals(r3)
            return r3
        Lc:
            java.lang.String r0 = "ro.miui.ui.version.name"
            java.lang.String r0 = o(r0)
            com.ss.android.socialbase.appdownloader.m.e.e = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L28
            java.lang.String r0 = "MIUI"
            com.ss.android.socialbase.appdownloader.m.e.d = r0
            java.lang.String r0 = "com.xiaomi.market"
            com.ss.android.socialbase.appdownloader.m.e.f = r0
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.e
            com.ss.android.socialbase.appdownloader.m.e.g = r0
            goto L18d
        L28:
            java.lang.String r0 = "ro.build.version.emui"
            java.lang.String r0 = o(r0)
            com.ss.android.socialbase.appdownloader.m.e.e = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = "com.hihonor.appmarket"
            java.lang.String r2 = "MAGICUI"
            if (r0 != 0) goto L56
            boolean r0 = g()
            if (r0 == 0) goto L42
            r0 = r2
            goto L44
        L42:
            java.lang.String r0 = "EMUI"
        L44:
            com.ss.android.socialbase.appdownloader.m.e.d = r0
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L50
            com.ss.android.socialbase.appdownloader.m.e.f = r1
            goto L18d
        L50:
            java.lang.String r0 = "com.huawei.appmarket"
            com.ss.android.socialbase.appdownloader.m.e.f = r0
            goto L18d
        L56:
            java.lang.String r0 = "ro.build.version.magic"
            java.lang.String r0 = o(r0)
            com.ss.android.socialbase.appdownloader.m.e.e = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L6a
            com.ss.android.socialbase.appdownloader.m.e.d = r2
            com.ss.android.socialbase.appdownloader.m.e.f = r1
            goto L18d
        L6a:
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.b
            java.lang.String r0 = o(r0)
            com.ss.android.socialbase.appdownloader.m.e.e = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = "com.heytap.market"
            if (r0 != 0) goto L90
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.a
            com.ss.android.socialbase.appdownloader.m.e.d = r0
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.c
            int r0 = com.ss.android.socialbase.appdownloader.a.b(r0)
            if (r0 < 0) goto L8c
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.c
            com.ss.android.socialbase.appdownloader.m.e.f = r0
            goto L18d
        L8c:
            com.ss.android.socialbase.appdownloader.m.e.f = r1
            goto L18d
        L90:
            java.lang.String r0 = "ro.vivo.os.version"
            java.lang.String r0 = o(r0)
            com.ss.android.socialbase.appdownloader.m.e.e = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La8
            java.lang.String r0 = "VIVO"
            com.ss.android.socialbase.appdownloader.m.e.d = r0
            java.lang.String r0 = "com.bbk.appstore"
            com.ss.android.socialbase.appdownloader.m.e.f = r0
            goto L18d
        La8:
            java.lang.String r0 = "ro.smartisan.version"
            java.lang.String r0 = o(r0)
            com.ss.android.socialbase.appdownloader.m.e.e = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lc0
            java.lang.String r0 = "SMARTISAN"
            com.ss.android.socialbase.appdownloader.m.e.d = r0
            java.lang.String r0 = "com.smartisanos.appstore"
            com.ss.android.socialbase.appdownloader.m.e.f = r0
            goto L18d
        Lc0:
            java.lang.String r0 = "ro.gn.sv.version"
            java.lang.String r0 = o(r0)
            com.ss.android.socialbase.appdownloader.m.e.e = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Ld8
            java.lang.String r0 = "QIONEE"
            com.ss.android.socialbase.appdownloader.m.e.d = r0
            java.lang.String r0 = "com.gionee.aora.market"
            com.ss.android.socialbase.appdownloader.m.e.f = r0
            goto L18d
        Ld8:
            java.lang.String r0 = "ro.lenovo.lvp.version"
            java.lang.String r0 = o(r0)
            com.ss.android.socialbase.appdownloader.m.e.e = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lf0
            java.lang.String r0 = "LENOVO"
            com.ss.android.socialbase.appdownloader.m.e.d = r0
            java.lang.String r0 = "com.lenovo.leos.appstore"
            com.ss.android.socialbase.appdownloader.m.e.f = r0
            goto L18d
        Lf0:
            java.lang.String r0 = n()
            java.lang.String r0 = r0.toUpperCase()
            java.lang.String r2 = "SAMSUNG"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L108
            com.ss.android.socialbase.appdownloader.m.e.d = r2
            java.lang.String r0 = "com.sec.android.app.samsungapps"
            com.ss.android.socialbase.appdownloader.m.e.f = r0
            goto L18d
        L108:
            java.lang.String r0 = n()
            java.lang.String r0 = r0.toUpperCase()
            java.lang.String r2 = "ZTE"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L11f
            com.ss.android.socialbase.appdownloader.m.e.d = r2
            java.lang.String r0 = "zte.com.market"
            com.ss.android.socialbase.appdownloader.m.e.f = r0
            goto L18d
        L11f:
            java.lang.String r0 = n()
            java.lang.String r0 = r0.toUpperCase()
            java.lang.String r2 = "NUBIA"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L136
            com.ss.android.socialbase.appdownloader.m.e.d = r2
            java.lang.String r0 = "cn.nubia.neostore"
            com.ss.android.socialbase.appdownloader.m.e.f = r0
            goto L18d
        L136:
            java.lang.String r0 = s()
            java.lang.String r0 = r0.toUpperCase()
            java.lang.String r2 = "FLYME"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L153
            com.ss.android.socialbase.appdownloader.m.e.d = r2
            java.lang.String r0 = "com.meizu.mstore"
            com.ss.android.socialbase.appdownloader.m.e.f = r0
            java.lang.String r0 = s()
            com.ss.android.socialbase.appdownloader.m.e.e = r0
            goto L18d
        L153:
            java.lang.String r0 = n()
            java.lang.String r0 = r0.toUpperCase()
            java.lang.String r2 = "ONEPLUS"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L17d
            com.ss.android.socialbase.appdownloader.m.e.d = r2
            java.lang.String r0 = "ro.rom.version"
            java.lang.String r0 = o(r0)
            com.ss.android.socialbase.appdownloader.m.e.e = r0
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.c
            int r0 = com.ss.android.socialbase.appdownloader.a.b(r0)
            if (r0 < 0) goto L17a
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.c
            com.ss.android.socialbase.appdownloader.m.e.f = r0
            goto L18d
        L17a:
            com.ss.android.socialbase.appdownloader.m.e.f = r1
            goto L18d
        L17d:
            java.lang.String r0 = n()
            java.lang.String r0 = r0.toUpperCase()
            com.ss.android.socialbase.appdownloader.m.e.d = r0
            java.lang.String r0 = ""
            com.ss.android.socialbase.appdownloader.m.e.f = r0
            com.ss.android.socialbase.appdownloader.m.e.e = r0
        L18d:
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.d
            boolean r3 = r0.equals(r3)
            return r3
    }

    public static boolean j() {
            l()
            java.lang.String r0 = "V10"
            java.lang.String r1 = com.ss.android.socialbase.appdownloader.m.e.g
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static boolean k() {
            java.lang.String r0 = "FLYME"
            boolean r0 = i(r0)
            return r0
    }

    private static void l() {
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.g
            if (r0 != 0) goto L19
            java.lang.String r0 = "ro.miui.ui.version.name"
            java.lang.String r0 = o(r0)     // Catch: java.lang.Exception -> Ld
            com.ss.android.socialbase.appdownloader.m.e.g = r0     // Catch: java.lang.Exception -> Ld
            goto L11
        Ld:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L11:
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.g
            if (r0 != 0) goto L17
            java.lang.String r0 = ""
        L17:
            com.ss.android.socialbase.appdownloader.m.e.g = r0
        L19:
            return
    }

    public static java.lang.String m() {
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.f
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            i(r0)
        L9:
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.f
            return r0
    }

    @androidx.annotation.NonNull
    public static java.lang.String n() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            java.lang.String r0 = r0.trim()
            return r0
    }

    public static java.lang.String o(java.lang.String r3) {
            org.json.JSONObject r0 = com.ss.android.socialbase.downloader.jy.j.xt()
            java.lang.String r1 = "enable_reflect_system_properties"
            r2 = 1
            boolean r0 = r0.optBoolean(r1, r2)
            if (r0 == 0) goto L16
            java.lang.String r3 = d(r3)     // Catch: java.lang.Throwable -> L12
            return r3
        L12:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L16:
            java.lang.String r3 = v(r3)
            return r3
    }

    public static boolean p() {
            java.lang.String r0 = "VIVO"
            boolean r0 = i(r0)
            return r0
    }

    public static java.lang.String q() {
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.d
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            i(r0)
        L9:
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.d
            return r0
    }

    public static boolean r() {
            t()
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.a
            boolean r0 = i(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.lang.String s() {
            java.lang.String r0 = android.os.Build.DISPLAY
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            java.lang.String r0 = r0.trim()
            return r0
    }

    private static void t() {
            java.lang.String r0 = com.ss.android.socialbase.appdownloader.m.e.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L3d
            com.ss.android.socialbase.downloader.downloader.cw.gq()
            java.lang.String r0 = com.ss.android.socialbase.downloader.xt.up.xt
            com.ss.android.socialbase.appdownloader.m.e.a = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ro.build.version."
            r0.<init>(r1)
            java.lang.String r1 = com.ss.android.socialbase.downloader.xt.up.cw
            r0.append(r1)
            java.lang.String r1 = "rom"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ss.android.socialbase.appdownloader.m.e.b = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "com."
            r0.<init>(r1)
            java.lang.String r1 = com.ss.android.socialbase.downloader.xt.up.cw
            r0.append(r1)
            java.lang.String r1 = ".market"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ss.android.socialbase.appdownloader.m.e.c = r0
        L3d:
            return
    }

    public static boolean u() {
            l()
            java.lang.String r0 = "V11"
            java.lang.String r1 = com.ss.android.socialbase.appdownloader.m.e.g
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static java.lang.String v(java.lang.String r5) {
            r0 = 0
            r1 = 1
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = "getprop "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = r4.concat(r5)     // Catch: java.lang.Throwable -> L34
            java.lang.Process r5 = r3.exec(r5)     // Catch: java.lang.Throwable -> L34
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L34
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L34
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.lang.Throwable -> L34
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
            r5 = 1024(0x400, float:1.435E-42)
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = r3.readLine()     // Catch: java.lang.Throwable -> L35
            r3.close()     // Catch: java.lang.Throwable -> L35
            java.io.Closeable[] r1 = new java.io.Closeable[r1]
            r1[r0] = r3
            com.ss.android.socialbase.downloader.az.m.j(r1)
            return r5
        L34:
            r3 = r2
        L35:
            java.io.Closeable[] r5 = new java.io.Closeable[r1]
            r5[r0] = r3
            com.ss.android.socialbase.downloader.az.m.j(r5)
            return r2
    }

    public static boolean w() {
            java.lang.String r0 = "MAGICUI"
            boolean r0 = i(r0)
            return r0
    }
}
