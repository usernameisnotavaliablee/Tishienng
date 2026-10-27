package kotlin.time;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class y {
    private static final long a(long r1, long r3, long r5) {
            boolean r3 = kotlin.time.h.U(r3)
            if (r3 == 0) goto L17
            long r3 = r1 ^ r5
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto Lf
            goto L17
        Lf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Summing infinities of different signs"
            r1.<init>(r2)
            throw r1
        L17:
            return r1
    }

    private static final long b(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            kotlin.time.h$a r3 = kotlin.time.h.b
            if (r2 >= 0) goto Ld
            long r3 = r3.G()
            return r3
        Ld:
            long r3 = r3.n()
            return r3
    }

    public static final boolean c(long r3) {
            r0 = 1
            long r3 = r3 - r0
            long r3 = r3 | r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto Lf
            r3 = 1
            return r3
        Lf:
            r3 = 0
            return r3
    }

    public static final long d(long r11, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r13, long r14) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.g0.p(r13, r0)
            long r5 = kotlin.time.h.i0(r14, r13)
            r7 = 1
            long r0 = r11 - r7
            long r0 = r0 | r7
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L1e
            r1 = r11
            r3 = r14
            long r11 = a(r1, r3, r5)
            return r11
        L1e:
            r1 = r11
            r3 = r14
            long r11 = r5 - r7
            long r11 = r11 | r7
            int r14 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r14 != 0) goto L2c
            long r11 = e(r1, r13, r3)
            return r11
        L2c:
            long r11 = r1 + r5
            long r13 = r1 ^ r11
            long r3 = r5 ^ r11
            long r13 = r13 & r3
            r3 = 0
            int r15 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r15 >= 0) goto L41
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 >= 0) goto L40
            r11 = -9223372036854775808
            return r11
        L40:
            return r9
        L41:
            return r11
    }

    private static final long e(long r9, kotlin.time.DurationUnit r11, long r12) {
            r0 = 2
            long r0 = kotlin.time.h.o(r12, r0)
            long r2 = kotlin.time.h.i0(r0, r11)
            r4 = 1
            long r6 = r2 - r4
            long r4 = r4 | r6
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L18
            return r2
        L18:
            long r9 = d(r9, r11, r0)
            long r12 = kotlin.time.h.X(r12, r0)
            long r9 = d(r9, r11, r12)
            return r9
    }

    public static final long f(long r5, long r7, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r9) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.g0.p(r9, r0)
            r0 = 1
            long r2 = r7 - r0
            long r0 = r0 | r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1c
            long r5 = b(r7)
            long r5 = kotlin.time.h.n0(r5)
            return r5
        L1c:
            long r5 = g(r5, r7, r9)
            return r5
    }

    private static final long g(long r7, long r9, kotlin.time.DurationUnit r11) {
            long r0 = r7 - r9
            long r2 = r0 ^ r7
            long r4 = r0 ^ r9
            long r4 = ~r4
            long r2 = r2 & r4
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L3c
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.MILLISECONDS
            int r3 = r11.compareTo(r2)
            if (r3 >= 0) goto L33
            r0 = 1
            long r0 = kotlin.time.l.b(r0, r2, r11)
            long r3 = r7 / r0
            long r5 = r9 / r0
            long r3 = r3 - r5
            long r7 = r7 % r0
            long r9 = r9 % r0
            long r7 = r7 - r9
            kotlin.time.h$a r9 = kotlin.time.h.b
            long r9 = kotlin.time.j.x(r3, r2)
            long r7 = kotlin.time.j.x(r7, r11)
            long r7 = kotlin.time.h.Y(r9, r7)
            return r7
        L33:
            long r7 = b(r0)
            long r7 = kotlin.time.h.n0(r7)
            return r7
        L3c:
            long r7 = kotlin.time.j.x(r0, r11)
            return r7
    }

    public static final long h(long r7, long r9, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r11) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.g0.p(r11, r0)
            r0 = 1
            long r2 = r9 - r0
            long r2 = r2 | r0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L27
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L1e
            kotlin.time.h$a r7 = kotlin.time.h.b
            long r7 = r7.T()
            return r7
        L1e:
            long r7 = b(r9)
            long r7 = kotlin.time.h.n0(r7)
            return r7
        L27:
            long r2 = r7 - r0
            long r0 = r0 | r2
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L33
            long r7 = b(r7)
            return r7
        L33:
            long r7 = g(r7, r9, r11)
            return r7
    }
}
