package xyz.adscope.common.json;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class JSONParse implements xyz.adscope.common.json.inter.IJSONParse {
    public JSONParse() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xyz.adscope.common.json.inter.IJSONParse
    public <T> T fromJson(java.lang.String r2, java.lang.Class<T> r3) {
            r1 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> La
            r0.<init>(r2)     // Catch: java.lang.Exception -> La
            java.lang.Object r2 = xyz.adscope.common.json.util.JsonUtil.fromJson(r0, r3)     // Catch: java.lang.Exception -> La
            return r2
        La:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "e : "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r3, r2)
            r2 = 0
            return r2
    }

    @Override // xyz.adscope.common.json.inter.IJSONParse
    public <T> T fromJsonAnnotation(java.lang.String r2, java.lang.Class<T> r3) {
            r1 = this;
            java.lang.Object r2 = xyz.adscope.common.json.util.JsonResolver.fromJson(r2, r3)     // Catch: java.lang.Exception -> L5
            return r2
        L5:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "e : "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r3, r2)
            r2 = 0
            return r2
    }

    @Override // xyz.adscope.common.json.inter.IJSONParse
    public java.lang.String toJson(java.lang.Object r3) {
            r2 = this;
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L5
            return r3
        L5:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r0, r3)
            r3 = 0
            return r3
    }
}
