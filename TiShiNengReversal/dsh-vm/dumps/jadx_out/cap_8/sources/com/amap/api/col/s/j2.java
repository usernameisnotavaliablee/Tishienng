package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class j2 {

    /* renamed from: b, reason: collision with root package name */
    static byte[] f4526b;

    /* renamed from: c, reason: collision with root package name */
    static byte[] f4527c;
    private java.lang.String a;

    static {
            return
    }

    public j2(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            boolean r0 = android.text.TextUtils.isDigitsOnly(r2)
            if (r0 == 0) goto Lb
            java.lang.String r2 = "SPUtil"
        Lb:
            java.lang.String r2 = com.amap.api.col.s.g1.a(r2)
            r1.a = r2
            return
    }

    public static int a(android.content.Context r1, java.lang.String r2, java.lang.String r3, int r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)     // Catch: java.lang.Throwable -> La
            int r1 = r1.getInt(r3, r4)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            java.lang.String r2 = "csp"
            java.lang.String r3 = "giv"
            com.amap.api.col.s.g2.o(r1, r2, r3)
            return r4
    }

    public static long b(android.content.Context r1, java.lang.String r2, java.lang.String r3, long r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)     // Catch: java.lang.Throwable -> La
            long r1 = r1.getLong(r3, r4)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            java.lang.String r2 = "csp"
            java.lang.String r3 = "glv"
            com.amap.api.col.s.g2.o(r1, r2, r3)
            return r4
    }

    public static android.content.SharedPreferences.Editor c(android.content.Context r2, java.lang.String r3) {
            r0 = 0
            if (r2 == 0) goto L1c
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto La
            goto L1c
        La:
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r1)     // Catch: java.lang.Throwable -> L14
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L14
            return r2
        L14:
            r2 = move-exception
            java.lang.String r3 = "sp"
            java.lang.String r1 = "ge"
            com.amap.api.col.s.d2.e(r2, r3, r1)
        L1c:
            return r0
    }

    public static java.lang.String d(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = ""
            if (r2 != 0) goto L5
            return r0
        L5:
            r1 = 0
            android.content.SharedPreferences r3 = r2.getSharedPreferences(r3, r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = r3.getString(r4, r0)     // Catch: java.lang.Throwable -> L1b
            byte[] r3 = com.amap.api.col.s.j1.x(r3)     // Catch: java.lang.Throwable -> L1b
            byte[] r2 = q(r2, r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = com.amap.api.col.s.j1.g(r2)     // Catch: java.lang.Throwable -> L1b
            return r2
        L1b:
            return r0
    }

    public static void e(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            if (r1 == 0) goto L2a
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L2a
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto Lf
            goto L2a
        Lf:
            r0 = 0
            android.content.SharedPreferences r2 = r1.getSharedPreferences(r2, r0)     // Catch: java.lang.Throwable -> L2a
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L2a
            byte[] r4 = com.amap.api.col.s.j1.o(r4)     // Catch: java.lang.Throwable -> L2a
            byte[] r1 = n(r1, r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = com.amap.api.col.s.j1.D(r1)     // Catch: java.lang.Throwable -> L2a
            r2.putString(r3, r1)     // Catch: java.lang.Throwable -> L2a
            f(r2)     // Catch: java.lang.Throwable -> L2a
        L2a:
            return
    }

    public static void f(android.content.SharedPreferences.Editor r2) {
            if (r2 != 0) goto L3
            return
        L3:
            r2.apply()     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            java.lang.String r0 = "sp"
            java.lang.String r1 = "cm"
            com.amap.api.col.s.d2.e(r2, r0, r1)
            return
    }

    public static void g(android.content.SharedPreferences.Editor r1, java.lang.String r2) {
            if (r1 == 0) goto L15
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L9
            goto L15
        L9:
            r1.remove(r2)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            java.lang.String r2 = "sp"
            java.lang.String r0 = "rk"
            com.amap.api.col.s.d2.e(r1, r2, r0)
        L15:
            return
    }

    public static void h(android.content.SharedPreferences.Editor r0, java.lang.String r1, int r2) {
            r0.putInt(r1, r2)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            java.lang.String r1 = "csp"
            java.lang.String r2 = "putPrefsInt"
            com.amap.api.col.s.g2.o(r0, r1, r2)
            return
    }

    public static void i(android.content.SharedPreferences.Editor r1, java.lang.String r2, long r3) {
            if (r1 == 0) goto L15
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            goto L15
        L9:
            r1.putLong(r2, r3)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            java.lang.String r2 = "csp"
            java.lang.String r3 = "plv"
            com.amap.api.col.s.g2.o(r1, r2, r3)
        L15:
            return
    }

    public static void j(android.content.SharedPreferences.Editor r1, java.lang.String r2, java.lang.String r3) {
            if (r1 == 0) goto L1b
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L1b
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Lf
            goto L1b
        Lf:
            r1.putString(r2, r3)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r1 = move-exception
            java.lang.String r2 = "sp"
            java.lang.String r3 = "ps"
            com.amap.api.col.s.d2.e(r1, r2, r3)
        L1b:
            return
    }

    public static void k(android.content.SharedPreferences.Editor r0, java.lang.String r1, boolean r2) {
            r0.putBoolean(r1, r2)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            java.lang.String r1 = "csp"
            java.lang.String r2 = "setPrefsStr"
            com.amap.api.col.s.g2.o(r0, r1, r2)
            return
    }

    public static boolean l(android.content.Context r1, java.lang.String r2, java.lang.String r3, boolean r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)     // Catch: java.lang.Throwable -> La
            boolean r1 = r1.getBoolean(r3, r4)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            r1 = move-exception
            java.lang.String r2 = "csp"
            java.lang.String r3 = "gbv"
            com.amap.api.col.s.g2.o(r1, r2, r3)
            return r4
    }

    private static byte[] m(android.content.Context r2) {
            if (r2 != 0) goto L6
            r2 = 0
            byte[] r2 = new byte[r2]
            return r2
        L6:
            byte[] r0 = com.amap.api.col.s.j2.f4526b
            if (r0 == 0) goto Le
            int r1 = r0.length
            if (r1 <= 0) goto Le
            return r0
        Le:
            java.lang.String r2 = com.amap.api.col.s.x0.i(r2)
            byte[] r2 = r2.getBytes()
            com.amap.api.col.s.j2.f4526b = r2
            return r2
    }

    public static byte[] n(android.content.Context r1, byte[] r2) {
            byte[] r0 = m(r1)     // Catch: java.lang.Throwable -> Ld
            byte[] r1 = p(r1)     // Catch: java.lang.Throwable -> Ld
            byte[] r1 = com.amap.api.col.s.d1.h(r0, r2, r1)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = 0
            byte[] r1 = new byte[r1]
            return r1
    }

    public static java.lang.String o(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r1.getString(r3, r4)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            java.lang.String r2 = "csp"
            java.lang.String r3 = "gsv"
            com.amap.api.col.s.g2.o(r1, r2, r3)
            return r4
    }

    private static byte[] p(android.content.Context r2) {
            byte[] r0 = com.amap.api.col.s.j2.f4527c
            if (r0 == 0) goto L8
            int r1 = r0.length
            if (r1 <= 0) goto L8
            return r0
        L8:
            byte[] r0 = m(r2)
            byte[] r2 = m(r2)
            int r2 = r2.length
            int r2 = r2 / 2
            r1 = 0
            byte[] r2 = java.util.Arrays.copyOfRange(r0, r1, r2)
            com.amap.api.col.s.j2.f4527c = r2
            return r2
    }

    public static byte[] q(android.content.Context r1, byte[] r2) {
            byte[] r0 = m(r1)     // Catch: java.lang.Exception -> Ld
            byte[] r1 = p(r1)     // Catch: java.lang.Exception -> Ld
            byte[] r1 = com.amap.api.col.s.d1.e(r0, r2, r1)     // Catch: java.lang.Exception -> Ld
            return r1
        Ld:
            r1 = 0
            byte[] r1 = new byte[r1]
            return r1
    }
}
