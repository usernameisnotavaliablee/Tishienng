package androidx.constraintlayout.solver.state.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class GuidelineReference implements androidx.constraintlayout.solver.state.Reference {
    private java.lang.Object key;
    private int mEnd;
    private androidx.constraintlayout.solver.widgets.Guideline mGuidelineWidget;
    private int mOrientation;
    private float mPercent;
    private int mStart;
    final androidx.constraintlayout.solver.state.State mState;

    public GuidelineReference(androidx.constraintlayout.solver.state.State r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mStart = r0
            r1.mEnd = r0
            r0 = 0
            r1.mPercent = r0
            r1.mState = r2
            return
    }

    @Override // androidx.constraintlayout.solver.state.Reference
    public void apply() {
            r2 = this;
            androidx.constraintlayout.solver.widgets.Guideline r0 = r2.mGuidelineWidget
            int r1 = r2.mOrientation
            r0.setOrientation(r1)
            int r0 = r2.mStart
            r1 = -1
            if (r0 == r1) goto L12
            androidx.constraintlayout.solver.widgets.Guideline r1 = r2.mGuidelineWidget
            r1.setGuideBegin(r0)
            return
        L12:
            int r0 = r2.mEnd
            if (r0 == r1) goto L1c
            androidx.constraintlayout.solver.widgets.Guideline r1 = r2.mGuidelineWidget
            r1.setGuideEnd(r0)
            return
        L1c:
            androidx.constraintlayout.solver.widgets.Guideline r0 = r2.mGuidelineWidget
            float r1 = r2.mPercent
            r0.setGuidePercent(r1)
            return
    }

    public void end(java.lang.Object r2) {
            r1 = this;
            r0 = -1
            r1.mStart = r0
            androidx.constraintlayout.solver.state.State r0 = r1.mState
            int r2 = r0.convertDimension(r2)
            r1.mEnd = r2
            r2 = 0
            r1.mPercent = r2
            return
    }

    @Override // androidx.constraintlayout.solver.state.Reference
    public androidx.constraintlayout.solver.widgets.ConstraintWidget getConstraintWidget() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.Guideline r0 = r1.mGuidelineWidget
            if (r0 != 0) goto Lb
            androidx.constraintlayout.solver.widgets.Guideline r0 = new androidx.constraintlayout.solver.widgets.Guideline
            r0.<init>()
            r1.mGuidelineWidget = r0
        Lb:
            androidx.constraintlayout.solver.widgets.Guideline r0 = r1.mGuidelineWidget
            return r0
    }

    @Override // androidx.constraintlayout.solver.state.Reference
    public java.lang.Object getKey() {
            r1 = this;
            java.lang.Object r0 = r1.key
            return r0
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.mOrientation
            return r0
    }

    public void percent(float r2) {
            r1 = this;
            r0 = -1
            r1.mStart = r0
            r1.mEnd = r0
            r1.mPercent = r2
            return
    }

    @Override // androidx.constraintlayout.solver.state.Reference
    public void setConstraintWidget(androidx.constraintlayout.solver.widgets.ConstraintWidget r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.constraintlayout.solver.widgets.Guideline
            if (r0 == 0) goto L9
            androidx.constraintlayout.solver.widgets.Guideline r2 = (androidx.constraintlayout.solver.widgets.Guideline) r2
            r1.mGuidelineWidget = r2
            return
        L9:
            r2 = 0
            r1.mGuidelineWidget = r2
            return
    }

    @Override // androidx.constraintlayout.solver.state.Reference
    public void setKey(java.lang.Object r1) {
            r0 = this;
            r0.key = r1
            return
    }

    public void setOrientation(int r1) {
            r0 = this;
            r0.mOrientation = r1
            return
    }

    public void start(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.State r0 = r1.mState
            int r2 = r0.convertDimension(r2)
            r1.mStart = r2
            r2 = -1
            r1.mEnd = r2
            r2 = 0
            r1.mPercent = r2
            return
    }
}
