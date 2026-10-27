package kotlin.ranges;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class u {
    public u() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final void a(boolean r2, @org.jetbrains.annotations.NotNull java.lang.Number r3) {
            java.lang.String r0 = "step"
            kotlin.jvm.internal.g0.p(r3, r0)
            if (r2 == 0) goto L8
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Step must be positive, was: "
            r0.append(r1)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lkotlin/ranges/h<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final boolean b(kotlin.ranges.h r1, java.lang.Object r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            if (r2 == 0) goto L11
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L11
            r1 = 1
            return r1
        L11:
            r1 = 0
            return r1
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lkotlin/ranges/s<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final boolean c(kotlin.ranges.s r1, java.lang.Object r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            if (r2 == 0) goto L11
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L11
            r1 = 1
            return r1
        L11:
            r1 = 0
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.g<java.lang.Double> d(double r1, double r3) {
            kotlin.ranges.e r0 = new kotlin.ranges.e
            r0.<init>(r1, r3)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.g<java.lang.Float> e(float r1, float r2) {
            kotlin.ranges.f r0 = new kotlin.ranges.f
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> kotlin.ranges.h<T> f(@org.jetbrains.annotations.NotNull T r1, @org.jetbrains.annotations.NotNull T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "that"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.ranges.j r0 = new kotlin.ranges.j
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.s<java.lang.Double> g(double r1, double r3) {
            kotlin.ranges.q r0 = new kotlin.ranges.q
            r0.<init>(r1, r3)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.NotNull
    public static kotlin.ranges.s<java.lang.Float> h(float r1, float r2) {
            kotlin.ranges.r r0 = new kotlin.ranges.r
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> kotlin.ranges.s<T> i(@org.jetbrains.annotations.NotNull T r1, @org.jetbrains.annotations.NotNull T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "that"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.ranges.i r0 = new kotlin.ranges.i
            r0.<init>(r1, r2)
            return r0
    }
}
