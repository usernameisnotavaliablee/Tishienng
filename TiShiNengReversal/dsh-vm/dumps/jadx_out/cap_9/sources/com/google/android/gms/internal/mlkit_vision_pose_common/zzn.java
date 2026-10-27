package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzn {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzl zzb;
    private com.google.android.gms.internal.mlkit_vision_pose_common.zzl zzc;

    /* synthetic */ zzn(java.lang.String r1, com.google.android.gms.internal.mlkit_vision_pose_common.zzm r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzl r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzl
            r1.<init>()
            r0.zzb = r1
            r0.zzc = r1
            java.lang.String r1 = "PoseDetectorOptionsBase"
            r0.zza = r1
            return
    }

    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzn zzd(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzk r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzk
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzl r1 = r2.zzc
            r1.zzc = r0
            r2.zzc = r0
            r0.zzb = r4
            r0.zza = r3
            return r2
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            java.lang.String r1 = r6.zza
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzl r1 = r6.zzb
            com.google.android.gms.internal.mlkit_vision_pose_common.zzl r1 = r1.zzc
            java.lang.String r2 = ""
        L17:
            if (r1 == 0) goto L52
            java.lang.Object r3 = r1.zzb
            r0.append(r2)
            java.lang.String r2 = r1.zza
            if (r2 == 0) goto L2a
            r0.append(r2)
            r2 = 61
            r0.append(r2)
        L2a:
            if (r3 == 0) goto L4a
            java.lang.Class r2 = r3.getClass()
            boolean r2 = r2.isArray()
            if (r2 == 0) goto L4a
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r5 = 0
            r4[r5] = r3
            java.lang.String r3 = java.util.Arrays.deepToString(r4)
            int r4 = r3.length()
            int r4 = r4 + (-1)
            r0.append(r3, r2, r4)
            goto L4d
        L4a:
            r0.append(r3)
        L4d:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzl r1 = r1.zzc
            java.lang.String r2 = ", "
            goto L17
        L52:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzn zza(java.lang.String r1, int r2) {
            r0 = this;
            java.lang.String r1 = "detectorMode"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.zzd(r1, r2)
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzn zzb(java.lang.String r3, @javax.annotation.CheckForNull java.lang.Object r4) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzl r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzl
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzl r1 = r2.zzc
            r1.zzc = r0
            r2.zzc = r0
            r0.zzb = r4
            r0.zza = r3
            return r2
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzn zzc(java.lang.String r1, boolean r2) {
            r0 = this;
            java.lang.String r1 = "areFastModels"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.zzd(r1, r2)
            return r0
    }
}
