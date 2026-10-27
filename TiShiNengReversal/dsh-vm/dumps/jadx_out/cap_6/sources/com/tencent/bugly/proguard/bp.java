package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class bp extends com.tencent.bugly.proguard.m implements java.lang.Cloneable {
    static java.util.ArrayList<com.tencent.bugly.proguard.bo> b;
    public java.util.ArrayList<com.tencent.bugly.proguard.bo> a;

    public bp() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            return
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(com.tencent.bugly.proguard.k r4) {
            r3 = this;
            java.util.ArrayList<com.tencent.bugly.proguard.bo> r0 = com.tencent.bugly.proguard.bp.b
            if (r0 != 0) goto L15
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tencent.bugly.proguard.bp.b = r0
            com.tencent.bugly.proguard.bo r0 = new com.tencent.bugly.proguard.bo
            r0.<init>()
            java.util.ArrayList<com.tencent.bugly.proguard.bo> r1 = com.tencent.bugly.proguard.bp.b
            r1.add(r0)
        L15:
            java.util.ArrayList<com.tencent.bugly.proguard.bo> r0 = com.tencent.bugly.proguard.bp.b
            r1 = 0
            r2 = 1
            java.lang.Object r4 = r4.a(r0, r1, r2)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r3.a = r4
            return
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(com.tencent.bugly.proguard.l r3) {
            r2 = this;
            java.util.ArrayList<com.tencent.bugly.proguard.bo> r0 = r2.a
            r1 = 0
            r3.a(r0, r1)
            return
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(java.lang.StringBuilder r1, int r2) {
            r0 = this;
            return
    }
}
