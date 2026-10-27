package xyz.adscope.amps.adapter.bz;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BZNativeAdapter extends xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter {
    private xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdExpressListener ampsNativeAdExpressListener;
    private com.beizi.fusion.NativeAd mNativeAd;
    private int modelType;
    private android.view.View nativeView;
    private int winPrice;


    public BZNativeAdapter() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.ampsNativeAdExpressListener = r0
            r0 = 1
            r1.modelType = r0
            return
    }

    public static /* synthetic */ android.view.View access$000(xyz.adscope.amps.adapter.bz.BZNativeAdapter r0) {
            android.view.View r0 = r0.nativeView
            return r0
    }

    public static /* synthetic */ android.view.View access$002(xyz.adscope.amps.adapter.bz.BZNativeAdapter r0, android.view.View r1) {
            r0.nativeView = r1
            return r1
    }

    public static /* synthetic */ com.beizi.fusion.NativeAd access$100(xyz.adscope.amps.adapter.bz.BZNativeAdapter r0) {
            com.beizi.fusion.NativeAd r0 = r0.mNativeAd
            return r0
    }

    public static /* synthetic */ xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdExpressListener access$200(xyz.adscope.amps.adapter.bz.BZNativeAdapter r0) {
            xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdExpressListener r0 = r0.ampsNativeAdExpressListener
            return r0
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.bz.BZInitMediation r0 = xyz.adscope.amps.adapter.bz.BZInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            r2 = 0
            r0.initSDK(r1, r2)
            r3.loadNativeAd()
            return
    }

    private void loadNativeAd() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BZSDK start loadNativeAd spaceId:"
            r0.append(r1)
            java.lang.String r1 = r8.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            java.util.List<java.lang.Integer> r0 = r8.templateTypes
            if (r0 == 0) goto L42
            int r0 = r0.size()
            if (r0 <= 0) goto L42
            java.util.List<java.lang.Integer> r0 = r8.templateTypes
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L33
            r0 = 4
        L30:
            r8.modelType = r0
            goto L42
        L33:
            java.util.List<java.lang.Integer> r0 = r8.templateTypes
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L42
            r0 = 5
            goto L30
        L42:
            com.beizi.fusion.NativeAd r1 = new com.beizi.fusion.NativeAd
            android.content.Context r2 = r8.mContext
            java.lang.String r3 = r8.mSpaceId
            xyz.adscope.amps.adapter.bz.BZNativeAdapter$1 r4 = new xyz.adscope.amps.adapter.bz.BZNativeAdapter$1
            r4.<init>(r8)
            int r0 = r8.mTimeout
            long r5 = (long) r0
            int r7 = r8.modelType
            r1.<init>(r2, r3, r4, r5, r7)
            r8.mNativeAd = r1
            int r0 = r8.expressViewHeightDp
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.localCustomParameter
            if (r1 == 0) goto L7e
            java.lang.String r2 = "customBZHeight"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L7e
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.localCustomParameter
            java.lang.Object r1 = r1.get(r2)
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L7e
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 <= 0) goto L7e
            android.content.Context r0 = r8.mContext
            float r1 = (float) r1
            int r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.px2dip(r0, r1)
        L7e:
            if (r0 >= 0) goto L81
            r0 = 0
        L81:
            com.beizi.fusion.NativeAd r1 = r8.mNativeAd
            int r2 = r8.expressViewWidthDp
            float r2 = (float) r2
            float r0 = (float) r0
            r1.loadAd(r2, r0)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r2 = this;
            super.destroy()
            com.beizi.fusion.NativeAd r0 = r2.mNativeAd
            r1 = 0
            if (r0 == 0) goto Ld
            r0.destroy()
            r2.mNativeAd = r1
        Ld:
            r2.ampsNativeAdExpressListener = r1
            return
    }

    public android.view.View getAdView() {
            r1 = this;
            android.view.View r0 = r1.nativeView
            return r0
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public java.lang.String getMediaCustomExtraInfo() {
            r2 = this;
            com.beizi.fusion.NativeAd r0 = r2.mNativeAd
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

    @Override // xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter
    public java.util.List<xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo> getNativeListInfo() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r3.mAdEcpm
            boolean r2 = r3.isBidding
            if (r2 == 0) goto L11
            com.beizi.fusion.NativeAd r2 = r3.mNativeAd
            if (r2 == 0) goto L11
            int r1 = r3.winPrice
        L11:
            xyz.adscope.amps.adapter.bz.data.BZNativeAd r2 = new xyz.adscope.amps.adapter.bz.data.BZNativeAd
            r2.<init>(r3, r1)
            r0.add(r2)
            return r0
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public boolean isValid() {
            r1 = this;
            com.beizi.fusion.NativeAd r0 = r1.mNativeAd
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
            com.beizi.fusion.NativeAd r1 = r0.mNativeAd
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

    @Override // xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter
    public void pause() {
            r1 = this;
            com.beizi.fusion.NativeAd r0 = r1.mNativeAd
            if (r0 == 0) goto L7
            r0.pause()
        L7:
            return
    }

    public void renderView() {
            r4 = this;
            android.view.View r0 = r4.nativeView
            if (r0 != 0) goto L5
            goto L17
        L5:
            r4.onRenderSuccess()
            xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdExpressListener r0 = r4.ampsNativeAdExpressListener
            if (r0 == 0) goto L17
            android.view.View r1 = r4.nativeView
            int r2 = r4.expressViewWidth
            float r2 = (float) r2
            int r3 = r4.expressViewHeight
            float r3 = (float) r3
            r0.onRenderSuccess(r1, r2, r3)
        L17:
            return
    }

    @Override // xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter
    public void resume() {
            r1 = this;
            com.beizi.fusion.NativeAd r0 = r1.mNativeAd
            if (r0 == 0) goto L7
            r0.resume()
        L7:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendLossNotice(xyz.adscope.amps.base.AMPSBidResult r2) {
            r1 = this;
            com.beizi.fusion.NativeAd r0 = r1.mNativeAd     // Catch: java.lang.Exception -> L17
            if (r0 == 0) goto L17
            if (r2 != 0) goto L7
            goto L17
        L7:
            xyz.adscope.amps.adapter.bz.BZInitMediation r0 = xyz.adscope.amps.adapter.bz.BZInitMediation.getInstance()     // Catch: java.lang.Exception -> L17
            java.util.Map r2 = r0.getLossInfo(r2)     // Catch: java.lang.Exception -> L17
            if (r2 != 0) goto L12
            goto L17
        L12:
            com.beizi.fusion.NativeAd r0 = r1.mNativeAd     // Catch: java.lang.Exception -> L17
            r0.sendLossNotificationWithInfo(r2)     // Catch: java.lang.Exception -> L17
        L17:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendWinNotice(xyz.adscope.amps.base.AMPSBidResult r2) {
            r1 = this;
            com.beizi.fusion.NativeAd r0 = r1.mNativeAd     // Catch: java.lang.Exception -> L1d
            if (r0 == 0) goto L1d
            if (r2 != 0) goto L7
            goto L1d
        L7:
            int r0 = r2.getWinPrice()     // Catch: java.lang.Exception -> L1d
            r1.winPrice = r0     // Catch: java.lang.Exception -> L1d
            xyz.adscope.amps.adapter.bz.BZInitMediation r0 = xyz.adscope.amps.adapter.bz.BZInitMediation.getInstance()     // Catch: java.lang.Exception -> L1d
            java.util.Map r2 = r0.getWinInfo(r2)     // Catch: java.lang.Exception -> L1d
            if (r2 != 0) goto L18
            goto L1d
        L18:
            com.beizi.fusion.NativeAd r0 = r1.mNativeAd     // Catch: java.lang.Exception -> L1d
            r0.sendWinNotificationWithInfo(r2)     // Catch: java.lang.Exception -> L1d
        L1d:
            return
    }

    public void setAMPSNativeAdExpressListener(xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdExpressListener r1) {
            r0 = this;
            r0.ampsNativeAdExpressListener = r1
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
