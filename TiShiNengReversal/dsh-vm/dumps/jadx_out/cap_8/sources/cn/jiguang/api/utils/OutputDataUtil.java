package cn.jiguang.api.utils;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class OutputDataUtil {
    private static final java.lang.String TAG = "OutputDataUtil";
    private static final java.math.BigInteger TWO_64 = null;
    private byte[] array;
    private int pos;
    private int saved_pos;

    static {
            java.math.BigInteger r0 = java.math.BigInteger.ONE
            r1 = 64
            java.math.BigInteger r0 = r0.shiftLeft(r1)
            cn.jiguang.api.utils.OutputDataUtil.TWO_64 = r0
            return
    }

    public OutputDataUtil() {
            r1 = this;
            r0 = 32
            r1.<init>(r0)
            return
    }

    public OutputDataUtil(int r1) {
            r0 = this;
            r0.<init>()
            byte[] r1 = new byte[r1]
            r0.array = r1
            r1 = 0
            r0.pos = r1
            r1 = -1
            r0.saved_pos = r1
            return
    }

    private void check(long r6, int r8) {
            r5 = this;
            r0 = 1
            long r0 = r0 << r8
            r2 = 0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 < 0) goto Lf
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto Le
            goto Lf
        Le:
            return
        Lf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = " out of range for "
            r2.append(r6)
            r2.append(r8)
            java.lang.String r6 = " bit value max:"
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
            java.lang.String r7 = "OutputDataUtil"
            cn.jiguang.at.d.c(r7, r6)
            return
    }

    public static int encodeZigZag32(int r1) {
            int r0 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r0
            return r1
    }

    public static long encodeZigZag64(long r3) {
            r0 = 1
            long r0 = r3 << r0
            r2 = 63
            long r3 = r3 >> r2
            long r3 = r3 ^ r0
            return r3
    }

    private void need(int r5) {
            r4 = this;
            byte[] r0 = r4.array
            int r1 = r0.length
            int r2 = r4.pos
            int r1 = r1 - r2
            if (r1 < r5) goto L9
            return
        L9:
            int r1 = r0.length
            int r1 = r1 * 2
            int r3 = r2 + r5
            if (r1 >= r3) goto L12
            int r1 = r2 + r5
        L12:
            byte[] r5 = new byte[r1]
            r1 = 0
            java.lang.System.arraycopy(r0, r1, r5, r1, r2)
            r4.array = r5
            return
    }

    public int current() {
            r1 = this;
            int r0 = r1.pos
            return r0
    }

    public void jump(int r2) {
            r1 = this;
            int r0 = r1.pos
            if (r2 > r0) goto L7
            r1.pos = r2
            return
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "cannot jump past end of data"
            r2.<init>(r0)
            throw r2
    }

    public void restore() {
            r2 = this;
            int r0 = r2.saved_pos
            if (r0 < 0) goto La
            r2.pos = r0
            r0 = -1
            r2.saved_pos = r0
            return
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "no previous state"
            r0.<init>(r1)
            throw r0
    }

    public void save() {
            r1 = this;
            int r0 = r1.pos
            r1.saved_pos = r0
            return
    }

    public byte[] toByteArray() {
            r4 = this;
            int r0 = r4.pos
            byte[] r1 = new byte[r0]
            byte[] r2 = r4.array
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            return r1
    }

    public void writeByteArray(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.writeByteArray(r3, r0, r1)
            return
    }

    public void writeByteArray(byte[] r3, int r4, int r5) {
            r2 = this;
            r2.need(r5)
            byte[] r0 = r2.array
            int r1 = r2.pos
            java.lang.System.arraycopy(r3, r4, r0, r1, r5)
            int r3 = r2.pos
            int r3 = r3 + r5
            r2.pos = r3
            return
    }

    public void writeByteArrayincludeLength(byte[] r3) {
            r2 = this;
            int r0 = r3.length
            r2.writeU16(r0)
            r0 = 0
            int r1 = r3.length
            r2.writeByteArray(r3, r0, r1)
            return
    }

    public void writeCountedString(byte[] r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 255(0xff, float:3.57E-43)
            if (r0 > r1) goto L1e
            int r0 = r5.length
            int r0 = r0 + 1
            r4.need(r0)
            byte[] r0 = r4.array
            int r2 = r4.pos
            int r3 = r2 + 1
            r4.pos = r3
            int r3 = r5.length
            r1 = r1 & r3
            byte r1 = (byte) r1
            r0[r2] = r1
            r0 = 0
            int r1 = r5.length
            r4.writeByteArray(r5, r0, r1)
            return
        L1e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid counted string"
            r5.<init>(r0)
            throw r5
    }

    public void writeRawLittleEndian16(int r5) {
            r4 = this;
            byte[] r0 = r4.array
            int r1 = r4.pos
            int r2 = r1 + 1
            r4.pos = r2
            r3 = r5 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r0[r1] = r3
            int r1 = r1 + 2
            r4.pos = r1
            int r5 = r5 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r0[r2] = r5
            return
    }

    public void writeRawLittleEndian32(int r6) {
            r5 = this;
            byte[] r0 = r5.array
            int r1 = r5.pos
            int r2 = r1 + 1
            r5.pos = r2
            r3 = r6 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r0[r1] = r3
            int r3 = r1 + 2
            r5.pos = r3
            int r4 = r6 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r0[r2] = r4
            int r2 = r1 + 3
            r5.pos = r2
            int r4 = r6 >> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r0[r3] = r4
            int r1 = r1 + 4
            r5.pos = r1
            int r6 = r6 >> 24
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r0[r2] = r6
            return
    }

    public void writeRawLittleEndian64(long r8) {
            r7 = this;
            byte[] r0 = r7.array
            int r1 = r7.pos
            int r2 = r1 + 1
            r7.pos = r2
            int r3 = (int) r8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r0[r1] = r3
            int r3 = r1 + 2
            r7.pos = r3
            r4 = 8
            long r5 = r8 >> r4
            int r6 = (int) r5
            r5 = r6 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r0[r2] = r5
            int r2 = r1 + 3
            r7.pos = r2
            r5 = 16
            long r5 = r8 >> r5
            int r6 = (int) r5
            r5 = r6 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r0[r3] = r5
            int r3 = r1 + 4
            r7.pos = r3
            r5 = 24
            long r5 = r8 >> r5
            int r6 = (int) r5
            r5 = r6 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r0[r2] = r5
            int r2 = r1 + 5
            r7.pos = r2
            r5 = 32
            long r5 = r8 >> r5
            int r6 = (int) r5
            r5 = r6 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r0[r3] = r5
            int r3 = r1 + 6
            r7.pos = r3
            r5 = 40
            long r5 = r8 >> r5
            int r6 = (int) r5
            r5 = r6 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r0[r2] = r5
            int r2 = r1 + 7
            r7.pos = r2
            r5 = 48
            long r5 = r8 >> r5
            int r6 = (int) r5
            r5 = r6 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r0[r3] = r5
            int r1 = r1 + r4
            r7.pos = r1
            r1 = 56
            long r8 = r8 >> r1
            int r9 = (int) r8
            r8 = r9 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r0[r2] = r8
            return
    }

    public void writeU16(int r6) {
            r5 = this;
            long r0 = (long) r6
            r2 = 16
            r5.check(r0, r2)
            r0 = 2
            r5.need(r0)
            byte[] r1 = r5.array
            int r2 = r5.pos
            int r3 = r2 + 1
            r5.pos = r3
            int r4 = r6 >>> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r2 + r0
            r5.pos = r2
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r1[r3] = r6
            return
    }

    public void writeU16At(int r4, int r5) {
            r3 = this;
            long r0 = (long) r4
            r2 = 16
            r3.check(r0, r2)
            int r0 = r3.pos
            int r0 = r0 + (-2)
            if (r5 > r0) goto L1d
            byte[] r0 = r3.array
            int r1 = r5 + 1
            int r2 = r4 >>> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0[r5] = r2
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r0[r1] = r4
            return
        L1d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "cannot write past end of data"
            r4.<init>(r5)
            throw r4
    }

    public void writeU32(long r11) {
            r10 = this;
            r0 = 32
            r10.check(r11, r0)
            r0 = 4
            r10.need(r0)
            byte[] r1 = r10.array
            int r2 = r10.pos
            int r3 = r2 + 1
            r10.pos = r3
            r4 = 24
            long r4 = r11 >>> r4
            r6 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r6
            int r5 = (int) r4
            byte r4 = (byte) r5
            r1[r2] = r4
            int r4 = r2 + 2
            r10.pos = r4
            r5 = 16
            long r8 = r11 >>> r5
            long r8 = r8 & r6
            int r5 = (int) r8
            byte r5 = (byte) r5
            r1[r3] = r5
            int r3 = r2 + 3
            r10.pos = r3
            r5 = 8
            long r8 = r11 >>> r5
            long r8 = r8 & r6
            int r5 = (int) r8
            byte r5 = (byte) r5
            r1[r4] = r5
            int r2 = r2 + r0
            r10.pos = r2
            long r11 = r11 & r6
            int r12 = (int) r11
            byte r11 = (byte) r12
            r1[r3] = r11
            return
    }

    public void writeU32At(long r9, int r11) {
            r8 = this;
            r0 = 32
            r8.check(r9, r0)
            int r0 = r8.pos
            int r0 = r0 + (-4)
            if (r11 > r0) goto L36
            byte[] r0 = r8.array
            int r1 = r11 + 1
            r2 = 24
            long r2 = r9 >>> r2
            r4 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r4
            int r3 = (int) r2
            byte r2 = (byte) r3
            r0[r11] = r2
            int r2 = r11 + 2
            r3 = 16
            long r6 = r9 >>> r3
            long r6 = r6 & r4
            int r3 = (int) r6
            byte r3 = (byte) r3
            r0[r1] = r3
            int r11 = r11 + 3
            r1 = 8
            long r6 = r9 >>> r1
            long r6 = r6 & r4
            int r1 = (int) r6
            byte r1 = (byte) r1
            r0[r2] = r1
            long r9 = r9 & r4
            int r10 = (int) r9
            byte r9 = (byte) r10
            r0[r11] = r9
            return
        L36:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "cannot write past end of data"
            r9.<init>(r10)
            throw r9
    }

    public void writeU64(long r11) {
            r10 = this;
            r0 = 8
            r10.need(r0)
            byte[] r1 = r10.array
            int r2 = r10.pos
            int r3 = r2 + 1
            r10.pos = r3
            r4 = 56
            long r4 = r11 >>> r4
            r6 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r6
            int r5 = (int) r4
            byte r4 = (byte) r5
            r1[r2] = r4
            int r4 = r2 + 2
            r10.pos = r4
            r5 = 48
            long r8 = r11 >>> r5
            long r8 = r8 & r6
            int r5 = (int) r8
            byte r5 = (byte) r5
            r1[r3] = r5
            int r3 = r2 + 3
            r10.pos = r3
            r5 = 40
            long r8 = r11 >>> r5
            long r8 = r8 & r6
            int r5 = (int) r8
            byte r5 = (byte) r5
            r1[r4] = r5
            int r4 = r2 + 4
            r10.pos = r4
            r5 = 32
            long r8 = r11 >>> r5
            long r8 = r8 & r6
            int r5 = (int) r8
            byte r5 = (byte) r5
            r1[r3] = r5
            int r3 = r2 + 5
            r10.pos = r3
            r5 = 24
            long r8 = r11 >>> r5
            long r8 = r8 & r6
            int r5 = (int) r8
            byte r5 = (byte) r5
            r1[r4] = r5
            int r4 = r2 + 6
            r10.pos = r4
            r5 = 16
            long r8 = r11 >>> r5
            long r8 = r8 & r6
            int r5 = (int) r8
            byte r5 = (byte) r5
            r1[r3] = r5
            int r3 = r2 + 7
            r10.pos = r3
            long r8 = r11 >>> r0
            long r8 = r8 & r6
            int r5 = (int) r8
            byte r5 = (byte) r5
            r1[r4] = r5
            int r2 = r2 + r0
            r10.pos = r2
            long r11 = r11 & r6
            int r12 = (int) r11
            byte r11 = (byte) r12
            r1[r3] = r11
            return
    }

    public void writeU64At(long r9, int r11) {
            r8 = this;
            byte[] r0 = r8.array
            int r1 = r11 + 1
            r2 = 56
            long r2 = r9 >>> r2
            r4 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r4
            int r3 = (int) r2
            byte r2 = (byte) r3
            r0[r11] = r2
            int r2 = r11 + 2
            r3 = 48
            long r6 = r9 >>> r3
            long r6 = r6 & r4
            int r3 = (int) r6
            byte r3 = (byte) r3
            r0[r1] = r3
            int r1 = r11 + 3
            r3 = 40
            long r6 = r9 >>> r3
            long r6 = r6 & r4
            int r3 = (int) r6
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r11 + 4
            r3 = 32
            long r6 = r9 >>> r3
            long r6 = r6 & r4
            int r3 = (int) r6
            byte r3 = (byte) r3
            r0[r1] = r3
            int r1 = r11 + 5
            r3 = 24
            long r6 = r9 >>> r3
            long r6 = r6 & r4
            int r3 = (int) r6
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r11 + 6
            r3 = 16
            long r6 = r9 >>> r3
            long r6 = r6 & r4
            int r3 = (int) r6
            byte r3 = (byte) r3
            r0[r1] = r3
            int r11 = r11 + 7
            r1 = 8
            long r6 = r9 >>> r1
            long r6 = r6 & r4
            int r1 = (int) r6
            byte r1 = (byte) r1
            r0[r2] = r1
            long r9 = r9 & r4
            int r10 = (int) r9
            byte r9 = (byte) r10
            r0[r11] = r9
            return
    }

    public void writeU8(int r4) {
            r3 = this;
            long r0 = (long) r4
            r2 = 8
            r3.check(r0, r2)
            r0 = 1
            r3.need(r0)
            byte[] r0 = r3.array
            int r1 = r3.pos
            int r2 = r1 + 1
            r3.pos = r2
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r0[r1] = r4
            return
    }

    public void writeU8At(int r4, int r5) {
            r3 = this;
            long r0 = (long) r4
            r2 = 8
            r3.check(r0, r2)
            int r0 = r3.pos
            int r0 = r0 + (-1)
            if (r5 > r0) goto L14
            byte[] r0 = r3.array
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r0[r5] = r4
            return
        L14:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "cannot write past end of data"
            r4.<init>(r5)
            throw r4
    }
}
