package xyz.adscope.common.analyse2.base.model.biz;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AnalyseAdCommon extends xyz.adscope.common.analyse2.base.model.AnalyseBasicReceiveLog {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "ad_type")
    private java.lang.String mAdType;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "currency")
    private java.lang.String mCurrency;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "custom_data")
    private java.lang.String mCustomData;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "hex_id")
    private java.lang.String mHex;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "quantity")
    private java.lang.String mQuantity;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "session_id")
    private java.lang.String mSessionID;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "space_id")
    private java.lang.String mSpaceID;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "time_out")
    private java.lang.String mTimeout;

    public AnalyseAdCommon(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // xyz.adscope.common.analyse2.base.model.AnalyseBasicReceiveLog
    public org.json.JSONObject a() {
            r2 = this;
            java.lang.String r0 = r2.mHex
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.mSessionID
            int r1 = xyz.adscope.common.v2.tool.str.SerialUtil.generateCRCHex(r1)
            r0.append(r1)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.mHex = r0
        L21:
            java.lang.String r0 = r2.mCurrency
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3e
            java.lang.String r0 = r2.mCurrency
            org.json.JSONArray r0 = xyz.adscope.common.v2.tool.json.JsonUtil.parseJSONArray(r0)
            if (r0 == 0) goto L3e
            int r1 = r0.length()
            if (r1 <= 0) goto L3e
            r1 = 0
            java.lang.String r0 = xyz.adscope.common.v2.tool.json.JsonUtil.getStringFromArray(r0, r1)
            r2.mCurrency = r0
        L3e:
            org.json.JSONObject r0 = super.a()
            return r0
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.mSessionID
            return r0
    }
}
