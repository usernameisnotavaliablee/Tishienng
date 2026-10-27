package androidx.work.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class WorkProgressUpdater implements androidx.work.ProgressUpdater {
    static final java.lang.String TAG = null;
    final androidx.work.impl.utils.taskexecutor.TaskExecutor mTaskExecutor;
    final androidx.work.impl.WorkDatabase mWorkDatabase;


    static {
            java.lang.String r0 = "WorkProgressUpdater"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.utils.WorkProgressUpdater.TAG = r0
            return
    }

    public WorkProgressUpdater(@androidx.annotation.NonNull androidx.work.impl.WorkDatabase r1, @androidx.annotation.NonNull androidx.work.impl.utils.taskexecutor.TaskExecutor r2) {
            r0 = this;
            r0.<init>()
            r0.mWorkDatabase = r1
            r0.mTaskExecutor = r2
            return
    }

    @Override // androidx.work.ProgressUpdater
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> updateProgress(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull java.util.UUID r4, @androidx.annotation.NonNull androidx.work.Data r5) {
            r2 = this;
            androidx.work.impl.utils.futures.SettableFuture r3 = androidx.work.impl.utils.futures.SettableFuture.create()
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r2.mTaskExecutor
            androidx.work.impl.utils.WorkProgressUpdater$1 r1 = new androidx.work.impl.utils.WorkProgressUpdater$1
            r1.<init>(r2, r4, r5, r3)
            r0.executeOnBackgroundThread(r1)
            return r3
    }
}
