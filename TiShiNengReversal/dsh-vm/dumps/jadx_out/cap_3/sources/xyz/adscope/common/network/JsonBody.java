package xyz.adscope.common.network;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class JsonBody extends xyz.adscope.common.network.StringBody {
    public JsonBody(java.lang.String r2) {
            r1 = this;
            xyz.adscope.common.network.KalleConfig r0 = xyz.adscope.common.network.Kalle.getConfig()
            java.nio.charset.Charset r0 = r0.getCharset()
            r1.<init>(r2, r0)
            return
    }

    public JsonBody(java.lang.String r2, java.nio.charset.Charset r3) {
            r1 = this;
            java.lang.String r0 = "application/json"
            r1.<init>(r2, r3, r0)
            return
    }
}
