package com.google.android.gms.internal.mlkit_vision_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzmj {

    @androidx.annotation.Nullable
    private static com.google.android.gms.internal.mlkit_vision_common.zzp zza;
    private static final com.google.android.gms.internal.mlkit_vision_common.zzr zzb = null;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.mlkit_vision_common.zzmc zze;
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
            com.google.android.gms.internal.mlkit_vision_common.zzr r0 = com.google.android.gms.internal.mlkit_vision_common.zzr.zzc(r0, r1)
            com.google.android.gms.internal.mlkit_vision_common.zzmj.zzb = r0
            return
    }

    public zzmj(android.content.Context r2, com.google.mlkit.common.sdkinternal.SharedPrefManager r3, com.google.android.gms.internal.mlkit_vision_common.zzmc r4, java.lang.String r5) {
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
            com.google.android.gms.internal.mlkit_vision_common.zzmw.zza()
            r1.zzi = r5
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r4 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance()
            com.google.android.gms.internal.mlkit_vision_common.zzmg r0 = new com.google.android.gms.internal.mlkit_vision_common.zzmg
            r0.<init>(r1)
            com.google.android.gms.tasks.Task r4 = r4.scheduleCallable(r0)
            r1.zzg = r4
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r4 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance()
            r3.getClass()
            com.google.android.gms.internal.mlkit_vision_common.zzmh r0 = new com.google.android.gms.internal.mlkit_vision_common.zzmh
            r0.<init>(r3)
            com.google.android.gms.tasks.Task r3 = r4.scheduleCallable(r0)
            r1.zzh = r3
            com.google.android.gms.internal.mlkit_vision_common.zzr r3 = com.google.android.gms.internal.mlkit_vision_common.zzmj.zzb
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

    @androidx.annotation.NonNull
    private static synchronized com.google.android.gms.internal.mlkit_vision_common.zzp zzd() {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_common.zzmj> r0 = com.google.android.gms.internal.mlkit_vision_common.zzmj.class
            monitor-enter(r0)
            com.google.android.gms.internal.mlkit_vision_common.zzp r1 = com.google.android.gms.internal.mlkit_vision_common.zzmj.zza     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return r1
        L9:
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()     // Catch: java.lang.Throwable -> L2f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L2f
            androidx.core.os.LocaleListCompat r1 = androidx.core.os.ConfigurationCompat.getLocales(r1)     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.mlkit_vision_common.zzm r2 = new com.google.android.gms.internal.mlkit_vision_common.zzm     // Catch: java.lang.Throwable -> L2f
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
            com.google.android.gms.internal.mlkit_vision_common.zzp r1 = r2.zzc()     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.mlkit_vision_common.zzmj.zza = r1     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)
            return r1
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r1
    }

    final /* synthetic */ java.lang.String zza() throws java.lang.Exception {
            r2 = this;
            com.google.android.gms.common.internal.LibraryVersion r0 = com.google.android.gms.common.internal.LibraryVersion.getInstance()
            java.lang.String r1 = r2.zzi
            java.lang.String r0 = r0.getVersion(r1)
            return r0
    }

    final /* synthetic */ void zzb(com.google.android.gms.internal.mlkit_vision_common.zzmb r3, com.google.android.gms.internal.mlkit_vision_common.zziv r4, java.lang.String r5) {
            r2 = this;
            r3.zza(r4)
            java.lang.String r4 = r3.zzc()
            com.google.android.gms.internal.mlkit_vision_common.zzky r0 = new com.google.android.gms.internal.mlkit_vision_common.zzky
            r0.<init>()
            java.lang.String r1 = r2.zzc
            r0.zzb(r1)
            java.lang.String r1 = r2.zzd
            r0.zzc(r1)
            com.google.android.gms.internal.mlkit_vision_common.zzp r1 = zzd()
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
            r3.zzb(r0)
            com.google.android.gms.internal.mlkit_vision_common.zzmc r4 = r2.zze
            r4.zza(r3)
            return
    }

    @androidx.annotation.WorkerThread
    public final void zzc(com.google.android.gms.internal.mlkit_vision_common.zzmt r10, com.google.android.gms.internal.mlkit_vision_common.zziv r11) {
            r9 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.util.Map r2 = r9.zzk
            java.lang.Object r2 = r2.get(r11)
            if (r2 != 0) goto Ld
            goto L28
        Ld:
            java.util.Map r2 = r9.zzk
            java.lang.Object r2 = r2.get(r11)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r2 = r0 - r2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            r5 = 30
            long r4 = r4.toMillis(r5)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L28
            return
        L28:
            java.util.Map r2 = r9.zzk
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r11, r0)
            int r0 = r10.zza
            int r1 = r10.zzb
            int r2 = r10.zzc
            int r3 = r10.zzd
            int r4 = r10.zze
            long r5 = r10.zzf
            int r10 = r10.zzg
            com.google.android.gms.internal.mlkit_vision_common.zzin r7 = new com.google.android.gms.internal.mlkit_vision_common.zzin
            r7.<init>()
            r8 = -1
            if (r0 == r8) goto L67
            r8 = 35
            if (r0 == r8) goto L64
            r8 = 842094169(0x32315659, float:1.0322389E-8)
            if (r0 == r8) goto L61
            r8 = 16
            if (r0 == r8) goto L5e
            r8 = 17
            if (r0 == r8) goto L5b
            com.google.android.gms.internal.mlkit_vision_common.zzii r0 = com.google.android.gms.internal.mlkit_vision_common.zzii.zza
            goto L69
        L5b:
            com.google.android.gms.internal.mlkit_vision_common.zzii r0 = com.google.android.gms.internal.mlkit_vision_common.zzii.zzc
            goto L69
        L5e:
            com.google.android.gms.internal.mlkit_vision_common.zzii r0 = com.google.android.gms.internal.mlkit_vision_common.zzii.zzb
            goto L69
        L61:
            com.google.android.gms.internal.mlkit_vision_common.zzii r0 = com.google.android.gms.internal.mlkit_vision_common.zzii.zzd
            goto L69
        L64:
            com.google.android.gms.internal.mlkit_vision_common.zzii r0 = com.google.android.gms.internal.mlkit_vision_common.zzii.zze
            goto L69
        L67:
            com.google.android.gms.internal.mlkit_vision_common.zzii r0 = com.google.android.gms.internal.mlkit_vision_common.zzii.zzg
        L69:
            r7.zzd(r0)
            r0 = 1
            if (r1 == r0) goto L84
            r0 = 2
            if (r1 == r0) goto L81
            r0 = 3
            if (r1 == r0) goto L7e
            r0 = 4
            if (r1 == r0) goto L7b
            com.google.android.gms.internal.mlkit_vision_common.zzio r0 = com.google.android.gms.internal.mlkit_vision_common.zzio.zzf
            goto L86
        L7b:
            com.google.android.gms.internal.mlkit_vision_common.zzio r0 = com.google.android.gms.internal.mlkit_vision_common.zzio.zze
            goto L86
        L7e:
            com.google.android.gms.internal.mlkit_vision_common.zzio r0 = com.google.android.gms.internal.mlkit_vision_common.zzio.zzd
            goto L86
        L81:
            com.google.android.gms.internal.mlkit_vision_common.zzio r0 = com.google.android.gms.internal.mlkit_vision_common.zzio.zzc
            goto L86
        L84:
            com.google.android.gms.internal.mlkit_vision_common.zzio r0 = com.google.android.gms.internal.mlkit_vision_common.zzio.zzb
        L86:
            r7.zzf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r7.zzc(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r7.zze(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r7.zzg(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r7.zzb(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r7.zzh(r10)
            com.google.android.gms.internal.mlkit_vision_common.zziq r10 = r7.zzj()
            com.google.android.gms.internal.mlkit_vision_common.zziw r0 = new com.google.android.gms.internal.mlkit_vision_common.zziw
            r0.<init>()
            r0.zzd(r10)
            com.google.android.gms.internal.mlkit_vision_common.zzmb r10 = com.google.android.gms.internal.mlkit_vision_common.zzmk.zze(r0)
            com.google.android.gms.tasks.Task r0 = r9.zzg
            boolean r0 = r0.isSuccessful()
            if (r0 == 0) goto Lcd
            com.google.android.gms.tasks.Task r0 = r9.zzg
            java.lang.Object r0 = r0.getResult()
            java.lang.String r0 = (java.lang.String) r0
            goto Ld7
        Lcd:
            com.google.android.gms.common.internal.LibraryVersion r0 = com.google.android.gms.common.internal.LibraryVersion.getInstance()
            java.lang.String r1 = r9.zzi
            java.lang.String r0 = r0.getVersion(r1)
        Ld7:
            java.util.concurrent.Executor r1 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor()
            com.google.android.gms.internal.mlkit_vision_common.zzmi r2 = new com.google.android.gms.internal.mlkit_vision_common.zzmi
            r2.<init>(r9, r10, r11, r0)
            r1.execute(r2)
            return
    }
}
