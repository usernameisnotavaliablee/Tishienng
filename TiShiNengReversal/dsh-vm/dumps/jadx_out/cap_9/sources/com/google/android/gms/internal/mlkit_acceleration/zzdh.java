package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzdh {
    private final java.lang.Object zza;
    private final int zzb;

    zzdh(java.lang.Object r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_acceleration.zzdh
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.internal.mlkit_acceleration.zzdh r4 = (com.google.android.gms.internal.mlkit_acceleration.zzdh) r4
            java.lang.Object r0 = r3.zza
            java.lang.Object r2 = r4.zza
            if (r0 != r2) goto L16
            int r0 = r3.zzb
            int r4 = r4.zzb
            if (r0 != r4) goto L16
            r4 = 1
            return r4
        L16:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            int r0 = java.lang.System.identityHashCode(r0)
            r1 = 65535(0xffff, float:9.1834E-41)
            int r0 = r0 * r1
            int r1 = r2.zzb
            int r0 = r0 + r1
            return r0
    }
}
