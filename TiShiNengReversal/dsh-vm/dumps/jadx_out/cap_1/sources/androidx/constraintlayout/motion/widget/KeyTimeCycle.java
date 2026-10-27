package androidx.constraintlayout.motion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class KeyTimeCycle extends androidx.constraintlayout.motion.widget.Key {
    public static final int KEY_TYPE = 3;
    static final java.lang.String NAME = "KeyTimeCycle";
    private static final java.lang.String TAG = "KeyTimeCycle";
    private float mAlpha;
    private int mCurveFit;
    private float mElevation;
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
    private float mWaveOffset;
    private androidx.constraintlayout.motion.utils.CurveFit mWaveOffsetSpline;
    private float mWavePeriod;
    private androidx.constraintlayout.motion.utils.CurveFit mWavePeriodSpline;
    private int mWaveShape;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class Loader {
        private static final int ANDROID_ALPHA = 1;
        private static final int ANDROID_ELEVATION = 2;
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
        private static final int WAVE_OFFSET = 21;
        private static final int WAVE_PERIOD = 20;
        private static final int WAVE_SHAPE = 19;
        private static android.util.SparseIntArray mAttrMap;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap = r0
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_alpha
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_elevation
                r2 = 2
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_rotation
                r2 = 4
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_rotationX
                r2 = 5
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_rotationY
                r2 = 6
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_scaleX
                r2 = 7
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_transitionPathRotate
                r2 = 8
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_transitionEasing
                r2 = 9
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_motionTarget
                r2 = 10
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_framePosition
                r2 = 12
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_curveFit
                r2 = 13
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_scaleY
                r2 = 14
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_translationX
                r2 = 15
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_translationY
                r2 = 16
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_translationZ
                r2 = 17
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_motionProgress
                r2 = 18
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_wavePeriod
                r2 = 20
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_waveOffset
                r2 = 21
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_waveShape
                r2 = 19
                r0.append(r1, r2)
                return
        }

        private Loader() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void read(androidx.constraintlayout.motion.widget.KeyTimeCycle r5, android.content.res.TypedArray r6) {
                int r0 = r6.getIndexCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L142
                int r2 = r6.getIndex(r1)
                android.util.SparseIntArray r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                int r3 = r3.get(r2)
                switch(r3) {
                    case 1: goto L133;
                    case 2: goto L127;
                    case 3: goto L14;
                    case 4: goto L11b;
                    case 5: goto L10f;
                    case 6: goto L103;
                    case 7: goto Lf7;
                    case 8: goto Leb;
                    case 9: goto Le3;
                    case 10: goto Lb3;
                    case 11: goto L14;
                    case 12: goto La9;
                    case 13: goto L9c;
                    case 14: goto L8f;
                    case 15: goto L82;
                    case 16: goto L75;
                    case 17: goto L68;
                    case 18: goto L5b;
                    case 19: goto L4e;
                    case 20: goto L41;
                    case 21: goto L1e;
                    default: goto L14;
                }
            L14:
                java.lang.Integer.toHexString(r2)
                android.util.SparseIntArray r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.mAttrMap
                r3.get(r2)
                goto L13e
            L1e:
                android.util.TypedValue r3 = r6.peekValue(r2)
                int r3 = r3.type
                r4 = 5
                if (r3 != r4) goto L34
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$600(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$602(r5, r2)
                goto L13e
            L34:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$600(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$602(r5, r2)
                goto L13e
            L41:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$500(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$502(r5, r2)
                goto L13e
            L4e:
                int r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$400(r5)
                int r2 = r6.getInt(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$402(r5, r2)
                goto L13e
            L5b:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1600(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1602(r5, r2)
                goto L13e
            L68:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1500(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1502(r5, r2)
                goto L13e
            L75:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1400(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1402(r5, r2)
                goto L13e
            L82:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1300(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1302(r5, r2)
                goto L13e
            L8f:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1100(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1102(r5, r2)
                goto L13e
            L9c:
                int r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$300(r5)
                int r2 = r6.getInteger(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$302(r5, r2)
                goto L13e
            La9:
                int r3 = r5.mFramePosition
                int r2 = r6.getInt(r2, r3)
                r5.mFramePosition = r2
                goto L13e
            Lb3:
                boolean r3 = androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE
                if (r3 == 0) goto Lca
                int r3 = r5.mTargetId
                int r3 = r6.getResourceId(r2, r3)
                r5.mTargetId = r3
                r4 = -1
                if (r3 != r4) goto L13e
                java.lang.String r2 = r6.getString(r2)
                r5.mTargetString = r2
                goto L13e
            Lca:
                android.util.TypedValue r3 = r6.peekValue(r2)
                int r3 = r3.type
                r4 = 3
                if (r3 != r4) goto Lda
                java.lang.String r2 = r6.getString(r2)
                r5.mTargetString = r2
                goto L13e
            Lda:
                int r3 = r5.mTargetId
                int r2 = r6.getResourceId(r2, r3)
                r5.mTargetId = r2
                goto L13e
            Le3:
                java.lang.String r2 = r6.getString(r2)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1002(r5, r2)
                goto L13e
            Leb:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1200(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$1202(r5, r2)
                goto L13e
            Lf7:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$700(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$702(r5, r2)
                goto L13e
            L103:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$900(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$902(r5, r2)
                goto L13e
            L10f:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$800(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$802(r5, r2)
                goto L13e
            L11b:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$200(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$202(r5, r2)
                goto L13e
            L127:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$100(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$102(r5, r2)
                goto L13e
            L133:
                float r3 = androidx.constraintlayout.motion.widget.KeyTimeCycle.access$000(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyTimeCycle.access$002(r5, r2)
            L13e:
                int r1 = r1 + 1
                goto L5
            L142:
                return
        }
    }

    public KeyTimeCycle() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mCurveFit = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r2.mAlpha = r0
            r2.mElevation = r0
            r2.mRotation = r0
            r2.mRotationX = r0
            r2.mRotationY = r0
            r2.mTransitionPathRotate = r0
            r2.mScaleX = r0
            r2.mScaleY = r0
            r2.mTranslationX = r0
            r2.mTranslationY = r0
            r2.mTranslationZ = r0
            r2.mProgress = r0
            r1 = 0
            r2.mWaveShape = r1
            r2.mWavePeriod = r0
            r0 = 0
            r2.mWaveOffset = r0
            r0 = 3
            r2.mType = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mCustomConstraints = r0
            return
    }

    static /* synthetic */ float access$000(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mAlpha
            return r0
    }

    static /* synthetic */ float access$002(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mAlpha = r1
            return r1
    }

    static /* synthetic */ float access$100(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mElevation
            return r0
    }

    static /* synthetic */ java.lang.String access$1002(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, java.lang.String r1) {
            r0.mTransitionEasing = r1
            return r1
    }

    static /* synthetic */ float access$102(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mElevation = r1
            return r1
    }

    static /* synthetic */ float access$1100(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mScaleY
            return r0
    }

    static /* synthetic */ float access$1102(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mScaleY = r1
            return r1
    }

    static /* synthetic */ float access$1200(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mTransitionPathRotate
            return r0
    }

    static /* synthetic */ float access$1202(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mTransitionPathRotate = r1
            return r1
    }

    static /* synthetic */ float access$1300(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mTranslationX
            return r0
    }

    static /* synthetic */ float access$1302(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mTranslationX = r1
            return r1
    }

    static /* synthetic */ float access$1400(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mTranslationY
            return r0
    }

    static /* synthetic */ float access$1402(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mTranslationY = r1
            return r1
    }

    static /* synthetic */ float access$1500(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mTranslationZ
            return r0
    }

    static /* synthetic */ float access$1502(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mTranslationZ = r1
            return r1
    }

    static /* synthetic */ float access$1600(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mProgress
            return r0
    }

    static /* synthetic */ float access$1602(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mProgress = r1
            return r1
    }

    static /* synthetic */ float access$200(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mRotation
            return r0
    }

    static /* synthetic */ float access$202(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mRotation = r1
            return r1
    }

    static /* synthetic */ int access$300(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            int r0 = r0.mCurveFit
            return r0
    }

    static /* synthetic */ int access$302(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, int r1) {
            r0.mCurveFit = r1
            return r1
    }

    static /* synthetic */ int access$400(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            int r0 = r0.mWaveShape
            return r0
    }

    static /* synthetic */ int access$402(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, int r1) {
            r0.mWaveShape = r1
            return r1
    }

    static /* synthetic */ float access$500(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mWavePeriod
            return r0
    }

    static /* synthetic */ float access$502(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mWavePeriod = r1
            return r1
    }

    static /* synthetic */ float access$600(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mWaveOffset
            return r0
    }

    static /* synthetic */ float access$602(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mWaveOffset = r1
            return r1
    }

    static /* synthetic */ float access$700(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mScaleX
            return r0
    }

    static /* synthetic */ float access$702(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mScaleX = r1
            return r1
    }

    static /* synthetic */ float access$800(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mRotationX
            return r0
    }

    static /* synthetic */ float access$802(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mRotationX = r1
            return r1
    }

    static /* synthetic */ float access$900(androidx.constraintlayout.motion.widget.KeyTimeCycle r0) {
            float r0 = r0.mRotationY
            return r0
    }

    static /* synthetic */ float access$902(androidx.constraintlayout.motion.widget.KeyTimeCycle r0, float r1) {
            r0.mRotationY = r1
            return r1
    }

    public void addTimeValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> r11) {
            r10 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1ef
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.get(r1)
            r3 = r2
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet r3 = (androidx.constraintlayout.motion.widget.TimeCycleSplineSet) r3
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L42
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r10.mCustomConstraints
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
            if (r6 == 0) goto L8
            r4 = r3
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$CustomSet r4 = (androidx.constraintlayout.motion.widget.TimeCycleSplineSet.CustomSet) r4
            int r5 = r10.mFramePosition
            float r7 = r10.mWavePeriod
            int r8 = r10.mWaveShape
            float r9 = r10.mWaveOffset
            r4.setPoint(r5, r6, r7, r8, r9)
            goto L8
        L42:
            int r2 = r1.hashCode()
            r5 = -1
            switch(r2) {
                case -1249320806: goto Lcb;
                case -1249320805: goto Lc0;
                case -1225497657: goto Lb5;
                case -1225497656: goto Laa;
                case -1225497655: goto L9f;
                case -1001078227: goto L94;
                case -908189618: goto L89;
                case -908189617: goto L80;
                case -40300674: goto L74;
                case -4379043: goto L67;
                case 37232917: goto L5a;
                case 92909918: goto L4d;
                default: goto L4a;
            }
        L4a:
            r4 = -1
            goto Ld6
        L4d:
            java.lang.String r2 = "alpha"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L56
            goto L4a
        L56:
            r4 = 11
            goto Ld6
        L5a:
            java.lang.String r2 = "transitionPathRotate"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L63
            goto L4a
        L63:
            r4 = 10
            goto Ld6
        L67:
            java.lang.String r2 = "elevation"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L70
            goto L4a
        L70:
            r4 = 9
            goto Ld6
        L74:
            java.lang.String r2 = "rotation"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L7d
            goto L4a
        L7d:
            r4 = 8
            goto Ld6
        L80:
            java.lang.String r2 = "scaleY"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Ld6
            goto L4a
        L89:
            java.lang.String r2 = "scaleX"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L92
            goto L4a
        L92:
            r4 = 6
            goto Ld6
        L94:
            java.lang.String r2 = "progress"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L9d
            goto L4a
        L9d:
            r4 = 5
            goto Ld6
        L9f:
            java.lang.String r2 = "translationZ"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto La8
            goto L4a
        La8:
            r4 = 4
            goto Ld6
        Laa:
            java.lang.String r2 = "translationY"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lb3
            goto L4a
        Lb3:
            r4 = 3
            goto Ld6
        Lb5:
            java.lang.String r2 = "translationX"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lbe
            goto L4a
        Lbe:
            r4 = 2
            goto Ld6
        Lc0:
            java.lang.String r2 = "rotationY"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lc9
            goto L4a
        Lc9:
            r4 = 1
            goto Ld6
        Lcb:
            java.lang.String r2 = "rotationX"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Ld5
            goto L4a
        Ld5:
            r4 = 0
        Ld6:
            switch(r4) {
                case 0: goto L1d8;
                case 1: goto L1c1;
                case 2: goto L1aa;
                case 3: goto L193;
                case 4: goto L17c;
                case 5: goto L165;
                case 6: goto L14e;
                case 7: goto L137;
                case 8: goto L120;
                case 9: goto L109;
                case 10: goto Lf2;
                case 11: goto Ldb;
                default: goto Ld9;
            }
        Ld9:
            goto L8
        Ldb:
            float r1 = r10.mAlpha
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mAlpha
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        Lf2:
            float r1 = r10.mTransitionPathRotate
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mTransitionPathRotate
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L109:
            float r1 = r10.mElevation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mElevation
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L120:
            float r1 = r10.mRotation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mRotation
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L137:
            float r1 = r10.mScaleY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mScaleY
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L14e:
            float r1 = r10.mScaleX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mScaleX
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L165:
            float r1 = r10.mProgress
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mProgress
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L17c:
            float r1 = r10.mTranslationZ
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mTranslationZ
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L193:
            float r1 = r10.mTranslationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mTranslationY
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L1aa:
            float r1 = r10.mTranslationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mTranslationX
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L1c1:
            float r1 = r10.mRotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mRotationY
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L1d8:
            float r1 = r10.mRotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r10.mFramePosition
            float r5 = r10.mRotationX
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L8
        L1ef:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r2) {
            r1 = this;
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = " KeyTimeCycles do not support SplineSet"
            r2.<init>(r0)
            throw r2
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
            float r0 = r4.mTranslationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "translationX"
            r5.add(r0)
        L4e:
            float r0 = r4.mTranslationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "translationY"
            r5.add(r0)
        L5b:
            float r0 = r4.mTranslationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "translationZ"
            r5.add(r0)
        L68:
            float r0 = r4.mTransitionPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L75
            java.lang.String r0 = "transitionPathRotate"
            r5.add(r0)
        L75:
            float r0 = r4.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L82
            java.lang.String r0 = "scaleX"
            r5.add(r0)
        L82:
            float r0 = r4.mScaleY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8f
            java.lang.String r0 = "scaleY"
            r5.add(r0)
        L8f:
            float r0 = r4.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L9c
            java.lang.String r0 = "progress"
            r5.add(r0)
        L9c:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            int r0 = r0.size()
            if (r0 <= 0) goto Lcf
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lae:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lcf
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CUSTOM,"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r5.add(r1)
            goto Lae
        Lcf:
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
            int[] r0 = androidx.constraintlayout.widget.R.styleable.KeyTimeCycle
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.read(r1, r2)
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setInterpolation(java.util.HashMap<java.lang.String, java.lang.Integer> r5) {
            r4 = this;
            int r0 = r4.mCurveFit
            r1 = -1
            if (r0 != r1) goto L7
            goto L124
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
            float r0 = r4.mTranslationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L79
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationX"
            r5.put(r1, r0)
        L79:
            float r0 = r4.mTranslationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8c
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationY"
            r5.put(r1, r0)
        L8c:
            float r0 = r4.mTranslationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L9f
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationZ"
            r5.put(r1, r0)
        L9f:
            float r0 = r4.mTransitionPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb2
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "transitionPathRotate"
            r5.put(r1, r0)
        Lb2:
            float r0 = r4.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lc5
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleX"
            r5.put(r1, r0)
        Lc5:
            float r0 = r4.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Ld8
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleY"
            r5.put(r1, r0)
        Ld8:
            float r0 = r4.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Leb
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "progress"
            r5.put(r1, r0)
        Leb:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            int r0 = r0.size()
            if (r0 <= 0) goto L124
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lfd:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L124
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
            goto Lfd
        L124:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            r3.getClass()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1812823328: goto Lae;
                case -1249320806: goto La3;
                case -1249320805: goto L98;
                case -1225497657: goto L8d;
                case -1225497656: goto L82;
                case -1001078227: goto L77;
                case -908189618: goto L6c;
                case -908189617: goto L61;
                case -40300674: goto L53;
                case -4379043: goto L45;
                case 37232917: goto L37;
                case 92909918: goto L29;
                case 579057826: goto L1b;
                case 1317633238: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto Lb8
        Ld:
            java.lang.String r0 = "mTranslationZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L17
            goto Lb8
        L17:
            r1 = 13
            goto Lb8
        L1b:
            java.lang.String r0 = "curveFit"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L25
            goto Lb8
        L25:
            r1 = 12
            goto Lb8
        L29:
            java.lang.String r0 = "alpha"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L33
            goto Lb8
        L33:
            r1 = 11
            goto Lb8
        L37:
            java.lang.String r0 = "transitionPathRotate"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L41
            goto Lb8
        L41:
            r1 = 10
            goto Lb8
        L45:
            java.lang.String r0 = "elevation"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4f
            goto Lb8
        L4f:
            r1 = 9
            goto Lb8
        L53:
            java.lang.String r0 = "rotation"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5d
            goto Lb8
        L5d:
            r1 = 8
            goto Lb8
        L61:
            java.lang.String r0 = "scaleY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6a
            goto Lb8
        L6a:
            r1 = 7
            goto Lb8
        L6c:
            java.lang.String r0 = "scaleX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L75
            goto Lb8
        L75:
            r1 = 6
            goto Lb8
        L77:
            java.lang.String r0 = "progress"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L80
            goto Lb8
        L80:
            r1 = 5
            goto Lb8
        L82:
            java.lang.String r0 = "translationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L8b
            goto Lb8
        L8b:
            r1 = 4
            goto Lb8
        L8d:
            java.lang.String r0 = "translationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L96
            goto Lb8
        L96:
            r1 = 3
            goto Lb8
        L98:
            java.lang.String r0 = "rotationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La1
            goto Lb8
        La1:
            r1 = 2
            goto Lb8
        La3:
            java.lang.String r0 = "rotationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lac
            goto Lb8
        Lac:
            r1 = 1
            goto Lb8
        Lae:
            java.lang.String r0 = "transitionEasing"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lb7
            goto Lb8
        Lb7:
            r1 = 0
        Lb8:
            switch(r1) {
                case 0: goto L117;
                case 1: goto L110;
                case 2: goto L109;
                case 3: goto L102;
                case 4: goto Lfb;
                case 5: goto Lf4;
                case 6: goto Led;
                case 7: goto Le6;
                case 8: goto Ldf;
                case 9: goto Ld8;
                case 10: goto Ld1;
                case 11: goto Lca;
                case 12: goto Lc3;
                case 13: goto Lbc;
                default: goto Lbb;
            }
        Lbb:
            return
        Lbc:
            float r3 = r2.toFloat(r4)
            r2.mTranslationZ = r3
            return
        Lc3:
            int r3 = r2.toInt(r4)
            r2.mCurveFit = r3
            return
        Lca:
            float r3 = r2.toFloat(r4)
            r2.mAlpha = r3
            return
        Ld1:
            float r3 = r2.toFloat(r4)
            r2.mTransitionPathRotate = r3
            return
        Ld8:
            float r3 = r2.toFloat(r4)
            r2.mElevation = r3
            return
        Ldf:
            float r3 = r2.toFloat(r4)
            r2.mRotation = r3
            return
        Le6:
            float r3 = r2.toFloat(r4)
            r2.mScaleY = r3
            return
        Led:
            float r3 = r2.toFloat(r4)
            r2.mScaleX = r3
            return
        Lf4:
            float r3 = r2.toFloat(r4)
            r2.mProgress = r3
            return
        Lfb:
            float r3 = r2.toFloat(r4)
            r2.mTranslationY = r3
            return
        L102:
            float r3 = r2.toFloat(r4)
            r2.mTranslationX = r3
            return
        L109:
            float r3 = r2.toFloat(r4)
            r2.mRotationY = r3
            return
        L110:
            float r3 = r2.toFloat(r4)
            r2.mRotationX = r3
            return
        L117:
            java.lang.String r3 = r4.toString()
            r2.mTransitionEasing = r3
            return
    }
}
