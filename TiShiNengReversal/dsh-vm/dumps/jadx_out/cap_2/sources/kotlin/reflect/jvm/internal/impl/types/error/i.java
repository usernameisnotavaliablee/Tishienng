package kotlin.reflect.jvm.internal.impl.types.error;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.error.i a = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.descriptors.f0 b = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.types.error.a c = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.types.t0 d = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.types.t0 e = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.descriptors.w0 f = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.w0> g = null;

    static {
            kotlin.reflect.jvm.internal.impl.types.error.i r0 = new kotlin.reflect.jvm.internal.impl.types.error.i
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.types.error.i.a = r0
            kotlin.reflect.jvm.internal.impl.types.error.d r0 = kotlin.reflect.jvm.internal.impl.types.error.d.a
            kotlin.reflect.jvm.internal.impl.types.error.i.b = r0
            kotlin.reflect.jvm.internal.impl.types.error.a r0 = new kotlin.reflect.jvm.internal.impl.types.error.a
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_CLASS
            java.lang.String r1 = r1.getDebugText()
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            java.lang.String r5 = "unknown class"
            r3[r4] = r5
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2)
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.String r2 = "format(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.name.f.k(r1)
            java.lang.String r2 = "special(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.error.i.c = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r0 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.CYCLIC_SUPERTYPES
            java.lang.String[] r1 = new java.lang.String[r4]
            kotlin.reflect.jvm.internal.impl.types.error.g r0 = d(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.error.i.d = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r0 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.ERROR_PROPERTY_TYPE
            java.lang.String[] r1 = new java.lang.String[r4]
            kotlin.reflect.jvm.internal.impl.types.error.g r0 = d(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.error.i.e = r0
            kotlin.reflect.jvm.internal.impl.types.error.e r0 = new kotlin.reflect.jvm.internal.impl.types.error.e
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.types.error.i.f = r0
            java.util.Set r0 = kotlin.collections.u1.f(r0)
            kotlin.reflect.jvm.internal.impl.types.error.i.g = r0
            return
    }

    private i() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.error.f a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r1, boolean r2, @org.jetbrains.annotations.NotNull java.lang.String... r3) {
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "formatParams"
            kotlin.jvm.internal.g0.p(r3, r0)
            if (r2 == 0) goto L19
            kotlin.reflect.jvm.internal.impl.types.error.j r2 = new kotlin.reflect.jvm.internal.impl.types.error.j
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r2.<init>(r1, r3)
            return r2
        L19:
            kotlin.reflect.jvm.internal.impl.types.error.f r2 = new kotlin.reflect.jvm.internal.impl.types.error.f
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r2.<init>(r1, r3)
            return r2
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.error.f b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r1, @org.jetbrains.annotations.NotNull java.lang.String... r2) {
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "formatParams"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0 = 0
            kotlin.reflect.jvm.internal.impl.types.error.f r1 = a(r1, r0, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.error.g d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r3, @org.jetbrains.annotations.NotNull java.lang.String... r4) {
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "formatParams"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.types.error.i r0 = kotlin.reflect.jvm.internal.impl.types.error.i.a
            java.util.List r1 = kotlin.collections.f0.J()
            int r2 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r2)
            java.lang.String[] r4 = (java.lang.String[]) r4
            kotlin.reflect.jvm.internal.impl.types.error.g r3 = r0.g(r3, r1, r4)
            return r3
    }

    @kotlin.jvm.JvmStatic
    public static final boolean m(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
            if (r2 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.types.error.i r0 = kotlin.reflect.jvm.internal.impl.types.error.i.a
            boolean r1 = r0.n(r2)
            if (r1 != 0) goto L18
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r2.b()
            boolean r0 = r0.n(r1)
            if (r0 != 0) goto L18
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = kotlin.reflect.jvm.internal.impl.types.error.i.b
            if (r2 != r0) goto L1a
        L18:
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }

    private final boolean n(kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            r0 = this;
            boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.error.a
            return r1
    }

    @kotlin.jvm.JvmStatic
    public static final boolean o(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.I0()
            boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.error.h
            if (r1 == 0) goto L18
            kotlin.reflect.jvm.internal.impl.types.error.h r2 = (kotlin.reflect.jvm.internal.impl.types.error.h) r2
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r2 = r2.e()
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.UNINFERRED_TYPE_VARIABLE
            if (r2 != r1) goto L18
            r2 = 1
            return r2
        L18:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.error.g c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.w1 r4, @org.jetbrains.annotations.NotNull java.lang.String... r5) {
            r2 = this;
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "typeConstructor"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "formatParams"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.List r0 = kotlin.collections.f0.J()
            int r1 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)
            java.lang.String[] r5 = (java.lang.String[]) r5
            kotlin.reflect.jvm.internal.impl.types.error.g r3 = r2.f(r3, r0, r4, r5)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.error.h e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r3, @org.jetbrains.annotations.NotNull java.lang.String... r4) {
            r2 = this;
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "formatParams"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.types.error.h r0 = new kotlin.reflect.jvm.internal.impl.types.error.h
            int r1 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r0.<init>(r3, r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.error.g f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r9, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.c2> r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.w1 r11, @org.jetbrains.annotations.NotNull java.lang.String... r12) {
            r8 = this;
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "arguments"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "typeConstructor"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "formatParams"
            kotlin.jvm.internal.g0.p(r12, r0)
            kotlin.reflect.jvm.internal.impl.types.error.g r1 = new kotlin.reflect.jvm.internal.impl.types.error.g
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r0 = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.ERROR_TYPE_SCOPE
            java.lang.String r2 = r11.toString()
            java.lang.String[] r2 = new java.lang.String[]{r2}
            kotlin.reflect.jvm.internal.impl.types.error.f r3 = b(r0, r2)
            int r0 = r12.length
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r0)
            r7 = r12
            java.lang.String[] r7 = (java.lang.String[]) r7
            r6 = 0
            r4 = r9
            r5 = r10
            r2 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.error.g g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r3, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.c2> r4, @org.jetbrains.annotations.NotNull java.lang.String... r5) {
            r2 = this;
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "arguments"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "formatParams"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            kotlin.reflect.jvm.internal.impl.types.error.h r0 = r2.e(r3, r0)
            int r1 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)
            java.lang.String[] r5 = (java.lang.String[]) r5
            kotlin.reflect.jvm.internal.impl.types.error.g r3 = r2.f(r3, r4, r0, r5)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.error.a h() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.error.a r0 = kotlin.reflect.jvm.internal.impl.types.error.i.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.f0 i() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = kotlin.reflect.jvm.internal.impl.types.error.i.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.w0> j() {
            r1 = this;
            java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.w0> r0 = kotlin.reflect.jvm.internal.impl.types.error.i.g
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.t0 k() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = kotlin.reflect.jvm.internal.impl.types.error.i.e
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.t0 l() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = kotlin.reflect.jvm.internal.impl.types.error.i.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.typeUtil.e.A(r2)
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.I0()
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor"
            kotlin.jvm.internal.g0.n(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.error.h r2 = (kotlin.reflect.jvm.internal.impl.types.error.h) r2
            r0 = 0
            java.lang.String r2 = r2.f(r0)
            return r2
    }
}
