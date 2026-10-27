package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class Bzip2BitWriter {
    private long bitBuffer;
    private int bitCount;

    Bzip2BitWriter() {
            r0 = this;
            r0.<init>()
            return
    }

    void flush(io.netty.buffer.ByteBuf r6) {
            r5 = this;
            int r0 = r5.bitCount
            if (r0 <= 0) goto L38
            long r1 = r5.bitBuffer
            int r3 = 64 - r0
            r4 = 8
            if (r0 > r4) goto L15
            long r1 = r1 >>> r3
            int r4 = r4 - r0
            long r0 = r1 << r4
            int r1 = (int) r0
            r6.writeByte(r1)
            return
        L15:
            r4 = 16
            if (r0 > r4) goto L22
            long r1 = r1 >>> r3
            int r4 = r4 - r0
            long r0 = r1 << r4
            int r1 = (int) r0
            r6.writeShort(r1)
            return
        L22:
            r4 = 24
            if (r0 > r4) goto L2f
            long r1 = r1 >>> r3
            int r4 = r4 - r0
            long r0 = r1 << r4
            int r1 = (int) r0
            r6.writeMedium(r1)
            return
        L2f:
            long r1 = r1 >>> r3
            int r0 = 32 - r0
            long r0 = r1 << r0
            int r1 = (int) r0
            r6.writeInt(r1)
        L38:
            return
    }

    void writeBits(io.netty.buffer.ByteBuf r6, int r7, long r8) {
            r5 = this;
            if (r7 < 0) goto L20
            r0 = 32
            if (r7 > r0) goto L20
            int r1 = r5.bitCount
            long r2 = r5.bitBuffer
            int r4 = 64 - r7
            long r8 = r8 << r4
            long r8 = r8 >>> r1
            long r8 = r8 | r2
            int r1 = r1 + r7
            if (r1 < r0) goto L1b
            long r2 = r8 >>> r0
            int r7 = (int) r2
            r6.writeInt(r7)
            long r8 = r8 << r0
            int r1 = r1 + (-32)
        L1b:
            r5.bitBuffer = r8
            r5.bitCount = r1
            return
        L20:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "count: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = " (expected: 0-32)"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
    }

    void writeBoolean(io.netty.buffer.ByteBuf r8, boolean r9) {
            r7 = this;
            int r0 = r7.bitCount
            int r0 = r0 + 1
            long r1 = r7.bitBuffer
            r3 = 0
            if (r9 == 0) goto L10
            int r9 = 64 - r0
            r5 = 1
            long r5 = r5 << r9
            goto L11
        L10:
            r5 = r3
        L11:
            long r1 = r1 | r5
            r9 = 32
            if (r0 != r9) goto L1e
            long r0 = r1 >>> r9
            int r9 = (int) r0
            r8.writeInt(r9)
            r0 = 0
            goto L1f
        L1e:
            r3 = r1
        L1f:
            r7.bitBuffer = r3
            r7.bitCount = r0
            return
    }

    void writeInt(io.netty.buffer.ByteBuf r4, int r5) {
            r3 = this;
            r0 = 32
            long r1 = (long) r5
            r3.writeBits(r4, r0, r1)
            return
    }

    void writeUnary(io.netty.buffer.ByteBuf r3, int r4) {
            r2 = this;
            if (r4 < 0) goto L11
        L2:
            int r0 = r4 + (-1)
            if (r4 <= 0) goto Lc
            r4 = 1
            r2.writeBoolean(r3, r4)
            r4 = r0
            goto L2
        Lc:
            r4 = 0
            r2.writeBoolean(r3, r4)
            return
        L11:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "value: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " (expected 0 or more)"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }
}
