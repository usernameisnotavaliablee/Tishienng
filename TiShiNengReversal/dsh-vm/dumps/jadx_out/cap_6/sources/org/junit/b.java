package org.junit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(java.lang.String r0, boolean r1) {
            r1 = r1 ^ 1
            h(r0, r1)
            return
    }

    public static void b(boolean r0) {
            r0 = r0 ^ 1
            i(r0)
            return
    }

    public static void c(java.lang.String r1, java.lang.Throwable r2) {
            org.hamcrest.j r0 = org.hamcrest.d.L()
            g(r1, r2, r0)
            return
    }

    public static void d(java.lang.Throwable r1) {
            org.hamcrest.j r0 = org.hamcrest.d.L()
            f(r1, r0)
            return
    }

    public static void e(java.lang.Object... r1) {
            java.util.List r1 = java.util.Arrays.asList(r1)
            org.hamcrest.j r0 = org.hamcrest.d.J()
            org.hamcrest.j r0 = org.hamcrest.d.x(r0)
            f(r1, r0)
            return
    }

    public static <T> void f(T r1, org.hamcrest.j<T> r2) {
            boolean r0 = r2.c(r1)
            if (r0 == 0) goto L7
            return
        L7:
            org.junit.AssumptionViolatedException r0 = new org.junit.AssumptionViolatedException
            r0.<init>(r1, r2)
            throw r0
    }

    public static <T> void g(java.lang.String r1, T r2, org.hamcrest.j<T> r3) {
            boolean r0 = r3.c(r2)
            if (r0 == 0) goto L7
            return
        L7:
            org.junit.AssumptionViolatedException r0 = new org.junit.AssumptionViolatedException
            r0.<init>(r1, r2, r3)
            throw r0
    }

    public static void h(java.lang.String r0, boolean r1) {
            if (r1 == 0) goto L3
            return
        L3:
            org.junit.AssumptionViolatedException r1 = new org.junit.AssumptionViolatedException
            r1.<init>(r0)
            throw r1
    }

    public static void i(boolean r1) {
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            org.hamcrest.j r0 = org.hamcrest.d.E(r0)
            f(r1, r0)
            return
    }
}
