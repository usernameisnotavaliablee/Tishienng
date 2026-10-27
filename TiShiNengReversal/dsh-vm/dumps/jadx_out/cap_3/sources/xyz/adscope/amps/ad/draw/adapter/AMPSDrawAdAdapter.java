package xyz.adscope.amps.ad.draw.adapter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class AMPSDrawAdAdapter extends xyz.adscope.amps.base.AMPSBaseAdapter<xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener> {
    public AMPSDrawAdAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.util.List<xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo> getDrawListInfo();

    /* renamed from: loadNetworkAd, reason: avoid collision after fix types in other method */
    public void loadNetworkAd2(android.content.Context r2, xyz.adscope.amps.model.AMPSAdapterModel r3, xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener r4) {
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
    public /* bridge */ /* synthetic */ void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener r3) {
            r0 = this;
            xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener r3 = (xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener) r3
            r0.loadNetworkAd2(r1, r2, r3)
            return
    }

    public void onRender() {
            r2 = this;
            xyz.adscope.amps.inner.AMPSBaseAdAdapterListener r0 = r2.mAMPSBaseAdAdapterListener
            if (r0 == 0) goto Ld
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener
            if (r1 == 0) goto Ld
            xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener r0 = (xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener) r0
            r0.onRender()
        Ld:
            return
    }

    public void onRenderFail(xyz.adscope.amps.common.AMPSError r3) {
            r2 = this;
            xyz.adscope.amps.inner.AMPSBaseAdAdapterListener r0 = r2.mAMPSBaseAdAdapterListener
            if (r0 == 0) goto Ld
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener
            if (r1 == 0) goto Ld
            xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener r0 = (xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener) r0
            r0.onRenderFail(r3)
        Ld:
            return
    }

    public void onRenderSuccess() {
            r2 = this;
            xyz.adscope.amps.inner.AMPSBaseAdAdapterListener r0 = r2.mAMPSBaseAdAdapterListener
            if (r0 == 0) goto Ld
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener
            if (r1 == 0) goto Ld
            xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener r0 = (xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener) r0
            r0.onRenderSuccess()
        Ld:
            return
    }

    public void pause() {
            r0 = this;
            return
    }

    /* renamed from: refreshAMPSAdAdapterListener, reason: avoid collision after fix types in other method */
    public void refreshAMPSAdAdapterListener2(xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener r1) {
            r0 = this;
            r0.mAMPSBaseAdAdapterListener = r1
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public /* bridge */ /* synthetic */ void refreshAMPSAdAdapterListener(xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener r1) {
            r0 = this;
            xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener r1 = (xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener) r1
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
