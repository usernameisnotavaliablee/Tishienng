package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJvmMetadataExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmMetadataExtensions.kt\nkotlin/metadata/jvm/internal/JvmMetadataExtensions\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1634#2,3:302\n1634#2,3:306\n1634#2,3:309\n1634#2,3:312\n1634#2,3:315\n1634#2,3:318\n1634#2,3:321\n1634#2,3:324\n1634#2,3:327\n1634#2,3:330\n1634#2,3:333\n1563#2:336\n1634#2,3:337\n1869#2,2:340\n1869#2,2:342\n1563#2:344\n1634#2,3:345\n1563#2:348\n1634#2,3:349\n1563#2:352\n1634#2,3:353\n1563#2:356\n1634#2,3:357\n1563#2:360\n1634#2,3:361\n1563#2:364\n1634#2,3:365\n1563#2:368\n1634#2,3:369\n1563#2:372\n1634#2,3:373\n1563#2:376\n1634#2,3:377\n1869#2,2:380\n1869#2,2:382\n1869#2,2:384\n1563#2:386\n1634#2,3:387\n1#3:305\n*S KotlinDebug\n*F\n+ 1 JvmMetadataExtensions.kt\nkotlin/metadata/jvm/internal/JvmMetadataExtensions\n*L\n25#1:302,3\n58#1:306,3\n59#1:309,3\n71#1:312,3\n72#1:315,3\n74#1:318,3\n76#1:321,3\n77#1:324,3\n78#1:327,3\n102#1:330,3\n130#1:333,3\n135#1:336\n135#1:337,3\n139#1:340,2\n151#1:342,2\n172#1:344\n172#1:345,3\n174#1:348\n174#1:349,3\n184#1:352\n184#1:353,3\n185#1:356\n185#1:357,3\n187#1:360\n187#1:361,3\n190#1:364\n190#1:365,3\n192#1:368\n192#1:369,3\n193#1:372\n193#1:373,3\n230#1:376\n230#1:377,3\n237#1:380,2\n243#1:382,2\n251#1:384,2\n267#1:386\n267#1:387,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e implements kotlin.reflect.jvm.internal.impl.km.internal.extensions.p {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements kotlin.reflect.jvm.internal.impl.km.internal.extensions.h {
        private final kotlin.reflect.jvm.internal.impl.km.internal.extensions.f a;

        a() {
                r2 = this;
                r2.<init>()
                kotlin.reflect.jvm.internal.impl.km.internal.extensions.f r0 = new kotlin.reflect.jvm.internal.impl.km.internal.extensions.f
                java.lang.Class<kotlin.reflect.jvm.internal.impl.km.internal.extensions.h> r1 = kotlin.reflect.jvm.internal.impl.km.internal.extensions.h.class
                kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
                r0.<init>(r1)
                r2.a = r0
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.e
        public kotlin.reflect.jvm.internal.impl.km.internal.extensions.f getType() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.km.internal.extensions.f r0 = r1.a
                return r0
        }
    }

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    private final kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature A(v3.b r3, kotlin.reflect.jvm.internal.impl.km.internal.h r4) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.newBuilder()
            java.lang.String r1 = r3.b()
            int r1 = r4.a(r1)
            r0.x(r1)
            java.lang.String r3 = r3.a()
            int r3 = r4.a(r3)
            r0.w(r3)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r3 = r0.n()
            java.lang.String r4 = "build(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            return r3
    }

    public void B(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.g r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.b r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.h r7) {
            r4 = this;
            java.lang.String r0 = "kmClass"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r7, r0)
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.a r0 = kotlin.reflect.jvm.internal.impl.km.jvm.internal.c.a(r5)
            java.util.List r5 = r5.d()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r5, r2)
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L28:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r5.next()
            kotlin.reflect.jvm.internal.impl.km.d r2 = (kotlin.reflect.jvm.internal.impl.km.d) r2
            kotlin.reflect.jvm.internal.impl.metadata.serialization.d r3 = r7.d()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$b r2 = kotlin.reflect.jvm.internal.impl.km.internal.i.b(r2, r3)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r2 = r2.o()
            r1.add(r2)
            goto L28
        L44:
            r6.x(r1)
            java.lang.String r5 = r0.b()
            if (r5 == 0) goto L5d
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class, java.lang.Integer> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.k
            int r5 = r7.a(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$c r5 = r6.u(r1, r5)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$b r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.b) r5
        L5d:
            java.util.List r5 = r0.d()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L67:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L81
            java.lang.Object r1 = r5.next()
            kotlin.reflect.jvm.internal.impl.km.s r1 = (kotlin.reflect.jvm.internal.impl.km.s) r1
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property>> r2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.j
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$b r1 = kotlin.reflect.jvm.internal.impl.km.internal.l.c(r7, r1)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r1 = r1.G()
            r6.n(r2, r1)
            goto L67
        L81:
            java.lang.String r5 = r0.e()
            if (r5 == 0) goto L9c
            java.lang.String r1 = "main"
            boolean r1 = kotlin.jvm.internal.g0.g(r5, r1)
            if (r1 != 0) goto L9c
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class, java.lang.Integer> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.i
            int r5 = r7.a(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.u(r1, r5)
        L9c:
            int r5 = r0.c()
            if (r5 == 0) goto Laf
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class, java.lang.Integer> r5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.l
            int r7 = r0.c()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.u(r5, r7)
        Laf:
            return
    }

    public void C(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.j r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.b r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.h r7) {
            r4 = this;
            java.lang.String r0 = "kmConstructor"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r7, r0)
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.b r0 = kotlin.reflect.jvm.internal.impl.km.jvm.internal.c.b(r5)
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r5, r2)
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L28:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r5.next()
            kotlin.reflect.jvm.internal.impl.km.d r2 = (kotlin.reflect.jvm.internal.impl.km.d) r2
            kotlin.reflect.jvm.internal.impl.metadata.serialization.d r3 = r7.d()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$b r2 = kotlin.reflect.jvm.internal.impl.km.internal.i.b(r2, r3)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r2 = r2.o()
            r1.add(r2)
            goto L28
        L44:
            r6.x(r1)
            v3.d r5 = r0.a()
            if (r5 == 0) goto L56
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature> r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.a
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r5 = r4.A(r5, r7)
            r6.u(r0, r5)
        L56:
            return
    }

    public void D(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.o r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.b r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.h r5) {
            r2 = this;
            java.lang.String r0 = "enumEntry"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L19:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r3.next()
            kotlin.reflect.jvm.internal.impl.km.d r0 = (kotlin.reflect.jvm.internal.impl.km.d) r0
            kotlin.reflect.jvm.internal.impl.metadata.serialization.d r1 = r5.d()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$b r0 = kotlin.reflect.jvm.internal.impl.km.internal.i.b(r0, r1)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r0 = r0.o()
            r4.x(r0)
            goto L19
        L35:
            return
    }

    public void E(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.q r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.b r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.h r9) {
            r6 = this;
            java.lang.String r0 = "kmFunction"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r9, r0)
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.d r0 = kotlin.reflect.jvm.internal.impl.km.jvm.internal.c.c(r7)
            java.util.List r1 = r7.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.f0.d0(r1, r3)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.km.d r4 = (kotlin.reflect.jvm.internal.impl.km.d) r4
            kotlin.reflect.jvm.internal.impl.metadata.serialization.d r5 = r9.d()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$b r4 = kotlin.reflect.jvm.internal.impl.km.internal.i.b(r4, r5)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r4 = r4.o()
            r2.add(r4)
            goto L28
        L44:
            r8.x(r2)
            java.util.List r7 = r7.c()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.f0.d0(r7, r3)
            r1.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L5a:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L76
            java.lang.Object r2 = r7.next()
            kotlin.reflect.jvm.internal.impl.km.d r2 = (kotlin.reflect.jvm.internal.impl.km.d) r2
            kotlin.reflect.jvm.internal.impl.metadata.serialization.d r3 = r9.d()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$b r2 = kotlin.reflect.jvm.internal.impl.km.internal.i.b(r2, r3)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r2 = r2.o()
            r1.add(r2)
            goto L5a
        L76:
            r8.y(r1)
            v3.d r7 = r0.b()
            if (r7 == 0) goto L8b
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.b
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r7 = r6.A(r7, r9)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$c r7 = r8.u(r1, r7)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$b r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.b) r7
        L8b:
            java.lang.String r7 = r0.a()
            if (r7 == 0) goto La1
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function, java.lang.Integer> r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.c
            int r7 = r9.a(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$c r7 = r8.u(r0, r7)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$b r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.b) r7
        La1:
            return
    }

    public void F(@org.jetbrains.annotations.NotNull u3.a r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.b r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.h r4) {
            r1 = this;
            java.lang.String r0 = "kmModuleFragment"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "proto"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "c"
            kotlin.jvm.internal.g0.p(r4, r2)
            return
    }

    public void G(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.r r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.b r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.h r6) {
            r3 = this;
            java.lang.String r0 = "kmPackage"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r6, r0)
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.f r4 = kotlin.reflect.jvm.internal.impl.km.jvm.internal.c.d(r4)
            java.util.List r0 = r4.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.km.s r1 = (kotlin.reflect.jvm.internal.impl.km.s) r1
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property>> r2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.n
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$b r1 = kotlin.reflect.jvm.internal.impl.km.internal.l.c(r6, r1)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r1 = r1.G()
            r5.n(r2, r1)
            goto L1d
        L37:
            java.lang.String r4 = r4.b()
            if (r4 == 0) goto L52
            java.lang.String r0 = "main"
            boolean r0 = kotlin.jvm.internal.g0.g(r4, r0)
            if (r0 != 0) goto L52
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, java.lang.Integer> r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.m
            int r4 = r6.a(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.u(r0, r4)
        L52:
            return
    }

    public void H(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.v r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.b r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.h r4) {
            r1 = this;
            java.lang.String r0 = "typeAlias"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "proto"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "c"
            kotlin.jvm.internal.g0.p(r4, r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.km.internal.extensions.k a() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.km.internal.extensions.d b() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    public void c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.y r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.b r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.h r6) {
            r3 = this;
            java.lang.String r0 = "valueParameter"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.List r4 = r4.b()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L24:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r4.next()
            kotlin.reflect.jvm.internal.impl.km.d r1 = (kotlin.reflect.jvm.internal.impl.km.d) r1
            kotlin.reflect.jvm.internal.impl.metadata.serialization.d r2 = r6.d()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$b r1 = kotlin.reflect.jvm.internal.impl.km.internal.i.b(r1, r2)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r1 = r1.o()
            r0.add(r1)
            goto L24
        L40:
            r5.x(r0)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    public void d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.w r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.e r6) {
            r3 = this;
            java.lang.String r0 = "kmTypeParameter"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r6, r0)
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.i r4 = kotlin.reflect.jvm.internal.impl.km.jvm.internal.c.g(r4)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation>> r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.h
            java.lang.Object r5 = r5.getExtension(r0)
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L1f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r5.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r0
            java.util.List r1 = r4.a()
            kotlin.jvm.internal.g0.m(r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2 = r6.e()
            kotlin.reflect.jvm.internal.impl.km.d r0 = kotlin.reflect.jvm.internal.impl.km.internal.f.b(r0, r2)
            r1.add(r0)
            goto L1f
        L3e:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.km.internal.extensions.b e() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.a r0 = new kotlin.reflect.jvm.internal.impl.km.jvm.internal.a
            r0.<init>()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.km.internal.extensions.c f() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.b r0 = new kotlin.reflect.jvm.internal.impl.km.jvm.internal.b
            r0.<init>()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    public void g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.s r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.e r13) {
            r10 = this;
            java.lang.String r0 = "kmProperty"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r13, r0)
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.g r0 = kotlin.reflect.jvm.internal.impl.km.jvm.internal.c.e(r11)
            java.util.List r1 = r12.getAnnotationList()
            java.lang.String r2 = "getAnnotationList(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r2 = r11.a()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L43
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r3
            kotlin.jvm.internal.g0.m(r3)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r4 = r13.e()
            kotlin.reflect.jvm.internal.impl.km.d r3 = kotlin.reflect.jvm.internal.impl.km.internal.f.b(r3, r4)
            r2.add(r3)
            goto L28
        L43:
            java.util.List r1 = r12.getGetterAnnotationList()
            java.lang.String r2 = "getGetterAnnotationList(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.reflect.jvm.internal.impl.km.t r2 = r11.h()
            java.util.List r2 = r2.a()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L5c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L77
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r3
            kotlin.jvm.internal.g0.m(r3)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r4 = r13.e()
            kotlin.reflect.jvm.internal.impl.km.d r3 = kotlin.reflect.jvm.internal.impl.km.internal.f.b(r3, r4)
            r2.add(r3)
            goto L5c
        L77:
            kotlin.reflect.jvm.internal.impl.km.t r1 = r11.l()
            if (r1 == 0) goto Laf
            java.util.List r2 = r12.getSetterAnnotationList()
            java.lang.String r3 = "getSetterAnnotationList(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r1 = r1.a()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r2 = r2.iterator()
        L92:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lad
            java.lang.Object r3 = r2.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r3
            kotlin.jvm.internal.g0.m(r3)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r4 = r13.e()
            kotlin.reflect.jvm.internal.impl.km.d r3 = kotlin.reflect.jvm.internal.impl.km.internal.f.b(r3, r4)
            r1.add(r3)
            goto L92
        Lad:
            java.util.List r1 = (java.util.List) r1
        Laf:
            java.util.List r1 = r12.getExtensionReceiverAnnotationList()
            java.lang.String r2 = "getExtensionReceiverAnnotationList(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r2 = r11.e()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        Lc4:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Ldf
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r3
            kotlin.jvm.internal.g0.m(r3)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r4 = r13.e()
            kotlin.reflect.jvm.internal.impl.km.d r3 = kotlin.reflect.jvm.internal.impl.km.internal.f.b(r3, r4)
            r2.add(r3)
            goto Lc4
        Ldf:
            java.util.List r1 = r12.getBackingFieldAnnotationList()
            java.lang.String r2 = "getBackingFieldAnnotationList(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r2 = r11.b()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        Lf4:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L10f
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r3
            kotlin.jvm.internal.g0.m(r3)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r4 = r13.e()
            kotlin.reflect.jvm.internal.impl.km.d r3 = kotlin.reflect.jvm.internal.impl.km.internal.f.b(r3, r4)
            r2.add(r3)
            goto Lf4
        L10f:
            java.util.List r1 = r12.getDelegateFieldAnnotationList()
            java.lang.String r2 = "getDelegateFieldAnnotationList(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r11 = r11.d()
            java.util.Collection r11 = (java.util.Collection) r11
            java.util.Iterator r1 = r1.iterator()
        L124:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L13f
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r2
            kotlin.jvm.internal.g0.m(r2)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3 = r13.e()
            kotlin.reflect.jvm.internal.impl.km.d r2 = kotlin.reflect.jvm.internal.impl.km.internal.f.b(r2, r3)
            r11.add(r2)
            goto L124
        L13f:
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h r3 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r5 = r13.e()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r6 = r13.g()
            r8 = 8
            r9 = 0
            r7 = 0
            r4 = r12
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$a r11 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.d(r3, r4, r5, r6, r7, r8, r9)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature> r12 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.d
            java.lang.String r1 = "propertySignature"
            kotlin.jvm.internal.g0.o(r12, r1)
            java.lang.Object r12 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a(r4, r12)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r12 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r12
            r1 = 0
            if (r12 == 0) goto L16d
            boolean r2 = r12.hasGetter()
            if (r2 == 0) goto L16d
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r2 = r12.getGetter()
            goto L16e
        L16d:
            r2 = r1
        L16e:
            if (r12 == 0) goto L17b
            boolean r3 = r12.hasSetter()
            if (r3 == 0) goto L17b
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r3 = r12.getSetter()
            goto L17c
        L17b:
            r3 = r1
        L17c:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, java.lang.Integer> r5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.e
            java.lang.Object r4 = r4.getExtension(r5)
            java.lang.String r5 = "getExtension(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r0.i(r4)
            if (r11 == 0) goto L197
            v3.a r11 = v3.c.a(r11)
            goto L198
        L197:
            r11 = r1
        L198:
            r0.g(r11)
            if (r2 == 0) goto L1b3
            v3.d r11 = new v3.d
            int r4 = r2.getName()
            java.lang.String r4 = r13.b(r4)
            int r2 = r2.getDesc()
            java.lang.String r2 = r13.b(r2)
            r11.<init>(r4, r2)
            goto L1b4
        L1b3:
            r11 = r1
        L1b4:
            r0.h(r11)
            if (r3 == 0) goto L1cf
            v3.d r11 = new v3.d
            int r2 = r3.getName()
            java.lang.String r2 = r13.b(r2)
            int r3 = r3.getDesc()
            java.lang.String r3 = r13.b(r3)
            r11.<init>(r2, r3)
            goto L1d0
        L1cf:
            r11 = r1
        L1d0:
            r0.j(r11)
            if (r12 == 0) goto L1e0
            boolean r11 = r12.hasSyntheticMethod()
            if (r11 == 0) goto L1e0
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r11 = r12.getSyntheticMethod()
            goto L1e1
        L1e0:
            r11 = r1
        L1e1:
            if (r11 == 0) goto L1f9
            v3.d r2 = new v3.d
            int r3 = r11.getName()
            java.lang.String r3 = r13.b(r3)
            int r11 = r11.getDesc()
            java.lang.String r11 = r13.b(r11)
            r2.<init>(r3, r11)
            goto L1fa
        L1f9:
            r2 = r1
        L1fa:
            r0.k(r2)
            if (r12 == 0) goto L20a
            boolean r11 = r12.hasDelegateMethod()
            if (r11 == 0) goto L20a
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r11 = r12.getDelegateMethod()
            goto L20b
        L20a:
            r11 = r1
        L20b:
            if (r11 == 0) goto L222
            v3.d r1 = new v3.d
            int r12 = r11.getName()
            java.lang.String r12 = r13.b(r12)
            int r11 = r11.getDesc()
            java.lang.String r11 = r13.b(r11)
            r1.<init>(r12, r11)
        L222:
            r0.l(r1)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.km.internal.extensions.l h() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.h r0 = new kotlin.reflect.jvm.internal.impl.km.jvm.internal.h
            r0.<init>()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    public void i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.w r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.b r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.h r6) {
            r3 = this;
            java.lang.String r0 = "kmTypeParameter"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r6, r0)
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.i r4 = kotlin.reflect.jvm.internal.impl.km.jvm.internal.c.g(r4)
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L1d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r4.next()
            kotlin.reflect.jvm.internal.impl.km.d r0 = (kotlin.reflect.jvm.internal.impl.km.d) r0
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation>> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.h
            kotlin.reflect.jvm.internal.impl.metadata.serialization.d r2 = r6.d()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$b r0 = kotlin.reflect.jvm.internal.impl.km.internal.i.b(r0, r2)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r0 = r0.o()
            r5.n(r1, r0)
            goto L1d
        L3b:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.km.internal.extensions.m j() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.i r0 = new kotlin.reflect.jvm.internal.impl.km.jvm.internal.i
            r0.<init>()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.km.internal.extensions.n k() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    public void l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.v r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.e r4) {
            r1 = this;
            java.lang.String r0 = "kmTypeAlias"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "proto"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "c"
            kotlin.jvm.internal.g0.p(r4, r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    public void m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.o r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.e r6) {
            r3 = this;
            java.lang.String r0 = "kmEnumEntry"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.List r5 = r5.getAnnotationList()
            java.util.Iterator r5 = r5.iterator()
        L17:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r5.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r0
            java.util.List r1 = r4.a()
            kotlin.jvm.internal.g0.m(r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2 = r6.e()
            kotlin.reflect.jvm.internal.impl.km.d r0 = kotlin.reflect.jvm.internal.impl.km.internal.f.b(r0, r2)
            r1.add(r0)
            goto L17
        L36:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    public void n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.j r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.e r7) {
            r4 = this;
            java.lang.String r0 = "kmConstructor"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r7, r0)
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.b r0 = kotlin.reflect.jvm.internal.impl.km.jvm.internal.c.b(r5)
            java.util.List r1 = r6.getAnnotationList()
            java.lang.String r2 = "getAnnotationList(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r5 = r5.a()
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r2
            kotlin.jvm.internal.g0.m(r2)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3 = r7.e()
            kotlin.reflect.jvm.internal.impl.km.d r2 = kotlin.reflect.jvm.internal.impl.km.internal.f.b(r2, r3)
            r5.add(r2)
            goto L28
        L43:
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h r5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r1 = r7.e()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r7 = r7.g()
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b r5 = r5.b(r6, r1, r7)
            if (r5 == 0) goto L58
            v3.d r5 = v3.c.b(r5)
            goto L59
        L58:
            r5 = 0
        L59:
            r0.b(r5)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    public void o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.u r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.b r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.h r6) {
            r3 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r6, r0)
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.h r4 = kotlin.reflect.jvm.internal.impl.km.jvm.internal.c.f(r4)
            boolean r0 = r4.b()
            if (r0 == 0) goto L20
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type, java.lang.Boolean> r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.g
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.u(r0, r1)
        L20:
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L2a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r4.next()
            kotlin.reflect.jvm.internal.impl.km.d r0 = (kotlin.reflect.jvm.internal.impl.km.d) r0
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation>> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.f
            kotlin.reflect.jvm.internal.impl.metadata.serialization.d r2 = r6.d()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$b r0 = kotlin.reflect.jvm.internal.impl.km.internal.i.b(r0, r2)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r0 = r0.o()
            r5.n(r1, r0)
            goto L2a
        L48:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.km.internal.extensions.j p() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.g r0 = new kotlin.reflect.jvm.internal.impl.km.jvm.internal.g
            r0.<init>()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    public void q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.u r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.e r6) {
            r3 = this;
            java.lang.String r0 = "kmType"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r6, r0)
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.h r4 = kotlin.reflect.jvm.internal.impl.km.jvm.internal.c.f(r4)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type, java.lang.Boolean> r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.g
            java.lang.Object r0 = r5.getExtension(r0)
            java.lang.String r1 = "getExtension(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4.c(r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation>> r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.f
            java.lang.Object r5 = r5.getExtension(r0)
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L33:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r0 = r5.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r0
            java.util.List r1 = r4.a()
            kotlin.jvm.internal.g0.m(r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r2 = r6.e()
            kotlin.reflect.jvm.internal.impl.km.d r0 = kotlin.reflect.jvm.internal.impl.km.internal.f.b(r0, r2)
            r1.add(r0)
            goto L33
        L52:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    public void r(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.g r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.e r7) {
            r4 = this;
            java.lang.String r0 = "kmClass"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r7, r0)
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.a r0 = kotlin.reflect.jvm.internal.impl.km.jvm.internal.c.a(r5)
            java.util.List r1 = r6.getAnnotationList()
            java.lang.String r2 = "getAnnotationList(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r5 = r5.d()
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r2
            kotlin.jvm.internal.g0.m(r2)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3 = r7.e()
            kotlin.reflect.jvm.internal.impl.km.d r2 = kotlin.reflect.jvm.internal.impl.km.internal.f.b(r2, r3)
            r5.add(r2)
            goto L28
        L43:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class, java.lang.Integer> r5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.k
            java.lang.String r1 = "anonymousObjectOriginName"
            kotlin.jvm.internal.g0.o(r5, r1)
            java.lang.Object r5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a(r6, r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L5d
            int r5 = r5.intValue()
            java.lang.String r5 = r7.b(r5)
            r0.f(r5)
        L5d:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property>> r5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.j
            java.lang.Object r5 = r6.getExtension(r5)
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L69:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L84
            java.lang.Object r1 = r5.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r1
            java.util.List r2 = r0.d()
            kotlin.jvm.internal.g0.m(r1)
            kotlin.reflect.jvm.internal.impl.km.s r1 = kotlin.reflect.jvm.internal.impl.km.internal.g.p(r1, r7)
            r2.add(r1)
            goto L69
        L84:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class, java.lang.Integer> r5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.i
            java.lang.String r1 = "classModuleName"
            kotlin.jvm.internal.g0.o(r5, r1)
            java.lang.Object r5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a(r6, r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L9d
            int r5 = r5.intValue()
            java.lang.String r5 = r7.b(r5)
            if (r5 != 0) goto L9f
        L9d:
            java.lang.String r5 = "main"
        L9f:
            r0.h(r5)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class, java.lang.Integer> r5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.l
            java.lang.String r7 = "jvmClassFlags"
            kotlin.jvm.internal.g0.o(r5, r7)
            java.lang.Object r5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a(r6, r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto Lb8
            int r5 = r5.intValue()
            r0.g(r5)
        Lb8:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    public void s(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.s r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.b r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.h r9) {
            r6 = this;
            java.lang.String r0 = "kmProperty"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r9, r0)
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.g r0 = kotlin.reflect.jvm.internal.impl.km.jvm.internal.c.e(r7)
            java.util.List r1 = r7.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.f0.d0(r1, r3)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.km.d r4 = (kotlin.reflect.jvm.internal.impl.km.d) r4
            kotlin.reflect.jvm.internal.impl.metadata.serialization.d r5 = r9.d()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$b r4 = kotlin.reflect.jvm.internal.impl.km.internal.i.b(r4, r5)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r4 = r4.o()
            r2.add(r4)
            goto L28
        L44:
            r8.x(r2)
            kotlin.reflect.jvm.internal.impl.km.t r1 = r7.h()
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = kotlin.collections.f0.d0(r1, r3)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L5e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L7a
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.km.d r4 = (kotlin.reflect.jvm.internal.impl.km.d) r4
            kotlin.reflect.jvm.internal.impl.metadata.serialization.d r5 = r9.d()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$b r4 = kotlin.reflect.jvm.internal.impl.km.internal.i.b(r4, r5)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r4 = r4.o()
            r2.add(r4)
            goto L5e
        L7a:
            r8.C(r2)
            kotlin.reflect.jvm.internal.impl.km.t r1 = r7.l()
            if (r1 == 0) goto Lb5
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = kotlin.collections.f0.d0(r1, r3)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L96:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lb2
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.km.d r4 = (kotlin.reflect.jvm.internal.impl.km.d) r4
            kotlin.reflect.jvm.internal.impl.metadata.serialization.d r5 = r9.d()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$b r4 = kotlin.reflect.jvm.internal.impl.km.internal.i.b(r4, r5)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r4 = r4.o()
            r2.add(r4)
            goto L96
        Lb2:
            r8.D(r2)
        Lb5:
            java.util.List r1 = r7.e()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = kotlin.collections.f0.d0(r1, r3)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        Lc8:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Le4
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.km.d r4 = (kotlin.reflect.jvm.internal.impl.km.d) r4
            kotlin.reflect.jvm.internal.impl.metadata.serialization.d r5 = r9.d()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$b r4 = kotlin.reflect.jvm.internal.impl.km.internal.i.b(r4, r5)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r4 = r4.o()
            r2.add(r4)
            goto Lc8
        Le4:
            r8.B(r2)
            java.util.List r1 = r7.b()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = kotlin.collections.f0.d0(r1, r3)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        Lfa:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L116
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.km.d r4 = (kotlin.reflect.jvm.internal.impl.km.d) r4
            kotlin.reflect.jvm.internal.impl.metadata.serialization.d r5 = r9.d()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$b r4 = kotlin.reflect.jvm.internal.impl.km.internal.i.b(r4, r5)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r4 = r4.o()
            r2.add(r4)
            goto Lfa
        L116:
            r8.y(r2)
            java.util.List r7 = r7.d()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.f0.d0(r7, r3)
            r1.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L12c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L148
            java.lang.Object r2 = r7.next()
            kotlin.reflect.jvm.internal.impl.km.d r2 = (kotlin.reflect.jvm.internal.impl.km.d) r2
            kotlin.reflect.jvm.internal.impl.metadata.serialization.d r3 = r9.d()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$b r2 = kotlin.reflect.jvm.internal.impl.km.internal.i.b(r2, r3)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r2 = r2.o()
            r1.add(r2)
            goto L12c
        L148:
            r8.A(r1)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$b r7 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.newBuilder()
            java.lang.String r1 = "newBuilder(...)"
            kotlin.jvm.internal.g0.o(r7, r1)
            v3.a r1 = r0.a()
            r2 = 1
            if (r1 == 0) goto L18c
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$b r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.newBuilder()
            v3.a r3 = r0.a()
            kotlin.jvm.internal.g0.m(r3)
            java.lang.String r3 = r3.b()
            int r3 = r9.a(r3)
            r1.x(r3)
            v3.a r3 = r0.a()
            kotlin.jvm.internal.g0.m(r3)
            java.lang.String r3 = r3.a()
            int r3 = r9.a(r3)
            r1.w(r3)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r1 = r1.n()
            r7.C(r1)
            r1 = 1
            goto L18d
        L18c:
            r1 = 0
        L18d:
            v3.d r3 = r0.b()
            if (r3 == 0) goto L1a2
            v3.d r1 = r0.b()
            kotlin.jvm.internal.g0.m(r1)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r1 = r6.A(r1, r9)
            r7.D(r1)
            r1 = 1
        L1a2:
            v3.d r3 = r0.d()
            if (r3 == 0) goto L1b7
            v3.d r1 = r0.d()
            kotlin.jvm.internal.g0.m(r1)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r1 = r6.A(r1, r9)
            r7.E(r1)
            goto L1b8
        L1b7:
            r2 = r1
        L1b8:
            if (r2 == 0) goto L1ce
            v3.d r1 = r0.e()
            if (r1 == 0) goto L1ce
            v3.d r1 = r0.e()
            kotlin.jvm.internal.g0.m(r1)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r1 = r6.A(r1, r9)
            r7.F(r1)
        L1ce:
            if (r2 == 0) goto L1e4
            v3.d r1 = r0.f()
            if (r1 == 0) goto L1e4
            v3.d r1 = r0.f()
            kotlin.jvm.internal.g0.m(r1)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r9 = r6.A(r1, r9)
            r7.B(r9)
        L1e4:
            int r9 = r0.c()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.getDefaultInstance()
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, java.lang.Integer> r3 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.e
            java.lang.Object r1 = r1.getExtension(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L1f7
            goto L1fd
        L1f7:
            int r1 = r1.intValue()
            if (r9 == r1) goto L208
        L1fd:
            int r9 = r0.c()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.u(r3, r9)
        L208:
            if (r2 == 0) goto L213
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature> r9 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.d
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r7 = r7.n()
            r8.u(r9, r7)
        L213:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    public void t(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.y r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.e r5) {
            r2 = this;
            java.lang.String r0 = "kmValueParameter"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.List r4 = r4.getAnnotationList()
            java.lang.String r0 = "getAnnotationList(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r3 = r3.b()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r4 = r4.iterator()
        L24:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r4.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r0
            kotlin.jvm.internal.g0.m(r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r1 = r5.e()
            kotlin.reflect.jvm.internal.impl.km.d r0 = kotlin.reflect.jvm.internal.impl.km.internal.f.b(r0, r1)
            r3.add(r0)
            goto L24
        L3f:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.km.internal.extensions.g u() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.d r0 = new kotlin.reflect.jvm.internal.impl.km.jvm.internal.d
            r0.<init>()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.p
    public void v(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.q r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.e r8) {
            r5 = this;
            java.lang.String r0 = "kmFunction"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r8, r0)
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.d r0 = kotlin.reflect.jvm.internal.impl.km.jvm.internal.c.c(r6)
            java.util.List r1 = r7.getAnnotationList()
            java.lang.String r2 = "getAnnotationList(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r2 = r6.a()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L43
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r3
            kotlin.jvm.internal.g0.m(r3)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r4 = r8.e()
            kotlin.reflect.jvm.internal.impl.km.d r3 = kotlin.reflect.jvm.internal.impl.km.internal.f.b(r3, r4)
            r2.add(r3)
            goto L28
        L43:
            java.util.List r1 = r7.getExtensionReceiverAnnotationList()
            java.lang.String r2 = "getExtensionReceiverAnnotationList(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r6 = r6.c()
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r1 = r1.iterator()
        L58:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L73
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r2
            kotlin.jvm.internal.g0.m(r2)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r3 = r8.e()
            kotlin.reflect.jvm.internal.impl.km.d r2 = kotlin.reflect.jvm.internal.impl.km.internal.f.b(r2, r3)
            r6.add(r2)
            goto L58
        L73:
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h r6 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r1 = r8.e()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r2 = r8.g()
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d$b r6 = r6.e(r7, r1, r2)
            if (r6 == 0) goto L88
            v3.d r6 = v3.c.b(r6)
            goto L89
        L88:
            r6 = 0
        L89:
            r0.d(r6)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function, java.lang.Integer> r6 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.c
            java.lang.String r1 = "lambdaClassOriginName"
            kotlin.jvm.internal.g0.o(r6, r1)
            java.lang.Object r6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a(r7, r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto La6
            int r6 = r6.intValue()
            java.lang.String r6 = r8.b(r6)
            r0.c(r6)
        La6:
            return
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.km.internal.extensions.h w() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.e$a r0 = new kotlin.reflect.jvm.internal.impl.km.jvm.internal.e$a
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.km.internal.extensions.i x() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.f r0 = new kotlin.reflect.jvm.internal.impl.km.jvm.internal.f
            r0.<init>()
            return r0
    }

    public void y(@org.jetbrains.annotations.NotNull u3.a r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.e r4) {
            r1 = this;
            java.lang.String r0 = "kmModuleFragment"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "proto"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "c"
            kotlin.jvm.internal.g0.p(r4, r2)
            return
    }

    public void z(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.r r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.e r6) {
            r3 = this;
            java.lang.String r0 = "kmPackage"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r6, r0)
            kotlin.reflect.jvm.internal.impl.km.jvm.internal.f r4 = kotlin.reflect.jvm.internal.impl.km.jvm.internal.c.d(r4)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property>> r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.n
            java.lang.Object r0 = r5.getExtension(r0)
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r1
            java.util.List r2 = r4.a()
            kotlin.jvm.internal.g0.m(r1)
            kotlin.reflect.jvm.internal.impl.km.s r1 = kotlin.reflect.jvm.internal.impl.km.internal.g.p(r1, r6)
            r2.add(r1)
            goto L1f
        L3a:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, java.lang.Integer> r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.m
            java.lang.String r1 = "packageModuleName"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Object r5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.a(r5, r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L53
            int r5 = r5.intValue()
            java.lang.String r5 = r6.b(r5)
            if (r5 != 0) goto L55
        L53:
            java.lang.String r5 = "main"
        L55:
            r4.c(r5)
            return
    }
}
