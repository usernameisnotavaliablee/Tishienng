package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzw extends com.google.android.gms.internal.mlkit_vision_pose_common.zzbp {
    final transient java.util.Map zza;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_pose_common.zzae zzb;

    zzw(com.google.android.gms.internal.mlkit_vision_pose_common.zzae r1, java.util.Map r2) {
            r0 = this;
            r0.zzb = r1
            r0.<init>()
            r0.zza = r2
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzae r0 = r3.zzb
            java.util.Map r1 = r3.zza
            java.util.Map r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzae.zzg(r0)
            if (r1 != r2) goto Le
            r0.zzl()
            return
        Le:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzv r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzv
            r0.<init>(r3)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbi.zza(r0)
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            boolean r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzbq.zzb(r0, r2)
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r1 == r2) goto Ld
            java.util.Map r0 = r1.zza
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            return r2
        Ld:
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public final /* bridge */ /* synthetic */ java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r3) {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzbq.zza(r0, r3)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto Lc
            r3 = 0
            return r3
        Lc:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzae r1 = r2.zzb
            java.util.Collection r3 = r1.zzb(r3, r0)
            return r3
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
            r1 = this;
            java.util.Map r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzbp, java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzae r0 = r1.zzb
            java.util.Set r0 = r0.zzo()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public final /* bridge */ /* synthetic */ java.lang.Object remove(@javax.annotation.CheckForNull java.lang.Object r5) {
            r4 = this;
            java.util.Map r0 = r4.zza
            java.lang.Object r5 = r0.remove(r5)
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 != 0) goto Lc
            r5 = 0
            return r5
        Lc:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzae r0 = r4.zzb
            java.util.Collection r0 = r0.zza()
            r0.addAll(r5)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzae r1 = r4.zzb
            int r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzae.zzd(r1)
            int r3 = r5.size()
            int r2 = r2 - r3
            com.google.android.gms.internal.mlkit_vision_pose_common.zzae.zzj(r1, r2)
            r5.clear()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
            r1 = this;
            java.util.Map r0 = r1.zza
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.AbstractMap
    public final java.lang.String toString() {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzbp
    protected final java.util.Set zza() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzu r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzu
            r0.<init>(r1)
            return r0
    }
}
