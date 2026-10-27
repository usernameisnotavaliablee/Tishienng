package xyz.adscope.amps.ad.splash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface AMPSSplashLoadEventListener extends xyz.adscope.amps.manager.inter.AMPSLoadEventListener {
    void onAmpsAdClicked();

    void onAmpsAdDismiss();

    void onAmpsAdFailed(xyz.adscope.amps.common.AMPSError r1);

    void onAmpsAdLoaded();

    void onAmpsAdShow();
}
