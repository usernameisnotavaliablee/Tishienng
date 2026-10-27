package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBuiltInsLoaderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInsLoaderImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/builtins/BuiltInsLoaderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1617#2,9:94\n1869#2:103\n1870#2:106\n1626#2:107\n1#3:104\n1#3:105\n*S KotlinDebug\n*F\n+ 1 BuiltInsLoaderImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/builtins/BuiltInsLoaderImpl\n*L\n57#1:94,9\n57#1:103\n57#1:106\n57#1:107\n57#1:105\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b implements kotlin.reflect.jvm.internal.impl.builtins.b {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, java.io.InputStream> {
        a(java.lang.Object r8) {
                r7 = this;
                java.lang.String r5 = "loadResource(Ljava/lang/String;)Ljava/io/InputStream;"
                r6 = 0
                r1 = 1
                java.lang.Class<kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d> r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d.class
                java.lang.String r4 = "loadResource"
                r0 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        public final java.io.InputStream c(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.Object r0 = r1.receiver
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d) r0
                java.io.InputStream r2 = r0.a(r2)
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.io.InputStream invoke(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                java.io.InputStream r1 = r0.c(r1)
                return r1
        }
    }

    public b() {
            r1 = this;
            r1.<init>()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d
            r0.<init>()
            r1.b = r0
            return
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.m0 c(kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.b r10, kotlin.reflect.jvm.internal.impl.storage.n r11, kotlin.reflect.jvm.internal.impl.descriptors.f0 r12, java.util.Set r13, java.lang.Iterable r14, q3.c r15, q3.a r16, boolean r17, kotlin.jvm.functions.Function1 r18, int r19, java.lang.Object r20) {
            r0 = r19 & 32
            if (r0 == 0) goto L12
            q3.a$a r0 = q3.a.a.a
            r7 = r0
        L7:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r8 = r17
            r9 = r18
            goto L15
        L12:
            r7 = r16
            goto L7
        L15:
            kotlin.reflect.jvm.internal.impl.descriptors.m0 r10 = r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.b
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.m0 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r12, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends q3.b> r13, @org.jetbrains.annotations.NotNull q3.c r14, @org.jetbrains.annotations.NotNull q3.a r15, boolean r16) {
            r10 = this;
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "builtInsModule"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "classDescriptorFactories"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "platformDependentDeclarationFilter"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "additionalClassPartsProvider"
            kotlin.jvm.internal.g0.p(r15, r0)
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.c> r4 = kotlin.reflect.jvm.internal.impl.builtins.o.K
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.b$a r9 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.b$a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d r0 = r10.b
            r9.<init>(r0)
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            kotlin.reflect.jvm.internal.impl.descriptors.m0 r11 = r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.m0 b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r25, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r26, @org.jetbrains.annotations.NotNull java.util.Set<kotlin.reflect.jvm.internal.impl.name.c> r27, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends q3.b> r28, @org.jetbrains.annotations.NotNull q3.c r29, @org.jetbrains.annotations.NotNull q3.a r30, boolean r31, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, ? extends java.io.InputStream> r32) {
            r24 = this;
            r1 = r25
            r2 = r26
            r6 = r32
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "packageFqNames"
            r3 = r27
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "classDescriptorFactories"
            r11 = r28
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "platformDependentDeclarationFilter"
            r15 = r29
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "additionalClassPartsProvider"
            r14 = r30
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "loadResource"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r3.iterator()
        L3a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r8.next()
            kotlin.reflect.jvm.internal.impl.name.c r0 = (kotlin.reflect.jvm.internal.impl.name.c) r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.r
            java.lang.String r3 = r3.r(r0)
            java.lang.Object r3 = r6.invoke(r3)
            r4 = r3
            java.io.InputStream r4 = (java.io.InputStream) r4
            if (r4 == 0) goto L64
            r1 = r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.c$a r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.c.o
            r5 = r31
            r3 = r2
            r2 = r25
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.c r0 = r0.a(r1, r2, r3, r4, r5)
            r1 = r2
            r2 = r3
            goto L65
        L64:
            r0 = 0
        L65:
            if (r0 == 0) goto L3a
            r7.add(r0)
            goto L3a
        L6b:
            kotlin.reflect.jvm.internal.impl.descriptors.p0 r6 = new kotlin.reflect.jvm.internal.impl.descriptors.p0
            r6.<init>(r7)
            kotlin.reflect.jvm.internal.impl.descriptors.k0 r12 = new kotlin.reflect.jvm.internal.impl.descriptors.k0
            r12.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.m
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.n$a r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.n.a.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.p r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.p
            r4.<init>(r6)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.e r5 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.e
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a r8 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.r
            r5.<init>(r2, r12, r8)
            r9 = r7
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0$a r7 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0.a.a
            r10 = r8
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r8 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.a
            java.lang.String r13 = "DO_NOTHING"
            kotlin.jvm.internal.g0.o(r8, r13)
            r13 = r9
            t3.c$a r9 = t3.c.a.a
            r16 = r10
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.w$a r10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.w.a.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.l$a r17 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.l.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.l r17 = r17.a()
            kotlin.reflect.jvm.internal.impl.protobuf.f r16 = r16.e()
            r27 = r0
            a4.b r0 = new a4.b
            java.util.List r18 = kotlin.collections.f0.J()
            r2 = r18
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r0.<init>(r1, r2)
            r21 = 851968(0xd0000, float:1.193861E-39)
            r22 = 0
            r2 = r13
            r13 = r17
            r17 = 0
            r19 = 0
            r20 = 0
            r18 = r0
            r23 = r2
            r2 = r26
            r0 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.util.Iterator r1 = r23.iterator()
        Lcc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ldc
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.c r2 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.c) r2
            r2.G0(r0)
            goto Lcc
        Ldc:
            return r6
    }
}
