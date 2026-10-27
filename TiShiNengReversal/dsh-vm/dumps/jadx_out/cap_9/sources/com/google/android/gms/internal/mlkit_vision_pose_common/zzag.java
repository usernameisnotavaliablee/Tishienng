package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class zzag implements com.google.android.gms.internal.mlkit_vision_pose_common.zzbr {

    @javax.annotation.CheckForNull
    private transient java.util.Set zza;

    @javax.annotation.CheckForNull
    private transient java.util.Map zzb;

    zzag() {
            r0 = this;
            r0.<init>()
            return
    }

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_vision_pose_common.zzbr
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbr r2 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzbr) r2
            java.util.Map r0 = r1.zzn()
            java.util.Map r2 = r2.zzn()
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.util.Map r0 = r1.zzn()
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.util.Map r0 = r1.zzn()
            java.lang.String r0 = r0.toString()
            return r0
    }

    abstract java.util.Map zzh();

    abstract java.util.Set zzi();

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzbr
    public boolean zzm(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzbr
    public final java.util.Map zzn() {
            r1 = this;
            java.util.Map r0 = r1.zzb
            if (r0 != 0) goto La
            java.util.Map r0 = r1.zzh()
            r1.zzb = r0
        La:
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzbr
    public final java.util.Set zzo() {
            r1 = this;
            java.util.Set r0 = r1.zza
            if (r0 != 0) goto La
            java.util.Set r0 = r1.zzi()
            r1.zza = r0
        La:
            return r0
    }
}
