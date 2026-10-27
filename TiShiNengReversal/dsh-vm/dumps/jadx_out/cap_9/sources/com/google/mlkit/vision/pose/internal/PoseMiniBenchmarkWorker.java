package com.google.mlkit.vision.pose.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class PoseMiniBenchmarkWorker extends com.google.mlkit.acceleration.internal.MiniBenchmarkWorker<com.google.mlkit.vision.pose.PoseDetectorOptionsBase, com.google.mlkit.vision.common.InputImage, com.google.mlkit.vision.pose.Pose> {
    @com.google.android.gms.common.annotation.KeepForSdk
    public PoseMiniBenchmarkWorker(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.NonNull androidx.work.WorkerParameters r9) {
            r7 = this;
            com.google.mlkit.common.sdkinternal.MlKitContext r0 = com.google.mlkit.common.sdkinternal.MlKitContext.initializeIfNeeded(r8)
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
            com.google.mlkit.acceleration.internal.PipelineId r4 = com.google.mlkit.vision.pose.internal.zzd.zzb()
            com.google.mlkit.vision.pose.internal.zzc r5 = new com.google.mlkit.vision.pose.internal.zzc
            r5.<init>(r8)
            com.google.mlkit.acceleration.internal.AccelerationLogger r6 = com.google.mlkit.vision.pose.internal.zzd.zza()
            r1 = r7
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }
}
