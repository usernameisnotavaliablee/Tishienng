package xyz.adscope.amps.adapter.ks;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class KSSplashAdapter extends xyz.adscope.amps.ad.splash.adapter.AMPSSplashAdapter {
    private com.kwad.sdk.api.KsSplashScreenAd ksSplashScreenAd;
    private java.lang.String mBidResponse;
    private xyz.adscope.amps.adapter.ks.model.BidResponseModel mBidResponseModel;
    private java.lang.String mBidResponseV2;
    private final com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener mInteractionListener;




    public KSSplashAdapter() {
            r1 = this;
            r1.<init>()
            xyz.adscope.amps.adapter.ks.KSSplashAdapter$2 r0 = new xyz.adscope.amps.adapter.ks.KSSplashAdapter$2
            r0.<init>(r1)
            r1.mInteractionListener = r0
            return
    }

    public static /* synthetic */ com.kwad.sdk.api.KsSplashScreenAd access$000(xyz.adscope.amps.adapter.ks.KSSplashAdapter r0) {
            com.kwad.sdk.api.KsSplashScreenAd r0 = r0.ksSplashScreenAd
            return r0
    }

    public static /* synthetic */ com.kwad.sdk.api.KsSplashScreenAd access$002(xyz.adscope.amps.adapter.ks.KSSplashAdapter r0, com.kwad.sdk.api.KsSplashScreenAd r1) {
            r0.ksSplashScreenAd = r1
            return r1
    }

    public static /* synthetic */ xyz.adscope.amps.adapter.ks.model.BidResponseModel access$102(xyz.adscope.amps.adapter.ks.KSSplashAdapter r0, xyz.adscope.amps.adapter.ks.model.BidResponseModel r1) {
            r0.mBidResponseModel = r1
            return r1
    }

    public static /* synthetic */ java.lang.String access$202(xyz.adscope.amps.adapter.ks.KSSplashAdapter r0, java.lang.String r1) {
            r0.mBidResponse = r1
            return r1
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.ks.KSInitMediation r0 = xyz.adscope.amps.adapter.ks.KSInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            r2 = 0
            r0.initSDK(r1, r2)
            return
    }

    private void loadSplashAd() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "KSSDK start loadSplashAd spaceId:"
            r0.append(r1)
            java.lang.String r1 = r4.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            com.kwad.sdk.api.model.SplashAdExtraData r0 = new com.kwad.sdk.api.model.SplashAdExtraData
            r0.<init>()
            xyz.adscope.amps.adapter.ks.KSInitMediation r1 = xyz.adscope.amps.adapter.ks.KSInitMediation.getInstance()
            boolean r1 = r1.isCanUseShakeAd()
            if (r1 == 0) goto L2c
            r1 = 0
        L28:
            r0.setDisableShakeStatus(r1)
            goto L2e
        L2c:
            r1 = 1
            goto L28
        L2e:
            com.kwad.sdk.api.KsScene$Builder r1 = new com.kwad.sdk.api.KsScene$Builder
            java.lang.String r2 = r4.mSpaceId
            long r2 = java.lang.Long.parseLong(r2)
            r1.<init>(r2)
            com.kwad.sdk.api.KsScene$Builder r0 = r1.setSplashExtraData(r0)
            java.lang.String r1 = r4.mBidResponse
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L4b
            java.lang.String r1 = r4.mBidResponse
            r0.setBidResponse(r1)
            goto L58
        L4b:
            java.lang.String r1 = r4.mBidResponseV2
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L58
            java.lang.String r1 = r4.mBidResponseV2
            r0.setBidResponseV2(r1)
        L58:
            com.kwad.sdk.api.KsScene r0 = r0.build()
            com.kwad.sdk.api.KsLoadManager r1 = com.kwad.sdk.api.KsAdSDK.getLoadManager()
            xyz.adscope.amps.adapter.ks.KSSplashAdapter$1 r2 = new xyz.adscope.amps.adapter.ks.KSSplashAdapter$1
            r2.<init>(r4)
            r1.loadSplashScreenAd(r0, r2)
            return
    }

    private void startS2SBidding() {
            r5 = this;
            java.lang.String r0 = r5.mServerUrl
            java.lang.String r1 = r5.mAccountId
            java.lang.String r2 = r5.mSpaceId
            int r3 = r5.mFloorEcpm
            xyz.adscope.amps.adapter.ks.KSSplashAdapter$3 r4 = new xyz.adscope.amps.adapter.ks.KSSplashAdapter$3
            r4.<init>(r5)
            xyz.adscope.amps.adapter.ks.util.KSBiddingRequestUtil.getBidResponse(r0, r1, r2, r3, r4)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r1 = this;
            super.destroy()
            r0 = 0
            r1.ksSplashScreenAd = r0
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
            r1 = this;
            com.kwad.sdk.api.KsSplashScreenAd r0 = r1.ksSplashScreenAd
            if (r0 == 0) goto L7
            r0.getMediaExtraInfo()
        L7:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public boolean isValid() {
            r1 = this;
            com.kwad.sdk.api.KsSplashScreenAd r0 = r1.ksSplashScreenAd
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
            boolean r1 = r0.isC2SAdSource()
            if (r1 == 0) goto L11
            com.kwad.sdk.api.KsSplashScreenAd r1 = r0.ksSplashScreenAd
            if (r1 == 0) goto L11
            r0.onAdLoad()
            return
        L11:
            r0.initSDK()
            r0.loadSplashAd()
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
    public void sendLossNotice(xyz.adscope.amps.base.AMPSBidResult r2) {
            r1 = this;
            com.kwad.sdk.api.KsSplashScreenAd r0 = r1.ksSplashScreenAd     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto La
            if (r2 != 0) goto L7
            goto La
        L7:
            xyz.adscope.amps.adapter.ks.KSAdManagerHolder.sendLossNotification(r0, r2)     // Catch: java.lang.Exception -> La
        La:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendWinNotice(xyz.adscope.amps.base.AMPSBidResult r2) {
            r1 = this;
            com.kwad.sdk.api.KsSplashScreenAd r2 = r1.ksSplashScreenAd     // Catch: java.lang.Exception -> L20
            if (r2 != 0) goto L5
            goto L20
        L5:
            int r2 = r2.getECPM()     // Catch: java.lang.Exception -> L20
            boolean r0 = r1.isC2SAdSource()     // Catch: java.lang.Exception -> L20
            if (r0 == 0) goto L15
            com.kwad.sdk.api.KsSplashScreenAd r0 = r1.ksSplashScreenAd     // Catch: java.lang.Exception -> L20
            xyz.adscope.amps.adapter.ks.KSAdManagerHolder.sendWinNotification(r0, r2)     // Catch: java.lang.Exception -> L20
            return
        L15:
            boolean r2 = r1.isS2SAdSource()     // Catch: java.lang.Exception -> L20
            if (r2 == 0) goto L20
            xyz.adscope.amps.adapter.ks.model.BidResponseModel r2 = r1.mBidResponseModel     // Catch: java.lang.Exception -> L20
            xyz.adscope.amps.adapter.ks.util.KSBiddingRequestUtil.sendWinNotice(r2)     // Catch: java.lang.Exception -> L20
        L20:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void showAd(android.view.ViewGroup r4) {
            r3 = this;
            com.kwad.sdk.api.KsSplashScreenAd r0 = r3.ksSplashScreenAd
            if (r0 == 0) goto L21
            if (r4 != 0) goto L7
            goto L21
        L7:
            android.content.Context r1 = r4.getContext()
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r2 = r3.mInteractionListener
            android.view.View r0 = r0.getView(r1, r2)
            r4.removeAllViews()
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            r4.addView(r0)
            return
        L21:
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r4 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_AD_CONTAINER_NULL
            java.lang.String r0 = r4.getErrorCode()
            java.lang.String r4 = r4.getErrorMsg()
            r3.onAdShowFailed(r0, r4)
            return
    }

    @Override // xyz.adscope.amps.ad.splash.adapter.AMPSSplashAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public void startBid(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.inner.AMPSAdBiddingListener r3) {
            r0 = this;
            super.startBid(r1, r2, r3)
            r0.initSDK()
            boolean r1 = r0.isC2SAdSource()
            if (r1 == 0) goto L10
            r0.loadSplashAd()
            return
        L10:
            boolean r1 = r0.isS2SAdSource()
            if (r1 == 0) goto L19
            r0.startS2SBidding()
        L19:
            return
    }
}
