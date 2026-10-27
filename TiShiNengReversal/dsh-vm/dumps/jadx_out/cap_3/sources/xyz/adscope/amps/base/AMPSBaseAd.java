package xyz.adscope.amps.base;

import xyz.adscope.amps.manager.inter.AMPSLoadEventListener;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class AMPSBaseAd<T extends xyz.adscope.amps.manager.inter.AMPSLoadEventListener> {
    private boolean isCallBack;
    protected xyz.adscope.amps.manager.inter.AMPSLoadEventListener loadEventListener;
    protected java.lang.ref.WeakReference<android.app.Activity> mActivityWeakRef;
    protected xyz.adscope.amps.manager.AMPSBaseOpenApiManager mAdLoadManager;
    protected int mAdLoadStatus;
    protected int mAdLoadType;
    protected xyz.adscope.amps.manager.AMPSBaseOpenApiManager mAdPreLoadManager;
    protected xyz.adscope.amps.AMPSRequestInfo mAsmsRequestInfo;
    protected android.content.Context mContext;
    protected java.lang.String mSpaceId;
    protected xyz.adscope.amps.config.AMPSRequestParameters parameters;

    public AMPSBaseAd(android.content.Context r2, xyz.adscope.amps.config.AMPSRequestParameters r3, T r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mAdLoadStatus = r0
            r1.mAdLoadType = r0
            r1.isCallBack = r0
            if (r2 == 0) goto L2a
            if (r3 == 0) goto L2a
            if (r4 != 0) goto L11
            goto L2a
        L11:
            r1.mContext = r2
            r1.parameters = r3
            java.lang.String r3 = r3.getSpaceId()
            r1.mSpaceId = r3
            boolean r3 = r2 instanceof android.app.Activity
            if (r3 == 0) goto L28
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            android.app.Activity r2 = (android.app.Activity) r2
            r3.<init>(r2)
            r1.mActivityWeakRef = r3
        L28:
            r1.mAdLoadType = r0
        L2a:
            return
    }

    private void refreshListener() {
            r2 = this;
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0 = r2.mAdLoadManager
            if (r0 != 0) goto L5
            goto L2b
        L5:
            boolean r1 = r2 instanceof xyz.adscope.amps.ad.splash.AMPSSplashAd
            if (r1 == 0) goto L12
            xyz.adscope.amps.ad.splash.AMPSSplashOpenApiManager r0 = (xyz.adscope.amps.ad.splash.AMPSSplashOpenApiManager) r0
            r1 = r2
            xyz.adscope.amps.ad.splash.AMPSSplashAd r1 = (xyz.adscope.amps.ad.splash.AMPSSplashAd) r1
            r0.refreshLoadEventListener(r1)
            return
        L12:
            boolean r1 = r2 instanceof xyz.adscope.amps.ad.interstitial.AMPSInterstitialAd
            if (r1 == 0) goto L1f
            xyz.adscope.amps.ad.interstitial.AMPSInterstitialOpenApiManager r0 = (xyz.adscope.amps.ad.interstitial.AMPSInterstitialOpenApiManager) r0
            r1 = r2
            xyz.adscope.amps.ad.interstitial.AMPSInterstitialAd r1 = (xyz.adscope.amps.ad.interstitial.AMPSInterstitialAd) r1
            r0.refreshLoadEventListener(r1)
            return
        L1f:
            boolean r1 = r2 instanceof xyz.adscope.amps.ad.reward.AMPSRewardVideoAd
            if (r1 == 0) goto L2b
            xyz.adscope.amps.ad.reward.AMPSRewardVideoOpenApiManager r0 = (xyz.adscope.amps.ad.reward.AMPSRewardVideoOpenApiManager) r0
            r1 = r2
            xyz.adscope.amps.ad.reward.AMPSRewardVideoAd r1 = (xyz.adscope.amps.ad.reward.AMPSRewardVideoAd) r1
            r0.refreshLoadEventListener(r1)
        L2b:
            return
    }

    public void autoRefreshAd() {
            r2 = this;
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0 = r2.mAdPreLoadManager
            if (r0 != 0) goto L5
            goto Ld
        L5:
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0 = r2.mAdLoadManager
            int r0 = r0.getAdAutoRefreshSwitch()
            if (r0 != 0) goto Le
        Ld:
            return
        Le:
            r0 = 0
            r2.isCallBack = r0
            r2.mAdLoadStatus = r0
            r0 = 2
            r2.mAdLoadType = r0
            xyz.adscope.amps.config.AMPSRequestParameters r0 = r2.parameters
            xyz.adscope.amps.report.AMPSReportConstants$LOAD_TYPE r1 = xyz.adscope.amps.report.AMPSReportConstants.LOAD_TYPE.LOAD_TYPE_AUTO
            java.lang.String r1 = r1.getValue()
            r0.setLoadType(r1)
            r0 = 0
            r2.mAdLoadManager = r0
            r2.loadAd()
            return
    }

    public void destroy() {
            r2 = this;
            r0 = 0
            r2.mActivityWeakRef = r0
            r2.mAsmsRequestInfo = r0
            r2.parameters = r0
            r2.mContext = r0
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r1 = r2.mAdLoadManager
            if (r1 == 0) goto L12
            r1.destroy()
            r2.mAdLoadManager = r0
        L12:
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r1 = r2.mAdPreLoadManager
            if (r1 == 0) goto L1b
            r1.destroy()
            r2.mAdPreLoadManager = r0
        L1b:
            r2.loadEventListener = r0
            return
    }

    public abstract xyz.adscope.amps.manager.AMPSBaseOpenApiManager getAMPSOpenApiManager();

    public int getEcpm() {
            r2 = this;
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0 = r2.mAdLoadManager
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = r0.getWinAdSourceModel()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            int r0 = r0.getEcpm()
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
            r2 = this;
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0 = r2.mAdLoadManager
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            xyz.adscope.amps.base.AMPSBaseAdapter r0 = r0.getWinAdSourceAdapter()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.util.Map r0 = r0.getMediaExtraInfo()
            return r0
    }

    public xyz.adscope.amps.manager.AMPSBaseOpenApiManager getPreloadAMPSOpenApiManager() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isReady() {
            r4 = this;
            java.lang.String r0 = r4.mSpaceId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            int r0 = r4.mAdLoadStatus
            r2 = 2
            r3 = 1
            if (r0 != r2) goto L11
            return r3
        L11:
            xyz.adscope.amps.control.preload.AMPSPreLoad r0 = xyz.adscope.amps.control.preload.AMPSPreLoad.getInstance()
            java.lang.String r2 = r4.mSpaceId
            xyz.adscope.amps.model.preload.AMPSPreloadManagerInfo r0 = r0.getAMPSPreloadManagerInfo(r2)
            if (r0 != 0) goto L1e
            return r1
        L1e:
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0 = r0.getBaseOpenApiManager()
            if (r0 != 0) goto L25
            return r1
        L25:
            r4.mAdLoadManager = r0
            r4.refreshListener()
            return r3
    }

    public void loadAd() {
            r3 = this;
            xyz.adscope.amps.config.AMPSRequestParameters r0 = r3.parameters
            if (r0 != 0) goto L8
            r3.onAdFailed()
            return
        L8:
            xyz.adscope.amps.report.AMPSReportConstants$LOAD_TYPE r1 = xyz.adscope.amps.report.AMPSReportConstants.LOAD_TYPE.LOAD_TYPE_NORMAL
            java.lang.String r1 = r1.getValue()
            r0.setLoadType(r1)
            int r0 = r3.mAdLoadStatus
            r1 = 1
            if (r0 == 0) goto L19
            r3.isCallBack = r1
            return
        L19:
            xyz.adscope.amps.control.preload.AMPSPreLoad r0 = xyz.adscope.amps.control.preload.AMPSPreLoad.getInstance()
            java.lang.String r2 = r3.mSpaceId
            xyz.adscope.amps.model.preload.AMPSPreloadManagerInfo r0 = r0.getAMPSPreloadManagerInfo(r2)
            if (r0 == 0) goto L34
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0 = r0.getBaseOpenApiManager()
            if (r0 == 0) goto L34
            r3.mAdLoadManager = r0
            r3.refreshListener()
            r3.onAdLoaded()
            return
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "AMPS startLoad start spaceId:"
            r0.append(r2)
            java.lang.String r2 = r3.mSpaceId
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r2, r0)
            r3.mAdLoadStatus = r1
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0 = r3.getAMPSOpenApiManager()
            r3.mAdLoadManager = r0
            r0.startLoad()
            return
    }

    public void onAdClicked() {
            r2 = this;
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r0 = r2.loadEventListener
            if (r0 != 0) goto L5
            goto L2c
        L5:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener
            if (r1 == 0) goto Lf
            xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener r0 = (xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener) r0
            r0.onAmpsAdClicked()
            return
        Lf:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener
            if (r1 == 0) goto L19
            xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener r0 = (xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener) r0
            r0.onAmpsAdClicked()
            return
        L19:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener
            if (r1 == 0) goto L23
            xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener r0 = (xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener) r0
            r0.onAmpsAdClicked()
            return
        L23:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener
            if (r1 == 0) goto L2c
            xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r0 = (xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener) r0
            r0.onAmpsAdVideoClick()
        L2c:
            return
    }

    public void onAdDismiss() {
            r2 = this;
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r0 = r2.loadEventListener
            if (r0 != 0) goto L5
            goto L2c
        L5:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener
            if (r1 == 0) goto Lf
            xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener r0 = (xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener) r0
            r0.onAmpsAdDismiss()
            return
        Lf:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener
            if (r1 == 0) goto L19
            xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener r0 = (xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener) r0
            r0.onAmpsAdDismiss()
            return
        L19:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener
            if (r1 == 0) goto L23
            xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener r0 = (xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener) r0
            r0.onAmpsAdDismiss()
            return
        L23:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener
            if (r1 == 0) goto L2c
            xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r0 = (xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener) r0
            r0.onAmpsAdDismiss()
        L2c:
            return
    }

    public void onAdFailed() {
            r3 = this;
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r0 = r3.loadEventListener
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 3
            r3.mAdLoadStatus = r0
            xyz.adscope.amps.common.AMPSError r0 = new xyz.adscope.amps.common.AMPSError
            xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum r1 = xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.PLATFORM_ERROR_PARAM_ERROR
            java.lang.String r2 = r1.getErrorCode()
            java.lang.String r1 = r1.getErrorMsg()
            r0.<init>(r2, r1)
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r1 = r3.loadEventListener
            boolean r2 = r1 instanceof xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener
            if (r2 == 0) goto L23
            xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener r1 = (xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener) r1
            r1.onAmpsAdFailed(r0)
            goto L4a
        L23:
            boolean r2 = r1 instanceof xyz.adscope.amps.ad.nativead.AMPSNativeLoadEventListener
            if (r2 == 0) goto L2d
            xyz.adscope.amps.ad.nativead.AMPSNativeLoadEventListener r1 = (xyz.adscope.amps.ad.nativead.AMPSNativeLoadEventListener) r1
            r1.onAmpsAdFailed(r0)
            goto L4a
        L2d:
            boolean r2 = r1 instanceof xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener
            if (r2 == 0) goto L37
            xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener r1 = (xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener) r1
            r1.onAmpsAdFailed(r0)
            goto L4a
        L37:
            boolean r2 = r1 instanceof xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener
            if (r2 == 0) goto L41
            xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener r1 = (xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener) r1
            r1.onAmpsAdFailed(r0)
            goto L4a
        L41:
            boolean r2 = r1 instanceof xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener
            if (r2 == 0) goto L4a
            xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r1 = (xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener) r1
            r1.onAmpsAdFailed(r0)
        L4a:
            r3.destroy()
            return
    }

    public void onAdFailed(xyz.adscope.amps.common.AMPSError r4) {
            r3 = this;
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r0 = r3.loadEventListener
            if (r0 != 0) goto L5
            goto L43
        L5:
            r1 = 3
            r3.mAdLoadStatus = r1
            int r1 = r3.mAdLoadType
            r2 = 2
            if (r1 != r2) goto L12
            boolean r1 = r3.isCallBack
            if (r1 != 0) goto L12
            goto L43
        L12:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener
            if (r1 == 0) goto L1c
            xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener r0 = (xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener) r0
            r0.onAmpsAdFailed(r4)
            return
        L1c:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.nativead.AMPSNativeLoadEventListener
            if (r1 == 0) goto L26
            xyz.adscope.amps.ad.nativead.AMPSNativeLoadEventListener r0 = (xyz.adscope.amps.ad.nativead.AMPSNativeLoadEventListener) r0
            r0.onAmpsAdFailed(r4)
            return
        L26:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener
            if (r1 == 0) goto L30
            xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener r0 = (xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener) r0
            r0.onAmpsAdFailed(r4)
            return
        L30:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener
            if (r1 == 0) goto L3a
            xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener r0 = (xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener) r0
            r0.onAmpsAdFailed(r4)
            return
        L3a:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener
            if (r1 == 0) goto L43
            xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r0 = (xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener) r0
            r0.onAmpsAdFailed(r4)
        L43:
            return
    }

    public void onAdLoaded() {
            r3 = this;
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r0 = r3.loadEventListener
            if (r0 != 0) goto L5
            goto L66
        L5:
            java.lang.String r0 = "amps_log_tag"
            java.lang.String r1 = " AMPSBaseAd onAdLoaded"
            xyz.adscope.common.tool.LogUtil.e(r0, r1)
            r0 = 2
            r3.mAdLoadStatus = r0
            int r1 = r3.mAdLoadType
            r2 = 1
            if (r1 != r0) goto L1b
            boolean r0 = r3.isCallBack
            if (r0 != 0) goto L1b
            r3.isCallBack = r2
            return
        L1b:
            r3.isCallBack = r2
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r0 = r3.loadEventListener
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener
            if (r1 == 0) goto L29
            xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener r0 = (xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener) r0
            r0.onAmpsAdLoaded()
            return
        L29:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.nativead.AMPSNativeLoadEventListener
            if (r1 == 0) goto L49
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0 = r3.mAdLoadManager
            xyz.adscope.amps.base.AMPSBaseAdapter r0 = r0.getWinAdSourceAdapter()
            if (r0 == 0) goto L40
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter
            if (r1 == 0) goto L40
            xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter r0 = (xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter) r0
            java.util.List r0 = r0.getNativeListInfo()
            goto L41
        L40:
            r0 = 0
        L41:
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r1 = r3.loadEventListener
            xyz.adscope.amps.ad.nativead.AMPSNativeLoadEventListener r1 = (xyz.adscope.amps.ad.nativead.AMPSNativeLoadEventListener) r1
            r1.onAmpsAdLoad(r0)
            return
        L49:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener
            if (r1 == 0) goto L53
            xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener r0 = (xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener) r0
            r0.onAmpsAdLoaded()
            return
        L53:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener
            if (r1 == 0) goto L5d
            xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener r0 = (xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener) r0
            r0.onAmpsAdLoaded()
            return
        L5d:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener
            if (r1 == 0) goto L66
            xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r0 = (xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener) r0
            r0.onAmpsAdLoad()
        L66:
            return
    }

    public void onAdShow() {
            r2 = this;
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r0 = r2.loadEventListener
            if (r0 != 0) goto L5
            goto L2c
        L5:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener
            if (r1 == 0) goto Lf
            xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener r0 = (xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener) r0
            r0.onAmpsAdShow()
            return
        Lf:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener
            if (r1 == 0) goto L19
            xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener r0 = (xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener) r0
            r0.onAmpsAdShow()
            return
        L19:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener
            if (r1 == 0) goto L23
            xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener r0 = (xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener) r0
            r0.onAmpsAdShow()
            return
        L23:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener
            if (r1 == 0) goto L2c
            xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r0 = (xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener) r0
            r0.onAmpsAdShow()
        L2c:
            return
    }
}
