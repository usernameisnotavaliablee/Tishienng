package androidx.constraintlayout.solver.state.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AlignHorizontallyReference extends androidx.constraintlayout.solver.state.HelperReference {
    private float mBias;
    private java.lang.Object mEndToEnd;
    private java.lang.Object mEndToStart;
    private java.lang.Object mStartToEnd;
    private java.lang.Object mStartToStart;

    public AlignHorizontallyReference(androidx.constraintlayout.solver.state.State r2) {
            r1 = this;
            androidx.constraintlayout.solver.state.State$Helper r0 = androidx.constraintlayout.solver.state.State.Helper.ALIGN_VERTICALLY
            r1.<init>(r2, r0)
            r2 = 1056964608(0x3f000000, float:0.5)
            r1.mBias = r2
            return
    }

    @Override // androidx.constraintlayout.solver.state.HelperReference
    public void apply() {
            r4 = this;
            java.util.ArrayList<java.lang.Object> r0 = r4.mReferences
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.solver.state.State r2 = r4.mState
            androidx.constraintlayout.solver.state.ConstraintReference r1 = r2.constraints(r1)
            r1.clearHorizontal()
            java.lang.Object r2 = r4.mStartToStart
            if (r2 == 0) goto L21
            r1.startToStart(r2)
            goto L2e
        L21:
            java.lang.Object r2 = r4.mStartToEnd
            if (r2 == 0) goto L29
            r1.startToEnd(r2)
            goto L2e
        L29:
            java.lang.Integer r2 = androidx.constraintlayout.solver.state.State.PARENT
            r1.startToStart(r2)
        L2e:
            java.lang.Object r2 = r4.mEndToStart
            if (r2 == 0) goto L36
            r1.endToStart(r2)
            goto L43
        L36:
            java.lang.Object r2 = r4.mEndToEnd
            if (r2 == 0) goto L3e
            r1.endToEnd(r2)
            goto L43
        L3e:
            java.lang.Integer r2 = androidx.constraintlayout.solver.state.State.PARENT
            r1.endToEnd(r2)
        L43:
            float r2 = r4.mBias
            r3 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L6
            r1.horizontalBias(r2)
            goto L6
        L4f:
            return
    }

    public void bias(float r1) {
            r0 = this;
            r0.mBias = r1
            return
    }

    public void endToEnd(java.lang.Object r1) {
            r0 = this;
            r0.mEndToEnd = r1
            return
    }

    public void endToStart(java.lang.Object r1) {
            r0 = this;
            r0.mEndToStart = r1
            return
    }

    public void startToEnd(java.lang.Object r1) {
            r0 = this;
            r0.mStartToEnd = r1
            return
    }

    public void startToStart(java.lang.Object r1) {
            r0 = this;
            r0.mStartToStart = r1
            return
    }
}
