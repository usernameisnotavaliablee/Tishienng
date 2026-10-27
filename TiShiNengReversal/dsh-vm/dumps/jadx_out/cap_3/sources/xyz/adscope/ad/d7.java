package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class d7 extends xyz.adscope.ad.o0<xyz.adscope.ad.h3> implements xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem {
    private final xyz.adscope.ad.d7.b b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b extends xyz.adscope.ad.o0.a {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ b(xyz.adscope.ad.d7.a r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public d7(xyz.adscope.ad.s3 r4) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r1 = r4.a()
            xyz.adscope.ad.a2 r2 = r4.b()
            xyz.adscope.ad.b1 r4 = r4.c()
            r3.<init>(r0, r1, r2, r4)
            xyz.adscope.ad.d7$b r4 = new xyz.adscope.ad.d7$b
            r0 = 0
            r4.<init>(r0)
            r3.b = r4
            return
    }

    @Override // xyz.adscope.ad.o0
    protected /* bridge */ /* synthetic */ xyz.adscope.ad.h3 a(android.content.Context r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r2, xyz.adscope.ad.a2 r3, xyz.adscope.ad.b1 r4) {
            r0 = this;
            xyz.adscope.ad.h3 r1 = r0.b(r1, r2, r3, r4)
            return r1
    }

    protected xyz.adscope.ad.h3 b(android.content.Context r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r2, xyz.adscope.ad.a2 r3, xyz.adscope.ad.b1 r4) {
            r0 = this;
            xyz.adscope.ad.h3 r1 = xyz.adscope.ad.h3.a.a(r1, r2, r3, r4)
            return r1
    }

    @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem
    public void bindAdActionView(java.util.List<android.view.View> r2) {
            r1 = this;
            T extends xyz.adscope.ad.r2 r0 = r1.a
            if (r0 == 0) goto L9
            xyz.adscope.ad.h3 r0 = (xyz.adscope.ad.h3) r0
            r0.bindAdActionView(r2)
        L9:
            return
    }

    @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem
    public void bindAdToMediaView(android.app.Activity r2, xyz.adscope.ad.publish.ad.unified.view.ASNPUnifiedMediaView r3) {
            r1 = this;
            T extends xyz.adscope.ad.r2 r0 = r1.a
            if (r0 == 0) goto L9
            xyz.adscope.ad.h3 r0 = (xyz.adscope.ad.h3) r0
            r0.bindAdToMediaView(r2, r3)
        L9:
            return
    }

    @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem
    public void bindAdToRootContainer(android.app.Activity r2, xyz.adscope.ad.publish.ad.unified.view.ASNPUnifiedExpressContainer r3, java.util.List<android.view.View> r4) {
            r1 = this;
            T extends xyz.adscope.ad.r2 r0 = r1.a
            if (r0 == 0) goto L9
            xyz.adscope.ad.h3 r0 = (xyz.adscope.ad.h3) r0
            r0.bindAdToRootContainer(r2, r3, r4)
        L9:
            return
    }

    @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem
    public void bindNegativeFeedbackView(android.view.View r2, java.lang.String[] r3) {
            r1 = this;
            T extends xyz.adscope.ad.r2 r0 = r1.a
            if (r0 == 0) goto L9
            xyz.adscope.ad.h3 r0 = (xyz.adscope.ad.h3) r0
            r0.bindNegativeFeedbackView(r2, r3)
        L9:
            return
    }

    @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem
    public java.lang.String getActionButtonText() {
            r1 = this;
            T extends xyz.adscope.ad.r2 r0 = r1.a
            if (r0 == 0) goto Lb
            xyz.adscope.ad.h3 r0 = (xyz.adscope.ad.h3) r0
            java.lang.String r0 = r0.getActionButtonText()
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem
    public java.lang.String getAdLogoUrl() {
            r1 = this;
            T extends xyz.adscope.ad.r2 r0 = r1.a
            if (r0 == 0) goto Lb
            xyz.adscope.ad.h3 r0 = (xyz.adscope.ad.h3) r0
            java.lang.String r0 = r0.getAdLogoUrl()
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem
    public xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern getAdPattern() {
            r1 = this;
            T extends xyz.adscope.ad.r2 r0 = r1.a
            if (r0 == 0) goto Lb
            xyz.adscope.ad.h3 r0 = (xyz.adscope.ad.h3) r0
            xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern r0 = r0.getAdPattern()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem
    public java.lang.String getDesc() {
            r1 = this;
            T extends xyz.adscope.ad.r2 r0 = r1.a
            if (r0 == 0) goto Lb
            xyz.adscope.ad.h3 r0 = (xyz.adscope.ad.h3) r0
            java.lang.String r0 = r0.getDesc()
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem
    public xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo getDownloadInfo() {
            r1 = this;
            T extends xyz.adscope.ad.r2 r0 = r1.a
            if (r0 == 0) goto Lb
            xyz.adscope.ad.h3 r0 = (xyz.adscope.ad.h3) r0
            xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo r0 = r0.getDownloadInfo()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem
    public java.lang.String getIconUrl() {
            r1 = this;
            T extends xyz.adscope.ad.r2 r0 = r1.a
            if (r0 == 0) goto Lb
            xyz.adscope.ad.h3 r0 = (xyz.adscope.ad.h3) r0
            java.lang.String r0 = r0.getIconUrl()
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem
    public java.util.List<java.lang.String> getImagesUrl() {
            r1 = this;
            T extends xyz.adscope.ad.r2 r0 = r1.a
            if (r0 == 0) goto Lb
            xyz.adscope.ad.h3 r0 = (xyz.adscope.ad.h3) r0
            java.util.List r0 = r0.getImagesUrl()
            return r0
        Lb:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem
    public java.lang.String getMainImageUrl() {
            r1 = this;
            T extends xyz.adscope.ad.r2 r0 = r1.a
            if (r0 == 0) goto Lb
            xyz.adscope.ad.h3 r0 = (xyz.adscope.ad.h3) r0
            java.lang.String r0 = r0.getMainImageUrl()
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem
    public java.lang.String getTitle() {
            r1 = this;
            T extends xyz.adscope.ad.r2 r0 = r1.a
            if (r0 == 0) goto Lb
            xyz.adscope.ad.h3 r0 = (xyz.adscope.ad.h3) r0
            java.lang.String r0 = r0.getTitle()
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem
    public boolean isDownloadAd() {
            r1 = this;
            T extends xyz.adscope.ad.r2 r0 = r1.a
            if (r0 == 0) goto Lb
            xyz.adscope.ad.h3 r0 = (xyz.adscope.ad.h3) r0
            boolean r0 = r0.isDownloadAd()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem
    public void setBindAdListener(xyz.adscope.ad.publish.ad.unified.IUnifiedAdBindListener r2) {
            r1 = this;
            T extends xyz.adscope.ad.r2 r0 = r1.a
            if (r0 == 0) goto L9
            xyz.adscope.ad.h3 r0 = (xyz.adscope.ad.h3) r0
            r0.setBindAdListener(r2)
        L9:
            return
    }

    @Override // xyz.adscope.ad.ad.nativead.basic.IBasicNativeAdItem
    public void setExpressListener(xyz.adscope.ad.publish.ad.nativead.INativeExpressListener r2) {
            r1 = this;
            xyz.adscope.ad.d7$b r0 = r1.b
            r0.a(r2)
            T extends xyz.adscope.ad.r2 r2 = r1.a
            xyz.adscope.ad.h3 r2 = (xyz.adscope.ad.h3) r2
            xyz.adscope.ad.d7$b r0 = r1.b
            r2.a(r0)
            return
    }

    @Override // xyz.adscope.ad.ad.nativead.basic.IBasicNativeAdItem
    public void setInteractiveListener(xyz.adscope.ad.publish.ad.nativead.INativeInteractiveListener r2) {
            r1 = this;
            xyz.adscope.ad.d7$b r0 = r1.b
            r0.a(r2)
            T extends xyz.adscope.ad.r2 r2 = r1.a
            xyz.adscope.ad.h3 r2 = (xyz.adscope.ad.h3) r2
            xyz.adscope.ad.d7$b r0 = r1.b
            r2.a(r0)
            return
    }

    @Override // xyz.adscope.ad.ad.nativead.basic.IBasicNativeAdItem
    public void setNegativeFeedbackListener(xyz.adscope.ad.publish.ad.nativead.INativeNegativeFeedbackListener r2) {
            r1 = this;
            xyz.adscope.ad.d7$b r0 = r1.b
            r0.a(r2)
            T extends xyz.adscope.ad.r2 r2 = r1.a
            xyz.adscope.ad.h3 r2 = (xyz.adscope.ad.h3) r2
            xyz.adscope.ad.d7$b r0 = r1.b
            r2.a(r0)
            return
    }

    @Override // xyz.adscope.ad.ad.nativead.basic.IBasicNativeAdItem
    public void setVideoPlayListener(xyz.adscope.ad.publish.ad.nativead.INativeVideoPlayListener r2) {
            r1 = this;
            xyz.adscope.ad.d7$b r0 = r1.b
            r0.a(r2)
            T extends xyz.adscope.ad.r2 r2 = r1.a
            xyz.adscope.ad.h3 r2 = (xyz.adscope.ad.h3) r2
            xyz.adscope.ad.d7$b r0 = r1.b
            r2.a(r0)
            return
    }
}
