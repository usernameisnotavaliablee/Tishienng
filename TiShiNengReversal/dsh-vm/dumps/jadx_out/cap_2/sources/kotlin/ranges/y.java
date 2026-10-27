package kotlin.ranges;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.5")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class y extends kotlin.ranges.w implements kotlin.ranges.h<kotlin.z0>, kotlin.ranges.s<kotlin.z0> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.y.a e = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.ranges.y f = null;

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
        public final kotlin.ranges.y a() {
                r1 = this;
                kotlin.ranges.y r0 = kotlin.ranges.y.j()
                return r0
        }
    }

    static {
            kotlin.ranges.y$a r0 = new kotlin.ranges.y$a
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.y.e = r0
            kotlin.ranges.y r0 = new kotlin.ranges.y
            r2 = -1
            r3 = 0
            r0.<init>(r2, r3, r1)
            kotlin.ranges.y.f = r0
            return
    }

    private y(int r3, int r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public /* synthetic */ y(int r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static final /* synthetic */ kotlin.ranges.y j() {
            kotlin.ranges.y r0 = kotlin.ranges.y.f
            return r0
    }

    @kotlin.Deprecated(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static /* synthetic */ void o() {
            return
    }

    @Override // kotlin.ranges.h, kotlin.ranges.s
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable r1) {
            r0 = this;
            kotlin.z0 r1 = (kotlin.z0) r1
            int r1 = r1.q0()
            boolean r1 = r0.m(r1)
            return r1
    }

    @Override // kotlin.ranges.s
    public /* bridge */ /* synthetic */ kotlin.z0 d() {
            r1 = this;
            int r0 = r1.n()
            kotlin.z0 r0 = kotlin.z0.b(r0)
            return r0
    }

    @Override // kotlin.ranges.w
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ranges.y
            if (r0 == 0) goto L2b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            kotlin.ranges.y r0 = (kotlin.ranges.y) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L29
        L13:
            int r0 = r2.e()
            kotlin.ranges.y r3 = (kotlin.ranges.y) r3
            int r1 = r3.e()
            if (r0 != r1) goto L2b
            int r0 = r2.f()
            int r3 = r3.f()
            if (r0 != r3) goto L2b
        L29:
            r3 = 1
            return r3
        L2b:
            r3 = 0
            return r3
    }

    @Override // kotlin.ranges.h
    public /* bridge */ /* synthetic */ kotlin.z0 getEndInclusive() {
            r1 = this;
            int r0 = r1.p()
            kotlin.z0 r0 = kotlin.z0.b(r0)
            return r0
    }

    @Override // kotlin.ranges.h, kotlin.ranges.s
    public /* bridge */ /* synthetic */ java.lang.Comparable getStart() {
            r1 = this;
            int r0 = r1.q()
            kotlin.z0 r0 = kotlin.z0.b(r0)
            return r0
    }

    @Override // kotlin.ranges.w
    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            return r0
        L8:
            int r0 = r2.e()
            int r0 = r0 * 31
            int r1 = r2.f()
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.ranges.w, kotlin.ranges.h, kotlin.ranges.s
    public boolean isEmpty() {
            r2 = this;
            int r0 = r2.e()
            int r1 = r2.f()
            int r0 = kotlin.u0.a(r0, r1)
            if (r0 <= 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public boolean m(int r2) {
            r1 = this;
            int r0 = r1.e()
            int r0 = kotlin.u0.a(r0, r2)
            if (r0 > 0) goto L16
            int r0 = r1.f()
            int r2 = kotlin.u0.a(r2, r0)
            if (r2 > 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    public int n() {
            r2 = this;
            int r0 = r2.f()
            r1 = -1
            if (r0 == r1) goto L12
            int r0 = r2.f()
            int r0 = r0 + 1
            int r0 = kotlin.z0.k(r0)
            return r0
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot return the exclusive upper bound of a range that includes MAX_VALUE."
            r0.<init>(r1)
            throw r0
    }

    public int p() {
            r1 = this;
            int r0 = r1.f()
            return r0
    }

    public int q() {
            r1 = this;
            int r0 = r1.e()
            return r0
    }

    @Override // kotlin.ranges.w
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.e()
            java.lang.String r1 = kotlin.z0.l0(r1)
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            int r1 = r2.f()
            java.lang.String r1 = kotlin.z0.l0(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
