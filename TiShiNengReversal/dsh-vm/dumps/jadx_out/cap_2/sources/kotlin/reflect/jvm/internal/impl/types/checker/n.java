package kotlin.reflect.jvm.internal.impl.types.checker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nNewCapturedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,290:1\n1563#2:291\n1634#2,3:292\n*S KotlinDebug\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeConstructor\n*L\n271#1:291\n271#1:292,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n implements kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.c2 a;

    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.m2>> b;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.types.checker.n c;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.descriptors.j1 d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s e;

    public n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.c2 r9, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.m2> r10, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.checker.n r11) {
            r8 = this;
            java.lang.String r0 = "projection"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "supertypes"
            kotlin.jvm.internal.g0.p(r10, r0)
            kotlin.reflect.jvm.internal.impl.types.checker.k r3 = new kotlin.reflect.jvm.internal.impl.types.checker.k
            r3.<init>(r10)
            r6 = 8
            r7 = 0
            r5 = 0
            r1 = r8
            r2 = r9
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
    }

    public /* synthetic */ n(kotlin.reflect.jvm.internal.impl.types.c2 r1, java.util.List r2, kotlin.reflect.jvm.internal.impl.types.checker.n r3, int r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.<init>(r1, r2, r3)
            return
    }

    public n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.c2 r2, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.m2>> r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.checker.n r4, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.j1 r5) {
            r1 = this;
            java.lang.String r0 = "projection"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            kotlin.LazyThreadSafetyMode r2 = kotlin.LazyThreadSafetyMode.PUBLICATION
            kotlin.reflect.jvm.internal.impl.types.checker.j r3 = new kotlin.reflect.jvm.internal.impl.types.checker.j
            r3.<init>(r1)
            kotlin.s r2 = kotlin.t.b(r2, r3)
            r1.e = r2
            return
    }

    public /* synthetic */ n(kotlin.reflect.jvm.internal.impl.types.c2 r2, kotlin.jvm.functions.Function0 r3, kotlin.reflect.jvm.internal.impl.types.checker.n r4, kotlin.reflect.jvm.internal.impl.descriptors.j1 r5, int r6, kotlin.jvm.internal.v r7) {
            r1 = this;
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L6
            r3 = r0
        L6:
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            r4 = r0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            r5 = r0
        L10:
            r1.<init>(r2, r3, r4, r5)
            return
    }

    private static final java.util.List e(java.util.List r0) {
            return r0
    }

    private static final java.util.List f(kotlin.reflect.jvm.internal.impl.types.checker.n r0) {
            kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.m2>> r0 = r0.b
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.invoke()
            java.util.List r0 = (java.util.List) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    static /* synthetic */ java.util.List g(kotlin.reflect.jvm.internal.impl.types.checker.n r0) {
            java.util.List r0 = f(r0)
            return r0
    }

    static /* synthetic */ java.util.List h(java.util.List r0) {
            java.util.List r0 = e(r0)
            return r0
    }

    static /* synthetic */ java.util.List j(java.util.List r0) {
            java.util.List r0 = o(r0)
            return r0
    }

    static /* synthetic */ java.util.List k(kotlin.reflect.jvm.internal.impl.types.checker.n r0, kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            java.util.List r0 = r(r0, r1)
            return r0
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.m2> m() {
            r1 = this;
            kotlin.s r0 = r1.e
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    private static final java.util.List o(java.util.List r0) {
            return r0
    }

    private static final java.util.List r(kotlin.reflect.jvm.internal.impl.types.checker.n r2, kotlin.reflect.jvm.internal.impl.types.checker.g r3) {
            java.util.List r2 = r2.l()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r2, r1)
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r2.next()
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = (kotlin.reflect.jvm.internal.impl.types.m2) r1
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = r1.N0(r3)
            r0.add(r1)
            goto L15
        L29:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.w1 a(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.checker.n r1 = r0.q(r1)
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

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            if (r5 == 0) goto Lb
            java.lang.Class r1 = r5.getClass()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.Class<kotlin.reflect.jvm.internal.impl.types.checker.n> r2 = kotlin.reflect.jvm.internal.impl.types.checker.n.class
            boolean r1 = kotlin.jvm.internal.g0.g(r2, r1)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor"
            kotlin.jvm.internal.g0.n(r5, r1)
            r1 = r5
            kotlin.reflect.jvm.internal.impl.types.checker.n r1 = (kotlin.reflect.jvm.internal.impl.types.checker.n) r1
            kotlin.reflect.jvm.internal.impl.types.checker.n r3 = r4.c
            if (r3 != 0) goto L23
            r3 = r4
        L23:
            kotlin.reflect.jvm.internal.impl.types.checker.n r1 = r1.c
            if (r1 != 0) goto L28
            goto L29
        L28:
            r5 = r1
        L29:
            if (r3 != r5) goto L2c
            return r0
        L2c:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> getParameters() {
            r1 = this;
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.c2 getProjection() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.c2 r0 = r1.a
            return r0
    }

    public int hashCode() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.checker.n r0 = r1.c
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            return r0
        L9:
            int r0 = super.hashCode()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    public /* bridge */ /* synthetic */ java.util.Collection i() {
            r1 = this;
            java.util.List r0 = r1.l()
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.m2> l() {
            r1 = this;
            java.util.List r0 = r1.m()
            if (r0 != 0) goto La
            java.util.List r0 = kotlin.collections.f0.J()
        La:
            return r0
    }

    public final void n(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.m2> r2) {
            r1 = this;
            java.lang.String r0 = "supertypes"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.checker.l r0 = new kotlin.reflect.jvm.internal.impl.types.checker.l
            r0.<init>(r2)
            r1.b = r0
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.builtins.j p() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.c2 r0 = r2.getProjection()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
            java.lang.String r1 = "getType(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.o(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.checker.n q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r5) {
            r4 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.types.c2 r0 = r4.getProjection()
            kotlin.reflect.jvm.internal.impl.types.c2 r0 = r0.a(r5)
            java.lang.String r1 = "refine(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.m2>> r1 = r4.b
            if (r1 == 0) goto L1c
            kotlin.reflect.jvm.internal.impl.types.checker.m r1 = new kotlin.reflect.jvm.internal.impl.types.checker.m
            r1.<init>(r4, r5)
            goto L1d
        L1c:
            r1 = 0
        L1d:
            kotlin.reflect.jvm.internal.impl.types.checker.n r5 = r4.c
            if (r5 != 0) goto L22
            r5 = r4
        L22:
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = r4.d
            kotlin.reflect.jvm.internal.impl.types.checker.n r3 = new kotlin.reflect.jvm.internal.impl.types.checker.n
            r3.<init>(r0, r1, r5, r2)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CapturedType("
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = r2.getProjection()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
