package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public enum zzpn extends java.lang.Enum implements com.google.android.gms.internal.mlkit_vision_pose_common.zzck {
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzpn zza = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzpn zzb = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzpn zzc = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzpn zzd = null;
    private static final /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzpn[] zze = null;
    private final int zzf;

    static {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpn r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzpn
            java.lang.String r1 = "TYPE_UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpn.zza = r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpn r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzpn
            java.lang.String r3 = "TYPE_THIN"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpn.zzb = r1
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpn r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzpn
            java.lang.String r5 = "TYPE_THICK"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpn.zzc = r3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpn r5 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzpn
            java.lang.String r7 = "TYPE_GMV"
            r8 = 3
            r5.<init>(r7, r8, r8)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpn.zzd = r5
            r7 = 4
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpn[] r7 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzpn[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpn.zze = r7
            return
    }

    zzpn(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzf = r3
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_pose_common.zzpn[] values() {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpn[] r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzpn.zze
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpn[] r0 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzpn[]) r0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzck
    public final int zza() {
            r1 = this;
            int r0 = r1.zzf
            return r0
    }
}
