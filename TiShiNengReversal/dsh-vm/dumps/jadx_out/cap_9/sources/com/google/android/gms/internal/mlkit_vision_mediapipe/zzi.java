package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzi extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzao {
    private static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzac zza = null;
    private final java.util.concurrent.atomic.AtomicLong zzb;

    static {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzg r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzg
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzi.zza = r0
            return
    }

    zzi() {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = -1
            r0.<init>(r1)
            r3.zzb = r0
            return
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    static com.google.android.gms.internal.mlkit_vision_mediapipe.zzao zza(com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh r6, com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa r7, long r8) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzt.zzd
            java.lang.Object r0 = r6.zzc(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzh r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzh) r0
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzac r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzi.zza
            java.lang.Object r6 = r0.zzb(r7, r6)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzi r6 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzi) r6
            r2 = 0
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 < 0) goto L1c
            r7 = 1
            goto L1d
        L1c:
            r7 = 0
        L1d:
            java.lang.String r0 = "timestamp cannot be negative"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zzc(r7, r0)
            java.util.concurrent.atomic.AtomicLong r7 = r6.zzb
            long r4 = r7.get()
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 >= 0) goto L33
            java.util.concurrent.atomic.AtomicLong r7 = r6.zzb
            long r8 = -r8
            r7.compareAndSet(r4, r8)
            return r6
        L33:
            throw r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzao
    public final void zzb() {
            r5 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r5.zzb
            long r0 = r0.get()
            long r0 = -r0
            java.util.concurrent.atomic.AtomicLong r2 = r5.zzb
            r3 = 0
            long r0 = java.lang.Math.max(r0, r3)
            r2.set(r0)
            return
    }
}
