package com.google.android.gms.tasks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzm implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzn zzb;

    zzm(com.google.android.gms.tasks.zzn r1, com.google.android.gms.tasks.Task r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.tasks.zzn r0 = r3.zzb
            java.lang.Object r0 = com.google.android.gms.tasks.zzn.zzb(r0)
            monitor-enter(r0)
            com.google.android.gms.tasks.zzn r1 = r3.zzb     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.OnSuccessListener r2 = com.google.android.gms.tasks.zzn.zza(r1)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1f
            com.google.android.gms.tasks.OnSuccessListener r1 = com.google.android.gms.tasks.zzn.zza(r1)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.Task r2 = r3.zza     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r2 = r2.getResult()     // Catch: java.lang.Throwable -> L1d
            r1.onSuccess(r2)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r1 = move-exception
            goto L21
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
    }
}
