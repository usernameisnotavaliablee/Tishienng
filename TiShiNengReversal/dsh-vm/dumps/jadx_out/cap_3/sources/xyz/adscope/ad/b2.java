package xyz.adscope.ad;

import xyz.adscope.ad.a2;
import xyz.adscope.ad.d2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class b2<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.d2> {
    protected final xyz.adscope.ad.c a;
    protected android.content.Context b;
    protected C c;
    protected boolean d;
    protected xyz.adscope.ad.a e;
    private final xyz.adscope.ad.b2<C, L>.c f;
    private final xyz.adscope.ad.v6 g;
    private final xyz.adscope.ad.u6 h;
    private final xyz.adscope.ad.w6 i;
    private xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel j;
    private final xyz.adscope.ad.e2 k;
    private boolean l;
    private java.lang.String m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare<xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel, java.lang.String> {
        final /* synthetic */ xyz.adscope.ad.b2 a;

        a(xyz.adscope.ad.b2 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public boolean a(xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel r2, java.lang.String r3) {
                r1 = this;
                if (r2 == 0) goto L14
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 != 0) goto L14
                java.lang.String r2 = r2.d()
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L14
                r2 = 1
                return r2
            L14:
                r2 = 0
                return r2
        }

        @Override // xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare
        public /* bridge */ /* synthetic */ boolean fetch(xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel r1, java.lang.String r2) {
                r0 = this;
                xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel r1 = (xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel) r1
                java.lang.String r2 = (java.lang.String) r2
                boolean r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b {
        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        public static xyz.adscope.ad.b2 a(xyz.adscope.ad.c r1, android.content.Context r2, xyz.adscope.ad.a2 r3) {
                xyz.adscope.ad.c r0 = xyz.adscope.ad.c.d
                if (r1 != r0) goto La
                xyz.adscope.ad.u4 r0 = new xyz.adscope.ad.u4
                r0.<init>(r2, r3, r1)
                return r0
            La:
                xyz.adscope.ad.c r0 = xyz.adscope.ad.c.e
                if (r1 != r0) goto L14
                xyz.adscope.ad.c7 r0 = new xyz.adscope.ad.c7
                r0.<init>(r2, r3, r1)
                return r0
            L14:
                xyz.adscope.ad.l1 r0 = new xyz.adscope.ad.l1
                r0.<init>(r2, r3, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements xyz.adscope.ad.e3 {
        private L a;
        final /* synthetic */ xyz.adscope.ad.b2 b;

        private c(xyz.adscope.ad.b2 r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                return
        }

        /* synthetic */ c(xyz.adscope.ad.b2 r1, xyz.adscope.ad.b2.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ xyz.adscope.ad.d2 a(xyz.adscope.ad.b2.c r0) {
                L extends xyz.adscope.ad.d2 r0 = r0.a
                return r0
        }

        static /* synthetic */ void a(xyz.adscope.ad.b2.c r0, xyz.adscope.ad.d2 r1) {
                r0.a(r1)
                return
        }

        private void a(L r1) {
                r0 = this;
                r0.a = r1
                return
        }

        @Override // xyz.adscope.ad.e3
        public void a(xyz.adscope.ad.y0 r3) {
                r2 = this;
                xyz.adscope.ad.y0 r0 = xyz.adscope.ad.y0.k
                if (r3 == r0) goto La
                xyz.adscope.ad.b2 r0 = r2.b
                r1 = 0
                xyz.adscope.ad.b2.a(r0, r1)
            La:
                L extends xyz.adscope.ad.d2 r0 = r2.a
                if (r0 == 0) goto L19
                int r1 = r3.b()
                java.lang.String r3 = r3.c()
                r0.onAdLoadFailed(r1, r3)
            L19:
                return
        }

        @Override // xyz.adscope.ad.e3
        public void onAdLoaded(java.util.List<xyz.adscope.ad.s3> r3) {
                r2 = this;
                xyz.adscope.ad.b2 r0 = r2.b
                r1 = 0
                xyz.adscope.ad.b2.a(r0, r1)
                xyz.adscope.ad.b2 r0 = r2.b
                r0.a(r3)
                return
        }
    }

    b2(android.content.Context r4, C r5, xyz.adscope.ad.c r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.d = r0
            r3.c = r5
            r3.a = r6
            r3.b = r4
            xyz.adscope.ad.v6 r0 = new xyz.adscope.ad.v6
            java.lang.String r1 = r5.getApiKey()
            java.lang.String r2 = r5.getSpaceID()
            r0.<init>(r4, r1, r2)
            r3.g = r0
            xyz.adscope.ad.u6 r0 = new xyz.adscope.ad.u6
            r0.<init>()
            r3.h = r0
            xyz.adscope.ad.w6 r1 = new xyz.adscope.ad.w6
            java.lang.String r5 = r5.getApiKey()
            r1.<init>(r4, r5)
            r3.i = r1
            C extends xyz.adscope.ad.a2 r4 = r3.c
            long r4 = r4.getTimeoutMillion()
            r0.a(r4)
            xyz.adscope.ad.b r4 = xyz.adscope.ad.b.a()
            android.content.Context r5 = r3.b
            java.lang.Object r4 = r4.getOrCreateImplement(r5)
            xyz.adscope.ad.a r4 = (xyz.adscope.ad.a) r4
            r3.e = r4
            xyz.adscope.ad.d4 r4 = new xyz.adscope.ad.d4
            android.content.Context r5 = r3.b
            r4.<init>(r5, r6)
            r3.k = r4
            xyz.adscope.ad.b2$c r4 = new xyz.adscope.ad.b2$c
            r5 = 0
            r4.<init>(r3, r5)
            r3.f = r4
            return
    }

    private xyz.adscope.ad.b1 a(xyz.adscope.ad.a2 r4) {
            r3 = this;
            xyz.adscope.ad.b1 r0 = new xyz.adscope.ad.b1
            r0.<init>(r4)
            xyz.adscope.ad.r5 r1 = r4.getS2SAdImpl()
            if (r1 == 0) goto L2e
            android.content.Context r2 = r3.b
            r1.a(r2)
            java.lang.String r2 = r1.c()
            java.lang.String r1 = r1.a()
            java.lang.String r4 = r4.getSpaceID()
            boolean r4 = r1.equals(r4)
            r1 = 0
            if (r4 == 0) goto L2d
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L2d
            r0.e(r2)
            return r0
        L2d:
            return r1
        L2e:
            return r0
    }

    private xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel a(java.lang.String r3) {
            r2 = this;
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r0 = r2.j
            if (r0 == 0) goto L1c
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L1c
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r0 = r2.j
            java.util.List r0 = r0.e()
            xyz.adscope.ad.b2$a r1 = new xyz.adscope.ad.b2$a
            r1.<init>(r2)
            java.lang.Object r3 = xyz.adscope.common.v2.tool.collection.CollectionFetch.fetchFirstFromList(r0, r3, r1)
            xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel r3 = (xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel) r3
            return r3
        L1c:
            r3 = 0
            return r3
    }

    private void a(xyz.adscope.ad.publish.ASNPInitConfig r3) {
            r2 = this;
            if (r3 == 0) goto L23
            boolean r0 = r3.canUseOAIDInfo()
            if (r0 == 0) goto L18
            java.lang.String r0 = "IBaseAdController"
            java.lang.String r1 = "允许使用个性化推荐, 初始化OAID..."
            xyz.adscope.common.v2.log.SDKLog.d(r0, r1)
            xyz.adscope.common.v2.dev.oaid.OAIDHelper r0 = xyz.adscope.common.v2.dev.oaid.OAIDHelper.getInstance()
            android.content.Context r1 = r2.b
            r0.initOAID(r1)
        L18:
            xyz.adscope.common.v2.dev.oaid.OAIDHelper r0 = xyz.adscope.common.v2.dev.oaid.OAIDHelper.getInstance()
            boolean r3 = r3.canUseOAIDInfo()
            r0.setPersonalRecommend(r3)
        L23:
            return
    }

    private void a(xyz.adscope.ad.publish.ASNPInitConfig r4, xyz.adscope.ad.b1 r5) {
            r3 = this;
            xyz.adscope.ad.e2 r0 = r3.k
            if (r0 == 0) goto L14
            C extends xyz.adscope.ad.a2 r1 = r3.c
            if (r1 == 0) goto L14
            r2 = 0
            r3.d = r2
            r2 = 1
            r3.l = r2
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r2 = r3.j
            r0.a(r4, r2, r1, r5)
            return
        L14:
            java.lang.String r4 = "IBaseAdController"
            java.lang.String r5 = "unexpected error iAdRouter or mAdConfig is null..."
            xyz.adscope.common.v2.log.SDKLog.e(r4, r5)
            xyz.adscope.ad.y0 r4 = xyz.adscope.ad.y0.s
            r3.a(r4)
            return
    }

    private void a(xyz.adscope.ad.y0 r2) {
            r1 = this;
            xyz.adscope.ad.b2<C, L>$c r0 = r1.f
            if (r0 == 0) goto L7
            r0.a(r2)
        L7:
            return
    }

    private boolean a() {
            r3 = this;
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r0 = r3.j
            r1 = 0
            if (r0 == 0) goto L23
            C extends xyz.adscope.ad.a2 r0 = r3.c
            java.lang.String r0 = r0.getSpaceID()
            xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel r0 = r3.a(r0)
            xyz.adscope.ad.v6 r2 = r3.g
            boolean r2 = r2.a(r0)
            if (r2 != 0) goto L21
            xyz.adscope.ad.u6 r2 = r3.h
            boolean r0 = r2.a(r0)
            if (r0 == 0) goto L20
            goto L21
        L20:
            return r1
        L21:
            r0 = 1
            return r0
        L23:
            return r1
    }

    static /* synthetic */ boolean a(xyz.adscope.ad.b2 r0, boolean r1) {
            r0.l = r1
            return r1
    }

    private boolean e() {
            r3 = this;
            android.content.Context r0 = r3.b
            C extends xyz.adscope.ad.a2 r1 = r3.c
            java.lang.String r2 = r1.getSpaceID()
            xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel r2 = r3.a(r2)
            boolean r0 = xyz.adscope.ad.i1.a(r0, r1, r2)
            return r0
    }

    private boolean g() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r0 = r1.j
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    protected void a(long r2) {
            r1 = this;
            xyz.adscope.ad.w6 r0 = r1.i
            if (r0 == 0) goto L7
            r0.a(r2)
        L7:
            return
    }

    protected abstract void a(java.util.List<xyz.adscope.ad.s3> r1);

    public void a(L r2) {
            r1 = this;
            xyz.adscope.ad.b2<C, L>$c r0 = r1.f
            xyz.adscope.ad.b2.c.a(r0, r2)
            xyz.adscope.ad.e2 r2 = r1.k
            if (r2 == 0) goto Le
            xyz.adscope.ad.b2<C, L>$c r0 = r1.f
            r2.a(r0)
        Le:
            return
    }

    protected boolean b() {
            r4 = this;
            double r0 = java.lang.Math.random()
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r2
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r2
            long r0 = (long) r0
            xyz.adscope.ad.c r2 = r4.a
            xyz.adscope.ad.c r3 = xyz.adscope.ad.c.f
            if (r2 != r3) goto L2c
            xyz.adscope.ad.w6 r2 = r4.i
            if (r2 == 0) goto L2c
            r2.b(r0)
            C extends xyz.adscope.ad.a2 r0 = r4.c
            java.lang.String r0 = r0.getSpaceID()
            xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel r0 = r4.a(r0)
            if (r0 == 0) goto L2c
            xyz.adscope.ad.w6 r1 = r4.i
            boolean r0 = r1.a(r0)
            return r0
        L2c:
            r0 = 0
            return r0
    }

    protected L c() {
            r1 = this;
            xyz.adscope.ad.b2<C, L>$c r0 = r1.f
            xyz.adscope.ad.d2 r0 = xyz.adscope.ad.b2.c.a(r0)
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.m
            return r0
    }

    public boolean f() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    public void h() {
            r4 = this;
            xyz.adscope.ad.f r0 = xyz.adscope.ad.f.a()
            android.content.Context r1 = r4.b
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.ad.e r0 = (xyz.adscope.ad.e) r0
            if (r0 == 0) goto L13
            xyz.adscope.ad.publish.ASNPInitConfig r1 = r0.a()
            goto L14
        L13:
            r1 = 0
        L14:
            r4.a(r1)
            C extends xyz.adscope.ad.a2 r1 = r4.c
            if (r1 != 0) goto L21
            xyz.adscope.ad.y0 r0 = xyz.adscope.ad.y0.j
            r4.a(r0)
            return
        L21:
            java.lang.String r1 = r1.getSpaceID()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L31
            xyz.adscope.ad.y0 r0 = xyz.adscope.ad.y0.o
            r4.a(r0)
            return
        L31:
            boolean r1 = r4.l
            if (r1 == 0) goto L3b
            xyz.adscope.ad.y0 r0 = xyz.adscope.ad.y0.k
            r4.a(r0)
            return
        L3b:
            java.lang.String r1 = "IBaseAdController"
            if (r0 == 0) goto Lb9
            r2 = 1
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r2 = r0.a(r2)
            r4.j = r2
            if (r2 != 0) goto L53
            java.lang.String r0 = "unexpected error config copy is null..."
            xyz.adscope.common.v2.log.SDKLog.e(r1, r0)
            xyz.adscope.ad.y0 r0 = xyz.adscope.ad.y0.e
            r4.a(r0)
            return
        L53:
            C extends xyz.adscope.ad.a2 r1 = r4.c
            xyz.adscope.ad.b1 r1 = r4.a(r1)
            if (r1 != 0) goto L61
            xyz.adscope.ad.y0 r0 = xyz.adscope.ad.y0.q
            r4.a(r0)
            return
        L61:
            java.lang.String r2 = r1.t()
            r4.m = r2
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r2 = r4.j
            java.lang.String r2 = r2.d()
            r1.c(r2)
            xyz.adscope.ad.l r2 = xyz.adscope.ad.l.a()
            android.content.Context r3 = r4.b
            java.lang.Object r2 = r2.getOrCreateImplement(r3)
            xyz.adscope.ad.s1 r2 = (xyz.adscope.ad.s1) r2
            xyz.adscope.ad.n1 r3 = xyz.adscope.ad.n1.e
            r2.a(r3, r1)
            boolean r2 = r4.g()
            if (r2 != 0) goto L8d
            xyz.adscope.ad.y0 r0 = xyz.adscope.ad.y0.e
            r4.a(r0)
            return
        L8d:
            boolean r2 = r4.a()
            if (r2 == 0) goto L99
            xyz.adscope.ad.y0 r0 = xyz.adscope.ad.y0.f
            r4.a(r0)
            return
        L99:
            boolean r2 = r4.e()
            if (r2 == 0) goto La5
            xyz.adscope.ad.y0 r0 = xyz.adscope.ad.y0.g
            r4.a(r0)
            return
        La5:
            boolean r2 = r4.b()
            if (r2 == 0) goto Lb1
            xyz.adscope.ad.y0 r0 = xyz.adscope.ad.y0.l
            r4.a(r0)
            return
        Lb1:
            xyz.adscope.ad.publish.ASNPInitConfig r0 = r0.a()
            r4.a(r0, r1)
            return
        Lb9:
            java.lang.String r0 = "unexpected error config cache is null..."
            xyz.adscope.common.v2.log.SDKLog.e(r1, r0)
            xyz.adscope.ad.y0 r0 = xyz.adscope.ad.y0.e
            r4.a(r0)
            return
    }
}
