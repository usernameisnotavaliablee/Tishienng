package org.hamcrest.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e<T> extends org.hamcrest.n<java.lang.Iterable<T>> {
    private final org.hamcrest.j<? super T> c;

    public e(org.hamcrest.j<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            return
    }

    @org.hamcrest.Factory
    public static <U> org.hamcrest.j<java.lang.Iterable<U>> e(org.hamcrest.j<U> r1) {
            org.hamcrest.core.e r0 = new org.hamcrest.core.e
            r0.<init>(r1)
            return r0
    }

    @Override // org.hamcrest.n
    public /* bridge */ /* synthetic */ boolean d(java.lang.Object r1, org.hamcrest.g r2) {
            r0 = this;
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r1 = r0.f(r1, r2)
            return r1
    }

    @Override // org.hamcrest.l
    public void describeTo(org.hamcrest.g r2) {
            r1 = this;
            java.lang.String r0 = "every item is "
            org.hamcrest.g r2 = r2.b(r0)
            org.hamcrest.j<? super T> r0 = r1.c
            r2.f(r0)
            return
    }

    public boolean f(java.lang.Iterable<T> r3, org.hamcrest.g r4) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
            org.hamcrest.j<? super T> r1 = r2.c
            boolean r1 = r1.c(r0)
            if (r1 != 0) goto L4
            java.lang.String r3 = "an item "
            r4.b(r3)
            org.hamcrest.j<? super T> r3 = r2.c
            r3.b(r0, r4)
            r3 = 0
            return r3
        L22:
            r3 = 1
            return r3
    }
}
