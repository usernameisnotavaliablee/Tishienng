package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class Bzip2HuffmanStageDecoder {
    final int alphabetSize;
    private final int[][] codeBases;
    private final int[][] codeLimits;
    private final int[][] codeSymbols;
    int currentAlpha;
    int currentGroup;
    int currentLength;
    int currentSelector;
    private int currentTable;
    private int groupIndex;
    private int groupPosition;
    private final int[] minimumLengths;
    boolean modifyLength;
    private final io.netty.handler.codec.compression.Bzip2BitReader reader;
    byte[] selectors;
    final byte[][] tableCodeLengths;
    final io.netty.handler.codec.compression.Bzip2MoveToFrontTable tableMTF;
    final int totalTables;

    Bzip2HuffmanStageDecoder(io.netty.handler.codec.compression.Bzip2BitReader r5, int r6, int r7) {
            r4 = this;
            r4.<init>()
            r0 = -1
            r4.groupIndex = r0
            r4.groupPosition = r0
            io.netty.handler.codec.compression.Bzip2MoveToFrontTable r1 = new io.netty.handler.codec.compression.Bzip2MoveToFrontTable
            r1.<init>()
            r4.tableMTF = r1
            r4.currentLength = r0
            r4.reader = r5
            r4.totalTables = r6
            r4.alphabetSize = r7
            int[] r5 = new int[r6]
            r4.minimumLengths = r5
            r5 = 2
            int[] r7 = new int[r5]
            r0 = 1
            r1 = 25
            r7[r0] = r1
            r1 = 0
            r7[r1] = r6
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r2, r7)
            int[][] r7 = (int[][]) r7
            r4.codeBases = r7
            int[] r7 = new int[r5]
            r3 = 24
            r7[r0] = r3
            r7[r1] = r6
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r2, r7)
            int[][] r7 = (int[][]) r7
            r4.codeLimits = r7
            int[] r7 = new int[r5]
            r3 = 258(0x102, float:3.62E-43)
            r7[r0] = r3
            r7[r1] = r6
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r2, r7)
            int[][] r7 = (int[][]) r7
            r4.codeSymbols = r7
            int[] r5 = new int[r5]
            r5[r0] = r3
            r5[r1] = r6
            java.lang.Class r6 = java.lang.Byte.TYPE
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r6, r5)
            byte[][] r5 = (byte[][]) r5
            r4.tableCodeLengths = r5
            return
    }

    void createHuffmanDecodingTables() {
            r15 = this;
            int r0 = r15.alphabetSize
            r1 = 0
            r2 = 0
        L4:
            byte[][] r3 = r15.tableCodeLengths
            int r4 = r3.length
            if (r2 >= r4) goto L7b
            int[][] r4 = r15.codeBases
            r4 = r4[r2]
            int[][] r5 = r15.codeLimits
            r5 = r5[r2]
            int[][] r6 = r15.codeSymbols
            r6 = r6[r2]
            r3 = r3[r2]
            r7 = 23
            r8 = 0
            r9 = 0
        L1b:
            if (r8 >= r0) goto L2a
            r10 = r3[r8]
            int r9 = java.lang.Math.max(r10, r9)
            int r7 = java.lang.Math.min(r10, r7)
            int r8 = r8 + 1
            goto L1b
        L2a:
            int[] r8 = r15.minimumLengths
            r8[r2] = r7
            r8 = 0
        L2f:
            r10 = 1
            if (r8 >= r0) goto L3d
            r11 = r3[r8]
            int r11 = r11 + r10
            r12 = r4[r11]
            int r12 = r12 + r10
            r4[r11] = r12
            int r8 = r8 + 1
            goto L2f
        L3d:
            r8 = r4[r1]
            r11 = 1
        L40:
            r12 = 25
            if (r11 >= r12) goto L4c
            r12 = r4[r11]
            int r8 = r8 + r12
            r4[r11] = r8
            int r11 = r11 + 1
            goto L40
        L4c:
            r8 = r7
            r11 = 0
        L4e:
            if (r8 > r9) goto L63
            int r12 = r8 + 1
            r13 = r4[r12]
            r14 = r4[r8]
            int r13 = r13 - r14
            int r13 = r13 + r11
            int r11 = r11 - r14
            r4[r8] = r11
            int r11 = r13 + (-1)
            r5[r8] = r11
            int r11 = r13 << 1
            r8 = r12
            goto L4e
        L63:
            r4 = 0
        L64:
            if (r7 > r9) goto L78
            r5 = 0
        L67:
            if (r5 >= r0) goto L75
            r8 = r3[r5]
            if (r8 != r7) goto L72
            int r8 = r4 + 1
            r6[r4] = r5
            r4 = r8
        L72:
            int r5 = r5 + 1
            goto L67
        L75:
            int r7 = r7 + 1
            goto L64
        L78:
            int r2 = r2 + 1
            goto L4
        L7b:
            byte[] r0 = r15.selectors
            r0 = r0[r1]
            r15.currentTable = r0
            return
    }

    int nextSymbol() {
            r8 = this;
            int r0 = r8.groupPosition
            r1 = 1
            int r0 = r0 + r1
            r8.groupPosition = r0
            int r0 = r0 % 50
            if (r0 != 0) goto L23
            int r0 = r8.groupIndex
            int r0 = r0 + r1
            r8.groupIndex = r0
            byte[] r2 = r8.selectors
            int r3 = r2.length
            if (r0 == r3) goto L1b
            r0 = r2[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r8.currentTable = r0
            goto L23
        L1b:
            io.netty.handler.codec.compression.DecompressionException r0 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.String r1 = "error decoding block"
            r0.<init>(r1)
            throw r0
        L23:
            io.netty.handler.codec.compression.Bzip2BitReader r0 = r8.reader
            int r2 = r8.currentTable
            int[][] r3 = r8.codeLimits
            r3 = r3[r2]
            int[][] r4 = r8.codeBases
            r4 = r4[r2]
            int[][] r5 = r8.codeSymbols
            r5 = r5[r2]
            int[] r6 = r8.minimumLengths
            r2 = r6[r2]
            int r6 = r0.readBits(r2)
        L3b:
            r7 = 23
            if (r2 > r7) goto L53
            r7 = r3[r2]
            if (r6 > r7) goto L49
            r0 = r4[r2]
            int r6 = r6 - r0
            r0 = r5[r6]
            return r0
        L49:
            int r6 = r6 << 1
            int r7 = r0.readBits(r1)
            r6 = r6 | r7
            int r2 = r2 + 1
            goto L3b
        L53:
            io.netty.handler.codec.compression.DecompressionException r0 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.String r1 = "a valid code was not recognised"
            r0.<init>(r1)
            throw r0
    }
}
