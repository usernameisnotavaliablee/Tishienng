package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzdq {
    public zzdq() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_pose_common.zzcv zza(com.google.android.gms.internal.mlkit_vision_pose_common.zzdu r2) throws com.google.android.gms.internal.mlkit_vision_pose_common.zzcz {
            r2.zzn()     // Catch: java.lang.NumberFormatException -> Lf java.io.IOException -> L16 com.google.android.gms.internal.mlkit_vision_pose_common.zzdx -> L1d java.io.EOFException -> L24
            r0 = 0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzde r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzds.zza     // Catch: java.io.EOFException -> Ld java.lang.NumberFormatException -> Lf java.io.IOException -> L16 com.google.android.gms.internal.mlkit_vision_pose_common.zzdx -> L1d
            java.lang.Object r2 = r1.zza(r2)     // Catch: java.io.EOFException -> Ld java.lang.NumberFormatException -> Lf java.io.IOException -> L16 com.google.android.gms.internal.mlkit_vision_pose_common.zzdx -> L1d
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcv r2 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzcv) r2     // Catch: java.io.EOFException -> Ld java.lang.NumberFormatException -> Lf java.io.IOException -> L16 com.google.android.gms.internal.mlkit_vision_pose_common.zzdx -> L1d
            return r2
        Ld:
            r2 = move-exception
            goto L26
        Lf:
            r2 = move-exception
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdc r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdc
            r0.<init>(r2)
            throw r0
        L16:
            r2 = move-exception
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcw r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzcw
            r0.<init>(r2)
            throw r0
        L1d:
            r2 = move-exception
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdc r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdc
            r0.<init>(r2)
            throw r0
        L24:
            r2 = move-exception
            r0 = 1
        L26:
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcx r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzcx.zza
            return r2
        L2b:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdc r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdc
            r0.<init>(r2)
            throw r0
    }
}
