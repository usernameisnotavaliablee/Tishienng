package androidx.constraintlayout.solver.state.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ChainReference extends androidx.constraintlayout.solver.state.HelperReference {
    protected float mBias;
    protected androidx.constraintlayout.solver.state.State.Chain mStyle;

    public ChainReference(androidx.constraintlayout.solver.state.State r1, androidx.constraintlayout.solver.state.State.Helper r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.mBias = r1
            androidx.constraintlayout.solver.state.State$Chain r1 = androidx.constraintlayout.solver.state.State.Chain.SPREAD
            r0.mStyle = r1
            return
    }

    public void bias(float r1) {
            r0 = this;
            r0.mBias = r1
            return
    }

    public float getBias() {
            r1 = this;
            float r0 = r1.mBias
            return r0
    }

    public androidx.constraintlayout.solver.state.State.Chain getStyle() {
            r1 = this;
            androidx.constraintlayout.solver.state.State$Chain r0 = androidx.constraintlayout.solver.state.State.Chain.SPREAD
            return r0
    }

    public void style(androidx.constraintlayout.solver.state.State.Chain r1) {
            r0 = this;
            r0.mStyle = r1
            return
    }
}
