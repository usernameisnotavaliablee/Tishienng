package xyz.adscope.common.v2.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class IBaseFromJsonModel implements xyz.adscope.common.v2.model.IJsonMappingModel {
    private boolean hasParseException;
    protected org.json.JSONObject mJsonObject;

    public IBaseFromJsonModel(org.json.JSONObject r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.hasParseException = r0
            r1.mJsonObject = r2
            r1.parseFormJson(r2)
            return
    }

    public org.json.JSONObject asJsonObject() {
            r1 = this;
            org.json.JSONObject r0 = r1.mJsonObject
            return r0
    }

    public boolean hasParseException() {
            r1 = this;
            boolean r0 = r1.hasParseException
            return r0
    }

    protected void parseFormJson(org.json.JSONObject r2) {
            r1 = this;
            r0 = 1
            if (r2 == 0) goto L7
            xyz.adscope.common.v2.tool.json.JsonUtil.parseJson2Entry(r1, r2)     // Catch: org.json.JSONException -> La
            return
        L7:
            r1.hasParseException = r0     // Catch: org.json.JSONException -> La
            return
        La:
            r1.hasParseException = r0
            return
    }

    @Override // xyz.adscope.common.v2.model.IJsonMappingModel
    public java.lang.String toJsonString() {
            r1 = this;
            org.json.JSONObject r0 = r1.mJsonObject
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.toString()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }
}
