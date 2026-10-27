package xyz.adscope.amps.base;

import xyz.adscope.amps.inner.AMPSBaseAdAdapterListener;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class AMPSBaseAdapter<T extends xyz.adscope.amps.inner.AMPSBaseAdAdapterListener> {
    private static final int REQUEST_TIME_OUT_MESSAGE = 10001;
    public int adCount;
    public int autoPlayPolicy;
    public int expressViewHeight;
    public int expressViewHeightDp;
    public int expressViewWidth;
    public int expressViewWidthDp;
    public boolean isBidding;
    public boolean isHasBiddingResult;
    public boolean isHasLoadResult;
    public boolean isLandScape;
    public boolean isLoadSuccess;
    public int isSendBidData;
    private boolean isShow;
    public boolean isVolumeOn;
    public java.util.Map<java.lang.String, java.lang.Object> localCustomParameter;
    public xyz.adscope.amps.inner.AMPSAdBiddingListener mAMPSAdBiddingListener;
    public xyz.adscope.amps.inner.AMPSBaseAdAdapterListener mAMPSBaseAdAdapterListener;
    public java.lang.String mAccountId;
    public int mAdEcpm;
    public java.lang.String mAppId;
    public java.lang.String mBiddingType;
    public android.content.Context mContext;
    public java.lang.String mExtra;
    public int mFloorEcpm;
    private android.os.Handler mHandler;
    public xyz.adscope.amps.init.AMPSInitAdapterConfig mInitAdapterConfig;
    public java.lang.String mPublicKey;
    private java.util.Timer mRequestTimeoutTimer;
    private java.util.TimerTask mRequestTimeoutTimerTask;
    public java.lang.String mSeatId;
    public java.lang.String mServerUrl;
    public java.lang.String mSpaceId;
    public int mTimeout;
    public java.lang.String mUserId;
    public int videoMaxTime;



    public AMPSBaseAdapter() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mAppId = r0
            r2.mSpaceId = r0
            r1 = 5000(0x1388, float:7.006E-42)
            r2.mTimeout = r1
            r2.mAMPSBaseAdAdapterListener = r0
            r2.mAMPSAdBiddingListener = r0
            r0 = 0
            r2.isBidding = r0
            r2.isHasLoadResult = r0
            r2.isHasBiddingResult = r0
            r2.isLoadSuccess = r0
            r2.isShow = r0
            r1 = 1
            r2.adCount = r1
            r2.isVolumeOn = r0
            r2.isLandScape = r0
            xyz.adscope.amps.base.AMPSBaseAdapter$1 r0 = new xyz.adscope.amps.base.AMPSBaseAdapter$1
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r2, r1)
            r2.mHandler = r0
            return
    }

    static /* synthetic */ android.os.Handler access$000(xyz.adscope.amps.base.AMPSBaseAdapter r0) {
            android.os.Handler r0 = r0.mHandler
            return r0
    }

    public void buildRequestedTimerTask() {
            r4 = this;
            java.util.Timer r0 = r4.mRequestTimeoutTimer     // Catch: java.lang.Exception -> L25
            if (r0 != 0) goto Lb
            java.util.Timer r0 = new java.util.Timer     // Catch: java.lang.Exception -> L25
            r0.<init>()     // Catch: java.lang.Exception -> L25
            r4.mRequestTimeoutTimer = r0     // Catch: java.lang.Exception -> L25
        Lb:
            java.util.TimerTask r0 = r4.mRequestTimeoutTimerTask     // Catch: java.lang.Exception -> L25
            if (r0 != 0) goto L16
            xyz.adscope.amps.base.AMPSBaseAdapter$2 r0 = new xyz.adscope.amps.base.AMPSBaseAdapter$2     // Catch: java.lang.Exception -> L25
            r0.<init>(r4)     // Catch: java.lang.Exception -> L25
            r4.mRequestTimeoutTimerTask = r0     // Catch: java.lang.Exception -> L25
        L16:
            java.util.Timer r0 = r4.mRequestTimeoutTimer     // Catch: java.lang.Exception -> L25
            if (r0 == 0) goto L25
            java.util.TimerTask r1 = r4.mRequestTimeoutTimerTask     // Catch: java.lang.Exception -> L25
            if (r1 != 0) goto L1f
            goto L25
        L1f:
            int r2 = r4.mTimeout     // Catch: java.lang.Exception -> L25
            long r2 = (long) r2     // Catch: java.lang.Exception -> L25
            r0.schedule(r1, r2)     // Catch: java.lang.Exception -> L25
        L25:
            return
    }

    public void cancelRequestedTimerTask() {
            r2 = this;
            java.util.TimerTask r0 = r2.mRequestTimeoutTimerTask     // Catch: java.lang.Exception -> L13
            r1 = 0
            if (r0 == 0) goto La
            r0.cancel()     // Catch: java.lang.Exception -> L13
            r2.mRequestTimeoutTimerTask = r1     // Catch: java.lang.Exception -> L13
        La:
            java.util.Timer r0 = r2.mRequestTimeoutTimer     // Catch: java.lang.Exception -> L13
            if (r0 == 0) goto L13
            r0.cancel()     // Catch: java.lang.Exception -> L13
            r2.mRequestTimeoutTimer = r1     // Catch: java.lang.Exception -> L13
        L13:
            return
    }

    public void destroy() {
            r1 = this;
            r0 = 0
            r1.mContext = r0
            r1.mAMPSBaseAdAdapterListener = r0
            r1.mAMPSAdBiddingListener = r0
            return
    }

    public int getFloorEcpm() {
            r1 = this;
            int r0 = r1.mFloorEcpm
            return r0
    }

    public java.lang.String getMediaCustomExtraInfo() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getNetworkSpaceId() {
            r1 = this;
            java.lang.String r0 = r1.mSpaceId
            return r0
    }

    public void getRequestParameters(android.content.Context r3, xyz.adscope.amps.model.AMPSAdapterModel r4) {
            r2 = this;
            if (r4 == 0) goto Lcc
            java.lang.String r0 = r4.getAppId()     // Catch: java.lang.Exception -> Lcc
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Lcc
            if (r0 != 0) goto L12
            java.lang.String r0 = r4.getAppId()     // Catch: java.lang.Exception -> Lcc
            r2.mAppId = r0     // Catch: java.lang.Exception -> Lcc
        L12:
            java.lang.String r0 = r4.getSpaceId()     // Catch: java.lang.Exception -> Lcc
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Lcc
            if (r0 != 0) goto L22
            java.lang.String r0 = r4.getSpaceId()     // Catch: java.lang.Exception -> Lcc
            r2.mSpaceId = r0     // Catch: java.lang.Exception -> Lcc
        L22:
            java.lang.String r0 = r4.getOrientation()     // Catch: java.lang.Exception -> Lcc
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Lcc
            if (r0 != 0) goto L3c
            java.lang.String r0 = r4.getOrientation()     // Catch: java.lang.Exception -> Lcc
            xyz.adscope.amps.common.AMPSEnum$OrientationEnum r1 = xyz.adscope.amps.common.AMPSEnum.OrientationEnum.ORIENTATION_LANDSCAPE     // Catch: java.lang.Exception -> Lcc
            java.lang.String r1 = r1.getOrientation()     // Catch: java.lang.Exception -> Lcc
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Lcc
            r2.isLandScape = r0     // Catch: java.lang.Exception -> Lcc
        L3c:
            int r0 = r4.getTimeOut()     // Catch: java.lang.Exception -> Lcc
            r2.mTimeout = r0     // Catch: java.lang.Exception -> Lcc
            java.lang.String r0 = r4.getUserId()     // Catch: java.lang.Exception -> Lcc
            r2.mUserId = r0     // Catch: java.lang.Exception -> Lcc
            java.lang.String r0 = r4.getExtra()     // Catch: java.lang.Exception -> Lcc
            r2.mExtra = r0     // Catch: java.lang.Exception -> Lcc
            int r0 = r4.getAdCount()     // Catch: java.lang.Exception -> Lcc
            r2.adCount = r0     // Catch: java.lang.Exception -> Lcc
            int r0 = r4.getExpressViewWidth()     // Catch: java.lang.Exception -> Lcc
            r2.expressViewWidth = r0     // Catch: java.lang.Exception -> Lcc
            int r0 = r4.getExpressViewHeight()     // Catch: java.lang.Exception -> Lcc
            r2.expressViewHeight = r0     // Catch: java.lang.Exception -> Lcc
            int r0 = r2.expressViewWidth     // Catch: java.lang.Exception -> Lcc
            if (r0 > 0) goto L6c
            android.content.Context r0 = r2.mContext     // Catch: java.lang.Exception -> Lcc
            int r0 = xyz.adscope.amps.tool.util.AMPSScreenUtil.getScreenWidth(r0)     // Catch: java.lang.Exception -> Lcc
            r2.expressViewWidth = r0     // Catch: java.lang.Exception -> Lcc
        L6c:
            int r0 = r2.expressViewWidth     // Catch: java.lang.Exception -> Lcc
            float r0 = (float) r0     // Catch: java.lang.Exception -> Lcc
            int r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.px2dip(r3, r0)     // Catch: java.lang.Exception -> Lcc
            r2.expressViewWidthDp = r0     // Catch: java.lang.Exception -> Lcc
            int r0 = r2.expressViewHeight     // Catch: java.lang.Exception -> Lcc
            float r0 = (float) r0     // Catch: java.lang.Exception -> Lcc
            int r3 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.px2dip(r3, r0)     // Catch: java.lang.Exception -> Lcc
            r2.expressViewHeightDp = r3     // Catch: java.lang.Exception -> Lcc
            int r3 = r4.getVideoSound()     // Catch: java.lang.Exception -> Lcc
            xyz.adscope.amps.common.AMPSEnum$VideoSoundEnum r0 = xyz.adscope.amps.common.AMPSEnum.VideoSoundEnum.SUPPORT_VIDEO_SOUND     // Catch: java.lang.Exception -> Lcc
            int r0 = r0.getHasSound()     // Catch: java.lang.Exception -> Lcc
            if (r3 != r0) goto L8c
            r3 = 1
            goto L8d
        L8c:
            r3 = 0
        L8d:
            r2.isVolumeOn = r3     // Catch: java.lang.Exception -> Lcc
            int r3 = r4.getVideoAutoPlay()     // Catch: java.lang.Exception -> Lcc
            r2.autoPlayPolicy = r3     // Catch: java.lang.Exception -> Lcc
            long r0 = r4.getVideoMaxTime()     // Catch: java.lang.Exception -> Lcc
            int r3 = (int) r0     // Catch: java.lang.Exception -> Lcc
            r2.videoMaxTime = r3     // Catch: java.lang.Exception -> Lcc
            xyz.adscope.amps.init.AMPSInitAdapterConfig r3 = r4.getAmpsInitAdapterConfig()     // Catch: java.lang.Exception -> Lcc
            r2.mInitAdapterConfig = r3     // Catch: java.lang.Exception -> Lcc
            java.util.Map r3 = r4.getLocalCustomParameter()     // Catch: java.lang.Exception -> Lcc
            r2.localCustomParameter = r3     // Catch: java.lang.Exception -> Lcc
            int r3 = r4.getIsSendBidData()     // Catch: java.lang.Exception -> Lcc
            r2.isSendBidData = r3     // Catch: java.lang.Exception -> Lcc
            java.lang.String r3 = r4.getBiddingType()     // Catch: java.lang.Exception -> Lcc
            r2.mBiddingType = r3     // Catch: java.lang.Exception -> Lcc
            int r3 = r4.getFloorEcpm()     // Catch: java.lang.Exception -> Lcc
            r2.mFloorEcpm = r3     // Catch: java.lang.Exception -> Lcc
            java.lang.String r3 = r4.getAccountId()     // Catch: java.lang.Exception -> Lcc
            r2.mAccountId = r3     // Catch: java.lang.Exception -> Lcc
            java.lang.String r3 = r4.getServerUrl()     // Catch: java.lang.Exception -> Lcc
            r2.mServerUrl = r3     // Catch: java.lang.Exception -> Lcc
            java.lang.String r3 = r4.getPublicKey()     // Catch: java.lang.Exception -> Lcc
            r2.mPublicKey = r3     // Catch: java.lang.Exception -> Lcc
        Lcc:
            return
    }

    public java.lang.String getSeatId() {
            r1 = this;
            java.lang.String r0 = r1.mSeatId
            return r0
    }

    public boolean isC2SAdSource() {
            r2 = this;
            boolean r0 = r2.isBidding
            if (r0 == 0) goto L10
            java.lang.String r0 = "C2S"
            java.lang.String r1 = r2.mBiddingType
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public boolean isS2SAdSource() {
            r2 = this;
            boolean r0 = r2.isBidding
            if (r0 == 0) goto L10
            java.lang.String r0 = "S2S"
            java.lang.String r1 = r2.mBiddingType
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public abstract boolean isValid();

    public abstract void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, T r3);

    public void onAdClicked() {
            r1 = this;
            xyz.adscope.amps.inner.AMPSBaseAdAdapterListener r0 = r1.mAMPSBaseAdAdapterListener
            if (r0 == 0) goto L7
            r0.onAdClicked(r1)
        L7:
            return
    }

    public void onAdDismiss() {
            r1 = this;
            xyz.adscope.amps.inner.AMPSBaseAdAdapterListener r0 = r1.mAMPSBaseAdAdapterListener
            if (r0 == 0) goto L7
            r0.onAdDismiss(r1)
        L7:
            return
    }

    public void onAdFailed(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r2.isLoadSuccess
            if (r0 == 0) goto L14
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_REQUEST_TIMEOUT
            java.lang.String r0 = r0.getErrorCode()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L14
            r2.onAdShowFailed(r3, r4)
            return
        L14:
            boolean r0 = r2.isHasLoadResult
            if (r0 == 0) goto L19
            goto L3b
        L19:
            r0 = 1
            r2.isHasLoadResult = r0
            r2.cancelRequestedTimerTask()
            boolean r0 = r2.isBidding
            if (r0 == 0) goto L2b
            boolean r0 = r2.isHasBiddingResult
            if (r0 != 0) goto L2b
            r2.onC2SBiddingFail(r3, r4)
            return
        L2b:
            xyz.adscope.amps.inner.AMPSBaseAdAdapterListener r0 = r2.mAMPSBaseAdAdapterListener
            if (r0 == 0) goto L3b
            xyz.adscope.amps.common.AMPSError r1 = new xyz.adscope.amps.common.AMPSError
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.<init>(r3, r4)
            r0.onAdFailed(r2, r1)
        L3b:
            return
    }

    public void onAdLoad() {
            r1 = this;
            boolean r0 = r1.isHasLoadResult
            if (r0 == 0) goto L5
            goto L14
        L5:
            r0 = 1
            r1.isLoadSuccess = r0
            r1.isHasLoadResult = r0
            r1.cancelRequestedTimerTask()
            xyz.adscope.amps.inner.AMPSBaseAdAdapterListener r0 = r1.mAMPSBaseAdAdapterListener
            if (r0 == 0) goto L14
            r0.onAdLoaded(r1)
        L14:
            return
    }

    public void onAdShow() {
            r1 = this;
            boolean r0 = r1.isShow
            if (r0 == 0) goto L5
            goto Lf
        L5:
            r0 = 1
            r1.isShow = r0
            xyz.adscope.amps.inner.AMPSBaseAdAdapterListener r0 = r1.mAMPSBaseAdAdapterListener
            if (r0 == 0) goto Lf
            r0.onAdShow(r1)
        Lf:
            return
    }

    public void onAdShowFailed(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r2.isLoadSuccess
            if (r0 != 0) goto L8
            r2.onAdFailed(r3, r4)
            return
        L8:
            xyz.adscope.amps.inner.AMPSBaseAdAdapterListener r0 = r2.mAMPSBaseAdAdapterListener
            if (r0 == 0) goto L18
            xyz.adscope.amps.common.AMPSError r1 = new xyz.adscope.amps.common.AMPSError
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.<init>(r3, r4)
            r0.onAdShowFailed(r2, r1)
        L18:
            return
    }

    public void onC2SBiddingFail(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 1
            r1.isHasBiddingResult = r0
            r1.cancelRequestedTimerTask()
            boolean r0 = r1.isBidding
            if (r0 == 0) goto L15
            xyz.adscope.amps.inner.AMPSAdBiddingListener r0 = r1.mAMPSAdBiddingListener
            if (r0 == 0) goto L15
            xyz.adscope.amps.base.AMPSBaseBiddingResult r2 = xyz.adscope.amps.base.AMPSBaseBiddingResult.biddingFail(r2, r3)
            r0.onC2SBiddingFail(r1, r2)
        L15:
            return
    }

    public void onC2SBiddingSuccess(int r2) {
            r1 = this;
            r0 = 1
            r1.isHasBiddingResult = r0
            r1.cancelRequestedTimerTask()
            boolean r0 = r1.isBidding
            if (r0 == 0) goto L15
            xyz.adscope.amps.inner.AMPSAdBiddingListener r0 = r1.mAMPSAdBiddingListener
            if (r0 == 0) goto L15
            xyz.adscope.amps.base.AMPSBaseBiddingResult r2 = xyz.adscope.amps.base.AMPSBaseBiddingResult.biddingSuccess(r2)
            r0.onC2SBiddingSuccess(r1, r2)
        L15:
            return
    }

    public void onS2SBiddingFail(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 1
            r1.isHasBiddingResult = r0
            r1.cancelRequestedTimerTask()
            boolean r0 = r1.isBidding
            if (r0 == 0) goto L15
            xyz.adscope.amps.inner.AMPSAdBiddingListener r0 = r1.mAMPSAdBiddingListener
            if (r0 == 0) goto L15
            xyz.adscope.amps.base.AMPSBaseBiddingResult r2 = xyz.adscope.amps.base.AMPSBaseBiddingResult.biddingFail(r2, r3)
            r0.onS2SBiddingFail(r1, r2)
        L15:
            return
    }

    public void onS2SBiddingSuccess(int r2) {
            r1 = this;
            r0 = 1
            r1.isHasBiddingResult = r0
            r1.cancelRequestedTimerTask()
            boolean r0 = r1.isBidding
            if (r0 == 0) goto L15
            xyz.adscope.amps.inner.AMPSAdBiddingListener r0 = r1.mAMPSAdBiddingListener
            if (r0 == 0) goto L15
            xyz.adscope.amps.base.AMPSBaseBiddingResult r2 = xyz.adscope.amps.base.AMPSBaseBiddingResult.biddingSuccess(r2)
            r0.onS2SBiddingSuccess(r1, r2)
        L15:
            return
    }

    public void refreshAMPSAdAdapterListener(T r1) {
            r0 = this;
            return
    }

    public void sendLossNotice(xyz.adscope.amps.base.AMPSBidResult r1) {
            r0 = this;
            return
    }

    public void sendWinNotice(xyz.adscope.amps.base.AMPSBidResult r1) {
            r0 = this;
            return
    }

    public abstract void showAd(android.app.Activity r1);

    public abstract void showAd(android.view.ViewGroup r1);

    public void startBid(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.inner.AMPSAdBiddingListener r3) {
            r0 = this;
            return
    }
}
