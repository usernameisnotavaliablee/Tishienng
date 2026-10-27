package xyz.adscope.amps.ad.splash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSSplashOpenApiManager extends xyz.adscope.amps.manager.AMPSBaseOpenApiManager implements xyz.adscope.amps.ad.splash.adapter.AMPSSplashAdAdapterListener {
    private xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener ampsSplashLoadEventListener;

    public AMPSSplashOpenApiManager(android.content.Context r1, xyz.adscope.amps.config.AMPSRequestParameters r2, xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.ampsSplashLoadEventListener = r3
            return
    }

    @Override // xyz.adscope.amps.ad.splash.adapter.AMPSSplashAdAdapterListener
    public void onSkippedAd() {
            r1 = this;
            xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener r0 = r1.ampsSplashLoadEventListener
            if (r0 == 0) goto L7
            r0.onAmpsAdDismiss()
        L7:
            return
    }

    public void refreshLoadEventListener(xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener r1) {
            r0 = this;
            r0.ampsSplashLoadEventListener = r1
            r0.refreshListener(r1)
            return
    }
}
