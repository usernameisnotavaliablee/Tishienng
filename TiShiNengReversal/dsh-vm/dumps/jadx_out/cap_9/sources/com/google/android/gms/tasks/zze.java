package com.google.android.gms.tasks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zze implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzf zzb;

    zze(com.google.android.gms.tasks.zzf r1, com.google.android.gms.tasks.Task r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.tasks.zzf r0 = r3.zzb     // Catch: java.lang.Exception -> L2f com.google.android.gms.tasks.RuntimeExecutionException -> L31
            com.google.android.gms.tasks.Continuation r0 = com.google.android.gms.tasks.zzf.zza(r0)     // Catch: java.lang.Exception -> L2f com.google.android.gms.tasks.RuntimeExecutionException -> L31
            com.google.android.gms.tasks.Task r1 = r3.zza     // Catch: java.lang.Exception -> L2f com.google.android.gms.tasks.RuntimeExecutionException -> L31
            java.lang.Object r0 = r0.then(r1)     // Catch: java.lang.Exception -> L2f com.google.android.gms.tasks.RuntimeExecutionException -> L31
            com.google.android.gms.tasks.Task r0 = (com.google.android.gms.tasks.Task) r0     // Catch: java.lang.Exception -> L2f com.google.android.gms.tasks.RuntimeExecutionException -> L31
            if (r0 != 0) goto L1d
            com.google.android.gms.tasks.zzf r0 = r3.zzb
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Continuation returned null"
            r1.<init>(r2)
            r0.onFailure(r1)
            return
        L1d:
            com.google.android.gms.tasks.zzf r1 = r3.zzb
            java.util.concurrent.Executor r2 = com.google.android.gms.tasks.TaskExecutors.zza
            r0.addOnSuccessListener(r2, r1)
            com.google.android.gms.tasks.zzf r1 = r3.zzb
            r0.addOnFailureListener(r2, r1)
            com.google.android.gms.tasks.zzf r1 = r3.zzb
            r0.addOnCanceledListener(r2, r1)
            return
        L2f:
            r0 = move-exception
            goto L33
        L31:
            r0 = move-exception
            goto L3d
        L33:
            com.google.android.gms.tasks.zzf r1 = r3.zzb
            com.google.android.gms.tasks.zzw r1 = com.google.android.gms.tasks.zzf.zzb(r1)
            r1.zza(r0)
            return
        L3d:
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.lang.Exception
            if (r1 == 0) goto L55
            com.google.android.gms.tasks.zzf r1 = r3.zzb
            com.google.android.gms.tasks.zzw r1 = com.google.android.gms.tasks.zzf.zzb(r1)
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Exception r0 = (java.lang.Exception) r0
            r1.zza(r0)
            return
        L55:
            com.google.android.gms.tasks.zzf r1 = r3.zzb
            com.google.android.gms.tasks.zzw r1 = com.google.android.gms.tasks.zzf.zzb(r1)
            r1.zza(r0)
            return
    }
}
