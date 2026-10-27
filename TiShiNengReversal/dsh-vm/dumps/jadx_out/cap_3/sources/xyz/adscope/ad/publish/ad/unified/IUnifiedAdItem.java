package xyz.adscope.ad.publish.ad.unified;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IUnifiedAdItem extends xyz.adscope.ad.ad.nativead.basic.IBasicNativeAdItem {
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
