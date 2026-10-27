package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class zzbm extends com.google.android.gms.internal.mlkit_vision_pose_common.zzbz {
    zzbm() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r1 = this;
            java.util.Map r0 = r1.zza()
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L30
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            java.util.Map r2 = r3.zza()
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzbq.zza(r2, r0)
            java.lang.Object r4 = r4.getValue()
            boolean r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzp.zza(r2, r4)
            if (r4 == 0) goto L30
            r4 = 1
            if (r2 != 0) goto L2f
            java.util.Map r2 = r3.zza()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzw r2 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzw) r2
            java.util.Map r2 = r2.zza
            boolean r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzbq.zzb(r2, r0)
            if (r0 != 0) goto L2f
            return r1
        L2f:
            return r4
        L30:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
            r1 = this;
            java.util.Map r0 = r1.zza()
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L21
            boolean r0 = r2 instanceof java.util.Map.Entry
            if (r0 == 0) goto L21
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Map r0 = r1.zza()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzw r0 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzw) r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzae r0 = r0.zzb
            java.util.Set r0 = r0.zzo()
            java.lang.Object r2 = r2.getKey()
            boolean r2 = r0.remove(r2)
            return r2
        L21:
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzbz, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection r2) {
            r1 = this;
            if (r2 == 0) goto La
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.UnsupportedOperationException -> Lc
            boolean r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzca.zzb(r1, r0)     // Catch: java.lang.UnsupportedOperationException -> Lc
            return r2
        La:
            r0 = 0
            throw r0     // Catch: java.lang.UnsupportedOperationException -> Lc
        Lc:
            java.util.Iterator r2 = r2.iterator()
            boolean r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzca.zzc(r1, r2)
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzbz, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection r7) {
            r6 = this;
            if (r7 == 0) goto Lc
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.UnsupportedOperationException -> La
            boolean r7 = super.retainAll(r0)     // Catch: java.lang.UnsupportedOperationException -> La
            return r7
        La:
            goto Le
        Lc:
            r0 = 0
            throw r0     // Catch: java.lang.UnsupportedOperationException -> La
        Le:
            int r0 = r7.size()
            java.util.HashSet r1 = new java.util.HashSet
            r2 = 3
            if (r0 >= r2) goto L1f
            java.lang.String r2 = "expectedSize"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzaj.zza(r0, r2)
            int r0 = r0 + 1
            goto L30
        L1f:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 >= r2) goto L2d
            double r2 = (double) r0
            r4 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r0 = (int) r2
            goto L30
        L2d:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L30:
            r1.<init>(r0)
            java.util.Iterator r7 = r7.iterator()
        L37:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r7.next()
            boolean r2 = r6.contains(r0)
            if (r2 == 0) goto L37
            boolean r2 = r0 instanceof java.util.Map.Entry
            if (r2 == 0) goto L37
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            r1.add(r0)
            goto L37
        L55:
            java.util.Map r7 = r6.zza()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzw r7 = (com.google.android.gms.internal.mlkit_vision_pose_common.zzw) r7
            com.google.android.gms.internal.mlkit_vision_pose_common.zzae r7 = r7.zzb
            java.util.Set r7 = r7.zzo()
            boolean r7 = r7.retainAll(r1)
            return r7
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            java.util.Map r0 = r1.zza()
            int r0 = r0.size()
            return r0
    }

    abstract java.util.Map zza();
}
