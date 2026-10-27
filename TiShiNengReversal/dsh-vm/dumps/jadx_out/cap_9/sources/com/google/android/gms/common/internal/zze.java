package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.VisibleForTesting
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zze implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zza;
    private final int zzb;

    public zze(com.google.android.gms.common.internal.BaseGmsClient r1, int r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
            r3 = this;
            com.google.android.gms.common.internal.BaseGmsClient r4 = r3.zza
            if (r5 != 0) goto La
            r5 = 16
            com.google.android.gms.common.internal.BaseGmsClient.zzk(r4, r5)
            return
        La:
            java.lang.Object r4 = com.google.android.gms.common.internal.BaseGmsClient.zzd(r4)
            monitor-enter(r4)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r3.zza     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "com.google.android.gms.common.internal.IGmsServiceBroker"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L22
            boolean r2 = r1 instanceof com.google.android.gms.common.internal.IGmsServiceBroker     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L22
            com.google.android.gms.common.internal.IGmsServiceBroker r1 = (com.google.android.gms.common.internal.IGmsServiceBroker) r1     // Catch: java.lang.Throwable -> L20
            goto L27
        L20:
            r5 = move-exception
            goto L35
        L22:
            com.google.android.gms.common.internal.zzad r1 = new com.google.android.gms.common.internal.zzad     // Catch: java.lang.Throwable -> L20
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L20
        L27:
            com.google.android.gms.common.internal.BaseGmsClient.zzh(r0, r1)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.common.internal.BaseGmsClient r4 = r3.zza
            r5 = 0
            int r0 = r3.zzb
            r1 = 0
            r4.zzl(r1, r5, r0)
            return
        L35:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r4) {
            r3 = this;
            com.google.android.gms.common.internal.BaseGmsClient r4 = r3.zza
            java.lang.Object r4 = com.google.android.gms.common.internal.BaseGmsClient.zzd(r4)
            monitor-enter(r4)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r3.zza     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            com.google.android.gms.common.internal.BaseGmsClient.zzh(r0, r1)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.common.internal.BaseGmsClient r4 = r3.zza
            int r0 = r3.zzb
            android.os.Handler r4 = r4.zzb
            r1 = 6
            r2 = 1
            android.os.Message r0 = r4.obtainMessage(r1, r0, r2)
            r4.sendMessage(r0)
            return
        L1e:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }
}
