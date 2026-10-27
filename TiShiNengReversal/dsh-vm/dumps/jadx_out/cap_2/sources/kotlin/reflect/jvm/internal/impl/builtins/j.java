package kotlin.reflect.jvm.internal.impl.builtins;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class j {
    public static final kotlin.reflect.jvm.internal.impl.name.f g = null;
    static final /* synthetic */ boolean h = false;
    private kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 a;
    private kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.descriptors.impl.f0> b;
    private final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.builtins.j.e> c;
    private final kotlin.reflect.jvm.internal.impl.storage.i<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.s0>> d;
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.d> e;
    private final kotlin.reflect.jvm.internal.impl.storage.n f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements kotlin.jvm.functions.Function0<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.s0>> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.j a;

        a(kotlin.reflect.jvm.internal.impl.builtins.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.s0> a() {
                r6 = this;
                kotlin.reflect.jvm.internal.impl.builtins.j r0 = r6.a
                kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r0 = r0.s()
                kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.builtins.o.B
                kotlin.reflect.jvm.internal.impl.descriptors.s0 r0 = r0.M(r1)
                kotlin.reflect.jvm.internal.impl.builtins.j r1 = r6.a
                kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r1 = r1.s()
                kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.builtins.o.D
                kotlin.reflect.jvm.internal.impl.descriptors.s0 r1 = r1.M(r2)
                kotlin.reflect.jvm.internal.impl.builtins.j r2 = r6.a
                kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r2 = r2.s()
                kotlin.reflect.jvm.internal.impl.name.c r3 = kotlin.reflect.jvm.internal.impl.builtins.o.E
                kotlin.reflect.jvm.internal.impl.descriptors.s0 r2 = r2.M(r3)
                kotlin.reflect.jvm.internal.impl.builtins.j r3 = r6.a
                kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r3 = r3.s()
                kotlin.reflect.jvm.internal.impl.name.c r4 = kotlin.reflect.jvm.internal.impl.builtins.o.C
                kotlin.reflect.jvm.internal.impl.descriptors.s0 r3 = r3.M(r4)
                r4 = 4
                kotlin.reflect.jvm.internal.impl.descriptors.s0[] r4 = new kotlin.reflect.jvm.internal.impl.descriptors.s0[r4]
                r5 = 0
                r4[r5] = r0
                r0 = 1
                r4[r0] = r1
                r0 = 2
                r4[r0] = r2
                r0 = 3
                r4[r0] = r3
                java.util.List r0 = java.util.Arrays.asList(r4)
                return r0
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.s0> invoke() {
                r1 = this;
                java.util.Collection r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.builtins.j.e> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.j a;

        b(kotlin.reflect.jvm.internal.impl.builtins.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public kotlin.reflect.jvm.internal.impl.builtins.j.e a() {
                r10 = this;
                java.util.EnumMap r0 = new java.util.EnumMap
                java.lang.Class<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType> r1 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.class
                r0.<init>(r1)
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[] r3 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.values()
                int r4 = r3.length
                r5 = 0
            L17:
                if (r5 >= r4) goto L43
                r6 = r3[r5]
                kotlin.reflect.jvm.internal.impl.builtins.j r7 = r10.a
                kotlin.reflect.jvm.internal.impl.name.f r8 = r6.getTypeName()
                java.lang.String r8 = r8.b()
                kotlin.reflect.jvm.internal.impl.types.e1 r7 = kotlin.reflect.jvm.internal.impl.builtins.j.b(r7, r8)
                kotlin.reflect.jvm.internal.impl.builtins.j r8 = r10.a
                kotlin.reflect.jvm.internal.impl.name.f r9 = r6.getArrayTypeName()
                java.lang.String r9 = r9.b()
                kotlin.reflect.jvm.internal.impl.types.e1 r8 = kotlin.reflect.jvm.internal.impl.builtins.j.b(r8, r9)
                r0.put(r6, r8)
                r1.put(r7, r8)
                r2.put(r8, r7)
                int r5 = r5 + 1
                goto L17
            L43:
                kotlin.reflect.jvm.internal.impl.builtins.j$e r3 = new kotlin.reflect.jvm.internal.impl.builtins.j$e
                r4 = 0
                r3.<init>(r0, r1, r2, r4)
                return r3
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.j.e invoke() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.builtins.j$e r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.d> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.j a;

        c(kotlin.reflect.jvm.internal.impl.builtins.j r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.d a(kotlin.reflect.jvm.internal.impl.name.f r5) {
                r4 = this;
                kotlin.reflect.jvm.internal.impl.builtins.j r0 = r4.a
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r0.t()
                kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r1 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BUILTINS
                kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.g(r5, r1)
                if (r0 == 0) goto L34
                boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
                if (r1 == 0) goto L15
                kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
                return r0
            L15:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Must be a class descriptor "
                r2.append(r3)
                r2.append(r5)
                java.lang.String r5 = ", but was "
                r2.append(r5)
                r2.append(r0)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                throw r1
            L34:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Built-in class "
                r1.append(r2)
                kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.builtins.o.B
                kotlin.reflect.jvm.internal.impl.name.c r5 = r2.b(r5)
                r1.append(r5)
                java.lang.String r5 = " is not found"
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d invoke(kotlin.reflect.jvm.internal.impl.name.f r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.name.f r1 = (kotlin.reflect.jvm.internal.impl.name.f) r1
                kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements kotlin.jvm.functions.Function0<java.lang.Void> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 a;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.j b;

        d(kotlin.reflect.jvm.internal.impl.builtins.j r1, kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public java.lang.Void a() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.builtins.j r0 = r3.b
                kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r0 = kotlin.reflect.jvm.internal.impl.builtins.j.c(r0)
                if (r0 != 0) goto L11
                kotlin.reflect.jvm.internal.impl.builtins.j r0 = r3.b
                kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r1 = r3.a
                kotlin.reflect.jvm.internal.impl.builtins.j.d(r0, r1)
                r0 = 0
                return r0
            L11:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Built-ins module is already set: "
                r1.append(r2)
                kotlin.reflect.jvm.internal.impl.builtins.j r2 = r3.b
                kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r2 = kotlin.reflect.jvm.internal.impl.builtins.j.c(r2)
                r1.append(r2)
                java.lang.String r2 = " (attempting to reset to "
                r1.append(r2)
                kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r2 = r3.a
                r1.append(r2)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Void invoke() {
                r1 = this;
                java.lang.Void r0 = r1.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class e {
        public final java.util.Map<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType, kotlin.reflect.jvm.internal.impl.types.e1> a;
        public final java.util.Map<kotlin.reflect.jvm.internal.impl.types.t0, kotlin.reflect.jvm.internal.impl.types.e1> b;
        public final java.util.Map<kotlin.reflect.jvm.internal.impl.types.e1, kotlin.reflect.jvm.internal.impl.types.e1> c;

        private e(@org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType, kotlin.reflect.jvm.internal.impl.types.e1> r2, @org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.jvm.internal.impl.types.t0, kotlin.reflect.jvm.internal.impl.types.e1> r3, @org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.jvm.internal.impl.types.e1, kotlin.reflect.jvm.internal.impl.types.e1> r4) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 0
                a(r0)
            L6:
                if (r3 != 0) goto Lc
                r0 = 1
                a(r0)
            Lc:
                if (r4 != 0) goto L12
                r0 = 2
                a(r0)
            L12:
                r1.<init>()
                r1.a = r2
                r1.b = r3
                r1.c = r4
                return
        }

        /* synthetic */ e(java.util.Map r1, java.util.Map r2, java.util.Map r3, kotlin.reflect.jvm.internal.impl.builtins.j.a r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        private static /* synthetic */ void a(int r4) {
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 2
                r2 = 0
                r3 = 1
                if (r4 == r3) goto L14
                if (r4 == r1) goto Lf
                java.lang.String r4 = "primitiveTypeToArrayKotlinType"
                r0[r2] = r4
                goto L18
            Lf:
                java.lang.String r4 = "kotlinArrayTypeToPrimitiveKotlinType"
                r0[r2] = r4
                goto L18
            L14:
                java.lang.String r4 = "primitiveKotlinTypeToKotlinArrayType"
                r0[r2] = r4
            L18:
                java.lang.String r4 = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives"
                r0[r3] = r4
                java.lang.String r4 = "<init>"
                r0[r1] = r4
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r4 = java.lang.String.format(r4, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r4)
                throw r0
        }
    }

    static {
            java.lang.String r0 = "<built-ins module>"
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.f.k(r0)
            kotlin.reflect.jvm.internal.impl.builtins.j.g = r0
            return
    }

    protected j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            a(r0)
        L6:
            r1.<init>()
            r1.f = r2
            kotlin.reflect.jvm.internal.impl.builtins.j$a r0 = new kotlin.reflect.jvm.internal.impl.builtins.j$a
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r2.e(r0)
            r1.d = r0
            kotlin.reflect.jvm.internal.impl.builtins.j$b r0 = new kotlin.reflect.jvm.internal.impl.builtins.j$b
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r2.e(r0)
            r1.c = r0
            kotlin.reflect.jvm.internal.impl.builtins.j$c r0 = new kotlin.reflect.jvm.internal.impl.builtins.j$c
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.g r2 = r2.i(r0)
            r1.e = r2
            return
    }

    public static boolean A0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 131(0x83, float:1.84E-43)
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.K0
            kotlin.reflect.jvm.internal.impl.name.d r0 = r0.i()
            boolean r1 = j0(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    private static kotlin.reflect.jvm.internal.impl.types.t0 B(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r4) {
            if (r3 != 0) goto L7
            r0 = 71
            a(r0)
        L7:
            if (r4 != 0) goto Le
            r0 = 72
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.types.w1 r3 = r3.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r3 = r3.c()
            r0 = 0
            if (r3 != 0) goto L1a
            return r0
        L1a:
            kotlin.reflect.jvm.internal.impl.builtins.q r1 = kotlin.reflect.jvm.internal.impl.builtins.q.a
            kotlin.reflect.jvm.internal.impl.name.f r2 = r3.getName()
            boolean r2 = r1.b(r2)
            if (r2 != 0) goto L27
            return r0
        L27:
            kotlin.reflect.jvm.internal.impl.name.b r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.n(r3)
            if (r3 != 0) goto L2e
            return r0
        L2e:
            kotlin.reflect.jvm.internal.impl.name.b r3 = r1.a(r3)
            if (r3 != 0) goto L35
            return r0
        L35:
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = kotlin.reflect.jvm.internal.impl.descriptors.x.b(r4, r3)
            if (r3 != 0) goto L3c
            return r0
        L3c:
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r3.s()
            return r3
    }

    public static boolean B0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 129(0x81, float:1.81E-43)
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.I0
            kotlin.reflect.jvm.internal.impl.name.d r0 = r0.i()
            boolean r1 = j0(r1, r0)
            return r1
    }

    public static boolean C0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            if (r1 != 0) goto L7
            r0 = 10
            a(r0)
        L7:
            if (r1 == 0) goto L1f
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
            if (r0 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r1
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.d()
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.builtins.o.A
            boolean r1 = r1.h(r0)
            return r1
        L1a:
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r1.b()
            goto L7
        L1f:
            r1 = 0
            return r1
    }

    public static boolean D0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 142(0x8e, float:1.99E-43)
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.name.d r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.f
            boolean r1 = n0(r1, r0)
            return r1
    }

    public static boolean E0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 132(0x84, float:1.85E-43)
            a(r0)
        L7:
            boolean r0 = y0(r1)
            if (r0 != 0) goto L22
            boolean r0 = B0(r1)
            if (r0 != 0) goto L22
            boolean r0 = z0(r1)
            if (r0 != 0) goto L22
            boolean r1 = A0(r1)
            if (r1 == 0) goto L20
            goto L22
        L20:
            r1 = 0
            return r1
        L22:
            r1 = 1
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType O(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 92
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.c()
            if (r1 != 0) goto L13
            r1 = 0
            return r1
        L13:
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1 = Q(r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType Q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
            if (r2 != 0) goto L7
            r0 = 77
            a(r0)
        L7:
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.T0
            kotlin.reflect.jvm.internal.impl.name.f r1 = r2.getName()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L20
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType> r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.V0
            kotlin.reflect.jvm.internal.impl.name.d r2 = kotlin.reflect.jvm.internal.impl.resolve.i.m(r2)
            java.lang.Object r2 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r2 = (kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType) r2
            return r2
        L20:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    private kotlin.reflect.jvm.internal.impl.descriptors.d R(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 16
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getTypeName()
            java.lang.String r2 = r2.b()
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r1.q(r2)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType T(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
            if (r2 != 0) goto L7
            r0 = 76
            a(r0)
        L7:
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.S0
            kotlin.reflect.jvm.internal.impl.name.f r1 = r2.getName()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L20
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType> r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.U0
            kotlin.reflect.jvm.internal.impl.name.d r2 = kotlin.reflect.jvm.internal.impl.resolve.i.m(r2)
            java.lang.Object r2 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r2 = (kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType) r2
            return r2
        L20:
            r2 = 0
            return r2
    }

    private static /* synthetic */ void a(int r23) {
            r0 = r23
            r1 = 87
            r2 = 86
            r3 = 84
            r4 = 81
            r5 = 74
            r6 = 69
            r7 = 15
            r8 = 13
            r9 = 11
            if (r0 == r9) goto L35
            if (r0 == r8) goto L35
            if (r0 == r7) goto L35
            if (r0 == r6) goto L35
            if (r0 == r5) goto L35
            if (r0 == r4) goto L35
            if (r0 == r3) goto L35
            if (r0 == r2) goto L35
            if (r0 == r1) goto L35
            switch(r0) {
                case 3: goto L35;
                case 4: goto L35;
                case 5: goto L35;
                case 6: goto L35;
                case 7: goto L35;
                case 8: goto L35;
                default: goto L29;
            }
        L29:
            switch(r0) {
                case 18: goto L35;
                case 19: goto L35;
                case 20: goto L35;
                case 21: goto L35;
                case 22: goto L35;
                case 23: goto L35;
                case 24: goto L35;
                case 25: goto L35;
                case 26: goto L35;
                case 27: goto L35;
                case 28: goto L35;
                case 29: goto L35;
                case 30: goto L35;
                case 31: goto L35;
                case 32: goto L35;
                case 33: goto L35;
                case 34: goto L35;
                case 35: goto L35;
                case 36: goto L35;
                case 37: goto L35;
                case 38: goto L35;
                case 39: goto L35;
                case 40: goto L35;
                case 41: goto L35;
                case 42: goto L35;
                case 43: goto L35;
                case 44: goto L35;
                case 45: goto L35;
                case 46: goto L35;
                default: goto L2c;
            }
        L2c:
            switch(r0) {
                case 48: goto L35;
                case 49: goto L35;
                case 50: goto L35;
                case 51: goto L35;
                case 52: goto L35;
                case 53: goto L35;
                default: goto L2f;
            }
        L2f:
            switch(r0) {
                case 55: goto L35;
                case 56: goto L35;
                case 57: goto L35;
                case 58: goto L35;
                case 59: goto L35;
                case 60: goto L35;
                case 61: goto L35;
                case 62: goto L35;
                case 63: goto L35;
                case 64: goto L35;
                case 65: goto L35;
                case 66: goto L35;
                case 67: goto L35;
                default: goto L32;
            }
        L32:
            java.lang.String r10 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L37
        L35:
            java.lang.String r10 = "@NotNull method %s.%s must not return null"
        L37:
            r11 = 2
            if (r0 == r9) goto L58
            if (r0 == r8) goto L58
            if (r0 == r7) goto L58
            if (r0 == r6) goto L58
            if (r0 == r5) goto L58
            if (r0 == r4) goto L58
            if (r0 == r3) goto L58
            if (r0 == r2) goto L58
            if (r0 == r1) goto L58
            switch(r0) {
                case 3: goto L58;
                case 4: goto L58;
                case 5: goto L58;
                case 6: goto L58;
                case 7: goto L58;
                case 8: goto L58;
                default: goto L4d;
            }
        L4d:
            switch(r0) {
                case 18: goto L58;
                case 19: goto L58;
                case 20: goto L58;
                case 21: goto L58;
                case 22: goto L58;
                case 23: goto L58;
                case 24: goto L58;
                case 25: goto L58;
                case 26: goto L58;
                case 27: goto L58;
                case 28: goto L58;
                case 29: goto L58;
                case 30: goto L58;
                case 31: goto L58;
                case 32: goto L58;
                case 33: goto L58;
                case 34: goto L58;
                case 35: goto L58;
                case 36: goto L58;
                case 37: goto L58;
                case 38: goto L58;
                case 39: goto L58;
                case 40: goto L58;
                case 41: goto L58;
                case 42: goto L58;
                case 43: goto L58;
                case 44: goto L58;
                case 45: goto L58;
                case 46: goto L58;
                default: goto L50;
            }
        L50:
            switch(r0) {
                case 48: goto L58;
                case 49: goto L58;
                case 50: goto L58;
                case 51: goto L58;
                case 52: goto L58;
                case 53: goto L58;
                default: goto L53;
            }
        L53:
            switch(r0) {
                case 55: goto L58;
                case 56: goto L58;
                case 57: goto L58;
                case 58: goto L58;
                case 59: goto L58;
                case 60: goto L58;
                case 61: goto L58;
                case 62: goto L58;
                case 63: goto L58;
                case 64: goto L58;
                case 65: goto L58;
                case 66: goto L58;
                case 67: goto L58;
                default: goto L56;
            }
        L56:
            r12 = 3
            goto L59
        L58:
            r12 = 2
        L59:
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.String r13 = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns"
            r14 = 0
            switch(r0) {
                case 1: goto Lb9;
                case 2: goto Lb4;
                case 3: goto Lb1;
                case 4: goto Lb1;
                case 5: goto Lb1;
                case 6: goto Lb1;
                case 7: goto Lb1;
                case 8: goto Lb1;
                case 9: goto Lac;
                case 10: goto Lac;
                case 11: goto Lb1;
                case 12: goto La7;
                case 13: goto Lb1;
                case 14: goto La2;
                case 15: goto Lb1;
                case 16: goto L9d;
                case 17: goto L9d;
                case 18: goto Lb1;
                case 19: goto Lb1;
                case 20: goto Lb1;
                case 21: goto Lb1;
                case 22: goto Lb1;
                case 23: goto Lb1;
                case 24: goto Lb1;
                case 25: goto Lb1;
                case 26: goto Lb1;
                case 27: goto Lb1;
                case 28: goto Lb1;
                case 29: goto Lb1;
                case 30: goto Lb1;
                case 31: goto Lb1;
                case 32: goto Lb1;
                case 33: goto Lb1;
                case 34: goto Lb1;
                case 35: goto Lb1;
                case 36: goto Lb1;
                case 37: goto Lb1;
                case 38: goto Lb1;
                case 39: goto Lb1;
                case 40: goto Lb1;
                case 41: goto Lb1;
                case 42: goto Lb1;
                case 43: goto Lb1;
                case 44: goto Lb1;
                case 45: goto Lb1;
                case 46: goto Lb1;
                case 47: goto L98;
                case 48: goto Lb1;
                case 49: goto Lb1;
                case 50: goto Lb1;
                case 51: goto Lb1;
                case 52: goto Lb1;
                case 53: goto Lb1;
                case 54: goto L9d;
                case 55: goto Lb1;
                case 56: goto Lb1;
                case 57: goto Lb1;
                case 58: goto Lb1;
                case 59: goto Lb1;
                case 60: goto Lb1;
                case 61: goto Lb1;
                case 62: goto Lb1;
                case 63: goto Lb1;
                case 64: goto Lb1;
                case 65: goto Lb1;
                case 66: goto Lb1;
                case 67: goto Lb1;
                case 68: goto L93;
                case 69: goto Lb1;
                case 70: goto L93;
                case 71: goto L8e;
                case 72: goto Lb9;
                case 73: goto L89;
                case 74: goto Lb1;
                case 75: goto L84;
                case 76: goto Lac;
                case 77: goto Lac;
                case 78: goto L7f;
                case 79: goto L7a;
                case 80: goto L75;
                case 81: goto Lb1;
                case 82: goto L7f;
                case 83: goto L7a;
                case 84: goto Lb1;
                case 85: goto L7a;
                case 86: goto Lb1;
                case 87: goto Lb1;
                case 88: goto L9d;
                case 89: goto Lac;
                case 90: goto L9d;
                case 91: goto L9d;
                case 92: goto L9d;
                case 93: goto L9d;
                case 94: goto L9d;
                case 95: goto L9d;
                case 96: goto Lac;
                case 97: goto L9d;
                case 98: goto La7;
                case 99: goto L9d;
                case 100: goto La7;
                case 101: goto L70;
                case 102: goto La7;
                case 103: goto Lac;
                case 104: goto La7;
                case 105: goto L9d;
                case 106: goto La7;
                case 107: goto Lac;
                case 108: goto Lac;
                case 109: goto L9d;
                case 110: goto L9d;
                case 111: goto L9d;
                case 112: goto L6b;
                case 113: goto L9d;
                case 114: goto L9d;
                case 115: goto L9d;
                case 116: goto L9d;
                case 117: goto L9d;
                case 118: goto L9d;
                case 119: goto L9d;
                case 120: goto L9d;
                case 121: goto L9d;
                case 122: goto L9d;
                case 123: goto L9d;
                case 124: goto L9d;
                case 125: goto L9d;
                case 126: goto L9d;
                case 127: goto L9d;
                case 128: goto L9d;
                case 129: goto L9d;
                case 130: goto L9d;
                case 131: goto L9d;
                case 132: goto L9d;
                case 133: goto L9d;
                case 134: goto L9d;
                case 135: goto La7;
                case 136: goto L9d;
                case 137: goto L9d;
                case 138: goto L9d;
                case 139: goto L9d;
                case 140: goto L9d;
                case 141: goto L9d;
                case 142: goto L9d;
                case 143: goto Lac;
                case 144: goto L9d;
                case 145: goto L9d;
                case 146: goto Lac;
                case 147: goto Lac;
                case 148: goto L9d;
                case 149: goto Lac;
                case 150: goto L9d;
                case 151: goto L9d;
                case 152: goto L9d;
                case 153: goto L9d;
                case 154: goto L9d;
                case 155: goto L9d;
                case 156: goto L9d;
                case 157: goto Lac;
                case 158: goto Lac;
                case 159: goto Lac;
                case 160: goto L66;
                case 161: goto L9d;
                default: goto L61;
            }
        L61:
            java.lang.String r15 = "storageManager"
            r12[r14] = r15
            goto Lbd
        L66:
            java.lang.String r15 = "declarationDescriptor"
            r12[r14] = r15
            goto Lbd
        L6b:
            java.lang.String r15 = "classDescriptor"
            r12[r14] = r15
            goto Lbd
        L70:
            java.lang.String r15 = "typeConstructor"
            r12[r14] = r15
            goto Lbd
        L75:
            java.lang.String r15 = "annotations"
            r12[r14] = r15
            goto Lbd
        L7a:
            java.lang.String r15 = "argument"
            r12[r14] = r15
            goto Lbd
        L7f:
            java.lang.String r15 = "projectionType"
            r12[r14] = r15
            goto Lbd
        L84:
            java.lang.String r15 = "kotlinType"
            r12[r14] = r15
            goto Lbd
        L89:
            java.lang.String r15 = "primitiveType"
            r12[r14] = r15
            goto Lbd
        L8e:
            java.lang.String r15 = "notNullArrayType"
            r12[r14] = r15
            goto Lbd
        L93:
            java.lang.String r15 = "arrayType"
            r12[r14] = r15
            goto Lbd
        L98:
            java.lang.String r15 = "classSimpleName"
            r12[r14] = r15
            goto Lbd
        L9d:
            java.lang.String r15 = "type"
            r12[r14] = r15
            goto Lbd
        La2:
            java.lang.String r15 = "simpleName"
            r12[r14] = r15
            goto Lbd
        La7:
            java.lang.String r15 = "fqName"
            r12[r14] = r15
            goto Lbd
        Lac:
            java.lang.String r15 = "descriptor"
            r12[r14] = r15
            goto Lbd
        Lb1:
            r12[r14] = r13
            goto Lbd
        Lb4:
            java.lang.String r15 = "computation"
            r12[r14] = r15
            goto Lbd
        Lb9:
            java.lang.String r15 = "module"
            r12[r14] = r15
        Lbd:
            java.lang.String r14 = "getBuiltInClassByFqName"
            java.lang.String r15 = "getBuiltInClassByName"
            java.lang.String r16 = "getBuiltInTypeByClassName"
            java.lang.String r17 = "getPrimitiveKotlinType"
            java.lang.String r18 = "getArrayElementType"
            java.lang.String r19 = "getPrimitiveArrayKotlinType"
            java.lang.String r20 = "getArrayType"
            java.lang.String r21 = "getEnumType"
            r22 = 1
            if (r0 == r9) goto L23c
            if (r0 == r8) goto L239
            if (r0 == r7) goto L236
            if (r0 == r6) goto L233
            if (r0 == r5) goto L230
            if (r0 == r4) goto L22d
            if (r0 == r3) goto L22d
            if (r0 == r2) goto L22a
            if (r0 == r1) goto L225
            switch(r0) {
                case 3: goto L220;
                case 4: goto L21b;
                case 5: goto L216;
                case 6: goto L211;
                case 7: goto L20c;
                case 8: goto L207;
                default: goto Le4;
            }
        Le4:
            switch(r0) {
                case 18: goto L202;
                case 19: goto L1fd;
                case 20: goto L1f8;
                case 21: goto L1f3;
                case 22: goto L1ee;
                case 23: goto L1e9;
                case 24: goto L1e3;
                case 25: goto L1dd;
                case 26: goto L1d7;
                case 27: goto L1d1;
                case 28: goto L1cb;
                case 29: goto L1c5;
                case 30: goto L1bf;
                case 31: goto L1b9;
                case 32: goto L1b3;
                case 33: goto L1ad;
                case 34: goto L1a7;
                case 35: goto L1a1;
                case 36: goto L19b;
                case 37: goto L195;
                case 38: goto L18f;
                case 39: goto L189;
                case 40: goto L183;
                case 41: goto L17d;
                case 42: goto L177;
                case 43: goto L171;
                case 44: goto L16b;
                case 45: goto L165;
                case 46: goto L15f;
                default: goto Le7;
            }
        Le7:
            switch(r0) {
                case 48: goto L15b;
                case 49: goto L155;
                case 50: goto L14f;
                case 51: goto L149;
                case 52: goto L143;
                case 53: goto L13d;
                default: goto Lea;
            }
        Lea:
            switch(r0) {
                case 55: goto L139;
                case 56: goto L133;
                case 57: goto L12d;
                case 58: goto L127;
                case 59: goto L121;
                case 60: goto L11b;
                case 61: goto L115;
                case 62: goto L10f;
                case 63: goto L109;
                case 64: goto L103;
                case 65: goto Lfd;
                case 66: goto Lf7;
                case 67: goto Lf1;
                default: goto Led;
            }
        Led:
            r12[r22] = r13
            goto L240
        Lf1:
            java.lang.String r13 = "getIterableType"
            r12[r22] = r13
            goto L240
        Lf7:
            java.lang.String r13 = "getStringType"
            r12[r22] = r13
            goto L240
        Lfd:
            java.lang.String r13 = "getUnitType"
            r12[r22] = r13
            goto L240
        L103:
            java.lang.String r13 = "getBooleanType"
            r12[r22] = r13
            goto L240
        L109:
            java.lang.String r13 = "getCharType"
            r12[r22] = r13
            goto L240
        L10f:
            java.lang.String r13 = "getDoubleType"
            r12[r22] = r13
            goto L240
        L115:
            java.lang.String r13 = "getFloatType"
            r12[r22] = r13
            goto L240
        L11b:
            java.lang.String r13 = "getLongType"
            r12[r22] = r13
            goto L240
        L121:
            java.lang.String r13 = "getIntType"
            r12[r22] = r13
            goto L240
        L127:
            java.lang.String r13 = "getShortType"
            r12[r22] = r13
            goto L240
        L12d:
            java.lang.String r13 = "getByteType"
            r12[r22] = r13
            goto L240
        L133:
            java.lang.String r13 = "getNumberType"
            r12[r22] = r13
            goto L240
        L139:
            r12[r22] = r17
            goto L240
        L13d:
            java.lang.String r13 = "getDefaultBound"
            r12[r22] = r13
            goto L240
        L143:
            java.lang.String r13 = "getNullableAnyType"
            r12[r22] = r13
            goto L240
        L149:
            java.lang.String r13 = "getAnyType"
            r12[r22] = r13
            goto L240
        L14f:
            java.lang.String r13 = "getNullableNothingType"
            r12[r22] = r13
            goto L240
        L155:
            java.lang.String r13 = "getNothingType"
            r12[r22] = r13
            goto L240
        L15b:
            r12[r22] = r16
            goto L240
        L15f:
            java.lang.String r13 = "getMutableListIterator"
            r12[r22] = r13
            goto L240
        L165:
            java.lang.String r13 = "getListIterator"
            r12[r22] = r13
            goto L240
        L16b:
            java.lang.String r13 = "getMutableMapEntry"
            r12[r22] = r13
            goto L240
        L171:
            java.lang.String r13 = "getMapEntry"
            r12[r22] = r13
            goto L240
        L177:
            java.lang.String r13 = "getMutableMap"
            r12[r22] = r13
            goto L240
        L17d:
            java.lang.String r13 = "getMap"
            r12[r22] = r13
            goto L240
        L183:
            java.lang.String r13 = "getMutableSet"
            r12[r22] = r13
            goto L240
        L189:
            java.lang.String r13 = "getSet"
            r12[r22] = r13
            goto L240
        L18f:
            java.lang.String r13 = "getMutableList"
            r12[r22] = r13
            goto L240
        L195:
            java.lang.String r13 = "getList"
            r12[r22] = r13
            goto L240
        L19b:
            java.lang.String r13 = "getMutableCollection"
            r12[r22] = r13
            goto L240
        L1a1:
            java.lang.String r13 = "getCollection"
            r12[r22] = r13
            goto L240
        L1a7:
            java.lang.String r13 = "getMutableIterator"
            r12[r22] = r13
            goto L240
        L1ad:
            java.lang.String r13 = "getMutableIterable"
            r12[r22] = r13
            goto L240
        L1b3:
            java.lang.String r13 = "getIterable"
            r12[r22] = r13
            goto L240
        L1b9:
            java.lang.String r13 = "getIterator"
            r12[r22] = r13
            goto L240
        L1bf:
            java.lang.String r13 = "getKMutableProperty2"
            r12[r22] = r13
            goto L240
        L1c5:
            java.lang.String r13 = "getKMutableProperty1"
            r12[r22] = r13
            goto L240
        L1cb:
            java.lang.String r13 = "getKMutableProperty0"
            r12[r22] = r13
            goto L240
        L1d1:
            java.lang.String r13 = "getKProperty2"
            r12[r22] = r13
            goto L240
        L1d7:
            java.lang.String r13 = "getKProperty1"
            r12[r22] = r13
            goto L240
        L1dd:
            java.lang.String r13 = "getKProperty0"
            r12[r22] = r13
            goto L240
        L1e3:
            java.lang.String r13 = "getKProperty"
            r12[r22] = r13
            goto L240
        L1e9:
            java.lang.String r13 = "getKCallable"
            r12[r22] = r13
            goto L240
        L1ee:
            java.lang.String r13 = "getKType"
            r12[r22] = r13
            goto L240
        L1f3:
            java.lang.String r13 = "getKClass"
            r12[r22] = r13
            goto L240
        L1f8:
            java.lang.String r13 = "getKSuspendFunction"
            r12[r22] = r13
            goto L240
        L1fd:
            java.lang.String r13 = "getKFunction"
            r12[r22] = r13
            goto L240
        L202:
            java.lang.String r13 = "getSuspendFunction"
            r12[r22] = r13
            goto L240
        L207:
            java.lang.String r13 = "getBuiltInPackagesImportedByDefault"
            r12[r22] = r13
            goto L240
        L20c:
            java.lang.String r13 = "getBuiltInsModule"
            r12[r22] = r13
            goto L240
        L211:
            java.lang.String r13 = "getStorageManager"
            r12[r22] = r13
            goto L240
        L216:
            java.lang.String r13 = "getClassDescriptorFactories"
            r12[r22] = r13
            goto L240
        L21b:
            java.lang.String r13 = "getPlatformDependentDeclarationFilter"
            r12[r22] = r13
            goto L240
        L220:
            java.lang.String r13 = "getAdditionalClassPartsProvider"
            r12[r22] = r13
            goto L240
        L225:
            java.lang.String r13 = "getAnnotationType"
            r12[r22] = r13
            goto L240
        L22a:
            r12[r22] = r21
            goto L240
        L22d:
            r12[r22] = r20
            goto L240
        L230:
            r12[r22] = r19
            goto L240
        L233:
            r12[r22] = r18
            goto L240
        L236:
            r12[r22] = r15
            goto L240
        L239:
            r12[r22] = r14
            goto L240
        L23c:
            java.lang.String r13 = "getBuiltInsPackageScope"
            r12[r22] = r13
        L240:
            switch(r0) {
                case 1: goto L3ff;
                case 2: goto L3fa;
                case 3: goto L403;
                case 4: goto L403;
                case 5: goto L403;
                case 6: goto L403;
                case 7: goto L403;
                case 8: goto L403;
                case 9: goto L3f5;
                case 10: goto L3f0;
                case 11: goto L403;
                case 12: goto L3ed;
                case 13: goto L403;
                case 14: goto L3ea;
                case 15: goto L403;
                case 16: goto L3e5;
                case 17: goto L3e0;
                case 18: goto L403;
                case 19: goto L403;
                case 20: goto L403;
                case 21: goto L403;
                case 22: goto L403;
                case 23: goto L403;
                case 24: goto L403;
                case 25: goto L403;
                case 26: goto L403;
                case 27: goto L403;
                case 28: goto L403;
                case 29: goto L403;
                case 30: goto L403;
                case 31: goto L403;
                case 32: goto L403;
                case 33: goto L403;
                case 34: goto L403;
                case 35: goto L403;
                case 36: goto L403;
                case 37: goto L403;
                case 38: goto L403;
                case 39: goto L403;
                case 40: goto L403;
                case 41: goto L403;
                case 42: goto L403;
                case 43: goto L403;
                case 44: goto L403;
                case 45: goto L403;
                case 46: goto L403;
                case 47: goto L3dd;
                case 48: goto L403;
                case 49: goto L403;
                case 50: goto L403;
                case 51: goto L403;
                case 52: goto L403;
                case 53: goto L403;
                case 54: goto L3da;
                case 55: goto L403;
                case 56: goto L403;
                case 57: goto L403;
                case 58: goto L403;
                case 59: goto L403;
                case 60: goto L403;
                case 61: goto L403;
                case 62: goto L403;
                case 63: goto L403;
                case 64: goto L403;
                case 65: goto L403;
                case 66: goto L403;
                case 67: goto L403;
                case 68: goto L3d7;
                case 69: goto L403;
                case 70: goto L3d2;
                case 71: goto L3cd;
                case 72: goto L3cd;
                case 73: goto L3ca;
                case 74: goto L403;
                case 75: goto L3c5;
                case 76: goto L3c0;
                case 77: goto L3bb;
                case 78: goto L3b8;
                case 79: goto L3b8;
                case 80: goto L3b8;
                case 81: goto L403;
                case 82: goto L3b8;
                case 83: goto L3b8;
                case 84: goto L403;
                case 85: goto L3b5;
                case 86: goto L403;
                case 87: goto L403;
                case 88: goto L3b0;
                case 89: goto L3ab;
                case 90: goto L3ab;
                case 91: goto L3a5;
                case 92: goto L39f;
                case 93: goto L3c0;
                case 94: goto L399;
                case 95: goto L393;
                case 96: goto L38d;
                case 97: goto L387;
                case 98: goto L387;
                case 99: goto L387;
                case 100: goto L387;
                case 101: goto L381;
                case 102: goto L381;
                case 103: goto L37b;
                case 104: goto L37b;
                case 105: goto L375;
                case 106: goto L375;
                case 107: goto L36f;
                case 108: goto L369;
                case 109: goto L369;
                case 110: goto L363;
                case 111: goto L35d;
                case 112: goto L363;
                case 113: goto L357;
                case 114: goto L351;
                case 115: goto L34b;
                case 116: goto L345;
                case 117: goto L33f;
                case 118: goto L339;
                case 119: goto L333;
                case 120: goto L32d;
                case 121: goto L327;
                case 122: goto L321;
                case 123: goto L31b;
                case 124: goto L315;
                case 125: goto L30f;
                case 126: goto L309;
                case 127: goto L303;
                case 128: goto L2fd;
                case 129: goto L2f7;
                case 130: goto L2f1;
                case 131: goto L2eb;
                case 132: goto L2e5;
                case 133: goto L2df;
                case 134: goto L2d9;
                case 135: goto L2d9;
                case 136: goto L2d3;
                case 137: goto L2cd;
                case 138: goto L2c7;
                case 139: goto L2c1;
                case 140: goto L2bb;
                case 141: goto L2b5;
                case 142: goto L2af;
                case 143: goto L2a9;
                case 144: goto L2a3;
                case 145: goto L29d;
                case 146: goto L297;
                case 147: goto L291;
                case 148: goto L291;
                case 149: goto L28b;
                case 150: goto L28b;
                case 151: goto L285;
                case 152: goto L27f;
                case 153: goto L279;
                case 154: goto L273;
                case 155: goto L26d;
                case 156: goto L267;
                case 157: goto L261;
                case 158: goto L25b;
                case 159: goto L255;
                case 160: goto L24f;
                case 161: goto L249;
                default: goto L243;
            }
        L243:
            java.lang.String r13 = "<init>"
            r12[r11] = r13
            goto L403
        L249:
            java.lang.String r13 = "isNotNullOrNullableFunctionSupertype"
            r12[r11] = r13
            goto L403
        L24f:
            java.lang.String r13 = "isDeprecated"
            r12[r11] = r13
            goto L403
        L255:
            java.lang.String r13 = "isNonPrimitiveArray"
            r12[r11] = r13
            goto L403
        L25b:
            java.lang.String r13 = "isKClass"
            r12[r11] = r13
            goto L403
        L261:
            java.lang.String r13 = "isThrowable"
            r12[r11] = r13
            goto L403
        L267:
            java.lang.String r13 = "isThrowableOrNullableThrowable"
            r12[r11] = r13
            goto L403
        L26d:
            java.lang.String r13 = "isIterableOrNullableIterable"
            r12[r11] = r13
            goto L403
        L273:
            java.lang.String r13 = "isMapOrNullableMap"
            r12[r11] = r13
            goto L403
        L279:
            java.lang.String r13 = "isSetOrNullableSet"
            r12[r11] = r13
            goto L403
        L27f:
            java.lang.String r13 = "isListOrNullableList"
            r12[r11] = r13
            goto L403
        L285:
            java.lang.String r13 = "isCollectionOrNullableCollection"
            r12[r11] = r13
            goto L403
        L28b:
            java.lang.String r13 = "isComparable"
            r12[r11] = r13
            goto L403
        L291:
            java.lang.String r13 = "isEnum"
            r12[r11] = r13
            goto L403
        L297:
            java.lang.String r13 = "isMemberOfAny"
            r12[r11] = r13
            goto L403
        L29d:
            java.lang.String r13 = "isBooleanOrSubtype"
            r12[r11] = r13
            goto L403
        L2a3:
            java.lang.String r13 = "isUnitOrNullableUnit"
            r12[r11] = r13
            goto L403
        L2a9:
            java.lang.String r13 = "mayReturnNonUnitValue"
            r12[r11] = r13
            goto L403
        L2af:
            java.lang.String r13 = "isUnit"
            r12[r11] = r13
            goto L403
        L2b5:
            java.lang.String r13 = "isDefaultBound"
            r12[r11] = r13
            goto L403
        L2bb:
            java.lang.String r13 = "isNullableAny"
            r12[r11] = r13
            goto L403
        L2c1:
            java.lang.String r13 = "isAnyOrNullableAny"
            r12[r11] = r13
            goto L403
        L2c7:
            java.lang.String r13 = "isNothingOrNullableNothing"
            r12[r11] = r13
            goto L403
        L2cd:
            java.lang.String r13 = "isNullableNothing"
            r12[r11] = r13
            goto L403
        L2d3:
            java.lang.String r13 = "isNothing"
            r12[r11] = r13
            goto L403
        L2d9:
            java.lang.String r13 = "isConstructedFromGivenClassAndNotNullable"
            r12[r11] = r13
            goto L403
        L2df:
            java.lang.String r13 = "isDoubleOrNullableDouble"
            r12[r11] = r13
            goto L403
        L2e5:
            java.lang.String r13 = "isUnsignedArrayType"
            r12[r11] = r13
            goto L403
        L2eb:
            java.lang.String r13 = "isULongArray"
            r12[r11] = r13
            goto L403
        L2f1:
            java.lang.String r13 = "isUIntArray"
            r12[r11] = r13
            goto L403
        L2f7:
            java.lang.String r13 = "isUShortArray"
            r12[r11] = r13
            goto L403
        L2fd:
            java.lang.String r13 = "isUByteArray"
            r12[r11] = r13
            goto L403
        L303:
            java.lang.String r13 = "isULong"
            r12[r11] = r13
            goto L403
        L309:
            java.lang.String r13 = "isUInt"
            r12[r11] = r13
            goto L403
        L30f:
            java.lang.String r13 = "isUShort"
            r12[r11] = r13
            goto L403
        L315:
            java.lang.String r13 = "isUByte"
            r12[r11] = r13
            goto L403
        L31b:
            java.lang.String r13 = "isDouble"
            r12[r11] = r13
            goto L403
        L321:
            java.lang.String r13 = "isFloatOrNullableFloat"
            r12[r11] = r13
            goto L403
        L327:
            java.lang.String r13 = "isFloat"
            r12[r11] = r13
            goto L403
        L32d:
            java.lang.String r13 = "isShort"
            r12[r11] = r13
            goto L403
        L333:
            java.lang.String r13 = "isLongOrNullableLong"
            r12[r11] = r13
            goto L403
        L339:
            java.lang.String r13 = "isLong"
            r12[r11] = r13
            goto L403
        L33f:
            java.lang.String r13 = "isByte"
            r12[r11] = r13
            goto L403
        L345:
            java.lang.String r13 = "isInt"
            r12[r11] = r13
            goto L403
        L34b:
            java.lang.String r13 = "isCharOrNullableChar"
            r12[r11] = r13
            goto L403
        L351:
            java.lang.String r13 = "isChar"
            r12[r11] = r13
            goto L403
        L357:
            java.lang.String r13 = "isNumber"
            r12[r11] = r13
            goto L403
        L35d:
            java.lang.String r13 = "isBooleanOrNullableBoolean"
            r12[r11] = r13
            goto L403
        L363:
            java.lang.String r13 = "isBoolean"
            r12[r11] = r13
            goto L403
        L369:
            java.lang.String r13 = "isAny"
            r12[r11] = r13
            goto L403
        L36f:
            java.lang.String r13 = "isSpecialClassWithNoSupertypes"
            r12[r11] = r13
            goto L403
        L375:
            java.lang.String r13 = "isNotNullConstructedFromGivenClass"
            r12[r11] = r13
            goto L403
        L37b:
            java.lang.String r13 = "classFqNameEquals"
            r12[r11] = r13
            goto L403
        L381:
            java.lang.String r13 = "isTypeConstructorForGivenClass"
            r12[r11] = r13
            goto L403
        L387:
            java.lang.String r13 = "isConstructedFromGivenClass"
            r12[r11] = r13
            goto L403
        L38d:
            java.lang.String r13 = "isPrimitiveClass"
            r12[r11] = r13
            goto L403
        L393:
            java.lang.String r13 = "isPrimitiveTypeOrNullablePrimitiveType"
            r12[r11] = r13
            goto L403
        L399:
            java.lang.String r13 = "isPrimitiveType"
            r12[r11] = r13
            goto L403
        L39f:
            java.lang.String r13 = "getPrimitiveArrayElementType"
            r12[r11] = r13
            goto L403
        L3a5:
            java.lang.String r13 = "isPrimitiveArray"
            r12[r11] = r13
            goto L403
        L3ab:
            java.lang.String r13 = "isArrayOrPrimitiveArray"
            r12[r11] = r13
            goto L403
        L3b0:
            java.lang.String r13 = "isArray"
            r12[r11] = r13
            goto L403
        L3b5:
            r12[r11] = r21
            goto L403
        L3b8:
            r12[r11] = r20
            goto L403
        L3bb:
            java.lang.String r13 = "getPrimitiveArrayType"
            r12[r11] = r13
            goto L403
        L3c0:
            java.lang.String r13 = "getPrimitiveType"
            r12[r11] = r13
            goto L403
        L3c5:
            java.lang.String r13 = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType"
            r12[r11] = r13
            goto L403
        L3ca:
            r12[r11] = r19
            goto L403
        L3cd:
            java.lang.String r13 = "getElementTypeForUnsignedArray"
            r12[r11] = r13
            goto L403
        L3d2:
            java.lang.String r13 = "getArrayElementTypeOrNull"
            r12[r11] = r13
            goto L403
        L3d7:
            r12[r11] = r18
            goto L403
        L3da:
            r12[r11] = r17
            goto L403
        L3dd:
            r12[r11] = r16
            goto L403
        L3e0:
            java.lang.String r13 = "getPrimitiveArrayClassDescriptor"
            r12[r11] = r13
            goto L403
        L3e5:
            java.lang.String r13 = "getPrimitiveClassDescriptor"
            r12[r11] = r13
            goto L403
        L3ea:
            r12[r11] = r15
            goto L403
        L3ed:
            r12[r11] = r14
            goto L403
        L3f0:
            java.lang.String r13 = "isUnderKotlinPackage"
            r12[r11] = r13
            goto L403
        L3f5:
            java.lang.String r13 = "isBuiltIn"
            r12[r11] = r13
            goto L403
        L3fa:
            java.lang.String r13 = "setPostponedBuiltinsModuleComputation"
            r12[r11] = r13
            goto L403
        L3ff:
            java.lang.String r13 = "setBuiltInsModule"
            r12[r11] = r13
        L403:
            java.lang.String r10 = java.lang.String.format(r10, r12)
            if (r0 == r9) goto L42b
            if (r0 == r8) goto L42b
            if (r0 == r7) goto L42b
            if (r0 == r6) goto L42b
            if (r0 == r5) goto L42b
            if (r0 == r4) goto L42b
            if (r0 == r3) goto L42b
            if (r0 == r2) goto L42b
            if (r0 == r1) goto L42b
            switch(r0) {
                case 3: goto L42b;
                case 4: goto L42b;
                case 5: goto L42b;
                case 6: goto L42b;
                case 7: goto L42b;
                case 8: goto L42b;
                default: goto L41c;
            }
        L41c:
            switch(r0) {
                case 18: goto L42b;
                case 19: goto L42b;
                case 20: goto L42b;
                case 21: goto L42b;
                case 22: goto L42b;
                case 23: goto L42b;
                case 24: goto L42b;
                case 25: goto L42b;
                case 26: goto L42b;
                case 27: goto L42b;
                case 28: goto L42b;
                case 29: goto L42b;
                case 30: goto L42b;
                case 31: goto L42b;
                case 32: goto L42b;
                case 33: goto L42b;
                case 34: goto L42b;
                case 35: goto L42b;
                case 36: goto L42b;
                case 37: goto L42b;
                case 38: goto L42b;
                case 39: goto L42b;
                case 40: goto L42b;
                case 41: goto L42b;
                case 42: goto L42b;
                case 43: goto L42b;
                case 44: goto L42b;
                case 45: goto L42b;
                case 46: goto L42b;
                default: goto L41f;
            }
        L41f:
            switch(r0) {
                case 48: goto L42b;
                case 49: goto L42b;
                case 50: goto L42b;
                case 51: goto L42b;
                case 52: goto L42b;
                case 53: goto L42b;
                default: goto L422;
            }
        L422:
            switch(r0) {
                case 55: goto L42b;
                case 56: goto L42b;
                case 57: goto L42b;
                case 58: goto L42b;
                case 59: goto L42b;
                case 60: goto L42b;
                case 61: goto L42b;
                case 62: goto L42b;
                case 63: goto L42b;
                case 64: goto L42b;
                case 65: goto L42b;
                case 66: goto L42b;
                case 67: goto L42b;
                default: goto L425;
            }
        L425:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            goto L430
        L42b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
        L430:
            throw r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 b(kotlin.reflect.jvm.internal.impl.builtins.j r0, java.lang.String r1) {
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.r(r1)
            return r0
    }

    public static boolean b0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r1) {
            if (r1 != 0) goto L7
            r0 = 108(0x6c, float:1.51E-43)
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.name.d r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.b
            boolean r1 = e(r1, r0)
            return r1
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 c(kotlin.reflect.jvm.internal.impl.builtins.j r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r0 = r0.a
            return r0
    }

    public static boolean c0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 139(0x8b, float:1.95E-43)
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.name.d r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.b
            boolean r1 = i0(r1, r0)
            return r1
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 d(kotlin.reflect.jvm.internal.impl.builtins.j r0, kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r1) {
            r0.a = r1
            return r1
    }

    public static boolean d0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 88
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.name.d r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.i
            boolean r1 = i0(r1, r0)
            return r1
    }

    private static boolean e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.d r3) {
            if (r2 != 0) goto L7
            r0 = 103(0x67, float:1.44E-43)
            a(r0)
        L7:
            if (r3 != 0) goto Le
            r0 = 104(0x68, float:1.46E-43)
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.name.f r0 = r2.getName()
            kotlin.reflect.jvm.internal.impl.name.f r1 = r3.j()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L28
            kotlin.reflect.jvm.internal.impl.name.d r2 = kotlin.reflect.jvm.internal.impl.resolve.i.m(r2)
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
            r2 = 1
            return r2
        L28:
            r2 = 0
            return r2
    }

    public static boolean e0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r1) {
            if (r1 != 0) goto L7
            r0 = 89
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.name.d r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.i
            boolean r0 = e(r1, r0)
            if (r0 != 0) goto L18
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1 = Q(r1)
            if (r1 == 0) goto L16
            goto L18
        L16:
            r1 = 0
            return r1
        L18:
            r1 = 1
            return r1
    }

    public static boolean f0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 90
            a(r0)
        L7:
            boolean r0 = d0(r1)
            if (r0 != 0) goto L16
            boolean r1 = r0(r1)
            if (r1 == 0) goto L14
            goto L16
        L14:
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    public static boolean g0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 110(0x6e, float:1.54E-43)
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.name.d r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.j
            boolean r1 = j0(r1, r0)
            return r1
    }

    public static boolean h0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
            if (r2 != 0) goto L7
            r0 = 9
            a(r0)
        L7:
            java.lang.Class<kotlin.reflect.jvm.internal.impl.builtins.c> r0 = kotlin.reflect.jvm.internal.impl.builtins.c.class
            r1 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = kotlin.reflect.jvm.internal.impl.resolve.i.r(r2, r0, r1)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            return r1
    }

    private static boolean i0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.d r2) {
            if (r1 != 0) goto L7
            r0 = 97
            a(r0)
        L7:
            if (r2 != 0) goto Le
            r0 = 98
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            boolean r1 = x0(r1, r2)
            return r1
    }

    private static boolean j0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.d r2) {
            if (r1 != 0) goto L7
            r0 = 134(0x86, float:1.88E-43)
            a(r0)
        L7:
            if (r2 != 0) goto Le
            r0 = 135(0x87, float:1.89E-43)
            a(r0)
        Le:
            boolean r2 = i0(r1, r2)
            if (r2 == 0) goto L1c
            boolean r1 = r1.J0()
            if (r1 != 0) goto L1c
            r1 = 1
            return r1
        L1c:
            r1 = 0
            return r1
    }

    public static boolean k0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 141(0x8d, float:1.98E-43)
            a(r0)
        L7:
            boolean r1 = q0(r1)
            return r1
    }

    public static boolean l0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r4) {
            if (r4 != 0) goto L7
            r0 = 160(0xa0, float:2.24E-43)
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r4.a()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.getAnnotations()
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.builtins.o.a.y
            boolean r0 = r0.l(r1)
            r1 = 1
            if (r0 == 0) goto L19
            return r1
        L19:
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.w0
            r2 = 0
            if (r0 == 0) goto L3f
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r4
            boolean r0 = r4.C()
            kotlin.reflect.jvm.internal.impl.descriptors.x0 r3 = r4.getGetter()
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r4 = r4.getSetter()
            if (r3 == 0) goto L3f
            boolean r3 = l0(r3)
            if (r3 == 0) goto L3f
            if (r0 == 0) goto L3e
            if (r4 == 0) goto L3f
            boolean r4 = l0(r4)
            if (r4 == 0) goto L3f
        L3e:
            return r1
        L3f:
            return r2
    }

    public static boolean m0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r1) {
            if (r1 != 0) goto L7
            r0 = 158(0x9e, float:2.21E-43)
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.name.d r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.l0
            boolean r1 = e(r1, r0)
            return r1
    }

    private static boolean n0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.d r2) {
            if (r1 != 0) goto L7
            r0 = 105(0x69, float:1.47E-43)
            a(r0)
        L7:
            if (r2 != 0) goto Le
            r0 = 106(0x6a, float:1.49E-43)
            a(r0)
        Le:
            boolean r0 = r1.J0()
            if (r0 != 0) goto L1c
            boolean r1 = i0(r1, r2)
            if (r1 == 0) goto L1c
            r1 = 1
            return r1
        L1c:
            r1 = 0
            return r1
    }

    public static boolean o0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 136(0x88, float:1.9E-43)
            a(r0)
        L7:
            boolean r0 = p0(r1)
            if (r0 == 0) goto L15
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.j2.l(r1)
            if (r1 != 0) goto L15
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static boolean p0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 138(0x8a, float:1.93E-43)
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.name.d r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.c
            boolean r1 = i0(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    private kotlin.reflect.jvm.internal.impl.descriptors.d q(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 14
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.d> r0 = r1.e
            kotlin.reflect.jvm.internal.impl.name.f r2 = kotlin.reflect.jvm.internal.impl.name.f.h(r2)
            java.lang.Object r2 = r0.invoke(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r2
            if (r2 != 0) goto L1a
            r0 = 15
            a(r0)
        L1a:
            return r2
    }

    public static boolean q0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 140(0x8c, float:1.96E-43)
            a(r0)
        L7:
            boolean r0 = c0(r1)
            if (r0 == 0) goto L15
            boolean r1 = r1.J0()
            if (r1 == 0) goto L15
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    private kotlin.reflect.jvm.internal.impl.types.e1 r(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 47
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r1.q(r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.s()
            if (r2 != 0) goto L16
            r0 = 48
            a(r0)
        L16:
            return r2
    }

    public static boolean r0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 91
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.c()
            if (r1 == 0) goto L19
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1 = Q(r1)
            if (r1 == 0) goto L19
            r1 = 1
            return r1
        L19:
            r1 = 0
            return r1
    }

    public static boolean s0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r1) {
            if (r1 != 0) goto L7
            r0 = 96
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1 = T(r1)
            if (r1 == 0) goto Lf
            r1 = 1
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public static boolean t0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 94
            a(r0)
        L7:
            boolean r0 = r1.J0()
            if (r0 != 0) goto L15
            boolean r1 = u0(r1)
            if (r1 == 0) goto L15
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static boolean u0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 95
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.c()
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto L1d
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            boolean r1 = s0(r1)
            if (r1 == 0) goto L1d
            r1 = 1
            return r1
        L1d:
            r1 = 0
            return r1
    }

    public static boolean v0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r1) {
            if (r1 != 0) goto L7
            r0 = 107(0x6b, float:1.5E-43)
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.name.d r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.b
            boolean r0 = e(r1, r0)
            if (r0 != 0) goto L1a
            kotlin.reflect.jvm.internal.impl.name.d r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.c
            boolean r1 = e(r1, r0)
            if (r1 == 0) goto L18
            goto L1a
        L18:
            r1 = 0
            return r1
        L1a:
            r1 = 1
            return r1
    }

    public static boolean w0(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 == 0) goto Lc
            kotlin.reflect.jvm.internal.impl.name.d r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.h
            boolean r1 = n0(r1, r0)
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static boolean x0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.w1 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.d r2) {
            if (r1 != 0) goto L7
            r0 = 101(0x65, float:1.42E-43)
            a(r0)
        L7:
            if (r2 != 0) goto Le
            r0 = 102(0x66, float:1.43E-43)
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.c()
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto L1e
            boolean r1 = e(r1, r2)
            if (r1 == 0) goto L1e
            r1 = 1
            return r1
        L1e:
            r1 = 0
            return r1
    }

    public static boolean y0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 128(0x80, float:1.8E-43)
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.H0
            kotlin.reflect.jvm.internal.impl.name.d r0 = r0.i()
            boolean r1 = j0(r1, r0)
            return r1
    }

    public static boolean z0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            if (r1 != 0) goto L7
            r0 = 130(0x82, float:1.82E-43)
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.J0
            kotlin.reflect.jvm.internal.impl.name.d r0 = r0.i()
            boolean r1 = j0(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 A() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.DOUBLE
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.S(r0)
            if (r0 != 0) goto Ld
            r1 = 62
            a(r1)
        Ld:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 C() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.FLOAT
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.S(r0)
            if (r0 != 0) goto Ld
            r1 = 61
            a(r1)
        Ld:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d D(int r1) {
            r0 = this;
            java.lang.String r1 = kotlin.reflect.jvm.internal.impl.builtins.o.b(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r0.q(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 E() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.INT
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.S(r0)
            if (r0 != 0) goto Ld
            r1 = 59
            a(r1)
        Ld:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d F() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.d r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.l0
            kotlin.reflect.jvm.internal.impl.name.c r0 = r0.m()
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.p(r0)
            if (r0 != 0) goto L11
            r1 = 21
            a(r1)
        L11:
            return r0
    }

    public void F0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r0 = 1
            a(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r2.f
            kotlin.reflect.jvm.internal.impl.builtins.j$d r1 = new kotlin.reflect.jvm.internal.impl.builtins.j$d
            r1.<init>(r2, r3)
            r0.f(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 G() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.LONG
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.S(r0)
            if (r0 != 0) goto Ld
            r1 = 60
            a(r1)
        Ld:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d H() {
            r1 = this;
            java.lang.String r0 = "Nothing"
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.q(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 I() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.H()
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.s()
            if (r0 != 0) goto Lf
            r1 = 49
            a(r1)
        Lf:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 J() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.i()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.P0(r1)
            if (r0 != 0) goto L10
            r1 = 52
            a(r1)
        L10:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 K() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.I()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.P0(r1)
            if (r0 != 0) goto L10
            r1 = 50
            a(r1)
        L10:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d L() {
            r1 = this;
            java.lang.String r0 = "Number"
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.q(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 M() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.L()
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.s()
            if (r0 != 0) goto Lf
            r1 = 56
            a(r1)
        Lf:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected q3.c N() {
            r2 = this;
            q3.c$b r0 = q3.c.b.a
            if (r0 != 0) goto L8
            r1 = 4
            a(r1)
        L8:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 P(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 73
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.builtins.j$e> r0 = r1.c
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.builtins.j$e r0 = (kotlin.reflect.jvm.internal.impl.builtins.j.e) r0
            java.util.Map<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType, kotlin.reflect.jvm.internal.impl.types.e1> r0 = r0.a
            java.lang.Object r2 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = (kotlin.reflect.jvm.internal.impl.types.e1) r2
            if (r2 != 0) goto L1e
            r0 = 74
            a(r0)
        L1e:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 S(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 54
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r1.R(r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.s()
            if (r2 != 0) goto L16
            r0 = 55
            a(r0)
        L16:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 U() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.SHORT
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.S(r0)
            if (r0 != 0) goto Ld
            r1 = 58
            a(r1)
        Ld:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.storage.n V() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r2.f
            if (r0 != 0) goto L8
            r1 = 6
            a(r1)
        L8:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d W() {
            r1 = this;
            java.lang.String r0 = "String"
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.q(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 X() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.W()
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.s()
            if (r0 != 0) goto Lf
            r1 = 66
            a(r1)
        Lf:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d Y(int r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.s
            java.lang.String r2 = kotlin.reflect.jvm.internal.impl.builtins.o.d(r2)
            kotlin.reflect.jvm.internal.impl.name.f r2 = kotlin.reflect.jvm.internal.impl.name.f.h(r2)
            kotlin.reflect.jvm.internal.impl.name.c r2 = r0.b(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r1.p(r2)
            if (r2 != 0) goto L19
            r0 = 18
            a(r0)
        L19:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d Z() {
            r1 = this;
            java.lang.String r0 = "Unit"
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.q(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 a0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.Z()
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.s()
            if (r0 != 0) goto Lf
            r1 = 65
            a(r1)
        Lf:
            return r0
    }

    protected void f(boolean r10) {
            r9 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.f0
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.builtins.j.g
            kotlin.reflect.jvm.internal.impl.storage.n r2 = r9.f
            r3 = 0
            r0.<init>(r1, r2, r9, r3)
            r9.a = r0
            kotlin.reflect.jvm.internal.impl.builtins.b$a r1 = kotlin.reflect.jvm.internal.impl.builtins.b.a
            kotlin.reflect.jvm.internal.impl.builtins.b r2 = r1.c()
            kotlin.reflect.jvm.internal.impl.storage.n r3 = r9.f
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r4 = r9.a
            java.lang.Iterable r5 = r9.w()
            q3.c r6 = r9.N()
            q3.a r7 = r9.g()
            r8 = r10
            kotlin.reflect.jvm.internal.impl.descriptors.m0 r10 = r2.a(r3, r4, r5, r6, r7, r8)
            r0.J0(r10)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r10 = r9.a
            r0 = 1
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0[] r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.f0[r0]
            r1 = 0
            r0[r1] = r10
            r10.R0(r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    protected q3.a g() {
            r2 = this;
            q3.a$a r0 = q3.a.a.a
            if (r0 != 0) goto L8
            r1 = 3
            a(r1)
        L8:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d h() {
            r1 = this;
            java.lang.String r0 = "Any"
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.q(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 i() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.h()
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.s()
            if (r0 != 0) goto Lf
            r1 = 51
            a(r1)
        Lf:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d j() {
            r1 = this;
            java.lang.String r0 = "Array"
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.q(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r4) {
            r3 = this;
            if (r4 != 0) goto L7
            r0 = 68
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r3.l(r4)
            if (r0 == 0) goto Le
            return r0
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not array: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.types.t0 l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r4) {
            r3 = this;
            if (r4 != 0) goto L7
            r0 = 70
            a(r0)
        L7:
            boolean r0 = d0(r4)
            r1 = 0
            if (r0 == 0) goto L2a
            java.util.List r0 = r4.G0()
            int r0 = r0.size()
            r2 = 1
            if (r0 == r2) goto L1a
            return r1
        L1a:
            java.util.List r4 = r4.G0()
            r0 = 0
            java.lang.Object r4 = r4.get(r0)
            kotlin.reflect.jvm.internal.impl.types.c2 r4 = (kotlin.reflect.jvm.internal.impl.types.c2) r4
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.getType()
            return r4
        L2a:
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = kotlin.reflect.jvm.internal.impl.types.j2.n(r4)
            kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.builtins.j$e> r0 = r3.c
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.builtins.j$e r0 = (kotlin.reflect.jvm.internal.impl.builtins.j.e) r0
            java.util.Map<kotlin.reflect.jvm.internal.impl.types.e1, kotlin.reflect.jvm.internal.impl.types.e1> r0 = r0.c
            java.lang.Object r0 = r0.get(r4)
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            if (r0 == 0) goto L41
            return r0
        L41:
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = kotlin.reflect.jvm.internal.impl.resolve.i.i(r4)
            if (r0 == 0) goto L4e
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = B(r4, r0)
            if (r4 == 0) goto L4e
            return r4
        L4e:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.Variance r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 82
            a(r0)
        L7:
            if (r3 != 0) goto Le
            r0 = 83
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.b()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r1.n(r2, r3, r0)
            if (r2 != 0) goto L1f
            r3 = 84
            a(r3)
        L1f:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.Variance r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 78
            a(r0)
        L7:
            if (r3 != 0) goto Le
            r0 = 79
            a(r0)
        Le:
            if (r4 != 0) goto L15
            r0 = 80
            a(r0)
        L15:
            kotlin.reflect.jvm.internal.impl.types.e2 r0 = new kotlin.reflect.jvm.internal.impl.types.e2
            r0.<init>(r2, r3)
            java.util.List r2 = java.util.Collections.singletonList(r0)
            kotlin.reflect.jvm.internal.impl.types.t1 r3 = kotlin.reflect.jvm.internal.impl.types.u1.b(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.d r4 = r1.j()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = kotlin.reflect.jvm.internal.impl.types.w0.h(r3, r4, r2)
            if (r2 != 0) goto L31
            r3 = 81
            a(r3)
        L31:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 o() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BOOLEAN
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.S(r0)
            if (r0 != 0) goto Ld
            r1 = 64
            a(r1)
        Ld:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r3) {
            r2 = this;
            if (r3 != 0) goto L7
            r0 = 12
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r0 = r2.s()
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r1 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BUILTINS
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = kotlin.reflect.jvm.internal.impl.descriptors.q.d(r0, r3, r1)
            if (r3 != 0) goto L18
            r0 = 13
            a(r0)
        L18:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 s() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r0 = r2.a
            if (r0 != 0) goto Le
            kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.descriptors.impl.f0> r0 = r2.b
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.f0) r0
            r2.a = r0
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r0 = r2.a
            if (r0 != 0) goto L16
            r1 = 7
            a(r1)
        L16:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k t() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r0 = r2.s()
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.builtins.o.B
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r0 = r0.M(r1)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r0.r()
            if (r0 != 0) goto L15
            r1 = 11
            a(r1)
        L15:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 u() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BYTE
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.S(r0)
            if (r0 != 0) goto Ld
            r1 = 57
            a(r1)
        Ld:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 v() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.CHAR
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.S(r0)
            if (r0 != 0) goto Ld
            r1 = 63
            a(r1)
        Ld:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected java.lang.Iterable<q3.b> w() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.builtins.functions.a r0 = new kotlin.reflect.jvm.internal.impl.builtins.functions.a
            kotlin.reflect.jvm.internal.impl.storage.n r1 = r3.f
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r2 = r3.s()
            r0.<init>(r1, r2)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            if (r0 != 0) goto L15
            r1 = 5
            a(r1)
        L15:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d x() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.X
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.p(r0)
            if (r0 != 0) goto Ld
            r1 = 35
            a(r1)
        Ld:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d y() {
            r1 = this;
            java.lang.String r0 = "Comparable"
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.q(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 z() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.J()
            if (r0 != 0) goto Lb
            r1 = 53
            a(r1)
        Lb:
            return r0
    }
}
