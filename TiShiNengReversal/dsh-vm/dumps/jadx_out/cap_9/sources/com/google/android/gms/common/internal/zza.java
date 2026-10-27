package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class zza extends com.google.android.gms.common.internal.zzc {
    public final int zza;

    @androidx.annotation.Nullable
    public final android.os.Bundle zzb;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzc;

    @androidx.annotation.BinderThread
    protected zza(com.google.android.gms.common.internal.BaseGmsClient r2, @androidx.annotation.Nullable int r3, android.os.Bundle r4) {
            r1 = this;
            r1.zzc = r2
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.<init>(r2, r0)
            r1.zza = r3
            r1.zzb = r4
            return
    }

    @Override // com.google.android.gms.common.internal.zzc
    protected final /* bridge */ /* synthetic */ void zza(java.lang.Object r3) {
            r2 = this;
            int r3 = r2.zza
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L1c
            boolean r3 = r2.zzd()
            if (r3 != 0) goto L1b
            com.google.android.gms.common.internal.BaseGmsClient r3 = r2.zzc
            com.google.android.gms.common.internal.BaseGmsClient.zzi(r3, r0, r1)
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 8
            r3.<init>(r0, r1)
            r2.zzb(r3)
        L1b:
            return
        L1c:
            com.google.android.gms.common.internal.BaseGmsClient r3 = r2.zzc
            com.google.android.gms.common.internal.BaseGmsClient.zzi(r3, r0, r1)
            android.os.Bundle r3 = r2.zzb
            if (r3 == 0) goto L2e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L2e:
            int r3 = r2.zza
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r0.<init>(r3, r1)
            r2.zzb(r0)
            return
    }

    protected abstract void zzb(com.google.android.gms.common.ConnectionResult r1);

    @Override // com.google.android.gms.common.internal.zzc
    protected final void zzc() {
            r0 = this;
            return
    }

    protected abstract boolean zzd();
}
