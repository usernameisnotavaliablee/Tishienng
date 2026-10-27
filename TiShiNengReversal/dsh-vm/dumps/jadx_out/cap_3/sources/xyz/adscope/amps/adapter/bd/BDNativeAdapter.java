package xyz.adscope.amps.adapter.bd;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BDNativeAdapter extends xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter {
    private com.baidu.mobads.sdk.api.BaiduNativeManager mBaiduNativeManager;
    private com.baidu.mobads.sdk.api.BaiduNativeManager.ExpressAdListener mExpressAdListener;
    private java.util.List<com.baidu.mobads.sdk.api.ExpressResponse> mExpressResponseList;




    public BDNativeAdapter() {
            r1 = this;
            r1.<init>()
            xyz.adscope.amps.adapter.bd.BDNativeAdapter$3 r0 = new xyz.adscope.amps.adapter.bd.BDNativeAdapter$3
            r0.<init>(r1)
            r1.mExpressAdListener = r0
            return
    }

    public static /* synthetic */ java.util.List access$002(xyz.adscope.amps.adapter.bd.BDNativeAdapter r0, java.util.List r1) {
            r0.mExpressResponseList = r1
            return r1
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.bd.BDInitMediation r0 = xyz.adscope.amps.adapter.bd.BDInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            r2 = 0
            r0.initSDK(r1, r2)
            r3.loadNativeAd()
            return
    }

    private void loadNativeAd() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BDSDK start loadNativeAd spaceId:"
            r0.append(r1)
            java.lang.String r1 = r3.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            int r0 = r3.expressViewHeightDp
            if (r0 > 0) goto L1f
            r0 = 0
            r3.expressViewHeightDp = r0
        L1f:
            com.baidu.mobads.sdk.api.BaiduNativeManager r0 = new com.baidu.mobads.sdk.api.BaiduNativeManager
            android.content.Context r1 = r3.mContext
            java.lang.String r2 = r3.mSpaceId
            r0.<init>(r1, r2)
            r3.mBaiduNativeManager = r0
            com.baidu.mobads.sdk.api.RequestParameters$Builder r0 = new com.baidu.mobads.sdk.api.RequestParameters$Builder
            r0.<init>()
            int r1 = r3.expressViewHeightDp
            com.baidu.mobads.sdk.api.RequestParameters$Builder r0 = r0.setHeight(r1)
            int r1 = r3.expressViewWidthDp
            com.baidu.mobads.sdk.api.RequestParameters$Builder r0 = r0.setWidth(r1)
            com.baidu.mobads.sdk.api.RequestParameters r0 = r0.build()
            com.baidu.mobads.sdk.api.BaiduNativeManager r1 = r3.mBaiduNativeManager
            com.baidu.mobads.sdk.api.BaiduNativeManager$ExpressAdListener r2 = r3.mExpressAdListener
            r1.loadExpressAd(r0, r2)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r2 = this;
            super.destroy()     // Catch: java.lang.Exception -> L13
            com.baidu.mobads.sdk.api.BaiduNativeManager r0 = r2.mBaiduNativeManager     // Catch: java.lang.Exception -> L13
            r1 = 0
            if (r0 == 0) goto La
            r2.mBaiduNativeManager = r1     // Catch: java.lang.Exception -> L13
        La:
            java.util.List<com.baidu.mobads.sdk.api.ExpressResponse> r0 = r2.mExpressResponseList     // Catch: java.lang.Exception -> L13
            if (r0 == 0) goto L13
            r0.clear()     // Catch: java.lang.Exception -> L13
            r2.mExpressResponseList = r1     // Catch: java.lang.Exception -> L13
        L13:
            return
    }

    @Override // xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter
    public java.util.List<xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo> getNativeListInfo() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.baidu.mobads.sdk.api.ExpressResponse> r1 = r5.mExpressResponseList
            if (r1 == 0) goto L3a
            int r1 = r1.size()
            if (r1 <= 0) goto L3a
            java.util.List<com.baidu.mobads.sdk.api.ExpressResponse> r1 = r5.mExpressResponseList
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            com.baidu.mobads.sdk.api.ExpressResponse r2 = (com.baidu.mobads.sdk.api.ExpressResponse) r2
            int r3 = r5.mAdEcpm
            boolean r4 = r5.isBidding
            if (r4 == 0) goto L31
            if (r2 == 0) goto L31
            java.lang.String r4 = r2.getECPMLevel()     // Catch: java.lang.NumberFormatException -> L31
            int r3 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L31
        L31:
            xyz.adscope.amps.adapter.bd.data.BDNativeAd r4 = new xyz.adscope.amps.adapter.bd.data.BDNativeAd
            r4.<init>(r2, r5, r3)
            r0.add(r4)
            goto L15
        L3a:
            return r0
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public boolean isValid() {
            r1 = this;
            com.baidu.mobads.sdk.api.BaiduNativeManager r0 = r1.mBaiduNativeManager
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 1
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter
    public void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener r3) {
            r0 = this;
            super.loadNetworkAd2(r1, r2, r3)
            boolean r1 = r0.isBidding
            if (r1 == 0) goto L15
            java.util.List<com.baidu.mobads.sdk.api.ExpressResponse> r1 = r0.mExpressResponseList
            if (r1 == 0) goto L15
            int r1 = r1.size()
            if (r1 <= 0) goto L15
            r0.onAdLoad()
            return
        L15:
            r0.initSDK()
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
            java.util.List<com.baidu.mobads.sdk.api.ExpressResponse> r0 = r3.mExpressResponseList     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L2b
            if (r4 != 0) goto L7
            goto L2b
        L7:
            int r0 = r0.size()     // Catch: java.lang.Exception -> L2b
            if (r0 <= 0) goto L17
            java.util.List<com.baidu.mobads.sdk.api.ExpressResponse> r0 = r3.mExpressResponseList     // Catch: java.lang.Exception -> L2b
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L2b
            com.baidu.mobads.sdk.api.ExpressResponse r0 = (com.baidu.mobads.sdk.api.ExpressResponse) r0     // Catch: java.lang.Exception -> L2b
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L1b
            goto L2b
        L1b:
            xyz.adscope.amps.adapter.bd.BDNativeAdapter$2 r1 = new xyz.adscope.amps.adapter.bd.BDNativeAdapter$2     // Catch: java.lang.Exception -> L2b
            r1.<init>(r3)     // Catch: java.lang.Exception -> L2b
            xyz.adscope.amps.adapter.bd.BDInitMediation r2 = xyz.adscope.amps.adapter.bd.BDInitMediation.getInstance()     // Catch: java.lang.Exception -> L2b
            java.util.LinkedHashMap r4 = r2.getWinInfo(r4)     // Catch: java.lang.Exception -> L2b
            r0.biddingFail(r4, r1)     // Catch: java.lang.Exception -> L2b
        L2b:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendWinNotice(xyz.adscope.amps.base.AMPSBidResult r4) {
            r3 = this;
            java.util.List<com.baidu.mobads.sdk.api.ExpressResponse> r0 = r3.mExpressResponseList     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L2b
            if (r4 != 0) goto L7
            goto L2b
        L7:
            int r0 = r0.size()     // Catch: java.lang.Exception -> L2b
            if (r0 <= 0) goto L17
            java.util.List<com.baidu.mobads.sdk.api.ExpressResponse> r0 = r3.mExpressResponseList     // Catch: java.lang.Exception -> L2b
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L2b
            com.baidu.mobads.sdk.api.ExpressResponse r0 = (com.baidu.mobads.sdk.api.ExpressResponse) r0     // Catch: java.lang.Exception -> L2b
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L1b
            goto L2b
        L1b:
            xyz.adscope.amps.adapter.bd.BDNativeAdapter$1 r1 = new xyz.adscope.amps.adapter.bd.BDNativeAdapter$1     // Catch: java.lang.Exception -> L2b
            r1.<init>(r3)     // Catch: java.lang.Exception -> L2b
            xyz.adscope.amps.adapter.bd.BDInitMediation r2 = xyz.adscope.amps.adapter.bd.BDInitMediation.getInstance()     // Catch: java.lang.Exception -> L2b
            java.util.LinkedHashMap r4 = r2.getSecondInfo(r4)     // Catch: java.lang.Exception -> L2b
            r0.biddingSuccess(r4, r1)     // Catch: java.lang.Exception -> L2b
        L2b:
            return
    }

    @Override // xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public void startBid(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.inner.AMPSAdBiddingListener r3) {
            r0 = this;
            super.startBid(r1, r2, r3)
            r0.initSDK()
            return
    }
}
