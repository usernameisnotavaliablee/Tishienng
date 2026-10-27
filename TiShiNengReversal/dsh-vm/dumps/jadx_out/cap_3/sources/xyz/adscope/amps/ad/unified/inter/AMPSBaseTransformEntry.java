package xyz.adscope.amps.ad.unified.inter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSBaseTransformEntry implements xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedOptimizeController {
    protected int ecpm;
    protected xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener mAdEventListener;
    protected xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter mAdapter;
    protected android.content.Context mContext;
    protected xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener mDownloadListener;
    protected xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNegativeFeedbackListener mNegativeFeedbackListener;
    protected xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig mVideoConfig;

    public AMPSBaseTransformEntry(android.content.Context r1, int r2, xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig r3, xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r4) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto Lf
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.mContext = r1
        Lf:
            r0.ecpm = r2
            r0.mVideoConfig = r3
            r0.mAdapter = r4
            return
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public void bindAdToMediaView(android.app.Activity r1, xyz.adscope.amps.ad.unified.view.AMPSUnifiedMediaViewStub r2, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedVideoListener r3) {
            r0 = this;
            return
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public void bindAdToRootContainer(android.app.Activity r1, xyz.adscope.amps.ad.unified.view.AMPSUnifiedRootContainer r2, java.util.List<android.view.View> r3, java.util.List<android.view.View> r4) {
            r0 = this;
            return
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public void destroy() {
            r1 = this;
            r0 = 0
            r1.mContext = r0
            r1.mAdapter = r0
            return
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public java.lang.String getActionButtonText() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern getAdPattern() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public java.lang.String getAdSource() {
            r1 = this;
            xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r1.mAdapter
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.getSeatId()
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public android.view.View getAdSourceLogo() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public java.lang.String getAdSourceLogoUrl() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
    public java.lang.String getAppDescription() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public xyz.adscope.amps.ad.unified.inter.AMPSAppDetail getAppDetail() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
    public java.lang.String getAppDeveloper() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
    public java.lang.String getAppIconUrl() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
    public java.lang.String getAppName() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
    public java.lang.String getAppPackageName() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
    public java.lang.String getAppPermissionInfo() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
    public java.lang.String getAppPrice() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
    public java.lang.String getAppPrivacyPolicy() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
    public java.lang.String getAppScore() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
    public java.lang.String getAppSize() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
    public java.lang.String getAppVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public java.lang.String getDesc() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
    public java.lang.String getDownloadCountDesc() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public int getECPM() {
            r1 = this;
            int r0 = r1.ecpm
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public java.util.Map<java.lang.String, java.lang.Object> getExtras() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public java.lang.String getIconUrl() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public int getImageHeight() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public int getImageWidth() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public java.util.List<java.lang.String> getImagesUrl() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public java.lang.String getMainImageUrl() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public xyz.adscope.amps.ad.unified.view.AMPSUnifiedView getMainImageView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public java.util.List<xyz.adscope.amps.ad.unified.view.AMPSUnifiedView> getMainImageViews() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public android.view.View getNativeExpressAdView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public xyz.adscope.amps.ad.unified.inter.AMPSUnifiedOptimizeController getOptimizeController() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedOptimizeController
    public android.view.View getOptimizeShakeView(int r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedOptimizeController
    public android.view.View getOptimizeSlideView(int r1, int r2, int r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public java.lang.String getTitle() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public boolean isExpressAd() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public boolean isValid() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public boolean isViewObject() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public void pause() {
            r0 = this;
            return
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public void render() {
            r0 = this;
            return
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public void resume() {
            r0 = this;
            return
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public void setDownloadListener(xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r1) {
            r0 = this;
            r0.mDownloadListener = r1
            return
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public void setNativeAdEventListener(xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r1) {
            r0 = this;
            r0.mAdEventListener = r1
            return
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public void setNativeAdExpressListener(xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdExpressListener r1) {
            r0 = this;
            return
    }

    @Override // xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
    public void setNegativeFeedbackListener(xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNegativeFeedbackListener r1) {
            r0 = this;
            r0.mNegativeFeedbackListener = r1
            return
    }
}
