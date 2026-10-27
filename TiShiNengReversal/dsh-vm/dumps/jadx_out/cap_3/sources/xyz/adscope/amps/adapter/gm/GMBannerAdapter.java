package xyz.adscope.amps.adapter.gm;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class GMBannerAdapter extends xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdapter {
    private com.bytedance.sdk.openadsdk.TTAdNative csjAdNative;
    private com.bytedance.sdk.openadsdk.TTNativeExpressAd mTTBannerAd;





    public GMBannerAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void access$000(xyz.adscope.amps.adapter.gm.GMBannerAdapter r0) {
            r0.loadBannerAd()
            return
    }

    public static /* synthetic */ com.bytedance.sdk.openadsdk.TTNativeExpressAd access$100(xyz.adscope.amps.adapter.gm.GMBannerAdapter r0) {
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r0 = r0.mTTBannerAd
            return r0
    }

    public static /* synthetic */ com.bytedance.sdk.openadsdk.TTNativeExpressAd access$102(xyz.adscope.amps.adapter.gm.GMBannerAdapter r0, com.bytedance.sdk.openadsdk.TTNativeExpressAd r1) {
            r0.mTTBannerAd = r1
            return r1
    }

    private void bindAdListener(com.bytedance.sdk.openadsdk.TTNativeExpressAd r3) {
            r2 = this;
            xyz.adscope.amps.adapter.gm.GMBannerAdapter$3 r0 = new xyz.adscope.amps.adapter.gm.GMBannerAdapter$3
            r0.<init>(r2)
            r3.setExpressInteractionListener(r0)
            android.content.Context r0 = r2.mContext
            if (r0 == 0) goto L1b
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 != 0) goto L11
            goto L1b
        L11:
            android.app.Activity r0 = (android.app.Activity) r0
            xyz.adscope.amps.adapter.gm.GMBannerAdapter$4 r1 = new xyz.adscope.amps.adapter.gm.GMBannerAdapter$4
            r1.<init>(r2)
            r3.setDislikeCallback(r0, r1)
        L1b:
            return
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.gm.GMInitMediation r0 = xyz.adscope.amps.adapter.gm.GMInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            xyz.adscope.amps.adapter.gm.GMBannerAdapter$1 r2 = new xyz.adscope.amps.adapter.gm.GMBannerAdapter$1
            r2.<init>(r3)
            r0.initSDK(r1, r2)
            return
    }

    private void loadBannerAd() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GMSDK start loadBannerAd  spaceId:"
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
            int r1 = r3.expressViewWidth
            int r2 = r3.expressViewHeight
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = r0.setImageAcceptedSize(r1, r2)
            com.bytedance.sdk.openadsdk.AdSlot r0 = r0.build()
            com.bytedance.sdk.openadsdk.TTAdNative r1 = r3.csjAdNative
            xyz.adscope.amps.adapter.gm.GMBannerAdapter$2 r2 = new xyz.adscope.amps.adapter.gm.GMBannerAdapter$2
            r2.<init>(r3)
            r1.loadBannerExpressAd(r0, r2)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r1 = this;
            super.destroy()     // Catch: java.lang.Exception -> Ld
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r0 = r1.mTTBannerAd     // Catch: java.lang.Exception -> Ld
            if (r0 == 0) goto La
            r0.destroy()     // Catch: java.lang.Exception -> Ld
        La:
            r0 = 0
            r1.csjAdNative = r0     // Catch: java.lang.Exception -> Ld
        Ld:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
            r1 = this;
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r0 = r1.mTTBannerAd
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
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r0 = r1.mTTBannerAd
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 1
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdapter
    public void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdAdapterListener r3) {
            r0 = this;
            super.loadNetworkAd2(r1, r2, r3)
            r0.initSDK()
            return
    }

    @Override // xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public /* bridge */ /* synthetic */ void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdAdapterListener r3) {
            r0 = this;
            xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdAdapterListener r3 = (xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdAdapterListener) r3
            r0.loadNetworkAd(r1, r2, r3)
            return
    }

    @Override // xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public void showAd(android.view.ViewGroup r2) {
            r1 = this;
            if (r2 != 0) goto L10
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r2 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_AD_CONTAINER_NULL
            java.lang.String r0 = r2.getErrorCode()
            java.lang.String r2 = r2.getErrorMsg()
            r1.onAdShowFailed(r0, r2)
            return
        L10:
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r0 = r1.mTTBannerAd
            r1.bindAdListener(r0)
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r0 = r1.mTTBannerAd
            android.view.View r0 = r0.getExpressAdView()
            if (r0 != 0) goto L2b
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r2 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_AD_CONTAINER_NULL
            java.lang.String r0 = r2.getErrorCode()
            java.lang.String r2 = r2.getErrorMsg()
            r1.onAdShowFailed(r0, r2)
            return
        L2b:
            r2.removeAllViews()
            r2.addView(r0)
            return
    }
}
