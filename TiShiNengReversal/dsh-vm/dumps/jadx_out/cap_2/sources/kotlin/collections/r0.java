package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,3794:1\n295#1,2:3795\n528#1,7:3797\n543#1,6:3804\n865#1,2:3811\n796#1:3813\n1878#1,2:3814\n797#1,2:3816\n1880#1:3818\n799#1:3819\n1878#1,3:3820\n817#1,2:3823\n855#1,2:3825\n1267#1,4:3831\n1236#1,4:3835\n1252#1,4:3839\n1299#1,4:3843\n1460#1,5:3847\n1475#1,5:3852\n1516#1,3:3857\n1519#1,3:3867\n1534#1,3:3870\n1537#1,3:3880\n1634#1,3:3897\n1604#1,4:3900\n1593#1:3904\n1878#1,2:3905\n1880#1:3908\n1594#1:3909\n1878#1,3:3910\n1625#1:3913\n1869#1:3914\n1870#1:3916\n1626#1:3917\n1869#1,2:3918\n1878#1,3:3920\n2967#1,3:3923\n2970#1,6:3927\n2992#1,3:3933\n2995#1,7:3937\n865#1,2:3944\n827#1:3946\n855#1,2:3947\n827#1:3949\n855#1,2:3950\n827#1:3952\n855#1,2:3953\n3516#1,8:3959\n3544#1,7:3967\n3575#1,10:3974\n1#2:3810\n1#2:3907\n1#2:3915\n1#2:3926\n1#2:3936\n37#3,2:3827\n37#3,2:3829\n382#4,7:3860\n382#4,7:3873\n382#4,7:3883\n382#4,7:3890\n32#5,2:3955\n32#5,2:3957\n*S KotlinDebug\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n174#1:3795,2\n184#1:3797,7\n194#1:3804,6\n774#1:3811,2\n785#1:3813\n785#1:3814,2\n785#1:3816,2\n785#1:3818\n785#1:3819\n796#1:3820,3\n808#1:3823,2\n827#1:3825,2\n1194#1:3831,4\n1209#1:3835,4\n1223#1:3839,4\n1286#1:3843,4\n1374#1:3847,5\n1387#1:3852,5\n1491#1:3857,3\n1491#1:3867,3\n1504#1:3870,3\n1504#1:3880,3\n1563#1:3897,3\n1573#1:3900,4\n1583#1:3904\n1583#1:3905,2\n1583#1:3908\n1583#1:3909\n1593#1:3910,3\n1617#1:3913\n1617#1:3914\n1617#1:3916\n1617#1:3917\n1625#1:3918,2\n2767#1:3920,3\n3067#1:3923,3\n3067#1:3927,6\n3084#1:3933,3\n3084#1:3937,7\n3254#1:3944,2\n3262#1:3946\n3262#1:3947,2\n3272#1:3949\n3272#1:3950,2\n3282#1:3952\n3282#1:3953,2\n3505#1:3959,8\n3533#1:3967,7\n3562#1:3974,10\n1583#1:3907\n1617#1:3915\n3067#1:3926\n3084#1:3936\n1042#1:3827,2\n1089#1:3829,2\n1491#1:3860,7\n1504#1:3873,7\n1518#1:3883,7\n1536#1:3890,7\n3450#1:3955,2\n3492#1:3957,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class r0 extends kotlin.collections.o0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,731:1\n3635#2:732\n*E\n"})
    public static final class a<T> implements kotlin.sequences.m<T> {
        final /* synthetic */ java.lang.Iterable a;

        public a(java.lang.Iterable r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.sequences.m
        public java.util.Iterator<T> iterator() {
                r1 = this;
                java.lang.Iterable r0 = r1.a
                java.util.Iterator r0 = r0.iterator()
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1\n*L\n1#1,3794:1\n*E\n"})
    public static final class b<K, T> implements kotlin.collections.w0<T, K> {
        final /* synthetic */ java.lang.Iterable<T> a;
        final /* synthetic */ kotlin.jvm.functions.Function1<T, K> b;

        public b(java.lang.Iterable<? extends T> r1, kotlin.jvm.functions.Function1<? super T, ? extends K> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // kotlin.collections.w0
        public K a(T r2) {
                r1 = this;
                kotlin.jvm.functions.Function1<T, K> r0 = r1.b
                java.lang.Object r2 = r0.invoke(r2)
                return r2
        }

        @Override // kotlin.collections.w0
        public java.util.Iterator<T> b() {
                r1 = this;
                java.lang.Iterable<T> r0 = r1.a
                java.util.Iterator r0 = r0.iterator()
                return r0
        }
    }

    public r0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> boolean A1(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r2 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L19
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L19
            return r1
        L19:
            java.util.Iterator r2 = r2.iterator()
        L1d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1d
            r2 = 0
            return r2
        L35:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, C extends java.util.Collection<? super T>> C A2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull C r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r4.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L13
            r3.add(r0)
            goto L13
        L2d:
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static <T> T A3(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r1 = 0
            return r1
        Ld:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    public static final <T> boolean A4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r2 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L19
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L19
            return r1
        L19:
            java.util.Iterator r2 = r2.iterator()
        L1d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1d
            r2 = 0
            return r2
        L35:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Set<T> A5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set r1 = e6(r1)
            kotlin.collections.m0.J0(r1, r2)
            return r1
    }

    public static final <T> boolean B1(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L12
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            return r1
        L12:
            java.util.Iterator r1 = r1.iterator()
            boolean r1 = r1.hasNext()
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> T B2(java.lang.Iterable<? extends T> r2, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r3.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Le
            return r0
        L25:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> T B3(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r2.size()
            java.util.ListIterator r2 = r2.listIterator(r0)
        L12:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r2.previous()
            java.lang.Object r1 = r3.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L12
            return r0
        L29:
            r2 = 0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <T, C extends java.lang.Iterable<? extends T>> C B4(@org.jetbrains.annotations.NotNull C r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, kotlin.n1> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r0 = r2.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            r3.invoke(r1)
            goto Le
        L1c:
            return r2
    }

    @kotlin.Deprecated(message = "Use sumOf instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final <T> int B5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Integer> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        Lf:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r0 = r0 + r1
            goto Lf
        L25:
            return r0
    }

    public static final <T> boolean C1(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r2 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L19
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L19
            return r1
        L19:
            java.util.Iterator r2 = r2.iterator()
        L1d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1d
            r2 = 1
            return r2
        L35:
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> T C2(java.lang.Iterable<? extends T> r3, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r3.next()
            java.lang.Object r2 = r4.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lf
            r0 = r1
            goto Lf
        L27:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T, R> java.util.List<R> C3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.i0.d0(r2, r1)
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            r0.add(r1)
            goto L19
        L2b:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <T, C extends java.lang.Iterable<? extends T>> C C4(@org.jetbrains.annotations.NotNull C r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, kotlin.n1> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r0 = r4.iterator()
            r1 = 0
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.next()
            int r3 = r1 + 1
            if (r1 >= 0) goto L20
            kotlin.collections.h0.b0()
        L20:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.invoke(r1, r2)
            r1 = r3
            goto Lf
        L29:
            return r4
    }

    @kotlin.Deprecated(message = "Use sumOf instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final <T> double C5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L10:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = r0 + r2
            goto L10
        L26:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Iterable<T> D1(java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> T D2(java.util.List<? extends T> r2, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r2.size()
            java.util.ListIterator r2 = r2.listIterator(r0)
        L12:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r2.previous()
            java.lang.Object r1 = r3.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L12
            return r0
        L29:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> java.util.List<R> D3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.i0.d0(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L1a:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r4.next()
            int r3 = r1 + 1
            if (r1 >= 0) goto L2b
            kotlin.collections.h0.b0()
        L2b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r5.invoke(r1, r2)
            r0.add(r1)
            r1 = r3
            goto L1a
        L38:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.Pair<java.util.List<T>, java.util.List<T>> D4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r4.next()
            java.lang.Object r3 = r5.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L32
            r0.add(r2)
            goto L18
        L32:
            r1.add(r2)
            goto L18
        L36:
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r0, r1)
            return r4
    }

    @kotlin.jvm.JvmName(name = "sumOfByte")
    public static final int D5(@org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Byte> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        La:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r2.next()
            java.lang.Number r1 = (java.lang.Number) r1
            byte r1 = r1.byteValue()
            int r0 = r0 + r1
            goto La
        L1c:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.sequences.m<T> E1(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.r0$a r0 = new kotlin.collections.r0$a
            r0.<init>(r1)
            return r0
    }

    public static <T> T E2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L10
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = G2(r1)
            return r1
        L10:
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r1 = r1.next()
            return r1
        L1f:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection is empty."
            r1.<init>(r0)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> java.util.List<R> E3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L14:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r4.next()
            int r3 = r1 + 1
            if (r1 >= 0) goto L25
            kotlin.collections.h0.b0()
        L25:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r5.invoke(r1, r2)
            if (r1 == 0) goto L32
            r0.add(r1)
        L32:
            r1 = r3
            goto L14
        L34:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> E4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L15
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r1 = I4(r1, r2)
            return r1
        L15:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlin.collections.m0.s0(r0, r1)
            kotlin.collections.m0.s0(r0, r2)
            return r0
    }

    @kotlin.jvm.JvmName(name = "sumOfDouble")
    public static final double E5(@org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Double> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        Lb:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r4.next()
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = r0 + r2
            goto Lb
        L1d:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K, V> java.util.Map<K, V> F1(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends kotlin.Pair<? extends K, ? extends V>> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 10
            int r0 = kotlin.collections.i0.d0(r3, r0)
            int r0 = kotlin.collections.k1.j(r0)
            r1 = 16
            int r0 = kotlin.ranges.t.u(r0, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r4.invoke(r0)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r2 = r0.getFirst()
            java.lang.Object r0 = r0.getSecond()
            r1.put(r2, r0)
            goto L23
        L3f:
            return r1
    }

    public static final <T> T F2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r3.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Le
            return r0
        L25:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r3 = "Collection contains no element matching the predicate."
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R, C extends java.util.Collection<? super R>> C F3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull C r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L14:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r3.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L25
            kotlin.collections.h0.b0()
        L25:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r5.invoke(r0, r1)
            if (r0 == 0) goto L32
            r4.add(r0)
        L32:
            r0 = r2
            goto L14
        L34:
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> F4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L10
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r1 = J4(r1, r2)
            return r1
        L10:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlin.collections.m0.s0(r0, r1)
            r0.add(r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfDouble")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final <T> double F5(java.lang.Iterable<? extends T> r4, kotlin.jvm.functions.Function1<? super T, java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L10:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = r0 + r2
            goto L10
        L26:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K> java.util.Map<K, T> G1(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "keySelector"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 10
            int r0 = kotlin.collections.i0.d0(r3, r0)
            int r0 = kotlin.collections.k1.j(r0)
            r1 = 16
            int r0 = kotlin.ranges.t.u(r0, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.invoke(r0)
            r1.put(r2, r0)
            goto L23
        L35:
            return r1
    }

    public static <T> T G2(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L11
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            return r1
        L11:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "List is empty."
            r1.<init>(r0)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R, C extends java.util.Collection<? super R>> C G3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull C r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L14:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r3.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L25
            kotlin.collections.h0.b0()
        L25:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r5.invoke(r0, r1)
            r4.add(r0)
            r0 = r2
            goto L14
        L32:
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> G4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlin.collections.m0.s0(r0, r1)
            kotlin.collections.m0.t0(r0, r2)
            return r0
    }

    @kotlin.jvm.JvmName(name = "sumOfFloat")
    public static final float G5(@org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Float> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        La:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r2.next()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = r0 + r1
            goto La
        L1c:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K, V> java.util.Map<K, V> H1(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends V> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "keySelector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "valueTransform"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 10
            int r0 = kotlin.collections.i0.d0(r3, r0)
            int r0 = kotlin.collections.k1.j(r0)
            r1 = 16
            int r0 = kotlin.ranges.t.u(r0, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.Iterator r3 = r3.iterator()
        L28:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.invoke(r0)
            java.lang.Object r0 = r5.invoke(r0)
            r1.put(r2, r0)
            goto L28
        L3e:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final <T, R> R H2(java.lang.Iterable<? extends T> r1, kotlin.jvm.functions.Function1<? super T, ? extends R> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r2.invoke(r0)
            if (r0 != 0) goto L20
            goto Le
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L23
            return r0
        L23:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "No element of the collection was transformed to a non-null value."
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> java.util.List<R> H3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            if (r1 == 0) goto L13
            r0.add(r1)
            goto L13
        L27:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> H4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L15
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r1 = L4(r1, r2)
            return r1
        L15:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlin.collections.m0.s0(r0, r1)
            kotlin.collections.m0.u0(r0, r2)
            return r0
    }

    @kotlin.jvm.JvmName(name = "sumOfInt")
    public static int H5(@org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Integer> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        La:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r2.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r0 = r0 + r1
            goto La
        L1c:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K, M extends java.util.Map<? super K, ? super T>> M I1(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull M r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "keySelector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r4.invoke(r0)
            r3.put(r1, r0)
            goto L13
        L25:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final <T, R> R I2(java.lang.Iterable<? extends T> r1, kotlin.jvm.functions.Function1<? super T, ? extends R> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r2.invoke(r0)
            if (r0 == 0) goto Le
            return r0
        L1f:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R, C extends java.util.Collection<? super R>> C I3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull C r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r3.invoke(r0)
            if (r0 == 0) goto L13
            r2.add(r0)
            goto L13
        L27:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> I4(@org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r3, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L25
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            java.util.Collection r4 = (java.util.Collection) r4
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            r0.addAll(r3)
            r0.addAll(r4)
            return r0
        L25:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            kotlin.collections.m0.s0(r0, r4)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfInt")
    private static final <T> int I5(java.lang.Iterable<? extends T> r2, kotlin.jvm.functions.Function1<? super T, java.lang.Integer> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        Lf:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r0 = r0 + r1
            goto Lf
        L25:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K, V, M extends java.util.Map<? super K, ? super V>> M J1(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull M r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends V> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "keySelector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "valueTransform"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r4.invoke(r0)
            java.lang.Object r0 = r5.invoke(r0)
            r3.put(r1, r0)
            goto L18
        L2e:
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static <T> T J2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2 instanceof java.util.List
            r1 = 0
            if (r0 == 0) goto L19
            java.util.List r2 = (java.util.List) r2
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            return r1
        L13:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            return r2
        L19:
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L24
            return r1
        L24:
            java.lang.Object r2 = r2.next()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R, C extends java.util.Collection<? super R>> C J3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull C r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r3.invoke(r0)
            r2.add(r0)
            goto L13
        L25:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> J4(@org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r2, T r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.addAll(r2)
            r0.add(r3)
            return r0
    }

    @kotlin.jvm.JvmName(name = "sumOfLong")
    public static final long J5(@org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Long> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        Lb:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r4.next()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            long r0 = r0 + r2
            goto Lb
        L1d:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K, V, M extends java.util.Map<? super K, ? super V>> M K1(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull M r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends kotlin.Pair<? extends K, ? extends V>> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r4.invoke(r0)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r1 = r0.getFirst()
            java.lang.Object r0 = r0.getSecond()
            r3.put(r1, r0)
            goto L13
        L2f:
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> T K2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r3.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Le
            return r0
        L25:
            r2 = 0
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final <T, R extends java.lang.Comparable<? super R>> T K3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L16
            r5 = 0
            return r5
        L16:
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L21
            return r0
        L21:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L27:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 >= 0) goto L39
            r0 = r2
            r1 = r3
        L39:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L27
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> K4(@org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            int r1 = r1 + 10
            r0.<init>(r1)
            r0.addAll(r2)
            kotlin.collections.m0.t0(r0, r3)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfLong")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final <T> long K5(java.lang.Iterable<? extends T> r4, kotlin.jvm.functions.Function1<? super T, java.lang.Long> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L10:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            long r0 = r0 + r2
            goto L10
        L26:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final <K, V> java.util.Map<K, V> L1(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends K> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super K, ? extends V> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "valueSelector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 10
            int r1 = kotlin.collections.i0.d0(r3, r1)
            int r1 = kotlin.collections.k1.j(r1)
            r2 = 16
            int r1 = kotlin.ranges.t.u(r1, r2)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r3.next()
            java.lang.Object r2 = r4.invoke(r1)
            r0.put(r1, r2)
            goto L23
        L35:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static <T> T L2(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r1 = 0
            return r1
        Ld:
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.jvm.JvmName(name = "maxByOrThrow")
    public static final <T, R extends java.lang.Comparable<? super R>> T L3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L1f
            return r0
        L1f:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L25:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 >= 0) goto L37
            r0 = r2
            r1 = r3
        L37:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L25
            return r0
        L3e:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            r5.<init>()
            throw r5
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> L4(@org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r3, @org.jetbrains.annotations.NotNull T[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            int r2 = r4.length
            int r1 = r1 + r2
            r0.<init>(r1)
            r0.addAll(r3)
            kotlin.collections.m0.u0(r0, r4)
            return r0
    }

    @kotlin.jvm.JvmName(name = "sumOfShort")
    public static final int L5(@org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Short> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        La:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r2.next()
            java.lang.Number r1 = (java.lang.Number) r1
            short r1 = r1.shortValue()
            int r0 = r0 + r1
            goto La
        L1c:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M M1(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends K> r2, @org.jetbrains.annotations.NotNull M r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super K, ? extends V> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "valueSelector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r4.invoke(r0)
            r3.put(r0, r1)
            goto L13
        L25:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> java.util.List<R> M2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Iterable<? extends R>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.collections.m0.s0(r0, r1)
            goto L13
        L27:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T> double M3(java.lang.Iterable<? extends T> r4, kotlin.jvm.functions.Function1<? super T, java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r4.next()
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L22:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.max(r0, r2)
            goto L22
        L3b:
            return r0
        L3c:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            r4.<init>()
            throw r4
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.List<T> M4(java.lang.Iterable<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.List r1 = F4(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfUInt")
    private static final <T> int M5(java.lang.Iterable<? extends T> r2, kotlin.jvm.functions.Function1<? super T, kotlin.z0> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            int r0 = kotlin.z0.k(r0)
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            kotlin.z0 r1 = (kotlin.z0) r1
            int r1 = r1.q0()
            int r0 = r0 + r1
            int r0 = kotlin.z0.k(r0)
            goto L13
        L2d:
            return r0
    }

    @kotlin.jvm.JvmName(name = "averageOfByte")
    public static final double N1(@org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Byte> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r2 = 0
        Lc:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r5.next()
            java.lang.Number r3 = (java.lang.Number) r3
            byte r3 = r3.byteValue()
            double r3 = (double) r3
            double r0 = r0 + r3
            int r2 = r2 + 1
            if (r2 >= 0) goto Lc
            kotlin.collections.h0.a0()
            goto Lc
        L26:
            if (r2 != 0) goto L2b
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L2b:
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "flatMapIndexedIterable")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final <T, R> java.util.List<R> N2(java.lang.Iterable<? extends T> r4, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Iterable<? extends R>> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L14:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r4.next()
            int r3 = r1 + 1
            if (r1 >= 0) goto L25
            kotlin.collections.h0.b0()
        L25:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r5.invoke(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.collections.m0.s0(r0, r1)
            r1 = r3
            goto L14
        L34:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T> float N3(java.lang.Iterable<? extends T> r2, kotlin.jvm.functions.Function1<? super T, java.lang.Float> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L22:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.max(r0, r1)
            goto L22
        L3b:
            return r0
        L3c:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.List<T> N4(java.util.Collection<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.List r1 = J4(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfULong")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final <T> long N5(java.lang.Iterable<? extends T> r4, kotlin.jvm.functions.Function1<? super T, kotlin.d1> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 0
            long r0 = kotlin.d1.k(r0)
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            kotlin.d1 r2 = (kotlin.d1) r2
            long r2 = r2.q0()
            long r0 = r0 + r2
            long r0 = kotlin.d1.k(r0)
            goto L14
        L2e:
            return r0
    }

    @kotlin.jvm.JvmName(name = "averageOfDouble")
    public static double O1(@org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r2 = 0
        Lc:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L25
            java.lang.Object r3 = r5.next()
            java.lang.Number r3 = (java.lang.Number) r3
            double r3 = r3.doubleValue()
            double r0 = r0 + r3
            int r2 = r2 + 1
            if (r2 >= 0) goto Lc
            kotlin.collections.h0.a0()
            goto Lc
        L25:
            if (r2 != 0) goto L2a
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L2a:
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "flatMapIndexedIterableTo")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final <T, R, C extends java.util.Collection<? super R>> C O2(java.lang.Iterable<? extends T> r3, C r4, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Iterable<? extends R>> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L14:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r3.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L25
            kotlin.collections.h0.b0()
        L25:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r5.invoke(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.m0.s0(r4, r0)
            r0 = r2
            goto L14
        L34:
            return r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T, R extends java.lang.Comparable<? super R>> R O3(java.lang.Iterable<? extends T> r3, kotlin.jvm.functions.Function1<? super T, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L1e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L1e
            r0 = r1
            goto L1e
        L36:
            return r0
        L37:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <T> T O4(java.util.Collection<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.random.Random$Default r0 = kotlin.random.Random.Default
            java.lang.Object r1 = P4(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> O5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            if (r5 < 0) goto L4b
            if (r5 != 0) goto Le
            java.util.List r4 = kotlin.collections.h0.J()
            return r4
        Le:
            boolean r0 = r4 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L2c
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            if (r5 < r0) goto L21
            java.util.List r4 = a6(r4)
            return r4
        L21:
            if (r5 != r1) goto L2c
            java.lang.Object r4 = E2(r4)
            java.util.List r4 = kotlin.collections.g0.l(r4)
            return r4
        L2c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
            r2 = 0
        L36:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L46
            java.lang.Object r3 = r4.next()
            r0.add(r3)
            int r2 = r2 + r1
            if (r2 != r5) goto L36
        L46:
            java.util.List r4 = kotlin.collections.h0.V(r0)
            return r4
        L4b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Requested element count "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r5 = " is less than zero."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    @kotlin.jvm.JvmName(name = "averageOfFloat")
    public static final double P1(@org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Float> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r2 = 0
        Lc:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r5.next()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            double r3 = (double) r3
            double r0 = r0 + r3
            int r2 = r2 + 1
            if (r2 >= 0) goto Lc
            kotlin.collections.h0.a0()
            goto Lc
        L26:
            if (r2 != 0) goto L2b
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L2b:
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "flatMapIndexedSequence")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final <T, R> java.util.List<R> P2(java.lang.Iterable<? extends T> r4, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends kotlin.sequences.m<? extends R>> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L14:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r4.next()
            int r3 = r1 + 1
            if (r1 >= 0) goto L25
            kotlin.collections.h0.b0()
        L25:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r5.invoke(r1, r2)
            kotlin.sequences.m r1 = (kotlin.sequences.m) r1
            kotlin.collections.m0.t0(r0, r1)
            r1 = r3
            goto L14
        L34:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T, R extends java.lang.Comparable<? super R>> R P3(java.lang.Iterable<? extends T> r3, kotlin.jvm.functions.Function1<? super T, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L16
            r3 = 0
            return r3
        L16:
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L20:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L20
            r0 = r1
            goto L20
        L38:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    public static final <T> T P4(@org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.random.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L20
            r0 = r1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            int r1 = r1.size()
            int r1 = r2.nextInt(r1)
            java.lang.Object r1 = k2(r0, r1)
            return r1
        L20:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Collection is empty."
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> P5(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            if (r4 < 0) goto L52
            if (r4 != 0) goto Le
            java.util.List r3 = kotlin.collections.h0.J()
            return r3
        Le:
            int r0 = r3.size()
            if (r4 < r0) goto L1b
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = a6(r3)
            return r3
        L1b:
            r1 = 1
            if (r4 != r1) goto L27
            java.lang.Object r3 = u3(r3)
            java.util.List r3 = kotlin.collections.g0.l(r3)
            return r3
        L27:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r4)
            boolean r2 = r3 instanceof java.util.RandomAccess
            if (r2 == 0) goto L3e
            int r4 = r0 - r4
        L32:
            if (r4 >= r0) goto L51
            java.lang.Object r2 = r3.get(r4)
            r1.add(r2)
            int r4 = r4 + 1
            goto L32
        L3e:
            int r0 = r0 - r4
            java.util.ListIterator r3 = r3.listIterator(r0)
        L43:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L51
            java.lang.Object r4 = r3.next()
            r1.add(r4)
            goto L43
        L51:
            return r1
        L52:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Requested element count "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = " is less than zero."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @kotlin.jvm.JvmName(name = "averageOfInt")
    public static double Q1(@org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Integer> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r2 = 0
        Lc:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r5.next()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            double r3 = (double) r3
            double r0 = r0 + r3
            int r2 = r2 + 1
            if (r2 >= 0) goto Lc
            kotlin.collections.h0.a0()
            goto Lc
        L26:
            if (r2 != 0) goto L2b
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L2b:
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "flatMapIndexedSequenceTo")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final <T, R, C extends java.util.Collection<? super R>> C Q2(java.lang.Iterable<? extends T> r3, C r4, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends kotlin.sequences.m<? extends R>> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L14:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r3.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L25
            kotlin.collections.h0.b0()
        L25:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r5.invoke(r0, r1)
            kotlin.sequences.m r0 = (kotlin.sequences.m) r0
            kotlin.collections.m0.t0(r4, r0)
            r0 = r2
            goto L14
        L34:
            return r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Double Q3(java.lang.Iterable<? extends T> r4, kotlin.jvm.functions.Function1<? super T, java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L16
            r4 = 0
            return r4
        L16:
            java.lang.Object r0 = r4.next()
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L24:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.max(r0, r2)
            goto L24
        L3d:
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            return r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    private static final <T> T Q4(java.util.Collection<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.random.Random$Default r0 = kotlin.random.Random.Default
            java.lang.Object r1 = R4(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> Q5(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L15
            java.util.List r2 = kotlin.collections.h0.J()
            return r2
        L15:
            int r0 = r2.size()
            java.util.ListIterator r0 = r2.listIterator(r0)
        L1d:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.previous()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L1d
            r0.next()
            int r2 = r2.size()
            int r3 = r0.nextIndex()
            int r2 = r2 - r3
            if (r2 != 0) goto L46
            java.util.List r2 = kotlin.collections.h0.J()
            return r2
        L46:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
        L4b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L59
            java.lang.Object r2 = r0.next()
            r3.add(r2)
            goto L4b
        L59:
            return r3
        L5a:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = a6(r2)
            return r2
    }

    @kotlin.jvm.JvmName(name = "averageOfLong")
    public static final double R1(@org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Long> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r2 = 0
        Lc:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r5.next()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            double r3 = (double) r3
            double r0 = r0 + r3
            int r2 = r2 + 1
            if (r2 >= 0) goto Lc
            kotlin.collections.h0.a0()
            goto Lc
        L26:
            if (r2 != 0) goto L2b
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L2b:
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.jvm.JvmName(name = "flatMapSequence")
    @org.jetbrains.annotations.NotNull
    @kotlin.OverloadResolutionByLambdaReturnType
    public static final <T, R> java.util.List<R> R2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends kotlin.sequences.m<? extends R>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            kotlin.sequences.m r1 = (kotlin.sequences.m) r1
            kotlin.collections.m0.t0(r0, r1)
            goto L13
        L27:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Float R3(java.lang.Iterable<? extends T> r2, kotlin.jvm.functions.Function1<? super T, java.lang.Float> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L16
            r2 = 0
            return r2
        L16:
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L24:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.max(r0, r1)
            goto L24
        L3d:
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final <T> T R4(@org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.random.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L12
            r1 = 0
            return r1
        L12:
            r0 = r1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            int r1 = r1.size()
            int r1 = r2.nextInt(r1)
            java.lang.Object r1 = k2(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> R5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r3.next()
            java.lang.Object r2 = r4.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L2a
            goto L2e
        L2a:
            r0.add(r1)
            goto L13
        L2e:
            return r0
    }

    @kotlin.jvm.JvmName(name = "averageOfShort")
    public static final double S1(@org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Short> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r2 = 0
        Lc:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r5.next()
            java.lang.Number r3 = (java.lang.Number) r3
            short r3 = r3.shortValue()
            double r3 = (double) r3
            double r0 = r0 + r3
            int r2 = r2 + 1
            if (r2 >= 0) goto Lc
            kotlin.collections.h0.a0()
            goto Lc
        L26:
            if (r2 != 0) goto L2b
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L2b:
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.jvm.JvmName(name = "flatMapSequenceTo")
    @org.jetbrains.annotations.NotNull
    @kotlin.OverloadResolutionByLambdaReturnType
    public static final <T, R, C extends java.util.Collection<? super R>> C S2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull C r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends kotlin.sequences.m<? extends R>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r3.invoke(r0)
            kotlin.sequences.m r0 = (kotlin.sequences.m) r0
            kotlin.collections.m0.t0(r2, r0)
            goto L13
        L27:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T, R> R S3(java.lang.Iterable<? extends T> r3, java.util.Comparator<? super R> r4, kotlin.jvm.functions.Function1<? super T, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r5.invoke(r0)
        L21:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r5.invoke(r1)
            int r2 = r4.compare(r0, r1)
            if (r2 >= 0) goto L21
            r0 = r1
            goto L21
        L37:
            return r0
        L38:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    public static final <S, T extends S> S S4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super S, ? super T, ? extends S> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r2.next()
        L18:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r3.invoke(r0, r1)
            goto L18
        L27:
            return r0
        L28:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "Empty collection can't be reduced."
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static final boolean[] S5(@org.jetbrains.annotations.NotNull java.util.Collection<java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.size()
            boolean[] r0 = new boolean[r0]
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L10:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r4.next()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            int r3 = r1 + 1
            r0[r1] = r2
            r1 = r3
            goto L10
        L26:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<java.util.List<T>> T1(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 1
            java.util.List r1 = i6(r1, r2, r2, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R, C extends java.util.Collection<? super R>> C T2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull C r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Iterable<? extends R>> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.m0.s0(r2, r0)
            goto L13
        L27:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T, R> R T3(java.lang.Iterable<? extends T> r3, java.util.Comparator<? super R> r4, kotlin.jvm.functions.Function1<? super T, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L1b
            r3 = 0
            return r3
        L1b:
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r5.invoke(r0)
        L23:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r5.invoke(r1)
            int r2 = r4.compare(r0, r1)
            if (r2 >= 0) goto L23
            r0 = r1
            goto L23
        L39:
            return r0
    }

    public static final <S, T extends S> S T4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super S, ? super T, ? extends S> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r4.next()
            r1 = 1
        L19:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L34
            int r2 = r1 + 1
            if (r1 >= 0) goto L26
            kotlin.collections.h0.b0()
        L26:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r4.next()
            java.lang.Object r0 = r5.invoke(r1, r0, r3)
            r1 = r2
            goto L19
        L34:
            return r0
        L35:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r5 = "Empty collection can't be reduced."
            r4.<init>(r5)
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public static byte[] T5(@org.jetbrains.annotations.NotNull java.util.Collection<java.lang.Byte> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.size()
            byte[] r0 = new byte[r0]
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L10:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r4.next()
            java.lang.Number r2 = (java.lang.Number) r2
            byte r2 = r2.byteValue()
            int r3 = r1 + 1
            r0[r1] = r2
            r1 = r3
            goto L10
        L26:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T, R> java.util.List<R> U1(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, int r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.List<? extends T>, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 1
            java.util.List r1 = j6(r1, r2, r2, r0, r3)
            return r1
    }

    public static final <T, R> R U2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, R r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super T, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r1.next()
            java.lang.Object r2 = r3.invoke(r2, r0)
            goto Le
        L1d:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static <T extends java.lang.Comparable<? super T>> T U3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L11
            r3 = 0
            return r3
        L11:
            java.lang.Object r0 = r3.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L17:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L17
            r0 = r1
            goto L17
        L2b:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final <S, T extends S> S U4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super S, ? super T, ? extends S> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L16
            r4 = 0
            return r4
        L16:
            java.lang.Object r0 = r4.next()
            r1 = 1
        L1b:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L36
            int r2 = r1 + 1
            if (r1 >= 0) goto L28
            kotlin.collections.h0.b0()
        L28:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r4.next()
            java.lang.Object r0 = r5.invoke(r1, r0, r3)
            r1 = r2
            goto L1b
        L36:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final char[] U5(@org.jetbrains.annotations.NotNull java.util.Collection<java.lang.Character> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.size()
            char[] r0 = new char[r0]
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L10:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r4.next()
            java.lang.Character r2 = (java.lang.Character) r2
            char r2 = r2.charValue()
            int r3 = r1 + 1
            r0[r1] = r2
            r1 = r3
            goto L10
        L26:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> T V1(java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    public static final <T, R> R V2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, R r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super R, ? super T, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r3.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L20
            kotlin.collections.h0.b0()
        L20:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r4 = r5.invoke(r0, r4, r1)
            r0 = r2
            goto Lf
        L2a:
            return r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static java.lang.Double V3(@org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Double> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L11
            r4 = 0
            return r4
        L11:
            java.lang.Object r0 = r4.next()
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L1b:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r4.next()
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.max(r0, r2)
            goto L1b
        L30:
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            return r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final <S, T extends S> S V4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super S, ? super T, ? extends S> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L16
            r2 = 0
            return r2
        L16:
            java.lang.Object r0 = r2.next()
        L1a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r3.invoke(r0, r1)
            goto L1a
        L29:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, C extends java.util.Collection<? super T>> C V5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull C r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r1.next()
            r2.add(r0)
            goto Le
        L1c:
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final <T> T W1(java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 1
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    public static final <T, R> R W2(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r1, R r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super R, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L27
            int r0 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r0)
        L18:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r1.previous()
            java.lang.Object r2 = r3.invoke(r0, r2)
            goto L18
        L27:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Float W3(@org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Float> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L11
            r2 = 0
            return r2
        L11:
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L1b:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r2.next()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.max(r0, r1)
            goto L1b
        L30:
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            return r2
    }

    public static final <S, T extends S> S W4(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super S, ? extends S> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r2.size()
            java.util.ListIterator r2 = r2.listIterator(r0)
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r2.previous()
        L1c:
            boolean r1 = r2.hasPrevious()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r2.previous()
            java.lang.Object r0 = r3.invoke(r1, r0)
            goto L1c
        L2b:
            return r0
        L2c:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "Empty list can't be reduced."
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static double[] W5(@org.jetbrains.annotations.NotNull java.util.Collection<java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.size()
            double[] r0 = new double[r0]
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        L10:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r5.next()
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            int r4 = r1 + 1
            r0[r1] = r2
            r1 = r4
            goto L10
        L26:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> T X1(java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 2
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    public static final <T, R> R X2(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2, R r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super R, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L2f
            int r0 = r2.size()
            java.util.ListIterator r2 = r2.listIterator(r0)
        L18:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L2f
            int r0 = r2.previousIndex()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r2.previous()
            java.lang.Object r3 = r4.invoke(r0, r1, r3)
            goto L18
        L2f:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.jvm.JvmName(name = "maxOrThrow")
    public static final double X3(@org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Double> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r4.next()
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L19:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r4.next()
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.max(r0, r2)
            goto L19
        L2e:
            return r0
        L2f:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            r4.<init>()
            throw r4
    }

    public static final <S, T extends S> S X4(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super S, ? extends S> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.size()
            java.util.ListIterator r3 = r3.listIterator(r0)
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r3.previous()
        L1c:
            boolean r1 = r3.hasPrevious()
            if (r1 == 0) goto L33
            int r1 = r3.previousIndex()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r3.previous()
            java.lang.Object r0 = r4.invoke(r1, r2, r0)
            goto L1c
        L33:
            return r0
        L34:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "Empty list can't be reduced."
            r3.<init>(r4)
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    public static final float[] X5(@org.jetbrains.annotations.NotNull java.util.Collection<java.lang.Float> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.size()
            float[] r0 = new float[r0]
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L10:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r4.next()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r3 = r1 + 1
            r0[r1] = r2
            r1 = r3
            goto L10
        L26:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> T Y1(java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 3
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    @kotlin.internal.HidesMembers
    public static final <T> void Y2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, kotlin.n1> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r1.next()
            r2.invoke(r0)
            goto Le
        L1c:
            return
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.jvm.JvmName(name = "maxOrThrow")
    public static final float Y3(@org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Float> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L19:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r2.next()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.max(r0, r1)
            goto L19
        L2e:
            return r0
        L2f:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final <S, T extends S> S Y4(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super S, ? extends S> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3.size()
            java.util.ListIterator r3 = r3.listIterator(r0)
            boolean r0 = r3.hasPrevious()
            if (r0 != 0) goto L1a
            r3 = 0
            return r3
        L1a:
            java.lang.Object r0 = r3.previous()
        L1e:
            boolean r1 = r3.hasPrevious()
            if (r1 == 0) goto L35
            int r1 = r3.previousIndex()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r3.previous()
            java.lang.Object r0 = r4.invoke(r1, r2, r0)
            goto L1e
        L35:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.HashSet<T> Y5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 12
            int r1 = kotlin.collections.i0.d0(r2, r1)
            int r1 = kotlin.collections.k1.j(r1)
            r0.<init>(r1)
            java.util.Collection r2 = V5(r2, r0)
            java.util.HashSet r2 = (java.util.HashSet) r2
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final <T> T Z1(java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 4
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    public static final <T> void Z2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, kotlin.n1> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r3.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L20
            kotlin.collections.h0.b0()
        L20:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.invoke(r0, r1)
            r0 = r2
            goto Lf
        L29:
            return
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.jvm.JvmName(name = "maxOrThrow")
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> T Z3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L15:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L15
            r0 = r1
            goto L15
        L29:
            return r0
        L2a:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final <S, T extends S> S Z4(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super S, ? extends S> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r2.size()
            java.util.ListIterator r2 = r2.listIterator(r0)
            boolean r0 = r2.hasPrevious()
            if (r0 != 0) goto L1a
            r2 = 0
            return r2
        L1a:
            java.lang.Object r0 = r2.previous()
        L1e:
            boolean r1 = r2.hasPrevious()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r2.previous()
            java.lang.Object r0 = r3.invoke(r1, r0)
            goto L1e
        L2d:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static int[] Z5(@org.jetbrains.annotations.NotNull java.util.Collection<java.lang.Integer> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.size()
            int[] r0 = new int[r0]
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L10:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r4.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r3 = r1 + 1
            r0[r1] = r2
            r1 = r3
            goto L10
        L26:
            return r0
    }

    public static <T> boolean a2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L10
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.contains(r2)
            return r1
        L10:
            int r1 = h3(r1, r2)
            if (r1 < 0) goto L18
            r1 = 1
            return r1
        L18:
            r1 = 0
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> T a3(java.util.List<? extends T> r1, int r2, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r3, r0)
            if (r2 < 0) goto L17
            int r0 = r1.size()
            if (r2 >= r0) goto L17
            java.lang.Object r1 = r1.get(r2)
            return r1
        L17:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r3.invoke(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final <T> T a4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L16
            r3 = 0
            return r3
        L16:
            java.lang.Object r0 = r3.next()
        L1a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            int r2 = r4.compare(r0, r1)
            if (r2 >= 0) goto L1a
            r0 = r1
            goto L1a
        L2c:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.lang.Iterable<T> a5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r0 = r3.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            if (r1 == 0) goto L16
            goto L9
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "null element found in "
            r1.append(r2)
            r1.append(r3)
            r3 = 46
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L32:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> a6(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L38
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            if (r1 == 0) goto L33
            r2 = 1
            if (r1 == r2) goto L1a
            java.util.List r3 = d6(r0)
            return r3
        L1a:
            boolean r1 = r3 instanceof java.util.List
            if (r1 == 0) goto L26
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            goto L2e
        L26:
            java.util.Iterator r3 = r0.iterator()
            java.lang.Object r3 = r3.next()
        L2e:
            java.util.List r3 = kotlin.collections.g0.l(r3)
            return r3
        L33:
            java.util.List r3 = kotlin.collections.h0.J()
            return r3
        L38:
            java.util.List r3 = c6(r3)
            java.util.List r3 = kotlin.collections.h0.V(r3)
            return r3
    }

    public static final <T> int b2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L10
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            return r2
        L10:
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        L15:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L26
            r2.next()
            int r0 = r0 + 1
            if (r0 >= 0) goto L15
            kotlin.collections.h0.a0()
            goto L15
        L26:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static <T> T b3(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            if (r2 < 0) goto L12
            int r0 = r1.size()
            if (r2 >= r0) goto L12
            java.lang.Object r1 = r1.get(r2)
            return r1
        L12:
            r1 = 0
            return r1
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.jvm.JvmName(name = "maxWithOrThrow")
    public static final <T> T b4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r3.next()
        L18:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r3.next()
            int r2 = r4.compare(r0, r1)
            if (r2 >= 0) goto L18
            r0 = r1
            goto L18
        L2a:
            return r0
        L2b:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> b5(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r0 = r3.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            if (r1 == 0) goto L16
            goto L9
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "null element found in "
            r1.append(r2)
            r1.append(r3)
            r3 = 46
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L32:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final long[] b6(@org.jetbrains.annotations.NotNull java.util.Collection<java.lang.Long> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.size()
            long[] r0 = new long[r0]
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        L10:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r5.next()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            int r4 = r1 + 1
            r0[r1] = r2
            r1 = r4
            goto L10
        L26:
            return r0
    }

    public static final <T> int c2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r2 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L19
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L19
            return r1
        L19:
            java.util.Iterator r2 = r2.iterator()
        L1d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1d
            int r1 = r1 + 1
            if (r1 >= 0) goto L1d
            kotlin.collections.h0.a0()
            goto L1d
        L3b:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K> java.util.Map<K, java.util.List<T>> c3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "keySelector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r4.next()
            java.lang.Object r2 = r5.invoke(r1)
            java.lang.Object r3 = r0.get(r2)
            if (r3 != 0) goto L2f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.put(r2, r3)
        L2f:
            java.util.List r3 = (java.util.List) r3
            r3.add(r1)
            goto L13
        L35:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final <T, R extends java.lang.Comparable<? super R>> T c4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L16
            r5 = 0
            return r5
        L16:
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L21
            return r0
        L21:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L27:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 <= 0) goto L39
            r0 = r2
            r1 = r3
        L39:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L27
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> c5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L18
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            r1 = 1
            if (r0 > r1) goto L18
            java.util.List r2 = a6(r2)
            return r2
        L18:
            java.util.List r2 = c6(r2)
            kotlin.collections.o0.t1(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> c6(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L10
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r1 = d6(r1)
            return r1
        L10:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r1 = V5(r1, r0)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> int d2(java.util.Collection<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.size()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K, V> java.util.Map<K, java.util.List<V>> d3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends V> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "keySelector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "valueTransform"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r4.next()
            java.lang.Object r2 = r5.invoke(r1)
            java.lang.Object r3 = r0.get(r2)
            if (r3 != 0) goto L34
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.put(r2, r3)
        L34:
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r1 = r6.invoke(r1)
            r3.add(r1)
            goto L18
        L3e:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.jvm.JvmName(name = "minByOrThrow")
    public static final <T, R extends java.lang.Comparable<? super R>> T d4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L1f
            return r0
        L1f:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L25:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 <= 0) goto L37
            r0 = r2
            r1 = r3
        L37:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L25
            return r0
        L3e:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            r5.<init>()
            throw r5
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <T, R> java.util.List<R> d5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, R r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super T, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 9
            int r0 = kotlin.collections.i0.d0(r2, r0)
            if (r0 != 0) goto L17
            java.util.List r2 = kotlin.collections.g0.l(r3)
            return r2
        L17:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = r0 + 1
            r1.<init>(r0)
            r1.add(r3)
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r2.next()
            java.lang.Object r3 = r4.invoke(r3, r0)
            r1.add(r3)
            goto L25
        L37:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> d6(@org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> e2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Set r1 = e6(r1)
            java.util.List r1 = a6(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K, M extends java.util.Map<? super K, java.util.List<T>>> M e3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull M r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "keySelector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r3.next()
            java.lang.Object r1 = r5.invoke(r0)
            java.lang.Object r2 = r4.get(r1)
            if (r2 != 0) goto L2f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.put(r1, r2)
        L2f:
            java.util.List r2 = (java.util.List) r2
            r2.add(r0)
            goto L13
        L35:
            return r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T> double e4(java.lang.Iterable<? extends T> r4, kotlin.jvm.functions.Function1<? super T, java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r4.next()
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L22:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.min(r0, r2)
            goto L22
        L3b:
            return r0
        L3c:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            r4.<init>()
            throw r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <T, R> java.util.List<R> e5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4, R r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super R, ? super T, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 9
            int r0 = kotlin.collections.i0.d0(r4, r0)
            if (r0 != 0) goto L17
            java.util.List r4 = kotlin.collections.g0.l(r5)
            return r4
        L17:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = r0 + 1
            r1.<init>(r0)
            r1.add(r5)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L26:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r4.next()
            int r3 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r5 = r6.invoke(r0, r5, r2)
            r1.add(r5)
            r0 = r3
            goto L26
        L3f:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.Set<T> e6(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L11
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            return r0
        L11:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Collection r1 = V5(r1, r0)
            java.util.Set r1 = (java.util.Set) r1
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K> java.util.List<T> f2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r4.next()
            java.lang.Object r3 = r5.invoke(r2)
            boolean r3 = r0.add(r3)
            if (r3 == 0) goto L18
            r1.add(r2)
            goto L18
        L30:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K, V, M extends java.util.Map<? super K, java.util.List<V>>> M f3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull M r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends V> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "keySelector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "valueTransform"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Iterator r3 = r3.iterator()
        L18:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r3.next()
            java.lang.Object r1 = r5.invoke(r0)
            java.lang.Object r2 = r4.get(r1)
            if (r2 != 0) goto L34
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.put(r1, r2)
        L34:
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r6.invoke(r0)
            r2.add(r0)
            goto L18
        L3e:
            return r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T> float f4(java.lang.Iterable<? extends T> r2, kotlin.jvm.functions.Function1<? super T, java.lang.Float> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L22:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.min(r0, r1)
            goto L22
        L3b:
            return r0
        L3c:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <S, T extends S> java.util.List<S> f5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super S, ? super T, ? extends S> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r0 = r4.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L19
            java.util.List r4 = kotlin.collections.h0.J()
            return r4
        L19:
            java.lang.Object r1 = r0.next()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.i0.d0(r4, r3)
            r2.<init>(r4)
            r2.add(r1)
        L2b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L3d
            java.lang.Object r4 = r0.next()
            java.lang.Object r1 = r5.invoke(r1, r4)
            r2.add(r1)
            goto L2b
        L3d:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.Set<T> f6(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L47
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            if (r1 == 0) goto L42
            r2 = 1
            if (r1 == r2) goto L29
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            int r0 = r0.size()
            int r0 = kotlin.collections.k1.j(r0)
            r1.<init>(r0)
            java.util.Collection r3 = V5(r3, r1)
            java.util.Set r3 = (java.util.Set) r3
            return r3
        L29:
            boolean r1 = r3 instanceof java.util.List
            if (r1 == 0) goto L35
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            goto L3d
        L35:
            java.util.Iterator r3 = r0.iterator()
            java.lang.Object r3 = r3.next()
        L3d:
            java.util.Set r3 = kotlin.collections.v1.f(r3)
            return r3
        L42:
            java.util.Set r3 = kotlin.collections.w1.k()
            return r3
        L47:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Collection r3 = V5(r3, r0)
            java.util.Set r3 = (java.util.Set) r3
            java.util.Set r3 = kotlin.collections.w1.r(r3)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> g2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            if (r4 < 0) goto L83
            if (r4 != 0) goto Le
            java.util.List r3 = a6(r3)
            return r3
        Le:
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L61
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            int r0 = r0 - r4
            if (r0 > 0) goto L21
            java.util.List r3 = kotlin.collections.h0.J()
            return r3
        L21:
            r1 = 1
            if (r0 != r1) goto L2d
            java.lang.Object r3 = s3(r3)
            java.util.List r3 = kotlin.collections.g0.l(r3)
            return r3
        L2d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L66
            boolean r0 = r3 instanceof java.util.RandomAccess
            if (r0 == 0) goto L4c
            java.util.List r3 = (java.util.List) r3
            int r0 = r3.size()
        L40:
            if (r4 >= r0) goto L60
            java.lang.Object r2 = r3.get(r4)
            r1.add(r2)
            int r4 = r4 + 1
            goto L40
        L4c:
            java.util.List r3 = (java.util.List) r3
            java.util.ListIterator r3 = r3.listIterator(r4)
        L52:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L60
            java.lang.Object r4 = r3.next()
            r1.add(r4)
            goto L52
        L60:
            return r1
        L61:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L66:
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L6b:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r3.next()
            if (r0 < r4) goto L7b
            r1.add(r2)
            goto L6b
        L7b:
            int r0 = r0 + 1
            goto L6b
        L7e:
            java.util.List r3 = kotlin.collections.h0.V(r1)
            return r3
        L83:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Requested element count "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = " is less than zero."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <T, K> kotlin.collections.w0<T, K> g3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "keySelector"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.collections.r0$b r0 = new kotlin.collections.r0$b
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T, R extends java.lang.Comparable<? super R>> R g4(java.lang.Iterable<? extends T> r3, kotlin.jvm.functions.Function1<? super T, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L1e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 <= 0) goto L1e
            r0 = r1
            goto L1e
        L36:
            return r0
        L37:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <S, T extends S> java.util.List<S> g5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super S, ? super T, ? extends S> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Iterator r0 = r5.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L19
            java.util.List r5 = kotlin.collections.h0.J()
            return r5
        L19:
            java.lang.Object r1 = r0.next()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r5 = kotlin.collections.i0.d0(r5, r3)
            r2.<init>(r5)
            r2.add(r1)
            r5 = 1
        L2c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L45
            int r3 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r0.next()
            java.lang.Object r1 = r6.invoke(r5, r1, r4)
            r2.add(r1)
            r5 = r3
            goto L2c
        L45:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final short[] g6(@org.jetbrains.annotations.NotNull java.util.Collection<java.lang.Short> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.size()
            short[] r0 = new short[r0]
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L10:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r4.next()
            java.lang.Number r2 = (java.lang.Number) r2
            short r2 = r2.shortValue()
            int r3 = r1 + 1
            r0[r1] = r2
            r1 = r3
            goto L10
        L26:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> h2(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            if (r2 < 0) goto L19
            r0 = r1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            int r1 = r1.size()
            int r1 = r1 - r2
            r2 = 0
            int r1 = kotlin.ranges.t.u(r1, r2)
            java.util.List r1 = O5(r0, r1)
            return r1
        L19:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Requested element count "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = " is less than zero."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final <T> int h3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, T r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L10
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.indexOf(r3)
            return r2
        L10:
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        L15:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r2.next()
            if (r0 >= 0) goto L24
            kotlin.collections.h0.b0()
        L24:
            boolean r1 = kotlin.jvm.internal.g0.g(r3, r1)
            if (r1 == 0) goto L2b
            return r0
        L2b:
            int r0 = r0 + 1
            goto L15
        L2e:
            r2 = -1
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T, R extends java.lang.Comparable<? super R>> R h4(java.lang.Iterable<? extends T> r3, kotlin.jvm.functions.Function1<? super T, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L16
            r3 = 0
            return r3
        L16:
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L20:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 <= 0) goto L20
            r0 = r1
            goto L20
        L38:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <T, R> java.util.List<R> h5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, R r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super T, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 9
            int r0 = kotlin.collections.i0.d0(r2, r0)
            if (r0 != 0) goto L17
            java.util.List r2 = kotlin.collections.g0.l(r3)
            return r2
        L17:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = r0 + 1
            r1.<init>(r0)
            r1.add(r3)
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r2.next()
            java.lang.Object r3 = r4.invoke(r3, r0)
            r1.add(r3)
            goto L25
        L37:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.Set<T> h6(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set r1 = e6(r1)
            kotlin.collections.m0.s0(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> i2(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L3b
            int r0 = r2.size()
            java.util.ListIterator r0 = r2.listIterator(r0)
        L18:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.previous()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L18
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            int r3 = r0.nextIndex()
            int r3 = r3 + 1
            java.util.List r2 = O5(r2, r3)
            return r2
        L3b:
            java.util.List r2 = kotlin.collections.h0.J()
            return r2
    }

    public static final <T> int i3(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.indexOf(r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Double i4(java.lang.Iterable<? extends T> r4, kotlin.jvm.functions.Function1<? super T, java.lang.Double> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L16
            r4 = 0
            return r4
        L16:
            java.lang.Object r0 = r4.next()
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L24:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r4.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.min(r0, r2)
            goto L24
        L3d:
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            return r4
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final <T, R> java.util.List<R> i5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4, R r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super R, ? super T, ? extends R> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 9
            int r0 = kotlin.collections.i0.d0(r4, r0)
            if (r0 != 0) goto L17
            java.util.List r4 = kotlin.collections.g0.l(r5)
            return r4
        L17:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = r0 + 1
            r1.<init>(r0)
            r1.add(r5)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L26:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r4.next()
            int r3 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r5 = r6.invoke(r0, r5, r2)
            r1.add(r5)
            r0 = r3
            goto L26
        L3f:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<java.util.List<T>> i6(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r8, int r9, int r10, boolean r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            kotlin.collections.z1.a(r9, r10)
            boolean r0 = r8 instanceof java.util.RandomAccess
            r1 = 0
            if (r0 == 0) goto L51
            boolean r0 = r8 instanceof java.util.List
            if (r0 == 0) goto L51
            java.util.List r8 = (java.util.List) r8
            int r0 = r8.size()
            int r2 = r0 / r10
            int r3 = r0 % r10
            if (r3 != 0) goto L1f
            r3 = 0
            goto L20
        L1f:
            r3 = 1
        L20:
            int r2 = r2 + r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r2 = 0
        L27:
            if (r2 < 0) goto L50
            if (r2 >= r0) goto L50
            int r4 = r0 - r2
            int r4 = kotlin.ranges.t.B(r9, r4)
            if (r4 >= r9) goto L37
            if (r11 == 0) goto L36
            goto L37
        L36:
            return r3
        L37:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            r6 = 0
        L3d:
            if (r6 >= r4) goto L4b
            int r7 = r6 + r2
            java.lang.Object r7 = r8.get(r7)
            r5.add(r7)
            int r6 = r6 + 1
            goto L3d
        L4b:
            r3.add(r5)
            int r2 = r2 + r10
            goto L27
        L50:
            return r3
        L51:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
            java.util.Iterator r8 = kotlin.collections.z1.b(r8, r9, r10, r11, r1)
        L5e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L6e
            java.lang.Object r9 = r8.next()
            java.util.List r9 = (java.util.List) r9
            r0.add(r9)
            goto L5e
        L6e:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> j2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L14:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r4.next()
            if (r1 == 0) goto L24
            r0.add(r2)
            goto L14
        L24:
            java.lang.Object r3 = r5.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L14
            r0.add(r2)
            r1 = 1
            goto L14
        L35:
            return r0
    }

    public static final <T> int j3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        Lf:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r2.next()
            if (r0 >= 0) goto L1e
            kotlin.collections.h0.b0()
        L1e:
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2b
            return r0
        L2b:
            int r0 = r0 + 1
            goto Lf
        L2e:
            r2 = -1
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Float j4(java.lang.Iterable<? extends T> r2, kotlin.jvm.functions.Function1<? super T, java.lang.Float> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L16
            r2 = 0
            return r2
        L16:
            java.lang.Object r0 = r2.next()
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L24:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.min(r0, r1)
            goto L24
        L3d:
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.3")
    public static final <T> void j5(@org.jetbrains.annotations.NotNull java.util.List<T> r3, @org.jetbrains.annotations.NotNull kotlin.random.Random r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = kotlin.collections.h0.L(r3)
        Le:
            if (r0 <= 0) goto L24
            int r1 = r0 + 1
            int r1 = r4.nextInt(r1)
            java.lang.Object r2 = r3.get(r1)
            java.lang.Object r2 = r3.set(r0, r2)
            r3.set(r1, r2)
            int r0 = r0 + (-1)
            goto Le
        L24:
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T, R> java.util.List<R> j6(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r5, int r6, int r7, boolean r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.List<? extends T>, ? extends R> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r9, r0)
            kotlin.collections.z1.a(r6, r7)
            boolean r0 = r5 instanceof java.util.RandomAccess
            r1 = 1
            if (r0 == 0) goto L4d
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L4d
            java.util.List r5 = (java.util.List) r5
            int r0 = r5.size()
            int r2 = r0 / r7
            int r3 = r0 % r7
            r4 = 0
            if (r3 != 0) goto L24
            r1 = 0
        L24:
            int r2 = r2 + r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            kotlin.collections.o1 r2 = new kotlin.collections.o1
            r2.<init>(r5)
        L2f:
            if (r4 < 0) goto L4c
            if (r4 >= r0) goto L4c
            int r5 = r0 - r4
            int r5 = kotlin.ranges.t.B(r6, r5)
            if (r8 != 0) goto L3f
            if (r5 < r6) goto L3e
            goto L3f
        L3e:
            return r1
        L3f:
            int r5 = r5 + r4
            r2.e(r4, r5)
            java.lang.Object r5 = r9.invoke(r2)
            r1.add(r5)
            int r4 = r4 + r7
            goto L2f
        L4c:
            return r1
        L4d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r5 = kotlin.collections.z1.b(r5, r6, r7, r8, r1)
        L5a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6e
            java.lang.Object r6 = r5.next()
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = r9.invoke(r6)
            r0.add(r6)
            goto L5a
        L6e:
            return r0
    }

    public static <T> T k2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L10
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r1.get(r2)
            return r1
        L10:
            kotlin.collections.q0 r0 = new kotlin.collections.q0
            r0.<init>(r2)
            java.lang.Object r1 = n2(r1, r2, r0)
            return r1
    }

    public static final <T> int k3(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        Lf:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L26
            return r0
        L26:
            int r0 = r0 + 1
            goto Lf
        L29:
            r2 = -1
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T, R> R k4(java.lang.Iterable<? extends T> r3, java.util.Comparator<? super R> r4, kotlin.jvm.functions.Function1<? super T, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r5.invoke(r0)
        L21:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r5.invoke(r1)
            int r2 = r4.compare(r0, r1)
            if (r2 <= 0) goto L21
            r0 = r1
            goto L21
        L37:
            return r0
        L38:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    public static <T> T k5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L10
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = m5(r1)
            return r1
        L10:
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r1.next()
            boolean r1 = r1.hasNext()
            if (r1 != 0) goto L25
            return r0
        L25:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Collection has more than one element."
            r1.<init>(r0)
            throw r1
        L2d:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection is empty."
            r1.<init>(r0)
            throw r1
    }

    public static /* synthetic */ java.util.List k6(java.lang.Iterable r0, int r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 1
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            r3 = 0
        La:
            java.util.List r0 = i6(r0, r1, r2, r3)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> T l2(java.util.List<? extends T> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Object r1 = r1.get(r2)
            return r1
    }

    public static final <T> int l3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = -1
            r1 = 0
        L10:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r3.next()
            if (r1 >= 0) goto L1f
            kotlin.collections.h0.b0()
        L1f:
            java.lang.Object r2 = r4.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2c
            r0 = r1
        L2c:
            int r1 = r1 + 1
            goto L10
        L2f:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.OverloadResolutionByLambdaReturnType
    @kotlin.internal.InlineOnly
    private static final <T, R> R l4(java.lang.Iterable<? extends T> r3, java.util.Comparator<? super R> r4, kotlin.jvm.functions.Function1<? super T, ? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L1b
            r3 = 0
            return r3
        L1b:
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r5.invoke(r0)
        L23:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = r5.invoke(r1)
            int r2 = r4.compare(r0, r1)
            if (r2 <= 0) goto L23
            r0 = r1
            goto L23
        L39:
            return r0
    }

    public static final <T> T l5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
            r1 = 0
        L10:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r4.next()
            java.lang.Object r3 = r5.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L10
            if (r1 != 0) goto L2b
            r1 = 1
            r0 = r2
            goto L10
        L2b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Collection contains more than one matching element."
            r4.<init>(r5)
            throw r4
        L33:
            if (r1 == 0) goto L36
            return r0
        L36:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Collection contains no element matching the predicate."
            r4.<init>(r5)
            throw r4
    }

    public static /* synthetic */ java.util.List l6(java.lang.Iterable r0, int r1, int r2, boolean r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L5
            r2 = 1
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto La
            r3 = 0
        La:
            java.util.List r0 = j6(r0, r1, r2, r3, r4)
            return r0
    }

    private static final java.lang.Object m2(int r2, int r3) {
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Collection doesn't contain element at index "
            r0.append(r1)
            r0.append(r2)
            r2 = 46
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public static final <T> int m3(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r0)
        L12:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r1.previous()
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L12
            int r1 = r1.nextIndex()
            return r1
        L2d:
            r1 = -1
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static <T extends java.lang.Comparable<? super T>> T m4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L11
            r3 = 0
            return r3
        L11:
            java.lang.Object r0 = r3.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L17:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 <= 0) goto L17
            r0 = r1
            goto L17
        L2b:
            return r0
    }

    public static <T> T m5(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.size()
            if (r0 == 0) goto L1c
            r1 = 1
            if (r0 != r1) goto L14
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            return r2
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "List has more than one element."
            r2.<init>(r0)
            throw r2
        L1c:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r0 = "List is empty."
            r2.<init>(r0)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.lang.Iterable<kotlin.collections.a1<T>> m6(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.collections.b1 r0 = new kotlin.collections.b1
            kotlin.collections.p0 r1 = new kotlin.collections.p0
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static final <T> T n2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, int r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L26
            java.util.List r3 = (java.util.List) r3
            if (r4 < 0) goto L1d
            int r0 = r3.size()
            if (r4 >= r0) goto L1d
            java.lang.Object r3 = r3.get(r4)
            return r3
        L1d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r5.invoke(r3)
            return r3
        L26:
            if (r4 >= 0) goto L31
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r5.invoke(r3)
            return r3
        L31:
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L36:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L47
            java.lang.Object r1 = r3.next()
            int r2 = r0 + 1
            if (r4 != r0) goto L45
            return r1
        L45:
            r0 = r2
            goto L36
        L47:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r5.invoke(r3)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.Set<T> n3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set r1 = e6(r1)
            kotlin.collections.m0.T0(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static java.lang.Double n4(@org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Double> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L11
            r4 = 0
            return r4
        L11:
            java.lang.Object r0 = r4.next()
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L1b:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r4.next()
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.min(r0, r2)
            goto L1b
        L30:
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            return r4
    }

    @org.jetbrains.annotations.Nullable
    public static <T> T n5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3 instanceof java.util.List
            r1 = 0
            if (r0 == 0) goto L1a
            java.util.List r3 = (java.util.List) r3
            int r0 = r3.size()
            r2 = 1
            if (r0 != r2) goto L19
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            return r3
        L19:
            return r1
        L1a:
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L25
            return r1
        L25:
            java.lang.Object r0 = r3.next()
            boolean r3 = r3.hasNext()
            if (r3 == 0) goto L30
            return r1
        L30:
            return r0
    }

    private static final java.util.Iterator n6(java.lang.Iterable r0) {
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> T o2(java.util.List<? extends T> r1, int r2, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r3, r0)
            if (r2 < 0) goto L17
            int r0 = r1.size()
            if (r2 >= r0) goto L17
            java.lang.Object r1 = r1.get(r2)
            return r1
        L17:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r3.invoke(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, A extends java.lang.Appendable> A o3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull A r3, @org.jetbrains.annotations.NotNull java.lang.CharSequence r4, @org.jetbrains.annotations.NotNull java.lang.CharSequence r5, @org.jetbrains.annotations.NotNull java.lang.CharSequence r6, int r7, @org.jetbrains.annotations.NotNull java.lang.CharSequence r8, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super T, ? extends java.lang.CharSequence> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "truncated"
            kotlin.jvm.internal.g0.p(r8, r0)
            r3.append(r5)
            java.util.Iterator r2 = r2.iterator()
            r5 = 0
        L26:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r2.next()
            int r5 = r5 + 1
            r1 = 1
            if (r5 <= r1) goto L38
            r3.append(r4)
        L38:
            if (r7 < 0) goto L3c
            if (r5 > r7) goto L40
        L3c:
            kotlin.text.u.b(r3, r0, r9)
            goto L26
        L40:
            if (r7 < 0) goto L47
            if (r5 <= r7) goto L47
            r3.append(r8)
        L47:
            r3.append(r6)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Float o4(@org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Float> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L11
            r2 = 0
            return r2
        L11:
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L1b:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r2.next()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.min(r0, r1)
            goto L1b
        L30:
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> T o5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = 0
            r2 = r0
        L11:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r5.next()
            java.lang.Object r4 = r6.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L11
            if (r1 == 0) goto L2a
            return r0
        L2a:
            r1 = 1
            r2 = r3
            goto L11
        L2d:
            if (r1 != 0) goto L30
            return r0
        L30:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static <T, R> java.util.List<kotlin.Pair<T, R>> o6(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r0 = r4.iterator()
            java.util.Iterator r1 = r5.iterator()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.i0.d0(r4, r3)
            int r5 = kotlin.collections.i0.d0(r5, r3)
            int r4 = java.lang.Math.min(r4, r5)
            r2.<init>(r4)
        L25:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L41
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L41
            java.lang.Object r4 = r0.next()
            java.lang.Object r5 = r1.next()
            kotlin.Pair r4 = kotlin.o0.a(r4, r5)
            r2.add(r4)
            goto L25
        L41:
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> T p2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r4 instanceof java.util.List
            if (r0 == 0) goto L10
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r4 = b3(r4, r5)
            return r4
        L10:
            r0 = 0
            if (r5 >= 0) goto L14
            return r0
        L14:
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L19:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r4.next()
            int r3 = r1 + 1
            if (r5 != r1) goto L28
            return r2
        L28:
            r1 = r3
            goto L19
        L2a:
            return r0
    }

    public static /* synthetic */ java.lang.Appendable p3(java.lang.Iterable r6, java.lang.Appendable r7, java.lang.CharSequence r8, java.lang.CharSequence r9, java.lang.CharSequence r10, int r11, java.lang.CharSequence r12, kotlin.jvm.functions.Function1 r13, int r14, java.lang.Object r15) {
            r0 = r14 & 2
            if (r0 == 0) goto L7
            java.lang.String r0 = ", "
            goto L8
        L7:
            r0 = r8
        L8:
            r1 = r14 & 4
            java.lang.String r2 = ""
            if (r1 == 0) goto L10
            r1 = r2
            goto L11
        L10:
            r1 = r9
        L11:
            r3 = r14 & 8
            if (r3 == 0) goto L16
            goto L17
        L16:
            r2 = r10
        L17:
            r3 = r14 & 16
            if (r3 == 0) goto L1d
            r3 = -1
            goto L1e
        L1d:
            r3 = r11
        L1e:
            r4 = r14 & 32
            if (r4 == 0) goto L25
            java.lang.String r4 = "..."
            goto L26
        L25:
            r4 = r12
        L26:
            r5 = r14 & 64
            if (r5 == 0) goto L34
            r5 = 0
            r15 = r5
        L2c:
            r8 = r6
            r9 = r7
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            goto L36
        L34:
            r15 = r13
            goto L2c
        L36:
            java.lang.Appendable r0 = o3(r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.jvm.JvmName(name = "minOrThrow")
    public static final double p4(@org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Double> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r4.next()
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
        L19:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r4.next()
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = java.lang.Math.min(r0, r2)
            goto L19
        L2e:
            return r0
        L2f:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            r4.<init>()
            throw r4
    }

    @org.jetbrains.annotations.Nullable
    public static <T> T p5(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L12
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            return r2
        L12:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R, V> java.util.List<V> p6(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends R> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super R, ? extends V> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Iterator r0 = r4.iterator()
            java.util.Iterator r1 = r5.iterator()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.i0.d0(r4, r3)
            int r5 = kotlin.collections.i0.d0(r5, r3)
            int r4 = java.lang.Math.min(r4, r5)
            r2.<init>(r4)
        L2a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L46
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L46
            java.lang.Object r4 = r0.next()
            java.lang.Object r5 = r1.next()
            java.lang.Object r4 = r6.invoke(r4, r5)
            r2.add(r4)
            goto L2a
        L46:
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final <T> T q2(java.util.List<? extends T> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Object r1 = b3(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.lang.String q3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r9, @org.jetbrains.annotations.NotNull java.lang.CharSequence r10, @org.jetbrains.annotations.NotNull java.lang.CharSequence r11, @org.jetbrains.annotations.NotNull java.lang.CharSequence r12, int r13, @org.jetbrains.annotations.NotNull java.lang.CharSequence r14, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super T, ? extends java.lang.CharSequence> r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "truncated"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            java.lang.Appendable r9 = o3(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.StringBuilder r9 = (java.lang.StringBuilder) r9
            java.lang.String r9 = r9.toString()
            return r9
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.jvm.JvmName(name = "minOrThrow")
    public static final float q4(@org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Float> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L19:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r2.next()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = java.lang.Math.min(r0, r1)
            goto L19
        L2e:
            return r0
        L2f:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> q5(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2, @org.jetbrains.annotations.NotNull java.lang.Iterable<java.lang.Integer> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "indices"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 10
            int r0 = kotlin.collections.i0.d0(r3, r0)
            if (r0 != 0) goto L17
            java.util.List r2 = kotlin.collections.h0.J()
            return r2
        L17:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.Iterator r3 = r3.iterator()
        L20:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Object r0 = r2.get(r0)
            r1.add(r0)
            goto L20
        L38:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> java.util.List<kotlin.Pair<T, R>> q6(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r5, @org.jetbrains.annotations.NotNull R[] r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r6.length
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.i0.d0(r5, r2)
            int r2 = java.lang.Math.min(r2, r0)
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
            r2 = 0
        L1f:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r3 = r5.next()
            if (r2 >= r0) goto L38
            int r4 = r2 + 1
            r2 = r6[r2]
            kotlin.Pair r2 = kotlin.o0.a(r3, r2)
            r1.add(r2)
            r2 = r4
            goto L1f
        L38:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> r2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r3.next()
            java.lang.Object r2 = r4.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L13
            r0.add(r1)
            goto L13
        L2d:
            return r0
    }

    public static /* synthetic */ java.lang.String r3(java.lang.Iterable r1, java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, int r5, java.lang.CharSequence r6, kotlin.jvm.functions.Function1 r7, int r8, java.lang.Object r9) {
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r2 = ", "
        L6:
            r9 = r8 & 2
            java.lang.String r0 = ""
            if (r9 == 0) goto Ld
            r3 = r0
        Ld:
            r9 = r8 & 4
            if (r9 == 0) goto L12
            r4 = r0
        L12:
            r9 = r8 & 8
            if (r9 == 0) goto L17
            r5 = -1
        L17:
            r9 = r8 & 16
            if (r9 == 0) goto L1d
            java.lang.String r6 = "..."
        L1d:
            r8 = r8 & 32
            if (r8 == 0) goto L22
            r7 = 0
        L22:
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            java.lang.String r1 = q3(r3, r4, r5, r6, r7, r8, r9)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.jvm.JvmName(name = "minOrThrow")
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> T r4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L15:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 <= 0) goto L15
            r0 = r1
            goto L15
        L29:
            return r0
        L2a:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> r5(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.ranges.m r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "indices"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L15
            java.util.List r1 = kotlin.collections.h0.J()
            return r1
        L15:
            java.lang.Integer r0 = r2.r()
            int r0 = r0.intValue()
            java.lang.Integer r2 = r2.q()
            int r2 = r2.intValue()
            int r2 = r2 + 1
            java.util.List r1 = r1.subList(r0, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = a6(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R, V> java.util.List<V> r6(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r5, @org.jetbrains.annotations.NotNull R[] r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super R, ? extends V> r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r7, r0)
            int r0 = r6.length
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.i0.d0(r5, r2)
            int r2 = java.lang.Math.min(r2, r0)
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
            r2 = 0
        L24:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r5.next()
            if (r2 >= r0) goto L3d
            int r4 = r2 + 1
            r2 = r6[r2]
            java.lang.Object r2 = r7.invoke(r3, r2)
            r1.add(r2)
            r2 = r4
            goto L24
        L3d:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> s2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, java.lang.Boolean> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L14:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r4.next()
            int r3 = r1 + 1
            if (r1 >= 0) goto L25
            kotlin.collections.h0.b0()
        L25:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r5.invoke(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L38
            r0.add(r2)
        L38:
            r1 = r3
            goto L14
        L3a:
            return r0
    }

    public static <T> T s3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L10
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = u3(r2)
            return r2
        L10:
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r2.next()
        L1e:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r0 = r2.next()
            goto L1e
        L29:
            return r0
        L2a:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection is empty."
            r2.<init>(r0)
            throw r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.Nullable
    public static final <T> T s4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L16
            r3 = 0
            return r3
        L16:
            java.lang.Object r0 = r3.next()
        L1a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            int r2 = r4.compare(r0, r1)
            if (r2 <= 0) goto L1a
            r0 = r1
            goto L1a
        L2c:
            return r0
    }

    public static final <T, R extends java.lang.Comparable<? super R>> void s5(@org.jetbrains.annotations.NotNull java.util.List<T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r2.size()
            r1 = 1
            if (r0 <= r1) goto L19
            kotlin.comparisons.g$a r0 = new kotlin.comparisons.g$a
            r0.<init>(r3)
            kotlin.collections.l0.r0(r2, r0)
        L19:
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<kotlin.Pair<T, T>> s6(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L14
            java.util.List r3 = kotlin.collections.h0.J()
            return r3
        L14:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r3.next()
        L1d:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r3.next()
            kotlin.Pair r1 = kotlin.o0.a(r1, r2)
            r0.add(r1)
            r1 = r2
            goto L1d
        L30:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, C extends java.util.Collection<? super T>> C t2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull C r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, java.lang.Boolean> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L14:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r3.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L25
            kotlin.collections.h0.b0()
        L25:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r5.invoke(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L38
            r4.add(r1)
        L38:
            r0 = r2
            goto L14
        L3a:
            return r4
    }

    public static final <T> T t3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
            r1 = 0
        L10:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r4.next()
            java.lang.Object r3 = r5.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L10
            r1 = 1
            r0 = r2
            goto L10
        L29:
            if (r1 == 0) goto L2c
            return r0
        L2c:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Collection contains no element matching the predicate."
            r4.<init>(r5)
            throw r4
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.jvm.JvmName(name = "minWithOrThrow")
    public static final <T> T t4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r3.next()
        L18:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r3.next()
            int r2 = r4.compare(r0, r1)
            if (r2 <= 0) goto L18
            r0 = r1
            goto L18
        L2a:
            return r0
        L2b:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    public static final <T, R extends java.lang.Comparable<? super R>> void t5(@org.jetbrains.annotations.NotNull java.util.List<T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r2.size()
            r1 = 1
            if (r0 <= r1) goto L19
            kotlin.comparisons.g$c r0 = new kotlin.comparisons.g$c
            r0.<init>(r3)
            kotlin.collections.l0.r0(r2, r0)
        L19:
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T, R> java.util.List<R> t6(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super T, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L19
            java.util.List r3 = kotlin.collections.h0.J()
            return r3
        L19:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r3.next()
        L22:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r3.next()
            java.lang.Object r1 = r4.invoke(r1, r2)
            r0.add(r1)
            r1 = r2
            goto L22
        L35:
            return r0
    }

    public static final /* synthetic */ <R> java.util.List<R> u2(java.lang.Iterable<?> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        Le:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r4.next()
            r2 = 3
            java.lang.String r3 = "R"
            kotlin.jvm.internal.g0.y(r2, r3)
            boolean r2 = androidx.activity.k.a(r1)
            if (r2 == 0) goto Le
            r0.add(r1)
            goto Le
        L28:
            return r0
    }

    public static <T> T u3(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L14
            int r0 = kotlin.collections.h0.L(r1)
            java.lang.Object r1 = r1.get(r0)
            return r1
        L14:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "List is empty."
            r1.<init>(r0)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> u4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Collection r4 = kotlin.collections.m0.v0(r4)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L19
            java.util.List r3 = a6(r3)
            return r3
        L19:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L22:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r3.next()
            boolean r2 = r4.contains(r1)
            if (r2 != 0) goto L22
            r0.add(r1)
            goto L22
        L36:
            return r0
    }

    public static final <T extends java.lang.Comparable<? super T>> void u5(@org.jetbrains.annotations.NotNull java.util.List<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Comparator r0 = kotlin.comparisons.a.x()
            kotlin.collections.l0.r0(r1, r0)
            return
    }

    public static final /* synthetic */ <R, C extends java.util.Collection<? super R>> C v2(java.lang.Iterable<?> r3, C r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r3.next()
            r1 = 3
            java.lang.String r2 = "R"
            kotlin.jvm.internal.g0.y(r1, r2)
            boolean r1 = androidx.activity.k.a(r0)
            if (r1 == 0) goto Le
            r4.add(r0)
            goto Le
        L28:
            return r4
    }

    public static final <T> T v3(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r2.size()
            java.util.ListIterator r2 = r2.listIterator(r0)
        L12:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r2.previous()
            java.lang.Object r1 = r3.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L12
            return r0
        L29:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r3 = "List contains no element matching the predicate."
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> v4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r6, T r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.i0.d0(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
            r2 = 0
        L16:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r6.next()
            r4 = 1
            if (r2 != 0) goto L2b
            boolean r5 = kotlin.jvm.internal.g0.g(r3, r7)
            if (r5 == 0) goto L2b
            r2 = 1
            r4 = 0
        L2b:
            if (r4 == 0) goto L16
            r0.add(r3)
            goto L16
        L31:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T extends java.lang.Comparable<? super T>> java.util.List<T> v5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L2a
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            r2 = 1
            if (r1 > r2) goto L18
            java.util.List r3 = a6(r3)
            return r3
        L18:
            r3 = 0
            java.lang.Comparable[] r3 = new java.lang.Comparable[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            r0 = r3
            java.lang.Comparable[] r0 = (java.lang.Comparable[]) r0
            kotlin.collections.q.U3(r0)
            java.util.List r3 = kotlin.collections.q.t(r3)
            return r3
        L2a:
            java.util.List r3 = c6(r3)
            kotlin.collections.l0.o0(r3)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> w2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r3.next()
            java.lang.Object r2 = r4.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L13
            r0.add(r1)
            goto L13
        L2d:
            return r0
    }

    public static final <T> int w3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, T r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L10
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.lastIndexOf(r4)
            return r3
        L10:
            java.util.Iterator r3 = r3.iterator()
            r0 = -1
            r1 = 0
        L16:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r3.next()
            if (r1 >= 0) goto L25
            kotlin.collections.h0.b0()
        L25:
            boolean r2 = kotlin.jvm.internal.g0.g(r4, r2)
            if (r2 == 0) goto L2c
            r0 = r1
        L2c:
            int r1 = r1 + 1
            goto L16
        L2f:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> w4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.List r4 = kotlin.sequences.p.I3(r4)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L19
            java.util.List r3 = a6(r3)
            return r3
        L19:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L22:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r3.next()
            boolean r2 = r4.contains(r1)
            if (r2 != 0) goto L22
            r0.add(r1)
            goto L22
        L36:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R extends java.lang.Comparable<? super R>> java.util.List<T> w5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.comparisons.g$a r0 = new kotlin.comparisons.g$a
            r0.<init>(r2)
            java.util.List r1 = z5(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> x2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r1 = y2(r1, r0)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public static final <T> int x3(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.lastIndexOf(r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> x4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull T[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            if (r0 != 0) goto L12
            java.util.List r3 = a6(r3)
            return r3
        L12:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L1b:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r3.next()
            boolean r2 = kotlin.collections.a0.B8(r4, r1)
            if (r2 != 0) goto L1b
            r0.add(r1)
            goto L1b
        L2f:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R extends java.lang.Comparable<? super R>> java.util.List<T> x5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.comparisons.g$c r0 = new kotlin.comparisons.g$c
            r0.<init>(r2)
            java.util.List r1 = z5(r1, r0)
            return r1
    }

    public static /* synthetic */ java.lang.Object y1(int r0, int r1) {
            java.lang.Object r0 = m2(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <C extends java.util.Collection<? super T>, T> C y2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull C r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r1.next()
            if (r0 == 0) goto Le
            r2.add(r0)
            goto Le
        L1e:
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static <T> T y3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2 instanceof java.util.List
            r1 = 0
            if (r0 == 0) goto L1e
            java.util.List r2 = (java.util.List) r2
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            return r1
        L13:
            int r0 = r2.size()
            int r0 = r0 + (-1)
            java.lang.Object r2 = r2.get(r0)
            return r2
        L1e:
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L29
            return r1
        L29:
            java.lang.Object r0 = r2.next()
        L2d:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r0 = r2.next()
            goto L2d
        L38:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.List<T> y4(java.lang.Iterable<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.List r1 = v4(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Comparable<? super T>> java.util.List<T> y5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Comparator r0 = kotlin.comparisons.a.x()
            java.util.List r1 = z5(r1, r0)
            return r1
    }

    public static /* synthetic */ java.util.Iterator z1(java.lang.Iterable r0) {
            java.util.Iterator r0 = n6(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, C extends java.util.Collection<? super T>> C z2(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull C r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r4.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L13
            r3.add(r0)
            goto L13
        L2d:
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> T z3(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r3.next()
            java.lang.Object r2 = r4.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lf
            r0 = r1
            goto Lf
        L27:
            return r0
    }

    public static final <T> boolean z4(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L10
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            return r1
        L10:
            java.util.Iterator r1 = r1.iterator()
            boolean r1 = r1.hasNext()
            r1 = r1 ^ 1
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> z5(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L2c
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            r2 = 1
            if (r1 > r2) goto L1d
            java.util.List r3 = a6(r3)
            return r3
        L1d:
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            kotlin.collections.q.h4(r3, r4)
            java.util.List r3 = kotlin.collections.q.t(r3)
            return r3
        L2c:
            java.util.List r3 = c6(r3)
            kotlin.collections.l0.r0(r3, r4)
            return r3
    }
}
