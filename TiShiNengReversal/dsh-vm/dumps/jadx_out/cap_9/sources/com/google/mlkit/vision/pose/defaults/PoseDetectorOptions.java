package com.google.mlkit.vision.pose.defaults;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class PoseDetectorOptions extends com.google.mlkit.vision.pose.PoseDetectorOptionsBase {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder extends com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder<com.google.mlkit.vision.pose.defaults.PoseDetectorOptions.Builder> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder
        @androidx.annotation.NonNull
        public final /* bridge */ /* synthetic */ com.google.mlkit.vision.pose.PoseDetectorOptionsBase build() {
                r1 = this;
                com.google.mlkit.vision.pose.defaults.PoseDetectorOptions r0 = r1.build()
                return r0
        }

        @Override // com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder
        @androidx.annotation.NonNull
        public com.google.mlkit.vision.pose.defaults.PoseDetectorOptions build() {
                r3 = this;
                java.lang.String r0 = "mlkit_pose/pose_person_detector_f16.tflite"
                java.lang.String r1 = "mlkit_pose/pose_landmark_detector_lite_f16_inf.tflite"
                r2 = 1
                super.setModelInfo(r2, r0, r1)
                com.google.mlkit.vision.pose.defaults.PoseDetectorOptions r0 = new com.google.mlkit.vision.pose.defaults.PoseDetectorOptions
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        @Override // com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder
        @androidx.annotation.NonNull
        public final /* bridge */ /* synthetic */ com.google.mlkit.vision.pose.defaults.PoseDetectorOptions.Builder setDetectorMode(@com.google.mlkit.vision.pose.PoseDetectorOptionsBase.DetectorMode int r1) {
                r0 = this;
                com.google.mlkit.vision.pose.defaults.PoseDetectorOptions$Builder r1 = r0.setDetectorMode2(r1)
                return r1
        }

        @Override // com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder
        @androidx.annotation.NonNull
        /* renamed from: setDetectorMode, reason: avoid collision after fix types in other method */
        public com.google.mlkit.vision.pose.defaults.PoseDetectorOptions.Builder setDetectorMode2(@com.google.mlkit.vision.pose.PoseDetectorOptionsBase.DetectorMode int r1) {
                r0 = this;
                com.google.mlkit.vision.pose.PoseDetectorOptionsBase$Builder r1 = super.setDetectorMode(r1)
                com.google.mlkit.vision.pose.defaults.PoseDetectorOptions$Builder r1 = (com.google.mlkit.vision.pose.defaults.PoseDetectorOptions.Builder) r1
                return r1
        }

        @Override // com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder
        @androidx.annotation.NonNull
        public final /* bridge */ /* synthetic */ com.google.mlkit.vision.pose.defaults.PoseDetectorOptions.Builder setExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r1) {
                r0 = this;
                com.google.mlkit.vision.pose.defaults.PoseDetectorOptions$Builder r1 = r0.setExecutor2(r1)
                return r1
        }

        @Override // com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder
        @androidx.annotation.NonNull
        /* renamed from: setExecutor, reason: avoid collision after fix types in other method */
        public com.google.mlkit.vision.pose.defaults.PoseDetectorOptions.Builder setExecutor2(@androidx.annotation.NonNull java.util.concurrent.Executor r1) {
                r0 = this;
                com.google.mlkit.vision.pose.PoseDetectorOptionsBase$Builder r1 = super.setExecutor(r1)
                com.google.mlkit.vision.pose.defaults.PoseDetectorOptions$Builder r1 = (com.google.mlkit.vision.pose.defaults.PoseDetectorOptions.Builder) r1
                return r1
        }

        @Override // com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder
        @androidx.annotation.NonNull
        public final /* bridge */ /* synthetic */ com.google.mlkit.vision.pose.defaults.PoseDetectorOptions.Builder setPreferredHardwareConfigs(@com.google.mlkit.vision.pose.PoseDetectorOptionsBase.HardwareConfig int r1, @androidx.annotation.NonNull @com.google.mlkit.vision.pose.PoseDetectorOptionsBase.HardwareConfig int[] r2) {
                r0 = this;
                com.google.mlkit.vision.pose.defaults.PoseDetectorOptions$Builder r1 = r0.setPreferredHardwareConfigs2(r1, r2)
                return r1
        }

        @Override // com.google.mlkit.vision.pose.PoseDetectorOptionsBase.Builder
        @androidx.annotation.NonNull
        /* renamed from: setPreferredHardwareConfigs, reason: avoid collision after fix types in other method */
        public com.google.mlkit.vision.pose.defaults.PoseDetectorOptions.Builder setPreferredHardwareConfigs2(@com.google.mlkit.vision.pose.PoseDetectorOptionsBase.HardwareConfig int r1, @androidx.annotation.NonNull @com.google.mlkit.vision.pose.PoseDetectorOptionsBase.HardwareConfig int... r2) {
                r0 = this;
                com.google.mlkit.vision.pose.PoseDetectorOptionsBase$Builder r1 = super.setPreferredHardwareConfigs(r1, r2)
                com.google.mlkit.vision.pose.defaults.PoseDetectorOptions$Builder r1 = (com.google.mlkit.vision.pose.defaults.PoseDetectorOptions.Builder) r1
                return r1
        }
    }

    /* synthetic */ PoseDetectorOptions(com.google.mlkit.vision.pose.defaults.PoseDetectorOptions.Builder r1, com.google.mlkit.vision.pose.defaults.zza r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }
}
