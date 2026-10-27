package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class Bzip2BlockCompressor {
    private final byte[] block;
    private int blockLength;
    private final int blockLengthLimit;
    private final boolean[] blockValuesPresent;
    private final int[] bwtBlock;
    private final io.netty.handler.codec.compression.Crc32 crc;
    private int rleCurrentValue;
    private int rleLength;
    private final io.netty.util.ByteProcessor writeProcessor;
    private final io.netty.handler.codec.compression.Bzip2BitWriter writer;


    Bzip2BlockCompressor(io.netty.handler.codec.compression.Bzip2BitWriter r2, int r3) {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.compression.Bzip2BlockCompressor$1 r0 = new io.netty.handler.codec.compression.Bzip2BlockCompressor$1
            r0.<init>(r1)
            r1.writeProcessor = r0
            io.netty.handler.codec.compression.Crc32 r0 = new io.netty.handler.codec.compression.Crc32
            r0.<init>()
            r1.crc = r0
            r0 = 256(0x100, float:3.59E-43)
            boolean[] r0 = new boolean[r0]
            r1.blockValuesPresent = r0
            r0 = -1
            r1.rleCurrentValue = r0
            r1.writer = r2
            int r2 = r3 + 1
            byte[] r0 = new byte[r2]
            r1.block = r0
            int[] r2 = new int[r2]
            r1.bwtBlock = r2
            int r3 = r3 + (-6)
            r1.blockLengthLimit = r3
            return
    }

    private void writeRun(int r5, int r6) {
            r4 = this;
            int r0 = r4.blockLength
            byte[] r1 = r4.block
            boolean[] r2 = r4.blockValuesPresent
            r3 = 1
            r2[r5] = r3
            io.netty.handler.codec.compression.Crc32 r2 = r4.crc
            r2.updateCRC(r5, r6)
            byte r5 = (byte) r5
            if (r6 == r3) goto L4d
            r2 = 2
            if (r6 == r2) goto L43
            r2 = 3
            if (r6 == r2) goto L35
            int r6 = r6 + (-4)
            boolean[] r2 = r4.blockValuesPresent
            r2[r6] = r3
            r1[r0] = r5
            int r2 = r0 + 1
            r1[r2] = r5
            int r2 = r0 + 2
            r1[r2] = r5
            int r2 = r0 + 3
            r1[r2] = r5
            int r5 = r0 + 4
            byte r6 = (byte) r6
            r1[r5] = r6
            int r0 = r0 + 5
            r4.blockLength = r0
            return
        L35:
            r1[r0] = r5
            int r6 = r0 + 1
            r1[r6] = r5
            int r6 = r0 + 2
            r1[r6] = r5
            int r0 = r0 + r2
            r4.blockLength = r0
            return
        L43:
            r1[r0] = r5
            int r6 = r0 + 1
            r1[r6] = r5
            int r0 = r0 + r2
            r4.blockLength = r0
            return
        L4d:
            r1[r0] = r5
            int r0 = r0 + r3
            r4.blockLength = r0
            return
    }

    private void writeSymbolMap(io.netty.buffer.ByteBuf r11) {
            r10 = this;
            io.netty.handler.codec.compression.Bzip2BitWriter r0 = r10.writer
            boolean[] r1 = r10.blockValuesPresent
            r2 = 16
            boolean[] r3 = new boolean[r2]
            r4 = 0
            r5 = 0
        La:
            r6 = 1
            if (r5 >= r2) goto L20
            int r7 = r5 << 4
            r8 = 0
        L10:
            if (r8 >= r2) goto L1d
            boolean r9 = r1[r7]
            if (r9 == 0) goto L18
            r3[r5] = r6
        L18:
            int r8 = r8 + 1
            int r7 = r7 + 1
            goto L10
        L1d:
            int r5 = r5 + 1
            goto La
        L20:
            r5 = 0
        L21:
            if (r5 >= r2) goto L2b
            boolean r7 = r3[r5]
            r0.writeBoolean(r11, r7)
            int r5 = r5 + 1
            goto L21
        L2b:
            r5 = 0
        L2c:
            if (r5 >= r2) goto L43
            boolean r7 = r3[r5]
            if (r7 == 0) goto L40
            int r7 = r5 << 4
            r8 = 0
        L35:
            if (r8 >= r2) goto L40
            boolean r9 = r1[r7]
            r0.writeBoolean(r11, r9)
            int r8 = r8 + 1
            int r7 = r7 + r6
            goto L35
        L40:
            int r5 = r5 + 1
            goto L2c
        L43:
            return
    }

    int availableSize() {
            r2 = this;
            int r0 = r2.blockLength
            if (r0 != 0) goto L9
            int r0 = r2.blockLengthLimit
            int r0 = r0 + 2
            return r0
        L9:
            int r1 = r2.blockLengthLimit
            int r1 = r1 - r0
            int r1 = r1 + 1
            return r1
    }

    void close(io.netty.buffer.ByteBuf r10) {
            r9 = this;
            int r0 = r9.rleLength
            if (r0 <= 0) goto Lb
            int r1 = r9.rleCurrentValue
            r1 = r1 & 255(0xff, float:3.57E-43)
            r9.writeRun(r1, r0)
        Lb:
            byte[] r0 = r9.block
            int r1 = r9.blockLength
            r2 = 0
            r3 = r0[r2]
            r0[r1] = r3
            io.netty.handler.codec.compression.Bzip2DivSufSort r0 = new io.netty.handler.codec.compression.Bzip2DivSufSort
            byte[] r1 = r9.block
            int[] r3 = r9.bwtBlock
            int r4 = r9.blockLength
            r0.<init>(r1, r3, r4)
            int r0 = r0.bwt()
            io.netty.handler.codec.compression.Bzip2BitWriter r4 = r9.writer
            r5 = 3227993(0x314159, double:1.5948404E-317)
            r1 = 24
            r4.writeBits(r10, r1, r5)
            r5 = 2511705(0x265359, double:1.240947E-317)
            r4.writeBits(r10, r1, r5)
            io.netty.handler.codec.compression.Crc32 r3 = r9.crc
            int r3 = r3.getCRC()
            r4.writeInt(r10, r3)
            r4.writeBoolean(r10, r2)
            long r2 = (long) r0
            r4.writeBits(r10, r1, r2)
            r9.writeSymbolMap(r10)
            io.netty.handler.codec.compression.Bzip2MTFAndRLE2StageEncoder r0 = new io.netty.handler.codec.compression.Bzip2MTFAndRLE2StageEncoder
            int[] r1 = r9.bwtBlock
            int r2 = r9.blockLength
            boolean[] r3 = r9.blockValuesPresent
            r0.<init>(r1, r2, r3)
            r0.encode()
            io.netty.handler.codec.compression.Bzip2HuffmanStageEncoder r3 = new io.netty.handler.codec.compression.Bzip2HuffmanStageEncoder
            char[] r5 = r0.mtfBlock()
            int r6 = r0.mtfLength()
            int r7 = r0.mtfAlphabetSize()
            int[] r8 = r0.mtfSymbolFrequencies()
            r3.<init>(r4, r5, r6, r7, r8)
            r3.encode(r10)
            return
    }

    int crc() {
            r1 = this;
            io.netty.handler.codec.compression.Crc32 r0 = r1.crc
            int r0 = r0.getCRC()
            return r0
    }

    boolean isEmpty() {
            r1 = this;
            int r0 = r1.blockLength
            if (r0 != 0) goto La
            int r0 = r1.rleLength
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    boolean isFull() {
            r2 = this;
            int r0 = r2.blockLength
            int r1 = r2.blockLengthLimit
            if (r0 <= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    int write(io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r1 = this;
            io.netty.util.ByteProcessor r0 = r1.writeProcessor
            int r2 = r2.forEachByte(r3, r4, r0)
            r0 = -1
            if (r2 != r0) goto La
            return r4
        La:
            int r2 = r2 - r3
            return r2
    }

    boolean write(int r6) {
            r5 = this;
            int r0 = r5.blockLength
            int r1 = r5.blockLengthLimit
            r2 = 0
            if (r0 <= r1) goto L8
            return r2
        L8:
            int r0 = r5.rleCurrentValue
            int r1 = r5.rleLength
            r3 = 1
            if (r1 != 0) goto L14
            r5.rleCurrentValue = r6
            r5.rleLength = r3
            goto L30
        L14:
            r4 = 255(0xff, float:3.57E-43)
            if (r0 == r6) goto L21
            r0 = r0 & r4
            r5.writeRun(r0, r1)
            r5.rleCurrentValue = r6
            r5.rleLength = r3
            goto L30
        L21:
            r6 = 254(0xfe, float:3.56E-43)
            if (r1 != r6) goto L2d
            r6 = r0 & 255(0xff, float:3.57E-43)
            r5.writeRun(r6, r4)
            r5.rleLength = r2
            goto L30
        L2d:
            int r1 = r1 + r3
            r5.rleLength = r1
        L30:
            return r3
    }
}
