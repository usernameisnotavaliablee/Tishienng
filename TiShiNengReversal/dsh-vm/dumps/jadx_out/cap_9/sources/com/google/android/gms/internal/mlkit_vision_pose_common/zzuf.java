package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public enum zzuf extends java.lang.Enum implements com.google.android.gms.internal.mlkit_vision_pose_common.zzck {
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzuf zza = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzuf zzb = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzuf zzc = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzuf zzd = null;
    private static final /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzuf[] zze = null;
    private final int zzf;

    static {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuf r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzuf
            java.lang.String r1 = "UNKNOWN_SOURCE"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuf.zza = r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuf r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzuf
            java.lang.String r3 = "MLKIT"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuf.zzb = r1
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuf r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzuf
            java.lang.String r5 = "NNAPI"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuf.zzc = r3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuf r5 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzuf
            java.lang.String r7 = "OPEN_GL"
            r8 = 3
            r5.<init>(r7, r8, r8)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuf.zzd = r5
            r7 = 4
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuf[] r7 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzuf[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuf.zze = r7
            return
    }

    zzuf(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzf = r3
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_pose_common.zzuf[] values() {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuf[] r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzuf.zze
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuf[] r0 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzuf[]) r0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzck
    public final int zza() {
            r1 = this;
            int r0 = r1.zzf
            return r0
    }
}
