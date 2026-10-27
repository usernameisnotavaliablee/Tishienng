package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public enum zzsg extends java.lang.Enum implements com.google.android.gms.internal.mlkit_vision_pose_common.zzck {
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzsg zza = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzsg zzb = null;
    public static final com.google.android.gms.internal.mlkit_vision_pose_common.zzsg zzc = null;
    private static final /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzsg[] zzd = null;
    private final int zze;

    static {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsg r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzsg
            java.lang.String r1 = "HARDWARE_CONFIG_UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsg.zza = r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsg r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzsg
            java.lang.String r3 = "HARDWARE_CONFIG_CPU"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsg.zzb = r1
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsg r3 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzsg
            java.lang.String r5 = "HARDWARE_CONFIG_CPU_GPU"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsg.zzc = r3
            r5 = 3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsg[] r5 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzsg[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsg.zzd = r5
            return
    }

    zzsg(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zze = r3
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_pose_common.zzsg[] values() {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsg[] r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzsg.zzd
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsg[] r0 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzsg[]) r0
            return r0
    }

    public static com.google.android.gms.internal.mlkit_vision_pose_common.zzsg zzb(int r5) {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsg[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            int r4 = r3.zze
            if (r4 != r5) goto Lf
            return r3
        Lf:
            int r2 = r2 + 1
            goto L6
        L12:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzsg r5 = com.google.android.gms.internal.mlkit_vision_pose_common.zzsg.zza
            return r5
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzck
    public final int zza() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }
}
