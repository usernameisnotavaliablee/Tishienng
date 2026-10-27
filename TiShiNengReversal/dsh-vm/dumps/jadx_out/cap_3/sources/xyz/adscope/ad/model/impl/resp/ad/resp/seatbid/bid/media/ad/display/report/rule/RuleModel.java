package xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.rule;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class RuleModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "type")
    private int a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "repDelay")
    private java.lang.String b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "repRandomDelay")
    private int c;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "calExposureTime")
    private int d;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "calRandomNum")
    private int e;

    public RuleModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public int b() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public int d() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public int e() {
            r1 = this;
            int r0 = r1.a
            return r0
    }
}
