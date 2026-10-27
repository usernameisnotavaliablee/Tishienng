package com.google.mlkit.acceleration.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzm {
    private static final java.lang.Object zza = null;

    @androidx.annotation.GuardedBy("gpuVersionLock")
    private static java.lang.String zzb;
    private final com.google.mlkit.acceleration.internal.PipelineId zzc;
    private final com.google.mlkit.acceleration.internal.AccelerationLogger zzd;
    private final com.google.mlkit.acceleration.internal.zzf zze;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.mlkit.acceleration.internal.zzm.zza = r0
            return
    }

    zzm(android.content.Context r4, com.google.mlkit.acceleration.internal.PipelineId r5, com.google.mlkit.acceleration.internal.AccelerationLogger r6) {
            r3 = this;
            r3.<init>()
            r3.zzc = r5
            r3.zzd = r6
            com.google.mlkit.acceleration.internal.zzf r6 = new com.google.mlkit.acceleration.internal.zzf
            java.lang.String r0 = r5.getNamespace()
            java.lang.String r5 = r5.getName()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r5
            java.lang.String r5 = "com.google.mlkit.MiniBenchmarkPersistence.%s.%s"
            java.lang.String r5 = java.lang.String.format(r5, r1)
            r6.<init>(r4, r5)
            r3.zze = r6
            return
    }

    @androidx.annotation.VisibleForTesting
    static final java.lang.String zzg() throws com.google.mlkit.acceleration.internal.AccelerationInfraException {
            java.lang.Object r0 = com.google.mlkit.acceleration.internal.zzm.zza
            monitor-enter(r0)
            java.lang.String r1 = com.google.mlkit.acceleration.internal.zzm.zzb     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L44
            com.google.android.gms.internal.mlkit_acceleration.zzg r1 = com.google.android.gms.internal.mlkit_acceleration.zzh.zza()     // Catch: java.lang.Throwable -> L36 java.lang.RuntimeException -> L38 com.google.android.gms.internal.mlkit_acceleration.zze -> L3a
            java.lang.String r2 = r1.zzd()     // Catch: java.lang.Throwable -> L36 java.lang.RuntimeException -> L38 com.google.android.gms.internal.mlkit_acceleration.zze -> L3a
            java.lang.String r3 = r1.zzc()     // Catch: java.lang.Throwable -> L36 java.lang.RuntimeException -> L38 com.google.android.gms.internal.mlkit_acceleration.zze -> L3a
            java.lang.String r1 = r1.zze()     // Catch: java.lang.Throwable -> L36 java.lang.RuntimeException -> L38 com.google.android.gms.internal.mlkit_acceleration.zze -> L3a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36 java.lang.RuntimeException -> L38 com.google.android.gms.internal.mlkit_acceleration.zze -> L3a
            r4.<init>()     // Catch: java.lang.Throwable -> L36 java.lang.RuntimeException -> L38 com.google.android.gms.internal.mlkit_acceleration.zze -> L3a
            r4.append(r2)     // Catch: java.lang.Throwable -> L36 java.lang.RuntimeException -> L38 com.google.android.gms.internal.mlkit_acceleration.zze -> L3a
            java.lang.String r2 = ";"
            r4.append(r2)     // Catch: java.lang.Throwable -> L36 java.lang.RuntimeException -> L38 com.google.android.gms.internal.mlkit_acceleration.zze -> L3a
            r4.append(r3)     // Catch: java.lang.Throwable -> L36 java.lang.RuntimeException -> L38 com.google.android.gms.internal.mlkit_acceleration.zze -> L3a
            java.lang.String r2 = ";"
            r4.append(r2)     // Catch: java.lang.Throwable -> L36 java.lang.RuntimeException -> L38 com.google.android.gms.internal.mlkit_acceleration.zze -> L3a
            r4.append(r1)     // Catch: java.lang.Throwable -> L36 java.lang.RuntimeException -> L38 com.google.android.gms.internal.mlkit_acceleration.zze -> L3a
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L36 java.lang.RuntimeException -> L38 com.google.android.gms.internal.mlkit_acceleration.zze -> L3a
            com.google.mlkit.acceleration.internal.zzm.zzb = r1     // Catch: java.lang.Throwable -> L36 java.lang.RuntimeException -> L38 com.google.android.gms.internal.mlkit_acceleration.zze -> L3a
            goto L44
        L36:
            r1 = move-exception
            goto L48
        L38:
            r1 = move-exception
            goto L3b
        L3a:
            r1 = move-exception
        L3b:
            java.lang.String r2 = ""
            com.google.mlkit.acceleration.internal.zzm.zzb = r2     // Catch: java.lang.Throwable -> L36
            com.google.mlkit.acceleration.internal.AccelerationInfraException r1 = com.google.mlkit.acceleration.internal.AccelerationInfraException.zza(r1)     // Catch: java.lang.Throwable -> L36
            throw r1     // Catch: java.lang.Throwable -> L36
        L44:
            java.lang.String r1 = com.google.mlkit.acceleration.internal.zzm.zzb     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            return r1
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r1
    }

    @androidx.annotation.Nullable
    private final com.google.mlkit.acceleration.internal.zzs zzh() {
            r2 = this;
            com.google.mlkit.acceleration.internal.zzs r0 = com.google.mlkit.acceleration.internal.zzt.zzb()     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> L2d
            com.google.mlkit.acceleration.internal.PipelineId r1 = r2.zzc     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> L2d
            java.lang.String r1 = r1.getClientLibraryName()     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> L2d
            r0.zzd(r1)     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> L2d
            com.google.mlkit.acceleration.internal.PipelineId r1 = r2.zzc     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> L2d
            java.lang.String r1 = r1.getClientLibraryVersion()     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> L2d
            r0.zze(r1)     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> L2d
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> L2d
            r0.zzc(r1)     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> L2d
            java.lang.String r1 = android.os.Build.HARDWARE     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> L2d
            r0.zzf(r1)     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> L2d
            java.lang.String r1 = android.os.Build.FINGERPRINT     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> L2d
            r0.zzh(r1)     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> L2d
            java.lang.String r1 = zzg()     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> L2d
            r0.zzg(r1)     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> L2d
            return r0
        L2d:
            r0 = move-exception
            com.google.mlkit.acceleration.internal.AccelerationLogger r1 = r2.zzd
            r1.logAccelerationInfraError(r0)
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    private final com.google.mlkit.acceleration.internal.zzt zzi() {
            r5 = this;
            com.google.mlkit.acceleration.internal.zzf r0 = r5.zze
            java.io.File r0 = r0.zza()
            r1 = 0
            if (r0 != 0) goto L15
            com.google.mlkit.acceleration.internal.AccelerationLogger r0 = r5.zzd
            com.google.mlkit.acceleration.internal.AccelerationInfraException r2 = new com.google.mlkit.acceleration.internal.AccelerationInfraException
            r3 = 1
            r2.<init>(r3, r1)
            r0.logAccelerationInfraError(r2)
            return r1
        L15:
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "Reading benchmark result from file: "
            java.lang.String r2 = r3.concat(r2)
            java.lang.String r3 = "MiniBenchPersistence"
            zzl(r3, r2)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L34
            java.lang.String r0 = "Results file hasn't been created"
            zzl(r3, r0)
            com.google.mlkit.acceleration.internal.zzt r0 = com.google.mlkit.acceleration.internal.zzt.zzd()
            return r0
        L34:
            com.google.mlkit.acceleration.internal.zzf r2 = r5.zze
            byte[] r2 = r2.zze()
            if (r2 == 0) goto Lbe
            com.google.android.gms.internal.mlkit_acceleration.zzdi r1 = com.google.android.gms.internal.mlkit_acceleration.zzdi.zza()     // Catch: com.google.android.gms.internal.mlkit_acceleration.zzed -> Lb0
            com.google.mlkit.acceleration.internal.zzt r1 = com.google.mlkit.acceleration.internal.zzt.zze(r2, r1)     // Catch: com.google.android.gms.internal.mlkit_acceleration.zzed -> Lb0
            com.google.mlkit.acceleration.internal.PipelineId r2 = r5.zzc     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> La0
            java.lang.String r2 = r2.getClientLibraryName()     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> La0
            java.lang.String r4 = r1.zzf()     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> La0
            boolean r2 = r2.equals(r4)     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> La0
            if (r2 == 0) goto La6
            com.google.mlkit.acceleration.internal.PipelineId r2 = r5.zzc     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> La0
            java.lang.String r2 = r2.getClientLibraryVersion()     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> La0
            java.lang.String r4 = r1.zzg()     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> La0
            boolean r2 = r2.equals(r4)     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> La0
            if (r2 == 0) goto La6
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> La0
            int r4 = r1.zza()     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> La0
            if (r2 != r4) goto La6
            java.lang.String r2 = android.os.Build.HARDWARE     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> La0
            java.lang.String r4 = r1.zzh()     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> La0
            boolean r2 = r2.equals(r4)     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> La0
            if (r2 == 0) goto La6
            java.lang.String r2 = android.os.Build.FINGERPRINT     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> La0
            java.lang.String r4 = r1.zzj()     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> La0
            boolean r2 = r2.equals(r4)     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> La0
            if (r2 == 0) goto La6
            java.lang.String r2 = zzg()     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> La0
            java.lang.String r4 = r1.zzi()     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> La0
            boolean r2 = r2.equals(r4)     // Catch: com.google.mlkit.acceleration.internal.AccelerationInfraException -> La0
            if (r2 == 0) goto La6
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Succeeded reading valid benchmark results from file: "
            java.lang.String r0 = r2.concat(r0)
            zzl(r3, r0)
            return r1
        La0:
            r0 = move-exception
            com.google.mlkit.acceleration.internal.AccelerationLogger r1 = r5.zzd
            r1.logAccelerationInfraError(r0)
        La6:
            java.lang.String r0 = "Existing results are not valid any more"
            zzl(r3, r0)
            com.google.mlkit.acceleration.internal.zzt r0 = com.google.mlkit.acceleration.internal.zzt.zzd()
            return r0
        Lb0:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Failed to parse proto from file: "
            r1.concat(r0)
            com.google.mlkit.acceleration.internal.zzt r0 = com.google.mlkit.acceleration.internal.zzt.zzd()
            return r0
        Lbe:
            return r1
    }

    private static java.lang.String zzj(com.google.mlkit.acceleration.internal.zzq r1) {
            java.lang.String r0 = r1.zzg()
            java.lang.String r1 = r1.zzf()
            java.lang.String r1 = zzk(r0, r1)
            return r1
    }

    private static java.lang.String zzk(java.lang.String r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private static void zzl(java.lang.String r0, java.lang.String r1) {
            java.lang.String r0 = "MiniBenchPersistence"
            r1 = 3
            android.util.Log.isLoggable(r0, r1)
            return
    }

    private static final java.lang.String zzm(com.google.mlkit.acceleration.internal.RunConfig r1) {
            java.lang.String r0 = r1.zze()
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r1 = r1.zzb()
            java.lang.String r1 = r1.encode()
            java.lang.String r1 = zzk(r0, r1)
            return r1
    }

    private static final java.util.Map zzn(com.google.mlkit.acceleration.internal.zzt r4) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.List r4 = r4.zzk()
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r4.next()
            com.google.mlkit.acceleration.internal.zzq r1 = (com.google.mlkit.acceleration.internal.zzq) r1
            int r2 = r1.zzc()
            if (r2 == 0) goto Ld
            com.google.mlkit.acceleration.internal.zzb r2 = new com.google.mlkit.acceleration.internal.zzb
            r2.<init>()
            boolean r3 = r1.zzn()
            r2.zzb(r3)
            int r3 = r1.zzc()
            r2.zzd(r3)
            float r3 = r1.zza()
            r2.zza(r3)
            int r3 = r1.zzb()
            r2.zzc(r3)
            com.google.mlkit.acceleration.internal.MiniBenchmarkResult r2 = r2.zze()
            java.lang.String r1 = zzj(r1)
            r0.put(r1, r2)
            goto Ld
        L4c:
            java.lang.String r4 = r0.toString()
            java.lang.String r1 = "getResultIdToCompletedResultMap: "
            java.lang.String r4 = r1.concat(r4)
            java.lang.String r1 = "MiniBenchPersistence"
            zzl(r1, r4)
            return r0
    }

    final java.util.List zza(com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r5, java.util.List r6) {
            r4 = this;
            java.lang.String r0 = "MiniBenchPersistence"
            java.lang.String r1 = "getRunConfigsNeedingMiniBenchmark"
            zzl(r0, r1)
            com.google.mlkit.acceleration.internal.zzt r0 = r4.zzi()
            if (r0 != 0) goto L13
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            return r5
        L13:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map r0 = zzn(r0)
            java.util.Iterator r6 = r6.iterator()
        L20:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            r3 = 1
            java.lang.Object r3 = r5.cloneWithRunConfigAssigned(r2, r3)
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r3 = (com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions) r3
            java.lang.String r3 = r3.encode()
            java.lang.String r3 = zzk(r2, r3)
            boolean r3 = r0.containsKey(r3)
            if (r3 != 0) goto L20
            r1.add(r2)
            goto L20
        L45:
            return r1
    }

    final java.util.List zzb(java.util.List r5) {
            r4 = this;
            java.lang.String r0 = "MiniBenchPersistence"
            java.lang.String r1 = "readMiniBenchmarkResults"
            zzl(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.mlkit.acceleration.internal.zzt r1 = r4.zzi()
            if (r1 != 0) goto L2e
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r5.next()
            com.google.mlkit.acceleration.internal.RunConfig r1 = (com.google.mlkit.acceleration.internal.RunConfig) r1
            com.google.mlkit.acceleration.internal.RunConfig$Builder r1 = r1.zzd()
            com.google.mlkit.acceleration.internal.RunConfig r1 = r1.build()
            r0.add(r1)
            goto L16
        L2e:
            java.util.Map r1 = zzn(r1)
            java.util.Iterator r5 = r5.iterator()
        L36:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r5.next()
            com.google.mlkit.acceleration.internal.RunConfig r2 = (com.google.mlkit.acceleration.internal.RunConfig) r2
            java.lang.String r3 = zzm(r2)
            com.google.mlkit.acceleration.internal.RunConfig$Builder r2 = r2.zzd()
            java.lang.Object r3 = r1.get(r3)
            com.google.mlkit.acceleration.internal.MiniBenchmarkResult r3 = (com.google.mlkit.acceleration.internal.MiniBenchmarkResult) r3
            r2.setMiniBenchmarkResult(r3)
            com.google.mlkit.acceleration.internal.RunConfig r2 = r2.build()
            r0.add(r2)
            goto L36
        L5b:
            return r0
    }

    final void zzc() {
            r5 = this;
            java.lang.String r0 = "MiniBenchPersistence"
            com.google.mlkit.acceleration.internal.zzf r1 = r5.zze
            r1.zzb()
            java.lang.String r1 = "clearResultsWithUnknownStability"
            zzl(r0, r1)     // Catch: java.lang.Throwable -> L45
            com.google.mlkit.acceleration.internal.zzt r1 = r5.zzi()     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L13
            goto L5a
        L13:
            com.google.mlkit.acceleration.internal.zzs r2 = r5.zzh()     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L5a
            java.util.List r1 = r1.zzk()     // Catch: java.lang.Throwable -> L45
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L45
        L21:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L45
            com.google.mlkit.acceleration.internal.zzq r3 = (com.google.mlkit.acceleration.internal.zzq) r3     // Catch: java.lang.Throwable -> L45
            int r4 = r3.zzc()     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto L47
            java.lang.String r3 = r3.zzg()     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = "Benchmark result cleared for "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = r4.concat(r3)     // Catch: java.lang.Throwable -> L45
            zzl(r0, r3)     // Catch: java.lang.Throwable -> L45
            goto L21
        L45:
            r0 = move-exception
            goto L60
        L47:
            r2.zzb(r3)     // Catch: java.lang.Throwable -> L45
            goto L21
        L4b:
            com.google.mlkit.acceleration.internal.zzf r0 = r5.zze     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.mlkit_acceleration.zzdv r1 = r2.zzl()     // Catch: java.lang.Throwable -> L45
            com.google.mlkit.acceleration.internal.zzt r1 = (com.google.mlkit.acceleration.internal.zzt) r1     // Catch: java.lang.Throwable -> L45
            byte[] r1 = r1.zzv()     // Catch: java.lang.Throwable -> L45
            r0.zzc(r1)     // Catch: java.lang.Throwable -> L45
        L5a:
            com.google.mlkit.acceleration.internal.zzf r0 = r5.zze
            r0.zzd()
            return
        L60:
            com.google.mlkit.acceleration.internal.zzf r1 = r5.zze
            r1.zzd()
            throw r0
    }

    final void zzd(java.util.List r5) {
            r4 = this;
            com.google.mlkit.acceleration.internal.zzf r0 = r4.zze
            r0.zzb()
            java.lang.String r0 = "MiniBenchPersistence"
            java.lang.String r1 = "markMiniBenchmarkResultsAsLogged"
            zzl(r0, r1)     // Catch: java.lang.Throwable -> L35
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L35
        L15:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L37
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L35
            com.google.mlkit.acceleration.internal.RunConfig r1 = (com.google.mlkit.acceleration.internal.RunConfig) r1     // Catch: java.lang.Throwable -> L35
            com.google.mlkit.acceleration.internal.MiniBenchmarkResult r2 = r1.zzc()     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L15
            boolean r2 = r2.zza()     // Catch: java.lang.Throwable -> L35
            if (r2 != 0) goto L15
            java.lang.String r1 = zzm(r1)     // Catch: java.lang.Throwable -> L35
            r0.add(r1)     // Catch: java.lang.Throwable -> L35
            goto L15
        L35:
            r5 = move-exception
            goto L8f
        L37:
            boolean r5 = r0.isEmpty()     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L3e
            goto L89
        L3e:
            com.google.mlkit.acceleration.internal.zzt r5 = r4.zzi()     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L89
            com.google.mlkit.acceleration.internal.zzs r1 = r4.zzh()     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L89
            java.util.List r5 = r5.zzk()     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L35
        L52:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L35
            com.google.mlkit.acceleration.internal.zzq r2 = (com.google.mlkit.acceleration.internal.zzq) r2     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = zzj(r2)     // Catch: java.lang.Throwable -> L35
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L76
            com.google.android.gms.internal.mlkit_acceleration.zzdr r2 = r2.zzz()     // Catch: java.lang.Throwable -> L35
            com.google.mlkit.acceleration.internal.zzp r2 = (com.google.mlkit.acceleration.internal.zzp) r2     // Catch: java.lang.Throwable -> L35
            r3 = 1
            r2.zzb(r3)     // Catch: java.lang.Throwable -> L35
            r1.zza(r2)     // Catch: java.lang.Throwable -> L35
            goto L52
        L76:
            r1.zzb(r2)     // Catch: java.lang.Throwable -> L35
            goto L52
        L7a:
            com.google.mlkit.acceleration.internal.zzf r5 = r4.zze     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.mlkit_acceleration.zzdv r0 = r1.zzl()     // Catch: java.lang.Throwable -> L35
            com.google.mlkit.acceleration.internal.zzt r0 = (com.google.mlkit.acceleration.internal.zzt) r0     // Catch: java.lang.Throwable -> L35
            byte[] r0 = r0.zzv()     // Catch: java.lang.Throwable -> L35
            r5.zzc(r0)     // Catch: java.lang.Throwable -> L35
        L89:
            com.google.mlkit.acceleration.internal.zzf r5 = r4.zze
            r5.zzd()
            return
        L8f:
            com.google.mlkit.acceleration.internal.zzf r0 = r4.zze
            r0.zzd()
            throw r5
    }

    final void zze() {
            r6 = this;
            java.lang.String r0 = "MiniBenchPersistence"
            com.google.mlkit.acceleration.internal.zzf r1 = r6.zze
            r1.zzb()
            java.lang.String r1 = "markUnknownResultsAsUnstable"
            zzl(r0, r1)     // Catch: java.lang.Throwable -> L52
            com.google.mlkit.acceleration.internal.zzt r1 = r6.zzi()     // Catch: java.lang.Throwable -> L52
            if (r1 != 0) goto L13
            goto L67
        L13:
            com.google.mlkit.acceleration.internal.zzs r2 = r6.zzh()     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L67
            java.util.List r1 = r1.zzk()     // Catch: java.lang.Throwable -> L52
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L52
        L21:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L58
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L52
            com.google.mlkit.acceleration.internal.zzq r3 = (com.google.mlkit.acceleration.internal.zzq) r3     // Catch: java.lang.Throwable -> L52
            int r4 = r3.zzc()     // Catch: java.lang.Throwable -> L52
            if (r4 != 0) goto L54
            com.google.android.gms.internal.mlkit_acceleration.zzdr r4 = r3.zzz()     // Catch: java.lang.Throwable -> L52
            com.google.mlkit.acceleration.internal.zzp r4 = (com.google.mlkit.acceleration.internal.zzp) r4     // Catch: java.lang.Throwable -> L52
            r5 = 2
            r4.zzf(r5)     // Catch: java.lang.Throwable -> L52
            r2.zza(r4)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = r3.zzg()     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = "Mark UNKNOWN result as UNSTABLE: "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = r4.concat(r3)     // Catch: java.lang.Throwable -> L52
            zzl(r0, r3)     // Catch: java.lang.Throwable -> L52
            goto L21
        L52:
            r0 = move-exception
            goto L6d
        L54:
            r2.zzb(r3)     // Catch: java.lang.Throwable -> L52
            goto L21
        L58:
            com.google.mlkit.acceleration.internal.zzf r0 = r6.zze     // Catch: java.lang.Throwable -> L52
            com.google.android.gms.internal.mlkit_acceleration.zzdv r1 = r2.zzl()     // Catch: java.lang.Throwable -> L52
            com.google.mlkit.acceleration.internal.zzt r1 = (com.google.mlkit.acceleration.internal.zzt) r1     // Catch: java.lang.Throwable -> L52
            byte[] r1 = r1.zzv()     // Catch: java.lang.Throwable -> L52
            r0.zzc(r1)     // Catch: java.lang.Throwable -> L52
        L67:
            com.google.mlkit.acceleration.internal.zzf r0 = r6.zze
            r0.zzd()
            return
        L6d:
            com.google.mlkit.acceleration.internal.zzf r1 = r6.zze
            r1.zzd()
            throw r0
    }

    final void zzf(java.lang.String r5, com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r6, com.google.mlkit.acceleration.internal.MiniBenchmarkResult r7) {
            r4 = this;
            com.google.mlkit.acceleration.internal.zzf r0 = r4.zze
            r0.zzb()
            java.lang.String r0 = "MiniBenchPersistence"
            java.lang.String r1 = "saveMiniBenchmarkResult"
            zzl(r0, r1)     // Catch: java.lang.Throwable -> L72
            com.google.mlkit.acceleration.internal.zzt r0 = r4.zzi()     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L14
            goto L8c
        L14:
            com.google.mlkit.acceleration.internal.zzp r1 = com.google.mlkit.acceleration.internal.zzq.zzd()     // Catch: java.lang.Throwable -> L72
            boolean r2 = r7.zza()     // Catch: java.lang.Throwable -> L72
            r1.zzb(r2)     // Catch: java.lang.Throwable -> L72
            r1.zzd(r5)     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = r6.encode()     // Catch: java.lang.Throwable -> L72
            r1.zzc(r5)     // Catch: java.lang.Throwable -> L72
            int r5 = r7.getStabilityStatus()     // Catch: java.lang.Throwable -> L72
            r1.zzf(r5)     // Catch: java.lang.Throwable -> L72
            float r5 = r7.getCorrectnessScore()     // Catch: java.lang.Throwable -> L72
            r1.zza(r5)     // Catch: java.lang.Throwable -> L72
            int r5 = r7.getRunLatencyMs()     // Catch: java.lang.Throwable -> L72
            r1.zze(r5)     // Catch: java.lang.Throwable -> L72
            com.google.android.gms.internal.mlkit_acceleration.zzdv r5 = r1.zzl()     // Catch: java.lang.Throwable -> L72
            com.google.mlkit.acceleration.internal.zzq r5 = (com.google.mlkit.acceleration.internal.zzq) r5     // Catch: java.lang.Throwable -> L72
            java.lang.String r6 = zzj(r5)     // Catch: java.lang.Throwable -> L72
            com.google.mlkit.acceleration.internal.zzs r7 = r4.zzh()     // Catch: java.lang.Throwable -> L72
            if (r7 == 0) goto L8c
            java.util.List r0 = r0.zzk()     // Catch: java.lang.Throwable -> L72
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L72
            r1 = 0
        L57:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L72
            if (r2 == 0) goto L78
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L72
            com.google.mlkit.acceleration.internal.zzq r2 = (com.google.mlkit.acceleration.internal.zzq) r2     // Catch: java.lang.Throwable -> L72
            java.lang.String r3 = zzj(r2)     // Catch: java.lang.Throwable -> L72
            boolean r3 = r6.equals(r3)     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L74
            r7.zzb(r5)     // Catch: java.lang.Throwable -> L72
            r1 = 1
            goto L57
        L72:
            r5 = move-exception
            goto L92
        L74:
            r7.zzb(r2)     // Catch: java.lang.Throwable -> L72
            goto L57
        L78:
            if (r1 != 0) goto L7d
            r7.zzb(r5)     // Catch: java.lang.Throwable -> L72
        L7d:
            com.google.mlkit.acceleration.internal.zzf r5 = r4.zze     // Catch: java.lang.Throwable -> L72
            com.google.android.gms.internal.mlkit_acceleration.zzdv r6 = r7.zzl()     // Catch: java.lang.Throwable -> L72
            com.google.mlkit.acceleration.internal.zzt r6 = (com.google.mlkit.acceleration.internal.zzt) r6     // Catch: java.lang.Throwable -> L72
            byte[] r6 = r6.zzv()     // Catch: java.lang.Throwable -> L72
            r5.zzc(r6)     // Catch: java.lang.Throwable -> L72
        L8c:
            com.google.mlkit.acceleration.internal.zzf r5 = r4.zze
            r5.zzd()
            return
        L92:
            com.google.mlkit.acceleration.internal.zzf r6 = r4.zze
            r6.zzd()
            throw r5
    }
}
