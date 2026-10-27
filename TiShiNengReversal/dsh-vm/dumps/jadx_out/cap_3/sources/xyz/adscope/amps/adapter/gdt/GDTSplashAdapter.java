package xyz.adscope.amps.adapter.gdt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class GDTSplashAdapter extends xyz.adscope.amps.ad.splash.adapter.AMPSSplashAdapter {
    private xyz.adscope.amps.adapter.gdt.model.BidResponseModel mBidResponseModel;
    private com.qq.e.ads.splash.SplashAD mSplashAd;
    private java.lang.String mToken;
    private java.lang.String supportZoomOut;



    public GDTSplashAdapter() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.supportZoomOut = r0
            return
    }

    public static /* synthetic */ com.qq.e.ads.splash.SplashAD access$000(xyz.adscope.amps.adapter.gdt.GDTSplashAdapter r0) {
            com.qq.e.ads.splash.SplashAD r0 = r0.mSplashAd
            return r0
    }

    public static /* synthetic */ java.lang.String access$102(xyz.adscope.amps.adapter.gdt.GDTSplashAdapter r0, java.lang.String r1) {
            r0.mToken = r1
            return r1
    }

    public static /* synthetic */ xyz.adscope.amps.adapter.gdt.model.BidResponseModel access$202(xyz.adscope.amps.adapter.gdt.GDTSplashAdapter r0, xyz.adscope.amps.adapter.gdt.model.BidResponseModel r1) {
            r0.mBidResponseModel = r1
            return r1
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.gdt.GDTInitMediation r0 = xyz.adscope.amps.adapter.gdt.GDTInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            r2 = 0
            r0.initSDK(r1, r2)
            return
    }

    private void loadSplashAd() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GDTSDK start loadSplashAd spaceId:"
            r0.append(r1)
            java.lang.String r1 = r8.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            xyz.adscope.amps.adapter.gdt.GDTSplashAdapter$1 r5 = new xyz.adscope.amps.adapter.gdt.GDTSplashAdapter$1
            r5.<init>(r8)
            java.lang.String r0 = r8.mToken
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L33
            com.qq.e.ads.splash.SplashAD r0 = new com.qq.e.ads.splash.SplashAD
            android.content.Context r1 = r8.mContext
            java.lang.String r2 = r8.mSpaceId
            int r3 = r8.mTimeout
            r0.<init>(r1, r2, r5, r3)
            r8.mSplashAd = r0
            goto L42
        L33:
            com.qq.e.ads.splash.SplashAD r2 = new com.qq.e.ads.splash.SplashAD
            android.content.Context r3 = r8.mContext
            java.lang.String r4 = r8.mSpaceId
            int r6 = r8.mTimeout
            java.lang.String r7 = r8.mToken
            r2.<init>(r3, r4, r5, r6, r7)
            r8.mSplashAd = r2
        L42:
            com.qq.e.ads.splash.SplashAD r0 = r8.mSplashAd
            r0.fetchAdOnly()
            return
    }

    private void startS2SBidding() {
            r6 = this;
            android.content.Context r0 = r6.mContext
            java.lang.String r1 = r6.mServerUrl
            java.lang.String r2 = r6.mAppId
            java.lang.String r3 = r6.mSpaceId
            int r4 = r6.mFloorEcpm
            xyz.adscope.amps.adapter.gdt.GDTSplashAdapter$2 r5 = new xyz.adscope.amps.adapter.gdt.GDTSplashAdapter$2
            r5.<init>(r6)
            xyz.adscope.amps.adapter.gdt.util.GDTBiddingRequestUtil.getBidResponse(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r1 = this;
            super.destroy()
            r0 = 0
            r1.mSplashAd = r0
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
            r1 = this;
            com.qq.e.ads.splash.SplashAD r0 = r1.mSplashAd
            if (r0 == 0) goto L9
            java.util.Map r0 = r0.getExtraInfo()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public boolean isValid() {
            r1 = this;
            com.qq.e.ads.splash.SplashAD r0 = r1.mSplashAd
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.isValid()
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xyz.adscope.amps.ad.splash.adapter.AMPSSplashAdapter
    public void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.splash.adapter.AMPSSplashAdAdapterListener r3) {
            r0 = this;
            super.loadNetworkAd2(r1, r2, r3)
            java.lang.String r1 = r2.getZoomOut()
            r0.supportZoomOut = r1
            boolean r1 = r0.isC2SAdSource()
            if (r1 == 0) goto L17
            com.qq.e.ads.splash.SplashAD r1 = r0.mSplashAd
            if (r1 == 0) goto L17
            r0.onAdLoad()
            return
        L17:
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
    public void sendLossNotice(xyz.adscope.amps.base.AMPSBidResult r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L2b
        L3:
            boolean r0 = r3.isC2SAdSource()     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L16
            com.qq.e.ads.splash.SplashAD r0 = r3.mSplashAd     // Catch: java.lang.Exception -> L2b
            if (r0 != 0) goto Le
            goto L2b
        Le:
            int r4 = r4.getReason()     // Catch: java.lang.Exception -> L2b
            xyz.adscope.amps.adapter.gdt.GDTAdManagerHolder.sendLossNotification(r0, r4)     // Catch: java.lang.Exception -> L2b
            return
        L16:
            boolean r0 = r3.isS2SAdSource()     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L2b
            xyz.adscope.amps.adapter.gdt.model.BidResponseModel r0 = r3.mBidResponseModel     // Catch: java.lang.Exception -> L2b
            int r1 = r4.getEcpm()     // Catch: java.lang.Exception -> L2b
            int r4 = r4.getReason()     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = r3.mPublicKey     // Catch: java.lang.Exception -> L2b
            xyz.adscope.amps.adapter.gdt.util.GDTBiddingRequestUtil.sendLossNotice(r0, r1, r4, r2)     // Catch: java.lang.Exception -> L2b
        L2b:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendWinNotice(xyz.adscope.amps.base.AMPSBidResult r2) {
            r1 = this;
            com.qq.e.ads.splash.SplashAD r2 = r1.mSplashAd     // Catch: java.lang.Exception -> L22
            if (r2 != 0) goto L5
            goto L22
        L5:
            int r2 = r2.getECPM()     // Catch: java.lang.Exception -> L22
            boolean r0 = r1.isC2SAdSource()     // Catch: java.lang.Exception -> L22
            if (r0 == 0) goto L15
            com.qq.e.ads.splash.SplashAD r0 = r1.mSplashAd     // Catch: java.lang.Exception -> L22
            xyz.adscope.amps.adapter.gdt.GDTAdManagerHolder.sendWinNotification(r0, r2)     // Catch: java.lang.Exception -> L22
            return
        L15:
            boolean r2 = r1.isS2SAdSource()     // Catch: java.lang.Exception -> L22
            if (r2 == 0) goto L22
            xyz.adscope.amps.adapter.gdt.model.BidResponseModel r2 = r1.mBidResponseModel     // Catch: java.lang.Exception -> L22
            java.lang.String r0 = r1.mPublicKey     // Catch: java.lang.Exception -> L22
            xyz.adscope.amps.adapter.gdt.util.GDTBiddingRequestUtil.sendWinNotice(r2, r0)     // Catch: java.lang.Exception -> L22
        L22:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void showAd(android.view.ViewGroup r2) {
            r1 = this;
            com.qq.e.ads.splash.SplashAD r0 = r1.mSplashAd
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
