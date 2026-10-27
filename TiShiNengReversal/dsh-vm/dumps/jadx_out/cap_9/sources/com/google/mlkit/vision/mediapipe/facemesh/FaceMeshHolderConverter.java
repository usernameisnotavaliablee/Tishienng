package com.google.mlkit.vision.mediapipe.facemesh;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class FaceMeshHolderConverter implements com.google.mlkit.vision.mediapipe.Converter<com.google.mlkit.vision.mediapipe.facemesh.FaceMeshListHolder> {
    private final int zza;
    private final int zzb;

    @com.google.android.gms.common.annotation.KeepForSdk
    public FaceMeshHolderConverter(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.mlkit.vision.mediapipe.Converter
    @androidx.annotation.NonNull
    public final /* bridge */ /* synthetic */ java.lang.Object zza(@androidx.annotation.NonNull java.util.List r10) throws com.google.mlkit.common.MlKitException {
            r9 = this;
            int r0 = r10.size()
            int r1 = r10.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = "The output of face detection contains %s packet, expecting 3 packets."
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r3 = 3
            if (r0 != r3) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            java.lang.Object r0 = r10.get(r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv) r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzme r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzfq.zzc()
            java.util.List r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzhy.zzc(r0, r1)
            java.lang.Object r0 = r10.get(r2)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv) r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzme r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzhj.zzg()
            java.util.List r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzhy.zzc(r0, r1)
            r0 = 2
            java.lang.Object r10 = r10.get(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r10 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv) r10
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzme r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzii.zzd()
            java.util.List r6 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzhy.zzc(r10, r0)
            int r7 = r9.zza
            int r8 = r9.zzb
            com.google.mlkit.vision.mediapipe.facemesh.FaceMeshListHolder r3 = new com.google.mlkit.vision.mediapipe.facemesh.FaceMeshListHolder
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
    }
}
