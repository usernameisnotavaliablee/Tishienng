package androidx.constraintlayout.motion.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Oscillator {
    public static final int BOUNCE = 6;
    public static final int COS_WAVE = 5;
    public static final int REVERSE_SAW_WAVE = 4;
    public static final int SAW_WAVE = 3;
    public static final int SIN_WAVE = 0;
    public static final int SQUARE_WAVE = 1;
    public static java.lang.String TAG = "Oscillator";
    public static final int TRIANGLE_WAVE = 2;
    double PI2;
    double[] mArea;
    private boolean mNormalized;
    float[] mPeriod;
    double[] mPosition;
    int mType;

    static {
            return
    }

    public Oscillator() {
            r3 = this;
            r3.<init>()
            r0 = 0
            float[] r1 = new float[r0]
            r3.mPeriod = r1
            double[] r1 = new double[r0]
            r3.mPosition = r1
            r1 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            r3.PI2 = r1
            r3.mNormalized = r0
            return
    }

    public void addPoint(double r5, float r7) {
            r4 = this;
            float[] r0 = r4.mPeriod
            int r0 = r0.length
            int r0 = r0 + 1
            double[] r1 = r4.mPosition
            int r1 = java.util.Arrays.binarySearch(r1, r5)
            if (r1 >= 0) goto L10
            int r1 = -r1
            int r1 = r1 + (-1)
        L10:
            double[] r2 = r4.mPosition
            double[] r2 = java.util.Arrays.copyOf(r2, r0)
            r4.mPosition = r2
            float[] r2 = r4.mPeriod
            float[] r2 = java.util.Arrays.copyOf(r2, r0)
            r4.mPeriod = r2
            double[] r2 = new double[r0]
            r4.mArea = r2
            double[] r2 = r4.mPosition
            int r3 = r1 + 1
            int r0 = r0 - r1
            int r0 = r0 + (-1)
            java.lang.System.arraycopy(r2, r1, r2, r3, r0)
            double[] r0 = r4.mPosition
            r0[r1] = r5
            float[] r5 = r4.mPeriod
            r5[r1] = r7
            r5 = 0
            r4.mNormalized = r5
            return
    }

    double getDP(double r9) {
            r8 = this;
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 > 0) goto Lc
            r9 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            goto L17
        Lc:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 < 0) goto L17
            r9 = 4607182409792818153(0x3feffffde7210be9, double:0.999999)
        L17:
            double[] r2 = r8.mPosition
            int r2 = java.util.Arrays.binarySearch(r2, r9)
            if (r2 <= 0) goto L20
            return r0
        L20:
            if (r2 == 0) goto L3f
            int r0 = -r2
            int r1 = r0 + (-1)
            float[] r2 = r8.mPeriod
            r3 = r2[r1]
            int r0 = r0 + (-2)
            r2 = r2[r0]
            float r3 = r3 - r2
            double r3 = (double) r3
            double[] r5 = r8.mPosition
            r6 = r5[r1]
            r0 = r5[r0]
            double r6 = r6 - r0
            double r3 = r3 / r6
            double r9 = r9 * r3
            double r5 = (double) r2
            double r3 = r3 * r0
            double r5 = r5 - r3
            double r9 = r9 + r5
            return r9
        L3f:
            return r0
    }

    double getP(double r13) {
            r12 = this;
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2 = 0
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 >= 0) goto La
            r13 = r2
            goto Lf
        La:
            int r4 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r4 <= 0) goto Lf
            r13 = r0
        Lf:
            double[] r4 = r12.mPosition
            int r4 = java.util.Arrays.binarySearch(r4, r13)
            if (r4 <= 0) goto L18
            return r0
        L18:
            if (r4 == 0) goto L48
            int r0 = -r4
            int r1 = r0 + (-1)
            float[] r2 = r12.mPeriod
            r3 = r2[r1]
            int r0 = r0 + (-2)
            r2 = r2[r0]
            float r3 = r3 - r2
            double r3 = (double) r3
            double[] r5 = r12.mPosition
            r6 = r5[r1]
            r8 = r5[r0]
            double r6 = r6 - r8
            double r3 = r3 / r6
            double[] r1 = r12.mArea
            r0 = r1[r0]
            double r5 = (double) r2
            double r10 = r3 * r8
            double r5 = r5 - r10
            double r10 = r13 - r8
            double r5 = r5 * r10
            double r0 = r0 + r5
            double r13 = r13 * r13
            double r8 = r8 * r8
            double r13 = r13 - r8
            double r3 = r3 * r13
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = r3 / r13
            double r0 = r0 + r3
            return r0
        L48:
            return r2
    }

    public double getSlope(double r10) {
            r9 = this;
            int r0 = r9.mType
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            r3 = 4616189618054758400(0x4010000000000000, double:4.0)
            switch(r0) {
                case 1: goto L6b;
                case 2: goto L55;
                case 3: goto L50;
                case 4: goto L48;
                case 5: goto L32;
                case 6: goto L20;
                default: goto L9;
            }
        L9:
            double r0 = r9.PI2
            double r2 = r9.getDP(r10)
            double r0 = r0 * r2
            double r2 = r9.PI2
            double r10 = r9.getP(r10)
            double r2 = r2 * r10
            double r10 = java.lang.Math.cos(r2)
        L1d:
            double r0 = r0 * r10
            return r0
        L20:
            double r5 = r9.getDP(r10)
            double r5 = r5 * r3
            double r10 = r9.getP(r10)
            double r10 = r10 * r3
            double r10 = r10 + r1
            double r10 = r10 % r3
            double r10 = r10 - r1
        L2f:
            double r5 = r5 * r10
            return r5
        L32:
            double r0 = r9.PI2
            double r0 = -r0
            double r2 = r9.getDP(r10)
            double r0 = r0 * r2
            double r2 = r9.PI2
            double r10 = r9.getP(r10)
            double r2 = r2 * r10
            double r10 = java.lang.Math.sin(r2)
            goto L1d
        L48:
            double r10 = r9.getDP(r10)
            double r10 = -r10
        L4d:
            double r10 = r10 * r1
            return r10
        L50:
            double r10 = r9.getDP(r10)
            goto L4d
        L55:
            double r5 = r9.getDP(r10)
            double r5 = r5 * r3
            double r10 = r9.getP(r10)
            double r10 = r10 * r3
            r7 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r10 = r10 + r7
            double r10 = r10 % r3
            double r10 = r10 - r1
            double r10 = java.lang.Math.signum(r10)
            goto L2f
        L6b:
            r10 = 0
            return r10
    }

    public double getValue(double r8) {
            r7 = this;
            int r0 = r7.mType
            r1 = 4616189618054758400(0x4010000000000000, double:4.0)
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            switch(r0) {
                case 1: goto L58;
                case 2: goto L4a;
                case 3: goto L40;
                case 4: goto L37;
                case 5: goto L2a;
                case 6: goto L18;
                default: goto Lb;
            }
        Lb:
            double r0 = r7.PI2
            double r8 = r7.getP(r8)
            double r0 = r0 * r8
            double r8 = java.lang.Math.sin(r0)
            return r8
        L18:
            double r8 = r7.getP(r8)
            double r8 = r8 * r1
            double r8 = r8 % r1
            double r8 = r8 - r3
            double r8 = java.lang.Math.abs(r8)
            double r8 = r5 - r8
            double r8 = r8 * r8
        L28:
            double r5 = r5 - r8
            return r5
        L2a:
            double r0 = r7.PI2
            double r8 = r7.getP(r8)
            double r0 = r0 * r8
            double r8 = java.lang.Math.cos(r0)
            return r8
        L37:
            double r8 = r7.getP(r8)
            double r8 = r8 * r3
            double r8 = r8 + r5
            double r8 = r8 % r3
            goto L28
        L40:
            double r8 = r7.getP(r8)
            double r8 = r8 * r3
            double r8 = r8 + r5
            double r8 = r8 % r3
            double r8 = r8 - r5
            return r8
        L4a:
            double r8 = r7.getP(r8)
            double r8 = r8 * r1
            double r8 = r8 + r5
            double r8 = r8 % r1
            double r8 = r8 - r3
            double r8 = java.lang.Math.abs(r8)
            goto L28
        L58:
            double r8 = r7.getP(r8)
            double r8 = r8 % r5
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = r0 - r8
            double r8 = java.lang.Math.signum(r0)
            return r8
    }

    public void normalize() {
            r17 = this;
            r0 = r17
            r1 = 0
            r3 = 0
            r5 = r1
            r4 = 0
        L7:
            float[] r7 = r0.mPeriod
            int r8 = r7.length
            if (r4 >= r8) goto L13
            r7 = r7[r4]
            double r7 = (double) r7
            double r5 = r5 + r7
            int r4 = r4 + 1
            goto L7
        L13:
            r4 = 1
            r8 = r1
            r7 = 1
        L16:
            float[] r10 = r0.mPeriod
            int r11 = r10.length
            r12 = 1073741824(0x40000000, float:2.0)
            if (r7 >= r11) goto L33
            int r11 = r7 + (-1)
            r13 = r10[r11]
            r10 = r10[r7]
            float r13 = r13 + r10
            float r13 = r13 / r12
            double[] r10 = r0.mPosition
            r14 = r10[r7]
            r11 = r10[r11]
            double r14 = r14 - r11
            double r10 = (double) r13
            double r14 = r14 * r10
            double r8 = r8 + r14
            int r7 = r7 + 1
            goto L16
        L33:
            r7 = 0
        L34:
            float[] r10 = r0.mPeriod
            int r11 = r10.length
            if (r7 >= r11) goto L46
            r11 = r10[r7]
            double r13 = (double) r11
            double r15 = r5 / r8
            double r13 = r13 * r15
            float r11 = (float) r13
            r10[r7] = r11
            int r7 = r7 + 1
            goto L34
        L46:
            double[] r5 = r0.mArea
            r5[r3] = r1
            r1 = 1
        L4b:
            float[] r2 = r0.mPeriod
            int r3 = r2.length
            if (r1 >= r3) goto L6c
            int r3 = r1 + (-1)
            r5 = r2[r3]
            r2 = r2[r1]
            float r5 = r5 + r2
            float r5 = r5 / r12
            double[] r2 = r0.mPosition
            r6 = r2[r1]
            r8 = r2[r3]
            double r6 = r6 - r8
            double[] r2 = r0.mArea
            r8 = r2[r3]
            double r10 = (double) r5
            double r6 = r6 * r10
            double r8 = r8 + r6
            r2[r1] = r8
            int r1 = r1 + 1
            goto L4b
        L6c:
            r0.mNormalized = r4
            return
    }

    public void setType(int r1) {
            r0 = this;
            r0.mType = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "pos ="
            r0.append(r1)
            double[] r1 = r2.mPosition
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = " period="
            r0.append(r1)
            float[] r1 = r2.mPeriod
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
