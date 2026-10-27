package xyz.adscope.amps.adapter.gm;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class GMSplashAdapter extends xyz.adscope.amps.ad.splash.adapter.AMPSSplashAdapter {
    private com.bytedance.sdk.openadsdk.CSJSplashAd mSplashAd;
    private com.bytedance.sdk.openadsdk.TTAdNative mTTAdNative;



    public GMSplashAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void access$000(xyz.adscope.amps.adapter.gm.GMSplashAdapter r0) {
            r0.loadSplashAd()
            return
    }

    public static /* synthetic */ com.bytedance.sdk.openadsdk.CSJSplashAd access$102(xyz.adscope.amps.adapter.gm.GMSplashAdapter r0, com.bytedance.sdk.openadsdk.CSJSplashAd r1) {
            r0.mSplashAd = r1
            return r1
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.gm.GMInitMediation r0 = xyz.adscope.amps.adapter.gm.GMInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            xyz.adscope.amps.adapter.gm.GMSplashAdapter$1 r2 = new xyz.adscope.amps.adapter.gm.GMSplashAdapter$1
            r2.<init>(r3)
            r0.initSDK(r1, r2)
            return
    }

    private void loadSplashAd() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GMSDK start loadSplashAd  spaceId:"
            r0.append(r1)
            java.lang.String r1 = r4.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            com.bytedance.sdk.openadsdk.TTAdManager r0 = xyz.adscope.amps.adapter.gm.GMInitMediation.get()
            android.content.Context r1 = r4.mContext
            com.bytedance.sdk.openadsdk.TTAdNative r0 = r0.createAdNative(r1)
            r4.mTTAdNative = r0
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = new com.bytedance.sdk.openadsdk.AdSlot$Builder
            r0.<init>()
            java.lang.String r1 = r4.mSpaceId
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = r0.setCodeId(r1)
            r1 = 1
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = r0.setSupportDeepLink(r1)
            int r1 = r4.viewWidthPx
            int r2 = r4.viewHeightPx
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = r0.setImageAcceptedSize(r1, r2)
            int r1 = r4.viewWidthDp
            float r1 = (float) r1
            int r2 = r4.viewHeightDp
            float r2 = (float) r2
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = r0.setExpressViewAcceptedSize(r1, r2)
            com.bytedance.sdk.openadsdk.AdSlot r0 = r0.build()
            com.bytedance.sdk.openadsdk.TTAdNative r1 = r4.mTTAdNative
            xyz.adscope.amps.adapter.gm.GMSplashAdapter$2 r2 = new xyz.adscope.amps.adapter.gm.GMSplashAdapter$2
            r2.<init>(r4)
            int r3 = r4.mTimeout
            r1.loadSplashAd(r0, r2, r3)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r2 = this;
            super.destroy()
            r0 = 0
            r2.mTTAdNative = r0
            com.bytedance.sdk.openadsdk.CSJSplashAd r1 = r2.mSplashAd
            if (r1 == 0) goto L1b
            com.bytedance.sdk.openadsdk.mediation.manager.MediationSplashManager r1 = r1.getMediationManager()
            if (r1 == 0) goto L1b
            com.bytedance.sdk.openadsdk.CSJSplashAd r1 = r2.mSplashAd
            com.bytedance.sdk.openadsdk.mediation.manager.MediationSplashManager r1 = r1.getMediationManager()
            r1.destroy()
            r2.mSplashAd = r0
        L1b:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
            r1 = this;
            com.bytedance.sdk.openadsdk.CSJSplashAd r0 = r1.mSplashAd
            if (r0 == 0) goto L9
            java.util.Map r0 = r0.getMediaExtraInfo()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public boolean isValid() {
            r1 = this;
            com.bytedance.sdk.openadsdk.TTAdNative r0 = r1.mTTAdNative
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 1
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xyz.adscope.amps.ad.splash.adapter.AMPSSplashAdapter
    public void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.splash.adapter.AMPSSplashAdAdapterListener r3) {
            r0 = this;
            super.loadNetworkAd2(r1, r2, r3)
            r0.initSDK()
            return
    }

    @Override // xyz.adscope.amps.ad.splash.adapter.AMPSSplashAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public /* bridge */ /* synthetic */ void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.splash.adapter.AMPSSplashAdAdapterListener r3) {
            r0 = this;
            xyz.adscope.amps.ad.splash.adapter.AMPSSplashAdAdapterListener r3 = (xyz.adscope.amps.ad.splash.adapter.AMPSSplashAdAdapterListener) r3
            r0.loadNetworkAd(r1, r2, r3)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void showAd(android.view.ViewGroup r2) {
            r1 = this;
            com.bytedance.sdk.openadsdk.TTAdNative r0 = r1.mTTAdNative
            if (r0 == 0) goto Ld
            if (r2 != 0) goto L7
            goto Ld
        L7:
            com.bytedance.sdk.openadsdk.CSJSplashAd r0 = r1.mSplashAd
            r0.showSplashView(r2)
            return
        Ld:
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r2 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_AD_CONTAINER_NULL
            java.lang.String r0 = r2.getErrorCode()
            java.lang.String r2 = r2.getErrorMsg()
            r1.onAdShowFailed(r0, r2)
            return
    }
}
