package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i extends kotlin.reflect.jvm.internal.impl.types.b0 implements kotlin.reflect.jvm.internal.impl.types.b1 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.e1 b;

    public i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.b = r2
            return
    }

    private final kotlin.reflect.jvm.internal.impl.types.e1 U0(kotlin.reflect.jvm.internal.impl.types.e1 r2) {
            r1 = this;
            r0 = 0
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.P0(r0)
            boolean r2 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.z(r2)
            if (r2 != 0) goto Lc
            return r0
        Lc:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i r2 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i
            r2.<init>(r0)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.x
    public boolean E0() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0, kotlin.reflect.jvm.internal.impl.types.t0
    public boolean J0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 M0(boolean r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.P0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 O0(kotlin.reflect.jvm.internal.impl.types.t1 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i r1 = r0.V0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.e1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 P0(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r1.R0()
            r0 = 1
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.P0(r0)
            return r2
        Lc:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.e1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 Q0(kotlin.reflect.jvm.internal.impl.types.t1 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i r1 = r0.V0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.types.e1 R0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.b
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.b0 T0(kotlin.reflect.jvm.internal.impl.types.e1 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i r1 = r0.W0(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i V0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r3) {
            r2 = this;
            java.lang.String r0 = "newAttributes"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.R0()
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r1.Q0(r3)
            r0.<init>(r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i W0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i
            r0.<init>(r2)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.x
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 p0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3) {
            r2 = this;
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.types.m2 r3 = r3.L0()
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.z(r3)
            if (r0 != 0) goto L16
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.j2.l(r3)
            if (r0 != 0) goto L16
            return r3
        L16:
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.e1
            if (r0 == 0) goto L21
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = (kotlin.reflect.jvm.internal.impl.types.e1) r3
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r2.U0(r3)
            return r3
        L21:
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.k0
            if (r0 == 0) goto L45
            r0 = r3
            kotlin.reflect.jvm.internal.impl.types.k0 r0 = (kotlin.reflect.jvm.internal.impl.types.k0) r0
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.Q0()
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.U0(r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.R0()
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.U0(r0)
            kotlin.reflect.jvm.internal.impl.types.m2 r0 = kotlin.reflect.jvm.internal.impl.types.w0.e(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = kotlin.reflect.jvm.internal.impl.types.l2.a(r3)
            kotlin.reflect.jvm.internal.impl.types.m2 r3 = kotlin.reflect.jvm.internal.impl.types.l2.d(r0, r3)
            return r3
        L45:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
    }
}
