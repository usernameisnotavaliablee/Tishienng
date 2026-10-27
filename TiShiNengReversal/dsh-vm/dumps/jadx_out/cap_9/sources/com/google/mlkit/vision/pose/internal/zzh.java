package com.google.mlkit.vision.pose.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzh extends com.google.mlkit.common.sdkinternal.MLTask {
    private static final com.google.mlkit.vision.common.internal.ImageUtils zzc = null;
    final java.lang.String zza;
    final java.lang.String zzb;
    private final com.google.mlkit.vision.pose.PoseDetectorOptionsBase zzd;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzwk zze;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzwm zzf;
    private final com.google.mlkit.common.sdkinternal.MlKitContext zzg;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzxf zzh;
    private boolean zzi;
    private com.google.mlkit.vision.pose.PoseDetectorOptionsBase zzj;
    private com.google.android.gms.internal.mlkit_vision_pose_common.zzsk zzk;
    private long zzl;
    private long zzm;

    @androidx.annotation.Nullable
    private com.google.mlkit.vision.mediapipe.MediaPipeGraphRunner zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private final com.google.mlkit.vision.pose.internal.zzg zzr;

    static {
            com.google.mlkit.vision.common.internal.ImageUtils r0 = com.google.mlkit.vision.common.internal.ImageUtils.getInstance()
            com.google.mlkit.vision.pose.internal.zzh.zzc = r0
            return
    }

    public zzh(@androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.MlKitContext r2, @androidx.annotation.NonNull com.google.mlkit.vision.pose.PoseDetectorOptionsBase r3, @androidx.annotation.NonNull com.google.android.gms.internal.mlkit_vision_pose_common.zzwk r4) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zzi = r0
            java.lang.String r0 = "MlKitContext can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "PoseDetectorOptionsBase can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            r1.zze = r4
            com.google.mlkit.vision.pose.internal.zzg r4 = new com.google.mlkit.vision.pose.internal.zzg
            r4.<init>()
            r1.zzr = r4
            android.content.Context r4 = r2.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwm r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwm.zza(r4)
            r1.zzf = r4
            r1.zzg = r2
            r1.zzd = r3
            r1.zzj = r3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsk r3 = r3.zzb()
            r1.zzk = r3
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r3 = r1.zzj
            java.lang.String r3 = r3.zzf()
            r1.zza = r3
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r3 = r1.zzj
            java.lang.String r3 = r3.zze()
            r1.zzb = r3
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxf r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxf.zzf(r2)
            r1.zzh = r2
            return
    }

    private final boolean zzf(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxf r0 = r2.zzh
            java.lang.String r3 = r0.zzh(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 1
            if (r0 != 0) goto L15
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            if (r3 == 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            java.lang.String r3 = "PoseTaskWithRes"
            r0 = 4
            android.util.Log.isLoggable(r3, r0)
            return r1
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    @androidx.annotation.WorkerThread
    public final void load() throws com.google.mlkit.common.MlKitException {
            r15 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            r15.zzl = r0
            r0 = 0
            r15.zzm = r0
            com.google.mlkit.vision.mediapipe.MediaPipeGraphRunner r0 = r15.zzn
            if (r0 == 0) goto L10
            goto L1fd
        L10:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxf r0 = r15.zzh
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.util.Locale r3 = java.util.Locale.US
            com.google.android.gms.common.internal.LibraryVersion r4 = com.google.android.gms.common.internal.LibraryVersion.getInstance()
            java.lang.String r5 = "pose-detection-common"
            java.lang.String r4 = r4.getVersion(r5)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "pose-detection-common:"
            java.lang.String r4 = r6.concat(r4)
            int r6 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r8 = 0
            r7[r8] = r4
            r4 = 1
            r7[r4] = r6
            java.lang.String r6 = android.os.Build.HARDWARE
            r9 = 2
            r7[r9] = r6
            java.lang.String r6 = "%s&android_sdk=%d&hardware=%s"
            java.lang.String r3 = java.lang.String.format(r3, r6, r7)
            r0.zzk(r3)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxf r0 = r15.zzh     // Catch: java.util.concurrent.ExecutionException -> L53 java.lang.InterruptedException -> L55
            com.google.android.gms.tasks.Task r0 = r0.zzb()     // Catch: java.util.concurrent.ExecutionException -> L53 java.lang.InterruptedException -> L55
            com.google.android.gms.tasks.Tasks.await(r0)     // Catch: java.util.concurrent.ExecutionException -> L53 java.lang.InterruptedException -> L55
            goto L63
        L53:
            r0 = move-exception
            goto L56
        L55:
            r0 = move-exception
        L56:
            java.lang.String r0 = r0.getLocalizedMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "remoteConfig.loadAndActivate failed: "
            r3.concat(r0)
        L63:
            java.lang.String r0 = "vision_pose_detection_enable_acceleration"
            boolean r0 = r15.zzf(r0)
            r15.zzo = r0
            java.lang.String r0 = "vision_pose_detection_enable_acceleration_gpu"
            boolean r0 = r15.zzf(r0)
            r15.zzp = r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxf r0 = r15.zzh
            long r6 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxf.zza
            r0.zza(r6)
            boolean r0 = r15.zzo
            if (r0 == 0) goto L89
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxq.zza()
            boolean r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxq.zzb()
            if (r0 == 0) goto L89
            r0 = 1
            goto L8a
        L89:
            r0 = 0
        L8a:
            if (r0 != 0) goto Lb9
            boolean r3 = r15.zzp
            if (r3 == 0) goto Lb9
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r3 = r15.zzj
            java.lang.String r3 = r3.getRunConfigName()
            if (r3 != 0) goto Lac
            com.google.mlkit.vision.pose.internal.zzd r3 = com.google.mlkit.vision.pose.internal.zzd.zzc()
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r6 = r15.zzj
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r3 = r3.getBestConfiguredOptions(r6)
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r3 = (com.google.mlkit.vision.pose.PoseDetectorOptionsBase) r3
            r15.zzj = r3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsk r3 = r3.zzb()
            r15.zzk = r3
        Lac:
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r3 = r15.zzj
            java.lang.String r3 = r3.getRunConfigName()
            java.lang.String r6 = "cpu-gpu-opencl"
            boolean r3 = r6.equals(r3)
            goto Lba
        Lb9:
            r3 = 0
        Lba:
            if (r0 != 0) goto Lbe
            if (r3 == 0) goto Lbf
        Lbe:
            r8 = 1
        Lbf:
            r15.zzq = r8
            java.lang.String r6 = ""
            if (r0 == 0) goto Lc8
            java.lang.String r7 = "_nnapi"
            goto Lce
        Lc8:
            if (r3 == 0) goto Lcd
            java.lang.String r7 = "_gpu"
            goto Lce
        Lcd:
            r7 = r6
        Lce:
            java.lang.String r8 = "PoseTaskWithRes"
            r9 = 4
            boolean r8 = android.util.Log.isLoggable(r8, r9)
            if (r8 == 0) goto Ldc
            java.lang.String r8 = "graphVariant = "
            r8.concat(r7)
        Ldc:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "mlkit_pose/pose_tracking_graph"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r9 = ".binarypb"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "mlkit_pose/pose_non_tracking_graph"
            r10.append(r11)
            r10.append(r7)
            r10.append(r9)
            java.lang.String r7 = r10.toString()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.lang.String r9 = r15.zza
            java.lang.String r10 = "$POSE_DETECTOR_MODEL"
            r13.put(r10, r9)
            java.lang.String r9 = r15.zzb
            java.lang.String r10 = "$POSE_LANDMARKS_MODEL"
            r13.put(r10, r9)
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            com.google.mlkit.common.sdkinternal.MlKitContext r9 = r15.zzg
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            java.lang.Object r9 = r9.get(r10)
            android.content.Context r9 = (android.content.Context) r9
            java.io.File r10 = new java.io.File
            java.io.File r9 = r9.getCodeCacheDir()
            java.lang.String r11 = "mlkit_pose"
            r10.<init>(r9, r11)
            boolean r9 = r10.mkdirs()
            if (r9 != 0) goto L140
            boolean r9 = r10.exists()
            if (r9 != 0) goto L140
            goto L144
        L140:
            java.lang.String r6 = r10.toString()
        L144:
            com.google.android.gms.common.internal.LibraryVersion r9 = com.google.android.gms.common.internal.LibraryVersion.getInstance()
            java.lang.String r5 = r9.getVersion(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r9 = "pose-detection-common_"
            java.lang.String r5 = r9.concat(r5)
            java.lang.String r9 = "landmarks_model_delegate"
            java.lang.String r10 = "detector_model_delegate"
            if (r0 == 0) goto L177
            java.lang.String r0 = "NNAPI_DETECTOR_MODEL_TOKEN_"
            java.lang.String r0 = r0.concat(r5)
            com.google.mlkit.vision.mediapipe.MediaPipeInput r0 = com.google.mlkit.vision.mediapipe.MediaPipeInputFactory.getDelegateInputSidePacketNnapi(r6, r0)
            r14.put(r10, r0)
            java.lang.String r0 = "NNAPI_LANDMARKS_MODEL_TOKEN_"
            java.lang.String r0 = r0.concat(r5)
            com.google.mlkit.vision.mediapipe.MediaPipeInput r0 = com.google.mlkit.vision.mediapipe.MediaPipeInputFactory.getDelegateInputSidePacketNnapi(r6, r0)
            r14.put(r9, r0)
            goto L193
        L177:
            if (r3 == 0) goto L193
            java.lang.String r0 = "OPENCL_DETECTOR_MODEL_TOKEN_"
            java.lang.String r0 = r0.concat(r5)
            com.google.mlkit.vision.mediapipe.MediaPipeInput r0 = com.google.mlkit.vision.mediapipe.MediaPipeInputFactory.getDelegateInputSidePacketGpu(r4, r4, r6, r0)
            r14.put(r10, r0)
            java.lang.String r0 = "OPENCL_LANDMARKS_MODEL_TOKEN_"
            java.lang.String r0 = r0.concat(r5)
            com.google.mlkit.vision.mediapipe.MediaPipeInput r0 = com.google.mlkit.vision.mediapipe.MediaPipeInputFactory.getDelegateInputSidePacketGpu(r4, r4, r6, r0)
            r14.put(r9, r0)
        L193:
            com.google.mlkit.common.sdkinternal.MlKitContext r9 = r15.zzg
            com.google.mlkit.vision.mediapipe.MediaPipeGraphRunner r0 = new com.google.mlkit.vision.mediapipe.MediaPipeGraphRunner
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r3 = r15.zzj
            int r3 = r3.zza()
            if (r3 != r4) goto L1a1
            r10 = r8
            goto L1a2
        L1a1:
            r10 = r7
        L1a2:
            java.lang.String r3 = "input_frames"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r11 = com.google.android.gms.internal.mlkit_vision_pose_common.zzbd.zzh(r3)
            java.lang.String r3 = "output_pose_landmarks"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r12 = com.google.android.gms.internal.mlkit_vision_pose_common.zzbd.zzh(r3)
            com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig r3 = com.google.mlkit.vision.mediapipe.MediaPipeGraphRunnerConfig.create(r9, r10, r11, r12, r13, r14)
            r0.<init>(r3)
            r15.zzn = r0
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.mlkit.vision.mediapipe.MediaPipeGraphRunner r0 = (com.google.mlkit.vision.mediapipe.MediaPipeGraphRunner) r0
            r0.load()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r1
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxq.zza()
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r0 = r15.zzj
            boolean r0 = r0.isForBenchmark()
            if (r0 != 0) goto L1fd
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwk r0 = r15.zze
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpq r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzpq
            r1.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpn r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpn.zzc
            r1.zzf(r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsb r2 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzsb
            r2.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsk r5 = r15.zzk
            r2.zzc(r5)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.zzf(r3)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsd r2 = r2.zzi()
            r1.zzh(r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwa r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwn.zzf(r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpp.zzU
            r0.zzd(r1, r2)
        L1fd:
            return
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final void release() {
            r7 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxq.zza()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwk r0 = r7.zze
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpp.zzbj
            com.google.mlkit.vision.pose.internal.zzg r2 = r7.zzr
            r0.zzi(r1, r2)
            com.google.mlkit.vision.mediapipe.MediaPipeGraphRunner r0 = r7.zzn
            if (r0 == 0) goto L16
            r0.close()
            r0 = 0
            r7.zzn = r0
        L16:
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r0 = r7.zzj
            boolean r0 = r0.isForBenchmark()
            if (r0 != 0) goto L5b
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwk r0 = r7.zze
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpq r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzpq
            r1.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpn r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpn.zzc
            r1.zzf(r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsb r2 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzsb
            r2.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsk r3 = r7.zzk
            r2.zzc(r3)
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r7.zzl
            long r3 = r3 - r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.zzg(r3)
            long r3 = r7.zzm
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.zzh(r3)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsd r2 = r2.zzi()
            r1.zzh(r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwa r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwn.zzf(r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpp.zzW
            r0.zzd(r1, r2)
        L5b:
            r0 = 1
            r7.zzi = r0
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r0 = r7.zzd
            r7.zzj = r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsk r0 = r0.zzb()
            r7.zzk = r0
            r0 = 0
            r7.zzl = r0
            r7.zzm = r0
            return
    }

    @Override // com.google.mlkit.common.sdkinternal.MLTask
    @androidx.annotation.NonNull
    @androidx.annotation.WorkerThread
    public final /* bridge */ /* synthetic */ java.lang.Object run(@androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.MLTaskInput r1) throws com.google.mlkit.common.MlKitException {
            r0 = this;
            com.google.mlkit.vision.common.InputImage r1 = (com.google.mlkit.vision.common.InputImage) r1
            com.google.mlkit.vision.pose.Pose r1 = r0.zzd(r1)
            return r1
    }

    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzwa zzc(long r4, com.google.android.gms.internal.mlkit_vision_pose_common.zzpo r6, com.google.mlkit.vision.common.InputImage r7) {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpq r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzpq
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpn r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpn.zzc
            r0.zzf(r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsb r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzsb
            r1.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpb r2 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzpb
            r2.<init>()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.zzc(r4)
            r2.zzd(r6)
            boolean r4 = r3.zzi
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2.zzf(r4)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r2.zza(r4)
            r2.zzb(r4)
            boolean r4 = r3.zzo
            r5 = 1
            if (r4 != 0) goto L3a
            boolean r4 = r3.zzp
            if (r4 == 0) goto L39
            goto L3a
        L39:
            r5 = 0
        L3a:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            r2.zzg(r4)
            boolean r4 = r3.zzq
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2.zze(r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpd r4 = r2.zzh()
            r1.zze(r4)
            int r4 = r7.getFormat()
            com.google.mlkit.vision.common.internal.ImageUtils r5 = com.google.mlkit.vision.pose.internal.zzh.zzc
            int r5 = r5.getMobileVisionImageSize(r7)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzou r6 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzou
            r6.<init>()
            r7 = -1
            if (r4 == r7) goto L83
            r7 = 35
            if (r4 == r7) goto L80
            r7 = 842094169(0x32315659, float:1.0322389E-8)
            if (r4 == r7) goto L7d
            r7 = 16
            if (r4 == r7) goto L7a
            r7 = 17
            if (r4 == r7) goto L77
            com.google.android.gms.internal.mlkit_vision_pose_common.zzov r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzov.zza
            goto L85
        L77:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzov r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzov.zzc
            goto L85
        L7a:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzov r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzov.zzb
            goto L85
        L7d:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzov r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzov.zzd
            goto L85
        L80:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzov r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzov.zze
            goto L85
        L83:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzov r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzov.zzg
        L85:
            r6.zza(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r6.zzb(r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzox r4 = r6.zzd()
            r1.zzd(r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsk r4 = r3.zzk
            r1.zzc(r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsd r4 = r1.zzi()
            r0.zzh(r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwa r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwn.zzf(r0)
            return r4
    }

    @androidx.annotation.NonNull
    @androidx.annotation.WorkerThread
    public final com.google.mlkit.vision.pose.Pose zzd(@androidx.annotation.NonNull com.google.mlkit.vision.common.InputImage r10) throws com.google.mlkit.common.MlKitException {
            r9 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            byte[] r2 = com.google.mlkit.vision.mediapipe.utils.ImageConvertNativeUtils.getRgbBuffer(r10)
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            if (r2 != 0) goto L1e
            com.google.mlkit.vision.common.internal.ImageConvertUtils r2 = com.google.mlkit.vision.common.internal.ImageConvertUtils.getInstance()
            android.graphics.Bitmap r2 = r2.getUpRightBitmap(r10)
            com.google.mlkit.vision.mediapipe.MediaPipeInput r2 = com.google.mlkit.vision.mediapipe.MediaPipeInputFactory.getMediaPipeInput(r2, r3)
            goto L48
        L1e:
            int r5 = r10.getWidth()
            int r6 = r10.getHeight()
            int r7 = r10.getRotationDegrees()
            int r7 = r7 / 90
            int r7 = r7 % 2
            r8 = 1
            if (r7 != r8) goto L39
            int r5 = r10.getHeight()
            int r6 = r10.getWidth()
        L39:
            int r7 = r2.length
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocateDirect(r7)
            r7.put(r2)
            r7.rewind()
            com.google.mlkit.vision.mediapipe.MediaPipeInput r2 = com.google.mlkit.vision.mediapipe.MediaPipeInputFactory.getMediaPipeInput(r7, r5, r6, r3)
        L48:
            com.google.mlkit.vision.mediapipe.MediaPipeGraphRunner r3 = r9.zzn     // Catch: com.google.mlkit.common.MlKitException -> L6e
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: com.google.mlkit.common.MlKitException -> L6e
            com.google.mlkit.vision.mediapipe.MediaPipeGraphRunner r3 = (com.google.mlkit.vision.mediapipe.MediaPipeGraphRunner) r3     // Catch: com.google.mlkit.common.MlKitException -> L6e
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzbd.zzh(r2)     // Catch: com.google.mlkit.common.MlKitException -> L6e
            com.google.mlkit.vision.mediapipe.pose.PoseHolderConverter r4 = new com.google.mlkit.vision.mediapipe.pose.PoseHolderConverter     // Catch: com.google.mlkit.common.MlKitException -> L6e
            r4.<init>()     // Catch: com.google.mlkit.common.MlKitException -> L6e
            java.lang.Object r2 = r3.run(r2, r4)     // Catch: com.google.mlkit.common.MlKitException -> L6e
            com.google.mlkit.vision.mediapipe.pose.PoseHolder r2 = (com.google.mlkit.vision.mediapipe.pose.PoseHolder) r2     // Catch: com.google.mlkit.common.MlKitException -> L6e
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpo r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpo.zza     // Catch: com.google.mlkit.common.MlKitException -> L6e
            r9.zze(r3, r10, r0)     // Catch: com.google.mlkit.common.MlKitException -> L6e
            r3 = 0
            r9.zzi = r3     // Catch: com.google.mlkit.common.MlKitException -> L6e
            com.google.mlkit.vision.pose.Pose r3 = new com.google.mlkit.vision.pose.Pose     // Catch: com.google.mlkit.common.MlKitException -> L6e
            r4 = 0
            r3.<init>(r2, r4)     // Catch: com.google.mlkit.common.MlKitException -> L6e
            return r3
        L6e:
            r2 = move-exception
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpo r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpo.zzi
            r9.zze(r3, r10, r0)
            throw r2
    }

    @androidx.annotation.WorkerThread
    final void zze(com.google.android.gms.internal.mlkit_vision_pose_common.zzpo r13, com.google.mlkit.vision.common.InputImage r14, long r15) {
            r12 = this;
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r0 = r12.zzj
            boolean r0 = r0.isForBenchmark()
            if (r0 == 0) goto La
            goto L81
        La:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r15
            long r4 = r12.zzm
            long r4 = r4 + r2
            r12.zzm = r4
            com.google.mlkit.vision.pose.internal.zzf r0 = new com.google.mlkit.vision.pose.internal.zzf
            r1 = r12
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r4, r5)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwk r4 = r12.zze
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r5 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpp.zzV
            r4.zzh(r0, r5)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzfa r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzfa
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsk r4 = r12.zzk
            r0.zza(r4)
            r0.zzb(r13)
            boolean r4 = r12.zzi
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.zzc(r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzfc r7 = r0.zzd()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwk r5 = r12.zze
            com.google.mlkit.vision.pose.internal.zzg r10 = r12.zzr
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r6 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpp.zzbj
            java.util.concurrent.Executor r0 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwj r4 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzwj
            r8 = r2
            r4.<init>(r5, r6, r7, r8, r10)
            r0.execute(r4)
            long r10 = java.lang.System.currentTimeMillis()
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r0 = r12.zzj
            boolean r0 = r0.zzg()
            long r8 = r10 - r2
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r2 = r12.zzj
            boolean r2 = r2.isForBenchmark()
            if (r2 == 0) goto L65
            goto L7a
        L65:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwm r5 = r12.zzf
            r2 = 1
            if (r2 == r0) goto L6f
            r0 = 24313(0x5ef9, float:3.407E-41)
            r6 = 24313(0x5ef9, float:3.407E-41)
            goto L73
        L6f:
            r0 = 24312(0x5ef8, float:3.4068E-41)
            r6 = 24312(0x5ef8, float:3.4068E-41)
        L73:
            int r7 = r13.zza()
            r5.zzc(r6, r7, r8, r10)
        L7a:
            boolean r0 = r12.zzi
            if (r0 == 0) goto L81
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxq.zza()
        L81:
            return
    }
}
