package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPackagePartScopeCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PackagePartScopeCache.kt\norg/jetbrains/kotlin/descriptors/runtime/components/PackagePartScopeCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n72#2,2:42\n1617#3,9:44\n1869#3:53\n1870#3:55\n1626#3:56\n1617#3,9:57\n1869#3:66\n1870#3:68\n1626#3:69\n1#4:54\n1#4:67\n1#4:70\n*S KotlinDebug\n*F\n+ 1 PackagePartScopeCache.kt\norg/jetbrains/kotlin/descriptors/runtime/components/PackagePartScopeCache\n*L\n21#1:42,2\n26#1:44,9\n26#1:53\n26#1:55\n26#1:56\n34#1:57,9\n34#1:66\n34#1:68\n34#1:69\n26#1:54\n34#1:67\n21#1:70\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.n a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g b;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.ConcurrentHashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.resolve.scopes.k> c;

    public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.n r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g r3) {
            r1 = this;
            java.lang.String r0 = "resolver"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "kotlinClassFinder"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r1.c = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.k a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f r9) {
            r8 = this;
            java.lang.String r0 = "fileClass"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.util.concurrent.ConcurrentHashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.resolve.scopes.k> r0 = r8.c
            kotlin.reflect.jvm.internal.impl.name.b r1 = r9.c()
            java.lang.Object r2 = r0.get(r1)
            if (r2 != 0) goto Lda
            kotlin.reflect.jvm.internal.impl.name.b r2 = r9.c()
            kotlin.reflect.jvm.internal.impl.name.c r2 = r2.f()
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r3 = r9.e()
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r3 = r3.c()
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS
            if (r3 != r4) goto L71
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r3 = r9.e()
            java.util.List r3 = r3.f()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L38:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L75
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            kotlin.reflect.jvm.internal.impl.name.b$a r6 = kotlin.reflect.jvm.internal.impl.name.b.d
            kotlin.reflect.jvm.internal.impl.resolve.jvm.d r5 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d(r5)
            kotlin.reflect.jvm.internal.impl.name.c r5 = r5.e()
            java.lang.String r7 = "getFqNameForTopLevelClassMaybeWithDollars(...)"
            kotlin.jvm.internal.g0.o(r5, r7)
            kotlin.reflect.jvm.internal.impl.name.b r5 = r6.c(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g r6 = r8.b
            kotlin.reflect.jvm.internal.impl.load.kotlin.n r7 = r8.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r7 = r7.f()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.n r7 = r7.g()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r7 = r7.f()
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r5 = kotlin.reflect.jvm.internal.impl.load.kotlin.w.a(r6, r5, r7)
            if (r5 == 0) goto L38
            r4.add(r5)
            goto L38
        L71:
            java.util.List r4 = kotlin.collections.f0.l(r9)
        L75:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.p r3 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.p
            kotlin.reflect.jvm.internal.impl.load.kotlin.n r5 = r8.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r5 = r5.f()
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r5 = r5.q()
            r3.<init>(r5, r2)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L8f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto La7
            java.lang.Object r6 = r4.next()
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r6 = (kotlin.reflect.jvm.internal.impl.load.kotlin.x) r6
            kotlin.reflect.jvm.internal.impl.load.kotlin.n r7 = r8.a
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r6 = r7.c(r3, r6)
            if (r6 == 0) goto L8f
            r5.add(r6)
            goto L8f
        La7:
            java.util.List r3 = kotlin.collections.f0.a6(r5)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.b$a r4 = kotlin.reflect.jvm.internal.impl.resolve.scopes.b.d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "package "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = " ("
            r5.append(r2)
            r5.append(r9)
            r9 = 41
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r9 = r4.a(r9, r3)
            java.lang.Object r0 = r0.putIfAbsent(r1, r9)
            if (r0 != 0) goto Ld9
            r2 = r9
            goto Lda
        Ld9:
            r2 = r0
        Lda:
            java.lang.String r9 = "getOrPut(...)"
            kotlin.jvm.internal.g0.o(r2, r9)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.k) r2
            return r2
    }
}
