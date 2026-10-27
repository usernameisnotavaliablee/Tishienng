package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypeDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1563#2:301\n1634#2,3:302\n1573#2:305\n1604#2,4:306\n1563#2:311\n1634#2,3:312\n1#3:310\n*S KotlinDebug\n*F\n+ 1 TypeDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer\n*L\n76#1:301\n76#1:302,3\n105#1:305\n105#1:306,4\n246#1:311\n246#1:312,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class v0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.o a;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 b;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String c;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.descriptors.f> e;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.descriptors.f> f;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.Integer, kotlin.reflect.jvm.internal.impl.descriptors.j1> g;


    public v0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r4, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r5, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8) {
            r3 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "typeParameterProtos"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "debugName"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "containerPresentableName"
            kotlin.jvm.internal.g0.p(r8, r0)
            r3.<init>()
            r3.a = r4
            r3.b = r5
            r3.c = r7
            r3.d = r8
            kotlin.reflect.jvm.internal.impl.storage.n r5 = r4.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.q0 r7 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.q0
            r7.<init>(r3)
            kotlin.reflect.jvm.internal.impl.storage.h r5 = r5.c(r7)
            r3.e = r5
            kotlin.reflect.jvm.internal.impl.storage.n r4 = r4.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.r0 r5 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.r0
            r5.<init>(r3)
            kotlin.reflect.jvm.internal.impl.storage.h r4 = r4.c(r5)
            r3.f = r4
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto L48
            java.util.Map r4 = kotlin.collections.i1.z()
            goto L76
        L48:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r5 = r6.iterator()
            r6 = 0
        L54:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L76
            int r7 = r6 + 1
            java.lang.Object r8 = r5.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r8 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter) r8
            int r0 = r8.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.r0 r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r3.a
            r1.<init>(r2, r8, r6)
            r4.put(r0, r1)
            r6 = r7
            goto L54
        L76:
            r3.g = r4
            return
    }

    private static final int A(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.getArgumentCount()
            return r1
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r0, int r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = f(r0, r1)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r0, int r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = v(r0, r1)
            return r0
    }

    static /* synthetic */ java.util.List c(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r0, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r1) {
            java.util.List r0 = r(r0, r1)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type d(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r0, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r1) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r0 = z(r0, r1)
            return r0
    }

    static /* synthetic */ int e(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r0) {
            int r0 = A(r0)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.f f(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r0, int r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.g(r1)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.f g(int r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r1.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r0.g()
            kotlin.reflect.jvm.internal.impl.name.b r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.a(r0, r2)
            boolean r0 = r2.i()
            if (r0 == 0) goto L1b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r1.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r0.c()
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r0.b(r2)
            return r2
        L1b:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r1.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r0.c()
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = r0.q()
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = kotlin.reflect.jvm.internal.impl.descriptors.x.c(r0, r2)
            return r2
    }

    private final kotlin.reflect.jvm.internal.impl.types.e1 h(int r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r1.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r0.g()
            kotlin.reflect.jvm.internal.impl.name.b r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.a(r0, r2)
            boolean r2 = r2.i()
            if (r2 == 0) goto L1f
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r1.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2 = r2.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 r2 = r2.o()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.a()
            return r2
        L1f:
            r2 = 0
            return r2
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.f i(int r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r1.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r0.g()
            kotlin.reflect.jvm.internal.impl.name.b r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.a(r0, r2)
            boolean r0 = r2.i()
            if (r0 == 0) goto L12
            r2 = 0
            return r2
        L12:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r1.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r0.c()
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = r0.q()
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r2 = kotlin.reflect.jvm.internal.impl.descriptors.x.f(r0, r2)
            return r2
    }

    private final kotlin.reflect.jvm.internal.impl.types.e1 j(kotlin.reflect.jvm.internal.impl.types.t0 r9, kotlin.reflect.jvm.internal.impl.types.t0 r10) {
            r8 = this;
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.o(r9)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r9.getAnnotations()
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = kotlin.reflect.jvm.internal.impl.builtins.i.k(r9)
            java.util.List r3 = kotlin.reflect.jvm.internal.impl.builtins.i.e(r9)
            java.util.List r4 = kotlin.reflect.jvm.internal.impl.builtins.i.m(r9)
            r5 = 1
            java.util.List r4 = kotlin.collections.f0.h2(r4, r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r5 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.f0.d0(r5, r6)
            r4.<init>(r6)
            java.util.Iterator r5 = r5.iterator()
        L2b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L3f
            java.lang.Object r6 = r5.next()
            kotlin.reflect.jvm.internal.impl.types.c2 r6 = (kotlin.reflect.jvm.internal.impl.types.c2) r6
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = r6.getType()
            r4.add(r6)
            goto L2b
        L3f:
            r5 = 0
            r7 = 1
            r6 = r10
            kotlin.reflect.jvm.internal.impl.types.e1 r10 = kotlin.reflect.jvm.internal.impl.builtins.i.b(r0, r1, r2, r3, r4, r5, r6, r7)
            boolean r9 = r9.J0()
            kotlin.reflect.jvm.internal.impl.types.e1 r9 = r10.P0(r9)
            return r9
    }

    private final kotlin.reflect.jvm.internal.impl.types.e1 k(kotlin.reflect.jvm.internal.impl.types.t1 r9, kotlin.reflect.jvm.internal.impl.types.w1 r10, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.c2> r11, boolean r12) {
            r8 = this;
            java.util.List r0 = r10.getParameters()
            int r0 = r0.size()
            int r1 = r11.size()
            int r0 = r0 - r1
            if (r0 == 0) goto L39
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L15
        L13:
            r3 = r11
            goto L40
        L15:
            int r0 = r11.size()
            int r0 = r0 - r2
            if (r0 < 0) goto L13
            kotlin.reflect.jvm.internal.impl.builtins.j r1 = r10.p()
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.Y(r0)
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r0.o()
            java.lang.String r0 = "getTypeConstructor(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            r6 = 16
            r7 = 0
            r5 = 0
            r1 = r9
            r3 = r11
            r4 = r12
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = kotlin.reflect.jvm.internal.impl.types.w0.m(r1, r2, r3, r4, r5, r6, r7)
            goto L40
        L39:
            r1 = r9
            r3 = r11
            r4 = r12
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r8.l(r1, r10, r3, r4)
        L40:
            if (r1 != 0) goto L4e
            kotlin.reflect.jvm.internal.impl.types.error.i r9 = kotlin.reflect.jvm.internal.impl.types.error.i.a
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r11 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION
            r12 = 0
            java.lang.String[] r12 = new java.lang.String[r12]
            kotlin.reflect.jvm.internal.impl.types.error.g r9 = r9.f(r11, r3, r10, r12)
            return r9
        L4e:
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.types.e1 l(kotlin.reflect.jvm.internal.impl.types.t1 r8, kotlin.reflect.jvm.internal.impl.types.w1 r9, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.c2> r10, boolean r11) {
            r7 = this;
            r5 = 16
            r6 = 0
            r4 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            kotlin.reflect.jvm.internal.impl.types.e1 r8 = kotlin.reflect.jvm.internal.impl.types.w0.m(r0, r1, r2, r3, r4, r5, r6)
            boolean r9 = kotlin.reflect.jvm.internal.impl.builtins.i.q(r8)
            if (r9 != 0) goto L14
            r8 = 0
            return r8
        L14:
            kotlin.reflect.jvm.internal.impl.types.e1 r8 = r7.t(r8)
            return r8
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.j1 n(int r3) {
            r2 = this;
            java.util.Map<java.lang.Integer, kotlin.reflect.jvm.internal.impl.descriptors.j1> r0 = r2.g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r0
            if (r0 != 0) goto L19
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r0 = r2.b
            if (r0 == 0) goto L17
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r3 = r0.n(r3)
            return r3
        L17:
            r3 = 0
            return r3
        L19:
            return r0
    }

    private static final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> p(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r3) {
            java.util.List r0 = r2.getArgumentList()
            java.lang.String r1 = "getArgumentList(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r3.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r1 = r1.j()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.k(r2, r1)
            if (r2 == 0) goto L1c
            java.util.List r2 = p(r2, r3)
            goto L1d
        L1c:
            r2 = 0
        L1d:
            if (r2 != 0) goto L23
            java.util.List r2 = kotlin.collections.f0.J()
        L23:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.f0.I4(r0, r2)
            return r2
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 q(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r0, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 1
        L5:
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.o(r1, r2)
            return r0
    }

    private static final java.util.List r(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r1, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r2) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r1.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r0.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.d r0 = r0.d()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r1.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r1 = r1.g()
            java.util.List r1 = r0.h(r2, r1)
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.types.t1 s(java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.s1> r3, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4, kotlin.reflect.jvm.internal.impl.types.w1 r5, kotlin.reflect.jvm.internal.impl.descriptors.k r6) {
            r2 = this;
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r3.next()
            kotlin.reflect.jvm.internal.impl.types.s1 r1 = (kotlin.reflect.jvm.internal.impl.types.s1) r1
            kotlin.reflect.jvm.internal.impl.types.t1 r1 = r1.a(r4, r5, r6)
            r0.add(r1)
            goto L11
        L25:
            java.util.List r3 = kotlin.collections.f0.f0(r0)
            kotlin.reflect.jvm.internal.impl.types.t1$a r4 = kotlin.reflect.jvm.internal.impl.types.t1.b
            kotlin.reflect.jvm.internal.impl.types.t1 r3 = r4.j(r3)
            return r3
    }

    private final kotlin.reflect.jvm.internal.impl.types.e1 t(kotlin.reflect.jvm.internal.impl.types.t0 r6) {
            r5 = this;
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.builtins.i.m(r6)
            java.lang.Object r0 = kotlin.collections.f0.A3(r0)
            kotlin.reflect.jvm.internal.impl.types.c2 r0 = (kotlin.reflect.jvm.internal.impl.types.c2) r0
            r1 = 0
            if (r0 == 0) goto L7e
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
            if (r0 != 0) goto L14
            goto L7e
        L14:
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r0.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r2.c()
            if (r2 == 0) goto L23
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.o(r2)
            goto L24
        L23:
            r2 = r1
        L24:
            java.util.List r3 = r0.G0()
            int r3 = r3.size()
            r4 = 1
            if (r3 != r4) goto L7b
            kotlin.reflect.jvm.internal.impl.name.c r3 = kotlin.reflect.jvm.internal.impl.builtins.o.w
            boolean r3 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r3 != 0) goto L42
            kotlin.reflect.jvm.internal.impl.name.c r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.w0.a()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 != 0) goto L42
            goto L7b
        L42:
            java.util.List r0 = r0.G0()
            java.lang.Object r0 = kotlin.collections.f0.m5(r0)
            kotlin.reflect.jvm.internal.impl.types.c2 r0 = (kotlin.reflect.jvm.internal.impl.types.c2) r0
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
            java.lang.String r2 = "getType(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r5.a
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r2.e()
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a
            if (r3 == 0) goto L62
            kotlin.reflect.jvm.internal.impl.descriptors.a r2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r2
            goto L63
        L62:
            r2 = r1
        L63:
            if (r2 == 0) goto L69
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.k(r2)
        L69:
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.p0.a
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 == 0) goto L76
            kotlin.reflect.jvm.internal.impl.types.e1 r6 = r5.j(r6, r0)
            return r6
        L76:
            kotlin.reflect.jvm.internal.impl.types.e1 r6 = r5.j(r6, r0)
            return r6
        L7b:
            kotlin.reflect.jvm.internal.impl.types.e1 r6 = (kotlin.reflect.jvm.internal.impl.types.e1) r6
            return r6
        L7e:
            return r1
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.f v(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r0, int r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.i(r1)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.types.c2 w(kotlin.reflect.jvm.internal.impl.descriptors.j1 r3, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument r4) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Projection r0 = r4.getProjection()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Projection r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.STAR
            if (r0 != r1) goto L24
            if (r3 != 0) goto L1e
            kotlin.reflect.jvm.internal.impl.types.j1 r3 = new kotlin.reflect.jvm.internal.impl.types.j1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r4 = r2.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r4 = r4.c()
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r4 = r4.q()
            kotlin.reflect.jvm.internal.impl.builtins.j r4 = r4.p()
            r3.<init>(r4)
            return r3
        L1e:
            kotlin.reflect.jvm.internal.impl.types.l1 r4 = new kotlin.reflect.jvm.internal.impl.types.l1
            r4.<init>(r3)
            return r4
        L24:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.n0 r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.n0.a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Projection r0 = r4.getProjection()
            java.lang.String r1 = "getProjection(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = r3.c(r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r2.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r0 = r0.j()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.q(r4, r0)
            if (r0 != 0) goto L53
            kotlin.reflect.jvm.internal.impl.types.e2 r3 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r0 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.NO_RECORDED_TYPE
            java.lang.String r4 = r4.toString()
            java.lang.String[] r4 = new java.lang.String[]{r4}
            kotlin.reflect.jvm.internal.impl.types.error.g r4 = kotlin.reflect.jvm.internal.impl.types.error.i.d(r0, r4)
            r3.<init>(r4)
            return r3
        L53:
            kotlin.reflect.jvm.internal.impl.types.e2 r4 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.u(r0)
            r4.<init>(r3, r0)
            return r4
    }

    private final kotlin.reflect.jvm.internal.impl.types.w1 x(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r4) {
            r3 = this;
            boolean r0 = r4.hasClassName()
            if (r0 == 0) goto L22
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.descriptors.f> r0 = r3.e
            int r1 = r4.getClassName()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.invoke(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = (kotlin.reflect.jvm.internal.impl.descriptors.f) r0
            if (r0 != 0) goto Lc0
            int r0 = r4.getClassName()
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = y(r3, r4, r0)
            goto Lc0
        L22:
            boolean r0 = r4.hasTypeParameter()
            if (r0 == 0) goto L49
            int r0 = r4.getTypeParameter()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r3.n(r0)
            if (r0 != 0) goto Lc0
            kotlin.reflect.jvm.internal.impl.types.error.i r0 = kotlin.reflect.jvm.internal.impl.types.error.i.a
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER
            int r4 = r4.getTypeParameter()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r2 = r3.d
            java.lang.String[] r4 = new java.lang.String[]{r4, r2}
            kotlin.reflect.jvm.internal.impl.types.error.h r4 = r0.e(r1, r4)
            return r4
        L49:
            boolean r0 = r4.hasTypeParameterName()
            if (r0 == 0) goto La0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r3.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r0.g()
            int r4 = r4.getTypeParameterName()
            java.lang.String r4 = r0.getString(r4)
            java.util.List r0 = r3.m()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L67:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L83
            java.lang.Object r1 = r0.next()
            r2 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r2
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
            java.lang.String r2 = r2.b()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r4)
            if (r2 == 0) goto L67
            goto L84
        L83:
            r1 = 0
        L84:
            r0 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r0
            if (r0 != 0) goto Lc0
            kotlin.reflect.jvm.internal.impl.types.error.i r0 = kotlin.reflect.jvm.internal.impl.types.error.i.a
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r3.a
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r2.e()
            java.lang.String r2 = r2.toString()
            java.lang.String[] r4 = new java.lang.String[]{r4, r2}
            kotlin.reflect.jvm.internal.impl.types.error.h r4 = r0.e(r1, r4)
            return r4
        La0:
            boolean r0 = r4.hasTypeAliasName()
            if (r0 == 0) goto Lca
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.descriptors.f> r0 = r3.f
            int r1 = r4.getTypeAliasName()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.invoke(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = (kotlin.reflect.jvm.internal.impl.descriptors.f) r0
            if (r0 != 0) goto Lc0
            int r0 = r4.getTypeAliasName()
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = y(r3, r4, r0)
        Lc0:
            kotlin.reflect.jvm.internal.impl.types.w1 r4 = r0.o()
            java.lang.String r0 = "getTypeConstructor(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            return r4
        Lca:
            kotlin.reflect.jvm.internal.impl.types.error.i r4 = kotlin.reflect.jvm.internal.impl.types.error.i.a
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r0 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.UNKNOWN_TYPE
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            kotlin.reflect.jvm.internal.impl.types.error.h r4 = r4.e(r0, r1)
            return r4
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.d y(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r2, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r3, int r4) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r2.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r0.g()
            kotlin.reflect.jvm.internal.impl.name.b r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.a(r0, r4)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.t0 r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.t0
            r0.<init>(r2)
            kotlin.sequences.m r3 = kotlin.sequences.p.t(r3, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.u0 r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.u0.a
            kotlin.sequences.m r3 = kotlin.sequences.p.N1(r3, r0)
            java.util.List r3 = kotlin.sequences.p.J3(r3)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0$a r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0.a.a
            kotlin.sequences.m r0 = kotlin.sequences.p.t(r4, r0)
            int r0 = kotlin.sequences.p.E0(r0)
        L27:
            int r1 = r3.size()
            if (r1 >= r0) goto L36
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.add(r1)
            goto L27
        L36:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r2.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2 = r2.c()
            kotlin.reflect.jvm.internal.impl.descriptors.k0 r2 = r2.r()
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r2.d(r4, r3)
            return r2
    }

    private static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type z(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r1, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r1.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r1 = r1.j()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.k(r2, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> m() {
            r1 = this;
            java.util.Map<java.lang.Integer, kotlin.reflect.jvm.internal.impl.descriptors.j1> r0 = r1.g
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.f0.a6(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.e1 o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r18, boolean r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "proto"
            kotlin.jvm.internal.g0.p(r1, r2)
            boolean r2 = r1.hasClassName()
            if (r2 == 0) goto L18
            int r2 = r1.getClassName()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r0.h(r2)
            goto L28
        L18:
            boolean r2 = r1.hasTypeAliasName()
            if (r2 == 0) goto L27
            int r2 = r1.getTypeAliasName()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r0.h(r2)
            goto L28
        L27:
            r2 = 0
        L28:
            if (r2 == 0) goto L2b
            return r2
        L2b:
            kotlin.reflect.jvm.internal.impl.types.w1 r4 = r17.x(r18)
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r4.c()
            boolean r2 = kotlin.reflect.jvm.internal.impl.types.error.i.m(r2)
            if (r2 == 0) goto L4a
            kotlin.reflect.jvm.internal.impl.types.error.i r1 = kotlin.reflect.jvm.internal.impl.types.error.i.a
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r2 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR
            java.lang.String r3 = r4.toString()
            java.lang.String[] r3 = new java.lang.String[]{r3}
            kotlin.reflect.jvm.internal.impl.types.error.g r1 = r1.c(r2, r4, r3)
            return r1
        L4a:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b r2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r0.a
            kotlin.reflect.jvm.internal.impl.storage.n r3 = r3.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.s0 r5 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.s0
            r5.<init>(r0, r1)
            r2.<init>(r3, r5)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r0.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r3 = r3.c()
            java.util.List r3 = r3.v()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r5 = r0.a
            kotlin.reflect.jvm.internal.impl.descriptors.k r5 = r5.e()
            kotlin.reflect.jvm.internal.impl.types.t1 r3 = r0.s(r3, r2, r4, r5)
            java.util.List r5 = p(r1, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = kotlin.collections.f0.d0(r5, r7)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
            r10 = 0
            r7 = 0
        L85:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto Lb0
            java.lang.Object r8 = r5.next()
            int r9 = r7 + 1
            if (r7 >= 0) goto L96
            kotlin.collections.f0.b0()
        L96:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument r8 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument) r8
            java.util.List r11 = r4.getParameters()
            java.lang.String r12 = "getParameters(...)"
            kotlin.jvm.internal.g0.o(r11, r12)
            java.lang.Object r7 = kotlin.collections.f0.b3(r11, r7)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r7 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r7
            kotlin.reflect.jvm.internal.impl.types.c2 r7 = r0.w(r7, r8)
            r6.add(r7)
            r7 = r9
            goto L85
        Lb0:
            java.util.List r5 = kotlin.collections.f0.a6(r6)
            kotlin.reflect.jvm.internal.impl.descriptors.f r6 = r4.c()
            if (r19 == 0) goto L101
            boolean r7 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i1
            if (r7 == 0) goto L101
            kotlin.reflect.jvm.internal.impl.types.w0 r3 = kotlin.reflect.jvm.internal.impl.types.w0.a
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.i1) r6
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = kotlin.reflect.jvm.internal.impl.types.w0.c(r6, r5)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r5 = r0.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r5 = r5.c()
            java.util.List r5 = r5.v()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r6 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r7 = r3.getAnnotations()
            java.util.List r2 = kotlin.collections.f0.E4(r2, r7)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r6.a(r2)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r6 = r0.a
            kotlin.reflect.jvm.internal.impl.descriptors.k r6 = r6.e()
            kotlin.reflect.jvm.internal.impl.types.t1 r2 = r0.s(r5, r2, r4, r6)
            boolean r4 = kotlin.reflect.jvm.internal.impl.types.x0.b(r3)
            if (r4 != 0) goto Lf7
            boolean r4 = r1.getNullable()
            if (r4 == 0) goto Lf5
            goto Lf7
        Lf5:
            r4 = 0
            goto Lf8
        Lf7:
            r4 = 1
        Lf8:
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r3.P0(r4)
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r3.Q0(r2)
            goto L165
        L101:
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.a
            int r6 = r1.getFlags()
            java.lang.Boolean r2 = r2.g(r6)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L11a
            boolean r2 = r1.getNullable()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r0.k(r3, r4, r5, r2)
            goto L165
        L11a:
            boolean r6 = r1.getNullable()
            r8 = 16
            r9 = 0
            r7 = 0
            kotlin.reflect.jvm.internal.impl.types.e1 r12 = kotlin.reflect.jvm.internal.impl.types.w0.m(r3, r4, r5, r6, r7, r8, r9)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.b
            int r3 = r1.getFlags()
            java.lang.Boolean r2 = r2.g(r3)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L164
            kotlin.reflect.jvm.internal.impl.types.z$a r11 = kotlin.reflect.jvm.internal.impl.types.z.d
            r15 = 4
            r16 = 0
            r13 = 1
            r14 = 0
            kotlin.reflect.jvm.internal.impl.types.z r2 = kotlin.reflect.jvm.internal.impl.types.z.a.c(r11, r12, r13, r14, r15, r16)
            if (r2 == 0) goto L144
            goto L165
        L144:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "null DefinitelyNotNullType for '"
            r2.append(r3)
            r2.append(r12)
            r3 = 39
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L164:
            r2 = r12
        L165:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r3 = r3.j()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.a(r1, r3)
            if (r1 == 0) goto L17d
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.o(r1, r10)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = kotlin.reflect.jvm.internal.impl.types.i1.j(r2, r1)
            if (r1 != 0) goto L17c
            goto L17d
        L17c:
            return r1
        L17d:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.c
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r1 = r3.b
            if (r1 != 0) goto L11
            java.lang.String r1 = ""
            goto L26
        L11:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ". Child of "
            r1.append(r2)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r2 = r3.b
            java.lang.String r2 = r2.c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L26:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.t0 u(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r7) {
            r6 = this;
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r7, r0)
            boolean r0 = r7.hasFlexibleTypeCapabilitiesId()
            if (r0 == 0) goto L40
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r6.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r0.g()
            int r1 = r7.getFlexibleTypeCapabilitiesId()
            java.lang.String r0 = r0.getString(r1)
            r1 = 0
            r2 = 2
            r3 = 0
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = q(r6, r7, r1, r2, r3)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r5 = r6.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r5 = r5.j()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.f(r7, r5)
            kotlin.jvm.internal.g0.m(r5)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = q(r6, r5, r1, r2, r3)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r6.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2 = r2.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.w r2 = r2.m()
            kotlin.reflect.jvm.internal.impl.types.t0 r7 = r2.a(r7, r0, r4, r1)
            return r7
        L40:
            r0 = 1
            kotlin.reflect.jvm.internal.impl.types.e1 r7 = r6.o(r7, r0)
            return r7
    }
}
