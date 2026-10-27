package xyz.adscope.amps.adapter.ks;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class KSDrawAdapter extends xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter {
    private java.lang.String mBidResponse;
    private xyz.adscope.amps.adapter.ks.model.BidResponseModel mBidResponseModel;
    private java.lang.String mBidResponseV2;
    private java.util.List<com.kwad.sdk.api.KsDrawAd> mKsDrawAds;



    public KSDrawAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.util.List access$000(xyz.adscope.amps.adapter.ks.KSDrawAdapter r0) {
            java.util.List<com.kwad.sdk.api.KsDrawAd> r0 = r0.mKsDrawAds
            return r0
    }

    public static /* synthetic */ java.util.List access$002(xyz.adscope.amps.adapter.ks.KSDrawAdapter r0, java.util.List r1) {
            r0.mKsDrawAds = r1
            return r1
    }

    public static /* synthetic */ xyz.adscope.amps.adapter.ks.model.BidResponseModel access$102(xyz.adscope.amps.adapter.ks.KSDrawAdapter r0, xyz.adscope.amps.adapter.ks.model.BidResponseModel r1) {
            r0.mBidResponseModel = r1
            return r1
    }

    public static /* synthetic */ java.lang.String access$202(xyz.adscope.amps.adapter.ks.KSDrawAdapter r0, java.lang.String r1) {
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

    private void loadDrawAd() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "KSSDK start loadDrawAd spaceId:"
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
            com.kwad.sdk.api.KsScene$Builder r1 = r0.adNum(r1)
            r1.build()
            com.kwad.sdk.api.KsLoadManager r1 = com.kwad.sdk.api.KsAdSDK.getLoadManager()
            com.kwad.sdk.api.KsScene r0 = r0.build()
            xyz.adscope.amps.adapter.ks.KSDrawAdapter$1 r2 = new xyz.adscope.amps.adapter.ks.KSDrawAdapter$1
            r2.<init>(r3)
            r1.loadDrawAd(r0, r2)
            return
    }

    private void startS2SBidding() {
            r5 = this;
            java.lang.String r0 = r5.mServerUrl
            java.lang.String r1 = r5.mAccountId
            java.lang.String r2 = r5.mSpaceId
            int r3 = r5.mFloorEcpm
            xyz.adscope.amps.adapter.ks.KSDrawAdapter$2 r4 = new xyz.adscope.amps.adapter.ks.KSDrawAdapter$2
            r4.<init>(r5)
            xyz.adscope.amps.adapter.ks.util.KSBiddingRequestUtil.getBidResponse(r0, r1, r2, r3, r4)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r1 = this;
            super.destroy()
            java.util.List<com.kwad.sdk.api.KsDrawAd> r0 = r1.mKsDrawAds
            if (r0 == 0) goto Ld
            r0.clear()
            r0 = 0
            r1.mKsDrawAds = r0
        Ld:
            return
    }

    @Override // xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter
    public java.util.List<xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo> getDrawListInfo() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.kwad.sdk.api.KsDrawAd> r1 = r5.mKsDrawAds
            if (r1 == 0) goto L2c
            int r1 = r1.size()
            if (r1 <= 0) goto L2c
            java.util.List<com.kwad.sdk.api.KsDrawAd> r1 = r5.mKsDrawAds
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            com.kwad.sdk.api.KsDrawAd r2 = (com.kwad.sdk.api.KsDrawAd) r2
            xyz.adscope.amps.adapter.ks.data.KSDrawAd r3 = new xyz.adscope.amps.adapter.ks.data.KSDrawAd
            android.content.Context r4 = r5.mContext
            r3.<init>(r2, r5, r4)
            r0.add(r3)
            goto L15
        L2c:
            return r0
    }

    public com.kwad.sdk.api.KsDrawAd getKsDrawAd() {
            r3 = this;
            java.util.List<com.kwad.sdk.api.KsDrawAd> r0 = r3.mKsDrawAds
            r1 = 0
            if (r0 == 0) goto L19
            int r0 = r0.size()
            if (r0 != 0) goto Lc
            goto L19
        Lc:
            java.util.List<com.kwad.sdk.api.KsDrawAd> r0 = r3.mKsDrawAds
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.kwad.sdk.api.KsDrawAd r0 = (com.kwad.sdk.api.KsDrawAd) r0
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
            com.kwad.sdk.api.KsDrawAd r0 = r1.getKsDrawAd()
            if (r0 == 0) goto L9
            r0.getMediaExtraInfo()
        L9:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public boolean isValid() {
            r1 = this;
            java.util.List<com.kwad.sdk.api.KsDrawAd> r0 = r1.mKsDrawAds
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
    @Override // xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter
    public void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener r3) {
            r0 = this;
            super.loadNetworkAd2(r1, r2, r3)
            boolean r1 = r0.isC2SAdSource()
            if (r1 == 0) goto L17
            java.util.List<com.kwad.sdk.api.KsDrawAd> r1 = r0.mKsDrawAds
            if (r1 == 0) goto L17
            int r1 = r1.size()
            if (r1 <= 0) goto L17
            r0.onAdLoad()
            return
        L17:
            r0.initSDK()
            r0.loadDrawAd()
            return
    }

    @Override // xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public /* bridge */ /* synthetic */ void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener r3) {
            r0 = this;
            xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener r3 = (xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener) r3
            r0.loadNetworkAd(r1, r2, r3)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendLossNotice(xyz.adscope.amps.base.AMPSBidResult r2) {
            r1 = this;
            com.kwad.sdk.api.KsDrawAd r0 = r1.getKsDrawAd()     // Catch: java.lang.Exception -> Lc
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
            com.kwad.sdk.api.KsDrawAd r3 = r2.getKsDrawAd()     // Catch: java.lang.Exception -> L20
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

    @Override // xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public void startBid(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.inner.AMPSAdBiddingListener r3) {
            r0 = this;
            super.startBid(r1, r2, r3)
            r0.initSDK()
            boolean r1 = r0.isC2SAdSource()
            if (r1 == 0) goto L10
            r0.loadDrawAd()
            return
        L10:
            boolean r1 = r0.isS2SAdSource()
            if (r1 == 0) goto L19
            r0.startS2SBidding()
        L19:
            return
    }
}
