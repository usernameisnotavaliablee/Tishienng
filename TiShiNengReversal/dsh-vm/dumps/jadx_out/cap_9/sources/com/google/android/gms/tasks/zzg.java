package com.google.android.gms.tasks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzg implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.zzh zza;

    zzg(com.google.android.gms.tasks.zzh r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.tasks.zzh r0 = r3.zza
            java.lang.Object r0 = com.google.android.gms.tasks.zzh.zzb(r0)
            monitor-enter(r0)
            com.google.android.gms.tasks.zzh r1 = r3.zza     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.tasks.OnCanceledListener r2 = com.google.android.gms.tasks.zzh.zza(r1)     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L19
            com.google.android.gms.tasks.OnCanceledListener r1 = com.google.android.gms.tasks.zzh.zza(r1)     // Catch: java.lang.Throwable -> L17
            r1.onCanceled()     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r1 = move-exception
            goto L1b
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }
}
