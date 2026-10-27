package com.google.android.gms.tasks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzc implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzd zzb;

    zzc(com.google.android.gms.tasks.zzd r1, com.google.android.gms.tasks.Task r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.tasks.Task r0 = r2.zza
            boolean r0 = r0.isCanceled()
            if (r0 == 0) goto L12
            com.google.android.gms.tasks.zzd r0 = r2.zzb
            com.google.android.gms.tasks.zzw r0 = com.google.android.gms.tasks.zzd.zzb(r0)
            r0.zzc()
            return
        L12:
            com.google.android.gms.tasks.zzd r0 = r2.zzb     // Catch: java.lang.Exception -> L28 com.google.android.gms.tasks.RuntimeExecutionException -> L2a
            com.google.android.gms.tasks.Continuation r0 = com.google.android.gms.tasks.zzd.zza(r0)     // Catch: java.lang.Exception -> L28 com.google.android.gms.tasks.RuntimeExecutionException -> L2a
            com.google.android.gms.tasks.Task r1 = r2.zza     // Catch: java.lang.Exception -> L28 com.google.android.gms.tasks.RuntimeExecutionException -> L2a
            java.lang.Object r0 = r0.then(r1)     // Catch: java.lang.Exception -> L28 com.google.android.gms.tasks.RuntimeExecutionException -> L2a
            com.google.android.gms.tasks.zzd r1 = r2.zzb
            com.google.android.gms.tasks.zzw r1 = com.google.android.gms.tasks.zzd.zzb(r1)
            r1.zzb(r0)
            return
        L28:
            r0 = move-exception
            goto L2c
        L2a:
            r0 = move-exception
            goto L36
        L2c:
            com.google.android.gms.tasks.zzd r1 = r2.zzb
            com.google.android.gms.tasks.zzw r1 = com.google.android.gms.tasks.zzd.zzb(r1)
            r1.zza(r0)
            return
        L36:
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.lang.Exception
            if (r1 == 0) goto L4e
            com.google.android.gms.tasks.zzd r1 = r2.zzb
            com.google.android.gms.tasks.zzw r1 = com.google.android.gms.tasks.zzd.zzb(r1)
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Exception r0 = (java.lang.Exception) r0
            r1.zza(r0)
            return
        L4e:
            com.google.android.gms.tasks.zzd r1 = r2.zzb
            com.google.android.gms.tasks.zzw r1 = com.google.android.gms.tasks.zzd.zzb(r1)
            r1.zza(r0)
            return
    }
}
