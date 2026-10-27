package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.load.kotlin.e.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAbstractBinaryClassAnnotationLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractBinaryClassAnnotationLoader.kt\norg/jetbrains/kotlin/load/kotlin/AbstractBinaryClassAnnotationLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,338:1\n1563#2:339\n1634#2,3:340\n1563#2:343\n1634#2,3:344\n*S KotlinDebug\n*F\n+ 1 AbstractBinaryClassAnnotationLoader.kt\norg/jetbrains/kotlin/load/kotlin/AbstractBinaryClassAnnotationLoader\n*L\n197#1:339\n197#1:340,3\n201#1:343\n201#1:344,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class e<A, S extends kotlin.reflect.jvm.internal.impl.load.kotlin.e.a<? extends A>> implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.g<A> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.e.b b = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.v a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class a<A> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public abstract java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, java.util.List<A>> a();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAbstractBinaryClassAnnotationLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractBinaryClassAnnotationLoader.kt\norg/jetbrains/kotlin/load/kotlin/AbstractBinaryClassAnnotationLoader$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,338:1\n1#2:339\n*E\n"})
    public static final class b {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ b(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.Nullable
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.x a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r7, boolean r8, boolean r9, @org.jetbrains.annotations.Nullable java.lang.Boolean r10, boolean r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.v r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r13) {
                r6 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.g0.p(r7, r0)
                java.lang.String r0 = "kotlinClassFinder"
                kotlin.jvm.internal.g0.p(r12, r0)
                java.lang.String r0 = "metadataVersion"
                kotlin.jvm.internal.g0.p(r13, r0)
                r0 = 0
                if (r8 == 0) goto L9f
                if (r10 == 0) goto L7f
                boolean r8 = r7 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0.a
                if (r8 == 0) goto L3b
                r8 = r7
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0$a r8 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0.a) r8
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r1 = r8.g()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r2 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.INTERFACE
                if (r1 != r2) goto L3b
                kotlin.reflect.jvm.internal.impl.name.b r7 = r8.e()
                java.lang.String r8 = "DefaultImpls"
                kotlin.reflect.jvm.internal.impl.name.f r8 = kotlin.reflect.jvm.internal.impl.name.f.h(r8)
                java.lang.String r9 = "identifier(...)"
                kotlin.jvm.internal.g0.o(r8, r9)
                kotlin.reflect.jvm.internal.impl.name.b r7 = r7.d(r8)
                kotlin.reflect.jvm.internal.impl.load.kotlin.x r7 = kotlin.reflect.jvm.internal.impl.load.kotlin.w.a(r12, r7, r13)
                return r7
            L3b:
                boolean r8 = r10.booleanValue()
                if (r8 == 0) goto L9f
                boolean r8 = r7 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0.b
                if (r8 == 0) goto L9f
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r8 = r7.c()
                boolean r10 = r8 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.r
                if (r10 == 0) goto L50
                kotlin.reflect.jvm.internal.impl.load.kotlin.r r8 = (kotlin.reflect.jvm.internal.impl.load.kotlin.r) r8
                goto L51
            L50:
                r8 = r0
            L51:
                if (r8 == 0) goto L58
                kotlin.reflect.jvm.internal.impl.resolve.jvm.d r8 = r8.f()
                goto L59
            L58:
                r8 = r0
            L59:
                if (r8 == 0) goto L9f
                kotlin.reflect.jvm.internal.impl.name.b$a r7 = kotlin.reflect.jvm.internal.impl.name.b.d
                kotlin.reflect.jvm.internal.impl.name.c r9 = new kotlin.reflect.jvm.internal.impl.name.c
                java.lang.String r0 = r8.f()
                java.lang.String r8 = "getInternalName(...)"
                kotlin.jvm.internal.g0.o(r0, r8)
                r4 = 4
                r5 = 0
                r1 = 47
                r2 = 46
                r3 = 0
                java.lang.String r8 = kotlin.text.u.w2(r0, r1, r2, r3, r4, r5)
                r9.<init>(r8)
                kotlin.reflect.jvm.internal.impl.name.b r7 = r7.c(r9)
                kotlin.reflect.jvm.internal.impl.load.kotlin.x r7 = kotlin.reflect.jvm.internal.impl.load.kotlin.w.a(r12, r7, r13)
                return r7
            L7f:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "isConst should not be null for property (container="
                r8.append(r9)
                r8.append(r7)
                r7 = 41
                r8.append(r7)
                java.lang.String r7 = r8.toString()
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r7 = r7.toString()
                r8.<init>(r7)
                throw r8
            L9f:
                if (r9 == 0) goto Lec
                boolean r8 = r7 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0.a
                if (r8 == 0) goto Lec
                r8 = r7
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0$a r8 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0.a) r8
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r9 = r8.g()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r10 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.COMPANION_OBJECT
                if (r9 != r10) goto Lec
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0$a r8 = r8.h()
                if (r8 == 0) goto Lec
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r9 = r8.g()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r10 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.CLASS
                if (r9 == r10) goto Ld8
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r9 = r8.g()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r10 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.ENUM_CLASS
                if (r9 == r10) goto Ld8
                if (r11 == 0) goto Lec
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r9 = r8.g()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r10 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.INTERFACE
                if (r9 == r10) goto Ld8
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r9 = r8.g()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r10 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.ANNOTATION_CLASS
                if (r9 != r10) goto Lec
            Ld8:
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r7 = r8.c()
                boolean r8 = r7 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.z
                if (r8 == 0) goto Le3
                kotlin.reflect.jvm.internal.impl.load.kotlin.z r7 = (kotlin.reflect.jvm.internal.impl.load.kotlin.z) r7
                goto Le4
            Le3:
                r7 = r0
            Le4:
                if (r7 == 0) goto Leb
                kotlin.reflect.jvm.internal.impl.load.kotlin.x r7 = r7.d()
                return r7
            Leb:
                return r0
            Lec:
                boolean r8 = r7 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0.b
                if (r8 == 0) goto L113
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r8 = r7.c()
                boolean r8 = r8 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.r
                if (r8 == 0) goto L113
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r7 = r7.c()
                java.lang.String r8 = "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource"
                kotlin.jvm.internal.g0.n(r7, r8)
                kotlin.reflect.jvm.internal.impl.load.kotlin.r r7 = (kotlin.reflect.jvm.internal.impl.load.kotlin.r) r7
                kotlin.reflect.jvm.internal.impl.load.kotlin.x r8 = r7.g()
                if (r8 != 0) goto L112
                kotlin.reflect.jvm.internal.impl.name.b r7 = r7.d()
                kotlin.reflect.jvm.internal.impl.load.kotlin.x r7 = kotlin.reflect.jvm.internal.impl.load.kotlin.w.a(r12, r7, r13)
                return r7
            L112:
                return r8
            L113:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum c extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.load.kotlin.e.c> {
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.e.c a = null;
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.e.c b = null;
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.e.c c = null;
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.e.c[] d = null;
        private static final /* synthetic */ kotlin.enums.a e = null;

        static {
                kotlin.reflect.jvm.internal.impl.load.kotlin.e$c r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.e$c
                java.lang.String r1 = "PROPERTY"
                r2 = 0
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.impl.load.kotlin.e.c.a = r0
                kotlin.reflect.jvm.internal.impl.load.kotlin.e$c r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.e$c
                java.lang.String r1 = "BACKING_FIELD"
                r2 = 1
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.impl.load.kotlin.e.c.b = r0
                kotlin.reflect.jvm.internal.impl.load.kotlin.e$c r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.e$c
                java.lang.String r1 = "DELEGATE_FIELD"
                r2 = 2
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.impl.load.kotlin.e.c.c = r0
                kotlin.reflect.jvm.internal.impl.load.kotlin.e$c[] r0 = a()
                kotlin.reflect.jvm.internal.impl.load.kotlin.e.c.d = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                kotlin.reflect.jvm.internal.impl.load.kotlin.e.c.e = r0
                return
        }

        c(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.e.c[] a() {
                r0 = 3
                kotlin.reflect.jvm.internal.impl.load.kotlin.e$c[] r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.e.c[r0]
                kotlin.reflect.jvm.internal.impl.load.kotlin.e$c r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.e.c.a
                r2 = 0
                r0[r2] = r1
                kotlin.reflect.jvm.internal.impl.load.kotlin.e$c r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.e.c.b
                r2 = 1
                r0[r2] = r1
                kotlin.reflect.jvm.internal.impl.load.kotlin.e$c r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.e.c.c
                r2 = 2
                r0[r2] = r1
                return r0
        }

        public static kotlin.reflect.jvm.internal.impl.load.kotlin.e.c valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.reflect.jvm.internal.impl.load.kotlin.e$c> r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.e.c.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.reflect.jvm.internal.impl.load.kotlin.e$c r1 = (kotlin.reflect.jvm.internal.impl.load.kotlin.e.c) r1
                return r1
        }

        public static kotlin.reflect.jvm.internal.impl.load.kotlin.e.c[] values() {
                kotlin.reflect.jvm.internal.impl.load.kotlin.e$c[] r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.e.c.d
                java.lang.Object r0 = r0.clone()
                kotlin.reflect.jvm.internal.impl.load.kotlin.e$c[] r0 = (kotlin.reflect.jvm.internal.impl.load.kotlin.e.c[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind[] r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_SETTER     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.reflect.jvm.internal.impl.load.kotlin.e.d.a = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.e$e, reason: collision with other inner class name */
    public static final class C0045e implements kotlin.reflect.jvm.internal.impl.load.kotlin.x.c {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.e<A, S> a;
        final /* synthetic */ java.util.ArrayList<A> b;

        C0045e(kotlin.reflect.jvm.internal.impl.load.kotlin.e<A, S> r1, java.util.ArrayList<A> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.c
        public kotlin.reflect.jvm.internal.impl.load.kotlin.x.a b(kotlin.reflect.jvm.internal.impl.name.b r3, kotlin.reflect.jvm.internal.impl.descriptors.e1 r4) {
                r2 = this;
                java.lang.String r0 = "classId"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r4, r0)
                kotlin.reflect.jvm.internal.impl.load.kotlin.e<A, S extends kotlin.reflect.jvm.internal.impl.load.kotlin.e$a<? extends A>> r0 = r2.a
                java.util.ArrayList<A> r1 = r2.b
                kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r3 = r0.y(r3, r4, r1)
                return r3
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x.c
        public void visitEnd() {
                r0 = this;
                return
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.load.kotlin.e$b r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.e$b
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.load.kotlin.e.b = r0
            return
    }

    public e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.v r2) {
            r1 = this;
            java.lang.String r0 = "kotlinClassFinder"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    private final kotlin.reflect.jvm.internal.impl.load.kotlin.x A(kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0.a r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r3 = r3.c()
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.z
            r1 = 0
            if (r0 == 0) goto Lc
            kotlin.reflect.jvm.internal.impl.load.kotlin.z r3 = (kotlin.reflect.jvm.internal.impl.load.kotlin.z) r3
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r3 == 0) goto L14
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r3 = r3.d()
            return r3
        L14:
            return r1
    }

    private final int m(kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r4, kotlin.reflect.jvm.internal.impl.protobuf.n r5) {
            r3 = this;
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r5
            boolean r4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.g(r5)
            if (r4 == 0) goto Lf
            return r2
        Lf:
            return r1
        L10:
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property
            if (r0 == 0) goto L1e
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r5
            boolean r4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.g.h(r5)
            if (r4 == 0) goto L1d
            return r2
        L1d:
            return r1
        L1e:
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor
            if (r0 == 0) goto L3b
            java.lang.String r5 = "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class"
            kotlin.jvm.internal.g0.n(r4, r5)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0$a r4 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0.a) r4
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r5 = r4.g()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.ENUM_CLASS
            if (r5 != r0) goto L33
            r4 = 2
            return r4
        L33:
            boolean r4 = r4.i()
            if (r4 == 0) goto L3a
            return r2
        L3a:
            return r1
        L3b:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported message: "
            r0.append(r1)
            java.lang.Class r5 = r5.getClass()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    private final java.util.List<A> n(kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r9, kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r10, boolean r11, boolean r12, java.lang.Boolean r13, boolean r14) {
            r8 = this;
            kotlin.reflect.jvm.internal.impl.load.kotlin.e$b r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.e.b
            kotlin.reflect.jvm.internal.impl.load.kotlin.v r6 = r8.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r7 = r8.v()
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r9 = r0.a(r1, r2, r3, r4, r5, r6, r7)
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r9 = r8.p(r1, r9)
            if (r9 != 0) goto L1c
            java.util.List r9 = kotlin.collections.f0.J()
            return r9
        L1c:
            kotlin.reflect.jvm.internal.impl.load.kotlin.e$a r9 = r8.q(r9)
            java.util.Map r9 = r9.a()
            java.lang.Object r9 = r9.get(r10)
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L30
            java.util.List r9 = kotlin.collections.f0.J()
        L30:
            return r9
    }

    static /* synthetic */ java.util.List o(kotlin.reflect.jvm.internal.impl.load.kotlin.e r1, kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r2, kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r3, boolean r4, boolean r5, java.lang.Boolean r6, boolean r7, int r8, java.lang.Object r9) {
            if (r9 != 0) goto L1c
            r9 = r8 & 4
            r0 = 0
            if (r9 == 0) goto L8
            r4 = 0
        L8:
            r9 = r8 & 8
            if (r9 == 0) goto Ld
            r5 = 0
        Ld:
            r9 = r8 & 16
            if (r9 == 0) goto L12
            r6 = 0
        L12:
            r8 = r8 & 32
            if (r8 == 0) goto L17
            r7 = 0
        L17:
            java.util.List r1 = r1.n(r2, r3, r4, r5, r6, r7)
            return r1
        L1c:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations"
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.a0 t(kotlin.reflect.jvm.internal.impl.load.kotlin.e r6, kotlin.reflect.jvm.internal.impl.protobuf.n r7, kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r8, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r9, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r10, boolean r11, int r12, java.lang.Object r13) {
            if (r13 != 0) goto L15
            r12 = r12 & 16
            if (r12 == 0) goto Le
            r11 = 0
            r5 = 0
        L8:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            goto L10
        Le:
            r5 = r11
            goto L8
        L10:
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r6 = r0.s(r1, r2, r3, r4, r5)
            return r6
        L15:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r7 = "Super calls with default arguments not supported in this target, function: getCallableSignature"
            r6.<init>(r7)
            throw r6
    }

    private final java.util.List<A> z(kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r19, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r20, kotlin.reflect.jvm.internal.impl.load.kotlin.e.c r21) {
            r18 = this;
            r0 = r21
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r1 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.B
            int r2 = r20.getFlags()
            java.lang.Boolean r8 = r1.g(r2)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.g0.o(r8, r1)
            r8.booleanValue()
            boolean r9 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.f(r20)
            kotlin.reflect.jvm.internal.impl.load.kotlin.e$c r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.e.c.a
            if (r0 != r1) goto L46
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r11 = r19.b()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r12 = r19.d()
            r16 = 40
            r17 = 0
            r13 = 0
            r14 = 1
            r15 = 0
            r10 = r20
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r5 = kotlin.reflect.jvm.internal.impl.load.kotlin.f.b(r10, r11, r12, r13, r14, r15, r16, r17)
            if (r5 != 0) goto L38
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
        L38:
            r10 = 8
            r11 = 0
            r6 = 1
            r7 = 0
            r3 = r18
            r4 = r19
            java.util.List r0 = o(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L46:
            r10 = r9
            r9 = r8
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2 = r19.b()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r3 = r19.d()
            r7 = 48
            r8 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            r1 = r20
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r5 = kotlin.reflect.jvm.internal.impl.load.kotlin.f.b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r5 != 0) goto L63
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
        L63:
            java.lang.String r1 = r5.a()
            r2 = 2
            r3 = 0
            java.lang.String r4 = "$delegate"
            r6 = 0
            boolean r1 = kotlin.text.u.l3(r1, r4, r6, r2, r3)
            kotlin.reflect.jvm.internal.impl.load.kotlin.e$c r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.e.c.c
            if (r0 != r2) goto L75
            r6 = 1
        L75:
            if (r1 == r6) goto L7c
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
        L7c:
            r6 = 1
            r7 = 1
            r3 = r18
            r4 = r19
            r8 = r9
            r9 = r10
            java.util.List r0 = r3.n(r4, r5, r6, r7, r8, r9)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<A> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.protobuf.n r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r12, int r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter r14) {
            r9 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "callableProto"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r14, r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3 = r10.b()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r4 = r10.d()
            r7 = 16
            r8 = 0
            r6 = 0
            r1 = r9
            r2 = r11
            r5 = r12
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r11 = t(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 == 0) goto L42
            int r12 = r9.m(r10, r2)
            int r13 = r13 + r12
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0$a r12 = kotlin.reflect.jvm.internal.impl.load.kotlin.a0.b
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r2 = r12.e(r11, r13)
            r7 = 60
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r1 = r10
            java.util.List r10 = o(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
        L42:
            java.util.List r10 = kotlin.collections.f0.J()
            return r10
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<A> b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0.a r4) {
            r3 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r0 = r3.A(r4)
            if (r0 == 0) goto L1e
            java.util.ArrayList r4 = new java.util.ArrayList
            r1 = 1
            r4.<init>(r1)
            kotlin.reflect.jvm.internal.impl.load.kotlin.e$e r1 = new kotlin.reflect.jvm.internal.impl.load.kotlin.e$e
            r1.<init>(r3, r4)
            byte[] r2 = r3.r(r0)
            r0.f(r1, r2)
            return r4
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Class for loading annotations is not found: "
            r1.append(r2)
            kotlin.reflect.jvm.internal.impl.name.c r4 = r4.a()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<A> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry r13) {
            r11 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r13, r0)
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0$a r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.a0.b
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r1 = r12.b()
            int r13 = r13.getName()
            java.lang.String r13 = r1.getString(r13)
            r1 = r12
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0$a r1 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0.a) r1
            kotlin.reflect.jvm.internal.impl.name.b r1 = r1.e()
            java.lang.String r1 = r1.b()
            java.lang.String r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.b(r1)
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r4 = r0.a(r13, r1)
            r9 = 60
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r2 = r11
            r3 = r12
            java.util.List r12 = o(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<A> d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r4) {
            r2 = this;
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation>> r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.h
            java.lang.Object r3 = r3.getExtension(r0)
            java.lang.String r0 = "getExtension(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L26:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r3.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r1
            kotlin.jvm.internal.g0.m(r1)
            java.lang.Object r1 = r2.k(r1, r4)
            r0.add(r1)
            goto L26
        L3d:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<A> f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r3) {
            r1 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.load.kotlin.e$c r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.e.c.b
            java.util.List r2 = r1.z(r2, r3, r0)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<A> g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.protobuf.n r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r12) {
            r9 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r12, r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3 = r10.b()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r4 = r10.d()
            r7 = 16
            r8 = 0
            r6 = 0
            r1 = r9
            r2 = r11
            r5 = r12
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r11 = t(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 == 0) goto L39
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0$a r12 = kotlin.reflect.jvm.internal.impl.load.kotlin.a0.b
            r0 = 0
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r2 = r12.e(r11, r0)
            r7 = 60
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r1 = r10
            java.util.List r10 = o(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
        L39:
            java.util.List r10 = kotlin.collections.f0.J()
            return r10
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<A> h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r4) {
            r2 = this;
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation>> r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.f
            java.lang.Object r3 = r3.getExtension(r0)
            java.lang.String r0 = "getExtension(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L26:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r3.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r1
            kotlin.jvm.internal.g0.m(r1)
            java.lang.Object r1 = r2.k(r1, r4)
            r0.add(r1)
            goto L26
        L3d:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<A> i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.protobuf.n r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r13) {
            r10 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r13, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY
            if (r13 != r0) goto L1d
            r0 = r12
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r0
            kotlin.reflect.jvm.internal.impl.load.kotlin.e$c r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.e.c.a
            java.util.List r0 = r10.z(r11, r0, r2)
            return r0
        L1d:
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r4 = r11.b()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r5 = r11.d()
            r8 = 16
            r9 = 0
            r7 = 0
            r2 = r10
            r3 = r12
            r6 = r13
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r0 = t(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 != 0) goto L37
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
        L37:
            r7 = 60
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r11
            r2 = r0
            r0 = r10
            java.util.List r1 = o(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    @org.jetbrains.annotations.NotNull
    public abstract A k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2);

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<A> l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r3) {
            r1 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.load.kotlin.e$c r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.e.c.c
            java.util.List r2 = r1.z(r2, r3, r0)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    protected final kotlin.reflect.jvm.internal.impl.load.kotlin.x p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.load.kotlin.x r3) {
            r1 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r3 != 0) goto L14
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0.a
            if (r3 == 0) goto L12
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0$a r2 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0.a) r2
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r2 = r1.A(r2)
            return r2
        L12:
            r2 = 0
            return r2
        L14:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    protected abstract S q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.x r1);

    @org.jetbrains.annotations.Nullable
    protected byte[] r(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.x r2) {
            r1 = this;
            java.lang.String r0 = "kotlinClass"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    protected final kotlin.reflect.jvm.internal.impl.load.kotlin.a0 s(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.protobuf.n r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r12, boolean r13) {
            r8 = this;
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r12, r0)
            boolean r0 = r9 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor
            r1 = 0
            if (r0 == 0) goto L2b
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0$a r12 = kotlin.reflect.jvm.internal.impl.load.kotlin.a0.b
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h r13 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r9 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) r9
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b r9 = r13.b(r9, r10, r11)
            if (r9 != 0) goto L26
            return r1
        L26:
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r9 = r12.b(r9)
            return r9
        L2b:
            boolean r0 = r9 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function
            if (r0 == 0) goto L41
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0$a r12 = kotlin.reflect.jvm.internal.impl.load.kotlin.a0.b
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h r13 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r9 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r9
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b r9 = r13.e(r9, r10, r11)
            if (r9 != 0) goto L3c
            return r1
        L3c:
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r9 = r12.b(r9)
            return r9
        L41:
            boolean r0 = r9 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property
            if (r0 == 0) goto La6
            r0 = r9
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage) r0
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature> r2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.d
            java.lang.String r3 = "propertySignature"
            kotlin.jvm.internal.g0.o(r2, r3)
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a(r0, r2)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r0
            if (r0 != 0) goto L58
            return r1
        L58:
            int[] r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.e.d.a
            int r12 = r12.ordinal()
            r12 = r2[r12]
            r2 = 1
            if (r12 == r2) goto L8f
            r2 = 2
            if (r12 == r2) goto L77
            r0 = 3
            if (r12 == r0) goto L6a
            return r1
        L6a:
            r2 = r9
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r2
            r5 = 1
            r6 = 1
            r3 = r10
            r4 = r11
            r7 = r13
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r9 = kotlin.reflect.jvm.internal.impl.load.kotlin.f.a(r2, r3, r4, r5, r6, r7)
            return r9
        L77:
            r3 = r10
            boolean r9 = r0.hasSetter()
            if (r9 == 0) goto L8e
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0$a r9 = kotlin.reflect.jvm.internal.impl.load.kotlin.a0.b
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r10 = r0.getSetter()
            java.lang.String r11 = "getSetter(...)"
            kotlin.jvm.internal.g0.o(r10, r11)
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r9 = r9.c(r3, r10)
            return r9
        L8e:
            return r1
        L8f:
            r3 = r10
            boolean r9 = r0.hasGetter()
            if (r9 == 0) goto La6
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0$a r9 = kotlin.reflect.jvm.internal.impl.load.kotlin.a0.b
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r10 = r0.getGetter()
            java.lang.String r11 = "getGetter(...)"
            kotlin.jvm.internal.g0.o(r10, r11)
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r9 = r9.c(r3, r10)
            return r9
        La6:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    protected final kotlin.reflect.jvm.internal.impl.load.kotlin.v u() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.kotlin.v r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.metadata.deserialization.c v();

    protected final boolean w(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r4) {
            r3 = this;
            java.lang.String r0 = "classId"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.name.b r0 = r4.e()
            r1 = 0
            if (r0 == 0) goto L33
            kotlin.reflect.jvm.internal.impl.name.f r0 = r4.h()
            java.lang.String r0 = r0.b()
            java.lang.String r2 = "Container"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 != 0) goto L1d
            goto L33
        L1d:
            kotlin.reflect.jvm.internal.impl.load.kotlin.v r0 = r3.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r2 = r3.v()
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.w.a(r0, r4, r2)
            if (r4 == 0) goto L33
            kotlin.reflect.jvm.internal.impl.a r0 = kotlin.reflect.jvm.internal.impl.a.a
            boolean r4 = r0.c(r4)
            if (r4 == 0) goto L33
            r4 = 1
            return r4
        L33:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    protected abstract kotlin.reflect.jvm.internal.impl.load.kotlin.x.a x(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r2, @org.jetbrains.annotations.NotNull java.util.List<A> r3);

    @org.jetbrains.annotations.Nullable
    protected final kotlin.reflect.jvm.internal.impl.load.kotlin.x.a y(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r3, @org.jetbrains.annotations.NotNull java.util.List<A> r4) {
            r1 = this;
            java.lang.String r0 = "annotationClassId"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.a r0 = kotlin.reflect.jvm.internal.impl.a.a
            java.util.Set r0 = r0.b()
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L1d
            r2 = 0
            return r2
        L1d:
            kotlin.reflect.jvm.internal.impl.load.kotlin.x$a r2 = r1.x(r2, r3, r4)
            return r2
    }
}
