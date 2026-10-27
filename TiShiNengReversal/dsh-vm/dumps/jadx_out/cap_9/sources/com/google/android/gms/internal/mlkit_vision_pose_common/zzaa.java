package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class zzaa implements java.util.Iterator {
    final java.util.Iterator zza;
    final java.util.Collection zzb;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzab zzc;

    zzaa(com.google.android.gms.internal.mlkit_vision_pose_common.zzab r2) {
            r1 = this;
            r1.zzc = r2
            r1.<init>()
            java.util.Collection r2 = r2.zzb
            r1.zzb = r2
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L14
            java.util.List r2 = (java.util.List) r2
            java.util.ListIterator r2 = r2.listIterator()
            goto L18
        L14:
            java.util.Iterator r2 = r2.iterator()
        L18:
            r1.zza = r2
            return
    }

    zzaa(com.google.android.gms.internal.mlkit_vision_pose_common.zzab r1, java.util.Iterator r2) {
            r0 = this;
            r0.zzc = r1
            r0.<init>()
            java.util.Collection r1 = r1.zzb
            r0.zzb = r1
            r0.zza = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            r1.zza()
            java.util.Iterator r0 = r1.zza
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            r1.zza()
            java.util.Iterator r0 = r1.zza
            java.lang.Object r0 = r0.next()
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            java.util.Iterator r0 = r2.zza
            r0.remove()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzab r0 = r2.zzc
            com.google.android.gms.internal.mlkit_vision_pose_common.zzae r0 = r0.zze
            int r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzae.zzd(r0)
            int r1 = r1 + (-1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzae.zzj(r0, r1)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzab r0 = r2.zzc
            r0.zzc()
            return
    }

    final void zza() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzab r0 = r2.zzc
            r0.zzb()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzab r0 = r2.zzc
            java.util.Collection r0 = r0.zzb
            java.util.Collection r1 = r2.zzb
            if (r0 != r1) goto Le
            return
        Le:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }
}
