package com.google.android.gms.common.providers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class PooledExecutorsProvider {
    private static com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory zza;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface PooledExecutorFactory {
        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        @java.lang.Deprecated
        java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    private PooledExecutorsProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static synchronized com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory getInstance() {
            java.lang.Class<com.google.android.gms.common.providers.PooledExecutorsProvider> r0 = com.google.android.gms.common.providers.PooledExecutorsProvider.class
            monitor-enter(r0)
            com.google.android.gms.common.providers.PooledExecutorsProvider$PooledExecutorFactory r1 = com.google.android.gms.common.providers.PooledExecutorsProvider.zza     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.google.android.gms.common.providers.zza r1 = new com.google.android.gms.common.providers.zza     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.common.providers.PooledExecutorsProvider.zza = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            com.google.android.gms.common.providers.PooledExecutorsProvider$PooledExecutorFactory r1 = com.google.android.gms.common.providers.PooledExecutorsProvider.zza     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }
}
