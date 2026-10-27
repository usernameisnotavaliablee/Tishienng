package androidx.constraintlayout.motion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class MotionScene {
    static final int ANTICIPATE = 4;
    static final int BOUNCE = 5;
    private static final boolean DEBUG = false;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final int INTERPOLATOR_REFRENCE_ID = -2;
    public static final int LAYOUT_HONOR_REQUEST = 1;
    public static final int LAYOUT_IGNORE_REQUEST = 0;
    static final int LINEAR = 3;
    private static final int SPLINE_STRING = -1;
    public static final java.lang.String TAG = "MotionScene";
    static final int TRANSITION_BACKWARD = 0;
    static final int TRANSITION_FORWARD = 1;
    public static final int UNSET = -1;
    private boolean DEBUG_DESKTOP;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> mAbstractTransitionList;
    private java.util.HashMap<java.lang.String, java.lang.Integer> mConstraintSetIdMap;
    private android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> mConstraintSetMap;
    androidx.constraintlayout.motion.widget.MotionScene.Transition mCurrentTransition;
    private int mDefaultDuration;
    private androidx.constraintlayout.motion.widget.MotionScene.Transition mDefaultTransition;
    private android.util.SparseIntArray mDeriveMap;
    private boolean mDisableAutoTransition;
    private android.view.MotionEvent mLastTouchDown;
    float mLastTouchX;
    float mLastTouchY;
    private int mLayoutDuringTransition;
    private final androidx.constraintlayout.motion.widget.MotionLayout mMotionLayout;
    private boolean mMotionOutsideRegion;
    private boolean mRtl;
    androidx.constraintlayout.widget.StateSet mStateSet;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> mTransitionList;
    private androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker mVelocityTracker;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Transition {
        public static final int AUTO_ANIMATE_TO_END = 4;
        public static final int AUTO_ANIMATE_TO_START = 3;
        public static final int AUTO_JUMP_TO_END = 2;
        public static final int AUTO_JUMP_TO_START = 1;
        public static final int AUTO_NONE = 0;
        static final int TRANSITION_FLAG_FIRST_DRAW = 1;
        private int mAutoTransition;
        private int mConstraintSetEnd;
        private int mConstraintSetStart;
        private int mDefaultInterpolator;
        private int mDefaultInterpolatorID;
        private java.lang.String mDefaultInterpolatorString;
        private boolean mDisable;
        private int mDuration;
        private int mId;
        private boolean mIsAbstract;
        private java.util.ArrayList<androidx.constraintlayout.motion.widget.KeyFrames> mKeyFramesList;
        private int mLayoutDuringTransition;
        private final androidx.constraintlayout.motion.widget.MotionScene mMotionScene;
        private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick> mOnClicks;
        private int mPathMotionArc;
        private float mStagger;
        private androidx.constraintlayout.motion.widget.TouchResponse mTouchResponse;
        private int mTransitionFlags;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static class TransitionOnClick implements android.view.View.OnClickListener {
            public static final int ANIM_TOGGLE = 17;
            public static final int ANIM_TO_END = 1;
            public static final int ANIM_TO_START = 16;
            public static final int JUMP_TO_END = 256;
            public static final int JUMP_TO_START = 4096;
            int mMode;
            int mTargetId;
            private final androidx.constraintlayout.motion.widget.MotionScene.Transition mTransition;

            public TransitionOnClick(android.content.Context r3, androidx.constraintlayout.motion.widget.MotionScene.Transition r4, org.xmlpull.v1.XmlPullParser r5) {
                    r2 = this;
                    r2.<init>()
                    r0 = -1
                    r2.mTargetId = r0
                    r0 = 17
                    r2.mMode = r0
                    r2.mTransition = r4
                    android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r5)
                    int[] r5 = androidx.constraintlayout.widget.R.styleable.OnClick
                    android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r5)
                    int r4 = r3.getIndexCount()
                    r5 = 0
                L1b:
                    if (r5 >= r4) goto L3d
                    int r0 = r3.getIndex(r5)
                    int r1 = androidx.constraintlayout.widget.R.styleable.OnClick_targetId
                    if (r0 != r1) goto L2e
                    int r1 = r2.mTargetId
                    int r0 = r3.getResourceId(r0, r1)
                    r2.mTargetId = r0
                    goto L3a
                L2e:
                    int r1 = androidx.constraintlayout.widget.R.styleable.OnClick_clickAction
                    if (r0 != r1) goto L3a
                    int r1 = r2.mMode
                    int r0 = r3.getInt(r0, r1)
                    r2.mMode = r0
                L3a:
                    int r5 = r5 + 1
                    goto L1b
                L3d:
                    r3.recycle()
                    return
            }

            public void addOnClickListeners(androidx.constraintlayout.motion.widget.MotionLayout r7, int r8, androidx.constraintlayout.motion.widget.MotionScene.Transition r9) {
                    r6 = this;
                    int r0 = r6.mTargetId
                    r1 = -1
                    if (r0 != r1) goto L6
                    goto La
                L6:
                    android.view.View r7 = r7.findViewById(r0)
                La:
                    if (r7 != 0) goto Ld
                    return
                Ld:
                    int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r9)
                    int r9 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r9)
                    if (r0 != r1) goto L1b
                    r7.setOnClickListener(r6)
                    return
                L1b:
                    int r1 = r6.mMode
                    r2 = r1 & 1
                    r3 = 0
                    r4 = 1
                    if (r2 == 0) goto L27
                    if (r8 != r0) goto L27
                    r2 = 1
                    goto L28
                L27:
                    r2 = 0
                L28:
                    r5 = r1 & 256(0x100, float:3.59E-43)
                    if (r5 == 0) goto L30
                    if (r8 != r0) goto L30
                    r5 = 1
                    goto L31
                L30:
                    r5 = 0
                L31:
                    r2 = r2 | r5
                    r5 = r1 & 1
                    if (r5 == 0) goto L3a
                    if (r8 != r0) goto L3a
                    r0 = 1
                    goto L3b
                L3a:
                    r0 = 0
                L3b:
                    r0 = r0 | r2
                    r2 = r1 & 16
                    if (r2 == 0) goto L44
                    if (r8 != r9) goto L44
                    r2 = 1
                    goto L45
                L44:
                    r2 = 0
                L45:
                    r0 = r0 | r2
                    r1 = r1 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L4d
                    if (r8 != r9) goto L4d
                    r3 = 1
                L4d:
                    r8 = r0 | r3
                    if (r8 == 0) goto L54
                    r7.setOnClickListener(r6)
                L54:
                    return
            }

            boolean isTransitionViable(androidx.constraintlayout.motion.widget.MotionScene.Transition r5, androidx.constraintlayout.motion.widget.MotionLayout r6) {
                    r4 = this;
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r4.mTransition
                    r1 = 1
                    if (r0 != r5) goto L6
                    return r1
                L6:
                    int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r0)
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r4.mTransition
                    int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r0)
                    r2 = -1
                    r3 = 0
                    if (r0 != r2) goto L1a
                    int r6 = r6.mCurrentState
                    if (r6 == r5) goto L19
                    return r1
                L19:
                    return r3
                L1a:
                    int r6 = r6.mCurrentState
                    if (r6 == r0) goto L22
                    if (r6 != r5) goto L21
                    goto L22
                L21:
                    return r3
                L22:
                    return r1
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r8) {
                    r7 = this;
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r8 = r7.mTransition
                    androidx.constraintlayout.motion.widget.MotionScene r8 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$700(r8)
                    androidx.constraintlayout.motion.widget.MotionLayout r8 = androidx.constraintlayout.motion.widget.MotionScene.access$800(r8)
                    boolean r0 = r8.isInteractionEnabled()
                    if (r0 != 0) goto L12
                    goto Le6
                L12:
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r7.mTransition
                    int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r0)
                    r1 = -1
                    if (r0 != r1) goto L4b
                    int r0 = r8.getCurrentState()
                    if (r0 != r1) goto L2b
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r7.mTransition
                    int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r0)
                    r8.transitionToState(r0)
                    return
                L2b:
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = new androidx.constraintlayout.motion.widget.MotionScene$Transition
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r2 = r7.mTransition
                    androidx.constraintlayout.motion.widget.MotionScene r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$700(r2)
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r7.mTransition
                    r1.<init>(r2, r3)
                    androidx.constraintlayout.motion.widget.MotionScene.Transition.access$102(r1, r0)
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r7.mTransition
                    int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r0)
                    androidx.constraintlayout.motion.widget.MotionScene.Transition.access$002(r1, r0)
                    r8.setTransition(r1)
                    r8.transitionToEnd()
                    return
                L4b:
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r7.mTransition
                    androidx.constraintlayout.motion.widget.MotionScene r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$700(r0)
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r0.mCurrentTransition
                    int r1 = r7.mMode
                    r2 = r1 & 1
                    r3 = 0
                    r4 = 1
                    if (r2 != 0) goto L62
                    r2 = r1 & 256(0x100, float:3.59E-43)
                    if (r2 == 0) goto L60
                    goto L62
                L60:
                    r2 = 0
                    goto L63
                L62:
                    r2 = 1
                L63:
                    r5 = r1 & 16
                    if (r5 != 0) goto L6e
                    r1 = r1 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L6c
                    goto L6e
                L6c:
                    r1 = 0
                    goto L6f
                L6e:
                    r1 = 1
                L6f:
                    if (r2 == 0) goto L9a
                    if (r1 == 0) goto L9a
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r5 = r7.mTransition
                    androidx.constraintlayout.motion.widget.MotionScene r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$700(r5)
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r5 = r5.mCurrentTransition
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r6 = r7.mTransition
                    if (r5 == r6) goto L82
                    r8.setTransition(r6)
                L82:
                    int r5 = r8.getCurrentState()
                    int r6 = r8.getEndState()
                    if (r5 == r6) goto L9b
                    float r5 = r8.getProgress()
                    r6 = 1056964608(0x3f000000, float:0.5)
                    int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                    if (r5 <= 0) goto L97
                    goto L9b
                L97:
                    r3 = r2
                    r1 = 0
                    goto L9b
                L9a:
                    r3 = r2
                L9b:
                    boolean r0 = r7.isTransitionViable(r0, r8)
                    if (r0 == 0) goto Le6
                    if (r3 == 0) goto Lb1
                    int r0 = r7.mMode
                    r0 = r0 & r4
                    if (r0 == 0) goto Lb1
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r7.mTransition
                    r8.setTransition(r0)
                    r8.transitionToEnd()
                    return
                Lb1:
                    if (r1 == 0) goto Lc2
                    int r0 = r7.mMode
                    r0 = r0 & 16
                    if (r0 == 0) goto Lc2
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r7.mTransition
                    r8.setTransition(r0)
                    r8.transitionToStart()
                    return
                Lc2:
                    if (r3 == 0) goto Ld5
                    int r0 = r7.mMode
                    r0 = r0 & 256(0x100, float:3.59E-43)
                    if (r0 == 0) goto Ld5
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r7.mTransition
                    r8.setTransition(r0)
                    r0 = 1065353216(0x3f800000, float:1.0)
                    r8.setProgress(r0)
                    return
                Ld5:
                    if (r1 == 0) goto Le6
                    int r0 = r7.mMode
                    r0 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r0 == 0) goto Le6
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r7.mTransition
                    r8.setTransition(r0)
                    r0 = 0
                    r8.setProgress(r0)
                Le6:
                    return
            }

            public void removeOnClickListeners(androidx.constraintlayout.motion.widget.MotionLayout r3) {
                    r2 = this;
                    int r0 = r2.mTargetId
                    r1 = -1
                    if (r0 != r1) goto L6
                    return
                L6:
                    android.view.View r3 = r3.findViewById(r0)
                    if (r3 != 0) goto Ld
                    return
                Ld:
                    r0 = 0
                    r3.setOnClickListener(r0)
                    return
            }
        }

        public Transition(int r5, androidx.constraintlayout.motion.widget.MotionScene r6, int r7, int r8) {
                r4 = this;
                r4.<init>()
                r0 = -1
                r4.mId = r0
                r1 = 0
                r4.mIsAbstract = r1
                r4.mConstraintSetEnd = r0
                r4.mConstraintSetStart = r0
                r4.mDefaultInterpolator = r1
                r2 = 0
                r4.mDefaultInterpolatorString = r2
                r4.mDefaultInterpolatorID = r0
                r3 = 400(0x190, float:5.6E-43)
                r4.mDuration = r3
                r3 = 0
                r4.mStagger = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r4.mKeyFramesList = r3
                r4.mTouchResponse = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r4.mOnClicks = r2
                r4.mAutoTransition = r1
                r4.mDisable = r1
                r4.mPathMotionArc = r0
                r4.mLayoutDuringTransition = r1
                r4.mTransitionFlags = r1
                r4.mId = r5
                r4.mMotionScene = r6
                r4.mConstraintSetStart = r7
                r4.mConstraintSetEnd = r8
                int r5 = androidx.constraintlayout.motion.widget.MotionScene.access$900(r6)
                r4.mDuration = r5
                int r5 = androidx.constraintlayout.motion.widget.MotionScene.access$1000(r6)
                r4.mLayoutDuringTransition = r5
                return
        }

        Transition(androidx.constraintlayout.motion.widget.MotionScene r5, android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) {
                r4 = this;
                r4.<init>()
                r0 = -1
                r4.mId = r0
                r1 = 0
                r4.mIsAbstract = r1
                r4.mConstraintSetEnd = r0
                r4.mConstraintSetStart = r0
                r4.mDefaultInterpolator = r1
                r2 = 0
                r4.mDefaultInterpolatorString = r2
                r4.mDefaultInterpolatorID = r0
                r3 = 400(0x190, float:5.6E-43)
                r4.mDuration = r3
                r3 = 0
                r4.mStagger = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r4.mKeyFramesList = r3
                r4.mTouchResponse = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r4.mOnClicks = r2
                r4.mAutoTransition = r1
                r4.mDisable = r1
                r4.mPathMotionArc = r0
                r4.mLayoutDuringTransition = r1
                r4.mTransitionFlags = r1
                int r0 = androidx.constraintlayout.motion.widget.MotionScene.access$900(r5)
                r4.mDuration = r0
                int r0 = androidx.constraintlayout.motion.widget.MotionScene.access$1000(r5)
                r4.mLayoutDuringTransition = r0
                r4.mMotionScene = r5
                android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
                r4.fillFromAttributeList(r5, r6, r7)
                return
        }

        Transition(androidx.constraintlayout.motion.widget.MotionScene r5, androidx.constraintlayout.motion.widget.MotionScene.Transition r6) {
                r4 = this;
                r4.<init>()
                r0 = -1
                r4.mId = r0
                r1 = 0
                r4.mIsAbstract = r1
                r4.mConstraintSetEnd = r0
                r4.mConstraintSetStart = r0
                r4.mDefaultInterpolator = r1
                r2 = 0
                r4.mDefaultInterpolatorString = r2
                r4.mDefaultInterpolatorID = r0
                r3 = 400(0x190, float:5.6E-43)
                r4.mDuration = r3
                r3 = 0
                r4.mStagger = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r4.mKeyFramesList = r3
                r4.mTouchResponse = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r4.mOnClicks = r2
                r4.mAutoTransition = r1
                r4.mDisable = r1
                r4.mPathMotionArc = r0
                r4.mLayoutDuringTransition = r1
                r4.mTransitionFlags = r1
                r4.mMotionScene = r5
                if (r6 == 0) goto L59
                int r5 = r6.mPathMotionArc
                r4.mPathMotionArc = r5
                int r5 = r6.mDefaultInterpolator
                r4.mDefaultInterpolator = r5
                java.lang.String r5 = r6.mDefaultInterpolatorString
                r4.mDefaultInterpolatorString = r5
                int r5 = r6.mDefaultInterpolatorID
                r4.mDefaultInterpolatorID = r5
                int r5 = r6.mDuration
                r4.mDuration = r5
                java.util.ArrayList<androidx.constraintlayout.motion.widget.KeyFrames> r5 = r6.mKeyFramesList
                r4.mKeyFramesList = r5
                float r5 = r6.mStagger
                r4.mStagger = r5
                int r5 = r6.mLayoutDuringTransition
                r4.mLayoutDuringTransition = r5
            L59:
                return
        }

        static /* synthetic */ int access$000(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                int r0 = r0.mConstraintSetEnd
                return r0
        }

        static /* synthetic */ int access$002(androidx.constraintlayout.motion.widget.MotionScene.Transition r0, int r1) {
                r0.mConstraintSetEnd = r1
                return r1
        }

        static /* synthetic */ int access$100(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                int r0 = r0.mConstraintSetStart
                return r0
        }

        static /* synthetic */ int access$102(androidx.constraintlayout.motion.widget.MotionScene.Transition r0, int r1) {
                r0.mConstraintSetStart = r1
                return r1
        }

        static /* synthetic */ boolean access$1200(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                boolean r0 = r0.mIsAbstract
                return r0
        }

        static /* synthetic */ java.util.ArrayList access$1300(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                java.util.ArrayList<androidx.constraintlayout.motion.widget.KeyFrames> r0 = r0.mKeyFramesList
                return r0
        }

        static /* synthetic */ int access$1400(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                int r0 = r0.mDefaultInterpolator
                return r0
        }

        static /* synthetic */ java.lang.String access$1500(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                java.lang.String r0 = r0.mDefaultInterpolatorString
                return r0
        }

        static /* synthetic */ int access$1600(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                int r0 = r0.mDefaultInterpolatorID
                return r0
        }

        static /* synthetic */ int access$1700(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                int r0 = r0.mDuration
                return r0
        }

        static /* synthetic */ int access$1800(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                int r0 = r0.mPathMotionArc
                return r0
        }

        static /* synthetic */ float access$1900(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                float r0 = r0.mStagger
                return r0
        }

        static /* synthetic */ androidx.constraintlayout.motion.widget.TouchResponse access$200(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                androidx.constraintlayout.motion.widget.TouchResponse r0 = r0.mTouchResponse
                return r0
        }

        static /* synthetic */ androidx.constraintlayout.motion.widget.TouchResponse access$202(androidx.constraintlayout.motion.widget.MotionScene.Transition r0, androidx.constraintlayout.motion.widget.TouchResponse r1) {
                r0.mTouchResponse = r1
                return r1
        }

        static /* synthetic */ int access$300(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                int r0 = r0.mId
                return r0
        }

        static /* synthetic */ java.util.ArrayList access$400(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick> r0 = r0.mOnClicks
                return r0
        }

        static /* synthetic */ boolean access$500(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                boolean r0 = r0.mDisable
                return r0
        }

        static /* synthetic */ int access$600(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                int r0 = r0.mAutoTransition
                return r0
        }

        static /* synthetic */ androidx.constraintlayout.motion.widget.MotionScene access$700(androidx.constraintlayout.motion.widget.MotionScene.Transition r0) {
                androidx.constraintlayout.motion.widget.MotionScene r0 = r0.mMotionScene
                return r0
        }

        private void fill(androidx.constraintlayout.motion.widget.MotionScene r9, android.content.Context r10, android.content.res.TypedArray r11) {
                r8 = this;
                int r0 = r11.getIndexCount()
                r1 = 0
                r2 = 0
            L6:
                r3 = 1
                r4 = -1
                if (r2 >= r0) goto L118
                int r5 = r11.getIndex(r2)
                int r6 = androidx.constraintlayout.widget.R.styleable.Transition_constraintSetEnd
                java.lang.String r7 = "layout"
                if (r5 != r6) goto L41
                int r3 = r8.mConstraintSetEnd
                int r3 = r11.getResourceId(r5, r3)
                r8.mConstraintSetEnd = r3
                android.content.res.Resources r3 = r10.getResources()
                int r4 = r8.mConstraintSetEnd
                java.lang.String r3 = r3.getResourceTypeName(r4)
                boolean r3 = r7.equals(r3)
                if (r3 == 0) goto L114
                androidx.constraintlayout.widget.ConstraintSet r3 = new androidx.constraintlayout.widget.ConstraintSet
                r3.<init>()
                int r4 = r8.mConstraintSetEnd
                r3.load(r10, r4)
                android.util.SparseArray r4 = androidx.constraintlayout.motion.widget.MotionScene.access$1100(r9)
                int r5 = r8.mConstraintSetEnd
                r4.append(r5, r3)
                goto L114
            L41:
                int r6 = androidx.constraintlayout.widget.R.styleable.Transition_constraintSetStart
                if (r5 != r6) goto L72
                int r3 = r8.mConstraintSetStart
                int r3 = r11.getResourceId(r5, r3)
                r8.mConstraintSetStart = r3
                android.content.res.Resources r3 = r10.getResources()
                int r4 = r8.mConstraintSetStart
                java.lang.String r3 = r3.getResourceTypeName(r4)
                boolean r3 = r7.equals(r3)
                if (r3 == 0) goto L114
                androidx.constraintlayout.widget.ConstraintSet r3 = new androidx.constraintlayout.widget.ConstraintSet
                r3.<init>()
                int r4 = r8.mConstraintSetStart
                r3.load(r10, r4)
                android.util.SparseArray r4 = androidx.constraintlayout.motion.widget.MotionScene.access$1100(r9)
                int r5 = r8.mConstraintSetStart
                r4.append(r5, r3)
                goto L114
            L72:
                int r6 = androidx.constraintlayout.widget.R.styleable.Transition_motionInterpolator
                if (r5 != r6) goto Lb3
                android.util.TypedValue r6 = r11.peekValue(r5)
                int r6 = r6.type
                r7 = -2
                if (r6 != r3) goto L8b
                int r3 = r11.getResourceId(r5, r4)
                r8.mDefaultInterpolatorID = r3
                if (r3 == r4) goto L114
                r8.mDefaultInterpolator = r7
                goto L114
            L8b:
                r3 = 3
                if (r6 != r3) goto Laa
                java.lang.String r3 = r11.getString(r5)
                r8.mDefaultInterpolatorString = r3
                java.lang.String r6 = "/"
                int r3 = r3.indexOf(r6)
                if (r3 <= 0) goto La6
                int r3 = r11.getResourceId(r5, r4)
                r8.mDefaultInterpolatorID = r3
                r8.mDefaultInterpolator = r7
                goto L114
            La6:
                r8.mDefaultInterpolator = r4
                goto L114
            Laa:
                int r3 = r8.mDefaultInterpolator
                int r3 = r11.getInteger(r5, r3)
                r8.mDefaultInterpolator = r3
                goto L114
            Lb3:
                int r3 = androidx.constraintlayout.widget.R.styleable.Transition_duration
                if (r5 != r3) goto Lc0
                int r3 = r8.mDuration
                int r3 = r11.getInt(r5, r3)
                r8.mDuration = r3
                goto L114
            Lc0:
                int r3 = androidx.constraintlayout.widget.R.styleable.Transition_staggered
                if (r5 != r3) goto Lcd
                float r3 = r8.mStagger
                float r3 = r11.getFloat(r5, r3)
                r8.mStagger = r3
                goto L114
            Lcd:
                int r3 = androidx.constraintlayout.widget.R.styleable.Transition_autoTransition
                if (r5 != r3) goto Lda
                int r3 = r8.mAutoTransition
                int r3 = r11.getInteger(r5, r3)
                r8.mAutoTransition = r3
                goto L114
            Lda:
                int r3 = androidx.constraintlayout.widget.R.styleable.Transition_android_id
                if (r5 != r3) goto Le7
                int r3 = r8.mId
                int r3 = r11.getResourceId(r5, r3)
                r8.mId = r3
                goto L114
            Le7:
                int r3 = androidx.constraintlayout.widget.R.styleable.Transition_transitionDisable
                if (r5 != r3) goto Lf4
                boolean r3 = r8.mDisable
                boolean r3 = r11.getBoolean(r5, r3)
                r8.mDisable = r3
                goto L114
            Lf4:
                int r3 = androidx.constraintlayout.widget.R.styleable.Transition_pathMotionArc
                if (r5 != r3) goto Lff
                int r3 = r11.getInteger(r5, r4)
                r8.mPathMotionArc = r3
                goto L114
            Lff:
                int r3 = androidx.constraintlayout.widget.R.styleable.Transition_layoutDuringTransition
                if (r5 != r3) goto L10a
                int r3 = r11.getInteger(r5, r1)
                r8.mLayoutDuringTransition = r3
                goto L114
            L10a:
                int r3 = androidx.constraintlayout.widget.R.styleable.Transition_transitionFlags
                if (r5 != r3) goto L114
                int r3 = r11.getInteger(r5, r1)
                r8.mTransitionFlags = r3
            L114:
                int r2 = r2 + 1
                goto L6
            L118:
                int r9 = r8.mConstraintSetStart
                if (r9 != r4) goto L11e
                r8.mIsAbstract = r3
            L11e:
                return
        }

        private void fillFromAttributeList(androidx.constraintlayout.motion.widget.MotionScene r2, android.content.Context r3, android.util.AttributeSet r4) {
                r1 = this;
                int[] r0 = androidx.constraintlayout.widget.R.styleable.Transition
                android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0)
                r1.fill(r2, r3, r4)
                r4.recycle()
                return
        }

        public void addOnClick(android.content.Context r3, org.xmlpull.v1.XmlPullParser r4) {
                r2 = this;
                java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick> r0 = r2.mOnClicks
                androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick r1 = new androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick
                r1.<init>(r3, r2, r4)
                r0.add(r1)
                return
        }

        public java.lang.String debugString(android.content.Context r4) {
                r3 = this;
                int r0 = r3.mConstraintSetStart
                r1 = -1
                if (r0 != r1) goto L8
                java.lang.String r0 = "null"
                goto L12
            L8:
                android.content.res.Resources r0 = r4.getResources()
                int r2 = r3.mConstraintSetStart
                java.lang.String r0 = r0.getResourceEntryName(r2)
            L12:
                int r2 = r3.mConstraintSetEnd
                if (r2 != r1) goto L28
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r0)
                java.lang.String r0 = " -> null"
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                return r4
            L28:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = " -> "
                r1.append(r0)
                android.content.res.Resources r4 = r4.getResources()
                int r0 = r3.mConstraintSetEnd
                java.lang.String r4 = r4.getResourceEntryName(r0)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                return r4
        }

        public int getDuration() {
                r1 = this;
                int r0 = r1.mDuration
                return r0
        }

        public int getEndConstraintSetId() {
                r1 = this;
                int r0 = r1.mConstraintSetEnd
                return r0
        }

        public int getId() {
                r1 = this;
                int r0 = r1.mId
                return r0
        }

        public java.util.List<androidx.constraintlayout.motion.widget.KeyFrames> getKeyFrameList() {
                r1 = this;
                java.util.ArrayList<androidx.constraintlayout.motion.widget.KeyFrames> r0 = r1.mKeyFramesList
                return r0
        }

        public int getLayoutDuringTransition() {
                r1 = this;
                int r0 = r1.mLayoutDuringTransition
                return r0
        }

        public java.util.List<androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick> getOnClickList() {
                r1 = this;
                java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick> r0 = r1.mOnClicks
                return r0
        }

        public int getPathMotionArc() {
                r1 = this;
                int r0 = r1.mPathMotionArc
                return r0
        }

        public float getStagger() {
                r1 = this;
                float r0 = r1.mStagger
                return r0
        }

        public int getStartConstraintSetId() {
                r1 = this;
                int r0 = r1.mConstraintSetStart
                return r0
        }

        public androidx.constraintlayout.motion.widget.TouchResponse getTouchResponse() {
                r1 = this;
                androidx.constraintlayout.motion.widget.TouchResponse r0 = r1.mTouchResponse
                return r0
        }

        public boolean isEnabled() {
                r1 = this;
                boolean r0 = r1.mDisable
                r0 = r0 ^ 1
                return r0
        }

        public boolean isTransitionFlag(int r2) {
                r1 = this;
                int r0 = r1.mTransitionFlags
                r2 = r2 & r0
                if (r2 == 0) goto L7
                r2 = 1
                return r2
            L7:
                r2 = 0
                return r2
        }

        public void setDuration(int r1) {
                r0 = this;
                r0.mDuration = r1
                return
        }

        public void setEnable(boolean r1) {
                r0 = this;
                r1 = r1 ^ 1
                r0.mDisable = r1
                return
        }

        public void setPathMotionArc(int r1) {
                r0 = this;
                r0.mPathMotionArc = r1
                return
        }

        public void setStagger(float r1) {
                r0 = this;
                r0.mStagger = r1
                return
        }
    }

    MotionScene(android.content.Context r4, androidx.constraintlayout.motion.widget.MotionLayout r5, int r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mStateSet = r0
            r3.mCurrentTransition = r0
            r1 = 0
            r3.mDisableAutoTransition = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.mTransitionList = r2
            r3.mDefaultTransition = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mAbstractTransitionList = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r3.mConstraintSetMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.mConstraintSetIdMap = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r3.mDeriveMap = r0
            r3.DEBUG_DESKTOP = r1
            r0 = 400(0x190, float:5.6E-43)
            r3.mDefaultDuration = r0
            r3.mLayoutDuringTransition = r1
            r3.mMotionOutsideRegion = r1
            r3.mMotionLayout = r5
            r3.load(r4, r6)
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r4 = r3.mConstraintSetMap
            int r5 = androidx.constraintlayout.widget.R.id.motion_base
            androidx.constraintlayout.widget.ConstraintSet r6 = new androidx.constraintlayout.widget.ConstraintSet
            r6.<init>()
            r4.put(r5, r6)
            java.util.HashMap<java.lang.String, java.lang.Integer> r4 = r3.mConstraintSetIdMap
            java.lang.String r6 = "motion_base"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.put(r6, r5)
            return
    }

    public MotionScene(androidx.constraintlayout.motion.widget.MotionLayout r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mStateSet = r0
            r3.mCurrentTransition = r0
            r1 = 0
            r3.mDisableAutoTransition = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.mTransitionList = r2
            r3.mDefaultTransition = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mAbstractTransitionList = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r3.mConstraintSetMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.mConstraintSetIdMap = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r3.mDeriveMap = r0
            r3.DEBUG_DESKTOP = r1
            r0 = 400(0x190, float:5.6E-43)
            r3.mDefaultDuration = r0
            r3.mLayoutDuringTransition = r1
            r3.mMotionOutsideRegion = r1
            r3.mMotionLayout = r4
            return
    }

    static /* synthetic */ int access$1000(androidx.constraintlayout.motion.widget.MotionScene r0) {
            int r0 = r0.mLayoutDuringTransition
            return r0
    }

    static /* synthetic */ android.util.SparseArray access$1100(androidx.constraintlayout.motion.widget.MotionScene r0) {
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r0 = r0.mConstraintSetMap
            return r0
    }

    static /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout access$800(androidx.constraintlayout.motion.widget.MotionScene r0) {
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r0.mMotionLayout
            return r0
    }

    static /* synthetic */ int access$900(androidx.constraintlayout.motion.widget.MotionScene r0) {
            int r0 = r0.mDefaultDuration
            return r0
    }

    private int getId(android.content.Context r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = "/"
            boolean r0 = r7.contains(r0)
            r1 = 1
            r2 = -1
            if (r0 == 0) goto L2d
            r0 = 47
            int r0 = r7.indexOf(r0)
            int r0 = r0 + r1
            java.lang.String r0 = r7.substring(r0)
            android.content.res.Resources r3 = r6.getResources()
            java.lang.String r4 = "id"
            java.lang.String r6 = r6.getPackageName()
            int r6 = r3.getIdentifier(r0, r4, r6)
            boolean r0 = r5.DEBUG_DESKTOP
            if (r0 == 0) goto L2e
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            goto L2e
        L2d:
            r6 = -1
        L2e:
            if (r6 != r2) goto L3e
            int r0 = r7.length()
            if (r0 <= r1) goto L3e
            java.lang.String r6 = r7.substring(r1)
            int r6 = java.lang.Integer.parseInt(r6)
        L3e:
            return r6
    }

    private int getIndex(androidx.constraintlayout.motion.widget.MotionScene.Transition r4) {
            r3 = this;
            int r4 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$300(r4)
            r0 = -1
            if (r4 == r0) goto L23
            r1 = 0
        L8:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r2 = r3.mTransitionList
            int r2 = r2.size()
            if (r1 >= r2) goto L22
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r2 = r3.mTransitionList
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.motion.widget.MotionScene$Transition r2 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r2
            int r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$300(r2)
            if (r2 != r4) goto L1f
            return r1
        L1f:
            int r1 = r1 + 1
            goto L8
        L22:
            return r0
        L23:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The transition must have an id"
            r4.<init>(r0)
            throw r4
    }

    private int getRealID(int r3) {
            r2 = this;
            androidx.constraintlayout.widget.StateSet r0 = r2.mStateSet
            if (r0 == 0) goto Lc
            r1 = -1
            int r0 = r0.stateGetConstraintID(r3, r1, r1)
            if (r0 == r1) goto Lc
            return r0
        Lc:
            return r3
    }

    private boolean hasCycleDependency(int r5) {
            r4 = this;
            android.util.SparseIntArray r0 = r4.mDeriveMap
            int r0 = r0.get(r5)
            android.util.SparseIntArray r1 = r4.mDeriveMap
            int r1 = r1.size()
        Lc:
            if (r0 <= 0) goto L1f
            r2 = 1
            if (r0 != r5) goto L12
            return r2
        L12:
            int r3 = r1 + (-1)
            if (r1 >= 0) goto L17
            return r2
        L17:
            android.util.SparseIntArray r1 = r4.mDeriveMap
            int r0 = r1.get(r0)
            r1 = r3
            goto Lc
        L1f:
            r5 = 0
            return r5
    }

    private boolean isProcessingTouch() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker r0 = r1.mVelocityTracker
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    private void load(android.content.Context r5, int r6) {
            r4 = this;
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.XmlResourceParser r0 = r0.getXml(r6)
            int r1 = r0.getEventType()     // Catch: java.lang.Throwable -> Lec
            r2 = 0
        Ld:
            r3 = 1
            if (r1 == r3) goto Lec
            if (r1 == 0) goto Le3
            r3 = 2
            if (r1 == r3) goto L17
            goto Le6
        L17:
            java.lang.String r1 = r0.getName()     // Catch: java.lang.Throwable -> Lec
            boolean r3 = r4.DEBUG_DESKTOP     // Catch: java.lang.Throwable -> Lec
            if (r3 == 0) goto L24
            java.io.PrintStream r3 = java.lang.System.out     // Catch: java.lang.Throwable -> Lec
            r3.getClass()     // Catch: java.lang.Throwable -> Lec
        L24:
            int r3 = r1.hashCode()     // Catch: java.lang.Throwable -> Lec
            switch(r3) {
                case -1349929691: goto Ld7;
                case -1239391468: goto Lc2;
                case 269306229: goto L78;
                case 312750793: goto L6b;
                case 327855227: goto L4b;
                case 793277014: goto L3e;
                case 1382829617: goto L2d;
                default: goto L2b;
            }     // Catch: java.lang.Throwable -> Lec
        L2b:
            goto Le6
        L2d:
            java.lang.String r3 = "StateSet"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lec
            if (r1 == 0) goto Le6
            androidx.constraintlayout.widget.StateSet r1 = new androidx.constraintlayout.widget.StateSet     // Catch: java.lang.Throwable -> Lec
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> Lec
            r4.mStateSet = r1     // Catch: java.lang.Throwable -> Lec
            goto Le6
        L3e:
            java.lang.String r3 = "MotionScene"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lec
            if (r1 == 0) goto Le6
            r4.parseMotionSceneTags(r5, r0)     // Catch: java.lang.Throwable -> Lec
            goto Le6
        L4b:
            java.lang.String r3 = "OnSwipe"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lec
            if (r1 == 0) goto Le6
            if (r2 != 0) goto L5f
            android.content.res.Resources r1 = r5.getResources()     // Catch: java.lang.Throwable -> Lec
            r1.getResourceEntryName(r6)     // Catch: java.lang.Throwable -> Lec
            r0.getLineNumber()     // Catch: java.lang.Throwable -> Lec
        L5f:
            androidx.constraintlayout.motion.widget.TouchResponse r1 = new androidx.constraintlayout.motion.widget.TouchResponse     // Catch: java.lang.Throwable -> Lec
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r4.mMotionLayout     // Catch: java.lang.Throwable -> Lec
            r1.<init>(r5, r3, r0)     // Catch: java.lang.Throwable -> Lec
            androidx.constraintlayout.motion.widget.MotionScene.Transition.access$202(r2, r1)     // Catch: java.lang.Throwable -> Lec
            goto Le6
        L6b:
            java.lang.String r3 = "OnClick"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lec
            if (r1 == 0) goto Le6
            r2.addOnClick(r5, r0)     // Catch: java.lang.Throwable -> Lec
            goto Le6
        L78:
            java.lang.String r3 = "Transition"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lec
            if (r1 == 0) goto Le6
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r1 = r4.mTransitionList     // Catch: java.lang.Throwable -> Lec
            androidx.constraintlayout.motion.widget.MotionScene$Transition r2 = new androidx.constraintlayout.motion.widget.MotionScene$Transition     // Catch: java.lang.Throwable -> Lec
            r2.<init>(r4, r5, r0)     // Catch: java.lang.Throwable -> Lec
            r1.add(r2)     // Catch: java.lang.Throwable -> Lec
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = r4.mCurrentTransition     // Catch: java.lang.Throwable -> Lec
            if (r1 != 0) goto La7
            boolean r1 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1200(r2)     // Catch: java.lang.Throwable -> Lec
            if (r1 != 0) goto La7
            r4.mCurrentTransition = r2     // Catch: java.lang.Throwable -> Lec
            androidx.constraintlayout.motion.widget.TouchResponse r1 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r2)     // Catch: java.lang.Throwable -> Lec
            if (r1 == 0) goto La7
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = r4.mCurrentTransition     // Catch: java.lang.Throwable -> Lec
            androidx.constraintlayout.motion.widget.TouchResponse r1 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r1)     // Catch: java.lang.Throwable -> Lec
            boolean r3 = r4.mRtl     // Catch: java.lang.Throwable -> Lec
            r1.setRTL(r3)     // Catch: java.lang.Throwable -> Lec
        La7:
            boolean r1 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1200(r2)     // Catch: java.lang.Throwable -> Lec
            if (r1 == 0) goto Le6
            int r1 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r2)     // Catch: java.lang.Throwable -> Lec
            r3 = -1
            if (r1 != r3) goto Lb7
            r4.mDefaultTransition = r2     // Catch: java.lang.Throwable -> Lec
            goto Lbc
        Lb7:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r1 = r4.mAbstractTransitionList     // Catch: java.lang.Throwable -> Lec
            r1.add(r2)     // Catch: java.lang.Throwable -> Lec
        Lbc:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r1 = r4.mTransitionList     // Catch: java.lang.Throwable -> Lec
            r1.remove(r2)     // Catch: java.lang.Throwable -> Lec
            goto Le6
        Lc2:
            java.lang.String r3 = "KeyFrameSet"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lec
            if (r1 == 0) goto Le6
            androidx.constraintlayout.motion.widget.KeyFrames r1 = new androidx.constraintlayout.motion.widget.KeyFrames     // Catch: java.lang.Throwable -> Lec
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> Lec
            java.util.ArrayList r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1300(r2)     // Catch: java.lang.Throwable -> Lec
            r3.add(r1)     // Catch: java.lang.Throwable -> Lec
            goto Le6
        Ld7:
            java.lang.String r3 = "ConstraintSet"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lec
            if (r1 == 0) goto Le6
            r4.parseConstraintSet(r5, r0)     // Catch: java.lang.Throwable -> Lec
            goto Le6
        Le3:
            r0.getName()     // Catch: java.lang.Throwable -> Lec
        Le6:
            int r1 = r0.next()     // Catch: java.lang.Throwable -> Lec
            goto Ld
        Lec:
            return
    }

    private void parseConstraintSet(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
            r9 = this;
            androidx.constraintlayout.widget.ConstraintSet r0 = new androidx.constraintlayout.widget.ConstraintSet
            r0.<init>()
            r1 = 0
            r0.setForceId(r1)
            int r2 = r11.getAttributeCount()
            r3 = -1
            r4 = -1
            r5 = -1
        L10:
            if (r1 >= r2) goto L50
            java.lang.String r6 = r11.getAttributeName(r1)
            java.lang.String r7 = r11.getAttributeValue(r1)
            boolean r8 = r9.DEBUG_DESKTOP
            if (r8 == 0) goto L23
            java.io.PrintStream r8 = java.lang.System.out
            r8.getClass()
        L23:
            r6.getClass()
            java.lang.String r8 = "deriveConstraintsFrom"
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L49
            java.lang.String r8 = "id"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L37
            goto L4d
        L37:
            int r4 = r9.getId(r10, r7)
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r9.mConstraintSetIdMap
            java.lang.String r7 = stripID(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r6.put(r7, r8)
            goto L4d
        L49:
            int r5 = r9.getId(r10, r7)
        L4d:
            int r1 = r1 + 1
            goto L10
        L50:
            if (r4 == r3) goto L6b
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r9.mMotionLayout
            int r1 = r1.mDebugPath
            if (r1 == 0) goto L5c
            r1 = 1
            r0.setValidateOnParse(r1)
        L5c:
            r0.load(r10, r11)
            if (r5 == r3) goto L66
            android.util.SparseIntArray r10 = r9.mDeriveMap
            r10.put(r4, r5)
        L66:
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r10 = r9.mConstraintSetMap
            r10.put(r4, r0)
        L6b:
            return
    }

    private void parseMotionSceneTags(android.content.Context r5, org.xmlpull.v1.XmlPullParser r6) {
            r4 = this;
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r6)
            int[] r0 = androidx.constraintlayout.widget.R.styleable.MotionScene
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r0)
            int r6 = r5.getIndexCount()
            r0 = 0
            r1 = 0
        L10:
            if (r1 >= r6) goto L30
            int r2 = r5.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.R.styleable.MotionScene_defaultDuration
            if (r2 != r3) goto L23
            int r3 = r4.mDefaultDuration
            int r2 = r5.getInt(r2, r3)
            r4.mDefaultDuration = r2
            goto L2d
        L23:
            int r3 = androidx.constraintlayout.widget.R.styleable.MotionScene_layoutDuringTransition
            if (r2 != r3) goto L2d
            int r2 = r5.getInteger(r2, r0)
            r4.mLayoutDuringTransition = r2
        L2d:
            int r1 = r1 + 1
            goto L10
        L30:
            r5.recycle()
            return
    }

    private void readConstraintChain(int r4) {
            r3 = this;
            android.util.SparseIntArray r0 = r3.mDeriveMap
            int r0 = r0.get(r4)
            if (r0 <= 0) goto L36
            android.util.SparseIntArray r1 = r3.mDeriveMap
            int r1 = r1.get(r4)
            r3.readConstraintChain(r1)
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r1 = r3.mConstraintSetMap
            java.lang.Object r1 = r1.get(r4)
            androidx.constraintlayout.widget.ConstraintSet r1 = (androidx.constraintlayout.widget.ConstraintSet) r1
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r2 = r3.mConstraintSetMap
            java.lang.Object r2 = r2.get(r0)
            androidx.constraintlayout.widget.ConstraintSet r2 = (androidx.constraintlayout.widget.ConstraintSet) r2
            if (r2 != 0) goto L2d
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r3.mMotionLayout
            android.content.Context r4 = r4.getContext()
            androidx.constraintlayout.motion.widget.Debug.getName(r4, r0)
            return
        L2d:
            r1.readFallback(r2)
            android.util.SparseIntArray r0 = r3.mDeriveMap
            r1 = -1
            r0.put(r4, r1)
        L36:
            return
    }

    public static java.lang.String stripID(java.lang.String r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            return r1
        L5:
            r0 = 47
            int r0 = r1.indexOf(r0)
            if (r0 >= 0) goto Le
            return r1
        Le:
            int r0 = r0 + 1
            java.lang.String r1 = r1.substring(r0)
            return r1
    }

    public void addOnClickListeners(androidx.constraintlayout.motion.widget.MotionLayout r5, int r6) {
            r4 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r4.mTransitionList
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r1
            java.util.ArrayList r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$400(r1)
            int r2 = r2.size()
            if (r2 <= 0) goto L6
            java.util.ArrayList r1 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$400(r1)
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick r2 = (androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick) r2
            r2.removeOnClickListeners(r5)
            goto L24
        L34:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r4.mAbstractTransitionList
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r1
            java.util.ArrayList r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$400(r1)
            int r2 = r2.size()
            if (r2 <= 0) goto L3a
            java.util.ArrayList r1 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$400(r1)
            java.util.Iterator r1 = r1.iterator()
        L58:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick r2 = (androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick) r2
            r2.removeOnClickListeners(r5)
            goto L58
        L68:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r4.mTransitionList
            java.util.Iterator r0 = r0.iterator()
        L6e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L9c
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r1
            java.util.ArrayList r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$400(r1)
            int r2 = r2.size()
            if (r2 <= 0) goto L6e
            java.util.ArrayList r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$400(r1)
            java.util.Iterator r2 = r2.iterator()
        L8c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick r3 = (androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick) r3
            r3.addOnClickListeners(r5, r6, r1)
            goto L8c
        L9c:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r4.mAbstractTransitionList
            java.util.Iterator r0 = r0.iterator()
        La2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld0
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r1
            java.util.ArrayList r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$400(r1)
            int r2 = r2.size()
            if (r2 <= 0) goto La2
            java.util.ArrayList r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$400(r1)
            java.util.Iterator r2 = r2.iterator()
        Lc0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La2
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition$TransitionOnClick r3 = (androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick) r3
            r3.addOnClickListeners(r5, r6, r1)
            goto Lc0
        Ld0:
            return
    }

    public void addTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition r3) {
            r2 = this;
            int r0 = r2.getIndex(r3)
            r1 = -1
            if (r0 != r1) goto Ld
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r2.mTransitionList
            r0.add(r3)
            return
        Ld:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r1 = r2.mTransitionList
            r1.set(r0, r3)
            return
    }

    boolean autoTransition(androidx.constraintlayout.motion.widget.MotionLayout r8, int r9) {
            r7 = this;
            boolean r0 = r7.isProcessingTouch()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r7.mDisableAutoTransition
            if (r0 == 0) goto Ld
            return r1
        Ld:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r7.mTransitionList
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lb1
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r2 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r2
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$600(r2)
            if (r3 != 0) goto L26
            goto L13
        L26:
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r2)
            r4 = 1
            if (r9 != r3) goto L6d
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$600(r2)
            r5 = 4
            if (r3 == r5) goto L3b
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$600(r2)
            r6 = 2
            if (r3 != r6) goto L6d
        L3b:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r9 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r8.setState(r9)
            r8.setTransition(r2)
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$600(r2)
            if (r0 != r5) goto L57
            r8.transitionToEnd()
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r9 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP
            r8.setState(r9)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r9 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r8.setState(r9)
            goto L6c
        L57:
            r0 = 1065353216(0x3f800000, float:1.0)
            r8.setProgress(r0)
            r8.evaluate(r4)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP
            r8.setState(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r8.setState(r0)
            r8.setState(r9)
        L6c:
            return r4
        L6d:
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r2)
            if (r9 != r3) goto L13
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$600(r2)
            r5 = 3
            if (r3 == r5) goto L80
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$600(r2)
            if (r3 != r4) goto L13
        L80:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r9 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r8.setState(r9)
            r8.setTransition(r2)
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$600(r2)
            if (r0 != r5) goto L9c
            r8.transitionToStart()
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r9 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP
            r8.setState(r9)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r9 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r8.setState(r9)
            goto Lb0
        L9c:
            r0 = 0
            r8.setProgress(r0)
            r8.evaluate(r4)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP
            r8.setState(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r8.setState(r0)
            r8.setState(r9)
        Lb0:
            return r4
        Lb1:
            return r1
    }

    public androidx.constraintlayout.motion.widget.MotionScene.Transition bestTransitionFor(int r9, float r10, float r11, android.view.MotionEvent r12) {
            r8 = this;
            r0 = -1
            if (r9 == r0) goto L8d
            java.util.List r0 = r8.getTransitionsWithState(r9)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L12:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L8c
            java.lang.Object r4 = r0.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r4 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r4
            boolean r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$500(r4)
            if (r5 == 0) goto L25
            goto L12
        L25:
            androidx.constraintlayout.motion.widget.TouchResponse r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r4)
            if (r5 == 0) goto L12
            androidx.constraintlayout.motion.widget.TouchResponse r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r4)
            boolean r6 = r8.mRtl
            r5.setRTL(r6)
            androidx.constraintlayout.motion.widget.TouchResponse r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r4)
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r8.mMotionLayout
            android.graphics.RectF r5 = r5.getTouchRegion(r6, r1)
            if (r5 == 0) goto L51
            if (r12 == 0) goto L51
            float r6 = r12.getX()
            float r7 = r12.getY()
            boolean r5 = r5.contains(r6, r7)
            if (r5 != 0) goto L51
            goto L12
        L51:
            androidx.constraintlayout.motion.widget.TouchResponse r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r4)
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r8.mMotionLayout
            android.graphics.RectF r5 = r5.getTouchRegion(r6, r1)
            if (r5 == 0) goto L6e
            if (r12 == 0) goto L6e
            float r6 = r12.getX()
            float r7 = r12.getY()
            boolean r5 = r5.contains(r6, r7)
            if (r5 != 0) goto L6e
            goto L12
        L6e:
            androidx.constraintlayout.motion.widget.TouchResponse r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r4)
            float r5 = r5.dot(r10, r11)
            int r6 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r4)
            if (r6 != r9) goto L81
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
        L7e:
            float r5 = r5 * r6
            goto L85
        L81:
            r6 = 1066192077(0x3f8ccccd, float:1.1)
            goto L7e
        L85:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L12
            r3 = r4
            r2 = r5
            goto L12
        L8c:
            return r3
        L8d:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r9 = r8.mCurrentTransition
            return r9
    }

    public void disableAutoTransition(boolean r1) {
            r0 = this;
            r0.mDisableAutoTransition = r1
            return
    }

    public int gatPathMotionArc() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L9
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1800(r0)
            return r0
        L9:
            r0 = -1
            return r0
    }

    androidx.constraintlayout.widget.ConstraintSet getConstraintSet(int r2) {
            r1 = this;
            r0 = -1
            androidx.constraintlayout.widget.ConstraintSet r2 = r1.getConstraintSet(r2, r0, r0)
            return r2
    }

    androidx.constraintlayout.widget.ConstraintSet getConstraintSet(int r3, int r4, int r5) {
            r2 = this;
            boolean r0 = r2.DEBUG_DESKTOP
            if (r0 == 0) goto L13
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            java.io.PrintStream r0 = java.lang.System.out
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r1 = r2.mConstraintSetMap
            r1.size()
            r0.getClass()
        L13:
            androidx.constraintlayout.widget.StateSet r0 = r2.mStateSet
            if (r0 == 0) goto L1f
            int r4 = r0.stateGetConstraintID(r3, r4, r5)
            r5 = -1
            if (r4 == r5) goto L1f
            r3 = r4
        L1f:
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r4 = r2.mConstraintSetMap
            java.lang.Object r4 = r4.get(r3)
            if (r4 != 0) goto L3e
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r2.mMotionLayout
            android.content.Context r4 = r4.getContext()
            androidx.constraintlayout.motion.widget.Debug.getName(r4, r3)
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r3 = r2.mConstraintSetMap
            r4 = 0
            int r4 = r3.keyAt(r4)
            java.lang.Object r3 = r3.get(r4)
            androidx.constraintlayout.widget.ConstraintSet r3 = (androidx.constraintlayout.widget.ConstraintSet) r3
            return r3
        L3e:
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r4 = r2.mConstraintSetMap
            java.lang.Object r3 = r4.get(r3)
            androidx.constraintlayout.widget.ConstraintSet r3 = (androidx.constraintlayout.widget.ConstraintSet) r3
            return r3
    }

    public androidx.constraintlayout.widget.ConstraintSet getConstraintSet(android.content.Context r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = r4.DEBUG_DESKTOP
            if (r0 == 0) goto L13
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            java.io.PrintStream r0 = java.lang.System.out
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r1 = r4.mConstraintSetMap
            r1.size()
            r0.getClass()
        L13:
            r0 = 0
        L14:
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r1 = r4.mConstraintSetMap
            int r1 = r1.size()
            if (r0 >= r1) goto L45
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r1 = r4.mConstraintSetMap
            int r1 = r1.keyAt(r0)
            android.content.res.Resources r2 = r5.getResources()
            java.lang.String r2 = r2.getResourceName(r1)
            boolean r3 = r4.DEBUG_DESKTOP
            if (r3 == 0) goto L33
            java.io.PrintStream r3 = java.lang.System.out
            r3.getClass()
        L33:
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L42
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r5 = r4.mConstraintSetMap
            java.lang.Object r5 = r5.get(r1)
            androidx.constraintlayout.widget.ConstraintSet r5 = (androidx.constraintlayout.widget.ConstraintSet) r5
            return r5
        L42:
            int r0 = r0 + 1
            goto L14
        L45:
            r5 = 0
            return r5
    }

    public int[] getConstraintSetIds() {
            r4 = this;
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r0 = r4.mConstraintSetMap
            int r0 = r0.size()
            int[] r1 = new int[r0]
            r2 = 0
        L9:
            if (r2 >= r0) goto L16
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r3 = r4.mConstraintSetMap
            int r3 = r3.keyAt(r2)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L16:
            return r1
    }

    public java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> getDefinedTransitions() {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r1.mTransitionList
            return r0
    }

    public int getDuration() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L9
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1700(r0)
            return r0
        L9:
            int r0 = r1.mDefaultDuration
            return r0
    }

    int getEndId() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r0)
            return r0
    }

    public android.view.animation.Interpolator getInterpolator() {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r2.mCurrentTransition
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1400(r0)
            r1 = -2
            if (r0 == r1) goto L4a
            r1 = -1
            if (r0 == r1) goto L3a
            if (r0 == 0) goto L34
            r1 = 1
            if (r0 == r1) goto L2e
            r1 = 2
            if (r0 == r1) goto L28
            r1 = 4
            if (r0 == r1) goto L22
            r1 = 5
            if (r0 == r1) goto L1c
            r0 = 0
            return r0
        L1c:
            android.view.animation.BounceInterpolator r0 = new android.view.animation.BounceInterpolator
            r0.<init>()
            return r0
        L22:
            android.view.animation.AnticipateInterpolator r0 = new android.view.animation.AnticipateInterpolator
            r0.<init>()
            return r0
        L28:
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            return r0
        L2e:
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            return r0
        L34:
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            return r0
        L3a:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r2.mCurrentTransition
            java.lang.String r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1500(r0)
            androidx.constraintlayout.motion.utils.Easing r0 = androidx.constraintlayout.motion.utils.Easing.getInterpolator(r0)
            androidx.constraintlayout.motion.widget.MotionScene$1 r1 = new androidx.constraintlayout.motion.widget.MotionScene$1
            r1.<init>(r2, r0)
            return r1
        L4a:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.mMotionLayout
            android.content.Context r0 = r0.getContext()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = r2.mCurrentTransition
            int r1 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1600(r1)
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r0, r1)
            return r0
    }

    androidx.constraintlayout.motion.widget.Key getKeyFrame(android.content.Context r7, int r8, int r9, int r10) {
            r6 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r7 = r6.mCurrentTransition
            r0 = 0
            if (r7 != 0) goto L6
            return r0
        L6:
            java.util.ArrayList r7 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1300(r7)
            java.util.Iterator r7 = r7.iterator()
        Le:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L55
            java.lang.Object r1 = r7.next()
            androidx.constraintlayout.motion.widget.KeyFrames r1 = (androidx.constraintlayout.motion.widget.KeyFrames) r1
            java.util.Set r2 = r1.getKeys()
            java.util.Iterator r2 = r2.iterator()
        L22:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Le
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r4 = r3.intValue()
            if (r9 != r4) goto L22
            int r3 = r3.intValue()
            java.util.ArrayList r3 = r1.getKeyFramesForView(r3)
            java.util.Iterator r3 = r3.iterator()
        L40:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.Key r4 = (androidx.constraintlayout.motion.widget.Key) r4
            int r5 = r4.mFramePosition
            if (r5 != r10) goto L40
            int r5 = r4.mType
            if (r5 != r8) goto L40
            return r4
        L55:
            return r0
    }

    public void getKeyFrames(androidx.constraintlayout.motion.widget.MotionController r3) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r2.mCurrentTransition
            if (r0 != 0) goto L20
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r2.mDefaultTransition
            if (r0 == 0) goto L38
            java.util.ArrayList r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1300(r0)
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.KeyFrames r1 = (androidx.constraintlayout.motion.widget.KeyFrames) r1
            r1.addFrames(r3)
            goto L10
        L20:
            java.util.ArrayList r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1300(r0)
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.KeyFrames r1 = (androidx.constraintlayout.motion.widget.KeyFrames) r1
            r1.addFrames(r3)
            goto L28
        L38:
            return
    }

    float getMaxAcceleration() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            float r0 = r0.getMaxAcceleration()
            return r0
        L15:
            r0 = 0
            return r0
    }

    float getMaxVelocity() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            float r0 = r0.getMaxVelocity()
            return r0
        L15:
            r0 = 0
            return r0
    }

    boolean getMoveWhenScrollAtTop() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            boolean r0 = r0.getMoveWhenScrollAtTop()
            return r0
        L15:
            r0 = 0
            return r0
    }

    public float getPathPercent(android.view.View r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    float getProgressDirection(float r2, float r3) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            float r2 = r0.getProgressDirection(r2, r3)
            return r2
        L15:
            r2 = 0
            return r2
    }

    public float getStaggered() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L9
            float r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1900(r0)
            return r0
        L9:
            r0 = 0
            return r0
    }

    int getStartId() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r0)
            return r0
    }

    public androidx.constraintlayout.motion.widget.MotionScene.Transition getTransitionById(int r4) {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r3.mTransitionList
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r1
            int r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$300(r1)
            if (r2 != r4) goto L6
            return r1
        L19:
            r4 = 0
            return r4
    }

    int getTransitionDirection(int r3) {
            r2 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r2.mTransitionList
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r1
            int r1 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r1)
            if (r1 != r3) goto L6
            r3 = 0
            return r3
        L1a:
            r3 = 1
            return r3
    }

    public java.util.List<androidx.constraintlayout.motion.widget.MotionScene.Transition> getTransitionsWithState(int r5) {
            r4 = this;
            int r5 = r4.getRealID(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r1 = r4.mTransitionList
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r2 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r2
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r2)
            if (r3 == r5) goto L27
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r2)
            if (r3 != r5) goto Lf
        L27:
            r0.add(r2)
            goto Lf
        L2b:
            return r0
    }

    boolean hasKeyFramePosition(android.view.View r5, int r6) {
            r4 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r4.mCurrentTransition
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.ArrayList r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1300(r0)
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.motion.widget.KeyFrames r2 = (androidx.constraintlayout.motion.widget.KeyFrames) r2
            int r3 = r5.getId()
            java.util.ArrayList r2 = r2.getKeyFramesForView(r3)
            java.util.Iterator r2 = r2.iterator()
        L26:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Le
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.Key r3 = (androidx.constraintlayout.motion.widget.Key) r3
            int r3 = r3.mFramePosition
            if (r3 != r6) goto L26
            r5 = 1
            return r5
        L38:
            return r1
    }

    public int lookUpConstraintId(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r1.mConstraintSetIdMap
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    public java.lang.String lookUpConstraintName(int r4) {
            r3 = this;
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r3.mConstraintSetIdMap
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r4) goto La
            java.lang.Object r4 = r1.getKey()
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L29:
            r4 = 0
            return r4
    }

    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            return
    }

    void processScrollMove(float r2, float r3) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L13
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            if (r0 == 0) goto L13
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            r0.scrollMove(r2, r3)
        L13:
            return
    }

    void processScrollUp(float r2, float r3) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L13
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            if (r0 == 0) goto L13
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            r0.scrollUp(r2, r3)
        L13:
            return
    }

    void processTouchEvent(android.view.MotionEvent r13, int r14, androidx.constraintlayout.motion.widget.MotionLayout r15) {
            r12 = this;
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker r1 = r12.mVelocityTracker
            if (r1 != 0) goto L11
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r12.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker r1 = r1.obtainVelocityTracker()
            r12.mVelocityTracker = r1
        L11:
            androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker r1 = r12.mVelocityTracker
            r1.addMovement(r13)
            r1 = 0
            r2 = -1
            r3 = 1
            if (r14 == r2) goto Led
            int r4 = r13.getAction()
            r5 = 0
            if (r4 == 0) goto L81
            r6 = 2
            if (r4 == r6) goto L27
            goto Led
        L27:
            float r4 = r13.getRawY()
            float r6 = r12.mLastTouchY
            float r4 = r4 - r6
            float r6 = r13.getRawX()
            float r7 = r12.mLastTouchX
            float r6 = r6 - r7
            double r7 = (double) r6
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L41
            double r7 = (double) r4
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L128
        L41:
            android.view.MotionEvent r7 = r12.mLastTouchDown
            if (r7 != 0) goto L47
            goto L128
        L47:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r4 = r12.bestTransitionFor(r14, r6, r4, r7)
            if (r4 == 0) goto Led
            r15.setTransition(r4)
            androidx.constraintlayout.motion.widget.MotionScene$Transition r4 = r12.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r4 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r4)
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r12.mMotionLayout
            android.graphics.RectF r0 = r4.getTouchRegion(r6, r0)
            if (r0 == 0) goto L71
            android.view.MotionEvent r4 = r12.mLastTouchDown
            float r4 = r4.getX()
            android.view.MotionEvent r6 = r12.mLastTouchDown
            float r6 = r6.getY()
            boolean r0 = r0.contains(r4, r6)
            if (r0 != 0) goto L71
            r5 = 1
        L71:
            r12.mMotionOutsideRegion = r5
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r12.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            float r4 = r12.mLastTouchX
            float r5 = r12.mLastTouchY
            r0.setUpTouchEvent(r4, r5)
            goto Led
        L81:
            float r14 = r13.getRawX()
            r12.mLastTouchX = r14
            float r14 = r13.getRawY()
            r12.mLastTouchY = r14
            r12.mLastTouchDown = r13
            androidx.constraintlayout.motion.widget.MotionScene$Transition r13 = r12.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r13 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r13)
            if (r13 == 0) goto L128
            androidx.constraintlayout.motion.widget.MotionScene$Transition r13 = r12.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r13 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r13)
            androidx.constraintlayout.motion.widget.MotionLayout r14 = r12.mMotionLayout
            android.graphics.RectF r13 = r13.getLimitBoundsTo(r14, r0)
            if (r13 == 0) goto Lba
            android.view.MotionEvent r14 = r12.mLastTouchDown
            float r14 = r14.getX()
            android.view.MotionEvent r15 = r12.mLastTouchDown
            float r15 = r15.getY()
            boolean r13 = r13.contains(r14, r15)
            if (r13 != 0) goto Lba
            r12.mLastTouchDown = r1
            return
        Lba:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r13 = r12.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r13 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r13)
            androidx.constraintlayout.motion.widget.MotionLayout r14 = r12.mMotionLayout
            android.graphics.RectF r13 = r13.getTouchRegion(r14, r0)
            if (r13 == 0) goto Ldd
            android.view.MotionEvent r14 = r12.mLastTouchDown
            float r14 = r14.getX()
            android.view.MotionEvent r15 = r12.mLastTouchDown
            float r15 = r15.getY()
            boolean r13 = r13.contains(r14, r15)
            if (r13 != 0) goto Ldd
            r12.mMotionOutsideRegion = r3
            goto Ldf
        Ldd:
            r12.mMotionOutsideRegion = r5
        Ldf:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r13 = r12.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r13 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r13)
            float r14 = r12.mLastTouchX
            float r15 = r12.mLastTouchY
            r13.setDown(r14, r15)
            return
        Led:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r12.mCurrentTransition
            if (r0 == 0) goto L106
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            if (r0 == 0) goto L106
            boolean r0 = r12.mMotionOutsideRegion
            if (r0 != 0) goto L106
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r12.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker r4 = r12.mVelocityTracker
            r0.processTouchEvent(r13, r4, r14, r12)
        L106:
            float r14 = r13.getRawX()
            r12.mLastTouchX = r14
            float r14 = r13.getRawY()
            r12.mLastTouchY = r14
            int r13 = r13.getAction()
            if (r13 != r3) goto L128
            androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker r13 = r12.mVelocityTracker
            if (r13 == 0) goto L128
            r13.recycle()
            r12.mVelocityTracker = r1
            int r13 = r15.mCurrentState
            if (r13 == r2) goto L128
            r12.autoTransition(r15, r13)
        L128:
            return
    }

    void readFallback(androidx.constraintlayout.motion.widget.MotionLayout r5) {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r2 = r4.mConstraintSetMap
            int r2 = r2.size()
            if (r1 >= r2) goto L1d
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r2 = r4.mConstraintSetMap
            int r2 = r2.keyAt(r1)
            boolean r3 = r4.hasCycleDependency(r2)
            if (r3 == 0) goto L17
            return
        L17:
            r4.readConstraintChain(r2)
            int r1 = r1 + 1
            goto L2
        L1d:
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r1 = r4.mConstraintSetMap
            int r1 = r1.size()
            if (r0 >= r1) goto L33
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r1 = r4.mConstraintSetMap
            java.lang.Object r1 = r1.valueAt(r0)
            androidx.constraintlayout.widget.ConstraintSet r1 = (androidx.constraintlayout.widget.ConstraintSet) r1
            r1.readFallback(r5)
            int r0 = r0 + 1
            goto L1d
        L33:
            return
    }

    public void removeTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition r2) {
            r1 = this;
            int r2 = r1.getIndex(r2)
            r0 = -1
            if (r2 == r0) goto Lc
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r1.mTransitionList
            r0.remove(r2)
        Lc:
            return
    }

    public void setConstraintSet(int r2, androidx.constraintlayout.widget.ConstraintSet r3) {
            r1 = this;
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r0 = r1.mConstraintSetMap
            r0.put(r2, r3)
            return
    }

    public void setDuration(int r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L8
            r0.setDuration(r2)
            return
        L8:
            r1.mDefaultDuration = r2
            return
    }

    public void setKeyframe(android.view.View r4, int r5, java.lang.String r6, java.lang.Object r7) {
            r3 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r3.mCurrentTransition
            if (r0 != 0) goto L5
            goto L40
        L5:
            java.util.ArrayList r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1300(r0)
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.KeyFrames r1 = (androidx.constraintlayout.motion.widget.KeyFrames) r1
            int r2 = r4.getId()
            java.util.ArrayList r1 = r1.getKeyFramesForView(r2)
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.motion.widget.Key r2 = (androidx.constraintlayout.motion.widget.Key) r2
            int r2 = r2.mFramePosition
            if (r2 != r5) goto L25
            if (r7 == 0) goto L3a
            r2 = r7
            java.lang.Float r2 = (java.lang.Float) r2
        L3a:
            java.lang.String r2 = "app:PerpendicularPath_percent"
            r6.equalsIgnoreCase(r2)
            goto L25
        L40:
            return
    }

    public void setRtl(boolean r2) {
            r1 = this;
            r1.mRtl = r2
            androidx.constraintlayout.motion.widget.MotionScene$Transition r2 = r1.mCurrentTransition
            if (r2 == 0) goto L17
            androidx.constraintlayout.motion.widget.TouchResponse r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r2)
            if (r2 == 0) goto L17
            androidx.constraintlayout.motion.widget.MotionScene$Transition r2 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r2)
            boolean r0 = r1.mRtl
            r2.setRTL(r0)
        L17:
            return
    }

    void setTransition(int r7, int r8) {
            r6 = this;
            androidx.constraintlayout.widget.StateSet r0 = r6.mStateSet
            r1 = -1
            if (r0 == 0) goto L18
            int r0 = r0.stateGetConstraintID(r7, r1, r1)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r7
        Ld:
            androidx.constraintlayout.widget.StateSet r2 = r6.mStateSet
            int r2 = r2.stateGetConstraintID(r8, r1, r1)
            if (r2 == r1) goto L16
            goto L1a
        L16:
            r2 = r8
            goto L1a
        L18:
            r0 = r7
            goto L16
        L1a:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r3 = r6.mTransitionList
            java.util.Iterator r3 = r3.iterator()
        L20:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r4 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r4
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r4)
            if (r5 != r2) goto L38
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r4)
            if (r5 == r0) goto L44
        L38:
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r4)
            if (r5 != r8) goto L20
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r4)
            if (r5 != r7) goto L20
        L44:
            r6.mCurrentTransition = r4
            if (r4 == 0) goto L59
            androidx.constraintlayout.motion.widget.TouchResponse r7 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r4)
            if (r7 == 0) goto L59
            androidx.constraintlayout.motion.widget.MotionScene$Transition r7 = r6.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r7 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r7)
            boolean r8 = r6.mRtl
            r7.setRTL(r8)
        L59:
            return
        L5a:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r7 = r6.mDefaultTransition
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r3 = r6.mAbstractTransitionList
            java.util.Iterator r3 = r3.iterator()
        L62:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L76
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r4 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r4
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r4)
            if (r5 != r8) goto L62
            r7 = r4
            goto L62
        L76:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r8 = new androidx.constraintlayout.motion.widget.MotionScene$Transition
            r8.<init>(r6, r7)
            androidx.constraintlayout.motion.widget.MotionScene.Transition.access$102(r8, r0)
            androidx.constraintlayout.motion.widget.MotionScene.Transition.access$002(r8, r2)
            if (r0 == r1) goto L88
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r7 = r6.mTransitionList
            r7.add(r8)
        L88:
            r6.mCurrentTransition = r8
            return
    }

    public void setTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition r2) {
            r1 = this;
            r1.mCurrentTransition = r2
            if (r2 == 0) goto L15
            androidx.constraintlayout.motion.widget.TouchResponse r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r2)
            if (r2 == 0) goto L15
            androidx.constraintlayout.motion.widget.MotionScene$Transition r2 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r2 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r2)
            boolean r0 = r1.mRtl
            r2.setRTL(r0)
        L15:
            return
    }

    void setupTouch() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            if (r0 == 0) goto L13
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            if (r0 == 0) goto L13
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            r0.setupTouch()
        L13:
            return
    }

    boolean supportTouch() {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r3.mTransitionList
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r1
            androidx.constraintlayout.motion.widget.TouchResponse r1 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r1)
            if (r1 == 0) goto L6
            return r2
        L1a:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r3.mCurrentTransition
            if (r0 == 0) goto L25
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            if (r0 == 0) goto L25
            return r2
        L25:
            r0 = 0
            return r0
    }

    public boolean validateLayout(androidx.constraintlayout.motion.widget.MotionLayout r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.mMotionLayout
            if (r2 != r0) goto La
            androidx.constraintlayout.motion.widget.MotionScene r2 = r2.mScene
            if (r2 != r1) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }
}
