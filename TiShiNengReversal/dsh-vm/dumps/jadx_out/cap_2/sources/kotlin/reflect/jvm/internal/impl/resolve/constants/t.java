package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class t extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<kotlin.reflect.jvm.internal.impl.resolve.constants.t.b> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.resolve.constants.t.a b = null;

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

        @org.jetbrains.annotations.Nullable
        public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r6) {
                r5 = this;
                java.lang.String r0 = "argumentType"
                kotlin.jvm.internal.g0.p(r6, r0)
                boolean r0 = kotlin.reflect.jvm.internal.impl.types.x0.a(r6)
                r1 = 0
                if (r0 == 0) goto Ld
                return r1
            Ld:
                r0 = 0
                r2 = r6
                r3 = 0
            L10:
                boolean r4 = kotlin.reflect.jvm.internal.impl.builtins.j.d0(r2)
                if (r4 == 0) goto L2c
                java.util.List r2 = r2.G0()
                java.lang.Object r2 = kotlin.collections.f0.m5(r2)
                kotlin.reflect.jvm.internal.impl.types.c2 r2 = (kotlin.reflect.jvm.internal.impl.types.c2) r2
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getType()
                java.lang.String r4 = "getType(...)"
                kotlin.jvm.internal.g0.o(r2, r4)
                int r3 = r3 + 1
                goto L10
            L2c:
                kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.I0()
                kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r2.c()
                boolean r4 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
                if (r4 == 0) goto L4f
                kotlin.reflect.jvm.internal.impl.name.b r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.n(r2)
                if (r0 != 0) goto L49
                kotlin.reflect.jvm.internal.impl.resolve.constants.t r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.t
                kotlin.reflect.jvm.internal.impl.resolve.constants.t$b$a r1 = new kotlin.reflect.jvm.internal.impl.resolve.constants.t$b$a
                r1.<init>(r6)
                r0.<init>(r1)
                return r0
            L49:
                kotlin.reflect.jvm.internal.impl.resolve.constants.t r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.t
                r6.<init>(r0, r3)
                return r6
            L4f:
                boolean r6 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
                if (r6 == 0) goto L65
                kotlin.reflect.jvm.internal.impl.resolve.constants.t r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.t
                kotlin.reflect.jvm.internal.impl.name.b$a r1 = kotlin.reflect.jvm.internal.impl.name.b.d
                kotlin.reflect.jvm.internal.impl.name.d r2 = kotlin.reflect.jvm.internal.impl.builtins.o.a.b
                kotlin.reflect.jvm.internal.impl.name.c r2 = r2.m()
                kotlin.reflect.jvm.internal.impl.name.b r1 = r1.c(r2)
                r6.<init>(r1, r0)
                return r6
            L65:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class b {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class a extends kotlin.reflect.jvm.internal.impl.resolve.constants.t.b {

            @org.jetbrains.annotations.NotNull
            private final kotlin.reflect.jvm.internal.impl.types.t0 a;

            public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
                    r1 = this;
                    java.lang.String r0 = "type"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    r0 = 0
                    r1.<init>(r0)
                    r1.a = r2
                    return
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                    r3 = this;
                    r0 = 1
                    if (r3 != r4) goto L4
                    return r0
                L4:
                    boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.t.b.a
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    kotlin.reflect.jvm.internal.impl.resolve.constants.t$b$a r4 = (kotlin.reflect.jvm.internal.impl.resolve.constants.t.b.a) r4
                    kotlin.reflect.jvm.internal.impl.types.t0 r1 = r3.a
                    kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.a
                    boolean r4 = kotlin.jvm.internal.g0.g(r1, r4)
                    if (r4 != 0) goto L17
                    return r2
                L17:
                    return r0
            }

            @org.jetbrains.annotations.NotNull
            public final kotlin.reflect.jvm.internal.impl.types.t0 getType() {
                    r1 = this;
                    kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.a
                    return r0
            }

            public int hashCode() {
                    r1 = this;
                    kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.a
                    int r0 = r0.hashCode()
                    return r0
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "LocalClass(type="
                    r0.append(r1)
                    kotlin.reflect.jvm.internal.impl.types.t0 r1 = r2.a
                    r0.append(r1)
                    r1 = 41
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.t$b$b, reason: collision with other inner class name */
        public static final class C0066b extends kotlin.reflect.jvm.internal.impl.resolve.constants.t.b {

            @org.jetbrains.annotations.NotNull
            private final kotlin.reflect.jvm.internal.impl.resolve.constants.f a;

            public C0066b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.constants.f r2) {
                    r1 = this;
                    java.lang.String r0 = "value"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    r0 = 0
                    r1.<init>(r0)
                    r1.a = r2
                    return
            }

            public final int a() {
                    r1 = this;
                    kotlin.reflect.jvm.internal.impl.resolve.constants.f r0 = r1.a
                    int r0 = r0.c()
                    return r0
            }

            @org.jetbrains.annotations.NotNull
            public final kotlin.reflect.jvm.internal.impl.name.b b() {
                    r1 = this;
                    kotlin.reflect.jvm.internal.impl.resolve.constants.f r0 = r1.a
                    kotlin.reflect.jvm.internal.impl.name.b r0 = r0.d()
                    return r0
            }

            @org.jetbrains.annotations.NotNull
            public final kotlin.reflect.jvm.internal.impl.resolve.constants.f c() {
                    r1 = this;
                    kotlin.reflect.jvm.internal.impl.resolve.constants.f r0 = r1.a
                    return r0
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                    r3 = this;
                    r0 = 1
                    if (r3 != r4) goto L4
                    return r0
                L4:
                    boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.t.b.C0066b
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    kotlin.reflect.jvm.internal.impl.resolve.constants.t$b$b r4 = (kotlin.reflect.jvm.internal.impl.resolve.constants.t.b.C0066b) r4
                    kotlin.reflect.jvm.internal.impl.resolve.constants.f r1 = r3.a
                    kotlin.reflect.jvm.internal.impl.resolve.constants.f r4 = r4.a
                    boolean r4 = kotlin.jvm.internal.g0.g(r1, r4)
                    if (r4 != 0) goto L17
                    return r2
                L17:
                    return r0
            }

            public int hashCode() {
                    r1 = this;
                    kotlin.reflect.jvm.internal.impl.resolve.constants.f r0 = r1.a
                    int r0 = r0.hashCode()
                    return r0
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "NormalClass(value="
                    r0.append(r1)
                    kotlin.reflect.jvm.internal.impl.resolve.constants.f r1 = r2.a
                    r0.append(r1)
                    r1 = 41
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ b(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.resolve.constants.t$a r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.t$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.resolve.constants.t.b = r0
            return
    }

    public t(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2, int r3) {
            r1 = this;
            java.lang.String r0 = "classId"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.resolve.constants.f r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.f
            r0.<init>(r2, r3)
            r1.<init>(r0)
            return
    }

    public t(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.constants.f r2) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.resolve.constants.t$b$b r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.t$b$b
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public t(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.constants.t.b r2) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>(r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.t0 b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r6) {
            r5 = this;
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.Object r0 = r5.a()
            kotlin.reflect.jvm.internal.impl.resolve.constants.t$b r0 = (kotlin.reflect.jvm.internal.impl.resolve.constants.t.b) r0
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.t.b.a
            if (r1 == 0) goto L1a
            java.lang.Object r6 = r5.a()
            kotlin.reflect.jvm.internal.impl.resolve.constants.t$b$a r6 = (kotlin.reflect.jvm.internal.impl.resolve.constants.t.b.a) r6
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = r6.getType()
            return r6
        L1a:
            boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.t.b.C0066b
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r5.a()
            kotlin.reflect.jvm.internal.impl.resolve.constants.t$b$b r0 = (kotlin.reflect.jvm.internal.impl.resolve.constants.t.b.C0066b) r0
            kotlin.reflect.jvm.internal.impl.resolve.constants.f r0 = r0.c()
            kotlin.reflect.jvm.internal.impl.name.b r1 = r0.a()
            int r0 = r0.b()
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = kotlin.reflect.jvm.internal.impl.descriptors.x.b(r6, r1)
            if (r2 != 0) goto L49
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r6 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            kotlin.reflect.jvm.internal.impl.types.error.g r6 = kotlin.reflect.jvm.internal.impl.types.error.i.d(r6, r0)
            return r6
        L49:
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.s()
            java.lang.String r2 = "getDefaultType(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.E(r1)
            r2 = 0
        L57:
            if (r2 >= r0) goto L6b
            kotlin.reflect.jvm.internal.impl.builtins.j r3 = r6.p()
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r3.m(r4, r1)
            java.lang.String r3 = "getArrayType(...)"
            kotlin.jvm.internal.g0.o(r1, r3)
            int r2 = r2 + 1
            goto L57
        L6b:
            return r1
        L6c:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 getType(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r4) {
            r3 = this;
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.types.t1$a r0 = kotlin.reflect.jvm.internal.impl.types.t1.b
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = r0.k()
            kotlin.reflect.jvm.internal.impl.builtins.j r1 = r4.p()
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r1.F()
            java.lang.String r2 = "getKClass(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.e2 r2 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r3.b(r4)
            r2.<init>(r4)
            java.util.List r4 = kotlin.collections.f0.l(r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = kotlin.reflect.jvm.internal.impl.types.w0.h(r0, r1, r4)
            return r4
    }
}
