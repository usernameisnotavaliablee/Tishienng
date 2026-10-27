package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMemberScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberScopeImpl.kt\norg/jetbrains/kotlin/resolve/scopes/MemberScopeImpl\n+ 2 CollectionUtil.kt\norg/jetbrains/kotlin/utils/CollectionUtilKt\n*L\n1#1,56:1\n18#2,6:57\n18#2,6:63\n*S KotlinDebug\n*F\n+ 1 MemberScopeImpl.kt\norg/jetbrains/kotlin/resolve/scopes/MemberScopeImpl\n*L\n44#1:57,6\n49#1:63,6\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class l implements kotlin.reflect.jvm.internal.impl.resolve.scopes.k {
    public l() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "location"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.util.List r2 = kotlin.collections.f0.J()
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.v
            kotlin.jvm.functions.Function1 r1 = kotlin.reflect.jvm.internal.impl.utils.i.k()
            java.util.Collection r0 = r4.h(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d1
            if (r3 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r2
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
            java.lang.String r3 = "getName(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r1.add(r2)
            goto L15
        L32:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.w0> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "location"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.util.List r2 = kotlin.collections.f0.J()
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.w
            kotlin.jvm.functions.Function1 r1 = kotlin.reflect.jvm.internal.impl.utils.i.k()
            java.util.Collection r0 = r4.h(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d1
            if (r3 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r2
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
            java.lang.String r3 = "getName(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r1.add(r2)
            goto L15
        L32:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    public void e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1, @org.jetbrains.annotations.NotNull t3.b r2) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k.b.a(r0, r1, r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.Nullable
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.f g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "location"
            kotlin.jvm.internal.g0.p(r3, r2)
            r2 = 0
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r3) {
            r1 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "nameFilter"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.util.List r2 = kotlin.collections.f0.J()
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
    }
}
