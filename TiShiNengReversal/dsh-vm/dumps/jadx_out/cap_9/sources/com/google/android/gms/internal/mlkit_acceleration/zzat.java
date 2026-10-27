package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzat extends com.google.android.gms.internal.mlkit_acceleration.zzar implements com.google.common.util.concurrent.ListenableFuture {
    protected zzat() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzc()
            r0.addListener(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzar
    protected /* bridge */ /* synthetic */ java.util.concurrent.Future zzb() {
            r1 = this;
            r0 = 0
            throw r0
    }

    protected abstract com.google.common.util.concurrent.ListenableFuture zzc();
}
