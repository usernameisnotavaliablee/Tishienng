package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzar extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzao {
    private static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzac zzb = null;
    private static final java.lang.ThreadLocal zze = null;
    final java.util.concurrent.atomic.AtomicInteger zza;

    static {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzap r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzap
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzar.zzb = r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzaq r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzaq
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzar.zze = r0
            return
    }

    zzar() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.zza = r0
            return
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    static com.google.android.gms.internal.mlkit_vision_mediapipe.zzao zza(com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa r3) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzt.zzc
            java.lang.Object r0 = r2.zzc(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L3e
            int r1 = r0.intValue()
            if (r1 > 0) goto L11
            goto L3e
        L11:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzac r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzar.zzb
            java.lang.Object r2 = r1.zzb(r3, r2)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzar r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzar) r2
            int r3 = r0.intValue()
            java.lang.ThreadLocal r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzar.zze
            java.lang.Object r0 = r0.get()
            java.util.Random r0 = (java.util.Random) r0
            int r3 = r0.nextInt(r3)
            if (r3 != 0) goto L32
            java.util.concurrent.atomic.AtomicInteger r3 = r2.zza
            int r3 = r3.incrementAndGet()
            goto L38
        L32:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.zza
            int r3 = r3.get()
        L38:
            if (r3 <= 0) goto L3b
            return r2
        L3b:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzao r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzao.zzc
            return r2
        L3e:
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzao
    public final void zzb() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.zza
            r0.decrementAndGet()
            return
    }
}
