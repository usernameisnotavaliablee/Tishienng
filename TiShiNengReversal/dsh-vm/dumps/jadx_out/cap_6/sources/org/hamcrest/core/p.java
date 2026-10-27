package org.hamcrest.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class p extends org.hamcrest.core.r {
    public p(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @org.hamcrest.Factory
    public static org.hamcrest.j<java.lang.String> j(java.lang.String r1) {
            org.hamcrest.core.p r0 = new org.hamcrest.core.p
            r0.<init>(r1)
            return r0
    }

    @Override // org.hamcrest.core.r
    protected boolean g(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.c
            boolean r2 = r2.endsWith(r0)
            return r2
    }

    @Override // org.hamcrest.core.r
    protected java.lang.String i() {
            r1 = this;
            java.lang.String r0 = "ending with"
            return r0
    }
}
