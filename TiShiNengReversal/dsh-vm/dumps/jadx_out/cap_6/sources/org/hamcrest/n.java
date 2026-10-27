package org.hamcrest;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class n<T> extends org.hamcrest.b<T> {
    private static final org.hamcrest.internal.b b = null;
    private final java.lang.Class<?> a;

    static {
            org.hamcrest.internal.b r0 = new org.hamcrest.internal.b
            r1 = 2
            r2 = 0
            java.lang.String r3 = "matchesSafely"
            r0.<init>(r3, r1, r2)
            org.hamcrest.n.b = r0
            return
    }

    protected n() {
            r1 = this;
            org.hamcrest.internal.b r0 = org.hamcrest.n.b
            r1.<init>(r0)
            return
    }

    protected n(java.lang.Class<?> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    protected n(org.hamcrest.internal.b r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r1.getClass()
            java.lang.Class r2 = r2.c(r0)
            r1.a = r2
            return
    }

    @Override // org.hamcrest.b, org.hamcrest.j
    public final void b(java.lang.Object r2, org.hamcrest.g r3) {
            r1 = this;
            if (r2 == 0) goto Lf
            java.lang.Class<?> r0 = r1.a
            boolean r0 = r0.isInstance(r2)
            if (r0 != 0) goto Lb
            goto Lf
        Lb:
            r1.d(r2, r3)
            return
        Lf:
            super.b(r2, r3)
            return
    }

    @Override // org.hamcrest.j
    public final boolean c(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto L17
            java.lang.Class<?> r0 = r1.a
            boolean r0 = r0.isInstance(r2)
            if (r0 == 0) goto L17
            org.hamcrest.g$a r0 = new org.hamcrest.g$a
            r0.<init>()
            boolean r2 = r1.d(r2, r0)
            if (r2 == 0) goto L17
            r2 = 1
            return r2
        L17:
            r2 = 0
            return r2
    }

    protected abstract boolean d(T r1, org.hamcrest.g r2);
}
