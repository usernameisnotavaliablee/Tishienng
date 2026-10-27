package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class w extends kotlin.reflect.jvm.internal.impl.resolve.scopes.l {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] f = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.o b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.a c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.j e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface a {
        @org.jetbrains.annotations.NotNull
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull t3.b r2);

        @org.jetbrains.annotations.NotNull
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> b();

        @org.jetbrains.annotations.NotNull
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull t3.b r2);

        @org.jetbrains.annotations.NotNull
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> d();

        @org.jetbrains.annotations.Nullable
        kotlin.reflect.jvm.internal.impl.descriptors.i1 e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1);

        @org.jetbrains.annotations.NotNull
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> f();

        void g(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r3, @org.jetbrains.annotations.NotNull t3.b r4);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,512:1\n502#1:513\n508#1:517\n508#1:532\n508#1:546\n492#1:572\n493#1,5:575\n492#1:580\n493#1,5:583\n502#1:644\n502#1:648\n1634#2,3:514\n1617#2,9:518\n1869#2:527\n1870#2:530\n1626#2:531\n1617#2,9:533\n1869#2:542\n1870#2:544\n1626#2:545\n1617#2,9:547\n1869#2:556\n1870#2:558\n1626#2:559\n1374#2:560\n1460#2,5:561\n1374#2:566\n1460#2,5:567\n865#2,2:573\n865#2,2:581\n865#2,2:588\n865#2,2:590\n865#2,2:592\n1634#2,3:594\n1617#2,9:597\n1869#2:606\n1870#2:608\n1626#2:609\n1208#2,2:610\n1236#2,4:612\n1491#2:616\n1516#2,3:617\n1519#2,3:627\n1491#2:630\n1516#2,3:631\n1519#2,3:641\n1634#2,3:645\n1634#2,3:649\n1#3:528\n1#3:529\n1#3:543\n1#3:557\n1#3:607\n382#4,7:620\n382#4,7:634\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation\n*L\n429#1:513\n432#1:517\n435#1:532\n438#1:546\n447#1:572\n447#1:575,5\n450#1:580\n450#1:583,5\n421#1:644\n425#1:648\n429#1:514,3\n432#1:518,9\n432#1:527\n432#1:530\n432#1:531\n435#1:533,9\n435#1:542\n435#1:544\n435#1:545\n438#1:547,9\n438#1:556\n438#1:558\n438#1:559\n441#1:560\n441#1:561,5\n444#1:566\n444#1:567,5\n447#1:573,2\n450#1:581,2\n473#1:588,2\n477#1:590,2\n492#1:592,2\n502#1:594,3\n508#1:597,9\n508#1:606\n508#1:608\n508#1:609\n412#1:610,2\n412#1:612,4\n415#1:616\n415#1:617,3\n415#1:627,3\n418#1:630\n418#1:631,3\n418#1:641,3\n421#1:645,3\n425#1:649,3\n432#1:529\n435#1:543\n438#1:557\n508#1:607\n415#1:620,7\n418#1:634,7\n*E\n"})
    private final class b implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.a {
        static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] o = null;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> a;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> b;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> c;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.storage.i d;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.storage.i e;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.storage.i f;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.storage.i g;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.storage.i h;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.storage.i i;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.storage.i j;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.storage.i k;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.storage.i l;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.storage.i m;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w n;

        static {
                kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
                java.lang.Class<kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$b> r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b.class
                java.lang.String r2 = "declaredFunctions"
                java.lang.String r3 = "getDeclaredFunctions()Ljava/util/List;"
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
                kotlin.jvm.internal.PropertyReference1Impl r2 = new kotlin.jvm.internal.PropertyReference1Impl
                java.lang.String r3 = "declaredProperties"
                java.lang.String r5 = "getDeclaredProperties()Ljava/util/List;"
                r2.<init>(r1, r3, r5, r4)
                kotlin.reflect.p r2 = kotlin.jvm.internal.o0.u(r2)
                kotlin.jvm.internal.PropertyReference1Impl r3 = new kotlin.jvm.internal.PropertyReference1Impl
                java.lang.String r5 = "allTypeAliases"
                java.lang.String r6 = "getAllTypeAliases()Ljava/util/List;"
                r3.<init>(r1, r5, r6, r4)
                kotlin.reflect.p r3 = kotlin.jvm.internal.o0.u(r3)
                kotlin.jvm.internal.PropertyReference1Impl r5 = new kotlin.jvm.internal.PropertyReference1Impl
                java.lang.String r6 = "allFunctions"
                java.lang.String r7 = "getAllFunctions()Ljava/util/List;"
                r5.<init>(r1, r6, r7, r4)
                kotlin.reflect.p r5 = kotlin.jvm.internal.o0.u(r5)
                kotlin.jvm.internal.PropertyReference1Impl r6 = new kotlin.jvm.internal.PropertyReference1Impl
                java.lang.String r7 = "allProperties"
                java.lang.String r8 = "getAllProperties()Ljava/util/List;"
                r6.<init>(r1, r7, r8, r4)
                kotlin.reflect.p r6 = kotlin.jvm.internal.o0.u(r6)
                kotlin.jvm.internal.PropertyReference1Impl r7 = new kotlin.jvm.internal.PropertyReference1Impl
                java.lang.String r8 = "typeAliasesByName"
                java.lang.String r9 = "getTypeAliasesByName()Ljava/util/Map;"
                r7.<init>(r1, r8, r9, r4)
                kotlin.reflect.p r7 = kotlin.jvm.internal.o0.u(r7)
                kotlin.jvm.internal.PropertyReference1Impl r8 = new kotlin.jvm.internal.PropertyReference1Impl
                java.lang.String r9 = "functionsByName"
                java.lang.String r10 = "getFunctionsByName()Ljava/util/Map;"
                r8.<init>(r1, r9, r10, r4)
                kotlin.reflect.p r8 = kotlin.jvm.internal.o0.u(r8)
                kotlin.jvm.internal.PropertyReference1Impl r9 = new kotlin.jvm.internal.PropertyReference1Impl
                java.lang.String r10 = "propertiesByName"
                java.lang.String r11 = "getPropertiesByName()Ljava/util/Map;"
                r9.<init>(r1, r10, r11, r4)
                kotlin.reflect.p r9 = kotlin.jvm.internal.o0.u(r9)
                kotlin.jvm.internal.PropertyReference1Impl r10 = new kotlin.jvm.internal.PropertyReference1Impl
                java.lang.String r11 = "functionNames"
                java.lang.String r12 = "getFunctionNames()Ljava/util/Set;"
                r10.<init>(r1, r11, r12, r4)
                kotlin.reflect.p r10 = kotlin.jvm.internal.o0.u(r10)
                kotlin.jvm.internal.PropertyReference1Impl r11 = new kotlin.jvm.internal.PropertyReference1Impl
                java.lang.String r12 = "variableNames"
                java.lang.String r13 = "getVariableNames()Ljava/util/Set;"
                r11.<init>(r1, r12, r13, r4)
                kotlin.reflect.p r1 = kotlin.jvm.internal.o0.u(r11)
                r11 = 10
                kotlin.reflect.n[] r11 = new kotlin.reflect.n[r11]
                r11[r4] = r0
                r0 = 1
                r11[r0] = r2
                r0 = 2
                r11[r0] = r3
                r0 = 3
                r11[r0] = r5
                r0 = 4
                r11[r0] = r6
                r0 = 5
                r11[r0] = r7
                r0 = 6
                r11[r0] = r8
                r0 = 7
                r11[r0] = r9
                r0 = 8
                r11[r0] = r10
                r0 = 9
                r11[r0] = r1
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b.o = r11
                return
        }

        public b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r2, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> r3, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> r4, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> r5) {
                r1 = this;
                java.lang.String r0 = "functionList"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "propertyList"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "typeAliasList"
                kotlin.jvm.internal.g0.p(r5, r0)
                r1.n = r2
                r1.<init>()
                r1.a = r3
                r1.b = r4
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r2.t()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r3 = r3.c()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.n r3 = r3.g()
                boolean r3 = r3.e()
                if (r3 == 0) goto L2b
                goto L2f
            L2b:
                java.util.List r5 = kotlin.collections.f0.J()
            L2f:
                r1.c = r5
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r2.t()
                kotlin.reflect.jvm.internal.impl.storage.n r3 = r3.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.x r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.x
                r4.<init>(r1)
                kotlin.reflect.jvm.internal.impl.storage.i r3 = r3.e(r4)
                r1.d = r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r2.t()
                kotlin.reflect.jvm.internal.impl.storage.n r3 = r3.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.y r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.y
                r4.<init>(r1)
                kotlin.reflect.jvm.internal.impl.storage.i r3 = r3.e(r4)
                r1.e = r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r2.t()
                kotlin.reflect.jvm.internal.impl.storage.n r3 = r3.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.z r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.z
                r4.<init>(r1)
                kotlin.reflect.jvm.internal.impl.storage.i r3 = r3.e(r4)
                r1.f = r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r2.t()
                kotlin.reflect.jvm.internal.impl.storage.n r3 = r3.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.a0 r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.a0
                r4.<init>(r1)
                kotlin.reflect.jvm.internal.impl.storage.i r3 = r3.e(r4)
                r1.g = r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r2.t()
                kotlin.reflect.jvm.internal.impl.storage.n r3 = r3.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b0 r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b0
                r4.<init>(r1)
                kotlin.reflect.jvm.internal.impl.storage.i r3 = r3.e(r4)
                r1.h = r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r2.t()
                kotlin.reflect.jvm.internal.impl.storage.n r3 = r3.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c0 r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c0
                r4.<init>(r1)
                kotlin.reflect.jvm.internal.impl.storage.i r3 = r3.e(r4)
                r1.i = r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r2.t()
                kotlin.reflect.jvm.internal.impl.storage.n r3 = r3.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d0 r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d0
                r4.<init>(r1)
                kotlin.reflect.jvm.internal.impl.storage.i r3 = r3.e(r4)
                r1.j = r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r2.t()
                kotlin.reflect.jvm.internal.impl.storage.n r3 = r3.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e0 r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e0
                r4.<init>(r1)
                kotlin.reflect.jvm.internal.impl.storage.i r3 = r3.e(r4)
                r1.k = r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r2.t()
                kotlin.reflect.jvm.internal.impl.storage.n r3 = r3.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f0 r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f0
                r4.<init>(r1, r2)
                kotlin.reflect.jvm.internal.impl.storage.i r3 = r3.e(r4)
                r1.l = r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r2.t()
                kotlin.reflect.jvm.internal.impl.storage.n r3 = r3.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g0 r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g0
                r4.<init>(r1, r2)
                kotlin.reflect.jvm.internal.impl.storage.i r2 = r3.e(r4)
                r1.m = r2
                return
        }

        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.i1> A() {
                r5 = this;
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r0 = r5.c
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r1 = r5.n
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r0 = r0.iterator()
            Lf:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L2f
                java.lang.Object r3 = r0.next()
                kotlin.reflect.jvm.internal.impl.protobuf.n r3 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r4 = r1.t()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r4 = r4.f()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) r3
                kotlin.reflect.jvm.internal.impl.descriptors.i1 r3 = r4.A(r3)
                if (r3 == 0) goto Lf
                r2.add(r3)
                goto Lf
            L2f:
                return r2
        }

        private static final java.util.List B(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b r0) {
                java.util.List r0 = r0.w()
                return r0
        }

        private static final java.util.List C(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b r0) {
                java.util.List r0 = r0.z()
                return r0
        }

        private static final java.util.Set D(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b r4, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r5) {
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r0 = r4.a
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
                r1.<init>()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r4 = r4.n
                java.util.Iterator r0 = r0.iterator()
            Lf:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L31
                java.lang.Object r2 = r0.next()
                kotlin.reflect.jvm.internal.impl.protobuf.n r2 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r2
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r4.t()
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3 = r3.g()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r2
                int r2 = r2.getName()
                kotlin.reflect.jvm.internal.impl.name.f r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r3, r2)
                r1.add(r2)
                goto Lf
            L31:
                java.util.Set r4 = r5.x()
                java.util.Set r4 = kotlin.collections.u1.C(r1, r4)
                return r4
        }

        private static final java.util.Map E(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b r4) {
                java.util.List r4 = r4.F()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                java.util.Iterator r4 = r4.iterator()
            Lf:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L39
                java.lang.Object r1 = r4.next()
                r2 = r1
                kotlin.reflect.jvm.internal.impl.descriptors.d1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r2
                kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
                java.lang.String r3 = "getName(...)"
                kotlin.jvm.internal.g0.o(r2, r3)
                java.lang.Object r3 = r0.get(r2)
                if (r3 != 0) goto L33
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r0.put(r2, r3)
            L33:
                java.util.List r3 = (java.util.List) r3
                r3.add(r1)
                goto Lf
            L39:
                return r0
        }

        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.d1> F() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.g
                kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b.o
                r2 = 3
                r1 = r1[r2]
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
                java.util.List r0 = (java.util.List) r0
                return r0
        }

        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.w0> G() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.h
                kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b.o
                r2 = 4
                r1 = r1[r2]
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
                java.util.List r0 = (java.util.List) r0
                return r0
        }

        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.i1> H() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.f
                kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b.o
                r2 = 2
                r1 = r1[r2]
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
                java.util.List r0 = (java.util.List) r0
                return r0
        }

        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.d1> I() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.d
                kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b.o
                r2 = 0
                r1 = r1[r2]
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
                java.util.List r0 = (java.util.List) r0
                return r0
        }

        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.w0> J() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.e
                kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b.o
                r2 = 1
                r1 = r1[r2]
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
                java.util.List r0 = (java.util.List) r0
                return r0
        }

        private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1>> K() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.j
                kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b.o
                r2 = 6
                r1 = r1[r2]
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
                java.util.Map r0 = (java.util.Map) r0
                return r0
        }

        private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0>> L() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.k
                kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b.o
                r2 = 7
                r1 = r1[r2]
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
                java.util.Map r0 = (java.util.Map) r0
                return r0
        }

        private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.i1> M() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.i
                kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b.o
                r2 = 5
                r1 = r1[r2]
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
                java.util.Map r0 = (java.util.Map) r0
                return r0
        }

        private static final java.util.Map N(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b r4) {
                java.util.List r4 = r4.G()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                java.util.Iterator r4 = r4.iterator()
            Lf:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L39
                java.lang.Object r1 = r4.next()
                r2 = r1
                kotlin.reflect.jvm.internal.impl.descriptors.w0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r2
                kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
                java.lang.String r3 = "getName(...)"
                kotlin.jvm.internal.g0.o(r2, r3)
                java.lang.Object r3 = r0.get(r2)
                if (r3 != 0) goto L33
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r0.put(r2, r3)
            L33:
                java.util.List r3 = (java.util.List) r3
                r3.add(r1)
                goto Lf
            L39:
                return r0
        }

        private static final java.util.Map O(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b r4) {
                java.util.List r4 = r4.H()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                r0 = 10
                int r0 = kotlin.collections.f0.d0(r4, r0)
                int r0 = kotlin.collections.i1.j(r0)
                r1 = 16
                int r0 = kotlin.ranges.t.u(r0, r1)
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>(r0)
                java.util.Iterator r4 = r4.iterator()
            L1f:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L39
                java.lang.Object r0 = r4.next()
                r2 = r0
                kotlin.reflect.jvm.internal.impl.descriptors.i1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.i1) r2
                kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
                java.lang.String r3 = "getName(...)"
                kotlin.jvm.internal.g0.o(r2, r3)
                r1.put(r2, r0)
                goto L1f
            L39:
                return r1
        }

        private static final java.util.Set P(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b r4, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r5) {
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r0 = r4.b
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
                r1.<init>()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r4 = r4.n
                java.util.Iterator r0 = r0.iterator()
            Lf:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L31
                java.lang.Object r2 = r0.next()
                kotlin.reflect.jvm.internal.impl.protobuf.n r2 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r2
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r4.t()
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3 = r3.g()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r2
                int r2 = r2.getName()
                kotlin.reflect.jvm.internal.impl.name.f r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r3, r2)
                r1.add(r2)
                goto Lf
            L31:
                java.util.Set r4 = r5.y()
                java.util.Set r4 = kotlin.collections.u1.C(r1, r4)
                return r4
        }

        static /* synthetic */ java.util.List h(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b r0) {
                java.util.List r0 = B(r0)
                return r0
        }

        static /* synthetic */ java.util.List i(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b r0) {
                java.util.List r0 = C(r0)
                return r0
        }

        static /* synthetic */ java.util.List j(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b r0) {
                java.util.List r0 = t(r0)
                return r0
        }

        static /* synthetic */ java.util.List k(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b r0) {
                java.util.List r0 = r(r0)
                return r0
        }

        static /* synthetic */ java.util.List l(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b r0) {
                java.util.List r0 = s(r0)
                return r0
        }

        static /* synthetic */ java.util.Map m(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b r0) {
                java.util.Map r0 = O(r0)
                return r0
        }

        static /* synthetic */ java.util.Map n(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b r0) {
                java.util.Map r0 = E(r0)
                return r0
        }

        static /* synthetic */ java.util.Map o(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b r0) {
                java.util.Map r0 = N(r0)
                return r0
        }

        static /* synthetic */ java.util.Set p(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b r0, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r1) {
                java.util.Set r0 = D(r0, r1)
                return r0
        }

        static /* synthetic */ java.util.Set q(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b r0, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r1) {
                java.util.Set r0 = P(r0, r1)
                return r0
        }

        private static final java.util.List r(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b r1) {
                java.util.List r0 = r1.I()
                java.util.Collection r0 = (java.util.Collection) r0
                java.util.List r1 = r1.u()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.List r1 = kotlin.collections.f0.I4(r0, r1)
                return r1
        }

        private static final java.util.List s(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b r1) {
                java.util.List r0 = r1.J()
                java.util.Collection r0 = (java.util.Collection) r0
                java.util.List r1 = r1.v()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.List r1 = kotlin.collections.f0.I4(r0, r1)
                return r1
        }

        private static final java.util.List t(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b r0) {
                java.util.List r0 = r0.A()
                return r0
        }

        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.d1> u() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r0 = r3.n
                java.util.Set r0 = r0.x()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            Lf:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L25
                java.lang.Object r2 = r0.next()
                kotlin.reflect.jvm.internal.impl.name.f r2 = (kotlin.reflect.jvm.internal.impl.name.f) r2
                java.util.List r2 = r3.x(r2)
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                kotlin.collections.f0.s0(r1, r2)
                goto Lf
            L25:
                return r1
        }

        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.w0> v() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r0 = r3.n
                java.util.Set r0 = r0.y()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            Lf:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L25
                java.lang.Object r2 = r0.next()
                kotlin.reflect.jvm.internal.impl.name.f r2 = (kotlin.reflect.jvm.internal.impl.name.f) r2
                java.util.List r2 = r3.y(r2)
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                kotlin.collections.f0.s0(r1, r2)
                goto Lf
            L25:
                return r1
        }

        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.d1> w() {
                r5 = this;
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r0 = r5.a
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r1 = r5.n
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r0 = r0.iterator()
            Lf:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L37
                java.lang.Object r3 = r0.next()
                kotlin.reflect.jvm.internal.impl.protobuf.n r3 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r4 = r1.t()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r4 = r4.f()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r3
                kotlin.reflect.jvm.internal.impl.descriptors.d1 r3 = r4.s(r3)
                boolean r4 = r1.B(r3)
                if (r4 == 0) goto L30
                goto L31
            L30:
                r3 = 0
            L31:
                if (r3 == 0) goto Lf
                r2.add(r3)
                goto Lf
            L37:
                return r2
        }

        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.d1> x(kotlin.reflect.jvm.internal.impl.name.f r6) {
                r5 = this;
                java.util.List r0 = r5.I()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r1 = r5.n
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r0 = r0.iterator()
            L11:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L2c
                java.lang.Object r3 = r0.next()
                r4 = r3
                kotlin.reflect.jvm.internal.impl.descriptors.k r4 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r4
                kotlin.reflect.jvm.internal.impl.name.f r4 = r4.getName()
                boolean r4 = kotlin.jvm.internal.g0.g(r4, r6)
                if (r4 == 0) goto L11
                r2.add(r3)
                goto L11
            L2c:
                int r0 = r2.size()
                r1.o(r6, r2)
                int r6 = r2.size()
                java.util.List r6 = r2.subList(r0, r6)
                return r6
        }

        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.w0> y(kotlin.reflect.jvm.internal.impl.name.f r6) {
                r5 = this;
                java.util.List r0 = r5.J()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r1 = r5.n
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r0 = r0.iterator()
            L11:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L2c
                java.lang.Object r3 = r0.next()
                r4 = r3
                kotlin.reflect.jvm.internal.impl.descriptors.k r4 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r4
                kotlin.reflect.jvm.internal.impl.name.f r4 = r4.getName()
                boolean r4 = kotlin.jvm.internal.g0.g(r4, r6)
                if (r4 == 0) goto L11
                r2.add(r3)
                goto L11
            L2c:
                int r0 = r2.size()
                r1.p(r6, r2)
                int r6 = r2.size()
                java.util.List r6 = r2.subList(r0, r6)
                return r6
        }

        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.w0> z() {
                r8 = this;
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r0 = r8.b
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r1 = r8.n
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r0 = r0.iterator()
            Lf:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L32
                java.lang.Object r3 = r0.next()
                kotlin.reflect.jvm.internal.impl.protobuf.n r3 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r4 = r1.t()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r4 = r4.f()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r3
                r5 = 2
                r6 = 0
                r7 = 0
                kotlin.reflect.jvm.internal.impl.descriptors.w0 r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0.v(r4, r3, r7, r5, r6)
                if (r3 == 0) goto Lf
                r2.add(r3)
                goto Lf
            L32:
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.a
        @org.jetbrains.annotations.NotNull
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "location"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.util.Set r3 = r1.b()
                boolean r3 = r3.contains(r2)
                if (r3 != 0) goto L1b
                java.util.List r2 = kotlin.collections.f0.J()
                java.util.Collection r2 = (java.util.Collection) r2
                return r2
            L1b:
                java.util.Map r3 = r1.K()
                java.lang.Object r2 = r3.get(r2)
                java.util.Collection r2 = (java.util.Collection) r2
                if (r2 != 0) goto L2d
                java.util.List r2 = kotlin.collections.f0.J()
                java.util.Collection r2 = (java.util.Collection) r2
            L2d:
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.a
        @org.jetbrains.annotations.NotNull
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.l
                kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b.o
                r2 = 8
                r1 = r1[r2]
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
                java.util.Set r0 = (java.util.Set) r0
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.a
        @org.jetbrains.annotations.NotNull
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "location"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.util.Set r3 = r1.d()
                boolean r3 = r3.contains(r2)
                if (r3 != 0) goto L1b
                java.util.List r2 = kotlin.collections.f0.J()
                java.util.Collection r2 = (java.util.Collection) r2
                return r2
            L1b:
                java.util.Map r3 = r1.L()
                java.lang.Object r2 = r3.get(r2)
                java.util.Collection r2 = (java.util.Collection) r2
                if (r2 != 0) goto L2d
                java.util.List r2 = kotlin.collections.f0.J()
                java.util.Collection r2 = (java.util.Collection) r2
            L2d:
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.a
        @org.jetbrains.annotations.NotNull
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.m
                kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.b.o
                r2 = 9
                r1 = r1[r2]
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
                java.util.Set r0 = (java.util.Set) r0
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.a
        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.descriptors.i1 e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.Map r0 = r1.M()
                java.lang.Object r2 = r0.get(r2)
                kotlin.reflect.jvm.internal.impl.descriptors.i1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.i1) r2
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.a
        @org.jetbrains.annotations.NotNull
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
                r5 = this;
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r0 = r5.c
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
                r1.<init>()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r2 = r5.n
                java.util.Iterator r0 = r0.iterator()
            Lf:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L31
                java.lang.Object r3 = r0.next()
                kotlin.reflect.jvm.internal.impl.protobuf.n r3 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r4 = r2.t()
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r4 = r4.g()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) r3
                int r3 = r3.getName()
                kotlin.reflect.jvm.internal.impl.name.f r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r4, r3)
                r1.add(r3)
                goto Lf
            L31:
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.a
        public void g(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r6, @org.jetbrains.annotations.NotNull t3.b r7) {
                r3 = this;
                java.lang.String r0 = "result"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "kindFilter"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "nameFilter"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "location"
                kotlin.jvm.internal.g0.p(r7, r0)
                kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a r7 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.c
                int r7 = r7.i()
                boolean r7 = r5.a(r7)
                java.lang.String r0 = "getName(...)"
                if (r7 == 0) goto L50
                java.util.List r7 = r3.G()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L2c:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L50
                java.lang.Object r1 = r7.next()
                r2 = r1
                kotlin.reflect.jvm.internal.impl.descriptors.w0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r2
                kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
                kotlin.jvm.internal.g0.o(r2, r0)
                java.lang.Object r2 = r6.invoke(r2)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L2c
                r4.add(r1)
                goto L2c
            L50:
                kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a r7 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.c
                int r7 = r7.d()
                boolean r5 = r5.a(r7)
                if (r5 == 0) goto L8a
                java.util.List r5 = r3.F()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
            L66:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L8a
                java.lang.Object r7 = r5.next()
                r1 = r7
                kotlin.reflect.jvm.internal.impl.descriptors.d1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r1
                kotlin.reflect.jvm.internal.impl.name.f r1 = r1.getName()
                kotlin.jvm.internal.g0.o(r1, r0)
                java.lang.Object r1 = r6.invoke(r1)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L66
                r4.add(r7)
                goto L66
            L8a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$OptimizedImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n269#1:513\n269#1:528\n269#1:543\n287#1,17:581\n305#1,2:604\n296#1:606\n303#1:607\n305#1,2:613\n287#1,17:620\n305#1,2:642\n296#1:644\n370#1,11:645\n370#1,11:656\n1491#2:514\n1516#2,3:515\n1519#2,3:525\n1491#2:529\n1516#2,3:530\n1519#2,3:540\n1491#2:544\n1516#2,3:545\n1519#2,3:555\n1252#2,2:560\n1563#2:562\n1634#2,3:563\n1255#2:566\n1491#2:567\n1516#2,3:568\n1519#2,3:578\n1625#2:598\n1869#2:599\n1870#2:602\n1626#2:603\n1625#2:608\n1869#2:609\n1870#2:611\n1626#2:612\n1625#2:615\n1869#2:616\n1870#2:618\n1626#2:619\n1625#2:637\n1869#2:638\n1870#2:640\n1626#2:641\n382#3,7:518\n382#3,7:533\n382#3,7:548\n463#3:558\n413#3:559\n382#3,7:571\n1#4:600\n1#4:601\n1#4:610\n1#4:617\n1#4:639\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$OptimizedImplementation\n*L\n233#1:513\n235#1:528\n239#1:543\n272#1:581,17\n272#1:604,2\n272#1:606\n287#1:607\n287#1:613,2\n310#1:620,17\n310#1:642,2\n310#1:644\n348#1:645,11\n356#1:656,11\n233#1:514\n233#1:515,3\n233#1:525,3\n235#1:529\n235#1:530,3\n235#1:540,3\n239#1:544\n239#1:545,3\n239#1:555,3\n244#1:560,2\n246#1:562\n246#1:563,3\n244#1:566\n269#1:567\n269#1:568,3\n269#1:578,3\n272#1:598\n272#1:599\n272#1:602\n272#1:603\n287#1:608\n287#1:609\n287#1:611\n287#1:612\n303#1:615\n303#1:616\n303#1:618\n303#1:619\n310#1:637\n310#1:638\n310#1:640\n310#1:641\n233#1:518,7\n235#1:533,7\n239#1:548,7\n244#1:558\n244#1:559\n269#1:571,7\n272#1:601\n287#1:610\n303#1:617\n310#1:639\n*E\n"})
    private final class c implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.a {
        static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] j = null;

        @org.jetbrains.annotations.NotNull
        private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> a;

        @org.jetbrains.annotations.NotNull
        private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> b;

        @org.jetbrains.annotations.NotNull
        private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> c;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1>> d;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0>> e;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.i1> f;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.storage.i g;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.storage.i h;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w i;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1\n*L\n1#1,512:1\n*E\n"})
        public static final class a implements kotlin.jvm.functions.Function0<java.lang.Object> {
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.p<java.lang.Object> a;
            final /* synthetic */ java.io.ByteArrayInputStream b;
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w c;

            public a(kotlin.reflect.jvm.internal.impl.protobuf.p<java.lang.Object> r1, java.io.ByteArrayInputStream r2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r3) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.c = r3
                    r0.<init>()
                    return
            }

            public final java.lang.Object a() {
                    r3 = this;
                    kotlin.reflect.jvm.internal.impl.protobuf.p<java.lang.Object> r0 = r3.a
                    java.io.ByteArrayInputStream r1 = r3.b
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r2 = r3.c
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r2.t()
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2 = r2.c()
                    kotlin.reflect.jvm.internal.impl.protobuf.f r2 = r2.k()
                    java.lang.Object r0 = r0.a(r1, r2)
                    kotlin.reflect.jvm.internal.impl.protobuf.n r0 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r0
                    return r0
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                    r1 = this;
                    kotlin.reflect.jvm.internal.impl.protobuf.n r0 = r1.a()
                    return r0
            }
        }

        static {
                kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
                java.lang.Class<kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$c> r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.c.class
                java.lang.String r2 = "functionNames"
                java.lang.String r3 = "getFunctionNames()Ljava/util/Set;"
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
                kotlin.jvm.internal.PropertyReference1Impl r2 = new kotlin.jvm.internal.PropertyReference1Impl
                java.lang.String r3 = "variableNames"
                java.lang.String r5 = "getVariableNames()Ljava/util/Set;"
                r2.<init>(r1, r3, r5, r4)
                kotlin.reflect.p r1 = kotlin.jvm.internal.o0.u(r2)
                r2 = 2
                kotlin.reflect.n[] r2 = new kotlin.reflect.n[r2]
                r2[r4] = r0
                r0 = 1
                r2[r0] = r1
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.c.j = r2
                return
        }

        public c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r5, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> r6, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> r7, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> r8) {
                r4 = this;
                java.lang.String r0 = "functionList"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "propertyList"
                kotlin.jvm.internal.g0.p(r7, r0)
                java.lang.String r0 = "typeAliasList"
                kotlin.jvm.internal.g0.p(r8, r0)
                r4.i = r5
                r4.<init>()
                java.util.Collection r6 = (java.util.Collection) r6
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                java.util.Iterator r6 = r6.iterator()
            L21:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L54
                java.lang.Object r1 = r6.next()
                r2 = r1
                kotlin.reflect.jvm.internal.impl.protobuf.n r2 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r2
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r5.t()
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3 = r3.g()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r2
                int r2 = r2.getName()
                kotlin.reflect.jvm.internal.impl.name.f r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r3, r2)
                java.lang.Object r3 = r0.get(r2)
                if (r3 != 0) goto L4e
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r0.put(r2, r3)
            L4e:
                java.util.List r3 = (java.util.List) r3
                r3.add(r1)
                goto L21
            L54:
                java.util.Map r5 = r4.r(r0)
                r4.a = r5
                java.util.Collection r7 = (java.util.Collection) r7
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r5 = r4.i
                java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
                r6.<init>()
                java.util.Iterator r7 = r7.iterator()
            L69:
                boolean r0 = r7.hasNext()
                if (r0 == 0) goto L9c
                java.lang.Object r0 = r7.next()
                r1 = r0
                kotlin.reflect.jvm.internal.impl.protobuf.n r1 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r1
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r5.t()
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2 = r2.g()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r1
                int r1 = r1.getName()
                kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r2, r1)
                java.lang.Object r2 = r6.get(r1)
                if (r2 != 0) goto L96
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r6.put(r1, r2)
            L96:
                java.util.List r2 = (java.util.List) r2
                r2.add(r0)
                goto L69
            L9c:
                java.util.Map r5 = r4.r(r6)
                r4.b = r5
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r5 = r4.i
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r5 = r5.t()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r5 = r5.c()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.n r5 = r5.g()
                boolean r5 = r5.e()
                if (r5 == 0) goto Lfd
                java.util.Collection r8 = (java.util.Collection) r8
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r5 = r4.i
                java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
                r6.<init>()
                java.util.Iterator r7 = r8.iterator()
            Lc5:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto Lf8
                java.lang.Object r8 = r7.next()
                r0 = r8
                kotlin.reflect.jvm.internal.impl.protobuf.n r0 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r0
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r5.t()
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r1 = r1.g()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) r0
                int r0 = r0.getName()
                kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r1, r0)
                java.lang.Object r1 = r6.get(r0)
                if (r1 != 0) goto Lf2
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r6.put(r0, r1)
            Lf2:
                java.util.List r1 = (java.util.List) r1
                r1.add(r8)
                goto Lc5
            Lf8:
                java.util.Map r5 = r4.r(r6)
                goto L101
            Lfd:
                java.util.Map r5 = kotlin.collections.i1.z()
            L101:
                r4.c = r5
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r5 = r4.i
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r5 = r5.t()
                kotlin.reflect.jvm.internal.impl.storage.n r5 = r5.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h0 r6 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h0
                r6.<init>(r4)
                kotlin.reflect.jvm.internal.impl.storage.g r5 = r5.i(r6)
                r4.d = r5
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r5 = r4.i
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r5 = r5.t()
                kotlin.reflect.jvm.internal.impl.storage.n r5 = r5.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i0 r6 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i0
                r6.<init>(r4)
                kotlin.reflect.jvm.internal.impl.storage.g r5 = r5.i(r6)
                r4.e = r5
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r5 = r4.i
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r5 = r5.t()
                kotlin.reflect.jvm.internal.impl.storage.n r5 = r5.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.j0 r6 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.j0
                r6.<init>(r4)
                kotlin.reflect.jvm.internal.impl.storage.h r5 = r5.c(r6)
                r4.f = r5
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r5 = r4.i
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r5 = r5.t()
                kotlin.reflect.jvm.internal.impl.storage.n r5 = r5.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r6 = r4.i
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k0 r7 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k0
                r7.<init>(r4, r6)
                kotlin.reflect.jvm.internal.impl.storage.i r5 = r5.e(r7)
                r4.g = r5
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r5 = r4.i
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r5 = r5.t()
                kotlin.reflect.jvm.internal.impl.storage.n r5 = r5.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r6 = r4.i
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l0 r7 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l0
                r7.<init>(r4, r6)
                kotlin.reflect.jvm.internal.impl.storage.i r5 = r5.e(r7)
                r4.h = r5
                return
        }

        static /* synthetic */ java.util.Collection h(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.c r0, kotlin.reflect.jvm.internal.impl.name.f r1) {
                java.util.Collection r0 = q(r0, r1)
                return r0
        }

        static /* synthetic */ java.util.Collection i(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.c r0, kotlin.reflect.jvm.internal.impl.name.f r1) {
                java.util.Collection r0 = s(r0, r1)
                return r0
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.i1 j(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.c r0, kotlin.reflect.jvm.internal.impl.name.f r1) {
                kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = t(r0, r1)
                return r0
        }

        static /* synthetic */ java.util.Set k(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.c r0, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r1) {
                java.util.Set r0 = p(r0, r1)
                return r0
        }

        static /* synthetic */ java.util.Set l(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.c r0, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r1) {
                java.util.Set r0 = u(r0, r1)
                return r0
        }

        private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> m(kotlin.reflect.jvm.internal.impl.name.f r6) {
                r5 = this;
                java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> r0 = r5.a
                kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.PARSER
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.g0.o(r1, r2)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r2 = r5.i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2c
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r3 = r5.i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$c$a r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$c$a
                r0.<init>(r1, r4, r3)
                kotlin.sequences.m r0 = kotlin.sequences.p.u(r0)
                java.util.List r0 = kotlin.sequences.p.I3(r0)
                if (r0 == 0) goto L2c
                java.util.Collection r0 = (java.util.Collection) r0
                goto L32
            L2c:
                java.util.List r0 = kotlin.collections.f0.J()
                java.util.Collection r0 = (java.util.Collection) r0
            L32:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r0.size()
                r3.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L42:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L6b
                java.lang.Object r1 = r0.next()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r1
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r4 = r2.t()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r4 = r4.f()
                kotlin.jvm.internal.g0.m(r1)
                kotlin.reflect.jvm.internal.impl.descriptors.d1 r1 = r4.s(r1)
                boolean r4 = r2.B(r1)
                if (r4 == 0) goto L64
                goto L65
            L64:
                r1 = 0
            L65:
                if (r1 == 0) goto L42
                r3.add(r1)
                goto L42
            L6b:
                r2.o(r6, r3)
                java.util.List r6 = kotlin.reflect.jvm.internal.impl.utils.a.c(r3)
                java.util.Collection r6 = (java.util.Collection) r6
                return r6
        }

        private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> n(kotlin.reflect.jvm.internal.impl.name.f r9) {
                r8 = this;
                java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> r0 = r8.b
                kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.PARSER
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.g0.o(r1, r2)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r2 = r8.i
                java.lang.Object r0 = r0.get(r9)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2c
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r3 = r8.i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$c$a r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$c$a
                r0.<init>(r1, r4, r3)
                kotlin.sequences.m r0 = kotlin.sequences.p.u(r0)
                java.util.List r0 = kotlin.sequences.p.I3(r0)
                if (r0 == 0) goto L2c
                java.util.Collection r0 = (java.util.Collection) r0
                goto L32
            L2c:
                java.util.List r0 = kotlin.collections.f0.J()
                java.util.Collection r0 = (java.util.Collection) r0
            L32:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r0.size()
                r3.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L42:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L66
                java.lang.Object r1 = r0.next()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r1
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r4 = r2.t()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r4 = r4.f()
                kotlin.jvm.internal.g0.m(r1)
                r5 = 2
                r6 = 0
                r7 = 0
                kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0.v(r4, r1, r7, r5, r6)
                if (r1 == 0) goto L42
                r3.add(r1)
                goto L42
            L66:
                r2.p(r9, r3)
                java.util.List r9 = kotlin.reflect.jvm.internal.impl.utils.a.c(r3)
                java.util.Collection r9 = (java.util.Collection) r9
                return r9
        }

        private final kotlin.reflect.jvm.internal.impl.descriptors.i1 o(kotlin.reflect.jvm.internal.impl.name.f r3) {
                r2 = this;
                java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> r0 = r2.c
                java.lang.Object r3 = r0.get(r3)
                byte[] r3 = (byte[]) r3
                r0 = 0
                if (r3 != 0) goto Lc
                return r0
            Lc:
                java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
                r1.<init>(r3)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r3 = r2.i
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r3.t()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r3 = r3.c()
                kotlin.reflect.jvm.internal.impl.protobuf.f r3 = r3.k()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r3 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.parseDelimitedFrom(r1, r3)
                if (r3 != 0) goto L26
                return r0
            L26:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r0 = r2.i
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r0.t()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r0 = r0.f()
                kotlin.reflect.jvm.internal.impl.descriptors.i1 r3 = r0.A(r3)
                return r3
        }

        private static final java.util.Set p(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.c r0, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r1) {
                java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> r0 = r0.a
                java.util.Set r0 = r0.keySet()
                java.util.Set r1 = r1.x()
                java.util.Set r0 = kotlin.collections.u1.C(r0, r1)
                return r0
        }

        private static final java.util.Collection q(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.c r1, kotlin.reflect.jvm.internal.impl.name.f r2) {
                java.lang.String r0 = "it"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.Collection r1 = r1.m(r2)
                return r1
        }

        private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> r(java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.protobuf.a>> r7) {
                r6 = this;
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                int r1 = r7.size()
                int r1 = kotlin.collections.i1.j(r1)
                r0.<init>(r1)
                java.util.Set r7 = r7.entrySet()
                java.util.Iterator r7 = r7.iterator()
            L15:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L5c
                java.lang.Object r1 = r7.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
                r3.<init>()
                java.lang.Object r1 = r1.getValue()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 10
                int r5 = kotlin.collections.f0.d0(r1, r5)
                r4.<init>(r5)
                java.util.Iterator r1 = r1.iterator()
            L3f:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L54
                java.lang.Object r5 = r1.next()
                kotlin.reflect.jvm.internal.impl.protobuf.a r5 = (kotlin.reflect.jvm.internal.impl.protobuf.a) r5
                r5.writeDelimitedTo(r3)
                kotlin.n1 r5 = kotlin.n1.a
                r4.add(r5)
                goto L3f
            L54:
                byte[] r1 = r3.toByteArray()
                r0.put(r2, r1)
                goto L15
            L5c:
                return r0
        }

        private static final java.util.Collection s(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.c r1, kotlin.reflect.jvm.internal.impl.name.f r2) {
                java.lang.String r0 = "it"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.Collection r1 = r1.n(r2)
                return r1
        }

        private static final kotlin.reflect.jvm.internal.impl.descriptors.i1 t(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.c r1, kotlin.reflect.jvm.internal.impl.name.f r2) {
                java.lang.String r0 = "it"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.i1 r1 = r1.o(r2)
                return r1
        }

        private static final java.util.Set u(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.c r0, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r1) {
                java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> r0 = r0.b
                java.util.Set r0 = r0.keySet()
                java.util.Set r1 = r1.y()
                java.util.Set r0 = kotlin.collections.u1.C(r0, r1)
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.a
        @org.jetbrains.annotations.NotNull
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "location"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.util.Set r3 = r1.b()
                boolean r3 = r3.contains(r2)
                if (r3 != 0) goto L1b
                java.util.List r2 = kotlin.collections.f0.J()
                java.util.Collection r2 = (java.util.Collection) r2
                return r2
            L1b:
                kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1>> r3 = r1.d
                java.lang.Object r2 = r3.invoke(r2)
                java.util.Collection r2 = (java.util.Collection) r2
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.a
        @org.jetbrains.annotations.NotNull
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.g
                kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.c.j
                r2 = 0
                r1 = r1[r2]
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
                java.util.Set r0 = (java.util.Set) r0
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.a
        @org.jetbrains.annotations.NotNull
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "location"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.util.Set r3 = r1.d()
                boolean r3 = r3.contains(r2)
                if (r3 != 0) goto L1b
                java.util.List r2 = kotlin.collections.f0.J()
                java.util.Collection r2 = (java.util.Collection) r2
                return r2
            L1b:
                kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0>> r3 = r1.e
                java.lang.Object r2 = r3.invoke(r2)
                java.util.Collection r2 = (java.util.Collection) r2
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.a
        @org.jetbrains.annotations.NotNull
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.h
                kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.c.j
                r2 = 1
                r1 = r1[r2]
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
                java.util.Set r0 = (java.util.Set) r0
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.a
        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.descriptors.i1 e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.i1> r0 = r1.f
                java.lang.Object r2 = r0.invoke(r2)
                kotlin.reflect.jvm.internal.impl.descriptors.i1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.i1) r2
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.a
        @org.jetbrains.annotations.NotNull
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
                r1 = this;
                java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> r0 = r1.c
                java.util.Set r0 = r0.keySet()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.a
        public void g(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r8, @org.jetbrains.annotations.NotNull t3.b r9) {
                r5 = this;
                java.lang.String r0 = "result"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "kindFilter"
                kotlin.jvm.internal.g0.p(r7, r0)
                java.lang.String r0 = "nameFilter"
                kotlin.jvm.internal.g0.p(r8, r0)
                java.lang.String r0 = "location"
                kotlin.jvm.internal.g0.p(r9, r0)
                kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.c
                int r0 = r0.i()
                boolean r0 = r7.a(r0)
                java.lang.String r1 = "INSTANCE"
                if (r0 == 0) goto L5a
                java.util.Set r0 = r5.d()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r0 = r0.iterator()
            L2f:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L4f
                java.lang.Object r3 = r0.next()
                kotlin.reflect.jvm.internal.impl.name.f r3 = (kotlin.reflect.jvm.internal.impl.name.f) r3
                java.lang.Object r4 = r8.invoke(r3)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L2f
                java.util.Collection r3 = r5.c(r3, r9)
                r2.addAll(r3)
                goto L2f
            L4f:
                kotlin.reflect.jvm.internal.impl.resolve.k$b r0 = kotlin.reflect.jvm.internal.impl.resolve.k.b.a
                kotlin.jvm.internal.g0.o(r0, r1)
                kotlin.collections.f0.r0(r2, r0)
                r6.addAll(r2)
            L5a:
                kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.c
                int r0 = r0.d()
                boolean r7 = r7.a(r0)
                if (r7 == 0) goto L9e
                java.util.Set r7 = r5.b()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r7 = r7.iterator()
            L73:
                boolean r2 = r7.hasNext()
                if (r2 == 0) goto L93
                java.lang.Object r2 = r7.next()
                kotlin.reflect.jvm.internal.impl.name.f r2 = (kotlin.reflect.jvm.internal.impl.name.f) r2
                java.lang.Object r3 = r8.invoke(r2)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L73
                java.util.Collection r2 = r5.a(r2, r9)
                r0.addAll(r2)
                goto L73
            L93:
                kotlin.reflect.jvm.internal.impl.resolve.k$b r7 = kotlin.reflect.jvm.internal.impl.resolve.k.b.a
                kotlin.jvm.internal.g0.o(r7, r1)
                kotlin.collections.f0.r0(r0, r7)
                r6.addAll(r0)
            L9e:
                return
        }
    }

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w> r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.class
            java.lang.String r2 = "classNames"
            java.lang.String r3 = "getClassNames$deserialization()Ljava/util/Set;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            kotlin.jvm.internal.PropertyReference1Impl r2 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.String r3 = "classifierNamesLazy"
            java.lang.String r5 = "getClassifierNamesLazy()Ljava/util/Set;"
            r2.<init>(r1, r3, r5, r4)
            kotlin.reflect.p r1 = kotlin.jvm.internal.o0.u(r2)
            r2 = 2
            kotlin.reflect.n[] r2 = new kotlin.reflect.n[r2]
            r2[r4] = r0
            r0 = 1
            r2[r0] = r1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.f = r2
            return
    }

    protected w(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> r3, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> r4, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends java.util.Collection<kotlin.reflect.jvm.internal.impl.name.f>> r6) {
            r1 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "functionList"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "propertyList"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "typeAliasList"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "classNames"
            kotlin.jvm.internal.g0.p(r6, r0)
            r1.<init>()
            r1.b = r2
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$a r3 = r1.r(r3, r4, r5)
            r1.c = r3
            kotlin.reflect.jvm.internal.impl.storage.n r3 = r2.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.u r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.u
            r4.<init>(r6)
            kotlin.reflect.jvm.internal.impl.storage.i r3 = r3.e(r4)
            r1.d = r3
            kotlin.reflect.jvm.internal.impl.storage.n r2 = r2.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.v r3 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.v
            r3.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.j r2 = r2.g(r3)
            r1.e = r2
            return
    }

    static /* synthetic */ java.util.Set i(kotlin.jvm.functions.Function0 r0) {
            java.util.Set r0 = l(r0)
            return r0
    }

    static /* synthetic */ java.util.Set j(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r0) {
            java.util.Set r0 = m(r0)
            return r0
    }

    private static final java.util.Set l(kotlin.jvm.functions.Function0 r0) {
            java.lang.Object r0 = r0.invoke()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = kotlin.collections.f0.f6(r0)
            return r0
    }

    private static final java.util.Set m(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r2) {
            java.util.Set r0 = r2.w()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.util.Set r1 = r2.u()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$a r2 = r2.c
            java.util.Set r2 = r2.f()
            java.util.Set r2 = kotlin.collections.u1.C(r1, r2)
            java.util.Set r2 = kotlin.collections.u1.C(r2, r0)
            return r2
    }

    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.a r(java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> r2, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> r3, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> r4) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r1.b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r0.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.n r0 = r0.g()
            boolean r0 = r0.c()
            if (r0 == 0) goto L16
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$b r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$b
            r0.<init>(r1, r2, r3, r4)
            return r0
        L16:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$c r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$c
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d s(kotlin.reflect.jvm.internal.impl.name.f r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r1.b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r0.c()
            kotlin.reflect.jvm.internal.impl.name.b r2 = r1.q(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r0.b(r2)
            return r2
    }

    private final java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> v() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.j r0 = r3.e
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.f
            r2 = 1
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.b(r0, r3, r1)
            java.util.Set r0 = (java.util.Set) r0
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.i1 z(kotlin.reflect.jvm.internal.impl.name.f r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$a r0 = r1.c
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r2 = r0.e(r2)
            return r2
    }

    protected boolean A(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set r0 = r1.u()
            boolean r2 = r0.contains(r2)
            return r2
    }

    protected boolean B(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d1 r2) {
            r1 = this;
            java.lang.String r0 = "function"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 1
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$a r0 = r1.c
            java.util.Collection r2 = r0.a(r2, r3)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$a r0 = r1.c
            java.util.Set r0 = r0.b()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$a r0 = r1.c
            java.util.Collection r2 = r0.c(r2, r3)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$a r0 = r1.c
            java.util.Set r0 = r0.d()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.Nullable
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
            r1 = this;
            java.util.Set r0 = r1.v()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.f g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r3 = r1.A(r2)
            if (r3 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r1.s(r2)
            return r2
        L15:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$a r3 = r1.c
            java.util.Set r3 = r3.f()
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto L26
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r2 = r1.z(r2)
            return r2
        L26:
            r2 = 0
            return r2
    }

    protected abstract void k(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r2);

    @org.jetbrains.annotations.NotNull
    protected final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r5, @org.jetbrains.annotations.NotNull t3.b r6) {
            r3 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a r1 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.c
            int r2 = r1.g()
            boolean r2 = r4.a(r2)
            if (r2 == 0) goto L24
            r3.k(r0, r5)
        L24:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$a r2 = r3.c
            r2.g(r0, r4, r5, r6)
            int r6 = r1.c()
            boolean r6 = r4.a(r6)
            if (r6 == 0) goto L5b
            java.util.Set r6 = r3.u()
            java.util.Iterator r6 = r6.iterator()
        L3b:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r6.next()
            kotlin.reflect.jvm.internal.impl.name.f r1 = (kotlin.reflect.jvm.internal.impl.name.f) r1
            java.lang.Object r2 = r5.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L3b
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r3.s(r1)
            kotlin.reflect.jvm.internal.impl.utils.a.a(r0, r1)
            goto L3b
        L5b:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a r6 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.c
            int r6 = r6.h()
            boolean r4 = r4.a(r6)
            if (r4 == 0) goto L93
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$a r4 = r3.c
            java.util.Set r4 = r4.f()
            java.util.Iterator r4 = r4.iterator()
        L71:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L93
            java.lang.Object r6 = r4.next()
            kotlin.reflect.jvm.internal.impl.name.f r6 = (kotlin.reflect.jvm.internal.impl.name.f) r6
            java.lang.Object r1 = r5.invoke(r6)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L71
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w$a r1 = r3.c
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r6 = r1.e(r6)
            kotlin.reflect.jvm.internal.impl.utils.a.a(r0, r6)
            goto L71
        L93:
            java.util.List r4 = kotlin.reflect.jvm.internal.impl.utils.a.c(r0)
            java.util.Collection r4 = (java.util.Collection) r4
            return r4
    }

    protected void o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.d1> r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "functions"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    protected void p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.w0> r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "descriptors"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    protected abstract kotlin.reflect.jvm.internal.impl.name.b q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1);

    @org.jetbrains.annotations.NotNull
    protected final kotlin.reflect.jvm.internal.impl.serialization.deserialization.o t() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> u() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.d
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w.f
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
            java.util.Set r0 = (java.util.Set) r0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    protected abstract java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> w();

    @org.jetbrains.annotations.NotNull
    protected abstract java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> x();

    @org.jetbrains.annotations.NotNull
    protected abstract java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> y();
}
