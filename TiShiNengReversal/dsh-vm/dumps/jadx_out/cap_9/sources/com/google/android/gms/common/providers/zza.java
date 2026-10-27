package com.google.android.gms.common.providers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zza implements com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory {
    zza() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory
    public final java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor() {
            r1 = this;
            com.google.android.gms.internal.common.zzh.zza()
            r0 = 1
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r0)
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(r0)
            return r0
    }
}
