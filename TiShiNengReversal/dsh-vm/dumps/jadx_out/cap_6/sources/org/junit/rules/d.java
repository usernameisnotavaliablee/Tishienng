package org.junit.rules;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class d {
    private final java.util.List<org.hamcrest.j<?>> a;

    d() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            return
    }

    private org.hamcrest.j<java.lang.Throwable> b() {
            r2 = this;
            java.util.List<org.hamcrest.j<?>> r0 = r2.a
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L17
            java.util.List<org.hamcrest.j<?>> r0 = r2.a
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            org.hamcrest.j r0 = (org.hamcrest.j) r0
            org.hamcrest.j r0 = r2.d(r0)
            return r0
        L17:
            java.util.List r0 = r2.e()
            org.hamcrest.j r0 = org.hamcrest.d.a(r0)
            return r0
    }

    private org.hamcrest.j<java.lang.Throwable> d(org.hamcrest.j<?> r1) {
            r0 = this;
            return r1
    }

    private java.util.List<org.hamcrest.j<? super java.lang.Throwable>> e() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<org.hamcrest.j<?>> r1 = r2.a
            r0.<init>(r1)
            return r0
    }

    void a(org.hamcrest.j<?> r2) {
            r1 = this;
            java.util.List<org.hamcrest.j<?>> r0 = r1.a
            r0.add(r2)
            return
    }

    org.hamcrest.j<java.lang.Throwable> c() {
            r1 = this;
            org.hamcrest.j r0 = r1.b()
            org.hamcrest.j r0 = h5.a.j(r0)
            return r0
    }

    boolean f() {
            r1 = this;
            java.util.List<org.hamcrest.j<?>> r0 = r1.a
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }
}
