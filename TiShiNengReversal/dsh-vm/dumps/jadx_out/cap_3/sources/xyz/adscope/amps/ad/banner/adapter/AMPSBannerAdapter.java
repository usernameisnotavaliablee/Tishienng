package xyz.adscope.amps.ad.banner.adapter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class AMPSBannerAdapter extends xyz.adscope.amps.base.AMPSBaseAdapter<xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdAdapterListener> {
    private boolean isFirst;

    public AMPSBannerAdapter() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.isFirst = r0
            return
    }

    /* renamed from: loadNetworkAd, reason: avoid collision after fix types in other method */
    public void loadNetworkAd2(android.content.Context r2, xyz.adscope.amps.model.AMPSAdapterModel r3, xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdAdapterListener r4) {
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
    public /* bridge */ /* synthetic */ void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdAdapterListener r3) {
            r0 = this;
            xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdAdapterListener r3 = (xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdAdapterListener) r3
            r0.loadNetworkAd2(r1, r2, r3)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void onAdFailed(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r2.isFirst
            if (r0 == 0) goto L8
            super.onAdFailed(r3, r4)
            return
        L8:
            xyz.adscope.amps.inner.AMPSBaseAdAdapterListener r0 = r2.mAMPSBaseAdAdapterListener
            if (r0 == 0) goto L18
            xyz.adscope.amps.common.AMPSError r1 = new xyz.adscope.amps.common.AMPSError
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.<init>(r3, r4)
            r0.onAdFailed(r2, r1)
        L18:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void onAdLoad() {
            r1 = this;
            boolean r0 = r1.isFirst
            if (r0 == 0) goto Lb
            r0 = 0
            r1.isFirst = r0
            super.onAdLoad()
            return
        Lb:
            xyz.adscope.amps.inner.AMPSBaseAdAdapterListener r0 = r1.mAMPSBaseAdAdapterListener
            if (r0 == 0) goto L12
            r0.onAdLoaded(r1)
        L12:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void onAdShow() {
            r1 = this;
            xyz.adscope.amps.inner.AMPSBaseAdAdapterListener r0 = r1.mAMPSBaseAdAdapterListener
            if (r0 == 0) goto L7
            r0.onAdShow(r1)
        L7:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void onC2SBiddingSuccess(int r2) {
            r1 = this;
            boolean r0 = r1.isFirst
            if (r0 == 0) goto Lb
            r0 = 0
            r1.isFirst = r0
            super.onC2SBiddingSuccess(r2)
            return
        Lb:
            boolean r2 = r1.isBidding
            if (r2 != 0) goto L10
            goto L17
        L10:
            xyz.adscope.amps.inner.AMPSBaseAdAdapterListener r2 = r1.mAMPSBaseAdAdapterListener
            if (r2 == 0) goto L17
            r2.onAdLoaded(r1)
        L17:
            return
    }

    /* renamed from: refreshAMPSAdAdapterListener, reason: avoid collision after fix types in other method */
    public void refreshAMPSAdAdapterListener2(xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdAdapterListener r1) {
            r0 = this;
            r0.mAMPSBaseAdAdapterListener = r1
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public /* bridge */ /* synthetic */ void refreshAMPSAdAdapterListener(xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdAdapterListener r1) {
            r0 = this;
            xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdAdapterListener r1 = (xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdAdapterListener) r1
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
