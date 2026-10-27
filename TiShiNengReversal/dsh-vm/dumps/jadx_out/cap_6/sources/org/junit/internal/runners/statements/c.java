package org.junit.internal.runners.statements;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c extends org.junit.runners.model.h {
    private final org.junit.runners.model.h a;
    private final java.util.concurrent.TimeUnit b;
    private final long c;
    private final boolean d;
    private volatile java.lang.ThreadGroup e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b {
        private boolean a;
        private long b;
        private java.util.concurrent.TimeUnit c;

        private b() {
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

        /* synthetic */ b(org.junit.internal.runners.statements.c.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ long a(org.junit.internal.runners.statements.c.b r2) {
                long r0 = r2.b
                return r0
        }

        static /* synthetic */ java.util.concurrent.TimeUnit b(org.junit.internal.runners.statements.c.b r0) {
                java.util.concurrent.TimeUnit r0 = r0.c
                return r0
        }

        static /* synthetic */ boolean c(org.junit.internal.runners.statements.c.b r0) {
                boolean r0 = r0.a
                return r0
        }

        public org.junit.internal.runners.statements.c d(org.junit.runners.model.h r3) {
                r2 = this;
                if (r3 == 0) goto L9
                org.junit.internal.runners.statements.c r0 = new org.junit.internal.runners.statements.c
                r1 = 0
                r0.<init>(r2, r3, r1)
                return r0
            L9:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r0 = "statement cannot be null"
                r3.<init>(r0)
                throw r3
        }

        public org.junit.internal.runners.statements.c.b e(boolean r1) {
                r0 = this;
                r0.a = r1
                return r0
        }

        public org.junit.internal.runners.statements.c.b f(long r4, java.util.concurrent.TimeUnit r6) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L15
                if (r6 == 0) goto Ld
                r3.b = r4
                r3.c = r6
                return r3
            Ld:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r5 = "TimeUnit cannot be null"
                r4.<init>(r5)
                throw r4
            L15:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "timeout must be non-negative"
                r4.<init>(r5)
                throw r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: org.junit.internal.runners.statements.c$c, reason: collision with other inner class name */
    private class CallableC0080c implements java.util.concurrent.Callable<java.lang.Throwable> {
        private final java.util.concurrent.CountDownLatch a;
        final /* synthetic */ org.junit.internal.runners.statements.c b;

        private CallableC0080c(org.junit.internal.runners.statements.c r2) {
                r1 = this;
                r1.b = r2
                r1.<init>()
                java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
                r0 = 1
                r2.<init>(r0)
                r1.a = r2
                return
        }

        /* synthetic */ CallableC0080c(org.junit.internal.runners.statements.c r1, org.junit.internal.runners.statements.c.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public void a() throws java.lang.InterruptedException {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.a
                r0.await()
                return
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.Throwable call() throws java.lang.Exception {
                r1 = this;
                java.lang.Throwable r0 = r1.call2()
                return r0
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public java.lang.Throwable call2() throws java.lang.Exception {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.a     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L12
                r0.countDown()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L12
                org.junit.internal.runners.statements.c r0 = r1.b     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L12
                org.junit.runners.model.h r0 = org.junit.internal.runners.statements.c.b(r0)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L12
                r0.a()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L12
                r0 = 0
                return r0
            L10:
                r0 = move-exception
                goto L14
            L12:
                r0 = move-exception
                goto L15
            L14:
                return r0
            L15:
                throw r0
        }
    }

    private c(org.junit.internal.runners.statements.c.b r3, org.junit.runners.model.h r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.e = r0
            r2.a = r4
            long r0 = org.junit.internal.runners.statements.c.b.a(r3)
            r2.c = r0
            java.util.concurrent.TimeUnit r4 = org.junit.internal.runners.statements.c.b.b(r3)
            r2.b = r4
            boolean r3 = org.junit.internal.runners.statements.c.b.c(r3)
            r2.d = r3
            return
    }

    /* synthetic */ c(org.junit.internal.runners.statements.c.b r1, org.junit.runners.model.h r2, org.junit.internal.runners.statements.c.a r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @java.lang.Deprecated
    public c(org.junit.runners.model.h r3, long r4) {
            r2 = this;
            org.junit.internal.runners.statements.c$b r0 = c()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            org.junit.internal.runners.statements.c$b r4 = r0.f(r4, r1)
            r2.<init>(r4, r3)
            return
    }

    static /* synthetic */ org.junit.runners.model.h b(org.junit.internal.runners.statements.c r0) {
            org.junit.runners.model.h r0 = r0.a
            return r0
    }

    public static org.junit.internal.runners.statements.c.b c() {
            org.junit.internal.runners.statements.c$b r0 = new org.junit.internal.runners.statements.c$b
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    private java.lang.Thread[] d(java.lang.Thread[] r4, int r5) {
            r3 = this;
            int r0 = r4.length
            int r5 = java.lang.Math.min(r5, r0)
            java.lang.Thread[] r0 = new java.lang.Thread[r5]
            r1 = 0
        L8:
            if (r1 >= r5) goto L11
            r2 = r4[r1]
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L11:
            return r0
    }

    private long e(java.lang.Thread r4) {
            r3 = this;
            java.lang.management.ThreadMXBean r0 = java.lang.management.ManagementFactory.getThreadMXBean()
            boolean r1 = r0.isThreadCpuTimeSupported()
            if (r1 == 0) goto L13
            long r1 = r4.getId()     // Catch: java.lang.UnsupportedOperationException -> L13
            long r0 = r0.getThreadCpuTime(r1)     // Catch: java.lang.UnsupportedOperationException -> L13
            return r0
        L13:
            r0 = 0
            return r0
    }

    private java.lang.Exception f(java.lang.Thread r7) {
            r6 = this;
            java.lang.StackTraceElement[] r0 = r7.getStackTrace()
            boolean r1 = r6.d
            if (r1 == 0) goto Ld
            java.lang.Thread r1 = r6.i(r7)
            goto Le
        Ld:
            r1 = 0
        Le:
            org.junit.runners.model.TestTimedOutException r2 = new org.junit.runners.model.TestTimedOutException
            long r3 = r6.c
            java.util.concurrent.TimeUnit r5 = r6.b
            r2.<init>(r3, r5)
            if (r0 == 0) goto L1f
            r2.setStackTrace(r0)
            r7.interrupt()
        L1f:
            if (r1 == 0) goto L55
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Appears to be stuck in thread "
            r0.append(r3)
            java.lang.String r3 = r1.getName()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            java.lang.StackTraceElement[] r0 = r6.h(r1)
            r7.setStackTrace(r0)
            org.junit.runners.model.MultipleFailureException r0 = new org.junit.runners.model.MultipleFailureException
            r1 = 2
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r7
            java.util.List r7 = java.util.Arrays.asList(r1)
            r0.<init>(r7)
            return r0
        L55:
            return r2
    }

    private java.lang.Throwable g(java.util.concurrent.FutureTask<java.lang.Throwable> r6, java.lang.Thread r7) {
            r5 = this;
            long r0 = r5.c     // Catch: java.util.concurrent.ExecutionException -> L11 java.lang.InterruptedException -> L13 java.util.concurrent.TimeoutException -> L1c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L15
            java.util.concurrent.TimeUnit r2 = r5.b     // Catch: java.util.concurrent.ExecutionException -> L11 java.lang.InterruptedException -> L13 java.util.concurrent.TimeoutException -> L1c
            java.lang.Object r6 = r6.get(r0, r2)     // Catch: java.util.concurrent.ExecutionException -> L11 java.lang.InterruptedException -> L13 java.util.concurrent.TimeoutException -> L1c
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch: java.util.concurrent.ExecutionException -> L11 java.lang.InterruptedException -> L13 java.util.concurrent.TimeoutException -> L1c
            return r6
        L11:
            r6 = move-exception
            goto L21
        L13:
            r6 = move-exception
            goto L25
        L15:
            java.lang.Object r6 = r6.get()     // Catch: java.util.concurrent.ExecutionException -> L11 java.lang.InterruptedException -> L13 java.util.concurrent.TimeoutException -> L1c
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch: java.util.concurrent.ExecutionException -> L11 java.lang.InterruptedException -> L13 java.util.concurrent.TimeoutException -> L1c
            return r6
        L1c:
            java.lang.Exception r6 = r5.f(r7)
            return r6
        L21:
            java.lang.Throwable r6 = r6.getCause()
        L25:
            return r6
    }

    private java.lang.StackTraceElement[] h(java.lang.Thread r1) {
            r0 = this;
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()     // Catch: java.lang.SecurityException -> L5
            return r1
        L5:
            r1 = 0
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            return r1
    }

    private java.lang.Thread i(java.lang.Thread r12) {
            r11 = this;
            java.lang.ThreadGroup r0 = r11.e
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.ThreadGroup r0 = r11.e
            java.lang.Thread[] r0 = r11.j(r0)
            if (r0 != 0) goto Lf
            return r1
        Lf:
            int r2 = r0.length
            r3 = 0
            r5 = 0
            r6 = r1
        L14:
            if (r5 >= r2) goto L2f
            r7 = r0[r5]
            java.lang.Thread$State r8 = r7.getState()
            java.lang.Thread$State r9 = java.lang.Thread.State.RUNNABLE
            if (r8 != r9) goto L2c
            long r8 = r11.e(r7)
            if (r6 == 0) goto L2a
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 <= 0) goto L2c
        L2a:
            r6 = r7
            r3 = r8
        L2c:
            int r5 = r5 + 1
            goto L14
        L2f:
            if (r6 != r12) goto L32
            return r1
        L32:
            return r6
    }

    private java.lang.Thread[] j(java.lang.ThreadGroup r5) {
            r4 = this;
            int r0 = r5.activeCount()
            int r0 = r0 * 2
            r1 = 100
            int r0 = java.lang.Math.max(r0, r1)
            r1 = 0
        Ld:
            java.lang.Thread[] r2 = new java.lang.Thread[r0]
            int r3 = r5.enumerate(r2)
            if (r3 >= r0) goto L1a
            java.lang.Thread[] r5 = r4.d(r2, r3)
            return r5
        L1a:
            int r0 = r0 + 100
            int r1 = r1 + 1
            r2 = 5
            if (r1 < r2) goto Ld
            r5 = 0
            return r5
    }

    @Override // org.junit.runners.model.h
    public void a() throws java.lang.Throwable {
            r5 = this;
            org.junit.internal.runners.statements.c$c r0 = new org.junit.internal.runners.statements.c$c
            r1 = 0
            r0.<init>(r5, r1)
            java.util.concurrent.FutureTask r1 = new java.util.concurrent.FutureTask
            r1.<init>(r0)
            java.lang.ThreadGroup r2 = new java.lang.ThreadGroup
            java.lang.String r3 = "FailOnTimeoutGroup"
            r2.<init>(r3)
            r5.e = r2
            java.lang.Thread r2 = new java.lang.Thread
            java.lang.ThreadGroup r3 = r5.e
            java.lang.String r4 = "Time-limited test"
            r2.<init>(r3, r1, r4)
            r3 = 1
            r2.setDaemon(r3)
            r2.start()
            r0.a()
            java.lang.Throwable r0 = r5.g(r1, r2)
            if (r0 != 0) goto L2e
            return
        L2e:
            throw r0
    }
}
