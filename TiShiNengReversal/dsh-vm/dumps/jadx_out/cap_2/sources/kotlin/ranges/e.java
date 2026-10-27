package kotlin.ranges;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class e implements kotlin.ranges.g<java.lang.Double> {
    private final double a;
    private final double b;

    public e(double r1, double r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            return
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean a(java.lang.Double r3, java.lang.Double r4) {
            r2 = this;
            java.lang.Number r3 = (java.lang.Number) r3
            double r0 = r3.doubleValue()
            java.lang.Number r4 = (java.lang.Number) r4
            double r3 = r4.doubleValue()
            boolean r3 = r2.e(r0, r3)
            return r3
    }

    public boolean b(double r4) {
            r3 = this;
            double r0 = r3.a
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto Le
            double r0 = r3.b
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto Le
            r4 = 1
            return r4
        Le:
            r4 = 0
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Double c() {
            r2 = this;
            double r0 = r2.b
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    @Override // kotlin.ranges.g, kotlin.ranges.h, kotlin.ranges.s
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable r3) {
            r2 = this;
            java.lang.Number r3 = (java.lang.Number) r3
            double r0 = r3.doubleValue()
            boolean r3 = r2.b(r0)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Double d() {
            r2 = this;
            double r0 = r2.a
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    public boolean e(double r2, double r4) {
            r1 = this;
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L6
            r2 = 1
            return r2
        L6:
            r2 = 0
            return r2
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof kotlin.ranges.e
            if (r0 == 0) goto L27
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L13
            r0 = r6
            kotlin.ranges.e r0 = (kotlin.ranges.e) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
        L13:
            double r0 = r5.a
            kotlin.ranges.e r6 = (kotlin.ranges.e) r6
            double r2 = r6.a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L27
            double r0 = r5.b
            double r2 = r6.b
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L27
        L25:
            r6 = 1
            return r6
        L27:
            r6 = 0
            return r6
    }

    @Override // kotlin.ranges.h
    public /* bridge */ /* synthetic */ java.lang.Comparable getEndInclusive() {
            r1 = this;
            java.lang.Double r0 = r1.c()
            return r0
    }

    @Override // kotlin.ranges.h, kotlin.ranges.s
    public /* bridge */ /* synthetic */ java.lang.Comparable getStart() {
            r1 = this;
            java.lang.Double r0 = r1.d()
            return r0
    }

    public int hashCode() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            return r0
        L8:
            double r0 = r3.a
            int r0 = kotlin.ranges.d.a(r0)
            int r0 = r0 * 31
            double r1 = r3.b
            int r1 = kotlin.ranges.d.a(r1)
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.ranges.g, kotlin.ranges.h, kotlin.ranges.s
    public boolean isEmpty() {
            r5 = this;
            double r0 = r5.a
            double r2 = r5.b
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            double r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            double r1 = r3.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
