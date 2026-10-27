package xyz.adscope.amps.adapter.asnp;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ASNPInterstitialAdapter extends xyz.adscope.amps.ad.interstitial.adapter.AMPSInterstitialAdapter {
    private xyz.adscope.ad.publish.ad.intersitital.InterstitialAd mInterstitialAd;



    public ASNPInterstitialAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void access$000(xyz.adscope.amps.adapter.asnp.ASNPInterstitialAdapter r0) {
            r0.loadInterstitialAd()
            return
    }

    public static /* synthetic */ xyz.adscope.ad.publish.ad.intersitital.InterstitialAd access$100(xyz.adscope.amps.adapter.asnp.ASNPInterstitialAdapter r0) {
            xyz.adscope.ad.publish.ad.intersitital.InterstitialAd r0 = r0.mInterstitialAd
            return r0
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.asnp.ASNPInitMediation r0 = xyz.adscope.amps.adapter.asnp.ASNPInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            xyz.adscope.amps.adapter.asnp.ASNPInterstitialAdapter$1 r2 = new xyz.adscope.amps.adapter.asnp.ASNPInterstitialAdapter$1
            r2.<init>(r3)
            r0.initSDK(r1, r2)
            return
    }

    private void loadInterstitialAd() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ASNPSDK start loadInterstitialAd spaceId:"
            r0.append(r1)
            java.lang.String r1 = r3.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            android.content.Context r0 = r3.mContext
            if (r0 != 0) goto L2a
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_REQUEST_FAIL
            java.lang.String r1 = r0.getErrorCode()
            java.lang.String r0 = r0.getErrorMsg()
            r3.onAdFailed(r1, r0)
            return
        L2a:
            xyz.adscope.ad.publish.ad.intersitital.IInterstitialAdConfig$Builder r0 = new xyz.adscope.ad.publish.ad.intersitital.IInterstitialAdConfig$Builder
            r0.<init>()
            int r1 = r3.mTimeout
            long r1 = (long) r1
            r0.setTimeoutMillion2(r1)
            java.lang.String r1 = r3.mSpaceId
            xyz.adscope.ad.a2 r0 = r0.build(r1)
            xyz.adscope.ad.publish.ad.intersitital.IInterstitialAdConfig r0 = (xyz.adscope.ad.publish.ad.intersitital.IInterstitialAdConfig) r0
            xyz.adscope.ad.publish.ad.intersitital.InterstitialAd r1 = new xyz.adscope.ad.publish.ad.intersitital.InterstitialAd
            android.content.Context r2 = r3.mContext
            r1.<init>(r2, r0)
            r3.mInterstitialAd = r1
            xyz.adscope.amps.adapter.asnp.ASNPInterstitialAdapter$2 r0 = new xyz.adscope.amps.adapter.asnp.ASNPInterstitialAdapter$2
            r0.<init>(r3)
            xyz.adscope.ad.publish.ad.intersitital.InterstitialAd r1 = r3.mInterstitialAd
            r1.loadAd(r0)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r1 = this;
            xyz.adscope.ad.publish.ad.intersitital.InterstitialAd r0 = r1.mInterstitialAd     // Catch: java.lang.Exception -> Ld
            if (r0 == 0) goto L7
            r0.destroyAd()     // Catch: java.lang.Exception -> Ld
        L7:
            r0 = 0
            r1.mInterstitialAd = r0     // Catch: java.lang.Exception -> Ld
            super.destroy()     // Catch: java.lang.Exception -> Ld
        Ld:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public boolean isValid() {
            r1 = this;
            xyz.adscope.ad.publish.ad.intersitital.InterstitialAd r0 = r1.mInterstitialAd
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
            boolean r1 = r0.isBidding
            if (r1 == 0) goto Lf
            xyz.adscope.ad.publish.ad.intersitital.InterstitialAd r1 = r0.mInterstitialAd
            if (r1 == 0) goto Lf
            r0.onAdLoad()
            return
        Lf:
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
    public void sendLossNotice(xyz.adscope.amps.base.AMPSBidResult r4) {
            r3 = this;
            xyz.adscope.ad.publish.ad.intersitital.InterstitialAd r0 = r3.mInterstitialAd     // Catch: java.lang.Exception -> L21
            if (r0 == 0) goto L21
            if (r4 != 0) goto L7
            goto L21
        L7:
            int r0 = r4.getEcpm()     // Catch: java.lang.Exception -> L21
            int r1 = r4.getReason()     // Catch: java.lang.Exception -> L21
            java.lang.String r4 = r4.getChannelName()     // Catch: java.lang.Exception -> L21
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L21
            r2 = -1
            java.util.Map r4 = xyz.adscope.ad.publish.ad.IBidding.BiddingPriceBuilder.buildLoseNoticeMap(r0, r2, r4, r1, r2)     // Catch: java.lang.Exception -> L21
            xyz.adscope.ad.publish.ad.intersitital.InterstitialAd r0 = r3.mInterstitialAd     // Catch: java.lang.Exception -> L21
            r0.notifyBidWin(r4)     // Catch: java.lang.Exception -> L21
        L21:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendWinNotice(xyz.adscope.amps.base.AMPSBidResult r4) {
            r3 = this;
            xyz.adscope.ad.publish.ad.intersitital.InterstitialAd r0 = r3.mInterstitialAd     // Catch: java.lang.Exception -> L1d
            if (r0 == 0) goto L1d
            if (r4 != 0) goto L7
            goto L1d
        L7:
            int r0 = r0.getECPM()     // Catch: java.lang.Exception -> L1d
            int r1 = r4.getEcpm()     // Catch: java.lang.Exception -> L1d
            java.lang.String r4 = r4.getChannelName()     // Catch: java.lang.Exception -> L1d
            r2 = -1
            java.util.Map r4 = xyz.adscope.ad.publish.ad.IBidding.BiddingPriceBuilder.buildWinNoticeMap(r0, r1, r4, r2)     // Catch: java.lang.Exception -> L1d
            xyz.adscope.ad.publish.ad.intersitital.InterstitialAd r0 = r3.mInterstitialAd     // Catch: java.lang.Exception -> L1d
            r0.notifyBidWin(r4)     // Catch: java.lang.Exception -> L1d
        L1d:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void showAd(android.app.Activity r2) {
            r1 = this;
            xyz.adscope.ad.publish.ad.intersitital.InterstitialAd r0 = r1.mInterstitialAd
            if (r0 == 0) goto Lb
            if (r2 != 0) goto L7
            goto Lb
        L7:
            r0.showAd(r2)
            return
        Lb:
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r2 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_AD_CONTAINER_NULL
            java.lang.String r0 = r2.getErrorCode()
            java.lang.String r2 = r2.getErrorMsg()
            r1.onAdShowFailed(r0, r2)
            return
    }

    @Override // xyz.adscope.amps.ad.interstitial.adapter.AMPSInterstitialAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public void startBid(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.inner.AMPSAdBiddingListener r3) {
            r0 = this;
            super.startBid(r1, r2, r3)
            r0.initSDK()
            return
    }
}
