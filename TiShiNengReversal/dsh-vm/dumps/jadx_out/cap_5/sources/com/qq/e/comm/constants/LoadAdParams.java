package com.qq.e.comm.constants;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class LoadAdParams {
    private com.qq.e.comm.constants.LoginType a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.util.Map<java.lang.String, java.lang.String> e;
    private org.json.JSONObject f;
    private final org.json.JSONObject g;

    public LoadAdParams() {
            r1 = this;
            r1.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1.g = r0
            return
    }

    public java.util.Map getDevExtra() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.e
            return r0
    }

    public java.lang.String getDevExtraJsonString() {
            r3 = this;
            java.lang.String r0 = ""
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.e     // Catch: java.lang.Exception -> L17
            if (r1 == 0) goto L17
            int r1 = r1.size()     // Catch: java.lang.Exception -> L17
            if (r1 <= 0) goto L17
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L17
            java.util.Map<java.lang.String, java.lang.String> r2 = r3.e     // Catch: java.lang.Exception -> L17
            r1.<init>(r2)     // Catch: java.lang.Exception -> L17
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L17
        L17:
            return r0
    }

    public org.json.JSONObject getExtraInfo() {
            r1 = this;
            org.json.JSONObject r0 = r1.f
            return r0
    }

    public java.lang.String getLoginAppId() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public java.lang.String getLoginOpenid() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public com.qq.e.comm.constants.LoginType getLoginType() {
            r1 = this;
            com.qq.e.comm.constants.LoginType r0 = r1.a
            return r0
    }

    public org.json.JSONObject getParams() {
            r1 = this;
            org.json.JSONObject r0 = r1.g
            return r0
    }

    public java.lang.String getUin() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    public void setDevExtra(java.util.Map<java.lang.String, java.lang.String> r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void setExtraInfo(org.json.JSONObject r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void setLoginAppId(java.lang.String r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void setLoginOpenid(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void setLoginType(com.qq.e.comm.constants.LoginType r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setUin(java.lang.String r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LoadAdParams{, loginType="
            r0.append(r1)
            com.qq.e.comm.constants.LoginType r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", loginAppId="
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", loginOpenid="
            r0.append(r1)
            java.lang.String r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", uin="
            r0.append(r1)
            java.lang.String r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", passThroughInfo="
            r0.append(r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", extraInfo="
            r0.append(r1)
            org.json.JSONObject r1 = r2.f
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
