package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class j {
    private final xyz.adscope.common.v2.dev.IDeviceInterface a;
    private java.util.List<xyz.adscope.ad.c1> b;

    j(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            xyz.adscope.common.v2.dev.DeviceObtainManager r0 = xyz.adscope.common.v2.dev.DeviceObtainManager.getInstance()
            java.lang.Object r2 = r0.getOrCreateImplement(r2)
            xyz.adscope.common.v2.dev.IDeviceInterface r2 = (xyz.adscope.common.v2.dev.IDeviceInterface) r2
            r1.a = r2
            return
    }

    public java.util.List<xyz.adscope.ad.c1> a() {
            r1 = this;
            java.util.List<xyz.adscope.ad.c1> r0 = r1.b
            return r0
    }

    public void a(java.util.List<xyz.adscope.ad.c1> r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public xyz.adscope.common.v2.dev.IDeviceInterface b() {
            r1 = this;
            xyz.adscope.common.v2.dev.IDeviceInterface r0 = r1.a
            return r0
    }
}
