package xyz.adscope.amps.ad.unified.adapter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class AMPSUnifiedNativeAdapter<T> extends xyz.adscope.amps.base.AMPSBaseAdapter<xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdAdapterListener> {
    protected java.util.List<xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem> mUnifiedNativeItemsList;

    public AMPSUnifiedNativeAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    protected final void convertAdapterResponse(java.util.List<T> r3) {
            r2 = this;
            if (r3 == 0) goto L27
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L27
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mUnifiedNativeItemsList = r0
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.next()
            java.util.List<xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem> r1 = r2.mUnifiedNativeItemsList
            xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem r0 = r2.convertEntryFromAdapterResponse(r0)
            r1.add(r0)
            goto L13
        L27:
            return
    }

    protected abstract xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem convertEntryFromAdapterResponse(T r1);

    public final java.util.List<xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem> getNativeListInfo() {
            r1 = this;
            java.util.List<xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem> r0 = r1.mUnifiedNativeItemsList
            return r0
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void getRequestParameters(android.content.Context r2, xyz.adscope.amps.model.AMPSAdapterModel r3) {
            r1 = this;
            super.getRequestParameters(r2, r3)
            if (r3 == 0) goto L29
            int r2 = r3.getEcpm()     // Catch: java.lang.Exception -> L12
            r1.mAdEcpm = r2     // Catch: java.lang.Exception -> L12
            java.lang.String r2 = r3.getSeatId()     // Catch: java.lang.Exception -> L12
            r1.mSeatId = r2     // Catch: java.lang.Exception -> L12
            return
        L12:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "e : "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.e(r3, r2)
        L29:
            return
    }

    /* renamed from: loadNetworkAd, reason: avoid collision after fix types in other method */
    public void loadNetworkAd2(android.content.Context r2, xyz.adscope.amps.model.AMPSAdapterModel r3, xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdAdapterListener r4) {
            r1 = this;
            r1.getRequestParameters(r2, r3)
            int r3 = r3.getAdCount()
            r1.adCount = r3
            r1.mContext = r2
            r1.mAMPSBaseAdAdapterListener = r4
            if (r2 == 0) goto L24
            java.lang.String r2 = r1.mAppId
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L24
            java.lang.String r2 = r1.mSpaceId
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L20
            goto L24
        L20:
            r1.buildRequestedTimerTask()
            return
        L24:
            xyz.adscope.amps.inner.AMPSBaseAdAdapterListener r2 = r1.mAMPSBaseAdAdapterListener
            if (r2 == 0) goto L3a
            xyz.adscope.amps.common.AMPSError r3 = new xyz.adscope.amps.common.AMPSError
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r4 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_REQUEST_PARAM_ERROR
            java.lang.String r0 = r4.getErrorCode()
            java.lang.String r4 = r4.getErrorMsg()
            r3.<init>(r0, r4)
            r2.onAdFailed(r1, r3)
        L3a:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public /* bridge */ /* synthetic */ void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdAdapterListener r3) {
            r0 = this;
            xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdAdapterListener r3 = (xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdAdapterListener) r3
            r0.loadNetworkAd2(r1, r2, r3)
            return
    }

    /* renamed from: refreshAMPSAdAdapterListener, reason: avoid collision after fix types in other method */
    public void refreshAMPSAdAdapterListener2(xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdAdapterListener r1) {
            r0 = this;
            r0.mAMPSBaseAdAdapterListener = r1
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public /* bridge */ /* synthetic */ void refreshAMPSAdAdapterListener(xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdAdapterListener r1) {
            r0 = this;
            xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdAdapterListener r1 = (xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdAdapterListener) r1
            r0.refreshAMPSAdAdapterListener2(r1)
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
