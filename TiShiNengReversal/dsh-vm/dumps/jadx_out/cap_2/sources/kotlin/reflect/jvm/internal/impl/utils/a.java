package kotlin.reflect.jvm.internal.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\ncollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 collections.kt\norg/jetbrains/kotlin/utils/CollectionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1222#2,2:130\n1252#2,4:132\n1#3:136\n*S KotlinDebug\n*F\n+ 1 collections.kt\norg/jetbrains/kotlin/utils/CollectionsKt\n*L\n22#1:130,2\n22#1:132,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a {
    public static final <T> void a(@org.jetbrains.annotations.NotNull java.util.Collection<T> r1, @org.jetbrains.annotations.Nullable T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            if (r2 == 0) goto La
            r1.add(r2)
        La:
            return
    }

    private static final int b(int r1) {
            r0 = 3
            if (r1 >= r0) goto L4
            return r0
        L4:
            int r0 = r1 / 3
            int r1 = r1 + r0
            int r1 = r1 + 1
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> c(@org.jetbrains.annotations.NotNull java.util.ArrayList<T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.size()
            if (r0 == 0) goto L1b
            r1 = 1
            if (r0 == r1) goto L12
            r2.trimToSize()
            return r2
        L12:
            java.lang.Object r2 = kotlin.collections.f0.G2(r2)
            java.util.List r2 = kotlin.collections.f0.l(r2)
            return r2
        L1b:
            java.util.List r2 = kotlin.collections.f0.J()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <K> java.util.Map<K, java.lang.Integer> d(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends K> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        Lf:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L24
            int r2 = r1 + 1
            java.lang.Object r3 = r4.next()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r3, r1)
            r1 = r2
            goto Lf
        L24:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.HashMap<K, V> e(int r1) {
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = b(r1)
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> java.util.HashSet<E> f(int r1) {
            java.util.HashSet r0 = new java.util.HashSet
            int r1 = b(r1)
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> java.util.LinkedHashSet<E> g(int r1) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = b(r1)
            r0.<init>(r1)
            return r0
    }
}
