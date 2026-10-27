package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class k0 {
    private com.huawei.hms.hatool.c1 a;
    private com.huawei.hms.hatool.c1 b;
    private com.huawei.hms.hatool.c1 c;
    private com.huawei.hms.hatool.c1 d;

    public k0(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public com.huawei.hms.hatool.c1 a() {
            r1 = this;
            com.huawei.hms.hatool.c1 r0 = r1.c
            return r0
    }

    public com.huawei.hms.hatool.c1 b(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "oper"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Ld
            com.huawei.hms.hatool.c1 r3 = r2.f()
            return r3
        Ld:
            java.lang.String r0 = "maint"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1a
            com.huawei.hms.hatool.c1 r3 = r2.d()
            return r3
        L1a:
            java.lang.String r0 = "diffprivacy"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L27
            com.huawei.hms.hatool.c1 r3 = r2.a()
            return r3
        L27:
            java.lang.String r0 = "preins"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L34
            com.huawei.hms.hatool.c1 r3 = r2.g()
            return r3
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HiAnalyticsInstData.getConfig(type): wrong type: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "hmsSdk"
            com.huawei.hms.hatool.j1.m(r0, r3)
            r3 = 0
            return r3
    }

    public void c(com.huawei.hms.hatool.c1 r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public com.huawei.hms.hatool.c1 d() {
            r1 = this;
            com.huawei.hms.hatool.c1 r0 = r1.a
            return r0
    }

    public void e(com.huawei.hms.hatool.c1 r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public com.huawei.hms.hatool.c1 f() {
            r1 = this;
            com.huawei.hms.hatool.c1 r0 = r1.b
            return r0
    }

    public com.huawei.hms.hatool.c1 g() {
            r1 = this;
            com.huawei.hms.hatool.c1 r0 = r1.d
            return r0
    }
}
