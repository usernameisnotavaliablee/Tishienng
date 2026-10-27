package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzvr {
    boolean zza;
    private long zzb;
    private long zzc;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzba zzd;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzba zze;
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzba zzf;
    private int zzg;

    public zzvr() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzba r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzba
            r0.<init>()
            r1.zzd = r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzba r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzba
            r0.<init>()
            r1.zze = r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzba r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzba
            r0.<init>()
            r1.zzf = r0
            return
    }

    @androidx.annotation.VisibleForTesting
    public final com.google.android.gms.internal.mlkit_vision_pose_common.zztc zza() {
            r7 = this;
            long r0 = r7.zzb
            r2 = 0
            r3 = 1
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzq.zzd(r0)
            long r0 = r7.zzc
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L17
            r2 = 1
        L17:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzq.zzd(r2)
            long r0 = r7.zzc
            long r2 = r7.zzb
            long r0 = r0 - r2
            com.google.android.gms.internal.mlkit_vision_pose_common.zztc r2 = new com.google.android.gms.internal.mlkit_vision_pose_common.zztc
            r2.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.zzd(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzba r0 = r7.zzd
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r0 = r0.zzc()
            r2.zzh(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzba r0 = r7.zze
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r0 = r0.zzc()
            r2.zzg(r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzba r0 = r7.zzf
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r0 = r0.zzc()
            r2.zze(r0)
            int r0 = r7.zzg
            if (r0 == 0) goto L51
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.zzf(r0)
        L51:
            return r2
    }

    public final void zzb(com.google.android.gms.internal.mlkit_vision_pose_common.zztd r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzba r0 = r1.zzf
            r0.zzb(r2)
            return
    }

    public final void zzc(com.google.android.gms.internal.mlkit_vision_pose_common.zztd r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzba r0 = r1.zze
            r0.zzb(r2)
            return
    }

    public final void zzd(com.google.android.gms.internal.mlkit_vision_pose_common.zztd r2) {
            r1 = this;
            boolean r0 = r1.zza
            if (r0 == 0) goto La
            com.google.android.gms.internal.mlkit_vision_pose_common.zzba r0 = r1.zze
            r0.zzb(r2)
            return
        La:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzba r0 = r1.zzd
            r0.zzb(r2)
            return
    }

    public final void zze() {
            r2 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.zzc = r0
            return
    }

    public final void zzf(int r1) {
            r0 = this;
            r0.zzg = r1
            return
    }

    public final void zzg() {
            r2 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.zzb = r0
            return
    }

    public final void zzh() {
            r1 = this;
            r0 = 1
            r1.zza = r0
            return
    }
}
