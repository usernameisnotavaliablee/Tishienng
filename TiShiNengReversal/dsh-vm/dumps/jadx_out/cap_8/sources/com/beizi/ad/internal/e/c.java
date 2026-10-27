package com.beizi.ad.internal.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c extends com.beizi.ad.internal.f.a implements com.beizi.ad.internal.a {
    public com.beizi.ad.internal.f.c a;

    /* renamed from: b, reason: collision with root package name */
    private com.beizi.ad.h f6750b;

    /* renamed from: d, reason: collision with root package name */
    private com.beizi.ad.internal.e.c.a f6751d;

    /* renamed from: e, reason: collision with root package name */
    private com.beizi.ad.internal.e f6752e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f6753f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f6754g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f6755h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6756i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f6757j;

    /* renamed from: k, reason: collision with root package name */
    private com.beizi.ad.i f6758k;
    private java.lang.String l;
    private com.beizi.ad.internal.k m;
    private android.os.CountDownTimer n;
    private int o;
    private com.beizi.ad.internal.a.b p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a implements com.beizi.ad.internal.c {
        final /* synthetic */ com.beizi.ad.internal.e.c a;

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        @Override // com.beizi.ad.internal.c
        public void a() {
                r0 = this;
                return
        }

        @Override // com.beizi.ad.internal.c
        public void a(int r3) {
                r2 = this;
                com.beizi.ad.internal.e.c r0 = r2.a
                r1 = 0
                com.beizi.ad.internal.e.c.a(r0, r1)
                com.beizi.ad.internal.e.c r0 = r2.a
                boolean r0 = com.beizi.ad.internal.e.c.c(r0)
                if (r0 == 0) goto Lf
                goto L2e
            Lf:
                com.beizi.ad.internal.e.c r0 = r2.a
                com.beizi.ad.internal.e.c.b(r0)
                com.beizi.ad.internal.e.c r0 = r2.a
                boolean r0 = com.beizi.ad.internal.e.c.d(r0)
                if (r0 == 0) goto L1d
                goto L2e
            L1d:
                com.beizi.ad.internal.e.c r0 = r2.a
                com.beizi.ad.h r0 = com.beizi.ad.internal.e.c.a(r0)
                if (r0 == 0) goto L2e
                com.beizi.ad.internal.e.c r0 = r2.a
                com.beizi.ad.h r0 = com.beizi.ad.internal.e.c.a(r0)
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
                com.beizi.ad.internal.e.c r0 = r3.a     // Catch: java.lang.Exception -> L42
                com.beizi.ad.internal.e.c.b(r0)     // Catch: java.lang.Exception -> L42
                com.beizi.ad.internal.e.c r0 = r3.a     // Catch: java.lang.Exception -> L42
                boolean r0 = com.beizi.ad.internal.e.c.c(r0)     // Catch: java.lang.Exception -> L42
                if (r0 == 0) goto L1b
                com.beizi.ad.internal.e.c r0 = r3.a     // Catch: java.lang.Exception -> L42
                com.beizi.ad.internal.f.c r1 = r4.j()     // Catch: java.lang.Exception -> L42
                java.lang.String r4 = r4.k()     // Catch: java.lang.Exception -> L42
                r0.a(r1, r4)     // Catch: java.lang.Exception -> L42
                return
            L1b:
                com.beizi.ad.internal.f.c r0 = r4.j()     // Catch: java.lang.Exception -> L42
                if (r0 != 0) goto L2f
                com.beizi.ad.internal.e.c r4 = r3.a     // Catch: java.lang.Exception -> L42
                boolean r4 = com.beizi.ad.internal.e.c.d(r4)     // Catch: java.lang.Exception -> L42
                if (r4 == 0) goto L2a
                goto L42
            L2a:
                r4 = 0
                r3.a(r4)     // Catch: java.lang.Exception -> L42
                return
            L2f:
                com.beizi.ad.internal.e.c r0 = r3.a     // Catch: java.lang.Exception -> L42
                r1 = 1
                com.beizi.ad.internal.e.c.b(r0, r1)     // Catch: java.lang.Exception -> L42
                com.beizi.ad.internal.e.c r0 = r3.a     // Catch: java.lang.Exception -> L42
                java.lang.String r2 = r4.k()     // Catch: java.lang.Exception -> L42
                com.beizi.ad.internal.f.c r4 = r4.j()     // Catch: java.lang.Exception -> L42
                com.beizi.ad.internal.e.c.a(r0, r1, r2, r4)     // Catch: java.lang.Exception -> L42
            L42:
                return
        }

        @Override // com.beizi.ad.internal.c
        public void a(java.lang.String r1) {
                r0 = this;
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
                r0 = this;
                return
        }

        @Override // com.beizi.ad.internal.c
        public void c() {
                r0 = this;
                return
        }

        @Override // com.beizi.ad.internal.c
        public void d() {
                r0 = this;
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

    static /* synthetic */ com.beizi.ad.h a(com.beizi.ad.internal.e.c r0) {
            com.beizi.ad.h r0 = r0.f6750b
            return r0
    }

    static /* synthetic */ void a(com.beizi.ad.internal.e.c r0, boolean r1, java.lang.String r2, com.beizi.ad.internal.f.c r3) {
            r0.a(r1, r2, r3)
            return
    }

    private synchronized void a(boolean r3, java.lang.String r4, com.beizi.ad.internal.f.c r5) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.s     // Catch: java.lang.Throwable -> Lc
            r1 = 1
            if (r0 == 0) goto L1f
            if (r3 == 0) goto Le
            r2.a(r5, r4)     // Catch: java.lang.Throwable -> Lc
            goto L1d
        Lc:
            r3 = move-exception
            goto L3f
        Le:
            boolean r3 = r2.q     // Catch: java.lang.Throwable -> Lc
            if (r3 == 0) goto L1d
            com.beizi.ad.internal.a.a r3 = com.beizi.ad.internal.a.a.a()     // Catch: java.lang.Throwable -> Lc
            com.beizi.ad.internal.a.b r4 = r2.p     // Catch: java.lang.Throwable -> Lc
            int r5 = r2.o     // Catch: java.lang.Throwable -> Lc
            r3.a(r4, r1, r5)     // Catch: java.lang.Throwable -> Lc
        L1d:
            monitor-exit(r2)
            return
        L1f:
            r2.s = r1     // Catch: java.lang.Throwable -> Lc
            r2.a = r5     // Catch: java.lang.Throwable -> Lc
            if (r3 == 0) goto L28
            r2.q = r1     // Catch: java.lang.Throwable -> Lc
            goto L3a
        L28:
            r2.r = r1     // Catch: java.lang.Throwable -> Lc
            com.beizi.ad.internal.e r3 = r2.f6752e     // Catch: java.lang.Throwable -> Lc
            com.beizi.ad.internal.a.b r4 = r2.p     // Catch: java.lang.Throwable -> Lc
            java.lang.String r4 = r4.d()     // Catch: java.lang.Throwable -> Lc
            r3.a(r4)     // Catch: java.lang.Throwable -> Lc
            com.beizi.ad.internal.f.c r3 = r2.a     // Catch: java.lang.Throwable -> Lc
            r3.c(r1)     // Catch: java.lang.Throwable -> Lc
        L3a:
            r2.c(r5)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L3f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    static /* synthetic */ boolean a(com.beizi.ad.internal.e.c r0, boolean r1) {
            r0.t = r1
            return r1
    }

    static /* synthetic */ void b(com.beizi.ad.internal.e.c r0) {
            r0.g()
            return
    }

    static /* synthetic */ boolean b(com.beizi.ad.internal.e.c r0, boolean r1) {
            r0.q = r1
            return r1
    }

    private void c(com.beizi.ad.internal.f.c r2) {
            r1 = this;
            com.beizi.ad.i r0 = r2.a()
            r1.f6758k = r0
            if (r0 != 0) goto L11
            com.beizi.ad.h r2 = r1.f6750b
            if (r2 == 0) goto L57
            r0 = 3
            r2.a(r0)
            return
        L11:
            java.lang.String r0 = r2.e()
            r1.a(r0)
            java.lang.String r0 = r2.f()
            r1.b(r0)
            boolean r0 = r2.P()
            r1.a(r0)
            com.beizi.ad.i r0 = r1.f6758k
            java.lang.String r0 = r0.m()
            r1.c(r0)
            java.lang.String r2 = r2.R()
            r1.d(r2)
            com.beizi.ad.i r2 = r1.f6758k
            com.beizi.ad.internal.e.a r2 = (com.beizi.ad.internal.e.a) r2
            boolean r0 = r1.r
            r2.c(r0)
            com.beizi.ad.i r2 = r1.f6758k
            com.beizi.ad.internal.e.a r2 = (com.beizi.ad.internal.e.a) r2
            com.beizi.ad.internal.e r0 = r1.d()
            java.lang.String r0 = r0.a()
            r2.a(r0)
            com.beizi.ad.h r2 = r1.f6750b
            if (r2 == 0) goto L57
            com.beizi.ad.i r0 = r1.f6758k
            r2.a(r0)
        L57:
            return
    }

    static /* synthetic */ boolean c(com.beizi.ad.internal.e.c r0) {
            boolean r0 = r0.r
            return r0
    }

    static /* synthetic */ boolean d(com.beizi.ad.internal.e.c r0) {
            boolean r0 = r0.f()
            return r0
    }

    private boolean f() {
            r5 = this;
            int r0 = r5.o
            r1 = 0
            if (r0 > 0) goto L6
            return r1
        L6:
            boolean r0 = r5.q
            if (r0 == 0) goto Lb
            return r1
        Lb:
            com.beizi.ad.internal.a.a r0 = com.beizi.ad.internal.a.a.a()
            java.lang.String r2 = r5.c()
            com.beizi.ad.internal.a.b r0 = r0.b(r2)
            r5.p = r0
            if (r0 != 0) goto L1c
            return r1
        L1c:
            com.beizi.ad.internal.a.a r0 = com.beizi.ad.internal.a.a.a()
            com.beizi.ad.internal.a.b r2 = r5.p
            com.beizi.ad.internal.k r3 = r5.m
            com.beizi.ad.internal.f.c r0 = r0.a(r2, r3)
            if (r0 != 0) goto L2b
            return r1
        L2b:
            boolean r2 = r5.q
            r3 = 1
            if (r2 == 0) goto L3c
            com.beizi.ad.internal.a.a r0 = com.beizi.ad.internal.a.a.a()
            com.beizi.ad.internal.a.b r2 = r5.p
            int r4 = r5.o
            r0.a(r2, r3, r4)
            return r1
        L3c:
            r2 = 0
            r5.a(r1, r2, r0)
            return r3
    }

    private void g() {
            r1 = this;
            android.os.CountDownTimer r0 = r1.n
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            r1.n = r0
        La:
            return
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
            java.lang.String r4 = r7.l
            java.lang.String r5 = r7.c()
            com.beizi.ad.internal.k r6 = r7.m
            r2 = r8
            r3 = r9
            r1.a(r2, r3, r4, r5, r6)
        L20:
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.f6753f = r1
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.f6756i = r1
            return
    }

    public boolean a() {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f6752e
            boolean r0 = r0.h()
            return r0
    }

    public void b(java.lang.String r1) {
            r0 = this;
            r0.f6754g = r1
            return
    }

    public boolean b() {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f6752e
            if (r0 == 0) goto L9
            boolean r0 = r0.l()
            return r0
        L9:
            r0 = 1
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f6752e
            java.lang.String r0 = r0.c()
            return r0
    }

    public void c(java.lang.String r1) {
            r0 = this;
            r0.f6755h = r1
            return
    }

    com.beizi.ad.internal.e d() {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f6752e
            return r0
    }

    public void d(java.lang.String r1) {
            r0 = this;
            r0.f6757j = r1
            return
    }

    public com.beizi.ad.internal.c e() {
            r1 = this;
            com.beizi.ad.internal.e.c$a r0 = r1.f6751d
            return r0
    }

    @Override // com.beizi.ad.internal.a
    public com.beizi.ad.internal.k getMediaType() {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f6752e
            com.beizi.ad.internal.k r0 = r0.i()
            return r0
    }

    @Override // com.beizi.ad.internal.a
    public boolean isReadyToStart() {
            r1 = this;
            com.beizi.ad.h r0 = r1.f6750b
            if (r0 == 0) goto Le
            com.beizi.ad.internal.e r0 = r1.f6752e
            boolean r0 = r0.j()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }
}
