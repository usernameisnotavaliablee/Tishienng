package org.hamcrest.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class n<T> extends org.hamcrest.b<T> {
    private final java.lang.Iterable<org.hamcrest.j<? super T>> a;

    public n(java.lang.Iterable<org.hamcrest.j<? super T>> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // org.hamcrest.j
    public abstract boolean c(java.lang.Object r1);

    public void d(org.hamcrest.g r4, java.lang.String r5) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " "
            r0.append(r1)
            r0.append(r5)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = ")"
            java.lang.Iterable<org.hamcrest.j<? super T>> r1 = r3.a
            java.lang.String r2 = "("
            r4.a(r2, r5, r0, r1)
            return
    }

    @Override // org.hamcrest.l
    public abstract void describeTo(org.hamcrest.g r1);

    protected boolean e(java.lang.Object r3, boolean r4) {
            r2 = this;
            java.lang.Iterable<org.hamcrest.j<? super T>> r0 = r2.a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            org.hamcrest.j r1 = (org.hamcrest.j) r1
            boolean r1 = r1.c(r3)
            if (r1 != r4) goto L6
            return r4
        L19:
            r3 = r4 ^ 1
            return r3
    }
}
