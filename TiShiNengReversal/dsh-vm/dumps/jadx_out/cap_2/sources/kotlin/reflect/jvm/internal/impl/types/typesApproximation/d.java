package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCapturedTypeApproximation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapturedTypeApproximation.kt\norg/jetbrains/kotlin/types/typesApproximation/CapturedTypeApproximationKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1761#2,3:179\n1563#2:183\n1634#2,3:184\n1#3:182\n*S KotlinDebug\n*F\n+ 1 CapturedTypeApproximation.kt\norg/jetbrains/kotlin/types/typesApproximation/CapturedTypeApproximationKt\n*L\n158#1:179,3\n167#1:183\n167#1:184,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlin.reflect.jvm.internal.impl.types.Variance[] r0 = kotlin.reflect.jvm.internal.impl.types.Variance.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.d.a.a = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends kotlin.reflect.jvm.internal.impl.types.x1 {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.x1
        public kotlin.reflect.jvm.internal.impl.types.c2 k(kotlin.reflect.jvm.internal.impl.types.w1 r3) {
                r2 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r3, r0)
                boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b
                r1 = 0
                if (r0 == 0) goto Ld
                kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b r3 = (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b) r3
                goto Le
            Ld:
                r3 = r1
            Le:
                if (r3 != 0) goto L11
                return r1
            L11:
                kotlin.reflect.jvm.internal.impl.types.c2 r0 = r3.getProjection()
                boolean r0 = r0.b()
                if (r0 == 0) goto L2b
                kotlin.reflect.jvm.internal.impl.types.e2 r0 = new kotlin.reflect.jvm.internal.impl.types.e2
                kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
                kotlin.reflect.jvm.internal.impl.types.c2 r3 = r3.getProjection()
                kotlin.reflect.jvm.internal.impl.types.t0 r3 = r3.getType()
                r0.<init>(r1, r3)
                return r0
            L2b:
                kotlin.reflect.jvm.internal.impl.types.c2 r3 = r3.getProjection()
                return r3
        }
    }

    static /* synthetic */ kotlin.n1 a(kotlin.reflect.jvm.internal.impl.renderer.u r0) {
            kotlin.n1 r0 = l(r0)
            return r0
    }

    static /* synthetic */ java.lang.Boolean b(kotlin.reflect.jvm.internal.impl.types.m2 r0) {
            java.lang.Boolean r0 = f(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<kotlin.reflect.jvm.internal.impl.types.t0> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r6) {
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r6, r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.n0.b(r6)
            if (r0 == 0) goto L59
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.types.n0.c(r6)
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a r0 = c(r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = kotlin.reflect.jvm.internal.impl.types.n0.d(r6)
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a r1 = c(r1)
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a r2 = new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a
            java.lang.Object r3 = r0.c()
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = (kotlin.reflect.jvm.internal.impl.types.t0) r3
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = kotlin.reflect.jvm.internal.impl.types.n0.c(r3)
            java.lang.Object r4 = r1.c()
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = (kotlin.reflect.jvm.internal.impl.types.t0) r4
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = kotlin.reflect.jvm.internal.impl.types.n0.d(r4)
            kotlin.reflect.jvm.internal.impl.types.m2 r3 = kotlin.reflect.jvm.internal.impl.types.w0.e(r3, r4)
            kotlin.reflect.jvm.internal.impl.types.m2 r3 = kotlin.reflect.jvm.internal.impl.types.l2.b(r3, r6)
            java.lang.Object r0 = r0.d()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.types.n0.c(r0)
            java.lang.Object r1 = r1.d()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = (kotlin.reflect.jvm.internal.impl.types.t0) r1
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = kotlin.reflect.jvm.internal.impl.types.n0.d(r1)
            kotlin.reflect.jvm.internal.impl.types.m2 r0 = kotlin.reflect.jvm.internal.impl.types.w0.e(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.m2 r6 = kotlin.reflect.jvm.internal.impl.types.l2.b(r0, r6)
            r2.<init>(r3, r6)
            return r2
        L59:
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r6.I0()
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.e.f(r6)
            java.lang.String r2 = "getNothingType(...)"
            if (r1 == 0) goto Lc9
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor"
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b r0 = (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b) r0
            kotlin.reflect.jvm.internal.impl.types.c2 r0 = r0.getProjection()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r0.getType()
            java.lang.String r3 = "getType(...)"
            kotlin.jvm.internal.g0.o(r1, r3)
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = d(r1, r6)
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = r0.c()
            int[] r4 = kotlin.reflect.jvm.internal.impl.types.typesApproximation.d.a.a
            int r3 = r3.ordinal()
            r3 = r4[r3]
            r4 = 2
            if (r3 == r4) goto Lbb
            r4 = 3
            if (r3 != r4) goto La4
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a r0 = new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a
            kotlin.reflect.jvm.internal.impl.builtins.j r3 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.o(r6)
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r3.I()
            kotlin.jvm.internal.g0.o(r3, r2)
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = d(r3, r6)
            r0.<init>(r6, r1)
            return r0
        La4:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Only nontrivial projections should have been captured, not: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
        Lbb:
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a r0 = new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a
            kotlin.reflect.jvm.internal.impl.builtins.j r6 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.o(r6)
            kotlin.reflect.jvm.internal.impl.types.e1 r6 = r6.J()
            r0.<init>(r1, r6)
            return r0
        Lc9:
            java.util.List r1 = r6.G0()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L188
            java.util.List r1 = r6.G0()
            int r1 = r1.size()
            java.util.List r3 = r0.getParameters()
            int r3 = r3.size()
            if (r1 == r3) goto Le7
            goto L188
        Le7:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r4 = r6.G0()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r0 = r0.getParameters()
            java.lang.String r5 = "getParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r5)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.f0.o6(r4, r0)
            java.util.Iterator r0 = r0.iterator()
        L10a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L14d
            java.lang.Object r4 = r0.next()
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.component1()
            kotlin.reflect.jvm.internal.impl.types.c2 r5 = (kotlin.reflect.jvm.internal.impl.types.c2) r5
            java.lang.Object r4 = r4.component2()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r4
            kotlin.jvm.internal.g0.m(r4)
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.e r4 = j(r5, r4)
            boolean r5 = r5.b()
            if (r5 == 0) goto L136
            r1.add(r4)
            r3.add(r4)
            goto L10a
        L136:
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a r4 = g(r4)
            java.lang.Object r5 = r4.a()
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.e r5 = (kotlin.reflect.jvm.internal.impl.types.typesApproximation.e) r5
            java.lang.Object r4 = r4.b()
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.e r4 = (kotlin.reflect.jvm.internal.impl.types.typesApproximation.e) r4
            r1.add(r5)
            r3.add(r4)
            goto L10a
        L14d:
            boolean r0 = r1.isEmpty()
            r4 = 0
            if (r0 == 0) goto L155
            goto L16c
        L155:
            java.util.Iterator r0 = r1.iterator()
        L159:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L16c
            java.lang.Object r5 = r0.next()
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.e r5 = (kotlin.reflect.jvm.internal.impl.types.typesApproximation.e) r5
            boolean r5 = r5.d()
            if (r5 != 0) goto L159
            r4 = 1
        L16c:
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a r0 = new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a
            if (r4 == 0) goto L17c
            kotlin.reflect.jvm.internal.impl.builtins.j r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.o(r6)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.I()
            kotlin.jvm.internal.g0.o(r1, r2)
            goto L180
        L17c:
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = h(r6, r1)
        L180:
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = h(r6, r3)
            r0.<init>(r1, r6)
            return r0
        L188:
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a r0 = new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a
            r0.<init>(r6, r6)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.types.t0 d(kotlin.reflect.jvm.internal.impl.types.t0 r0, kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            boolean r1 = r1.J0()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = kotlin.reflect.jvm.internal.impl.types.j2.q(r0, r1)
            java.lang.String r1 = "makeNullableIfNeeded(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.types.c2 e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.c2 r3, boolean r4) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            boolean r0 = r3.b()
            if (r0 == 0) goto Lb
            goto L1c
        Lb:
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r3.getType()
            java.lang.String r1 = "getType(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.c r1 = kotlin.reflect.jvm.internal.impl.types.typesApproximation.c.a
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.j2.c(r0, r1)
            if (r1 != 0) goto L1d
        L1c:
            return r3
        L1d:
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = r3.c()
            java.lang.String r2 = "getProjectionKind(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.Variance r2 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            if (r1 != r2) goto L3a
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a r3 = c(r0)
            kotlin.reflect.jvm.internal.impl.types.e2 r4 = new kotlin.reflect.jvm.internal.impl.types.e2
            java.lang.Object r3 = r3.d()
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = (kotlin.reflect.jvm.internal.impl.types.t0) r3
            r4.<init>(r1, r3)
            return r4
        L3a:
            if (r4 == 0) goto L4c
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a r3 = c(r0)
            java.lang.Object r3 = r3.c()
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = (kotlin.reflect.jvm.internal.impl.types.t0) r3
            kotlin.reflect.jvm.internal.impl.types.e2 r4 = new kotlin.reflect.jvm.internal.impl.types.e2
            r4.<init>(r1, r3)
            return r4
        L4c:
            kotlin.reflect.jvm.internal.impl.types.c2 r3 = i(r3)
            return r3
    }

    private static final java.lang.Boolean f(kotlin.reflect.jvm.internal.impl.types.m2 r0) {
            kotlin.jvm.internal.g0.m(r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.e.f(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<kotlin.reflect.jvm.internal.impl.types.typesApproximation.e> g(kotlin.reflect.jvm.internal.impl.types.typesApproximation.e r7) {
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r7.a()
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a r0 = c(r0)
            java.lang.Object r1 = r0.a()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = (kotlin.reflect.jvm.internal.impl.types.t0) r1
            java.lang.Object r0 = r0.b()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r7.b()
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a r2 = c(r2)
            java.lang.Object r3 = r2.a()
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = (kotlin.reflect.jvm.internal.impl.types.t0) r3
            java.lang.Object r2 = r2.b()
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a r4 = new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.e r5 = new kotlin.reflect.jvm.internal.impl.types.typesApproximation.e
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r6 = r7.c()
            r5.<init>(r6, r0, r3)
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.e r0 = new kotlin.reflect.jvm.internal.impl.types.typesApproximation.e
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r7 = r7.c()
            r0.<init>(r7, r1, r2)
            r4.<init>(r5, r0)
            return r4
    }

    private static final kotlin.reflect.jvm.internal.impl.types.t0 h(kotlin.reflect.jvm.internal.impl.types.t0 r6, java.util.List<kotlin.reflect.jvm.internal.impl.types.typesApproximation.e> r7) {
            java.util.List r0 = r6.G0()
            r0.size()
            r7.size()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.f0.d0(r7, r0)
            r1.<init>(r0)
            java.util.Iterator r7 = r7.iterator()
        L1b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r7.next()
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.e r0 = (kotlin.reflect.jvm.internal.impl.types.typesApproximation.e) r0
            kotlin.reflect.jvm.internal.impl.types.c2 r0 = k(r0)
            r1.add(r0)
            goto L1b
        L2f:
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = kotlin.reflect.jvm.internal.impl.types.g2.e(r0, r1, r2, r3, r4, r5)
            return r6
    }

    private static final kotlin.reflect.jvm.internal.impl.types.c2 i(kotlin.reflect.jvm.internal.impl.types.c2 r2) {
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.d$b r0 = new kotlin.reflect.jvm.internal.impl.types.typesApproximation.d$b
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = kotlin.reflect.jvm.internal.impl.types.h2.g(r0)
            java.lang.String r1 = "create(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.c2 r2 = r0.t(r2)
            return r2
    }

    private static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.e j(kotlin.reflect.jvm.internal.impl.types.c2 r4, kotlin.reflect.jvm.internal.impl.descriptors.j1 r5) {
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r5.l()
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.h2.c(r0, r4)
            int[] r1 = kotlin.reflect.jvm.internal.impl.types.typesApproximation.d.a.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            java.lang.String r2 = "getType(...)"
            if (r0 == r1) goto L55
            r1 = 2
            if (r0 == r1) goto L3b
            r1 = 3
            if (r0 != r1) goto L35
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.e r0 = new kotlin.reflect.jvm.internal.impl.types.typesApproximation.e
            kotlin.reflect.jvm.internal.impl.builtins.j r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.m(r5)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.I()
            java.lang.String r3 = "getNothingType(...)"
            kotlin.jvm.internal.g0.o(r1, r3)
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.getType()
            kotlin.jvm.internal.g0.o(r4, r2)
            r0.<init>(r5, r1, r4)
            return r0
        L35:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L3b:
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.e r0 = new kotlin.reflect.jvm.internal.impl.types.typesApproximation.e
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.getType()
            kotlin.jvm.internal.g0.o(r4, r2)
            kotlin.reflect.jvm.internal.impl.builtins.j r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.m(r5)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.J()
            java.lang.String r2 = "getNullableAnyType(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.<init>(r5, r4, r1)
            return r0
        L55:
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.e r0 = new kotlin.reflect.jvm.internal.impl.types.typesApproximation.e
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r4.getType()
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.getType()
            kotlin.jvm.internal.g0.o(r4, r2)
            r0.<init>(r5, r1, r4)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.types.c2 k(kotlin.reflect.jvm.internal.impl.types.typesApproximation.e r2) {
            r2.d()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.a()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r2.b()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 != 0) goto L6a
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r2.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r0.l()
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            if (r0 != r1) goto L1e
            goto L6a
        L1e:
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.a()
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.j.o0(r0)
            if (r0 == 0) goto L42
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r2.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r0.l()
            if (r0 == r1) goto L42
            kotlin.reflect.jvm.internal.impl.types.e2 r0 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = m(r2, r1)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.b()
            r0.<init>(r1, r2)
            return r0
        L42:
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.b()
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.j.q0(r0)
            if (r0 == 0) goto L5a
            kotlin.reflect.jvm.internal.impl.types.e2 r0 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = m(r2, r1)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.a()
            r0.<init>(r1, r2)
            return r0
        L5a:
            kotlin.reflect.jvm.internal.impl.types.e2 r0 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = m(r2, r1)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.b()
            r0.<init>(r1, r2)
            return r0
        L6a:
            kotlin.reflect.jvm.internal.impl.types.e2 r0 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.a()
            r0.<init>(r2)
            return r0
    }

    private static final kotlin.n1 l(kotlin.reflect.jvm.internal.impl.renderer.u r1) {
            java.lang.String r0 = "$this$withOptions"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.renderer.a$a r0 = kotlin.reflect.jvm.internal.impl.renderer.a.C0061a.a
            r1.p(r0)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.reflect.jvm.internal.impl.types.Variance m(kotlin.reflect.jvm.internal.impl.types.typesApproximation.e r0, kotlin.reflect.jvm.internal.impl.types.Variance r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r0.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r0.l()
            if (r1 != r0) goto Ld
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            return r0
        Ld:
            return r1
    }
}
