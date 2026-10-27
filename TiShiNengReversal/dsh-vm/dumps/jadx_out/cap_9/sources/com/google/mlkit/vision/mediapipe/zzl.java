package com.google.mlkit.vision.mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzl implements com.google.mlkit.vision.mediapipe.MediaPipeInput {
    private final int zza;
    private final long zzb;

    zzl(int r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeInput
    public final long zza() {
            r2 = this;
            long r0 = r2.zzb
            return r0
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeInput
    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv zzb(com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl r2) {
            r1 = this;
            int r0 = r1.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r2 = r2.zzd(r0)
            return r2
    }
}
