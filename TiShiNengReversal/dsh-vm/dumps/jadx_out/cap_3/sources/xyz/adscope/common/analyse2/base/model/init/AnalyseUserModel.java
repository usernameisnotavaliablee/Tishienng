package xyz.adscope.common.analyse2.base.model.init;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AnalyseUserModel extends xyz.adscope.common.analyse2.base.model.AnalyseBasicReceiveLog {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(exclude = true, key = "oaid")
    private java.lang.String oaid;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(exclude = true, key = "said")
    private java.lang.String said;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "user_custom_data")
    private java.lang.String userCustomData;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "user_id")
    private java.lang.String userId;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "lmt")
    private java.lang.String userLmt;

    public AnalyseUserModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.oaid
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.said
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.userCustomData
            return r0
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.userId
            return r0
    }

    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.userLmt
            return r0
    }
}
