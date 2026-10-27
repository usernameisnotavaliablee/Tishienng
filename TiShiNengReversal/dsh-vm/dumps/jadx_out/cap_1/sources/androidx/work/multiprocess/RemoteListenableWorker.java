package androidx.work.multiprocess;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class RemoteListenableWorker extends androidx.work.ListenableWorker {
    public static final java.lang.String ARGUMENT_CLASS_NAME = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME";
    public static final java.lang.String ARGUMENT_PACKAGE_NAME = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME";
    static final java.lang.String TAG = null;
    final androidx.work.multiprocess.ListenableWorkerImplClient mClient;

    @androidx.annotation.Nullable
    private android.content.ComponentName mComponentName;
    final java.util.concurrent.Executor mExecutor;
    final androidx.work.impl.WorkManagerImpl mWorkManager;

    @androidx.annotation.Nullable
    java.lang.String mWorkerClassName;
    final androidx.work.WorkerParameters mWorkerParameters;




    static {
            java.lang.String r0 = "RemoteListenableWorker"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.multiprocess.RemoteListenableWorker.TAG = r0
            return
    }

    public RemoteListenableWorker(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.work.WorkerParameters r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r1.mWorkerParameters = r3
            androidx.work.impl.WorkManagerImpl r2 = androidx.work.impl.WorkManagerImpl.getInstance(r2)
            r1.mWorkManager = r2
            androidx.work.impl.utils.taskexecutor.TaskExecutor r2 = r2.getWorkTaskExecutor()
            androidx.work.impl.utils.SerialExecutor r2 = r2.getBackgroundExecutor()
            r1.mExecutor = r2
            androidx.work.multiprocess.ListenableWorkerImplClient r3 = new androidx.work.multiprocess.ListenableWorkerImplClient
            android.content.Context r0 = r1.getApplicationContext()
            r3.<init>(r0, r2)
            r1.mClient = r3
            return
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
            r3 = this;
            super.onStopped()
            android.content.ComponentName r0 = r3.mComponentName
            if (r0 == 0) goto L11
            androidx.work.multiprocess.ListenableWorkerImplClient r1 = r3.mClient
            androidx.work.multiprocess.RemoteListenableWorker$3 r2 = new androidx.work.multiprocess.RemoteListenableWorker$3
            r2.<init>(r3)
            r1.execute(r0, r2)
        L11:
            return
    }

    @Override // androidx.work.ListenableWorker
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setProgressAsync(@androidx.annotation.NonNull androidx.work.Data r3) {
            r2 = this;
            android.content.Context r0 = r2.getApplicationContext()
            androidx.work.multiprocess.RemoteWorkManager r0 = androidx.work.multiprocess.RemoteWorkManager.getInstance(r0)
            java.util.UUID r1 = r2.getId()
            com.google.common.util.concurrent.ListenableFuture r3 = r0.setProgress(r1, r3)
            return r3
    }

    @androidx.annotation.NonNull
    public abstract com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> startRemoteWork();

    @Override // androidx.work.ListenableWorker
    @androidx.annotation.NonNull
    public final com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> startWork() {
            r6 = this;
            androidx.work.impl.utils.futures.SettableFuture r0 = androidx.work.impl.utils.futures.SettableFuture.create()
            androidx.work.Data r1 = r6.getInputData()
            androidx.work.WorkerParameters r2 = r6.mWorkerParameters
            java.util.UUID r2 = r2.getId()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME"
            java.lang.String r3 = r1.getString(r3)
            java.lang.String r4 = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME"
            java.lang.String r1 = r1.getString(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r5 = 0
            if (r4 == 0) goto L3b
            androidx.work.Logger r1 = androidx.work.Logger.get()
            java.lang.String r2 = androidx.work.multiprocess.RemoteListenableWorker.TAG
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
            java.lang.String r4 = "Need to specify a package name for the Remote Service."
            r1.error(r2, r4, r3)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r4)
            r0.setException(r1)
            return r0
        L3b:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L57
            androidx.work.Logger r1 = androidx.work.Logger.get()
            java.lang.String r2 = androidx.work.multiprocess.RemoteListenableWorker.TAG
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
            java.lang.String r4 = "Need to specify a class name for the Remote Service."
            r1.error(r2, r4, r3)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r4)
            r0.setException(r1)
            return r0
        L57:
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r3, r1)
            r6.mComponentName = r0
            androidx.work.multiprocess.ListenableWorkerImplClient r1 = r6.mClient
            androidx.work.multiprocess.RemoteListenableWorker$1 r3 = new androidx.work.multiprocess.RemoteListenableWorker$1
            r3.<init>(r6, r2)
            com.google.common.util.concurrent.ListenableFuture r0 = r1.execute(r0, r3)
            androidx.work.multiprocess.RemoteListenableWorker$2 r1 = new androidx.work.multiprocess.RemoteListenableWorker$2
            r1.<init>(r6)
            java.util.concurrent.Executor r2 = r6.mExecutor
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.work.multiprocess.RemoteClientUtils.map(r0, r1, r2)
            return r0
    }
}
