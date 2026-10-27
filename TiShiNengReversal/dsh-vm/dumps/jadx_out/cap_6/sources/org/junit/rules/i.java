package org.junit.rules;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class i implements org.junit.rules.l {
    private final org.junit.rules.i.b a;
    private volatile long b;
    private volatile long c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        public long a() {
                r2 = this;
                long r0 = java.lang.System.nanoTime()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c extends org.junit.rules.m {
        final /* synthetic */ org.junit.rules.i a;

        private c(org.junit.rules.i r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ c(org.junit.rules.i r1, org.junit.rules.i.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // org.junit.rules.m
        protected void g(java.lang.Throwable r4, org.junit.runner.Description r5) {
                r3 = this;
                org.junit.rules.i r0 = r3.a
                org.junit.rules.i.d(r0)
                org.junit.rules.i r0 = r3.a
                long r1 = org.junit.rules.i.c(r0)
                r0.e(r1, r4, r5)
                return
        }

        @Override // org.junit.rules.m
        protected void i(org.junit.runner.Description r4) {
                r3 = this;
                org.junit.rules.i r0 = r3.a
                long r1 = org.junit.rules.i.c(r0)
                r0.f(r1, r4)
                return
        }

        @Override // org.junit.rules.m
        protected void k(org.junit.AssumptionViolatedException r4, org.junit.runner.Description r5) {
                r3 = this;
                org.junit.rules.i r0 = r3.a
                org.junit.rules.i.d(r0)
                org.junit.rules.i r0 = r3.a
                long r1 = org.junit.rules.i.c(r0)
                r0.i(r1, r4, r5)
                return
        }

        @Override // org.junit.rules.m
        protected void n(org.junit.runner.Description r1) {
                r0 = this;
                org.junit.rules.i r1 = r0.a
                org.junit.rules.i.b(r1)
                return
        }

        @Override // org.junit.rules.m
        protected void p(org.junit.runner.Description r4) {
                r3 = this;
                org.junit.rules.i r0 = r3.a
                org.junit.rules.i.d(r0)
                org.junit.rules.i r0 = r3.a
                long r1 = org.junit.rules.i.c(r0)
                r0.l(r1, r4)
                return
        }
    }

    public i() {
            r1 = this;
            org.junit.rules.i$b r0 = new org.junit.rules.i$b
            r0.<init>()
            r1.<init>(r0)
            return
    }

    i(org.junit.rules.i.b r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    static /* synthetic */ void b(org.junit.rules.i r0) {
            r0.j()
            return
    }

    static /* synthetic */ long c(org.junit.rules.i r2) {
            long r0 = r2.g()
            return r0
    }

    static /* synthetic */ void d(org.junit.rules.i r0) {
            r0.k()
            return
    }

    private long g() {
            r5 = this;
            long r0 = r5.b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L18
            long r0 = r5.c
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L14
            org.junit.rules.i$b r0 = r5.a
            long r0 = r0.a()
        L14:
            long r2 = r5.b
            long r0 = r0 - r2
            return r0
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Test has not started"
            r0.<init>(r1)
            throw r0
    }

    private void j() {
            r2 = this;
            org.junit.rules.i$b r0 = r2.a
            long r0 = r0.a()
            r2.b = r0
            r0 = 0
            r2.c = r0
            return
    }

    private void k() {
            r2 = this;
            org.junit.rules.i$b r0 = r2.a
            long r0 = r0.a()
            r2.c = r0
            return
    }

    @Override // org.junit.rules.l
    public final org.junit.runners.model.h a(org.junit.runners.model.h r3, org.junit.runner.Description r4) {
            r2 = this;
            org.junit.rules.i$c r0 = new org.junit.rules.i$c
            r1 = 0
            r0.<init>(r2, r1)
            org.junit.runners.model.h r3 = r0.a(r3, r4)
            return r3
    }

    protected void e(long r1, java.lang.Throwable r3, org.junit.runner.Description r4) {
            r0 = this;
            return
    }

    protected void f(long r1, org.junit.runner.Description r3) {
            r0 = this;
            return
    }

    public long h(java.util.concurrent.TimeUnit r4) {
            r3 = this;
            long r0 = r3.g()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r4.convert(r0, r2)
            return r0
    }

    protected void i(long r1, org.junit.AssumptionViolatedException r3, org.junit.runner.Description r4) {
            r0 = this;
            return
    }

    protected void l(long r1, org.junit.runner.Description r3) {
            r0 = this;
            return
    }
}
