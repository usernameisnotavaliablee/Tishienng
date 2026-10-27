package com.google.mlkit.vision.mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.VisibleForTesting
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzf implements com.google.android.gms.internal.mlkit_vision_mediapipe.zzhz {
    final /* synthetic */ com.google.mlkit.vision.mediapipe.zzg zza;

    zzf(com.google.mlkit.vision.mediapipe.zzg r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzhz
    public final void zza(java.util.List<com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv> r4) {
            r3 = this;
            if (r4 == 0) goto L37
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L37
            r0 = 0
            java.lang.Object r0 = r4.get(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv) r0
            long r0 = r0.zzb()
            java.lang.String r2 = "From creating image packet to getting result packet"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zziq r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zziq.zze(r2)
            r2.zzd(r0)
            com.google.mlkit.vision.mediapipe.zzg r2 = r3.zza
            java.util.concurrent.ConcurrentHashMap r2 = com.google.mlkit.vision.mediapipe.zzg.zzb(r2)
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r2.remove(r0)
            com.google.mlkit.vision.mediapipe.zze r0 = (com.google.mlkit.vision.mediapipe.zze) r0
            if (r0 == 0) goto L37
            r0.zza(r4)
        L37:
            return
    }
}
