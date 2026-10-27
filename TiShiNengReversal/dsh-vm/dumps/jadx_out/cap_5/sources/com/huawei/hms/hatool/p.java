package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class p extends com.huawei.hms.hatool.h0 {
    private java.lang.String g;

    public p() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.g = r0
            return
    }

    @Override // com.huawei.hms.hatool.u0
    public org.json.JSONObject a() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "protocol_version"
            java.lang.String r2 = "3"
            r0.put(r1, r2)
            java.lang.String r1 = "compress_mode"
            java.lang.String r2 = "1"
            r0.put(r1, r2)
            java.lang.String r1 = r3.d
            java.lang.String r2 = "serviceid"
            r0.put(r2, r1)
            java.lang.String r1 = r3.a
            java.lang.String r2 = "appid"
            r0.put(r2, r1)
            java.lang.String r1 = r3.g
            java.lang.String r2 = "hmac"
            r0.put(r2, r1)
            java.lang.String r1 = r3.f
            java.lang.String r2 = "chifer"
            r0.put(r2, r1)
            java.lang.String r1 = r3.b
            java.lang.String r2 = "timestamp"
            r0.put(r2, r1)
            java.lang.String r1 = r3.c
            java.lang.String r2 = "servicetag"
            r0.put(r2, r1)
            java.lang.String r1 = r3.e
            java.lang.String r2 = "requestid"
            r0.put(r2, r1)
            return r0
    }

    public void g(java.lang.String r1) {
            r0 = this;
            r0.g = r1
            return
    }
}
