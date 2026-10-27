package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o0 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.o0 implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function E;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.d F;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h G;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.j H;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s I;

    public o0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r12, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.d1 r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r15, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r16, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r18, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r19, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r20, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r21, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.e1 r22) {
            r11 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "kind"
            r5 = r16
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.g0.p(r10, r0)
            if (r22 != 0) goto L3d
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r0 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L44
        L3d:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L44:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.E = r7
            r11.F = r8
            r11.G = r9
            r11.H = r10
            r1 = r21
            r11.I = r1
            return
    }

    public /* synthetic */ o0(kotlin.reflect.jvm.internal.impl.descriptors.k r14, kotlin.reflect.jvm.internal.impl.descriptors.d1 r15, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r16, kotlin.reflect.jvm.internal.impl.name.f r17, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r18, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function r19, kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r20, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r21, kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r22, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r23, kotlin.reflect.jvm.internal.impl.descriptors.e1 r24, int r25, kotlin.jvm.internal.v r26) {
            r13 = this;
            r0 = r25
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L1c
            r0 = 0
            r12 = r0
        L8:
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            goto L1f
        L1c:
            r12 = r24
            goto L8
        L1f:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.h A() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r0 = r1.G
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o0, kotlin.reflect.jvm.internal.impl.descriptors.impl.s
    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.descriptors.impl.s G0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r14, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.y r15, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r16, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r18, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r19) {
            r13 = this;
            java.lang.String r0 = "newOwner"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "kind"
            r6 = r16
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "annotations"
            r4 = r18
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "source"
            r12 = r19
            kotlin.jvm.internal.g0.p(r12, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.o0 r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.o0
            r3 = r15
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r3
            if (r17 != 0) goto L2c
            kotlin.reflect.jvm.internal.impl.name.f r15 = r13.getName()
            java.lang.String r0 = "getName(...)"
            kotlin.jvm.internal.g0.o(r15, r0)
            r5 = r15
            goto L2e
        L2c:
            r5 = r17
        L2e:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r7 = r13.k1()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r8 = r13.a0()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r9 = r13.A()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r10 = r13.l1()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r11 = r13.b0()
            r2 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r14 = r13.L0()
            r1.T0(r14)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.n K() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r0 = r1.k1()
            return r0
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
    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function k1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r0 = r1.E
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.j l1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r0 = r1.H
            return r0
    }
}
