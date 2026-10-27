package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDeserializedClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n295#2,2:430\n774#2:432\n865#2,2:433\n1563#2:435\n1634#2,3:436\n1563#2:439\n1634#2,3:440\n1617#2,9:443\n1869#2:452\n1870#2:454\n1626#2:455\n669#2,11:457\n1#3:453\n1#3:456\n*S KotlinDebug\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor\n*L\n141#1:430,2\n153#1:432\n153#1:433,2\n153#1:435\n153#1:436,3\n159#1:439\n159#1:440,3\n190#1:443,9\n190#1:452\n190#1:454\n190#1:455\n220#1:457,11\n190#1:453\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n extends kotlin.reflect.jvm.internal.impl.descriptors.impl.a implements kotlin.reflect.jvm.internal.impl.descriptors.u {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g A;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class g;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a h;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.e1 i;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.b j;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.Modality k;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.s l;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind m;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.o n;
    private final boolean o;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.l p;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.b q;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.c1<kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.a> r;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.c s;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.k t;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.descriptors.c> u;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.c>> v;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.descriptors.d> w;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d>> x;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.descriptors.o1<kotlin.reflect.jvm.internal.impl.types.e1>> y;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0.a z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDeserializedClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$DeserializedClassMemberScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n*L\n1#1,429:1\n1563#2:430\n1634#2,3:431\n1460#2,5:435\n1460#2,5:440\n1#3:434\n211#4,5:445\n*S KotlinDebug\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$DeserializedClassMemberScope\n*L\n274#1:430\n274#1:431,3\n354#1:435,5\n360#1:440,5\n366#1:445,5\n*E\n"})
    private final class a extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.types.checker.g g;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.storage.i<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k>> h;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.storage.i<java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0>> i;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n j;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$a$a, reason: collision with other inner class name */
        public static final class C0069a extends kotlin.reflect.jvm.internal.impl.resolve.l {
            final /* synthetic */ java.util.List<D> a;

            C0069a(java.util.List<D> r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.m
            public void a(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2) {
                    r1 = this;
                    java.lang.String r0 = "fakeOverride"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.K(r2, r0)
                    java.util.List<D> r0 = r1.a
                    r0.add(r2)
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.l
            protected void e(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3) {
                    r1 = this;
                    java.lang.String r0 = "fromSuper"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    java.lang.String r0 = "fromCurrent"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.s
                    if (r0 == 0) goto L15
                    kotlin.reflect.jvm.internal.impl.descriptors.impl.s r3 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.s) r3
                    kotlin.reflect.jvm.internal.impl.descriptors.t r0 = kotlin.reflect.jvm.internal.impl.descriptors.t.a
                    r3.P0(r0, r2)
                L15:
                    return
            }
        }

        public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r8, kotlin.reflect.jvm.internal.impl.types.checker.g r9) {
                r7 = this;
                java.lang.String r0 = "kotlinTypeRefiner"
                kotlin.jvm.internal.g0.p(r9, r0)
                r7.j = r8
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r8.Y0()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.Z0()
                java.util.List r3 = r0.getFunctionList()
                java.lang.String r0 = "getFunctionList(...)"
                kotlin.jvm.internal.g0.o(r3, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.Z0()
                java.util.List r4 = r0.getPropertyList()
                java.lang.String r0 = "getPropertyList(...)"
                kotlin.jvm.internal.g0.o(r4, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.Z0()
                java.util.List r5 = r0.getTypeAliasList()
                java.lang.String r0 = "getTypeAliasList(...)"
                kotlin.jvm.internal.g0.o(r5, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.Z0()
                java.util.List r0 = r0.getNestedClassNameList()
                java.lang.String r1 = "getNestedClassNameList(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r8 = r8.Y0()
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r8 = r8.g()
                java.util.ArrayList r1 = new java.util.ArrayList
                r6 = 10
                int r6 = kotlin.collections.f0.d0(r0, r6)
                r1.<init>(r6)
                java.util.Iterator r0 = r0.iterator()
            L58:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L70
                java.lang.Object r6 = r0.next()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                kotlin.reflect.jvm.internal.impl.name.f r6 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r8, r6)
                r1.add(r6)
                goto L58
            L70:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k r6 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k
                r6.<init>(r1)
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                r1.g = r9
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r8 = r7.t()
                kotlin.reflect.jvm.internal.impl.storage.n r8 = r8.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l r9 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l
                r9.<init>(r7)
                kotlin.reflect.jvm.internal.impl.storage.i r8 = r8.e(r9)
                r1.h = r8
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r8 = r7.t()
                kotlin.reflect.jvm.internal.impl.storage.n r8 = r8.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.m r9 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.m
                r9.<init>(r7)
                kotlin.reflect.jvm.internal.impl.storage.i r8 = r8.e(r9)
                r1.i = r8
                return
        }

        private static final java.util.List C(java.util.List r0) {
                return r0
        }

        static /* synthetic */ java.util.List D(java.util.List r0) {
                java.util.List r0 = C(r0)
                return r0
        }

        static /* synthetic */ java.util.Collection E(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.a r0) {
                java.util.Collection r0 = G(r0)
                return r0
        }

        static /* synthetic */ java.util.Collection F(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.a r0) {
                java.util.Collection r0 = J(r0)
                return r0
        }

        private static final java.util.Collection G(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.a r3) {
                kotlin.reflect.jvm.internal.impl.resolve.scopes.d r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.o
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k$a r1 = kotlin.reflect.jvm.internal.impl.resolve.scopes.k.a
                kotlin.jvm.functions.Function1 r1 = r1.c()
                kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r2 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS
                java.util.Collection r3 = r3.n(r0, r1, r2)
                return r3
        }

        private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> void H(kotlin.reflect.jvm.internal.impl.name.f r7, java.util.Collection<? extends D> r8, java.util.List<D> r9) {
                r6 = this;
                java.util.ArrayList r3 = new java.util.ArrayList
                r0 = r9
                java.util.Collection r0 = (java.util.Collection) r0
                r3.<init>(r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r6.t()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r0.c()
                kotlin.reflect.jvm.internal.impl.types.checker.p r0 = r0.n()
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r0 = r0.b()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r4 = r6.I()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$a$a r5 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$a$a
                r5.<init>(r9)
                r1 = r7
                r2 = r8
                r0.v(r1, r2, r3, r4, r5)
                return
        }

        private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n I() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0 = r1.j
                return r0
        }

        private static final java.util.Collection J(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.a r1) {
                kotlin.reflect.jvm.internal.impl.types.checker.g r0 = r1.g
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r1 = r1.I()
                java.util.Collection r1 = r0.g(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w
        protected boolean B(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d1 r3) {
                r2 = this;
                java.lang.String r0 = "function"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r2.t()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r0.c()
                q3.c r0 = r0.t()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r1 = r2.j
                boolean r3 = r0.a(r1, r3)
                return r3
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w, kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
        @org.jetbrains.annotations.NotNull
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "location"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.e(r2, r3)
                java.util.Collection r2 = super.a(r2, r3)
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w, kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
        @org.jetbrains.annotations.NotNull
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "location"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.e(r2, r3)
                java.util.Collection r2 = super.c(r2, r3)
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
        public void e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3, @org.jetbrains.annotations.NotNull t3.b r4) {
                r2 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "location"
                kotlin.jvm.internal.g0.p(r4, r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r2.t()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r0.c()
                t3.c r0 = r0.p()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r1 = r2.I()
                s3.a.a(r0, r4, r1, r3)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w, kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.descriptors.f g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "location"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.e(r2, r3)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0 = r1.I()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$c r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.G0(r0)
                if (r0 == 0) goto L1e
                kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r0.i(r2)
                if (r0 == 0) goto L1e
                return r0
            L1e:
                kotlin.reflect.jvm.internal.impl.descriptors.f r2 = super.g(r2, r3)
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
        @org.jetbrains.annotations.NotNull
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r3) {
                r1 = this;
                java.lang.String r0 = "kindFilter"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "nameFilter"
                kotlin.jvm.internal.g0.p(r3, r2)
                kotlin.reflect.jvm.internal.impl.storage.i<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k>> r2 = r1.h
                java.lang.Object r2 = r2.invoke()
                java.util.Collection r2 = (java.util.Collection) r2
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w
        protected void k(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r3) {
                r1 = this;
                java.lang.String r0 = "result"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "nameFilter"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r3 = r1.I()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$c r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.G0(r3)
                if (r3 == 0) goto L19
                java.util.Collection r3 = r3.d()
                goto L1a
            L19:
                r3 = 0
            L1a:
                if (r3 != 0) goto L22
                java.util.List r3 = kotlin.collections.f0.J()
                java.util.Collection r3 = (java.util.Collection) r3
            L22:
                r2.addAll(r3)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w
        protected void o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r5, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.d1> r6) {
                r4 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "functions"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.storage.i<java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0>> r1 = r4.i
                java.lang.Object r1 = r1.invoke()
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r1 = r1.iterator()
            L1b:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L35
                java.lang.Object r2 = r1.next()
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r2.r()
                kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r3 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FOR_ALREADY_TRACKED
                java.util.Collection r2 = r2.a(r5, r3)
                r0.addAll(r2)
                goto L1b
            L35:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r4.t()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r1 = r1.c()
                q3.a r1 = r1.c()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r2 = r4.j
                java.util.Collection r1 = r1.d(r5, r2)
                r6.addAll(r1)
                r4.H(r5, r0, r6)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w
        protected void p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r5, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.w0> r6) {
                r4 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "descriptors"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.storage.i<java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0>> r1 = r4.i
                java.lang.Object r1 = r1.invoke()
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r1 = r1.iterator()
            L1b:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L35
                java.lang.Object r2 = r1.next()
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r2.r()
                kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r3 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FOR_ALREADY_TRACKED
                java.util.Collection r2 = r2.c(r5, r3)
                r0.addAll(r2)
                goto L1b
            L35:
                r4.H(r5, r0, r6)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w
        @org.jetbrains.annotations.NotNull
        protected kotlin.reflect.jvm.internal.impl.name.b q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0 = r1.j
                kotlin.reflect.jvm.internal.impl.name.b r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.F0(r0)
                kotlin.reflect.jvm.internal.impl.name.b r2 = r0.d(r2)
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w
        @org.jetbrains.annotations.Nullable
        protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> w() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0 = r3.I()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$b r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.H0(r0)
                java.util.List r0 = r0.w()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L33
                java.lang.Object r2 = r0.next()
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r2.r()
                java.util.Set r2 = r2.f()
                if (r2 != 0) goto L2f
                r0 = 0
                return r0
            L2f:
                kotlin.collections.f0.s0(r1, r2)
                goto L17
            L33:
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w
        @org.jetbrains.annotations.NotNull
        protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> x() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0 = r3.I()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$b r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.H0(r0)
                java.util.List r0 = r0.w()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2f
                java.lang.Object r2 = r0.next()
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r2.r()
                java.util.Set r2 = r2.b()
                kotlin.collections.f0.s0(r1, r2)
                goto L17
            L2f:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0 = r3.j
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r3.t()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2 = r2.c()
                q3.a r2 = r2.c()
                java.util.Collection r0 = r2.e(r0)
                r1.addAll(r0)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w
        @org.jetbrains.annotations.NotNull
        protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> y() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0 = r3.I()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$b r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.H0(r0)
                java.util.List r0 = r0.w()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2f
                java.lang.Object r2 = r0.next()
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r2.r()
                java.util.Set r2 = r2.d()
                kotlin.collections.f0.s0(r1, r2)
                goto L17
            L2f:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDeserializedClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$DeserializedClassTypeConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1563#2:430\n1634#2,3:431\n1617#2,9:434\n1869#2:443\n1870#2:445\n1626#2:446\n1563#2:447\n1634#2,3:448\n1#3:444\n*S KotlinDebug\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$DeserializedClassTypeConstructor\n*L\n241#1:430\n241#1:431,3\n245#1:434,9\n245#1:443\n245#1:445\n245#1:446\n252#1:447\n252#1:448,3\n245#1:444\n*E\n"})
    private final class b extends kotlin.reflect.jvm.internal.impl.types.b {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.storage.i<java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1>> d;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n e;

        public b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r3) {
                r2 = this;
                r2.e = r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r3.Y0()
                kotlin.reflect.jvm.internal.impl.storage.n r0 = r0.h()
                r2.<init>(r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r3.Y0()
                kotlin.reflect.jvm.internal.impl.storage.n r0 = r0.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.o r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.o
                r1.<init>(r3)
                kotlin.reflect.jvm.internal.impl.storage.i r3 = r0.e(r1)
                r2.d = r3
                return
        }

        static /* synthetic */ java.util.List J(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0) {
                java.util.List r0 = L(r0)
                return r0
        }

        private static final java.util.List L(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0) {
                java.util.List r0 = kotlin.reflect.jvm.internal.impl.descriptors.n1.g(r0)
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d I() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0 = r1.K()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n K() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0 = r1.e
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b, kotlin.reflect.jvm.internal.impl.types.w, kotlin.reflect.jvm.internal.impl.types.w1
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f c() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0 = r1.K()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w1
        public boolean d() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w1
        @org.jetbrains.annotations.NotNull
        public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> getParameters() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.storage.i<java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1>> r0 = r1.d
                java.lang.Object r0 = r0.invoke()
                java.util.List r0 = (java.util.List) r0
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q
        @org.jetbrains.annotations.NotNull
        protected java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> r() {
                r7 = this;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0 = r7.e
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r0.Z0()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r1 = r7.e
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r1.Y0()
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r1 = r1.j()
                java.util.List r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.p(r0, r1)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r1 = r7.e
                java.util.ArrayList r2 = new java.util.ArrayList
                r3 = 10
                int r4 = kotlin.collections.f0.d0(r0, r3)
                r2.<init>(r4)
                java.util.Iterator r0 = r0.iterator()
            L27:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L43
                java.lang.Object r4 = r0.next()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r4
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r5 = r1.Y0()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r5 = r5.i()
                kotlin.reflect.jvm.internal.impl.types.t0 r4 = r5.u(r4)
                r2.add(r4)
                goto L27
            L43:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0 = r7.e
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r0.Y0()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r0.c()
                q3.a r0 = r0.c()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r1 = r7.e
                java.util.Collection r0 = r0.c(r1)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.List r0 = kotlin.collections.f0.I4(r2, r0)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r2 = r0.iterator()
            L68:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L8a
                java.lang.Object r4 = r2.next()
                kotlin.reflect.jvm.internal.impl.types.t0 r4 = (kotlin.reflect.jvm.internal.impl.types.t0) r4
                kotlin.reflect.jvm.internal.impl.types.w1 r4 = r4.I0()
                kotlin.reflect.jvm.internal.impl.descriptors.f r4 = r4.c()
                boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.k0.b
                if (r5 == 0) goto L83
                kotlin.reflect.jvm.internal.impl.descriptors.k0$b r4 = (kotlin.reflect.jvm.internal.impl.descriptors.k0.b) r4
                goto L84
            L83:
                r4 = 0
            L84:
                if (r4 == 0) goto L68
                r1.add(r4)
                goto L68
            L8a:
                boolean r2 = r1.isEmpty()
                if (r2 != 0) goto Ldf
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r2 = r7.e
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r2.Y0()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2 = r2.c()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r2 = r2.j()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r4 = r7.e
                java.util.ArrayList r5 = new java.util.ArrayList
                int r3 = kotlin.collections.f0.d0(r1, r3)
                r5.<init>(r3)
                java.util.Iterator r1 = r1.iterator()
            Lad:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto Ldc
                java.lang.Object r3 = r1.next()
                kotlin.reflect.jvm.internal.impl.descriptors.k0$b r3 = (kotlin.reflect.jvm.internal.impl.descriptors.k0.b) r3
                kotlin.reflect.jvm.internal.impl.name.b r6 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.n(r3)
                if (r6 == 0) goto Lcb
                kotlin.reflect.jvm.internal.impl.name.c r6 = r6.a()
                if (r6 == 0) goto Lcb
                java.lang.String r6 = r6.a()
                if (r6 != 0) goto Ld8
            Lcb:
                kotlin.reflect.jvm.internal.impl.name.f r3 = r3.getName()
                java.lang.String r6 = r3.b()
                java.lang.String r3 = "asString(...)"
                kotlin.jvm.internal.g0.o(r6, r3)
            Ld8:
                r5.add(r6)
                goto Lad
            Ldc:
                r2.b(r4, r5)
            Ldf:
                java.util.List r0 = kotlin.collections.f0.a6(r0)
                java.util.Collection r0 = (java.util.Collection) r0
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0 = r2.e
                kotlin.reflect.jvm.internal.impl.name.f r0 = r0.getName()
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "toString(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q
        @org.jetbrains.annotations.NotNull
        protected kotlin.reflect.jvm.internal.impl.descriptors.h1 v() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.h1$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.h1.a.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDeserializedClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$EnumEntryClassDescriptors\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1208#2,2:430\n1236#2,4:432\n1634#2,3:436\n1634#2,3:439\n1617#2,9:442\n1869#2:451\n1870#2:453\n1626#2:454\n1#3:452\n*S KotlinDebug\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$EnumEntryClassDescriptors\n*L\n389#1:430,2\n389#1:432,4\n421#1:436,3\n422#1:439,3\n426#1:442,9\n426#1:451\n426#1:453\n426#1:454\n426#1:452\n*E\n"})
    private final class c {

        @org.jetbrains.annotations.NotNull
        private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry> a;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.d> b;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.storage.i<java.util.Set<kotlin.reflect.jvm.internal.impl.name.f>> c;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n d;

        public c(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r6) {
                r5 = this;
                r5.d = r6
                r5.<init>()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r6.Z0()
                java.util.List r0 = r0.getEnumEntryList()
                java.lang.String r1 = "getEnumEntryList(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                r1 = 10
                int r1 = kotlin.collections.f0.d0(r0, r1)
                int r1 = kotlin.collections.i1.j(r1)
                r2 = 16
                int r1 = kotlin.ranges.t.u(r1, r2)
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L2d:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L4e
                java.lang.Object r1 = r0.next()
                r3 = r1
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry) r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r4 = r6.Y0()
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r4 = r4.g()
                int r3 = r3.getName()
                kotlin.reflect.jvm.internal.impl.name.f r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r4, r3)
                r2.put(r3, r1)
                goto L2d
            L4e:
                r5.a = r2
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r6 = r5.d
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r6 = r6.Y0()
                kotlin.reflect.jvm.internal.impl.storage.n r6 = r6.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0 = r5.d
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.p r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.p
                r1.<init>(r5, r0)
                kotlin.reflect.jvm.internal.impl.storage.h r6 = r6.c(r1)
                r5.b = r6
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r6 = r5.d
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r6 = r6.Y0()
                kotlin.reflect.jvm.internal.impl.storage.n r6 = r6.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.q r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.q
                r0.<init>(r5)
                kotlin.reflect.jvm.internal.impl.storage.i r6 = r6.e(r0)
                r5.c = r6
                return
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.c r0, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r1, kotlin.reflect.jvm.internal.impl.name.f r2) {
                kotlin.reflect.jvm.internal.impl.descriptors.d r0 = f(r0, r1, r2)
                return r0
        }

        static /* synthetic */ java.util.Set b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.c r0) {
                java.util.Set r0 = h(r0)
                return r0
        }

        static /* synthetic */ java.util.List c(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry r1) {
                java.util.List r0 = g(r0, r1)
                return r0
        }

        private final java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> e() {
                r5 = this;
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r1 = r5.d
                kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.o()
                java.util.Collection r1 = r1.i()
                java.util.Iterator r1 = r1.iterator()
            L13:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L4b
                java.lang.Object r2 = r1.next()
                kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
                kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r2.r()
                r3 = 3
                r4 = 0
                java.util.Collection r2 = kotlin.reflect.jvm.internal.impl.resolve.scopes.n.a.a(r2, r4, r4, r3, r4)
                java.util.Iterator r2 = r2.iterator()
            L2d:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L13
                java.lang.Object r3 = r2.next()
                kotlin.reflect.jvm.internal.impl.descriptors.k r3 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r3
                boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d1
                if (r4 != 0) goto L41
                boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.w0
                if (r4 == 0) goto L2d
            L41:
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r3
                kotlin.reflect.jvm.internal.impl.name.f r3 = r3.getName()
                r0.add(r3)
                goto L2d
            L4b:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r1 = r5.d
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r1 = r1.Z0()
                java.util.List r1 = r1.getFunctionList()
                java.lang.String r2 = "getFunctionList(...)"
                kotlin.jvm.internal.g0.o(r1, r2)
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r2 = r5.d
                java.util.Iterator r1 = r1.iterator()
            L62:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L82
                java.lang.Object r3 = r1.next()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r4 = r2.Y0()
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r4 = r4.g()
                int r3 = r3.getName()
                kotlin.reflect.jvm.internal.impl.name.f r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r4, r3)
                r0.add(r3)
                goto L62
            L82:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r1 = r5.d
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r1 = r1.Z0()
                java.util.List r1 = r1.getPropertyList()
                java.lang.String r2 = "getPropertyList(...)"
                kotlin.jvm.internal.g0.o(r1, r2)
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r2 = r5.d
                java.util.Iterator r1 = r1.iterator()
            L99:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto Lb9
                java.lang.Object r3 = r1.next()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r4 = r2.Y0()
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r4 = r4.g()
                int r3 = r3.getName()
                kotlin.reflect.jvm.internal.impl.name.f r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r4, r3)
                r0.add(r3)
                goto L99
            Lb9:
                java.util.Set r0 = kotlin.collections.u1.C(r0, r0)
                return r0
        }

        private static final kotlin.reflect.jvm.internal.impl.descriptors.d f(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.c r8, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r9, kotlin.reflect.jvm.internal.impl.name.f r10) {
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r10, r0)
                java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r0 = r8.a
                java.lang.Object r0 = r0.get(r10)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry) r0
                if (r0 == 0) goto L34
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r9.Y0()
                kotlin.reflect.jvm.internal.impl.storage.n r2 = r1.h()
                kotlin.reflect.jvm.internal.impl.storage.i<java.util.Set<kotlin.reflect.jvm.internal.impl.name.f>> r5 = r8.c
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b r6 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r8 = r9.Y0()
                kotlin.reflect.jvm.internal.impl.storage.n r8 = r8.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.r r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.r
                r1.<init>(r9, r0)
                r6.<init>(r8, r1)
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r7 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
                r3 = r9
                r4 = r10
                kotlin.reflect.jvm.internal.impl.descriptors.impl.q r8 = kotlin.reflect.jvm.internal.impl.descriptors.impl.q.G0(r2, r3, r4, r5, r6, r7)
                return r8
            L34:
                r8 = 0
                return r8
        }

        private static final java.util.List g(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r1, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry r2) {
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r1.Y0()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r0.c()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.d r0 = r0.d()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0$a r1 = r1.d1()
                java.util.List r1 = r0.c(r1, r2)
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.List r1 = kotlin.collections.f0.a6(r1)
                return r1
        }

        private static final java.util.Set h(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.c r0) {
                java.util.Set r0 = r0.e()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> d() {
                r3 = this;
                java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r0 = r3.a
                java.util.Set r0 = r0.keySet()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            Lf:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L25
                java.lang.Object r2 = r0.next()
                kotlin.reflect.jvm.internal.impl.name.f r2 = (kotlin.reflect.jvm.internal.impl.name.f) r2
                kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r3.i(r2)
                if (r2 == 0) goto Lf
                r1.add(r2)
                goto Lf
            L25:
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final kotlin.reflect.jvm.internal.impl.descriptors.d i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.d> r0 = r1.b
                java.lang.Object r2 = r0.invoke(r2)
                kotlin.reflect.jvm.internal.impl.descriptors.d r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r2
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final /* synthetic */ class d extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type, kotlin.reflect.jvm.internal.impl.types.e1> {
        d(java.lang.Object r8) {
                r7 = this;
                java.lang.String r5 = "simpleType(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;Z)Lorg/jetbrains/kotlin/types/SimpleType;"
                r6 = 0
                r1 = 1
                java.lang.Class<kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0> r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0.class
                java.lang.String r4 = "simpleType"
                r0 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        public final kotlin.reflect.jvm.internal.impl.types.e1 a(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r5) {
                r4 = this;
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.Object r0 = r4.receiver
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0) r0
                r1 = 2
                r2 = 0
                r3 = 0
                kotlin.reflect.jvm.internal.impl.types.e1 r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0.q(r0, r5, r3, r1, r2)
                return r5
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 invoke(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r1
                kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final /* synthetic */ class e extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.types.e1> {
        e(java.lang.Object r8) {
                r7 = this;
                java.lang.String r5 = "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;"
                r6 = 0
                r1 = 1
                java.lang.Class<kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n> r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.class
                java.lang.String r4 = "getValueClassPropertyType"
                r0 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        public final kotlin.reflect.jvm.internal.impl.types.e1 c(kotlin.reflect.jvm.internal.impl.name.f r2) {
                r1 = this;
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.Object r0 = r1.receiver
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n) r0
                kotlin.reflect.jvm.internal.impl.types.e1 r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.I0(r0, r2)
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 invoke(kotlin.reflect.jvm.internal.impl.name.f r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.name.f r1 = (kotlin.reflect.jvm.internal.impl.name.f) r1
                kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.c(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final /* synthetic */ class f extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.checker.g, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.a> {
        f(java.lang.Object r8) {
                r7 = this;
                java.lang.String r5 = "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V"
                r6 = 0
                r1 = 1
                java.lang.Class<kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$a> r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.a.class
                java.lang.String r4 = "<init>"
                r0 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.a c(kotlin.reflect.jvm.internal.impl.types.checker.g r3) {
                r2 = this;
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$a r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$a
                java.lang.Object r1 = r2.receiver
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r1 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n) r1
                r0.<init>(r1, r3)
                return r0
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.a invoke(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.types.checker.g r1 = (kotlin.reflect.jvm.internal.impl.types.checker.g) r1
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$a r1 = r0.c(r1)
                return r1
        }
    }

    public n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r14) {
            r9 = this;
            java.lang.String r0 = "outerContext"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "classProto"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "metadataVersion"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "sourceElement"
            kotlin.jvm.internal.g0.p(r14, r0)
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r10.h()
            int r1 = r11.getFqName()
            kotlin.reflect.jvm.internal.impl.name.b r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.a(r12, r1)
            kotlin.reflect.jvm.internal.impl.name.f r1 = r1.h()
            r9.<init>(r0, r1)
            r9.g = r11
            r9.h = r13
            r9.i = r14
            int r0 = r11.getFqName()
            kotlin.reflect.jvm.internal.impl.name.b r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.a(r12, r0)
            r9.j = r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.n0 r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.n0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality> r1 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.e
            int r2 = r11.getFlags()
            java.lang.Object r1 = r1.d(r2)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality) r1
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = r0.b(r1)
            r9.k = r1
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility> r1 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
            int r2 = r11.getFlags()
            java.lang.Object r1 = r1.d(r2)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility) r1
            kotlin.reflect.jvm.internal.impl.descriptors.s r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.o0.a(r0, r1)
            r9.l = r1
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind> r1 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f
            int r2 = r11.getFlags()
            java.lang.Object r1 = r1.d(r2)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind) r1
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = r0.a(r1)
            r9.m = r0
            java.util.List r3 = r11.getTypeParameterList()
            java.lang.String r1 = "getTypeParameterList(...)"
            kotlin.jvm.internal.g0.o(r3, r1)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r5 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.h
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r1 = r11.getTypeTable()
            java.lang.String r2 = "getTypeTable(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r5.<init>(r1)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j$a r1 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.j.b
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r2 = r11.getVersionRequirementTable()
            java.lang.String r4 = "getVersionRequirementTable(...)"
            kotlin.jvm.internal.g0.o(r2, r4)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r6 = r1.a(r2)
            r2 = r9
            r1 = r10
            r4 = r12
            r7 = r13
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r10 = r1.a(r2, r3, r4, r5, r6, r7)
            r2.n = r10
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r12 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.m
            int r13 = r11.getFlags()
            java.lang.Boolean r12 = r12.g(r13)
            java.lang.String r13 = "get(...)"
            kotlin.jvm.internal.g0.o(r12, r13)
            boolean r12 = r12.booleanValue()
            r2.o = r12
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r13 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS
            if (r0 != r13) goto Le1
            if (r12 != 0) goto Ld6
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r12 = r10.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.u r12 = r12.i()
            java.lang.Boolean r12 = r12.a()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r12 = kotlin.jvm.internal.g0.g(r12, r3)
            if (r12 == 0) goto Ld4
            goto Ld6
        Ld4:
            r12 = 0
            goto Ld7
        Ld6:
            r12 = 1
        Ld7:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.q r3 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.q
            kotlin.reflect.jvm.internal.impl.storage.n r4 = r10.h()
            r3.<init>(r4, r9, r12)
            goto Le3
        Le1:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k$c r3 = kotlin.reflect.jvm.internal.impl.resolve.scopes.k.c.b
        Le3:
            r2.p = r3
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$b r12 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$b
            r12.<init>(r9)
            r2.q = r12
            kotlin.reflect.jvm.internal.impl.descriptors.c1$a r12 = kotlin.reflect.jvm.internal.impl.descriptors.c1.e
            kotlin.reflect.jvm.internal.impl.storage.n r3 = r10.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r4 = r10.c()
            kotlin.reflect.jvm.internal.impl.types.checker.p r4 = r4.n()
            kotlin.reflect.jvm.internal.impl.types.checker.g r4 = r4.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$f r5 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$f
            r5.<init>(r9)
            kotlin.reflect.jvm.internal.impl.descriptors.c1 r12 = r12.a(r9, r3, r4, r5)
            r2.r = r12
            r12 = 0
            if (r0 != r13) goto L112
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$c r13 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$c
            r13.<init>(r9)
            goto L113
        L112:
            r13 = r12
        L113:
            r2.s = r13
            kotlin.reflect.jvm.internal.impl.descriptors.k r13 = r1.e()
            r2.t = r13
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r10.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e
            r1.<init>(r9)
            kotlin.reflect.jvm.internal.impl.storage.j r0 = r0.g(r1)
            r2.u = r0
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r10.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f
            r1.<init>(r9)
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r0.e(r1)
            r2.v = r0
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r10.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g
            r1.<init>(r9)
            kotlin.reflect.jvm.internal.impl.storage.j r0 = r0.g(r1)
            r2.w = r0
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r10.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h
            r1.<init>(r9)
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r0.e(r1)
            r2.x = r0
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r10.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
            r1.<init>(r9)
            kotlin.reflect.jvm.internal.impl.storage.j r0 = r0.g(r1)
            r2.y = r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0$a r3 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0$a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r5 = r10.g()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r6 = r10.j()
            boolean r0 = r13 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n
            if (r0 == 0) goto L177
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r13 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n) r13
            goto L178
        L177:
            r13 = r12
        L178:
            if (r13 == 0) goto L17c
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0$a r12 = r13.z
        L17c:
            r4 = r11
            r8 = r12
            r7 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            r2.z = r3
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r11 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.c
            int r12 = r4.getFlags()
            java.lang.Boolean r11 = r11.g(r12)
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L19b
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r10 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r10 = r10.b()
            goto L1aa
        L19b:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s0 r11 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s0
            kotlin.reflect.jvm.internal.impl.storage.n r10 = r10.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.j r12 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.j
            r12.<init>(r9)
            r11.<init>(r10, r12)
            r10 = r11
        L1aa:
            r2.A = r10
            return
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.b F0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0) {
            kotlin.reflect.jvm.internal.impl.name.b r0 = r0.j
            return r0
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.c G0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$c r0 = r0.s
            return r0
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.b H0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$b r0 = r0.q
            return r0
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 I0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0, kotlin.reflect.jvm.internal.impl.name.f r1) {
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.e1(r1)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.c J0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = g1(r0)
            return r0
    }

    static /* synthetic */ java.util.Collection K0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0) {
            java.util.Collection r0 = X0(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d L0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = Q0(r0)
            return r0
    }

    static /* synthetic */ java.util.Collection M0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0) {
            java.util.Collection r0 = h1(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.o1 N0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.o1 r0 = i1(r0)
            return r0
    }

    static /* synthetic */ java.util.List O0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0) {
            java.util.List r0 = P0(r0)
            return r0
    }

    private static final java.util.List P0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r1) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r1.n
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r0.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.d r0 = r0.d()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0$a r1 = r1.z
            java.util.List r1 = r0.b(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = kotlin.collections.f0.a6(r1)
            return r1
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.d Q0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r0.R0()
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d R0() {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r4.g
            boolean r0 = r0.hasCompanionObjectName()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r4.n
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r0.g()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r2 = r4.g
            int r2 = r2.getCompanionObjectName()
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r0, r2)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$a r2 = r4.a1()
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r3 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r2.g(r0, r3)
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r2 == 0) goto L2b
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            return r0
        L2b:
            return r1
    }

    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> S0() {
            r2 = this;
            java.util.List r0 = r2.U0()
            java.util.Collection r0 = (java.util.Collection) r0
            kotlin.reflect.jvm.internal.impl.descriptors.c r1 = r2.z()
            java.util.List r1 = kotlin.collections.f0.R(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r0 = kotlin.collections.f0.I4(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r2.n
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r1 = r1.c()
            q3.a r1 = r1.c()
            java.util.Collection r1 = r1.b(r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r0 = kotlin.collections.f0.I4(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.c T0() {
            r5 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = r5.m
            boolean r0 = r0.isSingleton()
            if (r0 == 0) goto L16
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r0 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            kotlin.reflect.jvm.internal.impl.descriptors.impl.i r0 = kotlin.reflect.jvm.internal.impl.resolve.h.l(r5, r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r5.s()
            r0.b1(r1)
            return r0
        L16:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r5.g
            java.util.List r0 = r0.getConstructorList()
            java.lang.String r1 = "getConstructorList(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            r3 = r1
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) r3
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.n
            int r3 = r3.getFlags()
            java.lang.Boolean r3 = r4.g(r3)
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L27
            goto L47
        L46:
            r1 = r2
        L47:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) r1
            if (r1 == 0) goto L57
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r5.n
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r0 = r0.f()
            r2 = 1
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = r0.r(r1, r2)
            return r0
        L57:
            return r2
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.c> U0() {
            r5 = this;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r5.g
            java.util.List r0 = r0.getConstructorList()
            java.lang.String r1 = "getConstructorList(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r0.next()
            r3 = r2
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) r3
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.n
            int r3 = r3.getFlags()
            java.lang.Boolean r3 = r4.g(r3)
            java.lang.String r4 = "get(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L16
            r1.add(r2)
            goto L16
        L3c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r1, r2)
            r0.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L4b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) r2
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r5.n
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r3 = r3.f()
            kotlin.jvm.internal.g0.m(r2)
            r4 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.c r2 = r3.r(r2, r4)
            r0.add(r2)
            goto L4b
        L69:
            return r0
    }

    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> V0() {
            r5 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r5.k
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED
            if (r0 == r1) goto Ld
            java.util.List r0 = kotlin.collections.f0.J()
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
        Ld:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r5.g
            java.util.List r0 = r0.getSealedSubclassFqNameList()
            kotlin.jvm.internal.g0.m(r0)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L58
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r5.n
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r3 = r3.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r4 = r5.n
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r4 = r4.g()
            kotlin.jvm.internal.g0.m(r2)
            int r2 = r2.intValue()
            kotlin.reflect.jvm.internal.impl.name.b r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.a(r4, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r3.b(r2)
            if (r2 == 0) goto L2a
            r1.add(r2)
            goto L2a
        L57:
            return r1
        L58:
            kotlin.reflect.jvm.internal.impl.resolve.a r0 = kotlin.reflect.jvm.internal.impl.resolve.a.a
            r1 = 0
            java.util.Collection r0 = r0.a(r5, r1)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.o1<kotlin.reflect.jvm.internal.impl.types.e1> W0() {
            r6 = this;
            boolean r0 = r6.isInline()
            r1 = 0
            if (r0 != 0) goto Le
            boolean r0 = r6.v()
            if (r0 != 0) goto Le
            return r1
        Le:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r6.g
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r6.n
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2 = r2.g()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r6.n
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r3 = r3.j()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$d r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$d
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r5 = r6.n
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r5 = r5.i()
            r4.<init>(r5)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$e r5 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$e
            r5.<init>(r6)
            kotlin.reflect.jvm.internal.impl.descriptors.o1 r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.x0.b(r0, r2, r3, r4, r5)
            if (r0 == 0) goto L33
            return r0
        L33:
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r0 = r6.h
            r2 = 5
            r3 = 1
            boolean r0 = r0.c(r3, r2, r3)
            if (r0 != 0) goto L9d
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = r6.z()
            if (r0 == 0) goto L82
            java.util.List r0 = r0.g()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Object r0 = kotlin.collections.f0.G2(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r0
            kotlin.reflect.jvm.internal.impl.name.f r0 = r0.getName()
            java.lang.String r1 = "getName(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r6.e1(r0)
            if (r1 == 0) goto L67
            kotlin.reflect.jvm.internal.impl.descriptors.z r2 = new kotlin.reflect.jvm.internal.impl.descriptors.z
            r2.<init>(r0, r1)
            return r2
        L67:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Value class has no underlying property: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L82:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Inline class has no primary constructor: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9d:
            return r1
    }

    private static final java.util.Collection X0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0) {
            java.util.Collection r0 = r0.S0()
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.a a1() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.c1<kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$a> r0 = r2.r
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r2.n
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r1 = r1.c()
            kotlin.reflect.jvm.internal.impl.types.checker.p r1 = r1.n()
            kotlin.reflect.jvm.internal.impl.types.checker.g r1 = r1.c()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r0.c(r1)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$a r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n.a) r0
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.types.e1 e1(kotlin.reflect.jvm.internal.impl.name.f r6) {
            r5 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$a r0 = r5.a1()
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r1 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION
            java.util.Collection r6 = r0.c(r6, r1)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
            r1 = 0
            r2 = r0
        L13:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r6.next()
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r4
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r4 = r4.f0()
            if (r4 != 0) goto L13
            if (r1 == 0) goto L2a
        L28:
            r2 = r0
            goto L30
        L2a:
            r1 = 1
            r2 = r3
            goto L13
        L2d:
            if (r1 != 0) goto L30
            goto L28
        L30:
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r2
            if (r2 == 0) goto L38
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.getType()
        L38:
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = (kotlin.reflect.jvm.internal.impl.types.e1) r0
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.c g1(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = r0.T0()
            return r0
    }

    private static final java.util.Collection h1(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0) {
            java.util.Collection r0 = r0.V0()
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.o1 i1(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.o1 r0 = r0.W0()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.o Y0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r1.n
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class Z0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r1.g
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.l, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.k b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r1.t
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a b1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r0 = r1.h
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.l c1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.l r0 = r1.p
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0.a d1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0$a r0 = r1.z
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> f() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.storage.i<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.c>> r0 = r1.v
            java.lang.Object r0 = r0.invoke()
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
    }

    public final boolean f1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$a r0 = r1.a1()
            java.util.Set r0 = r0.u()
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.o1<kotlin.reflect.jvm.internal.impl.types.e1> g0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.descriptors.o1<kotlin.reflect.jvm.internal.impl.types.e1>> r0 = r1.y
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.descriptors.o1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.o1) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r1.A
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.e1 getSource() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r0 = r1.i
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.c0, kotlin.reflect.jvm.internal.impl.descriptors.o
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = r1.l
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassKind h() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = r1.m
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.c0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality i() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r1.k
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean i0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean isExternal() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.i
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r1 = r2.g
            int r1 = r1.getFlags()
            java.lang.Boolean r0 = r0.g(r1)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean isInline() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.k
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r1 = r3.g
            int r1 = r1.getFlags()
            java.lang.Boolean r0 = r0.g(r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1d
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r0 = r3.h
            r1 = 4
            r2 = 1
            boolean r0 = r0.e(r2, r1, r2)
            if (r0 == 0) goto L1d
            return r2
        L1d:
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a, kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> j0() {
            r7 = this;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r7.g
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r7.n
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r1 = r1.j()
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.b(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r2
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r7.n
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r3 = r3.i()
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r3.u(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.n0 r3 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.n0
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r4 = r7.V()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.b r5 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.b
            r6 = 0
            r5.<init>(r7, r2, r6, r6)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r2.b()
            r3.<init>(r4, r5, r2)
            r1.add(r3)
            goto L1d
        L4c:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g
    public boolean k() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.g
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r1 = r2.g
            int r1 = r1.getFlags()
            java.lang.Boolean r0 = r0.g(r1)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean l0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind> r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r1 = r2.g
            int r1 = r1.getFlags()
            java.lang.Object r0 = r0.d(r1)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.COMPANION_OBJECT
            if (r0 != r1) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.w1 o() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$b r0 = r1.q
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z
    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.resolve.scopes.k o0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r2) {
            r1 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.c1<kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n$a> r0 = r1.r
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r0.c(r2)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean q0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.j
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r1 = r2.g
            int r1 = r1.getFlags()
            java.lang.Boolean r0 = r0.g(r1)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.l r0 = r1.c1()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.d s0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.descriptors.d> r0 = r1.w
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> t() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r1.n
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r0 = r0.i()
            java.util.List r0 = r0.m()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "deserialized "
            r0.append(r1)
            boolean r1 = r2.q0()
            if (r1 == 0) goto L13
            java.lang.String r1 = "expect "
            goto L15
        L13:
            java.lang.String r1 = ""
        L15:
            r0.append(r1)
            java.lang.String r1 = "class "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.name.f r1 = r2.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean u() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.l
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r1 = r2.g
            int r1 = r1.getFlags()
            java.lang.Boolean r0 = r0.g(r1)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean v() {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.k
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r1 = r4.g
            int r1 = r1.getFlags()
            java.lang.Boolean r0 = r0.g(r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1e
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r0 = r4.h
            r1 = 4
            r2 = 2
            r3 = 1
            boolean r0 = r0.c(r3, r1, r2)
            if (r0 == 0) goto L1e
            return r3
        L1e:
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean w() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.h
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r1 = r2.g
            int r1 = r1.getFlags()
            java.lang.Boolean r0 = r0.g(r1)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.c z() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.descriptors.c> r0 = r1.u
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = (kotlin.reflect.jvm.internal.impl.descriptors.c) r0
            return r0
    }
}
