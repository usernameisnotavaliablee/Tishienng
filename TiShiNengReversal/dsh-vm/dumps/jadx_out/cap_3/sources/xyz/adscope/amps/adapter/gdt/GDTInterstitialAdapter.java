package xyz.adscope.amps.adapter.gdt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class GDTInterstitialAdapter extends xyz.adscope.amps.ad.interstitial.adapter.AMPSInterstitialAdapter {
    private xyz.adscope.amps.adapter.gdt.model.BidResponseModel mBidResponseModel;
    private java.lang.String mToken;
    private com.qq.e.ads.interstitial2.UnifiedInterstitialAD mUnifiedInterstitialAD;



    public class GDTUnifiedInterstitialADListener implements com.qq.e.ads.interstitial2.UnifiedInterstitialADListener {
        public final /* synthetic */ xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter this$0;

        private GDTUnifiedInterstitialADListener(xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ GDTUnifiedInterstitialADListener(xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter r1, xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public void onADClicked() {
                r2 = this;
                java.lang.String r0 = "amps_log_tag"
                java.lang.String r1 = "GDTSDK loadInterstitialAd onADClicked"
                xyz.adscope.amps.tool.AMPSLogUtil.d(r0, r1)
                xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter r0 = r2.this$0
                r0.onAdClicked()
                return
        }

        public void onADClosed() {
                r2 = this;
                java.lang.String r0 = "amps_log_tag"
                java.lang.String r1 = "GDTSDK loadInterstitialAd onADClosed"
                xyz.adscope.amps.tool.AMPSLogUtil.d(r0, r1)
                xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter r0 = r2.this$0
                r0.onAdDismiss()
                return
        }

        public void onADExposure() {
                r2 = this;
                java.lang.String r0 = "amps_log_tag"
                java.lang.String r1 = "GDTSDK loadInterstitialAd onADExposure"
                xyz.adscope.amps.tool.AMPSLogUtil.d(r0, r1)
                xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter r0 = r2.this$0
                r0.onAdShow()
                return
        }

        public void onADLeftApplication() {
                r2 = this;
                java.lang.String r0 = "amps_log_tag"
                java.lang.String r1 = "GDTSDK loadInterstitialAd onADLeftApplication"
                xyz.adscope.amps.tool.AMPSLogUtil.d(r0, r1)
                return
        }

        public void onADOpened() {
                r0 = this;
                return
        }

        public void onADReceive() {
                r2 = this;
                java.lang.String r0 = "amps_log_tag"
                java.lang.String r1 = "GDTSDK loadInterstitialAd onADReceive"
                xyz.adscope.amps.tool.AMPSLogUtil.d(r0, r1)
                return
        }

        public void onNoAD(com.qq.e.comm.util.AdError r4) {
                r3 = this;
                if (r4 == 0) goto Lf
                int r0 = r4.getErrorCode()
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.String r4 = r4.getErrorMsg()
                goto L12
            Lf:
                java.lang.String r0 = ""
                r4 = r0
            L12:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "GDTSDK loadInterstitialAd onNoAD code : "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r2 = " , msg : "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "amps_log_tag"
                xyz.adscope.amps.tool.AMPSLogUtil.d(r2, r1)
                xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter r1 = r3.this$0
                r1.onAdFailed(r0, r4)
                return
        }

        public void onRenderFail() {
                r3 = this;
                java.lang.String r0 = "amps_log_tag"
                java.lang.String r1 = "GDTSDK loadInterstitialAd onRenderFail"
                xyz.adscope.amps.tool.AMPSLogUtil.d(r0, r1)
                xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter r0 = r3.this$0
                xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r1 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_AD_RENDER_FAIL
                java.lang.String r2 = r1.getErrorCode()
                java.lang.String r1 = r1.getErrorMsg()
                r0.onAdShowFailed(r2, r1)
                return
        }

        public void onRenderSuccess() {
                r2 = this;
                java.lang.String r0 = "amps_log_tag"
                java.lang.String r1 = "GDTSDK loadInterstitialAd onRenderSuccess"
                xyz.adscope.amps.tool.AMPSLogUtil.d(r0, r1)
                xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter r0 = r2.this$0
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter.access$100(r0)
                if (r0 == 0) goto L1a
                xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter r0 = r2.this$0
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter.access$100(r0)
                int r0 = r0.getECPM()
                goto L1b
            L1a:
                r0 = 0
            L1b:
                xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter r1 = r2.this$0
                boolean r1 = r1.isC2SAdSource()
                if (r1 == 0) goto L29
                xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter r1 = r2.this$0
                r1.onC2SBiddingSuccess(r0)
                return
            L29:
                xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter r0 = r2.this$0
                r0.onAdLoad()
                return
        }

        public void onVideoCached() {
                r2 = this;
                java.lang.String r0 = "amps_log_tag"
                java.lang.String r1 = "GDTSDK loadInterstitialAd onVideoCached"
                xyz.adscope.amps.tool.AMPSLogUtil.d(r0, r1)
                return
        }
    }

    public GDTInterstitialAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ com.qq.e.ads.interstitial2.UnifiedInterstitialAD access$100(xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter r0) {
            com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = r0.mUnifiedInterstitialAD
            return r0
    }

    public static /* synthetic */ java.lang.String access$202(xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter r0, java.lang.String r1) {
            r0.mToken = r1
            return r1
    }

    public static /* synthetic */ xyz.adscope.amps.adapter.gdt.model.BidResponseModel access$302(xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter r0, xyz.adscope.amps.adapter.gdt.model.BidResponseModel r1) {
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

    private void loadInterstitialAd() {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GDTSDK start loadInterstitialAd spaceId:"
            r0.append(r1)
            java.lang.String r1 = r11.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            java.lang.String r0 = r11.mToken
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L34
            com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = new com.qq.e.ads.interstitial2.UnifiedInterstitialAD
            android.content.Context r2 = r11.mContext
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.String r3 = r11.mSpaceId
            xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter$GDTUnifiedInterstitialADListener r4 = new xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter$GDTUnifiedInterstitialADListener
            r4.<init>(r11, r1)
            r0.<init>(r2, r3, r4)
            r11.mUnifiedInterstitialAD = r0
            goto L4a
        L34:
            com.qq.e.ads.interstitial2.UnifiedInterstitialAD r5 = new com.qq.e.ads.interstitial2.UnifiedInterstitialAD
            android.content.Context r0 = r11.mContext
            r6 = r0
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.String r7 = r11.mSpaceId
            xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter$GDTUnifiedInterstitialADListener r8 = new xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter$GDTUnifiedInterstitialADListener
            r8.<init>(r11, r1)
            java.lang.String r10 = r11.mToken
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r11.mUnifiedInterstitialAD = r5
        L4a:
            r11.setMediaListener()
            r11.setVideoOption()
            com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = r11.mUnifiedInterstitialAD
            r0.loadAD()
            return
    }

    private void setMediaListener() {
            r2 = this;
            com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = r2.mUnifiedInterstitialAD
            xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter$1 r1 = new xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter$1
            r1.<init>(r2)
            r0.setMediaListener(r1)
            return
    }

    private void setVideoOption() {
            r4 = this;
            com.qq.e.ads.cfg.VideoOption$Builder r0 = new com.qq.e.ads.cfg.VideoOption$Builder
            r0.<init>()
            int r1 = r4.autoPlayPolicy
            xyz.adscope.amps.common.AMPSEnum$AutoPlayEnum r2 = xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum.NO_AUTO_PLAY
            int r2 = r2.getAutoPlayValue()
            r3 = 1
            if (r1 != r2) goto L15
            r1 = 2
        L11:
            r0.setAutoPlayPolicy(r1)
            goto L2e
        L15:
            int r1 = r4.autoPlayPolicy
            xyz.adscope.amps.common.AMPSEnum$AutoPlayEnum r2 = xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum.WIFI_AUTO_PLAY
            int r2 = r2.getAutoPlayValue()
            if (r1 != r2) goto L21
            r1 = 0
            goto L11
        L21:
            int r1 = r4.autoPlayPolicy
            xyz.adscope.amps.common.AMPSEnum$AutoPlayEnum r2 = xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum.HAS_NET_AUTO_PLAY
            int r2 = r2.getAutoPlayValue()
            if (r1 != r2) goto L2e
            r0.setAutoPlayPolicy(r3)
        L2e:
            boolean r1 = r4.isVolumeOn
            r1 = r1 ^ r3
            r0.setAutoPlayMuted(r1)
            boolean r1 = r4.isVolumeOn
            r1 = r1 ^ r3
            r0.setDetailPageMuted(r1)
            com.qq.e.ads.interstitial2.UnifiedInterstitialAD r1 = r4.mUnifiedInterstitialAD
            if (r1 == 0) goto L4e
            com.qq.e.ads.cfg.VideoOption r0 = r0.build()
            r1.setVideoOption(r0)
            int r0 = r4.videoMaxTime
            if (r0 <= 0) goto L4e
            com.qq.e.ads.interstitial2.UnifiedInterstitialAD r1 = r4.mUnifiedInterstitialAD
            r1.setMaxVideoDuration(r0)
        L4e:
            return
    }

    private void startS2SBidding() {
            r6 = this;
            android.content.Context r0 = r6.mContext
            java.lang.String r1 = r6.mServerUrl
            java.lang.String r2 = r6.mAppId
            java.lang.String r3 = r6.mSpaceId
            int r4 = r6.mFloorEcpm
            xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter$2 r5 = new xyz.adscope.amps.adapter.gdt.GDTInterstitialAdapter$2
            r5.<init>(r6)
            xyz.adscope.amps.adapter.gdt.util.GDTBiddingRequestUtil.getBidResponse(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r1 = this;
            super.destroy()
            com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = r1.mUnifiedInterstitialAD
            if (r0 == 0) goto Lf
            r0.close()
            com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = r1.mUnifiedInterstitialAD
            r0.destroy()
        Lf:
            r0 = 0
            r1.mUnifiedInterstitialAD = r0
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
            r1 = this;
            com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = r1.mUnifiedInterstitialAD
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
            com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = r1.mUnifiedInterstitialAD
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.isValid()
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xyz.adscope.amps.ad.interstitial.adapter.AMPSInterstitialAdapter
    public void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.interstitial.adapter.AMPSInterstitialAdAdapterListener r3) {
            r0 = this;
            super.loadNetworkAd2(r1, r2, r3)
            boolean r1 = r0.isC2SAdSource()
            if (r1 == 0) goto L11
            com.qq.e.ads.interstitial2.UnifiedInterstitialAD r1 = r0.mUnifiedInterstitialAD
            if (r1 == 0) goto L11
            r0.onAdLoad()
            return
        L11:
            r0.initSDK()
            r0.loadInterstitialAd()
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
            if (r4 != 0) goto L3
            goto L2b
        L3:
            boolean r0 = r3.isC2SAdSource()     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L16
            com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = r3.mUnifiedInterstitialAD     // Catch: java.lang.Exception -> L2b
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
            com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = r1.mUnifiedInterstitialAD     // Catch: java.lang.Exception -> L22
            if (r2 != 0) goto L5
            goto L22
        L5:
            int r2 = r2.getECPM()     // Catch: java.lang.Exception -> L22
            boolean r0 = r1.isC2SAdSource()     // Catch: java.lang.Exception -> L22
            if (r0 == 0) goto L15
            com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = r1.mUnifiedInterstitialAD     // Catch: java.lang.Exception -> L22
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
    public void showAd(android.app.Activity r2) {
            r1 = this;
            com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = r1.mUnifiedInterstitialAD
            if (r0 == 0) goto L13
            if (r2 == 0) goto L13
            boolean r2 = r0.isValid()
            if (r2 != 0) goto Ld
            goto L13
        Ld:
            com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = r1.mUnifiedInterstitialAD
            r2.show()
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
            boolean r1 = r0.isC2SAdSource()
            if (r1 == 0) goto L10
            r0.loadInterstitialAd()
            return
        L10:
            boolean r1 = r0.isS2SAdSource()
            if (r1 == 0) goto L19
            r0.startS2SBidding()
        L19:
            return
    }
}
