package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.n a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.f0 b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.n c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.i d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.d<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> e;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.m0 f;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 g;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.v h;

    @org.jetbrains.annotations.NotNull
    private final t3.c i;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.w j;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Iterable<q3.b> k;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.k0 l;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.l m;

    @org.jetbrains.annotations.NotNull
    private final q3.a n;

    @org.jetbrains.annotations.NotNull
    private final q3.c o;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.protobuf.f p;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.checker.p q;

    @org.jetbrains.annotations.NotNull
    private final a4.a r;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.s1> s;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.u t;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.k u;

    public m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r18, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.n r19, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.i r20, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.d<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r21, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.m0 r22, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 r23, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r24, @org.jetbrains.annotations.NotNull t3.c r25, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.w r26, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends q3.b> r27, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k0 r28, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.l r29, @org.jetbrains.annotations.NotNull q3.a r30, @org.jetbrains.annotations.NotNull q3.c r31, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.protobuf.f r32, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.p r33, @org.jetbrains.annotations.NotNull a4.a r34, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.s1> r35, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.u r36) {
            r16 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "moduleDescriptor"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "classDataFinder"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "annotationAndConstantLoader"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "packageFragmentProvider"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "localClassifierTypeSettings"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "errorReporter"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "lookupTracker"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "flexibleTypeDeserializer"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "fictitiousClassDescriptorFactories"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "notFoundClasses"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "contractDeserializer"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "additionalClassPartsProvider"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "platformDependentDeclarationFilter"
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "extensionRegistryLite"
            r15 = r32
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "kotlinTypeChecker"
            r15 = r33
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "samConversionResolver"
            r15 = r34
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "typeAttributeTranslators"
            r15 = r35
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "enumEntriesDeserializationSupport"
            r15 = r36
            kotlin.jvm.internal.g0.p(r15, r0)
            r16.<init>()
            r0 = r16
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r10
            r0.k = r11
            r0.l = r12
            r0.m = r13
            r0.n = r14
            r1 = r31
            r0.o = r1
            r1 = r32
            r0.p = r1
            r1 = r33
            r0.q = r1
            r1 = r34
            r0.r = r1
            r1 = r35
            r0.s = r1
            r0.t = r15
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.k r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.k
            r1.<init>(r0)
            r0.u = r1
            return
    }

    public /* synthetic */ m(kotlin.reflect.jvm.internal.impl.storage.n r24, kotlin.reflect.jvm.internal.impl.descriptors.f0 r25, kotlin.reflect.jvm.internal.impl.serialization.deserialization.n r26, kotlin.reflect.jvm.internal.impl.serialization.deserialization.i r27, kotlin.reflect.jvm.internal.impl.serialization.deserialization.d r28, kotlin.reflect.jvm.internal.impl.descriptors.m0 r29, kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 r30, kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r31, t3.c r32, kotlin.reflect.jvm.internal.impl.serialization.deserialization.w r33, java.lang.Iterable r34, kotlin.reflect.jvm.internal.impl.descriptors.k0 r35, kotlin.reflect.jvm.internal.impl.serialization.deserialization.l r36, q3.a r37, q3.c r38, kotlin.reflect.jvm.internal.impl.protobuf.f r39, kotlin.reflect.jvm.internal.impl.types.checker.p r40, a4.a r41, java.util.List r42, kotlin.reflect.jvm.internal.impl.serialization.deserialization.u r43, int r44, kotlin.jvm.internal.v r45) {
            r23 = this;
            r0 = r44
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto Lb
            q3.a$a r1 = q3.a.a.a
            r16 = r1
            goto Ld
        Lb:
            r16 = r37
        Ld:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L16
            q3.c$a r1 = q3.c.a.a
            r17 = r1
            goto L18
        L16:
            r17 = r38
        L18:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L26
            kotlin.reflect.jvm.internal.impl.types.checker.p$a r1 = kotlin.reflect.jvm.internal.impl.types.checker.p.b
            kotlin.reflect.jvm.internal.impl.types.checker.q r1 = r1.a()
            r19 = r1
            goto L28
        L26:
            r19 = r40
        L28:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L36
            kotlin.reflect.jvm.internal.impl.types.y r1 = kotlin.reflect.jvm.internal.impl.types.y.a
            java.util.List r1 = kotlin.collections.f0.l(r1)
            r21 = r1
            goto L38
        L36:
            r21 = r42
        L38:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L62
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.u$a r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.u.a.a
            r22 = r0
        L41:
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r36
            r18 = r39
            r20 = r41
            goto L65
        L62:
            r22 = r43
            goto L41
        L65:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.o a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.l0 r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r15, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r16, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r17) {
            r11 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "metadataVersion"
            r7 = r16
            kotlin.jvm.internal.g0.p(r7, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.o
            r9 = 0
            java.util.List r10 = kotlin.collections.f0.J()
            r2 = r11
            r4 = r12
            r3 = r13
            r5 = r14
            r6 = r15
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.descriptors.d b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r4) {
            r3 = this;
            java.lang.String r0 = "classId"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.k r0 = r3.u
            r1 = 0
            r2 = 2
            kotlin.reflect.jvm.internal.impl.descriptors.d r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k.f(r0, r4, r1, r2, r1)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public final q3.a c() {
            r1 = this;
            q3.a r0 = r1.n
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.d<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.d<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r0 = r1.e
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.i e() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.i r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.k f() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.k r0 = r1.u
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.n g() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.n r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.l h() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.l r0 = r1.m
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.u i() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.u r0 = r1.t
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.v j() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r0 = r1.h
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.protobuf.f k() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.f r0 = r1.p
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Iterable<q3.b> l() {
            r1 = this;
            java.lang.Iterable<q3.b> r0 = r1.k
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.w m() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.w r0 = r1.j
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.checker.p n() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.checker.p r0 = r1.q
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 o() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 r0 = r1.g
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final t3.c p() {
            r1 = this;
            t3.c r0 = r1.i
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.f0 q() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.k0 r() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.k0 r0 = r1.l
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.m0 s() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.m0 r0 = r1.f
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final q3.c t() {
            r1 = this;
            q3.c r0 = r1.o
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.storage.n u() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.s1> v() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.types.s1> r0 = r1.s
            return r0
    }
}
