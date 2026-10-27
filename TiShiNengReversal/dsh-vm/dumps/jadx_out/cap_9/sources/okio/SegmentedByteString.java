package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "-SegmentedByteString")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,185:1\n67#1:186\n73#1:187\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n105#1:186\n106#1:187\n*E\n"})
/* renamed from: okio.-SegmentedByteString, reason: invalid class name */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class SegmentedByteString {
    private static final int DEFAULT__ByteString_size = 0;

    @org.jetbrains.annotations.NotNull
    private static final okio.Buffer.UnsafeCursor DEFAULT__new_UnsafeCursor = null;

    static {
            okio.Buffer$UnsafeCursor r0 = new okio.Buffer$UnsafeCursor
            r0.<init>()
            okio.SegmentedByteString.DEFAULT__new_UnsafeCursor = r0
            r0 = -1234567890(0xffffffffb669fd2e, float:-3.4867076E-6)
            okio.SegmentedByteString.DEFAULT__ByteString_size = r0
            return
    }

    public SegmentedByteString() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final int and(byte r0, int r1) {
            r0 = r0 & r1
            return r0
    }

    public static final long and(byte r2, long r3) {
            long r0 = (long) r2
            long r3 = r3 & r0
            return r3
    }

    public static final long and(int r2, long r3) {
            long r0 = (long) r2
            long r3 = r3 & r0
            return r3
    }

    public static final boolean arrayRangeEquals(@org.jetbrains.annotations.NotNull byte[] r4, int r5, @org.jetbrains.annotations.NotNull byte[] r6, int r7, int r8) {
            java.lang.String r0 = "a"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 0
            r1 = 0
        Lc:
            if (r1 >= r8) goto L1c
            int r2 = r1 + r5
            r2 = r4[r2]
            int r3 = r1 + r7
            r3 = r6[r3]
            if (r2 == r3) goto L19
            return r0
        L19:
            int r1 = r1 + 1
            goto Lc
        L1c:
            r4 = 1
            return r4
    }

    public static final void checkOffsetAndCount(long r5, long r7, long r9) {
            long r0 = r7 | r9
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L13
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L13
            long r0 = r5 - r7
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 < 0) goto L13
            return
        L13:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "size="
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " offset="
            r1.append(r5)
            r1.append(r7)
            java.lang.String r5 = " byteCount="
            r1.append(r5)
            r1.append(r9)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    public static final int getDEFAULT__ByteString_size() {
            int r0 = okio.SegmentedByteString.DEFAULT__ByteString_size
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer.UnsafeCursor getDEFAULT__new_UnsafeCursor() {
            okio.Buffer$UnsafeCursor r0 = okio.SegmentedByteString.DEFAULT__new_UnsafeCursor
            return r0
    }

    public static final int leftRotate(int r1, int r2) {
            int r0 = r1 << r2
            int r2 = 32 - r2
            int r1 = r1 >>> r2
            r1 = r1 | r0
            return r1
    }

    public static final long minOf(int r2, long r3) {
            long r0 = (long) r2
            long r2 = java.lang.Math.min(r0, r3)
            return r2
    }

    public static final long minOf(long r2, int r4) {
            long r0 = (long) r4
            long r2 = java.lang.Math.min(r2, r0)
            return r2
    }

    public static final int resolveDefaultParameter(@org.jetbrains.annotations.NotNull okio.ByteString r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = okio.SegmentedByteString.DEFAULT__ByteString_size
            if (r2 != r0) goto Le
            int r1 = r1.size()
            return r1
        Le:
            return r2
    }

    public static final int resolveDefaultParameter(@org.jetbrains.annotations.NotNull byte[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = okio.SegmentedByteString.DEFAULT__ByteString_size
            if (r2 != r0) goto Lb
            int r1 = r1.length
            return r1
        Lb:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer.UnsafeCursor resolveDefaultParameter(@org.jetbrains.annotations.NotNull okio.Buffer.UnsafeCursor r1) {
            java.lang.String r0 = "unsafeCursor"
            kotlin.jvm.internal.g0.p(r1, r0)
            okio.Buffer$UnsafeCursor r0 = okio.SegmentedByteString.DEFAULT__new_UnsafeCursor
            if (r1 != r0) goto Le
            okio.Buffer$UnsafeCursor r1 = new okio.Buffer$UnsafeCursor
            r1.<init>()
        Le:
            return r1
    }

    public static final int reverseBytes(int r2) {
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r2
            int r0 = r0 >>> 24
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r2
            int r1 = r1 >>> 8
            r0 = r0 | r1
            r1 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            int r1 = r1 << 8
            r0 = r0 | r1
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    public static final long reverseBytes(long r8) {
            r0 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r0 = r0 & r8
            r2 = 56
            long r0 = r0 >>> r2
            r3 = 71776119061217280(0xff000000000000, double:7.06327445644526E-304)
            long r3 = r3 & r8
            r5 = 40
            long r3 = r3 >>> r5
            long r0 = r0 | r3
            r3 = 280375465082880(0xff0000000000, double:1.38523885234213E-309)
            long r3 = r3 & r8
            r6 = 24
            long r3 = r3 >>> r6
            long r0 = r0 | r3
            r3 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r3 = r3 & r8
            r7 = 8
            long r3 = r3 >>> r7
            long r0 = r0 | r3
            r3 = 4278190080(0xff000000, double:2.113706745E-314)
            long r3 = r3 & r8
            long r3 = r3 << r7
            long r0 = r0 | r3
            r3 = 16711680(0xff0000, double:8.256667E-317)
            long r3 = r3 & r8
            long r3 = r3 << r6
            long r0 = r0 | r3
            r3 = 65280(0xff00, double:3.22526E-319)
            long r3 = r3 & r8
            long r3 = r3 << r5
            long r0 = r0 | r3
            r3 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r3
            long r8 = r8 << r2
            long r8 = r8 | r0
            return r8
    }

    public static final short reverseBytes(short r1) {
            r0 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r1
            int r0 = r0 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r1 = r1 | r0
            short r1 = (short) r1
            return r1
    }

    public static final long rightRotate(long r2, int r4) {
            long r0 = r2 >>> r4
            int r4 = 64 - r4
            long r2 = r2 << r4
            long r2 = r2 | r0
            return r2
    }

    public static final int shl(byte r0, int r1) {
            int r0 = r0 << r1
            return r0
    }

    public static final int shr(byte r0, int r1) {
            int r0 = r0 >> r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toHexString(byte r3) {
            char[] r0 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r1 = r3 >> 4
            r1 = r1 & 15
            char r0 = r0[r1]
            char[] r1 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r3 = r3 & 15
            char r3 = r1[r3]
            r1 = 2
            char[] r1 = new char[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r3
            java.lang.String r3 = kotlin.text.u.J1(r1)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toHexString(int r10) {
            if (r10 != 0) goto L5
            java.lang.String r10 = "0"
            return r10
        L5:
            char[] r0 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r1 = r10 >> 28
            r1 = r1 & 15
            char r0 = r0[r1]
            char[] r1 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r2 = r10 >> 24
            r2 = r2 & 15
            char r1 = r1[r2]
            char[] r2 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r3 = r10 >> 20
            r3 = r3 & 15
            char r2 = r2[r3]
            char[] r3 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r4 = r10 >> 16
            r4 = r4 & 15
            char r3 = r3[r4]
            char[] r4 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r5 = r10 >> 12
            r5 = r5 & 15
            char r4 = r4[r5]
            char[] r5 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r6 = r10 >> 8
            r6 = r6 & 15
            char r5 = r5[r6]
            char[] r6 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r7 = r10 >> 4
            r7 = r7 & 15
            char r6 = r6[r7]
            char[] r7 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r10 = r10 & 15
            char r10 = r7[r10]
            r7 = 8
            char[] r8 = new char[r7]
            r9 = 0
            r8[r9] = r0
            r0 = 1
            r8[r0] = r1
            r0 = 2
            r8[r0] = r2
            r0 = 3
            r8[r0] = r3
            r0 = 4
            r8[r0] = r4
            r0 = 5
            r8[r0] = r5
            r0 = 6
            r8[r0] = r6
            r0 = 7
            r8[r0] = r10
        L6f:
            if (r9 >= r7) goto L7a
            char r10 = r8[r9]
            r0 = 48
            if (r10 != r0) goto L7a
            int r9 = r9 + 1
            goto L6f
        L7a:
            java.lang.String r10 = kotlin.text.u.K1(r8, r9, r7)
            return r10
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toHexString(long r25) {
            r0 = 0
            int r2 = (r25 > r0 ? 1 : (r25 == r0 ? 0 : -1))
            if (r2 != 0) goto L9
            java.lang.String r0 = "0"
            return r0
        L9:
            char[] r0 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r1 = 60
            long r1 = r25 >> r1
            r3 = 15
            long r1 = r1 & r3
            int r2 = (int) r1
            char r0 = r0[r2]
            char[] r1 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r2 = 56
            long r5 = r25 >> r2
            long r5 = r5 & r3
            int r2 = (int) r5
            char r1 = r1[r2]
            char[] r2 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r5 = 52
            long r5 = r25 >> r5
            long r5 = r5 & r3
            int r6 = (int) r5
            char r2 = r2[r6]
            char[] r5 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r6 = 48
            long r7 = r25 >> r6
            long r7 = r7 & r3
            int r8 = (int) r7
            char r5 = r5[r8]
            char[] r7 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r8 = 44
            long r8 = r25 >> r8
            long r8 = r8 & r3
            int r9 = (int) r8
            char r7 = r7[r9]
            char[] r8 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r9 = 40
            long r9 = r25 >> r9
            long r9 = r9 & r3
            int r10 = (int) r9
            char r8 = r8[r10]
            char[] r9 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r10 = 36
            long r10 = r25 >> r10
            long r10 = r10 & r3
            int r11 = (int) r10
            char r9 = r9[r11]
            char[] r10 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r11 = 32
            long r11 = r25 >> r11
            long r11 = r11 & r3
            int r12 = (int) r11
            char r10 = r10[r12]
            char[] r11 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r12 = 28
            long r12 = r25 >> r12
            long r12 = r12 & r3
            int r13 = (int) r12
            char r11 = r11[r13]
            char[] r12 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r13 = 24
            long r13 = r25 >> r13
            long r13 = r13 & r3
            int r14 = (int) r13
            char r12 = r12[r14]
            char[] r13 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r14 = 20
            long r14 = r25 >> r14
            long r14 = r14 & r3
            int r15 = (int) r14
            char r13 = r13[r15]
            char[] r14 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r15 = 16
            long r16 = r25 >> r15
            r18 = r3
            long r3 = r16 & r18
            int r4 = (int) r3
            char r3 = r14[r4]
            char[] r4 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r14 = 12
            long r16 = r25 >> r14
            r20 = r7
            long r6 = r16 & r18
            int r7 = (int) r6
            char r4 = r4[r7]
            char[] r6 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r7 = 8
            long r16 = r25 >> r7
            r21 = r8
            r22 = 8
            long r7 = r16 & r18
            int r8 = (int) r7
            char r6 = r6[r8]
            char[] r7 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r8 = 4
            long r16 = r25 >> r8
            r23 = r9
            r24 = 4
            long r8 = r16 & r18
            int r9 = (int) r8
            char r7 = r7[r9]
            char[] r8 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r16 = 12
            long r14 = r25 & r18
            int r15 = (int) r14
            char r8 = r8[r15]
            r9 = 16
            char[] r14 = new char[r9]
            r15 = 0
            r14[r15] = r0
            r0 = 1
            r14[r0] = r1
            r0 = 2
            r14[r0] = r2
            r0 = 3
            r14[r0] = r5
            r14[r24] = r20
            r0 = 5
            r14[r0] = r21
            r0 = 6
            r14[r0] = r23
            r0 = 7
            r14[r0] = r10
            r14[r22] = r11
            r0 = 9
            r14[r0] = r12
            r0 = 10
            r14[r0] = r13
            r0 = 11
            r14[r0] = r3
            r14[r16] = r4
            r0 = 13
            r14[r0] = r6
            r0 = 14
            r14[r0] = r7
            r0 = 15
            r14[r0] = r8
            r9 = 16
        L112:
            if (r15 >= r9) goto L11d
            char r0 = r14[r15]
            r1 = 48
            if (r0 != r1) goto L11d
            int r15 = r15 + 1
            goto L112
        L11d:
            java.lang.String r0 = kotlin.text.u.K1(r14, r15, r9)
            return r0
    }

    public static final byte xor(byte r0, byte r1) {
            r0 = r0 ^ r1
            byte r0 = (byte) r0
            return r0
    }
}
