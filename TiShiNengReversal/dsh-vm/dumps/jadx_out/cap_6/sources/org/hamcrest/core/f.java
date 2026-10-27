package org.hamcrest.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class f<T> extends org.hamcrest.b<T> {
    private final org.hamcrest.j<T> a;

    public f(org.hamcrest.j<T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @org.hamcrest.Factory
    @java.lang.Deprecated
    public static <T> org.hamcrest.j<T> d(java.lang.Class<T> r0) {
            org.hamcrest.j r0 = org.hamcrest.core.j.f(r0)
            org.hamcrest.j r0 = f(r0)
            return r0
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.j<T> e(T r0) {
            org.hamcrest.j r0 = org.hamcrest.core.i.h(r0)
            org.hamcrest.j r0 = f(r0)
            return r0
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.j<T> f(org.hamcrest.j<T> r1) {
            org.hamcrest.core.f r0 = new org.hamcrest.core.f
            r0.<init>(r1)
            return r0
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.j<T> g(java.lang.Class<T> r0) {
            org.hamcrest.j r0 = org.hamcrest.core.j.f(r0)
            org.hamcrest.j r0 = f(r0)
            return r0
    }

    @Override // org.hamcrest.b, org.hamcrest.j
    public void b(java.lang.Object r2, org.hamcrest.g r3) {
            r1 = this;
            org.hamcrest.j<T> r0 = r1.a
            r0.b(r2, r3)
            return
    }

    @Override // org.hamcrest.j
    public boolean c(java.lang.Object r2) {
            r1 = this;
            org.hamcrest.j<T> r0 = r1.a
            boolean r2 = r0.c(r2)
            return r2
    }

    @Override // org.hamcrest.l
    public void describeTo(org.hamcrest.g r2) {
            r1 = this;
            java.lang.String r0 = "is "
            org.hamcrest.g r2 = r2.b(r0)
            org.hamcrest.j<T> r0 = r1.a
            r2.f(r0)
            return
    }
}
