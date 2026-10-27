package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCollectionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionsJVM.kt\nkotlin/collections/CollectionsKt__CollectionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class g0 {
    public g0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.ArrayList<T> a(T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            java.util.Collection r2 = kotlin.collections.h0.u(r2, r1)
            r0.<init>(r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static <E> java.util.List<E> b(@org.jetbrains.annotations.NotNull java.util.List<E> r1) {
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.builders.ListBuilder r1 = (kotlin.collections.builders.ListBuilder) r1
            java.util.List r1 = r1.build()
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @kotlin.internal.InlineOnly
    private static final <E> java.util.List<E> c(int r1, kotlin.jvm.functions.Function1<? super java.util.List<E>, kotlin.n1> r2) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.List r1 = k(r1)
            r2.invoke(r1)
            java.util.List r1 = b(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @kotlin.internal.InlineOnly
    private static final <E> java.util.List<E> d(kotlin.jvm.functions.Function1<? super java.util.List<E>, kotlin.n1> r1) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.List r0 = j()
            r1.invoke(r0)
            java.util.List r1 = b(r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @kotlin.internal.InlineOnly
    private static final int e(int r0) {
            if (r0 >= 0) goto L5
            kotlin.collections.h0.a0()
        L5:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @kotlin.internal.InlineOnly
    private static final int f(int r0) {
            if (r0 >= 0) goto L5
            kotlin.collections.h0.b0()
        L5:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.Object[] g(java.util.Collection<?> r1) {
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Object[] r1 = kotlin.jvm.internal.u.a(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> T[] h(java.util.Collection<?> r1, T[] r2) {
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object[] r1 = kotlin.jvm.internal.u.b(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.lang.Object[] i(@org.jetbrains.annotations.NotNull T[] r1, boolean r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            if (r2 == 0) goto L14
            java.lang.Class r2 = r1.getClass()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r2 == 0) goto L14
            return r1
        L14:
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2, r0)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static <E> java.util.List<E> j() {
            kotlin.collections.builders.ListBuilder r0 = new kotlin.collections.builders.ListBuilder
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static <E> java.util.List<E> k(int r1) {
            kotlin.collections.builders.ListBuilder r0 = new kotlin.collections.builders.ListBuilder
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> l(T r1) {
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r0 = "singletonList(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> m(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.List r1 = kotlin.collections.r0.c6(r1)
            java.util.Collections.shuffle(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> n(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull java.util.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.List r1 = kotlin.collections.r0.c6(r1)
            java.util.Collections.shuffle(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> T[] o(int r1, @org.jetbrains.annotations.NotNull T[] r2) {
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            if (r1 >= r0) goto Lb
            r0 = 0
            r2[r1] = r0
        Lb:
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.List<T> p(java.util.Enumeration<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.ArrayList r1 = java.util.Collections.list(r1)
            java.lang.String r0 = "list(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }
}
