package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAbstractTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeConstructor.kt\norg/jetbrains/kotlin/types/AbstractTypeConstructor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class q extends kotlin.reflect.jvm.internal.impl.types.w {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.types.q.b> b;
    private final boolean c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class a implements kotlin.reflect.jvm.internal.impl.types.w1 {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.types.checker.g a;

        @org.jetbrains.annotations.NotNull
        private final kotlin.s b;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.q c;

        public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.q r2, kotlin.reflect.jvm.internal.impl.types.checker.g r3) {
                r1 = this;
                java.lang.String r0 = "kotlinTypeRefiner"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.c = r2
                r1.<init>()
                r1.a = r3
                kotlin.LazyThreadSafetyMode r3 = kotlin.LazyThreadSafetyMode.PUBLICATION
                kotlin.reflect.jvm.internal.impl.types.p r0 = new kotlin.reflect.jvm.internal.impl.types.p
                r0.<init>(r1, r2)
                kotlin.s r2 = kotlin.t.b(r3, r0)
                r1.b = r2
                return
        }

        static /* synthetic */ java.util.List e(kotlin.reflect.jvm.internal.impl.types.q.a r0, kotlin.reflect.jvm.internal.impl.types.q r1) {
                java.util.List r0 = h(r0, r1)
                return r0
        }

        private final java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> f() {
                r1 = this;
                kotlin.s r0 = r1.b
                java.lang.Object r0 = r0.getValue()
                java.util.List r0 = (java.util.List) r0
                return r0
        }

        private static final java.util.List h(kotlin.reflect.jvm.internal.impl.types.q.a r0, kotlin.reflect.jvm.internal.impl.types.q r1) {
                kotlin.reflect.jvm.internal.impl.types.checker.g r0 = r0.a
                java.util.List r1 = r1.w()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.List r0 = kotlin.reflect.jvm.internal.impl.types.checker.h.b(r0, r1)
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w1
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.types.w1 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r2) {
                r1 = this;
                java.lang.String r0 = "kotlinTypeRefiner"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.types.q r0 = r1.c
                kotlin.reflect.jvm.internal.impl.types.w1 r2 = r0.a(r2)
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w1
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.f c() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.types.q r0 = r1.c
                kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.c()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w1
        public boolean d() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.types.q r0 = r1.c
                boolean r0 = r0.d()
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.types.q r0 = r1.c
                boolean r2 = r0.equals(r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> g() {
                r1 = this;
                java.util.List r0 = r1.f()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w1
        @org.jetbrains.annotations.NotNull
        public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> getParameters() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.types.q r0 = r2.c
                java.util.List r0 = r0.getParameters()
                java.lang.String r1 = "getParameters(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                return r0
        }

        public int hashCode() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.types.q r0 = r1.c
                int r0 = r0.hashCode()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w1
        public /* bridge */ /* synthetic */ java.util.Collection i() {
                r1 = this;
                java.util.List r0 = r1.g()
                java.util.Collection r0 = (java.util.Collection) r0
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w1
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.builtins.j p() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.types.q r0 = r2.c
                kotlin.reflect.jvm.internal.impl.builtins.j r0 = r0.p()
                java.lang.String r1 = "getBuiltIns(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.types.q r0 = r1.c
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b {

        @org.jetbrains.annotations.NotNull
        private final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> a;

        @org.jetbrains.annotations.NotNull
        private java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.t0> b;

        public b(@org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.t0> r2) {
                r1 = this;
                java.lang.String r0 = "allSupertypes"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                kotlin.reflect.jvm.internal.impl.types.error.i r2 = kotlin.reflect.jvm.internal.impl.types.error.i.a
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.l()
                java.util.List r2 = kotlin.collections.f0.l(r2)
                r1.b = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> a() {
                r1 = this;
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> r0 = r1.a
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> b() {
                r1 = this;
                java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.t0> r0 = r1.b
                return r0
        }

        public final void c(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.t0> r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.b = r2
                return
        }
    }

    public q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r4) {
            r3 = this;
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r4, r0)
            r3.<init>()
            kotlin.reflect.jvm.internal.impl.types.i r0 = new kotlin.reflect.jvm.internal.impl.types.i
            r0.<init>(r3)
            kotlin.reflect.jvm.internal.impl.types.j r1 = kotlin.reflect.jvm.internal.impl.types.j.a
            kotlin.reflect.jvm.internal.impl.types.k r2 = new kotlin.reflect.jvm.internal.impl.types.k
            r2.<init>(r3)
            kotlin.reflect.jvm.internal.impl.storage.i r4 = r4.b(r0, r1, r2)
            r3.b = r4
            return
    }

    private static final kotlin.reflect.jvm.internal.impl.types.q.b A(kotlin.reflect.jvm.internal.impl.types.q r1) {
            kotlin.reflect.jvm.internal.impl.types.q$b r0 = new kotlin.reflect.jvm.internal.impl.types.q$b
            java.util.Collection r1 = r1.r()
            r0.<init>(r1)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.types.q.b B(boolean r1) {
            kotlin.reflect.jvm.internal.impl.types.q$b r1 = new kotlin.reflect.jvm.internal.impl.types.q$b
            kotlin.reflect.jvm.internal.impl.types.error.i r0 = kotlin.reflect.jvm.internal.impl.types.error.i.a
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.l()
            java.util.List r0 = kotlin.collections.f0.l(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r1.<init>(r0)
            return r1
    }

    private static final kotlin.n1 C(kotlin.reflect.jvm.internal.impl.types.q r5, kotlin.reflect.jvm.internal.impl.types.q.b r6) {
            java.lang.String r0 = "supertypes"
            kotlin.jvm.internal.g0.p(r6, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.h1 r0 = r5.v()
            java.util.Collection r1 = r6.a()
            kotlin.reflect.jvm.internal.impl.types.l r2 = new kotlin.reflect.jvm.internal.impl.types.l
            r2.<init>(r5)
            kotlin.reflect.jvm.internal.impl.types.m r3 = new kotlin.reflect.jvm.internal.impl.types.m
            r3.<init>(r5)
            java.util.Collection r0 = r0.a(r5, r1, r2, r3)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L36
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r5.s()
            if (r0 == 0) goto L2d
            java.util.List r0 = kotlin.collections.f0.l(r0)
            goto L2e
        L2d:
            r0 = r2
        L2e:
            if (r0 != 0) goto L34
            java.util.List r0 = kotlin.collections.f0.J()
        L34:
            java.util.Collection r0 = (java.util.Collection) r0
        L36:
            boolean r1 = r5.u()
            if (r1 == 0) goto L4d
            kotlin.reflect.jvm.internal.impl.descriptors.h1 r1 = r5.v()
            kotlin.reflect.jvm.internal.impl.types.n r3 = new kotlin.reflect.jvm.internal.impl.types.n
            r3.<init>(r5)
            kotlin.reflect.jvm.internal.impl.types.o r4 = new kotlin.reflect.jvm.internal.impl.types.o
            r4.<init>(r5)
            r1.a(r5, r0, r3, r4)
        L4d:
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L54
            r2 = r0
            java.util.List r2 = (java.util.List) r2
        L54:
            if (r2 != 0) goto L5c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r2 = kotlin.collections.f0.a6(r0)
        L5c:
            java.util.List r5 = r5.x(r2)
            r6.c(r5)
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    private static final java.lang.Iterable D(kotlin.reflect.jvm.internal.impl.types.q r1, kotlin.reflect.jvm.internal.impl.types.w1 r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            java.util.Collection r1 = r1.q(r2, r0)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            return r1
    }

    private static final kotlin.n1 E(kotlin.reflect.jvm.internal.impl.types.q r1, kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.z(r2)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final java.lang.Iterable F(kotlin.reflect.jvm.internal.impl.types.q r1, kotlin.reflect.jvm.internal.impl.types.w1 r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 1
            java.util.Collection r1 = r1.q(r2, r0)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            return r1
    }

    private static final kotlin.n1 G(kotlin.reflect.jvm.internal.impl.types.q r1, kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.y(r2)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.q.b h(kotlin.reflect.jvm.internal.impl.types.q r0) {
            kotlin.reflect.jvm.internal.impl.types.q$b r0 = A(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.q.b j(boolean r0) {
            kotlin.reflect.jvm.internal.impl.types.q$b r0 = B(r0)
            return r0
    }

    static /* synthetic */ kotlin.n1 k(kotlin.reflect.jvm.internal.impl.types.q r0, kotlin.reflect.jvm.internal.impl.types.q.b r1) {
            kotlin.n1 r0 = C(r0, r1)
            return r0
    }

    static /* synthetic */ java.lang.Iterable l(kotlin.reflect.jvm.internal.impl.types.q r0, kotlin.reflect.jvm.internal.impl.types.w1 r1) {
            java.lang.Iterable r0 = D(r0, r1)
            return r0
    }

    static /* synthetic */ kotlin.n1 m(kotlin.reflect.jvm.internal.impl.types.q r0, kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            kotlin.n1 r0 = E(r0, r1)
            return r0
    }

    static /* synthetic */ java.lang.Iterable n(kotlin.reflect.jvm.internal.impl.types.q r0, kotlin.reflect.jvm.internal.impl.types.w1 r1) {
            java.lang.Iterable r0 = F(r0, r1)
            return r0
    }

    static /* synthetic */ kotlin.n1 o(kotlin.reflect.jvm.internal.impl.types.q r0, kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            kotlin.n1 r0 = G(r0, r1)
            return r0
    }

    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> q(kotlin.reflect.jvm.internal.impl.types.w1 r3, boolean r4) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.q
            if (r0 == 0) goto L8
            r0 = r3
            kotlin.reflect.jvm.internal.impl.types.q r0 = (kotlin.reflect.jvm.internal.impl.types.q) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L26
            kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.types.q$b> r1 = r0.b
            java.lang.Object r1 = r1.invoke()
            kotlin.reflect.jvm.internal.impl.types.q$b r1 = (kotlin.reflect.jvm.internal.impl.types.q.b) r1
            java.util.Collection r1 = r1.a()
            java.util.Collection r4 = r0.t(r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = kotlin.collections.f0.I4(r1, r4)
            if (r4 == 0) goto L26
            java.util.Collection r4 = (java.util.Collection) r4
            return r4
        L26:
            java.util.Collection r3 = r3.i()
            java.lang.String r4 = "getSupertypes(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.w1 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r2) {
            r1 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.q$a r0 = new kotlin.reflect.jvm.internal.impl.types.q$a
            r0.<init>(r1, r2)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    public /* bridge */ /* synthetic */ java.util.Collection i() {
            r1 = this;
            java.util.List r0 = r1.w()
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected abstract java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> r();

    @org.jetbrains.annotations.Nullable
    protected kotlin.reflect.jvm.internal.impl.types.t0 s() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> t(boolean r1) {
            r0 = this;
            java.util.List r1 = kotlin.collections.f0.J()
            java.util.Collection r1 = (java.util.Collection) r1
            return r1
    }

    protected boolean u() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected abstract kotlin.reflect.jvm.internal.impl.descriptors.h1 v();

    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> w() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.types.q$b> r0 = r1.b
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.types.q$b r0 = (kotlin.reflect.jvm.internal.impl.types.q.b) r0
            java.util.List r0 = r0.b()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> x(@org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> r2) {
            r1 = this;
            java.lang.String r0 = "supertypes"
            kotlin.jvm.internal.g0.p(r2, r0)
            return r2
    }

    protected void y(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }

    protected void z(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }
}
