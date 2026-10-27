package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"AddedAbstractMethod"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class WorkManager {
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected WorkManager() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static androidx.work.WorkManager getInstance() {
            androidx.work.impl.WorkManagerImpl r0 = androidx.work.impl.WorkManagerImpl.getInstance()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider."
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    public static androidx.work.WorkManager getInstance(@androidx.annotation.NonNull android.content.Context r0) {
            androidx.work.impl.WorkManagerImpl r0 = androidx.work.impl.WorkManagerImpl.getInstance(r0)
            return r0
    }

    public static void initialize(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.NonNull androidx.work.Configuration r1) {
            androidx.work.impl.WorkManagerImpl.initialize(r0, r1)
            return
    }

    @androidx.annotation.NonNull
    public final androidx.work.WorkContinuation beginUniqueWork(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.work.ExistingWorkPolicy r2, @androidx.annotation.NonNull androidx.work.OneTimeWorkRequest r3) {
            r0 = this;
            java.util.List r3 = java.util.Collections.singletonList(r3)
            androidx.work.WorkContinuation r1 = r0.beginUniqueWork(r1, r2, r3)
            return r1
    }

    @androidx.annotation.NonNull
    public abstract androidx.work.WorkContinuation beginUniqueWork(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.work.ExistingWorkPolicy r2, @androidx.annotation.NonNull java.util.List<androidx.work.OneTimeWorkRequest> r3);

    @androidx.annotation.NonNull
    public final androidx.work.WorkContinuation beginWith(@androidx.annotation.NonNull androidx.work.OneTimeWorkRequest r1) {
            r0 = this;
            java.util.List r1 = java.util.Collections.singletonList(r1)
            androidx.work.WorkContinuation r1 = r0.beginWith(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public abstract androidx.work.WorkContinuation beginWith(@androidx.annotation.NonNull java.util.List<androidx.work.OneTimeWorkRequest> r1);

    @androidx.annotation.NonNull
    public abstract androidx.work.Operation cancelAllWork();

    @androidx.annotation.NonNull
    public abstract androidx.work.Operation cancelAllWorkByTag(@androidx.annotation.NonNull java.lang.String r1);

    @androidx.annotation.NonNull
    public abstract androidx.work.Operation cancelUniqueWork(@androidx.annotation.NonNull java.lang.String r1);

    @androidx.annotation.NonNull
    public abstract androidx.work.Operation cancelWorkById(@androidx.annotation.NonNull java.util.UUID r1);

    @androidx.annotation.NonNull
    public abstract android.app.PendingIntent createCancelPendingIntent(@androidx.annotation.NonNull java.util.UUID r1);

    @androidx.annotation.NonNull
    public final androidx.work.Operation enqueue(@androidx.annotation.NonNull androidx.work.WorkRequest r1) {
            r0 = this;
            java.util.List r1 = java.util.Collections.singletonList(r1)
            androidx.work.Operation r1 = r0.enqueue(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public abstract androidx.work.Operation enqueue(@androidx.annotation.NonNull java.util.List<? extends androidx.work.WorkRequest> r1);

    @androidx.annotation.NonNull
    public abstract androidx.work.Operation enqueueUniquePeriodicWork(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.work.ExistingPeriodicWorkPolicy r2, @androidx.annotation.NonNull androidx.work.PeriodicWorkRequest r3);

    @androidx.annotation.NonNull
    public androidx.work.Operation enqueueUniqueWork(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.work.ExistingWorkPolicy r2, @androidx.annotation.NonNull androidx.work.OneTimeWorkRequest r3) {
            r0 = this;
            java.util.List r3 = java.util.Collections.singletonList(r3)
            androidx.work.Operation r1 = r0.enqueueUniqueWork(r1, r2, r3)
            return r1
    }

    @androidx.annotation.NonNull
    public abstract androidx.work.Operation enqueueUniqueWork(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.work.ExistingWorkPolicy r2, @androidx.annotation.NonNull java.util.List<androidx.work.OneTimeWorkRequest> r3);

    @androidx.annotation.NonNull
    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Long> getLastCancelAllTimeMillis();

    @androidx.annotation.NonNull
    public abstract androidx.lifecycle.LiveData<java.lang.Long> getLastCancelAllTimeMillisLiveData();

    @androidx.annotation.NonNull
    public abstract com.google.common.util.concurrent.ListenableFuture<androidx.work.WorkInfo> getWorkInfoById(@androidx.annotation.NonNull java.util.UUID r1);

    @androidx.annotation.NonNull
    public abstract androidx.lifecycle.LiveData<androidx.work.WorkInfo> getWorkInfoByIdLiveData(@androidx.annotation.NonNull java.util.UUID r1);

    @androidx.annotation.NonNull
    public abstract com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfos(@androidx.annotation.NonNull androidx.work.WorkQuery r1);

    @androidx.annotation.NonNull
    public abstract com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfosByTag(@androidx.annotation.NonNull java.lang.String r1);

    @androidx.annotation.NonNull
    public abstract androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosByTagLiveData(@androidx.annotation.NonNull java.lang.String r1);

    @androidx.annotation.NonNull
    public abstract com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfosForUniqueWork(@androidx.annotation.NonNull java.lang.String r1);

    @androidx.annotation.NonNull
    public abstract androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosForUniqueWorkLiveData(@androidx.annotation.NonNull java.lang.String r1);

    @androidx.annotation.NonNull
    public abstract androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosLiveData(@androidx.annotation.NonNull androidx.work.WorkQuery r1);

    @androidx.annotation.NonNull
    public abstract androidx.work.Operation pruneWork();
}
