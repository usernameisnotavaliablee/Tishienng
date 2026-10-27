package com.bytedance.pangle.util.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class cw {
    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int cw(java.nio.ByteBuffer r7) {
            r(r7)
            int r0 = r7.capacity()
            r1 = -1
            r2 = 22
            if (r0 >= r2) goto Ld
            return r1
        Ld:
            int r0 = r0 - r2
            r2 = 65535(0xffff, float:9.1834E-41)
            int r2 = java.lang.Math.min(r0, r2)
            r3 = 0
        L16:
            if (r3 > r2) goto L2f
            int r4 = r0 - r3
            int r5 = r7.getInt(r4)
            r6 = 101010256(0x6054b50, float:2.506985E-35)
            if (r5 != r6) goto L2c
            int r5 = r4 + 20
            int r5 = j(r7, r5)
            if (r5 != r3) goto L2c
            return r4
        L2c:
            int r3 = r3 + 1
            goto L16
        L2f:
            return r1
    }

    private static int j(java.nio.ByteBuffer r0, int r1) {
            short r0 = r0.getShort(r1)
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            return r0
    }

    public static long j(java.nio.ByteBuffer r2) {
            r(r2)
            int r0 = r2.position()
            int r0 = r0 + 16
            long r0 = xt(r2, r0)
            return r0
    }

    static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> j(java.io.RandomAccessFile r5) throws java.io.IOException {
            long r0 = r5.length()
            r2 = 22
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lc
            r5 = 0
            return r5
        Lc:
            r0 = 0
            android.util.Pair r0 = j(r5, r0)
            if (r0 == 0) goto L14
            return r0
        L14:
            r0 = 65535(0xffff, float:9.1834E-41)
            android.util.Pair r5 = j(r5, r0)
            return r5
    }

    private static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> j(java.io.RandomAccessFile r7, int r8) throws java.io.IOException {
            if (r8 < 0) goto L5b
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r8 > r0) goto L5b
            long r0 = r7.length()
            r2 = 0
            r3 = 22
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L13
            return r2
        L13:
            long r5 = (long) r8
            long r3 = r0 - r3
            long r3 = java.lang.Math.min(r5, r3)
            int r8 = (int) r3
            int r8 = r8 + 22
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r8.order(r3)
            int r4 = r8.capacity()
            long r4 = (long) r4
            long r0 = r0 - r4
            r7.seek(r0)
            byte[] r4 = r8.array()
            int r5 = r8.arrayOffset()
            int r6 = r8.capacity()
            r7.readFully(r4, r5, r6)
            int r7 = cw(r8)
            r4 = -1
            if (r7 != r4) goto L46
            return r2
        L46:
            r8.position(r7)
            java.nio.ByteBuffer r8 = r8.slice()
            r8.order(r3)
            long r2 = (long) r7
            long r0 = r0 + r2
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            android.util.Pair r7 = android.util.Pair.create(r8, r7)
            return r7
        L5b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "maxCommentSize: "
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r8 = r0.concat(r8)
            r7.<init>(r8)
            throw r7
    }

    public static void j(java.util.zip.ZipFile r0) {
            if (r0 != 0) goto L3
            return
        L3:
            r0.close()     // Catch: java.lang.Throwable -> L6
        L6:
            return
    }

    public static final boolean j(java.io.RandomAccessFile r4, long r5) throws java.io.IOException {
            r0 = 20
            long r5 = r5 - r0
            r0 = 0
            r2 = 0
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 >= 0) goto Lb
            return r2
        Lb:
            r4.seek(r5)
            int r4 = r4.readInt()
            r5 = 1347094023(0x504b0607, float:1.3624679E10)
            if (r4 != r5) goto L19
            r4 = 1
            return r4
        L19:
            return r2
    }

    private static void r(java.nio.ByteBuffer r1) {
            java.nio.ByteOrder r1 = r1.order()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r1 != r0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ByteBuffer byte order must be little endian"
            r1.<init>(r0)
            throw r1
    }

    public static long xt(java.nio.ByteBuffer r2) {
            r(r2)
            int r0 = r2.position()
            int r0 = r0 + 12
            long r0 = xt(r2, r0)
            return r0
    }

    private static long xt(java.nio.ByteBuffer r2, int r3) {
            int r2 = r2.getInt(r3)
            long r2 = (long) r2
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            return r2
    }
}
