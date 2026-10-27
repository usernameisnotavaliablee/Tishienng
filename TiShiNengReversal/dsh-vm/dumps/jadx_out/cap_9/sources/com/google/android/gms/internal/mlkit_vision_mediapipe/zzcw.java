package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzcw extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzck {
    private final java.lang.String zza;
    private final java.util.logging.Level zzb;
    private final java.util.Set zzc;
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzbq zzd;
    private final int zze;

    zzcw(java.lang.String r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String r2, boolean r3, int r4, boolean r5, boolean r6) {
            r0 = this;
            java.util.logging.Level r1 = java.util.logging.Level.ALL
            java.util.Set r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcy.zzg()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbq r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcy.zze()
            r0.<init>(r2)
            java.lang.String r2 = ""
            r0.zza = r2
            r2 = 2
            r0.zze = r2
            r0.zzb = r1
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd
    public final void zzc(com.google.android.gms.internal.mlkit_vision_mediapipe.zzbb r9) {
            r8 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh r0 = r9.zzh()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzau.zza
            java.lang.Object r0 = r0.zzc(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L12
            java.lang.String r0 = r8.zza()
        L12:
            if (r0 != 0) goto L2f
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzz r0 = r9.zzf()
            java.lang.String r0 = r0.zzb()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            r2 = 36
            int r1 = r0.indexOf(r2, r1)
            if (r1 < 0) goto L2f
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
        L2f:
            java.lang.String r1 = r8.zza
            java.util.logging.Level r5 = r8.zzb
            java.util.Set r6 = r8.zzc
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbq r7 = r8.zzd
            r2 = 1
            java.lang.String r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcp.zza(r1, r0, r2)
            r4 = 2
            r2 = r9
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcy.zzh(r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd
    public final boolean zzd(java.util.logging.Level r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
