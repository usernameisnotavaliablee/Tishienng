package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f0 extends kotlin.reflect.jvm.internal.impl.types.k0 implements d4.d {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.t1 d;

    public f0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.j r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r4) {
            r2 = this;
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r3.I()
            java.lang.String r1 = "getNothingType(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r3.J()
            java.lang.String r1 = "getNullableAnyType(...)"
            kotlin.jvm.internal.g0.o(r3, r1)
            r2.<init>(r0, r3)
            r2.d = r4
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.k0, kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t1 H0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = r1.d
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.k0, kotlin.reflect.jvm.internal.impl.types.t0
    public boolean J0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 K0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.f0 r1 = r0.U0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 M0(boolean r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.f0 r1 = r0.T0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 N0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.f0 r1 = r0.U0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 O0(kotlin.reflect.jvm.internal.impl.types.t1 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.f0 r1 = r0.V0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.k0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 P0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.R0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.k0
    @org.jetbrains.annotations.NotNull
    public java.lang.String S0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.m r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.u r3) {
            r1 = this;
            java.lang.String r0 = "renderer"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "options"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.lang.String r2 = "dynamic"
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.f0 T0(boolean r1) {
            r0 = this;
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.f0 U0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r2) {
            r1 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r2, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.f0 V0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r3) {
            r2 = this;
            java.lang.String r0 = "newAttributes"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.types.f0 r0 = new kotlin.reflect.jvm.internal.impl.types.f0
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.P0()
            kotlin.reflect.jvm.internal.impl.builtins.j r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.o(r1)
            r0.<init>(r1, r3)
            return r0
    }
}
