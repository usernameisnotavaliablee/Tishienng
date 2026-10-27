package com.google.mlkit.vision.pose;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class PoseDetectorOptionsBase implements com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions<com.google.mlkit.vision.pose.PoseDetectorOptionsBase> {
    public static final int CPU = 1;
    public static final int CPU_GPU = 2;
    public static final int SINGLE_IMAGE_MODE = 2;
    public static final int STREAM_MODE = 1;
    private final int zza;

    @androidx.annotation.Nullable
    private final java.util.concurrent.Executor zzb;
    private final boolean zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;

    @com.google.mlkit.vision.pose.PoseDetectorOptionsBase.HardwareConfig
    private final int[] zzf;

    @androidx.annotation.Nullable
    private final java.lang.String zzg;
    private final boolean zzh;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    protected static abstract class Builder<B extends com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder<B>> {

        @androidx.annotation.Nullable
        protected java.lang.String zza;
        protected boolean zzb;

        @com.google.mlkit.vision.pose.PoseDetectorOptionsBase.DetectorMode
        private int zzc;

        @androidx.annotation.Nullable
        private java.util.concurrent.Executor zzd;
        private boolean zze;
        private java.lang.String zzf;
        private java.lang.String zzg;

        @com.google.mlkit.vision.pose.PoseDetectorOptionsBase.HardwareConfig
        private int[] zzh;

        protected Builder() {
                r2 = this;
                r2.<init>()
                r0 = 1
                r2.zzc = r0
                r1 = 2
                int[] r0 = new int[]{r0, r1}
                r2.zzh = r0
                return
        }

        static /* bridge */ /* synthetic */ int zza(com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder r0) {
                int r0 = r0.zzc
                return r0
        }

        static /* bridge */ /* synthetic */ java.lang.String zzb(com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder r0) {
                java.lang.String r0 = r0.zzg
                return r0
        }

        static /* bridge */ /* synthetic */ java.lang.String zzc(com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder r0) {
                java.lang.String r0 = r0.zzf
                return r0
        }

        static /* bridge */ /* synthetic */ java.util.concurrent.Executor zzd(com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder r0) {
                java.util.concurrent.Executor r0 = r0.zzd
                return r0
        }

        static /* bridge */ /* synthetic */ boolean zze(com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder r0) {
                boolean r0 = r0.zze
                return r0
        }

        static /* bridge */ /* synthetic */ int[] zzf(com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder r0) {
                int[] r0 = r0.zzh
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        protected abstract com.google.mlkit.vision.pose.PoseDetectorOptionsBase build();

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public B setDetectorMode(@com.google.mlkit.vision.pose.PoseDetectorOptionsBase.DetectorMode int r1) {
                r0 = this;
                r0.zzc = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public B setExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r1) {
                r0 = this;
                r0.zzd = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public B setModelInfo(boolean r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
                r0 = this;
                r0.zze = r1
                java.lang.String r1 = "personModelPath cannot be null"
                java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r1)
                java.lang.String r1 = (java.lang.String) r1
                r0.zzf = r1
                java.lang.String r1 = "landmarkModelPath cannot be null"
                java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r1)
                java.lang.String r1 = (java.lang.String) r1
                r0.zzg = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public B setPreferredHardwareConfigs(@com.google.mlkit.vision.pose.PoseDetectorOptionsBase.HardwareConfig int r3, @androidx.annotation.NonNull @com.google.mlkit.vision.pose.PoseDetectorOptionsBase.HardwareConfig int... r4) {
                r2 = this;
                if (r4 == 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                java.lang.String r1 = "moreConfigs cannot be null"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
                int r0 = r4.length
                int r1 = r0 + 1
                int[] r4 = java.util.Arrays.copyOf(r4, r1)
                r2.zzh = r4
                r4[r0] = r3
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface DetectorMode {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface HardwareConfig {
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected PoseDetectorOptionsBase(@androidx.annotation.NonNull com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder<?> r2) {
            r1 = this;
            r1.<init>()
            int r0 = com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder.zza(r2)
            r1.zza = r0
            java.util.concurrent.Executor r0 = com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder.zzd(r2)
            r1.zzb = r0
            boolean r0 = com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder.zze(r2)
            r1.zzc = r0
            java.lang.String r0 = com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder.zzc(r2)
            r1.zzd = r0
            java.lang.String r0 = com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder.zzb(r2)
            r1.zze = r0
            int[] r0 = com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder.zzf(r2)
            r1.zzf = r0
            java.lang.String r0 = r2.zza
            r1.zzg = r0
            boolean r2 = r2.zzb
            r1.zzh = r2
            return
    }

    private final com.google.mlkit.vision.pose.zza zzh() {
            r6 = this;
            com.google.mlkit.vision.pose.zza r0 = new com.google.mlkit.vision.pose.zza
            r0.<init>()
            java.lang.String r1 = r6.zzg
            r0.zza = r1
            boolean r1 = r6.zzh
            r0.zzb = r1
            int r1 = r6.zza
            r0.setDetectorMode(r1)
            boolean r1 = r6.zzc
            java.lang.String r2 = r6.zzd
            java.lang.String r3 = r6.zze
            r0.setModelInfo(r1, r2, r3)
            java.util.concurrent.Executor r1 = r6.zzb
            if (r1 == 0) goto L22
            r0.setExecutor(r1)
        L22:
            int[] r1 = r6.zzf
            int r2 = r1.length
            int r3 = r2 + (-1)
            r4 = r1[r3]
            r5 = 1
            if (r2 != r5) goto L33
            r1 = 0
            int[] r1 = new int[r1]
            r0.setPreferredHardwareConfigs(r4, r1)
            return r0
        L33:
            int[] r1 = java.util.Arrays.copyOf(r1, r3)
            r0.setPreferredHardwareConfigs(r4, r1)
            return r0
    }

    @Override // com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions
    @androidx.annotation.NonNull
    public final /* bridge */ /* synthetic */ com.google.mlkit.vision.pose.PoseDetectorOptionsBase cloneWithRunConfigAssigned(@androidx.annotation.NonNull java.lang.String r1, boolean r2) {
            r0 = this;
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r1 = r0.zzd(r1, r2)
            return r1
    }

    @Override // com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions
    @androidx.annotation.NonNull
    public final /* bridge */ /* synthetic */ com.google.mlkit.vision.pose.PoseDetectorOptionsBase decode(@androidx.annotation.NonNull java.lang.String r5) {
            r4 = this;
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions$KeyValueDecoder r5 = com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions.KeyValueDecoder.newInstance(r5)
            com.google.mlkit.vision.pose.zza r0 = new com.google.mlkit.vision.pose.zza
            r0.<init>()
            java.lang.String r1 = "detector_mode"
            java.lang.Integer r1 = r5.getInt(r1)
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setDetectorMode(r1)
            java.lang.String r1 = "are_fast_models"
            java.lang.Boolean r1 = r5.getBoolean(r1)
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "person_model_path"
            java.lang.String r2 = r5.getString(r2)
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "landmark_model_path"
            java.lang.String r3 = r5.getString(r3)
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.String r3 = (java.lang.String) r3
            r0.setModelInfo(r1, r2, r3)
            java.lang.String r1 = "run_config_name"
            java.lang.String r5 = r5.getString(r1)
            r0.zza = r5
            r5 = 1
            r0.zzb = r5
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r5 = new com.google.mlkit.vision.pose.PoseDetectorOptionsBase
            r5.<init>(r0)
            return r5
    }

    @Override // com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions
    @androidx.annotation.NonNull
    public final java.lang.String encode() {
            r3 = this;
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions$KeyValueEncoder r0 = com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions.KeyValueEncoder.newInstance()
            java.lang.String r1 = "detector_mode"
            int r2 = r3.zza
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions$KeyValueEncoder r0 = r0.addInt(r1, r2)
            java.lang.String r1 = "are_fast_models"
            boolean r2 = r3.zzc
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions$KeyValueEncoder r0 = r0.addBoolean(r1, r2)
            java.lang.String r1 = "person_model_path"
            java.lang.String r2 = r3.zzd
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions$KeyValueEncoder r0 = r0.addString(r1, r2)
            java.lang.String r1 = "landmark_model_path"
            java.lang.String r2 = r3.zze
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions$KeyValueEncoder r0 = r0.addString(r1, r2)
            java.lang.String r1 = "run_config_name"
            java.lang.String r2 = r3.zzg
            com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions$KeyValueEncoder r0 = r0.addString(r1, r2)
            java.lang.String r0 = r0.encode()
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.mlkit.vision.pose.PoseDetectorOptionsBase
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r5 = (com.google.mlkit.vision.pose.PoseDetectorOptionsBase) r5
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5f
            int r1 = r4.zza
            int r3 = r5.zza
            if (r1 != r3) goto L5f
            boolean r1 = r4.zzc
            boolean r3 = r5.zzc
            if (r1 != r3) goto L5f
            java.lang.String r1 = r4.zzd
            java.lang.String r3 = r5.zzd
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L5f
            java.lang.String r1 = r4.zze
            java.lang.String r3 = r5.zze
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L5f
            int[] r1 = r4.zzf
            int[] r3 = r5.zzf
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L5f
            java.lang.String r1 = r4.zzg
            java.lang.String r3 = r5.zzg
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L5f
            boolean r1 = r4.zzh
            boolean r3 = r5.zzh
            if (r1 != r3) goto L5f
            java.util.concurrent.Executor r1 = r4.zzb
            java.util.concurrent.Executor r5 = r5.zzb
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r1, r5)
            if (r5 == 0) goto L5f
            return r0
        L5f:
            return r2
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.util.concurrent.Executor getExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.zzb
            return r0
    }

    @Override // com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions
    @androidx.annotation.NonNull
    @com.google.mlkit.vision.pose.PoseDetectorOptionsBase.HardwareConfig
    public final int[] getPreferredHardwareConfigs() {
            r1 = this;
            int[] r0 = r1.zzf
            return r0
    }

    @Override // com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions
    @androidx.annotation.Nullable
    public final java.lang.String getRunConfigName() {
            r1 = this;
            java.lang.String r0 = r1.zzg
            return r0
    }

    public int hashCode() {
            r11 = this;
            java.lang.Class r0 = r11.getClass()
            int r1 = r11.zza
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r2 = r11.zzc
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r3 = r11.zzd
            java.lang.String r4 = r11.zze
            int[] r5 = r11.zzf
            int r5 = java.util.Arrays.hashCode(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = r11.zzg
            boolean r7 = r11.zzh
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.util.concurrent.Executor r8 = r11.zzb
            r9 = 9
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r10 = 0
            r9[r10] = r0
            r0 = 1
            r9[r0] = r1
            r0 = 2
            r9[r0] = r2
            r0 = 3
            r9[r0] = r3
            r0 = 4
            r9[r0] = r4
            r0 = 5
            r9[r0] = r5
            r0 = 6
            r9[r0] = r6
            r0 = 7
            r9[r0] = r7
            r0 = 8
            r9[r0] = r8
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r9)
            return r0
    }

    @Override // com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions
    public final boolean isForBenchmark() {
            r1 = this;
            boolean r0 = r1.zzh
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "PoseDetectorOptionsBase"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzn r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzo.zza(r0)
            java.lang.String r1 = "detectorMode"
            int r2 = r3.zza
            r0.zza(r1, r2)
            java.lang.String r1 = "areFastModels"
            boolean r2 = r3.zzc
            r0.zzc(r1, r2)
            java.lang.String r1 = "personModelPath"
            java.lang.String r2 = r3.zzd
            r0.zzb(r1, r2)
            java.lang.String r1 = "landmarkModelPath"
            java.lang.String r2 = r3.zze
            r0.zzb(r1, r2)
            java.lang.String r1 = "executor"
            java.util.concurrent.Executor r2 = r3.zzb
            r0.zzb(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @com.google.mlkit.vision.pose.PoseDetectorOptionsBase.DetectorMode
    @androidx.annotation.VisibleForTesting
    public final int zza() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzsk zzb() {
            r6 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzse r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzse
            r0.<init>()
            int r1 = r6.zza
            r2 = 1
            if (r1 != r2) goto L10
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsf r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzsf.zzb
            r0.zzb(r1)
            goto L15
        L10:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsf r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzsf.zzc
            r0.zzb(r1)
        L15:
            boolean r1 = r6.zzc
            if (r1 == 0) goto L22
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsh r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzsh.zzb
            r0.zzd(r1)
            r0.zzc(r1)
            goto L2a
        L22:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsh r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzsh.zzc
            r0.zzd(r1)
            r0.zzc(r1)
        L2a:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzba r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzba
            r1.<init>()
            int[] r2 = r6.zzf
            int r3 = r2.length
            r4 = 0
        L33:
            if (r4 >= r3) goto L41
            r5 = r2[r4]
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsg r5 = com.google.android.gms.internal.mlkit_vision_pose_common.zzsg.zzb(r5)
            r1.zzb(r5)
            int r4 = r4 + 1
            goto L33
        L41:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r1 = r1.zzc()
            r0.zze(r1)
            java.lang.String r1 = r6.zzg
            if (r1 == 0) goto L7c
            int r2 = r1.hashCode()
            r3 = 337549753(0x141e99b9, float:8.007278E-27)
            if (r2 == r3) goto L69
            r3 = 1693142784(0x64eb4f00, float:3.472542E22)
            if (r2 == r3) goto L5b
            goto L77
        L5b:
            java.lang.String r2 = "default_config"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L77
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsi r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzsi.zzb
            r0.zzf(r1)
            goto L7c
        L69:
            java.lang.String r2 = "cpu-gpu-opencl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L77
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsi r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzsi.zzc
            r0.zzf(r1)
            goto L7c
        L77:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsi r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzsi.zza
            r0.zzf(r1)
        L7c:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsk r0 = r0.zzk()
            return r0
    }

    @androidx.annotation.NonNull
    public final com.google.mlkit.vision.pose.PoseDetectorOptionsBase zzc() {
            r2 = this;
            com.google.mlkit.vision.pose.zza r0 = r2.zzh()
            r1 = 2
            r0.setDetectorMode(r1)
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r1 = new com.google.mlkit.vision.pose.PoseDetectorOptionsBase
            r1.<init>(r0)
            return r1
    }

    @androidx.annotation.NonNull
    public final com.google.mlkit.vision.pose.PoseDetectorOptionsBase zzd(@androidx.annotation.NonNull java.lang.String r2, boolean r3) {
            r1 = this;
            com.google.mlkit.vision.pose.zza r0 = r1.zzh()
            r0.zza = r2
            r0.zzb = r3
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r2 = new com.google.mlkit.vision.pose.PoseDetectorOptionsBase
            r2.<init>(r0)
            return r2
    }

    @androidx.annotation.NonNull
    public final java.lang.String zze() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }

    @androidx.annotation.NonNull
    public final java.lang.String zzf() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            return r0
    }

    public final boolean zzg() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }
}
