package com.hw.videoprocessor.jssrc;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c {
    private static final int a = 512;

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    private void A(int r18, double[] r19, int r20, double[] r21, int r22) {
            r17 = this;
            int r0 = r18 >> 1
            int r1 = r20 / r18
            r2 = 1
            r3 = 0
        L6:
            if (r2 >= r0) goto L2c
            int r4 = r18 - r2
            int r3 = r3 + r1
            int r5 = r22 + r3
            r5 = r21[r5]
            int r7 = r22 + r20
            int r7 = r7 - r3
            r7 = r21[r7]
            double r9 = r5 - r7
            double r5 = r5 + r7
            r7 = r19[r2]
            double r11 = r5 * r7
            r13 = r19[r4]
            double r15 = r9 * r13
            double r11 = r11 - r15
            double r9 = r9 * r7
            double r5 = r5 * r13
            double r9 = r9 + r5
            r19[r2] = r9
            r19[r4] = r11
            int r2 = r2 + 1
            goto L6
        L2c:
            r1 = r19[r0]
            r3 = r21[r22]
            double r1 = r1 * r3
            r19[r0] = r1
            return
    }

    private void F(int r18, double[] r19, int r20, double[] r21, int r22) {
            r17 = this;
            int r0 = r18 >> 1
            int r1 = r20 / r18
            r2 = 1
            r3 = 0
        L6:
            if (r2 >= r0) goto L2c
            int r4 = r18 - r2
            int r3 = r3 + r1
            int r5 = r22 + r3
            r5 = r21[r5]
            int r7 = r22 + r20
            int r7 = r7 - r3
            r7 = r21[r7]
            double r9 = r5 - r7
            double r5 = r5 + r7
            r7 = r19[r4]
            double r11 = r5 * r7
            r13 = r19[r2]
            double r15 = r9 * r13
            double r11 = r11 - r15
            double r9 = r9 * r7
            double r5 = r5 * r13
            double r9 = r9 + r5
            r19[r4] = r9
            r19[r2] = r11
            int r2 = r2 + 1
            goto L6
        L2c:
            r1 = r19[r0]
            r3 = r21[r22]
            double r1 = r1 * r3
            r19[r0] = r1
            return
    }

    private void G(int r13, int[] r14, double[] r15, int r16) {
            r12 = this;
            r0 = 1
            r14[r0] = r13
            if (r13 <= r0) goto L3b
            int r14 = r13 >> 1
            double r1 = (double) r14
            r3 = 4605249457297304856(0x3fe921fb54442d18, double:0.7853981633974483)
            double r3 = r3 / r1
            double r1 = r1 * r3
            double r1 = java.lang.Math.cos(r1)
            r15[r16] = r1
            int r5 = r16 + r14
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r1 = r1 * r6
            r15[r5] = r1
        L1e:
            if (r0 >= r14) goto L3b
            int r1 = r16 + r0
            double r8 = (double) r0
            double r8 = r8 * r3
            double r10 = java.lang.Math.cos(r8)
            double r10 = r10 * r6
            r15[r1] = r10
            int r1 = r16 + r13
            int r1 = r1 - r0
            double r8 = java.lang.Math.sin(r8)
            double r8 = r8 * r6
            r15[r1] = r8
            int r0 = r0 + 1
            goto L1e
        L3b:
            return
    }

    private void H(int r23, int[] r24, double[] r25) {
            r22 = this;
            r0 = r23
            r1 = 0
            r24[r1] = r0
            r2 = 1
            r24[r2] = r2
            r3 = 2
            if (r0 <= r3) goto Lb3
            int r0 = r0 >> r2
            double r4 = (double) r0
            r6 = 4605249457297304856(0x3fe921fb54442d18, double:0.7853981633974483)
            double r6 = r6 / r4
            double r4 = r4 * r6
            double r4 = java.lang.Math.cos(r4)
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r25[r1] = r8
            r25[r2] = r4
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r2 = 3
            r12 = 4
            if (r0 < r12) goto L3d
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r13 = r13 * r6
            double r13 = java.lang.Math.cos(r13)
            double r13 = r10 / r13
            r25[r3] = r13
            r13 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r13 = r13 * r6
            double r13 = java.lang.Math.cos(r13)
            double r13 = r10 / r13
            r25[r2] = r13
        L3d:
            r13 = 4
        L3e:
            if (r13 >= r0) goto L6a
            double r14 = (double) r13
            double r16 = r6 * r14
            double r18 = java.lang.Math.cos(r16)
            r25[r13] = r18
            int r18 = r13 + 1
            double r16 = java.lang.Math.sin(r16)
            r25[r18] = r16
            int r16 = r13 + 2
            r17 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r17 = r17 * r6
            double r17 = r17 * r14
            double r14 = java.lang.Math.cos(r17)
            r25[r16] = r14
            int r14 = r13 + 3
            double r15 = java.lang.Math.sin(r17)
            r25[r14] = r15
            int r13 = r13 + 4
            goto L3e
        L6a:
            if (r0 <= r3) goto Lb3
            int r6 = r1 + r0
            int r0 = r0 >> 1
            r25[r6] = r8
            int r7 = r6 + 1
            r25[r7] = r4
            if (r0 < r12) goto L8c
            int r7 = r1 + 4
            r13 = r25[r7]
            int r7 = r1 + 6
            r15 = r25[r7]
            int r7 = r6 + 2
            double r13 = r10 / r13
            r25[r7] = r13
            int r7 = r6 + 3
            double r13 = r10 / r15
            r25[r7] = r13
        L8c:
            r7 = 4
        L8d:
            if (r7 >= r0) goto Lb1
            int r13 = r7 * 2
            int r13 = r13 + r1
            r14 = r25[r13]
            int r16 = r13 + 1
            r16 = r25[r16]
            int r18 = r13 + 2
            r18 = r25[r18]
            int r13 = r13 + r2
            r20 = r25[r13]
            int r13 = r6 + r7
            r25[r13] = r14
            int r14 = r13 + 1
            r25[r14] = r16
            int r14 = r13 + 2
            r25[r14] = r18
            int r13 = r13 + r2
            r25[r13] = r20
            int r7 = r7 + 4
            goto L8d
        Lb1:
            r1 = r6
            goto L6a
        Lb3:
            return
    }

    private void J(int r22, double[] r23, int r24, double[] r25, int r26) {
            r21 = this;
            int r0 = r22 >> 1
            int r1 = r24 * 2
            int r1 = r1 / r0
            r2 = 2
            r3 = 0
        L7:
            if (r2 >= r0) goto L4a
            int r4 = r22 - r2
            int r3 = r3 + r1
            int r5 = r26 + r24
            int r5 = r5 - r3
            r5 = r25[r5]
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r7 = r7 - r5
            int r5 = r26 + r3
            r5 = r25[r5]
            r9 = r23[r2]
            r11 = r23[r4]
            double r11 = r9 - r11
            int r13 = r2 + 1
            r14 = r23[r13]
            int r16 = r4 + 1
            r17 = r23[r16]
            double r14 = r14 + r17
            double r17 = r7 * r11
            double r19 = r5 * r14
            double r17 = r17 + r19
            double r7 = r7 * r14
            double r5 = r5 * r11
            double r7 = r7 - r5
            double r9 = r9 - r17
            r23[r2] = r9
            r5 = r23[r13]
            double r5 = r5 - r7
            r23[r13] = r5
            r5 = r23[r4]
            double r5 = r5 + r17
            r23[r4] = r5
            r4 = r23[r16]
            double r4 = r4 - r7
            r23[r16] = r4
            int r2 = r2 + 2
            goto L7
        L4a:
            return
    }

    private void K(int r22, double[] r23, int r24, double[] r25, int r26) {
            r21 = this;
            int r0 = r22 >> 1
            int r1 = r24 * 2
            int r1 = r1 / r0
            r2 = 2
            r3 = 0
        L7:
            if (r2 >= r0) goto L4a
            int r4 = r22 - r2
            int r3 = r3 + r1
            int r5 = r26 + r24
            int r5 = r5 - r3
            r5 = r25[r5]
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r7 = r7 - r5
            int r5 = r26 + r3
            r5 = r25[r5]
            r9 = r23[r2]
            r11 = r23[r4]
            double r11 = r9 - r11
            int r13 = r2 + 1
            r14 = r23[r13]
            int r16 = r4 + 1
            r17 = r23[r16]
            double r14 = r14 + r17
            double r17 = r7 * r11
            double r19 = r5 * r14
            double r17 = r17 - r19
            double r7 = r7 * r14
            double r5 = r5 * r11
            double r7 = r7 + r5
            double r9 = r9 - r17
            r23[r2] = r9
            r5 = r23[r13]
            double r5 = r5 - r7
            r23[r13] = r5
            r5 = r23[r4]
            double r5 = r5 + r17
            r23[r4] = r5
            r4 = r23[r16]
            double r4 = r4 - r7
            r23[r16] = r4
            int r2 = r2 + 2
            goto L7
        L4a:
            return
    }

    private final void a(int r19, int[] r20, int r21, double[] r22) {
            r18 = this;
            r0 = 0
            r20[r21] = r0
            r1 = 1
            r2 = r19
            r3 = 1
        L7:
            int r4 = r3 << 3
            if (r4 >= r2) goto L20
            int r2 = r2 >> 1
            r4 = 0
        Le:
            if (r4 >= r3) goto L1d
            int r5 = r21 + r3
            int r5 = r5 + r4
            int r6 = r21 + r4
            r6 = r20[r6]
            int r6 = r6 + r2
            r20[r5] = r6
            int r4 = r4 + 1
            goto Le
        L1d:
            int r3 = r3 << 1
            goto L7
        L20:
            int r5 = r3 * 2
            if (r4 != r2) goto Lb5
            r1 = 0
        L25:
            if (r1 >= r3) goto Lf8
            r2 = 0
        L28:
            if (r2 >= r1) goto L93
            int r4 = r2 * 2
            int r6 = r21 + r1
            r6 = r20[r6]
            int r4 = r4 + r6
            int r6 = r1 * 2
            int r7 = r21 + r2
            r7 = r20[r7]
            int r6 = r6 + r7
            r7 = r22[r4]
            int r9 = r4 + 1
            r10 = r22[r9]
            r12 = r22[r6]
            int r14 = r6 + 1
            r15 = r22[r14]
            r22[r4] = r12
            r22[r9] = r15
            r22[r6] = r7
            r22[r14] = r10
            int r4 = r4 + r5
            int r7 = r3 * 4
            int r6 = r6 + r7
            r8 = r22[r4]
            int r10 = r4 + 1
            r11 = r22[r10]
            r13 = r22[r6]
            int r15 = r6 + 1
            r16 = r22[r15]
            r22[r4] = r13
            r22[r10] = r16
            r22[r6] = r8
            r22[r15] = r11
            int r4 = r4 + r5
            int r6 = r6 - r5
            r8 = r22[r4]
            int r10 = r4 + 1
            r11 = r22[r10]
            r13 = r22[r6]
            int r15 = r6 + 1
            r16 = r22[r15]
            r22[r4] = r13
            r22[r10] = r16
            r22[r6] = r8
            r22[r15] = r11
            int r4 = r4 + r5
            int r6 = r6 + r7
            r7 = r22[r4]
            int r9 = r4 + 1
            r10 = r22[r9]
            r12 = r22[r6]
            int r14 = r6 + 1
            r15 = r22[r14]
            r22[r4] = r12
            r22[r9] = r15
            r22[r6] = r7
            r22[r14] = r10
            int r2 = r2 + 1
            goto L28
        L93:
            int r2 = r1 * 2
            int r2 = r2 + r5
            int r4 = r21 + r1
            r4 = r20[r4]
            int r2 = r2 + r4
            int r4 = r2 + r5
            r6 = r22[r2]
            int r8 = r2 + 1
            r9 = r22[r8]
            r11 = r22[r4]
            int r13 = r4 + 1
            r14 = r22[r13]
            r22[r2] = r11
            r22[r8] = r14
            r22[r4] = r6
            r22[r13] = r9
            int r1 = r1 + 1
            goto L25
        Lb5:
            if (r1 >= r3) goto Lf8
            r2 = 0
        Lb8:
            if (r2 >= r1) goto Lf5
            int r4 = r2 * 2
            int r6 = r21 + r1
            r6 = r20[r6]
            int r4 = r4 + r6
            int r6 = r1 * 2
            int r7 = r21 + r2
            r7 = r20[r7]
            int r6 = r6 + r7
            r7 = r22[r4]
            int r9 = r4 + 1
            r10 = r22[r9]
            r12 = r22[r6]
            int r14 = r6 + 1
            r15 = r22[r14]
            r22[r4] = r12
            r22[r9] = r15
            r22[r6] = r7
            r22[r14] = r10
            int r4 = r4 + r5
            int r6 = r6 + r5
            r7 = r22[r4]
            int r9 = r4 + 1
            r10 = r22[r9]
            r12 = r22[r6]
            int r14 = r6 + 1
            r15 = r22[r14]
            r22[r4] = r12
            r22[r9] = r15
            r22[r6] = r7
            r22[r14] = r10
            int r2 = r2 + 1
            goto Lb8
        Lf5:
            int r1 = r1 + 1
            goto Lb5
        Lf8:
            return
    }

    private void b(double[] r25) {
            r24 = this;
            r0 = 2
            r1 = r25[r0]
            r3 = 3
            r4 = r25[r3]
            r6 = 6
            r7 = r25[r6]
            r9 = 7
            r10 = r25[r9]
            r12 = 8
            r13 = r25[r12]
            r15 = 9
            r16 = r25[r15]
            r18 = 12
            r19 = r25[r18]
            r21 = 13
            r22 = r25[r21]
            r25[r0] = r13
            r25[r3] = r16
            r25[r6] = r19
            r25[r9] = r22
            r25[r12] = r1
            r25[r15] = r4
            r25[r18] = r7
            r25[r21] = r10
            return
    }

    private void c(double[] r43) {
            r42 = this;
            r0 = 2
            r1 = r43[r0]
            r3 = 3
            r4 = r43[r3]
            r6 = 4
            r7 = r43[r6]
            r9 = 5
            r10 = r43[r9]
            r12 = 6
            r13 = r43[r12]
            r15 = 7
            r16 = r43[r15]
            r18 = 8
            r19 = r43[r18]
            r21 = 9
            r22 = r43[r21]
            r24 = 10
            r25 = r43[r24]
            r27 = 11
            r28 = r43[r27]
            r30 = 12
            r31 = r43[r30]
            r33 = 13
            r34 = r43[r33]
            r36 = 14
            r37 = r43[r36]
            r39 = 15
            r40 = r43[r39]
            r43[r0] = r37
            r43[r3] = r40
            r43[r6] = r13
            r43[r9] = r16
            r43[r12] = r25
            r43[r15] = r28
            r43[r18] = r1
            r43[r21] = r4
            r43[r24] = r31
            r43[r27] = r34
            r43[r30] = r7
            r43[r33] = r10
            r43[r36] = r19
            r43[r39] = r22
            return
    }

    private void d(double[] r71) {
            r70 = this;
            r0 = 2
            r1 = r71[r0]
            r3 = 3
            r4 = r71[r3]
            r6 = 4
            r7 = r71[r6]
            r9 = 5
            r10 = r71[r9]
            r12 = 6
            r13 = r71[r12]
            r15 = 7
            r16 = r71[r15]
            r18 = 8
            r19 = r71[r18]
            r21 = 9
            r22 = r71[r21]
            r24 = 10
            r25 = r71[r24]
            r27 = 11
            r28 = r71[r27]
            r30 = 14
            r31 = r71[r30]
            r33 = 15
            r34 = r71[r33]
            r36 = 16
            r37 = r71[r36]
            r39 = 17
            r40 = r71[r39]
            r42 = 20
            r43 = r71[r42]
            r45 = 21
            r46 = r71[r45]
            r48 = 22
            r49 = r71[r48]
            r51 = 23
            r52 = r71[r51]
            r54 = 24
            r55 = r71[r54]
            r57 = 25
            r58 = r71[r57]
            r60 = 26
            r61 = r71[r60]
            r63 = 27
            r64 = r71[r63]
            r66 = 28
            r66 = r71[r66]
            r68 = 29
            r68 = r71[r68]
            r71[r0] = r37
            r71[r3] = r40
            r71[r6] = r19
            r71[r9] = r22
            r71[r12] = r55
            r71[r15] = r58
            r71[r18] = r7
            r71[r21] = r10
            r71[r24] = r43
            r71[r27] = r46
            r71[r30] = r66
            r71[r33] = r68
            r71[r36] = r1
            r71[r39] = r4
            r71[r42] = r25
            r71[r45] = r28
            r71[r48] = r61
            r71[r51] = r64
            r71[r54] = r13
            r71[r57] = r16
            r71[r60] = r49
            r71[r63] = r52
            r0 = 28
            r71[r0] = r31
            r0 = 29
            r71[r0] = r34
            return
    }

    private void e(double[] r83) {
            r82 = this;
            r0 = 2
            r1 = r83[r0]
            r3 = 3
            r4 = r83[r3]
            r6 = 4
            r7 = r83[r6]
            r9 = 5
            r10 = r83[r9]
            r12 = 6
            r13 = r83[r12]
            r15 = 7
            r16 = r83[r15]
            r18 = 8
            r19 = r83[r18]
            r21 = 9
            r22 = r83[r21]
            r24 = 10
            r25 = r83[r24]
            r27 = 11
            r28 = r83[r27]
            r30 = 12
            r31 = r83[r30]
            r33 = 13
            r34 = r83[r33]
            r36 = 14
            r37 = r83[r36]
            r39 = 15
            r40 = r83[r39]
            r42 = 16
            r43 = r83[r42]
            r45 = 17
            r46 = r83[r45]
            r48 = 18
            r49 = r83[r48]
            r51 = 19
            r52 = r83[r51]
            r54 = 20
            r55 = r83[r54]
            r57 = 21
            r58 = r83[r57]
            r60 = 22
            r61 = r83[r60]
            r63 = 23
            r64 = r83[r63]
            r66 = 24
            r66 = r83[r66]
            r68 = 25
            r68 = r83[r68]
            r70 = 26
            r70 = r83[r70]
            r72 = 27
            r72 = r83[r72]
            r74 = 28
            r74 = r83[r74]
            r76 = 29
            r76 = r83[r76]
            r78 = 30
            r78 = r83[r78]
            r80 = 31
            r80 = r83[r80]
            r83[r0] = r78
            r83[r3] = r80
            r83[r6] = r37
            r83[r9] = r40
            r83[r12] = r61
            r83[r15] = r64
            r83[r18] = r13
            r83[r21] = r16
            r83[r24] = r70
            r83[r27] = r72
            r83[r30] = r25
            r83[r33] = r28
            r83[r36] = r49
            r83[r39] = r52
            r83[r42] = r1
            r83[r45] = r4
            r83[r48] = r74
            r83[r51] = r76
            r83[r54] = r31
            r83[r57] = r34
            r83[r60] = r55
            r83[r63] = r58
            r0 = 24
            r83[r0] = r7
            r0 = 25
            r83[r0] = r10
            r0 = 26
            r83[r0] = r66
            r0 = 27
            r83[r0] = r68
            r0 = 28
            r83[r0] = r19
            r0 = 29
            r83[r0] = r22
            r0 = 30
            r83[r0] = r43
            r0 = 31
            r83[r0] = r46
            return
    }

    private final void f(int r18, int[] r19, int r20, double[] r21) {
            r17 = this;
            r0 = 0
            r19[r20] = r0
            r2 = r18
            r3 = 1
        L6:
            int r4 = r3 << 3
            if (r4 >= r2) goto L1f
            int r2 = r2 >> 1
            r4 = 0
        Ld:
            if (r4 >= r3) goto L1c
            int r5 = r20 + r3
            int r5 = r5 + r4
            int r6 = r20 + r4
            r6 = r19[r6]
            int r6 = r6 + r2
            r19[r5] = r6
            int r4 = r4 + 1
            goto Ld
        L1c:
            int r3 = r3 << 1
            goto L6
        L1f:
            int r5 = r3 * 2
            if (r4 != r2) goto Ld7
            r2 = 0
        L24:
            if (r2 >= r3) goto L143
            r4 = 0
        L27:
            if (r4 >= r2) goto La1
            int r6 = r4 * 2
            int r7 = r20 + r2
            r7 = r19[r7]
            int r6 = r6 + r7
            int r7 = r2 * 2
            int r8 = r20 + r4
            r8 = r19[r8]
            int r7 = r7 + r8
            r8 = r21[r6]
            int r10 = r6 + 1
            r11 = r21[r10]
            double r11 = -r11
            r13 = r21[r7]
            int r15 = r7 + 1
            r16 = 1
            r0 = r21[r15]
            double r0 = -r0
            r21[r6] = r13
            r21[r10] = r0
            r21[r7] = r8
            r21[r15] = r11
            int r6 = r6 + r5
            int r0 = r3 * 4
            int r7 = r7 + r0
            r8 = r21[r6]
            int r1 = r6 + 1
            r10 = r21[r1]
            double r10 = -r10
            r12 = r21[r7]
            int r14 = r7 + 1
            r18 = r0
            r15 = r1
            r0 = r21[r14]
            double r0 = -r0
            r21[r6] = r12
            r21[r15] = r0
            r21[r7] = r8
            r21[r14] = r10
            int r6 = r6 + r5
            int r7 = r7 - r5
            r0 = r21[r6]
            int r8 = r6 + 1
            r9 = r21[r8]
            double r9 = -r9
            r11 = r21[r7]
            int r13 = r7 + 1
            r14 = r21[r13]
            double r14 = -r14
            r21[r6] = r11
            r21[r8] = r14
            r21[r7] = r0
            r21[r13] = r9
            int r6 = r6 + r5
            int r7 = r7 + r18
            r0 = r21[r6]
            int r8 = r6 + 1
            r9 = r21[r8]
            double r9 = -r9
            r11 = r21[r7]
            int r13 = r7 + 1
            r14 = r21[r13]
            double r14 = -r14
            r21[r6] = r11
            r21[r8] = r14
            r21[r7] = r0
            r21[r13] = r9
            int r4 = r4 + 1
            r0 = 0
            goto L27
        La1:
            r16 = 1
            int r0 = r2 * 2
            int r1 = r20 + r2
            r1 = r19[r1]
            int r0 = r0 + r1
            int r1 = r0 + 1
            r6 = r21[r1]
            double r6 = -r6
            r21[r1] = r6
            int r0 = r0 + r5
            int r1 = r0 + r5
            r6 = r21[r0]
            int r4 = r0 + 1
            r8 = r21[r4]
            double r8 = -r8
            r10 = r21[r1]
            int r12 = r1 + 1
            r13 = r21[r12]
            double r13 = -r13
            r21[r0] = r10
            r21[r4] = r13
            r21[r1] = r6
            r21[r12] = r8
            int r1 = r1 + r5
            int r1 = r1 + 1
            r6 = r21[r1]
            double r6 = -r6
            r21[r1] = r6
            int r2 = r2 + 1
            r0 = 0
            goto L24
        Ld7:
            r16 = 1
            r0 = r21[r16]
            double r0 = -r0
            r21[r16] = r0
            int r0 = r5 + 1
            r1 = r21[r0]
            double r1 = -r1
            r21[r0] = r1
            r0 = 1
        Le6:
            if (r0 >= r3) goto L143
            r1 = 0
        Le9:
            if (r1 >= r0) goto L12a
            int r2 = r1 * 2
            int r4 = r20 + r0
            r4 = r19[r4]
            int r2 = r2 + r4
            int r4 = r0 * 2
            int r6 = r20 + r1
            r6 = r19[r6]
            int r4 = r4 + r6
            r6 = r21[r2]
            int r8 = r2 + 1
            r9 = r21[r8]
            double r9 = -r9
            r11 = r21[r4]
            int r13 = r4 + 1
            r14 = r21[r13]
            double r14 = -r14
            r21[r2] = r11
            r21[r8] = r14
            r21[r4] = r6
            r21[r13] = r9
            int r2 = r2 + r5
            int r4 = r4 + r5
            r6 = r21[r2]
            int r8 = r2 + 1
            r9 = r21[r8]
            double r9 = -r9
            r11 = r21[r4]
            int r13 = r4 + 1
            r14 = r21[r13]
            double r14 = -r14
            r21[r2] = r11
            r21[r8] = r14
            r21[r4] = r6
            r21[r13] = r9
            int r1 = r1 + 1
            goto Le9
        L12a:
            int r1 = r0 * 2
            int r2 = r20 + r0
            r2 = r19[r2]
            int r1 = r1 + r2
            int r2 = r1 + 1
            r6 = r21[r2]
            double r6 = -r6
            r21[r2] = r6
            int r1 = r1 + r5
            int r1 = r1 + 1
            r6 = r21[r1]
            double r6 = -r6
            r21[r1] = r6
            int r0 = r0 + 1
            goto Le6
        L143:
            return
    }

    private void h(double[] r29) {
            r28 = this;
            r0 = 0
            r1 = r29[r0]
            r3 = 4
            r4 = r29[r3]
            double r6 = r1 + r4
            r8 = 1
            r9 = r29[r8]
            r11 = 5
            r12 = r29[r11]
            double r14 = r9 + r12
            double r1 = r1 - r4
            double r9 = r9 - r12
            r4 = 2
            r12 = r29[r4]
            r5 = 6
            r16 = r29[r5]
            double r18 = r12 + r16
            r20 = 3
            r21 = r29[r20]
            r23 = 7
            r24 = r29[r23]
            double r26 = r21 + r24
            double r12 = r12 - r16
            double r21 = r21 - r24
            double r16 = r6 + r18
            r29[r0] = r16
            double r16 = r14 + r26
            r29[r8] = r16
            double r6 = r6 - r18
            r29[r3] = r6
            double r14 = r14 - r26
            r29[r11] = r14
            double r6 = r1 + r21
            r29[r4] = r6
            double r3 = r9 - r12
            r29[r20] = r3
            double r1 = r1 - r21
            r29[r5] = r1
            double r9 = r9 + r12
            r29[r23] = r9
            return
    }

    private final void i(int r78, double[] r79, double[] r80, int r81) {
            r77 = this;
            int r0 = r78 >> 3
            int r1 = r0 * 2
            int r2 = r1 + r1
            int r3 = r2 + r1
            r4 = 0
            r5 = r79[r4]
            r7 = r79[r2]
            double r9 = r5 + r7
            r11 = 1
            r12 = r79[r11]
            double r14 = -r12
            int r16 = r2 + 1
            r17 = r79[r16]
            double r14 = r14 - r17
            double r5 = r5 - r7
            double r7 = -r12
            double r7 = r7 + r17
            r12 = r79[r1]
            r17 = r79[r3]
            double r19 = r12 + r17
            int r21 = r1 + 1
            r22 = r79[r21]
            int r24 = r3 + 1
            r25 = r79[r24]
            double r27 = r22 + r25
            double r12 = r12 - r17
            double r22 = r22 - r25
            double r17 = r9 + r19
            r79[r4] = r17
            double r17 = r14 - r27
            r79[r11] = r17
            double r9 = r9 - r19
            r79[r1] = r9
            double r14 = r14 + r27
            r79[r21] = r14
            double r9 = r5 + r22
            r79[r2] = r9
            double r9 = r7 + r12
            r79[r16] = r9
            double r5 = r5 - r22
            r79[r3] = r5
            double r7 = r7 - r12
            r79[r24] = r7
            int r2 = r81 + 1
            r2 = r80[r2]
            int r5 = r81 + 2
            r5 = r80[r5]
            int r7 = r81 + 3
            r7 = r80[r7]
            r9 = 2
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r12 = 0
            r14 = r12
            r16 = r14
            r12 = r10
        L65:
            r78 = r0
            int r0 = r78 + (-2)
            if (r9 >= r0) goto L259
            int r4 = r4 + 4
            int r0 = r81 + r4
            r18 = r80[r0]
            double r10 = r10 + r18
            double r10 = r10 * r5
            int r20 = r0 + 1
            r20 = r80[r20]
            double r14 = r14 + r20
            double r14 = r14 * r5
            int r22 = r0 + 2
            r22 = r80[r22]
            double r12 = r12 + r22
            double r12 = r12 * r7
            int r0 = r0 + 3
            r24 = r1
            r0 = r80[r0]
            double r16 = r16 - r0
            double r16 = r16 * r7
            double r0 = -r0
            int r25 = r9 + r24
            int r26 = r25 + r24
            int r27 = r26 + r24
            r28 = r79[r9]
            r30 = r79[r26]
            double r32 = r28 + r30
            int r34 = r9 + 1
            r35 = r0
            r0 = r79[r34]
            r37 = r5
            r6 = r4
            double r4 = -r0
            int r39 = r26 + 1
            r40 = r79[r39]
            double r4 = r4 - r40
            double r28 = r28 - r30
            double r0 = -r0
            double r0 = r0 + r40
            int r30 = r9 + 2
            r40 = r79[r30]
            int r31 = r26 + 2
            r42 = r79[r31]
            double r44 = r40 + r42
            int r46 = r9 + 3
            r47 = r0
            r0 = r79[r46]
            r49 = r4
            double r4 = -r0
            int r51 = r26 + 3
            r52 = r79[r51]
            double r4 = r4 - r52
            double r40 = r40 - r42
            double r0 = -r0
            double r0 = r0 + r52
            r42 = r79[r25]
            r52 = r79[r27]
            double r54 = r42 + r52
            int r56 = r25 + 1
            r57 = r79[r56]
            int r59 = r27 + 1
            r60 = r79[r59]
            double r62 = r57 + r60
            double r42 = r42 - r52
            double r57 = r57 - r60
            int r52 = r25 + 2
            r60 = r79[r52]
            int r53 = r27 + 2
            r64 = r79[r53]
            double r66 = r60 + r64
            int r68 = r25 + 3
            r69 = r79[r68]
            int r71 = r27 + 3
            r72 = r79[r71]
            double r74 = r69 + r72
            double r60 = r60 - r64
            double r69 = r69 - r72
            double r64 = r32 + r54
            r79[r9] = r64
            double r64 = r49 - r62
            r79[r34] = r64
            double r64 = r44 + r66
            r79[r30] = r64
            double r64 = r4 - r74
            r79[r46] = r64
            double r32 = r32 - r54
            r79[r25] = r32
            double r32 = r49 + r62
            r79[r56] = r32
            double r44 = r44 - r66
            r79[r52] = r44
            double r4 = r4 + r74
            r79[r68] = r4
            double r4 = r28 + r57
            double r32 = r47 + r42
            double r44 = r10 * r4
            double r49 = r14 * r32
            double r44 = r44 - r49
            r79[r26] = r44
            double r32 = r32 * r10
            double r4 = r4 * r14
            double r32 = r32 + r4
            r79[r39] = r32
            double r4 = r40 + r69
            double r25 = r0 + r60
            double r32 = r18 * r4
            double r44 = r20 * r25
            double r32 = r32 - r44
            r79[r31] = r32
            double r25 = r25 * r18
            double r4 = r4 * r20
            double r25 = r25 + r4
            r79[r51] = r25
            double r28 = r28 - r57
            double r4 = r47 - r42
            double r25 = r12 * r28
            double r30 = r16 * r4
            double r25 = r25 + r30
            r79[r27] = r25
            double r4 = r4 * r12
            double r28 = r28 * r16
            double r4 = r4 - r28
            r79[r59] = r4
            double r40 = r40 - r69
            double r0 = r0 - r60
            double r4 = r22 * r40
            double r25 = r35 * r0
            double r4 = r4 + r25
            r79[r53] = r4
            double r0 = r0 * r22
            double r4 = r35 * r40
            double r0 = r0 - r4
            r79[r71] = r0
            int r1 = r24 - r9
            int r0 = r1 + r24
            int r4 = r0 + r24
            int r5 = r4 + r24
            r25 = r79[r1]
            r27 = r79[r4]
            double r29 = r25 + r27
            int r31 = r1 + 1
            r33 = r0
            r32 = r1
            r0 = r79[r31]
            r34 = r4
            r39 = r5
            double r4 = -r0
            int r40 = r34 + 1
            r41 = r79[r40]
            double r4 = r4 - r41
            double r25 = r25 - r27
            double r0 = -r0
            double r0 = r0 + r41
            int r27 = r32 + (-2)
            r41 = r79[r27]
            int r28 = r34 + (-2)
            r43 = r79[r28]
            double r45 = r41 + r43
            int r47 = r32 + (-1)
            r48 = r0
            r0 = r79[r47]
            r50 = r4
            double r4 = -r0
            int r52 = r34 + (-1)
            r53 = r79[r52]
            double r4 = r4 - r53
            double r41 = r41 - r43
            double r0 = -r0
            double r0 = r0 + r53
            r43 = r79[r33]
            r53 = r79[r39]
            double r55 = r43 + r53
            int r57 = r33 + 1
            r58 = r79[r57]
            int r60 = r39 + 1
            r61 = r79[r60]
            double r63 = r58 + r61
            double r43 = r43 - r53
            double r58 = r58 - r61
            int r53 = r33 + (-2)
            r61 = r79[r53]
            int r54 = r39 + (-2)
            r65 = r79[r54]
            double r67 = r61 + r65
            int r69 = r33 + (-1)
            r70 = r79[r69]
            int r72 = r39 + (-1)
            r73 = r79[r72]
            double r75 = r70 + r73
            double r61 = r61 - r65
            double r70 = r70 - r73
            double r65 = r29 + r55
            r79[r32] = r65
            double r65 = r50 - r63
            r79[r31] = r65
            double r31 = r45 + r67
            r79[r27] = r31
            double r31 = r4 - r75
            r79[r47] = r31
            double r29 = r29 - r55
            r79[r33] = r29
            double r29 = r50 + r63
            r79[r57] = r29
            double r45 = r45 - r67
            r79[r53] = r45
            double r4 = r4 + r75
            r79[r69] = r4
            double r4 = r25 + r58
            double r29 = r48 + r43
            double r31 = r14 * r4
            double r45 = r10 * r29
            double r31 = r31 - r45
            r79[r34] = r31
            double r14 = r14 * r29
            double r10 = r10 * r4
            double r14 = r14 + r10
            r79[r40] = r14
            double r4 = r41 + r70
            double r10 = r0 + r61
            double r14 = r20 * r4
            double r29 = r18 * r10
            double r14 = r14 - r29
            r79[r28] = r14
            double r10 = r10 * r20
            double r4 = r4 * r18
            double r10 = r10 + r4
            r79[r52] = r10
            double r25 = r25 - r58
            double r4 = r48 - r43
            double r10 = r16 * r25
            double r14 = r12 * r4
            double r10 = r10 + r14
            r79[r39] = r10
            double r16 = r16 * r4
            double r12 = r12 * r25
            double r16 = r16 - r12
            r79[r60] = r16
            double r41 = r41 - r70
            double r0 = r0 - r61
            double r4 = r35 * r41
            double r10 = r22 * r0
            double r4 = r4 + r10
            r79[r54] = r4
            double r0 = r0 * r35
            double r41 = r41 * r22
            double r0 = r0 - r41
            r79[r72] = r0
            int r9 = r9 + 4
            r0 = r78
            r4 = r6
            r10 = r18
            r14 = r20
            r12 = r22
            r1 = r24
            r16 = r35
            r5 = r37
            goto L65
        L259:
            r24 = r1
            r37 = r5
            double r10 = r10 + r2
            double r5 = r37 * r10
            double r14 = r14 + r2
            double r9 = r37 * r14
            double r12 = r12 - r2
            double r12 = r12 * r7
            double r16 = r16 - r2
            double r7 = r7 * r16
            int r1 = r78 + r24
            int r4 = r1 + r24
            int r11 = r4 + r24
            r14 = r79[r0]
            int r16 = r4 + (-2)
            r17 = r79[r16]
            double r19 = r14 + r17
            int r21 = r78 + (-1)
            r22 = r0
            r80 = r1
            r0 = r79[r21]
            r81 = r4
            r23 = r5
            double r4 = -r0
            int r6 = r81 + (-1)
            r25 = r79[r6]
            double r4 = r4 - r25
            double r14 = r14 - r17
            double r0 = -r0
            double r0 = r0 + r25
            int r17 = r80 + (-2)
            r25 = r79[r17]
            int r18 = r11 + (-2)
            r27 = r79[r18]
            double r29 = r25 + r27
            int r31 = r80 + (-1)
            r32 = r79[r31]
            int r34 = r11 + (-1)
            r35 = r79[r34]
            double r37 = r32 + r35
            double r25 = r25 - r27
            double r32 = r32 - r35
            double r27 = r19 + r29
            r79[r22] = r27
            double r27 = r4 - r37
            r79[r21] = r27
            double r19 = r19 - r29
            r79[r17] = r19
            double r4 = r4 + r37
            r79[r31] = r4
            double r4 = r14 + r32
            double r19 = r0 + r25
            double r21 = r23 * r4
            double r27 = r9 * r19
            double r21 = r21 - r27
            r79[r16] = r21
            double r16 = r23 * r19
            double r4 = r4 * r9
            double r16 = r16 + r4
            r79[r6] = r16
            double r14 = r14 - r32
            double r0 = r0 - r25
            double r4 = r12 * r14
            double r16 = r7 * r0
            double r4 = r4 + r16
            r79[r18] = r4
            double r0 = r0 * r12
            double r14 = r14 * r7
            double r0 = r0 - r14
            r79[r34] = r0
            r0 = r79[r78]
            r4 = r79[r81]
            double r14 = r0 + r4
            int r6 = r78 + 1
            r16 = r0
            r0 = r79[r6]
            r18 = r4
            double r4 = -r0
            int r20 = r81 + 1
            r21 = r79[r20]
            double r4 = r4 - r21
            double r16 = r16 - r18
            double r0 = -r0
            double r0 = r0 + r21
            r18 = r79[r80]
            r21 = r79[r11]
            double r25 = r18 + r21
            int r27 = r80 + 1
            r28 = r79[r27]
            int r30 = r11 + 1
            r31 = r79[r30]
            double r33 = r28 + r31
            double r18 = r18 - r21
            double r28 = r28 - r31
            double r21 = r14 + r25
            r79[r78] = r21
            double r21 = r4 - r33
            r79[r6] = r21
            double r14 = r14 - r25
            r79[r80] = r14
            double r4 = r4 + r33
            r79[r27] = r4
            double r4 = r16 + r28
            double r14 = r0 + r18
            double r21 = r4 - r14
            double r21 = r21 * r2
            r79[r81] = r21
            double r14 = r14 + r4
            double r14 = r14 * r2
            r79[r20] = r14
            double r16 = r16 - r28
            double r0 = r0 - r18
            double r2 = -r2
            double r4 = r16 + r0
            double r4 = r4 * r2
            r79[r11] = r4
            double r0 = r0 - r16
            double r2 = r2 * r0
            r79[r30] = r2
            int r0 = r78 + 2
            r1 = r79[r0]
            int r4 = r81 + 2
            r5 = r79[r4]
            double r14 = r1 + r5
            int r3 = r78 + 3
            r78 = r0
            r16 = r1
            r0 = r79[r3]
            r18 = r3
            double r2 = -r0
            int r19 = r81 + 3
            r20 = r79[r19]
            double r2 = r2 - r20
            double r5 = r16 - r5
            double r0 = -r0
            double r0 = r0 + r20
            int r16 = r80 + 2
            r20 = r79[r16]
            int r17 = r11 + 2
            r25 = r79[r17]
            double r27 = r20 + r25
            int r22 = r80 + 3
            r29 = r79[r22]
            int r11 = r11 + 3
            r31 = r79[r11]
            double r33 = r29 + r31
            double r20 = r20 - r25
            double r29 = r29 - r31
            double r25 = r14 + r27
            r79[r78] = r25
            double r25 = r2 - r33
            r79[r18] = r25
            double r14 = r14 - r27
            r79[r16] = r14
            double r2 = r2 + r33
            r79[r22] = r2
            double r2 = r5 + r29
            double r14 = r0 + r20
            double r25 = r9 * r2
            double r27 = r23 * r14
            double r25 = r25 - r27
            r79[r4] = r25
            double r9 = r9 * r14
            double r2 = r2 * r23
            double r9 = r9 + r2
            r79[r19] = r9
            double r5 = r5 - r29
            double r0 = r0 - r20
            double r2 = r7 * r5
            double r9 = r12 * r0
            double r2 = r2 + r9
            r79[r17] = r2
            double r7 = r7 * r0
            double r12 = r12 * r5
            double r7 = r7 - r12
            r79[r11] = r7
            return
    }

    private void j(int r8, double[] r9, int[] r10, int r11, int r12, double[] r13) {
            r7 = this;
            r1 = 32
            if (r8 <= r1) goto L41
            r3 = 32
            int r1 = r8 >> 2
            int r4 = r12 - r1
            r7.i(r8, r9, r13, r4)
            r4 = 512(0x200, float:7.17E-43)
            if (r8 <= r4) goto L28
            r3 = 0
            r0 = r7
            r2 = r9
            r4 = r12
            r5 = r13
            r0.x(r1, r2, r3, r4, r5)
            r3 = r1
            r0.y(r1, r2, r3, r4, r5)
            int r3 = r1 * 2
            r0.x(r1, r2, r3, r4, r5)
            int r3 = r1 * 3
            r0.x(r1, r2, r3, r4, r5)
            goto L3d
        L28:
            if (r1 <= r3) goto L34
            r3 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r12
            r5 = r13
            r0.k(r1, r2, r3, r4, r5)
            goto L3d
        L34:
            r3 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r12
            r5 = r13
            r0.t(r1, r2, r3, r4, r5)
        L3d:
            r7.f(r8, r10, r11, r9)
            return
        L41:
            r3 = 32
            r4 = 8
            if (r8 <= r4) goto L5a
            r6 = 0
            if (r8 != r3) goto L53
            int r1 = r12 + (-8)
            r7.p(r9, r6, r13, r1)
            r7.e(r9)
            return
        L53:
            r7.n(r9, r6, r13, r6)
            r7.c(r9)
            return
        L5a:
            if (r8 != r4) goto L60
            r7.h(r9)
            return
        L60:
            r3 = 4
            if (r8 != r3) goto L66
            r7.z(r9)
        L66:
            return
    }

    private void k(int r10, double[] r11, int r12, int r13, double[] r14) {
            r9 = this;
            int r0 = r10 >> 2
            r2 = r0
        L3:
            r0 = 128(0x80, float:1.8E-43)
            if (r2 <= r0) goto L4b
            r0 = r2
        L8:
            if (r0 >= r10) goto L39
            int r1 = r0 - r2
            r7 = r1
        Ld:
            if (r7 >= r10) goto L34
            int r4 = r12 + r7
            int r1 = r2 >> 1
            int r6 = r13 - r1
            r1 = r9
            r3 = r11
            r5 = r14
            r1.v(r2, r3, r4, r5, r6)
            r11 = r6
            int r14 = r12 + r0
            int r4 = r14 + r7
            int r6 = r13 - r2
            r1.w(r2, r3, r4, r5, r6)
            int r14 = r0 * 2
            int r14 = r14 + r12
            int r4 = r14 + r7
            r6 = r11
            r1.v(r2, r3, r4, r5, r6)
            int r11 = r0 * 4
            int r7 = r7 + r11
            r11 = r3
            r14 = r5
            goto Ld
        L34:
            r3 = r11
            r5 = r14
            int r0 = r0 << 2
            goto L8
        L39:
            r3 = r11
            r5 = r14
            int r11 = r12 + r10
            int r4 = r11 - r2
            int r11 = r2 >> 1
            int r6 = r13 - r11
            r1 = r9
            r1.v(r2, r3, r4, r5, r6)
            int r2 = r2 >> 2
            r11 = r3
            goto L3
        L4b:
            r3 = r11
            r5 = r14
            r11 = r2
        L4e:
            if (r11 >= r10) goto L90
            int r14 = r11 - r2
        L52:
            if (r14 >= r10) goto L8c
            int r4 = r12 + r14
            int r0 = r2 >> 1
            int r6 = r13 - r0
            r1 = r9
            r1.v(r2, r3, r4, r5, r6)
            r8 = r5
            r5 = r13
            r13 = r6
            r6 = r8
            r1.t(r2, r3, r4, r5, r6)
            r0 = r5
            r5 = r6
            int r1 = r12 + r11
            int r4 = r1 + r14
            int r6 = r0 - r2
            r1 = r9
            r1.w(r2, r3, r4, r5, r6)
            r6 = r5
            r5 = r0
            r1.u(r2, r3, r4, r5, r6)
            r5 = r6
            int r1 = r11 * 2
            int r1 = r1 + r12
            int r4 = r1 + r14
            r1 = r9
            r6 = r13
            r1.v(r2, r3, r4, r5, r6)
            r6 = r5
            r5 = r0
            r1.t(r2, r3, r4, r5, r6)
            r5 = r6
            int r13 = r11 * 4
            int r14 = r14 + r13
            r13 = r0
            goto L52
        L8c:
            r0 = r13
            int r11 = r11 << 2
            goto L4e
        L90:
            r0 = r13
            int r12 = r12 + r10
            int r4 = r12 - r2
            int r10 = r2 >> 1
            int r6 = r0 - r10
            r1 = r9
            r1.v(r2, r3, r4, r5, r6)
            r6 = r5
            r5 = r0
            r1.t(r2, r3, r4, r5, r6)
            return
    }

    private void l(int r10, double[] r11, int r12, int r13, double[] r14) {
            r9 = this;
            int r0 = r10 >> 1
            int r10 = r10 >> 2
            r2 = r10
        L5:
            r10 = 128(0x80, float:1.8E-43)
            if (r2 <= r10) goto L4d
            r10 = r2
        La:
            if (r10 >= r0) goto L48
            int r1 = r10 - r2
            r7 = r1
        Lf:
            if (r7 >= r0) goto L29
            int r4 = r12 + r7
            int r1 = r2 >> 1
            int r6 = r13 - r1
            r1 = r9
            r3 = r11
            r5 = r14
            r1.v(r2, r3, r4, r5, r6)
            int r11 = r12 + r0
            int r4 = r11 + r7
            r1.v(r2, r3, r4, r5, r6)
            int r11 = r10 * 2
            int r7 = r7 + r11
            r11 = r3
            goto Lf
        L29:
            r3 = r11
            r5 = r14
            int r11 = r10 * 2
            int r11 = r11 - r2
        L2e:
            if (r11 >= r0) goto L43
            int r4 = r12 + r11
            int r6 = r13 - r2
            r1 = r9
            r1.w(r2, r3, r4, r5, r6)
            int r14 = r12 + r0
            int r4 = r14 + r11
            r1.w(r2, r3, r4, r5, r6)
            int r14 = r10 * 4
            int r11 = r11 + r14
            goto L2e
        L43:
            int r10 = r10 << 2
            r11 = r3
            r14 = r5
            goto La
        L48:
            r3 = r11
            r5 = r14
            int r2 = r2 >> 2
            goto L5
        L4d:
            r3 = r11
            r5 = r14
            r10 = r2
        L50:
            if (r10 >= r0) goto Lac
            int r11 = r10 - r2
        L54:
            if (r11 >= r0) goto L7d
            int r4 = r12 + r11
            int r14 = r2 >> 1
            int r6 = r13 - r14
            r1 = r9
            r1.v(r2, r3, r4, r5, r6)
            r8 = r5
            r5 = r13
            r13 = r6
            r6 = r8
            r1.t(r2, r3, r4, r5, r6)
            r14 = r5
            r5 = r6
            int r1 = r12 + r0
            int r4 = r1 + r11
            r1 = r9
            r6 = r13
            r1.v(r2, r3, r4, r5, r6)
            r6 = r5
            r5 = r14
            r1.t(r2, r3, r4, r5, r6)
            r5 = r6
            int r13 = r10 * 2
            int r11 = r11 + r13
            r13 = r14
            goto L54
        L7d:
            r14 = r13
            int r11 = r10 * 2
            int r11 = r11 - r2
        L81:
            if (r11 >= r0) goto La5
            int r4 = r12 + r11
            int r6 = r14 - r2
            r1 = r9
            r1.w(r2, r3, r4, r5, r6)
            r13 = r6
            r6 = r5
            r5 = r14
            r1.u(r2, r3, r4, r5, r6)
            r5 = r6
            int r1 = r12 + r0
            int r4 = r1 + r11
            r1 = r9
            r6 = r13
            r1.w(r2, r3, r4, r5, r6)
            r6 = r5
            r5 = r14
            r1.u(r2, r3, r4, r5, r6)
            int r13 = r10 * 4
            int r11 = r11 + r13
            r5 = r6
            goto L81
        La5:
            r6 = r5
            r5 = r14
            int r10 = r10 << 2
            r13 = r5
            r5 = r6
            goto L50
        Lac:
            return
    }

    private void m(double[] r29) {
            r28 = this;
            r0 = 0
            r1 = r29[r0]
            r3 = 4
            r4 = r29[r3]
            double r6 = r1 + r4
            r8 = 1
            r9 = r29[r8]
            r11 = 5
            r12 = r29[r11]
            double r14 = r9 + r12
            double r1 = r1 - r4
            double r9 = r9 - r12
            r4 = 2
            r12 = r29[r4]
            r5 = 6
            r16 = r29[r5]
            double r18 = r12 + r16
            r20 = 3
            r21 = r29[r20]
            r23 = 7
            r24 = r29[r23]
            double r26 = r21 + r24
            double r12 = r12 - r16
            double r21 = r21 - r24
            double r16 = r6 + r18
            r29[r0] = r16
            double r16 = r14 + r26
            r29[r8] = r16
            double r6 = r6 - r18
            r29[r3] = r6
            double r14 = r14 - r26
            r29[r11] = r14
            double r6 = r1 - r21
            r29[r4] = r6
            double r3 = r9 + r12
            r29[r20] = r3
            double r1 = r1 + r21
            r29[r5] = r1
            double r9 = r9 - r12
            r29[r23] = r9
            return
    }

    private void n(double[] r54, int r55, double[] r56, int r57) {
            r53 = this;
            int r0 = r57 + 1
            r0 = r56[r0]
            r2 = r54[r55]
            int r4 = r55 + 8
            r5 = r54[r4]
            double r7 = r2 + r5
            int r9 = r55 + 1
            r10 = r54[r9]
            int r12 = r55 + 9
            r13 = r54[r12]
            double r15 = r10 + r13
            double r2 = r2 - r5
            double r10 = r10 - r13
            int r5 = r55 + 4
            r13 = r54[r5]
            int r6 = r55 + 12
            r17 = r54[r6]
            double r19 = r13 + r17
            int r21 = r55 + 5
            r22 = r54[r21]
            int r24 = r55 + 13
            r25 = r54[r24]
            double r27 = r22 + r25
            double r13 = r13 - r17
            double r22 = r22 - r25
            double r17 = r7 + r19
            double r25 = r15 + r27
            double r7 = r7 - r19
            double r15 = r15 - r27
            double r19 = r2 - r22
            double r27 = r10 + r13
            double r2 = r2 + r22
            double r10 = r10 - r13
            int r13 = r55 + 2
            r22 = r54[r13]
            int r14 = r55 + 10
            r29 = r54[r14]
            double r31 = r22 + r29
            int r33 = r55 + 3
            r34 = r54[r33]
            int r36 = r55 + 11
            r37 = r54[r36]
            double r39 = r34 + r37
            double r22 = r22 - r29
            double r34 = r34 - r37
            int r29 = r55 + 6
            r37 = r54[r29]
            int r30 = r55 + 14
            r41 = r54[r30]
            double r43 = r37 + r41
            int r45 = r55 + 7
            r46 = r54[r45]
            int r48 = r55 + 15
            r49 = r54[r48]
            double r51 = r46 + r49
            double r37 = r37 - r41
            double r46 = r46 - r49
            double r41 = r31 + r43
            double r49 = r39 + r51
            double r31 = r31 - r43
            double r39 = r39 - r51
            double r43 = r22 - r46
            double r51 = r34 + r37
            double r22 = r22 + r46
            double r34 = r34 - r37
            double r37 = r43 - r51
            double r37 = r37 * r0
            double r43 = r43 + r51
            double r43 = r43 * r0
            double r46 = r22 - r34
            double r46 = r46 * r0
            double r22 = r22 + r34
            double r0 = r0 * r22
            double r22 = r19 + r37
            r54[r4] = r22
            double r22 = r27 + r43
            r54[r12] = r22
            double r19 = r19 - r37
            r54[r14] = r19
            double r27 = r27 - r43
            r54[r36] = r27
            double r19 = r2 - r0
            r54[r6] = r19
            double r19 = r10 + r46
            r54[r24] = r19
            double r2 = r2 + r0
            r54[r30] = r2
            double r10 = r10 - r46
            r54[r48] = r10
            double r0 = r17 + r41
            r54[r55] = r0
            double r0 = r25 + r49
            r54[r9] = r0
            double r17 = r17 - r41
            r54[r13] = r17
            double r25 = r25 - r49
            r54[r33] = r25
            double r0 = r7 - r39
            r54[r5] = r0
            double r0 = r15 + r31
            r54[r21] = r0
            double r7 = r7 + r39
            r54[r29] = r7
            double r15 = r15 - r31
            r54[r45] = r15
            return
    }

    private void o(double[] r60, int r61, double[] r62, int r63) {
            r59 = this;
            int r0 = r63 + 1
            r0 = r62[r0]
            int r2 = r63 + 4
            r2 = r62[r2]
            int r4 = r63 + 5
            r4 = r62[r4]
            r6 = r60[r61]
            int r8 = r61 + 9
            r9 = r60[r8]
            double r11 = r6 - r9
            int r13 = r61 + 1
            r14 = r60[r13]
            int r16 = r61 + 8
            r17 = r60[r16]
            double r19 = r14 + r17
            double r6 = r6 + r9
            double r14 = r14 - r17
            int r9 = r61 + 4
            r17 = r60[r9]
            int r10 = r61 + 13
            r21 = r60[r10]
            double r23 = r17 - r21
            int r25 = r61 + 5
            r26 = r60[r25]
            int r28 = r61 + 12
            r29 = r60[r28]
            double r31 = r26 + r29
            double r33 = r23 - r31
            double r33 = r33 * r0
            double r31 = r31 + r23
            double r31 = r31 * r0
            double r17 = r17 + r21
            double r26 = r26 - r29
            double r21 = r17 - r26
            double r21 = r21 * r0
            double r26 = r26 + r17
            double r0 = r0 * r26
            int r17 = r61 + 2
            r23 = r60[r17]
            int r18 = r61 + 11
            r26 = r60[r18]
            double r29 = r23 - r26
            int r35 = r61 + 3
            r36 = r60[r35]
            int r38 = r61 + 10
            r39 = r60[r38]
            double r41 = r36 + r39
            double r43 = r2 * r29
            double r45 = r4 * r41
            double r43 = r43 - r45
            double r41 = r41 * r2
            double r29 = r29 * r4
            double r41 = r41 + r29
            double r23 = r23 + r26
            double r36 = r36 - r39
            double r26 = r4 * r23
            double r29 = r2 * r36
            double r26 = r26 - r29
            double r36 = r36 * r4
            double r23 = r23 * r2
            double r36 = r36 + r23
            int r23 = r61 + 6
            r29 = r60[r23]
            int r24 = r61 + 15
            r39 = r60[r24]
            double r45 = r29 - r39
            int r47 = r61 + 7
            r48 = r60[r47]
            int r50 = r61 + 14
            r51 = r60[r50]
            double r53 = r48 + r51
            double r55 = r4 * r45
            double r57 = r2 * r53
            double r55 = r55 - r57
            double r53 = r53 * r4
            double r45 = r45 * r2
            double r53 = r53 + r45
            double r29 = r29 + r39
            double r48 = r48 - r51
            double r39 = r2 * r29
            double r45 = r4 * r48
            double r39 = r39 - r45
            double r2 = r2 * r48
            double r4 = r4 * r29
            double r2 = r2 + r4
            double r4 = r11 + r33
            double r29 = r19 + r31
            double r45 = r43 + r55
            double r48 = r41 + r53
            double r51 = r4 + r45
            r60[r61] = r51
            double r51 = r29 + r48
            r60[r13] = r51
            double r4 = r4 - r45
            r60[r17] = r4
            double r29 = r29 - r48
            r60[r35] = r29
            double r11 = r11 - r33
            double r19 = r19 - r31
            double r43 = r43 - r55
            double r41 = r41 - r53
            double r4 = r11 - r41
            r60[r9] = r4
            double r4 = r19 + r43
            r60[r25] = r4
            double r11 = r11 + r41
            r60[r23] = r11
            double r19 = r19 - r43
            r60[r47] = r19
            double r4 = r6 - r0
            double r11 = r14 + r21
            double r19 = r26 - r39
            double r29 = r36 - r2
            double r31 = r4 + r19
            r60[r16] = r31
            double r16 = r11 + r29
            r60[r8] = r16
            double r4 = r4 - r19
            r60[r38] = r4
            double r11 = r11 - r29
            r60[r18] = r11
            double r6 = r6 + r0
            double r14 = r14 - r21
            double r26 = r26 + r39
            double r36 = r36 + r2
            double r0 = r6 - r36
            r60[r28] = r0
            double r0 = r14 + r26
            r60[r10] = r0
            double r6 = r6 + r36
            r60[r50] = r6
            double r14 = r14 - r26
            r60[r24] = r14
            return
    }

    private void p(double[] r110, int r111, double[] r112, int r113) {
            r109 = this;
            int r0 = r113 + 1
            r0 = r112[r0]
            int r2 = r113 + 2
            r2 = r112[r2]
            double r4 = r0 * r2
            double r2 = r2 + r4
            r6 = r110[r111]
            int r8 = r111 + 16
            r9 = r110[r8]
            double r11 = r6 + r9
            int r13 = r111 + 1
            r14 = r110[r13]
            int r16 = r111 + 17
            r17 = r110[r16]
            double r19 = r14 + r17
            double r6 = r6 - r9
            double r14 = r14 - r17
            int r9 = r111 + 8
            r17 = r110[r9]
            int r10 = r111 + 24
            r21 = r110[r10]
            double r23 = r17 + r21
            int r25 = r111 + 9
            r26 = r110[r25]
            int r28 = r111 + 25
            r29 = r110[r28]
            double r31 = r26 + r29
            double r17 = r17 - r21
            double r26 = r26 - r29
            double r21 = r11 + r23
            double r29 = r19 + r31
            double r11 = r11 - r23
            double r19 = r19 - r31
            double r23 = r6 - r26
            double r31 = r14 + r17
            double r6 = r6 + r26
            double r14 = r14 - r17
            int r17 = r111 + 2
            r26 = r110[r17]
            int r18 = r111 + 18
            r33 = r110[r18]
            double r35 = r26 + r33
            int r37 = r111 + 3
            r38 = r110[r37]
            int r40 = r111 + 19
            r41 = r110[r40]
            double r43 = r38 + r41
            double r26 = r26 - r33
            double r38 = r38 - r41
            int r33 = r111 + 10
            r41 = r110[r33]
            int r34 = r111 + 26
            r45 = r110[r34]
            double r47 = r41 + r45
            int r49 = r111 + 11
            r50 = r110[r49]
            int r52 = r111 + 27
            r53 = r110[r52]
            double r55 = r50 + r53
            double r41 = r41 - r45
            double r50 = r50 - r53
            double r45 = r35 + r47
            double r53 = r43 + r55
            double r35 = r35 - r47
            double r43 = r43 - r55
            double r47 = r26 - r50
            double r55 = r38 + r41
            double r57 = r2 * r47
            double r59 = r4 * r55
            double r57 = r57 - r59
            double r55 = r55 * r2
            double r47 = r47 * r4
            double r55 = r55 + r47
            double r26 = r26 + r50
            double r38 = r38 - r41
            double r41 = r4 * r26
            double r47 = r2 * r38
            double r41 = r41 - r47
            double r38 = r38 * r4
            double r26 = r26 * r2
            double r38 = r38 + r26
            int r26 = r111 + 4
            r47 = r110[r26]
            int r27 = r111 + 20
            r50 = r110[r27]
            double r59 = r47 + r50
            int r61 = r111 + 5
            r62 = r110[r61]
            int r64 = r111 + 21
            r65 = r110[r64]
            double r67 = r62 + r65
            double r47 = r47 - r50
            double r62 = r62 - r65
            int r50 = r111 + 12
            r65 = r110[r50]
            int r51 = r111 + 28
            r69 = r110[r51]
            double r71 = r65 + r69
            int r73 = r111 + 13
            r74 = r110[r73]
            int r76 = r111 + 29
            r77 = r110[r76]
            double r79 = r74 + r77
            double r65 = r65 - r69
            double r74 = r74 - r77
            double r69 = r59 + r71
            double r77 = r67 + r79
            double r59 = r59 - r71
            double r67 = r67 - r79
            double r71 = r47 - r74
            double r79 = r62 + r65
            double r81 = r71 - r79
            double r81 = r81 * r0
            double r79 = r79 + r71
            double r79 = r79 * r0
            double r47 = r47 + r74
            double r62 = r62 - r65
            double r65 = r47 + r62
            double r65 = r65 * r0
            double r62 = r62 - r47
            double r62 = r62 * r0
            int r47 = r111 + 6
            r71 = r110[r47]
            int r48 = r111 + 22
            r74 = r110[r48]
            double r83 = r71 + r74
            int r85 = r111 + 7
            r86 = r110[r85]
            int r88 = r111 + 23
            r89 = r110[r88]
            double r91 = r86 + r89
            double r71 = r71 - r74
            double r86 = r86 - r89
            int r74 = r111 + 14
            r89 = r110[r74]
            int r75 = r111 + 30
            r93 = r110[r75]
            double r95 = r89 + r93
            int r97 = r111 + 15
            r98 = r110[r97]
            int r100 = r111 + 31
            r101 = r110[r100]
            double r103 = r98 + r101
            double r89 = r89 - r93
            double r98 = r98 - r101
            double r93 = r83 + r95
            double r101 = r91 + r103
            double r83 = r83 - r95
            double r91 = r91 - r103
            double r95 = r71 - r98
            double r103 = r86 + r89
            double r105 = r4 * r95
            double r107 = r2 * r103
            double r105 = r105 - r107
            double r103 = r103 * r4
            double r95 = r95 * r2
            double r103 = r103 + r95
            double r71 = r71 + r98
            double r86 = r86 - r89
            double r89 = r2 * r71
            double r95 = r4 * r86
            double r89 = r89 - r95
            double r2 = r2 * r86
            double r4 = r4 * r71
            double r2 = r2 + r4
            double r4 = r6 - r65
            double r71 = r14 - r62
            double r6 = r6 + r65
            double r14 = r14 + r62
            double r62 = r41 - r89
            double r65 = r38 - r2
            double r41 = r41 + r89
            double r38 = r38 + r2
            double r2 = r4 + r62
            r110[r10] = r2
            double r2 = r71 + r65
            r110[r28] = r2
            double r4 = r4 - r62
            r110[r34] = r4
            double r71 = r71 - r65
            r110[r52] = r71
            double r2 = r6 - r38
            r110[r51] = r2
            double r2 = r14 + r41
            r110[r76] = r2
            double r6 = r6 + r38
            r110[r75] = r6
            double r14 = r14 - r41
            r110[r100] = r14
            double r2 = r23 + r81
            double r4 = r31 + r79
            double r23 = r23 - r81
            double r31 = r31 - r79
            double r6 = r57 + r105
            double r14 = r55 + r103
            double r57 = r57 - r105
            double r55 = r55 - r103
            double r38 = r2 + r6
            r110[r8] = r38
            double r38 = r4 + r14
            r110[r16] = r38
            double r2 = r2 - r6
            r110[r18] = r2
            double r4 = r4 - r14
            r110[r40] = r4
            double r2 = r23 - r55
            r110[r27] = r2
            double r2 = r31 + r57
            r110[r64] = r2
            double r23 = r23 + r55
            r110[r48] = r23
            double r31 = r31 - r57
            r110[r88] = r31
            double r2 = r35 - r91
            double r4 = r43 + r83
            double r6 = r2 - r4
            double r6 = r6 * r0
            double r4 = r4 + r2
            double r4 = r4 * r0
            double r35 = r35 + r91
            double r43 = r43 - r83
            double r2 = r35 - r43
            double r2 = r2 * r0
            double r43 = r43 + r35
            double r0 = r0 * r43
            double r14 = r11 - r67
            double r23 = r19 + r59
            double r11 = r11 + r67
            double r19 = r19 - r59
            double r27 = r14 + r6
            r110[r9] = r27
            double r8 = r23 + r4
            r110[r25] = r8
            double r14 = r14 - r6
            r110[r33] = r14
            double r23 = r23 - r4
            r110[r49] = r23
            double r4 = r11 - r0
            r110[r50] = r4
            double r4 = r19 + r2
            r110[r73] = r4
            double r11 = r11 + r0
            r110[r74] = r11
            double r19 = r19 - r2
            r110[r97] = r19
            double r0 = r21 + r69
            double r2 = r29 + r77
            double r21 = r21 - r69
            double r29 = r29 - r77
            double r4 = r45 + r93
            double r6 = r53 + r101
            double r45 = r45 - r93
            double r53 = r53 - r101
            double r8 = r0 + r4
            r110[r111] = r8
            double r8 = r2 + r6
            r110[r13] = r8
            double r0 = r0 - r4
            r110[r17] = r0
            double r2 = r2 - r6
            r110[r37] = r2
            double r0 = r21 - r53
            r110[r26] = r0
            double r0 = r29 + r45
            r110[r61] = r0
            double r21 = r21 + r53
            r110[r47] = r21
            double r29 = r29 - r45
            r110[r85] = r29
            return
    }

    private void q(double[] r118, int r119, double[] r120, int r121) {
            r117 = this;
            int r0 = r121 + 1
            r0 = r120[r0]
            int r2 = r121 + 4
            r2 = r120[r2]
            int r4 = r121 + 5
            r4 = r120[r4]
            int r6 = r121 + 6
            r6 = r120[r6]
            int r8 = r121 + 7
            r8 = r120[r8]
            int r10 = r121 + 8
            r10 = r120[r10]
            int r12 = r121 + 9
            r12 = r120[r12]
            r14 = r118[r119]
            int r16 = r119 + 17
            r17 = r118[r16]
            double r19 = r14 - r17
            int r21 = r119 + 1
            r22 = r118[r21]
            int r24 = r119 + 16
            r25 = r118[r24]
            double r27 = r22 + r25
            int r29 = r119 + 8
            r30 = r118[r29]
            int r32 = r119 + 25
            r33 = r118[r32]
            double r35 = r30 - r33
            int r37 = r119 + 9
            r38 = r118[r37]
            int r40 = r119 + 24
            r41 = r118[r40]
            double r43 = r38 + r41
            double r45 = r35 - r43
            double r45 = r45 * r0
            double r43 = r43 + r35
            double r43 = r43 * r0
            double r35 = r19 + r45
            double r47 = r27 + r43
            double r19 = r19 - r45
            double r27 = r27 - r43
            double r14 = r14 + r17
            double r22 = r22 - r25
            double r30 = r30 + r33
            double r38 = r38 - r41
            double r17 = r30 - r38
            double r17 = r17 * r0
            double r38 = r38 + r30
            double r38 = r38 * r0
            double r25 = r14 - r38
            double r30 = r22 + r17
            double r14 = r14 + r38
            double r22 = r22 - r17
            int r17 = r119 + 2
            r33 = r118[r17]
            int r18 = r119 + 19
            r38 = r118[r18]
            double r41 = r33 - r38
            int r43 = r119 + 3
            r44 = r118[r43]
            int r46 = r119 + 18
            r49 = r118[r46]
            double r51 = r44 + r49
            double r53 = r2 * r41
            double r55 = r4 * r51
            double r53 = r53 - r55
            double r51 = r51 * r2
            double r41 = r41 * r4
            double r51 = r51 + r41
            int r41 = r119 + 10
            r55 = r118[r41]
            int r42 = r119 + 27
            r57 = r118[r42]
            double r59 = r55 - r57
            int r61 = r119 + 11
            r62 = r118[r61]
            int r64 = r119 + 26
            r65 = r118[r64]
            double r67 = r62 + r65
            double r69 = r8 * r59
            double r71 = r6 * r67
            double r69 = r69 - r71
            double r67 = r67 * r8
            double r59 = r59 * r6
            double r67 = r67 + r59
            double r59 = r53 + r69
            double r71 = r51 + r67
            double r53 = r53 - r69
            double r51 = r51 - r67
            double r33 = r33 + r38
            double r44 = r44 - r49
            double r38 = r6 * r33
            double r49 = r8 * r44
            double r38 = r38 - r49
            double r44 = r44 * r6
            double r33 = r33 * r8
            double r44 = r44 + r33
            double r55 = r55 + r57
            double r62 = r62 - r65
            double r33 = r2 * r55
            double r49 = r4 * r62
            double r33 = r33 + r49
            double r62 = r62 * r2
            double r55 = r55 * r4
            double r62 = r62 - r55
            double r49 = r38 - r33
            double r55 = r44 - r62
            double r38 = r38 + r33
            double r44 = r44 + r62
            int r33 = r119 + 4
            r57 = r118[r33]
            int r34 = r119 + 21
            r62 = r118[r34]
            double r65 = r57 - r62
            int r67 = r119 + 5
            r68 = r118[r67]
            int r70 = r119 + 20
            r73 = r118[r70]
            double r75 = r68 + r73
            double r77 = r10 * r65
            double r79 = r12 * r75
            double r77 = r77 - r79
            double r75 = r75 * r10
            double r65 = r65 * r12
            double r75 = r75 + r65
            int r65 = r119 + 12
            r79 = r118[r65]
            int r66 = r119 + 29
            r81 = r118[r66]
            double r83 = r79 - r81
            int r85 = r119 + 13
            r86 = r118[r85]
            int r88 = r119 + 28
            r89 = r118[r88]
            double r91 = r86 + r89
            double r93 = r12 * r83
            double r95 = r10 * r91
            double r93 = r93 - r95
            double r91 = r91 * r12
            double r83 = r83 * r10
            double r91 = r91 + r83
            double r83 = r77 + r93
            double r95 = r75 + r91
            double r77 = r77 - r93
            double r75 = r75 - r91
            double r57 = r57 + r62
            double r68 = r68 - r73
            double r62 = r12 * r57
            double r73 = r10 * r68
            double r62 = r62 - r73
            double r68 = r68 * r12
            double r57 = r57 * r10
            double r68 = r68 + r57
            double r79 = r79 + r81
            double r86 = r86 - r89
            double r57 = r10 * r79
            double r73 = r12 * r86
            double r57 = r57 - r73
            double r10 = r10 * r86
            double r12 = r12 * r79
            double r10 = r10 + r12
            double r12 = r62 - r57
            double r73 = r68 - r10
            double r62 = r62 + r57
            double r68 = r68 + r10
            int r10 = r119 + 6
            r57 = r118[r10]
            int r11 = r119 + 23
            r79 = r118[r11]
            double r81 = r57 - r79
            int r86 = r119 + 7
            r89 = r118[r86]
            int r87 = r119 + 22
            r91 = r118[r87]
            double r93 = r89 + r91
            double r97 = r6 * r81
            double r99 = r8 * r93
            double r97 = r97 - r99
            double r93 = r93 * r6
            double r81 = r81 * r8
            double r93 = r93 + r81
            int r81 = r119 + 14
            r99 = r118[r81]
            int r82 = r119 + 31
            r101 = r118[r82]
            double r103 = r99 - r101
            int r105 = r119 + 15
            r106 = r118[r105]
            int r108 = r119 + 30
            r109 = r118[r108]
            double r111 = r106 + r109
            double r113 = r4 * r103
            double r115 = r2 * r111
            double r113 = r113 - r115
            double r111 = r111 * r4
            double r103 = r103 * r2
            double r111 = r111 + r103
            double r103 = r97 + r113
            double r115 = r93 + r111
            double r97 = r97 - r113
            double r93 = r93 - r111
            double r57 = r57 + r79
            double r89 = r89 - r91
            double r79 = r4 * r57
            double r91 = r2 * r89
            double r79 = r79 + r91
            double r4 = r4 * r89
            double r2 = r2 * r57
            double r4 = r4 - r2
            double r99 = r99 + r101
            double r106 = r106 - r109
            double r2 = r8 * r99
            double r57 = r6 * r106
            double r2 = r2 - r57
            double r8 = r8 * r106
            double r6 = r6 * r99
            double r8 = r8 + r6
            double r6 = r79 + r2
            double r57 = r4 + r8
            double r79 = r79 - r2
            double r4 = r4 - r8
            double r2 = r35 + r83
            double r8 = r47 + r95
            double r89 = r59 + r103
            double r91 = r71 + r115
            double r99 = r2 + r89
            r118[r119] = r99
            double r99 = r8 + r91
            r118[r21] = r99
            double r2 = r2 - r89
            r118[r17] = r2
            double r8 = r8 - r91
            r118[r43] = r8
            double r35 = r35 - r83
            double r47 = r47 - r95
            double r59 = r59 - r103
            double r71 = r71 - r115
            double r2 = r35 - r71
            r118[r33] = r2
            double r2 = r47 + r59
            r118[r67] = r2
            double r35 = r35 + r71
            r118[r10] = r35
            double r47 = r47 - r59
            r118[r86] = r47
            double r2 = r19 - r75
            double r8 = r27 + r77
            double r35 = r53 - r93
            double r47 = r51 + r97
            double r59 = r35 - r47
            double r59 = r59 * r0
            double r47 = r47 + r35
            double r47 = r47 * r0
            double r35 = r2 + r59
            r118[r29] = r35
            double r35 = r8 + r47
            r118[r37] = r35
            double r2 = r2 - r59
            r118[r41] = r2
            double r8 = r8 - r47
            r118[r61] = r8
            double r19 = r19 + r75
            double r27 = r27 - r77
            double r53 = r53 + r93
            double r51 = r51 - r97
            double r2 = r53 - r51
            double r2 = r2 * r0
            double r51 = r51 + r53
            double r51 = r51 * r0
            double r8 = r19 - r51
            r118[r65] = r8
            double r8 = r27 + r2
            r118[r85] = r8
            double r19 = r19 + r51
            r118[r81] = r19
            double r27 = r27 - r2
            r118[r105] = r27
            double r2 = r25 + r12
            double r8 = r30 + r73
            double r19 = r49 - r6
            double r27 = r55 - r57
            double r35 = r2 + r19
            r118[r24] = r35
            double r35 = r8 + r27
            r118[r16] = r35
            double r2 = r2 - r19
            r118[r46] = r2
            double r8 = r8 - r27
            r118[r18] = r8
            double r25 = r25 - r12
            double r30 = r30 - r73
            double r49 = r49 + r6
            double r55 = r55 + r57
            double r2 = r25 - r55
            r118[r70] = r2
            double r2 = r30 + r49
            r118[r34] = r2
            double r25 = r25 + r55
            r118[r87] = r25
            double r30 = r30 - r49
            r118[r11] = r30
            double r2 = r14 - r68
            double r6 = r22 + r62
            double r8 = r38 + r4
            double r10 = r44 - r79
            double r12 = r8 - r10
            double r12 = r12 * r0
            double r10 = r10 + r8
            double r10 = r10 * r0
            double r8 = r2 + r12
            r118[r40] = r8
            double r8 = r6 + r10
            r118[r32] = r8
            double r2 = r2 - r12
            r118[r64] = r2
            double r6 = r6 - r10
            r118[r42] = r6
            double r14 = r14 + r68
            double r22 = r22 - r62
            double r38 = r38 - r4
            double r44 = r44 + r79
            double r2 = r38 - r44
            double r2 = r2 * r0
            double r44 = r44 + r38
            double r0 = r0 * r44
            double r4 = r14 - r0
            r118[r88] = r4
            double r4 = r22 + r2
            r118[r66] = r4
            double r14 = r14 + r0
            r118[r108] = r14
            double r22 = r22 - r2
            r118[r82] = r22
            return
    }

    private void r(int r78, double[] r79, double[] r80, int r81) {
            r77 = this;
            int r0 = r78 >> 3
            int r1 = r0 * 2
            int r2 = r1 + r1
            int r3 = r2 + r1
            r4 = 0
            r5 = r79[r4]
            r7 = r79[r2]
            double r9 = r5 + r7
            r11 = 1
            r12 = r79[r11]
            int r14 = r2 + 1
            r15 = r79[r14]
            double r17 = r12 + r15
            double r5 = r5 - r7
            double r12 = r12 - r15
            r7 = r79[r1]
            r15 = r79[r3]
            double r19 = r7 + r15
            int r21 = r1 + 1
            r22 = r79[r21]
            int r24 = r3 + 1
            r25 = r79[r24]
            double r27 = r22 + r25
            double r7 = r7 - r15
            double r22 = r22 - r25
            double r15 = r9 + r19
            r79[r4] = r15
            double r15 = r17 + r27
            r79[r11] = r15
            double r9 = r9 - r19
            r79[r1] = r9
            double r17 = r17 - r27
            r79[r21] = r17
            double r9 = r5 - r22
            r79[r2] = r9
            double r9 = r12 + r7
            r79[r14] = r9
            double r5 = r5 + r22
            r79[r3] = r5
            double r12 = r12 - r7
            r79[r24] = r12
            int r2 = r81 + 1
            r2 = r80[r2]
            int r5 = r81 + 2
            r5 = r80[r5]
            int r7 = r81 + 3
            r7 = r80[r7]
            r9 = 2
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r12 = 0
            r14 = r12
            r16 = r14
            r12 = r10
        L61:
            r78 = r0
            int r0 = r78 + (-2)
            if (r9 >= r0) goto L236
            int r4 = r4 + 4
            int r0 = r81 + r4
            r18 = r80[r0]
            double r10 = r10 + r18
            double r10 = r10 * r5
            int r20 = r0 + 1
            r20 = r80[r20]
            double r14 = r14 + r20
            double r14 = r14 * r5
            int r22 = r0 + 2
            r22 = r80[r22]
            double r12 = r12 + r22
            double r12 = r12 * r7
            int r0 = r0 + 3
            r24 = r1
            r0 = r80[r0]
            double r16 = r16 - r0
            double r16 = r16 * r7
            double r0 = -r0
            int r25 = r9 + r24
            int r26 = r25 + r24
            int r27 = r26 + r24
            r28 = r79[r9]
            r30 = r79[r26]
            double r32 = r28 + r30
            int r34 = r9 + 1
            r35 = r79[r34]
            int r37 = r26 + 1
            r38 = r79[r37]
            double r40 = r35 + r38
            double r28 = r28 - r30
            double r35 = r35 - r38
            int r30 = r9 + 2
            r38 = r79[r30]
            int r31 = r26 + 2
            r42 = r79[r31]
            double r44 = r38 + r42
            int r46 = r9 + 3
            r47 = r79[r46]
            int r49 = r26 + 3
            r50 = r79[r49]
            double r52 = r47 + r50
            double r38 = r38 - r42
            double r47 = r47 - r50
            r42 = r79[r25]
            r50 = r79[r27]
            double r54 = r42 + r50
            int r56 = r25 + 1
            r57 = r79[r56]
            int r59 = r27 + 1
            r60 = r79[r59]
            double r62 = r57 + r60
            double r42 = r42 - r50
            double r57 = r57 - r60
            int r50 = r25 + 2
            r60 = r79[r50]
            int r51 = r27 + 2
            r64 = r79[r51]
            double r66 = r60 + r64
            int r68 = r25 + 3
            r69 = r79[r68]
            int r71 = r27 + 3
            r72 = r79[r71]
            double r74 = r69 + r72
            double r60 = r60 - r64
            double r69 = r69 - r72
            double r64 = r32 + r54
            r79[r9] = r64
            double r64 = r40 + r62
            r79[r34] = r64
            double r64 = r44 + r66
            r79[r30] = r64
            double r64 = r52 + r74
            r79[r46] = r64
            double r32 = r32 - r54
            r79[r25] = r32
            double r40 = r40 - r62
            r79[r56] = r40
            double r44 = r44 - r66
            r79[r50] = r44
            double r52 = r52 - r74
            r79[r68] = r52
            double r32 = r28 - r57
            double r40 = r35 + r42
            double r44 = r10 * r32
            double r52 = r14 * r40
            double r44 = r44 - r52
            r79[r26] = r44
            double r40 = r40 * r10
            double r32 = r32 * r14
            double r40 = r40 + r32
            r79[r37] = r40
            double r25 = r38 - r69
            double r32 = r47 + r60
            double r40 = r18 * r25
            double r44 = r20 * r32
            double r40 = r40 - r44
            r79[r31] = r40
            double r32 = r32 * r18
            double r25 = r25 * r20
            double r32 = r32 + r25
            r79[r49] = r32
            double r28 = r28 + r57
            double r35 = r35 - r42
            double r25 = r12 * r28
            double r30 = r16 * r35
            double r25 = r25 + r30
            r79[r27] = r25
            double r35 = r35 * r12
            double r28 = r28 * r16
            double r35 = r35 - r28
            r79[r59] = r35
            double r38 = r38 + r69
            double r47 = r47 - r60
            double r25 = r22 * r38
            double r27 = r0 * r47
            double r25 = r25 + r27
            r79[r51] = r25
            double r47 = r47 * r22
            double r38 = r38 * r0
            double r47 = r47 - r38
            r79[r71] = r47
            int r25 = r24 - r9
            int r26 = r25 + r24
            int r27 = r26 + r24
            int r28 = r27 + r24
            r29 = r79[r25]
            r31 = r79[r27]
            double r33 = r29 + r31
            int r35 = r25 + 1
            r36 = r79[r35]
            int r38 = r27 + 1
            r39 = r79[r38]
            double r41 = r36 + r39
            double r29 = r29 - r31
            double r36 = r36 - r39
            int r31 = r25 + (-2)
            r39 = r79[r31]
            int r32 = r27 + (-2)
            r43 = r79[r32]
            double r45 = r39 + r43
            int r47 = r25 + (-1)
            r48 = r79[r47]
            int r50 = r27 + (-1)
            r51 = r79[r50]
            double r53 = r48 + r51
            double r39 = r39 - r43
            double r48 = r48 - r51
            r43 = r79[r26]
            r51 = r79[r28]
            double r55 = r43 + r51
            int r57 = r26 + 1
            r58 = r79[r57]
            int r60 = r28 + 1
            r61 = r79[r60]
            double r63 = r58 + r61
            double r43 = r43 - r51
            double r58 = r58 - r61
            int r51 = r26 + (-2)
            r61 = r79[r51]
            int r52 = r28 + (-2)
            r65 = r79[r52]
            double r67 = r61 + r65
            int r69 = r26 + (-1)
            r70 = r79[r69]
            int r72 = r28 + (-1)
            r73 = r79[r72]
            double r75 = r70 + r73
            double r61 = r61 - r65
            double r70 = r70 - r73
            double r65 = r33 + r55
            r79[r25] = r65
            double r65 = r41 + r63
            r79[r35] = r65
            double r65 = r45 + r67
            r79[r31] = r65
            double r65 = r53 + r75
            r79[r47] = r65
            double r33 = r33 - r55
            r79[r26] = r33
            double r41 = r41 - r63
            r79[r57] = r41
            double r45 = r45 - r67
            r79[r51] = r45
            double r53 = r53 - r75
            r79[r69] = r53
            double r25 = r29 - r58
            double r33 = r36 + r43
            double r41 = r14 * r25
            double r45 = r10 * r33
            double r41 = r41 - r45
            r79[r27] = r41
            double r14 = r14 * r33
            double r10 = r10 * r25
            double r14 = r14 + r10
            r79[r38] = r14
            double r10 = r39 - r70
            double r14 = r48 + r61
            double r25 = r20 * r10
            double r33 = r18 * r14
            double r25 = r25 - r33
            r79[r32] = r25
            double r14 = r14 * r20
            double r10 = r10 * r18
            double r14 = r14 + r10
            r79[r50] = r14
            double r29 = r29 + r58
            double r36 = r36 - r43
            double r10 = r16 * r29
            double r14 = r12 * r36
            double r10 = r10 + r14
            r79[r28] = r10
            double r16 = r16 * r36
            double r12 = r12 * r29
            double r16 = r16 - r12
            r79[r60] = r16
            double r39 = r39 + r70
            double r48 = r48 - r61
            double r10 = r0 * r39
            double r12 = r22 * r48
            double r10 = r10 + r12
            r79[r52] = r10
            double r48 = r48 * r0
            double r39 = r39 * r22
            double r48 = r48 - r39
            r79[r72] = r48
            int r9 = r9 + 4
            r16 = r0
            r10 = r18
            r14 = r20
            r12 = r22
            r1 = r24
            r0 = r78
            goto L61
        L236:
            r24 = r1
            double r10 = r10 + r2
            double r10 = r10 * r5
            double r14 = r14 + r2
            double r5 = r5 * r14
            double r12 = r12 - r2
            double r12 = r12 * r7
            double r16 = r16 - r2
            double r7 = r7 * r16
            int r1 = r78 + r24
            int r4 = r1 + r24
            int r9 = r4 + r24
            r14 = r79[r0]
            int r16 = r4 + (-2)
            r17 = r79[r16]
            double r19 = r14 + r17
            int r21 = r78 + (-1)
            r22 = r79[r21]
            int r24 = r4 + (-1)
            r25 = r79[r24]
            double r27 = r22 + r25
            double r14 = r14 - r17
            double r22 = r22 - r25
            int r17 = r1 + (-2)
            r25 = r79[r17]
            int r18 = r9 + (-2)
            r29 = r79[r18]
            double r31 = r25 + r29
            int r33 = r1 + (-1)
            r34 = r79[r33]
            int r36 = r9 + (-1)
            r37 = r79[r36]
            double r39 = r34 + r37
            double r25 = r25 - r29
            double r34 = r34 - r37
            double r29 = r19 + r31
            r79[r0] = r29
            double r29 = r27 + r39
            r79[r21] = r29
            double r19 = r19 - r31
            r79[r17] = r19
            double r27 = r27 - r39
            r79[r33] = r27
            double r19 = r14 - r34
            double r27 = r22 + r25
            double r29 = r10 * r19
            double r31 = r5 * r27
            double r29 = r29 - r31
            r79[r16] = r29
            double r27 = r27 * r10
            double r19 = r19 * r5
            double r27 = r27 + r19
            r79[r24] = r27
            double r14 = r14 + r34
            double r22 = r22 - r25
            double r16 = r12 * r14
            double r19 = r7 * r22
            double r16 = r16 + r19
            r79[r18] = r16
            double r22 = r22 * r12
            double r14 = r14 * r7
            double r22 = r22 - r14
            r79[r36] = r22
            r14 = r79[r78]
            r16 = r79[r4]
            double r18 = r14 + r16
            int r0 = r78 + 1
            r20 = r79[r0]
            int r22 = r4 + 1
            r23 = r79[r22]
            double r25 = r20 + r23
            double r14 = r14 - r16
            double r20 = r20 - r23
            r16 = r79[r1]
            r23 = r79[r9]
            double r27 = r16 + r23
            int r29 = r1 + 1
            r30 = r79[r29]
            int r32 = r9 + 1
            r33 = r79[r32]
            double r35 = r30 + r33
            double r16 = r16 - r23
            double r30 = r30 - r33
            double r23 = r18 + r27
            r79[r78] = r23
            double r23 = r25 + r35
            r79[r0] = r23
            double r18 = r18 - r27
            r79[r1] = r18
            double r25 = r25 - r35
            r79[r29] = r25
            double r18 = r14 - r30
            double r23 = r20 + r16
            double r25 = r18 - r23
            double r25 = r25 * r2
            r79[r4] = r25
            double r23 = r23 + r18
            double r23 = r23 * r2
            r79[r22] = r23
            double r14 = r14 + r30
            double r20 = r20 - r16
            double r2 = -r2
            double r16 = r14 + r20
            double r16 = r16 * r2
            r79[r9] = r16
            double r20 = r20 - r14
            double r2 = r2 * r20
            r79[r32] = r2
            int r0 = r78 + 2
            r2 = r79[r0]
            int r14 = r4 + 2
            r15 = r79[r14]
            double r17 = r2 + r15
            int r19 = r78 + 3
            r20 = r79[r19]
            int r4 = r4 + 3
            r22 = r79[r4]
            double r24 = r20 + r22
            double r2 = r2 - r15
            double r20 = r20 - r22
            int r15 = r1 + 2
            r22 = r79[r15]
            int r16 = r9 + 2
            r26 = r79[r16]
            double r28 = r22 + r26
            int r1 = r1 + 3
            r30 = r79[r1]
            int r9 = r9 + 3
            r32 = r79[r9]
            double r34 = r30 + r32
            double r22 = r22 - r26
            double r30 = r30 - r32
            double r26 = r17 + r28
            r79[r0] = r26
            double r26 = r24 + r34
            r79[r19] = r26
            double r17 = r17 - r28
            r79[r15] = r17
            double r24 = r24 - r34
            r79[r1] = r24
            double r0 = r2 - r30
            double r17 = r20 + r22
            double r24 = r5 * r0
            double r26 = r10 * r17
            double r24 = r24 - r26
            r79[r14] = r24
            double r5 = r5 * r17
            double r10 = r10 * r0
            double r5 = r5 + r10
            r79[r4] = r5
            double r2 = r2 + r30
            double r20 = r20 - r22
            double r0 = r7 * r2
            double r4 = r12 * r20
            double r0 = r0 + r4
            r79[r16] = r0
            double r7 = r7 * r20
            double r12 = r12 * r2
            double r7 = r7 - r12
            r79[r9] = r7
            return
    }

    private void s(int r8, double[] r9, int[] r10, int r11, int r12, double[] r13) {
            r7 = this;
            r1 = 32
            if (r8 <= r1) goto L41
            r3 = 32
            int r1 = r8 >> 2
            int r4 = r12 - r1
            r7.r(r8, r9, r13, r4)
            r4 = 512(0x200, float:7.17E-43)
            if (r8 <= r4) goto L28
            r3 = 0
            r0 = r7
            r2 = r9
            r4 = r12
            r5 = r13
            r0.x(r1, r2, r3, r4, r5)
            r3 = r1
            r0.y(r1, r2, r3, r4, r5)
            int r3 = r1 * 2
            r0.x(r1, r2, r3, r4, r5)
            int r3 = r1 * 3
            r0.x(r1, r2, r3, r4, r5)
            goto L3d
        L28:
            if (r1 <= r3) goto L34
            r3 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r12
            r5 = r13
            r0.k(r1, r2, r3, r4, r5)
            goto L3d
        L34:
            r3 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r12
            r5 = r13
            r0.t(r1, r2, r3, r4, r5)
        L3d:
            r7.a(r8, r10, r11, r9)
            return
        L41:
            r3 = 32
            r4 = 8
            if (r8 <= r4) goto L5a
            r6 = 0
            if (r8 != r3) goto L53
            int r1 = r12 + (-8)
            r7.p(r9, r6, r13, r1)
            r7.d(r9)
            return
        L53:
            r7.n(r9, r6, r13, r6)
            r7.b(r9)
            return
        L5a:
            if (r8 != r4) goto L60
            r7.m(r9)
            return
        L60:
            r3 = 4
            if (r8 != r3) goto L66
            r7.z(r9)
        L66:
            return
    }

    private void t(int r2, double[] r3, int r4, int r5, double[] r6) {
            r1 = this;
            r0 = 128(0x80, float:1.8E-43)
            if (r2 != r0) goto L1b
            int r2 = r5 + (-8)
            r1.p(r3, r4, r6, r2)
            int r0 = r4 + 32
            int r5 = r5 + (-32)
            r1.q(r3, r0, r6, r5)
            int r5 = r4 + 64
            r1.p(r3, r5, r6, r2)
            int r4 = r4 + 96
            r1.p(r3, r4, r6, r2)
            return
        L1b:
            int r5 = r5 + (-16)
            r1.n(r3, r4, r6, r5)
            int r2 = r4 + 16
            r1.o(r3, r2, r6, r5)
            int r2 = r4 + 32
            r1.n(r3, r2, r6, r5)
            int r4 = r4 + 48
            r1.n(r3, r4, r6, r5)
            return
    }

    private void u(int r2, double[] r3, int r4, int r5, double[] r6) {
            r1 = this;
            r0 = 128(0x80, float:1.8E-43)
            if (r2 != r0) goto L1b
            int r2 = r5 + (-8)
            r1.p(r3, r4, r6, r2)
            int r0 = r4 + 32
            int r5 = r5 + (-32)
            r1.q(r3, r0, r6, r5)
            int r0 = r4 + 64
            r1.p(r3, r0, r6, r2)
            int r4 = r4 + 96
            r1.q(r3, r4, r6, r5)
            return
        L1b:
            int r5 = r5 + (-16)
            r1.n(r3, r4, r6, r5)
            int r2 = r4 + 16
            r1.o(r3, r2, r6, r5)
            int r2 = r4 + 32
            r1.n(r3, r2, r6, r5)
            int r4 = r4 + 48
            r1.o(r3, r4, r6, r5)
            return
    }

    private final void v(int r43, double[] r44, int r45, double[] r46, int r47) {
            r42 = this;
            int r0 = r43 >> 3
            int r1 = r0 * 2
            int r2 = r1 + r1
            int r3 = r2 + r1
            r4 = r44[r45]
            int r2 = r45 + r2
            r6 = r44[r2]
            double r8 = r4 + r6
            int r10 = r45 + 1
            r11 = r44[r10]
            int r13 = r2 + 1
            r14 = r44[r13]
            double r16 = r11 + r14
            double r4 = r4 - r6
            double r11 = r11 - r14
            int r6 = r45 + r1
            r14 = r44[r6]
            int r3 = r45 + r3
            r18 = r44[r3]
            double r20 = r14 + r18
            int r7 = r6 + 1
            r22 = r44[r7]
            int r24 = r3 + 1
            r25 = r44[r24]
            double r27 = r22 + r25
            double r14 = r14 - r18
            double r22 = r22 - r25
            double r18 = r8 + r20
            r44[r45] = r18
            double r18 = r16 + r27
            r44[r10] = r18
            double r8 = r8 - r20
            r44[r6] = r8
            double r16 = r16 - r27
            r44[r7] = r16
            double r6 = r4 - r22
            r44[r2] = r6
            double r6 = r11 + r14
            r44[r13] = r6
            double r4 = r4 + r22
            r44[r3] = r4
            double r11 = r11 - r14
            r44[r24] = r11
            int r2 = r47 + 1
            r2 = r46[r2]
            r4 = 2
            r5 = 0
        L59:
            if (r4 >= r0) goto L14d
            int r5 = r5 + 4
            int r6 = r47 + r5
            r7 = r46[r6]
            int r9 = r6 + 1
            r9 = r46[r9]
            int r11 = r6 + 2
            r11 = r46[r11]
            int r6 = r6 + 3
            r13 = r46[r6]
            double r13 = -r13
            int r6 = r4 + r1
            int r15 = r6 + r1
            int r16 = r15 + r1
            int r17 = r45 + r4
            r18 = r44[r17]
            int r15 = r45 + r15
            r20 = r44[r15]
            double r22 = r18 + r20
            int r24 = r17 + 1
            r25 = r44[r24]
            int r27 = r15 + 1
            r28 = r44[r27]
            double r30 = r25 + r28
            double r18 = r18 - r20
            double r25 = r25 - r28
            int r6 = r45 + r6
            r20 = r44[r6]
            int r16 = r45 + r16
            r28 = r44[r16]
            double r32 = r20 + r28
            int r34 = r6 + 1
            r35 = r44[r34]
            int r37 = r16 + 1
            r38 = r44[r37]
            double r40 = r35 + r38
            double r20 = r20 - r28
            double r35 = r35 - r38
            double r28 = r22 + r32
            r44[r17] = r28
            double r28 = r30 + r40
            r44[r24] = r28
            double r22 = r22 - r32
            r44[r6] = r22
            double r30 = r30 - r40
            r44[r34] = r30
            double r22 = r18 - r35
            double r28 = r25 + r20
            double r30 = r7 * r22
            double r32 = r9 * r28
            double r30 = r30 - r32
            r44[r15] = r30
            double r28 = r28 * r7
            double r22 = r22 * r9
            double r28 = r28 + r22
            r44[r27] = r28
            double r18 = r18 + r35
            double r25 = r25 - r20
            double r20 = r11 * r18
            double r22 = r13 * r25
            double r20 = r20 + r22
            r44[r16] = r20
            double r25 = r25 * r11
            double r18 = r18 * r13
            double r25 = r25 - r18
            r44[r37] = r25
            int r6 = r1 - r4
            int r15 = r6 + r1
            int r16 = r15 + r1
            int r17 = r16 + r1
            int r6 = r45 + r6
            r18 = r44[r6]
            int r16 = r45 + r16
            r20 = r44[r16]
            double r22 = r18 + r20
            int r24 = r6 + 1
            r25 = r44[r24]
            int r27 = r16 + 1
            r28 = r44[r27]
            double r30 = r25 + r28
            double r18 = r18 - r20
            double r25 = r25 - r28
            int r15 = r45 + r15
            r20 = r44[r15]
            int r17 = r45 + r17
            r28 = r44[r17]
            double r32 = r20 + r28
            int r34 = r15 + 1
            r35 = r44[r34]
            int r37 = r17 + 1
            r38 = r44[r37]
            double r40 = r35 + r38
            double r20 = r20 - r28
            double r35 = r35 - r38
            double r28 = r22 + r32
            r44[r6] = r28
            double r28 = r30 + r40
            r44[r24] = r28
            double r22 = r22 - r32
            r44[r15] = r22
            double r30 = r30 - r40
            r44[r34] = r30
            double r22 = r18 - r35
            double r28 = r25 + r20
            double r30 = r9 * r22
            double r32 = r7 * r28
            double r30 = r30 - r32
            r44[r16] = r30
            double r9 = r9 * r28
            double r7 = r7 * r22
            double r9 = r9 + r7
            r44[r27] = r9
            double r18 = r18 + r35
            double r25 = r25 - r20
            double r6 = r13 * r18
            double r8 = r11 * r25
            double r6 = r6 + r8
            r44[r17] = r6
            double r13 = r13 * r25
            double r11 = r11 * r18
            double r13 = r13 - r11
            r44[r37] = r13
            int r4 = r4 + 2
            goto L59
        L14d:
            int r4 = r0 + r1
            int r5 = r4 + r1
            int r1 = r1 + r5
            int r0 = r45 + r0
            r6 = r44[r0]
            int r5 = r45 + r5
            r8 = r44[r5]
            double r10 = r6 + r8
            int r12 = r0 + 1
            r13 = r44[r12]
            int r15 = r5 + 1
            r16 = r44[r15]
            double r18 = r13 + r16
            double r6 = r6 - r8
            double r13 = r13 - r16
            int r4 = r45 + r4
            r8 = r44[r4]
            int r1 = r45 + r1
            r16 = r44[r1]
            double r20 = r8 + r16
            int r22 = r4 + 1
            r23 = r44[r22]
            int r25 = r1 + 1
            r26 = r44[r25]
            double r28 = r23 + r26
            double r8 = r8 - r16
            double r23 = r23 - r26
            double r16 = r10 + r20
            r44[r0] = r16
            double r16 = r18 + r28
            r44[r12] = r16
            double r10 = r10 - r20
            r44[r4] = r10
            double r18 = r18 - r28
            r44[r22] = r18
            double r10 = r6 - r23
            double r16 = r13 + r8
            double r18 = r10 - r16
            double r18 = r18 * r2
            r44[r5] = r18
            double r16 = r16 + r10
            double r16 = r16 * r2
            r44[r15] = r16
            double r6 = r6 + r23
            double r13 = r13 - r8
            double r2 = -r2
            double r4 = r6 + r13
            double r4 = r4 * r2
            r44[r1] = r4
            double r13 = r13 - r6
            double r2 = r2 * r13
            r44[r25] = r2
            return
    }

    private final void w(int r49, double[] r50, int r51, double[] r52, int r53) {
            r48 = this;
            int r0 = r49 >> 3
            int r1 = r0 * 2
            int r2 = r53 + 1
            r2 = r52[r2]
            int r4 = r1 + r1
            int r5 = r4 + r1
            r6 = r50[r51]
            int r4 = r51 + r4
            int r8 = r4 + 1
            r9 = r50[r8]
            double r11 = r6 - r9
            int r13 = r51 + 1
            r14 = r50[r13]
            r16 = r50[r4]
            double r18 = r14 + r16
            double r6 = r6 + r9
            double r14 = r14 - r16
            int r9 = r51 + r1
            r16 = r50[r9]
            int r5 = r51 + r5
            int r10 = r5 + 1
            r20 = r50[r10]
            double r22 = r16 - r20
            int r24 = r9 + 1
            r25 = r50[r24]
            r27 = r50[r5]
            double r29 = r25 + r27
            double r16 = r16 + r20
            double r25 = r25 - r27
            double r20 = r22 - r29
            double r20 = r20 * r2
            double r29 = r29 + r22
            double r29 = r29 * r2
            double r22 = r11 + r20
            r50[r51] = r22
            double r22 = r18 + r29
            r50[r13] = r22
            double r11 = r11 - r20
            r50[r9] = r11
            double r18 = r18 - r29
            r50[r24] = r18
            double r11 = r16 - r25
            double r11 = r11 * r2
            double r25 = r25 + r16
            double r2 = r2 * r25
            double r16 = r6 - r2
            r50[r4] = r16
            double r16 = r14 + r11
            r50[r8] = r16
            double r6 = r6 + r2
            r50[r5] = r6
            double r14 = r14 - r11
            r50[r10] = r14
            int r2 = r0 * 4
            r3 = 2
            r4 = 0
        L6b:
            if (r3 >= r0) goto L1a7
            int r4 = r4 + 4
            int r5 = r53 + r4
            r6 = r52[r5]
            int r8 = r5 + 1
            r8 = r52[r8]
            int r10 = r5 + 2
            r10 = r52[r10]
            int r5 = r5 + 3
            r12 = r52[r5]
            double r12 = -r12
            int r2 = r2 + (-4)
            int r5 = r53 + r2
            r14 = r52[r5]
            int r16 = r5 + 1
            r16 = r52[r16]
            int r18 = r5 + 2
            r18 = r52[r18]
            int r5 = r5 + 3
            r49 = r0
            r20 = r1
            r0 = r52[r5]
            double r0 = -r0
            int r5 = r3 + r20
            int r21 = r5 + r20
            int r22 = r21 + r20
            int r23 = r51 + r3
            r24 = r50[r23]
            int r21 = r51 + r21
            int r26 = r21 + 1
            r27 = r50[r26]
            double r29 = r24 - r27
            int r31 = r23 + 1
            r32 = r50[r31]
            r34 = r50[r21]
            double r36 = r32 + r34
            double r24 = r24 + r27
            double r32 = r32 - r34
            int r5 = r51 + r5
            r27 = r50[r5]
            int r22 = r51 + r22
            int r34 = r22 + 1
            r38 = r50[r34]
            double r40 = r27 - r38
            int r35 = r5 + 1
            r42 = r50[r35]
            r44 = r50[r22]
            double r46 = r42 + r44
            double r27 = r27 + r38
            double r42 = r42 - r44
            double r38 = r6 * r29
            double r44 = r8 * r36
            double r38 = r38 - r44
            double r36 = r36 * r6
            double r29 = r29 * r8
            double r36 = r36 + r29
            double r29 = r16 * r40
            double r44 = r14 * r46
            double r29 = r29 - r44
            double r46 = r46 * r16
            double r40 = r40 * r14
            double r46 = r46 + r40
            double r40 = r38 + r29
            r50[r23] = r40
            double r40 = r36 + r46
            r50[r31] = r40
            double r38 = r38 - r29
            r50[r5] = r38
            double r36 = r36 - r46
            r50[r35] = r36
            double r29 = r10 * r24
            double r35 = r12 * r32
            double r29 = r29 + r35
            double r32 = r32 * r10
            double r24 = r24 * r12
            double r32 = r32 - r24
            double r23 = r0 * r27
            double r35 = r18 * r42
            double r23 = r23 + r35
            double r42 = r42 * r0
            double r27 = r27 * r18
            double r42 = r42 - r27
            double r27 = r29 + r23
            r50[r21] = r27
            double r27 = r32 + r42
            r50[r26] = r27
            double r29 = r29 - r23
            r50[r22] = r29
            double r32 = r32 - r42
            r50[r34] = r32
            int r5 = r20 - r3
            int r21 = r5 + r20
            int r22 = r21 + r20
            int r23 = r22 + r20
            int r5 = r51 + r5
            r24 = r50[r5]
            int r22 = r51 + r22
            int r26 = r22 + 1
            r27 = r50[r26]
            double r29 = r24 - r27
            int r31 = r5 + 1
            r32 = r50[r31]
            r34 = r50[r22]
            double r36 = r32 + r34
            double r24 = r24 + r27
            double r32 = r32 - r34
            int r21 = r51 + r21
            r27 = r50[r21]
            int r23 = r51 + r23
            int r34 = r23 + 1
            r38 = r50[r34]
            double r40 = r27 - r38
            int r35 = r21 + 1
            r42 = r50[r35]
            r44 = r50[r23]
            double r46 = r42 + r44
            double r27 = r27 + r38
            double r42 = r42 - r44
            double r38 = r14 * r29
            double r44 = r16 * r36
            double r38 = r38 - r44
            double r14 = r14 * r36
            double r16 = r16 * r29
            double r14 = r14 + r16
            double r16 = r8 * r40
            double r29 = r6 * r46
            double r16 = r16 - r29
            double r8 = r8 * r46
            double r6 = r6 * r40
            double r8 = r8 + r6
            double r6 = r38 + r16
            r50[r5] = r6
            double r5 = r14 + r8
            r50[r31] = r5
            double r38 = r38 - r16
            r50[r21] = r38
            double r14 = r14 - r8
            r50[r35] = r14
            double r5 = r18 * r24
            double r7 = r0 * r32
            double r5 = r5 + r7
            double r18 = r18 * r32
            double r0 = r0 * r24
            double r18 = r18 - r0
            double r0 = r12 * r27
            double r7 = r10 * r42
            double r0 = r0 + r7
            double r12 = r12 * r42
            double r10 = r10 * r27
            double r12 = r12 - r10
            double r7 = r5 + r0
            r50[r22] = r7
            double r7 = r18 + r12
            r50[r26] = r7
            double r5 = r5 - r0
            r50[r23] = r5
            double r18 = r18 - r12
            r50[r34] = r18
            int r3 = r3 + 2
            r0 = r49
            r1 = r20
            goto L6b
        L1a7:
            r49 = r0
            r20 = r1
            int r0 = r53 + r20
            r1 = r52[r0]
            int r0 = r0 + 1
            r3 = r52[r0]
            int r0 = r49 + r20
            int r5 = r0 + r20
            int r6 = r5 + r20
            int r7 = r51 + r49
            r8 = r50[r7]
            int r5 = r51 + r5
            int r10 = r5 + 1
            r11 = r50[r10]
            double r13 = r8 - r11
            int r15 = r7 + 1
            r16 = r50[r15]
            r18 = r50[r5]
            double r20 = r16 + r18
            double r8 = r8 + r11
            double r16 = r16 - r18
            int r0 = r51 + r0
            r11 = r50[r0]
            int r6 = r51 + r6
            int r18 = r6 + 1
            r22 = r50[r18]
            double r24 = r11 - r22
            int r19 = r0 + 1
            r26 = r50[r19]
            r28 = r50[r6]
            double r30 = r26 + r28
            double r11 = r11 + r22
            double r26 = r26 - r28
            double r22 = r1 * r13
            double r28 = r3 * r20
            double r22 = r22 - r28
            double r20 = r20 * r1
            double r13 = r13 * r3
            double r20 = r20 + r13
            double r13 = r3 * r24
            double r28 = r1 * r30
            double r13 = r13 - r28
            double r30 = r30 * r3
            double r24 = r24 * r1
            double r30 = r30 + r24
            double r24 = r22 + r13
            r50[r7] = r24
            double r24 = r20 + r30
            r50[r15] = r24
            double r22 = r22 - r13
            r50[r0] = r22
            double r20 = r20 - r30
            r50[r19] = r20
            double r13 = r3 * r8
            double r19 = r1 * r16
            double r13 = r13 - r19
            double r16 = r16 * r3
            double r8 = r8 * r1
            double r16 = r16 + r8
            double r7 = r1 * r11
            double r19 = r3 * r26
            double r7 = r7 - r19
            double r1 = r1 * r26
            double r3 = r3 * r11
            double r1 = r1 + r3
            double r3 = r13 - r7
            r50[r5] = r3
            double r3 = r16 - r1
            r50[r10] = r3
            double r13 = r13 + r7
            r50[r6] = r13
            double r16 = r16 + r1
            r50[r18] = r16
            return
    }

    private void x(int r9, double[] r10, int r11, int r12, double[] r13) {
            r8 = this;
            int r6 = r9 >> 2
            int r7 = r6 * 2
            int r5 = r12 - r7
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            r0.v(r1, r2, r3, r4, r5)
            r0 = 512(0x200, float:7.17E-43)
            if (r9 <= r0) goto L2d
            r0 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1 = r6
            r0.x(r1, r2, r3, r4, r5)
            int r3 = r11 + r1
            r0.y(r1, r2, r3, r4, r5)
            int r3 = r11 + r7
            r0.x(r1, r2, r3, r4, r5)
            int r6 = r1 * 3
            int r3 = r11 + r6
            r0.x(r1, r2, r3, r4, r5)
            return
        L2d:
            r8.k(r9, r10, r11, r12, r13)
            return
    }

    private void y(int r9, double[] r10, int r11, int r12, double[] r13) {
            r8 = this;
            int r1 = r9 >> 2
            int r7 = r12 - r9
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r13
            r2.w(r3, r4, r5, r6, r7)
            r2 = r4
            r5 = r6
            r10 = 512(0x200, float:7.17E-43)
            if (r9 <= r10) goto L2c
            r0 = r8
            r3 = r11
            r4 = r12
            r0.x(r1, r2, r3, r4, r5)
            int r3 = r11 + r1
            r0.y(r1, r2, r3, r4, r5)
            int r9 = r1 * 2
            int r3 = r11 + r9
            r0.x(r1, r2, r3, r4, r5)
            int r9 = r1 * 3
            int r3 = r11 + r9
            r0.y(r1, r2, r3, r4, r5)
            return
        L2c:
            r10 = r2
            r13 = r5
            r8.l(r9, r10, r11, r12, r13)
            return
    }

    private void z(double[] r17) {
            r16 = this;
            r0 = 0
            r1 = r17[r0]
            r3 = 2
            r4 = r17[r3]
            double r6 = r1 - r4
            r8 = 1
            r9 = r17[r8]
            r11 = 3
            r12 = r17[r11]
            double r14 = r9 - r12
            double r1 = r1 + r4
            r17[r0] = r1
            double r9 = r9 + r12
            r17[r8] = r9
            r17[r3] = r6
            r17[r11] = r14
            return
    }

    public void B(int r20, int r21, double[] r22, int[] r23, double[] r24) {
            r19 = this;
            r0 = r19
            r1 = r20
            r6 = r23
            r4 = r24
            r7 = 0
            r2 = r6[r7]
            int r3 = r2 << 2
            if (r1 <= r3) goto L14
            int r2 = r1 >> 2
            r0.H(r2, r6, r4)
        L14:
            r5 = r2
            r8 = 1
            r2 = r6[r8]
            if (r1 <= r2) goto L1f
            r0.G(r1, r6, r4, r5)
            r3 = r1
            goto L20
        L1f:
            r3 = r2
        L20:
            r9 = 4
            r10 = 2
            if (r21 >= 0) goto L7b
            int r2 = r1 + (-1)
            r11 = r22[r2]
            int r2 = r1 + (-2)
        L2a:
            if (r2 < r10) goto L42
            int r13 = r2 + 1
            r14 = r22[r2]
            int r16 = r2 + (-1)
            r17 = r22[r16]
            double r14 = r14 - r17
            r22[r13] = r14
            r13 = r22[r2]
            r15 = r22[r16]
            double r13 = r13 + r15
            r22[r2] = r13
            int r2 = r2 + (-2)
            goto L2a
        L42:
            r13 = r22[r7]
            double r15 = r13 - r11
            r22[r8] = r15
            double r13 = r13 + r11
            r22[r7] = r13
            if (r1 <= r9) goto L62
            r2 = r22
            r0.J(r1, r2, r3, r4, r5)
            r11 = r3
            r4 = 2
            r0 = r19
            r1 = r20
            r3 = r6
            r6 = r24
            r0.j(r1, r2, r3, r4, r5, r6)
        L5e:
            r4 = r24
            r3 = r11
            goto L83
        L62:
            r11 = r3
            if (r1 != r9) goto L74
            r4 = 2
            r0 = r19
            r2 = r22
            r3 = r23
            r6 = r24
            r0.j(r1, r2, r3, r4, r5, r6)
            r1 = r20
            goto L5e
        L74:
            r0 = r19
            r1 = r20
            r2 = r22
            goto L5e
        L7b:
            r0 = r19
            r1 = r20
            r2 = r22
            r4 = r24
        L83:
            r0.A(r1, r2, r3, r4, r5)
            r11 = r3
            if (r21 < 0) goto Lcf
            if (r1 <= r9) goto L9d
            r4 = 2
            r0 = r19
            r2 = r22
            r3 = r23
            r6 = r24
            r0.s(r1, r2, r3, r4, r5, r6)
            r4 = r6
            r3 = r11
            r0.K(r1, r2, r3, r4, r5)
            goto Lab
        L9d:
            if (r1 != r9) goto Lab
            r4 = 2
            r0 = r19
            r2 = r22
            r3 = r23
            r6 = r24
            r0.s(r1, r2, r3, r4, r5, r6)
        Lab:
            r2 = r22[r7]
            r4 = r22[r8]
            double r11 = r2 - r4
            double r2 = r2 + r4
            r22[r7] = r2
        Lb4:
            if (r10 >= r1) goto Lcb
            int r0 = r10 + (-1)
            r2 = r22[r10]
            int r4 = r10 + 1
            r5 = r22[r4]
            double r2 = r2 - r5
            r22[r0] = r2
            r2 = r22[r10]
            r4 = r22[r4]
            double r2 = r2 + r4
            r22[r10] = r2
            int r10 = r10 + 2
            goto Lb4
        Lcb:
            int r0 = r1 + (-1)
            r22[r0] = r11
        Lcf:
            return
    }

    public void C(int r20, int r21, double[] r22, int[] r23, double[] r24) {
            r19 = this;
            r0 = r19
            r1 = r20
            r6 = r23
            r4 = r24
            r7 = 0
            r2 = r6[r7]
            int r3 = r2 << 2
            if (r1 <= r3) goto L14
            int r2 = r1 >> 2
            r0.H(r2, r6, r4)
        L14:
            r5 = r2
            r8 = 1
            r2 = r6[r8]
            if (r1 <= r2) goto L1f
            r0.G(r1, r6, r4, r5)
            r3 = r1
            goto L20
        L1f:
            r3 = r2
        L20:
            r9 = 4
            r10 = 2
            if (r21 >= 0) goto L7c
            int r2 = r1 + (-1)
            r11 = r22[r2]
            int r2 = r1 + (-2)
        L2a:
            if (r2 < r10) goto L43
            int r13 = r2 + 1
            r14 = r22[r2]
            double r14 = -r14
            int r16 = r2 + (-1)
            r17 = r22[r16]
            double r14 = r14 - r17
            r22[r13] = r14
            r13 = r22[r2]
            r15 = r22[r16]
            double r13 = r13 - r15
            r22[r2] = r13
            int r2 = r2 + (-2)
            goto L2a
        L43:
            r13 = r22[r7]
            double r15 = r13 + r11
            r22[r8] = r15
            double r13 = r13 - r11
            r22[r7] = r13
            if (r1 <= r9) goto L63
            r2 = r22
            r0.J(r1, r2, r3, r4, r5)
            r11 = r3
            r4 = 2
            r0 = r19
            r1 = r20
            r3 = r6
            r6 = r24
            r0.j(r1, r2, r3, r4, r5, r6)
        L5f:
            r4 = r24
            r3 = r11
            goto L84
        L63:
            r11 = r3
            if (r1 != r9) goto L75
            r4 = 2
            r0 = r19
            r2 = r22
            r3 = r23
            r6 = r24
            r0.j(r1, r2, r3, r4, r5, r6)
            r1 = r20
            goto L5f
        L75:
            r0 = r19
            r1 = r20
            r2 = r22
            goto L5f
        L7c:
            r0 = r19
            r1 = r20
            r2 = r22
            r4 = r24
        L84:
            r0.F(r1, r2, r3, r4, r5)
            r11 = r3
            if (r21 < 0) goto Ld2
            if (r1 <= r9) goto L9e
            r4 = 2
            r0 = r19
            r2 = r22
            r3 = r23
            r6 = r24
            r0.s(r1, r2, r3, r4, r5, r6)
            r4 = r6
            r3 = r11
            r0.K(r1, r2, r3, r4, r5)
            goto Lac
        L9e:
            if (r1 != r9) goto Lac
            r4 = 2
            r0 = r19
            r2 = r22
            r3 = r23
            r6 = r24
            r0.s(r1, r2, r3, r4, r5, r6)
        Lac:
            r2 = r22[r7]
            r4 = r22[r8]
            double r11 = r2 - r4
            double r2 = r2 + r4
            r22[r7] = r2
        Lb5:
            if (r10 >= r1) goto Lcd
            int r0 = r10 + (-1)
            r2 = r22[r10]
            double r2 = -r2
            int r4 = r10 + 1
            r5 = r22[r4]
            double r2 = r2 - r5
            r22[r0] = r2
            r2 = r22[r10]
            r4 = r22[r4]
            double r2 = r2 - r4
            r22[r10] = r2
            int r10 = r10 + 2
            goto Lb5
        Lcd:
            int r0 = r1 + (-1)
            double r1 = -r11
            r22[r0] = r1
        Ld2:
            return
    }

    public void D(int r24, double[] r25, double[] r26, int[] r27, double[] r28) {
            r23 = this;
            r0 = r23
            r7 = r24
            r6 = r27
            r4 = r28
            r8 = 0
            r1 = r6[r8]
            int r2 = r1 << 3
            if (r7 <= r2) goto L14
            int r1 = r7 >> 3
            r0.H(r1, r6, r4)
        L14:
            r5 = r1
            r9 = 1
            r1 = r6[r9]
            int r2 = r1 << 1
            if (r7 <= r2) goto L21
            int r1 = r7 >> 1
            r0.G(r1, r6, r4, r5)
        L21:
            r3 = r1
            int r1 = r7 >> 1
            r10 = r25[r1]
            r12 = r25[r8]
            r14 = r25[r7]
            double r16 = r12 + r14
            double r12 = r12 - r14
            r25[r8] = r12
            double r12 = r16 - r10
            r26[r8] = r12
            double r16 = r16 + r10
            r26[r1] = r16
            r10 = 2
            if (r7 <= r10) goto L160
            int r11 = r7 >> 2
            r2 = 1
        L3d:
            if (r2 >= r11) goto L62
            int r12 = r1 - r2
            r13 = r25[r2]
            int r15 = r7 - r2
            r15 = r25[r15]
            double r17 = r13 - r15
            double r13 = r13 + r15
            r15 = r25[r12]
            int r19 = r7 - r12
            r19 = r25[r19]
            double r21 = r15 - r19
            double r15 = r15 + r19
            r25[r2] = r17
            r25[r12] = r21
            double r17 = r13 - r15
            r26[r2] = r17
            double r13 = r13 + r15
            r26[r12] = r13
            int r2 = r2 + 1
            goto L3d
        L62:
            r12 = r25[r11]
            int r2 = r7 - r11
            r14 = r25[r2]
            double r12 = r12 + r14
            r26[r11] = r12
            r12 = r25[r11]
            r14 = r25[r2]
            double r12 = r12 - r14
            r25[r11] = r12
            r2 = r25
            r0.A(r1, r2, r3, r4, r5)
            r12 = r3
            r13 = 4
            if (r1 <= r13) goto L8c
            r4 = 2
            r0 = r23
            r2 = r25
            r3 = r6
            r6 = r28
            r0.s(r1, r2, r3, r4, r5, r6)
            r4 = r6
            r3 = r12
            r0.K(r1, r2, r3, r4, r5)
            goto L9a
        L8c:
            if (r1 != r13) goto L9a
            r4 = 2
            r0 = r23
            r2 = r25
            r3 = r27
            r6 = r28
            r0.s(r1, r2, r3, r4, r5, r6)
        L9a:
            int r0 = r7 + (-1)
            r2 = r25[r8]
            r14 = r25[r9]
            double r2 = r2 - r14
            r25[r0] = r2
            r2 = r25[r8]
            r14 = r25[r9]
            double r2 = r2 + r14
            r25[r9] = r2
            int r1 = r1 - r10
        Lab:
            if (r1 < r10) goto Lc5
            int r0 = r1 * 2
            int r2 = r0 + 1
            r3 = r25[r1]
            int r6 = r1 + 1
            r14 = r25[r6]
            double r3 = r3 + r14
            r25[r2] = r3
            int r0 = r0 - r9
            r2 = r25[r1]
            r14 = r25[r6]
            double r2 = r2 - r14
            r25[r0] = r2
            int r1 = r1 + (-2)
            goto Lab
        Lc5:
            r1 = r11
            r11 = 2
        Lc7:
            if (r1 < r10) goto L14d
            r0 = r23
            r2 = r26
            r4 = r28
            r3 = r12
            r0.A(r1, r2, r3, r4, r5)
            if (r1 <= r13) goto Le7
            r4 = 2
            r0 = r23
            r2 = r26
            r3 = r27
            r6 = r28
            r0.s(r1, r2, r3, r4, r5, r6)
            r4 = r6
            r3 = r12
            r0.K(r1, r2, r3, r4, r5)
            goto Lf5
        Le7:
            if (r1 != r13) goto Lf5
            r4 = 2
            r0 = r23
            r2 = r26
            r3 = r27
            r6 = r28
            r0.s(r1, r2, r3, r4, r5, r6)
        Lf5:
            int r0 = r7 - r11
            r2 = r26[r8]
            r14 = r26[r9]
            double r2 = r2 - r14
            r25[r0] = r2
            r2 = r26[r8]
            r14 = r26[r9]
            double r2 = r2 + r14
            r25[r11] = r2
            r0 = 2
            r2 = 0
        L107:
            if (r0 >= r1) goto L125
            int r3 = r11 << 2
            int r2 = r2 + r3
            int r3 = r2 - r11
            r14 = r26[r0]
            int r4 = r0 + 1
            r16 = r26[r4]
            double r14 = r14 - r16
            r25[r3] = r14
            int r3 = r2 + r11
            r14 = r26[r0]
            r16 = r26[r4]
            double r14 = r14 + r16
            r25[r3] = r14
            int r0 = r0 + 2
            goto L107
        L125:
            int r11 = r11 << 1
            int r0 = r1 >> 1
            r2 = 0
        L12a:
            if (r2 >= r0) goto L145
            int r3 = r1 - r2
            int r4 = r1 + r3
            r14 = r26[r4]
            int r6 = r1 + r2
            r16 = r26[r6]
            double r14 = r14 - r16
            r26[r2] = r14
            r14 = r26[r4]
            r16 = r26[r6]
            double r14 = r14 + r16
            r26[r3] = r14
            int r2 = r2 + 1
            goto L12a
        L145:
            int r1 = r1 + r0
            r1 = r26[r1]
            r26[r0] = r1
            r1 = r0
            goto Lc7
        L14d:
            r0 = r26[r8]
            r25[r11] = r0
            r0 = r26[r10]
            r2 = r26[r9]
            double r0 = r0 - r2
            r25[r7] = r0
            r0 = r26[r10]
            r2 = r26[r9]
            double r0 = r0 + r2
            r25[r8] = r0
            return
        L160:
            r0 = r25[r8]
            r25[r9] = r0
            r0 = r26[r8]
            r25[r10] = r0
            r0 = r26[r9]
            r25[r8] = r0
            return
    }

    public void E(int r24, double[] r25, double[] r26, int[] r27, double[] r28) {
            r23 = this;
            r0 = r23
            r7 = r24
            r6 = r27
            r4 = r28
            r8 = 0
            r1 = r6[r8]
            int r2 = r1 << 3
            if (r7 <= r2) goto L14
            int r1 = r7 >> 3
            r0.H(r1, r6, r4)
        L14:
            r5 = r1
            r9 = 1
            r1 = r6[r9]
            int r2 = r1 << 1
            if (r7 <= r2) goto L21
            int r1 = r7 >> 1
            r0.G(r1, r6, r4, r5)
        L21:
            r3 = r1
            r10 = 2
            if (r7 <= r10) goto L144
            int r1 = r7 >> 1
            int r11 = r7 >> 2
            r2 = 1
        L2a:
            if (r2 >= r11) goto L4f
            int r12 = r1 - r2
            r13 = r25[r2]
            int r15 = r7 - r2
            r15 = r25[r15]
            double r17 = r13 + r15
            double r13 = r13 - r15
            r15 = r25[r12]
            int r19 = r7 - r12
            r19 = r25[r19]
            double r21 = r15 + r19
            double r15 = r15 - r19
            r25[r2] = r17
            r25[r12] = r21
            double r17 = r13 + r15
            r26[r2] = r17
            double r13 = r13 - r15
            r26[r12] = r13
            int r2 = r2 + 1
            goto L2a
        L4f:
            r12 = r25[r11]
            int r2 = r7 - r11
            r14 = r25[r2]
            double r12 = r12 - r14
            r26[r8] = r12
            r12 = r25[r11]
            r14 = r25[r2]
            double r12 = r12 + r14
            r25[r11] = r12
            r12 = r25[r1]
            r25[r8] = r12
            r2 = r25
            r0.F(r1, r2, r3, r4, r5)
            r12 = r3
            r13 = 4
            if (r1 <= r13) goto L7d
            r4 = 2
            r0 = r23
            r2 = r25
            r3 = r6
            r6 = r28
            r0.s(r1, r2, r3, r4, r5, r6)
            r4 = r6
            r3 = r12
            r0.K(r1, r2, r3, r4, r5)
            goto L8b
        L7d:
            if (r1 != r13) goto L8b
            r4 = 2
            r0 = r23
            r2 = r25
            r3 = r27
            r6 = r28
            r0.s(r1, r2, r3, r4, r5, r6)
        L8b:
            int r0 = r7 + (-1)
            r2 = r25[r9]
            r14 = r25[r8]
            double r2 = r2 - r14
            r25[r0] = r2
            r2 = r25[r8]
            r14 = r25[r9]
            double r2 = r2 + r14
            r25[r9] = r2
            int r1 = r1 - r10
        L9c:
            if (r1 < r10) goto Lb7
            int r0 = r1 * 2
            int r2 = r0 + 1
            r3 = r25[r1]
            int r6 = r1 + 1
            r14 = r25[r6]
            double r3 = r3 - r14
            r25[r2] = r3
            int r0 = r0 - r9
            r2 = r25[r1]
            double r2 = -r2
            r14 = r25[r6]
            double r2 = r2 - r14
            r25[r0] = r2
            int r1 = r1 + (-2)
            goto L9c
        Lb7:
            r1 = r11
            r11 = 2
        Lb9:
            if (r1 < r10) goto L140
            r0 = r23
            r2 = r26
            r4 = r28
            r3 = r12
            r0.F(r1, r2, r3, r4, r5)
            if (r1 <= r13) goto Ld9
            r4 = 2
            r0 = r23
            r2 = r26
            r3 = r27
            r6 = r28
            r0.s(r1, r2, r3, r4, r5, r6)
            r4 = r6
            r3 = r12
            r0.K(r1, r2, r3, r4, r5)
            goto Le7
        Ld9:
            if (r1 != r13) goto Le7
            r4 = 2
            r0 = r23
            r2 = r26
            r3 = r27
            r6 = r28
            r0.s(r1, r2, r3, r4, r5, r6)
        Le7:
            int r0 = r7 - r11
            r2 = r26[r9]
            r14 = r26[r8]
            double r2 = r2 - r14
            r25[r0] = r2
            r2 = r26[r8]
            r14 = r26[r9]
            double r2 = r2 + r14
            r25[r11] = r2
            r0 = 2
            r2 = 0
        Lf9:
            if (r0 >= r1) goto L118
            int r3 = r11 << 2
            int r2 = r2 + r3
            int r3 = r2 - r11
            r14 = r26[r0]
            double r14 = -r14
            int r4 = r0 + 1
            r16 = r26[r4]
            double r14 = r14 - r16
            r25[r3] = r14
            int r3 = r2 + r11
            r14 = r26[r0]
            r16 = r26[r4]
            double r14 = r14 - r16
            r25[r3] = r14
            int r0 = r0 + 2
            goto Lf9
        L118:
            int r11 = r11 << 1
            int r0 = r1 >> 1
            r2 = 1
        L11d:
            if (r2 >= r0) goto L138
            int r3 = r1 - r2
            int r4 = r1 + r3
            r14 = r26[r4]
            int r6 = r1 + r2
            r16 = r26[r6]
            double r14 = r14 + r16
            r26[r2] = r14
            r14 = r26[r4]
            r16 = r26[r6]
            double r14 = r14 - r16
            r26[r3] = r14
            int r2 = r2 + 1
            goto L11d
        L138:
            int r1 = r1 + r0
            r1 = r26[r1]
            r26[r8] = r1
            r1 = r0
            goto Lb9
        L140:
            r0 = r26[r8]
            r25[r11] = r0
        L144:
            r0 = 0
            r25[r8] = r0
            return
    }

    public void I(int r18, int r19, double[] r20, int[] r21, double[] r22) {
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r21
            r6 = r22
            r7 = 0
            r2 = r3[r7]
            int r4 = r2 << 2
            if (r1 <= r4) goto L14
            int r2 = r1 >> 2
            r0.H(r2, r3, r6)
        L14:
            r5 = r2
            r8 = 1
            r2 = r3[r8]
            int r4 = r2 << 2
            if (r1 <= r4) goto L21
            int r2 = r1 >> 2
            r0.G(r2, r3, r6, r5)
        L21:
            r9 = r2
            r10 = 4
            if (r19 < 0) goto L4d
            if (r1 <= r10) goto L33
            r4 = 2
            r2 = r20
            r0.s(r1, r2, r3, r4, r5, r6)
            r4 = r6
            r3 = r9
            r0.K(r1, r2, r3, r4, r5)
            goto L41
        L33:
            if (r1 != r10) goto L41
            r4 = 2
            r0 = r17
            r2 = r20
            r3 = r21
            r6 = r22
            r0.s(r1, r2, r3, r4, r5, r6)
        L41:
            r0 = r20[r7]
            r2 = r20[r8]
            double r4 = r0 - r2
            double r0 = r0 + r2
            r20[r7] = r0
            r20[r8] = r4
            return
        L4d:
            r3 = r9
            r11 = r20[r7]
            r13 = r20[r8]
            double r13 = r11 - r13
            r15 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r13 = r13 * r15
            r20[r8] = r13
            double r11 = r11 - r13
            r20[r7] = r11
            if (r1 <= r10) goto L73
            r0 = r17
            r2 = r20
            r4 = r22
            r0.J(r1, r2, r3, r4, r5)
            r4 = 2
            r1 = r18
            r3 = r21
            r6 = r22
            r0.j(r1, r2, r3, r4, r5, r6)
            return
        L73:
            if (r1 != r10) goto L81
            r4 = 2
            r0 = r17
            r2 = r20
            r3 = r21
            r6 = r22
            r0.j(r1, r2, r3, r4, r5, r6)
        L81:
            return
    }

    public void g(int r9, int r10, double[] r11, int[] r12, double[] r13) {
            r8 = this;
            r0 = 0
            r0 = r12[r0]
            int r1 = r0 << 2
            if (r9 <= r1) goto Lc
            int r0 = r9 >> 2
            r8.H(r0, r12, r13)
        Lc:
            r6 = r0
            if (r10 < 0) goto L19
            r5 = 2
            r1 = r8
            r2 = r9
            r3 = r11
            r4 = r12
            r7 = r13
            r1.s(r2, r3, r4, r5, r6, r7)
            return
        L19:
            r2 = r9
            r3 = r11
            r4 = r12
            r7 = r13
            r5 = 2
            r1 = r8
            r1.j(r2, r3, r4, r5, r6, r7)
            return
    }
}
