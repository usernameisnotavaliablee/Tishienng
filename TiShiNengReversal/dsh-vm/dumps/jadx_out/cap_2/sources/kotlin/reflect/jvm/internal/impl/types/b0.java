package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class b0 extends kotlin.reflect.jvm.internal.impl.types.e1 {
    public b0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> G0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.R0()
            java.util.List r0 = r0.G0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t1 H0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.R0()
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = r0.H0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.w1 I0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.R0()
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.I0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    public boolean J0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.R0()
            boolean r0 = r0.J0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 K0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.S0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 N0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.S0(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    protected abstract kotlin.reflect.jvm.internal.impl.types.e1 R0();

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 S0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r2) {
            r1 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.R0()
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.h(r0)
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"
            kotlin.jvm.internal.g0.n(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = (kotlin.reflect.jvm.internal.impl.types.e1) r2
            kotlin.reflect.jvm.internal.impl.types.b0 r2 = r1.T0(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.types.b0 T0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r1);

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k r() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.R0()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r0.r()
            return r0
    }
}
