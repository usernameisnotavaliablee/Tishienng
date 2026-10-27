package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAbstractAnnotationLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractAnnotationLoader.kt\norg/jetbrains/kotlin/serialization/deserialization/AbstractAnnotationLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1563#2:105\n1634#2,3:106\n1563#2:109\n1634#2,3:110\n1563#2:114\n1634#2,3:115\n1563#2:118\n1634#2,3:119\n1563#2:122\n1634#2,3:123\n1563#2:126\n1634#2,3:127\n1563#2:130\n1634#2,3:131\n1563#2:134\n1634#2,3:135\n1563#2:138\n1634#2,3:139\n1#3:113\n*S KotlinDebug\n*F\n+ 1 AbstractAnnotationLoader.kt\norg/jetbrains/kotlin/serialization/deserialization/AbstractAnnotationLoader\n*L\n18#1:105\n18#1:106,3\n37#1:109\n37#1:110,3\n44#1:114\n44#1:115,3\n51#1:118\n51#1:119,3\n58#1:122\n58#1:123,3\n71#1:126\n71#1:127,3\n91#1:130\n91#1:131,3\n97#1:134\n97#1:135,3\n101#1:138\n101#1:139,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class a<A> implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.g<A> {

    @org.jetbrains.annotations.NotNull
    private final b4.a a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0068a {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind[] r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_SETTER     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.C0068a.a = r0
                return
        }
    }

    public a(@org.jetbrains.annotations.NotNull b4.a r2) {
            r1 = this;
            java.lang.String r0 = "protocol"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<A> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.protobuf.n r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r3, int r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter r5) {
            r0 = this;
            java.lang.String r4 = "container"
            kotlin.jvm.internal.g0.p(r1, r4)
            java.lang.String r4 = "callableProto"
            kotlin.jvm.internal.g0.p(r2, r4)
            java.lang.String r2 = "kind"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "proto"
            kotlin.jvm.internal.g0.p(r5, r2)
            b4.a r2 = r0.a
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r2 = r2.h()
            java.lang.Object r2 = r5.getExtension(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L26
            java.util.List r2 = kotlin.collections.f0.J()
        L26:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.f0.d0(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L37:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L4f
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r4
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r5 = r1.b()
            java.lang.Object r4 = r0.k(r4, r5)
            r3.add(r4)
            goto L37
        L4f:
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<A> b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0.a r5) {
            r4 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r5.f()
            b4.a r1 = r4.a
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r1 = r1.a()
            java.lang.Object r0 = r0.getExtension(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L1b
            java.util.List r0 = kotlin.collections.f0.J()
        L1b:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r2
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3 = r5.b()
            java.lang.Object r2 = r4.k(r2, r3)
            r1.add(r2)
            goto L2c
        L44:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<A> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry r5) {
            r3 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r5, r0)
            b4.a r0 = r3.a
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r0 = r0.d()
            java.lang.Object r5 = r5.getExtension(r0)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L1c
            java.util.List r5 = kotlin.collections.f0.J()
        L1c:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L2d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r5.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r1
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2 = r4.b()
            java.lang.Object r1 = r3.k(r1, r2)
            r0.add(r1)
            goto L2d
        L45:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<A> d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r4) {
            r2 = this;
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r4, r0)
            b4.a r0 = r2.a
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r0 = r0.p()
            java.lang.Object r3 = r3.getExtension(r0)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L1c
            java.util.List r3 = kotlin.collections.f0.J()
        L1c:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L2d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r3.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r1
            java.lang.Object r1 = r2.k(r1, r4)
            r0.add(r1)
            goto L2d
        L41:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<A> f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r5) {
            r3 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r5, r0)
            b4.a r0 = r3.a
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r0 = r0.j()
            if (r0 == 0) goto L19
            java.lang.Object r5 = r5.getExtension(r0)
            java.util.List r5 = (java.util.List) r5
            goto L1a
        L19:
            r5 = 0
        L1a:
            if (r5 != 0) goto L20
            java.util.List r5 = kotlin.collections.f0.J()
        L20:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L31:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r5.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r1
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2 = r4.b()
            java.lang.Object r1 = r3.k(r1, r2)
            r0.add(r1)
            goto L31
        L49:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<A> g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.protobuf.n r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r6) {
            r3 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r6, r0)
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function
            r1 = 0
            if (r0 == 0) goto L26
            b4.a r6 = r3.a
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r6 = r6.g()
            if (r6 == 0) goto L68
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r5
            java.lang.Object r5 = r5.getExtension(r6)
            r1 = r5
            java.util.List r1 = (java.util.List) r1
            goto L68
        L26:
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property
            if (r0 == 0) goto L98
            int[] r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.C0068a.a
            int r2 = r6.ordinal()
            r0 = r0[r2]
            r2 = 1
            if (r0 == r2) goto L57
            r2 = 2
            if (r0 == r2) goto L57
            r2 = 3
            if (r0 != r2) goto L3c
            goto L57
        L3c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Unsupported callable kind with property proto for receiver annotations: "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L57:
            b4.a r6 = r3.a
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r6 = r6.l()
            if (r6 == 0) goto L68
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r5
            java.lang.Object r5 = r5.getExtension(r6)
            r1 = r5
            java.util.List r1 = (java.util.List) r1
        L68:
            if (r1 != 0) goto L6e
            java.util.List r1 = kotlin.collections.f0.J()
        L6e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.f0.d0(r1, r6)
            r5.<init>(r6)
            java.util.Iterator r6 = r1.iterator()
        L7f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r0 = r6.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r0
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r1 = r4.b()
            java.lang.Object r0 = r3.k(r0, r1)
            r5.add(r0)
            goto L7f
        L97:
            return r5
        L98:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Unknown message: "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<A> h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r4) {
            r2 = this;
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r4, r0)
            b4.a r0 = r2.a
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r0 = r0.o()
            java.lang.Object r3 = r3.getExtension(r0)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L1c
            java.util.List r3 = kotlin.collections.f0.J()
        L1c:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L2d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r3.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r1
            java.lang.Object r1 = r2.k(r1, r4)
            r0.add(r1)
            goto L2d
        L41:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<A> i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.protobuf.n r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r5) {
            r2 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor
            if (r0 == 0) goto L22
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) r4
            b4.a r5 = r2.a
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r5 = r5.c()
            java.lang.Object r4 = r4.getExtension(r5)
            java.util.List r4 = (java.util.List) r4
            goto L7e
        L22:
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function
            if (r0 == 0) goto L35
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r4
            b4.a r5 = r2.a
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r5 = r5.f()
            java.lang.Object r4 = r4.getExtension(r5)
            java.util.List r4 = (java.util.List) r4
            goto L7e
        L35:
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property
            if (r0 == 0) goto Lae
            int[] r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.C0068a.a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            r0 = 1
            if (r5 == r0) goto L70
            r0 = 2
            if (r5 == r0) goto L61
            r0 = 3
            if (r5 != r0) goto L59
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r4
            b4.a r5 = r2.a
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r5 = r5.n()
            java.lang.Object r4 = r4.getExtension(r5)
            java.util.List r4 = (java.util.List) r4
            goto L7e
        L59:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Unsupported callable kind with property proto"
            r3.<init>(r4)
            throw r3
        L61:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r4
            b4.a r5 = r2.a
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r5 = r5.m()
            java.lang.Object r4 = r4.getExtension(r5)
            java.util.List r4 = (java.util.List) r4
            goto L7e
        L70:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r4
            b4.a r5 = r2.a
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r5 = r5.i()
            java.lang.Object r4 = r4.getExtension(r5)
            java.util.List r4 = (java.util.List) r4
        L7e:
            if (r4 != 0) goto L84
            java.util.List r4 = kotlin.collections.f0.J()
        L84:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.f0.d0(r4, r0)
            r5.<init>(r0)
            java.util.Iterator r4 = r4.iterator()
        L95:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lad
            java.lang.Object r0 = r4.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r0
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r1 = r3.b()
            java.lang.Object r0 = r2.k(r0, r1)
            r5.add(r0)
            goto L95
        Lad:
            return r5
        Lae:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Unknown message: "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<A> l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m0 r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r5) {
            r3 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r5, r0)
            b4.a r0 = r3.a
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r0 = r0.k()
            if (r0 == 0) goto L19
            java.lang.Object r5 = r5.getExtension(r0)
            java.util.List r5 = (java.util.List) r5
            goto L1a
        L19:
            r5 = 0
        L1a:
            if (r5 != 0) goto L20
            java.util.List r5 = kotlin.collections.f0.J()
        L20:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L31:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r5.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r1
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2 = r4.b()
            java.lang.Object r1 = r3.k(r1, r2)
            r0.add(r1)
            goto L31
        L49:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected final b4.a m() {
            r1 = this;
            b4.a r0 = r1.a
            return r0
    }
}
