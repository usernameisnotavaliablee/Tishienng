package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzbh extends com.google.android.gms.internal.mlkit_acceleration.zzaz {
    final /* synthetic */ com.google.android.gms.internal.mlkit_acceleration.zzbi zza;
    private final java.util.concurrent.Callable zzb;

    zzbh(com.google.android.gms.internal.mlkit_acceleration.zzbi r1, java.util.concurrent.Callable r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r2.getClass()
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzaz
    final java.lang.Object zza() throws java.lang.Exception {
            r1 = this;
            java.util.concurrent.Callable r0 = r1.zzb
            java.lang.Object r0 = r0.call()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzaz
    final java.lang.String zzb() {
            r1 = this;
            java.util.concurrent.Callable r0 = r1.zzb
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzaz
    final void zzc(java.lang.Throwable r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzbi r0 = r1.zza
            r0.zzl(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzaz
    final void zzd(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzbi r0 = r1.zza
            r0.zzk(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzaz
    final boolean zzf() {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzbi r0 = r1.zza
            boolean r0 = r0.isDone()
            return r0
    }
}
