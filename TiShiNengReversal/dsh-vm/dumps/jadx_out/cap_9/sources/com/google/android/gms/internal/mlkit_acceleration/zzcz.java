package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzcz implements com.google.android.gms.internal.mlkit_acceleration.zzfl {
    private final com.google.android.gms.internal.mlkit_acceleration.zzcy zza;
    private int zzb;
    private int zzc;
    private int zzd;

    private zzcz(com.google.android.gms.internal.mlkit_acceleration.zzcy r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzd = r0
            byte[] r0 = com.google.android.gms.internal.mlkit_acceleration.zzeb.zzd
            r1.zza = r2
            r2.zzc = r1
            return
    }

    private final void zzP(java.lang.Object r3, com.google.android.gms.internal.mlkit_acceleration.zzfm r4, com.google.android.gms.internal.mlkit_acceleration.zzdi r5) throws java.io.IOException {
            r2 = this;
            int r0 = r2.zzc
            int r1 = r2.zzb
            int r1 = r1 >>> 3
            int r1 = r1 << 3
            r1 = r1 | 4
            r2.zzc = r1
            r4.zzh(r3, r2, r5)     // Catch: java.lang.Throwable -> L1d
            int r3 = r2.zzb     // Catch: java.lang.Throwable -> L1d
            int r4 = r2.zzc     // Catch: java.lang.Throwable -> L1d
            if (r3 != r4) goto L18
            r2.zzc = r0
            return
        L18:
            com.google.android.gms.internal.mlkit_acceleration.zzed r3 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzg()     // Catch: java.lang.Throwable -> L1d
            throw r3     // Catch: java.lang.Throwable -> L1d
        L1d:
            r3 = move-exception
            r2.zzc = r0
            throw r3
    }

    private final void zzQ(java.lang.Object r4, com.google.android.gms.internal.mlkit_acceleration.zzfm r5, com.google.android.gms.internal.mlkit_acceleration.zzdi r6) throws java.io.IOException {
            r3 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r3.zza
            int r1 = r0.zzn()
            int r2 = r0.zza
            int r0 = r0.zzb
            if (r2 >= r0) goto L2f
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r3.zza
            int r0 = r0.zze(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r3.zza
            int r2 = r1.zza
            int r2 = r2 + 1
            r1.zza = r2
            r5.zzh(r4, r3, r6)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r4 = r3.zza
            r5 = 0
            r4.zzz(r5)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r4 = r3.zza
            int r5 = r4.zza
            int r5 = r5 + (-1)
            r4.zza = r5
            r4.zzA(r0)
            return
        L2f:
            com.google.android.gms.internal.mlkit_acceleration.zzed r4 = new com.google.android.gms.internal.mlkit_acceleration.zzed
            java.lang.String r5 = "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."
            r4.<init>(r5)
            throw r4
    }

    private final void zzR(int r2) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r1.zza
            int r0 = r0.zzd()
            if (r0 != r2) goto L9
            return
        L9:
            com.google.android.gms.internal.mlkit_acceleration.zzed r2 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzj()
            throw r2
    }

    private final void zzS(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzb
            r0 = r0 & 7
            if (r0 != r2) goto L7
            return
        L7:
            com.google.android.gms.internal.mlkit_acceleration.zzec r2 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r2
    }

    private static final void zzT(int r0) throws java.io.IOException {
            r0 = r0 & 3
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzg()
            throw r0
    }

    private static final void zzU(int r0) throws java.io.IOException {
            r0 = r0 & 7
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzg()
            throw r0
    }

    public static com.google.android.gms.internal.mlkit_acceleration.zzcz zzq(com.google.android.gms.internal.mlkit_acceleration.zzcy r1) {
            com.google.android.gms.internal.mlkit_acceleration.zzcz r0 = r1.zzc
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.android.gms.internal.mlkit_acceleration.zzcz r0 = new com.google.android.gms.internal.mlkit_acceleration.zzcz
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final void zzA(java.util.List r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_acceleration.zzep
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L56
            r0 = r5
            com.google.android.gms.internal.mlkit_acceleration.zzep r0 = (com.google.android.gms.internal.mlkit_acceleration.zzep) r0
            int r5 = r4.zzb
            r5 = r5 & 7
            if (r5 == r2) goto L39
            if (r5 != r1) goto L34
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzn()
            zzU(r5)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r4.zza
            int r1 = r1.zzd()
            int r1 = r1 + r5
        L21:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            long r2 = r5.zzo()
            r0.zzf(r2)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzd()
            if (r5 < r1) goto L21
            goto Lab
        L34:
            com.google.android.gms.internal.mlkit_acceleration.zzec r5 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r5
        L39:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            long r1 = r5.zzo()
            r0.zzf(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            boolean r5 = r5.zzC()
            if (r5 == 0) goto L4b
            goto Lab
        L4b:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzm()
            int r1 = r4.zzb
            if (r5 == r1) goto L39
            goto La9
        L56:
            int r0 = r4.zzb
            r0 = r0 & 7
            if (r0 == r2) goto L89
            if (r0 != r1) goto L84
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzn()
            zzU(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r4.zza
            int r1 = r1.zzd()
            int r1 = r1 + r0
        L6e:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            long r2 = r0.zzo()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzd()
            if (r0 < r1) goto L6e
            goto Lab
        L84:
            com.google.android.gms.internal.mlkit_acceleration.zzec r5 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r5
        L89:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            long r0 = r0.zzo()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            boolean r0 = r0.zzC()
            if (r0 != 0) goto Lab
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzm()
            int r1 = r4.zzb
            if (r0 == r1) goto L89
            r5 = r0
        La9:
            r4.zzd = r5
        Lab:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final void zzB(java.util.List r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_acceleration.zzdp
            r1 = 5
            r2 = 2
            if (r0 == 0) goto L57
            r0 = r5
            com.google.android.gms.internal.mlkit_acceleration.zzdp r0 = (com.google.android.gms.internal.mlkit_acceleration.zzdp) r0
            int r5 = r4.zzb
            r5 = r5 & 7
            if (r5 == r2) goto L34
            if (r5 != r1) goto L2f
        L11:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            float r5 = r5.zzc()
            r0.zze(r5)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            boolean r5 = r5.zzC()
            if (r5 == 0) goto L24
            goto Lac
        L24:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzm()
            int r1 = r4.zzb
            if (r5 == r1) goto L11
            goto L7f
        L2f:
            com.google.android.gms.internal.mlkit_acceleration.zzec r5 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r5
        L34:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzn()
            zzT(r5)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r4.zza
            int r1 = r1.zzd()
            int r3 = r1 + r5
        L45:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            float r5 = r5.zzc()
            r0.zze(r5)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzd()
            if (r5 < r3) goto L45
            goto Lac
        L57:
            int r0 = r4.zzb
            r0 = r0 & 7
            if (r0 == r2) goto L87
            if (r0 != r1) goto L82
        L5f:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            float r0 = r0.zzc()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            boolean r0 = r0.zzC()
            if (r0 != 0) goto Lac
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzm()
            int r1 = r4.zzb
            if (r0 == r1) goto L5f
            r5 = r0
        L7f:
            r4.zzd = r5
            return
        L82:
            com.google.android.gms.internal.mlkit_acceleration.zzec r5 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r5
        L87:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzn()
            zzT(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r4.zza
            int r1 = r1.zzd()
            int r1 = r1 + r0
        L97:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            float r0 = r0.zzc()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzd()
            if (r0 < r1) goto L97
        Lac:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    @java.lang.Deprecated
    public final void zzC(java.util.List r4, com.google.android.gms.internal.mlkit_acceleration.zzfm r5, com.google.android.gms.internal.mlkit_acceleration.zzdi r6) throws java.io.IOException {
            r3 = this;
            int r0 = r3.zzb
            r1 = r0 & 7
            r2 = 3
            if (r1 != r2) goto L2c
        L7:
            java.lang.Object r1 = r5.zze()
            r3.zzP(r1, r5, r6)
            r5.zzf(r1)
            r4.add(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r3.zza
            boolean r1 = r1.zzC()
            if (r1 != 0) goto L2b
            int r1 = r3.zzd
            if (r1 == 0) goto L21
            goto L2b
        L21:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r3.zza
            int r1 = r1.zzm()
            if (r1 == r0) goto L7
            r3.zzd = r1
        L2b:
            return
        L2c:
            com.google.android.gms.internal.mlkit_acceleration.zzec r4 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r4
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final void zzD(java.util.List r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.mlkit_acceleration.zzdw
            r1 = 2
            if (r0 == 0) goto L52
            r0 = r3
            com.google.android.gms.internal.mlkit_acceleration.zzdw r0 = (com.google.android.gms.internal.mlkit_acceleration.zzdw) r0
            int r3 = r2.zzb
            r3 = r3 & 7
            if (r3 == 0) goto L35
            if (r3 != r1) goto L30
            com.google.android.gms.internal.mlkit_acceleration.zzcy r3 = r2.zza
            int r1 = r3.zzn()
            int r3 = r3.zzd()
            int r3 = r3 + r1
        L1b:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            int r1 = r1.zzh()
            r0.zzf(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            int r1 = r1.zzd()
            if (r1 < r3) goto L1b
            r2.zzR(r3)
            return
        L30:
            com.google.android.gms.internal.mlkit_acceleration.zzec r3 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r3
        L35:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r3 = r2.zza
            int r3 = r3.zzh()
            r0.zzf(r3)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r3 = r2.zza
            boolean r3 = r3.zzC()
            if (r3 == 0) goto L47
            goto La5
        L47:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r3 = r2.zza
            int r3 = r3.zzm()
            int r1 = r2.zzb
            if (r3 == r1) goto L35
            goto La3
        L52:
            int r0 = r2.zzb
            r0 = r0 & 7
            if (r0 == 0) goto L83
            if (r0 != r1) goto L7e
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            int r1 = r0.zzn()
            int r0 = r0.zzd()
            int r0 = r0 + r1
        L65:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            int r1 = r1.zzh()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.add(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            int r1 = r1.zzd()
            if (r1 < r0) goto L65
            r2.zzR(r0)
            return
        L7e:
            com.google.android.gms.internal.mlkit_acceleration.zzec r3 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r3
        L83:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            int r0 = r0.zzh()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            boolean r0 = r0.zzC()
            if (r0 != 0) goto La5
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            int r0 = r0.zzm()
            int r1 = r2.zzb
            if (r0 == r1) goto L83
            r3 = r0
        La3:
            r2.zzd = r3
        La5:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final void zzE(java.util.List r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_acceleration.zzep
            r1 = 2
            if (r0 == 0) goto L52
            r0 = r4
            com.google.android.gms.internal.mlkit_acceleration.zzep r0 = (com.google.android.gms.internal.mlkit_acceleration.zzep) r0
            int r4 = r3.zzb
            r4 = r4 & 7
            if (r4 == 0) goto L35
            if (r4 != r1) goto L30
            com.google.android.gms.internal.mlkit_acceleration.zzcy r4 = r3.zza
            int r1 = r4.zzn()
            int r4 = r4.zzd()
            int r4 = r4 + r1
        L1b:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r3.zza
            long r1 = r1.zzp()
            r0.zzf(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r3.zza
            int r1 = r1.zzd()
            if (r1 < r4) goto L1b
            r3.zzR(r4)
            return
        L30:
            com.google.android.gms.internal.mlkit_acceleration.zzec r4 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r4
        L35:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r4 = r3.zza
            long r1 = r4.zzp()
            r0.zzf(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r4 = r3.zza
            boolean r4 = r4.zzC()
            if (r4 == 0) goto L47
            goto La5
        L47:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r4 = r3.zza
            int r4 = r4.zzm()
            int r1 = r3.zzb
            if (r4 == r1) goto L35
            goto La3
        L52:
            int r0 = r3.zzb
            r0 = r0 & 7
            if (r0 == 0) goto L83
            if (r0 != r1) goto L7e
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r3.zza
            int r1 = r0.zzn()
            int r0 = r0.zzd()
            int r0 = r0 + r1
        L65:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r3.zza
            long r1 = r1.zzp()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4.add(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r3.zza
            int r1 = r1.zzd()
            if (r1 < r0) goto L65
            r3.zzR(r0)
            return
        L7e:
            com.google.android.gms.internal.mlkit_acceleration.zzec r4 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r4
        L83:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r3.zza
            long r0 = r0.zzp()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r3.zza
            boolean r0 = r0.zzC()
            if (r0 != 0) goto La5
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r3.zza
            int r0 = r0.zzm()
            int r1 = r3.zzb
            if (r0 == r1) goto L83
            r4 = r0
        La3:
            r3.zzd = r4
        La5:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final void zzF(java.util.List r4, com.google.android.gms.internal.mlkit_acceleration.zzfm r5, com.google.android.gms.internal.mlkit_acceleration.zzdi r6) throws java.io.IOException {
            r3 = this;
            int r0 = r3.zzb
            r1 = r0 & 7
            r2 = 2
            if (r1 != r2) goto L2c
        L7:
            java.lang.Object r1 = r5.zze()
            r3.zzQ(r1, r5, r6)
            r5.zzf(r1)
            r4.add(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r3.zza
            boolean r1 = r1.zzC()
            if (r1 != 0) goto L2b
            int r1 = r3.zzd
            if (r1 == 0) goto L21
            goto L2b
        L21:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r3.zza
            int r1 = r1.zzm()
            if (r1 == r0) goto L7
            r3.zzd = r1
        L2b:
            return
        L2c:
            com.google.android.gms.internal.mlkit_acceleration.zzec r4 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r4
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final void zzG(java.util.List r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_acceleration.zzdw
            r1 = 5
            r2 = 2
            if (r0 == 0) goto L57
            r0 = r5
            com.google.android.gms.internal.mlkit_acceleration.zzdw r0 = (com.google.android.gms.internal.mlkit_acceleration.zzdw) r0
            int r5 = r4.zzb
            r5 = r5 & 7
            if (r5 == r2) goto L34
            if (r5 != r1) goto L2f
        L11:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzk()
            r0.zzf(r5)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            boolean r5 = r5.zzC()
            if (r5 == 0) goto L24
            goto Lac
        L24:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzm()
            int r1 = r4.zzb
            if (r5 == r1) goto L11
            goto L7f
        L2f:
            com.google.android.gms.internal.mlkit_acceleration.zzec r5 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r5
        L34:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzn()
            zzT(r5)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r4.zza
            int r1 = r1.zzd()
            int r3 = r1 + r5
        L45:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzk()
            r0.zzf(r5)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzd()
            if (r5 < r3) goto L45
            goto Lac
        L57:
            int r0 = r4.zzb
            r0 = r0 & 7
            if (r0 == r2) goto L87
            if (r0 != r1) goto L82
        L5f:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzk()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            boolean r0 = r0.zzC()
            if (r0 != 0) goto Lac
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzm()
            int r1 = r4.zzb
            if (r0 == r1) goto L5f
            r5 = r0
        L7f:
            r4.zzd = r5
            return
        L82:
            com.google.android.gms.internal.mlkit_acceleration.zzec r5 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r5
        L87:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzn()
            zzT(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r4.zza
            int r1 = r1.zzd()
            int r1 = r1 + r0
        L97:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzk()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzd()
            if (r0 < r1) goto L97
        Lac:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final void zzH(java.util.List r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_acceleration.zzep
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L56
            r0 = r5
            com.google.android.gms.internal.mlkit_acceleration.zzep r0 = (com.google.android.gms.internal.mlkit_acceleration.zzep) r0
            int r5 = r4.zzb
            r5 = r5 & 7
            if (r5 == r2) goto L39
            if (r5 != r1) goto L34
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzn()
            zzU(r5)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r4.zza
            int r1 = r1.zzd()
            int r1 = r1 + r5
        L21:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            long r2 = r5.zzt()
            r0.zzf(r2)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzd()
            if (r5 < r1) goto L21
            goto Lab
        L34:
            com.google.android.gms.internal.mlkit_acceleration.zzec r5 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r5
        L39:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            long r1 = r5.zzt()
            r0.zzf(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            boolean r5 = r5.zzC()
            if (r5 == 0) goto L4b
            goto Lab
        L4b:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzm()
            int r1 = r4.zzb
            if (r5 == r1) goto L39
            goto La9
        L56:
            int r0 = r4.zzb
            r0 = r0 & 7
            if (r0 == r2) goto L89
            if (r0 != r1) goto L84
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzn()
            zzU(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r4.zza
            int r1 = r1.zzd()
            int r1 = r1 + r0
        L6e:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            long r2 = r0.zzt()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzd()
            if (r0 < r1) goto L6e
            goto Lab
        L84:
            com.google.android.gms.internal.mlkit_acceleration.zzec r5 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r5
        L89:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            long r0 = r0.zzt()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            boolean r0 = r0.zzC()
            if (r0 != 0) goto Lab
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzm()
            int r1 = r4.zzb
            if (r0 == r1) goto L89
            r5 = r0
        La9:
            r4.zzd = r5
        Lab:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final void zzI(java.util.List r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.mlkit_acceleration.zzdw
            r1 = 2
            if (r0 == 0) goto L52
            r0 = r3
            com.google.android.gms.internal.mlkit_acceleration.zzdw r0 = (com.google.android.gms.internal.mlkit_acceleration.zzdw) r0
            int r3 = r2.zzb
            r3 = r3 & 7
            if (r3 == 0) goto L35
            if (r3 != r1) goto L30
            com.google.android.gms.internal.mlkit_acceleration.zzcy r3 = r2.zza
            int r1 = r3.zzn()
            int r3 = r3.zzd()
            int r3 = r3 + r1
        L1b:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            int r1 = r1.zzl()
            r0.zzf(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            int r1 = r1.zzd()
            if (r1 < r3) goto L1b
            r2.zzR(r3)
            return
        L30:
            com.google.android.gms.internal.mlkit_acceleration.zzec r3 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r3
        L35:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r3 = r2.zza
            int r3 = r3.zzl()
            r0.zzf(r3)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r3 = r2.zza
            boolean r3 = r3.zzC()
            if (r3 == 0) goto L47
            goto La5
        L47:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r3 = r2.zza
            int r3 = r3.zzm()
            int r1 = r2.zzb
            if (r3 == r1) goto L35
            goto La3
        L52:
            int r0 = r2.zzb
            r0 = r0 & 7
            if (r0 == 0) goto L83
            if (r0 != r1) goto L7e
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            int r1 = r0.zzn()
            int r0 = r0.zzd()
            int r0 = r0 + r1
        L65:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            int r1 = r1.zzl()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.add(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            int r1 = r1.zzd()
            if (r1 < r0) goto L65
            r2.zzR(r0)
            return
        L7e:
            com.google.android.gms.internal.mlkit_acceleration.zzec r3 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r3
        L83:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            int r0 = r0.zzl()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            boolean r0 = r0.zzC()
            if (r0 != 0) goto La5
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            int r0 = r0.zzm()
            int r1 = r2.zzb
            if (r0 == r1) goto L83
            r3 = r0
        La3:
            r2.zzd = r3
        La5:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final void zzJ(java.util.List r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_acceleration.zzep
            r1 = 2
            if (r0 == 0) goto L52
            r0 = r4
            com.google.android.gms.internal.mlkit_acceleration.zzep r0 = (com.google.android.gms.internal.mlkit_acceleration.zzep) r0
            int r4 = r3.zzb
            r4 = r4 & 7
            if (r4 == 0) goto L35
            if (r4 != r1) goto L30
            com.google.android.gms.internal.mlkit_acceleration.zzcy r4 = r3.zza
            int r1 = r4.zzn()
            int r4 = r4.zzd()
            int r4 = r4 + r1
        L1b:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r3.zza
            long r1 = r1.zzu()
            r0.zzf(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r3.zza
            int r1 = r1.zzd()
            if (r1 < r4) goto L1b
            r3.zzR(r4)
            return
        L30:
            com.google.android.gms.internal.mlkit_acceleration.zzec r4 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r4
        L35:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r4 = r3.zza
            long r1 = r4.zzu()
            r0.zzf(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r4 = r3.zza
            boolean r4 = r4.zzC()
            if (r4 == 0) goto L47
            goto La5
        L47:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r4 = r3.zza
            int r4 = r4.zzm()
            int r1 = r3.zzb
            if (r4 == r1) goto L35
            goto La3
        L52:
            int r0 = r3.zzb
            r0 = r0 & 7
            if (r0 == 0) goto L83
            if (r0 != r1) goto L7e
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r3.zza
            int r1 = r0.zzn()
            int r0 = r0.zzd()
            int r0 = r0 + r1
        L65:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r3.zza
            long r1 = r1.zzu()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4.add(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r3.zza
            int r1 = r1.zzd()
            if (r1 < r0) goto L65
            r3.zzR(r0)
            return
        L7e:
            com.google.android.gms.internal.mlkit_acceleration.zzec r4 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r4
        L83:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r3.zza
            long r0 = r0.zzu()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r3.zza
            boolean r0 = r0.zzC()
            if (r0 != 0) goto La5
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r3.zza
            int r0 = r0.zzm()
            int r1 = r3.zzb
            if (r0 == r1) goto L83
            r4 = r0
        La3:
            r3.zzd = r4
        La5:
            return
    }

    public final void zzK(java.util.List r3, boolean r4) throws java.io.IOException {
            r2 = this;
            int r0 = r2.zzb
            r0 = r0 & 7
            r1 = 2
            if (r0 != r1) goto L4f
            boolean r0 = r3 instanceof com.google.android.gms.internal.mlkit_acceleration.zzei
            if (r0 != 0) goto Lc
            goto L2a
        Lc:
            if (r4 != 0) goto L2a
            com.google.android.gms.internal.mlkit_acceleration.zzei r3 = (com.google.android.gms.internal.mlkit_acceleration.zzei) r3
        L10:
            com.google.android.gms.internal.mlkit_acceleration.zzcs r4 = r2.zzp()
            r3.zzi(r4)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r4 = r2.zza
            boolean r4 = r4.zzC()
            if (r4 != 0) goto L40
            com.google.android.gms.internal.mlkit_acceleration.zzcy r4 = r2.zza
            int r4 = r4.zzm()
            int r0 = r2.zzb
            if (r4 == r0) goto L10
            goto L4c
        L2a:
            if (r4 == 0) goto L31
            java.lang.String r0 = r2.zzs()
            goto L35
        L31:
            java.lang.String r0 = r2.zzr()
        L35:
            r3.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            boolean r0 = r0.zzC()
            if (r0 == 0) goto L41
        L40:
            return
        L41:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            int r0 = r0.zzm()
            int r1 = r2.zzb
            if (r0 == r1) goto L2a
            r4 = r0
        L4c:
            r2.zzd = r4
            return
        L4f:
            com.google.android.gms.internal.mlkit_acceleration.zzec r3 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r3
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final void zzL(java.util.List r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.mlkit_acceleration.zzdw
            r1 = 2
            if (r0 == 0) goto L52
            r0 = r3
            com.google.android.gms.internal.mlkit_acceleration.zzdw r0 = (com.google.android.gms.internal.mlkit_acceleration.zzdw) r0
            int r3 = r2.zzb
            r3 = r3 & 7
            if (r3 == 0) goto L35
            if (r3 != r1) goto L30
            com.google.android.gms.internal.mlkit_acceleration.zzcy r3 = r2.zza
            int r1 = r3.zzn()
            int r3 = r3.zzd()
            int r3 = r3 + r1
        L1b:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            int r1 = r1.zzn()
            r0.zzf(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            int r1 = r1.zzd()
            if (r1 < r3) goto L1b
            r2.zzR(r3)
            return
        L30:
            com.google.android.gms.internal.mlkit_acceleration.zzec r3 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r3
        L35:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r3 = r2.zza
            int r3 = r3.zzn()
            r0.zzf(r3)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r3 = r2.zza
            boolean r3 = r3.zzC()
            if (r3 == 0) goto L47
            goto La5
        L47:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r3 = r2.zza
            int r3 = r3.zzm()
            int r1 = r2.zzb
            if (r3 == r1) goto L35
            goto La3
        L52:
            int r0 = r2.zzb
            r0 = r0 & 7
            if (r0 == 0) goto L83
            if (r0 != r1) goto L7e
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            int r1 = r0.zzn()
            int r0 = r0.zzd()
            int r0 = r0 + r1
        L65:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            int r1 = r1.zzn()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.add(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            int r1 = r1.zzd()
            if (r1 < r0) goto L65
            r2.zzR(r0)
            return
        L7e:
            com.google.android.gms.internal.mlkit_acceleration.zzec r3 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r3
        L83:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            int r0 = r0.zzn()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            boolean r0 = r0.zzC()
            if (r0 != 0) goto La5
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            int r0 = r0.zzm()
            int r1 = r2.zzb
            if (r0 == r1) goto L83
            r3 = r0
        La3:
            r2.zzd = r3
        La5:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final void zzM(java.util.List r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_acceleration.zzep
            r1 = 2
            if (r0 == 0) goto L52
            r0 = r4
            com.google.android.gms.internal.mlkit_acceleration.zzep r0 = (com.google.android.gms.internal.mlkit_acceleration.zzep) r0
            int r4 = r3.zzb
            r4 = r4 & 7
            if (r4 == 0) goto L35
            if (r4 != r1) goto L30
            com.google.android.gms.internal.mlkit_acceleration.zzcy r4 = r3.zza
            int r1 = r4.zzn()
            int r4 = r4.zzd()
            int r4 = r4 + r1
        L1b:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r3.zza
            long r1 = r1.zzv()
            r0.zzf(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r3.zza
            int r1 = r1.zzd()
            if (r1 < r4) goto L1b
            r3.zzR(r4)
            return
        L30:
            com.google.android.gms.internal.mlkit_acceleration.zzec r4 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r4
        L35:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r4 = r3.zza
            long r1 = r4.zzv()
            r0.zzf(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r4 = r3.zza
            boolean r4 = r4.zzC()
            if (r4 == 0) goto L47
            goto La5
        L47:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r4 = r3.zza
            int r4 = r4.zzm()
            int r1 = r3.zzb
            if (r4 == r1) goto L35
            goto La3
        L52:
            int r0 = r3.zzb
            r0 = r0 & 7
            if (r0 == 0) goto L83
            if (r0 != r1) goto L7e
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r3.zza
            int r1 = r0.zzn()
            int r0 = r0.zzd()
            int r0 = r0 + r1
        L65:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r3.zza
            long r1 = r1.zzv()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4.add(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r3.zza
            int r1 = r1.zzd()
            if (r1 < r0) goto L65
            r3.zzR(r0)
            return
        L7e:
            com.google.android.gms.internal.mlkit_acceleration.zzec r4 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r4
        L83:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r3.zza
            long r0 = r0.zzv()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r3.zza
            boolean r0 = r0.zzC()
            if (r0 != 0) goto La5
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r3.zza
            int r0 = r0.zzm()
            int r1 = r3.zzb
            if (r0 == r1) goto L83
            r4 = r0
        La3:
            r3.zzd = r4
        La5:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final boolean zzN() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.zzS(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r1.zza
            boolean r0 = r0.zzD()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final boolean zzO() throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            boolean r0 = r0.zzC()
            if (r0 != 0) goto L16
            int r0 = r2.zzb
            int r1 = r2.zzc
            if (r0 != r1) goto Lf
            goto L16
        Lf:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            boolean r0 = r1.zzE(r0)
            return r0
        L16:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final double zza() throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.zzS(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            double r0 = r0.zzb()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final float zzb() throws java.io.IOException {
            r1 = this;
            r0 = 5
            r1.zzS(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r1.zza
            float r0 = r0.zzc()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final int zzc() throws java.io.IOException {
            r2 = this;
            int r0 = r2.zzd
            if (r0 == 0) goto La
            r2.zzb = r0
            r1 = 0
            r2.zzd = r1
            goto L12
        La:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            int r0 = r0.zzm()
            r2.zzb = r0
        L12:
            if (r0 == 0) goto L1c
            int r1 = r2.zzc
            if (r0 != r1) goto L19
            goto L1c
        L19:
            int r0 = r0 >>> 3
            return r0
        L1c:
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final int zzd() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final int zze() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.zzS(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r1.zza
            int r0 = r0.zzf()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final int zzf() throws java.io.IOException {
            r1 = this;
            r0 = 5
            r1.zzS(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r1.zza
            int r0 = r0.zzg()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final int zzg() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.zzS(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r1.zza
            int r0 = r0.zzh()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final int zzh() throws java.io.IOException {
            r1 = this;
            r0 = 5
            r1.zzS(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r1.zza
            int r0 = r0.zzk()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final int zzi() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.zzS(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r1.zza
            int r0 = r0.zzl()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final int zzj() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.zzS(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r1.zza
            int r0 = r0.zzn()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final long zzk() throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.zzS(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            long r0 = r0.zzo()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final long zzl() throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.zzS(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            long r0 = r0.zzp()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final long zzm() throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.zzS(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            long r0 = r0.zzt()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final long zzn() throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.zzS(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            long r0 = r0.zzu()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final long zzo() throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.zzS(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            long r0 = r0.zzv()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final com.google.android.gms.internal.mlkit_acceleration.zzcs zzp() throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.zzS(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r1.zza
            com.google.android.gms.internal.mlkit_acceleration.zzcs r0 = r0.zzw()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final java.lang.String zzr() throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.zzS(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r1.zza
            java.lang.String r0 = r0.zzx()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final java.lang.String zzs() throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.zzS(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r1.zza
            java.lang.String r0 = r0.zzy()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final void zzt(java.lang.Object r2, com.google.android.gms.internal.mlkit_acceleration.zzfm r3, com.google.android.gms.internal.mlkit_acceleration.zzdi r4) throws java.io.IOException {
            r1 = this;
            r0 = 3
            r1.zzS(r0)
            r1.zzP(r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final void zzu(java.lang.Object r2, com.google.android.gms.internal.mlkit_acceleration.zzfm r3, com.google.android.gms.internal.mlkit_acceleration.zzdi r4) throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.zzS(r0)
            r1.zzQ(r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final void zzv(java.util.List r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.mlkit_acceleration.zzch
            r1 = 2
            if (r0 == 0) goto L52
            r0 = r3
            com.google.android.gms.internal.mlkit_acceleration.zzch r0 = (com.google.android.gms.internal.mlkit_acceleration.zzch) r0
            int r3 = r2.zzb
            r3 = r3 & 7
            if (r3 == 0) goto L35
            if (r3 != r1) goto L30
            com.google.android.gms.internal.mlkit_acceleration.zzcy r3 = r2.zza
            int r1 = r3.zzn()
            int r3 = r3.zzd()
            int r3 = r3 + r1
        L1b:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            boolean r1 = r1.zzD()
            r0.zze(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            int r1 = r1.zzd()
            if (r1 < r3) goto L1b
            r2.zzR(r3)
            return
        L30:
            com.google.android.gms.internal.mlkit_acceleration.zzec r3 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r3
        L35:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r3 = r2.zza
            boolean r3 = r3.zzD()
            r0.zze(r3)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r3 = r2.zza
            boolean r3 = r3.zzC()
            if (r3 == 0) goto L47
            goto La5
        L47:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r3 = r2.zza
            int r3 = r3.zzm()
            int r1 = r2.zzb
            if (r3 == r1) goto L35
            goto La3
        L52:
            int r0 = r2.zzb
            r0 = r0 & 7
            if (r0 == 0) goto L83
            if (r0 != r1) goto L7e
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            int r1 = r0.zzn()
            int r0 = r0.zzd()
            int r0 = r0 + r1
        L65:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            boolean r1 = r1.zzD()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.add(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            int r1 = r1.zzd()
            if (r1 < r0) goto L65
            r2.zzR(r0)
            return
        L7e:
            com.google.android.gms.internal.mlkit_acceleration.zzec r3 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r3
        L83:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            boolean r0 = r0.zzD()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            boolean r0 = r0.zzC()
            if (r0 != 0) goto La5
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            int r0 = r0.zzm()
            int r1 = r2.zzb
            if (r0 == r1) goto L83
            r3 = r0
        La3:
            r2.zzd = r3
        La5:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final void zzw(java.util.List r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.zzb
            r0 = r0 & 7
            r1 = 2
            if (r0 != r1) goto L24
        L7:
            com.google.android.gms.internal.mlkit_acceleration.zzcs r0 = r2.zzp()
            r3.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            boolean r0 = r0.zzC()
            if (r0 == 0) goto L17
            return
        L17:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            int r0 = r0.zzm()
            int r1 = r2.zzb
            if (r0 == r1) goto L7
            r2.zzd = r0
            return
        L24:
            com.google.android.gms.internal.mlkit_acceleration.zzec r3 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r3
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final void zzx(java.util.List r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_acceleration.zzdf
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L56
            r0 = r5
            com.google.android.gms.internal.mlkit_acceleration.zzdf r0 = (com.google.android.gms.internal.mlkit_acceleration.zzdf) r0
            int r5 = r4.zzb
            r5 = r5 & 7
            if (r5 == r2) goto L39
            if (r5 != r1) goto L34
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzn()
            zzU(r5)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r4.zza
            int r1 = r1.zzd()
            int r1 = r1 + r5
        L21:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            double r2 = r5.zzb()
            r0.zze(r2)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzd()
            if (r5 < r1) goto L21
            goto Lab
        L34:
            com.google.android.gms.internal.mlkit_acceleration.zzec r5 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r5
        L39:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            double r1 = r5.zzb()
            r0.zze(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            boolean r5 = r5.zzC()
            if (r5 == 0) goto L4b
            goto Lab
        L4b:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzm()
            int r1 = r4.zzb
            if (r5 == r1) goto L39
            goto La9
        L56:
            int r0 = r4.zzb
            r0 = r0 & 7
            if (r0 == r2) goto L89
            if (r0 != r1) goto L84
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzn()
            zzU(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r4.zza
            int r1 = r1.zzd()
            int r1 = r1 + r0
        L6e:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            double r2 = r0.zzb()
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r5.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzd()
            if (r0 < r1) goto L6e
            goto Lab
        L84:
            com.google.android.gms.internal.mlkit_acceleration.zzec r5 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r5
        L89:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            double r0 = r0.zzb()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r5.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            boolean r0 = r0.zzC()
            if (r0 != 0) goto Lab
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzm()
            int r1 = r4.zzb
            if (r0 == r1) goto L89
            r5 = r0
        La9:
            r4.zzd = r5
        Lab:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final void zzy(java.util.List r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.mlkit_acceleration.zzdw
            r1 = 2
            if (r0 == 0) goto L52
            r0 = r3
            com.google.android.gms.internal.mlkit_acceleration.zzdw r0 = (com.google.android.gms.internal.mlkit_acceleration.zzdw) r0
            int r3 = r2.zzb
            r3 = r3 & 7
            if (r3 == 0) goto L35
            if (r3 != r1) goto L30
            com.google.android.gms.internal.mlkit_acceleration.zzcy r3 = r2.zza
            int r1 = r3.zzn()
            int r3 = r3.zzd()
            int r3 = r3 + r1
        L1b:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            int r1 = r1.zzf()
            r0.zzf(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            int r1 = r1.zzd()
            if (r1 < r3) goto L1b
            r2.zzR(r3)
            return
        L30:
            com.google.android.gms.internal.mlkit_acceleration.zzec r3 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r3
        L35:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r3 = r2.zza
            int r3 = r3.zzf()
            r0.zzf(r3)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r3 = r2.zza
            boolean r3 = r3.zzC()
            if (r3 == 0) goto L47
            goto La5
        L47:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r3 = r2.zza
            int r3 = r3.zzm()
            int r1 = r2.zzb
            if (r3 == r1) goto L35
            goto La3
        L52:
            int r0 = r2.zzb
            r0 = r0 & 7
            if (r0 == 0) goto L83
            if (r0 != r1) goto L7e
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            int r1 = r0.zzn()
            int r0 = r0.zzd()
            int r0 = r0 + r1
        L65:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            int r1 = r1.zzf()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.add(r1)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r2.zza
            int r1 = r1.zzd()
            if (r1 < r0) goto L65
            r2.zzR(r0)
            return
        L7e:
            com.google.android.gms.internal.mlkit_acceleration.zzec r3 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r3
        L83:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            int r0 = r0.zzf()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            boolean r0 = r0.zzC()
            if (r0 != 0) goto La5
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r2.zza
            int r0 = r0.zzm()
            int r1 = r2.zzb
            if (r0 == r1) goto L83
            r3 = r0
        La3:
            r2.zzd = r3
        La5:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfl
    public final void zzz(java.util.List r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.mlkit_acceleration.zzdw
            r1 = 5
            r2 = 2
            if (r0 == 0) goto L57
            r0 = r5
            com.google.android.gms.internal.mlkit_acceleration.zzdw r0 = (com.google.android.gms.internal.mlkit_acceleration.zzdw) r0
            int r5 = r4.zzb
            r5 = r5 & 7
            if (r5 == r2) goto L34
            if (r5 != r1) goto L2f
        L11:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzg()
            r0.zzf(r5)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            boolean r5 = r5.zzC()
            if (r5 == 0) goto L24
            goto Lac
        L24:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzm()
            int r1 = r4.zzb
            if (r5 == r1) goto L11
            goto L7f
        L2f:
            com.google.android.gms.internal.mlkit_acceleration.zzec r5 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r5
        L34:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzn()
            zzT(r5)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r4.zza
            int r1 = r1.zzd()
            int r3 = r1 + r5
        L45:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzg()
            r0.zzf(r5)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r5 = r4.zza
            int r5 = r5.zzd()
            if (r5 < r3) goto L45
            goto Lac
        L57:
            int r0 = r4.zzb
            r0 = r0 & 7
            if (r0 == r2) goto L87
            if (r0 != r1) goto L82
        L5f:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzg()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            boolean r0 = r0.zzC()
            if (r0 != 0) goto Lac
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzm()
            int r1 = r4.zzb
            if (r0 == r1) goto L5f
            r5 = r0
        L7f:
            r4.zzd = r5
            return
        L82:
            com.google.android.gms.internal.mlkit_acceleration.zzec r5 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r5
        L87:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzn()
            zzT(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r1 = r4.zza
            int r1 = r1.zzd()
            int r1 = r1 + r0
        L97:
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzg()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcy r0 = r4.zza
            int r0 = r0.zzd()
            if (r0 < r1) goto L97
        Lac:
            return
    }
}
