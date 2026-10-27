package kotlin.reflect.jvm.internal.impl.types.typeUtil;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n245#1,14:415\n260#1:433\n249#1,12:434\n245#1,14:446\n260#1:464\n249#1,12:465\n256#1,3:483\n260#1:490\n256#1,3:491\n260#1:498\n256#1,3:499\n260#1:506\n381#1:532\n381#1:533\n381#1:534\n1761#2,3:391\n1563#2:394\n1634#2,3:395\n1617#2,9:399\n1869#2:408\n1870#2:410\n1626#2:411\n774#2:412\n865#2,2:413\n1563#2:429\n1634#2,3:430\n1563#2:460\n1634#2,3:461\n1761#2,3:477\n1761#2,3:480\n1563#2:486\n1634#2,3:487\n1563#2:494\n1634#2,3:495\n1563#2:502\n1634#2,3:503\n1563#2:507\n1634#2,3:508\n1563#2:511\n1634#2,3:512\n1761#2,3:515\n295#2,2:518\n1563#2:520\n1634#2,3:521\n1563#2:524\n1634#2,3:525\n1563#2:528\n1634#2,3:529\n1#3:398\n1#3:409\n*S KotlinDebug\n*F\n+ 1 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n*L\n184#1:415,14\n184#1:433\n184#1:434,12\n185#1:446,14\n185#1:464\n185#1:465,12\n248#1:483,3\n248#1:490\n249#1:491,3\n249#1:498\n251#1:499,3\n251#1:506\n373#1:532\n376#1:533\n379#1:534\n80#1:391,3\n131#1:394\n131#1:395,3\n167#1:399,9\n167#1:408\n167#1:410\n167#1:411\n173#1:412\n173#1:413,2\n184#1:429\n184#1:430,3\n185#1:460\n185#1:461,3\n223#1:477,3\n235#1:480,3\n248#1:486\n248#1:487,3\n249#1:494\n249#1:495,3\n251#1:502\n251#1:503,3\n258#1:507\n258#1:508,3\n265#1:511\n265#1:512,3\n291#1:515,3\n298#1:518,2\n308#1:520\n308#1:521,3\n327#1:524\n327#1:525,3\n335#1:528\n335#1:529,3\n167#1:409\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e {
    public static final boolean A(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.error.g
            if (r0 == 0) goto L17
            kotlin.reflect.jvm.internal.impl.types.error.g r1 = (kotlin.reflect.jvm.internal.impl.types.error.g) r1
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r1 = r1.S0()
            boolean r1 = r1.isUnresolved()
            if (r1 == 0) goto L17
            r1 = 1
            return r1
        L17:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.t0 B(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = kotlin.reflect.jvm.internal.impl.types.j2.n(r1)
            java.lang.String r0 = "makeNotNullable(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.t0 C(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = kotlin.reflect.jvm.internal.impl.types.j2.o(r1)
            java.lang.String r0 = "makeNullable(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.t0 D(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "newAnnotations"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r1.getAnnotations()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L1b
            return r1
        L1b:
            kotlin.reflect.jvm.internal.impl.types.m2 r0 = r1.L0()
            kotlin.reflect.jvm.internal.impl.types.t1 r1 = r1.H0()
            kotlin.reflect.jvm.internal.impl.types.t1 r1 = kotlin.reflect.jvm.internal.impl.types.u1.a(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = r0.O0(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.t0 E(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r10, r0)
            kotlin.reflect.jvm.internal.impl.types.m2 r10 = r10.L0()
            boolean r0 = r10 instanceof kotlin.reflect.jvm.internal.impl.types.k0
            r1 = 2
            r2 = 10
            java.lang.String r3 = "getParameters(...)"
            r4 = 0
            if (r0 == 0) goto Lbb
            r0 = r10
            kotlin.reflect.jvm.internal.impl.types.k0 r0 = (kotlin.reflect.jvm.internal.impl.types.k0) r0
            kotlin.reflect.jvm.internal.impl.types.e1 r5 = r0.Q0()
            kotlin.reflect.jvm.internal.impl.types.w1 r6 = r5.I0()
            java.util.List r6 = r6.getParameters()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L66
            kotlin.reflect.jvm.internal.impl.types.w1 r6 = r5.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r6 = r6.c()
            if (r6 != 0) goto L33
            goto L66
        L33:
            kotlin.reflect.jvm.internal.impl.types.w1 r6 = r5.I0()
            java.util.List r6 = r6.getParameters()
            kotlin.jvm.internal.g0.o(r6, r3)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = kotlin.collections.f0.d0(r6, r2)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L4d:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L62
            java.lang.Object r8 = r6.next()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r8 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r8
            kotlin.reflect.jvm.internal.impl.types.l1 r9 = new kotlin.reflect.jvm.internal.impl.types.l1
            r9.<init>(r8)
            r7.add(r9)
            goto L4d
        L62:
            kotlin.reflect.jvm.internal.impl.types.e1 r5 = kotlin.reflect.jvm.internal.impl.types.g2.f(r5, r7, r4, r1, r4)
        L66:
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.R0()
            kotlin.reflect.jvm.internal.impl.types.w1 r6 = r0.I0()
            java.util.List r6 = r6.getParameters()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto Lb6
            kotlin.reflect.jvm.internal.impl.types.w1 r6 = r0.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r6 = r6.c()
            if (r6 != 0) goto L83
            goto Lb6
        L83:
            kotlin.reflect.jvm.internal.impl.types.w1 r6 = r0.I0()
            java.util.List r6 = r6.getParameters()
            kotlin.jvm.internal.g0.o(r6, r3)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r3 = new java.util.ArrayList
            int r2 = kotlin.collections.f0.d0(r6, r2)
            r3.<init>(r2)
            java.util.Iterator r2 = r6.iterator()
        L9d:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto Lb2
            java.lang.Object r6 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r6
            kotlin.reflect.jvm.internal.impl.types.l1 r7 = new kotlin.reflect.jvm.internal.impl.types.l1
            r7.<init>(r6)
            r3.add(r7)
            goto L9d
        Lb2:
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.types.g2.f(r0, r3, r4, r1, r4)
        Lb6:
            kotlin.reflect.jvm.internal.impl.types.m2 r0 = kotlin.reflect.jvm.internal.impl.types.w0.e(r5, r0)
            goto L10e
        Lbb:
            boolean r0 = r10 instanceof kotlin.reflect.jvm.internal.impl.types.e1
            if (r0 == 0) goto L113
            r0 = r10
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = (kotlin.reflect.jvm.internal.impl.types.e1) r0
            kotlin.reflect.jvm.internal.impl.types.w1 r5 = r0.I0()
            java.util.List r5 = r5.getParameters()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L10e
            kotlin.reflect.jvm.internal.impl.types.w1 r5 = r0.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r5 = r5.c()
            if (r5 != 0) goto Ldb
            goto L10e
        Ldb:
            kotlin.reflect.jvm.internal.impl.types.w1 r5 = r0.I0()
            java.util.List r5 = r5.getParameters()
            kotlin.jvm.internal.g0.o(r5, r3)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r3 = new java.util.ArrayList
            int r2 = kotlin.collections.f0.d0(r5, r2)
            r3.<init>(r2)
            java.util.Iterator r2 = r5.iterator()
        Lf5:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L10a
            java.lang.Object r5 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r5
            kotlin.reflect.jvm.internal.impl.types.l1 r6 = new kotlin.reflect.jvm.internal.impl.types.l1
            r6.<init>(r5)
            r3.add(r6)
            goto Lf5
        L10a:
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.types.g2.f(r0, r3, r4, r1, r4)
        L10e:
            kotlin.reflect.jvm.internal.impl.types.m2 r10 = kotlin.reflect.jvm.internal.impl.types.l2.b(r0, r10)
            return r10
        L113:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
    }

    public static final boolean F(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.typeUtil.c r0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.c.a
            boolean r1 = f(r1, r0)
            return r1
    }

    private static final boolean G(kotlin.reflect.jvm.internal.impl.types.m2 r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r2.c()
            r0 = 0
            if (r2 == 0) goto L1c
            boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i1
            if (r1 != 0) goto L1a
            boolean r2 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            if (r2 == 0) goto L19
            goto L1a
        L19:
            return r0
        L1a:
            r2 = 1
            return r2
        L1c:
            return r0
    }

    public static final boolean H(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 == 0) goto Ld
            kotlin.reflect.jvm.internal.impl.types.typeUtil.d r0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.d.a
            boolean r1 = f(r1, r0)
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    private static final boolean I(kotlin.reflect.jvm.internal.impl.types.m2 r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.n1
            if (r0 != 0) goto L1a
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r1.I0()
            boolean r0 = r0 instanceof d4.w
            if (r0 != 0) goto L1a
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.x0.a(r1)
            if (r1 == 0) goto L18
            goto L1a
        L18:
            r1 = 0
            return r1
        L1a:
            r1 = 1
            return r1
    }

    static /* synthetic */ java.lang.Boolean a(kotlin.reflect.jvm.internal.impl.types.m2 r0) {
            java.lang.Boolean r0 = k(r0)
            return r0
    }

    static /* synthetic */ boolean b(kotlin.reflect.jvm.internal.impl.types.m2 r0) {
            boolean r0 = i(r0)
            return r0
    }

    static /* synthetic */ boolean c(kotlin.reflect.jvm.internal.impl.types.m2 r0) {
            boolean r0 = G(r0)
            return r0
    }

    static /* synthetic */ boolean d(kotlin.reflect.jvm.internal.impl.types.m2 r0) {
            boolean r0 = I(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.c2 e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.e2 r0 = new kotlin.reflect.jvm.internal.impl.types.e2
            r0.<init>(r1)
            return r0
    }

    public static final boolean f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.m2, java.lang.Boolean> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.j2.c(r1, r2)
            return r1
    }

    private static final boolean g(kotlin.reflect.jvm.internal.impl.types.t0 r6, kotlin.reflect.jvm.internal.impl.types.w1 r7, java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r8) {
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r6.I0()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r7)
            r1 = 1
            if (r0 == 0) goto Lc
            return r1
        Lc:
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r6.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.c()
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g
            r3 = 0
            if (r2 == 0) goto L1c
            kotlin.reflect.jvm.internal.impl.descriptors.g r0 = (kotlin.reflect.jvm.internal.impl.descriptors.g) r0
            goto L1d
        L1c:
            r0 = r3
        L1d:
            if (r0 == 0) goto L24
            java.util.List r0 = r0.t()
            goto L25
        L24:
            r0 = r3
        L25:
            java.util.List r6 = r6.G0()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Iterable r6 = kotlin.collections.f0.m6(r6)
            boolean r2 = r6 instanceof java.util.Collection
            r4 = 0
            if (r2 == 0) goto L3e
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L3e
            return r4
        L3e:
            java.util.Iterator r6 = r6.iterator()
        L42:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L85
            java.lang.Object r2 = r6.next()
            kotlin.collections.a1 r2 = (kotlin.collections.a1) r2
            int r5 = r2.a()
            java.lang.Object r2 = r2.b()
            kotlin.reflect.jvm.internal.impl.types.c2 r2 = (kotlin.reflect.jvm.internal.impl.types.c2) r2
            if (r0 == 0) goto L61
            java.lang.Object r5 = kotlin.collections.f0.b3(r0, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r5
            goto L62
        L61:
            r5 = r3
        L62:
            if (r5 == 0) goto L6d
            if (r8 == 0) goto L6d
            boolean r5 = r8.contains(r5)
            if (r5 == 0) goto L6d
            goto L73
        L6d:
            boolean r5 = r2.b()
            if (r5 == 0) goto L75
        L73:
            r2 = 0
            goto L82
        L75:
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getType()
            java.lang.String r5 = "getType(...)"
            kotlin.jvm.internal.g0.o(r2, r5)
            boolean r2 = g(r2, r7, r8)
        L82:
            if (r2 == 0) goto L42
            return r1
        L85:
            return r4
    }

    public static final boolean h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.typeUtil.b r0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.b.a
            boolean r1 = f(r1, r0)
            return r1
    }

    private static final boolean i(kotlin.reflect.jvm.internal.impl.types.m2 r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.c()
            if (r1 == 0) goto L14
            boolean r1 = y(r1)
            return r1
        L14:
            r1 = 0
            return r1
    }

    public static final boolean j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.typeUtil.a r0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.j2.c(r1, r0)
            return r1
    }

    private static final java.lang.Boolean k(kotlin.reflect.jvm.internal.impl.types.m2 r0) {
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.j2.m(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.c2 l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.Variance r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.j1 r3) {
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "projectionKind"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.e2 r0 = new kotlin.reflect.jvm.internal.impl.types.e2
            if (r3 == 0) goto L13
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = r3.l()
            goto L14
        L13:
            r3 = 0
        L14:
            if (r3 != r2) goto L18
            kotlin.reflect.jvm.internal.impl.types.Variance r2 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
        L18:
            r0.<init>(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.j1> m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1, @org.jetbrains.annotations.Nullable java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            n(r1, r1, r0, r2)
            return r0
    }

    private static final void n(kotlin.reflect.jvm.internal.impl.types.t0 r6, kotlin.reflect.jvm.internal.impl.types.t0 r7, java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.j1> r8, java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r9) {
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r6.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.c()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            if (r1 == 0) goto L3b
            kotlin.reflect.jvm.internal.impl.types.w1 r6 = r6.I0()
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r7.I0()
            boolean r6 = kotlin.jvm.internal.g0.g(r6, r1)
            if (r6 != 0) goto L1e
            r8.add(r0)
            return
        L1e:
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r0
            java.util.List r6 = r0.getUpperBounds()
            java.util.Iterator r6 = r6.iterator()
        L28:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lbc
            java.lang.Object r0 = r6.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            kotlin.jvm.internal.g0.m(r0)
            n(r0, r7, r8, r9)
            goto L28
        L3b:
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r6.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.c()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g
            r2 = 0
            if (r1 == 0) goto L4b
            kotlin.reflect.jvm.internal.impl.descriptors.g r0 = (kotlin.reflect.jvm.internal.impl.descriptors.g) r0
            goto L4c
        L4b:
            r0 = r2
        L4c:
            if (r0 == 0) goto L53
            java.util.List r0 = r0.t()
            goto L54
        L53:
            r0 = r2
        L54:
            java.util.List r6 = r6.G0()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
        L5f:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto Lbc
            int r3 = r1 + 1
            java.lang.Object r4 = r6.next()
            kotlin.reflect.jvm.internal.impl.types.c2 r4 = (kotlin.reflect.jvm.internal.impl.types.c2) r4
            if (r0 == 0) goto L76
            java.lang.Object r1 = kotlin.collections.f0.b3(r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r1
            goto L77
        L76:
            r1 = r2
        L77:
            if (r1 == 0) goto L82
            if (r9 == 0) goto L82
            boolean r1 = r9.contains(r1)
            if (r1 == 0) goto L82
            goto Lba
        L82:
            boolean r1 = r4.b()
            if (r1 == 0) goto L89
            goto Lba
        L89:
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r4.getType()
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.c()
            boolean r1 = kotlin.collections.f0.a2(r8, r1)
            if (r1 != 0) goto Lba
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r4.getType()
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            kotlin.reflect.jvm.internal.impl.types.w1 r5 = r7.I0()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r1 == 0) goto Lae
            goto Lba
        Lae:
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r4.getType()
            java.lang.String r4 = "getType(...)"
            kotlin.jvm.internal.g0.o(r1, r4)
            n(r1, r7, r8, r9)
        Lba:
            r1 = r3
            goto L5f
        Lbc:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.builtins.j o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            kotlin.reflect.jvm.internal.impl.builtins.j r1 = r1.p()
            java.lang.String r0 = "getBuiltIns(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.t0 p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.List r0 = r6.getUpperBounds()
            java.lang.String r1 = "getUpperBounds(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r0.isEmpty()
            java.util.List r0 = r6.getUpperBounds()
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L51
            java.lang.Object r2 = r0.next()
            r4 = r2
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = (kotlin.reflect.jvm.internal.impl.types.t0) r4
            kotlin.reflect.jvm.internal.impl.types.w1 r4 = r4.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r4 = r4.c()
            boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r5 == 0) goto L3d
            r3 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r3
        L3d:
            if (r3 != 0) goto L40
            goto L20
        L40:
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r4 = r3.h()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r5 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE
            if (r4 == r5) goto L20
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r3 = r3.h()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r4 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS
            if (r3 == r4) goto L20
            r3 = r2
        L51:
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = (kotlin.reflect.jvm.internal.impl.types.t0) r3
            if (r3 != 0) goto L68
            java.util.List r6 = r6.getUpperBounds()
            kotlin.jvm.internal.g0.o(r6, r1)
            java.lang.Object r6 = kotlin.collections.f0.G2(r6)
            java.lang.String r0 = "first(...)"
            kotlin.jvm.internal.g0.o(r6, r0)
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = (kotlin.reflect.jvm.internal.impl.types.t0) r6
            return r6
        L68:
            return r3
    }

    @kotlin.jvm.JvmOverloads
    public static final boolean q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r2) {
            java.lang.String r0 = "typeParameter"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            r1 = 6
            boolean r2 = s(r2, r0, r0, r1, r0)
            return r2
    }

    @kotlin.jvm.JvmOverloads
    public static final boolean r(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r4, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.w1 r5, @org.jetbrains.annotations.Nullable java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r6) {
            java.lang.String r0 = "typeParameter"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.List r0 = r4.getUpperBounds()
            java.lang.String r1 = "getUpperBounds(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L1f
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1f
            return r2
        L1f:
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = (kotlin.reflect.jvm.internal.impl.types.t0) r1
            kotlin.jvm.internal.g0.m(r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r4.s()
            kotlin.reflect.jvm.internal.impl.types.w1 r3 = r3.I0()
            boolean r3 = g(r1, r3, r6)
            if (r3 == 0) goto L23
            if (r5 == 0) goto L4c
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r1 == 0) goto L23
        L4c:
            r4 = 1
            return r4
        L4e:
            return r2
    }

    public static /* synthetic */ boolean s(kotlin.reflect.jvm.internal.impl.descriptors.j1 r1, kotlin.reflect.jvm.internal.impl.types.w1 r2, java.util.Set r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            r0 = 0
            if (r5 == 0) goto L6
            r2 = r0
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = r0
        Lb:
            boolean r1 = r(r1, r2, r3)
            return r1
    }

    public static final boolean t(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = kotlin.reflect.jvm.internal.impl.builtins.j.g0(r1)
            return r1
    }

    public static final boolean u(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = kotlin.reflect.jvm.internal.impl.builtins.j.o0(r1)
            return r1
    }

    public static final boolean v(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.e
            if (r0 != 0) goto L1a
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.z
            if (r0 == 0) goto L18
            kotlin.reflect.jvm.internal.impl.types.z r1 = (kotlin.reflect.jvm.internal.impl.types.z) r1
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.U0()
            boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.e
            if (r1 == 0) goto L18
            goto L1a
        L18:
            r1 = 0
            return r1
        L1a:
            r1 = 1
            return r1
    }

    public static final boolean w(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.n1
            if (r0 != 0) goto L1a
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.z
            if (r0 == 0) goto L18
            kotlin.reflect.jvm.internal.impl.types.z r1 = (kotlin.reflect.jvm.internal.impl.types.z) r1
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.U0()
            boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.n1
            if (r1 == 0) goto L18
            goto L1a
        L18:
            r1 = 0
            return r1
        L1a:
            r1 = 1
            return r1
    }

    public static final boolean x(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "superType"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.checker.e r0 = kotlin.reflect.jvm.internal.impl.types.checker.e.a
            boolean r1 = r0.d(r1, r2)
            return r1
    }

    public static final boolean y(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            if (r0 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r1
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r1.b()
            boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i1
            if (r1 == 0) goto L15
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static final boolean z(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.j2.m(r1)
            return r1
    }
}
