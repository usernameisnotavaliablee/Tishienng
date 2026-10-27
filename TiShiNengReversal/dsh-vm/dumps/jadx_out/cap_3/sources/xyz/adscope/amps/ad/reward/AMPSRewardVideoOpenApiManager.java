package xyz.adscope.amps.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSRewardVideoOpenApiManager extends xyz.adscope.amps.manager.AMPSBaseOpenApiManager implements xyz.adscope.amps.ad.reward.adapter.AMPSRewardVideoAdAdapterListener {
    private xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener ampsRewardVideoLoadEventListener;

    public AMPSRewardVideoOpenApiManager(android.content.Context r1, xyz.adscope.amps.config.AMPSRequestParameters r2, xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.ampsRewardVideoLoadEventListener = r3
            return
    }

    @Override // xyz.adscope.amps.ad.reward.adapter.AMPSRewardVideoAdInteractionListener
    public void onRewardArrived(boolean r2, int r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
            r1 = this;
            xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r0 = r1.ampsRewardVideoLoadEventListener
            if (r0 == 0) goto L7
            r0.onAmpsAdRewardArrived(r2, r3, r4)
        L7:
            return
    }

    @Override // xyz.adscope.amps.ad.reward.adapter.AMPSRewardVideoAdAdapterListener
    public void onRewardVideoCached(xyz.adscope.amps.base.AMPSBaseAdapter r1) {
            r0 = this;
            return
    }

    @Override // xyz.adscope.amps.ad.reward.adapter.AMPSRewardVideoAdInteractionListener
    public void onVideoComplete() {
            r1 = this;
            xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r0 = r1.ampsRewardVideoLoadEventListener
            if (r0 == 0) goto L7
            r0.onAmpsAdVideoComplete()
        L7:
            return
    }

    @Override // xyz.adscope.amps.ad.reward.adapter.AMPSRewardVideoAdInteractionListener
    public void onVideoError() {
            r1 = this;
            xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r0 = r1.ampsRewardVideoLoadEventListener
            if (r0 == 0) goto L7
            r0.onAmpsAdVideoError()
        L7:
            return
    }

    public void refreshLoadEventListener(xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r1) {
            r0 = this;
            r0.ampsRewardVideoLoadEventListener = r1
            r0.refreshListener(r1)
            return
    }
}
