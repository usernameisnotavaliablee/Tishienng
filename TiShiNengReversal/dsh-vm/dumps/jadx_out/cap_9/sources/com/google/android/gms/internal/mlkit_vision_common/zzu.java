package com.google.android.gms.internal.mlkit_vision_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzu extends com.google.android.gms.internal.mlkit_vision_common.zzp {
    static final com.google.android.gms.internal.mlkit_vision_common.zzp zza = null;
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    static {
            com.google.android.gms.internal.mlkit_vision_common.zzu r0 = new com.google.android.gms.internal.mlkit_vision_common.zzu
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_vision_common.zzu.zza = r0
            return
    }

    zzu(java.lang.Object[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.zzc
            java.lang.String r1 = "index"
            com.google.android.gms.internal.mlkit_vision_common.zzf.zza(r3, r0, r1)
            java.lang.Object[] r0 = r2.zzb
            r3 = r0[r3]
            r3.getClass()
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzp, com.google.android.gms.internal.mlkit_vision_common.zzl
    final int zza(java.lang.Object[] r3, int r4) {
            r2 = this;
            java.lang.Object[] r4 = r2.zzb
            r0 = 0
            int r1 = r2.zzc
            java.lang.System.arraycopy(r4, r0, r3, r0, r1)
            int r3 = r2.zzc
            return r3
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    final int zzb() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    final int zzc() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    final java.lang.Object[] zze() {
            r1 = this;
            java.lang.Object[] r0 = r1.zzb
            return r0
    }
}
