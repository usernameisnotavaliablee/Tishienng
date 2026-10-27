package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.9")
@kotlin.WasExperimental(markerClass = {kotlin.time.ExperimentalTime.class})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface e0 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.time.e0.a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        static final /* synthetic */ kotlin.time.e0.a a = null;

        static {
                kotlin.time.e0$a r0 = new kotlin.time.e0$a
                r0.<init>()
                kotlin.time.e0.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements kotlin.time.e0.c {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.time.e0.b b = null;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.SinceKotlin(version = "1.9")
        @kotlin.jvm.JvmInline
        @kotlin.WasExperimental(markerClass = {kotlin.time.ExperimentalTime.class})
        public static final class a implements kotlin.time.g {
            private final long a;

            private /* synthetic */ a(long r1) {
                    r0 = this;
                    r0.<init>()
                    r0.a = r1
                    return
            }

            public static final /* synthetic */ kotlin.time.e0.b.a d(long r1) {
                    kotlin.time.e0$b$a r0 = new kotlin.time.e0$b$a
                    r0.<init>(r1)
                    return r0
            }

            public static final int h(long r0, long r2) {
                    long r0 = q(r0, r2)
                    kotlin.time.h$a r2 = kotlin.time.h.b
                    long r2 = r2.T()
                    int r0 = kotlin.time.h.k(r0, r2)
                    return r0
            }

            public static int i(long r1, @org.jetbrains.annotations.NotNull kotlin.time.g r3) {
                    java.lang.String r0 = "other"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    kotlin.time.e0$b$a r1 = d(r1)
                    int r1 = r1.N(r3)
                    return r1
            }

            public static long j(long r0) {
                    return r0
            }

            public static long k(long r1) {
                    kotlin.time.b0 r0 = kotlin.time.b0.b
                    long r1 = r0.d(r1)
                    return r1
            }

            public static boolean l(long r4, java.lang.Object r6) {
                    boolean r0 = r6 instanceof kotlin.time.e0.b.a
                    r1 = 0
                    if (r0 != 0) goto L6
                    return r1
                L6:
                    kotlin.time.e0$b$a r6 = (kotlin.time.e0.b.a) r6
                    long r2 = r6.x()
                    int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                    if (r6 == 0) goto L11
                    return r1
                L11:
                    r4 = 1
                    return r4
            }

            public static final boolean m(long r1, long r3) {
                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r0 != 0) goto L6
                    r1 = 1
                    return r1
                L6:
                    r1 = 0
                    return r1
            }

            public static boolean n(long r0) {
                    long r0 = k(r0)
                    boolean r0 = kotlin.time.h.V(r0)
                    return r0
            }

            public static boolean o(long r0) {
                    long r0 = k(r0)
                    boolean r0 = kotlin.time.h.V(r0)
                    r0 = r0 ^ 1
                    return r0
            }

            public static int p(long r0) {
                    int r0 = androidx.camera.camera2.internal.compat.params.e.a(r0)
                    return r0
            }

            public static final long q(long r1, long r3) {
                    kotlin.time.b0 r0 = kotlin.time.b0.b
                    long r1 = r0.c(r1, r3)
                    return r1
            }

            public static long s(long r1, long r3) {
                    kotlin.time.b0 r0 = kotlin.time.b0.b
                    long r3 = kotlin.time.h.n0(r3)
                    long r1 = r0.b(r1, r3)
                    return r1
            }

            public static long t(long r3, @org.jetbrains.annotations.NotNull kotlin.time.g r5) {
                    java.lang.String r0 = "other"
                    kotlin.jvm.internal.g0.p(r5, r0)
                    boolean r0 = r5 instanceof kotlin.time.e0.b.a
                    if (r0 == 0) goto L14
                    kotlin.time.e0$b$a r5 = (kotlin.time.e0.b.a) r5
                    long r0 = r5.x()
                    long r3 = q(r3, r0)
                    return r3
                L14:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Subtracting or comparing time marks from different time sources is not possible: "
                    r1.append(r2)
                    java.lang.String r3 = w(r3)
                    r1.append(r3)
                    java.lang.String r3 = " and "
                    r1.append(r3)
                    r1.append(r5)
                    java.lang.String r3 = r1.toString()
                    r0.<init>(r3)
                    throw r0
            }

            public static long v(long r1, long r3) {
                    kotlin.time.b0 r0 = kotlin.time.b0.b
                    long r1 = r0.b(r1, r3)
                    return r1
            }

            public static java.lang.String w(long r2) {
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "ValueTimeMark(reading="
                    r0.append(r1)
                    r0.append(r2)
                    r2 = 41
                    r0.append(r2)
                    java.lang.String r2 = r0.toString()
                    return r2
            }

            @Override // kotlin.time.g
            public /* bridge */ int N(@org.jetbrains.annotations.NotNull kotlin.time.g r1) {
                    r0 = this;
                    int r1 = kotlin.time.g.a.a(r0, r1)
                    return r1
            }

            @Override // kotlin.time.d0
            public long a() {
                    r2 = this;
                    long r0 = r2.a
                    long r0 = k(r0)
                    return r0
            }

            @Override // kotlin.time.d0
            public boolean b() {
                    r2 = this;
                    long r0 = r2.a
                    boolean r0 = n(r0)
                    return r0
            }

            @Override // kotlin.time.d0
            public boolean c() {
                    r2 = this;
                    long r0 = r2.a
                    boolean r0 = o(r0)
                    return r0
            }

            @Override // java.lang.Comparable
            public /* bridge */ /* synthetic */ int compareTo(kotlin.time.g r1) {
                    r0 = this;
                    kotlin.time.g r1 = (kotlin.time.g) r1
                    int r1 = r0.N(r1)
                    return r1
            }

            @Override // kotlin.time.d0
            public /* bridge */ /* synthetic */ kotlin.time.d0 e(long r1) {
                    r0 = this;
                    long r1 = r0.u(r1)
                    kotlin.time.e0$b$a r1 = d(r1)
                    return r1
            }

            @Override // kotlin.time.g, kotlin.time.d0
            public /* bridge */ /* synthetic */ kotlin.time.g e(long r1) {
                    r0 = this;
                    long r1 = r0.u(r1)
                    kotlin.time.e0$b$a r1 = d(r1)
                    return r1
            }

            @Override // kotlin.time.g
            public boolean equals(java.lang.Object r3) {
                    r2 = this;
                    long r0 = r2.a
                    boolean r3 = l(r0, r3)
                    return r3
            }

            @Override // kotlin.time.d0
            public /* bridge */ /* synthetic */ kotlin.time.d0 f(long r1) {
                    r0 = this;
                    long r1 = r0.r(r1)
                    kotlin.time.e0$b$a r1 = d(r1)
                    return r1
            }

            @Override // kotlin.time.g, kotlin.time.d0
            public /* bridge */ /* synthetic */ kotlin.time.g f(long r1) {
                    r0 = this;
                    long r1 = r0.r(r1)
                    kotlin.time.e0$b$a r1 = d(r1)
                    return r1
            }

            @Override // kotlin.time.g
            public long g(@org.jetbrains.annotations.NotNull kotlin.time.g r3) {
                    r2 = this;
                    java.lang.String r0 = "other"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    long r0 = r2.a
                    long r0 = t(r0, r3)
                    return r0
            }

            @Override // kotlin.time.g
            public int hashCode() {
                    r2 = this;
                    long r0 = r2.a
                    int r0 = p(r0)
                    return r0
            }

            public long r(long r3) {
                    r2 = this;
                    long r0 = r2.a
                    long r3 = s(r0, r3)
                    return r3
            }

            public java.lang.String toString() {
                    r2 = this;
                    long r0 = r2.a
                    java.lang.String r0 = w(r0)
                    return r0
            }

            public long u(long r3) {
                    r2 = this;
                    long r0 = r2.a
                    long r3 = v(r0, r3)
                    return r3
            }

            public final /* synthetic */ long x() {
                    r2 = this;
                    long r0 = r2.a
                    return r0
            }
        }

        static {
                kotlin.time.e0$b r0 = new kotlin.time.e0$b
                r0.<init>()
                kotlin.time.e0.b.b = r0
                return
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.time.e0
        public /* bridge */ /* synthetic */ kotlin.time.d0 a() {
                r2 = this;
                long r0 = r2.b()
                kotlin.time.e0$b$a r0 = kotlin.time.e0.b.a.d(r0)
                return r0
        }

        @Override // kotlin.time.e0.c, kotlin.time.e0
        public /* bridge */ /* synthetic */ kotlin.time.g a() {
                r2 = this;
                long r0 = r2.b()
                kotlin.time.e0$b$a r0 = kotlin.time.e0.b.a.d(r0)
                return r0
        }

        public long b() {
                r2 = this;
                kotlin.time.b0 r0 = kotlin.time.b0.b
                long r0 = r0.e()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r1 = this;
                kotlin.time.b0 r0 = kotlin.time.b0.b
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.SinceKotlin(version = "1.9")
    @kotlin.WasExperimental(markerClass = {kotlin.time.ExperimentalTime.class})
    public interface c extends kotlin.time.e0 {
        @Override // kotlin.time.e0
        @org.jetbrains.annotations.NotNull
        kotlin.time.g a();
    }

    static {
            kotlin.time.e0$a r0 = kotlin.time.e0.a.a
            kotlin.time.e0.a = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    kotlin.time.d0 a();
}
