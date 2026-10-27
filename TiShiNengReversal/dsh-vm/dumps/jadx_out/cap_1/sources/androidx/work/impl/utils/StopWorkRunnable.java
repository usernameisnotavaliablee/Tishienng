package androidx.work.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class StopWorkRunnable implements java.lang.Runnable {
    private static final java.lang.String TAG = null;
    private final boolean mStopInForeground;
    private final androidx.work.impl.WorkManagerImpl mWorkManagerImpl;
    private final java.lang.String mWorkSpecId;

    static {
            java.lang.String r0 = "StopWorkRunnable"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.utils.StopWorkRunnable.TAG = r0
            return
    }

    public StopWorkRunnable(@androidx.annotation.NonNull androidx.work.impl.WorkManagerImpl r1, @androidx.annotation.NonNull java.lang.String r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.mWorkManagerImpl = r1
            r0.mWorkSpecId = r2
            r0.mStopInForeground = r3
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r8 = this;
            androidx.work.impl.WorkManagerImpl r0 = r8.mWorkManagerImpl
            androidx.work.impl.WorkDatabase r0 = r0.getWorkDatabase()
            androidx.work.impl.WorkManagerImpl r1 = r8.mWorkManagerImpl
            androidx.work.impl.Processor r1 = r1.getProcessor()
            androidx.work.impl.model.WorkSpecDao r2 = r0.workSpecDao()
            r0.beginTransaction()
            java.lang.String r3 = r8.mWorkSpecId     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r1.isEnqueuedInForeground(r3)     // Catch: java.lang.Throwable -> L2a
            boolean r3 = r8.mStopInForeground     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L2c
            androidx.work.impl.WorkManagerImpl r1 = r8.mWorkManagerImpl     // Catch: java.lang.Throwable -> L2a
            androidx.work.impl.Processor r1 = r1.getProcessor()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = r8.mWorkSpecId     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r1.stopForegroundWork(r2)     // Catch: java.lang.Throwable -> L2a
            goto L4f
        L2a:
            r1 = move-exception
            goto L76
        L2c:
            if (r1 != 0) goto L43
            java.lang.String r1 = r8.mWorkSpecId     // Catch: java.lang.Throwable -> L2a
            androidx.work.WorkInfo$State r1 = r2.getState(r1)     // Catch: java.lang.Throwable -> L2a
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo.State.RUNNING     // Catch: java.lang.Throwable -> L2a
            if (r1 != r3) goto L43
            androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.ENQUEUED     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = r8.mWorkSpecId     // Catch: java.lang.Throwable -> L2a
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L2a
            r2.setState(r1, r3)     // Catch: java.lang.Throwable -> L2a
        L43:
            androidx.work.impl.WorkManagerImpl r1 = r8.mWorkManagerImpl     // Catch: java.lang.Throwable -> L2a
            androidx.work.impl.Processor r1 = r1.getProcessor()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = r8.mWorkSpecId     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r1.stopWork(r2)     // Catch: java.lang.Throwable -> L2a
        L4f:
            androidx.work.Logger r2 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = androidx.work.impl.utils.StopWorkRunnable.TAG     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = "StopWorkRunnable for %s; Processor.stopWork = %s"
            java.lang.String r5 = r8.mWorkSpecId     // Catch: java.lang.Throwable -> L2a
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L2a
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L2a
            r7 = 0
            r6[r7] = r5     // Catch: java.lang.Throwable -> L2a
            r5 = 1
            r6[r5] = r1     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = java.lang.String.format(r4, r6)     // Catch: java.lang.Throwable -> L2a
            java.lang.Throwable[] r4 = new java.lang.Throwable[r7]     // Catch: java.lang.Throwable -> L2a
            r2.debug(r3, r1, r4)     // Catch: java.lang.Throwable -> L2a
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L2a
            r0.endTransaction()
            return
        L76:
            r0.endTransaction()
            throw r1
    }
}
