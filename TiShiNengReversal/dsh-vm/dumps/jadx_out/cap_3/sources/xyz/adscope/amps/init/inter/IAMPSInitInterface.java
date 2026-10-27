package xyz.adscope.amps.init.inter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IAMPSInitInterface {
    xyz.adscope.amps.model.AMPSGlobalModel getGlobalModel();

    void init(android.content.Context r1, xyz.adscope.amps.init.AMPSInitConfig r2, xyz.adscope.amps.model.AMPSGlobalModel r3, xyz.adscope.amps.init.inter.IAMPSInitCallback r4);

    boolean isInitSuccess();
}
