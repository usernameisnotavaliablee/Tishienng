package androidx.constraintlayout.motion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class TouchResponse {
    private static final boolean DEBUG = false;
    static final int FLAG_DISABLE_POST_SCROLL = 1;
    static final int FLAG_DISABLE_SCROLL = 2;
    private static final int SIDE_BOTTOM = 3;
    private static final int SIDE_END = 6;
    private static final int SIDE_LEFT = 1;
    private static final int SIDE_MIDDLE = 4;
    private static final int SIDE_RIGHT = 2;
    private static final int SIDE_START = 5;
    private static final int SIDE_TOP = 0;
    private static final java.lang.String TAG = "TouchResponse";
    private static final float[][] TOUCH_DIRECTION = null;
    private static final int TOUCH_DOWN = 1;
    private static final int TOUCH_END = 5;
    private static final int TOUCH_LEFT = 2;
    private static final int TOUCH_RIGHT = 3;
    private static final float[][] TOUCH_SIDES = null;
    private static final int TOUCH_START = 4;
    private static final int TOUCH_UP = 0;
    private float[] mAnchorDpDt;
    private float mDragScale;
    private boolean mDragStarted;
    private float mDragThreshold;
    private int mFlags;
    private float mLastTouchX;
    private float mLastTouchY;
    private int mLimitBoundsTo;
    private float mMaxAcceleration;
    private float mMaxVelocity;
    private final androidx.constraintlayout.motion.widget.MotionLayout mMotionLayout;
    private boolean mMoveWhenScrollAtTop;
    private int mOnTouchUp;
    private int mTouchAnchorId;
    private int mTouchAnchorSide;
    private float mTouchAnchorX;
    private float mTouchAnchorY;
    private float mTouchDirectionX;
    private float mTouchDirectionY;
    private int mTouchRegionId;
    private int mTouchSide;



    static {
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x006c: FILL_ARRAY_DATA , data: [1056964608, 0} // fill-array
            float[] r2 = new float[r0]
            r2 = {x0074: FILL_ARRAY_DATA , data: [0, 1056964608} // fill-array
            float[] r3 = new float[r0]
            r3 = {x007c: FILL_ARRAY_DATA , data: [1065353216, 1056964608} // fill-array
            float[] r4 = new float[r0]
            r4 = {x0084: FILL_ARRAY_DATA , data: [1056964608, 1065353216} // fill-array
            float[] r5 = new float[r0]
            r5 = {x008c: FILL_ARRAY_DATA , data: [1056964608, 1056964608} // fill-array
            float[] r6 = new float[r0]
            r6 = {x0094: FILL_ARRAY_DATA , data: [0, 1056964608} // fill-array
            float[] r7 = new float[r0]
            r7 = {x009c: FILL_ARRAY_DATA , data: [1065353216, 1056964608} // fill-array
            r8 = 7
            float[][] r8 = new float[r8][]
            r9 = 0
            r8[r9] = r1
            r1 = 1
            r8[r1] = r2
            r8[r0] = r3
            r2 = 3
            r8[r2] = r4
            r3 = 4
            r8[r3] = r5
            r4 = 5
            r8[r4] = r6
            r5 = 6
            r8[r5] = r7
            androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_SIDES = r8
            float[] r6 = new float[r0]
            r6 = {x00a4: FILL_ARRAY_DATA , data: [0, -1082130432} // fill-array
            float[] r7 = new float[r0]
            r7 = {x00ac: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            float[] r8 = new float[r0]
            r8 = {x00b4: FILL_ARRAY_DATA , data: [-1082130432, 0} // fill-array
            float[] r10 = new float[r0]
            r10 = {x00bc: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            float[] r11 = new float[r0]
            r11 = {x00c4: FILL_ARRAY_DATA , data: [-1082130432, 0} // fill-array
            float[] r12 = new float[r0]
            r12 = {x00cc: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            float[][] r5 = new float[r5][]
            r5[r9] = r6
            r5[r1] = r7
            r5[r0] = r8
            r5[r2] = r10
            r5[r3] = r11
            r5[r4] = r12
            androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_DIRECTION = r5
            return
    }

    TouchResponse(android.content.Context r4, androidx.constraintlayout.motion.widget.MotionLayout r5, org.xmlpull.v1.XmlPullParser r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mTouchAnchorSide = r0
            r3.mTouchSide = r0
            r3.mOnTouchUp = r0
            r1 = -1
            r3.mTouchAnchorId = r1
            r3.mTouchRegionId = r1
            r3.mLimitBoundsTo = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r3.mTouchAnchorY = r1
            r3.mTouchAnchorX = r1
            r1 = 0
            r3.mTouchDirectionX = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.mTouchDirectionY = r1
            r3.mDragStarted = r0
            r2 = 2
            float[] r2 = new float[r2]
            r3.mAnchorDpDt = r2
            r2 = 1082130432(0x40800000, float:4.0)
            r3.mMaxVelocity = r2
            r2 = 1067030938(0x3f99999a, float:1.2)
            r3.mMaxAcceleration = r2
            r2 = 1
            r3.mMoveWhenScrollAtTop = r2
            r3.mDragScale = r1
            r3.mFlags = r0
            r0 = 1092616192(0x41200000, float:10.0)
            r3.mDragThreshold = r0
            r3.mMotionLayout = r5
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r6)
            r3.fillFromAttributeList(r4, r5)
            return
    }

    private void fill(android.content.res.TypedArray r7) {
            r6 = this;
            int r0 = r7.getIndexCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto Lc3
            int r3 = r7.getIndex(r2)
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_touchAnchorId
            if (r3 != r4) goto L1a
            int r4 = r6.mTouchAnchorId
            int r3 = r7.getResourceId(r3, r4)
            r6.mTouchAnchorId = r3
            goto Lbf
        L1a:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_touchAnchorSide
            r5 = 1
            if (r3 != r4) goto L35
            int r4 = r6.mTouchAnchorSide
            int r3 = r7.getInt(r3, r4)
            r6.mTouchAnchorSide = r3
            float[][] r4 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_SIDES
            r3 = r4[r3]
            r4 = r3[r1]
            r6.mTouchAnchorX = r4
            r3 = r3[r5]
            r6.mTouchAnchorY = r3
            goto Lbf
        L35:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_dragDirection
            if (r3 != r4) goto L4f
            int r4 = r6.mTouchSide
            int r3 = r7.getInt(r3, r4)
            r6.mTouchSide = r3
            float[][] r4 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_DIRECTION
            r3 = r4[r3]
            r4 = r3[r1]
            r6.mTouchDirectionX = r4
            r3 = r3[r5]
            r6.mTouchDirectionY = r3
            goto Lbf
        L4f:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_maxVelocity
            if (r3 != r4) goto L5c
            float r4 = r6.mMaxVelocity
            float r3 = r7.getFloat(r3, r4)
            r6.mMaxVelocity = r3
            goto Lbf
        L5c:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_maxAcceleration
            if (r3 != r4) goto L69
            float r4 = r6.mMaxAcceleration
            float r3 = r7.getFloat(r3, r4)
            r6.mMaxAcceleration = r3
            goto Lbf
        L69:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_moveWhenScrollAtTop
            if (r3 != r4) goto L76
            boolean r4 = r6.mMoveWhenScrollAtTop
            boolean r3 = r7.getBoolean(r3, r4)
            r6.mMoveWhenScrollAtTop = r3
            goto Lbf
        L76:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_dragScale
            if (r3 != r4) goto L83
            float r4 = r6.mDragScale
            float r3 = r7.getFloat(r3, r4)
            r6.mDragScale = r3
            goto Lbf
        L83:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_dragThreshold
            if (r3 != r4) goto L90
            float r4 = r6.mDragThreshold
            float r3 = r7.getFloat(r3, r4)
            r6.mDragThreshold = r3
            goto Lbf
        L90:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_touchRegionId
            if (r3 != r4) goto L9d
            int r4 = r6.mTouchRegionId
            int r3 = r7.getResourceId(r3, r4)
            r6.mTouchRegionId = r3
            goto Lbf
        L9d:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_onTouchUp
            if (r3 != r4) goto Laa
            int r4 = r6.mOnTouchUp
            int r3 = r7.getInt(r3, r4)
            r6.mOnTouchUp = r3
            goto Lbf
        Laa:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_nestedScrollFlags
            if (r3 != r4) goto Lb5
            int r3 = r7.getInteger(r3, r1)
            r6.mFlags = r3
            goto Lbf
        Lb5:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_limitBoundsTo
            if (r3 != r4) goto Lbf
            int r3 = r7.getResourceId(r3, r1)
            r6.mLimitBoundsTo = r3
        Lbf:
            int r2 = r2 + 1
            goto L6
        Lc3:
            return
    }

    private void fillFromAttributeList(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int[] r0 = androidx.constraintlayout.widget.R.styleable.OnSwipe
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            r1.fill(r2)
            r2.recycle()
            return
    }

    float dot(float r2, float r3) {
            r1 = this;
            float r0 = r1.mTouchDirectionX
            float r2 = r2 * r0
            float r0 = r1.mTouchDirectionY
            float r3 = r3 * r0
            float r2 = r2 + r3
            return r2
    }

    public int getAnchorId() {
            r1 = this;
            int r0 = r1.mTouchAnchorId
            return r0
    }

    public int getFlags() {
            r1 = this;
            int r0 = r1.mFlags
            return r0
    }

    android.graphics.RectF getLimitBoundsTo(android.view.ViewGroup r4, android.graphics.RectF r5) {
            r3 = this;
            int r0 = r3.mLimitBoundsTo
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L7
            return r2
        L7:
            android.view.View r4 = r4.findViewById(r0)
            if (r4 != 0) goto Le
            return r2
        Le:
            int r0 = r4.getLeft()
            float r0 = (float) r0
            int r1 = r4.getTop()
            float r1 = (float) r1
            int r2 = r4.getRight()
            float r2 = (float) r2
            int r4 = r4.getBottom()
            float r4 = (float) r4
            r5.set(r0, r1, r2, r4)
            return r5
    }

    int getLimitBoundsToId() {
            r1 = this;
            int r0 = r1.mLimitBoundsTo
            return r0
    }

    float getMaxAcceleration() {
            r1 = this;
            float r0 = r1.mMaxAcceleration
            return r0
    }

    public float getMaxVelocity() {
            r1 = this;
            float r0 = r1.mMaxVelocity
            return r0
    }

    boolean getMoveWhenScrollAtTop() {
            r1 = this;
            boolean r0 = r1.mMoveWhenScrollAtTop
            return r0
    }

    float getProgressDirection(float r8, float r9) {
            r7 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r7.mMotionLayout
            float r3 = r0.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r7.mMotionLayout
            int r2 = r7.mTouchAnchorId
            float r4 = r7.mTouchAnchorX
            float r5 = r7.mTouchAnchorY
            float[] r6 = r7.mAnchorDpDt
            r1.getAnchorDpDt(r2, r3, r4, r5, r6)
            float r0 = r7.mTouchDirectionX
            r1 = 869711765(0x33d6bf95, float:1.0E-7)
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 == 0) goto L2e
            float[] r9 = r7.mAnchorDpDt
            r3 = 0
            r4 = r9[r3]
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L28
            r9[r3] = r1
        L28:
            float r8 = r8 * r0
            r9 = r9[r3]
            float r8 = r8 / r9
            return r8
        L2e:
            float[] r8 = r7.mAnchorDpDt
            r0 = 1
            r3 = r8[r0]
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L39
            r8[r0] = r1
        L39:
            float r1 = r7.mTouchDirectionY
            float r9 = r9 * r1
            r8 = r8[r0]
            float r9 = r9 / r8
            return r9
    }

    android.graphics.RectF getTouchRegion(android.view.ViewGroup r4, android.graphics.RectF r5) {
            r3 = this;
            int r0 = r3.mTouchRegionId
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L7
            return r2
        L7:
            android.view.View r4 = r4.findViewById(r0)
            if (r4 != 0) goto Le
            return r2
        Le:
            int r0 = r4.getLeft()
            float r0 = (float) r0
            int r1 = r4.getTop()
            float r1 = (float) r1
            int r2 = r4.getRight()
            float r2 = (float) r2
            int r4 = r4.getBottom()
            float r4 = (float) r4
            r5.set(r0, r1, r2, r4)
            return r5
    }

    int getTouchRegionId() {
            r1 = this;
            int r0 = r1.mTouchRegionId
            return r0
    }

    void processTouchEvent(android.view.MotionEvent r19, androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker r20, int r21, androidx.constraintlayout.motion.widget.MotionScene r22) {
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r19
            r1.addMovement(r2)
            int r3 = r2.getAction()
            r4 = 0
            if (r3 == 0) goto L1ac
            r5 = 1000(0x3e8, float:1.401E-42)
            r6 = -1
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r9 = 1
            if (r3 == r9) goto L10e
            r10 = 2
            if (r3 == r10) goto L1e
            goto L1a3
        L1e:
            float r3 = r2.getRawY()
            float r10 = r0.mLastTouchY
            float r3 = r3 - r10
            float r10 = r2.getRawX()
            float r11 = r0.mLastTouchX
            float r10 = r10 - r11
            float r11 = r0.mTouchDirectionX
            float r11 = r11 * r10
            float r12 = r0.mTouchDirectionY
            float r12 = r12 * r3
            float r11 = r11 + r12
            float r11 = java.lang.Math.abs(r11)
            float r12 = r0.mDragThreshold
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 > 0) goto L43
            boolean r11 = r0.mDragStarted
            if (r11 == 0) goto L1a3
        L43:
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.mMotionLayout
            float r14 = r11.getProgress()
            boolean r11 = r0.mDragStarted
            if (r11 != 0) goto L54
            r0.mDragStarted = r9
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.mMotionLayout
            r11.setProgress(r14)
        L54:
            int r13 = r0.mTouchAnchorId
            if (r13 == r6) goto L68
            androidx.constraintlayout.motion.widget.MotionLayout r12 = r0.mMotionLayout
            float r15 = r0.mTouchAnchorX
            float r6 = r0.mTouchAnchorY
            float[] r11 = r0.mAnchorDpDt
            r16 = r6
            r17 = r11
            r12.getAnchorDpDt(r13, r14, r15, r16, r17)
            goto L87
        L68:
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r0.mMotionLayout
            int r6 = r6.getWidth()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.mMotionLayout
            int r11 = r11.getHeight()
            int r6 = java.lang.Math.min(r6, r11)
            float r6 = (float) r6
            float[] r11 = r0.mAnchorDpDt
            float r12 = r0.mTouchDirectionY
            float r12 = r12 * r6
            r11[r9] = r12
            float r12 = r0.mTouchDirectionX
            float r6 = r6 * r12
            r11[r4] = r6
        L87:
            float r6 = r0.mTouchDirectionX
            float[] r11 = r0.mAnchorDpDt
            r12 = r11[r4]
            float r6 = r6 * r12
            float r12 = r0.mTouchDirectionY
            r11 = r11[r9]
            float r12 = r12 * r11
            float r6 = r6 + r12
            float r11 = r0.mDragScale
            float r6 = r6 * r11
            float r6 = java.lang.Math.abs(r6)
            double r11 = (double) r6
            r15 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r6 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r6 >= 0) goto Lb1
            float[] r6 = r0.mAnchorDpDt
            r11 = 1008981770(0x3c23d70a, float:0.01)
            r6[r4] = r11
            r6[r9] = r11
        Lb1:
            float r6 = r0.mTouchDirectionX
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto Lbd
            float[] r3 = r0.mAnchorDpDt
            r3 = r3[r4]
            float r10 = r10 / r3
            goto Lc3
        Lbd:
            float[] r6 = r0.mAnchorDpDt
            r6 = r6[r9]
            float r10 = r3 / r6
        Lc3:
            float r14 = r14 + r10
            float r3 = java.lang.Math.min(r14, r7)
            float r3 = java.lang.Math.max(r3, r8)
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r0.mMotionLayout
            float r6 = r6.getProgress()
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 == 0) goto Lfd
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r0.mMotionLayout
            r6.setProgress(r3)
            r1.computeCurrentVelocity(r5)
            float r3 = r1.getXVelocity()
            float r1 = r1.getYVelocity()
            float r5 = r0.mTouchDirectionX
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 == 0) goto Lf2
            float[] r1 = r0.mAnchorDpDt
            r1 = r1[r4]
            float r3 = r3 / r1
            goto Lf8
        Lf2:
            float[] r3 = r0.mAnchorDpDt
            r3 = r3[r9]
            float r3 = r1 / r3
        Lf8:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            r1.mLastVelocity = r3
            goto L101
        Lfd:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            r1.mLastVelocity = r8
        L101:
            float r1 = r2.getRawX()
            r0.mLastTouchX = r1
            float r1 = r2.getRawY()
            r0.mLastTouchY = r1
            return
        L10e:
            r0.mDragStarted = r4
            r1.computeCurrentVelocity(r5)
            float r2 = r1.getXVelocity()
            float r1 = r1.getYVelocity()
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            float r12 = r3.getProgress()
            int r11 = r0.mTouchAnchorId
            if (r11 == r6) goto L131
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r0.mMotionLayout
            float r13 = r0.mTouchAnchorX
            float r14 = r0.mTouchAnchorY
            float[] r15 = r0.mAnchorDpDt
            r10.getAnchorDpDt(r11, r12, r13, r14, r15)
            goto L150
        L131:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            int r3 = r3.getWidth()
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r0.mMotionLayout
            int r5 = r5.getHeight()
            int r3 = java.lang.Math.min(r3, r5)
            float r3 = (float) r3
            float[] r5 = r0.mAnchorDpDt
            float r6 = r0.mTouchDirectionY
            float r6 = r6 * r3
            r5[r9] = r6
            float r6 = r0.mTouchDirectionX
            float r3 = r3 * r6
            r5[r4] = r3
        L150:
            float r3 = r0.mTouchDirectionX
            float[] r5 = r0.mAnchorDpDt
            r4 = r5[r4]
            r5 = r5[r9]
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L15e
            float r2 = r2 / r4
            goto L160
        L15e:
            float r2 = r1 / r5
        L160:
            boolean r1 = java.lang.Float.isNaN(r2)
            if (r1 != 0) goto L16c
            r1 = 1077936128(0x40400000, float:3.0)
            float r1 = r2 / r1
            float r1 = r1 + r12
            goto L16d
        L16c:
            r1 = r12
        L16d:
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 == 0) goto L19a
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L19a
            int r3 = r0.mOnTouchUp
            r4 = 3
            if (r3 == r4) goto L19a
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.mMotionLayout
            double r5 = (double) r1
            r9 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 >= 0) goto L185
            r1 = 0
            goto L187
        L185:
            r1 = 1065353216(0x3f800000, float:1.0)
        L187:
            r4.touchAnimateTo(r3, r1, r2)
            int r1 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r1 >= 0) goto L192
            int r1 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r1 > 0) goto L1a3
        L192:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r1.setState(r2)
            return
        L19a:
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 >= 0) goto L1a4
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 > 0) goto L1a3
            goto L1a4
        L1a3:
            return
        L1a4:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r1.setState(r2)
            return
        L1ac:
            float r1 = r2.getRawX()
            r0.mLastTouchX = r1
            float r1 = r2.getRawY()
            r0.mLastTouchY = r1
            r0.mDragStarted = r4
            return
    }

    void scrollMove(float r9, float r10) {
            r8 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r8.mMotionLayout
            float r3 = r0.getProgress()
            boolean r0 = r8.mDragStarted
            r7 = 1
            if (r0 != 0) goto L12
            r8.mDragStarted = r7
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r8.mMotionLayout
            r0.setProgress(r3)
        L12:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r8.mMotionLayout
            int r2 = r8.mTouchAnchorId
            float r4 = r8.mTouchAnchorX
            float r5 = r8.mTouchAnchorY
            float[] r6 = r8.mAnchorDpDt
            r1.getAnchorDpDt(r2, r3, r4, r5, r6)
            float r0 = r8.mTouchDirectionX
            float[] r1 = r8.mAnchorDpDt
            r2 = 0
            r4 = r1[r2]
            float r0 = r0 * r4
            float r4 = r8.mTouchDirectionY
            r1 = r1[r7]
            float r4 = r4 * r1
            float r0 = r0 + r4
            float r0 = java.lang.Math.abs(r0)
            double r0 = (double) r0
            r4 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L46
            float[] r0 = r8.mAnchorDpDt
            r1 = 1008981770(0x3c23d70a, float:0.01)
            r0[r2] = r1
            r0[r7] = r1
        L46:
            float r0 = r8.mTouchDirectionX
            r1 = 0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 == 0) goto L55
            float r9 = r9 * r0
            float[] r10 = r8.mAnchorDpDt
            r10 = r10[r2]
            float r9 = r9 / r10
            goto L5f
        L55:
            float r9 = r8.mTouchDirectionY
            float r10 = r10 * r9
            float[] r9 = r8.mAnchorDpDt
            r9 = r9[r7]
            float r9 = r10 / r9
        L5f:
            float r3 = r3 + r9
            r9 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Math.min(r3, r9)
            float r9 = java.lang.Math.max(r9, r1)
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r8.mMotionLayout
            float r10 = r10.getProgress()
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 == 0) goto L79
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r8.mMotionLayout
            r10.setProgress(r9)
        L79:
            return
    }

    void scrollUp(float r10, float r11) {
            r9 = this;
            r0 = 0
            r9.mDragStarted = r0
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r9.mMotionLayout
            float r4 = r1.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r9.mMotionLayout
            int r3 = r9.mTouchAnchorId
            float r5 = r9.mTouchAnchorX
            float r6 = r9.mTouchAnchorY
            float[] r7 = r9.mAnchorDpDt
            r2.getAnchorDpDt(r3, r4, r5, r6, r7)
            float r1 = r9.mTouchDirectionX
            float[] r2 = r9.mAnchorDpDt
            r3 = r2[r0]
            float r5 = r9.mTouchDirectionY
            r6 = 1
            r2 = r2[r6]
            r7 = 0
            int r8 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r8 == 0) goto L2a
            float r10 = r10 * r1
            float r10 = r10 / r3
            goto L2e
        L2a:
            float r11 = r11 * r5
            float r10 = r11 / r2
        L2e:
            boolean r11 = java.lang.Float.isNaN(r10)
            if (r11 != 0) goto L39
            r11 = 1077936128(0x40400000, float:3.0)
            float r11 = r10 / r11
            float r4 = r4 + r11
        L39:
            int r11 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r11 == 0) goto L5e
            r11 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r1 == 0) goto L45
            r1 = 1
            goto L46
        L45:
            r1 = 0
        L46:
            int r2 = r9.mOnTouchUp
            r3 = 3
            if (r2 == r3) goto L4c
            r0 = 1
        L4c:
            r0 = r0 & r1
            if (r0 == 0) goto L5e
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r9.mMotionLayout
            double r3 = (double) r4
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L59
            goto L5b
        L59:
            r7 = 1065353216(0x3f800000, float:1.0)
        L5b:
            r0.touchAnimateTo(r2, r7, r10)
        L5e:
            return
    }

    public void setAnchorId(int r1) {
            r0 = this;
            r0.mTouchAnchorId = r1
            return
    }

    void setDown(float r1, float r2) {
            r0 = this;
            r0.mLastTouchX = r1
            r0.mLastTouchY = r2
            return
    }

    public void setMaxAcceleration(float r1) {
            r0 = this;
            r0.mMaxAcceleration = r1
            return
    }

    public void setMaxVelocity(float r1) {
            r0 = this;
            r0.mMaxVelocity = r1
            return
    }

    public void setRTL(boolean r8) {
            r7 = this;
            r0 = 6
            r1 = 3
            r2 = 4
            r3 = 1
            r4 = 2
            r5 = 5
            if (r8 == 0) goto L1d
            float[][] r8 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_DIRECTION
            r1 = r8[r1]
            r8[r2] = r1
            r1 = r8[r4]
            r8[r5] = r1
            float[][] r8 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_SIDES
            r1 = r8[r4]
            r8[r5] = r1
            r1 = r8[r3]
            r8[r0] = r1
            goto L31
        L1d:
            float[][] r8 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_DIRECTION
            r6 = r8[r4]
            r8[r2] = r6
            r1 = r8[r1]
            r8[r5] = r1
            float[][] r8 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_SIDES
            r1 = r8[r3]
            r8[r5] = r1
            r1 = r8[r4]
            r8[r0] = r1
        L31:
            float[][] r8 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_SIDES
            int r0 = r7.mTouchAnchorSide
            r8 = r8[r0]
            r0 = 0
            r1 = r8[r0]
            r7.mTouchAnchorX = r1
            r8 = r8[r3]
            r7.mTouchAnchorY = r8
            float[][] r8 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_DIRECTION
            int r1 = r7.mTouchSide
            r8 = r8[r1]
            r0 = r8[r0]
            r7.mTouchDirectionX = r0
            r8 = r8[r3]
            r7.mTouchDirectionY = r8
            return
    }

    public void setTouchAnchorLocation(float r1, float r2) {
            r0 = this;
            r0.mTouchAnchorX = r1
            r0.mTouchAnchorY = r2
            return
    }

    void setUpTouchEvent(float r1, float r2) {
            r0 = this;
            r0.mLastTouchX = r1
            r0.mLastTouchY = r2
            r1 = 0
            r0.mDragStarted = r1
            return
    }

    void setupTouch() {
            r3 = this;
            int r0 = r3.mTouchAnchorId
            r1 = -1
            if (r0 == r1) goto L19
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r3.mMotionLayout
            android.view.View r0 = r1.findViewById(r0)
            if (r0 != 0) goto L1a
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r3.mMotionLayout
            android.content.Context r1 = r1.getContext()
            int r2 = r3.mTouchAnchorId
            androidx.constraintlayout.motion.widget.Debug.getName(r1, r2)
            goto L1a
        L19:
            r0 = 0
        L1a:
            boolean r1 = r0 instanceof androidx.core.widget.NestedScrollView
            if (r1 == 0) goto L30
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            androidx.constraintlayout.motion.widget.TouchResponse$1 r1 = new androidx.constraintlayout.motion.widget.TouchResponse$1
            r1.<init>(r3)
            r0.setOnTouchListener(r1)
            androidx.constraintlayout.motion.widget.TouchResponse$2 r1 = new androidx.constraintlayout.motion.widget.TouchResponse$2
            r1.<init>(r3)
            r0.setOnScrollChangeListener(r1)
        L30:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r2.mTouchDirectionX
            r0.append(r1)
            java.lang.String r1 = " , "
            r0.append(r1)
            float r1 = r2.mTouchDirectionY
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
