package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zznl {
    private final com.google.android.gms.internal.mlkit_common.zznh zza;
    private final com.google.android.gms.internal.mlkit_common.zznj zzb;
    private final com.google.android.gms.internal.mlkit_common.zznj zzc;
    private final java.lang.Boolean zzd;

    /* synthetic */ zznl(com.google.android.gms.internal.mlkit_common.zzni r1, com.google.android.gms.internal.mlkit_common.zznk r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.mlkit_common.zznh r1 = com.google.android.gms.internal.mlkit_common.zzni.zza(r1)
            r0.zza = r1
            r1 = 0
            r0.zzb = r1
            r0.zzc = r1
            r0.zzd = r1
            return
    }

    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof com.google.android.gms.internal.mlkit_common.zznl
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.mlkit_common.zznl r4 = (com.google.android.gms.internal.mlkit_common.zznl) r4
            com.google.android.gms.internal.mlkit_common.zznh r1 = r3.zza
            com.google.android.gms.internal.mlkit_common.zznh r4 = r4.zza
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r1, r4)
            if (r4 == 0) goto L2a
            r4 = 0
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r4, r4)
            if (r1 == 0) goto L2a
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r4, r4)
            if (r1 == 0) goto L2a
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r4, r4)
            if (r4 == 0) goto L2a
            return r0
        L2a:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            com.google.android.gms.internal.mlkit_common.zznh r0 = r3.zza
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r2 = 0
            r1[r0] = r2
            r0 = 2
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            return r0
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.internal.mlkit_common.zzbc(zza = 1)
    public final com.google.android.gms.internal.mlkit_common.zznh zza() {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zznh r0 = r1.zza
            return r0
    }
}
