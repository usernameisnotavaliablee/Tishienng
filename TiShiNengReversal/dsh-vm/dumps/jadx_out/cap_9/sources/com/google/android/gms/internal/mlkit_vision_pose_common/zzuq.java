package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public enum zzuq extends java.lang.Enum implements com.google.android.gms.internal.mlkit_vision_pose_common.zzck {
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzuq zza = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzuq zzb = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzuq zzc = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzuq zzd = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzuq zze = null;
    private static final /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzuq[] zzf = null;
    private final int zzg;

    static {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuq r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzuq
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuq.zza = r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuq r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzuq
            java.lang.String r3 = "SUCCESS"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuq.zzb = r1
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuq r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzuq
            java.lang.String r5 = "PIPELINE_ERROR"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuq.zzc = r3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuq r5 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzuq
            java.lang.String r7 = "CANNOT_ACCESS_STORAGE"
            r8 = 3
            r5.<init>(r7, r8, r8)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuq.zzd = r5
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuq r7 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzuq
            java.lang.String r9 = "CANNOT_GET_SYSTEM_INFO"
            r10 = 4
            r7.<init>(r9, r10, r10)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuq.zze = r7
            r9 = 5
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuq[] r9 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzuq[r9]
            r9[r2] = r0
            r9[r4] = r1
            r9[r6] = r3
            r9[r8] = r5
            r9[r10] = r7
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuq.zzf = r9
            return
    }

    zzuq(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzg = r3
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_pose_common.zzuq[] values() {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuq[] r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzuq.zzf
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzuq[] r0 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzuq[]) r0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzck
    public final int zza() {
            r1 = this;
            int r0 = r1.zzg
            return r0
    }
}
