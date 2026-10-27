package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzwk {

    @androidx.annotation.Nullable
    private static com.google.android.gms.internal.mlkit_vision_pose_common.zzbd zza;
    private static final com.google.android.gms.internal.mlkit_vision_pose_common.zzbg zzb = null;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzwb zze;
    private final com.google.mlkit.common.sdkinternal.SharedPrefManager zzf;
    private final com.google.android.gms.tasks.Task zzg;
    private final com.google.android.gms.tasks.Task zzh;
    private final java.lang.String zzi;
    private final int zzj;
    private final java.util.Map zzk;
    private final java.util.Map zzl;

    static {
            java.lang.String r0 = "optional-module-barcode"
            java.lang.String r1 = "com.google.android.gms.vision.barcode"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbg r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzbg.zzd(r0, r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwk.zzb = r0
            return
    }

    public zzwk(android.content.Context r2, com.google.mlkit.common.sdkinternal.SharedPrefManager r3, com.google.android.gms.internal.mlkit_vision_pose_common.zzwb r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzk = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzl = r0
            java.lang.String r0 = r2.getPackageName()
            r1.zzc = r0
            java.lang.String r0 = com.google.mlkit.common.sdkinternal.CommonUtils.getAppVersion(r2)
            r1.zzd = r0
            r1.zzf = r3
            r1.zze = r4
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxq.zza()
            r1.zzi = r5
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r4 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwh r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzwh
            r0.<init>(r1)
            com.google.android.gms.tasks.Task r4 = r4.scheduleCallable(r0)
            r1.zzg = r4
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r4 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance()
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwi r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzwi
            r0.<init>(r3)
            com.google.android.gms.tasks.Task r3 = r4.scheduleCallable(r0)
            r1.zzh = r3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbg r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwk.zzb
            boolean r4 = r3.containsKey(r5)
            if (r4 == 0) goto L5a
            java.lang.Object r3 = r3.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            int r2 = com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(r2, r3)
            goto L5b
        L5a:
            r2 = -1
        L5b:
            r1.zzj = r2
            return
    }

    @androidx.annotation.VisibleForTesting
    static long zza(java.util.List r4, double r5) {
            int r0 = r4.size()
            double r0 = (double) r0
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 / r2
            double r5 = r5 * r0
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            int r5 = r5 + (-1)
            r6 = 0
            int r5 = java.lang.Math.max(r5, r6)
            java.lang.Object r4 = r4.get(r5)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            return r4
    }

    @androidx.annotation.NonNull
    private static synchronized com.google.android.gms.internal.mlkit_vision_pose_common.zzbd zzj() {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_pose_common.zzwk> r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwk.class
            monitor-enter(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwk.zza     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return r1
        L9:
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()     // Catch: java.lang.Throwable -> L2f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L2f
            androidx.core.os.LocaleListCompat r1 = androidx.core.os.ConfigurationCompat.getLocales(r1)     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.mlkit_vision_pose_common.zzba r2 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzba     // Catch: java.lang.Throwable -> L2f
            r2.<init>()     // Catch: java.lang.Throwable -> L2f
            r3 = 0
        L1b:
            int r4 = r1.size()     // Catch: java.lang.Throwable -> L2f
            if (r3 >= r4) goto L31
            java.util.Locale r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = com.google.mlkit.common.sdkinternal.CommonUtils.languageTagFromLocale(r4)     // Catch: java.lang.Throwable -> L2f
            r2.zzb(r4)     // Catch: java.lang.Throwable -> L2f
            int r3 = r3 + 1
            goto L1b
        L2f:
            r1 = move-exception
            goto L39
        L31:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r1 = r2.zzc()     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwk.zza = r1     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)
            return r1
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r1
    }

    @androidx.annotation.WorkerThread
    private final java.lang.String zzk() {
            r2 = this;
            com.google.android.gms.tasks.Task r0 = r2.zzg
            boolean r0 = r0.isSuccessful()
            if (r0 == 0) goto L11
            com.google.android.gms.tasks.Task r0 = r2.zzg
            java.lang.Object r0 = r0.getResult()
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L11:
            java.lang.String r0 = r2.zzi
            com.google.android.gms.common.internal.LibraryVersion r1 = com.google.android.gms.common.internal.LibraryVersion.getInstance()
            java.lang.String r0 = r1.getVersion(r0)
            return r0
    }

    @androidx.annotation.WorkerThread
    private final boolean zzl(com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r3, long r4, long r6) {
            r2 = this;
            java.util.Map r6 = r2.zzk
            java.lang.Object r6 = r6.get(r3)
            r7 = 1
            if (r6 != 0) goto La
            return r7
        La:
            java.util.Map r6 = r2.zzk
            java.lang.Object r3 = r6.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r0 = r3.longValue()
            long r4 = r4 - r0
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 30
            long r0 = r3.toMillis(r0)
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 <= 0) goto L24
            return r7
        L24:
            r3 = 0
            return r3
    }

    final /* synthetic */ java.lang.String zzb() throws java.lang.Exception {
            r2 = this;
            com.google.android.gms.common.internal.LibraryVersion r0 = com.google.android.gms.common.internal.LibraryVersion.getInstance()
            java.lang.String r1 = r2.zzi
            java.lang.String r0 = r0.getVersion(r1)
            return r0
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.mlkit_vision_pose_common.zzwa r3, com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r4, java.lang.String r5) {
            r2 = this;
            r3.zzb(r4)
            java.lang.String r4 = r3.zzd()
            com.google.android.gms.internal.mlkit_vision_pose_common.zztp r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zztp
            r0.<init>()
            java.lang.String r1 = r2.zzc
            r0.zzb(r1)
            java.lang.String r1 = r2.zzd
            r0.zzc(r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r1 = zzj()
            r0.zzh(r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.zzg(r1)
            r0.zzl(r4)
            r0.zzj(r5)
            com.google.android.gms.tasks.Task r4 = r2.zzh
            boolean r4 = r4.isSuccessful()
            if (r4 == 0) goto L39
            com.google.android.gms.tasks.Task r4 = r2.zzh
            java.lang.Object r4 = r4.getResult()
            java.lang.String r4 = (java.lang.String) r4
            goto L3f
        L39:
            com.google.mlkit.common.sdkinternal.SharedPrefManager r4 = r2.zzf
            java.lang.String r4 = r4.getMlSdkInstanceId()
        L3f:
            r0.zzi(r4)
            r4 = 10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.zzd(r4)
            int r4 = r2.zzj
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.zzk(r4)
            r3.zzc(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwb r4 = r2.zze
            r4.zza(r3)
            return
    }

    public final void zzd(com.google.android.gms.internal.mlkit_vision_pose_common.zzwa r2, com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r3) {
            r1 = this;
            java.lang.String r0 = r1.zzk()
            r1.zze(r2, r3, r0)
            return
    }

    public final void zze(com.google.android.gms.internal.mlkit_vision_pose_common.zzwa r3, com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r4, java.lang.String r5) {
            r2 = this;
            java.util.concurrent.Executor r0 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwf r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzwf
            r1.<init>(r2, r3, r4, r5)
            r0.execute(r1)
            return
    }

    final /* synthetic */ void zzf(com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r10, com.google.mlkit.vision.pose.internal.zzg r11) {
            r9 = this;
            java.util.Map r11 = r9.zzl
            java.lang.Object r11 = r11.get(r10)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbj r11 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzbj) r11
            if (r11 == 0) goto Ld5
            java.util.Set r0 = r11.zzo()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld0
            java.lang.Object r1 = r0.next()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List r3 = r11.zzc(r1)
            r2.<init>(r3)
            java.util.Collections.sort(r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzoo r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzoo
            r3.<init>()
            java.util.Iterator r4 = r2.iterator()
            r5 = 0
        L33:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L45
            java.lang.Object r7 = r4.next()
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            long r5 = r5 + r7
            goto L33
        L45:
            int r4 = r2.size()
            long r7 = (long) r4
            long r5 = r5 / r7
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            r3.zza(r4)
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            long r4 = zza(r2, r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.zzc(r4)
            r4 = 4634978072750194688(0x4052c00000000000, double:75.0)
            long r4 = zza(r2, r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.zzf(r4)
            r4 = 4632233691727265792(0x4049000000000000, double:50.0)
            long r4 = zza(r2, r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.zzd(r4)
            r4 = 4627730092099895296(0x4039000000000000, double:25.0)
            long r4 = zza(r2, r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.zzb(r4)
            r4 = 0
            long r4 = zza(r2, r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.zze(r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzoq r3 = r3.zzg()
            int r2 = r2.size()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzfc r1 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzfc) r1
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpq r4 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzpq
            r4.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpn r5 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpn.zzc
            r4.zzf(r5)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzez r5 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzez
            r5.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.zza(r2)
            r5.zzc(r1)
            r5.zzb(r3)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzfe r1 = r5.zze()
            r4.zze(r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwa r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwn.zzf(r4)
            java.lang.String r2 = r9.zzk()
            r9.zze(r1, r10, r2)
            goto L12
        Ld0:
            java.util.Map r11 = r9.zzl
            r11.remove(r10)
        Ld5:
            return
    }

    final /* synthetic */ void zzg(com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r8, java.lang.Object r9, long r10, com.google.mlkit.vision.pose.internal.zzg r12) {
            r7 = this;
            java.util.Map r0 = r7.zzl
            boolean r0 = r0.containsKey(r8)
            if (r0 != 0) goto L11
            java.util.Map r0 = r7.zzl
            com.google.android.gms.internal.mlkit_vision_pose_common.zzah r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzah.zzp()
            r0.put(r8, r1)
        L11:
            java.util.Map r0 = r7.zzl
            java.lang.Object r0 = r0.get(r8)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbj r0 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzbj) r0
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r0.zzm(r9, r10)
            long r3 = android.os.SystemClock.elapsedRealtime()
            r5 = 30
            r1 = r7
            r2 = r8
            boolean r8 = r1.zzl(r2, r3, r5)
            if (r8 != 0) goto L2f
            return
        L2f:
            java.util.Map r8 = r1.zzk
            java.lang.Long r9 = java.lang.Long.valueOf(r3)
            r8.put(r2, r9)
            r7.zzi(r2, r12)
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzh(com.google.mlkit.vision.pose.internal.zzf r7, com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r8) {
            r6 = this;
            long r2 = android.os.SystemClock.elapsedRealtime()
            r4 = 30
            r0 = r6
            r1 = r8
            boolean r8 = r0.zzl(r1, r2, r4)
            if (r8 != 0) goto Lf
            return
        Lf:
            java.util.Map r8 = r0.zzk
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r8.put(r1, r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwa r7 = r7.zza()
            java.lang.String r8 = r6.zzk()
            r6.zze(r7, r1, r8)
            return
    }

    public final void zzi(com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r3, com.google.mlkit.vision.pose.internal.zzg r4) {
            r2 = this;
            java.util.concurrent.Executor r0 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwg r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzwg
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return
    }
}
