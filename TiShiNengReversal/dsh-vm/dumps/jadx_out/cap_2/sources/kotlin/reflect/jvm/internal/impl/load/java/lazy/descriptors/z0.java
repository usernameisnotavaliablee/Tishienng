package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLazyJavaStaticClassScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaStaticClassScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaStaticClassScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,171:1\n1491#2:172\n1516#2,3:173\n1519#2,3:183\n1563#2:192\n1634#2,3:193\n382#3,7:176\n77#4:186\n97#4,5:187\n*S KotlinDebug\n*F\n+ 1 LazyJavaStaticClassScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaStaticClassScope\n*L\n112#1:172\n112#1:173,3\n112#1:183,3\n168#1:192\n168#1:193,3\n112#1:176,7\n114#1:186\n114#1:187,5\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class z0 extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a1 {

    @org.jetbrains.annotations.NotNull
    private final x3.g n;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.c o;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.reflect.jvm.internal.impl.utils.b.AbstractC0078b<kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.n1> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d a;
        final /* synthetic */ java.util.Set<R> b;
        final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.resolve.scopes.k, java.util.Collection<R>> c;

        a(kotlin.reflect.jvm.internal.impl.descriptors.d r1, java.util.Set<R> r2, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.resolve.scopes.k, ? extends java.util.Collection<? extends R>> r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        public /* bridge */ /* synthetic */ java.lang.Object a() {
                r1 = this;
                r1.e()
                kotlin.n1 r0 = kotlin.n1.a
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC0078b, kotlin.reflect.jvm.internal.impl.utils.b.e
        public /* bridge */ /* synthetic */ boolean b(java.lang.Object r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
                boolean r1 = r0.d(r1)
                return r1
        }

        public boolean d(kotlin.reflect.jvm.internal.impl.descriptors.d r3) {
                r2 = this;
                java.lang.String r0 = "current"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.a
                r1 = 1
                if (r3 != r0) goto Lb
                return r1
            Lb:
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r3 = r3.r0()
                java.lang.String r0 = "getStaticScope(...)"
                kotlin.jvm.internal.g0.o(r3, r0)
                boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a1
                if (r0 == 0) goto L27
                java.util.Set<R> r0 = r2.b
                kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.resolve.scopes.k, java.util.Collection<R>> r1 = r2.c
                java.lang.Object r3 = r1.invoke(r3)
                java.util.Collection r3 = (java.util.Collection) r3
                r0.addAll(r3)
                r3 = 0
                return r3
            L27:
                return r1
        }

        public void e() {
                r0 = this;
                return
        }
    }

    public z0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2, @org.jetbrains.annotations.NotNull x3.g r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.descriptors.c r4) {
            r1 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "jClass"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "ownerDescriptor"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>(r2)
            r1.n = r3
            r1.o = r4
            return
    }

    static /* synthetic */ boolean h0(x3.q r0) {
            boolean r0 = n0(r0)
            return r0
    }

    static /* synthetic */ java.util.Collection i0(kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0) {
            java.util.Collection r0 = p0(r0)
            return r0
    }

    static /* synthetic */ java.util.Collection j0(kotlin.reflect.jvm.internal.impl.name.f r0, kotlin.reflect.jvm.internal.impl.resolve.scopes.k r1) {
            java.util.Collection r0 = o0(r0, r1)
            return r0
    }

    static /* synthetic */ java.lang.Iterable k0(kotlin.reflect.jvm.internal.impl.descriptors.d r0) {
            java.lang.Iterable r0 = r0(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d l0(kotlin.reflect.jvm.internal.impl.types.t0 r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = s0(r0)
            return r0
    }

    private static final boolean n0(x3.q r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1.L()
            return r1
    }

    private static final java.util.Collection o0(kotlin.reflect.jvm.internal.impl.name.f r1, kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r0 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_SUPER_MEMBERS
            java.util.Collection r1 = r2.c(r1, r0)
            return r1
    }

    private static final java.util.Collection p0(kotlin.reflect.jvm.internal.impl.resolve.scopes.k r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Set r1 = r1.d()
            return r1
    }

    private final <R> java.util.Set<R> q0(kotlin.reflect.jvm.internal.impl.descriptors.d r4, java.util.Set<R> r5, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.resolve.scopes.k, ? extends java.util.Collection<? extends R>> r6) {
            r3 = this;
            java.util.List r0 = kotlin.collections.f0.l(r4)
            java.util.Collection r0 = (java.util.Collection) r0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.x0 r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.x0.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z0$a r2 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z0$a
            r2.<init>(r4, r5, r6)
            kotlin.reflect.jvm.internal.impl.utils.b.b(r0, r1, r2)
            return r5
    }

    private static final java.lang.Iterable r0(kotlin.reflect.jvm.internal.impl.descriptors.d r1) {
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.o()
            java.util.Collection r1 = r1.i()
            java.lang.String r0 = "getSupertypes(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.sequences.m r1 = kotlin.collections.f0.E1(r1)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.y0 r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.y0.a
            kotlin.sequences.m r1 = kotlin.sequences.p.S1(r1, r0)
            java.lang.Iterable r1 = kotlin.sequences.p.l0(r1)
            return r1
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.d s0(kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.c()
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto Lf
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            return r1
        Lf:
            r1 = 0
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.w0 u0(kotlin.reflect.jvm.internal.impl.descriptors.w0 r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r0 = r3.h()
            boolean r0 = r0.isReal()
            if (r0 == 0) goto Lb
            return r3
        Lb:
            java.util.Collection r3 = r3.e()
            java.lang.String r0 = "getOverriddenDescriptors(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L25:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r3.next()
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r1
            kotlin.jvm.internal.g0.m(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = r2.u0(r1)
            r0.add(r1)
            goto L25
        L3c:
            java.util.List r3 = kotlin.collections.f0.e2(r0)
            java.lang.Object r3 = kotlin.collections.f0.m5(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r3
            return r3
    }

    private final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.d1> v0(kotlin.reflect.jvm.internal.impl.name.f r2, kotlin.reflect.jvm.internal.impl.descriptors.d r3) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z0 r3 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.h.b(r3)
            if (r3 != 0) goto Lb
            java.util.Set r2 = kotlin.collections.u1.k()
            return r2
        Lb:
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r0 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_SUPER_MEMBERS
            java.util.Collection r2 = r3.a(r2, r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Set r2 = kotlin.collections.f0.f6(r2)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c A() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b r0 = r1.m0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    protected void C(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r9) {
            r7 = this;
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r9, r0)
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.c r0 = r7.t0()
            java.util.Set r2 = r7.v0(r9, r0)
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.c r4 = r7.t0()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r7.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r5 = r0.c()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r7.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.types.checker.p r0 = r0.k()
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r6 = r0.b()
            r3 = r8
            r1 = r9
            java.util.Collection r8 = kotlin.reflect.jvm.internal.impl.load.java.components.a.e(r1, r2, r3, r4, r5, r6)
            java.lang.String r9 = "resolveOverridesForStaticMembers(...)"
            kotlin.jvm.internal.g0.o(r8, r9)
            r3.addAll(r8)
            x3.g r8 = r7.n
            boolean r8 = r8.E()
            if (r8 == 0) goto L79
            kotlin.reflect.jvm.internal.impl.name.f r8 = kotlin.reflect.jvm.internal.impl.builtins.o.f
            boolean r8 = kotlin.jvm.internal.g0.g(r1, r8)
            if (r8 == 0) goto L61
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.c r8 = r7.t0()
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r8 = kotlin.reflect.jvm.internal.impl.resolve.h.g(r8)
            java.lang.String r9 = "createEnumValueOfMethod(...)"
            kotlin.jvm.internal.g0.o(r8, r9)
            r3.add(r8)
            return
        L61:
            kotlin.reflect.jvm.internal.impl.name.f r8 = kotlin.reflect.jvm.internal.impl.builtins.o.d
            boolean r8 = kotlin.jvm.internal.g0.g(r1, r8)
            if (r8 == 0) goto L79
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.c r8 = r7.t0()
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r8 = kotlin.reflect.jvm.internal.impl.resolve.h.h(r8)
            java.lang.String r9 = "createEnumValuesMethod(...)"
            kotlin.jvm.internal.g0.o(r8, r9)
            r3.add(r8)
        L79:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a1, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    protected void D(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r10, @org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> r11) {
            r9 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.p(r11, r0)
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.c r0 = r9.t0()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.w0 r2 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.w0
            r2.<init>(r10)
            java.util.Set r4 = r9.q0(r0, r1, r2)
            boolean r0 = r11.isEmpty()
            java.lang.String r1 = "resolveOverridesForStaticMembers(...)"
            if (r0 != 0) goto L54
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.c r6 = r9.t0()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r9.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r7 = r0.c()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r9.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.types.checker.p r0 = r0.k()
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r8 = r0.b()
            r3 = r10
            r5 = r11
            java.util.Collection r10 = kotlin.reflect.jvm.internal.impl.load.java.components.a.e(r3, r4, r5, r6, r7, r8)
            r2 = r3
            r4 = r5
            kotlin.jvm.internal.g0.o(r10, r1)
            r4.addAll(r10)
            goto Ld5
        L54:
            r2 = r10
            r10 = r4
            r4 = r11
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L60:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r0 = r10.next()
            r3 = r0
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r3
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r3 = r9.u0(r3)
            java.lang.Object r5 = r11.get(r3)
            if (r5 != 0) goto L7f
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r11.put(r3, r5)
        L7f:
            java.util.List r5 = (java.util.List) r5
            r5.add(r0)
            goto L60
        L85:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L92:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Ld2
            java.lang.Object r0 = r11.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.c r5 = r9.t0()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r9.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r6 = r0.c()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r9.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.types.checker.p r0 = r0.k()
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r7 = r0.b()
            java.util.Collection r0 = kotlin.reflect.jvm.internal.impl.load.java.components.a.e(r2, r3, r4, r5, r6, r7)
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.f0.s0(r10, r0)
            goto L92
        Ld2:
            r4.addAll(r10)
        Ld5:
            x3.g r10 = r9.n
            boolean r10 = r10.E()
            if (r10 == 0) goto Lf0
            kotlin.reflect.jvm.internal.impl.name.f r10 = kotlin.reflect.jvm.internal.impl.builtins.o.e
            boolean r10 = kotlin.jvm.internal.g0.g(r2, r10)
            if (r10 == 0) goto Lf0
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.c r10 = r9.t0()
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r10 = kotlin.reflect.jvm.internal.impl.resolve.h.f(r10)
            kotlin.reflect.jvm.internal.impl.utils.a.a(r4, r10)
        Lf0:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    @org.jetbrains.annotations.NotNull
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> E(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r2, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r3) {
            r1 = this;
            java.lang.String r3 = "kindFilter"
            kotlin.jvm.internal.g0.p(r2, r3)
            kotlin.reflect.jvm.internal.impl.storage.i r2 = r1.O()
            java.lang.Object r2 = r2.invoke()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c r2 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c) r2
            java.util.Set r2 = r2.d()
            java.util.Set r2 = kotlin.collections.f0.e6(r2)
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.c r3 = r1.t0()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.v0 r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.v0.a
            r1.q0(r3, r2, r0)
            x3.g r3 = r1.n
            boolean r3 = r3.E()
            if (r3 == 0) goto L2d
            kotlin.reflect.jvm.internal.impl.name.f r3 = kotlin.reflect.jvm.internal.impl.builtins.o.e
            r2.add(r3)
        L2d:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k S() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.c r0 = r1.t0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.f g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "location"
            kotlin.jvm.internal.g0.p(r3, r2)
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b m0() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
            x3.g r1 = r3.n
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.u0 r2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.u0.a
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.load.java.descriptors.c t0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.c r0 = r1.o
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    @org.jetbrains.annotations.NotNull
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> w(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r1, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r2) {
            r0 = this;
            java.lang.String r2 = "kindFilter"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.util.Set r1 = kotlin.collections.u1.k()
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    @org.jetbrains.annotations.NotNull
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> y(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r3, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r4) {
            r2 = this;
            java.lang.String r4 = "kindFilter"
            kotlin.jvm.internal.g0.p(r3, r4)
            kotlin.reflect.jvm.internal.impl.storage.i r3 = r2.O()
            java.lang.Object r3 = r3.invoke()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c r3 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c) r3
            java.util.Set r3 = r3.a()
            java.util.Set r3 = kotlin.collections.f0.e6(r3)
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.c r4 = r2.t0()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z0 r4 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.h.b(r4)
            if (r4 == 0) goto L26
            java.util.Set r4 = r4.b()
            goto L27
        L26:
            r4 = 0
        L27:
            if (r4 != 0) goto L2d
            java.util.Set r4 = kotlin.collections.u1.k()
        L2d:
            r3.addAll(r4)
            x3.g r4 = r2.n
            boolean r4 = r4.E()
            if (r4 == 0) goto L4e
            r4 = 2
            kotlin.reflect.jvm.internal.impl.name.f[] r4 = new kotlin.reflect.jvm.internal.impl.name.f[r4]
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.builtins.o.f
            r1 = 0
            r4[r1] = r0
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.builtins.o.d
            r1 = 1
            r4[r1] = r0
            java.util.List r4 = kotlin.collections.f0.Q(r4)
            java.util.Collection r4 = (java.util.Collection) r4
            r3.addAll(r4)
        L4e:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r4 = r2.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r4 = r4.a()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.e r4 = r4.w()
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.c r0 = r2.t0()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = r2.M()
            java.util.List r4 = r4.g(r0, r1)
            java.util.Collection r4 = (java.util.Collection) r4
            r3.addAll(r4)
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    protected void z(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r5) {
            r3 = this;
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r3.M()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.e r0 = r0.w()
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.c r1 = r3.t0()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2 = r3.M()
            r0.e(r1, r5, r4, r2)
            return
    }
}
