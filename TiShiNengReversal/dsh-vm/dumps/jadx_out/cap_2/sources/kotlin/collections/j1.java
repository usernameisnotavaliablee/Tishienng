package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,111:1\n348#2,6:112\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n*L\n24#1:112,6\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class j1 {
    public j1() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.PublishedApi
    @kotlin.jvm.JvmName(name = "getOrImplicitDefaultNullable")
    public static final <K, V> V a(@org.jetbrains.annotations.NotNull java.util.Map<K, ? extends V> r2, K r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2 instanceof kotlin.collections.g1
            if (r0 == 0) goto L10
            kotlin.collections.g1 r2 = (kotlin.collections.g1) r2
            java.lang.Object r2 = r2.s(r3)
            return r2
        L10:
            java.lang.Object r0 = r2.get(r3)
            if (r0 != 0) goto L39
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L1d
            goto L39
        L1d:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Key "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " is missing in the map."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L39:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> b(@org.jetbrains.annotations.NotNull java.util.Map<K, ? extends V> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super K, ? extends V> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1 instanceof kotlin.collections.g1
            if (r0 == 0) goto L19
            kotlin.collections.g1 r1 = (kotlin.collections.g1) r1
            java.util.Map r1 = r1.getMap()
            java.util.Map r1 = b(r1, r2)
            return r1
        L19:
            kotlin.collections.h1 r0 = new kotlin.collections.h1
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmName(name = "withDefaultMutable")
    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> c(@org.jetbrains.annotations.NotNull java.util.Map<K, V> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super K, ? extends V> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1 instanceof kotlin.collections.p1
            if (r0 == 0) goto L19
            kotlin.collections.p1 r1 = (kotlin.collections.p1) r1
            java.util.Map r1 = r1.getMap()
            java.util.Map r1 = c(r1, r2)
            return r1
        L19:
            kotlin.collections.q1 r0 = new kotlin.collections.q1
            r0.<init>(r1, r2)
            return r0
    }
}
