package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzar extends com.google.android.gms.internal.mlkit_acceleration.zzah implements java.util.concurrent.Future {
    protected zzar() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r2) {
            r1 = this;
            java.util.concurrent.Future r0 = r1.zzb()
            boolean r2 = r0.cancel(r2)
            return r2
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            java.util.concurrent.Future r0 = r1.zzb()
            java.lang.Object r0 = r0.get()
            return r0
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            java.util.concurrent.Future r0 = r1.zzb()
            java.lang.Object r2 = r0.get(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r1 = this;
            java.util.concurrent.Future r0 = r1.zzb()
            boolean r0 = r0.isCancelled()
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r1 = this;
            java.util.concurrent.Future r0 = r1.zzb()
            boolean r0 = r0.isDone()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzah
    protected /* bridge */ /* synthetic */ java.lang.Object zza() {
            r1 = this;
            r0 = 0
            throw r0
    }

    protected abstract java.util.concurrent.Future zzb();
}
