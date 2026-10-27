package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class HeapByteBufUtil {
    private HeapByteBufUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static byte getByte(byte[] r0, int r1) {
            r0 = r0[r1]
            return r0
    }

    static int getInt(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }

    static int getIntLE(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    static long getLong(byte[] r7, int r8) {
            r0 = r7[r8]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            r4 = 56
            long r0 = r0 << r4
            int r4 = r8 + 1
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 48
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 2
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 40
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 3
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 32
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 4
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 24
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 5
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 16
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 6
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 8
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r8 = r8 + 7
            r7 = r7[r8]
            long r7 = (long) r7
            long r7 = r7 & r2
            long r7 = r7 | r0
            return r7
    }

    static long getLongLE(byte[] r7, int r8) {
            r0 = r7[r8]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            int r4 = r8 + 1
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 8
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 2
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 16
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 3
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 24
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 4
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 32
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 5
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 40
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 6
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 48
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r8 = r8 + 7
            r7 = r7[r8]
            long r7 = (long) r7
            long r7 = r7 & r2
            r2 = 56
            long r7 = r7 << r2
            long r7 = r7 | r0
            return r7
    }

    static short getShort(byte[] r1, int r2) {
            r0 = r1[r2]
            int r0 = r0 << 8
            int r2 = r2 + 1
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            short r1 = (short) r1
            return r1
    }

    static short getShortLE(byte[] r1, int r2) {
            r0 = r1[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r2 + 1
            r1 = r1[r2]
            int r1 = r1 << 8
            r1 = r1 | r0
            short r1 = (short) r1
            return r1
    }

    static int getUnsignedMedium(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r3 = r3 + 2
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }

    static int getUnsignedMediumLE(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r3 = r3 + 2
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r2 = r2 | r0
            return r2
    }

    static void setByte(byte[] r0, int r1, int r2) {
            byte r2 = (byte) r2
            r0[r1] = r2
            return
    }

    static void setInt(byte[] r2, int r3, int r4) {
            int r0 = r4 >>> 24
            byte r0 = (byte) r0
            r2[r3] = r0
            int r0 = r3 + 1
            int r1 = r4 >>> 16
            byte r1 = (byte) r1
            r2[r0] = r1
            int r0 = r3 + 2
            int r1 = r4 >>> 8
            byte r1 = (byte) r1
            r2[r0] = r1
            int r3 = r3 + 3
            byte r4 = (byte) r4
            r2[r3] = r4
            return
    }

    static void setIntLE(byte[] r2, int r3, int r4) {
            byte r0 = (byte) r4
            r2[r3] = r0
            int r0 = r3 + 1
            int r1 = r4 >>> 8
            byte r1 = (byte) r1
            r2[r0] = r1
            int r0 = r3 + 2
            int r1 = r4 >>> 16
            byte r1 = (byte) r1
            r2[r0] = r1
            int r3 = r3 + 3
            int r4 = r4 >>> 24
            byte r4 = (byte) r4
            r2[r3] = r4
            return
    }

    static void setLong(byte[] r3, int r4, long r5) {
            r0 = 56
            long r0 = r5 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            r3[r4] = r0
            int r0 = r4 + 1
            r1 = 48
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            r3[r0] = r1
            int r0 = r4 + 2
            r1 = 40
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            r3[r0] = r1
            int r0 = r4 + 3
            r1 = 32
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            r3[r0] = r1
            int r0 = r4 + 4
            r1 = 24
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            r3[r0] = r1
            int r0 = r4 + 5
            r1 = 16
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            r3[r0] = r1
            int r0 = r4 + 6
            r1 = 8
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            r3[r0] = r1
            int r4 = r4 + 7
            int r6 = (int) r5
            byte r5 = (byte) r6
            r3[r4] = r5
            return
    }

    static void setLongLE(byte[] r3, int r4, long r5) {
            int r0 = (int) r5
            byte r0 = (byte) r0
            r3[r4] = r0
            int r0 = r4 + 1
            r1 = 8
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            r3[r0] = r1
            int r0 = r4 + 2
            r1 = 16
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            r3[r0] = r1
            int r0 = r4 + 3
            r1 = 24
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            r3[r0] = r1
            int r0 = r4 + 4
            r1 = 32
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            r3[r0] = r1
            int r0 = r4 + 5
            r1 = 40
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            r3[r0] = r1
            int r0 = r4 + 6
            r1 = 48
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            r3[r0] = r1
            int r4 = r4 + 7
            r0 = 56
            long r5 = r5 >>> r0
            int r6 = (int) r5
            byte r5 = (byte) r6
            r3[r4] = r5
            return
    }

    static void setMedium(byte[] r2, int r3, int r4) {
            int r0 = r4 >>> 16
            byte r0 = (byte) r0
            r2[r3] = r0
            int r0 = r3 + 1
            int r1 = r4 >>> 8
            byte r1 = (byte) r1
            r2[r0] = r1
            int r3 = r3 + 2
            byte r4 = (byte) r4
            r2[r3] = r4
            return
    }

    static void setMediumLE(byte[] r2, int r3, int r4) {
            byte r0 = (byte) r4
            r2[r3] = r0
            int r0 = r3 + 1
            int r1 = r4 >>> 8
            byte r1 = (byte) r1
            r2[r0] = r1
            int r3 = r3 + 2
            int r4 = r4 >>> 16
            byte r4 = (byte) r4
            r2[r3] = r4
            return
    }

    static void setShort(byte[] r1, int r2, int r3) {
            int r0 = r3 >>> 8
            byte r0 = (byte) r0
            r1[r2] = r0
            int r2 = r2 + 1
            byte r3 = (byte) r3
            r1[r2] = r3
            return
    }

    static void setShortLE(byte[] r1, int r2, int r3) {
            byte r0 = (byte) r3
            r1[r2] = r0
            int r2 = r2 + 1
            int r3 = r3 >>> 8
            byte r3 = (byte) r3
            r1[r2] = r3
            return
    }
}
