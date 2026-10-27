package kotlin.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.1")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class t {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.t.a c = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.t d = null;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.KVariance a;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.r b;

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

        @kotlin.PublishedApi
        public static /* synthetic */ void d() {
                return
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.t a(@org.jetbrains.annotations.NotNull kotlin.reflect.r r3) {
                r2 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.t r0 = new kotlin.reflect.t
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.IN
                r0.<init>(r1, r3)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.t b(@org.jetbrains.annotations.NotNull kotlin.reflect.r r3) {
                r2 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.t r0 = new kotlin.reflect.t
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.OUT
                r0.<init>(r1, r3)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.t c() {
                r1 = this;
                kotlin.reflect.t r0 = kotlin.reflect.t.d
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.t e(@org.jetbrains.annotations.NotNull kotlin.reflect.r r3) {
                r2 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.g0.p(r3, r0)
                kotlin.reflect.t r0 = new kotlin.reflect.t
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.INVARIANT
                r0.<init>(r1, r3)
                return r0
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
                kotlin.reflect.t.b.a = r0
                return
        }
    }

    static {
            kotlin.reflect.t$a r0 = new kotlin.reflect.t$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.t.c = r0
            kotlin.reflect.t r0 = new kotlin.reflect.t
            r0.<init>(r1, r1)
            kotlin.reflect.t.d = r0
            return
    }

    public t(@org.jetbrains.annotations.Nullable kotlin.reflect.KVariance r4, @org.jetbrains.annotations.Nullable kotlin.reflect.r r5) {
            r3 = this;
            r3.<init>()
            r3.a = r4
            r3.b = r5
            r0 = 0
            r1 = 1
            if (r4 != 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r5 != 0) goto L11
            r0 = 1
        L11:
            if (r2 != r0) goto L14
            return
        L14:
            if (r4 != 0) goto L19
            java.lang.String r4 = "Star projection must have no type specified."
            goto L2f
        L19:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "The projection variance "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = " requires type to be specified."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
        L2f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.t c(@org.jetbrains.annotations.NotNull kotlin.reflect.r r1) {
            kotlin.reflect.t$a r0 = kotlin.reflect.t.c
            kotlin.reflect.t r1 = r0.a(r1)
            return r1
    }

    public static /* synthetic */ kotlin.reflect.t e(kotlin.reflect.t r0, kotlin.reflect.KVariance r1, kotlin.reflect.r r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            kotlin.reflect.KVariance r1 = r0.a
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            kotlin.reflect.r r2 = r0.b
        Lc:
            kotlin.reflect.t r0 = r0.d(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.t f(@org.jetbrains.annotations.NotNull kotlin.reflect.r r1) {
            kotlin.reflect.t$a r0 = kotlin.reflect.t.c
            kotlin.reflect.t r1 = r0.b(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.t h(@org.jetbrains.annotations.NotNull kotlin.reflect.r r1) {
            kotlin.reflect.t$a r0 = kotlin.reflect.t.c
            kotlin.reflect.t r1 = r0.e(r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.KVariance a() {
            r1 = this;
            kotlin.reflect.KVariance r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.r b() {
            r1 = this;
            kotlin.reflect.r r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.t d(@org.jetbrains.annotations.Nullable kotlin.reflect.KVariance r2, @org.jetbrains.annotations.Nullable kotlin.reflect.r r3) {
            r1 = this;
            kotlin.reflect.t r0 = new kotlin.reflect.t
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.t
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.t r5 = (kotlin.reflect.t) r5
            kotlin.reflect.KVariance r1 = r4.a
            kotlin.reflect.KVariance r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            kotlin.reflect.r r1 = r4.b
            kotlin.reflect.r r5 = r5.b
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.KVariance g() {
            r1 = this;
            kotlin.reflect.KVariance r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.r getType() {
            r1 = this;
            kotlin.reflect.r r0 = r1.b
            return r0
    }

    public int hashCode() {
            r3 = this;
            kotlin.reflect.KVariance r0 = r3.a
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            kotlin.reflect.r r2 = r3.b
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r1 = r2.hashCode()
        L16:
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            kotlin.reflect.KVariance r0 = r3.a
            r1 = -1
            if (r0 != 0) goto L7
            r0 = -1
            goto Lf
        L7:
            int[] r2 = kotlin.reflect.t.b.a
            int r0 = r0.ordinal()
            r0 = r2[r0]
        Lf:
            if (r0 == r1) goto L4f
            r1 = 1
            if (r0 == r1) goto L48
            r1 = 2
            if (r0 == r1) goto L34
            r1 = 3
            if (r0 != r1) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "out "
            r0.append(r1)
            kotlin.reflect.r r1 = r3.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L2e:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "in "
            r0.append(r1)
            kotlin.reflect.r r1 = r3.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L48:
            kotlin.reflect.r r0 = r3.b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L4f:
            java.lang.String r0 = "*"
            return r0
    }
}
