package xyz.adscope.common.network.connect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class RealTimeNetwork implements xyz.adscope.common.network.connect.Network {
    private final android.content.Context a;
    private final xyz.adscope.common.network.connect.NetworkChecker b;

    public RealTimeNetwork(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.a = r2
            xyz.adscope.common.network.connect.NetworkChecker r0 = new xyz.adscope.common.network.connect.NetworkChecker
            r0.<init>(r2)
            r1.b = r0
            return
    }

    @Override // xyz.adscope.common.network.connect.Network
    public boolean isAvailable() {
            r1 = this;
            xyz.adscope.common.network.connect.NetworkChecker r0 = r1.b
            boolean r0 = r0.isAvailable()
            return r0
    }
}
