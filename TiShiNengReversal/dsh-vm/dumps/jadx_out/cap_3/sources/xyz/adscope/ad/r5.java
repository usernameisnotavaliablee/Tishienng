package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class r5 {
    private org.json.JSONObject a;
    private final java.lang.String b;

    public r5(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            return
    }

    public java.lang.String a() {
            r2 = this;
            org.json.JSONObject r0 = r2.a
            if (r0 == 0) goto L13
            java.lang.String r1 = "ext"
            org.json.JSONObject r0 = xyz.adscope.common.v2.tool.json.JsonUtil.getJSONObject(r0, r1)
            if (r0 == 0) goto L13
            java.lang.String r1 = "spaceId"
            java.lang.String r0 = xyz.adscope.common.v2.tool.json.JsonUtil.getStringFromJson(r0, r1)
            return r0
        L13:
            java.lang.String r0 = ""
            return r0
    }

    public void a(android.content.Context r5) {
            r4 = this;
            java.lang.String r0 = r4.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L23
            xyz.adscope.common.v2.encrypt.LinkedEncryptManager r0 = xyz.adscope.common.v2.encrypt.LinkedEncryptManager.getInstance()
            java.lang.Object r5 = r0.getOrCreateImplement(r5)
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt r5 = (xyz.adscope.common.v2.encrypt.ILinkedEncrypt) r5
            java.lang.String r0 = r4.b
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r1 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.STEP_BY_STEP
            java.lang.String r2 = "101,1001"
            r3 = 1
            java.lang.String r5 = r5.decrypt(r0, r2, r1, r3)
            org.json.JSONObject r5 = xyz.adscope.common.v2.tool.json.JsonUtil.parseJSONObject(r5)
            r4.a = r5
        L23:
            return
    }

    public org.json.JSONObject b() {
            r1 = this;
            org.json.JSONObject r0 = r1.a
            return r0
    }

    public java.lang.String c() {
            r2 = this;
            org.json.JSONObject r0 = r2.a
            if (r0 == 0) goto Lb
            java.lang.String r1 = "id"
            java.lang.String r0 = xyz.adscope.common.v2.tool.json.JsonUtil.getStringFromJson(r0, r1)
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }
}
