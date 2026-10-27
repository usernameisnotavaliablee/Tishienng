package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzvi implements com.google.mlkit.acceleration.internal.AccelerationLogger {
    private static final java.lang.Object zza = null;

    @androidx.annotation.GuardedBy("gpuInfoLock")
    private static com.google.android.gms.internal.mlkit_vision_pose_common.zzud zzb;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzwk zzc;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzua zzd;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzup zze;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvi.zza = r0
            return
    }

    private zzvi(com.google.mlkit.acceleration.internal.PipelineId r2, com.google.mlkit.vision.pose.internal.zza r3) {
            r1 = this;
            java.lang.String r3 = "acceleration"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwk r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwv.zzb(r3)
            r1.<init>()
            r1.zzc = r3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzty r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzty
            r3.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.zzh(r0)
            java.lang.String r0 = android.os.Build.ID
            r3.zzf(r0)
            java.lang.String r0 = android.os.Build.BRAND
            r3.zza(r0)
            java.lang.String r0 = android.os.Build.DEVICE
            r3.zzb(r0)
            java.lang.String r0 = android.os.Build.HARDWARE
            r3.zzc(r0)
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r3.zzd(r0)
            java.lang.String r0 = android.os.Build.MODEL
            r3.zze(r0)
            java.lang.String r0 = android.os.Build.PRODUCT
            r3.zzg(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzua r3 = r3.zzi()
            r1.zzd = r3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzun r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzun
            r3.<init>()
            java.lang.String r0 = r2.getNamespace()
            r3.zzd(r0)
            java.lang.String r0 = r2.getName()
            r3.zzc(r0)
            java.lang.String r0 = r2.getClientLibraryName()
            r3.zza(r0)
            java.lang.String r2 = r2.getClientLibraryVersion()
            r3.zzb(r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzup r2 = r3.zze()
            r1.zze = r2
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_pose_common.zzvi zza(com.google.mlkit.acceleration.internal.PipelineId r1, com.google.mlkit.vision.pose.internal.zza r2) {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvi r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvi
            r0.<init>(r1, r2)
            return r0
    }

    private final synchronized com.google.android.gms.internal.mlkit_vision_pose_common.zzur zzb() {
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzur r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzur     // Catch: java.lang.Throwable -> La6
            r0.<init>()     // Catch: java.lang.Throwable -> La6
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> La6
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> La6
            r0.zzo(r1)     // Catch: java.lang.Throwable -> La6
            com.google.android.gms.internal.mlkit_vision_pose_common.zzua r1 = r6.zzd     // Catch: java.lang.Throwable -> La6
            r0.zzj(r1)     // Catch: java.lang.Throwable -> La6
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzvi.zza     // Catch: java.lang.Throwable -> La6
            monitor-enter(r1)     // Catch: java.lang.Throwable -> La6
            com.google.android.gms.internal.mlkit_vision_pose_common.zzud r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzvi.zzb     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L99
            com.google.android.gms.internal.mlkit_vision_pose_common.zzf r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzg.zza()     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzd -> L49
            com.google.android.gms.internal.mlkit_vision_pose_common.zzub r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzub     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzd -> L49
            r3.<init>()     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzd -> L49
            java.lang.String r4 = r2.zzd()     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzd -> L49
            r3.zzb(r4)     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzd -> L49
            java.lang.String r4 = r2.zzc()     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzd -> L49
            r3.zza(r4)     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzd -> L49
            java.lang.String r2 = r2.zze()     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzd -> L49
            r3.zzc(r2)     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzd -> L49
            com.google.android.gms.internal.mlkit_vision_pose_common.zzud r2 = r3.zzd()     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzd -> L49
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvi.zzb = r2     // Catch: java.lang.Throwable -> L45 java.lang.RuntimeException -> L47 com.google.android.gms.internal.mlkit_vision_pose_common.zzd -> L49
            goto L99
        L45:
            r0 = move-exception
            goto La8
        L47:
            r2 = move-exception
            goto L4a
        L49:
            r2 = move-exception
        L4a:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzub r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzub     // Catch: java.lang.Throwable -> L45
            r3.<init>()     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.mlkit_vision_pose_common.zzud r3 = r3.zzd()     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvi.zzb = r3     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "MlKitAccLogger"
            java.lang.String r4 = "Failed to get GpuInfo"
            zzc(r3, r4, r2)     // Catch: java.lang.Throwable -> L45
            boolean r3 = r2 instanceof com.google.android.gms.internal.mlkit_vision_pose_common.zzd     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L67
            com.google.android.gms.internal.mlkit_vision_pose_common.zzd r2 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzd) r2     // Catch: java.lang.Throwable -> L45
            int r2 = r2.zza()     // Catch: java.lang.Throwable -> L45
            goto L68
        L67:
            r2 = -1
        L68:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzur r3 = r6.zzb()     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuq r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzuq.zze     // Catch: java.lang.Throwable -> L45
            r3.zzh(r4)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.mlkit_vision_pose_common.zzue r4 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzue     // Catch: java.lang.Throwable -> L45
            r4.<init>()     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuf r5 = com.google.android.gms.internal.mlkit_vision_pose_common.zzuf.zzd     // Catch: java.lang.Throwable -> L45
            r4.zzb(r5)     // Catch: java.lang.Throwable -> L45
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L45
            r4.zza(r2)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuh r2 = r4.zzd()     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzbd.zzh(r2)     // Catch: java.lang.Throwable -> L45
            r3.zzi(r2)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuu r2 = r3.zzr()     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzbd.zzh(r2)     // Catch: java.lang.Throwable -> L45
            r3 = 0
            r6.zzd(r3, r2)     // Catch: java.lang.Throwable -> L45
        L99:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzud r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzvi.zzb     // Catch: java.lang.Throwable -> L45
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            r0.zzl(r2)     // Catch: java.lang.Throwable -> La6
            com.google.android.gms.internal.mlkit_vision_pose_common.zzup r1 = r6.zze     // Catch: java.lang.Throwable -> La6
            r0.zzm(r1)     // Catch: java.lang.Throwable -> La6
            monitor-exit(r6)
            return r0
        La6:
            r0 = move-exception
            goto Laa
        La8:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> La6
        Laa:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La6
            throw r0
    }

    private static void zzc(java.lang.String r0, java.lang.String r1, @androidx.annotation.Nullable java.lang.Throwable r2) {
            java.lang.String r0 = "MlKitAccLogger"
            r1 = 3
            android.util.Log.isLoggable(r0, r1)
            return
    }

    private final void zzd(@androidx.annotation.Nullable com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r3, com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r4) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpq r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzpq
            r0.<init>()
            if (r3 == 0) goto L1c
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r3 = (com.google.mlkit.vision.pose.PoseDetectorOptionsBase) r3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsb r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzsb
            r1.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsk r3 = r3.zzb()
            r1.zzc(r3)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsd r3 = r1.zzi()
            r0.zzh(r3)
        L1c:
            r0.zzi(r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwk r3 = r2.zzc
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwa r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwn.zzf(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpp.zzbb
            r3.zzd(r4, r0)
            return
    }

    @Override // com.google.mlkit.acceleration.internal.AccelerationLogger
    public final void logAccelerationInfraError(com.google.mlkit.acceleration.internal.AccelerationInfraException r5) {
            r4 = this;
            java.lang.String r0 = "MlKitAccLogger"
            java.lang.String r1 = "logAccelerationInfraError"
            zzc(r0, r1, r5)
            int r0 = r5.getErrorType()
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L24
            com.google.android.gms.internal.mlkit_vision_pose_common.zzur r5 = r4.zzb()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuq r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzuq.zzd
            r5.zzh(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuu r5 = r5.zzr()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r5 = com.google.android.gms.internal.mlkit_vision_pose_common.zzbd.zzh(r5)
            r4.zzd(r2, r5)
            return
        L24:
            int r0 = r5.getErrorType()
            r1 = 2
            if (r0 != r1) goto L5f
            com.google.android.gms.internal.mlkit_vision_pose_common.zzur r0 = r4.zzb()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuq r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzuq.zze
            r0.zzh(r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzue r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzue
            r1.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuf r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zzuf.zzd
            r1.zzb(r3)
            int r5 = r5.getErrorCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.zza(r5)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuh r5 = r1.zzd()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r5 = com.google.android.gms.internal.mlkit_vision_pose_common.zzbd.zzh(r5)
            r0.zzi(r5)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuu r5 = r0.zzr()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r5 = com.google.android.gms.internal.mlkit_vision_pose_common.zzbd.zzh(r5)
            r4.zzd(r2, r5)
        L5f:
            return
    }

    @Override // com.google.mlkit.acceleration.internal.AccelerationLogger
    public final void logBenchmarkPipelineError(com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r4, @androidx.annotation.Nullable java.lang.Throwable r5) {
            r3 = this;
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "MlKitAccLogger"
            java.lang.String r2 = "logBenchmarkPipelineError for options: "
            java.lang.String r0 = r2.concat(r0)
            zzc(r1, r0, r5)
            java.lang.String r0 = r4.getRunConfigName()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
        L19:
            if (r5 == 0) goto L31
            boolean r1 = r5 instanceof com.google.mlkit.common.MlKitException
            if (r1 == 0) goto L26
            com.google.mlkit.common.MlKitException r5 = (com.google.mlkit.common.MlKitException) r5
            int r5 = r5.getErrorCode()
            goto L32
        L26:
            boolean r1 = r5 instanceof java.util.concurrent.TimeoutException
            if (r1 == 0) goto L2c
            r5 = -2
            goto L32
        L2c:
            java.lang.Throwable r5 = r5.getCause()
            goto L19
        L31:
            r5 = -1
        L32:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzur r1 = r3.zzb()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuk r2 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzuk
            r2.<init>()
            r2.zza(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzum r0 = r2.zzb()
            r1.zzg(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuq r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzuq.zzc
            r1.zzh(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzue r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzue
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuf r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzuf.zzb
            r0.zzb(r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.zza(r5)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuh r5 = r0.zzd()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r5 = com.google.android.gms.internal.mlkit_vision_pose_common.zzbd.zzh(r5)
            r1.zzi(r5)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuu r5 = r1.zzr()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r5 = com.google.android.gms.internal.mlkit_vision_pose_common.zzbd.zzh(r5)
            r3.zzd(r4, r5)
            return
    }

    @Override // com.google.mlkit.acceleration.internal.AccelerationLogger
    public final void logBenchmarkResult(com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r6, com.google.mlkit.acceleration.internal.MiniBenchmarkResult r7) {
            r5 = this;
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "logBenchmarkResult for options: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ". Result="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "MlKitAccLogger"
            r2 = 0
            zzc(r1, r0, r2)
            java.lang.String r0 = r6.getRunConfigName()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r7.getStabilityStatus()
            if (r1 != 0) goto L38
            return
        L38:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzur r2 = r5.zzb()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuk r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzuk
            r3.<init>()
            r3.zza(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzum r0 = r3.zzb()
            r2.zzg(r0)
            r0 = 1
            if (r1 != r0) goto La2
            com.google.android.gms.internal.mlkit_vision_pose_common.zzus r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzus.zzb
            r2.zzn(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuq r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzuq.zzb
            r2.zzh(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzva r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzva
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvb r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzvb
            r1.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuw r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzuw
            r3.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzux r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzux.zzb
            r3.zza(r4)
            float r4 = r7.getCorrectnessScore()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r3.zzb(r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuz r3 = r3.zzd()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zzbd.zzh(r3)
            r1.zzb(r3)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvd r1 = r1.zzc()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzbd.zzh(r1)
            r0.zzb(r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvf r0 = r0.zzc()
            r2.zzp(r0)
            int r7 = r7.getRunLatencyMs()
            int r7 = r7 * 1000
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2.zzk(r7)
            goto Laa
        La2:
            r7 = 2
            if (r1 != r7) goto Laa
            com.google.android.gms.internal.mlkit_vision_pose_common.zzus r7 = com.google.android.gms.internal.mlkit_vision_pose_common.zzus.zzc
            r2.zzn(r7)
        Laa:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuu r7 = r2.zzr()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r7 = com.google.android.gms.internal.mlkit_vision_pose_common.zzbd.zzh(r7)
            r5.zzd(r6, r7)
            return
    }
}
