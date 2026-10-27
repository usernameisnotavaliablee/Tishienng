package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n0 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property E;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.d F;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h G;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.j H;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s I;

    public n0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r17, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.w0 r18, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r19, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Modality r20, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r21, boolean r22, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r23, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r30, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r31, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r32, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r33, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r34) {
            r16 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            java.lang.String r4 = "containingDeclaration"
            r5 = r17
            kotlin.jvm.internal.g0.p(r5, r4)
            java.lang.String r4 = "annotations"
            r6 = r19
            kotlin.jvm.internal.g0.p(r6, r4)
            java.lang.String r4 = "modality"
            r7 = r20
            kotlin.jvm.internal.g0.p(r7, r4)
            java.lang.String r4 = "visibility"
            r8 = r21
            kotlin.jvm.internal.g0.p(r8, r4)
            java.lang.String r4 = "name"
            r9 = r23
            kotlin.jvm.internal.g0.p(r9, r4)
            java.lang.String r4 = "kind"
            r10 = r24
            kotlin.jvm.internal.g0.p(r10, r4)
            java.lang.String r4 = "proto"
            kotlin.jvm.internal.g0.p(r0, r4)
            java.lang.String r4 = "nameResolver"
            kotlin.jvm.internal.g0.p(r1, r4)
            java.lang.String r4 = "typeTable"
            kotlin.jvm.internal.g0.p(r2, r4)
            java.lang.String r4 = "versionRequirementTable"
            kotlin.jvm.internal.g0.p(r3, r4)
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r9 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            r13 = 0
            r0 = r16
            r2 = r18
            r11 = r26
            r14 = r27
            r15 = r28
            r12 = r29
            r1 = r5
            r3 = r6
            r4 = r7
            r5 = r8
            r8 = r10
            r6 = r22
            r7 = r23
            r10 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r30
            r0.E = r1
            r1 = r31
            r0.F = r1
            r2 = r32
            r0.G = r2
            r3 = r33
            r0.H = r3
            r1 = r34
            r0.I = r1
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.h A() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r0 = r1.G
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.n K() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r0 = r1.b1()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k0
    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 L0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r21, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Modality r22, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r23, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.w0 r24, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r25, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r26, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r27) {
            r20 = this;
            java.lang.String r0 = "newOwner"
            r2 = r21
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "newModality"
            r5 = r22
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "newVisibility"
            r6 = r23
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "kind"
            r9 = r25
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "newName"
            r8 = r26
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "source"
            r1 = r27
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0 r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r20.getAnnotations()
            boolean r7 = r20.C()
            boolean r10 = r20.B0()
            boolean r11 = r20.isConst()
            boolean r12 = r20.isExternal()
            boolean r13 = r20.X()
            boolean r14 = r20.q0()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r15 = r20.b1()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r16 = r20.a0()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r17 = r20.A()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r18 = r20.c1()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r19 = r20.b0()
            r3 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.d a0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r1.F
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s b0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r0 = r1.I
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property b1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r0 = r1.E
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.j c1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r0 = r1.H
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k0, kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean isExternal() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.E
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r1 = r2.b1()
            int r1 = r1.getFlags()
            java.lang.Boolean r0 = r0.g(r1)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r0 = r0.booleanValue()
            return r0
    }
}
