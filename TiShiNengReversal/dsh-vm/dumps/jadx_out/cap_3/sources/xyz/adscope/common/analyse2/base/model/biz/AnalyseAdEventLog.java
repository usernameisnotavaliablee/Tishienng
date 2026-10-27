package xyz.adscope.common.analyse2.base.model.biz;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AnalyseAdEventLog extends xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(exclude = true, key = "amps")
    private xyz.adscope.common.analyse2.base.model.biz.AnalyseAdCommon amps;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(exclude = true, key = "asnp")
    private xyz.adscope.common.analyse2.base.model.biz.AnalyseAdCommon asnp;

    public AnalyseAdEventLog(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public xyz.adscope.common.analyse2.base.model.biz.AnalyseAdCommon c() {
            r1 = this;
            xyz.adscope.common.analyse2.base.model.biz.AnalyseAdCommon r0 = r1.amps
            if (r0 == 0) goto L5
            return r0
        L5:
            xyz.adscope.common.analyse2.base.model.biz.AnalyseAdCommon r0 = r1.asnp
            if (r0 == 0) goto La
            return r0
        La:
            r0 = 0
            return r0
    }
}
