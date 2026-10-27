package androidx.work.multiprocess;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class RemoteWorkContinuationImpl extends androidx.work.multiprocess.RemoteWorkContinuation {
    private final androidx.work.multiprocess.RemoteWorkManagerClient mClient;
    private final androidx.work.WorkContinuation mContinuation;

    public RemoteWorkContinuationImpl(@androidx.annotation.NonNull androidx.work.multiprocess.RemoteWorkManagerClient r1, @androidx.annotation.NonNull androidx.work.WorkContinuation r2) {
            r0 = this;
            r0.<init>()
            r0.mClient = r1
            r0.mContinuation = r2
            return
    }

    @Override // androidx.work.multiprocess.RemoteWorkContinuation
    @androidx.annotation.NonNull
    @android.annotation.SuppressLint({"EnqueueWork"})
    protected androidx.work.multiprocess.RemoteWorkContinuation combineInternal(@androidx.annotation.NonNull java.util.List<androidx.work.multiprocess.RemoteWorkContinuation> r3) {
            r2 = this;
            int r0 = r3.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r3.next()
            androidx.work.multiprocess.RemoteWorkContinuation r0 = (androidx.work.multiprocess.RemoteWorkContinuation) r0
            androidx.work.multiprocess.RemoteWorkContinuationImpl r0 = (androidx.work.multiprocess.RemoteWorkContinuationImpl) r0
            androidx.work.WorkContinuation r0 = r0.mContinuation
            r1.add(r0)
            goto Ld
        L21:
            androidx.work.WorkContinuation r3 = androidx.work.WorkContinuation.combine(r1)
            androidx.work.multiprocess.RemoteWorkContinuationImpl r0 = new androidx.work.multiprocess.RemoteWorkContinuationImpl
            androidx.work.multiprocess.RemoteWorkManagerClient r1 = r2.mClient
            r0.<init>(r1, r3)
            return r0
    }

    @Override // androidx.work.multiprocess.RemoteWorkContinuation
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueue() {
            r2 = this;
            androidx.work.multiprocess.RemoteWorkManagerClient r0 = r2.mClient
            androidx.work.WorkContinuation r1 = r2.mContinuation
            com.google.common.util.concurrent.ListenableFuture r0 = r0.enqueue(r1)
            return r0
    }

    @Override // androidx.work.multiprocess.RemoteWorkContinuation
    @androidx.annotation.NonNull
    @android.annotation.SuppressLint({"EnqueueWork"})
    public androidx.work.multiprocess.RemoteWorkContinuation then(@androidx.annotation.NonNull java.util.List<androidx.work.OneTimeWorkRequest> r4) {
            r3 = this;
            androidx.work.multiprocess.RemoteWorkContinuationImpl r0 = new androidx.work.multiprocess.RemoteWorkContinuationImpl
            androidx.work.multiprocess.RemoteWorkManagerClient r1 = r3.mClient
            androidx.work.WorkContinuation r2 = r3.mContinuation
            androidx.work.WorkContinuation r4 = r2.then(r4)
            r0.<init>(r1, r4)
            return r0
    }
}
