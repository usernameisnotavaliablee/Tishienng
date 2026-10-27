package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p0 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.g implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias k;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.d l;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h m;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.j n;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s o;
    private kotlin.reflect.jvm.internal.impl.types.e1 p;
    private kotlin.reflect.jvm.internal.impl.types.e1 q;
    private java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r;
    private kotlin.reflect.jvm.internal.impl.types.e1 s;

    public p0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r15, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r16, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r18, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r19, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r20, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r21) {
            r11 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "visibility"
            r6 = r16
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.g0.p(r10, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r5 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            java.lang.String r0 = "NO_SOURCE"
            kotlin.jvm.internal.g0.o(r5, r0)
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.k = r7
            r11.l = r8
            r11.m = r9
            r11.n = r10
            r1 = r21
            r11.o = r1
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.h A() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r0 = r1.m
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.n K() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r0 = r1.P0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.g
    @org.jetbrains.annotations.NotNull
    protected java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> M0() {
            r1 = this;
            java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r0 = r1.r
            if (r0 != 0) goto La
            java.lang.String r0 = "typeConstructorParameters"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        La:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias P0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r0 = r1.k
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.j Q0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r0 = r1.n
            return r0
    }

    public final void R0(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r4) {
            r1 = this;
            java.lang.String r0 = "declaredTypeParameters"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "underlyingType"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "expandedType"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.N0(r2)
            r1.p = r3
            r1.q = r4
            java.util.List r2 = kotlin.reflect.jvm.internal.impl.descriptors.n1.g(r1)
            r1.r = r2
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r1.H0()
            r1.s = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.i1 S0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r13) {
            r12 = this;
            java.lang.String r0 = "substitutor"
            kotlin.jvm.internal.g0.p(r13, r0)
            boolean r0 = r13.k()
            if (r0 == 0) goto Lc
            return r12
        Lc:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.p0 r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.p0
            kotlin.reflect.jvm.internal.impl.storage.n r2 = r12.d0()
            kotlin.reflect.jvm.internal.impl.descriptors.k r3 = r12.b()
            java.lang.String r0 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r12.getAnnotations()
            java.lang.String r0 = "<get-annotations>(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            kotlin.reflect.jvm.internal.impl.name.f r5 = r12.getName()
            java.lang.String r0 = "getName(...)"
            kotlin.jvm.internal.g0.o(r5, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.s r6 = r12.getVisibility()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r7 = r12.P0()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r8 = r12.a0()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r9 = r12.A()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r10 = r12.Q0()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r11 = r12.b0()
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.util.List r0 = r12.t()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r12.y0()
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r13.n(r2, r3)
            java.lang.String r4 = "safeSubstitute(...)"
            kotlin.jvm.internal.g0.o(r2, r4)
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = kotlin.reflect.jvm.internal.impl.types.g2.a(r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r5 = r12.Z()
            kotlin.reflect.jvm.internal.impl.types.t0 r13 = r13.n(r5, r3)
            kotlin.jvm.internal.g0.o(r13, r4)
            kotlin.reflect.jvm.internal.impl.types.e1 r13 = kotlin.reflect.jvm.internal.impl.types.g2.a(r13)
            r1.R0(r0, r2, r13)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 Z() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.q
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "expandedType"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.d a0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r1.l
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s b0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r0 = r1.o
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.l c(kotlin.reflect.jvm.internal.impl.types.h2 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r1 = r0.S0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i1
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.d m() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r3.Z()
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.x0.a(r0)
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r3.Z()
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.c()
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r2 == 0) goto L1f
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            return r0
        L1f:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 s() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.s
            if (r0 != 0) goto La
            java.lang.String r0 = "defaultTypeImpl"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        La:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 y0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.p
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "underlyingType"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }
}
