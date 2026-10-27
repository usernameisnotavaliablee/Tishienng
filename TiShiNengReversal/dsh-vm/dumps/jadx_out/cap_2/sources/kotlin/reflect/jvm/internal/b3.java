package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nKTypeParameterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KTypeParameterImpl.kt\nkotlin/reflect/jvm/internal/KTypeParameterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1563#2:92\n1634#2,3:93\n*S KotlinDebug\n*F\n+ 1 KTypeParameterImpl.kt\nkotlin/reflect/jvm/internal/KTypeParameterImpl\n*L\n38#1:92\n38#1:93,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b3 implements kotlin.reflect.s, kotlin.reflect.jvm.internal.d1 {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] d = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.j1 a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.f3.a b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.c3 c;

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
                kotlin.reflect.jvm.internal.b3.a.a = r0
                return
        }
    }

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.b3> r1 = kotlin.reflect.jvm.internal.b3.class
            java.lang.String r2 = "upperBounds"
            java.lang.String r3 = "getUpperBounds()Ljava/util/List;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            r1 = 1
            kotlin.reflect.n[] r1 = new kotlin.reflect.n[r1]
            r1[r4] = r0
            kotlin.reflect.jvm.internal.b3.d = r1
            return
    }

    public b3(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.c3 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r4) {
            r2 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r4, r0)
            r2.<init>()
            r2.a = r4
            kotlin.reflect.jvm.internal.a3 r4 = new kotlin.reflect.jvm.internal.a3
            r4.<init>(r2)
            kotlin.reflect.jvm.internal.f3$a r4 = kotlin.reflect.jvm.internal.f3.c(r4)
            r2.b = r4
            if (r3 != 0) goto L9e
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r3 = r2.c()
            kotlin.reflect.jvm.internal.impl.descriptors.k r3 = r3.b()
            java.lang.String r4 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto L2f
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r3
            kotlin.reflect.jvm.internal.h0 r3 = r2.e(r3)
            goto L6d
        L2f:
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r0 == 0) goto L87
            r0 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r0.b()
            kotlin.jvm.internal.g0.o(r0, r4)
            boolean r4 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r4 == 0) goto L48
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            kotlin.reflect.jvm.internal.h0 r4 = r2.e(r0)
            goto L62
        L48:
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t
            if (r4 == 0) goto L50
            r4 = r3
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t r4 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t) r4
            goto L51
        L50:
            r4 = 0
        L51:
            if (r4 == 0) goto L70
            java.lang.Class r4 = r2.b(r4)
            kotlin.reflect.d r4 = k3.a.i(r4)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>"
            kotlin.jvm.internal.g0.n(r4, r0)
            kotlin.reflect.jvm.internal.h0 r4 = (kotlin.reflect.jvm.internal.h0) r4
        L62:
            kotlin.reflect.jvm.internal.n r0 = new kotlin.reflect.jvm.internal.n
            r0.<init>(r4)
            kotlin.n1 r4 = kotlin.n1.a
            java.lang.Object r3 = r3.W(r0, r4)
        L6d:
            kotlin.reflect.jvm.internal.c3 r3 = (kotlin.reflect.jvm.internal.c3) r3
            goto L9e
        L70:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r4 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Non-class callable descriptor must be deserialized: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L87:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r4 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown type parameter container: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L9e:
            r2.c = r3
            return
    }

    static /* synthetic */ java.util.List a(kotlin.reflect.jvm.internal.b3 r0) {
            java.util.List r0 = g(r0)
            return r0
    }

    private final java.lang.Class<?> b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t r4) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r0 = r4.b0()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.r
            r2 = 0
            if (r1 == 0) goto Lc
            kotlin.reflect.jvm.internal.impl.load.kotlin.r r0 = (kotlin.reflect.jvm.internal.impl.load.kotlin.r) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L14
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r0 = r0.g()
            goto L15
        L14:
            r0 = r2
        L15:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f
            if (r1 == 0) goto L1c
            r2 = r0
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f r2 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f) r2
        L1c:
            if (r2 == 0) goto L25
            java.lang.Class r0 = r2.a()
            if (r0 == 0) goto L25
            return r0
        L25:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Container of deserialized member is not resolved: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private final kotlin.reflect.jvm.internal.h0<?> e(kotlin.reflect.jvm.internal.impl.descriptors.d r4) {
            r3 = this;
            java.lang.Class r0 = kotlin.reflect.jvm.internal.p3.s(r4)
            if (r0 == 0) goto Lb
            kotlin.reflect.d r0 = k3.a.i(r0)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            kotlin.reflect.jvm.internal.h0 r0 = (kotlin.reflect.jvm.internal.h0) r0
            if (r0 == 0) goto L11
            return r0
        L11:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Type parameter container is not resolved: "
            r1.append(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.k r4 = r4.b()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private static final java.util.List g(kotlin.reflect.jvm.internal.b3 r5) {
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r5 = r5.c()
            java.util.List r5 = r5.getUpperBounds()
            java.lang.String r0 = "getUpperBounds(...)"
            kotlin.jvm.internal.g0.o(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L1e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r5.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = (kotlin.reflect.jvm.internal.impl.types.t0) r1
            kotlin.reflect.jvm.internal.z2 r2 = new kotlin.reflect.jvm.internal.z2
            r3 = 2
            r4 = 0
            r2.<init>(r1, r4, r3, r4)
            r0.add(r2)
            goto L1e
        L35:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.j1 c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r1.a
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.d1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r1.c()
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.b3
            if (r0 == 0) goto L20
            kotlin.reflect.jvm.internal.c3 r0 = r2.c
            kotlin.reflect.jvm.internal.b3 r3 = (kotlin.reflect.jvm.internal.b3) r3
            kotlin.reflect.jvm.internal.c3 r1 = r3.c
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L20
            java.lang.String r0 = r2.getName()
            java.lang.String r3 = r3.getName()
            boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
            if (r3 == 0) goto L20
            r3 = 1
            return r3
        L20:
            r3 = 0
            return r3
    }

    @Override // kotlin.reflect.s
    @org.jetbrains.annotations.NotNull
    public java.lang.String getName() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r2.c()
            kotlin.reflect.jvm.internal.impl.name.f r0 = r0.getName()
            java.lang.String r0 = r0.b()
            java.lang.String r1 = "asString(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @Override // kotlin.reflect.s
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.r> getUpperBounds() {
            r3 = this;
            kotlin.reflect.jvm.internal.f3$a r0 = r3.b
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.b3.d
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = r0.b(r3, r1)
            java.lang.String r1 = "getValue(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.jvm.internal.c3 r0 = r2.c
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.getName()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.reflect.s
    public boolean j() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r1.c()
            boolean r0 = r0.j()
            return r0
    }

    @Override // kotlin.reflect.s
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.KVariance l() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r2.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r0.l()
            int[] r1 = kotlin.reflect.jvm.internal.b3.a.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L25
            r1 = 2
            if (r0 == r1) goto L22
            r1 = 3
            if (r0 != r1) goto L1c
            kotlin.reflect.KVariance r0 = kotlin.reflect.KVariance.OUT
            return r0
        L1c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L22:
            kotlin.reflect.KVariance r0 = kotlin.reflect.KVariance.IN
            return r0
        L25:
            kotlin.reflect.KVariance r0 = kotlin.reflect.KVariance.INVARIANT
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            kotlin.jvm.internal.v0$a r0 = kotlin.jvm.internal.v0.f
            java.lang.String r0 = r0.a(r1)
            return r0
    }
}
