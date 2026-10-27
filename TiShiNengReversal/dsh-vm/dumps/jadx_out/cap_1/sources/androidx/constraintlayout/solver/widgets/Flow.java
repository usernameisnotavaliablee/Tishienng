package androidx.constraintlayout.solver.widgets;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Flow extends androidx.constraintlayout.solver.widgets.VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_NONE = 0;
    private androidx.constraintlayout.solver.widgets.ConstraintWidget[] mAlignedBiggestElementsInCols;
    private androidx.constraintlayout.solver.widgets.ConstraintWidget[] mAlignedBiggestElementsInRows;
    private int[] mAlignedDimensions;
    private java.util.ArrayList<androidx.constraintlayout.solver.widgets.Flow.WidgetsList> mChainList;
    private androidx.constraintlayout.solver.widgets.ConstraintWidget[] mDisplayedWidgets;
    private int mDisplayedWidgetsCount;
    private float mFirstHorizontalBias;
    private int mFirstHorizontalStyle;
    private float mFirstVerticalBias;
    private int mFirstVerticalStyle;
    private int mHorizontalAlign;
    private float mHorizontalBias;
    private int mHorizontalGap;
    private int mHorizontalStyle;
    private float mLastHorizontalBias;
    private int mLastHorizontalStyle;
    private float mLastVerticalBias;
    private int mLastVerticalStyle;
    private int mMaxElementsWrap;
    private int mOrientation;
    private int mVerticalAlign;
    private float mVerticalBias;
    private int mVerticalGap;
    private int mVerticalStyle;
    private int mWrapMode;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class WidgetsList {
        private androidx.constraintlayout.solver.widgets.ConstraintWidget biggest;
        int biggestDimension;
        private androidx.constraintlayout.solver.widgets.ConstraintAnchor mBottom;
        private int mCount;
        private int mHeight;
        private androidx.constraintlayout.solver.widgets.ConstraintAnchor mLeft;
        private int mMax;
        private int mNbMatchConstraintsWidgets;
        private int mOrientation;
        private int mPaddingBottom;
        private int mPaddingLeft;
        private int mPaddingRight;
        private int mPaddingTop;
        private androidx.constraintlayout.solver.widgets.ConstraintAnchor mRight;
        private int mStartIndex;
        private androidx.constraintlayout.solver.widgets.ConstraintAnchor mTop;
        private int mWidth;
        final /* synthetic */ androidx.constraintlayout.solver.widgets.Flow this$0;

        public WidgetsList(androidx.constraintlayout.solver.widgets.Flow r2, int r3, androidx.constraintlayout.solver.widgets.ConstraintAnchor r4, androidx.constraintlayout.solver.widgets.ConstraintAnchor r5, androidx.constraintlayout.solver.widgets.ConstraintAnchor r6, androidx.constraintlayout.solver.widgets.ConstraintAnchor r7, int r8) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r0 = 0
                r1.biggest = r0
                r0 = 0
                r1.biggestDimension = r0
                r1.mPaddingLeft = r0
                r1.mPaddingTop = r0
                r1.mPaddingRight = r0
                r1.mPaddingBottom = r0
                r1.mWidth = r0
                r1.mHeight = r0
                r1.mStartIndex = r0
                r1.mCount = r0
                r1.mNbMatchConstraintsWidgets = r0
                r1.mMax = r0
                r1.mOrientation = r3
                r1.mLeft = r4
                r1.mTop = r5
                r1.mRight = r6
                r1.mBottom = r7
                int r3 = r2.getPaddingLeft()
                r1.mPaddingLeft = r3
                int r3 = r2.getPaddingTop()
                r1.mPaddingTop = r3
                int r3 = r2.getPaddingRight()
                r1.mPaddingRight = r3
                int r2 = r2.getPaddingBottom()
                r1.mPaddingBottom = r2
                r1.mMax = r8
                return
        }

        static /* synthetic */ androidx.constraintlayout.solver.widgets.ConstraintWidget access$2000(androidx.constraintlayout.solver.widgets.Flow.WidgetsList r0) {
                androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.biggest
                return r0
        }

        private void recomputeDimensions() {
                r9 = this;
                r0 = 0
                r9.mWidth = r0
                r9.mHeight = r0
                r1 = 0
                r9.biggest = r1
                r9.biggestDimension = r0
                int r1 = r9.mCount
                r2 = 0
            Ld:
                if (r2 >= r1) goto L90
                int r3 = r9.mStartIndex
                int r3 = r3 + r2
                androidx.constraintlayout.solver.widgets.Flow r4 = r9.this$0
                int r4 = androidx.constraintlayout.solver.widgets.Flow.access$400(r4)
                if (r3 < r4) goto L1c
                goto L90
            L1c:
                androidx.constraintlayout.solver.widgets.Flow r3 = r9.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidget[] r3 = androidx.constraintlayout.solver.widgets.Flow.access$500(r3)
                int r4 = r9.mStartIndex
                int r4 = r4 + r2
                r3 = r3[r4]
                int r4 = r9.mOrientation
                r5 = 8
                if (r4 != 0) goto L5b
                int r4 = r3.getWidth()
                androidx.constraintlayout.solver.widgets.Flow r6 = r9.this$0
                int r6 = androidx.constraintlayout.solver.widgets.Flow.access$000(r6)
                int r7 = r3.getVisibility()
                if (r7 != r5) goto L3e
                r6 = 0
            L3e:
                int r5 = r9.mWidth
                int r4 = r4 + r6
                int r5 = r5 + r4
                r9.mWidth = r5
                androidx.constraintlayout.solver.widgets.Flow r4 = r9.this$0
                int r5 = r9.mMax
                int r4 = androidx.constraintlayout.solver.widgets.Flow.access$300(r4, r3, r5)
                androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r9.biggest
                if (r5 == 0) goto L54
                int r5 = r9.biggestDimension
                if (r5 >= r4) goto L8c
            L54:
                r9.biggest = r3
                r9.biggestDimension = r4
                r9.mHeight = r4
                goto L8c
            L5b:
                androidx.constraintlayout.solver.widgets.Flow r4 = r9.this$0
                int r6 = r9.mMax
                int r4 = androidx.constraintlayout.solver.widgets.Flow.access$200(r4, r3, r6)
                androidx.constraintlayout.solver.widgets.Flow r6 = r9.this$0
                int r7 = r9.mMax
                int r6 = androidx.constraintlayout.solver.widgets.Flow.access$300(r6, r3, r7)
                androidx.constraintlayout.solver.widgets.Flow r7 = r9.this$0
                int r7 = androidx.constraintlayout.solver.widgets.Flow.access$100(r7)
                int r8 = r3.getVisibility()
                if (r8 != r5) goto L78
                r7 = 0
            L78:
                int r5 = r9.mHeight
                int r6 = r6 + r7
                int r5 = r5 + r6
                r9.mHeight = r5
                androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r9.biggest
                if (r5 == 0) goto L86
                int r5 = r9.biggestDimension
                if (r5 >= r4) goto L8c
            L86:
                r9.biggest = r3
                r9.biggestDimension = r4
                r9.mWidth = r4
            L8c:
                int r2 = r2 + 1
                goto Ld
            L90:
                return
        }

        public void add(androidx.constraintlayout.solver.widgets.ConstraintWidget r7) {
                r6 = this;
                int r0 = r6.mOrientation
                r1 = 8
                r2 = 0
                if (r0 != 0) goto L49
                androidx.constraintlayout.solver.widgets.Flow r0 = r6.this$0
                int r3 = r6.mMax
                int r0 = androidx.constraintlayout.solver.widgets.Flow.access$200(r0, r7, r3)
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = r7.getHorizontalDimensionBehaviour()
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r3 != r4) goto L1e
                int r0 = r6.mNbMatchConstraintsWidgets
                int r0 = r0 + 1
                r6.mNbMatchConstraintsWidgets = r0
                r0 = 0
            L1e:
                androidx.constraintlayout.solver.widgets.Flow r3 = r6.this$0
                int r3 = androidx.constraintlayout.solver.widgets.Flow.access$000(r3)
                int r4 = r7.getVisibility()
                if (r4 != r1) goto L2b
                goto L2c
            L2b:
                r2 = r3
            L2c:
                int r1 = r6.mWidth
                int r0 = r0 + r2
                int r1 = r1 + r0
                r6.mWidth = r1
                androidx.constraintlayout.solver.widgets.Flow r0 = r6.this$0
                int r1 = r6.mMax
                int r0 = androidx.constraintlayout.solver.widgets.Flow.access$300(r0, r7, r1)
                androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r6.biggest
                if (r1 == 0) goto L42
                int r1 = r6.biggestDimension
                if (r1 >= r0) goto L8a
            L42:
                r6.biggest = r7
                r6.biggestDimension = r0
                r6.mHeight = r0
                goto L8a
            L49:
                androidx.constraintlayout.solver.widgets.Flow r0 = r6.this$0
                int r3 = r6.mMax
                int r0 = androidx.constraintlayout.solver.widgets.Flow.access$200(r0, r7, r3)
                androidx.constraintlayout.solver.widgets.Flow r3 = r6.this$0
                int r4 = r6.mMax
                int r3 = androidx.constraintlayout.solver.widgets.Flow.access$300(r3, r7, r4)
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = r7.getVerticalDimensionBehaviour()
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r4 != r5) goto L68
                int r3 = r6.mNbMatchConstraintsWidgets
                int r3 = r3 + 1
                r6.mNbMatchConstraintsWidgets = r3
                r3 = 0
            L68:
                androidx.constraintlayout.solver.widgets.Flow r4 = r6.this$0
                int r4 = androidx.constraintlayout.solver.widgets.Flow.access$100(r4)
                int r5 = r7.getVisibility()
                if (r5 != r1) goto L75
                goto L76
            L75:
                r2 = r4
            L76:
                int r1 = r6.mHeight
                int r3 = r3 + r2
                int r1 = r1 + r3
                r6.mHeight = r1
                androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r6.biggest
                if (r1 == 0) goto L84
                int r1 = r6.biggestDimension
                if (r1 >= r0) goto L8a
            L84:
                r6.biggest = r7
                r6.biggestDimension = r0
                r6.mWidth = r0
            L8a:
                int r7 = r6.mCount
                int r7 = r7 + 1
                r6.mCount = r7
                return
        }

        public void clear() {
                r2 = this;
                r0 = 0
                r2.biggestDimension = r0
                r1 = 0
                r2.biggest = r1
                r2.mWidth = r0
                r2.mHeight = r0
                r2.mStartIndex = r0
                r2.mCount = r0
                r2.mNbMatchConstraintsWidgets = r0
                return
        }

        public void createConstraints(boolean r18, int r19, boolean r20) {
                r17 = this;
                r0 = r17
                int r1 = r0.mCount
                r2 = 0
                r3 = 0
            L6:
                if (r3 >= r1) goto L27
                int r4 = r0.mStartIndex
                int r4 = r4 + r3
                androidx.constraintlayout.solver.widgets.Flow r5 = r0.this$0
                int r5 = androidx.constraintlayout.solver.widgets.Flow.access$400(r5)
                if (r4 < r5) goto L14
                goto L27
            L14:
                androidx.constraintlayout.solver.widgets.Flow r4 = r0.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidget[] r4 = androidx.constraintlayout.solver.widgets.Flow.access$500(r4)
                int r5 = r0.mStartIndex
                int r5 = r5 + r3
                r4 = r4[r5]
                if (r4 == 0) goto L24
                r4.resetAnchors()
            L24:
                int r3 = r3 + 1
                goto L6
            L27:
                if (r1 == 0) goto L360
                androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.biggest
                if (r3 != 0) goto L2f
                goto L360
            L2f:
                if (r20 == 0) goto L35
                if (r19 != 0) goto L35
                r4 = 1
                goto L36
            L35:
                r4 = 0
            L36:
                r5 = -1
                r6 = 0
                r7 = -1
                r8 = -1
            L3a:
                if (r6 >= r1) goto L67
                if (r18 == 0) goto L42
                int r9 = r1 + (-1)
                int r9 = r9 - r6
                goto L43
            L42:
                r9 = r6
            L43:
                int r10 = r0.mStartIndex
                int r10 = r10 + r9
                androidx.constraintlayout.solver.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.solver.widgets.Flow.access$400(r11)
                if (r10 < r11) goto L4f
                goto L67
            L4f:
                androidx.constraintlayout.solver.widgets.Flow r10 = r0.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidget[] r10 = androidx.constraintlayout.solver.widgets.Flow.access$500(r10)
                int r11 = r0.mStartIndex
                int r11 = r11 + r9
                r9 = r10[r11]
                int r9 = r9.getVisibility()
                if (r9 != 0) goto L64
                if (r7 != r5) goto L63
                r7 = r6
            L63:
                r8 = r6
            L64:
                int r6 = r6 + 1
                goto L3a
            L67:
                int r6 = r0.mOrientation
                r9 = 0
                if (r6 != 0) goto L1ef
                androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r0.biggest
                androidx.constraintlayout.solver.widgets.Flow r10 = r0.this$0
                int r10 = androidx.constraintlayout.solver.widgets.Flow.access$600(r10)
                r6.setVerticalChainStyle(r10)
                int r10 = r0.mPaddingTop
                if (r19 <= 0) goto L82
                androidx.constraintlayout.solver.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.solver.widgets.Flow.access$100(r11)
                int r10 = r10 + r11
            L82:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r6.mTop
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r0.mTop
                r11.connect(r12, r10)
                if (r20 == 0) goto L94
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r6.mBottom
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mBottom
                int r12 = r0.mPaddingBottom
                r10.connect(r11, r12)
            L94:
                if (r19 <= 0) goto La1
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r0.mTop
                androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r10.mOwner
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.mBottom
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r6.mTop
                r10.connect(r11, r2)
            La1:
                androidx.constraintlayout.solver.widgets.Flow r10 = r0.this$0
                int r10 = androidx.constraintlayout.solver.widgets.Flow.access$700(r10)
                r11 = 3
                if (r10 != r11) goto Ldb
                boolean r10 = r6.hasBaseline()
                if (r10 != 0) goto Ldb
                r10 = 0
            Lb1:
                if (r10 >= r1) goto Ldb
                if (r18 == 0) goto Lb9
                int r12 = r1 + (-1)
                int r12 = r12 - r10
                goto Lba
            Lb9:
                r12 = r10
            Lba:
                int r13 = r0.mStartIndex
                int r13 = r13 + r12
                androidx.constraintlayout.solver.widgets.Flow r14 = r0.this$0
                int r14 = androidx.constraintlayout.solver.widgets.Flow.access$400(r14)
                if (r13 < r14) goto Lc6
                goto Ldb
            Lc6:
                androidx.constraintlayout.solver.widgets.Flow r13 = r0.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidget[] r13 = androidx.constraintlayout.solver.widgets.Flow.access$500(r13)
                int r14 = r0.mStartIndex
                int r14 = r14 + r12
                r12 = r13[r14]
                boolean r13 = r12.hasBaseline()
                if (r13 == 0) goto Ld8
                goto Ldc
            Ld8:
                int r10 = r10 + 1
                goto Lb1
            Ldb:
                r12 = r6
            Ldc:
                r10 = 0
            Ldd:
                if (r10 >= r1) goto L360
                if (r18 == 0) goto Le5
                int r13 = r1 + (-1)
                int r13 = r13 - r10
                goto Le6
            Le5:
                r13 = r10
            Le6:
                int r14 = r0.mStartIndex
                int r14 = r14 + r13
                androidx.constraintlayout.solver.widgets.Flow r15 = r0.this$0
                int r15 = androidx.constraintlayout.solver.widgets.Flow.access$400(r15)
                if (r14 < r15) goto Lf3
                goto L360
            Lf3:
                androidx.constraintlayout.solver.widgets.Flow r14 = r0.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidget[] r14 = androidx.constraintlayout.solver.widgets.Flow.access$500(r14)
                int r15 = r0.mStartIndex
                int r15 = r15 + r13
                r14 = r14[r15]
                if (r10 != 0) goto L10c
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r15 = r14.mLeft
                r16 = 1
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.mLeft
                int r11 = r0.mPaddingLeft
                r14.connect(r15, r3, r11)
                goto L10e
            L10c:
                r16 = 1
            L10e:
                if (r13 != 0) goto L151
                androidx.constraintlayout.solver.widgets.Flow r3 = r0.this$0
                int r3 = androidx.constraintlayout.solver.widgets.Flow.access$800(r3)
                androidx.constraintlayout.solver.widgets.Flow r11 = r0.this$0
                float r11 = androidx.constraintlayout.solver.widgets.Flow.access$900(r11)
                int r13 = r0.mStartIndex
                if (r13 != 0) goto L135
                androidx.constraintlayout.solver.widgets.Flow r13 = r0.this$0
                int r13 = androidx.constraintlayout.solver.widgets.Flow.access$1000(r13)
                if (r13 == r5) goto L135
                androidx.constraintlayout.solver.widgets.Flow r3 = r0.this$0
                int r3 = androidx.constraintlayout.solver.widgets.Flow.access$1000(r3)
                androidx.constraintlayout.solver.widgets.Flow r11 = r0.this$0
                float r11 = androidx.constraintlayout.solver.widgets.Flow.access$1100(r11)
                goto L14b
            L135:
                if (r20 == 0) goto L14b
                androidx.constraintlayout.solver.widgets.Flow r13 = r0.this$0
                int r13 = androidx.constraintlayout.solver.widgets.Flow.access$1200(r13)
                if (r13 == r5) goto L14b
                androidx.constraintlayout.solver.widgets.Flow r3 = r0.this$0
                int r3 = androidx.constraintlayout.solver.widgets.Flow.access$1200(r3)
                androidx.constraintlayout.solver.widgets.Flow r11 = r0.this$0
                float r11 = androidx.constraintlayout.solver.widgets.Flow.access$1300(r11)
            L14b:
                r14.setHorizontalChainStyle(r3)
                r14.setHorizontalBiasPercent(r11)
            L151:
                int r3 = r1 + (-1)
                if (r10 != r3) goto L15e
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r14.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mRight
                int r13 = r0.mPaddingRight
                r14.connect(r3, r11, r13)
            L15e:
                if (r9 == 0) goto L188
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r14.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r9.mRight
                androidx.constraintlayout.solver.widgets.Flow r13 = r0.this$0
                int r13 = androidx.constraintlayout.solver.widgets.Flow.access$000(r13)
                r3.connect(r11, r13)
                if (r10 != r7) goto L176
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r14.mLeft
                int r11 = r0.mPaddingLeft
                r3.setGoneMargin(r11)
            L176:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r9.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r14.mLeft
                r3.connect(r11, r2)
                int r3 = r8 + 1
                if (r10 != r3) goto L188
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r9.mRight
                int r9 = r0.mPaddingRight
                r3.setGoneMargin(r9)
            L188:
                if (r14 == r6) goto L1e8
                androidx.constraintlayout.solver.widgets.Flow r3 = r0.this$0
                int r3 = androidx.constraintlayout.solver.widgets.Flow.access$700(r3)
                r9 = 3
                if (r3 != r9) goto L1a9
                boolean r3 = r12.hasBaseline()
                if (r3 == 0) goto L1a9
                if (r14 == r12) goto L1a9
                boolean r3 = r14.hasBaseline()
                if (r3 == 0) goto L1a9
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r14.mBaseline
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r12.mBaseline
                r3.connect(r11, r2)
                goto L1e9
            L1a9:
                androidx.constraintlayout.solver.widgets.Flow r3 = r0.this$0
                int r3 = androidx.constraintlayout.solver.widgets.Flow.access$700(r3)
                if (r3 == 0) goto L1e0
                r11 = 1
                if (r3 == r11) goto L1d8
                if (r4 == 0) goto L1c9
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r14.mTop
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mTop
                int r13 = r0.mPaddingTop
                r3.connect(r11, r13)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r14.mBottom
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mBottom
                int r13 = r0.mPaddingBottom
                r3.connect(r11, r13)
                goto L1e9
            L1c9:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r14.mTop
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r6.mTop
                r3.connect(r11, r2)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r14.mBottom
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r6.mBottom
                r3.connect(r11, r2)
                goto L1e9
            L1d8:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r14.mBottom
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r6.mBottom
                r3.connect(r11, r2)
                goto L1e9
            L1e0:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r14.mTop
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r6.mTop
                r3.connect(r11, r2)
                goto L1e9
            L1e8:
                r9 = 3
            L1e9:
                int r10 = r10 + 1
                r9 = r14
                r11 = 3
                goto Ldd
            L1ef:
                androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.biggest
                androidx.constraintlayout.solver.widgets.Flow r6 = r0.this$0
                int r6 = androidx.constraintlayout.solver.widgets.Flow.access$800(r6)
                r3.setHorizontalChainStyle(r6)
                int r6 = r0.mPaddingLeft
                if (r19 <= 0) goto L205
                androidx.constraintlayout.solver.widgets.Flow r10 = r0.this$0
                int r10 = androidx.constraintlayout.solver.widgets.Flow.access$000(r10)
                int r6 = r6 + r10
            L205:
                if (r18 == 0) goto L227
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r3.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mRight
                r10.connect(r11, r6)
                if (r20 == 0) goto L219
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r3.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r0.mLeft
                int r11 = r0.mPaddingRight
                r6.connect(r10, r11)
            L219:
                if (r19 <= 0) goto L246
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r0.mRight
                androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r6.mOwner
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r3.mRight
                r6.connect(r10, r2)
                goto L246
            L227:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r3.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mLeft
                r10.connect(r11, r6)
                if (r20 == 0) goto L239
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r3.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r0.mRight
                int r11 = r0.mPaddingRight
                r6.connect(r10, r11)
            L239:
                if (r19 <= 0) goto L246
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r0.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r6.mOwner
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r3.mLeft
                r6.connect(r10, r2)
            L246:
                r6 = 0
            L247:
                if (r6 >= r1) goto L360
                int r10 = r0.mStartIndex
                int r10 = r10 + r6
                androidx.constraintlayout.solver.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.solver.widgets.Flow.access$400(r11)
                if (r10 < r11) goto L256
                goto L360
            L256:
                androidx.constraintlayout.solver.widgets.Flow r10 = r0.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidget[] r10 = androidx.constraintlayout.solver.widgets.Flow.access$500(r10)
                int r11 = r0.mStartIndex
                int r11 = r11 + r6
                r10 = r10[r11]
                if (r6 != 0) goto L2ad
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r10.mTop
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r0.mTop
                int r13 = r0.mPaddingTop
                r10.connect(r11, r12, r13)
                androidx.constraintlayout.solver.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.solver.widgets.Flow.access$600(r11)
                androidx.constraintlayout.solver.widgets.Flow r12 = r0.this$0
                float r12 = androidx.constraintlayout.solver.widgets.Flow.access$1400(r12)
                int r13 = r0.mStartIndex
                if (r13 != 0) goto L291
                androidx.constraintlayout.solver.widgets.Flow r13 = r0.this$0
                int r13 = androidx.constraintlayout.solver.widgets.Flow.access$1500(r13)
                if (r13 == r5) goto L291
                androidx.constraintlayout.solver.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.solver.widgets.Flow.access$1500(r11)
                androidx.constraintlayout.solver.widgets.Flow r12 = r0.this$0
                float r12 = androidx.constraintlayout.solver.widgets.Flow.access$1600(r12)
                goto L2a7
            L291:
                if (r20 == 0) goto L2a7
                androidx.constraintlayout.solver.widgets.Flow r13 = r0.this$0
                int r13 = androidx.constraintlayout.solver.widgets.Flow.access$1700(r13)
                if (r13 == r5) goto L2a7
                androidx.constraintlayout.solver.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.solver.widgets.Flow.access$1700(r11)
                androidx.constraintlayout.solver.widgets.Flow r12 = r0.this$0
                float r12 = androidx.constraintlayout.solver.widgets.Flow.access$1800(r12)
            L2a7:
                r10.setVerticalChainStyle(r11)
                r10.setVerticalBiasPercent(r12)
            L2ad:
                int r11 = r1 + (-1)
                if (r6 != r11) goto L2ba
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r10.mBottom
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r0.mBottom
                int r13 = r0.mPaddingBottom
                r10.connect(r11, r12, r13)
            L2ba:
                if (r9 == 0) goto L2e6
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r10.mTop
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r9.mBottom
                androidx.constraintlayout.solver.widgets.Flow r13 = r0.this$0
                int r13 = androidx.constraintlayout.solver.widgets.Flow.access$100(r13)
                r11.connect(r12, r13)
                if (r6 != r7) goto L2d2
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r10.mTop
                int r12 = r0.mPaddingTop
                r11.setGoneMargin(r12)
            L2d2:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r9.mBottom
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r10.mTop
                r11.connect(r12, r2)
                r16 = 1
                int r11 = r8 + 1
                if (r6 != r11) goto L2e6
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mBottom
                int r11 = r0.mPaddingBottom
                r9.setGoneMargin(r11)
            L2e6:
                if (r10 == r3) goto L317
                r9 = 2
                if (r18 == 0) goto L319
                androidx.constraintlayout.solver.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.solver.widgets.Flow.access$1900(r11)
                if (r11 == 0) goto L310
                r12 = 1
                if (r11 == r12) goto L308
                if (r11 == r9) goto L2f9
                goto L317
            L2f9:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.mLeft
                r9.connect(r11, r2)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.mRight
                r9.connect(r11, r2)
                goto L317
            L308:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.mLeft
                r9.connect(r11, r2)
                goto L317
            L310:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.mRight
                r9.connect(r11, r2)
            L317:
                r12 = 1
                goto L35b
            L319:
                androidx.constraintlayout.solver.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.solver.widgets.Flow.access$1900(r11)
                if (r11 == 0) goto L353
                r12 = 1
                if (r11 == r12) goto L34b
                if (r11 == r9) goto L327
                goto L35b
            L327:
                if (r4 == 0) goto L33c
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mLeft
                int r13 = r0.mPaddingLeft
                r9.connect(r11, r13)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.mRight
                int r13 = r0.mPaddingRight
                r9.connect(r11, r13)
                goto L35b
            L33c:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.mLeft
                r9.connect(r11, r2)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.mRight
                r9.connect(r11, r2)
                goto L35b
            L34b:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.mRight
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.mRight
                r9.connect(r11, r2)
                goto L35b
            L353:
                r12 = 1
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.mLeft
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.mLeft
                r9.connect(r11, r2)
            L35b:
                int r6 = r6 + 1
                r9 = r10
                goto L247
            L360:
                return
        }

        public int getHeight() {
                r2 = this;
                int r0 = r2.mOrientation
                r1 = 1
                if (r0 != r1) goto Lf
                int r0 = r2.mHeight
                androidx.constraintlayout.solver.widgets.Flow r1 = r2.this$0
                int r1 = androidx.constraintlayout.solver.widgets.Flow.access$100(r1)
                int r0 = r0 - r1
                return r0
            Lf:
                int r0 = r2.mHeight
                return r0
        }

        public int getWidth() {
                r2 = this;
                int r0 = r2.mOrientation
                if (r0 != 0) goto Le
                int r0 = r2.mWidth
                androidx.constraintlayout.solver.widgets.Flow r1 = r2.this$0
                int r1 = androidx.constraintlayout.solver.widgets.Flow.access$000(r1)
                int r0 = r0 - r1
                return r0
            Le:
                int r0 = r2.mWidth
                return r0
        }

        public void measureMatchConstraints(int r9) {
                r8 = this;
                int r0 = r8.mNbMatchConstraintsWidgets
                if (r0 != 0) goto L5
                return
            L5:
                int r1 = r8.mCount
                int r5 = r9 / r0
                r9 = 0
            La:
                if (r9 >= r1) goto L67
                int r0 = r8.mStartIndex
                int r0 = r0 + r9
                androidx.constraintlayout.solver.widgets.Flow r2 = r8.this$0
                int r2 = androidx.constraintlayout.solver.widgets.Flow.access$400(r2)
                if (r0 < r2) goto L18
                goto L67
            L18:
                androidx.constraintlayout.solver.widgets.Flow r0 = r8.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = androidx.constraintlayout.solver.widgets.Flow.access$500(r0)
                int r2 = r8.mStartIndex
                int r2 = r2 + r9
                r3 = r0[r2]
                int r0 = r8.mOrientation
                if (r0 != 0) goto L45
                if (r3 == 0) goto L64
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r3.getHorizontalDimensionBehaviour()
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r0 != r2) goto L64
                int r0 = r3.mMatchConstraintDefaultWidth
                if (r0 != 0) goto L64
                androidx.constraintlayout.solver.widgets.Flow r2 = r8.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = r3.getVerticalDimensionBehaviour()
                int r7 = r3.getHeight()
                r2.measure(r3, r4, r5, r6, r7)
                goto L64
            L45:
                if (r3 == 0) goto L64
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r3.getVerticalDimensionBehaviour()
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r0 != r2) goto L64
                int r0 = r3.mMatchConstraintDefaultHeight
                if (r0 != 0) goto L64
                androidx.constraintlayout.solver.widgets.Flow r2 = r8.this$0
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = r3.getHorizontalDimensionBehaviour()
                r7 = r5
                int r5 = r3.getWidth()
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                r2.measure(r3, r4, r5, r6, r7)
                r5 = r7
            L64:
                int r9 = r9 + 1
                goto La
            L67:
                r8.recomputeDimensions()
                return
        }

        public void setStartIndex(int r1) {
                r0 = this;
                r0.mStartIndex = r1
                return
        }

        public void setup(int r1, androidx.constraintlayout.solver.widgets.ConstraintAnchor r2, androidx.constraintlayout.solver.widgets.ConstraintAnchor r3, androidx.constraintlayout.solver.widgets.ConstraintAnchor r4, androidx.constraintlayout.solver.widgets.ConstraintAnchor r5, int r6, int r7, int r8, int r9, int r10) {
                r0 = this;
                r0.mOrientation = r1
                r0.mLeft = r2
                r0.mTop = r3
                r0.mRight = r4
                r0.mBottom = r5
                r0.mPaddingLeft = r6
                r0.mPaddingTop = r7
                r0.mPaddingRight = r8
                r0.mPaddingBottom = r9
                r0.mMax = r10
                return
        }
    }

    public Flow() {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.mHorizontalStyle = r0
            r3.mVerticalStyle = r0
            r3.mFirstHorizontalStyle = r0
            r3.mFirstVerticalStyle = r0
            r3.mLastHorizontalStyle = r0
            r3.mLastVerticalStyle = r0
            r1 = 1056964608(0x3f000000, float:0.5)
            r3.mHorizontalBias = r1
            r3.mVerticalBias = r1
            r3.mFirstHorizontalBias = r1
            r3.mFirstVerticalBias = r1
            r3.mLastHorizontalBias = r1
            r3.mLastVerticalBias = r1
            r1 = 0
            r3.mHorizontalGap = r1
            r3.mVerticalGap = r1
            r2 = 2
            r3.mHorizontalAlign = r2
            r3.mVerticalAlign = r2
            r3.mWrapMode = r1
            r3.mMaxElementsWrap = r0
            r3.mOrientation = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mChainList = r0
            r0 = 0
            r3.mAlignedBiggestElementsInRows = r0
            r3.mAlignedBiggestElementsInCols = r0
            r3.mAlignedDimensions = r0
            r3.mDisplayedWidgetsCount = r1
            return
    }

    static /* synthetic */ int access$000(androidx.constraintlayout.solver.widgets.Flow r0) {
            int r0 = r0.mHorizontalGap
            return r0
    }

    static /* synthetic */ int access$100(androidx.constraintlayout.solver.widgets.Flow r0) {
            int r0 = r0.mVerticalGap
            return r0
    }

    static /* synthetic */ int access$1000(androidx.constraintlayout.solver.widgets.Flow r0) {
            int r0 = r0.mFirstHorizontalStyle
            return r0
    }

    static /* synthetic */ float access$1100(androidx.constraintlayout.solver.widgets.Flow r0) {
            float r0 = r0.mFirstHorizontalBias
            return r0
    }

    static /* synthetic */ int access$1200(androidx.constraintlayout.solver.widgets.Flow r0) {
            int r0 = r0.mLastHorizontalStyle
            return r0
    }

    static /* synthetic */ float access$1300(androidx.constraintlayout.solver.widgets.Flow r0) {
            float r0 = r0.mLastHorizontalBias
            return r0
    }

    static /* synthetic */ float access$1400(androidx.constraintlayout.solver.widgets.Flow r0) {
            float r0 = r0.mVerticalBias
            return r0
    }

    static /* synthetic */ int access$1500(androidx.constraintlayout.solver.widgets.Flow r0) {
            int r0 = r0.mFirstVerticalStyle
            return r0
    }

    static /* synthetic */ float access$1600(androidx.constraintlayout.solver.widgets.Flow r0) {
            float r0 = r0.mFirstVerticalBias
            return r0
    }

    static /* synthetic */ int access$1700(androidx.constraintlayout.solver.widgets.Flow r0) {
            int r0 = r0.mLastVerticalStyle
            return r0
    }

    static /* synthetic */ float access$1800(androidx.constraintlayout.solver.widgets.Flow r0) {
            float r0 = r0.mLastVerticalBias
            return r0
    }

    static /* synthetic */ int access$1900(androidx.constraintlayout.solver.widgets.Flow r0) {
            int r0 = r0.mHorizontalAlign
            return r0
    }

    static /* synthetic */ int access$200(androidx.constraintlayout.solver.widgets.Flow r0, androidx.constraintlayout.solver.widgets.ConstraintWidget r1, int r2) {
            int r0 = r0.getWidgetWidth(r1, r2)
            return r0
    }

    static /* synthetic */ int access$300(androidx.constraintlayout.solver.widgets.Flow r0, androidx.constraintlayout.solver.widgets.ConstraintWidget r1, int r2) {
            int r0 = r0.getWidgetHeight(r1, r2)
            return r0
    }

    static /* synthetic */ int access$400(androidx.constraintlayout.solver.widgets.Flow r0) {
            int r0 = r0.mDisplayedWidgetsCount
            return r0
    }

    static /* synthetic */ androidx.constraintlayout.solver.widgets.ConstraintWidget[] access$500(androidx.constraintlayout.solver.widgets.Flow r0) {
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r0.mDisplayedWidgets
            return r0
    }

    static /* synthetic */ int access$600(androidx.constraintlayout.solver.widgets.Flow r0) {
            int r0 = r0.mVerticalStyle
            return r0
    }

    static /* synthetic */ int access$700(androidx.constraintlayout.solver.widgets.Flow r0) {
            int r0 = r0.mVerticalAlign
            return r0
    }

    static /* synthetic */ int access$800(androidx.constraintlayout.solver.widgets.Flow r0) {
            int r0 = r0.mHorizontalStyle
            return r0
    }

    static /* synthetic */ float access$900(androidx.constraintlayout.solver.widgets.Flow r0) {
            float r0 = r0.mHorizontalBias
            return r0
    }

    private void createAlignedConstraints(boolean r12) {
            r11 = this;
            int[] r0 = r11.mAlignedDimensions
            if (r0 == 0) goto L116
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r11.mAlignedBiggestElementsInCols
            if (r0 == 0) goto L116
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r11.mAlignedBiggestElementsInRows
            if (r0 != 0) goto Le
            goto L116
        Le:
            r0 = 0
            r1 = 0
        L10:
            int r2 = r11.mDisplayedWidgetsCount
            if (r1 >= r2) goto L1e
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r2 = r11.mDisplayedWidgets
            r2 = r2[r1]
            r2.resetAnchors()
            int r1 = r1 + 1
            goto L10
        L1e:
            int[] r1 = r11.mAlignedDimensions
            r2 = r1[r0]
            r3 = 1
            r1 = r1[r3]
            r4 = 0
            r5 = 0
        L27:
            r6 = 8
            if (r5 >= r2) goto L7b
            if (r12 == 0) goto L31
            int r7 = r2 - r5
            int r7 = r7 - r3
            goto L32
        L31:
            r7 = r5
        L32:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r8 = r11.mAlignedBiggestElementsInCols
            r7 = r8[r7]
            if (r7 == 0) goto L78
            int r8 = r7.getVisibility()
            if (r8 != r6) goto L3f
            goto L78
        L3f:
            if (r5 != 0) goto L56
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r7.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r11.mLeft
            int r9 = r11.getPaddingLeft()
            r7.connect(r6, r8, r9)
            int r6 = r11.mHorizontalStyle
            r7.setHorizontalChainStyle(r6)
            float r6 = r11.mHorizontalBias
            r7.setHorizontalBiasPercent(r6)
        L56:
            int r6 = r2 + (-1)
            if (r5 != r6) goto L65
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r7.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r11.mRight
            int r9 = r11.getPaddingRight()
            r7.connect(r6, r8, r9)
        L65:
            if (r5 <= 0) goto L77
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r7.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r4.mRight
            int r9 = r11.mHorizontalGap
            r7.connect(r6, r8, r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r4.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r7.mLeft
            r4.connect(r6, r8, r0)
        L77:
            r4 = r7
        L78:
            int r5 = r5 + 1
            goto L27
        L7b:
            r12 = 0
        L7c:
            if (r12 >= r1) goto Lc7
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r5 = r11.mAlignedBiggestElementsInRows
            r5 = r5[r12]
            if (r5 == 0) goto Lc4
            int r7 = r5.getVisibility()
            if (r7 != r6) goto L8b
            goto Lc4
        L8b:
            if (r12 != 0) goto La2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r5.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r11.mTop
            int r9 = r11.getPaddingTop()
            r5.connect(r7, r8, r9)
            int r7 = r11.mVerticalStyle
            r5.setVerticalChainStyle(r7)
            float r7 = r11.mVerticalBias
            r5.setVerticalBiasPercent(r7)
        La2:
            int r7 = r1 + (-1)
            if (r12 != r7) goto Lb1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r5.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r11.mBottom
            int r9 = r11.getPaddingBottom()
            r5.connect(r7, r8, r9)
        Lb1:
            if (r12 <= 0) goto Lc3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r5.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r4.mBottom
            int r9 = r11.mVerticalGap
            r5.connect(r7, r8, r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r4.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r5.mTop
            r4.connect(r7, r8, r0)
        Lc3:
            r4 = r5
        Lc4:
            int r12 = r12 + 1
            goto L7c
        Lc7:
            r12 = 0
        Lc8:
            if (r12 >= r2) goto L116
            r4 = 0
        Lcb:
            if (r4 >= r1) goto L113
            int r5 = r4 * r2
            int r5 = r5 + r12
            int r7 = r11.mOrientation
            if (r7 != r3) goto Ld7
            int r5 = r12 * r1
            int r5 = r5 + r4
        Ld7:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r7 = r11.mDisplayedWidgets
            int r8 = r7.length
            if (r5 < r8) goto Ldd
            goto L110
        Ldd:
            r5 = r7[r5]
            if (r5 == 0) goto L110
            int r7 = r5.getVisibility()
            if (r7 != r6) goto Le8
            goto L110
        Le8:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r7 = r11.mAlignedBiggestElementsInCols
            r7 = r7[r12]
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r8 = r11.mAlignedBiggestElementsInRows
            r8 = r8[r4]
            if (r5 == r7) goto L100
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r5.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r7.mLeft
            r5.connect(r9, r10, r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r5.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.mRight
            r5.connect(r9, r7, r0)
        L100:
            if (r5 == r8) goto L110
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r5.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r8.mTop
            r5.connect(r7, r9, r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r5.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r8.mBottom
            r5.connect(r7, r8, r0)
        L110:
            int r4 = r4 + 1
            goto Lcb
        L113:
            int r12 = r12 + 1
            goto Lc8
        L116:
            return
    }

    private final int getWidgetHeight(androidx.constraintlayout.solver.widgets.ConstraintWidget r8, int r9) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = r8.getVerticalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r2) goto L4a
            int r1 = r8.mMatchConstraintDefaultHeight
            if (r1 != 0) goto L11
            return r0
        L11:
            r0 = 2
            if (r1 != r0) goto L30
            float r0 = r8.mMatchConstraintPercentHeight
            float r9 = (float) r9
            float r0 = r0 * r9
            int r6 = (int) r0
            int r9 = r8.getHeight()
            if (r6 == r9) goto L2f
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = r8.getHorizontalDimensionBehaviour()
            int r4 = r8.getWidth()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r1 = r7
            r2 = r8
            r1.measure(r2, r3, r4, r5, r6)
        L2f:
            return r6
        L30:
            r2 = r8
            r8 = 1
            if (r1 != r8) goto L39
            int r8 = r2.getHeight()
            return r8
        L39:
            r8 = 3
            if (r1 != r8) goto L4b
            int r8 = r2.getWidth()
            float r8 = (float) r8
            float r9 = r2.mDimensionRatio
            float r8 = r8 * r9
            r9 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 + r9
            int r8 = (int) r8
            return r8
        L4a:
            r2 = r8
        L4b:
            int r8 = r2.getHeight()
            return r8
    }

    private final int getWidgetWidth(androidx.constraintlayout.solver.widgets.ConstraintWidget r8, int r9) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = r8.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r2) goto L4a
            int r1 = r8.mMatchConstraintDefaultWidth
            if (r1 != 0) goto L11
            return r0
        L11:
            r0 = 2
            if (r1 != r0) goto L30
            float r0 = r8.mMatchConstraintPercentWidth
            float r9 = (float) r9
            float r0 = r0 * r9
            int r4 = (int) r0
            int r9 = r8.getWidth()
            if (r4 == r9) goto L2f
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = r8.getVerticalDimensionBehaviour()
            int r6 = r8.getHeight()
            r1 = r7
            r2 = r8
            r1.measure(r2, r3, r4, r5, r6)
        L2f:
            return r4
        L30:
            r2 = r8
            r8 = 1
            if (r1 != r8) goto L39
            int r8 = r2.getWidth()
            return r8
        L39:
            r8 = 3
            if (r1 != r8) goto L4b
            int r8 = r2.getHeight()
            float r8 = (float) r8
            float r9 = r2.mDimensionRatio
            float r8 = r8 * r9
            r9 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 + r9
            int r8 = (int) r8
            return r8
        L4a:
            r2 = r8
        L4b:
            int r8 = r2.getWidth()
            return r8
    }

    private void measureAligned(androidx.constraintlayout.solver.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
            r10 = this;
            r0 = 0
            if (r13 != 0) goto L26
            int r1 = r10.mMaxElementsWrap
            if (r1 > 0) goto L23
            r1 = 0
            r2 = 0
            r3 = 0
        La:
            if (r2 >= r12) goto L23
            if (r2 <= 0) goto L11
            int r4 = r10.mHorizontalGap
            int r3 = r3 + r4
        L11:
            r4 = r11[r2]
            if (r4 != 0) goto L16
            goto L20
        L16:
            int r4 = r10.getWidgetWidth(r4, r14)
            int r3 = r3 + r4
            if (r3 <= r14) goto L1e
            goto L23
        L1e:
            int r1 = r1 + 1
        L20:
            int r2 = r2 + 1
            goto La
        L23:
            r2 = r1
            r1 = 0
            goto L47
        L26:
            int r1 = r10.mMaxElementsWrap
            if (r1 > 0) goto L46
            r1 = 0
            r2 = 0
            r3 = 0
        L2d:
            if (r2 >= r12) goto L46
            if (r2 <= 0) goto L34
            int r4 = r10.mVerticalGap
            int r3 = r3 + r4
        L34:
            r4 = r11[r2]
            if (r4 != 0) goto L39
            goto L43
        L39:
            int r4 = r10.getWidgetHeight(r4, r14)
            int r3 = r3 + r4
            if (r3 <= r14) goto L41
            goto L46
        L41:
            int r1 = r1 + 1
        L43:
            int r2 = r2 + 1
            goto L2d
        L46:
            r2 = 0
        L47:
            int[] r3 = r10.mAlignedDimensions
            if (r3 != 0) goto L50
            r3 = 2
            int[] r3 = new int[r3]
            r10.mAlignedDimensions = r3
        L50:
            r3 = 1
            if (r1 != 0) goto L55
            if (r13 == r3) goto L59
        L55:
            if (r2 != 0) goto L5b
            if (r13 != 0) goto L5b
        L59:
            r4 = 1
            goto L5c
        L5b:
            r4 = 0
        L5c:
            if (r4 != 0) goto L11d
            if (r13 != 0) goto L6a
            float r1 = (float) r12
            float r5 = (float) r2
            float r1 = r1 / r5
            double r5 = (double) r1
            double r5 = java.lang.Math.ceil(r5)
            int r1 = (int) r5
            goto L73
        L6a:
            float r2 = (float) r12
            float r5 = (float) r1
            float r2 = r2 / r5
            double r5 = (double) r2
            double r5 = java.lang.Math.ceil(r5)
            int r2 = (int) r5
        L73:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r5 = r10.mAlignedBiggestElementsInCols
            r6 = 0
            if (r5 == 0) goto L80
            int r7 = r5.length
            if (r7 >= r2) goto L7c
            goto L80
        L7c:
            java.util.Arrays.fill(r5, r6)
            goto L84
        L80:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r5 = new androidx.constraintlayout.solver.widgets.ConstraintWidget[r2]
            r10.mAlignedBiggestElementsInCols = r5
        L84:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r5 = r10.mAlignedBiggestElementsInRows
            if (r5 == 0) goto L90
            int r7 = r5.length
            if (r7 >= r1) goto L8c
            goto L90
        L8c:
            java.util.Arrays.fill(r5, r6)
            goto L94
        L90:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r5 = new androidx.constraintlayout.solver.widgets.ConstraintWidget[r1]
            r10.mAlignedBiggestElementsInRows = r5
        L94:
            r5 = 0
        L95:
            if (r5 >= r2) goto Ld9
            r6 = 0
        L98:
            if (r6 >= r1) goto Ld6
            int r7 = r6 * r2
            int r7 = r7 + r5
            if (r13 != r3) goto La2
            int r7 = r5 * r1
            int r7 = r7 + r6
        La2:
            int r8 = r11.length
            if (r7 < r8) goto La6
            goto Ld3
        La6:
            r7 = r11[r7]
            if (r7 != 0) goto Lab
            goto Ld3
        Lab:
            int r8 = r10.getWidgetWidth(r7, r14)
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r9 = r10.mAlignedBiggestElementsInCols
            r9 = r9[r5]
            if (r9 == 0) goto Lbb
            int r9 = r9.getWidth()
            if (r9 >= r8) goto Lbf
        Lbb:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r8 = r10.mAlignedBiggestElementsInCols
            r8[r5] = r7
        Lbf:
            int r8 = r10.getWidgetHeight(r7, r14)
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r9 = r10.mAlignedBiggestElementsInRows
            r9 = r9[r6]
            if (r9 == 0) goto Lcf
            int r9 = r9.getHeight()
            if (r9 >= r8) goto Ld3
        Lcf:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r8 = r10.mAlignedBiggestElementsInRows
            r8[r6] = r7
        Ld3:
            int r6 = r6 + 1
            goto L98
        Ld6:
            int r5 = r5 + 1
            goto L95
        Ld9:
            r5 = 0
            r6 = 0
        Ldb:
            if (r5 >= r2) goto Lf0
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r7 = r10.mAlignedBiggestElementsInCols
            r7 = r7[r5]
            if (r7 == 0) goto Led
            if (r5 <= 0) goto Le8
            int r8 = r10.mHorizontalGap
            int r6 = r6 + r8
        Le8:
            int r7 = r10.getWidgetWidth(r7, r14)
            int r6 = r6 + r7
        Led:
            int r5 = r5 + 1
            goto Ldb
        Lf0:
            r5 = 0
            r7 = 0
        Lf2:
            if (r5 >= r1) goto L107
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r8 = r10.mAlignedBiggestElementsInRows
            r8 = r8[r5]
            if (r8 == 0) goto L104
            if (r5 <= 0) goto Lff
            int r9 = r10.mVerticalGap
            int r7 = r7 + r9
        Lff:
            int r8 = r10.getWidgetHeight(r8, r14)
            int r7 = r7 + r8
        L104:
            int r5 = r5 + 1
            goto Lf2
        L107:
            r15[r0] = r6
            r15[r3] = r7
            if (r13 != 0) goto L115
            if (r6 <= r14) goto L59
            if (r2 <= r3) goto L59
            int r2 = r2 + (-1)
            goto L5c
        L115:
            if (r7 <= r14) goto L59
            if (r1 <= r3) goto L59
            int r1 = r1 + (-1)
            goto L5c
        L11d:
            int[] r11 = r10.mAlignedDimensions
            r11[r0] = r2
            r11[r3] = r1
            return
    }

    private void measureChainWrap(androidx.constraintlayout.solver.widgets.ConstraintWidget[] r20, int r21, int r22, int r23, int[] r24) {
            r19 = this;
            r1 = r19
            r8 = r21
            if (r8 != 0) goto L7
            return
        L7:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.Flow$WidgetsList> r0 = r1.mChainList
            r0.clear()
            androidx.constraintlayout.solver.widgets.Flow$WidgetsList r0 = new androidx.constraintlayout.solver.widgets.Flow$WidgetsList
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r1.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r1.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r1.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r1.mBottom
            r2 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.Flow$WidgetsList> r2 = r1.mChainList
            r2.add(r0)
            if (r22 != 0) goto L83
            r2 = 0
            r3 = 0
            r9 = 0
        L27:
            if (r9 >= r8) goto L80
            r10 = r20[r9]
            int r13 = r1.getWidgetWidth(r10, r7)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = r10.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r5) goto L39
            int r2 = r2 + 1
        L39:
            r14 = r2
            if (r3 == r7) goto L42
            int r2 = r1.mHorizontalGap
            int r2 = r2 + r3
            int r2 = r2 + r13
            if (r2 <= r7) goto L4a
        L42:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = androidx.constraintlayout.solver.widgets.Flow.WidgetsList.access$2000(r0)
            if (r2 == 0) goto L4a
            r2 = 1
            goto L4b
        L4a:
            r2 = 0
        L4b:
            if (r2 != 0) goto L58
            if (r9 <= 0) goto L58
            int r4 = r1.mMaxElementsWrap
            if (r4 <= 0) goto L58
            int r4 = r9 % r4
            if (r4 != 0) goto L58
            r2 = 1
        L58:
            if (r2 == 0) goto L73
            androidx.constraintlayout.solver.widgets.Flow$WidgetsList r0 = new androidx.constraintlayout.solver.widgets.Flow$WidgetsList
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r1.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r1.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r1.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r1.mBottom
            r2 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.setStartIndex(r9)
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.Flow$WidgetsList> r2 = r1.mChainList
            r2.add(r0)
        L71:
            r3 = r13
            goto L79
        L73:
            if (r9 <= 0) goto L71
            int r2 = r1.mHorizontalGap
            int r2 = r2 + r13
            int r3 = r3 + r2
        L79:
            r0.add(r10)
            int r9 = r9 + 1
            r2 = r14
            goto L27
        L80:
            r15 = r1
            goto Le4
        L83:
            r2 = 0
            r3 = 0
            r9 = 0
        L86:
            if (r9 >= r8) goto L80
            r10 = r20[r9]
            int r13 = r1.getWidgetHeight(r10, r7)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = r10.getVerticalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r5) goto L98
            int r2 = r2 + 1
        L98:
            r14 = r2
            if (r3 == r7) goto La1
            int r2 = r1.mVerticalGap
            int r2 = r2 + r3
            int r2 = r2 + r13
            if (r2 <= r7) goto La9
        La1:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = androidx.constraintlayout.solver.widgets.Flow.WidgetsList.access$2000(r0)
            if (r2 == 0) goto La9
            r2 = 1
            goto Laa
        La9:
            r2 = 0
        Laa:
            if (r2 != 0) goto Lb7
            if (r9 <= 0) goto Lb7
            int r4 = r1.mMaxElementsWrap
            if (r4 <= 0) goto Lb7
            int r4 = r9 % r4
            if (r4 != 0) goto Lb7
            r2 = 1
        Lb7:
            if (r2 == 0) goto Ld3
            androidx.constraintlayout.solver.widgets.Flow$WidgetsList r0 = new androidx.constraintlayout.solver.widgets.Flow$WidgetsList
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r1.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r1.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r1.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r1.mBottom
            r2 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r15 = r1
            r0.setStartIndex(r9)
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.Flow$WidgetsList> r1 = r15.mChainList
            r1.add(r0)
        Ld1:
            r3 = r13
            goto Lda
        Ld3:
            r15 = r1
            if (r9 <= 0) goto Ld1
            int r1 = r15.mVerticalGap
            int r1 = r1 + r13
            int r3 = r3 + r1
        Lda:
            r0.add(r10)
            int r9 = r9 + 1
            r7 = r23
            r2 = r14
            r1 = r15
            goto L86
        Le4:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.Flow$WidgetsList> r0 = r15.mChainList
            int r13 = r0.size()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r15.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r15.mBottom
            int r5 = r15.getPaddingLeft()
            int r6 = r15.getPaddingTop()
            int r7 = r15.getPaddingRight()
            int r8 = r15.getPaddingBottom()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = r15.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r9 == r10) goto L113
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = r15.getVerticalDimensionBehaviour()
            if (r9 != r10) goto L111
            goto L113
        L111:
            r9 = 0
            goto L114
        L113:
            r9 = 1
        L114:
            if (r2 <= 0) goto L13b
            if (r9 == 0) goto L13b
            r2 = 0
        L119:
            if (r2 >= r13) goto L13b
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.Flow$WidgetsList> r9 = r15.mChainList
            java.lang.Object r9 = r9.get(r2)
            androidx.constraintlayout.solver.widgets.Flow$WidgetsList r9 = (androidx.constraintlayout.solver.widgets.Flow.WidgetsList) r9
            if (r22 != 0) goto L12f
            int r10 = r9.getWidth()
            int r10 = r23 - r10
            r9.measureMatchConstraints(r10)
            goto L138
        L12f:
            int r10 = r9.getHeight()
            int r10 = r23 - r10
            r9.measureMatchConstraints(r10)
        L138:
            int r2 = r2 + 1
            goto L119
        L13b:
            r2 = r0
            r9 = r8
            r0 = 0
            r14 = 0
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = 0
        L146:
            if (r14 >= r13) goto L1ef
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.Flow$WidgetsList> r10 = r15.mChainList
            java.lang.Object r10 = r10.get(r14)
            androidx.constraintlayout.solver.widgets.Flow$WidgetsList r10 = (androidx.constraintlayout.solver.widgets.Flow.WidgetsList) r10
            if (r22 != 0) goto L19e
            int r5 = r13 + (-1)
            if (r14 >= r5) goto L16a
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.Flow$WidgetsList> r5 = r15.mChainList
            int r9 = r14 + 1
            java.lang.Object r5 = r5.get(r9)
            androidx.constraintlayout.solver.widgets.Flow$WidgetsList r5 = (androidx.constraintlayout.solver.widgets.Flow.WidgetsList) r5
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = androidx.constraintlayout.solver.widgets.Flow.WidgetsList.access$2000(r5)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.mTop
            r9 = 0
        L167:
            r16 = 1
            goto L171
        L16a:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r15.mBottom
            int r9 = r15.getPaddingBottom()
            goto L167
        L171:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = androidx.constraintlayout.solver.widgets.Flow.WidgetsList.access$2000(r10)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.mBottom
            r12 = r0
            r0 = r10
            r20 = r11
            r17 = 0
            r10 = r23
            r11 = r1
            r1 = r22
            r0.setup(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r1 = r0.getWidth()
            int r1 = java.lang.Math.max(r12, r1)
            int r0 = r0.getHeight()
            int r0 = r0 + r11
            if (r14 <= 0) goto L197
            int r3 = r15.mVerticalGap
            int r0 = r0 + r3
        L197:
            r3 = r1
            r1 = r0
            r0 = r3
            r3 = r20
            r7 = 0
            goto L1eb
        L19e:
            r12 = r0
            r11 = r1
            r0 = r10
            r16 = 1
            r17 = 0
            int r1 = r13 + (-1)
            if (r14 >= r1) goto L1bc
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.Flow$WidgetsList> r1 = r15.mChainList
            int r4 = r14 + 1
            java.lang.Object r1 = r1.get(r4)
            androidx.constraintlayout.solver.widgets.Flow$WidgetsList r1 = (androidx.constraintlayout.solver.widgets.Flow.WidgetsList) r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = androidx.constraintlayout.solver.widgets.Flow.WidgetsList.access$2000(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mLeft
            r8 = 0
        L1ba:
            r4 = r1
            goto L1c4
        L1bc:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.mRight
            int r4 = r15.getPaddingRight()
            r8 = r4
            goto L1ba
        L1c4:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = androidx.constraintlayout.solver.widgets.Flow.WidgetsList.access$2000(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mRight
            r10 = r23
            r18 = r1
            r1 = r22
            r0.setup(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r1 = r0.getWidth()
            int r1 = r1 + r12
            int r0 = r0.getHeight()
            int r0 = java.lang.Math.max(r11, r0)
            if (r14 <= 0) goto L1e5
            int r2 = r15.mHorizontalGap
            int r1 = r1 + r2
        L1e5:
            r2 = r1
            r1 = r0
            r0 = r2
            r2 = r18
            r6 = 0
        L1eb:
            int r14 = r14 + 1
            goto L146
        L1ef:
            r12 = r0
            r11 = r1
            r16 = 1
            r17 = 0
            r24[r17] = r12
            r24[r16] = r11
            return
    }

    private void measureNoWrap(androidx.constraintlayout.solver.widgets.ConstraintWidget[] r22, int r23, int r24, int r25, int[] r26) {
            r21 = this;
            r1 = r21
            r8 = r23
            if (r8 != 0) goto L7
            return
        L7:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.Flow$WidgetsList> r0 = r1.mChainList
            int r0 = r0.size()
            r9 = 0
            if (r0 != 0) goto L27
            androidx.constraintlayout.solver.widgets.Flow$WidgetsList r0 = new androidx.constraintlayout.solver.widgets.Flow$WidgetsList
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r1.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r1.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r1.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r1.mBottom
            r2 = r24
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.Flow$WidgetsList> r2 = r1.mChainList
            r2.add(r0)
            goto L53
        L27:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.Flow$WidgetsList> r0 = r1.mChainList
            java.lang.Object r0 = r0.get(r9)
            r10 = r0
            androidx.constraintlayout.solver.widgets.Flow$WidgetsList r10 = (androidx.constraintlayout.solver.widgets.Flow.WidgetsList) r10
            r10.clear()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r1.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r1.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r14 = r1.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r15 = r1.mBottom
            int r16 = r1.getPaddingLeft()
            int r17 = r1.getPaddingTop()
            int r18 = r1.getPaddingRight()
            int r19 = r1.getPaddingBottom()
            r11 = r24
            r20 = r25
            r10.setup(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = r10
        L53:
            r2 = 0
        L54:
            if (r2 >= r8) goto L5e
            r3 = r22[r2]
            r0.add(r3)
            int r2 = r2 + 1
            goto L54
        L5e:
            int r2 = r0.getWidth()
            r26[r9] = r2
            int r0 = r0.getHeight()
            r2 = 1
            r26[r2] = r0
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void addToSolver(androidx.constraintlayout.solver.LinearSystem r7) {
            r6 = this;
            super.addToSolver(r7)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r6.getParent()
            r0 = 0
            if (r7 == 0) goto L15
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r6.getParent()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r7 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r7
            boolean r7 = r7.isRtl()
            goto L16
        L15:
            r7 = 0
        L16:
            int r1 = r6.mWrapMode
            r2 = 1
            if (r1 == 0) goto L43
            if (r1 == r2) goto L25
            r2 = 2
            if (r1 == r2) goto L21
            goto L56
        L21:
            r6.createAlignedConstraints(r7)
            goto L56
        L25:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.Flow$WidgetsList> r1 = r6.mChainList
            int r1 = r1.size()
            r3 = 0
        L2c:
            if (r3 >= r1) goto L56
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.Flow$WidgetsList> r4 = r6.mChainList
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.solver.widgets.Flow$WidgetsList r4 = (androidx.constraintlayout.solver.widgets.Flow.WidgetsList) r4
            int r5 = r1 + (-1)
            if (r3 != r5) goto L3c
            r5 = 1
            goto L3d
        L3c:
            r5 = 0
        L3d:
            r4.createConstraints(r7, r3, r5)
            int r3 = r3 + 1
            goto L2c
        L43:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.Flow$WidgetsList> r1 = r6.mChainList
            int r1 = r1.size()
            if (r1 <= 0) goto L56
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.Flow$WidgetsList> r1 = r6.mChainList
            java.lang.Object r1 = r1.get(r0)
            androidx.constraintlayout.solver.widgets.Flow$WidgetsList r1 = (androidx.constraintlayout.solver.widgets.Flow.WidgetsList) r1
            r1.createConstraints(r7, r0, r2)
        L56:
            r6.needsCallbackFromSolver(r0)
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.HelperWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void copy(androidx.constraintlayout.solver.widgets.ConstraintWidget r1, java.util.HashMap<androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget> r2) {
            r0 = this;
            super.copy(r1, r2)
            androidx.constraintlayout.solver.widgets.Flow r1 = (androidx.constraintlayout.solver.widgets.Flow) r1
            int r2 = r1.mHorizontalStyle
            r0.mHorizontalStyle = r2
            int r2 = r1.mVerticalStyle
            r0.mVerticalStyle = r2
            int r2 = r1.mFirstHorizontalStyle
            r0.mFirstHorizontalStyle = r2
            int r2 = r1.mFirstVerticalStyle
            r0.mFirstVerticalStyle = r2
            int r2 = r1.mLastHorizontalStyle
            r0.mLastHorizontalStyle = r2
            int r2 = r1.mLastVerticalStyle
            r0.mLastVerticalStyle = r2
            float r2 = r1.mHorizontalBias
            r0.mHorizontalBias = r2
            float r2 = r1.mVerticalBias
            r0.mVerticalBias = r2
            float r2 = r1.mFirstHorizontalBias
            r0.mFirstHorizontalBias = r2
            float r2 = r1.mFirstVerticalBias
            r0.mFirstVerticalBias = r2
            float r2 = r1.mLastHorizontalBias
            r0.mLastHorizontalBias = r2
            float r2 = r1.mLastVerticalBias
            r0.mLastVerticalBias = r2
            int r2 = r1.mHorizontalGap
            r0.mHorizontalGap = r2
            int r2 = r1.mVerticalGap
            r0.mVerticalGap = r2
            int r2 = r1.mHorizontalAlign
            r0.mHorizontalAlign = r2
            int r2 = r1.mVerticalAlign
            r0.mVerticalAlign = r2
            int r2 = r1.mWrapMode
            r0.mWrapMode = r2
            int r2 = r1.mMaxElementsWrap
            r0.mMaxElementsWrap = r2
            int r1 = r1.mOrientation
            r0.mOrientation = r1
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.VirtualLayout
    public void measure(int r20, int r21, int r22, int r23) {
            r19 = this;
            r0 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            int r1 = r0.mWidgetsCount
            r10 = 0
            if (r1 <= 0) goto L1c
            boolean r1 = r0.measureChildren()
            if (r1 != 0) goto L1c
            r0.setMeasure(r10, r10)
            r0.needsCallbackFromSolver(r10)
            return
        L1c:
            int r11 = r0.getPaddingLeft()
            int r12 = r0.getPaddingRight()
            int r13 = r0.getPaddingTop()
            int r14 = r0.getPaddingBottom()
            r1 = 2
            int[] r5 = new int[r1]
            int r2 = r7 - r11
            int r2 = r2 - r12
            int r3 = r0.mOrientation
            r15 = 1
            if (r3 != r15) goto L3a
            int r2 = r9 - r13
            int r2 = r2 - r14
        L3a:
            r4 = r2
            r2 = -1
            if (r3 != 0) goto L4b
            int r3 = r0.mHorizontalStyle
            if (r3 != r2) goto L44
            r0.mHorizontalStyle = r10
        L44:
            int r3 = r0.mVerticalStyle
            if (r3 != r2) goto L57
            r0.mVerticalStyle = r10
            goto L57
        L4b:
            int r3 = r0.mHorizontalStyle
            if (r3 != r2) goto L51
            r0.mHorizontalStyle = r10
        L51:
            int r3 = r0.mVerticalStyle
            if (r3 != r2) goto L57
            r0.mVerticalStyle = r10
        L57:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r2 = r0.mWidgets
            r3 = 0
            r16 = 0
            r17 = 0
        L5e:
            int r10 = r0.mWidgetsCount
            r1 = 8
            if (r3 >= r10) goto L74
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r10 = r0.mWidgets
            r10 = r10[r3]
            int r10 = r10.getVisibility()
            if (r10 != r1) goto L70
            int r16 = r16 + 1
        L70:
            int r3 = r3 + 1
            r1 = 2
            goto L5e
        L74:
            if (r16 <= 0) goto L9b
            int r10 = r10 - r16
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r2 = new androidx.constraintlayout.solver.widgets.ConstraintWidget[r10]
            r3 = 0
            r10 = 0
        L7c:
            int r15 = r0.mWidgetsCount
            if (r3 >= r15) goto L95
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r15 = r0.mWidgets
            r15 = r15[r3]
            r18 = r2
            int r2 = r15.getVisibility()
            if (r2 == r1) goto L90
            r18[r10] = r15
            int r10 = r10 + 1
        L90:
            int r3 = r3 + 1
            r2 = r18
            goto L7c
        L95:
            r18 = r2
            r1 = r18
        L99:
            r2 = r10
            goto L9d
        L9b:
            r1 = r2
            goto L99
        L9d:
            r0.mDisplayedWidgets = r1
            r0.mDisplayedWidgetsCount = r2
            int r3 = r0.mWrapMode
            if (r3 == 0) goto Lb8
            r10 = 1
            if (r3 == r10) goto Lb2
            r10 = 2
            if (r3 == r10) goto Lac
            goto Lbd
        Lac:
            int r3 = r0.mOrientation
            r0.measureAligned(r1, r2, r3, r4, r5)
            goto Lbd
        Lb2:
            int r3 = r0.mOrientation
            r0.measureChainWrap(r1, r2, r3, r4, r5)
            goto Lbd
        Lb8:
            int r3 = r0.mOrientation
            r0.measureNoWrap(r1, r2, r3, r4, r5)
        Lbd:
            r1 = r5[r17]
            int r1 = r1 + r11
            int r1 = r1 + r12
            r16 = 1
            r2 = r5[r16]
            int r2 = r2 + r13
            int r2 = r2 + r14
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r6 != r4) goto Lcf
            r1 = r7
            goto Lda
        Lcf:
            if (r6 != r3) goto Ld6
            int r1 = java.lang.Math.min(r1, r7)
            goto Lda
        Ld6:
            if (r6 != 0) goto Ld9
            goto Lda
        Ld9:
            r1 = 0
        Lda:
            if (r8 != r4) goto Lde
            r2 = r9
            goto Le9
        Lde:
            if (r8 != r3) goto Le5
            int r2 = java.lang.Math.min(r2, r9)
            goto Le9
        Le5:
            if (r8 != 0) goto Le8
            goto Le9
        Le8:
            r2 = 0
        Le9:
            r0.setMeasure(r1, r2)
            r0.setWidth(r1)
            r0.setHeight(r2)
            int r1 = r0.mWidgetsCount
            if (r1 <= 0) goto Lf8
            r10 = 1
            goto Lf9
        Lf8:
            r10 = 0
        Lf9:
            r0.needsCallbackFromSolver(r10)
            return
    }

    public void setFirstHorizontalBias(float r1) {
            r0 = this;
            r0.mFirstHorizontalBias = r1
            return
    }

    public void setFirstHorizontalStyle(int r1) {
            r0 = this;
            r0.mFirstHorizontalStyle = r1
            return
    }

    public void setFirstVerticalBias(float r1) {
            r0 = this;
            r0.mFirstVerticalBias = r1
            return
    }

    public void setFirstVerticalStyle(int r1) {
            r0 = this;
            r0.mFirstVerticalStyle = r1
            return
    }

    public void setHorizontalAlign(int r1) {
            r0 = this;
            r0.mHorizontalAlign = r1
            return
    }

    public void setHorizontalBias(float r1) {
            r0 = this;
            r0.mHorizontalBias = r1
            return
    }

    public void setHorizontalGap(int r1) {
            r0 = this;
            r0.mHorizontalGap = r1
            return
    }

    public void setHorizontalStyle(int r1) {
            r0 = this;
            r0.mHorizontalStyle = r1
            return
    }

    public void setLastHorizontalBias(float r1) {
            r0 = this;
            r0.mLastHorizontalBias = r1
            return
    }

    public void setLastHorizontalStyle(int r1) {
            r0 = this;
            r0.mLastHorizontalStyle = r1
            return
    }

    public void setLastVerticalBias(float r1) {
            r0 = this;
            r0.mLastVerticalBias = r1
            return
    }

    public void setLastVerticalStyle(int r1) {
            r0 = this;
            r0.mLastVerticalStyle = r1
            return
    }

    public void setMaxElementsWrap(int r1) {
            r0 = this;
            r0.mMaxElementsWrap = r1
            return
    }

    public void setOrientation(int r1) {
            r0 = this;
            r0.mOrientation = r1
            return
    }

    public void setVerticalAlign(int r1) {
            r0 = this;
            r0.mVerticalAlign = r1
            return
    }

    public void setVerticalBias(float r1) {
            r0 = this;
            r0.mVerticalBias = r1
            return
    }

    public void setVerticalGap(int r1) {
            r0 = this;
            r0.mVerticalGap = r1
            return
    }

    public void setVerticalStyle(int r1) {
            r0 = this;
            r0.mVerticalStyle = r1
            return
    }

    public void setWrapMode(int r1) {
            r0 = this;
            r0.mWrapMode = r1
            return
    }
}
