package kotlin.reflect.jvm.internal.impl.resolve;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n implements kotlin.reflect.jvm.internal.impl.types.checker.b {

    @org.jetbrains.annotations.Nullable
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.types.w1, kotlin.reflect.jvm.internal.impl.types.w1> a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.checker.e.a b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.checker.g c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.checker.f d;

    @org.jetbrains.annotations.Nullable
    private final kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.types.t0, kotlin.reflect.jvm.internal.impl.types.t0, java.lang.Boolean> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.reflect.jvm.internal.impl.types.TypeCheckerState {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.n l;

        a(boolean r9, boolean r10, boolean r11, kotlin.reflect.jvm.internal.impl.resolve.n r12, kotlin.reflect.jvm.internal.impl.types.checker.f r13, kotlin.reflect.jvm.internal.impl.types.checker.g r14) {
                r8 = this;
                r8.l = r12
                r4 = 1
                r0 = r8
                r1 = r9
                r2 = r10
                r3 = r11
                r5 = r12
                r6 = r13
                r7 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState
        public boolean f(d4.g r3, d4.g r4) {
                r2 = this;
                java.lang.String r0 = "subType"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "superType"
                kotlin.jvm.internal.g0.p(r4, r0)
                boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.t0
                java.lang.String r1 = "Failed requirement."
                if (r0 == 0) goto L2b
                boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.types.t0
                if (r0 == 0) goto L25
                kotlin.reflect.jvm.internal.impl.resolve.n r0 = r2.l
                kotlin.jvm.functions.Function2 r0 = kotlin.reflect.jvm.internal.impl.resolve.n.L0(r0)
                java.lang.Object r3 = r0.invoke(r3, r4)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                return r3
            L25:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                r3.<init>(r1)
                throw r3
            L2b:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                r3.<init>(r1)
                throw r3
        }
    }

    public n(@org.jetbrains.annotations.Nullable java.util.Map<kotlin.reflect.jvm.internal.impl.types.w1, ? extends kotlin.reflect.jvm.internal.impl.types.w1> r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.e.a r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.f r5, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super kotlin.reflect.jvm.internal.impl.types.t0, ? super kotlin.reflect.jvm.internal.impl.types.t0, java.lang.Boolean> r6) {
            r1 = this;
            java.lang.String r0 = "equalityAxioms"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "kotlinTypePreparator"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.e = r6
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function2 L0(kotlin.reflect.jvm.internal.impl.resolve.n r0) {
            kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.types.t0, kotlin.reflect.jvm.internal.impl.types.t0, java.lang.Boolean> r0 = r0.e
            return r0
    }

    private final boolean M0(kotlin.reflect.jvm.internal.impl.types.w1 r5, kotlin.reflect.jvm.internal.impl.types.w1 r6) {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.types.checker.e$a r0 = r4.b
            boolean r0 = r0.a(r5, r6)
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            java.util.Map<kotlin.reflect.jvm.internal.impl.types.w1, kotlin.reflect.jvm.internal.impl.types.w1> r0 = r4.a
            r2 = 0
            if (r0 != 0) goto L10
            return r2
        L10:
            java.lang.Object r0 = r0.get(r5)
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = (kotlin.reflect.jvm.internal.impl.types.w1) r0
            java.util.Map<kotlin.reflect.jvm.internal.impl.types.w1, kotlin.reflect.jvm.internal.impl.types.w1> r3 = r4.a
            java.lang.Object r3 = r3.get(r6)
            kotlin.reflect.jvm.internal.impl.types.w1 r3 = (kotlin.reflect.jvm.internal.impl.types.w1) r3
            if (r0 == 0) goto L26
            boolean r6 = kotlin.jvm.internal.g0.g(r0, r6)
            if (r6 != 0) goto L2e
        L26:
            if (r3 == 0) goto L2f
            boolean r5 = kotlin.jvm.internal.g0.g(r3, r5)
            if (r5 == 0) goto L2f
        L2e:
            return r1
        L2f:
            return r2
    }

    public boolean A() {
            r1 = this;
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.M(r1)
            return r0
    }

    public int A0(@org.jetbrains.annotations.NotNull d4.o r1) {
            r0 = this;
            int r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.h0(r0, r1)
            return r1
    }

    public boolean B(@org.jetbrains.annotations.NotNull d4.b r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.T(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.h B0(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            d4.h r1 = r0.i1(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i2
    public boolean C(@org.jetbrains.annotations.NotNull d4.o r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.J(r0, r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i2
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType C0(@org.jetbrains.annotations.NotNull d4.o r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.r(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public d4.d D(@org.jetbrains.annotations.NotNull d4.e r1) {
            r0 = this;
            d4.d r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.f(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public d4.b D0(@org.jetbrains.annotations.NotNull d4.h r1) {
            r0 = this;
            d4.b r1 = r0.O0(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.i E(@org.jetbrains.annotations.NotNull d4.c r1) {
            r0 = this;
            d4.i r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.g0(r0, r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i2
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.name.d E0(@org.jetbrains.annotations.NotNull d4.o r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.name.d r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.o(r0, r1)
            return r1
    }

    public boolean F(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.O(r0, r1)
            return r1
    }

    public boolean F0(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            boolean r1 = r0.Z0(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.model.TypeVariance G(@org.jetbrains.annotations.NotNull d4.l r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.y(r0, r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i2
    @org.jetbrains.annotations.NotNull
    public d4.g G0(@org.jetbrains.annotations.NotNull d4.p r1) {
            r0 = this;
            d4.g r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.t(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.a H(@org.jetbrains.annotations.NotNull d4.b r1) {
            r0 = this;
            d4.a r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.m0(r0, r1)
            return r1
    }

    public boolean H0(@org.jetbrains.annotations.NotNull d4.o r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.G(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.h I(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            d4.h r1 = r0.c1(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.l I0(@org.jetbrains.annotations.NotNull d4.g r1, int r2) {
            r0 = this;
            d4.l r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.m(r0, r1, r2)
            return r1
    }

    public boolean J(@org.jetbrains.annotations.NotNull d4.o r3, @org.jetbrains.annotations.NotNull d4.o r4) {
            r2 = this;
            java.lang.String r0 = "c1"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "c2"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.w1
            java.lang.String r1 = "Failed requirement."
            if (r0 == 0) goto L2f
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.types.w1
            if (r0 == 0) goto L29
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.a(r2, r3, r4)
            if (r0 != 0) goto L27
            kotlin.reflect.jvm.internal.impl.types.w1 r3 = (kotlin.reflect.jvm.internal.impl.types.w1) r3
            kotlin.reflect.jvm.internal.impl.types.w1 r4 = (kotlin.reflect.jvm.internal.impl.types.w1) r4
            boolean r3 = r2.M0(r3, r4)
            if (r3 == 0) goto L25
            goto L27
        L25:
            r3 = 0
            return r3
        L27:
            r3 = 1
            return r3
        L29:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r1)
            throw r3
        L2f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r1)
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<d4.g> J0(@org.jetbrains.annotations.NotNull d4.p r1) {
            r0 = this;
            java.util.List r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.x(r0, r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i2
    @org.jetbrains.annotations.NotNull
    public d4.g K(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            d4.g r1 = r0.e1(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i2
    @org.jetbrains.annotations.Nullable
    public d4.g K0(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            d4.g r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.w(r0, r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b
    @org.jetbrains.annotations.NotNull
    public d4.g L(@org.jetbrains.annotations.NotNull d4.h r1, @org.jetbrains.annotations.NotNull d4.h r2) {
            r0 = this;
            d4.g r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.l(r0, r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.model.TypeVariance M(@org.jetbrains.annotations.NotNull d4.p r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.z(r0, r1)
            return r1
    }

    public boolean N(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.a0(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.types.e1 N0(@org.jetbrains.annotations.NotNull d4.h r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r2) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.j(r0, r1, r2)
            return r1
    }

    public boolean O(@org.jetbrains.annotations.NotNull d4.o r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.P(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public d4.b O0(d4.h r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            d4.i r2 = r1.u0(r2)
            d4.b r2 = r1.b(r2)
            return r2
    }

    public boolean P(@org.jetbrains.annotations.NotNull d4.o r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.L(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public java.util.List<d4.i> P0(d4.h r2, d4.o r3) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "constructor"
            kotlin.jvm.internal.g0.p(r3, r2)
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public d4.p Q(@org.jetbrains.annotations.NotNull d4.o r1) {
            r0 = this;
            d4.p r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.v(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.l Q0(d4.k r3, int r4) {
            r2 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3 instanceof d4.i
            if (r0 == 0) goto L10
            d4.g r3 = (d4.g) r3
            d4.l r3 = r2.I0(r3, r4)
            return r3
        L10:
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.model.ArgumentList
            if (r0 == 0) goto L22
            kotlin.reflect.jvm.internal.impl.types.model.ArgumentList r3 = (kotlin.reflect.jvm.internal.impl.types.model.ArgumentList) r3
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r4 = "get(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            d4.l r3 = (d4.l) r3
            return r3
        L22:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unknown type argument list type: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.Class r3 = r3.getClass()
            kotlin.reflect.d r3 = kotlin.jvm.internal.o0.d(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public /* bridge */ /* synthetic */ d4.h R(d4.h r1, kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r2) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.N0(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public d4.l R0(d4.h r2, int r3) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r3 < 0) goto L12
            int r0 = r1.m0(r2)
            if (r3 >= r0) goto L12
            d4.l r2 = r1.I0(r2, r3)
            return r2
        L12:
            r2 = 0
            return r2
    }

    public boolean S(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            boolean r1 = r0.V0(r1)
            return r1
    }

    public boolean S0(d4.g r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            d4.h r0 = r1.I(r2)
            boolean r0 = r1.c0(r0)
            d4.h r2 = r1.B0(r2)
            boolean r2 = r1.c0(r2)
            if (r0 == r2) goto L19
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i2
    public boolean T(@org.jetbrains.annotations.NotNull d4.g r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.A(r0, r1, r2)
            return r1
    }

    public boolean T0(d4.g r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            d4.h r2 = r1.a(r2)
            if (r2 == 0) goto L10
            d4.b r2 = r1.D0(r2)
            goto L11
        L10:
            r2 = 0
        L11:
            if (r2 == 0) goto L15
            r2 = 1
            return r2
        L15:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.TypeCheckerState U(boolean r8, boolean r9, boolean r10) {
            r7 = this;
            kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.types.t0, kotlin.reflect.jvm.internal.impl.types.t0, java.lang.Boolean> r0 = r7.e
            if (r0 != 0) goto Ld
            kotlin.reflect.jvm.internal.impl.types.checker.g r10 = r7.c
            kotlin.reflect.jvm.internal.impl.types.checker.f r0 = r7.d
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r8 = kotlin.reflect.jvm.internal.impl.types.checker.a.a(r8, r9, r7, r0, r10)
            return r8
        Ld:
            kotlin.reflect.jvm.internal.impl.types.checker.f r5 = r7.d
            kotlin.reflect.jvm.internal.impl.types.checker.g r6 = r7.c
            kotlin.reflect.jvm.internal.impl.resolve.n$a r0 = new kotlin.reflect.jvm.internal.impl.resolve.n$a
            r4 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public boolean U0(d4.h r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            d4.o r2 = r1.g(r2)
            boolean r2 = r1.V(r2)
            return r2
    }

    public boolean V(@org.jetbrains.annotations.NotNull d4.o r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.F(r0, r1)
            return r1
    }

    public boolean V0(d4.g r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            d4.h r2 = r1.a(r2)
            if (r2 == 0) goto L10
            d4.c r2 = r1.t(r2)
            goto L11
        L10:
            r2 = 0
        L11:
            if (r2 == 0) goto L15
            r2 = 1
            return r2
        L15:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public d4.o W(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            d4.o r1 = r0.h1(r1)
            return r1
    }

    public boolean W0(d4.h r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            d4.c r2 = r1.t(r2)
            if (r2 == 0) goto Ld
            r2 = 1
            return r2
        Ld:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public d4.e X(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            d4.e r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.g(r0, r1)
            return r1
    }

    public boolean X0(d4.g r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            d4.e r2 = r1.X(r2)
            if (r2 == 0) goto L10
            d4.d r2 = r1.D(r2)
            goto L11
        L10:
            r2 = 0
        L11:
            if (r2 == 0) goto L15
            r2 = 1
            return r2
        L15:
            r2 = 0
            return r2
    }

    public boolean Y(@org.jetbrains.annotations.NotNull d4.h r1) {
            r0 = this;
            boolean r1 = r0.U0(r1)
            return r1
    }

    public boolean Y0(d4.g r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            d4.e r2 = r1.X(r2)
            if (r2 == 0) goto Ld
            r2 = 1
            return r2
        Ld:
            r2 = 0
            return r2
    }

    public boolean Z(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.I(r0, r1)
            return r1
    }

    public boolean Z0(d4.g r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            d4.h r0 = r1.I(r2)
            d4.o r0 = r1.g(r0)
            d4.h r2 = r1.B0(r2)
            d4.o r2 = r1.g(r2)
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
            r2 = r2 ^ 1
            return r2
    }

    public /* bridge */ /* synthetic */ d4.h a(d4.g r1) {
            r0 = this;
            d4.i r1 = r0.mo31a(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b
    @org.jetbrains.annotations.Nullable
    /* renamed from: a, reason: collision with other method in class */
    public d4.i mo31a(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            d4.i r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.h(r0, r1)
            return r1
    }

    public boolean a0(@org.jetbrains.annotations.NotNull d4.h r1) {
            r0 = this;
            boolean r1 = r0.W0(r1)
            return r1
    }

    public boolean a1(d4.h r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            d4.o r2 = r1.g(r2)
            boolean r2 = r1.n0(r2)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b
    @org.jetbrains.annotations.Nullable
    public d4.b b(@org.jetbrains.annotations.NotNull d4.i r1) {
            r0 = this;
            d4.b r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.d(r0, r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i2
    public boolean b0(@org.jetbrains.annotations.NotNull d4.o r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.b0(r0, r1)
            return r1
    }

    public boolean b1(d4.g r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            d4.o r0 = r1.W(r2)
            boolean r0 = r1.O(r0)
            if (r0 == 0) goto L17
            boolean r2 = r1.i0(r2)
            if (r2 != 0) goto L17
            r2 = 1
            return r2
        L17:
            r2 = 0
            return r2
    }

    public /* bridge */ /* synthetic */ d4.h c(d4.h r1, boolean r2) {
            r0 = this;
            d4.i r1 = r0.mo32c(r1, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b
    @org.jetbrains.annotations.NotNull
    /* renamed from: c, reason: collision with other method in class */
    public d4.i mo32c(@org.jetbrains.annotations.NotNull d4.h r1, boolean r2) {
            r0 = this;
            d4.i r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.q0(r0, r1, r2)
            return r1
    }

    public boolean c0(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.N(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.h c1(d4.g r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            d4.e r0 = r1.X(r2)
            if (r0 == 0) goto L13
            d4.h r0 = r1.f(r0)
            if (r0 != 0) goto L12
            goto L13
        L12:
            return r0
        L13:
            d4.h r2 = r1.a(r2)
            kotlin.jvm.internal.g0.m(r2)
            return r2
    }

    public /* bridge */ /* synthetic */ d4.h d(d4.e r1) {
            r0 = this;
            d4.i r1 = r0.mo33d(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b
    @org.jetbrains.annotations.NotNull
    /* renamed from: d, reason: collision with other method in class */
    public d4.i mo33d(@org.jetbrains.annotations.NotNull d4.e r1) {
            r0 = this;
            d4.i r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.o0(r0, r1)
            return r1
    }

    public boolean d0(@org.jetbrains.annotations.NotNull d4.h r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.Z(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.g d1(d4.g r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            d4.g r2 = r1.m(r2, r0)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b
    public boolean e(@org.jetbrains.annotations.NotNull d4.l r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.X(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<d4.p> e0(@org.jetbrains.annotations.NotNull d4.o r1) {
            r0 = this;
            java.util.List r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.q(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.g e1(d4.g r3) {
            r2 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            d4.h r0 = r2.a(r3)
            if (r0 == 0) goto L13
            r1 = 1
            d4.h r0 = r2.c(r0, r1)
            if (r0 == 0) goto L13
            return r0
        L13:
            return r3
    }

    public /* bridge */ /* synthetic */ d4.h f(d4.e r1) {
            r0 = this;
            d4.i r1 = r0.mo34f(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b
    @org.jetbrains.annotations.NotNull
    /* renamed from: f, reason: collision with other method in class */
    public d4.i mo34f(@org.jetbrains.annotations.NotNull d4.e r1) {
            r0 = this;
            d4.i r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.c0(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public d4.g f0(@org.jetbrains.annotations.NotNull d4.b r1) {
            r0 = this;
            d4.g r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.d0(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.i f1(d4.h r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            d4.c r0 = r1.t(r2)
            if (r0 == 0) goto L13
            d4.i r0 = r1.E(r0)
            if (r0 != 0) goto L12
            goto L13
        L12:
            return r0
        L13:
            d4.i r2 = (d4.i) r2
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b
    @org.jetbrains.annotations.NotNull
    public d4.o g(@org.jetbrains.annotations.NotNull d4.h r1) {
            r0 = this;
            d4.o r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.n0(r0, r1)
            return r1
    }

    public int g0(@org.jetbrains.annotations.NotNull d4.k r1) {
            r0 = this;
            int r1 = r0.g1(r1)
            return r1
    }

    public int g1(d4.k r4) {
            r3 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r4 instanceof d4.h
            if (r0 == 0) goto L10
            d4.g r4 = (d4.g) r4
            int r4 = r3.m0(r4)
            return r4
        L10:
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.types.model.ArgumentList
            if (r0 == 0) goto L1b
            kotlin.reflect.jvm.internal.impl.types.model.ArgumentList r4 = (kotlin.reflect.jvm.internal.impl.types.model.ArgumentList) r4
            int r4 = r4.size()
            return r4
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown type argument list type: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", "
            r1.append(r2)
            java.lang.Class r4 = r4.getClass()
            kotlin.reflect.d r4 = kotlin.jvm.internal.o0.d(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public d4.g getType(@org.jetbrains.annotations.NotNull d4.l r1) {
            r0 = this;
            d4.g r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.getType(r0, r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b
    public boolean h(@org.jetbrains.annotations.NotNull d4.h r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.V(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.p h0(@org.jetbrains.annotations.NotNull d4.o r1, int r2) {
            r0 = this;
            d4.p r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.p(r0, r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.o h1(d4.g r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            d4.h r0 = r1.a(r2)
            if (r0 != 0) goto Lf
            d4.h r0 = r1.I(r2)
        Lf:
            d4.o r2 = r1.g(r0)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i2
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType i(@org.jetbrains.annotations.NotNull d4.o r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.s(r0, r1)
            return r1
    }

    public boolean i0(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.Q(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.h i1(d4.g r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            d4.e r0 = r1.X(r2)
            if (r0 == 0) goto L13
            d4.h r0 = r1.d(r0)
            if (r0 != 0) goto L12
            goto L13
        L12:
            return r0
        L13:
            d4.h r2 = r1.a(r2)
            kotlin.jvm.internal.g0.m(r2)
            return r2
    }

    public boolean j(@org.jetbrains.annotations.NotNull d4.h r1, @org.jetbrains.annotations.NotNull d4.h r2) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.C(r0, r1, r2)
            return r1
    }

    public boolean j0(@org.jetbrains.annotations.NotNull d4.o r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.E(r0, r1)
            return r1
    }

    public boolean k(@org.jetbrains.annotations.NotNull d4.p r1, @org.jetbrains.annotations.Nullable d4.o r2) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.B(r0, r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Collection<d4.g> k0(@org.jetbrains.annotations.NotNull d4.o r1) {
            r0 = this;
            java.util.Collection r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.l0(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.k l(@org.jetbrains.annotations.NotNull d4.h r1) {
            r0 = this;
            d4.k r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.c(r0, r1)
            return r1
    }

    public boolean l0(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            boolean r1 = r0.S0(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.g m(@org.jetbrains.annotations.NotNull d4.g r1, boolean r2) {
            r0 = this;
            d4.g r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.e0(r0, r1, r2)
            return r1
    }

    public int m0(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            int r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.b(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public d4.p n(@org.jetbrains.annotations.NotNull d4.w r1) {
            r0 = this;
            d4.p r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.u(r0, r1)
            return r1
    }

    public boolean n0(@org.jetbrains.annotations.NotNull d4.o r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.K(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<d4.l> o(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            java.util.List r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.n(r0, r1)
            return r1
    }

    public boolean o0(@org.jetbrains.annotations.NotNull d4.o r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.H(r0, r1)
            return r1
    }

    public boolean p(@org.jetbrains.annotations.NotNull d4.b r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.R(r0, r1)
            return r1
    }

    public boolean p0(@org.jetbrains.annotations.NotNull d4.h r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.Y(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public d4.l q(@org.jetbrains.annotations.NotNull d4.h r1, int r2) {
            r0 = this;
            d4.l r1 = r0.R0(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.g q0(@org.jetbrains.annotations.NotNull d4.g r1, boolean r2) {
            r0 = this;
            d4.g r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.p0(r0, r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.l r(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            d4.l r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.i(r0, r1)
            return r1
    }

    public boolean r0(@org.jetbrains.annotations.NotNull d4.h r1) {
            r0 = this;
            boolean r1 = r0.a1(r1)
            return r1
    }

    public boolean s(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            boolean r1 = r0.X0(r1)
            return r1
    }

    public boolean s0(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.U(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public d4.c t(@org.jetbrains.annotations.NotNull d4.h r1) {
            r0 = this;
            d4.c r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.e(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.l t0(@org.jetbrains.annotations.NotNull d4.k r1, int r2) {
            r0 = this;
            d4.l r1 = r0.Q0(r1, r2)
            return r1
    }

    public boolean u(@org.jetbrains.annotations.NotNull d4.i r1) {
            r0 = this;
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.S(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.i u0(@org.jetbrains.annotations.NotNull d4.h r1) {
            r0 = this;
            d4.i r1 = r0.f1(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus v(@org.jetbrains.annotations.NotNull d4.b r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.k(r0, r1)
            return r1
    }

    public boolean v0(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            boolean r1 = r0.b1(r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public java.util.List<d4.i> w(@org.jetbrains.annotations.NotNull d4.h r1, @org.jetbrains.annotations.NotNull d4.o r2) {
            r0 = this;
            java.util.List r1 = r0.P0(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Collection<d4.g> w0(@org.jetbrains.annotations.NotNull d4.h r1) {
            r0 = this;
            java.util.Collection r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.i0(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.g x(@org.jetbrains.annotations.NotNull java.util.Collection<? extends d4.g> r1) {
            r0 = this;
            d4.g r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.D(r0, r1)
            return r1
    }

    public boolean x0(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            boolean r1 = r0.T0(r1)
            return r1
    }

    public boolean y(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            boolean r1 = r0.Y0(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.l y0(@org.jetbrains.annotations.NotNull d4.a r1) {
            r0 = this;
            d4.l r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.j0(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b z(@org.jetbrains.annotations.NotNull d4.h r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b r1 = kotlin.reflect.jvm.internal.impl.types.checker.b.a.k0(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public d4.g z0(@org.jetbrains.annotations.NotNull d4.g r1) {
            r0 = this;
            d4.g r1 = r0.d1(r1)
            return r1
    }
}
