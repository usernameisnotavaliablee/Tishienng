package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzs extends com.google.android.gms.common.internal.GmsClientSupervisor {

    @com.google.errorprone.annotations.concurrent.GuardedBy("connectionStatus")
    private final java.util.HashMap zzb;
    private final android.content.Context zzc;
    private volatile android.os.Handler zzd;
    private final com.google.android.gms.common.internal.zzr zze;
    private final com.google.android.gms.common.stats.ConnectionTracker zzf;
    private final long zzg;
    private final long zzh;

    @androidx.annotation.Nullable
    private volatile java.util.concurrent.Executor zzi;

    zzs(android.content.Context r3, android.os.Looper r4, @androidx.annotation.Nullable java.util.concurrent.Executor r5) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.zzb = r0
            com.google.android.gms.common.internal.zzr r0 = new com.google.android.gms.common.internal.zzr
            r1 = 0
            r0.<init>(r2, r1)
            r2.zze = r0
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r2.zzc = r3
            com.google.android.gms.internal.common.zzi r3 = new com.google.android.gms.internal.common.zzi
            r3.<init>(r4, r0)
            r2.zzd = r3
            com.google.android.gms.common.stats.ConnectionTracker r3 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()
            r2.zzf = r3
            r3 = 5000(0x1388, double:2.4703E-320)
            r2.zzg = r3
            r3 = 300000(0x493e0, double:1.482197E-318)
            r2.zzh = r3
            r2.zzi = r5
            return
    }

    static /* bridge */ /* synthetic */ long zzd(com.google.android.gms.common.internal.zzs r2) {
            long r0 = r2.zzh
            return r0
    }

    static /* bridge */ /* synthetic */ android.content.Context zze(com.google.android.gms.common.internal.zzs r0) {
            android.content.Context r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ android.os.Handler zzf(com.google.android.gms.common.internal.zzs r0) {
            android.os.Handler r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.stats.ConnectionTracker zzg(com.google.android.gms.common.internal.zzs r0) {
            com.google.android.gms.common.stats.ConnectionTracker r0 = r0.zzf
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.HashMap zzh(com.google.android.gms.common.internal.zzs r0) {
            java.util.HashMap r0 = r0.zzb
            return r0
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final void zza(com.google.android.gms.common.internal.zzo r4, android.content.ServiceConnection r5, java.lang.String r6) {
            r3 = this;
            java.lang.String r0 = "ServiceConnection must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r0)
            java.util.HashMap r0 = r3.zzb
            monitor-enter(r0)
            java.util.HashMap r1 = r3.zzb     // Catch: java.lang.Throwable -> L30
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.common.internal.zzp r1 = (com.google.android.gms.common.internal.zzp) r1     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L4f
            boolean r2 = r1.zzh(r5)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L34
            r1.zzf(r5, r6)     // Catch: java.lang.Throwable -> L30
            boolean r5 = r1.zzi()     // Catch: java.lang.Throwable -> L30
            if (r5 == 0) goto L32
            android.os.Handler r5 = r3.zzd     // Catch: java.lang.Throwable -> L30
            r6 = 0
            android.os.Message r4 = r5.obtainMessage(r6, r4)     // Catch: java.lang.Throwable -> L30
            android.os.Handler r5 = r3.zzd     // Catch: java.lang.Throwable -> L30
            long r1 = r3.zzg     // Catch: java.lang.Throwable -> L30
            r5.sendMessageDelayed(r4, r1)     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r4 = move-exception
            goto L6a
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r6.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = "Trying to unbind a GmsServiceConnection  that was not bound before.  config="
            r6.append(r1)     // Catch: java.lang.Throwable -> L30
            r6.append(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L30
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L30
            throw r5     // Catch: java.lang.Throwable -> L30
        L4f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r6.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = "Nonexistent connection status for service config: "
            r6.append(r1)     // Catch: java.lang.Throwable -> L30
            r6.append(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L30
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L30
            throw r5     // Catch: java.lang.Throwable -> L30
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r4
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final boolean zzc(com.google.android.gms.common.internal.zzo r5, android.content.ServiceConnection r6, java.lang.String r7, @androidx.annotation.Nullable java.util.concurrent.Executor r8) {
            r4 = this;
            java.lang.String r0 = "ServiceConnection must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r0)
            java.util.HashMap r0 = r4.zzb
            monitor-enter(r0)
            java.util.HashMap r1 = r4.zzb     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.common.internal.zzp r1 = (com.google.android.gms.common.internal.zzp) r1     // Catch: java.lang.Throwable -> L15
            if (r8 != 0) goto L17
            java.util.concurrent.Executor r8 = r4.zzi     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r5 = move-exception
            goto L74
        L17:
            if (r1 != 0) goto L2a
            com.google.android.gms.common.internal.zzp r1 = new com.google.android.gms.common.internal.zzp     // Catch: java.lang.Throwable -> L15
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L15
            r1.zzd(r6, r6, r7)     // Catch: java.lang.Throwable -> L15
            r1.zze(r7, r8)     // Catch: java.lang.Throwable -> L15
            java.util.HashMap r6 = r4.zzb     // Catch: java.lang.Throwable -> L15
            r6.put(r5, r1)     // Catch: java.lang.Throwable -> L15
            goto L53
        L2a:
            android.os.Handler r2 = r4.zzd     // Catch: java.lang.Throwable -> L15
            r3 = 0
            r2.removeMessages(r3, r5)     // Catch: java.lang.Throwable -> L15
            boolean r2 = r1.zzh(r6)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L59
            r1.zzd(r6, r6, r7)     // Catch: java.lang.Throwable -> L15
            int r5 = r1.zza()     // Catch: java.lang.Throwable -> L15
            r2 = 1
            if (r5 == r2) goto L48
            r6 = 2
            if (r5 == r6) goto L44
            goto L53
        L44:
            r1.zze(r7, r8)     // Catch: java.lang.Throwable -> L15
            goto L53
        L48:
            android.content.ComponentName r5 = r1.zzb()     // Catch: java.lang.Throwable -> L15
            android.os.IBinder r7 = r1.zzc()     // Catch: java.lang.Throwable -> L15
            r6.onServiceConnected(r5, r7)     // Catch: java.lang.Throwable -> L15
        L53:
            boolean r5 = r1.zzj()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r5
        L59:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L15
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r7.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r8 = "Trying to bind a GmsServiceConnection that was already connected before.  config="
            r7.append(r8)     // Catch: java.lang.Throwable -> L15
            r7.append(r5)     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L15
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L15
            throw r6     // Catch: java.lang.Throwable -> L15
        L74:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r5
    }

    final void zzi(@androidx.annotation.Nullable java.util.concurrent.Executor r2) {
            r1 = this;
            java.util.HashMap r0 = r1.zzb
            monitor-enter(r0)
            r1.zzi = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    final void zzj(android.os.Looper r4) {
            r3 = this;
            java.util.HashMap r0 = r3.zzb
            monitor-enter(r0)
            com.google.android.gms.internal.common.zzi r1 = new com.google.android.gms.internal.common.zzi     // Catch: java.lang.Throwable -> Le
            com.google.android.gms.common.internal.zzr r2 = r3.zze     // Catch: java.lang.Throwable -> Le
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> Le
            r3.zzd = r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r4
    }
}
