package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzg extends com.google.android.gms.common.internal.zza {
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zze;

    @androidx.annotation.BinderThread
    public zzg(com.google.android.gms.common.internal.BaseGmsClient r1, @androidx.annotation.Nullable int r2, android.os.Bundle r3) {
            r0 = this;
            r0.zze = r1
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final void zzb(com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zze
            boolean r0 = r0.enableLocalFallback()
            if (r0 == 0) goto L18
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zze
            boolean r0 = com.google.android.gms.common.internal.BaseGmsClient.zzo(r0)
            if (r0 == 0) goto L18
            com.google.android.gms.common.internal.BaseGmsClient r2 = r1.zze
            r0 = 16
            com.google.android.gms.common.internal.BaseGmsClient.zzk(r2, r0)
            return
        L18:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zze
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r0 = r0.zzc
            r0.onReportServiceBinding(r2)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zze
            r0.onConnectionFailed(r2)
            return
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final boolean zzd() {
            r2 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zze
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r0 = r0.zzc
            com.google.android.gms.common.ConnectionResult r1 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS
            r0.onReportServiceBinding(r1)
            r0 = 1
            return r0
    }
}
