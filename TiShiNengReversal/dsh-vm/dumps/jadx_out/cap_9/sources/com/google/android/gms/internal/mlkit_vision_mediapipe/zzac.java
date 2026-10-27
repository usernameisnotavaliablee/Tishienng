package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzac {
    private final java.util.concurrent.ConcurrentHashMap zza;

    protected zzac() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.zza = r0
            return
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.ConcurrentHashMap zzc(com.google.android.gms.internal.mlkit_vision_mediapipe.zzac r0) {
            java.util.concurrent.ConcurrentHashMap r0 = r0.zza
            return r0
    }

    protected abstract java.lang.Object zza();

    public final java.lang.Object zzb(com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa r7, com.google.android.gms.internal.mlkit_vision_mediapipe.zzbh r8) {
            r6 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r6.zza
            java.lang.Object r0 = r0.get(r7)
            if (r0 == 0) goto L9
            return r0
        L9:
            java.lang.Object r0 = r6.zza()
            java.util.concurrent.ConcurrentHashMap r1 = r6.zza
            java.lang.Object r1 = r1.putIfAbsent(r7, r0)
            if (r1 != 0) goto L42
            int r1 = r8.zza()
            r2 = 0
            r3 = 0
        L1b:
            if (r2 >= r1) goto L41
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzt.zzf
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzai r5 = r8.zzb(r2)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L3e
            java.lang.Object r4 = r8.zzd(r2)
            boolean r5 = r4 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzag
            if (r5 != 0) goto L32
            goto L3e
        L32:
            if (r3 != 0) goto L39
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzab r3 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzab
            r3.<init>(r6, r7)
        L39:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzag r4 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzag) r4
            r4.zza()
        L3e:
            int r2 = r2 + 1
            goto L1b
        L41:
            return r0
        L42:
            return r1
    }
}
