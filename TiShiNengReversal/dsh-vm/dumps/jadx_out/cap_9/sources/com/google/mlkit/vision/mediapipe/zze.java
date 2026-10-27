package com.google.mlkit.vision.mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zze {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;
    final /* synthetic */ com.google.mlkit.vision.mediapipe.Converter zzb;

    zze(com.google.mlkit.vision.mediapipe.zzg r1, com.google.android.gms.tasks.TaskCompletionSource r2, com.google.mlkit.vision.mediapipe.Converter r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.<init>()
            return
    }

    public final void zza(java.util.List r3) {
            r2 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r2.zza     // Catch: com.google.mlkit.common.MlKitException -> Lc
            com.google.mlkit.vision.mediapipe.Converter r1 = r2.zzb     // Catch: com.google.mlkit.common.MlKitException -> Lc
            java.lang.Object r3 = r1.zza(r3)     // Catch: com.google.mlkit.common.MlKitException -> Lc
            r0.setResult(r3)     // Catch: com.google.mlkit.common.MlKitException -> Lc
            return
        Lc:
            r3 = move-exception
            com.google.android.gms.tasks.TaskCompletionSource r0 = r2.zza
            r0.setException(r3)
            return
    }
}
