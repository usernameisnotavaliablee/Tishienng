package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class e2 {
    public static final java.lang.String a = "/a/";

    /* renamed from: b, reason: collision with root package name */
    static final java.lang.String f4435b = "b";

    /* renamed from: c, reason: collision with root package name */
    static final java.lang.String f4436c = "c";

    /* renamed from: d, reason: collision with root package name */
    static final java.lang.String f4437d = "d";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f4438e = "s";

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f4439f = "g";

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f4440g = "h";

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f4441h = "e";

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f4442i = "f";

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f4443j = "j";

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f4444k = "k";
    private static long l;
    private static java.util.Vector<com.amap.api.col.s.i1> m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends com.amap.api.col.s.z3 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.content.Context f4445b;

        a(android.content.Context r1) {
                r0 = this;
                r0.f4445b = r1
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.s.z3
        public final void a() {
                r3 = this;
                android.content.Context r0 = r3.f4445b     // Catch: java.lang.Throwable -> L1a java.util.concurrent.RejectedExecutionException -> L22
                com.amap.api.col.s.h2.k(r0)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.RejectedExecutionException -> L22
                android.content.Context r0 = r3.f4445b     // Catch: java.lang.Throwable -> L1a java.util.concurrent.RejectedExecutionException -> L22
                com.amap.api.col.s.h2.m(r0)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.RejectedExecutionException -> L22
                android.content.Context r0 = r3.f4445b     // Catch: java.lang.Throwable -> L1a java.util.concurrent.RejectedExecutionException -> L22
                com.amap.api.col.s.h2.l(r0)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.RejectedExecutionException -> L22
                android.content.Context r0 = r3.f4445b     // Catch: java.lang.Throwable -> L1a java.util.concurrent.RejectedExecutionException -> L22
                com.amap.api.col.s.h3.b(r0)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.RejectedExecutionException -> L22
                android.content.Context r0 = r3.f4445b     // Catch: java.lang.Throwable -> L1a java.util.concurrent.RejectedExecutionException -> L22
                com.amap.api.col.s.f3.b(r0)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.RejectedExecutionException -> L22
                return
            L1a:
                r0 = move-exception
                java.lang.String r1 = "Lg"
                java.lang.String r2 = "proL"
                com.amap.api.col.s.g2.o(r0, r1, r2)
            L22:
                return
        }
    }

    static {
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            com.amap.api.col.s.e2.m = r0
            return
    }

    public e2() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "AMSKLG_CFG"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            java.lang.String r0 = ""
            java.lang.String r2 = r2.getString(r3, r0)
            return r2
    }

    static java.util.List<com.amap.api.col.s.i1> b() {
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> Lc
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Lc
            java.util.Vector<com.amap.api.col.s.i1> r1 = com.amap.api.col.s.e2.m     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1     // Catch: java.lang.Throwable -> Lc
        Lc:
            java.util.Vector<com.amap.api.col.s.i1> r0 = com.amap.api.col.s.e2.m
            return r0
    }

    public static void c(android.content.Context r5) {
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L22
            long r2 = com.amap.api.col.s.e2.l     // Catch: java.lang.Throwable -> L22
            long r0 = r0 - r2
            r2 = 60000(0xea60, double:2.9644E-319)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lf
            return
        Lf:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L22
            com.amap.api.col.s.e2.l = r0     // Catch: java.lang.Throwable -> L22
            com.amap.api.col.s.y3 r0 = com.amap.api.col.s.y3.e()     // Catch: java.lang.Throwable -> L22
            com.amap.api.col.s.e2$a r1 = new com.amap.api.col.s.e2$a     // Catch: java.lang.Throwable -> L22
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L22
            r0.c(r1)     // Catch: java.lang.Throwable -> L22
            return
        L22:
            r5 = move-exception
            java.lang.String r0 = "Lg"
            java.lang.String r1 = "proL"
            com.amap.api.col.s.g2.o(r5, r0, r1)
            return
    }

    @android.annotation.TargetApi(9)
    public static void d(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "AMSKLG_CFG"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r2.putString(r3, r4)
            r2.apply()
            return
    }

    public static void e(com.amap.api.col.s.i1 r2) {
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L1e
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r2 = move-exception
            goto L1c
        Lb:
            java.util.Vector<com.amap.api.col.s.i1> r1 = com.amap.api.col.s.e2.m     // Catch: java.lang.Throwable -> L9
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L15:
            java.util.Vector<com.amap.api.col.s.i1> r1 = com.amap.api.col.s.e2.m     // Catch: java.lang.Throwable -> L9
            r1.add(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r2     // Catch: java.lang.Throwable -> L1e
        L1e:
            return
    }

    static boolean f(java.lang.String[] r5, java.lang.String r6) {
            r0 = 0
            if (r5 == 0) goto L45
            if (r6 != 0) goto L6
            goto L45
        L6:
            java.lang.String r1 = "\n"
            java.lang.String[] r6 = r6.split(r1)     // Catch: java.lang.Throwable -> L45
            int r1 = r6.length     // Catch: java.lang.Throwable -> L45
            r2 = 0
        Le:
            if (r2 >= r1) goto L30
            r3 = r6[r2]     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L45
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto L2d
            java.lang.String r4 = "at "
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L2d
            java.lang.String r4 = "uncaughtException"
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L2d
            return r0
        L2d:
            int r2 = r2 + 1
            goto Le
        L30:
            int r1 = r6.length     // Catch: java.lang.Throwable -> L45
            r2 = 0
        L32:
            if (r2 >= r1) goto L45
            r3 = r6[r2]     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L45
            boolean r3 = h(r5, r3)     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L42
            r5 = 1
            return r5
        L42:
            int r2 = r2 + 1
            goto L32
        L45:
            return r0
    }

    public static void g(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "AMSKLG_CFG"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r2.remove(r3)
            r2.apply()
            return
    }

    static boolean h(java.lang.String[] r5, java.lang.String r6) {
            r0 = 0
            if (r5 == 0) goto L44
            if (r6 != 0) goto L6
            goto L44
        L6:
            int r1 = r5.length     // Catch: java.lang.Throwable -> L44
            r2 = 0
        L8:
            if (r2 >= r1) goto L44
            r3 = r5[r2]     // Catch: java.lang.Throwable -> L44
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = "at "
            boolean r4 = r6.startsWith(r4)     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r4.<init>()     // Catch: java.lang.Throwable -> L44
            r4.append(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = "."
            r4.append(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L44
            boolean r3 = r6.contains(r3)     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L41
            java.lang.String r3 = ")"
            boolean r3 = r6.endsWith(r3)     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L41
            java.lang.String r3 = "uncaughtException"
            boolean r3 = r6.contains(r3)     // Catch: java.lang.Throwable -> L44
            if (r3 != 0) goto L41
            r5 = 1
            return r5
        L41:
            int r2 = r2 + 1
            goto L8
        L44:
            return r0
    }

    public static java.lang.String i(android.content.Context r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r1 = com.amap.api.col.s.e2.a
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }
}
