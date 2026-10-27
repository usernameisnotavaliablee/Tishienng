package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class SmoothRateLimiter extends com.google.common.util.concurrent.RateLimiter {
    double maxPermits;
    private long nextFreeTicketMicros;
    double stableIntervalMicros;
    double storedPermits;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.util.concurrent.SmoothRateLimiter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SmoothBursty extends com.google.common.util.concurrent.SmoothRateLimiter {
        final double maxBurstSeconds;

        SmoothBursty(com.google.common.util.concurrent.RateLimiter.SleepingStopwatch r2, double r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                r1.maxBurstSeconds = r3
                return
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        double coolDownIntervalMicros() {
                r2 = this;
                double r0 = r2.stableIntervalMicros
                return r0
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        void doSetRate(double r4, double r6) {
                r3 = this;
                double r6 = r3.maxPermits
                double r0 = r3.maxBurstSeconds
                double r0 = r0 * r4
                r3.maxPermits = r0
                r4 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
                int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r2 != 0) goto L11
                r3.storedPermits = r0
                return
            L11:
                r4 = 0
                int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r2 != 0) goto L18
                goto L1d
            L18:
                double r4 = r3.storedPermits
                double r4 = r4 * r0
                double r4 = r4 / r6
            L1d:
                r3.storedPermits = r4
                return
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        long storedPermitsToWaitTime(double r1, double r3) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SmoothWarmingUp extends com.google.common.util.concurrent.SmoothRateLimiter {
        private double coldFactor;
        private double slope;
        private double thresholdPermits;
        private final long warmupPeriodMicros;

        SmoothWarmingUp(com.google.common.util.concurrent.RateLimiter.SleepingStopwatch r2, long r3, java.util.concurrent.TimeUnit r5, double r6) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                long r2 = r5.toMicros(r3)
                r1.warmupPeriodMicros = r2
                r1.coldFactor = r6
                return
        }

        private double permitsToTime(double r5) {
                r4 = this;
                double r0 = r4.stableIntervalMicros
                double r2 = r4.slope
                double r5 = r5 * r2
                double r0 = r0 + r5
                return r0
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        double coolDownIntervalMicros() {
                r4 = this;
                long r0 = r4.warmupPeriodMicros
                double r0 = (double) r0
                double r2 = r4.maxPermits
                double r0 = r0 / r2
                return r0
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        void doSetRate(double r9, double r11) {
                r8 = this;
                double r9 = r8.maxPermits
                double r0 = r8.coldFactor
                double r0 = r0 * r11
                long r2 = r8.warmupPeriodMicros
                double r4 = (double) r2
                r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                double r4 = r4 * r6
                double r4 = r4 / r11
                r8.thresholdPermits = r4
                r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r2 = (double) r2
                double r2 = r2 * r6
                double r6 = r11 + r0
                double r2 = r2 / r6
                double r2 = r2 + r4
                r8.maxPermits = r2
                double r0 = r0 - r11
                double r11 = r2 - r4
                double r0 = r0 / r11
                r8.slope = r0
                r11 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
                r0 = 0
                int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r4 != 0) goto L2c
                r8.storedPermits = r0
                return
            L2c:
                int r11 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r11 != 0) goto L31
                goto L37
            L31:
                double r11 = r8.storedPermits
                double r11 = r11 * r2
                double r2 = r11 / r9
            L37:
                r8.storedPermits = r2
                return
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        long storedPermitsToWaitTime(double r5, double r7) {
                r4 = this;
                double r0 = r4.thresholdPermits
                double r5 = r5 - r0
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 <= 0) goto L1f
                double r0 = java.lang.Math.min(r5, r7)
                double r2 = r4.permitsToTime(r5)
                double r5 = r5 - r0
                double r5 = r4.permitsToTime(r5)
                double r2 = r2 + r5
                double r2 = r2 * r0
                r5 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r2 = r2 / r5
                long r5 = (long) r2
                double r7 = r7 - r0
                goto L21
            L1f:
                r5 = 0
            L21:
                double r0 = r4.stableIntervalMicros
                double r0 = r0 * r7
                long r7 = (long) r0
                long r5 = r5 + r7
                return r5
        }
    }

    private SmoothRateLimiter(com.google.common.util.concurrent.RateLimiter.SleepingStopwatch r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 0
            r2.nextFreeTicketMicros = r0
            return
    }

    /* synthetic */ SmoothRateLimiter(com.google.common.util.concurrent.RateLimiter.SleepingStopwatch r1, com.google.common.util.concurrent.SmoothRateLimiter.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    abstract double coolDownIntervalMicros();

    @Override // com.google.common.util.concurrent.RateLimiter
    final double doGetRate() {
            r4 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 1
            long r0 = r0.toMicros(r1)
            double r0 = (double) r0
            double r2 = r4.stableIntervalMicros
            double r0 = r0 / r2
            return r0
    }

    abstract void doSetRate(double r1, double r3);

    @Override // com.google.common.util.concurrent.RateLimiter
    final void doSetRate(double r3, long r5) {
            r2 = this;
            r2.resync(r5)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 1
            long r5 = r5.toMicros(r0)
            double r5 = (double) r5
            double r5 = r5 / r3
            r2.stableIntervalMicros = r5
            r2.doSetRate(r3, r5)
            return
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    final long queryEarliestAvailable(long r1) {
            r0 = this;
            long r1 = r0.nextFreeTicketMicros
            return r1
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    final long reserveEarliestAvailable(int r9, long r10) {
            r8 = this;
            r8.resync(r10)
            long r10 = r8.nextFreeTicketMicros
            double r0 = (double) r9
            double r2 = r8.storedPermits
            double r2 = java.lang.Math.min(r0, r2)
            double r0 = r0 - r2
            double r4 = r8.storedPermits
            long r4 = r8.storedPermitsToWaitTime(r4, r2)
            double r6 = r8.stableIntervalMicros
            double r0 = r0 * r6
            long r0 = (long) r0
            long r4 = r4 + r0
            long r0 = r8.nextFreeTicketMicros
            long r0 = com.google.common.math.LongMath.saturatedAdd(r0, r4)
            r8.nextFreeTicketMicros = r0
            double r0 = r8.storedPermits
            double r0 = r0 - r2
            r8.storedPermits = r0
            return r10
    }

    void resync(long r7) {
            r6 = this;
            long r0 = r6.nextFreeTicketMicros
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1b
            long r0 = r7 - r0
            double r0 = (double) r0
            double r2 = r6.coolDownIntervalMicros()
            double r0 = r0 / r2
            double r2 = r6.maxPermits
            double r4 = r6.storedPermits
            double r4 = r4 + r0
            double r0 = java.lang.Math.min(r2, r4)
            r6.storedPermits = r0
            r6.nextFreeTicketMicros = r7
        L1b:
            return
    }

    abstract long storedPermitsToWaitTime(double r1, double r3);
}
