package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzf extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzao {
    private static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzac zza = null;
    private final java.util.concurrent.atomic.AtomicLong zzb;

    static {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zze r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zze
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzf.zza = r0
            return
    }

    zzf() {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r0.<init>(r1)
            r3.zzb = r0
            return
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    static com.google.android.gms.internal.mlkit_vision_mediapipe.zzao zza(com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh r4, com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa r5) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzt.zzb
            java.lang.Object r0 = r4.zzc(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto Lc
            r4 = 0
            return r4
        Lc:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzac r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzf.zza
            java.lang.Object r4 = r1.zzb(r5, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzf r4 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzf) r4
            java.util.concurrent.atomic.AtomicLong r5 = r4.zzb
            int r0 = r0.intValue()
            long r0 = (long) r0
            long r2 = r5.incrementAndGet()
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 < 0) goto L24
            return r4
        L24:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzao r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzao.zzc
            return r4
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzao
    public final void zzb() {
            r3 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r3.zzb
            r1 = 0
            r0.set(r1)
            return
    }
}
