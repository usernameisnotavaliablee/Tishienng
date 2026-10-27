package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class o1 extends com.huawei.hms.hatool.e1 {
    java.lang.String f;
    java.lang.String g;
    private java.lang.String h;

    public o1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.huawei.hms.hatool.u0
    public org.json.JSONObject a() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r3.h
            java.lang.String r2 = "_rom_ver"
            r0.put(r2, r1)
            java.lang.String r1 = r3.a
            java.lang.String r2 = "_emui_ver"
            r0.put(r2, r1)
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r2 = "_model"
            r0.put(r2, r1)
            java.lang.String r1 = r3.f
            java.lang.String r2 = "_mcc"
            r0.put(r2, r1)
            java.lang.String r1 = r3.g
            java.lang.String r2 = "_mnc"
            r0.put(r2, r1)
            java.lang.String r1 = r3.b
            java.lang.String r2 = "_package_name"
            r0.put(r2, r1)
            java.lang.String r1 = r3.c
            java.lang.String r2 = "_app_ver"
            r0.put(r2, r1)
            java.lang.String r1 = "_lib_ver"
            java.lang.String r2 = "2.2.0.314"
            r0.put(r1, r2)
            java.lang.String r1 = r3.d
            java.lang.String r2 = "_channel"
            r0.put(r2, r1)
            java.lang.String r1 = "_lib_name"
            java.lang.String r2 = "hianalytics"
            r0.put(r1, r2)
            java.lang.String r1 = r3.e
            java.lang.String r2 = "_oaid_tracking_flag"
            r0.put(r2, r1)
            return r0
    }

    public void f(java.lang.String r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void g(java.lang.String r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void h(java.lang.String r1) {
            r0 = this;
            r0.h = r1
            return
    }
}
