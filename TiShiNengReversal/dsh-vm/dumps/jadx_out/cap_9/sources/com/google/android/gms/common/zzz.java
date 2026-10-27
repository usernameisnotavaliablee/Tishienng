package com.google.android.gms.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzz {

    @androidx.annotation.Nullable
    private java.lang.String zza;
    private long zzb;
    private com.google.android.gms.internal.common.zzag zzc;
    private com.google.android.gms.internal.common.zzag zzd;

    zzz() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zza = r0
            r0 = -1
            r2.zzb = r0
            com.google.android.gms.internal.common.zzag r0 = com.google.android.gms.internal.common.zzag.zzl()
            r2.zzc = r0
            com.google.android.gms.internal.common.zzag r0 = com.google.android.gms.internal.common.zzag.zzl()
            r2.zzd = r0
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    final com.google.android.gms.common.zzz zza(long r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    final com.google.android.gms.common.zzz zzb(java.util.List r1) {
            r0 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.internal.common.zzag r1 = com.google.android.gms.internal.common.zzag.zzk(r1)
            r0.zzd = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    final com.google.android.gms.common.zzz zzc(java.util.List r1) {
            r0 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.internal.common.zzag r1 = com.google.android.gms.internal.common.zzag.zzk(r1)
            r0.zzc = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    final com.google.android.gms.common.zzz zzd(java.lang.String r1) {
            r0 = this;
            r0.zza = r1
            return r0
    }

    final com.google.android.gms.common.zzab zze() {
            r9 = this;
            java.lang.String r0 = r9.zza
            if (r0 == 0) goto L3c
            long r0 = r9.zzb
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L34
            com.google.android.gms.internal.common.zzag r0 = r9.zzc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L25
            com.google.android.gms.internal.common.zzag r0 = r9.zzd
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            goto L25
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Either orderedTestCerts or orderedProdCerts must have at least one cert"
            r0.<init>(r1)
            throw r0
        L25:
            com.google.android.gms.common.zzab r2 = new com.google.android.gms.common.zzab
            java.lang.String r3 = r9.zza
            long r4 = r9.zzb
            com.google.android.gms.internal.common.zzag r6 = r9.zzc
            com.google.android.gms.internal.common.zzag r7 = r9.zzd
            r8 = 0
            r2.<init>(r3, r4, r6, r7, r8)
            return r2
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "minimumStampedVersionNumber must be greater than or equal to 0"
            r0.<init>(r1)
            throw r0
        L3c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "packageName must be defined"
            r0.<init>(r1)
            throw r0
    }
}
