package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class zzvs {
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzwk zza;

    public zzvs(android.content.Context r6) {
            r5 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwk r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzwk
            com.google.mlkit.common.sdkinternal.SharedPrefManager r1 = new com.google.mlkit.common.sdkinternal.SharedPrefManager
            r1.<init>(r6)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwe r2 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzwe
            java.lang.String r3 = "shared-installation-id"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwc r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwd.zzd(r3)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwd r4 = r4.zzd()
            r2.<init>(r6, r4)
            r0.<init>(r6, r1, r2, r3)
            r5.<init>()
            r5.zza = r0
            return
    }

    protected zzvs(com.google.android.gms.internal.mlkit_vision_pose_common.zzwk r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    protected final void zza(com.google.android.gms.internal.mlkit_vision_pose_common.zzpp r3, com.google.android.gms.internal.mlkit_vision_pose_common.zzvr r4) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzpq r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzpq
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zztc r4 = r4.zza()
            com.google.android.gms.internal.mlkit_vision_pose_common.zztf r4 = r4.zzi()
            r0.zzj(r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwa r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzwn.zzf(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwk r0 = r2.zza
            java.lang.String r1 = "o:a:mlkit:1.0.0"
            r0.zze(r4, r3, r1)
            return
    }
}
