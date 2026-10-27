package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzv implements java.util.Iterator {
    final java.util.Iterator zza;

    @javax.annotation.CheckForNull
    java.util.Collection zzb;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzw zzc;

    zzv(com.google.android.gms.internal.mlkit_vision_pose_common.zzw r1) {
            r0 = this;
            r0.zzc = r1
            r0.<init>()
            java.util.Map r1 = r1.zza
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r0.zza = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator r0 = r1.zza
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r3 = this;
            java.util.Iterator r0 = r3.zza
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            r3.zzb = r1
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            com.google.android.gms.internal.mlkit_vision_pose_common.zzw r2 = r3.zzc
            com.google.android.gms.internal.mlkit_vision_pose_common.zzae r2 = r2.zzb
            java.util.Collection r0 = r2.zzb(r1, r0)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzaz r2 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzaz
            r2.<init>(r1, r0)
            return r2
    }

    @Override // java.util.Iterator
    public final void remove() {
            r3 = this;
            java.util.Collection r0 = r3.zzb
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            java.lang.String r1 = "no calls to next() since the last call to remove()"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzq.zze(r0, r1)
            java.util.Iterator r0 = r3.zza
            r0.remove()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzw r0 = r3.zzc
            com.google.android.gms.internal.mlkit_vision_pose_common.zzae r0 = r0.zzb
            int r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzae.zzd(r0)
            java.util.Collection r2 = r3.zzb
            int r2 = r2.size()
            int r1 = r1 - r2
            com.google.android.gms.internal.mlkit_vision_pose_common.zzae.zzj(r0, r1)
            java.util.Collection r0 = r3.zzb
            r0.clear()
            r0 = 0
            r3.zzb = r0
            return
    }
}
