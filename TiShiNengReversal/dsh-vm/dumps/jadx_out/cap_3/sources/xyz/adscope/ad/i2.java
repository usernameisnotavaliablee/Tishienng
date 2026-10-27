package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class i2 implements xyz.adscope.common.v2.model.IJsonMappingModel {
    private org.json.JSONObject a;

    public i2() {
            r0 = this;
            r0.<init>()
            return
    }

    public i2(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.a(r1)
            return
    }

    private java.lang.String a() {
            r1 = this;
            org.json.JSONObject r0 = xyz.adscope.common.v2.tool.json.JsonUtil.parseEntry2Json(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    protected void a(org.json.JSONObject r1) {
            r0 = this;
            xyz.adscope.common.v2.tool.json.JsonUtil.parseJson2Entry(r0, r1)     // Catch: org.json.JSONException -> L3
        L3:
            return
    }

    @Override // xyz.adscope.common.v2.model.IJsonMappingModel
    public java.lang.String toJsonString() {
            r1 = this;
            org.json.JSONObject r0 = r1.a
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.toString()
            return r0
        L9:
            java.lang.String r0 = r1.a()
            return r0
    }
}
