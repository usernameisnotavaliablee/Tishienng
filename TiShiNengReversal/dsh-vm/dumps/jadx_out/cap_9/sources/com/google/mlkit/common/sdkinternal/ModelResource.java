package com.google.mlkit.common.sdkinternal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ModelResource {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    protected final com.google.mlkit.common.sdkinternal.TaskQueue taskQueue;
    private final java.util.concurrent.atomic.AtomicInteger zza;
    private final java.util.concurrent.atomic.AtomicBoolean zzb;

    public ModelResource() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.zza = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r2.zzb = r0
            com.google.mlkit.common.sdkinternal.TaskQueue r0 = new com.google.mlkit.common.sdkinternal.TaskQueue
            r0.<init>()
            r2.taskQueue = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected ModelResource(@androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.TaskQueue r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.zza = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r2.zzb = r0
            r2.taskQueue = r3
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public <T> com.google.android.gms.tasks.Task<T> callAfterLoad(@androidx.annotation.NonNull java.util.concurrent.Executor r8, @androidx.annotation.NonNull java.util.concurrent.Callable<T> r9, @androidx.annotation.NonNull com.google.android.gms.tasks.CancellationToken r10) {
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r7.zza
            int r0 = r0.get()
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            boolean r0 = r10.isCancellationRequested()
            if (r0 == 0) goto L19
            com.google.android.gms.tasks.Task r8 = com.google.android.gms.tasks.Tasks.forCanceled()
            return r8
        L19:
            com.google.android.gms.tasks.CancellationTokenSource r3 = new com.google.android.gms.tasks.CancellationTokenSource
            r3.<init>()
            com.google.android.gms.tasks.TaskCompletionSource r5 = new com.google.android.gms.tasks.TaskCompletionSource
            com.google.android.gms.tasks.CancellationToken r0 = r3.getToken()
            r5.<init>(r0)
            com.google.mlkit.common.sdkinternal.zzm r6 = new com.google.mlkit.common.sdkinternal.zzm
            r6.<init>(r8, r10, r3, r5)
            com.google.mlkit.common.sdkinternal.TaskQueue r8 = r7.taskQueue
            com.google.mlkit.common.sdkinternal.zzn r0 = new com.google.mlkit.common.sdkinternal.zzn
            r1 = r7
            r4 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r8.submit(r6, r0)
            com.google.android.gms.tasks.Task r8 = r5.getTask()
            return r8
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isLoaded() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.zzb
            boolean r0 = r0.get()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.VisibleForTesting
    @androidx.annotation.WorkerThread
    public abstract void load() throws com.google.mlkit.common.MlKitException;

    @com.google.android.gms.common.annotation.KeepForSdk
    public void pin() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.zza
            r0.incrementAndGet()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    protected abstract void release();

    @com.google.android.gms.common.annotation.KeepForSdk
    public void unpin(@androidx.annotation.NonNull java.util.concurrent.Executor r1) {
            r0 = this;
            r0.unpinWithTask(r1)
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.tasks.Task<java.lang.Void> unpinWithTask(@androidx.annotation.NonNull java.util.concurrent.Executor r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r3.zza
            int r0 = r0.get()
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            com.google.mlkit.common.sdkinternal.zzl r1 = new com.google.mlkit.common.sdkinternal.zzl
            r1.<init>(r3, r0)
            com.google.mlkit.common.sdkinternal.TaskQueue r2 = r3.taskQueue
            r2.submit(r4, r1)
            com.google.android.gms.tasks.Task r4 = r0.getTask()
            return r4
    }

    final /* synthetic */ void zza(com.google.android.gms.tasks.CancellationToken r4, com.google.android.gms.tasks.CancellationTokenSource r5, java.util.concurrent.Callable r6, com.google.android.gms.tasks.TaskCompletionSource r7) {
            r3 = this;
            boolean r0 = r4.isCancellationRequested()
            if (r0 == 0) goto La
            r5.cancel()
            return
        La:
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzb     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L1e
            boolean r0 = r0.get()     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L1e
            if (r0 != 0) goto L20
            r3.load()     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L1e
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzb     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L1e
            r1 = 1
            r0.set(r1)     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L1e
            goto L20
        L1c:
            r6 = move-exception
            goto L46
        L1e:
            r6 = move-exception
            goto L3c
        L20:
            boolean r0 = r4.isCancellationRequested()     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L1e
            if (r0 == 0) goto L2a
            r5.cancel()     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L1e
            return
        L2a:
            java.lang.Object r6 = r6.call()     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L1e
            boolean r0 = r4.isCancellationRequested()     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L38
            r5.cancel()     // Catch: java.lang.Exception -> L1c
            return
        L38:
            r7.setResult(r6)     // Catch: java.lang.Exception -> L1c
            return
        L3c:
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException     // Catch: java.lang.Exception -> L1c
            java.lang.String r1 = "Internal error has occurred when executing ML Kit tasks"
            r2 = 13
            r0.<init>(r1, r2, r6)     // Catch: java.lang.Exception -> L1c
            throw r0     // Catch: java.lang.Exception -> L1c
        L46:
            boolean r4 = r4.isCancellationRequested()
            if (r4 == 0) goto L50
            r5.cancel()
            return
        L50:
            r7.setException(r6)
            return
    }

    final /* synthetic */ void zzb(com.google.android.gms.tasks.TaskCompletionSource r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r3.zza
            int r0 = r0.decrementAndGet()
            r1 = 0
            if (r0 < 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            com.google.android.gms.common.internal.Preconditions.checkState(r2)
            if (r0 != 0) goto L19
            r3.release()
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzb
            r0.set(r1)
        L19:
            com.google.android.gms.internal.mlkit_common.zzrr.zza()
            r0 = 0
            r4.setResult(r0)
            return
    }
}
