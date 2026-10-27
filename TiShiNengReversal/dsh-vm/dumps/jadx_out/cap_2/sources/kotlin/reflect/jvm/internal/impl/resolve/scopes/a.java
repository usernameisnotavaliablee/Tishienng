package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class a implements kotlin.reflect.jvm.internal.impl.resolve.scopes.k {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d1> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.j()
            java.util.Collection r2 = r0.a(r2, r3)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.j()
            java.util.Set r0 = r0.b()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.j()
            java.util.Collection r2 = r0.c(r2, r3)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.j()
            java.util.Set r0 = r0.d()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    public void e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.j()
            r0.e(r2, r3)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.Nullable
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.j()
            java.util.Set r0 = r0.f()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.f g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.j()
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r0.g(r2, r3)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r3) {
            r1 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.j()
            java.util.Collection r2 = r0.h(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.k i() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r2.j()
            boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.a
            if (r0 == 0) goto L18
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r2.j()
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter"
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.a r0 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.a) r0
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r0.i()
            return r0
        L18:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r2.j()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected abstract kotlin.reflect.jvm.internal.impl.resolve.scopes.k j();
}
