package com.google.android.gms.internal.mlkit_vision_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzz extends com.google.android.gms.internal.mlkit_vision_common.zzr {
    static final com.google.android.gms.internal.mlkit_vision_common.zzr zza = null;
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    static {
            com.google.android.gms.internal.mlkit_vision_common.zzz r0 = new com.google.android.gms.internal.mlkit_vision_common.zzz
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r0.<init>(r3, r2, r1)
            com.google.android.gms.internal.mlkit_vision_common.zzz.zza = r0
            return
    }

    private zzz(@javax.annotation.CheckForNull java.lang.Object r1, java.lang.Object[] r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    static com.google.android.gms.internal.mlkit_vision_common.zzz zzg(int r1, java.lang.Object[] r2, com.google.android.gms.internal.mlkit_vision_common.zzq r3) {
            r1 = 0
            r1 = r2[r1]
            r1.getClass()
            r3 = 1
            r0 = r2[r3]
            r0.getClass()
            com.google.android.gms.internal.mlkit_vision_common.zzi.zza(r1, r0)
            com.google.android.gms.internal.mlkit_vision_common.zzz r1 = new com.google.android.gms.internal.mlkit_vision_common.zzz
            r0 = 0
            r1.<init>(r0, r2, r3)
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr, java.util.Map
    @javax.annotation.CheckForNull
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.zzb
            int r1 = r4.zzc
            r2 = 0
            if (r5 != 0) goto L9
        L7:
            r5 = r2
            goto L1d
        L9:
            r3 = 1
            if (r1 != r3) goto L7
            r1 = 0
            r1 = r0[r1]
            r1.getClass()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L7
            r5 = r0[r3]
            r5.getClass()
        L1d:
            if (r5 != 0) goto L20
            return r2
        L20:
            return r5
    }

    @Override // java.util.Map
    public final int size() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr
    final com.google.android.gms.internal.mlkit_vision_common.zzl zza() {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_common.zzy r0 = new com.google.android.gms.internal.mlkit_vision_common.zzy
            java.lang.Object[] r1 = r4.zzb
            r2 = 1
            int r3 = r4.zzc
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr
    final com.google.android.gms.internal.mlkit_vision_common.zzs zzd() {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_common.zzw r0 = new com.google.android.gms.internal.mlkit_vision_common.zzw
            java.lang.Object[] r1 = r4.zzb
            r2 = 0
            int r3 = r4.zzc
            r0.<init>(r4, r1, r2, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr
    final com.google.android.gms.internal.mlkit_vision_common.zzs zze() {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_common.zzy r0 = new com.google.android.gms.internal.mlkit_vision_common.zzy
            java.lang.Object[] r1 = r4.zzb
            r2 = 0
            int r3 = r4.zzc
            r0.<init>(r1, r2, r3)
            com.google.android.gms.internal.mlkit_vision_common.zzx r1 = new com.google.android.gms.internal.mlkit_vision_common.zzx
            r1.<init>(r4, r0)
            return r1
    }
}
