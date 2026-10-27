package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzmf {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf zzb = null;
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzmj zzc;
    private final java.util.concurrent.ConcurrentMap zzd;

    static {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf.zzb = r0
            return
    }

    private zzmf() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.zzd = r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlo r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlo
            r0.<init>()
            r1.zzc = r0
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf zza() {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf.zzb
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi zzb(java.lang.Class r3) {
            r2 = this;
            java.lang.String r0 = "messageType"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zzc(r3, r0)
            java.util.concurrent.ConcurrentMap r1 = r2.zzd
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi) r1
            if (r1 != 0) goto L24
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmj r1 = r2.zzc
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r1 = r1.zza(r3)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zzc(r3, r0)
            java.util.concurrent.ConcurrentMap r0 = r2.zzd
            java.lang.Object r3 = r0.putIfAbsent(r3, r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r3 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi) r3
            if (r3 != 0) goto L23
            return r1
        L23:
            return r3
        L24:
            return r1
    }
}
