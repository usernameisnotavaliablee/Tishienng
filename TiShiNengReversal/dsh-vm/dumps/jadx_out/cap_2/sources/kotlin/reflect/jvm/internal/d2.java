package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nKParameterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KParameterImpl.kt\nkotlin/reflect/jvm/internal/KParameterImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,113:1\n1#2:114\n37#3:115\n36#3,3:116\n37#3:119\n36#3,3:120\n*S KotlinDebug\n*F\n+ 1 KParameterImpl.kt\nkotlin/reflect/jvm/internal/KParameterImpl\n*L\n89#1:115\n89#1:116,3\n92#1:119\n92#1:120,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d2 implements kotlin.reflect.KParameter {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] f = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.e0<?> a;
    private final int b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.KParameter.Kind c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.f3.a d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.f3.a e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a implements java.lang.reflect.Type {

        @org.jetbrains.annotations.NotNull
        private final java.lang.reflect.Type[] a;
        private final int b;

        public a(@org.jetbrains.annotations.NotNull java.lang.reflect.Type[] r2) {
                r1 = this;
                java.lang.String r0 = "types"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                int r2 = java.util.Arrays.hashCode(r2)
                r1.b = r2
                return
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.d2.a
                if (r0 == 0) goto L12
                java.lang.reflect.Type[] r0 = r1.a
                kotlin.reflect.jvm.internal.d2$a r2 = (kotlin.reflect.jvm.internal.d2.a) r2
                java.lang.reflect.Type[] r2 = r2.a
                boolean r2 = java.util.Arrays.equals(r0, r2)
                if (r2 == 0) goto L12
                r2 = 1
                return r2
            L12:
                r2 = 0
                return r2
        }

        @Override // java.lang.reflect.Type
        @org.jetbrains.annotations.NotNull
        public java.lang.String getTypeName() {
                r9 = this;
                java.lang.reflect.Type[] r0 = r9.a
                r7 = 56
                r8 = 0
                java.lang.String r1 = ", "
                java.lang.String r2 = "["
                java.lang.String r3 = "]"
                r4 = 0
                r5 = 0
                r6 = 0
                java.lang.String r0 = kotlin.collections.n.Eh(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                return r0
        }

        public int hashCode() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.getTypeName()
                return r0
        }
    }

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.d2> r1 = kotlin.reflect.jvm.internal.d2.class
            java.lang.String r2 = "descriptor"
            java.lang.String r3 = "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            kotlin.jvm.internal.PropertyReference1Impl r2 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.String r3 = "annotations"
            java.lang.String r5 = "getAnnotations()Ljava/util/List;"
            r2.<init>(r1, r3, r5, r4)
            kotlin.reflect.p r1 = kotlin.jvm.internal.o0.u(r2)
            r2 = 2
            kotlin.reflect.n[] r2 = new kotlin.reflect.n[r2]
            r2[r4] = r0
            r0 = 1
            r2[r0] = r1
            kotlin.reflect.jvm.internal.d2.f = r2
            return
    }

    public d2(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.e0<?> r2, int r3, @org.jetbrains.annotations.NotNull kotlin.reflect.KParameter.Kind r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends kotlin.reflect.jvm.internal.impl.descriptors.t0> r5) {
            r1 = this;
            java.lang.String r0 = "callable"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "computeDescriptor"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            kotlin.reflect.jvm.internal.f3$a r2 = kotlin.reflect.jvm.internal.f3.c(r5)
            r1.d = r2
            kotlin.reflect.jvm.internal.b2 r2 = new kotlin.reflect.jvm.internal.b2
            r2.<init>(r1)
            kotlin.reflect.jvm.internal.f3$a r2 = kotlin.reflect.jvm.internal.f3.c(r2)
            r1.e = r2
            return
    }

    private static final java.lang.reflect.Type c(kotlin.reflect.jvm.internal.d2 r6) {
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r0 = r6.r()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.z0
            if (r1 == 0) goto L55
            kotlin.reflect.jvm.internal.e0<?> r1 = r6.a
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = r1.Z()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r1 = kotlin.reflect.jvm.internal.p3.k(r1)
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r1 == 0) goto L55
            kotlin.reflect.jvm.internal.e0<?> r1 = r6.a
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = r1.Z()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r1 = r1.h()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r2 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
            if (r1 != r2) goto L55
            kotlin.reflect.jvm.internal.e0<?> r6 = r6.a
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r6 = r6.Z()
            kotlin.reflect.jvm.internal.impl.descriptors.k r6 = r6.b()
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.g0.n(r6, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.d r6 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r6
            java.lang.Class r6 = kotlin.reflect.jvm.internal.p3.s(r6)
            if (r6 == 0) goto L3e
            return r6
        L3e:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r6 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot determine receiver Java type of inherited declaration: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
        L55:
            kotlin.reflect.jvm.internal.e0<?> r0 = r6.a
            kotlin.reflect.jvm.internal.calls.g r0 = r0.W()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.calls.m
            r2 = 0
            if (r1 == 0) goto Lbe
            kotlin.reflect.jvm.internal.e0<?> r1 = r6.a
            boolean r1 = r1.c0()
            if (r1 == 0) goto L96
            kotlin.reflect.jvm.internal.calls.m r0 = (kotlin.reflect.jvm.internal.calls.m) r0
            int r1 = r6.getIndex()
            int r1 = r1 + 1
            kotlin.ranges.m r1 = r0.f(r1)
            kotlin.ranges.m r3 = r0.f(r2)
            int r3 = r3.f()
            int r3 = r3 + 1
            java.util.List r0 = r0.b()
            kotlin.ranges.m r4 = new kotlin.ranges.m
            int r5 = r1.e()
            int r5 = r5 - r3
            int r1 = r1.f()
            int r1 = r1 - r3
            r4.<init>(r5, r1)
            java.util.List r0 = kotlin.collections.f0.r5(r0, r4)
            goto La8
        L96:
            kotlin.reflect.jvm.internal.calls.m r0 = (kotlin.reflect.jvm.internal.calls.m) r0
            int r1 = r6.getIndex()
            kotlin.ranges.m r1 = r0.f(r1)
            java.util.List r0 = r0.b()
            java.util.List r0 = kotlin.collections.f0.r5(r0, r1)
        La8:
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            java.lang.reflect.Type r6 = r6.j(r0)
            return r6
        Lbe:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.calls.m.b
            if (r1 == 0) goto Le6
            kotlin.reflect.jvm.internal.calls.m$b r0 = (kotlin.reflect.jvm.internal.calls.m.b) r0
            java.util.List r0 = r0.f()
            int r1 = r6.getIndex()
            java.lang.Object r0 = r0.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Class[] r1 = new java.lang.Class[r2]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.Class[] r0 = (java.lang.Class[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            java.lang.reflect.Type r6 = r6.j(r0)
            return r6
        Le6:
            java.util.List r0 = r0.b()
            int r6 = r6.getIndex()
            java.lang.Object r6 = r0.get(r6)
            java.lang.reflect.Type r6 = (java.lang.reflect.Type) r6
            return r6
    }

    static /* synthetic */ java.util.List d(kotlin.reflect.jvm.internal.d2 r0) {
            java.util.List r0 = g(r0)
            return r0
    }

    static /* synthetic */ java.lang.reflect.Type e(kotlin.reflect.jvm.internal.d2 r0) {
            java.lang.reflect.Type r0 = c(r0)
            return r0
    }

    private static final java.util.List g(kotlin.reflect.jvm.internal.d2 r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r0 = r0.r()
            java.util.List r0 = kotlin.reflect.jvm.internal.p3.e(r0)
            return r0
    }

    private final java.lang.reflect.Type j(java.lang.reflect.Type... r3) {
            r2 = this;
            int r0 = r3.length
            if (r0 == 0) goto L13
            r1 = 1
            if (r0 == r1) goto Lc
            kotlin.reflect.jvm.internal.d2$a r0 = new kotlin.reflect.jvm.internal.d2$a
            r0.<init>(r3)
            return r0
        Lc:
            java.lang.Object r3 = kotlin.collections.n.At(r3)
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            return r3
        L13:
            kotlin.jvm.KotlinReflectionNotSupportedError r3 = new kotlin.jvm.KotlinReflectionNotSupportedError
            java.lang.String r0 = "Expected at least 1 type for compound type"
            r3.<init>(r0)
            throw r3
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.t0 r() {
            r3 = this;
            kotlin.reflect.jvm.internal.f3$a r0 = r3.d
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.d2.f
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = r0.b(r3, r1)
            java.lang.String r1 = "getValue(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.t0) r0
            return r0
    }

    @Override // kotlin.reflect.KParameter
    public boolean a() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r0 = r2.r()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.q1
            if (r1 == 0) goto L12
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r0
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.z0()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.d2
            if (r0 == 0) goto L1c
            kotlin.reflect.jvm.internal.e0<?> r0 = r2.a
            kotlin.reflect.jvm.internal.d2 r3 = (kotlin.reflect.jvm.internal.d2) r3
            kotlin.reflect.jvm.internal.e0<?> r1 = r3.a
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L1c
            int r0 = r2.getIndex()
            int r3 = r3.getIndex()
            if (r0 != r3) goto L1c
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
    }

    @Override // kotlin.reflect.b
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
            r3 = this;
            kotlin.reflect.jvm.internal.f3$a r0 = r3.e
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.d2.f
            r2 = 1
            r1 = r1[r2]
            java.lang.Object r0 = r0.b(r3, r1)
            java.lang.String r1 = "getValue(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    @Override // kotlin.reflect.KParameter
    public int getIndex() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @Override // kotlin.reflect.KParameter
    @org.jetbrains.annotations.Nullable
    public java.lang.String getName() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r0 = r3.r()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.q1
            r2 = 0
            if (r1 == 0) goto Lc
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 != 0) goto L10
            return r2
        L10:
            kotlin.reflect.jvm.internal.impl.descriptors.a r1 = r0.b()
            boolean r1 = r1.n0()
            if (r1 == 0) goto L1b
            return r2
        L1b:
            kotlin.reflect.jvm.internal.impl.name.f r0 = r0.getName()
            java.lang.String r1 = "getName(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r1 = r0.i()
            if (r1 == 0) goto L2b
            return r2
        L2b:
            java.lang.String r0 = r0.b()
            return r0
    }

    @Override // kotlin.reflect.KParameter
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.r getType() {
            r3 = this;
            kotlin.reflect.jvm.internal.z2 r0 = new kotlin.reflect.jvm.internal.z2
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r1 = r3.r()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r1.getType()
            java.lang.String r2 = "getType(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.jvm.internal.c2 r2 = new kotlin.reflect.jvm.internal.c2
            r2.<init>(r3)
            r0.<init>(r1, r2)
            return r0
    }

    @Override // kotlin.reflect.KParameter
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.KParameter.Kind h() {
            r1 = this;
            kotlin.reflect.KParameter$Kind r0 = r1.c
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.jvm.internal.e0<?> r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.getIndex()
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.e0<?> l() {
            r1 = this;
            kotlin.reflect.jvm.internal.e0<?> r0 = r1.a
            return r0
    }

    @Override // kotlin.reflect.KParameter
    public boolean p() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r0 = r2.r()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.q1
            if (r1 == 0) goto Lb
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L13
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.f(r0)
            return r0
        L13:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            kotlin.reflect.jvm.internal.j3 r0 = kotlin.reflect.jvm.internal.j3.a
            java.lang.String r0 = r0.j(r1)
            return r0
    }
}
