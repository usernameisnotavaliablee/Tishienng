package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class f1 extends kotlin.reflect.jvm.internal.impl.types.e1 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.w1 b;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> c;
    private final boolean d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.k e;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.checker.g, kotlin.reflect.jvm.internal.impl.types.e1> f;

    public f1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.w1 r2, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.c2> r3, boolean r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.k r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.checker.g, ? extends kotlin.reflect.jvm.internal.impl.types.e1> r6) {
            r1 = this;
            java.lang.String r0 = "constructor"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "arguments"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "memberScope"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "refinedTypeFactory"
            kotlin.jvm.internal.g0.p(r6, r0)
            r1.<init>()
            r1.b = r2
            r1.c = r3
            r1.d = r4
            r1.e = r5
            r1.f = r6
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r1.r()
            boolean r2 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.error.f
            if (r2 == 0) goto L59
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r1.r()
            boolean r2 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.error.j
            if (r2 == 0) goto L32
            goto L59
        L32:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "SimpleTypeImpl should not be created for error type: "
            r3.append(r4)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r4 = r1.r()
            r3.append(r4)
            r4 = 10
            r3.append(r4)
            kotlin.reflect.jvm.internal.impl.types.w1 r4 = r1.I0()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L59:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> G0() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> r0 = r1.c
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
            boolean r0 = r1.d
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 K0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.R0(r1)
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
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.R0(r1)
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
    public kotlin.reflect.jvm.internal.impl.types.e1 P0(boolean r2) {
            r1 = this;
            boolean r0 = r1.J0()
            if (r2 != r0) goto L7
            return r1
        L7:
            if (r2 == 0) goto Lf
            kotlin.reflect.jvm.internal.impl.types.c1 r2 = new kotlin.reflect.jvm.internal.impl.types.c1
            r2.<init>(r1)
            return r2
        Lf:
            kotlin.reflect.jvm.internal.impl.types.a1 r2 = new kotlin.reflect.jvm.internal.impl.types.a1
            r2.<init>(r1)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.e1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 Q0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r2) {
            r1 = this;
            java.lang.String r0 = "newAttributes"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lc
            return r1
        Lc:
            kotlin.reflect.jvm.internal.impl.types.g1 r0 = new kotlin.reflect.jvm.internal.impl.types.g1
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 R0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r2) {
            r1 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.checker.g, kotlin.reflect.jvm.internal.impl.types.e1> r0 = r1.f
            java.lang.Object r2 = r0.invoke(r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = (kotlin.reflect.jvm.internal.impl.types.e1) r2
            if (r2 != 0) goto L10
            return r1
        L10:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k r() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.e
            return r0
    }
}
