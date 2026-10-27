package kotlin.ranges;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p extends kotlin.ranges.n implements kotlin.ranges.h<java.lang.Long>, kotlin.ranges.s<java.lang.Long> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.p.a e = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.ranges.p f = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.ranges.p a() {
                r1 = this;
                kotlin.ranges.p r0 = kotlin.ranges.p.m()
                return r0
        }
    }

    static {
            kotlin.ranges.p$a r0 = new kotlin.ranges.p$a
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.p.e = r0
            kotlin.ranges.p r0 = new kotlin.ranges.p
            r1 = 1
            r3 = 0
            r0.<init>(r1, r3)
            kotlin.ranges.p.f = r0
            return
    }

    public p(long r8, long r10) {
            r7 = this;
            r5 = 1
            r0 = r7
            r1 = r8
            r3 = r10
            r0.<init>(r1, r3, r5)
            return
    }

    public static final /* synthetic */ kotlin.ranges.p m() {
            kotlin.ranges.p r0 = kotlin.ranges.p.f
            return r0
    }

    @kotlin.Deprecated(message = "Can throw an exception when it's impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static /* synthetic */ void p() {
            return
    }

    @Override // kotlin.ranges.h, kotlin.ranges.s
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable r3) {
            r2 = this;
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            boolean r3 = r2.n(r0)
            return r3
    }

    @Override // kotlin.ranges.s
    public /* bridge */ /* synthetic */ java.lang.Long d() {
            r1 = this;
            java.lang.Long r0 = r1.o()
            return r0
    }

    @Override // kotlin.ranges.n
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof kotlin.ranges.p
            if (r0 == 0) goto L2f
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L13
            r0 = r6
            kotlin.ranges.p r0 = (kotlin.ranges.p) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2d
        L13:
            long r0 = r5.e()
            kotlin.ranges.p r6 = (kotlin.ranges.p) r6
            long r2 = r6.e()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2f
            long r0 = r5.f()
            long r2 = r6.f()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L2f
        L2d:
            r6 = 1
            return r6
        L2f:
            r6 = 0
            return r6
    }

    @Override // kotlin.ranges.h
    public /* bridge */ /* synthetic */ java.lang.Long getEndInclusive() {
            r1 = this;
            java.lang.Long r0 = r1.q()
            return r0
    }

    @Override // kotlin.ranges.h, kotlin.ranges.s
    public /* bridge */ /* synthetic */ java.lang.Comparable getStart() {
            r1 = this;
            java.lang.Long r0 = r1.r()
            return r0
    }

    @Override // kotlin.ranges.n
    public int hashCode() {
            r7 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            return r0
        L8:
            r0 = 31
            long r0 = (long) r0
            long r2 = r7.e()
            long r4 = r7.e()
            r6 = 32
            long r4 = r4 >>> r6
            long r2 = r2 ^ r4
            long r0 = r0 * r2
            long r2 = r7.f()
            long r4 = r7.f()
            long r4 = r4 >>> r6
            long r2 = r2 ^ r4
            long r0 = r0 + r2
            int r1 = (int) r0
            return r1
    }

    @Override // kotlin.ranges.n, kotlin.ranges.h, kotlin.ranges.s
    public boolean isEmpty() {
            r5 = this;
            long r0 = r5.e()
            long r2 = r5.f()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public boolean n(long r4) {
            r3 = this;
            long r0 = r3.e()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L12
            long r0 = r3.f()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L12
            r4 = 1
            return r4
        L12:
            r4 = 0
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Long o() {
            r5 = this;
            long r0 = r5.f()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L19
            long r0 = r5.f()
            r2 = 1
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot return the exclusive upper bound of a range that includes MAX_VALUE."
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Long q() {
            r2 = this;
            long r0 = r2.f()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Long r() {
            r2 = this;
            long r0 = r2.e()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    @Override // kotlin.ranges.n
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r3.e()
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            long r1 = r3.f()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
