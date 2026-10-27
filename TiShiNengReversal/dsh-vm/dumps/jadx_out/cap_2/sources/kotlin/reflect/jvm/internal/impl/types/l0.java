package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nflexibleTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 flexibleTypes.kt\norg/jetbrains/kotlin/types/FlexibleTypeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class l0 extends kotlin.reflect.jvm.internal.impl.types.k0 implements kotlin.reflect.jvm.internal.impl.types.x {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.l0.a e = null;

    @kotlin.jvm.JvmField
    public static boolean f;
    private boolean d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.types.l0$a r0 = new kotlin.reflect.jvm.internal.impl.types.l0$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.l0.e = r0
            return
    }

    public l0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r3) {
            r1 = this;
            java.lang.String r0 = "lowerBound"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "upperBound"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2, r3)
            return
    }

    private final void U0() {
            r3 = this;
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.l0.f
            if (r0 == 0) goto L32
            boolean r0 = r3.d
            if (r0 == 0) goto L9
            goto L32
        L9:
            r0 = 1
            r3.d = r0
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r3.Q0()
            kotlin.reflect.jvm.internal.impl.types.n0.b(r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r3.R0()
            kotlin.reflect.jvm.internal.impl.types.n0.b(r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r3.Q0()
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r3.R0()
            kotlin.jvm.internal.g0.g(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.checker.e r0 = kotlin.reflect.jvm.internal.impl.types.checker.e.a
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r3.Q0()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r3.R0()
            r0.d(r1, r2)
        L32:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.x
    public boolean E0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.Q0()
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.c()
            boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            if (r0 == 0) goto L28
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.Q0()
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.I0()
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.R0()
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L28
            r0 = 1
            return r0
        L28:
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 K0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.k0 r1 = r0.T0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.m2 M0(boolean r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.Q0()
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.P0(r3)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.R0()
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r1.P0(r3)
            kotlin.reflect.jvm.internal.impl.types.m2 r3 = kotlin.reflect.jvm.internal.impl.types.w0.e(r0, r3)
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 N0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.k0 r1 = r0.T0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.m2 O0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r3) {
            r2 = this;
            java.lang.String r0 = "newAttributes"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.Q0()
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.Q0(r3)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.R0()
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r1.Q0(r3)
            kotlin.reflect.jvm.internal.impl.types.m2 r3 = kotlin.reflect.jvm.internal.impl.types.w0.e(r0, r3)
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.k0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 P0() {
            r1 = this;
            r1.U0()
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.Q0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.k0
    @org.jetbrains.annotations.NotNull
    public java.lang.String S0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.m r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.u r4) {
            r2 = this;
            java.lang.String r0 = "renderer"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r4 = r4.d()
            if (r4 == 0) goto L3f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r0 = 40
            r4.append(r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.Q0()
            java.lang.String r0 = r3.T(r0)
            r4.append(r0)
            java.lang.String r0 = ".."
            r4.append(r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.R0()
            java.lang.String r3 = r3.T(r0)
            r4.append(r3)
            r3 = 41
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            return r3
        L3f:
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r2.Q0()
            java.lang.String r4 = r3.T(r4)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.R0()
            java.lang.String r0 = r3.T(r0)
            kotlin.reflect.jvm.internal.impl.builtins.j r1 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.o(r2)
            java.lang.String r3 = r3.Q(r4, r0, r1)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.k0 T0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r5) {
            r4 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.types.l0 r0 = new kotlin.reflect.jvm.internal.impl.types.l0
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r4.Q0()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r5.h(r1)
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"
            kotlin.jvm.internal.g0.n(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = (kotlin.reflect.jvm.internal.impl.types.e1) r1
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r4.R0()
            kotlin.reflect.jvm.internal.impl.types.t0 r5 = r5.h(r3)
            kotlin.jvm.internal.g0.n(r5, r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r5 = (kotlin.reflect.jvm.internal.impl.types.e1) r5
            r0.<init>(r1, r5)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.x
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 p0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3) {
            r2 = this;
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.types.m2 r3 = r3.L0()
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.k0
            if (r0 == 0) goto Lf
            r0 = r3
            goto L1f
        Lf:
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.e1
            if (r0 == 0) goto L24
            r0 = r3
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = (kotlin.reflect.jvm.internal.impl.types.e1) r0
            r1 = 1
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.P0(r1)
            kotlin.reflect.jvm.internal.impl.types.m2 r0 = kotlin.reflect.jvm.internal.impl.types.w0.e(r0, r1)
        L1f:
            kotlin.reflect.jvm.internal.impl.types.m2 r3 = kotlin.reflect.jvm.internal.impl.types.l2.b(r0, r3)
            return r3
        L24:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.k0
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.Q0()
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.R0()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
