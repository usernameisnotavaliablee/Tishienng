package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class k0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.n a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.f0 b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.descriptors.l0> c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.descriptors.k0.a, kotlin.reflect.jvm.internal.impl.descriptors.d> d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.name.b a;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.Integer> b;

        public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> r3) {
                r1 = this;
                java.lang.String r0 = "classId"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "typeParametersCount"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.<init>()
                r1.a = r2
                r1.b = r3
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.name.b a() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.name.b r0 = r1.a
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.Integer> b() {
                r1 = this;
                java.util.List<java.lang.Integer> r0 = r1.b
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.k0.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.descriptors.k0$a r5 = (kotlin.reflect.jvm.internal.impl.descriptors.k0.a) r5
                kotlin.reflect.jvm.internal.impl.name.b r1 = r4.a
                kotlin.reflect.jvm.internal.impl.name.b r3 = r5.a
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.util.List<java.lang.Integer> r1 = r4.b
                java.util.List<java.lang.Integer> r5 = r5.b
                boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public int hashCode() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.name.b r0 = r2.a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.util.List<java.lang.Integer> r1 = r2.b
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ClassRequest(classId="
                r0.append(r1)
                kotlin.reflect.jvm.internal.impl.name.b r1 = r2.a
                r0.append(r1)
                java.lang.String r1 = ", typeParametersCount="
                r0.append(r1)
                java.util.List<java.lang.Integer> r1 = r2.b
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nNotFoundClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotFoundClasses.kt\norg/jetbrains/kotlin/descriptors/NotFoundClasses$MockClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1563#2:101\n1634#2,3:102\n*S KotlinDebug\n*F\n+ 1 NotFoundClasses.kt\norg/jetbrains/kotlin/descriptors/NotFoundClasses$MockClassDescriptor\n*L\n55#1:101\n55#1:102,3\n*E\n"})
    public static final class b extends kotlin.reflect.jvm.internal.impl.descriptors.impl.j {
        private final boolean j;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> k;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.types.v l;

        public b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r12, boolean r13, int r14) {
                r9 = this;
                java.lang.String r0 = "storageManager"
                kotlin.jvm.internal.g0.p(r10, r0)
                java.lang.String r0 = "container"
                kotlin.jvm.internal.g0.p(r11, r0)
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r12, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r4 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
                r5 = 0
                r0 = r9
                r1 = r10
                r2 = r11
                r3 = r12
                r0.<init>(r1, r2, r3, r4, r5)
                r9.j = r13
                r1 = 0
                kotlin.ranges.m r1 = kotlin.ranges.t.W1(r1, r14)
                java.util.ArrayList r7 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.collections.f0.d0(r1, r2)
                r7.<init>(r2)
                java.util.Iterator r8 = r1.iterator()
            L2f:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L64
                r1 = r8
                kotlin.collections.d1 r1 = (kotlin.collections.d1) r1
                int r5 = r1.nextInt()
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r1.b()
                kotlin.reflect.jvm.internal.impl.types.Variance r3 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r4 = 84
                r2.append(r4)
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.name.f.h(r2)
                r2 = 0
                r0 = r9
                r6 = r10
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.t0.M0(r0, r1, r2, r3, r4, r5, r6)
                r7.add(r1)
                goto L2f
            L64:
                r9.k = r7
                kotlin.reflect.jvm.internal.impl.types.v r1 = new kotlin.reflect.jvm.internal.impl.types.v
                java.util.List r2 = kotlin.reflect.jvm.internal.impl.descriptors.n1.g(r9)
                kotlin.reflect.jvm.internal.impl.descriptors.f0 r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.s(r9)
                kotlin.reflect.jvm.internal.impl.builtins.j r3 = r3.p()
                kotlin.reflect.jvm.internal.impl.types.e1 r3 = r3.i()
                java.util.Set r3 = kotlin.collections.u1.f(r3)
                r1.<init>(r9, r2, r3, r10)
                r9.l = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.resolve.scopes.k.c F0() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k$c r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.k.c.b
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.types.v G0() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.types.v r0 = r1.l
                return r0
        }

        @org.jetbrains.annotations.NotNull
        protected kotlin.reflect.jvm.internal.impl.resolve.scopes.k.c H0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r2) {
                r1 = this;
                java.lang.String r0 = "kotlinTypeRefiner"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k$c r2 = kotlin.reflect.jvm.internal.impl.resolve.scopes.k.c.b
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
        @org.jetbrains.annotations.NotNull
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> f() {
                r1 = this;
                java.util.Set r0 = kotlin.collections.u1.k()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.descriptors.o1<kotlin.reflect.jvm.internal.impl.types.e1> g0() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.b()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.c0, kotlin.reflect.jvm.internal.impl.descriptors.o
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.s r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.e
                java.lang.String r1 = "PUBLIC"
                kotlin.jvm.internal.g0.o(r0, r1)
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.ClassKind h() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.c0
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

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.c0
        public boolean isExternal() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
        public boolean isInline() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.g
        public boolean k() {
                r1 = this;
                boolean r0 = r1.j
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
        public boolean l0() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.w1 o() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.types.v r0 = r1.G0()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.k o0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k$c r1 = r0.H0(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
        public boolean q0() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k$c r0 = r1.F0()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.descriptors.d s0() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.g
        @org.jetbrains.annotations.NotNull
        public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> t() {
                r1 = this;
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r0 = r1.k
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "class "
                r0.append(r1)
                kotlin.reflect.jvm.internal.impl.name.f r1 = r2.getName()
                r0.append(r1)
                java.lang.String r1 = " (not found)"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
        public boolean u() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
        public boolean v() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
        public boolean w() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.descriptors.c z() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    public k0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r3) {
            r1 = this;
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            kotlin.reflect.jvm.internal.impl.descriptors.i0 r3 = new kotlin.reflect.jvm.internal.impl.descriptors.i0
            r3.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.g r3 = r2.i(r3)
            r1.c = r3
            kotlin.reflect.jvm.internal.impl.descriptors.j0 r3 = new kotlin.reflect.jvm.internal.impl.descriptors.j0
            r3.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.g r2 = r2.i(r3)
            r1.d = r2
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.l0 a(kotlin.reflect.jvm.internal.impl.descriptors.k0 r0, kotlin.reflect.jvm.internal.impl.name.c r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r0 = e(r0, r1)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d b(kotlin.reflect.jvm.internal.impl.descriptors.k0 r0, kotlin.reflect.jvm.internal.impl.descriptors.k0.a r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = c(r0, r1)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.d c(kotlin.reflect.jvm.internal.impl.descriptors.k0 r8, kotlin.reflect.jvm.internal.impl.descriptors.k0.a r9) {
            java.lang.String r0 = "<destruct>"
            kotlin.jvm.internal.g0.p(r9, r0)
            kotlin.reflect.jvm.internal.impl.name.b r0 = r9.a()
            java.util.List r9 = r9.b()
            boolean r1 = r0.i()
            if (r1 != 0) goto L56
            kotlin.reflect.jvm.internal.impl.name.b r1 = r0.e()
            if (r1 == 0) goto L29
            r2 = r9
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 1
            java.util.List r2 = kotlin.collections.f0.g2(r2, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r8.d(r1, r2)
            if (r1 == 0) goto L29
        L27:
            r4 = r1
            goto L36
        L29:
            kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.descriptors.l0> r1 = r8.c
            kotlin.reflect.jvm.internal.impl.name.c r2 = r0.f()
            java.lang.Object r1 = r1.invoke(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.e r1 = (kotlin.reflect.jvm.internal.impl.descriptors.e) r1
            goto L27
        L36:
            boolean r6 = r0.j()
            kotlin.reflect.jvm.internal.impl.descriptors.k0$b r2 = new kotlin.reflect.jvm.internal.impl.descriptors.k0$b
            kotlin.reflect.jvm.internal.impl.storage.n r3 = r8.a
            kotlin.reflect.jvm.internal.impl.name.f r5 = r0.h()
            java.lang.Object r8 = kotlin.collections.f0.L2(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L50
            int r8 = r8.intValue()
            r7 = r8
            goto L52
        L50:
            r8 = 0
            r7 = 0
        L52:
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L56:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "Unresolved local class: "
            r9.append(r1)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.l0 e(kotlin.reflect.jvm.internal.impl.descriptors.k0 r1, kotlin.reflect.jvm.internal.impl.name.c r2) {
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.p r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.p
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r1 = r1.b
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.d d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r3, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> r4) {
            r2 = this;
            java.lang.String r0 = "classId"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "typeParametersCount"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.descriptors.k0$a, kotlin.reflect.jvm.internal.impl.descriptors.d> r0 = r2.d
            kotlin.reflect.jvm.internal.impl.descriptors.k0$a r1 = new kotlin.reflect.jvm.internal.impl.descriptors.k0$a
            r1.<init>(r3, r4)
            java.lang.Object r3 = r0.invoke(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r3
            return r3
    }
}
