package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.4")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class x0 implements kotlin.reflect.r {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.jvm.internal.x0.a e = null;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 4;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.g a;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.t> b;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.r c;
    private final int d;

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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlin.reflect.KVariance[] r0 = kotlin.reflect.KVariance.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.INVARIANT     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.IN     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.OUT     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.jvm.internal.x0.b.a = r0
                return
        }
    }

    static {
            kotlin.jvm.internal.x0$a r0 = new kotlin.jvm.internal.x0$a
            r1 = 0
            r0.<init>(r1)
            kotlin.jvm.internal.x0.e = r0
            return
    }

    @kotlin.SinceKotlin(version = "1.6")
    public x0(@org.jetbrains.annotations.NotNull kotlin.reflect.g r2, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.t> r3, @org.jetbrains.annotations.Nullable kotlin.reflect.r r4, int r5) {
            r1 = this;
            java.lang.String r0 = "classifier"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "arguments"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            return
    }

    public x0(@org.jetbrains.annotations.NotNull kotlin.reflect.g r2, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.t> r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "classifier"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "arguments"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public static /* synthetic */ java.lang.CharSequence c(kotlin.jvm.internal.x0 r0, kotlin.reflect.t r1) {
            java.lang.CharSequence r0 = g(r0, r1)
            return r0
    }

    private final java.lang.String d(kotlin.reflect.t r4) {
            r3 = this;
            kotlin.reflect.KVariance r0 = r4.g()
            if (r0 != 0) goto L9
            java.lang.String r4 = "*"
            return r4
        L9:
            kotlin.reflect.r r0 = r4.getType()
            boolean r1 = r0 instanceof kotlin.jvm.internal.x0
            if (r1 == 0) goto L14
            kotlin.jvm.internal.x0 r0 = (kotlin.jvm.internal.x0) r0
            goto L15
        L14:
            r0 = 0
        L15:
            r1 = 1
            if (r0 == 0) goto L1e
            java.lang.String r0 = r0.e(r1)
            if (r0 != 0) goto L26
        L1e:
            kotlin.reflect.r r0 = r4.getType()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L26:
            kotlin.reflect.KVariance r4 = r4.g()
            int[] r2 = kotlin.jvm.internal.x0.b.a
            int r4 = r4.ordinal()
            r4 = r2[r4]
            if (r4 == r1) goto L64
            r1 = 2
            if (r4 == r1) goto L52
            r1 = 3
            if (r4 != r1) goto L4c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "out "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
        L4c:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L52:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "in "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
        L64:
            return r0
    }

    private final java.lang.String e(boolean r12) {
            r11 = this;
            kotlin.reflect.g r0 = r11.n()
            boolean r1 = r0 instanceof kotlin.reflect.d
            r2 = 0
            if (r1 == 0) goto Lc
            kotlin.reflect.d r0 = (kotlin.reflect.d) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L13
            java.lang.Class r2 = k3.a.e(r0)
        L13:
            if (r2 != 0) goto L1e
            kotlin.reflect.g r12 = r11.n()
            java.lang.String r12 = r12.toString()
            goto L52
        L1e:
            int r0 = r11.d
            r0 = r0 & 4
            if (r0 == 0) goto L27
            java.lang.String r12 = "kotlin.Nothing"
            goto L52
        L27:
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L32
            java.lang.String r12 = r11.j(r2)
            goto L52
        L32:
            if (r12 == 0) goto L4e
            boolean r12 = r2.isPrimitive()
            if (r12 == 0) goto L4e
            kotlin.reflect.g r12 = r11.n()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.reflect.KClass<*>"
            kotlin.jvm.internal.g0.n(r12, r0)
            kotlin.reflect.d r12 = (kotlin.reflect.d) r12
            java.lang.Class r12 = k3.a.g(r12)
            java.lang.String r12 = r12.getName()
            goto L52
        L4e:
            java.lang.String r12 = r2.getName()
        L52:
            java.util.List r0 = r11.getArguments()
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = ""
            if (r0 == 0) goto L60
            r0 = r1
            goto L7b
        L60:
            java.util.List r0 = r11.getArguments()
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.jvm.internal.w0 r8 = new kotlin.jvm.internal.w0
            r8.<init>(r11)
            r9 = 24
            r10 = 0
            java.lang.String r3 = ", "
            java.lang.String r4 = "<"
            java.lang.String r5 = ">"
            r6 = 0
            r7 = 0
            java.lang.String r0 = kotlin.collections.f0.r3(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L7b:
            boolean r2 = r11.q()
            if (r2 == 0) goto L83
            java.lang.String r1 = "?"
        L83:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r12 = r2.toString()
            kotlin.reflect.r r0 = r11.c
            boolean r1 = r0 instanceof kotlin.jvm.internal.x0
            if (r1 == 0) goto Lf0
            kotlin.jvm.internal.x0 r0 = (kotlin.jvm.internal.x0) r0
            r1 = 1
            java.lang.String r0 = r0.e(r1)
            boolean r1 = kotlin.jvm.internal.g0.g(r0, r12)
            if (r1 == 0) goto La9
            goto Lf0
        La9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            r2 = 63
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r1 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r1 == 0) goto Ld2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r12 = 33
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            return r12
        Ld2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 40
            r1.append(r2)
            r1.append(r12)
            java.lang.String r12 = ".."
            r1.append(r12)
            r1.append(r0)
            r12 = 41
            r1.append(r12)
            java.lang.String r12 = r1.toString()
        Lf0:
            return r12
    }

    private static final java.lang.CharSequence g(kotlin.jvm.internal.x0 r1, kotlin.reflect.t r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r1 = r1.d(r2)
            return r1
    }

    private final java.lang.String j(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class<boolean[]> r0 = boolean[].class
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r0 == 0) goto Lb
            java.lang.String r2 = "kotlin.BooleanArray"
            return r2
        Lb:
            java.lang.Class<char[]> r0 = char[].class
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r0 == 0) goto L16
            java.lang.String r2 = "kotlin.CharArray"
            return r2
        L16:
            java.lang.Class<byte[]> r0 = byte[].class
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r0 == 0) goto L21
            java.lang.String r2 = "kotlin.ByteArray"
            return r2
        L21:
            java.lang.Class<short[]> r0 = short[].class
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r0 == 0) goto L2c
            java.lang.String r2 = "kotlin.ShortArray"
            return r2
        L2c:
            java.lang.Class<int[]> r0 = int[].class
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r0 == 0) goto L37
            java.lang.String r2 = "kotlin.IntArray"
            return r2
        L37:
            java.lang.Class<float[]> r0 = float[].class
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r0 == 0) goto L42
            java.lang.String r2 = "kotlin.FloatArray"
            return r2
        L42:
            java.lang.Class<long[]> r0 = long[].class
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r0 == 0) goto L4d
            java.lang.String r2 = "kotlin.LongArray"
            return r2
        L4d:
            java.lang.Class<double[]> r0 = double[].class
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r2 == 0) goto L58
            java.lang.String r2 = "kotlin.DoubleArray"
            return r2
        L58:
            java.lang.String r2 = "kotlin.Array"
            return r2
    }

    @kotlin.SinceKotlin(version = "1.6")
    public static /* synthetic */ void r() {
            return
    }

    @kotlin.SinceKotlin(version = "1.6")
    public static /* synthetic */ void t() {
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.jvm.internal.x0
            if (r0 == 0) goto L34
            kotlin.reflect.g r0 = r2.n()
            kotlin.jvm.internal.x0 r3 = (kotlin.jvm.internal.x0) r3
            kotlin.reflect.g r1 = r3.n()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L34
            java.util.List r0 = r2.getArguments()
            java.util.List r1 = r3.getArguments()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L34
            kotlin.reflect.r r0 = r2.c
            kotlin.reflect.r r1 = r3.c
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L34
            int r0 = r2.d
            int r3 = r3.d
            if (r0 != r3) goto L34
            r3 = 1
            return r3
        L34:
            r3 = 0
            return r3
    }

    @Override // kotlin.reflect.b
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
            r1 = this;
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
    }

    @Override // kotlin.reflect.r
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.t> getArguments() {
            r1 = this;
            java.util.List<kotlin.reflect.t> r0 = r1.b
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.g r0 = r2.n()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List r1 = r2.getArguments()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.d
            int r0 = r0 + r1
            return r0
    }

    public final int l() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    @Override // kotlin.reflect.r
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.g n() {
            r1 = this;
            kotlin.reflect.g r0 = r1.a
            return r0
    }

    @Override // kotlin.reflect.r
    public boolean q() {
            r2 = this;
            int r0 = r2.d
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L7
            return r1
        L7:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.r s() {
            r1 = this;
            kotlin.reflect.r r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.lang.String r1 = r2.e(r1)
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
