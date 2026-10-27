package com.google.mlkit.vision.pose.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzc implements com.google.mlkit.acceleration.internal.MiniBenchmarkConfig {
    final /* synthetic */ android.content.Context zza;

    @androidx.annotation.Nullable
    private com.google.mlkit.vision.pose.PoseDetector zzb;

    zzc(android.content.Context r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    private final com.google.mlkit.vision.common.InputImage zzc(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.zza     // Catch: java.io.IOException -> L14
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.io.IOException -> L14
            java.io.InputStream r0 = r0.open(r3)     // Catch: java.io.IOException -> L14
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch: java.io.IOException -> L14
            r1 = 0
            com.google.mlkit.vision.common.InputImage r3 = com.google.mlkit.vision.common.InputImage.fromBitmap(r0, r1)     // Catch: java.io.IOException -> L14
            return r3
        L14:
            r0 = move-exception
            java.lang.String r1 = "Failed to create test image from "
            java.lang.String r3 = r1.concat(r3)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r3, r0)
            throw r1
    }

    private static final java.lang.Object zzd(com.google.android.gms.tasks.Task r3) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.util.concurrent.TimeoutException -> L9 java.util.concurrent.ExecutionException -> Lb java.lang.InterruptedException -> Ld
            r1 = 20
            java.lang.Object r3 = com.google.android.gms.tasks.Tasks.await(r3, r1, r0)     // Catch: java.util.concurrent.TimeoutException -> L9 java.util.concurrent.ExecutionException -> Lb java.lang.InterruptedException -> Ld
            return r3
        L9:
            r0 = move-exception
            goto Le
        Lb:
            r0 = move-exception
            goto Le
        Ld:
            r0 = move-exception
        Le:
            java.lang.String r1 = "PoseAccManager"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r2 = "PoseAccelerationManager failed with error: "
            java.lang.String r3 = r2.concat(r3)
            r1.<init>(r3, r0)
            throw r1
    }

    @Override // com.google.mlkit.acceleration.internal.MiniBenchmarkConfig
    public final com.google.android.gms.tasks.Task closeDetector() {
            r2 = this;
            com.google.mlkit.vision.pose.PoseDetector r0 = r2.zzb
            r1 = 0
            if (r0 != 0) goto La
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forResult(r1)
            goto Le
        La:
            com.google.android.gms.tasks.Task r0 = r0.closeWithTask()
        Le:
            r2.zzb = r1
            return r0
    }

    @Override // com.google.mlkit.acceleration.internal.MiniBenchmarkConfig
    public final /* bridge */ /* synthetic */ float getCorrectnessScore(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
            r17 = this;
            r0 = r18
            com.google.mlkit.vision.common.InputImage r0 = (com.google.mlkit.vision.common.InputImage) r0
            r1 = r19
            com.google.mlkit.vision.pose.Pose r1 = (com.google.mlkit.vision.pose.Pose) r1
            r2 = r20
            com.google.mlkit.vision.pose.Pose r2 = (com.google.mlkit.vision.pose.Pose) r2
            java.util.List r1 = r1.getAllPoseLandmarks()
            java.util.List r2 = r2.getAllPoseLandmarks()
            int r3 = r1.size()
            int r4 = r2.size()
            r5 = 0
            if (r3 == r4) goto L20
            return r5
        L20:
            boolean r3 = r1.isEmpty()
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L29
            return r4
        L29:
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L2e:
            int r10 = r1.size()
            if (r6 >= r10) goto Lad
            java.lang.Object r10 = r1.get(r6)
            com.google.mlkit.vision.pose.PoseLandmark r10 = (com.google.mlkit.vision.pose.PoseLandmark) r10
            java.lang.Object r11 = r2.get(r6)
            com.google.mlkit.vision.pose.PoseLandmark r11 = (com.google.mlkit.vision.pose.PoseLandmark) r11
            int r12 = r10.getLandmarkType()
            int r13 = r11.getLandmarkType()
            if (r12 != r13) goto L4c
            r12 = 1
            goto L4d
        L4c:
            r12 = 0
        L4d:
            java.lang.String r13 = "Mismatching landmark type"
            com.google.android.gms.common.internal.Preconditions.checkState(r12, r13)
            com.google.mlkit.vision.common.PointF3D r12 = r10.getPosition3D()
            com.google.mlkit.vision.common.PointF3D r13 = r11.getPosition3D()
            float r14 = r12.getX()
            float r15 = r13.getX()
            float r14 = r14 - r15
            float r15 = r12.getY()
            float r16 = r13.getY()
            float r15 = r15 - r16
            r16 = r6
            r18 = 0
            double r5 = (double) r14
            double r14 = (double) r15
            double r5 = java.lang.Math.hypot(r5, r14)
            float r5 = (float) r5
            int r6 = r0.getWidth()
            float r6 = (float) r6
            float r5 = r5 / r6
            float r5 = java.lang.Math.min(r5, r4)
            float r7 = r7 + r5
            float r5 = r12.getZ()
            float r6 = r13.getZ()
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            int r6 = r0.getWidth()
            float r6 = (float) r6
            float r5 = r5 / r6
            float r5 = java.lang.Math.min(r5, r4)
            float r8 = r8 + r5
            float r5 = r10.getInFrameLikelihood()
            float r6 = r11.getInFrameLikelihood()
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            float r9 = r9 + r5
            int r6 = r16 + 1
            r5 = 0
            goto L2e
        Lad:
            r18 = 0
            int r0 = r1.size()
            float r0 = (float) r0
            float r7 = r7 / r0
            float r8 = r8 / r0
            float r9 = r9 / r0
            double r0 = (double) r8
            r2 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto Lce
            double r0 = (double) r9
            r2 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto Lcc
            return r18
        Lcc:
            float r4 = r4 - r7
            return r4
        Lce:
            return r18
    }

    @Override // com.google.mlkit.acceleration.internal.MiniBenchmarkConfig
    public final float getCorrectnessScoreThreshold() {
            r1 = this;
            r0 = 1064849900(0x3f7851ec, float:0.97)
            return r0
    }

    @Override // com.google.mlkit.acceleration.internal.MiniBenchmarkConfig
    public final /* bridge */ /* synthetic */ com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions getDefaultOptionsAsDecoder() {
            r1 = this;
            com.google.mlkit.vision.pose.zza r0 = new com.google.mlkit.vision.pose.zza
            r0.<init>()
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r0 = r0.build()
            return r0
    }

    @Override // com.google.mlkit.acceleration.internal.MiniBenchmarkConfig
    public final /* bridge */ /* synthetic */ java.util.List getInputsWithExpectedResults(com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r8) {
            r7 = this;
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r8 = (com.google.mlkit.vision.pose.PoseDetectorOptionsBase) r8
            java.lang.String r0 = "mlkit_pose/benchmark_breaking1.data"
            com.google.mlkit.vision.common.InputImage r0 = r7.zzc(r0)
            java.lang.String r1 = "mlkit_pose/benchmark_breaking2.data"
            com.google.mlkit.vision.common.InputImage r1 = r7.zzc(r1)
            java.lang.String r2 = "mlkit_pose/benchmark_halfbody.data"
            com.google.mlkit.vision.common.InputImage r2 = r7.zzc(r2)
            java.lang.String r3 = "mlkit_pose/benchmark_jump.data"
            com.google.mlkit.vision.common.InputImage r3 = r7.zzc(r3)
            java.lang.String r4 = "mlkit_pose/benchmark_plant.data"
            com.google.mlkit.vision.common.InputImage r4 = r7.zzc(r4)
            r5 = 5
            com.google.mlkit.vision.common.InputImage[] r5 = new com.google.mlkit.vision.common.InputImage[r5]
            r6 = 0
            r5[r6] = r0
            r0 = 1
            r5[r0] = r1
            r1 = 2
            r5[r1] = r2
            r1 = 3
            r5[r1] = r3
            r1 = 4
            r5[r1] = r4
            java.util.List r1 = java.util.Arrays.asList(r5)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = "default_config"
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r8 = r8.zzd(r3, r0)
            r7.zza(r8)
            java.util.Iterator r8 = r1.iterator()
        L48:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r8.next()
            com.google.mlkit.vision.common.InputImage r0 = (com.google.mlkit.vision.common.InputImage) r0
            com.google.android.gms.tasks.Task r1 = r7.zzb(r0)
            java.lang.Object r1 = zzd(r1)
            com.google.mlkit.vision.pose.Pose r1 = (com.google.mlkit.vision.pose.Pose) r1
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r0, r1)
            r2.add(r3)
            goto L48
        L67:
            com.google.android.gms.tasks.Task r8 = r7.closeDetector()
            zzd(r8)
            return r2
    }

    @Override // com.google.mlkit.acceleration.internal.MiniBenchmarkConfig
    public final int getLatencyBenchmarkRepetitionNumber() {
            r1 = this;
            r0 = 15
            return r0
    }

    @Override // com.google.mlkit.acceleration.internal.MiniBenchmarkConfig
    public final int getMaxRetryCount() {
            r1 = this;
            r0 = 3
            return r0
    }

    @Override // com.google.mlkit.acceleration.internal.MiniBenchmarkConfig
    public final int getTaskTimeoutSeconds() {
            r1 = this;
            r0 = 40
            return r0
    }

    @Override // com.google.mlkit.acceleration.internal.MiniBenchmarkConfig
    public final java.lang.Class getWorkerClass() {
            r1 = this;
            java.lang.Class<com.google.mlkit.vision.pose.internal.PoseMiniBenchmarkWorker> r0 = com.google.mlkit.vision.pose.internal.PoseMiniBenchmarkWorker.class
            return r0
    }

    @Override // com.google.mlkit.acceleration.internal.MiniBenchmarkConfig
    public final /* bridge */ /* synthetic */ com.google.android.gms.tasks.Task initDetectorForCorrectnessBenchmark(com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r1) {
            r0 = this;
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r1 = (com.google.mlkit.vision.pose.PoseDetectorOptionsBase) r1
            com.google.android.gms.tasks.Task r1 = r0.zza(r1)
            return r1
    }

    @Override // com.google.mlkit.acceleration.internal.MiniBenchmarkConfig
    public final /* bridge */ /* synthetic */ com.google.android.gms.tasks.Task initDetectorForLatencyBenchmark(com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r1) {
            r0 = this;
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r1 = (com.google.mlkit.vision.pose.PoseDetectorOptionsBase) r1
            com.google.mlkit.vision.pose.PoseDetector r1 = com.google.mlkit.vision.pose.PoseDetection.getClient(r1)
            r0.zzb = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.mlkit.vision.pose.PoseDetector r1 = (com.google.mlkit.vision.pose.PoseDetector) r1
            com.google.android.gms.tasks.Task r1 = r1.getInitTask()
            return r1
    }

    @Override // com.google.mlkit.acceleration.internal.MiniBenchmarkConfig
    public final boolean requireDeviceIdle() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.mlkit.acceleration.internal.MiniBenchmarkConfig
    public final /* bridge */ /* synthetic */ com.google.android.gms.tasks.Task runDetector(java.lang.Object r1) {
            r0 = this;
            com.google.mlkit.vision.common.InputImage r1 = (com.google.mlkit.vision.common.InputImage) r1
            com.google.android.gms.tasks.Task r1 = r0.zzb(r1)
            return r1
    }

    public final com.google.android.gms.tasks.Task zza(com.google.mlkit.vision.pose.PoseDetectorOptionsBase r1) {
            r0 = this;
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r1 = r1.zzc()
            com.google.mlkit.vision.pose.PoseDetector r1 = com.google.mlkit.vision.pose.PoseDetection.getClient(r1)
            r0.zzb = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.mlkit.vision.pose.PoseDetector r1 = (com.google.mlkit.vision.pose.PoseDetector) r1
            com.google.android.gms.tasks.Task r1 = r1.getInitTask()
            return r1
    }

    public final com.google.android.gms.tasks.Task zzb(com.google.mlkit.vision.common.InputImage r2) {
            r1 = this;
            com.google.mlkit.vision.pose.PoseDetector r0 = r1.zzb
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.mlkit.vision.pose.PoseDetector r0 = (com.google.mlkit.vision.pose.PoseDetector) r0
            com.google.android.gms.tasks.Task r2 = r0.process(r2)
            return r2
    }
}
