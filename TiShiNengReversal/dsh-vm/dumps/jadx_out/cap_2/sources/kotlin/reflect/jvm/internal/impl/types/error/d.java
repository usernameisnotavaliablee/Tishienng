package kotlin.reflect.jvm.internal.impl.types.error;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d implements kotlin.reflect.jvm.internal.impl.descriptors.f0 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.error.d a = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.f b = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.f0> c = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.f0> d = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.f0> e = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.s f = null;

    static {
            kotlin.reflect.jvm.internal.impl.types.error.d r0 = new kotlin.reflect.jvm.internal.impl.types.error.d
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.types.error.d.a = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity r0 = kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_MODULE
            java.lang.String r0 = r0.getDebugText()
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.f.k(r0)
            java.lang.String r1 = "special(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.error.d.b = r0
            java.util.List r0 = kotlin.collections.f0.J()
            kotlin.reflect.jvm.internal.impl.types.error.d.c = r0
            java.util.List r0 = kotlin.collections.f0.J()
            kotlin.reflect.jvm.internal.impl.types.error.d.d = r0
            java.util.Set r0 = kotlin.collections.u1.k()
            kotlin.reflect.jvm.internal.impl.types.error.d.e = r0
            kotlin.reflect.jvm.internal.impl.types.error.c r0 = kotlin.reflect.jvm.internal.impl.types.error.c.a
            kotlin.s r0 = kotlin.t.c(r0)
            kotlin.reflect.jvm.internal.impl.types.error.d.f = r0
            return
    }

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.g T() {
            kotlin.reflect.jvm.internal.impl.builtins.g r0 = o0()
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.builtins.g o0() {
            kotlin.reflect.jvm.internal.impl.builtins.g$a r0 = kotlin.reflect.jvm.internal.impl.builtins.g.i
            kotlin.reflect.jvm.internal.impl.builtins.g r0 = r0.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    public boolean B(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r2) {
            r1 = this;
            java.lang.String r0 = "targetModule"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 0
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.s0 M(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Should not be called!"
            r2.<init>(r0)
            throw r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.f0> P() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.f0> r0 = kotlin.reflect.jvm.internal.impl.types.error.d.d
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    @org.jetbrains.annotations.Nullable
    public <T> T U(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e0<T> r2) {
            r1 = this;
            java.lang.String r0 = "capability"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 0
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.Nullable
    public <R, D> R W(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> r1, D r2) {
            r0 = this;
            java.lang.String r2 = "visitor"
            kotlin.jvm.internal.g0.p(r1, r2)
            r1 = 0
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.k a() {
            r0 = this;
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.k b() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.b()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = r1.p0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.builtins.j p() {
            r1 = this;
            kotlin.s r0 = kotlin.reflect.jvm.internal.impl.types.error.d.f
            java.lang.Object r0 = r0.getValue()
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = (kotlin.reflect.jvm.internal.impl.builtins.j) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.name.f p0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.types.error.d.b
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.name.c> q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r3) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "nameFilter"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.util.List r2 = kotlin.collections.f0.J()
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
    }
}
