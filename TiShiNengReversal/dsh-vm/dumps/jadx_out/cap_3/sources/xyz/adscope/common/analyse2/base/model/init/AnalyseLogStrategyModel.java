package xyz.adscope.common.analyse2.base.model.init;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AnalyseLogStrategyModel extends xyz.adscope.common.analyse2.base.model.AnalyseBasicReceiveLog {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "acceptEncrypt")
    private java.lang.String acceptEncrypt;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "crash")
    private xyz.adscope.common.analyse2.base.model.init.AnalyseCrashModel crashModel;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "customData")
    private java.lang.String customData;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "customId")
    private java.lang.String customID;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "event")
    private java.util.List<xyz.adscope.common.analyse2.base.model.init.AnalyseEventModel> eventModels;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "version")
    private java.lang.String version;

    public AnalyseLogStrategyModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.acceptEncrypt
            return r0
    }

    public xyz.adscope.common.analyse2.base.model.init.AnalyseCrashModel c() {
            r1 = this;
            xyz.adscope.common.analyse2.base.model.init.AnalyseCrashModel r0 = r1.crashModel
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.customData
            return r0
    }

    public java.util.List<xyz.adscope.common.analyse2.base.model.init.AnalyseEventModel> e() {
            r1 = this;
            java.util.List<xyz.adscope.common.analyse2.base.model.init.AnalyseEventModel> r0 = r1.eventModels
            return r0
    }

    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.version
            return r0
    }
}
