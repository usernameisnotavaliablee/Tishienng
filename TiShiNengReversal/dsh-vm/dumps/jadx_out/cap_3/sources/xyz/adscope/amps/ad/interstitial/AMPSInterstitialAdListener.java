package xyz.adscope.amps.ad.interstitial;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class AMPSInterstitialAdListener implements xyz.adscope.amps.base.AMPSBaseListener {
    public AMPSInterstitialAdListener() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void onInterstitialAdClicked();

    public abstract void onInterstitialAdClose();

    public abstract void onInterstitialAdLoadFail(xyz.adscope.amps.common.AMPSError r1);

    public abstract void onInterstitialAdLoaded();

    public abstract void onInterstitialAdShow();

    public abstract void onInterstitialAdVideoEnd();

    public abstract void onInterstitialAdVideoError(xyz.adscope.amps.common.AMPSError r1);

    public abstract void onInterstitialAdVideoStart();
}
