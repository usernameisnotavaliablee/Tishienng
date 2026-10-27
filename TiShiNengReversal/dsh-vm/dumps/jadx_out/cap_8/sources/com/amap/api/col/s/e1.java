package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class e1 {
    private volatile com.amap.api.col.s.e1.b a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.col.s.j2 f4431b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        static com.amap.api.col.s.e1 a;

        static {
                com.amap.api.col.s.e1 r0 = new com.amap.api.col.s.e1
                r0.<init>()
                com.amap.api.col.s.e1.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        protected boolean f4432b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f4433c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f4434d;

        private b() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.a = r0
                r1 = 1
                r2.f4432b = r1
                r2.f4433c = r1
                r2.f4434d = r0
                return
        }

        /* synthetic */ b(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final void a(android.content.Context r2) {
                r1 = this;
                if (r2 != 0) goto L3
                goto L17
            L3:
                int r0 = r1.a
                if (r0 > 0) goto L17
                android.content.Context r2 = r2.getApplicationContext()
                android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
                android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
                int r2 = r2.targetSdkVersion
                r1.a = r2
            L17:
                return
        }

        public final void b(boolean r1) {
                r0 = this;
                r0.f4432b = r1
                return
        }

        public final boolean c() {
                r5 = this;
                boolean r0 = r5.f4434d
                r1 = 1
                if (r0 != 0) goto L2f
                int r0 = android.os.Build.VERSION.SDK_INT
                r2 = 28
                r3 = 0
                if (r0 < r2) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                boolean r4 = r5.f4432b
                if (r4 == 0) goto L23
                int r4 = r5.a
                if (r4 > 0) goto L19
                r4 = 28
            L19:
                if (r4 < r2) goto L1d
                r2 = 1
                goto L1e
            L1d:
                r2 = 0
            L1e:
                if (r2 == 0) goto L21
                goto L23
            L21:
                r2 = 0
                goto L24
            L23:
                r2 = 1
            L24:
                if (r0 == 0) goto L2a
                if (r2 == 0) goto L2a
                r0 = 1
                goto L2b
            L2a:
                r0 = 0
            L2b:
                if (r0 == 0) goto L2e
                goto L2f
            L2e:
                return r3
            L2f:
                return r1
        }

        public final void d(boolean r1) {
                r0 = this;
                r0.f4434d = r1
                return
        }
    }

    public e1() {
            r2 = this;
            r2.<init>()
            com.amap.api.col.s.e1$b r0 = new com.amap.api.col.s.e1$b
            r1 = 0
            r0.<init>(r1)
            r2.a = r0
            com.amap.api.col.s.j2 r0 = new com.amap.api.col.s.j2
            java.lang.String r1 = "HttpsDecisionUtil"
            r0.<init>(r1)
            r2.f4431b = r0
            return
    }

    public static com.amap.api.col.s.e1 a() {
            com.amap.api.col.s.e1 r0 = com.amap.api.col.s.e1.a.a
            return r0
    }

    public static java.lang.String b(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L22
            java.lang.String r0 = "https"
            boolean r1 = r2.startsWith(r0)
            if (r1 == 0) goto Lf
            goto L22
        Lf:
            android.net.Uri r1 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L22
            android.net.Uri$Builder r1 = r1.buildUpon()     // Catch: java.lang.Throwable -> L22
            r1.scheme(r0)     // Catch: java.lang.Throwable -> L22
            android.net.Uri r0 = r1.build()     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L22
        L22:
            return r2
    }

    public static void f(android.content.Context r1) {
            r0 = 1
            g(r1, r0)
            return
    }

    private static void g(android.content.Context r1, boolean r2) {
            java.lang.String r0 = "open_common"
            android.content.SharedPreferences$Editor r1 = com.amap.api.col.s.j2.c(r1, r0)
            java.lang.String r0 = "a3"
            com.amap.api.col.s.j2.k(r1, r0, r2)
            com.amap.api.col.s.j2.f(r1)
            return
    }

    private static boolean j() {
            r0 = 0
            return r0
    }

    public final void c(android.content.Context r5) {
            r4 = this;
            com.amap.api.col.s.e1$b r0 = r4.a
            if (r0 != 0) goto Lc
            com.amap.api.col.s.e1$b r0 = new com.amap.api.col.s.e1$b
            r1 = 0
            r0.<init>(r1)
            r4.a = r0
        Lc:
            com.amap.api.col.s.e1$b r0 = r4.a
            java.lang.String r1 = "a3"
            r2 = 1
            java.lang.String r3 = "open_common"
            boolean r1 = com.amap.api.col.s.j2.l(r5, r3, r1, r2)
            r0.b(r1)
            com.amap.api.col.s.e1$b r0 = r4.a
            r0.a(r5)
            com.amap.api.col.s.t1 r5 = com.amap.api.col.s.t1.a(r5)
            r5.b()
            return
    }

    final void d(android.content.Context r3, boolean r4) {
            r2 = this;
            com.amap.api.col.s.e1$b r0 = r2.a
            if (r0 != 0) goto Lc
            com.amap.api.col.s.e1$b r0 = new com.amap.api.col.s.e1$b
            r1 = 0
            r0.<init>(r1)
            r2.a = r0
        Lc:
            g(r3, r4)
            com.amap.api.col.s.e1$b r3 = r2.a
            r3.b(r4)
            return
    }

    public final void e(boolean r3) {
            r2 = this;
            com.amap.api.col.s.e1$b r0 = r2.a
            if (r0 != 0) goto Lc
            com.amap.api.col.s.e1$b r0 = new com.amap.api.col.s.e1$b
            r1 = 0
            r0.<init>(r1)
            r2.a = r0
        Lc:
            com.amap.api.col.s.e1$b r0 = r2.a
            r0.d(r3)
            return
    }

    public final boolean h() {
            r2 = this;
            com.amap.api.col.s.e1$b r0 = r2.a
            if (r0 != 0) goto Lc
            com.amap.api.col.s.e1$b r0 = new com.amap.api.col.s.e1$b
            r1 = 0
            r0.<init>(r1)
            r2.a = r0
        Lc:
            com.amap.api.col.s.e1$b r0 = r2.a
            boolean r0 = r0.c()
            return r0
    }

    public final boolean i(boolean r3) {
            r2 = this;
            boolean r0 = j()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            if (r3 != 0) goto L12
            boolean r3 = r2.h()
            if (r3 == 0) goto L11
            goto L12
        L11:
            return r1
        L12:
            r3 = 1
            return r3
    }
}
