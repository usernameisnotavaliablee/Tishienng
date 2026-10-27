package org.hamcrest.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class g<T> extends org.hamcrest.b<T> {
    private final java.lang.String a;

    public g() {
            r1 = this;
            java.lang.String r0 = "ANYTHING"
            r1.<init>(r0)
            return
    }

    public g(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @org.hamcrest.Factory
    public static org.hamcrest.j<java.lang.Object> d() {
            org.hamcrest.core.g r0 = new org.hamcrest.core.g
            r0.<init>()
            return r0
    }

    @org.hamcrest.Factory
    public static org.hamcrest.j<java.lang.Object> e(java.lang.String r1) {
            org.hamcrest.core.g r0 = new org.hamcrest.core.g
            r0.<init>(r1)
            return r0
    }

    @Override // org.hamcrest.j
    public boolean c(java.lang.Object r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // org.hamcrest.l
    public void describeTo(org.hamcrest.g r2) {
            r1 = this;
            java.lang.String r0 = r1.a
            r2.b(r0)
            return
    }
}
