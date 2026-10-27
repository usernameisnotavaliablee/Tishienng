package androidx.constraintlayout.solver.state;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class HelperReference {
    private androidx.constraintlayout.solver.widgets.HelperWidget mHelperWidget;
    protected java.util.ArrayList<java.lang.Object> mReferences;
    protected final androidx.constraintlayout.solver.state.State mState;
    final androidx.constraintlayout.solver.state.State.Helper mType;

    public HelperReference(androidx.constraintlayout.solver.state.State r2, androidx.constraintlayout.solver.state.State.Helper r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mReferences = r0
            r1.mState = r2
            r1.mType = r3
            return
    }

    public androidx.constraintlayout.solver.state.HelperReference add(java.lang.Object... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Le
            r2 = r5[r1]
            java.util.ArrayList<java.lang.Object> r3 = r4.mReferences
            r3.add(r2)
            int r1 = r1 + 1
            goto L2
        Le:
            return r4
    }

    public void apply() {
            r0 = this;
            return
    }

    public androidx.constraintlayout.solver.widgets.HelperWidget getHelperWidget() {
            r1 = this;
            androidx.constraintlayout.solver.widgets.HelperWidget r0 = r1.mHelperWidget
            return r0
    }

    public androidx.constraintlayout.solver.state.State.Helper getType() {
            r1 = this;
            androidx.constraintlayout.solver.state.State$Helper r0 = r1.mType
            return r0
    }

    public void setHelperWidget(androidx.constraintlayout.solver.widgets.HelperWidget r1) {
            r0 = this;
            r0.mHelperWidget = r1
            return
    }
}
