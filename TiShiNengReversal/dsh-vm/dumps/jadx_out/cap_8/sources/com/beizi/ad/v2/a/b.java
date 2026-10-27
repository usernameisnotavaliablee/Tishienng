package com.beizi.ad.v2.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    protected boolean A;
    protected boolean B;
    protected boolean C;
    protected boolean D;
    protected boolean E;
    protected android.os.Handler F;
    private java.lang.String G;
    private java.lang.String H;
    private java.util.Map<java.lang.String, java.lang.Object> I;
    private boolean J;
    protected android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    protected com.beizi.ad.internal.e f7479b;

    /* renamed from: c, reason: collision with root package name */
    protected com.beizi.ad.internal.f.c f7480c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f7481d;

    /* renamed from: e, reason: collision with root package name */
    protected java.lang.String f7482e;

    /* renamed from: f, reason: collision with root package name */
    protected java.lang.String f7483f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f7484g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f7485h;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f7486i;

    /* renamed from: j, reason: collision with root package name */
    protected boolean f7487j;

    /* renamed from: k, reason: collision with root package name */
    protected java.lang.String f7488k;
    protected java.lang.String l;
    protected com.beizi.ad.internal.k m;
    protected int n;
    protected int o;
    protected int p;
    protected int q;
    protected com.beizi.ad.internal.a.b r;
    protected boolean s;
    protected boolean t;
    protected boolean u;
    protected boolean v;
    protected com.beizi.fusion.events.EventBean w;
    protected boolean x;
    protected java.lang.String y;
    protected com.beizi.fusion.model.AdSpacesBean.BuyerBean z;




    public b(android.content.Context r3, com.beizi.ad.internal.k r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f7479b = r0
            r0 = 0
            r2.f7484g = r0
            r2.f7485h = r0
            r2.f7486i = r0
            r2.f7487j = r0
            r2.J = r0
            com.beizi.ad.v2.a.b$1 r0 = new com.beizi.ad.v2.a.b$1
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r2, r1)
            r2.F = r0
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            r2.a = r0
            java.lang.String r0 = com.beizi.ad.internal.h.o.a()
            r2.l = r0
            r2.f7488k = r0
            r2.m = r4
            com.beizi.ad.internal.e r0 = new com.beizi.ad.internal.e
            java.lang.String r1 = r2.l
            r0.<init>(r3, r1)
            r2.f7479b = r0
            r0.a(r4)
            return
    }

    public b(android.content.Context r3, java.lang.String r4, com.beizi.ad.internal.k r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f7479b = r0
            r0 = 0
            r2.f7484g = r0
            r2.f7485h = r0
            r2.f7486i = r0
            r2.f7487j = r0
            r2.J = r0
            com.beizi.ad.v2.a.b$1 r0 = new com.beizi.ad.v2.a.b$1
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r2, r1)
            r2.F = r0
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            r2.a = r0
            java.lang.String r0 = com.beizi.ad.internal.h.o.a()
            r2.l = r0
            r2.f7488k = r0
            r2.y = r4
            r2.m = r5
            com.beizi.ad.internal.e r0 = new com.beizi.ad.internal.e
            java.lang.String r1 = r2.l
            r0.<init>(r3, r1)
            r2.f7479b = r0
            r0.b(r4)
            com.beizi.ad.internal.e r3 = r2.f7479b
            r3.a(r5)
            return
    }

    static /* synthetic */ com.beizi.ad.model.b a(com.beizi.ad.v2.a.b r0) {
            com.beizi.ad.model.b r0 = r0.x()
            return r0
    }

    static /* synthetic */ void a(com.beizi.ad.v2.a.b r0, boolean r1, java.lang.String r2, com.beizi.ad.internal.a.b r3, com.beizi.ad.internal.f.c r4) {
            r0.a(r1, r2, r3, r4)
            return
    }

    private synchronized void a(boolean r3, java.lang.String r4, com.beizi.ad.internal.a.b r5, com.beizi.ad.internal.f.c r6) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A     // Catch: java.lang.Throwable -> Lc
            r1 = 1
            if (r0 == 0) goto L1d
            if (r3 == 0) goto Le
            r2.a(r6, r4)     // Catch: java.lang.Throwable -> Lc
            goto L1b
        Lc:
            r3 = move-exception
            goto L48
        Le:
            boolean r3 = r2.s     // Catch: java.lang.Throwable -> Lc
            if (r3 == 0) goto L1b
            com.beizi.ad.internal.a.a r3 = com.beizi.ad.internal.a.a.a()     // Catch: java.lang.Throwable -> Lc
            int r4 = r2.q     // Catch: java.lang.Throwable -> Lc
            r3.a(r5, r1, r4)     // Catch: java.lang.Throwable -> Lc
        L1b:
            monitor-exit(r2)
            return
        L1d:
            r2.A = r1     // Catch: java.lang.Throwable -> Lc
            r2.f7480c = r6     // Catch: java.lang.Throwable -> Lc
            if (r3 == 0) goto L26
            r2.s = r1     // Catch: java.lang.Throwable -> Lc
            goto L40
        L26:
            r2.t = r1     // Catch: java.lang.Throwable -> Lc
            if (r5 == 0) goto L37
            java.lang.String r3 = r5.d()     // Catch: java.lang.Throwable -> Lc
            r2.l = r3     // Catch: java.lang.Throwable -> Lc
            com.beizi.ad.internal.e r4 = r2.f7479b     // Catch: java.lang.Throwable -> Lc
            if (r4 == 0) goto L37
            r4.a(r3)     // Catch: java.lang.Throwable -> Lc
        L37:
            r2.r = r5     // Catch: java.lang.Throwable -> Lc
            com.beizi.ad.internal.f.c r3 = r2.f7480c     // Catch: java.lang.Throwable -> Lc
            if (r3 == 0) goto L40
            r3.c(r1)     // Catch: java.lang.Throwable -> Lc
        L40:
            r2.y()     // Catch: java.lang.Throwable -> Lc
            r2.a(r6)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L48:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    private boolean a(com.beizi.ad.internal.f.c r4, com.beizi.ad.internal.a.b r5) {
            r3 = this;
            java.lang.String r0 = "orderList"
            r1 = 1
            java.util.Map<java.lang.String, java.lang.Object> r2 = r3.I     // Catch: java.lang.Exception -> L41
            if (r2 != 0) goto L8
            return r1
        L8:
            boolean r2 = r2.containsKey(r0)     // Catch: java.lang.Exception -> L41
            if (r2 != 0) goto Lf
            return r1
        Lf:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r3.I     // Catch: java.lang.Exception -> L41
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Exception -> L41
            if (r0 != 0) goto L18
            return r1
        L18:
            boolean r2 = r0 instanceof java.util.List     // Catch: java.lang.Exception -> L41
            if (r2 != 0) goto L1d
            return r1
        L1d:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L41
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto L26
            return r1
        L26:
            java.lang.String r4 = r4.ag()     // Catch: java.lang.Exception -> L41
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto L31
            return r1
        L31:
            boolean r4 = r0.contains(r4)     // Catch: java.lang.Exception -> L41
            if (r4 == 0) goto L38
            return r1
        L38:
            com.beizi.ad.internal.a.a r4 = com.beizi.ad.internal.a.a.a()     // Catch: java.lang.Exception -> L41
            r4.a(r5)     // Catch: java.lang.Exception -> L41
            r4 = 0
            return r4
        L41:
            return r1
    }

    private void u() {
            r5 = this;
            int r0 = r5.q
            if (r0 > 0) goto L5
            goto L1a
        L5:
            r5.v()
            int r0 = r5.p
            if (r0 > 0) goto L10
            r5.n()
            return
        L10:
            android.os.Handler r1 = r5.F
            if (r1 == 0) goto L1a
            r2 = 16
            long r3 = (long) r0
            r1.sendEmptyMessageDelayed(r2, r3)
        L1a:
            return
    }

    private void v() {
            r5 = this;
            com.beizi.ad.model.b r0 = new com.beizi.ad.model.b
            r0.<init>()
            java.lang.String r1 = r5.y
            r0.a(r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r5.I
            if (r1 == 0) goto L2d
            java.lang.String r2 = "orderList"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L2d
            java.util.Map<java.lang.String, java.lang.Object> r1 = r5.I
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L2d
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L2d
            java.util.List r1 = (java.util.List) r1
            int r2 = r1.size()
            if (r2 <= 0) goto L2d
            r0.a(r1)
        L2d:
            com.beizi.ad.internal.a.a r1 = com.beizi.ad.internal.a.a.a()
            com.beizi.fusion.events.EventBean r2 = r5.w
            int r3 = r5.q
            com.beizi.ad.internal.k r4 = r5.m
            r1.a(r2, r3, r0, r4)
            return
    }

    private void w() {
            r4 = this;
            boolean r0 = r4.v
            if (r0 == 0) goto L5
            goto L1b
        L5:
            boolean r0 = r4.t
            if (r0 == 0) goto L1b
            boolean r0 = r4.u
            if (r0 != 0) goto L1b
            r0 = 1
            r4.v = r0
            com.beizi.ad.internal.a.a r1 = com.beizi.ad.internal.a.a.a()
            com.beizi.ad.internal.a.b r2 = r4.r
            int r3 = r4.q
            r1.a(r2, r0, r3)
        L1b:
            return
    }

    private com.beizi.ad.model.b x() {
            r3 = this;
            com.beizi.ad.model.b r0 = new com.beizi.ad.model.b
            r0.<init>()
            java.lang.String r1 = r3.y
            r0.a(r1)
            java.lang.String r1 = r3.l
            r0.b(r1)
            r1 = 0
            r0.a(r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.I
            if (r1 == 0) goto L36
            java.lang.String r2 = "orderList"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L36
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.I
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L36
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L36
            java.util.List r1 = (java.util.List) r1
            int r2 = r1.size()
            if (r2 <= 0) goto L36
            r0.a(r1)
        L36:
            return r0
    }

    private void y() {
            r2 = this;
            com.beizi.ad.lance.a.c r0 = com.beizi.ad.lance.a.c.b()
            java.util.concurrent.ExecutorService r0 = r0.d()
            com.beizi.ad.v2.a.b$3 r1 = new com.beizi.ad.v2.a.b$3
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    public com.beizi.fusion.model.AdSpacesBean.BuyerBean a() {
            r1 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r1.z
            return r0
    }

    public void a(int r1) {
            r0 = this;
            r0.o = r1
            return
    }

    public void a(com.beizi.ad.internal.f.c r1) {
            r0 = this;
            return
    }

    public void a(com.beizi.ad.internal.f.c r8, java.lang.String r9) {
            r7 = this;
            if (r8 == 0) goto L1e
            boolean r0 = r8.h()
            if (r0 == 0) goto L1e
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto Lf
            goto L1e
        Lf:
            com.beizi.ad.internal.a.a r1 = com.beizi.ad.internal.a.a.a()
            java.lang.String r4 = r7.f7488k
            java.lang.String r5 = r7.y
            com.beizi.ad.internal.k r6 = r7.m
            r2 = r8
            r3 = r9
            r1.a(r2, r3, r4, r5, r6)
        L1e:
            return
    }

    public void a(com.beizi.fusion.events.EventBean r1) {
            r0 = this;
            r0.w = r1
            return
    }

    public void a(com.beizi.fusion.model.AdSpacesBean.BuyerBean r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            r4.z = r5
            int r0 = r5.getCacheNum()
            r4.q = r0
            if (r0 <= 0) goto L32
            int r0 = r5.getWaitTime()
            int r1 = r5.getLastTime()
            r2 = 100
            if (r1 > 0) goto L1b
            r1 = 100
        L1b:
            if (r0 < 0) goto L27
            int r3 = r4.o
            int r3 = r3 - r1
            int r0 = java.lang.Math.min(r0, r3)
            r4.p = r0
            goto L2c
        L27:
            int r0 = r4.o
            int r0 = r0 - r1
            r4.p = r0
        L2c:
            int r0 = r4.p
            if (r0 > 0) goto L32
            r4.p = r2
        L32:
            int r0 = r5.getIsImageSpeed()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L3c
            r0 = 1
            goto L3d
        L3c:
            r0 = 0
        L3d:
            r4.B = r0
            int r0 = r5.getIsHideInteraction()
            if (r0 != r2) goto L47
            r0 = 1
            goto L48
        L47:
            r0 = 0
        L48:
            r4.C = r0
            int r0 = r5.getIsPlaceHolder()
            if (r0 != r2) goto L52
            r0 = 1
            goto L53
        L52:
            r0 = 0
        L53:
            r4.D = r0
            int r5 = r5.getIsAnimation()
            if (r5 != r2) goto L5c
            r1 = 1
        L5c:
            r4.E = r1
            return
    }

    public void a(java.lang.String r2) {
            r1 = this;
            r1.y = r2
            com.beizi.ad.internal.e r0 = r1.f7479b
            if (r0 == 0) goto L9
            r0.b(r2)
        L9:
            return
    }

    public void a(java.util.Map r2) {
            r1 = this;
            com.beizi.ad.internal.f.c r0 = r1.f7480c
            if (r0 == 0) goto La
            if (r2 != 0) goto L7
            goto La
        L7:
            r0.a(r2)
        La:
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.f7481d = r1
            return
    }

    public boolean a(com.beizi.ad.model.f.a r5) {
            r4 = this;
            com.beizi.ad.internal.k r0 = r4.m
            com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.f7000b
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L30
            com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.f7001c
            if (r0 == r1) goto L30
            com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.a
            if (r0 != r1) goto L11
            goto L30
        L11:
            com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.f7005g
            if (r0 != r1) goto L1b
            com.beizi.ad.model.f$a r0 = com.beizi.ad.model.f.a.f7428g
            if (r5 == r0) goto L1a
            return r3
        L1a:
            return r2
        L1b:
            com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.f7003e
            if (r0 != r1) goto L25
            com.beizi.ad.model.f$a r0 = com.beizi.ad.model.f.a.f7425d
            if (r5 == r0) goto L24
            return r3
        L24:
            return r2
        L25:
            com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.f7004f
            if (r0 != r1) goto L2f
            com.beizi.ad.model.f$a r0 = com.beizi.ad.model.f.a.f7423b
            if (r5 == r0) goto L2e
            return r3
        L2e:
            return r2
        L2f:
            return r3
        L30:
            com.beizi.ad.model.f$a r0 = com.beizi.ad.model.f.a.f7424c
            if (r5 == r0) goto L35
            return r3
        L35:
            return r2
    }

    public void b() {
            r6 = this;
            boolean r0 = r6.f7485h
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r6.f7485h = r0
            java.lang.String r1 = r6.G
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 3
            if (r1 != 0) goto L47
            com.beizi.ad.internal.f.c r1 = new com.beizi.ad.internal.f.c
            java.lang.String r3 = r6.G
            com.beizi.ad.internal.e r4 = r6.f7479b
            com.beizi.ad.internal.k r4 = r4.i()
            r5 = 0
            r1.<init>(r3, r5, r4)
            boolean r3 = r1.h()
            if (r3 != 0) goto L29
            r6.b(r2)
            return
        L29:
            com.beizi.ad.model.f$a r2 = r1.x()
            boolean r2 = r6.a(r2)
            if (r2 != 0) goto L39
            r0 = 12
            r6.b(r0)
            return
        L39:
            java.lang.String r2 = r1.aa()
            r6.l = r2
            java.lang.String r2 = r1.W()
            r6.a(r0, r2, r5, r1)
            return
        L47:
            java.lang.String r0 = "S2S"
            java.lang.String r1 = r6.H
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L55
            r6.b(r2)
            return
        L55:
            r6.u()
            com.beizi.ad.lance.a.c r0 = com.beizi.ad.lance.a.c.b()
            java.util.concurrent.ExecutorService r0 = r0.c()
            com.beizi.ad.v2.a.b$2 r1 = new com.beizi.ad.v2.a.b$2
            r1.<init>(r6)
            r0.execute(r1)
            return
    }

    public void b(int r1) {
            r0 = this;
            return
    }

    public void b(java.lang.String r1) {
            r0 = this;
            r0.f7482e = r1
            return
    }

    public void b(java.util.Map r2) {
            r1 = this;
            com.beizi.ad.internal.f.c r0 = r1.f7480c
            if (r0 == 0) goto Lf
            if (r2 != 0) goto L7
            goto Lf
        L7:
            r1.w()
            com.beizi.ad.internal.f.c r0 = r1.f7480c
            r0.b(r2)
        Lf:
            return
    }

    public void c() {
            r0 = this;
            return
    }

    public void c(java.lang.String r1) {
            r0 = this;
            r0.f7483f = r1
            return
    }

    public void c(java.util.Map<java.lang.String, java.lang.Object> r1) {
            r0 = this;
            r0.I = r1
            return
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.y
            return r0
    }

    public void d(java.lang.String r1) {
            r0 = this;
            r0.G = r1
            return
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.l
            return r0
    }

    public void e(java.lang.String r1) {
            r0 = this;
            r0.H = r1
            return
    }

    public boolean f() {
            r1 = this;
            boolean r0 = r1.x
            return r0
    }

    public java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.f7482e
            return r0
    }

    public java.lang.String h() {
            r1 = this;
            java.lang.String r0 = r1.f7483f
            return r0
    }

    public boolean i() {
            r1 = this;
            boolean r0 = r1.f7484g
            return r0
    }

    public boolean j() {
            r1 = this;
            boolean r0 = r1.f7481d
            return r0
    }

    public java.util.Map k() {
            r1 = this;
            com.beizi.ad.internal.f.c r0 = r1.f7480c
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.Map r0 = r0.Q()
            return r0
    }

    public java.lang.String l() {
            r1 = this;
            com.beizi.ad.internal.f.c r0 = r1.f7480c
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.R()
            return r0
    }

    public com.beizi.ad.internal.f.c m() {
            r1 = this;
            com.beizi.ad.internal.f.c r0 = r1.f7480c
            return r0
    }

    protected boolean n() {
            r5 = this;
            boolean r0 = r5.J
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            r5.J = r0
            int r2 = r5.q
            if (r2 > 0) goto Le
            return r1
        Le:
            boolean r2 = r5.s
            if (r2 == 0) goto L13
            return r1
        L13:
            com.beizi.ad.internal.a.a r2 = com.beizi.ad.internal.a.a.a()     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = r5.d()     // Catch: java.lang.Throwable -> L49
            com.beizi.ad.internal.a.b r2 = r2.b(r3)     // Catch: java.lang.Throwable -> L49
            if (r2 != 0) goto L22
            return r1
        L22:
            com.beizi.ad.internal.a.a r3 = com.beizi.ad.internal.a.a.a()     // Catch: java.lang.Throwable -> L49
            com.beizi.ad.internal.k r4 = r5.m     // Catch: java.lang.Throwable -> L49
            com.beizi.ad.internal.f.c r3 = r3.a(r2, r4)     // Catch: java.lang.Throwable -> L49
            if (r3 != 0) goto L2f
            return r1
        L2f:
            boolean r4 = r5.s     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto L3d
            com.beizi.ad.internal.a.a r3 = com.beizi.ad.internal.a.a.a()     // Catch: java.lang.Throwable -> L49
            int r4 = r5.q     // Catch: java.lang.Throwable -> L49
            r3.a(r2, r0, r4)     // Catch: java.lang.Throwable -> L49
            return r1
        L3d:
            boolean r4 = r5.a(r3, r2)     // Catch: java.lang.Throwable -> L49
            if (r4 != 0) goto L44
            return r1
        L44:
            r4 = 0
            r5.a(r1, r4, r2, r3)     // Catch: java.lang.Throwable -> L49
            return r0
        L49:
            return r1
    }

    public boolean o() {
            r1 = this;
            boolean r0 = r1.t
            return r0
    }

    public long p() {
            r3 = this;
            r0 = 0
            boolean r2 = r3.t     // Catch: java.lang.Exception -> L10
            if (r2 != 0) goto L7
            return r0
        L7:
            com.beizi.ad.internal.a.b r2 = r3.r     // Catch: java.lang.Exception -> L10
            if (r2 != 0) goto Lc
            return r0
        Lc:
            long r0 = r2.b()     // Catch: java.lang.Exception -> L10
        L10:
            return r0
    }

    public void q() {
            r2 = this;
            com.beizi.ad.internal.f.c r0 = r2.f7480c
            if (r0 == 0) goto L8
            r1 = 0
            r0.d(r1)
        L8:
            r2.w()
            r2.r()
            return
    }

    public void r() {
            r2 = this;
            android.os.Handler r0 = r2.F
            if (r0 == 0) goto L9
            r1 = 16
            r0.removeMessages(r1)
        L9:
            return
    }

    public int s() {
            r1 = this;
            int r0 = r1.n
            if (r0 > 0) goto L5
            r0 = 5
        L5:
            return r0
    }

    public org.json.JSONObject t() {
            r9 = this;
            java.lang.String r0 = "materialInfo"
            r1 = 0
            java.util.Map<java.lang.String, java.lang.Object> r2 = r9.I     // Catch: org.json.JSONException -> L12f
            if (r2 != 0) goto L8
            return r1
        L8:
            boolean r2 = r2.containsKey(r0)     // Catch: org.json.JSONException -> L12f
            if (r2 != 0) goto Lf
            return r1
        Lf:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r9.I     // Catch: org.json.JSONException -> L12f
            java.lang.Object r2 = r2.get(r0)     // Catch: org.json.JSONException -> L12f
            boolean r3 = r2 instanceof java.lang.Integer     // Catch: org.json.JSONException -> L12f
            if (r3 != 0) goto L1a
            return r1
        L1a:
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: org.json.JSONException -> L12f
            int r2 = r2.intValue()     // Catch: org.json.JSONException -> L12f
            if (r2 != 0) goto L23
            return r1
        L23:
            r3 = 1
            r4 = 101(0x65, float:1.42E-43)
            r5 = 1001(0x3e9, float:1.403E-42)
            if (r2 == r3) goto L2f
            if (r2 == r4) goto L2f
            if (r2 == r5) goto L2f
            return r1
        L2f:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L12f
            r6.<init>()     // Catch: org.json.JSONException -> L12f
            com.beizi.ad.internal.f.c r7 = r9.f7480c     // Catch: org.json.JSONException -> L12f
            if (r7 == 0) goto L12e
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> L12f
            r7.<init>()     // Catch: org.json.JSONException -> L12f
            if (r2 == r3) goto L43
            if (r2 == r4) goto L43
            if (r2 != r5) goto Lbf
        L43:
            com.beizi.ad.internal.k r3 = r9.m     // Catch: org.json.JSONException -> L12f
            com.beizi.ad.internal.k r8 = com.beizi.ad.internal.k.f7000b     // Catch: org.json.JSONException -> L12f
            if (r3 != r8) goto L50
            com.beizi.ad.internal.f.c r3 = r9.f7480c     // Catch: org.json.JSONException -> L12f
            java.lang.String r3 = r3.S()     // Catch: org.json.JSONException -> L12f
            goto L7d
        L50:
            com.beizi.ad.internal.k r8 = com.beizi.ad.internal.k.f7005g     // Catch: org.json.JSONException -> L12f
            if (r3 != r8) goto L5b
            com.beizi.ad.internal.f.c r3 = r9.f7480c     // Catch: org.json.JSONException -> L12f
            java.lang.String r3 = r3.S()     // Catch: org.json.JSONException -> L12f
            goto L7d
        L5b:
            com.beizi.ad.internal.k r8 = com.beizi.ad.internal.k.f7003e     // Catch: org.json.JSONException -> L12f
            if (r3 != r8) goto L66
            com.beizi.ad.internal.f.c r3 = r9.f7480c     // Catch: org.json.JSONException -> L12f
            java.lang.String r3 = r3.L()     // Catch: org.json.JSONException -> L12f
            goto L7d
        L66:
            com.beizi.ad.internal.k r8 = com.beizi.ad.internal.k.f7004f     // Catch: org.json.JSONException -> L12f
            if (r3 != r8) goto L71
            com.beizi.ad.internal.f.c r3 = r9.f7480c     // Catch: org.json.JSONException -> L12f
            java.lang.String r3 = r3.L()     // Catch: org.json.JSONException -> L12f
            goto L7d
        L71:
            com.beizi.ad.internal.k r8 = com.beizi.ad.internal.k.f7001c     // Catch: org.json.JSONException -> L12f
            if (r3 != r8) goto L7c
            com.beizi.ad.internal.f.c r3 = r9.f7480c     // Catch: org.json.JSONException -> L12f
            java.lang.String r3 = r3.U()     // Catch: org.json.JSONException -> L12f
            goto L7d
        L7c:
            r3 = r1
        L7d:
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L12f
            if (r8 != 0) goto L9d
            java.lang.String r8 = "http"
            boolean r8 = r3.startsWith(r8)     // Catch: org.json.JSONException -> L12f
            if (r8 == 0) goto L9d
            java.lang.String r8 = "imageUrl"
            r7.put(r8, r3)     // Catch: org.json.JSONException -> L12f
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch: org.json.JSONException -> L12f
            r8.<init>()     // Catch: org.json.JSONException -> L12f
            r8.put(r3)     // Catch: org.json.JSONException -> L12f
            java.lang.String r3 = "imageUrls"
            r7.put(r3, r8)     // Catch: org.json.JSONException -> L12f
        L9d:
            com.beizi.ad.internal.f.c r3 = r9.f7480c     // Catch: org.json.JSONException -> L12f
            java.lang.String r3 = r3.M()     // Catch: org.json.JSONException -> L12f
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L12f
            if (r8 != 0) goto Lae
            java.lang.String r8 = "videoUrl"
            r7.put(r8, r3)     // Catch: org.json.JSONException -> L12f
        Lae:
            com.beizi.ad.internal.f.c r3 = r9.f7480c     // Catch: org.json.JSONException -> L12f
            java.lang.String r3 = r3.ah()     // Catch: org.json.JSONException -> L12f
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L12f
            if (r8 != 0) goto Lbf
            java.lang.String r8 = "crid"
            r7.put(r8, r3)     // Catch: org.json.JSONException -> L12f
        Lbf:
            if (r2 == r4) goto Lc3
            if (r2 != r5) goto L118
        Lc3:
            com.beizi.ad.internal.f.c r3 = r9.f7480c     // Catch: org.json.JSONException -> L12f
            java.lang.String r3 = r3.ab()     // Catch: org.json.JSONException -> L12f
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L12f
            if (r4 != 0) goto Ld4
            java.lang.String r4 = "deeplinkUrl"
            r7.put(r4, r3)     // Catch: org.json.JSONException -> L12f
        Ld4:
            com.beizi.ad.internal.f.c r3 = r9.f7480c     // Catch: org.json.JSONException -> L12f
            java.lang.String r3 = r3.ac()     // Catch: org.json.JSONException -> L12f
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L12f
            if (r4 != 0) goto Le5
            java.lang.String r4 = "landingPageUrl"
            r7.put(r4, r3)     // Catch: org.json.JSONException -> L12f
        Le5:
            com.beizi.ad.internal.f.c r3 = r9.f7480c     // Catch: org.json.JSONException -> L12f
            java.lang.String r3 = r3.ad()     // Catch: org.json.JSONException -> L12f
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L12f
            if (r4 != 0) goto Lf6
            java.lang.String r4 = "downloadUrl"
            r7.put(r4, r3)     // Catch: org.json.JSONException -> L12f
        Lf6:
            com.beizi.ad.internal.f.c r3 = r9.f7480c     // Catch: org.json.JSONException -> L12f
            java.lang.String r3 = r3.ae()     // Catch: org.json.JSONException -> L12f
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L12f
            if (r4 != 0) goto L107
            java.lang.String r4 = "miniProgramId"
            r7.put(r4, r3)     // Catch: org.json.JSONException -> L12f
        L107:
            com.beizi.ad.internal.f.c r3 = r9.f7480c     // Catch: org.json.JSONException -> L12f
            java.lang.String r3 = r3.af()     // Catch: org.json.JSONException -> L12f
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L12f
            if (r4 != 0) goto L118
            java.lang.String r4 = "miniProgramPath"
            r7.put(r4, r3)     // Catch: org.json.JSONException -> L12f
        L118:
            if (r2 != r5) goto L12b
            com.beizi.ad.internal.f.c r2 = r9.f7480c     // Catch: org.json.JSONException -> L12f
            java.lang.String r2 = r2.ag()     // Catch: org.json.JSONException -> L12f
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> L12f
            if (r3 != 0) goto L12b
            java.lang.String r3 = "orderId"
            r7.put(r3, r2)     // Catch: org.json.JSONException -> L12f
        L12b:
            r6.put(r0, r7)     // Catch: org.json.JSONException -> L12f
        L12e:
            return r6
        L12f:
            return r1
    }
}
