package org.junit.rules;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class o implements org.junit.rules.l {
    private final long a;
    private final java.util.concurrent.TimeUnit b;
    private final boolean c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends org.junit.runners.model.h {
        final /* synthetic */ java.lang.Exception a;
        final /* synthetic */ org.junit.rules.o b;

        a(org.junit.rules.o r1, java.lang.Exception r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // org.junit.runners.model.h
        public void a() throws java.lang.Throwable {
                r3 = this;
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "Invalid parameters for Timeout"
                java.lang.Exception r2 = r3.a
                r0.<init>(r1, r2)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b {
        private boolean a;
        private long b;
        private java.util.concurrent.TimeUnit c;

        protected b() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.a = r0
                r0 = 0
                r2.b = r0
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
                r2.c = r0
                return
        }

        public org.junit.rules.o a() {
                r1 = this;
                org.junit.rules.o r0 = new org.junit.rules.o
                r0.<init>(r1)
                return r0
        }

        protected boolean b() {
                r1 = this;
                boolean r0 = r1.a
                return r0
        }

        protected java.util.concurrent.TimeUnit c() {
                r1 = this;
                java.util.concurrent.TimeUnit r0 = r1.c
                return r0
        }

        protected long d() {
                r2 = this;
                long r0 = r2.b
                return r0
        }

        public org.junit.rules.o.b e(boolean r1) {
                r0 = this;
                r0.a = r1
                return r0
        }

        public org.junit.rules.o.b f(long r1, java.util.concurrent.TimeUnit r3) {
                r0 = this;
                r0.b = r1
                r0.c = r3
                return r0
        }
    }

    @java.lang.Deprecated
    public o(int r3) {
            r2 = this;
            long r0 = (long) r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2.<init>(r0, r3)
            return
    }

    public o(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r1 = 0
            r0.c = r1
            return
    }

    protected o(org.junit.rules.o.b r3) {
            r2 = this;
            r2.<init>()
            long r0 = r3.d()
            r2.a = r0
            java.util.concurrent.TimeUnit r0 = r3.c()
            r2.b = r0
            boolean r3 = r3.b()
            r2.c = r3
            return
    }

    public static org.junit.rules.o.b b() {
            org.junit.rules.o$b r0 = new org.junit.rules.o$b
            r0.<init>()
            return r0
    }

    public static org.junit.rules.o f(long r2) {
            org.junit.rules.o r0 = new org.junit.rules.o
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.<init>(r2, r1)
            return r0
    }

    public static org.junit.rules.o g(long r2) {
            org.junit.rules.o r0 = new org.junit.rules.o
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r0.<init>(r2, r1)
            return r0
    }

    @Override // org.junit.rules.l
    public org.junit.runners.model.h a(org.junit.runners.model.h r1, org.junit.runner.Description r2) {
            r0 = this;
            org.junit.runners.model.h r1 = r0.c(r1)     // Catch: java.lang.Exception -> L5
            return r1
        L5:
            r1 = move-exception
            org.junit.rules.o$a r2 = new org.junit.rules.o$a
            r2.<init>(r0, r1)
            return r2
    }

    protected org.junit.runners.model.h c(org.junit.runners.model.h r5) throws java.lang.Exception {
            r4 = this;
            org.junit.internal.runners.statements.c$b r0 = org.junit.internal.runners.statements.c.c()
            long r1 = r4.a
            java.util.concurrent.TimeUnit r3 = r4.b
            org.junit.internal.runners.statements.c$b r0 = r0.f(r1, r3)
            boolean r1 = r4.c
            org.junit.internal.runners.statements.c$b r0 = r0.e(r1)
            org.junit.internal.runners.statements.c r5 = r0.d(r5)
            return r5
    }

    protected final boolean d() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    protected final long e(java.util.concurrent.TimeUnit r4) {
            r3 = this;
            long r0 = r3.a
            java.util.concurrent.TimeUnit r2 = r3.b
            long r0 = r4.convert(r0, r2)
            return r0
    }
}
