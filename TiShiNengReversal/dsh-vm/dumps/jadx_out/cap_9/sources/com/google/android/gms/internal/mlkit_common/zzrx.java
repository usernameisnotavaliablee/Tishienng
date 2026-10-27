package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzrx extends com.google.android.gms.internal.mlkit_common.zzsj {
    private final com.google.android.gms.internal.mlkit_common.zzmu zza;
    private final java.lang.String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final com.google.mlkit.common.sdkinternal.ModelType zze;
    private final com.google.android.gms.internal.mlkit_common.zzna zzf;
    private final int zzg;

    /* synthetic */ zzrx(com.google.android.gms.internal.mlkit_common.zzmu r1, java.lang.String r2, boolean r3, boolean r4, com.google.mlkit.common.sdkinternal.ModelType r5, com.google.android.gms.internal.mlkit_common.zzna r6, int r7, com.google.android.gms.internal.mlkit_common.zzrw r8) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.mlkit_common.zzsj
            r2 = 0
            if (r1 == 0) goto L54
            com.google.android.gms.internal.mlkit_common.zzsj r5 = (com.google.android.gms.internal.mlkit_common.zzsj) r5
            com.google.android.gms.internal.mlkit_common.zzmu r1 = r4.zza
            com.google.android.gms.internal.mlkit_common.zzmu r3 = r5.zzc()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L54
            java.lang.String r1 = r4.zzb
            java.lang.String r3 = r5.zze()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L54
            boolean r1 = r4.zzc
            boolean r3 = r5.zzg()
            if (r1 != r3) goto L54
            boolean r1 = r4.zzd
            boolean r3 = r5.zzf()
            if (r1 != r3) goto L54
            com.google.mlkit.common.sdkinternal.ModelType r1 = r4.zze
            com.google.mlkit.common.sdkinternal.ModelType r3 = r5.zzb()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L54
            com.google.android.gms.internal.mlkit_common.zzna r1 = r4.zzf
            com.google.android.gms.internal.mlkit_common.zzna r3 = r5.zzd()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L54
            int r1 = r4.zzg
            int r5 = r5.zza()
            if (r1 != r5) goto L54
            return r0
        L54:
            return r2
    }

    public final int hashCode() {
            r6 = this;
            com.google.android.gms.internal.mlkit_common.zzmu r0 = r6.zza
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            java.lang.String r2 = r6.zzb
            int r0 = r0 * r1
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            boolean r2 = r6.zzc
            r3 = 1231(0x4cf, float:1.725E-42)
            r4 = 1237(0x4d5, float:1.733E-42)
            r5 = 1
            if (r5 == r2) goto L1f
            r2 = 1237(0x4d5, float:1.733E-42)
            goto L21
        L1f:
            r2 = 1231(0x4cf, float:1.725E-42)
        L21:
            int r0 = r0 * r1
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r2 = r6.zzd
            if (r5 == r2) goto L2c
            r3 = 1237(0x4d5, float:1.733E-42)
        L2c:
            r0 = r0 ^ r3
            int r0 = r0 * r1
            com.google.mlkit.common.sdkinternal.ModelType r2 = r6.zze
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.android.gms.internal.mlkit_common.zzna r2 = r6.zzf
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r1 = r6.zzg
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            com.google.android.gms.internal.mlkit_common.zzna r0 = r5.zzf
            com.google.mlkit.common.sdkinternal.ModelType r1 = r5.zze
            com.google.android.gms.internal.mlkit_common.zzmu r2 = r5.zza
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "RemoteModelLoggingOptions{errorCode="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = ", tfliteSchemaVersion="
            r3.append(r2)
            java.lang.String r2 = r5.zzb
            r3.append(r2)
            java.lang.String r2 = ", shouldLogRoughDownloadTime="
            r3.append(r2)
            boolean r2 = r5.zzc
            r3.append(r2)
            java.lang.String r2 = ", shouldLogExactDownloadTime="
            r3.append(r2)
            boolean r2 = r5.zzd
            r3.append(r2)
            java.lang.String r2 = ", modelType="
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = ", downloadStatus="
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = ", failureStatusCode="
            r3.append(r0)
            int r0 = r5.zzg
            r3.append(r0)
            java.lang.String r0 = "}"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final int zza() {
            r1 = this;
            int r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final com.google.mlkit.common.sdkinternal.ModelType zzb() {
            r1 = this;
            com.google.mlkit.common.sdkinternal.ModelType r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final com.google.android.gms.internal.mlkit_common.zzmu zzc() {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzmu r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final com.google.android.gms.internal.mlkit_common.zzna zzd() {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzna r0 = r1.zzf
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final java.lang.String zze() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final boolean zzf() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final boolean zzg() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }
}
