package androidx.core.math;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class MathUtils {
    private MathUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int addExact(int r4, int r5) {
            int r0 = r4 + r5
            r1 = 0
            r2 = 1
            if (r4 < 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            if (r5 < 0) goto Ld
            r5 = 1
            goto Le
        Ld:
            r5 = 0
        Le:
            if (r3 != r5) goto L23
            if (r4 < 0) goto L14
            r4 = 1
            goto L15
        L14:
            r4 = 0
        L15:
            if (r0 < 0) goto L18
            r1 = 1
        L18:
            if (r4 != r1) goto L1b
            goto L23
        L1b:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "integer overflow"
            r4.<init>(r5)
            throw r4
        L23:
            return r0
    }

    public static long addExact(long r7, long r9) {
            long r0 = r7 + r9
            r2 = 0
            r3 = 1
            r4 = 0
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 < 0) goto Lc
            r7 = 1
            goto Ld
        Lc:
            r7 = 0
        Ld:
            int r8 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r8 < 0) goto L13
            r8 = 1
            goto L14
        L13:
            r8 = 0
        L14:
            if (r7 != r8) goto L2b
            if (r6 < 0) goto L1a
            r7 = 1
            goto L1b
        L1a:
            r7 = 0
        L1b:
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 < 0) goto L20
            r2 = 1
        L20:
            if (r7 != r2) goto L23
            goto L2b
        L23:
            java.lang.ArithmeticException r7 = new java.lang.ArithmeticException
            java.lang.String r8 = "integer overflow"
            r7.<init>(r8)
            throw r7
        L2b:
            return r0
    }

    public static double clamp(double r1, double r3, double r5) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r3
        L5:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto La
            return r5
        La:
            return r1
    }

    public static float clamp(float r1, float r2, float r3) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r2
        L5:
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 <= 0) goto La
            return r3
        La:
            return r1
    }

    public static int clamp(int r0, int r1, int r2) {
            if (r0 >= r1) goto L3
            return r1
        L3:
            if (r0 <= r2) goto L6
            return r2
        L6:
            return r0
    }

    public static long clamp(long r1, long r3, long r5) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r3
        L5:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto La
            return r5
        La:
            return r1
    }

    public static int decrementExact(int r1) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L7
            int r1 = r1 + (-1)
            return r1
        L7:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r0 = "integer overflow"
            r1.<init>(r0)
            throw r1
    }

    public static long decrementExact(long r3) {
            r0 = -9223372036854775808
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto La
            r0 = 1
            long r3 = r3 - r0
            return r3
        La:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r4 = "integer overflow"
            r3.<init>(r4)
            throw r3
    }

    public static int incrementExact(int r1) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L8
            int r1 = r1 + 1
            return r1
        L8:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r0 = "integer overflow"
            r1.<init>(r0)
            throw r1
    }

    public static long incrementExact(long r3) {
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto Ld
            r0 = 1
            long r3 = r3 + r0
            return r3
        Ld:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r4 = "integer overflow"
            r3.<init>(r4)
            throw r3
    }

    public static int multiplyExact(int r2, int r3) {
            int r0 = r2 * r3
            if (r2 == 0) goto L17
            if (r3 == 0) goto L17
            int r1 = r0 / r2
            if (r1 != r3) goto Lf
            int r3 = r0 / r3
            if (r3 != r2) goto Lf
            goto L17
        Lf:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.String r3 = "integer overflow"
            r2.<init>(r3)
            throw r2
        L17:
            return r0
    }

    public static long multiplyExact(long r5, long r7) {
            long r0 = r5 * r7
            r2 = 0
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 == 0) goto L21
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 == 0) goto L21
            long r2 = r0 / r5
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L19
            long r7 = r0 / r7
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 != 0) goto L19
            goto L21
        L19:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "integer overflow"
            r5.<init>(r6)
            throw r5
        L21:
            return r0
    }

    public static int negateExact(int r1) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L6
            int r1 = -r1
            return r1
        L6:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r0 = "integer overflow"
            r1.<init>(r0)
            throw r1
    }

    public static long negateExact(long r3) {
            r0 = -9223372036854775808
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L8
            long r3 = -r3
            return r3
        L8:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r4 = "integer overflow"
            r3.<init>(r4)
            throw r3
    }

    public static int subtractExact(int r4, int r5) {
            int r0 = r4 - r5
            r1 = 0
            r2 = 1
            if (r4 >= 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            if (r5 >= 0) goto Ld
            r5 = 1
            goto Le
        Ld:
            r5 = 0
        Le:
            if (r3 == r5) goto L23
            if (r4 >= 0) goto L14
            r4 = 1
            goto L15
        L14:
            r4 = 0
        L15:
            if (r0 >= 0) goto L18
            r1 = 1
        L18:
            if (r4 != r1) goto L1b
            goto L23
        L1b:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "integer overflow"
            r4.<init>(r5)
            throw r4
        L23:
            return r0
    }

    public static long subtractExact(long r7, long r9) {
            long r0 = r7 - r9
            r2 = 0
            r3 = 1
            r4 = 0
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 >= 0) goto Lc
            r7 = 1
            goto Ld
        Lc:
            r7 = 0
        Ld:
            int r8 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r8 >= 0) goto L13
            r8 = 1
            goto L14
        L13:
            r8 = 0
        L14:
            if (r7 == r8) goto L2b
            if (r6 >= 0) goto L1a
            r7 = 1
            goto L1b
        L1a:
            r7 = 0
        L1b:
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 >= 0) goto L20
            r2 = 1
        L20:
            if (r7 != r2) goto L23
            goto L2b
        L23:
            java.lang.ArithmeticException r7 = new java.lang.ArithmeticException
            java.lang.String r8 = "integer overflow"
            r7.<init>(r8)
            throw r7
        L2b:
            return r0
    }

    public static int toIntExact(long r3) {
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L10
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L10
            int r4 = (int) r3
            return r4
        L10:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r4 = "integer overflow"
            r3.<init>(r4)
            throw r3
    }
}
