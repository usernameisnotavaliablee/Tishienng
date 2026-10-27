package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a extends kotlin.reflect.jvm.internal.impl.types.b0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.e1 b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.e1 c;

    public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r3) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "abbreviation"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.b = r2
            r1.c = r3
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0, kotlin.reflect.jvm.internal.impl.types.t0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 K0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.a r1 = r0.W0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 M0(boolean r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.a r1 = r0.V0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0, kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 N0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.a r1 = r0.W0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 O0(kotlin.reflect.jvm.internal.impl.types.t1 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.Q0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.e1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 P0(boolean r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.a r1 = r0.V0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.e1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 Q0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r3) {
            r2 = this;
            java.lang.String r0 = "newAttributes"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.types.a r0 = new kotlin.reflect.jvm.internal.impl.types.a
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.R0()
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r1.Q0(r3)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.c
            r0.<init>(r3, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.types.e1 R0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.b
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 S0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.a r1 = r0.W0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.b0 T0(kotlin.reflect.jvm.internal.impl.types.e1 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.a r1 = r0.X0(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.e1 U0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.a V0(boolean r4) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.types.a r0 = new kotlin.reflect.jvm.internal.impl.types.a
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r3.R0()
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.P0(r4)
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r3.c
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r2.P0(r4)
            r0.<init>(r1, r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.a W0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r5) {
            r4 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.types.a r0 = new kotlin.reflect.jvm.internal.impl.types.a
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r4.R0()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r5.h(r1)
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"
            kotlin.jvm.internal.g0.n(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = (kotlin.reflect.jvm.internal.impl.types.e1) r1
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r4.c
            kotlin.reflect.jvm.internal.impl.types.t0 r5 = r5.h(r3)
            kotlin.jvm.internal.g0.n(r5, r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r5 = (kotlin.reflect.jvm.internal.impl.types.e1) r5
            r0.<init>(r1, r5)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.a X0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r3) {
            r2 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.types.a r0 = new kotlin.reflect.jvm.internal.impl.types.a
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.c
            r0.<init>(r3, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.e1 Z() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.R0()
            return r0
    }
}
