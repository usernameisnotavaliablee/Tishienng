package androidx.constraintlayout.motion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class KeyCycle extends androidx.constraintlayout.motion.widget.Key {
    public static final int KEY_TYPE = 4;
    static final java.lang.String NAME = "KeyCycle";
    private static final java.lang.String TAG = "KeyCycle";
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
    private float mWavePeriod;
    private int mWaveShape;
    private int mWaveVariesBy;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class Loader {
        private static final int ANDROID_ALPHA = 9;
        private static final int ANDROID_ELEVATION = 10;
        private static final int ANDROID_ROTATION = 11;
        private static final int ANDROID_ROTATION_X = 12;
        private static final int ANDROID_ROTATION_Y = 13;
        private static final int ANDROID_SCALE_X = 15;
        private static final int ANDROID_SCALE_Y = 16;
        private static final int ANDROID_TRANSLATION_X = 17;
        private static final int ANDROID_TRANSLATION_Y = 18;
        private static final int ANDROID_TRANSLATION_Z = 19;
        private static final int CURVE_FIT = 4;
        private static final int FRAME_POSITION = 2;
        private static final int PROGRESS = 20;
        private static final int TARGET_ID = 1;
        private static final int TRANSITION_EASING = 3;
        private static final int TRANSITION_PATH_ROTATE = 14;
        private static final int WAVE_OFFSET = 7;
        private static final int WAVE_PERIOD = 6;
        private static final int WAVE_SHAPE = 5;
        private static final int WAVE_VARIES_BY = 8;
        private static android.util.SparseIntArray mAttrMap;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap = r0
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_motionTarget
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_framePosition
                r2 = 2
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_transitionEasing
                r2 = 3
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_curveFit
                r2 = 4
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_waveShape
                r2 = 5
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_wavePeriod
                r2 = 6
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_waveOffset
                r2 = 7
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_waveVariesBy
                r2 = 8
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_android_alpha
                r2 = 9
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_android_elevation
                r2 = 10
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_android_rotation
                r2 = 11
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_android_rotationX
                r2 = 12
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_android_rotationY
                r2 = 13
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_transitionPathRotate
                r2 = 14
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_android_scaleX
                r2 = 15
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_android_scaleY
                r2 = 16
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_android_translationX
                r2 = 17
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_android_translationY
                r2 = 18
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_android_translationZ
                r2 = 19
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.R.styleable.KeyCycle_motionProgress
                r2 = 20
                r0.append(r1, r2)
                return
        }

        private Loader() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ void access$000(androidx.constraintlayout.motion.widget.KeyCycle r0, android.content.res.TypedArray r1) {
                read(r0, r1)
                return
        }

        private static void read(androidx.constraintlayout.motion.widget.KeyCycle r5, android.content.res.TypedArray r6) {
                int r0 = r6.getIndexCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L150
                int r2 = r6.getIndex(r1)
                android.util.SparseIntArray r3 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                int r3 = r3.get(r2)
                switch(r3) {
                    case 1: goto L11e;
                    case 2: goto L115;
                    case 3: goto L10d;
                    case 4: goto L101;
                    case 5: goto Lf5;
                    case 6: goto Le9;
                    case 7: goto Lc7;
                    case 8: goto Lba;
                    case 9: goto Lad;
                    case 10: goto La0;
                    case 11: goto L93;
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
                android.util.SparseIntArray r3 = androidx.constraintlayout.motion.widget.KeyCycle.Loader.mAttrMap
                r3.get(r2)
                goto L14c
            L1e:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1800(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1802(r5, r2)
                goto L14c
            L2b:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1700(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1702(r5, r2)
                goto L14c
            L38:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1600(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1602(r5, r2)
                goto L14c
            L45:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1500(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1502(r5, r2)
                goto L14c
            L52:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1400(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1402(r5, r2)
                goto L14c
            L5f:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1300(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1302(r5, r2)
                goto L14c
            L6c:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1200(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1202(r5, r2)
                goto L14c
            L79:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1100(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1102(r5, r2)
                goto L14c
            L86:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$1000(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$1002(r5, r2)
                goto L14c
            L93:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$900(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$902(r5, r2)
                goto L14c
            La0:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$800(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$802(r5, r2)
                goto L14c
            Lad:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$700(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$702(r5, r2)
                goto L14c
            Lba:
                int r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$600(r5)
                int r2 = r6.getInt(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$602(r5, r2)
                goto L14c
            Lc7:
                android.util.TypedValue r3 = r6.peekValue(r2)
                int r3 = r3.type
                r4 = 5
                if (r3 != r4) goto Ldd
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$500(r5)
                float r2 = r6.getDimension(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$502(r5, r2)
                goto L14c
            Ldd:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$500(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$502(r5, r2)
                goto L14c
            Le9:
                float r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$400(r5)
                float r2 = r6.getFloat(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$402(r5, r2)
                goto L14c
            Lf5:
                int r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$300(r5)
                int r2 = r6.getInt(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$302(r5, r2)
                goto L14c
            L101:
                int r3 = androidx.constraintlayout.motion.widget.KeyCycle.access$200(r5)
                int r2 = r6.getInteger(r2, r3)
                androidx.constraintlayout.motion.widget.KeyCycle.access$202(r5, r2)
                goto L14c
            L10d:
                java.lang.String r2 = r6.getString(r2)
                androidx.constraintlayout.motion.widget.KeyCycle.access$102(r5, r2)
                goto L14c
            L115:
                int r3 = r5.mFramePosition
                int r2 = r6.getInt(r2, r3)
                r5.mFramePosition = r2
                goto L14c
            L11e:
                boolean r3 = androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE
                if (r3 == 0) goto L134
                int r3 = r5.mTargetId
                int r3 = r6.getResourceId(r2, r3)
                r5.mTargetId = r3
                r4 = -1
                if (r3 != r4) goto L14c
                java.lang.String r2 = r6.getString(r2)
                r5.mTargetString = r2
                goto L14c
            L134:
                android.util.TypedValue r3 = r6.peekValue(r2)
                int r3 = r3.type
                r4 = 3
                if (r3 != r4) goto L144
                java.lang.String r2 = r6.getString(r2)
                r5.mTargetString = r2
                goto L14c
            L144:
                int r3 = r5.mTargetId
                int r2 = r6.getResourceId(r2, r3)
                r5.mTargetId = r2
            L14c:
                int r1 = r1 + 1
                goto L5
            L150:
                return
        }
    }

    public KeyCycle() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mTransitionEasing = r0
            r0 = 0
            r3.mCurveFit = r0
            r0 = -1
            r3.mWaveShape = r0
            r1 = 2143289344(0x7fc00000, float:NaN)
            r3.mWavePeriod = r1
            r2 = 0
            r3.mWaveOffset = r2
            r3.mProgress = r1
            r3.mWaveVariesBy = r0
            r3.mAlpha = r1
            r3.mElevation = r1
            r3.mRotation = r1
            r3.mTransitionPathRotate = r1
            r3.mRotationX = r1
            r3.mRotationY = r1
            r3.mScaleX = r1
            r3.mScaleY = r1
            r3.mTranslationX = r1
            r3.mTranslationY = r1
            r3.mTranslationZ = r1
            r0 = 4
            r3.mType = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.mCustomConstraints = r0
            return
    }

    static /* synthetic */ float access$1000(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mRotationX
            return r0
    }

    static /* synthetic */ float access$1002(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mRotationX = r1
            return r1
    }

    static /* synthetic */ java.lang.String access$102(androidx.constraintlayout.motion.widget.KeyCycle r0, java.lang.String r1) {
            r0.mTransitionEasing = r1
            return r1
    }

    static /* synthetic */ float access$1100(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mRotationY
            return r0
    }

    static /* synthetic */ float access$1102(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mRotationY = r1
            return r1
    }

    static /* synthetic */ float access$1200(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mTransitionPathRotate
            return r0
    }

    static /* synthetic */ float access$1202(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mTransitionPathRotate = r1
            return r1
    }

    static /* synthetic */ float access$1300(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mScaleX
            return r0
    }

    static /* synthetic */ float access$1302(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mScaleX = r1
            return r1
    }

    static /* synthetic */ float access$1400(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mScaleY
            return r0
    }

    static /* synthetic */ float access$1402(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mScaleY = r1
            return r1
    }

    static /* synthetic */ float access$1500(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mTranslationX
            return r0
    }

    static /* synthetic */ float access$1502(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mTranslationX = r1
            return r1
    }

    static /* synthetic */ float access$1600(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mTranslationY
            return r0
    }

    static /* synthetic */ float access$1602(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mTranslationY = r1
            return r1
    }

    static /* synthetic */ float access$1700(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mTranslationZ
            return r0
    }

    static /* synthetic */ float access$1702(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mTranslationZ = r1
            return r1
    }

    static /* synthetic */ float access$1800(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mProgress
            return r0
    }

    static /* synthetic */ float access$1802(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mProgress = r1
            return r1
    }

    static /* synthetic */ int access$200(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            int r0 = r0.mCurveFit
            return r0
    }

    static /* synthetic */ int access$202(androidx.constraintlayout.motion.widget.KeyCycle r0, int r1) {
            r0.mCurveFit = r1
            return r1
    }

    static /* synthetic */ int access$300(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            int r0 = r0.mWaveShape
            return r0
    }

    static /* synthetic */ int access$302(androidx.constraintlayout.motion.widget.KeyCycle r0, int r1) {
            r0.mWaveShape = r1
            return r1
    }

    static /* synthetic */ float access$400(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mWavePeriod
            return r0
    }

    static /* synthetic */ float access$402(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mWavePeriod = r1
            return r1
    }

    static /* synthetic */ float access$500(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mWaveOffset
            return r0
    }

    static /* synthetic */ float access$502(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mWaveOffset = r1
            return r1
    }

    static /* synthetic */ int access$600(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            int r0 = r0.mWaveVariesBy
            return r0
    }

    static /* synthetic */ int access$602(androidx.constraintlayout.motion.widget.KeyCycle r0, int r1) {
            r0.mWaveVariesBy = r1
            return r1
    }

    static /* synthetic */ float access$700(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mAlpha
            return r0
    }

    static /* synthetic */ float access$702(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mAlpha = r1
            return r1
    }

    static /* synthetic */ float access$800(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mElevation
            return r0
    }

    static /* synthetic */ float access$802(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mElevation = r1
            return r1
    }

    static /* synthetic */ float access$900(androidx.constraintlayout.motion.widget.KeyCycle r0) {
            float r0 = r0.mRotation
            return r0
    }

    static /* synthetic */ float access$902(androidx.constraintlayout.motion.widget.KeyCycle r0, float r1) {
            r0.mRotation = r1
            return r1
    }

    public void addCycleValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L75
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "CUSTOM"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L50
            r4 = 7
            java.lang.String r4 = r3.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r5 = r0.mCustomConstraints
            java.lang.Object r4 = r5.get(r4)
            r12 = r4
            androidx.constraintlayout.widget.ConstraintAttribute r12 = (androidx.constraintlayout.widget.ConstraintAttribute) r12
            if (r12 == 0) goto L50
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r4 = r12.getType()
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r5 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE
            if (r4 != r5) goto L50
            java.lang.Object r4 = r1.get(r3)
            r5 = r4
            androidx.constraintlayout.motion.widget.KeyCycleOscillator r5 = (androidx.constraintlayout.motion.widget.KeyCycleOscillator) r5
            int r6 = r0.mFramePosition
            int r7 = r0.mWaveShape
            int r8 = r0.mWaveVariesBy
            float r9 = r0.mWavePeriod
            float r10 = r0.mWaveOffset
            float r11 = r12.getValueToInterpolate()
            r5.setPoint(r6, r7, r8, r9, r10, r11, r12)
        L50:
            float r19 = r0.getValue(r3)
            boolean r4 = java.lang.Float.isNaN(r19)
            if (r4 != 0) goto Lc
            java.lang.Object r3 = r1.get(r3)
            r13 = r3
            androidx.constraintlayout.motion.widget.KeyCycleOscillator r13 = (androidx.constraintlayout.motion.widget.KeyCycleOscillator) r13
            int r14 = r0.mFramePosition
            int r15 = r0.mWaveShape
            int r3 = r0.mWaveVariesBy
            float r4 = r0.mWavePeriod
            float r5 = r0.mWaveOffset
            r16 = r3
            r17 = r4
            r18 = r5
            r13.setPoint(r14, r15, r16, r17, r18, r19)
            goto Lc
        L75:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "add "
            r0.append(r1)
            int r1 = r7.size()
            r0.append(r1)
            java.lang.String r1 = " values"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "KeyCycle"
            r2 = 2
            androidx.constraintlayout.motion.widget.Debug.logStack(r1, r0, r2)
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L15f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r7.get(r1)
            androidx.constraintlayout.motion.widget.SplineSet r3 = (androidx.constraintlayout.motion.widget.SplineSet) r3
            r1.getClass()
            int r4 = r1.hashCode()
            r5 = -1
            switch(r4) {
                case -1249320806: goto Ldb;
                case -1249320805: goto Ld0;
                case -1225497657: goto Lc5;
                case -1225497656: goto Lba;
                case -1225497655: goto Laf;
                case -1001078227: goto La4;
                case -908189618: goto L99;
                case -908189617: goto L8e;
                case -40300674: goto L80;
                case -4379043: goto L72;
                case 37232917: goto L64;
                case 92909918: goto L56;
                case 156108012: goto L47;
                default: goto L45;
            }
        L45:
            goto Le5
        L47:
            java.lang.String r4 = "waveOffset"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L52
            goto Le5
        L52:
            r5 = 12
            goto Le5
        L56:
            java.lang.String r4 = "alpha"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L60
            goto Le5
        L60:
            r5 = 11
            goto Le5
        L64:
            java.lang.String r4 = "transitionPathRotate"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L6e
            goto Le5
        L6e:
            r5 = 10
            goto Le5
        L72:
            java.lang.String r4 = "elevation"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L7c
            goto Le5
        L7c:
            r5 = 9
            goto Le5
        L80:
            java.lang.String r4 = "rotation"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L8a
            goto Le5
        L8a:
            r5 = 8
            goto Le5
        L8e:
            java.lang.String r4 = "scaleY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L97
            goto Le5
        L97:
            r5 = 7
            goto Le5
        L99:
            java.lang.String r4 = "scaleX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto La2
            goto Le5
        La2:
            r5 = 6
            goto Le5
        La4:
            java.lang.String r4 = "progress"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto Lad
            goto Le5
        Lad:
            r5 = 5
            goto Le5
        Laf:
            java.lang.String r4 = "translationZ"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto Lb8
            goto Le5
        Lb8:
            r5 = 4
            goto Le5
        Lba:
            java.lang.String r4 = "translationY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto Lc3
            goto Le5
        Lc3:
            r5 = 3
            goto Le5
        Lc5:
            java.lang.String r4 = "translationX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto Lce
            goto Le5
        Lce:
            r5 = 2
            goto Le5
        Ld0:
            java.lang.String r4 = "rotationY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto Ld9
            goto Le5
        Ld9:
            r5 = 1
            goto Le5
        Ldb:
            java.lang.String r4 = "rotationX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto Le4
            goto Le5
        Le4:
            r5 = 0
        Le5:
            switch(r5) {
                case 0: goto L156;
                case 1: goto L14d;
                case 2: goto L144;
                case 3: goto L13b;
                case 4: goto L132;
                case 5: goto L129;
                case 6: goto L120;
                case 7: goto L117;
                case 8: goto L10e;
                case 9: goto L105;
                case 10: goto Lfc;
                case 11: goto Lf3;
                case 12: goto Lea;
                default: goto Le8;
            }
        Le8:
            goto L28
        Lea:
            int r1 = r6.mFramePosition
            float r4 = r6.mWaveOffset
            r3.setPoint(r1, r4)
            goto L28
        Lf3:
            int r1 = r6.mFramePosition
            float r4 = r6.mAlpha
            r3.setPoint(r1, r4)
            goto L28
        Lfc:
            int r1 = r6.mFramePosition
            float r4 = r6.mTransitionPathRotate
            r3.setPoint(r1, r4)
            goto L28
        L105:
            int r1 = r6.mFramePosition
            float r4 = r6.mElevation
            r3.setPoint(r1, r4)
            goto L28
        L10e:
            int r1 = r6.mFramePosition
            float r4 = r6.mRotation
            r3.setPoint(r1, r4)
            goto L28
        L117:
            int r1 = r6.mFramePosition
            float r4 = r6.mScaleY
            r3.setPoint(r1, r4)
            goto L28
        L120:
            int r1 = r6.mFramePosition
            float r4 = r6.mScaleX
            r3.setPoint(r1, r4)
            goto L28
        L129:
            int r1 = r6.mFramePosition
            float r4 = r6.mProgress
            r3.setPoint(r1, r4)
            goto L28
        L132:
            int r1 = r6.mFramePosition
            float r4 = r6.mTranslationZ
            r3.setPoint(r1, r4)
            goto L28
        L13b:
            int r1 = r6.mFramePosition
            float r4 = r6.mTranslationY
            r3.setPoint(r1, r4)
            goto L28
        L144:
            int r1 = r6.mFramePosition
            float r4 = r6.mTranslationX
            r3.setPoint(r1, r4)
            goto L28
        L14d:
            int r1 = r6.mFramePosition
            float r4 = r6.mRotationY
            r3.setPoint(r1, r4)
            goto L28
        L156:
            int r1 = r6.mFramePosition
            float r4 = r6.mRotationX
            r3.setPoint(r1, r4)
            goto L28
        L15f:
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
            float r0 = r4.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "scaleX"
            r5.add(r0)
        L4e:
            float r0 = r4.mScaleY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "scaleY"
            r5.add(r0)
        L5b:
            float r0 = r4.mTransitionPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "transitionPathRotate"
            r5.add(r0)
        L68:
            float r0 = r4.mTranslationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L75
            java.lang.String r0 = "translationX"
            r5.add(r0)
        L75:
            float r0 = r4.mTranslationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L82
            java.lang.String r0 = "translationY"
            r5.add(r0)
        L82:
            float r0 = r4.mTranslationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8f
            java.lang.String r0 = "translationZ"
            r5.add(r0)
        L8f:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            int r0 = r0.size()
            if (r0 <= 0) goto Lc2
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r4.mCustomConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc2
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CUSTOM,"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r5.add(r1)
            goto La1
        Lc2:
            return
    }

    public float getValue(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1249320806: goto La1;
                case -1249320805: goto L96;
                case -1225497657: goto L8b;
                case -1225497656: goto L80;
                case -1225497655: goto L75;
                case -1001078227: goto L6a;
                case -908189618: goto L5f;
                case -908189617: goto L54;
                case -40300674: goto L46;
                case -4379043: goto L38;
                case 37232917: goto L2a;
                case 92909918: goto L1c;
                case 156108012: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto Lab
        Ld:
            java.lang.String r0 = "waveOffset"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L18
            goto Lab
        L18:
            r1 = 12
            goto Lab
        L1c:
            java.lang.String r0 = "alpha"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L26
            goto Lab
        L26:
            r1 = 11
            goto Lab
        L2a:
            java.lang.String r0 = "transitionPathRotate"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L34
            goto Lab
        L34:
            r1 = 10
            goto Lab
        L38:
            java.lang.String r0 = "elevation"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L42
            goto Lab
        L42:
            r1 = 9
            goto Lab
        L46:
            java.lang.String r0 = "rotation"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L50
            goto Lab
        L50:
            r1 = 8
            goto Lab
        L54:
            java.lang.String r0 = "scaleY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5d
            goto Lab
        L5d:
            r1 = 7
            goto Lab
        L5f:
            java.lang.String r0 = "scaleX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L68
            goto Lab
        L68:
            r1 = 6
            goto Lab
        L6a:
            java.lang.String r0 = "progress"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L73
            goto Lab
        L73:
            r1 = 5
            goto Lab
        L75:
            java.lang.String r0 = "translationZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L7e
            goto Lab
        L7e:
            r1 = 4
            goto Lab
        L80:
            java.lang.String r0 = "translationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L89
            goto Lab
        L89:
            r1 = 3
            goto Lab
        L8b:
            java.lang.String r0 = "translationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L94
            goto Lab
        L94:
            r1 = 2
            goto Lab
        L96:
            java.lang.String r0 = "rotationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L9f
            goto Lab
        L9f:
            r1 = 1
            goto Lab
        La1:
            java.lang.String r0 = "rotationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Laa
            goto Lab
        Laa:
            r1 = 0
        Lab:
            switch(r1) {
                case 0: goto Ld5;
                case 1: goto Ld2;
                case 2: goto Lcf;
                case 3: goto Lcc;
                case 4: goto Lc9;
                case 5: goto Lc6;
                case 6: goto Lc3;
                case 7: goto Lc0;
                case 8: goto Lbd;
                case 9: goto Lba;
                case 10: goto Lb7;
                case 11: goto Lb4;
                case 12: goto Lb1;
                default: goto Lae;
            }
        Lae:
            r3 = 2143289344(0x7fc00000, float:NaN)
            return r3
        Lb1:
            float r3 = r2.mWaveOffset
            return r3
        Lb4:
            float r3 = r2.mAlpha
            return r3
        Lb7:
            float r3 = r2.mTransitionPathRotate
            return r3
        Lba:
            float r3 = r2.mElevation
            return r3
        Lbd:
            float r3 = r2.mRotation
            return r3
        Lc0:
            float r3 = r2.mScaleY
            return r3
        Lc3:
            float r3 = r2.mScaleX
            return r3
        Lc6:
            float r3 = r2.mProgress
            return r3
        Lc9:
            float r3 = r2.mTranslationZ
            return r3
        Lcc:
            float r3 = r2.mTranslationY
            return r3
        Lcf:
            float r3 = r2.mTranslationX
            return r3
        Ld2:
            float r3 = r2.mRotationY
            return r3
        Ld5:
            float r3 = r2.mRotationX
            return r3
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int[] r0 = androidx.constraintlayout.widget.R.styleable.KeyCycle
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            androidx.constraintlayout.motion.widget.KeyCycle.Loader.access$000(r1, r2)
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            r3.getClass()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1812823328: goto Lcc;
                case -1249320806: goto Lc1;
                case -1249320805: goto Lb6;
                case -1225497657: goto Lab;
                case -1225497656: goto La0;
                case -1001078227: goto L95;
                case -908189618: goto L8a;
                case -908189617: goto L7f;
                case -40300674: goto L71;
                case -4379043: goto L63;
                case 37232917: goto L55;
                case 92909918: goto L47;
                case 156108012: goto L38;
                case 184161818: goto L29;
                case 579057826: goto L1b;
                case 1317633238: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto Ld6
        Ld:
            java.lang.String r0 = "mTranslationZ"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L17
            goto Ld6
        L17:
            r1 = 15
            goto Ld6
        L1b:
            java.lang.String r0 = "curveFit"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L25
            goto Ld6
        L25:
            r1 = 14
            goto Ld6
        L29:
            java.lang.String r0 = "wavePeriod"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L34
            goto Ld6
        L34:
            r1 = 13
            goto Ld6
        L38:
            java.lang.String r0 = "waveOffset"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L43
            goto Ld6
        L43:
            r1 = 12
            goto Ld6
        L47:
            java.lang.String r0 = "alpha"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L51
            goto Ld6
        L51:
            r1 = 11
            goto Ld6
        L55:
            java.lang.String r0 = "transitionPathRotate"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5f
            goto Ld6
        L5f:
            r1 = 10
            goto Ld6
        L63:
            java.lang.String r0 = "elevation"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6d
            goto Ld6
        L6d:
            r1 = 9
            goto Ld6
        L71:
            java.lang.String r0 = "rotation"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L7b
            goto Ld6
        L7b:
            r1 = 8
            goto Ld6
        L7f:
            java.lang.String r0 = "scaleY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L88
            goto Ld6
        L88:
            r1 = 7
            goto Ld6
        L8a:
            java.lang.String r0 = "scaleX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L93
            goto Ld6
        L93:
            r1 = 6
            goto Ld6
        L95:
            java.lang.String r0 = "progress"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L9e
            goto Ld6
        L9e:
            r1 = 5
            goto Ld6
        La0:
            java.lang.String r0 = "translationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La9
            goto Ld6
        La9:
            r1 = 4
            goto Ld6
        Lab:
            java.lang.String r0 = "translationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lb4
            goto Ld6
        Lb4:
            r1 = 3
            goto Ld6
        Lb6:
            java.lang.String r0 = "rotationY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lbf
            goto Ld6
        Lbf:
            r1 = 2
            goto Ld6
        Lc1:
            java.lang.String r0 = "rotationX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lca
            goto Ld6
        Lca:
            r1 = 1
            goto Ld6
        Lcc:
            java.lang.String r0 = "transitionEasing"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld5
            goto Ld6
        Ld5:
            r1 = 0
        Ld6:
            switch(r1) {
                case 0: goto L143;
                case 1: goto L13c;
                case 2: goto L135;
                case 3: goto L12e;
                case 4: goto L127;
                case 5: goto L120;
                case 6: goto L119;
                case 7: goto L112;
                case 8: goto L10b;
                case 9: goto L104;
                case 10: goto Lfd;
                case 11: goto Lf6;
                case 12: goto Lef;
                case 13: goto Le8;
                case 14: goto Le1;
                case 15: goto Lda;
                default: goto Ld9;
            }
        Ld9:
            return
        Lda:
            float r3 = r2.toFloat(r4)
            r2.mTranslationZ = r3
            return
        Le1:
            int r3 = r2.toInt(r4)
            r2.mCurveFit = r3
            return
        Le8:
            float r3 = r2.toFloat(r4)
            r2.mWavePeriod = r3
            return
        Lef:
            float r3 = r2.toFloat(r4)
            r2.mWaveOffset = r3
            return
        Lf6:
            float r3 = r2.toFloat(r4)
            r2.mAlpha = r3
            return
        Lfd:
            float r3 = r2.toFloat(r4)
            r2.mTransitionPathRotate = r3
            return
        L104:
            float r3 = r2.toFloat(r4)
            r2.mElevation = r3
            return
        L10b:
            float r3 = r2.toFloat(r4)
            r2.mRotation = r3
            return
        L112:
            float r3 = r2.toFloat(r4)
            r2.mScaleY = r3
            return
        L119:
            float r3 = r2.toFloat(r4)
            r2.mScaleX = r3
            return
        L120:
            float r3 = r2.toFloat(r4)
            r2.mProgress = r3
            return
        L127:
            float r3 = r2.toFloat(r4)
            r2.mTranslationY = r3
            return
        L12e:
            float r3 = r2.toFloat(r4)
            r2.mTranslationX = r3
            return
        L135:
            float r3 = r2.toFloat(r4)
            r2.mRotationY = r3
            return
        L13c:
            float r3 = r2.toFloat(r4)
            r2.mRotationX = r3
            return
        L143:
            java.lang.String r3 = r4.toString()
            r2.mTransitionEasing = r3
            return
    }
}
