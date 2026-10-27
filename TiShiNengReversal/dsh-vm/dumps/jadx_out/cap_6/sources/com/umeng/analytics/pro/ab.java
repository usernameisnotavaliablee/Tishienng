package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ab extends com.umeng.analytics.pro.z {
    private java.lang.String a;
    private java.lang.String b;

    public ab(java.lang.String r1, java.util.ArrayList<com.umeng.analytics.pro.aa> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r1 = ""
            r0.a = r1
            r0.b = r1
            return
    }

    @Override // com.umeng.analytics.pro.z, com.umeng.analytics.pro.ag
    public org.json.JSONObject a(java.lang.String r2, org.json.JSONObject r3) {
            r1 = this;
            org.json.JSONObject r2 = super.a(r2, r3)
            if (r2 == 0) goto L14
            java.lang.String r3 = "batch"
            java.lang.String r0 = r1.a     // Catch: java.lang.Throwable -> L14
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = "action"
            java.lang.String r0 = r1.b     // Catch: java.lang.Throwable -> L14
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L14
        L14:
            return r2
    }

    public void c(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public void d(java.lang.String r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }
}
