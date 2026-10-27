package xyz.adscope.amps.adapter.bz;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BZSplashAdapter extends xyz.adscope.amps.ad.splash.adapter.AMPSSplashAdapter {
    private com.beizi.fusion.SplashAd mSplashAd;


    public BZSplashAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ com.beizi.fusion.SplashAd access$000(xyz.adscope.amps.adapter.bz.BZSplashAdapter r0) {
            com.beizi.fusion.SplashAd r0 = r0.mSplashAd
            return r0
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.bz.BZInitMediation r0 = xyz.adscope.amps.adapter.bz.BZInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            r2 = 0
            r0.initSDK(r1, r2)
            r3.loadSplashAd()
            return
    }

    private void loadSplashAd() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BZSDK start loadSplashAd spaceId:"
            r0.append(r1)
            java.lang.String r1 = r9.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            com.beizi.fusion.SplashAd r2 = new com.beizi.fusion.SplashAd
            android.content.Context r3 = r9.mContext
            java.lang.String r5 = r9.mSpaceId
            xyz.adscope.amps.adapter.bz.BZSplashAdapter$1 r6 = new xyz.adscope.amps.adapter.bz.BZSplashAdapter$1
            r6.<init>(r9)
            int r0 = r9.mTimeout
            long r7 = (long) r0
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r9.mSplashAd = r2
            int r0 = r9.viewWidthDp
            int r1 = r9.viewHeightDp
            r2.loadAd(r0, r1)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r2 = this;
            com.beizi.fusion.SplashAd r0 = r2.mSplashAd
            if (r0 == 0) goto L9
            android.content.Context r1 = r2.mContext
            r0.cancel(r1)
        L9:
            r0 = 0
            r2.mSplashAd = r0
            super.destroy()
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public java.lang.String getMediaCustomExtraInfo() {
            r2 = this;
            com.beizi.fusion.SplashAd r0 = r2.mSplashAd
            if (r0 != 0) goto L9
            java.lang.String r0 = super.getMediaCustomExtraInfo()
            return r0
        L9:
            java.lang.String r0 = r0.getCustomExtraData()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L17
            java.lang.String r0 = super.getMediaCustomExtraInfo()
        L17:
            return r0
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public boolean isValid() {
            r1 = this;
            com.beizi.fusion.SplashAd r0 = r1.mSplashAd
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
            boolean r1 = r0.isBidding
            if (r1 == 0) goto Lf
            com.beizi.fusion.SplashAd r1 = r0.mSplashAd
            if (r1 == 0) goto Lf
            r0.onAdLoad()
            return
        Lf:
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
    public void sendLossNotice(xyz.adscope.amps.base.AMPSBidResult r2) {
            r1 = this;
            com.beizi.fusion.SplashAd r0 = r1.mSplashAd     // Catch: java.lang.Exception -> L17
            if (r0 == 0) goto L17
            if (r2 != 0) goto L7
            goto L17
        L7:
            xyz.adscope.amps.adapter.bz.BZInitMediation r0 = xyz.adscope.amps.adapter.bz.BZInitMediation.getInstance()     // Catch: java.lang.Exception -> L17
            java.util.Map r2 = r0.getLossInfo(r2)     // Catch: java.lang.Exception -> L17
            if (r2 != 0) goto L12
            goto L17
        L12:
            com.beizi.fusion.SplashAd r0 = r1.mSplashAd     // Catch: java.lang.Exception -> L17
            r0.sendLossNotificationWithInfo(r2)     // Catch: java.lang.Exception -> L17
        L17:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendWinNotice(xyz.adscope.amps.base.AMPSBidResult r2) {
            r1 = this;
            com.beizi.fusion.SplashAd r0 = r1.mSplashAd     // Catch: java.lang.Exception -> L17
            if (r0 == 0) goto L17
            if (r2 != 0) goto L7
            goto L17
        L7:
            xyz.adscope.amps.adapter.bz.BZInitMediation r0 = xyz.adscope.amps.adapter.bz.BZInitMediation.getInstance()     // Catch: java.lang.Exception -> L17
            java.util.Map r2 = r0.getWinInfo(r2)     // Catch: java.lang.Exception -> L17
            if (r2 != 0) goto L12
            goto L17
        L12:
            com.beizi.fusion.SplashAd r0 = r1.mSplashAd     // Catch: java.lang.Exception -> L17
            r0.sendWinNotificationWithInfo(r2)     // Catch: java.lang.Exception -> L17
        L17:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void showAd(android.view.ViewGroup r2) {
            r1 = this;
            com.beizi.fusion.SplashAd r0 = r1.mSplashAd
            if (r0 == 0) goto Lb
            if (r2 != 0) goto L7
            goto Lb
        L7:
            r0.show(r2)
            return
        Lb:
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r2 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_AD_CONTAINER_NULL
            java.lang.String r0 = r2.getErrorCode()
            java.lang.String r2 = r2.getErrorMsg()
            r1.onAdShowFailed(r0, r2)
            return
    }

    @Override // xyz.adscope.amps.ad.splash.adapter.AMPSSplashAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public void startBid(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.inner.AMPSAdBiddingListener r3) {
            r0 = this;
            super.startBid(r1, r2, r3)
            r0.initSDK()
            return
    }
}
