package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzcj {
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzdu zza;
    private final java.lang.String zzb;

    public zzcj(com.google.android.gms.internal.mlkit_vision_mediapipe.zzdu r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "parser"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zza(r2, r0)
            r1.zza = r2
            java.lang.String r2 = "message"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zza(r3, r2)
            r1.zzb = r3
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzcj
            r1 = 0
            if (r0 == 0) goto L1d
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcj r4 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzcj) r4
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdu r0 = r3.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdu r2 = r4.zza
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1d
            java.lang.String r0 = r3.zzb
            java.lang.String r4 = r4.zzb
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L1d
            r4 = 1
            return r4
        L1d:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.zzb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdu r1 = r2.zza
            int r1 = r1.hashCode()
            int r0 = r0.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzdu zza() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdu r0 = r1.zza
            return r0
    }

    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }
}
