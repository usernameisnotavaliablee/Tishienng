package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@kotlin.SinceKotlin(version = "1.3")
@kotlin.time.ExperimentalTime
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class a implements kotlin.time.e0.c {

    @org.jetbrains.annotations.NotNull
    private final kotlin.time.DurationUnit b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlin.time.a$a, reason: collision with other inner class name */
    private static final class C0081a implements kotlin.time.g {
        private final double a;

        @org.jetbrains.annotations.NotNull
        private final kotlin.time.a b;
        private final long c;

        private C0081a(double r2, kotlin.time.a r4, long r5) {
                r1 = this;
                java.lang.String r0 = "timeSource"
                kotlin.jvm.internal.g0.p(r4, r0)
                r1.<init>()
                r1.a = r2
                r1.b = r4
                r1.c = r5
                return
        }

        public /* synthetic */ C0081a(double r1, kotlin.time.a r3, long r4, kotlin.jvm.internal.v r6) {
                r0 = this;
                r0.<init>(r1, r3, r4)
                return
        }

        @Override // kotlin.time.g
        public /* bridge */ int N(@org.jetbrains.annotations.NotNull kotlin.time.g r1) {
                r0 = this;
                int r1 = kotlin.time.g.a.a(r0, r1)
                return r1
        }

        @Override // kotlin.time.d0
        public long a() {
                r4 = this;
                kotlin.time.a r0 = r4.b
                double r0 = r0.c()
                double r2 = r4.a
                double r0 = r0 - r2
                kotlin.time.a r2 = r4.b
                kotlin.time.DurationUnit r2 = r2.b()
                long r0 = kotlin.time.j.v(r0, r2)
                long r2 = r4.c
                long r0 = kotlin.time.h.X(r0, r2)
                return r0
        }

        @Override // kotlin.time.d0
        public /* bridge */ boolean b() {
                r1 = this;
                boolean r0 = kotlin.time.g.a.b(r1)
                return r0
        }

        @Override // kotlin.time.d0
        public /* bridge */ boolean c() {
                r1 = this;
                boolean r0 = kotlin.time.g.a.c(r1)
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
                kotlin.time.g r1 = r0.e(r1)
                return r1
        }

        @Override // kotlin.time.g, kotlin.time.d0
        @org.jetbrains.annotations.NotNull
        public kotlin.time.g e(long r8) {
                r7 = this;
                kotlin.time.a$a r0 = new kotlin.time.a$a
                double r1 = r7.a
                kotlin.time.a r3 = r7.b
                long r4 = r7.c
                long r4 = kotlin.time.h.Y(r4, r8)
                r6 = 0
                r0.<init>(r1, r3, r4, r6)
                return r0
        }

        @Override // kotlin.time.g
        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof kotlin.time.a.C0081a
                if (r0 == 0) goto L25
                kotlin.time.a r0 = r4.b
                r1 = r5
                kotlin.time.a$a r1 = (kotlin.time.a.C0081a) r1
                kotlin.time.a r1 = r1.b
                boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
                if (r0 == 0) goto L25
                kotlin.time.g r5 = (kotlin.time.g) r5
                long r0 = r4.g(r5)
                kotlin.time.h$a r5 = kotlin.time.h.b
                long r2 = r5.T()
                boolean r5 = kotlin.time.h.q(r0, r2)
                if (r5 == 0) goto L25
                r5 = 1
                return r5
            L25:
                r5 = 0
                return r5
        }

        @Override // kotlin.time.d0
        public /* bridge */ /* synthetic */ kotlin.time.d0 f(long r1) {
                r0 = this;
                kotlin.time.g r1 = r0.f(r1)
                return r1
        }

        @Override // kotlin.time.g, kotlin.time.d0
        @org.jetbrains.annotations.NotNull
        public /* bridge */ kotlin.time.g f(long r1) {
                r0 = this;
                kotlin.time.g r1 = kotlin.time.g.a.d(r0, r1)
                return r1
        }

        @Override // kotlin.time.g
        public long g(@org.jetbrains.annotations.NotNull kotlin.time.g r7) {
                r6 = this;
                java.lang.String r0 = "other"
                kotlin.jvm.internal.g0.p(r7, r0)
                boolean r0 = r7 instanceof kotlin.time.a.C0081a
                if (r0 == 0) goto L5c
                kotlin.time.a r0 = r6.b
                r1 = r7
                kotlin.time.a$a r1 = (kotlin.time.a.C0081a) r1
                kotlin.time.a r2 = r1.b
                boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
                if (r0 == 0) goto L5c
                long r2 = r6.c
                long r4 = r1.c
                boolean r7 = kotlin.time.h.q(r2, r4)
                if (r7 == 0) goto L2f
                long r2 = r6.c
                boolean r7 = kotlin.time.h.U(r2)
                if (r7 == 0) goto L2f
                kotlin.time.h$a r7 = kotlin.time.h.b
                long r0 = r7.T()
                return r0
            L2f:
                long r2 = r6.c
                long r4 = r1.c
                long r2 = kotlin.time.h.X(r2, r4)
                double r4 = r6.a
                double r0 = r1.a
                double r4 = r4 - r0
                kotlin.time.a r7 = r6.b
                kotlin.time.DurationUnit r7 = r7.b()
                long r0 = kotlin.time.j.v(r4, r7)
                long r4 = kotlin.time.h.n0(r2)
                boolean r7 = kotlin.time.h.q(r0, r4)
                if (r7 == 0) goto L57
                kotlin.time.h$a r7 = kotlin.time.h.b
                long r0 = r7.T()
                return r0
            L57:
                long r0 = kotlin.time.h.Y(r0, r2)
                return r0
            L5c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Subtracting or comparing time marks from different time sources is not possible: "
                r1.append(r2)
                r1.append(r6)
                java.lang.String r2 = " and "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
        }

        @Override // kotlin.time.g
        public int hashCode() {
                r4 = this;
                double r0 = r4.a
                kotlin.time.a r2 = r4.b
                kotlin.time.DurationUnit r2 = r2.b()
                long r0 = kotlin.time.j.v(r0, r2)
                long r2 = r4.c
                long r0 = kotlin.time.h.Y(r0, r2)
                int r0 = kotlin.time.h.Q(r0)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "DoubleTimeMark("
                r0.append(r1)
                double r1 = r3.a
                r0.append(r1)
                kotlin.time.a r1 = r3.b
                kotlin.time.DurationUnit r1 = r1.b()
                java.lang.String r1 = kotlin.time.m.h(r1)
                r0.append(r1)
                java.lang.String r1 = " + "
                r0.append(r1)
                long r1 = r3.c
                java.lang.String r1 = kotlin.time.h.j0(r1)
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                kotlin.time.a r1 = r3.b
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public a(@org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r2) {
            r1 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.b = r2
            return
    }

    @Override // kotlin.time.e0
    public /* bridge */ /* synthetic */ kotlin.time.d0 a() {
            r1 = this;
            kotlin.time.g r0 = r1.a()
            return r0
    }

    @Override // kotlin.time.e0.c, kotlin.time.e0
    @org.jetbrains.annotations.NotNull
    public kotlin.time.g a() {
            r7 = this;
            kotlin.time.a$a r0 = new kotlin.time.a$a
            double r1 = r7.c()
            kotlin.time.h$a r3 = kotlin.time.h.b
            long r4 = r3.T()
            r6 = 0
            r3 = r7
            r0.<init>(r1, r3, r4, r6)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected final kotlin.time.DurationUnit b() {
            r1 = this;
            kotlin.time.DurationUnit r0 = r1.b
            return r0
    }

    protected abstract double c();
}
