package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class n0 implements xyz.adscope.ad.r2 {
    protected final android.content.Context a;
    protected final xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel b;
    protected final xyz.adscope.ad.a2 c;
    protected final xyz.adscope.ad.b1 d;
    protected final xyz.adscope.ad.n3 e;
    protected final xyz.adscope.ad.y1 f;
    protected final xyz.adscope.ad.s1 g;
    private final xyz.adscope.ad.j0 h;
    private final xyz.adscope.ad.n0.c i;
    private xyz.adscope.ad.x2 j;
    private xyz.adscope.ad.k3 k;
    private xyz.adscope.ad.f4 l;
    private xyz.adscope.ad.t3 m;
    private xyz.adscope.ad.v1 n;
    private xyz.adscope.ad.u1 o;
    private xyz.adscope.ad.z2 p;
    private xyz.adscope.ad.w4 q;
    private final xyz.adscope.common.v2.beta.IBetaTest r;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel b;
        final /* synthetic */ xyz.adscope.ad.n0 c;

        a(xyz.adscope.ad.n0 r1, android.content.Context r2, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.content.Context r0 = r2.a
                android.content.Context r0 = r0.getApplicationContext()
                android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r1 = r2.b
                xyz.adscope.ad.e0.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b implements xyz.adscope.ad.y1 {
        private boolean a;
        private xyz.adscope.ad.x1 b;
        private final xyz.adscope.ad.u1.a c;
        final /* synthetic */ xyz.adscope.ad.n0 d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements xyz.adscope.ad.u1.a {
            final /* synthetic */ xyz.adscope.ad.n0.b a;

            a(xyz.adscope.ad.n0.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // xyz.adscope.ad.u1.a
            public void a() {
                    r1 = this;
                    xyz.adscope.ad.n0$b r0 = r1.a
                    xyz.adscope.ad.n0 r0 = r0.d
                    xyz.adscope.ad.b1 r0 = r0.d
                    boolean r0 = r0.z()
                    if (r0 != 0) goto L2a
                    xyz.adscope.ad.n0$b r0 = r1.a
                    xyz.adscope.ad.n0 r0 = r0.d
                    xyz.adscope.ad.x2 r0 = xyz.adscope.ad.n0.g(r0)
                    if (r0 == 0) goto L2a
                    xyz.adscope.ad.n0$b r0 = r1.a
                    xyz.adscope.ad.n0 r0 = r0.d
                    xyz.adscope.ad.b1 r0 = r0.d
                    r0.D()
                    xyz.adscope.ad.n0$b r0 = r1.a
                    xyz.adscope.ad.n0 r0 = r0.d
                    xyz.adscope.ad.x2 r0 = xyz.adscope.ad.n0.g(r0)
                    r0.onAdExposure()
                L2a:
                    xyz.adscope.ad.n0$b r0 = r1.a
                    xyz.adscope.ad.n0 r0 = r0.d
                    xyz.adscope.ad.k3 r0 = xyz.adscope.ad.n0.c(r0)
                    if (r0 == 0) goto L3f
                    xyz.adscope.ad.n0$b r0 = r1.a
                    xyz.adscope.ad.n0 r0 = r0.d
                    xyz.adscope.ad.k3 r0 = xyz.adscope.ad.n0.c(r0)
                    r0.a()
                L3f:
                    return
            }

            @Override // xyz.adscope.ad.u1.a
            public void b() {
                    r0 = this;
                    return
            }
        }

        private b(xyz.adscope.ad.n0 r1) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                r1 = 0
                r0.a = r1
                xyz.adscope.ad.n0$b$a r1 = new xyz.adscope.ad.n0$b$a
                r1.<init>(r0)
                r0.c = r1
                return
        }

        /* synthetic */ b(xyz.adscope.ad.n0 r1, xyz.adscope.ad.n0.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // xyz.adscope.ad.m2
        public /* bridge */ /* synthetic */ void a(xyz.adscope.ad.x1 r1) {
                r0 = this;
                xyz.adscope.ad.x1 r1 = (xyz.adscope.ad.x1) r1
                r0.a2(r1)
                return
        }

        @Override // xyz.adscope.ad.y1
        public void a(xyz.adscope.ad.l2 r3) {
                r2 = this;
                xyz.adscope.ad.n0 r3 = r2.d
                android.view.View r3 = r3.getExpressView()
                boolean r0 = r3 instanceof xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a
                if (r0 == 0) goto Lf
                xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r3 = (xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a) r3
                r3.removeFromParent()
            Lf:
                xyz.adscope.ad.n0 r3 = r2.d
                xyz.adscope.ad.x2 r3 = xyz.adscope.ad.n0.g(r3)
                if (r3 == 0) goto L2b
                xyz.adscope.ad.n0 r3 = r2.d
                xyz.adscope.ad.x2 r3 = xyz.adscope.ad.n0.g(r3)
                r3.onAdClosed()
                xyz.adscope.ad.n0 r3 = r2.d
                xyz.adscope.ad.s1 r0 = r3.g
                xyz.adscope.ad.n1 r1 = xyz.adscope.ad.n1.r
                xyz.adscope.ad.b1 r3 = r3.d
                r0.a(r1, r3)
            L2b:
                return
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        public void a2(xyz.adscope.ad.x1 r1) {
                r0 = this;
                r0.b = r1
                return
        }

        @Override // xyz.adscope.ad.y1
        public void a(xyz.adscope.ad.y1.a r5) {
                r4 = this;
                xyz.adscope.ad.n0 r0 = r4.d
                xyz.adscope.ad.v1 r0 = xyz.adscope.ad.n0.b(r0)
                xyz.adscope.ad.n0 r1 = r4.d
                xyz.adscope.ad.b1 r2 = r1.d
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r3 = r1.b
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r1 = r1.a(r3)
                java.lang.String r1 = r1.f()
                r0.a(r5, r2, r1)
                return
        }

        @Override // xyz.adscope.ad.y1
        public void b(xyz.adscope.ad.l2 r4) {
                r3 = this;
                xyz.adscope.ad.n0 r4 = r3.d
                android.content.Context r0 = r4.a
                xyz.adscope.ad.a2 r4 = r4.c
                long r1 = java.lang.System.currentTimeMillis()
                xyz.adscope.ad.i1.a(r0, r4, r1)
                xyz.adscope.ad.n0 r4 = r3.d
                android.view.View r4 = r4.getExpressView()
                boolean r0 = r4 instanceof xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a
                if (r0 == 0) goto L25
                xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r4 = (xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a) r4
                java.lang.String r4 = xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a.c.a(r4)
                xyz.adscope.ad.n0 r0 = r3.d
                xyz.adscope.ad.b1 r0 = r0.d
                r0.b(r4)
                goto L27
            L25:
                java.lang.String r4 = ""
            L27:
                xyz.adscope.ad.n0 r0 = r3.d
                xyz.adscope.ad.s1 r1 = r0.g
                xyz.adscope.ad.n1 r2 = xyz.adscope.ad.n1.q
                xyz.adscope.ad.b1 r0 = r0.d
                r1.a(r2, r0)
                xyz.adscope.ad.n0 r0 = r3.d
                xyz.adscope.ad.t3 r0 = xyz.adscope.ad.n0.d(r0)
                r0.a(r4)
                xyz.adscope.ad.y1$a r4 = xyz.adscope.ad.y1.a.r
                r3.a(r4)
                return
        }

        @Override // xyz.adscope.ad.y1
        public void c(xyz.adscope.ad.l2 r6) {
                r5 = this;
                xyz.adscope.ad.n0 r0 = r5.d
                xyz.adscope.ad.s1 r1 = r0.g
                xyz.adscope.ad.n1 r2 = xyz.adscope.ad.n1.p
                xyz.adscope.ad.b1 r0 = r0.d
                r1.a(r2, r0)
                xyz.adscope.ad.x1 r0 = r5.b
                boolean r1 = r0 instanceof xyz.adscope.ad.v2
                if (r1 == 0) goto L1e
                xyz.adscope.ad.v2 r0 = (xyz.adscope.ad.v2) r0
                xyz.adscope.ad.n0 r1 = r5.d
                xyz.adscope.ad.b1 r1 = r1.d
                xyz.adscope.ad.b1 r1 = r1.a()
                r0.a(r1)
            L1e:
                xyz.adscope.ad.n0 r0 = r5.d
                xyz.adscope.ad.z2 r0 = xyz.adscope.ad.n0.h(r0)
                if (r0 == 0) goto L6c
                xyz.adscope.ad.n0 r0 = r5.d
                xyz.adscope.ad.z2 r0 = xyz.adscope.ad.n0.h(r0)
                int r0 = r0.b()
                r1 = 1
                if (r0 != r1) goto L6c
                xyz.adscope.ad.n0 r0 = r5.d
                xyz.adscope.ad.u1 r0 = xyz.adscope.ad.n0.i(r0)
                if (r0 == 0) goto L6c
                xyz.adscope.ad.n0 r0 = r5.d
                xyz.adscope.ad.u1 r0 = xyz.adscope.ad.n0.i(r0)
                xyz.adscope.ad.n0 r3 = r5.d
                xyz.adscope.ad.b1 r3 = r3.d
                xyz.adscope.ad.u1$a r4 = r5.c
                r0.a(r6, r3, r4)
                boolean r6 = r5.a
                if (r6 != 0) goto L6c
                r5.a = r1
                xyz.adscope.ad.n0 r6 = r5.d
                xyz.adscope.ad.j0 r6 = xyz.adscope.ad.n0.a(r6)
                xyz.adscope.ad.n0 r0 = r5.d
                xyz.adscope.ad.a2 r0 = r0.c
                java.lang.String r0 = r0.getSpaceID()
                r6.a(r0, r2)
                xyz.adscope.ad.n0 r6 = r5.d
                xyz.adscope.ad.s1 r0 = r6.g
                xyz.adscope.ad.n1 r1 = xyz.adscope.ad.n1.o
                xyz.adscope.ad.b1 r6 = r6.d
                r0.a(r1, r6)
            L6c:
                xyz.adscope.ad.n0 r6 = r5.d
                xyz.adscope.ad.a2 r6 = r6.c
                xyz.adscope.ad.c r6 = r6.getAdType()
                xyz.adscope.ad.c r0 = xyz.adscope.ad.c.h
                if (r6 != r0) goto L7d
                xyz.adscope.ad.y1$a r6 = xyz.adscope.ad.y1.a.r
                r5.a(r6)
            L7d:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements xyz.adscope.ad.publish.ad.IBidding {
        final /* synthetic */ xyz.adscope.ad.n0 a;

        private c(xyz.adscope.ad.n0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ c(xyz.adscope.ad.n0 r1, xyz.adscope.ad.n0.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // xyz.adscope.ad.publish.ad.IBidding
        public int getECPM() {
                r1 = this;
                xyz.adscope.ad.n0 r0 = r1.a
                int r0 = r0.c()
                return r0
        }

        @Override // xyz.adscope.ad.publish.ad.IBidding
        public void notifyBidLose(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                xyz.adscope.ad.n0 r0 = r1.a
                r0.a(r2)
                return
        }

        @Override // xyz.adscope.ad.publish.ad.IBidding
        public void notifyBidWin(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                xyz.adscope.ad.n0 r0 = r1.a
                r0.b(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected class d implements xyz.adscope.ad.a3 {
        private boolean a;
        private java.lang.Boolean b;
        private final xyz.adscope.ad.u1.a c;
        final /* synthetic */ xyz.adscope.ad.n0 d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements xyz.adscope.ad.u1.a {
            final /* synthetic */ xyz.adscope.ad.n0.d a;

            a(xyz.adscope.ad.n0.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // xyz.adscope.ad.u1.a
            public void a() {
                    r3 = this;
                    xyz.adscope.ad.n0$d r0 = r3.a
                    xyz.adscope.ad.n0 r0 = r0.d
                    xyz.adscope.ad.s1 r1 = r0.g
                    xyz.adscope.ad.n1 r2 = xyz.adscope.ad.n1.m
                    xyz.adscope.ad.b1 r0 = r0.d
                    r1.a(r2, r0)
                    xyz.adscope.ad.n0$d r0 = r3.a
                    xyz.adscope.ad.n0 r0 = r0.d
                    xyz.adscope.ad.b1 r0 = r0.d
                    r0.D()
                    xyz.adscope.ad.n0$d r0 = r3.a
                    xyz.adscope.ad.n0 r0 = r0.d
                    xyz.adscope.ad.x2 r0 = xyz.adscope.ad.n0.g(r0)
                    if (r0 == 0) goto L2b
                    xyz.adscope.ad.n0$d r0 = r3.a
                    xyz.adscope.ad.n0 r0 = r0.d
                    xyz.adscope.ad.x2 r0 = xyz.adscope.ad.n0.g(r0)
                    r0.onAdExposure()
                L2b:
                    return
            }

            @Override // xyz.adscope.ad.u1.a
            public void b() {
                    r2 = this;
                    xyz.adscope.ad.n0$d r0 = r2.a
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    xyz.adscope.ad.n0.d.a(r0, r1)
                    return
            }
        }

        protected d(xyz.adscope.ad.n0 r1) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                r1 = 0
                r0.a = r1
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r0.b = r1
                xyz.adscope.ad.n0$d$a r1 = new xyz.adscope.ad.n0$d$a
                r1.<init>(r0)
                r0.c = r1
                return
        }

        static /* synthetic */ java.lang.Boolean a(xyz.adscope.ad.n0.d r0, java.lang.Boolean r1) {
                r0.b = r1
                return r1
        }

        @Override // xyz.adscope.ad.a3
        public void a(android.view.View r1) {
                r0 = this;
                xyz.adscope.ad.n0 r1 = r0.d
                xyz.adscope.ad.w4 r1 = xyz.adscope.ad.n0.e(r1)
                if (r1 == 0) goto L11
                xyz.adscope.ad.n0 r1 = r0.d
                xyz.adscope.ad.w4 r1 = xyz.adscope.ad.n0.e(r1)
                r1.c()
            L11:
                return
        }

        @Override // xyz.adscope.ad.m2
        public /* bridge */ /* synthetic */ void a(xyz.adscope.ad.y2 r1) {
                r0 = this;
                xyz.adscope.ad.y2 r1 = (xyz.adscope.ad.y2) r1
                r0.a2(r1)
                return
        }

        @Override // xyz.adscope.ad.a3
        public void a(xyz.adscope.ad.l2 r3, android.view.View r4) {
                r2 = this;
                java.lang.Boolean r4 = r2.b
                boolean r4 = r4.booleanValue()
                if (r4 != 0) goto L3e
                xyz.adscope.ad.n0 r4 = r2.d
                xyz.adscope.ad.u1 r4 = xyz.adscope.ad.n0.i(r4)
                if (r4 == 0) goto L3e
                xyz.adscope.ad.n0 r4 = r2.d
                xyz.adscope.ad.x2 r4 = xyz.adscope.ad.n0.g(r4)
                if (r4 == 0) goto L3e
                xyz.adscope.ad.n0 r4 = r2.d
                xyz.adscope.ad.u1 r4 = xyz.adscope.ad.n0.i(r4)
                xyz.adscope.ad.n0 r0 = r2.d
                xyz.adscope.ad.b1 r0 = r0.d
                xyz.adscope.ad.u1$a r1 = r2.c
                r4.a(r3, r0, r1)
                xyz.adscope.ad.n0 r3 = r2.d
                xyz.adscope.ad.w4 r3 = xyz.adscope.ad.n0.e(r3)
                if (r3 == 0) goto L3e
                xyz.adscope.ad.n0 r3 = r2.d
                xyz.adscope.ad.w4 r3 = xyz.adscope.ad.n0.e(r3)
                xyz.adscope.ad.n0 r4 = r2.d
                android.view.View r4 = r4.getExpressView()
                r3.a(r4)
            L3e:
                return
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        public void a2(xyz.adscope.ad.y2 r2) {
                r1 = this;
                xyz.adscope.ad.n0 r0 = r1.d
                xyz.adscope.ad.n0.a(r0, r2)
                return
        }

        @Override // xyz.adscope.ad.a3
        public void b(android.view.View r6) {
                r5 = this;
                boolean r0 = r5.a
                if (r0 != 0) goto L4e
                r0 = 1
                r5.a = r0
                xyz.adscope.ad.n0 r0 = r5.d
                xyz.adscope.ad.i4 r0 = xyz.adscope.ad.n0.a(r0, r6)
                if (r0 == 0) goto L12
                r0.a(r6)
            L12:
                xyz.adscope.ad.n0 r6 = r5.d
                xyz.adscope.ad.b1 r6 = r6.d
                r6.B()
                xyz.adscope.ad.n0 r6 = r5.d
                xyz.adscope.ad.j0 r6 = xyz.adscope.ad.n0.a(r6)
                xyz.adscope.ad.n0 r0 = r5.d
                xyz.adscope.ad.a2 r0 = r0.c
                java.lang.String r0 = r0.getSpaceID()
                xyz.adscope.ad.n1 r1 = xyz.adscope.ad.n1.n
                r6.a(r0, r1)
                xyz.adscope.ad.n0 r6 = r5.d
                xyz.adscope.ad.v1 r6 = xyz.adscope.ad.n0.b(r6)
                xyz.adscope.ad.a3$a r0 = xyz.adscope.ad.a3.a.c
                xyz.adscope.ad.n0 r2 = r5.d
                xyz.adscope.ad.b1 r3 = r2.d
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r4 = r2.b
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r2 = r2.a(r4)
                java.lang.String r2 = r2.f()
                r6.a(r0, r3, r2)
                xyz.adscope.ad.n0 r6 = r5.d
                xyz.adscope.ad.s1 r0 = r6.g
                xyz.adscope.ad.b1 r6 = r6.d
                r0.a(r1, r6)
            L4e:
                return
        }

        @Override // xyz.adscope.ad.a3
        public void b(xyz.adscope.ad.l2 r4, android.view.View r5) {
                r3 = this;
                xyz.adscope.ad.n0 r4 = r3.d
                xyz.adscope.ad.w4 r4 = xyz.adscope.ad.n0.e(r4)
                if (r4 == 0) goto L11
                xyz.adscope.ad.n0 r4 = r3.d
                xyz.adscope.ad.w4 r4 = xyz.adscope.ad.n0.e(r4)
                r4.d()
            L11:
                xyz.adscope.ad.n0 r4 = r3.d
                xyz.adscope.ad.b1 r4 = r4.d
                long r4 = r4.v()
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto L26
                xyz.adscope.ad.n0 r4 = r3.d
                xyz.adscope.ad.b1 r4 = r4.d
                r4.C()
            L26:
                xyz.adscope.ad.n0 r4 = r3.d
                xyz.adscope.ad.b1 r4 = r4.d
                boolean r4 = r4.A()
                if (r4 != 0) goto L53
                xyz.adscope.ad.n0 r4 = r3.d
                xyz.adscope.ad.x2 r4 = xyz.adscope.ad.n0.g(r4)
                if (r4 == 0) goto L53
                xyz.adscope.ad.n0 r4 = r3.d
                xyz.adscope.ad.b1 r4 = r4.d
                r4.E()
                xyz.adscope.ad.n0 r4 = r3.d
                xyz.adscope.ad.x2 r4 = xyz.adscope.ad.n0.g(r4)
                r4.onAdShown()
                xyz.adscope.ad.n0 r4 = r3.d
                xyz.adscope.ad.s1 r5 = r4.g
                xyz.adscope.ad.n1 r0 = xyz.adscope.ad.n1.l
                xyz.adscope.ad.b1 r4 = r4.d
                r5.a(r0, r4)
            L53:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class e implements xyz.adscope.ad.n3 {
        final /* synthetic */ xyz.adscope.ad.n0 a;

        private e(xyz.adscope.ad.n0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ e(xyz.adscope.ad.n0 r1, xyz.adscope.ad.n0.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // xyz.adscope.ad.n3
        public void a(android.view.View r2, xyz.adscope.ad.n3.a r3) {
                r1 = this;
                xyz.adscope.ad.n0 r0 = r1.a
                xyz.adscope.ad.w4 r0 = xyz.adscope.ad.n0.e(r0)
                if (r0 == 0) goto L11
                xyz.adscope.ad.n0 r0 = r1.a
                xyz.adscope.ad.w4 r0 = xyz.adscope.ad.n0.e(r0)
                r0.e()
            L11:
                xyz.adscope.ad.n0 r0 = r1.a
                xyz.adscope.ad.b1 r0 = r0.d
                int r3 = r3.getEventCode()
                r0.b(r3)
                boolean r3 = r2 instanceof xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a
                if (r3 == 0) goto L23
                xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r2 = (xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a) r2
                goto L37
            L23:
                if (r2 == 0) goto L36
                xyz.adscope.ad.n0 r3 = r1.a
                android.content.Context r3 = r3.a
                java.lang.String r0 = "scope_root_container"
                int r3 = xyz.adscope.common.v2.dev.info.ResIdentify.getIDIdentify(r3, r0)
                java.lang.Object r2 = r2.getTag(r3)
                xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r2 = (xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a) r2
                goto L37
            L36:
                r2 = 0
            L37:
                if (r2 == 0) goto L42
                xyz.adscope.ad.i4 r3 = xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a.c.c(r2)
                if (r3 == 0) goto L42
                r3.a(r2)
            L42:
                return
        }

        @Override // xyz.adscope.ad.m2
        public /* bridge */ /* synthetic */ void a(xyz.adscope.ad.m3 r1) {
                r0 = this;
                xyz.adscope.ad.m3 r1 = (xyz.adscope.ad.m3) r1
                r0.a2(r1)
                return
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        public void a2(xyz.adscope.ad.m3 r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected class f implements xyz.adscope.ad.h4 {
        final /* synthetic */ xyz.adscope.ad.n0 a;

        protected f(xyz.adscope.ad.n0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        public void a2(xyz.adscope.ad.g4 r1) {
                r0 = this;
                return
        }

        @Override // xyz.adscope.ad.m2
        public /* bridge */ /* synthetic */ void a(xyz.adscope.ad.g4 r1) {
                r0 = this;
                xyz.adscope.ad.g4 r1 = (xyz.adscope.ad.g4) r1
                r0.a2(r1)
                return
        }

        @Override // xyz.adscope.ad.h4
        public void a(xyz.adscope.ad.l2 r1, int r2) {
                r0 = this;
                return
        }

        @Override // xyz.adscope.ad.h4
        public void d(xyz.adscope.ad.l2 r1) {
                r0 = this;
                xyz.adscope.ad.n0 r1 = r0.a
                xyz.adscope.ad.f4 r1 = xyz.adscope.ad.n0.f(r1)
                if (r1 == 0) goto L11
                xyz.adscope.ad.n0 r1 = r0.a
                xyz.adscope.ad.f4 r1 = xyz.adscope.ad.n0.f(r1)
                r1.onVideoPlay()
            L11:
                return
        }

        @Override // xyz.adscope.ad.h4
        public void e(xyz.adscope.ad.l2 r1) {
                r0 = this;
                xyz.adscope.ad.n0 r1 = r0.a
                xyz.adscope.ad.f4 r1 = xyz.adscope.ad.n0.f(r1)
                if (r1 == 0) goto L11
                xyz.adscope.ad.n0 r1 = r0.a
                xyz.adscope.ad.f4 r1 = xyz.adscope.ad.n0.f(r1)
                r1.onVideoPlayCompleted()
            L11:
                return
        }

        @Override // xyz.adscope.ad.h4
        public void f(xyz.adscope.ad.l2 r1) {
                r0 = this;
                xyz.adscope.ad.n0 r1 = r0.a
                xyz.adscope.ad.f4 r1 = xyz.adscope.ad.n0.f(r1)
                if (r1 == 0) goto L11
                xyz.adscope.ad.n0 r1 = r0.a
                xyz.adscope.ad.f4 r1 = xyz.adscope.ad.n0.f(r1)
                r1.onVideoPlayFailed()
            L11:
                return
        }
    }

    protected n0(android.content.Context r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r2, xyz.adscope.ad.a2 r3, xyz.adscope.ad.b1 r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            xyz.adscope.ad.n0$e r3 = new xyz.adscope.ad.n0$e
            r4 = 0
            r3.<init>(r0, r4)
            r0.e = r3
            xyz.adscope.ad.n0$b r3 = new xyz.adscope.ad.n0$b
            r3.<init>(r0, r4)
            r0.f = r3
            xyz.adscope.ad.n0$c r3 = new xyz.adscope.ad.n0$c
            r3.<init>(r0, r4)
            r0.i = r3
            xyz.adscope.ad.l r3 = xyz.adscope.ad.l.a()
            java.lang.Object r3 = r3.getOrCreateImplement(r1)
            xyz.adscope.ad.s1 r3 = (xyz.adscope.ad.s1) r3
            r0.g = r3
            xyz.adscope.ad.k0 r3 = xyz.adscope.ad.k0.a()
            java.lang.Object r3 = r3.getOrCreateImplement(r1)
            xyz.adscope.ad.j0 r3 = (xyz.adscope.ad.j0) r3
            r0.h = r3
            r0.e(r2)
            r0.d(r2)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r3 = r0.b(r2)
            r0.a(r1, r3)
            xyz.adscope.common.v2.beta.BetaTestManager r3 = xyz.adscope.common.v2.beta.BetaTestManager.getInstance()
            java.lang.Object r1 = r3.getOrCreateImplement(r1)
            xyz.adscope.common.v2.beta.IBetaTest r1 = (xyz.adscope.common.v2.beta.IBetaTest) r1
            r0.r = r1
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r1 = r0.b(r2)
            r0.a(r1)
            return
    }

    private xyz.adscope.ad.i4 a(android.view.View r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L1e
            boolean r1 = r4 instanceof xyz.adscope.ad.b4
            if (r1 == 0) goto Lf
            r1 = r4
            xyz.adscope.ad.b4 r1 = (xyz.adscope.ad.b4) r1
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r1 = r1.getExpressRoot()
            goto L10
        Lf:
            r1 = r0
        L10:
            boolean r2 = r4 instanceof xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a
            if (r2 == 0) goto L17
            r1 = r4
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r1 = (xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a) r1
        L17:
            if (r1 == 0) goto L1e
            xyz.adscope.ad.i4 r4 = xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a.c.c(r1)
            return r4
        L1e:
            return r0
    }

    static /* synthetic */ xyz.adscope.ad.i4 a(xyz.adscope.ad.n0 r0, android.view.View r1) {
            xyz.adscope.ad.i4 r0 = r0.a(r1)
            return r0
    }

    static /* synthetic */ xyz.adscope.ad.j0 a(xyz.adscope.ad.n0 r0) {
            xyz.adscope.ad.j0 r0 = r0.h
            return r0
    }

    static /* synthetic */ xyz.adscope.ad.z2 a(xyz.adscope.ad.n0 r0, xyz.adscope.ad.z2 r1) {
            r0.p = r1
            return r1
    }

    private void a(android.content.Context r3, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r4) {
            r2 = this;
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            java.lang.Object r0 = r0.getOrCreateImplement(r3)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r0
            xyz.adscope.ad.n0$a r1 = new xyz.adscope.ad.n0$a
            r1.<init>(r2, r3, r4)
            r0.executeBasicAsyncTask(r1)
            return
    }

    private void a(java.lang.String r3, xyz.adscope.ad.h1 r4) {
            r2 = this;
            java.util.Map r4 = r4.getMacrosReplaceMap()
            java.lang.String r3 = xyz.adscope.common.v2.tool.str.RegexUtil.replaceMacros(r3, r4)
            xyz.adscope.ad.v5 r4 = new xyz.adscope.ad.v5
            android.content.Context r0 = r2.a
            r1 = 1
            r4.<init>(r0, r1)
            r0 = 0
            r4.requestWithGetMethod(r3, r0)
            return
    }

    private void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r6) {
            r5 = this;
            if (r6 == 0) goto L40
            java.util.List r6 = r6.d()
            if (r6 == 0) goto L40
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L40
            r0 = 0
            java.lang.Object r6 = r6.get(r0)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.OptimizeModel r6 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.OptimizeModel) r6
            xyz.adscope.common.v2.beta.IBetaTest r1 = r5.r
            if (r1 == 0) goto L28
            java.lang.String r2 = xyz.adscope.ad.f0.e()
            java.lang.String r3 = "4dcfae5406670c0ebd29c13c287229d7"
            r4 = 8
            boolean r1 = r1.invokeBetaTest(r3, r2, r4)
            if (r1 == 0) goto L28
            r0 = 1
        L28:
            if (r6 == 0) goto L40
            if (r0 == 0) goto L40
            xyz.adscope.ad.w4 r0 = new xyz.adscope.ad.w4
            android.content.Context r1 = r5.a
            xyz.adscope.ad.a2 r2 = r5.c
            java.lang.String r2 = r2.getApiKey()
            r0.<init>(r1, r2, r6)
            r5.q = r0
            xyz.adscope.ad.n3 r6 = r5.e
            r0.a(r6)
        L40:
            return
    }

    static /* synthetic */ xyz.adscope.ad.v1 b(xyz.adscope.ad.n0 r0) {
            xyz.adscope.ad.v1 r0 = r0.n
            return r0
    }

    private boolean b() {
            r2 = this;
            xyz.adscope.ad.f r0 = xyz.adscope.ad.f.a()
            android.content.Context r1 = r2.a
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.ad.e r0 = (xyz.adscope.ad.e) r0
            if (r0 == 0) goto L19
            xyz.adscope.ad.publish.ASNPInitConfig r0 = r0.a()
            if (r0 == 0) goto L19
            boolean r0 = r0.isSupportSensor()
            return r0
        L19:
            r0 = 1
            return r0
    }

    static /* synthetic */ xyz.adscope.ad.k3 c(xyz.adscope.ad.n0 r0) {
            xyz.adscope.ad.k3 r0 = r0.k
            return r0
    }

    static /* synthetic */ xyz.adscope.ad.t3 d(xyz.adscope.ad.n0 r0) {
            xyz.adscope.ad.t3 r0 = r0.m
            return r0
    }

    private void d(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r3) {
            r2 = this;
            xyz.adscope.ad.z r0 = xyz.adscope.ad.z.a()
            android.content.Context r1 = r2.a
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.ad.u1 r0 = (xyz.adscope.ad.u1) r0
            r2.o = r0
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r3 = r2.a(r3)
            r0.a(r3)
            return
    }

    static /* synthetic */ xyz.adscope.ad.w4 e(xyz.adscope.ad.n0 r0) {
            xyz.adscope.ad.w4 r0 = r0.q
            return r0
    }

    private void e(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r3) {
            r2 = this;
            xyz.adscope.ad.c0 r0 = xyz.adscope.ad.c0.a()
            android.content.Context r1 = r2.a
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.ad.v1 r0 = (xyz.adscope.ad.v1) r0
            r2.n = r0
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r3 = r2.a(r3)
            r0.a(r3)
            return
    }

    static /* synthetic */ xyz.adscope.ad.f4 f(xyz.adscope.ad.n0 r0) {
            xyz.adscope.ad.f4 r0 = r0.l
            return r0
    }

    static /* synthetic */ xyz.adscope.ad.x2 g(xyz.adscope.ad.n0 r0) {
            xyz.adscope.ad.x2 r0 = r0.j
            return r0
    }

    static /* synthetic */ xyz.adscope.ad.z2 h(xyz.adscope.ad.n0 r0) {
            xyz.adscope.ad.z2 r0 = r0.p
            return r0
    }

    static /* synthetic */ xyz.adscope.ad.u1 i(xyz.adscope.ad.n0 r0) {
            xyz.adscope.ad.u1 r0 = r0.o
            return r0
    }

    protected xyz.adscope.ad.i3 a(java.lang.Object r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            android.content.Context r0 = r3.a
            xyz.adscope.ad.a2 r1 = r3.c
            java.lang.String r1 = r1.getApiKey()
            boolean r2 = r3.b()
            xyz.adscope.ad.i3 r5 = xyz.adscope.ad.o4.a(r0, r1, r5, r2)
            if (r5 == 0) goto L5f
            xyz.adscope.ad.a2 r0 = r3.c
            xyz.adscope.ad.c r0 = r0.getAdType()
            r5.a(r4, r0)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r0 = r3.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r0 = r3.b(r0)
            if (r0 == 0) goto L5f
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.link.LinkModel r1 = r0.c()
            if (r1 == 0) goto L32
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.link.LinkModel r0 = r0.c()
            int r0 = r0.c()
            goto L33
        L32:
            r0 = -1
        L33:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r1 = r3.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r1 = r3.a(r1)
            xyz.adscope.ad.w2 r6 = r3.a(r6, r0, r1)
            xyz.adscope.ad.w4 r0 = r3.q
            if (r0 == 0) goto L44
            r0.a(r6, r4)
        L44:
            if (r6 == 0) goto L5f
            r5.a(r6)
            boolean r4 = r5 instanceof xyz.adscope.ad.k2
            if (r4 == 0) goto L5f
            r4 = r5
            xyz.adscope.ad.k2 r4 = (xyz.adscope.ad.k2) r4
            xyz.adscope.ad.j2 r6 = r4.c()
            if (r6 == 0) goto L5f
            xyz.adscope.ad.j2 r4 = r4.c()
            xyz.adscope.ad.n3 r6 = r3.e
            r4.a(r6)
        L5f:
            return r5
    }

    protected xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r2) {
            r1 = this;
            if (r2 == 0) goto L17
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.MediaModel r0 = r2.d()
            if (r0 == 0) goto L17
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.MediaModel r2 = r2.d()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.AdModel r2 = r2.a()
            if (r2 == 0) goto L17
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r2 = r2.b()
            return r2
        L17:
            r2 = 0
            return r2
    }

    protected xyz.adscope.ad.w2 a(java.lang.String r2, int r3, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r4) {
            r1 = this;
            xyz.adscope.ad.w2 r2 = xyz.adscope.ad.s0.a(r2, r3)
            if (r2 == 0) goto L23
            android.content.Context r3 = r1.a
            xyz.adscope.ad.a2 r0 = r1.c
            java.lang.String r0 = r0.getApiKey()
            r2.a(r3, r0, r4)
            boolean r3 = r2 instanceof xyz.adscope.ad.k2
            if (r3 == 0) goto L23
            r3 = r2
            xyz.adscope.ad.k2 r3 = (xyz.adscope.ad.k2) r3
            xyz.adscope.ad.j2 r3 = r3.c()
            if (r3 == 0) goto L23
            xyz.adscope.ad.y1 r4 = r1.f
            r3.a(r4)
        L23:
            return r2
    }

    public void a(java.util.Map<java.lang.String, java.lang.String> r9) {
            r8 = this;
            if (r9 == 0) goto L75
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r0 = r8.b
            java.lang.String r0 = r0.c()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L75
            java.lang.String r1 = "winPrice"
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r1 = "lossReason"
            java.lang.Object r1 = r9.get(r1)
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r1 = "secHighPrice"
            java.lang.Object r1 = r9.get(r1)
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r1 = "adnId"
            java.lang.Object r1 = r9.get(r1)
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r1 = "expectPrice"
            java.lang.Object r9 = r9.get(r1)
            r7 = r9
            java.lang.String r7 = (java.lang.String) r7
            xyz.adscope.ad.h1 r2 = new xyz.adscope.ad.h1
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "上报竞价结果... 竞价失败 竞成价格:"
            r9.append(r1)
            r9.append(r3)
            java.lang.String r1 = " 原因: "
            r9.append(r1)
            r9.append(r5)
            java.lang.String r1 = " adn "
            r9.append(r1)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            java.lang.String r1 = "NativeImpl"
            xyz.adscope.common.v2.log.SDKLog.i(r1, r9)
            xyz.adscope.ad.b1 r9 = r8.d
            r9.d(r3)
            xyz.adscope.ad.b1 r9 = r8.d
            java.lang.String r1 = "0"
            r9.a(r1)
            r8.a(r0, r2)
        L75:
            return
    }

    @Override // xyz.adscope.ad.r2
    public void a(xyz.adscope.ad.f4 r1) {
            r0 = this;
            r0.l = r1
            return
    }

    @Override // xyz.adscope.ad.r2
    public void a(xyz.adscope.ad.k3 r1) {
            r0 = this;
            r0.k = r1
            return
    }

    @Override // xyz.adscope.ad.r2
    public void a(xyz.adscope.ad.t3 r1) {
            r0 = this;
            r0.m = r1
            return
    }

    @Override // xyz.adscope.ad.r2
    public void a(xyz.adscope.ad.x2 r1) {
            r0 = this;
            r0.j = r1
            return
    }

    protected xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel b(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r2) {
            r1 = this;
            if (r2 == 0) goto L29
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.MediaModel r0 = r2.d()
            if (r0 == 0) goto L29
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.MediaModel r2 = r2.d()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.AdModel r0 = r2.a()
            if (r0 == 0) goto L29
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.AdModel r0 = r2.a()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r0 = r0.b()
            if (r0 == 0) goto L29
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.AdModel r2 = r2.a()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r2 = r2.b()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r2 = r2.d()
            return r2
        L29:
            r2 = 0
            return r2
    }

    public void b(java.util.Map<java.lang.String, java.lang.String> r9) {
            r8 = this;
            if (r9 == 0) goto L6e
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r0 = r8.b
            java.lang.String r0 = r0.f()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "winPrice"
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r1 = "secHighPrice"
            java.lang.Object r1 = r9.get(r1)
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r1 = "adnId"
            java.lang.Object r1 = r9.get(r1)
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r1 = "expectPrice"
            java.lang.Object r9 = r9.get(r1)
            r7 = r9
            java.lang.String r7 = (java.lang.String) r7
            xyz.adscope.ad.h1 r2 = new xyz.adscope.ad.h1
            java.lang.String r5 = ""
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "上报竞价结果... 竞价成功 竞成价格:"
            r9.append(r1)
            r9.append(r3)
            java.lang.String r1 = " 次高价: "
            r9.append(r1)
            r9.append(r4)
            java.lang.String r1 = " adn "
            r9.append(r1)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            java.lang.String r1 = "NativeImpl"
            xyz.adscope.common.v2.log.SDKLog.i(r1, r9)
            xyz.adscope.ad.b1 r9 = r8.d
            r9.d(r3)
            xyz.adscope.ad.b1 r9 = r8.d
            java.lang.String r1 = "1"
            r9.a(r1)
            r8.a(r0, r2)
        L6e:
            return
    }

    public int c() {
            r2 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r0 = r2.b
            double r0 = r0.e()
            int r0 = (int) r0
            return r0
    }

    protected xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel c(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r2) {
            r1 = this;
            if (r2 == 0) goto L21
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.MediaModel r0 = r2.d()
            if (r0 == 0) goto L21
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.MediaModel r2 = r2.d()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.AdModel r2 = r2.a()
            if (r2 == 0) goto L21
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r0 = r2.b()
            if (r0 == 0) goto L21
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r2 = r2.b()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel r2 = r2.e()
            return r2
        L21:
            r2 = 0
            return r2
    }

    protected xyz.adscope.ad.n0.d d() {
            r1 = this;
            xyz.adscope.ad.n0$d r0 = new xyz.adscope.ad.n0$d
            r0.<init>(r1)
            return r0
    }

    @Override // xyz.adscope.ad.r2
    public void destroyAd() {
            r0 = this;
            return
    }

    protected xyz.adscope.ad.n0.f e() {
            r1 = this;
            xyz.adscope.ad.n0$f r0 = new xyz.adscope.ad.n0$f
            r0.<init>(r1)
            return r0
    }

    @Override // xyz.adscope.ad.r2
    public xyz.adscope.ad.publish.ad.IBidding getBidding() {
            r1 = this;
            xyz.adscope.ad.n0$c r0 = r1.i
            return r0
    }
}
