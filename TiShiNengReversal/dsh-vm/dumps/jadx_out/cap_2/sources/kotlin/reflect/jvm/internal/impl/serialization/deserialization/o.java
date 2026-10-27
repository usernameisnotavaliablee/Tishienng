package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.d b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.k c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.j e;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a f;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s g;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 h;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 i;

    public o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r7, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r8, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r9, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> r10) {
            r1 = this;
            java.lang.String r0 = "components"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "metadataVersion"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "typeParameters"
            kotlin.jvm.internal.g0.p(r10, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.e = r6
            r1.f = r7
            r1.g = r8
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Deserializer for \""
            r3.append(r5)
            kotlin.reflect.jvm.internal.impl.name.f r4 = r4.getName()
            r3.append(r4)
            r4 = 34
            r3.append(r4)
            java.lang.String r6 = r3.toString()
            if (r8 == 0) goto L5e
            java.lang.String r3 = r8.a()
            if (r3 != 0) goto L59
            goto L5e
        L59:
            r7 = r3
            r4 = r9
            r5 = r10
            r3 = r1
            goto L61
        L5e:
            java.lang.String r3 = "[container not found]"
            goto L59
        L61:
            r2.<init>(r3, r4, r5, r6, r7)
            r3.h = r2
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0
            r2.<init>(r1)
            r3.i = r2
            return
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.o b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r7, kotlin.reflect.jvm.internal.impl.descriptors.k r8, java.util.List r9, kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r10, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r11, kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r12, kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r13, int r14, java.lang.Object r15) {
            r15 = r14 & 4
            if (r15 == 0) goto L6
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r10 = r7.b
        L6:
            r3 = r10
            r10 = r14 & 8
            if (r10 == 0) goto Ld
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r11 = r7.d
        Ld:
            r4 = r11
            r10 = r14 & 16
            if (r10 == 0) goto L14
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r12 = r7.e
        L14:
            r5 = r12
            r10 = r14 & 32
            if (r10 == 0) goto L1b
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r13 = r7.f
        L1b:
            r0 = r7
            r1 = r8
            r2 = r9
            r6 = r13
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r7 = r0.a(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.o a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r12, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r15, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r16, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r17) {
            r11 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "typeParameterProtos"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "versionRequirementTable"
            r1 = r16
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "metadataVersion"
            r7 = r17
            kotlin.jvm.internal.g0.p(r7, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.o
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2 = r11.a
            boolean r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.k.b(r7)
            if (r0 == 0) goto L2f
            r6 = r16
            goto L32
        L2f:
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r0 = r11.e
            r6 = r0
        L32:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r8 = r11.g
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r9 = r11.h
            r4 = r12
            r10 = r13
            r3 = r14
            r5 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r0 = r1.g
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.k e() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 f() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.j0 r0 = r1.i
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.d g() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.storage.n h() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r1.a
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r0.u()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 i() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v0 r0 = r1.h
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h j() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.j k() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r0 = r1.e
            return r0
    }
}
