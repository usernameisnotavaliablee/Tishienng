package com.google.common.math;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class StatsAccumulator {
    private long count;
    private double max;
    private double mean;
    private double min;
    private double sumOfSquaresOfDeltas;

    public StatsAccumulator() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.count = r0
            r0 = 0
            r2.mean = r0
            r2.sumOfSquaresOfDeltas = r0
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r2.min = r0
            r2.max = r0
            return
    }

    static double calculateNewMeanNonFinite(double r1, double r3) {
            boolean r0 = com.google.common.primitives.Doubles.isFinite(r1)
            if (r0 == 0) goto L7
            return r3
        L7:
            boolean r0 = com.google.common.primitives.Doubles.isFinite(r3)
            if (r0 != 0) goto L14
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L12
            goto L14
        L12:
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
        L14:
            return r1
    }

    public void add(double r10) {
            r9 = this;
            long r0 = r9.count
            r2 = 0
            r4 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r6 = 1
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L1d
            r9.count = r6
            r9.mean = r10
            r9.min = r10
            r9.max = r10
            boolean r10 = com.google.common.primitives.Doubles.isFinite(r10)
            if (r10 != 0) goto L1c
            r9.sumOfSquaresOfDeltas = r4
        L1c:
            return
        L1d:
            long r0 = r0 + r6
            r9.count = r0
            boolean r0 = com.google.common.primitives.Doubles.isFinite(r10)
            if (r0 == 0) goto L44
            double r0 = r9.mean
            boolean r0 = com.google.common.primitives.Doubles.isFinite(r0)
            if (r0 == 0) goto L44
            double r0 = r9.mean
            double r2 = r10 - r0
            long r4 = r9.count
            double r4 = (double) r4
            double r4 = r2 / r4
            double r0 = r0 + r4
            r9.mean = r0
            double r4 = r9.sumOfSquaresOfDeltas
            double r0 = r10 - r0
            double r2 = r2 * r0
            double r4 = r4 + r2
            r9.sumOfSquaresOfDeltas = r4
            goto L4e
        L44:
            double r0 = r9.mean
            double r0 = calculateNewMeanNonFinite(r0, r10)
            r9.mean = r0
            r9.sumOfSquaresOfDeltas = r4
        L4e:
            double r0 = r9.min
            double r0 = java.lang.Math.min(r0, r10)
            r9.min = r0
            double r0 = r9.max
            double r10 = java.lang.Math.max(r0, r10)
            r9.max = r10
            return
    }

    public void addAll(com.google.common.math.Stats r11) {
            r10 = this;
            long r0 = r11.count()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            return
        Lb:
            long r0 = r10.count
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L30
            long r0 = r11.count()
            r10.count = r0
            double r0 = r11.mean()
            r10.mean = r0
            double r0 = r11.sumOfSquaresOfDeltas()
            r10.sumOfSquaresOfDeltas = r0
            double r0 = r11.min()
            r10.min = r0
            double r0 = r11.max()
            r10.max = r0
            return
        L30:
            long r2 = r11.count()
            long r0 = r0 + r2
            r10.count = r0
            double r0 = r10.mean
            boolean r0 = com.google.common.primitives.Doubles.isFinite(r0)
            if (r0 == 0) goto L79
            double r0 = r11.mean()
            boolean r0 = com.google.common.primitives.Doubles.isFinite(r0)
            if (r0 == 0) goto L79
            double r0 = r11.mean()
            double r2 = r10.mean
            double r0 = r0 - r2
            long r4 = r11.count()
            double r4 = (double) r4
            double r4 = r4 * r0
            long r6 = r10.count
            double r6 = (double) r6
            double r4 = r4 / r6
            double r2 = r2 + r4
            r10.mean = r2
            double r2 = r10.sumOfSquaresOfDeltas
            double r4 = r11.sumOfSquaresOfDeltas()
            double r6 = r11.mean()
            double r8 = r10.mean
            double r6 = r6 - r8
            double r0 = r0 * r6
            long r6 = r11.count()
            double r6 = (double) r6
            double r0 = r0 * r6
            double r4 = r4 + r0
            double r2 = r2 + r4
            r10.sumOfSquaresOfDeltas = r2
            goto L89
        L79:
            double r0 = r10.mean
            double r2 = r11.mean()
            double r0 = calculateNewMeanNonFinite(r0, r2)
            r10.mean = r0
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r10.sumOfSquaresOfDeltas = r0
        L89:
            double r0 = r10.min
            double r2 = r11.min()
            double r0 = java.lang.Math.min(r0, r2)
            r10.min = r0
            double r0 = r10.max
            double r2 = r11.max()
            double r0 = java.lang.Math.max(r0, r2)
            r10.max = r0
            return
    }

    public void addAll(java.lang.Iterable<? extends java.lang.Number> r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            r2.add(r0)
            goto L4
        L18:
            return
    }

    public void addAll(java.util.Iterator<? extends java.lang.Number> r3) {
            r2 = this;
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            r2.add(r0)
            goto L0
        L14:
            return
    }

    public void addAll(double... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r5[r1]
            r4.add(r2)
            int r1 = r1 + 1
            goto L2
        Lc:
            return
    }

    public void addAll(int... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Ld
            r2 = r5[r1]
            double r2 = (double) r2
            r4.add(r2)
            int r1 = r1 + 1
            goto L2
        Ld:
            return
    }

    public void addAll(long... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Ld
            r2 = r5[r1]
            double r2 = (double) r2
            r4.add(r2)
            int r1 = r1 + 1
            goto L2
        Ld:
            return
    }

    public long count() {
            r2 = this;
            long r0 = r2.count
            return r0
    }

    public double max() {
            r5 = this;
            long r0 = r5.count
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.common.base.Preconditions.checkState(r0)
            double r0 = r5.max
            return r0
    }

    public double mean() {
            r5 = this;
            long r0 = r5.count
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.common.base.Preconditions.checkState(r0)
            double r0 = r5.mean
            return r0
    }

    public double min() {
            r5 = this;
            long r0 = r5.count
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.common.base.Preconditions.checkState(r0)
            double r0 = r5.min
            return r0
    }

    public final double populationStandardDeviation() {
            r2 = this;
            double r0 = r2.populationVariance()
            double r0 = java.lang.Math.sqrt(r0)
            return r0
    }

    public final double populationVariance() {
            r5 = this;
            long r0 = r5.count
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.common.base.Preconditions.checkState(r0)
            double r0 = r5.sumOfSquaresOfDeltas
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 == 0) goto L19
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L19:
            long r0 = r5.count
            r2 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L24
            r0 = 0
            return r0
        L24:
            double r0 = r5.sumOfSquaresOfDeltas
            double r0 = com.google.common.math.DoubleUtils.ensureNonNegative(r0)
            long r2 = r5.count
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    public final double sampleStandardDeviation() {
            r2 = this;
            double r0 = r2.sampleVariance()
            double r0 = java.lang.Math.sqrt(r0)
            return r0
    }

    public final double sampleVariance() {
            r6 = this;
            long r0 = r6.count
            r2 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.common.base.Preconditions.checkState(r0)
            double r0 = r6.sumOfSquaresOfDeltas
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 == 0) goto L19
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L19:
            double r0 = r6.sumOfSquaresOfDeltas
            double r0 = com.google.common.math.DoubleUtils.ensureNonNegative(r0)
            long r4 = r6.count
            long r4 = r4 - r2
            double r2 = (double) r4
            double r0 = r0 / r2
            return r0
    }

    public com.google.common.math.Stats snapshot() {
            r11 = this;
            com.google.common.math.Stats r0 = new com.google.common.math.Stats
            long r1 = r11.count
            double r3 = r11.mean
            double r5 = r11.sumOfSquaresOfDeltas
            double r7 = r11.min
            double r9 = r11.max
            r0.<init>(r1, r3, r5, r7, r9)
            return r0
    }

    public final double sum() {
            r4 = this;
            double r0 = r4.mean
            long r2 = r4.count
            double r2 = (double) r2
            double r0 = r0 * r2
            return r0
    }

    double sumOfSquaresOfDeltas() {
            r2 = this;
            double r0 = r2.sumOfSquaresOfDeltas
            return r0
    }
}
