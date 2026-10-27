package org.hamcrest.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class i<T> extends org.hamcrest.b<T> {
    private final java.lang.Object a;

    public i(T r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private static boolean d(java.lang.Object r4, java.lang.Object r5) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = java.lang.reflect.Array.getLength(r4)
            if (r1 >= r2) goto L1a
            java.lang.Object r2 = java.lang.reflect.Array.get(r4, r1)
            java.lang.Object r3 = java.lang.reflect.Array.get(r5, r1)
            boolean r2 = g(r2, r3)
            if (r2 != 0) goto L17
            return r0
        L17:
            int r1 = r1 + 1
            goto L2
        L1a:
            r4 = 1
            return r4
    }

    private static boolean e(java.lang.Object r0, java.lang.Object r1) {
            int r0 = java.lang.reflect.Array.getLength(r0)
            int r1 = java.lang.reflect.Array.getLength(r1)
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private static boolean f(java.lang.Object r1, java.lang.Object r2) {
            boolean r0 = e(r1, r2)
            if (r0 == 0) goto Le
            boolean r1 = d(r1, r2)
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    private static boolean g(java.lang.Object r3, java.lang.Object r4) {
            r0 = 0
            r1 = 1
            if (r3 != 0) goto L8
            if (r4 != 0) goto L7
            return r1
        L7:
            return r0
        L8:
            if (r4 == 0) goto L1e
            boolean r2 = i(r3)
            if (r2 == 0) goto L1e
            boolean r2 = i(r4)
            if (r2 == 0) goto L1d
            boolean r3 = f(r3, r4)
            if (r3 == 0) goto L1d
            return r1
        L1d:
            return r0
        L1e:
            boolean r3 = r3.equals(r4)
            return r3
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.j<T> h(T r1) {
            org.hamcrest.core.i r0 = new org.hamcrest.core.i
            r0.<init>(r1)
            return r0
    }

    private static boolean i(java.lang.Object r0) {
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isArray()
            return r0
    }

    @Override // org.hamcrest.j
    public boolean c(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.a
            boolean r2 = g(r2, r0)
            return r2
    }

    @Override // org.hamcrest.l
    public void describeTo(org.hamcrest.g r2) {
            r1 = this;
            java.lang.Object r0 = r1.a
            r2.c(r0)
            return
    }
}
