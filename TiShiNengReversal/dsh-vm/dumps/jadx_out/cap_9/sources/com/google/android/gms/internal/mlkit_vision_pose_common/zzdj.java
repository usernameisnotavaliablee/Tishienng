package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzdj extends java.util.AbstractSet {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzdo zza;

    zzdj(com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r1) {
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
            boolean r0 = r2 instanceof java.util.Map.Entry
            if (r0 == 0) goto L10
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r0 = r1.zza
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r2 = r0.zzb(r2)
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdi r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdi
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 != 0) goto L5
            goto L16
        L5:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r0 = r2.zza
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdn r3 = r0.zzb(r3)
            if (r3 == 0) goto L16
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r0 = r2.zza
            r1 = 1
            r0.zze(r3, r1)
            return r1
        L16:
            r3 = 0
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdo r0 = r1.zza
            int r0 = r0.zzb
            return r0
    }
}
