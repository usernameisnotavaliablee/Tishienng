package xyz.adscope.amps.adapter.gm;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class GMDrawAdapter extends xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter {
    private java.util.List<com.bytedance.sdk.openadsdk.TTDrawFeedAd> mTTAdList;
    private com.bytedance.sdk.openadsdk.TTAdNative mTTAdNative;




    public GMDrawAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void access$000(xyz.adscope.amps.adapter.gm.GMDrawAdapter r0) {
            r0.loadDrawAd()
            return
    }

    public static /* synthetic */ java.util.List access$102(xyz.adscope.amps.adapter.gm.GMDrawAdapter r0, java.util.List r1) {
            r0.mTTAdList = r1
            return r1
    }

    private void bindAdListener(com.bytedance.sdk.openadsdk.TTFeedAd r3) {
            r2 = this;
            int r0 = r3.getInteractionType()
            r1 = 4
            if (r0 == r1) goto L8
            return
        L8:
            xyz.adscope.amps.adapter.gm.GMDrawAdapter$3 r0 = new xyz.adscope.amps.adapter.gm.GMDrawAdapter$3
            r0.<init>(r2)
            r3.setDownloadListener(r0)
            return
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.gm.GMInitMediation r0 = xyz.adscope.amps.adapter.gm.GMInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            xyz.adscope.amps.adapter.gm.GMDrawAdapter$1 r2 = new xyz.adscope.amps.adapter.gm.GMDrawAdapter$1
            r2.<init>(r3)
            r0.initSDK(r1, r2)
            return
    }

    private void loadDrawAd() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GMSDK start loadDrawAd  spaceId:"
            r0.append(r1)
            java.lang.String r1 = r3.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            com.bytedance.sdk.openadsdk.TTAdManager r0 = xyz.adscope.amps.adapter.gm.GMInitMediation.get()
            android.content.Context r1 = r3.mContext
            com.bytedance.sdk.openadsdk.TTAdNative r0 = r0.createAdNative(r1)
            r3.mTTAdNative = r0
            int r0 = r3.expressViewHeight
            if (r0 > 0) goto L2b
            r0 = 0
            r3.expressViewHeight = r0
        L2b:
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = new com.bytedance.sdk.openadsdk.AdSlot$Builder
            r0.<init>()
            java.lang.String r1 = r3.mSpaceId
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = r0.setCodeId(r1)
            int r1 = r3.adCount
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = r0.setAdCount(r1)
            int r1 = r3.expressViewWidthDp
            float r1 = (float) r1
            int r2 = r3.expressViewHeightDp
            float r2 = (float) r2
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = r0.setExpressViewAcceptedSize(r1, r2)
            com.bytedance.sdk.openadsdk.AdSlot r0 = r0.build()
            com.bytedance.sdk.openadsdk.TTAdNative r1 = r3.mTTAdNative
            xyz.adscope.amps.adapter.gm.GMDrawAdapter$2 r2 = new xyz.adscope.amps.adapter.gm.GMDrawAdapter$2
            r2.<init>(r3)
            r1.loadDrawFeedAd(r0, r2)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r2 = this;
            super.destroy()
            com.bytedance.sdk.openadsdk.TTAdNative r0 = r2.mTTAdNative     // Catch: java.lang.Exception -> L13
            r1 = 0
            if (r0 == 0) goto La
            r2.mTTAdNative = r1     // Catch: java.lang.Exception -> L13
        La:
            java.util.List<com.bytedance.sdk.openadsdk.TTDrawFeedAd> r0 = r2.mTTAdList     // Catch: java.lang.Exception -> L13
            if (r0 == 0) goto L13
            r0.clear()     // Catch: java.lang.Exception -> L13
            r2.mTTAdList = r1     // Catch: java.lang.Exception -> L13
        L13:
            return
    }

    @Override // xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter
    public java.util.List<xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo> getDrawListInfo() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.bytedance.sdk.openadsdk.TTDrawFeedAd> r1 = r5.mTTAdList
            if (r1 == 0) goto L2c
            int r1 = r1.size()
            if (r1 <= 0) goto L2c
            java.util.List<com.bytedance.sdk.openadsdk.TTDrawFeedAd> r1 = r5.mTTAdList
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            com.bytedance.sdk.openadsdk.TTDrawFeedAd r2 = (com.bytedance.sdk.openadsdk.TTDrawFeedAd) r2
            xyz.adscope.amps.adapter.gm.data.GMDrawAd r3 = new xyz.adscope.amps.adapter.gm.data.GMDrawAd
            android.content.Context r4 = r5.mContext
            r3.<init>(r2, r4, r5)
            r0.add(r3)
            goto L15
        L2c:
            return r0
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
            r3 = this;
            java.util.List<com.bytedance.sdk.openadsdk.TTDrawFeedAd> r0 = r3.mTTAdList
            r1 = 0
            if (r0 == 0) goto L1d
            int r0 = r0.size()
            r2 = 1
            if (r0 >= r2) goto Ld
            goto L1d
        Ld:
            java.util.List<com.bytedance.sdk.openadsdk.TTDrawFeedAd> r0 = r3.mTTAdList
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.bytedance.sdk.openadsdk.TTFeedAd r0 = (com.bytedance.sdk.openadsdk.TTFeedAd) r0
            if (r0 == 0) goto L1d
            java.util.Map r0 = r0.getMediaExtraInfo()
            return r0
        L1d:
            return r1
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public boolean isValid() {
            r1 = this;
            com.bytedance.sdk.openadsdk.TTAdNative r0 = r1.mTTAdNative
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 1
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter
    public void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener r3) {
            r0 = this;
            super.loadNetworkAd2(r1, r2, r3)
            r0.initSDK()
            return
    }

    @Override // xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public /* bridge */ /* synthetic */ void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener r3) {
            r0 = this;
            xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener r3 = (xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener) r3
            r0.loadNetworkAd(r1, r2, r3)
            return
    }
}
