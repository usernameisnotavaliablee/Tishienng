package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public enum zzus extends java.lang.Enum implements com.google.android.gms.internal.mlkit_vision_pose_common.zzck {
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzus zza = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzus zzb = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzus zzc = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzus zzd = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzus zze = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzus zzf = null;
    private static final /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzus[] zzg = null;
    private final int zzh;

    static {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzus r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzus
            java.lang.String r1 = "UNKNOWN_STATUS"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzus.zza = r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzus r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzus
            java.lang.String r3 = "COMPLETED_EVENT"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzus.zzb = r1
            com.google.android.gms.internal.mlkit_vision_pose_common.zzus r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzus
            java.lang.String r5 = "MISSING_END_EVENT"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzus.zzc = r3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzus r5 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzus
            java.lang.String r7 = "HANG"
            r8 = 3
            r5.<init>(r7, r8, r8)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzus.zzd = r5
            com.google.android.gms.internal.mlkit_vision_pose_common.zzus r7 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzus
            java.lang.String r9 = "ABANDONED_FROM_HANG"
            r10 = 4
            r7.<init>(r9, r10, r10)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzus.zze = r7
            com.google.android.gms.internal.mlkit_vision_pose_common.zzus r9 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzus
            java.lang.String r11 = "FORCED_CRASH_FROM_HANG"
            r12 = 5
            r9.<init>(r11, r12, r12)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzus.zzf = r9
            r11 = 6
            com.google.android.gms.internal.mlkit_vision_pose_common.zzus[] r11 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzus[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            com.google.android.gms.internal.mlkit_vision_pose_common.zzus.zzg = r11
            return
    }

    zzus(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzh = r3
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_pose_common.zzus[] values() {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzus[] r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzus.zzg
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzus[] r0 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzus[]) r0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzck
    public final int zza() {
            r1 = this;
            int r0 = r1.zzh
            return r0
    }
}
