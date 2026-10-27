package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a0 {
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private long e;

    public a0(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public void a() {
            r10 = this;
            java.lang.String r0 = "StreamEventHandler"
            java.lang.String r1 = "Begin to handle stream events..."
            com.huawei.hms.hatool.j1.h(r0, r1)
            com.huawei.hms.hatool.f r0 = new com.huawei.hms.hatool.f
            r0.<init>()
            java.lang.String r1 = r10.c
            r0.e(r1)
            java.lang.String r1 = r10.b
            r0.i(r1)
            java.lang.String r1 = r10.d
            r0.b(r1)
            long r1 = r10.e
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.g(r1)
            java.lang.String r1 = r10.b
            java.lang.String r2 = "oper"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L58
            java.lang.String r1 = r10.a
            boolean r1 = com.huawei.hms.hatool.r1.i(r1, r2)
            if (r1 == 0) goto L58
            com.huawei.hms.hatool.p1 r1 = com.huawei.hms.hatool.p1.c()
            java.lang.String r2 = r10.a
            long r3 = r10.e
            com.huawei.hms.hatool.v0 r1 = r1.b(r2, r3)
            java.lang.String r2 = r1.a()
            boolean r1 = r1.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.k(r2)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.j(r1)
        L58:
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "-"
            java.lang.String r3 = ""
            java.lang.String r9 = r1.replace(r2, r3)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r8.add(r0)
            com.huawei.hms.hatool.j0 r4 = new com.huawei.hms.hatool.j0
            java.lang.String r5 = r10.a
            java.lang.String r6 = r10.b
            java.lang.String r7 = com.huawei.hms.hatool.y0.m()
            r4.<init>(r5, r6, r7, r8, r9)
            r4.b()
            return
    }
}
