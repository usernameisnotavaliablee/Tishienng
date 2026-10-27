package androidx.constraintlayout.solver.widgets;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class VirtualLayout extends androidx.constraintlayout.solver.widgets.HelperWidget {
    protected androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measure mMeasure;
    private int mMeasuredHeight;
    private int mMeasuredWidth;
    androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer mMeasurer;
    private boolean mNeedsCallFromSolver;
    private int mPaddingBottom;
    private int mPaddingEnd;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingStart;
    private int mPaddingTop;
    private int mResolvedPaddingLeft;
    private int mResolvedPaddingRight;

    public VirtualLayout() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mPaddingTop = r0
            r1.mPaddingBottom = r0
            r1.mPaddingLeft = r0
            r1.mPaddingRight = r0
            r1.mPaddingStart = r0
            r1.mPaddingEnd = r0
            r1.mResolvedPaddingLeft = r0
            r1.mResolvedPaddingRight = r0
            r1.mNeedsCallFromSolver = r0
            r1.mMeasuredWidth = r0
            r1.mMeasuredHeight = r0
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r0 = new androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure
            r0.<init>()
            r1.mMeasure = r0
            r0 = 0
            r1.mMeasurer = r0
            return
    }

    public void applyRtl(boolean r3) {
            r2 = this;
            int r0 = r2.mPaddingStart
            if (r0 > 0) goto La
            int r1 = r2.mPaddingEnd
            if (r1 <= 0) goto L9
            goto La
        L9:
            return
        La:
            if (r3 == 0) goto L13
            int r3 = r2.mPaddingEnd
            r2.mResolvedPaddingLeft = r3
            r2.mResolvedPaddingRight = r0
            return
        L13:
            r2.mResolvedPaddingLeft = r0
            int r3 = r2.mPaddingEnd
            r2.mResolvedPaddingRight = r3
            return
    }

    public void captureWidgets() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.mWidgetsCount
            if (r0 >= r1) goto L12
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r1 = r3.mWidgets
            r1 = r1[r0]
            if (r1 == 0) goto Lf
            r2 = 1
            r1.setInVirtualLayout(r2)
        Lf:
            int r0 = r0 + 1
            goto L1
        L12:
            return
    }

    public int getMeasuredHeight() {
            r1 = this;
            int r0 = r1.mMeasuredHeight
            return r0
    }

    public int getMeasuredWidth() {
            r1 = this;
            int r0 = r1.mMeasuredWidth
            return r0
    }

    public int getPaddingBottom() {
            r1 = this;
            int r0 = r1.mPaddingBottom
            return r0
    }

    public int getPaddingLeft() {
            r1 = this;
            int r0 = r1.mResolvedPaddingLeft
            return r0
    }

    public int getPaddingRight() {
            r1 = this;
            int r0 = r1.mResolvedPaddingRight
            return r0
    }

    public int getPaddingTop() {
            r1 = this;
            int r0 = r1.mPaddingTop
            return r0
    }

    public void measure(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    protected void measure(androidx.constraintlayout.solver.widgets.ConstraintWidget r2, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r3, int r4, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r5, int r6) {
            r1 = this;
        L0:
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r0 = r1.mMeasurer
            if (r0 != 0) goto L17
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.getParent()
            if (r0 == 0) goto L17
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.getParent()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r0
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r0 = r0.getMeasurer()
            r1.mMeasurer = r0
            goto L0
        L17:
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r0 = r1.mMeasure
            r0.horizontalBehavior = r3
            r0.verticalBehavior = r5
            r0.horizontalDimension = r4
            r0.verticalDimension = r6
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r3 = r1.mMeasurer
            r3.measure(r2, r0)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            int r3 = r3.measuredWidth
            r2.setWidth(r3)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            int r3 = r3.measuredHeight
            r2.setHeight(r3)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            boolean r3 = r3.measuredHasBaseline
            r2.setHasBaseline(r3)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            int r3 = r3.measuredBaseline
            r2.setBaselineDistance(r3)
            return
    }

    protected boolean measureChildren() {
            r9 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r9.mParent
            if (r0 == 0) goto Lb
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) r0
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measurer r0 = r0.getMeasurer()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            r2 = 0
        L11:
            int r3 = r9.mWidgetsCount
            r4 = 1
            if (r2 >= r3) goto L72
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r3 = r9.mWidgets
            r3 = r3[r2]
            if (r3 != 0) goto L1d
            goto L6f
        L1d:
            boolean r5 = r3 instanceof androidx.constraintlayout.solver.widgets.Guideline
            if (r5 == 0) goto L22
            goto L6f
        L22:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = r3.getDimensionBehaviour(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = r3.getDimensionBehaviour(r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r7) goto L39
            int r8 = r3.mMatchConstraintDefaultWidth
            if (r8 == r4) goto L39
            if (r6 != r7) goto L39
            int r8 = r3.mMatchConstraintDefaultHeight
            if (r8 == r4) goto L39
            goto L6f
        L39:
            if (r5 != r7) goto L3d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L3d:
            if (r6 != r7) goto L41
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L41:
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r4 = r9.mMeasure
            r4.horizontalBehavior = r5
            r4.verticalBehavior = r6
            int r5 = r3.getWidth()
            r4.horizontalDimension = r5
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r4 = r9.mMeasure
            int r5 = r3.getHeight()
            r4.verticalDimension = r5
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r4 = r9.mMeasure
            r0.measure(r3, r4)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r4 = r9.mMeasure
            int r4 = r4.measuredWidth
            r3.setWidth(r4)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r4 = r9.mMeasure
            int r4 = r4.measuredHeight
            r3.setHeight(r4)
            androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$Measure r4 = r9.mMeasure
            int r4 = r4.measuredBaseline
            r3.setBaselineDistance(r4)
        L6f:
            int r2 = r2 + 1
            goto L11
        L72:
            return r4
    }

    public boolean needSolverPass() {
            r1 = this;
            boolean r0 = r1.mNeedsCallFromSolver
            return r0
    }

    protected void needsCallbackFromSolver(boolean r1) {
            r0 = this;
            r0.mNeedsCallFromSolver = r1
            return
    }

    public void setMeasure(int r1, int r2) {
            r0 = this;
            r0.mMeasuredWidth = r1
            r0.mMeasuredHeight = r2
            return
    }

    public void setPadding(int r1) {
            r0 = this;
            r0.mPaddingLeft = r1
            r0.mPaddingTop = r1
            r0.mPaddingRight = r1
            r0.mPaddingBottom = r1
            r0.mPaddingStart = r1
            r0.mPaddingEnd = r1
            return
    }

    public void setPaddingBottom(int r1) {
            r0 = this;
            r0.mPaddingBottom = r1
            return
    }

    public void setPaddingEnd(int r1) {
            r0 = this;
            r0.mPaddingEnd = r1
            return
    }

    public void setPaddingLeft(int r1) {
            r0 = this;
            r0.mPaddingLeft = r1
            r0.mResolvedPaddingLeft = r1
            return
    }

    public void setPaddingRight(int r1) {
            r0 = this;
            r0.mPaddingRight = r1
            r0.mResolvedPaddingRight = r1
            return
    }

    public void setPaddingStart(int r1) {
            r0 = this;
            r0.mPaddingStart = r1
            r0.mResolvedPaddingLeft = r1
            r0.mResolvedPaddingRight = r1
            return
    }

    public void setPaddingTop(int r1) {
            r0 = this;
            r0.mPaddingTop = r1
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.HelperWidget, androidx.constraintlayout.solver.widgets.Helper
    public void updateConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1) {
            r0 = this;
            r0.captureWidgets()
            return
    }
}
