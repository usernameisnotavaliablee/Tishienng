package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzxq {

    @androidx.annotation.Nullable
    private static com.google.android.gms.internal.mlkit_vision_pose_common.zzxq zza;

    private zzxq() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized com.google.android.gms.internal.mlkit_vision_pose_common.zzxq zza() {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_pose_common.zzxq> r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxq.class
            monitor-enter(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxq r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxq.zza     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxq r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzxq     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxq.zza = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzxq r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzxq.zza     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public static final boolean zzb() {
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "oriole"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L12
            java.lang.String r1 = "raven"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L18
        L12:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 >= r1) goto L26
        L18:
            zza()
            java.lang.String r0 = ""
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L24
            goto L26
        L24:
            r0 = 0
            return r0
        L26:
            r0 = 1
            return r0
    }
}
