package xyz.adscope.amps.ad.unified.inter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface AMPSUnifiedNativeItem {
    void bindAdToMediaView(android.app.Activity r1, xyz.adscope.amps.ad.unified.view.AMPSUnifiedMediaViewStub r2, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedVideoListener r3);

    void bindAdToRootContainer(android.app.Activity r1, xyz.adscope.amps.ad.unified.view.AMPSUnifiedRootContainer r2, java.util.List<android.view.View> r3, java.util.List<android.view.View> r4);

    void destroy();

    java.lang.String getActionButtonText();

    xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern getAdPattern();

    java.lang.String getAdSource();

    android.view.View getAdSourceLogo();

    java.lang.String getAdSourceLogoUrl();

    xyz.adscope.amps.ad.unified.inter.AMPSAppDetail getAppDetail();

    java.lang.String getDesc();

    int getECPM();

    java.util.Map<java.lang.String, java.lang.Object> getExtras();

    java.lang.String getIconUrl();

    int getImageHeight();

    int getImageWidth();

    java.util.List<java.lang.String> getImagesUrl();

    java.lang.String getMainImageUrl();

    xyz.adscope.amps.ad.unified.view.AMPSUnifiedView getMainImageView();

    java.util.List<xyz.adscope.amps.ad.unified.view.AMPSUnifiedView> getMainImageViews();

    android.view.View getNativeExpressAdView();

    xyz.adscope.amps.ad.unified.inter.AMPSUnifiedOptimizeController getOptimizeController();

    java.lang.String getTitle();

    boolean isExpressAd();

    boolean isValid();

    boolean isViewObject();

    void pause();

    void render();

    void resume();

    void setDownloadListener(xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r1);

    void setNativeAdEventListener(xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r1);

    void setNativeAdExpressListener(xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdExpressListener r1);

    void setNegativeFeedbackListener(xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNegativeFeedbackListener r1);
}
