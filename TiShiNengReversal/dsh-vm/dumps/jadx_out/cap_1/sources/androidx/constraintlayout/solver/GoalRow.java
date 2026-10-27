package androidx.constraintlayout.solver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class GoalRow extends androidx.constraintlayout.solver.ArrayRow {
    public GoalRow(androidx.constraintlayout.solver.Cache r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // androidx.constraintlayout.solver.ArrayRow, androidx.constraintlayout.solver.LinearSystem.Row
    public void addError(androidx.constraintlayout.solver.SolverVariable r2) {
            r1 = this;
            super.addError(r2)
            int r0 = r2.usageInRowCount
            int r0 = r0 + (-1)
            r2.usageInRowCount = r0
            return
    }
}
