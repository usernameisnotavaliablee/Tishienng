package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypeAliasExpander.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasExpander.kt\norg/jetbrains/kotlin/types/TypeAliasExpander\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,278:1\n1#2:279\n1634#3,3:280\n1573#3:283\n1604#3,4:284\n1573#3:288\n1604#3,4:289\n1878#3,3:293\n*S KotlinDebug\n*F\n+ 1 TypeAliasExpander.kt\norg/jetbrains/kotlin/types/TypeAliasExpander\n*L\n148#1:280,3\n197#1:283\n197#1:284,4\n232#1:288\n232#1:289,4\n249#1:293,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o1 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.o1.a c = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.types.o1 d = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.q1 a;
    private final boolean b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ void a(kotlin.reflect.jvm.internal.impl.types.o1.a r0, int r1, kotlin.reflect.jvm.internal.impl.descriptors.i1 r2) {
                r0.b(r1, r2)
                return
        }

        private final void b(int r3, kotlin.reflect.jvm.internal.impl.descriptors.i1 r4) {
                r2 = this;
                r0 = 100
                if (r3 > r0) goto L5
                return
            L5:
                java.lang.AssertionError r3 = new java.lang.AssertionError
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Too deep recursion while expanding type alias "
                r0.append(r1)
                kotlin.reflect.jvm.internal.impl.name.f r4 = r4.getName()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r3.<init>(r4)
                throw r3
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.types.o1$a r0 = new kotlin.reflect.jvm.internal.impl.types.o1$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.o1.c = r0
            kotlin.reflect.jvm.internal.impl.types.o1 r0 = new kotlin.reflect.jvm.internal.impl.types.o1
            kotlin.reflect.jvm.internal.impl.types.q1$a r1 = kotlin.reflect.jvm.internal.impl.types.q1.a.a
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.o1.d = r0
            return
    }

    public o1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.q1 r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "reportStrategy"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    private final void a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4) {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r3.next()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r1
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.d()
            r0.add(r1)
            goto L9
        L1d:
            java.util.Iterator r3 = r4.iterator()
        L21:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3d
            java.lang.Object r4 = r3.next()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r4 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r4
            kotlin.reflect.jvm.internal.impl.name.c r1 = r4.d()
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L21
            kotlin.reflect.jvm.internal.impl.types.q1 r1 = r2.a
            r1.c(r4)
            goto L21
        L3d:
            return
    }

    private final void b(kotlin.reflect.jvm.internal.impl.types.t0 r8, kotlin.reflect.jvm.internal.impl.types.t0 r9) {
            r7 = this;
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = kotlin.reflect.jvm.internal.impl.types.h2.f(r9)
            java.lang.String r1 = "create(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.List r9 = r9.G0()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r1 = 0
        L14:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r9.next()
            int r3 = r1 + 1
            if (r1 >= 0) goto L25
            kotlin.collections.f0.b0()
        L25:
            kotlin.reflect.jvm.internal.impl.types.c2 r2 = (kotlin.reflect.jvm.internal.impl.types.c2) r2
            boolean r4 = r2.b()
            if (r4 != 0) goto L6e
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r2.getType()
            java.lang.String r5 = "getType(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            boolean r4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.h(r4)
            if (r4 != 0) goto L6e
            java.util.List r4 = r8.G0()
            java.lang.Object r4 = r4.get(r1)
            kotlin.reflect.jvm.internal.impl.types.c2 r4 = (kotlin.reflect.jvm.internal.impl.types.c2) r4
            kotlin.reflect.jvm.internal.impl.types.w1 r6 = r8.I0()
            java.util.List r6 = r6.getParameters()
            java.lang.Object r1 = r6.get(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r1
            boolean r6 = r7.b
            if (r6 == 0) goto L6e
            kotlin.reflect.jvm.internal.impl.types.q1 r6 = r7.a
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.getType()
            kotlin.jvm.internal.g0.o(r4, r5)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getType()
            kotlin.jvm.internal.g0.o(r2, r5)
            kotlin.jvm.internal.g0.m(r1)
            r6.a(r0, r4, r2, r1)
        L6e:
            r1 = r3
            goto L14
        L70:
            return
    }

    private final kotlin.reflect.jvm.internal.impl.types.f0 c(kotlin.reflect.jvm.internal.impl.types.f0 r1, kotlin.reflect.jvm.internal.impl.types.t1 r2) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.t1 r2 = r0.h(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.f0 r1 = r1.V0(r2)
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.types.e1 d(kotlin.reflect.jvm.internal.impl.types.e1 r3, kotlin.reflect.jvm.internal.impl.types.t1 r4) {
            r2 = this;
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.x0.a(r3)
            if (r0 == 0) goto L7
            return r3
        L7:
            kotlin.reflect.jvm.internal.impl.types.t1 r4 = r2.h(r3, r4)
            r0 = 1
            r1 = 0
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = kotlin.reflect.jvm.internal.impl.types.g2.f(r3, r1, r4, r0, r1)
            return r3
    }

    private final kotlin.reflect.jvm.internal.impl.types.e1 e(kotlin.reflect.jvm.internal.impl.types.e1 r1, kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r0 = this;
            boolean r2 = r2.J0()
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = kotlin.reflect.jvm.internal.impl.types.j2.r(r1, r2)
            java.lang.String r2 = "makeNullableIfNeeded(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.types.e1 f(kotlin.reflect.jvm.internal.impl.types.e1 r1, kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.e(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.t1 r2 = r2.H0()
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.d(r1, r2)
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.types.e1 g(kotlin.reflect.jvm.internal.impl.types.p1 r3, kotlin.reflect.jvm.internal.impl.types.t1 r4, boolean r5) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = r3.b()
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.o()
            java.lang.String r1 = "getTypeConstructor(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.List r3 = r3.a()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k$c r1 = kotlin.reflect.jvm.internal.impl.resolve.scopes.k.c.b
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = kotlin.reflect.jvm.internal.impl.types.w0.o(r4, r0, r3, r5, r1)
            return r3
    }

    private final kotlin.reflect.jvm.internal.impl.types.t1 h(kotlin.reflect.jvm.internal.impl.types.t0 r2, kotlin.reflect.jvm.internal.impl.types.t1 r3) {
            r1 = this;
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.x0.a(r2)
            if (r0 == 0) goto Lb
            kotlin.reflect.jvm.internal.impl.types.t1 r2 = r2.H0()
            return r2
        Lb:
            kotlin.reflect.jvm.internal.impl.types.t1 r2 = r2.H0()
            kotlin.reflect.jvm.internal.impl.types.t1 r2 = r3.m(r2)
            return r2
    }

    private final kotlin.reflect.jvm.internal.impl.types.c2 j(kotlin.reflect.jvm.internal.impl.types.c2 r12, kotlin.reflect.jvm.internal.impl.types.p1 r13, int r14) {
            r11 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r12.getType()
            kotlin.reflect.jvm.internal.impl.types.m2 r0 = r0.L0()
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.g0.a(r0)
            if (r1 == 0) goto L11
        Le:
            r5 = r11
            goto Le7
        L11:
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.types.g2.a(r0)
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.x0.a(r0)
            if (r1 != 0) goto Le
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.F(r0)
            if (r1 != 0) goto L22
            goto Le
        L22:
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r0.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r1.c()
            java.util.List r3 = r1.getParameters()
            r3.size()
            java.util.List r3 = r0.G0()
            r3.size()
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            if (r3 == 0) goto L3d
            goto Le
        L3d:
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i1
            if (r3 == 0) goto Ld5
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.i1) r2
            boolean r3 = r13.d(r2)
            if (r3 == 0) goto L68
            kotlin.reflect.jvm.internal.impl.types.q1 r12 = r11.a
            r12.b(r2)
            kotlin.reflect.jvm.internal.impl.types.e2 r12 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.Variance r13 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r14 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.RECURSIVE_TYPE_ALIAS
            kotlin.reflect.jvm.internal.impl.name.f r0 = r2.getName()
            java.lang.String r0 = r0.toString()
            java.lang.String[] r0 = new java.lang.String[]{r0}
            kotlin.reflect.jvm.internal.impl.types.error.g r14 = kotlin.reflect.jvm.internal.impl.types.error.i.d(r14, r0)
            r12.<init>(r13, r14)
            return r12
        L68:
            java.util.List r3 = r0.G0()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.f0.d0(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
            r5 = 0
        L7e:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto La6
            java.lang.Object r6 = r3.next()
            int r7 = r5 + 1
            if (r5 >= 0) goto L8f
            kotlin.collections.f0.b0()
        L8f:
            kotlin.reflect.jvm.internal.impl.types.c2 r6 = (kotlin.reflect.jvm.internal.impl.types.c2) r6
            java.util.List r8 = r1.getParameters()
            java.lang.Object r5 = r8.get(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r5
            int r8 = r14 + 1
            kotlin.reflect.jvm.internal.impl.types.c2 r5 = r11.l(r6, r13, r5, r8)
            r4.add(r5)
            r5 = r7
            goto L7e
        La6:
            kotlin.reflect.jvm.internal.impl.types.p1$a r1 = kotlin.reflect.jvm.internal.impl.types.p1.e
            kotlin.reflect.jvm.internal.impl.types.p1 r6 = r1.a(r13, r2, r4)
            kotlin.reflect.jvm.internal.impl.types.t1 r7 = r0.H0()
            boolean r8 = r0.J0()
            int r9 = r14 + 1
            r10 = 0
            r5 = r11
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r5.k(r6, r7, r8, r9, r10)
            kotlin.reflect.jvm.internal.impl.types.e1 r13 = r11.m(r0, r13, r14)
            boolean r14 = kotlin.reflect.jvm.internal.impl.types.g0.a(r1)
            if (r14 == 0) goto Lc7
            goto Lcb
        Lc7:
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = kotlin.reflect.jvm.internal.impl.types.i1.j(r1, r13)
        Lcb:
            kotlin.reflect.jvm.internal.impl.types.e2 r13 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.Variance r12 = r12.c()
            r13.<init>(r12, r1)
            return r13
        Ld5:
            r5 = r11
            kotlin.reflect.jvm.internal.impl.types.e1 r13 = r11.m(r0, r13, r14)
            r11.b(r0, r13)
            kotlin.reflect.jvm.internal.impl.types.e2 r14 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.Variance r12 = r12.c()
            r14.<init>(r12, r13)
            return r14
        Le7:
            return r12
    }

    private final kotlin.reflect.jvm.internal.impl.types.e1 k(kotlin.reflect.jvm.internal.impl.types.p1 r4, kotlin.reflect.jvm.internal.impl.types.t1 r5, boolean r6, int r7, boolean r8) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.types.e2 r0 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r2 = r4.b()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.y0()
            r0.<init>(r1, r2)
            r1 = 0
            kotlin.reflect.jvm.internal.impl.types.c2 r7 = r3.l(r0, r4, r1, r7)
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r7.getType()
            java.lang.String r1 = "getType(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.types.g2.a(r0)
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.x0.a(r0)
            if (r1 == 0) goto L28
            return r0
        L28:
            r7.c()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r7 = r0.getAnnotations()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = kotlin.reflect.jvm.internal.impl.types.u.a(r5)
            r3.a(r7, r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r7 = r3.d(r0, r5)
            kotlin.reflect.jvm.internal.impl.types.e1 r7 = kotlin.reflect.jvm.internal.impl.types.j2.r(r7, r6)
            java.lang.String r0 = "let(...)"
            kotlin.jvm.internal.g0.o(r7, r0)
            if (r8 == 0) goto L4e
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r3.g(r4, r5, r6)
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = kotlin.reflect.jvm.internal.impl.types.i1.j(r7, r4)
            return r4
        L4e:
            return r7
    }

    private final kotlin.reflect.jvm.internal.impl.types.c2 l(kotlin.reflect.jvm.internal.impl.types.c2 r4, kotlin.reflect.jvm.internal.impl.types.p1 r5, kotlin.reflect.jvm.internal.impl.descriptors.j1 r6, int r7) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.types.o1$a r0 = kotlin.reflect.jvm.internal.impl.types.o1.c
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r1 = r5.b()
            kotlin.reflect.jvm.internal.impl.types.o1.a.a(r0, r7, r1)
            boolean r0 = r4.b()
            java.lang.String r1 = "makeStarProjection(...)"
            if (r0 == 0) goto L1c
            kotlin.jvm.internal.g0.m(r6)
            kotlin.reflect.jvm.internal.impl.types.c2 r4 = kotlin.reflect.jvm.internal.impl.types.j2.s(r6)
            kotlin.jvm.internal.g0.o(r4, r1)
            return r4
        L1c:
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r4.getType()
            java.lang.String r2 = "getType(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r0.I0()
            kotlin.reflect.jvm.internal.impl.types.c2 r2 = r5.c(r2)
            if (r2 != 0) goto L34
            kotlin.reflect.jvm.internal.impl.types.c2 r4 = r3.j(r4, r5, r7)
            return r4
        L34:
            boolean r7 = r2.b()
            if (r7 == 0) goto L45
            kotlin.jvm.internal.g0.m(r6)
            kotlin.reflect.jvm.internal.impl.types.c2 r4 = kotlin.reflect.jvm.internal.impl.types.j2.s(r6)
            kotlin.jvm.internal.g0.o(r4, r1)
            return r4
        L45:
            kotlin.reflect.jvm.internal.impl.types.t0 r7 = r2.getType()
            kotlin.reflect.jvm.internal.impl.types.m2 r7 = r7.L0()
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = r2.c()
            java.lang.String r2 = "getProjectionKind(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = r4.c()
            kotlin.jvm.internal.g0.o(r4, r2)
            if (r4 != r1) goto L60
            goto L72
        L60:
            kotlin.reflect.jvm.internal.impl.types.Variance r2 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r4 != r2) goto L65
            goto L72
        L65:
            if (r1 != r2) goto L69
            r1 = r4
            goto L72
        L69:
            kotlin.reflect.jvm.internal.impl.types.q1 r4 = r3.a
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r2 = r5.b()
            r4.d(r2, r6, r7)
        L72:
            if (r6 == 0) goto L7a
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = r6.l()
            if (r4 != 0) goto L7c
        L7a:
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
        L7c:
            if (r4 != r1) goto L7f
            goto L91
        L7f:
            kotlin.reflect.jvm.internal.impl.types.Variance r2 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r4 != r2) goto L84
            goto L91
        L84:
            if (r1 != r2) goto L88
            r1 = r2
            goto L91
        L88:
            kotlin.reflect.jvm.internal.impl.types.q1 r4 = r3.a
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r5 = r5.b()
            r4.d(r5, r6, r7)
        L91:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r0.getAnnotations()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r5 = r7.getAnnotations()
            r3.a(r4, r5)
            boolean r4 = r7 instanceof kotlin.reflect.jvm.internal.impl.types.f0
            if (r4 == 0) goto Lab
            kotlin.reflect.jvm.internal.impl.types.f0 r7 = (kotlin.reflect.jvm.internal.impl.types.f0) r7
            kotlin.reflect.jvm.internal.impl.types.t1 r4 = r0.H0()
            kotlin.reflect.jvm.internal.impl.types.f0 r4 = r3.c(r7, r4)
            goto Lb3
        Lab:
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = kotlin.reflect.jvm.internal.impl.types.g2.a(r7)
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r3.f(r4, r0)
        Lb3:
            kotlin.reflect.jvm.internal.impl.types.e2 r5 = new kotlin.reflect.jvm.internal.impl.types.e2
            r5.<init>(r1, r4)
            return r5
    }

    private final kotlin.reflect.jvm.internal.impl.types.e1 m(kotlin.reflect.jvm.internal.impl.types.e1 r9, kotlin.reflect.jvm.internal.impl.types.p1 r10, int r11) {
            r8 = this;
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r9.I0()
            java.util.List r1 = r9.G0()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.f0.d0(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
        L1a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L63
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            if (r3 >= 0) goto L2b
            kotlin.collections.f0.b0()
        L2b:
            kotlin.reflect.jvm.internal.impl.types.c2 r4 = (kotlin.reflect.jvm.internal.impl.types.c2) r4
            java.util.List r6 = r0.getParameters()
            java.lang.Object r3 = r6.get(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r3
            int r6 = r11 + 1
            kotlin.reflect.jvm.internal.impl.types.c2 r3 = r8.l(r4, r10, r3, r6)
            boolean r6 = r3.b()
            if (r6 == 0) goto L44
            goto L5e
        L44:
            kotlin.reflect.jvm.internal.impl.types.e2 r6 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.Variance r7 = r3.c()
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r3.getType()
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.getType()
            boolean r4 = r4.J0()
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = kotlin.reflect.jvm.internal.impl.types.j2.q(r3, r4)
            r6.<init>(r7, r3)
            r3 = r6
        L5e:
            r2.add(r3)
            r3 = r5
            goto L1a
        L63:
            r10 = 2
            r11 = 0
            kotlin.reflect.jvm.internal.impl.types.e1 r9 = kotlin.reflect.jvm.internal.impl.types.g2.f(r9, r2, r11, r10, r11)
            return r9
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.e1 i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.p1 r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r9) {
            r7 = this;
            java.lang.String r0 = "typeAliasExpansion"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.g0.p(r9, r0)
            r5 = 0
            r6 = 1
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            kotlin.reflect.jvm.internal.impl.types.e1 r8 = r1.k(r2, r3, r4, r5, r6)
            return r8
    }
}
