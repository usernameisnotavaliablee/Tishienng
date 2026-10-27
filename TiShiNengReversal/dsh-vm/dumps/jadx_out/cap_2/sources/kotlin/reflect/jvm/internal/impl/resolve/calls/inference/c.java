package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c implements kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.c2 a;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.types.checker.n b;

    public c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.c2 r2) {
            r1 = this;
            java.lang.String r0 = "projection"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            kotlin.reflect.jvm.internal.impl.types.c2 r2 = r1.getProjection()
            r2.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r2 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.w1 a(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c r1 = r0.g(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f c() {
            r1 = this;
            java.lang.Void r0 = r1.e()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = (kotlin.reflect.jvm.internal.impl.descriptors.f) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    public boolean d() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Void e() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.types.checker.n f() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.checker.n r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r3) {
            r2 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c r0 = new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = r2.getProjection()
            kotlin.reflect.jvm.internal.impl.types.c2 r3 = r1.a(r3)
            java.lang.String r1 = "refine(...)"
            kotlin.jvm.internal.g0.o(r3, r1)
            r0.<init>(r3)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> getParameters() {
            r1 = this;
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.c2 getProjection() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.c2 r0 = r1.a
            return r0
    }

    public final void h(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.checker.n r1) {
            r0 = this;
            r0.b = r1
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> i() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.c2 r0 = r2.getProjection()
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r0.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            if (r0 != r1) goto L15
            kotlin.reflect.jvm.internal.impl.types.c2 r0 = r2.getProjection()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
            goto L1d
        L15:
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = r2.p()
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.J()
        L1d:
            kotlin.jvm.internal.g0.m(r0)
            java.util.List r0 = kotlin.collections.f0.l(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.builtins.j p() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.c2 r0 = r2.getProjection()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.I0()
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = r0.p()
            java.lang.String r1 = "getBuiltIns(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CapturedTypeConstructor("
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = r2.getProjection()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
