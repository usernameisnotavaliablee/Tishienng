package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1062:1\n1015#1,6:1064\n1018#1,3:1070\n1015#1,6:1073\n1015#1,6:1079\n1018#1,3:1085\n1#2:1063\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n930#1:1064,6\n964#1:1070,3\n967#1:1073,6\n970#1:1079,6\n1015#1:1085,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j {
    public static final int a = 1000000;
    public static final long b = 4611686018426999999L;
    public static final long c = 4611686018427387903L;
    private static final long d = 4611686018426L;

    public static final /* synthetic */ long a(long r0, int r2) {
            long r0 = i(r0, r2)
            return r0
    }

    public static final /* synthetic */ long b(long r0) {
            long r0 = j(r0)
            return r0
    }

    public static final /* synthetic */ long c(long r0) {
            long r0 = k(r0)
            return r0
    }

    public static final /* synthetic */ long d(long r0) {
            long r0 = l(r0)
            return r0
    }

    public static final /* synthetic */ long e(long r0) {
            long r0 = m(r0)
            return r0
    }

    public static final /* synthetic */ long f(long r0) {
            long r0 = n(r0)
            return r0
    }

    public static final /* synthetic */ long g(long r0) {
            long r0 = o(r0)
            return r0
    }

    public static final /* synthetic */ long h(java.lang.String r0, boolean r1) {
            long r0 = p(r0, r1)
            return r0
    }

    private static final long i(long r2, int r4) {
            r0 = 1
            long r2 = r2 << r0
            long r0 = (long) r4
            long r2 = r2 + r0
            long r2 = kotlin.time.h.l(r2)
            return r2
    }

    private static final long j(long r2) {
            r0 = 1
            long r2 = r2 << r0
            r0 = 1
            long r2 = r2 + r0
            long r2 = kotlin.time.h.l(r2)
            return r2
    }

    private static final long k(long r6) {
            r0 = -4611686018426(0xfffffbce4217d286, double:NaN)
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 > 0) goto L1b
            r0 = 4611686018427(0x431bde82d7b, double:2.278475631111E-311)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1b
            long r6 = n(r6)
            long r6 = l(r6)
            return r6
        L1b:
            r2 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r4 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r0 = r6
            long r6 = kotlin.ranges.t.K(r0, r2, r4)
            long r6 = j(r6)
            return r6
    }

    private static final long l(long r1) {
            r0 = 1
            long r1 = r1 << r0
            long r1 = kotlin.time.h.l(r1)
            return r1
    }

    private static final long m(long r3) {
            r0 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 > 0) goto L17
            r0 = 4611686018427000000(0x3ffffffffffa14c0, double:1.999999999913868)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L17
            long r3 = l(r3)
            return r3
        L17:
            long r3 = o(r3)
            long r3 = j(r3)
            return r3
    }

    private static final long n(long r2) {
            r0 = 1000000(0xf4240, float:1.401298E-39)
            long r0 = (long) r0
            long r2 = r2 * r0
            return r2
    }

    private static final long o(long r2) {
            r0 = 1000000(0xf4240, float:1.401298E-39)
            long r0 = (long) r0
            long r2 = r2 / r0
            return r2
    }

    private static final long p(java.lang.String r25, boolean r26) {
            r0 = r25
            int r6 = r0.length()
            if (r6 == 0) goto L28f
            kotlin.time.h$a r7 = kotlin.time.h.b
            long r8 = r7.T()
            r10 = 0
            char r1 = r0.charAt(r10)
            r2 = 43
            r3 = 45
            if (r1 == r2) goto L1d
            if (r1 == r3) goto L1d
            r1 = 0
            goto L1e
        L1d:
            r1 = 1
        L1e:
            if (r1 <= 0) goto L22
            r12 = 1
            goto L23
        L22:
            r12 = 0
        L23:
            r2 = 2
            r13 = 0
            if (r12 == 0) goto L2f
            boolean r3 = kotlin.text.u.y5(r0, r3, r10, r2, r13)
            if (r3 == 0) goto L2f
            r14 = 1
            goto L30
        L2f:
            r14 = 0
        L30:
            java.lang.String r15 = "No components"
            if (r6 <= r1) goto L289
            char r3 = r0.charAt(r1)
            r4 = 80
            java.lang.String r5 = "Unexpected order of duration components"
            r16 = 1
            r11 = 58
            r2 = 48
            java.lang.String r10 = "substring(...)"
            java.lang.String r13 = "null cannot be cast to non-null type java.lang.String"
            if (r3 != r4) goto L14c
            int r1 = r1 + 1
            if (r1 == r6) goto L146
            r3 = 0
            r4 = 0
        L4e:
            if (r1 >= r6) goto L27b
            char r7 = r0.charAt(r1)
            r12 = 84
            if (r7 != r12) goto L66
            if (r3 != 0) goto L60
            int r1 = r1 + 1
            if (r1 == r6) goto L60
            r3 = 1
            goto L4e
        L60:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L66:
            r7 = r1
        L67:
            int r12 = r0.length()
            if (r7 >= r12) goto L90
            char r12 = r0.charAt(r7)
            if (r2 > r12) goto L7a
            if (r12 >= r11) goto L7a
            r17 = r6
            r2 = 2
            r11 = 0
            goto L87
        L7a:
            java.lang.String r15 = "+-."
            r17 = r6
            r2 = 2
            r6 = 0
            r11 = 0
            boolean r12 = kotlin.text.u.k3(r15, r12, r6, r2, r11)
            if (r12 == 0) goto L94
        L87:
            int r7 = r7 + 1
            r6 = r17
            r2 = 48
            r11 = 58
            goto L67
        L90:
            r17 = r6
            r2 = 2
            r11 = 0
        L94:
            kotlin.jvm.internal.g0.n(r0, r13)
            java.lang.String r6 = r0.substring(r1, r7)
            kotlin.jvm.internal.g0.o(r6, r10)
            int r7 = r6.length()
            if (r7 == 0) goto L140
            int r7 = r6.length()
            int r1 = r1 + r7
            if (r1 < 0) goto L129
            int r7 = r0.length()
            if (r1 >= r7) goto L129
            char r7 = r0.charAt(r1)
            int r1 = r1 + 1
            kotlin.time.DurationUnit r7 = kotlin.time.m.f(r7, r3)
            if (r4 == 0) goto Lca
            int r4 = r4.compareTo(r7)
            if (r4 <= 0) goto Lc4
            goto Lca
        Lc4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        Lca:
            r23 = 6
            r24 = 0
            r20 = 46
            r21 = 0
            r22 = 0
            r19 = r6
            int r4 = kotlin.text.u.G3(r19, r20, r21, r22, r23, r24)
            kotlin.time.DurationUnit r12 = kotlin.time.DurationUnit.SECONDS
            if (r7 != r12) goto L11a
            if (r4 <= 0) goto L11a
            kotlin.jvm.internal.g0.n(r6, r13)
            r12 = 0
            java.lang.String r15 = r6.substring(r12, r4)
            kotlin.jvm.internal.g0.o(r15, r10)
            r26 = r3
            long r2 = q(r15)
            long r2 = x(r2, r7)
            long r2 = kotlin.time.h.Y(r8, r2)
            kotlin.jvm.internal.g0.n(r6, r13)
            java.lang.String r4 = r6.substring(r4)
            kotlin.jvm.internal.g0.o(r4, r10)
            double r8 = java.lang.Double.parseDouble(r4)
            long r8 = v(r8, r7)
            long r8 = kotlin.time.h.Y(r2, r8)
        L10f:
            r3 = r26
            r4 = r7
            r6 = r17
            r2 = 48
            r11 = 58
            goto L4e
        L11a:
            r26 = r3
            long r2 = q(r6)
            long r2 = x(r2, r7)
            long r8 = kotlin.time.h.Y(r8, r2)
            goto L10f
        L129:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Missing unit for value "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L140:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L146:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L14c:
            r17 = r6
            r11 = 0
            if (r26 != 0) goto L283
            int r6 = r17 - r1
            r2 = 8
            int r4 = java.lang.Math.max(r6, r2)
            r2 = r5
            r5 = 1
            r3 = r2
            java.lang.String r2 = "Infinity"
            r6 = r3
            r3 = 0
            r11 = 48
            boolean r2 = kotlin.text.u.q2(r0, r1, r2, r3, r4, r5)
            if (r2 == 0) goto L16e
            long r8 = r7.n()
            goto L27b
        L16e:
            r2 = r12 ^ 1
            if (r12 == 0) goto L193
            char r3 = r0.charAt(r1)
            r4 = 40
            if (r3 != r4) goto L193
            char r3 = kotlin.text.u.U7(r0)
            r4 = 41
            if (r3 != r4) goto L193
            int r1 = r1 + 1
            int r2 = r17 + (-1)
            if (r1 == r2) goto L18d
            r3 = r2
            r2 = 1
        L18a:
            r4 = 0
            r5 = 0
            goto L196
        L18d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r15)
            throw r0
        L193:
            r3 = r17
            goto L18a
        L196:
            if (r1 >= r3) goto L27b
            if (r4 == 0) goto L1ad
            if (r2 == 0) goto L1ad
        L19c:
            int r4 = r0.length()
            if (r1 >= r4) goto L1ad
            char r4 = r0.charAt(r1)
            r7 = 32
            if (r4 != r7) goto L1ad
            int r1 = r1 + 1
            goto L19c
        L1ad:
            r4 = r1
        L1ae:
            int r7 = r0.length()
            if (r4 >= r7) goto L1c6
            char r7 = r0.charAt(r4)
            r12 = 58
            if (r11 > r7) goto L1bf
            if (r7 >= r12) goto L1bf
            goto L1c3
        L1bf:
            r15 = 46
            if (r7 != r15) goto L1c8
        L1c3:
            int r4 = r4 + 1
            goto L1ae
        L1c6:
            r12 = 58
        L1c8:
            kotlin.jvm.internal.g0.n(r0, r13)
            java.lang.String r4 = r0.substring(r1, r4)
            kotlin.jvm.internal.g0.o(r4, r10)
            int r7 = r4.length()
            if (r7 == 0) goto L275
            int r7 = r4.length()
            int r1 = r1 + r7
            r7 = r1
        L1de:
            int r15 = r0.length()
            if (r7 >= r15) goto L1f5
            char r15 = r0.charAt(r7)
            r11 = 97
            if (r11 > r15) goto L1f5
            r11 = 123(0x7b, float:1.72E-43)
            if (r15 >= r11) goto L1f5
            int r7 = r7 + 1
            r11 = 48
            goto L1de
        L1f5:
            kotlin.jvm.internal.g0.n(r0, r13)
            java.lang.String r7 = r0.substring(r1, r7)
            kotlin.jvm.internal.g0.o(r7, r10)
            int r11 = r7.length()
            int r1 = r1 + r11
            kotlin.time.DurationUnit r7 = kotlin.time.m.g(r7)
            if (r5 == 0) goto L217
            int r5 = r5.compareTo(r7)
            if (r5 <= 0) goto L211
            goto L217
        L211:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r6)
            throw r0
        L217:
            r21 = 6
            r22 = 0
            r18 = 46
            r19 = 0
            r20 = 0
            r17 = r4
            int r4 = kotlin.text.u.G3(r17, r18, r19, r20, r21, r22)
            r5 = r17
            if (r4 <= 0) goto L268
            kotlin.jvm.internal.g0.n(r5, r13)
            r11 = 0
            java.lang.String r15 = r5.substring(r11, r4)
            kotlin.jvm.internal.g0.o(r15, r10)
            long r11 = java.lang.Long.parseLong(r15)
            long r11 = x(r11, r7)
            long r8 = kotlin.time.h.Y(r8, r11)
            kotlin.jvm.internal.g0.n(r5, r13)
            java.lang.String r4 = r5.substring(r4)
            kotlin.jvm.internal.g0.o(r4, r10)
            double r4 = java.lang.Double.parseDouble(r4)
            long r4 = v(r4, r7)
            long r8 = kotlin.time.h.Y(r8, r4)
            if (r1 < r3) goto L260
        L25a:
            r5 = r7
            r4 = 1
            r11 = 48
            goto L196
        L260:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Fractional component must be last"
            r0.<init>(r1)
            throw r0
        L268:
            long r4 = java.lang.Long.parseLong(r5)
            long r4 = x(r4, r7)
            long r8 = kotlin.time.h.Y(r8, r4)
            goto L25a
        L275:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L27b:
            if (r14 == 0) goto L282
            long r0 = kotlin.time.h.n0(r8)
            return r0
        L282:
            return r8
        L283:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L289:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r15)
            throw r0
        L28f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The string is empty"
            r0.<init>(r1)
            throw r0
    }

    private static final long q(java.lang.String r12) {
            int r0 = r12.length()
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 <= 0) goto L18
            java.lang.String r5 = "+-"
            char r6 = r12.charAt(r4)
            boolean r5 = kotlin.text.u.k3(r5, r6, r4, r2, r1)
            if (r5 == 0) goto L18
            r5 = 1
            goto L19
        L18:
            r5 = 0
        L19:
            int r6 = r0 - r5
            r7 = 58
            r8 = 48
            r9 = 16
            if (r6 <= r9) goto L4f
            r6 = r5
        L24:
            if (r5 >= r0) goto L3a
            char r10 = r12.charAt(r5)
            if (r10 != r8) goto L31
            if (r6 != r5) goto L37
            int r6 = r6 + 1
            goto L37
        L31:
            r11 = 49
            if (r11 > r10) goto L4f
            if (r10 >= r7) goto L4f
        L37:
            int r5 = r5 + 1
            goto L24
        L3a:
            int r5 = r0 - r6
            if (r5 <= r9) goto L4f
            char r12 = r12.charAt(r4)
            r0 = 45
            if (r12 != r0) goto L49
            r0 = -9223372036854775808
            return r0
        L49:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        L4f:
            java.lang.String r5 = "+"
            boolean r1 = kotlin.text.u.H2(r12, r5, r4, r2, r1)
            if (r1 == 0) goto L6a
            if (r0 <= r3) goto L6a
            char r0 = r12.charAt(r3)
            if (r8 > r0) goto L6a
            if (r0 >= r7) goto L6a
            java.lang.String r12 = kotlin.text.u.b7(r12, r3)
            long r0 = java.lang.Long.parseLong(r12)
            return r0
        L6a:
            long r0 = java.lang.Long.parseLong(r12)
            return r0
    }

    private static final int r(java.lang.String r1, int r2, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r3) {
        L0:
            int r0 = r1.length()
            if (r2 >= r0) goto L1d
            char r0 = r1.charAt(r2)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1d
            int r2 = r2 + 1
            goto L0
        L1d:
            return r2
    }

    private static final java.lang.String s(java.lang.String r2, int r3, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r4) {
            r0 = r3
        L1:
            int r1 = r2.length()
            if (r0 >= r1) goto L1e
            char r1 = r2.charAt(r0)
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1e
            int r0 = r0 + 1
            goto L1
        L1e:
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.g0.n(r2, r4)
            java.lang.String r2 = r2.substring(r3, r0)
            java.lang.String r3 = "substring(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final long t(double r0, long r2) {
            long r0 = kotlin.time.h.Z(r2, r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.internal.InlineOnly
    private static final long u(int r0, long r1) {
            long r0 = kotlin.time.h.a0(r1, r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    public static final long v(double r5, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r7) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.g0.p(r7, r0)
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            double r0 = kotlin.time.l.a(r5, r7, r0)
            boolean r2 = java.lang.Double.isNaN(r0)
            if (r2 != 0) goto L3b
            long r0 = kotlin.math.b.M0(r0)
            r2 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L2c
            r2 = 4611686018427000000(0x3ffffffffffa14c0, double:1.999999999913868)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L2c
            long r5 = l(r0)
            return r5
        L2c:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            double r5 = kotlin.time.l.a(r5, r7, r0)
            long r5 = kotlin.math.b.M0(r5)
            long r5 = k(r5)
            return r5
        L3b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Duration value cannot be NaN."
            r5.<init>(r6)
            throw r5
    }

    @kotlin.SinceKotlin(version = "1.6")
    public static final long w(int r2, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r3) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            int r0 = r3.compareTo(r0)
            if (r0 > 0) goto L19
            long r0 = (long) r2
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.NANOSECONDS
            long r2 = kotlin.time.l.c(r0, r3, r2)
            long r2 = l(r2)
            return r2
        L19:
            long r0 = (long) r2
            long r2 = x(r0, r3)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.6")
    public static final long x(long r7, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r9) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.g0.p(r9, r0)
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            r1 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            long r1 = kotlin.time.l.c(r1, r0, r9)
            long r3 = -r1
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto L22
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 > 0) goto L22
            long r7 = kotlin.time.l.c(r7, r9, r0)
            long r7 = l(r7)
            return r7
        L22:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r1 = kotlin.time.l.b(r7, r9, r0)
            r3 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r5 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r7 = kotlin.ranges.t.K(r1, r3, r5)
            long r7 = j(r7)
            return r7
    }
}
