package com.google.android.gms.tasks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzz implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.zzw zza;
    final /* synthetic */ java.util.concurrent.Callable zzb;

    zzz(com.google.android.gms.tasks.zzw r1, java.util.concurrent.Callable r2) {
            r0 = this;
            r0.zza = r1
            r0.zzb = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.tasks.zzw r0 = r3.zza     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            java.util.concurrent.Callable r1 = r3.zzb     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            r0.zzb(r1)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            return
        Lc:
            r0 = move-exception
            goto L10
        Le:
            r0 = move-exception
            goto L1b
        L10:
            com.google.android.gms.tasks.zzw r1 = r3.zza
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            r1.zza(r2)
            return
        L1b:
            com.google.android.gms.tasks.zzw r1 = r3.zza
            r1.zza(r0)
            return
    }
}
