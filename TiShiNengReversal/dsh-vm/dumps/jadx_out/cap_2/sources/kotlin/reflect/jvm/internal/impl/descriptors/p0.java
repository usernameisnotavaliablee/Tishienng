package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPackageFragmentProviderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PackageFragmentProviderImpl.kt\norg/jetbrains/kotlin/descriptors/PackageFragmentProviderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n865#2,2:43\n2746#2,3:45\n774#2:48\n865#2,2:49\n*S KotlinDebug\n*F\n+ 1 PackageFragmentProviderImpl.kt\norg/jetbrains/kotlin/descriptors/PackageFragmentProviderImpl\n*L\n26#1:43,2\n30#1:45,3\n34#1:48\n34#1:49,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p0 implements kotlin.reflect.jvm.internal.impl.descriptors.r0 {

    @org.jetbrains.annotations.NotNull
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.l0> a;

    public p0(@org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.l0> r2) {
            r1 = this;
            java.lang.String r0 = "packageFragments"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.name.c d(kotlin.reflect.jvm.internal.impl.descriptors.l0 r0) {
            kotlin.reflect.jvm.internal.impl.name.c r0 = f(r0)
            return r0
    }

    static /* synthetic */ boolean e(kotlin.reflect.jvm.internal.impl.name.c r0, kotlin.reflect.jvm.internal.impl.name.c r1) {
            boolean r0 = g(r0, r1)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.name.c f(kotlin.reflect.jvm.internal.impl.descriptors.l0 r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.d()
            return r1
    }

    private static final boolean g(kotlin.reflect.jvm.internal.impl.name.c r1, kotlin.reflect.jvm.internal.impl.name.c r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2.c()
            if (r0 != 0) goto L17
            kotlin.reflect.jvm.internal.impl.name.c r2 = r2.d()
            boolean r1 = kotlin.jvm.internal.g0.g(r2, r1)
            if (r1 == 0) goto L17
            r1 = 1
            return r1
        L17:
            r1 = 0
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @kotlin.Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.l0> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r5) {
            r4 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.l0> r0 = r4.a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            r3 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r3
            kotlin.reflect.jvm.internal.impl.name.c r3 = r3.d()
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r5)
            if (r3 == 0) goto L12
            r1.add(r2)
            goto L12
        L2d:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.r0
    public void b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r4, @org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.l0> r5) {
            r3 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "packageFragments"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.l0> r0 = r3.a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            r2 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r2
            kotlin.reflect.jvm.internal.impl.name.c r2 = r2.d()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r4)
            if (r2 == 0) goto L12
            r5.add(r1)
            goto L12
        L2d:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.r0
    public boolean c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r4) {
            r3 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.l0> r0 = r3.a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            if (r1 == 0) goto L18
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L18
            return r2
        L18:
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r1
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.d()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r4)
            if (r1 == 0) goto L1c
            r4 = 0
            return r4
        L34:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.name.c> q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r3) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.l0> r3 = r1.a
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            kotlin.sequences.m r3 = kotlin.collections.f0.E1(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.n0 r0 = kotlin.reflect.jvm.internal.impl.descriptors.n0.a
            kotlin.sequences.m r3 = kotlin.sequences.p.N1(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.o0 r0 = new kotlin.reflect.jvm.internal.impl.descriptors.o0
            r0.<init>(r2)
            kotlin.sequences.m r2 = kotlin.sequences.p.P0(r3, r0)
            java.util.List r2 = kotlin.sequences.p.I3(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
    }
}
