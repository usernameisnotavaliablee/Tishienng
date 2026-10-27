package org.junit.rules;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class m implements org.junit.rules.l {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends org.junit.runners.model.h {
        final /* synthetic */ org.junit.runner.Description a;
        final /* synthetic */ org.junit.runners.model.h b;
        final /* synthetic */ org.junit.rules.m c;

        a(org.junit.rules.m r1, org.junit.runner.Description r2, org.junit.runners.model.h r3) throws java.lang.Exception {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // org.junit.runners.model.h
        public void a() throws java.lang.Throwable {
                r4 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                org.junit.rules.m r1 = r4.c
                org.junit.runner.Description r2 = r4.a
                org.junit.rules.m.b(r1, r2, r0)
                org.junit.runners.model.h r1 = r4.b     // Catch: java.lang.Throwable -> L20 org.junit.internal.AssumptionViolatedException -> L22
                r1.a()     // Catch: java.lang.Throwable -> L20 org.junit.internal.AssumptionViolatedException -> L22
                org.junit.rules.m r1 = r4.c     // Catch: java.lang.Throwable -> L20 org.junit.internal.AssumptionViolatedException -> L22
                org.junit.runner.Description r2 = r4.a     // Catch: java.lang.Throwable -> L20 org.junit.internal.AssumptionViolatedException -> L22
                org.junit.rules.m.c(r1, r2, r0)     // Catch: java.lang.Throwable -> L20 org.junit.internal.AssumptionViolatedException -> L22
            L18:
                org.junit.rules.m r1 = r4.c
                org.junit.runner.Description r2 = r4.a
                org.junit.rules.m.f(r1, r2, r0)
                goto L3c
            L20:
                r1 = move-exception
                goto L24
            L22:
                r1 = move-exception
                goto L31
            L24:
                r0.add(r1)     // Catch: java.lang.Throwable -> L2f
                org.junit.rules.m r2 = r4.c     // Catch: java.lang.Throwable -> L2f
                org.junit.runner.Description r3 = r4.a     // Catch: java.lang.Throwable -> L2f
                org.junit.rules.m.e(r2, r1, r3, r0)     // Catch: java.lang.Throwable -> L2f
                goto L18
            L2f:
                r1 = move-exception
                goto L40
            L31:
                r0.add(r1)     // Catch: java.lang.Throwable -> L2f
                org.junit.rules.m r2 = r4.c     // Catch: java.lang.Throwable -> L2f
                org.junit.runner.Description r3 = r4.a     // Catch: java.lang.Throwable -> L2f
                org.junit.rules.m.d(r2, r1, r3, r0)     // Catch: java.lang.Throwable -> L2f
                goto L18
            L3c:
                org.junit.runners.model.MultipleFailureException.assertEmpty(r0)
                return
            L40:
                org.junit.rules.m r2 = r4.c
                org.junit.runner.Description r3 = r4.a
                org.junit.rules.m.f(r2, r3, r0)
                throw r1
        }
    }

    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void b(org.junit.rules.m r0, org.junit.runner.Description r1, java.util.List r2) {
            r0.o(r1, r2)
            return
    }

    static /* synthetic */ void c(org.junit.rules.m r0, org.junit.runner.Description r1, java.util.List r2) {
            r0.q(r1, r2)
            return
    }

    static /* synthetic */ void d(org.junit.rules.m r0, org.junit.internal.AssumptionViolatedException r1, org.junit.runner.Description r2, java.util.List r3) {
            r0.m(r1, r2, r3)
            return
    }

    static /* synthetic */ void e(org.junit.rules.m r0, java.lang.Throwable r1, org.junit.runner.Description r2, java.util.List r3) {
            r0.h(r1, r2, r3)
            return
    }

    static /* synthetic */ void f(org.junit.rules.m r0, org.junit.runner.Description r1, java.util.List r2) {
            r0.j(r1, r2)
            return
    }

    private void h(java.lang.Throwable r1, org.junit.runner.Description r2, java.util.List<java.lang.Throwable> r3) {
            r0 = this;
            r0.g(r1, r2)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r1 = move-exception
            r3.add(r1)
            return
    }

    private void j(org.junit.runner.Description r1, java.util.List<java.lang.Throwable> r2) {
            r0 = this;
            r0.i(r1)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r1 = move-exception
            r2.add(r1)
            return
    }

    private void m(org.junit.internal.AssumptionViolatedException r2, org.junit.runner.Description r3, java.util.List<java.lang.Throwable> r4) {
            r1 = this;
            boolean r0 = r2 instanceof org.junit.AssumptionViolatedException     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Lc
            org.junit.AssumptionViolatedException r2 = (org.junit.AssumptionViolatedException) r2     // Catch: java.lang.Throwable -> La
            r1.k(r2, r3)     // Catch: java.lang.Throwable -> La
            return
        La:
            r2 = move-exception
            goto L10
        Lc:
            r1.l(r2, r3)     // Catch: java.lang.Throwable -> La
            return
        L10:
            r4.add(r2)
            return
    }

    private void o(org.junit.runner.Description r1, java.util.List<java.lang.Throwable> r2) {
            r0 = this;
            r0.n(r1)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r1 = move-exception
            r2.add(r1)
            return
    }

    private void q(org.junit.runner.Description r1, java.util.List<java.lang.Throwable> r2) {
            r0 = this;
            r0.p(r1)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r1 = move-exception
            r2.add(r1)
            return
    }

    @Override // org.junit.rules.l
    public org.junit.runners.model.h a(org.junit.runners.model.h r2, org.junit.runner.Description r3) {
            r1 = this;
            org.junit.rules.m$a r0 = new org.junit.rules.m$a
            r0.<init>(r1, r3, r2)
            return r0
    }

    protected void g(java.lang.Throwable r1, org.junit.runner.Description r2) {
            r0 = this;
            return
    }

    protected void i(org.junit.runner.Description r1) {
            r0 = this;
            return
    }

    protected void k(org.junit.AssumptionViolatedException r1, org.junit.runner.Description r2) {
            r0 = this;
            r0.l(r1, r2)
            return
    }

    @java.lang.Deprecated
    protected void l(org.junit.internal.AssumptionViolatedException r1, org.junit.runner.Description r2) {
            r0 = this;
            return
    }

    protected void n(org.junit.runner.Description r1) {
            r0 = this;
            return
    }

    protected void p(org.junit.runner.Description r1) {
            r0 = this;
            return
    }
}
