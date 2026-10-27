package xyz.adscope.amps.adapter.ks;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class KSNativeAdapter extends xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter {
    private java.util.List<com.kwad.sdk.api.KsFeedAd> iNativeAdViews;
    private java.lang.String mBidResponse;
    private xyz.adscope.amps.adapter.ks.model.BidResponseModel mBidResponseModel;
    private java.lang.String mBidResponseV2;



    public KSNativeAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.util.List access$000(xyz.adscope.amps.adapter.ks.KSNativeAdapter r0) {
            java.util.List<com.kwad.sdk.api.KsFeedAd> r0 = r0.iNativeAdViews
            return r0
    }

    public static /* synthetic */ java.util.List access$002(xyz.adscope.amps.adapter.ks.KSNativeAdapter r0, java.util.List r1) {
            r0.iNativeAdViews = r1
            return r1
    }

    public static /* synthetic */ xyz.adscope.amps.adapter.ks.model.BidResponseModel access$102(xyz.adscope.amps.adapter.ks.KSNativeAdapter r0, xyz.adscope.amps.adapter.ks.model.BidResponseModel r1) {
            r0.mBidResponseModel = r1
            return r1
    }

    public static /* synthetic */ java.lang.String access$202(xyz.adscope.amps.adapter.ks.KSNativeAdapter r0, java.lang.String r1) {
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

    private void loadNativeAd() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "KSSDK start loadNativeAd spaceId:"
            r0.append(r1)
            java.lang.String r1 = r3.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            com.kwad.sdk.api.KsScene$Builder r0 = new com.kwad.sdk.api.KsScene$Builder
            java.lang.String r1 = r3.mSpaceId
            long r1 = java.lang.Long.parseLong(r1)
            r0.<init>(r1)
            java.lang.String r1 = r3.mBidResponse
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L31
            java.lang.String r1 = r3.mBidResponse
            r0.setBidResponse(r1)
            goto L3e
        L31:
            java.lang.String r1 = r3.mBidResponseV2
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L3e
            java.lang.String r1 = r3.mBidResponseV2
            r0.setBidResponseV2(r1)
        L3e:
            int r1 = r3.expressViewWidth
            r0.width(r1)
            int r1 = r3.adCount
            r0.adNum(r1)
            com.kwad.sdk.api.KsLoadManager r1 = com.kwad.sdk.api.KsAdSDK.getLoadManager()
            com.kwad.sdk.api.KsScene r0 = r0.build()
            xyz.adscope.amps.adapter.ks.KSNativeAdapter$1 r2 = new xyz.adscope.amps.adapter.ks.KSNativeAdapter$1
            r2.<init>(r3)
            r1.loadConfigFeedAd(r0, r2)
            return
    }

    private void startS2SBidding() {
            r5 = this;
            java.lang.String r0 = r5.mServerUrl
            java.lang.String r1 = r5.mAccountId
            java.lang.String r2 = r5.mSpaceId
            int r3 = r5.mFloorEcpm
            xyz.adscope.amps.adapter.ks.KSNativeAdapter$2 r4 = new xyz.adscope.amps.adapter.ks.KSNativeAdapter$2
            r4.<init>(r5)
            xyz.adscope.amps.adapter.ks.util.KSBiddingRequestUtil.getBidResponse(r0, r1, r2, r3, r4)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r1 = this;
            super.destroy()
            java.util.List<com.kwad.sdk.api.KsFeedAd> r0 = r1.iNativeAdViews
            if (r0 == 0) goto Ld
            r0.clear()
            r0 = 0
            r1.iNativeAdViews = r0
        Ld:
            return
    }

    public com.kwad.sdk.api.KsFeedAd getKsFeedAd() {
            r3 = this;
            java.util.List<com.kwad.sdk.api.KsFeedAd> r0 = r3.iNativeAdViews
            r1 = 0
            if (r0 == 0) goto L19
            int r0 = r0.size()
            if (r0 != 0) goto Lc
            goto L19
        Lc:
            java.util.List<com.kwad.sdk.api.KsFeedAd> r0 = r3.iNativeAdViews
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.kwad.sdk.api.KsFeedAd r0 = (com.kwad.sdk.api.KsFeedAd) r0
            if (r0 != 0) goto L18
            return r1
        L18:
            return r0
        L19:
            return r1
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
            r1 = this;
            com.kwad.sdk.api.KsFeedAd r0 = r1.getKsFeedAd()
            if (r0 == 0) goto L9
            r0.getMediaExtraInfo()
        L9:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter
    public java.util.List<xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo> getNativeListInfo() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.kwad.sdk.api.KsFeedAd> r1 = r6.iNativeAdViews
            if (r1 == 0) goto L38
            int r1 = r1.size()
            if (r1 <= 0) goto L38
            java.util.List<com.kwad.sdk.api.KsFeedAd> r1 = r6.iNativeAdViews
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r1.next()
            com.kwad.sdk.api.KsFeedAd r2 = (com.kwad.sdk.api.KsFeedAd) r2
            int r3 = r6.mAdEcpm
            boolean r4 = r6.isBidding
            if (r4 == 0) goto L2d
            if (r2 == 0) goto L2d
            int r3 = r2.getECPM()
        L2d:
            xyz.adscope.amps.adapter.ks.data.KSNativeAd r4 = new xyz.adscope.amps.adapter.ks.data.KSNativeAd
            android.content.Context r5 = r6.mContext
            r4.<init>(r2, r6, r5, r3)
            r0.add(r4)
            goto L15
        L38:
            return r0
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public boolean isValid() {
            r1 = this;
            java.util.List<com.kwad.sdk.api.KsFeedAd> r0 = r1.iNativeAdViews
            if (r0 == 0) goto Ld
            int r0 = r0.size()
            if (r0 != 0) goto Lb
            goto Ld
        Lb:
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter
    public void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener r3) {
            r0 = this;
            super.loadNetworkAd2(r1, r2, r3)
            boolean r1 = r0.isC2SAdSource()
            if (r1 == 0) goto L17
            java.util.List<com.kwad.sdk.api.KsFeedAd> r1 = r0.iNativeAdViews
            if (r1 == 0) goto L17
            int r1 = r1.size()
            if (r1 <= 0) goto L17
            r0.onAdLoad()
            return
        L17:
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
    public void sendLossNotice(xyz.adscope.amps.base.AMPSBidResult r2) {
            r1 = this;
            com.kwad.sdk.api.KsFeedAd r0 = r1.getKsFeedAd()     // Catch: java.lang.Exception -> Lc
            if (r0 == 0) goto Lc
            if (r2 != 0) goto L9
            goto Lc
        L9:
            xyz.adscope.amps.adapter.ks.KSAdManagerHolder.sendLossNotification(r0, r2)     // Catch: java.lang.Exception -> Lc
        Lc:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendWinNotice(xyz.adscope.amps.base.AMPSBidResult r3) {
            r2 = this;
            com.kwad.sdk.api.KsFeedAd r3 = r2.getKsFeedAd()     // Catch: java.lang.Exception -> L20
            if (r3 != 0) goto L7
            goto L20
        L7:
            int r0 = r3.getECPM()     // Catch: java.lang.Exception -> L20
            boolean r1 = r2.isC2SAdSource()     // Catch: java.lang.Exception -> L20
            if (r1 == 0) goto L15
            xyz.adscope.amps.adapter.ks.KSAdManagerHolder.sendWinNotification(r3, r0)     // Catch: java.lang.Exception -> L20
            return
        L15:
            boolean r3 = r2.isS2SAdSource()     // Catch: java.lang.Exception -> L20
            if (r3 == 0) goto L20
            xyz.adscope.amps.adapter.ks.model.BidResponseModel r3 = r2.mBidResponseModel     // Catch: java.lang.Exception -> L20
            xyz.adscope.amps.adapter.ks.util.KSBiddingRequestUtil.sendWinNotice(r3)     // Catch: java.lang.Exception -> L20
        L20:
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
