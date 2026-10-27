package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzan {
    private static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzac zza = null;
    private final java.util.concurrent.atomic.AtomicBoolean zzb;
    private final java.util.concurrent.atomic.AtomicInteger zzc;

    static {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzal r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzal
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzan.zza = r0
            return
    }

    private zzan() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.zzb = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.zzc = r0
            return
    }

    /* synthetic */ zzan(com.google.android.gms.internal.mlkit_vision_mediapipe.zzam r1) {
            r0 = this;
            r0.<init>()
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>()
            r0.zzb = r1
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>()
            r0.zzc = r1
            return
    }

    static int zza(com.google.android.gms.internal.mlkit_vision_mediapipe.zzao r4, com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa r5, com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh r6) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzac r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzan.zza
            java.lang.Object r5 = r0.zzb(r5, r6)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzan r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzan) r5
            java.util.concurrent.atomic.AtomicInteger r6 = r5.zzc
            int r6 = r6.incrementAndGet()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzao r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzao.zzc
            r1 = -1
            if (r4 == r0) goto L35
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.zzb
            r2 = 1
            r3 = 0
            boolean r0 = r0.compareAndSet(r3, r2)
            if (r0 != 0) goto L1e
            goto L35
        L1e:
            r4.zzb()     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.zzb
            r4.set(r3)
            java.util.concurrent.atomic.AtomicInteger r4 = r5.zzc
            int r5 = -r6
            r4.addAndGet(r5)
            int r6 = r6 + r1
            return r6
        L2e:
            r4 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.zzb
            r5.set(r3)
            throw r4
        L35:
            return r1
    }
}
