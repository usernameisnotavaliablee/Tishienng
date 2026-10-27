package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzj extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzv implements com.google.android.gms.internal.mlkit_vision_mediapipe.zzaf {
    protected zzj(java.util.logging.Level r1, boolean r2) {
            r0 = this;
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzv
    protected final com.google.android.gms.internal.mlkit_vision_mediapipe.zzdu zza() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdw r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzds.zzb()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzv
    protected final boolean zzb(@org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa r6) {
            r5 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh r0 = r5.zzh()
            int r1 = r0.zza()
            r2 = 0
        L9:
            if (r2 >= r1) goto L30
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r3 = r0.zzb(r2)
            java.lang.String r3 = r3.zzf()
            java.lang.String r4 = "eye3tag"
            if (r3 != r4) goto L2d
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzt.zza
            java.lang.Object r1 = r0.zzc(r1)
            if (r1 != 0) goto L30
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzt.zzi
            java.lang.Object r0 = r0.zzc(r1)
            if (r0 != 0) goto L30
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzat r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzat.zza
            r5.zzl(r1, r0)
            goto L30
        L2d:
            int r2 = r2 + 1
            goto L9
        L30:
            boolean r6 = super.zzb(r6)
            return r6
    }
}
