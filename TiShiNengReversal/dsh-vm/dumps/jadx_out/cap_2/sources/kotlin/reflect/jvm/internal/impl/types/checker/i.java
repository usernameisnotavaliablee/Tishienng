package kotlin.reflect.jvm.internal.impl.types.checker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nNewCapturedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i extends kotlin.reflect.jvm.internal.impl.types.e1 implements d4.b {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.checker.n c;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.types.m2 d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.t1 e;
    private final boolean f;
    private final boolean g;

    public i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.n r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.m2 r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r5, boolean r6, boolean r7) {
            r1 = this;
            java.lang.String r0 = "captureStatus"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "constructor"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.b = r2
            r1.c = r3
            r1.d = r4
            r1.e = r5
            r1.f = r6
            r1.g = r7
            return
    }

    public /* synthetic */ i(kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r8, kotlin.reflect.jvm.internal.impl.types.checker.n r9, kotlin.reflect.jvm.internal.impl.types.m2 r10, kotlin.reflect.jvm.internal.impl.types.t1 r11, boolean r12, boolean r13, int r14, kotlin.jvm.internal.v r15) {
            r7 = this;
            r15 = r14 & 8
            if (r15 == 0) goto La
            kotlin.reflect.jvm.internal.impl.types.t1$a r11 = kotlin.reflect.jvm.internal.impl.types.t1.b
            kotlin.reflect.jvm.internal.impl.types.t1 r11 = r11.k()
        La:
            r4 = r11
            r11 = r14 & 16
            r15 = 0
            if (r11 == 0) goto L12
            r5 = 0
            goto L13
        L12:
            r5 = r12
        L13:
            r11 = r14 & 32
            if (r11 == 0) goto L1d
            r6 = 0
        L18:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            goto L1f
        L1d:
            r6 = r13
            goto L18
        L1f:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r11, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.m2 r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.c2 r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r14) {
            r10 = this;
            java.lang.String r0 = "captureStatus"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "projection"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "typeParameter"
            kotlin.jvm.internal.g0.p(r14, r0)
            kotlin.reflect.jvm.internal.impl.types.checker.n r1 = new kotlin.reflect.jvm.internal.impl.types.checker.n
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            r2 = r13
            r5 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8 = 56
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r11
            r4 = r12
            r3 = r1
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> G0() {
            r1 = this;
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t1 H0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = r1.e
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.w1 I0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.checker.n r0 = r1.S0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    public boolean J0() {
            r1 = this;
            boolean r0 = r1.f
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 K0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.checker.i r1 = r0.W0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 M0(boolean r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.checker.i r1 = r0.V0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 N0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.checker.i r1 = r0.W0(r1)
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
            kotlin.reflect.jvm.internal.impl.types.checker.i r1 = r0.V0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.e1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 Q0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r9) {
            r8 = this;
            java.lang.String r0 = "newAttributes"
            kotlin.jvm.internal.g0.p(r9, r0)
            kotlin.reflect.jvm.internal.impl.types.checker.i r1 = new kotlin.reflect.jvm.internal.impl.types.checker.i
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r2 = r8.b
            kotlin.reflect.jvm.internal.impl.types.checker.n r3 = r8.S0()
            kotlin.reflect.jvm.internal.impl.types.m2 r4 = r8.d
            boolean r6 = r8.J0()
            boolean r7 = r8.g
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus R0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.checker.n S0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.checker.n r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.types.m2 T0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.m2 r0 = r1.d
            return r0
    }

    public final boolean U0() {
            r1 = this;
            boolean r0 = r1.g
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.checker.i V0(boolean r10) {
            r9 = this;
            kotlin.reflect.jvm.internal.impl.types.checker.i r0 = new kotlin.reflect.jvm.internal.impl.types.checker.i
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r1 = r9.b
            kotlin.reflect.jvm.internal.impl.types.checker.n r2 = r9.S0()
            kotlin.reflect.jvm.internal.impl.types.m2 r3 = r9.d
            kotlin.reflect.jvm.internal.impl.types.t1 r4 = r9.H0()
            r7 = 32
            r8 = 0
            r6 = 0
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.checker.i W0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r11) {
            r10 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r11, r0)
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r2 = r10.b
            kotlin.reflect.jvm.internal.impl.types.checker.n r0 = r10.S0()
            kotlin.reflect.jvm.internal.impl.types.checker.n r3 = r0.q(r11)
            kotlin.reflect.jvm.internal.impl.types.m2 r0 = r10.d
            if (r0 == 0) goto L1d
            kotlin.reflect.jvm.internal.impl.types.t0 r11 = r11.h(r0)
            kotlin.reflect.jvm.internal.impl.types.m2 r11 = r11.L0()
        L1b:
            r4 = r11
            goto L1f
        L1d:
            r11 = 0
            goto L1b
        L1f:
            kotlin.reflect.jvm.internal.impl.types.t1 r5 = r10.H0()
            boolean r6 = r10.J0()
            kotlin.reflect.jvm.internal.impl.types.checker.i r1 = new kotlin.reflect.jvm.internal.impl.types.checker.i
            r7 = 0
            r8 = 32
            r9 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k r() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r0 = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.CAPTURED_TYPE_SCOPE
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 1
            kotlin.reflect.jvm.internal.impl.types.error.f r0 = kotlin.reflect.jvm.internal.impl.types.error.i.a(r0, r2, r1)
            return r0
    }
}
