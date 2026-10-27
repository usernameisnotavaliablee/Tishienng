package xyz.adscope.amps.ad.draw;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class AMPSDrawLoadEventListener implements xyz.adscope.amps.manager.inter.AMPSLoadEventListener {
    public AMPSDrawLoadEventListener() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void onAmpsAdFailed(xyz.adscope.amps.common.AMPSError r1);

    public abstract void onAmpsAdLoad(java.util.List<xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo> r1);
}
