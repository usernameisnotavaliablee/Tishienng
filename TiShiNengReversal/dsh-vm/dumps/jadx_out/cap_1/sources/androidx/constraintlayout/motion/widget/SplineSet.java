package androidx.constraintlayout.motion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class SplineSet {
    private static final java.lang.String TAG = "SplineSet";
    private int count;
    protected androidx.constraintlayout.motion.utils.CurveFit mCurveFit;
    protected int[] mTimePoints;
    private java.lang.String mType;
    protected float[] mValues;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class AlphaSet extends androidx.constraintlayout.motion.widget.SplineSet {
        AlphaSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setAlpha(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class CustomSet extends androidx.constraintlayout.motion.widget.SplineSet {
        java.lang.String mAttributeName;
        android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;

        public CustomSet(java.lang.String r2, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = ","
                java.lang.String[] r2 = r2.split(r0)
                r0 = 1
                r2 = r2[r0]
                r1.mAttributeName = r2
                r1.mConstraintAttributeList = r3
                return
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setPoint(int r1, float r2) {
                r0 = this;
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "don't call for custom attribute call setPoint(pos, ConstraintAttribute)"
                r1.<init>(r2)
                throw r1
        }

        public void setPoint(int r2, androidx.constraintlayout.widget.ConstraintAttribute r3) {
                r1 = this;
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r0 = r1.mConstraintAttributeList
                r0.append(r2, r3)
                return
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View r4, float r5) {
                r3 = this;
                androidx.constraintlayout.motion.utils.CurveFit r0 = r3.mCurveFit
                double r1 = (double) r5
                float[] r5 = r3.mTempValues
                r0.getPos(r1, r5)
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r5 = r3.mConstraintAttributeList
                r0 = 0
                java.lang.Object r5 = r5.valueAt(r0)
                androidx.constraintlayout.widget.ConstraintAttribute r5 = (androidx.constraintlayout.widget.ConstraintAttribute) r5
                float[] r0 = r3.mTempValues
                r5.setInterpolatedValue(r4, r0)
                return
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setup(int r12) {
                r11 = this;
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r0 = r11.mConstraintAttributeList
                int r0 = r0.size()
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r1 = r11.mConstraintAttributeList
                r2 = 0
                java.lang.Object r1 = r1.valueAt(r2)
                androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
                int r1 = r1.noOfInterpValues()
                double[] r3 = new double[r0]
                float[] r4 = new float[r1]
                r11.mTempValues = r4
                r4 = 2
                int[] r4 = new int[r4]
                r5 = 1
                r4[r5] = r1
                r4[r2] = r0
                java.lang.Class r1 = java.lang.Double.TYPE
                java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r4)
                double[][] r1 = (double[][]) r1
                r4 = 0
            L2a:
                if (r4 >= r0) goto L5c
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r5 = r11.mConstraintAttributeList
                int r5 = r5.keyAt(r4)
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r6 = r11.mConstraintAttributeList
                java.lang.Object r6 = r6.valueAt(r4)
                androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
                double r7 = (double) r5
                r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                double r7 = r7 * r9
                r3[r4] = r7
                float[] r5 = r11.mTempValues
                r6.getValuesToInterpolate(r5)
                r5 = 0
            L4a:
                float[] r6 = r11.mTempValues
                int r7 = r6.length
                if (r5 >= r7) goto L59
                r7 = r1[r4]
                r6 = r6[r5]
                double r8 = (double) r6
                r7[r5] = r8
                int r5 = r5 + 1
                goto L4a
            L59:
                int r4 = r4 + 1
                goto L2a
            L5c:
                androidx.constraintlayout.motion.utils.CurveFit r12 = androidx.constraintlayout.motion.utils.CurveFit.get(r12, r3, r1)
                r11.mCurveFit = r12
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ElevationSet extends androidx.constraintlayout.motion.widget.SplineSet {
        ElevationSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setElevation(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class PathRotate extends androidx.constraintlayout.motion.widget.SplineSet {
        PathRotate() {
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

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class PivotXset extends androidx.constraintlayout.motion.widget.SplineSet {
        PivotXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setPivotX(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class PivotYset extends androidx.constraintlayout.motion.widget.SplineSet {
        PivotYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setPivotY(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ProgressSet extends androidx.constraintlayout.motion.widget.SplineSet {
        boolean mNoMethod;

        ProgressSet() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mNoMethod = r0
                return
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
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
    static class RotationSet extends androidx.constraintlayout.motion.widget.SplineSet {
        RotationSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setRotation(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class RotationXset extends androidx.constraintlayout.motion.widget.SplineSet {
        RotationXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setRotationX(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class RotationYset extends androidx.constraintlayout.motion.widget.SplineSet {
        RotationYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setRotationY(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ScaleXset extends androidx.constraintlayout.motion.widget.SplineSet {
        ScaleXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setScaleX(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ScaleYset extends androidx.constraintlayout.motion.widget.SplineSet {
        ScaleYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setScaleY(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class Sort {
        private Sort() {
                r0 = this;
                r0.<init>()
                return
        }

        static void doubleQuickSort(int[] r7, float[] r8, int r9, int r10) {
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
    static class TranslationXset extends androidx.constraintlayout.motion.widget.SplineSet {
        TranslationXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setTranslationX(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class TranslationYset extends androidx.constraintlayout.motion.widget.SplineSet {
        TranslationYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setTranslationY(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class TranslationZset extends androidx.constraintlayout.motion.widget.SplineSet {
        TranslationZset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setTranslationZ(r2)
                return
        }
    }

    public SplineSet() {
            r2 = this;
            r2.<init>()
            r0 = 10
            int[] r1 = new int[r0]
            r2.mTimePoints = r1
            float[] r0 = new float[r0]
            r2.mValues = r0
            return
    }

    static androidx.constraintlayout.motion.widget.SplineSet makeCustomSpline(java.lang.String r1, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r2) {
            androidx.constraintlayout.motion.widget.SplineSet$CustomSet r0 = new androidx.constraintlayout.motion.widget.SplineSet$CustomSet
            r0.<init>(r1, r2)
            return r0
    }

    static androidx.constraintlayout.motion.widget.SplineSet makeSpline(java.lang.String r2) {
            r2.getClass()
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1249320806: goto Lcc;
                case -1249320805: goto Lc1;
                case -1225497657: goto Lb6;
                case -1225497656: goto Lab;
                case -1225497655: goto La0;
                case -1001078227: goto L95;
                case -908189618: goto L8a;
                case -908189617: goto L7f;
                case -797520672: goto L70;
                case -760884510: goto L62;
                case -760884509: goto L54;
                case -40300674: goto L46;
                case -4379043: goto L38;
                case 37232917: goto L2a;
                case 92909918: goto L1c;
                case 156108012: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto Ld6
        Ld:
            java.lang.String r0 = "waveOffset"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L18
            goto Ld6
        L18:
            r1 = 15
            goto Ld6
        L1c:
            java.lang.String r0 = "alpha"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L26
            goto Ld6
        L26:
            r1 = 14
            goto Ld6
        L2a:
            java.lang.String r0 = "transitionPathRotate"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L34
            goto Ld6
        L34:
            r1 = 13
            goto Ld6
        L38:
            java.lang.String r0 = "elevation"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L42
            goto Ld6
        L42:
            r1 = 12
            goto Ld6
        L46:
            java.lang.String r0 = "rotation"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L50
            goto Ld6
        L50:
            r1 = 11
            goto Ld6
        L54:
            java.lang.String r0 = "transformPivotY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5e
            goto Ld6
        L5e:
            r1 = 10
            goto Ld6
        L62:
            java.lang.String r0 = "transformPivotX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L6c
            goto Ld6
        L6c:
            r1 = 9
            goto Ld6
        L70:
            java.lang.String r0 = "waveVariesBy"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L7b
            goto Ld6
        L7b:
            r1 = 8
            goto Ld6
        L7f:
            java.lang.String r0 = "scaleY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L88
            goto Ld6
        L88:
            r1 = 7
            goto Ld6
        L8a:
            java.lang.String r0 = "scaleX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L93
            goto Ld6
        L93:
            r1 = 6
            goto Ld6
        L95:
            java.lang.String r0 = "progress"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L9e
            goto Ld6
        L9e:
            r1 = 5
            goto Ld6
        La0:
            java.lang.String r0 = "translationZ"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto La9
            goto Ld6
        La9:
            r1 = 4
            goto Ld6
        Lab:
            java.lang.String r0 = "translationY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lb4
            goto Ld6
        Lb4:
            r1 = 3
            goto Ld6
        Lb6:
            java.lang.String r0 = "translationX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lbf
            goto Ld6
        Lbf:
            r1 = 2
            goto Ld6
        Lc1:
            java.lang.String r0 = "rotationY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lca
            goto Ld6
        Lca:
            r1 = 1
            goto Ld6
        Lcc:
            java.lang.String r0 = "rotationX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ld5
            goto Ld6
        Ld5:
            r1 = 0
        Ld6:
            switch(r1) {
                case 0: goto L135;
                case 1: goto L12f;
                case 2: goto L129;
                case 3: goto L123;
                case 4: goto L11d;
                case 5: goto L117;
                case 6: goto L111;
                case 7: goto L10b;
                case 8: goto L105;
                case 9: goto Lff;
                case 10: goto Lf9;
                case 11: goto Lf3;
                case 12: goto Led;
                case 13: goto Le7;
                case 14: goto Le1;
                case 15: goto Ldb;
                default: goto Ld9;
            }
        Ld9:
            r2 = 0
            return r2
        Ldb:
            androidx.constraintlayout.motion.widget.SplineSet$AlphaSet r2 = new androidx.constraintlayout.motion.widget.SplineSet$AlphaSet
            r2.<init>()
            return r2
        Le1:
            androidx.constraintlayout.motion.widget.SplineSet$AlphaSet r2 = new androidx.constraintlayout.motion.widget.SplineSet$AlphaSet
            r2.<init>()
            return r2
        Le7:
            androidx.constraintlayout.motion.widget.SplineSet$PathRotate r2 = new androidx.constraintlayout.motion.widget.SplineSet$PathRotate
            r2.<init>()
            return r2
        Led:
            androidx.constraintlayout.motion.widget.SplineSet$ElevationSet r2 = new androidx.constraintlayout.motion.widget.SplineSet$ElevationSet
            r2.<init>()
            return r2
        Lf3:
            androidx.constraintlayout.motion.widget.SplineSet$RotationSet r2 = new androidx.constraintlayout.motion.widget.SplineSet$RotationSet
            r2.<init>()
            return r2
        Lf9:
            androidx.constraintlayout.motion.widget.SplineSet$PivotYset r2 = new androidx.constraintlayout.motion.widget.SplineSet$PivotYset
            r2.<init>()
            return r2
        Lff:
            androidx.constraintlayout.motion.widget.SplineSet$PivotXset r2 = new androidx.constraintlayout.motion.widget.SplineSet$PivotXset
            r2.<init>()
            return r2
        L105:
            androidx.constraintlayout.motion.widget.SplineSet$AlphaSet r2 = new androidx.constraintlayout.motion.widget.SplineSet$AlphaSet
            r2.<init>()
            return r2
        L10b:
            androidx.constraintlayout.motion.widget.SplineSet$ScaleYset r2 = new androidx.constraintlayout.motion.widget.SplineSet$ScaleYset
            r2.<init>()
            return r2
        L111:
            androidx.constraintlayout.motion.widget.SplineSet$ScaleXset r2 = new androidx.constraintlayout.motion.widget.SplineSet$ScaleXset
            r2.<init>()
            return r2
        L117:
            androidx.constraintlayout.motion.widget.SplineSet$ProgressSet r2 = new androidx.constraintlayout.motion.widget.SplineSet$ProgressSet
            r2.<init>()
            return r2
        L11d:
            androidx.constraintlayout.motion.widget.SplineSet$TranslationZset r2 = new androidx.constraintlayout.motion.widget.SplineSet$TranslationZset
            r2.<init>()
            return r2
        L123:
            androidx.constraintlayout.motion.widget.SplineSet$TranslationYset r2 = new androidx.constraintlayout.motion.widget.SplineSet$TranslationYset
            r2.<init>()
            return r2
        L129:
            androidx.constraintlayout.motion.widget.SplineSet$TranslationXset r2 = new androidx.constraintlayout.motion.widget.SplineSet$TranslationXset
            r2.<init>()
            return r2
        L12f:
            androidx.constraintlayout.motion.widget.SplineSet$RotationYset r2 = new androidx.constraintlayout.motion.widget.SplineSet$RotationYset
            r2.<init>()
            return r2
        L135:
            androidx.constraintlayout.motion.widget.SplineSet$RotationXset r2 = new androidx.constraintlayout.motion.widget.SplineSet$RotationXset
            r2.<init>()
            return r2
    }

    public float get(float r4) {
            r3 = this;
            androidx.constraintlayout.motion.utils.CurveFit r0 = r3.mCurveFit
            double r1 = (double) r4
            r4 = 0
            double r0 = r0.getPos(r1, r4)
            float r4 = (float) r0
            return r4
    }

    public androidx.constraintlayout.motion.utils.CurveFit getCurveFit() {
            r1 = this;
            androidx.constraintlayout.motion.utils.CurveFit r0 = r1.mCurveFit
            return r0
    }

    public float getSlope(float r4) {
            r3 = this;
            androidx.constraintlayout.motion.utils.CurveFit r0 = r3.mCurveFit
            double r1 = (double) r4
            r4 = 0
            double r0 = r0.getSlope(r1, r4)
            float r4 = (float) r0
            return r4
    }

    public void setPoint(int r4, float r5) {
            r3 = this;
            int[] r0 = r3.mTimePoints
            int r1 = r0.length
            int r2 = r3.count
            int r2 = r2 + 1
            if (r1 >= r2) goto L1d
            int r1 = r0.length
            int r1 = r1 * 2
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.mTimePoints = r0
            float[] r0 = r3.mValues
            int r1 = r0.length
            int r1 = r1 * 2
            float[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.mValues = r0
        L1d:
            int[] r0 = r3.mTimePoints
            int r1 = r3.count
            r0[r1] = r4
            float[] r4 = r3.mValues
            r4[r1] = r5
            int r1 = r1 + 1
            r3.count = r1
            return
    }

    public abstract void setProperty(android.view.View r1, float r2);

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.mType = r1
            return
    }

    public void setup(int r10) {
            r9 = this;
            int r0 = r9.count
            if (r0 != 0) goto L5
            return
        L5:
            int[] r1 = r9.mTimePoints
            float[] r2 = r9.mValues
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            androidx.constraintlayout.motion.widget.SplineSet.Sort.doubleQuickSort(r1, r2, r4, r0)
            r0 = 1
            r1 = 1
        L11:
            int r2 = r9.count
            if (r0 >= r2) goto L24
            int[] r2 = r9.mTimePoints
            int r5 = r0 + (-1)
            r5 = r2[r5]
            r2 = r2[r0]
            if (r5 == r2) goto L21
            int r1 = r1 + 1
        L21:
            int r0 = r0 + 1
            goto L11
        L24:
            double[] r0 = new double[r1]
            r2 = 2
            int[] r2 = new int[r2]
            r2[r3] = r3
            r2[r4] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            double[][] r1 = (double[][]) r1
            r2 = 0
            r3 = 0
        L37:
            int r5 = r9.count
            if (r2 >= r5) goto L64
            if (r2 <= 0) goto L48
            int[] r5 = r9.mTimePoints
            r6 = r5[r2]
            int r7 = r2 + (-1)
            r5 = r5[r7]
            if (r6 != r5) goto L48
            goto L61
        L48:
            int[] r5 = r9.mTimePoints
            r5 = r5[r2]
            double r5 = (double) r5
            r7 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r5 = r5 * r7
            r0[r3] = r5
            r5 = r1[r3]
            float[] r6 = r9.mValues
            r6 = r6[r2]
            double r6 = (double) r6
            r5[r4] = r6
            int r3 = r3 + 1
        L61:
            int r2 = r2 + 1
            goto L37
        L64:
            androidx.constraintlayout.motion.utils.CurveFit r10 = androidx.constraintlayout.motion.utils.CurveFit.get(r10, r0, r1)
            r9.mCurveFit = r10
            return
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = r6.mType
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.lang.String r2 = "##.##"
            r1.<init>(r2)
            r2 = 0
        La:
            int r3 = r6.count
            if (r2 >= r3) goto L3f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "["
            r3.append(r0)
            int[] r0 = r6.mTimePoints
            r0 = r0[r2]
            r3.append(r0)
            java.lang.String r0 = " , "
            r3.append(r0)
            float[] r0 = r6.mValues
            r0 = r0[r2]
            double r4 = (double) r0
            java.lang.String r0 = r1.format(r4)
            r3.append(r0)
            java.lang.String r0 = "] "
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            int r2 = r2 + 1
            goto La
        L3f:
            return r0
    }
}
