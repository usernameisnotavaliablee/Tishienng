package com.google.mlkit.vision.pose.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class PoseDetectorImpl extends com.google.mlkit.vision.common.internal.MobileVisionBase<com.google.mlkit.vision.pose.Pose> implements com.google.mlkit.vision.pose.PoseDetector {
    private final com.google.mlkit.vision.pose.PoseDetectorOptionsBase zzb;

    private PoseDetectorImpl(@androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.MlKitContext r3, @androidx.annotation.NonNull com.google.mlkit.vision.pose.PoseDetectorOptionsBase r4) {
            r2 = this;
            java.lang.Class<com.google.mlkit.vision.pose.internal.zze> r0 = com.google.mlkit.vision.pose.internal.zze.class
            java.lang.Object r0 = r3.get(r0)
            com.google.mlkit.vision.pose.internal.zze r0 = (com.google.mlkit.vision.pose.internal.zze) r0
            java.lang.Object r0 = r0.get(r4)
            com.google.mlkit.vision.pose.internal.zzh r0 = (com.google.mlkit.vision.pose.internal.zzh) r0
            java.lang.Class<com.google.mlkit.common.sdkinternal.ExecutorSelector> r1 = com.google.mlkit.common.sdkinternal.ExecutorSelector.class
            java.lang.Object r3 = r3.get(r1)
            com.google.mlkit.common.sdkinternal.ExecutorSelector r3 = (com.google.mlkit.common.sdkinternal.ExecutorSelector) r3
            java.util.concurrent.Executor r1 = r4.getExecutor()
            java.util.concurrent.Executor r3 = r3.getExecutorToUse(r1)
            r2.<init>(r0, r3)
            r2.zzb = r4
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpp.zzT
            zzd(r3, r4)
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.mlkit.vision.pose.internal.PoseDetectorImpl newInstance(@androidx.annotation.NonNull com.google.mlkit.vision.pose.PoseDetectorOptionsBase r2) {
            java.lang.String r0 = "PoseDetectorOptionsBase can not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.mlkit.vision.pose.internal.PoseDetectorImpl r0 = new com.google.mlkit.vision.pose.internal.PoseDetectorImpl
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = com.google.mlkit.common.sdkinternal.MlKitContext.getInstance()
            r0.<init>(r1, r2)
            return r0
    }

    private static void zzd(com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r3, com.google.mlkit.vision.pose.PoseDetectorOptionsBase r4) {
            boolean r0 = r4.isForBenchmark()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r0 = "pose-detection-common"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwk r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwv.zzb(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpq r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzpq
            r1.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpn r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpn.zzc
            r1.zzf(r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsb r2 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzsb
            r2.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsk r4 = r4.zzb()
            r2.zzc(r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsd r4 = r2.zzi()
            r1.zzh(r4)
            r4 = 1
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwa r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwn.zzg(r1, r4)
            r0.zzd(r4, r3)
            return
    }

    @Override // com.google.mlkit.vision.interfaces.Detector
    public final int getDetectorType() {
            r1 = this;
            r0 = 6
            return r0
    }

    @Override // com.google.mlkit.vision.pose.PoseDetector
    @androidx.annotation.NonNull
    public final com.google.android.gms.tasks.Task<java.lang.Void> getInitTask() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpp.zzX
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r1 = r2.zzb
            zzd(r0, r1)
            com.google.android.gms.tasks.Task r0 = super.getInitTaskBase()
            return r0
    }

    @Override // com.google.mlkit.vision.pose.PoseDetector
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.tasks.Task<com.google.mlkit.vision.pose.Pose> process(@androidx.annotation.NonNull com.google.android.odml.image.MlImage r1) {
            r0 = this;
            com.google.android.gms.tasks.Task r1 = super.processBase(r1)
            return r1
    }

    @Override // com.google.mlkit.vision.pose.PoseDetector
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.tasks.Task<com.google.mlkit.vision.pose.Pose> process(@androidx.annotation.NonNull com.google.mlkit.vision.common.InputImage r1) {
            r0 = this;
            com.google.android.gms.tasks.Task r1 = super.processBase(r1)
            return r1
    }
}
