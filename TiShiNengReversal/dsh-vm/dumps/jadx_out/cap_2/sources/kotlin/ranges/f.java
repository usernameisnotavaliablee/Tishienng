package kotlin.ranges;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class f implements kotlin.ranges.g<java.lang.Float> {
    private final float a;
    private final float b;

    public f(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean a(java.lang.Float r1, java.lang.Float r2) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            boolean r1 = r0.e(r1, r2)
            return r1
    }

    public boolean b(float r2) {
            r1 = this;
            float r0 = r1.a
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto Le
            float r0 = r1.b
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Float c() {
            r1 = this;
            float r0 = r1.b
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    @Override // kotlin.ranges.g, kotlin.ranges.h, kotlin.ranges.s
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable r1) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            boolean r1 = r0.b(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Float d() {
            r1 = this;
            float r0 = r1.a
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    public boolean e(float r1, float r2) {
            r0 = this;
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ranges.f
            if (r0 == 0) goto L27
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            kotlin.ranges.f r0 = (kotlin.ranges.f) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
        L13:
            float r0 = r2.a
            kotlin.ranges.f r3 = (kotlin.ranges.f) r3
            float r1 = r3.a
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L27
            float r0 = r2.b
            float r3 = r3.b
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L27
        L25:
            r3 = 1
            return r3
        L27:
            r3 = 0
            return r3
    }

    @Override // kotlin.ranges.h
    public /* bridge */ /* synthetic */ java.lang.Comparable getEndInclusive() {
            r1 = this;
            java.lang.Float r0 = r1.c()
            return r0
    }

    @Override // kotlin.ranges.h, kotlin.ranges.s
    public /* bridge */ /* synthetic */ java.lang.Comparable getStart() {
            r1 = this;
            java.lang.Float r0 = r1.d()
            return r0
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            return r0
        L8:
            float r0 = r2.a
            int r0 = java.lang.Float.floatToIntBits(r0)
            int r0 = r0 * 31
            float r1 = r2.b
            int r1 = java.lang.Float.floatToIntBits(r1)
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.ranges.g, kotlin.ranges.h, kotlin.ranges.s
    public boolean isEmpty() {
            r2 = this;
            float r0 = r2.a
            float r1 = r2.b
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            float r1 = r2.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
