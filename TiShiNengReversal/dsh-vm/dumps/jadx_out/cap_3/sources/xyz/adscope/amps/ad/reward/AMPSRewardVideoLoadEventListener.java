package xyz.adscope.amps.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface AMPSRewardVideoLoadEventListener extends xyz.adscope.amps.manager.inter.AMPSLoadEventListener {
    void onAmpsAdCached();

    void onAmpsAdDismiss();

    void onAmpsAdFailed(xyz.adscope.amps.common.AMPSError r1);

    void onAmpsAdLoad();

    void onAmpsAdRewardArrived(boolean r1, int r2, java.util.Map<java.lang.String, java.lang.Object> r3);

    void onAmpsAdShow();

    void onAmpsAdVideoClick();

    void onAmpsAdVideoComplete();

    void onAmpsAdVideoError();
}
