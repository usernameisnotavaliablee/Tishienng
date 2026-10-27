package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzlo implements com.google.android.gms.internal.mlkit_vision_mediapipe.zzmj {
    private static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzlu zza = null;
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzlu zzb;

    static {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlm r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlm
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlo.zza = r0
            return
    }

    public zzlo() {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzln r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzln
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkj r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkj.zza()
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf.zza
            r2 = 2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlu[] r2 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlu[r2]
            r3 = 0
            r2[r3] = r1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlu r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlo.zza
            r3 = 1
            r2[r3] = r1
            r0.<init>(r2)
            r4.<init>()
            byte[] r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zzb
            r4.zzb = r0
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzmj
    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi zza(java.lang.Class r9) {
            r8 = this;
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr> r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr.class
            boolean r0 = r0.isAssignableFrom(r9)
            if (r0 != 0) goto Lc
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf.zza
        Lc:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlu r0 = r8.zzb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlt r2 = r0.zzb(r9)
            boolean r0 = r2.zzb()
            if (r0 != 0) goto L41
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmc r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmd.zza()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlj r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlk.zza()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmw r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzm()
            int r0 = r2.zzc()
            int r0 = r0 + (-1)
            r1 = 1
            if (r0 == r1) goto L35
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzke.zza()
        L33:
            r6 = r0
            goto L37
        L35:
            r0 = 0
            goto L33
        L37:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlr r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzls.zza()
            r1 = r9
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zzl(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L41:
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmw r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzm()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkc r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzke.zza()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r1 = r2.zza()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzma r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzma.zzc(r9, r0, r1)
            return r9
    }
}
