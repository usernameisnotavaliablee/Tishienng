package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCompositePackageFragmentProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositePackageFragmentProvider.kt\norg/jetbrains/kotlin/descriptors/impl/CompositePackageFragmentProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1740#2,3:64\n*S KotlinDebug\n*F\n+ 1 CompositePackageFragmentProvider.kt\norg/jetbrains/kotlin/descriptors/impl/CompositePackageFragmentProvider\n*L\n51#1:64,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class l implements kotlin.reflect.jvm.internal.impl.descriptors.r0 {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.m0> a;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String b;

    public l(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.m0> r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "providers"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "debugName"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r2.size()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Set r2 = kotlin.collections.f0.f6(r2)
            r2.size()
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @kotlin.Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.l0> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r4) {
            r3 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.m0> r1 = r3.a
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.m0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.m0) r2
            kotlin.reflect.jvm.internal.impl.descriptors.q0.a(r2, r4, r0)
            goto L10
        L20:
            java.util.List r4 = kotlin.collections.f0.a6(r0)
            return r4
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.r0
    public void b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r3, @org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.l0> r4) {
            r2 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "packageFragments"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.m0> r0 = r2.a
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.m0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.m0) r1
            kotlin.reflect.jvm.internal.impl.descriptors.q0.a(r1, r3, r4)
            goto L10
        L20:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.r0
    public boolean c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r4) {
            r3 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.m0> r0 = r3.a
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
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.m0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.m0) r1
            boolean r1 = kotlin.reflect.jvm.internal.impl.descriptors.q0.b(r1, r4)
            if (r1 != 0) goto L1c
            r4 = 0
            return r4
        L30:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.name.c> q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r5) {
            r3 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.m0> r1 = r3.a
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.m0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.m0) r2
            java.util.Collection r2 = r2.q(r4, r5)
            r0.addAll(r2)
            goto L15
        L29:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }
}
