package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.4")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypeParameterReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterReference.kt\nkotlin/jvm/internal/TypeParameterReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class v0 implements kotlin.reflect.s {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.jvm.internal.v0.a f = null;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Object a;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.KVariance c;
    private final boolean d;

    @org.jetbrains.annotations.Nullable
    private volatile java.util.List<? extends kotlin.reflect.r> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.jvm.internal.v0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0021a {
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
                    kotlin.jvm.internal.v0.a.C0021a.a = r0
                    return
            }
        }

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

        @org.jetbrains.annotations.NotNull
        public final java.lang.String a(@org.jetbrains.annotations.NotNull kotlin.reflect.s r4) {
                r3 = this;
                java.lang.String r0 = "typeParameter"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                kotlin.reflect.KVariance r1 = r4.l()
                int[] r2 = kotlin.jvm.internal.v0.a.C0021a.a
                int r1 = r1.ordinal()
                r1 = r2[r1]
                r2 = 1
                if (r1 == r2) goto L31
                r2 = 2
                if (r1 == r2) goto L2b
                r2 = 3
                if (r1 != r2) goto L25
                java.lang.String r1 = "out "
                r0.append(r1)
                goto L33
            L25:
                kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
                r4.<init>()
                throw r4
            L2b:
                java.lang.String r1 = "in "
                r0.append(r1)
                goto L33
            L31:
                kotlin.n1 r1 = kotlin.n1.a
            L33:
                java.lang.String r4 = r4.getName()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                return r4
        }
    }

    static {
            kotlin.jvm.internal.v0$a r0 = new kotlin.jvm.internal.v0$a
            r1 = 0
            r0.<init>(r1)
            kotlin.jvm.internal.v0.f = r0
            return
    }

    public v0(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.reflect.KVariance r4, boolean r5) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "variance"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            return
    }

    public static /* synthetic */ void a() {
            return
    }

    public final void b(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.r> r3) {
            r2 = this;
            java.lang.String r0 = "upperBounds"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.List<? extends kotlin.reflect.r> r0 = r2.e
            if (r0 != 0) goto Lc
            r2.e = r3
            return
        Lc:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Upper bounds of type parameter '"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "' have already been initialized."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.jvm.internal.v0
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.a
            kotlin.jvm.internal.v0 r3 = (kotlin.jvm.internal.v0) r3
            java.lang.Object r1 = r3.a
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L20
            java.lang.String r0 = r2.getName()
            java.lang.String r3 = r3.getName()
            boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
            if (r3 == 0) goto L20
            r3 = 1
            return r3
        L20:
            r3 = 0
            return r3
    }

    @Override // kotlin.reflect.s
    @org.jetbrains.annotations.NotNull
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    @Override // kotlin.reflect.s
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.r> getUpperBounds() {
            r1 = this;
            java.util.List<? extends kotlin.reflect.r> r0 = r1.e
            if (r0 != 0) goto L10
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            kotlin.reflect.r r0 = kotlin.jvm.internal.o0.n(r0)
            java.util.List r0 = kotlin.collections.f0.l(r0)
            r1.e = r0
        L10:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.a
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            int r0 = r0 * 31
            java.lang.String r1 = r2.getName()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.reflect.s
    public boolean j() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    @Override // kotlin.reflect.s
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.KVariance l() {
            r1 = this;
            kotlin.reflect.KVariance r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            kotlin.jvm.internal.v0$a r0 = kotlin.jvm.internal.v0.f
            java.lang.String r0 = r0.a(r1)
            return r0
    }
}
