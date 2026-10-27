package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzp implements android.content.ServiceConnection, com.google.android.gms.common.internal.zzt {
    final /* synthetic */ com.google.android.gms.common.internal.zzs zza;
    private final java.util.Map zzb;
    private int zzc;
    private boolean zzd;

    @androidx.annotation.Nullable
    private android.os.IBinder zze;
    private final com.google.android.gms.common.internal.zzo zzf;
    private android.content.ComponentName zzg;

    public zzp(com.google.android.gms.common.internal.zzs r1, com.google.android.gms.common.internal.zzo r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzf = r2
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zzb = r1
            r1 = 2
            r0.zzc = r1
            return
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName r1) {
            r0 = this;
            r0.onServiceDisconnected(r1)
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r5, android.os.IBinder r6) {
            r4 = this;
            com.google.android.gms.common.internal.zzs r0 = r4.zza
            java.util.HashMap r0 = com.google.android.gms.common.internal.zzs.zzh(r0)
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzs r1 = r4.zza     // Catch: java.lang.Throwable -> L31
            android.os.Handler r1 = com.google.android.gms.common.internal.zzs.zzf(r1)     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.common.internal.zzo r2 = r4.zzf     // Catch: java.lang.Throwable -> L31
            r3 = 1
            r1.removeMessages(r3, r2)     // Catch: java.lang.Throwable -> L31
            r4.zze = r6     // Catch: java.lang.Throwable -> L31
            r4.zzg = r5     // Catch: java.lang.Throwable -> L31
            java.util.Map r1 = r4.zzb     // Catch: java.lang.Throwable -> L31
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L31
        L21:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L31
            android.content.ServiceConnection r2 = (android.content.ServiceConnection) r2     // Catch: java.lang.Throwable -> L31
            r2.onServiceConnected(r5, r6)     // Catch: java.lang.Throwable -> L31
            goto L21
        L31:
            r5 = move-exception
            goto L37
        L33:
            r4.zzc = r3     // Catch: java.lang.Throwable -> L31
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            return
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r5
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r5) {
            r4 = this;
            com.google.android.gms.common.internal.zzs r0 = r4.zza
            java.util.HashMap r0 = com.google.android.gms.common.internal.zzs.zzh(r0)
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzs r1 = r4.zza     // Catch: java.lang.Throwable -> L32
            android.os.Handler r1 = com.google.android.gms.common.internal.zzs.zzf(r1)     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.common.internal.zzo r2 = r4.zzf     // Catch: java.lang.Throwable -> L32
            r3 = 1
            r1.removeMessages(r3, r2)     // Catch: java.lang.Throwable -> L32
            r1 = 0
            r4.zze = r1     // Catch: java.lang.Throwable -> L32
            r4.zzg = r5     // Catch: java.lang.Throwable -> L32
            java.util.Map r1 = r4.zzb     // Catch: java.lang.Throwable -> L32
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L32
        L22:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L32
            android.content.ServiceConnection r2 = (android.content.ServiceConnection) r2     // Catch: java.lang.Throwable -> L32
            r2.onServiceDisconnected(r5)     // Catch: java.lang.Throwable -> L32
            goto L22
        L32:
            r5 = move-exception
            goto L39
        L34:
            r5 = 2
            r4.zzc = r5     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    public final android.content.ComponentName zzb() {
            r1 = this;
            android.content.ComponentName r0 = r1.zzg
            return r0
    }

    @androidx.annotation.Nullable
    public final android.os.IBinder zzc() {
            r1 = this;
            android.os.IBinder r0 = r1.zze
            return r0
    }

    public final void zzd(android.content.ServiceConnection r1, android.content.ServiceConnection r2, java.lang.String r3) {
            r0 = this;
            java.util.Map r3 = r0.zzb
            r3.put(r1, r2)
            return
    }

    public final void zze(java.lang.String r10, @androidx.annotation.Nullable java.util.concurrent.Executor r11) {
            r9 = this;
            r0 = 3
            r9.zzc = r0
            android.os.StrictMode$VmPolicy r1 = android.os.StrictMode.getVmPolicy()
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastS()
            if (r0 == 0) goto L1d
            android.os.StrictMode$VmPolicy$Builder r0 = new android.os.StrictMode$VmPolicy$Builder
            r0.<init>(r1)
            android.os.StrictMode$VmPolicy$Builder r0 = com.google.android.gms.common.internal.a.a(r0)
            android.os.StrictMode$VmPolicy r0 = r0.build()
            android.os.StrictMode.setVmPolicy(r0)
        L1d:
            com.google.android.gms.common.internal.zzs r0 = r9.zza     // Catch: java.lang.Throwable -> L72
            com.google.android.gms.common.stats.ConnectionTracker r2 = com.google.android.gms.common.internal.zzs.zzg(r0)     // Catch: java.lang.Throwable -> L72
            android.content.Context r3 = com.google.android.gms.common.internal.zzs.zze(r0)     // Catch: java.lang.Throwable -> L72
            com.google.android.gms.common.internal.zzo r4 = r9.zzf     // Catch: java.lang.Throwable -> L72
            android.content.Context r0 = com.google.android.gms.common.internal.zzs.zze(r0)     // Catch: java.lang.Throwable -> L72
            android.content.Intent r5 = r4.zzb(r0)     // Catch: java.lang.Throwable -> L72
            r7 = 4225(0x1081, float:5.92E-42)
            r6 = r9
            r4 = r10
            r8 = r11
            boolean r10 = r2.zza(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5b
            r6.zzd = r10     // Catch: java.lang.Throwable -> L5b
            if (r10 == 0) goto L5e
            com.google.android.gms.common.internal.zzs r10 = r6.zza     // Catch: java.lang.Throwable -> L5b
            android.os.Handler r10 = com.google.android.gms.common.internal.zzs.zzf(r10)     // Catch: java.lang.Throwable -> L5b
            com.google.android.gms.common.internal.zzo r11 = r6.zzf     // Catch: java.lang.Throwable -> L5b
            r0 = 1
            android.os.Message r10 = r10.obtainMessage(r0, r11)     // Catch: java.lang.Throwable -> L5b
            com.google.android.gms.common.internal.zzs r11 = r6.zza     // Catch: java.lang.Throwable -> L5b
            android.os.Handler r11 = com.google.android.gms.common.internal.zzs.zzf(r11)     // Catch: java.lang.Throwable -> L5b
            com.google.android.gms.common.internal.zzs r0 = r6.zza     // Catch: java.lang.Throwable -> L5b
            long r2 = com.google.android.gms.common.internal.zzs.zzd(r0)     // Catch: java.lang.Throwable -> L5b
            r11.sendMessageDelayed(r10, r2)     // Catch: java.lang.Throwable -> L5b
            goto L6e
        L5b:
            r0 = move-exception
        L5c:
            r10 = r0
            goto L75
        L5e:
            r10 = 2
            r6.zzc = r10     // Catch: java.lang.Throwable -> L5b
            com.google.android.gms.common.internal.zzs r10 = r6.zza     // Catch: java.lang.Throwable -> L5b java.lang.IllegalArgumentException -> L6e
            com.google.android.gms.common.stats.ConnectionTracker r11 = com.google.android.gms.common.internal.zzs.zzg(r10)     // Catch: java.lang.Throwable -> L5b java.lang.IllegalArgumentException -> L6e
            android.content.Context r10 = com.google.android.gms.common.internal.zzs.zze(r10)     // Catch: java.lang.Throwable -> L5b java.lang.IllegalArgumentException -> L6e
            r11.unbindService(r10, r9)     // Catch: java.lang.Throwable -> L5b java.lang.IllegalArgumentException -> L6e
        L6e:
            android.os.StrictMode.setVmPolicy(r1)
            return
        L72:
            r0 = move-exception
            r6 = r9
            goto L5c
        L75:
            android.os.StrictMode.setVmPolicy(r1)
            throw r10
    }

    public final void zzf(android.content.ServiceConnection r1, java.lang.String r2) {
            r0 = this;
            java.util.Map r2 = r0.zzb
            r2.remove(r1)
            return
    }

    public final void zzg(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.common.internal.zzo r3 = r2.zzf
            com.google.android.gms.common.internal.zzs r0 = r2.zza
            android.os.Handler r0 = com.google.android.gms.common.internal.zzs.zzf(r0)
            r1 = 1
            r0.removeMessages(r1, r3)
            com.google.android.gms.common.internal.zzs r3 = r2.zza
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.internal.zzs.zzg(r3)
            android.content.Context r3 = com.google.android.gms.common.internal.zzs.zze(r3)
            r0.unbindService(r3, r2)
            r3 = 0
            r2.zzd = r3
            r3 = 2
            r2.zzc = r3
            return
    }

    public final boolean zzh(android.content.ServiceConnection r2) {
            r1 = this;
            java.util.Map r0 = r1.zzb
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    public final boolean zzi() {
            r1 = this;
            java.util.Map r0 = r1.zzb
            boolean r0 = r0.isEmpty()
            return r0
    }

    public final boolean zzj() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }
}
