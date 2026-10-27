package xyz.adscope.amps.ad.nativead.inter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class AMPSNativeAdEventListener implements xyz.adscope.amps.base.AMPSBaseListener {
    public AMPSNativeAdEventListener() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void onAdClicked(xyz.adscope.amps.ad.nativead.view.AMPSNativeAdView r1);

    public abstract void onAdImpressed(java.util.List<xyz.adscope.amps.ad.nativead.view.AMPSNativeAdView> r1);

    public abstract void onAdVideoEnd(xyz.adscope.amps.ad.nativead.view.AMPSNativeAdView r1);

    public abstract void onAdVideoProgress(xyz.adscope.amps.ad.nativead.view.AMPSNativeAdView r1, int r2);

    public abstract void onAdVideoStart(xyz.adscope.amps.ad.nativead.view.AMPSNativeAdView r1);
}
