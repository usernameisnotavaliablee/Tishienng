package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzbl {
    private static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzbp zza = null;
    private static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzbo zzb = null;
    private final java.util.Map zzc;
    private final java.util.Map zzd;
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzbp zze;
    private com.google.android.gms.internal.mlkit_vision_mediapipe.zzbo zzf;

    static {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbi r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzbi
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbl.zza = r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbj r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzbj
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbl.zzb = r0
            return
    }

    /* synthetic */ zzbl(com.google.android.gms.internal.mlkit_vision_mediapipe.zzbp r1, com.google.android.gms.internal.mlkit_vision_mediapipe.zzbk r2) {
            r0 = this;
            r0.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.zzc = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.zzd = r2
            r2 = 0
            r0.zzf = r2
            r0.zze = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zzbo zzb(com.google.android.gms.internal.mlkit_vision_mediapipe.zzbl r0) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbo r0 = r0.zzf
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zzbp zzc(com.google.android.gms.internal.mlkit_vision_mediapipe.zzbl r0) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbp r0 = r0.zze
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map zze(com.google.android.gms.internal.mlkit_vision_mediapipe.zzbl r0) {
            java.util.Map r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map zzf(com.google.android.gms.internal.mlkit_vision_mediapipe.zzbl r0) {
            java.util.Map r0 = r0.zzc
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzbl zza(com.google.android.gms.internal.mlkit_vision_mediapipe.zzbo r1) {
            r0 = this;
            r0.zzf = r1
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzbq zzd() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbn r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzbn
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    final void zzg(com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r4) {
            r3 = this;
            java.lang.String r0 = "key"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zza(r4, r0)
            boolean r1 = r4.zzi()
            if (r1 == 0) goto L24
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbo r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzbl.zzb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zza(r4, r0)
            boolean r0 = r4.zzi()
            java.lang.String r2 = "key must be repeating"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zzc(r0, r2)
            java.util.Map r0 = r3.zzc
            r0.remove(r4)
            java.util.Map r0 = r3.zzd
            r0.put(r4, r1)
            return
        L24:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbp r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzbl.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zza(r4, r0)
            java.util.Map r0 = r3.zzd
            r0.remove(r4)
            java.util.Map r0 = r3.zzc
            r0.put(r4, r1)
            return
    }
}
