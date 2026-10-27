package xyz.adscope.amps.adapter.ks;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class KSRewardVideoAdapter extends xyz.adscope.amps.ad.reward.adapter.AMPSRewardAdapter {
    private static final java.lang.String KS_EXTRA_DATA_KEY = "extraData";
    private static final java.lang.String KS_THIRD_USER_ID_KEY = "thirdUserId";
    private com.kwad.sdk.api.KsRewardVideoAd ksRewardVideoAd;
    private java.lang.String mBidResponse;
    private xyz.adscope.amps.adapter.ks.model.BidResponseModel mBidResponseModel;
    private java.lang.String mBidResponseV2;





    public KSRewardVideoAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ com.kwad.sdk.api.KsRewardVideoAd access$000(xyz.adscope.amps.adapter.ks.KSRewardVideoAdapter r0) {
            com.kwad.sdk.api.KsRewardVideoAd r0 = r0.ksRewardVideoAd
            return r0
    }

    public static /* synthetic */ com.kwad.sdk.api.KsRewardVideoAd access$002(xyz.adscope.amps.adapter.ks.KSRewardVideoAdapter r0, com.kwad.sdk.api.KsRewardVideoAd r1) {
            r0.ksRewardVideoAd = r1
            return r1
    }

    public static /* synthetic */ void access$100(xyz.adscope.amps.adapter.ks.KSRewardVideoAdapter r0) {
            r0.setKSRewardVideoAdListener()
            return
    }

    public static /* synthetic */ xyz.adscope.amps.adapter.ks.model.BidResponseModel access$202(xyz.adscope.amps.adapter.ks.KSRewardVideoAdapter r0, xyz.adscope.amps.adapter.ks.model.BidResponseModel r1) {
            r0.mBidResponseModel = r1
            return r1
    }

    public static /* synthetic */ java.lang.String access$302(xyz.adscope.amps.adapter.ks.KSRewardVideoAdapter r0, java.lang.String r1) {
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

    private void loadRewardVideoAd() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "KSSDK start loadRewardVideoAd spaceId:"
            r0.append(r1)
            java.lang.String r1 = r5.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = r5.mUserId
            java.lang.String r2 = "thirdUserId"
            r0.put(r2, r1)
            java.lang.String r1 = r5.mExtra
            java.lang.String r2 = "extraData"
            r0.put(r2, r1)
            boolean r1 = r5.isLandScape
            if (r1 != 0) goto L31
            r1 = 1
            goto L32
        L31:
            r1 = 2
        L32:
            com.kwad.sdk.api.KsScene$Builder r2 = new com.kwad.sdk.api.KsScene$Builder
            java.lang.String r3 = r5.mSpaceId
            long r3 = java.lang.Long.parseLong(r3)
            r2.<init>(r3)
            com.kwad.sdk.api.KsScene$Builder r1 = r2.screenOrientation(r1)
            com.kwad.sdk.api.KsScene$Builder r0 = r1.rewardCallbackExtraData(r0)
            java.lang.String r1 = r5.mBidResponse
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L53
            java.lang.String r1 = r5.mBidResponse
            r0.setBidResponse(r1)
            goto L60
        L53:
            java.lang.String r1 = r5.mBidResponseV2
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L60
            java.lang.String r1 = r5.mBidResponseV2
            r0.setBidResponseV2(r1)
        L60:
            com.kwad.sdk.api.KsScene r0 = r0.build()
            com.kwad.sdk.api.KsLoadManager r1 = com.kwad.sdk.api.KsAdSDK.getLoadManager()
            xyz.adscope.amps.adapter.ks.KSRewardVideoAdapter$1 r2 = new xyz.adscope.amps.adapter.ks.KSRewardVideoAdapter$1
            r2.<init>(r5)
            r1.loadRewardVideoAd(r0, r2)
            return
    }

    private void setKSRewardVideoAdListener() {
            r2 = this;
            com.kwad.sdk.api.KsRewardVideoAd r0 = r2.ksRewardVideoAd
            if (r0 == 0) goto L16
            xyz.adscope.amps.adapter.ks.KSRewardVideoAdapter$2 r1 = new xyz.adscope.amps.adapter.ks.KSRewardVideoAdapter$2
            r1.<init>(r2)
            r0.setInnerAdInteractionListener(r1)
            com.kwad.sdk.api.KsRewardVideoAd r0 = r2.ksRewardVideoAd
            xyz.adscope.amps.adapter.ks.KSRewardVideoAdapter$3 r1 = new xyz.adscope.amps.adapter.ks.KSRewardVideoAdapter$3
            r1.<init>(r2)
            r0.setRewardAdInteractionListener(r1)
        L16:
            return
    }

    private void startS2SBidding() {
            r5 = this;
            java.lang.String r0 = r5.mServerUrl
            java.lang.String r1 = r5.mAccountId
            java.lang.String r2 = r5.mSpaceId
            int r3 = r5.mFloorEcpm
            xyz.adscope.amps.adapter.ks.KSRewardVideoAdapter$4 r4 = new xyz.adscope.amps.adapter.ks.KSRewardVideoAdapter$4
            r4.<init>(r5)
            xyz.adscope.amps.adapter.ks.util.KSBiddingRequestUtil.getBidResponse(r0, r1, r2, r3, r4)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r1 = this;
            super.destroy()
            r0 = 0
            r1.ksRewardVideoAd = r0
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
            r1 = this;
            com.kwad.sdk.api.KsRewardVideoAd r0 = r1.ksRewardVideoAd
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
            com.kwad.sdk.api.KsRewardVideoAd r0 = r1.ksRewardVideoAd
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
            boolean r1 = r0.isC2SAdSource()
            if (r1 == 0) goto L11
            com.kwad.sdk.api.KsRewardVideoAd r1 = r0.ksRewardVideoAd
            if (r1 == 0) goto L11
            r0.onAdLoad()
            return
        L11:
            r0.initSDK()
            r0.loadRewardVideoAd()
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
    public void sendLossNotice(xyz.adscope.amps.base.AMPSBidResult r2) {
            r1 = this;
            com.kwad.sdk.api.KsRewardVideoAd r0 = r1.ksRewardVideoAd     // Catch: java.lang.Exception -> La
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
            com.kwad.sdk.api.KsRewardVideoAd r2 = r1.ksRewardVideoAd     // Catch: java.lang.Exception -> L20
            if (r2 != 0) goto L5
            goto L20
        L5:
            int r2 = r2.getECPM()     // Catch: java.lang.Exception -> L20
            boolean r0 = r1.isC2SAdSource()     // Catch: java.lang.Exception -> L20
            if (r0 == 0) goto L15
            com.kwad.sdk.api.KsRewardVideoAd r0 = r1.ksRewardVideoAd     // Catch: java.lang.Exception -> L20
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
    public void showAd(android.app.Activity r3) {
            r2 = this;
            com.kwad.sdk.api.KsRewardVideoAd r0 = r2.ksRewardVideoAd
            if (r0 == 0) goto L22
            if (r3 != 0) goto L7
            goto L22
        L7:
            com.kwad.sdk.api.KsVideoPlayConfig$Builder r0 = new com.kwad.sdk.api.KsVideoPlayConfig$Builder
            r0.<init>()
            boolean r1 = r2.isLandScape
            com.kwad.sdk.api.KsVideoPlayConfig$Builder r0 = r0.showLandscape(r1)
            boolean r1 = r2.isVolumeOn
            com.kwad.sdk.api.KsVideoPlayConfig$Builder r0 = r0.videoSoundEnable(r1)
            com.kwad.sdk.api.KsVideoPlayConfig r0 = r0.build()
            com.kwad.sdk.api.KsRewardVideoAd r1 = r2.ksRewardVideoAd
            r1.showRewardVideoAd(r3, r0)
            return
        L22:
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r3 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_AD_CONTAINER_NULL
            java.lang.String r0 = r3.getErrorCode()
            java.lang.String r3 = r3.getErrorMsg()
            r2.onAdShowFailed(r0, r3)
            return
    }

    @Override // xyz.adscope.amps.ad.reward.adapter.AMPSRewardAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public void startBid(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.inner.AMPSAdBiddingListener r3) {
            r0 = this;
            super.startBid(r1, r2, r3)
            r0.initSDK()
            boolean r1 = r0.isC2SAdSource()
            if (r1 == 0) goto L10
            r0.loadRewardVideoAd()
            return
        L10:
            boolean r1 = r0.isS2SAdSource()
            if (r1 == 0) goto L19
            r0.startS2SBidding()
        L19:
            return
    }
}
