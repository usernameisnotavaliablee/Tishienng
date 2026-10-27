package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class z extends kotlin.reflect.jvm.internal.impl.types.b0 implements kotlin.reflect.jvm.internal.impl.types.x, d4.c {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.z.a d = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.e1 b;
    private final boolean c;

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

        private final boolean a(kotlin.reflect.jvm.internal.impl.types.m2 r2) {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.types.w1 r0 = r2.I0()
                boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.checker.r
                if (r0 != 0) goto L1f
                kotlin.reflect.jvm.internal.impl.types.w1 r0 = r2.I0()
                kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.c()
                boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
                if (r0 != 0) goto L1f
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.checker.i
                if (r0 != 0) goto L1f
                boolean r2 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.n1
                if (r2 == 0) goto L1d
                goto L1f
            L1d:
                r2 = 0
                return r2
            L1f:
                r2 = 1
                return r2
        }

        public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.z c(kotlin.reflect.jvm.internal.impl.types.z.a r1, kotlin.reflect.jvm.internal.impl.types.m2 r2, boolean r3, boolean r4, int r5, java.lang.Object r6) {
                r6 = r5 & 2
                r0 = 0
                if (r6 == 0) goto L6
                r3 = 0
            L6:
                r5 = r5 & 4
                if (r5 == 0) goto Lb
                r4 = 0
            Lb:
                kotlin.reflect.jvm.internal.impl.types.z r1 = r1.b(r2, r3, r4)
                return r1
        }

        private final boolean d(kotlin.reflect.jvm.internal.impl.types.m2 r3, boolean r4) {
                r2 = this;
                boolean r0 = r2.a(r3)
                if (r0 != 0) goto L8
                r3 = 0
                return r3
            L8:
                boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.n1
                if (r0 == 0) goto L11
                boolean r3 = kotlin.reflect.jvm.internal.impl.types.j2.l(r3)
                return r3
            L11:
                kotlin.reflect.jvm.internal.impl.types.w1 r0 = r3.I0()
                kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.c()
                boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.t0
                if (r1 == 0) goto L20
                kotlin.reflect.jvm.internal.impl.descriptors.impl.t0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.t0) r0
                goto L21
            L20:
                r0 = 0
            L21:
                r1 = 1
                if (r0 == 0) goto L2b
                boolean r0 = r0.O0()
                if (r0 != 0) goto L2b
                return r1
            L2b:
                if (r4 == 0) goto L3e
                kotlin.reflect.jvm.internal.impl.types.w1 r4 = r3.I0()
                kotlin.reflect.jvm.internal.impl.descriptors.f r4 = r4.c()
                boolean r4 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
                if (r4 == 0) goto L3e
                boolean r3 = kotlin.reflect.jvm.internal.impl.types.j2.l(r3)
                return r3
            L3e:
                kotlin.reflect.jvm.internal.impl.types.checker.s r4 = kotlin.reflect.jvm.internal.impl.types.checker.s.a
                boolean r3 = r4.a(r3)
                r3 = r3 ^ r1
                return r3
        }

        @kotlin.jvm.JvmOverloads
        @org.jetbrains.annotations.Nullable
        public final kotlin.reflect.jvm.internal.impl.types.z b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.m2 r3, boolean r4, boolean r5) {
                r2 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.g0.p(r3, r0)
                boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.z
                if (r0 == 0) goto Lc
                kotlin.reflect.jvm.internal.impl.types.z r3 = (kotlin.reflect.jvm.internal.impl.types.z) r3
                return r3
            Lc:
                r0 = 0
                if (r5 != 0) goto L17
                boolean r5 = r2.d(r3, r4)
                if (r5 == 0) goto L16
                goto L17
            L16:
                return r0
            L17:
                boolean r5 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.k0
                if (r5 == 0) goto L31
                r5 = r3
                kotlin.reflect.jvm.internal.impl.types.k0 r5 = (kotlin.reflect.jvm.internal.impl.types.k0) r5
                kotlin.reflect.jvm.internal.impl.types.e1 r1 = r5.Q0()
                kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
                kotlin.reflect.jvm.internal.impl.types.e1 r5 = r5.R0()
                kotlin.reflect.jvm.internal.impl.types.w1 r5 = r5.I0()
                kotlin.jvm.internal.g0.g(r1, r5)
            L31:
                kotlin.reflect.jvm.internal.impl.types.z r5 = new kotlin.reflect.jvm.internal.impl.types.z
                kotlin.reflect.jvm.internal.impl.types.e1 r3 = kotlin.reflect.jvm.internal.impl.types.n0.c(r3)
                r1 = 0
                kotlin.reflect.jvm.internal.impl.types.e1 r3 = r3.P0(r1)
                r5.<init>(r3, r4, r0)
                return r5
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.types.z$a r0 = new kotlin.reflect.jvm.internal.impl.types.z$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.z.d = r0
            return
    }

    private z(kotlin.reflect.jvm.internal.impl.types.e1 r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            return
    }

    public /* synthetic */ z(kotlin.reflect.jvm.internal.impl.types.e1 r1, boolean r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.x
    public boolean E0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.R0()
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.I0()
            boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.checker.r
            if (r0 != 0) goto L1f
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.R0()
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.c()
            boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = 0
            return r0
        L1f:
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
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.Q0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.e1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 P0(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.R0()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r0.P0(r2)
            return r2
        Lb:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.e1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 Q0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r3) {
            r2 = this;
            java.lang.String r0 = "newAttributes"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.types.z r0 = new kotlin.reflect.jvm.internal.impl.types.z
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.R0()
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r1.Q0(r3)
            boolean r1 = r2.c
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
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.b0 T0(kotlin.reflect.jvm.internal.impl.types.e1 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.z r1 = r0.V0(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.e1 U0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.z V0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r3) {
            r2 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.types.z r0 = new kotlin.reflect.jvm.internal.impl.types.z
            boolean r1 = r2.c
            r0.<init>(r3, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.x
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 p0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r1 = this;
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.m2 r2 = r2.L0()
            boolean r0 = r1.c
            kotlin.reflect.jvm.internal.impl.types.m2 r2 = kotlin.reflect.jvm.internal.impl.types.i1.e(r2, r0)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.e1
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.R0()
            r0.append(r1)
            java.lang.String r1 = " & Any"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
