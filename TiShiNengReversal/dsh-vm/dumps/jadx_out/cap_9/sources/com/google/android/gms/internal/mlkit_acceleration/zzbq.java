package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzbq extends com.google.android.gms.internal.mlkit_acceleration.zzbw {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;

    /* synthetic */ zzbq(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, com.google.android.gms.internal.mlkit_acceleration.zzbp r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.mlkit_acceleration.zzbw
            r2 = 0
            if (r1 == 0) goto L3c
            com.google.android.gms.internal.mlkit_acceleration.zzbw r5 = (com.google.android.gms.internal.mlkit_acceleration.zzbw) r5
            java.lang.String r1 = r4.zza
            java.lang.String r3 = r5.zza()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3c
            java.lang.String r1 = r4.zzb
            java.lang.String r3 = r5.zzd()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3c
            java.lang.String r1 = r4.zzc
            java.lang.String r3 = r5.zzb()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3c
            java.lang.String r1 = r4.zzd
            java.lang.String r5 = r5.zzc()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L3c
            return r0
        L3c:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zza
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            java.lang.String r2 = r3.zzb
            int r0 = r0 * r1
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            java.lang.String r2 = r3.zzc
            int r0 = r0 * r1
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            java.lang.String r2 = r3.zzd
            int r0 = r0 * r1
            int r1 = r2.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AndroidInfo{androidSdkVersion="
            r0.append(r1)
            java.lang.String r1 = r2.zza
            r0.append(r1)
            java.lang.String r1 = ", model="
            r0.append(r1)
            java.lang.String r1 = r2.zzb
            r0.append(r1)
            java.lang.String r1 = ", device="
            r0.append(r1)
            java.lang.String r1 = r2.zzc
            r0.append(r1)
            java.lang.String r1 = ", manufacturer="
            r0.append(r1)
            java.lang.String r1 = r2.zzd
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzbw
    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzbw
    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzbw
    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzbw
    public final java.lang.String zzd() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }
}
