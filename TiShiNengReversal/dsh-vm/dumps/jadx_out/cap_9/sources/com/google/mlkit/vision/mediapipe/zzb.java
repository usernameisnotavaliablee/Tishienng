package com.google.mlkit.vision.mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzb implements com.google.mlkit.vision.mediapipe.MediaPipeInput {
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzfc zza;

    static {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_mediapipe.zzfc> r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzfc.class
            java.lang.String r1 = "drishti.InferenceCalculatorOptions.Delegate"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzic.zza(r0, r1)
            return
    }

    zzb(boolean r3, boolean r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzen r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzet.zza()
            r1 = 1
            r0.zzd(r1)
            if (r3 == 0) goto L1b
            r3 = 3
            r0.zze(r3)
            r0.zza(r4)
            r0.zzc(r5)
            r0.zzb(r6)
            goto L1f
        L1b:
            r3 = 2
            r0.zze(r3)
        L1f:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzeg r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzfc.zza()
            r3.zza(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r3 = r3.zzi()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzfc r3 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzfc) r3
            r2.zza = r3
            return
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeInput
    public final long zza() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeInput
    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv zzb(com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzfc r0 = r1.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r2 = r2.zze(r0)
            return r2
    }
}
