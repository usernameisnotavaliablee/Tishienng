package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzcu extends com.google.android.gms.internal.mlkit_acceleration.zzcy {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    /* synthetic */ zzcu(byte[] r1, int r2, int r3, boolean r4, com.google.android.gms.internal.mlkit_acceleration.zzct r5) {
            r0 = this;
            r2 = 0
            r0.<init>(r2)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzj = r2
            r0.zze = r1
            r1 = 0
            r0.zzf = r1
            r0.zzh = r1
            return
    }

    private final void zzI() {
            r2 = this;
            int r0 = r2.zzf
            int r1 = r2.zzg
            int r0 = r0 + r1
            r2.zzf = r0
            int r1 = r2.zzj
            if (r0 <= r1) goto L13
            int r1 = r0 - r1
            r2.zzg = r1
            int r0 = r0 - r1
            r2.zzf = r0
            return
        L13:
            r0 = 0
            r2.zzg = r0
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final void zzA(int r1) {
            r0 = this;
            r0.zzj = r1
            r0.zzI()
            return
    }

    public final void zzB(int r3) throws java.io.IOException {
            r2 = this;
            if (r3 < 0) goto Le
            int r0 = r2.zzf
            int r1 = r2.zzh
            int r0 = r0 - r1
            if (r3 <= r0) goto La
            goto Le
        La:
            int r1 = r1 + r3
            r2.zzh = r1
            return
        Le:
            if (r3 >= 0) goto L15
            com.google.android.gms.internal.mlkit_acceleration.zzed r3 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzf()
            throw r3
        L15:
            com.google.android.gms.internal.mlkit_acceleration.zzed r3 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzj()
            throw r3
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final boolean zzC() throws java.io.IOException {
            r2 = this;
            int r0 = r2.zzh
            int r1 = r2.zzf
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final boolean zzD() throws java.io.IOException {
            r5 = this;
            long r0 = r5.zzr()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final boolean zzE(int r6) throws java.io.IOException {
            r5 = this;
            r0 = r6 & 7
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L3f
            if (r0 == r2) goto L39
            r3 = 2
            if (r0 == r3) goto L31
            r3 = 4
            r4 = 3
            if (r0 == r4) goto L1e
            if (r0 == r3) goto L1d
            r6 = 5
            if (r0 != r6) goto L18
            r5.zzB(r3)
            return r2
        L18:
            com.google.android.gms.internal.mlkit_acceleration.zzec r6 = com.google.android.gms.internal.mlkit_acceleration.zzed.zza()
            throw r6
        L1d:
            return r1
        L1e:
            int r0 = r5.zzm()
            if (r0 == 0) goto L2a
            boolean r0 = r5.zzE(r0)
            if (r0 != 0) goto L1e
        L2a:
            int r6 = r6 >>> r4
            int r6 = r6 << r4
            r6 = r6 | r3
            r5.zzz(r6)
            return r2
        L31:
            int r6 = r5.zzj()
            r5.zzB(r6)
            return r2
        L39:
            r6 = 8
            r5.zzB(r6)
            return r2
        L3f:
            int r6 = r5.zzf
            int r0 = r5.zzh
            int r6 = r6 - r0
            r0 = 10
            if (r6 < r0) goto L5f
        L48:
            if (r1 >= r0) goto L5a
            byte[] r6 = r5.zze
            int r3 = r5.zzh
            int r4 = r3 + 1
            r5.zzh = r4
            r6 = r6[r3]
            if (r6 < 0) goto L57
            goto L6a
        L57:
            int r1 = r1 + 1
            goto L48
        L5a:
            com.google.android.gms.internal.mlkit_acceleration.zzed r6 = com.google.android.gms.internal.mlkit_acceleration.zzed.zze()
            throw r6
        L5f:
            if (r1 >= r0) goto L6b
            byte r6 = r5.zza()
            if (r6 >= 0) goto L6a
            int r1 = r1 + 1
            goto L5f
        L6a:
            return r2
        L6b:
            com.google.android.gms.internal.mlkit_acceleration.zzed r6 = com.google.android.gms.internal.mlkit_acceleration.zzed.zze()
            throw r6
    }

    public final byte zza() throws java.io.IOException {
            r3 = this;
            int r0 = r3.zzh
            int r1 = r3.zzf
            if (r0 == r1) goto Lf
            byte[] r1 = r3.zze
            int r2 = r0 + 1
            r3.zzh = r2
            r0 = r1[r0]
            return r0
        Lf:
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzj()
            throw r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final double zzb() throws java.io.IOException {
            r2 = this;
            long r0 = r2.zzq()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final float zzc() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzi()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final int zzd() {
            r1 = this;
            int r0 = r1.zzh
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final int zze(int r2) throws com.google.android.gms.internal.mlkit_acceleration.zzed {
            r1 = this;
            if (r2 < 0) goto L1b
            int r0 = r1.zzh
            int r2 = r2 + r0
            if (r2 < 0) goto L16
            int r0 = r1.zzj
            if (r2 > r0) goto L11
            r1.zzj = r2
            r1.zzI()
            return r0
        L11:
            com.google.android.gms.internal.mlkit_acceleration.zzed r2 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzj()
            throw r2
        L16:
            com.google.android.gms.internal.mlkit_acceleration.zzed r2 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzg()
            throw r2
        L1b:
            com.google.android.gms.internal.mlkit_acceleration.zzed r2 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzf()
            throw r2
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final int zzf() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzj()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final int zzg() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzi()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final int zzh() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzj()
            return r0
    }

    public final int zzi() throws java.io.IOException {
            r5 = this;
            int r0 = r5.zzh
            int r1 = r5.zzf
            int r1 = r1 - r0
            r2 = 4
            if (r1 < r2) goto L2e
            byte[] r1 = r5.zze
            int r2 = r0 + 4
            r5.zzh = r2
            r2 = r1[r0]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r0 + 1
            r3 = r1[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r0 + 2
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r0 = r0 + 3
            r0 = r1[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 << 8
            r1 = r1 | r2
            int r2 = r4 << 16
            r1 = r1 | r2
            int r0 = r0 << 24
            r0 = r0 | r1
            return r0
        L2e:
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzj()
            throw r0
    }

    public final int zzj() throws java.io.IOException {
            r7 = this;
            int r0 = r7.zzh
            int r1 = r7.zzf
            if (r1 != r0) goto L8
            goto L77
        L8:
            byte[] r2 = r7.zze
            int r3 = r0 + 1
            r4 = r2[r0]
            if (r4 < 0) goto L13
            r7.zzh = r3
            return r4
        L13:
            int r1 = r1 - r3
            r5 = 9
            if (r1 < r5) goto L77
            int r1 = r0 + 2
            r3 = r2[r3]
            int r3 = r3 << 7
            r3 = r3 ^ r4
            if (r3 >= 0) goto L24
            r0 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L74
        L24:
            int r4 = r0 + 3
            r1 = r2[r1]
            int r1 = r1 << 14
            r1 = r1 ^ r3
            if (r1 < 0) goto L31
            r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
        L2f:
            r1 = r4
            goto L74
        L31:
            int r3 = r0 + 4
            r4 = r2[r4]
            int r4 = r4 << 21
            r1 = r1 ^ r4
            if (r1 >= 0) goto L40
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
        L3e:
            r1 = r3
            goto L74
        L40:
            int r4 = r0 + 5
            r3 = r2[r3]
            int r5 = r3 << 28
            r1 = r1 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r1 = r1 ^ r5
            if (r3 >= 0) goto L70
            int r3 = r0 + 6
            r4 = r2[r4]
            if (r4 >= 0) goto L72
            int r4 = r0 + 7
            r3 = r2[r3]
            if (r3 >= 0) goto L70
            int r3 = r0 + 8
            r4 = r2[r4]
            if (r4 >= 0) goto L72
            int r4 = r0 + 9
            r3 = r2[r3]
            if (r3 >= 0) goto L70
            int r0 = r0 + 10
            r2 = r2[r4]
            if (r2 >= 0) goto L6c
            goto L77
        L6c:
            r6 = r1
            r1 = r0
            r0 = r6
            goto L74
        L70:
            r0 = r1
            goto L2f
        L72:
            r0 = r1
            goto L3e
        L74:
            r7.zzh = r1
            return r0
        L77:
            long r0 = r7.zzs()
            int r1 = (int) r0
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final int zzk() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzi()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final int zzl() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzj()
            int r0 = com.google.android.gms.internal.mlkit_acceleration.zzcy.zzF(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final int zzm() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.zzC()
            if (r0 == 0) goto La
            r0 = 0
            r2.zzi = r0
            return r0
        La:
            int r0 = r2.zzj()
            r2.zzi = r0
            int r1 = r0 >>> 3
            if (r1 == 0) goto L15
            return r0
        L15:
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzc()
            throw r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final int zzn() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzj()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final long zzo() throws java.io.IOException {
            r2 = this;
            long r0 = r2.zzq()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final long zzp() throws java.io.IOException {
            r2 = this;
            long r0 = r2.zzr()
            return r0
    }

    public final long zzq() throws java.io.IOException {
            r19 = this;
            r0 = r19
            int r1 = r0.zzh
            int r2 = r0.zzf
            int r2 = r2 - r1
            r3 = 8
            if (r2 < r3) goto L67
            byte[] r2 = r0.zze
            int r4 = r1 + 8
            r0.zzh = r4
            r4 = r2[r1]
            long r4 = (long) r4
            int r6 = r1 + 1
            r6 = r2[r6]
            long r6 = (long) r6
            r8 = 255(0xff, double:1.26E-321)
            long r6 = r6 & r8
            long r4 = r4 & r8
            long r6 = r6 << r3
            int r3 = r1 + 2
            r3 = r2[r3]
            long r10 = (long) r3
            int r3 = r1 + 3
            r3 = r2[r3]
            long r12 = (long) r3
            int r3 = r1 + 4
            r3 = r2[r3]
            long r14 = (long) r3
            int r3 = r1 + 5
            r3 = r2[r3]
            r16 = r8
            long r8 = (long) r3
            int r3 = r1 + 6
            r3 = r2[r3]
            r18 = r1
            long r0 = (long) r3
            int r3 = r18 + 7
            r2 = r2[r3]
            long r2 = (long) r2
            long r10 = r10 & r16
            long r4 = r4 | r6
            long r6 = r12 & r16
            r12 = 16
            long r10 = r10 << r12
            long r4 = r4 | r10
            long r10 = r14 & r16
            r12 = 24
            long r6 = r6 << r12
            long r4 = r4 | r6
            long r6 = r8 & r16
            r8 = 32
            long r8 = r10 << r8
            long r4 = r4 | r8
            long r0 = r0 & r16
            r8 = 40
            long r6 = r6 << r8
            long r4 = r4 | r6
            long r2 = r2 & r16
            r6 = 48
            long r0 = r0 << r6
            long r0 = r0 | r4
            r4 = 56
            long r2 = r2 << r4
            long r0 = r0 | r2
            return r0
        L67:
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzj()
            throw r0
    }

    public final long zzr() throws java.io.IOException {
            r13 = this;
            int r0 = r13.zzh
            int r1 = r13.zzf
            if (r1 != r0) goto L8
            goto Lbf
        L8:
            byte[] r2 = r13.zze
            int r3 = r0 + 1
            r4 = r2[r0]
            if (r4 < 0) goto L14
            r13.zzh = r3
            long r0 = (long) r4
            return r0
        L14:
            int r1 = r1 - r3
            r5 = 9
            if (r1 < r5) goto Lbf
            int r1 = r0 + 2
            r3 = r2[r3]
            int r3 = r3 << 7
            r3 = r3 ^ r4
            if (r3 >= 0) goto L27
            r0 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
            long r2 = (long) r0
            goto Lbc
        L27:
            int r4 = r0 + 3
            r1 = r2[r1]
            int r1 = r1 << 14
            r1 = r1 ^ r3
            if (r1 < 0) goto L36
            r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
            long r2 = (long) r0
        L33:
            r1 = r4
            goto Lbc
        L36:
            int r3 = r0 + 4
            r4 = r2[r4]
            int r4 = r4 << 21
            r1 = r1 ^ r4
            if (r1 >= 0) goto L49
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            long r0 = (long) r0
            r11 = r0
            r1 = r3
            r2 = r11
            goto Lbc
        L49:
            int r4 = r0 + 5
            r3 = r2[r3]
            long r5 = (long) r3
            long r7 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r5 = r5 ^ r7
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L5f
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r2 = r5 ^ r0
            goto L33
        L5f:
            int r1 = r0 + 6
            r3 = r2[r4]
            long r3 = (long) r3
            r9 = 35
            long r3 = r3 << r9
            long r3 = r3 ^ r5
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 >= 0) goto L74
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L71:
            long r3 = r3 ^ r5
        L72:
            r2 = r3
            goto Lbc
        L74:
            int r5 = r0 + 7
            r1 = r2[r1]
            long r9 = (long) r1
            r1 = 42
            long r9 = r9 << r1
            long r3 = r3 ^ r9
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 < 0) goto L8a
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            long r0 = r0 ^ r3
            r2 = r0
        L88:
            r1 = r5
            goto Lbc
        L8a:
            int r1 = r0 + 8
            r5 = r2[r5]
            long r5 = (long) r5
            r9 = 49
            long r5 = r5 << r9
            long r3 = r3 ^ r5
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 >= 0) goto L9d
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L71
        L9d:
            int r5 = r0 + 9
            r1 = r2[r1]
            long r9 = (long) r1
            r1 = 56
            long r9 = r9 << r1
            long r3 = r3 ^ r9
            r9 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r9
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto Lba
            int r1 = r0 + 10
            r0 = r2[r5]
            long r5 = (long) r0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto Lbf
            goto L72
        Lba:
            r2 = r3
            goto L88
        Lbc:
            r13.zzh = r1
            return r2
        Lbf:
            long r0 = r13.zzs()
            return r0
    }

    final long zzs() throws java.io.IOException {
            r6 = this;
            r0 = 0
            r1 = 0
        L3:
            r3 = 64
            if (r0 >= r3) goto L18
            byte r3 = r6.zza()
            r4 = r3 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r4 = r4 << r0
            long r1 = r1 | r4
            r3 = r3 & 128(0x80, float:1.8E-43)
            if (r3 != 0) goto L15
            return r1
        L15:
            int r0 = r0 + 7
            goto L3
        L18:
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = com.google.android.gms.internal.mlkit_acceleration.zzed.zze()
            throw r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final long zzt() throws java.io.IOException {
            r2 = this;
            long r0 = r2.zzq()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final long zzu() throws java.io.IOException {
            r2 = this;
            long r0 = r2.zzr()
            long r0 = com.google.android.gms.internal.mlkit_acceleration.zzcy.zzG(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final long zzv() throws java.io.IOException {
            r2 = this;
            long r0 = r2.zzr()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final com.google.android.gms.internal.mlkit_acceleration.zzcs zzw() throws java.io.IOException {
            r3 = this;
            int r0 = r3.zzj()
            if (r0 <= 0) goto L1a
            int r1 = r3.zzf
            int r2 = r3.zzh
            int r1 = r1 - r2
            if (r0 <= r1) goto Le
            goto L1a
        Le:
            byte[] r1 = r3.zze
            com.google.android.gms.internal.mlkit_acceleration.zzcs r1 = com.google.android.gms.internal.mlkit_acceleration.zzcs.zzl(r1, r2, r0)
            int r2 = r3.zzh
            int r2 = r2 + r0
            r3.zzh = r2
            return r1
        L1a:
            if (r0 == 0) goto L41
            if (r0 <= 0) goto L35
            int r1 = r3.zzf
            int r2 = r3.zzh
            int r1 = r1 - r2
            if (r0 <= r1) goto L26
            goto L35
        L26:
            int r0 = r0 + r2
            r3.zzh = r0
            byte[] r1 = r3.zze
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r2, r0)
            com.google.android.gms.internal.mlkit_acceleration.zzcp r1 = new com.google.android.gms.internal.mlkit_acceleration.zzcp
            r1.<init>(r0)
            return r1
        L35:
            if (r0 > 0) goto L3c
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzf()
            throw r0
        L3c:
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzj()
            throw r0
        L41:
            com.google.android.gms.internal.mlkit_acceleration.zzcs r0 = com.google.android.gms.internal.mlkit_acceleration.zzcs.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final java.lang.String zzx() throws java.io.IOException {
            r5 = this;
            int r0 = r5.zzj()
            if (r0 <= 0) goto L1d
            int r1 = r5.zzf
            int r2 = r5.zzh
            int r1 = r1 - r2
            if (r0 <= r1) goto Le
            goto L1d
        Le:
            byte[] r1 = r5.zze
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.android.gms.internal.mlkit_acceleration.zzeb.zzb
            r3.<init>(r1, r2, r0, r4)
            int r1 = r5.zzh
            int r1 = r1 + r0
            r5.zzh = r1
            return r3
        L1d:
            if (r0 != 0) goto L22
            java.lang.String r0 = ""
            return r0
        L22:
            if (r0 >= 0) goto L29
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzf()
            throw r0
        L29:
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzj()
            throw r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final java.lang.String zzy() throws java.io.IOException {
            r3 = this;
            int r0 = r3.zzj()
            if (r0 <= 0) goto L1a
            int r1 = r3.zzf
            int r2 = r3.zzh
            int r1 = r1 - r2
            if (r0 <= r1) goto Le
            goto L1a
        Le:
            byte[] r1 = r3.zze
            java.lang.String r1 = com.google.android.gms.internal.mlkit_acceleration.zzgs.zzd(r1, r2, r0)
            int r2 = r3.zzh
            int r2 = r2 + r0
            r3.zzh = r2
            return r1
        L1a:
            if (r0 != 0) goto L1f
            java.lang.String r0 = ""
            return r0
        L1f:
            if (r0 > 0) goto L26
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzf()
            throw r0
        L26:
            com.google.android.gms.internal.mlkit_acceleration.zzed r0 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzj()
            throw r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcy
    public final void zzz(int r2) throws com.google.android.gms.internal.mlkit_acceleration.zzed {
            r1 = this;
            int r0 = r1.zzi
            if (r0 != r2) goto L5
            return
        L5:
            com.google.android.gms.internal.mlkit_acceleration.zzed r2 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzb()
            throw r2
    }
}
