package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzu extends com.google.android.gms.internal.mlkit_vision_pose_common.zzbm {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzw zza;

    zzu(com.google.android.gms.internal.mlkit_vision_pose_common.zzw r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzbm, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzw r0 = r1.zza
            java.util.Map r0 = r0.zza
            java.util.Set r0 = r0.entrySet()
            r0.getClass()
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzv r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzv
            com.google.android.gms.internal.mlkit_vision_pose_common.zzw r1 = r2.zza
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzbm, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Objects.requireNonNull(r2)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            com.google.android.gms.internal.mlkit_vision_pose_common.zzw r0 = r1.zza
            java.lang.Object r2 = r2.getKey()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzae r0 = r0.zzb
            com.google.android.gms.internal.mlkit_vision_pose_common.zzae.zzk(r0, r2)
            r2 = 1
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzbm
    final java.util.Map zza() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzw r0 = r1.zza
            return r0
    }
}
