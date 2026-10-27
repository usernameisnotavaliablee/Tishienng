package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class r {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.s a = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.s b = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.s c = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.s d = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.s e = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.s f = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.s g = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.s h = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.s i = null;
    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.s> j = null;
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.s, java.lang.Integer> k = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.s l = null;
    private static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h m = null;
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h n = null;

    @java.lang.Deprecated
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h o = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.util.l p = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.v1, kotlin.reflect.jvm.internal.impl.descriptors.s> q = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.types.t0 getType() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This method should not be called"
                r0.<init>(r1)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.types.t0 getType() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This method should not be called"
                r0.<init>(r1)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.types.t0 getType() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This method should not be called"
                r0.<init>(r1)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class d extends kotlin.reflect.jvm.internal.impl.descriptors.p {
        d(kotlin.reflect.jvm.internal.impl.descriptors.v1 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ void g(int r5) {
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r2 = 2
                r3 = 1
                if (r5 == r3) goto L14
                if (r5 == r2) goto Lf
                java.lang.String r4 = "descriptor"
                r0[r1] = r4
                goto L18
            Lf:
                java.lang.String r4 = "from"
                r0[r1] = r4
                goto L18
            L14:
                java.lang.String r4 = "what"
                r0[r1] = r4
            L18:
                java.lang.String r1 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1"
                r0[r3] = r1
                if (r5 == r3) goto L25
                if (r5 == r2) goto L25
                java.lang.String r5 = "hasContainingSourceFile"
                r0[r2] = r5
                goto L29
            L25:
                java.lang.String r5 = "isVisible"
                r0[r2] = r5
            L29:
                java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r5 = java.lang.String.format(r5, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r5)
                throw r0
        }

        private boolean h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3) {
                r2 = this;
                r0 = 0
                if (r3 != 0) goto L6
                g(r0)
            L6:
                kotlin.reflect.jvm.internal.impl.descriptors.f1 r3 = kotlin.reflect.jvm.internal.impl.resolve.i.j(r3)
                kotlin.reflect.jvm.internal.impl.descriptors.f1 r1 = kotlin.reflect.jvm.internal.impl.descriptors.f1.a
                if (r3 == r1) goto L10
                r3 = 1
                return r3
            L10:
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.o r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r5, boolean r6) {
                r2 = this;
                r3 = 1
                if (r4 != 0) goto L6
                g(r3)
            L6:
                if (r5 != 0) goto Lc
                r0 = 2
                g(r0)
            Lc:
                boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.i.J(r4)
                if (r0 == 0) goto L1d
                boolean r0 = r2.h(r5)
                if (r0 == 0) goto L1d
                boolean r3 = kotlin.reflect.jvm.internal.impl.descriptors.r.f(r4, r5)
                return r3
            L1d:
                boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j
                if (r0 == 0) goto L4b
                r0 = r4
                kotlin.reflect.jvm.internal.impl.descriptors.j r0 = (kotlin.reflect.jvm.internal.impl.descriptors.j) r0
                kotlin.reflect.jvm.internal.impl.descriptors.g r0 = r0.b()
                if (r6 == 0) goto L4b
                boolean r6 = kotlin.reflect.jvm.internal.impl.resolve.i.G(r0)
                if (r6 == 0) goto L4b
                boolean r6 = kotlin.reflect.jvm.internal.impl.resolve.i.J(r0)
                if (r6 == 0) goto L4b
                boolean r6 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j
                if (r6 == 0) goto L4b
                kotlin.reflect.jvm.internal.impl.descriptors.k r6 = r5.b()
                boolean r6 = kotlin.reflect.jvm.internal.impl.resolve.i.J(r6)
                if (r6 == 0) goto L4b
                boolean r6 = kotlin.reflect.jvm.internal.impl.descriptors.r.f(r4, r5)
                if (r6 == 0) goto L4b
                return r3
            L4b:
                if (r4 == 0) goto L5f
                kotlin.reflect.jvm.internal.impl.descriptors.k r4 = r4.b()
                boolean r6 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
                if (r6 == 0) goto L5b
                boolean r6 = kotlin.reflect.jvm.internal.impl.resolve.i.x(r4)
                if (r6 == 0) goto L5f
            L5b:
                boolean r6 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
                if (r6 == 0) goto L4b
            L5f:
                r6 = 0
                if (r4 != 0) goto L63
                return r6
            L63:
                if (r5 == 0) goto L91
                if (r4 != r5) goto L68
                return r3
            L68:
                boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
                if (r0 == 0) goto L8c
                boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
                if (r0 == 0) goto L8b
                r0 = r4
                kotlin.reflect.jvm.internal.impl.descriptors.l0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r0
                kotlin.reflect.jvm.internal.impl.name.c r0 = r0.d()
                r1 = r5
                kotlin.reflect.jvm.internal.impl.descriptors.l0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r1
                kotlin.reflect.jvm.internal.impl.name.c r1 = r1.d()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L8b
                boolean r4 = kotlin.reflect.jvm.internal.impl.resolve.i.b(r5, r4)
                if (r4 == 0) goto L8b
                return r3
            L8b:
                return r6
            L8c:
                kotlin.reflect.jvm.internal.impl.descriptors.k r5 = r5.b()
                goto L63
            L91:
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class e extends kotlin.reflect.jvm.internal.impl.descriptors.p {
        e(kotlin.reflect.jvm.internal.impl.descriptors.v1 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ void g(int r3) {
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r2 = 1
                if (r3 == r2) goto Lc
                java.lang.String r3 = "what"
                r0[r1] = r3
                goto L10
            Lc:
                java.lang.String r3 = "from"
                r0[r1] = r3
            L10:
                java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2"
                r0[r2] = r3
                r3 = 2
                java.lang.String r1 = "isVisible"
                r0[r3] = r1
                java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r3)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.o r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r6, boolean r7) {
                r3 = this;
                r0 = 0
                if (r5 != 0) goto L6
                g(r0)
            L6:
                r1 = 1
                if (r6 != 0) goto Lc
                g(r1)
            Lc:
                kotlin.reflect.jvm.internal.impl.descriptors.s r2 = kotlin.reflect.jvm.internal.impl.descriptors.r.a
                boolean r6 = r2.e(r4, r5, r6, r7)
                if (r6 == 0) goto L3f
                kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r6 = kotlin.reflect.jvm.internal.impl.descriptors.r.n
                if (r4 != r6) goto L19
                return r1
            L19:
                kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r6 = kotlin.reflect.jvm.internal.impl.descriptors.r.b()
                if (r4 != r6) goto L20
                return r0
            L20:
                java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.d> r6 = kotlin.reflect.jvm.internal.impl.descriptors.d.class
                kotlin.reflect.jvm.internal.impl.descriptors.k r5 = kotlin.reflect.jvm.internal.impl.resolve.i.q(r5, r6)
                if (r5 == 0) goto L3f
                boolean r6 = r4 instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.j
                if (r6 == 0) goto L3f
                kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.j r4 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.j) r4
                kotlin.reflect.jvm.internal.impl.descriptors.d r4 = r4.m()
                kotlin.reflect.jvm.internal.impl.descriptors.d r4 = r4.a()
                kotlin.reflect.jvm.internal.impl.descriptors.k r5 = r5.a()
                boolean r4 = r4.equals(r5)
                return r4
            L3f:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class f extends kotlin.reflect.jvm.internal.impl.descriptors.p {
        f(kotlin.reflect.jvm.internal.impl.descriptors.v1 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ void g(int r6) {
                r0 = 3
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r2 = 0
                r3 = 2
                r4 = 1
                if (r6 == r4) goto L1b
                if (r6 == r3) goto L16
                if (r6 == r0) goto L11
                java.lang.String r5 = "what"
                r1[r2] = r5
                goto L1f
            L11:
                java.lang.String r5 = "fromClass"
                r1[r2] = r5
                goto L1f
            L16:
                java.lang.String r5 = "whatDeclaration"
                r1[r2] = r5
                goto L1f
            L1b:
                java.lang.String r5 = "from"
                r1[r2] = r5
            L1f:
                java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3"
                r1[r4] = r2
                if (r6 == r3) goto L2c
                if (r6 == r0) goto L2c
                java.lang.String r6 = "isVisible"
                r1[r3] = r6
                goto L30
            L2c:
                java.lang.String r6 = "doesReceiverFitForProtectedVisibility"
                r1[r3] = r6
            L30:
                java.lang.String r6 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r6 = java.lang.String.format(r6, r1)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r6)
                throw r0
        }

        private boolean h(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.o r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r6) {
                r3 = this;
                if (r5 != 0) goto L6
                r0 = 2
                g(r0)
            L6:
                if (r6 != 0) goto Lc
                r0 = 3
                g(r0)
            Lc:
                kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.o
                r1 = 0
                if (r4 != r0) goto L12
                return r1
            L12:
                boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
                r2 = 1
                if (r0 != 0) goto L18
                return r2
            L18:
                boolean r5 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j
                if (r5 == 0) goto L1d
                return r2
            L1d:
                kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r5 = kotlin.reflect.jvm.internal.impl.descriptors.r.n
                if (r4 != r5) goto L22
                return r2
            L22:
                kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r5 = kotlin.reflect.jvm.internal.impl.descriptors.r.b()
                if (r4 == r5) goto L49
                if (r4 != 0) goto L2b
                goto L49
            L2b:
                boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.i
                if (r5 == 0) goto L36
                kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.i r4 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.i) r4
                kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.b()
                goto L3a
            L36:
                kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.getType()
            L3a:
                boolean r5 = kotlin.reflect.jvm.internal.impl.resolve.i.I(r4, r6)
                if (r5 != 0) goto L48
                boolean r4 = kotlin.reflect.jvm.internal.impl.types.g0.a(r4)
                if (r4 == 0) goto L47
                goto L48
            L47:
                return r1
            L48:
                return r2
            L49:
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.o r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r8, boolean r9) {
                r5 = this;
                r0 = 0
                if (r7 != 0) goto L6
                g(r0)
            L6:
                r1 = 1
                if (r8 != 0) goto Lc
                g(r1)
            Lc:
                java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.d> r2 = kotlin.reflect.jvm.internal.impl.descriptors.d.class
                kotlin.reflect.jvm.internal.impl.descriptors.k r3 = kotlin.reflect.jvm.internal.impl.resolve.i.q(r7, r2)
                kotlin.reflect.jvm.internal.impl.descriptors.d r3 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r3
                kotlin.reflect.jvm.internal.impl.descriptors.k r8 = kotlin.reflect.jvm.internal.impl.resolve.i.r(r8, r2, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.d r8 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r8
                if (r8 != 0) goto L1d
                return r0
            L1d:
                if (r3 == 0) goto L34
                boolean r4 = kotlin.reflect.jvm.internal.impl.resolve.i.x(r3)
                if (r4 == 0) goto L34
                kotlin.reflect.jvm.internal.impl.descriptors.k r3 = kotlin.reflect.jvm.internal.impl.resolve.i.q(r3, r2)
                kotlin.reflect.jvm.internal.impl.descriptors.d r3 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r3
                if (r3 == 0) goto L34
                boolean r3 = kotlin.reflect.jvm.internal.impl.resolve.i.H(r8, r3)
                if (r3 == 0) goto L34
                return r1
            L34:
                kotlin.reflect.jvm.internal.impl.descriptors.o r3 = kotlin.reflect.jvm.internal.impl.resolve.i.M(r7)
                kotlin.reflect.jvm.internal.impl.descriptors.k r2 = kotlin.reflect.jvm.internal.impl.resolve.i.q(r3, r2)
                kotlin.reflect.jvm.internal.impl.descriptors.d r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r2
                if (r2 != 0) goto L41
                return r0
            L41:
                boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.i.H(r8, r2)
                if (r0 == 0) goto L4e
                boolean r0 = r5.h(r6, r3, r8)
                if (r0 == 0) goto L4e
                return r1
            L4e:
                kotlin.reflect.jvm.internal.impl.descriptors.k r8 = r8.b()
                boolean r6 = r5.e(r6, r7, r8, r9)
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class g extends kotlin.reflect.jvm.internal.impl.descriptors.p {
        g(kotlin.reflect.jvm.internal.impl.descriptors.v1 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ void g(int r3) {
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r2 = 1
                if (r3 == r2) goto Lc
                java.lang.String r3 = "what"
                r0[r1] = r3
                goto L10
            Lc:
                java.lang.String r3 = "from"
                r0[r1] = r3
            L10:
                java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4"
                r0[r2] = r3
                r3 = 2
                java.lang.String r1 = "isVisible"
                r0[r3] = r1
                java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r3)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.o r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r4, boolean r5) {
                r1 = this;
                r2 = 0
                if (r3 != 0) goto L6
                g(r2)
            L6:
                if (r4 != 0) goto Lc
                r5 = 1
                g(r5)
            Lc:
                kotlin.reflect.jvm.internal.impl.descriptors.f0 r5 = kotlin.reflect.jvm.internal.impl.resolve.i.g(r3)
                kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = kotlin.reflect.jvm.internal.impl.resolve.i.g(r4)
                boolean r5 = r0.B(r5)
                if (r5 != 0) goto L1b
                return r2
            L1b:
                kotlin.reflect.jvm.internal.impl.util.l r2 = kotlin.reflect.jvm.internal.impl.descriptors.r.c()
                boolean r2 = r2.a(r3, r4)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class h extends kotlin.reflect.jvm.internal.impl.descriptors.p {
        h(kotlin.reflect.jvm.internal.impl.descriptors.v1 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ void g(int r3) {
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r2 = 1
                if (r3 == r2) goto Lc
                java.lang.String r3 = "what"
                r0[r1] = r3
                goto L10
            Lc:
                java.lang.String r3 = "from"
                r0[r1] = r3
            L10:
                java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5"
                r0[r2] = r3
                r3 = 2
                java.lang.String r1 = "isVisible"
                r0[r3] = r1
                java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r3)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.o r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3, boolean r4) {
                r0 = this;
                if (r2 != 0) goto L6
                r1 = 0
                g(r1)
            L6:
                r1 = 1
                if (r3 != 0) goto Lc
                g(r1)
            Lc:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class i extends kotlin.reflect.jvm.internal.impl.descriptors.p {
        i(kotlin.reflect.jvm.internal.impl.descriptors.v1 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ void g(int r3) {
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r2 = 1
                if (r3 == r2) goto Lc
                java.lang.String r3 = "what"
                r0[r1] = r3
                goto L10
            Lc:
                java.lang.String r3 = "from"
                r0[r1] = r3
            L10:
                java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6"
                r0[r2] = r3
                r3 = 2
                java.lang.String r1 = "isVisible"
                r0[r3] = r1
                java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r3)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.o r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3, boolean r4) {
                r0 = this;
                if (r2 != 0) goto L6
                r1 = 0
                g(r1)
            L6:
                if (r3 != 0) goto Lc
                r1 = 1
                g(r1)
            Lc:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "This method shouldn't be invoked for LOCAL visibility"
                r1.<init>(r2)
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class j extends kotlin.reflect.jvm.internal.impl.descriptors.p {
        j(kotlin.reflect.jvm.internal.impl.descriptors.v1 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ void g(int r3) {
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r2 = 1
                if (r3 == r2) goto Lc
                java.lang.String r3 = "what"
                r0[r1] = r3
                goto L10
            Lc:
                java.lang.String r3 = "from"
                r0[r1] = r3
            L10:
                java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7"
                r0[r2] = r3
                r3 = 2
                java.lang.String r1 = "isVisible"
                r0[r3] = r1
                java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r3)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.o r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3, boolean r4) {
                r0 = this;
                if (r2 != 0) goto L6
                r1 = 0
                g(r1)
            L6:
                if (r3 != 0) goto Lc
                r1 = 1
                g(r1)
            Lc:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Visibility is unknown yet"
                r1.<init>(r2)
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class k extends kotlin.reflect.jvm.internal.impl.descriptors.p {
        k(kotlin.reflect.jvm.internal.impl.descriptors.v1 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ void g(int r3) {
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r2 = 1
                if (r3 == r2) goto Lc
                java.lang.String r3 = "what"
                r0[r1] = r3
                goto L10
            Lc:
                java.lang.String r3 = "from"
                r0[r1] = r3
            L10:
                java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8"
                r0[r2] = r3
                r3 = 2
                java.lang.String r1 = "isVisible"
                r0[r3] = r1
                java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r3)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.o r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3, boolean r4) {
                r0 = this;
                r1 = 0
                if (r2 != 0) goto L6
                g(r1)
            L6:
                if (r3 != 0) goto Lc
                r2 = 1
                g(r2)
            Lc:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class l extends kotlin.reflect.jvm.internal.impl.descriptors.p {
        l(kotlin.reflect.jvm.internal.impl.descriptors.v1 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ void g(int r3) {
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r2 = 1
                if (r3 == r2) goto Lc
                java.lang.String r3 = "what"
                r0[r1] = r3
                goto L10
            Lc:
                java.lang.String r3 = "from"
                r0[r1] = r3
            L10:
                java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9"
                r0[r2] = r3
                r3 = 2
                java.lang.String r1 = "isVisible"
                r0[r3] = r1
                java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r3)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
        public boolean e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.o r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3, boolean r4) {
                r0 = this;
                r1 = 0
                if (r2 != 0) goto L6
                g(r1)
            L6:
                if (r3 != 0) goto Lc
                r2 = 1
                g(r2)
            Lc:
                return r1
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.r$d r0 = new kotlin.reflect.jvm.internal.impl.descriptors.r$d
            kotlin.reflect.jvm.internal.impl.descriptors.u1$e r1 = kotlin.reflect.jvm.internal.impl.descriptors.u1.e.c
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.r.a = r0
            kotlin.reflect.jvm.internal.impl.descriptors.r$e r1 = new kotlin.reflect.jvm.internal.impl.descriptors.r$e
            kotlin.reflect.jvm.internal.impl.descriptors.u1$f r2 = kotlin.reflect.jvm.internal.impl.descriptors.u1.f.c
            r1.<init>(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.r.b = r1
            kotlin.reflect.jvm.internal.impl.descriptors.r$f r2 = new kotlin.reflect.jvm.internal.impl.descriptors.r$f
            kotlin.reflect.jvm.internal.impl.descriptors.u1$g r3 = kotlin.reflect.jvm.internal.impl.descriptors.u1.g.c
            r2.<init>(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.r.c = r2
            kotlin.reflect.jvm.internal.impl.descriptors.r$g r3 = new kotlin.reflect.jvm.internal.impl.descriptors.r$g
            kotlin.reflect.jvm.internal.impl.descriptors.u1$b r4 = kotlin.reflect.jvm.internal.impl.descriptors.u1.b.c
            r3.<init>(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.r.d = r3
            kotlin.reflect.jvm.internal.impl.descriptors.r$h r4 = new kotlin.reflect.jvm.internal.impl.descriptors.r$h
            kotlin.reflect.jvm.internal.impl.descriptors.u1$h r5 = kotlin.reflect.jvm.internal.impl.descriptors.u1.h.c
            r4.<init>(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.r.e = r4
            kotlin.reflect.jvm.internal.impl.descriptors.r$i r5 = new kotlin.reflect.jvm.internal.impl.descriptors.r$i
            kotlin.reflect.jvm.internal.impl.descriptors.u1$d r6 = kotlin.reflect.jvm.internal.impl.descriptors.u1.d.c
            r5.<init>(r6)
            kotlin.reflect.jvm.internal.impl.descriptors.r.f = r5
            kotlin.reflect.jvm.internal.impl.descriptors.r$j r6 = new kotlin.reflect.jvm.internal.impl.descriptors.r$j
            kotlin.reflect.jvm.internal.impl.descriptors.u1$a r7 = kotlin.reflect.jvm.internal.impl.descriptors.u1.a.c
            r6.<init>(r7)
            kotlin.reflect.jvm.internal.impl.descriptors.r.g = r6
            kotlin.reflect.jvm.internal.impl.descriptors.r$k r7 = new kotlin.reflect.jvm.internal.impl.descriptors.r$k
            kotlin.reflect.jvm.internal.impl.descriptors.u1$c r8 = kotlin.reflect.jvm.internal.impl.descriptors.u1.c.c
            r7.<init>(r8)
            kotlin.reflect.jvm.internal.impl.descriptors.r.h = r7
            kotlin.reflect.jvm.internal.impl.descriptors.r$l r8 = new kotlin.reflect.jvm.internal.impl.descriptors.r$l
            kotlin.reflect.jvm.internal.impl.descriptors.u1$i r9 = kotlin.reflect.jvm.internal.impl.descriptors.u1.i.c
            r8.<init>(r9)
            kotlin.reflect.jvm.internal.impl.descriptors.r.i = r8
            r9 = 4
            kotlin.reflect.jvm.internal.impl.descriptors.s[] r10 = new kotlin.reflect.jvm.internal.impl.descriptors.s[r9]
            r11 = 0
            r10[r11] = r0
            r12 = 1
            r10[r12] = r1
            r13 = 2
            r10[r13] = r3
            r14 = 3
            r10[r14] = r5
            java.util.Set r10 = kotlin.collections.u1.u(r10)
            java.util.Set r10 = java.util.Collections.unmodifiableSet(r10)
            kotlin.reflect.jvm.internal.impl.descriptors.r.j = r10
            java.util.HashMap r9 = kotlin.reflect.jvm.internal.impl.utils.a.e(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r9.put(r1, r10)
            r9.put(r0, r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r9.put(r3, r10)
            r9.put(r2, r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            r9.put(r4, r10)
            java.util.Map r9 = java.util.Collections.unmodifiableMap(r9)
            kotlin.reflect.jvm.internal.impl.descriptors.r.k = r9
            kotlin.reflect.jvm.internal.impl.descriptors.r.l = r4
            kotlin.reflect.jvm.internal.impl.descriptors.r$a r9 = new kotlin.reflect.jvm.internal.impl.descriptors.r$a
            r9.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.r.m = r9
            kotlin.reflect.jvm.internal.impl.descriptors.r$b r9 = new kotlin.reflect.jvm.internal.impl.descriptors.r$b
            r9.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.r.n = r9
            kotlin.reflect.jvm.internal.impl.descriptors.r$c r9 = new kotlin.reflect.jvm.internal.impl.descriptors.r$c
            r9.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.r.o = r9
            java.lang.Class<kotlin.reflect.jvm.internal.impl.util.l> r9 = kotlin.reflect.jvm.internal.impl.util.l.class
            java.lang.ClassLoader r10 = r9.getClassLoader()
            java.util.ServiceLoader r9 = java.util.ServiceLoader.load(r9, r10)
            java.util.Iterator r9 = r9.iterator()
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lc1
            java.lang.Object r9 = r9.next()
            kotlin.reflect.jvm.internal.impl.util.l r9 = (kotlin.reflect.jvm.internal.impl.util.l) r9
            goto Lc3
        Lc1:
            kotlin.reflect.jvm.internal.impl.util.l$a r9 = kotlin.reflect.jvm.internal.impl.util.l.a.a
        Lc3:
            kotlin.reflect.jvm.internal.impl.descriptors.r.p = r9
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.r.q = r9
            i(r0)
            i(r1)
            i(r2)
            i(r3)
            i(r4)
            i(r5)
            i(r6)
            i(r7)
            i(r8)
            return
    }

    private static /* synthetic */ void a(int r8) {
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = 3
            goto L10
        Lf:
            r4 = 2
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h b() {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.m
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.util.l c() {
            kotlin.reflect.jvm.internal.impl.util.l r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.p
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static java.lang.Integer d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r2) {
            if (r1 != 0) goto L7
            r0 = 12
            a(r0)
        L7:
            if (r2 != 0) goto Le
            r0 = 13
            a(r0)
        Le:
            java.lang.Integer r0 = r1.a(r2)
            if (r0 == 0) goto L15
            return r0
        L15:
            java.lang.Integer r1 = r2.a(r1)
            if (r1 == 0) goto L25
            int r1 = r1.intValue()
            int r1 = -r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L25:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.descriptors.o e(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.o r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r5, boolean r6) {
            if (r4 != 0) goto L7
            r0 = 8
            a(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 9
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r4.a()
            kotlin.reflect.jvm.internal.impl.descriptors.o r0 = (kotlin.reflect.jvm.internal.impl.descriptors.o) r0
        L14:
            if (r0 == 0) goto L32
            kotlin.reflect.jvm.internal.impl.descriptors.s r1 = r0.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.s r2 = kotlin.reflect.jvm.internal.impl.descriptors.r.f
            if (r1 == r2) goto L32
            kotlin.reflect.jvm.internal.impl.descriptors.s r1 = r0.getVisibility()
            boolean r1 = r1.e(r3, r0, r5, r6)
            if (r1 != 0) goto L29
            return r0
        L29:
            java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.o> r1 = kotlin.reflect.jvm.internal.impl.descriptors.o.class
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = kotlin.reflect.jvm.internal.impl.resolve.i.q(r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.o r0 = (kotlin.reflect.jvm.internal.impl.descriptors.o) r0
            goto L14
        L32:
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.q0
            if (r0 == 0) goto L43
            kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.q0) r4
            kotlin.reflect.jvm.internal.impl.descriptors.c r4 = r4.F()
            kotlin.reflect.jvm.internal.impl.descriptors.o r3 = e(r3, r4, r5, r6)
            if (r3 == 0) goto L43
            return r3
        L43:
            r3 = 0
            return r3
    }

    public static boolean f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
            if (r1 != 0) goto L6
            r0 = 6
            a(r0)
        L6:
            if (r2 != 0) goto Lc
            r0 = 7
            a(r0)
        Lc:
            kotlin.reflect.jvm.internal.impl.descriptors.f1 r2 = kotlin.reflect.jvm.internal.impl.resolve.i.j(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.f1 r0 = kotlin.reflect.jvm.internal.impl.descriptors.f1.a
            if (r2 == r0) goto L1d
            kotlin.reflect.jvm.internal.impl.descriptors.f1 r1 = kotlin.reflect.jvm.internal.impl.resolve.i.j(r1)
            boolean r1 = r2.equals(r1)
            return r1
        L1d:
            r1 = 0
            return r1
    }

    public static boolean g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r1) {
            if (r1 != 0) goto L7
            r0 = 14
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.a
            if (r1 == r0) goto L12
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.b
            if (r1 != r0) goto L10
            goto L12
        L10:
            r1 = 0
            return r1
        L12:
            r1 = 1
            return r1
    }

    public static boolean h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.o r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2, boolean r3) {
            if (r1 != 0) goto L6
            r0 = 2
            a(r0)
        L6:
            if (r2 != 0) goto Lc
            r0 = 3
            a(r0)
        Lc:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.n
            kotlin.reflect.jvm.internal.impl.descriptors.o r1 = e(r0, r1, r2, r3)
            if (r1 != 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    private static void i(kotlin.reflect.jvm.internal.impl.descriptors.s r2) {
            java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.v1, kotlin.reflect.jvm.internal.impl.descriptors.s> r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.q
            kotlin.reflect.jvm.internal.impl.descriptors.v1 r1 = r2.b()
            r0.put(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.descriptors.s j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.v1 r3) {
            if (r3 != 0) goto L7
            r0 = 15
            a(r0)
        L7:
            java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.v1, kotlin.reflect.jvm.internal.impl.descriptors.s> r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.q
            java.lang.Object r0 = r0.get(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = (kotlin.reflect.jvm.internal.impl.descriptors.s) r0
            if (r0 == 0) goto L12
            return r0
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Inapplicable visibility: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
