package xyz.adscope.amps.adapter.csj;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class CSJInterstitialAdapter extends xyz.adscope.amps.ad.interstitial.adapter.AMPSInterstitialAdapter {
    private com.bytedance.sdk.openadsdk.TTAdNative mTTAdNative;
    private com.bytedance.sdk.openadsdk.TTFullScreenVideoAd mttFullVideoAd;





    public CSJInterstitialAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void access$000(xyz.adscope.amps.adapter.csj.CSJInterstitialAdapter r0) {
            r0.loadInterstitialAd()
            return
    }

    public static /* synthetic */ com.bytedance.sdk.openadsdk.TTFullScreenVideoAd access$102(xyz.adscope.amps.adapter.csj.CSJInterstitialAdapter r0, com.bytedance.sdk.openadsdk.TTFullScreenVideoAd r1) {
            r0.mttFullVideoAd = r1
            return r1
    }

    public static /* synthetic */ void access$200(xyz.adscope.amps.adapter.csj.CSJInterstitialAdapter r0) {
            r0.setFullScreenVideoAdInteractionListener()
            return
    }

    public static /* synthetic */ void access$300(xyz.adscope.amps.adapter.csj.CSJInterstitialAdapter r0) {
            r0.setDownloadListener()
            return
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.csj.CSJInitMediation r0 = xyz.adscope.amps.adapter.csj.CSJInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            xyz.adscope.amps.adapter.csj.CSJInterstitialAdapter$1 r2 = new xyz.adscope.amps.adapter.csj.CSJInterstitialAdapter$1
            r2.<init>(r3)
            r0.initSDK(r1, r2)
            return
    }

    private void loadInterstitialAd() {
            r3 = this;
            java.lang.String r0 = "CSJSDK start loadInterstitialAd spaceId:"
            java.lang.StringBuilder r0 = xyz.adscope.amps.adapter.csj.a.a(r0)
            java.lang.String r1 = r3.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            com.bytedance.sdk.openadsdk.TTAdManager r0 = xyz.adscope.amps.adapter.csj.CSJInitMediation.get()
            android.content.Context r1 = r3.mContext
            com.bytedance.sdk.openadsdk.TTAdNative r0 = r0.createAdNative(r1)
            r3.mTTAdNative = r0
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = new com.bytedance.sdk.openadsdk.AdSlot$Builder
            r0.<init>()
            java.lang.String r1 = r3.mSpaceId
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = r0.setCodeId(r1)
            com.bytedance.sdk.openadsdk.TTAdLoadType r1 = com.bytedance.sdk.openadsdk.TTAdLoadType.LOAD
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = r0.setAdLoadType(r1)
            com.bytedance.sdk.openadsdk.AdSlot r0 = r0.build()
            com.bytedance.sdk.openadsdk.TTAdNative r1 = r3.mTTAdNative
            xyz.adscope.amps.adapter.csj.CSJInterstitialAdapter$2 r2 = new xyz.adscope.amps.adapter.csj.CSJInterstitialAdapter$2
            r2.<init>(r3)
            r1.loadFullScreenVideoAd(r0, r2)
            return
    }

    private void setDownloadListener() {
            r2 = this;
            com.bytedance.sdk.openadsdk.TTFullScreenVideoAd r0 = r2.mttFullVideoAd
            if (r0 != 0) goto L5
            return
        L5:
            xyz.adscope.amps.adapter.csj.CSJInterstitialAdapter$4 r1 = new xyz.adscope.amps.adapter.csj.CSJInterstitialAdapter$4
            r1.<init>(r2)
            r0.setDownloadListener(r1)
            return
    }

    private void setFullScreenVideoAdInteractionListener() {
            r2 = this;
            com.bytedance.sdk.openadsdk.TTFullScreenVideoAd r0 = r2.mttFullVideoAd
            if (r0 != 0) goto L5
            return
        L5:
            xyz.adscope.amps.adapter.csj.CSJInterstitialAdapter$3 r1 = new xyz.adscope.amps.adapter.csj.CSJInterstitialAdapter$3
            r1.<init>(r2)
            r0.setFullScreenVideoAdInteractionListener(r1)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r2 = this;
            super.destroy()
            r0 = 0
            r2.mTTAdNative = r0
            com.bytedance.sdk.openadsdk.TTFullScreenVideoAd r1 = r2.mttFullVideoAd
            if (r1 == 0) goto L1b
            com.bytedance.sdk.openadsdk.mediation.manager.MediationFullScreenManager r1 = r1.getMediationManager()
            if (r1 == 0) goto L1b
            com.bytedance.sdk.openadsdk.TTFullScreenVideoAd r1 = r2.mttFullVideoAd
            com.bytedance.sdk.openadsdk.mediation.manager.MediationFullScreenManager r1 = r1.getMediationManager()
            r1.destroy()
            r2.mttFullVideoAd = r0
        L1b:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
            r1 = this;
            com.bytedance.sdk.openadsdk.TTFullScreenVideoAd r0 = r1.mttFullVideoAd
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
    @Override // xyz.adscope.amps.ad.interstitial.adapter.AMPSInterstitialAdapter
    public void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.interstitial.adapter.AMPSInterstitialAdAdapterListener r3) {
            r0 = this;
            super.loadNetworkAd2(r1, r2, r3)
            r0.initSDK()
            return
    }

    @Override // xyz.adscope.amps.ad.interstitial.adapter.AMPSInterstitialAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public /* bridge */ /* synthetic */ void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.interstitial.adapter.AMPSInterstitialAdAdapterListener r3) {
            r0 = this;
            xyz.adscope.amps.ad.interstitial.adapter.AMPSInterstitialAdAdapterListener r3 = (xyz.adscope.amps.ad.interstitial.adapter.AMPSInterstitialAdAdapterListener) r3
            r0.loadNetworkAd(r1, r2, r3)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void showAd(android.app.Activity r4) {
            r3 = this;
            com.bytedance.sdk.openadsdk.TTAdNative r0 = r3.mTTAdNative
            if (r0 == 0) goto L12
            com.bytedance.sdk.openadsdk.TTFullScreenVideoAd r0 = r3.mttFullVideoAd
            if (r0 == 0) goto L12
            if (r4 != 0) goto Lb
            goto L12
        Lb:
            com.bytedance.sdk.openadsdk.TTAdConstant$RitScenes r1 = com.bytedance.sdk.openadsdk.TTAdConstant.RitScenes.GAME_GIFT_BONUS
            r2 = 0
            r0.showFullScreenVideoAd(r4, r1, r2)
            return
        L12:
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r4 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_AD_CONTAINER_NULL
            java.lang.String r0 = r4.getErrorCode()
            java.lang.String r4 = r4.getErrorMsg()
            r3.onAdShowFailed(r0, r4)
            return
    }
}
