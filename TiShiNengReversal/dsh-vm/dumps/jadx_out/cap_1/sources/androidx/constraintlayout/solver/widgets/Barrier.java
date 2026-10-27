package androidx.constraintlayout.solver.widgets;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Barrier extends androidx.constraintlayout.solver.widgets.HelperWidget {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int TOP = 2;
    private boolean mAllowsGoneWidget;
    private int mBarrierType;
    private int mMargin;

    public Barrier() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mBarrierType = r0
            r1 = 1
            r2.mAllowsGoneWidget = r1
            r2.mMargin = r0
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void addToSolver(androidx.constraintlayout.solver.LinearSystem r14) {
            r13 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r13.mLeft
            r2 = 0
            r0[r2] = r1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r13.mTop
            r3 = 2
            r0[r3] = r1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r13.mRight
            r4 = 1
            r0[r4] = r1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r13.mBottom
            r5 = 3
            r0[r5] = r1
            r0 = 0
        L17:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r13.mListAnchors
            int r6 = r1.length
            if (r0 >= r6) goto L27
            r1 = r1[r0]
            androidx.constraintlayout.solver.SolverVariable r6 = r14.createObjectVariable(r1)
            r1.mSolverVariable = r6
            int r0 = r0 + 1
            goto L17
        L27:
            int r0 = r13.mBarrierType
            if (r0 < 0) goto L1b9
            r6 = 4
            if (r0 >= r6) goto L1b9
            r0 = r1[r0]
            r1 = 0
        L31:
            int r7 = r13.mWidgetsCount
            if (r1 >= r7) goto L7e
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r7 = r13.mWidgets
            r7 = r7[r1]
            boolean r8 = r13.mAllowsGoneWidget
            if (r8 != 0) goto L44
            boolean r8 = r7.allowedInBarrier()
            if (r8 != 0) goto L44
            goto L7b
        L44:
            int r8 = r13.mBarrierType
            if (r8 == 0) goto L4a
            if (r8 != r4) goto L60
        L4a:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = r7.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r9) goto L60
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r7.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r8.mTarget
            if (r8 == 0) goto L60
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r7.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r8.mTarget
            if (r8 == 0) goto L60
        L5e:
            r1 = 1
            goto L7f
        L60:
            int r8 = r13.mBarrierType
            if (r8 == r3) goto L66
            if (r8 != r5) goto L7b
        L66:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = r7.getVerticalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r9) goto L7b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r7.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r8.mTarget
            if (r8 == 0) goto L7b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 == 0) goto L7b
            goto L5e
        L7b:
            int r1 = r1 + 1
            goto L31
        L7e:
            r1 = 0
        L7f:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r13.mLeft
            boolean r7 = r7.hasCenteredDependents()
            if (r7 != 0) goto L92
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r13.mRight
            boolean r7 = r7.hasCenteredDependents()
            if (r7 == 0) goto L90
            goto L92
        L90:
            r7 = 0
            goto L93
        L92:
            r7 = 1
        L93:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r13.mTop
            boolean r8 = r8.hasCenteredDependents()
            if (r8 != 0) goto La6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r13.mBottom
            boolean r8 = r8.hasCenteredDependents()
            if (r8 == 0) goto La4
            goto La6
        La4:
            r8 = 0
            goto La7
        La6:
            r8 = 1
        La7:
            if (r1 != 0) goto Lbd
            int r9 = r13.mBarrierType
            if (r9 != 0) goto Laf
            if (r7 != 0) goto Lbb
        Laf:
            if (r9 != r3) goto Lb3
            if (r8 != 0) goto Lbb
        Lb3:
            if (r9 != r4) goto Lb7
            if (r7 != 0) goto Lbb
        Lb7:
            if (r9 != r5) goto Lbd
            if (r8 == 0) goto Lbd
        Lbb:
            r7 = 1
            goto Lbe
        Lbd:
            r7 = 0
        Lbe:
            if (r7 != 0) goto Lc2
            r7 = 4
            goto Lc3
        Lc2:
            r7 = 5
        Lc3:
            r8 = 0
        Lc4:
            int r9 = r13.mWidgetsCount
            if (r8 >= r9) goto L116
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r9 = r13.mWidgets
            r9 = r9[r8]
            boolean r10 = r13.mAllowsGoneWidget
            if (r10 != 0) goto Ld7
            boolean r10 = r9.allowedInBarrier()
            if (r10 != 0) goto Ld7
            goto L113
        Ld7:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r10 = r9.mListAnchors
            int r11 = r13.mBarrierType
            r10 = r10[r11]
            androidx.constraintlayout.solver.SolverVariable r10 = r14.createObjectVariable(r10)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r9 = r9.mListAnchors
            int r11 = r13.mBarrierType
            r9 = r9[r11]
            r9.mSolverVariable = r10
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r9.mTarget
            if (r12 == 0) goto Lf4
            androidx.constraintlayout.solver.widgets.ConstraintWidget r12 = r12.mOwner
            if (r12 != r13) goto Lf4
            int r9 = r9.mMargin
            goto Lf5
        Lf4:
            r9 = 0
        Lf5:
            if (r11 == 0) goto L103
            if (r11 != r3) goto Lfa
            goto L103
        Lfa:
            androidx.constraintlayout.solver.SolverVariable r11 = r0.mSolverVariable
            int r12 = r13.mMargin
            int r12 = r12 + r9
            r14.addGreaterBarrier(r11, r10, r12, r1)
            goto L10b
        L103:
            androidx.constraintlayout.solver.SolverVariable r11 = r0.mSolverVariable
            int r12 = r13.mMargin
            int r12 = r12 - r9
            r14.addLowerBarrier(r11, r10, r12, r1)
        L10b:
            androidx.constraintlayout.solver.SolverVariable r11 = r0.mSolverVariable
            int r12 = r13.mMargin
            int r12 = r12 + r9
            r14.addEquality(r11, r10, r12, r7)
        L113:
            int r8 = r8 + 1
            goto Lc4
        L116:
            int r0 = r13.mBarrierType
            r1 = 8
            if (r0 != 0) goto L142
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r13.mRight
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r13.mLeft
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            r14.addEquality(r0, r3, r2, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r13.mLeft
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mRight
            androidx.constraintlayout.solver.SolverVariable r1 = r1.mSolverVariable
            r14.addEquality(r0, r1, r2, r6)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r13.mLeft
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mLeft
            androidx.constraintlayout.solver.SolverVariable r1 = r1.mSolverVariable
            r14.addEquality(r0, r1, r2, r2)
            return
        L142:
            if (r0 != r4) goto L16a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r13.mLeft
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r13.mRight
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            r14.addEquality(r0, r3, r2, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r13.mLeft
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mLeft
            androidx.constraintlayout.solver.SolverVariable r1 = r1.mSolverVariable
            r14.addEquality(r0, r1, r2, r6)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r13.mLeft
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mRight
            androidx.constraintlayout.solver.SolverVariable r1 = r1.mSolverVariable
            r14.addEquality(r0, r1, r2, r2)
            return
        L16a:
            if (r0 != r3) goto L192
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r13.mBottom
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r13.mTop
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            r14.addEquality(r0, r3, r2, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r13.mTop
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mBottom
            androidx.constraintlayout.solver.SolverVariable r1 = r1.mSolverVariable
            r14.addEquality(r0, r1, r2, r6)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r13.mTop
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTop
            androidx.constraintlayout.solver.SolverVariable r1 = r1.mSolverVariable
            r14.addEquality(r0, r1, r2, r2)
            return
        L192:
            if (r0 != r5) goto L1b9
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r13.mTop
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r13.mBottom
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            r14.addEquality(r0, r3, r2, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r13.mTop
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTop
            androidx.constraintlayout.solver.SolverVariable r1 = r1.mSolverVariable
            r14.addEquality(r0, r1, r2, r6)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r13.mTop
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.mParent
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mBottom
            androidx.constraintlayout.solver.SolverVariable r1 = r1.mSolverVariable
            r14.addEquality(r0, r1, r2, r2)
        L1b9:
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean allowsGoneWidget() {
            r1 = this;
            boolean r0 = r1.mAllowsGoneWidget
            return r0
    }

    @Override // androidx.constraintlayout.solver.widgets.HelperWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void copy(androidx.constraintlayout.solver.widgets.ConstraintWidget r1, java.util.HashMap<androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget> r2) {
            r0 = this;
            super.copy(r1, r2)
            androidx.constraintlayout.solver.widgets.Barrier r1 = (androidx.constraintlayout.solver.widgets.Barrier) r1
            int r2 = r1.mBarrierType
            r0.mBarrierType = r2
            boolean r2 = r1.mAllowsGoneWidget
            r0.mAllowsGoneWidget = r2
            int r1 = r1.mMargin
            r0.mMargin = r1
            return
    }

    public int getBarrierType() {
            r1 = this;
            int r0 = r1.mBarrierType
            return r0
    }

    public int getMargin() {
            r1 = this;
            int r0 = r1.mMargin
            return r0
    }

    protected void markWidgets() {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r6.mWidgetsCount
            if (r1 >= r2) goto L22
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r2 = r6.mWidgets
            r2 = r2[r1]
            int r3 = r6.mBarrierType
            r4 = 1
            if (r3 == 0) goto L1c
            if (r3 != r4) goto L12
            goto L1c
        L12:
            r5 = 2
            if (r3 == r5) goto L18
            r5 = 3
            if (r3 != r5) goto L1f
        L18:
            r2.setInBarrier(r4, r4)
            goto L1f
        L1c:
            r2.setInBarrier(r0, r4)
        L1f:
            int r1 = r1 + 1
            goto L2
        L22:
            return
    }

    public void setAllowsGoneWidget(boolean r1) {
            r0 = this;
            r0.mAllowsGoneWidget = r1
            return
    }

    public void setBarrierType(int r1) {
            r0 = this;
            r0.mBarrierType = r1
            return
    }

    public void setMargin(int r1) {
            r0 = this;
            r0.mMargin = r1
            return
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[Barrier] "
            r0.append(r1)
            java.lang.String r1 = r4.getDebugName()
            r0.append(r1)
            java.lang.String r1 = " {"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
        L1b:
            int r2 = r4.mWidgetsCount
            if (r1 >= r2) goto L4c
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r2 = r4.mWidgets
            r2 = r2[r1]
            if (r1 <= 0) goto L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = ", "
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L36:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = r2.getDebugName()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            int r1 = r1 + 1
            goto L1b
        L4c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "}"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
