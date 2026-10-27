package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class Bzip2DivSufSort {
    private static final int BUCKET_A_SIZE = 256;
    private static final int BUCKET_B_SIZE = 65536;
    private static final int INSERTIONSORT_THRESHOLD = 8;
    private static final int[] LOG_2_TABLE = null;
    private static final int SS_BLOCKSIZE = 1024;
    private static final int STACK_SIZE = 64;
    private final int[] SA;
    private final byte[] T;
    private final int n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class PartitionResult {
        final int first;
        final int last;

        PartitionResult(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.first = r1
                r0.last = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class StackEntry {
        final int a;
        final int b;
        final int c;
        final int d;

        StackEntry(int r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class TRBudget {
        int budget;
        int chance;

        TRBudget(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.budget = r1
                r0.chance = r2
                return
        }

        boolean update(int r3, int r4) {
                r2 = this;
                int r0 = r2.budget
                int r0 = r0 - r4
                r2.budget = r0
                r4 = 1
                if (r0 > 0) goto L14
                int r1 = r2.chance
                int r1 = r1 - r4
                r2.chance = r1
                if (r1 != 0) goto L11
                r3 = 0
                return r3
            L11:
                int r0 = r0 + r3
                r2.budget = r0
            L14:
                return r4
        }
    }

    static {
            r0 = 256(0x100, float:3.59E-43)
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [-1, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7} // fill-array
            io.netty.handler.codec.compression.Bzip2DivSufSort.LOG_2_TABLE = r0
            return
    }

    Bzip2DivSufSort(byte[] r1, int[] r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.T = r1
            r0.SA = r2
            r0.n = r3
            return
    }

    private static int BUCKET_B(int r0, int r1) {
            int r1 = r1 << 8
            r0 = r0 | r1
            return r0
    }

    private static int BUCKET_BSTAR(int r0, int r1) {
            int r0 = r0 << 8
            r0 = r0 | r1
            return r0
    }

    private int constructBWT(int[] r13, int[] r14) {
            r12 = this;
            byte[] r0 = r12.T
            int[] r1 = r12.SA
            int r2 = r12.n
            r3 = 0
            r4 = 254(0xfe, float:3.56E-43)
            r5 = 0
            r6 = 0
        Lb:
            r7 = -1
            if (r4 < 0) goto L60
            int r5 = r4 + 1
            int r6 = BUCKET_BSTAR(r4, r5)
            r6 = r14[r6]
            r5 = r13[r5]
            r7 = 0
            r8 = -1
        L1a:
            if (r6 > r5) goto L5b
            r9 = r1[r5]
            if (r9 < 0) goto L55
            int r10 = r9 + (-1)
            if (r10 >= 0) goto L26
            int r10 = r2 + (-1)
        L26:
            r11 = r0[r10]
            r11 = r11 & 255(0xff, float:3.57E-43)
            if (r11 > r4) goto L58
            int r9 = ~r9
            r1[r5] = r9
            if (r10 <= 0) goto L3a
            int r9 = r10 + (-1)
            r9 = r0[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            if (r9 <= r11) goto L3a
            int r10 = ~r10
        L3a:
            if (r8 != r11) goto L41
            int r7 = r7 + (-1)
            r1[r7] = r10
            goto L58
        L41:
            if (r8 < 0) goto L49
            int r8 = BUCKET_B(r8, r4)
            r14[r8] = r7
        L49:
            int r7 = BUCKET_B(r11, r4)
            r7 = r14[r7]
            int r7 = r7 + (-1)
            r1[r7] = r10
            r8 = r11
            goto L58
        L55:
            int r9 = ~r9
            r1[r5] = r9
        L58:
            int r5 = r5 + (-1)
            goto L1a
        L5b:
            int r4 = r4 + (-1)
            r5 = r7
            r6 = r8
            goto Lb
        L60:
            r14 = -1
        L61:
            if (r3 >= r2) goto Lab
            r4 = r1[r3]
            if (r4 < 0) goto L97
            int r8 = r4 + (-1)
            if (r8 >= 0) goto L6d
            int r8 = r2 + (-1)
        L6d:
            r9 = r0[r8]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r10 = r8 + 1
            r10 = r0[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r9 < r10) goto L98
            if (r8 <= 0) goto L84
            int r10 = r8 + (-1)
            r10 = r0[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r10 >= r9) goto L84
            int r8 = ~r8
        L84:
            if (r9 != r6) goto L8b
            int r5 = r5 + 1
            r1[r5] = r8
            goto L98
        L8b:
            if (r6 == r7) goto L8f
            r13[r6] = r5
        L8f:
            r5 = r13[r9]
            int r5 = r5 + 1
            r1[r5] = r8
            r6 = r9
            goto L98
        L97:
            int r4 = ~r4
        L98:
            if (r4 != 0) goto La2
            int r14 = r2 + (-1)
            r14 = r0[r14]
            r1[r3] = r14
            r14 = r3
            goto La8
        La2:
            int r4 = r4 + (-1)
            r4 = r0[r4]
            r1[r3] = r4
        La8:
            int r3 = r3 + 1
            goto L61
        Lab:
            return r14
    }

    private static int getIDX(int r0) {
            if (r0 < 0) goto L3
            return r0
        L3:
            int r0 = ~r0
            return r0
    }

    private void lsIntroSort(int r19, int r20, int r21, int r22, int r23) {
            r18 = this;
            r0 = r18
            int[] r6 = r0.SA
            r1 = 64
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry[] r7 = new io.netty.handler.codec.compression.Bzip2DivSufSort.StackEntry[r1]
            int r1 = r23 - r22
            int r1 = trLog(r1)
            r4 = r22
            r5 = r23
            r9 = 0
            r10 = 0
        L14:
            int r11 = r5 - r4
            r2 = 8
            r12 = -1
            r13 = 1
            if (r11 > r2) goto L42
            if (r13 >= r11) goto L2d
            r1 = r19
            r2 = r20
            r3 = r21
            r0.trInsertionSort(r1, r2, r3, r4, r5)
            r2 = r1
            r14 = r5
            r0.lsUpdateGroup(r2, r4, r14)
            goto L33
        L2d:
            r2 = r19
            if (r11 != r13) goto L33
            r6[r4] = r12
        L33:
            if (r9 != 0) goto L37
            goto L1bd
        L37:
            int r9 = r9 + (-1)
            r1 = r7[r9]
            int r4 = r1.a
            int r5 = r1.b
            int r1 = r1.c
            goto L14
        L42:
            r2 = r19
            r14 = r5
            int r15 = r1 + (-1)
            if (r1 != 0) goto L85
            r3 = r21
            r1 = r2
            r5 = r11
            r2 = r20
            r0.trHeapSort(r1, r2, r3, r4, r5)
            int r5 = r14 + (-1)
        L54:
            if (r4 >= r5) goto L70
            r10 = r6[r5]
            int r10 = r0.trGetC(r1, r2, r3, r10)
            int r5 = r5 + (-1)
        L5e:
            if (r4 > r5) goto L54
            r11 = r6[r5]
            int r11 = r0.trGetC(r1, r2, r3, r11)
            if (r11 != r10) goto L54
            r11 = r6[r5]
            int r11 = ~r11
            r6[r5] = r11
            int r5 = r5 + (-1)
            goto L5e
        L70:
            r0.lsUpdateGroup(r1, r4, r14)
            if (r9 != 0) goto L77
            goto L1bd
        L77:
            int r9 = r9 + (-1)
            r4 = r7[r9]
            int r5 = r4.a
            int r11 = r4.b
            int r4 = r4.c
            r1 = r4
            r4 = r5
            r5 = r11
            goto L14
        L85:
            r3 = r21
            r1 = r2
            r5 = r14
            r2 = r20
            int r11 = r0.trPivot(r1, r2, r3, r4, r5)
            swapElements(r6, r4, r6, r11)
            r11 = r6[r4]
            int r11 = r0.trGetC(r1, r2, r3, r11)
            int r14 = r4 + 1
        L9a:
            if (r14 >= r5) goto La7
            r10 = r6[r14]
            int r10 = r0.trGetC(r1, r2, r3, r10)
            if (r10 != r11) goto La7
            int r14 = r14 + 1
            goto L9a
        La7:
            if (r14 >= r5) goto Lc1
            if (r10 >= r11) goto Lc1
            r12 = r14
            r22 = -1
        Lae:
            int r14 = r14 + r13
            if (r14 >= r5) goto Lc4
            r10 = r6[r14]
            int r10 = r0.trGetC(r1, r2, r3, r10)
            if (r10 > r11) goto Lc4
            if (r10 != r11) goto Lae
            swapElements(r6, r14, r6, r12)
            int r12 = r12 + 1
            goto Lae
        Lc1:
            r22 = -1
            r12 = r14
        Lc4:
            int r16 = r5 + (-1)
            r8 = r16
        Lc8:
            if (r14 >= r8) goto Ld5
            r10 = r6[r8]
            int r10 = r0.trGetC(r1, r2, r3, r10)
            if (r10 != r11) goto Ld5
            int r8 = r8 + (-1)
            goto Lc8
        Ld5:
            if (r14 >= r8) goto Lf8
            if (r10 <= r11) goto Lf8
            r17 = r10
            r10 = r8
        Ldc:
            int r8 = r8 + (-1)
            r23 = 1
            if (r14 >= r8) goto Lf5
            r13 = r6[r8]
            int r13 = r0.trGetC(r1, r2, r3, r13)
            if (r13 < r11) goto Lfc
            if (r13 != r11) goto Lf1
            swapElements(r6, r8, r6, r10)
            int r10 = r10 + (-1)
        Lf1:
            r17 = r13
            r13 = 1
            goto Ldc
        Lf5:
            r13 = r17
            goto Lfc
        Lf8:
            r23 = 1
            r13 = r10
            r10 = r8
        Lfc:
            if (r14 >= r8) goto L129
            swapElements(r6, r14, r6, r8)
        L101:
            int r14 = r14 + 1
            if (r14 >= r8) goto L115
            r13 = r6[r14]
            int r13 = r0.trGetC(r1, r2, r3, r13)
            if (r13 > r11) goto L115
            if (r13 != r11) goto L101
            swapElements(r6, r14, r6, r12)
            int r12 = r12 + 1
            goto L101
        L115:
            int r8 = r8 + (-1)
            if (r14 >= r8) goto Lfc
            r13 = r6[r8]
            int r13 = r0.trGetC(r1, r2, r3, r13)
            if (r13 < r11) goto Lfc
            if (r13 != r11) goto L115
            swapElements(r6, r8, r6, r10)
            int r10 = r10 + (-1)
            goto L115
        L129:
            if (r12 > r10) goto L1ba
            int r8 = r14 + (-1)
            int r11 = r12 - r4
            int r12 = r14 - r12
            if (r11 <= r12) goto L134
            r11 = r12
        L134:
            int r17 = r14 - r11
            r0 = r17
            r17 = r11
            r11 = r4
        L13b:
            if (r17 <= 0) goto L147
            swapElements(r6, r11, r6, r0)
            int r17 = r17 + (-1)
            int r11 = r11 + 1
            int r0 = r0 + 1
            goto L13b
        L147:
            int r0 = r10 - r8
            int r8 = r5 - r10
            int r8 = r8 + (-1)
            if (r0 <= r8) goto L150
            goto L151
        L150:
            r8 = r0
        L151:
            int r10 = r5 - r8
        L153:
            if (r8 <= 0) goto L15f
            swapElements(r6, r14, r6, r10)
            int r8 = r8 + (-1)
            int r14 = r14 + 1
            int r10 = r10 + 1
            goto L153
        L15f:
            int r8 = r4 + r12
            int r0 = r5 - r0
            int r10 = r8 + (-1)
            r11 = r4
        L166:
            if (r11 >= r8) goto L170
            r12 = r6[r11]
            int r12 = r12 + r1
            r6[r12] = r10
            int r11 = r11 + 1
            goto L166
        L170:
            if (r0 >= r5) goto L17f
            int r10 = r0 + (-1)
            r11 = r8
        L175:
            if (r11 >= r0) goto L17f
            r12 = r6[r11]
            int r12 = r12 + r1
            r6[r12] = r10
            int r11 = r11 + 1
            goto L175
        L17f:
            int r10 = r0 - r8
            r11 = 1
            if (r10 != r11) goto L186
            r6[r8] = r22
        L186:
            int r10 = r8 - r4
            int r11 = r5 - r0
            if (r10 > r11) goto L1a7
            if (r4 >= r8) goto L1a0
            int r10 = r9 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r11 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r12 = 0
            r11.<init>(r0, r5, r15, r12)
            r7[r9] = r11
            r0 = r18
            r5 = r8
            r9 = r10
        L19c:
            r10 = r13
            r1 = r15
            goto L14
        L1a0:
            r4 = r0
        L1a1:
            r10 = r13
            r1 = r15
        L1a3:
            r0 = r18
            goto L14
        L1a7:
            r12 = 0
            if (r0 >= r5) goto L1b6
            int r10 = r9 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r11 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r11.<init>(r4, r8, r15, r12)
            r7[r9] = r11
            r4 = r0
            r9 = r10
            goto L1a1
        L1b6:
            r0 = r18
            r5 = r8
            goto L19c
        L1ba:
            r12 = 0
            if (r9 != 0) goto L1be
        L1bd:
            return
        L1be:
            int r9 = r9 + (-1)
            r0 = r7[r9]
            int r4 = r0.a
            int r5 = r0.b
            int r0 = r0.c
            r1 = r0
            r10 = r13
            goto L1a3
    }

    private void lsSort(int r9, int r10, int r11) {
            r8 = this;
            int[] r0 = r8.SA
            int r11 = r11 + r9
            r3 = r11
        L4:
            int r11 = -r10
            r7 = 0
            r1 = r0[r7]
            if (r11 >= r1) goto L51
            r11 = 0
            r5 = 0
        Lc:
            r1 = r0[r5]
            if (r1 >= 0) goto L14
            int r5 = r5 - r1
            int r11 = r11 + r1
            r2 = r9
            goto L28
        L14:
            if (r11 == 0) goto L1b
            int r2 = r5 + r11
            r0[r2] = r11
            r11 = 0
        L1b:
            int r1 = r1 + r9
            r1 = r0[r1]
            int r6 = r1 + 1
            int r4 = r9 + r10
            r1 = r8
            r2 = r9
            r1.lsIntroSort(r2, r3, r4, r5, r6)
            r5 = r6
        L28:
            if (r5 < r10) goto L4f
            if (r11 == 0) goto L2f
            int r5 = r5 + r11
            r0[r5] = r11
        L2f:
            int r9 = r3 - r2
            if (r10 >= r9) goto L4c
        L33:
            r9 = r0[r7]
            if (r9 >= 0) goto L39
            int r7 = r7 - r9
            goto L49
        L39:
            int r9 = r9 + r2
            r9 = r0[r9]
            int r9 = r9 + 1
        L3e:
            if (r7 >= r9) goto L48
            r11 = r0[r7]
            int r11 = r11 + r2
            r0[r11] = r7
            int r7 = r7 + 1
            goto L3e
        L48:
            r7 = r9
        L49:
            if (r7 < r10) goto L33
            goto L51
        L4c:
            int r3 = r3 + r9
            r9 = r2
            goto L4
        L4f:
            r9 = r2
            goto Lc
        L51:
            return
    }

    private void lsUpdateGroup(int r5, int r6, int r7) {
            r4 = this;
            int[] r0 = r4.SA
        L2:
            if (r6 >= r7) goto L38
            r1 = r0[r6]
            if (r1 < 0) goto L1e
            r1 = r6
        L9:
            r2 = r0[r1]
            int r2 = r2 + r5
            r0[r2] = r1
            int r1 = r1 + 1
            if (r1 >= r7) goto L16
            r2 = r0[r1]
            if (r2 >= 0) goto L9
        L16:
            int r2 = r6 - r1
            r0[r6] = r2
            if (r7 > r1) goto L1d
            goto L38
        L1d:
            r6 = r1
        L1e:
            r1 = r6
        L1f:
            r2 = r0[r1]
            int r2 = ~r2
            r0[r1] = r2
            int r2 = r1 + 1
            r3 = r0[r2]
            if (r3 < 0) goto L36
        L2a:
            r3 = r0[r6]
            int r3 = r3 + r5
            r0[r3] = r2
            int r6 = r6 + 1
            if (r6 <= r2) goto L2a
            int r6 = r1 + 2
            goto L2
        L36:
            r1 = r2
            goto L1f
        L38:
            return
    }

    private int sortTypeBstar(int[] r22, int[] r23) {
            r21 = this;
            r0 = r21
            byte[] r10 = r0.T
            int[] r11 = r0.SA
            int r9 = r0.n
            r1 = 256(0x100, float:3.59E-43)
            int[] r2 = new int[r1]
            r12 = 1
            r3 = 1
        Le:
            r13 = 0
            r14 = 255(0xff, float:3.57E-43)
            if (r3 >= r9) goto L26
            int r4 = r3 + (-1)
            r4 = r10[r4]
            r5 = r10[r3]
            if (r4 == r5) goto L23
            r3 = r4 & 255(0xff, float:3.57E-43)
            r4 = r5 & 255(0xff, float:3.57E-43)
            if (r3 <= r4) goto L26
            r15 = 0
            goto L27
        L23:
            int r3 = r3 + 1
            goto Le
        L26:
            r15 = 1
        L27:
            int r16 = r9 + (-1)
            r3 = r10[r16]
            r4 = r3 & 255(0xff, float:3.57E-43)
            r5 = r10[r13]
            r6 = r5 & 255(0xff, float:3.57E-43)
            if (r4 < r6) goto L3c
            if (r3 != r5) goto L38
            if (r15 == 0) goto L38
            goto L3c
        L38:
            r3 = r9
            r4 = r16
            goto L70
        L3c:
            if (r15 != 0) goto L4c
            int r3 = BUCKET_BSTAR(r4, r6)
            r4 = r23[r3]
            int r4 = r4 + r12
            r23[r3] = r4
            int r3 = r9 + (-1)
            r11[r3] = r16
            goto L56
        L4c:
            int r3 = BUCKET_B(r4, r6)
            r4 = r23[r3]
            int r4 = r4 + r12
            r23[r3] = r4
            r3 = r9
        L56:
            int r4 = r9 + (-2)
        L58:
            if (r4 < 0) goto L70
            r5 = r10[r4]
            r5 = r5 & r14
            int r6 = r4 + 1
            r6 = r10[r6]
            r6 = r6 & r14
            if (r5 > r6) goto L70
            int r5 = BUCKET_B(r5, r6)
            r6 = r23[r5]
            int r6 = r6 + r12
            r23[r5] = r6
            int r4 = r4 + (-1)
            goto L58
        L70:
            if (r4 < 0) goto Lba
        L72:
            r5 = r10[r4]
            r5 = r5 & r14
            r6 = r22[r5]
            int r6 = r6 + r12
            r22[r5] = r6
            int r5 = r4 + (-1)
            if (r5 < 0) goto L89
            r6 = r10[r5]
            r6 = r6 & r14
            r7 = r10[r4]
            r7 = r7 & r14
            if (r6 >= r7) goto L87
            goto L89
        L87:
            r4 = r5
            goto L72
        L89:
            if (r5 < 0) goto Lb8
            r6 = r10[r5]
            r6 = r6 & r14
            r7 = r10[r4]
            r7 = r7 & r14
            int r6 = BUCKET_BSTAR(r6, r7)
            r7 = r23[r6]
            int r7 = r7 + r12
            r23[r6] = r7
            int r3 = r3 + (-1)
            r11[r3] = r5
            int r4 = r4 + (-2)
        La0:
            if (r4 < 0) goto L70
            r5 = r10[r4]
            r5 = r5 & r14
            int r6 = r4 + 1
            r6 = r10[r6]
            r6 = r6 & r14
            if (r5 > r6) goto L70
            int r5 = BUCKET_B(r5, r6)
            r6 = r23[r5]
            int r6 = r6 + r12
            r23[r5] = r6
            int r4 = r4 + (-1)
            goto La0
        Lb8:
            r4 = r5
            goto L70
        Lba:
            int r3 = r9 - r3
            if (r3 != 0) goto Lc7
            r1 = 0
        Lbf:
            if (r1 >= r9) goto Lc6
            r11[r1] = r1
            int r1 = r1 + 1
            goto Lbf
        Lc6:
            return r13
        Lc7:
            r4 = -1
            r5 = 0
            r6 = 0
        Lca:
            if (r5 >= r1) goto Lfa
            r7 = r22[r5]
            int r7 = r7 + r4
            int r4 = r4 + r6
            r22[r5] = r4
            int r4 = BUCKET_B(r5, r5)
            r4 = r23[r4]
            int r7 = r7 + r4
            int r4 = r5 + 1
            r8 = r4
        Ldc:
            if (r8 >= r1) goto Lf7
            int r17 = BUCKET_BSTAR(r5, r8)
            r17 = r23[r17]
            int r6 = r6 + r17
            int r17 = r5 << 8
            r17 = r17 | r8
            r23[r17] = r6
            int r17 = BUCKET_B(r5, r8)
            r17 = r23[r17]
            int r7 = r7 + r17
            int r8 = r8 + 1
            goto Ldc
        Lf7:
            r5 = r4
            r4 = r7
            goto Lca
        Lfa:
            int r4 = r9 - r3
            int r5 = r3 + (-2)
        Lfe:
            if (r5 < 0) goto L119
            int r6 = r4 + r5
            r6 = r11[r6]
            r7 = r10[r6]
            r7 = r7 & r14
            int r6 = r6 + r12
            r6 = r10[r6]
            r6 = r6 & r14
            int r6 = BUCKET_BSTAR(r7, r6)
            r7 = r23[r6]
            int r7 = r7 - r12
            r23[r6] = r7
            r11[r7] = r5
            int r5 = r5 + (-1)
            goto Lfe
        L119:
            int r5 = r4 + r3
            int r5 = r5 - r12
            r5 = r11[r5]
            r6 = r10[r5]
            r6 = r6 & r14
            int r5 = r5 + r12
            r5 = r10[r5]
            r5 = r5 & r14
            int r5 = BUCKET_BSTAR(r6, r5)
            r6 = r23[r5]
            int r6 = r6 - r12
            r23[r5] = r6
            int r5 = r3 + (-1)
            r11[r6] = r5
            int r6 = r3 * 2
            int r6 = r9 - r6
            if (r6 > r1) goto L13c
            r1 = 0
            r6 = 256(0x100, float:3.59E-43)
            goto L13e
        L13c:
            r1 = r3
            r2 = r11
        L13e:
            r7 = r3
            r8 = 255(0xff, float:3.57E-43)
        L141:
            if (r7 <= 0) goto L1a1
            r13 = 255(0xff, float:3.57E-43)
            r17 = 0
        L147:
            if (r8 >= r13) goto L18d
            int r18 = BUCKET_BSTAR(r8, r13)
            r18 = r23[r18]
            int r14 = r7 - r18
            if (r12 >= r14) goto L174
            r14 = r11[r18]
            if (r14 != r5) goto L15d
            r14 = r8
            r8 = 1
        L159:
            r19 = r3
            r3 = r7
            goto L160
        L15d:
            r14 = r8
            r8 = 0
            goto L159
        L160:
            r7 = 2
            r20 = r5
            r5 = r1
            r1 = r4
            r4 = r2
            r2 = r18
            r18 = r20
            r20 = r19
            r19 = r14
            r14 = r20
            r0.subStringSort(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L17f
        L174:
            r14 = r5
            r5 = r1
            r1 = r4
            r4 = r2
            r2 = r18
            r18 = r14
            r14 = r3
            r19 = r8
        L17f:
            int r13 = r13 + (-1)
            r7 = r2
            r2 = r4
            r3 = r14
            r8 = r19
            r14 = 255(0xff, float:3.57E-43)
            r4 = r1
            r1 = r5
            r5 = r18
            goto L147
        L18d:
            r14 = r3
            r18 = r5
            r3 = r7
            r19 = r8
            r5 = r1
            r1 = r4
            r4 = r2
            int r8 = r19 + (-1)
            r3 = r14
            r13 = 0
            r14 = 255(0xff, float:3.57E-43)
            r4 = r1
            r1 = r5
            r5 = r18
            goto L141
        L1a1:
            r14 = r3
            r18 = r5
            r17 = 0
        L1a6:
            if (r5 < 0) goto L1de
            r1 = r11[r5]
            if (r1 < 0) goto L1c6
            r1 = r5
        L1ad:
            r2 = r11[r1]
            int r3 = r14 + r2
            r11[r3] = r1
            int r2 = r1 + (-1)
            if (r2 < 0) goto L1be
            r3 = r11[r2]
            if (r3 >= 0) goto L1bc
            goto L1be
        L1bc:
            r1 = r2
            goto L1ad
        L1be:
            int r3 = r2 - r5
            r11[r1] = r3
            if (r2 > 0) goto L1c5
            goto L1de
        L1c5:
            r5 = r2
        L1c6:
            r1 = r5
        L1c7:
            r2 = r11[r1]
            int r2 = ~r2
            r11[r1] = r2
            int r3 = r14 + r2
            r11[r3] = r5
            int r2 = r1 + (-1)
            r3 = r11[r2]
            if (r3 < 0) goto L1dc
            int r3 = r3 + r14
            r11[r3] = r5
            int r5 = r1 + (-2)
            goto L1a6
        L1dc:
            r1 = r2
            goto L1c7
        L1de:
            r0.trSort(r14, r14, r12)
            r1 = r10[r16]
            r2 = r1 & 255(0xff, float:3.57E-43)
            r3 = r10[r17]
            r4 = r3 & 255(0xff, float:3.57E-43)
            if (r2 < r4) goto L1f4
            if (r1 != r3) goto L1f0
            if (r15 == 0) goto L1f0
            goto L1f4
        L1f0:
            r3 = r14
            r9 = r16
            goto L213
        L1f4:
            if (r15 != 0) goto L1ff
            int r3 = r14 + (-1)
            int r1 = r14 + r3
            r1 = r11[r1]
            r11[r1] = r16
            goto L200
        L1ff:
            r3 = r14
        L200:
            int r9 = r9 + (-2)
        L202:
            if (r9 < 0) goto L213
            r1 = r10[r9]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            int r4 = r9 + 1
            r4 = r10[r4]
            r4 = r4 & r2
            if (r1 > r4) goto L213
            int r9 = r9 + (-1)
            goto L202
        L213:
            if (r9 < 0) goto L241
        L215:
            int r9 = r9 + (-1)
            if (r9 < 0) goto L226
            r1 = r10[r9]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            int r4 = r9 + 1
            r4 = r10[r4]
            r4 = r4 & r2
            if (r1 < r4) goto L226
            goto L215
        L226:
            if (r9 < 0) goto L213
            int r3 = r3 + (-1)
            int r1 = r14 + r3
            r1 = r11[r1]
            r11[r1] = r9
        L230:
            int r9 = r9 + (-1)
            if (r9 < 0) goto L213
            r1 = r10[r9]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            int r4 = r9 + 1
            r4 = r10[r4]
            r4 = r4 & r2
            if (r1 > r4) goto L213
            goto L230
        L241:
            r5 = r18
            r2 = 255(0xff, float:3.57E-43)
        L245:
            if (r2 < 0) goto L293
            r1 = 255(0xff, float:3.57E-43)
        L249:
            if (r2 >= r1) goto L271
            int r3 = BUCKET_B(r2, r1)
            r3 = r23[r3]
            int r3 = r16 - r3
            int r4 = BUCKET_B(r2, r1)
            int r16 = r16 + 1
            r23[r4] = r16
            int r4 = BUCKET_BSTAR(r2, r1)
            r4 = r23[r4]
            r16 = r3
        L263:
            if (r4 > r5) goto L26e
            r3 = r11[r5]
            r11[r16] = r3
            int r16 = r16 + (-1)
            int r5 = r5 + (-1)
            goto L263
        L26e:
            int r1 = r1 + (-1)
            goto L249
        L271:
            int r1 = BUCKET_B(r2, r2)
            r1 = r23[r1]
            int r1 = r16 - r1
            int r3 = BUCKET_B(r2, r2)
            int r16 = r16 + 1
            r23[r3] = r16
            r3 = 255(0xff, float:3.57E-43)
            if (r2 >= r3) goto L28e
            int r4 = r2 + 1
            int r4 = BUCKET_BSTAR(r2, r4)
            int r1 = r1 + r12
            r23[r4] = r1
        L28e:
            r16 = r22[r2]
            int r2 = r2 + (-1)
            goto L245
        L293:
            return r14
    }

    private static void ssBlockSwap(int[] r0, int r1, int[] r2, int r3, int r4) {
        L0:
            if (r4 <= 0) goto Lc
            swapElements(r0, r1, r2, r3)
            int r4 = r4 + (-1)
            int r1 = r1 + 1
            int r3 = r3 + 1
            goto L0
        Lc:
            return
    }

    private int ssCompare(int r5, int r6, int r7) {
            r4 = this;
            int[] r0 = r4.SA
            byte[] r1 = r4.T
            int r2 = r5 + 1
            r2 = r0[r2]
            int r2 = r2 + 2
            int r3 = r6 + 1
            r3 = r0[r3]
            int r3 = r3 + 2
            r5 = r0[r5]
            int r5 = r5 + r7
            r6 = r0[r6]
            int r7 = r7 + r6
        L16:
            if (r5 >= r2) goto L25
            if (r7 >= r3) goto L25
            r6 = r1[r5]
            r0 = r1[r7]
            if (r6 != r0) goto L25
            int r5 = r5 + 1
            int r7 = r7 + 1
            goto L16
        L25:
            if (r5 >= r2) goto L35
            if (r7 >= r3) goto L33
            r5 = r1[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = r1[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r5 = r5 - r6
            return r5
        L33:
            r5 = 1
            return r5
        L35:
            if (r7 >= r3) goto L39
            r5 = -1
            return r5
        L39:
            r5 = 0
            return r5
    }

    private int ssCompareLast(int r6, int r7, int r8, int r9, int r10) {
            r5 = this;
            int[] r0 = r5.SA
            byte[] r1 = r5.T
            r7 = r0[r7]
            int r7 = r7 + r9
            r2 = r0[r8]
            int r9 = r9 + r2
            r2 = 1
            int r8 = r8 + r2
            r8 = r0[r8]
            int r8 = r8 + 2
        L10:
            if (r7 >= r10) goto L1f
            if (r9 >= r8) goto L1f
            r3 = r1[r7]
            r4 = r1[r9]
            if (r3 != r4) goto L1f
            int r7 = r7 + 1
            int r9 = r9 + 1
            goto L10
        L1f:
            if (r7 >= r10) goto L2e
            if (r9 >= r8) goto L2d
            r6 = r1[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = r1[r9]
        L29:
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r6 = r6 - r7
            return r6
        L2d:
            return r2
        L2e:
            if (r9 != r8) goto L31
            return r2
        L31:
            int r7 = r7 % r10
            r6 = r0[r6]
            int r6 = r6 + 2
        L36:
            if (r7 >= r6) goto L45
            if (r9 >= r8) goto L45
            r10 = r1[r7]
            r0 = r1[r9]
            if (r10 != r0) goto L45
            int r7 = r7 + 1
            int r9 = r9 + 1
            goto L36
        L45:
            if (r7 >= r6) goto L51
            if (r9 >= r8) goto L50
            r6 = r1[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = r1[r9]
            goto L29
        L50:
            return r2
        L51:
            if (r9 >= r8) goto L55
            r6 = -1
            return r6
        L55:
            r6 = 0
            return r6
    }

    private void ssFixdown(int r9, int r10, int r11, int r12, int r13) {
            r8 = this;
            int[] r0 = r8.SA
            byte[] r1 = r8.T
            int r2 = r11 + r12
            r2 = r0[r2]
            int r3 = r10 + r2
            r3 = r0[r3]
            int r3 = r3 + r9
            r3 = r1[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
        L11:
            int r4 = r12 * 2
            int r5 = r4 + 1
            if (r5 >= r13) goto L42
            int r4 = r4 + 2
            int r6 = r11 + r5
            r6 = r0[r6]
            int r6 = r6 + r10
            r6 = r0[r6]
            int r6 = r6 + r9
            r6 = r1[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r7 = r11 + r4
            r7 = r0[r7]
            int r7 = r7 + r10
            r7 = r0[r7]
            int r7 = r7 + r9
            r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r6 >= r7) goto L35
            r6 = r7
            goto L36
        L35:
            r4 = r5
        L36:
            if (r6 > r3) goto L39
            goto L42
        L39:
            int r12 = r12 + r11
            int r5 = r11 + r4
            r5 = r0[r5]
            r0[r12] = r5
            r12 = r4
            goto L11
        L42:
            int r11 = r11 + r12
            r0[r11] = r2
            return
    }

    private void ssHeapSort(int r10, int r11, int r12, int r13) {
            r9 = this;
            int[] r6 = r9.SA
            byte[] r1 = r9.T
            int r7 = r13 % 2
            if (r7 != 0) goto L2a
            int r2 = r13 + (-1)
            int r3 = r2 / 2
            int r3 = r3 + r12
            r4 = r6[r3]
            int r4 = r4 + r11
            r4 = r6[r4]
            int r4 = r4 + r10
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r12 + r2
            r8 = r6[r5]
            int r8 = r8 + r11
            r8 = r6[r8]
            int r8 = r8 + r10
            r1 = r1[r8]
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r4 >= r1) goto L28
            swapElements(r6, r5, r6, r3)
        L28:
            r5 = r2
            goto L2b
        L2a:
            r5 = r13
        L2b:
            int r1 = r5 / 2
            int r1 = r1 + (-1)
            r4 = r1
        L30:
            if (r4 < 0) goto L3c
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r0.ssFixdown(r1, r2, r3, r4, r5)
            int r4 = r4 + (-1)
            goto L30
        L3c:
            if (r7 != 0) goto L4b
            int r0 = r12 + r5
            swapElements(r6, r12, r6, r0)
            r4 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r0.ssFixdown(r1, r2, r3, r4, r5)
        L4b:
            int r5 = r5 + (-1)
        L4d:
            if (r5 <= 0) goto L64
            r7 = r6[r12]
            int r8 = r12 + r5
            r0 = r6[r8]
            r6[r12] = r0
            r4 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r0.ssFixdown(r1, r2, r3, r4, r5)
            r6[r8] = r7
            int r5 = r5 + (-1)
            goto L4d
        L64:
            return
    }

    private void ssInsertionSort(int r8, int r9, int r10, int r11) {
            r7 = this;
            int[] r0 = r7.SA
            int r1 = r10 + (-2)
        L4:
            if (r9 > r1) goto L33
            r2 = r0[r1]
            int r3 = r1 + 1
        La:
            int r4 = r8 + r2
            r5 = r0[r3]
            int r5 = r5 + r8
            int r4 = r7.ssCompare(r4, r5, r11)
            if (r4 <= 0) goto L25
        L15:
            int r5 = r3 + (-1)
            r6 = r0[r3]
            r0[r5] = r6
            int r3 = r3 + 1
            if (r3 >= r10) goto L23
            r5 = r0[r3]
            if (r5 < 0) goto L15
        L23:
            if (r10 > r3) goto La
        L25:
            if (r4 != 0) goto L2c
            r4 = r0[r3]
            int r4 = ~r4
            r0[r3] = r4
        L2c:
            int r3 = r3 + (-1)
            r0[r3] = r2
            int r1 = r1 + (-1)
            goto L4
        L33:
            return
    }

    private static int ssLog(int r1) {
            r0 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L11
            int[] r0 = io.netty.handler.codec.compression.Bzip2DivSufSort.LOG_2_TABLE
            int r1 = r1 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r0[r1]
            int r1 = r1 + 8
            return r1
        L11:
            int[] r0 = io.netty.handler.codec.compression.Bzip2DivSufSort.LOG_2_TABLE
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r0[r1]
            return r1
    }

    private int ssMedian3(int r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            int[] r0 = r6.SA
            byte[] r1 = r6.T
            r2 = r0[r9]
            int r2 = r2 + r8
            r2 = r0[r2]
            int r2 = r2 + r7
            r2 = r1[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = r0[r10]
            int r3 = r3 + r8
            r3 = r0[r3]
            int r3 = r3 + r7
            r3 = r1[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = r0[r11]
            int r8 = r8 + r4
            r8 = r0[r8]
            int r7 = r7 + r8
            r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r2 <= r3) goto L25
            goto L2b
        L25:
            r5 = r10
            r10 = r9
            r9 = r5
            r5 = r3
            r3 = r2
            r2 = r5
        L2b:
            if (r2 <= r7) goto L31
            if (r3 <= r7) goto L30
            return r10
        L30:
            return r11
        L31:
            return r9
    }

    private int ssMedian5(int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
            r8 = this;
            int[] r0 = r8.SA
            byte[] r1 = r8.T
            r2 = r0[r11]
            int r2 = r2 + r10
            r2 = r0[r2]
            int r2 = r2 + r9
            r2 = r1[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = r0[r12]
            int r3 = r3 + r10
            r3 = r0[r3]
            int r3 = r3 + r9
            r3 = r1[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = r0[r13]
            int r4 = r4 + r10
            r4 = r0[r4]
            int r4 = r4 + r9
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = r0[r14]
            int r5 = r5 + r10
            r5 = r0[r5]
            int r5 = r5 + r9
            r5 = r1[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = r0[r15]
            int r10 = r10 + r6
            r10 = r0[r10]
            int r9 = r9 + r10
            r9 = r1[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            if (r3 <= r4) goto L3e
            r7 = r13
            r13 = r12
            r12 = r7
            r7 = r4
            r4 = r3
            r3 = r7
        L3e:
            if (r5 <= r9) goto L44
            r7 = r5
            r5 = r9
            r9 = r7
            goto L47
        L44:
            r7 = r15
            r15 = r14
            r14 = r7
        L47:
            if (r3 <= r5) goto L50
            r7 = r4
            r4 = r9
            r9 = r7
            r7 = r14
            r14 = r13
            r13 = r7
            goto L52
        L50:
            r12 = r15
            r3 = r5
        L52:
            if (r2 <= r4) goto L5a
            r7 = r13
            r13 = r11
            r11 = r7
            r7 = r4
            r4 = r2
            r2 = r7
        L5a:
            if (r2 <= r3) goto L5f
            r12 = r11
            r3 = r2
            goto L61
        L5f:
            r14 = r13
            r9 = r4
        L61:
            if (r9 <= r3) goto L64
            return r12
        L64:
            return r14
    }

    private void ssMerge(int r19, int r20, int r21, int r22, int[] r23, int r24, int r25, int r26) {
            r18 = this;
            r0 = r18
            r8 = r25
            int[] r9 = r0.SA
            r1 = 64
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry[] r10 = new io.netty.handler.codec.compression.Bzip2DivSufSort.StackEntry[r1]
            r4 = r20
            r5 = r21
            r6 = r22
            r12 = 0
            r13 = 0
        L12:
            int r1 = r6 - r5
            if (r1 > r8) goto L4a
            if (r4 >= r5) goto L27
            if (r5 >= r6) goto L27
            r1 = r19
            r2 = r23
            r3 = r24
            r7 = r26
            r0.ssMergeBackward(r1, r2, r3, r4, r5, r6, r7)
            r2 = r1
            goto L2b
        L27:
            r2 = r19
            r7 = r26
        L2b:
            r1 = r12 & 1
            if (r1 == 0) goto L32
            r0.ssMergeCheckEqual(r2, r7, r4)
        L32:
            r1 = r12 & 2
            if (r1 == 0) goto L39
            r0.ssMergeCheckEqual(r2, r7, r6)
        L39:
            if (r13 != 0) goto L3d
            goto L13b
        L3d:
            int r13 = r13 + (-1)
            r1 = r10[r13]
            int r4 = r1.a
            int r5 = r1.b
            int r6 = r1.c
            int r12 = r1.d
            goto L12
        L4a:
            r2 = r19
            r7 = r26
            int r3 = r5 - r4
            if (r3 > r8) goto L7c
            if (r4 >= r5) goto L5d
            r3 = r24
            r1 = r2
            r2 = r23
            r0.ssMergeForward(r1, r2, r3, r4, r5, r6, r7)
            r2 = r1
        L5d:
            r1 = r12 & 1
            if (r1 == 0) goto L64
            r0.ssMergeCheckEqual(r2, r7, r4)
        L64:
            r1 = r12 & 2
            if (r1 == 0) goto L6b
            r0.ssMergeCheckEqual(r2, r7, r6)
        L6b:
            if (r13 != 0) goto L6f
            goto L13b
        L6f:
            int r13 = r13 + (-1)
            r1 = r10[r13]
            int r4 = r1.a
            int r5 = r1.b
            int r6 = r1.c
            int r12 = r1.d
            goto L12
        L7c:
            int r1 = java.lang.Math.min(r3, r1)
            int r3 = r1 >> 1
            r14 = 0
        L83:
            r15 = 1
            if (r1 <= 0) goto Lb4
            int r16 = r5 + r14
            int r16 = r16 + r3
            r16 = r9[r16]
            int r16 = getIDX(r16)
            int r11 = r2 + r16
            int r16 = r5 - r14
            int r16 = r16 - r3
            int r16 = r16 + (-1)
            r16 = r9[r16]
            int r16 = getIDX(r16)
            r20 = 1
            int r15 = r2 + r16
            int r11 = r0.ssCompare(r11, r15, r7)
            if (r11 >= 0) goto Lb0
            int r11 = r3 + 1
            int r14 = r14 + r11
            r1 = r1 & 1
            r1 = r1 ^ 1
            int r3 = r3 - r1
        Lb0:
            r1 = r3
            int r3 = r1 >> 1
            goto L83
        Lb4:
            r20 = 1
            if (r14 <= 0) goto L126
            int r1 = r5 - r14
            ssBlockSwap(r9, r1, r9, r5, r14)
            int r3 = r5 + r14
            if (r3 >= r6) goto Le0
            r11 = r9[r3]
            if (r11 >= 0) goto Ld5
            r11 = r5
        Lc6:
            int r14 = r11 + (-1)
            r14 = r9[r14]
            if (r14 >= 0) goto Lcf
            int r11 = r11 + (-1)
            goto Lc6
        Lcf:
            r14 = r9[r3]
            int r14 = ~r14
            r9[r3] = r14
            goto Ld6
        Ld5:
            r11 = r5
        Ld6:
            r14 = r5
        Ld7:
            r15 = r9[r14]
            if (r15 >= 0) goto Lde
            int r14 = r14 + 1
            goto Ld7
        Lde:
            r15 = 1
            goto Le3
        Le0:
            r11 = r5
            r14 = r11
            r15 = 0
        Le3:
            int r8 = r11 - r4
            r16 = r9
            int r9 = r6 - r14
            if (r8 > r9) goto L102
            int r5 = r13 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r8 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r9 = r12 & 2
            r9 = r9 | r15
            r8.<init>(r14, r3, r6, r9)
            r10[r13] = r8
            r12 = r12 & 1
            r8 = r25
            r13 = r5
            r6 = r11
            r9 = r16
            r5 = r1
            goto L12
        L102:
            if (r11 != r5) goto L108
            if (r5 != r14) goto L108
            int r15 = r15 << 1
        L108:
            int r5 = r13 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r8 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r9 = r12 & 1
            r17 = r15 & 2
            r9 = r9 | r17
            r8.<init>(r4, r1, r11, r9)
            r10[r13] = r8
            r1 = r12 & 2
            r4 = r15 & 1
            r12 = r1 | r4
            r8 = r25
            r13 = r5
            r4 = r14
            r9 = r16
            r5 = r3
            goto L12
        L126:
            r16 = r9
            r1 = r12 & 1
            if (r1 == 0) goto L12f
            r0.ssMergeCheckEqual(r2, r7, r4)
        L12f:
            r0.ssMergeCheckEqual(r2, r7, r5)
            r1 = r12 & 2
            if (r1 == 0) goto L139
            r0.ssMergeCheckEqual(r2, r7, r6)
        L139:
            if (r13 != 0) goto L13c
        L13b:
            return
        L13c:
            int r13 = r13 + (-1)
            r1 = r10[r13]
            int r4 = r1.a
            int r5 = r1.b
            int r6 = r1.c
            int r12 = r1.d
            r8 = r25
            r9 = r16
            goto L12
    }

    private void ssMergeBackward(int r9, int[] r10, int r11, int r12, int r13, int r14, int r15) {
            r8 = this;
            int[] r0 = r8.SA
            int r1 = r14 - r13
            int r2 = r11 + r1
            ssBlockSwap(r10, r11, r0, r13, r1)
            r1 = 1
            int r2 = r2 - r1
            r3 = r10[r2]
            if (r3 >= 0) goto L13
            int r3 = ~r3
            int r3 = r3 + r9
            r4 = 1
            goto L15
        L13:
            int r3 = r3 + r9
            r4 = 0
        L15:
            int r13 = r13 - r1
            r5 = r0[r13]
            if (r5 >= 0) goto L1d
            r4 = r4 | 2
            int r5 = ~r5
        L1d:
            int r5 = r5 + r9
            int r14 = r14 - r1
            r1 = r0[r14]
        L21:
            int r6 = r8.ssCompare(r3, r5, r15)
            if (r6 <= 0) goto L62
            r3 = r4 & 1
            if (r3 == 0) goto L44
        L2b:
            int r3 = r14 + (-1)
            r6 = r10[r2]
            r0[r14] = r6
            int r14 = r2 + (-1)
            r6 = r0[r3]
            r10[r2] = r6
            r2 = r10[r14]
            if (r2 < 0) goto L41
            r2 = r4 ^ 1
            r4 = r2
            r2 = r14
            r14 = r3
            goto L44
        L41:
            r2 = r14
            r14 = r3
            goto L2b
        L44:
            int r3 = r14 + (-1)
            r6 = r10[r2]
            r0[r14] = r6
            if (r2 > r11) goto L4f
            r10[r2] = r1
            return
        L4f:
            int r14 = r2 + (-1)
            r6 = r0[r3]
            r10[r2] = r6
            r2 = r10[r14]
            if (r2 >= 0) goto L5c
            r4 = r4 | 1
            int r2 = ~r2
        L5c:
            int r2 = r2 + r9
            r7 = r2
            r2 = r14
            r14 = r3
            r3 = r7
            goto L21
        L62:
            if (r6 >= 0) goto Lb5
            r5 = r4 & 2
            if (r5 == 0) goto L81
        L68:
            int r5 = r14 + (-1)
            r6 = r0[r13]
            r0[r14] = r6
            int r14 = r13 + (-1)
            r6 = r0[r5]
            r0[r13] = r6
            r13 = r0[r14]
            if (r13 < 0) goto L7e
            r13 = r4 ^ 2
            r4 = r13
            r13 = r14
            r14 = r5
            goto L81
        L7e:
            r13 = r14
            r14 = r5
            goto L68
        L81:
            int r5 = r14 + (-1)
            r6 = r0[r13]
            r0[r14] = r6
            int r14 = r13 + (-1)
            r6 = r0[r5]
            r0[r13] = r6
            if (r14 >= r12) goto La7
        L8f:
            if (r11 >= r2) goto La0
            int r9 = r5 + (-1)
            r12 = r10[r2]
            r0[r5] = r12
            int r12 = r2 + (-1)
            r13 = r0[r9]
            r10[r2] = r13
            r5 = r9
            r2 = r12
            goto L8f
        La0:
            r9 = r10[r2]
            r0[r5] = r9
            r10[r2] = r1
            return
        La7:
            r13 = r0[r14]
            if (r13 >= 0) goto Lae
            r4 = r4 | 2
            int r13 = ~r13
        Lae:
            int r13 = r13 + r9
            r7 = r5
            r5 = r13
            r13 = r14
        Lb2:
            r14 = r7
            goto L21
        Lb5:
            r3 = r4 & 1
            if (r3 == 0) goto Ld1
        Lb9:
            int r3 = r14 + (-1)
            r5 = r10[r2]
            r0[r14] = r5
            int r14 = r2 + (-1)
            r5 = r0[r3]
            r10[r2] = r5
            r2 = r10[r14]
            if (r2 < 0) goto Lce
            r4 = r4 ^ 1
            r2 = r14
            r14 = r3
            goto Ld1
        Lce:
            r2 = r14
            r14 = r3
            goto Lb9
        Ld1:
            int r3 = r14 + (-1)
            r5 = r10[r2]
            int r5 = ~r5
            r0[r14] = r5
            if (r2 > r11) goto Ldd
            r10[r2] = r1
            return
        Ldd:
            int r14 = r2 + (-1)
            r5 = r0[r3]
            r10[r2] = r5
            r2 = r4 & 2
            if (r2 == 0) goto Lff
        Le7:
            int r2 = r3 + (-1)
            r5 = r0[r13]
            r0[r3] = r5
            int r3 = r13 + (-1)
            r5 = r0[r2]
            r0[r13] = r5
            r13 = r0[r3]
            if (r13 < 0) goto Lfc
            r4 = r4 ^ 2
            r13 = r3
            r3 = r2
            goto Lff
        Lfc:
            r13 = r3
            r3 = r2
            goto Le7
        Lff:
            int r2 = r3 + (-1)
            r5 = r0[r13]
            r0[r3] = r5
            int r3 = r13 + (-1)
            r5 = r0[r2]
            r0[r13] = r5
            if (r3 >= r12) goto L125
        L10d:
            if (r11 >= r14) goto L11e
            int r9 = r2 + (-1)
            r12 = r10[r14]
            r0[r2] = r12
            int r12 = r14 + (-1)
            r13 = r0[r9]
            r10[r14] = r13
            r2 = r9
            r14 = r12
            goto L10d
        L11e:
            r9 = r10[r14]
            r0[r2] = r9
            r10[r14] = r1
            return
        L125:
            r13 = r10[r14]
            if (r13 >= 0) goto L12c
            r4 = r4 | 1
            int r13 = ~r13
        L12c:
            int r13 = r13 + r9
            r5 = r0[r3]
            if (r5 >= 0) goto L134
            r4 = r4 | 2
            int r5 = ~r5
        L134:
            int r5 = r5 + r9
            r7 = r3
            r3 = r13
            r13 = r7
            r7 = r2
            r2 = r14
            goto Lb2
    }

    private void ssMergeCheckEqual(int r4, int r5, int r6) {
            r3 = this;
            int[] r0 = r3.SA
            r1 = r0[r6]
            if (r1 < 0) goto L1d
            int r1 = r6 + (-1)
            r1 = r0[r1]
            int r1 = getIDX(r1)
            int r1 = r1 + r4
            r2 = r0[r6]
            int r4 = r4 + r2
            int r4 = r3.ssCompare(r1, r4, r5)
            if (r4 != 0) goto L1d
            r4 = r0[r6]
            int r4 = ~r4
            r0[r6] = r4
        L1d:
            return
    }

    private void ssMergeForward(int r6, int[] r7, int r8, int r9, int r10, int r11, int r12) {
            r5 = this;
            int[] r0 = r5.SA
            int r1 = r10 - r9
            int r2 = r8 + r1
            int r2 = r2 + (-1)
            ssBlockSwap(r7, r8, r0, r9, r1)
            r1 = r0[r9]
        Ld:
            r3 = r7[r8]
            int r3 = r3 + r6
            r4 = r0[r10]
            int r4 = r4 + r6
            int r3 = r5.ssCompare(r3, r4, r12)
            if (r3 >= 0) goto L34
        L19:
            int r3 = r9 + 1
            r4 = r7[r8]
            r0[r9] = r4
            if (r2 > r8) goto L24
            r7[r8] = r1
            return
        L24:
            int r9 = r8 + 1
            r4 = r0[r3]
            r7[r8] = r4
            r8 = r7[r9]
            if (r8 < 0) goto L31
            r8 = r9
        L2f:
            r9 = r3
            goto Ld
        L31:
            r8 = r9
            r9 = r3
            goto L19
        L34:
            if (r3 <= 0) goto L65
        L36:
            int r3 = r9 + 1
            r4 = r0[r10]
            r0[r9] = r4
            int r9 = r10 + 1
            r4 = r0[r3]
            r0[r10] = r4
            if (r11 > r9) goto L5c
        L44:
            if (r8 >= r2) goto L55
            int r6 = r3 + 1
            r9 = r7[r8]
            r0[r3] = r9
            int r9 = r8 + 1
            r10 = r0[r6]
            r7[r8] = r10
            r3 = r6
            r8 = r9
            goto L44
        L55:
            r6 = r7[r8]
            r0[r3] = r6
            r7[r8] = r1
            return
        L5c:
            r10 = r0[r9]
            if (r10 < 0) goto L62
            r10 = r9
            goto L2f
        L62:
            r10 = r9
            r9 = r3
            goto L36
        L65:
            r3 = r0[r10]
            int r3 = ~r3
            r0[r10] = r3
        L6a:
            int r3 = r9 + 1
            r4 = r7[r8]
            r0[r9] = r4
            if (r2 > r8) goto L75
            r7[r8] = r1
            return
        L75:
            int r9 = r8 + 1
            r4 = r0[r3]
            r7[r8] = r4
            r8 = r7[r9]
            if (r8 < 0) goto Lb2
        L7f:
            int r8 = r3 + 1
            r4 = r0[r10]
            r0[r3] = r4
            int r3 = r10 + 1
            r4 = r0[r8]
            r0[r10] = r4
            if (r11 > r3) goto La5
        L8d:
            if (r9 >= r2) goto L9e
            int r6 = r8 + 1
            r10 = r7[r9]
            r0[r8] = r10
            int r8 = r9 + 1
            r10 = r0[r6]
            r7[r9] = r10
            r9 = r8
            r8 = r6
            goto L8d
        L9e:
            r6 = r7[r9]
            r0[r8] = r6
            r7[r9] = r1
            return
        La5:
            r10 = r0[r3]
            if (r10 < 0) goto Laf
            r10 = r9
            r9 = r8
            r8 = r10
            r10 = r3
            goto Ld
        Laf:
            r10 = r3
            r3 = r8
            goto L7f
        Lb2:
            r8 = r9
            r9 = r3
            goto L6a
    }

    private void ssMultiKeyIntroSort(int r21, int r22, int r23, int r24) {
            r20 = this;
            r0 = r20
            r1 = r21
            int[] r2 = r0.SA
            byte[] r3 = r0.T
            r4 = 64
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry[] r4 = new io.netty.handler.codec.compression.Bzip2DivSufSort.StackEntry[r4]
            int r5 = r23 - r22
            int r5 = ssLog(r5)
            r6 = 0
            r6 = r23
            r7 = r24
            r8 = r5
            r9 = 0
            r10 = 0
            r5 = r22
        L1c:
            int r11 = r6 - r5
            r12 = 8
            r13 = 1
            if (r11 > r12) goto L3f
            if (r13 >= r11) goto L28
            r0.ssInsertionSort(r1, r5, r6, r7)
        L28:
            if (r9 != 0) goto L2b
            return
        L2b:
            int r9 = r9 + (-1)
            r5 = r4[r9]
            int r6 = r5.a
            int r7 = r5.b
            int r8 = r5.c
            int r5 = r5.d
            r19 = r8
            r8 = r5
            r5 = r6
            r6 = r7
            r7 = r19
            goto L1c
        L3f:
            int r12 = r8 + (-1)
            if (r8 != 0) goto L46
            r0.ssHeapSort(r7, r1, r5, r11)
        L46:
            r11 = -1
            if (r12 >= 0) goto Lc5
            int r8 = r5 + 1
            r12 = r2[r5]
            int r12 = r12 + r1
            r12 = r2[r12]
            int r12 = r12 + r7
            r12 = r3[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r19 = r8
            r8 = r5
            r5 = r19
        L5a:
            if (r5 >= r6) goto L72
            r10 = r2[r5]
            int r10 = r10 + r1
            r10 = r2[r10]
            int r10 = r10 + r7
            r10 = r3[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r10 == r12) goto L6f
            int r14 = r5 - r8
            if (r13 >= r14) goto L6d
            goto L72
        L6d:
            r8 = r5
            r12 = r10
        L6f:
            int r5 = r5 + 1
            goto L5a
        L72:
            r14 = r2[r8]
            int r14 = r14 + r1
            r14 = r2[r14]
            int r14 = r14 + r7
            int r14 = r14 - r13
            r14 = r3[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            if (r14 >= r12) goto L83
            int r8 = r0.ssSubstringPartition(r1, r8, r5, r7)
        L83:
            int r12 = r5 - r8
            int r14 = r6 - r5
            if (r12 > r14) goto La4
            if (r13 >= r12) goto La1
            int r13 = r9 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r14 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r14.<init>(r5, r6, r7, r11)
            r4[r9] = r14
            int r7 = r7 + 1
            int r6 = ssLog(r12)
            r9 = r6
            r6 = r5
            r5 = r8
            r8 = r9
            r9 = r13
            goto L1c
        La1:
            r8 = -1
            goto L1c
        La4:
            if (r13 >= r14) goto Lb7
            int r13 = r9 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r14 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            int r15 = r7 + 1
            int r12 = ssLog(r12)
            r14.<init>(r8, r5, r15, r12)
            r4[r9] = r14
            r9 = r13
            goto La1
        Lb7:
            int r7 = r7 + 1
            int r6 = ssLog(r12)
            r19 = r6
            r6 = r5
            r5 = r8
            r8 = r19
            goto L1c
        Lc5:
            int r14 = r0.ssPivot(r7, r1, r5, r6)
            r15 = r2[r14]
            int r15 = r15 + r1
            r15 = r2[r15]
            int r15 = r15 + r7
            r15 = r3[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            swapElements(r2, r5, r2, r14)
            int r14 = r5 + 1
        Ld8:
            if (r14 >= r6) goto Le9
            r10 = r2[r14]
            int r10 = r10 + r1
            r10 = r2[r10]
            int r10 = r10 + r7
            r10 = r3[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r10 != r15) goto Le9
            int r14 = r14 + 1
            goto Ld8
        Le9:
            if (r14 >= r6) goto L107
            if (r10 >= r15) goto L107
            r11 = r14
            r22 = -1
        Lf0:
            int r14 = r14 + r13
            if (r14 >= r6) goto L10a
            r10 = r2[r14]
            int r10 = r10 + r1
            r10 = r2[r10]
            int r10 = r10 + r7
            r10 = r3[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r10 > r15) goto L10a
            if (r10 != r15) goto Lf0
            swapElements(r2, r14, r2, r11)
            int r11 = r11 + 1
            goto Lf0
        L107:
            r22 = -1
            r11 = r14
        L10a:
            int r16 = r6 + (-1)
            r13 = r16
            r23 = 1
        L110:
            if (r14 >= r13) goto L121
            r10 = r2[r13]
            int r10 = r10 + r1
            r10 = r2[r10]
            int r10 = r10 + r7
            r10 = r3[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r10 != r15) goto L121
            int r13 = r13 + (-1)
            goto L110
        L121:
            if (r14 >= r13) goto L140
            if (r10 <= r15) goto L140
            r16 = r3
            r3 = r13
        L128:
            int r13 = r13 + (-1)
            if (r14 >= r13) goto L143
            r10 = r2[r13]
            int r10 = r10 + r1
            r10 = r2[r10]
            int r10 = r10 + r7
            r10 = r16[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r10 < r15) goto L143
            if (r10 != r15) goto L128
            swapElements(r2, r13, r2, r3)
            int r3 = r3 + (-1)
            goto L128
        L140:
            r16 = r3
            r3 = r13
        L143:
            if (r14 >= r13) goto L178
            swapElements(r2, r14, r2, r13)
        L148:
            int r14 = r14 + 1
            if (r14 >= r13) goto L160
            r10 = r2[r14]
            int r10 = r10 + r1
            r10 = r2[r10]
            int r10 = r10 + r7
            r10 = r16[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r10 > r15) goto L160
            if (r10 != r15) goto L148
            swapElements(r2, r14, r2, r11)
            int r11 = r11 + 1
            goto L148
        L160:
            int r13 = r13 + (-1)
            if (r14 >= r13) goto L143
            r10 = r2[r13]
            int r10 = r10 + r1
            r10 = r2[r10]
            int r10 = r10 + r7
            r10 = r16[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r10 < r15) goto L143
            if (r10 != r15) goto L160
            swapElements(r2, r13, r2, r3)
            int r3 = r3 + (-1)
            goto L160
        L178:
            if (r11 > r3) goto L27f
            int r8 = r14 + (-1)
            int r13 = r11 - r5
            int r11 = r14 - r11
            if (r13 <= r11) goto L183
            r13 = r11
        L183:
            int r17 = r14 - r13
            r18 = r17
            r17 = r3
            r3 = r18
            r18 = r4
            r4 = r5
        L18e:
            if (r13 <= 0) goto L19a
            swapElements(r2, r4, r2, r3)
            int r13 = r13 + (-1)
            int r4 = r4 + 1
            int r3 = r3 + 1
            goto L18e
        L19a:
            int r3 = r17 - r8
            int r4 = r6 - r17
            int r4 = r4 + (-1)
            if (r3 <= r4) goto L1a3
            goto L1a4
        L1a3:
            r4 = r3
        L1a4:
            int r8 = r6 - r4
        L1a6:
            if (r4 <= 0) goto L1b2
            swapElements(r2, r14, r2, r8)
            int r4 = r4 + (-1)
            int r14 = r14 + 1
            int r8 = r8 + 1
            goto L1a6
        L1b2:
            int r4 = r5 + r11
            int r3 = r6 - r3
            r8 = r2[r4]
            int r8 = r8 + r1
            r8 = r2[r8]
            int r8 = r8 + r7
            int r8 = r8 + (-1)
            r8 = r16[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r15 > r8) goto L1c6
            r8 = r4
            goto L1ca
        L1c6:
            int r8 = r0.ssSubstringPartition(r1, r4, r3, r7)
        L1ca:
            int r11 = r4 - r5
            int r13 = r6 - r3
            if (r11 > r13) goto L22d
            int r14 = r3 - r8
            if (r13 > r14) goto L1f4
            int r11 = r9 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r13 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            int r15 = r7 + 1
            int r14 = ssLog(r14)
            r13.<init>(r8, r3, r15, r14)
            r18[r9] = r13
            int r9 = r9 + 2
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r8 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r8.<init>(r3, r6, r7, r12)
            r18[r11] = r8
        L1ec:
            r6 = r4
        L1ed:
            r8 = r12
        L1ee:
            r3 = r16
        L1f0:
            r4 = r18
            goto L1c
        L1f4:
            if (r11 > r14) goto L20f
            int r11 = r9 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r13 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r13.<init>(r3, r6, r7, r12)
            r18[r9] = r13
            int r9 = r9 + 2
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r6 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            int r13 = r7 + 1
            int r14 = ssLog(r14)
            r6.<init>(r8, r3, r13, r14)
            r18[r11] = r6
            goto L1ec
        L20f:
            int r11 = r9 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r13 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r13.<init>(r3, r6, r7, r12)
            r18[r9] = r13
            int r9 = r9 + 2
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r6 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r6.<init>(r5, r4, r7, r12)
            r18[r11] = r6
            int r7 = r7 + 1
            int r4 = ssLog(r14)
        L227:
            r6 = r3
            r5 = r8
            r3 = r16
            r8 = r4
            goto L1f0
        L22d:
            int r14 = r3 - r8
            if (r11 > r14) goto L24b
            int r11 = r9 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r13 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            int r15 = r7 + 1
            int r14 = ssLog(r14)
            r13.<init>(r8, r3, r15, r14)
            r18[r9] = r13
            int r9 = r9 + 2
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r8 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r8.<init>(r5, r4, r7, r12)
            r18[r11] = r8
        L249:
            r5 = r3
            goto L1ed
        L24b:
            if (r13 > r14) goto L266
            int r11 = r9 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r13 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r13.<init>(r5, r4, r7, r12)
            r18[r9] = r13
            int r9 = r9 + 2
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r4 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            int r5 = r7 + 1
            int r13 = ssLog(r14)
            r4.<init>(r8, r3, r5, r13)
            r18[r11] = r4
            goto L249
        L266:
            int r11 = r9 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r13 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r13.<init>(r5, r4, r7, r12)
            r18[r9] = r13
            int r9 = r9 + 2
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r4 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r4.<init>(r3, r6, r7, r12)
            r18[r11] = r4
            int r7 = r7 + 1
            int r4 = ssLog(r14)
            goto L227
        L27f:
            r18 = r4
            r3 = r2[r5]
            int r3 = r3 + r1
            r3 = r2[r3]
            int r3 = r3 + r7
            int r3 = r3 + (-1)
            r3 = r16[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r3 >= r15) goto L29b
            int r3 = r0.ssSubstringPartition(r1, r5, r6, r7)
            int r4 = r6 - r3
            int r4 = ssLog(r4)
            r5 = r3
            r8 = r4
        L29b:
            int r7 = r7 + 1
            goto L1ee
    }

    private int ssPivot(int r11, int r12, int r13, int r14) {
            r10 = this;
            int r0 = r14 - r13
            int r1 = r0 / 2
            int r6 = r13 + r1
            r1 = 512(0x200, float:7.17E-43)
            if (r0 > r1) goto L2e
            r1 = 32
            if (r0 > r1) goto L19
            int r7 = r14 + (-1)
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            int r11 = r2.ssMedian3(r3, r4, r5, r6, r7)
            return r11
        L19:
            r1 = r11
            r2 = r12
            r5 = r13
            int r11 = r0 >> 2
            int r13 = r5 + r11
            int r9 = r14 + (-1)
            int r8 = r9 - r11
            r3 = r1
            r4 = r2
            r7 = r6
            r2 = r10
            r6 = r13
            int r11 = r2.ssMedian5(r3, r4, r5, r6, r7, r8, r9)
            return r11
        L2e:
            r1 = r11
            r2 = r12
            r5 = r13
            int r11 = r0 >> 3
            int r4 = r5 + r11
            int r12 = r11 << 1
            int r13 = r5 + r12
            r0 = r10
            r3 = r5
            r5 = r13
            int r13 = r0.ssMedian3(r1, r2, r3, r4, r5)
            int r5 = r6 - r11
            int r7 = r6 + r11
            r3 = r1
            r4 = r2
            r2 = r10
            int r6 = r2.ssMedian3(r3, r4, r5, r6, r7)
            r2 = r4
            int r5 = r14 + (-1)
            int r3 = r5 - r12
            int r4 = r5 - r11
            int r5 = r0.ssMedian3(r1, r2, r3, r4, r5)
            r3 = r13
            r4 = r6
            int r11 = r0.ssMedian3(r1, r2, r3, r4, r5)
            return r11
    }

    private int ssSubstringPartition(int r6, int r7, int r8, int r9) {
            r5 = this;
            int[] r0 = r5.SA
            int r1 = r7 + (-1)
        L4:
            int r1 = r1 + 1
            if (r1 >= r8) goto L1d
            r2 = r0[r1]
            int r3 = r6 + r2
            r3 = r0[r3]
            int r3 = r3 + r9
            int r4 = r6 + r2
            int r4 = r4 + 1
            r4 = r0[r4]
            int r4 = r4 + 1
            if (r3 < r4) goto L1d
            int r2 = ~r2
            r0[r1] = r2
            goto L4
        L1d:
            int r8 = r8 + (-1)
            if (r1 >= r8) goto L32
            r2 = r0[r8]
            int r3 = r6 + r2
            r3 = r0[r3]
            int r3 = r3 + r9
            int r2 = r2 + r6
            int r2 = r2 + 1
            r2 = r0[r2]
            int r2 = r2 + 1
            if (r3 >= r2) goto L32
            goto L1d
        L32:
            if (r8 > r1) goto L3c
            if (r7 >= r1) goto L3b
            r6 = r0[r7]
            int r6 = ~r6
            r0[r7] = r6
        L3b:
            return r1
        L3c:
            r2 = r0[r8]
            int r2 = ~r2
            r3 = r0[r1]
            r0[r8] = r3
            r0[r1] = r2
            goto L4
    }

    private void subStringSort(int r19, int r20, int r21, int[] r22, int r23, int r24, int r25, boolean r26, int r27) {
            r18 = this;
            r0 = r18
            r1 = r19
            r9 = r21
            r8 = r25
            int[] r10 = r0.SA
            if (r26 == 0) goto L10
            int r2 = r20 + 1
            r11 = r2
            goto L12
        L10:
            r11 = r20
        L12:
            r2 = 0
            r2 = r11
            r12 = 0
        L15:
            int r13 = r2 + 1024
            r3 = 1024(0x400, float:1.435E-42)
            r14 = 1
            if (r13 >= r9) goto L47
            r0.ssMultiKeyIntroSort(r1, r2, r13, r8)
            int r4 = r9 - r13
            r15 = r24
            if (r4 > r15) goto L2b
            r5 = r22
            r6 = r23
            r7 = r15
            goto L2e
        L2b:
            r7 = r4
            r5 = r10
            r6 = r13
        L2e:
            r17 = r12
            r16 = 1024(0x400, float:1.435E-42)
        L32:
            r3 = r2
            r2 = r17 & 1
            if (r2 == 0) goto L43
            int r2 = r3 - r16
            int r4 = r3 + r16
            r0.ssMerge(r1, r2, r3, r4, r5, r6, r7, r8)
            int r16 = r16 << 1
            int r17 = r17 >>> 1
            goto L32
        L43:
            int r12 = r12 + 1
            r2 = r13
            goto L15
        L47:
            r15 = r24
            r0.ssMultiKeyIntroSort(r1, r2, r9, r8)
            r3 = r2
            r13 = r12
            r12 = 1024(0x400, float:1.435E-42)
        L50:
            if (r13 == 0) goto L6f
            r2 = r13 & 1
            if (r2 == 0) goto L62
            int r2 = r3 - r12
            r5 = r22
            r6 = r23
            r4 = r9
            r7 = r15
            r0.ssMerge(r1, r2, r3, r4, r5, r6, r7, r8)
            r3 = r2
        L62:
            int r12 = r12 << 1
            int r13 = r13 >> 1
            r0 = r18
            r1 = r19
            r15 = r24
            r8 = r25
            goto L50
        L6f:
            if (r26 == 0) goto La2
            int r0 = r11 + (-1)
            r6 = r10[r0]
            r0 = 1
        L76:
            if (r11 >= r9) goto L98
            r1 = r10[r11]
            if (r1 < 0) goto L8f
            int r2 = r19 + r6
            int r3 = r19 + r1
            r0 = r18
            r1 = r19
            r4 = r25
            r5 = r27
            int r2 = r0.ssCompareLast(r1, r2, r3, r4, r5)
            r0 = r2
            if (r2 <= 0) goto L98
        L8f:
            int r1 = r11 + (-1)
            r2 = r10[r11]
            r10[r1] = r2
            int r11 = r11 + 1
            goto L76
        L98:
            if (r0 != 0) goto L9f
            r0 = r10[r11]
            int r0 = ~r0
            r10[r11] = r0
        L9f:
            int r11 = r11 - r14
            r10[r11] = r6
        La2:
            return
    }

    private static void swapElements(int[] r2, int r3, int[] r4, int r5) {
            r0 = r2[r3]
            r1 = r4[r5]
            r2[r3] = r1
            r4[r5] = r0
            return
    }

    private void trCopy(int r6, int r7, int r8, int r9, int r10, int r11, int r12) {
            r5 = this;
            int[] r0 = r5.SA
            int r1 = r10 + (-1)
            int r9 = r9 + (-1)
        L6:
            if (r8 > r9) goto L1f
            r2 = r0[r8]
            int r2 = r2 - r12
            if (r2 >= 0) goto L10
            int r3 = r7 - r6
            int r2 = r2 + r3
        L10:
            int r3 = r6 + r2
            r4 = r0[r3]
            if (r4 != r1) goto L1c
            int r9 = r9 + 1
            r0[r9] = r2
            r0[r3] = r9
        L1c:
            int r8 = r8 + 1
            goto L6
        L1f:
            int r11 = r11 + (-1)
            int r9 = r9 + 1
        L23:
            if (r9 >= r10) goto L3c
            r8 = r0[r11]
            int r8 = r8 - r12
            if (r8 >= 0) goto L2d
            int r2 = r7 - r6
            int r8 = r8 + r2
        L2d:
            int r2 = r6 + r8
            r3 = r0[r2]
            if (r3 != r1) goto L39
            int r10 = r10 + (-1)
            r0[r10] = r8
            r0[r2] = r10
        L39:
            int r11 = r11 + (-1)
            goto L23
        L3c:
            return
    }

    private void trFixdown(int r8, int r9, int r10, int r11, int r12, int r13) {
            r7 = this;
            int[] r0 = r7.SA
            int r1 = r11 + r12
            r1 = r0[r1]
            int r2 = r7.trGetC(r8, r9, r10, r1)
        La:
            int r3 = r12 * 2
            int r4 = r3 + 1
            if (r4 >= r13) goto L33
            int r3 = r3 + 2
            int r5 = r11 + r4
            r5 = r0[r5]
            int r5 = r7.trGetC(r8, r9, r10, r5)
            int r6 = r11 + r3
            r6 = r0[r6]
            int r6 = r7.trGetC(r8, r9, r10, r6)
            if (r5 >= r6) goto L26
            r5 = r6
            goto L27
        L26:
            r3 = r4
        L27:
            if (r5 > r2) goto L2a
            goto L33
        L2a:
            int r12 = r12 + r11
            int r4 = r11 + r3
            r4 = r0[r4]
            r0[r12] = r4
            r12 = r3
            goto La
        L33:
            int r11 = r11 + r12
            r0[r11] = r1
            return
    }

    private int trGetC(int r2, int r3, int r4, int r5) {
            r1 = this;
            int r0 = r3 + r5
            if (r0 >= r4) goto L9
            int[] r2 = r1.SA
            r2 = r2[r0]
            return r2
        L9:
            int[] r0 = r1.SA
            int r3 = r3 - r2
            int r3 = r3 + r5
            int r4 = r4 - r2
            int r3 = r3 % r4
            int r2 = r2 + r3
            r2 = r0[r2]
            return r2
    }

    private void trHeapSort(int r12, int r13, int r14, int r15, int r16) {
            r11 = this;
            int[] r7 = r11.SA
            int r8 = r16 % 2
            if (r8 != 0) goto L20
            int r4 = r16 + (-1)
            int r5 = r4 / 2
            int r5 = r5 + r15
            r6 = r7[r5]
            int r6 = r11.trGetC(r12, r13, r14, r6)
            int r9 = r15 + r4
            r10 = r7[r9]
            int r10 = r11.trGetC(r12, r13, r14, r10)
            if (r6 >= r10) goto L1e
            swapElements(r7, r9, r7, r5)
        L1e:
            r6 = r4
            goto L22
        L20:
            r6 = r16
        L22:
            int r4 = r6 / 2
            int r4 = r4 + (-1)
            r5 = r4
        L27:
            if (r5 < 0) goto L34
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0.trFixdown(r1, r2, r3, r4, r5, r6)
            int r5 = r5 + (-1)
            goto L27
        L34:
            if (r8 != 0) goto L44
            int r0 = r15 + r6
            swapElements(r7, r15, r7, r0)
            r5 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0.trFixdown(r1, r2, r3, r4, r5, r6)
        L44:
            int r6 = r6 + (-1)
        L46:
            if (r6 <= 0) goto L5e
            r8 = r7[r15]
            int r9 = r15 + r6
            r0 = r7[r9]
            r7[r15] = r0
            r5 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0.trFixdown(r1, r2, r3, r4, r5, r6)
            r7[r9] = r8
            int r6 = r6 + (-1)
            goto L46
        L5e:
            return
    }

    private void trInsertionSort(int r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            int[] r0 = r7.SA
            int r1 = r11 + 1
        L4:
            if (r1 >= r12) goto L35
            r2 = r0[r1]
            int r3 = r1 + (-1)
        La:
            int r4 = r7.trGetC(r8, r9, r10, r2)
            r5 = r0[r3]
            int r5 = r7.trGetC(r8, r9, r10, r5)
            int r4 = r4 - r5
            if (r4 >= 0) goto L27
        L17:
            int r5 = r3 + 1
            r6 = r0[r3]
            r0[r5] = r6
            int r3 = r3 + (-1)
            if (r11 > r3) goto L25
            r5 = r0[r3]
            if (r5 < 0) goto L17
        L25:
            if (r3 >= r11) goto La
        L27:
            if (r4 != 0) goto L2e
            r4 = r0[r3]
            int r4 = ~r4
            r0[r3] = r4
        L2e:
            int r3 = r3 + 1
            r0[r3] = r2
            int r1 = r1 + 1
            goto L4
        L35:
            return
    }

    private void trIntroSort(int r24, int r25, int r26, int r27, int r28, io.netty.handler.codec.compression.Bzip2DivSufSort.TRBudget r29, int r30) {
            r23 = this;
            r0 = r23
            r8 = r29
            r9 = r30
            int[] r10 = r0.SA
            r1 = 64
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry[] r11 = new io.netty.handler.codec.compression.Bzip2DivSufSort.StackEntry[r1]
            int r1 = r28 - r27
            int r1 = trLog(r1)
            r12 = 0
            r7 = r25
            r4 = r27
            r5 = r28
            r6 = r1
            r13 = 0
            r14 = 0
        L1c:
            r15 = -3
            r1 = -1
            r2 = 1
            if (r6 >= 0) goto L1c0
            r3 = -2
            if (r6 != r1) goto L10e
            int r1 = r5 - r4
            boolean r1 = r8.update(r9, r1)
            if (r1 != 0) goto L34
        L2c:
            r1 = r24
            r19 = r11
            r18 = r13
            goto L4c2
        L34:
            r1 = 1
            int r2 = r7 + (-1)
            int r6 = r5 + (-1)
            r1 = r24
            r3 = r26
            r15 = -2
            io.netty.handler.codec.compression.Bzip2DivSufSort$PartitionResult r6 = r0.trPartition(r1, r2, r3, r4, r5, r6)
            int r0 = r6.first
            int r1 = r6.last
            if (r4 < r0) goto L6e
            if (r1 >= r5) goto L4b
            goto L6e
        L4b:
            if (r4 >= r5) goto L56
            r0 = r10[r4]
            int r0 = r24 + r0
            r10[r0] = r4
            int r4 = r4 + 1
            goto L4b
        L56:
            if (r13 != 0) goto L5c
        L58:
            r0 = r23
            goto L4d8
        L5c:
            int r13 = r13 + (-1)
            r0 = r11[r13]
            int r1 = r0.a
            int r2 = r0.b
            int r3 = r0.c
            int r0 = r0.d
        L68:
            r6 = r0
            r7 = r1
            r4 = r2
            r5 = r3
            goto L109
        L6e:
            if (r0 >= r5) goto L7e
            int r3 = r0 + (-1)
            r6 = r4
        L73:
            if (r6 >= r0) goto L7e
            r17 = r10[r6]
            int r17 = r24 + r17
            r10[r17] = r3
            int r6 = r6 + 1
            goto L73
        L7e:
            if (r1 >= r5) goto L8e
            int r3 = r1 + (-1)
            r6 = r0
        L83:
            if (r6 >= r1) goto L8e
            r17 = r10[r6]
            int r17 = r24 + r17
            r10[r17] = r3
            int r6 = r6 + 1
            goto L83
        L8e:
            int r3 = r13 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r6 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r6.<init>(r12, r0, r1, r12)
            r11[r13] = r6
            int r6 = r13 + 2
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r12 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r12.<init>(r2, r4, r5, r15)
            r11[r3] = r12
            int r2 = r0 - r4
            int r3 = r5 - r1
            if (r2 > r3) goto Ld7
            r12 = 1
            if (r12 >= r2) goto Lbd
            int r13 = r13 + 3
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r12 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            int r3 = trLog(r3)
            r12.<init>(r7, r1, r5, r3)
            r11[r6] = r12
            int r1 = trLog(r2)
            r5 = r0
        Lbb:
            r6 = r1
            goto L109
        Lbd:
            if (r12 >= r3) goto Lc7
            int r0 = trLog(r3)
            r4 = r1
            r13 = r6
            r6 = r0
            goto L109
        Lc7:
            if (r6 != 0) goto Lca
            goto L58
        Lca:
            int r13 = r13 + 1
            r0 = r11[r13]
            int r1 = r0.a
            int r2 = r0.b
            int r3 = r0.c
            int r0 = r0.d
            goto L68
        Ld7:
            r12 = 1
            if (r12 >= r3) goto Lee
            int r13 = r13 + 3
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r12 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            int r2 = trLog(r2)
            r12.<init>(r7, r4, r0, r2)
            r11[r6] = r12
            int r0 = trLog(r3)
            r6 = r0
            r4 = r1
            goto L109
        Lee:
            if (r12 >= r2) goto Lf7
            int r1 = trLog(r2)
            r5 = r0
            r13 = r6
            goto Lbb
        Lf7:
            if (r6 != 0) goto Lfb
            goto L58
        Lfb:
            int r13 = r13 + 1
            r0 = r11[r13]
            int r1 = r0.a
            int r2 = r0.b
            int r3 = r0.c
            int r0 = r0.d
            goto L68
        L109:
            r12 = 0
        L10a:
            r0 = r23
            goto L1c
        L10e:
            r0 = -2
            r12 = 1
            if (r6 != r0) goto L139
            int r12 = r13 + (-1)
            r0 = r11[r12]
            r3 = r4
            int r4 = r0.b
            int r0 = r0.c
            int r7 = r7 - r24
            r1 = r24
            r2 = r26
            r6 = r5
            r5 = r0
            r0 = r23
            r0.trCopy(r1, r2, r3, r4, r5, r6, r7)
            if (r12 != 0) goto L12c
            goto L58
        L12c:
            int r13 = r13 + (-2)
            r0 = r11[r13]
            int r7 = r0.a
            int r4 = r0.b
            int r5 = r0.c
            int r6 = r0.d
            goto L109
        L139:
            r0 = r10[r4]
            if (r0 < 0) goto L14a
        L13d:
            r0 = r10[r4]
            int r0 = r24 + r0
            r10[r0] = r4
            int r4 = r4 + r12
            if (r4 >= r5) goto L14a
            r0 = r10[r4]
            if (r0 >= 0) goto L13d
        L14a:
            if (r4 >= r5) goto L1ae
            r0 = r4
        L14d:
            r2 = r10[r0]
            int r2 = ~r2
            r10[r0] = r2
            int r2 = r0 + 1
            r3 = r10[r2]
            if (r3 < 0) goto L1ac
            int r6 = r24 + r3
            r6 = r10[r6]
            int r3 = r3 + r7
            r3 = r10[r3]
            if (r6 == r3) goto L169
            int r2 = r2 - r4
            int r2 = r2 + r12
            int r1 = trLog(r2)
            r6 = r1
            goto L16a
        L169:
            r6 = -1
        L16a:
            int r1 = r0 + 2
            if (r1 >= r5) goto L17c
            int r0 = r0 + 1
            r2 = r4
        L171:
            if (r2 >= r1) goto L17c
            r3 = r10[r2]
            int r3 = r24 + r3
            r10[r3] = r0
            int r2 = r2 + 1
            goto L171
        L17c:
            int r0 = r1 - r4
            int r2 = r5 - r1
            if (r0 > r2) goto L192
            int r0 = r13 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r2 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r2.<init>(r7, r1, r5, r15)
            r11[r13] = r2
            int r7 = r7 + 1
            r12 = 0
            r13 = r0
            r5 = r1
            goto L10a
        L192:
            if (r12 >= r2) goto L1a4
            int r0 = r13 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r2 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            int r3 = r7 + 1
            r2.<init>(r3, r4, r1, r6)
            r11[r13] = r2
            r13 = r0
            r4 = r1
            r6 = -3
            goto L109
        L1a4:
            int r7 = r7 + 1
            r12 = 0
            r0 = r23
            r5 = r1
            goto L1c
        L1ac:
            r0 = r2
            goto L14d
        L1ae:
            if (r13 != 0) goto L1b2
            goto L58
        L1b2:
            int r13 = r13 + (-1)
            r0 = r11[r13]
            int r7 = r0.a
            int r4 = r0.b
            int r5 = r0.c
            int r6 = r0.d
            goto L109
        L1c0:
            r0 = r5
            r12 = 1
            int r5 = r0 - r4
            r2 = 8
            if (r5 > r2) goto L1e3
            boolean r1 = r8.update(r9, r5)
            if (r1 != 0) goto L1d2
        L1ce:
            r0 = r23
            goto L2c
        L1d2:
            r1 = r24
            r3 = r26
            r5 = r0
            r2 = r7
            r0 = r23
            r0.trInsertionSort(r1, r2, r3, r4, r5)
            r7 = r5
        L1de:
            r6 = -3
        L1df:
            r12 = 0
            r7 = r2
            goto L1c
        L1e3:
            r2 = r7
            r7 = r0
            int r0 = r6 + (-1)
            if (r6 != 0) goto L219
            boolean r0 = r8.update(r9, r5)
            if (r0 != 0) goto L1f0
            goto L1ce
        L1f0:
            r0 = r23
            r1 = r24
            r3 = r26
            r0.trHeapSort(r1, r2, r3, r4, r5)
            int r5 = r7 + (-1)
        L1fb:
            if (r4 >= r5) goto L217
            r6 = r10[r5]
            int r14 = r0.trGetC(r1, r2, r3, r6)
            int r5 = r5 + (-1)
        L205:
            if (r4 > r5) goto L1fb
            r6 = r10[r5]
            int r6 = r0.trGetC(r1, r2, r3, r6)
            if (r6 != r14) goto L1fb
            r6 = r10[r5]
            int r6 = ~r6
            r10[r5] = r6
            int r5 = r5 + (-1)
            goto L205
        L217:
            r5 = r7
            goto L1de
        L219:
            r27 = r7
            r7 = r5
            r5 = r27
            r1 = r24
            r3 = r26
            r15 = r0
            r27 = 1
            r16 = -1
            r0 = r23
            int r12 = r0.trPivot(r1, r2, r3, r4, r5)
            swapElements(r10, r4, r10, r12)
            r12 = r10[r4]
            int r12 = r0.trGetC(r1, r2, r3, r12)
            int r18 = r4 + 1
            r28 = r6
            r6 = r18
        L23c:
            if (r6 >= r5) goto L249
            r14 = r10[r6]
            int r14 = r0.trGetC(r1, r2, r3, r14)
            if (r14 != r12) goto L249
            int r6 = r6 + 1
            goto L23c
        L249:
            if (r6 >= r5) goto L26d
            if (r14 >= r12) goto L26d
            r18 = r14
            r14 = r6
        L250:
            int r6 = r6 + 1
            r19 = r11
            if (r6 >= r5) goto L26a
            r11 = r10[r6]
            int r11 = r0.trGetC(r1, r2, r3, r11)
            if (r11 > r12) goto L271
            if (r11 != r12) goto L265
            swapElements(r10, r6, r10, r14)
            int r14 = r14 + 1
        L265:
            r18 = r11
            r11 = r19
            goto L250
        L26a:
            r11 = r18
            goto L271
        L26d:
            r19 = r11
            r11 = r14
            r14 = r6
        L271:
            int r18 = r5 + (-1)
            r22 = r18
            r18 = r11
            r11 = r22
        L279:
            r20 = r14
            if (r6 >= r11) goto L28c
            r14 = r10[r11]
            int r14 = r0.trGetC(r1, r2, r3, r14)
            if (r14 != r12) goto L28e
            int r11 = r11 + (-1)
            r18 = r14
            r14 = r20
            goto L279
        L28c:
            r14 = r18
        L28e:
            if (r6 >= r11) goto L2bb
            if (r14 <= r12) goto L2bb
            r18 = r14
            r14 = r11
        L295:
            int r11 = r11 + (-1)
            r21 = r6
            if (r6 >= r11) goto L2b8
            r6 = r10[r11]
            int r6 = r0.trGetC(r1, r2, r3, r6)
            if (r6 < r12) goto L2af
            if (r6 != r12) goto L2aa
            swapElements(r10, r11, r10, r14)
            int r14 = r14 + (-1)
        L2aa:
            r18 = r6
            r6 = r21
            goto L295
        L2af:
            r18 = r13
            r13 = r20
        L2b3:
            r20 = r6
            r6 = r21
            goto L2c6
        L2b8:
            r6 = r18
            goto L2af
        L2bb:
            r21 = r6
            r18 = r13
            r13 = r20
            r6 = r21
            r20 = r14
            r14 = r11
        L2c6:
            if (r6 >= r11) goto L303
            swapElements(r10, r6, r10, r11)
        L2cb:
            int r6 = r6 + 1
            r21 = r11
            if (r6 >= r11) goto L2e9
            r11 = r10[r6]
            int r11 = r0.trGetC(r1, r2, r3, r11)
            if (r11 > r12) goto L2e5
            if (r11 != r12) goto L2e0
            swapElements(r10, r6, r10, r13)
            int r13 = r13 + 1
        L2e0:
            r20 = r11
            r11 = r21
            goto L2cb
        L2e5:
            r20 = r11
            r11 = r21
        L2e9:
            int r11 = r11 + (-1)
            r21 = r6
            if (r6 >= r11) goto L2c6
            r6 = r10[r11]
            int r6 = r0.trGetC(r1, r2, r3, r6)
            if (r6 < r12) goto L2b3
            if (r6 != r12) goto L2fe
            swapElements(r10, r11, r10, r14)
            int r14 = r14 + (-1)
        L2fe:
            r20 = r6
            r6 = r21
            goto L2e9
        L303:
            if (r13 > r14) goto L4bc
            int r7 = r6 + (-1)
            int r11 = r13 - r4
            int r13 = r6 - r13
            if (r11 <= r13) goto L30e
            r11 = r13
        L30e:
            int r21 = r6 - r11
            r3 = r21
            r21 = r11
            r11 = r4
        L315:
            if (r21 <= 0) goto L321
            swapElements(r10, r11, r10, r3)
            int r21 = r21 + (-1)
            int r11 = r11 + 1
            int r3 = r3 + 1
            goto L315
        L321:
            int r3 = r14 - r7
            int r7 = r5 - r14
            int r7 = r7 + (-1)
            if (r3 <= r7) goto L32a
            goto L32b
        L32a:
            r7 = r3
        L32b:
            int r11 = r5 - r7
        L32d:
            if (r7 <= 0) goto L339
            swapElements(r10, r6, r10, r11)
            int r7 = r7 + (-1)
            int r6 = r6 + 1
            int r11 = r11 + 1
            goto L32d
        L339:
            int r6 = r4 + r13
            int r3 = r5 - r3
            r7 = r10[r6]
            int r7 = r7 + r1
            r7 = r10[r7]
            if (r7 == r12) goto L34b
            int r7 = r3 - r6
            int r7 = trLog(r7)
            goto L34c
        L34b:
            r7 = -1
        L34c:
            int r11 = r6 + (-1)
            r12 = r4
        L34f:
            if (r12 >= r6) goto L359
            r13 = r10[r12]
            int r13 = r13 + r1
            r10[r13] = r11
            int r12 = r12 + 1
            goto L34f
        L359:
            if (r3 >= r5) goto L368
            int r11 = r3 + (-1)
            r12 = r6
        L35e:
            if (r12 >= r3) goto L368
            r13 = r10[r12]
            int r13 = r13 + r1
            r10[r13] = r11
            int r12 = r12 + 1
            goto L35e
        L368:
            int r11 = r6 - r4
            int r12 = r5 - r3
            if (r11 > r12) goto L426
            int r13 = r3 - r6
            if (r12 > r13) goto L3c4
            r14 = 1
            if (r14 >= r11) goto L392
            int r13 = r18 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r11 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            int r12 = r2 + 1
            r11.<init>(r12, r6, r3, r7)
            r19[r18] = r11
            int r7 = r18 + 2
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r11 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r11.<init>(r2, r3, r5, r15)
            r19[r13] = r11
            r5 = r6
        L38a:
            r13 = r7
            r6 = r15
        L38c:
            r11 = r19
            r14 = r20
            goto L1df
        L392:
            if (r14 >= r12) goto L3a9
            int r13 = r18 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r4 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            int r11 = r2 + 1
            r4.<init>(r11, r6, r3, r7)
            r19[r18] = r4
        L39f:
            r7 = r2
            r4 = r3
        L3a1:
            r6 = r15
        L3a2:
            r11 = r19
            r14 = r20
            r12 = 0
            goto L1c
        L3a9:
            if (r14 >= r13) goto L3b3
        L3ab:
            int r2 = r2 + 1
            r5 = r3
            r4 = r6
            r6 = r7
            r13 = r18
            goto L38c
        L3b3:
            if (r18 != 0) goto L3b7
            goto L4d8
        L3b7:
            int r13 = r18 + (-1)
            r2 = r19[r13]
            int r7 = r2.a
            int r4 = r2.b
            int r5 = r2.c
            int r6 = r2.d
            goto L3a2
        L3c4:
            if (r11 > r13) goto L3f8
            r14 = 1
            if (r14 >= r11) goto L3e1
            int r13 = r18 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r11 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r11.<init>(r2, r3, r5, r15)
            r19[r18] = r11
            int r5 = r18 + 2
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r11 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            int r12 = r2 + 1
            r11.<init>(r12, r6, r3, r7)
            r19[r13] = r11
            r7 = r2
            r13 = r5
        L3df:
            r5 = r6
            goto L3a1
        L3e1:
            if (r14 >= r13) goto L3f2
            int r13 = r18 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r4 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r4.<init>(r2, r3, r5, r15)
            r19[r18] = r4
        L3ec:
            int r2 = r2 + 1
            r5 = r3
        L3ef:
            r4 = r6
            r6 = r7
            goto L38c
        L3f2:
            r7 = r2
            r4 = r3
        L3f4:
            r6 = r15
            r13 = r18
            goto L3a2
        L3f8:
            r14 = 1
            if (r14 >= r13) goto L41b
            int r13 = r18 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r11 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r11.<init>(r2, r3, r5, r15)
            r19[r18] = r11
            int r5 = r18 + 2
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r11 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r11.<init>(r2, r4, r6, r15)
            r19[r13] = r11
            int r2 = r2 + 1
            r13 = r5
            r4 = r6
            r6 = r7
            r11 = r19
            r14 = r20
            r12 = 0
            r7 = r2
            r5 = r3
            goto L1c
        L41b:
            int r13 = r18 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r7 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r7.<init>(r2, r3, r5, r15)
            r19[r18] = r7
        L424:
            r7 = r2
            goto L3df
        L426:
            int r13 = r3 - r6
            if (r11 > r13) goto L462
            r14 = 1
            if (r14 >= r12) goto L444
            int r13 = r18 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r11 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            int r12 = r2 + 1
            r11.<init>(r12, r6, r3, r7)
            r19[r18] = r11
            int r7 = r18 + 2
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r11 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r11.<init>(r2, r4, r6, r15)
            r19[r13] = r11
            r4 = r3
            goto L38a
        L444:
            if (r14 >= r11) goto L452
            int r13 = r18 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r5 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            int r11 = r2 + 1
            r5.<init>(r11, r6, r3, r7)
            r19[r18] = r5
            goto L424
        L452:
            if (r14 >= r13) goto L456
            goto L3ab
        L456:
            int r13 = r18 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r3 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r3.<init>(r2, r4, r5, r15)
            r19[r18] = r3
            r7 = r2
            goto L3a1
        L462:
            r14 = 1
            if (r12 > r13) goto L497
            if (r14 >= r12) goto L486
            int r13 = r18 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r11 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r11.<init>(r2, r4, r6, r15)
            r19[r18] = r11
            int r4 = r18 + 2
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r11 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            int r12 = r2 + 1
            r11.<init>(r12, r6, r3, r7)
            r19[r13] = r11
            r7 = r2
            r13 = r4
            r6 = r15
            r11 = r19
            r14 = r20
            r12 = 0
            r4 = r3
            goto L1c
        L486:
            if (r14 >= r13) goto L493
            int r13 = r18 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r5 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r5.<init>(r2, r4, r6, r15)
            r19[r18] = r5
            goto L3ec
        L493:
            r7 = r2
            r5 = r6
            goto L3f4
        L497:
            if (r14 >= r13) goto L4b1
            int r13 = r18 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r11 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r11.<init>(r2, r4, r6, r15)
            r19[r18] = r11
            int r4 = r18 + 2
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r11 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r11.<init>(r2, r3, r5, r15)
            r19[r13] = r11
            int r2 = r2 + 1
            r5 = r3
            r13 = r4
            goto L3ef
        L4b1:
            int r13 = r18 + 1
            io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry r7 = new io.netty.handler.codec.compression.Bzip2DivSufSort$StackEntry
            r7.<init>(r2, r4, r6, r15)
            r19[r18] = r7
            goto L39f
        L4bc:
            boolean r3 = r8.update(r9, r7)
            if (r3 != 0) goto L4d9
        L4c2:
            r13 = r18
            r12 = 0
        L4c5:
            if (r12 >= r13) goto L4d8
            r2 = r19[r12]
            int r3 = r2.d
            r4 = -3
            if (r3 != r4) goto L4d5
            int r3 = r2.b
            int r2 = r2.c
            r0.lsUpdateGroup(r1, r3, r2)
        L4d5:
            int r12 = r12 + 1
            goto L4c5
        L4d8:
            return
        L4d9:
            r13 = r18
            int r7 = r2 + 1
            r6 = r28
            goto L3a2
    }

    private static int trLog(int r1) {
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r1
            if (r0 == 0) goto L1e
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r1
            if (r0 == 0) goto L15
            int[] r0 = io.netty.handler.codec.compression.Bzip2DivSufSort.LOG_2_TABLE
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r0[r1]
            int r1 = r1 + 24
            return r1
        L15:
            int[] r0 = io.netty.handler.codec.compression.Bzip2DivSufSort.LOG_2_TABLE
            int r1 = r1 >> 16
            r1 = r1 & 271(0x10f, float:3.8E-43)
            r1 = r0[r1]
            return r1
        L1e:
            r0 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L2f
            int[] r0 = io.netty.handler.codec.compression.Bzip2DivSufSort.LOG_2_TABLE
            int r1 = r1 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r0[r1]
            int r1 = r1 + 8
            return r1
        L2f:
            int[] r0 = io.netty.handler.codec.compression.Bzip2DivSufSort.LOG_2_TABLE
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r0[r1]
            return r1
    }

    private int trMedian3(int r5, int r6, int r7, int r8, int r9, int r10) {
            r4 = this;
            int[] r0 = r4.SA
            r1 = r0[r8]
            int r1 = r4.trGetC(r5, r6, r7, r1)
            r2 = r0[r9]
            int r2 = r4.trGetC(r5, r6, r7, r2)
            r0 = r0[r10]
            int r5 = r4.trGetC(r5, r6, r7, r0)
            if (r1 <= r2) goto L17
            goto L1d
        L17:
            r3 = r9
            r9 = r8
            r8 = r3
            r3 = r2
            r2 = r1
            r1 = r3
        L1d:
            if (r1 <= r5) goto L23
            if (r2 <= r5) goto L22
            return r9
        L22:
            return r10
        L23:
            return r8
    }

    private int trMedian5(int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14) {
            r6 = this;
            int[] r0 = r6.SA
            r1 = r0[r10]
            int r1 = r6.trGetC(r7, r8, r9, r1)
            r2 = r0[r11]
            int r2 = r6.trGetC(r7, r8, r9, r2)
            r3 = r0[r12]
            int r3 = r6.trGetC(r7, r8, r9, r3)
            r4 = r0[r13]
            int r4 = r6.trGetC(r7, r8, r9, r4)
            r0 = r0[r14]
            int r7 = r6.trGetC(r7, r8, r9, r0)
            if (r2 <= r3) goto L28
            r5 = r12
            r12 = r11
            r11 = r5
            r5 = r3
            r3 = r2
            r2 = r5
        L28:
            if (r4 <= r7) goto L2e
            r5 = r4
            r4 = r7
            r7 = r5
            goto L31
        L2e:
            r5 = r14
            r14 = r13
            r13 = r5
        L31:
            if (r2 <= r4) goto L3a
            r5 = r3
            r3 = r7
            r7 = r5
            r5 = r13
            r13 = r12
            r12 = r5
            goto L3c
        L3a:
            r11 = r14
            r2 = r4
        L3c:
            if (r1 <= r3) goto L44
            r5 = r12
            r12 = r10
            r10 = r5
            r5 = r3
            r3 = r1
            r1 = r5
        L44:
            if (r1 <= r2) goto L49
            r11 = r10
            r2 = r1
            goto L4b
        L49:
            r13 = r12
            r7 = r3
        L4b:
            if (r7 <= r2) goto L4e
            return r11
        L4e:
            return r13
    }

    private io.netty.handler.codec.compression.Bzip2DivSufSort.PartitionResult trPartition(int r7, int r8, int r9, int r10, int r11, int r12) {
            r6 = this;
            int[] r0 = r6.SA
            r1 = 0
            r2 = r10
        L4:
            if (r2 >= r11) goto L11
            r1 = r0[r2]
            int r1 = r6.trGetC(r7, r8, r9, r1)
            if (r1 != r12) goto L11
            int r2 = r2 + 1
            goto L4
        L11:
            if (r2 >= r11) goto L2a
            if (r1 >= r12) goto L2a
            r3 = r2
        L16:
            int r2 = r2 + 1
            if (r2 >= r11) goto L2b
            r1 = r0[r2]
            int r1 = r6.trGetC(r7, r8, r9, r1)
            if (r1 > r12) goto L2b
            if (r1 != r12) goto L16
            swapElements(r0, r2, r0, r3)
            int r3 = r3 + 1
            goto L16
        L2a:
            r3 = r2
        L2b:
            int r4 = r11 + (-1)
        L2d:
            if (r2 >= r4) goto L3a
            r1 = r0[r4]
            int r1 = r6.trGetC(r7, r8, r9, r1)
            if (r1 != r12) goto L3a
            int r4 = r4 + (-1)
            goto L2d
        L3a:
            if (r2 >= r4) goto L53
            if (r1 <= r12) goto L53
            r1 = r4
        L3f:
            int r4 = r4 + (-1)
            if (r2 >= r4) goto L54
            r5 = r0[r4]
            int r5 = r6.trGetC(r7, r8, r9, r5)
            if (r5 < r12) goto L54
            if (r5 != r12) goto L3f
            swapElements(r0, r4, r0, r1)
            int r1 = r1 + (-1)
            goto L3f
        L53:
            r1 = r4
        L54:
            if (r2 >= r4) goto L81
            swapElements(r0, r2, r0, r4)
        L59:
            int r2 = r2 + 1
            if (r2 >= r4) goto L6d
            r5 = r0[r2]
            int r5 = r6.trGetC(r7, r8, r9, r5)
            if (r5 > r12) goto L6d
            if (r5 != r12) goto L59
            swapElements(r0, r2, r0, r3)
            int r3 = r3 + 1
            goto L59
        L6d:
            int r4 = r4 + (-1)
            if (r2 >= r4) goto L54
            r5 = r0[r4]
            int r5 = r6.trGetC(r7, r8, r9, r5)
            if (r5 < r12) goto L54
            if (r5 != r12) goto L6d
            swapElements(r0, r4, r0, r1)
            int r1 = r1 + (-1)
            goto L6d
        L81:
            if (r3 > r1) goto Lb5
            int r7 = r2 + (-1)
            int r8 = r3 - r10
            int r9 = r2 - r3
            if (r8 <= r9) goto L8c
            r8 = r9
        L8c:
            int r12 = r2 - r8
            r3 = r10
        L8f:
            if (r8 <= 0) goto L9b
            swapElements(r0, r3, r0, r12)
            int r8 = r8 + (-1)
            int r3 = r3 + 1
            int r12 = r12 + 1
            goto L8f
        L9b:
            int r7 = r1 - r7
            int r8 = r11 - r1
            int r8 = r8 + (-1)
            if (r7 <= r8) goto La4
            goto La5
        La4:
            r8 = r7
        La5:
            int r12 = r11 - r8
        La7:
            if (r8 <= 0) goto Lb3
            swapElements(r0, r2, r0, r12)
            int r8 = r8 + (-1)
            int r2 = r2 + 1
            int r12 = r12 + 1
            goto La7
        Lb3:
            int r10 = r10 + r9
            int r11 = r11 - r7
        Lb5:
            io.netty.handler.codec.compression.Bzip2DivSufSort$PartitionResult r7 = new io.netty.handler.codec.compression.Bzip2DivSufSort$PartitionResult
            r7.<init>(r10, r11)
            return r7
    }

    private int trPivot(int r12, int r13, int r14, int r15, int r16) {
            r11 = this;
            int r0 = r16 - r15
            int r1 = r0 / 2
            int r7 = r15 + r1
            r1 = 512(0x200, float:7.17E-43)
            if (r0 > r1) goto L2d
            r1 = 32
            if (r0 > r1) goto L1a
            int r8 = r16 + (-1)
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            int r12 = r2.trMedian3(r3, r4, r5, r6, r7, r8)
            return r12
        L1a:
            int r0 = r0 >> 2
            r8 = r7
            int r7 = r15 + r0
            int r10 = r16 + (-1)
            int r9 = r10 - r0
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            int r12 = r2.trMedian5(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        L2d:
            int r9 = r0 >> 3
            int r5 = r15 + r9
            int r10 = r9 << 1
            int r6 = r15 + r10
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            int r15 = r0.trMedian3(r1, r2, r3, r4, r5, r6)
            int r6 = r7 - r9
            int r8 = r7 + r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            int r7 = r2.trMedian3(r3, r4, r5, r6, r7, r8)
            int r6 = r16 + (-1)
            int r4 = r6 - r10
            int r5 = r6 - r9
            r2 = r13
            r3 = r14
            int r6 = r0.trMedian3(r1, r2, r3, r4, r5, r6)
            r4 = r15
            r5 = r7
            int r12 = r0.trMedian3(r1, r2, r3, r4, r5, r6)
            return r12
    }

    private void trSort(int r13, int r14, int r15) {
            r12 = this;
            int[] r0 = r12.SA
            int r1 = -r14
            r2 = 0
            r3 = r0[r2]
            if (r1 >= r3) goto L49
            io.netty.handler.codec.compression.Bzip2DivSufSort$TRBudget r10 = new io.netty.handler.codec.compression.Bzip2DivSufSort$TRBudget
            int r1 = trLog(r14)
            int r1 = r1 * 2
            int r1 = r1 / 3
            r3 = 1
            int r1 = r1 + r3
            r10.<init>(r14, r1)
            r8 = 0
        L18:
            r1 = r0[r8]
            if (r1 >= 0) goto L20
            int r8 = r8 - r1
            r5 = r13
            r11 = r14
            goto L43
        L20:
            int r1 = r1 + r13
            r1 = r0[r1]
            int r9 = r1 + 1
            int r1 = r9 - r8
            if (r3 >= r1) goto L40
            int r6 = r13 + r15
            int r7 = r13 + r14
            r4 = r12
            r5 = r13
            r11 = r14
            r4.trIntroSort(r5, r6, r7, r8, r9, r10, r11)
            int r13 = r10.chance
            if (r13 != 0) goto L42
            if (r8 <= 0) goto L3c
            int r13 = -r8
            r0[r2] = r13
        L3c:
            r12.lsSort(r5, r11, r15)
            return
        L40:
            r5 = r13
            r11 = r14
        L42:
            r8 = r9
        L43:
            if (r8 < r11) goto L46
            goto L49
        L46:
            r13 = r5
            r14 = r11
            goto L18
        L49:
            return
    }

    public int bwt() {
            r7 = this;
            int[] r0 = r7.SA
            byte[] r1 = r7.T
            int r2 = r7.n
            r3 = 256(0x100, float:3.59E-43)
            int[] r3 = new int[r3]
            r4 = 65536(0x10000, float:9.1835E-41)
            int[] r4 = new int[r4]
            r5 = 0
            if (r2 != 0) goto L12
            return r5
        L12:
            r6 = 1
            if (r2 != r6) goto L1a
            r1 = r1[r5]
            r0[r5] = r1
            return r5
        L1a:
            int r0 = r7.sortTypeBstar(r3, r4)
            if (r0 <= 0) goto L25
            int r0 = r7.constructBWT(r3, r4)
            return r0
        L25:
            return r5
    }
}
