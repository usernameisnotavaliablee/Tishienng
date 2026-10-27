package androidx.constraintlayout.solver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Cache {
    androidx.constraintlayout.solver.Pools.Pool<androidx.constraintlayout.solver.ArrayRow> arrayRowPool;
    androidx.constraintlayout.solver.SolverVariable[] mIndexedVariables;
    androidx.constraintlayout.solver.Pools.Pool<androidx.constraintlayout.solver.ArrayRow> optimizedArrayRowPool;
    androidx.constraintlayout.solver.Pools.Pool<androidx.constraintlayout.solver.SolverVariable> solverVariablePool;

    public Cache() {
            r2 = this;
            r2.<init>()
            androidx.constraintlayout.solver.Pools$SimplePool r0 = new androidx.constraintlayout.solver.Pools$SimplePool
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            r2.optimizedArrayRowPool = r0
            androidx.constraintlayout.solver.Pools$SimplePool r0 = new androidx.constraintlayout.solver.Pools$SimplePool
            r0.<init>(r1)
            r2.arrayRowPool = r0
            androidx.constraintlayout.solver.Pools$SimplePool r0 = new androidx.constraintlayout.solver.Pools$SimplePool
            r0.<init>(r1)
            r2.solverVariablePool = r0
            r0 = 32
            androidx.constraintlayout.solver.SolverVariable[] r0 = new androidx.constraintlayout.solver.SolverVariable[r0]
            r2.mIndexedVariables = r0
            return
    }
}
