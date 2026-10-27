package xyz.adscope.amps.ad.banner;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSBannerAd extends xyz.adscope.amps.base.AMPSBaseAd {
    private xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener ampsBannerLoadEventListener;

    public AMPSBannerAd(android.content.Context r1, xyz.adscope.amps.config.AMPSRequestParameters r2, xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.ampsBannerLoadEventListener = r3
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAd
    public xyz.adscope.amps.manager.AMPSBaseOpenApiManager getAMPSOpenApiManager() {
            r4 = this;
            xyz.adscope.amps.ad.banner.AMPSBannerOpenApiManager r0 = new xyz.adscope.amps.ad.banner.AMPSBannerOpenApiManager
            android.content.Context r1 = r4.mContext
            xyz.adscope.amps.config.AMPSRequestParameters r2 = r4.parameters
            xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener r3 = r4.ampsBannerLoadEventListener
            r0.<init>(r1, r2, r3)
            return r0
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
