package xyz.adscope.amps.ad.nativead.adapter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class AMPSNativeAdapter extends xyz.adscope.amps.base.AMPSBaseAdapter<xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener> {
    public java.util.List<java.lang.Integer> templateTypes;


    public AMPSNativeAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.util.List<xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem> getNativeExpressListInfo() {
            r4 = this;
            java.util.List r0 = r4.getNativeListInfo()
            if (r0 == 0) goto L2c
            int r1 = r0.size()
            if (r1 != 0) goto Ld
            goto L2c
        Ld:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r0.next()
            xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo r2 = (xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo) r2
            xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter$1 r3 = new xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter$1
            r3.<init>(r4, r2)
            r1.add(r3)
            goto L16
        L2b:
            return r1
        L2c:
            r0 = 0
            return r0
    }

    public abstract java.util.List<xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo> getNativeListInfo();

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void getRequestParameters(android.content.Context r2, xyz.adscope.amps.model.AMPSAdapterModel r3) {
            r1 = this;
            super.getRequestParameters(r2, r3)
            if (r3 == 0) goto L2f
            java.util.List r2 = r3.getTemplateTypes()     // Catch: java.lang.Exception -> L18
            r1.templateTypes = r2     // Catch: java.lang.Exception -> L18
            int r2 = r3.getEcpm()     // Catch: java.lang.Exception -> L18
            r1.mAdEcpm = r2     // Catch: java.lang.Exception -> L18
            java.lang.String r2 = r3.getSeatId()     // Catch: java.lang.Exception -> L18
            r1.mSeatId = r2     // Catch: java.lang.Exception -> L18
            return
        L18:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "e : "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.e(r3, r2)
        L2f:
            return
    }

    /* renamed from: loadNetworkAd, reason: avoid collision after fix types in other method */
    public void loadNetworkAd2(android.content.Context r2, xyz.adscope.amps.model.AMPSAdapterModel r3, xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener r4) {
            r1 = this;
            r1.getRequestParameters(r2, r3)
            r1.mContext = r2
            r1.mAMPSBaseAdAdapterListener = r4
            if (r2 == 0) goto L1e
            java.lang.String r2 = r1.mAppId
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L1e
            java.lang.String r2 = r1.mSpaceId
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L1a
            goto L1e
        L1a:
            r1.buildRequestedTimerTask()
            return
        L1e:
            xyz.adscope.amps.inner.AMPSBaseAdAdapterListener r2 = r1.mAMPSBaseAdAdapterListener
            if (r2 == 0) goto L34
            xyz.adscope.amps.common.AMPSError r3 = new xyz.adscope.amps.common.AMPSError
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r4 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_REQUEST_PARAM_ERROR
            java.lang.String r0 = r4.getErrorCode()
            java.lang.String r4 = r4.getErrorMsg()
            r3.<init>(r0, r4)
            r2.onAdFailed(r1, r3)
        L34:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public /* bridge */ /* synthetic */ void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener r3) {
            r0 = this;
            xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener r3 = (xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener) r3
            r0.loadNetworkAd2(r1, r2, r3)
            return
    }

    public void onRender() {
            r2 = this;
            xyz.adscope.amps.inner.AMPSBaseAdAdapterListener r0 = r2.mAMPSBaseAdAdapterListener
            if (r0 == 0) goto Ld
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener
            if (r1 == 0) goto Ld
            xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener r0 = (xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener) r0
            r0.onRender()
        Ld:
            return
    }

    public void onRenderFail(xyz.adscope.amps.common.AMPSError r3) {
            r2 = this;
            xyz.adscope.amps.inner.AMPSBaseAdAdapterListener r0 = r2.mAMPSBaseAdAdapterListener
            if (r0 == 0) goto Ld
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener
            if (r1 == 0) goto Ld
            xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener r0 = (xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener) r0
            r0.onRenderFail(r3)
        Ld:
            return
    }

    public void onRenderSuccess() {
            r2 = this;
            xyz.adscope.amps.inner.AMPSBaseAdAdapterListener r0 = r2.mAMPSBaseAdAdapterListener
            if (r0 == 0) goto Ld
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener
            if (r1 == 0) goto Ld
            xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener r0 = (xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener) r0
            r0.onRenderSuccess()
        Ld:
            return
    }

    public void pause() {
            r0 = this;
            return
    }

    /* renamed from: refreshAMPSAdAdapterListener, reason: avoid collision after fix types in other method */
    public void refreshAMPSAdAdapterListener2(xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener r1) {
            r0 = this;
            r0.mAMPSBaseAdAdapterListener = r1
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public /* bridge */ /* synthetic */ void refreshAMPSAdAdapterListener(xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener r1) {
            r0 = this;
            xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener r1 = (xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener) r1
            r0.refreshAMPSAdAdapterListener2(r1)
            return
    }

    public void resume() {
            r0 = this;
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void showAd(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void showAd(android.view.ViewGroup r1) {
            r0 = this;
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void startBid(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.inner.AMPSAdBiddingListener r3) {
            r0 = this;
            r0.getRequestParameters(r1, r2)
            r0.mContext = r1
            r0.mAMPSAdBiddingListener = r3
            r2 = 1
            r0.isBidding = r2
            if (r1 == 0) goto L1e
            java.lang.String r1 = r0.mAppId
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1e
            java.lang.String r1 = r0.mSpaceId
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L1d
            goto L1e
        L1d:
            return
        L1e:
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r1 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_REQUEST_PARAM_ERROR
            java.lang.String r2 = r1.getErrorCode()
            java.lang.String r1 = r1.getErrorMsg()
            r0.onC2SBiddingFail(r2, r1)
            return
    }
}
