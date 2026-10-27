package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzf extends com.google.android.gms.common.internal.zza {

    @androidx.annotation.Nullable
    public final android.os.IBinder zze;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzf;

    @androidx.annotation.BinderThread
    public zzf(com.google.android.gms.common.internal.BaseGmsClient r1, @androidx.annotation.Nullable int r2, @androidx.annotation.Nullable android.os.IBinder r3, android.os.Bundle r4) {
            r0 = this;
            r0.zzf = r1
            r0.<init>(r1, r2, r4)
            r0.zze = r3
            return
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final void zzb(com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zzf
            com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r0 = com.google.android.gms.common.internal.BaseGmsClient.zzc(r0)
            if (r0 == 0) goto L11
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zzf
            com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r0 = com.google.android.gms.common.internal.BaseGmsClient.zzc(r0)
            r0.onConnectionFailed(r2)
        L11:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zzf
            r0.onConnectionFailed(r2)
            return
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final boolean zzd() {
            r5 = this;
            r0 = 0
            android.os.IBinder r1 = r5.zze     // Catch: android.os.RemoteException -> L55
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: android.os.RemoteException -> L55
            java.lang.String r1 = r1.getInterfaceDescriptor()     // Catch: android.os.RemoteException -> L55
            com.google.android.gms.common.internal.BaseGmsClient r2 = r5.zzf
            java.lang.String r2 = r2.getServiceDescriptor()
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L1c
            com.google.android.gms.common.internal.BaseGmsClient r1 = r5.zzf
            r1.getServiceDescriptor()
            return r0
        L1c:
            com.google.android.gms.common.internal.BaseGmsClient r1 = r5.zzf
            android.os.IBinder r2 = r5.zze
            android.os.IInterface r1 = r1.createServiceInterface(r2)
            if (r1 == 0) goto L55
            com.google.android.gms.common.internal.BaseGmsClient r2 = r5.zzf
            r3 = 2
            r4 = 4
            boolean r2 = com.google.android.gms.common.internal.BaseGmsClient.zzn(r2, r3, r4, r1)
            if (r2 != 0) goto L39
            com.google.android.gms.common.internal.BaseGmsClient r2 = r5.zzf
            r3 = 3
            boolean r1 = com.google.android.gms.common.internal.BaseGmsClient.zzn(r2, r3, r4, r1)
            if (r1 == 0) goto L55
        L39:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r5.zzf
            r1 = 0
            com.google.android.gms.common.internal.BaseGmsClient.zzg(r0, r1)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r5.zzf
            android.os.Bundle r1 = r0.getConnectionHint()
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r0 = com.google.android.gms.common.internal.BaseGmsClient.zzb(r0)
            if (r0 == 0) goto L54
            com.google.android.gms.common.internal.BaseGmsClient r0 = r5.zzf
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r0 = com.google.android.gms.common.internal.BaseGmsClient.zzb(r0)
            r0.onConnected(r1)
        L54:
            r0 = 1
        L55:
            return r0
    }
}
