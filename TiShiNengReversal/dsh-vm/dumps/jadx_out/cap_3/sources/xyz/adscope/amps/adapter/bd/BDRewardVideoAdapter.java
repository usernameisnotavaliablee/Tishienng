package xyz.adscope.amps.adapter.bd;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BDRewardVideoAdapter extends xyz.adscope.amps.ad.reward.adapter.AMPSRewardAdapter {
    private com.baidu.mobads.sdk.api.RewardVideoAd mRewardVideoAd;
    private com.baidu.mobads.sdk.api.RewardVideoAd.RewardVideoAdListener mRewardVideoAdListener;




    public BDRewardVideoAdapter() {
            r1 = this;
            r1.<init>()
            xyz.adscope.amps.adapter.bd.BDRewardVideoAdapter$3 r0 = new xyz.adscope.amps.adapter.bd.BDRewardVideoAdapter$3
            r0.<init>(r1)
            r1.mRewardVideoAdListener = r0
            return
    }

    public static /* synthetic */ com.baidu.mobads.sdk.api.RewardVideoAd access$000(xyz.adscope.amps.adapter.bd.BDRewardVideoAdapter r0) {
            com.baidu.mobads.sdk.api.RewardVideoAd r0 = r0.mRewardVideoAd
            return r0
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.bd.BDInitMediation r0 = xyz.adscope.amps.adapter.bd.BDInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            r2 = 0
            r0.initSDK(r1, r2)
            r3.loadRewardVideoAd()
            return
    }

    private void loadRewardVideoAd() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BDSDK start loadRewardVideoAd spaceId:"
            r0.append(r1)
            java.lang.String r1 = r4.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            com.baidu.mobads.sdk.api.RewardVideoAd r0 = new com.baidu.mobads.sdk.api.RewardVideoAd
            android.content.Context r1 = r4.mContext
            java.lang.String r2 = r4.mSpaceId
            com.baidu.mobads.sdk.api.RewardVideoAd$RewardVideoAdListener r3 = r4.mRewardVideoAdListener
            r0.<init>(r1, r2, r3)
            r4.mRewardVideoAd = r0
            java.lang.String r1 = r4.mUserId
            r0.setUserId(r1)
            com.baidu.mobads.sdk.api.RewardVideoAd r0 = r4.mRewardVideoAd
            java.lang.String r1 = r4.mExtra
            r0.setExtraInfo(r1)
            com.baidu.mobads.sdk.api.RewardVideoAd r0 = r4.mRewardVideoAd
            r0.load()
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r1 = this;
            super.destroy()
            r0 = 0
            r1.mRewardVideoAd = r0
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public boolean isValid() {
            r1 = this;
            com.baidu.mobads.sdk.api.RewardVideoAd r0 = r1.mRewardVideoAd
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.isReady()
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xyz.adscope.amps.ad.reward.adapter.AMPSRewardAdapter
    public void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.reward.adapter.AMPSRewardVideoAdAdapterListener r3) {
            r0 = this;
            super.loadNetworkAd2(r1, r2, r3)
            boolean r1 = r0.isBidding
            if (r1 == 0) goto Lf
            com.baidu.mobads.sdk.api.RewardVideoAd r1 = r0.mRewardVideoAd
            if (r1 == 0) goto Lf
            r0.onAdLoad()
            return
        Lf:
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
    public void sendLossNotice(xyz.adscope.amps.base.AMPSBidResult r4) {
            r3 = this;
            com.baidu.mobads.sdk.api.RewardVideoAd r0 = r3.mRewardVideoAd     // Catch: java.lang.Exception -> L19
            if (r0 == 0) goto L19
            if (r4 != 0) goto L7
            goto L19
        L7:
            xyz.adscope.amps.adapter.bd.BDRewardVideoAdapter$2 r0 = new xyz.adscope.amps.adapter.bd.BDRewardVideoAdapter$2     // Catch: java.lang.Exception -> L19
            r0.<init>(r3)     // Catch: java.lang.Exception -> L19
            com.baidu.mobads.sdk.api.RewardVideoAd r1 = r3.mRewardVideoAd     // Catch: java.lang.Exception -> L19
            xyz.adscope.amps.adapter.bd.BDInitMediation r2 = xyz.adscope.amps.adapter.bd.BDInitMediation.getInstance()     // Catch: java.lang.Exception -> L19
            java.util.LinkedHashMap r4 = r2.getWinInfo(r4)     // Catch: java.lang.Exception -> L19
            r1.biddingFail(r4, r0)     // Catch: java.lang.Exception -> L19
        L19:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendWinNotice(xyz.adscope.amps.base.AMPSBidResult r4) {
            r3 = this;
            com.baidu.mobads.sdk.api.RewardVideoAd r0 = r3.mRewardVideoAd     // Catch: java.lang.Exception -> L19
            if (r0 == 0) goto L19
            if (r4 != 0) goto L7
            goto L19
        L7:
            xyz.adscope.amps.adapter.bd.BDRewardVideoAdapter$1 r0 = new xyz.adscope.amps.adapter.bd.BDRewardVideoAdapter$1     // Catch: java.lang.Exception -> L19
            r0.<init>(r3)     // Catch: java.lang.Exception -> L19
            com.baidu.mobads.sdk.api.RewardVideoAd r1 = r3.mRewardVideoAd     // Catch: java.lang.Exception -> L19
            xyz.adscope.amps.adapter.bd.BDInitMediation r2 = xyz.adscope.amps.adapter.bd.BDInitMediation.getInstance()     // Catch: java.lang.Exception -> L19
            java.util.LinkedHashMap r4 = r2.getSecondInfo(r4)     // Catch: java.lang.Exception -> L19
            r1.biddingSuccess(r4, r0)     // Catch: java.lang.Exception -> L19
        L19:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void showAd(android.app.Activity r2) {
            r1 = this;
            com.baidu.mobads.sdk.api.RewardVideoAd r0 = r1.mRewardVideoAd
            if (r0 == 0) goto L13
            if (r2 == 0) goto L13
            boolean r2 = r0.isReady()
            if (r2 != 0) goto Ld
            goto L13
        Ld:
            com.baidu.mobads.sdk.api.RewardVideoAd r2 = r1.mRewardVideoAd
            r2.show()
            return
        L13:
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r2 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_AD_CONTAINER_NULL
            java.lang.String r0 = r2.getErrorCode()
            java.lang.String r2 = r2.getErrorMsg()
            r1.onAdShowFailed(r0, r2)
            return
    }

    @Override // xyz.adscope.amps.ad.reward.adapter.AMPSRewardAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public void startBid(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.inner.AMPSAdBiddingListener r3) {
            r0 = this;
            super.startBid(r1, r2, r3)
            r0.initSDK()
            return
    }
}
