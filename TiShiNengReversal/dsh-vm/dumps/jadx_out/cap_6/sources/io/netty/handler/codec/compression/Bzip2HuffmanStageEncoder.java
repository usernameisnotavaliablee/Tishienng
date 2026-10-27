package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class Bzip2HuffmanStageEncoder {
    private static final int HUFFMAN_HIGH_SYMBOL_COST = 15;
    private final int[][] huffmanCodeLengths;
    private final int[][] huffmanMergedCodeSymbols;
    private final int mtfAlphabetSize;
    private final char[] mtfBlock;
    private final int mtfLength;
    private final int[] mtfSymbolFrequencies;
    private final byte[] selectors;
    private final io.netty.handler.codec.compression.Bzip2BitWriter writer;

    Bzip2HuffmanStageEncoder(io.netty.handler.codec.compression.Bzip2BitWriter r4, char[] r5, int r6, int r7, int[] r8) {
            r3 = this;
            r3.<init>()
            r3.writer = r4
            r3.mtfBlock = r5
            r3.mtfLength = r6
            r3.mtfAlphabetSize = r7
            r3.mtfSymbolFrequencies = r8
            int r4 = selectTableCount(r6)
            r5 = 2
            int[] r8 = new int[r5]
            r0 = 1
            r8[r0] = r7
            r1 = 0
            r8[r1] = r4
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r2, r8)
            int[][] r8 = (int[][]) r8
            r3.huffmanCodeLengths = r8
            int[] r5 = new int[r5]
            r5[r0] = r7
            r5[r1] = r4
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r2, r5)
            int[][] r4 = (int[][]) r4
            r3.huffmanMergedCodeSymbols = r4
            int r6 = r6 + 49
            int r6 = r6 / 50
            byte[] r4 = new byte[r6]
            r3.selectors = r4
            return
    }

    private void assignHuffmanCodeSymbols() {
            r12 = this;
            int[][] r0 = r12.huffmanMergedCodeSymbols
            int[][] r1 = r12.huffmanCodeLengths
            int r2 = r12.mtfAlphabetSize
            int r3 = r1.length
            r4 = 0
            r5 = 0
        L9:
            if (r5 >= r3) goto L40
            r6 = r1[r5]
            r7 = 32
            r8 = 0
            r9 = 0
        L11:
            if (r8 >= r2) goto L1e
            r10 = r6[r8]
            if (r10 <= r9) goto L18
            r9 = r10
        L18:
            if (r10 >= r7) goto L1b
            r7 = r10
        L1b:
            int r8 = r8 + 1
            goto L11
        L1e:
            r6 = 0
        L1f:
            if (r7 > r9) goto L3d
            r8 = 0
        L22:
            if (r8 >= r2) goto L38
            r10 = r1[r5]
            r10 = r10[r8]
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r10 != r7) goto L35
            r10 = r0[r5]
            int r11 = r7 << 24
            r11 = r11 | r6
            r10[r8] = r11
            int r6 = r6 + 1
        L35:
            int r8 = r8 + 1
            goto L22
        L38:
            int r6 = r6 << 1
            int r7 = r7 + 1
            goto L1f
        L3d:
            int r5 = r5 + 1
            goto L9
        L40:
            return
    }

    private static void generateHuffmanCodeLengths(int r5, int[] r6, int[] r7) {
            int[] r0 = new int[r5]
            int[] r1 = new int[r5]
            r2 = 0
            r3 = 0
        L6:
            if (r3 >= r5) goto L12
            r4 = r6[r3]
            int r4 = r4 << 9
            r4 = r4 | r3
            r0[r3] = r4
            int r3 = r3 + 1
            goto L6
        L12:
            java.util.Arrays.sort(r0)
            r6 = 0
        L16:
            if (r6 >= r5) goto L21
            r3 = r0[r6]
            int r3 = r3 >>> 9
            r1[r6] = r3
            int r6 = r6 + 1
            goto L16
        L21:
            r6 = 20
            io.netty.handler.codec.compression.Bzip2HuffmanAllocator.allocateHuffmanCodeLengths(r1, r6)
        L26:
            if (r2 >= r5) goto L33
            r6 = r0[r2]
            r6 = r6 & 511(0x1ff, float:7.16E-43)
            r3 = r1[r2]
            r7[r6] = r3
            int r2 = r2 + 1
            goto L26
        L33:
            return
    }

    private void generateHuffmanOptimisationSeeds() {
            r13 = this;
            int[][] r0 = r13.huffmanCodeLengths
            int[] r1 = r13.mtfSymbolFrequencies
            int r2 = r13.mtfAlphabetSize
            int r3 = r0.length
            int r4 = r13.mtfLength
            r5 = -1
            r6 = 0
            r7 = 0
        Lc:
            if (r7 >= r3) goto L47
            int r8 = r3 - r7
            int r9 = r4 / r8
            int r10 = r5 + 1
            r11 = 0
        L15:
            if (r11 >= r9) goto L21
            int r12 = r2 + (-1)
            if (r5 >= r12) goto L21
            int r5 = r5 + 1
            r12 = r1[r5]
            int r11 = r11 + r12
            goto L15
        L21:
            if (r5 <= r10) goto L33
            if (r7 == 0) goto L33
            int r9 = r3 + (-1)
            if (r7 == r9) goto L33
            r8 = r8 & 1
            if (r8 != 0) goto L33
            int r8 = r5 + (-1)
            r5 = r1[r5]
            int r11 = r11 - r5
            r5 = r8
        L33:
            r8 = r0[r7]
            r9 = 0
        L36:
            if (r9 >= r2) goto L43
            if (r9 < r10) goto L3c
            if (r9 <= r5) goto L40
        L3c:
            r12 = 15
            r8[r9] = r12
        L40:
            int r9 = r9 + 1
            goto L36
        L43:
            int r4 = r4 - r11
            int r7 = r7 + 1
            goto Lc
        L47:
            return
    }

    private void optimiseSelectorsAndHuffmanTables(boolean r22) {
            r21 = this;
            r0 = r21
            char[] r1 = r0.mtfBlock
            byte[] r2 = r0.selectors
            int[][] r3 = r0.huffmanCodeLengths
            int r4 = r0.mtfLength
            int r5 = r0.mtfAlphabetSize
            int r6 = r3.length
            r7 = 2
            int[] r7 = new int[r7]
            r8 = 1
            r7[r8] = r5
            r9 = 0
            r7[r9] = r6
            java.lang.Class r10 = java.lang.Integer.TYPE
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r10, r7)
            int[][] r7 = (int[][]) r7
            r10 = 0
            r11 = 0
        L20:
            if (r10 >= r4) goto L80
            int r12 = r10 + 50
            int r12 = java.lang.Math.min(r12, r4)
            int r13 = r12 + (-1)
            short[] r14 = new short[r6]
            r15 = r10
        L2d:
            if (r15 > r13) goto L4e
            char r16 = r1[r15]
            r8 = 0
            r17 = 1
        L34:
            if (r8 >= r6) goto L47
            short r18 = r14[r8]
            r19 = r3[r8]
            r19 = r19[r16]
            r20 = 0
            int r9 = r18 + r19
            short r9 = (short) r9
            r14[r8] = r9
            int r8 = r8 + 1
            r9 = 0
            goto L34
        L47:
            r20 = 0
            int r15 = r15 + 1
            r8 = 1
            r9 = 0
            goto L2d
        L4e:
            r17 = 1
            r20 = 0
            short r8 = r14[r20]
            r9 = 1
            r15 = 0
        L56:
            if (r9 >= r6) goto L64
            short r0 = r14[r9]
            if (r0 >= r8) goto L5e
            r8 = r0
            r15 = r9
        L5e:
            int r9 = r9 + 1
            byte r9 = (byte) r9
            r0 = r21
            goto L56
        L64:
            r0 = r7[r15]
        L66:
            if (r10 > r13) goto L73
            char r8 = r1[r10]
            r9 = r0[r8]
            int r9 = r9 + 1
            r0[r8] = r9
            int r10 = r10 + 1
            goto L66
        L73:
            if (r22 == 0) goto L7a
            int r0 = r11 + 1
            r2[r11] = r15
            r11 = r0
        L7a:
            r0 = r21
            r10 = r12
            r8 = 1
            r9 = 0
            goto L20
        L80:
            r20 = 0
            r9 = 0
        L83:
            if (r9 >= r6) goto L8f
            r0 = r7[r9]
            r1 = r3[r9]
            generateHuffmanCodeLengths(r5, r0, r1)
            int r9 = r9 + 1
            goto L83
        L8f:
            return
    }

    private static int selectTableCount(int r1) {
            r0 = 2400(0x960, float:3.363E-42)
            if (r1 < r0) goto L6
            r1 = 6
            return r1
        L6:
            r0 = 1200(0x4b0, float:1.682E-42)
            if (r1 < r0) goto Lc
            r1 = 5
            return r1
        Lc:
            r0 = 600(0x258, float:8.41E-43)
            if (r1 < r0) goto L12
            r1 = 4
            return r1
        L12:
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 < r0) goto L18
            r1 = 3
            return r1
        L18:
            r1 = 2
            return r1
    }

    private void writeBlockData(io.netty.buffer.ByteBuf r14) {
            r13 = this;
            io.netty.handler.codec.compression.Bzip2BitWriter r0 = r13.writer
            int[][] r1 = r13.huffmanMergedCodeSymbols
            byte[] r2 = r13.selectors
            char[] r3 = r13.mtfBlock
            int r4 = r13.mtfLength
            r5 = 0
            r6 = 0
        Lc:
            if (r5 >= r4) goto L2e
            int r7 = r5 + 50
            int r7 = java.lang.Math.min(r7, r4)
            int r7 = r7 + (-1)
            int r8 = r6 + 1
            r6 = r2[r6]
            r6 = r1[r6]
        L1c:
            if (r5 > r7) goto L2c
            int r9 = r5 + 1
            char r5 = r3[r5]
            r5 = r6[r5]
            int r10 = r5 >>> 24
            long r11 = (long) r5
            r0.writeBits(r14, r10, r11)
            r5 = r9
            goto L1c
        L2c:
            r6 = r8
            goto Lc
        L2e:
            return
    }

    private void writeSelectorsAndHuffmanTables(io.netty.buffer.ByteBuf r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            io.netty.handler.codec.compression.Bzip2BitWriter r2 = r0.writer
            byte[] r3 = r0.selectors
            int r4 = r3.length
            int[][] r5 = r0.huffmanCodeLengths
            int r6 = r5.length
            int r7 = r0.mtfAlphabetSize
            long r8 = (long) r6
            r6 = 3
            r2.writeBits(r1, r6, r8)
            r8 = 15
            long r9 = (long) r4
            r2.writeBits(r1, r8, r9)
            io.netty.handler.codec.compression.Bzip2MoveToFrontTable r4 = new io.netty.handler.codec.compression.Bzip2MoveToFrontTable
            r4.<init>()
            int r8 = r3.length
            r9 = 0
            r10 = 0
        L21:
            if (r10 >= r8) goto L2f
            r11 = r3[r10]
            int r11 = r4.valueToFront(r11)
            r2.writeUnary(r1, r11)
            int r10 = r10 + 1
            goto L21
        L2f:
            int r3 = r5.length
            r4 = 0
        L31:
            if (r4 >= r3) goto L68
            r8 = r5[r4]
            r10 = r8[r9]
            r11 = 5
            long r12 = (long) r10
            r2.writeBits(r1, r11, r12)
            r11 = 0
        L3d:
            if (r11 >= r7) goto L63
            r12 = r8[r11]
            r13 = 2
            if (r10 >= r12) goto L46
            r14 = 2
            goto L47
        L46:
            r14 = 3
        L47:
            int r10 = r12 - r10
            int r10 = java.lang.Math.abs(r10)
        L4d:
            int r15 = r10 + (-1)
            if (r10 <= 0) goto L5a
            r10 = r7
            long r6 = (long) r14
            r2.writeBits(r1, r13, r6)
            r7 = r10
            r10 = r15
            r6 = 3
            goto L4d
        L5a:
            r10 = r7
            r2.writeBoolean(r1, r9)
            int r11 = r11 + 1
            r10 = r12
            r6 = 3
            goto L3d
        L63:
            r10 = r7
            int r4 = r4 + 1
            r6 = 3
            goto L31
        L68:
            return
    }

    void encode(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            r2.generateHuffmanOptimisationSeeds()
            r0 = 3
        L4:
            if (r0 < 0) goto L11
            if (r0 != 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            r2.optimiseSelectorsAndHuffmanTables(r1)
            int r0 = r0 + (-1)
            goto L4
        L11:
            r2.assignHuffmanCodeSymbols()
            r2.writeSelectorsAndHuffmanTables(r3)
            r2.writeBlockData(r3)
            return
    }
}
