package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzbd extends com.google.android.gms.internal.mlkit_acceleration.zzas implements java.util.concurrent.ScheduledFuture, com.google.common.util.concurrent.ListenableFuture {
    private final java.util.concurrent.ScheduledFuture zza;

    public zzbd(com.google.common.util.concurrent.ListenableFuture r1, java.util.concurrent.ScheduledFuture r2) {
            r0 = this;
            r0.<init>(r1)
            r0.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzar, java.util.concurrent.Future
    public final boolean cancel(boolean r3) {
            r2 = this;
            java.util.concurrent.Future r0 = r2.zzb()
            boolean r0 = r0.cancel(r3)
            if (r0 == 0) goto Lf
            java.util.concurrent.ScheduledFuture r1 = r2.zza
            r1.cancel(r3)
        Lf:
            return r0
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed r2) {
            r1 = this;
            java.util.concurrent.ScheduledFuture r0 = r1.zza
            java.util.concurrent.Delayed r2 = (java.util.concurrent.Delayed) r2
            int r2 = r0.compareTo(r2)
            return r2
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(java.util.concurrent.TimeUnit r3) {
            r2 = this;
            java.util.concurrent.ScheduledFuture r0 = r2.zza
            long r0 = r0.getDelay(r3)
            return r0
    }
}
