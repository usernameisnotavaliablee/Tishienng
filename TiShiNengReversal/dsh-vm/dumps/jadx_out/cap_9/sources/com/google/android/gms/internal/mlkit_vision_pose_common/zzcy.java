package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzcy extends com.google.android.gms.internal.mlkit_vision_pose_common.zzcv {
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzdo zza;

    public zzcy() {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdo
            r1 = 0
            r0.<init>(r1)
            r2.zza = r0
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 == r3) goto L16
            boolean r1 = r4 instanceof com.google.android.gms.internal.mlkit_vision_pose_common.zzcy
            r2 = 0
            if (r1 == 0) goto L15
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcy r4 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzcy) r4
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r4 = r4.zza
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r1 = r3.zza
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L15
            return r0
        L15:
            return r2
        L16:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzcy zza(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r2 = r1.zza
            java.lang.String r0 = "authToken"
            java.lang.Object r2 = r2.get(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzcy r2 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzcy) r2
            return r2
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzdb zzc(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdb r2 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzdb) r2
            return r2
    }

    public final java.util.Set zzd() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r0 = r1.zza
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    public final void zze(java.lang.String r2, com.google.android.gms.internal.mlkit_vision_pose_common.zzcv r3) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r0 = r1.zza
            r0.put(r2, r3)
            return
    }
}
