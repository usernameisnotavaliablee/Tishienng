package androidx.work.multiprocess;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ListenableWorkerImpl extends androidx.work.multiprocess.IListenableWorkerImpl.Stub {
    static final java.lang.String TAG = null;
    static byte[] sEMPTY;
    static final java.lang.Object sLock = null;
    final androidx.work.Configuration mConfiguration;
    final android.content.Context mContext;
    final java.util.Map<java.lang.String, com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result>> mFutureMap;
    final androidx.work.impl.utils.taskexecutor.TaskExecutor mTaskExecutor;
    final androidx.work.impl.WorkManagerImpl mWorkManager;



    static {
            java.lang.String r0 = "ListenableWorkerImpl"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.multiprocess.ListenableWorkerImpl.TAG = r0
            r0 = 0
            byte[] r0 = new byte[r0]
            androidx.work.multiprocess.ListenableWorkerImpl.sEMPTY = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.work.multiprocess.ListenableWorkerImpl.sLock = r0
            return
    }

    ListenableWorkerImpl(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            r1.mContext = r2
            androidx.work.impl.WorkManagerImpl r2 = androidx.work.impl.WorkManagerImpl.getInstance(r2)
            r1.mWorkManager = r2
            androidx.work.Configuration r0 = r2.getConfiguration()
            r1.mConfiguration = r0
            androidx.work.impl.utils.taskexecutor.TaskExecutor r2 = r2.getWorkTaskExecutor()
            r1.mTaskExecutor = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.mFutureMap = r2
            return
    }

    @androidx.annotation.NonNull
    private com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> executeWorkRequest(@androidx.annotation.NonNull java.lang.String r9, @androidx.annotation.NonNull java.lang.String r10, @androidx.annotation.NonNull androidx.work.WorkerParameters r11) {
            r8 = this;
            androidx.work.impl.utils.futures.SettableFuture r0 = androidx.work.impl.utils.futures.SettableFuture.create()
            androidx.work.Logger r1 = androidx.work.Logger.get()
            java.lang.String r2 = androidx.work.multiprocess.ListenableWorkerImpl.TAG
            java.lang.String r3 = "Tracking execution of %s (%s)"
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r9
            r7 = 1
            r5[r7] = r10
            java.lang.String r3 = java.lang.String.format(r3, r5)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r6]
            r1.debug(r2, r3, r5)
            java.lang.Object r1 = androidx.work.multiprocess.ListenableWorkerImpl.sLock
            monitor-enter(r1)
            java.util.Map<java.lang.String, com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker$Result>> r3 = r8.mFutureMap     // Catch: java.lang.Throwable -> L88
            r3.put(r9, r0)     // Catch: java.lang.Throwable -> L88
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L88
            androidx.work.Configuration r9 = r8.mConfiguration
            androidx.work.WorkerFactory r9 = r9.getWorkerFactory()
            android.content.Context r1 = r8.mContext
            androidx.work.ListenableWorker r9 = r9.createWorkerWithDefaultFallback(r1, r10, r11)
            if (r9 != 0) goto L51
            java.lang.String r9 = "Unable to create an instance of %s"
            java.lang.Object[] r11 = new java.lang.Object[r7]
            r11[r6] = r10
            java.lang.String r9 = java.lang.String.format(r9, r11)
            androidx.work.Logger r10 = androidx.work.Logger.get()
            java.lang.Throwable[] r11 = new java.lang.Throwable[r6]
            r10.error(r2, r9, r11)
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r9)
            r0.setException(r10)
            return r0
        L51:
            boolean r11 = r9 instanceof androidx.work.multiprocess.RemoteListenableWorker
            if (r11 != 0) goto L79
            java.lang.String r9 = "%s does not extend %s"
            java.lang.Class<androidx.work.multiprocess.RemoteListenableWorker> r11 = androidx.work.multiprocess.RemoteListenableWorker.class
            java.lang.String r11 = r11.getName()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r6] = r10
            r1[r7] = r11
            java.lang.String r9 = java.lang.String.format(r9, r1)
            androidx.work.Logger r10 = androidx.work.Logger.get()
            java.lang.Throwable[] r11 = new java.lang.Throwable[r6]
            r10.error(r2, r9, r11)
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r9)
            r0.setException(r10)
            return r0
        L79:
            androidx.work.multiprocess.RemoteListenableWorker r9 = (androidx.work.multiprocess.RemoteListenableWorker) r9     // Catch: java.lang.Throwable -> L83
            com.google.common.util.concurrent.ListenableFuture r9 = r9.startRemoteWork()     // Catch: java.lang.Throwable -> L83
            r0.setFuture(r9)     // Catch: java.lang.Throwable -> L83
            return r0
        L83:
            r9 = move-exception
            r0.setException(r9)
            return r0
        L88:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L88
            throw r9
    }

    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public void interrupt(@androidx.annotation.NonNull byte[] r6, @androidx.annotation.NonNull androidx.work.multiprocess.IWorkManagerImplCallback r7) {
            r5 = this;
            android.os.Parcelable$Creator<androidx.work.multiprocess.parcelable.ParcelableWorkerParameters> r0 = androidx.work.multiprocess.parcelable.ParcelableWorkerParameters.CREATOR     // Catch: java.lang.Throwable -> L48
            java.lang.Object r6 = androidx.work.multiprocess.parcelable.ParcelConverters.unmarshall(r6, r0)     // Catch: java.lang.Throwable -> L48
            androidx.work.multiprocess.parcelable.ParcelableWorkerParameters r6 = (androidx.work.multiprocess.parcelable.ParcelableWorkerParameters) r6     // Catch: java.lang.Throwable -> L48
            java.util.UUID r6 = r6.getId()     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L48
            androidx.work.Logger r0 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = androidx.work.multiprocess.ListenableWorkerImpl.TAG     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = "Interrupting work with id (%s)"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L48
            r4 = 0
            r3[r4] = r6     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch: java.lang.Throwable -> L48
            java.lang.Throwable[] r3 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L48
            r0.debug(r1, r2, r3)     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = androidx.work.multiprocess.ListenableWorkerImpl.sLock     // Catch: java.lang.Throwable -> L48
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L48
            java.util.Map<java.lang.String, com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker$Result>> r1 = r5.mFutureMap     // Catch: java.lang.Throwable -> L50
            java.lang.Object r6 = r1.remove(r6)     // Catch: java.lang.Throwable -> L50
            com.google.common.util.concurrent.ListenableFuture r6 = (com.google.common.util.concurrent.ListenableFuture) r6     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            if (r6 == 0) goto L4a
            androidx.work.impl.WorkManagerImpl r0 = r5.mWorkManager     // Catch: java.lang.Throwable -> L48
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r0.getWorkTaskExecutor()     // Catch: java.lang.Throwable -> L48
            androidx.work.impl.utils.SerialExecutor r0 = r0.getBackgroundExecutor()     // Catch: java.lang.Throwable -> L48
            androidx.work.multiprocess.ListenableWorkerImpl$2 r1 = new androidx.work.multiprocess.ListenableWorkerImpl$2     // Catch: java.lang.Throwable -> L48
            r1.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L48
            r0.execute(r1)     // Catch: java.lang.Throwable -> L48
            return
        L48:
            r6 = move-exception
            goto L53
        L4a:
            byte[] r6 = androidx.work.multiprocess.ListenableWorkerImpl.sEMPTY     // Catch: java.lang.Throwable -> L48
            androidx.work.multiprocess.ListenableCallback.ListenableCallbackRunnable.reportSuccess(r7, r6)     // Catch: java.lang.Throwable -> L48
            return
        L50:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            throw r6     // Catch: java.lang.Throwable -> L48
        L53:
            androidx.work.multiprocess.ListenableCallback.ListenableCallbackRunnable.reportFailure(r7, r6)
            return
    }

    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public void startWork(@androidx.annotation.NonNull byte[] r9, @androidx.annotation.NonNull androidx.work.multiprocess.IWorkManagerImplCallback r10) {
            r8 = this;
            android.os.Parcelable$Creator<androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest> r0 = androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest.CREATOR     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r9 = androidx.work.multiprocess.parcelable.ParcelConverters.unmarshall(r9, r0)     // Catch: java.lang.Throwable -> L4b
            androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest r9 = (androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest) r9     // Catch: java.lang.Throwable -> L4b
            androidx.work.multiprocess.parcelable.ParcelableWorkerParameters r0 = r9.getParcelableWorkerParameters()     // Catch: java.lang.Throwable -> L4b
            androidx.work.impl.WorkManagerImpl r1 = r8.mWorkManager     // Catch: java.lang.Throwable -> L4b
            androidx.work.WorkerParameters r0 = r0.toWorkerParameters(r1)     // Catch: java.lang.Throwable -> L4b
            java.util.UUID r1 = r0.getId()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r9 = r9.getWorkerClassName()     // Catch: java.lang.Throwable -> L4b
            androidx.work.Logger r2 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = androidx.work.multiprocess.ListenableWorkerImpl.TAG     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = "Executing work request (%s, %s)"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L4b
            r6 = 0
            r5[r6] = r1     // Catch: java.lang.Throwable -> L4b
            r7 = 1
            r5[r7] = r9     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch: java.lang.Throwable -> L4b
            java.lang.Throwable[] r5 = new java.lang.Throwable[r6]     // Catch: java.lang.Throwable -> L4b
            r2.debug(r3, r4, r5)     // Catch: java.lang.Throwable -> L4b
            com.google.common.util.concurrent.ListenableFuture r9 = r8.executeWorkRequest(r1, r9, r0)     // Catch: java.lang.Throwable -> L4b
            androidx.work.multiprocess.ListenableWorkerImpl$1 r0 = new androidx.work.multiprocess.ListenableWorkerImpl$1     // Catch: java.lang.Throwable -> L4b
            r0.<init>(r8, r9, r10, r1)     // Catch: java.lang.Throwable -> L4b
            androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r8.mTaskExecutor     // Catch: java.lang.Throwable -> L4b
            androidx.work.impl.utils.SerialExecutor r1 = r1.getBackgroundExecutor()     // Catch: java.lang.Throwable -> L4b
            r9.addListener(r0, r1)     // Catch: java.lang.Throwable -> L4b
            return
        L4b:
            r9 = move-exception
            androidx.work.multiprocess.ListenableCallback.ListenableCallbackRunnable.reportFailure(r10, r9)
            return
    }
}
