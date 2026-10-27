package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzas extends java.util.AbstractCollection {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzat zza;

    zzas(com.google.android.gms.internal.mlkit_vision_pose_common.zzat r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzat r0 = r1.zza
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzat r0 = r2.zza
            java.util.Map r1 = r0.zzl()
            if (r1 == 0) goto L11
            java.util.Collection r0 = r1.values()
            java.util.Iterator r0 = r0.iterator()
            return r0
        L11:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzam r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzam
            r1.<init>(r0)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzat r0 = r1.zza
            int r0 = r0.size()
            return r0
    }
}
