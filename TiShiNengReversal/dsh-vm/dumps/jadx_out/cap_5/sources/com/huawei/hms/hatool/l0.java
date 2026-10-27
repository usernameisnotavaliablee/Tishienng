package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class l0 extends com.huawei.hms.hatool.f1 {
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    protected java.lang.String f;
    private java.lang.String g;

    public l0() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.b = r0
            r1.c = r0
            r1.d = r0
            r1.e = r0
            r1.f = r0
            return
    }

    @Override // com.huawei.hms.hatool.u0
    public org.json.JSONObject a() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r3.a
            java.lang.String r2 = "androidid"
            r0.put(r2, r1)
            java.lang.String r1 = r3.g
            java.lang.String r2 = "oaid"
            r0.put(r2, r1)
            java.lang.String r1 = r3.f
            java.lang.String r2 = "uuid"
            r0.put(r2, r1)
            java.lang.String r1 = r3.e
            java.lang.String r2 = "upid"
            r0.put(r2, r1)
            java.lang.String r1 = r3.b
            java.lang.String r2 = "imei"
            r0.put(r2, r1)
            java.lang.String r1 = r3.c
            java.lang.String r2 = "sn"
            r0.put(r2, r1)
            java.lang.String r1 = r3.d
            java.lang.String r2 = "udid"
            r0.put(r2, r1)
            return r0
    }

    public void b(java.lang.String r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void c(java.lang.String r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void d(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void e(java.lang.String r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void f(java.lang.String r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void g(java.lang.String r1) {
            r0 = this;
            r0.f = r1
            return
    }
}
