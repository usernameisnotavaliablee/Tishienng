package com.google.mlkit.vision.pose.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzb implements com.google.mlkit.acceleration.internal.AllowlistConfig {
    zzb() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.mlkit.acceleration.internal.AllowlistConfig
    public final java.lang.String getBundledAllowlistAssetPath() {
            r1 = this;
            java.lang.String r0 = "mlkit_pose/bundled_allowlist.binarypb"
            return r0
    }

    @Override // com.google.mlkit.acceleration.internal.AllowlistConfig
    public final /* bridge */ /* synthetic */ boolean isRunConfigCompatibleWithOptions(java.lang.String r2, com.google.mlkit.acceleration.internal.AcceleratableDetectorOptions r3) {
            r1 = this;
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r3 = (com.google.mlkit.vision.pose.PoseDetectorOptionsBase) r3
            int[] r3 = r3.getPreferredHardwareConfigs()
            java.util.List r3 = com.google.android.gms.internal.mlkit_vision_pose_common.zzcf.zzc(r3)
            java.lang.String r0 = "default_config"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1c
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r3.contains(r2)
            return r2
        L1c:
            java.lang.String r0 = "cpu-gpu-opencl"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L26
            r2 = 0
            return r2
        L26:
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r3.contains(r2)
            return r2
    }

    @Override // com.google.mlkit.acceleration.internal.AllowlistConfig
    public final boolean shouldCheckGenericGpuAllowlist(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "cpu-gpu-opencl"
            boolean r2 = r0.equals(r2)
            return r2
    }
}
