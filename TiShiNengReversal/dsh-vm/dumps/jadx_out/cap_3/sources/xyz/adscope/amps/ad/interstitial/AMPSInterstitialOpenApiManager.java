package xyz.adscope.amps.ad.interstitial;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSInterstitialOpenApiManager extends xyz.adscope.amps.manager.AMPSBaseOpenApiManager implements xyz.adscope.amps.ad.interstitial.adapter.AMPSInterstitialAdAdapterListener {
    private xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener ampsIntersititialLoadEventListener;

    public AMPSInterstitialOpenApiManager(android.content.Context r1, xyz.adscope.amps.config.AMPSRequestParameters r2, xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.ampsIntersititialLoadEventListener = r3
            return
    }

    @Override // xyz.adscope.amps.ad.interstitial.adapter.AMPSInterstitialAdAdapterListener
    public void onSkippedAd() {
            r1 = this;
            xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener r0 = r1.ampsIntersititialLoadEventListener
            if (r0 == 0) goto L7
            r0.onAmpsSkippedAd()
        L7:
            return
    }

    @Override // xyz.adscope.amps.ad.interstitial.adapter.AMPSInterstitialAdAdapterListener
    public void onVideoPlayEnd() {
            r1 = this;
            xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener r0 = r1.ampsIntersititialLoadEventListener
            if (r0 == 0) goto L7
            r0.onAmpsVideoPlayEnd()
        L7:
            return
    }

    @Override // xyz.adscope.amps.ad.interstitial.adapter.AMPSInterstitialAdAdapterListener
    public void onVideoPlayStart() {
            r1 = this;
            xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener r0 = r1.ampsIntersititialLoadEventListener
            if (r0 == 0) goto L7
            r0.onAmpsVideoPlayStart()
        L7:
            return
    }

    public void refreshLoadEventListener(xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener r1) {
            r0 = this;
            r0.ampsIntersititialLoadEventListener = r1
            r0.refreshListener(r1)
            return
    }
}
