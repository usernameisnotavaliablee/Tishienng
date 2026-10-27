package org.hamcrest.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b<T> extends org.hamcrest.core.n<T> {
    public b(java.lang.Iterable<org.hamcrest.j<? super T>> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.core.b<T> f(java.lang.Iterable<org.hamcrest.j<? super T>> r1) {
            org.hamcrest.core.b r0 = new org.hamcrest.core.b
            r0.<init>(r1)
            return r0
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.core.b<T> g(org.hamcrest.j<T> r1, org.hamcrest.j<? super T> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            r0.add(r2)
            org.hamcrest.core.b r1 = f(r0)
            return r1
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.core.b<T> h(org.hamcrest.j<T> r1, org.hamcrest.j<? super T> r2, org.hamcrest.j<? super T> r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            r0.add(r2)
            r0.add(r3)
            org.hamcrest.core.b r1 = f(r0)
            return r1
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.core.b<T> i(org.hamcrest.j<T> r1, org.hamcrest.j<? super T> r2, org.hamcrest.j<? super T> r3, org.hamcrest.j<? super T> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            r0.add(r2)
            r0.add(r3)
            r0.add(r4)
            org.hamcrest.core.b r1 = f(r0)
            return r1
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.core.b<T> j(org.hamcrest.j<T> r1, org.hamcrest.j<? super T> r2, org.hamcrest.j<? super T> r3, org.hamcrest.j<? super T> r4, org.hamcrest.j<? super T> r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            r0.add(r2)
            r0.add(r3)
            r0.add(r4)
            r0.add(r5)
            org.hamcrest.core.b r1 = f(r0)
            return r1
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.core.b<T> k(org.hamcrest.j<T> r1, org.hamcrest.j<? super T> r2, org.hamcrest.j<? super T> r3, org.hamcrest.j<? super T> r4, org.hamcrest.j<? super T> r5, org.hamcrest.j<? super T> r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            r0.add(r2)
            r0.add(r3)
            r0.add(r4)
            r0.add(r5)
            r0.add(r6)
            org.hamcrest.core.b r1 = f(r0)
            return r1
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.core.b<T> l(org.hamcrest.j<? super T>... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            org.hamcrest.core.b r0 = f(r0)
            return r0
    }

    @Override // org.hamcrest.core.n, org.hamcrest.j
    public boolean c(java.lang.Object r2) {
            r1 = this;
            r0 = 1
            boolean r2 = r1.e(r2, r0)
            return r2
    }

    @Override // org.hamcrest.core.n
    public /* bridge */ /* synthetic */ void d(org.hamcrest.g r1, java.lang.String r2) {
            r0 = this;
            super.d(r1, r2)
            return
    }

    @Override // org.hamcrest.core.n, org.hamcrest.l
    public void describeTo(org.hamcrest.g r2) {
            r1 = this;
            java.lang.String r0 = "or"
            r1.d(r2, r0)
            return
    }
}
