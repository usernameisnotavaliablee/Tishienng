package androidx.constraintlayout.solver.widgets;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ChainHead {
    private boolean mDefined;
    protected androidx.constraintlayout.solver.widgets.ConstraintWidget mFirst;
    protected androidx.constraintlayout.solver.widgets.ConstraintWidget mFirstMatchConstraintWidget;
    protected androidx.constraintlayout.solver.widgets.ConstraintWidget mFirstVisibleWidget;
    protected boolean mHasComplexMatchWeights;
    protected boolean mHasDefinedWeights;
    protected boolean mHasRatio;
    protected boolean mHasUndefinedWeights;
    protected androidx.constraintlayout.solver.widgets.ConstraintWidget mHead;
    private boolean mIsRtl;
    protected androidx.constraintlayout.solver.widgets.ConstraintWidget mLast;
    protected androidx.constraintlayout.solver.widgets.ConstraintWidget mLastMatchConstraintWidget;
    protected androidx.constraintlayout.solver.widgets.ConstraintWidget mLastVisibleWidget;
    boolean mOptimizable;
    private int mOrientation;
    int mTotalMargins;
    int mTotalSize;
    protected float mTotalWeight;
    int mVisibleWidgets;
    protected java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> mWeightedMatchConstraintsWidgets;
    protected int mWidgetsCount;
    protected int mWidgetsMatchCount;

    public ChainHead(androidx.constraintlayout.solver.widgets.ConstraintWidget r2, int r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mTotalWeight = r0
            r1.mFirst = r2
            r1.mOrientation = r3
            r1.mIsRtl = r4
            return
    }

    private void defineChainProperties() {
            r12 = this;
            int r0 = r12.mOrientation
            r1 = 2
            int r0 = r0 * 2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r12.mFirst
            r3 = 1
            r12.mOptimizable = r3
            r4 = 0
            r5 = r2
            r6 = 0
        Ld:
            if (r6 != 0) goto L12e
            int r7 = r12.mWidgetsCount
            int r7 = r7 + r3
            r12.mWidgetsCount = r7
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r7 = r2.mNextChainWidget
            int r8 = r12.mOrientation
            r9 = 0
            r7[r8] = r9
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r7 = r2.mListNextMatchConstraintsWidget
            r7[r8] = r9
            int r7 = r2.getVisibility()
            r8 = 8
            if (r7 == r8) goto L103
            int r7 = r12.mVisibleWidgets
            int r7 = r7 + r3
            r12.mVisibleWidgets = r7
            int r7 = r12.mOrientation
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = r2.getDimensionBehaviour(r7)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 == r8) goto L41
            int r7 = r12.mTotalSize
            int r10 = r12.mOrientation
            int r10 = r2.getLength(r10)
            int r7 = r7 + r10
            r12.mTotalSize = r7
        L41:
            int r7 = r12.mTotalSize
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r10 = r2.mListAnchors
            r10 = r10[r0]
            int r10 = r10.getMargin()
            int r7 = r7 + r10
            r12.mTotalSize = r7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r10 = r2.mListAnchors
            int r11 = r0 + 1
            r10 = r10[r11]
            int r10 = r10.getMargin()
            int r7 = r7 + r10
            r12.mTotalSize = r7
            int r7 = r12.mTotalMargins
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r10 = r2.mListAnchors
            r10 = r10[r0]
            int r10 = r10.getMargin()
            int r7 = r7 + r10
            r12.mTotalMargins = r7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r10 = r2.mListAnchors
            r10 = r10[r11]
            int r10 = r10.getMargin()
            int r7 = r7 + r10
            r12.mTotalMargins = r7
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r12.mFirstVisibleWidget
            if (r7 != 0) goto L79
            r12.mFirstVisibleWidget = r2
        L79:
            r12.mLastVisibleWidget = r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r2.mListDimensionBehaviors
            int r10 = r12.mOrientation
            r7 = r7[r10]
            if (r7 != r8) goto L103
            int[] r7 = r2.mResolvedMatchConstraintDefault
            r7 = r7[r10]
            r8 = 0
            if (r7 == 0) goto L8f
            r11 = 3
            if (r7 == r11) goto L8f
            if (r7 != r1) goto Ld2
        L8f:
            int r7 = r12.mWidgetsMatchCount
            int r7 = r7 + r3
            r12.mWidgetsMatchCount = r7
            float[] r7 = r2.mWeight
            r7 = r7[r10]
            int r11 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r11 <= 0) goto La1
            float r11 = r12.mTotalWeight
            float r11 = r11 + r7
            r12.mTotalWeight = r11
        La1:
            boolean r10 = isMatchConstraintEqualityCandidate(r2, r10)
            if (r10 == 0) goto Lc0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto Lae
            r12.mHasUndefinedWeights = r3
            goto Lb0
        Lae:
            r12.mHasDefinedWeights = r3
        Lb0:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r7 = r12.mWeightedMatchConstraintsWidgets
            if (r7 != 0) goto Lbb
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r12.mWeightedMatchConstraintsWidgets = r7
        Lbb:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r7 = r12.mWeightedMatchConstraintsWidgets
            r7.add(r2)
        Lc0:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r12.mFirstMatchConstraintWidget
            if (r7 != 0) goto Lc6
            r12.mFirstMatchConstraintWidget = r2
        Lc6:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r12.mLastMatchConstraintWidget
            if (r7 == 0) goto Ld0
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r7 = r7.mListNextMatchConstraintsWidget
            int r10 = r12.mOrientation
            r7[r10] = r2
        Ld0:
            r12.mLastMatchConstraintWidget = r2
        Ld2:
            int r7 = r12.mOrientation
            if (r7 != 0) goto Le8
            int r7 = r2.mMatchConstraintDefaultWidth
            if (r7 == 0) goto Ldd
            r12.mOptimizable = r4
            goto Lf9
        Ldd:
            int r7 = r2.mMatchConstraintMinWidth
            if (r7 != 0) goto Le5
            int r7 = r2.mMatchConstraintMaxWidth
            if (r7 == 0) goto Lf9
        Le5:
            r12.mOptimizable = r4
            goto Lf9
        Le8:
            int r7 = r2.mMatchConstraintDefaultHeight
            if (r7 == 0) goto Lef
            r12.mOptimizable = r4
            goto Lf9
        Lef:
            int r7 = r2.mMatchConstraintMinHeight
            if (r7 != 0) goto Lf7
            int r7 = r2.mMatchConstraintMaxHeight
            if (r7 == 0) goto Lf9
        Lf7:
            r12.mOptimizable = r4
        Lf9:
            float r7 = r2.mDimensionRatio
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L103
            r12.mOptimizable = r4
            r12.mHasRatio = r3
        L103:
            if (r5 == r2) goto L10b
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r5 = r5.mNextChainWidget
            int r7 = r12.mOrientation
            r5[r7] = r2
        L10b:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r2.mListAnchors
            int r7 = r0 + 1
            r5 = r5[r7]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L125
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r5.mOwner
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r5.mListAnchors
            r7 = r7[r0]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 == 0) goto L125
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r7.mOwner
            if (r7 == r2) goto L124
            goto L125
        L124:
            r9 = r5
        L125:
            if (r9 == 0) goto L128
            goto L12a
        L128:
            r9 = r2
            r6 = 1
        L12a:
            r5 = r2
            r2 = r9
            goto Ld
        L12e:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r12.mFirstVisibleWidget
            if (r1 == 0) goto L13f
            int r5 = r12.mTotalSize
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r0]
            int r1 = r1.getMargin()
            int r5 = r5 - r1
            r12.mTotalSize = r5
        L13f:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r12.mLastVisibleWidget
            if (r1 == 0) goto L151
            int r5 = r12.mTotalSize
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            int r0 = r0 + r3
            r0 = r1[r0]
            int r0 = r0.getMargin()
            int r5 = r5 - r0
            r12.mTotalSize = r5
        L151:
            r12.mLast = r2
            int r0 = r12.mOrientation
            if (r0 != 0) goto L15e
            boolean r0 = r12.mIsRtl
            if (r0 == 0) goto L15e
            r12.mHead = r2
            goto L162
        L15e:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r12.mFirst
            r12.mHead = r0
        L162:
            boolean r0 = r12.mHasDefinedWeights
            if (r0 == 0) goto L16b
            boolean r0 = r12.mHasUndefinedWeights
            if (r0 == 0) goto L16b
            goto L16c
        L16b:
            r3 = 0
        L16c:
            r12.mHasComplexMatchWeights = r3
            return
    }

    private static boolean isMatchConstraintEqualityCandidate(androidx.constraintlayout.solver.widgets.ConstraintWidget r2, int r3) {
            int r0 = r2.getVisibility()
            r1 = 8
            if (r0 == r1) goto L1b
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r2.mListDimensionBehaviors
            r0 = r0[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L1b
            int[] r2 = r2.mResolvedMatchConstraintDefault
            r2 = r2[r3]
            if (r2 == 0) goto L19
            r3 = 3
            if (r2 != r3) goto L1b
        L19:
            r2 = 1
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public void define() {
            r1 = this;
            boolean r0 = r1.mDefined
            if (r0 != 0) goto L7
            r1.defineChainProperties()
        L7:
            r0 = 1
            r1.mDefined = r0
            return
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget getFirst() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.mFirst
            return r0
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget getFirstMatchConstraintWidget() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.mFirstMatchConstraintWidget
            return r0
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget getFirstVisibleWidget() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.mFirstVisibleWidget
            return r0
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget getHead() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.mHead
            return r0
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget getLast() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.mLast
            return r0
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget getLastMatchConstraintWidget() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.mLastMatchConstraintWidget
            return r0
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget getLastVisibleWidget() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.mLastVisibleWidget
            return r0
    }

    public float getTotalWeight() {
            r1 = this;
            float r0 = r1.mTotalWeight
            return r0
    }
}
