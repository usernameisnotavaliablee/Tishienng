package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class bm extends com.tencent.bugly.proguard.m implements java.lang.Cloneable {
    static java.util.ArrayList<java.lang.String> c;
    public java.lang.String a;
    public java.util.ArrayList<java.lang.String> b;

    public bm() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.a = r0
            r0 = 0
            r1.b = r0
            return
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(com.tencent.bugly.proguard.k r5) {
            r4 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = r5.b(r0, r1)
            r4.a = r2
            java.util.ArrayList<java.lang.String> r2 = com.tencent.bugly.proguard.bm.c
            if (r2 != 0) goto L18
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.tencent.bugly.proguard.bm.c = r2
            java.lang.String r3 = ""
            r2.add(r3)
        L18:
            java.util.ArrayList<java.lang.String> r2 = com.tencent.bugly.proguard.bm.c
            java.lang.Object r5 = r5.a(r2, r1, r0)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.b = r5
            return
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(com.tencent.bugly.proguard.l r3) {
            r2 = this;
            java.lang.String r0 = r2.a
            r1 = 0
            r3.a(r0, r1)
            java.util.ArrayList<java.lang.String> r0 = r2.b
            if (r0 == 0) goto Le
            r1 = 1
            r3.a(r0, r1)
        Le:
            return
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(java.lang.StringBuilder r1, int r2) {
            r0 = this;
            return
    }
}
