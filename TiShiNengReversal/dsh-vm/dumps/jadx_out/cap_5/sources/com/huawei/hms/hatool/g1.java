package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class g1 {
    public g1() {
            r1 = this;
            r1.<init>()
            return
    }

    protected static com.huawei.hms.hatool.p a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            com.huawei.hms.hatool.p r0 = new com.huawei.hms.hatool.p
            r0.<init>()
            r0.a(r1)
            java.lang.String r1 = com.huawei.hms.hatool.y0.k()
            r0.b(r1)
            r0.e(r2)
            r0.c(r4)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            java.lang.String r2 = "hmshi"
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = "qrt"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.d(r1)
            return r0
    }

    protected static com.huawei.hms.hatool.l0 b(java.lang.String r2, java.lang.String r3) {
            com.huawei.hms.hatool.l0 r0 = new com.huawei.hms.hatool.l0
            r0.<init>()
            com.huawei.hms.hatool.c0 r1 = com.huawei.hms.hatool.c0.a()
            java.lang.String r2 = r1.b(r2, r3)
            r0.a(r2)
            return r0
    }

    protected static com.huawei.hms.hatool.o1 c(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            com.huawei.hms.hatool.o1 r0 = new com.huawei.hms.hatool.o1
            r0.<init>()
            java.lang.String r1 = com.huawei.hms.hatool.y0.r()
            r0.c(r1)
            java.lang.String r1 = com.huawei.hms.hatool.y0.t()
            r0.e(r1)
            r0.a(r4)
            com.huawei.hms.hatool.c0 r4 = com.huawei.hms.hatool.c0.a()
            java.lang.String r2 = r4.e(r3, r2)
            r0.b(r2)
            return r0
    }

    protected static com.huawei.hms.hatool.x d(java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "generate UploadData EventModelHandlerBase"
            java.lang.String r1 = "hmsSdk"
            com.huawei.hms.hatool.j1.h(r1, r0)
            com.huawei.hms.hatool.n0 r0 = com.huawei.hms.hatool.n0.f()
            r0.c(r2, r3)
            com.huawei.hms.hatool.n0 r2 = com.huawei.hms.hatool.n0.f()
            java.lang.String r2 = r2.b()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L23
            java.lang.String r2 = "event chifer is empty"
            com.huawei.hms.hatool.j1.m(r1, r2)
            r2 = 0
            return r2
        L23:
            com.huawei.hms.hatool.x r2 = new com.huawei.hms.hatool.x
            com.huawei.hms.hatool.n0 r3 = com.huawei.hms.hatool.n0.f()
            java.lang.String r3 = r3.e()
            r2.<init>(r3)
            return r2
    }

    protected static java.util.Map<java.lang.String, java.lang.String> e(java.lang.String r3, java.lang.String r4) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = com.huawei.hms.hatool.y0.k()
            java.lang.String r2 = "App-Id"
            r0.put(r2, r1)
            java.lang.String r1 = com.huawei.hms.hatool.y0.m()
            java.lang.String r2 = "App-Ver"
            r0.put(r2, r1)
            java.lang.String r1 = "Sdk-Name"
            java.lang.String r2 = "hianalytics"
            r0.put(r1, r2)
            java.lang.String r1 = "Sdk-Ver"
            java.lang.String r2 = "2.2.0.314"
            r0.put(r1, r2)
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r2 = "Device-Type"
            r0.put(r2, r1)
            java.lang.String r1 = "servicetag"
            r0.put(r1, r3)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r1 = 0
            r3[r1] = r4
            java.lang.String r1 = "hmsSdk"
            java.lang.String r2 = "sendData RequestId : %s"
            com.huawei.hms.hatool.j1.c(r1, r2, r3)
            java.lang.String r3 = "Request-Id"
            r0.put(r3, r4)
            return r0
    }
}
