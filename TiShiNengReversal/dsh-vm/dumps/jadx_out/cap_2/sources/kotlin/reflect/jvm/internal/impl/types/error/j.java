package kotlin.reflect.jvm.internal.impl.types.error;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j extends kotlin.reflect.jvm.internal.impl.types.error.f {
    public j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r2, @org.jetbrains.annotations.NotNull java.lang.String... r3) {
            r1 = this;
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "formatParams"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r1.<init>(r2, r3)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    public /* bridge */ /* synthetic */ java.util.Collection a(kotlin.reflect.jvm.internal.impl.name.f r1, t3.b r2) {
            r0 = this;
            java.util.Set r1 = r0.i(r1, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            r1 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    public /* bridge */ /* synthetic */ java.util.Collection c(kotlin.reflect.jvm.internal.impl.name.f r1, t3.b r2) {
            r0 = this;
            java.util.Set r1 = r0.j(r1, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            r1 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    public /* bridge */ /* synthetic */ void e(kotlin.reflect.jvm.internal.impl.name.f r1, t3.b r2) {
            r0 = this;
            r0.l(r1, r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
            r1 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.f g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3, @org.jetbrains.annotations.NotNull t3.b r4) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.k()
            r0.append(r1)
            java.lang.String r1 = ", required name: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r3) {
            r1 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "nameFilter"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = r1.k()
            r2.<init>(r3)
            throw r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.d1> i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3, @org.jetbrains.annotations.NotNull t3.b r4) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.k()
            r0.append(r1)
            java.lang.String r1 = ", required name: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.w0> j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3, @org.jetbrains.annotations.NotNull t3.b r4) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.k()
            r0.append(r1)
            java.lang.String r1 = ", required name: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Void l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "location"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ThrowingScope{"
            r0.append(r1)
            java.lang.String r1 = r2.k()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
