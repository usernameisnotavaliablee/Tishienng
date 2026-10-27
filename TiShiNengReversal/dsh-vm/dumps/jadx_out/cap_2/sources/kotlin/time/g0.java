package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.time.ExperimentalTime
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class g0 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.time.g0.a h = null;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

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

        @org.jetbrains.annotations.NotNull
        public final kotlin.time.g0 a(@org.jetbrains.annotations.NotNull kotlin.time.Instant r25) {
                r24 = this;
                java.lang.String r0 = "instant"
                r1 = r25
                kotlin.jvm.internal.g0.p(r1, r0)
                long r2 = r1.getEpochSeconds()
                r4 = 86400(0x15180, double:4.26873E-319)
                long r6 = r2 / r4
                long r8 = r2 ^ r4
                r10 = -1
                r12 = 0
                int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r0 >= 0) goto L21
                long r8 = r6 * r4
                int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r0 == 0) goto L21
                long r6 = r6 + r10
            L21:
                long r2 = r2 % r4
                long r8 = r2 ^ r4
                long r14 = -r2
                long r14 = r14 | r2
                long r8 = r8 & r14
                r0 = 63
                long r8 = r8 >> r0
                long r4 = r4 & r8
                long r2 = r2 + r4
                int r0 = (int) r2
                r2 = 719528(0xafaa8, float:1.008273E-39)
                long r2 = (long) r2
                long r6 = r6 + r2
                r2 = 60
                long r2 = (long) r2
                long r6 = r6 - r2
                r2 = 400(0x190, float:5.6E-43)
                r3 = 146097(0x23ab1, float:2.04726E-40)
                int r4 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
                if (r4 >= 0) goto L4e
                r4 = 1
                long r8 = r6 + r4
                long r14 = (long) r3
                long r8 = r8 / r14
                long r8 = r8 - r4
                long r4 = (long) r2
                long r4 = r4 * r8
                long r8 = -r8
                long r8 = r8 * r14
                long r6 = r6 + r8
                goto L4f
            L4e:
                r4 = r12
            L4f:
                long r8 = (long) r2
                long r14 = r8 * r6
                r2 = 591(0x24f, float:8.28E-43)
                r16 = r10
                long r10 = (long) r2
                long r14 = r14 + r10
                long r2 = (long) r3
                long r14 = r14 / r2
                r2 = 365(0x16d, float:5.11E-43)
                long r2 = (long) r2
                long r10 = r2 * r14
                r18 = r12
                r12 = 4
                long r12 = (long) r12
                long r20 = r14 / r12
                long r10 = r10 + r20
                r1 = 100
                r20 = r2
                long r1 = (long) r1
                long r22 = r14 / r1
                long r10 = r10 - r22
                long r22 = r14 / r8
                long r10 = r10 + r22
                long r10 = r6 - r10
                int r3 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
                if (r3 >= 0) goto L89
                long r14 = r14 + r16
                long r10 = r20 * r14
                long r12 = r14 / r12
                long r10 = r10 + r12
                long r1 = r14 / r1
                long r10 = r10 - r1
                long r1 = r14 / r8
                long r10 = r10 + r1
                long r10 = r6 - r10
            L89:
                long r14 = r14 + r4
                int r1 = (int) r10
                int r2 = r1 * 5
                int r2 = r2 + 2
                int r2 = r2 / 153
                int r3 = r2 + 2
                int r3 = r3 % 12
                int r6 = r3 + 1
                int r3 = r2 * 306
                int r3 = r3 + 5
                int r3 = r3 / 10
                int r1 = r1 - r3
                int r7 = r1 + 1
                int r2 = r2 / 10
                long r1 = (long) r2
                long r14 = r14 + r1
                int r5 = (int) r14
                int r8 = r0 / 3600
                int r1 = r8 * 3600
                int r0 = r0 - r1
                int r9 = r0 / 60
                int r1 = r9 * 60
                int r10 = r0 - r1
                kotlin.time.g0 r4 = new kotlin.time.g0
                int r11 = r25.getNanosecondsOfSecond()
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                return r4
        }
    }

    static {
            kotlin.time.g0$a r0 = new kotlin.time.g0$a
            r1 = 0
            r0.<init>(r1)
            kotlin.time.g0.h = r0
            return
    }

    public g0(int r1, int r2, int r3, int r4, int r5, int r6, int r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            return
    }

    public final int a() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public final int b() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public final int c() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    public final int d() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public final int e() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public final int f() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    public final int g() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public final <T> T h(int r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Integer, ? extends T> r12) {
            r10 = this;
            java.lang.String r0 = "buildInstant"
            kotlin.jvm.internal.g0.p(r12, r0)
            int r0 = r10.g()
            long r0 = (long) r0
            r2 = 365(0x16d, float:5.11E-43)
            long r2 = (long) r2
            long r2 = r2 * r0
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L2f
            r4 = 3
            long r4 = (long) r4
            long r4 = r4 + r0
            r6 = 4
            long r6 = (long) r6
            long r4 = r4 / r6
            r6 = 99
            long r6 = (long) r6
            long r6 = r6 + r0
            r8 = 100
            long r8 = (long) r8
            long r6 = r6 / r8
            long r4 = r4 - r6
            r6 = 399(0x18f, float:5.59E-43)
            long r6 = (long) r6
            long r0 = r0 + r6
            r6 = 400(0x190, float:5.6E-43)
            long r6 = (long) r6
            long r0 = r0 / r6
            long r4 = r4 + r0
            long r2 = r2 + r4
            goto L3f
        L2f:
            r4 = -4
            long r4 = (long) r4
            long r4 = r0 / r4
            r6 = -100
            long r6 = (long) r6
            long r6 = r0 / r6
            long r4 = r4 - r6
            r6 = -400(0xfffffffffffffe70, float:NaN)
            long r6 = (long) r6
            long r0 = r0 / r6
            long r4 = r4 + r0
            long r2 = r2 - r4
        L3f:
            int r0 = r10.d()
            int r0 = r0 * 367
            int r0 = r0 + (-362)
            int r0 = r0 / 12
            long r0 = (long) r0
            long r2 = r2 + r0
            int r0 = r10.a()
            int r0 = r0 + (-1)
            long r0 = (long) r0
            long r2 = r2 + r0
            int r0 = r10.d()
            r1 = 2
            if (r0 <= r1) goto L6c
            r0 = -1
            long r0 = r0 + r2
            int r4 = r10.g()
            boolean r4 = kotlin.time.v.p(r4)
            if (r4 != 0) goto L6b
            r0 = -2
            long r2 = r2 + r0
            goto L6c
        L6b:
            r2 = r0
        L6c:
            r0 = 719528(0xafaa8, float:1.008273E-39)
            long r0 = (long) r0
            long r2 = r2 - r0
            int r0 = r10.b()
            int r0 = r0 * 3600
            int r1 = r10.c()
            int r1 = r1 * 60
            int r0 = r0 + r1
            int r1 = r10.f()
            int r0 = r0 + r1
            r1 = 86400(0x15180, float:1.21072E-40)
            long r4 = (long) r1
            long r2 = r2 * r4
            long r0 = (long) r0
            long r2 = r2 + r0
            long r0 = (long) r11
            long r2 = r2 - r0
            java.lang.Long r11 = java.lang.Long.valueOf(r2)
            int r0 = r10.e()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r11 = r12.invoke(r11, r0)
            return r11
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UnboundLocalDateTime("
            r0.append(r1)
            int r1 = r3.a
            r0.append(r1)
            r1 = 45
            r0.append(r1)
            int r2 = r3.b
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.c
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            int r1 = r3.d
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            int r2 = r3.e
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.f
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            int r1 = r3.g
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
