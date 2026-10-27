package androidx.constraintlayout.motion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class MotionLayout extends androidx.constraintlayout.widget.ConstraintLayout implements androidx.core.view.NestedScrollingParent3 {
    private static final boolean DEBUG = false;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    private static final float EPSILON = 1.0E-5f;
    public static boolean IS_IN_EDIT_MODE = false;
    static final int MAX_KEY_FRAMES = 50;
    static final java.lang.String TAG = "MotionLayout";
    public static final int TOUCH_UP_COMPLETE = 0;
    public static final int TOUCH_UP_COMPLETE_TO_END = 2;
    public static final int TOUCH_UP_COMPLETE_TO_START = 1;
    public static final int TOUCH_UP_DECELERATE = 4;
    public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int TOUCH_UP_STOP = 3;
    public static final int VELOCITY_LAYOUT = 1;
    public static final int VELOCITY_POST_LAYOUT = 0;
    public static final int VELOCITY_STATIC_LAYOUT = 3;
    public static final int VELOCITY_STATIC_POST_LAYOUT = 2;
    boolean firstDown;
    private float lastPos;
    private float lastY;
    private long mAnimationStartTime;
    private int mBeginState;
    private android.graphics.RectF mBoundsCheck;
    int mCurrentState;
    int mDebugPath;
    private androidx.constraintlayout.motion.widget.MotionLayout.DecelerateInterpolator mDecelerateLogic;
    private androidx.constraintlayout.motion.widget.DesignTool mDesignTool;
    androidx.constraintlayout.motion.widget.MotionLayout.DevModeDraw mDevModeDraw;
    private int mEndState;
    int mEndWrapHeight;
    int mEndWrapWidth;
    java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> mFrameArrayList;
    private int mFrames;
    int mHeightMeasureMode;
    private boolean mInLayout;
    boolean mInTransition;
    boolean mIndirectTransition;
    private boolean mInteractionEnabled;
    android.view.animation.Interpolator mInterpolator;
    boolean mIsAnimating;
    private boolean mKeepAnimating;
    private androidx.constraintlayout.motion.widget.KeyCache mKeyCache;
    private long mLastDrawTime;
    private float mLastFps;
    private int mLastHeightMeasureSpec;
    int mLastLayoutHeight;
    int mLastLayoutWidth;
    float mLastVelocity;
    private int mLastWidthMeasureSpec;
    private float mListenerPosition;
    private int mListenerState;
    protected boolean mMeasureDuringTransition;
    androidx.constraintlayout.motion.widget.MotionLayout.Model mModel;
    private boolean mNeedsFireTransitionCompleted;
    int mOldHeight;
    int mOldWidth;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> mOnHideHelpers;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> mOnShowHelpers;
    float mPostInterpolationPosition;
    private android.view.View mRegionView;
    androidx.constraintlayout.motion.widget.MotionScene mScene;
    float mScrollTargetDT;
    float mScrollTargetDX;
    float mScrollTargetDY;
    long mScrollTargetTime;
    int mStartWrapHeight;
    int mStartWrapWidth;
    private androidx.constraintlayout.motion.widget.MotionLayout.StateCache mStateCache;
    private androidx.constraintlayout.motion.utils.StopLogic mStopLogic;
    private boolean mTemporalInterpolator;
    java.util.ArrayList<java.lang.Integer> mTransitionCompleted;
    private float mTransitionDuration;
    float mTransitionGoalPosition;
    private boolean mTransitionInstantly;
    float mTransitionLastPosition;
    private long mTransitionLastTime;
    private androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener mTransitionListener;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> mTransitionListeners;
    float mTransitionPosition;
    androidx.constraintlayout.motion.widget.MotionLayout.TransitionState mTransitionState;
    boolean mUndergoingMotion;
    int mWidthMeasureMode;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState = null;

        static {
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.motion.widget.MotionLayout.AnonymousClass2.$SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState = r0
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.AnonymousClass2.$SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.AnonymousClass2.$SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.AnonymousClass2.$SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class DecelerateInterpolator extends androidx.constraintlayout.motion.widget.MotionInterpolator {
        float currentP;
        float initalV;
        float maxA;
        final /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout this$0;

        DecelerateInterpolator(androidx.constraintlayout.motion.widget.MotionLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 0
                r0.initalV = r1
                r0.currentP = r1
                return
        }

        public void config(float r1, float r2, float r3) {
                r0 = this;
                r0.initalV = r1
                r0.currentP = r2
                r0.maxA = r3
                return
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float r6) {
                r5 = this;
                float r0 = r5.initalV
                r1 = 0
                r2 = 1073741824(0x40000000, float:2.0)
                int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r1 <= 0) goto L27
                float r1 = r5.maxA
                float r3 = r0 / r1
                int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r3 >= 0) goto L13
                float r6 = r0 / r1
            L13:
                androidx.constraintlayout.motion.widget.MotionLayout r3 = r5.this$0
                float r4 = r1 * r6
                float r4 = r0 - r4
                r3.mLastVelocity = r4
                float r0 = r0 * r6
                float r1 = r1 * r6
                float r1 = r1 * r6
                float r1 = r1 / r2
                float r0 = r0 - r1
                float r6 = r5.currentP
            L25:
                float r0 = r0 + r6
                return r0
            L27:
                float r1 = -r0
                float r3 = r5.maxA
                float r1 = r1 / r3
                int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r1 >= 0) goto L31
                float r6 = -r0
                float r6 = r6 / r3
            L31:
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r5.this$0
                float r4 = r3 * r6
                float r4 = r4 + r0
                r1.mLastVelocity = r4
                float r0 = r0 * r6
                float r3 = r3 * r6
                float r3 = r3 * r6
                float r3 = r3 / r2
                float r0 = r0 + r3
                float r6 = r5.currentP
                goto L25
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
        public float getVelocity() {
                r1 = this;
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.this$0
                float r0 = r0.mLastVelocity
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class DevModeDraw {
        private static final int DEBUG_PATH_TICKS_PER_MS = 16;
        final int DIAMOND_SIZE;
        final int GRAPH_COLOR;
        final int KEYFRAME_COLOR;
        final int RED_COLOR;
        final int SHADOW_COLOR;
        android.graphics.Rect mBounds;
        android.graphics.DashPathEffect mDashPathEffect;
        android.graphics.Paint mFillPaint;
        int mKeyFrameCount;
        float[] mKeyFramePoints;
        android.graphics.Paint mPaint;
        android.graphics.Paint mPaintGraph;
        android.graphics.Paint mPaintKeyframes;
        android.graphics.Path mPath;
        int[] mPathMode;
        float[] mPoints;
        boolean mPresentationMode;
        private float[] mRectangle;
        int mShadowTranslate;
        android.graphics.Paint mTextPaint;
        final /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout this$0;

        public DevModeDraw(androidx.constraintlayout.motion.widget.MotionLayout r7) {
                r6 = this;
                r6.this$0 = r7
                r6.<init>()
                r0 = -21965(0xffffffffffffaa33, float:NaN)
                r6.RED_COLOR = r0
                r1 = -2067046(0xffffffffffe0759a, float:NaN)
                r6.KEYFRAME_COLOR = r1
                r2 = -13391360(0xffffffffff33aa00, float:-2.388145E38)
                r6.GRAPH_COLOR = r2
                r3 = 1996488704(0x77000000, float:2.5961484E33)
                r6.SHADOW_COLOR = r3
                r3 = 10
                r6.DIAMOND_SIZE = r3
                android.graphics.Rect r3 = new android.graphics.Rect
                r3.<init>()
                r6.mBounds = r3
                r3 = 0
                r6.mPresentationMode = r3
                r3 = 1
                r6.mShadowTranslate = r3
                android.graphics.Paint r4 = new android.graphics.Paint
                r4.<init>()
                r6.mPaint = r4
                r4.setAntiAlias(r3)
                android.graphics.Paint r4 = r6.mPaint
                r4.setColor(r0)
                android.graphics.Paint r0 = r6.mPaint
                r4 = 1073741824(0x40000000, float:2.0)
                r0.setStrokeWidth(r4)
                android.graphics.Paint r0 = r6.mPaint
                android.graphics.Paint$Style r5 = android.graphics.Paint.Style.STROKE
                r0.setStyle(r5)
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                r6.mPaintKeyframes = r0
                r0.setAntiAlias(r3)
                android.graphics.Paint r0 = r6.mPaintKeyframes
                r0.setColor(r1)
                android.graphics.Paint r0 = r6.mPaintKeyframes
                r0.setStrokeWidth(r4)
                android.graphics.Paint r0 = r6.mPaintKeyframes
                r0.setStyle(r5)
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                r6.mPaintGraph = r0
                r0.setAntiAlias(r3)
                android.graphics.Paint r0 = r6.mPaintGraph
                r0.setColor(r2)
                android.graphics.Paint r0 = r6.mPaintGraph
                r0.setStrokeWidth(r4)
                android.graphics.Paint r0 = r6.mPaintGraph
                r0.setStyle(r5)
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                r6.mTextPaint = r0
                r0.setAntiAlias(r3)
                android.graphics.Paint r0 = r6.mTextPaint
                r0.setColor(r2)
                android.graphics.Paint r0 = r6.mTextPaint
                android.content.Context r7 = r7.getContext()
                android.content.res.Resources r7 = r7.getResources()
                android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
                float r7 = r7.density
                r1 = 1094713344(0x41400000, float:12.0)
                float r7 = r7 * r1
                r0.setTextSize(r7)
                r7 = 8
                float[] r7 = new float[r7]
                r6.mRectangle = r7
                android.graphics.Paint r7 = new android.graphics.Paint
                r7.<init>()
                r6.mFillPaint = r7
                r7.setAntiAlias(r3)
                android.graphics.DashPathEffect r7 = new android.graphics.DashPathEffect
                r0 = 2
                float[] r0 = new float[r0]
                r0 = {x00e6: FILL_ARRAY_DATA , data: [1082130432, 1090519040} // fill-array
                r1 = 0
                r7.<init>(r0, r1)
                r6.mDashPathEffect = r7
                android.graphics.Paint r0 = r6.mPaintGraph
                r0.setPathEffect(r7)
                r7 = 100
                float[] r7 = new float[r7]
                r6.mKeyFramePoints = r7
                r7 = 50
                int[] r7 = new int[r7]
                r6.mPathMode = r7
                boolean r7 = r6.mPresentationMode
                if (r7 == 0) goto Le4
                android.graphics.Paint r7 = r6.mPaint
                r0 = 1090519040(0x41000000, float:8.0)
                r7.setStrokeWidth(r0)
                android.graphics.Paint r7 = r6.mFillPaint
                r7.setStrokeWidth(r0)
                android.graphics.Paint r7 = r6.mPaintKeyframes
                r7.setStrokeWidth(r0)
                r7 = 4
                r6.mShadowTranslate = r7
            Le4:
                return
        }

        private void drawBasicPath(android.graphics.Canvas r3) {
                r2 = this;
                float[] r0 = r2.mPoints
                android.graphics.Paint r1 = r2.mPaint
                r3.drawLines(r0, r1)
                return
        }

        private void drawPathAsConfigured(android.graphics.Canvas r7) {
                r6 = this;
                r0 = 0
                r1 = 0
                r2 = 0
            L3:
                int r3 = r6.mKeyFrameCount
                if (r0 >= r3) goto L16
                int[] r3 = r6.mPathMode
                r3 = r3[r0]
                r4 = 1
                if (r3 != r4) goto Lf
                r1 = 1
            Lf:
                r5 = 2
                if (r3 != r5) goto L13
                r2 = 1
            L13:
                int r0 = r0 + 1
                goto L3
            L16:
                if (r1 == 0) goto L1b
                r6.drawPathRelative(r7)
            L1b:
                if (r2 == 0) goto L20
                r6.drawPathCartesian(r7)
            L20:
                return
        }

        private void drawPathCartesian(android.graphics.Canvas r19) {
                r18 = this;
                r0 = r18
                float[] r1 = r0.mPoints
                r2 = 0
                r2 = r1[r2]
                r3 = 1
                r4 = r1[r3]
                int r5 = r1.length
                int r5 = r5 + (-2)
                r5 = r1[r5]
                int r6 = r1.length
                int r6 = r6 - r3
                r1 = r1[r6]
                float r7 = java.lang.Math.min(r2, r5)
                float r8 = java.lang.Math.max(r4, r1)
                float r9 = java.lang.Math.max(r2, r5)
                float r10 = java.lang.Math.max(r4, r1)
                android.graphics.Paint r11 = r0.mPaintGraph
                r6 = r19
                r6.drawLine(r7, r8, r9, r10, r11)
                float r13 = java.lang.Math.min(r2, r5)
                float r14 = java.lang.Math.min(r4, r1)
                float r15 = java.lang.Math.min(r2, r5)
                float r16 = java.lang.Math.max(r4, r1)
                android.graphics.Paint r1 = r0.mPaintGraph
                r12 = r19
                r17 = r1
                r12.drawLine(r13, r14, r15, r16, r17)
                return
        }

        private void drawPathCartesianTicks(android.graphics.Canvas r18, float r19, float r20) {
                r17 = this;
                r0 = r17
                r1 = r18
                float[] r2 = r0.mPoints
                r3 = 0
                r3 = r2[r3]
                r4 = 1
                r7 = r2[r4]
                int r5 = r2.length
                int r5 = r5 + (-2)
                r5 = r2[r5]
                int r6 = r2.length
                int r6 = r6 - r4
                r8 = r2[r6]
                float r2 = java.lang.Math.min(r3, r5)
                float r9 = java.lang.Math.max(r7, r8)
                float r4 = java.lang.Math.min(r3, r5)
                float r4 = r19 - r4
                float r6 = java.lang.Math.max(r7, r8)
                float r10 = r6 - r20
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r11 = ""
                r6.append(r11)
                r12 = 1120403456(0x42c80000, float:100.0)
                float r13 = r4 * r12
                float r14 = r5 - r3
                float r14 = java.lang.Math.abs(r14)
                float r13 = r13 / r14
                double r13 = (double) r13
                r15 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                double r13 = r13 + r15
                int r13 = (int) r13
                float r13 = (float) r13
                float r13 = r13 / r12
                r6.append(r13)
                java.lang.String r6 = r6.toString()
                android.graphics.Paint r13 = r0.mTextPaint
                r0.getTextBounds(r6, r13)
                r13 = 1073741824(0x40000000, float:2.0)
                float r4 = r4 / r13
                android.graphics.Rect r14 = r0.mBounds
                int r14 = r14.width()
                int r14 = r14 / 2
                float r14 = (float) r14
                float r4 = r4 - r14
                float r4 = r4 + r2
                r2 = 1101004800(0x41a00000, float:20.0)
                float r2 = r20 - r2
                android.graphics.Paint r14 = r0.mTextPaint
                r1.drawText(r6, r4, r2, r14)
                float r4 = java.lang.Math.min(r3, r5)
                android.graphics.Paint r6 = r0.mPaintGraph
                r5 = r20
                r2 = r19
                r3 = r20
                r1.drawLine(r2, r3, r4, r5, r6)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r11)
                float r3 = r10 * r12
                float r4 = r8 - r7
                float r4 = java.lang.Math.abs(r4)
                float r3 = r3 / r4
                double r3 = (double) r3
                double r3 = r3 + r15
                int r3 = (int) r3
                float r3 = (float) r3
                float r3 = r3 / r12
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.graphics.Paint r3 = r0.mTextPaint
                r0.getTextBounds(r2, r3)
                float r10 = r10 / r13
                android.graphics.Rect r3 = r0.mBounds
                int r3 = r3.height()
                int r3 = r3 / 2
                float r3 = (float) r3
                float r10 = r10 - r3
                r3 = 1084227584(0x40a00000, float:5.0)
                float r3 = r19 + r3
                float r9 = r9 - r10
                android.graphics.Paint r4 = r0.mTextPaint
                r1.drawText(r2, r3, r9, r4)
                float r5 = java.lang.Math.max(r7, r8)
                android.graphics.Paint r6 = r0.mPaintGraph
                r4 = r19
                r2 = r19
                r3 = r20
                r1.drawLine(r2, r3, r4, r5, r6)
                return
        }

        private void drawPathRelative(android.graphics.Canvas r9) {
                r8 = this;
                float[] r0 = r8.mPoints
                r1 = 0
                r3 = r0[r1]
                r1 = 1
                r4 = r0[r1]
                int r2 = r0.length
                int r2 = r2 + (-2)
                r5 = r0[r2]
                int r2 = r0.length
                int r2 = r2 - r1
                r6 = r0[r2]
                android.graphics.Paint r7 = r8.mPaintGraph
                r2 = r9
                r2.drawLine(r3, r4, r5, r6, r7)
                return
        }

        private void drawPathRelativeTicks(android.graphics.Canvas r13, float r14, float r15) {
                r12 = this;
                float[] r0 = r12.mPoints
                r1 = 0
                r1 = r0[r1]
                r2 = 1
                r3 = r0[r2]
                int r4 = r0.length
                int r4 = r4 + (-2)
                r4 = r0[r4]
                int r5 = r0.length
                int r5 = r5 - r2
                r0 = r0[r5]
                float r2 = r1 - r4
                double r5 = (double) r2
                float r2 = r3 - r0
                double r7 = (double) r2
                double r5 = java.lang.Math.hypot(r5, r7)
                float r2 = (float) r5
                float r5 = r14 - r1
                float r4 = r4 - r1
                float r5 = r5 * r4
                float r6 = r15 - r3
                float r0 = r0 - r3
                float r6 = r6 * r0
                float r5 = r5 + r6
                float r6 = r2 * r2
                float r5 = r5 / r6
                float r4 = r4 * r5
                float r9 = r1 + r4
                float r5 = r5 * r0
                float r10 = r3 + r5
                android.graphics.Path r5 = new android.graphics.Path
                r5.<init>()
                r5.moveTo(r14, r15)
                r5.lineTo(r9, r10)
                float r0 = r9 - r14
                double r0 = (double) r0
                float r3 = r10 - r15
                double r3 = (double) r3
                double r0 = java.lang.Math.hypot(r0, r3)
                float r0 = (float) r0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = ""
                r1.append(r3)
                r3 = 1120403456(0x42c80000, float:100.0)
                float r4 = r0 * r3
                float r4 = r4 / r2
                int r2 = (int) r4
                float r2 = (float) r2
                float r2 = r2 / r3
                r1.append(r2)
                java.lang.String r4 = r1.toString()
                android.graphics.Paint r1 = r12.mTextPaint
                r12.getTextBounds(r4, r1)
                r1 = 1073741824(0x40000000, float:2.0)
                float r0 = r0 / r1
                android.graphics.Rect r1 = r12.mBounds
                int r1 = r1.width()
                int r1 = r1 / 2
                float r1 = (float) r1
                float r6 = r0 - r1
                r7 = -1046478848(0xffffffffc1a00000, float:-20.0)
                android.graphics.Paint r8 = r12.mTextPaint
                r3 = r13
                r3.drawTextOnPath(r4, r5, r6, r7, r8)
                android.graphics.Paint r11 = r12.mPaintGraph
                r7 = r14
                r8 = r15
                r6 = r3
                r6.drawLine(r7, r8, r9, r10, r11)
                return
        }

        private void drawPathScreenTicks(android.graphics.Canvas r14, float r15, float r16, int r17, int r18) {
                r13 = this;
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r6 = ""
                r1.append(r6)
                int r2 = r17 / 2
                float r2 = (float) r2
                float r2 = r15 - r2
                r7 = 1120403456(0x42c80000, float:100.0)
                float r2 = r2 * r7
                androidx.constraintlayout.motion.widget.MotionLayout r3 = r13.this$0
                int r3 = r3.getWidth()
                int r3 = r3 - r17
                float r3 = (float) r3
                float r2 = r2 / r3
                double r2 = (double) r2
                r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                double r2 = r2 + r8
                int r2 = (int) r2
                float r2 = (float) r2
                float r2 = r2 / r7
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.graphics.Paint r2 = r13.mTextPaint
                r13.getTextBounds(r1, r2)
                r10 = 1073741824(0x40000000, float:2.0)
                float r2 = r15 / r10
                android.graphics.Rect r3 = r13.mBounds
                int r3 = r3.width()
                int r3 = r3 / 2
                float r3 = (float) r3
                float r2 = r2 - r3
                r11 = 0
                float r2 = r2 + r11
                r3 = 1101004800(0x41a00000, float:20.0)
                float r3 = r16 - r3
                android.graphics.Paint r4 = r13.mTextPaint
                r14.drawText(r1, r2, r3, r4)
                r12 = 1065353216(0x3f800000, float:1.0)
                float r3 = java.lang.Math.min(r11, r12)
                android.graphics.Paint r5 = r13.mPaintGraph
                r4 = r16
                r0 = r14
                r1 = r15
                r2 = r16
                r0.drawLine(r1, r2, r3, r4, r5)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                int r2 = r18 / 2
                float r2 = (float) r2
                float r2 = r16 - r2
                float r2 = r2 * r7
                androidx.constraintlayout.motion.widget.MotionLayout r3 = r13.this$0
                int r3 = r3.getHeight()
                int r3 = r3 - r18
                float r3 = (float) r3
                float r2 = r2 / r3
                double r2 = (double) r2
                double r2 = r2 + r8
                int r2 = (int) r2
                float r2 = (float) r2
                float r2 = r2 / r7
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.graphics.Paint r2 = r13.mTextPaint
                r13.getTextBounds(r1, r2)
                float r2 = r16 / r10
                android.graphics.Rect r3 = r13.mBounds
                int r3 = r3.height()
                int r3 = r3 / 2
                float r3 = (float) r3
                float r2 = r2 - r3
                r3 = 1084227584(0x40a00000, float:5.0)
                float r3 = r3 + r15
                float r2 = r11 - r2
                android.graphics.Paint r4 = r13.mTextPaint
                r14.drawText(r1, r3, r2, r4)
                float r4 = java.lang.Math.max(r11, r12)
                android.graphics.Paint r5 = r13.mPaintGraph
                r3 = r15
                r1 = r15
                r2 = r16
                r0.drawLine(r1, r2, r3, r4, r5)
                return
        }

        private void drawRectangle(android.graphics.Canvas r7, androidx.constraintlayout.motion.widget.MotionController r8) {
                r6 = this;
                android.graphics.Path r0 = r6.mPath
                r0.reset()
                r0 = 0
                r1 = 0
            L7:
                r2 = 50
                if (r1 > r2) goto L4e
                float r3 = (float) r1
                float r2 = (float) r2
                float r3 = r3 / r2
                float[] r2 = r6.mRectangle
                r8.buildRect(r3, r2, r0)
                android.graphics.Path r2 = r6.mPath
                float[] r3 = r6.mRectangle
                r4 = r3[r0]
                r5 = 1
                r3 = r3[r5]
                r2.moveTo(r4, r3)
                android.graphics.Path r2 = r6.mPath
                float[] r3 = r6.mRectangle
                r4 = 2
                r4 = r3[r4]
                r5 = 3
                r3 = r3[r5]
                r2.lineTo(r4, r3)
                android.graphics.Path r2 = r6.mPath
                float[] r3 = r6.mRectangle
                r4 = 4
                r4 = r3[r4]
                r5 = 5
                r3 = r3[r5]
                r2.lineTo(r4, r3)
                android.graphics.Path r2 = r6.mPath
                float[] r3 = r6.mRectangle
                r4 = 6
                r4 = r3[r4]
                r5 = 7
                r3 = r3[r5]
                r2.lineTo(r4, r3)
                android.graphics.Path r2 = r6.mPath
                r2.close()
                int r1 = r1 + 1
                goto L7
            L4e:
                android.graphics.Paint r8 = r6.mPaint
                r0 = 1140850688(0x44000000, float:512.0)
                r8.setColor(r0)
                r8 = 1073741824(0x40000000, float:2.0)
                r7.translate(r8, r8)
                android.graphics.Path r8 = r6.mPath
                android.graphics.Paint r0 = r6.mPaint
                r7.drawPath(r8, r0)
                r8 = -1073741824(0xffffffffc0000000, float:-2.0)
                r7.translate(r8, r8)
                android.graphics.Paint r8 = r6.mPaint
                r0 = -65536(0xffffffffffff0000, float:NaN)
                r8.setColor(r0)
                android.graphics.Path r8 = r6.mPath
                android.graphics.Paint r0 = r6.mPaint
                r7.drawPath(r8, r0)
                return
        }

        private void drawTicks(android.graphics.Canvas r17, int r18, int r19, androidx.constraintlayout.motion.widget.MotionController r20) {
                r16 = this;
                r0 = r16
                r1 = r17
                r6 = r18
                r7 = r20
                android.view.View r2 = r7.mView
                r8 = 0
                if (r2 == 0) goto L1a
                int r2 = r2.getWidth()
                android.view.View r3 = r7.mView
                int r3 = r3.getHeight()
                r4 = r2
                r5 = r3
                goto L1c
            L1a:
                r4 = 0
                r5 = 0
            L1c:
                r9 = 1
                r10 = 1
            L1e:
                int r2 = r19 + (-1)
                r11 = 2
                if (r10 >= r2) goto Lb9
                r2 = 4
                if (r6 != r2) goto L30
                int[] r3 = r0.mPathMode
                int r12 = r10 + (-1)
                r3 = r3[r12]
                if (r3 != 0) goto L30
                goto Lb5
            L30:
                float[] r3 = r0.mKeyFramePoints
                int r12 = r10 * 2
                r13 = r3[r12]
                int r12 = r12 + r9
                r12 = r3[r12]
                android.graphics.Path r3 = r0.mPath
                r3.reset()
                android.graphics.Path r3 = r0.mPath
                r14 = 1092616192(0x41200000, float:10.0)
                float r15 = r12 + r14
                r3.moveTo(r13, r15)
                android.graphics.Path r3 = r0.mPath
                float r15 = r13 + r14
                r3.lineTo(r15, r12)
                android.graphics.Path r3 = r0.mPath
                float r15 = r12 - r14
                r3.lineTo(r13, r15)
                android.graphics.Path r3 = r0.mPath
                float r14 = r13 - r14
                r3.lineTo(r14, r12)
                android.graphics.Path r3 = r0.mPath
                r3.close()
                int r3 = r10 + (-1)
                r7.getKeyFrame(r3)
                r14 = 3
                r15 = 0
                if (r6 != r2) goto L92
                int[] r2 = r0.mPathMode
                r2 = r2[r3]
                if (r2 != r9) goto L78
                float r2 = r13 - r15
                float r3 = r12 - r15
                r0.drawPathRelativeTicks(r1, r2, r3)
                goto L8b
            L78:
                if (r2 != r11) goto L82
                float r2 = r13 - r15
                float r3 = r12 - r15
                r0.drawPathCartesianTicks(r1, r2, r3)
                goto L8b
            L82:
                if (r2 != r14) goto L8b
                float r2 = r13 - r15
                float r3 = r12 - r15
                r0.drawPathScreenTicks(r1, r2, r3, r4, r5)
            L8b:
                android.graphics.Path r2 = r0.mPath
                android.graphics.Paint r3 = r0.mFillPaint
                r1.drawPath(r2, r3)
            L92:
                if (r6 != r11) goto L9b
                float r2 = r13 - r15
                float r3 = r12 - r15
                r0.drawPathRelativeTicks(r1, r2, r3)
            L9b:
                if (r6 != r14) goto La4
                float r2 = r13 - r15
                float r3 = r12 - r15
                r0.drawPathCartesianTicks(r1, r2, r3)
            La4:
                r2 = 6
                if (r6 != r2) goto Lae
                float r2 = r13 - r15
                float r3 = r12 - r15
                r0.drawPathScreenTicks(r1, r2, r3, r4, r5)
            Lae:
                android.graphics.Path r2 = r0.mPath
                android.graphics.Paint r3 = r0.mFillPaint
                r1.drawPath(r2, r3)
            Lb5:
                int r10 = r10 + 1
                goto L1e
            Lb9:
                float[] r2 = r0.mPoints
                int r3 = r2.length
                if (r3 <= r9) goto Ld8
                r3 = r2[r8]
                r2 = r2[r9]
                android.graphics.Paint r4 = r0.mPaintKeyframes
                r5 = 1090519040(0x41000000, float:8.0)
                r1.drawCircle(r3, r2, r5, r4)
                float[] r2 = r0.mPoints
                int r3 = r2.length
                int r3 = r3 - r11
                r3 = r2[r3]
                int r4 = r2.length
                int r4 = r4 - r9
                r2 = r2[r4]
                android.graphics.Paint r4 = r0.mPaintKeyframes
                r1.drawCircle(r3, r2, r5, r4)
            Ld8:
                return
        }

        private void drawTranslation(android.graphics.Canvas r13, float r14, float r15, float r16, float r17) {
                r12 = this;
                android.graphics.Paint r5 = r12.mPaintGraph
                r0 = r13
                r1 = r14
                r2 = r15
                r3 = r16
                r4 = r17
                r0.drawRect(r1, r2, r3, r4, r5)
                android.graphics.Paint r11 = r12.mPaintGraph
                r6 = r13
                r7 = r14
                r8 = r15
                r9 = r16
                r10 = r17
                r6.drawLine(r7, r8, r9, r10, r11)
                return
        }

        public void draw(android.graphics.Canvas r6, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r7, int r8, int r9) {
                r5 = this;
                if (r7 == 0) goto L109
                int r0 = r7.size()
                if (r0 != 0) goto La
                goto L109
            La:
                r6.save()
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r5.this$0
                boolean r0 = r0.isInEditMode()
                if (r0 != 0) goto L68
                r0 = r9 & 1
                r1 = 2
                if (r0 != r1) goto L68
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r5.this$0
                android.content.Context r1 = r1.getContext()
                android.content.res.Resources r1 = r1.getResources()
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r5.this$0
                int r2 = androidx.constraintlayout.motion.widget.MotionLayout.access$000(r2)
                java.lang.String r1 = r1.getResourceName(r2)
                r0.append(r1)
                java.lang.String r1 = ":"
                r0.append(r1)
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r5.this$0
                float r1 = r1.getProgress()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r5.this$0
                int r1 = r1.getHeight()
                int r1 = r1 + (-30)
                float r1 = (float) r1
                android.graphics.Paint r2 = r5.mTextPaint
                r3 = 1092616192(0x41200000, float:10.0)
                r6.drawText(r0, r3, r1, r2)
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r5.this$0
                int r1 = r1.getHeight()
                int r1 = r1 + (-29)
                float r1 = (float) r1
                android.graphics.Paint r2 = r5.mPaint
                r3 = 1093664768(0x41300000, float:11.0)
                r6.drawText(r0, r3, r1, r2)
            L68:
                java.util.Collection r7 = r7.values()
                java.util.Iterator r7 = r7.iterator()
            L70:
                boolean r0 = r7.hasNext()
                if (r0 == 0) goto L106
                java.lang.Object r0 = r7.next()
                androidx.constraintlayout.motion.widget.MotionController r0 = (androidx.constraintlayout.motion.widget.MotionController) r0
                int r1 = r0.getDrawPath()
                r2 = 1
                if (r9 <= 0) goto L86
                if (r1 != 0) goto L86
                r1 = 1
            L86:
                if (r1 != 0) goto L89
                goto L70
            L89:
                float[] r3 = r5.mKeyFramePoints
                int[] r4 = r5.mPathMode
                int r3 = r0.buildKeyFrames(r3, r4)
                r5.mKeyFrameCount = r3
                if (r1 < r2) goto L70
                int r2 = r8 / 16
                float[] r3 = r5.mPoints
                if (r3 == 0) goto La0
                int r3 = r3.length
                int r4 = r2 * 2
                if (r3 == r4) goto Lad
            La0:
                int r3 = r2 * 2
                float[] r3 = new float[r3]
                r5.mPoints = r3
                android.graphics.Path r3 = new android.graphics.Path
                r3.<init>()
                r5.mPath = r3
            Lad:
                int r3 = r5.mShadowTranslate
                float r4 = (float) r3
                float r3 = (float) r3
                r6.translate(r4, r3)
                android.graphics.Paint r3 = r5.mPaint
                r4 = 1996488704(0x77000000, float:2.5961484E33)
                r3.setColor(r4)
                android.graphics.Paint r3 = r5.mFillPaint
                r3.setColor(r4)
                android.graphics.Paint r3 = r5.mPaintKeyframes
                r3.setColor(r4)
                android.graphics.Paint r3 = r5.mPaintGraph
                r3.setColor(r4)
                float[] r3 = r5.mPoints
                r0.buildPath(r3, r2)
                int r2 = r5.mKeyFrameCount
                r5.drawAll(r6, r1, r2, r0)
                android.graphics.Paint r2 = r5.mPaint
                r3 = -21965(0xffffffffffffaa33, float:NaN)
                r2.setColor(r3)
                android.graphics.Paint r2 = r5.mPaintKeyframes
                r3 = -2067046(0xffffffffffe0759a, float:NaN)
                r2.setColor(r3)
                android.graphics.Paint r2 = r5.mFillPaint
                r2.setColor(r3)
                android.graphics.Paint r2 = r5.mPaintGraph
                r3 = -13391360(0xffffffffff33aa00, float:-2.388145E38)
                r2.setColor(r3)
                int r2 = r5.mShadowTranslate
                int r3 = -r2
                float r3 = (float) r3
                int r2 = -r2
                float r2 = (float) r2
                r6.translate(r3, r2)
                int r2 = r5.mKeyFrameCount
                r5.drawAll(r6, r1, r2, r0)
                r2 = 5
                if (r1 != r2) goto L70
                r5.drawRectangle(r6, r0)
                goto L70
            L106:
                r6.restore()
            L109:
                return
        }

        public void drawAll(android.graphics.Canvas r2, int r3, int r4, androidx.constraintlayout.motion.widget.MotionController r5) {
                r1 = this;
                r0 = 4
                if (r3 != r0) goto L6
                r1.drawPathAsConfigured(r2)
            L6:
                r0 = 2
                if (r3 != r0) goto Lc
                r1.drawPathRelative(r2)
            Lc:
                r0 = 3
                if (r3 != r0) goto L12
                r1.drawPathCartesian(r2)
            L12:
                r1.drawBasicPath(r2)
                r1.drawTicks(r2, r3, r4, r5)
                return
        }

        void getTextBounds(java.lang.String r4, android.graphics.Paint r5) {
                r3 = this;
                int r0 = r4.length()
                android.graphics.Rect r1 = r3.mBounds
                r2 = 0
                r5.getTextBounds(r4, r2, r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class Model {
        androidx.constraintlayout.widget.ConstraintSet mEnd;
        int mEndId;
        androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer mLayoutEnd;
        androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer mLayoutStart;
        androidx.constraintlayout.widget.ConstraintSet mStart;
        int mStartId;
        final /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout this$0;

        Model(androidx.constraintlayout.motion.widget.MotionLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = new androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
                r1.<init>()
                r0.mLayoutStart = r1
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = new androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
                r1.<init>()
                r0.mLayoutEnd = r1
                r1 = 0
                r0.mStart = r1
                r0.mEnd = r1
                return
        }

        private void debugLayout(java.lang.String r7, androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r8) {
                r6 = this;
                java.lang.Object r0 = r8.getCompanionWidget()
                android.view.View r0 = (android.view.View) r0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r7)
                java.lang.String r7 = " "
                r1.append(r7)
                java.lang.String r7 = androidx.constraintlayout.motion.widget.Debug.getName(r0)
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r8.toString()
                java.util.ArrayList r0 = r8.getChildren()
                int r0 = r0.size()
                r1 = 0
            L2a:
                if (r1 >= r0) goto Ldd
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r7)
                java.lang.String r3 = "["
                r2.append(r3)
                r2.append(r1)
                java.lang.String r3 = "] "
                r2.append(r3)
                java.util.ArrayList r2 = r8.getChildren()
                java.lang.Object r2 = r2.get(r1)
                androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r2
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = ""
                r3.append(r4)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r2.mTop
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.mTarget
                java.lang.String r5 = "_"
                if (r4 == 0) goto L60
                java.lang.String r4 = "T"
                goto L61
            L60:
                r4 = r5
            L61:
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r3)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mBottom
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
                if (r3 == 0) goto L79
                java.lang.String r3 = "B"
                goto L7a
            L79:
                r3 = r5
            L7a:
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r3)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
                if (r3 == 0) goto L92
                java.lang.String r3 = "L"
                goto L93
            L92:
                r3 = r5
            L93:
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r3)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
                if (r3 == 0) goto Laa
                java.lang.String r5 = "R"
            Laa:
                r4.append(r5)
                java.lang.Object r3 = r2.getCompanionWidget()
                android.view.View r3 = (android.view.View) r3
                java.lang.String r4 = androidx.constraintlayout.motion.widget.Debug.getName(r3)
                boolean r5 = r3 instanceof android.widget.TextView
                if (r5 == 0) goto Ld6
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r4)
                java.lang.String r4 = "("
                r5.append(r4)
                android.widget.TextView r3 = (android.widget.TextView) r3
                java.lang.CharSequence r3 = r3.getText()
                r5.append(r3)
                java.lang.String r3 = ")"
                r5.append(r3)
            Ld6:
                r2.toString()
                int r1 = r1 + 1
                goto L2a
            Ldd:
                return
        }

        private void debugLayoutParam(java.lang.String r4, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r5) {
                r3 = this;
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = " "
                r4.append(r0)
                int r0 = r5.startToStart
                r1 = -1
                if (r0 == r1) goto L12
                java.lang.String r0 = "SS"
                goto L14
            L12:
                java.lang.String r0 = "__"
            L14:
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                int r4 = r5.startToEnd
                java.lang.String r2 = "|__"
                if (r4 == r1) goto L2e
                java.lang.String r4 = "|SE"
                goto L2f
            L2e:
                r4 = r2
            L2f:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                int r4 = r5.endToStart
                if (r4 == r1) goto L46
                java.lang.String r4 = "|ES"
                goto L47
            L46:
                r4 = r2
            L47:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                int r4 = r5.endToEnd
                if (r4 == r1) goto L5e
                java.lang.String r4 = "|EE"
                goto L5f
            L5e:
                r4 = r2
            L5f:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                int r4 = r5.leftToLeft
                if (r4 == r1) goto L76
                java.lang.String r4 = "|LL"
                goto L77
            L76:
                r4 = r2
            L77:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                int r4 = r5.leftToRight
                if (r4 == r1) goto L8e
                java.lang.String r4 = "|LR"
                goto L8f
            L8e:
                r4 = r2
            L8f:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                int r4 = r5.rightToLeft
                if (r4 == r1) goto La6
                java.lang.String r4 = "|RL"
                goto La7
            La6:
                r4 = r2
            La7:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                int r4 = r5.rightToRight
                if (r4 == r1) goto Lbe
                java.lang.String r4 = "|RR"
                goto Lbf
            Lbe:
                r4 = r2
            Lbf:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                int r4 = r5.topToTop
                if (r4 == r1) goto Ld6
                java.lang.String r4 = "|TT"
                goto Ld7
            Ld6:
                r4 = r2
            Ld7:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                int r4 = r5.topToBottom
                if (r4 == r1) goto Lee
                java.lang.String r4 = "|TB"
                goto Lef
            Lee:
                r4 = r2
            Lef:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                int r4 = r5.bottomToTop
                if (r4 == r1) goto L106
                java.lang.String r4 = "|BT"
                goto L107
            L106:
                r4 = r2
            L107:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                int r4 = r5.bottomToBottom
                if (r4 == r1) goto L11d
                java.lang.String r2 = "|BB"
            L11d:
                r0.append(r2)
                return
        }

        private void debugWidget(java.lang.String r7, androidx.constraintlayout.solver.widgets.ConstraintWidget r8) {
                r6 = this;
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = " "
                r7.append(r0)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r8.mTop
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTarget
                java.lang.String r1 = "B"
                java.lang.String r2 = "T"
                java.lang.String r3 = "__"
                if (r0 == 0) goto L33
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r8.mTop
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.mTarget
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = r4.mType
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
                if (r4 != r5) goto L2a
                r4 = r2
                goto L2b
            L2a:
                r4 = r1
            L2b:
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                goto L34
            L33:
                r0 = r3
            L34:
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r8.mBottom
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.mTarget
                if (r7 == 0) goto L64
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r1)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r8.mBottom
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.mTarget
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = r4.mType
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
                if (r4 != r5) goto L5c
                r1 = r2
            L5c:
                r7.append(r1)
                java.lang.String r7 = r7.toString()
                goto L65
            L64:
                r7 = r3
            L65:
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r8.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.mTarget
                java.lang.String r1 = "R"
                java.lang.String r2 = "L"
                if (r7 == 0) goto L9b
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r8.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.mTarget
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = r4.mType
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
                if (r4 != r5) goto L92
                r4 = r2
                goto L93
            L92:
                r4 = r1
            L93:
                r7.append(r4)
                java.lang.String r7 = r7.toString()
                goto L9c
            L9b:
                r7 = r3
            L9c:
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r8.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.mTarget
                if (r7 == 0) goto Lcb
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r1)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r8.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = r3.mType
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
                if (r3 != r4) goto Lc4
                r1 = r2
            Lc4:
                r7.append(r1)
                java.lang.String r3 = r7.toString()
            Lcb:
                r0.append(r3)
                r8.toString()
                return
        }

        private void setupConstraintWidget(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r8, androidx.constraintlayout.widget.ConstraintSet r9) {
                r7 = this;
                android.util.SparseArray r5 = new android.util.SparseArray
                r5.<init>()
                androidx.constraintlayout.widget.Constraints$LayoutParams r4 = new androidx.constraintlayout.widget.Constraints$LayoutParams
                r0 = -2
                r4.<init>(r0, r0)
                r5.clear()
                r0 = 0
                r5.put(r0, r8)
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r7.this$0
                int r0 = r0.getId()
                r5.put(r0, r8)
                java.util.ArrayList r0 = r8.getChildren()
                java.util.Iterator r0 = r0.iterator()
            L23:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L3d
                java.lang.Object r1 = r0.next()
                androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r1
                java.lang.Object r2 = r1.getCompanionWidget()
                android.view.View r2 = (android.view.View) r2
                int r2 = r2.getId()
                r5.put(r2, r1)
                goto L23
            L3d:
                java.util.ArrayList r0 = r8.getChildren()
                java.util.Iterator r6 = r0.iterator()
            L45:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto Lb8
                java.lang.Object r0 = r6.next()
                r3 = r0
                androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
                java.lang.Object r0 = r3.getCompanionWidget()
                r2 = r0
                android.view.View r2 = (android.view.View) r2
                int r0 = r2.getId()
                r9.applyToLayoutParams(r0, r4)
                int r0 = r2.getId()
                int r0 = r9.getWidth(r0)
                r3.setWidth(r0)
                int r0 = r2.getId()
                int r0 = r9.getHeight(r0)
                r3.setHeight(r0)
                boolean r0 = r2 instanceof androidx.constraintlayout.widget.ConstraintHelper
                if (r0 == 0) goto L8a
                r0 = r2
                androidx.constraintlayout.widget.ConstraintHelper r0 = (androidx.constraintlayout.widget.ConstraintHelper) r0
                r9.applyToHelper(r0, r3, r4, r5)
                boolean r0 = r2 instanceof androidx.constraintlayout.widget.Barrier
                if (r0 == 0) goto L8a
                r0 = r2
                androidx.constraintlayout.widget.Barrier r0 = (androidx.constraintlayout.widget.Barrier) r0
                r0.validateParams()
            L8a:
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r7.this$0
                int r0 = r0.getLayoutDirection()
                r4.resolveLayoutDirection(r0)
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r7.this$0
                r1 = 0
                androidx.constraintlayout.motion.widget.MotionLayout.access$800(r0, r1, r2, r3, r4, r5)
                int r0 = r2.getId()
                int r0 = r9.getVisibilityMode(r0)
                r1 = 1
                if (r0 != r1) goto Lac
                int r0 = r2.getVisibility()
                r3.setVisibility(r0)
                goto L45
            Lac:
                int r0 = r2.getId()
                int r0 = r9.getVisibility(r0)
                r3.setVisibility(r0)
                goto L45
            Lb8:
                java.util.ArrayList r9 = r8.getChildren()
                java.util.Iterator r9 = r9.iterator()
            Lc0:
                boolean r0 = r9.hasNext()
                if (r0 == 0) goto Le1
                java.lang.Object r0 = r9.next()
                androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r0
                boolean r1 = r0 instanceof androidx.constraintlayout.solver.widgets.VirtualLayout
                if (r1 == 0) goto Lc0
                java.lang.Object r1 = r0.getCompanionWidget()
                androidx.constraintlayout.widget.ConstraintHelper r1 = (androidx.constraintlayout.widget.ConstraintHelper) r1
                androidx.constraintlayout.solver.widgets.Helper r0 = (androidx.constraintlayout.solver.widgets.Helper) r0
                r1.updatePreLayout(r8, r0, r5)
                androidx.constraintlayout.solver.widgets.VirtualLayout r0 = (androidx.constraintlayout.solver.widgets.VirtualLayout) r0
                r0.captureWidgets()
                goto Lc0
            Le1:
                return
        }

        public void build() {
                r6 = this;
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r6.this$0
                int r0 = r0.getChildCount()
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r6.this$0
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r1 = r1.mFrameArrayList
                r1.clear()
                r1 = 0
                r2 = 0
            Lf:
                if (r2 >= r0) goto L26
                androidx.constraintlayout.motion.widget.MotionLayout r3 = r6.this$0
                android.view.View r3 = r3.getChildAt(r2)
                androidx.constraintlayout.motion.widget.MotionController r4 = new androidx.constraintlayout.motion.widget.MotionController
                r4.<init>(r3)
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r6.this$0
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r5 = r5.mFrameArrayList
                r5.put(r3, r4)
                int r2 = r2 + 1
                goto Lf
            L26:
                if (r1 >= r0) goto L80
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r6.this$0
                android.view.View r2 = r2.getChildAt(r1)
                androidx.constraintlayout.motion.widget.MotionLayout r3 = r6.this$0
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r3 = r3.mFrameArrayList
                java.lang.Object r3 = r3.get(r2)
                androidx.constraintlayout.motion.widget.MotionController r3 = (androidx.constraintlayout.motion.widget.MotionController) r3
                if (r3 != 0) goto L3b
                goto L7d
            L3b:
                androidx.constraintlayout.widget.ConstraintSet r4 = r6.mStart
                if (r4 == 0) goto L5c
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r4 = r6.mLayoutStart
                androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r6.getWidget(r4, r2)
                if (r4 == 0) goto L4d
                androidx.constraintlayout.widget.ConstraintSet r5 = r6.mStart
                r3.setStartState(r4, r5)
                goto L5c
            L4d:
                androidx.constraintlayout.motion.widget.MotionLayout r4 = r6.this$0
                int r4 = r4.mDebugPath
                if (r4 == 0) goto L5c
                androidx.constraintlayout.motion.widget.Debug.getLocation()
                androidx.constraintlayout.motion.widget.Debug.getName(r2)
                r2.getClass()
            L5c:
                androidx.constraintlayout.widget.ConstraintSet r4 = r6.mEnd
                if (r4 == 0) goto L7d
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r4 = r6.mLayoutEnd
                androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r6.getWidget(r4, r2)
                if (r4 == 0) goto L6e
                androidx.constraintlayout.widget.ConstraintSet r2 = r6.mEnd
                r3.setEndState(r4, r2)
                goto L7d
            L6e:
                androidx.constraintlayout.motion.widget.MotionLayout r3 = r6.this$0
                int r3 = r3.mDebugPath
                if (r3 == 0) goto L7d
                androidx.constraintlayout.motion.widget.Debug.getLocation()
                androidx.constraintlayout.motion.widget.Debug.getName(r2)
                r2.getClass()
            L7d:
                int r1 = r1 + 1
                goto L26
            L80:
                return
        }

        void copy(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5, androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r6) {
                r4 = this;
                java.util.ArrayList r0 = r5.getChildren()
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r1.put(r5, r6)
                java.util.ArrayList r2 = r6.getChildren()
                r2.clear()
                r6.copy(r5, r1)
                java.util.Iterator r5 = r0.iterator()
            L1a:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L5a
                java.lang.Object r2 = r5.next()
                androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r2
                boolean r3 = r2 instanceof androidx.constraintlayout.solver.widgets.Barrier
                if (r3 == 0) goto L30
                androidx.constraintlayout.solver.widgets.Barrier r3 = new androidx.constraintlayout.solver.widgets.Barrier
                r3.<init>()
                goto L53
            L30:
                boolean r3 = r2 instanceof androidx.constraintlayout.solver.widgets.Guideline
                if (r3 == 0) goto L3a
                androidx.constraintlayout.solver.widgets.Guideline r3 = new androidx.constraintlayout.solver.widgets.Guideline
                r3.<init>()
                goto L53
            L3a:
                boolean r3 = r2 instanceof androidx.constraintlayout.solver.widgets.Flow
                if (r3 == 0) goto L44
                androidx.constraintlayout.solver.widgets.Flow r3 = new androidx.constraintlayout.solver.widgets.Flow
                r3.<init>()
                goto L53
            L44:
                boolean r3 = r2 instanceof androidx.constraintlayout.solver.widgets.Helper
                if (r3 == 0) goto L4e
                androidx.constraintlayout.solver.widgets.HelperWidget r3 = new androidx.constraintlayout.solver.widgets.HelperWidget
                r3.<init>()
                goto L53
            L4e:
                androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = new androidx.constraintlayout.solver.widgets.ConstraintWidget
                r3.<init>()
            L53:
                r6.add(r3)
                r1.put(r2, r3)
                goto L1a
            L5a:
                java.util.Iterator r5 = r0.iterator()
            L5e:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L74
                java.lang.Object r6 = r5.next()
                androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r6
                java.lang.Object r0 = r1.get(r6)
                androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r0
                r0.copy(r6, r1)
                goto L5e
            L74:
                return
        }

        androidx.constraintlayout.solver.widgets.ConstraintWidget getWidget(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5, android.view.View r6) {
                r4 = this;
                java.lang.Object r0 = r5.getCompanionWidget()
                if (r0 != r6) goto L7
                return r5
            L7:
                java.util.ArrayList r5 = r5.getChildren()
                int r0 = r5.size()
                r1 = 0
            L10:
                if (r1 >= r0) goto L22
                java.lang.Object r2 = r5.get(r1)
                androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r2
                java.lang.Object r3 = r2.getCompanionWidget()
                if (r3 != r6) goto L1f
                return r2
            L1f:
                int r1 = r1 + 1
                goto L10
            L22:
                r5 = 0
                return r5
        }

        void initFrom(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5, androidx.constraintlayout.widget.ConstraintSet r6, androidx.constraintlayout.widget.ConstraintSet r7) {
                r4 = this;
                r4.mStart = r6
                r4.mEnd = r7
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = new androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
                r5.<init>()
                r4.mLayoutStart = r5
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = new androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
                r5.<init>()
                r4.mLayoutEnd = r5
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.mLayoutStart
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r4.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = androidx.constraintlayout.motion.widget.MotionLayout.access$200(r0)
                androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r0 = r0.getMeasurer()
                r5.setMeasurer(r0)
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.mLayoutEnd
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r4.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = androidx.constraintlayout.motion.widget.MotionLayout.access$300(r0)
                androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r0 = r0.getMeasurer()
                r5.setMeasurer(r0)
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.mLayoutStart
                r5.removeAllChildren()
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.mLayoutEnd
                r5.removeAllChildren()
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r4.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = androidx.constraintlayout.motion.widget.MotionLayout.access$400(r5)
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r4.mLayoutStart
                r4.copy(r5, r0)
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r4.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = androidx.constraintlayout.motion.widget.MotionLayout.access$500(r5)
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r4.mLayoutEnd
                r4.copy(r5, r0)
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r4.this$0
                float r5 = r5.mTransitionLastPosition
                double r0 = (double) r5
                r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 <= 0) goto L68
                if (r6 == 0) goto L62
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.mLayoutStart
                r4.setupConstraintWidget(r5, r6)
            L62:
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.mLayoutEnd
                r4.setupConstraintWidget(r5, r7)
                goto L74
            L68:
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.mLayoutEnd
                r4.setupConstraintWidget(r5, r7)
                if (r6 == 0) goto L74
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.mLayoutStart
                r4.setupConstraintWidget(r5, r6)
            L74:
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.mLayoutStart
                androidx.constraintlayout.motion.widget.MotionLayout r6 = r4.this$0
                boolean r6 = androidx.constraintlayout.motion.widget.MotionLayout.access$600(r6)
                r5.setRtl(r6)
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.mLayoutStart
                r5.updateHierarchy()
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.mLayoutEnd
                androidx.constraintlayout.motion.widget.MotionLayout r6 = r4.this$0
                boolean r6 = androidx.constraintlayout.motion.widget.MotionLayout.access$700(r6)
                r5.setRtl(r6)
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.mLayoutEnd
                r5.updateHierarchy()
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r4.this$0
                android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
                if (r5 == 0) goto Lbd
                int r6 = r5.width
                r7 = -2
                if (r6 != r7) goto Lad
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r6 = r4.mLayoutStart
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
                r6.setHorizontalDimensionBehaviour(r0)
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r6 = r4.mLayoutEnd
                r6.setHorizontalDimensionBehaviour(r0)
            Lad:
                int r5 = r5.height
                if (r5 != r7) goto Lbd
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.mLayoutStart
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
                r5.setVerticalDimensionBehaviour(r6)
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r4.mLayoutEnd
                r5.setVerticalDimensionBehaviour(r6)
            Lbd:
                return
        }

        public boolean isNotConfiguredWith(int r2, int r3) {
                r1 = this;
                int r0 = r1.mStartId
                if (r2 != r0) goto Lb
                int r2 = r1.mEndId
                if (r3 == r2) goto L9
                goto Lb
            L9:
                r2 = 0
                return r2
            Lb:
                r2 = 1
                return r2
        }

        public void measure(int r12, int r13) {
                r11 = this;
                int r0 = android.view.View.MeasureSpec.getMode(r12)
                int r3 = android.view.View.MeasureSpec.getMode(r13)
                androidx.constraintlayout.motion.widget.MotionLayout r4 = r11.this$0
                r4.mWidthMeasureMode = r0
                r4.mHeightMeasureMode = r3
                int r4 = r4.getOptimizationLevel()
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r11.this$0
                int r6 = r5.mCurrentState
                int r5 = r5.getStartState()
                if (r6 != r5) goto L2f
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r11.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r6 = r11.mLayoutEnd
                androidx.constraintlayout.motion.widget.MotionLayout.access$1200(r5, r6, r4, r12, r13)
                androidx.constraintlayout.widget.ConstraintSet r5 = r11.mStart
                if (r5 == 0) goto L41
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r11.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r6 = r11.mLayoutStart
                androidx.constraintlayout.motion.widget.MotionLayout.access$1300(r5, r6, r4, r12, r13)
                goto L41
            L2f:
                androidx.constraintlayout.widget.ConstraintSet r5 = r11.mStart
                if (r5 == 0) goto L3a
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r11.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r6 = r11.mLayoutStart
                androidx.constraintlayout.motion.widget.MotionLayout.access$1400(r5, r6, r4, r12, r13)
            L3a:
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r11.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r6 = r11.mLayoutEnd
                androidx.constraintlayout.motion.widget.MotionLayout.access$1500(r5, r6, r4, r12, r13)
            L41:
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r11.this$0
                android.view.ViewParent r5 = r5.getParent()
                boolean r5 = r5 instanceof androidx.constraintlayout.motion.widget.MotionLayout
                r6 = 1
                r7 = 0
                if (r5 == 0) goto L54
                r5 = 1073741824(0x40000000, float:2.0)
                if (r0 != r5) goto L54
                if (r3 != r5) goto L54
                goto Lc3
            L54:
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r11.this$0
                r5.mWidthMeasureMode = r0
                r5.mHeightMeasureMode = r3
                int r0 = r5.mCurrentState
                int r3 = r5.getStartState()
                if (r0 != r3) goto L75
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r11.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = r11.mLayoutEnd
                androidx.constraintlayout.motion.widget.MotionLayout.access$1600(r0, r3, r4, r12, r13)
                androidx.constraintlayout.widget.ConstraintSet r0 = r11.mStart
                if (r0 == 0) goto L87
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r11.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = r11.mLayoutStart
                androidx.constraintlayout.motion.widget.MotionLayout.access$1700(r0, r3, r4, r12, r13)
                goto L87
            L75:
                androidx.constraintlayout.widget.ConstraintSet r0 = r11.mStart
                if (r0 == 0) goto L80
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r11.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = r11.mLayoutStart
                androidx.constraintlayout.motion.widget.MotionLayout.access$1800(r0, r3, r4, r12, r13)
            L80:
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r11.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = r11.mLayoutEnd
                androidx.constraintlayout.motion.widget.MotionLayout.access$1900(r0, r3, r4, r12, r13)
            L87:
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r11.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = r11.mLayoutStart
                int r3 = r3.getWidth()
                r0.mStartWrapWidth = r3
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r11.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = r11.mLayoutStart
                int r3 = r3.getHeight()
                r0.mStartWrapHeight = r3
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r11.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = r11.mLayoutEnd
                int r3 = r3.getWidth()
                r0.mEndWrapWidth = r3
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r11.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = r11.mLayoutEnd
                int r3 = r3.getHeight()
                r0.mEndWrapHeight = r3
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r11.this$0
                int r3 = r0.mStartWrapWidth
                int r4 = r0.mEndWrapWidth
                if (r3 != r4) goto Lc0
                int r3 = r0.mStartWrapHeight
                int r4 = r0.mEndWrapHeight
                if (r3 == r4) goto Lbe
                goto Lc0
            Lbe:
                r3 = 0
                goto Lc1
            Lc0:
                r3 = 1
            Lc1:
                r0.mMeasureDuringTransition = r3
            Lc3:
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r11.this$0
                int r3 = r0.mStartWrapWidth
                int r4 = r0.mStartWrapHeight
                int r5 = r0.mWidthMeasureMode
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r5 == r8) goto Ld1
                if (r5 != 0) goto Ldc
            Ld1:
                float r5 = (float) r3
                float r9 = r0.mPostInterpolationPosition
                int r10 = r0.mEndWrapWidth
                int r10 = r10 - r3
                float r3 = (float) r10
                float r9 = r9 * r3
                float r5 = r5 + r9
                int r3 = (int) r5
            Ldc:
                int r5 = r0.mHeightMeasureMode
                if (r5 == r8) goto Le2
                if (r5 != 0) goto Led
            Le2:
                float r5 = (float) r4
                float r8 = r0.mPostInterpolationPosition
                int r0 = r0.mEndWrapHeight
                int r0 = r0 - r4
                float r0 = (float) r0
                float r8 = r8 * r0
                float r5 = r5 + r8
                int r4 = (int) r5
            Led:
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r11.mLayoutStart
                boolean r0 = r0.isWidthMeasuredTooSmall()
                if (r0 != 0) goto L100
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r11.mLayoutEnd
                boolean r0 = r0.isWidthMeasuredTooSmall()
                if (r0 == 0) goto Lfe
                goto L100
            Lfe:
                r5 = 0
                goto L101
            L100:
                r5 = 1
            L101:
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r11.mLayoutStart
                boolean r0 = r0.isHeightMeasuredTooSmall()
                if (r0 != 0) goto L113
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r11.mLayoutEnd
                boolean r0 = r0.isHeightMeasuredTooSmall()
                if (r0 == 0) goto L112
                goto L113
            L112:
                r6 = 0
            L113:
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r11.this$0
                r1 = r12
                r2 = r13
                androidx.constraintlayout.motion.widget.MotionLayout.access$2000(r0, r1, r2, r3, r4, r5, r6)
                return
        }

        public void reEvaluateState() {
                r2 = this;
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.this$0
                int r0 = androidx.constraintlayout.motion.widget.MotionLayout.access$900(r0)
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r2.this$0
                int r1 = androidx.constraintlayout.motion.widget.MotionLayout.access$1000(r1)
                r2.measure(r0, r1)
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.this$0
                androidx.constraintlayout.motion.widget.MotionLayout.access$1100(r0)
                return
        }

        public void setMeasuredId(int r1, int r2) {
                r0 = this;
                r0.mStartId = r1
                r0.mEndId = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected interface MotionTracker {
        void addMovement(android.view.MotionEvent r1);

        void clear();

        void computeCurrentVelocity(int r1);

        void computeCurrentVelocity(int r1, float r2);

        float getXVelocity();

        float getXVelocity(int r1);

        float getYVelocity();

        float getYVelocity(int r1);

        void recycle();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class MyTracker implements androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker {
        private static androidx.constraintlayout.motion.widget.MotionLayout.MyTracker me;
        android.view.VelocityTracker tracker;

        static {
                androidx.constraintlayout.motion.widget.MotionLayout$MyTracker r0 = new androidx.constraintlayout.motion.widget.MotionLayout$MyTracker
                r0.<init>()
                androidx.constraintlayout.motion.widget.MotionLayout.MyTracker.me = r0
                return
        }

        private MyTracker() {
                r0 = this;
                r0.<init>()
                return
        }

        public static androidx.constraintlayout.motion.widget.MotionLayout.MyTracker obtain() {
                androidx.constraintlayout.motion.widget.MotionLayout$MyTracker r0 = androidx.constraintlayout.motion.widget.MotionLayout.MyTracker.me
                android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
                r0.tracker = r1
                androidx.constraintlayout.motion.widget.MotionLayout$MyTracker r0 = androidx.constraintlayout.motion.widget.MotionLayout.MyTracker.me
                return r0
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void addMovement(android.view.MotionEvent r2) {
                r1 = this;
                android.view.VelocityTracker r0 = r1.tracker
                if (r0 == 0) goto L7
                r0.addMovement(r2)
            L7:
                return
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void clear() {
                r1 = this;
                android.view.VelocityTracker r0 = r1.tracker
                r0.clear()
                return
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void computeCurrentVelocity(int r2) {
                r1 = this;
                android.view.VelocityTracker r0 = r1.tracker
                r0.computeCurrentVelocity(r2)
                return
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void computeCurrentVelocity(int r2, float r3) {
                r1 = this;
                android.view.VelocityTracker r0 = r1.tracker
                r0.computeCurrentVelocity(r2, r3)
                return
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getXVelocity() {
                r1 = this;
                android.view.VelocityTracker r0 = r1.tracker
                float r0 = r0.getXVelocity()
                return r0
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getXVelocity(int r2) {
                r1 = this;
                android.view.VelocityTracker r0 = r1.tracker
                float r2 = r0.getXVelocity(r2)
                return r2
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getYVelocity() {
                r1 = this;
                android.view.VelocityTracker r0 = r1.tracker
                float r0 = r0.getYVelocity()
                return r0
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getYVelocity(int r1) {
                r0 = this;
                float r1 = r0.getYVelocity(r1)
                return r1
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void recycle() {
                r1 = this;
                android.view.VelocityTracker r0 = r1.tracker
                r0.recycle()
                r0 = 0
                r1.tracker = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class StateCache {
        final java.lang.String KeyEndState;
        final java.lang.String KeyProgress;
        final java.lang.String KeyStartState;
        final java.lang.String KeyVelocity;
        int endState;
        float mProgress;
        float mVelocity;
        int startState;
        final /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout this$0;

        StateCache(androidx.constraintlayout.motion.widget.MotionLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 2143289344(0x7fc00000, float:NaN)
                r0.mProgress = r1
                r0.mVelocity = r1
                r1 = -1
                r0.startState = r1
                r0.endState = r1
                java.lang.String r1 = "motion.progress"
                r0.KeyProgress = r1
                java.lang.String r1 = "motion.velocity"
                r0.KeyVelocity = r1
                java.lang.String r1 = "motion.StartState"
                r0.KeyStartState = r1
                java.lang.String r1 = "motion.EndState"
                r0.KeyEndState = r1
                return
        }

        void apply() {
                r4 = this;
                int r0 = r4.startState
                r1 = -1
                if (r0 != r1) goto L9
                int r2 = r4.endState
                if (r2 == r1) goto L29
            L9:
                if (r0 != r1) goto L13
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r4.this$0
                int r2 = r4.endState
                r0.transitionToState(r2)
                goto L22
            L13:
                int r2 = r4.endState
                if (r2 != r1) goto L1d
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r4.this$0
                r2.setState(r0, r1, r1)
                goto L22
            L1d:
                androidx.constraintlayout.motion.widget.MotionLayout r3 = r4.this$0
                r3.setTransition(r0, r2)
            L22:
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r4.this$0
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP
                r0.setState(r2)
            L29:
                float r0 = r4.mVelocity
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 == 0) goto L42
                float r0 = r4.mProgress
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 == 0) goto L3a
                return
            L3a:
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r4.this$0
                float r1 = r4.mProgress
                r0.setProgress(r1)
                return
            L42:
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r4.this$0
                float r2 = r4.mProgress
                float r3 = r4.mVelocity
                r0.setProgress(r2, r3)
                r0 = 2143289344(0x7fc00000, float:NaN)
                r4.mProgress = r0
                r4.mVelocity = r0
                r4.startState = r1
                r4.endState = r1
                return
        }

        public android.os.Bundle getTransitionState() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "motion.progress"
                float r2 = r3.mProgress
                r0.putFloat(r1, r2)
                java.lang.String r1 = "motion.velocity"
                float r2 = r3.mVelocity
                r0.putFloat(r1, r2)
                java.lang.String r1 = "motion.StartState"
                int r2 = r3.startState
                r0.putInt(r1, r2)
                java.lang.String r1 = "motion.EndState"
                int r2 = r3.endState
                r0.putInt(r1, r2)
                return r0
        }

        public void recordState() {
                r1 = this;
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.this$0
                int r0 = androidx.constraintlayout.motion.widget.MotionLayout.access$000(r0)
                r1.endState = r0
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.this$0
                int r0 = androidx.constraintlayout.motion.widget.MotionLayout.access$100(r0)
                r1.startState = r0
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.this$0
                float r0 = r0.getVelocity()
                r1.mVelocity = r0
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.this$0
                float r0 = r0.getProgress()
                r1.mProgress = r0
                return
        }

        public void setEndState(int r1) {
                r0 = this;
                r0.endState = r1
                return
        }

        public void setProgress(float r1) {
                r0 = this;
                r0.mProgress = r1
                return
        }

        public void setStartState(int r1) {
                r0 = this;
                r0.startState = r1
                return
        }

        public void setTransitionState(android.os.Bundle r2) {
                r1 = this;
                java.lang.String r0 = "motion.progress"
                float r0 = r2.getFloat(r0)
                r1.mProgress = r0
                java.lang.String r0 = "motion.velocity"
                float r0 = r2.getFloat(r0)
                r1.mVelocity = r0
                java.lang.String r0 = "motion.StartState"
                int r0 = r2.getInt(r0)
                r1.startState = r0
                java.lang.String r0 = "motion.EndState"
                int r2 = r2.getInt(r0)
                r1.endState = r2
                return
        }

        public void setVelocity(float r1) {
                r0 = this;
                r0.mVelocity = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface TransitionListener {
        void onTransitionChange(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2, int r3, float r4);

        void onTransitionCompleted(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2);

        void onTransitionStarted(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2, int r3);

        void onTransitionTrigger(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2, boolean r3, float r4);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum TransitionState extends java.lang.Enum<androidx.constraintlayout.motion.widget.MotionLayout.TransitionState> {
        private static final /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout.TransitionState[] $VALUES = null;
        public static final androidx.constraintlayout.motion.widget.MotionLayout.TransitionState FINISHED = null;
        public static final androidx.constraintlayout.motion.widget.MotionLayout.TransitionState MOVING = null;
        public static final androidx.constraintlayout.motion.widget.MotionLayout.TransitionState SETUP = null;
        public static final androidx.constraintlayout.motion.widget.MotionLayout.TransitionState UNDEFINED = null;

        static {
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = new androidx.constraintlayout.motion.widget.MotionLayout$TransitionState
                java.lang.String r1 = "UNDEFINED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED = r0
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = new androidx.constraintlayout.motion.widget.MotionLayout$TransitionState
                java.lang.String r3 = "SETUP"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP = r1
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = new androidx.constraintlayout.motion.widget.MotionLayout$TransitionState
                java.lang.String r5 = "MOVING"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING = r3
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r5 = new androidx.constraintlayout.motion.widget.MotionLayout$TransitionState
                java.lang.String r7 = "FINISHED"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED = r5
                r7 = 4
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState[] r7 = new androidx.constraintlayout.motion.widget.MotionLayout.TransitionState[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.$VALUES = r7
                return
        }

        TransitionState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.motion.widget.MotionLayout.TransitionState valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.motion.widget.MotionLayout$TransitionState> r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = (androidx.constraintlayout.motion.widget.MotionLayout.TransitionState) r1
                return r1
        }

        public static androidx.constraintlayout.motion.widget.MotionLayout.TransitionState[] values() {
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState[] r0 = (androidx.constraintlayout.motion.widget.MotionLayout.TransitionState[]) r0
                return r0
        }
    }

    public MotionLayout(@androidx.annotation.NonNull android.content.Context r5) {
            r4 = this;
            r4.<init>(r5)
            r5 = 0
            r4.mLastVelocity = r5
            r0 = -1
            r4.mBeginState = r0
            r4.mCurrentState = r0
            r4.mEndState = r0
            r0 = 0
            r4.mLastWidthMeasureSpec = r0
            r4.mLastHeightMeasureSpec = r0
            r1 = 1
            r4.mInteractionEnabled = r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r4.mFrameArrayList = r2
            r2 = 0
            r4.mAnimationStartTime = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r4.mTransitionDuration = r2
            r4.mTransitionPosition = r5
            r4.mTransitionLastPosition = r5
            r4.mTransitionGoalPosition = r5
            r4.mInTransition = r0
            r4.mIndirectTransition = r0
            r4.mDebugPath = r0
            r4.mTemporalInterpolator = r0
            androidx.constraintlayout.motion.utils.StopLogic r2 = new androidx.constraintlayout.motion.utils.StopLogic
            r2.<init>()
            r4.mStopLogic = r2
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r2 = new androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator
            r2.<init>(r4)
            r4.mDecelerateLogic = r2
            r4.firstDown = r1
            r4.mUndergoingMotion = r0
            r4.mKeepAnimating = r0
            r1 = 0
            r4.mOnShowHelpers = r1
            r4.mOnHideHelpers = r1
            r4.mTransitionListeners = r1
            r4.mFrames = r0
            r2 = -1
            r4.mLastDrawTime = r2
            r4.mLastFps = r5
            r4.mListenerState = r0
            r4.mListenerPosition = r5
            r4.mIsAnimating = r0
            r4.mMeasureDuringTransition = r0
            androidx.constraintlayout.motion.widget.KeyCache r5 = new androidx.constraintlayout.motion.widget.KeyCache
            r5.<init>()
            r4.mKeyCache = r5
            r4.mInLayout = r0
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r5 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED
            r4.mTransitionState = r5
            androidx.constraintlayout.motion.widget.MotionLayout$Model r5 = new androidx.constraintlayout.motion.widget.MotionLayout$Model
            r5.<init>(r4)
            r4.mModel = r5
            r4.mNeedsFireTransitionCompleted = r0
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            r4.mBoundsCheck = r5
            r4.mRegionView = r1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.mTransitionCompleted = r5
            r4.init(r1)
            return
    }

    public MotionLayout(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.Nullable android.util.AttributeSet r6) {
            r4 = this;
            r4.<init>(r5, r6)
            r5 = 0
            r4.mLastVelocity = r5
            r0 = -1
            r4.mBeginState = r0
            r4.mCurrentState = r0
            r4.mEndState = r0
            r0 = 0
            r4.mLastWidthMeasureSpec = r0
            r4.mLastHeightMeasureSpec = r0
            r1 = 1
            r4.mInteractionEnabled = r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r4.mFrameArrayList = r2
            r2 = 0
            r4.mAnimationStartTime = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r4.mTransitionDuration = r2
            r4.mTransitionPosition = r5
            r4.mTransitionLastPosition = r5
            r4.mTransitionGoalPosition = r5
            r4.mInTransition = r0
            r4.mIndirectTransition = r0
            r4.mDebugPath = r0
            r4.mTemporalInterpolator = r0
            androidx.constraintlayout.motion.utils.StopLogic r2 = new androidx.constraintlayout.motion.utils.StopLogic
            r2.<init>()
            r4.mStopLogic = r2
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r2 = new androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator
            r2.<init>(r4)
            r4.mDecelerateLogic = r2
            r4.firstDown = r1
            r4.mUndergoingMotion = r0
            r4.mKeepAnimating = r0
            r1 = 0
            r4.mOnShowHelpers = r1
            r4.mOnHideHelpers = r1
            r4.mTransitionListeners = r1
            r4.mFrames = r0
            r2 = -1
            r4.mLastDrawTime = r2
            r4.mLastFps = r5
            r4.mListenerState = r0
            r4.mListenerPosition = r5
            r4.mIsAnimating = r0
            r4.mMeasureDuringTransition = r0
            androidx.constraintlayout.motion.widget.KeyCache r5 = new androidx.constraintlayout.motion.widget.KeyCache
            r5.<init>()
            r4.mKeyCache = r5
            r4.mInLayout = r0
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r5 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED
            r4.mTransitionState = r5
            androidx.constraintlayout.motion.widget.MotionLayout$Model r5 = new androidx.constraintlayout.motion.widget.MotionLayout$Model
            r5.<init>(r4)
            r4.mModel = r5
            r4.mNeedsFireTransitionCompleted = r0
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            r4.mBoundsCheck = r5
            r4.mRegionView = r1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.mTransitionCompleted = r5
            r4.init(r6)
            return
    }

    public MotionLayout(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.Nullable android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            r4 = 0
            r3.mLastVelocity = r4
            r6 = -1
            r3.mBeginState = r6
            r3.mCurrentState = r6
            r3.mEndState = r6
            r6 = 0
            r3.mLastWidthMeasureSpec = r6
            r3.mLastHeightMeasureSpec = r6
            r0 = 1
            r3.mInteractionEnabled = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.mFrameArrayList = r1
            r1 = 0
            r3.mAnimationStartTime = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.mTransitionDuration = r1
            r3.mTransitionPosition = r4
            r3.mTransitionLastPosition = r4
            r3.mTransitionGoalPosition = r4
            r3.mInTransition = r6
            r3.mIndirectTransition = r6
            r3.mDebugPath = r6
            r3.mTemporalInterpolator = r6
            androidx.constraintlayout.motion.utils.StopLogic r1 = new androidx.constraintlayout.motion.utils.StopLogic
            r1.<init>()
            r3.mStopLogic = r1
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r1 = new androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator
            r1.<init>(r3)
            r3.mDecelerateLogic = r1
            r3.firstDown = r0
            r3.mUndergoingMotion = r6
            r3.mKeepAnimating = r6
            r0 = 0
            r3.mOnShowHelpers = r0
            r3.mOnHideHelpers = r0
            r3.mTransitionListeners = r0
            r3.mFrames = r6
            r1 = -1
            r3.mLastDrawTime = r1
            r3.mLastFps = r4
            r3.mListenerState = r6
            r3.mListenerPosition = r4
            r3.mIsAnimating = r6
            r3.mMeasureDuringTransition = r6
            androidx.constraintlayout.motion.widget.KeyCache r4 = new androidx.constraintlayout.motion.widget.KeyCache
            r4.<init>()
            r3.mKeyCache = r4
            r3.mInLayout = r6
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r4 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED
            r3.mTransitionState = r4
            androidx.constraintlayout.motion.widget.MotionLayout$Model r4 = new androidx.constraintlayout.motion.widget.MotionLayout$Model
            r4.<init>(r3)
            r3.mModel = r4
            r3.mNeedsFireTransitionCompleted = r6
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r3.mBoundsCheck = r4
            r3.mRegionView = r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.mTransitionCompleted = r4
            r3.init(r5)
            return
    }

    static /* synthetic */ int access$000(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            int r0 = r0.mEndState
            return r0
    }

    static /* synthetic */ int access$100(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            int r0 = r0.mBeginState
            return r0
    }

    static /* synthetic */ int access$1000(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            int r0 = r0.mLastHeightMeasureSpec
            return r0
    }

    static /* synthetic */ void access$1100(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            r0.setupMotionViews()
            return
    }

    static /* synthetic */ void access$1200(androidx.constraintlayout.motion.widget.MotionLayout r0, androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1, int r2, int r3, int r4) {
            r0.resolveSystem(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void access$1300(androidx.constraintlayout.motion.widget.MotionLayout r0, androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1, int r2, int r3, int r4) {
            r0.resolveSystem(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void access$1400(androidx.constraintlayout.motion.widget.MotionLayout r0, androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1, int r2, int r3, int r4) {
            r0.resolveSystem(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void access$1500(androidx.constraintlayout.motion.widget.MotionLayout r0, androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1, int r2, int r3, int r4) {
            r0.resolveSystem(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void access$1600(androidx.constraintlayout.motion.widget.MotionLayout r0, androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1, int r2, int r3, int r4) {
            r0.resolveSystem(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void access$1700(androidx.constraintlayout.motion.widget.MotionLayout r0, androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1, int r2, int r3, int r4) {
            r0.resolveSystem(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void access$1800(androidx.constraintlayout.motion.widget.MotionLayout r0, androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1, int r2, int r3, int r4) {
            r0.resolveSystem(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void access$1900(androidx.constraintlayout.motion.widget.MotionLayout r0, androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1, int r2, int r3, int r4) {
            r0.resolveSystem(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer access$200(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r0.mLayoutWidget
            return r0
    }

    static /* synthetic */ void access$2000(androidx.constraintlayout.motion.widget.MotionLayout r0, int r1, int r2, int r3, int r4, boolean r5, boolean r6) {
            r0.resolveMeasuredDimension(r1, r2, r3, r4, r5, r6)
            return
    }

    static /* synthetic */ androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer access$300(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r0.mLayoutWidget
            return r0
    }

    static /* synthetic */ androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer access$400(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r0.mLayoutWidget
            return r0
    }

    static /* synthetic */ androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer access$500(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r0.mLayoutWidget
            return r0
    }

    static /* synthetic */ boolean access$600(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            boolean r0 = r0.isRtl()
            return r0
    }

    static /* synthetic */ boolean access$700(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            boolean r0 = r0.isRtl()
            return r0
    }

    static /* synthetic */ void access$800(androidx.constraintlayout.motion.widget.MotionLayout r0, boolean r1, android.view.View r2, androidx.constraintlayout.solver.widgets.ConstraintWidget r3, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r4, android.util.SparseArray r5) {
            r0.applyConstraintsFromLayoutParams(r1, r2, r3, r4, r5)
            return
    }

    static /* synthetic */ int access$900(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            int r0 = r0.mLastWidthMeasureSpec
            return r0
    }

    private void checkStructure() {
            r6 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r6.mScene
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0.getStartId()
            androidx.constraintlayout.motion.widget.MotionScene r1 = r6.mScene
            int r2 = r1.getStartId()
            androidx.constraintlayout.widget.ConstraintSet r1 = r1.getConstraintSet(r2)
            r6.checkStructure(r0, r1)
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            androidx.constraintlayout.motion.widget.MotionScene r2 = r6.mScene
            java.util.ArrayList r2 = r2.getDefinedTransitions()
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6a
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r3
            androidx.constraintlayout.motion.widget.MotionScene r4 = r6.mScene
            androidx.constraintlayout.motion.widget.MotionScene$Transition r4 = r4.mCurrentTransition
            r6.checkStructure(r3)
            int r4 = r3.getStartConstraintSetId()
            int r3 = r3.getEndConstraintSetId()
            android.content.Context r5 = r6.getContext()
            androidx.constraintlayout.motion.widget.Debug.getName(r5, r4)
            android.content.Context r5 = r6.getContext()
            androidx.constraintlayout.motion.widget.Debug.getName(r5, r3)
            r0.get(r4)
            r1.get(r3)
            r0.put(r4, r3)
            r1.put(r3, r4)
            androidx.constraintlayout.motion.widget.MotionScene r5 = r6.mScene
            r5.getConstraintSet(r4)
            androidx.constraintlayout.motion.widget.MotionScene r4 = r6.mScene
            r4.getConstraintSet(r3)
            goto L2a
        L6a:
            return
    }

    private void checkStructure(int r5, androidx.constraintlayout.widget.ConstraintSet r6) {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            androidx.constraintlayout.motion.widget.Debug.getName(r0, r5)
            int r5 = r4.getChildCount()
            r0 = 0
            r1 = 0
        Ld:
            if (r1 >= r5) goto L23
            android.view.View r2 = r4.getChildAt(r1)
            int r3 = r2.getId()
            androidx.constraintlayout.widget.ConstraintSet$Constraint r3 = r6.getConstraint(r3)
            if (r3 != 0) goto L20
            androidx.constraintlayout.motion.widget.Debug.getName(r2)
        L20:
            int r1 = r1 + 1
            goto Ld
        L23:
            int[] r5 = r6.getKnownIds()
        L27:
            int r1 = r5.length
            if (r0 >= r1) goto L41
            r1 = r5[r0]
            android.content.Context r2 = r4.getContext()
            androidx.constraintlayout.motion.widget.Debug.getName(r2, r1)
            r2 = r5[r0]
            r4.findViewById(r2)
            r6.getHeight(r1)
            r6.getWidth(r1)
            int r0 = r0 + 1
            goto L27
        L41:
            return
    }

    private void checkStructure(androidx.constraintlayout.motion.widget.MotionScene.Transition r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            r2.debugString(r0)
            r2.getDuration()
            r2.getStartConstraintSetId()
            r2.getEndConstraintSetId()
            return
    }

    private void computeCurrentPositions() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1c
            android.view.View r2 = r4.getChildAt(r1)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r3 = r4.mFrameArrayList
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.motion.widget.MotionController r3 = (androidx.constraintlayout.motion.widget.MotionController) r3
            if (r3 != 0) goto L16
            goto L19
        L16:
            r3.setStartCurrentState(r2)
        L19:
            int r1 = r1 + 1
            goto L5
        L1c:
            return
    }

    private void debugPos() {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r4.getChildCount()
            if (r0 >= r1) goto L26
            android.view.View r1 = r4.getChildAt(r0)
            androidx.constraintlayout.motion.widget.Debug.getLocation()
            androidx.constraintlayout.motion.widget.Debug.getName(r4)
            android.content.Context r2 = r4.getContext()
            int r3 = r4.mCurrentState
            androidx.constraintlayout.motion.widget.Debug.getName(r2, r3)
            androidx.constraintlayout.motion.widget.Debug.getName(r1)
            r1.getLeft()
            r1.getTop()
            int r0 = r0 + 1
            goto L1
        L26:
            return
    }

    private void evaluateLayout() {
            r14 = this;
            float r0 = r14.mTransitionGoalPosition
            float r1 = r14.mTransitionLastPosition
            float r0 = r0 - r1
            float r0 = java.lang.Math.signum(r0)
            long r1 = r14.getNanoTime()
            android.view.animation.Interpolator r3 = r14.mInterpolator
            boolean r4 = r3 instanceof androidx.constraintlayout.motion.utils.StopLogic
            r5 = 814313567(0x3089705f, float:1.0E-9)
            r6 = 0
            if (r4 != 0) goto L24
            long r7 = r14.mTransitionLastTime
            long r7 = r1 - r7
            float r4 = (float) r7
            float r4 = r4 * r0
            float r4 = r4 * r5
            float r7 = r14.mTransitionDuration
            float r4 = r4 / r7
            goto L25
        L24:
            r4 = 0
        L25:
            float r7 = r14.mTransitionLastPosition
            float r7 = r7 + r4
            boolean r4 = r14.mTransitionInstantly
            if (r4 == 0) goto L2e
            float r7 = r14.mTransitionGoalPosition
        L2e:
            r4 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L39
            float r9 = r14.mTransitionGoalPosition
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 >= 0) goto L43
        L39:
            int r9 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r9 > 0) goto L47
            float r9 = r14.mTransitionGoalPosition
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 > 0) goto L47
        L43:
            float r7 = r14.mTransitionGoalPosition
            r9 = 1
            goto L48
        L47:
            r9 = 0
        L48:
            if (r3 == 0) goto L5f
            if (r9 != 0) goto L5f
            boolean r9 = r14.mTemporalInterpolator
            if (r9 == 0) goto L5b
            long r9 = r14.mAnimationStartTime
            long r1 = r1 - r9
            float r1 = (float) r1
            float r1 = r1 * r5
            float r7 = r3.getInterpolation(r1)
            goto L5f
        L5b:
            float r7 = r3.getInterpolation(r7)
        L5f:
            if (r8 <= 0) goto L67
            float r1 = r14.mTransitionGoalPosition
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 >= 0) goto L71
        L67:
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto L73
            float r0 = r14.mTransitionGoalPosition
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L73
        L71:
            float r7 = r14.mTransitionGoalPosition
        L73:
            r10 = r7
            r14.mPostInterpolationPosition = r10
            int r0 = r14.getChildCount()
            long r11 = r14.getNanoTime()
        L7e:
            if (r4 >= r0) goto L97
            android.view.View r9 = r14.getChildAt(r4)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r1 = r14.mFrameArrayList
            java.lang.Object r1 = r1.get(r9)
            r8 = r1
            androidx.constraintlayout.motion.widget.MotionController r8 = (androidx.constraintlayout.motion.widget.MotionController) r8
            if (r8 == 0) goto L94
            androidx.constraintlayout.motion.widget.KeyCache r13 = r14.mKeyCache
            r8.interpolate(r9, r10, r11, r13)
        L94:
            int r4 = r4 + 1
            goto L7e
        L97:
            boolean r0 = r14.mMeasureDuringTransition
            if (r0 == 0) goto L9e
            r14.requestLayout()
        L9e:
            return
    }

    private void fireTransitionChange() {
            r6 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r0 = r6.mTransitionListener
            if (r0 != 0) goto Le
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r6.mTransitionListeners
            if (r0 == 0) goto L76
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L76
        Le:
            float r0 = r6.mListenerPosition
            float r1 = r6.mTransitionPosition
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L76
            int r0 = r6.mListenerState
            r1 = 1
            r2 = -1
            if (r0 == r2) goto L45
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r0 = r6.mTransitionListener
            if (r0 == 0) goto L27
            int r3 = r6.mBeginState
            int r4 = r6.mEndState
            r0.onTransitionStarted(r6, r3, r4)
        L27:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r6.mTransitionListeners
            if (r0 == 0) goto L43
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L43
            java.lang.Object r3 = r0.next()
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r3 = (androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener) r3
            int r4 = r6.mBeginState
            int r5 = r6.mEndState
            r3.onTransitionStarted(r6, r4, r5)
            goto L2f
        L43:
            r6.mIsAnimating = r1
        L45:
            r6.mListenerState = r2
            float r0 = r6.mTransitionPosition
            r6.mListenerPosition = r0
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r2 = r6.mTransitionListener
            if (r2 == 0) goto L56
            int r3 = r6.mBeginState
            int r4 = r6.mEndState
            r2.onTransitionChange(r6, r3, r4, r0)
        L56:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r6.mTransitionListeners
            if (r0 == 0) goto L74
            java.util.Iterator r0 = r0.iterator()
        L5e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L74
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r2 = (androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener) r2
            int r3 = r6.mBeginState
            int r4 = r6.mEndState
            float r5 = r6.mTransitionPosition
            r2.onTransitionChange(r6, r3, r4, r5)
            goto L5e
        L74:
            r6.mIsAnimating = r1
        L76:
            return
    }

    private void fireTransitionStarted(androidx.constraintlayout.motion.widget.MotionLayout r3, int r4, int r5) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r0 = r2.mTransitionListener
            if (r0 == 0) goto L7
            r0.onTransitionStarted(r2, r4, r5)
        L7:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r2.mTransitionListeners
            if (r0 == 0) goto L1f
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r1 = (androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener) r1
            r1.onTransitionStarted(r3, r4, r5)
            goto Lf
        L1f:
            return
    }

    private boolean handlesTouchEvent(float r9, float r10, android.view.View r11, android.view.MotionEvent r12) {
            r8 = this;
            boolean r0 = r11 instanceof android.view.ViewGroup
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2a
            r0 = r11
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r3 = r0.getChildCount()
            r4 = 0
        Le:
            if (r4 >= r3) goto L2a
            android.view.View r5 = r0.getChildAt(r4)
            int r6 = r11.getLeft()
            float r6 = (float) r6
            float r6 = r6 + r9
            int r7 = r11.getTop()
            float r7 = (float) r7
            float r7 = r7 + r10
            boolean r5 = r8.handlesTouchEvent(r6, r7, r5, r12)
            if (r5 == 0) goto L27
            return r2
        L27:
            int r4 = r4 + 1
            goto Le
        L2a:
            android.graphics.RectF r0 = r8.mBoundsCheck
            int r3 = r11.getLeft()
            float r3 = (float) r3
            float r3 = r3 + r9
            int r4 = r11.getTop()
            float r4 = (float) r4
            float r4 = r4 + r10
            int r5 = r11.getRight()
            float r5 = (float) r5
            float r9 = r9 + r5
            int r5 = r11.getBottom()
            float r5 = (float) r5
            float r10 = r10 + r5
            r0.set(r3, r4, r9, r10)
            int r9 = r12.getAction()
            if (r9 != 0) goto L64
            android.graphics.RectF r9 = r8.mBoundsCheck
            float r10 = r12.getX()
            float r0 = r12.getY()
            boolean r9 = r9.contains(r10, r0)
            if (r9 == 0) goto L6b
            boolean r9 = r11.onTouchEvent(r12)
            if (r9 == 0) goto L6b
            return r2
        L64:
            boolean r9 = r11.onTouchEvent(r12)
            if (r9 == 0) goto L6b
            return r2
        L6b:
            return r1
    }

    private void init(android.util.AttributeSet r10) {
            r9 = this;
            boolean r0 = r9.isInEditMode()
            androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE = r0
            r0 = -1
            if (r10 == 0) goto L80
            android.content.Context r1 = r9.getContext()
            int[] r2 = androidx.constraintlayout.widget.R.styleable.MotionLayout
            android.content.res.TypedArray r10 = r1.obtainStyledAttributes(r10, r2)
            int r1 = r10.getIndexCount()
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
        L1b:
            if (r4 >= r1) goto L78
            int r6 = r10.getIndex(r4)
            int r7 = androidx.constraintlayout.widget.R.styleable.MotionLayout_layoutDescription
            if (r6 != r7) goto L35
            int r6 = r10.getResourceId(r6, r0)
            androidx.constraintlayout.motion.widget.MotionScene r7 = new androidx.constraintlayout.motion.widget.MotionScene
            android.content.Context r8 = r9.getContext()
            r7.<init>(r8, r9, r6)
            r9.mScene = r7
            goto L75
        L35:
            int r7 = androidx.constraintlayout.widget.R.styleable.MotionLayout_currentState
            if (r6 != r7) goto L40
            int r6 = r10.getResourceId(r6, r0)
            r9.mCurrentState = r6
            goto L75
        L40:
            int r7 = androidx.constraintlayout.widget.R.styleable.MotionLayout_motionProgress
            if (r6 != r7) goto L4e
            r7 = 0
            float r6 = r10.getFloat(r6, r7)
            r9.mTransitionGoalPosition = r6
            r9.mInTransition = r2
            goto L75
        L4e:
            int r7 = androidx.constraintlayout.widget.R.styleable.MotionLayout_applyMotionScene
            if (r6 != r7) goto L57
            boolean r5 = r10.getBoolean(r6, r5)
            goto L75
        L57:
            int r7 = androidx.constraintlayout.widget.R.styleable.MotionLayout_showPaths
            if (r6 != r7) goto L6b
            int r7 = r9.mDebugPath
            if (r7 != 0) goto L75
            boolean r6 = r10.getBoolean(r6, r3)
            if (r6 == 0) goto L67
            r6 = 2
            goto L68
        L67:
            r6 = 0
        L68:
            r9.mDebugPath = r6
            goto L75
        L6b:
            int r7 = androidx.constraintlayout.widget.R.styleable.MotionLayout_motionDebug
            if (r6 != r7) goto L75
            int r6 = r10.getInt(r6, r3)
            r9.mDebugPath = r6
        L75:
            int r4 = r4 + 1
            goto L1b
        L78:
            r10.recycle()
            if (r5 != 0) goto L80
            r10 = 0
            r9.mScene = r10
        L80:
            int r10 = r9.mDebugPath
            if (r10 == 0) goto L87
            r9.checkStructure()
        L87:
            int r10 = r9.mCurrentState
            if (r10 != r0) goto La5
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            if (r10 == 0) goto La5
            int r10 = r10.getStartId()
            r9.mCurrentState = r10
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            int r10 = r10.getStartId()
            r9.mBeginState = r10
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            int r10 = r10.getEndId()
            r9.mEndState = r10
        La5:
            return
    }

    private void onNewStateAttachHandlers() {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r2.mScene
            if (r0 != 0) goto L5
            goto L28
        L5:
            int r1 = r2.mCurrentState
            boolean r0 = r0.autoTransition(r2, r1)
            if (r0 == 0) goto L11
            r2.requestLayout()
            return
        L11:
            int r0 = r2.mCurrentState
            r1 = -1
            if (r0 == r1) goto L1b
            androidx.constraintlayout.motion.widget.MotionScene r1 = r2.mScene
            r1.addOnClickListeners(r2, r0)
        L1b:
            androidx.constraintlayout.motion.widget.MotionScene r0 = r2.mScene
            boolean r0 = r0.supportTouch()
            if (r0 == 0) goto L28
            androidx.constraintlayout.motion.widget.MotionScene r0 = r2.mScene
            r0.setupTouch()
        L28:
            return
    }

    private void processTransitionCompleted() {
            r5 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r0 = r5.mTransitionListener
            if (r0 != 0) goto Lf
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r5.mTransitionListeners
            if (r0 == 0) goto Le
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
        Le:
            return
        Lf:
            r0 = 0
            r5.mIsAnimating = r0
            java.util.ArrayList<java.lang.Integer> r0 = r5.mTransitionCompleted
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r2 = r5.mTransitionListener
            if (r2 == 0) goto L2f
            int r3 = r1.intValue()
            r2.onTransitionCompleted(r5, r3)
        L2f:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r2 = r5.mTransitionListeners
            if (r2 == 0) goto L18
            java.util.Iterator r2 = r2.iterator()
        L37:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L18
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r3 = (androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener) r3
            int r4 = r1.intValue()
            r3.onTransitionCompleted(r5, r4)
            goto L37
        L4b:
            java.util.ArrayList<java.lang.Integer> r0 = r5.mTransitionCompleted
            r0.clear()
            return
    }

    private void setupMotionViews() {
            r12 = this;
            int r0 = r12.getChildCount()
            androidx.constraintlayout.motion.widget.MotionLayout$Model r1 = r12.mModel
            r1.build()
            r1 = 1
            r12.mInTransition = r1
            int r3 = r12.getWidth()
            int r4 = r12.getHeight()
            androidx.constraintlayout.motion.widget.MotionScene r2 = r12.mScene
            int r2 = r2.gatPathMotionArc()
            r5 = -1
            r8 = 0
            if (r2 == r5) goto L35
            r5 = 0
        L1f:
            if (r5 >= r0) goto L35
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r6 = r12.mFrameArrayList
            android.view.View r7 = r12.getChildAt(r5)
            java.lang.Object r6 = r6.get(r7)
            androidx.constraintlayout.motion.widget.MotionController r6 = (androidx.constraintlayout.motion.widget.MotionController) r6
            if (r6 == 0) goto L32
            r6.setPathMotionArc(r2)
        L32:
            int r5 = r5 + 1
            goto L1f
        L35:
            r9 = 0
        L36:
            if (r9 >= r0) goto L57
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r2 = r12.mFrameArrayList
            android.view.View r5 = r12.getChildAt(r9)
            java.lang.Object r2 = r2.get(r5)
            androidx.constraintlayout.motion.widget.MotionController r2 = (androidx.constraintlayout.motion.widget.MotionController) r2
            if (r2 == 0) goto L54
            androidx.constraintlayout.motion.widget.MotionScene r5 = r12.mScene
            r5.getKeyFrames(r2)
            float r5 = r12.mTransitionDuration
            long r6 = r12.getNanoTime()
            r2.setup(r3, r4, r5, r6)
        L54:
            int r9 = r9 + 1
            goto L36
        L57:
            androidx.constraintlayout.motion.widget.MotionScene r2 = r12.mScene
            float r2 = r2.getStaggered()
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L13c
            double r3 = (double) r2
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L6a
            goto L6b
        L6a:
            r1 = 0
        L6b:
            float r2 = java.lang.Math.abs(r2)
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r5 = 0
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L7c:
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r5 >= r0) goto L10e
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r10 = r12.mFrameArrayList
            android.view.View r11 = r12.getChildAt(r5)
            java.lang.Object r10 = r10.get(r11)
            androidx.constraintlayout.motion.widget.MotionController r10 = (androidx.constraintlayout.motion.widget.MotionController) r10
            float r11 = r10.mMotionStagger
            boolean r11 = java.lang.Float.isNaN(r11)
            if (r11 != 0) goto Lf5
            r5 = 0
        L95:
            if (r5 >= r0) goto Lba
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r6 = r12.mFrameArrayList
            android.view.View r7 = r12.getChildAt(r5)
            java.lang.Object r6 = r6.get(r7)
            androidx.constraintlayout.motion.widget.MotionController r6 = (androidx.constraintlayout.motion.widget.MotionController) r6
            float r7 = r6.mMotionStagger
            boolean r7 = java.lang.Float.isNaN(r7)
            if (r7 != 0) goto Lb7
            float r7 = r6.mMotionStagger
            float r4 = java.lang.Math.min(r4, r7)
            float r6 = r6.mMotionStagger
            float r3 = java.lang.Math.max(r3, r6)
        Lb7:
            int r5 = r5 + 1
            goto L95
        Lba:
            if (r8 >= r0) goto L13c
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r5 = r12.mFrameArrayList
            android.view.View r6 = r12.getChildAt(r8)
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.motion.widget.MotionController r5 = (androidx.constraintlayout.motion.widget.MotionController) r5
            float r6 = r5.mMotionStagger
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto Lf2
            float r6 = r9 - r2
            float r6 = r9 / r6
            r5.mStaggerScale = r6
            if (r1 == 0) goto Le6
            float r6 = r5.mMotionStagger
            float r6 = r3 - r6
            float r7 = r3 - r4
            float r6 = r6 / r7
            float r6 = r6 * r2
            float r6 = r2 - r6
            r5.mStaggerOffset = r6
            goto Lf2
        Le6:
            float r6 = r5.mMotionStagger
            float r6 = r6 - r4
            float r6 = r6 * r2
            float r7 = r3 - r4
            float r6 = r6 / r7
            float r6 = r2 - r6
            r5.mStaggerOffset = r6
        Lf2:
            int r8 = r8 + 1
            goto Lba
        Lf5:
            float r9 = r10.getFinalX()
            float r10 = r10.getFinalY()
            if (r1 == 0) goto L101
            float r10 = r10 - r9
            goto L102
        L101:
            float r10 = r10 + r9
        L102:
            float r6 = java.lang.Math.min(r6, r10)
            float r7 = java.lang.Math.max(r7, r10)
            int r5 = r5 + 1
            goto L7c
        L10e:
            if (r8 >= r0) goto L13c
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r3 = r12.mFrameArrayList
            android.view.View r4 = r12.getChildAt(r8)
            java.lang.Object r3 = r3.get(r4)
            androidx.constraintlayout.motion.widget.MotionController r3 = (androidx.constraintlayout.motion.widget.MotionController) r3
            float r4 = r3.getFinalX()
            float r5 = r3.getFinalY()
            if (r1 == 0) goto L128
            float r5 = r5 - r4
            goto L129
        L128:
            float r5 = r5 + r4
        L129:
            float r4 = r9 - r2
            float r4 = r9 / r4
            r3.mStaggerScale = r4
            float r5 = r5 - r6
            float r5 = r5 * r2
            float r4 = r7 - r6
            float r5 = r5 / r4
            float r4 = r2 - r5
            r3.mStaggerOffset = r4
            int r8 = r8 + 1
            goto L10e
        L13c:
            return
    }

    private static boolean willJump(float r5, float r6, float r7) {
            r0 = 0
            r1 = 1
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 0
            int r4 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r4 <= 0) goto L1c
            float r3 = r5 / r7
            float r5 = r5 * r3
            float r7 = r7 * r3
            float r7 = r7 * r3
            float r7 = r7 / r2
            float r5 = r5 - r7
            float r6 = r6 + r5
            r5 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L1b
            return r1
        L1b:
            return r0
        L1c:
            float r4 = -r5
            float r4 = r4 / r7
            float r5 = r5 * r4
            float r7 = r7 * r4
            float r7 = r7 * r4
            float r7 = r7 / r2
            float r5 = r5 + r7
            float r6 = r6 + r5
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 >= 0) goto L2c
            return r1
        L2c:
            return r0
    }

    public void addTransitionListener(androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r1.mTransitionListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mTransitionListeners = r0
        Lb:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r1.mTransitionListeners
            r0.add(r2)
            return
    }

    void animateTo(float r5) {
            r4 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r4.mScene
            if (r0 != 0) goto L5
            goto L19
        L5:
            float r1 = r4.mTransitionLastPosition
            float r2 = r4.mTransitionPosition
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L13
            boolean r1 = r4.mTransitionInstantly
            if (r1 == 0) goto L13
            r4.mTransitionLastPosition = r2
        L13:
            float r1 = r4.mTransitionLastPosition
            int r2 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r2 != 0) goto L1a
        L19:
            return
        L1a:
            r2 = 0
            r4.mTemporalInterpolator = r2
            r4.mTransitionGoalPosition = r5
            int r5 = r0.getDuration()
            float r5 = (float) r5
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 / r0
            r4.mTransitionDuration = r5
            float r5 = r4.mTransitionGoalPosition
            r4.setProgress(r5)
            androidx.constraintlayout.motion.widget.MotionScene r5 = r4.mScene
            android.view.animation.Interpolator r5 = r5.getInterpolator()
            r4.mInterpolator = r5
            r4.mTransitionInstantly = r2
            long r2 = r4.getNanoTime()
            r4.mAnimationStartTime = r2
            r5 = 1
            r4.mInTransition = r5
            r4.mTransitionPosition = r1
            r4.mTransitionLastPosition = r1
            r4.invalidate()
            return
    }

    void disableAutoTransition(boolean r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 != 0) goto L5
            return
        L5:
            r0.disableAutoTransition(r2)
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r10) {
            r9 = this;
            r0 = 0
            r9.evaluate(r0)
            super.dispatchDraw(r10)
            androidx.constraintlayout.motion.widget.MotionScene r1 = r9.mScene
            if (r1 != 0) goto Ld
            goto Lf5
        Ld:
            int r1 = r9.mDebugPath
            r2 = 1
            r1 = r1 & r2
            if (r1 != r2) goto Ld7
            boolean r1 = r9.isInEditMode()
            if (r1 != 0) goto Ld7
            int r1 = r9.mFrames
            int r1 = r1 + r2
            r9.mFrames = r1
            long r3 = r9.getNanoTime()
            long r5 = r9.mLastDrawTime
            r7 = -1
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L4b
            long r5 = r3 - r5
            r7 = 200000000(0xbebc200, double:9.8813129E-316)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L4d
            int r1 = r9.mFrames
            float r1 = (float) r1
            float r5 = (float) r5
            r6 = 814313567(0x3089705f, float:1.0E-9)
            float r5 = r5 * r6
            float r1 = r1 / r5
            r5 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r5
            int r1 = (int) r1
            float r1 = (float) r1
            float r1 = r1 / r5
            r9.mLastFps = r1
            r9.mFrames = r0
            r9.mLastDrawTime = r3
            goto L4d
        L4b:
            r9.mLastDrawTime = r3
        L4d:
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1 = 1109917696(0x42280000, float:42.0)
            r0.setTextSize(r1)
            float r1 = r9.getProgress()
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r3
            int r1 = (int) r1
            float r1 = (float) r1
            r3 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            float r5 = r9.mLastFps
            r4.append(r5)
            java.lang.String r5 = " fps "
            r4.append(r5)
            int r5 = r9.mBeginState
            java.lang.String r5 = androidx.constraintlayout.motion.widget.Debug.getState(r9, r5)
            r4.append(r5)
            java.lang.String r5 = " -> "
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            int r4 = r9.mEndState
            java.lang.String r4 = androidx.constraintlayout.motion.widget.Debug.getState(r9, r4)
            r5.append(r4)
            java.lang.String r4 = " (progress: "
            r5.append(r4)
            r5.append(r1)
            java.lang.String r1 = " ) state="
            r5.append(r1)
            int r1 = r9.mCurrentState
            r4 = -1
            if (r1 != r4) goto Lab
            java.lang.String r1 = "undefined"
            goto Laf
        Lab:
            java.lang.String r1 = androidx.constraintlayout.motion.widget.Debug.getState(r9, r1)
        Laf:
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setColor(r4)
            int r4 = r9.getHeight()
            int r4 = r4 + (-29)
            float r4 = (float) r4
            r5 = 1093664768(0x41300000, float:11.0)
            r10.drawText(r1, r5, r4, r0)
            r4 = -7864184(0xffffffffff880088, float:NaN)
            r0.setColor(r4)
            int r4 = r9.getHeight()
            int r4 = r4 + (-30)
            float r4 = (float) r4
            r10.drawText(r1, r3, r4, r0)
        Ld7:
            int r0 = r9.mDebugPath
            if (r0 <= r2) goto Lf5
            androidx.constraintlayout.motion.widget.MotionLayout$DevModeDraw r0 = r9.mDevModeDraw
            if (r0 != 0) goto Le6
            androidx.constraintlayout.motion.widget.MotionLayout$DevModeDraw r0 = new androidx.constraintlayout.motion.widget.MotionLayout$DevModeDraw
            r0.<init>(r9)
            r9.mDevModeDraw = r0
        Le6:
            androidx.constraintlayout.motion.widget.MotionLayout$DevModeDraw r0 = r9.mDevModeDraw
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r1 = r9.mFrameArrayList
            androidx.constraintlayout.motion.widget.MotionScene r2 = r9.mScene
            int r2 = r2.getDuration()
            int r3 = r9.mDebugPath
            r0.draw(r10, r1, r2, r3)
        Lf5:
            return
    }

    public void enableTransition(int r3, boolean r4) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r2.getTransition(r3)
            if (r4 == 0) goto Lb
            r4 = 1
            r3.setEnable(r4)
            return
        Lb:
            androidx.constraintlayout.motion.widget.MotionScene r4 = r2.mScene
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r4.mCurrentTransition
            if (r3 != r0) goto L31
            int r0 = r2.mCurrentState
            java.util.List r4 = r4.getTransitionsWithState(r0)
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r4.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r0
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L1b
            androidx.constraintlayout.motion.widget.MotionScene r4 = r2.mScene
            r4.mCurrentTransition = r0
        L31:
            r4 = 0
            r3.setEnable(r4)
            return
    }

    void evaluate(boolean r21) {
            r20 = this;
            r0 = r20
            long r1 = r0.mTransitionLastTime
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L10
            long r1 = r0.getNanoTime()
            r0.mTransitionLastTime = r1
        L10:
            float r1 = r0.mTransitionLastPosition
            r2 = -1
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 <= 0) goto L20
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L20
            r0.mCurrentState = r2
        L20:
            boolean r5 = r0.mKeepAnimating
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L32
            boolean r5 = r0.mInTransition
            if (r5 == 0) goto L1f9
            if (r21 != 0) goto L32
            float r5 = r0.mTransitionGoalPosition
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 == 0) goto L1f9
        L32:
            float r5 = r0.mTransitionGoalPosition
            float r5 = r5 - r1
            float r1 = java.lang.Math.signum(r5)
            long r8 = r0.getNanoTime()
            android.view.animation.Interpolator r5 = r0.mInterpolator
            boolean r10 = r5 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator
            r11 = 814313567(0x3089705f, float:1.0E-9)
            if (r10 != 0) goto L55
            long r12 = r0.mTransitionLastTime
            long r12 = r8 - r12
            float r10 = (float) r12
            float r10 = r10 * r1
            float r10 = r10 * r11
            float r12 = r0.mTransitionDuration
            float r10 = r10 / r12
            r0.mLastVelocity = r10
            goto L56
        L55:
            r10 = 0
        L56:
            float r12 = r0.mTransitionLastPosition
            float r12 = r12 + r10
            boolean r13 = r0.mTransitionInstantly
            if (r13 == 0) goto L5f
            float r12 = r0.mTransitionGoalPosition
        L5f:
            int r13 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r13 <= 0) goto L69
            float r14 = r0.mTransitionGoalPosition
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 >= 0) goto L73
        L69:
            int r14 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r14 > 0) goto L79
            float r14 = r0.mTransitionGoalPosition
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 > 0) goto L79
        L73:
            float r12 = r0.mTransitionGoalPosition
            r0.mInTransition = r7
            r14 = 1
            goto L7a
        L79:
            r14 = 0
        L7a:
            r0.mTransitionLastPosition = r12
            r0.mTransitionPosition = r12
            r0.mTransitionLastTime = r8
            r15 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r5 == 0) goto Lf4
            if (r14 != 0) goto Lf4
            boolean r14 = r0.mTemporalInterpolator
            if (r14 == 0) goto Ld5
            r21 = 814313567(0x3089705f, float:1.0E-9)
            long r11 = r0.mAnimationStartTime
            long r11 = r8 - r11
            float r10 = (float) r11
            float r10 = r10 * r21
            float r5 = r5.getInterpolation(r10)
            r0.mTransitionLastPosition = r5
            r0.mTransitionLastTime = r8
            android.view.animation.Interpolator r8 = r0.mInterpolator
            boolean r9 = r8 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator
            if (r9 == 0) goto Lf3
            androidx.constraintlayout.motion.widget.MotionInterpolator r8 = (androidx.constraintlayout.motion.widget.MotionInterpolator) r8
            float r8 = r8.getVelocity()
            r0.mLastVelocity = r8
            float r9 = java.lang.Math.abs(r8)
            float r10 = r0.mTransitionDuration
            float r9 = r9 * r10
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 > 0) goto Lb9
            r0.mInTransition = r7
        Lb9:
            int r9 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r9 <= 0) goto Lc7
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 < 0) goto Lc7
            r0.mTransitionLastPosition = r3
            r0.mInTransition = r7
            r5 = 1065353216(0x3f800000, float:1.0)
        Lc7:
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 >= 0) goto Lf3
            int r8 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r8 > 0) goto Lf3
            r0.mTransitionLastPosition = r4
            r0.mInTransition = r7
            r12 = 0
            goto Lf4
        Ld5:
            float r5 = r5.getInterpolation(r12)
            android.view.animation.Interpolator r8 = r0.mInterpolator
            boolean r9 = r8 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator
            if (r9 == 0) goto Le8
            androidx.constraintlayout.motion.widget.MotionInterpolator r8 = (androidx.constraintlayout.motion.widget.MotionInterpolator) r8
            float r8 = r8.getVelocity()
            r0.mLastVelocity = r8
            goto Lf3
        Le8:
            float r12 = r12 + r10
            float r8 = r8.getInterpolation(r12)
            float r8 = r8 - r5
            float r8 = r8 * r1
            float r8 = r8 / r10
            r0.mLastVelocity = r8
        Lf3:
            r12 = r5
        Lf4:
            float r5 = r0.mLastVelocity
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r5 <= 0) goto L103
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r5 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r0.setState(r5)
        L103:
            if (r13 <= 0) goto L10b
            float r5 = r0.mTransitionGoalPosition
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 >= 0) goto L115
        L10b:
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 > 0) goto L119
            float r5 = r0.mTransitionGoalPosition
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 > 0) goto L119
        L115:
            float r12 = r0.mTransitionGoalPosition
            r0.mInTransition = r7
        L119:
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 >= 0) goto L121
            int r8 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r8 > 0) goto L128
        L121:
            r0.mInTransition = r7
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r8 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r8)
        L128:
            int r8 = r0.getChildCount()
            r0.mKeepAnimating = r7
            long r17 = r0.getNanoTime()
            r0.mPostInterpolationPosition = r12
            r9 = 0
        L135:
            if (r9 >= r8) goto L158
            android.view.View r15 = r0.getChildAt(r9)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r10 = r0.mFrameArrayList
            java.lang.Object r10 = r10.get(r15)
            r14 = r10
            androidx.constraintlayout.motion.widget.MotionController r14 = (androidx.constraintlayout.motion.widget.MotionController) r14
            if (r14 == 0) goto L155
            boolean r10 = r0.mKeepAnimating
            androidx.constraintlayout.motion.widget.KeyCache r11 = r0.mKeyCache
            r19 = r11
            r16 = r12
            boolean r11 = r14.interpolate(r15, r16, r17, r19)
            r10 = r10 | r11
            r0.mKeepAnimating = r10
        L155:
            int r9 = r9 + 1
            goto L135
        L158:
            if (r13 <= 0) goto L160
            float r8 = r0.mTransitionGoalPosition
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 >= 0) goto L16a
        L160:
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 > 0) goto L16c
            float r8 = r0.mTransitionGoalPosition
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 > 0) goto L16c
        L16a:
            r8 = 1
            goto L16d
        L16c:
            r8 = 0
        L16d:
            boolean r9 = r0.mKeepAnimating
            if (r9 != 0) goto L17c
            boolean r9 = r0.mInTransition
            if (r9 != 0) goto L17c
            if (r8 == 0) goto L17c
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r9 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r9)
        L17c:
            boolean r9 = r0.mMeasureDuringTransition
            if (r9 == 0) goto L183
            r0.requestLayout()
        L183:
            boolean r9 = r0.mKeepAnimating
            r8 = r8 ^ r6
            r8 = r8 | r9
            r0.mKeepAnimating = r8
            int r8 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r8 > 0) goto L1a6
            int r8 = r0.mBeginState
            if (r8 == r2) goto L1a6
            int r2 = r0.mCurrentState
            if (r2 == r8) goto L1a6
            r0.mCurrentState = r8
            androidx.constraintlayout.motion.widget.MotionScene r2 = r0.mScene
            androidx.constraintlayout.widget.ConstraintSet r2 = r2.getConstraintSet(r8)
            r2.applyCustomAttributes(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r2)
            r7 = 1
        L1a6:
            double r8 = (double) r12
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 < 0) goto L1c4
            int r2 = r0.mCurrentState
            int r8 = r0.mEndState
            if (r2 == r8) goto L1c4
            r0.mCurrentState = r8
            androidx.constraintlayout.motion.widget.MotionScene r2 = r0.mScene
            androidx.constraintlayout.widget.ConstraintSet r2 = r2.getConstraintSet(r8)
            r2.applyCustomAttributes(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r2)
            r7 = 1
        L1c4:
            boolean r2 = r0.mKeepAnimating
            if (r2 != 0) goto L1df
            boolean r2 = r0.mInTransition
            if (r2 == 0) goto L1cd
            goto L1df
        L1cd:
            if (r13 <= 0) goto L1d1
            if (r5 == 0) goto L1d9
        L1d1:
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 >= 0) goto L1e2
            int r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r2 != 0) goto L1e2
        L1d9:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r2)
            goto L1e2
        L1df:
            r0.invalidate()
        L1e2:
            boolean r2 = r0.mKeepAnimating
            if (r2 != 0) goto L1ee
            boolean r2 = r0.mInTransition
            if (r2 == 0) goto L1ee
            if (r13 <= 0) goto L1ee
            if (r5 == 0) goto L1f6
        L1ee:
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L1f9
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 != 0) goto L1f9
        L1f6:
            r0.onNewStateAttachHandlers()
        L1f9:
            float r1 = r0.mTransitionLastPosition
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 < 0) goto L20b
            int r1 = r0.mCurrentState
            int r2 = r0.mEndState
            if (r1 == r2) goto L206
            goto L207
        L206:
            r6 = r7
        L207:
            r0.mCurrentState = r2
        L209:
            r7 = r6
            goto L21a
        L20b:
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L21a
            int r1 = r0.mCurrentState
            int r2 = r0.mBeginState
            if (r1 == r2) goto L216
            goto L217
        L216:
            r6 = r7
        L217:
            r0.mCurrentState = r2
            goto L209
        L21a:
            boolean r1 = r0.mNeedsFireTransitionCompleted
            r1 = r1 | r7
            r0.mNeedsFireTransitionCompleted = r1
            if (r7 == 0) goto L228
            boolean r1 = r0.mInLayout
            if (r1 != 0) goto L228
            r0.requestLayout()
        L228:
            float r1 = r0.mTransitionLastPosition
            r0.mTransitionPosition = r1
            return
    }

    protected void fireTransitionCompleted() {
            r3 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r0 = r3.mTransitionListener
            if (r0 != 0) goto Le
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r3.mTransitionListeners
            if (r0 == 0) goto L42
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L42
        Le:
            int r0 = r3.mListenerState
            r1 = -1
            if (r0 != r1) goto L42
            int r0 = r3.mCurrentState
            r3.mListenerState = r0
            java.util.ArrayList<java.lang.Integer> r0 = r3.mTransitionCompleted
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L32
            java.util.ArrayList<java.lang.Integer> r0 = r3.mTransitionCompleted
            int r2 = r0.size()
            int r2 = r2 + (-1)
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L33
        L32:
            r0 = -1
        L33:
            int r2 = r3.mCurrentState
            if (r0 == r2) goto L42
            if (r2 == r1) goto L42
            java.util.ArrayList<java.lang.Integer> r0 = r3.mTransitionCompleted
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.add(r1)
        L42:
            r3.processTransitionCompleted()
            return
    }

    public void fireTrigger(int r3, boolean r4, float r5) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r0 = r2.mTransitionListener
            if (r0 == 0) goto L7
            r0.onTransitionTrigger(r2, r3, r4, r5)
        L7:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r2.mTransitionListeners
            if (r0 == 0) goto L1f
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r1 = (androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener) r1
            r1.onTransitionTrigger(r2, r3, r4, r5)
            goto Lf
        L1f:
            return
    }

    void getAnchorDpDt(int r3, float r4, float r5, float r6, float[] r7) {
            r2 = this;
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r0 = r2.mFrameArrayList
            android.view.View r1 = r2.getViewById(r3)
            java.lang.Object r0 = r0.get(r1)
            androidx.constraintlayout.motion.widget.MotionController r0 = (androidx.constraintlayout.motion.widget.MotionController) r0
            if (r0 == 0) goto L1a
            r0.getDpDt(r4, r5, r6, r7)
            float r3 = r1.getY()
            r2.lastPos = r4
            r2.lastY = r3
            return
        L1a:
            if (r1 != 0) goto L2a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = ""
            r4.append(r5)
            r4.append(r3)
            goto L35
        L2a:
            android.content.Context r4 = r1.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r4.getResourceName(r3)
        L35:
            return
    }

    public androidx.constraintlayout.widget.ConstraintSet getConstraintSet(int r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            androidx.constraintlayout.widget.ConstraintSet r2 = r0.getConstraintSet(r2)
            return r2
    }

    public int[] getConstraintSetIds() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int[] r0 = r0.getConstraintSetIds()
            return r0
    }

    java.lang.String getConstraintSetNames(int r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.String r2 = r0.lookUpConstraintName(r2)
            return r2
    }

    public int getCurrentState() {
            r1 = this;
            int r0 = r1.mCurrentState
            return r0
    }

    public void getDebugMode(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r1 = 2
            goto L5
        L4:
            r1 = 1
        L5:
            r0.mDebugPath = r1
            r0.invalidate()
            return
    }

    public java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> getDefinedTransitions() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.ArrayList r0 = r0.getDefinedTransitions()
            return r0
    }

    public androidx.constraintlayout.motion.widget.DesignTool getDesignTool() {
            r1 = this;
            androidx.constraintlayout.motion.widget.DesignTool r0 = r1.mDesignTool
            if (r0 != 0) goto Lb
            androidx.constraintlayout.motion.widget.DesignTool r0 = new androidx.constraintlayout.motion.widget.DesignTool
            r0.<init>(r1)
            r1.mDesignTool = r0
        Lb:
            androidx.constraintlayout.motion.widget.DesignTool r0 = r1.mDesignTool
            return r0
    }

    public int getEndState() {
            r1 = this;
            int r0 = r1.mEndState
            return r0
    }

    protected long getNanoTime() {
            r2 = this;
            long r0 = java.lang.System.nanoTime()
            return r0
    }

    public float getProgress() {
            r1 = this;
            float r0 = r1.mTransitionLastPosition
            return r0
    }

    public int getStartState() {
            r1 = this;
            int r0 = r1.mBeginState
            return r0
    }

    public float getTargetPosition() {
            r1 = this;
            float r0 = r1.mTransitionGoalPosition
            return r0
    }

    public androidx.constraintlayout.motion.widget.MotionScene.Transition getTransition(int r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            androidx.constraintlayout.motion.widget.MotionScene$Transition r2 = r0.getTransitionById(r2)
            return r2
    }

    public android.os.Bundle getTransitionState() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r1.mStateCache
            if (r0 != 0) goto Lb
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = new androidx.constraintlayout.motion.widget.MotionLayout$StateCache
            r0.<init>(r1)
            r1.mStateCache = r0
        Lb:
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r1.mStateCache
            r0.recordState()
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r1.mStateCache
            android.os.Bundle r0 = r0.getTransitionState()
            return r0
    }

    public long getTransitionTimeMs() {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r2.mScene
            r1 = 1148846080(0x447a0000, float:1000.0)
            if (r0 == 0) goto Le
            int r0 = r0.getDuration()
            float r0 = (float) r0
            float r0 = r0 / r1
            r2.mTransitionDuration = r0
        Le:
            float r0 = r2.mTransitionDuration
            float r0 = r0 * r1
            long r0 = (long) r0
            return r0
    }

    public float getVelocity() {
            r1 = this;
            float r0 = r1.mLastVelocity
            return r0
    }

    public void getViewVelocity(android.view.View r9, float r10, float r11, float[] r12, int r13) {
            r8 = this;
            float r0 = r8.mLastVelocity
            float r1 = r8.mTransitionLastPosition
            android.view.animation.Interpolator r2 = r8.mInterpolator
            if (r2 == 0) goto L2b
            float r0 = r8.mTransitionGoalPosition
            float r0 = r0 - r1
            float r0 = java.lang.Math.signum(r0)
            android.view.animation.Interpolator r1 = r8.mInterpolator
            float r2 = r8.mTransitionLastPosition
            r3 = 925353388(0x3727c5ac, float:1.0E-5)
            float r2 = r2 + r3
            float r1 = r1.getInterpolation(r2)
            android.view.animation.Interpolator r2 = r8.mInterpolator
            float r4 = r8.mTransitionLastPosition
            float r2 = r2.getInterpolation(r4)
            float r1 = r1 - r2
            float r1 = r1 / r3
            float r0 = r0 * r1
            float r1 = r8.mTransitionDuration
            float r0 = r0 / r1
            goto L2c
        L2b:
            r2 = r1
        L2c:
            android.view.animation.Interpolator r1 = r8.mInterpolator
            boolean r3 = r1 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator
            if (r3 == 0) goto L38
            androidx.constraintlayout.motion.widget.MotionInterpolator r1 = (androidx.constraintlayout.motion.widget.MotionInterpolator) r1
            float r0 = r1.getVelocity()
        L38:
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r1 = r8.mFrameArrayList
            java.lang.Object r1 = r1.get(r9)
            androidx.constraintlayout.motion.widget.MotionController r1 = (androidx.constraintlayout.motion.widget.MotionController) r1
            r3 = r13 & 1
            if (r3 != 0) goto L53
            int r3 = r9.getWidth()
            int r4 = r9.getHeight()
            r5 = r10
            r6 = r11
            r7 = r12
            r1.getPostLayoutDvDp(r2, r3, r4, r5, r6, r7)
            goto L59
        L53:
            r5 = r10
            r6 = r11
            r7 = r12
            r1.getDpDt(r2, r5, r6, r7)
        L59:
            r9 = 2
            if (r13 >= r9) goto L6a
            r9 = 0
            r10 = r7[r9]
            float r10 = r10 * r0
            r7[r9] = r10
            r9 = 1
            r10 = r7[r9]
            float r10 = r10 * r0
            r7[r9] = r10
        L6a:
            return
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
            r1 = this;
            boolean r0 = super.isAttachedToWindow()
            return r0
    }

    public boolean isInteractionEnabled() {
            r1 = this;
            boolean r0 = r1.mInteractionEnabled
            return r0
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int r5) {
            r4 = this;
            if (r5 == 0) goto L47
            androidx.constraintlayout.motion.widget.MotionScene r0 = new androidx.constraintlayout.motion.widget.MotionScene     // Catch: java.lang.Exception -> L3c
            android.content.Context r1 = r4.getContext()     // Catch: java.lang.Exception -> L3c
            r0.<init>(r1, r4, r5)     // Catch: java.lang.Exception -> L3c
            r4.mScene = r0     // Catch: java.lang.Exception -> L3c
            boolean r5 = r4.isAttachedToWindow()     // Catch: java.lang.Exception -> L3c
            if (r5 == 0) goto L3e
            androidx.constraintlayout.motion.widget.MotionScene r5 = r4.mScene     // Catch: java.lang.Exception -> L3c
            r5.readFallback(r4)     // Catch: java.lang.Exception -> L3c
            androidx.constraintlayout.motion.widget.MotionLayout$Model r5 = r4.mModel     // Catch: java.lang.Exception -> L3c
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r4.mLayoutWidget     // Catch: java.lang.Exception -> L3c
            androidx.constraintlayout.motion.widget.MotionScene r1 = r4.mScene     // Catch: java.lang.Exception -> L3c
            int r2 = r4.mBeginState     // Catch: java.lang.Exception -> L3c
            androidx.constraintlayout.widget.ConstraintSet r1 = r1.getConstraintSet(r2)     // Catch: java.lang.Exception -> L3c
            androidx.constraintlayout.motion.widget.MotionScene r2 = r4.mScene     // Catch: java.lang.Exception -> L3c
            int r3 = r4.mEndState     // Catch: java.lang.Exception -> L3c
            androidx.constraintlayout.widget.ConstraintSet r2 = r2.getConstraintSet(r3)     // Catch: java.lang.Exception -> L3c
            r5.initFrom(r0, r1, r2)     // Catch: java.lang.Exception -> L3c
            r4.rebuildScene()     // Catch: java.lang.Exception -> L3c
            androidx.constraintlayout.motion.widget.MotionScene r5 = r4.mScene     // Catch: java.lang.Exception -> L3c
            boolean r0 = r4.isRtl()     // Catch: java.lang.Exception -> L3c
            r5.setRtl(r0)     // Catch: java.lang.Exception -> L3c
            return
        L3c:
            r5 = move-exception
            goto L3f
        L3e:
            return
        L3f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "unable to parse MotionScene file"
            r0.<init>(r1, r5)
            throw r0
        L47:
            r5 = 0
            r4.mScene = r5
            return
    }

    int lookUpConstraintId(java.lang.String r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            int r2 = r0.lookUpConstraintId(r2)
            return r2
    }

    protected androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker obtainVelocityTracker() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$MyTracker r0 = androidx.constraintlayout.motion.widget.MotionLayout.MyTracker.obtain()
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r3 = this;
            super.onAttachedToWindow()
            androidx.constraintlayout.motion.widget.MotionScene r0 = r3.mScene
            if (r0 == 0) goto L1e
            int r1 = r3.mCurrentState
            r2 = -1
            if (r1 == r2) goto L1e
            androidx.constraintlayout.widget.ConstraintSet r0 = r0.getConstraintSet(r1)
            androidx.constraintlayout.motion.widget.MotionScene r1 = r3.mScene
            r1.readFallback(r3)
            if (r0 == 0) goto L1a
            r0.applyTo(r3)
        L1a:
            int r0 = r3.mCurrentState
            r3.mBeginState = r0
        L1e:
            r3.onNewStateAttachHandlers()
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r3.mStateCache
            if (r0 == 0) goto L28
            r0.apply()
        L28:
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r6.mScene
            r1 = 0
            if (r0 == 0) goto L93
            boolean r2 = r6.mInteractionEnabled
            if (r2 != 0) goto Lb
            goto L93
        Lb:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r0.mCurrentTransition
            if (r0 == 0) goto L93
            boolean r2 = r0.isEnabled()
            if (r2 == 0) goto L93
            androidx.constraintlayout.motion.widget.TouchResponse r0 = r0.getTouchResponse()
            if (r0 == 0) goto L93
            int r2 = r7.getAction()
            if (r2 != 0) goto L3b
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            android.graphics.RectF r2 = r0.getTouchRegion(r6, r2)
            if (r2 == 0) goto L3b
            float r3 = r7.getX()
            float r4 = r7.getY()
            boolean r2 = r2.contains(r3, r4)
            if (r2 != 0) goto L3b
            return r1
        L3b:
            int r0 = r0.getTouchRegionId()
            r2 = -1
            if (r0 == r2) goto L93
            android.view.View r2 = r6.mRegionView
            if (r2 == 0) goto L4c
            int r2 = r2.getId()
            if (r2 == r0) goto L52
        L4c:
            android.view.View r0 = r6.findViewById(r0)
            r6.mRegionView = r0
        L52:
            android.view.View r0 = r6.mRegionView
            if (r0 == 0) goto L93
            android.graphics.RectF r2 = r6.mBoundsCheck
            int r0 = r0.getLeft()
            float r0 = (float) r0
            android.view.View r3 = r6.mRegionView
            int r3 = r3.getTop()
            float r3 = (float) r3
            android.view.View r4 = r6.mRegionView
            int r4 = r4.getRight()
            float r4 = (float) r4
            android.view.View r5 = r6.mRegionView
            int r5 = r5.getBottom()
            float r5 = (float) r5
            r2.set(r0, r3, r4, r5)
            android.graphics.RectF r0 = r6.mBoundsCheck
            float r2 = r7.getX()
            float r3 = r7.getY()
            boolean r0 = r0.contains(r2, r3)
            if (r0 == 0) goto L93
            android.view.View r0 = r6.mRegionView
            r2 = 0
            boolean r0 = r6.handlesTouchEvent(r2, r2, r0, r7)
            if (r0 != 0) goto L93
            boolean r7 = r6.onTouchEvent(r7)
            return r7
        L93:
            return r1
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            r0 = 1
            r3.mInLayout = r0
            r1 = 0
            androidx.constraintlayout.motion.widget.MotionScene r2 = r3.mScene     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto L13
            super.onLayout(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lf
            r4 = r3
            r4.mInLayout = r1
            return
        Lf:
            r0 = move-exception
            r4 = r3
        L11:
            r5 = r0
            goto L32
        L13:
            r4 = r3
            int r7 = r7 - r5
            int r8 = r8 - r6
            int r5 = r4.mLastLayoutWidth     // Catch: java.lang.Throwable -> L1f
            if (r5 != r7) goto L21
            int r5 = r4.mLastLayoutHeight     // Catch: java.lang.Throwable -> L1f
            if (r5 == r8) goto L27
            goto L21
        L1f:
            r0 = move-exception
            goto L11
        L21:
            r3.rebuildScene()     // Catch: java.lang.Throwable -> L1f
            r3.evaluate(r0)     // Catch: java.lang.Throwable -> L1f
        L27:
            r4.mLastLayoutWidth = r7     // Catch: java.lang.Throwable -> L1f
            r4.mLastLayoutHeight = r8     // Catch: java.lang.Throwable -> L1f
            r4.mOldWidth = r7     // Catch: java.lang.Throwable -> L1f
            r4.mOldHeight = r8     // Catch: java.lang.Throwable -> L1f
            r4.mInLayout = r1
            return
        L32:
            r4.mInLayout = r1
            throw r5
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int r7, int r8) {
            r6 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r6.mScene
            if (r0 != 0) goto L8
            super.onMeasure(r7, r8)
            return
        L8:
            int r0 = r6.mLastWidthMeasureSpec
            r1 = 0
            r2 = 1
            if (r0 != r7) goto L15
            int r0 = r6.mLastHeightMeasureSpec
            if (r0 == r8) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            boolean r3 = r6.mNeedsFireTransitionCompleted
            if (r3 == 0) goto L23
            r6.mNeedsFireTransitionCompleted = r1
            r6.onNewStateAttachHandlers()
            r6.processTransitionCompleted()
            r0 = 1
        L23:
            boolean r3 = r6.mDirtyHierarchy
            if (r3 == 0) goto L28
            r0 = 1
        L28:
            r6.mLastWidthMeasureSpec = r7
            r6.mLastHeightMeasureSpec = r8
            androidx.constraintlayout.motion.widget.MotionScene r3 = r6.mScene
            int r3 = r3.getStartId()
            androidx.constraintlayout.motion.widget.MotionScene r4 = r6.mScene
            int r4 = r4.getEndId()
            if (r0 != 0) goto L42
            androidx.constraintlayout.motion.widget.MotionLayout$Model r0 = r6.mModel
            boolean r0 = r0.isNotConfiguredWith(r3, r4)
            if (r0 == 0) goto L68
        L42:
            int r0 = r6.mBeginState
            r5 = -1
            if (r0 == r5) goto L68
            super.onMeasure(r7, r8)
            androidx.constraintlayout.motion.widget.MotionLayout$Model r7 = r6.mModel
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r8 = r6.mLayoutWidget
            androidx.constraintlayout.motion.widget.MotionScene r0 = r6.mScene
            androidx.constraintlayout.widget.ConstraintSet r0 = r0.getConstraintSet(r3)
            androidx.constraintlayout.motion.widget.MotionScene r2 = r6.mScene
            androidx.constraintlayout.widget.ConstraintSet r2 = r2.getConstraintSet(r4)
            r7.initFrom(r8, r0, r2)
            androidx.constraintlayout.motion.widget.MotionLayout$Model r7 = r6.mModel
            r7.reEvaluateState()
            androidx.constraintlayout.motion.widget.MotionLayout$Model r7 = r6.mModel
            r7.setMeasuredId(r3, r4)
            goto L69
        L68:
            r1 = 1
        L69:
            boolean r7 = r6.mMeasureDuringTransition
            if (r7 != 0) goto L6f
            if (r1 == 0) goto Lc0
        L6f:
            int r7 = r6.getPaddingTop()
            int r8 = r6.getPaddingBottom()
            int r7 = r7 + r8
            int r8 = r6.getPaddingLeft()
            int r0 = r6.getPaddingRight()
            int r8 = r8 + r0
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r6.mLayoutWidget
            int r0 = r0.getWidth()
            int r0 = r0 + r8
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r8 = r6.mLayoutWidget
            int r8 = r8.getHeight()
            int r8 = r8 + r7
            int r7 = r6.mWidthMeasureMode
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r1) goto L97
            if (r7 != 0) goto La7
        L97:
            int r7 = r6.mStartWrapWidth
            float r0 = (float) r7
            float r2 = r6.mPostInterpolationPosition
            int r3 = r6.mEndWrapWidth
            int r3 = r3 - r7
            float r7 = (float) r3
            float r2 = r2 * r7
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.requestLayout()
        La7:
            int r7 = r6.mHeightMeasureMode
            if (r7 == r1) goto Lad
            if (r7 != 0) goto Lbd
        Lad:
            int r7 = r6.mStartWrapHeight
            float r8 = (float) r7
            float r1 = r6.mPostInterpolationPosition
            int r2 = r6.mEndWrapHeight
            int r2 = r2 - r7
            float r7 = (float) r2
            float r1 = r1 * r7
            float r8 = r8 + r1
            int r8 = (int) r8
            r6.requestLayout()
        Lbd:
            r6.setMeasuredDimension(r0, r8)
        Lc0:
            r6.evaluateLayout()
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(android.view.View r10, int r11, int r12, int[] r13, int r14) {
            r9 = this;
            androidx.constraintlayout.motion.widget.MotionScene r14 = r9.mScene
            if (r14 == 0) goto Lc8
            androidx.constraintlayout.motion.widget.MotionScene$Transition r14 = r14.mCurrentTransition
            if (r14 != 0) goto La
            goto Lc8
        La:
            boolean r14 = r14.isEnabled()
            if (r14 != 0) goto L12
            goto Lc8
        L12:
            androidx.constraintlayout.motion.widget.MotionScene r14 = r9.mScene
            androidx.constraintlayout.motion.widget.MotionScene$Transition r14 = r14.mCurrentTransition
            r0 = -1
            if (r14 == 0) goto L33
            boolean r1 = r14.isEnabled()
            if (r1 == 0) goto L33
            androidx.constraintlayout.motion.widget.TouchResponse r1 = r14.getTouchResponse()
            if (r1 == 0) goto L33
            int r1 = r1.getTouchRegionId()
            if (r1 == r0) goto L33
            int r2 = r10.getId()
            if (r2 == r1) goto L33
            goto Lc8
        L33:
            androidx.constraintlayout.motion.widget.MotionScene r1 = r9.mScene
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r1 == 0) goto L52
            boolean r1 = r1.getMoveWhenScrollAtTop()
            if (r1 == 0) goto L52
            float r1 = r9.mTransitionPosition
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 == 0) goto L4a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L52
        L4a:
            boolean r0 = r10.canScrollVertically(r0)
            if (r0 == 0) goto L52
            goto Lc8
        L52:
            androidx.constraintlayout.motion.widget.TouchResponse r14 = r14.getTouchResponse()
            r0 = 0
            r1 = 1
            if (r14 == 0) goto L8f
            androidx.constraintlayout.motion.widget.MotionScene r14 = r9.mScene
            androidx.constraintlayout.motion.widget.MotionScene$Transition r14 = r14.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r14 = r14.getTouchResponse()
            int r14 = r14.getFlags()
            r14 = r14 & r1
            if (r14 == 0) goto L8f
            androidx.constraintlayout.motion.widget.MotionScene r14 = r9.mScene
            float r4 = (float) r11
            float r5 = (float) r12
            float r14 = r14.getProgressDirection(r4, r5)
            float r4 = r9.mTransitionLastPosition
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 > 0) goto L7b
            int r5 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r5 < 0) goto L83
        L7b:
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto L8f
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 <= 0) goto L8f
        L83:
            r10.setNestedScrollingEnabled(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$1 r11 = new androidx.constraintlayout.motion.widget.MotionLayout$1
            r11.<init>(r9, r10)
            r10.post(r11)
            return
        L8f:
            float r10 = r9.mTransitionPosition
            long r2 = r9.getNanoTime()
            float r14 = (float) r11
            r9.mScrollTargetDX = r14
            float r4 = (float) r12
            r9.mScrollTargetDY = r4
            long r5 = r9.mScrollTargetTime
            long r5 = r2 - r5
            double r5 = (double) r5
            r7 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            double r5 = r5 * r7
            float r5 = (float) r5
            r9.mScrollTargetDT = r5
            r9.mScrollTargetTime = r2
            androidx.constraintlayout.motion.widget.MotionScene r2 = r9.mScene
            r2.processScrollMove(r14, r4)
            float r14 = r9.mTransitionPosition
            int r10 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r10 == 0) goto Lbb
            r13[r0] = r11
            r13[r1] = r12
        Lbb:
            r9.evaluate(r0)
            r10 = r13[r0]
            if (r10 != 0) goto Lc6
            r10 = r13[r1]
            if (r10 == 0) goto Lc8
        Lc6:
            r9.mUndergoingMotion = r1
        Lc8:
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            return
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            boolean r1 = r0.mUndergoingMotion
            r6 = 0
            if (r1 != 0) goto L9
            if (r2 != 0) goto L9
            if (r3 == 0) goto L14
        L9:
            r1 = r7[r6]
            int r1 = r1 + r4
            r7[r6] = r1
            r1 = 1
            r2 = r7[r1]
            int r2 = r2 + r5
            r7[r1] = r2
        L14:
            r0.mUndergoingMotion = r6
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r2 = r1.mScene
            if (r2 == 0) goto Lb
            boolean r0 = r1.isRtl()
            r2.setRtl(r0)
        Lb:
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            androidx.constraintlayout.motion.widget.MotionScene r1 = r0.mScene
            if (r1 == 0) goto L21
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = r1.mCurrentTransition
            if (r1 == 0) goto L21
            androidx.constraintlayout.motion.widget.TouchResponse r1 = r1.getTouchResponse()
            if (r1 == 0) goto L21
            androidx.constraintlayout.motion.widget.MotionScene r1 = r0.mScene
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r1 = r1.getTouchResponse()
            int r1 = r1.getFlags()
            r1 = r1 & 2
            if (r1 == 0) goto L1f
            goto L21
        L1f:
            r1 = 1
            return r1
        L21:
            r1 = 0
            return r1
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(android.view.View r3, int r4) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionScene r3 = r2.mScene
            if (r3 != 0) goto L5
            return
        L5:
            float r4 = r2.mScrollTargetDX
            float r0 = r2.mScrollTargetDT
            float r4 = r4 / r0
            float r1 = r2.mScrollTargetDY
            float r1 = r1 / r0
            r3.processScrollUp(r4, r1)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r2.mScene
            if (r0 == 0) goto L2a
            boolean r1 = r2.mInteractionEnabled
            if (r1 == 0) goto L2a
            boolean r0 = r0.supportTouch()
            if (r0 == 0) goto L2a
            androidx.constraintlayout.motion.widget.MotionScene r0 = r2.mScene
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r0.mCurrentTransition
            if (r0 == 0) goto L1f
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L1f
            boolean r3 = super.onTouchEvent(r3)
            return r3
        L1f:
            androidx.constraintlayout.motion.widget.MotionScene r0 = r2.mScene
            int r1 = r2.getCurrentState()
            r0.processTouchEvent(r3, r1, r2)
            r3 = 1
            return r3
        L2a:
            boolean r3 = super.onTouchEvent(r3)
            return r3
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(android.view.View r2) {
            r1 = this;
            super.onViewAdded(r2)
            boolean r0 = r2 instanceof androidx.constraintlayout.motion.widget.MotionHelper
            if (r0 == 0) goto L45
            androidx.constraintlayout.motion.widget.MotionHelper r2 = (androidx.constraintlayout.motion.widget.MotionHelper) r2
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r1.mTransitionListeners
            if (r0 != 0) goto L14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mTransitionListeners = r0
        L14:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r1.mTransitionListeners
            r0.add(r2)
            boolean r0 = r2.isUsedOnShow()
            if (r0 == 0) goto L2f
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r1.mOnShowHelpers
            if (r0 != 0) goto L2a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOnShowHelpers = r0
        L2a:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r1.mOnShowHelpers
            r0.add(r2)
        L2f:
            boolean r0 = r2.isUseOnHide()
            if (r0 == 0) goto L45
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r1.mOnHideHelpers
            if (r0 != 0) goto L40
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOnHideHelpers = r0
        L40:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r1.mOnHideHelpers
            r0.add(r2)
        L45:
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(android.view.View r2) {
            r1 = this;
            super.onViewRemoved(r2)
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r1.mOnShowHelpers
            if (r0 == 0) goto La
            r0.remove(r2)
        La:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r1.mOnHideHelpers
            if (r0 == 0) goto L11
            r0.remove(r2)
        L11:
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void parseLayoutDescription(int r1) {
            r0 = this;
            r1 = 0
            r0.mConstraintLayoutSpec = r1
            return
    }

    @java.lang.Deprecated
    public void rebuildMotion() {
            r0 = this;
            r0.rebuildScene()
            return
    }

    public void rebuildScene() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$Model r0 = r1.mModel
            r0.reEvaluateState()
            r1.invalidate()
            return
    }

    public boolean removeTransitionListener(androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r1.mTransitionListeners
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = r0.remove(r2)
            return r2
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
            r2 = this;
            boolean r0 = r2.mMeasureDuringTransition
            if (r0 != 0) goto L18
            int r0 = r2.mCurrentState
            r1 = -1
            if (r0 != r1) goto L18
            androidx.constraintlayout.motion.widget.MotionScene r0 = r2.mScene
            if (r0 == 0) goto L18
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r0.mCurrentTransition
            if (r0 == 0) goto L18
            int r0 = r0.getLayoutDuringTransition()
            if (r0 != 0) goto L18
            return
        L18:
            super.requestLayout()
            return
    }

    public void setDebugMode(int r1) {
            r0 = this;
            r0.mDebugPath = r1
            r0.invalidate()
            return
    }

    public void setInteractionEnabled(boolean r1) {
            r0 = this;
            r0.mInteractionEnabled = r1
            return
    }

    public void setInterpolatedProgress(float r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 == 0) goto L19
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r1.setState(r0)
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            android.view.animation.Interpolator r0 = r0.getInterpolator()
            if (r0 == 0) goto L19
            float r2 = r0.getInterpolation(r2)
            r1.setProgress(r2)
            return
        L19:
            r1.setProgress(r2)
            return
    }

    public void setOnHide(float r4) {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r3.mOnHideHelpers
            if (r0 == 0) goto L19
            int r0 = r0.size()
            r1 = 0
        L9:
            if (r1 >= r0) goto L19
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r2 = r3.mOnHideHelpers
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.motion.widget.MotionHelper r2 = (androidx.constraintlayout.motion.widget.MotionHelper) r2
            r2.setProgress(r4)
            int r1 = r1 + 1
            goto L9
        L19:
            return
    }

    public void setOnShow(float r4) {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r3.mOnShowHelpers
            if (r0 == 0) goto L19
            int r0 = r0.size()
            r1 = 0
        L9:
            if (r1 >= r0) goto L19
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r2 = r3.mOnShowHelpers
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.motion.widget.MotionHelper r2 = (androidx.constraintlayout.motion.widget.MotionHelper) r2
            r2.setProgress(r4)
            int r1 = r1 + 1
            goto L9
        L19:
            return
    }

    public void setProgress(float r4) {
            r3 = this;
            boolean r0 = r3.isAttachedToWindow()
            if (r0 != 0) goto L17
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r3.mStateCache
            if (r0 != 0) goto L11
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = new androidx.constraintlayout.motion.widget.MotionLayout$StateCache
            r0.<init>(r3)
            r3.mStateCache = r0
        L11:
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r3.mStateCache
            r0.setProgress(r4)
            return
        L17:
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 > 0) goto L2c
            int r1 = r3.mBeginState
            r3.mCurrentState = r1
            float r1 = r3.mTransitionLastPosition
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L4a
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r3.setState(r0)
            goto L4a
        L2c:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 < 0) goto L42
            int r1 = r3.mEndState
            r3.mCurrentState = r1
            float r1 = r3.mTransitionLastPosition
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L4a
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r3.setState(r0)
            goto L4a
        L42:
            r0 = -1
            r3.mCurrentState = r0
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r3.setState(r0)
        L4a:
            androidx.constraintlayout.motion.widget.MotionScene r0 = r3.mScene
            if (r0 != 0) goto L4f
            return
        L4f:
            r0 = 1
            r3.mTransitionInstantly = r0
            r3.mTransitionGoalPosition = r4
            r3.mTransitionPosition = r4
            r1 = -1
            r3.mTransitionLastTime = r1
            r3.mAnimationStartTime = r1
            r4 = 0
            r3.mInterpolator = r4
            r3.mInTransition = r0
            r3.invalidate()
            return
    }

    public void setProgress(float r2, float r3) {
            r1 = this;
            boolean r0 = r1.isAttachedToWindow()
            if (r0 != 0) goto L1c
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r1.mStateCache
            if (r0 != 0) goto L11
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = new androidx.constraintlayout.motion.widget.MotionLayout$StateCache
            r0.<init>(r1)
            r1.mStateCache = r0
        L11:
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r1.mStateCache
            r0.setProgress(r2)
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r2 = r1.mStateCache
            r2.setVelocity(r3)
            return
        L1c:
            r1.setProgress(r2)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r1.setState(r2)
            r1.mLastVelocity = r3
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.animateTo(r2)
            return
    }

    public void setScene(androidx.constraintlayout.motion.widget.MotionScene r2) {
            r1 = this;
            r1.mScene = r2
            boolean r0 = r1.isRtl()
            r2.setRtl(r0)
            r1.rebuildScene()
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int r2, int r3, int r4) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP
            r1.setState(r0)
            r1.mCurrentState = r2
            r0 = -1
            r1.mBeginState = r0
            r1.mEndState = r0
            androidx.constraintlayout.widget.ConstraintLayoutStates r0 = r1.mConstraintLayoutSpec
            if (r0 == 0) goto L16
            float r3 = (float) r3
            float r4 = (float) r4
            r0.updateConstraints(r2, r3, r4)
            return
        L16:
            androidx.constraintlayout.motion.widget.MotionScene r3 = r1.mScene
            if (r3 == 0) goto L21
            androidx.constraintlayout.widget.ConstraintSet r2 = r3.getConstraintSet(r2)
            r2.applyTo(r1)
        L21:
            return
    }

    void setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState r5) {
            r4 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            if (r5 != r0) goto La
            int r1 = r4.mCurrentState
            r2 = -1
            if (r1 != r2) goto La
            goto L39
        La:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = r4.mTransitionState
            r4.mTransitionState = r5
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            if (r1 != r2) goto L17
            if (r5 != r2) goto L17
            r4.fireTransitionChange()
        L17:
            int[] r3 = androidx.constraintlayout.motion.widget.MotionLayout.AnonymousClass2.$SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState
            int r1 = r1.ordinal()
            r1 = r3[r1]
            r3 = 1
            if (r1 == r3) goto L2f
            r3 = 2
            if (r1 == r3) goto L2f
            r2 = 3
            if (r1 == r2) goto L29
            goto L39
        L29:
            if (r5 != r0) goto L39
            r4.fireTransitionCompleted()
            return
        L2f:
            if (r5 != r2) goto L34
            r4.fireTransitionChange()
        L34:
            if (r5 != r0) goto L39
            r4.fireTransitionCompleted()
        L39:
            return
    }

    public void setTransition(int r7) {
            r6 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r6.mScene
            if (r0 == 0) goto L7f
            androidx.constraintlayout.motion.widget.MotionScene$Transition r7 = r6.getTransition(r7)
            int r0 = r7.getStartConstraintSetId()
            r6.mBeginState = r0
            int r0 = r7.getEndConstraintSetId()
            r6.mEndState = r0
            boolean r0 = r6.isAttachedToWindow()
            if (r0 != 0) goto L34
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r7 = r6.mStateCache
            if (r7 != 0) goto L25
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r7 = new androidx.constraintlayout.motion.widget.MotionLayout$StateCache
            r7.<init>(r6)
            r6.mStateCache = r7
        L25:
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r7 = r6.mStateCache
            int r0 = r6.mBeginState
            r7.setStartState(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r7 = r6.mStateCache
            int r0 = r6.mEndState
            r7.setEndState(r0)
            return
        L34:
            int r0 = r6.mCurrentState
            int r1 = r6.mBeginState
            r2 = 0
            if (r0 != r1) goto L3d
            r0 = 0
            goto L46
        L3d:
            int r1 = r6.mEndState
            if (r0 != r1) goto L44
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L46
        L44:
            r0 = 2143289344(0x7fc00000, float:NaN)
        L46:
            androidx.constraintlayout.motion.widget.MotionScene r1 = r6.mScene
            r1.setTransition(r7)
            androidx.constraintlayout.motion.widget.MotionLayout$Model r7 = r6.mModel
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = r6.mLayoutWidget
            androidx.constraintlayout.motion.widget.MotionScene r3 = r6.mScene
            int r4 = r6.mBeginState
            androidx.constraintlayout.widget.ConstraintSet r3 = r3.getConstraintSet(r4)
            androidx.constraintlayout.motion.widget.MotionScene r4 = r6.mScene
            int r5 = r6.mEndState
            androidx.constraintlayout.widget.ConstraintSet r4 = r4.getConstraintSet(r5)
            r7.initFrom(r1, r3, r4)
            r6.rebuildScene()
            boolean r7 = java.lang.Float.isNaN(r0)
            if (r7 == 0) goto L6c
            goto L6d
        L6c:
            r2 = r0
        L6d:
            r6.mTransitionLastPosition = r2
            boolean r7 = java.lang.Float.isNaN(r0)
            if (r7 == 0) goto L7c
            androidx.constraintlayout.motion.widget.Debug.getLocation()
            r6.transitionToStart()
            return
        L7c:
            r6.setProgress(r0)
        L7f:
            return
    }

    public void setTransition(int r4, int r5) {
            r3 = this;
            boolean r0 = r3.isAttachedToWindow()
            if (r0 != 0) goto L1c
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r3.mStateCache
            if (r0 != 0) goto L11
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = new androidx.constraintlayout.motion.widget.MotionLayout$StateCache
            r0.<init>(r3)
            r3.mStateCache = r0
        L11:
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r3.mStateCache
            r0.setStartState(r4)
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r4 = r3.mStateCache
            r4.setEndState(r5)
            return
        L1c:
            androidx.constraintlayout.motion.widget.MotionScene r0 = r3.mScene
            if (r0 == 0) goto L43
            r3.mBeginState = r4
            r3.mEndState = r5
            r0.setTransition(r4, r5)
            androidx.constraintlayout.motion.widget.MotionLayout$Model r0 = r3.mModel
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = r3.mLayoutWidget
            androidx.constraintlayout.motion.widget.MotionScene r2 = r3.mScene
            androidx.constraintlayout.widget.ConstraintSet r4 = r2.getConstraintSet(r4)
            androidx.constraintlayout.motion.widget.MotionScene r2 = r3.mScene
            androidx.constraintlayout.widget.ConstraintSet r5 = r2.getConstraintSet(r5)
            r0.initFrom(r1, r4, r5)
            r3.rebuildScene()
            r4 = 0
            r3.mTransitionLastPosition = r4
            r3.transitionToStart()
        L43:
            return
    }

    protected void setTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition r5) {
            r4 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r4.mScene
            r0.setTransition(r5)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP
            r4.setState(r0)
            int r0 = r4.mCurrentState
            androidx.constraintlayout.motion.widget.MotionScene r1 = r4.mScene
            int r1 = r1.getEndId()
            if (r0 != r1) goto L1d
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.mTransitionLastPosition = r0
            r4.mTransitionPosition = r0
            r4.mTransitionGoalPosition = r0
            goto L24
        L1d:
            r0 = 0
            r4.mTransitionLastPosition = r0
            r4.mTransitionPosition = r0
            r4.mTransitionGoalPosition = r0
        L24:
            r0 = 1
            boolean r5 = r5.isTransitionFlag(r0)
            if (r5 == 0) goto L2e
            r0 = -1
            goto L32
        L2e:
            long r0 = r4.getNanoTime()
        L32:
            r4.mTransitionLastTime = r0
            androidx.constraintlayout.motion.widget.MotionScene r5 = r4.mScene
            int r5 = r5.getStartId()
            androidx.constraintlayout.motion.widget.MotionScene r0 = r4.mScene
            int r0 = r0.getEndId()
            int r1 = r4.mBeginState
            if (r5 != r1) goto L49
            int r1 = r4.mEndState
            if (r0 != r1) goto L49
            return
        L49:
            r4.mBeginState = r5
            r4.mEndState = r0
            androidx.constraintlayout.motion.widget.MotionScene r1 = r4.mScene
            r1.setTransition(r5, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$Model r5 = r4.mModel
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = r4.mLayoutWidget
            androidx.constraintlayout.motion.widget.MotionScene r1 = r4.mScene
            int r2 = r4.mBeginState
            androidx.constraintlayout.widget.ConstraintSet r1 = r1.getConstraintSet(r2)
            androidx.constraintlayout.motion.widget.MotionScene r2 = r4.mScene
            int r3 = r4.mEndState
            androidx.constraintlayout.widget.ConstraintSet r2 = r2.getConstraintSet(r3)
            r5.initFrom(r0, r1, r2)
            androidx.constraintlayout.motion.widget.MotionLayout$Model r5 = r4.mModel
            int r0 = r4.mBeginState
            int r1 = r4.mEndState
            r5.setMeasuredId(r0, r1)
            androidx.constraintlayout.motion.widget.MotionLayout$Model r5 = r4.mModel
            r5.reEvaluateState()
            r4.rebuildScene()
            return
    }

    public void setTransitionDuration(int r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 != 0) goto L5
            return
        L5:
            r0.setDuration(r2)
            return
    }

    public void setTransitionListener(androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener r1) {
            r0 = this;
            r0.mTransitionListener = r1
            return
    }

    public void setTransitionState(android.os.Bundle r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r1.mStateCache
            if (r0 != 0) goto Lb
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = new androidx.constraintlayout.motion.widget.MotionLayout$StateCache
            r0.<init>(r1)
            r1.mStateCache = r0
        Lb:
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r1.mStateCache
            r0.setTransitionState(r2)
            boolean r2 = r1.isAttachedToWindow()
            if (r2 == 0) goto L1b
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r2 = r1.mStateCache
            r2.apply()
        L1b:
            return
    }

    @Override // android.view.View
    public java.lang.String toString() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r3.mBeginState
            java.lang.String r2 = androidx.constraintlayout.motion.widget.Debug.getName(r0, r2)
            r1.append(r2)
            java.lang.String r2 = "->"
            r1.append(r2)
            int r2 = r3.mEndState
            java.lang.String r0 = androidx.constraintlayout.motion.widget.Debug.getName(r0, r2)
            r1.append(r0)
            java.lang.String r0 = " (pos:"
            r1.append(r0)
            float r0 = r3.mTransitionLastPosition
            r1.append(r0)
            java.lang.String r0 = " Dpos/Dt:"
            r1.append(r0)
            float r0 = r3.mLastVelocity
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public void touchAnimateTo(int r11, float r12, float r13) {
            r10 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r10.mScene
            if (r0 != 0) goto L5
            goto Lb
        L5:
            float r0 = r10.mTransitionLastPosition
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 != 0) goto Lc
        Lb:
            return
        Lc:
            r0 = 1
            r10.mTemporalInterpolator = r0
            long r1 = r10.getNanoTime()
            r10.mAnimationStartTime = r1
            androidx.constraintlayout.motion.widget.MotionScene r1 = r10.mScene
            int r1 = r1.getDuration()
            float r1 = (float) r1
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r1 / r2
            r10.mTransitionDuration = r7
            r10.mTransitionGoalPosition = r12
            r10.mInTransition = r0
            r1 = 0
            r2 = 2
            if (r11 == 0) goto L8d
            if (r11 == r0) goto L8d
            if (r11 == r2) goto L8d
            r0 = 4
            if (r11 == r0) goto L7a
            r0 = 5
            if (r11 == r0) goto L36
            goto Lb8
        L36:
            float r11 = r10.mTransitionLastPosition
            androidx.constraintlayout.motion.widget.MotionScene r0 = r10.mScene
            float r0 = r0.getMaxAcceleration()
            boolean r11 = willJump(r13, r11, r0)
            if (r11 == 0) goto L56
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r11 = r10.mDecelerateLogic
            float r12 = r10.mTransitionLastPosition
            androidx.constraintlayout.motion.widget.MotionScene r0 = r10.mScene
            float r0 = r0.getMaxAcceleration()
            r11.config(r13, r12, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r11 = r10.mDecelerateLogic
            r10.mInterpolator = r11
            goto Lb8
        L56:
            androidx.constraintlayout.motion.utils.StopLogic r2 = r10.mStopLogic
            float r3 = r10.mTransitionLastPosition
            float r6 = r10.mTransitionDuration
            androidx.constraintlayout.motion.widget.MotionScene r11 = r10.mScene
            float r7 = r11.getMaxAcceleration()
            androidx.constraintlayout.motion.widget.MotionScene r11 = r10.mScene
            float r8 = r11.getMaxVelocity()
            r4 = r12
            r5 = r13
            r2.config(r3, r4, r5, r6, r7, r8)
            r10.mLastVelocity = r1
            int r11 = r10.mCurrentState
            r10.mTransitionGoalPosition = r4
            r10.mCurrentState = r11
            androidx.constraintlayout.motion.utils.StopLogic r11 = r10.mStopLogic
            r10.mInterpolator = r11
            goto Lb8
        L7a:
            r5 = r13
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r11 = r10.mDecelerateLogic
            float r12 = r10.mTransitionLastPosition
            androidx.constraintlayout.motion.widget.MotionScene r13 = r10.mScene
            float r13 = r13.getMaxAcceleration()
            r11.config(r5, r12, r13)
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r11 = r10.mDecelerateLogic
            r10.mInterpolator = r11
            goto Lb8
        L8d:
            r4 = r12
            r5 = r13
            if (r11 != r0) goto L93
            r12 = 0
            goto L99
        L93:
            if (r11 != r2) goto L98
            r12 = 1065353216(0x3f800000, float:1.0)
            goto L99
        L98:
            r12 = r4
        L99:
            androidx.constraintlayout.motion.utils.StopLogic r3 = r10.mStopLogic
            float r4 = r10.mTransitionLastPosition
            androidx.constraintlayout.motion.widget.MotionScene r11 = r10.mScene
            float r8 = r11.getMaxAcceleration()
            androidx.constraintlayout.motion.widget.MotionScene r11 = r10.mScene
            float r9 = r11.getMaxVelocity()
            r6 = r5
            r5 = r12
            r3.config(r4, r5, r6, r7, r8, r9)
            int r11 = r10.mCurrentState
            r10.mTransitionGoalPosition = r5
            r10.mCurrentState = r11
            androidx.constraintlayout.motion.utils.StopLogic r11 = r10.mStopLogic
            r10.mInterpolator = r11
        Lb8:
            r11 = 0
            r10.mTransitionInstantly = r11
            long r11 = r10.getNanoTime()
            r10.mAnimationStartTime = r11
            r10.invalidate()
            return
    }

    public void transitionToEnd() {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.animateTo(r0)
            return
    }

    public void transitionToStart() {
            r1 = this;
            r0 = 0
            r1.animateTo(r0)
            return
    }

    public void transitionToState(int r2) {
            r1 = this;
            boolean r0 = r1.isAttachedToWindow()
            if (r0 != 0) goto L17
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r1.mStateCache
            if (r0 != 0) goto L11
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = new androidx.constraintlayout.motion.widget.MotionLayout$StateCache
            r0.<init>(r1)
            r1.mStateCache = r0
        L11:
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r1.mStateCache
            r0.setEndState(r2)
            return
        L17:
            r0 = -1
            r1.transitionToState(r2, r0, r0)
            return
    }

    public void transitionToState(int r11, int r12, int r13) {
            r10 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r10.mScene
            r1 = -1
            if (r0 == 0) goto L14
            androidx.constraintlayout.widget.StateSet r0 = r0.mStateSet
            if (r0 == 0) goto L14
            int r2 = r10.mCurrentState
            float r12 = (float) r12
            float r13 = (float) r13
            int r12 = r0.convertToConstraintSet(r2, r11, r12, r13)
            if (r12 == r1) goto L14
            r11 = r12
        L14:
            int r12 = r10.mCurrentState
            if (r12 != r11) goto L19
            return
        L19:
            int r13 = r10.mBeginState
            r0 = 0
            if (r13 != r11) goto L22
            r10.animateTo(r0)
            return
        L22:
            int r13 = r10.mEndState
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r13 != r11) goto L2c
            r10.animateTo(r2)
            return
        L2c:
            r10.mEndState = r11
            if (r12 == r1) goto L3c
            r10.setTransition(r12, r11)
            r10.animateTo(r2)
            r10.mTransitionLastPosition = r0
            r10.transitionToEnd()
            return
        L3c:
            r12 = 0
            r10.mTemporalInterpolator = r12
            r10.mTransitionGoalPosition = r2
            r10.mTransitionPosition = r0
            r10.mTransitionLastPosition = r0
            long r3 = r10.getNanoTime()
            r10.mTransitionLastTime = r3
            long r3 = r10.getNanoTime()
            r10.mAnimationStartTime = r3
            r10.mTransitionInstantly = r12
            r13 = 0
            r10.mInterpolator = r13
            androidx.constraintlayout.motion.widget.MotionScene r3 = r10.mScene
            int r3 = r3.getDuration()
            float r3 = (float) r3
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r4
            r10.mTransitionDuration = r3
            r10.mBeginState = r1
            androidx.constraintlayout.motion.widget.MotionScene r3 = r10.mScene
            int r4 = r10.mEndState
            r3.setTransition(r1, r4)
            androidx.constraintlayout.motion.widget.MotionScene r1 = r10.mScene
            r1.getStartId()
            int r1 = r10.getChildCount()
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r3 = r10.mFrameArrayList
            r3.clear()
            r3 = 0
        L7a:
            if (r3 >= r1) goto L8d
            android.view.View r4 = r10.getChildAt(r3)
            androidx.constraintlayout.motion.widget.MotionController r5 = new androidx.constraintlayout.motion.widget.MotionController
            r5.<init>(r4)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r6 = r10.mFrameArrayList
            r6.put(r4, r5)
            int r3 = r3 + 1
            goto L7a
        L8d:
            r3 = 1
            r10.mInTransition = r3
            androidx.constraintlayout.motion.widget.MotionLayout$Model r4 = r10.mModel
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r10.mLayoutWidget
            androidx.constraintlayout.motion.widget.MotionScene r6 = r10.mScene
            androidx.constraintlayout.widget.ConstraintSet r11 = r6.getConstraintSet(r11)
            r4.initFrom(r5, r13, r11)
            r10.rebuildScene()
            androidx.constraintlayout.motion.widget.MotionLayout$Model r11 = r10.mModel
            r11.build()
            r10.computeCurrentPositions()
            int r5 = r10.getWidth()
            int r6 = r10.getHeight()
            r11 = 0
        Lb1:
            if (r11 >= r1) goto Ld1
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r13 = r10.mFrameArrayList
            android.view.View r4 = r10.getChildAt(r11)
            java.lang.Object r13 = r13.get(r4)
            r4 = r13
            androidx.constraintlayout.motion.widget.MotionController r4 = (androidx.constraintlayout.motion.widget.MotionController) r4
            androidx.constraintlayout.motion.widget.MotionScene r13 = r10.mScene
            r13.getKeyFrames(r4)
            float r7 = r10.mTransitionDuration
            long r8 = r10.getNanoTime()
            r4.setup(r5, r6, r7, r8)
            int r11 = r11 + 1
            goto Lb1
        Ld1:
            androidx.constraintlayout.motion.widget.MotionScene r11 = r10.mScene
            float r11 = r11.getStaggered()
            int r13 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r13 == 0) goto L12e
            r13 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r4 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r5 = 0
        Le2:
            if (r5 >= r1) goto L104
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r6 = r10.mFrameArrayList
            android.view.View r7 = r10.getChildAt(r5)
            java.lang.Object r6 = r6.get(r7)
            androidx.constraintlayout.motion.widget.MotionController r6 = (androidx.constraintlayout.motion.widget.MotionController) r6
            float r7 = r6.getFinalX()
            float r6 = r6.getFinalY()
            float r6 = r6 + r7
            float r13 = java.lang.Math.min(r13, r6)
            float r4 = java.lang.Math.max(r4, r6)
            int r5 = r5 + 1
            goto Le2
        L104:
            if (r12 >= r1) goto L12e
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r5 = r10.mFrameArrayList
            android.view.View r6 = r10.getChildAt(r12)
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.motion.widget.MotionController r5 = (androidx.constraintlayout.motion.widget.MotionController) r5
            float r6 = r5.getFinalX()
            float r7 = r5.getFinalY()
            float r8 = r2 - r11
            float r8 = r2 / r8
            r5.mStaggerScale = r8
            float r6 = r6 + r7
            float r6 = r6 - r13
            float r6 = r6 * r11
            float r7 = r4 - r13
            float r6 = r6 / r7
            float r6 = r11 - r6
            r5.mStaggerOffset = r6
            int r12 = r12 + 1
            goto L104
        L12e:
            r10.mTransitionPosition = r0
            r10.mTransitionLastPosition = r0
            r10.mInTransition = r3
            r10.invalidate()
            return
    }

    public void updateState() {
            r5 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$Model r0 = r5.mModel
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = r5.mLayoutWidget
            androidx.constraintlayout.motion.widget.MotionScene r2 = r5.mScene
            int r3 = r5.mBeginState
            androidx.constraintlayout.widget.ConstraintSet r2 = r2.getConstraintSet(r3)
            androidx.constraintlayout.motion.widget.MotionScene r3 = r5.mScene
            int r4 = r5.mEndState
            androidx.constraintlayout.widget.ConstraintSet r3 = r3.getConstraintSet(r4)
            r0.initFrom(r1, r2, r3)
            r5.rebuildScene()
            return
    }

    public void updateState(int r2, androidx.constraintlayout.widget.ConstraintSet r3) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 == 0) goto L7
            r0.setConstraintSet(r2, r3)
        L7:
            r1.updateState()
            int r0 = r1.mCurrentState
            if (r0 != r2) goto L11
            r3.applyTo(r1)
        L11:
            return
    }
}
