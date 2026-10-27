package org.hamcrest.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class h<T> extends org.hamcrest.n<java.lang.Iterable<? super T>> {
    private final org.hamcrest.j<? super T> c;

    public h(org.hamcrest.j<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            return
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.j<java.lang.Iterable<? super T>> e(T r1) {
            org.hamcrest.core.h r0 = new org.hamcrest.core.h
            org.hamcrest.j r1 = org.hamcrest.core.i.h(r1)
            r0.<init>(r1)
            return r0
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.j<java.lang.Iterable<? super T>> f(org.hamcrest.j<? super T> r1) {
            org.hamcrest.core.h r0 = new org.hamcrest.core.h
            r0.<init>(r1)
            return r0
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.j<java.lang.Iterable<T>> g(T... r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.length
            r0.<init>(r1)
            int r1 = r4.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L16
            r3 = r4[r2]
            org.hamcrest.j r3 = e(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L8
        L16:
            org.hamcrest.j r4 = org.hamcrest.core.a.e(r0)
            return r4
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.j<java.lang.Iterable<T>> h(org.hamcrest.j<? super T>... r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.length
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L17
            r3 = r5[r2]
            org.hamcrest.core.h r4 = new org.hamcrest.core.h
            r4.<init>(r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L17:
            org.hamcrest.j r5 = org.hamcrest.core.a.e(r0)
            return r5
    }

    @Override // org.hamcrest.n
    protected /* bridge */ /* synthetic */ boolean d(java.lang.Object r1, org.hamcrest.g r2) {
            r0 = this;
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r1 = r0.i(r1, r2)
            return r1
    }

    @Override // org.hamcrest.l
    public void describeTo(org.hamcrest.g r2) {
            r1 = this;
            java.lang.String r0 = "a collection containing "
            org.hamcrest.g r2 = r2.b(r0)
            org.hamcrest.j<? super T> r0 = r1.c
            r2.f(r0)
            return
    }

    protected boolean i(java.lang.Iterable<? super T> r6, org.hamcrest.g r7) {
            r5 = this;
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
            r1 = 0
        L6:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r6.next()
            org.hamcrest.j<? super T> r3 = r5.c
            boolean r3 = r3.c(r2)
            r4 = 1
            if (r3 == 0) goto L1a
            return r4
        L1a:
            if (r1 == 0) goto L21
            java.lang.String r1 = ", "
            r7.b(r1)
        L21:
            org.hamcrest.j<? super T> r1 = r5.c
            r1.b(r2, r7)
            r1 = 1
            goto L6
        L28:
            return r0
    }
}
