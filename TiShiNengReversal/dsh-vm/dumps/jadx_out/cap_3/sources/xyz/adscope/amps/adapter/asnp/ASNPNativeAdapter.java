package xyz.adscope.amps.adapter.asnp;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ASNPNativeAdapter extends xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter {
    private java.util.List<xyz.adscope.ad.publish.ad.nativead.INativeAdItem> iNativeAdItems;
    private xyz.adscope.ad.publish.ad.nativead.NativeAd mASNPNativeAd;



    public ASNPNativeAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void access$000(xyz.adscope.amps.adapter.asnp.ASNPNativeAdapter r0) {
            r0.loadNativeAd()
            return
    }

    public static /* synthetic */ java.util.List access$100(xyz.adscope.amps.adapter.asnp.ASNPNativeAdapter r0) {
            java.util.List<xyz.adscope.ad.publish.ad.nativead.INativeAdItem> r0 = r0.iNativeAdItems
            return r0
    }

    public static /* synthetic */ java.util.List access$102(xyz.adscope.amps.adapter.asnp.ASNPNativeAdapter r0, java.util.List r1) {
            r0.iNativeAdItems = r1
            return r1
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.asnp.ASNPInitMediation r0 = xyz.adscope.amps.adapter.asnp.ASNPInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            xyz.adscope.amps.adapter.asnp.ASNPNativeAdapter$1 r2 = new xyz.adscope.amps.adapter.asnp.ASNPNativeAdapter$1
            r2.<init>(r3)
            r0.initSDK(r1, r2)
            return
    }

    private void loadNativeAd() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ASNPSDK start loadNativeAd spaceId:"
            r0.append(r1)
            java.lang.String r1 = r4.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            android.content.Context r0 = r4.mContext
            if (r0 != 0) goto L2a
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_REQUEST_FAIL
            java.lang.String r1 = r0.getErrorCode()
            java.lang.String r0 = r0.getErrorMsg()
            r4.onAdFailed(r1, r0)
            return
        L2a:
            xyz.adscope.ad.publish.ad.nativead.INativeAdConfig$Builder r0 = new xyz.adscope.ad.publish.ad.nativead.INativeAdConfig$Builder
            r0.<init>()
            int r1 = r4.expressViewWidth
            float r1 = (float) r1
            int r2 = r4.expressViewHeight
            float r2 = (float) r2
            r0.setExpressSizePixel2(r1, r2)
            r1 = 1
            r0.setAdCount2(r1)
            int r1 = r4.mTimeout
            long r1 = (long) r1
            r0.setTimeoutMillion2(r1)
            java.lang.String r1 = r4.mSpaceId
            xyz.adscope.ad.a2 r0 = r0.build(r1)
            xyz.adscope.ad.publish.ad.nativead.INativeAdConfig r0 = (xyz.adscope.ad.publish.ad.nativead.INativeAdConfig) r0
            xyz.adscope.amps.adapter.asnp.ASNPNativeAdapter$2 r1 = new xyz.adscope.amps.adapter.asnp.ASNPNativeAdapter$2
            r1.<init>(r4)
            xyz.adscope.ad.publish.ad.nativead.NativeAd r2 = new xyz.adscope.ad.publish.ad.nativead.NativeAd
            android.content.Context r3 = r4.mContext
            r2.<init>(r3, r0)
            r4.mASNPNativeAd = r2
            r2.loadAd(r1)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r2 = this;
            super.destroy()
            xyz.adscope.ad.publish.ad.nativead.NativeAd r0 = r2.mASNPNativeAd     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto La
            r0 = 0
            r2.mASNPNativeAd = r0     // Catch: java.lang.Exception -> L2a
        La:
            java.util.List<xyz.adscope.ad.publish.ad.nativead.INativeAdItem> r0 = r2.iNativeAdItems     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L2a
            int r0 = r0.size()     // Catch: java.lang.Exception -> L2a
            if (r0 <= 0) goto L2a
            java.util.List<xyz.adscope.ad.publish.ad.nativead.INativeAdItem> r0 = r2.iNativeAdItems     // Catch: java.lang.Exception -> L2a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L2a
        L1a:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L2a
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L2a
            xyz.adscope.ad.publish.ad.nativead.INativeAdItem r1 = (xyz.adscope.ad.publish.ad.nativead.INativeAdItem) r1     // Catch: java.lang.Exception -> L2a
            r1.destroyAd()     // Catch: java.lang.Exception -> L2a
            goto L1a
        L2a:
            return
    }

    @Override // xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter
    public java.util.List<xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo> getNativeListInfo() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<xyz.adscope.ad.publish.ad.nativead.INativeAdItem> r1 = r5.iNativeAdItems
            if (r1 == 0) goto L3e
            int r1 = r1.size()
            if (r1 <= 0) goto L3e
            java.util.List<xyz.adscope.ad.publish.ad.nativead.INativeAdItem> r1 = r5.iNativeAdItems
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            xyz.adscope.ad.publish.ad.nativead.INativeAdItem r2 = (xyz.adscope.ad.publish.ad.nativead.INativeAdItem) r2
            int r3 = r5.mAdEcpm
            boolean r4 = r5.isBidding
            if (r4 == 0) goto L35
            xyz.adscope.ad.publish.ad.IBidding r4 = r2.getBidding()
            if (r4 == 0) goto L35
            xyz.adscope.ad.publish.ad.IBidding r3 = r2.getBidding()
            int r3 = r3.getECPM()
        L35:
            xyz.adscope.amps.adapter.asnp.data.ASNPNativeAd r4 = new xyz.adscope.amps.adapter.asnp.data.ASNPNativeAd
            r4.<init>(r2, r5, r3)
            r0.add(r4)
            goto L15
        L3e:
            return r0
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public boolean isValid() {
            r1 = this;
            xyz.adscope.ad.publish.ad.nativead.NativeAd r0 = r1.mASNPNativeAd
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
            if (r1 == 0) goto Lf
            xyz.adscope.ad.publish.ad.nativead.NativeAd r1 = r0.mASNPNativeAd
            if (r1 == 0) goto Lf
            r0.onAdLoad()
            return
        Lf:
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
    public void sendLossNotice(xyz.adscope.amps.base.AMPSBidResult r5) {
            r4 = this;
            java.util.List<xyz.adscope.ad.publish.ad.nativead.INativeAdItem> r0 = r4.iNativeAdItems     // Catch: java.lang.Exception -> L3b
            if (r0 == 0) goto L3b
            int r0 = r0.size()     // Catch: java.lang.Exception -> L3b
            if (r0 == 0) goto L3b
            if (r5 != 0) goto Ld
            goto L3b
        Ld:
            java.util.List<xyz.adscope.ad.publish.ad.nativead.INativeAdItem> r0 = r4.iNativeAdItems     // Catch: java.lang.Exception -> L3b
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L3b
            xyz.adscope.ad.publish.ad.nativead.INativeAdItem r0 = (xyz.adscope.ad.publish.ad.nativead.INativeAdItem) r0     // Catch: java.lang.Exception -> L3b
            if (r0 == 0) goto L3b
            xyz.adscope.ad.publish.ad.IBidding r1 = r0.getBidding()     // Catch: java.lang.Exception -> L3b
            if (r1 != 0) goto L1f
            goto L3b
        L1f:
            int r1 = r5.getEcpm()     // Catch: java.lang.Exception -> L3b
            int r2 = r5.getReason()     // Catch: java.lang.Exception -> L3b
            java.lang.String r5 = r5.getChannelName()     // Catch: java.lang.Exception -> L3b
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> L3b
            r3 = -1
            java.util.Map r5 = xyz.adscope.ad.publish.ad.IBidding.BiddingPriceBuilder.buildLoseNoticeMap(r1, r3, r5, r2, r3)     // Catch: java.lang.Exception -> L3b
            xyz.adscope.ad.publish.ad.IBidding r0 = r0.getBidding()     // Catch: java.lang.Exception -> L3b
            r0.notifyBidLose(r5)     // Catch: java.lang.Exception -> L3b
        L3b:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendWinNotice(xyz.adscope.amps.base.AMPSBidResult r5) {
            r4 = this;
            java.util.List<xyz.adscope.ad.publish.ad.nativead.INativeAdItem> r0 = r4.iNativeAdItems     // Catch: java.lang.Exception -> L3b
            if (r0 == 0) goto L3b
            int r0 = r0.size()     // Catch: java.lang.Exception -> L3b
            if (r0 == 0) goto L3b
            if (r5 != 0) goto Ld
            goto L3b
        Ld:
            java.util.List<xyz.adscope.ad.publish.ad.nativead.INativeAdItem> r0 = r4.iNativeAdItems     // Catch: java.lang.Exception -> L3b
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L3b
            xyz.adscope.ad.publish.ad.nativead.INativeAdItem r0 = (xyz.adscope.ad.publish.ad.nativead.INativeAdItem) r0     // Catch: java.lang.Exception -> L3b
            if (r0 == 0) goto L3b
            xyz.adscope.ad.publish.ad.IBidding r1 = r0.getBidding()     // Catch: java.lang.Exception -> L3b
            if (r1 != 0) goto L1f
            goto L3b
        L1f:
            xyz.adscope.ad.publish.ad.IBidding r1 = r0.getBidding()     // Catch: java.lang.Exception -> L3b
            int r1 = r1.getECPM()     // Catch: java.lang.Exception -> L3b
            int r2 = r5.getEcpm()     // Catch: java.lang.Exception -> L3b
            java.lang.String r5 = r5.getChannelName()     // Catch: java.lang.Exception -> L3b
            r3 = -1
            java.util.Map r5 = xyz.adscope.ad.publish.ad.IBidding.BiddingPriceBuilder.buildWinNoticeMap(r1, r2, r5, r3)     // Catch: java.lang.Exception -> L3b
            xyz.adscope.ad.publish.ad.IBidding r0 = r0.getBidding()     // Catch: java.lang.Exception -> L3b
            r0.notifyBidWin(r5)     // Catch: java.lang.Exception -> L3b
        L3b:
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
