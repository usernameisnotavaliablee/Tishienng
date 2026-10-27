package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzam extends com.google.android.gms.internal.mlkit_common.zzaf {
    final /* synthetic */ com.google.android.gms.internal.mlkit_common.zzan zza;

    zzam(com.google.android.gms.internal.mlkit_common.zzan r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_common.zzan r0 = r2.zza
            int r0 = com.google.android.gms.internal.mlkit_common.zzan.zzh(r0)
            java.lang.String r1 = "index"
            com.google.android.gms.internal.mlkit_common.zzt.zza(r3, r0, r1)
            com.google.android.gms.internal.mlkit_common.zzan r0 = r2.zza
            java.lang.Object[] r0 = com.google.android.gms.internal.mlkit_common.zzan.zzi(r0)
            int r3 = r3 + r3
            r0 = r0[r3]
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.mlkit_common.zzan r1 = r2.zza
            java.lang.Object[] r1 = com.google.android.gms.internal.mlkit_common.zzan.zzi(r1)
            int r3 = r3 + 1
            r3 = r1[r3]
            java.util.Objects.requireNonNull(r3)
            java.util.AbstractMap$SimpleImmutableEntry r1 = new java.util.AbstractMap$SimpleImmutableEntry
            r1.<init>(r0, r3)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzan r0 = r1.zza
            int r0 = com.google.android.gms.internal.mlkit_common.zzan.zzh(r0)
            return r0
    }
}
