package org.hamcrest.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class m<T> extends org.hamcrest.b<T> {
    private final T a;

    public m(T r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.j<T> d(T r1) {
            org.hamcrest.core.m r0 = new org.hamcrest.core.m
            r0.<init>(r1)
            return r0
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.j<T> e(T r1) {
            org.hamcrest.core.m r0 = new org.hamcrest.core.m
            r0.<init>(r1)
            return r0
    }

    @Override // org.hamcrest.j
    public boolean c(java.lang.Object r2) {
            r1 = this;
            T r0 = r1.a
            if (r2 != r0) goto L6
            r2 = 1
            return r2
        L6:
            r2 = 0
            return r2
    }

    @Override // org.hamcrest.l
    public void describeTo(org.hamcrest.g r2) {
            r1 = this;
            java.lang.String r0 = "sameInstance("
            org.hamcrest.g r2 = r2.b(r0)
            T r0 = r1.a
            org.hamcrest.g r2 = r2.c(r0)
            java.lang.String r0 = ")"
            r2.b(r0)
            return
    }
}
