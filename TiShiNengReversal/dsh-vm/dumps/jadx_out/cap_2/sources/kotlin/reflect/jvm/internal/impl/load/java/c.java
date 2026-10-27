package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAnnotationTypeQualifierResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AnnotationTypeQualifierResolver\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n77#2:58\n97#2,5:59\n1374#3:64\n1460#3,5:65\n*S KotlinDebug\n*F\n+ 1 AnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AnnotationTypeQualifierResolver\n*L\n43#1:58\n43#1:59,5\n52#1:64\n52#1:65,5\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c extends kotlin.reflect.jvm.internal.impl.load.java.b<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> {
    public c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.d0 r2) {
            r1 = this;
            java.lang.String r0 = "javaTypeEnhancementState"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>(r2)
            return
    }

    private final java.util.List<java.lang.String> B(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b
            if (r0 == 0) goto L2c
            kotlin.reflect.jvm.internal.impl.resolve.constants.b r3 = (kotlin.reflect.jvm.internal.impl.resolve.constants.b) r3
            java.lang.Object r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L15:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r1 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r1
            java.util.List r1 = r2.B(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.collections.f0.s0(r0, r1)
            goto L15
        L2b:
            return r0
        L2c:
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.k
            if (r0 == 0) goto L3f
            kotlin.reflect.jvm.internal.impl.resolve.constants.k r3 = (kotlin.reflect.jvm.internal.impl.resolve.constants.k) r3
            kotlin.reflect.jvm.internal.impl.name.f r3 = r3.b()
            java.lang.String r3 = r3.getIdentifier()
            java.util.List r3 = kotlin.collections.f0.l(r3)
            return r3
        L3f:
            java.util.List r3 = kotlin.collections.f0.J()
            return r3
    }

    @org.jetbrains.annotations.NotNull
    protected java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> A(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.l(r2)
            if (r2 == 0) goto L12
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r2.getAnnotations()
            if (r2 == 0) goto L12
            return r2
        L12:
            java.util.List r2 = kotlin.collections.f0.J()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.b
    public /* bridge */ /* synthetic */ java.lang.Iterable c(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1, boolean r2) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r1
            java.lang.Iterable r1 = r0.x(r1, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.b
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.name.c k(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r1
            kotlin.reflect.jvm.internal.impl.name.c r1 = r0.y(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.b
    public /* bridge */ /* synthetic */ java.lang.Object l(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r1
            java.lang.Object r1 = r0.z(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.b
    public /* bridge */ /* synthetic */ java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> m(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r1
            java.lang.Iterable r1 = r0.A(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.b
    public boolean o() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected java.lang.Iterable<java.lang.String> x(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r5, boolean r6) {
            r4 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Map r5 = r5.a()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            kotlin.reflect.jvm.internal.impl.name.f r2 = (kotlin.reflect.jvm.internal.impl.name.f) r2
            java.lang.Object r1 = r1.getValue()
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r1 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r1
            if (r6 == 0) goto L3e
            kotlin.reflect.jvm.internal.impl.name.f r3 = kotlin.reflect.jvm.internal.impl.load.java.i0.c
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 == 0) goto L39
            goto L3e
        L39:
            java.util.List r1 = kotlin.collections.f0.J()
            goto L42
        L3e:
            java.util.List r1 = r4.B(r1)
        L42:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.collections.f0.s0(r0, r1)
            goto L16
        L48:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    protected kotlin.reflect.jvm.internal.impl.name.c y(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.name.c r2 = r2.d()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    protected java.lang.Object z(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.l(r2)
            kotlin.jvm.internal.g0.m(r2)
            return r2
    }
}
