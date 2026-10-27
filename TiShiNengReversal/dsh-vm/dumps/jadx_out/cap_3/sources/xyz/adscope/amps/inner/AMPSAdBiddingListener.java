package xyz.adscope.amps.inner;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface AMPSAdBiddingListener {
    void onC2SBiddingFail(xyz.adscope.amps.base.AMPSBaseAdapter r1, xyz.adscope.amps.base.AMPSBaseBiddingResult r2);

    void onC2SBiddingSuccess(xyz.adscope.amps.base.AMPSBaseAdapter r1, xyz.adscope.amps.base.AMPSBaseBiddingResult r2);

    void onS2SBiddingFail(xyz.adscope.amps.base.AMPSBaseAdapter r1, xyz.adscope.amps.base.AMPSBaseBiddingResult r2);

    void onS2SBiddingSuccess(xyz.adscope.amps.base.AMPSBaseAdapter r1, xyz.adscope.amps.base.AMPSBaseBiddingResult r2);
}
