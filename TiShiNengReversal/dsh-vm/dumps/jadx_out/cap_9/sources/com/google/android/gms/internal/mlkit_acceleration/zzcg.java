package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzcg {
    public zzcg() {
            r1 = this;
            r1.<init>()
            return
    }

    static int zza(byte[] r2, int r3, com.google.android.gms.internal.mlkit_acceleration.zzcf r4) throws com.google.android.gms.internal.mlkit_acceleration.zzed {
            int r3 = zzh(r2, r3, r4)
            int r0 = r4.zza
            if (r0 < 0) goto L20
            int r1 = r2.length
            int r1 = r1 - r3
            if (r0 > r1) goto L1b
            if (r0 != 0) goto L13
            com.google.android.gms.internal.mlkit_acceleration.zzcs r2 = com.google.android.gms.internal.mlkit_acceleration.zzcs.zzb
            r4.zzc = r2
            return r3
        L13:
            com.google.android.gms.internal.mlkit_acceleration.zzcs r2 = com.google.android.gms.internal.mlkit_acceleration.zzcs.zzl(r2, r3, r0)
            r4.zzc = r2
            int r3 = r3 + r0
            return r3
        L1b:
            com.google.android.gms.internal.mlkit_acceleration.zzed r2 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzj()
            throw r2
        L20:
            com.google.android.gms.internal.mlkit_acceleration.zzed r2 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzf()
            throw r2
    }

    static int zzb(byte[] r3, int r4) {
            r0 = r3[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r4 + 1
            r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r4 + 2
            r2 = r3[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r4 = r4 + 3
            r3 = r3[r4]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r1 << 8
            r4 = r4 | r0
            int r0 = r2 << 16
            r4 = r4 | r0
            int r3 = r3 << 24
            r3 = r3 | r4
            return r3
    }

    static int zzc(com.google.android.gms.internal.mlkit_acceleration.zzfm r7, byte[] r8, int r9, int r10, int r11, com.google.android.gms.internal.mlkit_acceleration.zzcf r12) throws java.io.IOException {
            java.lang.Object r0 = r7.zze()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            int r7 = zzl(r0, r1, r2, r3, r4, r5, r6)
            r1.zzf(r0)
            r6.zzc = r0
            return r7
    }

    static int zzd(com.google.android.gms.internal.mlkit_acceleration.zzfm r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.mlkit_acceleration.zzcf r10) throws java.io.IOException {
            java.lang.Object r0 = r6.zze()
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            int r6 = zzm(r0, r1, r2, r3, r4, r5)
            r1.zzf(r0)
            r5.zzc = r0
            return r6
    }

    static int zze(com.google.android.gms.internal.mlkit_acceleration.zzfm r2, int r3, byte[] r4, int r5, int r6, com.google.android.gms.internal.mlkit_acceleration.zzea r7, com.google.android.gms.internal.mlkit_acceleration.zzcf r8) throws java.io.IOException {
            int r5 = zzd(r2, r4, r5, r6, r8)
            java.lang.Object r0 = r8.zzc
            r7.add(r0)
        L9:
            if (r5 >= r6) goto L1e
            int r0 = zzh(r4, r5, r8)
            int r1 = r8.zza
            if (r3 == r1) goto L14
            goto L1e
        L14:
            int r5 = zzd(r2, r4, r0, r6, r8)
            java.lang.Object r0 = r8.zzc
            r7.add(r0)
            goto L9
        L1e:
            return r5
    }

    static int zzf(byte[] r2, int r3, com.google.android.gms.internal.mlkit_acceleration.zzea r4, com.google.android.gms.internal.mlkit_acceleration.zzcf r5) throws java.io.IOException {
            com.google.android.gms.internal.mlkit_acceleration.zzdw r4 = (com.google.android.gms.internal.mlkit_acceleration.zzdw) r4
            int r3 = zzh(r2, r3, r5)
            int r0 = r5.zza
            int r0 = r0 + r3
        L9:
            if (r3 >= r0) goto L15
            int r3 = zzh(r2, r3, r5)
            int r1 = r5.zza
            r4.zzf(r1)
            goto L9
        L15:
            if (r3 != r0) goto L18
            return r3
        L18:
            com.google.android.gms.internal.mlkit_acceleration.zzed r2 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzj()
            throw r2
    }

    static int zzg(int r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.mlkit_acceleration.zzge r11, com.google.android.gms.internal.mlkit_acceleration.zzcf r12) throws com.google.android.gms.internal.mlkit_acceleration.zzed {
            int r0 = r7 >>> 3
            if (r0 == 0) goto L99
            r0 = r7 & 7
            if (r0 == 0) goto L89
            r1 = 1
            if (r0 == r1) goto L7a
            r1 = 2
            if (r0 == r1) goto L51
            r1 = 3
            if (r0 == r1) goto L27
            r10 = 5
            if (r0 != r10) goto L22
            int r8 = zzb(r8, r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11.zzj(r7, r8)
            int r9 = r9 + 4
            return r9
        L22:
            com.google.android.gms.internal.mlkit_acceleration.zzed r7 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzc()
            throw r7
        L27:
            r0 = r7 & (-8)
            r0 = r0 | 4
            com.google.android.gms.internal.mlkit_acceleration.zzge r5 = com.google.android.gms.internal.mlkit_acceleration.zzge.zzf()
            r1 = 0
        L30:
            if (r9 >= r10) goto L43
            int r3 = zzh(r8, r9, r12)
            int r1 = r12.zza
            if (r1 == r0) goto L42
            r2 = r8
            r4 = r10
            r6 = r12
            int r9 = zzg(r1, r2, r3, r4, r5, r6)
            goto L30
        L42:
            r9 = r3
        L43:
            r4 = r10
            if (r9 > r4) goto L4c
            if (r1 != r0) goto L4c
            r11.zzj(r7, r5)
            return r9
        L4c:
            com.google.android.gms.internal.mlkit_acceleration.zzed r7 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzg()
            throw r7
        L51:
            r2 = r8
            r6 = r12
            int r8 = zzh(r2, r9, r6)
            int r9 = r6.zza
            if (r9 < 0) goto L75
            int r10 = r2.length
            int r10 = r10 - r8
            if (r9 > r10) goto L70
            if (r9 != 0) goto L67
            com.google.android.gms.internal.mlkit_acceleration.zzcs r10 = com.google.android.gms.internal.mlkit_acceleration.zzcs.zzb
            r11.zzj(r7, r10)
            goto L6e
        L67:
            com.google.android.gms.internal.mlkit_acceleration.zzcs r10 = com.google.android.gms.internal.mlkit_acceleration.zzcs.zzl(r2, r8, r9)
            r11.zzj(r7, r10)
        L6e:
            int r8 = r8 + r9
            return r8
        L70:
            com.google.android.gms.internal.mlkit_acceleration.zzed r7 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzj()
            throw r7
        L75:
            com.google.android.gms.internal.mlkit_acceleration.zzed r7 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzf()
            throw r7
        L7a:
            r2 = r8
            long r0 = zzn(r2, r9)
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            r11.zzj(r7, r8)
            int r9 = r9 + 8
            return r9
        L89:
            r2 = r8
            r6 = r12
            int r8 = zzk(r2, r9, r6)
            long r9 = r6.zzb
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r11.zzj(r7, r9)
            return r8
        L99:
            com.google.android.gms.internal.mlkit_acceleration.zzed r7 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzc()
            throw r7
    }

    static int zzh(byte[] r1, int r2, com.google.android.gms.internal.mlkit_acceleration.zzcf r3) {
            int r0 = r2 + 1
            r2 = r1[r2]
            if (r2 < 0) goto L9
            r3.zza = r2
            return r0
        L9:
            int r1 = zzi(r2, r1, r0, r3)
            return r1
    }

    static int zzi(int r2, byte[] r3, int r4, com.google.android.gms.internal.mlkit_acceleration.zzcf r5) {
            r0 = r3[r4]
            int r1 = r4 + 1
            r2 = r2 & 127(0x7f, float:1.78E-43)
            if (r0 < 0) goto Le
            int r3 = r0 << 7
            r2 = r2 | r3
            r5.zza = r2
            return r1
        Le:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 7
            r2 = r2 | r0
            int r0 = r4 + 2
            r1 = r3[r1]
            if (r1 < 0) goto L1f
            int r3 = r1 << 14
            r2 = r2 | r3
            r5.zza = r2
            return r0
        L1f:
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r1 = r1 << 14
            r2 = r2 | r1
            int r1 = r4 + 3
            r0 = r3[r0]
            if (r0 < 0) goto L30
            int r3 = r0 << 21
            r2 = r2 | r3
            r5.zza = r2
            return r1
        L30:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 21
            r2 = r2 | r0
            int r4 = r4 + 4
            r0 = r3[r1]
            if (r0 < 0) goto L41
            int r3 = r0 << 28
            r2 = r2 | r3
            r5.zza = r2
            return r4
        L41:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 28
            r2 = r2 | r0
        L46:
            int r0 = r4 + 1
            r4 = r3[r4]
            if (r4 >= 0) goto L4e
            r4 = r0
            goto L46
        L4e:
            r5.zza = r2
            return r0
    }

    static int zzj(int r2, byte[] r3, int r4, int r5, com.google.android.gms.internal.mlkit_acceleration.zzea r6, com.google.android.gms.internal.mlkit_acceleration.zzcf r7) {
            com.google.android.gms.internal.mlkit_acceleration.zzdw r6 = (com.google.android.gms.internal.mlkit_acceleration.zzdw) r6
            int r4 = zzh(r3, r4, r7)
            int r0 = r7.zza
            r6.zzf(r0)
        Lb:
            if (r4 >= r5) goto L20
            int r0 = zzh(r3, r4, r7)
            int r1 = r7.zza
            if (r2 == r1) goto L16
            goto L20
        L16:
            int r4 = zzh(r3, r0, r7)
            int r0 = r7.zza
            r6.zzf(r0)
            goto Lb
        L20:
            return r4
    }

    static int zzk(byte[] r9, int r10, com.google.android.gms.internal.mlkit_acceleration.zzcf r11) {
            r0 = r9[r10]
            long r0 = (long) r0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            int r2 = r10 + 1
            if (r4 < 0) goto Le
            r11.zzb = r0
            return r2
        Le:
            int r10 = r10 + 2
            r2 = r9[r2]
            r3 = r2 & 127(0x7f, float:1.78E-43)
            r4 = 127(0x7f, double:6.27E-322)
            long r0 = r0 & r4
            long r3 = (long) r3
            r5 = 7
            long r3 = r3 << r5
            long r0 = r0 | r3
            r3 = 7
        L1c:
            if (r2 >= 0) goto L2c
            int r2 = r10 + 1
            r10 = r9[r10]
            int r3 = r3 + r5
            r4 = r10 & 127(0x7f, float:1.78E-43)
            long r6 = (long) r4
            long r6 = r6 << r3
            long r0 = r0 | r6
            r8 = r2
            r2 = r10
            r10 = r8
            goto L1c
        L2c:
            r11.zzb = r0
            return r10
    }

    static int zzl(java.lang.Object r1, com.google.android.gms.internal.mlkit_acceleration.zzfm r2, byte[] r3, int r4, int r5, int r6, com.google.android.gms.internal.mlkit_acceleration.zzcf r7) throws java.io.IOException {
            com.google.android.gms.internal.mlkit_acceleration.zzfd r2 = (com.google.android.gms.internal.mlkit_acceleration.zzfd) r2
            r0 = r2
            r2 = r1
            r1 = r0
            int r1 = r1.zzc(r2, r3, r4, r5, r6, r7)
            r7.zzc = r2
            return r1
    }

    static int zzm(java.lang.Object r6, com.google.android.gms.internal.mlkit_acceleration.zzfm r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.mlkit_acceleration.zzcf r11) throws java.io.IOException {
            int r0 = r9 + 1
            r9 = r8[r9]
            if (r9 >= 0) goto Lc
            int r0 = zzi(r9, r8, r0, r11)
            int r9 = r11.zza
        Lc:
            r3 = r0
            if (r9 < 0) goto L1e
            int r10 = r10 - r3
            if (r9 > r10) goto L1e
            int r4 = r3 + r9
            r1 = r6
            r0 = r7
            r2 = r8
            r5 = r11
            r0.zzi(r1, r2, r3, r4, r5)
            r5.zzc = r1
            return r4
        L1e:
            com.google.android.gms.internal.mlkit_acceleration.zzed r6 = com.google.android.gms.internal.mlkit_acceleration.zzed.zzj()
            throw r6
    }

    static long zzn(byte[] r18, int r19) {
            r0 = r18[r19]
            long r0 = (long) r0
            int r2 = r19 + 1
            r2 = r18[r2]
            long r2 = (long) r2
            int r4 = r19 + 2
            r4 = r18[r4]
            long r4 = (long) r4
            int r6 = r19 + 3
            r6 = r18[r6]
            long r6 = (long) r6
            int r8 = r19 + 4
            r8 = r18[r8]
            long r8 = (long) r8
            int r10 = r19 + 5
            r10 = r18[r10]
            long r10 = (long) r10
            int r12 = r19 + 6
            r12 = r18[r12]
            long r12 = (long) r12
            int r14 = r19 + 7
            r14 = r18[r14]
            long r14 = (long) r14
            r16 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r16
            long r4 = r4 & r16
            long r6 = r6 & r16
            long r8 = r8 & r16
            long r10 = r10 & r16
            long r12 = r12 & r16
            long r14 = r14 & r16
            long r0 = r0 & r16
            r16 = 8
            long r2 = r2 << r16
            long r0 = r0 | r2
            r2 = 16
            long r2 = r4 << r2
            long r0 = r0 | r2
            r2 = 24
            long r2 = r6 << r2
            long r0 = r0 | r2
            r2 = 32
            long r2 = r8 << r2
            long r0 = r0 | r2
            r2 = 40
            long r2 = r10 << r2
            long r0 = r0 | r2
            r2 = 48
            long r2 = r12 << r2
            long r0 = r0 | r2
            r2 = 56
            long r2 = r14 << r2
            long r0 = r0 | r2
            return r0
    }
}
