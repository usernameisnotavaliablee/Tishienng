package com.google.mlkit.acceleration.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzl {
    private final android.content.Context zza;
    private final com.google.mlkit.acceleration.internal.PipelineId zzb;
    private final com.google.mlkit.acceleration.internal.zzm zzc;
    private final androidx.work.WorkManager zzd;
    private final java.lang.Class zze;
    private final float zzf;
    private final com.google.mlkit.acceleration.internal.AccelerationLogger zzg;
    private final java.util.concurrent.Executor zzh;
    private final boolean zzi;
    private final int zzj;

    zzl(android.content.Context r4, com.google.mlkit.acceleration.internal.PipelineId r5, com.google.mlkit.acceleration.internal.MiniBenchmarkConfig r6, com.google.mlkit.acceleration.internal.AccelerationLogger r7) {
            r3 = this;
            com.google.mlkit.acceleration.internal.zzm r0 = new com.google.mlkit.acceleration.internal.zzm
            r0.<init>(r4, r5, r7)
            androidx.work.WorkManager r1 = androidx.work.WorkManager.getInstance(r4)
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r3.<init>()
            r3.zza = r4
            r3.zzb = r5
            r3.zzc = r0
            java.lang.Class r4 = r6.getWorkerClass()
            r3.zze = r4
            float r4 = r6.getCorrectnessScoreThreshold()
            r3.zzf = r4
            boolean r4 = r6.requireDeviceIdle()
            r3.zzi = r4
            int r4 = r6.getMaxRetryCount()
            r3.zzj = r4
            r3.zzg = r7
            r3.zzd = r1
            r3.zzh = r2
            return
    }

    private static void zzf(java.lang.String r0, java.lang.String r1) {
            java.lang.String r0 = "MiniBenchmarkManager"
            r1 = 3
            android.util.Log.isLoggable(r0, r1)
            return
    }

    final java.util.List zza(java.util.List r8) {
            r7 = this;
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L7
            return r8
        L7:
            java.util.concurrent.Executor r0 = r7.zzh
            com.google.mlkit.acceleration.internal.zzh r1 = new com.google.mlkit.acceleration.internal.zzh
            r1.<init>(r7, r8)
            r0.execute(r1)
            com.google.mlkit.acceleration.internal.zzm r0 = r7.zzc
            java.util.List r0 = r0.zzb(r8)
            java.util.Iterator r1 = r0.iterator()
        L1b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()
            com.google.mlkit.acceleration.internal.RunConfig r2 = (com.google.mlkit.acceleration.internal.RunConfig) r2
            com.google.mlkit.acceleration.internal.MiniBenchmarkResult r3 = r2.zzc()
            if (r3 == 0) goto L1b
            boolean r4 = r3.zza()
            if (r4 != 0) goto L1b
            int r4 = r3.getStabilityStatus()
            if (r4 == 0) goto L1b
            com.google.mlkit.acceleration.internal.AccelerationLogger r4 = r7.zzg
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r2 = r2.zzb()
            r4.logBenchmarkResult(r2, r3)
            goto L1b
        L43:
            com.google.mlkit.acceleration.internal.zzm r1 = r7.zzc
            r1.zzd(r0)
            java.util.Iterator r8 = r8.iterator()
        L4c:
            boolean r1 = r8.hasNext()
            r2 = 1
            if (r1 == 0) goto L61
            java.lang.Object r1 = r8.next()
            com.google.mlkit.acceleration.internal.RunConfig r1 = (com.google.mlkit.acceleration.internal.RunConfig) r1
            boolean r1 = r1.zzf()
            if (r1 == 0) goto L4c
            r8 = 1
            goto L62
        L61:
            r8 = 0
        L62:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L6b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lb9
            java.lang.Object r3 = r0.next()
            com.google.mlkit.acceleration.internal.RunConfig r3 = (com.google.mlkit.acceleration.internal.RunConfig) r3
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "MiniBenchmarkManager"
            java.lang.String r6 = "Check isApplicableRunConfig: "
            java.lang.String r4 = r6.concat(r4)
            zzf(r5, r4)
            boolean r4 = r3.zzg()
            if (r4 != 0) goto L8d
            goto Lb5
        L8d:
            com.google.mlkit.acceleration.internal.MiniBenchmarkResult r4 = r3.zzc()
            if (r4 == 0) goto L6b
            int r5 = r4.getStabilityStatus()
            if (r5 != r2) goto L6b
            float r5 = r4.getCorrectnessScore()
            float r6 = r7.zzf
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L6b
            if (r8 != 0) goto Lad
            int r5 = r4.getRunLatencyMs()
            r6 = 100
            if (r5 < r6) goto Lb5
        Lad:
            int r4 = r4.getRunLatencyMs()
            r5 = 40
            if (r4 >= r5) goto L6b
        Lb5:
            r1.add(r3)
            goto L6b
        Lb9:
            com.google.mlkit.acceleration.internal.zzi r8 = com.google.mlkit.acceleration.internal.zzi.zza
            java.util.Collections.sort(r1, r8)
            return r1
    }

    final /* synthetic */ void zzb(java.util.List r2) {
            r1 = this;
            int r0 = r1.zzj
            r1.zze(r2, r0)
            return
    }

    final /* synthetic */ void zzc(int r3, java.util.List r4) {
            r2 = this;
            com.google.mlkit.acceleration.internal.zzm r0 = r2.zzc
            r0.zze()
            if (r3 <= 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Rerun FAILED mini-benchmark. Remaining retry = "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MiniBenchmarkManager"
            zzf(r1, r0)
            int r3 = r3 + (-1)
            r2.zze(r4, r3)
        L22:
            return
    }

    final /* synthetic */ void zzd(java.util.List r5, int r6, java.util.List r7, androidx.work.WorkInfo r8) {
            r4 = this;
            java.lang.String r0 = "MiniBenchmarkManager"
            if (r8 != 0) goto La
            java.lang.String r5 = "workInfo is null"
            zzf(r0, r5)
            return
        La:
            java.lang.String r5 = r5.toString()
            androidx.work.WorkInfo$State r1 = r8.getState()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "workInfo for "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = ": "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = r2.toString()
            zzf(r0, r5)
            androidx.work.WorkInfo$State r5 = r8.getState()
            androidx.work.WorkInfo$State r8 = androidx.work.WorkInfo.State.FAILED
            if (r5 != r8) goto L44
            java.util.concurrent.Executor r5 = r4.zzh
            com.google.mlkit.acceleration.internal.zzg r8 = new com.google.mlkit.acceleration.internal.zzg
            r8.<init>(r4, r6, r7)
            r5.execute(r8)
        L44:
            return
    }

    @androidx.annotation.VisibleForTesting
    final void zze(java.util.List r11, int r12) {
            r10 = this;
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L8
            goto L12d
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r11.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()
            com.google.mlkit.acceleration.internal.RunConfig r2 = (com.google.mlkit.acceleration.internal.RunConfig) r2
            boolean r3 = r2.zzg()
            if (r3 == 0) goto L11
            java.lang.String r2 = r2.zze()
            r0.add(r2)
            goto L11
        L2b:
            r1 = 0
            java.lang.Object r2 = r11.get(r1)
            com.google.mlkit.acceleration.internal.RunConfig r2 = (com.google.mlkit.acceleration.internal.RunConfig) r2
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r2 = r2.zza()
            com.google.mlkit.acceleration.internal.zzm r3 = r10.zzc
            java.util.List r7 = r3.zza(r2, r0)
            int r0 = r7.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Get "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " run configs needing mini-benchmark"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "MiniBenchmarkManager"
            zzf(r3, r0)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L12d
            android.content.Context r0 = r10.zza
            java.lang.Class<com.google.mlkit.acceleration.internal.MlKitRemoteWorkerService> r4 = com.google.mlkit.acceleration.internal.MlKitRemoteWorkerService.class
            java.lang.String r4 = r4.getName()
            android.content.ComponentName r5 = new android.content.ComponentName
            java.lang.String r0 = r0.getPackageName()
            r5.<init>(r0, r4)
            java.lang.String r0 = r2.encode()
            androidx.work.Data$Builder r2 = new androidx.work.Data$Builder
            r2.<init>()
            java.lang.String r4 = r5.getPackageName()
            java.lang.String r6 = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME"
            androidx.work.Data$Builder r2 = r2.putString(r6, r4)
            java.lang.String r4 = r5.getClassName()
            java.lang.String r5 = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME"
            androidx.work.Data$Builder r2 = r2.putString(r5, r4)
            java.lang.String r4 = "mlkit_base_options_key"
            androidx.work.Data$Builder r2 = r2.putString(r4, r0)
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r1 = r7.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r4 = "mlkit_run_config_name_array_key"
            androidx.work.Data$Builder r1 = r2.putStringArray(r4, r1)
            androidx.work.Data r1 = r1.build()
            java.lang.Class r2 = r10.zze
            androidx.work.OneTimeWorkRequest$Builder r4 = new androidx.work.OneTimeWorkRequest$Builder
            r4.<init>(r2)
            androidx.work.WorkRequest$Builder r1 = r4.setInputData(r1)
            androidx.work.OneTimeWorkRequest$Builder r1 = (androidx.work.OneTimeWorkRequest.Builder) r1
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r2 < r4) goto Lcc
            androidx.work.Constraints$Builder r2 = new androidx.work.Constraints$Builder
            r2.<init>()
            boolean r4 = r10.zzi
            androidx.work.Constraints$Builder r2 = r2.setRequiresDeviceIdle(r4)
            androidx.work.Constraints r2 = r2.build()
            r1.setConstraints(r2)
        Lcc:
            androidx.work.WorkRequest r1 = r1.build()
            androidx.work.OneTimeWorkRequest r1 = (androidx.work.OneTimeWorkRequest) r1
            com.google.mlkit.acceleration.internal.PipelineId r2 = r10.zzb
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = ":"
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            androidx.work.WorkManager r2 = r10.zzd
            androidx.work.ExistingWorkPolicy r4 = androidx.work.ExistingWorkPolicy.KEEP
            androidx.work.WorkContinuation r2 = r2.beginUniqueWork(r0, r4, r1)
            r2.enqueue()
            java.lang.String r2 = r7.toString()
            java.lang.String r4 = "mini-benchmark scheduled for "
            java.lang.String r2 = r4.concat(r2)
            zzf(r3, r2)
            java.lang.String r2 = "uniqueWorkName: "
            java.lang.String r0 = r2.concat(r0)
            zzf(r3, r0)
            androidx.work.WorkManager r0 = r10.zzd
            java.util.UUID r1 = r1.getId()
            androidx.lifecycle.LiveData r6 = r0.getWorkInfoByIdLiveData(r1)
            android.content.Context r0 = r10.zza
            com.google.android.gms.internal.mlkit_acceleration.zza r1 = new com.google.android.gms.internal.mlkit_acceleration.zza
            android.os.Looper r0 = r0.getMainLooper()
            r1.<init>(r0)
            com.google.mlkit.acceleration.internal.zzj r4 = new com.google.mlkit.acceleration.internal.zzj
            r5 = r10
            r9 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r1.post(r4)
        L12d:
            return
    }
}
