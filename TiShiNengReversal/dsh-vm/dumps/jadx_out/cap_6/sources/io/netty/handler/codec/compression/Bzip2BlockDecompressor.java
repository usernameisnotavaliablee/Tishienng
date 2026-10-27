package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class Bzip2BlockDecompressor {
    private final int blockCRC;
    private final boolean blockRandomised;
    private final byte[] bwtBlock;
    private int bwtBlockLength;
    private final int[] bwtByteCounts;
    private int bwtBytesDecoded;
    private int bwtCurrentMergedPointer;
    private int[] bwtMergedPointers;
    private final int bwtStartPointer;
    private final io.netty.handler.codec.compression.Crc32 crc;
    int huffmanEndOfBlockSymbol;
    int huffmanInUse16;
    final byte[] huffmanSymbolMap;
    private int mtfValue;
    private int randomCount;
    private int randomIndex;
    private final io.netty.handler.codec.compression.Bzip2BitReader reader;
    private int repeatCount;
    private int repeatIncrement;
    private int rleAccumulator;
    private int rleLastDecodedByte;
    private int rleRepeat;
    private final io.netty.handler.codec.compression.Bzip2MoveToFrontTable symbolMTF;

    Bzip2BlockDecompressor(int r3, int r4, boolean r5, int r6, io.netty.handler.codec.compression.Bzip2BitReader r7) {
            r2 = this;
            r2.<init>()
            io.netty.handler.codec.compression.Crc32 r0 = new io.netty.handler.codec.compression.Crc32
            r0.<init>()
            r2.crc = r0
            r0 = 256(0x100, float:3.59E-43)
            byte[] r1 = new byte[r0]
            r2.huffmanSymbolMap = r1
            int[] r0 = new int[r0]
            r2.bwtByteCounts = r0
            r0 = -1
            r2.rleLastDecodedByte = r0
            r0 = 0
            int r0 = io.netty.handler.codec.compression.Bzip2Rand.rNums(r0)
            r1 = 1
            int r0 = r0 - r1
            r2.randomCount = r0
            io.netty.handler.codec.compression.Bzip2MoveToFrontTable r0 = new io.netty.handler.codec.compression.Bzip2MoveToFrontTable
            r0.<init>()
            r2.symbolMTF = r0
            r2.repeatIncrement = r1
            byte[] r3 = new byte[r3]
            r2.bwtBlock = r3
            r2.blockCRC = r4
            r2.blockRandomised = r5
            r2.bwtStartPointer = r6
            r2.reader = r7
            return
    }

    private int decodeNextBWTByte() {
            r3 = this;
            int r0 = r3.bwtCurrentMergedPointer
            r1 = r0 & 255(0xff, float:3.57E-43)
            int[] r2 = r3.bwtMergedPointers
            int r0 = r0 >>> 8
            r0 = r2[r0]
            r3.bwtCurrentMergedPointer = r0
            boolean r0 = r3.blockRandomised
            if (r0 == 0) goto L28
            int r0 = r3.randomCount
            int r0 = r0 + (-1)
            r3.randomCount = r0
            if (r0 != 0) goto L28
            r1 = r1 ^ 1
            int r0 = r3.randomIndex
            int r0 = r0 + 1
            int r0 = r0 % 512
            r3.randomIndex = r0
            int r0 = io.netty.handler.codec.compression.Bzip2Rand.rNums(r0)
            r3.randomCount = r0
        L28:
            int r0 = r3.bwtBytesDecoded
            int r0 = r0 + 1
            r3.bwtBytesDecoded = r0
            return r1
    }

    private void initialiseInverseBWT() {
            r9 = this;
            int r0 = r9.bwtStartPointer
            byte[] r1 = r9.bwtBlock
            int r2 = r9.bwtBlockLength
            int[] r3 = new int[r2]
            r4 = 256(0x100, float:3.59E-43)
            int[] r4 = new int[r4]
            if (r0 < 0) goto L44
            if (r0 >= r2) goto L44
            int[] r2 = r9.bwtByteCounts
            r5 = 0
            r6 = 1
            r7 = 255(0xff, float:3.57E-43)
            java.lang.System.arraycopy(r2, r5, r4, r6, r7)
            r2 = 2
        L1a:
            if (r2 > r7) goto L28
            r6 = r4[r2]
            int r8 = r2 + (-1)
            r8 = r4[r8]
            int r6 = r6 + r8
            r4[r2] = r6
            int r2 = r2 + 1
            goto L1a
        L28:
            int r2 = r9.bwtBlockLength
            if (r5 >= r2) goto L3d
            r2 = r1[r5]
            r2 = r2 & r7
            r6 = r4[r2]
            int r8 = r6 + 1
            r4[r2] = r8
            int r8 = r5 << 8
            int r8 = r8 + r2
            r3[r6] = r8
            int r5 = r5 + 1
            goto L28
        L3d:
            r9.bwtMergedPointers = r3
            r0 = r3[r0]
            r9.bwtCurrentMergedPointer = r0
            return
        L44:
            io.netty.handler.codec.compression.DecompressionException r0 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.String r1 = "start pointer invalid"
            r0.<init>(r1)
            throw r0
    }

    public int blockLength() {
            r1 = this;
            int r0 = r1.bwtBlockLength
            return r0
    }

    int checkCRC() {
            r2 = this;
            io.netty.handler.codec.compression.Crc32 r0 = r2.crc
            int r0 = r0.getCRC()
            int r1 = r2.blockCRC
            if (r1 != r0) goto Lb
            return r0
        Lb:
            io.netty.handler.codec.compression.DecompressionException r0 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.String r1 = "block CRC error"
            r0.<init>(r1)
            throw r0
    }

    boolean decodeHuffmanData(io.netty.handler.codec.compression.Bzip2HuffmanStageDecoder r18) {
            r17 = this;
            r0 = r17
            io.netty.handler.codec.compression.Bzip2BitReader r1 = r0.reader
            byte[] r2 = r0.bwtBlock
            byte[] r3 = r0.huffmanSymbolMap
            int r4 = r2.length
            int r5 = r0.huffmanEndOfBlockSymbol
            int[] r6 = r0.bwtByteCounts
            io.netty.handler.codec.compression.Bzip2MoveToFrontTable r7 = r0.symbolMTF
            int r8 = r0.bwtBlockLength
            int r9 = r0.repeatCount
            int r10 = r0.repeatIncrement
            int r11 = r0.mtfValue
        L17:
            r12 = 23
            boolean r12 = r1.hasReadableBits(r12)
            r13 = 0
            if (r12 != 0) goto L29
            r0.bwtBlockLength = r8
            r0.repeatCount = r9
            r0.repeatIncrement = r10
            r0.mtfValue = r11
            return r13
        L29:
            int r12 = r18.nextSymbol()
            if (r12 != 0) goto L33
            int r9 = r9 + r10
            int r10 = r10 << 1
            goto L17
        L33:
            r14 = 1
            if (r12 != r14) goto L3a
            int r10 = r10 << 1
            int r9 = r9 + r10
            goto L17
        L3a:
            java.lang.String r15 = "block exceeds declared block size"
            if (r9 <= 0) goto L5f
            int r10 = r8 + r9
            if (r10 > r4) goto L59
            r10 = r3[r11]
            r11 = r10 & 255(0xff, float:3.57E-43)
            r16 = r6[r11]
            int r16 = r16 + r9
            r6[r11] = r16
        L4c:
            int r9 = r9 + (-1)
            if (r9 < 0) goto L56
            int r11 = r8 + 1
            r2[r8] = r10
            r8 = r11
            goto L4c
        L56:
            r9 = 0
            r10 = 1
            goto L5f
        L59:
            io.netty.handler.codec.compression.DecompressionException r1 = new io.netty.handler.codec.compression.DecompressionException
            r1.<init>(r15)
            throw r1
        L5f:
            if (r12 != r5) goto L67
            r0.bwtBlockLength = r8
            r0.initialiseInverseBWT()
            return r14
        L67:
            if (r8 >= r4) goto L80
            int r12 = r12 + (-1)
            byte r11 = r7.indexToFront(r12)
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = r3[r11]
            r13 = r12 & 255(0xff, float:3.57E-43)
            r15 = r6[r13]
            int r15 = r15 + r14
            r6[r13] = r15
            int r13 = r8 + 1
            r2[r8] = r12
            r8 = r13
            goto L17
        L80:
            io.netty.handler.codec.compression.DecompressionException r1 = new io.netty.handler.codec.compression.DecompressionException
            r1.<init>(r15)
            throw r1
    }

    public int read() {
            r4 = this;
        L0:
            int r0 = r4.rleRepeat
            r1 = 1
            if (r0 >= r1) goto L41
            int r0 = r4.bwtBytesDecoded
            int r2 = r4.bwtBlockLength
            if (r0 != r2) goto Ld
            r0 = -1
            return r0
        Ld:
            int r0 = r4.decodeNextBWTByte()
            int r2 = r4.rleLastDecodedByte
            if (r0 == r2) goto L21
            r4.rleLastDecodedByte = r0
            r4.rleRepeat = r1
            r4.rleAccumulator = r1
            io.netty.handler.codec.compression.Crc32 r1 = r4.crc
            r1.updateCRC(r0)
            goto L0
        L21:
            int r2 = r4.rleAccumulator
            int r2 = r2 + r1
            r4.rleAccumulator = r2
            r3 = 4
            if (r2 != r3) goto L39
            int r2 = r4.decodeNextBWTByte()
            int r2 = r2 + r1
            r4.rleRepeat = r2
            r1 = 0
            r4.rleAccumulator = r1
            io.netty.handler.codec.compression.Crc32 r1 = r4.crc
            r1.updateCRC(r0, r2)
            goto L0
        L39:
            r4.rleRepeat = r1
            io.netty.handler.codec.compression.Crc32 r1 = r4.crc
            r1.updateCRC(r0)
            goto L0
        L41:
            int r0 = r0 - r1
            r4.rleRepeat = r0
            int r0 = r4.rleLastDecodedByte
            return r0
    }
}
