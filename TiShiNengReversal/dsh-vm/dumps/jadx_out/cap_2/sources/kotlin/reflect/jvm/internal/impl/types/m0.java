package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m0 extends kotlin.reflect.jvm.internal.impl.types.k0 implements kotlin.reflect.jvm.internal.impl.types.k2 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.k0 d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.t0 e;

    public m0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.k0 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r4) {
            r2 = this;
            java.lang.String r0 = "origin"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "enhancement"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r3.Q0()
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r3.R0()
            r2.<init>(r0, r1)
            r2.d = r3
            r2.e = r4
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 K0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.m0 r1 = r0.U0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.m2 M0(boolean r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.k0 r0 = r2.T0()
            kotlin.reflect.jvm.internal.impl.types.m2 r0 = r0.M0(r3)
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r2.o0()
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = r1.L0()
            kotlin.reflect.jvm.internal.impl.types.m2 r3 = r1.M0(r3)
            kotlin.reflect.jvm.internal.impl.types.m2 r3 = kotlin.reflect.jvm.internal.impl.types.l2.d(r0, r3)
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 N0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.m0 r1 = r0.U0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.m2 O0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r2) {
            r1 = this;
            java.lang.String r0 = "newAttributes"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.k0 r0 = r1.T0()
            kotlin.reflect.jvm.internal.impl.types.m2 r2 = r0.O0(r2)
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.o0()
            kotlin.reflect.jvm.internal.impl.types.m2 r2 = kotlin.reflect.jvm.internal.impl.types.l2.d(r2, r0)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.k0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 P0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.k0 r0 = r1.T0()
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.P0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.k0
    @org.jetbrains.annotations.NotNull
    public java.lang.String S0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.m r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.u r3) {
            r1 = this;
            java.lang.String r0 = "renderer"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3.b()
            if (r0 == 0) goto L19
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r1.o0()
            java.lang.String r2 = r2.T(r3)
            return r2
        L19:
            kotlin.reflect.jvm.internal.impl.types.k0 r0 = r1.T0()
            java.lang.String r2 = r0.S0(r2, r3)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.k2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 T() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.k0 r0 = r1.T0()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.k0 T0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.k0 r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.m0 U0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r4) {
            r3 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.types.m0 r0 = new kotlin.reflect.jvm.internal.impl.types.m0
            kotlin.reflect.jvm.internal.impl.types.k0 r1 = r3.T0()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r4.h(r1)
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType"
            kotlin.jvm.internal.g0.n(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.k0 r1 = (kotlin.reflect.jvm.internal.impl.types.k0) r1
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r3.o0()
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.h(r2)
            r0.<init>(r1, r4)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.k2
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 o0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.e
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.k0
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[@EnhancedForWarnings("
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r2.o0()
            r0.append(r1)
            java.lang.String r1 = ")] "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.types.k0 r1 = r2.T0()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
