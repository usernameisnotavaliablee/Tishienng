package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nKTypeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KTypeImpl.kt\nkotlin/reflect/jvm/internal/KTypeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n1#2:137\n1573#3:138\n1604#3,4:139\n*S KotlinDebug\n*F\n+ 1 KTypeImpl.kt\nkotlin/reflect/jvm/internal/KTypeImpl\n*L\n81#1:138\n81#1:139,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class z2 implements kotlin.jvm.internal.h0 {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] e = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.t0 a;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.f3.a<java.lang.reflect.Type> b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.f3.a c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.f3.a d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlin.reflect.jvm.internal.impl.types.Variance[] r0 = kotlin.reflect.jvm.internal.impl.types.Variance.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.reflect.jvm.internal.z2.a.a = r0
                return
        }
    }

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.z2> r1 = kotlin.reflect.jvm.internal.z2.class
            java.lang.String r2 = "classifier"
            java.lang.String r3 = "getClassifier()Lkotlin/reflect/KClassifier;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            kotlin.jvm.internal.PropertyReference1Impl r2 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.String r3 = "arguments"
            java.lang.String r5 = "getArguments()Ljava/util/List;"
            r2.<init>(r1, r3, r5, r4)
            kotlin.reflect.p r1 = kotlin.jvm.internal.o0.u(r2)
            r2 = 2
            kotlin.reflect.n[] r2 = new kotlin.reflect.n[r2]
            r2[r4] = r0
            r0 = 1
            r2[r0] = r1
            kotlin.reflect.jvm.internal.z2.e = r2
            return
    }

    public z2(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<? extends java.lang.reflect.Type> r3) {
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.f3.a
            r0 = 0
            if (r2 == 0) goto L13
            r2 = r3
            kotlin.reflect.jvm.internal.f3$a r2 = (kotlin.reflect.jvm.internal.f3.a) r2
            goto L14
        L13:
            r2 = r0
        L14:
            if (r2 != 0) goto L1d
            if (r3 == 0) goto L1e
            kotlin.reflect.jvm.internal.f3$a r0 = kotlin.reflect.jvm.internal.f3.c(r3)
            goto L1e
        L1d:
            r0 = r2
        L1e:
            r1.b = r0
            kotlin.reflect.jvm.internal.v2 r2 = new kotlin.reflect.jvm.internal.v2
            r2.<init>(r1)
            kotlin.reflect.jvm.internal.f3$a r2 = kotlin.reflect.jvm.internal.f3.c(r2)
            r1.c = r2
            kotlin.reflect.jvm.internal.w2 r2 = new kotlin.reflect.jvm.internal.w2
            r2.<init>(r1, r3)
            kotlin.reflect.jvm.internal.f3$a r2 = kotlin.reflect.jvm.internal.f3.c(r2)
            r1.d = r2
            return
    }

    public /* synthetic */ z2(kotlin.reflect.jvm.internal.impl.types.t0 r1, kotlin.jvm.functions.Function0 r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    private final kotlin.reflect.g E(kotlin.reflect.jvm.internal.impl.types.t0 r4) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r4.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.c()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            r2 = 0
            if (r1 == 0) goto L7e
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            java.lang.Class r0 = kotlin.reflect.jvm.internal.p3.s(r0)
            if (r0 != 0) goto L16
            return r2
        L16:
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L64
            java.util.List r4 = r4.G0()
            java.lang.Object r4 = kotlin.collections.f0.p5(r4)
            kotlin.reflect.jvm.internal.impl.types.c2 r4 = (kotlin.reflect.jvm.internal.impl.types.c2) r4
            if (r4 == 0) goto L5e
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.getType()
            if (r4 != 0) goto L2f
            goto L5e
        L2f:
            kotlin.reflect.g r4 = r3.E(r4)
            if (r4 == 0) goto L47
            kotlin.reflect.jvm.internal.h0 r0 = new kotlin.reflect.jvm.internal.h0
            kotlin.reflect.d r4 = kotlin.reflect.jvm.c.a(r4)
            java.lang.Class r4 = k3.a.e(r4)
            java.lang.Class r4 = kotlin.reflect.jvm.internal.p3.f(r4)
            r0.<init>(r4)
            return r0
        L47:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r4 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot determine classifier for array element type: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L5e:
            kotlin.reflect.jvm.internal.h0 r4 = new kotlin.reflect.jvm.internal.h0
            r4.<init>(r0)
            return r4
        L64:
            boolean r4 = kotlin.reflect.jvm.internal.impl.types.j2.l(r4)
            if (r4 != 0) goto L78
            kotlin.reflect.jvm.internal.h0 r4 = new kotlin.reflect.jvm.internal.h0
            java.lang.Class r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.i(r0)
            if (r1 != 0) goto L73
            goto L74
        L73:
            r0 = r1
        L74:
            r4.<init>(r0)
            return r4
        L78:
            kotlin.reflect.jvm.internal.h0 r4 = new kotlin.reflect.jvm.internal.h0
            r4.<init>(r0)
            return r4
        L7e:
            boolean r4 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            if (r4 == 0) goto L8a
            kotlin.reflect.jvm.internal.b3 r4 = new kotlin.reflect.jvm.internal.b3
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r0
            r4.<init>(r2, r0)
            return r4
        L8a:
            boolean r4 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i1
            if (r4 != 0) goto L8f
            return r2
        L8f:
            kotlin.NotImplementedError r4 = new kotlin.NotImplementedError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "An operation is not implemented: "
            r0.append(r1)
            java.lang.String r1 = "Type alias classifiers are not yet supported"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    static /* synthetic */ kotlin.reflect.g c(kotlin.reflect.jvm.internal.z2 r0) {
            kotlin.reflect.g r0 = t(r0)
            return r0
    }

    static /* synthetic */ java.util.List d(kotlin.reflect.jvm.internal.z2 r0, kotlin.jvm.functions.Function0 r1) {
            java.util.List r0 = j(r0, r1)
            return r0
    }

    static /* synthetic */ java.util.List e(kotlin.reflect.jvm.internal.z2 r0) {
            java.util.List r0 = l(r0)
            return r0
    }

    static /* synthetic */ java.lang.reflect.Type g(kotlin.reflect.jvm.internal.z2 r0, int r1, kotlin.s r2) {
            java.lang.reflect.Type r0 = s(r0, r1, r2)
            return r0
    }

    private static final java.util.List j(kotlin.reflect.jvm.internal.z2 r9, kotlin.jvm.functions.Function0 r10) {
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r9.a
            java.util.List r0 = r0.G0()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L11
            java.util.List r9 = kotlin.collections.f0.J()
            return r9
        L11:
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.PUBLICATION
            kotlin.reflect.jvm.internal.x2 r2 = new kotlin.reflect.jvm.internal.x2
            r2.<init>(r9)
            kotlin.s r1 = kotlin.t.b(r1, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.f0.d0(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
        L2e:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L9a
            java.lang.Object r4 = r0.next()
            int r5 = r3 + 1
            if (r3 >= 0) goto L3f
            kotlin.collections.f0.b0()
        L3f:
            kotlin.reflect.jvm.internal.impl.types.c2 r4 = (kotlin.reflect.jvm.internal.impl.types.c2) r4
            boolean r6 = r4.b()
            if (r6 == 0) goto L4e
            kotlin.reflect.t$a r3 = kotlin.reflect.t.c
            kotlin.reflect.t r3 = r3.c()
            goto L95
        L4e:
            kotlin.reflect.jvm.internal.z2 r6 = new kotlin.reflect.jvm.internal.z2
            kotlin.reflect.jvm.internal.impl.types.t0 r7 = r4.getType()
            java.lang.String r8 = "getType(...)"
            kotlin.jvm.internal.g0.o(r7, r8)
            if (r10 != 0) goto L5d
            r3 = 0
            goto L63
        L5d:
            kotlin.reflect.jvm.internal.y2 r8 = new kotlin.reflect.jvm.internal.y2
            r8.<init>(r9, r3, r1)
            r3 = r8
        L63:
            r6.<init>(r7, r3)
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = r4.c()
            int[] r4 = kotlin.reflect.jvm.internal.z2.a.a
            int r3 = r3.ordinal()
            r3 = r4[r3]
            r4 = 1
            if (r3 == r4) goto L8f
            r4 = 2
            if (r3 == r4) goto L88
            r4 = 3
            if (r3 != r4) goto L82
            kotlin.reflect.t$a r3 = kotlin.reflect.t.c
            kotlin.reflect.t r3 = r3.b(r6)
            goto L95
        L82:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L88:
            kotlin.reflect.t$a r3 = kotlin.reflect.t.c
            kotlin.reflect.t r3 = r3.a(r6)
            goto L95
        L8f:
            kotlin.reflect.t$a r3 = kotlin.reflect.t.c
            kotlin.reflect.t r3 = r3.e(r6)
        L95:
            r2.add(r3)
            r3 = r5
            goto L2e
        L9a:
            return r2
    }

    private static final java.util.List l(kotlin.reflect.jvm.internal.z2 r0) {
            java.lang.reflect.Type r0 = r0.b()
            kotlin.jvm.internal.g0.m(r0)
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.h(r0)
            return r0
    }

    private static final java.util.List<java.lang.reflect.Type> r(kotlin.s<? extends java.util.List<? extends java.lang.reflect.Type>> r0) {
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    private static final java.lang.reflect.Type s(kotlin.reflect.jvm.internal.z2 r2, int r3, kotlin.s<? extends java.util.List<? extends java.lang.reflect.Type>> r4) {
            java.lang.reflect.Type r0 = r2.b()
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto L1b
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L15
            java.lang.Class r2 = r0.getComponentType()
            goto L17
        L15:
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
        L17:
            kotlin.jvm.internal.g0.m(r2)
            return r2
        L1b:
            boolean r1 = r0 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L42
            if (r3 != 0) goto L2b
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            java.lang.reflect.Type r2 = r0.getGenericComponentType()
            kotlin.jvm.internal.g0.m(r2)
            return r2
        L2b:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r3 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Array type has been queried for a non-0th argument: "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        L42:
            boolean r0 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L7c
            java.util.List r2 = r(r4)
            java.lang.Object r2 = r2.get(r3)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            boolean r3 = r2 instanceof java.lang.reflect.WildcardType
            if (r3 != 0) goto L55
            return r2
        L55:
            java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
            java.lang.reflect.Type[] r3 = r2.getLowerBounds()
            java.lang.String r4 = "getLowerBounds(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            java.lang.Object r3 = kotlin.collections.n.Fc(r3)
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            if (r3 != 0) goto L78
            java.lang.reflect.Type[] r2 = r2.getUpperBounds()
            java.lang.String r3 = "getUpperBounds(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            java.lang.Object r2 = kotlin.collections.n.jc(r2)
            r3 = r2
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
        L78:
            kotlin.jvm.internal.g0.m(r3)
            return r3
        L7c:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r3 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Non-generic type has been queried for arguments: "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }

    private static final kotlin.reflect.g t(kotlin.reflect.jvm.internal.z2 r1) {
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.a
            kotlin.reflect.g r1 = r1.E(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.z2 F(boolean r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.a
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.n0.b(r0)
            if (r0 != 0) goto Lf
            boolean r0 = r2.q()
            if (r0 != r3) goto Lf
            return r2
        Lf:
            kotlin.reflect.jvm.internal.z2 r0 = new kotlin.reflect.jvm.internal.z2
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r2.a
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = kotlin.reflect.jvm.internal.impl.types.j2.p(r1, r3)
            java.lang.String r1 = "makeNullableAsSpecified(...)"
            kotlin.jvm.internal.g0.o(r3, r1)
            kotlin.reflect.jvm.internal.f3$a<java.lang.reflect.Type> r1 = r2.b
            r0.<init>(r3, r1)
            return r0
    }

    @Override // kotlin.jvm.internal.h0
    @org.jetbrains.annotations.Nullable
    public java.lang.reflect.Type b() {
            r1 = this;
            kotlin.reflect.jvm.internal.f3$a<java.lang.reflect.Type> r0 = r1.b
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.invoke()
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.z2
            if (r0 == 0) goto L2e
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.a
            kotlin.reflect.jvm.internal.z2 r3 = (kotlin.reflect.jvm.internal.z2) r3
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r3.a
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L2e
            kotlin.reflect.g r0 = r2.n()
            kotlin.reflect.g r1 = r3.n()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L2e
            java.util.List r0 = r2.getArguments()
            java.util.List r3 = r3.getArguments()
            boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
            if (r3 == 0) goto L2e
            r3 = 1
            return r3
        L2e:
            r3 = 0
            return r3
    }

    @Override // kotlin.reflect.b
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.a
            java.util.List r0 = kotlin.reflect.jvm.internal.p3.e(r0)
            return r0
    }

    @Override // kotlin.reflect.r
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.t> getArguments() {
            r3 = this;
            kotlin.reflect.jvm.internal.f3$a r0 = r3.d
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.z2.e
            r2 = 1
            r1 = r1[r2]
            java.lang.Object r0 = r0.b(r3, r1)
            java.lang.String r1 = "getValue(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.t0 getType() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.a
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            kotlin.reflect.g r1 = r2.n()
            if (r1 == 0) goto L13
            int r1 = r1.hashCode()
            goto L14
        L13:
            r1 = 0
        L14:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List r1 = r2.getArguments()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.reflect.r
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.g n() {
            r3 = this;
            kotlin.reflect.jvm.internal.f3$a r0 = r3.c
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.z2.e
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = r0.b(r3, r1)
            kotlin.reflect.g r0 = (kotlin.reflect.g) r0
            return r0
    }

    @Override // kotlin.reflect.r
    public boolean q() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.a
            boolean r0 = r0.J0()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            kotlin.reflect.jvm.internal.j3 r0 = kotlin.reflect.jvm.internal.j3.a
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r2.a
            java.lang.String r0 = r0.l(r1)
            return r0
    }
}
