package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class Bzip2HuffmanAllocator {
    private Bzip2HuffmanAllocator() {
            r0 = this;
            r0.<init>()
            return
    }

    static void allocateHuffmanCodeLengths(int[] r4, int r5) {
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L28
            r3 = 2
            if (r0 == r3) goto L26
            setExtendedParentPointers(r4)
            int r0 = findNodesToRelocate(r4, r5)
            r1 = r4[r1]
            int r2 = r4.length
            int r1 = r1 % r2
            if (r1 < r0) goto L19
            allocateNodeLengths(r4)
            return
        L19:
            int r1 = r0 + (-1)
            int r1 = java.lang.Integer.numberOfLeadingZeros(r1)
            int r1 = 32 - r1
            int r5 = r5 - r1
            allocateNodeLengthsWithRelocation(r4, r0, r5)
            return
        L26:
            r4[r2] = r2
        L28:
            r4[r1] = r2
            return
    }

    private static void allocateNodeLengths(int[] r6) {
            int r0 = r6.length
            r1 = 2
            int r0 = r0 - r1
            int r2 = r6.length
            r3 = 1
            int r2 = r2 - r3
        L6:
            if (r1 <= 0) goto L21
            int r4 = r0 + (-1)
            r5 = 0
            int r4 = first(r6, r4, r5)
            int r0 = r0 - r4
            int r1 = r1 - r0
        L11:
            if (r1 <= 0) goto L1b
            int r5 = r2 + (-1)
            r6[r2] = r3
            int r1 = r1 + (-1)
            r2 = r5
            goto L11
        L1b:
            int r1 = r0 << 1
            int r3 = r3 + 1
            r0 = r4
            goto L6
        L21:
            return
    }

    private static void allocateNodeLengthsWithRelocation(int[] r9, int r10, int r11) {
            int r0 = r9.length
            r1 = 2
            int r0 = r0 - r1
            int r2 = r9.length
            r3 = 1
            int r2 = r2 - r3
            if (r11 != r3) goto L9
            goto La
        L9:
            r1 = 1
        La:
            if (r11 != r3) goto Lf
            int r4 = r10 + (-2)
            goto L10
        Lf:
            r4 = r10
        L10:
            int r5 = r1 << 1
        L12:
            if (r5 <= 0) goto L4a
            if (r0 > r10) goto L18
            r6 = r0
            goto L1e
        L18:
            int r6 = r0 + (-1)
            int r6 = first(r9, r6, r10)
        L1e:
            if (r1 < r11) goto L29
            int r7 = r1 - r11
            int r7 = r3 << r7
            int r7 = java.lang.Math.min(r4, r7)
            goto L36
        L29:
            int r7 = r11 + (-1)
            if (r1 != r7) goto L35
            r7 = r9[r6]
            if (r7 != r0) goto L33
            int r6 = r6 + 1
        L33:
            r7 = 1
            goto L36
        L35:
            r7 = 0
        L36:
            int r0 = r0 - r6
            int r0 = r0 + r7
            int r5 = r5 - r0
        L39:
            if (r5 <= 0) goto L43
            int r8 = r2 + (-1)
            r9[r2] = r1
            int r5 = r5 + (-1)
            r2 = r8
            goto L39
        L43:
            int r4 = r4 - r7
            int r5 = r0 << 1
            int r1 = r1 + 1
            r0 = r6
            goto L12
        L4a:
            return
    }

    private static int findNodesToRelocate(int[] r4, int r5) {
            int r0 = r4.length
            int r0 = r0 + (-2)
            r1 = 1
            r2 = 1
        L5:
            int r3 = r5 + (-1)
            if (r2 >= r3) goto L15
            if (r0 <= r1) goto L15
            int r0 = r0 + (-1)
            r3 = 0
            int r0 = first(r4, r0, r3)
            int r2 = r2 + 1
            goto L5
        L15:
            return r0
    }

    private static int first(int[] r5, int r6, int r7) {
            int r0 = r5.length
            int r1 = r5.length
            int r1 = r1 + (-2)
            r2 = r1
            r1 = r6
        L6:
            if (r1 < r7) goto L17
            r3 = r5[r1]
            int r3 = r3 % r0
            if (r3 <= r6) goto L17
            int r2 = r6 - r1
            int r2 = r2 + 1
            int r2 = r1 - r2
            r4 = r2
            r2 = r1
            r1 = r4
            goto L6
        L17:
            int r7 = r7 + (-1)
            int r7 = java.lang.Math.max(r7, r1)
        L1d:
            int r1 = r7 + 1
            if (r2 <= r1) goto L2e
            int r1 = r7 + r2
            int r1 = r1 >>> 1
            r3 = r5[r1]
            int r3 = r3 % r0
            if (r3 <= r6) goto L2c
            r2 = r1
            goto L1d
        L2c:
            r7 = r1
            goto L1d
        L2e:
            return r2
    }

    private static void setExtendedParentPointers(int[] r7) {
            int r0 = r7.length
            r1 = 0
            r2 = r7[r1]
            r3 = 1
            r4 = r7[r3]
            int r2 = r2 + r4
            r7[r1] = r2
            r2 = 2
        Lb:
            int r4 = r0 + (-1)
            if (r3 >= r4) goto L43
            if (r2 >= r0) goto L1b
            r4 = r7[r1]
            r5 = r7[r2]
            if (r4 >= r5) goto L18
            goto L1b
        L18:
            int r2 = r2 + 1
            goto L22
        L1b:
            r5 = r7[r1]
            int r4 = r1 + 1
            r7[r1] = r3
            r1 = r4
        L22:
            if (r2 >= r0) goto L34
            if (r1 >= r3) goto L2d
            r4 = r7[r1]
            r6 = r7[r2]
            if (r4 >= r6) goto L2d
            goto L34
        L2d:
            int r4 = r2 + 1
            r2 = r7[r2]
            int r5 = r5 + r2
            r2 = r4
            goto L3e
        L34:
            r4 = r7[r1]
            int r5 = r5 + r4
            int r4 = r1 + 1
            int r6 = r3 + r0
            r7[r1] = r6
            r1 = r4
        L3e:
            r7[r3] = r5
            int r3 = r3 + 1
            goto Lb
        L43:
            return
    }
}
