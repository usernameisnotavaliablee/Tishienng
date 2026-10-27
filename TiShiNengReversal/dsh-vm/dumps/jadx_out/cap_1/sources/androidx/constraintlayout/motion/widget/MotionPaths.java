package androidx.constraintlayout.motion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class MotionPaths implements java.lang.Comparable<androidx.constraintlayout.motion.widget.MotionPaths> {
    static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    static final int PERPENDICULAR = 1;
    static final int SCREEN = 3;
    public static final java.lang.String TAG = "MotionPaths";
    static java.lang.String[] names;
    java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> attributes;
    float height;
    int mDrawPath;
    androidx.constraintlayout.motion.utils.Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mPathRotate;
    float mProgress;
    double[] mTempDelta;
    double[] mTempValue;
    float position;
    float time;
    float width;
    float x;
    float y;

    static {
            java.lang.String r4 = "height"
            java.lang.String r5 = "pathRotate"
            java.lang.String r0 = "position"
            java.lang.String r1 = "x"
            java.lang.String r2 = "y"
            java.lang.String r3 = "width"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            androidx.constraintlayout.motion.widget.MotionPaths.names = r0
            return
    }

    public MotionPaths() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mDrawPath = r0
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2.mPathRotate = r1
            r2.mProgress = r1
            int r1 = androidx.constraintlayout.motion.widget.Key.UNSET
            r2.mPathMotionArc = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r2.attributes = r1
            r2.mMode = r0
            r0 = 18
            double[] r1 = new double[r0]
            r2.mTempValue = r1
            double[] r0 = new double[r0]
            r2.mTempDelta = r0
            return
    }

    public MotionPaths(int r3, int r4, androidx.constraintlayout.motion.widget.KeyPosition r5, androidx.constraintlayout.motion.widget.MotionPaths r6, androidx.constraintlayout.motion.widget.MotionPaths r7) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mDrawPath = r0
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2.mPathRotate = r1
            r2.mProgress = r1
            int r1 = androidx.constraintlayout.motion.widget.Key.UNSET
            r2.mPathMotionArc = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r2.attributes = r1
            r2.mMode = r0
            r0 = 18
            double[] r1 = new double[r0]
            r2.mTempValue = r1
            double[] r0 = new double[r0]
            r2.mTempDelta = r0
            int r0 = r5.mPositionType
            r1 = 1
            if (r0 == r1) goto L34
            r1 = 2
            if (r0 == r1) goto L2f
            r2.initCartesian(r5, r6, r7)
            return
        L2f:
            r2.initScreen(r3, r4, r5, r6, r7)
            r3 = r2
            return
        L34:
            r3 = r2
            r2.initPath(r5, r6, r7)
            return
    }

    private boolean diff(float r4, float r5) {
            r3 = this;
            boolean r0 = java.lang.Float.isNaN(r4)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1d
            boolean r0 = java.lang.Float.isNaN(r5)
            if (r0 == 0) goto Lf
            goto L1d
        Lf:
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            r5 = 897988541(0x358637bd, float:1.0E-6)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L1c
            return r2
        L1c:
            return r1
        L1d:
            boolean r4 = java.lang.Float.isNaN(r4)
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r4 == r5) goto L28
            return r2
        L28:
            return r1
    }

    private static final float xRotate(float r0, float r1, float r2, float r3, float r4, float r5) {
            float r4 = r4 - r2
            float r5 = r5 - r3
            float r4 = r4 * r1
            float r5 = r5 * r0
            float r4 = r4 - r5
            float r4 = r4 + r2
            return r4
    }

    private static final float yRotate(float r0, float r1, float r2, float r3, float r4, float r5) {
            float r4 = r4 - r2
            float r5 = r5 - r3
            float r4 = r4 * r0
            float r5 = r5 * r1
            float r4 = r4 + r5
            float r4 = r4 + r3
            return r4
    }

    public void applyParameters(androidx.constraintlayout.widget.ConstraintSet.Constraint r6) {
            r5 = this;
            androidx.constraintlayout.widget.ConstraintSet$Motion r0 = r6.motion
            java.lang.String r0 = r0.mTransitionEasing
            androidx.constraintlayout.motion.utils.Easing r0 = androidx.constraintlayout.motion.utils.Easing.getInterpolator(r0)
            r5.mKeyFrameEasing = r0
            androidx.constraintlayout.widget.ConstraintSet$Motion r0 = r6.motion
            int r1 = r0.mPathMotionArc
            r5.mPathMotionArc = r1
            float r1 = r0.mPathRotate
            r5.mPathRotate = r1
            int r0 = r0.mDrawPath
            r5.mDrawPath = r0
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r0 = r6.propertySet
            float r0 = r0.mProgress
            r5.mProgress = r0
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r6.mCustomConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r6.mCustomConstraints
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.widget.ConstraintAttribute r2 = (androidx.constraintlayout.widget.ConstraintAttribute) r2
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = r2.getType()
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r4 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE
            if (r3 == r4) goto L28
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r5.attributes
            r3.put(r1, r2)
            goto L28
        L4a:
            return
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(@androidx.annotation.NonNull androidx.constraintlayout.motion.widget.MotionPaths r2) {
            r1 = this;
            float r0 = r1.position
            float r2 = r2.position
            int r2 = java.lang.Float.compare(r0, r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(@androidx.annotation.NonNull androidx.constraintlayout.motion.widget.MotionPaths r1) {
            r0 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r1 = (androidx.constraintlayout.motion.widget.MotionPaths) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    void different(androidx.constraintlayout.motion.widget.MotionPaths r4, boolean[] r5, java.lang.String[] r6, boolean r7) {
            r3 = this;
            r6 = 0
            boolean r0 = r5[r6]
            float r1 = r3.position
            float r2 = r4.position
            boolean r1 = r3.diff(r1, r2)
            r0 = r0 | r1
            r5[r6] = r0
            r6 = 1
            boolean r0 = r5[r6]
            float r1 = r3.x
            float r2 = r4.x
            boolean r1 = r3.diff(r1, r2)
            r1 = r1 | r7
            r0 = r0 | r1
            r5[r6] = r0
            r6 = 2
            boolean r0 = r5[r6]
            float r1 = r3.y
            float r2 = r4.y
            boolean r1 = r3.diff(r1, r2)
            r7 = r7 | r1
            r7 = r7 | r0
            r5[r6] = r7
            r6 = 3
            boolean r7 = r5[r6]
            float r0 = r3.width
            float r1 = r4.width
            boolean r0 = r3.diff(r0, r1)
            r7 = r7 | r0
            r5[r6] = r7
            r6 = 4
            boolean r7 = r5[r6]
            float r0 = r3.height
            float r4 = r4.height
            boolean r4 = r3.diff(r0, r4)
            r4 = r4 | r7
            r5[r6] = r4
            return
    }

    void fillStandard(double[] r10, int[] r11) {
            r9 = this;
            float r0 = r9.position
            float r1 = r9.x
            float r2 = r9.y
            float r3 = r9.width
            float r4 = r9.height
            float r5 = r9.mPathRotate
            r6 = 6
            float[] r7 = new float[r6]
            r8 = 0
            r7[r8] = r0
            r0 = 1
            r7[r0] = r1
            r0 = 2
            r7[r0] = r2
            r0 = 3
            r7[r0] = r3
            r0 = 4
            r7[r0] = r4
            r0 = 5
            r7[r0] = r5
            r0 = 0
        L22:
            int r1 = r11.length
            if (r8 >= r1) goto L34
            r1 = r11[r8]
            if (r1 >= r6) goto L31
            int r2 = r0 + 1
            r1 = r7[r1]
            double r3 = (double) r1
            r10[r0] = r3
            r0 = r2
        L31:
            int r8 = r8 + 1
            goto L22
        L34:
            return
    }

    void getBounds(int[] r7, double[] r8, float[] r9, int r10) {
            r6 = this;
            float r0 = r6.width
            float r1 = r6.height
            r2 = 0
        L5:
            int r3 = r7.length
            if (r2 >= r3) goto L1a
            r3 = r8[r2]
            float r3 = (float) r3
            r4 = r7[r2]
            r5 = 3
            if (r4 == r5) goto L16
            r5 = 4
            if (r4 == r5) goto L14
            goto L17
        L14:
            r1 = r3
            goto L17
        L16:
            r0 = r3
        L17:
            int r2 = r2 + 1
            goto L5
        L1a:
            r9[r10] = r0
            int r10 = r10 + 1
            r9[r10] = r1
            return
    }

    void getCenter(int[] r10, double[] r11, float[] r12, int r13) {
            r9 = this;
            float r0 = r9.x
            float r1 = r9.y
            float r2 = r9.width
            float r3 = r9.height
            r4 = 0
        L9:
            int r5 = r10.length
            r6 = 1
            if (r4 >= r5) goto L28
            r7 = r11[r4]
            float r5 = (float) r7
            r7 = r10[r4]
            if (r7 == r6) goto L24
            r6 = 2
            if (r7 == r6) goto L22
            r6 = 3
            if (r7 == r6) goto L20
            r6 = 4
            if (r7 == r6) goto L1e
            goto L25
        L1e:
            r3 = r5
            goto L25
        L20:
            r2 = r5
            goto L25
        L22:
            r1 = r5
            goto L25
        L24:
            r0 = r5
        L25:
            int r4 = r4 + 1
            goto L9
        L28:
            r10 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r10
            float r0 = r0 + r2
            r11 = 0
            float r0 = r0 + r11
            r12[r13] = r0
            int r13 = r13 + r6
            float r3 = r3 / r10
            float r1 = r1 + r3
            float r1 = r1 + r11
            r12[r13] = r1
            return
    }

    int getCustomData(java.lang.String r6, double[] r7, int r8) {
            r5 = this;
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r5.attributes
            java.lang.Object r6 = r0.get(r6)
            androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
            int r0 = r6.noOfInterpValues()
            r1 = 1
            if (r0 != r1) goto L17
            float r6 = r6.getValueToInterpolate()
            double r2 = (double) r6
            r7[r8] = r2
            return r1
        L17:
            int r0 = r6.noOfInterpValues()
            float[] r1 = new float[r0]
            r6.getValuesToInterpolate(r1)
            r6 = 0
        L21:
            if (r6 >= r0) goto L2e
            int r2 = r8 + 1
            r3 = r1[r6]
            double r3 = (double) r3
            r7[r8] = r3
            int r6 = r6 + 1
            r8 = r2
            goto L21
        L2e:
            return r0
    }

    int getCustomDataCount(java.lang.String r2) {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r1.attributes
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.widget.ConstraintAttribute r2 = (androidx.constraintlayout.widget.ConstraintAttribute) r2
            int r2 = r2.noOfInterpValues()
            return r2
    }

    void getRect(int[] r9, double[] r10, float[] r11, int r12) {
            r8 = this;
            float r0 = r8.x
            float r1 = r8.y
            float r2 = r8.width
            float r3 = r8.height
            r4 = 0
        L9:
            int r5 = r9.length
            if (r4 >= r5) goto L28
            r5 = r10[r4]
            float r5 = (float) r5
            r6 = r9[r4]
            r7 = 1
            if (r6 == r7) goto L24
            r7 = 2
            if (r6 == r7) goto L22
            r7 = 3
            if (r6 == r7) goto L20
            r7 = 4
            if (r6 == r7) goto L1e
            goto L25
        L1e:
            r3 = r5
            goto L25
        L20:
            r2 = r5
            goto L25
        L22:
            r1 = r5
            goto L25
        L24:
            r0 = r5
        L25:
            int r4 = r4 + 1
            goto L9
        L28:
            float r2 = r2 + r0
            float r3 = r3 + r1
            r9 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float.isNaN(r9)
            java.lang.Float.isNaN(r9)
            r9 = 0
            float r10 = r0 + r9
            float r4 = r1 + r9
            float r5 = r2 + r9
            float r1 = r1 + r9
            float r2 = r2 + r9
            float r6 = r3 + r9
            float r0 = r0 + r9
            float r3 = r3 + r9
            int r9 = r12 + 1
            r11[r12] = r10
            int r10 = r12 + 2
            r11[r9] = r4
            int r9 = r12 + 3
            r11[r10] = r5
            int r10 = r12 + 4
            r11[r9] = r1
            int r9 = r12 + 5
            r11[r10] = r2
            int r10 = r12 + 6
            r11[r9] = r6
            int r12 = r12 + 7
            r11[r10] = r0
            r11[r12] = r3
            return
    }

    boolean hasCustomData(java.lang.String r2) {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r1.attributes
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    void initCartesian(androidx.constraintlayout.motion.widget.KeyPosition r20, androidx.constraintlayout.motion.widget.MotionPaths r21, androidx.constraintlayout.motion.widget.MotionPaths r22) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            int r4 = r1.mFramePosition
            float r4 = (float) r4
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r5
            r0.time = r4
            int r5 = r1.mDrawPath
            r0.mDrawPath = r5
            float r5 = r1.mPercentWidth
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L1e
            r5 = r4
            goto L20
        L1e:
            float r5 = r1.mPercentWidth
        L20:
            float r6 = r1.mPercentHeight
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 == 0) goto L2a
            r6 = r4
            goto L2c
        L2a:
            float r6 = r1.mPercentHeight
        L2c:
            float r7 = r3.width
            float r8 = r2.width
            float r9 = r7 - r8
            float r10 = r3.height
            float r11 = r2.height
            float r12 = r10 - r11
            float r13 = r0.time
            r0.position = r13
            float r13 = r2.x
            r14 = 1073741824(0x40000000, float:2.0)
            float r15 = r8 / r14
            float r15 = r15 + r13
            r16 = 1073741824(0x40000000, float:2.0)
            float r14 = r2.y
            float r17 = r11 / r16
            float r17 = r14 + r17
            r18 = r4
            float r4 = r3.x
            float r7 = r7 / r16
            float r4 = r4 + r7
            float r3 = r3.y
            float r10 = r10 / r16
            float r3 = r3 + r10
            float r4 = r4 - r15
            float r3 = r3 - r17
            float r7 = r4 * r18
            float r13 = r13 + r7
            float r9 = r9 * r5
            float r5 = r9 / r16
            float r13 = r13 - r5
            int r7 = (int) r13
            float r7 = (float) r7
            r0.x = r7
            float r7 = r3 * r18
            float r14 = r14 + r7
            float r12 = r12 * r6
            float r6 = r12 / r16
            float r14 = r14 - r6
            int r7 = (int) r14
            float r7 = (float) r7
            r0.y = r7
            float r8 = r8 + r9
            int r7 = (int) r8
            float r7 = (float) r7
            r0.width = r7
            float r11 = r11 + r12
            int r7 = (int) r11
            float r7 = (float) r7
            r0.height = r7
            float r7 = r1.mPercentX
            boolean r7 = java.lang.Float.isNaN(r7)
            if (r7 == 0) goto L87
            r7 = r18
            goto L89
        L87:
            float r7 = r1.mPercentX
        L89:
            float r8 = r1.mAltPercentY
            boolean r8 = java.lang.Float.isNaN(r8)
            r9 = 0
            if (r8 == 0) goto L94
            r8 = 0
            goto L96
        L94:
            float r8 = r1.mAltPercentY
        L96:
            float r10 = r1.mPercentY
            boolean r10 = java.lang.Float.isNaN(r10)
            if (r10 == 0) goto L9f
            goto La3
        L9f:
            float r10 = r1.mPercentY
            r18 = r10
        La3:
            float r10 = r1.mAltPercentX
            boolean r10 = java.lang.Float.isNaN(r10)
            if (r10 == 0) goto Lac
            goto Lae
        Lac:
            float r9 = r1.mAltPercentX
        Lae:
            r10 = 2
            r0.mMode = r10
            float r10 = r2.x
            float r7 = r7 * r4
            float r10 = r10 + r7
            float r9 = r9 * r3
            float r10 = r10 + r9
            float r10 = r10 - r5
            int r5 = (int) r10
            float r5 = (float) r5
            r0.x = r5
            float r2 = r2.y
            float r4 = r4 * r8
            float r2 = r2 + r4
            float r3 = r3 * r18
            float r2 = r2 + r3
            float r2 = r2 - r6
            int r2 = (int) r2
            float r2 = (float) r2
            r0.y = r2
            java.lang.String r2 = r1.mTransitionEasing
            androidx.constraintlayout.motion.utils.Easing r2 = androidx.constraintlayout.motion.utils.Easing.getInterpolator(r2)
            r0.mKeyFrameEasing = r2
            int r1 = r1.mPathMotionArc
            r0.mPathMotionArc = r1
            return
    }

    void initPath(androidx.constraintlayout.motion.widget.KeyPosition r19, androidx.constraintlayout.motion.widget.MotionPaths r20, androidx.constraintlayout.motion.widget.MotionPaths r21) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            int r4 = r1.mFramePosition
            float r4 = (float) r4
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r5
            r0.time = r4
            int r5 = r1.mDrawPath
            r0.mDrawPath = r5
            float r5 = r1.mPercentWidth
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L1e
            r5 = r4
            goto L20
        L1e:
            float r5 = r1.mPercentWidth
        L20:
            float r6 = r1.mPercentHeight
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 == 0) goto L2a
            r6 = r4
            goto L2c
        L2a:
            float r6 = r1.mPercentHeight
        L2c:
            float r7 = r3.width
            float r8 = r2.width
            float r7 = r7 - r8
            float r8 = r3.height
            float r9 = r2.height
            float r8 = r8 - r9
            float r9 = r0.time
            r0.position = r9
            float r9 = r1.mPercentX
            boolean r9 = java.lang.Float.isNaN(r9)
            if (r9 == 0) goto L43
            goto L45
        L43:
            float r4 = r1.mPercentX
        L45:
            float r9 = r2.x
            float r10 = r2.width
            r11 = 1073741824(0x40000000, float:2.0)
            float r12 = r10 / r11
            float r12 = r12 + r9
            float r13 = r2.y
            float r14 = r2.height
            float r15 = r14 / r11
            float r15 = r15 + r13
            r16 = 1073741824(0x40000000, float:2.0)
            float r11 = r3.x
            r17 = r4
            float r4 = r3.width
            float r4 = r4 / r16
            float r11 = r11 + r4
            float r4 = r3.y
            float r3 = r3.height
            float r3 = r3 / r16
            float r4 = r4 + r3
            float r11 = r11 - r12
            float r4 = r4 - r15
            float r3 = r11 * r17
            float r9 = r9 + r3
            float r7 = r7 * r5
            float r5 = r7 / r16
            float r9 = r9 - r5
            int r9 = (int) r9
            float r9 = (float) r9
            r0.x = r9
            float r9 = r4 * r17
            float r13 = r13 + r9
            float r8 = r8 * r6
            float r6 = r8 / r16
            float r13 = r13 - r6
            int r12 = (int) r13
            float r12 = (float) r12
            r0.y = r12
            float r10 = r10 + r7
            int r7 = (int) r10
            float r7 = (float) r7
            r0.width = r7
            float r14 = r14 + r8
            int r7 = (int) r14
            float r7 = (float) r7
            r0.height = r7
            float r7 = r1.mPercentY
            boolean r7 = java.lang.Float.isNaN(r7)
            if (r7 == 0) goto L95
            r7 = 0
            goto L97
        L95:
            float r7 = r1.mPercentY
        L97:
            float r4 = -r4
            float r4 = r4 * r7
            float r11 = r11 * r7
            r7 = 1
            r0.mMode = r7
            float r7 = r2.x
            float r7 = r7 + r3
            float r7 = r7 - r5
            int r3 = (int) r7
            float r3 = (float) r3
            float r2 = r2.y
            float r2 = r2 + r9
            float r2 = r2 - r6
            int r2 = (int) r2
            float r2 = (float) r2
            float r3 = r3 + r4
            r0.x = r3
            float r2 = r2 + r11
            r0.y = r2
            java.lang.String r2 = r1.mTransitionEasing
            androidx.constraintlayout.motion.utils.Easing r2 = androidx.constraintlayout.motion.utils.Easing.getInterpolator(r2)
            r0.mKeyFrameEasing = r2
            int r1 = r1.mPathMotionArc
            r0.mPathMotionArc = r1
            return
    }

    void initScreen(int r19, int r20, androidx.constraintlayout.motion.widget.KeyPosition r21, androidx.constraintlayout.motion.widget.MotionPaths r22, androidx.constraintlayout.motion.widget.MotionPaths r23) {
            r18 = this;
            r0 = r18
            r1 = r21
            r2 = r22
            r3 = r23
            int r4 = r1.mFramePosition
            float r4 = (float) r4
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r5
            r0.time = r4
            int r5 = r1.mDrawPath
            r0.mDrawPath = r5
            float r5 = r1.mPercentWidth
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L1e
            r5 = r4
            goto L20
        L1e:
            float r5 = r1.mPercentWidth
        L20:
            float r6 = r1.mPercentHeight
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 == 0) goto L2a
            r6 = r4
            goto L2c
        L2a:
            float r6 = r1.mPercentHeight
        L2c:
            float r7 = r3.width
            float r8 = r2.width
            float r9 = r7 - r8
            float r10 = r3.height
            float r11 = r2.height
            float r12 = r10 - r11
            float r13 = r0.time
            r0.position = r13
            float r13 = r2.x
            r14 = 1073741824(0x40000000, float:2.0)
            float r15 = r8 / r14
            float r15 = r15 + r13
            float r2 = r2.y
            float r16 = r11 / r14
            float r16 = r2 + r16
            r17 = 1073741824(0x40000000, float:2.0)
            float r14 = r3.x
            float r7 = r7 / r17
            float r14 = r14 + r7
            float r3 = r3.y
            float r10 = r10 / r17
            float r3 = r3 + r10
            float r14 = r14 - r15
            float r3 = r3 - r16
            float r14 = r14 * r4
            float r13 = r13 + r14
            float r9 = r9 * r5
            float r5 = r9 / r17
            float r13 = r13 - r5
            int r5 = (int) r13
            float r5 = (float) r5
            r0.x = r5
            float r3 = r3 * r4
            float r2 = r2 + r3
            float r12 = r12 * r6
            float r3 = r12 / r17
            float r2 = r2 - r3
            int r2 = (int) r2
            float r2 = (float) r2
            r0.y = r2
            float r8 = r8 + r9
            int r2 = (int) r8
            float r2 = (float) r2
            r0.width = r2
            float r11 = r11 + r12
            int r2 = (int) r11
            float r2 = (float) r2
            r0.height = r2
            r2 = 3
            r0.mMode = r2
            float r2 = r1.mPercentX
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L95
            r2 = r19
            float r2 = (float) r2
            float r3 = r0.width
            float r2 = r2 - r3
            int r2 = (int) r2
            float r3 = r1.mPercentX
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = (int) r3
            float r2 = (float) r2
            r0.x = r2
        L95:
            float r2 = r1.mPercentY
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto Lad
            r2 = r20
            float r2 = (float) r2
            float r3 = r0.height
            float r2 = r2 - r3
            int r2 = (int) r2
            float r3 = r1.mPercentY
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = (int) r3
            float r2 = (float) r2
            r0.y = r2
        Lad:
            java.lang.String r2 = r1.mTransitionEasing
            androidx.constraintlayout.motion.utils.Easing r2 = androidx.constraintlayout.motion.utils.Easing.getInterpolator(r2)
            r0.mKeyFrameEasing = r2
            int r1 = r1.mPathMotionArc
            r0.mPathMotionArc = r1
            return
    }

    void setBounds(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.x = r1
            r0.y = r2
            r0.width = r3
            r0.height = r4
            return
    }

    void setDpDt(float r13, float r14, float[] r15, int[] r16, double[] r17, double[] r18) {
            r12 = this;
            r0 = r16
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L9:
            int r8 = r0.length
            r9 = 1
            if (r3 >= r8) goto L2a
            r10 = r17[r3]
            float r8 = (float) r10
            r10 = r18[r3]
            r10 = r0[r3]
            if (r10 == r9) goto L26
            r9 = 2
            if (r10 == r9) goto L24
            r9 = 3
            if (r10 == r9) goto L22
            r9 = 4
            if (r10 == r9) goto L20
            goto L27
        L20:
            r7 = r8
            goto L27
        L22:
            r5 = r8
            goto L27
        L24:
            r6 = r8
            goto L27
        L26:
            r4 = r8
        L27:
            int r3 = r3 + 1
            goto L9
        L2a:
            float r0 = r1 * r5
            r3 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r3
            float r4 = r4 - r0
            float r0 = r1 * r7
            float r0 = r0 / r3
            float r6 = r6 - r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r0
            float r7 = r7 * r0
            float r5 = r5 + r4
            float r7 = r7 + r6
            float r3 = r0 - r13
            float r4 = r4 * r3
            float r5 = r5 * r13
            float r4 = r4 + r5
            float r4 = r4 + r1
            r15[r2] = r4
            float r0 = r0 - r14
            float r6 = r6 * r0
            float r7 = r7 * r14
            float r6 = r6 + r7
            float r6 = r6 + r1
            r15[r9] = r6
            return
    }

    void setView(android.view.View r20, int[] r21, double[] r22, double[] r23, double[] r24) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            float r3 = r0.x
            float r4 = r0.y
            float r5 = r0.width
            float r6 = r0.height
            int r7 = r2.length
            r8 = 1
            if (r7 == 0) goto L28
            double[] r7 = r0.mTempValue
            int r7 = r7.length
            int r9 = r2.length
            int r9 = r9 - r8
            r9 = r2[r9]
            if (r7 > r9) goto L28
            int r7 = r2.length
            int r7 = r7 - r8
            r7 = r2[r7]
            int r7 = r7 + r8
            double[] r9 = new double[r7]
            r0.mTempValue = r9
            double[] r7 = new double[r7]
            r0.mTempDelta = r7
        L28:
            double[] r7 = r0.mTempValue
            r9 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.util.Arrays.fill(r7, r9)
            r7 = 0
            r9 = 0
        L31:
            int r10 = r2.length
            if (r9 >= r10) goto L45
            double[] r10 = r0.mTempValue
            r11 = r2[r9]
            r12 = r22[r9]
            r10[r11] = r12
            double[] r10 = r0.mTempDelta
            r12 = r23[r9]
            r10[r11] = r12
            int r9 = r9 + 1
            goto L31
        L45:
            r10 = 2143289344(0x7fc00000, float:NaN)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L4b:
            double[] r15 = r0.mTempValue
            int r2 = r15.length
            if (r7 >= r2) goto Lb3
            r16 = r15[r7]
            boolean r2 = java.lang.Double.isNaN(r16)
            r15 = 0
            if (r2 == 0) goto L68
            if (r24 == 0) goto L62
            r17 = r24[r7]
            int r2 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r2 != 0) goto L68
        L62:
            r23 = r10
            r22 = 2143289344(0x7fc00000, float:NaN)
            r10 = r3
            goto L99
        L68:
            if (r24 == 0) goto L6c
            r15 = r24[r7]
        L6c:
            double[] r2 = r0.mTempValue
            r17 = r2[r7]
            boolean r2 = java.lang.Double.isNaN(r17)
            if (r2 == 0) goto L7c
        L76:
            r23 = r10
            r9 = r15
            r22 = 2143289344(0x7fc00000, float:NaN)
            goto L83
        L7c:
            double[] r2 = r0.mTempValue
            r17 = r2[r7]
            double r15 = r17 + r15
            goto L76
        L83:
            float r2 = (float) r9
            double[] r9 = r0.mTempDelta
            r15 = r2
            r10 = r3
            r2 = r9[r7]
            float r2 = (float) r2
            if (r7 == r8) goto Lac
            r3 = 2
            if (r7 == r3) goto La8
            r3 = 3
            if (r7 == r3) goto La4
            r3 = 4
            if (r7 == r3) goto La0
            r2 = 5
            if (r7 == r2) goto L9d
        L99:
            r3 = r10
        L9a:
            r10 = r23
            goto Lb0
        L9d:
            r3 = r10
            r10 = r15
            goto Lb0
        La0:
            r14 = r2
            r3 = r10
            r6 = r15
            goto L9a
        La4:
            r12 = r2
            r3 = r10
            r5 = r15
            goto L9a
        La8:
            r13 = r2
            r3 = r10
            r4 = r15
            goto L9a
        Lac:
            r10 = r23
            r11 = r2
            r3 = r15
        Lb0:
            int r7 = r7 + 1
            goto L4b
        Lb3:
            r23 = r10
            r22 = 2143289344(0x7fc00000, float:NaN)
            r10 = r3
            boolean r2 = java.lang.Float.isNaN(r23)
            if (r2 == 0) goto Lca
            boolean r2 = java.lang.Float.isNaN(r22)
            if (r2 != 0) goto Led
            r2 = 2143289344(0x7fc00000, float:NaN)
            r1.setRotation(r2)
            goto Led
        Lca:
            r2 = 2143289344(0x7fc00000, float:NaN)
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 == 0) goto Ld3
            r2 = 0
        Ld3:
            r3 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r3
            float r11 = r11 + r12
            float r14 = r14 / r3
            float r13 = r13 + r14
            double r2 = (double) r2
            r9 = r23
            double r7 = (double) r9
            double r12 = (double) r13
            double r14 = (double) r11
            double r11 = java.lang.Math.atan2(r12, r14)
            double r11 = java.lang.Math.toDegrees(r11)
            double r7 = r7 + r11
            double r2 = r2 + r7
            float r2 = (float) r2
            r1.setRotation(r2)
        Led:
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r10 + r2
            int r7 = (int) r3
            float r4 = r4 + r2
            int r2 = (int) r4
            float r3 = r3 + r5
            int r3 = (int) r3
            float r4 = r4 + r6
            int r4 = (int) r4
            int r5 = r3 - r7
            int r6 = r4 - r2
            int r8 = r1.getMeasuredWidth()
            if (r5 != r8) goto L108
            int r8 = r1.getMeasuredHeight()
            if (r6 == r8) goto L115
        L108:
            r8 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r8)
            r1.measure(r5, r6)
        L115:
            r1.layout(r7, r2, r3, r4)
            return
    }
}
