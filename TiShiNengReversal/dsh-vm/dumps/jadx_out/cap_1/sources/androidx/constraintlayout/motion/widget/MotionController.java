package androidx.constraintlayout.motion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class MotionController {
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    private static final java.lang.String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    private int MAX_DIMENSION;
    java.lang.String[] attributeTable;
    private androidx.constraintlayout.motion.utils.CurveFit mArcSpline;
    private int[] mAttributeInterpCount;
    private java.lang.String[] mAttributeNames;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> mAttributesMap;
    java.lang.String mConstraintTag;
    private int mCurveFitType;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> mCycleMap;
    private androidx.constraintlayout.motion.widget.MotionPaths mEndMotionPath;
    private androidx.constraintlayout.motion.widget.MotionConstrainedPoint mEndPoint;
    int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> mKeyList;
    private androidx.constraintlayout.motion.widget.KeyTrigger[] mKeyTriggers;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> mMotionPaths;
    float mMotionStagger;
    private int mPathMotionArc;
    private androidx.constraintlayout.motion.utils.CurveFit[] mSpline;
    float mStaggerOffset;
    float mStaggerScale;
    private androidx.constraintlayout.motion.widget.MotionPaths mStartMotionPath;
    private androidx.constraintlayout.motion.widget.MotionConstrainedPoint mStartPoint;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> mTimeCycleAttributesMap;
    private float[] mValuesBuff;
    private float[] mVelocity;
    android.view.View mView;

    MotionController(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mCurveFitType = r0
            androidx.constraintlayout.motion.widget.MotionPaths r0 = new androidx.constraintlayout.motion.widget.MotionPaths
            r0.<init>()
            r1.mStartMotionPath = r0
            androidx.constraintlayout.motion.widget.MotionPaths r0 = new androidx.constraintlayout.motion.widget.MotionPaths
            r0.<init>()
            r1.mEndMotionPath = r0
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r0 = new androidx.constraintlayout.motion.widget.MotionConstrainedPoint
            r0.<init>()
            r1.mStartPoint = r0
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r0 = new androidx.constraintlayout.motion.widget.MotionConstrainedPoint
            r0.<init>()
            r1.mEndPoint = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.mMotionStagger = r0
            r0 = 0
            r1.mStaggerOffset = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.mStaggerScale = r0
            r0 = 4
            r1.MAX_DIMENSION = r0
            float[] r0 = new float[r0]
            r1.mValuesBuff = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mMotionPaths = r0
            r0 = 1
            float[] r0 = new float[r0]
            r1.mVelocity = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mKeyList = r0
            int r0 = androidx.constraintlayout.motion.widget.Key.UNSET
            r1.mPathMotionArc = r0
            r1.setView(r2)
            return
    }

    private float getAdjustedPosition(float r11, float[] r12) {
            r10 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            if (r12 == 0) goto L9
            r12[r2] = r1
            goto L25
        L9:
            float r3 = r10.mStaggerScale
            double r4 = (double) r3
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L25
            float r4 = r10.mStaggerOffset
            int r5 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r5 >= 0) goto L19
            r11 = 0
        L19:
            int r5 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r5 <= 0) goto L25
            double r8 = (double) r11
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L25
            float r11 = r11 - r4
            float r11 = r11 * r3
        L25:
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r10.mStartMotionPath
            androidx.constraintlayout.motion.utils.Easing r3 = r3.mKeyFrameEasing
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r4 = r10.mMotionPaths
            java.util.Iterator r4 = r4.iterator()
            r5 = 2143289344(0x7fc00000, float:NaN)
        L31:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L53
            java.lang.Object r6 = r4.next()
            androidx.constraintlayout.motion.widget.MotionPaths r6 = (androidx.constraintlayout.motion.widget.MotionPaths) r6
            androidx.constraintlayout.motion.utils.Easing r7 = r6.mKeyFrameEasing
            if (r7 == 0) goto L31
            float r8 = r6.time
            int r9 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r9 >= 0) goto L4a
            r3 = r7
            r0 = r8
            goto L31
        L4a:
            boolean r7 = java.lang.Float.isNaN(r5)
            if (r7 == 0) goto L31
            float r5 = r6.time
            goto L31
        L53:
            if (r3 == 0) goto L72
            boolean r4 = java.lang.Float.isNaN(r5)
            if (r4 == 0) goto L5c
            goto L5d
        L5c:
            r1 = r5
        L5d:
            float r11 = r11 - r0
            float r1 = r1 - r0
            float r11 = r11 / r1
            double r4 = (double) r11
            double r6 = r3.get(r4)
            float r11 = (float) r6
            float r11 = r11 * r1
            float r11 = r11 + r0
            if (r12 == 0) goto L72
            double r0 = r3.getDiff(r4)
            float r0 = (float) r0
            r12[r2] = r0
        L72:
            return r11
    }

    private float getPreCycleDistance() {
            r21 = this;
            r0 = r21
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 99
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r3 / r2
            r5 = 0
            r8 = r5
            r10 = 0
            r11 = 0
        L11:
            r12 = 100
            if (r10 >= r12) goto La6
            float r12 = (float) r10
            float r12 = r12 * r2
            double r13 = (double) r12
            androidx.constraintlayout.motion.widget.MotionPaths r15 = r0.mStartMotionPath
            androidx.constraintlayout.motion.utils.Easing r15 = r15.mKeyFrameEasing
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r3 = r0.mMotionPaths
            java.util.Iterator r3 = r3.iterator()
            r16 = 2143289344(0x7fc00000, float:NaN)
            r17 = 0
        L27:
            boolean r18 = r3.hasNext()
            if (r18 == 0) goto L54
            java.lang.Object r18 = r3.next()
            r4 = r18
            androidx.constraintlayout.motion.widget.MotionPaths r4 = (androidx.constraintlayout.motion.widget.MotionPaths) r4
            r18 = 0
            androidx.constraintlayout.motion.utils.Easing r7 = r4.mKeyFrameEasing
            r19 = r2
            if (r7 == 0) goto L51
            float r2 = r4.time
            int r20 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r20 >= 0) goto L47
            r17 = r2
            r15 = r7
            goto L51
        L47:
            boolean r2 = java.lang.Float.isNaN(r16)
            if (r2 == 0) goto L51
            float r2 = r4.time
            r16 = r2
        L51:
            r2 = r19
            goto L27
        L54:
            r19 = r2
            r18 = 0
            if (r15 == 0) goto L73
            boolean r2 = java.lang.Float.isNaN(r16)
            if (r2 == 0) goto L62
            r16 = 1065353216(0x3f800000, float:1.0)
        L62:
            float r12 = r12 - r17
            float r16 = r16 - r17
            float r12 = r12 / r16
            double r2 = (double) r12
            double r2 = r15.get(r2)
            float r2 = (float) r2
            float r2 = r2 * r16
            float r2 = r2 + r17
            double r13 = (double) r2
        L73:
            androidx.constraintlayout.motion.utils.CurveFit[] r2 = r0.mSpline
            r2 = r2[r18]
            double[] r3 = r0.mInterpolateData
            r2.getPos(r13, r3)
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r0.mStartMotionPath
            int[] r3 = r0.mInterpolateVariables
            double[] r4 = r0.mInterpolateData
            r7 = 0
            r2.getCenter(r3, r4, r1, r7)
            r2 = 1
            if (r10 <= 0) goto L98
            double r3 = (double) r11
            r11 = r1[r2]
            double r11 = (double) r11
            double r8 = r8 - r11
            r11 = r1[r7]
            double r11 = (double) r11
            double r5 = r5 - r11
            double r5 = java.lang.Math.hypot(r8, r5)
            double r3 = r3 + r5
            float r11 = (float) r3
        L98:
            r3 = r1[r7]
            double r5 = (double) r3
            r2 = r1[r2]
            double r8 = (double) r2
            int r10 = r10 + 1
            r2 = r19
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L11
        La6:
            return r11
    }

    private void insertKey(androidx.constraintlayout.motion.widget.MotionPaths r3) {
            r2 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r0 = r2.mMotionPaths
            int r0 = java.util.Collections.binarySearch(r0, r3)
            if (r0 != 0) goto La
            float r1 = r3.position
        La:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r1 = r2.mMotionPaths
            int r0 = -r0
            int r0 = r0 + (-1)
            r1.add(r0, r3)
            return
    }

    private void readView(androidx.constraintlayout.motion.widget.MotionPaths r5) {
            r4 = this;
            android.view.View r0 = r4.mView
            float r0 = r0.getX()
            int r0 = (int) r0
            float r0 = (float) r0
            android.view.View r1 = r4.mView
            float r1 = r1.getY()
            int r1 = (int) r1
            float r1 = (float) r1
            android.view.View r2 = r4.mView
            int r2 = r2.getWidth()
            float r2 = (float) r2
            android.view.View r3 = r4.mView
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r5.setBounds(r0, r1, r2, r3)
            return
    }

    void addKey(androidx.constraintlayout.motion.widget.Key r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r0 = r1.mKeyList
            r0.add(r2)
            return
    }

    void addKeys(java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r0 = r1.mKeyList
            r0.addAll(r2)
            return
    }

    void buildBounds(float[] r18, int r19) {
            r17 = this;
            r0 = r17
            r1 = r19
            int r2 = r1 + (-1)
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r3 / r2
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r4 = r0.mAttributesMap
            java.lang.String r5 = "translationX"
            if (r4 != 0) goto L12
            goto L18
        L12:
            java.lang.Object r4 = r4.get(r5)
            androidx.constraintlayout.motion.widget.SplineSet r4 = (androidx.constraintlayout.motion.widget.SplineSet) r4
        L18:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r4 = r0.mAttributesMap
            java.lang.String r6 = "translationY"
            if (r4 != 0) goto L1f
            goto L25
        L1f:
            java.lang.Object r4 = r4.get(r6)
            androidx.constraintlayout.motion.widget.SplineSet r4 = (androidx.constraintlayout.motion.widget.SplineSet) r4
        L25:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> r4 = r0.mCycleMap
            if (r4 != 0) goto L2a
            goto L30
        L2a:
            java.lang.Object r4 = r4.get(r5)
            androidx.constraintlayout.motion.widget.KeyCycleOscillator r4 = (androidx.constraintlayout.motion.widget.KeyCycleOscillator) r4
        L30:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> r4 = r0.mCycleMap
            if (r4 != 0) goto L35
            goto L3b
        L35:
            java.lang.Object r4 = r4.get(r6)
            androidx.constraintlayout.motion.widget.KeyCycleOscillator r4 = (androidx.constraintlayout.motion.widget.KeyCycleOscillator) r4
        L3b:
            r4 = 0
            r5 = 0
        L3d:
            if (r5 >= r1) goto Lca
            float r6 = (float) r5
            float r6 = r6 * r2
            float r7 = r0.mStaggerScale
            r8 = 0
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 == 0) goto L5e
            float r9 = r0.mStaggerOffset
            int r10 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r10 >= 0) goto L50
            r6 = 0
        L50:
            int r10 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r10 <= 0) goto L5e
            double r10 = (double) r6
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L5e
            float r6 = r6 - r9
            float r6 = r6 * r7
        L5e:
            double r9 = (double) r6
            androidx.constraintlayout.motion.widget.MotionPaths r7 = r0.mStartMotionPath
            androidx.constraintlayout.motion.utils.Easing r7 = r7.mKeyFrameEasing
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r11 = r0.mMotionPaths
            java.util.Iterator r11 = r11.iterator()
            r12 = 2143289344(0x7fc00000, float:NaN)
        L6b:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L8d
            java.lang.Object r13 = r11.next()
            androidx.constraintlayout.motion.widget.MotionPaths r13 = (androidx.constraintlayout.motion.widget.MotionPaths) r13
            androidx.constraintlayout.motion.utils.Easing r14 = r13.mKeyFrameEasing
            if (r14 == 0) goto L6b
            float r15 = r13.time
            int r16 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r16 >= 0) goto L84
            r7 = r14
            r8 = r15
            goto L6b
        L84:
            boolean r14 = java.lang.Float.isNaN(r12)
            if (r14 == 0) goto L6b
            float r12 = r13.time
            goto L6b
        L8d:
            if (r7 == 0) goto La4
            boolean r9 = java.lang.Float.isNaN(r12)
            if (r9 == 0) goto L97
            r12 = 1065353216(0x3f800000, float:1.0)
        L97:
            float r6 = r6 - r8
            float r12 = r12 - r8
            float r6 = r6 / r12
            double r9 = (double) r6
            double r6 = r7.get(r9)
            float r6 = (float) r6
            float r6 = r6 * r12
            float r6 = r6 + r8
            double r9 = (double) r6
        La4:
            androidx.constraintlayout.motion.utils.CurveFit[] r6 = r0.mSpline
            r6 = r6[r4]
            double[] r7 = r0.mInterpolateData
            r6.getPos(r9, r7)
            androidx.constraintlayout.motion.utils.CurveFit r6 = r0.mArcSpline
            if (r6 == 0) goto Lb9
            double[] r7 = r0.mInterpolateData
            int r8 = r7.length
            if (r8 <= 0) goto Lb9
            r6.getPos(r9, r7)
        Lb9:
            androidx.constraintlayout.motion.widget.MotionPaths r6 = r0.mStartMotionPath
            int[] r7 = r0.mInterpolateVariables
            double[] r8 = r0.mInterpolateData
            int r9 = r5 * 2
            r10 = r18
            r6.getBounds(r7, r8, r10, r9)
            int r5 = r5 + 1
            goto L3d
        Lca:
            return
    }

    int buildKeyBounds(float[] r8, int[] r9) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L49
            androidx.constraintlayout.motion.utils.CurveFit[] r1 = r7.mSpline
            r1 = r1[r0]
            double[] r1 = r1.getTimePoints()
            if (r9 == 0) goto L28
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r2 = r7.mMotionPaths
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L14:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L28
            java.lang.Object r4 = r2.next()
            androidx.constraintlayout.motion.widget.MotionPaths r4 = (androidx.constraintlayout.motion.widget.MotionPaths) r4
            int r5 = r3 + 1
            int r4 = r4.mMode
            r9[r3] = r4
            r3 = r5
            goto L14
        L28:
            r9 = 0
            r2 = 0
        L2a:
            int r3 = r1.length
            if (r9 >= r3) goto L46
            androidx.constraintlayout.motion.utils.CurveFit[] r3 = r7.mSpline
            r3 = r3[r0]
            r4 = r1[r9]
            double[] r6 = r7.mInterpolateData
            r3.getPos(r4, r6)
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r7.mStartMotionPath
            int[] r4 = r7.mInterpolateVariables
            double[] r5 = r7.mInterpolateData
            r3.getBounds(r4, r5, r8, r2)
            int r2 = r2 + 2
            int r9 = r9 + 1
            goto L2a
        L46:
            int r2 = r2 / 2
            return r2
        L49:
            return r0
    }

    int buildKeyFrames(float[] r8, int[] r9) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L49
            androidx.constraintlayout.motion.utils.CurveFit[] r1 = r7.mSpline
            r1 = r1[r0]
            double[] r1 = r1.getTimePoints()
            if (r9 == 0) goto L28
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r2 = r7.mMotionPaths
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L14:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L28
            java.lang.Object r4 = r2.next()
            androidx.constraintlayout.motion.widget.MotionPaths r4 = (androidx.constraintlayout.motion.widget.MotionPaths) r4
            int r5 = r3 + 1
            int r4 = r4.mMode
            r9[r3] = r4
            r3 = r5
            goto L14
        L28:
            r9 = 0
            r2 = 0
        L2a:
            int r3 = r1.length
            if (r9 >= r3) goto L46
            androidx.constraintlayout.motion.utils.CurveFit[] r3 = r7.mSpline
            r3 = r3[r0]
            r4 = r1[r9]
            double[] r6 = r7.mInterpolateData
            r3.getPos(r4, r6)
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r7.mStartMotionPath
            int[] r4 = r7.mInterpolateVariables
            double[] r5 = r7.mInterpolateData
            r3.getCenter(r4, r5, r8, r2)
            int r2 = r2 + 2
            int r9 = r9 + 1
            goto L2a
        L46:
            int r2 = r2 / 2
            return r2
        L49:
            return r0
    }

    void buildPath(float[] r22, int r23) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            int r3 = r2 + (-1)
            float r3 = (float) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r5 = r0.mAttributesMap
            java.lang.String r6 = "translationX"
            r7 = 0
            if (r5 != 0) goto L16
            r5 = r7
            goto L1c
        L16:
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.motion.widget.SplineSet r5 = (androidx.constraintlayout.motion.widget.SplineSet) r5
        L1c:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r8 = r0.mAttributesMap
            java.lang.String r9 = "translationY"
            if (r8 != 0) goto L24
            r8 = r7
            goto L2a
        L24:
            java.lang.Object r8 = r8.get(r9)
            androidx.constraintlayout.motion.widget.SplineSet r8 = (androidx.constraintlayout.motion.widget.SplineSet) r8
        L2a:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> r10 = r0.mCycleMap
            if (r10 != 0) goto L30
            r6 = r7
            goto L36
        L30:
            java.lang.Object r6 = r10.get(r6)
            androidx.constraintlayout.motion.widget.KeyCycleOscillator r6 = (androidx.constraintlayout.motion.widget.KeyCycleOscillator) r6
        L36:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> r10 = r0.mCycleMap
            if (r10 != 0) goto L3b
            goto L41
        L3b:
            java.lang.Object r7 = r10.get(r9)
            androidx.constraintlayout.motion.widget.KeyCycleOscillator r7 = (androidx.constraintlayout.motion.widget.KeyCycleOscillator) r7
        L41:
            r10 = 0
        L42:
            if (r10 >= r2) goto L11a
            float r11 = (float) r10
            float r11 = r11 * r3
            float r12 = r0.mStaggerScale
            r13 = 0
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 == 0) goto L67
            float r14 = r0.mStaggerOffset
            int r15 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r15 >= 0) goto L55
            r11 = 0
        L55:
            int r15 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r15 <= 0) goto L67
            r16 = r10
            r15 = 0
            double r9 = (double) r11
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r19 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r19 >= 0) goto L6a
            float r11 = r11 - r14
            float r11 = r11 * r12
            goto L6a
        L67:
            r16 = r10
            r15 = 0
        L6a:
            double r9 = (double) r11
            androidx.constraintlayout.motion.widget.MotionPaths r12 = r0.mStartMotionPath
            androidx.constraintlayout.motion.utils.Easing r12 = r12.mKeyFrameEasing
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r14 = r0.mMotionPaths
            java.util.Iterator r14 = r14.iterator()
            r17 = 2143289344(0x7fc00000, float:NaN)
        L77:
            boolean r18 = r14.hasNext()
            if (r18 == 0) goto La4
            java.lang.Object r18 = r14.next()
            r4 = r18
            androidx.constraintlayout.motion.widget.MotionPaths r4 = (androidx.constraintlayout.motion.widget.MotionPaths) r4
            r18 = 0
            androidx.constraintlayout.motion.utils.Easing r15 = r4.mKeyFrameEasing
            if (r15 == 0) goto L9e
            float r2 = r4.time
            int r20 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r20 >= 0) goto L94
            r13 = r2
            r12 = r15
            goto L9e
        L94:
            boolean r2 = java.lang.Float.isNaN(r17)
            if (r2 == 0) goto L9e
            float r2 = r4.time
            r17 = r2
        L9e:
            r2 = r23
            r4 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            goto L77
        La4:
            r18 = 0
            if (r12 == 0) goto Lc0
            boolean r2 = java.lang.Float.isNaN(r17)
            if (r2 == 0) goto Lb0
            r17 = 1065353216(0x3f800000, float:1.0)
        Lb0:
            float r2 = r11 - r13
            float r17 = r17 - r13
            float r2 = r2 / r17
            double r9 = (double) r2
            double r9 = r12.get(r9)
            float r2 = (float) r9
            float r2 = r2 * r17
            float r2 = r2 + r13
            double r9 = (double) r2
        Lc0:
            androidx.constraintlayout.motion.utils.CurveFit[] r2 = r0.mSpline
            r2 = r2[r18]
            double[] r4 = r0.mInterpolateData
            r2.getPos(r9, r4)
            androidx.constraintlayout.motion.utils.CurveFit r2 = r0.mArcSpline
            if (r2 == 0) goto Ld5
            double[] r4 = r0.mInterpolateData
            int r12 = r4.length
            if (r12 <= 0) goto Ld5
            r2.getPos(r9, r4)
        Ld5:
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r0.mStartMotionPath
            int[] r4 = r0.mInterpolateVariables
            double[] r9 = r0.mInterpolateData
            int r10 = r16 * 2
            r2.getCenter(r4, r9, r1, r10)
            if (r6 == 0) goto Lec
            r2 = r1[r10]
            float r4 = r6.get(r11)
            float r2 = r2 + r4
            r1[r10] = r2
            goto Lf7
        Lec:
            if (r5 == 0) goto Lf7
            r2 = r1[r10]
            float r4 = r5.get(r11)
            float r2 = r2 + r4
            r1[r10] = r2
        Lf7:
            if (r7 == 0) goto L105
            int r10 = r10 + 1
            r2 = r1[r10]
            float r4 = r7.get(r11)
            float r2 = r2 + r4
            r1[r10] = r2
            goto L112
        L105:
            if (r8 == 0) goto L112
            int r10 = r10 + 1
            r2 = r1[r10]
            float r4 = r8.get(r11)
            float r2 = r2 + r4
            r1[r10] = r2
        L112:
            int r10 = r16 + 1
            r2 = r23
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L42
        L11a:
            return
    }

    void buildRect(float r4, float[] r5, int r6) {
            r3 = this;
            r0 = 0
            float r4 = r3.getAdjustedPosition(r4, r0)
            androidx.constraintlayout.motion.utils.CurveFit[] r0 = r3.mSpline
            r1 = 0
            r0 = r0[r1]
            double r1 = (double) r4
            double[] r4 = r3.mInterpolateData
            r0.getPos(r1, r4)
            androidx.constraintlayout.motion.widget.MotionPaths r4 = r3.mStartMotionPath
            int[] r0 = r3.mInterpolateVariables
            double[] r1 = r3.mInterpolateData
            r4.getRect(r0, r1, r5, r6)
            return
    }

    void buildRectangles(float[] r8, int r9) {
            r7 = this;
            int r0 = r9 + (-1)
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r0
            r0 = 0
            r2 = 0
        L8:
            if (r2 >= r9) goto L2a
            float r3 = (float) r2
            float r3 = r3 * r1
            r4 = 0
            float r3 = r7.getAdjustedPosition(r3, r4)
            androidx.constraintlayout.motion.utils.CurveFit[] r4 = r7.mSpline
            r4 = r4[r0]
            double r5 = (double) r3
            double[] r3 = r7.mInterpolateData
            r4.getPos(r5, r3)
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r7.mStartMotionPath
            int[] r4 = r7.mInterpolateVariables
            double[] r5 = r7.mInterpolateData
            int r6 = r2 * 8
            r3.getRect(r4, r5, r8, r6)
            int r2 = r2 + 1
            goto L8
        L2a:
            return
    }

    int getAttributeValues(java.lang.String r2, float[] r3, int r4) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r4 = r1.mAttributesMap
            java.lang.Object r2 = r4.get(r2)
            androidx.constraintlayout.motion.widget.SplineSet r2 = (androidx.constraintlayout.motion.widget.SplineSet) r2
            if (r2 != 0) goto Lc
            r2 = -1
            return r2
        Lc:
            r4 = 0
        Ld:
            int r0 = r3.length
            if (r4 >= r0) goto L1f
            int r0 = r3.length
            int r0 = r0 + (-1)
            int r0 = r4 / r0
            float r0 = (float) r0
            float r0 = r2.get(r0)
            r3[r4] = r0
            int r4 = r4 + 1
            goto Ld
        L1f:
            int r2 = r3.length
            return r2
    }

    void getDpDt(float r12, float r13, float r14, float[] r15) {
            r11 = this;
            float[] r0 = r11.mVelocity
            float r12 = r11.getAdjustedPosition(r12, r0)
            androidx.constraintlayout.motion.utils.CurveFit[] r0 = r11.mSpline
            r1 = 0
            if (r0 == 0) goto L5e
            r0 = r0[r1]
            double r2 = (double) r12
            double[] r12 = r11.mInterpolateVelocity
            r0.getSlope(r2, r12)
            androidx.constraintlayout.motion.utils.CurveFit[] r12 = r11.mSpline
            r12 = r12[r1]
            double[] r0 = r11.mInterpolateData
            r12.getPos(r2, r0)
            float[] r12 = r11.mVelocity
            r12 = r12[r1]
        L20:
            double[] r9 = r11.mInterpolateVelocity
            int r0 = r9.length
            if (r1 >= r0) goto L2f
            r4 = r9[r1]
            double r6 = (double) r12
            double r4 = r4 * r6
            r9[r1] = r4
            int r1 = r1 + 1
            goto L20
        L2f:
            androidx.constraintlayout.motion.utils.CurveFit r12 = r11.mArcSpline
            if (r12 == 0) goto L51
            double[] r0 = r11.mInterpolateData
            int r1 = r0.length
            if (r1 <= 0) goto L50
            r12.getPos(r2, r0)
            androidx.constraintlayout.motion.utils.CurveFit r12 = r11.mArcSpline
            double[] r0 = r11.mInterpolateVelocity
            r12.getSlope(r2, r0)
            androidx.constraintlayout.motion.widget.MotionPaths r4 = r11.mStartMotionPath
            int[] r8 = r11.mInterpolateVariables
            double[] r9 = r11.mInterpolateVelocity
            double[] r10 = r11.mInterpolateData
            r5 = r13
            r6 = r14
            r7 = r15
            r4.setDpDt(r5, r6, r7, r8, r9, r10)
        L50:
            return
        L51:
            r5 = r13
            r6 = r14
            r7 = r15
            androidx.constraintlayout.motion.widget.MotionPaths r4 = r11.mStartMotionPath
            int[] r8 = r11.mInterpolateVariables
            double[] r10 = r11.mInterpolateData
            r4.setDpDt(r5, r6, r7, r8, r9, r10)
            return
        L5e:
            r5 = r13
            r6 = r14
            r7 = r15
            androidx.constraintlayout.motion.widget.MotionPaths r12 = r11.mEndMotionPath
            float r13 = r12.x
            androidx.constraintlayout.motion.widget.MotionPaths r14 = r11.mStartMotionPath
            float r15 = r14.x
            float r13 = r13 - r15
            float r15 = r12.y
            float r0 = r14.y
            float r15 = r15 - r0
            float r0 = r12.width
            float r2 = r14.width
            float r0 = r0 - r2
            float r12 = r12.height
            float r14 = r14.height
            float r12 = r12 - r14
            float r0 = r0 + r13
            float r12 = r12 + r15
            r14 = 1065353216(0x3f800000, float:1.0)
            float r2 = r14 - r5
            float r13 = r13 * r2
            float r0 = r0 * r5
            float r13 = r13 + r0
            r7[r1] = r13
            float r14 = r14 - r6
            float r15 = r15 * r14
            float r12 = r12 * r6
            float r15 = r15 + r12
            r12 = 1
            r7[r12] = r15
            return
    }

    public int getDrawPath() {
            r3 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r3.mStartMotionPath
            int r0 = r0.mDrawPath
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r1 = r3.mMotionPaths
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.motion.widget.MotionPaths r2 = (androidx.constraintlayout.motion.widget.MotionPaths) r2
            int r2 = r2.mDrawPath
            int r0 = java.lang.Math.max(r0, r2)
            goto La
        L1d:
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r3.mEndMotionPath
            int r1 = r1.mDrawPath
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    float getFinalX() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mEndMotionPath
            float r0 = r0.x
            return r0
    }

    float getFinalY() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mEndMotionPath
            float r0 = r0.y
            return r0
    }

    androidx.constraintlayout.motion.widget.MotionPaths getKeyFrame(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r0 = r1.mMotionPaths
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.motion.widget.MotionPaths r2 = (androidx.constraintlayout.motion.widget.MotionPaths) r2
            return r2
    }

    public int getKeyFrameInfo(int r11, int[] r12) {
            r10 = this;
            r0 = 2
            float[] r0 = new float[r0]
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r1 = r10.mKeyList
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
            r4 = 0
        Lc:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L81
            java.lang.Object r5 = r1.next()
            androidx.constraintlayout.motion.widget.Key r5 = (androidx.constraintlayout.motion.widget.Key) r5
            int r6 = r5.mType
            if (r6 == r11) goto L20
            r7 = -1
            if (r11 != r7) goto L20
            goto Lc
        L20:
            r12[r4] = r2
            int r7 = r4 + 1
            r12[r7] = r6
            int r6 = r4 + 2
            int r7 = r5.mFramePosition
            r12[r6] = r7
            float r6 = (float) r7
            r7 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r7
            androidx.constraintlayout.motion.utils.CurveFit[] r7 = r10.mSpline
            r7 = r7[r2]
            double r8 = (double) r6
            double[] r6 = r10.mInterpolateData
            r7.getPos(r8, r6)
            androidx.constraintlayout.motion.widget.MotionPaths r6 = r10.mStartMotionPath
            int[] r7 = r10.mInterpolateVariables
            double[] r8 = r10.mInterpolateData
            r6.getCenter(r7, r8, r0, r2)
            int r6 = r4 + 3
            r7 = r0[r2]
            int r7 = java.lang.Float.floatToIntBits(r7)
            r12[r6] = r7
            int r6 = r4 + 4
            r7 = 1
            r8 = r0[r7]
            int r8 = java.lang.Float.floatToIntBits(r8)
            r12[r6] = r8
            boolean r8 = r5 instanceof androidx.constraintlayout.motion.widget.KeyPosition
            if (r8 == 0) goto L78
            androidx.constraintlayout.motion.widget.KeyPosition r5 = (androidx.constraintlayout.motion.widget.KeyPosition) r5
            int r6 = r4 + 5
            int r8 = r5.mPositionType
            r12[r6] = r8
            int r6 = r4 + 6
            float r8 = r5.mPercentX
            int r8 = java.lang.Float.floatToIntBits(r8)
            r12[r6] = r8
            int r6 = r4 + 7
            float r5 = r5.mPercentY
            int r5 = java.lang.Float.floatToIntBits(r5)
            r12[r6] = r5
        L78:
            int r6 = r6 + r7
            int r5 = r6 - r4
            r12[r4] = r5
            int r3 = r3 + 1
            r4 = r6
            goto Lc
        L81:
            return r3
    }

    float getKeyFrameParameter(int r11, float r12, float r13) {
            r10 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r10.mEndMotionPath
            float r1 = r0.x
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r10.mStartMotionPath
            float r3 = r2.x
            float r1 = r1 - r3
            float r0 = r0.y
            float r4 = r2.y
            float r0 = r0 - r4
            float r5 = r2.width
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r3 = r3 + r5
            float r2 = r2.height
            float r2 = r2 / r6
            float r4 = r4 + r2
            double r5 = (double) r1
            double r7 = (double) r0
            double r5 = java.lang.Math.hypot(r5, r7)
            float r2 = (float) r5
            double r5 = (double) r2
            r7 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L2c
            r11 = 2143289344(0x7fc00000, float:NaN)
            return r11
        L2c:
            float r12 = r12 - r3
            float r13 = r13 - r4
            double r3 = (double) r12
            double r5 = (double) r13
            double r3 = java.lang.Math.hypot(r3, r5)
            float r3 = (float) r3
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L3b
            return r4
        L3b:
            float r3 = r12 * r1
            float r5 = r13 * r0
            float r3 = r3 + r5
            if (r11 == 0) goto L66
            r5 = 1
            if (r11 == r5) goto L5a
            r2 = 2
            if (r11 == r2) goto L58
            r2 = 3
            if (r11 == r2) goto L56
            r1 = 4
            if (r11 == r1) goto L54
            r12 = 5
            if (r11 == r12) goto L52
            return r4
        L52:
            float r13 = r13 / r0
            return r13
        L54:
            float r12 = r12 / r0
            return r12
        L56:
            float r13 = r13 / r1
            return r13
        L58:
            float r12 = r12 / r1
            return r12
        L5a:
            float r2 = r2 * r2
            float r3 = r3 * r3
            float r2 = r2 - r3
            double r11 = (double) r2
            double r11 = java.lang.Math.sqrt(r11)
            float r11 = (float) r11
            return r11
        L66:
            float r3 = r3 / r2
            return r3
    }

    androidx.constraintlayout.motion.widget.KeyPositionBase getPositionKeyframe(int r9, int r10, float r11, float r12) {
            r8 = this;
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r8.mStartMotionPath
            float r1 = r0.x
            r3.left = r1
            float r2 = r0.y
            r3.top = r2
            float r4 = r0.width
            float r1 = r1 + r4
            r3.right = r1
            float r0 = r0.height
            float r2 = r2 + r0
            r3.bottom = r2
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r8.mEndMotionPath
            float r1 = r0.x
            r4.left = r1
            float r2 = r0.y
            r4.top = r2
            float r5 = r0.width
            float r1 = r1 + r5
            r4.right = r1
            float r0 = r0.height
            float r2 = r2 + r0
            r4.bottom = r2
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r0 = r8.mKeyList
            java.util.Iterator r7 = r0.iterator()
        L38:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r7.next()
            androidx.constraintlayout.motion.widget.Key r0 = (androidx.constraintlayout.motion.widget.Key) r0
            boolean r1 = r0 instanceof androidx.constraintlayout.motion.widget.KeyPositionBase
            if (r1 == 0) goto L55
            androidx.constraintlayout.motion.widget.KeyPositionBase r0 = (androidx.constraintlayout.motion.widget.KeyPositionBase) r0
            r1 = r9
            r2 = r10
            r5 = r11
            r6 = r12
            boolean r9 = r0.intersects(r1, r2, r3, r4, r5, r6)
            if (r9 == 0) goto L59
            return r0
        L55:
            r1 = r9
            r2 = r10
            r5 = r11
            r6 = r12
        L59:
            r9 = r1
            r10 = r2
            r11 = r5
            r12 = r6
            goto L38
        L5e:
            r9 = 0
            return r9
    }

    void getPostLayoutDvDp(float r21, int r22, int r23, float r24, float r25, float[] r26) {
            r20 = this;
            r0 = r20
            float[] r1 = r0.mVelocity
            r2 = r21
            float r1 = r0.getAdjustedPosition(r2, r1)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r2 = r0.mAttributesMap
            java.lang.String r3 = "translationX"
            r4 = 0
            if (r2 != 0) goto L13
            r2 = r4
            goto L19
        L13:
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.motion.widget.SplineSet r2 = (androidx.constraintlayout.motion.widget.SplineSet) r2
        L19:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r5 = r0.mAttributesMap
            java.lang.String r6 = "translationY"
            if (r5 != 0) goto L21
            r5 = r4
            goto L27
        L21:
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.motion.widget.SplineSet r5 = (androidx.constraintlayout.motion.widget.SplineSet) r5
        L27:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r7 = r0.mAttributesMap
            java.lang.String r8 = "rotation"
            if (r7 != 0) goto L2f
            r7 = r4
            goto L35
        L2f:
            java.lang.Object r7 = r7.get(r8)
            androidx.constraintlayout.motion.widget.SplineSet r7 = (androidx.constraintlayout.motion.widget.SplineSet) r7
        L35:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r9 = r0.mAttributesMap
            java.lang.String r10 = "scaleX"
            if (r9 != 0) goto L3d
            r9 = r4
            goto L43
        L3d:
            java.lang.Object r9 = r9.get(r10)
            androidx.constraintlayout.motion.widget.SplineSet r9 = (androidx.constraintlayout.motion.widget.SplineSet) r9
        L43:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r11 = r0.mAttributesMap
            java.lang.String r12 = "scaleY"
            if (r11 != 0) goto L4b
            r11 = r4
            goto L51
        L4b:
            java.lang.Object r11 = r11.get(r12)
            androidx.constraintlayout.motion.widget.SplineSet r11 = (androidx.constraintlayout.motion.widget.SplineSet) r11
        L51:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> r13 = r0.mCycleMap
            if (r13 != 0) goto L57
            r3 = r4
            goto L5d
        L57:
            java.lang.Object r3 = r13.get(r3)
            androidx.constraintlayout.motion.widget.KeyCycleOscillator r3 = (androidx.constraintlayout.motion.widget.KeyCycleOscillator) r3
        L5d:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> r13 = r0.mCycleMap
            if (r13 != 0) goto L63
            r6 = r4
            goto L69
        L63:
            java.lang.Object r6 = r13.get(r6)
            androidx.constraintlayout.motion.widget.KeyCycleOscillator r6 = (androidx.constraintlayout.motion.widget.KeyCycleOscillator) r6
        L69:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> r13 = r0.mCycleMap
            if (r13 != 0) goto L6f
            r8 = r4
            goto L75
        L6f:
            java.lang.Object r8 = r13.get(r8)
            androidx.constraintlayout.motion.widget.KeyCycleOscillator r8 = (androidx.constraintlayout.motion.widget.KeyCycleOscillator) r8
        L75:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> r13 = r0.mCycleMap
            if (r13 != 0) goto L7b
            r10 = r4
            goto L81
        L7b:
            java.lang.Object r10 = r13.get(r10)
            androidx.constraintlayout.motion.widget.KeyCycleOscillator r10 = (androidx.constraintlayout.motion.widget.KeyCycleOscillator) r10
        L81:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> r13 = r0.mCycleMap
            if (r13 != 0) goto L86
            goto L8c
        L86:
            java.lang.Object r4 = r13.get(r12)
            androidx.constraintlayout.motion.widget.KeyCycleOscillator r4 = (androidx.constraintlayout.motion.widget.KeyCycleOscillator) r4
        L8c:
            androidx.constraintlayout.motion.utils.VelocityMatrix r12 = new androidx.constraintlayout.motion.utils.VelocityMatrix
            r12.<init>()
            r12.clear()
            r12.setRotationVelocity(r7, r1)
            r12.setTranslationVelocity(r2, r5, r1)
            r12.setScaleVelocity(r9, r11, r1)
            r12.setRotationVelocity(r8, r1)
            r12.setTranslationVelocity(r3, r6, r1)
            r12.setScaleVelocity(r10, r4, r1)
            androidx.constraintlayout.motion.utils.CurveFit r13 = r0.mArcSpline
            if (r13 == 0) goto Ld9
            double[] r2 = r0.mInterpolateData
            int r3 = r2.length
            if (r3 <= 0) goto Lcb
            double r3 = (double) r1
            r13.getPos(r3, r2)
            androidx.constraintlayout.motion.utils.CurveFit r1 = r0.mArcSpline
            double[] r2 = r0.mInterpolateVelocity
            r1.getSlope(r3, r2)
            androidx.constraintlayout.motion.widget.MotionPaths r5 = r0.mStartMotionPath
            int[] r9 = r0.mInterpolateVariables
            double[] r10 = r0.mInterpolateVelocity
            double[] r11 = r0.mInterpolateData
            r6 = r24
            r7 = r25
            r8 = r26
            r5.setDpDt(r6, r7, r8, r9, r10, r11)
        Lcb:
            r15 = r22
            r16 = r23
            r13 = r24
            r14 = r25
            r17 = r26
            r12.applyTransform(r13, r14, r15, r16, r17)
            return
        Ld9:
            androidx.constraintlayout.motion.utils.CurveFit[] r13 = r0.mSpline
            r14 = 0
            if (r13 == 0) goto L12b
            float[] r2 = r0.mVelocity
            float r1 = r0.getAdjustedPosition(r1, r2)
            androidx.constraintlayout.motion.utils.CurveFit[] r2 = r0.mSpline
            r2 = r2[r14]
            double r3 = (double) r1
            double[] r1 = r0.mInterpolateVelocity
            r2.getSlope(r3, r1)
            androidx.constraintlayout.motion.utils.CurveFit[] r1 = r0.mSpline
            r1 = r1[r14]
            double[] r2 = r0.mInterpolateData
            r1.getPos(r3, r2)
            float[] r1 = r0.mVelocity
            r1 = r1[r14]
        Lfb:
            double[] r2 = r0.mInterpolateVelocity
            int r3 = r2.length
            if (r14 >= r3) goto L10a
            r3 = r2[r14]
            double r5 = (double) r1
            double r3 = r3 * r5
            r2[r14] = r3
            int r14 = r14 + 1
            goto Lfb
        L10a:
            androidx.constraintlayout.motion.widget.MotionPaths r13 = r0.mStartMotionPath
            int[] r1 = r0.mInterpolateVariables
            double[] r3 = r0.mInterpolateData
            r14 = r24
            r15 = r25
            r16 = r26
            r17 = r1
            r18 = r2
            r19 = r3
            r13.setDpDt(r14, r15, r16, r17, r18, r19)
            r13 = r14
            r14 = r15
            r17 = r16
            r15 = r22
            r16 = r23
            r12.applyTransform(r13, r14, r15, r16, r17)
            return
        L12b:
            androidx.constraintlayout.motion.widget.MotionPaths r13 = r0.mEndMotionPath
            float r15 = r13.x
            r21 = 0
            androidx.constraintlayout.motion.widget.MotionPaths r14 = r0.mStartMotionPath
            float r0 = r14.x
            float r15 = r15 - r0
            float r0 = r13.y
            r16 = r0
            float r0 = r14.y
            float r0 = r16 - r0
            r16 = r0
            float r0 = r13.width
            r17 = r0
            float r0 = r14.width
            float r0 = r17 - r0
            float r13 = r13.height
            float r14 = r14.height
            float r13 = r13 - r14
            float r0 = r0 + r15
            float r13 = r16 + r13
            r14 = 1065353216(0x3f800000, float:1.0)
            float r17 = r14 - r24
            float r15 = r15 * r17
            float r0 = r0 * r24
            float r15 = r15 + r0
            r26[r21] = r15
            float r14 = r14 - r25
            float r0 = r16 * r14
            float r13 = r13 * r25
            float r0 = r0 + r13
            r13 = 1
            r26[r13] = r0
            r12.clear()
            r12.setRotationVelocity(r7, r1)
            r12.setTranslationVelocity(r2, r5, r1)
            r12.setScaleVelocity(r9, r11, r1)
            r12.setRotationVelocity(r8, r1)
            r12.setTranslationVelocity(r3, r6, r1)
            r12.setScaleVelocity(r10, r4, r1)
            r15 = r22
            r16 = r23
            r13 = r24
            r14 = r25
            r17 = r26
            r12.applyTransform(r13, r14, r15, r16, r17)
            return
    }

    float getStartX() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mStartMotionPath
            float r0 = r0.x
            return r0
    }

    float getStartY() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mStartMotionPath
            float r0 = r0.y
            return r0
    }

    public int getkeyFramePositions(int[] r9, float[] r10) {
            r8 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r0 = r8.mKeyList
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
            r3 = 0
        L9:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r0.next()
            androidx.constraintlayout.motion.widget.Key r4 = (androidx.constraintlayout.motion.widget.Key) r4
            int r5 = r2 + 1
            int r6 = r4.mFramePosition
            int r4 = r4.mType
            int r4 = r4 * 1000
            int r4 = r4 + r6
            r9[r2] = r4
            float r2 = (float) r6
            r4 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r4
            androidx.constraintlayout.motion.utils.CurveFit[] r4 = r8.mSpline
            r4 = r4[r1]
            double r6 = (double) r2
            double[] r2 = r8.mInterpolateData
            r4.getPos(r6, r2)
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r8.mStartMotionPath
            int[] r4 = r8.mInterpolateVariables
            double[] r6 = r8.mInterpolateData
            r2.getCenter(r4, r6, r10, r3)
            int r3 = r3 + 2
            r2 = r5
            goto L9
        L3b:
            return r2
    }

    boolean interpolate(android.view.View r17, float r18, long r19, androidx.constraintlayout.motion.widget.KeyCache r21) {
            r16 = this;
            r0 = r16
            r2 = r17
            r1 = 0
            r3 = r18
            float r3 = r0.getAdjustedPosition(r3, r1)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r4 = r0.mAttributesMap
            if (r4 == 0) goto L27
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L27
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.motion.widget.SplineSet r5 = (androidx.constraintlayout.motion.widget.SplineSet) r5
            r5.setProperty(r2, r3)
            goto L17
        L27:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> r4 = r0.mTimeCycleAttributesMap
            r11 = 0
            if (r4 == 0) goto L5a
            java.util.Collection r4 = r4.values()
            java.util.Iterator r7 = r4.iterator()
            r8 = r1
            r9 = 0
        L36:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r7.next()
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet r1 = (androidx.constraintlayout.motion.widget.TimeCycleSplineSet) r1
            boolean r4 = r1 instanceof androidx.constraintlayout.motion.widget.TimeCycleSplineSet.PathRotate
            if (r4 == 0) goto L4a
            r8 = r1
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$PathRotate r8 = (androidx.constraintlayout.motion.widget.TimeCycleSplineSet.PathRotate) r8
            goto L36
        L4a:
            r4 = r19
            r6 = r21
            boolean r1 = r1.setProperty(r2, r3, r4, r6)
            r10 = r3
            r9 = r9 | r1
            r2 = r17
            goto L36
        L57:
            r12 = r9
        L58:
            r10 = r3
            goto L5d
        L5a:
            r8 = r1
            r12 = 0
            goto L58
        L5d:
            androidx.constraintlayout.motion.utils.CurveFit[] r1 = r0.mSpline
            r13 = 1
            if (r1 == 0) goto L13e
            r1 = r1[r11]
            double r14 = (double) r10
            double[] r2 = r0.mInterpolateData
            r1.getPos(r14, r2)
            androidx.constraintlayout.motion.utils.CurveFit[] r1 = r0.mSpline
            r1 = r1[r11]
            double[] r2 = r0.mInterpolateVelocity
            r1.getSlope(r14, r2)
            androidx.constraintlayout.motion.utils.CurveFit r1 = r0.mArcSpline
            if (r1 == 0) goto L86
            double[] r2 = r0.mInterpolateData
            int r3 = r2.length
            if (r3 <= 0) goto L86
            r1.getPos(r14, r2)
            androidx.constraintlayout.motion.utils.CurveFit r1 = r0.mArcSpline
            double[] r2 = r0.mInterpolateVelocity
            r1.getSlope(r14, r2)
        L86:
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r0.mStartMotionPath
            int[] r3 = r0.mInterpolateVariables
            double[] r4 = r0.mInterpolateData
            double[] r5 = r0.mInterpolateVelocity
            r6 = 0
            r2 = r17
            r1.setView(r2, r3, r4, r5, r6)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r1 = r0.mAttributesMap
            if (r1 == 0) goto Lc2
            java.util.Collection r1 = r1.values()
            java.util.Iterator r9 = r1.iterator()
        La0:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto Lc2
            java.lang.Object r1 = r9.next()
            androidx.constraintlayout.motion.widget.SplineSet r1 = (androidx.constraintlayout.motion.widget.SplineSet) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.widget.SplineSet.PathRotate
            if (r2 == 0) goto Lbf
            androidx.constraintlayout.motion.widget.SplineSet$PathRotate r1 = (androidx.constraintlayout.motion.widget.SplineSet.PathRotate) r1
            double[] r2 = r0.mInterpolateVelocity
            r4 = r2[r11]
            r6 = r2[r13]
            r2 = r17
            r3 = r10
            r1.setPathRotate(r2, r3, r4, r6)
            goto Lc0
        Lbf:
            r3 = r10
        Lc0:
            r10 = r3
            goto La0
        Lc2:
            r3 = r10
            if (r8 == 0) goto Ldb
            double[] r1 = r0.mInterpolateVelocity
            r4 = r1[r11]
            r9 = r1[r13]
            r2 = r17
            r1 = r8
            r7 = r4
            r5 = r19
            r4 = r3
            r3 = r21
            boolean r1 = r1.setPathRotate(r2, r3, r4, r5, r7, r9)
            r3 = r4
            r12 = r12 | r1
            goto Ldd
        Ldb:
            r2 = r17
        Ldd:
            r1 = 1
        Lde:
            androidx.constraintlayout.motion.utils.CurveFit[] r4 = r0.mSpline
            int r5 = r4.length
            if (r1 >= r5) goto L102
            r4 = r4[r1]
            float[] r5 = r0.mValuesBuff
            r4.getPos(r14, r5)
            androidx.constraintlayout.motion.widget.MotionPaths r4 = r0.mStartMotionPath
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r4 = r4.attributes
            java.lang.String[] r5 = r0.mAttributeNames
            int r6 = r1 + (-1)
            r5 = r5[r6]
            java.lang.Object r4 = r4.get(r5)
            androidx.constraintlayout.widget.ConstraintAttribute r4 = (androidx.constraintlayout.widget.ConstraintAttribute) r4
            float[] r5 = r0.mValuesBuff
            r4.setInterpolatedValue(r2, r5)
            int r1 = r1 + 1
            goto Lde
        L102:
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r1 = r0.mStartPoint
            int r4 = r1.mVisibilityMode
            if (r4 != 0) goto L12c
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 > 0) goto L113
            int r1 = r1.visibility
            r2.setVisibility(r1)
            goto L12c
        L113:
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 < 0) goto L121
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r1 = r0.mEndPoint
            int r1 = r1.visibility
            r2.setVisibility(r1)
            goto L12c
        L121:
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r4 = r0.mEndPoint
            int r4 = r4.visibility
            int r1 = r1.visibility
            if (r4 == r1) goto L12c
            r2.setVisibility(r11)
        L12c:
            androidx.constraintlayout.motion.widget.KeyTrigger[] r1 = r0.mKeyTriggers
            if (r1 == 0) goto L18d
            r1 = 0
        L131:
            androidx.constraintlayout.motion.widget.KeyTrigger[] r4 = r0.mKeyTriggers
            int r5 = r4.length
            if (r1 >= r5) goto L18d
            r4 = r4[r1]
            r4.conditionallyFire(r3, r2)
            int r1 = r1 + 1
            goto L131
        L13e:
            r2 = r17
            r3 = r10
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r0.mStartMotionPath
            float r4 = r1.x
            androidx.constraintlayout.motion.widget.MotionPaths r5 = r0.mEndMotionPath
            float r6 = r5.x
            float r6 = r6 - r4
            float r6 = r6 * r3
            float r4 = r4 + r6
            float r6 = r1.y
            float r7 = r5.y
            float r7 = r7 - r6
            float r7 = r7 * r3
            float r6 = r6 + r7
            float r7 = r1.width
            float r8 = r5.width
            float r9 = r8 - r7
            float r9 = r9 * r3
            float r9 = r9 + r7
            float r1 = r1.height
            float r5 = r5.height
            float r10 = r5 - r1
            float r10 = r10 * r3
            float r10 = r10 + r1
            r14 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r14
            int r15 = (int) r4
            float r6 = r6 + r14
            int r14 = (int) r6
            float r4 = r4 + r9
            int r4 = (int) r4
            float r6 = r6 + r10
            int r6 = (int) r6
            int r9 = r4 - r15
            int r10 = r6 - r14
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 != 0) goto L17d
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L18a
        L17d:
            r1 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r1)
            r2.measure(r5, r1)
        L18a:
            r2.layout(r15, r14, r4, r6)
        L18d:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> r1 = r0.mCycleMap
            if (r1 == 0) goto L1bb
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L199:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L1bb
            java.lang.Object r1 = r8.next()
            androidx.constraintlayout.motion.widget.KeyCycleOscillator r1 = (androidx.constraintlayout.motion.widget.KeyCycleOscillator) r1
            boolean r4 = r1 instanceof androidx.constraintlayout.motion.widget.KeyCycleOscillator.PathRotateSet
            if (r4 == 0) goto L1b7
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$PathRotateSet r1 = (androidx.constraintlayout.motion.widget.KeyCycleOscillator.PathRotateSet) r1
            double[] r4 = r0.mInterpolateVelocity
            r5 = r4[r11]
            r9 = r4[r13]
            r4 = r5
            r6 = r9
            r1.setPathRotate(r2, r3, r4, r6)
            goto L199
        L1b7:
            r1.setProperty(r2, r3)
            goto L199
        L1bb:
            return r12
    }

    java.lang.String name() {
            r2 = this;
            android.view.View r0 = r2.mView
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.view.View r1 = r2.mView
            int r1 = r1.getId()
            java.lang.String r0 = r0.getResourceEntryName(r1)
            return r0
    }

    void positionKeyframe(android.view.View r9, androidx.constraintlayout.motion.widget.KeyPositionBase r10, float r11, float r12, java.lang.String[] r13, float[] r14) {
            r8 = this;
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r8.mStartMotionPath
            float r1 = r0.x
            r2.left = r1
            float r3 = r0.y
            r2.top = r3
            float r4 = r0.width
            float r1 = r1 + r4
            r2.right = r1
            float r0 = r0.height
            float r3 = r3 + r0
            r2.bottom = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r8.mEndMotionPath
            float r1 = r0.x
            r3.left = r1
            float r4 = r0.y
            r3.top = r4
            float r5 = r0.width
            float r1 = r1 + r5
            r3.right = r1
            float r0 = r0.height
            float r4 = r4 + r0
            r3.bottom = r4
            r1 = r9
            r0 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.positionAttributes(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public void setDrawPath(int r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mStartMotionPath
            r0.mDrawPath = r2
            return
    }

    void setEndState(androidx.constraintlayout.solver.widgets.ConstraintWidget r6, androidx.constraintlayout.widget.ConstraintSet r7) {
            r5 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r5.mEndMotionPath
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.time = r1
            r0.position = r1
            r5.readView(r0)
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r5.mEndMotionPath
            int r1 = r6.getX()
            float r1 = (float) r1
            int r2 = r6.getY()
            float r2 = (float) r2
            int r3 = r6.getWidth()
            float r3 = (float) r3
            int r4 = r6.getHeight()
            float r4 = (float) r4
            r0.setBounds(r1, r2, r3, r4)
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r5.mEndMotionPath
            int r1 = r5.mId
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r7.getParameters(r1)
            r0.applyParameters(r1)
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r0 = r5.mEndPoint
            int r1 = r5.mId
            r0.setState(r6, r7, r1)
            return
    }

    public void setPathMotionArc(int r1) {
            r0 = this;
            r0.mPathMotionArc = r1
            return
    }

    void setStartCurrentState(android.view.View r6) {
            r5 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r5.mStartMotionPath
            r1 = 0
            r0.time = r1
            r0.position = r1
            float r1 = r6.getX()
            float r2 = r6.getY()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            int r4 = r6.getHeight()
            float r4 = (float) r4
            r0.setBounds(r1, r2, r3, r4)
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r0 = r5.mStartPoint
            r0.setState(r6)
            return
    }

    void setStartState(androidx.constraintlayout.solver.widgets.ConstraintWidget r6, androidx.constraintlayout.widget.ConstraintSet r7) {
            r5 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r5.mStartMotionPath
            r1 = 0
            r0.time = r1
            r0.position = r1
            r5.readView(r0)
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r5.mStartMotionPath
            int r1 = r6.getX()
            float r1 = (float) r1
            int r2 = r6.getY()
            float r2 = (float) r2
            int r3 = r6.getWidth()
            float r3 = (float) r3
            int r4 = r6.getHeight()
            float r4 = (float) r4
            r0.setBounds(r1, r2, r3, r4)
            int r0 = r5.mId
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = r7.getParameters(r0)
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r5.mStartMotionPath
            r1.applyParameters(r0)
            androidx.constraintlayout.widget.ConstraintSet$Motion r0 = r0.motion
            float r0 = r0.mMotionStagger
            r5.mMotionStagger = r0
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r0 = r5.mStartPoint
            int r1 = r5.mId
            r0.setState(r6, r7, r1)
            return
    }

    public void setView(android.view.View r2) {
            r1 = this;
            r1.mView = r2
            int r0 = r2.getId()
            r1.mId = r0
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            boolean r0 = r2 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r0 == 0) goto L18
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r2
            java.lang.String r2 = r2.getConstraintTag()
            r1.mConstraintTag = r2
        L18:
            return
    }

    public void setup(int r18, int r19, float r20, long r21) {
            r17 = this;
            r0 = r17
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            int r5 = r0.mPathMotionArc
            int r6 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r5 == r6) goto L25
            androidx.constraintlayout.motion.widget.MotionPaths r6 = r0.mStartMotionPath
            r6.mPathMotionArc = r5
        L25:
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r5 = r0.mStartPoint
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r6 = r0.mEndPoint
            r5.different(r6, r2)
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r5 = r0.mKeyList
            if (r5 == 0) goto L89
            java.util.Iterator r5 = r5.iterator()
            r7 = 0
        L35:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L8a
            java.lang.Object r8 = r5.next()
            androidx.constraintlayout.motion.widget.Key r8 = (androidx.constraintlayout.motion.widget.Key) r8
            boolean r9 = r8 instanceof androidx.constraintlayout.motion.widget.KeyPosition
            if (r9 == 0) goto L61
            r13 = r8
            androidx.constraintlayout.motion.widget.KeyPosition r13 = (androidx.constraintlayout.motion.widget.KeyPosition) r13
            androidx.constraintlayout.motion.widget.MotionPaths r10 = new androidx.constraintlayout.motion.widget.MotionPaths
            androidx.constraintlayout.motion.widget.MotionPaths r14 = r0.mStartMotionPath
            androidx.constraintlayout.motion.widget.MotionPaths r15 = r0.mEndMotionPath
            r11 = r18
            r12 = r19
            r10.<init>(r11, r12, r13, r14, r15)
            r0.insertKey(r10)
            int r8 = r13.mCurveFit
            int r9 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r8 == r9) goto L35
            r0.mCurveFitType = r8
            goto L35
        L61:
            boolean r9 = r8 instanceof androidx.constraintlayout.motion.widget.KeyCycle
            if (r9 == 0) goto L69
            r8.getAttributeNames(r3)
            goto L35
        L69:
            boolean r9 = r8 instanceof androidx.constraintlayout.motion.widget.KeyTimeCycle
            if (r9 == 0) goto L71
            r8.getAttributeNames(r1)
            goto L35
        L71:
            boolean r9 = r8 instanceof androidx.constraintlayout.motion.widget.KeyTrigger
            if (r9 == 0) goto L82
            if (r7 != 0) goto L7c
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L7c:
            androidx.constraintlayout.motion.widget.KeyTrigger r8 = (androidx.constraintlayout.motion.widget.KeyTrigger) r8
            r7.add(r8)
            goto L35
        L82:
            r8.setInterpolation(r4)
            r8.getAttributeNames(r2)
            goto L35
        L89:
            r7 = 0
        L8a:
            r5 = 0
            if (r7 == 0) goto L97
            androidx.constraintlayout.motion.widget.KeyTrigger[] r8 = new androidx.constraintlayout.motion.widget.KeyTrigger[r5]
            java.lang.Object[] r7 = r7.toArray(r8)
            androidx.constraintlayout.motion.widget.KeyTrigger[] r7 = (androidx.constraintlayout.motion.widget.KeyTrigger[]) r7
            r0.mKeyTriggers = r7
        L97:
            boolean r7 = r2.isEmpty()
            java.lang.String r8 = ","
            java.lang.String r9 = "CUSTOM,"
            r10 = 1
            if (r7 != 0) goto L166
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r0.mAttributesMap = r7
            java.util.Iterator r7 = r2.iterator()
        Lad:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L104
            java.lang.Object r11 = r7.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r12 = r11.startsWith(r9)
            if (r12 == 0) goto Lf4
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            java.lang.String[] r13 = r11.split(r8)
            r13 = r13[r10]
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r14 = r0.mKeyList
            java.util.Iterator r14 = r14.iterator()
        Ld0:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto Lef
            java.lang.Object r15 = r14.next()
            androidx.constraintlayout.motion.widget.Key r15 = (androidx.constraintlayout.motion.widget.Key) r15
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r6 = r15.mCustomConstraints
            if (r6 != 0) goto Le1
            goto Ld0
        Le1:
            java.lang.Object r6 = r6.get(r13)
            androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
            if (r6 == 0) goto Ld0
            int r15 = r15.mFramePosition
            r12.append(r15, r6)
            goto Ld0
        Lef:
            androidx.constraintlayout.motion.widget.SplineSet r6 = androidx.constraintlayout.motion.widget.SplineSet.makeCustomSpline(r11, r12)
            goto Lf8
        Lf4:
            androidx.constraintlayout.motion.widget.SplineSet r6 = androidx.constraintlayout.motion.widget.SplineSet.makeSpline(r11)
        Lf8:
            if (r6 != 0) goto Lfb
            goto Lad
        Lfb:
            r6.setType(r11)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r12 = r0.mAttributesMap
            r12.put(r11, r6)
            goto Lad
        L104:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r6 = r0.mKeyList
            if (r6 == 0) goto L122
            java.util.Iterator r6 = r6.iterator()
        L10c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L122
            java.lang.Object r7 = r6.next()
            androidx.constraintlayout.motion.widget.Key r7 = (androidx.constraintlayout.motion.widget.Key) r7
            boolean r11 = r7 instanceof androidx.constraintlayout.motion.widget.KeyAttributes
            if (r11 == 0) goto L10c
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r11 = r0.mAttributesMap
            r7.addValues(r11)
            goto L10c
        L122:
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r6 = r0.mStartPoint
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r7 = r0.mAttributesMap
            r6.addValues(r7, r5)
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r6 = r0.mEndPoint
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r7 = r0.mAttributesMap
            r11 = 100
            r6.addValues(r7, r11)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r6 = r0.mAttributesMap
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L13c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L166
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r11 = r4.containsKey(r7)
            if (r11 == 0) goto L159
            java.lang.Object r11 = r4.get(r7)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            goto L15a
        L159:
            r11 = 0
        L15a:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r12 = r0.mAttributesMap
            java.lang.Object r7 = r12.get(r7)
            androidx.constraintlayout.motion.widget.SplineSet r7 = (androidx.constraintlayout.motion.widget.SplineSet) r7
            r7.setup(r11)
            goto L13c
        L166:
            boolean r6 = r1.isEmpty()
            if (r6 != 0) goto L233
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> r6 = r0.mTimeCycleAttributesMap
            if (r6 != 0) goto L177
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r0.mTimeCycleAttributesMap = r6
        L177:
            java.util.Iterator r1 = r1.iterator()
        L17b:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L1df
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> r7 = r0.mTimeCycleAttributesMap
            boolean r7 = r7.containsKey(r6)
            if (r7 == 0) goto L190
            goto L17b
        L190:
            boolean r7 = r6.startsWith(r9)
            if (r7 == 0) goto L1cd
            android.util.SparseArray r7 = new android.util.SparseArray
            r7.<init>()
            java.lang.String[] r11 = r6.split(r8)
            r11 = r11[r10]
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r12 = r0.mKeyList
            java.util.Iterator r12 = r12.iterator()
        L1a7:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L1c6
            java.lang.Object r13 = r12.next()
            androidx.constraintlayout.motion.widget.Key r13 = (androidx.constraintlayout.motion.widget.Key) r13
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14 = r13.mCustomConstraints
            if (r14 != 0) goto L1b8
            goto L1a7
        L1b8:
            java.lang.Object r14 = r14.get(r11)
            androidx.constraintlayout.widget.ConstraintAttribute r14 = (androidx.constraintlayout.widget.ConstraintAttribute) r14
            if (r14 == 0) goto L1a7
            int r13 = r13.mFramePosition
            r7.append(r13, r14)
            goto L1a7
        L1c6:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet r7 = androidx.constraintlayout.motion.widget.TimeCycleSplineSet.makeCustomSpline(r6, r7)
            r11 = r21
            goto L1d3
        L1cd:
            r11 = r21
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet r7 = androidx.constraintlayout.motion.widget.TimeCycleSplineSet.makeSpline(r6, r11)
        L1d3:
            if (r7 != 0) goto L1d6
            goto L17b
        L1d6:
            r7.setType(r6)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> r13 = r0.mTimeCycleAttributesMap
            r13.put(r6, r7)
            goto L17b
        L1df:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r1 = r0.mKeyList
            if (r1 == 0) goto L1ff
            java.util.Iterator r1 = r1.iterator()
        L1e7:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L1ff
            java.lang.Object r6 = r1.next()
            androidx.constraintlayout.motion.widget.Key r6 = (androidx.constraintlayout.motion.widget.Key) r6
            boolean r7 = r6 instanceof androidx.constraintlayout.motion.widget.KeyTimeCycle
            if (r7 == 0) goto L1e7
            androidx.constraintlayout.motion.widget.KeyTimeCycle r6 = (androidx.constraintlayout.motion.widget.KeyTimeCycle) r6
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> r7 = r0.mTimeCycleAttributesMap
            r6.addTimeValues(r7)
            goto L1e7
        L1ff:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> r1 = r0.mTimeCycleAttributesMap
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L209:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L233
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = r4.containsKey(r6)
            if (r7 == 0) goto L226
            java.lang.Object r7 = r4.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            goto L227
        L226:
            r7 = 0
        L227:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> r8 = r0.mTimeCycleAttributesMap
            java.lang.Object r6 = r8.get(r6)
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet r6 = (androidx.constraintlayout.motion.widget.TimeCycleSplineSet) r6
            r6.setup(r7)
            goto L209
        L233:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r1 = r0.mMotionPaths
            int r1 = r1.size()
            int r4 = r1 + 2
            androidx.constraintlayout.motion.widget.MotionPaths[] r6 = new androidx.constraintlayout.motion.widget.MotionPaths[r4]
            androidx.constraintlayout.motion.widget.MotionPaths r7 = r0.mStartMotionPath
            r6[r5] = r7
            int r1 = r1 + r10
            androidx.constraintlayout.motion.widget.MotionPaths r7 = r0.mEndMotionPath
            r6[r1] = r7
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r1 = r0.mMotionPaths
            int r1 = r1.size()
            if (r1 <= 0) goto L255
            int r1 = r0.mCurveFitType
            r7 = -1
            if (r1 != r7) goto L255
            r0.mCurveFitType = r5
        L255:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r1 = r0.mMotionPaths
            java.util.Iterator r1 = r1.iterator()
            r7 = 1
        L25c:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L26e
            java.lang.Object r8 = r1.next()
            androidx.constraintlayout.motion.widget.MotionPaths r8 = (androidx.constraintlayout.motion.widget.MotionPaths) r8
            int r11 = r7 + 1
            r6[r7] = r8
            r7 = r11
            goto L25c
        L26e:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            androidx.constraintlayout.motion.widget.MotionPaths r7 = r0.mEndMotionPath
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r7 = r7.attributes
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L27f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L2ae
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            androidx.constraintlayout.motion.widget.MotionPaths r11 = r0.mStartMotionPath
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r11 = r11.attributes
            boolean r11 = r11.containsKey(r8)
            if (r11 == 0) goto L27f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r8)
            java.lang.String r11 = r11.toString()
            boolean r11 = r2.contains(r11)
            if (r11 != 0) goto L27f
            r1.add(r8)
            goto L27f
        L2ae:
            java.lang.String[] r2 = new java.lang.String[r5]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.mAttributeNames = r1
            int r1 = r1.length
            int[] r1 = new int[r1]
            r0.mAttributeInterpCount = r1
            r1 = 0
        L2be:
            java.lang.String[] r2 = r0.mAttributeNames
            int r7 = r2.length
            if (r1 >= r7) goto L2f2
            r2 = r2[r1]
            int[] r7 = r0.mAttributeInterpCount
            r7[r1] = r5
            r7 = 0
        L2ca:
            if (r7 >= r4) goto L2ef
            r8 = r6[r7]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r8 = r8.attributes
            boolean r8 = r8.containsKey(r2)
            if (r8 == 0) goto L2ec
            int[] r8 = r0.mAttributeInterpCount
            r9 = r8[r1]
            r7 = r6[r7]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r7 = r7.attributes
            java.lang.Object r2 = r7.get(r2)
            androidx.constraintlayout.widget.ConstraintAttribute r2 = (androidx.constraintlayout.widget.ConstraintAttribute) r2
            int r2 = r2.noOfInterpValues()
            int r9 = r9 + r2
            r8[r1] = r9
            goto L2ef
        L2ec:
            int r7 = r7 + 1
            goto L2ca
        L2ef:
            int r1 = r1 + 1
            goto L2be
        L2f2:
            r1 = r6[r5]
            int r1 = r1.mPathMotionArc
            int r7 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r1 == r7) goto L2fc
            r1 = 1
            goto L2fd
        L2fc:
            r1 = 0
        L2fd:
            int r2 = r2.length
            r7 = 18
            int r7 = r7 + r2
            boolean[] r2 = new boolean[r7]
            r8 = 1
        L304:
            if (r8 >= r4) goto L314
            r9 = r6[r8]
            int r11 = r8 + (-1)
            r11 = r6[r11]
            java.lang.String[] r12 = r0.mAttributeNames
            r9.different(r11, r2, r12, r1)
            int r8 = r8 + 1
            goto L304
        L314:
            r1 = 1
            r8 = 0
        L316:
            if (r1 >= r7) goto L321
            boolean r9 = r2[r1]
            if (r9 == 0) goto L31e
            int r8 = r8 + 1
        L31e:
            int r1 = r1 + 1
            goto L316
        L321:
            int[] r1 = new int[r8]
            r0.mInterpolateVariables = r1
            int r8 = r1.length
            double[] r8 = new double[r8]
            r0.mInterpolateData = r8
            int r1 = r1.length
            double[] r1 = new double[r1]
            r0.mInterpolateVelocity = r1
            r1 = 1
            r8 = 0
        L331:
            if (r1 >= r7) goto L341
            boolean r9 = r2[r1]
            if (r9 == 0) goto L33e
            int[] r9 = r0.mInterpolateVariables
            int r11 = r8 + 1
            r9[r8] = r1
            r8 = r11
        L33e:
            int r1 = r1 + 1
            goto L331
        L341:
            int[] r1 = r0.mInterpolateVariables
            int r1 = r1.length
            r2 = 2
            int[] r7 = new int[r2]
            r7[r10] = r1
            r7[r5] = r4
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r1, r7)
            double[][] r7 = (double[][]) r7
            double[] r8 = new double[r4]
            r9 = 0
        L356:
            if (r9 >= r4) goto L36b
            r11 = r6[r9]
            r12 = r7[r9]
            int[] r13 = r0.mInterpolateVariables
            r11.fillStandard(r12, r13)
            r11 = r6[r9]
            float r11 = r11.time
            double r11 = (double) r11
            r8[r9] = r11
            int r9 = r9 + 1
            goto L356
        L36b:
            r9 = 0
        L36c:
            int[] r11 = r0.mInterpolateVariables
            int r12 = r11.length
            if (r9 >= r12) goto L3ad
            r11 = r11[r9]
            java.lang.String[] r12 = androidx.constraintlayout.motion.widget.MotionPaths.names
            int r12 = r12.length
            if (r11 >= r12) goto L3aa
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String[] r12 = androidx.constraintlayout.motion.widget.MotionPaths.names
            int[] r13 = r0.mInterpolateVariables
            r13 = r13[r9]
            r12 = r12[r13]
            r11.append(r12)
            java.lang.String r12 = " ["
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r12 = 0
        L392:
            if (r12 >= r4) goto L3aa
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            r11 = r7[r12]
            r14 = r11[r9]
            r13.append(r14)
            java.lang.String r11 = r13.toString()
            int r12 = r12 + 1
            goto L392
        L3aa:
            int r9 = r9 + 1
            goto L36c
        L3ad:
            java.lang.String[] r9 = r0.mAttributeNames
            int r9 = r9.length
            int r9 = r9 + r10
            androidx.constraintlayout.motion.utils.CurveFit[] r9 = new androidx.constraintlayout.motion.utils.CurveFit[r9]
            r0.mSpline = r9
            r9 = 0
        L3b6:
            java.lang.String[] r11 = r0.mAttributeNames
            int r12 = r11.length
            if (r9 >= r12) goto L420
            r11 = r11[r9]
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L3c1:
            if (r12 >= r4) goto L400
            r18 = 1
            r10 = r6[r12]
            boolean r10 = r10.hasCustomData(r11)
            if (r10 == 0) goto L3f6
            if (r15 != 0) goto L3e4
            double[] r13 = new double[r4]
            r10 = r6[r12]
            int r10 = r10.getCustomDataCount(r11)
            int[] r15 = new int[r2]
            r15[r18] = r10
            r15[r5] = r4
            java.lang.Object r10 = java.lang.reflect.Array.newInstance(r1, r15)
            r15 = r10
            double[][] r15 = (double[][]) r15
        L3e4:
            r10 = r6[r12]
            float r2 = r10.time
            r21 = r6
            double r5 = (double) r2
            r13[r14] = r5
            r2 = r15[r14]
            r5 = 0
            r10.getCustomData(r11, r2, r5)
            int r14 = r14 + 1
            goto L3f8
        L3f6:
            r21 = r6
        L3f8:
            int r12 = r12 + 1
            r6 = r21
            r2 = 2
            r5 = 0
            r10 = 1
            goto L3c1
        L400:
            r21 = r6
            r18 = 1
            double[] r2 = java.util.Arrays.copyOf(r13, r14)
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r15, r14)
            double[][] r5 = (double[][]) r5
            androidx.constraintlayout.motion.utils.CurveFit[] r6 = r0.mSpline
            int r9 = r9 + 1
            int r10 = r0.mCurveFitType
            androidx.constraintlayout.motion.utils.CurveFit r2 = androidx.constraintlayout.motion.utils.CurveFit.get(r10, r2, r5)
            r6[r9] = r2
            r6 = r21
            r2 = 2
            r5 = 0
            r10 = 1
            goto L3b6
        L420:
            r21 = r6
            r18 = 1
            androidx.constraintlayout.motion.utils.CurveFit[] r2 = r0.mSpline
            int r5 = r0.mCurveFitType
            androidx.constraintlayout.motion.utils.CurveFit r5 = androidx.constraintlayout.motion.utils.CurveFit.get(r5, r8, r7)
            r16 = 0
            r2[r16] = r5
            r2 = r21[r16]
            int r2 = r2.mPathMotionArc
            int r5 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r2 == r5) goto L46e
            int[] r2 = new int[r4]
            double[] r5 = new double[r4]
            r6 = 2
            int[] r7 = new int[r6]
            r7[r18] = r6
            r7[r16] = r4
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r7)
            double[][] r1 = (double[][]) r1
            r6 = 0
        L44a:
            if (r6 >= r4) goto L468
            r7 = r21[r6]
            int r8 = r7.mPathMotionArc
            r2[r6] = r8
            float r8 = r7.time
            double r8 = (double) r8
            r5[r6] = r8
            r8 = r1[r6]
            float r9 = r7.x
            double r9 = (double) r9
            r16 = 0
            r8[r16] = r9
            float r7 = r7.y
            double r9 = (double) r7
            r8[r18] = r9
            int r6 = r6 + 1
            goto L44a
        L468:
            androidx.constraintlayout.motion.utils.CurveFit r1 = androidx.constraintlayout.motion.utils.CurveFit.getArc(r2, r5, r1)
            r0.mArcSpline = r1
        L46e:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.mCycleMap = r1
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r1 = r0.mKeyList
            if (r1 == 0) goto L4e3
            java.util.Iterator r1 = r3.iterator()
            r2 = 2143289344(0x7fc00000, float:NaN)
        L47f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4ab
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            androidx.constraintlayout.motion.widget.KeyCycleOscillator r4 = androidx.constraintlayout.motion.widget.KeyCycleOscillator.makeSpline(r3)
            if (r4 != 0) goto L492
            goto L47f
        L492:
            boolean r5 = r4.variesByPath()
            if (r5 == 0) goto L4a2
            boolean r5 = java.lang.Float.isNaN(r2)
            if (r5 == 0) goto L4a2
            float r2 = r0.getPreCycleDistance()
        L4a2:
            r4.setType(r3)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> r5 = r0.mCycleMap
            r5.put(r3, r4)
            goto L47f
        L4ab:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r1 = r0.mKeyList
            java.util.Iterator r1 = r1.iterator()
        L4b1:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4c9
            java.lang.Object r3 = r1.next()
            androidx.constraintlayout.motion.widget.Key r3 = (androidx.constraintlayout.motion.widget.Key) r3
            boolean r4 = r3 instanceof androidx.constraintlayout.motion.widget.KeyCycle
            if (r4 == 0) goto L4b1
            androidx.constraintlayout.motion.widget.KeyCycle r3 = (androidx.constraintlayout.motion.widget.KeyCycle) r3
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> r4 = r0.mCycleMap
            r3.addCycleValues(r4)
            goto L4b1
        L4c9:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> r1 = r0.mCycleMap
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L4d3:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4e3
            java.lang.Object r3 = r1.next()
            androidx.constraintlayout.motion.widget.KeyCycleOscillator r3 = (androidx.constraintlayout.motion.widget.KeyCycleOscillator) r3
            r3.setup(r2)
            goto L4d3
        L4e3:
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " start: x: "
            r0.append(r1)
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r3.mStartMotionPath
            float r1 = r1.x
            r0.append(r1)
            java.lang.String r1 = " y: "
            r0.append(r1)
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r3.mStartMotionPath
            float r2 = r2.y
            r0.append(r2)
            java.lang.String r2 = " end: x: "
            r0.append(r2)
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r3.mEndMotionPath
            float r2 = r2.x
            r0.append(r2)
            r0.append(r1)
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r3.mEndMotionPath
            float r1 = r1.y
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
