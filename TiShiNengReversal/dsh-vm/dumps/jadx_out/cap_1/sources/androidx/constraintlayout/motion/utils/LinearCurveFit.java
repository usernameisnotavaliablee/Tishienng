package androidx.constraintlayout.motion.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class LinearCurveFit extends androidx.constraintlayout.motion.utils.CurveFit {
    private static final java.lang.String TAG = "LinearCurveFit";
    private double[] mT;
    private double mTotalLength;
    private double[][] mY;

    public LinearCurveFit(double[] r12, double[][] r13) {
            r11 = this;
            r11.<init>()
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r11.mTotalLength = r0
            int r0 = r12.length
            r0 = 0
            r1 = r13[r0]
            int r1 = r1.length
            r11.mT = r12
            r11.mY = r13
            r2 = 2
            if (r1 <= r2) goto L2e
            r1 = 0
            r4 = r1
            r3 = 0
        L17:
            r6 = r4
            int r8 = r12.length
            if (r3 >= r8) goto L2c
            r8 = r13[r3]
            r9 = r8[r0]
            if (r3 <= 0) goto L28
            double r4 = r9 - r4
            double r6 = r9 - r6
            java.lang.Math.hypot(r4, r6)
        L28:
            int r3 = r3 + 1
            r4 = r9
            goto L17
        L2c:
            r11.mTotalLength = r1
        L2e:
            return
    }

    private double getLength2D(double r23) {
            r22 = this;
            r0 = r22
            double r1 = r0.mTotalLength
            boolean r1 = java.lang.Double.isNaN(r1)
            r2 = 0
            if (r1 == 0) goto Ld
            return r2
        Ld:
            double[] r1 = r0.mT
            int r4 = r1.length
            r5 = 0
            r6 = r1[r5]
            int r8 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r8 > 0) goto L18
            return r2
        L18:
            r6 = 1
            int r4 = r4 - r6
            r7 = r1[r4]
            int r1 = (r23 > r7 ? 1 : (r23 == r7 ? 0 : -1))
            if (r1 < 0) goto L23
            double r1 = r0.mTotalLength
            return r1
        L23:
            r7 = r2
            r9 = r7
            r11 = r9
            r1 = 0
        L27:
            if (r1 >= r4) goto L7e
            double[][] r13 = r0.mY
            r13 = r13[r1]
            r14 = r13[r5]
            r16 = r13[r6]
            if (r1 <= 0) goto L3c
            double r9 = r14 - r9
            double r11 = r16 - r11
            double r9 = java.lang.Math.hypot(r9, r11)
            double r7 = r7 + r9
        L3c:
            double[] r9 = r0.mT
            r10 = r9[r1]
            int r12 = (r23 > r10 ? 1 : (r23 == r10 ? 0 : -1))
            if (r12 != 0) goto L45
            return r7
        L45:
            int r12 = r1 + 1
            r18 = r9[r12]
            int r9 = (r23 > r18 ? 1 : (r23 == r18 ? 0 : -1))
            if (r9 >= 0) goto L79
            double r18 = r18 - r10
            double r2 = r23 - r10
            double r2 = r2 / r18
            double[][] r4 = r0.mY
            r1 = r4[r1]
            r9 = r1[r5]
            r4 = r4[r12]
            r11 = r4[r5]
            r18 = r1[r6]
            r5 = r4[r6]
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r20 = r20 - r2
            double r18 = r18 * r20
            double r5 = r5 * r2
            double r18 = r18 + r5
            double r4 = r16 - r18
            double r9 = r9 * r20
            double r11 = r11 * r2
            double r9 = r9 + r11
            double r14 = r14 - r9
            double r1 = java.lang.Math.hypot(r4, r14)
            double r7 = r7 + r1
            return r7
        L79:
            r1 = r12
            r9 = r14
            r11 = r16
            goto L27
        L7e:
            return r2
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public double getPos(double r9, int r11) {
            r8 = this;
            double[] r0 = r8.mT
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 > 0) goto L11
            double[][] r9 = r8.mY
            r9 = r9[r2]
            r10 = r9[r11]
            return r10
        L11:
            int r1 = r1 + (-1)
            r3 = r0[r1]
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L20
            double[][] r9 = r8.mY
            r9 = r9[r1]
            r10 = r9[r11]
            return r10
        L20:
            if (r2 >= r1) goto L51
            double[] r0 = r8.mT
            r3 = r0[r2]
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 != 0) goto L31
            double[][] r9 = r8.mY
            r9 = r9[r2]
            r10 = r9[r11]
            return r10
        L31:
            int r5 = r2 + 1
            r6 = r0[r5]
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 >= 0) goto L4f
            double r6 = r6 - r3
            double r9 = r9 - r3
            double r9 = r9 / r6
            double[][] r0 = r8.mY
            r1 = r0[r2]
            r2 = r1[r11]
            r0 = r0[r5]
            r4 = r0[r11]
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r9
            double r2 = r2 * r0
            double r4 = r4 * r9
            double r2 = r2 + r4
            return r2
        L4f:
            r2 = r5
            goto L20
        L51:
            r9 = 0
            return r9
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public void getPos(double r13, double[] r15) {
            r12 = this;
            double[] r0 = r12.mT
            int r1 = r0.length
            double[][] r2 = r12.mY
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L1d
            r13 = 0
        L10:
            if (r13 >= r2) goto L75
            double[][] r14 = r12.mY
            r14 = r14[r3]
            r0 = r14[r13]
            r15[r13] = r0
            int r13 = r13 + 1
            goto L10
        L1d:
            int r1 = r1 + (-1)
            r4 = r0[r1]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L32
        L25:
            if (r3 >= r2) goto L75
            double[][] r13 = r12.mY
            r13 = r13[r1]
            r4 = r13[r3]
            r15[r3] = r4
            int r3 = r3 + 1
            goto L25
        L32:
            r0 = 0
        L33:
            if (r0 >= r1) goto L75
            double[] r4 = r12.mT
            r5 = r4[r0]
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 != 0) goto L4b
            r4 = 0
        L3e:
            if (r4 >= r2) goto L4b
            double[][] r5 = r12.mY
            r5 = r5[r0]
            r6 = r5[r4]
            r15[r4] = r6
            int r4 = r4 + 1
            goto L3e
        L4b:
            double[] r4 = r12.mT
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 >= 0) goto L73
            r8 = r4[r0]
            double r6 = r6 - r8
            double r13 = r13 - r8
            double r13 = r13 / r6
        L5a:
            if (r3 >= r2) goto L75
            double[][] r1 = r12.mY
            r4 = r1[r0]
            r6 = r4[r3]
            r1 = r1[r5]
            r8 = r1[r3]
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 - r13
            double r6 = r6 * r10
            double r8 = r8 * r13
            double r6 = r6 + r8
            r15[r3] = r6
            int r3 = r3 + 1
            goto L5a
        L73:
            r0 = r5
            goto L33
        L75:
            return
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public void getPos(double r13, float[] r15) {
            r12 = this;
            double[] r0 = r12.mT
            int r1 = r0.length
            double[][] r2 = r12.mY
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L1e
            r13 = 0
        L10:
            if (r13 >= r2) goto L79
            double[][] r14 = r12.mY
            r14 = r14[r3]
            r0 = r14[r13]
            float r14 = (float) r0
            r15[r13] = r14
            int r13 = r13 + 1
            goto L10
        L1e:
            int r1 = r1 + (-1)
            r4 = r0[r1]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L34
        L26:
            if (r3 >= r2) goto L79
            double[][] r13 = r12.mY
            r13 = r13[r1]
            r4 = r13[r3]
            float r13 = (float) r4
            r15[r3] = r13
            int r3 = r3 + 1
            goto L26
        L34:
            r0 = 0
        L35:
            if (r0 >= r1) goto L79
            double[] r4 = r12.mT
            r5 = r4[r0]
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 != 0) goto L4e
            r4 = 0
        L40:
            if (r4 >= r2) goto L4e
            double[][] r5 = r12.mY
            r5 = r5[r0]
            r6 = r5[r4]
            float r5 = (float) r6
            r15[r4] = r5
            int r4 = r4 + 1
            goto L40
        L4e:
            double[] r4 = r12.mT
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 >= 0) goto L77
            r8 = r4[r0]
            double r6 = r6 - r8
            double r13 = r13 - r8
            double r13 = r13 / r6
        L5d:
            if (r3 >= r2) goto L79
            double[][] r1 = r12.mY
            r4 = r1[r0]
            r6 = r4[r3]
            r1 = r1[r5]
            r8 = r1[r3]
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 - r13
            double r6 = r6 * r10
            double r8 = r8 * r13
            double r6 = r6 + r8
            float r1 = (float) r6
            r15[r3] = r1
            int r3 = r3 + 1
            goto L5d
        L77:
            r0 = r5
            goto L35
        L79:
            return
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public double getSlope(double r8, int r10) {
            r7 = this;
            double[] r0 = r7.mT
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
        La:
            r8 = r3
            goto L15
        Lc:
            int r3 = r1 + (-1)
            r3 = r0[r3]
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L15
            goto La
        L15:
            int r0 = r1 + (-1)
            if (r2 >= r0) goto L35
            double[] r0 = r7.mT
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L33
            r8 = r0[r2]
            double r4 = r4 - r8
            double[][] r8 = r7.mY
            r9 = r8[r2]
            r0 = r9[r10]
            r8 = r8[r3]
            r9 = r8[r10]
            double r9 = r9 - r0
            double r9 = r9 / r4
            return r9
        L33:
            r2 = r3
            goto L15
        L35:
            r8 = 0
            return r8
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public void getSlope(double r13, double[] r15) {
            r12 = this;
            double[] r0 = r12.mT
            int r1 = r0.length
            double[][] r2 = r12.mY
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L11
        Lf:
            r13 = r4
            goto L1a
        L11:
            int r4 = r1 + (-1)
            r4 = r0[r4]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L1a
            goto Lf
        L1a:
            r0 = 0
        L1b:
            int r4 = r1 + (-1)
            if (r0 >= r4) goto L41
            double[] r4 = r12.mT
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L3f
            r13 = r4[r0]
            double r6 = r6 - r13
        L2c:
            if (r3 >= r2) goto L41
            double[][] r13 = r12.mY
            r14 = r13[r0]
            r8 = r14[r3]
            r13 = r13[r5]
            r10 = r13[r3]
            double r10 = r10 - r8
            double r10 = r10 / r6
            r15[r3] = r10
            int r3 = r3 + 1
            goto L2c
        L3f:
            r0 = r5
            goto L1b
        L41:
            return
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public double[] getTimePoints() {
            r1 = this;
            double[] r0 = r1.mT
            return r0
    }
}
