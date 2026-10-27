package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class k {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.k.a b = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.k$a$a, reason: collision with other inner class name */
        public static final class C0052a {

            @org.jetbrains.annotations.NotNull
            private final kotlin.reflect.jvm.internal.impl.load.kotlin.k a;

            @org.jetbrains.annotations.NotNull
            private final kotlin.reflect.jvm.internal.impl.load.kotlin.n b;

            public C0052a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.k r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.n r3) {
                    r1 = this;
                    java.lang.String r0 = "deserializationComponentsForJava"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    java.lang.String r0 = "deserializedDescriptorResolver"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r1.<init>()
                    r1.a = r2
                    r1.b = r3
                    return
            }

            @org.jetbrains.annotations.NotNull
            public final kotlin.reflect.jvm.internal.impl.load.kotlin.k a() {
                    r1 = this;
                    kotlin.reflect.jvm.internal.impl.load.kotlin.k r0 = r1.a
                    return r0
            }

            @org.jetbrains.annotations.NotNull
            public final kotlin.reflect.jvm.internal.impl.load.kotlin.n b() {
                    r1 = this;
                    kotlin.reflect.jvm.internal.impl.load.kotlin.n r0 = r1.b
                    return r0
            }
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.k.a.C0052a a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.v r25, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.v r26, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.t r27, @org.jetbrains.annotations.NotNull java.lang.String r28, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r29, @org.jetbrains.annotations.NotNull w3.b r30) {
                r24 = this;
                r0 = r28
                java.lang.String r1 = "kotlinClassFinder"
                r6 = r25
                kotlin.jvm.internal.g0.p(r6, r1)
                java.lang.String r1 = "jvmBuiltInsKotlinClassFinder"
                r14 = r26
                kotlin.jvm.internal.g0.p(r14, r1)
                java.lang.String r1 = "javaClassFinder"
                r2 = r27
                kotlin.jvm.internal.g0.p(r2, r1)
                java.lang.String r1 = "moduleName"
                kotlin.jvm.internal.g0.p(r0, r1)
                java.lang.String r1 = "errorReporter"
                r8 = r29
                kotlin.jvm.internal.g0.p(r8, r1)
                java.lang.String r1 = "javaSourceElementFactory"
                r9 = r30
                kotlin.jvm.internal.g0.p(r9, r1)
                kotlin.reflect.jvm.internal.impl.storage.f r3 = new kotlin.reflect.jvm.internal.impl.storage.f
                java.lang.String r1 = "DeserializationComponentsForJava.ModuleData"
                r3.<init>(r1)
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns r1 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind r4 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.FROM_DEPENDENCIES
                r1.<init>(r3, r4)
                kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r15 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.f0
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r5 = 60
                r4.append(r5)
                r4.append(r0)
                r0 = 62
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.f.k(r0)
                java.lang.String r4 = "special(...)"
                kotlin.jvm.internal.g0.o(r0, r4)
                r22 = 56
                r23 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r16 = r0
                r18 = r1
                r17 = r3
                r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
                r0 = r18
                r0.F0(r15)
                r1 = 1
                r0.N0(r15, r1)
                kotlin.reflect.jvm.internal.impl.load.kotlin.n r7 = new kotlin.reflect.jvm.internal.impl.load.kotlin.n
                r7.<init>()
                kotlin.reflect.jvm.internal.impl.load.java.lazy.o r10 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.o
                r10.<init>()
                kotlin.reflect.jvm.internal.impl.descriptors.k0 r4 = new kotlin.reflect.jvm.internal.impl.descriptors.k0
                r4.<init>(r3, r15)
                r12 = 512(0x200, float:7.17E-43)
                r13 = 0
                r11 = 0
                r5 = r4
                r4 = r3
                r3 = r15
                kotlin.reflect.jvm.internal.impl.load.java.lazy.j r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.l.c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r3 = r4
                r4 = r5
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r9 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.c.i
                r5 = r2
                r2 = r15
                kotlin.reflect.jvm.internal.impl.load.kotlin.k r12 = kotlin.reflect.jvm.internal.impl.load.kotlin.l.a(r2, r3, r4, r5, r6, r7, r8, r9)
                r13 = r7
                r13.o(r12)
                kotlin.reflect.jvm.internal.impl.resolve.jvm.c r2 = new kotlin.reflect.jvm.internal.impl.resolve.jvm.c
                kotlin.reflect.jvm.internal.impl.load.java.components.j r6 = kotlin.reflect.jvm.internal.impl.load.java.components.j.a
                java.lang.String r7 = "EMPTY"
                kotlin.jvm.internal.g0.o(r6, r7)
                r2.<init>(r5, r6)
                r10.c(r2)
                r5 = r2
                kotlin.reflect.jvm.internal.impl.builtins.jvm.v r2 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.v
                kotlin.reflect.jvm.internal.impl.builtins.jvm.t r7 = r0.M0()
                kotlin.reflect.jvm.internal.impl.builtins.jvm.t r8 = r0.M0()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.n$a r9 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.n.a.a
                kotlin.reflect.jvm.internal.impl.types.checker.p$a r0 = kotlin.reflect.jvm.internal.impl.types.checker.p.b
                kotlin.reflect.jvm.internal.impl.types.checker.q r10 = r0.a()
                a4.b r11 = new a4.b
                java.util.List r0 = kotlin.collections.f0.J()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                r11.<init>(r3, r0)
                r6 = r4
                r0 = r5
                r4 = r14
                r5 = r15
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                kotlin.reflect.jvm.internal.impl.descriptors.impl.f0[] r3 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.f0[r1]
                r4 = 0
                r3[r4] = r15
                r15.R0(r3)
                kotlin.reflect.jvm.internal.impl.descriptors.impl.l r3 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.l
                kotlin.reflect.jvm.internal.impl.load.java.lazy.j r0 = r0.a()
                r5 = 2
                kotlin.reflect.jvm.internal.impl.descriptors.r0[] r5 = new kotlin.reflect.jvm.internal.impl.descriptors.r0[r5]
                r5[r4] = r0
                r5[r1] = r2
                java.util.List r0 = kotlin.collections.f0.Q(r5)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "CompositeProvider@RuntimeModuleData for "
                r1.append(r2)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                r3.<init>(r0, r1)
                r15.J0(r3)
                kotlin.reflect.jvm.internal.impl.load.kotlin.k$a$a r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.k$a$a
                r0.<init>(r12, r13)
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.load.kotlin.k$a r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.k$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.load.kotlin.k.b = r0
            return
    }

    public k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r22, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r23, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.n r24, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.o r25, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.h r26, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.j r27, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k0 r28, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r29, @org.jetbrains.annotations.NotNull t3.c r30, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.l r31, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.p r32, @org.jetbrains.annotations.NotNull c4.a r33) {
            r21 = this;
            r1 = r22
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "moduleDescriptor"
            r2 = r23
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "configuration"
            r3 = r24
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "classDataFinder"
            r4 = r25
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "annotationAndConstantLoader"
            r5 = r26
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "packageFragmentProvider"
            r6 = r27
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "notFoundClasses"
            r12 = r28
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "errorReporter"
            r8 = r29
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "lookupTracker"
            r9 = r30
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "contractDeserializer"
            r13 = r31
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "kotlinTypeChecker"
            r7 = r32
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "typeAttributeTranslators"
            r10 = r33
            kotlin.jvm.internal.g0.p(r10, r0)
            r21.<init>()
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = r2.p()
            boolean r11 = r0 instanceof kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns
            if (r11 == 0) goto L62
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns r0 = (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns) r0
            goto L63
        L62:
            r0 = 0
        L63:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r11 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.m
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0$a r7 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0.a.a
            kotlin.reflect.jvm.internal.impl.load.kotlin.p r10 = kotlin.reflect.jvm.internal.impl.load.kotlin.p.a
            java.util.List r14 = kotlin.collections.f0.J()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            if (r0 == 0) goto L78
            kotlin.reflect.jvm.internal.impl.builtins.jvm.t r15 = r0.M0()
            if (r15 == 0) goto L78
            goto L7a
        L78:
            q3.a$a r15 = q3.a.a.a
        L7a:
            if (r0 == 0) goto L83
            kotlin.reflect.jvm.internal.impl.builtins.jvm.t r0 = r0.M0()
            if (r0 == 0) goto L83
            goto L85
        L83:
            q3.c$b r0 = q3.c.b.a
        L85:
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h r16 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.a
            kotlin.reflect.jvm.internal.impl.protobuf.f r16 = r16.a()
            r17 = r0
            a4.b r0 = new a4.b
            java.util.List r18 = kotlin.collections.f0.J()
            r2 = r18
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r0.<init>(r1, r2)
            java.util.List r19 = r33.a()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.y r20 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.y.a
            r2 = r23
            r18 = r0
            r0 = r11
            r11 = r14
            r14 = r15
            r15 = r17
            r17 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = r0
            r0 = r21
            r0.a = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r1.a
            return r0
    }
}
