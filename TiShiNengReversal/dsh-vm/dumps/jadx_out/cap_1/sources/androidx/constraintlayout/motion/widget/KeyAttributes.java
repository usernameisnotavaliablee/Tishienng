package androidx.constraintlayout.motion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class KeyAttributes extends androidx.constraintlayout.motion.widget.Key {
    public static final int KEY_TYPE = 1;
    static final java.lang.String NAME = "KeyAttribute";
    private static final java.lang.String TAG = "KeyAttribute";
    private float mAlpha;
    private int mCurveFit;
    private float mElevation;
    private float mPivotX;
    private float mPivotY;
    private float mProgress;
    private float mRotation;
    private float mRotationX;
    private float mRotationY;
    private float mScaleX;
    private float mScaleY;
    private java.lang.String mTransitionEasing;
    private float mTransitionPathRotate;
    private float mTranslationX;
    private float mTranslationY;
    private float mTranslationZ;
    private boolean mVisibility;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class Loader {
        private static final int ANDROID_ALPHA = 1;
        private static final int ANDROID_ELEVATION = 2;
        private static final int ANDROID_PIVOT_X = 19;
        private static final int ANDROID_PIVOT_Y = 20;
        private static final int ANDROID_ROTATION = 4;
        private static final int ANDROID_ROTATION_X = 5;
        private static final int ANDROID_ROTATION_Y = 6;
        private static final int ANDROID_SCALE_X = 7;
        private static final int ANDROID_SCALE_Y = 14;
        private static final int ANDROID_TRANSLATION_X = 15;
        private static final int ANDROID_TRANSLATION_Y = 16;
        private static final int ANDROID_TRANSLATION_Z = 17;
        private static final int CURVE_FIT = 13;
        private static final int FRAME_POSITION = 12;
        private static final int PROGRESS = 18;
        private static final int TARGET_ID = 10;
        private static final int TRANSITION_EASING = 9;
        private static final int TRANSITION_PATH_ROTATE = 8;
        private static android.util.SparseIntArray mAttrMap;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap = r0
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_alpha
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_elevation
                r2 = 2
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_rotation
                r2 = 4
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_rotationX
                r2 = 5
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_rotationY
                r2 = 6
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_transformPivotX
                r2 = 19
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_transformPivotY
                r2 = 20
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_scaleX
                r2 = 7
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_transitionPathRotate
                r2 = 8
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_transitionEasing
                r2 = 9
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_motionTarget
                r2 = 10
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_framePosition
                r2 = 12
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_curveFit
                r2 = 13
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_scaleY
                r2 = 14
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_translationX
                r2 = 15
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_translationY
                r2 = 16
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_translationZ
                r2 = 17
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyAttribute_motionProgress
                r2 = 18
                r0.append(r1, r2)
                return
        }

        private Loader() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void read(androidx.constraintlayout.motion.widget.KeyAttributes r5, android.content.res.TypedArray r6) {
                int r0 = r6.getIndexCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L11f
                int r2 = r6.getIndex(r1)
                android.util.SparseIntArray r3 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                int r3 = r3.get(r2)
                switch(r3) {
                    case 1: goto L110;
                    case 2: goto L104;
                    case 3: goto L14;
                    case 4: goto Lf8;
                    case 5: goto Lec;
                    case 6: goto Le0;
                    case 7: goto Ld4;
                    case 8: goto Lc8;
                    case 9: goto Lc0;
                    case 10: goto L90;
                    case 11: goto L14;
                    case 12: goto L86;
                    case 13: goto L79;
                    case 14: goto L6c;
                    case 15: goto L5f;
                    case 16: goto L52;
                    case 17: goto L45;
                    case 18: goto L38;
                    case 19: goto L2b;
                    case 20: goto L1e;
                    default: goto L14;
                }
            L14:
                java.lang.Integer.toHexString(r2)
                android.util.SparseIntArray r3 = androidx.constraintlayout.motion.widget.KeyAttributes.Loader.mAttrMap
                r3.get(r2)
                goto L11b
            L1e:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$800(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$802(r5, r2)
                goto L11b
            L2b:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$700(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$702(r5, r2)
                goto L11b
            L38:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$1500(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$1502(r5, r2)
                goto L11b
            L45:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$1400(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$1402(r5, r2)
                goto L11b
            L52:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$1300(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$1302(r5, r2)
                goto L11b
            L5f:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$1200(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$1202(r5, r2)
                goto L11b
            L6c:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$1000(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$1002(r5, r2)
                goto L11b
            L79:
                int r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$300(r5)
                int r2 = r6.getInteger(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$302(r5, r2)
                goto L11b
            L86:
                int r3 = r5.mFramePosition
                int r2 = r6.getInt(r2, r3)
                r5.mFramePosition = r2
                goto L11b
            L90:
                boolean r3 = androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE
                if (r3 == 0) goto La7
                int r3 = r5.mTargetId
                int r3 = r6.getResourceId(r2, r3)
                r5.mTargetId = r3
                r4 = -1
                if (r3 != r4) goto L11b
                java.lang.String r2 = r6.getString(r2)
                r5.mTargetString = r2
                goto L11b
            La7:
                android.util.TypedValue r3 = r6.peekValue(r2)
                int r3 = r3.type
                r4 = 3
                if (r3 != r4) goto Lb7
                java.lang.String r2 = r6.getString(r2)
                r5.mTargetString = r2
                goto L11b
            Lb7:
                int r3 = r5.mTargetId
                int r2 = r6.getResourceId(r2, r3)
                r5.mTargetId = r2
                goto L11b
            Lc0:
                java.lang.String r2 = r6.getString(r2)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$902(r5, r2)
                goto L11b
            Lc8:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$1100(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$1102(r5, r2)
                goto L11b
            Ld4:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$400(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$402(r5, r2)
                goto L11b
            Le0:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$600(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$602(r5, r2)
                goto L11b
            Lec:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$500(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$502(r5, r2)
                goto L11b
            Lf8:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$200(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$202(r5, r2)
                goto L11b
            L104:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$100(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$102(r5, r2)
                goto L11b
            L110:
                float r3 = androidx.constraintlayout.motion.widget.KeyAttributes.access$000(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyAttributes.access$002(r5, r2)
            L11b:
                int r1 = r1 + 1
                goto L5
            L11f:
                return
        }
    }

    public KeyAttributes() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mCurveFit = r0
            r0 = 0
            r1.mVisibility = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.mAlpha = r0
            r1.mElevation = r0
            r1.mRotation = r0
            r1.mRotationX = r0
            r1.mRotationY = r0
            r1.mPivotX = r0
            r1.mPivotY = r0
            r1.mTransitionPathRotate = r0
            r1.mScaleX = r0
            r1.mScaleY = r0
            r1.mTranslationX = r0
            r1.mTranslationY = r0
            r1.mTranslationZ = r0
            r1.mProgress = r0
            r0 = 1
            r1.mType = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mCustomConstraints = r0
            return
    }

    static /* synthetic */ float access$000(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mAlpha
            return r0
    }

    static /* synthetic */ float access$002(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mAlpha = r1
            return r1
    }

    static /* synthetic */ float access$100(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mElevation
            return r0
    }

    static /* synthetic */ float access$1000(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mScaleY
            return r0
    }

    static /* synthetic */ float access$1002(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mScaleY = r1
            return r1
    }

    static /* synthetic */ float access$102(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mElevation = r1
            return r1
    }

    static /* synthetic */ float access$1100(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mTransitionPathRotate
            return r0
    }

    static /* synthetic */ float access$1102(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mTransitionPathRotate = r1
            return r1
    }

    static /* synthetic */ float access$1200(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mTranslationX
            return r0
    }

    static /* synthetic */ float access$1202(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mTranslationX = r1
            return r1
    }

    static /* synthetic */ float access$1300(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mTranslationY
            return r0
    }

    static /* synthetic */ float access$1302(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mTranslationY = r1
            return r1
    }

    static /* synthetic */ float access$1400(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mTranslationZ
            return r0
    }

    static /* synthetic */ float access$1402(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mTranslationZ = r1
            return r1
    }

    static /* synthetic */ float access$1500(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mProgress
            return r0
    }

    static /* synthetic */ float access$1502(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mProgress = r1
            return r1
    }

    static /* synthetic */ float access$200(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mRotation
            return r0
    }

    static /* synthetic */ float access$202(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mRotation = r1
            return r1
    }

    static /* synthetic */ int access$300(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            int r0 = r0.mCurveFit
            return r0
    }

    static /* synthetic */ int access$302(androidx.constraintlayout.motion.widget.KeyAttributes r0, int r1) {
            r0.mCurveFit = r1
            return r1
    }

    static /* synthetic */ float access$400(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mScaleX
            return r0
    }

    static /* synthetic */ float access$402(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mScaleX = r1
            return r1
    }

    static /* synthetic */ float access$500(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mRotationX
            return r0
    }

    static /* synthetic */ float access$502(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mRotationX = r1
            return r1
    }

    static /* synthetic */ float access$600(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mRotationY
            return r0
    }

    static /* synthetic */ float access$602(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mRotationY = r1
            return r1
    }

    static /* synthetic */ float access$700(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mPivotX
            return r0
    }

    static /* synthetic */ float access$702(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mPivotX = r1
            return r1
    }

    static /* synthetic */ float access$800(androidx.constraintlayout.motion.widget.KeyAttributes r0) {
            float r0 = r0.mPivotY
            return r0
    }

    static /* synthetic */ float access$802(androidx.constraintlayout.motion.widget.KeyAttributes r0, float r1) {
            r0.mPivotY = r1
            return r1
    }

    static /* synthetic */ java.lang.String access$902(androidx.constraintlayout.motion.widget.KeyAttributes r0, java.lang.String r1) {
            r0.mTransitionEasing = r1
            return r1
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r7) {
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1dd
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            androidx.constraintlayout.motion.widget.SplineSet r2 = (androidx.constraintlayout.motion.widget.SplineSet) r2
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L39
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r6.mCustomConstraints
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
            if (r1 == 0) goto L8
            androidx.constraintlayout.motion.widget.SplineSet$CustomSet r2 = (androidx.constraintlayout.motion.widget.SplineSet.CustomSet) r2
            int r3 = r6.mFramePosition
            r2.setPoint(r3, r1)
            goto L8
        L39:
            int r3 = r1.hashCode()
            r5 = -1
            switch(r3) {
                case -1249320806: goto Ldf;
                case -1249320805: goto Ld3;
                case -1225497657: goto Lc7;
                case -1225497656: goto Lbb;
                case -1225497655: goto Lb0;
                case -1001078227: goto La5;
                case -908189618: goto L9a;
                case -908189617: goto L91;
                case -760884510: goto L85;
                case -760884509: goto L78;
                case -40300674: goto L6b;
                case -4379043: goto L5e;
                case 37232917: goto L51;
                case 92909918: goto L44;
                default: goto L41;
            }
        L41:
            r4 = -1
            goto Lea
        L44:
            java.lang.String r3 = "alpha"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L4d
            goto L41
        L4d:
            r4 = 13
            goto Lea
        L51:
            java.lang.String r3 = "transitionPathRotate"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L5a
            goto L41
        L5a:
            r4 = 12
            goto Lea
        L5e:
            java.lang.String r3 = "elevation"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L67
            goto L41
        L67:
            r4 = 11
            goto Lea
        L6b:
            java.lang.String r3 = "rotation"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L74
            goto L41
        L74:
            r4 = 10
            goto Lea
        L78:
            java.lang.String r3 = "transformPivotY"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L81
            goto L41
        L81:
            r4 = 9
            goto Lea
        L85:
            java.lang.String r3 = "transformPivotX"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L8e
            goto L41
        L8e:
            r4 = 8
            goto Lea
        L91:
            java.lang.String r3 = "scaleY"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lea
            goto L41
        L9a:
            java.lang.String r3 = "scaleX"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto La3
            goto L41
        La3:
            r4 = 6
            goto Lea
        La5:
            java.lang.String r3 = "progress"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lae
            goto L41
        Lae:
            r4 = 5
            goto Lea
        Lb0:
            java.lang.String r3 = "translationZ"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lb9
            goto L41
        Lb9:
            r4 = 4
            goto Lea
        Lbb:
            java.lang.String r3 = "translationY"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lc5
            goto L41
        Lc5:
            r4 = 3
            goto Lea
        Lc7:
            java.lang.String r3 = "translationX"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Ld1
            goto L41
        Ld1:
            r4 = 2
            goto Lea
        Ld3:
            java.lang.String r3 = "rotationY"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Ldd
            goto L41
        Ldd:
            r4 = 1
            goto Lea
        Ldf:
            java.lang.String r3 = "rotationX"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Le9
            goto L41
        Le9:
            r4 = 0
        Lea:
            switch(r4) {
                case 0: goto L1cc;
                case 1: goto L1bb;
                case 2: goto L1aa;
                case 3: goto L199;
                case 4: goto L188;
                case 5: goto L177;
                case 6: goto L166;
                case 7: goto L155;
                case 8: goto L144;
                case 9: goto L133;
                case 10: goto L122;
                case 11: goto L111;
                case 12: goto L100;
                case 13: goto Lef;
                default: goto Led;
            }
        Led:
            goto L8
        Lef:
            float r1 = r6.mAlpha
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mAlpha
            r2.setPoint(r1, r3)
            goto L8
        L100:
            float r1 = r6.mTransitionPathRotate
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mTransitionPathRotate
            r2.setPoint(r1, r3)
            goto L8
        L111:
            float r1 = r6.mElevation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mElevation
            r2.setPoint(r1, r3)
            goto L8
        L122:
            float r1 = r6.mRotation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mRotation
            r2.setPoint(r1, r3)
            goto L8
        L133:
            float r1 = r6.mRotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mPivotY
            r2.setPoint(r1, r3)
            goto L8
        L144:
            float r1 = r6.mRotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mPivotX
            r2.setPoint(r1, r3)
            goto L8
        L155:
            float r1 = r6.mScaleY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mScaleY
            r2.setPoint(r1, r3)
            goto L8
        L166:
            float r1 = r6.mScaleX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mScaleX
            r2.setPoint(r1, r3)
            goto L8
        L177:
            float r1 = r6.mProgress
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mProgress
            r2.setPoint(r1, r3)
            goto L8
        L188:
            float r1 = r6.mTranslationZ
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mTranslationZ
            r2.setPoint(r1, r3)
            goto L8
        L199:
            float r1 = r6.mTranslationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mTranslationY
            r2.setPoint(r1, r3)
            goto L8
        L1aa:
            float r1 = r6.mTranslationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mTranslationX
            r2.setPoint(r1, r3)
            goto L8
        L1bb:
            float r1 = r6.mRotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mRotationY
            r2.setPoint(r1, r3)
            goto L8
        L1cc:
            float r1 = r6.mRotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mRotationX
            r2.setPoint(r1, r3)
            goto L8
        L1dd:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(java.util.HashSet<java.lang.String> r5) {
            r4 = this;
            float r0 = r4.mAlpha
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Ld
            java.lang.String r0 = "alpha"
            r5.add(r0)
        Ld:
            float r0 = r4.mElevation
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "elevation"
            r5.add(r0)
        L1a:
            float r0 = r4.mRotation
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L27
            java.lang.String r0 = "rotation"
            r5.add(r0)
        L27:
            float r0 = r4.mRotationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L34
            java.lang.String r0 = "rotationX"
            r5.add(r0)
        L34:
            float r0 = r4.mRotationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L41
            java.lang.String r0 = "rotationY"
            r5.add(r0)
        L41:
            float r0 = r4.mPivotX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "transformPivotX"
            r5.add(r0)
        L4e:
            float r0 = r4.mPivotY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "transformPivotY"
            r5.add(r0)
        L5b:
            float r0 = r4.mTranslationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "translationX"
            r5.add(r0)
        L68:
            float r0 = r4.mTranslationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L75
            java.lang.String r0 = "translationY"
            r5.add(r0)
        L75:
            float r0 = r4.mTranslationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L82
            java.lang.String r0 = "translationZ"
            r5.add(r0)
        L82:
            float r0 = r4.mTransitionPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8f
            java.lang.String r0 = "transitionPathRotate"
            r5.add(r0)
        L8f:
            float r0 = r4.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L9c
            java.lang.String r0 = "scaleX"
            r5.add(r0)
        L9c:
            float r0 = r4.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto La9
            java.lang.String r0 = "scaleY"
            r5.add(r0)
        La9:
            float r0 = r4.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb6
            java.lang.String r0 = "progress"
            r5.add(r0)
        Lb6:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            int r0 = r0.size()
            if (r0 <= 0) goto Le9
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lc8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le9
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CUSTOM,"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r5.add(r1)
            goto Lc8
        Le9:
            return
    }

    int getCurveFit() {
            r1 = this;
            int r0 = r1.mCurveFit
            return r0
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int[] r0 = androidx.constraintlayout.widget.R.styleable.KeyAttribute
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            androidx.constraintlayout.motion.widget.KeyAttributes.Loader.read(r1, r2)
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setInterpolation(java.util.HashMap<java.lang.String, java.lang.Integer> r5) {
            r4 = this;
            int r0 = r4.mCurveFit
            r1 = -1
            if (r0 != r1) goto L7
            goto L14a
        L7:
            float r0 = r4.mAlpha
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L1a
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "alpha"
            r5.put(r1, r0)
        L1a:
            float r0 = r4.mElevation
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L2d
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "elevation"
            r5.put(r1, r0)
        L2d:
            float r0 = r4.mRotation
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L40
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotation"
            r5.put(r1, r0)
        L40:
            float r0 = r4.mRotationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L53
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotationX"
            r5.put(r1, r0)
        L53:
            float r0 = r4.mRotationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L66
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotationY"
            r5.put(r1, r0)
        L66:
            float r0 = r4.mPivotX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L79
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "transformPivotX"
            r5.put(r1, r0)
        L79:
            float r0 = r4.mPivotY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8c
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "transformPivotY"
            r5.put(r1, r0)
        L8c:
            float r0 = r4.mTranslationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L9f
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationX"
            r5.put(r1, r0)
        L9f:
            float r0 = r4.mTranslationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb2
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationY"
            r5.put(r1, r0)
        Lb2:
            float r0 = r4.mTranslationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lc5
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationZ"
            r5.put(r1, r0)
        Lc5:
            float r0 = r4.mTransitionPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Ld8
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "transitionPathRotate"
            r5.put(r1, r0)
        Ld8:
            float r0 = r4.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Leb
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleX"
            r5.put(r1, r0)
        Leb:
            float r0 = r4.mScaleY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lfe
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleY"
            r5.put(r1, r0)
        Lfe:
            float r0 = r4.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L111
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "progress"
            r5.put(r1, r0)
        L111:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            int r0 = r0.size()
            if (r0 <= 0) goto L14a
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L123:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CUSTOM,"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            int r2 = r4.mCurveFit
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.put(r1, r2)
            goto L123
        L14a:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            r3.getClass()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1913008125: goto Ld9;
                case -1812823328: goto Lce;
                case -1249320806: goto Lc3;
                case -1249320805: goto Lb8;
                case -1225497657: goto Lad;
                case -1225497656: goto La2;
                case -987906986: goto L97;
                case -987906985: goto L8c;
                case -908189618: goto L7e;
                case -908189617: goto L70;
                case -40300674: goto L62;
                case -4379043: goto L54;
                case 37232917: goto L46;
                case 92909918: goto L38;
                case 579057826: goto L2a;
                case 1317633238: goto L1c;
                case 1941332754: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto Le3
        Ld:
            java.lang.String r0 = "visibility"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L18
            goto Le3
        L18:
            r1 = 16
            goto Le3
        L1c:
            java.lang.String r0 = "mTranslationZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L26
            goto Le3
        L26:
            r1 = 15
            goto Le3
        L2a:
            java.lang.String r0 = "curveFit"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L34
            goto Le3
        L34:
            r1 = 14
            goto Le3
        L38:
            java.lang.String r0 = "alpha"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L42
            goto Le3
        L42:
            r1 = 13
            goto Le3
        L46:
            java.lang.String r0 = "transitionPathRotate"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L50
            goto Le3
        L50:
            r1 = 12
            goto Le3
        L54:
            java.lang.String r0 = "elevation"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5e
            goto Le3
        L5e:
            r1 = 11
            goto Le3
        L62:
            java.lang.String r0 = "rotation"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6c
            goto Le3
        L6c:
            r1 = 10
            goto Le3
        L70:
            java.lang.String r0 = "scaleY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L7a
            goto Le3
        L7a:
            r1 = 9
            goto Le3
        L7e:
            java.lang.String r0 = "scaleX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L88
            goto Le3
        L88:
            r1 = 8
            goto Le3
        L8c:
            java.lang.String r0 = "pivotY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L95
            goto Le3
        L95:
            r1 = 7
            goto Le3
        L97:
            java.lang.String r0 = "pivotX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La0
            goto Le3
        La0:
            r1 = 6
            goto Le3
        La2:
            java.lang.String r0 = "translationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lab
            goto Le3
        Lab:
            r1 = 5
            goto Le3
        Lad:
            java.lang.String r0 = "translationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lb6
            goto Le3
        Lb6:
            r1 = 4
            goto Le3
        Lb8:
            java.lang.String r0 = "rotationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lc1
            goto Le3
        Lc1:
            r1 = 3
            goto Le3
        Lc3:
            java.lang.String r0 = "rotationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lcc
            goto Le3
        Lcc:
            r1 = 2
            goto Le3
        Lce:
            java.lang.String r0 = "transitionEasing"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld7
            goto Le3
        Ld7:
            r1 = 1
            goto Le3
        Ld9:
            java.lang.String r0 = "motionProgress"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Le2
            goto Le3
        Le2:
            r1 = 0
        Le3:
            switch(r1) {
                case 0: goto L157;
                case 1: goto L150;
                case 2: goto L149;
                case 3: goto L142;
                case 4: goto L13b;
                case 5: goto L134;
                case 6: goto L12d;
                case 7: goto L126;
                case 8: goto L11f;
                case 9: goto L118;
                case 10: goto L111;
                case 11: goto L10a;
                case 12: goto L103;
                case 13: goto Lfc;
                case 14: goto Lf5;
                case 15: goto Lee;
                case 16: goto Le7;
                default: goto Le6;
            }
        Le6:
            return
        Le7:
            boolean r3 = r2.toBoolean(r4)
            r2.mVisibility = r3
            return
        Lee:
            float r3 = r2.toFloat(r4)
            r2.mTranslationZ = r3
            return
        Lf5:
            int r3 = r2.toInt(r4)
            r2.mCurveFit = r3
            return
        Lfc:
            float r3 = r2.toFloat(r4)
            r2.mAlpha = r3
            return
        L103:
            float r3 = r2.toFloat(r4)
            r2.mTransitionPathRotate = r3
            return
        L10a:
            float r3 = r2.toFloat(r4)
            r2.mElevation = r3
            return
        L111:
            float r3 = r2.toFloat(r4)
            r2.mRotation = r3
            return
        L118:
            float r3 = r2.toFloat(r4)
            r2.mScaleY = r3
            return
        L11f:
            float r3 = r2.toFloat(r4)
            r2.mScaleX = r3
            return
        L126:
            float r3 = r2.toFloat(r4)
            r2.mPivotY = r3
            return
        L12d:
            float r3 = r2.toFloat(r4)
            r2.mPivotX = r3
            return
        L134:
            float r3 = r2.toFloat(r4)
            r2.mTranslationY = r3
            return
        L13b:
            float r3 = r2.toFloat(r4)
            r2.mTranslationX = r3
            return
        L142:
            float r3 = r2.toFloat(r4)
            r2.mRotationY = r3
            return
        L149:
            float r3 = r2.toFloat(r4)
            r2.mRotationX = r3
            return
        L150:
            java.lang.String r3 = r4.toString()
            r2.mTransitionEasing = r3
            return
        L157:
            float r3 = r2.toFloat(r4)
            r2.mProgress = r3
            return
    }
}
