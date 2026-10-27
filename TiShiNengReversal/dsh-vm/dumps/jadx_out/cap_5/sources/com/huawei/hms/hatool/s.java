package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class s implements com.huawei.hms.hatool.v {
    private byte[] a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private java.util.List<com.huawei.hms.hatool.f> f;

    public s(byte[] r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.util.List<com.huawei.hms.hatool.f> r6) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = r1.clone()
            byte[] r1 = (byte[]) r1
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.e = r4
            r0.d = r5
            r0.f = r6
            return
    }

    private com.huawei.hms.hatool.p0 a(java.util.Map<java.lang.String, java.lang.String> r3) {
            r2 = this;
            java.lang.String r0 = r2.b
            byte[] r1 = r2.a
            com.huawei.hms.hatool.p0 r3 = com.huawei.hms.hatool.k1.a(r0, r1, r3)
            return r3
    }

    private java.util.Map<java.lang.String, java.lang.String> b() {
            r3 = this;
            java.lang.String r0 = r3.c
            java.lang.String r1 = r3.e
            java.lang.String r2 = r3.d
            java.util.Map r0 = com.huawei.hms.hatool.g0.g(r0, r1, r2)
            return r0
    }

    private void c() {
            r5 = this;
            com.huawei.hms.hatool.k r0 = new com.huawei.hms.hatool.k
            java.util.List<com.huawei.hms.hatool.f> r1 = r5.f
            java.lang.String r2 = r5.c
            java.lang.String r3 = r5.d
            java.lang.String r4 = r5.e
            r0.<init>(r1, r2, r3, r4)
            com.huawei.hms.hatool.e r1 = com.huawei.hms.hatool.e.d()
            r1.b(r0)
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r7 = this;
            java.lang.String r0 = "send data running"
            java.lang.String r1 = "hmsSdk"
            com.huawei.hms.hatool.j1.h(r1, r0)
            java.util.Map r0 = r7.b()
            com.huawei.hms.hatool.p0 r0 = r7.a(r0)
            int r0 = r0.b()
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 == r2) goto L1b
            r7.c()
            return
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "events PostRequest sendevent TYPE : %s, TAG : %s, resultCode: %d ,reqID:"
            r2.append(r3)
            java.lang.String r3 = r7.d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r7.e
            java.lang.String r4 = r7.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r3
            r3 = 1
            r5[r3] = r4
            r3 = 2
            r5[r3] = r0
            com.huawei.hms.hatool.j1.f(r1, r2, r5)
            return
    }
}
