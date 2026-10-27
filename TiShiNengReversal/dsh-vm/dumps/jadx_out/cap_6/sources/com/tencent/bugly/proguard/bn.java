package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class bn extends com.tencent.bugly.proguard.m implements java.lang.Cloneable {
    static byte[] d;
    public byte a;
    public java.lang.String b;
    public byte[] c;

    public bn() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            java.lang.String r0 = ""
            r1.b = r0
            r0 = 0
            r1.c = r0
            return
    }

    public bn(byte r1, java.lang.String r2, byte[] r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(com.tencent.bugly.proguard.k r4) {
            r3 = this;
            byte r0 = r3.a
            r1 = 0
            r2 = 1
            byte r0 = r4.a(r0, r1, r2)
            r3.a = r0
            java.lang.String r0 = r4.b(r2, r2)
            r3.b = r0
            byte[] r0 = com.tencent.bugly.proguard.bn.d
            if (r0 != 0) goto L1a
            byte[] r0 = new byte[r2]
            com.tencent.bugly.proguard.bn.d = r0
            r0[r1] = r1
        L1a:
            r0 = 2
            byte[] r4 = r4.c(r0, r1)
            r3.c = r4
            return
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(com.tencent.bugly.proguard.l r3) {
            r2 = this;
            byte r0 = r2.a
            r1 = 0
            r3.a(r0, r1)
            java.lang.String r0 = r2.b
            r1 = 1
            r3.a(r0, r1)
            byte[] r0 = r2.c
            if (r0 == 0) goto L14
            r1 = 2
            r3.a(r0, r1)
        L14:
            return
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(java.lang.StringBuilder r1, int r2) {
            r0 = this;
            return
    }
}
