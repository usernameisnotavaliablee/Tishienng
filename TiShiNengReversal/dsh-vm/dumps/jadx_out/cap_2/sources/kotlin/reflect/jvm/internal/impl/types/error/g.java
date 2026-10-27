package kotlin.reflect.jvm.internal.impl.types.error;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g extends kotlin.reflect.jvm.internal.impl.types.e1 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.w1 b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.k c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind d;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> e;
    private final boolean f;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String[] g;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String h;

    @kotlin.jvm.JvmOverloads
    public g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.w1 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.k r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r4, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.c2> r5, boolean r6, @org.jetbrains.annotations.NotNull java.lang.String... r7) {
            r1 = this;
            java.lang.String r0 = "constructor"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "memberScope"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "arguments"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "formatParams"
            kotlin.jvm.internal.g0.p(r7, r0)
            r1.<init>()
            r1.b = r2
            r1.c = r3
            r1.d = r4
            r1.e = r5
            r1.f = r6
            r1.g = r7
            kotlin.jvm.internal.t0 r2 = kotlin.jvm.internal.t0.a
            java.lang.String r2 = r4.getDebugMessage()
            int r3 = r7.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r7, r3)
            int r4 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            java.lang.String r2 = java.lang.String.format(r2, r3)
            java.lang.String r3 = "format(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r1.h = r2
            return
    }

    public /* synthetic */ g(kotlin.reflect.jvm.internal.impl.types.w1 r8, kotlin.reflect.jvm.internal.impl.resolve.scopes.k r9, kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r10, java.util.List r11, boolean r12, java.lang.String[] r13, int r14, kotlin.jvm.internal.v r15) {
            r7 = this;
            r15 = r14 & 8
            if (r15 == 0) goto L8
            java.util.List r11 = kotlin.collections.f0.J()
        L8:
            r4 = r11
            r11 = r14 & 16
            if (r11 == 0) goto L15
            r12 = 0
            r5 = 0
        Lf:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r6 = r13
            goto L17
        L15:
            r5 = r12
            goto Lf
        L17:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> G0() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> r0 = r1.e
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t1 H0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t1$a r0 = kotlin.reflect.jvm.internal.impl.types.t1.b
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = r0.k()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.w1 I0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r1.b
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
            kotlin.reflect.jvm.internal.impl.types.error.g r1 = r0.T0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 M0(boolean r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.P0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 N0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.error.g r1 = r0.T0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 O0(kotlin.reflect.jvm.internal.impl.types.t1 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.Q0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.e1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 P0(boolean r8) {
            r7 = this;
            kotlin.reflect.jvm.internal.impl.types.error.g r0 = new kotlin.reflect.jvm.internal.impl.types.error.g
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r7.I0()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r7.r()
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r3 = r7.d
            java.util.List r4 = r7.G0()
            java.lang.String[] r5 = r7.g
            int r6 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)
            r6 = r5
            java.lang.String[] r6 = (java.lang.String[]) r6
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.e1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 Q0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r2) {
            r1 = this;
            java.lang.String r0 = "newAttributes"
            kotlin.jvm.internal.g0.p(r2, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String R0() {
            r1 = this;
            java.lang.String r0 = r1.h
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind S0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.error.g T0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r2) {
            r1 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r2, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.error.g U0(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.c2> r9) {
            r8 = this;
            java.lang.String r0 = "newArguments"
            kotlin.jvm.internal.g0.p(r9, r0)
            kotlin.reflect.jvm.internal.impl.types.error.g r1 = new kotlin.reflect.jvm.internal.impl.types.error.g
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r8.I0()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r3 = r8.r()
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r4 = r8.d
            boolean r6 = r8.J0()
            java.lang.String[] r0 = r8.g
            int r5 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            r7 = r0
            java.lang.String[] r7 = (java.lang.String[]) r7
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k r() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.c
            return r0
    }
}
