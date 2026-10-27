package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzao extends java.util.concurrent.AbstractExecutorService implements com.google.android.gms.internal.mlkit_acceleration.zzbb {
    public zzao() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final java.util.concurrent.RunnableFuture newTaskFor(java.lang.Runnable r1, java.lang.Object r2) {
            r0 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzbi r1 = com.google.android.gms.internal.mlkit_acceleration.zzbi.zzn(r1, r2)
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final java.util.concurrent.RunnableFuture newTaskFor(java.util.concurrent.Callable r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzbi r0 = new com.google.android.gms.internal.mlkit_acceleration.zzbi
            r0.<init>(r2)
            return r0
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable r1) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable r1, java.lang.Object r2) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1, r2)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            return r1
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ java.util.concurrent.Future submit(java.util.concurrent.Callable r1) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzbb
    public final com.google.common.util.concurrent.ListenableFuture zza(java.util.concurrent.Callable r1) {
            r0 = this;
            java.util.concurrent.Future r1 = super.submit(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            return r1
    }
}
