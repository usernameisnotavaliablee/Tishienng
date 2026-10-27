package xyz.adscope.amps.adapter.gdt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class GDTBannerAdapter extends xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdapter {
    private com.qq.e.ads.banner2.UnifiedBannerView mBannerView;
    private xyz.adscope.amps.adapter.gdt.model.BidResponseModel mBidResponseModel;
    private java.lang.String mToken;
    private com.qq.e.ads.banner2.UnifiedBannerADListener unifiedBannerADListener;




    public GDTBannerAdapter() {
            r1 = this;
            r1.<init>()
            xyz.adscope.amps.adapter.gdt.GDTBannerAdapter$2 r0 = new xyz.adscope.amps.adapter.gdt.GDTBannerAdapter$2
            r0.<init>(r1)
            r1.unifiedBannerADListener = r0
            return
    }

    public static /* synthetic */ com.qq.e.ads.banner2.UnifiedBannerView access$000(xyz.adscope.amps.adapter.gdt.GDTBannerAdapter r0) {
            com.qq.e.ads.banner2.UnifiedBannerView r0 = r0.mBannerView
            return r0
    }

    public static /* synthetic */ java.lang.String access$102(xyz.adscope.amps.adapter.gdt.GDTBannerAdapter r0, java.lang.String r1) {
            r0.mToken = r1
            return r1
    }

    public static /* synthetic */ xyz.adscope.amps.adapter.gdt.model.BidResponseModel access$202(xyz.adscope.amps.adapter.gdt.GDTBannerAdapter r0, xyz.adscope.amps.adapter.gdt.model.BidResponseModel r1) {
            r0.mBidResponseModel = r1
            return r1
    }

    private android.view.ViewGroup.LayoutParams getBannerSize() {
            r3 = this;
            int r0 = r3.expressViewWidth
            if (r0 > 0) goto Lc
            android.content.Context r0 = r3.mContext
            int r0 = xyz.adscope.amps.tool.util.AMPSScreenUtil.getScreenWidth(r0)
            r3.expressViewWidth = r0
        Lc:
            int r0 = r3.expressViewHeight
            if (r0 > 0) goto L1d
            int r0 = r3.expressViewWidth
            float r0 = (float) r0
            r1 = 1087163597(0x40cccccd, float:6.4)
            float r0 = r0 / r1
            int r0 = java.lang.Math.round(r0)
            r3.expressViewHeight = r0
        L1d:
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            int r1 = r3.expressViewWidth
            int r2 = r3.expressViewHeight
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static com.qq.e.comm.constants.LoadAdParams getLoadAdParams(java.lang.String r2) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "custom_key"
            r0.put(r1, r2)
            java.lang.String r2 = "staIn"
            java.lang.String r1 = "com.qq.e.demo"
            r0.put(r2, r1)
            java.lang.String r2 = "thrmei"
            java.lang.String r1 = "29232329"
            r0.put(r2, r1)
            com.qq.e.comm.constants.LoadAdParams r2 = new com.qq.e.comm.constants.LoadAdParams
            r2.<init>()
            r2.setDevExtra(r0)
            return r2
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.gdt.GDTInitMediation r0 = xyz.adscope.amps.adapter.gdt.GDTInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            r2 = 0
            r0.initSDK(r1, r2)
            return
    }

    private void loadBannerAd() {
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GDTSDK start loadBannerAd spaceId:"
            r0.append(r1)
            java.lang.String r1 = r10.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            java.lang.String r0 = r10.mToken
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L30
            com.qq.e.ads.banner2.UnifiedBannerView r0 = new com.qq.e.ads.banner2.UnifiedBannerView
            android.content.Context r1 = r10.mContext
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r2 = r10.mSpaceId
            com.qq.e.ads.banner2.UnifiedBannerADListener r3 = r10.unifiedBannerADListener
            r0.<init>(r1, r2, r3)
            r10.mBannerView = r0
            goto L43
        L30:
            com.qq.e.ads.banner2.UnifiedBannerView r4 = new com.qq.e.ads.banner2.UnifiedBannerView
            android.content.Context r0 = r10.mContext
            r5 = r0
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.String r6 = r10.mSpaceId
            com.qq.e.ads.banner2.UnifiedBannerADListener r7 = r10.unifiedBannerADListener
            java.lang.String r9 = r10.mToken
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r10.mBannerView = r4
        L43:
            com.qq.e.ads.banner2.UnifiedBannerView r0 = r10.mBannerView
            xyz.adscope.amps.adapter.gdt.GDTBannerAdapter$1 r1 = new xyz.adscope.amps.adapter.gdt.GDTBannerAdapter$1
            r1.<init>(r10)
            r0.setNegativeFeedbackListener(r1)
            com.qq.e.ads.banner2.UnifiedBannerView r0 = r10.mBannerView
            r0.loadAD()
            return
    }

    private void startS2SBidding() {
            r6 = this;
            android.content.Context r0 = r6.mContext
            java.lang.String r1 = r6.mServerUrl
            java.lang.String r2 = r6.mAppId
            java.lang.String r3 = r6.mSpaceId
            int r4 = r6.mFloorEcpm
            xyz.adscope.amps.adapter.gdt.GDTBannerAdapter$3 r5 = new xyz.adscope.amps.adapter.gdt.GDTBannerAdapter$3
            r5.<init>(r6)
            xyz.adscope.amps.adapter.gdt.util.GDTBiddingRequestUtil.getBidResponse(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r1 = this;
            super.destroy()
            com.qq.e.ads.banner2.UnifiedBannerView r0 = r1.mBannerView
            if (r0 == 0) goto La
            r0.destroy()
        La:
            r0 = 0
            r1.mBannerView = r0
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
            r1 = this;
            com.qq.e.ads.banner2.UnifiedBannerView r0 = r1.mBannerView
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
            com.qq.e.ads.banner2.UnifiedBannerView r0 = r1.mBannerView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.isValid()
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdapter
    public void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdAdapterListener r3) {
            r0 = this;
            super.loadNetworkAd2(r1, r2, r3)
            boolean r1 = r0.isC2SAdSource()
            if (r1 == 0) goto L11
            com.qq.e.ads.banner2.UnifiedBannerView r1 = r0.mBannerView
            if (r1 == 0) goto L11
            r0.onAdLoad()
            return
        L11:
            r0.initSDK()
            r0.loadBannerAd()
            return
    }

    @Override // xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public /* bridge */ /* synthetic */ void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdAdapterListener r3) {
            r0 = this;
            xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdAdapterListener r3 = (xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdAdapterListener) r3
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
            com.qq.e.ads.banner2.UnifiedBannerView r0 = r3.mBannerView     // Catch: java.lang.Exception -> L2b
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
            com.qq.e.ads.banner2.UnifiedBannerView r2 = r1.mBannerView     // Catch: java.lang.Exception -> L22
            if (r2 != 0) goto L5
            goto L22
        L5:
            int r2 = r2.getECPM()     // Catch: java.lang.Exception -> L22
            boolean r0 = r1.isC2SAdSource()     // Catch: java.lang.Exception -> L22
            if (r0 == 0) goto L15
            com.qq.e.ads.banner2.UnifiedBannerView r0 = r1.mBannerView     // Catch: java.lang.Exception -> L22
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

    @Override // xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public void showAd(android.view.ViewGroup r3) {
            r2 = this;
            com.qq.e.ads.banner2.UnifiedBannerView r0 = r2.mBannerView
            if (r0 == 0) goto Lf
            if (r3 != 0) goto L7
            goto Lf
        L7:
            android.view.ViewGroup$LayoutParams r1 = r2.getBannerSize()
            r3.addView(r0, r1)
            return
        Lf:
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r3 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_AD_CONTAINER_NULL
            java.lang.String r0 = r3.getErrorCode()
            java.lang.String r3 = r3.getErrorMsg()
            r2.onAdShowFailed(r0, r3)
            return
    }

    @Override // xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public void startBid(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.inner.AMPSAdBiddingListener r3) {
            r0 = this;
            super.startBid(r1, r2, r3)
            r0.initSDK()
            boolean r1 = r0.isC2SAdSource()
            if (r1 == 0) goto L10
            r0.loadBannerAd()
            return
        L10:
            boolean r1 = r0.isS2SAdSource()
            if (r1 == 0) goto L19
            r0.startS2SBidding()
        L19:
            return
    }
}
