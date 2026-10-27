package kotlin.reflect.jvm.internal.impl.types.error;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class f implements kotlin.reflect.jvm.internal.impl.resolve.scopes.k {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind b;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String c;

    public f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r2, @org.jetbrains.annotations.NotNull java.lang.String... r3) {
            r1 = this;
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "formatParams"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.b = r2
            java.lang.String r2 = r2.getDebugMessage()
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.lang.String r2 = java.lang.String.format(r2, r3)
            java.lang.String r3 = "format(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r1.c = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    public /* bridge */ /* synthetic */ java.util.Collection a(kotlin.reflect.jvm.internal.impl.name.f r1, t3.b r2) {
            r0 = this;
            java.util.Set r1 = r0.i(r1, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            r1 = this;
            java.util.Set r0 = kotlin.collections.u1.k()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    public /* bridge */ /* synthetic */ java.util.Collection c(kotlin.reflect.jvm.internal.impl.name.f r1, t3.b r2) {
            r0 = this;
            java.util.Set r1 = r0.j(r1, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            r1 = this;
            java.util.Set r0 = kotlin.collections.u1.k()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    public void e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "location"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
            r1 = this;
            java.util.Set r0 = kotlin.collections.u1.k()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.f g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r5, @org.jetbrains.annotations.NotNull t3.b r6) {
            r4 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r6, r0)
            kotlin.reflect.jvm.internal.impl.types.error.a r6 = new kotlin.reflect.jvm.internal.impl.types.error.a
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity r0 = kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_CLASS
            java.lang.String r0 = r0.getDebugText()
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r5
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r5 = java.lang.String.format(r0, r5)
            java.lang.String r0 = "format(...)"
            kotlin.jvm.internal.g0.o(r5, r0)
            kotlin.reflect.jvm.internal.impl.name.f r5 = kotlin.reflect.jvm.internal.impl.name.f.k(r5)
            java.lang.String r0 = "special(...)"
            kotlin.jvm.internal.g0.o(r5, r0)
            r6.<init>(r5)
            return r6
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

    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.d1> i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "location"
            kotlin.jvm.internal.g0.p(r3, r2)
            kotlin.reflect.jvm.internal.impl.types.error.b r2 = new kotlin.reflect.jvm.internal.impl.types.error.b
            kotlin.reflect.jvm.internal.impl.types.error.i r3 = kotlin.reflect.jvm.internal.impl.types.error.i.a
            kotlin.reflect.jvm.internal.impl.types.error.a r3 = r3.h()
            r2.<init>(r3)
            java.util.Set r2 = kotlin.collections.u1.f(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.w0> j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "location"
            kotlin.jvm.internal.g0.p(r3, r2)
            kotlin.reflect.jvm.internal.impl.types.error.i r2 = kotlin.reflect.jvm.internal.impl.types.error.i.a
            java.util.Set r2 = r2.j()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    protected final java.lang.String k() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ErrorScope{"
            r0.append(r1)
            java.lang.String r1 = r2.c
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
