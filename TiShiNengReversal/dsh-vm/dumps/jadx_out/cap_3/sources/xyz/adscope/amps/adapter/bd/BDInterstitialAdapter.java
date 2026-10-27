package xyz.adscope.amps.adapter.bd;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BDInterstitialAdapter extends xyz.adscope.amps.ad.interstitial.adapter.AMPSInterstitialAdapter {
    private com.baidu.mobads.sdk.api.ExpressInterstitialAd mExpressInterstitialAd;
    private com.baidu.mobads.sdk.api.ExpressInterstitialListener mExpressInterstitialListener;




    public BDInterstitialAdapter() {
            r1 = this;
            r1.<init>()
            xyz.adscope.amps.adapter.bd.BDInterstitialAdapter$3 r0 = new xyz.adscope.amps.adapter.bd.BDInterstitialAdapter$3
            r0.<init>(r1)
            r1.mExpressInterstitialListener = r0
            return
    }

    public static /* synthetic */ com.baidu.mobads.sdk.api.ExpressInterstitialAd access$000(xyz.adscope.amps.adapter.bd.BDInterstitialAdapter r0) {
            com.baidu.mobads.sdk.api.ExpressInterstitialAd r0 = r0.mExpressInterstitialAd
            return r0
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.bd.BDInitMediation r0 = xyz.adscope.amps.adapter.bd.BDInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            r2 = 0
            r0.initSDK(r1, r2)
            r3.loadInterstitialAd()
            return
    }

    private void loadInterstitialAd() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BDSDK start loadInterstitialAd spaceId:"
            r0.append(r1)
            java.lang.String r1 = r3.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            com.baidu.mobads.sdk.api.ExpressInterstitialAd r0 = new com.baidu.mobads.sdk.api.ExpressInterstitialAd
            android.content.Context r1 = r3.mContext
            java.lang.String r2 = r3.mSpaceId
            r0.<init>(r1, r2)
            r3.mExpressInterstitialAd = r0
            com.baidu.mobads.sdk.api.ExpressInterstitialListener r1 = r3.mExpressInterstitialListener
            r0.setLoadListener(r1)
            com.baidu.mobads.sdk.api.ExpressInterstitialAd r0 = r3.mExpressInterstitialAd
            r0.load()
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r1 = this;
            super.destroy()
            com.baidu.mobads.sdk.api.ExpressInterstitialAd r0 = r1.mExpressInterstitialAd     // Catch: java.lang.Exception -> Ld
            if (r0 == 0) goto La
            r0.destroy()     // Catch: java.lang.Exception -> Ld
        La:
            r0 = 0
            r1.mExpressInterstitialAd = r0     // Catch: java.lang.Exception -> Ld
        Ld:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public boolean isValid() {
            r1 = this;
            com.baidu.mobads.sdk.api.ExpressInterstitialAd r0 = r1.mExpressInterstitialAd
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.isReady()
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xyz.adscope.amps.ad.interstitial.adapter.AMPSInterstitialAdapter
    public void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.interstitial.adapter.AMPSInterstitialAdAdapterListener r3) {
            r0 = this;
            super.loadNetworkAd2(r1, r2, r3)
            boolean r1 = r0.isBidding
            if (r1 == 0) goto Lf
            com.baidu.mobads.sdk.api.ExpressInterstitialAd r1 = r0.mExpressInterstitialAd
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
            com.baidu.mobads.sdk.api.ExpressInterstitialAd r0 = r3.mExpressInterstitialAd     // Catch: java.lang.Exception -> L19
            if (r0 == 0) goto L19
            if (r4 != 0) goto L7
            goto L19
        L7:
            xyz.adscope.amps.adapter.bd.BDInterstitialAdapter$2 r0 = new xyz.adscope.amps.adapter.bd.BDInterstitialAdapter$2     // Catch: java.lang.Exception -> L19
            r0.<init>(r3)     // Catch: java.lang.Exception -> L19
            com.baidu.mobads.sdk.api.ExpressInterstitialAd r1 = r3.mExpressInterstitialAd     // Catch: java.lang.Exception -> L19
            xyz.adscope.amps.adapter.bd.BDInitMediation r2 = xyz.adscope.amps.adapter.bd.BDInitMediation.getInstance()     // Catch: java.lang.Exception -> L19
            java.util.LinkedHashMap r4 = r2.getWinInfo(r4)     // Catch: java.lang.Exception -> L19
            r1.biddingFail(r4, r0)     // Catch: java.lang.Exception -> L19
        L19:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendWinNotice(xyz.adscope.amps.base.AMPSBidResult r4) {
            r3 = this;
            com.baidu.mobads.sdk.api.ExpressInterstitialAd r0 = r3.mExpressInterstitialAd     // Catch: java.lang.Exception -> L19
            if (r0 == 0) goto L19
            if (r4 != 0) goto L7
            goto L19
        L7:
            xyz.adscope.amps.adapter.bd.BDInterstitialAdapter$1 r0 = new xyz.adscope.amps.adapter.bd.BDInterstitialAdapter$1     // Catch: java.lang.Exception -> L19
            r0.<init>(r3)     // Catch: java.lang.Exception -> L19
            com.baidu.mobads.sdk.api.ExpressInterstitialAd r1 = r3.mExpressInterstitialAd     // Catch: java.lang.Exception -> L19
            xyz.adscope.amps.adapter.bd.BDInitMediation r2 = xyz.adscope.amps.adapter.bd.BDInitMediation.getInstance()     // Catch: java.lang.Exception -> L19
            java.util.LinkedHashMap r4 = r2.getSecondInfo(r4)     // Catch: java.lang.Exception -> L19
            r1.biddingSuccess(r4, r0)     // Catch: java.lang.Exception -> L19
        L19:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void showAd(android.app.Activity r2) {
            r1 = this;
            com.baidu.mobads.sdk.api.ExpressInterstitialAd r0 = r1.mExpressInterstitialAd
            if (r0 == 0) goto L13
            if (r2 == 0) goto L13
            boolean r0 = r0.isReady()
            if (r0 != 0) goto Ld
            goto L13
        Ld:
            com.baidu.mobads.sdk.api.ExpressInterstitialAd r0 = r1.mExpressInterstitialAd
            r0.show(r2)
            return
        L13:
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
