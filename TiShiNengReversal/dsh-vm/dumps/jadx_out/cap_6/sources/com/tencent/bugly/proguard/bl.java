package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class bl extends com.tencent.bugly.proguard.m implements java.lang.Cloneable {
    public java.lang.String a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public java.lang.String e;

    public bl() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.a = r0
            r1.b = r0
            r1.c = r0
            r1.d = r0
            r1.e = r0
            return
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(com.tencent.bugly.proguard.k r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = r4.b(r0, r1)
            r3.a = r2
            java.lang.String r1 = r4.b(r1, r0)
            r3.b = r1
            r1 = 2
            java.lang.String r1 = r4.b(r1, r0)
            r3.c = r1
            r1 = 3
            java.lang.String r1 = r4.b(r1, r0)
            r3.d = r1
            r1 = 4
            java.lang.String r4 = r4.b(r1, r0)
            r3.e = r4
            return
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(com.tencent.bugly.proguard.l r3) {
            r2 = this;
            java.lang.String r0 = r2.a
            r1 = 0
            r3.a(r0, r1)
            java.lang.String r0 = r2.b
            if (r0 == 0) goto Le
            r1 = 1
            r3.a(r0, r1)
        Le:
            java.lang.String r0 = r2.c
            if (r0 == 0) goto L16
            r1 = 2
            r3.a(r0, r1)
        L16:
            java.lang.String r0 = r2.d
            if (r0 == 0) goto L1e
            r1 = 3
            r3.a(r0, r1)
        L1e:
            java.lang.String r0 = r2.e
            if (r0 == 0) goto L26
            r1 = 4
            r3.a(r0, r1)
        L26:
            return
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(java.lang.StringBuilder r1, int r2) {
            r0 = this;
            return
    }
}
