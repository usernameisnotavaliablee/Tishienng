package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class v1 {
    public v1() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static <E> java.util.Set<E> a(@org.jetbrains.annotations.NotNull java.util.Set<E> r1) {
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.builders.SetBuilder r1 = (kotlin.collections.builders.SetBuilder) r1
            java.util.Set r1 = r1.build()
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @kotlin.internal.InlineOnly
    private static final <E> java.util.Set<E> b(int r1, kotlin.jvm.functions.Function1<? super java.util.Set<E>, kotlin.n1> r2) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set r1 = e(r1)
            r2.invoke(r1)
            java.util.Set r1 = a(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @kotlin.internal.InlineOnly
    private static final <E> java.util.Set<E> c(kotlin.jvm.functions.Function1<? super java.util.Set<E>, kotlin.n1> r1) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Set r0 = d()
            r1.invoke(r0)
            java.util.Set r1 = a(r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static <E> java.util.Set<E> d() {
            kotlin.collections.builders.SetBuilder r0 = new kotlin.collections.builders.SetBuilder
            r0.<init>()
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static <E> java.util.Set<E> e(int r1) {
            kotlin.collections.builders.SetBuilder r0 = new kotlin.collections.builders.SetBuilder
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.Set<T> f(T r1) {
            java.util.Set r1 = java.util.Collections.singleton(r1)
            java.lang.String r0 = "singleton(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.TreeSet<T> g(@org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r1, @org.jetbrains.annotations.NotNull T... r2) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>(r1)
            java.util.Collection r1 = kotlin.collections.a0.Iy(r2, r0)
            java.util.TreeSet r1 = (java.util.TreeSet) r1
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.TreeSet<T> h(@org.jetbrains.annotations.NotNull T... r1) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.Collection r1 = kotlin.collections.a0.Iy(r1, r0)
            java.util.TreeSet r1 = (java.util.TreeSet) r1
            return r1
    }
}
