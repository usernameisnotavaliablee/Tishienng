package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public enum zzsf extends java.lang.Enum implements com.google.android.gms.internal.mlkit_vision_pose_common.zzck {
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzsf zza = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzsf zzb = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzsf zzc = null;
    private static final /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzsf[] zzd = null;
    private final int zze;

    static {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsf r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzsf
            java.lang.String r1 = "INVALID_MODE"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsf.zza = r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsf r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzsf
            java.lang.String r3 = "STREAM"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsf.zzb = r1
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsf r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzsf
            java.lang.String r5 = "SINGLE_IMAGE"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsf.zzc = r3
            r5 = 3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsf[] r5 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzsf[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsf.zzd = r5
            return
    }

    zzsf(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zze = r3
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_pose_common.zzsf[] values() {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsf[] r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzsf.zzd
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsf[] r0 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzsf[]) r0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzck
    public final int zza() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }
}
