package androidx.constraintlayout.motion.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ArcCurveFit extends androidx.constraintlayout.motion.utils.CurveFit {
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    private static final int START_HORIZONTAL = 2;
    private static final int START_LINEAR = 3;
    private static final int START_VERTICAL = 1;
    androidx.constraintlayout.motion.utils.ArcCurveFit.Arc[] mArcs;
    private final double[] mTime;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class Arc {
        private static final double EPSILON = 0.001d;
        private static final java.lang.String TAG = "Arc";
        private static double[] ourPercent;
        boolean linear;
        double mArcDistance;
        double mArcVelocity;
        double mEllipseA;
        double mEllipseB;
        double mEllipseCenterX;
        double mEllipseCenterY;
        double[] mLut;
        double mOneOverDeltaTime;
        double mTime1;
        double mTime2;
        double mTmpCosAngle;
        double mTmpSinAngle;
        boolean mVertical;
        double mX1;
        double mX2;
        double mY1;
        double mY2;

        static {
                r0 = 91
                double[] r0 = new double[r0]
                androidx.constraintlayout.motion.utils.ArcCurveFit.Arc.ourPercent = r0
                return
        }

        Arc(int r15, double r16, double r18, double r20, double r22, double r24, double r26) {
                r14 = this;
                r0 = r16
                r2 = r18
                r14.<init>()
                r4 = 0
                r14.linear = r4
                r5 = 1
                if (r15 != r5) goto Le
                r4 = 1
            Le:
                r14.mVertical = r4
                r14.mTime1 = r0
                r14.mTime2 = r2
                r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r0 = r2 - r0
                double r6 = r6 / r0
                r14.mOneOverDeltaTime = r6
                r0 = 3
                if (r0 != r15) goto L20
                r14.linear = r5
            L20:
                double r0 = r24 - r20
                double r2 = r26 - r22
                boolean r15 = r14.linear
                if (r15 != 0) goto L3d
                double r6 = java.lang.Math.abs(r0)
                r8 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r15 < 0) goto L3d
                double r6 = java.lang.Math.abs(r2)
                int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r15 >= 0) goto L46
            L3d:
                r6 = r20
                r8 = r22
                r10 = r24
                r12 = r26
                goto L89
            L46:
                r15 = 101(0x65, float:1.42E-43)
                double[] r15 = new double[r15]
                r14.mLut = r15
                boolean r15 = r14.mVertical
                r4 = -1
                if (r15 == 0) goto L53
                r6 = -1
                goto L54
            L53:
                r6 = 1
            L54:
                double r6 = (double) r6
                double r0 = r0 * r6
                r14.mEllipseA = r0
                if (r15 == 0) goto L5c
                goto L5d
            L5c:
                r5 = -1
            L5d:
                double r0 = (double) r5
                double r2 = r2 * r0
                r14.mEllipseB = r2
                if (r15 == 0) goto L67
                r0 = r24
                goto L69
            L67:
                r0 = r20
            L69:
                r14.mEllipseCenterX = r0
                if (r15 == 0) goto L70
                r0 = r22
                goto L72
            L70:
                r0 = r26
            L72:
                r14.mEllipseCenterY = r0
                r0 = r14
                r1 = r20
                r3 = r22
                r5 = r24
                r7 = r26
                r0.buildTable(r1, r3, r5, r7)
                double r0 = r14.mArcDistance
                double r2 = r14.mOneOverDeltaTime
                double r0 = r0 * r2
                r14.mArcVelocity = r0
                return
            L89:
                r14.linear = r5
                r14.mX1 = r6
                r14.mX2 = r10
                r14.mY1 = r8
                r14.mY2 = r12
                double r4 = java.lang.Math.hypot(r2, r0)
                r14.mArcDistance = r4
                double r6 = r14.mOneOverDeltaTime
                double r4 = r4 * r6
                r14.mArcVelocity = r4
                double r4 = r14.mTime2
                double r6 = r14.mTime1
                double r8 = r4 - r6
                double r0 = r0 / r8
                r14.mEllipseCenterX = r0
                double r4 = r4 - r6
                double r2 = r2 / r4
                r14.mEllipseCenterY = r2
                return
        }

        private void buildTable(double r17, double r19, double r21, double r23) {
                r16 = this;
                r0 = r16
                double r1 = r21 - r17
                double r3 = r19 - r23
                r8 = 0
                r9 = 0
                r11 = 0
                r13 = 0
            Ld:
                double[] r15 = androidx.constraintlayout.motion.utils.ArcCurveFit.Arc.ourPercent
                r17 = 0
                int r5 = r15.length
                if (r8 >= r5) goto L49
                r19 = 4636033603912859648(0x4056800000000000, double:90.0)
                double r5 = (double) r8
                double r5 = r5 * r19
                int r15 = r15.length
                int r15 = r15 + (-1)
                r20 = r8
                double r7 = (double) r15
                double r5 = r5 / r7
                double r5 = java.lang.Math.toRadians(r5)
                double r7 = java.lang.Math.sin(r5)
                double r5 = java.lang.Math.cos(r5)
                double r7 = r7 * r1
                double r5 = r5 * r3
                if (r20 <= 0) goto L42
                double r11 = r7 - r11
                double r13 = r5 - r13
                double r11 = java.lang.Math.hypot(r11, r13)
                double r9 = r9 + r11
                double[] r11 = androidx.constraintlayout.motion.utils.ArcCurveFit.Arc.ourPercent
                r11[r20] = r9
            L42:
                int r11 = r20 + 1
                r13 = r7
                r8 = r11
                r11 = r13
                r13 = r5
                goto Ld
            L49:
                r0.mArcDistance = r9
                r1 = 0
            L4c:
                double[] r2 = androidx.constraintlayout.motion.utils.ArcCurveFit.Arc.ourPercent
                int r3 = r2.length
                if (r1 >= r3) goto L59
                r3 = r2[r1]
                double r3 = r3 / r9
                r2[r1] = r3
                int r1 = r1 + 1
                goto L4c
            L59:
                r7 = 0
            L5a:
                double[] r1 = r0.mLut
                int r2 = r1.length
                if (r7 >= r2) goto L9d
                double r2 = (double) r7
                int r1 = r1.length
                int r1 = r1 + (-1)
                double r4 = (double) r1
                double r2 = r2 / r4
                double[] r1 = androidx.constraintlayout.motion.utils.ArcCurveFit.Arc.ourPercent
                int r1 = java.util.Arrays.binarySearch(r1, r2)
                if (r1 < 0) goto L79
                double[] r2 = r0.mLut
                double[] r3 = androidx.constraintlayout.motion.utils.ArcCurveFit.Arc.ourPercent
                int r3 = r3.length
                int r3 = r3 + (-1)
                int r1 = r1 / r3
                double r3 = (double) r1
                r2[r7] = r3
                goto L9a
            L79:
                r4 = -1
                if (r1 != r4) goto L81
                double[] r1 = r0.mLut
                r1[r7] = r17
                goto L9a
            L81:
                int r1 = -r1
                int r4 = r1 + (-2)
                int r1 = r1 + (-1)
                double r5 = (double) r4
                double[] r8 = androidx.constraintlayout.motion.utils.ArcCurveFit.Arc.ourPercent
                r9 = r8[r4]
                double r2 = r2 - r9
                r11 = r8[r1]
                double r11 = r11 - r9
                double r2 = r2 / r11
                double r5 = r5 + r2
                int r1 = r8.length
                int r1 = r1 + (-1)
                double r1 = (double) r1
                double r5 = r5 / r1
                double[] r1 = r0.mLut
                r1[r7] = r5
            L9a:
                int r7 = r7 + 1
                goto L5a
            L9d:
                return
        }

        double getDX() {
                r6 = this;
                double r0 = r6.mEllipseA
                double r2 = r6.mTmpCosAngle
                double r0 = r0 * r2
                double r2 = r6.mEllipseB
                double r2 = -r2
                double r4 = r6.mTmpSinAngle
                double r2 = r2 * r4
                double r4 = r6.mArcVelocity
                double r2 = java.lang.Math.hypot(r0, r2)
                double r4 = r4 / r2
                boolean r2 = r6.mVertical
                if (r2 == 0) goto L1c
                double r0 = -r0
                double r0 = r0 * r4
                return r0
            L1c:
                double r0 = r0 * r4
                return r0
        }

        double getDY() {
                r6 = this;
                double r0 = r6.mEllipseA
                double r2 = r6.mTmpCosAngle
                double r0 = r0 * r2
                double r2 = r6.mEllipseB
                double r2 = -r2
                double r4 = r6.mTmpSinAngle
                double r2 = r2 * r4
                double r4 = r6.mArcVelocity
                double r0 = java.lang.Math.hypot(r0, r2)
                double r4 = r4 / r0
                boolean r0 = r6.mVertical
                if (r0 == 0) goto L1c
                double r0 = -r2
                double r0 = r0 * r4
                return r0
            L1c:
                double r2 = r2 * r4
                return r2
        }

        public double getLinearDX(double r1) {
                r0 = this;
                double r1 = r0.mEllipseCenterX
                return r1
        }

        public double getLinearDY(double r1) {
                r0 = this;
                double r1 = r0.mEllipseCenterY
                return r1
        }

        public double getLinearX(double r5) {
                r4 = this;
                double r0 = r4.mTime1
                double r5 = r5 - r0
                double r0 = r4.mOneOverDeltaTime
                double r5 = r5 * r0
                double r0 = r4.mX1
                double r2 = r4.mX2
                double r2 = r2 - r0
                double r5 = r5 * r2
                double r0 = r0 + r5
                return r0
        }

        public double getLinearY(double r5) {
                r4 = this;
                double r0 = r4.mTime1
                double r5 = r5 - r0
                double r0 = r4.mOneOverDeltaTime
                double r5 = r5 * r0
                double r0 = r4.mY1
                double r2 = r4.mY2
                double r2 = r2 - r0
                double r5 = r5 * r2
                double r0 = r0 + r5
                return r0
        }

        double getX() {
                r6 = this;
                double r0 = r6.mEllipseCenterX
                double r2 = r6.mEllipseA
                double r4 = r6.mTmpSinAngle
                double r2 = r2 * r4
                double r0 = r0 + r2
                return r0
        }

        double getY() {
                r6 = this;
                double r0 = r6.mEllipseCenterY
                double r2 = r6.mEllipseB
                double r4 = r6.mTmpCosAngle
                double r2 = r2 * r4
                double r0 = r0 + r2
                return r0
        }

        double lookup(double r7) {
                r6 = this;
                r0 = 0
                int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r2 > 0) goto L7
                return r0
            L7:
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r2 < 0) goto Le
                return r0
            Le:
                double[] r0 = r6.mLut
                int r1 = r0.length
                int r1 = r1 + (-1)
                double r1 = (double) r1
                double r7 = r7 * r1
                int r1 = (int) r7
                double r2 = (double) r1
                double r7 = r7 - r2
                r2 = r0[r1]
                int r1 = r1 + 1
                r4 = r0[r1]
                double r4 = r4 - r2
                double r7 = r7 * r4
                double r2 = r2 + r7
                return r2
        }

        void setPoint(double r3) {
                r2 = this;
                boolean r0 = r2.mVertical
                if (r0 == 0) goto L8
                double r0 = r2.mTime2
                double r0 = r0 - r3
                goto Lc
            L8:
                double r0 = r2.mTime1
                double r0 = r3 - r0
            Lc:
                double r3 = r2.mOneOverDeltaTime
                double r0 = r0 * r3
                r3 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
                double r0 = r2.lookup(r0)
                double r0 = r0 * r3
                double r3 = java.lang.Math.sin(r0)
                r2.mTmpSinAngle = r3
                double r3 = java.lang.Math.cos(r0)
                r2.mTmpCosAngle = r3
                return
        }
    }

    public ArcCurveFit(int[] r24, double[] r25, double[][] r26) {
            r23 = this;
            r0 = r23
            r1 = r25
            r0.<init>()
            r0.mTime = r1
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r2 = new androidx.constraintlayout.motion.utils.ArcCurveFit.Arc[r2]
            r0.mArcs = r2
            r2 = 0
            r4 = 0
            r5 = 1
            r6 = 1
        L14:
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r7 = r0.mArcs
            int r8 = r7.length
            if (r4 >= r8) goto L56
            r8 = r24[r4]
            r9 = 3
            if (r8 == 0) goto L33
            if (r8 == r3) goto L31
            r10 = 2
            if (r8 == r10) goto L2e
            if (r8 == r9) goto L27
            r9 = r6
            goto L33
        L27:
            if (r5 != r3) goto L2b
            r5 = 2
            goto L2c
        L2b:
            r5 = 1
        L2c:
            r9 = r5
            goto L33
        L2e:
            r5 = 2
            r9 = 2
            goto L33
        L31:
            r5 = 1
            r9 = 1
        L33:
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc r8 = new androidx.constraintlayout.motion.utils.ArcCurveFit$Arc
            r10 = r1[r4]
            int r6 = r4 + 1
            r12 = r1[r6]
            r14 = r26[r4]
            r15 = r14[r2]
            r17 = r14[r3]
            r14 = r26[r6]
            r19 = r14[r2]
            r21 = r14[r3]
            r14 = r15
            r16 = r17
            r18 = r19
            r20 = r21
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r8
            r4 = r6
            r6 = r9
            goto L14
        L56:
            return
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public double getPos(double r6, int r8) {
            r5 = this;
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r0 = r5.mArcs
            r1 = 0
            r2 = r0[r1]
            double r2 = r2.mTime1
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 >= 0) goto Ld
            r6 = r2
            goto L1f
        Ld:
            int r2 = r0.length
            int r2 = r2 + (-1)
            r2 = r0[r2]
            double r2 = r2.mTime2
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1f
            int r6 = r0.length
            int r6 = r6 + (-1)
            r6 = r0[r6]
            double r6 = r6.mTime2
        L1f:
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r0 = r5.mArcs
            int r2 = r0.length
            if (r1 >= r2) goto L56
            r0 = r0[r1]
            double r2 = r0.mTime2
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 > 0) goto L53
            boolean r2 = r0.linear
            if (r2 == 0) goto L3c
            if (r8 != 0) goto L37
            double r6 = r0.getLinearX(r6)
            return r6
        L37:
            double r6 = r0.getLinearY(r6)
            return r6
        L3c:
            r0.setPoint(r6)
            if (r8 != 0) goto L4a
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r6 = r5.mArcs
            r6 = r6[r1]
            double r6 = r6.getX()
            return r6
        L4a:
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r6 = r5.mArcs
            r6 = r6[r1]
            double r6 = r6.getY()
            return r6
        L53:
            int r1 = r1 + 1
            goto L1f
        L56:
            r6 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r6
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public void getPos(double r8, double[] r10) {
            r7 = this;
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r0 = r7.mArcs
            r1 = 0
            r2 = r0[r1]
            double r2 = r2.mTime1
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lc
            r8 = r2
        Lc:
            int r2 = r0.length
            r3 = 1
            int r2 = r2 - r3
            r2 = r0[r2]
            double r4 = r2.mTime2
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 <= 0) goto L1d
            int r8 = r0.length
            int r8 = r8 - r3
            r8 = r0[r8]
            double r8 = r8.mTime2
        L1d:
            r0 = 0
        L1e:
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r2 = r7.mArcs
            int r4 = r2.length
            if (r0 >= r4) goto L5b
            r2 = r2[r0]
            double r4 = r2.mTime2
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L58
            boolean r4 = r2.linear
            if (r4 == 0) goto L40
            double r4 = r2.getLinearX(r8)
            r10[r1] = r4
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r1 = r7.mArcs
            r0 = r1[r0]
            double r8 = r0.getLinearY(r8)
            r10[r3] = r8
            return
        L40:
            r2.setPoint(r8)
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r8 = r7.mArcs
            r8 = r8[r0]
            double r8 = r8.getX()
            r10[r1] = r8
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r8 = r7.mArcs
            r8 = r8[r0]
            double r8 = r8.getY()
            r10[r3] = r8
            return
        L58:
            int r0 = r0 + 1
            goto L1e
        L5b:
            return
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public void getPos(double r8, float[] r10) {
            r7 = this;
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r0 = r7.mArcs
            r1 = 0
            r2 = r0[r1]
            double r2 = r2.mTime1
            r4 = 1
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 >= 0) goto Le
            r8 = r2
            goto L1e
        Le:
            int r2 = r0.length
            int r2 = r2 - r4
            r2 = r0[r2]
            double r2 = r2.mTime2
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 <= 0) goto L1e
            int r8 = r0.length
            int r8 = r8 - r4
            r8 = r0[r8]
            double r8 = r8.mTime2
        L1e:
            r0 = 0
        L1f:
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r2 = r7.mArcs
            int r3 = r2.length
            if (r0 >= r3) goto L60
            r2 = r2[r0]
            double r5 = r2.mTime2
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 > 0) goto L5d
            boolean r3 = r2.linear
            if (r3 == 0) goto L43
            double r2 = r2.getLinearX(r8)
            float r2 = (float) r2
            r10[r1] = r2
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r1 = r7.mArcs
            r0 = r1[r0]
            double r8 = r0.getLinearY(r8)
            float r8 = (float) r8
            r10[r4] = r8
            return
        L43:
            r2.setPoint(r8)
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r8 = r7.mArcs
            r8 = r8[r0]
            double r8 = r8.getX()
            float r8 = (float) r8
            r10[r1] = r8
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r8 = r7.mArcs
            r8 = r8[r0]
            double r8 = r8.getY()
            float r8 = (float) r8
            r10[r4] = r8
            return
        L5d:
            int r0 = r0 + 1
            goto L1f
        L60:
            return
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public double getSlope(double r6, int r8) {
            r5 = this;
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r0 = r5.mArcs
            r1 = 0
            r2 = r0[r1]
            double r2 = r2.mTime1
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lc
            r6 = r2
        Lc:
            int r2 = r0.length
            int r2 = r2 + (-1)
            r2 = r0[r2]
            double r2 = r2.mTime2
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1e
            int r6 = r0.length
            int r6 = r6 + (-1)
            r6 = r0[r6]
            double r6 = r6.mTime2
        L1e:
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r0 = r5.mArcs
            int r2 = r0.length
            if (r1 >= r2) goto L55
            r0 = r0[r1]
            double r2 = r0.mTime2
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 > 0) goto L52
            boolean r2 = r0.linear
            if (r2 == 0) goto L3b
            if (r8 != 0) goto L36
            double r6 = r0.getLinearDX(r6)
            return r6
        L36:
            double r6 = r0.getLinearDY(r6)
            return r6
        L3b:
            r0.setPoint(r6)
            if (r8 != 0) goto L49
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r6 = r5.mArcs
            r6 = r6[r1]
            double r6 = r6.getDX()
            return r6
        L49:
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r6 = r5.mArcs
            r6 = r6[r1]
            double r6 = r6.getDY()
            return r6
        L52:
            int r1 = r1 + 1
            goto L1e
        L55:
            r6 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r6
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public void getSlope(double r8, double[] r10) {
            r7 = this;
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r0 = r7.mArcs
            r1 = 0
            r2 = r0[r1]
            double r2 = r2.mTime1
            r4 = 1
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 >= 0) goto Le
            r8 = r2
            goto L1e
        Le:
            int r2 = r0.length
            int r2 = r2 - r4
            r2 = r0[r2]
            double r2 = r2.mTime2
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 <= 0) goto L1e
            int r8 = r0.length
            int r8 = r8 - r4
            r8 = r0[r8]
            double r8 = r8.mTime2
        L1e:
            r0 = 0
        L1f:
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r2 = r7.mArcs
            int r3 = r2.length
            if (r0 >= r3) goto L5c
            r2 = r2[r0]
            double r5 = r2.mTime2
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 > 0) goto L59
            boolean r3 = r2.linear
            if (r3 == 0) goto L41
            double r2 = r2.getLinearDX(r8)
            r10[r1] = r2
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r1 = r7.mArcs
            r0 = r1[r0]
            double r8 = r0.getLinearDY(r8)
            r10[r4] = r8
            return
        L41:
            r2.setPoint(r8)
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r8 = r7.mArcs
            r8 = r8[r0]
            double r8 = r8.getDX()
            r10[r1] = r8
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r8 = r7.mArcs
            r8 = r8[r0]
            double r8 = r8.getDY()
            r10[r4] = r8
            return
        L59:
            int r0 = r0 + 1
            goto L1f
        L5c:
            return
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public double[] getTimePoints() {
            r1 = this;
            double[] r0 = r1.mTime
            return r0
    }
}
