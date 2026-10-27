package xyz.adscope.amps.ad.splash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSSplashAd extends xyz.adscope.amps.base.AMPSBaseAd implements xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener {


    public AMPSSplashAd(android.content.Context r1, xyz.adscope.amps.config.AMPSRequestParameters r2, xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.loadEventListener = r3
            return
    }

    public void addPreLoadAdInfo() {
            r3 = this;
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0 = r3.mAdPreLoadManager
            if (r0 == 0) goto L18
            java.lang.String r0 = r3.mSpaceId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Ld
            goto L18
        Ld:
            xyz.adscope.amps.control.preload.AMPSPreLoad r0 = xyz.adscope.amps.control.preload.AMPSPreLoad.getInstance()
            java.lang.String r1 = r3.mSpaceId
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r2 = r3.mAdPreLoadManager
            r0.addPreLoadAdInfo(r1, r2)
        L18:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAd
    public xyz.adscope.amps.manager.AMPSBaseOpenApiManager getAMPSOpenApiManager() {
            r3 = this;
            xyz.adscope.amps.ad.splash.AMPSSplashOpenApiManager r0 = new xyz.adscope.amps.ad.splash.AMPSSplashOpenApiManager
            android.content.Context r1 = r3.mContext
            xyz.adscope.amps.config.AMPSRequestParameters r2 = r3.parameters
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAd
    public xyz.adscope.amps.manager.AMPSBaseOpenApiManager getPreloadAMPSOpenApiManager() {
            r4 = this;
            xyz.adscope.amps.ad.splash.AMPSSplashOpenApiManager r0 = new xyz.adscope.amps.ad.splash.AMPSSplashOpenApiManager
            android.content.Context r1 = r4.mContext
            xyz.adscope.amps.config.AMPSRequestParameters r2 = r4.parameters
            xyz.adscope.amps.ad.splash.AMPSSplashAd$1 r3 = new xyz.adscope.amps.ad.splash.AMPSSplashAd$1
            r3.<init>(r4)
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener
    public void onAmpsAdClicked() {
            r0 = this;
            r0.onAdClicked()
            return
    }

    @Override // xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener
    public void onAmpsAdDismiss() {
            r0 = this;
            r0.onAdDismiss()
            r0.autoRefreshAd()
            return
    }

    @Override // xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener
    public void onAmpsAdFailed(xyz.adscope.amps.common.AMPSError r1) {
            r0 = this;
            r0.onAdFailed(r1)
            return
    }

    @Override // xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener
    public void onAmpsAdLoaded() {
            r0 = this;
            r0.onAdLoaded()
            return
    }

    @Override // xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener
    public void onAmpsAdShow() {
            r0 = this;
            r0.onAdShow()
            return
    }

    public void preLoad() {
            r2 = this;
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0 = r2.mAdPreLoadManager
            if (r0 == 0) goto L5
            return
        L5:
            xyz.adscope.amps.config.AMPSRequestParameters r0 = r2.parameters
            if (r0 == 0) goto L12
            xyz.adscope.amps.report.AMPSReportConstants$LOAD_TYPE r1 = xyz.adscope.amps.report.AMPSReportConstants.LOAD_TYPE.LOAD_TYPE_PRELOAD
            java.lang.String r1 = r1.getValue()
            r0.setLoadType(r1)
        L12:
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0 = r2.getPreloadAMPSOpenApiManager()
            r2.mAdPreLoadManager = r0
            r0.startLoad()
            return
    }

    public void show(android.view.ViewGroup r2) {
            r1 = this;
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0 = r1.mAdLoadManager
            if (r0 != 0) goto L8
            r1.onAdFailed()
            return
        L8:
            r0.show(r2)
            return
    }
}
