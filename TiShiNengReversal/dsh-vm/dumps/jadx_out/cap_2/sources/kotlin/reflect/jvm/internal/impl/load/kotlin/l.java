package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class l {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements kotlin.reflect.jvm.internal.impl.load.java.z {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.z
        public java.util.List<x3.a> a(kotlin.reflect.jvm.internal.impl.name.b r2) {
                r1 = this;
                java.lang.String r0 = "classId"
                kotlin.jvm.internal.g0.p(r2, r0)
                r2 = 0
                return r2
        }
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.k a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k0 r15, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.j r16, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.v r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.n r18, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r19, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r20) {
            r0 = r17
            r1 = r18
            r2 = r20
            java.lang.String r3 = "module"
            kotlin.jvm.internal.g0.p(r13, r3)
            java.lang.String r3 = "storageManager"
            kotlin.jvm.internal.g0.p(r14, r3)
            java.lang.String r3 = "notFoundClasses"
            kotlin.jvm.internal.g0.p(r15, r3)
            java.lang.String r3 = "lazyJavaPackageFragmentProvider"
            r6 = r16
            kotlin.jvm.internal.g0.p(r6, r3)
            java.lang.String r3 = "reflectKotlinClassFinder"
            kotlin.jvm.internal.g0.p(r0, r3)
            java.lang.String r3 = "deserializedDescriptorResolver"
            kotlin.jvm.internal.g0.p(r1, r3)
            java.lang.String r3 = "errorReporter"
            r8 = r19
            kotlin.jvm.internal.g0.p(r8, r3)
            java.lang.String r3 = "metadataVersion"
            kotlin.jvm.internal.g0.p(r2, r3)
            kotlin.reflect.jvm.internal.impl.load.kotlin.o r4 = new kotlin.reflect.jvm.internal.impl.load.kotlin.o
            r4.<init>(r0, r1)
            kotlin.reflect.jvm.internal.impl.load.kotlin.h r5 = kotlin.reflect.jvm.internal.impl.load.kotlin.i.a(r13, r15, r14, r0, r2)
            kotlin.reflect.jvm.internal.impl.load.kotlin.k r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.k
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.n$a r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.n.a.a
            t3.c$a r9 = t3.c.a.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.l$a r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.l.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.l r10 = r1.a()
            kotlin.reflect.jvm.internal.impl.types.checker.p$a r1 = kotlin.reflect.jvm.internal.impl.types.checker.p.b
            kotlin.reflect.jvm.internal.impl.types.checker.q r11 = r1.a()
            c4.a r12 = new c4.a
            kotlin.reflect.jvm.internal.impl.types.y r1 = kotlin.reflect.jvm.internal.impl.types.y.a
            java.util.List r1 = kotlin.collections.f0.l(r1)
            r12.<init>(r1)
            r2 = r13
            r1 = r14
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.j b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.t r27, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r28, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r29, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k0 r30, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.v r31, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.n r32, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r33, @org.jetbrains.annotations.NotNull w3.b r34, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.n r35, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.d0 r36) {
            r15 = r28
            r1 = r29
            r0 = r30
            java.lang.String r2 = "javaClassFinder"
            r3 = r27
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "module"
            kotlin.jvm.internal.g0.p(r15, r2)
            java.lang.String r2 = "storageManager"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.lang.String r2 = "notFoundClasses"
            kotlin.jvm.internal.g0.p(r0, r2)
            java.lang.String r2 = "reflectKotlinClassFinder"
            r4 = r31
            kotlin.jvm.internal.g0.p(r4, r2)
            java.lang.String r2 = "deserializedDescriptorResolver"
            r5 = r32
            kotlin.jvm.internal.g0.p(r5, r2)
            java.lang.String r2 = "errorReporter"
            r6 = r33
            kotlin.jvm.internal.g0.p(r6, r2)
            java.lang.String r2 = "javaSourceElementFactory"
            r10 = r34
            kotlin.jvm.internal.g0.p(r10, r2)
            java.lang.String r2 = "singleModuleClassResolver"
            r11 = r35
            kotlin.jvm.internal.g0.p(r11, r2)
            java.lang.String r2 = "packagePartProvider"
            r12 = r36
            kotlin.jvm.internal.g0.p(r12, r2)
            kotlin.reflect.jvm.internal.impl.load.java.d0$a r2 = kotlin.reflect.jvm.internal.impl.load.java.d0.d
            kotlin.p r7 = new kotlin.p
            r8 = 1
            r9 = 9
            r7.<init>(r8, r9)
            kotlin.reflect.jvm.internal.impl.load.java.d0 r2 = r2.b(r7)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r7 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.d
            kotlin.reflect.jvm.internal.impl.load.java.components.o r5 = kotlin.reflect.jvm.internal.impl.load.java.components.o.a
            java.lang.String r8 = "DO_NOTHING"
            kotlin.jvm.internal.g0.o(r5, r8)
            r8 = r7
            kotlin.reflect.jvm.internal.impl.load.java.components.j r7 = kotlin.reflect.jvm.internal.impl.load.java.components.j.a
            java.lang.String r9 = "EMPTY"
            kotlin.jvm.internal.g0.o(r7, r9)
            r9 = r8
            kotlin.reflect.jvm.internal.impl.load.java.components.i$a r8 = kotlin.reflect.jvm.internal.impl.load.java.components.i.a.a
            r13 = r9
            a4.b r9 = new a4.b
            java.util.List r14 = kotlin.collections.f0.J()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r9.<init>(r1, r14)
            r14 = r13
            kotlin.reflect.jvm.internal.impl.descriptors.h1$a r13 = kotlin.reflect.jvm.internal.impl.descriptors.h1.a.a
            r16 = r14
            t3.c$a r14 = t3.c.a.a
            kotlin.reflect.jvm.internal.impl.builtins.n r1 = new kotlin.reflect.jvm.internal.impl.builtins.n
            r1.<init>(r15, r0)
            kotlin.reflect.jvm.internal.impl.load.java.c r0 = new kotlin.reflect.jvm.internal.impl.load.java.c
            r0.<init>(r2)
            r17 = r0
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j1 r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j1
            r18 = r1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g r1 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g
            r22 = r2
            kotlin.reflect.jvm.internal.impl.load.java.lazy.e$b r2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.e.b.b
            r1.<init>(r2)
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.load.java.u$a r19 = kotlin.reflect.jvm.internal.impl.load.java.u.a.a
            kotlin.reflect.jvm.internal.impl.types.checker.p$a r1 = kotlin.reflect.jvm.internal.impl.types.checker.p.b
            kotlin.reflect.jvm.internal.impl.types.checker.q r21 = r1.a()
            kotlin.reflect.jvm.internal.impl.load.kotlin.l$a r23 = new kotlin.reflect.jvm.internal.impl.load.kotlin.l$a
            r23.<init>()
            r25 = 8388608(0x800000, float:1.1754944E-38)
            r26 = 0
            r24 = 0
            r1 = r18
            r18 = r0
            r0 = r16
            r16 = r1
            r1 = r29
            r20 = r2
            r2 = r3
            r3 = r4
            r4 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r8 = r0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.j r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.j
            r0.<init>(r8)
            return r0
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.j c(kotlin.reflect.jvm.internal.impl.load.java.t r11, kotlin.reflect.jvm.internal.impl.descriptors.f0 r12, kotlin.reflect.jvm.internal.impl.storage.n r13, kotlin.reflect.jvm.internal.impl.descriptors.k0 r14, kotlin.reflect.jvm.internal.impl.load.kotlin.v r15, kotlin.reflect.jvm.internal.impl.load.kotlin.n r16, kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r17, w3.b r18, kotlin.reflect.jvm.internal.impl.load.java.lazy.n r19, kotlin.reflect.jvm.internal.impl.load.kotlin.d0 r20, int r21, java.lang.Object r22) {
            r0 = r21
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L17
            kotlin.reflect.jvm.internal.impl.load.kotlin.d0$a r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.d0.a.a
            r10 = r0
        L9:
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            goto L1a
        L17:
            r10 = r20
            goto L9
        L1a:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.j r11 = b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
    }
}
