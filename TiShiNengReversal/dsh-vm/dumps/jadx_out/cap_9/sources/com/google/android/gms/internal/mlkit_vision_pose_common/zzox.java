package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzox {
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzov zza;
    private final java.lang.Integer zzb;
    private final java.lang.Integer zzc;
    private final java.lang.Boolean zzd;

    /* synthetic */ zzox(com.google.android.gms.internal.mlkit_vision_pose_common.zzou r1, com.google.android.gms.internal.mlkit_vision_pose_common.zzow r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzov r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzou.zzc(r1)
            r0.zza = r2
            java.lang.Integer r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzou.zze(r1)
            r0.zzb = r1
            r1 = 0
            r0.zzc = r1
            r0.zzd = r1
            return
    }

    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.mlkit_vision_pose_common.zzox
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzox r5 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzox) r5
            com.google.android.gms.internal.mlkit_vision_pose_common.zzov r1 = r4.zza
            com.google.android.gms.internal.mlkit_vision_pose_common.zzov r3 = r5.zza
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L2e
            java.lang.Integer r1 = r4.zzb
            java.lang.Integer r5 = r5.zzb
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r1, r5)
            if (r5 == 0) goto L2e
            r5 = 0
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r5, r5)
            if (r1 == 0) goto L2e
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r5, r5)
            if (r5 == 0) goto L2e
            return r0
        L2e:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzov r0 = r4.zza
            java.lang.Integer r1 = r4.zzb
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            r0 = 2
            r1 = 0
            r2[r0] = r1
            r0 = 3
            r2[r0] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r2)
            return r0
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.internal.mlkit_vision_pose_common.zzcm(zza = 1)
    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzov zza() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzov r0 = r1.zza
            return r0
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.internal.mlkit_vision_pose_common.zzcm(zza = 2)
    public final java.lang.Integer zzb() {
            r1 = this;
            java.lang.Integer r0 = r1.zzb
            return r0
    }
}
