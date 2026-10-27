package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class Bzip2BitReader {
    private static final int MAX_COUNT_OF_READABLE_BYTES = 268435455;
    private long bitBuffer;
    private int bitCount;
    private io.netty.buffer.ByteBuf in;

    Bzip2BitReader() {
            r0 = this;
            r0.<init>()
            return
    }

    boolean hasReadableBits(int r4) {
            r3 = this;
            if (r4 < 0) goto L1c
            int r0 = r3.bitCount
            if (r0 >= r4) goto L1a
            io.netty.buffer.ByteBuf r0 = r3.in
            int r0 = r0.readableBytes()
            int r0 = r0 << 3
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            int r1 = r3.bitCount
            int r4 = r4 - r1
            if (r0 < r4) goto L18
            goto L1a
        L18:
            r4 = 0
            return r4
        L1a:
            r4 = 1
            return r4
        L1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "count: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " (expected value greater than 0)"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    boolean hasReadableBytes(int r5) {
            r4 = this;
            r0 = 268435455(0xfffffff, float:2.5243547E-29)
            if (r5 < 0) goto Le
            if (r5 > r0) goto Le
            int r5 = r5 << 3
            boolean r5 = r4.hasReadableBits(r5)
            return r5
        Le:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "count: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = " (expected: 0-"
            r2.append(r5)
            r2.append(r0)
            r5 = 41
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
    }

    boolean isReadable() {
            r1 = this;
            int r0 = r1.bitCount
            if (r0 > 0) goto Lf
            io.netty.buffer.ByteBuf r0 = r1.in
            boolean r0 = r0.isReadable()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    int readBits(int r9) {
            r8 = this;
            if (r9 < 0) goto L5a
            r0 = 32
            if (r9 > r0) goto L5a
            int r1 = r8.bitCount
            long r2 = r8.bitBuffer
            r4 = 1
            if (r1 >= r9) goto L46
            io.netty.buffer.ByteBuf r5 = r8.in
            int r5 = r5.readableBytes()
            if (r5 == r4) goto L38
            r6 = 2
            if (r5 == r6) goto L2e
            r6 = 3
            if (r5 == r6) goto L24
            io.netty.buffer.ByteBuf r5 = r8.in
            long r5 = r5.readUnsignedInt()
            r7 = 32
            goto L41
        L24:
            io.netty.buffer.ByteBuf r5 = r8.in
            int r5 = r5.readUnsignedMedium()
            long r5 = (long) r5
            r7 = 24
            goto L41
        L2e:
            io.netty.buffer.ByteBuf r5 = r8.in
            int r5 = r5.readUnsignedShort()
            long r5 = (long) r5
            r7 = 16
            goto L41
        L38:
            io.netty.buffer.ByteBuf r5 = r8.in
            short r5 = r5.readUnsignedByte()
            long r5 = (long) r5
            r7 = 8
        L41:
            long r2 = r2 << r7
            long r2 = r2 | r5
            int r1 = r1 + r7
            r8.bitBuffer = r2
        L46:
            int r1 = r1 - r9
            r8.bitCount = r1
            long r1 = r2 >>> r1
            if (r9 == r0) goto L52
            int r9 = r4 << r9
            int r9 = r9 - r4
            long r3 = (long) r9
            goto L57
        L52:
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
        L57:
            long r1 = r1 & r3
            int r9 = (int) r1
            return r9
        L5a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "count: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = " (expected: 0-32 )"
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
    }

    boolean readBoolean() {
            r2 = this;
            r0 = 1
            int r1 = r2.readBits(r0)
            if (r1 == 0) goto L8
            return r0
        L8:
            r0 = 0
            return r0
    }

    int readInt() {
            r1 = this;
            r0 = 32
            int r0 = r1.readBits(r0)
            return r0
    }

    void refill() {
            r6 = this;
            io.netty.buffer.ByteBuf r0 = r6.in
            short r0 = r0.readUnsignedByte()
            long r1 = r6.bitBuffer
            r3 = 8
            long r1 = r1 << r3
            long r4 = (long) r0
            long r1 = r1 | r4
            r6.bitBuffer = r1
            int r0 = r6.bitCount
            int r0 = r0 + r3
            r6.bitCount = r0
            return
    }

    void setByteBuf(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            r0.in = r1
            return
    }
}
