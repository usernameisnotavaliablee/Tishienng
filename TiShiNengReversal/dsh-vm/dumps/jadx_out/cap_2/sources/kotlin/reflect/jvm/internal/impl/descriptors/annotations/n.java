package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/CompositeAnnotations\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,123:1\n1740#2,3:124\n1374#2:129\n1460#2,5:130\n1255#3,2:127\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/CompositeAnnotations\n*L\n105#1:124,3\n112#1:129\n112#1:130,5\n107#1:127,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.g> a;

    public n(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.g> r2) {
            r1 = this;
            java.lang.String r0 = "delegates"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    public n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g... r2) {
            r1 = this;
            java.lang.String r0 = "delegates"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.List r2 = kotlin.collections.n.dz(r2)
            r1.<init>(r2)
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(kotlin.reflect.jvm.internal.impl.name.c r0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r0 = e(r0, r1)
            return r0
    }

    static /* synthetic */ kotlin.sequences.m d(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0) {
            kotlin.sequences.m r0 = f(r0)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c e(kotlin.reflect.jvm.internal.impl.name.c r1, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1 = r2.b(r1)
            return r1
    }

    private static final kotlin.sequences.m f(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.m r1 = kotlin.collections.f0.E1(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r3) {
            r2 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.g> r0 = r2.a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.sequences.m r0 = kotlin.collections.f0.E1(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.l r1 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.l
            r1.<init>(r3)
            kotlin.sequences.m r3 = kotlin.sequences.p.S1(r0, r1)
            java.lang.Object r3 = kotlin.sequences.p.i1(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r3 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r3
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
            r3 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.g> r0 = r3.a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            if (r1 == 0) goto L13
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L13
            return r2
        L13:
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.g) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L17
            r0 = 0
            return r0
        L2b:
            return r2
    }

    @Override // java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
            r2 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.g> r0 = r2.a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.sequences.m r0 = kotlin.collections.f0.E1(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.m r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.m.a
            kotlin.sequences.m r0 = kotlin.sequences.p.k1(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r3) {
            r2 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.g> r0 = r2.a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.sequences.m r0 = kotlin.collections.f0.E1(r0)
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.g) r1
            boolean r1 = r1.l(r3)
            if (r1 == 0) goto L11
            r3 = 1
            return r3
        L25:
            r3 = 0
            return r3
    }
}
