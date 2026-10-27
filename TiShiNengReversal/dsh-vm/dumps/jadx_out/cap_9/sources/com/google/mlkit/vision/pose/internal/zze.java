package com.google.mlkit.vision.pose.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zze extends com.google.mlkit.common.sdkinternal.LazyInstanceMap {
    private final com.google.mlkit.common.sdkinternal.MlKitContext zza;

    public zze(@androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.MlKitContext r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    @androidx.annotation.NonNull
    protected final /* bridge */ /* synthetic */ java.lang.Object create(@androidx.annotation.NonNull java.lang.Object r4) {
            r3 = this;
            com.google.mlkit.common.sdkinternal.MlKitContext r0 = r3.zza
            com.google.mlkit.vision.pose.PoseDetectorOptionsBase r4 = (com.google.mlkit.vision.pose.PoseDetectorOptionsBase) r4
            com.google.mlkit.vision.pose.internal.zzh r1 = new com.google.mlkit.vision.pose.internal.zzh
            java.lang.String r2 = "pose-detection-common"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwk r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwv.zzb(r2)
            r1.<init>(r0, r4, r2)
            return r1
    }
}
