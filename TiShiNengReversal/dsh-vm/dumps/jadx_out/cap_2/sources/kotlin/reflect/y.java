package kotlin.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1563#3:232\n1634#3,3:233\n1563#3:236\n1634#3,3:237\n1563#3:240\n1634#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n69#1:232\n69#1:233,3\n71#1:236\n71#1:237,3\n77#1:240\n77#1:241,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class y {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlin.reflect.KVariance[] r0 = kotlin.reflect.KVariance.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.IN     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.INVARIANT     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.OUT     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.reflect.y.a.a = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final /* synthetic */ class b extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Class<?>, java.lang.Class<?>> {
        public static final kotlin.reflect.y.b a = null;

        static {
                kotlin.reflect.y$b r0 = new kotlin.reflect.y$b
                r0.<init>()
                kotlin.reflect.y.b.a = r0
                return
        }

        b() {
                r6 = this;
                java.lang.String r4 = "getComponentType()Ljava/lang/Class;"
                r5 = 0
                r1 = 1
                java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
                java.lang.String r3 = "getComponentType"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public final java.lang.Class<?> c(java.lang.Class<?> r2) {
                r1 = this;
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.Class r2 = r2.getComponentType()
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Class<?> invoke(java.lang.Class<?> r1) {
                r0 = this;
                java.lang.Class r1 = (java.lang.Class) r1
                java.lang.Class r1 = r0.c(r1)
                return r1
        }
    }

    public static final /* synthetic */ java.lang.reflect.Type a(kotlin.reflect.r r0, boolean r1) {
            java.lang.reflect.Type r0 = c(r0, r1)
            return r0
    }

    public static final /* synthetic */ java.lang.String b(java.lang.reflect.Type r0) {
            java.lang.String r0 = j(r0)
            return r0
    }

    @kotlin.ExperimentalStdlibApi
    private static final java.lang.reflect.Type c(kotlin.reflect.r r3, boolean r4) {
            kotlin.reflect.g r0 = r3.n()
            boolean r1 = r0 instanceof kotlin.reflect.s
            if (r1 == 0) goto L10
            kotlin.reflect.x r3 = new kotlin.reflect.x
            kotlin.reflect.s r0 = (kotlin.reflect.s) r0
            r3.<init>(r0)
            return r3
        L10:
            boolean r1 = r0 instanceof kotlin.reflect.d
            if (r1 == 0) goto L9c
            kotlin.reflect.d r0 = (kotlin.reflect.d) r0
            if (r4 == 0) goto L1d
            java.lang.Class r4 = k3.a.g(r0)
            goto L21
        L1d:
            java.lang.Class r4 = k3.a.e(r0)
        L21:
            java.util.List r0 = r3.getArguments()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2c
            return r4
        L2c:
            boolean r1 = r4.isArray()
            if (r1 == 0) goto L97
            java.lang.Class r1 = r4.getComponentType()
            boolean r1 = r1.isPrimitive()
            if (r1 == 0) goto L3d
            goto L7f
        L3d:
            java.lang.Object r0 = kotlin.collections.f0.p5(r0)
            kotlin.reflect.t r0 = (kotlin.reflect.t) r0
            if (r0 == 0) goto L80
            kotlin.reflect.KVariance r3 = r0.a()
            kotlin.reflect.r r0 = r0.b()
            r1 = -1
            if (r3 != 0) goto L52
            r3 = -1
            goto L5a
        L52:
            int[] r2 = kotlin.reflect.y.a.a
            int r3 = r3.ordinal()
            r3 = r2[r3]
        L5a:
            if (r3 == r1) goto L7f
            r1 = 1
            if (r3 == r1) goto L7f
            r2 = 2
            if (r3 == r2) goto L6c
            r2 = 3
            if (r3 != r2) goto L66
            goto L6c
        L66:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L6c:
            kotlin.jvm.internal.g0.m(r0)
            r3 = 0
            r2 = 0
            java.lang.reflect.Type r3 = d(r0, r3, r1, r2)
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L7a
            goto L7f
        L7a:
            kotlin.reflect.a r4 = new kotlin.reflect.a
            r4.<init>(r3)
        L7f:
            return r4
        L80:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "kotlin.Array must have exactly one type argument: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L97:
            java.lang.reflect.Type r3 = e(r4, r0)
            return r3
        L9c:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported type classifier: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    static /* synthetic */ java.lang.reflect.Type d(kotlin.reflect.r r0, boolean r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.lang.reflect.Type r0 = c(r0, r1)
            return r0
    }

    @kotlin.ExperimentalStdlibApi
    private static final java.lang.reflect.Type e(java.lang.Class<?> r4, java.util.List<kotlin.reflect.t> r5) {
            java.lang.Class r0 = r4.getDeclaringClass()
            r1 = 10
            if (r0 != 0) goto L32
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.collections.f0.d0(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L17:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r5.next()
            kotlin.reflect.t r1 = (kotlin.reflect.t) r1
            java.lang.reflect.Type r1 = g(r1)
            r0.add(r1)
            goto L17
        L2b:
            kotlin.reflect.u r5 = new kotlin.reflect.u
            r1 = 0
            r5.<init>(r4, r1, r0)
            return r5
        L32:
            int r2 = r4.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 == 0) goto L65
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r2 = new java.util.ArrayList
            int r1 = kotlin.collections.f0.d0(r5, r1)
            r2.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L4b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r5.next()
            kotlin.reflect.t r1 = (kotlin.reflect.t) r1
            java.lang.reflect.Type r1 = g(r1)
            r2.add(r1)
            goto L4b
        L5f:
            kotlin.reflect.u r5 = new kotlin.reflect.u
            r5.<init>(r4, r0, r2)
            return r5
        L65:
            java.lang.reflect.TypeVariable[] r2 = r4.getTypeParameters()
            int r2 = r2.length
            int r3 = r5.size()
            java.util.List r3 = r5.subList(r2, r3)
            java.lang.reflect.Type r0 = e(r0, r3)
            r3 = 0
            java.util.List r5 = r5.subList(r3, r2)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r2 = new java.util.ArrayList
            int r1 = kotlin.collections.f0.d0(r5, r1)
            r2.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L8a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L9e
            java.lang.Object r1 = r5.next()
            kotlin.reflect.t r1 = (kotlin.reflect.t) r1
            java.lang.reflect.Type r1 = g(r1)
            r2.add(r1)
            goto L8a
        L9e:
            kotlin.reflect.u r5 = new kotlin.reflect.u
            r5.<init>(r4, r0, r2)
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.reflect.Type f(@org.jetbrains.annotations.NotNull kotlin.reflect.r r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3 instanceof kotlin.jvm.internal.h0
            if (r0 == 0) goto L13
            r0 = r3
            kotlin.jvm.internal.h0 r0 = (kotlin.jvm.internal.h0) r0
            java.lang.reflect.Type r0 = r0.b()
            if (r0 == 0) goto L13
            return r0
        L13:
            r0 = 1
            r1 = 0
            r2 = 0
            java.lang.reflect.Type r3 = d(r3, r2, r0, r1)
            return r3
    }

    private static final java.lang.reflect.Type g(kotlin.reflect.t r4) {
            kotlin.reflect.KVariance r0 = r4.g()
            if (r0 != 0) goto Ld
            kotlin.reflect.z$a r4 = kotlin.reflect.z.c
            kotlin.reflect.z r4 = r4.a()
            return r4
        Ld:
            kotlin.reflect.r r4 = r4.getType()
            kotlin.jvm.internal.g0.m(r4)
            int[] r1 = kotlin.reflect.y.a.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L3b
            r3 = 2
            if (r0 == r3) goto L36
            r3 = 3
            if (r0 != r3) goto L30
            kotlin.reflect.z r0 = new kotlin.reflect.z
            java.lang.reflect.Type r4 = c(r4, r2)
            r0.<init>(r4, r1)
            return r0
        L30:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L36:
            java.lang.reflect.Type r4 = c(r4, r2)
            return r4
        L3b:
            kotlin.reflect.z r0 = new kotlin.reflect.z
            java.lang.reflect.Type r4 = c(r4, r2)
            r0.<init>(r1, r4)
            return r0
    }

    @kotlin.internal.LowPriorityInOverloadResolution
    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalStdlibApi
    public static /* synthetic */ void h(kotlin.reflect.r r0) {
            return
    }

    @kotlin.ExperimentalStdlibApi
    private static /* synthetic */ void i(kotlin.reflect.t r0) {
            return
    }

    private static final java.lang.String j(java.lang.reflect.Type r2) {
            boolean r0 = r2 instanceof java.lang.Class
            if (r0 == 0) goto L41
            r0 = r2
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L37
            kotlin.reflect.y$b r0 = kotlin.reflect.y.b.a
            kotlin.sequences.m r2 = kotlin.sequences.p.t(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = kotlin.sequences.p.I1(r2)
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "[]"
            int r2 = kotlin.sequences.p.E0(r2)
            java.lang.String r2 = kotlin.text.u.t2(r1, r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L37:
            java.lang.String r2 = r0.getName()
            java.lang.String r0 = "getName(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
        L41:
            java.lang.String r2 = r2.toString()
            return r2
    }
}
