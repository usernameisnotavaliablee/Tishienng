package cn.jiguang.commons.z;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class e {
    public static final java.lang.String a = null;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f1240c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f1241d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f1242e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f1243f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f1244g = null;

    /* renamed from: h, reason: collision with root package name */
    private static java.util.concurrent.atomic.AtomicReference f1245h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f1246i = null;

    static {
            r0 = 7
            byte[] r0 = new byte[r0]
            r0 = {x005c: FILL_ARRAY_DATA , data: [99, 97, 102, 78, 93, 127, 106} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.z.e.a = r0
            r0 = 6
            byte[] r0 = new byte[r0]
            r0 = {x0064: FILL_ARRAY_DATA , data: [70, 124, 87, 123, 78, 67} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.z.e.f1240c = r0
            r0 = 3
            byte[] r1 = new byte[r0]
            r1 = {x006c: FILL_ARRAY_DATA , data: [108, 78, 92} // fill-array
            java.lang.String r1 = cn.jiguang.commons.L.n.c(r1)
            cn.jiguang.commons.z.e.f1241d = r1
            byte[] r1 = new byte[r0]
            r1 = {x0072: FILL_ARRAY_DATA , data: [101, 78, 85} // fill-array
            java.lang.String r1 = cn.jiguang.commons.L.n.c(r1)
            cn.jiguang.commons.z.e.f1242e = r1
            byte[] r0 = new byte[r0]
            r0 = {x0078: FILL_ARRAY_DATA , data: [99, 78, 84} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.z.e.f1243f = r0
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x007e: FILL_ARRAY_DATA , data: [127, 85, 69, 125, 87, 100, 116, 64, 79, 107, 124, 73, 125, 95, 65, 125} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.z.e.f1244g = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            cn.jiguang.commons.z.e.f1245h = r0
            r0 = 45
            byte[] r0 = new byte[r0]
            r0 = {x008a: FILL_ARRAY_DATA , data: [126, 101, 68, 80, 106, 50, 57, 62, 81, 86, 120, 100, 121, 127, 30, 74, 105, 125, 101, 121, 30, 67, 119, 39, 114, 120, 67, 84, 54, 98, 99, 101, 89, 76, 106, 37, 102, 100, 82, 76, 112, 107, 56, 118, 74} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.z.e.f1246i = r0
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static cn.jiguang.internal.Hr a(java.lang.String r1, java.lang.String r2, java.util.Map r3, byte[] r4) {
            cn.jiguang.commons.x.c r0 = new cn.jiguang.commons.x.c
            r0.<init>(r2)
            r0.c(r1)
            if (r4 == 0) goto Ld
            r0.a(r4)
        Ld:
            if (r3 == 0) goto L12
            r0.a(r3)
        L12:
            cn.jiguang.commons.x.d r1 = cn.jiguang.commons.x.e.a(r0)
            if (r1 == 0) goto L36
            byte[] r2 = r1.c()
            if (r2 != 0) goto L21
            r2 = 0
            byte[] r2 = new byte[r2]
        L21:
            java.util.Map r3 = r1.e()
            if (r3 != 0) goto L2c
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
        L2c:
            cn.jiguang.internal.Hr r4 = new cn.jiguang.internal.Hr
            int r1 = r1.d()
            r4.<init>(r1, r3, r2)
            return r4
        L36:
            r1 = 0
            return r1
    }

    public static java.lang.String a(cn.jiguang.commons.x.d r7) {
            r0 = 0
            if (r7 == 0) goto L75
            java.util.Map r1 = r7.e()
            if (r1 != 0) goto La
            goto L75
        La:
            java.util.Map r7 = r7.e()
            java.lang.String r1 = cn.jiguang.commons.z.a.f1228d
            java.lang.String r2 = cn.jiguang.commons.z.a.f1229e
            java.lang.String r3 = cn.jiguang.commons.z.a.f1230f
            java.lang.String r4 = cn.jiguang.commons.z.a.f1231g
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4}
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L22:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L75
            java.lang.Object r2 = r7.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L3b
            goto L22
        L3b:
            r4 = 0
        L3c:
            r5 = 4
            if (r4 >= r5) goto L22
            r5 = r1[r4]
            boolean r5 = r3.equalsIgnoreCase(r5)
            if (r5 == 0) goto L72
            java.lang.Object r5 = r2.getValue()
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L72
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "m d f h "
            r7.append(r0)
            r7.append(r3)
            java.lang.String r0 = ": "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "JSM"
            cn.jiguang.commons.w.a.a(r0, r7)
            return r5
        L72:
            int r4 = r4 + 1
            goto L3c
        L75:
            return r0
    }

    public static java.lang.String a(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return r2
        L7:
            char[] r2 = r2.toCharArray()
            r0 = 0
        Lc:
            int r1 = r2.length
            if (r0 >= r1) goto L19
            char r1 = r2[r0]
            r1 = r1 ^ 2000(0x7d0, float:2.803E-42)
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto Lc
        L19:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
    }

    private static java.lang.String a(java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "http://"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L44
            java.lang.String r0 = "https://"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L19
            goto L44
        L19:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> L28
            r0.<init>(r3)     // Catch: java.lang.Exception -> L28
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Exception -> L28
            r3.<init>(r0, r2)     // Catch: java.lang.Exception -> L28
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L28
            return r2
        L28:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "parse redirect url failed: "
            r3.append(r0)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "JSM"
            cn.jiguang.commons.w.a.f(r3, r2)
            return r1
        L44:
            return r2
    }

    public static void a() {
            r0 = 0
            c(r0)
            return
    }

    public static void a(boolean r2) {
            android.content.SharedPreferences r0 = e()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = cn.jiguang.commons.z.e.f1242e
            android.content.SharedPreferences$Editor r2 = r0.putBoolean(r1, r2)
            r2.apply()
            return
    }

    private static boolean a(int r1) {
            r0 = 301(0x12d, float:4.22E-43)
            if (r1 == r0) goto L17
            r0 = 302(0x12e, float:4.23E-43)
            if (r1 == r0) goto L17
            r0 = 303(0x12f, float:4.25E-43)
            if (r1 == r0) goto L17
            r0 = 307(0x133, float:4.3E-43)
            if (r1 == r0) goto L17
            r0 = 308(0x134, float:4.32E-43)
            if (r1 != r0) goto L15
            goto L17
        L15:
            r1 = 0
            return r1
        L17:
            r1 = 1
            return r1
    }

    public static cn.jiguang.commons.x.d c(java.lang.String r9, java.lang.String r10) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 3
            java.lang.String r3 = "JSM"
            if (r1 >= r2) goto Ld0
            cn.jiguang.commons.x.c r4 = new cn.jiguang.commons.x.c
            r4.<init>(r9)
            r4.c(r10)
            r4.a(r0)
            cn.jiguang.commons.g.p r5 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = r5.d()     // Catch: java.lang.Throwable -> L2e
            cn.jiguang.commons.g.p r6 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Throwable -> L2e
            long r6 = r6.l()     // Catch: java.lang.Throwable -> L2e
            boolean r8 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L2e
            if (r8 != 0) goto L30
            java.lang.String r8 = cn.jiguang.commons.z.a.a     // Catch: java.lang.Throwable -> L2e
            r4.a(r8, r5)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r5 = move-exception
            goto L3a
        L30:
            java.lang.String r5 = cn.jiguang.commons.z.a.f1227c     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L2e
            r4.a(r5, r6)     // Catch: java.lang.Throwable -> L2e
            goto L52
        L3a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "s hs error: "
            r6.append(r7)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jiguang.commons.w.a.f(r3, r5)
        L52:
            cn.jiguang.commons.x.d r4 = cn.jiguang.commons.x.e.a(r4)
            int r5 = r4.d()
            boolean r6 = a(r5)
            if (r6 == 0) goto Lcf
            java.util.Map r6 = r4.e()
            if (r6 == 0) goto L73
            java.util.Map r6 = r4.e()
            java.lang.String r7 = "Location"
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            goto L74
        L73:
            r6 = 0
        L74:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L94
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "redirect without location: "
            r9.append(r10)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            cn.jiguang.commons.w.a.f(r3, r9)
            java.lang.String r9 = "redirect failed: no location header"
        L90:
            r4.a(r9)
            return r4
        L94:
            java.lang.String r6 = a(r6, r9)
            if (r6 != 0) goto La2
            java.lang.String r9 = "parse redirect url failed"
            cn.jiguang.commons.w.a.f(r3, r9)
            java.lang.String r9 = "redirect failed: invalid location"
            goto L90
        La2:
            int r1 = r1 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r4
            r4 = 1
            r2[r4] = r9
            r9 = 2
            r2[r9] = r6
            java.lang.String r9 = "s r %d: %s -> %s"
            java.lang.String r9 = java.lang.String.format(r9, r2)
            cn.jiguang.commons.w.a.a(r3, r9)
            r9 = 303(0x12f, float:4.25E-43)
            if (r5 != r9) goto Lc3
            java.lang.String r9 = "GET"
        Lc1:
            r10 = r9
            goto Lcc
        Lc3:
            java.lang.String r9 = "HEAD"
            boolean r2 = r10.equals(r9)
            if (r2 == 0) goto Lcc
            goto Lc1
        Lcc:
            r9 = r6
            goto L2
        Lcf:
            return r4
        Ld0:
            java.lang.String r10 = "too many r: 3"
            cn.jiguang.commons.w.a.f(r3, r10)
            cn.jiguang.commons.x.d r10 = new cn.jiguang.commons.x.d
            r10.<init>(r9)
            r9 = -1
            r10.a(r9)
            java.lang.String r9 = "too many redirects, max 3 exceeded"
            r10.a(r9)
            return r10
    }

    public static java.lang.String c() {
            android.content.SharedPreferences r0 = e()
            java.lang.String r1 = cn.jiguang.commons.z.e.f1241d
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    public static void c(java.lang.String r2) {
            android.content.SharedPreferences r0 = e()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = cn.jiguang.commons.z.e.f1241d
            android.content.SharedPreferences$Editor r2 = r0.putString(r1, r2)
            r2.apply()
            return
    }

    public static void c(boolean r2) {
            android.content.SharedPreferences r0 = e()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = cn.jiguang.commons.z.e.f1244g
            android.content.SharedPreferences$Editor r2 = r0.putBoolean(r1, r2)
            r2.apply()
            return
    }

    public static java.lang.String d() {
            android.content.SharedPreferences r0 = e()
            java.lang.String r1 = cn.jiguang.commons.z.e.f1240c
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    public static void d(java.lang.String r2) {
            android.content.SharedPreferences r0 = e()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = cn.jiguang.commons.z.e.f1240c
            android.content.SharedPreferences$Editor r2 = r0.putString(r1, r2)
            r2.apply()
            return
    }

    public static void d(boolean r2) {
            android.content.SharedPreferences r0 = e()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = cn.jiguang.commons.z.e.f1243f
            android.content.SharedPreferences$Editor r2 = r0.putBoolean(r1, r2)
            r2.apply()
            return
    }

    private static android.content.SharedPreferences e() {
            java.util.concurrent.atomic.AtomicReference r0 = cn.jiguang.commons.z.e.f1245h
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L18
            java.util.concurrent.atomic.AtomicReference r0 = cn.jiguang.commons.z.e.f1245h
            android.content.Context r1 = cn.jiguang.commons.L.h.a()
            java.lang.String r2 = "cn.jiguang.prefs"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            r0.set(r1)
        L18:
            java.util.concurrent.atomic.AtomicReference r0 = cn.jiguang.commons.z.e.f1245h
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            return r0
    }

    public static void e(java.lang.String r2) {
            android.content.SharedPreferences r0 = e()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = cn.jiguang.commons.z.e.a
            android.content.SharedPreferences$Editor r2 = r0.putString(r1, r2)
            r2.apply()
            return
    }

    public static java.lang.String f() {
            java.lang.String r0 = c()     // Catch: java.lang.Throwable -> L15
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L15
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L15
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L15
            return r0
        L15:
            java.lang.String r0 = cn.jiguang.commons.z.e.f1246i
            return r0
    }

    public static java.lang.String g() {
            android.content.SharedPreferences r0 = e()
            java.lang.String r1 = cn.jiguang.commons.z.e.a
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    public static boolean h() {
            android.content.SharedPreferences r0 = e()
            java.lang.String r1 = cn.jiguang.commons.z.e.f1244g
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    public static boolean i() {
            android.content.SharedPreferences r0 = e()
            java.lang.String r1 = cn.jiguang.commons.z.e.f1243f
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    public static void j() {
            r0 = 1
            c(r0)
            return
    }
}
