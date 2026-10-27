package org.hamcrest;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class k {
    public k() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> void a(T r1, org.hamcrest.j<? super T> r2) {
            java.lang.String r0 = ""
            b(r0, r1, r2)
            return
    }

    public static <T> void b(java.lang.String r2, T r3, org.hamcrest.j<? super T> r4) {
            boolean r0 = r4.c(r3)
            if (r0 == 0) goto L7
            return
        L7:
            org.hamcrest.m r0 = new org.hamcrest.m
            r0.<init>()
            org.hamcrest.g r2 = r0.b(r2)
            java.lang.String r1 = "\nExpected: "
            org.hamcrest.g r2 = r2.b(r1)
            org.hamcrest.g r2 = r2.f(r4)
            java.lang.String r1 = "\n     but: "
            r2.b(r1)
            r4.b(r3, r0)
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    public static void c(java.lang.String r0, boolean r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }
}
