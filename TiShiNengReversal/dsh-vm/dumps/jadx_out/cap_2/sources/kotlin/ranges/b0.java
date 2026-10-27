package kotlin.ranges;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.5")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b0 extends kotlin.ranges.z implements kotlin.ranges.h<kotlin.d1>, kotlin.ranges.s<kotlin.d1> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.b0.a e = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.ranges.b0 f = null;

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
        public final kotlin.ranges.b0 a() {
                r1 = this;
                kotlin.ranges.b0 r0 = kotlin.ranges.b0.j()
                return r0
        }
    }

    static {
            kotlin.ranges.b0$a r0 = new kotlin.ranges.b0$a
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.b0.e = r0
            kotlin.ranges.b0 r2 = new kotlin.ranges.b0
            r5 = 0
            r7 = 0
            r3 = -1
            r2.<init>(r3, r5, r7)
            kotlin.ranges.b0.f = r2
            return
    }

    private b0(long r9, long r11) {
            r8 = this;
            r5 = 1
            r7 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r0.<init>(r1, r3, r5, r7)
            return
    }

    public /* synthetic */ b0(long r1, long r3, kotlin.jvm.internal.v r5) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    public static final /* synthetic */ kotlin.ranges.b0 j() {
            kotlin.ranges.b0 r0 = kotlin.ranges.b0.f
            return r0
    }

    @kotlin.Deprecated(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static /* synthetic */ void o() {
            return
    }

    @Override // kotlin.ranges.h, kotlin.ranges.s
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable r3) {
            r2 = this;
            kotlin.d1 r3 = (kotlin.d1) r3
            long r0 = r3.q0()
            boolean r3 = r2.m(r0)
            return r3
    }

    @Override // kotlin.ranges.s
    public /* bridge */ /* synthetic */ kotlin.d1 d() {
            r2 = this;
            long r0 = r2.n()
            kotlin.d1 r0 = kotlin.d1.b(r0)
            return r0
    }

    @Override // kotlin.ranges.z
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof kotlin.ranges.b0
            if (r0 == 0) goto L2f
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L13
            r0 = r6
            kotlin.ranges.b0 r0 = (kotlin.ranges.b0) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2d
        L13:
            long r0 = r5.e()
            kotlin.ranges.b0 r6 = (kotlin.ranges.b0) r6
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
    public /* bridge */ /* synthetic */ kotlin.d1 getEndInclusive() {
            r2 = this;
            long r0 = r2.p()
            kotlin.d1 r0 = kotlin.d1.b(r0)
            return r0
    }

    @Override // kotlin.ranges.h, kotlin.ranges.s
    public /* bridge */ /* synthetic */ java.lang.Comparable getStart() {
            r2 = this;
            long r0 = r2.q()
            kotlin.d1 r0 = kotlin.d1.b(r0)
            return r0
    }

    @Override // kotlin.ranges.z
    public int hashCode() {
            r7 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            return r0
        L8:
            long r0 = r7.e()
            long r2 = r7.e()
            r4 = 32
            long r2 = r2 >>> r4
            long r2 = kotlin.d1.k(r2)
            long r0 = r0 ^ r2
            long r0 = kotlin.d1.k(r0)
            int r1 = (int) r0
            int r1 = r1 * 31
            long r2 = r7.f()
            long r5 = r7.f()
            long r4 = r5 >>> r4
            long r4 = kotlin.d1.k(r4)
            long r2 = r2 ^ r4
            long r2 = kotlin.d1.k(r2)
            int r0 = (int) r2
            int r1 = r1 + r0
            return r1
    }

    @Override // kotlin.ranges.z, kotlin.ranges.h, kotlin.ranges.s
    public boolean isEmpty() {
            r4 = this;
            long r0 = r4.e()
            long r2 = r4.f()
            int r0 = androidx.collection.a.a(r0, r2)
            if (r0 <= 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public boolean m(long r3) {
            r2 = this;
            long r0 = r2.e()
            int r0 = androidx.collection.a.a(r0, r3)
            if (r0 > 0) goto L16
            long r0 = r2.f()
            int r3 = androidx.collection.a.a(r3, r0)
            if (r3 > 0) goto L16
            r3 = 1
            return r3
        L16:
            r3 = 0
            return r3
    }

    public long n() {
            r6 = this;
            long r0 = r6.f()
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L20
            long r0 = r6.f()
            r2 = 1
            long r2 = (long) r2
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r2 = kotlin.d1.k(r2)
            long r0 = r0 + r2
            long r0 = kotlin.d1.k(r0)
            return r0
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot return the exclusive upper bound of a range that includes MAX_VALUE."
            r0.<init>(r1)
            throw r0
    }

    public long p() {
            r2 = this;
            long r0 = r2.f()
            return r0
    }

    public long q() {
            r2 = this;
            long r0 = r2.e()
            return r0
    }

    @Override // kotlin.ranges.z
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r3.e()
            java.lang.String r1 = kotlin.d1.l0(r1)
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            long r1 = r3.f()
            java.lang.String r1 = kotlin.d1.l0(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
