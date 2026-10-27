package xyz.adscope.ad;

import xyz.adscope.ad.r2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class o0<T extends xyz.adscope.ad.r2> implements xyz.adscope.ad.ad.nativead.basic.IBasicNativeAdItem {
    protected final T a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected static class a implements xyz.adscope.ad.f4, xyz.adscope.ad.k3, xyz.adscope.ad.t3 {
        private xyz.adscope.ad.publish.ad.nativead.INativeExpressListener a;
        private xyz.adscope.ad.publish.ad.nativead.INativeInteractiveListener b;
        private xyz.adscope.ad.publish.ad.nativead.INativeVideoPlayListener c;
        private xyz.adscope.ad.publish.ad.nativead.INativeNegativeFeedbackListener d;

        protected a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // xyz.adscope.ad.k3
        public void a() {
                r1 = this;
                xyz.adscope.ad.publish.ad.nativead.INativeInteractiveListener r0 = r1.b
                if (r0 == 0) goto L7
                r0.onAdClicked()
            L7:
                return
        }

        @Override // xyz.adscope.ad.t3
        public void a(java.lang.String r1) {
                r0 = this;
                xyz.adscope.ad.publish.ad.nativead.INativeExpressListener r1 = r0.a
                if (r1 == 0) goto L9
                xyz.adscope.ad.publish.ad.nativead.INativeNegativeFeedbackListener r1 = r0.d
                r1.onNegativeFeedback()
            L9:
                return
        }

        public void a(xyz.adscope.ad.publish.ad.nativead.INativeExpressListener r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public void a(xyz.adscope.ad.publish.ad.nativead.INativeInteractiveListener r1) {
                r0 = this;
                r0.b = r1
                return
        }

        public void a(xyz.adscope.ad.publish.ad.nativead.INativeNegativeFeedbackListener r1) {
                r0 = this;
                r0.d = r1
                return
        }

        public void a(xyz.adscope.ad.publish.ad.nativead.INativeVideoPlayListener r1) {
                r0 = this;
                r0.c = r1
                return
        }

        @Override // xyz.adscope.ad.x2
        public void onAdClosed() {
                r1 = this;
                xyz.adscope.ad.publish.ad.nativead.INativeExpressListener r0 = r1.a
                if (r0 == 0) goto L7
                r0.onAdClosed()
            L7:
                return
        }

        @Override // xyz.adscope.ad.x2
        public void onAdExposure() {
                r1 = this;
                xyz.adscope.ad.publish.ad.nativead.INativeExpressListener r0 = r1.a
                if (r0 == 0) goto L7
                r0.onAdExposure()
            L7:
                return
        }

        @Override // xyz.adscope.ad.x2
        public void onAdShown() {
                r1 = this;
                xyz.adscope.ad.publish.ad.nativead.INativeExpressListener r0 = r1.a
                if (r0 == 0) goto L7
                r0.onAdShown()
            L7:
                return
        }

        @Override // xyz.adscope.ad.f4
        public void onVideoPlay() {
                r1 = this;
                xyz.adscope.ad.publish.ad.nativead.INativeVideoPlayListener r0 = r1.c
                if (r0 == 0) goto L7
                r0.onVideoPlay()
            L7:
                return
        }

        @Override // xyz.adscope.ad.f4
        public void onVideoPlayCompleted() {
                r1 = this;
                xyz.adscope.ad.publish.ad.nativead.INativeVideoPlayListener r0 = r1.c
                if (r0 == 0) goto L7
                r0.onVideoPlayCompleted()
            L7:
                return
        }

        @Override // xyz.adscope.ad.f4
        public void onVideoPlayFailed() {
                r1 = this;
                xyz.adscope.ad.publish.ad.nativead.INativeVideoPlayListener r0 = r1.c
                if (r0 == 0) goto L7
                r0.onVideoPlayFailed()
            L7:
                return
        }
    }

    public o0(android.content.Context r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r2, xyz.adscope.ad.a2 r3, xyz.adscope.ad.b1 r4) {
            r0 = this;
            r0.<init>()
            xyz.adscope.ad.r2 r1 = r0.a(r1, r2, r3, r4)
            r0.a = r1
            return
    }

    protected abstract T a(android.content.Context r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r2, xyz.adscope.ad.a2 r3, xyz.adscope.ad.b1 r4);

    @Override // xyz.adscope.ad.ad.nativead.basic.IBasicNativeAdItem
    public void destroyAd() {
            r1 = this;
            T extends xyz.adscope.ad.r2 r0 = r1.a
            if (r0 == 0) goto L7
            r0.destroyAd()
        L7:
            return
    }

    @Override // xyz.adscope.ad.ad.nativead.basic.IBasicNativeAdItem
    public xyz.adscope.ad.publish.ad.IBidding getBidding() {
            r1 = this;
            T extends xyz.adscope.ad.r2 r0 = r1.a
            xyz.adscope.ad.publish.ad.IBidding r0 = r0.getBidding()
            return r0
    }
}
