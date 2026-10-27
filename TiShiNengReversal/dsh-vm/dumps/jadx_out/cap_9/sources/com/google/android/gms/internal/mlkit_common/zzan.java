package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzan extends com.google.android.gms.internal.mlkit_common.zzaj {
    private final transient com.google.android.gms.internal.mlkit_common.zzai zza;
    private final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzan(com.google.android.gms.internal.mlkit_common.zzai r1, java.lang.Object[] r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r4
            return
    }

    static /* bridge */ /* synthetic */ int zzh(com.google.android.gms.internal.mlkit_common.zzan r0) {
            int r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object[] zzi(com.google.android.gms.internal.mlkit_common.zzan r0) {
            java.lang.Object[] r0 = r0.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L1f
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            if (r4 == 0) goto L1f
            com.google.android.gms.internal.mlkit_common.zzai r2 = r3.zza
            java.lang.Object r0 = r2.get(r0)
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L1f
            r4 = 1
            return r4
        L1f:
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r2 = this;
            com.google.android.gms.internal.mlkit_common.zzaf r0 = r2.zzf()
            r1 = 0
            com.google.android.gms.internal.mlkit_common.zzat r0 = r0.zzj(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    final int zza(java.lang.Object[] r2, int r3) {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzaf r3 = r1.zzf()
            r0 = 0
            int r2 = r3.zza(r2, r0)
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab
    public final com.google.android.gms.internal.mlkit_common.zzas zzd() {
            r2 = this;
            com.google.android.gms.internal.mlkit_common.zzaf r0 = r2.zzf()
            r1 = 0
            com.google.android.gms.internal.mlkit_common.zzat r0 = r0.zzj(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj
    final com.google.android.gms.internal.mlkit_common.zzaf zzg() {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzam r0 = new com.google.android.gms.internal.mlkit_common.zzam
            r0.<init>(r1)
            return r0
    }
}
