package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzav extends com.google.android.gms.internal.mlkit_common.zzx implements java.util.concurrent.ExecutorService {
    protected zzav() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.zzb()
            boolean r2 = r0.awaitTermination(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.zzb()
            r0.execute(r2)
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection r2) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.zzb()
            java.util.List r2 = r0.invokeAll(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.zzb()
            java.util.List r2 = r0.invokeAll(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection r2) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.zzb()
            java.lang.Object r2 = r0.invokeAny(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.zzb()
            java.lang.Object r2 = r0.invokeAny(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.zzb()
            boolean r0 = r0.isShutdown()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.zzb()
            boolean r0 = r0.isTerminated()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.zzb()
            r0.shutdown()
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.zzb()
            java.util.List r0 = r0.shutdownNow()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.zzb()
            java.util.concurrent.Future r2 = r0.submit(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable r2, java.lang.Object r3) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.zzb()
            java.util.concurrent.Future r2 = r0.submit(r2, r3)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.util.concurrent.Callable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.zzb()
            java.util.concurrent.Future r2 = r0.submit(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzx
    protected /* bridge */ /* synthetic */ java.lang.Object zza() {
            r1 = this;
            r0 = 0
            throw r0
    }

    protected abstract java.util.concurrent.ExecutorService zzb();
}
