package com.umeng.socialize.net.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SocializeReseponse extends com.umeng.socialize.net.utils.UResponse {
    protected static final java.lang.String TAG = "SocializeReseponse";
    private int mHttpCode;
    protected org.json.JSONObject mJsonData;
    public java.lang.String mMsg;
    public int mStCode;

    public SocializeReseponse(java.lang.Integer r1, org.json.JSONObject r2) {
            r0 = this;
            r0.<init>(r2)
            if (r1 != 0) goto L7
            r1 = -1
            goto Lb
        L7:
            int r1 = r1.intValue()
        Lb:
            r0.mHttpCode = r1
            return
    }

    public SocializeReseponse(org.json.JSONObject r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = -103(0xffffffffffffff99, float:NaN)
            r1.mStCode = r0
            org.json.JSONObject r2 = r1.parseStatus(r2)
            r1.mJsonData = r2
            r1.parseJsonObject()
            return
    }

    private void parseErrorMsg(java.lang.String r4) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L32
            r0.<init>(r4)     // Catch: java.lang.Exception -> L32
            java.util.Iterator r4 = r0.keys()     // Catch: java.lang.Exception -> L32
        L9:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Exception -> L32
            if (r1 == 0) goto L34
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L32
            org.json.JSONObject r1 = r0.getJSONObject(r1)     // Catch: java.lang.Exception -> L32
            java.lang.String r2 = "msg"
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Exception -> L32
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L32
            if (r2 != 0) goto L26
            goto L9
        L26:
            java.lang.String r2 = "data"
            org.json.JSONObject r1 = r1.getJSONObject(r2)     // Catch: java.lang.Exception -> L32
            java.lang.String r2 = "platform_error"
            r1.getString(r2)     // Catch: java.lang.Exception -> L32
            goto L9
        L32:
            r4 = move-exception
            goto L35
        L34:
            return
        L35:
            com.umeng.socialize.utils.SLog.error(r4)
            return
    }

    public org.json.JSONObject getJsonData() {
            r1 = this;
            org.json.JSONObject r0 = r1.mJsonData
            return r0
    }

    public boolean isHttpOK() {
            r2 = this;
            int r0 = r2.mHttpCode
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean isOk() {
            r2 = this;
            int r0 = r2.mStCode
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public void parseJsonObject() {
            r0 = this;
            return
    }

    public org.json.JSONObject parseStatus(org.json.JSONObject r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "st"
            r2 = 1998(0x7ce, float:2.8E-42)
            int r1 = r4.optInt(r1, r2)     // Catch: org.json.JSONException -> L32
            r3.mStCode = r1     // Catch: org.json.JSONException -> L32
            if (r1 != 0) goto L11
            return r0
        L11:
            java.lang.String r1 = "msg"
            java.lang.String r2 = ""
            java.lang.String r1 = r4.optString(r1, r2)     // Catch: org.json.JSONException -> L32
            r3.mMsg = r1     // Catch: org.json.JSONException -> L32
            java.lang.String r1 = "data"
            java.lang.String r4 = r4.optString(r1, r0)     // Catch: org.json.JSONException -> L32
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: org.json.JSONException -> L32
            if (r1 == 0) goto L28
            return r0
        L28:
            int r1 = r3.mStCode     // Catch: org.json.JSONException -> L32
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == r2) goto L34
            r3.parseErrorMsg(r4)     // Catch: org.json.JSONException -> L32
            goto L34
        L32:
            r4 = move-exception
            goto L3a
        L34:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L32
            r1.<init>(r4)     // Catch: org.json.JSONException -> L32
            return r1
        L3a:
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.NET.PARSEERROR
            com.umeng.socialize.utils.SLog.error(r1, r4)
            return r0
    }
}
