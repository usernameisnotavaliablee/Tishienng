package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzdn extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzdo {
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzdm zza;

    private zzdn(com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r2, int r3, com.google.android.gms.internal.mlkit_vision_mediapipe.zzdm r4) {
            r1 = this;
            r1.<init>(r2, r3)
            r1.zza = r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "%"
            r3.<init>(r0)
            r2.zzh(r3)
            r0 = 1
            boolean r2 = r2.zzk()
            if (r0 == r2) goto L19
            r2 = 116(0x74, float:1.63E-43)
            goto L1b
        L19:
            r2 = 84
        L1b:
            r3.append(r2)
            char r2 = r4.zza()
            r3.append(r2)
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_mediapipe.zzdo zza(com.google.android.gms.internal.mlkit_vision_mediapipe.zzdm r1, com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r2, int r3) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdn r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdn
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzdo
    protected final void zzb(com.google.android.gms.internal.mlkit_vision_mediapipe.zzdp r3, java.lang.Object r4) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdm r0 = r2.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r1 = r2.zzd()
            r3.zze(r4, r0, r1)
            return
    }
}
