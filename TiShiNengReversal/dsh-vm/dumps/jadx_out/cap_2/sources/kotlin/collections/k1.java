package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMapsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class k1 extends kotlin.collections.j1 {
    private static final int a = 1073741824;

    public k1() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static <K, V> java.util.Map<K, V> d(@org.jetbrains.annotations.NotNull java.util.Map<K, V> r1) {
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.builders.MapBuilder r1 = (kotlin.collections.builders.MapBuilder) r1
            java.util.Map r1 = r1.build()
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @kotlin.internal.InlineOnly
    private static final <K, V> java.util.Map<K, V> e(int r1, kotlin.jvm.functions.Function1<? super java.util.Map<K, V>, kotlin.n1> r2) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map r1 = h(r1)
            r2.invoke(r1)
            java.util.Map r1 = d(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @kotlin.internal.InlineOnly
    private static final <K, V> java.util.Map<K, V> f(kotlin.jvm.functions.Function1<? super java.util.Map<K, V>, kotlin.n1> r1) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Map r0 = g()
            r1.invoke(r0)
            java.util.Map r1 = d(r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static <K, V> java.util.Map<K, V> g() {
            kotlin.collections.builders.MapBuilder r0 = new kotlin.collections.builders.MapBuilder
            r0.<init>()
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static <K, V> java.util.Map<K, V> h(int r1) {
            kotlin.collections.builders.MapBuilder r0 = new kotlin.collections.builders.MapBuilder
            r0.<init>(r1)
            return r0
    }

    public static final <K, V> V i(@org.jetbrains.annotations.NotNull java.util.concurrent.ConcurrentMap<K, V> r1, K r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends V> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L1c
            java.lang.Object r3 = r3.invoke()
            java.lang.Object r1 = r1.putIfAbsent(r2, r3)
            if (r1 != 0) goto L1b
            return r3
        L1b:
            return r1
        L1c:
            return r0
    }

    @kotlin.PublishedApi
    public static int j(int r1) {
            if (r1 >= 0) goto L3
            return r1
        L3:
            r0 = 3
            if (r1 >= r0) goto L9
            int r1 = r1 + 1
            return r1
        L9:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 >= r0) goto L16
            float r1 = (float) r1
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            int r1 = (int) r1
            return r1
        L16:
            r1 = 2147483647(0x7fffffff, float:NaN)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <K, V> java.util.Map<K, V> k(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends K, ? extends V> r1) {
            java.lang.String r0 = "pair"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Object r0 = r1.getFirst()
            java.lang.Object r1 = r1.getSecond()
            java.util.Map r1 = java.util.Collections.singletonMap(r0, r1)
            java.lang.String r0 = "singletonMap(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.SortedMap<K, V> l(@org.jetbrains.annotations.NotNull java.util.Comparator<? super K> r1, @org.jetbrains.annotations.NotNull kotlin.Pair<? extends K, ? extends V>... r2) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r1)
            kotlin.collections.l1.y0(r0, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <K extends java.lang.Comparable<? super K>, V> java.util.SortedMap<K, V> m(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends K, ? extends V>... r1) {
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            kotlin.collections.l1.y0(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.util.Properties n(java.util.Map<java.lang.String, java.lang.String> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r0.putAll(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> o(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.util.Map r1 = java.util.Collections.singletonMap(r0, r1)
            java.lang.String r0 = "with(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> java.util.Map<K, V> p(java.util.Map<K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Map r1 = o(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <K extends java.lang.Comparable<? super K>, V> java.util.SortedMap<K, V> q(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <K, V> java.util.SortedMap<K, V> r(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1, @org.jetbrains.annotations.NotNull java.util.Comparator<? super K> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r2)
            r0.putAll(r1)
            return r0
    }
}
