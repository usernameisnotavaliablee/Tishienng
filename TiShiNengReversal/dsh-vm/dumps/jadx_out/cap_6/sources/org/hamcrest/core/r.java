package org.hamcrest.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class r extends org.hamcrest.o<java.lang.String> {
    protected final java.lang.String c;

    protected r(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            return
    }

    @Override // org.hamcrest.o
    public /* bridge */ /* synthetic */ void d(java.lang.String r1, org.hamcrest.g r2) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            r0.f(r1, r2)
            return
    }

    @Override // org.hamcrest.l
    public void describeTo(org.hamcrest.g r2) {
            r1 = this;
            java.lang.String r0 = "a string "
            org.hamcrest.g r2 = r2.b(r0)
            java.lang.String r0 = r1.i()
            org.hamcrest.g r2 = r2.b(r0)
            java.lang.String r0 = " "
            org.hamcrest.g r2 = r2.b(r0)
            java.lang.String r0 = r1.c
            r2.c(r0)
            return
    }

    @Override // org.hamcrest.o
    public /* bridge */ /* synthetic */ boolean e(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r0.h(r1)
            return r1
    }

    public void f(java.lang.String r2, org.hamcrest.g r3) {
            r1 = this;
            java.lang.String r0 = "was \""
            org.hamcrest.g r3 = r3.b(r0)
            org.hamcrest.g r2 = r3.b(r2)
            java.lang.String r3 = "\""
            r2.b(r3)
            return
    }

    protected abstract boolean g(java.lang.String r1);

    public boolean h(java.lang.String r1) {
            r0 = this;
            boolean r1 = r0.g(r1)
            return r1
    }

    protected abstract java.lang.String i();
}
