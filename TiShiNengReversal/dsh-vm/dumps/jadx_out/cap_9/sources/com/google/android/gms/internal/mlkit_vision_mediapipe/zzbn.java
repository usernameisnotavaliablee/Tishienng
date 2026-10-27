package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzbn extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzbq {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzbp zzc;
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzbo zzd;

    /* synthetic */ zzbn(com.google.android.gms.internal.mlkit_vision_mediapipe.zzbl r3, com.google.android.gms.internal.mlkit_vision_mediapipe.zzbm r4) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r2.zza = r4
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.zzb = r0
            java.util.Map r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzbl.zzf(r3)
            r4.putAll(r1)
            java.util.Map r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzbl.zze(r3)
            r0.putAll(r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbp r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzbl.zzc(r3)
            r2.zzc = r4
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbo r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzbl.zzb(r3)
            r2.zzd = r3
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzbq
    protected final void zza(com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbp r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzbp) r0
            if (r0 == 0) goto Le
            r0.zza(r2, r3, r4)
            return
        Le:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbp r0 = r1.zzc
            r0.zza(r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzbq
    protected final void zzb(com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r2, java.util.Iterator r3, java.lang.Object r4) {
            r1 = this;
            java.util.Map r0 = r1.zzb
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbo r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzbo) r0
            if (r0 == 0) goto Le
            r0.zza(r2, r3, r4)
            return
        Le:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbo r0 = r1.zzd
            if (r0 != 0) goto L13
            goto L21
        L13:
            java.util.Map r0 = r1.zza
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto L21
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbo r0 = r1.zzd
            r0.zza(r2, r3, r4)
            return
        L21:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()
            r1.zza(r2, r0, r4)
            goto L21
        L2f:
            return
    }
}
