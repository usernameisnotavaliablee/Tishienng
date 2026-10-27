package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class zzae extends com.google.android.gms.internal.mlkit_vision_pose_common.zzag implements java.io.Serializable {
    private transient java.util.Map zza;
    private transient int zzb;

    protected zzae(java.util.Map r2) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lc
            r1.zza = r2
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    static /* bridge */ /* synthetic */ int zzd(com.google.android.gms.internal.mlkit_vision_pose_common.zzae r0) {
            int r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map zzg(com.google.android.gms.internal.mlkit_vision_pose_common.zzae r0) {
            java.util.Map r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.mlkit_vision_pose_common.zzae r0, int r1) {
            r0.zzb = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzk(com.google.android.gms.internal.mlkit_vision_pose_common.zzae r1, java.lang.Object r2) {
            java.util.Map r0 = r1.zza
            r0.getClass()
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> La
            goto Lb
        La:
            r2 = 0
        Lb:
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L1b
            int r0 = r2.size()
            r2.clear()
            int r2 = r1.zzb
            int r2 = r2 - r0
            r1.zzb = r2
        L1b:
            return
    }

    abstract java.util.Collection zza();

    java.util.Collection zzb(java.lang.Object r1, java.util.Collection r2) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public final java.util.Collection zze(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.lang.Object r0 = r0.get(r2)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto Le
            java.util.Collection r0 = r1.zza()
        Le:
            java.util.Collection r2 = r1.zzb(r2, r0)
            return r2
    }

    final java.util.List zzf(java.lang.Object r2, java.util.List r3, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_vision_pose_common.zzab r4) {
            r1 = this;
            boolean r0 = r3 instanceof java.util.RandomAccess
            if (r0 == 0) goto La
            com.google.android.gms.internal.mlkit_vision_pose_common.zzz r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzz
            r0.<init>(r1, r2, r3, r4)
            return r0
        La:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzad r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzad
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzag
    final java.util.Map zzh() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzw r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzw
            java.util.Map r1 = r2.zza
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzag
    final java.util.Set zzi() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzy r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzy
            java.util.Map r1 = r2.zza
            r0.<init>(r2, r1)
            return r0
    }

    public final void zzl() {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            java.util.Collection r1 = (java.util.Collection) r1
            r1.clear()
            goto La
        L1a:
            java.util.Map r0 = r2.zza
            r0.clear()
            r0 = 0
            r2.zzb = r0
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_pose_common.zzag, com.google.android.gms.internal.mlkit_vision_pose_common.zzbr
    public final boolean zzm(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.lang.Object r0 = r0.get(r3)
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 1
            if (r0 != 0) goto L28
            java.util.Collection r0 = r2.zza()
            boolean r4 = r0.add(r4)
            if (r4 == 0) goto L20
            int r4 = r2.zzb
            int r4 = r4 + r1
            r2.zzb = r4
            java.util.Map r4 = r2.zza
            r4.put(r3, r0)
            return r1
        L20:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r4 = "New Collection violated the Collection spec"
            r3.<init>(r4)
            throw r3
        L28:
            boolean r3 = r0.add(r4)
            if (r3 == 0) goto L34
            int r3 = r2.zzb
            int r3 = r3 + r1
            r2.zzb = r3
            return r1
        L34:
            r3 = 0
            return r3
    }
}
