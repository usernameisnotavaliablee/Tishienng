package kotlin.reflect.jvm.internal.impl.resolve.jvm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSyntheticJavaPartsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyntheticJavaPartsProvider.kt\norg/jetbrains/kotlin/resolve/jvm/CompositeSyntheticJavaPartsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n1374#2:109\n1460#2,5:110\n1869#2,2:115\n1374#2:117\n1460#2,5:118\n1869#2,2:123\n1869#2,2:125\n1374#2:127\n1460#2,5:128\n1869#2,2:133\n1803#2,3:135\n*S KotlinDebug\n*F\n+ 1 SyntheticJavaPartsProvider.kt\norg/jetbrains/kotlin/resolve/jvm/CompositeSyntheticJavaPartsProvider\n*L\n55#1:109\n55#1:110,5\n64#1:115,2\n68#1:117\n68#1:118,5\n76#1:123,2\n84#1:125,2\n88#1:127\n88#1:128,5\n97#1:133,2\n105#1:135,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a implements kotlin.reflect.jvm.internal.impl.resolve.jvm.e {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.resolve.jvm.e> b;

    public a(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.jvm.e> r2) {
            r1 = this;
            java.lang.String r0 = "inner"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.b = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.e
    public void a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r3, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.c> r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r5) {
            r2 = this;
            java.lang.String r0 = "thisDescriptor"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.List<kotlin.reflect.jvm.internal.impl.resolve.jvm.e> r0 = r2.b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.e r1 = (kotlin.reflect.jvm.internal.impl.resolve.jvm.e) r1
            r1.a(r3, r4, r5)
            goto L17
        L27:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.e
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r5) {
            r2 = this;
            java.lang.String r0 = "thisDescriptor"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "propertyDescriptor"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.List<kotlin.reflect.jvm.internal.impl.resolve.jvm.e> r0 = r2.b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.e r1 = (kotlin.reflect.jvm.internal.impl.resolve.jvm.e) r1
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 r4 = r1.b(r3, r4, r5)
            goto L17
        L28:
            return r4
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.e
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.name.f> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r5) {
            r3 = this;
            java.lang.String r0 = "thisDescriptor"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.List<kotlin.reflect.jvm.internal.impl.resolve.jvm.e> r0 = r3.b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.e r2 = (kotlin.reflect.jvm.internal.impl.resolve.jvm.e) r2
            java.util.List r2 = r2.c(r4, r5)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.collections.f0.s0(r1, r2)
            goto L17
        L2d:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.e
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.name.f> d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r5) {
            r3 = this;
            java.lang.String r0 = "thisDescriptor"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.List<kotlin.reflect.jvm.internal.impl.resolve.jvm.e> r0 = r3.b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.e r2 = (kotlin.reflect.jvm.internal.impl.resolve.jvm.e) r2
            java.util.List r2 = r2.d(r4, r5)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.collections.f0.s0(r1, r2)
            goto L17
        L2d:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.e
    public void e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r4, @org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r6) {
            r2 = this;
            java.lang.String r0 = "thisDescriptor"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.List<kotlin.reflect.jvm.internal.impl.resolve.jvm.e> r0 = r2.b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.e r1 = (kotlin.reflect.jvm.internal.impl.resolve.jvm.e) r1
            r1.e(r3, r4, r5, r6)
            goto L1c
        L2c:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.e
    public void f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r4, @org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r6) {
            r2 = this;
            java.lang.String r0 = "thisDescriptor"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.List<kotlin.reflect.jvm.internal.impl.resolve.jvm.e> r0 = r2.b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.e r1 = (kotlin.reflect.jvm.internal.impl.resolve.jvm.e) r1
            r1.f(r3, r4, r5, r6)
            goto L1c
        L2c:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.e
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.name.f> g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r5) {
            r3 = this;
            java.lang.String r0 = "thisDescriptor"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.List<kotlin.reflect.jvm.internal.impl.resolve.jvm.e> r0 = r3.b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.e r2 = (kotlin.reflect.jvm.internal.impl.resolve.jvm.e) r2
            java.util.List r2 = r2.g(r4, r5)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.collections.f0.s0(r1, r2)
            goto L17
        L2d:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.e
    public void h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r4, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.d> r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r6) {
            r2 = this;
            java.lang.String r0 = "thisDescriptor"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.List<kotlin.reflect.jvm.internal.impl.resolve.jvm.e> r0 = r2.b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.e r1 = (kotlin.reflect.jvm.internal.impl.resolve.jvm.e) r1
            r1.h(r3, r4, r5, r6)
            goto L1c
        L2c:
            return
    }
}
