package org.junit.experimental;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a extends org.junit.runner.a {
    private final boolean a;
    private final boolean b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: org.junit.experimental.a$a, reason: collision with other inner class name */
    static class C0071a implements org.junit.runners.model.g {
        private final java.util.concurrent.ExecutorService a;

        C0071a() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
                r1.a = r0
                return
        }

        @Override // org.junit.runners.model.g
        public void a(java.lang.Runnable r2) {
                r1 = this;
                java.util.concurrent.ExecutorService r0 = r1.a
                r0.submit(r2)
                return
        }

        @Override // org.junit.runners.model.g
        public void b() {
                r4 = this;
                java.util.concurrent.ExecutorService r0 = r4.a     // Catch: java.lang.InterruptedException -> L11
                r0.shutdown()     // Catch: java.lang.InterruptedException -> L11
                java.util.concurrent.ExecutorService r0 = r4.a     // Catch: java.lang.InterruptedException -> L11
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L11
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.awaitTermination(r2, r1)     // Catch: java.lang.InterruptedException -> L11
            L11:
                return
        }
    }

    public a(boolean r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static org.junit.runner.a d() {
            org.junit.experimental.a r0 = new org.junit.experimental.a
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static org.junit.runner.a e() {
            org.junit.experimental.a r0 = new org.junit.experimental.a
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2)
            return r0
    }

    private static org.junit.runner.g f(org.junit.runner.g r2) {
            boolean r0 = r2 instanceof org.junit.runners.d
            if (r0 == 0) goto Lf
            r0 = r2
            org.junit.runners.d r0 = (org.junit.runners.d) r0
            org.junit.experimental.a$a r1 = new org.junit.experimental.a$a
            r1.<init>()
            r0.x(r1)
        Lf:
            return r2
    }

    @Override // org.junit.runner.a
    protected org.junit.runner.g a(org.junit.runners.model.f r1, java.lang.Class<?> r2) throws java.lang.Throwable {
            r0 = this;
            org.junit.runner.g r1 = super.a(r1, r2)
            boolean r2 = r0.b
            if (r2 == 0) goto Lc
            org.junit.runner.g r1 = f(r1)
        Lc:
            return r1
    }

    @Override // org.junit.runner.a
    public org.junit.runner.g b(org.junit.runners.model.f r1, java.lang.Class<?>[] r2) throws org.junit.runners.model.InitializationError {
            r0 = this;
            org.junit.runner.g r1 = super.b(r1, r2)
            boolean r2 = r0.a
            if (r2 == 0) goto Lc
            org.junit.runner.g r1 = f(r1)
        Lc:
            return r1
    }
}
