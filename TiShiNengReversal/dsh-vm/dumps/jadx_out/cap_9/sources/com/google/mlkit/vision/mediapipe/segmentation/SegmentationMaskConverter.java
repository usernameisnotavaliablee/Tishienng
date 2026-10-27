package com.google.mlkit.vision.mediapipe.segmentation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class SegmentationMaskConverter implements com.google.mlkit.vision.mediapipe.Converter<com.google.mlkit.vision.mediapipe.segmentation.SegmentationMaskHolder> {
    public SegmentationMaskConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.mlkit.vision.mediapipe.Converter
    @androidx.annotation.NonNull
    public final /* bridge */ /* synthetic */ java.lang.Object zza(@androidx.annotation.NonNull java.util.List r5) throws com.google.mlkit.common.MlKitException {
            r4 = this;
            int r0 = r5.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L9
            goto La
        L9:
            r2 = 0
        La:
            java.lang.String r0 = "The output of Segmentation contains more than one packet, which is not expected."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2, r0)
            java.lang.Object r5 = r5.get(r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv) r5
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzhy.zzb(r5)
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzhy.zza(r5)
            int r2 = r0 * r1
            int r2 = r2 * 4
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhy.zzd(r5, r2)
            com.google.mlkit.vision.mediapipe.segmentation.SegmentationMaskHolder r5 = new com.google.mlkit.vision.mediapipe.segmentation.SegmentationMaskHolder
            r5.<init>(r2, r0, r1)
            return r5
    }
}
