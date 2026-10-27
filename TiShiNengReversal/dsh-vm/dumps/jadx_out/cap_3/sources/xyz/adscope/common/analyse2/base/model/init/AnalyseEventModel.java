package xyz.adscope.common.analyse2.base.model.init;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AnalyseEventModel extends xyz.adscope.common.analyse2.base.model.AnalyseBasicReceiveLog {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "count")
    private int count;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "level")
    private java.util.List<java.lang.String> exclude;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "codes")
    private java.util.List<java.lang.String> handleCodes;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "sample")
    private int sample;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "time")
    private java.lang.String time;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "uploadUrl")
    private java.lang.String uploadUrl;

    public AnalyseEventModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public int b() {
            r1 = this;
            int r0 = r1.count
            return r0
    }

    public java.util.List<java.lang.String> c() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.exclude
            return r0
    }

    public java.util.List<java.lang.String> d() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.handleCodes
            return r0
    }

    public int e() {
            r1 = this;
            int r0 = r1.sample
            return r0
    }

    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.time
            return r0
    }

    public java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.uploadUrl
            return r0
    }
}
