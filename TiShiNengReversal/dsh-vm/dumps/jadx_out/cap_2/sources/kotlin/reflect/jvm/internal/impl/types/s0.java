package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nIntersectionTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt\n+ 5 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt$transformComponents$1\n*L\n1#1,120:1\n1#2:121\n1056#3:122\n1563#3:129\n1634#3,2:130\n1636#3:139\n98#4,6:123\n104#4:132\n105#4,5:134\n112#4,7:140\n99#5:133\n*S KotlinDebug\n*F\n+ 1 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructor\n*L\n66#1:122\n89#1:129\n89#1:130,2\n89#1:139\n89#1:123,6\n89#1:132\n89#1:134,5\n89#1:140,7\n89#1:133\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class s0 implements kotlin.reflect.jvm.internal.impl.types.w1, d4.f {

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.types.t0 a;

    @org.jetbrains.annotations.NotNull
    private final java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.types.t0> b;
    private final int c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructor\n*L\n1#1,328:1\n66#2:329\n*E\n"})
    public static final class a<T> implements java.util.Comparator {
        final /* synthetic */ kotlin.jvm.functions.Function1 a;

        public a(kotlin.jvm.functions.Function1 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r2, T r3) {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
                kotlin.jvm.functions.Function1 r0 = r1.a
                kotlin.jvm.internal.g0.m(r2)
                java.lang.Object r2 = r0.invoke(r2)
                java.lang.String r2 = r2.toString()
                kotlin.reflect.jvm.internal.impl.types.t0 r3 = (kotlin.reflect.jvm.internal.impl.types.t0) r3
                kotlin.jvm.functions.Function1 r0 = r1.a
                kotlin.jvm.internal.g0.m(r3)
                java.lang.Object r3 = r0.invoke(r3)
                java.lang.String r3 = r3.toString()
                int r2 = kotlin.comparisons.a.l(r2, r3)
                return r2
        }
    }

    public s0(@org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.t0> r2) {
            r1 = this;
            java.lang.String r0 = "typesToIntersect"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r2.isEmpty()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r2)
            r1.b = r0
            int r2 = r0.hashCode()
            r1.c = r2
            return
    }

    private s0(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.t0> r1, kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r0 = this;
            r0.<init>(r1)
            r0.a = r2
            return
    }

    static /* synthetic */ java.lang.CharSequence e(kotlin.jvm.functions.Function1 r0, kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.CharSequence r0 = q(r0, r1)
            return r0
    }

    static /* synthetic */ java.lang.String f(kotlin.reflect.jvm.internal.impl.types.t0 r0) {
            java.lang.String r0 = o(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 g(kotlin.reflect.jvm.internal.impl.types.s0 r0, kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = k(r0, r1)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.types.e1 k(kotlin.reflect.jvm.internal.impl.types.s0 r1, kotlin.reflect.jvm.internal.impl.types.checker.g r2) {
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.s0 r1 = r1.r(r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.j()
            return r1
    }

    public static /* synthetic */ java.lang.String n(kotlin.reflect.jvm.internal.impl.types.s0 r0, kotlin.jvm.functions.Function1 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            kotlin.reflect.jvm.internal.impl.types.q0 r1 = kotlin.reflect.jvm.internal.impl.types.q0.a
        L6:
            java.lang.String r0 = r0.m(r1)
            return r0
    }

    private static final java.lang.String o(kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r1 = r1.toString()
            return r1
    }

    private static final java.lang.CharSequence q(kotlin.jvm.functions.Function1 r0, kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            kotlin.jvm.internal.g0.m(r1)
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.w1 a(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.s0 r1 = r0.r(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.f c() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    public boolean d() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.s0
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.types.t0> r0 = r1.b
            kotlin.reflect.jvm.internal.impl.types.s0 r2 = (kotlin.reflect.jvm.internal.impl.types.s0) r2
            java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.types.t0> r2 = r2.b
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> getParameters() {
            r1 = this;
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.k h() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.x$a r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.x.d
            java.lang.String r1 = "member scope for intersection type"
            java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.types.t0> r2 = r3.b
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r0.a(r1, r2)
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> i() {
            r1 = this;
            java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.types.t0> r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.e1 j() {
            r7 = this;
            kotlin.reflect.jvm.internal.impl.types.t1$a r0 = kotlin.reflect.jvm.internal.impl.types.t1.b
            kotlin.reflect.jvm.internal.impl.types.t1 r1 = r0.k()
            java.util.List r3 = kotlin.collections.f0.J()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r5 = r7.h()
            kotlin.reflect.jvm.internal.impl.types.r0 r6 = new kotlin.reflect.jvm.internal.impl.types.r0
            r6.<init>(r7)
            r4 = 0
            r2 = r7
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.types.w0.p(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.types.t0 l() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String m(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.t0, ? extends java.lang.Object> r11) {
            r10 = this;
            java.lang.String r0 = "getProperTypeRelatedToStringify"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.types.t0> r0 = r10.b
            kotlin.reflect.jvm.internal.impl.types.s0$a r1 = new kotlin.reflect.jvm.internal.impl.types.s0$a
            r1.<init>(r11)
            java.util.List r0 = kotlin.collections.f0.z5(r0, r1)
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.reflect.jvm.internal.impl.types.p0 r7 = new kotlin.reflect.jvm.internal.impl.types.p0
            r7.<init>(r11)
            r8 = 24
            r9 = 0
            java.lang.String r2 = " & "
            java.lang.String r3 = "{"
            java.lang.String r4 = "}"
            r5 = 0
            r6 = 0
            java.lang.String r11 = kotlin.collections.f0.r3(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.builtins.j p() {
            r2 = this;
            java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.types.t0> r0 = r2.b
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.I0()
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = r0.p()
            java.lang.String r1 = "getBuiltIns(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.s0 r(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r5) {
            r4 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Collection r0 = r4.i()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L1b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.K0(r5)
            r1.add(r2)
            r2 = 1
            goto L1b
        L30:
            r0 = 0
            if (r2 != 0) goto L34
            goto L47
        L34:
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r4.l()
            if (r2 == 0) goto L3e
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.K0(r5)
        L3e:
            kotlin.reflect.jvm.internal.impl.types.s0 r5 = new kotlin.reflect.jvm.internal.impl.types.s0
            r5.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.s0 r0 = r5.s(r0)
        L47:
            if (r0 != 0) goto L4a
            return r4
        L4a:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.s0 s(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.s0 r0 = new kotlin.reflect.jvm.internal.impl.types.s0
            java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.types.t0> r1 = r2.b
            r0.<init>(r1, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            r0 = 0
            r1 = 1
            java.lang.String r0 = n(r2, r0, r1, r0)
            return r0
    }
}
