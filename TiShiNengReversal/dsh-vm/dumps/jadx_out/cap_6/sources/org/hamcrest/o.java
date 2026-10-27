package org.hamcrest;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class o<T> extends org.hamcrest.b<T> {
    private static final org.hamcrest.internal.b b = null;
    private final java.lang.Class<?> a;

    static {
            org.hamcrest.internal.b r0 = new org.hamcrest.internal.b
            r1 = 1
            r2 = 0
            java.lang.String r3 = "matchesSafely"
            r0.<init>(r3, r1, r2)
            org.hamcrest.o.b = r0
            return
    }

    protected o() {
            r1 = this;
            org.hamcrest.internal.b r0 = org.hamcrest.o.b
            r1.<init>(r0)
            return
    }

    protected o(java.lang.Class<?> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    protected o(org.hamcrest.internal.b r2) {
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
            if (r2 != 0) goto L6
            super.b(r2, r3)
            return
        L6:
            java.lang.Class<?> r0 = r1.a
            boolean r0 = r0.isInstance(r2)
            if (r0 != 0) goto L30
            java.lang.String r0 = "was a "
            org.hamcrest.g r3 = r3.b(r0)
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            org.hamcrest.g r3 = r3.b(r0)
            java.lang.String r0 = " ("
            org.hamcrest.g r3 = r3.b(r0)
            org.hamcrest.g r2 = r3.c(r2)
            java.lang.String r3 = ")"
            r2.b(r3)
            return
        L30:
            r1.d(r2, r3)
            return
    }

    @Override // org.hamcrest.j
    public final boolean c(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto L12
            java.lang.Class<?> r0 = r1.a
            boolean r0 = r0.isInstance(r2)
            if (r0 == 0) goto L12
            boolean r2 = r1.e(r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    protected void d(T r1, org.hamcrest.g r2) {
            r0 = this;
            super.b(r1, r2)
            return
    }

    protected abstract boolean e(T r1);
}
