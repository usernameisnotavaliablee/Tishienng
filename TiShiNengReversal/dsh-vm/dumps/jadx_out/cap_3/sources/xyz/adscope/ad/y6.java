package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class y6 extends xyz.adscope.ad.o0<xyz.adscope.ad.g3> implements xyz.adscope.ad.publish.ad.nativead.INativeAdItem {
    private final xyz.adscope.ad.y6.b b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b extends xyz.adscope.ad.o0.a implements xyz.adscope.ad.x3 {
        private xyz.adscope.ad.publish.ad.nativead.INativeRenderListener e;

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ b(xyz.adscope.ad.y6.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private void a(xyz.adscope.ad.publish.ad.nativead.INativeRenderListener r1) {
                r0 = this;
                r0.e = r1
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.y6.b r0, xyz.adscope.ad.publish.ad.nativead.INativeRenderListener r1) {
                r0.a(r1)
                return
        }

        @Override // xyz.adscope.ad.x3
        public void a(android.view.View r2) {
                r1 = this;
                xyz.adscope.ad.publish.ad.nativead.INativeRenderListener r0 = r1.e
                if (r0 == 0) goto L7
                r0.renderSuccess(r2)
            L7:
                return
        }

        @Override // xyz.adscope.ad.x3
        public void a(xyz.adscope.ad.k4 r1) {
                r0 = this;
                xyz.adscope.ad.publish.ad.nativead.INativeRenderListener r1 = r0.e
                if (r1 == 0) goto L7
                r1.renderFailed()
            L7:
                return
        }
    }

    public y6(xyz.adscope.ad.s3 r4) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r1 = r4.a()
            xyz.adscope.ad.a2 r2 = r4.b()
            xyz.adscope.ad.b1 r4 = r4.c()
            r3.<init>(r0, r1, r2, r4)
            xyz.adscope.ad.y6$b r4 = new xyz.adscope.ad.y6$b
            r0 = 0
            r4.<init>(r0)
            r3.b = r4
            return
    }

    @Override // xyz.adscope.ad.o0
    protected /* bridge */ /* synthetic */ xyz.adscope.ad.g3 a(android.content.Context r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r2, xyz.adscope.ad.a2 r3, xyz.adscope.ad.b1 r4) {
            r0 = this;
            xyz.adscope.ad.g3 r1 = r0.b(r1, r2, r3, r4)
            return r1
    }

    protected xyz.adscope.ad.g3 b(android.content.Context r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r2, xyz.adscope.ad.a2 r3, xyz.adscope.ad.b1 r4) {
            r0 = this;
            xyz.adscope.ad.g3 r1 = xyz.adscope.ad.g3.a.a(r1, r2, r3, r4)
            return r1
    }

    @Override // xyz.adscope.ad.publish.ad.nativead.INativeAdItem
    public android.view.View getExpressView() {
            r1 = this;
            T extends xyz.adscope.ad.r2 r0 = r1.a
            if (r0 == 0) goto Lb
            xyz.adscope.ad.g3 r0 = (xyz.adscope.ad.g3) r0
            android.view.View r0 = r0.getExpressView()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.ad.publish.ad.nativead.INativeAdItem
    public void renderAdView(xyz.adscope.ad.publish.ad.nativead.INativeRenderListener r2) {
            r1 = this;
            xyz.adscope.ad.y6$b r0 = r1.b
            xyz.adscope.ad.y6.b.a(r0, r2)
            T extends xyz.adscope.ad.r2 r2 = r1.a
            xyz.adscope.ad.g3 r2 = (xyz.adscope.ad.g3) r2
            xyz.adscope.ad.y6$b r0 = r1.b
            r2.a(r0)
            T extends xyz.adscope.ad.r2 r2 = r1.a
            xyz.adscope.ad.g3 r2 = (xyz.adscope.ad.g3) r2
            r2.a()
            return
    }

    @Override // xyz.adscope.ad.ad.nativead.basic.IBasicNativeAdItem
    public void setExpressListener(xyz.adscope.ad.publish.ad.nativead.INativeExpressListener r2) {
            r1 = this;
            xyz.adscope.ad.y6$b r0 = r1.b
            r0.a(r2)
            T extends xyz.adscope.ad.r2 r2 = r1.a
            xyz.adscope.ad.g3 r2 = (xyz.adscope.ad.g3) r2
            xyz.adscope.ad.y6$b r0 = r1.b
            r2.a(r0)
            return
    }

    @Override // xyz.adscope.ad.ad.nativead.basic.IBasicNativeAdItem
    public void setInteractiveListener(xyz.adscope.ad.publish.ad.nativead.INativeInteractiveListener r2) {
            r1 = this;
            xyz.adscope.ad.y6$b r0 = r1.b
            r0.a(r2)
            T extends xyz.adscope.ad.r2 r2 = r1.a
            xyz.adscope.ad.g3 r2 = (xyz.adscope.ad.g3) r2
            xyz.adscope.ad.y6$b r0 = r1.b
            r2.a(r0)
            return
    }

    @Override // xyz.adscope.ad.ad.nativead.basic.IBasicNativeAdItem
    public void setNegativeFeedbackListener(xyz.adscope.ad.publish.ad.nativead.INativeNegativeFeedbackListener r2) {
            r1 = this;
            xyz.adscope.ad.y6$b r0 = r1.b
            r0.a(r2)
            T extends xyz.adscope.ad.r2 r2 = r1.a
            xyz.adscope.ad.g3 r2 = (xyz.adscope.ad.g3) r2
            xyz.adscope.ad.y6$b r0 = r1.b
            r2.a(r0)
            return
    }

    @Override // xyz.adscope.ad.ad.nativead.basic.IBasicNativeAdItem
    public void setVideoPlayListener(xyz.adscope.ad.publish.ad.nativead.INativeVideoPlayListener r2) {
            r1 = this;
            xyz.adscope.ad.y6$b r0 = r1.b
            r0.a(r2)
            T extends xyz.adscope.ad.r2 r2 = r1.a
            xyz.adscope.ad.g3 r2 = (xyz.adscope.ad.g3) r2
            xyz.adscope.ad.y6$b r0 = r1.b
            r2.a(r0)
            return
    }
}
