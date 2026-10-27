package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzdl extends java.util.AbstractSet {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzdo zza;

    zzdl(com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r0 = r1.zza
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r0 = r1.zza
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdk r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdk
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r0 = r1.zza
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r2 = r0.zzd(r2)
            if (r2 == 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r0 = r1.zza
            int r0 = r0.zzb
            return r0
    }
}
