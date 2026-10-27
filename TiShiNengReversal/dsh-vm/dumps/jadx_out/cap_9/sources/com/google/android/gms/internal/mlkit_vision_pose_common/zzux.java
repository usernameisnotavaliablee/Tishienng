package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public enum zzux extends java.lang.Enum implements com.google.android.gms.internal.mlkit_vision_pose_common.zzck {
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzux zza = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzux zzb = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzux zzc = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzux zzd = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzux zze = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzux zzf = null;
    private static final /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzux[] zzg = null;
    private final int zzh;

    static {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzux r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzux
            java.lang.String r1 = "UNKNOWN_METRIC"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzux.zza = r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzux r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzux
            java.lang.String r3 = "MEAN_ABSOLUTE_ERROR"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzux.zzb = r1
            com.google.android.gms.internal.mlkit_vision_pose_common.zzux r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzux
            java.lang.String r5 = "MEAN_SQUARED_ERROR"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzux.zzc = r3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzux r5 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzux
            java.lang.String r7 = "ROOT_MEAN_SQUARED_ERROR"
            r8 = 3
            r5.<init>(r7, r8, r8)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzux.zzd = r5
            com.google.android.gms.internal.mlkit_vision_pose_common.zzux r7 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzux
            java.lang.String r9 = "KL_DIVERGENCE"
            r10 = 4
            r7.<init>(r9, r10, r10)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzux.zze = r7
            com.google.android.gms.internal.mlkit_vision_pose_common.zzux r9 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzux
            java.lang.String r11 = "SYMMETRIC_KL_DIVERGENCE"
            r12 = 5
            r9.<init>(r11, r12, r12)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzux.zzf = r9
            r11 = 6
            com.google.android.gms.internal.mlkit_vision_pose_common.zzux[] r11 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzux[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            com.google.android.gms.internal.mlkit_vision_pose_common.zzux.zzg = r11
            return
    }

    zzux(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzh = r3
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_pose_common.zzux[] values() {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzux[] r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzux.zzg
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzux[] r0 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzux[]) r0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzck
    public final int zza() {
            r1 = this;
            int r0 = r1.zzh
            return r0
    }
}
