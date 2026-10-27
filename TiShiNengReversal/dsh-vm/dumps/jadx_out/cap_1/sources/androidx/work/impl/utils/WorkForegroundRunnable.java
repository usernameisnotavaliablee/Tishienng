package androidx.work.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class WorkForegroundRunnable implements java.lang.Runnable {
    static final java.lang.String TAG = null;
    final android.content.Context mContext;
    final androidx.work.ForegroundUpdater mForegroundUpdater;
    final androidx.work.impl.utils.futures.SettableFuture<java.lang.Void> mFuture;
    final androidx.work.impl.utils.taskexecutor.TaskExecutor mTaskExecutor;
    final androidx.work.impl.model.WorkSpec mWorkSpec;
    final androidx.work.ListenableWorker mWorker;



    static {
            java.lang.String r0 = "WorkForegroundRunnable"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.utils.WorkForegroundRunnable.TAG = r0
            return
    }

    @android.annotation.SuppressLint({"LambdaLast"})
    public WorkForegroundRunnable(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.work.impl.model.WorkSpec r3, @androidx.annotation.NonNull androidx.work.ListenableWorker r4, @androidx.annotation.NonNull androidx.work.ForegroundUpdater r5, @androidx.annotation.NonNull androidx.work.impl.utils.taskexecutor.TaskExecutor r6) {
            r1 = this;
            r1.<init>()
            androidx.work.impl.utils.futures.SettableFuture r0 = androidx.work.impl.utils.futures.SettableFuture.create()
            r1.mFuture = r0
            r1.mContext = r2
            r1.mWorkSpec = r3
            r1.mWorker = r4
            r1.mForegroundUpdater = r5
            r1.mTaskExecutor = r6
            return
    }

    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getFuture() {
            r1 = this;
            androidx.work.impl.utils.futures.SettableFuture<java.lang.Void> r0 = r1.mFuture
            return r0
    }

    @Override // java.lang.Runnable
    @android.annotation.SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
            r3 = this;
            androidx.work.impl.model.WorkSpec r0 = r3.mWorkSpec
            boolean r0 = r0.expedited
            if (r0 == 0) goto L2e
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastS()
            if (r0 == 0) goto Ld
            goto L2e
        Ld:
            androidx.work.impl.utils.futures.SettableFuture r0 = androidx.work.impl.utils.futures.SettableFuture.create()
            androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r3.mTaskExecutor
            java.util.concurrent.Executor r1 = r1.getMainThreadExecutor()
            androidx.work.impl.utils.WorkForegroundRunnable$1 r2 = new androidx.work.impl.utils.WorkForegroundRunnable$1
            r2.<init>(r3, r0)
            r1.execute(r2)
            androidx.work.impl.utils.WorkForegroundRunnable$2 r1 = new androidx.work.impl.utils.WorkForegroundRunnable$2
            r1.<init>(r3, r0)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r2 = r3.mTaskExecutor
            java.util.concurrent.Executor r2 = r2.getMainThreadExecutor()
            r0.addListener(r1, r2)
            return
        L2e:
            androidx.work.impl.utils.futures.SettableFuture<java.lang.Void> r0 = r3.mFuture
            r1 = 0
            r0.set(r1)
            return
    }
}
