package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a extends kotlin.reflect.jvm.internal.impl.types.e1 implements d4.b {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.c2 b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b c;
    private final boolean d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.t1 e;

    public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.c2 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b r3, boolean r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r5) {
            r1 = this;
            java.lang.String r0 = "typeProjection"
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
            return
    }

    public /* synthetic */ a(kotlin.reflect.jvm.internal.impl.types.c2 r1, kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b r2, boolean r3, kotlin.reflect.jvm.internal.impl.types.t1 r4, int r5, kotlin.jvm.internal.v r6) {
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L9
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c r2 = new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c
            r2.<init>(r1)
        L9:
            r6 = r5 & 4
            if (r6 == 0) goto Le
            r3 = 0
        Le:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            kotlin.reflect.jvm.internal.impl.types.t1$a r4 = kotlin.reflect.jvm.internal.impl.types.t1.b
            kotlin.reflect.jvm.internal.impl.types.t1 r4 = r4.k()
        L18:
            r0.<init>(r1, r2, r3, r4)
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
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b r0 = r1.R0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    public boolean J0() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 K0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a r1 = r0.T0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 M0(boolean r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a r1 = r0.S0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 N0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a r1 = r0.T0(r1)
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
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a r1 = r0.S0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.e1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 Q0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r5) {
            r4 = this;
            java.lang.String r0 = "newAttributes"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a r0 = new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = r4.b
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b r2 = r4.R0()
            boolean r3 = r4.J0()
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b R0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a S0(boolean r5) {
            r4 = this;
            boolean r0 = r4.J0()
            if (r5 != r0) goto L7
            return r4
        L7:
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a r0 = new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = r4.b
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b r2 = r4.R0()
            kotlin.reflect.jvm.internal.impl.types.t1 r3 = r4.H0()
            r0.<init>(r1, r2, r5, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a T0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r5) {
            r4 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a r0 = new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = r4.b
            kotlin.reflect.jvm.internal.impl.types.c2 r5 = r1.a(r5)
            java.lang.String r1 = "refine(...)"
            kotlin.jvm.internal.g0.o(r5, r1)
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b r1 = r4.R0()
            boolean r2 = r4.J0()
            kotlin.reflect.jvm.internal.impl.types.t1 r3 = r4.H0()
            r0.<init>(r5, r1, r2, r3)
            return r0
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

    @Override // kotlin.reflect.jvm.internal.impl.types.e1
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Captured("
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = r2.b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            boolean r1 = r2.J0()
            if (r1 == 0) goto L1d
            java.lang.String r1 = "?"
            goto L1f
        L1d:
            java.lang.String r1 = ""
        L1f:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
