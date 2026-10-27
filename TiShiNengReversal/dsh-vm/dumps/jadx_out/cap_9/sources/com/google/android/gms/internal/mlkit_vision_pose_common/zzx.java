package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzx implements java.util.Iterator {

    @javax.annotation.CheckForNull
    java.util.Map.Entry zza;
    final /* synthetic */ java.util.Iterator zzb;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzy zzc;

    zzx(com.google.android.gms.internal.mlkit_vision_pose_common.zzy r1, java.util.Iterator r2) {
            r0 = this;
            r0.zzb = r2
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator r0 = r1.zzb
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            java.util.Iterator r0 = r1.zzb
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r1.zza = r0
            java.lang.Object r0 = r0.getKey()
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r4 = this;
            java.util.Map$Entry r0 = r4.zza
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            java.lang.String r1 = "no calls to next() since the last call to remove()"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzq.zze(r0, r1)
            java.util.Map$Entry r0 = r4.zza
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r1 = r4.zzb
            r1.remove()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzy r1 = r4.zzc
            com.google.android.gms.internal.mlkit_vision_pose_common.zzae r1 = r1.zza
            int r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzae.zzd(r1)
            int r3 = r0.size()
            int r2 = r2 - r3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzae.zzj(r1, r2)
            r0.clear()
            r0 = 0
            r4.zza = r0
            return
    }
}
