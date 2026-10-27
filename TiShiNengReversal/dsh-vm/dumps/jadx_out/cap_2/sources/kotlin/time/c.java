package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.9")
@kotlin.WasExperimental(markerClass = {kotlin.time.ExperimentalTime.class})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class c implements kotlin.time.e0.c {

    @org.jetbrains.annotations.NotNull
    private final kotlin.time.DurationUnit b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,210:1\n80#2:211\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n67#1:211\n*E\n"})
    private static final class a implements kotlin.time.g {
        private final long a;

        @org.jetbrains.annotations.NotNull
        private final kotlin.time.c b;
        private final long c;

        private a(long r2, kotlin.time.c r4, long r5) {
                r1 = this;
                java.lang.String r0 = "timeSource"
                kotlin.jvm.internal.g0.p(r4, r0)
                r1.<init>()
                r1.a = r2
                r1.b = r4
                r1.c = r5
                return
        }

        public /* synthetic */ a(long r1, kotlin.time.c r3, long r4, kotlin.jvm.internal.v r6) {
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
                r5 = this;
                kotlin.time.c r0 = r5.b
                long r0 = kotlin.time.c.c(r0)
                long r2 = r5.a
                kotlin.time.c r4 = r5.b
                kotlin.time.DurationUnit r4 = r4.e()
                long r0 = kotlin.time.y.h(r0, r2, r4)
                long r2 = r5.c
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
        public kotlin.time.g e(long r11) {
                r10 = this;
                kotlin.time.c r0 = r10.b
                kotlin.time.DurationUnit r0 = r0.e()
                boolean r1 = kotlin.time.h.U(r11)
                if (r1 == 0) goto L21
                long r1 = r10.a
                long r4 = kotlin.time.y.d(r1, r0, r11)
                kotlin.time.c$a r3 = new kotlin.time.c$a
                kotlin.time.c r6 = r10.b
                kotlin.time.h$a r11 = kotlin.time.h.b
                long r7 = r11.T()
                r9 = 0
                r3.<init>(r4, r6, r7, r9)
                return r3
            L21:
                long r1 = kotlin.time.h.m0(r11, r0)
                long r11 = kotlin.time.h.X(r11, r1)
                long r3 = r10.c
                long r11 = kotlin.time.h.Y(r11, r3)
                long r3 = r10.a
                long r1 = kotlin.time.y.d(r3, r0, r1)
                long r3 = kotlin.time.h.m0(r11, r0)
                long r1 = kotlin.time.y.d(r1, r0, r3)
                long r11 = kotlin.time.h.X(r11, r3)
                long r3 = kotlin.time.h.z(r11)
                r5 = 0
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 == 0) goto L65
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 == 0) goto L65
                long r7 = r1 ^ r3
                int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r9 >= 0) goto L65
                int r3 = kotlin.math.b.V(r3)
                long r3 = kotlin.time.j.w(r3, r0)
                long r1 = kotlin.time.y.d(r1, r0, r3)
                long r11 = kotlin.time.h.X(r11, r3)
            L65:
                r3 = 1
                long r5 = r1 - r3
                long r3 = r3 | r5
                r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 != 0) goto L79
                kotlin.time.h$a r11 = kotlin.time.h.b
                long r11 = r11.T()
            L79:
                r4 = r11
                kotlin.time.c$a r0 = new kotlin.time.c$a
                kotlin.time.c r3 = r10.b
                r6 = 0
                r0.<init>(r1, r3, r4, r6)
                return r0
        }

        @Override // kotlin.time.g
        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof kotlin.time.c.a
                if (r0 == 0) goto L25
                kotlin.time.c r0 = r4.b
                r1 = r5
                kotlin.time.c$a r1 = (kotlin.time.c.a) r1
                kotlin.time.c r1 = r1.b
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
                boolean r0 = r7 instanceof kotlin.time.c.a
                if (r0 == 0) goto L31
                kotlin.time.c r0 = r6.b
                r1 = r7
                kotlin.time.c$a r1 = (kotlin.time.c.a) r1
                kotlin.time.c r2 = r1.b
                boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
                if (r0 == 0) goto L31
                long r2 = r6.a
                long r4 = r1.a
                kotlin.time.c r7 = r6.b
                kotlin.time.DurationUnit r7 = r7.e()
                long r2 = kotlin.time.y.h(r2, r4, r7)
                long r4 = r6.c
                long r0 = r1.c
                long r0 = kotlin.time.h.X(r4, r0)
                long r0 = kotlin.time.h.Y(r2, r0)
                return r0
            L31:
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
                r3 = this;
                long r0 = r3.c
                int r0 = kotlin.time.h.Q(r0)
                int r0 = r0 * 37
                long r1 = r3.a
                int r1 = androidx.camera.camera2.internal.compat.params.e.a(r1)
                int r0 = r0 + r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "LongTimeMark("
                r0.append(r1)
                long r1 = r3.a
                r0.append(r1)
                kotlin.time.c r1 = r3.b
                kotlin.time.DurationUnit r1 = r1.e()
                java.lang.String r1 = kotlin.time.m.h(r1)
                r0.append(r1)
                java.lang.String r1 = " + "
                r0.append(r1)
                long r1 = r3.c
                java.lang.String r1 = kotlin.time.h.j0(r1)
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                kotlin.time.c r1 = r3.b
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public c(@org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r2) {
            r1 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.b = r2
            kotlin.time.b r2 = new kotlin.time.b
            r2.<init>(r1)
            kotlin.s r2 = kotlin.t.c(r2)
            r1.c = r2
            return
    }

    public static /* synthetic */ long b(kotlin.time.c r2) {
            long r0 = h(r2)
            return r0
    }

    public static final /* synthetic */ long c(kotlin.time.c r2) {
            long r0 = r2.d()
            return r0
    }

    private final long d() {
            r4 = this;
            long r0 = r4.g()
            long r2 = r4.f()
            long r0 = r0 - r2
            return r0
    }

    private final long f() {
            r2 = this;
            kotlin.s r0 = r2.c
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            return r0
    }

    private static final long h(kotlin.time.c r2) {
            long r0 = r2.g()
            return r0
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
            kotlin.time.c$a r0 = new kotlin.time.c$a
            long r1 = r7.d()
            kotlin.time.h$a r3 = kotlin.time.h.b
            long r4 = r3.T()
            r6 = 0
            r3 = r7
            r0.<init>(r1, r3, r4, r6)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected final kotlin.time.DurationUnit e() {
            r1 = this;
            kotlin.time.DurationUnit r0 = r1.b
            return r0
    }

    protected abstract long g();
}
