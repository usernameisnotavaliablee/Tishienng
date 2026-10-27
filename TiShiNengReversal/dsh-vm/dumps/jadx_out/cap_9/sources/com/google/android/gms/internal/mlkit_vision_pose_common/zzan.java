package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzan extends java.util.AbstractSet {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzat zza;

    zzan(com.google.android.gms.internal.mlkit_vision_pose_common.zzat r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzat r0 = r1.zza
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzat r0 = r3.zza
            java.util.Map r0 = r0.zzl()
            if (r0 == 0) goto L11
            java.util.Set r0 = r0.entrySet()
            boolean r4 = r0.contains(r4)
            return r4
        L11:
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L37
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            com.google.android.gms.internal.mlkit_vision_pose_common.zzat r0 = r3.zza
            java.lang.Object r2 = r4.getKey()
            int r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzat.zzd(r0, r2)
            r2 = -1
            if (r0 == r2) goto L37
            com.google.android.gms.internal.mlkit_vision_pose_common.zzat r2 = r3.zza
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzat.zzj(r2, r0)
            java.lang.Object r4 = r4.getValue()
            boolean r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzp.zza(r0, r4)
            if (r4 == 0) goto L37
            r4 = 1
            return r4
        L37:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzat r0 = r2.zza
            java.util.Map r1 = r0.zzl()
            if (r1 == 0) goto L11
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
        L11:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzal r1 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzal
            r1.<init>(r0)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object r10) {
            r9 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzat r0 = r9.zza
            java.util.Map r0 = r0.zzl()
            if (r0 == 0) goto L11
            java.util.Set r0 = r0.entrySet()
            boolean r10 = r0.remove(r10)
            return r10
        L11:
            boolean r0 = r10 instanceof java.util.Map.Entry
            if (r0 == 0) goto L5b
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            com.google.android.gms.internal.mlkit_vision_pose_common.zzat r0 = r9.zza
            boolean r1 = r0.zzr()
            if (r1 == 0) goto L20
            goto L5b
        L20:
            int r4 = com.google.android.gms.internal.mlkit_vision_pose_common.zzat.zzc(r0)
            java.lang.Object r2 = r10.getKey()
            java.lang.Object r3 = r10.getValue()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzat r10 = r9.zza
            java.lang.Object r5 = com.google.android.gms.internal.mlkit_vision_pose_common.zzat.zzi(r10)
            int[] r6 = com.google.android.gms.internal.mlkit_vision_pose_common.zzat.zzs(r10)
            java.lang.Object[] r7 = com.google.android.gms.internal.mlkit_vision_pose_common.zzat.zzt(r10)
            java.lang.Object[] r8 = com.google.android.gms.internal.mlkit_vision_pose_common.zzat.zzu(r10)
            int r10 = com.google.android.gms.internal.mlkit_vision_pose_common.zzau.zzb(r2, r3, r4, r5, r6, r7, r8)
            r0 = -1
            if (r10 == r0) goto L5b
            com.google.android.gms.internal.mlkit_vision_pose_common.zzat r1 = r9.zza
            r1.zzq(r10, r4)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzat r10 = r9.zza
            int r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzat.zzb(r10)
            int r1 = r1 + r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzat.zzm(r10, r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzat r10 = r9.zza
            r10.zzo()
            r10 = 1
            return r10
        L5b:
            r10 = 0
            return r10
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzat r0 = r1.zza
            int r0 = r0.size()
            return r0
    }
}
