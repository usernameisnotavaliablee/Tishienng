package com.google.mlkit.acceleration.internal;

import com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class MiniBenchmarkWorker<OptionsT extends com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions<OptionsT>, InputT, ResultT> extends androidx.work.multiprocess.RemoteListenableWorker {
    private static final com.google.android.gms.internal.mlkit_acceleration.zzbb zza = null;
    private final com.google.mlkit.acceleration.internal.MiniBenchmarkConfig zzb;
    private final java.util.List zzc;
    private final com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions zzd;
    private final com.google.mlkit.acceleration.internal.zzm zze;
    private final com.google.mlkit.acceleration.internal.AccelerationLogger zzf;

    static {
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            com.google.android.gms.internal.mlkit_acceleration.zzbb r0 = com.google.android.gms.internal.mlkit_acceleration.zzbg.zza(r0)
            com.google.mlkit.acceleration.internal.MiniBenchmarkWorker.zza = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public MiniBenchmarkWorker(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.work.WorkerParameters r3, @androidx.annotation.NonNull com.google.mlkit.acceleration.internal.PipelineId r4, @androidx.annotation.NonNull com.google.mlkit.acceleration.internal.MiniBenchmarkConfig<OptionsT, InputT, ResultT> r5, @androidx.annotation.NonNull com.google.mlkit.acceleration.internal.AccelerationLogger<OptionsT> r6) {
            r1 = this;
            com.google.mlkit.acceleration.internal.zzm r0 = new com.google.mlkit.acceleration.internal.zzm
            r0.<init>(r2, r4, r6)
            r1.<init>(r2, r3)
            r1.zzb = r5
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r2 = r5.getDefaultOptionsAsDecoder()
            androidx.work.Data r3 = r3.getInputData()
            java.lang.String r4 = "mlkit_base_options_key"
            java.lang.String r4 = r3.getString(r4)
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.decode(r4)
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r2 = (com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions) r2
            r1.zzd = r2
            java.lang.String r2 = "mlkit_run_config_name_array_key"
            java.lang.String[] r2 = r3.getStringArray(r2)
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.zzc = r2
            r1.zze = r0
            r1.zzf = r6
            java.lang.String r2 = "constructed"
            r3 = 0
            java.lang.String r4 = "MiniBenchmarkWorker"
            zzd(r4, r2, r3)
            return
    }

    @androidx.annotation.NonNull
    public static /* synthetic */ androidx.work.ListenableWorker.Result zza(@androidx.annotation.NonNull com.google.mlkit.acceleration.internal.MiniBenchmarkWorker r20) {
            r1 = r20
            java.lang.String r0 = "latency runDetector"
            com.google.mlkit.acceleration.internal.zzm r2 = r1.zze
            r2.zzc()
            java.lang.String r2 = "MiniBenchmarkWorker"
            java.lang.String r3 = "Prepares test inputs"
            r4 = 0
            zzd(r2, r3, r4)
            com.google.mlkit.acceleration.internal.zzm r3 = r1.zze
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r5 = r1.zzd
            java.util.List r6 = r1.zzc
            java.util.List r3 = r3.zza(r5, r6)
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L2b
            java.lang.String r0 = "Worker finishes: no configs need benchmark"
            zzd(r2, r0, r4)
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.success()
            return r0
        L2b:
            com.google.mlkit.acceleration.internal.MiniBenchmarkConfig r5 = r1.zzb
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r6 = r1.zzd
            java.util.List r5 = r5.getInputsWithExpectedResults(r6)
            java.util.Iterator r3 = r3.iterator()
        L37:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L1d0
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r7 = r1.zzd
            r8 = 1
            java.lang.Object r7 = r7.cloneWithRunConfigAssigned(r6, r8)
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r7 = (com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions) r7
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.Object r9 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch: java.lang.RuntimeException -> Ld4
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r9 = (com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions) r9     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.String r10 = "Starts benchmarking "
            java.lang.String r11 = java.lang.String.valueOf(r6)     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.String r10 = r10.concat(r11)     // Catch: java.lang.RuntimeException -> Ld4
            zzd(r2, r10, r4)     // Catch: java.lang.RuntimeException -> Ld4
            com.google.mlkit.acceleration.internal.zzm r10 = r1.zze     // Catch: java.lang.RuntimeException -> Ld4
            com.google.mlkit.acceleration.internal.zzb r11 = new com.google.mlkit.acceleration.internal.zzb     // Catch: java.lang.RuntimeException -> Ld4
            r11.<init>()     // Catch: java.lang.RuntimeException -> Ld4
            r12 = 0
            r11.zzb(r12)     // Catch: java.lang.RuntimeException -> Ld4
            r11.zzd(r12)     // Catch: java.lang.RuntimeException -> Ld4
            r13 = 0
            r11.zza(r13)     // Catch: java.lang.RuntimeException -> Ld4
            r11.zzc(r12)     // Catch: java.lang.RuntimeException -> Ld4
            com.google.mlkit.acceleration.internal.MiniBenchmarkResult r11 = r11.zze()     // Catch: java.lang.RuntimeException -> Ld4
            r10.zzf(r6, r9, r11)     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.String r10 = "Step1: Measures correctness"
            zzd(r2, r10, r4)     // Catch: java.lang.RuntimeException -> Ld4
            com.google.mlkit.acceleration.internal.MiniBenchmarkConfig r10 = r1.zzb     // Catch: java.lang.RuntimeException -> Ld4
            com.google.android.gms.tasks.Task r10 = r10.initDetectorForCorrectnessBenchmark(r9)     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.String r11 = "correctness initDetector"
            r1.zzb(r10, r11)     // Catch: java.lang.RuntimeException -> Ld4
            java.util.Iterator r10 = r5.iterator()     // Catch: java.lang.RuntimeException -> Ld4
            r11 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L98:
            boolean r13 = r10.hasNext()     // Catch: java.lang.RuntimeException -> Ld4
            if (r13 == 0) goto Ld7
            java.lang.Object r13 = r10.next()     // Catch: java.lang.RuntimeException -> Ld4
            android.util.Pair r13 = (android.util.Pair) r13     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.Object r14 = r13.first     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.Object r13 = r13.second     // Catch: java.lang.RuntimeException -> Ld4
            com.google.mlkit.acceleration.internal.MiniBenchmarkConfig r15 = r1.zzb     // Catch: java.lang.RuntimeException -> Ld4
            com.google.android.gms.tasks.Task r15 = r15.runDetector(r14)     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.String r8 = "correctness runDetector"
            java.lang.Object r8 = r1.zzb(r15, r8)     // Catch: java.lang.RuntimeException -> Ld4
            com.google.mlkit.acceleration.internal.MiniBenchmarkConfig r15 = r1.zzb     // Catch: java.lang.RuntimeException -> Ld4
            float r8 = r15.getCorrectnessScore(r14, r13, r8)     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> Ld4
            r13.<init>()     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.String r14 = "correctnessScore = "
            r13.append(r14)     // Catch: java.lang.RuntimeException -> Ld4
            r13.append(r8)     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.String r13 = r13.toString()     // Catch: java.lang.RuntimeException -> Ld4
            zzd(r2, r13, r4)     // Catch: java.lang.RuntimeException -> Ld4
            float r11 = java.lang.Math.min(r11, r8)     // Catch: java.lang.RuntimeException -> Ld4
            r8 = 1
            goto L98
        Ld4:
            r0 = move-exception
            goto L1c4
        Ld7:
            com.google.mlkit.acceleration.internal.MiniBenchmarkConfig r8 = r1.zzb     // Catch: java.lang.RuntimeException -> Ld4
            com.google.android.gms.tasks.Task r8 = r8.closeDetector()     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.String r10 = "correctness closeDetector"
            r1.zzb(r8, r10)     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.String r8 = "Step2: Measures run latency"
            zzd(r2, r8, r4)     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.Object r8 = r5.get(r12)     // Catch: java.lang.RuntimeException -> Ld4
            android.util.Pair r8 = (android.util.Pair) r8     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.Object r8 = r8.first     // Catch: java.lang.RuntimeException -> Ld4
            com.google.mlkit.acceleration.internal.MiniBenchmarkConfig r10 = r1.zzb     // Catch: java.lang.RuntimeException -> Ld4
            int r10 = r10.getLatencyBenchmarkRepetitionNumber()     // Catch: java.lang.RuntimeException -> Ld4
            if (r10 <= 0) goto L165
            com.google.mlkit.acceleration.internal.MiniBenchmarkConfig r13 = r1.zzb     // Catch: java.lang.RuntimeException -> Ld4
            com.google.android.gms.tasks.Task r13 = r13.initDetectorForLatencyBenchmark(r9)     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.String r14 = "latency initDetector"
            r15 = 5
            zzc(r13, r14, r15)     // Catch: java.lang.RuntimeException -> Ld4
            com.google.mlkit.acceleration.internal.MiniBenchmarkConfig r13 = r1.zzb     // Catch: java.lang.RuntimeException -> Ld4
            com.google.android.gms.tasks.Task r13 = r13.runDetector(r8)     // Catch: java.lang.RuntimeException -> Ld4
            zzc(r13, r0, r15)     // Catch: java.lang.RuntimeException -> Ld4
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.RuntimeException -> Ld4
            r13.<init>()     // Catch: java.lang.RuntimeException -> Ld4
            r14 = 0
        L112:
            if (r14 >= r10) goto L132
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.RuntimeException -> Ld4
            com.google.mlkit.acceleration.internal.MiniBenchmarkConfig r12 = r1.zzb     // Catch: java.lang.RuntimeException -> Ld4
            com.google.android.gms.tasks.Task r12 = r12.runDetector(r8)     // Catch: java.lang.RuntimeException -> Ld4
            zzc(r12, r0, r15)     // Catch: java.lang.RuntimeException -> Ld4
            long r18 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.RuntimeException -> Ld4
            long r18 = r18 - r16
            java.lang.Long r12 = java.lang.Long.valueOf(r18)     // Catch: java.lang.RuntimeException -> Ld4
            r13.add(r12)     // Catch: java.lang.RuntimeException -> Ld4
            int r14 = r14 + 1
            r12 = 0
            goto L112
        L132:
            com.google.mlkit.acceleration.internal.MiniBenchmarkConfig r8 = r1.zzb     // Catch: java.lang.RuntimeException -> Ld4
            com.google.android.gms.tasks.Task r8 = r8.closeDetector()     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.String r12 = "latency closeDetector"
            r1.zzb(r8, r12)     // Catch: java.lang.RuntimeException -> Ld4
            java.util.Collections.sort(r13)     // Catch: java.lang.RuntimeException -> Ld4
            double r14 = (double) r10     // Catch: java.lang.RuntimeException -> Ld4
            r16 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r14 = r14 * r16
            int r8 = (int) r14     // Catch: java.lang.RuntimeException -> Ld4
            r14 = 0
            r12 = r8
        L14c:
            int r4 = r10 - r8
            if (r12 >= r4) goto L15f
            java.lang.Object r4 = r13.get(r12)     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.RuntimeException -> Ld4
            long r18 = r4.longValue()     // Catch: java.lang.RuntimeException -> Ld4
            long r14 = r14 + r18
            int r12 = r12 + 1
            goto L14c
        L15f:
            int r8 = r8 + r8
            int r10 = r10 - r8
            long r12 = (long) r10     // Catch: java.lang.RuntimeException -> Ld4
            long r14 = r14 / r12
            r8 = 0
            goto L16d
        L165:
            java.lang.String r4 = "Skipping the latency measurements."
            r8 = 0
            zzd(r2, r4, r8)     // Catch: java.lang.RuntimeException -> Ld4
            r14 = -1
        L16d:
            java.lang.String r4 = "Mini-benchmark completed successfully for "
            java.lang.String r10 = java.lang.String.valueOf(r6)     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.String r4 = r4.concat(r10)     // Catch: java.lang.RuntimeException -> Ld4
            zzd(r2, r4, r8)     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> Ld4
            r4.<init>()     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.String r8 = "    minCorrectnessScore = "
            r4.append(r8)     // Catch: java.lang.RuntimeException -> Ld4
            r4.append(r11)     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.String r4 = r4.toString()     // Catch: java.lang.RuntimeException -> Ld4
            r8 = 0
            zzd(r2, r4, r8)     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> Ld4
            r4.<init>()     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.String r8 = "    avgRunLatencyMs = "
            r4.append(r8)     // Catch: java.lang.RuntimeException -> Ld4
            r4.append(r14)     // Catch: java.lang.RuntimeException -> Ld4
            java.lang.String r4 = r4.toString()     // Catch: java.lang.RuntimeException -> Ld4
            r8 = 0
            zzd(r2, r4, r8)     // Catch: java.lang.RuntimeException -> Ld4
            com.google.mlkit.acceleration.internal.zzb r4 = new com.google.mlkit.acceleration.internal.zzb     // Catch: java.lang.RuntimeException -> Ld4
            r4.<init>()     // Catch: java.lang.RuntimeException -> Ld4
            r8 = 0
            r4.zzb(r8)     // Catch: java.lang.RuntimeException -> Ld4
            r8 = 1
            r4.zzd(r8)     // Catch: java.lang.RuntimeException -> Ld4
            r4.zza(r11)     // Catch: java.lang.RuntimeException -> Ld4
            int r8 = (int) r14     // Catch: java.lang.RuntimeException -> Ld4
            r4.zzc(r8)     // Catch: java.lang.RuntimeException -> Ld4
            com.google.mlkit.acceleration.internal.MiniBenchmarkResult r4 = r4.zze()     // Catch: java.lang.RuntimeException -> Ld4
            com.google.mlkit.acceleration.internal.zzm r8 = r1.zze     // Catch: java.lang.RuntimeException -> Ld4
            r8.zzf(r6, r9, r4)     // Catch: java.lang.RuntimeException -> Ld4
            r4 = 0
            goto L37
        L1c4:
            com.google.mlkit.acceleration.internal.AccelerationLogger r1 = r1.zzf
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r2 = (com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions) r2
            r1.logBenchmarkPipelineError(r2, r0)
            throw r0
        L1d0:
            java.lang.String r0 = "Worker finishes"
            r8 = 0
            zzd(r2, r0, r8)
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.success()
            return r0
    }

    private final java.lang.Object zzb(com.google.android.gms.tasks.Task r2, java.lang.String r3) {
            r1 = this;
            com.google.mlkit.acceleration.internal.MiniBenchmarkConfig r0 = r1.zzb
            int r0 = r0.getTaskTimeoutSeconds()
            java.lang.Object r2 = zzc(r2, r3, r0)
            return r2
    }

    private static java.lang.Object zzc(com.google.android.gms.tasks.Task r2, java.lang.String r3, int r4) {
            long r0 = (long) r4
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.util.concurrent.TimeoutException -> L8 java.util.concurrent.ExecutionException -> La java.lang.InterruptedException -> Lc
            java.lang.Object r2 = com.google.android.gms.tasks.Tasks.await(r2, r0, r4)     // Catch: java.util.concurrent.TimeoutException -> L8 java.util.concurrent.ExecutionException -> La java.lang.InterruptedException -> Lc
            return r2
        L8:
            r2 = move-exception
            goto Ld
        La:
            r2 = move-exception
            goto Ld
        Lc:
            r2 = move-exception
        Ld:
            java.lang.String r4 = "waitTask failed: "
            java.lang.String r4 = r4.concat(r3)
            java.lang.String r0 = "MiniBenchmarkWorker"
            zzd(r0, r4, r2)
            java.lang.String r4 = "MiniBenchmarkWorker failed with error: "
            java.lang.String r3 = r4.concat(r3)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r3, r2)
            throw r4
    }

    private static void zzd(java.lang.String r0, java.lang.String r1, @androidx.annotation.Nullable java.lang.Throwable r2) {
            java.lang.String r0 = "MiniBenchmarkWorker"
            r1 = 3
            android.util.Log.isLoggable(r0, r1)
            return
    }

    public final void onStopped() {
            r3 = this;
            super.onStopped()
            java.lang.String r0 = "Benchmark interrupted"
            r1 = 0
            java.lang.String r2 = "MiniBenchmarkWorker"
            zzd(r2, r0, r1)
            com.google.mlkit.acceleration.internal.zzm r0 = r3.zze
            r0.zzc()
            com.google.mlkit.acceleration.internal.MiniBenchmarkConfig r0 = r3.zzb
            com.google.android.gms.tasks.Task r0 = r0.closeDetector()
            java.lang.String r1 = "onStopped closeDetector"
            r3.zzb(r0, r1)
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> startRemoteWork() {
            r4 = this;
            java.lang.String r0 = "MiniBenchmarkWorker"
            java.lang.String r1 = "startRemoteWork"
            r2 = 0
            zzd(r0, r1, r2)
            java.util.List r1 = r4.zzc
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "runConfigNameList = "
            java.lang.String r1 = r3.concat(r1)
            zzd(r0, r1, r2)
            com.google.android.gms.internal.mlkit_acceleration.zzbb r0 = com.google.mlkit.acceleration.internal.MiniBenchmarkWorker.zza
            com.google.mlkit.acceleration.internal.zzu r1 = new com.google.mlkit.acceleration.internal.zzu
            r1.<init>(r4)
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zza(r1)
            return r0
    }
}
