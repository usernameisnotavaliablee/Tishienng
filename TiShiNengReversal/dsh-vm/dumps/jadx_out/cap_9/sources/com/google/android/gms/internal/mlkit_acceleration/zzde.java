package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzde implements com.google.android.gms.internal.mlkit_acceleration.zzgv {
    private final com.google.android.gms.internal.mlkit_acceleration.zzdd zza;

    private zzde(com.google.android.gms.internal.mlkit_acceleration.zzdd r2) {
            r1 = this;
            r1.<init>()
            byte[] r0 = com.google.android.gms.internal.mlkit_acceleration.zzeb.zzd
            r1.zza = r2
            r2.zza = r1
            return
    }

    public static com.google.android.gms.internal.mlkit_acceleration.zzde zza(com.google.android.gms.internal.mlkit_acceleration.zzdd r1) {
            com.google.android.gms.internal.mlkit_acceleration.zzde r0 = r1.zza
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.android.gms.internal.mlkit_acceleration.zzde r0 = new com.google.android.gms.internal.mlkit_acceleration.zzde
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzA(int r2, int r3) throws java.io.IOException {
            r1 = this;
            int r0 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r0
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r1.zza
            r0.zzp(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzB(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L4a
            com.google.android.gms.internal.mlkit_acceleration.zzdd r6 = r3.zza
            r1 = 2
            r6.zzo(r4, r1)
            r4 = 0
            r6 = 0
        Lb:
            int r1 = r5.size()
            if (r4 >= r1) goto L28
            java.lang.Object r1 = r5.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r2 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r2
            int r1 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzw(r1)
            int r6 = r6 + r1
            int r4 = r4 + 1
            goto Lb
        L28:
            com.google.android.gms.internal.mlkit_acceleration.zzdd r4 = r3.zza
            r4.zzq(r6)
        L2d:
            int r4 = r5.size()
            if (r0 >= r4) goto L67
            com.google.android.gms.internal.mlkit_acceleration.zzdd r4 = r3.zza
            java.lang.Object r6 = r5.get(r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r1 = r6 + r6
            int r6 = r6 >> 31
            r6 = r6 ^ r1
            r4.zzq(r6)
            int r0 = r0 + 1
            goto L2d
        L4a:
            int r6 = r5.size()
            if (r0 >= r6) goto L67
            com.google.android.gms.internal.mlkit_acceleration.zzdd r6 = r3.zza
            java.lang.Object r1 = r5.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r2 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r2
            r6.zzp(r4, r1)
            int r0 = r0 + 1
            goto L4a
        L67:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzC(int r4, long r5) throws java.io.IOException {
            r3 = this;
            long r0 = r5 + r5
            r2 = 63
            long r5 = r5 >> r2
            long r5 = r5 ^ r0
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r3.zza
            r0.zzr(r4, r5)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzD(int r7, java.util.List r8, boolean r9) throws java.io.IOException {
            r6 = this;
            r0 = 63
            r1 = 0
            if (r9 == 0) goto L4a
            com.google.android.gms.internal.mlkit_acceleration.zzdd r9 = r6.zza
            r2 = 2
            r9.zzo(r7, r2)
            r7 = 0
            r9 = 0
        Ld:
            int r2 = r8.size()
            if (r7 >= r2) goto L29
            java.lang.Object r2 = r8.get(r7)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r4 = r2 + r2
            long r2 = r2 >> r0
            long r2 = r2 ^ r4
            int r2 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzx(r2)
            int r9 = r9 + r2
            int r7 = r7 + 1
            goto Ld
        L29:
            com.google.android.gms.internal.mlkit_acceleration.zzdd r7 = r6.zza
            r7.zzq(r9)
        L2e:
            int r7 = r8.size()
            if (r1 >= r7) goto L66
            com.google.android.gms.internal.mlkit_acceleration.zzdd r7 = r6.zza
            java.lang.Object r9 = r8.get(r1)
            java.lang.Long r9 = (java.lang.Long) r9
            long r2 = r9.longValue()
            long r4 = r2 + r2
            long r2 = r2 >> r0
            long r2 = r2 ^ r4
            r7.zzs(r2)
            int r1 = r1 + 1
            goto L2e
        L4a:
            int r9 = r8.size()
            if (r1 >= r9) goto L66
            com.google.android.gms.internal.mlkit_acceleration.zzdd r9 = r6.zza
            java.lang.Object r2 = r8.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r4 = r2 + r2
            long r2 = r2 >> r0
            long r2 = r2 ^ r4
            r9.zzr(r7, r2)
            int r1 = r1 + 1
            goto L4a
        L66:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    @java.lang.Deprecated
    public final void zzE(int r3) throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r2.zza
            r1 = 3
            r0.zzo(r3, r1)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzF(int r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r1.zza
            r0.zzm(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzG(int r5, java.util.List r6) throws java.io.IOException {
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.gms.internal.mlkit_acceleration.zzei
            r1 = 0
            if (r0 == 0) goto L28
            r0 = r6
            com.google.android.gms.internal.mlkit_acceleration.zzei r0 = (com.google.android.gms.internal.mlkit_acceleration.zzei) r0
        L8:
            int r2 = r6.size()
            if (r1 >= r2) goto L3c
            java.lang.Object r2 = r0.zzf(r1)
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L1e
            com.google.android.gms.internal.mlkit_acceleration.zzdd r3 = r4.zza
            java.lang.String r2 = (java.lang.String) r2
            r3.zzm(r5, r2)
            goto L25
        L1e:
            com.google.android.gms.internal.mlkit_acceleration.zzdd r3 = r4.zza
            com.google.android.gms.internal.mlkit_acceleration.zzcs r2 = (com.google.android.gms.internal.mlkit_acceleration.zzcs) r2
            r3.zze(r5, r2)
        L25:
            int r1 = r1 + 1
            goto L8
        L28:
            int r0 = r6.size()
            if (r1 >= r0) goto L3c
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r4.zza
            java.lang.Object r2 = r6.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r0.zzm(r5, r2)
            int r1 = r1 + 1
            goto L28
        L3c:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzH(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r1.zza
            r0.zzp(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzI(int r3, java.util.List r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L40
            com.google.android.gms.internal.mlkit_acceleration.zzdd r5 = r2.zza
            r1 = 2
            r5.zzo(r3, r1)
            r3 = 0
            r5 = 0
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L23
            java.lang.Object r1 = r4.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzw(r1)
            int r5 = r5 + r1
            int r3 = r3 + 1
            goto Lb
        L23:
            com.google.android.gms.internal.mlkit_acceleration.zzdd r3 = r2.zza
            r3.zzq(r5)
        L28:
            int r3 = r4.size()
            if (r0 >= r3) goto L58
            com.google.android.gms.internal.mlkit_acceleration.zzdd r3 = r2.zza
            java.lang.Object r5 = r4.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.zzq(r5)
            int r0 = r0 + 1
            goto L28
        L40:
            int r5 = r4.size()
            if (r0 >= r5) goto L58
            com.google.android.gms.internal.mlkit_acceleration.zzdd r5 = r2.zza
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.zzp(r3, r1)
            int r0 = r0 + 1
            goto L40
        L58:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzJ(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r1.zza
            r0.zzr(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzK(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L40
            com.google.android.gms.internal.mlkit_acceleration.zzdd r6 = r3.zza
            r1 = 2
            r6.zzo(r4, r1)
            r4 = 0
            r6 = 0
        Lb:
            int r1 = r5.size()
            if (r4 >= r1) goto L23
            java.lang.Object r1 = r5.get(r4)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzx(r1)
            int r6 = r6 + r1
            int r4 = r4 + 1
            goto Lb
        L23:
            com.google.android.gms.internal.mlkit_acceleration.zzdd r4 = r3.zza
            r4.zzq(r6)
        L28:
            int r4 = r5.size()
            if (r0 >= r4) goto L58
            com.google.android.gms.internal.mlkit_acceleration.zzdd r4 = r3.zza
            java.lang.Object r6 = r5.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r4.zzs(r1)
            int r0 = r0 + 1
            goto L28
        L40:
            int r6 = r5.size()
            if (r0 >= r6) goto L58
            com.google.android.gms.internal.mlkit_acceleration.zzdd r6 = r3.zza
            java.lang.Object r1 = r5.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.zzr(r4, r1)
            int r0 = r0 + 1
            goto L40
        L58:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzb(int r2, boolean r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r1.zza
            r0.zzd(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzc(int r3, java.util.List r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L3c
            com.google.android.gms.internal.mlkit_acceleration.zzdd r5 = r2.zza
            r1 = 2
            r5.zzo(r3, r1)
            r3 = 0
            r5 = 0
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L1f
            java.lang.Object r1 = r4.get(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.getClass()
            int r5 = r5 + 1
            int r3 = r3 + 1
            goto Lb
        L1f:
            com.google.android.gms.internal.mlkit_acceleration.zzdd r3 = r2.zza
            r3.zzq(r5)
        L24:
            int r3 = r4.size()
            if (r0 >= r3) goto L54
            com.google.android.gms.internal.mlkit_acceleration.zzdd r3 = r2.zza
            java.lang.Object r5 = r4.get(r0)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r3.zzb(r5)
            int r0 = r0 + 1
            goto L24
        L3c:
            int r5 = r4.size()
            if (r0 >= r5) goto L54
            com.google.android.gms.internal.mlkit_acceleration.zzdd r5 = r2.zza
            java.lang.Object r1 = r4.get(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r5.zzd(r3, r1)
            int r0 = r0 + 1
            goto L3c
        L54:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzd(int r2, com.google.android.gms.internal.mlkit_acceleration.zzcs r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r1.zza
            r0.zze(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zze(int r4, java.util.List r5) throws java.io.IOException {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r5.size()
            if (r0 >= r1) goto L15
            com.google.android.gms.internal.mlkit_acceleration.zzdd r1 = r3.zza
            java.lang.Object r2 = r5.get(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcs r2 = (com.google.android.gms.internal.mlkit_acceleration.zzcs) r2
            r1.zze(r4, r2)
            int r0 = r0 + 1
            goto L1
        L15:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzf(int r2, double r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r1.zza
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
            r0.zzh(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzg(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L40
            com.google.android.gms.internal.mlkit_acceleration.zzdd r6 = r3.zza
            r1 = 2
            r6.zzo(r4, r1)
            r4 = 0
            r6 = 0
        Lb:
            int r1 = r5.size()
            if (r4 >= r1) goto L1f
            java.lang.Object r1 = r5.get(r4)
            java.lang.Double r1 = (java.lang.Double) r1
            r1.getClass()
            int r6 = r6 + 8
            int r4 = r4 + 1
            goto Lb
        L1f:
            com.google.android.gms.internal.mlkit_acceleration.zzdd r4 = r3.zza
            r4.zzq(r6)
        L24:
            int r4 = r5.size()
            if (r0 >= r4) goto L5c
            com.google.android.gms.internal.mlkit_acceleration.zzdd r4 = r3.zza
            java.lang.Object r6 = r5.get(r0)
            java.lang.Double r6 = (java.lang.Double) r6
            double r1 = r6.doubleValue()
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r4.zzi(r1)
            int r0 = r0 + 1
            goto L24
        L40:
            int r6 = r5.size()
            if (r0 >= r6) goto L5c
            com.google.android.gms.internal.mlkit_acceleration.zzdd r6 = r3.zza
            java.lang.Object r1 = r5.get(r0)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r6.zzh(r4, r1)
            int r0 = r0 + 1
            goto L40
        L5c:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    @java.lang.Deprecated
    public final void zzh(int r3) throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r2.zza
            r1 = 4
            r0.zzo(r3, r1)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzi(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r1.zza
            r0.zzj(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzj(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L41
            com.google.android.gms.internal.mlkit_acceleration.zzdd r6 = r3.zza
            r1 = 2
            r6.zzo(r4, r1)
            r4 = 0
            r6 = 0
        Lb:
            int r1 = r5.size()
            if (r4 >= r1) goto L24
            java.lang.Object r1 = r5.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            int r1 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzx(r1)
            int r6 = r6 + r1
            int r4 = r4 + 1
            goto Lb
        L24:
            com.google.android.gms.internal.mlkit_acceleration.zzdd r4 = r3.zza
            r4.zzq(r6)
        L29:
            int r4 = r5.size()
            if (r0 >= r4) goto L59
            com.google.android.gms.internal.mlkit_acceleration.zzdd r4 = r3.zza
            java.lang.Object r6 = r5.get(r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.zzk(r6)
            int r0 = r0 + 1
            goto L29
        L41:
            int r6 = r5.size()
            if (r0 >= r6) goto L59
            com.google.android.gms.internal.mlkit_acceleration.zzdd r6 = r3.zza
            java.lang.Object r1 = r5.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r6.zzj(r4, r1)
            int r0 = r0 + 1
            goto L41
        L59:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzk(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r1.zza
            r0.zzf(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzl(int r3, java.util.List r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L3c
            com.google.android.gms.internal.mlkit_acceleration.zzdd r5 = r2.zza
            r1 = 2
            r5.zzo(r3, r1)
            r3 = 0
            r5 = 0
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L1f
            java.lang.Object r1 = r4.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r5 = r5 + 4
            int r3 = r3 + 1
            goto Lb
        L1f:
            com.google.android.gms.internal.mlkit_acceleration.zzdd r3 = r2.zza
            r3.zzq(r5)
        L24:
            int r3 = r4.size()
            if (r0 >= r3) goto L54
            com.google.android.gms.internal.mlkit_acceleration.zzdd r3 = r2.zza
            java.lang.Object r5 = r4.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.zzg(r5)
            int r0 = r0 + 1
            goto L24
        L3c:
            int r5 = r4.size()
            if (r0 >= r5) goto L54
            com.google.android.gms.internal.mlkit_acceleration.zzdd r5 = r2.zza
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.zzf(r3, r1)
            int r0 = r0 + 1
            goto L3c
        L54:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzm(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r1.zza
            r0.zzh(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzn(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L3c
            com.google.android.gms.internal.mlkit_acceleration.zzdd r6 = r3.zza
            r1 = 2
            r6.zzo(r4, r1)
            r4 = 0
            r6 = 0
        Lb:
            int r1 = r5.size()
            if (r4 >= r1) goto L1f
            java.lang.Object r1 = r5.get(r4)
            java.lang.Long r1 = (java.lang.Long) r1
            r1.getClass()
            int r6 = r6 + 8
            int r4 = r4 + 1
            goto Lb
        L1f:
            com.google.android.gms.internal.mlkit_acceleration.zzdd r4 = r3.zza
            r4.zzq(r6)
        L24:
            int r4 = r5.size()
            if (r0 >= r4) goto L54
            com.google.android.gms.internal.mlkit_acceleration.zzdd r4 = r3.zza
            java.lang.Object r6 = r5.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r4.zzi(r1)
            int r0 = r0 + 1
            goto L24
        L3c:
            int r6 = r5.size()
            if (r0 >= r6) goto L54
            com.google.android.gms.internal.mlkit_acceleration.zzdd r6 = r3.zza
            java.lang.Object r1 = r5.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.zzh(r4, r1)
            int r0 = r0 + 1
            goto L3c
        L54:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzo(int r2, float r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r1.zza
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            r0.zzf(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzp(int r3, java.util.List r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L40
            com.google.android.gms.internal.mlkit_acceleration.zzdd r5 = r2.zza
            r1 = 2
            r5.zzo(r3, r1)
            r3 = 0
            r5 = 0
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L1f
            java.lang.Object r1 = r4.get(r3)
            java.lang.Float r1 = (java.lang.Float) r1
            r1.getClass()
            int r5 = r5 + 4
            int r3 = r3 + 1
            goto Lb
        L1f:
            com.google.android.gms.internal.mlkit_acceleration.zzdd r3 = r2.zza
            r3.zzq(r5)
        L24:
            int r3 = r4.size()
            if (r0 >= r3) goto L5c
            com.google.android.gms.internal.mlkit_acceleration.zzdd r3 = r2.zza
            java.lang.Object r5 = r4.get(r0)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            r3.zzg(r5)
            int r0 = r0 + 1
            goto L24
        L40:
            int r5 = r4.size()
            if (r0 >= r5) goto L5c
            com.google.android.gms.internal.mlkit_acceleration.zzdd r5 = r2.zza
            java.lang.Object r1 = r4.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r5.zzf(r3, r1)
            int r0 = r0 + 1
            goto L40
        L5c:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzq(int r3, java.lang.Object r4, com.google.android.gms.internal.mlkit_acceleration.zzfm r5) throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzfa r4 = (com.google.android.gms.internal.mlkit_acceleration.zzfa) r4
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r2.zza
            r1 = 3
            r0.zzo(r3, r1)
            com.google.android.gms.internal.mlkit_acceleration.zzde r1 = r0.zza
            r5.zzj(r4, r1)
            r4 = 4
            r0.zzo(r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzr(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r1.zza
            r0.zzj(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzs(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L41
            com.google.android.gms.internal.mlkit_acceleration.zzdd r6 = r3.zza
            r1 = 2
            r6.zzo(r4, r1)
            r4 = 0
            r6 = 0
        Lb:
            int r1 = r5.size()
            if (r4 >= r1) goto L24
            java.lang.Object r1 = r5.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            int r1 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzx(r1)
            int r6 = r6 + r1
            int r4 = r4 + 1
            goto Lb
        L24:
            com.google.android.gms.internal.mlkit_acceleration.zzdd r4 = r3.zza
            r4.zzq(r6)
        L29:
            int r4 = r5.size()
            if (r0 >= r4) goto L59
            com.google.android.gms.internal.mlkit_acceleration.zzdd r4 = r3.zza
            java.lang.Object r6 = r5.get(r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.zzk(r6)
            int r0 = r0 + 1
            goto L29
        L41:
            int r6 = r5.size()
            if (r0 >= r6) goto L59
            com.google.android.gms.internal.mlkit_acceleration.zzdd r6 = r3.zza
            java.lang.Object r1 = r5.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r6.zzj(r4, r1)
            int r0 = r0 + 1
            goto L41
        L59:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzt(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r1.zza
            r0.zzr(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzu(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L40
            com.google.android.gms.internal.mlkit_acceleration.zzdd r6 = r3.zza
            r1 = 2
            r6.zzo(r4, r1)
            r4 = 0
            r6 = 0
        Lb:
            int r1 = r5.size()
            if (r4 >= r1) goto L23
            java.lang.Object r1 = r5.get(r4)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = com.google.android.gms.internal.mlkit_acceleration.zzdd.zzx(r1)
            int r6 = r6 + r1
            int r4 = r4 + 1
            goto Lb
        L23:
            com.google.android.gms.internal.mlkit_acceleration.zzdd r4 = r3.zza
            r4.zzq(r6)
        L28:
            int r4 = r5.size()
            if (r0 >= r4) goto L58
            com.google.android.gms.internal.mlkit_acceleration.zzdd r4 = r3.zza
            java.lang.Object r6 = r5.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r4.zzs(r1)
            int r0 = r0 + 1
            goto L28
        L40:
            int r6 = r5.size()
            if (r0 >= r6) goto L58
            com.google.android.gms.internal.mlkit_acceleration.zzdd r6 = r3.zza
            java.lang.Object r1 = r5.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.zzr(r4, r1)
            int r0 = r0 + 1
            goto L40
        L58:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzv(int r2, java.lang.Object r3, com.google.android.gms.internal.mlkit_acceleration.zzfm r4) throws java.io.IOException {
            r1 = this;
            int r2 = r2 << 3
            com.google.android.gms.internal.mlkit_acceleration.zzfa r3 = (com.google.android.gms.internal.mlkit_acceleration.zzfa) r3
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r1.zza
            com.google.android.gms.internal.mlkit_acceleration.zzda r0 = (com.google.android.gms.internal.mlkit_acceleration.zzda) r0
            r2 = r2 | 2
            r0.zzq(r2)
            r2 = r3
            com.google.android.gms.internal.mlkit_acceleration.zzcc r2 = (com.google.android.gms.internal.mlkit_acceleration.zzcc) r2
            int r2 = r2.zzt(r4)
            r0.zzq(r2)
            com.google.android.gms.internal.mlkit_acceleration.zzde r2 = r0.zza
            r4.zzj(r3, r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzw(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r1.zza
            r0.zzf(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzx(int r3, java.util.List r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L3c
            com.google.android.gms.internal.mlkit_acceleration.zzdd r5 = r2.zza
            r1 = 2
            r5.zzo(r3, r1)
            r3 = 0
            r5 = 0
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L1f
            java.lang.Object r1 = r4.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r5 = r5 + 4
            int r3 = r3 + 1
            goto Lb
        L1f:
            com.google.android.gms.internal.mlkit_acceleration.zzdd r3 = r2.zza
            r3.zzq(r5)
        L24:
            int r3 = r4.size()
            if (r0 >= r3) goto L54
            com.google.android.gms.internal.mlkit_acceleration.zzdd r3 = r2.zza
            java.lang.Object r5 = r4.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.zzg(r5)
            int r0 = r0 + 1
            goto L24
        L3c:
            int r5 = r4.size()
            if (r0 >= r5) goto L54
            com.google.android.gms.internal.mlkit_acceleration.zzdd r5 = r2.zza
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.zzf(r3, r1)
            int r0 = r0 + 1
            goto L3c
        L54:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzy(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdd r0 = r1.zza
            r0.zzh(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzgv
    public final void zzz(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L3c
            com.google.android.gms.internal.mlkit_acceleration.zzdd r6 = r3.zza
            r1 = 2
            r6.zzo(r4, r1)
            r4 = 0
            r6 = 0
        Lb:
            int r1 = r5.size()
            if (r4 >= r1) goto L1f
            java.lang.Object r1 = r5.get(r4)
            java.lang.Long r1 = (java.lang.Long) r1
            r1.getClass()
            int r6 = r6 + 8
            int r4 = r4 + 1
            goto Lb
        L1f:
            com.google.android.gms.internal.mlkit_acceleration.zzdd r4 = r3.zza
            r4.zzq(r6)
        L24:
            int r4 = r5.size()
            if (r0 >= r4) goto L54
            com.google.android.gms.internal.mlkit_acceleration.zzdd r4 = r3.zza
            java.lang.Object r6 = r5.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r4.zzi(r1)
            int r0 = r0 + 1
            goto L24
        L3c:
            int r6 = r5.size()
            if (r0 >= r6) goto L54
            com.google.android.gms.internal.mlkit_acceleration.zzdd r6 = r3.zza
            java.lang.Object r1 = r5.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.zzh(r4, r1)
            int r0 = r0 + 1
            goto L3c
        L54:
            return
    }
}
