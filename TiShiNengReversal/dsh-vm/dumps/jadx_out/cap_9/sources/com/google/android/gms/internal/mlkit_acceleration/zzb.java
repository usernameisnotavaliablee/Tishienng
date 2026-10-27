package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzb extends com.google.android.gms.internal.mlkit_acceleration.zzf {
    private java.lang.String zza;
    private java.lang.String zzb;
    private int zzc;
    private int zzd;
    private java.lang.String zze;
    private byte zzf;

    zzb() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzf
    public final com.google.android.gms.internal.mlkit_acceleration.zzf zza(int r1) {
            r0 = this;
            r0.zzc = r1
            byte r1 = r0.zzf
            r1 = r1 | 1
            byte r1 = (byte) r1
            r0.zzf = r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzf
    public final com.google.android.gms.internal.mlkit_acceleration.zzf zzb(int r1) {
            r0 = this;
            r0.zzd = r1
            byte r1 = r0.zzf
            r1 = r1 | 2
            byte r1 = (byte) r1
            r0.zzf = r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzf
    public final com.google.android.gms.internal.mlkit_acceleration.zzf zzc(java.lang.String r1) {
            r0 = this;
            r0.zza = r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzf
    public final com.google.android.gms.internal.mlkit_acceleration.zzf zzd(java.lang.String r1) {
            r0 = this;
            r0.zze = r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzf
    public final com.google.android.gms.internal.mlkit_acceleration.zzf zze(java.lang.String r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzf
    public final com.google.android.gms.internal.mlkit_acceleration.zzg zzf() {
            r9 = this;
            byte r0 = r9.zzf
            r1 = 3
            if (r0 != r1) goto L1d
            java.lang.String r3 = r9.zza
            if (r3 == 0) goto L1d
            java.lang.String r4 = r9.zzb
            if (r4 == 0) goto L1d
            java.lang.String r7 = r9.zze
            if (r7 != 0) goto L12
            goto L1d
        L12:
            com.google.android.gms.internal.mlkit_acceleration.zzd r2 = new com.google.android.gms.internal.mlkit_acceleration.zzd
            int r5 = r9.zzc
            int r6 = r9.zzd
            r8 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r9.zza
            if (r1 != 0) goto L2b
            java.lang.String r1 = " rendererName"
            r0.append(r1)
        L2b:
            java.lang.String r1 = r9.zzb
            if (r1 != 0) goto L34
            java.lang.String r1 = " versionString"
            r0.append(r1)
        L34:
            byte r1 = r9.zzf
            r1 = r1 & 1
            if (r1 != 0) goto L3f
            java.lang.String r1 = " majorVersion"
            r0.append(r1)
        L3f:
            byte r1 = r9.zzf
            r1 = r1 & 2
            if (r1 != 0) goto L4a
            java.lang.String r1 = " minorVersion"
            r0.append(r1)
        L4a:
            java.lang.String r1 = r9.zze
            if (r1 != 0) goto L53
            java.lang.String r1 = " vendorName"
            r0.append(r1)
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
    }
}
