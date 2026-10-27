package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzwv {

    @androidx.annotation.Nullable
    private static com.google.android.gms.internal.mlkit_vision_pose_common.zzwu zza;

    public zzwv() {
            r1 = this;
            r1.<init>()
            return
    }

    public static synchronized com.google.android.gms.internal.mlkit_vision_pose_common.zzwk zza(com.google.android.gms.internal.mlkit_vision_pose_common.zzwd r3) {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_pose_common.zzwv> r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwv.class
            monitor-enter(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwu r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwv.zza     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L12
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwu r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzwu     // Catch: java.lang.Throwable -> L10
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwv.zza = r1     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L1c
        L12:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwu r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwv.zza     // Catch: java.lang.Throwable -> L10
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwk r3 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzwk) r3     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return r3
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    public static synchronized com.google.android.gms.internal.mlkit_vision_pose_common.zzwk zzb(java.lang.String r1) {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_pose_common.zzwv> r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwv.class
            monitor-enter(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwc r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwd.zzd(r1)     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwd r1 = r1.zzd()     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwk r1 = zza(r1)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }
}
