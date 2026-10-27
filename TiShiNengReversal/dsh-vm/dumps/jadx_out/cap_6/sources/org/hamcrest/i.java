package org.hamcrest;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class i<T, U> extends org.hamcrest.n<T> {
    private static final org.hamcrest.internal.b f = null;
    private final org.hamcrest.j<? super U> c;
    private final java.lang.String d;
    private final java.lang.String e;

    static {
            org.hamcrest.internal.b r0 = new org.hamcrest.internal.b
            r1 = 1
            r2 = 0
            java.lang.String r3 = "featureValueOf"
            r0.<init>(r3, r1, r2)
            org.hamcrest.i.f = r0
            return
    }

    public i(org.hamcrest.j<? super U> r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            org.hamcrest.internal.b r0 = org.hamcrest.i.f
            r1.<init>(r0)
            r1.c = r2
            r1.d = r3
            r1.e = r4
            return
    }

    @Override // org.hamcrest.n
    protected boolean d(T r3, org.hamcrest.g r4) {
            r2 = this;
            java.lang.Object r3 = r2.e(r3)
            org.hamcrest.j<? super U> r0 = r2.c
            boolean r0 = r0.c(r3)
            if (r0 != 0) goto L1e
            java.lang.String r0 = r2.e
            org.hamcrest.g r0 = r4.b(r0)
            java.lang.String r1 = " "
            r0.b(r1)
            org.hamcrest.j<? super U> r0 = r2.c
            r0.b(r3, r4)
            r3 = 0
            return r3
        L1e:
            r3 = 1
            return r3
    }

    @Override // org.hamcrest.l
    public final void describeTo(org.hamcrest.g r2) {
            r1 = this;
            java.lang.String r0 = r1.d
            org.hamcrest.g r2 = r2.b(r0)
            java.lang.String r0 = " "
            org.hamcrest.g r2 = r2.b(r0)
            org.hamcrest.j<? super U> r0 = r1.c
            r2.f(r0)
            return
    }

    protected abstract U e(T r1);
}
