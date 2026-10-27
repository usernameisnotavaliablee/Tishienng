package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzr implements android.os.Handler.Callback {
    final /* synthetic */ com.google.android.gms.common.internal.zzs zza;

    /* synthetic */ zzr(com.google.android.gms.common.internal.zzs r1, com.google.android.gms.common.internal.zzq r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r6) {
            r5 = this;
            int r0 = r6.what
            r1 = 1
            if (r0 == 0) goto L55
            if (r0 == r1) goto L9
            r6 = 0
            return r6
        L9:
            com.google.android.gms.common.internal.zzs r0 = r5.zza
            java.util.HashMap r0 = com.google.android.gms.common.internal.zzs.zzh(r0)
            monitor-enter(r0)
            java.lang.Object r6 = r6.obj     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.common.internal.zzo r6 = (com.google.android.gms.common.internal.zzo) r6     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.common.internal.zzs r2 = r5.zza     // Catch: java.lang.Throwable -> L3c
            java.util.HashMap r2 = com.google.android.gms.common.internal.zzs.zzh(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.common.internal.zzp r2 = (com.google.android.gms.common.internal.zzp) r2     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L51
            int r3 = r2.zza()     // Catch: java.lang.Throwable -> L3c
            r4 = 3
            if (r3 != r4) goto L51
            java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L3c
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Throwable -> L3c
            r3.<init>()     // Catch: java.lang.Throwable -> L3c
            android.content.ComponentName r3 = r2.zzb()     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L3e
            android.content.ComponentName r3 = r6.zza()     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r6 = move-exception
            goto L53
        L3e:
            if (r3 != 0) goto L4e
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = r6.zzc()     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = "unknown"
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> L3c
        L4e:
            r2.onServiceDisconnected(r3)     // Catch: java.lang.Throwable -> L3c
        L51:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            return r1
        L53:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r6
        L55:
            com.google.android.gms.common.internal.zzs r0 = r5.zza
            java.util.HashMap r0 = com.google.android.gms.common.internal.zzs.zzh(r0)
            monitor-enter(r0)
            java.lang.Object r6 = r6.obj     // Catch: java.lang.Throwable -> L80
            com.google.android.gms.common.internal.zzo r6 = (com.google.android.gms.common.internal.zzo) r6     // Catch: java.lang.Throwable -> L80
            com.google.android.gms.common.internal.zzs r2 = r5.zza     // Catch: java.lang.Throwable -> L80
            java.util.HashMap r2 = com.google.android.gms.common.internal.zzs.zzh(r2)     // Catch: java.lang.Throwable -> L80
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.Throwable -> L80
            com.google.android.gms.common.internal.zzp r2 = (com.google.android.gms.common.internal.zzp) r2     // Catch: java.lang.Throwable -> L80
            if (r2 == 0) goto L8b
            boolean r3 = r2.zzi()     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L8b
            boolean r3 = r2.zzj()     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L82
            java.lang.String r3 = "GmsClientSupervisor"
            r2.zzg(r3)     // Catch: java.lang.Throwable -> L80
            goto L82
        L80:
            r6 = move-exception
            goto L8d
        L82:
            com.google.android.gms.common.internal.zzs r2 = r5.zza     // Catch: java.lang.Throwable -> L80
            java.util.HashMap r2 = com.google.android.gms.common.internal.zzs.zzh(r2)     // Catch: java.lang.Throwable -> L80
            r2.remove(r6)     // Catch: java.lang.Throwable -> L80
        L8b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L80
            return r1
        L8d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L80
            throw r6
    }
}
