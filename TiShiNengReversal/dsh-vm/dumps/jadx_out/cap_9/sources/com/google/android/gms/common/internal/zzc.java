package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzc {

    @androidx.annotation.Nullable
    private java.lang.Object zza;
    private boolean zzb;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzd;

    public zzc(com.google.android.gms.common.internal.BaseGmsClient r1, java.lang.Object r2) {
            r0 = this;
            r0.zzd = r1
            r0.<init>()
            r0.zza = r2
            r1 = 0
            r0.zzb = r1
            return
    }

    protected abstract void zza(java.lang.Object r1);

    protected abstract void zzc();

    public final void zze() {
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r2.zza     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r2.zzb     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            r2.toString()     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r0 = move-exception
            goto L1f
        Ld:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L13
            r2.zza(r0)
        L13:
            monitor-enter(r2)
            r0 = 1
            r2.zzb = r0     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            r2.zzg()
            return
        L1c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r0
        L1f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public final void zzf() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.zza = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    public final void zzg() {
            r2 = this;
            r2.zzf()
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zzd
            java.util.ArrayList r0 = com.google.android.gms.common.internal.BaseGmsClient.zzf(r0)
            monitor-enter(r0)
            com.google.android.gms.common.internal.BaseGmsClient r1 = r2.zzd     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList r1 = com.google.android.gms.common.internal.BaseGmsClient.zzf(r1)     // Catch: java.lang.Throwable -> L15
            r1.remove(r2)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1
    }
}
