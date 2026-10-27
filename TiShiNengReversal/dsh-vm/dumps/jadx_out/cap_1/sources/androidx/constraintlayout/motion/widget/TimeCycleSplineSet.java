package androidx.constraintlayout.motion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class TimeCycleSplineSet {
    private static final int CURVE_OFFSET = 2;
    private static final int CURVE_PERIOD = 1;
    private static final int CURVE_VALUE = 0;
    private static final java.lang.String TAG = "SplineSet";
    private static float VAL_2PI = 6.2831855f;
    private int count;
    float last_cycle;
    long last_time;
    private float[] mCache;
    protected boolean mContinue;
    protected androidx.constraintlayout.motion.utils.CurveFit mCurveFit;
    protected int[] mTimePoints;
    private java.lang.String mType;
    protected float[][] mValues;
    protected int mWaveShape;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class AlphaSet extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        AlphaSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.motion.widget.KeyCache r11) {
                r6 = this;
                r0 = r6
                r4 = r7
                r1 = r8
                r2 = r9
                r5 = r11
                float r7 = r0.get(r1, r2, r4, r5)
                r4.setAlpha(r7)
                boolean r7 = r0.mContinue
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class CustomSet extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        java.lang.String mAttributeName;
        float[] mCache;
        android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;
        android.util.SparseArray<float[]> mWaveProperties;

        public CustomSet(java.lang.String r2, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r3) {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.mWaveProperties = r0
                java.lang.String r0 = ","
                java.lang.String[] r2 = r2.split(r0)
                r0 = 1
                r2 = r2[r0]
                r1.mAttributeName = r2
                r1.mConstraintAttributeList = r3
                return
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public void setPoint(int r1, float r2, float r3, int r4, float r5) {
                r0 = this;
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)"
                r1.<init>(r2)
                throw r1
        }

        public void setPoint(int r3, androidx.constraintlayout.widget.ConstraintAttribute r4, float r5, int r6, float r7) {
                r2 = this;
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r0 = r2.mConstraintAttributeList
                r0.append(r3, r4)
                android.util.SparseArray<float[]> r4 = r2.mWaveProperties
                r0 = 2
                float[] r0 = new float[r0]
                r1 = 0
                r0[r1] = r5
                r5 = 1
                r0[r5] = r7
                r4.append(r3, r0)
                int r3 = r2.mWaveShape
                int r3 = java.lang.Math.max(r3, r6)
                r2.mWaveShape = r3
                return
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View r11, float r12, long r13, androidx.constraintlayout.motion.widget.KeyCache r15) {
                r10 = this;
                androidx.constraintlayout.motion.utils.CurveFit r15 = r10.mCurveFit
                double r0 = (double) r12
                float[] r12 = r10.mTempValues
                r15.getPos(r0, r12)
                float[] r12 = r10.mTempValues
                int r15 = r12.length
                int r15 = r15 + (-2)
                r15 = r12[r15]
                int r0 = r12.length
                r1 = 1
                int r0 = r0 - r1
                r12 = r12[r0]
                long r2 = r10.last_time
                long r2 = r13 - r2
                float r0 = r10.last_cycle
                double r4 = (double) r0
                double r2 = (double) r2
                r6 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
                double r2 = r2 * r6
                double r6 = (double) r15
                double r2 = r2 * r6
                double r4 = r4 + r2
                r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r4 = r4 % r2
                float r0 = (float) r4
                r10.last_cycle = r0
                r10.last_time = r13
                float r13 = r10.calcWave(r0)
                r14 = 0
                r10.mContinue = r14
                r0 = 0
            L37:
                float[] r2 = r10.mCache
                int r3 = r2.length
                if (r0 >= r3) goto L57
                boolean r3 = r10.mContinue
                float[] r4 = r10.mTempValues
                r4 = r4[r0]
                double r5 = (double) r4
                r7 = 0
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 == 0) goto L4b
                r5 = 1
                goto L4c
            L4b:
                r5 = 0
            L4c:
                r3 = r3 | r5
                r10.mContinue = r3
                float r4 = r4 * r13
                float r4 = r4 + r12
                r2[r0] = r4
                int r0 = r0 + 1
                goto L37
            L57:
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r12 = r10.mConstraintAttributeList
                java.lang.Object r12 = r12.valueAt(r14)
                androidx.constraintlayout.widget.ConstraintAttribute r12 = (androidx.constraintlayout.widget.ConstraintAttribute) r12
                float[] r13 = r10.mCache
                r12.setInterpolatedValue(r11, r13)
                r11 = 0
                int r11 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
                if (r11 == 0) goto L6b
                r10.mContinue = r1
            L6b:
                boolean r11 = r10.mContinue
                return r11
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public void setup(int r15) {
                r14 = this;
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r0 = r14.mConstraintAttributeList
                int r0 = r0.size()
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r1 = r14.mConstraintAttributeList
                r2 = 0
                java.lang.Object r1 = r1.valueAt(r2)
                androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
                int r1 = r1.noOfInterpValues()
                double[] r3 = new double[r0]
                int r4 = r1 + 2
                float[] r5 = new float[r4]
                r14.mTempValues = r5
                float[] r5 = new float[r1]
                r14.mCache = r5
                r5 = 2
                int[] r5 = new int[r5]
                r6 = 1
                r5[r6] = r4
                r5[r2] = r0
                java.lang.Class r4 = java.lang.Double.TYPE
                java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r5)
                double[][] r4 = (double[][]) r4
                r5 = 0
            L30:
                if (r5 >= r0) goto L78
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r7 = r14.mConstraintAttributeList
                int r7 = r7.keyAt(r5)
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r8 = r14.mConstraintAttributeList
                java.lang.Object r8 = r8.valueAt(r5)
                androidx.constraintlayout.widget.ConstraintAttribute r8 = (androidx.constraintlayout.widget.ConstraintAttribute) r8
                android.util.SparseArray<float[]> r9 = r14.mWaveProperties
                java.lang.Object r9 = r9.valueAt(r5)
                float[] r9 = (float[]) r9
                double r10 = (double) r7
                r12 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                double r10 = r10 * r12
                r3[r5] = r10
                float[] r7 = r14.mTempValues
                r8.getValuesToInterpolate(r7)
                r7 = 0
            L58:
                float[] r8 = r14.mTempValues
                int r10 = r8.length
                if (r7 >= r10) goto L67
                r10 = r4[r5]
                r8 = r8[r7]
                double r11 = (double) r8
                r10[r7] = r11
                int r7 = r7 + 1
                goto L58
            L67:
                r7 = r4[r5]
                r8 = r9[r2]
                double r10 = (double) r8
                r7[r1] = r10
                int r8 = r1 + 1
                r9 = r9[r6]
                double r9 = (double) r9
                r7[r8] = r9
                int r5 = r5 + 1
                goto L30
            L78:
                androidx.constraintlayout.motion.utils.CurveFit r15 = androidx.constraintlayout.motion.utils.CurveFit.get(r15, r3, r4)
                r14.mCurveFit = r15
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ElevationSet extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        ElevationSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.motion.widget.KeyCache r11) {
                r6 = this;
                r0 = r6
                r4 = r7
                r1 = r8
                r2 = r9
                r5 = r11
                float r7 = r0.get(r1, r2, r4, r5)
                r4.setElevation(r7)
                boolean r7 = r0.mContinue
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class PathRotate extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        PathRotate() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean setPathRotate(android.view.View r7, androidx.constraintlayout.motion.widget.KeyCache r8, float r9, long r10, double r12, double r14) {
                r6 = this;
                r0 = r6
                r4 = r7
                r5 = r8
                r1 = r9
                r2 = r10
                float r7 = r0.get(r1, r2, r4, r5)
                double r8 = java.lang.Math.atan2(r14, r12)
                double r8 = java.lang.Math.toDegrees(r8)
                float r8 = (float) r8
                float r7 = r7 + r8
                r4.setRotation(r7)
                boolean r7 = r0.mContinue
                return r7
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View r1, float r2, long r3, androidx.constraintlayout.motion.widget.KeyCache r5) {
                r0 = this;
                boolean r1 = r0.mContinue
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ProgressSet extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        boolean mNoMethod;

        ProgressSet() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mNoMethod = r0
                return
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View r8, float r9, long r10, androidx.constraintlayout.motion.widget.KeyCache r12) {
                r7 = this;
                boolean r0 = r8 instanceof androidx.constraintlayout.motion.widget.MotionLayout
                if (r0 == 0) goto L14
                r0 = r8
                androidx.constraintlayout.motion.widget.MotionLayout r0 = (androidx.constraintlayout.motion.widget.MotionLayout) r0
                r1 = r7
                r5 = r8
                r2 = r9
                r3 = r10
                r6 = r12
                float r8 = r1.get(r2, r3, r5, r6)
                r0.setProgress(r8)
                goto L45
            L14:
                r1 = r7
                r5 = r8
                r2 = r9
                r3 = r10
                r6 = r12
                boolean r8 = r1.mNoMethod
                r9 = 0
                if (r8 == 0) goto L1f
                return r9
            L1f:
                r8 = 1
                java.lang.Class r10 = r5.getClass()     // Catch: java.lang.NoSuchMethodException -> L31
                java.lang.String r11 = "setProgress"
                java.lang.Class[] r12 = new java.lang.Class[r8]     // Catch: java.lang.NoSuchMethodException -> L31
                java.lang.Class r0 = java.lang.Float.TYPE     // Catch: java.lang.NoSuchMethodException -> L31
                r12[r9] = r0     // Catch: java.lang.NoSuchMethodException -> L31
                java.lang.reflect.Method r10 = r10.getMethod(r11, r12)     // Catch: java.lang.NoSuchMethodException -> L31
                goto L34
            L31:
                r1.mNoMethod = r8
                r10 = 0
            L34:
                if (r10 == 0) goto L45
                float r11 = r1.get(r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L45
                java.lang.Float r11 = java.lang.Float.valueOf(r11)     // Catch: java.lang.Throwable -> L45
                java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L45
                r8[r9] = r11     // Catch: java.lang.Throwable -> L45
                r10.invoke(r5, r8)     // Catch: java.lang.Throwable -> L45
            L45:
                boolean r8 = r1.mContinue
                return r8
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class RotationSet extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        RotationSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.motion.widget.KeyCache r11) {
                r6 = this;
                r0 = r6
                r4 = r7
                r1 = r8
                r2 = r9
                r5 = r11
                float r7 = r0.get(r1, r2, r4, r5)
                r4.setRotation(r7)
                boolean r7 = r0.mContinue
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class RotationXset extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        RotationXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.motion.widget.KeyCache r11) {
                r6 = this;
                r0 = r6
                r4 = r7
                r1 = r8
                r2 = r9
                r5 = r11
                float r7 = r0.get(r1, r2, r4, r5)
                r4.setRotationX(r7)
                boolean r7 = r0.mContinue
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class RotationYset extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        RotationYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.motion.widget.KeyCache r11) {
                r6 = this;
                r0 = r6
                r4 = r7
                r1 = r8
                r2 = r9
                r5 = r11
                float r7 = r0.get(r1, r2, r4, r5)
                r4.setRotationY(r7)
                boolean r7 = r0.mContinue
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ScaleXset extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        ScaleXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.motion.widget.KeyCache r11) {
                r6 = this;
                r0 = r6
                r4 = r7
                r1 = r8
                r2 = r9
                r5 = r11
                float r7 = r0.get(r1, r2, r4, r5)
                r4.setScaleX(r7)
                boolean r7 = r0.mContinue
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ScaleYset extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        ScaleYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.motion.widget.KeyCache r11) {
                r6 = this;
                r0 = r6
                r4 = r7
                r1 = r8
                r2 = r9
                r5 = r11
                float r7 = r0.get(r1, r2, r4, r5)
                r4.setScaleY(r7)
                boolean r7 = r0.mContinue
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class Sort {
        private Sort() {
                r0 = this;
                r0.<init>()
                return
        }

        static void doubleQuickSort(int[] r7, float[][] r8, int r9, int r10) {
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

        private static int partition(int[] r3, float[][] r4, int r5, int r6) {
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

        private static void swap(int[] r2, float[][] r3, int r4, int r5) {
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
    static class TranslationXset extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        TranslationXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.motion.widget.KeyCache r11) {
                r6 = this;
                r0 = r6
                r4 = r7
                r1 = r8
                r2 = r9
                r5 = r11
                float r7 = r0.get(r1, r2, r4, r5)
                r4.setTranslationX(r7)
                boolean r7 = r0.mContinue
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class TranslationYset extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        TranslationYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.motion.widget.KeyCache r11) {
                r6 = this;
                r0 = r6
                r4 = r7
                r1 = r8
                r2 = r9
                r5 = r11
                float r7 = r0.get(r1, r2, r4, r5)
                r4.setTranslationY(r7)
                boolean r7 = r0.mContinue
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class TranslationZset extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        TranslationZset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.motion.widget.KeyCache r11) {
                r6 = this;
                r0 = r6
                r4 = r7
                r1 = r8
                r2 = r9
                r5 = r11
                float r7 = r0.get(r1, r2, r4, r5)
                r4.setTranslationZ(r7)
                boolean r7 = r0.mContinue
                return r7
        }
    }

    static {
            return
    }

    public TimeCycleSplineSet() {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.mWaveShape = r0
            r1 = 10
            int[] r2 = new int[r1]
            r5.mTimePoints = r2
            r2 = 2
            int[] r2 = new int[r2]
            r3 = 1
            r4 = 3
            r2[r3] = r4
            r2[r0] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            float[][] r1 = (float[][]) r1
            r5.mValues = r1
            float[] r1 = new float[r4]
            r5.mCache = r1
            r5.mContinue = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r5.last_cycle = r0
            return
    }

    static androidx.constraintlayout.motion.widget.TimeCycleSplineSet makeCustomSpline(java.lang.String r1, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r2) {
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$CustomSet r0 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$CustomSet
            r0.<init>(r1, r2)
            return r0
    }

    static androidx.constraintlayout.motion.widget.TimeCycleSplineSet makeSpline(java.lang.String r2, long r3) {
            r2.getClass()
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1249320806: goto L92;
                case -1249320805: goto L87;
                case -1225497657: goto L7c;
                case -1225497656: goto L71;
                case -1225497655: goto L66;
                case -1001078227: goto L5b;
                case -908189618: goto L50;
                case -908189617: goto L45;
                case -40300674: goto L37;
                case -4379043: goto L29;
                case 37232917: goto L1b;
                case 92909918: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto L9c
        Ld:
            java.lang.String r0 = "alpha"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L17
            goto L9c
        L17:
            r1 = 11
            goto L9c
        L1b:
            java.lang.String r0 = "transitionPathRotate"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L25
            goto L9c
        L25:
            r1 = 10
            goto L9c
        L29:
            java.lang.String r0 = "elevation"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L33
            goto L9c
        L33:
            r1 = 9
            goto L9c
        L37:
            java.lang.String r0 = "rotation"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L41
            goto L9c
        L41:
            r1 = 8
            goto L9c
        L45:
            java.lang.String r0 = "scaleY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4e
            goto L9c
        L4e:
            r1 = 7
            goto L9c
        L50:
            java.lang.String r0 = "scaleX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L59
            goto L9c
        L59:
            r1 = 6
            goto L9c
        L5b:
            java.lang.String r0 = "progress"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L64
            goto L9c
        L64:
            r1 = 5
            goto L9c
        L66:
            java.lang.String r0 = "translationZ"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L6f
            goto L9c
        L6f:
            r1 = 4
            goto L9c
        L71:
            java.lang.String r0 = "translationY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L7a
            goto L9c
        L7a:
            r1 = 3
            goto L9c
        L7c:
            java.lang.String r0 = "translationX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L85
            goto L9c
        L85:
            r1 = 2
            goto L9c
        L87:
            java.lang.String r0 = "rotationY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L90
            goto L9c
        L90:
            r1 = 1
            goto L9c
        L92:
            java.lang.String r0 = "rotationX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L9b
            goto L9c
        L9b:
            r1 = 0
        L9c:
            switch(r1) {
                case 0: goto Le3;
                case 1: goto Ldd;
                case 2: goto Ld7;
                case 3: goto Ld1;
                case 4: goto Lcb;
                case 5: goto Lc5;
                case 6: goto Lbf;
                case 7: goto Lb9;
                case 8: goto Lb3;
                case 9: goto Lad;
                case 10: goto La7;
                case 11: goto La1;
                default: goto L9f;
            }
        L9f:
            r2 = 0
            return r2
        La1:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$AlphaSet r2 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$AlphaSet
            r2.<init>()
            goto Le8
        La7:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$PathRotate r2 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$PathRotate
            r2.<init>()
            goto Le8
        Lad:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$ElevationSet r2 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$ElevationSet
            r2.<init>()
            goto Le8
        Lb3:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$RotationSet r2 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$RotationSet
            r2.<init>()
            goto Le8
        Lb9:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$ScaleYset r2 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$ScaleYset
            r2.<init>()
            goto Le8
        Lbf:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$ScaleXset r2 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$ScaleXset
            r2.<init>()
            goto Le8
        Lc5:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$ProgressSet r2 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$ProgressSet
            r2.<init>()
            goto Le8
        Lcb:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$TranslationZset r2 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$TranslationZset
            r2.<init>()
            goto Le8
        Ld1:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$TranslationYset r2 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$TranslationYset
            r2.<init>()
            goto Le8
        Ld7:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$TranslationXset r2 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$TranslationXset
            r2.<init>()
            goto Le8
        Ldd:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$RotationYset r2 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$RotationYset
            r2.<init>()
            goto Le8
        Le3:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$RotationXset r2 = new androidx.constraintlayout.motion.widget.TimeCycleSplineSet$RotationXset
            r2.<init>()
        Le8:
            r2.setStartTime(r3)
            return r2
    }

    protected float calcWave(float r4) {
            r3 = this;
            int r0 = r3.mWaveShape
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            switch(r0) {
                case 1: goto L3f;
                case 2: goto L3a;
                case 3: goto L34;
                case 4: goto L2f;
                case 5: goto L24;
                case 6: goto L14;
                default: goto L9;
            }
        L9:
            float r0 = androidx.constraintlayout.motion.widget.TimeCycleSplineSet.VAL_2PI
            float r4 = r4 * r0
            double r0 = (double) r4
            double r0 = java.lang.Math.sin(r0)
            float r4 = (float) r0
            return r4
        L14:
            r0 = 1082130432(0x40800000, float:4.0)
            float r4 = r4 * r0
            float r4 = r4 % r0
            float r4 = r4 - r1
            float r4 = java.lang.Math.abs(r4)
            float r4 = r2 - r4
            float r4 = r4 * r4
        L22:
            float r2 = r2 - r4
            return r2
        L24:
            float r0 = androidx.constraintlayout.motion.widget.TimeCycleSplineSet.VAL_2PI
            float r4 = r4 * r0
            double r0 = (double) r4
            double r0 = java.lang.Math.cos(r0)
            float r4 = (float) r0
            return r4
        L2f:
            float r4 = r4 * r1
            float r4 = r4 + r2
            float r4 = r4 % r1
            goto L22
        L34:
            float r4 = r4 * r1
            float r4 = r4 + r2
            float r4 = r4 % r1
            float r4 = r4 - r2
            return r4
        L3a:
            float r4 = java.lang.Math.abs(r4)
            goto L22
        L3f:
            float r0 = androidx.constraintlayout.motion.widget.TimeCycleSplineSet.VAL_2PI
            float r4 = r4 * r0
            float r4 = java.lang.Math.signum(r4)
            return r4
    }

    public float get(float r19, long r20, android.view.View r22, androidx.constraintlayout.motion.widget.KeyCache r23) {
            r18 = this;
            r0 = r18
            r1 = r20
            r3 = r22
            r4 = r23
            androidx.constraintlayout.motion.utils.CurveFit r5 = r0.mCurveFit
            r6 = r19
            double r6 = (double) r6
            float[] r8 = r0.mCache
            r5.getPos(r6, r8)
            float[] r5 = r0.mCache
            r6 = 1
            r7 = r5[r6]
            r8 = 2
            r9 = 0
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 != 0) goto L23
            r0.mContinue = r9
            r1 = r5[r8]
            return r1
        L23:
            float r5 = r0.last_cycle
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L3b
            java.lang.String r5 = r0.mType
            float r5 = r4.getFloatValue(r3, r5, r9)
            r0.last_cycle = r5
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L3b
            r0.last_cycle = r10
        L3b:
            long r12 = r0.last_time
            long r12 = r1 - r12
            float r5 = r0.last_cycle
            double r14 = (double) r5
            double r12 = (double) r12
            r16 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            double r12 = r12 * r16
            double r6 = (double) r7
            double r12 = r12 * r6
            double r14 = r14 + r12
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r14 = r14 % r5
            float r5 = (float) r14
            r0.last_cycle = r5
            java.lang.String r6 = r0.mType
            r4.setFloatValue(r3, r6, r9, r5)
            r0.last_time = r1
            float[] r1 = r0.mCache
            r1 = r1[r9]
            float r2 = r0.last_cycle
            float r2 = r0.calcWave(r2)
            float[] r3 = r0.mCache
            r3 = r3[r8]
            float r2 = r2 * r1
            float r2 = r2 + r3
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 != 0) goto L75
            if (r11 == 0) goto L73
            goto L75
        L73:
            r6 = 0
            goto L76
        L75:
            r6 = 1
        L76:
            r0.mContinue = r6
            return r2
    }

    public androidx.constraintlayout.motion.utils.CurveFit getCurveFit() {
            r1 = this;
            androidx.constraintlayout.motion.utils.CurveFit r0 = r1.mCurveFit
            return r0
    }

    public void setPoint(int r3, float r4, float r5, int r6, float r7) {
            r2 = this;
            int[] r0 = r2.mTimePoints
            int r1 = r2.count
            r0[r1] = r3
            float[][] r3 = r2.mValues
            r3 = r3[r1]
            r0 = 0
            r3[r0] = r4
            r4 = 1
            r3[r4] = r5
            r5 = 2
            r3[r5] = r7
            int r3 = r2.mWaveShape
            int r3 = java.lang.Math.max(r3, r6)
            r2.mWaveShape = r3
            int r3 = r2.count
            int r3 = r3 + r4
            r2.count = r3
            return
    }

    public abstract boolean setProperty(android.view.View r1, float r2, long r3, androidx.constraintlayout.motion.widget.KeyCache r5);

    protected void setStartTime(long r1) {
            r0 = this;
            r0.last_time = r1
            return
    }

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.mType = r1
            return
    }

    public void setup(int r12) {
            r11 = this;
            int r0 = r11.count
            if (r0 != 0) goto L5
            return
        L5:
            int[] r1 = r11.mTimePoints
            float[][] r2 = r11.mValues
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet.Sort.doubleQuickSort(r1, r2, r4, r0)
            r0 = 1
            r1 = 0
        L11:
            int[] r2 = r11.mTimePoints
            int r5 = r2.length
            if (r0 >= r5) goto L23
            r5 = r2[r0]
            int r6 = r0 + (-1)
            r2 = r2[r6]
            if (r5 == r2) goto L20
            int r1 = r1 + 1
        L20:
            int r0 = r0 + 1
            goto L11
        L23:
            if (r1 != 0) goto L26
            r1 = 1
        L26:
            double[] r0 = new double[r1]
            r2 = 2
            int[] r5 = new int[r2]
            r6 = 3
            r5[r3] = r6
            r5[r4] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r5)
            double[][] r1 = (double[][]) r1
            r5 = 0
            r6 = 0
        L3a:
            int r7 = r11.count
            if (r5 >= r7) goto L73
            if (r5 <= 0) goto L4b
            int[] r7 = r11.mTimePoints
            r8 = r7[r5]
            int r9 = r5 + (-1)
            r7 = r7[r9]
            if (r8 != r7) goto L4b
            goto L70
        L4b:
            int[] r7 = r11.mTimePoints
            r7 = r7[r5]
            double r7 = (double) r7
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r7 = r7 * r9
            r0[r6] = r7
            r7 = r1[r6]
            float[][] r8 = r11.mValues
            r8 = r8[r5]
            r9 = r8[r4]
            double r9 = (double) r9
            r7[r4] = r9
            r9 = r8[r3]
            double r9 = (double) r9
            r7[r3] = r9
            r8 = r8[r2]
            double r8 = (double) r8
            r7[r2] = r8
            int r6 = r6 + 1
        L70:
            int r5 = r5 + 1
            goto L3a
        L73:
            androidx.constraintlayout.motion.utils.CurveFit r12 = androidx.constraintlayout.motion.utils.CurveFit.get(r12, r0, r1)
            r11.mCurveFit = r12
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.mType
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.lang.String r2 = "##.##"
            r1.<init>(r2)
            r2 = 0
        La:
            int r3 = r4.count
            if (r2 >= r3) goto L3e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "["
            r3.append(r0)
            int[] r0 = r4.mTimePoints
            r0 = r0[r2]
            r3.append(r0)
            java.lang.String r0 = " , "
            r3.append(r0)
            float[][] r0 = r4.mValues
            r0 = r0[r2]
            java.lang.String r0 = r1.format(r0)
            r3.append(r0)
            java.lang.String r0 = "] "
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            int r2 = r2 + 1
            goto La
        L3e:
            return r0
    }
}
