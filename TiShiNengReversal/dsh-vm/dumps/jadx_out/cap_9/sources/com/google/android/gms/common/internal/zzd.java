package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.VisibleForTesting
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzd extends com.google.android.gms.common.internal.zzac {

    @androidx.annotation.Nullable
    private com.google.android.gms.common.internal.BaseGmsClient zza;
    private final int zzb;

    public zzd(@androidx.annotation.NonNull com.google.android.gms.common.internal.BaseGmsClient r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @androidx.annotation.BinderThread
    public final void onPostInitComplete(int r3, @androidx.annotation.NonNull android.os.IBinder r4, @androidx.annotation.Nullable android.os.Bundle r5) {
            r2 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zza
            java.lang.String r1 = "onPostInitComplete can be called only once per call to getRemoteService"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zza
            int r1 = r2.zzb
            r0.onPostInitHandler(r3, r4, r5, r1)
            r3 = 0
            r2.zza = r3
            return
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @androidx.annotation.BinderThread
    public final void zzb(int r1, @androidx.annotation.Nullable android.os.Bundle r2) {
            r0 = this;
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @androidx.annotation.BinderThread
    public final void zzc(int r3, @androidx.annotation.NonNull android.os.IBinder r4, @androidx.annotation.NonNull com.google.android.gms.common.internal.zzk r5) {
            r2 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zza
            java.lang.String r1 = "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.internal.BaseGmsClient.zzj(r0, r5)
            android.os.Bundle r5 = r5.zza
            r2.onPostInitComplete(r3, r4, r5)
            return
    }
}
