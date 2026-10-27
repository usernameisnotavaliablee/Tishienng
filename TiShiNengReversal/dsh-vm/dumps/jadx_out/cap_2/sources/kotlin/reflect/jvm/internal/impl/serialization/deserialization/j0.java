package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMemberDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/MemberDeserializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n1563#2:376\n1634#2,3:377\n1573#2:381\n1604#2,4:382\n1583#2,11:386\n1878#2,2:397\n1880#2:400\n1594#2:401\n1563#2:402\n1634#2,3:403\n1573#2:406\n1604#2,4:407\n1#3:380\n1#3:399\n*S KotlinDebug\n*F\n+ 1 MemberDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/MemberDeserializer\n*L\n29#1:376\n29#1:377,3\n67#1:381\n67#1:382,4\n219#1:386,11\n219#1:397,2\n219#1:400\n219#1:401\n247#1:402\n247#1:403,3\n331#1:406\n331#1:407,4\n219#1:399\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.o a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.f b;

    public j0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3) {
            r2 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.<init>()
            r2.a = r3
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.f r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r1 = r3.c()
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r1 = r1.q()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r3 = r3.c()
            kotlin.reflect.jvm.internal.impl.descriptors.k0 r3 = r3.r()
            r0.<init>(r1, r3)
            r2.b = r0
            return
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.z0 B(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3, kotlin.reflect.jvm.internal.impl.descriptors.a r4, int r5) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r3 = r3.i()
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r3.u(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r3 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3 = r3.b()
            r0 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r2 = kotlin.reflect.jvm.internal.impl.resolve.h.b(r4, r2, r0, r3, r5)
            return r2
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> C(java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> r20, kotlin.reflect.jvm.internal.impl.protobuf.n r21, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r22) {
            r19 = this;
            r1 = r19
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r1.a
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r0.e()
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor"
            kotlin.jvm.internal.g0.n(r0, r2)
            r7 = r0
            kotlin.reflect.jvm.internal.impl.descriptors.a r7 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r7
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r7.b()
            java.lang.String r2 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r2 = r1.i(r0)
            r0 = r20
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r15 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.f0.d0(r0, r3)
            r15.<init>(r3)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r5 = 0
        L33:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto Lfd
            java.lang.Object r0 = r16.next()
            int r18 = r5 + 1
            if (r5 >= 0) goto L44
            kotlin.collections.f0.b0()
        L44:
            r6 = r0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) r6
            boolean r0 = r6.hasFlags()
            if (r0 == 0) goto L53
            int r0 = r6.getFlags()
            r8 = r0
            goto L54
        L53:
            r8 = 0
        L54:
            if (r2 == 0) goto L77
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.c
            java.lang.Boolean r0 = r0.g(r8)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L77
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s0 r9 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r1.a
            kotlin.reflect.jvm.internal.impl.storage.n r10 = r0.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.g0 r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.g0
            r3 = r21
            r4 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.<init>(r10, r0)
            goto L7d
        L77:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r9 = r0.b()
        L7d:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r1.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r0.g()
            int r3 = r6.getName()
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r0, r3)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r1.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r3 = r3.i()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r4 = r1.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r4 = r4.j()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.r(r6, r4)
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r3.u(r4)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.H
            java.lang.Boolean r4 = r4.g(r8)
            java.lang.String r10 = "get(...)"
            kotlin.jvm.internal.g0.o(r4, r10)
            boolean r4 = r4.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r11 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.I
            java.lang.Boolean r11 = r11.g(r8)
            kotlin.jvm.internal.g0.o(r11, r10)
            boolean r11 = r11.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r12 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.J
            java.lang.Boolean r8 = r12.g(r8)
            kotlin.jvm.internal.g0.o(r8, r10)
            boolean r12 = r8.booleanValue()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r8 = r1.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r8 = r8.j()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.u(r6, r8)
            if (r6 == 0) goto Le0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r8 = r1.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r8 = r8.i()
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = r8.u(r6)
        Lde:
            r13 = r6
            goto Le2
        Le0:
            r6 = 0
            goto Lde
        Le2:
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r14 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            java.lang.String r6 = "NO_SOURCE"
            kotlin.jvm.internal.g0.o(r14, r6)
            r10 = r4
            r4 = r7
            r7 = r9
            r9 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.impl.u0 r3 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.u0
            r6 = r5
            r5 = 0
            r8 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.add(r3)
            r7 = r4
            r5 = r18
            goto L33
        Lfd:
            java.util.List r0 = kotlin.collections.f0.a6(r15)
            return r0
    }

    private static final java.util.List D(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r6, kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r7, kotlin.reflect.jvm.internal.impl.protobuf.n r8, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r9, int r10, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter r11) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r6 = r6.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r6 = r6.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.d r0 = r6.d()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.util.List r6 = r0.a(r1, r2, r3, r4, r5)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.List r6 = kotlin.collections.f0.a6(r6)
            return r6
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.j a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r0, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r1, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0 r2) {
            kotlin.reflect.jvm.internal.impl.storage.j r0 = w(r0, r1, r2)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.j b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r0, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r1, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0 r2) {
            kotlin.reflect.jvm.internal.impl.storage.j r0 = y(r0, r1, r2)
            return r0
    }

    static /* synthetic */ java.util.List c(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r0, kotlin.reflect.jvm.internal.impl.protobuf.n r1, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r2) {
            java.util.List r0 = k(r0, r1, r2)
            return r0
    }

    static /* synthetic */ java.util.List d(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r0, boolean r1, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r2) {
            java.util.List r0 = n(r0, r1, r2)
            return r0
    }

    static /* synthetic */ java.util.List e(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r0, kotlin.reflect.jvm.internal.impl.protobuf.n r1, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r2) {
            java.util.List r0 = p(r0, r1, r2)
            return r0
    }

    static /* synthetic */ java.util.List f(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r0, kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r1, kotlin.reflect.jvm.internal.impl.protobuf.n r2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r3, int r4, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter r5) {
            java.util.List r0 = D(r0, r1, r2, r3, r4, r5)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.g g(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r0, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r1, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0 r2) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r0 = x(r0, r1, r2)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.g h(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r0, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r1, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0 r2) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r0 = z(r0, r1, r2)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 i(kotlin.reflect.jvm.internal.impl.descriptors.k r5) {
            r4 = this;
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
            if (r0 == 0) goto L22
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0$b r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0$b
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r5
            kotlin.reflect.jvm.internal.impl.name.c r5 = r5.d()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r4.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r1 = r1.g()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r4.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r2 = r2.j()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r4.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r3 = r3.d()
            r0.<init>(r5, r1, r2, r3)
            return r0
        L22:
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n
            if (r0 == 0) goto L2d
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r5 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n) r5
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0$a r5 = r5.d1()
            return r5
        L2d:
            r5 = 0
            return r5
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g j(kotlin.reflect.jvm.internal.impl.protobuf.n r3, int r4, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r5) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.c
            java.lang.Boolean r4 = r0.g(r4)
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L13
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r3 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3 = r3.b()
            return r3
        L13:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s0 r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r2.a
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r0.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.d0 r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.d0
            r1.<init>(r2, r3, r5)
            r4.<init>(r0, r1)
            return r4
    }

    private static final java.util.List k(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r1, kotlin.reflect.jvm.internal.impl.protobuf.n r2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r3) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r1.a
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r0.e()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r0 = r1.i(r0)
            if (r0 == 0) goto L21
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r1.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r1 = r1.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.d r1 = r1.d()
            java.util.List r1 = r1.i(r0, r2, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = kotlin.collections.f0.a6(r1)
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 != 0) goto L28
            java.util.List r1 = kotlin.collections.f0.J()
        L28:
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.z0 l() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r3.a
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r0.e()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            r2 = 0
            if (r1 == 0) goto Le
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L16
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r0.V()
            return r0
        L16:
            return r2
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g m(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r4, boolean r5) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.c
            int r1 = r4.getFlags()
            java.lang.Boolean r0 = r0.g(r1)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L17
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r4 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r4.b()
            return r4
        L17:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s0 r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r3.a
            kotlin.reflect.jvm.internal.impl.storage.n r1 = r1.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.e0 r2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.e0
            r2.<init>(r3, r5, r4)
            r0.<init>(r1, r2)
            return r0
    }

    private static final java.util.List n(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r1, boolean r2, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r3) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r1.a
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r0.e()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r0 = r1.i(r0)
            if (r0 == 0) goto L38
            if (r2 == 0) goto L23
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r1.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r1 = r1.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.d r1 = r1.d()
            java.util.List r1 = r1.l(r0, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = kotlin.collections.f0.a6(r1)
            goto L39
        L23:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r1.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r1 = r1.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.d r1 = r1.d()
            java.util.List r1 = r1.f(r0, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = kotlin.collections.f0.a6(r1)
            goto L39
        L38:
            r1 = 0
        L39:
            if (r1 != 0) goto L3f
            java.util.List r1 = kotlin.collections.f0.J()
        L3f:
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g o(kotlin.reflect.jvm.internal.impl.protobuf.n r4, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r5) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r3.a
            kotlin.reflect.jvm.internal.impl.storage.n r1 = r1.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.f0 r2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.f0
            r2.<init>(r3, r4, r5)
            r0.<init>(r1, r2)
            return r0
    }

    private static final java.util.List p(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r1, kotlin.reflect.jvm.internal.impl.protobuf.n r2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r3) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r1.a
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r0.e()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r0 = r1.i(r0)
            if (r0 == 0) goto L1b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r1.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r1 = r1.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.d r1 = r1.d()
            java.util.List r1 = r1.g(r0, r2, r3)
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r1 != 0) goto L22
            java.util.List r1 = kotlin.collections.f0.J()
        L22:
            return r1
    }

    private final void q(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.o0 r1, kotlin.reflect.jvm.internal.impl.descriptors.z0 r2, kotlin.reflect.jvm.internal.impl.descriptors.z0 r3, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.z0> r4, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r5, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.q1> r6, kotlin.reflect.jvm.internal.impl.types.t0 r7, kotlin.reflect.jvm.internal.impl.descriptors.Modality r8, kotlin.reflect.jvm.internal.impl.descriptors.s r9, java.util.Map<? extends kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<?>, ?> r10) {
            r0 = this;
            r1.j1(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    private final int t(int r2) {
            r1 = this;
            r0 = r2 & 63
            int r2 = r2 >> 8
            int r2 = r2 << 6
            int r0 = r0 + r2
            return r0
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.w0 v(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r0, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r0.u(r1, r2)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.storage.j w(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r2, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r3, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0 r4) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r2.a
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r0.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.h0 r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.h0
            r1.<init>(r2, r3, r4)
            kotlin.reflect.jvm.internal.impl.storage.j r2 = r0.g(r1)
            return r2
    }

    private static final kotlin.reflect.jvm.internal.impl.resolve.constants.g x(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r2, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r3, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0 r4) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r2.a
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r0.e()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r0 = r2.i(r0)
            kotlin.jvm.internal.g0.m(r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r2.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2 = r2.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.d r2 = r2.d()
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.getReturnType()
            java.lang.String r1 = "getReturnType(...)"
            kotlin.jvm.internal.g0.o(r4, r1)
            java.lang.Object r2 = r2.e(r0, r3, r4)
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r2 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r2
            return r2
    }

    private static final kotlin.reflect.jvm.internal.impl.storage.j y(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r2, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r3, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0 r4) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r2.a
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r0.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.i0 r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.i0
            r1.<init>(r2, r3, r4)
            kotlin.reflect.jvm.internal.impl.storage.j r2 = r0.g(r1)
            return r2
    }

    private static final kotlin.reflect.jvm.internal.impl.resolve.constants.g z(kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r2, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r3, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0 r4) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r2.a
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r0.e()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r0 = r2.i(r0)
            kotlin.jvm.internal.g0.m(r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r2.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2 = r2.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.d r2 = r2.d()
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.getReturnType()
            java.lang.String r1 = "getReturnType(...)"
            kotlin.jvm.internal.g0.o(r4, r1)
            java.lang.Object r2 = r2.j(r0, r3, r4)
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r2 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r2
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.i1 A(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias r17) {
            r16 = this;
            r0 = r16
            r7 = r17
            java.lang.String r1 = "proto"
            kotlin.jvm.internal.g0.p(r7, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            java.util.List r2 = r7.getAnnotationList()
            java.lang.String r3 = "getAnnotationList(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.f0.d0(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r4
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.f r5 = r0.b
            kotlin.jvm.internal.g0.m(r4)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r6 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r6 = r6.g()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r4 = r5.a(r4, r6)
            r3.add(r4)
            goto L25
        L44:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r1.a(r3)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.n0 r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.n0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility> r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
            int r3 = r7.getFlags()
            java.lang.Object r2 = r2.d(r3)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility) r2
            kotlin.reflect.jvm.internal.impl.descriptors.s r6 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.o0.a(r1, r2)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.p0 r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.p0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r0.a
            kotlin.reflect.jvm.internal.impl.storage.n r2 = r2.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r0.a
            kotlin.reflect.jvm.internal.impl.descriptors.k r3 = r3.e()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r5 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r5 = r5.g()
            int r8 = r7.getName()
            kotlin.reflect.jvm.internal.impl.name.f r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r5, r8)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r8 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r8 = r8.g()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r9 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r9 = r9.j()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r10 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r10 = r10.k()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r11 = r0.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r11 = r11.d()
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r8 = r1
            r1 = r7
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r7 = r0.a
            java.util.List r9 = r1.getTypeParameterList()
            java.lang.String r2 = "getTypeParameterList(...)"
            kotlin.jvm.internal.g0.o(r9, r2)
            r14 = 60
            r15 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.o.b(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r3 = r2.i()
            java.util.List r3 = r3.m()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r4 = r2.i()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r5 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r5 = r5.j()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.s(r1, r5)
            r6 = 0
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r4.o(r5, r6)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r2 = r2.i()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r5 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r5 = r5.j()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.e(r1, r5)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.o(r1, r6)
            r8.R0(r3, r4, r1)
            return r8
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.c r(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor r17, boolean r18) {
            r16 = this;
            r0 = r16
            r7 = r17
            java.lang.String r1 = "proto"
            kotlin.jvm.internal.g0.p(r7, r1)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r0.a
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r1.e()
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.g0.n(r1, r2)
            r2 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r2
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d
            int r3 = r7.getFlags()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r15 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r0.j(r7, r3, r15)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r6 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r8 = r3.g()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r9 = r3.j()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r10 = r3.k()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r0.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r11 = r3.d()
            r13 = 1024(0x400, float:1.435E-42)
            r14 = 0
            r3 = 0
            r12 = 0
            r5 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r4 = r1
            r1 = r7
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r0.a
            java.util.List r5 = kotlin.collections.f0.J()
            r10 = 60
            r11 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.o.b(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r3 = r3.f()
            java.util.List r5 = r1.getValueParameterList()
            java.lang.String r6 = "getValueParameterList(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            java.util.List r3 = r3.C(r5, r1, r15)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.n0 r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.n0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility> r6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
            int r7 = r1.getFlags()
            java.lang.Object r6 = r6.d(r7)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility) r6
            kotlin.reflect.jvm.internal.impl.descriptors.s r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.o0.a(r5, r6)
            r4.l1(r3, r5)
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r2.s()
            r4.b1(r3)
            boolean r2 = r2.q0()
            r4.R0(r2)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.o
            int r1 = r1.getFlags()
            java.lang.Boolean r1 = r2.g(r1)
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ 1
            r4.T0(r1)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.d1 s(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function r28) {
            r27 = this;
            r0 = r27
            r7 = r28
            java.lang.String r1 = "proto"
            kotlin.jvm.internal.g0.p(r7, r1)
            boolean r1 = r7.hasFlags()
            if (r1 == 0) goto L15
            int r1 = r7.getFlags()
        L13:
            r15 = r1
            goto L1e
        L15:
            int r1 = r7.getOldFlags()
            int r1 = r0.t(r1)
            goto L13
        L1e:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r0.j(r7, r15, r1)
            boolean r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.g(r7)
            if (r2 == 0) goto L2f
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r0.o(r7, r1)
            goto L35
        L2f:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r1.b()
        L35:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r0.a
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r2.e()
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.o(r2)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3 = r3.g()
            int r5 = r7.getName()
            kotlin.reflect.jvm.internal.impl.name.f r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r3, r5)
            kotlin.reflect.jvm.internal.impl.name.c r2 = r2.b(r3)
            kotlin.reflect.jvm.internal.impl.name.c r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.p0.a
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 == 0) goto L61
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j$a r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.j.b
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r2 = r2.b()
        L5f:
            r10 = r2
            goto L68
        L61:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r2 = r2.k()
            goto L5f
        L68:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.o0 r17 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.o0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r0.a
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r2.e()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3 = r3.g()
            int r5 = r7.getName()
            kotlin.reflect.jvm.internal.impl.name.f r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r3, r5)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.n0 r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.n0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind> r6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.p
            java.lang.Object r6 = r6.d(r15)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind) r6
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r6 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.o0.b(r3, r6)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r8 = r3.g()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r9 = r3.j()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r0.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r11 = r3.d()
            r13 = 1024(0x400, float:1.435E-42)
            r14 = 0
            r3 = 0
            r12 = 0
            r25 = r15
            r15 = r1
            r1 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r11 = r7
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r0.a
            java.util.List r3 = r11.getTypeParameterList()
            java.lang.String r4 = "getTypeParameterList(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            r23 = 60
            r24 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r16 = r2
            r18 = r3
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r12 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.o.b(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r2 = r2.j()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.l(r11, r2)
            if (r2 == 0) goto Le6
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r3 = r12.i()
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r3.u(r2)
            if (r2 == 0) goto Le6
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r2 = kotlin.reflect.jvm.internal.impl.resolve.h.i(r1, r2, r15)
            goto Le7
        Le6:
            r2 = 0
        Le7:
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r3 = r0.l()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r4 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r4 = r4.j()
            java.util.List r4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.c(r11, r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r5 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
        L102:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L120
            java.lang.Object r7 = r5.next()
            int r8 = r6 + 1
            if (r6 >= 0) goto L113
            kotlin.collections.f0.b0()
        L113:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r7
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r6 = r0.B(r7, r12, r1, r6)
            if (r6 == 0) goto L11e
            r4.add(r6)
        L11e:
            r6 = r8
            goto L102
        L120:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r5 = r12.i()
            java.util.List r5 = r5.m()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r6 = r12.f()
            java.util.List r7 = r11.getValueParameterList()
            java.lang.String r8 = "getValueParameterList(...)"
            kotlin.jvm.internal.g0.o(r7, r8)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r8 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION
            java.util.List r6 = r6.C(r7, r11, r8)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r7 = r12.i()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r8 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r8 = r8.j()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r8 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.n(r11, r8)
            kotlin.reflect.jvm.internal.impl.types.t0 r7 = r7.u(r8)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.n0 r8 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.n0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality> r9 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.e
            r13 = r25
            java.lang.Object r9 = r9.d(r13)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality r9 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality) r9
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r9 = r8.b(r9)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility> r10 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
            java.lang.Object r10 = r10.d(r13)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility r10 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility) r10
            kotlin.reflect.jvm.internal.impl.descriptors.s r8 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.o0.a(r8, r10)
            java.util.Map r10 = kotlin.collections.i1.z()
            r26 = r9
            r9 = r8
            r8 = r26
            r0.q(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.q
            java.lang.Boolean r2 = r2.g(r13)
            java.lang.String r3 = "get(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            boolean r2 = r2.booleanValue()
            r1.a1(r2)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.r
            java.lang.Boolean r2 = r2.g(r13)
            kotlin.jvm.internal.g0.o(r2, r3)
            boolean r2 = r2.booleanValue()
            r1.X0(r2)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.u
            java.lang.Boolean r2 = r2.g(r13)
            kotlin.jvm.internal.g0.o(r2, r3)
            boolean r2 = r2.booleanValue()
            r1.S0(r2)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.s
            java.lang.Boolean r2 = r2.g(r13)
            kotlin.jvm.internal.g0.o(r2, r3)
            boolean r2 = r2.booleanValue()
            r1.Z0(r2)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.t
            java.lang.Boolean r2 = r2.g(r13)
            kotlin.jvm.internal.g0.o(r2, r3)
            boolean r2 = r2.booleanValue()
            r1.d1(r2)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.v
            java.lang.Boolean r2 = r2.g(r13)
            kotlin.jvm.internal.g0.o(r2, r3)
            boolean r2 = r2.booleanValue()
            r1.c1(r2)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.w
            java.lang.Boolean r2 = r2.g(r13)
            kotlin.jvm.internal.g0.o(r2, r3)
            boolean r2 = r2.booleanValue()
            r1.R0(r2)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.x
            java.lang.Boolean r2 = r2.g(r13)
            boolean r2 = r2.booleanValue()
            r2 = r2 ^ 1
            r1.T0(r2)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r0.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2 = r2.c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.l r2 = r2.h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r3 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r3 = r3.j()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r4 = r12.i()
            kotlin.Pair r2 = r2.a(r11, r1, r3, r4)
            if (r2 == 0) goto L21d
            java.lang.Object r3 = r2.getFirst()
            kotlin.reflect.jvm.internal.impl.descriptors.a$a r3 = (kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a) r3
            java.lang.Object r2 = r2.getSecond()
            r1.P0(r3, r2)
        L21d:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.w0 u(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r37, boolean r38) {
            r36 = this;
            r0 = r36
            r15 = r37
            java.lang.String r1 = "proto"
            kotlin.jvm.internal.g0.p(r15, r1)
            boolean r1 = r15.hasFlags()
            if (r1 == 0) goto L14
            int r1 = r15.getFlags()
            goto L1c
        L14:
            int r1 = r15.getOldFlags()
            int r1 = r0.t(r1)
        L1c:
            r2 = 10
            r20 = 0
            if (r38 == 0) goto L60
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r3 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            java.util.List r4 = r15.getAnnotationList()
            java.lang.String r5 = "getAnnotationList(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = kotlin.collections.f0.d0(r4, r2)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L5b
            java.lang.Object r6 = r4.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r6
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.f r7 = r0.b
            kotlin.jvm.internal.g0.m(r6)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r8 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r8 = r8.g()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r6 = r7.a(r6, r8)
            r5.add(r6)
            goto L3c
        L5b:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3 = r3.a(r5)
            goto L62
        L60:
            r3 = r20
        L62:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0 r5 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r4 = r0.a
            kotlin.reflect.jvm.internal.impl.descriptors.k r4 = r4.e()
            if (r3 != 0) goto L72
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3 = r0.j(r15, r1, r3)
        L72:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.n0 r6 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.n0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality> r7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.e
            java.lang.Object r7 = r7.d(r1)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality) r7
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r7 = r6.b(r7)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility> r8 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
            java.lang.Object r8 = r8.d(r1)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility r8 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility) r8
            kotlin.reflect.jvm.internal.impl.descriptors.s r8 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.o0.a(r6, r8)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r9 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.y
            java.lang.Boolean r9 = r9.g(r1)
            java.lang.String r10 = "get(...)"
            kotlin.jvm.internal.g0.o(r9, r10)
            boolean r9 = r9.booleanValue()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r11 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r11 = r11.g()
            int r12 = r15.getName()
            kotlin.reflect.jvm.internal.impl.name.f r11 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k0.b(r11, r12)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind> r12 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.p
            java.lang.Object r12 = r12.d(r1)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind r12 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind) r12
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r6 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.o0.b(r6, r12)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r12 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.C
            java.lang.Boolean r12 = r12.g(r1)
            kotlin.jvm.internal.g0.o(r12, r10)
            boolean r12 = r12.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r13 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.B
            java.lang.Boolean r13 = r13.g(r1)
            kotlin.jvm.internal.g0.o(r13, r10)
            boolean r13 = r13.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r14 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.E
            java.lang.Boolean r14 = r14.g(r1)
            kotlin.jvm.internal.g0.o(r14, r10)
            boolean r14 = r14.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.F
            java.lang.Boolean r2 = r2.g(r1)
            kotlin.jvm.internal.g0.o(r2, r10)
            boolean r2 = r2.booleanValue()
            r38 = r2
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.G
            java.lang.Boolean r2 = r2.g(r1)
            kotlin.jvm.internal.g0.o(r2, r10)
            boolean r2 = r2.booleanValue()
            r17 = r1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r1 = r1.g()
            r18 = r1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r1 = r1.j()
            r19 = r1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r1 = r1.k()
            r21 = r1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = r0.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r1 = r1.d()
            r22 = r10
            r10 = r12
            r12 = r14
            r14 = r2
            r2 = r4
            r4 = r3
            r3 = 0
            r23 = r17
            r16 = r18
            r17 = r19
            r18 = r21
            r25 = r22
            r19 = r1
            r1 = r5
            r5 = r7
            r7 = r9
            r9 = r6
            r6 = r8
            r8 = r11
            r11 = r13
            r13 = r38
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r5 = r1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r4 = r0.a
            java.util.List r6 = r15.getTypeParameterList()
            java.lang.String r1 = "getTypeParameterList(...)"
            kotlin.jvm.internal.g0.o(r6, r1)
            r11 = 60
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.o.b(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.z
            r3 = r23
            java.lang.Boolean r2 = r2.g(r3)
            r10 = r25
            kotlin.jvm.internal.g0.o(r2, r10)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L16f
            boolean r4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.h(r15)
            if (r4 == 0) goto L16f
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r0.o(r15, r4)
            goto L175
        L16f:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r4 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r4.b()
        L175:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r6 = r1.i()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r7 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r7 = r7.j()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.o(r15, r7)
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = r6.u(r7)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r7 = r1.i()
            java.util.List r7 = r7.m()
            r8 = r6
            r6 = r7
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r7 = r0.l()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r9 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r9 = r9.j()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r9 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.m(r15, r9)
            if (r9 == 0) goto L1b0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r11 = r1.i()
            kotlin.reflect.jvm.internal.impl.types.t0 r9 = r11.u(r9)
            if (r9 == 0) goto L1b0
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r4 = kotlin.reflect.jvm.internal.impl.resolve.h.i(r5, r9, r4)
            goto L1b2
        L1b0:
            r4 = r20
        L1b2:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r9 = r0.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r9 = r9.j()
            java.util.List r9 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.d(r15, r9)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = kotlin.collections.f0.d0(r9, r12)
            r11.<init>(r12)
            java.util.Iterator r12 = r9.iterator()
            r9 = 0
        L1ce:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L1eb
            java.lang.Object r14 = r12.next()
            int r16 = r9 + 1
            if (r9 >= 0) goto L1df
            kotlin.collections.f0.b0()
        L1df:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r14 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r14
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r9 = r0.B(r14, r1, r5, r9)
            r11.add(r9)
            r9 = r16
            goto L1ce
        L1eb:
            r9 = r8
            r8 = r4
            r4 = r5
            r5 = r9
            r9 = r11
            r4.X0(r5, r6, r7, r8, r9)
            r5 = r4
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.c
            java.lang.Boolean r4 = r4.g(r3)
            kotlin.jvm.internal.g0.o(r4, r10)
            boolean r21 = r4.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility> r4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.d
            java.lang.Object r6 = r4.d(r3)
            r22 = r6
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility r22 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility) r22
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$d<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality> r6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.e
            java.lang.Object r7 = r6.d(r3)
            r23 = r7
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality r23 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality) r23
            r25 = 0
            r26 = 0
            r24 = 0
            int r16 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.b(r21, r22, r23, r24, r25, r26)
            if (r2 == 0) goto L2ad
            boolean r2 = r15.hasGetterFlags()
            if (r2 == 0) goto L22c
            int r2 = r15.getGetterFlags()
            goto L22e
        L22c:
            r2 = r16
        L22e:
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r8 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.K
            java.lang.Boolean r8 = r8.g(r2)
            kotlin.jvm.internal.g0.o(r8, r10)
            boolean r8 = r8.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r9 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.L
            java.lang.Boolean r9 = r9.g(r2)
            kotlin.jvm.internal.g0.o(r9, r10)
            boolean r9 = r9.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r11 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.M
            java.lang.Boolean r11 = r11.g(r2)
            kotlin.jvm.internal.g0.o(r11, r10)
            boolean r11 = r11.booleanValue()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r12 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r12 = r0.j(r15, r2, r12)
            if (r8 == 0) goto L297
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r14 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.l0
            r38 = 1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.n0 r7 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.n0.a
            java.lang.Object r17 = r6.d(r2)
            r13 = r17
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality r13 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality) r13
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r13 = r7.b(r13)
            java.lang.Object r2 = r4.d(r2)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility) r2
            kotlin.reflect.jvm.internal.impl.descriptors.s r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.o0.a(r7, r2)
            r7 = r8 ^ 1
            r8 = r6
            r6 = r12
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r12 = r5.h()
            r22 = r10
            r10 = r9
            r9 = r7
            r7 = r13
            r13 = 0
            r17 = r4
            r4 = r14
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r14 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            r26 = r1
            r1 = r8
            r8 = r2
            r2 = r22
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r14 = r4
            goto L2a5
        L297:
            r26 = r1
            r17 = r4
            r1 = r6
            r2 = r10
            r6 = r12
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r14 = kotlin.reflect.jvm.internal.impl.resolve.h.d(r5, r6)
            kotlin.jvm.internal.g0.m(r14)
        L2a5:
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r5.getReturnType()
            r14.L0(r4)
            goto L2b5
        L2ad:
            r26 = r1
            r17 = r4
            r1 = r6
            r2 = r10
            r14 = r20
        L2b5:
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.A
            java.lang.Boolean r4 = r4.g(r3)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L36f
            boolean r4 = r15.hasSetterFlags()
            if (r4 == 0) goto L2cb
            int r16 = r15.getSetterFlags()
        L2cb:
            r4 = r16
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.K
            java.lang.Boolean r6 = r6.g(r4)
            kotlin.jvm.internal.g0.o(r6, r2)
            boolean r6 = r6.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.L
            java.lang.Boolean r7 = r7.g(r4)
            kotlin.jvm.internal.g0.o(r7, r2)
            boolean r10 = r7.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.M
            java.lang.Boolean r7 = r7.g(r4)
            kotlin.jvm.internal.g0.o(r7, r2)
            boolean r11 = r7.booleanValue()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_SETTER
            r7 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r6 = r0.j(r15, r4, r2)
            if (r7 == 0) goto L35c
            kotlin.reflect.jvm.internal.impl.descriptors.impl.m0 r27 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.m0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.n0 r8 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.n0.a
            java.lang.Object r1 = r1.d(r4)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality) r1
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = r8.b(r1)
            r9 = r17
            java.lang.Object r4 = r9.d(r4)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility) r4
            kotlin.reflect.jvm.internal.impl.descriptors.s r8 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.o0.a(r8, r4)
            r35 = 1
            r9 = r7 ^ 1
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r12 = r5.h()
            r13 = 0
            r4 = r14
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r14 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            r7 = r1
            r16 = r4
            r4 = r27
            r1 = 1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.util.List r28 = kotlin.collections.f0.J()
            r33 = 60
            r34 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.o.b(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r6 = r27
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r4 = r4.f()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r7 = r15.getSetterValueParameter()
            java.util.List r7 = kotlin.collections.f0.l(r7)
            java.util.List r2 = r4.C(r7, r15, r2)
            java.lang.Object r2 = kotlin.collections.f0.m5(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r2
            r6.M0(r2)
            goto L374
        L35c:
            r16 = r14
            r1 = 1
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r2.b()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.m0 r27 = kotlin.reflect.jvm.internal.impl.resolve.h.e(r5, r6, r2)
            kotlin.jvm.internal.g0.m(r27)
            r6 = r27
            goto L374
        L36f:
            r16 = r14
            r1 = 1
            r6 = r20
        L374:
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.D
            java.lang.Boolean r2 = r2.g(r3)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L388
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0 r2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0
            r2.<init>(r0, r15, r5)
            r5.H0(r2)
        L388:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r2 = r0.a
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r2.e()
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r3 == 0) goto L395
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r2
            goto L397
        L395:
            r2 = r20
        L397:
            if (r2 == 0) goto L39d
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r20 = r2.h()
        L39d:
            r2 = r20
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r3 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS
            if (r2 != r3) goto L3ab
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.c0 r2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.c0
            r2.<init>(r0, r15, r5)
            r5.H0(r2)
        L3ab:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.r r2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.r
            r3 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3 = r0.m(r15, r3)
            r2.<init>(r3, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.r r3 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.r
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r0.m(r15, r1)
            r3.<init>(r1, r5)
            r4 = r16
            r5.R0(r4, r6, r2, r3)
            return r5
    }
}
