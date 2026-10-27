package androidx.work.multiprocess;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class RemoteWorkManager {
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected RemoteWorkManager() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.work.multiprocess.RemoteWorkManager getInstance(@androidx.annotation.NonNull android.content.Context r1) {
            androidx.work.impl.WorkManagerImpl r1 = androidx.work.impl.WorkManagerImpl.getInstance(r1)
            androidx.work.multiprocess.RemoteWorkManager r1 = r1.getRemoteWorkManager()
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to initialize RemoteWorkManager"
            r1.<init>(r0)
            throw r1
    }

    @androidx.annotation.NonNull
    public final androidx.work.multiprocess.RemoteWorkContinuation beginUniqueWork(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.work.ExistingWorkPolicy r2, @androidx.annotation.NonNull androidx.work.OneTimeWorkRequest r3) {
            r0 = this;
            java.util.List r3 = java.util.Collections.singletonList(r3)
            androidx.work.multiprocess.RemoteWorkContinuation r1 = r0.beginUniqueWork(r1, r2, r3)
            return r1
    }

    @androidx.annotation.NonNull
    public abstract androidx.work.multiprocess.RemoteWorkContinuation beginUniqueWork(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.work.ExistingWorkPolicy r2, @androidx.annotation.NonNull java.util.List<androidx.work.OneTimeWorkRequest> r3);

    @androidx.annotation.NonNull
    public final androidx.work.multiprocess.RemoteWorkContinuation beginWith(@androidx.annotation.NonNull androidx.work.OneTimeWorkRequest r1) {
            r0 = this;
            java.util.List r1 = java.util.Collections.singletonList(r1)
            androidx.work.multiprocess.RemoteWorkContinuation r1 = r0.beginWith(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public abstract androidx.work.multiprocess.RemoteWorkContinuation beginWith(@androidx.annotation.NonNull java.util.List<androidx.work.OneTimeWorkRequest> r1);

    @androidx.annotation.NonNull
    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelAllWork();

    @androidx.annotation.NonNull
    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelAllWorkByTag(@androidx.annotation.NonNull java.lang.String r1);

    @androidx.annotation.NonNull
    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelUniqueWork(@androidx.annotation.NonNull java.lang.String r1);

    @androidx.annotation.NonNull
    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelWorkById(@androidx.annotation.NonNull java.util.UUID r1);

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueue(@androidx.annotation.NonNull androidx.work.WorkContinuation r1);

    @androidx.annotation.NonNull
    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueue(@androidx.annotation.NonNull androidx.work.WorkRequest r1);

    @androidx.annotation.NonNull
    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueue(@androidx.annotation.NonNull java.util.List<androidx.work.WorkRequest> r1);

    @androidx.annotation.NonNull
    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueueUniquePeriodicWork(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.work.ExistingPeriodicWorkPolicy r2, @androidx.annotation.NonNull androidx.work.PeriodicWorkRequest r3);

    @androidx.annotation.NonNull
    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueueUniqueWork(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.work.ExistingWorkPolicy r2, @androidx.annotation.NonNull androidx.work.OneTimeWorkRequest r3) {
            r0 = this;
            java.util.List r3 = java.util.Collections.singletonList(r3)
            com.google.common.util.concurrent.ListenableFuture r1 = r0.enqueueUniqueWork(r1, r2, r3)
            return r1
    }

    @androidx.annotation.NonNull
    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueueUniqueWork(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.work.ExistingWorkPolicy r2, @androidx.annotation.NonNull java.util.List<androidx.work.OneTimeWorkRequest> r3);

    @androidx.annotation.NonNull
    public abstract com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfos(@androidx.annotation.NonNull androidx.work.WorkQuery r1);

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setProgress(@androidx.annotation.NonNull java.util.UUID r1, @androidx.annotation.NonNull androidx.work.Data r2);
}
