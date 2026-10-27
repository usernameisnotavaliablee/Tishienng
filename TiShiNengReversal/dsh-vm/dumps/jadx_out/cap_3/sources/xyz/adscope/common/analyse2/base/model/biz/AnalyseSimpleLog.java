package xyz.adscope.common.analyse2.base.model.biz;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AnalyseSimpleLog extends xyz.adscope.common.analyse2.base.model.AnalyseBasicReceiveLog {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "error_code")
    private java.lang.String error_code;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "error_info")
    private java.lang.String error_info;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "cost_time")
    private java.lang.String mCostTime;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "event_code")
    private java.lang.String mEventCode;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "event_id")
    private java.lang.String mEventID;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "event_time")
    private java.lang.String mEventTime;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "sample")
    private java.lang.String mSample;

    public AnalyseSimpleLog(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.mSample = r1
            return
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.mEventCode
            return r0
    }
}
