package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class zzbn extends com.google.android.gms.internal.mlkit_vision_pose_common.zzbz {
    final java.util.Map zzb;

    zzbn(java.util.Map r1) {
            r0 = this;
            r0.<init>()
            r1.getClass()
            java.util.Map r1 = (java.util.Map) r1
            r0.zzb = r1
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
            r1 = this;
            java.util.Map r0 = r1.zzb
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zzb
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
            r1 = this;
            java.util.Map r0 = r1.zzb
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
            r2 = this;
            java.util.Map r0 = r2.zzb
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbk r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzbk
            r1.<init>(r0)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto Ld
            java.util.Map r0 = r1.zzb
            r0.remove(r2)
            r2 = 1
            return r2
        Ld:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            java.util.Map r0 = r1.zzb
            int r0 = r0.size()
            return r0
    }
}
