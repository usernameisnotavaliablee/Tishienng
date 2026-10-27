package com.beizi.ad.internal.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends com.beizi.ad.internal.f.a implements com.beizi.ad.internal.a {

    /* renamed from: b, reason: collision with root package name */
    public static com.beizi.ad.internal.c.a f6655b;
    public com.beizi.ad.internal.f.c a;

    /* renamed from: d, reason: collision with root package name */
    private com.beizi.ad.a f6656d;

    /* renamed from: e, reason: collision with root package name */
    private com.beizi.ad.internal.c.a.C0100a f6657e;

    /* renamed from: f, reason: collision with root package name */
    private com.beizi.ad.internal.e f6658f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f6659g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f6660h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6661i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6662j;

    /* renamed from: k, reason: collision with root package name */
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean f6663k;
    private boolean l;
    private android.content.Context m;
    private java.lang.String n;
    private com.beizi.ad.internal.k o;
    private android.os.CountDownTimer p;
    private int q;
    private com.beizi.ad.internal.a.b r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.internal.c.a$a, reason: collision with other inner class name */
    private class C0100a implements com.beizi.ad.internal.c {
        final /* synthetic */ com.beizi.ad.internal.c.a a;

        public C0100a() {
                r1 = this;
                r1.<init>()
                return
        }

        @Override // com.beizi.ad.internal.c
        public void a() {
                r2 = this;
                com.beizi.ad.internal.c.a r0 = r2.a
                boolean r0 = com.beizi.ad.internal.c.a.b(r0)
                if (r0 == 0) goto L1b
                com.beizi.ad.internal.c.a r0 = r2.a
                r1 = 1
                com.beizi.ad.internal.c.a.a(r0, r1)
                com.beizi.ad.internal.a.a r0 = com.beizi.ad.internal.a.a.a()
                com.beizi.ad.internal.c.a r1 = r2.a
                com.beizi.ad.internal.a.b r1 = com.beizi.ad.internal.c.a.d(r1)
                r0.a(r1)
            L1b:
                com.beizi.ad.internal.c.a r0 = r2.a
                com.beizi.ad.a r0 = com.beizi.ad.internal.c.a.e(r0)
                if (r0 == 0) goto L2c
                com.beizi.ad.internal.c.a r0 = r2.a
                com.beizi.ad.a r0 = com.beizi.ad.internal.c.a.e(r0)
                r0.b()
            L2c:
                return
        }

        @Override // com.beizi.ad.internal.c
        public void a(int r3) {
                r2 = this;
                com.beizi.ad.internal.c.a r0 = r2.a
                r1 = 0
                com.beizi.ad.internal.c.a.b(r0, r1)
                com.beizi.ad.internal.c.a r0 = r2.a
                boolean r0 = com.beizi.ad.internal.c.a.b(r0)
                if (r0 == 0) goto Lf
                goto L2e
            Lf:
                com.beizi.ad.internal.c.a r0 = r2.a
                com.beizi.ad.internal.c.a.a(r0)
                com.beizi.ad.internal.c.a r0 = r2.a
                boolean r0 = com.beizi.ad.internal.c.a.c(r0)
                if (r0 == 0) goto L1d
                goto L2e
            L1d:
                com.beizi.ad.internal.c.a r0 = r2.a
                com.beizi.ad.a r0 = com.beizi.ad.internal.c.a.e(r0)
                if (r0 == 0) goto L2e
                com.beizi.ad.internal.c.a r0 = r2.a
                com.beizi.ad.a r0 = com.beizi.ad.internal.c.a.e(r0)
                r0.a(r3)
            L2e:
                return
        }

        @Override // com.beizi.ad.internal.c
        public void a(long r1) {
                r0 = this;
                return
        }

        @Override // com.beizi.ad.internal.c
        public void a(com.beizi.ad.internal.f.b r4) {
                r3 = this;
                com.beizi.ad.internal.c.a r0 = r3.a     // Catch: java.lang.Exception -> L3d
                com.beizi.ad.internal.c.a.a(r0)     // Catch: java.lang.Exception -> L3d
                com.beizi.ad.internal.c.a r0 = r3.a     // Catch: java.lang.Exception -> L3d
                boolean r0 = com.beizi.ad.internal.c.a.b(r0)     // Catch: java.lang.Exception -> L3d
                if (r0 == 0) goto L1b
                com.beizi.ad.internal.c.a r0 = r3.a     // Catch: java.lang.Exception -> L3d
                com.beizi.ad.internal.f.c r1 = r4.j()     // Catch: java.lang.Exception -> L3d
                java.lang.String r4 = r4.k()     // Catch: java.lang.Exception -> L3d
                r0.a(r1, r4)     // Catch: java.lang.Exception -> L3d
                return
            L1b:
                com.beizi.ad.internal.f.c r0 = r4.j()     // Catch: java.lang.Exception -> L3d
                if (r0 != 0) goto L2f
                com.beizi.ad.internal.c.a r4 = r3.a     // Catch: java.lang.Exception -> L3d
                boolean r4 = com.beizi.ad.internal.c.a.c(r4)     // Catch: java.lang.Exception -> L3d
                if (r4 == 0) goto L2a
                goto L3d
            L2a:
                r4 = 0
                r3.a(r4)     // Catch: java.lang.Exception -> L3d
                return
            L2f:
                com.beizi.ad.internal.c.a r0 = r3.a     // Catch: java.lang.Exception -> L3d
                java.lang.String r1 = r4.k()     // Catch: java.lang.Exception -> L3d
                com.beizi.ad.internal.f.c r4 = r4.j()     // Catch: java.lang.Exception -> L3d
                r2 = 1
                com.beizi.ad.internal.c.a.a(r0, r2, r1, r4)     // Catch: java.lang.Exception -> L3d
            L3d:
                return
        }

        @Override // com.beizi.ad.internal.c
        public void a(java.lang.String r2) {
                r1 = this;
                com.beizi.ad.internal.c.a r0 = r1.a
                com.beizi.ad.a r0 = com.beizi.ad.internal.c.a.e(r0)
                if (r0 == 0) goto L11
                com.beizi.ad.internal.c.a r0 = r1.a
                com.beizi.ad.a r0 = com.beizi.ad.internal.c.a.e(r0)
                r0.a(r2)
            L11:
                return
        }

        @Override // com.beizi.ad.internal.c
        public void a(java.lang.String r1, int r2) {
                r0 = this;
                return
        }

        @Override // com.beizi.ad.internal.c
        public void a(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                return
        }

        @Override // com.beizi.ad.internal.c
        public void b() {
                r1 = this;
                com.beizi.ad.internal.c.a r0 = r1.a
                com.beizi.ad.a r0 = com.beizi.ad.internal.c.a.e(r0)
                if (r0 == 0) goto L11
                com.beizi.ad.internal.c.a r0 = r1.a
                com.beizi.ad.a r0 = com.beizi.ad.internal.c.a.e(r0)
                r0.c()
            L11:
                return
        }

        @Override // com.beizi.ad.internal.c
        public void c() {
                r0 = this;
                return
        }

        @Override // com.beizi.ad.internal.c
        public void d() {
                r1 = this;
                com.beizi.ad.internal.c.a r0 = r1.a
                com.beizi.ad.a r0 = com.beizi.ad.internal.c.a.e(r0)
                if (r0 == 0) goto L11
                com.beizi.ad.internal.c.a r0 = r1.a
                com.beizi.ad.a r0 = com.beizi.ad.internal.c.a.e(r0)
                r0.e()
            L11:
                return
        }

        @Override // com.beizi.ad.internal.c
        public void e() {
                r0 = this;
                return
        }

        @Override // com.beizi.ad.internal.c
        public void f() {
                r0 = this;
                return
        }
    }

    static /* synthetic */ void a(com.beizi.ad.internal.c.a r0) {
            r0.h()
            return
    }

    static /* synthetic */ void a(com.beizi.ad.internal.c.a r0, boolean r1, java.lang.String r2, com.beizi.ad.internal.f.c r3) {
            r0.a(r1, r2, r3)
            return
    }

    private synchronized void a(boolean r3, java.lang.String r4, com.beizi.ad.internal.f.c r5) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.v     // Catch: java.lang.Throwable -> Lc
            r1 = 1
            if (r0 == 0) goto L1f
            if (r3 == 0) goto Le
            r2.a(r5, r4)     // Catch: java.lang.Throwable -> Lc
            goto L1d
        Lc:
            r3 = move-exception
            goto L62
        Le:
            boolean r3 = r2.s     // Catch: java.lang.Throwable -> Lc
            if (r3 == 0) goto L1d
            com.beizi.ad.internal.a.a r3 = com.beizi.ad.internal.a.a.a()     // Catch: java.lang.Throwable -> Lc
            com.beizi.ad.internal.a.b r4 = r2.r     // Catch: java.lang.Throwable -> Lc
            int r5 = r2.q     // Catch: java.lang.Throwable -> Lc
            r3.a(r4, r1, r5)     // Catch: java.lang.Throwable -> Lc
        L1d:
            monitor-exit(r2)
            return
        L1f:
            r2.v = r1     // Catch: java.lang.Throwable -> Lc
            r2.a = r5     // Catch: java.lang.Throwable -> Lc
            if (r3 == 0) goto L2f
            java.lang.String r3 = "BeiZisAd"
            java.lang.String r4 = "handleLocalCacheOrServerResponse use server:"
            com.beizi.ad.lance.a.m.c(r3, r4)     // Catch: java.lang.Throwable -> Lc
            r2.s = r1     // Catch: java.lang.Throwable -> Lc
            goto L5d
        L2f:
            r2.t = r1     // Catch: java.lang.Throwable -> Lc
            com.beizi.ad.internal.e r3 = r2.f6658f     // Catch: java.lang.Throwable -> Lc
            com.beizi.ad.internal.a.b r4 = r2.r     // Catch: java.lang.Throwable -> Lc
            java.lang.String r4 = r4.d()     // Catch: java.lang.Throwable -> Lc
            r3.a(r4)     // Catch: java.lang.Throwable -> Lc
            com.beizi.ad.internal.f.c r3 = r2.a     // Catch: java.lang.Throwable -> Lc
            r3.c(r1)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r3 = "BeiZisAd"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc
            r4.<init>()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r0 = "handleLocalCacheOrServerResponse use cache mRequestId:"
            r4.append(r0)     // Catch: java.lang.Throwable -> Lc
            com.beizi.ad.internal.e r0 = r2.f6658f     // Catch: java.lang.Throwable -> Lc
            java.lang.String r0 = r0.a()     // Catch: java.lang.Throwable -> Lc
            r4.append(r0)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lc
            com.beizi.ad.lance.a.m.c(r3, r4)     // Catch: java.lang.Throwable -> Lc
        L5d:
            r2.c(r5)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L62:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    static /* synthetic */ boolean a(com.beizi.ad.internal.c.a r0, boolean r1) {
            r0.u = r1
            return r1
    }

    static /* synthetic */ boolean b(com.beizi.ad.internal.c.a r0) {
            boolean r0 = r0.t
            return r0
    }

    static /* synthetic */ boolean b(com.beizi.ad.internal.c.a r0, boolean r1) {
            r0.f6662j = r1
            return r1
    }

    private void c(com.beizi.ad.internal.f.c r2) {
            r1 = this;
            java.lang.String r0 = r2.e()
            r1.a(r0)
            java.lang.String r0 = r2.f()
            r1.b(r0)
            boolean r2 = r2.P()
            r1.a(r2)
            r1.f()
            return
    }

    static /* synthetic */ boolean c(com.beizi.ad.internal.c.a r0) {
            boolean r0 = r0.g()
            return r0
    }

    static /* synthetic */ boolean c(com.beizi.ad.internal.c.a r0, boolean r1) {
            r0.l = r1
            return r1
    }

    static /* synthetic */ com.beizi.ad.internal.a.b d(com.beizi.ad.internal.c.a r0) {
            com.beizi.ad.internal.a.b r0 = r0.r
            return r0
    }

    static /* synthetic */ com.beizi.ad.a e(com.beizi.ad.internal.c.a r0) {
            com.beizi.ad.a r0 = r0.f6656d
            return r0
    }

    private void f() {
            r4 = this;
            com.beizi.ad.internal.f.c r0 = r4.a     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L15
            boolean r0 = r0.N()     // Catch: java.lang.Exception -> L50
            com.beizi.ad.internal.f.c r1 = r4.a     // Catch: java.lang.Exception -> L50
            java.lang.String r1 = r1.L()     // Catch: java.lang.Exception -> L50
            com.beizi.ad.internal.f.c r2 = r4.a     // Catch: java.lang.Exception -> L50
            java.lang.String r2 = r2.M()     // Catch: java.lang.Exception -> L50
            goto L18
        L15:
            r1 = 0
            r0 = 0
            r2 = r1
        L18:
            r3 = 3
            if (r0 != 0) goto L34
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L29
            com.beizi.ad.a r0 = r4.f6656d     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L50
            r0.a(r3)     // Catch: java.lang.Exception -> L50
            return
        L29:
            com.beizi.ad.a r0 = r4.f6656d     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L50
            r1 = 1
            r4.l = r1     // Catch: java.lang.Exception -> L50
            r0.a()     // Catch: java.lang.Exception -> L50
            return
        L34:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L42
            com.beizi.ad.a r0 = r4.f6656d     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L50
            r0.a(r3)     // Catch: java.lang.Exception -> L50
            return
        L42:
            com.beizi.ad.internal.h.t r0 = com.beizi.ad.internal.h.t.a()     // Catch: java.lang.Exception -> L50
            android.content.Context r1 = r4.m     // Catch: java.lang.Exception -> L50
            com.beizi.ad.internal.c.a$1 r3 = new com.beizi.ad.internal.c.a$1     // Catch: java.lang.Exception -> L50
            r3.<init>(r4)     // Catch: java.lang.Exception -> L50
            r0.a(r1, r2, r3)     // Catch: java.lang.Exception -> L50
        L50:
            return
    }

    private boolean g() {
            r5 = this;
            int r0 = r5.q
            r1 = 0
            if (r0 > 0) goto L6
            return r1
        L6:
            boolean r0 = r5.s
            if (r0 == 0) goto Lb
            return r1
        Lb:
            com.beizi.ad.internal.a.a r0 = com.beizi.ad.internal.a.a.a()
            java.lang.String r2 = r5.b()
            com.beizi.ad.internal.a.b r0 = r0.b(r2)
            r5.r = r0
            if (r0 != 0) goto L1c
            return r1
        L1c:
            com.beizi.ad.internal.a.a r0 = com.beizi.ad.internal.a.a.a()
            com.beizi.ad.internal.a.b r2 = r5.r
            com.beizi.ad.internal.k r3 = r5.o
            com.beizi.ad.internal.f.c r0 = r0.a(r2, r3)
            if (r0 != 0) goto L2b
            return r1
        L2b:
            boolean r2 = r5.s
            r3 = 1
            if (r2 == 0) goto L3c
            com.beizi.ad.internal.a.a r0 = com.beizi.ad.internal.a.a.a()
            com.beizi.ad.internal.a.b r2 = r5.r
            int r4 = r5.q
            r0.a(r2, r3, r4)
            return r1
        L3c:
            r2 = 0
            r5.a(r1, r2, r0)
            return r3
    }

    private void h() {
            r1 = this;
            android.os.CountDownTimer r0 = r1.p
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            r1.p = r0
        La:
            return
    }

    public com.beizi.fusion.model.AdSpacesBean.BuyerBean a() {
            r1 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r1.f6663k
            return r0
    }

    public void a(com.beizi.ad.internal.f.c r8, java.lang.String r9) {
            r7 = this;
            if (r8 == 0) goto L20
            boolean r0 = r8.h()
            if (r0 == 0) goto L20
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto Lf
            goto L20
        Lf:
            com.beizi.ad.internal.a.a r1 = com.beizi.ad.internal.a.a.a()
            java.lang.String r4 = r7.n
            java.lang.String r5 = r7.b()
            com.beizi.ad.internal.k r6 = r7.o
            r2 = r8
            r3 = r9
            r1.a(r2, r3, r4, r5, r6)
        L20:
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.f6659g = r1
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.f6661i = r1
            return
    }

    public java.lang.String b() {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f6658f
            java.lang.String r0 = r0.c()
            return r0
    }

    public void b(java.lang.String r1) {
            r0 = this;
            r0.f6660h = r1
            return
    }

    public com.beizi.ad.internal.e c() {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f6658f
            return r0
    }

    public com.beizi.ad.internal.c d() {
            r1 = this;
            com.beizi.ad.internal.c.a$a r0 = r1.f6657e
            return r0
    }

    public boolean e() {
            r1 = this;
            boolean r0 = r1.f6661i
            return r0
    }

    @Override // com.beizi.ad.internal.a
    public com.beizi.ad.internal.k getMediaType() {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f6658f
            com.beizi.ad.internal.k r0 = r0.i()
            return r0
    }

    @Override // com.beizi.ad.internal.a
    public boolean isReadyToStart() {
            r1 = this;
            com.beizi.ad.a r0 = r1.f6656d
            if (r0 == 0) goto Le
            com.beizi.ad.internal.e r0 = r1.f6658f
            boolean r0 = r0.j()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }
}
