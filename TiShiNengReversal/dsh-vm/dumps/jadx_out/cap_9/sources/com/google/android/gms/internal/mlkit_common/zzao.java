package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzao extends com.google.android.gms.internal.mlkit_common.zzaj {
    private final transient com.google.android.gms.internal.mlkit_common.zzai zza;
    private final transient com.google.android.gms.internal.mlkit_common.zzaf zzb;

    zzao(com.google.android.gms.internal.mlkit_common.zzai r1, com.google.android.gms.internal.mlkit_common.zzaf r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzai r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r2 = this;
            com.google.android.gms.internal.mlkit_common.zzaf r0 = r2.zzb
            r1 = 0
            com.google.android.gms.internal.mlkit_common.zzat r0 = r0.zzj(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzai r0 = r1.zza
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    final int zza(java.lang.Object[] r2, int r3) {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzaf r3 = r1.zzb
            r0 = 0
            int r2 = r3.zza(r2, r0)
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab
    public final com.google.android.gms.internal.mlkit_common.zzas zzd() {
            r2 = this;
            com.google.android.gms.internal.mlkit_common.zzaf r0 = r2.zzb
            r1 = 0
            com.google.android.gms.internal.mlkit_common.zzat r0 = r0.zzj(r1)
            return r0
    }
}
