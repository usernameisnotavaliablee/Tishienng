package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzab implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa zza;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zzac zzb;

    zzab(com.google.android.gms.internal.mlkit_vision_mediapipe.zzac r1, com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzac r0 = r2.zzb
            java.util.concurrent.ConcurrentHashMap r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzac.zzc(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa r1 = r2.zza
            r0.remove(r1)
            return
    }
}
