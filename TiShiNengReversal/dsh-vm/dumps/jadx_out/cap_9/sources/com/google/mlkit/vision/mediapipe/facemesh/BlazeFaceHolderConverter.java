package com.google.mlkit.vision.mediapipe.facemesh;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class BlazeFaceHolderConverter implements com.google.mlkit.vision.mediapipe.Converter<com.google.mlkit.vision.mediapipe.facemesh.FaceMeshListHolder> {
    private final int zza;
    private final int zzb;

    @com.google.android.gms.common.annotation.KeepForSdk
    public BlazeFaceHolderConverter(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
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
            java.lang.String r0 = "The output of face mesh detection contains more than one packet, which is not expected."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2, r0)
            java.lang.Object r4 = r4.get(r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r4 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv) r4
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzme r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzno.zzc()
            java.util.List r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzhy.zzc(r4, r0)
            int r0 = r3.zza
            int r1 = r3.zzb
            com.google.mlkit.vision.mediapipe.facemesh.FaceMeshListHolder r2 = new com.google.mlkit.vision.mediapipe.facemesh.FaceMeshListHolder
            r2.<init>(r4, r0, r1)
            return r2
    }
}
