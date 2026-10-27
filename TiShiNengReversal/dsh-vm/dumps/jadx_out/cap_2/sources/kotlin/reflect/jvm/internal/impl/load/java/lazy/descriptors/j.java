package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLazyJavaAnnotationDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaAnnotationDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaAnnotationDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1563#2:125\n1634#2,3:126\n1617#2,9:130\n1869#2:139\n1870#2:141\n1626#2:142\n1#3:129\n1#3:140\n*S KotlinDebug\n*F\n+ 1 LazyJavaAnnotationDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaAnnotationDescriptor\n*L\n94#1:125\n94#1:126,3\n62#1:130,9\n62#1:139\n62#1:141\n62#1:142\n62#1:140\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.g {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] i = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.k a;

    @org.jetbrains.annotations.NotNull
    private final x3.a b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.j c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i d;

    @org.jetbrains.annotations.NotNull
    private final w3.a e;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i f;
    private final boolean g;
    private final boolean h;

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j> r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j.class
            java.lang.String r2 = "fqName"
            java.lang.String r3 = "getFqName()Lorg/jetbrains/kotlin/name/FqName;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            kotlin.jvm.internal.PropertyReference1Impl r2 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.String r3 = "type"
            java.lang.String r5 = "getType()Lorg/jetbrains/kotlin/types/SimpleType;"
            r2.<init>(r1, r3, r5, r4)
            kotlin.reflect.p r2 = kotlin.jvm.internal.o0.u(r2)
            kotlin.jvm.internal.PropertyReference1Impl r3 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.String r5 = "allValueArguments"
            java.lang.String r6 = "getAllValueArguments()Ljava/util/Map;"
            r3.<init>(r1, r5, r6, r4)
            kotlin.reflect.p r1 = kotlin.jvm.internal.o0.u(r3)
            r3 = 3
            kotlin.reflect.n[] r3 = new kotlin.reflect.n[r3]
            r3[r4] = r0
            r0 = 1
            r3[r0] = r2
            r0 = 2
            r3[r0] = r1
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j.i = r3
            return
    }

    public j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r3, @org.jetbrains.annotations.NotNull x3.a r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "javaAnnotation"
            kotlin.jvm.internal.g0.p(r4, r0)
            r2.<init>()
            r2.a = r3
            r2.b = r4
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r3.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g
            r1.<init>(r2)
            kotlin.reflect.jvm.internal.impl.storage.j r0 = r0.g(r1)
            r2.c = r0
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r3.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h
            r1.<init>(r2)
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r0.e(r1)
            r2.d = r0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r3.a()
            w3.b r0 = r0.t()
            w3.a r0 = r0.a(r4)
            r2.e = r0
            kotlin.reflect.jvm.internal.impl.storage.n r3 = r3.e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.i r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.i
            r0.<init>(r2)
            kotlin.reflect.jvm.internal.impl.storage.i r3 = r3.e(r0)
            r2.f = r3
            boolean r3 = r4.e()
            r2.g = r3
            boolean r3 = r4.u()
            if (r3 != 0) goto L5d
            if (r5 == 0) goto L5b
            goto L5d
        L5b:
            r3 = 0
            goto L5e
        L5d:
            r3 = 1
        L5e:
            r2.h = r3
            return
    }

    public /* synthetic */ j(kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1, x3.a r2, boolean r3, int r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.<init>(r1, r2, r3)
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.name.c b(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j r0) {
            kotlin.reflect.jvm.internal.impl.name.c r0 = i(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 c(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j r0) {
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = q(r0)
            return r0
    }

    static /* synthetic */ java.util.Map f(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j r0) {
            java.util.Map r0 = g(r0)
            return r0
    }

    private static final java.util.Map g(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j r4) {
            x3.a r0 = r4.b
            java.util.Collection r0 = r0.getArguments()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r0.next()
            x3.b r2 = (x3.b) r2
            kotlin.reflect.jvm.internal.impl.name.f r3 = r2.getName()
            if (r3 != 0) goto L25
            kotlin.reflect.jvm.internal.impl.name.f r3 = kotlin.reflect.jvm.internal.impl.load.java.i0.c
        L25:
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r2 = r4.l(r2)
            if (r2 == 0) goto L30
            kotlin.Pair r2 = kotlin.o0.a(r3, r2)
            goto L31
        L30:
            r2 = 0
        L31:
            if (r2 == 0) goto L11
            r1.add(r2)
            goto L11
        L37:
            java.util.Map r4 = kotlin.collections.i1.B0(r1)
            return r4
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d h(kotlin.reflect.jvm.internal.impl.name.c r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r2.a
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = r0.d()
            kotlin.reflect.jvm.internal.impl.name.b$a r1 = kotlin.reflect.jvm.internal.impl.name.b.d
            kotlin.reflect.jvm.internal.impl.name.b r3 = r1.c(r3)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = r2.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r1 = r1.a()
            kotlin.reflect.jvm.internal.impl.load.kotlin.n r1 = r1.b()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r1 = r1.f()
            kotlin.reflect.jvm.internal.impl.descriptors.k0 r1 = r1.r()
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = kotlin.reflect.jvm.internal.impl.descriptors.x.d(r0, r3, r1)
            return r3
    }

    private static final kotlin.reflect.jvm.internal.impl.name.c i(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j r0) {
            x3.a r0 = r0.b
            kotlin.reflect.jvm.internal.impl.name.b r0 = r0.c()
            if (r0 == 0) goto Ld
            kotlin.reflect.jvm.internal.impl.name.c r0 = r0.a()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> l(x3.b r4) {
            r3 = this;
            boolean r0 = r4 instanceof x3.o
            r1 = 0
            if (r0 == 0) goto L13
            kotlin.reflect.jvm.internal.impl.resolve.constants.i r0 = kotlin.reflect.jvm.internal.impl.resolve.constants.i.a
            x3.o r4 = (x3.o) r4
            java.lang.Object r4 = r4.getValue()
            r2 = 2
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r4 = kotlin.reflect.jvm.internal.impl.resolve.constants.i.f(r0, r4, r1, r2, r1)
            return r4
        L13:
            boolean r0 = r4 instanceof x3.m
            if (r0 == 0) goto L26
            x3.m r4 = (x3.m) r4
            kotlin.reflect.jvm.internal.impl.name.b r0 = r4.c()
            kotlin.reflect.jvm.internal.impl.name.f r4 = r4.d()
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r4 = r3.o(r0, r4)
            return r4
        L26:
            boolean r0 = r4 instanceof x3.e
            if (r0 == 0) goto L40
            x3.e r4 = (x3.e) r4
            kotlin.reflect.jvm.internal.impl.name.f r0 = r4.getName()
            if (r0 != 0) goto L34
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.load.java.i0.c
        L34:
            kotlin.jvm.internal.g0.m(r0)
            java.util.List r4 = r4.getElements()
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r4 = r3.n(r0, r4)
            return r4
        L40:
            boolean r0 = r4 instanceof x3.c
            if (r0 == 0) goto L4f
            x3.c r4 = (x3.c) r4
            x3.a r4 = r4.a()
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r4 = r3.m(r4)
            return r4
        L4f:
            boolean r0 = r4 instanceof x3.h
            if (r0 == 0) goto L5e
            x3.h r4 = (x3.h) r4
            x3.x r4 = r4.b()
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r4 = r3.p(r4)
            return r4
        L5e:
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> m(x3.a r8) {
            r7 = this;
            kotlin.reflect.jvm.internal.impl.resolve.constants.a r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2 = r7.a
            r5 = 4
            r6 = 0
            r4 = 0
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r0.<init>(r1)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> n(kotlin.reflect.jvm.internal.impl.name.f r4, java.util.List<? extends x3.b> r5) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r3.getType()
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.x0.a(r0)
            if (r0 == 0) goto Lc
            r4 = 0
            return r4
        Lc:
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.l(r3)
            kotlin.jvm.internal.g0.m(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r4 = kotlin.reflect.jvm.internal.impl.load.java.components.a.b(r4, r0)
            if (r4 == 0) goto L1f
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.getType()
            if (r4 != 0) goto L41
        L1f:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r4 = r3.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r4 = r4.a()
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r4 = r4.m()
            kotlin.reflect.jvm.internal.impl.builtins.j r4 = r4.p()
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            kotlin.reflect.jvm.internal.impl.types.error.g r1 = kotlin.reflect.jvm.internal.impl.types.error.i.d(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r4.m(r0, r1)
            java.lang.String r0 = "getArrayType(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
        L41:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L52:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r5.next()
            x3.b r1 = (x3.b) r1
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r1 = r3.l(r1)
            if (r1 != 0) goto L69
            kotlin.reflect.jvm.internal.impl.resolve.constants.v r1 = new kotlin.reflect.jvm.internal.impl.resolve.constants.v
            r1.<init>()
        L69:
            r0.add(r1)
            goto L52
        L6d:
            kotlin.reflect.jvm.internal.impl.resolve.constants.i r5 = kotlin.reflect.jvm.internal.impl.resolve.constants.i.a
            kotlin.reflect.jvm.internal.impl.resolve.constants.b r4 = r5.c(r0, r4)
            return r4
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> o(kotlin.reflect.jvm.internal.impl.name.b r2, kotlin.reflect.jvm.internal.impl.name.f r3) {
            r1 = this;
            if (r2 == 0) goto Lb
            if (r3 != 0) goto L5
            goto Lb
        L5:
            kotlin.reflect.jvm.internal.impl.resolve.constants.k r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.k
            r0.<init>(r2, r3)
            return r0
        Lb:
            r2 = 0
            return r2
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> p(x3.x r9) {
            r8 = this;
            kotlin.reflect.jvm.internal.impl.resolve.constants.t$a r0 = kotlin.reflect.jvm.internal.impl.resolve.constants.t.b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = r8.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d r1 = r1.g()
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r2 = kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON
            r6 = 7
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(r2, r3, r4, r5, r6, r7)
            kotlin.reflect.jvm.internal.impl.types.t0 r9 = r1.p(r9, r2)
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r9 = r0.a(r9)
            return r9
    }

    private static final kotlin.reflect.jvm.internal.impl.types.e1 q(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j r6) {
            kotlin.reflect.jvm.internal.impl.name.c r1 = r6.d()
            if (r1 != 0) goto L17
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r0 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION
            x3.a r6 = r6.b
            java.lang.String r6 = r6.toString()
            java.lang.String[] r6 = new java.lang.String[]{r6}
            kotlin.reflect.jvm.internal.impl.types.error.g r6 = kotlin.reflect.jvm.internal.impl.types.error.i.d(r0, r6)
            return r6
        L17:
            kotlin.reflect.jvm.internal.impl.builtins.jvm.d r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2 = r6.a
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r2 = r2.d()
            kotlin.reflect.jvm.internal.impl.builtins.j r2 = r2.p()
            r4 = 4
            r5 = 0
            r3 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L4a
            x3.a r0 = r6.b
            x3.g r0 = r0.D()
            if (r0 == 0) goto L43
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2 = r6.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r2 = r2.a()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.n r2 = r2.n()
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.a(r0)
            goto L44
        L43:
            r0 = 0
        L44:
            if (r0 != 0) goto L4a
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r6.h(r1)
        L4a:
            kotlin.reflect.jvm.internal.impl.types.e1 r6 = r0.s()
            return r6
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.NotNull
    public java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.f
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j.i
            r2 = 2
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
            java.util.Map r0 = (java.util.Map) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.name.c d() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.j r0 = r3.c
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j.i
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.b(r0, r3, r1)
            kotlin.reflect.jvm.internal.impl.name.c r0 = (kotlin.reflect.jvm.internal.impl.name.c) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.g
    public boolean e() {
            r1 = this;
            boolean r0 = r1.g
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e1 getSource() {
            r1 = this;
            w3.a r0 = r1.j()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 getType() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.d
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j.i
            r2 = 1
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = (kotlin.reflect.jvm.internal.impl.types.e1) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 getType() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.getType()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public w3.a j() {
            r1 = this;
            w3.a r0 = r1.e
            return r0
    }

    public final boolean k() {
            r1 = this;
            boolean r0 = r1.h
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.renderer.m r0 = kotlin.reflect.jvm.internal.impl.renderer.m.h
            r1 = 0
            r2 = 2
            java.lang.String r0 = kotlin.reflect.jvm.internal.impl.renderer.m.P(r0, r3, r1, r2, r1)
            return r0
    }
}
