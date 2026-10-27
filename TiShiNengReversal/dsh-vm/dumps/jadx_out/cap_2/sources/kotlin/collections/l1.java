package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,814:1\n413#1:824\n424#1:829\n521#1,6:834\n546#1,6:840\n1#2:815\n1252#3,4:816\n1252#3,4:820\n1252#3,4:825\n1252#3,4:830\n*S KotlinDebug\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n463#1:824\n478#1:829\n536#1:834,6\n561#1:840,6\n413#1:816,4\n424#1:820,4\n463#1:825,4\n478#1:830,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class l1 extends kotlin.collections.k1 {
    public l1() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> A(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r4.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L17
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L17
        L3b:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> void A0(java.util.Map<K, V> r1, K r2, V r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.put(r2, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> B(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super K, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r2 = r4.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L17
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L17
        L3f:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <K, V> java.util.Map<K, V> B0(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L48
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            if (r1 == 0) goto L43
            r2 = 1
            if (r1 == r2) goto L27
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r0 = r0.size()
            int r0 = kotlin.collections.k1.j(r0)
            r1.<init>(r0)
            java.util.Map r3 = C0(r3, r1)
            return r3
        L27:
            boolean r1 = r3 instanceof java.util.List
            if (r1 == 0) goto L35
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
        L32:
            kotlin.Pair r3 = (kotlin.Pair) r3
            goto L3e
        L35:
            java.util.Iterator r3 = r0.iterator()
            java.lang.Object r3 = r3.next()
            goto L32
        L3e:
            java.util.Map r3 = kotlin.collections.k1.k(r3)
            return r3
        L43:
            java.util.Map r3 = z()
            return r3
        L48:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r3 = C0(r3, r0)
            java.util.Map r3 = k0(r3)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> C(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r4.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L17
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L17
        L3b:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M C0(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> r1, @org.jetbrains.annotations.NotNull M r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            w0(r2, r1)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M D(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r2, @org.jetbrains.annotations.NotNull M r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r4.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L17
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r3.put(r1, r0)
            goto L17
        L3b:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static <K, V> java.util.Map<K, V> D0(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.size()
            if (r0 == 0) goto L18
            r1 = 1
            if (r0 == r1) goto L13
            java.util.Map r2 = J0(r2)
            return r2
        L13:
            java.util.Map r2 = kotlin.collections.k1.o(r2)
            return r2
        L18:
            java.util.Map r2 = z()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M E(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r2, @org.jetbrains.annotations.NotNull M r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r4.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r3.put(r1, r0)
            goto L17
        L3b:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M E0(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1, @org.jetbrains.annotations.NotNull M r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2.putAll(r1)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> F(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super V, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r2 = r4.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L17
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L17
        L3f:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> F0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends kotlin.Pair<? extends K, ? extends V>> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r1 = G0(r1, r0)
            java.util.Map r1 = k0(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> V G(java.util.Map<? extends K, ? extends V> r1, K r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Object r1 = r1.get(r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M G0(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends kotlin.Pair<? extends K, ? extends V>> r1, @org.jetbrains.annotations.NotNull M r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            x0(r2, r1)
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> V H(java.util.Map<K, ? extends V> r1, K r2, kotlin.jvm.functions.Function0<? extends V> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Object r1 = r1.get(r2)
            if (r1 != 0) goto L14
            java.lang.Object r1 = r3.invoke()
        L14:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> H0(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends K, ? extends V>[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            if (r0 == 0) goto L22
            r1 = 1
            if (r0 == r1) goto L1a
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.length
            int r1 = kotlin.collections.k1.j(r1)
            r0.<init>(r1)
            java.util.Map r2 = I0(r2, r0)
            return r2
        L1a:
            r0 = 0
            r2 = r2[r0]
            java.util.Map r2 = kotlin.collections.k1.k(r2)
            return r2
        L22:
            java.util.Map r2 = z()
            return r2
    }

    public static final <K, V> V I(@org.jetbrains.annotations.NotNull java.util.Map<K, ? extends V> r1, K r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends V> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L1b
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L1b
            java.lang.Object r1 = r3.invoke()
            return r1
        L1b:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M I0(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends K, ? extends V>[] r1, @org.jetbrains.annotations.NotNull M r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            y0(r2, r1)
            return r2
    }

    public static final <K, V> V J(@org.jetbrains.annotations.NotNull java.util.Map<K, V> r1, K r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends V> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L18
            java.lang.Object r3 = r3.invoke()
            r1.put(r2, r3)
            return r3
        L18:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static <K, V> java.util.Map<K, V> J0(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static <K, V> V K(@org.jetbrains.annotations.NotNull java.util.Map<K, ? extends V> r1, K r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Object r1 = kotlin.collections.j1.a(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> kotlin.Pair<K, V> K0(java.util.Map.Entry<? extends K, ? extends V> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.Pair r0 = new kotlin.Pair
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <K, V> java.util.HashMap<K, V> L() {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <K, V> java.util.HashMap<K, V> M(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends K, ? extends V>... r2) {
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r2.length
            int r1 = kotlin.collections.k1.j(r1)
            r0.<init>(r1)
            y0(r0, r2)
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final java.lang.Object N(java.util.Map r1, kotlin.jvm.functions.Function0 r2) {
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lf
            java.lang.Object r1 = r2.invoke()
        Lf:
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> boolean O(java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <K, V> boolean P(java.util.Map<? extends K, ? extends V> r0) {
            if (r0 == 0) goto Lb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> java.util.Iterator<java.util.Map.Entry<K, V>> Q(java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <K, V> java.util.LinkedHashMap<K, V> R() {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.LinkedHashMap<K, V> S(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends K, ? extends V>... r2) {
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.length
            int r1 = kotlin.collections.k1.j(r1)
            r0.<init>(r1)
            java.util.Map r2 = I0(r2, r0)
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V, R> java.util.Map<R, V> T(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r3.size()
            int r1 = kotlin.collections.k1.j(r1)
            r0.<init>(r1)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r3.next()
            java.lang.Object r2 = r4.invoke(r1)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L1f
        L37:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V, R, M extends java.util.Map<? super R, ? super V>> M U(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r2, @org.jetbrains.annotations.NotNull M r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r4.invoke(r0)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            r3.put(r1, r0)
            goto L17
        L2f:
            return r3
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> java.util.Map<K, V> V() {
            java.util.Map r0 = z()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <K, V> java.util.Map<K, V> W(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends K, ? extends V>... r2) {
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            if (r0 <= 0) goto L17
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.length
            int r1 = kotlin.collections.k1.j(r1)
            r0.<init>(r1)
            java.util.Map r2 = I0(r2, r0)
            return r2
        L17:
            java.util.Map r2 = z()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V, R> java.util.Map<K, R> X(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r3.size()
            int r1 = kotlin.collections.k1.j(r1)
            r0.<init>(r1)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r3.next()
            r2 = r1
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            java.lang.Object r1 = r4.invoke(r1)
            r0.put(r2, r1)
            goto L1f
        L38:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V, R, M extends java.util.Map<? super K, ? super R>> M Y(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r2, @org.jetbrains.annotations.NotNull M r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r2.next()
            r1 = r0
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r0 = r4.invoke(r0)
            r3.put(r1, r0)
            goto L17
        L30:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> Z(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends K> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map r1 = J0(r1)
            java.util.Set r0 = r1.keySet()
            kotlin.collections.m0.J0(r0, r2)
            java.util.Map r1 = k0(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> a0(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1, K r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Map r1 = J0(r1)
            r1.remove(r2)
            java.util.Map r1 = k0(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> b0(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1, @org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends K> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map r1 = J0(r1)
            java.util.Set r0 = r1.keySet()
            kotlin.collections.m0.L0(r0, r2)
            java.util.Map r1 = k0(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> c0(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1, @org.jetbrains.annotations.NotNull K[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map r1 = J0(r1)
            java.util.Set r0 = r1.keySet()
            kotlin.collections.m0.M0(r0, r2)
            java.util.Map r1 = k0(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <K, V> void d0(java.util.Map<K, V> r1, java.lang.Iterable<? extends K> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set r1 = r1.keySet()
            kotlin.collections.m0.J0(r1, r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <K, V> void e0(java.util.Map<K, V> r1, K r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.remove(r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <K, V> void f0(java.util.Map<K, V> r1, kotlin.sequences.m<? extends K> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set r1 = r1.keySet()
            kotlin.collections.m0.L0(r1, r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <K, V> void g0(java.util.Map<K, V> r1, K[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set r1 = r1.keySet()
            kotlin.collections.m0.M0(r1, r2)
            return
    }

    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "mutableIterator")
    private static final <K, V> java.util.Iterator<java.util.Map.Entry<K, V>> h0(java.util.Map<K, V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <K, V> java.util.Map<K, V> i0() {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <K, V> java.util.Map<K, V> j0(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends K, ? extends V>... r2) {
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.length
            int r1 = kotlin.collections.k1.j(r1)
            r0.<init>(r1)
            y0(r0, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> k0(@org.jetbrains.annotations.NotNull java.util.Map<K, ? extends V> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.size()
            if (r0 == 0) goto L14
            r1 = 1
            if (r0 == r1) goto Lf
            return r2
        Lf:
            java.util.Map r2 = kotlin.collections.k1.o(r2)
            return r2
        L14:
            java.util.Map r2 = z()
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> java.util.Map<K, V> l0(java.util.Map<K, ? extends V> r0) {
            if (r0 != 0) goto L6
            java.util.Map r0 = z()
        L6:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> m0(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L15
            java.util.Map r1 = B0(r2)
            return r1
        L15:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            w0(r0, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <K, V> java.util.Map<K, V> n0(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1, @org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "map"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            r0.putAll(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> o0(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1, @org.jetbrains.annotations.NotNull kotlin.Pair<? extends K, ? extends V> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "pair"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L15
            java.util.Map r1 = kotlin.collections.k1.k(r2)
            return r1
        L15:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            java.lang.Object r1 = r2.getFirst()
            java.lang.Object r2 = r2.getSecond()
            r0.put(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> p0(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1, @org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends kotlin.Pair<? extends K, ? extends V>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            x0(r0, r2)
            java.util.Map r1 = k0(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> q0(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1, @org.jetbrains.annotations.NotNull kotlin.Pair<? extends K, ? extends V>[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L15
            java.util.Map r1 = H0(r2)
            return r1
        L15:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            y0(r0, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> void r0(java.util.Map<? super K, ? super V> r1, java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.g0.p(r2, r0)
            w0(r1, r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final <K, V> java.util.Map<K, V> s(int r1, @kotlin.BuilderInference kotlin.jvm.functions.Function1<? super java.util.Map<K, V>, kotlin.n1> r2) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map r1 = kotlin.collections.k1.h(r1)
            r2.invoke(r1)
            java.util.Map r1 = kotlin.collections.k1.d(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> void s0(java.util.Map<? super K, ? super V> r1, java.util.Map<K, ? extends V> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "map"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.putAll(r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final <K, V> java.util.Map<K, V> t(@kotlin.BuilderInference kotlin.jvm.functions.Function1<? super java.util.Map<K, V>, kotlin.n1> r1) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Map r0 = kotlin.collections.k1.g()
            r1.invoke(r0)
            java.util.Map r1 = kotlin.collections.k1.d(r0)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> void t0(java.util.Map<? super K, ? super V> r1, kotlin.Pair<? extends K, ? extends V> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "pair"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object r0 = r2.getFirst()
            java.lang.Object r2 = r2.getSecond()
            r1.put(r0, r2)
            return
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> K u(java.util.Map.Entry<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Object r1 = r1.getKey()
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> void u0(java.util.Map<? super K, ? super V> r1, kotlin.sequences.m<? extends kotlin.Pair<? extends K, ? extends V>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.g0.p(r2, r0)
            x0(r1, r2)
            return
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> V v(java.util.Map.Entry<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Object r1 = r1.getValue()
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> void v0(java.util.Map<? super K, ? super V> r1, kotlin.Pair<? extends K, ? extends V>[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.g0.p(r2, r0)
            y0(r1, r2)
            return
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> boolean w(java.util.Map<? extends K, ? extends V> r1, K r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1.containsKey(r2)
            return r1
    }

    public static final <K, V> void w0(@org.jetbrains.annotations.NotNull java.util.Map<? super K, ? super V> r2, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r3.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r1 = r0.component1()
            java.lang.Object r0 = r0.component2()
            r2.put(r1, r0)
            goto Le
        L26:
            return
    }

    @kotlin.internal.InlineOnly
    private static final <K> boolean x(java.util.Map<? extends K, ?> r1, K r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1.containsKey(r2)
            return r1
    }

    public static final <K, V> void x0(@org.jetbrains.annotations.NotNull java.util.Map<? super K, ? super V> r2, @org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends kotlin.Pair<? extends K, ? extends V>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r3.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r1 = r0.component1()
            java.lang.Object r0 = r0.component2()
            r2.put(r1, r0)
            goto Le
        L26:
            return
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> boolean y(java.util.Map<K, ? extends V> r1, V r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1.containsValue(r2)
            return r1
    }

    public static final <K, V> void y0(@org.jetbrains.annotations.NotNull java.util.Map<? super K, ? super V> r4, @org.jetbrains.annotations.NotNull kotlin.Pair<? extends K, ? extends V>[] r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L1e
            r2 = r5[r1]
            java.lang.Object r3 = r2.component1()
            java.lang.Object r2 = r2.component2()
            r4.put(r3, r2)
            int r1 = r1 + 1
            goto Lc
        L1e:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static <K, V> java.util.Map<K, V> z() {
            kotlin.collections.u0 r0 = kotlin.collections.u0.a
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>"
            kotlin.jvm.internal.g0.n(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> V z0(java.util.Map<? extends K, V> r1, K r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Map r1 = kotlin.jvm.internal.u0.k(r1)
            java.lang.Object r1 = r1.remove(r2)
            return r1
    }
}
