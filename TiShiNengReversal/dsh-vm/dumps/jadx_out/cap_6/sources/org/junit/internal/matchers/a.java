package org.junit.internal.matchers;

import java.lang.Throwable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a<T extends java.lang.Throwable> extends org.hamcrest.o<T> {
    private final org.hamcrest.j<T> c;

    public a(org.hamcrest.j<T> r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            return
    }

    @org.hamcrest.Factory
    public static <T extends java.lang.Exception> org.hamcrest.j<T> g(org.hamcrest.j<T> r1) {
            org.junit.internal.matchers.a r0 = new org.junit.internal.matchers.a
            r0.<init>(r1)
            return r0
    }

    @org.hamcrest.Factory
    public static <T extends java.lang.Throwable> org.hamcrest.j<T> h(org.hamcrest.j<T> r1) {
            org.junit.internal.matchers.a r0 = new org.junit.internal.matchers.a
            r0.<init>(r1)
            return r0
    }

    private java.lang.String j(java.lang.Throwable r3) {
            r2 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            r3.getClass()
            java.lang.String r3 = r0.toString()
            return r3
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
            org.hamcrest.j<T extends java.lang.Throwable> r0 = r1.c
            r0.describeTo(r2)
            return
    }

    @Override // org.hamcrest.o
    protected /* bridge */ /* synthetic */ boolean e(java.lang.Object r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            boolean r1 = r0.i(r1)
            return r1
    }

    protected void f(T r2, org.hamcrest.g r3) {
            r1 = this;
            org.hamcrest.j<T extends java.lang.Throwable> r0 = r1.c
            r0.b(r2, r3)
            java.lang.String r0 = "\nStacktrace was: "
            r3.b(r0)
            java.lang.String r2 = r1.j(r2)
            r3.b(r2)
            return
    }

    protected boolean i(T r2) {
            r1 = this;
            org.hamcrest.j<T extends java.lang.Throwable> r0 = r1.c
            boolean r2 = r0.c(r2)
            return r2
    }
}
