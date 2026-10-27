package com.google.mlkit.vision.mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzj implements com.google.mlkit.vision.mediapipe.MediaPipeInput {
    private final java.nio.ByteBuffer zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    zzj(java.nio.ByteBuffer r1, int r2, int r3, long r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeInput
    public final long zza() {
            r2 = this;
            long r0 = r2.zzd
            return r0
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeInput
    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv zzb(com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl r4) {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.zza
            int r1 = r3.zzb
            int r2 = r3.zzc
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r4 = r4.zzf(r0, r1, r2)
            return r4
    }
}
