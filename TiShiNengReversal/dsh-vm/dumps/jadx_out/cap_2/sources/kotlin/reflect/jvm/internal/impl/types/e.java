package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class e extends kotlin.reflect.jvm.internal.impl.types.e1 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.e.a e = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.checker.r b;
    private final boolean c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.k d;

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
            kotlin.reflect.jvm.internal.impl.types.e$a r0 = new kotlin.reflect.jvm.internal.impl.types.e$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.e.e = r0
            return
    }

    public e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.r r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "originalTypeVariable"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.b = r2
            r1.c = r3
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r3 = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.STUB_TYPE_SCOPE
            java.lang.String r2 = r2.toString()
            java.lang.String[] r2 = new java.lang.String[]{r2}
            kotlin.reflect.jvm.internal.impl.types.error.f r2 = kotlin.reflect.jvm.internal.impl.types.error.i.b(r3, r2)
            r1.d = r2
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
            kotlin.reflect.jvm.internal.impl.types.t1$a r0 = kotlin.reflect.jvm.internal.impl.types.t1.b
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = r0.k()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    public boolean J0() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 K0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.e r1 = r0.T0(r1)
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
            kotlin.reflect.jvm.internal.impl.types.e r1 = r0.T0(r1)
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
            kotlin.reflect.jvm.internal.impl.types.e r2 = r1.S0(r2)
            return r2
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
    public final kotlin.reflect.jvm.internal.impl.types.checker.r R0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.checker.r r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.types.e S0(boolean r1);

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e T0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r2) {
            r1 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r2, r0)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k r() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.d
            return r0
    }
}
