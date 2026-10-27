package org.junit.internal.matchers;

import java.lang.Throwable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b<T extends java.lang.Throwable> extends org.hamcrest.o<T> {
    private final org.hamcrest.j<? extends java.lang.Throwable> c;

    public b(org.hamcrest.j<? extends java.lang.Throwable> r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            return
    }

    @org.hamcrest.Factory
    public static <T extends java.lang.Throwable> org.hamcrest.j<T> g(org.hamcrest.j<? extends java.lang.Throwable> r1) {
            org.junit.internal.matchers.b r0 = new org.junit.internal.matchers.b
            r0.<init>(r1)
            return r0
    }

    @Override // org.hamcrest.o
    protected /* bridge */ /* synthetic */ void d(java.lang.Object r1, org.hamcrest.g r2) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.f(r1, r2)
            return
    }

    @Override // org.hamcrest.l
    public void describeTo(org.hamcrest.g r2) {
            r1 = this;
            java.lang.String r0 = "exception with cause "
            r2.b(r0)
            org.hamcrest.j<? extends java.lang.Throwable> r0 = r1.c
            r2.f(r0)
            return
    }

    @Override // org.hamcrest.o
    protected /* bridge */ /* synthetic */ boolean e(java.lang.Object r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            boolean r1 = r0.h(r1)
            return r1
    }

    protected void f(T r2, org.hamcrest.g r3) {
            r1 = this;
            java.lang.String r0 = "cause "
            r3.b(r0)
            org.hamcrest.j<? extends java.lang.Throwable> r0 = r1.c
            java.lang.Throwable r2 = r2.getCause()
            r0.b(r2, r3)
            return
    }

    protected boolean h(T r2) {
            r1 = this;
            org.hamcrest.j<? extends java.lang.Throwable> r0 = r1.c
            java.lang.Throwable r2 = r2.getCause()
            boolean r2 = r0.c(r2)
            return r2
    }
}
