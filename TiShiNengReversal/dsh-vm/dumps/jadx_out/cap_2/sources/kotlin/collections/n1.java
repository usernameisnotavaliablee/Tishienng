package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\n_Maps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,671:1\n97#1,5:672\n112#1,5:677\n153#1,3:682\n144#1:685\n216#1:686\n217#1:688\n145#1:689\n216#1:690\n217#1:692\n1#2:687\n1#2:691\n1969#3,14:693\n1999#3,14:707\n2393#3,14:721\n2423#3,14:735\n1878#3,3:749\n*S KotlinDebug\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n77#1:672,5\n90#1:677,5\n126#1:682,3\n136#1:685\n136#1:686\n136#1:688\n136#1:689\n144#1:690\n144#1:692\n136#1:687\n238#1:693,14\n256#1:707,14\n436#1:721,14\n454#1:735,14\n651#1:749,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class n1 extends kotlin.collections.m1 {
    public n1() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <K, V> java.lang.Float A1(java.util.Map<? extends K, ? extends V> r2, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Float> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L1a
            r2 = 0
            return r2
        L1a:
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L28:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.min(r0, r1)
            goto L28
        L41:
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <K, V, R> R B1(java.util.Map<? extends K, ? extends V> r3, java.util.Comparator<? super R> r4, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r5.invoke(r0)
        L25:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r5.invoke(r1)
            int r2 = r4.compare(r0, r1)
            if (r2 <= 0) goto L25
            r0 = r1
            goto L25
        L3b:
            return r0
        L3c:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <K, V, R> R C1(java.util.Map<? extends K, ? extends V> r3, java.util.Comparator<? super R> r4, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L1f
            r3 = 0
            return r3
        L1f:
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r5.invoke(r0)
        L27:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r5.invoke(r1)
            int r2 = r4.compare(r0, r1)
            if (r2 <= 0) goto L27
            r0 = r1
            goto L27
        L3d:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final <K, V> java.util.Map.Entry<K, V> D1(java.util.Map<? extends K, ? extends V> r1, java.util.Comparator<? super java.util.Map.Entry<? extends K, ? extends V>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set r1 = r1.entrySet()
            java.lang.Object r1 = kotlin.collections.r0.s4(r1, r2)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            return r1
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "minWithOrThrow")
    private static final <K, V> java.util.Map.Entry<K, V> E1(java.util.Map<? extends K, ? extends V> r1, java.util.Comparator<? super java.util.Map.Entry<? extends K, ? extends V>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set r1 = r1.entrySet()
            java.lang.Object r1 = kotlin.collections.r0.t4(r1, r2)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            return r1
    }

    public static final <K, V> boolean F1(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1.isEmpty()
            return r1
    }

    public static final <K, V> boolean G1(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r2.isEmpty()
            r1 = 1
            if (r0 == 0) goto L12
            return r1
        L12:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a
            r2 = 0
            return r2
        L34:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <K, V, M extends java.util.Map<? extends K, ? extends V>> M H1(@org.jetbrains.annotations.NotNull M r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, kotlin.n1> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r3.invoke(r1)
            goto L12
        L22:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <K, V, M extends java.util.Map<? extends K, ? extends V>> M I1(@org.jetbrains.annotations.NotNull M r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.util.Map.Entry<? extends K, ? extends V>, kotlin.n1> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            int r3 = r1 + 1
            if (r1 >= 0) goto L24
            kotlin.collections.h0.b0()
        L24:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.invoke(r1, r2)
            r1 = r3
            goto L13
        L2d:
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static <K, V> java.util.List<kotlin.Pair<K, V>> J1(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.size()
            if (r0 != 0) goto L10
            java.util.List r4 = kotlin.collections.h0.J()
            return r4
        L10:
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L23
            java.util.List r4 = kotlin.collections.h0.J()
            return r4
        L23:
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L41
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.Object r0 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r4.<init>(r0, r1)
            java.util.List r4 = kotlin.collections.g0.l(r4)
            return r4
        L41:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = r4.size()
            r2.<init>(r4)
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r4.<init>(r3, r1)
            r2.add(r4)
        L5a:
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Object r3 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            r1.<init>(r3, r4)
            r2.add(r1)
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L5a
            return r2
    }

    public static final <K, V> boolean P0(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r2.isEmpty()
            r1 = 1
            if (r0 == 0) goto L12
            return r1
        L12:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1a
            r2 = 0
            return r2
        L34:
            return r1
    }

    public static final <K, V> boolean Q0(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            return r1
    }

    public static final <K, V> boolean R0(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r2.isEmpty()
            r1 = 0
            if (r0 == 0) goto L12
            return r1
        L12:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a
            r2 = 1
            return r2
        L34:
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> java.lang.Iterable<java.util.Map.Entry<K, V>> S0(java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Set r1 = r1.entrySet()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V> kotlin.sequences.m<java.util.Map.Entry<K, V>> T0(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Set r1 = r1.entrySet()
            kotlin.sequences.m r1 = kotlin.collections.r0.E1(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <K, V> int U0(java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.size()
            return r1
    }

    public static final <K, V> int V0(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r2.isEmpty()
            r1 = 0
            if (r0 == 0) goto L12
            return r1
        L12:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a
            int r1 = r1 + 1
            goto L1a
        L35:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final <K, V, R> R W0(java.util.Map<? extends K, ? extends V> r1, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r2.invoke(r0)
            if (r0 != 0) goto L26
            goto L12
        L25:
            r0 = 0
        L26:
            if (r0 == 0) goto L29
            return r0
        L29:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "No element of the map was transformed to a non-null value."
            r1.<init>(r2)
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final <K, V, R> R X0(java.util.Map<? extends K, ? extends V> r1, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r2.invoke(r0)
            if (r0 == 0) goto L12
            return r0
        L25:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V, R> java.util.List<R> Y0(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends java.lang.Iterable<? extends R>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.collections.m0.s0(r0, r1)
            goto L17
        L2d:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.jvm.JvmName(name = "flatMapSequence")
    @org.jetbrains.annotations.NotNull
    @kotlin.OverloadResolutionByLambdaReturnType
    public static final <K, V, R> java.util.List<R> Z0(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends kotlin.sequences.m<? extends R>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r3.invoke(r1)
            kotlin.sequences.m r1 = (kotlin.sequences.m) r1
            kotlin.collections.m0.t0(r0, r1)
            goto L17
        L2d:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.jvm.JvmName(name = "flatMapSequenceTo")
    @org.jetbrains.annotations.NotNull
    @kotlin.OverloadResolutionByLambdaReturnType
    public static final <K, V, R, C extends java.util.Collection<? super R>> C a1(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1, @org.jetbrains.annotations.NotNull C r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends kotlin.sequences.m<? extends R>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r3.invoke(r0)
            kotlin.sequences.m r0 = (kotlin.sequences.m) r0
            kotlin.collections.m0.t0(r2, r0)
            goto L17
        L2d:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V, R, C extends java.util.Collection<? super R>> C b1(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1, @org.jetbrains.annotations.NotNull C r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends java.lang.Iterable<? extends R>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.m0.s0(r2, r0)
            goto L17
        L2d:
            return r2
    }

    @kotlin.internal.HidesMembers
    public static final <K, V> void c1(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, kotlin.n1> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r2.invoke(r0)
            goto L12
        L22:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V, R> java.util.List<R> d1(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1b:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r3.invoke(r1)
            r0.add(r1)
            goto L1b
        L2f:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V, R> java.util.List<R> e1(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r3.invoke(r1)
            if (r1 == 0) goto L17
            r0.add(r1)
            goto L17
        L2d:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V, R, C extends java.util.Collection<? super R>> C f1(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1, @org.jetbrains.annotations.NotNull C r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r3.invoke(r0)
            if (r0 == 0) goto L17
            r2.add(r0)
            goto L17
        L2d:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <K, V, R, C extends java.util.Collection<? super R>> C g1(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r1, @org.jetbrains.annotations.NotNull C r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r3.invoke(r0)
            r2.add(r0)
            goto L17
        L2b:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final <K, V, R extends java.lang.Comparable<? super R>> java.util.Map.Entry<K, V> h1(java.util.Map<? extends K, ? extends V> r5, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L1a
            r5 = 0
            goto L45
        L1a:
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L26
        L24:
            r5 = r0
            goto L45
        L26:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L2c:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 >= 0) goto L3e
            r0 = r2
            r1 = r3
        L3e:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L2c
            goto L24
        L45:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            return r5
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "maxByOrThrow")
    private static final <K, V, R extends java.lang.Comparable<? super R>> java.util.Map.Entry<K, V> i1(java.util.Map<? extends K, ? extends V> r5, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L23
            goto L41
        L23:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L29:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 >= 0) goto L3b
            r0 = r2
            r1 = r3
        L3b:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L29
        L41:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
        L44:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            r5.<init>()
            throw r5
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <K, V> double j1(java.util.Map<? extends K, ? extends V> r4, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r4.next()
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L26:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.max(r0, r2)
            goto L26
        L3f:
            return r0
        L40:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            r4.<init>()
            throw r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <K, V> float k1(java.util.Map<? extends K, ? extends V> r2, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Float> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L26:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.max(r0, r1)
            goto L26
        L3f:
            return r0
        L40:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <K, V, R extends java.lang.Comparable<? super R>> R l1(java.util.Map<? extends K, ? extends V> r3, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L22:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L22
            r0 = r1
            goto L22
        L3a:
            return r0
        L3b:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <K, V, R extends java.lang.Comparable<? super R>> R m1(java.util.Map<? extends K, ? extends V> r3, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L1a
            r3 = 0
            return r3
        L1a:
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L24:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L24
            r0 = r1
            goto L24
        L3c:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <K, V> java.lang.Double n1(java.util.Map<? extends K, ? extends V> r4, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L1a
            r4 = 0
            return r4
        L1a:
            java.lang.Object r0 = r4.next()
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L28:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.max(r0, r2)
            goto L28
        L41:
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            return r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <K, V> java.lang.Float o1(java.util.Map<? extends K, ? extends V> r2, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Float> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L1a
            r2 = 0
            return r2
        L1a:
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L28:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.max(r0, r1)
            goto L28
        L41:
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <K, V, R> R p1(java.util.Map<? extends K, ? extends V> r3, java.util.Comparator<? super R> r4, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r5.invoke(r0)
        L25:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r5.invoke(r1)
            int r2 = r4.compare(r0, r1)
            if (r2 >= 0) goto L25
            r0 = r1
            goto L25
        L3b:
            return r0
        L3c:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <K, V, R> R q1(java.util.Map<? extends K, ? extends V> r3, java.util.Comparator<? super R> r4, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L1f
            r3 = 0
            return r3
        L1f:
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r5.invoke(r0)
        L27:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r5.invoke(r1)
            int r2 = r4.compare(r0, r1)
            if (r2 >= 0) goto L27
            r0 = r1
            goto L27
        L3d:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final <K, V> java.util.Map.Entry<K, V> r1(java.util.Map<? extends K, ? extends V> r1, java.util.Comparator<? super java.util.Map.Entry<? extends K, ? extends V>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set r1 = r1.entrySet()
            java.lang.Object r1 = kotlin.collections.r0.a4(r1, r2)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            return r1
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "maxWithOrThrow")
    private static final <K, V> java.util.Map.Entry<K, V> s1(java.util.Map<? extends K, ? extends V> r1, java.util.Comparator<? super java.util.Map.Entry<? extends K, ? extends V>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set r1 = r1.entrySet()
            java.lang.Object r1 = kotlin.collections.r0.b4(r1, r2)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final <K, V, R extends java.lang.Comparable<? super R>> java.util.Map.Entry<K, V> t1(java.util.Map<? extends K, ? extends V> r5, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L1a
            r5 = 0
            goto L45
        L1a:
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L26
        L24:
            r5 = r0
            goto L45
        L26:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L2c:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 <= 0) goto L3e
            r0 = r2
            r1 = r3
        L3e:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L2c
            goto L24
        L45:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            return r5
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "minByOrThrow")
    private static final <K, V, R extends java.lang.Comparable<? super R>> java.util.Map.Entry<K, V> u1(java.util.Map<? extends K, ? extends V> r5, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L23
            goto L41
        L23:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L29:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 <= 0) goto L3b
            r0 = r2
            r1 = r3
        L3b:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L29
        L41:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
        L44:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            r5.<init>()
            throw r5
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <K, V> double v1(java.util.Map<? extends K, ? extends V> r4, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r4.next()
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L26:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.min(r0, r2)
            goto L26
        L3f:
            return r0
        L40:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            r4.<init>()
            throw r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <K, V> float w1(java.util.Map<? extends K, ? extends V> r2, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Float> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L26:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.min(r0, r1)
            goto L26
        L3f:
            return r0
        L40:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <K, V, R extends java.lang.Comparable<? super R>> R x1(java.util.Map<? extends K, ? extends V> r3, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L22:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 <= 0) goto L22
            r0 = r1
            goto L22
        L3a:
            return r0
        L3b:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <K, V, R extends java.lang.Comparable<? super R>> R y1(java.util.Map<? extends K, ? extends V> r3, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L1a
            r3 = 0
            return r3
        L1a:
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L24:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 <= 0) goto L24
            r0 = r1
            goto L24
        L3c:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <K, V> java.lang.Double z1(java.util.Map<? extends K, ? extends V> r4, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L1a
            r4 = 0
            return r4
        L1a:
            java.lang.Object r0 = r4.next()
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L28:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.min(r0, r2)
            goto L28
        L41:
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            return r4
    }
}
