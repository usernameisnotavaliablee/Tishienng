package androidx.work.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class WorkForegroundUpdater implements androidx.work.ForegroundUpdater {
    private static final java.lang.String TAG = null;
    final androidx.work.impl.foreground.ForegroundProcessor mForegroundProcessor;
    private final androidx.work.impl.utils.taskexecutor.TaskExecutor mTaskExecutor;
    final androidx.work.impl.model.WorkSpecDao mWorkSpecDao;


    static {
            java.lang.String r0 = "WMFgUpdater"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.utils.WorkForegroundUpdater.TAG = r0
            return
    }

    public WorkForegroundUpdater(@androidx.annotation.NonNull androidx.work.impl.WorkDatabase r1, @androidx.annotation.NonNull androidx.work.impl.foreground.ForegroundProcessor r2, @androidx.annotation.NonNull androidx.work.impl.utils.taskexecutor.TaskExecutor r3) {
            r0 = this;
            r0.<init>()
            r0.mForegroundProcessor = r2
            r0.mTaskExecutor = r3
            androidx.work.impl.model.WorkSpecDao r1 = r1.workSpecDao()
            r0.mWorkSpecDao = r1
            return
    }

    @Override // androidx.work.ForegroundUpdater
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setForegroundAsync(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.NonNull java.util.UUID r9, @androidx.annotation.NonNull androidx.work.ForegroundInfo r10) {
            r7 = this;
            androidx.work.impl.utils.futures.SettableFuture r2 = androidx.work.impl.utils.futures.SettableFuture.create()
            androidx.work.impl.utils.taskexecutor.TaskExecutor r6 = r7.mTaskExecutor
            androidx.work.impl.utils.WorkForegroundUpdater$1 r0 = new androidx.work.impl.utils.WorkForegroundUpdater$1
            r1 = r7
            r5 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.executeOnBackgroundThread(r0)
            return r2
    }
}
