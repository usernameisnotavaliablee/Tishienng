package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzbf extends com.google.android.gms.internal.mlkit_acceleration.zzbc implements java.util.concurrent.ScheduledExecutorService, com.google.android.gms.internal.mlkit_acceleration.zzbb {
    final java.util.concurrent.ScheduledExecutorService zza;

    zzbf(java.util.concurrent.ScheduledExecutorService r1) {
            r0 = this;
            r0.<init>(r1)
            r1.getClass()
            r0.zza = r1
            return
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.lang.Runnable r3, long r4, java.util.concurrent.TimeUnit r6) {
            r2 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r2.zza
            r1 = 0
            com.google.android.gms.internal.mlkit_acceleration.zzbi r3 = com.google.android.gms.internal.mlkit_acceleration.zzbi.zzn(r3, r1)
            java.util.concurrent.ScheduledFuture r4 = r0.schedule(r3, r4, r6)
            com.google.android.gms.internal.mlkit_acceleration.zzbd r5 = new com.google.android.gms.internal.mlkit_acceleration.zzbd
            r5.<init>(r3, r4)
            return r5
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzbi r0 = new com.google.android.gms.internal.mlkit_acceleration.zzbi
            r0.<init>(r2)
            java.util.concurrent.ScheduledExecutorService r2 = r1.zza
            java.util.concurrent.ScheduledFuture r2 = r2.schedule(r0, r3, r5)
            com.google.android.gms.internal.mlkit_acceleration.zzbd r3 = new com.google.android.gms.internal.mlkit_acceleration.zzbd
            r3.<init>(r0, r2)
            return r3
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable r8, long r9, long r11, java.util.concurrent.TimeUnit r13) {
            r7 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzbe r1 = new com.google.android.gms.internal.mlkit_acceleration.zzbe
            r1.<init>(r8)
            java.util.concurrent.ScheduledExecutorService r0 = r7.zza
            r2 = r9
            r4 = r11
            r6 = r13
            java.util.concurrent.ScheduledFuture r8 = r0.scheduleAtFixedRate(r1, r2, r4, r6)
            com.google.android.gms.internal.mlkit_acceleration.zzbd r9 = new com.google.android.gms.internal.mlkit_acceleration.zzbd
            r9.<init>(r1, r8)
            return r9
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable r8, long r9, long r11, java.util.concurrent.TimeUnit r13) {
            r7 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzbe r1 = new com.google.android.gms.internal.mlkit_acceleration.zzbe
            r1.<init>(r8)
            java.util.concurrent.ScheduledExecutorService r0 = r7.zza
            r2 = r9
            r4 = r11
            r6 = r13
            java.util.concurrent.ScheduledFuture r8 = r0.scheduleWithFixedDelay(r1, r2, r4, r6)
            com.google.android.gms.internal.mlkit_acceleration.zzbd r9 = new com.google.android.gms.internal.mlkit_acceleration.zzbd
            r9.<init>(r1, r8)
            return r9
    }
}
