package xyz.adscope.ad.model.impl.resp.cfg.root.statistics.event;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ConfigEventModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel implements xyz.adscope.common.analyse.publish.IEventConfigModel {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "codes")
    private java.util.List<java.lang.String> a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "uploadUrl")
    private java.lang.String b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "macros")
    private java.lang.String c;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "count")
    private int d;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "time")
    private java.lang.String e;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "acceptEncrypt")
    private java.lang.String f;

    public ConfigEventModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // xyz.adscope.common.analyse.publish.IEventConfigModel
    public java.lang.String getAcceptEncrypt() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    @Override // xyz.adscope.common.analyse.publish.IEventConfigModel
    public java.util.List<java.lang.String> getCodes() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.a
            return r0
    }

    @Override // xyz.adscope.common.analyse.publish.IEventConfigModel
    public int getCount() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    @Override // xyz.adscope.common.analyse.publish.IEventConfigModel
    public java.lang.String getMacros() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    @Override // xyz.adscope.common.analyse.publish.IEventConfigModel
    public java.lang.String getTime() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    @Override // xyz.adscope.common.analyse.publish.IEventConfigModel
    public java.lang.String getUploadURL() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }
}
