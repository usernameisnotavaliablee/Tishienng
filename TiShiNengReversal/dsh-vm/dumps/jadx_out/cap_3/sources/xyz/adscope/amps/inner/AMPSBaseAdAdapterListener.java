package xyz.adscope.amps.inner;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface AMPSBaseAdAdapterListener<T> {
    void onAdClicked(xyz.adscope.amps.base.AMPSBaseAdapter r1);

    void onAdDismiss(xyz.adscope.amps.base.AMPSBaseAdapter r1);

    void onAdFailed(xyz.adscope.amps.base.AMPSBaseAdapter r1, xyz.adscope.amps.common.AMPSError r2);

    void onAdLoaded(xyz.adscope.amps.base.AMPSBaseAdapter r1);

    void onAdShow(xyz.adscope.amps.base.AMPSBaseAdapter r1);

    void onAdShowFailed(xyz.adscope.amps.base.AMPSBaseAdapter r1, xyz.adscope.amps.common.AMPSError r2);
}
