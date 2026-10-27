package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLazyJavaClassMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 collections.kt\norg/jetbrains/kotlin/utils/CollectionsKt\n*L\n1#1,890:1\n1460#2,5:891\n1761#2,2:896\n1761#2,3:898\n1763#2:901\n1617#2,9:902\n1869#2:911\n1870#2:913\n1626#2:914\n1761#2,3:915\n1563#2:918\n1634#2,3:919\n827#2:922\n855#2,2:923\n774#2:925\n865#2,2:926\n1761#2,3:928\n1761#2,3:931\n2746#2,3:935\n774#2:938\n865#2,2:939\n774#2:941\n865#2,2:942\n1563#2:944\n1634#2,3:945\n2746#2,3:948\n295#2,2:951\n1563#2:953\n1634#2,3:954\n1460#2,5:957\n2746#2,3:962\n1374#2:965\n1460#2,2:966\n1563#2:968\n1634#2,3:969\n1462#2,3:972\n1563#2:975\n1634#2,3:976\n3301#2,10:979\n1460#2,5:989\n2746#2,3:994\n774#2:998\n865#2,2:999\n1208#2,2:1001\n1236#2,4:1003\n1#3:912\n1#3:934\n58#4:997\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope\n*L\n74#1:891,5\n160#1:896,2\n161#1:898,3\n160#1:901\n189#1:902,9\n189#1:911\n189#1:913\n189#1:914\n193#1:915,3\n199#1:918\n199#1:919,3\n202#1:922\n202#1:923,2\n211#1:925\n211#1:926,2\n216#1:928,3\n222#1:931,3\n322#1:935,3\n327#1:938\n327#1:939,2\n354#1:941\n354#1:942,2\n376#1:944\n376#1:945,3\n461#1:948,3\n470#1:951,2\n476#1:953\n476#1:954,3\n489#1:957,5\n495#1:962,3\n649#1:965\n649#1:966,2\n650#1:968\n650#1:969,3\n649#1:972,3\n698#1:975\n698#1:976,3\n749#1:979,10\n879#1:989,5\n95#1:994,3\n811#1:998\n811#1:999,2\n811#1:1001,2\n811#1:1003,4\n189#1:912\n105#1:997\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class z extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.d n;

    @org.jetbrains.annotations.NotNull
    private final x3.g o;
    private final boolean p;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i<java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.c>> q;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i<java.util.Set<kotlin.reflect.jvm.internal.impl.name.f>> r;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i<java.util.Set<kotlin.reflect.jvm.internal.impl.name.f>> s;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i<java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, x3.n>> t;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.d> u;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.f, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1>> {
        a(java.lang.Object r8) {
                r7 = this;
                java.lang.String r5 = "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;"
                r6 = 0
                r1 = 1
                java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z> r3 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z.class
                java.lang.String r4 = "searchMethodsByNameWithoutBuiltinMagic"
                r0 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> c(kotlin.reflect.jvm.internal.impl.name.f r2) {
                r1 = this;
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.Object r0 = r1.receiver
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r0 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z) r0
                java.util.Collection r2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z.h0(r0, r2)
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1> invoke(kotlin.reflect.jvm.internal.impl.name.f r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.name.f r1 = (kotlin.reflect.jvm.internal.impl.name.f) r1
                java.util.Collection r1 = r0.c(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final /* synthetic */ class b extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.f, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1>> {
        b(java.lang.Object r8) {
                r7 = this;
                java.lang.String r5 = "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;"
                r6 = 0
                r1 = 1
                java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z> r3 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z.class
                java.lang.String r4 = "searchMethodsInSupertypesWithoutBuiltinMagic"
                r0 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> c(kotlin.reflect.jvm.internal.impl.name.f r2) {
                r1 = this;
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.Object r0 = r1.receiver
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r0 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z) r0
                java.util.Collection r2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z.i0(r0, r2)
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1> invoke(kotlin.reflect.jvm.internal.impl.name.f r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.name.f r1 = (kotlin.reflect.jvm.internal.impl.name.f) r1
                java.util.Collection r1 = r0.c(r1)
                return r1
        }
    }

    public z(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r3, @org.jetbrains.annotations.NotNull x3.g r4, boolean r5, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r6) {
            r1 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "ownerDescriptor"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "jClass"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>(r2, r6)
            r1.n = r3
            r1.o = r4
            r1.p = r5
            kotlin.reflect.jvm.internal.impl.storage.n r3 = r2.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p r4 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
            r4.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.storage.i r3 = r3.e(r4)
            r1.q = r3
            kotlin.reflect.jvm.internal.impl.storage.n r3 = r2.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.q r4 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.q
            r4.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.i r3 = r3.e(r4)
            r1.r = r3
            kotlin.reflect.jvm.internal.impl.storage.n r3 = r2.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.r r4 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.r
            r4.<init>(r2, r1)
            kotlin.reflect.jvm.internal.impl.storage.i r3 = r3.e(r4)
            r1.s = r3
            kotlin.reflect.jvm.internal.impl.storage.n r3 = r2.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.s r4 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.s
            r4.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.i r3 = r3.e(r4)
            r1.t = r3
            kotlin.reflect.jvm.internal.impl.storage.n r3 = r2.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t r4 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t
            r4.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.storage.h r2 = r3.c(r4)
            r1.u = r2
            return
    }

    public /* synthetic */ z(kotlin.reflect.jvm.internal.impl.load.java.lazy.k r7, kotlin.reflect.jvm.internal.impl.descriptors.d r8, x3.g r9, boolean r10, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r11, int r12, kotlin.jvm.internal.v r13) {
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L5
            r11 = 0
        L5:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private static final boolean A0(x3.q r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1.L()
            r1 = r1 ^ 1
            return r1
    }

    private static final java.util.Collection B0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r1, kotlin.reflect.jvm.internal.impl.name.f r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Collection r1 = r1.q1(r2)
            return r1
    }

    private static final java.util.Collection C0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r1, kotlin.reflect.jvm.internal.impl.name.f r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Collection r1 = r1.r1(r2)
            return r1
    }

    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> D0() {
            r2 = this;
            boolean r0 = r2.p
            if (r0 == 0) goto L16
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.d1()
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.o()
            java.util.Collection r0 = r0.i()
            java.lang.String r1 = "getSupertypes(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
        L16:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r2.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.types.checker.p r0 = r0.k()
            kotlin.reflect.jvm.internal.impl.types.checker.g r0 = r0.c()
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r2.d1()
            java.util.Collection r0 = r0.g(r1)
            return r0
    }

    private static final java.util.List E0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r8, kotlin.reflect.jvm.internal.impl.load.java.lazy.k r9) {
            x3.g r0 = r8.o
            java.util.Collection r0 = r0.f()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r0.next()
            x3.k r2 = (x3.k) r2
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.b r2 = r8.o1(r2)
            r1.add(r2)
            goto L13
        L27:
            x3.g r0 = r8.o
            boolean r0 = r0.A()
            if (r0 == 0) goto L6c
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = r8.H0()
            r2 = 0
            r3 = 2
            r4 = 0
            java.lang.String r5 = kotlin.reflect.jvm.internal.impl.load.kotlin.c0.c(r0, r2, r2, r3, r4)
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L41
            goto L5c
        L41:
            java.util.Iterator r6 = r1.iterator()
        L45:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5c
            java.lang.Object r7 = r6.next()
            kotlin.reflect.jvm.internal.impl.descriptors.c r7 = (kotlin.reflect.jvm.internal.impl.descriptors.c) r7
            java.lang.String r7 = kotlin.reflect.jvm.internal.impl.load.kotlin.c0.c(r7, r2, r2, r3, r4)
            boolean r7 = kotlin.jvm.internal.g0.g(r7, r5)
            if (r7 == 0) goto L45
            goto L6c
        L5c:
            r1.add(r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r2 = r9.a()
            kotlin.reflect.jvm.internal.impl.load.java.components.j r2 = r2.h()
            x3.g r3 = r8.o
            r2.b(r3, r0)
        L6c:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r9.a()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.e r0 = r0.w()
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r8.d1()
            r0.a(r2, r1, r9)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r9.a()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j1 r0 = r0.r()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L94
            kotlin.reflect.jvm.internal.impl.descriptors.c r8 = r8.G0()
            java.util.List r8 = kotlin.collections.f0.R(r8)
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
        L94:
            java.util.Collection r8 = r0.p(r9, r1)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r8 = kotlin.collections.f0.a6(r8)
            return r8
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> F0(kotlin.reflect.jvm.internal.impl.descriptors.impl.i r12) {
            r11 = this;
            x3.g r0 = r11.o
            java.util.Collection r0 = r0.r()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r1 = r0.size()
            r2.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r3 = kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON
            r7 = 6
            r8 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r8 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(r3, r4, r5, r6, r7, r8)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r0.next()
            r5 = r4
            x3.r r5 = (x3.r) r5
            kotlin.reflect.jvm.internal.impl.name.f r5 = r5.getName()
            kotlin.reflect.jvm.internal.impl.name.f r6 = kotlin.reflect.jvm.internal.impl.load.java.i0.c
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r6)
            if (r5 == 0) goto L47
            r1.add(r4)
            goto L2a
        L47:
            r3.add(r4)
            goto L2a
        L4b:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r3)
            java.lang.Object r1 = r0.component1()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.component2()
            java.util.List r0 = (java.util.List) r0
            r1.size()
            java.lang.Object r1 = kotlin.collections.f0.L2(r1)
            r5 = r1
            x3.r r5 = (x3.r) r5
            r9 = 1
            if (r5 == 0) goto Lbc
            x3.x r1 = r5.getReturnType()
            boolean r3 = r1 instanceof x3.f
            if (r3 == 0) goto L95
            kotlin.Pair r3 = new kotlin.Pair
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r4 = r11.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d r4 = r4.g()
            x3.f r1 = (x3.f) r1
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.l(r1, r8, r9)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r6 = r11.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d r6 = r6.g()
            x3.x r1 = r1.j()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r6.p(r1, r8)
            r3.<init>(r4, r1)
            goto La7
        L95:
            kotlin.Pair r3 = new kotlin.Pair
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r4 = r11.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d r4 = r4.g()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r4.p(r1, r8)
            r4 = 0
            r3.<init>(r1, r4)
        La7:
            java.lang.Object r1 = r3.component1()
            r6 = r1
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = (kotlin.reflect.jvm.internal.impl.types.t0) r6
            java.lang.Object r1 = r3.component2()
            r7 = r1
            kotlin.reflect.jvm.internal.impl.types.t0 r7 = (kotlin.reflect.jvm.internal.impl.types.t0) r7
            r4 = 0
            r1 = r11
            r3 = r12
            r1.t0(r2, r3, r4, r5, r6, r7)
            goto Lbd
        Lbc:
            r3 = r12
        Lbd:
            r12 = 0
            if (r5 == 0) goto Lc1
            goto Lc2
        Lc1:
            r9 = 0
        Lc2:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Lc8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lf0
            int r10 = r12 + 1
            java.lang.Object r1 = r0.next()
            r5 = r1
            x3.r r5 = (x3.r) r5
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = r11.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d r1 = r1.g()
            x3.x r4 = r5.getReturnType()
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = r1.p(r4, r8)
            int r4 = r12 + r9
            r7 = 0
            r1 = r11
            r1.t0(r2, r3, r4, r5, r6, r7)
            r12 = r10
            goto Lc8
        Lf0:
            return r2
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.c G0() {
            r5 = this;
            x3.g r0 = r5.o
            boolean r0 = r0.k()
            x3.g r1 = r5.o
            boolean r1 = r1.I()
            if (r1 != 0) goto L16
            x3.g r1 = r5.o
            boolean r1 = r1.B()
            if (r1 != 0) goto L1a
        L16:
            if (r0 != 0) goto L1a
            r0 = 0
            return r0
        L1a:
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r5.d1()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r2.b()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r3 = r5.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r3 = r3.a()
            w3.b r3 = r3.t()
            x3.g r4 = r5.o
            w3.a r3 = r3.a(r4)
            r4 = 1
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.b r2 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.b.o1(r1, r2, r4, r3)
            java.lang.String r3 = "createJavaConstructor(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            if (r0 == 0) goto L47
            java.util.List r0 = r5.F0(r2)
            goto L49
        L47:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        L49:
            r3 = 0
            r2.U0(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.s r3 = r5.a1(r1)
            r2.l1(r0, r3)
            r2.T0(r4)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.s()
            r2.b1(r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r5.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.load.java.components.j r0 = r0.h()
            x3.g r1 = r5.o
            r0.b(r1, r2)
            return r2
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.c H0() {
            r5 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r5.d1()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r1.b()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2 = r5.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r2 = r2.a()
            w3.b r2 = r2.t()
            x3.g r3 = r5.o
            w3.a r2 = r2.a(r3)
            r3 = 1
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.b r1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.b.o1(r0, r1, r3, r2)
            java.lang.String r2 = "createJavaConstructor(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.util.List r2 = r5.N0(r1)
            r3 = 0
            r1.U0(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.s r4 = r5.a1(r0)
            r1.l1(r2, r4)
            r1.T0(r3)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.s()
            r1.b1(r0)
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d1 I0(kotlin.reflect.jvm.internal.impl.descriptors.d1 r3, kotlin.reflect.jvm.internal.impl.descriptors.a r4, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1> r5) {
            r2 = this;
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L10
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            return r3
        L10:
            java.util.Iterator r5 = r5.iterator()
        L14:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r0 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r0
            boolean r1 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r1 != 0) goto L14
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r0.x0()
            if (r1 != 0) goto L14
            boolean r0 = r2.R0(r0, r4)
            if (r0 == 0) goto L14
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r3 = r3.n()
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r3 = r3.e()
            kotlin.reflect.jvm.internal.impl.descriptors.y r3 = r3.build()
            kotlin.jvm.internal.g0.m(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r3
        L43:
            return r3
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d1 J0(kotlin.reflect.jvm.internal.impl.descriptors.y r6, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1>> r7) {
            r5 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = r6.getName()
            java.lang.String r1 = "getName(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Object r7 = r7.invoke(r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L13:
            boolean r0 = r7.hasNext()
            r1 = 0
            if (r0 == 0) goto L28
            java.lang.Object r0 = r7.next()
            r2 = r0
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r2
            boolean r2 = r5.f1(r2, r6)
            if (r2 == 0) goto L13
            goto L29
        L28:
            r0 = r1
        L29:
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r0
            if (r0 == 0) goto L83
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r7 = r0.n()
            java.util.List r1 = r6.g()
            java.lang.String r2 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.f0.d0(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L4b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L5f
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r4
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.getType()
            r3.add(r4)
            goto L4b
        L5f:
            java.util.List r0 = r0.g()
            kotlin.jvm.internal.g0.o(r0, r2)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r6 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.h.a(r3, r0, r6)
            r7.n(r6)
            r7.t()
            r7.g()
            kotlin.reflect.jvm.internal.impl.descriptors.a$a<java.lang.Boolean> r6 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.H
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.d(r6, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.y r6 = r7.build()
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r6
            return r6
        L83:
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.f K0(kotlin.reflect.jvm.internal.impl.descriptors.w0 r11, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1>> r12) {
            r10 = this;
            boolean r0 = r10.Q0(r11, r12)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = r10.X0(r11, r12)
            kotlin.jvm.internal.g0.m(r0)
            boolean r2 = r11.C()
            if (r2 == 0) goto L1d
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r12 = r10.Y0(r11, r12)
            kotlin.jvm.internal.g0.m(r12)
            goto L1e
        L1d:
            r12 = r1
        L1e:
            if (r12 == 0) goto L26
            r12.i()
            r0.i()
        L26:
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.d r2 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.d
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = r10.d1()
            r2.<init>(r3, r0, r12, r11)
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r0.getReturnType()
            kotlin.jvm.internal.g0.m(r3)
            java.util.List r4 = kotlin.collections.f0.J()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r5 = r10.P()
            r6 = 0
            java.util.List r7 = kotlin.collections.f0.J()
            r2.X0(r3, r4, r5, r6, r7)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3 = r0.getAnnotations()
            r6 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r7 = r0.getSource()
            r4 = 0
            r5 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r11 = kotlin.reflect.jvm.internal.impl.resolve.h.k(r2, r3, r4, r5, r6, r7)
            r11.I0(r0)
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.getType()
            r11.L0(r0)
            java.lang.String r0 = "apply(...)"
            kotlin.jvm.internal.g0.o(r11, r0)
            if (r12 == 0) goto La9
            java.util.List r0 = r12.g()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Object r0 = kotlin.collections.f0.L2(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r0
            if (r0 == 0) goto L92
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3 = r12.getAnnotations()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r0.getAnnotations()
            kotlin.reflect.jvm.internal.impl.descriptors.s r8 = r12.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r9 = r12.getSource()
            r5 = 0
            r6 = 0
            r7 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.impl.m0 r1 = kotlin.reflect.jvm.internal.impl.resolve.h.m(r2, r3, r4, r5, r6, r7, r8, r9)
            r1.I0(r12)
            goto La9
        L92:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No parameter found for "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        La9:
            r2.Q0(r11, r1)
            return r2
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.f L0(x3.r r18, kotlin.reflect.jvm.internal.impl.types.t0 r19, kotlin.reflect.jvm.internal.impl.descriptors.Modality r20) {
            r17 = this;
            r2 = r18
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r17.M()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.h.a(r0, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = r17.d1()
            kotlin.reflect.jvm.internal.impl.descriptors.v1 r0 = r2.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.s r6 = kotlin.reflect.jvm.internal.impl.load.java.s0.d(r0)
            kotlin.reflect.jvm.internal.impl.name.f r8 = r2.getName()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r17.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            w3.b r0 = r0.t()
            w3.a r9 = r0.a(r2)
            r10 = 0
            r7 = 0
            r5 = r20
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.f r1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.f.b1(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r0 = "create(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.b()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r6 = kotlin.reflect.jvm.internal.impl.resolve.h.d(r1, r0)
            java.lang.String r0 = "createDefaultGetter(...)"
            kotlin.jvm.internal.g0.o(r6, r0)
            r0 = 0
            r1.Q0(r6, r0)
            if (r19 != 0) goto L60
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r17.M()
            r4 = 4
            r5 = 0
            r3 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.c.i(r0, r1, r2, r3, r4, r5)
            r11 = r1
            r1 = r17
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.B(r2, r0)
            r12 = r0
            goto L65
        L60:
            r11 = r1
            r1 = r17
            r12 = r19
        L65:
            java.util.List r13 = kotlin.collections.f0.J()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r14 = r1.P()
            r15 = 0
            java.util.List r16 = kotlin.collections.f0.J()
            r11.X0(r12, r13, r14, r15, r16)
            r6.L0(r12)
            return r11
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.descriptors.f M0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r0, x3.r r1, kotlin.reflect.jvm.internal.impl.types.t0 r2, kotlin.reflect.jvm.internal.impl.descriptors.Modality r3, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L5
            r2 = 0
        L5:
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.f r0 = r0.L0(r1, r2, r3)
            return r0
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> N0(kotlin.reflect.jvm.internal.impl.descriptors.impl.i r18) {
            r17 = this;
            r0 = r17
            x3.g r1 = r0.o
            java.util.Collection r1 = r1.z()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r4 = kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON
            r8 = 6
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r3 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(r4, r5, r6, r7, r8, r9)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
            r8 = 0
        L24:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L8b
            int r4 = r8 + 1
            java.lang.Object r5 = r1.next()
            x3.w r5 = (x3.w) r5
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r6 = r0.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d r6 = r6.g()
            x3.x r7 = r5.getType()
            kotlin.reflect.jvm.internal.impl.types.t0 r11 = r6.p(r7, r3)
            boolean r6 = r5.a()
            if (r6 == 0) goto L5e
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r6 = r0.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r6 = r6.a()
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r6 = r6.m()
            kotlin.reflect.jvm.internal.impl.builtins.j r6 = r6.p()
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = r6.k(r11)
        L5c:
            r15 = r6
            goto L60
        L5e:
            r6 = 0
            goto L5c
        L60:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.u0 r6 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.u0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r7 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r9 = r7.b()
            kotlin.reflect.jvm.internal.impl.name.f r10 = r5.getName()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r7 = r0.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r7 = r7.a()
            w3.b r7 = r7.t()
            w3.a r16 = r7.a(r5)
            r7 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r5 = r6
            r6 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.add(r5)
            r8 = r4
            goto L24
        L8b:
            return r2
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d1 O0(kotlin.reflect.jvm.internal.impl.descriptors.d1 r1, kotlin.reflect.jvm.internal.impl.name.f r2) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r1 = r1.n()
            r1.f(r2)
            r1.t()
            r1.g()
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r1.build()
            kotlin.jvm.internal.g0.m(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r1
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d1 P0(kotlin.reflect.jvm.internal.impl.descriptors.d1 r6) {
            r5 = this;
            java.util.List r0 = r6.g()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Object r0 = kotlin.collections.f0.A3(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r0
            r2 = 0
            if (r0 == 0) goto L7d
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r0.getType()
            kotlin.reflect.jvm.internal.impl.types.w1 r3 = r3.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r3 = r3.c()
            if (r3 == 0) goto L35
            kotlin.reflect.jvm.internal.impl.name.d r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.p(r3)
            if (r3 == 0) goto L35
            boolean r4 = r3.f()
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L35
            kotlin.reflect.jvm.internal.impl.name.c r3 = r3.m()
            goto L36
        L35:
            r3 = r2
        L36:
            kotlin.reflect.jvm.internal.impl.name.c r4 = kotlin.reflect.jvm.internal.impl.builtins.o.w
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r4)
            if (r3 == 0) goto L3f
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 != 0) goto L43
            goto L7d
        L43:
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r2 = r6.n()
            java.util.List r6 = r6.g()
            kotlin.jvm.internal.g0.o(r6, r1)
            r1 = 1
            java.util.List r6 = kotlin.collections.f0.h2(r6, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r6 = r2.n(r6)
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
            java.util.List r0 = r0.G0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.types.c2 r0 = (kotlin.reflect.jvm.internal.impl.types.c2) r0
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r6 = r6.h(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.y r6 = r6.build()
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r6
            r0 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.impl.o0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.o0) r0
            if (r0 == 0) goto L7c
            r0.c1(r1)
        L7c:
            return r6
        L7d:
            return r2
    }

    private final boolean Q0(kotlin.reflect.jvm.internal.impl.descriptors.w0 r4, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1>> r5) {
            r3 = this;
            boolean r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d.a(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = r3.X0(r4, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r5 = r3.Y0(r4, r5)
            if (r0 != 0) goto L13
            return r1
        L13:
            boolean r4 = r4.C()
            r2 = 1
            if (r4 != 0) goto L1b
            return r2
        L1b:
            if (r5 == 0) goto L28
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = r5.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r5 = r0.i()
            if (r4 != r5) goto L28
            return r2
        L28:
            return r1
    }

    private final boolean R0(kotlin.reflect.jvm.internal.impl.descriptors.a r4, kotlin.reflect.jvm.internal.impl.descriptors.a r5) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r0 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.f
            r1 = 1
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r0 = r0.F(r5, r4, r1)
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r0 = r0.c()
            java.lang.String r2 = "getResult(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r2 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE
            if (r0 != r2) goto L1d
            kotlin.reflect.jvm.internal.impl.load.java.y$a r0 = kotlin.reflect.jvm.internal.impl.load.java.y.a
            boolean r4 = r0.a(r5, r4)
            if (r4 != 0) goto L1d
            return r1
        L1d:
            r4 = 0
            return r4
    }

    private final boolean S0(kotlin.reflect.jvm.internal.impl.descriptors.d1 r7) {
            r6 = this;
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a
            kotlin.reflect.jvm.internal.impl.name.f r1 = r7.getName()
            java.lang.String r2 = "getName(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.jvm.internal.impl.name.f r0 = r0.b(r1)
            r1 = 0
            if (r0 != 0) goto L13
            return r1
        L13:
            java.util.Set r2 = r6.c1(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L37
            java.lang.Object r4 = r2.next()
            r5 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r5
            boolean r5 = kotlin.reflect.jvm.internal.impl.load.java.r0.d(r5)
            if (r5 == 0) goto L20
            r3.add(r4)
            goto L20
        L37:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L3e
            return r1
        L3e:
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r7 = r6.O0(r7, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L49
            return r1
        L49:
            java.util.Iterator r0 = r3.iterator()
        L4d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r2
            boolean r2 = r6.T0(r2, r7)
            if (r2 == 0) goto L4d
            r7 = 1
            return r7
        L61:
            return r1
    }

    private final boolean T0(kotlin.reflect.jvm.internal.impl.descriptors.d1 r2, kotlin.reflect.jvm.internal.impl.descriptors.y r3) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.e r0 = kotlin.reflect.jvm.internal.impl.load.java.e.o
            boolean r0 = r0.m(r2)
            if (r0 == 0) goto Lc
            kotlin.reflect.jvm.internal.impl.descriptors.y r3 = r3.a()
        Lc:
            kotlin.jvm.internal.g0.m(r3)
            boolean r2 = r1.R0(r3, r2)
            return r2
    }

    private final boolean U0(kotlin.reflect.jvm.internal.impl.descriptors.d1 r5) {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = r4.P0(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            kotlin.reflect.jvm.internal.impl.name.f r5 = r5.getName()
            java.lang.String r2 = "getName(...)"
            kotlin.jvm.internal.g0.o(r5, r2)
            java.util.Set r5 = r4.c1(r5)
            boolean r2 = androidx.activity.k.a(r5)
            if (r2 == 0) goto L22
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L22
            return r1
        L22:
            java.util.Iterator r5 = r5.iterator()
        L26:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r2
            boolean r3 = r2.isSuspend()
            if (r3 == 0) goto L26
            boolean r2 = r4.R0(r0, r2)
            if (r2 == 0) goto L26
            r5 = 1
            return r5
        L40:
            return r1
    }

    private static final java.util.Map V0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r3) {
            x3.g r3 = r3.o
            java.util.Collection r3 = r3.F()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r3.next()
            r2 = r1
            x3.n r2 = (x3.n) r2
            boolean r2 = r2.H()
            if (r2 == 0) goto L11
            r0.add(r1)
            goto L11
        L28:
            r3 = 10
            int r3 = kotlin.collections.f0.d0(r0, r3)
            int r3 = kotlin.collections.i1.j(r3)
            r1 = 16
            int r3 = kotlin.ranges.t.u(r3, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r3)
            java.util.Iterator r3 = r0.iterator()
        L41:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r3.next()
            r2 = r0
            x3.n r2 = (x3.n) r2
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
            r1.put(r2, r0)
            goto L41
        L56:
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d1 W0(kotlin.reflect.jvm.internal.impl.descriptors.w0 r5, java.lang.String r6, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1>> r7) {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.name.f r6 = kotlin.reflect.jvm.internal.impl.name.f.h(r6)
            java.lang.String r0 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r6, r0)
            java.lang.Object r6 = r7.invoke(r6)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L13:
            boolean r7 = r6.hasNext()
            r0 = 0
            if (r7 == 0) goto L42
            java.lang.Object r7 = r6.next()
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r7 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r7
            java.util.List r1 = r7.g()
            int r1 = r1.size()
            if (r1 == 0) goto L2b
            goto L40
        L2b:
            kotlin.reflect.jvm.internal.impl.types.checker.e r1 = kotlin.reflect.jvm.internal.impl.types.checker.e.a
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r7.getReturnType()
            if (r2 != 0) goto L35
            r1 = 0
            goto L3d
        L35:
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r5.getType()
            boolean r1 = r1.d(r2, r3)
        L3d:
            if (r1 == 0) goto L40
            r0 = r7
        L40:
            if (r0 == 0) goto L13
        L42:
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d1 X0(kotlin.reflect.jvm.internal.impl.descriptors.w0 r4, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1>> r5) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.x0 r0 = r4.getGetter()
            r1 = 0
            if (r0 == 0) goto Le
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = kotlin.reflect.jvm.internal.impl.load.java.r0.g(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.x0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.x0) r0
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L17
            kotlin.reflect.jvm.internal.impl.load.java.l r1 = kotlin.reflect.jvm.internal.impl.load.java.l.a
            java.lang.String r1 = r1.b(r0)
        L17:
            if (r1 == 0) goto L28
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r3.d1()
            boolean r0 = kotlin.reflect.jvm.internal.impl.load.java.r0.l(r2, r0)
            if (r0 != 0) goto L28
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r4 = r3.W0(r4, r1, r5)
            return r4
        L28:
            kotlin.reflect.jvm.internal.impl.name.f r0 = r4.getName()
            java.lang.String r0 = r0.b()
            java.lang.String r1 = "asString(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.String r0 = kotlin.reflect.jvm.internal.impl.load.java.h0.b(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r4 = r3.W0(r4, r0, r5)
            return r4
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d1 Y0(kotlin.reflect.jvm.internal.impl.descriptors.w0 r6, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1>> r7) {
            r5 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = r6.getName()
            java.lang.String r0 = r0.b()
            java.lang.String r1 = "asString(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.String r0 = kotlin.reflect.jvm.internal.impl.load.java.h0.e(r0)
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.f.h(r0)
            java.lang.String r1 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Object r7 = r7.invoke(r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L24:
            boolean r0 = r7.hasNext()
            r1 = 0
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r7.next()
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r0
            java.util.List r2 = r0.g()
            int r2 = r2.size()
            r3 = 1
            if (r2 == r3) goto L3d
            goto L6b
        L3d:
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r0.getReturnType()
            if (r2 != 0) goto L44
            goto L6b
        L44:
            boolean r2 = kotlin.reflect.jvm.internal.impl.builtins.j.D0(r2)
            if (r2 != 0) goto L4b
            goto L6b
        L4b:
            kotlin.reflect.jvm.internal.impl.types.checker.e r2 = kotlin.reflect.jvm.internal.impl.types.checker.e.a
            java.util.List r3 = r0.g()
            java.lang.String r4 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            java.lang.Object r3 = kotlin.collections.f0.m5(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r3
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r3.getType()
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r6.getType()
            boolean r2 = r2.a(r3, r4)
            if (r2 == 0) goto L6b
            r1 = r0
        L6b:
            if (r1 == 0) goto L24
        L6d:
            return r1
    }

    private static final java.util.Set Z0(kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r2) {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r1.a()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.e r0 = r0.w()
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r2.d1()
            java.util.List r1 = r0.c(r2, r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Set r1 = kotlin.collections.f0.f6(r1)
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.s a1(kotlin.reflect.jvm.internal.impl.descriptors.d r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.s r2 = r2.getVisibility()
            java.lang.String r0 = "getVisibility(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = kotlin.reflect.jvm.internal.impl.load.java.x.b
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r0 == 0) goto L18
            kotlin.reflect.jvm.internal.impl.descriptors.s r2 = kotlin.reflect.jvm.internal.impl.load.java.x.c
            java.lang.String r0 = "PROTECTED_AND_PACKAGE"
            kotlin.jvm.internal.g0.o(r2, r0)
        L18:
            return r2
    }

    private final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.d1> c1(kotlin.reflect.jvm.internal.impl.name.f r5) {
            r4 = this;
            java.util.Collection r0 = r4.D0()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r2.r()
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r3 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_SUPER_MEMBERS
            java.util.Collection r2 = r2.a(r5, r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.collections.f0.s0(r1, r2)
            goto Lf
        L2b:
            return r1
    }

    private final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.w0> e1(kotlin.reflect.jvm.internal.impl.name.f r6) {
            r5 = this;
            java.util.Collection r0 = r5.D0()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r2.r()
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r3 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_SUPER_MEMBERS
            java.util.Collection r2 = r2.c(r6, r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.f0.d0(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L36:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L46
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r4
            r3.add(r4)
            goto L36
        L46:
            kotlin.collections.f0.s0(r1, r3)
            goto Lf
        L4a:
            java.util.Set r6 = kotlin.collections.f0.f6(r1)
            return r6
    }

    private final boolean f1(kotlin.reflect.jvm.internal.impl.descriptors.d1 r7, kotlin.reflect.jvm.internal.impl.descriptors.y r8) {
            r6 = this;
            r0 = 0
            r1 = 2
            r2 = 0
            java.lang.String r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.c0.c(r7, r0, r0, r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.y r4 = r8.a()
            java.lang.String r5 = "getOriginal(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            java.lang.String r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.c0.c(r4, r0, r0, r1, r2)
            boolean r1 = kotlin.jvm.internal.g0.g(r3, r1)
            if (r1 == 0) goto L22
            boolean r7 = r6.R0(r7, r8)
            if (r7 != 0) goto L22
            r7 = 1
            return r7
        L22:
            return r0
    }

    private final boolean g1(kotlin.reflect.jvm.internal.impl.descriptors.d1 r6) {
            r5 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = r6.getName()
            java.lang.String r1 = "getName(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.load.java.n0.a(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L1e
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1e
            goto L74
        L1e:
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L74
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.name.f r1 = (kotlin.reflect.jvm.internal.impl.name.f) r1
            java.util.Set r1 = r5.e1(r1)
            boolean r3 = androidx.activity.k.a(r1)
            if (r3 == 0) goto L3f
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L3f
            goto L22
        L3f:
            java.util.Iterator r1 = r1.iterator()
        L43:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L22
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r3
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.v r4 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.v
            r4.<init>(r6, r5)
            boolean r4 = r5.Q0(r3, r4)
            if (r4 == 0) goto L43
            boolean r3 = r3.C()
            if (r3 != 0) goto L73
            kotlin.reflect.jvm.internal.impl.name.f r3 = r6.getName()
            java.lang.String r3 = r3.b()
            java.lang.String r4 = "asString(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            boolean r3 = kotlin.reflect.jvm.internal.impl.load.java.h0.d(r3)
            if (r3 != 0) goto L43
        L73:
            return r2
        L74:
            boolean r0 = r5.S0(r6)
            if (r0 != 0) goto L88
            boolean r0 = r5.s1(r6)
            if (r0 != 0) goto L88
            boolean r6 = r5.U0(r6)
            if (r6 != 0) goto L88
            r6 = 1
            return r6
        L88:
            return r2
    }

    public static final /* synthetic */ java.util.Collection h0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r0, kotlin.reflect.jvm.internal.impl.name.f r1) {
            java.util.Collection r0 = r0.q1(r1)
            return r0
    }

    private static final java.util.Collection h1(kotlin.reflect.jvm.internal.impl.descriptors.d1 r1, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r2, kotlin.reflect.jvm.internal.impl.name.f r3) {
            java.lang.String r0 = "accessorName"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.name.f r0 = r1.getName()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r3)
            if (r0 == 0) goto L16
            java.util.List r1 = kotlin.collections.f0.l(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            return r1
        L16:
            java.util.Collection r1 = r2.q1(r3)
            java.util.Collection r2 = r2.r1(r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r1 = kotlin.collections.f0.I4(r1, r2)
            java.util.Collection r1 = (java.util.Collection) r1
            return r1
    }

    public static final /* synthetic */ java.util.Collection i0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r0, kotlin.reflect.jvm.internal.impl.name.f r1) {
            java.util.Collection r0 = r0.r1(r1)
            return r0
    }

    private static final java.util.Set i1(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r0) {
            x3.g r0 = r0.o
            java.util.Collection r0 = r0.q()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = kotlin.collections.f0.f6(r0)
            return r0
    }

    static /* synthetic */ java.util.List j0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r0, kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1) {
            java.util.List r0 = E0(r0, r1)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.d j1(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r10, kotlin.reflect.jvm.internal.impl.load.java.lazy.k r11, kotlin.reflect.jvm.internal.impl.name.f r12) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r12, r0)
            kotlin.reflect.jvm.internal.impl.storage.i<java.util.Set<kotlin.reflect.jvm.internal.impl.name.f>> r0 = r10.r
            java.lang.Object r0 = r0.invoke()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r12)
            r1 = 0
            if (r0 == 0) goto L56
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r11.a()
            kotlin.reflect.jvm.internal.impl.load.java.t r0 = r0.d()
            kotlin.reflect.jvm.internal.impl.load.java.t$a r2 = new kotlin.reflect.jvm.internal.impl.load.java.t$a
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = r10.d1()
            kotlin.reflect.jvm.internal.impl.name.b r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.n(r3)
            kotlin.jvm.internal.g0.m(r3)
            kotlin.reflect.jvm.internal.impl.name.b r3 = r3.d(r12)
            x3.g r5 = r10.o
            r6 = 2
            r7 = 0
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            x3.g r6 = r0.b(r2)
            if (r6 == 0) goto L55
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.n r3 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.n
            kotlin.reflect.jvm.internal.impl.descriptors.d r5 = r10.d1()
            r8 = 8
            r9 = 0
            r7 = 0
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r10 = r4.a()
            kotlin.reflect.jvm.internal.impl.load.java.u r10 = r10.e()
            r10.a(r3)
            return r3
        L55:
            return r1
        L56:
            r4 = r11
            kotlin.reflect.jvm.internal.impl.storage.i<java.util.Set<kotlin.reflect.jvm.internal.impl.name.f>> r11 = r10.s
            java.lang.Object r11 = r11.invoke()
            java.util.Set r11 = (java.util.Set) r11
            boolean r11 = r11.contains(r12)
            if (r11 == 0) goto La8
            java.util.List r11 = kotlin.collections.f0.j()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r4.a()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.e r0 = r0.w()
            kotlin.reflect.jvm.internal.impl.descriptors.d r10 = r10.d1()
            r0.h(r10, r12, r11, r4)
            java.util.List r10 = kotlin.collections.f0.b(r11)
            int r11 = r10.size()
            if (r11 == 0) goto La7
            r12 = 1
            if (r11 != r12) goto L8c
            java.lang.Object r10 = kotlin.collections.f0.m5(r10)
            kotlin.reflect.jvm.internal.impl.descriptors.d r10 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r10
            return r10
        L8c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Multiple classes with same name are generated: "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        La7:
            return r1
        La8:
            kotlin.reflect.jvm.internal.impl.storage.i<java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, x3.n>> r11 = r10.t
            java.lang.Object r11 = r11.invoke()
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r11 = r11.get(r12)
            x3.n r11 = (x3.n) r11
            if (r11 == 0) goto Le3
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r4.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.y r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.y
            r1.<init>(r10)
            kotlin.reflect.jvm.internal.impl.storage.i r5 = r0.e(r1)
            kotlin.reflect.jvm.internal.impl.storage.n r2 = r4.e()
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = r10.d1()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r6 = kotlin.reflect.jvm.internal.impl.load.java.lazy.h.a(r4, r11)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r10 = r4.a()
            w3.b r10 = r10.t()
            w3.a r7 = r10.a(r11)
            r4 = r12
            kotlin.reflect.jvm.internal.impl.descriptors.impl.q r10 = kotlin.reflect.jvm.internal.impl.descriptors.impl.q.G0(r2, r3, r4, r5, r6, r7)
            return r10
        Le3:
            return r1
    }

    static /* synthetic */ java.util.Set k0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r0) {
            java.util.Set r0 = i1(r0)
            return r0
    }

    private static final java.util.Set k1(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r1) {
            java.util.Set r0 = r1.b()
            java.util.Set r1 = r1.d()
            java.util.Set r1 = kotlin.collections.u1.C(r0, r1)
            return r1
    }

    static /* synthetic */ java.util.Set l0(kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r1) {
            java.util.Set r0 = Z0(r0, r1)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d1 l1(kotlin.reflect.jvm.internal.impl.descriptors.d1 r3, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1>> r4, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1> r5) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r3 = kotlin.reflect.jvm.internal.impl.load.java.h.l(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r4 = r2.J0(r3, r4)
            if (r4 == 0) goto L1d
            boolean r1 = r2.g1(r4)
            if (r1 == 0) goto L15
            goto L16
        L15:
            r4 = r0
        L16:
            if (r4 == 0) goto L1d
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r3 = r2.I0(r4, r3, r5)
            return r3
        L1d:
            return r0
    }

    static /* synthetic */ java.util.Map m0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r0) {
            java.util.Map r0 = V0(r0)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d1 m1(kotlin.reflect.jvm.internal.impl.descriptors.d1 r4, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1>> r5, kotlin.reflect.jvm.internal.impl.name.f r6, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1> r7) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = kotlin.reflect.jvm.internal.impl.load.java.r0.g(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r4
            r0 = 0
            if (r4 != 0) goto La
            return r0
        La:
            java.lang.String r1 = kotlin.reflect.jvm.internal.impl.load.java.r0.e(r4)
            kotlin.jvm.internal.g0.m(r1)
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.name.f.h(r1)
            java.lang.String r2 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.Object r5 = r5.invoke(r1)
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r5 = r5.iterator()
        L24:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r1
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r1 = r3.O0(r1, r6)
            boolean r2 = r3.T0(r4, r1)
            if (r2 == 0) goto L24
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r4 = r3.I0(r1, r4, r7)
            return r4
        L3f:
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d n0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r0, kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1, kotlin.reflect.jvm.internal.impl.name.f r2) {
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = j1(r0, r1, r2)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d1 n1(kotlin.reflect.jvm.internal.impl.descriptors.d1 r4, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1>> r5) {
            r3 = this;
            boolean r0 = r4.isSuspend()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            kotlin.reflect.jvm.internal.impl.name.f r0 = r4.getName()
            java.lang.String r2 = "getName(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            java.lang.Object r5 = r5.invoke(r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L1b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r0
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = r3.P0(r0)
            if (r0 == 0) goto L34
            boolean r2 = r3.R0(r0, r4)
            if (r2 == 0) goto L34
            goto L35
        L34:
            r0 = r1
        L35:
            if (r0 == 0) goto L1b
            return r0
        L38:
            return r1
    }

    static /* synthetic */ boolean o0(x3.q r0) {
            boolean r0 = A0(r0)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.b o1(x3.k r11) {
            r10 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r10.d1()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = r10.M()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.h.a(r1, r11)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2 = r10.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r2 = r2.a()
            w3.b r2 = r2.t()
            w3.a r2 = r2.a(r11)
            r3 = 0
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.b r1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.b.o1(r0, r1, r3, r2)
            java.lang.String r2 = "createJavaConstructor(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2 = r10.M()
            java.util.List r4 = r0.t()
            int r4 = r4.size()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.c.h(r2, r1, r11, r4)
            java.util.List r4 = r11.g()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0$b r4 = r10.e0(r2, r1, r4)
            java.util.List r5 = r0.t()
            java.lang.String r6 = "getDeclaredTypeParameters(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.List r6 = r11.getTypeParameters()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = kotlin.collections.f0.d0(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L5e:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L79
            java.lang.Object r8 = r6.next()
            x3.y r8 = (x3.y) r8
            kotlin.reflect.jvm.internal.impl.load.java.lazy.p r9 = r2.f()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r8 = r9.a(r8)
            kotlin.jvm.internal.g0.m(r8)
            r7.add(r8)
            goto L5e
        L79:
            java.util.List r5 = kotlin.collections.f0.I4(r5, r7)
            java.util.List r6 = r4.a()
            kotlin.reflect.jvm.internal.impl.descriptors.v1 r7 = r11.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.s r7 = kotlin.reflect.jvm.internal.impl.load.java.s0.d(r7)
            r1.m1(r6, r7, r5)
            r1.T0(r3)
            boolean r3 = r4.b()
            r1.U0(r3)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.s()
            r1.b1(r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r2.a()
            kotlin.reflect.jvm.internal.impl.load.java.components.j r0 = r0.h()
            r0.b(r11, r1)
            return r1
    }

    static /* synthetic */ java.util.Collection p0(kotlin.reflect.jvm.internal.impl.descriptors.d1 r0, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r1, kotlin.reflect.jvm.internal.impl.name.f r2) {
            java.util.Collection r0 = h1(r0, r1, r2)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.e p1(x3.w r17) {
            r16 = this;
            r0 = r17
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = r16.M()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.h.a(r1, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r16.d1()
            kotlin.reflect.jvm.internal.impl.name.f r3 = r0.getName()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r4 = r16.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r4 = r4.a()
            w3.b r4 = r4.t()
            w3.a r4 = r4.a(r0)
            r5 = 1
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e r6 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.k1(r2, r1, r3, r4, r5)
            java.lang.String r1 = "createJavaMethod(...)"
            kotlin.jvm.internal.g0.o(r6, r1)
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r7 = kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON
            r11 = 6
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(r7, r8, r9, r10, r11, r12)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2 = r16.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d r2 = r2.g()
            x3.x r3 = r0.getType()
            kotlin.reflect.jvm.internal.impl.types.t0 r12 = r2.p(r3, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r8 = r16.P()
            java.util.List r9 = kotlin.collections.f0.J()
            java.util.List r10 = kotlin.collections.f0.J()
            java.util.List r11 = kotlin.collections.f0.J()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.Companion
            r2 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r13 = r1.a(r2, r2, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.s r14 = kotlin.reflect.jvm.internal.impl.descriptors.r.e
            r15 = 0
            r7 = 0
            r6.j1(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r6.n1(r2, r2)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = r16.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r1 = r1.a()
            kotlin.reflect.jvm.internal.impl.load.java.components.j r1 = r1.h()
            r1.d(r0, r6)
            return r6
    }

    static /* synthetic */ java.util.Collection q0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r0, kotlin.reflect.jvm.internal.impl.name.f r1) {
            java.util.Collection r0 = B0(r0, r1)
            return r0
    }

    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> q1(kotlin.reflect.jvm.internal.impl.name.f r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r2.O()
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c r0 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c) r0
            java.util.Collection r3 = r0.e(r3)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r3.next()
            x3.r r1 = (x3.r) r1
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e r1 = r2.a0(r1)
            r0.add(r1)
            goto L1f
        L33:
            return r0
    }

    static /* synthetic */ java.util.Collection r0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r0, kotlin.reflect.jvm.internal.impl.name.f r1) {
            java.util.Collection r0 = C0(r0, r1)
            return r0
    }

    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> r1(kotlin.reflect.jvm.internal.impl.name.f r5) {
            r4 = this;
            java.util.Set r5 = r4.c1(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r5.next()
            r2 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r2
            boolean r3 = kotlin.reflect.jvm.internal.impl.load.java.r0.d(r2)
            if (r3 != 0) goto Ld
            kotlin.reflect.jvm.internal.impl.descriptors.y r2 = kotlin.reflect.jvm.internal.impl.load.java.h.l(r2)
            if (r2 == 0) goto L27
            goto Ld
        L27:
            r0.add(r1)
            goto Ld
        L2b:
            return r0
    }

    static /* synthetic */ java.util.Set s0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r0) {
            java.util.Set r0 = k1(r0)
            return r0
    }

    private final boolean s1(kotlin.reflect.jvm.internal.impl.descriptors.d1 r5) {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.load.java.h r0 = kotlin.reflect.jvm.internal.impl.load.java.h.o
            kotlin.reflect.jvm.internal.impl.name.f r1 = r5.getName()
            java.lang.String r2 = "getName(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            boolean r0 = r0.n(r1)
            r1 = 0
            if (r0 != 0) goto L13
            return r1
        L13:
            kotlin.reflect.jvm.internal.impl.name.f r0 = r5.getName()
            kotlin.jvm.internal.g0.o(r0, r2)
            java.util.Set r0 = r4.c1(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r3
            kotlin.reflect.jvm.internal.impl.descriptors.y r3 = kotlin.reflect.jvm.internal.impl.load.java.h.l(r3)
            if (r3 == 0) goto L27
            r2.add(r3)
            goto L27
        L3d:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L44
            return r1
        L44:
            java.util.Iterator r0 = r2.iterator()
        L48:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.y r2 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r2
            boolean r2 = r4.f1(r5, r2)
            if (r2 == 0) goto L48
            r5 = 1
            return r5
        L5c:
            return r1
    }

    private final void t0(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r14, kotlin.reflect.jvm.internal.impl.descriptors.j r15, int r16, x3.r r17, kotlin.reflect.jvm.internal.impl.types.t0 r18, kotlin.reflect.jvm.internal.impl.types.t0 r19) {
            r13 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r5 = r0.b()
            kotlin.reflect.jvm.internal.impl.name.f r6 = r17.getName()
            kotlin.reflect.jvm.internal.impl.types.t0 r7 = kotlin.reflect.jvm.internal.impl.types.j2.n(r18)
            java.lang.String r0 = "makeNotNullable(...)"
            kotlin.jvm.internal.g0.o(r7, r0)
            boolean r8 = r17.K()
            if (r19 == 0) goto L1f
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = kotlin.reflect.jvm.internal.impl.types.j2.n(r19)
        L1d:
            r11 = r0
            goto L21
        L1f:
            r0 = 0
            goto L1d
        L21:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r13.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            w3.b r0 = r0.t()
            r1 = r17
            w3.a r12 = r0.a(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.u0 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.u0
            r3 = 0
            r9 = 0
            r10 = 0
            r2 = r15
            r4 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14.add(r1)
            return
    }

    private final void u0(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> r7, kotlin.reflect.jvm.internal.impl.name.f r8, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1> r9, boolean r10) {
            r6 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = r6.d1()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r6.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r4 = r0.c()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r6.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.types.checker.p r0 = r0.k()
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r5 = r0.b()
            r2 = r7
            r0 = r8
            r1 = r9
            java.util.Collection r7 = kotlin.reflect.jvm.internal.impl.load.java.components.a.d(r0, r1, r2, r3, r4, r5)
            java.lang.String r8 = "resolveOverridesForNonStaticMembers(...)"
            kotlin.jvm.internal.g0.o(r7, r8)
            if (r10 != 0) goto L32
            r2.addAll(r7)
            return
        L32:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r8 = kotlin.collections.f0.I4(r2, r7)
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r10 = kotlin.collections.f0.d0(r7, r10)
            r9.<init>(r10)
            java.util.Iterator r7 = r7.iterator()
        L47:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L6d
            java.lang.Object r10 = r7.next()
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r10 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r10
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = kotlin.reflect.jvm.internal.impl.load.java.r0.j(r10)
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r0
            if (r0 != 0) goto L5f
            kotlin.jvm.internal.g0.m(r10)
            goto L69
        L5f:
            kotlin.jvm.internal.g0.m(r10)
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r10 = r6.I0(r10, r0, r1)
        L69:
            r9.add(r10)
            goto L47
        L6d:
            r2.addAll(r9)
            return
    }

    private final void v0(kotlin.reflect.jvm.internal.impl.name.f r3, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1> r4, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1> r5, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> r6, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1>> r7) {
            r2 = this;
            java.util.Iterator r5 = r5.iterator()
        L4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r0
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r1 = r2.m1(r0, r7, r3, r4)
            kotlin.reflect.jvm.internal.impl.utils.a.a(r6, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r1 = r2.l1(r0, r7, r4)
            kotlin.reflect.jvm.internal.impl.utils.a.a(r6, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = r2.n1(r0, r7)
            kotlin.reflect.jvm.internal.impl.utils.a.a(r6, r0)
            goto L4
        L26:
            return
    }

    private final void w0(java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.w0> r3, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> r4, java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.w0> r5, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1>> r6) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r3.next()
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r0
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.f r1 = r2.K0(r0, r6)
            if (r1 == 0) goto L4
            r4.add(r1)
            if (r5 == 0) goto L1e
            r5.add(r0)
        L1e:
            return
    }

    private final void x0(kotlin.reflect.jvm.internal.impl.name.f r7, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> r8) {
            r6 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r6.O()
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c r0 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c) r0
            java.util.Collection r7 = r0.e(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.Object r7 = kotlin.collections.f0.n5(r7)
            r1 = r7
            x3.r r1 = (x3.r) r1
            if (r1 != 0) goto L1a
            return
        L1a:
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            r4 = 2
            r5 = 0
            r2 = 0
            r0 = r6
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.f r7 = M0(r0, r1, r2, r3, r4, r5)
            r8.add(r7)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c A() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b r0 = r1.z0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    protected void C(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r12) {
            r10 = this;
            java.lang.String r3 = "result"
            kotlin.jvm.internal.g0.p(r11, r3)
            java.lang.String r3 = "name"
            kotlin.jvm.internal.g0.p(r12, r3)
            java.util.Set r4 = r10.c1(r12)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a r3 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.a
            boolean r3 = r3.k(r12)
            if (r3 != 0) goto L67
            kotlin.reflect.jvm.internal.impl.load.java.h r3 = kotlin.reflect.jvm.internal.impl.load.java.h.o
            boolean r3 = r3.n(r12)
            if (r3 != 0) goto L67
            boolean r3 = androidx.activity.k.a(r4)
            if (r3 == 0) goto L2b
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L2b
            goto L42
        L2b:
            java.util.Iterator r3 = r4.iterator()
        L2f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L42
            java.lang.Object r5 = r3.next()
            kotlin.reflect.jvm.internal.impl.descriptors.y r5 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r5
            boolean r5 = r5.isSuspend()
            if (r5 == 0) goto L2f
            goto L67
        L42:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r4.iterator()
        L4b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L62
            java.lang.Object r5 = r4.next()
            r6 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r6
            boolean r6 = r10.g1(r6)
            if (r6 == 0) goto L4b
            r3.add(r5)
            goto L4b
        L62:
            r4 = 0
            r10.u0(r11, r12, r3, r4)
            return
        L67:
            kotlin.reflect.jvm.internal.impl.utils.k$b r3 = kotlin.reflect.jvm.internal.impl.utils.k.c
            kotlin.reflect.jvm.internal.impl.utils.k r9 = r3.a()
            java.util.List r3 = kotlin.collections.f0.J()
            r5 = r3
            java.util.Collection r5 = (java.util.Collection) r5
            kotlin.reflect.jvm.internal.impl.descriptors.d r6 = r10.d1()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r7 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r3 = r10.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r3 = r3.a()
            kotlin.reflect.jvm.internal.impl.types.checker.p r3 = r3.k()
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r8 = r3.b()
            r3 = r12
            java.util.Collection r1 = kotlin.reflect.jvm.internal.impl.load.java.components.a.d(r3, r4, r5, r6, r7, r8)
            r6 = r4
            java.lang.String r3 = "resolveOverridesForNonStaticMembers(...)"
            kotlin.jvm.internal.g0.o(r1, r3)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z$a r5 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z$a
            r5.<init>(r10)
            r4 = r11
            r0 = r10
            r2 = r11
            r3 = r1
            r1 = r12
            r0.v0(r1, r2, r3, r4, r5)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z$b r5 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z$b
            r5.<init>(r10)
            r4 = r9
            r0.v0(r1, r2, r3, r4, r5)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r5 = r6.iterator()
        Lb4:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lcb
            java.lang.Object r6 = r5.next()
            r7 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r7 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r7
            boolean r7 = r10.g1(r7)
            if (r7 == 0) goto Lb4
            r3.add(r6)
            goto Lb4
        Lcb:
            java.util.List r3 = kotlin.collections.f0.I4(r3, r4)
            java.util.Collection r3 = (java.util.Collection) r3
            r4 = 1
            r10.u0(r11, r12, r3, r4)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    protected void D(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r12, @org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> r13) {
            r11 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.p(r13, r0)
            x3.g r0 = r11.o
            boolean r0 = r0.k()
            if (r0 == 0) goto L15
            r11.x0(r12, r13)
        L15:
            java.util.Set r0 = r11.e1(r12)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L20
            return
        L20:
            kotlin.reflect.jvm.internal.impl.utils.k$b r1 = kotlin.reflect.jvm.internal.impl.utils.k.c
            kotlin.reflect.jvm.internal.impl.utils.k r2 = r1.a()
            kotlin.reflect.jvm.internal.impl.utils.k r1 = r1.a()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.w r3 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.w
            r3.<init>(r11)
            r11.w0(r0, r13, r2, r3)
            java.util.Set r2 = kotlin.collections.u1.x(r0, r2)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.x r3 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.x
            r3.<init>(r11)
            r4 = 0
            r11.w0(r2, r1, r4, r3)
            java.util.Set r6 = kotlin.collections.u1.C(r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.d r8 = r11.d1()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r11.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r9 = r0.c()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r11.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.types.checker.p r0 = r0.k()
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r10 = r0.b()
            r5 = r12
            r7 = r13
            java.util.Collection r12 = kotlin.reflect.jvm.internal.impl.load.java.components.a.d(r5, r6, r7, r8, r9, r10)
            java.lang.String r13 = "resolveOverridesForNonStaticMembers(...)"
            kotlin.jvm.internal.g0.o(r12, r13)
            r7.addAll(r12)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    @org.jetbrains.annotations.NotNull
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> E(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r2, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r3) {
            r1 = this;
            java.lang.String r3 = "kindFilter"
            kotlin.jvm.internal.g0.p(r2, r3)
            x3.g r2 = r1.o
            boolean r2 = r2.k()
            if (r2 == 0) goto L12
            java.util.Set r2 = r1.b()
            return r2
        L12:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            kotlin.reflect.jvm.internal.impl.storage.i r3 = r1.O()
            java.lang.Object r3 = r3.invoke()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c r3 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c) r3
            java.util.Set r3 = r3.d()
            r2.<init>(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = r1.d1()
            kotlin.reflect.jvm.internal.impl.types.w1 r3 = r3.o()
            java.util.Collection r3 = r3.i()
            java.lang.String r0 = "getSupertypes(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L3c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r3.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r0.r()
            java.util.Set r0 = r0.d()
            kotlin.collections.f0.s0(r2, r0)
            goto L3c
        L54:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    @org.jetbrains.annotations.Nullable
    protected kotlin.reflect.jvm.internal.impl.descriptors.z0 P() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.d1()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = kotlin.reflect.jvm.internal.impl.resolve.i.l(r0)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k S() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.d1()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    protected boolean W(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.descriptors.e r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            x3.g r0 = r1.o
            boolean r0 = r0.k()
            if (r0 == 0) goto Lf
            r2 = 0
            return r2
        Lf:
            boolean r2 = r1.g1(r2)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0.a Z(@org.jetbrains.annotations.NotNull x3.r r9, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r11, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.q1> r12) {
            r8 = this;
            java.lang.String r0 = "method"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "methodTypeParameters"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "returnType"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "valueParameters"
            kotlin.jvm.internal.g0.p(r12, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r8.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.load.java.components.o r1 = r0.s()
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = r8.d1()
            r5 = 0
            r2 = r9
            r7 = r10
            r4 = r11
            r6 = r12
            kotlin.reflect.jvm.internal.impl.load.java.components.o$b r9 = r1.b(r2, r3, r4, r5, r6, r7)
            java.lang.String r10 = "resolvePropagatedSignature(...)"
            kotlin.jvm.internal.g0.o(r9, r10)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0$a
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r9.d()
            java.lang.String r10 = "getReturnType(...)"
            kotlin.jvm.internal.g0.o(r1, r10)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r9.c()
            java.util.List r3 = r9.f()
            java.lang.String r10 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r3, r10)
            java.util.List r4 = r9.e()
            java.lang.String r10 = "getTypeParameters(...)"
            kotlin.jvm.internal.g0.o(r4, r10)
            boolean r5 = r9.g()
            java.util.List r6 = r9.b()
            java.lang.String r9 = "getErrors(...)"
            kotlin.jvm.internal.g0.o(r6, r9)
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0, kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.e(r2, r3)
            java.util.Collection r2 = super.a(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.storage.i<java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.c>> b1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.storage.i<java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.c>> r0 = r1.q
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0, kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.e(r2, r3)
            java.util.Collection r2 = super.c(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.descriptors.d d1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.n
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    public void e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3, @org.jetbrains.annotations.NotNull t3.b r4) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r2.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            t3.c r0 = r0.l()
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r2.d1()
            s3.a.a(r0, r4, r1, r3)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.f g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.e(r2, r3)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 r3 = r1.R()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z r3 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z) r3
            if (r3 == 0) goto L22
            kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.d> r3 = r3.u
            if (r3 == 0) goto L22
            java.lang.Object r3 = r3.invoke(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r3
            if (r3 == 0) goto L22
            return r3
        L22:
            kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.d> r3 = r1.u
            java.lang.Object r2 = r3.invoke(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = (kotlin.reflect.jvm.internal.impl.descriptors.f) r2
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Lazy Java member scope for "
            r0.append(r1)
            x3.g r1 = r2.o
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.d()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    @org.jetbrains.annotations.NotNull
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> w(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r1, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r2) {
            r0 = this;
            java.lang.String r2 = "kindFilter"
            kotlin.jvm.internal.g0.p(r1, r2)
            kotlin.reflect.jvm.internal.impl.storage.i<java.util.Set<kotlin.reflect.jvm.internal.impl.name.f>> r1 = r0.r
            java.lang.Object r1 = r1.invoke()
            java.util.Set r1 = (java.util.Set) r1
            kotlin.reflect.jvm.internal.impl.storage.i<java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, x3.n>> r2 = r0.t
            java.lang.Object r2 = r2.invoke()
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r2 = r2.keySet()
            java.util.Set r1 = kotlin.collections.u1.C(r1, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    public /* bridge */ /* synthetic */ java.util.Set y(kotlin.reflect.jvm.internal.impl.resolve.scopes.d r1, kotlin.jvm.functions.Function1 r2) {
            r0 = this;
            java.util.LinkedHashSet r1 = r0.y0(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    protected java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.f> y0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r4, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r5) {
            r3 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r3.d1()
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.o()
            java.util.Collection r0 = r0.i()
            java.lang.String r1 = "getSupertypes(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r2.r()
            java.util.Set r2 = r2.b()
            kotlin.collections.f0.s0(r1, r2)
            goto L21
        L39:
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.O()
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c r0 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c) r0
            java.util.Set r0 = r0.a()
            r1.addAll(r0)
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.O()
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c r0 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c) r0
            java.util.Set r0 = r0.b()
            r1.addAll(r0)
            java.util.Set r4 = r3.w(r4, r5)
            r1.addAll(r4)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r4 = r3.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r4 = r4.a()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.e r4 = r4.w()
            kotlin.reflect.jvm.internal.impl.descriptors.d r5 = r3.d1()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r3.M()
            java.util.List r4 = r4.d(r5, r0)
            java.util.Collection r4 = (java.util.Collection) r4
            r1.addAll(r4)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    protected void z(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r5) {
            r3 = this;
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r5, r0)
            x3.g r0 = r3.o
            boolean r0 = r0.A()
            if (r0 == 0) goto L62
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.O()
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c r0 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c) r0
            x3.w r0 = r0.f(r5)
            if (r0 == 0) goto L62
            r0 = r4
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L2f
            goto L4a
        L2f:
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r1
            java.util.List r1 = r1.g()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L33
            goto L62
        L4a:
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.O()
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c r0 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c) r0
            x3.w r0 = r0.f(r5)
            kotlin.jvm.internal.g0.m(r0)
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e r0 = r3.p1(r0)
            r4.add(r0)
        L62:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r3.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.e r0 = r0.w()
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r3.d1()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2 = r3.M()
            r0.f(r1, r5, r4, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b z0() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
            x3.g r1 = r3.o
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.u r2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.u.a
            r0.<init>(r1, r2)
            return r0
    }
}
