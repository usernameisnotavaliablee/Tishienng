package kotlin.ranges;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m extends kotlin.ranges.k implements kotlin.ranges.h<java.lang.Integer>, kotlin.ranges.s<java.lang.Integer> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.m.a e = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.ranges.m f = null;

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
        public final kotlin.ranges.m a() {
                r1 = this;
                kotlin.ranges.m r0 = kotlin.ranges.m.m()
                return r0
        }
    }

    static {
            kotlin.ranges.m$a r0 = new kotlin.ranges.m$a
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.m.e = r0
            kotlin.ranges.m r0 = new kotlin.ranges.m
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.ranges.m.f = r0
            return
    }

    public m(int r2, int r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public static final /* synthetic */ kotlin.ranges.m m() {
            kotlin.ranges.m r0 = kotlin.ranges.m.f
            return r0
    }

    @kotlin.Deprecated(message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static /* synthetic */ void p() {
            return
    }

    @Override // kotlin.ranges.h, kotlin.ranges.s
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable r1) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            boolean r1 = r0.n(r1)
            return r1
    }

    @Override // kotlin.ranges.s
    public /* bridge */ /* synthetic */ java.lang.Integer d() {
            r1 = this;
            java.lang.Integer r0 = r1.o()
            return r0
    }

    @Override // kotlin.ranges.k
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ranges.m
            if (r0 == 0) goto L2b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            kotlin.ranges.m r0 = (kotlin.ranges.m) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L29
        L13:
            int r0 = r2.e()
            kotlin.ranges.m r3 = (kotlin.ranges.m) r3
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
    public /* bridge */ /* synthetic */ java.lang.Integer getEndInclusive() {
            r1 = this;
            java.lang.Integer r0 = r1.q()
            return r0
    }

    @Override // kotlin.ranges.h, kotlin.ranges.s
    public /* bridge */ /* synthetic */ java.lang.Comparable getStart() {
            r1 = this;
            java.lang.Integer r0 = r1.r()
            return r0
    }

    @Override // kotlin.ranges.k
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

    @Override // kotlin.ranges.k, kotlin.ranges.h, kotlin.ranges.s
    public boolean isEmpty() {
            r2 = this;
            int r0 = r2.e()
            int r1 = r2.f()
            if (r0 <= r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean n(int r2) {
            r1 = this;
            int r0 = r1.e()
            if (r0 > r2) goto Le
            int r0 = r1.f()
            if (r2 > r0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Integer o() {
            r2 = this;
            int r0 = r2.f()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L14
            int r0 = r2.f()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot return the exclusive upper bound of a range that includes MAX_VALUE."
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Integer q() {
            r1 = this;
            int r0 = r1.f()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Integer r() {
            r1 = this;
            int r0 = r1.e()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    @Override // kotlin.ranges.k
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.e()
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            int r1 = r2.f()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
