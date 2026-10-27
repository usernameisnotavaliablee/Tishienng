package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class Bzip2MTFAndRLE2StageEncoder {
    private int alphabetSize;
    private final int[] bwtBlock;
    private final int bwtLength;
    private final boolean[] bwtValuesPresent;
    private final char[] mtfBlock;
    private int mtfLength;
    private final int[] mtfSymbolFrequencies;

    Bzip2MTFAndRLE2StageEncoder(int[] r2, int r3, boolean[] r4) {
            r1 = this;
            r1.<init>()
            r0 = 258(0x102, float:3.62E-43)
            int[] r0 = new int[r0]
            r1.mtfSymbolFrequencies = r0
            r1.bwtBlock = r2
            r1.bwtLength = r3
            r1.bwtValuesPresent = r4
            int r3 = r3 + 1
            char[] r2 = new char[r3]
            r1.mtfBlock = r2
            return
    }

    void encode() {
            r19 = this;
            r0 = r19
            int r1 = r0.bwtLength
            boolean[] r2 = r0.bwtValuesPresent
            int[] r3 = r0.bwtBlock
            char[] r4 = r0.mtfBlock
            int[] r5 = r0.mtfSymbolFrequencies
            r6 = 256(0x100, float:3.59E-43)
            byte[] r7 = new byte[r6]
            io.netty.handler.codec.compression.Bzip2MoveToFrontTable r8 = new io.netty.handler.codec.compression.Bzip2MoveToFrontTable
            r8.<init>()
            r10 = 0
            r11 = 0
        L17:
            if (r10 >= r6) goto L26
            boolean r12 = r2[r10]
            if (r12 == 0) goto L23
            int r12 = r11 + 1
            byte r11 = (byte) r11
            r7[r10] = r11
            r11 = r12
        L23:
            int r10 = r10 + 1
            goto L17
        L26:
            int r2 = r11 + 1
            r6 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L2d:
            r15 = 1
            if (r6 >= r1) goto L75
            r16 = 0
            r9 = r3[r6]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r7[r9]
            int r9 = r8.valueToFront(r9)
            if (r9 != 0) goto L41
            int r10 = r10 + 1
            goto L72
        L41:
            if (r10 <= 0) goto L61
            int r10 = r10 + (-1)
        L45:
            r17 = r10 & 1
            if (r17 != 0) goto L52
            int r17 = r12 + 1
            r4[r12] = r16
            int r13 = r13 + 1
        L4f:
            r12 = r17
            goto L59
        L52:
            int r17 = r12 + 1
            r4[r12] = r15
            int r14 = r14 + 1
            goto L4f
        L59:
            if (r10 > r15) goto L5d
            r10 = 0
            goto L61
        L5d:
            int r10 = r10 + (-2)
            int r10 = r10 >>> r15
            goto L45
        L61:
            int r17 = r12 + 1
            int r9 = r9 + 1
            r18 = 1
            char r15 = (char) r9
            r4[r12] = r15
            r12 = r5[r9]
            int r12 = r12 + 1
            r5[r9] = r12
            r12 = r17
        L72:
            int r6 = r6 + 1
            goto L2d
        L75:
            r16 = 0
            r18 = 1
            if (r10 <= 0) goto L9a
            int r10 = r10 + (-1)
        L7d:
            r1 = r10 & 1
            if (r1 != 0) goto L8a
            int r1 = r12 + 1
            r4[r12] = r16
            int r13 = r13 + 1
        L87:
            r12 = r1
            r1 = 1
            goto L91
        L8a:
            int r1 = r12 + 1
            r4[r12] = r18
            int r14 = r14 + 1
            goto L87
        L91:
            if (r10 > r1) goto L94
            goto L9b
        L94:
            int r10 = r10 + (-2)
            int r10 = r10 >>> r1
            r18 = 1
            goto L7d
        L9a:
            r1 = 1
        L9b:
            char r3 = (char) r2
            r4[r12] = r3
            r3 = r5[r2]
            int r3 = r3 + r1
            r5[r2] = r3
            r2 = r5[r16]
            int r2 = r2 + r13
            r5[r16] = r2
            r2 = r5[r1]
            int r2 = r2 + r14
            r5[r1] = r2
            int r12 = r12 + r1
            r0.mtfLength = r12
            int r11 = r11 + 2
            r0.alphabetSize = r11
            return
    }

    int mtfAlphabetSize() {
            r1 = this;
            int r0 = r1.alphabetSize
            return r0
    }

    char[] mtfBlock() {
            r1 = this;
            char[] r0 = r1.mtfBlock
            return r0
    }

    int mtfLength() {
            r1 = this;
            int r0 = r1.mtfLength
            return r0
    }

    int[] mtfSymbolFrequencies() {
            r1 = this;
            int[] r0 = r1.mtfSymbolFrequencies
            return r0
    }
}
