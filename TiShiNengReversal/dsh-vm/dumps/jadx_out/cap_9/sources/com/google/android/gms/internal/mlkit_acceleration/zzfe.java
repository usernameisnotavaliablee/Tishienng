package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzfe implements com.google.android.gms.internal.mlkit_acceleration.zzfm {
    private final com.google.android.gms.internal.mlkit_acceleration.zzfa zza;
    private final com.google.android.gms.internal.mlkit_acceleration.zzgd zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.mlkit_acceleration.zzdj zzd;

    private zzfe(com.google.android.gms.internal.mlkit_acceleration.zzgd r1, com.google.android.gms.internal.mlkit_acceleration.zzdj r2, com.google.android.gms.internal.mlkit_acceleration.zzfa r3) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            boolean r1 = r2.zzh(r3)
            r0.zzc = r1
            r0.zzd = r2
            r0.zza = r3
            return
    }

    static com.google.android.gms.internal.mlkit_acceleration.zzfe zzc(com.google.android.gms.internal.mlkit_acceleration.zzgd r1, com.google.android.gms.internal.mlkit_acceleration.zzdj r2, com.google.android.gms.internal.mlkit_acceleration.zzfa r3) {
            com.google.android.gms.internal.mlkit_acceleration.zzfe r0 = new com.google.android.gms.internal.mlkit_acceleration.zzfe
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfm
    public final int zza(java.lang.Object r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzgd r0 = r2.zzb
            java.lang.Object r1 = r0.zzd(r3)
            int r0 = r0.zzb(r1)
            boolean r1 = r2.zzc
            if (r1 != 0) goto Lf
            return r0
        Lf:
            com.google.android.gms.internal.mlkit_acceleration.zzdj r0 = r2.zzd
            r0.zza(r3)
            r3 = 0
            throw r3
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfm
    public final int zzb(java.lang.Object r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzgd r0 = r2.zzb
            java.lang.Object r0 = r0.zzd(r3)
            int r0 = r0.hashCode()
            boolean r1 = r2.zzc
            if (r1 != 0) goto Lf
            return r0
        Lf:
            com.google.android.gms.internal.mlkit_acceleration.zzdj r0 = r2.zzd
            r0.zza(r3)
            r3 = 0
            throw r3
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfm
    public final java.lang.Object zze() {
            r2 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzfa r0 = r2.zza
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_acceleration.zzdv
            if (r1 == 0) goto Ld
            com.google.android.gms.internal.mlkit_acceleration.zzdv r0 = (com.google.android.gms.internal.mlkit_acceleration.zzdv) r0
            com.google.android.gms.internal.mlkit_acceleration.zzdv r0 = r0.zzB()
            return r0
        Ld:
            com.google.android.gms.internal.mlkit_acceleration.zzez r0 = r0.zzF()
            com.google.android.gms.internal.mlkit_acceleration.zzfa r0 = r0.zzn()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfm
    public final void zzf(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzgd r0 = r1.zzb
            r0.zzm(r2)
            com.google.android.gms.internal.mlkit_acceleration.zzdj r0 = r1.zzd
            r0.zze(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfm
    public final void zzg(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzgd r0 = r1.zzb
            com.google.android.gms.internal.mlkit_acceleration.zzfo.zzq(r0, r2, r3)
            boolean r2 = r1.zzc
            if (r2 != 0) goto La
            return
        La:
            com.google.android.gms.internal.mlkit_acceleration.zzdj r2 = r1.zzd
            r2.zza(r3)
            r2 = 0
            throw r2
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfm
    public final void zzh(java.lang.Object r11, com.google.android.gms.internal.mlkit_acceleration.zzfl r12, com.google.android.gms.internal.mlkit_acceleration.zzdi r13) throws java.io.IOException {
            r10 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzgd r0 = r10.zzb
            java.lang.Object r1 = r0.zzc(r11)
            com.google.android.gms.internal.mlkit_acceleration.zzdj r2 = r10.zzd
            com.google.android.gms.internal.mlkit_acceleration.zzdn r3 = r2.zzb(r11)
        Lc:
            int r4 = r12.zzc()     // Catch: java.lang.Throwable -> L31
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L16
            goto L3f
        L16:
            int r4 = r12.zzd()     // Catch: java.lang.Throwable -> L31
            r6 = 11
            if (r4 == r6) goto L43
            r5 = r4 & 7
            r6 = 2
            if (r5 != r6) goto L38
            com.google.android.gms.internal.mlkit_acceleration.zzfa r5 = r10.zza     // Catch: java.lang.Throwable -> L31
            int r4 = r4 >>> 3
            java.lang.Object r4 = r2.zzc(r13, r5, r4)     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L33
            r2.zzf(r12, r4, r13, r3)     // Catch: java.lang.Throwable -> L31
            goto Lc
        L31:
            r12 = move-exception
            goto L8f
        L33:
            boolean r4 = r0.zzq(r1, r12)     // Catch: java.lang.Throwable -> L31
            goto L3c
        L38:
            boolean r4 = r12.zzO()     // Catch: java.lang.Throwable -> L31
        L3c:
            if (r4 == 0) goto L3f
            goto Lc
        L3f:
            r0.zzn(r11, r1)
            return
        L43:
            r4 = 0
            r6 = 0
            r6 = r4
            r7 = 0
        L47:
            int r8 = r12.zzc()     // Catch: java.lang.Throwable -> L31
            if (r8 != r5) goto L4e
            goto L76
        L4e:
            int r8 = r12.zzd()     // Catch: java.lang.Throwable -> L31
            r9 = 16
            if (r8 != r9) goto L61
            int r7 = r12.zzj()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.mlkit_acceleration.zzfa r4 = r10.zza     // Catch: java.lang.Throwable -> L31
            java.lang.Object r4 = r2.zzc(r13, r4, r7)     // Catch: java.lang.Throwable -> L31
            goto L47
        L61:
            r9 = 26
            if (r8 != r9) goto L70
            if (r4 == 0) goto L6b
            r2.zzf(r12, r4, r13, r3)     // Catch: java.lang.Throwable -> L31
            goto L47
        L6b:
            com.google.android.gms.internal.mlkit_acceleration.zzcs r6 = r12.zzp()     // Catch: java.lang.Throwable -> L31
            goto L47
        L70:
            boolean r8 = r12.zzO()     // Catch: java.lang.Throwable -> L31
            if (r8 != 0) goto L47
        L76:
            int r5 = r12.zzd()     // Catch: java.lang.Throwable -> L31
            r8 = 12
            if (r5 != r8) goto L8a
            if (r6 == 0) goto Lc
            if (r4 == 0) goto L86
            r2.zzg(r6, r4, r13, r3)     // Catch: java.lang.Throwable -> L31
            goto Lc
        L86:
            r0.zzk(r1, r7, r6)     // Catch: java.lang.Throwable -> L31
            goto Lc
        L8a:
            com.google.android.gms.internal.mlkit_acceleration.zzed r12 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzb()     // Catch: java.lang.Throwable -> L31
            throw r12     // Catch: java.lang.Throwable -> L31
        L8f:
            r0.zzn(r11, r1)
            throw r12
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfm
    public final void zzi(java.lang.Object r1, byte[] r2, int r3, int r4, com.google.android.gms.internal.mlkit_acceleration.zzcf r5) throws java.io.IOException {
            r0 = this;
            r2 = r1
            com.google.android.gms.internal.mlkit_acceleration.zzdv r2 = (com.google.android.gms.internal.mlkit_acceleration.zzdv) r2
            com.google.android.gms.internal.mlkit_acceleration.zzge r3 = r2.zzc
            com.google.android.gms.internal.mlkit_acceleration.zzge r4 = com.google.android.gms.internal.mlkit_acceleration.zzge.zzc()
            if (r3 == r4) goto Lc
            goto L12
        Lc:
            com.google.android.gms.internal.mlkit_acceleration.zzge r3 = com.google.android.gms.internal.mlkit_acceleration.zzge.zzf()
            r2.zzc = r3
        L12:
            com.google.android.gms.internal.mlkit_acceleration.zzds r1 = (com.google.android.gms.internal.mlkit_acceleration.zzds) r1
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfm
    public final void zzj(java.lang.Object r1, com.google.android.gms.internal.mlkit_acceleration.zzgv r2) throws java.io.IOException {
            r0 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdj r2 = r0.zzd
            r2.zza(r1)
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfm
    public final boolean zzk(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzgd r0 = r2.zzb
            java.lang.Object r1 = r0.zzd(r3)
            java.lang.Object r0 = r0.zzd(r4)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L12
            r3 = 0
            return r3
        L12:
            boolean r0 = r2.zzc
            if (r0 != 0) goto L18
            r3 = 1
            return r3
        L18:
            com.google.android.gms.internal.mlkit_acceleration.zzdj r0 = r2.zzd
            r0.zza(r3)
            com.google.android.gms.internal.mlkit_acceleration.zzdj r3 = r2.zzd
            r3.zza(r4)
            r3 = 0
            throw r3
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfm
    public final boolean zzl(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdj r0 = r1.zzd
            r0.zza(r2)
            r2 = 0
            throw r2
    }
}
