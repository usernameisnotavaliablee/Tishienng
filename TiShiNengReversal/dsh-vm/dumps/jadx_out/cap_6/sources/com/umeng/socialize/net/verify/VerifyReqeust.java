package com.umeng.socialize.net.verify;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class VerifyReqeust extends com.umeng.socialize.net.utils.URequest {
    public VerifyReqeust(android.content.Context r1, java.lang.String r2, java.lang.Class<? extends com.umeng.socialize.net.base.SocializeReseponse> r3, com.umeng.socialize.net.utils.URequest.RequestMethod r4) {
            r0 = this;
            r0.<init>(r2)
            r0.mContext = r1
            r0.mMethod = r4
            com.umeng.socialize.net.utils.URequest$MIME r1 = com.umeng.socialize.net.utils.URequest.MIME.JSON
            r0.mMimeType = r1
            r0.mResponseClz = r3
            return
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public java.util.Map<java.lang.String, java.lang.Object> buildParams() {
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public java.util.Map<java.lang.String, java.lang.Object> getBodyPair() {
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            android.content.Context r2 = r5.mContext
            java.lang.String r3 = "umeng_verify"
            r4 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r4)
            java.lang.String r3 = "verify_log"
            r4 = 0
            java.util.Set r2 = r2.getStringSet(r3, r4)
            if (r2 == 0) goto L3f
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L3f
            java.util.Iterator r2 = r2.iterator()
        L26:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            byte[] r3 = r3.getBytes()
            r4 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r4)
            r1.put(r3)
            goto L26
        L3f:
            java.lang.String r2 = "content"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L52
            long r1 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L52
            java.lang.String r3 = "ts"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: org.json.JSONException -> L52
            r0.put(r3, r1)     // Catch: org.json.JSONException -> L52
            goto L58
        L52:
            r1 = move-exception
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.NET.PARSEERROR
            com.umeng.socialize.utils.SLog.error(r2, r1)
        L58:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "data"
            java.lang.String r0 = r0.toString()
            r1.put(r2, r0)
            return r1
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public void onPrepareRequest() {
            r0 = this;
            super.onPrepareRequest()
            return
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public java.lang.String toGetUrl() {
            r2 = this;
            java.util.Map r0 = r2.buildParams()
            java.lang.String r1 = r2.getBaseUrl()
            java.lang.String r0 = r2.generateGetURL(r1, r0)
            return r0
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public org.json.JSONObject toJson() {
            r1 = this;
            r0 = 0
            return r0
    }
}
