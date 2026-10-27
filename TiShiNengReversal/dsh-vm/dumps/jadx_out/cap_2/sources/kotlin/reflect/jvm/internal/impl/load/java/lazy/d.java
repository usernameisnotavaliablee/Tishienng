package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.n a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.t b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.v c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.n d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.components.o e;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.v f;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.components.j g;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.components.i h;

    @org.jetbrains.annotations.NotNull
    private final a4.a i;

    @org.jetbrains.annotations.NotNull
    private final w3.b j;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.n k;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.d0 l;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.h1 m;

    @org.jetbrains.annotations.NotNull
    private final t3.c n;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.f0 o;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.builtins.n p;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.c q;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j1 r;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.u s;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.e t;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.checker.p u;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.d0 v;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.z w;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.resolve.jvm.e x;

    public d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.t r18, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.v r19, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.n r20, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.components.o r21, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r22, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.components.j r23, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.components.i r24, @org.jetbrains.annotations.NotNull a4.a r25, @org.jetbrains.annotations.NotNull w3.b r26, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.n r27, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.d0 r28, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.h1 r29, @org.jetbrains.annotations.NotNull t3.c r30, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r31, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.n r32, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.c r33, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j1 r34, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.u r35, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.e r36, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.p r37, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.d0 r38, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.z r39, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.jvm.e r40) {
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
            java.lang.String r0 = "finder"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "kotlinClassFinder"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "deserializedDescriptorResolver"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "signaturePropagator"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "errorReporter"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "javaResolverCache"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "javaPropertyInitializerEvaluator"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "samConversionResolver"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "sourceElementFactory"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "moduleClassResolver"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "packagePartProvider"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "supertypeLoopChecker"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "lookupTracker"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "reflectionTypes"
            r15 = r32
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "annotationTypeQualifierResolver"
            r15 = r33
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "signatureEnhancement"
            r15 = r34
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "javaClassesTracker"
            r15 = r35
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "settings"
            r15 = r36
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "kotlinTypeChecker"
            r15 = r37
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "javaTypeEnhancementState"
            r15 = r38
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "javaModuleResolver"
            r15 = r39
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "syntheticPartsProvider"
            r15 = r40
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
            r1 = r36
            r0.t = r1
            r1 = r37
            r0.u = r1
            r1 = r38
            r0.v = r1
            r1 = r39
            r0.w = r1
            r0.x = r15
            return
    }

    public /* synthetic */ d(kotlin.reflect.jvm.internal.impl.storage.n r27, kotlin.reflect.jvm.internal.impl.load.java.t r28, kotlin.reflect.jvm.internal.impl.load.kotlin.v r29, kotlin.reflect.jvm.internal.impl.load.kotlin.n r30, kotlin.reflect.jvm.internal.impl.load.java.components.o r31, kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r32, kotlin.reflect.jvm.internal.impl.load.java.components.j r33, kotlin.reflect.jvm.internal.impl.load.java.components.i r34, a4.a r35, w3.b r36, kotlin.reflect.jvm.internal.impl.load.java.lazy.n r37, kotlin.reflect.jvm.internal.impl.load.kotlin.d0 r38, kotlin.reflect.jvm.internal.impl.descriptors.h1 r39, t3.c r40, kotlin.reflect.jvm.internal.impl.descriptors.f0 r41, kotlin.reflect.jvm.internal.impl.builtins.n r42, kotlin.reflect.jvm.internal.impl.load.java.c r43, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j1 r44, kotlin.reflect.jvm.internal.impl.load.java.u r45, kotlin.reflect.jvm.internal.impl.load.java.lazy.e r46, kotlin.reflect.jvm.internal.impl.types.checker.p r47, kotlin.reflect.jvm.internal.impl.load.java.d0 r48, kotlin.reflect.jvm.internal.impl.load.java.z r49, kotlin.reflect.jvm.internal.impl.resolve.jvm.e r50, int r51, kotlin.jvm.internal.v r52) {
            r26 = this;
            r0 = 8388608(0x800000, float:1.1754944E-38)
            r0 = r51 & r0
            if (r0 == 0) goto L3f
            kotlin.reflect.jvm.internal.impl.resolve.jvm.e$a r0 = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.a
            kotlin.reflect.jvm.internal.impl.resolve.jvm.a r0 = r0.a()
            r25 = r0
        Le:
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            r6 = r31
            r7 = r32
            r8 = r33
            r9 = r34
            r10 = r35
            r11 = r36
            r12 = r37
            r13 = r38
            r14 = r39
            r15 = r40
            r16 = r41
            r17 = r42
            r18 = r43
            r19 = r44
            r20 = r45
            r21 = r46
            r22 = r47
            r23 = r48
            r24 = r49
            goto L42
        L3f:
            r25 = r50
            goto Le
        L42:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.c a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.c r0 = r1.q
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.n b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.kotlin.n r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.v c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r0 = r1.f
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.t d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.t r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.u e() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.u r0 = r1.s
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.z f() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.z r0 = r1.w
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.components.i g() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.components.i r0 = r1.h
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.components.j h() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.components.j r0 = r1.g
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.d0 i() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.d0 r0 = r1.v
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.v j() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.kotlin.v r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.checker.p k() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.checker.p r0 = r1.u
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final t3.c l() {
            r1 = this;
            t3.c r0 = r1.n
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.f0 m() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = r1.o
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.n n() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.n r0 = r1.k
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.d0 o() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.kotlin.d0 r0 = r1.l
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.builtins.n p() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.builtins.n r0 = r1.p
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.e q() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.e r0 = r1.t
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j1 r() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j1 r0 = r1.r
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.components.o s() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.components.o r0 = r1.e
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final w3.b t() {
            r1 = this;
            w3.b r0 = r1.j
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.storage.n u() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.h1 v() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.h1 r0 = r1.m
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.resolve.jvm.e w() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.jvm.e r0 = r1.x
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.d x(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.components.j r30) {
            r29 = this;
            r0 = r29
            java.lang.String r1 = "javaResolverCache"
            r9 = r30
            kotlin.jvm.internal.g0.p(r9, r1)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r2 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.d
            kotlin.reflect.jvm.internal.impl.storage.n r3 = r0.a
            kotlin.reflect.jvm.internal.impl.load.java.t r4 = r0.b
            kotlin.reflect.jvm.internal.impl.load.kotlin.v r5 = r0.c
            kotlin.reflect.jvm.internal.impl.load.kotlin.n r6 = r0.d
            kotlin.reflect.jvm.internal.impl.load.java.components.o r7 = r0.e
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r8 = r0.f
            kotlin.reflect.jvm.internal.impl.load.java.components.i r10 = r0.h
            a4.a r11 = r0.i
            w3.b r12 = r0.j
            kotlin.reflect.jvm.internal.impl.load.java.lazy.n r13 = r0.k
            kotlin.reflect.jvm.internal.impl.load.kotlin.d0 r14 = r0.l
            kotlin.reflect.jvm.internal.impl.descriptors.h1 r15 = r0.m
            t3.c r1 = r0.n
            r16 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r1 = r0.o
            r17 = r1
            kotlin.reflect.jvm.internal.impl.builtins.n r1 = r0.p
            r18 = r1
            kotlin.reflect.jvm.internal.impl.load.java.c r1 = r0.q
            r19 = r1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j1 r1 = r0.r
            r20 = r1
            kotlin.reflect.jvm.internal.impl.load.java.u r1 = r0.s
            r21 = r1
            kotlin.reflect.jvm.internal.impl.load.java.lazy.e r1 = r0.t
            r22 = r1
            kotlin.reflect.jvm.internal.impl.types.checker.p r1 = r0.u
            r23 = r1
            kotlin.reflect.jvm.internal.impl.load.java.d0 r1 = r0.v
            r24 = r1
            kotlin.reflect.jvm.internal.impl.load.java.z r1 = r0.w
            r27 = 8388608(0x800000, float:1.1754944E-38)
            r28 = 0
            r26 = 0
            r25 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r2
    }
}
