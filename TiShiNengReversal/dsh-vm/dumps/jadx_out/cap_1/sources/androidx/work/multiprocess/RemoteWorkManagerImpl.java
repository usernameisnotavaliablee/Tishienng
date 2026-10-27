package androidx.work.multiprocess;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class RemoteWorkManagerImpl extends androidx.work.multiprocess.IWorkManagerImpl.Stub {
    static byte[] sEMPTY;
    private final androidx.work.impl.WorkManagerImpl mWorkManager;









    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            androidx.work.multiprocess.RemoteWorkManagerImpl.sEMPTY = r0
            return
    }

    RemoteWorkManagerImpl(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>()
            androidx.work.impl.WorkManagerImpl r1 = androidx.work.impl.WorkManagerImpl.getInstance(r1)
            r0.mWorkManager = r1
            return
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public void cancelAllWork(@androidx.annotation.NonNull androidx.work.multiprocess.IWorkManagerImplCallback r4) {
            r3 = this;
            androidx.work.impl.WorkManagerImpl r0 = r3.mWorkManager     // Catch: java.lang.Throwable -> L1d
            androidx.work.Operation r0 = r0.cancelAllWork()     // Catch: java.lang.Throwable -> L1d
            androidx.work.impl.WorkManagerImpl r1 = r3.mWorkManager     // Catch: java.lang.Throwable -> L1d
            androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r1.getWorkTaskExecutor()     // Catch: java.lang.Throwable -> L1d
            androidx.work.impl.utils.SerialExecutor r1 = r1.getBackgroundExecutor()     // Catch: java.lang.Throwable -> L1d
            androidx.work.multiprocess.RemoteWorkManagerImpl$6 r2 = new androidx.work.multiprocess.RemoteWorkManagerImpl$6     // Catch: java.lang.Throwable -> L1d
            com.google.common.util.concurrent.ListenableFuture r0 = r0.getResult()     // Catch: java.lang.Throwable -> L1d
            r2.<init>(r3, r1, r4, r0)     // Catch: java.lang.Throwable -> L1d
            r2.dispatchCallbackSafely()     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r0 = move-exception
            androidx.work.multiprocess.ListenableCallback.ListenableCallbackRunnable.reportFailure(r4, r0)
            return
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public void cancelAllWorkByTag(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull androidx.work.multiprocess.IWorkManagerImplCallback r4) {
            r2 = this;
            androidx.work.impl.WorkManagerImpl r0 = r2.mWorkManager     // Catch: java.lang.Throwable -> L1d
            androidx.work.Operation r3 = r0.cancelAllWorkByTag(r3)     // Catch: java.lang.Throwable -> L1d
            androidx.work.impl.WorkManagerImpl r0 = r2.mWorkManager     // Catch: java.lang.Throwable -> L1d
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r0.getWorkTaskExecutor()     // Catch: java.lang.Throwable -> L1d
            androidx.work.impl.utils.SerialExecutor r0 = r0.getBackgroundExecutor()     // Catch: java.lang.Throwable -> L1d
            androidx.work.multiprocess.RemoteWorkManagerImpl$4 r1 = new androidx.work.multiprocess.RemoteWorkManagerImpl$4     // Catch: java.lang.Throwable -> L1d
            com.google.common.util.concurrent.ListenableFuture r3 = r3.getResult()     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r2, r0, r4, r3)     // Catch: java.lang.Throwable -> L1d
            r1.dispatchCallbackSafely()     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r3 = move-exception
            androidx.work.multiprocess.ListenableCallback.ListenableCallbackRunnable.reportFailure(r4, r3)
            return
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public void cancelUniqueWork(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull androidx.work.multiprocess.IWorkManagerImplCallback r4) {
            r2 = this;
            androidx.work.impl.WorkManagerImpl r0 = r2.mWorkManager     // Catch: java.lang.Throwable -> L1d
            androidx.work.Operation r3 = r0.cancelUniqueWork(r3)     // Catch: java.lang.Throwable -> L1d
            androidx.work.impl.WorkManagerImpl r0 = r2.mWorkManager     // Catch: java.lang.Throwable -> L1d
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r0.getWorkTaskExecutor()     // Catch: java.lang.Throwable -> L1d
            androidx.work.impl.utils.SerialExecutor r0 = r0.getBackgroundExecutor()     // Catch: java.lang.Throwable -> L1d
            androidx.work.multiprocess.RemoteWorkManagerImpl$5 r1 = new androidx.work.multiprocess.RemoteWorkManagerImpl$5     // Catch: java.lang.Throwable -> L1d
            com.google.common.util.concurrent.ListenableFuture r3 = r3.getResult()     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r2, r0, r4, r3)     // Catch: java.lang.Throwable -> L1d
            r1.dispatchCallbackSafely()     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r3 = move-exception
            androidx.work.multiprocess.ListenableCallback.ListenableCallbackRunnable.reportFailure(r4, r3)
            return
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public void cancelWorkById(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull androidx.work.multiprocess.IWorkManagerImplCallback r4) {
            r2 = this;
            androidx.work.impl.WorkManagerImpl r0 = r2.mWorkManager     // Catch: java.lang.Throwable -> L21
            java.util.UUID r3 = java.util.UUID.fromString(r3)     // Catch: java.lang.Throwable -> L21
            androidx.work.Operation r3 = r0.cancelWorkById(r3)     // Catch: java.lang.Throwable -> L21
            androidx.work.impl.WorkManagerImpl r0 = r2.mWorkManager     // Catch: java.lang.Throwable -> L21
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r0.getWorkTaskExecutor()     // Catch: java.lang.Throwable -> L21
            androidx.work.impl.utils.SerialExecutor r0 = r0.getBackgroundExecutor()     // Catch: java.lang.Throwable -> L21
            androidx.work.multiprocess.RemoteWorkManagerImpl$3 r1 = new androidx.work.multiprocess.RemoteWorkManagerImpl$3     // Catch: java.lang.Throwable -> L21
            com.google.common.util.concurrent.ListenableFuture r3 = r3.getResult()     // Catch: java.lang.Throwable -> L21
            r1.<init>(r2, r0, r4, r3)     // Catch: java.lang.Throwable -> L21
            r1.dispatchCallbackSafely()     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r3 = move-exception
            androidx.work.multiprocess.ListenableCallback.ListenableCallbackRunnable.reportFailure(r4, r3)
            return
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public void enqueueContinuation(@androidx.annotation.NonNull byte[] r3, @androidx.annotation.NonNull androidx.work.multiprocess.IWorkManagerImplCallback r4) {
            r2 = this;
            android.os.Parcelable$Creator<androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl> r0 = androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl.CREATOR     // Catch: java.lang.Throwable -> L29
            java.lang.Object r3 = androidx.work.multiprocess.parcelable.ParcelConverters.unmarshall(r3, r0)     // Catch: java.lang.Throwable -> L29
            androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl r3 = (androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl) r3     // Catch: java.lang.Throwable -> L29
            androidx.work.impl.WorkManagerImpl r0 = r2.mWorkManager     // Catch: java.lang.Throwable -> L29
            androidx.work.impl.WorkContinuationImpl r3 = r3.toWorkContinuationImpl(r0)     // Catch: java.lang.Throwable -> L29
            androidx.work.Operation r3 = r3.enqueue()     // Catch: java.lang.Throwable -> L29
            androidx.work.impl.WorkManagerImpl r0 = r2.mWorkManager     // Catch: java.lang.Throwable -> L29
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r0.getWorkTaskExecutor()     // Catch: java.lang.Throwable -> L29
            androidx.work.impl.utils.SerialExecutor r0 = r0.getBackgroundExecutor()     // Catch: java.lang.Throwable -> L29
            androidx.work.multiprocess.RemoteWorkManagerImpl$2 r1 = new androidx.work.multiprocess.RemoteWorkManagerImpl$2     // Catch: java.lang.Throwable -> L29
            com.google.common.util.concurrent.ListenableFuture r3 = r3.getResult()     // Catch: java.lang.Throwable -> L29
            r1.<init>(r2, r0, r4, r3)     // Catch: java.lang.Throwable -> L29
            r1.dispatchCallbackSafely()     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r3 = move-exception
            androidx.work.multiprocess.ListenableCallback.ListenableCallbackRunnable.reportFailure(r4, r3)
            return
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    @androidx.annotation.MainThread
    public void enqueueWorkRequests(@androidx.annotation.NonNull byte[] r3, @androidx.annotation.NonNull androidx.work.multiprocess.IWorkManagerImplCallback r4) {
            r2 = this;
            android.os.Parcelable$Creator<androidx.work.multiprocess.parcelable.ParcelableWorkRequests> r0 = androidx.work.multiprocess.parcelable.ParcelableWorkRequests.CREATOR     // Catch: java.lang.Throwable -> L29
            java.lang.Object r3 = androidx.work.multiprocess.parcelable.ParcelConverters.unmarshall(r3, r0)     // Catch: java.lang.Throwable -> L29
            androidx.work.multiprocess.parcelable.ParcelableWorkRequests r3 = (androidx.work.multiprocess.parcelable.ParcelableWorkRequests) r3     // Catch: java.lang.Throwable -> L29
            java.util.List r3 = r3.getRequests()     // Catch: java.lang.Throwable -> L29
            androidx.work.impl.WorkManagerImpl r0 = r2.mWorkManager     // Catch: java.lang.Throwable -> L29
            androidx.work.Operation r3 = r0.enqueue(r3)     // Catch: java.lang.Throwable -> L29
            androidx.work.impl.WorkManagerImpl r0 = r2.mWorkManager     // Catch: java.lang.Throwable -> L29
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r0.getWorkTaskExecutor()     // Catch: java.lang.Throwable -> L29
            androidx.work.impl.utils.SerialExecutor r0 = r0.getBackgroundExecutor()     // Catch: java.lang.Throwable -> L29
            androidx.work.multiprocess.RemoteWorkManagerImpl$1 r1 = new androidx.work.multiprocess.RemoteWorkManagerImpl$1     // Catch: java.lang.Throwable -> L29
            com.google.common.util.concurrent.ListenableFuture r3 = r3.getResult()     // Catch: java.lang.Throwable -> L29
            r1.<init>(r2, r0, r4, r3)     // Catch: java.lang.Throwable -> L29
            r1.dispatchCallbackSafely()     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r3 = move-exception
            androidx.work.multiprocess.ListenableCallback.ListenableCallbackRunnable.reportFailure(r4, r3)
            return
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public void queryWorkInfo(@androidx.annotation.NonNull byte[] r3, @androidx.annotation.NonNull androidx.work.multiprocess.IWorkManagerImplCallback r4) {
            r2 = this;
            android.os.Parcelable$Creator<androidx.work.multiprocess.parcelable.ParcelableWorkQuery> r0 = androidx.work.multiprocess.parcelable.ParcelableWorkQuery.CREATOR     // Catch: java.lang.Throwable -> L25
            java.lang.Object r3 = androidx.work.multiprocess.parcelable.ParcelConverters.unmarshall(r3, r0)     // Catch: java.lang.Throwable -> L25
            androidx.work.multiprocess.parcelable.ParcelableWorkQuery r3 = (androidx.work.multiprocess.parcelable.ParcelableWorkQuery) r3     // Catch: java.lang.Throwable -> L25
            androidx.work.impl.WorkManagerImpl r0 = r2.mWorkManager     // Catch: java.lang.Throwable -> L25
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r0.getWorkTaskExecutor()     // Catch: java.lang.Throwable -> L25
            androidx.work.impl.utils.SerialExecutor r0 = r0.getBackgroundExecutor()     // Catch: java.lang.Throwable -> L25
            androidx.work.impl.WorkManagerImpl r1 = r2.mWorkManager     // Catch: java.lang.Throwable -> L25
            androidx.work.WorkQuery r3 = r3.getWorkQuery()     // Catch: java.lang.Throwable -> L25
            com.google.common.util.concurrent.ListenableFuture r3 = r1.getWorkInfos(r3)     // Catch: java.lang.Throwable -> L25
            androidx.work.multiprocess.RemoteWorkManagerImpl$7 r1 = new androidx.work.multiprocess.RemoteWorkManagerImpl$7     // Catch: java.lang.Throwable -> L25
            r1.<init>(r2, r0, r4, r3)     // Catch: java.lang.Throwable -> L25
            r1.dispatchCallbackSafely()     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r3 = move-exception
            androidx.work.multiprocess.ListenableCallback.ListenableCallbackRunnable.reportFailure(r4, r3)
            return
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public void setProgress(@androidx.annotation.NonNull byte[] r6, @androidx.annotation.NonNull androidx.work.multiprocess.IWorkManagerImplCallback r7) {
            r5 = this;
            android.os.Parcelable$Creator<androidx.work.multiprocess.parcelable.ParcelableUpdateRequest> r0 = androidx.work.multiprocess.parcelable.ParcelableUpdateRequest.CREATOR     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r6 = androidx.work.multiprocess.parcelable.ParcelConverters.unmarshall(r6, r0)     // Catch: java.lang.Throwable -> L3c
            androidx.work.multiprocess.parcelable.ParcelableUpdateRequest r6 = (androidx.work.multiprocess.parcelable.ParcelableUpdateRequest) r6     // Catch: java.lang.Throwable -> L3c
            androidx.work.impl.WorkManagerImpl r0 = r5.mWorkManager     // Catch: java.lang.Throwable -> L3c
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L3c
            androidx.work.impl.WorkManagerImpl r1 = r5.mWorkManager     // Catch: java.lang.Throwable -> L3c
            androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r1.getWorkTaskExecutor()     // Catch: java.lang.Throwable -> L3c
            androidx.work.impl.utils.SerialExecutor r2 = r1.getBackgroundExecutor()     // Catch: java.lang.Throwable -> L3c
            androidx.work.impl.WorkManagerImpl r3 = r5.mWorkManager     // Catch: java.lang.Throwable -> L3c
            androidx.work.impl.WorkDatabase r3 = r3.getWorkDatabase()     // Catch: java.lang.Throwable -> L3c
            androidx.work.impl.utils.WorkProgressUpdater r4 = new androidx.work.impl.utils.WorkProgressUpdater     // Catch: java.lang.Throwable -> L3c
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r6.getId()     // Catch: java.lang.Throwable -> L3c
            java.util.UUID r1 = java.util.UUID.fromString(r1)     // Catch: java.lang.Throwable -> L3c
            androidx.work.Data r6 = r6.getData()     // Catch: java.lang.Throwable -> L3c
            com.google.common.util.concurrent.ListenableFuture r6 = r4.updateProgress(r0, r1, r6)     // Catch: java.lang.Throwable -> L3c
            androidx.work.multiprocess.RemoteWorkManagerImpl$8 r0 = new androidx.work.multiprocess.RemoteWorkManagerImpl$8     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r5, r2, r7, r6)     // Catch: java.lang.Throwable -> L3c
            r0.dispatchCallbackSafely()     // Catch: java.lang.Throwable -> L3c
            return
        L3c:
            r6 = move-exception
            androidx.work.multiprocess.ListenableCallback.ListenableCallbackRunnable.reportFailure(r7, r6)
            return
    }
}
