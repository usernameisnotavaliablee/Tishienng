package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zznb extends com.google.android.gms.internal.mlkit_vision_mediapipe.zznc {
    zznb(sun.misc.Unsafe r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zznc
    public final double zza(java.lang.Object r2, long r3) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.zza
            long r2 = r0.getLong(r2, r3)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zznc
    public final float zzb(java.lang.Object r2, long r3) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.zza
            int r2 = r0.getInt(r2, r3)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zznc
    public final void zzc(java.lang.Object r2, long r3, boolean r5) {
            r1 = this;
            boolean r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzb
            if (r0 == 0) goto L8
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzi(r2, r3, r5)
            return
        L8:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzj(r2, r3, r5)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zznc
    public final void zzd(java.lang.Object r2, long r3, byte r5) {
            r1 = this;
            boolean r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzb
            if (r0 == 0) goto L8
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzk(r2, r3, r5)
            return
        L8:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzl(r2, r3, r5)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zznc
    public final void zze(java.lang.Object r7, long r8, double r10) {
            r6 = this;
            long r4 = java.lang.Double.doubleToLongBits(r10)
            sun.misc.Unsafe r0 = r6.zza
            r1 = r7
            r2 = r8
            r0.putLong(r1, r2, r4)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zznc
    public final void zzf(java.lang.Object r2, long r3, float r5) {
            r1 = this;
            int r5 = java.lang.Float.floatToIntBits(r5)
            sun.misc.Unsafe r0 = r1.zza
            r0.putInt(r2, r3, r5)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zznc
    public final boolean zzg(java.lang.Object r2, long r3) {
            r1 = this;
            boolean r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzb
            if (r0 == 0) goto L9
            boolean r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzt(r2, r3)
            return r2
        L9:
            boolean r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzu(r2, r3)
            return r2
    }
}
