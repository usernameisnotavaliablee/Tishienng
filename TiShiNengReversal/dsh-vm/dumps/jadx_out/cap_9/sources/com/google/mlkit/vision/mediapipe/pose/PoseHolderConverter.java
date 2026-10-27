package com.google.mlkit.vision.mediapipe.pose;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class PoseHolderConverter implements com.google.mlkit.vision.mediapipe.Converter<com.google.mlkit.vision.mediapipe.pose.PoseHolder> {
    public PoseHolderConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.mlkit.vision.mediapipe.Converter
    @androidx.annotation.NonNull
    public final /* bridge */ /* synthetic */ java.lang.Object zza(@androidx.annotation.NonNull java.util.List r4) throws com.google.mlkit.common.MlKitException {
            r3 = this;
            int r0 = r4.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L9
            goto La
        L9:
            r2 = 0
        La:
            java.lang.String r0 = "The output of Pose detection contains more than one packet, which is not expected."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2, r0)
            com.google.mlkit.vision.mediapipe.pose.PoseHolder r0 = new com.google.mlkit.vision.mediapipe.pose.PoseHolder     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L23
            java.lang.Object r4 = r4.get(r1)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L23
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r4 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv) r4     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L23
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzhy.zze(r4)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L23
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzfm r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzfm.zzc(r4)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L23
            r0.<init>(r4)     // Catch: com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb -> L23
            return r0
        L23:
            r4 = move-exception
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzc.zzb(r4)
            r1 = 13
            r0.<init>(r4, r1)
            throw r0
    }
}
