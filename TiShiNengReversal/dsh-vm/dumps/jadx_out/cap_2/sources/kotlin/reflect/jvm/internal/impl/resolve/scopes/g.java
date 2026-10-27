package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nInnerClassesScopeWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerClassesScopeWrapper.kt\norg/jetbrains/kotlin/resolve/scopes/InnerClassesScopeWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n808#2,11:56\n*S KotlinDebug\n*F\n+ 1 InnerClassesScopeWrapper.kt\norg/jetbrains/kotlin/resolve/scopes/InnerClassesScopeWrapper\n*L\n35#1:56,11\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g extends kotlin.reflect.jvm.internal.impl.resolve.scopes.l {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.k b;

    public g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2) {
            r1 = this;
            java.lang.String r0 = "workerScope"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.b = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.b
            java.util.Set r0 = r0.b()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.b
            java.util.Set r0 = r0.d()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    public void e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.b
            r0.e(r2, r3)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.Nullable
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.b
            java.util.Set r0 = r0.f()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.f g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.b
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r0.g(r2, r3)
            r3 = 0
            if (r2 == 0) goto L26
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto L1b
            r0 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            goto L1c
        L1b:
            r0 = r3
        L1c:
            if (r0 == 0) goto L1f
            return r0
        L1f:
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i1
            if (r0 == 0) goto L26
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.i1) r2
            return r2
        L26:
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    public /* bridge */ /* synthetic */ java.util.Collection h(kotlin.reflect.jvm.internal.impl.resolve.scopes.d r1, kotlin.jvm.functions.Function1 r2) {
            r0 = this;
            java.util.List r1 = r0.i(r1, r2)
            java.util.Collection r1 = (java.util.Collection) r1
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.f> i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r4) {
            r2 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.c
            int r0 = r0.c()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d r3 = r3.n(r0)
            if (r3 != 0) goto L1b
            java.util.List r3 = kotlin.collections.f0.J()
            return r3
        L1b:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r2.b
            java.util.Collection r3 = r0.h(r3, r4)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L2c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r3.next()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g
            if (r1 == 0) goto L2c
            r4.add(r0)
            goto L2c
        L3e:
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Classes from "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r1 = r2.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
