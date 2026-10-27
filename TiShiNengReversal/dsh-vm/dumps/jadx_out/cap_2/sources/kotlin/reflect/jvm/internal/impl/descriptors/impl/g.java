package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAbstractTypeAliasDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeAliasDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/AbstractTypeAliasDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1617#2,9:130\n1869#2:139\n1870#2:141\n1626#2:142\n1#3:140\n*S KotlinDebug\n*F\n+ 1 AbstractTypeAliasDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/AbstractTypeAliasDescriptor\n*L\n69#1:130,9\n69#1:139\n69#1:141\n69#1:142\n69#1:140\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class g extends kotlin.reflect.jvm.internal.impl.descriptors.impl.n implements kotlin.reflect.jvm.internal.impl.descriptors.i1 {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] j = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.n e;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.s f;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i g;
    private java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> h;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.impl.g.a i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements kotlin.reflect.jvm.internal.impl.types.w1 {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.g a;

        a(kotlin.reflect.jvm.internal.impl.descriptors.impl.g r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w1
        public kotlin.reflect.jvm.internal.impl.types.w1 a(kotlin.reflect.jvm.internal.impl.types.checker.g r2) {
                r1 = this;
                java.lang.String r0 = "kotlinTypeRefiner"
                kotlin.jvm.internal.g0.p(r2, r0)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w1
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f c() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = r1.e()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w1
        public boolean d() {
                r1 = this;
                r0 = 1
                return r0
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.i1 e() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.g r0 = r1.a
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w1
        public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> getParameters() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.g r0 = r1.a
                java.util.List r0 = r0.M0()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w1
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> i() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = r2.e()
                kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.y0()
                kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.I0()
                java.util.Collection r0 = r0.i()
                java.lang.String r1 = "getSupertypes(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w1
        public kotlin.reflect.jvm.internal.impl.builtins.j p() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = r1.e()
                kotlin.reflect.jvm.internal.impl.builtins.j r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.m(r0)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "[typealias "
                r0.append(r1)
                kotlin.reflect.jvm.internal.impl.descriptors.i1 r1 = r2.e()
                kotlin.reflect.jvm.internal.impl.name.f r1 = r1.getName()
                java.lang.String r1 = r1.b()
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.impl.g> r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.g.class
            java.lang.String r2 = "constructors"
            java.lang.String r3 = "getConstructors()Ljava/util/Collection;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            r1 = 1
            kotlin.reflect.n[] r1 = new kotlin.reflect.n[r1]
            r1[r4] = r0
            kotlin.reflect.jvm.internal.impl.descriptors.impl.g.j = r1
            return
    }

    public g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r7) {
            r1 = this;
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "sourceElement"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "visibilityImpl"
            kotlin.jvm.internal.g0.p(r7, r0)
            r1.<init>(r3, r4, r5, r6)
            r1.e = r2
            r1.f = r7
            kotlin.reflect.jvm.internal.impl.descriptors.impl.d r3 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.d
            r3.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.i r2 = r2.e(r3)
            r1.g = r2
            kotlin.reflect.jvm.internal.impl.descriptors.impl.g$a r2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.g$a
            r2.<init>(r1)
            r1.i = r2
            return
    }

    static /* synthetic */ java.util.Collection E0(kotlin.reflect.jvm.internal.impl.descriptors.impl.g r0) {
            java.util.Collection r0 = J0(r0)
            return r0
    }

    static /* synthetic */ java.lang.Boolean F0(kotlin.reflect.jvm.internal.impl.descriptors.impl.g r0, kotlin.reflect.jvm.internal.impl.types.m2 r1) {
            java.lang.Boolean r0 = O0(r0, r1)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 G0(kotlin.reflect.jvm.internal.impl.descriptors.impl.g r0, kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = I0(r0, r1)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.types.e1 I0(kotlin.reflect.jvm.internal.impl.descriptors.impl.g r0, kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r1.f(r0)
            if (r0 == 0) goto Lb
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.s()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    private static final java.util.Collection J0(kotlin.reflect.jvm.internal.impl.descriptors.impl.g r0) {
            java.util.Collection r0 = r0.L0()
            return r0
    }

    private static final java.lang.Boolean O0(kotlin.reflect.jvm.internal.impl.descriptors.impl.g r1, kotlin.reflect.jvm.internal.impl.types.m2 r2) {
            kotlin.jvm.internal.g0.m(r2)
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.x0.a(r2)
            if (r0 != 0) goto L23
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r2.c()
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            if (r0 == 0) goto L23
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r2
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r2.b()
            boolean r1 = kotlin.jvm.internal.g0.g(r2, r1)
            if (r1 != 0) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    protected final kotlin.reflect.jvm.internal.impl.types.e1 H0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.m()
            if (r0 == 0) goto Lc
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r0.H()
            if (r0 != 0) goto Le
        Lc:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k$c r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.k.c.b
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.f
            r1.<init>(r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.types.j2.u(r2, r0, r1)
            java.lang.String r1 = "makeUnsubstitutedType(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.i1 K0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.n r0 = super.p0()
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor"
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.i1) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.impl.q0> L0() {
            r5 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r5.m()
            if (r0 != 0) goto Ld
            java.util.List r0 = kotlin.collections.f0.J()
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
        Ld:
            java.util.Collection r0 = r0.f()
            java.lang.String r1 = "getConstructors(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.c r2 = (kotlin.reflect.jvm.internal.impl.descriptors.c) r2
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s0$a r3 = kotlin.reflect.jvm.internal.impl.descriptors.impl.s0.I
            kotlin.reflect.jvm.internal.impl.storage.n r4 = r5.e
            kotlin.jvm.internal.g0.m(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 r2 = r3.b(r4, r5, r2)
            if (r2 == 0) goto L21
            r1.add(r2)
            goto L21
        L3e:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    protected abstract java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> M0();

    public final void N0(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r2) {
            r1 = this;
            java.lang.String r0 = "declaredTypeParameters"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.h = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R W(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> r2, D r3) {
            r1 = this;
            java.lang.String r0 = "visitor"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object r2 = r2.i(r1, r3)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = r1.K0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = r1.K0()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected final kotlin.reflect.jvm.internal.impl.storage.n d0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r1.e
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0, kotlin.reflect.jvm.internal.impl.descriptors.o
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = r1.f
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality i() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean i0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean isExternal() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g
    public boolean k() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.y0()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.e r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.e
            r1.<init>(r2)
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.j2.c(r0, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.w1 o() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.g$a r0 = r1.i
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.n p0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = r1.K0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean q0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> t() {
            r1 = this;
            java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r0 = r1.h
            if (r0 != 0) goto La
            java.lang.String r0 = "declaredTypeParametersImpl"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        La:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "typealias "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.name.f r1 = r2.getName()
            java.lang.String r1 = r1.b()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
