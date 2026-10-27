package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzca extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzce {
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh zza;
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh zzb;
    private final int[] zzc;
    private final int zzd;

    /* synthetic */ zzca(com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh r9, com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh r10, com.google.android.gms.internal.mlkit_vision_mediapipe.zzbz r11) {
            r8 = this;
            r11 = 0
            r8.<init>(r11)
            r8.zza = r9
            r8.zzb = r10
            int r9 = r10.zza()
            r10 = 28
            r11 = 0
            r0 = 1
            if (r9 > r10) goto L14
            r10 = 1
            goto L15
        L14:
            r10 = 0
        L15:
            java.lang.String r1 = "metadata size too large"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zzc(r10, r1)
            int[] r9 = new int[r9]
            r8.zzc = r9
            r1 = 0
            r10 = 0
            r3 = 0
        L22:
            int r4 = r9.length
            if (r10 >= r4) goto L66
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r4 = r8.zzi(r10)
            long r5 = r4.zzc()
            long r5 = r5 | r1
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 != 0) goto L5d
            r1 = 0
        L33:
            r2 = -1
            if (r1 >= r3) goto L48
            r7 = r9[r1]
            r7 = r7 & 31
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r7 = r8.zzi(r7)
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L45
            goto L49
        L45:
            int r1 = r1 + 1
            goto L33
        L48:
            r1 = -1
        L49:
            if (r1 == r2) goto L5d
            boolean r2 = r4.zzi()
            if (r2 == 0) goto L59
            r2 = r9[r1]
            int r4 = r10 + 4
            int r4 = r0 << r4
            r2 = r2 | r4
            goto L5a
        L59:
            r2 = r10
        L5a:
            r9[r1] = r2
            goto L62
        L5d:
            int r1 = r3 + 1
            r9[r3] = r10
            r3 = r1
        L62:
            int r10 = r10 + 1
            r1 = r5
            goto L22
        L66:
            r8.zzd = r3
            return
    }

    static /* bridge */ /* synthetic */ int zzd(com.google.android.gms.internal.mlkit_vision_mediapipe.zzca r0) {
            int r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zzai zze(com.google.android.gms.internal.mlkit_vision_mediapipe.zzca r0, int r1) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r0 = r0.zzi(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object zzf(com.google.android.gms.internal.mlkit_vision_mediapipe.zzca r0, int r1) {
            java.lang.Object r0 = r0.zzj(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ int[] zzg(com.google.android.gms.internal.mlkit_vision_mediapipe.zzca r0) {
            int[] r0 = r0.zzc
            return r0
    }

    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzai zzi(int r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh r0 = r2.zza
            int r1 = r0.zza()
            if (r3 < r1) goto L10
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh r0 = r2.zzb
            int r3 = r3 - r1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r3 = r0.zzb(r3)
            return r3
        L10:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r3 = r0.zzb(r3)
            return r3
    }

    private final java.lang.Object zzj(int r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh r0 = r2.zza
            int r1 = r0.zza()
            if (r3 < r1) goto L10
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh r0 = r2.zzb
            int r3 = r3 - r1
            java.lang.Object r3 = r0.zzd(r3)
            return r3
        L10:
            java.lang.Object r3 = r0.zzd(r3)
            return r3
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzce
    public final int zza() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzce
    public final java.util.Set zzb() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbw r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzbw
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzce
    public final void zzc(com.google.android.gms.internal.mlkit_vision_mediapipe.zzbq r6, java.lang.Object r7) {
            r5 = this;
            r0 = 0
        L1:
            int r1 = r5.zzd
            if (r0 >= r1) goto L2d
            int[] r1 = r5.zzc
            r1 = r1[r0]
            r2 = r1 & 31
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r2 = r5.zzi(r2)
            boolean r3 = r2.zzi()
            if (r3 != 0) goto L21
            java.lang.Object r1 = r5.zzj(r1)
            java.lang.Object r1 = r2.zze(r1)
            r6.zza(r2, r1, r7)
            goto L2a
        L21:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzby r3 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzby
            r4 = 0
            r3.<init>(r5, r2, r1, r4)
            r6.zzb(r2, r3, r7)
        L2a:
            int r0 = r0 + 1
            goto L1
        L2d:
            return
    }
}
