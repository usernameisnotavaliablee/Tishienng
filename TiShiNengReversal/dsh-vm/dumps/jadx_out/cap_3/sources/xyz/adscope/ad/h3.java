package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface h3 extends xyz.adscope.ad.r2 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        public static xyz.adscope.ad.h3 a(android.content.Context r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r2, xyz.adscope.ad.a2 r3, xyz.adscope.ad.b1 r4) {
                xyz.adscope.ad.m4 r0 = new xyz.adscope.ad.m4
                r0.<init>(r1, r2, r3, r4)
                return r0
        }
    }

    void bindAdActionView(java.util.List<android.view.View> r1);

    void bindAdToMediaView(android.app.Activity r1, xyz.adscope.ad.publish.ad.unified.view.ASNPUnifiedMediaView r2);

    void bindAdToRootContainer(android.app.Activity r1, xyz.adscope.ad.publish.ad.unified.view.ASNPUnifiedExpressContainer r2, java.util.List<android.view.View> r3);

    void bindNegativeFeedbackView(android.view.View r1, java.lang.String[] r2);

    java.lang.String getActionButtonText();

    java.lang.String getAdLogoUrl();

    xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern getAdPattern();

    java.lang.String getDesc();

    xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo getDownloadInfo();

    java.lang.String getIconUrl();

    java.util.List<java.lang.String> getImagesUrl();

    java.lang.String getMainImageUrl();

    java.lang.String getTitle();

    boolean isDownloadAd();

    void setBindAdListener(xyz.adscope.ad.publish.ad.unified.IUnifiedAdBindListener r1);
}
