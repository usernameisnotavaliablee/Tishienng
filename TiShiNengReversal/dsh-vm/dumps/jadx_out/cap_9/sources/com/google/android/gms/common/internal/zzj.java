package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzj {
    static final java.util.concurrent.ExecutorService zza = null;

    static {
            com.google.android.gms.internal.common.zzh.zza()
            com.google.android.gms.common.util.concurrent.NamedThreadFactory r7 = new com.google.android.gms.common.util.concurrent.NamedThreadFactory
            java.lang.String r0 = "CallbackExecutor"
            r7.<init>(r0)
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r1 = 1
            r2 = 1
            r3 = 60
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r0.allowCoreThreadTimeOut(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            com.google.android.gms.common.internal.zzj.zza = r0
            return
    }

    public zzj() {
            r1 = this;
            r1.<init>()
            return
    }
}
