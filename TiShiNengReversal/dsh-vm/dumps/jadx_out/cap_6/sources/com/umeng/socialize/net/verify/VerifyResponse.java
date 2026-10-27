package com.umeng.socialize.net.verify;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class VerifyResponse extends com.umeng.socialize.net.base.SocializeReseponse {
    private int a;
    private boolean b;

    public VerifyResponse(java.lang.Integer r2, org.json.JSONObject r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            int r2 = r2.intValue()
            r1.a = r2
            r2 = 0
            r1.b = r2
            r1.parseJsonObject(r3)
            return
    }

    @Override // com.umeng.socialize.net.base.SocializeReseponse
    public boolean isHttpOK() {
            r2 = this;
            int r0 = r2.a
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.umeng.socialize.net.base.SocializeReseponse
    public boolean isOk() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    public void parseJsonObject(org.json.JSONObject r2) {
            r1 = this;
            java.lang.String r0 = "result"
            java.lang.String r2 = r2.getString(r0)     // Catch: org.json.JSONException -> L12
            java.lang.String r0 = "success"
            boolean r2 = r2.startsWith(r0)     // Catch: org.json.JSONException -> L12
            if (r2 == 0) goto L14
            r2 = 1
            r1.b = r2     // Catch: org.json.JSONException -> L12
            return
        L12:
            r2 = move-exception
            goto L18
        L14:
            r2 = 0
            r1.b = r2     // Catch: org.json.JSONException -> L12
            return
        L18:
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.NET.PARSEERROR
            com.umeng.socialize.utils.SLog.error(r0, r2)
            return
    }
}
