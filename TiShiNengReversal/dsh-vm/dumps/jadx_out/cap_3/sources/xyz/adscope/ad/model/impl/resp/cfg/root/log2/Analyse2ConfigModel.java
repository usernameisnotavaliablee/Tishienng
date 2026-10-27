package xyz.adscope.ad.model.impl.resp.cfg.root.log2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class Analyse2ConfigModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel {
    private final java.lang.String a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "version")
    private java.lang.String b;

    public Analyse2ConfigModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = xyz.adscope.ad.f0.e()
            r0.a = r1
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }
}
