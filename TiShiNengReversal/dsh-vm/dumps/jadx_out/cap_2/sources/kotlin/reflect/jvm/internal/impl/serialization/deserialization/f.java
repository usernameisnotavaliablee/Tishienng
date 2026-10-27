package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAnnotationDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/AnnotationDeserializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n121#1:147\n121#1:148\n121#1:149\n121#1:150\n1208#2,2:128\n1236#2,4:130\n1617#2,9:134\n1869#2:143\n1870#2:145\n1626#2:146\n1563#2:151\n1634#2,3:152\n1740#2,3:155\n1#3:144\n*S KotlinDebug\n*F\n+ 1 AnnotationDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/AnnotationDeserializer\n*L\n74#1:147\n76#1:148\n77#1:149\n78#1:150\n47#1:128,2\n47#1:130,4\n48#1:134,9\n48#1:143\n48#1:145\n48#1:146\n87#1:151\n87#1:152,3\n112#1:155,3\n48#1:144\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.f0 a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.k0 b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type[] r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BYTE     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.CHAR     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.SHORT     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.INT     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L2b:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.LONG     // Catch: java.lang.NoSuchFieldError -> L34
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L34
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L34
            L34:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.FLOAT     // Catch: java.lang.NoSuchFieldError -> L3d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
            L3d:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L46
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L46
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L46
            L46:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L50
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L50
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L50
            L50:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.STRING     // Catch: java.lang.NoSuchFieldError -> L5a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5a
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5a
            L5a:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.CLASS     // Catch: java.lang.NoSuchFieldError -> L64
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L64
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L64
            L64:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ENUM     // Catch: java.lang.NoSuchFieldError -> L6e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6e
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6e
            L6e:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ANNOTATION     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ARRAY     // Catch: java.lang.NoSuchFieldError -> L82
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L82
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L82
            L82:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.f.a.a = r0
                return
        }
    }

    public f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k0 r3) {
            r1 = this;
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "notFoundClasses"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    private final boolean b(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> r7, kotlin.reflect.jvm.internal.impl.types.t0 r8, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value r9) {
            r6 = this;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r0 = r9.getType()
            if (r0 != 0) goto L8
            r0 = -1
            goto L10
        L8:
            int[] r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.f.a.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L10:
            r1 = 10
            r2 = 1
            r3 = 0
            if (r0 == r1) goto Lae
            r1 = 13
            if (r0 == r1) goto L25
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r9 = r6.a
            kotlin.reflect.jvm.internal.impl.types.t0 r7 = r7.getType(r9)
            boolean r7 = kotlin.jvm.internal.g0.g(r7, r8)
            return r7
        L25:
            boolean r0 = r7 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b
            if (r0 == 0) goto L93
            r0 = r7
            kotlin.reflect.jvm.internal.impl.resolve.constants.b r0 = (kotlin.reflect.jvm.internal.impl.resolve.constants.b) r0
            java.lang.Object r0 = r0.a()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            java.util.List r1 = r9.getArrayElementList()
            int r1 = r1.size()
            if (r0 != r1) goto L93
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = r6.c()
            kotlin.reflect.jvm.internal.impl.types.t0 r8 = r0.l(r8)
            if (r8 != 0) goto L4b
            return r3
        L4b:
            kotlin.reflect.jvm.internal.impl.resolve.constants.b r7 = (kotlin.reflect.jvm.internal.impl.resolve.constants.b) r7
            java.lang.Object r0 = r7.a()
            java.util.Collection r0 = (java.util.Collection) r0
            kotlin.ranges.m r0 = kotlin.collections.f0.K(r0)
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L65
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L65
            return r2
        L65:
            java.util.Iterator r0 = r0.iterator()
        L69:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L92
            r1 = r0
            kotlin.collections.d1 r1 = (kotlin.collections.d1) r1
            int r1 = r1.nextInt()
            java.lang.Object r4 = r7.a()
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r4 = r4.get(r1)
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r4 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r4
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r1 = r9.getArrayElement(r1)
            java.lang.String r5 = "getArrayElement(...)"
            kotlin.jvm.internal.g0.o(r1, r5)
            boolean r1 = r6.b(r4, r8, r1)
            if (r1 != 0) goto L69
            return r3
        L92:
            return r2
        L93:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Deserialized ArrayValue should have the same number of elements as the original array value: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        Lae:
            kotlin.reflect.jvm.internal.impl.types.w1 r7 = r8.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r7 = r7.c()
            boolean r8 = r7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r8 == 0) goto Lbd
            kotlin.reflect.jvm.internal.impl.descriptors.d r7 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r7
            goto Lbe
        Lbd:
            r7 = 0
        Lbe:
            if (r7 == 0) goto Lc8
            boolean r7 = kotlin.reflect.jvm.internal.impl.builtins.j.m0(r7)
            if (r7 == 0) goto Lc7
            goto Lc8
        Lc7:
            return r3
        Lc8:
            return r2
    }

    private final kotlin.reflect.jvm.internal.impl.builtins.j c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = r1.a
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = r0.p()
            return r0
    }

    private final kotlin.Pair<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> d(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument r4, java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.descriptors.q1> r5, kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r6) {
            r3 = this;
            int r0 = r4.getNameId()
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r6, r0)
            java.lang.Object r5 = r5.get(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r5
            if (r5 != 0) goto L12
            r4 = 0
            return r4
        L12:
            kotlin.Pair r0 = new kotlin.Pair
            int r1 = r4.getNameId()
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r6, r1)
            kotlin.reflect.jvm.internal.impl.types.t0 r5 = r5.getType()
            java.lang.String r2 = "getType(...)"
            kotlin.jvm.internal.g0.o(r5, r2)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r4 = r4.getValue()
            java.lang.String r2 = "getValue(...)"
            kotlin.jvm.internal.g0.o(r4, r2)
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r4 = r3.g(r5, r4, r6)
            r0.<init>(r1, r4)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d e(kotlin.reflect.jvm.internal.impl.name.b r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = r2.a
            kotlin.reflect.jvm.internal.impl.descriptors.k0 r1 = r2.b
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = kotlin.reflect.jvm.internal.impl.descriptors.x.d(r0, r3, r1)
            return r3
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> g(kotlin.reflect.jvm.internal.impl.types.t0 r3, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value r4, kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r5) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r5 = r2.f(r3, r4, r5)
            boolean r0 = r2.b(r5, r3, r4)
            if (r0 == 0) goto Lb
            goto Lc
        Lb:
            r5 = 0
        Lc:
            if (r5 != 0) goto L32
            kotlin.reflect.jvm.internal.impl.resolve.constants.l$a r5 = kotlin.reflect.jvm.internal.impl.resolve.constants.l.b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected argument value: actual type "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r4 = r4.getType()
            r0.append(r4)
            java.lang.String r4 = " != expected type "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            kotlin.reflect.jvm.internal.impl.resolve.constants.l r3 = r5.a(r3)
            return r3
        L32:
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r7) {
            r5 = this;
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r7, r0)
            int r0 = r6.getId()
            kotlin.reflect.jvm.internal.impl.name.b r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.a(r7, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r5.e(r0)
            java.util.Map r1 = kotlin.collections.i1.z()
            int r2 = r6.getArgumentCount()
            if (r2 == 0) goto La9
            boolean r2 = kotlin.reflect.jvm.internal.impl.types.error.i.m(r0)
            if (r2 != 0) goto La9
            boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.i.t(r0)
            if (r2 == 0) goto La9
            java.util.Collection r2 = r0.f()
            java.lang.String r3 = "getConstructors(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r2 = kotlin.collections.f0.n5(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.c r2 = (kotlin.reflect.jvm.internal.impl.descriptors.c) r2
            if (r2 == 0) goto La9
            java.util.List r1 = r2.g()
            java.lang.String r2 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r1, r2)
            int r2 = kotlin.collections.i1.j(r2)
            r3 = 16
            int r2 = kotlin.ranges.t.u(r2, r3)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L63:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r1.next()
            r4 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r4
            kotlin.reflect.jvm.internal.impl.name.f r4 = r4.getName()
            r3.put(r4, r2)
            goto L63
        L78:
            java.util.List r6 = r6.getArgumentList()
            java.lang.String r1 = "getArgumentList(...)"
            kotlin.jvm.internal.g0.o(r6, r1)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L8c:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto La5
            java.lang.Object r2 = r6.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument) r2
            kotlin.jvm.internal.g0.m(r2)
            kotlin.Pair r2 = r5.d(r2, r3, r7)
            if (r2 == 0) goto L8c
            r1.add(r2)
            goto L8c
        La5:
            java.util.Map r1 = kotlin.collections.i1.B0(r1)
        La9:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.d r6 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.d
            kotlin.reflect.jvm.internal.impl.types.e1 r7 = r0.s()
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r0 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            r6.<init>(r7, r1, r0)
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r8) {
            r5 = this;
            java.lang.String r0 = "expectedType"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r8, r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.P
            int r1 = r7.getFlags()
            java.lang.Boolean r0 = r0.g(r1)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r0 = r0.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r1 = r7.getType()
            if (r1 != 0) goto L2a
            r1 = -1
            goto L32
        L2a:
            int[] r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.f.a.a
            int r1 = r1.ordinal()
            r1 = r2[r1]
        L32:
            switch(r1) {
                case 1: goto L15b;
                case 2: goto L14f;
                case 3: goto L13b;
                case 4: goto L128;
                case 5: goto L116;
                case 6: goto L10c;
                case 7: goto L102;
                case 8: goto Lef;
                case 9: goto Le1;
                case 10: goto Lcf;
                case 11: goto Lb9;
                case 12: goto La6;
                case 13: goto L61;
                default: goto L35;
            }
        L35:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Unsupported annotation argument type: "
            r8.append(r0)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type r7 = r7.getType()
            r8.append(r7)
            java.lang.String r7 = " (expected "
            r8.append(r7)
            r8.append(r6)
            r6 = 41
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L61:
            kotlin.reflect.jvm.internal.impl.resolve.constants.i r0 = kotlin.reflect.jvm.internal.impl.resolve.constants.i.a
            java.util.List r7 = r7.getArrayElementList()
            java.lang.String r1 = "getArrayElementList(...)"
            kotlin.jvm.internal.g0.o(r7, r1)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r7, r2)
            r1.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L7d:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto La1
            java.lang.Object r2 = r7.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r2
            kotlin.reflect.jvm.internal.impl.builtins.j r3 = r5.c()
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r3.i()
            java.lang.String r4 = "getAnyType(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            kotlin.jvm.internal.g0.m(r2)
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r2 = r5.f(r3, r2, r8)
            r1.add(r2)
            goto L7d
        La1:
            kotlin.reflect.jvm.internal.impl.resolve.constants.b r6 = r0.c(r1, r6)
            return r6
        La6:
            kotlin.reflect.jvm.internal.impl.resolve.constants.a r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r7 = r7.getAnnotation()
            java.lang.String r0 = "getAnnotation(...)"
            kotlin.jvm.internal.g0.o(r7, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r7 = r5.a(r7, r8)
            r6.<init>(r7)
            return r6
        Lb9:
            kotlin.reflect.jvm.internal.impl.resolve.constants.k r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.k
            int r0 = r7.getClassId()
            kotlin.reflect.jvm.internal.impl.name.b r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.a(r8, r0)
            int r7 = r7.getEnumValueId()
            kotlin.reflect.jvm.internal.impl.name.f r7 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r8, r7)
            r6.<init>(r0, r7)
            return r6
        Lcf:
            kotlin.reflect.jvm.internal.impl.resolve.constants.t r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.t
            int r0 = r7.getClassId()
            kotlin.reflect.jvm.internal.impl.name.b r8 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.a(r8, r0)
            int r7 = r7.getArrayDimensionCount()
            r6.<init>(r8, r7)
            return r6
        Le1:
            kotlin.reflect.jvm.internal.impl.resolve.constants.y r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.y
            int r7 = r7.getStringValue()
            java.lang.String r7 = r8.getString(r7)
            r6.<init>(r7)
            return r6
        Lef:
            kotlin.reflect.jvm.internal.impl.resolve.constants.c r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.c
            long r7 = r7.getIntValue()
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto Lfd
            r7 = 1
            goto Lfe
        Lfd:
            r7 = 0
        Lfe:
            r6.<init>(r7)
            return r6
        L102:
            kotlin.reflect.jvm.internal.impl.resolve.constants.j r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.j
            double r7 = r7.getDoubleValue()
            r6.<init>(r7)
            return r6
        L10c:
            kotlin.reflect.jvm.internal.impl.resolve.constants.m r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.m
            float r7 = r7.getFloatValue()
            r6.<init>(r7)
            return r6
        L116:
            long r6 = r7.getIntValue()
            if (r0 == 0) goto L122
            kotlin.reflect.jvm.internal.impl.resolve.constants.d0 r8 = new kotlin.reflect.jvm.internal.impl.resolve.constants.d0
            r8.<init>(r6)
            return r8
        L122:
            kotlin.reflect.jvm.internal.impl.resolve.constants.u r8 = new kotlin.reflect.jvm.internal.impl.resolve.constants.u
            r8.<init>(r6)
            return r8
        L128:
            long r6 = r7.getIntValue()
            int r7 = (int) r6
            if (r0 == 0) goto L135
            kotlin.reflect.jvm.internal.impl.resolve.constants.c0 r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.c0
            r6.<init>(r7)
            return r6
        L135:
            kotlin.reflect.jvm.internal.impl.resolve.constants.n r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.n
            r6.<init>(r7)
            return r6
        L13b:
            long r6 = r7.getIntValue()
            int r7 = (int) r6
            short r6 = (short) r7
            if (r0 == 0) goto L149
            kotlin.reflect.jvm.internal.impl.resolve.constants.e0 r7 = new kotlin.reflect.jvm.internal.impl.resolve.constants.e0
            r7.<init>(r6)
            return r7
        L149:
            kotlin.reflect.jvm.internal.impl.resolve.constants.x r7 = new kotlin.reflect.jvm.internal.impl.resolve.constants.x
            r7.<init>(r6)
            return r7
        L14f:
            kotlin.reflect.jvm.internal.impl.resolve.constants.e r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.e
            long r7 = r7.getIntValue()
            int r8 = (int) r7
            char r7 = (char) r8
            r6.<init>(r7)
            return r6
        L15b:
            long r6 = r7.getIntValue()
            int r7 = (int) r6
            byte r6 = (byte) r7
            if (r0 == 0) goto L169
            kotlin.reflect.jvm.internal.impl.resolve.constants.b0 r7 = new kotlin.reflect.jvm.internal.impl.resolve.constants.b0
            r7.<init>(r6)
            return r7
        L169:
            kotlin.reflect.jvm.internal.impl.resolve.constants.d r7 = new kotlin.reflect.jvm.internal.impl.resolve.constants.d
            r7.<init>(r6)
            return r7
    }
}
