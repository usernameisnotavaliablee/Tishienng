package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class RateLimiter {

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private volatile java.lang.Object mutexDoNotUseDirectly;
    private final com.google.common.util.concurrent.RateLimiter.SleepingStopwatch stopwatch;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class SleepingStopwatch {


        protected SleepingStopwatch() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.google.common.util.concurrent.RateLimiter.SleepingStopwatch createFromSystemTimer() {
                com.google.common.util.concurrent.RateLimiter$SleepingStopwatch$1 r0 = new com.google.common.util.concurrent.RateLimiter$SleepingStopwatch$1
                r0.<init>()
                return r0
        }

        protected abstract long readMicros();

        protected abstract void sleepMicrosUninterruptibly(long r1);
    }

    RateLimiter(com.google.common.util.concurrent.RateLimiter.SleepingStopwatch r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.util.concurrent.RateLimiter$SleepingStopwatch r1 = (com.google.common.util.concurrent.RateLimiter.SleepingStopwatch) r1
            r0.stopwatch = r1
            return
    }

    private boolean canAcquire(long r3, long r5) {
            r2 = this;
            long r0 = r2.queryEarliestAvailable(r3)
            long r0 = r0 - r5
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto Lb
            r3 = 1
            return r3
        Lb:
            r3 = 0
            return r3
    }

    private static void checkPermits(int r2) {
            if (r2 <= 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.String r1 = "Requested permits (%s) must be positive"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r2)
            return
    }

    public static com.google.common.util.concurrent.RateLimiter create(double r1) {
            com.google.common.util.concurrent.RateLimiter$SleepingStopwatch r0 = com.google.common.util.concurrent.RateLimiter.SleepingStopwatch.createFromSystemTimer()
            com.google.common.util.concurrent.RateLimiter r1 = create(r1, r0)
            return r1
    }

    public static com.google.common.util.concurrent.RateLimiter create(double r10, long r12, java.util.concurrent.TimeUnit r14) {
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            java.lang.String r1 = "warmupPeriod must not be negative: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r12)
            r7 = 4613937818241073152(0x4008000000000000, double:3.0)
            com.google.common.util.concurrent.RateLimiter$SleepingStopwatch r9 = com.google.common.util.concurrent.RateLimiter.SleepingStopwatch.createFromSystemTimer()
            r2 = r10
            r4 = r12
            r6 = r14
            com.google.common.util.concurrent.RateLimiter r10 = create(r2, r4, r6, r7, r9)
            return r10
    }

    @com.google.common.annotations.VisibleForTesting
    static com.google.common.util.concurrent.RateLimiter create(double r7, long r9, java.util.concurrent.TimeUnit r11, double r12, com.google.common.util.concurrent.RateLimiter.SleepingStopwatch r14) {
            com.google.common.util.concurrent.SmoothRateLimiter$SmoothWarmingUp r0 = new com.google.common.util.concurrent.SmoothRateLimiter$SmoothWarmingUp
            r2 = r9
            r4 = r11
            r5 = r12
            r1 = r14
            r0.<init>(r1, r2, r4, r5)
            r0.setRate(r7)
            return r0
    }

    @com.google.common.annotations.VisibleForTesting
    static com.google.common.util.concurrent.RateLimiter create(double r3, com.google.common.util.concurrent.RateLimiter.SleepingStopwatch r5) {
            com.google.common.util.concurrent.SmoothRateLimiter$SmoothBursty r0 = new com.google.common.util.concurrent.SmoothRateLimiter$SmoothBursty
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0.<init>(r5, r1)
            r0.setRate(r3)
            return r0
    }

    private java.lang.Object mutex() {
            r1 = this;
            java.lang.Object r0 = r1.mutexDoNotUseDirectly
            if (r0 != 0) goto L17
            monitor-enter(r1)
            java.lang.Object r0 = r1.mutexDoNotUseDirectly     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L13
            java.lang.Object r0 = new java.lang.Object     // Catch: java.lang.Throwable -> L11
            r0.<init>()     // Catch: java.lang.Throwable -> L11
            r1.mutexDoNotUseDirectly = r0     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r0 = move-exception
            goto L15
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            return r0
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r0
        L17:
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public double acquire() {
            r2 = this;
            r0 = 1
            double r0 = r2.acquire(r0)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public double acquire(int r5) {
            r4 = this;
            long r0 = r4.reserve(r5)
            com.google.common.util.concurrent.RateLimiter$SleepingStopwatch r5 = r4.stopwatch
            r5.sleepMicrosUninterruptibly(r0)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = (double) r0
            double r0 = r0 * r2
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 1
            long r2 = r5.toMicros(r2)
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    abstract double doGetRate();

    abstract void doSetRate(double r1, long r3);

    public final double getRate() {
            r3 = this;
            java.lang.Object r0 = r3.mutex()
            monitor-enter(r0)
            double r1 = r3.doGetRate()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    abstract long queryEarliestAvailable(long r1);

    final long reserve(int r4) {
            r3 = this;
            checkPermits(r4)
            java.lang.Object r0 = r3.mutex()
            monitor-enter(r0)
            com.google.common.util.concurrent.RateLimiter$SleepingStopwatch r1 = r3.stopwatch     // Catch: java.lang.Throwable -> L14
            long r1 = r1.readMicros()     // Catch: java.lang.Throwable -> L14
            long r1 = r3.reserveAndGetWaitLength(r4, r1)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r1
        L14:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
    }

    final long reserveAndGetWaitLength(int r3, long r4) {
            r2 = this;
            long r0 = r2.reserveEarliestAvailable(r3, r4)
            long r0 = r0 - r4
            r3 = 0
            long r3 = java.lang.Math.max(r0, r3)
            return r3
    }

    abstract long reserveEarliestAvailable(int r1, long r2);

    public final void setRate(double r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto Le
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.lang.String r1 = "rate must be positive"
            com.google.common.base.Preconditions.checkArgument(r0, r1)
            java.lang.Object r0 = r3.mutex()
            monitor-enter(r0)
            com.google.common.util.concurrent.RateLimiter$SleepingStopwatch r1 = r3.stopwatch     // Catch: java.lang.Throwable -> L24
            long r1 = r1.readMicros()     // Catch: java.lang.Throwable -> L24
            r3.doSetRate(r4, r1)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r4
    }

    public java.lang.String toString() {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.ROOT
            double r1 = r4.getRate()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "RateLimiter[stableRate=%3.1fqps]"
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
            return r0
    }

    public boolean tryAcquire() {
            r4 = this;
            r0 = 0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MICROSECONDS
            r3 = 1
            boolean r0 = r4.tryAcquire(r3, r0, r2)
            return r0
    }

    public boolean tryAcquire(int r4) {
            r3 = this;
            r0 = 0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MICROSECONDS
            boolean r4 = r3.tryAcquire(r4, r0, r2)
            return r4
    }

    public boolean tryAcquire(int r3, long r4, java.util.concurrent.TimeUnit r6) {
            r2 = this;
            long r4 = r6.toMicros(r4)
            r0 = 0
            long r4 = java.lang.Math.max(r4, r0)
            checkPermits(r3)
            java.lang.Object r6 = r2.mutex()
            monitor-enter(r6)
            com.google.common.util.concurrent.RateLimiter$SleepingStopwatch r0 = r2.stopwatch     // Catch: java.lang.Throwable -> L21
            long r0 = r0.readMicros()     // Catch: java.lang.Throwable -> L21
            boolean r4 = r2.canAcquire(r0, r4)     // Catch: java.lang.Throwable -> L21
            if (r4 != 0) goto L23
            r3 = 0
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L21
            return r3
        L21:
            r3 = move-exception
            goto L2f
        L23:
            long r3 = r2.reserveAndGetWaitLength(r3, r0)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L21
            com.google.common.util.concurrent.RateLimiter$SleepingStopwatch r5 = r2.stopwatch
            r5.sleepMicrosUninterruptibly(r3)
            r3 = 1
            return r3
        L2f:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L21
            throw r3
    }

    public boolean tryAcquire(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            r0 = 1
            boolean r2 = r1.tryAcquire(r0, r2, r4)
            return r2
    }
}
