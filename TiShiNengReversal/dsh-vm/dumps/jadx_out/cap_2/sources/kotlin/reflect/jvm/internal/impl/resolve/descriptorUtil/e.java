package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDescriptorUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorUtils.kt\norg/jetbrains/kotlin/resolve/descriptorUtil/DescriptorUtilsKt\n+ 2 ClassKind.kt\norg/jetbrains/kotlin/descriptors/ClassKindKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,466:1\n34#2:467\n827#3:468\n855#3,2:469\n1617#3,9:471\n1869#3:480\n1870#3:482\n1626#3:483\n827#3:484\n855#3,2:485\n827#3:489\n855#3,2:490\n360#3,7:493\n1761#3,3:500\n2746#3,3:503\n1563#3:506\n1634#3,3:507\n1#4:481\n1#4:492\n1310#5,2:487\n*S KotlinDebug\n*F\n+ 1 DescriptorUtils.kt\norg/jetbrains/kotlin/resolve/descriptorUtil/DescriptorUtilsKt\n*L\n148#1:467\n167#1:468\n167#1:469,2\n168#1:471,9\n168#1:480\n168#1:482\n168#1:483\n175#1:484\n175#1:485,2\n233#1:489\n233#1:490,2\n303#1:493,7\n449#1:500,3\n455#1:503,3\n208#1:506\n208#1:507,3\n168#1:481\n226#1:487,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.f a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.q1, java.lang.Boolean> {
        public static final kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.a a = null;

        static {
                kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e$a r0 = new kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e$a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.a.a = r0
                return
        }

        a() {
                r6 = this;
                java.lang.String r4 = "declaresDefaultValue()Z"
                r5 = 0
                r1 = 1
                java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.q1> r2 = kotlin.reflect.jvm.internal.impl.descriptors.q1.class
                java.lang.String r3 = "declaresDefaultValue"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public final java.lang.Boolean c(kotlin.reflect.jvm.internal.impl.descriptors.q1 r2) {
                r1 = this;
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.g0.p(r2, r0)
                boolean r2 = r2.Q()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.q1 r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.q1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r1
                java.lang.Boolean r1 = r0.c(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends kotlin.reflect.jvm.internal.impl.utils.b.AbstractC0078b<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> a;
        final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean> b;

        b(kotlin.jvm.internal.Ref.ObjectRef<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r1, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        public /* bridge */ /* synthetic */ java.lang.Object a() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = r1.f()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC0078b, kotlin.reflect.jvm.internal.impl.utils.b.e
        public /* bridge */ /* synthetic */ boolean b(java.lang.Object r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r1
                boolean r1 = r0.e(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC0078b, kotlin.reflect.jvm.internal.impl.utils.b.e
        public /* bridge */ /* synthetic */ void c(java.lang.Object r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r1
                r0.d(r1)
                return
        }

        public void d(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2) {
                r1 = this;
                java.lang.String r0 = "current"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.jvm.internal.Ref$ObjectRef<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r0 = r1.a
                T r0 = r0.element
                if (r0 != 0) goto L1d
                kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean> r0 = r1.b
                java.lang.Object r0 = r0.invoke(r2)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L1d
                kotlin.jvm.internal.Ref$ObjectRef<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r0 = r1.a
                r0.element = r2
            L1d:
                return
        }

        public boolean e(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2) {
                r1 = this;
                java.lang.String r0 = "current"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.jvm.internal.Ref$ObjectRef<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r2 = r1.a
                T r2 = r2.element
                if (r2 != 0) goto Ld
                r2 = 1
                return r2
            Ld:
                r2 = 0
                return r2
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor f() {
                r1 = this;
                kotlin.jvm.internal.Ref$ObjectRef<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r0 = r1.a
                T r0 = r0.element
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
                return r0
        }
    }

    static {
            java.lang.String r0 = "value"
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.f.h(r0)
            java.lang.String r1 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.a = r0
            return
    }

    private static final kotlin.sequences.m A(boolean r0, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            kotlin.jvm.internal.g0.m(r1)
            kotlin.sequences.m r0 = z(r1, r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.descriptors.d B(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "topLevelClassFqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.c()
            kotlin.reflect.jvm.internal.impl.name.c r0 = r2.d()
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r1 = r1.M(r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r1 = r1.r()
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.f()
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.g(r2, r3)
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r2 == 0) goto L2d
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            return r1
        L2d:
            r1 = 0
            return r1
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.k a(kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r1.b()
            return r1
    }

    static /* synthetic */ java.lang.Iterable b(kotlin.reflect.jvm.internal.impl.descriptors.q1 r0) {
            java.lang.Iterable r0 = g(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k c(kotlin.reflect.jvm.internal.impl.descriptors.k r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = a(r0)
            return r0
    }

    static /* synthetic */ java.lang.Iterable d(boolean r0, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            java.lang.Iterable r0 = j(r0, r1)
            return r0
    }

    static /* synthetic */ kotlin.sequences.m e(boolean r0, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            kotlin.sequences.m r0 = A(r0, r1)
            return r0
    }

    public static final boolean f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.q1 r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.List r2 = kotlin.collections.f0.l(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.a
            kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e$a r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.a.a
            java.lang.Boolean r2 = kotlin.reflect.jvm.internal.impl.utils.b.e(r2, r0, r1)
            java.lang.String r0 = "ifAny(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            boolean r2 = r2.booleanValue()
            return r2
    }

    private static final java.lang.Iterable g(kotlin.reflect.jvm.internal.impl.descriptors.q1 r2) {
            java.util.Collection r2 = r2.e()
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
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r1
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r1 = r1.a()
            r0.add(r1)
            goto L15
        L29:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2, boolean r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            java.util.List r2 = kotlin.collections.f0.l(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c r1 = new kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c
            r1.<init>(r3)
            kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e$b r3 = new kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e$b
            r3.<init>(r0, r4)
            java.lang.Object r2 = kotlin.reflect.jvm.internal.impl.utils.b.b(r2, r1, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r2
            return r2
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor i(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0, boolean r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L5
            r1 = 0
        L5:
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = h(r0, r1, r2)
            return r0
    }

    private static final java.lang.Iterable j(boolean r0, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            if (r0 == 0) goto La
            if (r1 == 0) goto L9
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = r1.a()
            goto La
        L9:
            r1 = 0
        La:
            if (r1 == 0) goto L15
            java.util.Collection r0 = r1.e()
            if (r0 == 0) goto L15
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            return r0
        L15:
            java.util.List r0 = kotlin.collections.f0.J()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.name.c k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.name.d r2 = p(r2)
            boolean r0 = r2.f()
            r1 = 0
            if (r0 == 0) goto L11
            goto L12
        L11:
            r2 = r1
        L12:
            if (r2 == 0) goto L19
            kotlin.reflect.jvm.internal.impl.name.c r2 = r2.m()
            return r2
        L19:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.descriptors.d l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r1.getType()
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.c()
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto L18
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            return r1
        L18:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.builtins.j m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r1 = s(r1)
            kotlin.reflect.jvm.internal.impl.builtins.j r1 = r1.p()
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.name.b n(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.f r4) {
            r0 = 0
            if (r4 == 0) goto L3a
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r4.b()
            if (r1 == 0) goto L3a
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
            java.lang.String r3 = "getName(...)"
            if (r2 == 0) goto L22
            kotlin.reflect.jvm.internal.impl.name.b r0 = new kotlin.reflect.jvm.internal.impl.name.b
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r1
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.d()
            kotlin.reflect.jvm.internal.impl.name.f r4 = r4.getName()
            kotlin.jvm.internal.g0.o(r4, r3)
            r0.<init>(r1, r4)
            return r0
        L22:
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g
            if (r2 == 0) goto L3a
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = (kotlin.reflect.jvm.internal.impl.descriptors.f) r1
            kotlin.reflect.jvm.internal.impl.name.b r1 = n(r1)
            if (r1 == 0) goto L3a
            kotlin.reflect.jvm.internal.impl.name.f r4 = r4.getName()
            kotlin.jvm.internal.g0.o(r4, r3)
            kotlin.reflect.jvm.internal.impl.name.b r4 = r1.d(r4)
            return r4
        L3a:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.name.c o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.resolve.i.n(r1)
            java.lang.String r0 = "getFqNameSafe(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.name.d p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.name.d r1 = kotlin.reflect.jvm.internal.impl.resolve.i.m(r1)
            java.lang.String r0 = "getFqName(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.descriptors.z<kotlin.reflect.jvm.internal.impl.types.e1> q(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.d r2) {
            r0 = 0
            if (r2 == 0) goto L8
            kotlin.reflect.jvm.internal.impl.descriptors.o1 r2 = r2.g0()
            goto L9
        L8:
            r2 = r0
        L9:
            boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.z
            if (r1 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.descriptors.z r2 = (kotlin.reflect.jvm.internal.impl.descriptors.z) r2
            return r2
        L10:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.checker.g r(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.e0 r0 = kotlin.reflect.jvm.internal.impl.types.checker.h.a()
            java.lang.Object r1 = r1.U(r0)
            kotlin.reflect.jvm.internal.impl.types.checker.t r1 = (kotlin.reflect.jvm.internal.impl.types.checker.t) r1
            if (r1 == 0) goto L18
            java.lang.Object r1 = r1.a()
            kotlin.reflect.jvm.internal.impl.types.checker.c0 r1 = (kotlin.reflect.jvm.internal.impl.types.checker.c0) r1
            goto L19
        L18:
            r1 = 0
        L19:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.checker.c0.a
            if (r0 == 0) goto L24
            kotlin.reflect.jvm.internal.impl.types.checker.c0$a r1 = (kotlin.reflect.jvm.internal.impl.types.checker.c0.a) r1
            kotlin.reflect.jvm.internal.impl.types.checker.g r1 = r1.b()
            return r1
        L24:
            kotlin.reflect.jvm.internal.impl.types.checker.g$a r1 = kotlin.reflect.jvm.internal.impl.types.checker.g.a.a
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.f0 s(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r1 = kotlin.reflect.jvm.internal.impl.resolve.i.g(r1)
            java.lang.String r0 = "getContainingModule(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.descriptors.g0<kotlin.reflect.jvm.internal.impl.types.e1> t(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.d r2) {
            r0 = 0
            if (r2 == 0) goto L8
            kotlin.reflect.jvm.internal.impl.descriptors.o1 r2 = r2.g0()
            goto L9
        L8:
            r2 = r0
        L9:
            boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0
            if (r1 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.descriptors.g0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.g0) r2
            return r2
        L10:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.m<kotlin.reflect.jvm.internal.impl.descriptors.k> u(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.m r1 = v(r1)
            r0 = 1
            kotlin.sequences.m r1 = kotlin.sequences.p.J0(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.m<kotlin.reflect.jvm.internal.impl.descriptors.k> v(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.b r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.b.a
            kotlin.sequences.m r1 = kotlin.sequences.p.t(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor w(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.v0
            if (r0 == 0) goto L14
            kotlin.reflect.jvm.internal.impl.descriptors.v0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.v0) r1
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = r1.h0()
            java.lang.String r0 = "getCorrespondingProperty(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
        L14:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.descriptors.d x(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.s()
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.I0()
            java.util.Collection r2 = r2.i()
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r2.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            boolean r1 = kotlin.reflect.jvm.internal.impl.builtins.j.c0(r0)
            if (r1 != 0) goto L15
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.c()
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.i.w(r0)
            if (r1 == 0) goto L15
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.g0.n(r0, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            return r0
        L3d:
            r2 = 0
            return r2
    }

    public static final boolean y(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.e0 r0 = kotlin.reflect.jvm.internal.impl.types.checker.h.a()
            java.lang.Object r2 = r2.U(r0)
            kotlin.reflect.jvm.internal.impl.types.checker.t r2 = (kotlin.reflect.jvm.internal.impl.types.checker.t) r2
            r0 = 0
            if (r2 == 0) goto L22
            java.lang.Object r2 = r2.a()
            kotlin.reflect.jvm.internal.impl.types.checker.c0 r2 = (kotlin.reflect.jvm.internal.impl.types.checker.c0) r2
            if (r2 == 0) goto L22
            boolean r2 = r2.a()
            r1 = 1
            if (r2 != r1) goto L22
            return r1
        L22:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.m<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> z(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2, boolean r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r3 == 0) goto Lb
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2 = r2.a()
        Lb:
            r0 = 1
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor[] r0 = new kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor[r0]
            r1 = 0
            r0[r1] = r2
            kotlin.sequences.m r0 = kotlin.sequences.p.C(r0)
            java.util.Collection r2 = r2.e()
            java.lang.String r1 = "getOverriddenDescriptors(...)"
            kotlin.jvm.internal.g0.o(r2, r1)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.sequences.m r2 = kotlin.collections.f0.E1(r2)
            kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.d r1 = new kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.d
            r1.<init>(r3)
            kotlin.sequences.m r2 = kotlin.sequences.p.k1(r2, r1)
            kotlin.sequences.m r2 = kotlin.sequences.p.T2(r0, r2)
            return r2
    }
}
