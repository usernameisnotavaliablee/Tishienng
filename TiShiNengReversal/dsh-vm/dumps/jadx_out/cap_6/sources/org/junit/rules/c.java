package org.junit.rules;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c implements org.junit.rules.l {
    private final org.junit.rules.d a;
    private java.lang.String b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a extends org.junit.runners.model.h {
        private final org.junit.runners.model.h a;
        final /* synthetic */ org.junit.rules.c b;

        public a(org.junit.rules.c r1, org.junit.runners.model.h r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        @Override // org.junit.runners.model.h
        public void a() throws java.lang.Throwable {
                r2 = this;
                org.junit.runners.model.h r0 = r2.a     // Catch: java.lang.Throwable -> L13
                r0.a()     // Catch: java.lang.Throwable -> L13
                org.junit.rules.c r0 = r2.b
                boolean r0 = org.junit.rules.c.c(r0)
                if (r0 == 0) goto L12
                org.junit.rules.c r0 = r2.b
                org.junit.rules.c.d(r0)
            L12:
                return
            L13:
                r0 = move-exception
                org.junit.rules.c r1 = r2.b
                org.junit.rules.c.b(r1, r0)
                return
        }
    }

    private c() {
            r1 = this;
            r1.<init>()
            org.junit.rules.d r0 = new org.junit.rules.d
            r0.<init>()
            r1.a = r0
            java.lang.String r0 = "Expected test to throw %s"
            r1.b = r0
            return
    }

    static /* synthetic */ void b(org.junit.rules.c r0, java.lang.Throwable r1) throws java.lang.Throwable {
            r0.m(r1)
            return
    }

    static /* synthetic */ boolean c(org.junit.rules.c r0) {
            boolean r0 = r0.n()
            return r0
    }

    static /* synthetic */ void d(org.junit.rules.c r0) throws java.lang.AssertionError {
            r0.j()
            return
    }

    private void j() throws java.lang.AssertionError {
            r1 = this;
            java.lang.String r0 = r1.o()
            org.junit.a.d0(r0)
            return
    }

    private void m(java.lang.Throwable r2) throws java.lang.Throwable {
            r1 = this;
            boolean r0 = r1.n()
            if (r0 == 0) goto L10
            org.junit.rules.d r0 = r1.a
            org.hamcrest.j r0 = r0.c()
            org.junit.a.W(r2, r0)
            return
        L10:
            throw r2
    }

    private boolean n() {
            r1 = this;
            org.junit.rules.d r0 = r1.a
            boolean r0 = r0.f()
            return r0
    }

    private java.lang.String o() {
            r4 = this;
            org.junit.rules.d r0 = r4.a
            org.hamcrest.j r0 = r0.c()
            java.lang.String r0 = org.hamcrest.m.o(r0)
            java.lang.String r1 = r4.b
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = java.lang.String.format(r1, r2)
            return r0
    }

    public static org.junit.rules.c p() {
            org.junit.rules.c r0 = new org.junit.rules.c
            r0.<init>()
            return r0
    }

    @Override // org.junit.rules.l
    public org.junit.runners.model.h a(org.junit.runners.model.h r1, org.junit.runner.Description r2) {
            r0 = this;
            org.junit.rules.c$a r2 = new org.junit.rules.c$a
            r2.<init>(r0, r1)
            return r2
    }

    public void e(java.lang.Class<? extends java.lang.Throwable> r1) {
            r0 = this;
            org.hamcrest.j r1 = org.hamcrest.d.C(r1)
            r0.f(r1)
            return
    }

    public void f(org.hamcrest.j<?> r2) {
            r1 = this;
            org.junit.rules.d r0 = r1.a
            r0.a(r2)
            return
    }

    public void g(org.hamcrest.j<? extends java.lang.Throwable> r1) {
            r0 = this;
            org.hamcrest.j r1 = org.junit.internal.matchers.b.g(r1)
            r0.f(r1)
            return
    }

    public void h(java.lang.String r1) {
            r0 = this;
            org.hamcrest.j r1 = org.hamcrest.d.s(r1)
            r0.i(r1)
            return
    }

    public void i(org.hamcrest.j<java.lang.String> r1) {
            r0 = this;
            org.hamcrest.j r1 = org.junit.internal.matchers.c.g(r1)
            r0.f(r1)
            return
    }

    @java.lang.Deprecated
    public org.junit.rules.c k() {
            r0 = this;
            return r0
    }

    @java.lang.Deprecated
    public org.junit.rules.c l() {
            r0 = this;
            return r0
    }

    public org.junit.rules.c q(java.lang.String r1) {
            r0 = this;
            r0.b = r1
            return r0
    }
}
