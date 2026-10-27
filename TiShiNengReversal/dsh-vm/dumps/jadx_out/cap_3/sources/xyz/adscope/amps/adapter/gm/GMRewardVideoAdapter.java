package xyz.adscope.amps.adapter.gm;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class GMRewardVideoAdapter extends xyz.adscope.amps.ad.reward.adapter.AMPSRewardAdapter {
    private com.bytedance.sdk.openadsdk.TTAdNative csjAdNative;
    private com.bytedance.sdk.openadsdk.TTRewardVideoAd csjRewardVideoAd;



    public GMRewardVideoAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void access$000(xyz.adscope.amps.adapter.gm.GMRewardVideoAdapter r0) {
            r0.loadRewardVideoAd()
            return
    }

    public static /* synthetic */ com.bytedance.sdk.openadsdk.TTRewardVideoAd access$100(xyz.adscope.amps.adapter.gm.GMRewardVideoAdapter r0) {
            com.bytedance.sdk.openadsdk.TTRewardVideoAd r0 = r0.csjRewardVideoAd
            return r0
    }

    public static /* synthetic */ com.bytedance.sdk.openadsdk.TTRewardVideoAd access$102(xyz.adscope.amps.adapter.gm.GMRewardVideoAdapter r0, com.bytedance.sdk.openadsdk.TTRewardVideoAd r1) {
            r0.csjRewardVideoAd = r1
            return r1
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.gm.GMInitMediation r0 = xyz.adscope.amps.adapter.gm.GMInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            xyz.adscope.amps.adapter.gm.GMRewardVideoAdapter$1 r2 = new xyz.adscope.amps.adapter.gm.GMRewardVideoAdapter$1
            r2.<init>(r3)
            r0.initSDK(r1, r2)
            return
    }

    private void loadRewardVideoAd() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GMSDK start loadRewardVideoAd  spaceId:"
            r0.append(r1)
            java.lang.String r1 = r3.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            com.bytedance.sdk.openadsdk.TTAdManager r0 = xyz.adscope.amps.adapter.gm.GMInitMediation.get()
            android.content.Context r1 = r3.mContext
            com.bytedance.sdk.openadsdk.TTAdNative r0 = r0.createAdNative(r1)
            r3.csjAdNative = r0
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = new com.bytedance.sdk.openadsdk.AdSlot$Builder
            r0.<init>()
            java.lang.String r1 = r3.mSpaceId
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = r0.setCodeId(r1)
            com.bytedance.sdk.openadsdk.TTAdLoadType r1 = com.bytedance.sdk.openadsdk.TTAdLoadType.LOAD
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = r0.setAdLoadType(r1)
            java.lang.String r1 = r3.mExtra
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = r0.setUserData(r1)
            java.lang.String r1 = r3.mUserId
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = r0.setUserID(r1)
            boolean r1 = r3.isAutoPlay
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = r0.setIsAutoPlay(r1)
            com.bytedance.sdk.openadsdk.AdSlot r0 = r0.build()
            com.bytedance.sdk.openadsdk.TTAdNative r1 = r3.csjAdNative
            xyz.adscope.amps.adapter.gm.GMRewardVideoAdapter$2 r2 = new xyz.adscope.amps.adapter.gm.GMRewardVideoAdapter$2
            r2.<init>(r3)
            r1.loadRewardVideoAd(r0, r2)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r2 = this;
            super.destroy()
            r0 = 0
            r2.csjAdNative = r0
            com.bytedance.sdk.openadsdk.TTRewardVideoAd r1 = r2.csjRewardVideoAd
            if (r1 == 0) goto L1b
            com.bytedance.sdk.openadsdk.mediation.manager.MediationRewardManager r1 = r1.getMediationManager()
            if (r1 == 0) goto L1b
            com.bytedance.sdk.openadsdk.TTRewardVideoAd r1 = r2.csjRewardVideoAd
            com.bytedance.sdk.openadsdk.mediation.manager.MediationRewardManager r1 = r1.getMediationManager()
            r1.destroy()
            r2.csjRewardVideoAd = r0
        L1b:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
            r1 = this;
            com.bytedance.sdk.openadsdk.TTRewardVideoAd r0 = r1.csjRewardVideoAd
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
            com.bytedance.sdk.openadsdk.TTAdNative r0 = r1.csjAdNative
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 1
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xyz.adscope.amps.ad.reward.adapter.AMPSRewardAdapter
    public void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.reward.adapter.AMPSRewardVideoAdAdapterListener r3) {
            r0 = this;
            super.loadNetworkAd2(r1, r2, r3)
            r0.initSDK()
            return
    }

    @Override // xyz.adscope.amps.ad.reward.adapter.AMPSRewardAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public /* bridge */ /* synthetic */ void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.reward.adapter.AMPSRewardVideoAdAdapterListener r3) {
            r0 = this;
            xyz.adscope.amps.ad.reward.adapter.AMPSRewardVideoAdAdapterListener r3 = (xyz.adscope.amps.ad.reward.adapter.AMPSRewardVideoAdAdapterListener) r3
            r0.loadNetworkAd(r1, r2, r3)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void showAd(android.app.Activity r2) {
            r1 = this;
            com.bytedance.sdk.openadsdk.TTAdNative r0 = r1.csjAdNative
            if (r0 == 0) goto Lf
            com.bytedance.sdk.openadsdk.TTRewardVideoAd r0 = r1.csjRewardVideoAd
            if (r0 == 0) goto Lf
            if (r2 != 0) goto Lb
            goto Lf
        Lb:
            r0.showRewardVideoAd(r2)
            return
        Lf:
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r2 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_AD_CONTAINER_NULL
            java.lang.String r0 = r2.getErrorCode()
            java.lang.String r2 = r2.getErrorMsg()
            r1.onAdShowFailed(r0, r2)
            return
    }
}
