package xyz.adscope.amps.adapter.gdt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class GDTNativeAdapter extends xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter {
    public java.util.Map<android.view.View, xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdExpressListener> ampsNativeAdExpressListenerMap;
    private java.util.List<com.qq.e.ads.nativ.NativeExpressADView> iNativeAdViews;
    private xyz.adscope.amps.adapter.gdt.model.BidResponseModel mBidResponseModel;
    private java.lang.String mToken;
    private com.qq.e.ads.nativ.NativeExpressAD nativeExpressAD;
    public com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener nativeExpressADListener;



    public GDTNativeAdapter() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.ampsNativeAdExpressListenerMap = r0
            xyz.adscope.amps.adapter.gdt.GDTNativeAdapter$1 r0 = new xyz.adscope.amps.adapter.gdt.GDTNativeAdapter$1
            r0.<init>(r1)
            r1.nativeExpressADListener = r0
            return
    }

    public static /* synthetic */ java.util.List access$000(xyz.adscope.amps.adapter.gdt.GDTNativeAdapter r0) {
            java.util.List<com.qq.e.ads.nativ.NativeExpressADView> r0 = r0.iNativeAdViews
            return r0
    }

    public static /* synthetic */ java.util.List access$002(xyz.adscope.amps.adapter.gdt.GDTNativeAdapter r0, java.util.List r1) {
            r0.iNativeAdViews = r1
            return r1
    }

    public static /* synthetic */ java.lang.String access$102(xyz.adscope.amps.adapter.gdt.GDTNativeAdapter r0, java.lang.String r1) {
            r0.mToken = r1
            return r1
    }

    public static /* synthetic */ xyz.adscope.amps.adapter.gdt.model.BidResponseModel access$202(xyz.adscope.amps.adapter.gdt.GDTNativeAdapter r0, xyz.adscope.amps.adapter.gdt.model.BidResponseModel r1) {
            r0.mBidResponseModel = r1
            return r1
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

    private com.qq.e.ads.nativ.ADSize getMyADSize() {
            r3 = this;
            int r0 = r3.expressViewWidthDp
            if (r0 > 0) goto L5
            r0 = -1
        L5:
            int r1 = r3.expressViewHeightDp
            if (r1 > 0) goto La
            r1 = -2
        La:
            com.qq.e.ads.nativ.ADSize r2 = new com.qq.e.ads.nativ.ADSize
            r2.<init>(r0, r1)
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

    private void loadNativeAd() {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GDTSDK start loadNativeAd spaceId:"
            r0.append(r1)
            java.lang.String r1 = r11.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            java.lang.String r0 = r11.mToken
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L32
            com.qq.e.ads.nativ.NativeExpressAD r0 = new com.qq.e.ads.nativ.NativeExpressAD
            android.content.Context r1 = r11.mContext
            com.qq.e.ads.nativ.ADSize r2 = r11.getMyADSize()
            java.lang.String r3 = r11.mSpaceId
            com.qq.e.ads.nativ.NativeExpressAD$NativeExpressADListener r4 = r11.nativeExpressADListener
            r0.<init>(r1, r2, r3, r4)
            r11.nativeExpressAD = r0
            goto L45
        L32:
            com.qq.e.ads.nativ.NativeExpressAD r5 = new com.qq.e.ads.nativ.NativeExpressAD
            android.content.Context r6 = r11.mContext
            com.qq.e.ads.nativ.ADSize r7 = r11.getMyADSize()
            java.lang.String r8 = r11.mSpaceId
            com.qq.e.ads.nativ.NativeExpressAD$NativeExpressADListener r9 = r11.nativeExpressADListener
            java.lang.String r10 = r11.mToken
            r5.<init>(r6, r7, r8, r9, r10)
            r11.nativeExpressAD = r5
        L45:
            com.qq.e.ads.cfg.VideoOption$Builder r0 = new com.qq.e.ads.cfg.VideoOption$Builder
            r0.<init>()
            int r1 = r11.autoPlayPolicy
            xyz.adscope.amps.common.AMPSEnum$AutoPlayEnum r2 = xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum.NO_AUTO_PLAY
            int r2 = r2.getAutoPlayValue()
            r3 = 1
            if (r1 != r2) goto L5a
            r1 = 2
        L56:
            r0.setAutoPlayPolicy(r1)
            goto L73
        L5a:
            int r1 = r11.autoPlayPolicy
            xyz.adscope.amps.common.AMPSEnum$AutoPlayEnum r2 = xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum.WIFI_AUTO_PLAY
            int r2 = r2.getAutoPlayValue()
            if (r1 != r2) goto L66
            r1 = 0
            goto L56
        L66:
            int r1 = r11.autoPlayPolicy
            xyz.adscope.amps.common.AMPSEnum$AutoPlayEnum r2 = xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum.HAS_NET_AUTO_PLAY
            int r2 = r2.getAutoPlayValue()
            if (r1 != r2) goto L73
            r0.setAutoPlayPolicy(r3)
        L73:
            boolean r1 = r11.isVolumeOn
            r1 = r1 ^ r3
            r0.setAutoPlayMuted(r1)
            boolean r1 = r11.isVolumeOn
            r1 = r1 ^ r3
            r0.setDetailPageMuted(r1)
            com.qq.e.ads.nativ.NativeExpressAD r1 = r11.nativeExpressAD
            com.qq.e.ads.cfg.VideoOption r0 = r0.build()
            r1.setVideoOption(r0)
            int r0 = r11.videoMaxTime
            if (r0 <= 0) goto L91
            com.qq.e.ads.nativ.NativeExpressAD r1 = r11.nativeExpressAD
            r1.setMaxVideoDuration(r0)
        L91:
            com.qq.e.ads.nativ.NativeExpressAD r0 = r11.nativeExpressAD
            int r1 = r11.adCount
            r2 = 0
            r0.loadAD(r1, r2)
            return
    }

    private void startS2SBidding() {
            r6 = this;
            android.content.Context r0 = r6.mContext
            java.lang.String r1 = r6.mServerUrl
            java.lang.String r2 = r6.mAppId
            java.lang.String r3 = r6.mSpaceId
            int r4 = r6.mFloorEcpm
            xyz.adscope.amps.adapter.gdt.GDTNativeAdapter$2 r5 = new xyz.adscope.amps.adapter.gdt.GDTNativeAdapter$2
            r5.<init>(r6)
            xyz.adscope.amps.adapter.gdt.util.GDTBiddingRequestUtil.getBidResponse(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r2 = this;
            super.destroy()
            com.qq.e.ads.nativ.NativeExpressAD r0 = r2.nativeExpressAD     // Catch: java.lang.Exception -> L1c
            r1 = 0
            if (r0 == 0) goto La
            r2.nativeExpressAD = r1     // Catch: java.lang.Exception -> L1c
        La:
            java.util.List<com.qq.e.ads.nativ.NativeExpressADView> r0 = r2.iNativeAdViews     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L13
            r0.clear()     // Catch: java.lang.Exception -> L1c
            r2.iNativeAdViews = r1     // Catch: java.lang.Exception -> L1c
        L13:
            java.util.Map<android.view.View, xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdExpressListener> r0 = r2.ampsNativeAdExpressListenerMap     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L1c
            r0.clear()     // Catch: java.lang.Exception -> L1c
            r2.ampsNativeAdExpressListenerMap = r1     // Catch: java.lang.Exception -> L1c
        L1c:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
            r3 = this;
            java.util.List<com.qq.e.ads.nativ.NativeExpressADView> r0 = r3.iNativeAdViews
            r1 = 0
            if (r0 == 0) goto L1d
            int r0 = r0.size()
            r2 = 1
            if (r0 >= r2) goto Ld
            goto L1d
        Ld:
            java.util.List<com.qq.e.ads.nativ.NativeExpressADView> r0 = r3.iNativeAdViews
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.qq.e.ads.nativ.NativeExpressADView r0 = (com.qq.e.ads.nativ.NativeExpressADView) r0
            if (r0 == 0) goto L1d
            java.util.Map r0 = r0.getExtraInfo()
            return r0
        L1d:
            return r1
    }

    @Override // xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter
    public java.util.List<xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo> getNativeListInfo() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.qq.e.ads.nativ.NativeExpressADView> r1 = r5.iNativeAdViews
            if (r1 == 0) goto L36
            int r1 = r1.size()
            if (r1 <= 0) goto L36
            java.util.List<com.qq.e.ads.nativ.NativeExpressADView> r1 = r5.iNativeAdViews
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()
            com.qq.e.ads.nativ.NativeExpressADView r2 = (com.qq.e.ads.nativ.NativeExpressADView) r2
            int r3 = r5.mAdEcpm
            boolean r4 = r5.isBidding
            if (r4 == 0) goto L2d
            if (r2 == 0) goto L2d
            int r3 = r2.getECPM()
        L2d:
            xyz.adscope.amps.adapter.gdt.data.GDTNativeAd r4 = new xyz.adscope.amps.adapter.gdt.data.GDTNativeAd
            r4.<init>(r2, r5, r3)
            r0.add(r4)
            goto L15
        L36:
            return r0
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public boolean isValid() {
            r2 = this;
            com.qq.e.ads.nativ.NativeExpressAD r0 = r2.nativeExpressAD
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.List<com.qq.e.ads.nativ.NativeExpressADView> r0 = r2.iNativeAdViews
            if (r0 == 0) goto L19
            int r0 = r0.size()
            if (r0 <= 0) goto L19
            java.util.List<com.qq.e.ads.nativ.NativeExpressADView> r0 = r2.iNativeAdViews
            java.lang.Object r0 = r0.get(r1)
            com.qq.e.ads.nativ.NativeExpressADView r0 = (com.qq.e.ads.nativ.NativeExpressADView) r0
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 != 0) goto L1d
            return r1
        L1d:
            boolean r0 = r0.isValid()
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter
    public void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener r3) {
            r0 = this;
            super.loadNetworkAd2(r1, r2, r3)
            boolean r1 = r0.isC2SAdSource()
            if (r1 == 0) goto L11
            com.qq.e.ads.nativ.NativeExpressAD r1 = r0.nativeExpressAD
            if (r1 == 0) goto L11
            r0.onAdLoad()
            return
        L11:
            r0.initSDK()
            r0.loadNativeAd()
            return
    }

    @Override // xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public /* bridge */ /* synthetic */ void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener r3) {
            r0 = this;
            xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener r3 = (xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener) r3
            r0.loadNetworkAd(r1, r2, r3)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendLossNotice(xyz.adscope.amps.base.AMPSBidResult r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L3d
        L3:
            boolean r0 = r3.isC2SAdSource()     // Catch: java.lang.Exception -> L3d
            if (r0 == 0) goto L28
            java.util.List<com.qq.e.ads.nativ.NativeExpressADView> r0 = r3.iNativeAdViews     // Catch: java.lang.Exception -> L3d
            if (r0 == 0) goto L3d
            int r0 = r0.size()     // Catch: java.lang.Exception -> L3d
            if (r0 != 0) goto L14
            goto L3d
        L14:
            java.util.List<com.qq.e.ads.nativ.NativeExpressADView> r0 = r3.iNativeAdViews     // Catch: java.lang.Exception -> L3d
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L3d
            com.qq.e.ads.nativ.NativeExpressADView r0 = (com.qq.e.ads.nativ.NativeExpressADView) r0     // Catch: java.lang.Exception -> L3d
            if (r0 != 0) goto L20
            goto L3d
        L20:
            int r4 = r4.getReason()     // Catch: java.lang.Exception -> L3d
            xyz.adscope.amps.adapter.gdt.GDTAdManagerHolder.sendLossNotification(r0, r4)     // Catch: java.lang.Exception -> L3d
            return
        L28:
            boolean r0 = r3.isS2SAdSource()     // Catch: java.lang.Exception -> L3d
            if (r0 == 0) goto L3d
            xyz.adscope.amps.adapter.gdt.model.BidResponseModel r0 = r3.mBidResponseModel     // Catch: java.lang.Exception -> L3d
            int r1 = r4.getEcpm()     // Catch: java.lang.Exception -> L3d
            int r4 = r4.getReason()     // Catch: java.lang.Exception -> L3d
            java.lang.String r2 = r3.mPublicKey     // Catch: java.lang.Exception -> L3d
            xyz.adscope.amps.adapter.gdt.util.GDTBiddingRequestUtil.sendLossNotice(r0, r1, r4, r2)     // Catch: java.lang.Exception -> L3d
        L3d:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendWinNotice(xyz.adscope.amps.base.AMPSBidResult r3) {
            r2 = this;
            java.util.List<com.qq.e.ads.nativ.NativeExpressADView> r3 = r2.iNativeAdViews     // Catch: java.lang.Exception -> L32
            if (r3 == 0) goto L32
            int r3 = r3.size()     // Catch: java.lang.Exception -> L32
            if (r3 != 0) goto Lb
            goto L32
        Lb:
            java.util.List<com.qq.e.ads.nativ.NativeExpressADView> r3 = r2.iNativeAdViews     // Catch: java.lang.Exception -> L32
            r0 = 0
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Exception -> L32
            com.qq.e.ads.nativ.NativeExpressADView r3 = (com.qq.e.ads.nativ.NativeExpressADView) r3     // Catch: java.lang.Exception -> L32
            if (r3 != 0) goto L17
            goto L32
        L17:
            int r0 = r3.getECPM()     // Catch: java.lang.Exception -> L32
            boolean r1 = r2.isC2SAdSource()     // Catch: java.lang.Exception -> L32
            if (r1 == 0) goto L25
            xyz.adscope.amps.adapter.gdt.GDTAdManagerHolder.sendWinNotification(r3, r0)     // Catch: java.lang.Exception -> L32
            return
        L25:
            boolean r3 = r2.isS2SAdSource()     // Catch: java.lang.Exception -> L32
            if (r3 == 0) goto L32
            xyz.adscope.amps.adapter.gdt.model.BidResponseModel r3 = r2.mBidResponseModel     // Catch: java.lang.Exception -> L32
            java.lang.String r0 = r2.mPublicKey     // Catch: java.lang.Exception -> L32
            xyz.adscope.amps.adapter.gdt.util.GDTBiddingRequestUtil.sendWinNotice(r3, r0)     // Catch: java.lang.Exception -> L32
        L32:
            return
    }

    public void setAMPSNativeAdExpressListener(android.view.View r2, xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdExpressListener r3) {
            r1 = this;
            if (r2 == 0) goto Lc
            if (r3 == 0) goto Lc
            java.util.Map<android.view.View, xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdExpressListener> r0 = r1.ampsNativeAdExpressListenerMap     // Catch: java.lang.Exception -> Lc
            if (r0 != 0) goto L9
            goto Lc
        L9:
            r0.put(r2, r3)     // Catch: java.lang.Exception -> Lc
        Lc:
            return
    }

    @Override // xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public void startBid(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.inner.AMPSAdBiddingListener r3) {
            r0 = this;
            super.startBid(r1, r2, r3)
            r0.initSDK()
            boolean r1 = r0.isC2SAdSource()
            if (r1 == 0) goto L10
            r0.loadNativeAd()
            return
        L10:
            boolean r1 = r0.isS2SAdSource()
            if (r1 == 0) goto L19
            r0.startS2SBidding()
        L19:
            return
    }
}
