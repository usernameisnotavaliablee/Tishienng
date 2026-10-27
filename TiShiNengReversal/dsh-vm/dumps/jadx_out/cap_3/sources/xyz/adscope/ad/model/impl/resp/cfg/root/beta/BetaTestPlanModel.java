package xyz.adscope.ad.model.impl.resp.cfg.root.beta;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BetaTestPlanModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel implements xyz.adscope.common.v2.beta.IBetaTestConfig {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "random")
    private java.lang.String a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "startTime")
    private java.lang.String b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "endTime")
    private java.lang.String c;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "duration")
    private java.lang.String d;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "planId")
    private java.lang.String e;

    public BetaTestPlanModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // xyz.adscope.common.v2.beta.IBetaTestConfig
    public java.lang.String getBetaTestPlanID() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    @Override // xyz.adscope.common.v2.beta.IBetaTestConfig
    public long getDurationMillisecond() {
            r2 = this;
            java.lang.String r0 = r2.d
            long r0 = xyz.adscope.common.v2.tool.str.StringUtil.parseLong(r0)
            return r0
    }

    @Override // xyz.adscope.common.v2.beta.IBetaTestConfig
    public long getEndTimestamp() {
            r2 = this;
            java.lang.String r0 = r2.c
            long r0 = xyz.adscope.common.v2.tool.str.StringUtil.parseLong(r0)
            return r0
    }

    @Override // xyz.adscope.common.v2.beta.IBetaTestConfig
    public int getRandomProbability() {
            r1 = this;
            java.lang.String r0 = r1.a
            int r0 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r0)
            return r0
    }

    @Override // xyz.adscope.common.v2.beta.IBetaTestConfig
    public java.lang.String getSDKBizID() {
            r1 = this;
            java.lang.String r0 = xyz.adscope.ad.f0.e()
            return r0
    }

    @Override // xyz.adscope.common.v2.beta.IBetaTestConfig
    public long getStartTimestamp() {
            r2 = this;
            java.lang.String r0 = r2.b
            long r0 = xyz.adscope.common.v2.tool.str.StringUtil.parseLong(r0)
            return r0
    }
}
