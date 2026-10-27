package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,527:1\n1#2:528\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class h0 extends kotlin.collections.g0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Incorrect field signature: TK; */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n*L\n1#1,527:1\n*E\n"})
    public static final class a<T> implements kotlin.jvm.functions.Function1<T, java.lang.Integer> {
        final /* synthetic */ kotlin.jvm.functions.Function1<T, K> a;
        final /* synthetic */ java.lang.Comparable b;

        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function1<-TT;+TK;>;TK;)V */
        public a(kotlin.jvm.functions.Function1 r1, java.lang.Comparable r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        public final java.lang.Integer a(T r2) {
                r1 = this;
                kotlin.jvm.functions.Function1<T, K> r0 = r1.a
                java.lang.Object r2 = r0.invoke(r2)
                java.lang.Comparable r2 = (java.lang.Comparable) r2
                java.lang.Comparable r0 = r1.b
                int r2 = kotlin.comparisons.a.l(r2, r0)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Object r1) {
                r0 = this;
                java.lang.Integer r1 = r0.a(r1)
                return r1
        }
    }

    public h0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ int A(java.util.List r0, java.lang.Comparable r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = r0.size()
        Ld:
            int r0 = x(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int B(java.util.List r0, java.lang.Object r1, java.util.Comparator r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 4
            if (r6 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 8
            if (r5 == 0) goto Ld
            int r4 = r0.size()
        Ld:
            int r0 = y(r0, r1, r2, r3, r4)
            return r0
    }

    public static final <T, K extends java.lang.Comparable<? super K>> int C(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r1, @org.jetbrains.annotations.Nullable K r2, int r3, int r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.collections.h0$a r0 = new kotlin.collections.h0$a
            r0.<init>(r5, r2)
            int r1 = w(r1, r3, r4, r0)
            return r1
    }

    public static /* synthetic */ int D(java.util.List r0, java.lang.Comparable r1, int r2, int r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L5
            r2 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto Ld
            int r3 = r0.size()
        Ld:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r5)
            java.lang.String r5 = "selector"
            kotlin.jvm.internal.g0.p(r4, r5)
            kotlin.collections.h0$a r5 = new kotlin.collections.h0$a
            r5.<init>(r4, r1)
            int r0 = w(r0, r2, r3, r5)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final <E> java.util.List<E> E(int r1, @kotlin.BuilderInference kotlin.jvm.functions.Function1<? super java.util.List<E>, kotlin.n1> r2) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.List r1 = kotlin.collections.g0.k(r1)
            r2.invoke(r1)
            java.util.List r1 = kotlin.collections.g0.b(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final <E> java.util.List<E> F(@kotlin.BuilderInference kotlin.jvm.functions.Function1<? super java.util.List<E>, kotlin.n1> r1) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.List r0 = kotlin.collections.g0.j()
            r1.invoke(r0)
            java.util.List r1 = kotlin.collections.g0.b(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Object[] G(@org.jetbrains.annotations.NotNull java.util.Collection<?> r4) {
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto Lf
            java.lang.Object[] r4 = new java.lang.Object[r1]
            return r4
        Lf:
            int r0 = r4.size()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.Iterator r4 = r4.iterator()
        L19:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L29
            int r2 = r1 + 1
            java.lang.Object r3 = r4.next()
            r0[r1] = r3
            r1 = r2
            goto L19
        L29:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> T[] H(@org.jetbrains.annotations.NotNull java.util.Collection<?> r4, @org.jetbrains.annotations.NotNull T[] r5) {
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto L16
            java.lang.Object[] r4 = kotlin.collections.g0.o(r1, r5)
            return r4
        L16:
            int r0 = r5.length
            int r2 = r4.size()
            if (r0 >= r2) goto L25
            int r0 = r4.size()
            java.lang.Object[] r5 = kotlin.collections.o.a(r5, r0)
        L25:
            java.util.Iterator r0 = r4.iterator()
        L29:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            int r2 = r1 + 1
            java.lang.Object r3 = r0.next()
            r5[r1] = r3
            r1 = r2
            goto L29
        L39:
            int r4 = r4.size()
            java.lang.Object[] r4 = kotlin.collections.g0.o(r4, r5)
            return r4
    }

    @kotlin.internal.InlineOnly
    private static final <T> boolean I(java.util.Collection<? extends T> r1, java.util.Collection<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r1 = r1.containsAll(r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> J() {
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.ranges.m K(@org.jetbrains.annotations.NotNull java.util.Collection<?> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.ranges.m r0 = new kotlin.ranges.m
            int r2 = r2.size()
            int r2 = r2 + (-1)
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> int L(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.size()
            int r1 = r1 + (-1)
            return r1
    }

    /* JADX WARN: Incorrect types in method signature: <C::Ljava/util/Collection<*>;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final java.lang.Object M(java.util.Collection r1, kotlin.jvm.functions.Function0 r2) {
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lf
            java.lang.Object r1 = r2.invoke()
        Lf:
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> boolean N(java.util.Collection<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <T> boolean O(java.util.Collection<? extends T> r0) {
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
    private static final <T> java.util.List<T> P() {
            java.util.List r0 = J()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> Q(@org.jetbrains.annotations.NotNull T... r1) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.length
            if (r0 <= 0) goto Ld
            java.util.List r1 = kotlin.collections.q.t(r1)
            return r1
        Ld:
            java.util.List r1 = J()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> R(@org.jetbrains.annotations.Nullable T r0) {
            if (r0 == 0) goto L7
            java.util.List r0 = kotlin.collections.g0.l(r0)
            return r0
        L7:
            java.util.List r0 = J()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> S(@org.jetbrains.annotations.NotNull T... r1) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.List r1 = kotlin.collections.a0.lb(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <T> java.util.List<T> T() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> U(@org.jetbrains.annotations.NotNull T... r2) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            if (r0 != 0) goto Le
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            return r2
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            java.util.Collection r2 = u(r2, r1)
            r0.<init>(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> V(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.size()
            if (r0 == 0) goto L19
            r1 = 1
            if (r0 == r1) goto Lf
            return r2
        Lf:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = kotlin.collections.g0.l(r2)
            return r2
        L19:
            java.util.List r2 = J()
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.Collection<T> W(java.util.Collection<? extends T> r0) {
            if (r0 != 0) goto L8
            java.util.List r0 = J()
            java.util.Collection r0 = (java.util.Collection) r0
        L8:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.List<T> X(java.util.List<? extends T> r0) {
            if (r0 != 0) goto L6
            java.util.List r0 = J()
        L6:
            return r0
    }

    private static final void Y(int r3, int r4, int r5) {
            java.lang.String r0 = ")."
            java.lang.String r1 = "fromIndex ("
            if (r4 > r5) goto L47
            if (r4 < 0) goto L2d
            if (r5 > r3) goto Lb
            return
        Lb:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "toIndex ("
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ") is greater than size ("
            r1.append(r5)
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
        L2d:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = ") is less than zero."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L47:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r4)
            java.lang.String r4 = ") is greater than toIndex ("
            r2.append(r4)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r3.<init>(r4)
            throw r3
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> Z(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.random.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.List r1 = kotlin.collections.r0.c6(r1)
            kotlin.collections.r0.j5(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    public static void a0() {
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Count overflow has happened."
            r0.<init>(r1)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    public static void b0() {
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Index overflow has happened."
            r0.<init>(r1)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <T> java.util.List<T> q(int r3, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> r4) {
            java.lang.String r0 = "init"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r1 = 0
        Lb:
            if (r1 >= r3) goto L1b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r4.invoke(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto Lb
        L1b:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <T> java.util.List<T> r(int r3, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> r4) {
            java.lang.String r0 = "init"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r1 = 0
        Lb:
            if (r1 >= r3) goto L1b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r4.invoke(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto Lb
        L1b:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <T> java.util.ArrayList<T> s() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.ArrayList<T> t(@org.jetbrains.annotations.NotNull T... r2) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            if (r0 != 0) goto Le
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            return r2
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            java.util.Collection r2 = u(r2, r1)
            r0.<init>(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Collection<T> u(@org.jetbrains.annotations.NotNull T[] r1, boolean r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.l r0 = new kotlin.collections.l
            r0.<init>(r1, r2)
            return r0
    }

    public static /* synthetic */ java.util.Collection v(java.lang.Object[] r0, boolean r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.util.Collection r0 = u(r0, r1)
            return r0
    }

    public static final <T> int w(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2, int r3, int r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Integer> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "comparison"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r2.size()
            Y(r0, r3, r4)
            int r4 = r4 + (-1)
        L13:
            if (r3 > r4) goto L32
            int r0 = r3 + r4
            int r0 = r0 >>> 1
            java.lang.Object r1 = r2.get(r0)
            java.lang.Object r1 = r5.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 >= 0) goto L2c
            int r3 = r0 + 1
            goto L13
        L2c:
            if (r1 <= 0) goto L31
            int r4 = r0 + (-1)
            goto L13
        L31:
            return r0
        L32:
            int r3 = r3 + 1
            int r2 = -r3
            return r2
    }

    public static final <T extends java.lang.Comparable<? super T>> int x(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2, @org.jetbrains.annotations.Nullable T r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.size()
            Y(r0, r4, r5)
            int r5 = r5 + (-1)
        Le:
            if (r4 > r5) goto L29
            int r0 = r4 + r5
            int r0 = r0 >>> 1
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = kotlin.comparisons.a.l(r1, r3)
            if (r1 >= 0) goto L23
            int r4 = r0 + 1
            goto Le
        L23:
            if (r1 <= 0) goto L28
            int r5 = r0 + (-1)
            goto Le
        L28:
            return r0
        L29:
            int r4 = r4 + 1
            int r2 = -r4
            return r2
    }

    public static final <T> int y(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2, T r3, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r4, int r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r2.size()
            Y(r0, r5, r6)
            int r6 = r6 + (-1)
        L13:
            if (r5 > r6) goto L2c
            int r0 = r5 + r6
            int r0 = r0 >>> 1
            java.lang.Object r1 = r2.get(r0)
            int r1 = r4.compare(r1, r3)
            if (r1 >= 0) goto L26
            int r5 = r0 + 1
            goto L13
        L26:
            if (r1 <= 0) goto L2b
            int r6 = r0 + (-1)
            goto L13
        L2b:
            return r0
        L2c:
            int r5 = r5 + 1
            int r2 = -r5
            return r2
    }

    public static /* synthetic */ int z(java.util.List r0, int r1, int r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r4 = r4 & 2
            if (r4 == 0) goto Ld
            int r2 = r0.size()
        Ld:
            int r0 = w(r0, r1, r2, r3)
            return r0
    }
}
