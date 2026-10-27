package androidx.constraintlayout.motion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class KeyCycleOscillator {
    private static final java.lang.String TAG = "KeyCycleOscillator";
    private androidx.constraintlayout.motion.utils.CurveFit mCurveFit;
    protected androidx.constraintlayout.widget.ConstraintAttribute mCustom;
    private androidx.constraintlayout.motion.widget.KeyCycleOscillator.CycleOscillator mCycleOscillator;
    private java.lang.String mType;
    public int mVariesBy;
    java.util.ArrayList<androidx.constraintlayout.motion.widget.KeyCycleOscillator.WavePoint> mWavePoints;
    private int mWaveShape;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class AlphaSet extends androidx.constraintlayout.motion.widget.KeyCycleOscillator {
        AlphaSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setAlpha(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class CustomSet extends androidx.constraintlayout.motion.widget.KeyCycleOscillator {
        float[] value;

        CustomSet() {
                r1 = this;
                r1.<init>()
                r0 = 1
                float[] r0 = new float[r0]
                r1.value = r0
                return
        }

        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(android.view.View r3, float r4) {
                r2 = this;
                float[] r0 = r2.value
                r1 = 0
                float r4 = r2.get(r4)
                r0[r1] = r4
                androidx.constraintlayout.widget.ConstraintAttribute r4 = r2.mCustom
                float[] r0 = r2.value
                r4.setInterpolatedValue(r3, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class CycleOscillator {
        private static final java.lang.String TAG = "CycleOscillator";
        static final int UNSET = -1;
        androidx.constraintlayout.motion.utils.CurveFit mCurveFit;
        public java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> mCustomConstraints;
        float[] mOffset;
        androidx.constraintlayout.motion.utils.Oscillator mOscillator;
        float mPathLength;
        float[] mPeriod;
        double[] mPosition;
        float[] mScale;
        double[] mSplineSlopeCache;
        double[] mSplineValueCache;
        float[] mValues;
        private final int mVariesBy;
        int mWaveShape;

        CycleOscillator(int r2, int r3, int r4) {
                r1 = this;
                r1.<init>()
                androidx.constraintlayout.motion.utils.Oscillator r0 = new androidx.constraintlayout.motion.utils.Oscillator
                r0.<init>()
                r1.mOscillator = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mCustomConstraints = r0
                r1.mWaveShape = r2
                r1.mVariesBy = r3
                androidx.constraintlayout.motion.utils.Oscillator r3 = r1.mOscillator
                r3.setType(r2)
                float[] r2 = new float[r4]
                r1.mValues = r2
                double[] r2 = new double[r4]
                r1.mPosition = r2
                float[] r2 = new float[r4]
                r1.mPeriod = r2
                float[] r2 = new float[r4]
                r1.mOffset = r2
                float[] r2 = new float[r4]
                r1.mScale = r2
                return
        }

        private androidx.constraintlayout.widget.ConstraintAttribute get(java.lang.String r3, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType r4) {
                r2 = this;
                java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r2.mCustomConstraints
                boolean r0 = r0.containsKey(r3)
                if (r0 == 0) goto L36
                java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r2.mCustomConstraints
                java.lang.Object r3 = r0.get(r3)
                androidx.constraintlayout.widget.ConstraintAttribute r3 = (androidx.constraintlayout.widget.ConstraintAttribute) r3
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = r3.getType()
                if (r0 != r4) goto L17
                return r3
            L17:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ConstraintAttribute is already a "
                r0.append(r1)
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = r3.getType()
                java.lang.String r3 = r3.name()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
            L36:
                androidx.constraintlayout.widget.ConstraintAttribute r0 = new androidx.constraintlayout.widget.ConstraintAttribute
                r0.<init>(r3, r4)
                java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r4 = r2.mCustomConstraints
                r4.put(r3, r0)
                return r0
        }

        public double getSlope(float r10) {
                r9 = this;
                androidx.constraintlayout.motion.utils.CurveFit r0 = r9.mCurveFit
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L14
                double r3 = (double) r10
                double[] r5 = r9.mSplineSlopeCache
                r0.getSlope(r3, r5)
                androidx.constraintlayout.motion.utils.CurveFit r0 = r9.mCurveFit
                double[] r5 = r9.mSplineValueCache
                r0.getPos(r3, r5)
                goto L1c
            L14:
                double[] r0 = r9.mSplineSlopeCache
                r3 = 0
                r0[r1] = r3
                r0[r2] = r3
            L1c:
                androidx.constraintlayout.motion.utils.Oscillator r0 = r9.mOscillator
                double r3 = (double) r10
                double r5 = r0.getValue(r3)
                androidx.constraintlayout.motion.utils.Oscillator r10 = r9.mOscillator
                double r3 = r10.getSlope(r3)
                double[] r10 = r9.mSplineSlopeCache
                r0 = r10[r1]
                r7 = r10[r2]
                double r5 = r5 * r7
                double r0 = r0 + r5
                double[] r10 = r9.mSplineValueCache
                r5 = r10[r2]
                double r3 = r3 * r5
                double r0 = r0 + r3
                return r0
        }

        public double getValues(float r7) {
                r6 = this;
                androidx.constraintlayout.motion.utils.CurveFit r0 = r6.mCurveFit
                r1 = 1
                r2 = 0
                if (r0 == 0) goto Ld
                double r3 = (double) r7
                double[] r5 = r6.mSplineValueCache
                r0.getPos(r3, r5)
                goto L1d
            Ld:
                double[] r0 = r6.mSplineValueCache
                float[] r3 = r6.mOffset
                r3 = r3[r2]
                double r3 = (double) r3
                r0[r2] = r3
                float[] r3 = r6.mValues
                r3 = r3[r2]
                double r3 = (double) r3
                r0[r1] = r3
            L1d:
                double[] r0 = r6.mSplineValueCache
                r2 = r0[r2]
                androidx.constraintlayout.motion.utils.Oscillator r0 = r6.mOscillator
                double r4 = (double) r7
                double r4 = r0.getValue(r4)
                double[] r7 = r6.mSplineValueCache
                r0 = r7[r1]
                double r4 = r4 * r0
                double r2 = r2 + r4
                return r2
        }

        public void setPoint(int r6, int r7, float r8, float r9, float r10) {
                r5 = this;
                double[] r0 = r5.mPosition
                double r1 = (double) r7
                r3 = 4636737291354636288(0x4059000000000000, double:100.0)
                double r1 = r1 / r3
                r0[r6] = r1
                float[] r7 = r5.mPeriod
                r7[r6] = r8
                float[] r7 = r5.mOffset
                r7[r6] = r9
                float[] r7 = r5.mValues
                r7[r6] = r10
                return
        }

        public void setup(float r9) {
                r8 = this;
                r8.mPathLength = r9
                double[] r9 = r8.mPosition
                int r9 = r9.length
                r0 = 2
                int[] r1 = new int[r0]
                r2 = 1
                r1[r2] = r0
                r0 = 0
                r1[r0] = r9
                java.lang.Class r9 = java.lang.Double.TYPE
                java.lang.Object r9 = java.lang.reflect.Array.newInstance(r9, r1)
                double[][] r9 = (double[][]) r9
                float[] r1 = r8.mValues
                int r3 = r1.length
                int r3 = r3 + r2
                double[] r3 = new double[r3]
                r8.mSplineValueCache = r3
                int r1 = r1.length
                int r1 = r1 + r2
                double[] r1 = new double[r1]
                r8.mSplineSlopeCache = r1
                double[] r1 = r8.mPosition
                r3 = r1[r0]
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 <= 0) goto L37
                androidx.constraintlayout.motion.utils.Oscillator r1 = r8.mOscillator
                float[] r3 = r8.mPeriod
                r3 = r3[r0]
                r1.addPoint(r5, r3)
            L37:
                double[] r1 = r8.mPosition
                int r3 = r1.length
                int r3 = r3 - r2
                r4 = r1[r3]
                r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 >= 0) goto L4c
                androidx.constraintlayout.motion.utils.Oscillator r1 = r8.mOscillator
                float[] r4 = r8.mPeriod
                r3 = r4[r3]
                r1.addPoint(r6, r3)
            L4c:
                r1 = 0
            L4d:
                int r3 = r9.length
                if (r1 >= r3) goto L79
                r3 = r9[r1]
                float[] r4 = r8.mOffset
                r4 = r4[r1]
                double r4 = (double) r4
                r3[r0] = r4
                r3 = 0
            L5a:
                float[] r4 = r8.mValues
                int r5 = r4.length
                if (r3 >= r5) goto L69
                r5 = r9[r3]
                r4 = r4[r3]
                double r6 = (double) r4
                r5[r2] = r6
                int r3 = r3 + 1
                goto L5a
            L69:
                androidx.constraintlayout.motion.utils.Oscillator r3 = r8.mOscillator
                double[] r4 = r8.mPosition
                r5 = r4[r1]
                float[] r4 = r8.mPeriod
                r4 = r4[r1]
                r3.addPoint(r5, r4)
                int r1 = r1 + 1
                goto L4d
            L79:
                androidx.constraintlayout.motion.utils.Oscillator r1 = r8.mOscillator
                r1.normalize()
                double[] r1 = r8.mPosition
                int r3 = r1.length
                if (r3 <= r2) goto L8a
                androidx.constraintlayout.motion.utils.CurveFit r9 = androidx.constraintlayout.motion.utils.CurveFit.get(r0, r1, r9)
                r8.mCurveFit = r9
                return
            L8a:
                r9 = 0
                r8.mCurveFit = r9
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ElevationSet extends androidx.constraintlayout.motion.widget.KeyCycleOscillator {
        ElevationSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setElevation(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class IntDoubleSort {
        private IntDoubleSort() {
                r0 = this;
                r0.<init>()
                return
        }

        private static int partition(int[] r3, float[] r4, int r5, int r6) {
                r0 = r3[r6]
                r1 = r5
            L3:
                if (r5 >= r6) goto L11
                r2 = r3[r5]
                if (r2 > r0) goto Le
                swap(r3, r4, r1, r5)
                int r1 = r1 + 1
            Le:
                int r5 = r5 + 1
                goto L3
            L11:
                swap(r3, r4, r1, r6)
                return r1
        }

        static void sort(int[] r7, float[] r8, int r9, int r10) {
                int r0 = r7.length
                int r0 = r0 + 10
                int[] r0 = new int[r0]
                r1 = 0
                r0[r1] = r10
                r10 = 1
                r0[r10] = r9
                r9 = 2
            Lc:
                if (r9 <= 0) goto L30
                int r1 = r9 + (-1)
                r1 = r0[r1]
                int r2 = r9 + (-2)
                r3 = r0[r2]
                if (r1 >= r3) goto L2e
                int r4 = partition(r7, r8, r1, r3)
                int r5 = r9 + (-1)
                int r6 = r4 + (-1)
                r0[r2] = r6
                r0[r5] = r1
                int r1 = r9 + 1
                r0[r9] = r3
                int r9 = r9 + 2
                int r4 = r4 + r10
                r0[r1] = r4
                goto Lc
            L2e:
                r9 = r2
                goto Lc
            L30:
                return
        }

        private static void swap(int[] r2, float[] r3, int r4, int r5) {
                r0 = r2[r4]
                r1 = r2[r5]
                r2[r4] = r1
                r2[r5] = r0
                r2 = r3[r4]
                r0 = r3[r5]
                r3[r4] = r0
                r3[r5] = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class IntFloatFloatSort {
        private IntFloatFloatSort() {
                r0 = this;
                r0.<init>()
                return
        }

        private static int partition(int[] r3, float[] r4, float[] r5, int r6, int r7) {
                r0 = r3[r7]
                r1 = r6
            L3:
                if (r6 >= r7) goto L11
                r2 = r3[r6]
                if (r2 > r0) goto Le
                swap(r3, r4, r5, r1, r6)
                int r1 = r1 + 1
            Le:
                int r6 = r6 + 1
                goto L3
            L11:
                swap(r3, r4, r5, r1, r7)
                return r1
        }

        static void sort(int[] r7, float[] r8, float[] r9, int r10, int r11) {
                int r0 = r7.length
                int r0 = r0 + 10
                int[] r0 = new int[r0]
                r1 = 0
                r0[r1] = r11
                r11 = 1
                r0[r11] = r10
                r10 = 2
            Lc:
                if (r10 <= 0) goto L30
                int r1 = r10 + (-1)
                r1 = r0[r1]
                int r2 = r10 + (-2)
                r3 = r0[r2]
                if (r1 >= r3) goto L2e
                int r4 = partition(r7, r8, r9, r1, r3)
                int r5 = r10 + (-1)
                int r6 = r4 + (-1)
                r0[r2] = r6
                r0[r5] = r1
                int r1 = r10 + 1
                r0[r10] = r3
                int r10 = r10 + 2
                int r4 = r4 + r11
                r0[r1] = r4
                goto Lc
            L2e:
                r10 = r2
                goto Lc
            L30:
                return
        }

        private static void swap(int[] r2, float[] r3, float[] r4, int r5, int r6) {
                r0 = r2[r5]
                r1 = r2[r6]
                r2[r5] = r1
                r2[r6] = r0
                r2 = r3[r5]
                r0 = r3[r6]
                r3[r5] = r0
                r3[r6] = r2
                r2 = r4[r5]
                r3 = r4[r6]
                r4[r5] = r3
                r4[r6] = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class PathRotateSet extends androidx.constraintlayout.motion.widget.KeyCycleOscillator {
        PathRotateSet() {
                r0 = this;
                r0.<init>()
                return
        }

        public void setPathRotate(android.view.View r1, float r2, double r3, double r5) {
                r0 = this;
                float r2 = r0.get(r2)
                double r3 = java.lang.Math.atan2(r5, r3)
                double r3 = java.lang.Math.toDegrees(r3)
                float r3 = (float) r3
                float r2 = r2 + r3
                r1.setRotation(r2)
                return
        }

        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ProgressSet extends androidx.constraintlayout.motion.widget.KeyCycleOscillator {
        boolean mNoMethod;

        ProgressSet() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mNoMethod = r0
                return
        }

        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(android.view.View r7, float r8) {
                r6 = this;
                boolean r0 = r7 instanceof androidx.constraintlayout.motion.widget.MotionLayout
                if (r0 == 0) goto Le
                androidx.constraintlayout.motion.widget.MotionLayout r7 = (androidx.constraintlayout.motion.widget.MotionLayout) r7
                float r8 = r6.get(r8)
                r7.setProgress(r8)
                return
            Le:
                boolean r0 = r6.mNoMethod
                if (r0 == 0) goto L13
                goto L3a
            L13:
                r0 = 0
                r1 = 1
                java.lang.Class r2 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L26
                java.lang.String r3 = "setProgress"
                java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L26
                java.lang.Class r5 = java.lang.Float.TYPE     // Catch: java.lang.NoSuchMethodException -> L26
                r4[r0] = r5     // Catch: java.lang.NoSuchMethodException -> L26
                java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L26
                goto L29
            L26:
                r6.mNoMethod = r1
                r2 = 0
            L29:
                if (r2 == 0) goto L3a
                float r8 = r6.get(r8)     // Catch: java.lang.Throwable -> L3a
                java.lang.Float r8 = java.lang.Float.valueOf(r8)     // Catch: java.lang.Throwable -> L3a
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3a
                r1[r0] = r8     // Catch: java.lang.Throwable -> L3a
                r2.invoke(r7, r1)     // Catch: java.lang.Throwable -> L3a
            L3a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class RotationSet extends androidx.constraintlayout.motion.widget.KeyCycleOscillator {
        RotationSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setRotation(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class RotationXset extends androidx.constraintlayout.motion.widget.KeyCycleOscillator {
        RotationXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setRotationX(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class RotationYset extends androidx.constraintlayout.motion.widget.KeyCycleOscillator {
        RotationYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setRotationY(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ScaleXset extends androidx.constraintlayout.motion.widget.KeyCycleOscillator {
        ScaleXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setScaleX(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ScaleYset extends androidx.constraintlayout.motion.widget.KeyCycleOscillator {
        ScaleYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setScaleY(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class TranslationXset extends androidx.constraintlayout.motion.widget.KeyCycleOscillator {
        TranslationXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setTranslationX(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class TranslationYset extends androidx.constraintlayout.motion.widget.KeyCycleOscillator {
        TranslationYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setTranslationY(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class TranslationZset extends androidx.constraintlayout.motion.widget.KeyCycleOscillator {
        TranslationZset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.KeyCycleOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setTranslationZ(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class WavePoint {
        float mOffset;
        float mPeriod;
        int mPosition;
        float mValue;

        public WavePoint(int r1, float r2, float r3, float r4) {
                r0 = this;
                r0.<init>()
                r0.mPosition = r1
                r0.mValue = r4
                r0.mOffset = r3
                r0.mPeriod = r2
                return
        }
    }

    public KeyCycleOscillator() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mWaveShape = r0
            r1.mVariesBy = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mWavePoints = r0
            return
    }

    static androidx.constraintlayout.motion.widget.KeyCycleOscillator makeSpline(java.lang.String r2) {
            java.lang.String r0 = "CUSTOM"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto Le
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$CustomSet r2 = new androidx.constraintlayout.motion.widget.KeyCycleOscillator$CustomSet
            r2.<init>()
            return r2
        Le:
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1249320806: goto Lbb;
                case -1249320805: goto Lb0;
                case -1225497657: goto La5;
                case -1225497656: goto L9a;
                case -1225497655: goto L8f;
                case -1001078227: goto L84;
                case -908189618: goto L79;
                case -908189617: goto L6e;
                case -797520672: goto L5f;
                case -40300674: goto L51;
                case -4379043: goto L43;
                case 37232917: goto L35;
                case 92909918: goto L27;
                case 156108012: goto L18;
                default: goto L16;
            }
        L16:
            goto Lc5
        L18:
            java.lang.String r0 = "waveOffset"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L23
            goto Lc5
        L23:
            r1 = 13
            goto Lc5
        L27:
            java.lang.String r0 = "alpha"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L31
            goto Lc5
        L31:
            r1 = 12
            goto Lc5
        L35:
            java.lang.String r0 = "transitionPathRotate"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L3f
            goto Lc5
        L3f:
            r1 = 11
            goto Lc5
        L43:
            java.lang.String r0 = "elevation"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4d
            goto Lc5
        L4d:
            r1 = 10
            goto Lc5
        L51:
            java.lang.String r0 = "rotation"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5b
            goto Lc5
        L5b:
            r1 = 9
            goto Lc5
        L5f:
            java.lang.String r0 = "waveVariesBy"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L6a
            goto Lc5
        L6a:
            r1 = 8
            goto Lc5
        L6e:
            java.lang.String r0 = "scaleY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L77
            goto Lc5
        L77:
            r1 = 7
            goto Lc5
        L79:
            java.lang.String r0 = "scaleX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L82
            goto Lc5
        L82:
            r1 = 6
            goto Lc5
        L84:
            java.lang.String r0 = "progress"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L8d
            goto Lc5
        L8d:
            r1 = 5
            goto Lc5
        L8f:
            java.lang.String r0 = "translationZ"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L98
            goto Lc5
        L98:
            r1 = 4
            goto Lc5
        L9a:
            java.lang.String r0 = "translationY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto La3
            goto Lc5
        La3:
            r1 = 3
            goto Lc5
        La5:
            java.lang.String r0 = "translationX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lae
            goto Lc5
        Lae:
            r1 = 2
            goto Lc5
        Lb0:
            java.lang.String r0 = "rotationY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lb9
            goto Lc5
        Lb9:
            r1 = 1
            goto Lc5
        Lbb:
            java.lang.String r0 = "rotationX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lc4
            goto Lc5
        Lc4:
            r1 = 0
        Lc5:
            switch(r1) {
                case 0: goto L118;
                case 1: goto L112;
                case 2: goto L10c;
                case 3: goto L106;
                case 4: goto L100;
                case 5: goto Lfa;
                case 6: goto Lf4;
                case 7: goto Lee;
                case 8: goto Le8;
                case 9: goto Le2;
                case 10: goto Ldc;
                case 11: goto Ld6;
                case 12: goto Ld0;
                case 13: goto Lca;
                default: goto Lc8;
            }
        Lc8:
            r2 = 0
            return r2
        Lca:
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$AlphaSet r2 = new androidx.constraintlayout.motion.widget.KeyCycleOscillator$AlphaSet
            r2.<init>()
            return r2
        Ld0:
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$AlphaSet r2 = new androidx.constraintlayout.motion.widget.KeyCycleOscillator$AlphaSet
            r2.<init>()
            return r2
        Ld6:
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$PathRotateSet r2 = new androidx.constraintlayout.motion.widget.KeyCycleOscillator$PathRotateSet
            r2.<init>()
            return r2
        Ldc:
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$ElevationSet r2 = new androidx.constraintlayout.motion.widget.KeyCycleOscillator$ElevationSet
            r2.<init>()
            return r2
        Le2:
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$RotationSet r2 = new androidx.constraintlayout.motion.widget.KeyCycleOscillator$RotationSet
            r2.<init>()
            return r2
        Le8:
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$AlphaSet r2 = new androidx.constraintlayout.motion.widget.KeyCycleOscillator$AlphaSet
            r2.<init>()
            return r2
        Lee:
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$ScaleYset r2 = new androidx.constraintlayout.motion.widget.KeyCycleOscillator$ScaleYset
            r2.<init>()
            return r2
        Lf4:
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$ScaleXset r2 = new androidx.constraintlayout.motion.widget.KeyCycleOscillator$ScaleXset
            r2.<init>()
            return r2
        Lfa:
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$ProgressSet r2 = new androidx.constraintlayout.motion.widget.KeyCycleOscillator$ProgressSet
            r2.<init>()
            return r2
        L100:
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$TranslationZset r2 = new androidx.constraintlayout.motion.widget.KeyCycleOscillator$TranslationZset
            r2.<init>()
            return r2
        L106:
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$TranslationYset r2 = new androidx.constraintlayout.motion.widget.KeyCycleOscillator$TranslationYset
            r2.<init>()
            return r2
        L10c:
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$TranslationXset r2 = new androidx.constraintlayout.motion.widget.KeyCycleOscillator$TranslationXset
            r2.<init>()
            return r2
        L112:
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$RotationYset r2 = new androidx.constraintlayout.motion.widget.KeyCycleOscillator$RotationYset
            r2.<init>()
            return r2
        L118:
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$RotationXset r2 = new androidx.constraintlayout.motion.widget.KeyCycleOscillator$RotationXset
            r2.<init>()
            return r2
    }

    public float get(float r3) {
            r2 = this;
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$CycleOscillator r0 = r2.mCycleOscillator
            double r0 = r0.getValues(r3)
            float r3 = (float) r0
            return r3
    }

    public androidx.constraintlayout.motion.utils.CurveFit getCurveFit() {
            r1 = this;
            androidx.constraintlayout.motion.utils.CurveFit r0 = r1.mCurveFit
            return r0
    }

    public float getSlope(float r3) {
            r2 = this;
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$CycleOscillator r0 = r2.mCycleOscillator
            double r0 = r0.getSlope(r3)
            float r3 = (float) r0
            return r3
    }

    public void setPoint(int r3, int r4, int r5, float r6, float r7, float r8) {
            r2 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.KeyCycleOscillator$WavePoint> r0 = r2.mWavePoints
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$WavePoint r1 = new androidx.constraintlayout.motion.widget.KeyCycleOscillator$WavePoint
            r1.<init>(r3, r6, r7, r8)
            r0.add(r1)
            r3 = -1
            if (r5 == r3) goto Lf
            r2.mVariesBy = r5
        Lf:
            r2.mWaveShape = r4
            return
    }

    public void setPoint(int r3, int r4, int r5, float r6, float r7, float r8, androidx.constraintlayout.widget.ConstraintAttribute r9) {
            r2 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.KeyCycleOscillator$WavePoint> r0 = r2.mWavePoints
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$WavePoint r1 = new androidx.constraintlayout.motion.widget.KeyCycleOscillator$WavePoint
            r1.<init>(r3, r6, r7, r8)
            r0.add(r1)
            r3 = -1
            if (r5 == r3) goto Lf
            r2.mVariesBy = r5
        Lf:
            r2.mWaveShape = r4
            r2.mCustom = r9
            return
    }

    public abstract void setProperty(android.view.View r1, float r2);

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.mType = r1
            return
    }

    @android.annotation.TargetApi(19)
    public void setup(float r14) {
            r13 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.KeyCycleOscillator$WavePoint> r0 = r13.mWavePoints
            int r0 = r0.size()
            if (r0 != 0) goto L9
            return
        L9:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.KeyCycleOscillator$WavePoint> r1 = r13.mWavePoints
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$1 r2 = new androidx.constraintlayout.motion.widget.KeyCycleOscillator$1
            r2.<init>(r13)
            java.util.Collections.sort(r1, r2)
            double[] r1 = new double[r0]
            r2 = 2
            int[] r3 = new int[r2]
            r4 = 1
            r3[r4] = r2
            r2 = 0
            r3[r2] = r0
            java.lang.Class r5 = java.lang.Double.TYPE
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r5, r3)
            double[][] r3 = (double[][]) r3
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$CycleOscillator r5 = new androidx.constraintlayout.motion.widget.KeyCycleOscillator$CycleOscillator
            int r6 = r13.mWaveShape
            int r7 = r13.mVariesBy
            r5.<init>(r6, r7, r0)
            r13.mCycleOscillator = r5
            java.util.ArrayList<androidx.constraintlayout.motion.widget.KeyCycleOscillator$WavePoint> r0 = r13.mWavePoints
            java.util.Iterator r0 = r0.iterator()
            r6 = 0
        L38:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L66
            java.lang.Object r5 = r0.next()
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$WavePoint r5 = (androidx.constraintlayout.motion.widget.KeyCycleOscillator.WavePoint) r5
            float r8 = r5.mPeriod
            double r9 = (double) r8
            r11 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r9 = r9 * r11
            r1[r6] = r9
            r7 = r3[r6]
            float r10 = r5.mValue
            double r11 = (double) r10
            r7[r2] = r11
            float r9 = r5.mOffset
            double r11 = (double) r9
            r7[r4] = r11
            r7 = r5
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$CycleOscillator r5 = r13.mCycleOscillator
            int r7 = r7.mPosition
            r5.setPoint(r6, r7, r8, r9, r10)
            int r6 = r6 + r4
            goto L38
        L66:
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$CycleOscillator r0 = r13.mCycleOscillator
            r0.setup(r14)
            androidx.constraintlayout.motion.utils.CurveFit r14 = androidx.constraintlayout.motion.utils.CurveFit.get(r2, r1, r3)
            r13.mCurveFit = r14
            return
    }

    public java.lang.String toString() {
            r7 = this;
            java.lang.String r0 = r7.mType
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.lang.String r2 = "##.##"
            r1.<init>(r2)
            java.util.ArrayList<androidx.constraintlayout.motion.widget.KeyCycleOscillator$WavePoint> r2 = r7.mWavePoints
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L46
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$WavePoint r3 = (androidx.constraintlayout.motion.widget.KeyCycleOscillator.WavePoint) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "["
            r4.append(r0)
            int r0 = r3.mPosition
            r4.append(r0)
            java.lang.String r0 = " , "
            r4.append(r0)
            float r0 = r3.mValue
            double r5 = (double) r0
            java.lang.String r0 = r1.format(r5)
            r4.append(r0)
            java.lang.String r0 = "] "
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            goto Lf
        L46:
            return r0
    }

    public boolean variesByPath() {
            r2 = this;
            int r0 = r2.mVariesBy
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }
}
