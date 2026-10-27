package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractTypeChecker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 TypeSystemContext.kt\norg/jetbrains/kotlin/types/model/TypeSystemContextKt\n*L\n1#1,884:1\n1#2:885\n1#2:899\n1#2:951\n1#2:986\n140#3,13:886\n153#3,13:900\n54#3,8:924\n140#3,13:938\n153#3,13:952\n140#3,13:973\n153#3,13:987\n1634#4,3:913\n1563#4:916\n1634#4,3:917\n1563#4:920\n1634#4,3:921\n1740#4,3:932\n1740#4,3:935\n774#4:965\n865#4:966\n866#4:972\n1374#4:1000\n1460#4,5:1001\n1761#4,3:1006\n1761#4,3:1009\n635#5,5:967\n*S KotlinDebug\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractTypeChecker\n*L\n383#1:899\n671#1:951\n741#1:986\n383#1:886,13\n383#1:900,13\n527#1:924,8\n671#1:938,13\n671#1:952,13\n741#1:973,13\n741#1:987,13\n426#1:913,3\n429#1:916\n429#1:917,3\n442#1:920\n442#1:921,3\n609#1:932,3\n620#1:935,3\n716#1:965\n716#1:966\n716#1:972\n750#1:1000\n750#1:1001,5\n336#1:1006,3\n344#1:1009,3\n717#1:967,5\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.h a = null;

    @kotlin.jvm.JvmField
    public static boolean b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;
        public static final /* synthetic */ int[] b = null;

        static {
                kotlin.reflect.jvm.internal.impl.types.model.TypeVariance[] r0 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r2 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV     // Catch: java.lang.NoSuchFieldError -> L10
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                r2 = 2
                kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r3 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.OUT     // Catch: java.lang.NoSuchFieldError -> L19
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r0[r3] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                r3 = 3
                kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r4 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.IN     // Catch: java.lang.NoSuchFieldError -> L22
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r0[r4] = r3     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.reflect.jvm.internal.impl.types.h.a.a = r0
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy[] r0 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy r4 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.CHECK_ONLY_LOWER     // Catch: java.lang.NoSuchFieldError -> L33
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r0[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy r1 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER     // Catch: java.lang.NoSuchFieldError -> L3b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3b
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3b
            L3b:
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy r1 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.SKIP_LOWER     // Catch: java.lang.NoSuchFieldError -> L43
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                kotlin.reflect.jvm.internal.impl.types.h.a.b = r0
                return
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.types.h r0 = new kotlin.reflect.jvm.internal.impl.types.h
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.types.h.a = r0
            return
    }

    private h() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.util.List<d4.h> A(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r8, java.util.List<? extends d4.h> r9) {
            r7 = this;
            d4.r r8 = r8.j()
            int r0 = r9.size()
            r1 = 2
            if (r0 >= r1) goto Lc
            goto L50
        Lc:
            r0 = r9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r0.next()
            r3 = r2
            d4.h r3 = (d4.h) r3
            d4.k r3 = r8.l(r3)
            int r4 = r8.g0(r3)
            r5 = 0
        L2e:
            if (r5 >= r4) goto L45
            d4.l r6 = r8.t0(r3, r5)
            d4.g r6 = r8.getType(r6)
            if (r6 == 0) goto L3f
            d4.e r6 = r8.X(r6)
            goto L40
        L3f:
            r6 = 0
        L40:
            if (r6 != 0) goto L18
            int r5 = r5 + 1
            goto L2e
        L45:
            r1.add(r2)
            goto L18
        L49:
            boolean r8 = r1.isEmpty()
            if (r8 != 0) goto L50
            return r1
        L50:
            return r9
    }

    static /* synthetic */ kotlin.n1 a(java.util.Collection r0, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r1, d4.r r2, d4.h r3, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.a r4) {
            kotlin.n1 r0 = x(r0, r1, r2, r3, r4)
            return r0
    }

    static /* synthetic */ boolean b(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r0, d4.r r1, d4.h r2, d4.h r3) {
            boolean r0 = y(r0, r1, r2, r3)
            return r0
    }

    private final java.lang.Boolean c(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r4, d4.h r5, d4.h r6) {
            r3 = this;
            d4.r r0 = r4.j()
            boolean r1 = r0.r0(r5)
            r2 = 0
            if (r1 != 0) goto L12
            boolean r1 = r0.r0(r6)
            if (r1 != 0) goto L12
            return r2
        L12:
            boolean r1 = f(r0, r5)
            if (r1 == 0) goto L21
            boolean r1 = f(r0, r6)
            if (r1 == 0) goto L21
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L21:
            boolean r1 = r0.r0(r5)
            if (r1 == 0) goto L31
            r1 = 0
            boolean r4 = g(r0, r4, r5, r6, r1)
            if (r4 == 0) goto L47
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L31:
            boolean r1 = r0.r0(r6)
            if (r1 == 0) goto L47
            boolean r1 = e(r0, r5)
            if (r1 != 0) goto L44
            r1 = 1
            boolean r4 = g(r0, r4, r6, r5, r1)
            if (r4 == 0) goto L47
        L44:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L47:
            return r2
    }

    private static final boolean d(d4.r r2, d4.h r3) {
            boolean r0 = r3 instanceof d4.b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            d4.b r3 = (d4.b) r3
            d4.a r3 = r2.H(r3)
            d4.l r3 = r2.y0(r3)
            d4.g r3 = r2.getType(r3)
            if (r3 == 0) goto L24
            d4.h r3 = r2.B0(r3)
            if (r3 == 0) goto L24
            boolean r2 = r2.r0(r3)
            r3 = 1
            if (r2 != r3) goto L24
            return r3
        L24:
            return r1
    }

    private static final boolean e(d4.r r2, d4.h r3) {
            d4.o r3 = r2.g(r3)
            boolean r0 = r3 instanceof d4.f
            if (r0 == 0) goto L3a
            java.util.Collection r3 = r2.k0(r3)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L1c
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1c
            goto L3a
        L1c:
            java.util.Iterator r3 = r3.iterator()
        L20:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r3.next()
            d4.g r0 = (d4.g) r0
            d4.h r0 = r2.a(r0)
            if (r0 == 0) goto L20
            boolean r0 = r2.r0(r0)
            r1 = 1
            if (r0 != r1) goto L20
            return r1
        L3a:
            r2 = 0
            return r2
    }

    private static final boolean f(d4.r r1, d4.h r2) {
            boolean r0 = r1.r0(r2)
            if (r0 != 0) goto Lf
            boolean r1 = d(r1, r2)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    private static final boolean g(d4.r r9, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r10, d4.h r11, d4.h r12, boolean r13) {
            java.util.Collection r11 = r9.w0(r11)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            boolean r0 = r11 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L15
            r0 = r11
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L15
            return r1
        L15:
            java.util.Iterator r11 = r11.iterator()
        L19:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r11.next()
            r5 = r0
            d4.g r5 = (d4.g) r5
            d4.o r0 = r9.W(r5)
            d4.o r2 = r9.g(r12)
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 != 0) goto L4a
            if (r13 == 0) goto L45
            kotlin.reflect.jvm.internal.impl.types.h r2 = kotlin.reflect.jvm.internal.impl.types.h.a
            r7 = 8
            r8 = 0
            r6 = 0
            r3 = r10
            r4 = r12
            boolean r10 = v(r2, r3, r4, r5, r6, r7, r8)
            if (r10 == 0) goto L47
            goto L4a
        L45:
            r3 = r10
            r4 = r12
        L47:
            r10 = r3
            r12 = r4
            goto L19
        L4a:
            r9 = 1
            return r9
        L4c:
            return r1
    }

    private final java.lang.Boolean h(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r13, d4.h r14, d4.h r15) {
            r12 = this;
            d4.r r8 = r13.j()
            boolean r0 = r8.Z(r14)
            r9 = 0
            if (r0 != 0) goto L147
            boolean r0 = r8.Z(r15)
            if (r0 == 0) goto L13
            goto L147
        L13:
            boolean r0 = r8.d0(r14)
            r10 = 1
            if (r0 == 0) goto L34
            boolean r0 = r8.d0(r15)
            if (r0 == 0) goto L34
            kotlin.reflect.jvm.internal.impl.types.h r0 = kotlin.reflect.jvm.internal.impl.types.h.a
            boolean r0 = r0.r(r8, r14, r15)
            if (r0 != 0) goto L2e
            boolean r0 = r13.o()
            if (r0 == 0) goto L2f
        L2e:
            r9 = 1
        L2f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            return r0
        L34:
            boolean r0 = r8.p0(r14)
            if (r0 != 0) goto L13e
            boolean r0 = r8.p0(r15)
            if (r0 == 0) goto L42
            goto L13e
        L42:
            d4.b r0 = r8.D0(r15)
            r11 = 0
            if (r0 == 0) goto L4e
            d4.g r1 = r8.f0(r0)
            goto L4f
        L4e:
            r1 = r11
        L4f:
            if (r0 == 0) goto La7
            if (r1 == 0) goto La7
            boolean r3 = r8.c0(r15)
            if (r3 == 0) goto L5f
            d4.g r1 = r8.q0(r1, r10)
        L5d:
            r3 = r1
            goto L6a
        L5f:
            boolean r3 = r8.a0(r15)
            if (r3 == 0) goto L5d
            d4.g r1 = r8.z0(r1)
            goto L5d
        L6a:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy r0 = r13.g(r14, r0)
            int[] r4 = kotlin.reflect.jvm.internal.impl.types.h.a.b
            int r0 = r0.ordinal()
            r0 = r4[r0]
            if (r0 == r10) goto L96
            r4 = 2
            if (r0 == r4) goto L85
            r3 = 3
            if (r0 != r3) goto L7f
            goto La7
        L7f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L85:
            kotlin.reflect.jvm.internal.impl.types.h r0 = kotlin.reflect.jvm.internal.impl.types.h.a
            r5 = 8
            r6 = 0
            r4 = 0
            r1 = r13
            r2 = r14
            boolean r0 = v(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto La7
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L96:
            kotlin.reflect.jvm.internal.impl.types.h r0 = kotlin.reflect.jvm.internal.impl.types.h.a
            r5 = 8
            r6 = 0
            r4 = 0
            r1 = r13
            r2 = r14
            boolean r0 = v(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        La7:
            d4.o r0 = r8.g(r15)
            boolean r1 = r8.P(r0)
            if (r1 == 0) goto Led
            r8.c0(r15)
            java.util.Collection r0 = r8.k0(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto Lc9
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Lc9
        Lc7:
            r9 = 1
            goto Le8
        Lc9:
            java.util.Iterator r7 = r0.iterator()
        Lcd:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lc7
            java.lang.Object r0 = r7.next()
            r3 = r0
            d4.g r3 = (d4.g) r3
            kotlin.reflect.jvm.internal.impl.types.h r0 = kotlin.reflect.jvm.internal.impl.types.h.a
            r5 = 8
            r6 = 0
            r4 = 0
            r1 = r13
            r2 = r14
            boolean r0 = v(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto Lcd
        Le8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            return r0
        Led:
            d4.o r0 = r8.g(r14)
            boolean r1 = r14 instanceof d4.b
            if (r1 != 0) goto L124
            boolean r1 = r8.P(r0)
            if (r1 == 0) goto L13d
            java.util.Collection r0 = r8.k0(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L10f
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L10f
            goto L124
        L10f:
            java.util.Iterator r0 = r0.iterator()
        L113:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L124
            java.lang.Object r1 = r0.next()
            d4.g r1 = (d4.g) r1
            boolean r1 = r1 instanceof d4.b
            if (r1 != 0) goto L113
            goto L13d
        L124:
            kotlin.reflect.jvm.internal.impl.types.h r0 = kotlin.reflect.jvm.internal.impl.types.h.a
            d4.r r1 = r13.j()
            d4.p r0 = r0.o(r1, r15, r14)
            if (r0 == 0) goto L13d
            d4.o r1 = r8.g(r15)
            boolean r0 = r8.k(r0, r1)
            if (r0 == 0) goto L13d
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L13d:
            return r11
        L13e:
            boolean r0 = r13.o()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L147:
            boolean r0 = r13.n()
            if (r0 == 0) goto L150
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L150:
            boolean r0 = r8.c0(r14)
            if (r0 == 0) goto L15f
            boolean r0 = r8.c0(r15)
            if (r0 != 0) goto L15f
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L15f:
            kotlin.reflect.jvm.internal.impl.types.d r0 = kotlin.reflect.jvm.internal.impl.types.d.a
            d4.h r1 = r8.c(r14, r9)
            d4.h r2 = r8.c(r15, r9)
            boolean r0 = r0.b(r8, r1, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    private final java.util.List<d4.h> i(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r7, d4.h r8, d4.o r9) {
            r6 = this;
            d4.r r0 = r7.j()
            java.util.List r1 = r0.w(r8, r9)
            if (r1 == 0) goto Lb
            return r1
        Lb:
            boolean r1 = r0.V(r9)
            if (r1 != 0) goto L1c
            boolean r1 = r0.Y(r8)
            if (r1 == 0) goto L1c
            java.util.List r7 = kotlin.collections.f0.J()
            return r7
        L1c:
            boolean r1 = r0.H0(r9)
            if (r1 == 0) goto L40
            d4.o r7 = r0.g(r8)
            boolean r7 = r0.J(r7, r9)
            if (r7 == 0) goto L3b
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r7 = kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FOR_SUBTYPING
            d4.h r7 = r0.R(r8, r7)
            if (r7 != 0) goto L35
            goto L36
        L35:
            r8 = r7
        L36:
            java.util.List r7 = kotlin.collections.f0.l(r8)
            return r7
        L3b:
            java.util.List r7 = kotlin.collections.f0.J()
            return r7
        L40:
            kotlin.reflect.jvm.internal.impl.utils.j r1 = new kotlin.reflect.jvm.internal.impl.utils.j
            r1.<init>()
            r7.k()
            java.util.ArrayDeque r2 = r7.h()
            kotlin.jvm.internal.g0.m(r2)
            java.util.Set r3 = r7.i()
            kotlin.jvm.internal.g0.m(r3)
            r2.push(r8)
        L59:
            boolean r8 = r2.isEmpty()
            if (r8 != 0) goto Lc9
            java.lang.Object r8 = r2.pop()
            d4.h r8 = (d4.h) r8
            kotlin.jvm.internal.g0.m(r8)
            boolean r4 = r3.add(r8)
            if (r4 == 0) goto L59
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r4 = kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FOR_SUBTYPING
            d4.h r4 = r0.R(r8, r4)
            if (r4 != 0) goto L77
            r4 = r8
        L77:
            d4.o r5 = r0.g(r4)
            boolean r5 = r0.J(r5, r9)
            if (r5 == 0) goto L87
            r1.add(r4)
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$c r4 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.c.a
            goto L98
        L87:
            int r5 = r0.m0(r4)
            if (r5 != 0) goto L90
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$b r4 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.C0073b.a
            goto L98
        L90:
            d4.r r5 = r7.j()
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b r4 = r5.z(r4)
        L98:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$c r5 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.c.a
            boolean r5 = kotlin.jvm.internal.g0.g(r4, r5)
            if (r5 != 0) goto La1
            goto La2
        La1:
            r4 = 0
        La2:
            if (r4 != 0) goto La5
            goto L59
        La5:
            d4.r r5 = r7.j()
            d4.o r8 = r5.g(r8)
            java.util.Collection r8 = r5.k0(r8)
            java.util.Iterator r8 = r8.iterator()
        Lb5:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r8.next()
            d4.g r5 = (d4.g) r5
            d4.h r5 = r4.a(r7, r5)
            r2.add(r5)
            goto Lb5
        Lc9:
            r7.e()
            return r1
    }

    private final java.util.List<d4.h> j(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r1, d4.h r2, d4.o r3) {
            r0 = this;
            java.util.List r2 = r0.i(r1, r2, r3)
            java.util.List r1 = r0.A(r1, r2)
            return r1
    }

    private final boolean k(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r5, d4.g r6, d4.g r7, boolean r8) {
            r4 = this;
            d4.r r0 = r5.j()
            d4.g r6 = r5.q(r6)
            d4.g r6 = r5.p(r6)
            d4.g r7 = r5.q(r7)
            d4.g r7 = r5.p(r7)
            boolean r1 = r5.m()
            if (r1 == 0) goto L43
            boolean r1 = r0.y(r6)
            if (r1 == 0) goto L43
            boolean r1 = r0.S(r7)
            if (r1 == 0) goto L43
            kotlin.reflect.jvm.internal.impl.types.h r1 = kotlin.reflect.jvm.internal.impl.types.h.a
            d4.e r6 = r0.X(r6)
            kotlin.jvm.internal.g0.m(r6)
            d4.h r6 = r0.f(r6)
            d4.h r7 = r0.a(r7)
            kotlin.jvm.internal.g0.m(r7)
            d4.i r7 = r0.u0(r7)
            boolean r5 = r1.k(r5, r6, r7, r8)
            return r5
        L43:
            kotlin.reflect.jvm.internal.impl.types.h r1 = kotlin.reflect.jvm.internal.impl.types.h.a
            d4.h r2 = r0.I(r6)
            d4.h r3 = r0.B0(r7)
            java.lang.Boolean r2 = r1.h(r5, r2, r3)
            if (r2 == 0) goto L5b
            boolean r0 = r2.booleanValue()
            r5.c(r6, r7, r8)
            return r0
        L5b:
            java.lang.Boolean r8 = r5.c(r6, r7, r8)
            if (r8 == 0) goto L66
            boolean r5 = r8.booleanValue()
            return r5
        L66:
            d4.h r6 = r0.I(r6)
            d4.h r7 = r0.B0(r7)
            boolean r5 = r1.w(r5, r6, r7)
            return r5
    }

    private final d4.p o(d4.r r7, d4.g r8, d4.g r9) {
            r6 = this;
            int r0 = r7.m0(r8)
            r1 = 0
            r2 = 0
        L6:
            r3 = 0
            if (r2 >= r0) goto L5e
            d4.l r4 = r7.I0(r8, r2)
            boolean r5 = r7.e(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L5b
            d4.g r3 = r7.getType(r3)
            if (r3 != 0) goto L1d
            goto L5b
        L1d:
            d4.h r4 = r7.I(r3)
            boolean r4 = r7.x0(r4)
            if (r4 == 0) goto L33
            d4.h r4 = r7.I(r9)
            boolean r4 = r7.x0(r4)
            if (r4 == 0) goto L33
            r4 = 1
            goto L34
        L33:
            r4 = 0
        L34:
            boolean r5 = kotlin.jvm.internal.g0.g(r3, r9)
            if (r5 != 0) goto L52
            if (r4 == 0) goto L4b
            d4.o r4 = r7.W(r3)
            d4.o r5 = r7.W(r9)
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r5)
            if (r4 == 0) goto L4b
            goto L52
        L4b:
            d4.p r3 = r6.o(r7, r3, r9)
            if (r3 == 0) goto L5b
            return r3
        L52:
            d4.o r8 = r7.W(r8)
            d4.p r7 = r7.h0(r8, r2)
            return r7
        L5b:
            int r2 = r2 + 1
            goto L6
        L5e:
            return r3
    }

    private final boolean p(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r8, d4.h r9) {
            r7 = this;
            d4.r r0 = r8.j()
            d4.o r1 = r0.g(r9)
            boolean r2 = r0.V(r1)
            if (r2 == 0) goto L13
            boolean r8 = r0.O(r1)
            return r8
        L13:
            d4.o r1 = r0.g(r9)
            boolean r1 = r0.O(r1)
            r2 = 1
            if (r1 == 0) goto L1f
            return r2
        L1f:
            r8.k()
            java.util.ArrayDeque r1 = r8.h()
            kotlin.jvm.internal.g0.m(r1)
            java.util.Set r3 = r8.i()
            kotlin.jvm.internal.g0.m(r3)
            r1.push(r9)
        L33:
            boolean r9 = r1.isEmpty()
            if (r9 != 0) goto L92
            java.lang.Object r9 = r1.pop()
            d4.h r9 = (d4.h) r9
            kotlin.jvm.internal.g0.m(r9)
            boolean r4 = r3.add(r9)
            if (r4 == 0) goto L33
            boolean r4 = r0.Y(r9)
            if (r4 == 0) goto L51
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$c r4 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.c.a
            goto L53
        L51:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$b r4 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.C0073b.a
        L53:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$c r5 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.c.a
            boolean r5 = kotlin.jvm.internal.g0.g(r4, r5)
            if (r5 != 0) goto L5c
            goto L5d
        L5c:
            r4 = 0
        L5d:
            if (r4 != 0) goto L60
            goto L33
        L60:
            d4.r r5 = r8.j()
            d4.o r9 = r5.g(r9)
            java.util.Collection r9 = r5.k0(r9)
            java.util.Iterator r9 = r9.iterator()
        L70:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L33
            java.lang.Object r5 = r9.next()
            d4.g r5 = (d4.g) r5
            d4.h r5 = r4.a(r8, r5)
            d4.o r6 = r0.g(r5)
            boolean r6 = r0.O(r6)
            if (r6 == 0) goto L8e
            r8.e()
            return r2
        L8e:
            r1.add(r5)
            goto L70
        L92:
            r8.e()
            r8 = 0
            return r8
    }

    private final boolean q(d4.r r2, d4.g r3) {
            r1 = this;
            d4.o r0 = r2.W(r3)
            boolean r0 = r2.o0(r0)
            if (r0 == 0) goto L24
            boolean r0 = r2.s(r3)
            if (r0 != 0) goto L24
            boolean r0 = r2.S(r3)
            if (r0 != 0) goto L24
            boolean r0 = r2.F(r3)
            if (r0 != 0) goto L24
            boolean r2 = r2.F0(r3)
            if (r2 != 0) goto L24
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    private final boolean r(d4.r r4, d4.h r5, d4.h r6) {
            r3 = this;
            d4.o r0 = r4.g(r5)
            d4.o r1 = r4.g(r6)
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            boolean r0 = r4.a0(r5)
            if (r0 != 0) goto L19
            boolean r0 = r4.a0(r6)
            if (r0 == 0) goto L19
            return r2
        L19:
            boolean r5 = r4.c0(r5)
            if (r5 == 0) goto L26
            boolean r4 = r4.c0(r6)
            if (r4 != 0) goto L26
            return r2
        L26:
            r4 = 1
            return r4
    }

    public static /* synthetic */ boolean v(kotlin.reflect.jvm.internal.impl.types.h r0, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r1, d4.g r2, d4.g r3, boolean r4, int r5, java.lang.Object r6) {
            r5 = r5 & 8
            if (r5 == 0) goto L5
            r4 = 0
        L5:
            boolean r0 = r0.u(r1, r2, r3, r4)
            return r0
    }

    private final boolean w(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r18, d4.h r19, d4.h r20) {
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            d4.r r3 = r0.j()
            boolean r4 = kotlin.reflect.jvm.internal.impl.types.h.b
            if (r4 == 0) goto L2c
            boolean r4 = r3.h(r1)
            if (r4 != 0) goto L22
            d4.o r4 = r3.g(r1)
            boolean r4 = r3.P(r4)
            if (r4 != 0) goto L22
            boolean r4 = r18.l(r19)
        L22:
            boolean r4 = r3.h(r2)
            if (r4 != 0) goto L2c
            boolean r4 = r0.l(r2)
        L2c:
            kotlin.reflect.jvm.internal.impl.types.c r4 = kotlin.reflect.jvm.internal.impl.types.c.a
            boolean r4 = r4.d(r0, r1, r2)
            r5 = 0
            if (r4 != 0) goto L36
            return r5
        L36:
            kotlin.reflect.jvm.internal.impl.types.h r4 = kotlin.reflect.jvm.internal.impl.types.h.a
            java.lang.Boolean r6 = r4.c(r0, r1, r2)
            if (r6 == 0) goto L49
            boolean r6 = r6.booleanValue()
            r4 = 4
            r5 = 0
            r3 = 0
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.d(r0, r1, r2, r3, r4, r5)
            return r6
        L49:
            d4.o r6 = r3.g(r2)
            d4.o r7 = r3.g(r1)
            boolean r7 = r3.J(r7, r6)
            r8 = 1
            if (r7 == 0) goto L5f
            int r7 = r3.A0(r6)
            if (r7 != 0) goto L5f
            return r8
        L5f:
            d4.o r7 = r3.g(r2)
            boolean r7 = r3.j0(r7)
            if (r7 == 0) goto L6a
            return r8
        L6a:
            java.util.List r4 = r4.n(r0, r1, r6)
            int r7 = r4.size()
            r9 = 10
            if (r7 <= r8) goto Lb1
            d4.r r7 = r0.j()
            boolean r11 = r7 instanceof d4.t
            if (r11 == 0) goto L81
            d4.t r7 = (d4.t) r7
            goto L82
        L81:
            r7 = 0
        L82:
            if (r7 == 0) goto Lb1
            boolean r7 = r7.A()
            if (r7 != r8) goto Lb1
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            java.util.Iterator r4 = r4.iterator()
        L95:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto Ldc
            java.lang.Object r11 = r4.next()
            d4.h r11 = (d4.h) r11
            d4.g r12 = r0.p(r11)
            d4.h r12 = r3.a(r12)
            if (r12 != 0) goto Lac
            goto Lad
        Lac:
            r11 = r12
        Lad:
            r7.add(r11)
            goto L95
        Lb1:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r7 = new java.util.ArrayList
            int r11 = kotlin.collections.f0.d0(r4, r9)
            r7.<init>(r11)
            java.util.Iterator r4 = r4.iterator()
        Lc0:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto Ldc
            java.lang.Object r11 = r4.next()
            d4.h r11 = (d4.h) r11
            d4.g r12 = r0.p(r11)
            d4.h r12 = r3.a(r12)
            if (r12 != 0) goto Ld7
            goto Ld8
        Ld7:
            r11 = r12
        Ld8:
            r7.add(r11)
            goto Lc0
        Ldc:
            int r4 = r7.size()
            if (r4 == 0) goto L1b1
            if (r4 == r8) goto L1a0
            kotlin.reflect.jvm.internal.impl.types.model.ArgumentList r4 = new kotlin.reflect.jvm.internal.impl.types.model.ArgumentList
            int r11 = r3.A0(r6)
            r4.<init>(r11)
            int r11 = r3.A0(r6)
            r12 = 0
            r13 = 0
        Lf3:
            if (r12 >= r11) goto L189
            if (r13 != 0) goto L106
            d4.p r13 = r3.h0(r6, r12)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r13 = r3.M(r13)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r14 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.OUT
            if (r13 == r14) goto L104
            goto L106
        L104:
            r13 = 0
            goto L107
        L106:
            r13 = 1
        L107:
            if (r13 != 0) goto L17f
            java.util.ArrayList r14 = new java.util.ArrayList
            int r15 = kotlin.collections.f0.d0(r7, r9)
            r14.<init>(r15)
            java.util.Iterator r15 = r7.iterator()
        L116:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L171
            java.lang.Object r16 = r15.next()
            r5 = r16
            d4.h r5 = (d4.h) r5
            r16 = 1
            d4.l r8 = r3.q(r5, r12)
            if (r8 == 0) goto L146
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r9 = r3.G(r8)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r10 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV
            if (r9 != r10) goto L135
            goto L136
        L135:
            r8 = 0
        L136:
            if (r8 == 0) goto L146
            d4.g r8 = r3.getType(r8)
            if (r8 == 0) goto L146
            r14.add(r8)
            r5 = 0
            r8 = 1
            r9 = 10
            goto L116
        L146:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Incorrect type: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r4 = ", subType: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ", superType: "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L171:
            r16 = 1
            d4.g r5 = r3.x(r14)
            d4.l r5 = r3.r(r5)
            r4.add(r5)
            goto L181
        L17f:
            r16 = 1
        L181:
            int r12 = r12 + 1
            r5 = 0
            r8 = 1
            r9 = 10
            goto Lf3
        L189:
            r16 = 1
            if (r13 != 0) goto L196
            kotlin.reflect.jvm.internal.impl.types.h r1 = kotlin.reflect.jvm.internal.impl.types.h.a
            boolean r1 = r1.s(r0, r4, r2)
            if (r1 == 0) goto L196
            return r16
        L196:
            kotlin.reflect.jvm.internal.impl.types.f r1 = new kotlin.reflect.jvm.internal.impl.types.f
            r1.<init>(r7, r0, r3, r2)
            boolean r0 = r0.r(r1)
            return r0
        L1a0:
            kotlin.reflect.jvm.internal.impl.types.h r1 = kotlin.reflect.jvm.internal.impl.types.h.a
            java.lang.Object r4 = kotlin.collections.f0.E2(r7)
            d4.h r4 = (d4.h) r4
            d4.k r3 = r3.l(r4)
            boolean r0 = r1.s(r0, r3, r2)
            return r0
        L1b1:
            kotlin.reflect.jvm.internal.impl.types.h r2 = kotlin.reflect.jvm.internal.impl.types.h.a
            boolean r0 = r2.p(r0, r1)
            return r0
    }

    private static final kotlin.n1 x(java.util.Collection r2, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r3, d4.r r4, d4.h r5, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.a r6) {
            java.lang.String r0 = "$this$runForkingPoint"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r2.next()
            d4.h r0 = (d4.h) r0
            kotlin.reflect.jvm.internal.impl.types.g r1 = new kotlin.reflect.jvm.internal.impl.types.g
            r1.<init>(r3, r4, r0, r5)
            r6.a(r1)
            goto L9
        L1e:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    private static final boolean y(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r1, d4.r r2, d4.h r3, d4.h r4) {
            kotlin.reflect.jvm.internal.impl.types.h r0 = kotlin.reflect.jvm.internal.impl.types.h.a
            d4.k r2 = r2.l(r3)
            boolean r1 = r0.s(r1, r2, r4)
            return r1
    }

    private final boolean z(d4.r r3, d4.g r4, d4.g r5, d4.o r6) {
            r2 = this;
            d4.h r4 = r3.a(r4)
            boolean r0 = r4 instanceof d4.b
            r1 = 0
            if (r0 == 0) goto L46
            d4.b r4 = (d4.b) r4
            boolean r0 = r3.p(r4)
            if (r0 != 0) goto L46
            d4.a r0 = r3.H(r4)
            d4.l r0 = r3.y0(r0)
            boolean r0 = r3.e(r0)
            if (r0 != 0) goto L20
            goto L46
        L20:
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r4 = r3.v(r4)
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r0 = kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FOR_SUBTYPING
            if (r4 == r0) goto L29
            return r1
        L29:
            d4.o r4 = r3.W(r5)
            boolean r5 = r4 instanceof d4.w
            if (r5 == 0) goto L34
            d4.w r4 = (d4.w) r4
            goto L35
        L34:
            r4 = 0
        L35:
            if (r4 != 0) goto L38
            return r1
        L38:
            d4.p r4 = r3.n(r4)
            if (r4 == 0) goto L46
            boolean r3 = r3.k(r4, r6)
            r4 = 1
            if (r3 != r4) goto L46
            return r4
        L46:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.types.model.TypeVariance l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r3) {
            r1 = this;
            java.lang.String r0 = "declared"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "useSite"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r0 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV
            if (r2 != r0) goto Lf
            return r3
        Lf:
            if (r3 != r0) goto L12
            goto L14
        L12:
            if (r2 != r3) goto L15
        L14:
            return r2
        L15:
            r2 = 0
            return r2
    }

    public final boolean m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r12, @org.jetbrains.annotations.NotNull d4.g r13, @org.jetbrains.annotations.NotNull d4.g r14) {
            r11 = this;
            java.lang.String r0 = "state"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "a"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.g0.p(r14, r0)
            d4.r r0 = r12.j()
            r1 = 1
            if (r13 != r14) goto L17
            return r1
        L17:
            kotlin.reflect.jvm.internal.impl.types.h r2 = kotlin.reflect.jvm.internal.impl.types.h.a
            boolean r3 = r2.q(r0, r13)
            r9 = 0
            if (r3 == 0) goto L6d
            boolean r3 = r2.q(r0, r14)
            if (r3 == 0) goto L6d
            d4.g r3 = r12.q(r13)
            d4.g r3 = r12.p(r3)
            d4.g r4 = r12.q(r14)
            d4.g r4 = r12.p(r4)
            d4.h r5 = r0.I(r3)
            d4.o r6 = r0.W(r3)
            d4.o r7 = r0.W(r4)
            boolean r6 = r0.J(r6, r7)
            if (r6 != 0) goto L49
            return r9
        L49:
            int r6 = r0.m0(r5)
            if (r6 != 0) goto L6d
            boolean r12 = r0.l0(r3)
            if (r12 != 0) goto L6c
            boolean r12 = r0.l0(r4)
            if (r12 == 0) goto L5c
            goto L6c
        L5c:
            boolean r12 = r0.c0(r5)
            d4.h r13 = r0.I(r4)
            boolean r13 = r0.c0(r13)
            if (r12 != r13) goto L6b
            return r1
        L6b:
            return r9
        L6c:
            return r1
        L6d:
            r7 = 8
            r8 = 0
            r6 = 0
            r3 = r12
            r4 = r13
            r5 = r14
            boolean r12 = v(r2, r3, r4, r5, r6, r7, r8)
            if (r12 == 0) goto L88
            r7 = 8
            r8 = 0
            r6 = 0
            r10 = r5
            r5 = r4
            r4 = r10
            boolean r12 = v(r2, r3, r4, r5, r6, r7, r8)
            if (r12 == 0) goto L88
            return r1
        L88:
            return r9
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<d4.h> n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r7, @org.jetbrains.annotations.NotNull d4.h r8, @org.jetbrains.annotations.NotNull d4.o r9) {
            r6 = this;
            java.lang.String r0 = "state"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "subType"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "superConstructor"
            kotlin.jvm.internal.g0.p(r9, r0)
            d4.r r0 = r7.j()
            boolean r1 = r0.Y(r8)
            if (r1 == 0) goto L20
            kotlin.reflect.jvm.internal.impl.types.h r0 = kotlin.reflect.jvm.internal.impl.types.h.a
            java.util.List r7 = r0.j(r7, r8, r9)
            return r7
        L20:
            boolean r1 = r0.V(r9)
            if (r1 != 0) goto L33
            boolean r1 = r0.n0(r9)
            if (r1 != 0) goto L33
            kotlin.reflect.jvm.internal.impl.types.h r0 = kotlin.reflect.jvm.internal.impl.types.h.a
            java.util.List r7 = r0.i(r7, r8, r9)
            return r7
        L33:
            kotlin.reflect.jvm.internal.impl.utils.j r1 = new kotlin.reflect.jvm.internal.impl.utils.j
            r1.<init>()
            r7.k()
            java.util.ArrayDeque r2 = r7.h()
            kotlin.jvm.internal.g0.m(r2)
            java.util.Set r3 = r7.i()
            kotlin.jvm.internal.g0.m(r3)
            r2.push(r8)
        L4c:
            boolean r8 = r2.isEmpty()
            if (r8 != 0) goto La0
            java.lang.Object r8 = r2.pop()
            d4.h r8 = (d4.h) r8
            kotlin.jvm.internal.g0.m(r8)
            boolean r4 = r3.add(r8)
            if (r4 == 0) goto L4c
            boolean r4 = r0.Y(r8)
            if (r4 == 0) goto L6d
            r1.add(r8)
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$c r4 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.c.a
            goto L6f
        L6d:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$b r4 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.C0073b.a
        L6f:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$c r5 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.c.a
            boolean r5 = kotlin.jvm.internal.g0.g(r4, r5)
            if (r5 != 0) goto L78
            goto L79
        L78:
            r4 = 0
        L79:
            if (r4 != 0) goto L7c
            goto L4c
        L7c:
            d4.r r5 = r7.j()
            d4.o r8 = r5.g(r8)
            java.util.Collection r8 = r5.k0(r8)
            java.util.Iterator r8 = r8.iterator()
        L8c:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L4c
            java.lang.Object r5 = r8.next()
            d4.g r5 = (d4.g) r5
            d4.h r5 = r4.a(r7, r5)
            r2.add(r5)
            goto L8c
        La0:
            r7.e()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r1.iterator()
        Lac:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc7
            java.lang.Object r1 = r0.next()
            d4.h r1 = (d4.h) r1
            kotlin.reflect.jvm.internal.impl.types.h r2 = kotlin.reflect.jvm.internal.impl.types.h.a
            kotlin.jvm.internal.g0.m(r1)
            java.util.List r1 = r2.j(r7, r1, r9)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.collections.f0.s0(r8, r1)
            goto Lac
        Lc7:
            return r8
    }

    public final boolean s(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r17, @org.jetbrains.annotations.NotNull d4.k r18, @org.jetbrains.annotations.NotNull d4.h r19) {
            r16 = this;
            r1 = r17
            r7 = r18
            r8 = r19
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "capturedSubArguments"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "superType"
            kotlin.jvm.internal.g0.p(r8, r0)
            d4.r r9 = r1.j()
            d4.o r10 = r9.g(r8)
            int r0 = r9.g0(r7)
            int r11 = r9.A0(r10)
            r12 = 0
            if (r0 != r11) goto Lf4
            int r2 = r9.m0(r8)
            if (r0 == r2) goto L30
            goto Lf4
        L30:
            r13 = 0
        L31:
            r0 = 1
            if (r13 >= r11) goto Lf3
            d4.l r2 = r9.I0(r8, r13)
            d4.g r3 = r9.getType(r2)
            if (r3 != 0) goto L40
            goto Ld3
        L40:
            d4.l r4 = r9.t0(r7, r13)
            r9.G(r4)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r5 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV
            d4.g r4 = r9.getType(r4)
            kotlin.jvm.internal.g0.m(r4)
            kotlin.reflect.jvm.internal.impl.types.h r6 = kotlin.reflect.jvm.internal.impl.types.h.a
            d4.p r14 = r9.h0(r10, r13)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r14 = r9.M(r14)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r2 = r9.G(r2)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r2 = r6.l(r14, r2)
            if (r2 != 0) goto L69
            boolean r0 = r1.n()
            return r0
        L69:
            if (r2 != r5) goto L79
            boolean r5 = r6.z(r9, r4, r3, r10)
            if (r5 != 0) goto Ld3
            boolean r5 = r6.z(r9, r3, r4, r10)
            if (r5 == 0) goto L79
            goto Ld3
        L79:
            int r5 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.a(r1)
            r14 = 100
            if (r5 > r14) goto Ld7
            int r5 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.a(r1)
            int r5 = r5 + r0
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b(r1, r5)
            int[] r5 = kotlin.reflect.jvm.internal.impl.types.h.a.a
            int r2 = r2.ordinal()
            r2 = r5[r2]
            if (r2 == r0) goto Lc0
            r0 = 2
            if (r2 == r0) goto Laf
            r0 = 3
            if (r2 != r0) goto La9
            r5 = 8
            r0 = r6
            r6 = 0
            r2 = r4
            r4 = 0
            r15 = r3
            r3 = r2
            r2 = r15
            boolean r0 = v(r0, r1, r2, r3, r4, r5, r6)
            r1 = r17
            goto Lc7
        La9:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        Laf:
            r2 = r3
            r3 = r4
            r0 = r6
            r5 = 8
            r6 = 0
            r4 = 0
            r1 = r3
            r3 = r2
            r2 = r1
            r1 = r17
            boolean r0 = v(r0, r1, r2, r3, r4, r5, r6)
            goto Lc7
        Lc0:
            r2 = r3
            r3 = r4
            r0 = r6
            boolean r0 = r0.m(r1, r3, r2)
        Lc7:
            int r2 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.a(r1)
            int r2 = r2 + (-1)
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b(r1, r2)
            if (r0 != 0) goto Ld3
            return r12
        Ld3:
            int r13 = r13 + 1
            goto L31
        Ld7:
            r3 = r4
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Arguments depth is too high. Some related argument: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lf3:
            return r0
        Lf4:
            return r12
    }

    @kotlin.jvm.JvmOverloads
    public final boolean t(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r9, @org.jetbrains.annotations.NotNull d4.g r10, @org.jetbrains.annotations.NotNull d4.g r11) {
            r8 = this;
            java.lang.String r0 = "state"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "subType"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "superType"
            kotlin.jvm.internal.g0.p(r11, r0)
            r6 = 8
            r7 = 0
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            boolean r9 = v(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    @kotlin.jvm.JvmOverloads
    public final boolean u(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r2, @org.jetbrains.annotations.NotNull d4.g r3, @org.jetbrains.annotations.NotNull d4.g r4, boolean r5) {
            r1 = this;
            java.lang.String r0 = "state"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "subType"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "superType"
            kotlin.jvm.internal.g0.p(r4, r0)
            if (r3 != r4) goto L13
            r2 = 1
            return r2
        L13:
            boolean r0 = r2.f(r3, r4)
            if (r0 != 0) goto L1b
            r2 = 0
            return r2
        L1b:
            boolean r2 = r1.k(r2, r3, r4, r5)
            return r2
    }
}
