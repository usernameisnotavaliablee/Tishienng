package androidx.work.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class PruneWorkRunnable implements java.lang.Runnable {
    private final androidx.work.impl.OperationImpl mOperation;
    private final androidx.work.impl.WorkManagerImpl mWorkManagerImpl;

    public PruneWorkRunnable(androidx.work.impl.WorkManagerImpl r1) {
            r0 = this;
            r0.<init>()
            r0.mWorkManagerImpl = r1
            androidx.work.impl.OperationImpl r1 = new androidx.work.impl.OperationImpl
            r1.<init>()
            r0.mOperation = r1
            return
    }

    public androidx.work.Operation getOperation() {
            r1 = this;
            androidx.work.impl.OperationImpl r0 = r1.mOperation
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            androidx.work.impl.WorkManagerImpl r0 = r3.mWorkManagerImpl     // Catch: java.lang.Throwable -> L15
            androidx.work.impl.WorkDatabase r0 = r0.getWorkDatabase()     // Catch: java.lang.Throwable -> L15
            androidx.work.impl.model.WorkSpecDao r0 = r0.workSpecDao()     // Catch: java.lang.Throwable -> L15
            r0.pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast()     // Catch: java.lang.Throwable -> L15
            androidx.work.impl.OperationImpl r0 = r3.mOperation     // Catch: java.lang.Throwable -> L15
            androidx.work.Operation$State$SUCCESS r1 = androidx.work.Operation.SUCCESS     // Catch: java.lang.Throwable -> L15
            r0.setState(r1)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r0 = move-exception
            androidx.work.impl.OperationImpl r1 = r3.mOperation
            androidx.work.Operation$State$FAILURE r2 = new androidx.work.Operation$State$FAILURE
            r2.<init>(r0)
            r1.setState(r2)
            return
    }
}
