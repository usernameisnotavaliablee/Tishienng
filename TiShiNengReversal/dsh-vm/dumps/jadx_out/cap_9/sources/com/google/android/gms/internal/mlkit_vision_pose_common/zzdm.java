package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class zzdm implements java.util.Iterator {
    com.google.android.gms.internal.mlkit_vision_pose_common.zzdn zza;
    com.google.android.gms.internal.mlkit_vision_pose_common.zzdn zzb;
    int zzc;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzdo zzd;

    zzdm(com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r2) {
            r1 = this;
            r1.zzd = r2
            r1.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r0 = r2.zzd
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r0 = r0.zzd
            r1.zza = r0
            r0 = 0
            r1.zzb = r0
            int r2 = r2.zzc
            r1.zzc = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r0 = r2.zzd
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r1 = r2.zza
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r0 = r0.zzd
            if (r1 == r0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r0 = r3.zzb
            if (r0 == 0) goto L14
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r1 = r3.zzd
            r2 = 1
            r1.zze(r0, r2)
            r0 = 0
            r3.zzb = r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r0 = r3.zzd
            int r0 = r0.zzc
            r3.zzc = r0
            return
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    final com.google.android.gms.internal.mlkit_vision_pose_common.zzdn zza() {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r0 = r3.zzd
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r1 = r3.zza
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r2 = r0.zzd
            if (r1 == r2) goto L1b
            int r0 = r0.zzc
            int r2 = r3.zzc
            if (r0 != r2) goto L15
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r0 = r1.zzd
            r3.zza = r0
            r3.zzb = r1
            return r1
        L15:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
        L1b:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
