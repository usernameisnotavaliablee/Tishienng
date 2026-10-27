package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzvv {
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzvk zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final long zzd;

    public zzvv(com.google.android.gms.internal.mlkit_vision_pose_common.zzvk r1, java.lang.String r2, java.lang.String r3, long r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public final long zza() {
            r2 = this;
            long r0 = r2.zzd
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzvk zzb() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvk r0 = r1.zza
            return r0
    }

    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public final java.lang.String zzd() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    public final boolean zze() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.zzd
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }
}
