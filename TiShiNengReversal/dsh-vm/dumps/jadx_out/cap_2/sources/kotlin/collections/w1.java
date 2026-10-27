package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class w1 extends kotlin.collections.v1 {
    public w1() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final <E> java.util.Set<E> i(int r1, @kotlin.BuilderInference kotlin.jvm.functions.Function1<? super java.util.Set<E>, kotlin.n1> r2) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set r1 = kotlin.collections.v1.e(r1)
            r2.invoke(r1)
            java.util.Set r1 = kotlin.collections.v1.a(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final <E> java.util.Set<E> j(@kotlin.BuilderInference kotlin.jvm.functions.Function1<? super java.util.Set<E>, kotlin.n1> r1) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Set r0 = kotlin.collections.v1.d()
            r1.invoke(r0)
            java.util.Set r1 = kotlin.collections.v1.a(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.Set<T> k() {
            kotlin.collections.EmptySet r0 = kotlin.collections.EmptySet.INSTANCE
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <T> java.util.HashSet<T> l() {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.HashSet<T> m(@org.jetbrains.annotations.NotNull T... r2) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.HashSet r0 = new java.util.HashSet
            int r1 = r2.length
            int r1 = kotlin.collections.k1.j(r1)
            r0.<init>(r1)
            java.util.Collection r2 = kotlin.collections.a0.Iy(r2, r0)
            java.util.HashSet r2 = (java.util.HashSet) r2
            return r2
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <T> java.util.LinkedHashSet<T> n() {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.LinkedHashSet<T> o(@org.jetbrains.annotations.NotNull T... r2) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.length
            int r1 = kotlin.collections.k1.j(r1)
            r0.<init>(r1)
            java.util.Collection r2 = kotlin.collections.a0.Iy(r2, r0)
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2
            return r2
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <T> java.util.Set<T> p() {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.Set<T> q(@org.jetbrains.annotations.NotNull T... r2) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.length
            int r1 = kotlin.collections.k1.j(r1)
            r0.<init>(r1)
            java.util.Collection r2 = kotlin.collections.a0.Iy(r2, r0)
            java.util.Set r2 = (java.util.Set) r2
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Set<T> r(@org.jetbrains.annotations.NotNull java.util.Set<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.size()
            if (r0 == 0) goto L1c
            r1 = 1
            if (r0 == r1) goto Lf
            return r2
        Lf:
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r2.next()
            java.util.Set r2 = kotlin.collections.v1.f(r2)
            return r2
        L1c:
            java.util.Set r2 = k()
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.Set<T> s(java.util.Set<? extends T> r0) {
            if (r0 != 0) goto L6
            java.util.Set r0 = k()
        L6:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.Set<T> t() {
            java.util.Set r0 = k()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.Set<T> u(@org.jetbrains.annotations.NotNull T... r1) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Set r1 = kotlin.collections.a0.Fz(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Set<T> v(@org.jetbrains.annotations.Nullable T r0) {
            if (r0 == 0) goto L7
            java.util.Set r0 = kotlin.collections.v1.f(r0)
            return r0
        L7:
            java.util.Set r0 = k()
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Set<T> w(@org.jetbrains.annotations.NotNull T... r1) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Collection r1 = kotlin.collections.a0.mb(r1, r0)
            java.util.Set r1 = (java.util.Set) r1
            return r1
    }
}
