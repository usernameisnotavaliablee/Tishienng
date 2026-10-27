package org.hamcrest.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a<T> extends org.hamcrest.h<T> {
    private final java.lang.Iterable<org.hamcrest.j<? super T>> a;

    public a(java.lang.Iterable<org.hamcrest.j<? super T>> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.j<T> e(java.lang.Iterable<org.hamcrest.j<? super T>> r1) {
            org.hamcrest.core.a r0 = new org.hamcrest.core.a
            r0.<init>(r1)
            return r0
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.j<T> f(org.hamcrest.j<? super T> r2, org.hamcrest.j<? super T> r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            r0.add(r2)
            r0.add(r3)
            org.hamcrest.j r2 = e(r0)
            return r2
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.j<T> g(org.hamcrest.j<? super T> r2, org.hamcrest.j<? super T> r3, org.hamcrest.j<? super T> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 3
            r0.<init>(r1)
            r0.add(r2)
            r0.add(r3)
            r0.add(r4)
            org.hamcrest.j r2 = e(r0)
            return r2
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.j<T> h(org.hamcrest.j<? super T> r2, org.hamcrest.j<? super T> r3, org.hamcrest.j<? super T> r4, org.hamcrest.j<? super T> r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            r0.add(r2)
            r0.add(r3)
            r0.add(r4)
            r0.add(r5)
            org.hamcrest.j r2 = e(r0)
            return r2
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.j<T> i(org.hamcrest.j<? super T> r2, org.hamcrest.j<? super T> r3, org.hamcrest.j<? super T> r4, org.hamcrest.j<? super T> r5, org.hamcrest.j<? super T> r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 5
            r0.<init>(r1)
            r0.add(r2)
            r0.add(r3)
            r0.add(r4)
            r0.add(r5)
            r0.add(r6)
            org.hamcrest.j r2 = e(r0)
            return r2
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.j<T> j(org.hamcrest.j<? super T> r2, org.hamcrest.j<? super T> r3, org.hamcrest.j<? super T> r4, org.hamcrest.j<? super T> r5, org.hamcrest.j<? super T> r6, org.hamcrest.j<? super T> r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 6
            r0.<init>(r1)
            r0.add(r2)
            r0.add(r3)
            r0.add(r4)
            r0.add(r5)
            r0.add(r6)
            r0.add(r7)
            org.hamcrest.j r2 = e(r0)
            return r2
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.j<T> k(org.hamcrest.j<? super T>... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            org.hamcrest.j r0 = e(r0)
            return r0
    }

    @Override // org.hamcrest.h
    public boolean d(java.lang.Object r4, org.hamcrest.g r5) {
            r3 = this;
            java.lang.Iterable<org.hamcrest.j<? super T>> r0 = r3.a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            org.hamcrest.j r1 = (org.hamcrest.j) r1
            boolean r2 = r1.c(r4)
            if (r2 != 0) goto L6
            org.hamcrest.g r0 = r5.f(r1)
            java.lang.String r2 = " "
            r0.b(r2)
            r1.b(r4, r5)
            r4 = 0
            return r4
        L26:
            r4 = 1
            return r4
    }

    @Override // org.hamcrest.l
    public void describeTo(org.hamcrest.g r5) {
            r4 = this;
            java.lang.String r0 = ")"
            java.lang.Iterable<org.hamcrest.j<? super T>> r1 = r4.a
            java.lang.String r2 = "("
            java.lang.String r3 = " and "
            r5.a(r2, r3, r0, r1)
            return
    }
}
