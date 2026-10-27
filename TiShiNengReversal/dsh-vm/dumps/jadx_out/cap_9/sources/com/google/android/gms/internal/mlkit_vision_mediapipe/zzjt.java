package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzjt extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    zzjt(byte[] r4, int r5, int r6) {
            r3 = this;
            r5 = 0
            r3.<init>(r5)
            int r5 = r4.length
            int r0 = r5 - r6
            r0 = r0 | r6
            r1 = 0
            if (r0 < 0) goto L12
            r3.zzb = r4
            r3.zzd = r1
            r3.zzc = r6
            return
        L12:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r5 = 1
            r2[r5] = r0
            r5 = 2
            r2[r5] = r6
            java.lang.String r5 = "Array range is invalid. Buffer.length=%d, offset=%d, length=%d"
            java.lang.String r5 = java.lang.String.format(r5, r2)
            r4.<init>(r5)
            throw r4
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw
    public final int zza() {
            r2 = this;
            int r0 = r2.zzc
            int r1 = r2.zzd
            int r0 = r0 - r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw
    public final void zzb(byte r8) throws java.io.IOException {
            r7 = this;
            byte[] r0 = r7.zzb     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            int r1 = r7.zzd     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            int r2 = r1 + 1
            r7.zzd = r2     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            r0[r1] = r8     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            return
        Lb:
            r8 = move-exception
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzju r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzju
            int r1 = r7.zzd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r7.zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r1
            r5[r3] = r2
            r1 = 2
            r5[r1] = r4
            java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r1 = java.lang.String.format(r1, r5)
            r0.<init>(r1, r8)
            throw r0
    }

    public final void zzc(byte[] r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            r6 = 0
            byte[] r0 = r4.zzb     // Catch: java.lang.IndexOutOfBoundsException -> Le
            int r1 = r4.zzd     // Catch: java.lang.IndexOutOfBoundsException -> Le
            java.lang.System.arraycopy(r5, r6, r0, r1, r7)     // Catch: java.lang.IndexOutOfBoundsException -> Le
            int r5 = r4.zzd     // Catch: java.lang.IndexOutOfBoundsException -> Le
            int r5 = r5 + r7
            r4.zzd = r5     // Catch: java.lang.IndexOutOfBoundsException -> Le
            return
        Le:
            r5 = move-exception
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzju r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzju
            int r1 = r4.zzd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r4.zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r6] = r1
            r6 = 1
            r3[r6] = r2
            r6 = 2
            r3[r6] = r7
            java.lang.String r6 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            r0.<init>(r6, r5)
            throw r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw
    public final void zzd(int r1, boolean r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r0.zzt(r1)
            r0.zzb(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw
    public final void zze(int r1, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 2
            r0.zzt(r1)
            int r1 = r2.zzd()
            r0.zzt(r1)
            r2.zzg(r0)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw
    public final void zzf(int r1, int r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 5
            r0.zzt(r1)
            r0.zzg(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw
    public final void zzg(int r8) throws java.io.IOException {
            r7 = this;
            byte[] r0 = r7.zzb     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r1 = r7.zzd     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r2 = r1 + 1
            r7.zzd = r2     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r3 = r8 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r3 = r1 + 2
            r7.zzd = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r4 = r8 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r2] = r4     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r2 = r1 + 3
            r7.zzd = r2     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r4 = r8 >> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r3] = r4     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r1 = r1 + 4
            r7.zzd = r1     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r8 = r8 >> 24
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r2] = r8     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            return
        L2f:
            r8 = move-exception
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzju r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzju
            int r1 = r7.zzd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r7.zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r1
            r5[r3] = r2
            r1 = 2
            r5[r1] = r4
            java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r1 = java.lang.String.format(r1, r5)
            r0.<init>(r1, r8)
            throw r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw
    public final void zzh(int r1, long r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 1
            r0.zzt(r1)
            r0.zzi(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw
    public final void zzi(long r8) throws java.io.IOException {
            r7 = this;
            byte[] r0 = r7.zzb     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r1 = r7.zzd     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r2 = r1 + 1
            r7.zzd = r2     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r3 = (int) r8     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r3 = r1 + 2
            r7.zzd = r3     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r4 = 8
            long r5 = r8 >> r4
            int r6 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = r6 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r2] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r2 = r1 + 3
            r7.zzd = r2     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = 16
            long r5 = r8 >> r5
            int r6 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = r6 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r3] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r3 = r1 + 4
            r7.zzd = r3     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = 24
            long r5 = r8 >> r5
            int r6 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = r6 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r2] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r2 = r1 + 5
            r7.zzd = r2     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = 32
            long r5 = r8 >> r5
            int r6 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = r6 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r3] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r3 = r1 + 6
            r7.zzd = r3     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = 40
            long r5 = r8 >> r5
            int r6 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = r6 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r2] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r2 = r1 + 7
            r7.zzd = r2     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = 48
            long r5 = r8 >> r5
            int r6 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = r6 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r3] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r1 = r1 + r4
            r7.zzd = r1     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r1 = 56
            long r8 = r8 >> r1
            int r9 = (int) r8     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r8 = r9 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r2] = r8     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            return
        L6f:
            r8 = move-exception
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzju r9 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzju
            int r0 = r7.zzd
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r7.zzc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            r4[r2] = r1
            r0 = 2
            r4[r0] = r3
            java.lang.String r0 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            r9.<init>(r0, r8)
            throw r9
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw
    public final void zzj(int r1, int r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r0.zzt(r1)
            r0.zzk(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw
    public final void zzk(int r3) throws java.io.IOException {
            r2 = this;
            if (r3 < 0) goto L6
            r2.zzt(r3)
            return
        L6:
            long r0 = (long) r3
            r2.zzv(r0)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw
    public final void zzl(byte[] r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            r2 = 0
            r0.zzc(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw
    final void zzm(int r1, com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r3) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 2
            r0.zzt(r1)
            r1 = r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zziv r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zziv) r1
            int r1 = r1.zzi(r3)
            r0.zzt(r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjx r1 = r0.zza
            r3.zzi(r2, r1)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw
    public final void zzn(int r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r3) throws java.io.IOException {
            r1 = this;
            r0 = 11
            r1.zzt(r0)
            r0 = 2
            r1.zzs(r0, r2)
            r2 = 26
            r1.zzt(r2)
            int r2 = r3.zzn()
            r1.zzt(r2)
            r3.zzL(r1)
            r2 = 12
            r1.zzt(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw
    public final void zzo(int r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r3) throws java.io.IOException {
            r1 = this;
            r0 = 11
            r1.zzt(r0)
            r0 = 2
            r1.zzs(r0, r2)
            r2 = 3
            r1.zze(r2, r3)
            r2 = 12
            r1.zzt(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw
    public final void zzp(int r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 2
            r0.zzt(r1)
            r0.zzq(r2)
            return
    }

    public final void zzq(java.lang.String r6) throws java.io.IOException {
            r5 = this;
            int r0 = r5.zzd
            int r1 = r6.length()     // Catch: java.lang.IndexOutOfBoundsException -> L2e com.google.android.gms.internal.mlkit_vision_mediapipe.zznf -> L30
            int r1 = r1 * 3
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L2e com.google.android.gms.internal.mlkit_vision_mediapipe.zznf -> L30
            int r2 = r6.length()     // Catch: java.lang.IndexOutOfBoundsException -> L2e com.google.android.gms.internal.mlkit_vision_mediapipe.zznf -> L30
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L2e com.google.android.gms.internal.mlkit_vision_mediapipe.zznf -> L30
            if (r2 != r1) goto L32
            int r1 = r0 + r2
            r5.zzd = r1     // Catch: java.lang.IndexOutOfBoundsException -> L2e com.google.android.gms.internal.mlkit_vision_mediapipe.zznf -> L30
            byte[] r3 = r5.zzb     // Catch: java.lang.IndexOutOfBoundsException -> L2e com.google.android.gms.internal.mlkit_vision_mediapipe.zznf -> L30
            int r4 = r5.zzc     // Catch: java.lang.IndexOutOfBoundsException -> L2e com.google.android.gms.internal.mlkit_vision_mediapipe.zznf -> L30
            int r4 = r4 - r1
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzng.zzb(r6, r3, r1, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L2e com.google.android.gms.internal.mlkit_vision_mediapipe.zznf -> L30
            r5.zzd = r0     // Catch: java.lang.IndexOutOfBoundsException -> L2e com.google.android.gms.internal.mlkit_vision_mediapipe.zznf -> L30
            int r3 = r1 - r0
            int r3 = r3 - r2
            r5.zzt(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L2e com.google.android.gms.internal.mlkit_vision_mediapipe.zznf -> L30
            r5.zzd = r1     // Catch: java.lang.IndexOutOfBoundsException -> L2e com.google.android.gms.internal.mlkit_vision_mediapipe.zznf -> L30
            return
        L2e:
            r6 = move-exception
            goto L47
        L30:
            r1 = move-exception
            goto L4d
        L32:
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzng.zzc(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L2e com.google.android.gms.internal.mlkit_vision_mediapipe.zznf -> L30
            r5.zzt(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L2e com.google.android.gms.internal.mlkit_vision_mediapipe.zznf -> L30
            byte[] r1 = r5.zzb     // Catch: java.lang.IndexOutOfBoundsException -> L2e com.google.android.gms.internal.mlkit_vision_mediapipe.zznf -> L30
            int r2 = r5.zzd     // Catch: java.lang.IndexOutOfBoundsException -> L2e com.google.android.gms.internal.mlkit_vision_mediapipe.zznf -> L30
            int r3 = r5.zzc     // Catch: java.lang.IndexOutOfBoundsException -> L2e com.google.android.gms.internal.mlkit_vision_mediapipe.zznf -> L30
            int r3 = r3 - r2
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzng.zzb(r6, r1, r2, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L2e com.google.android.gms.internal.mlkit_vision_mediapipe.zznf -> L30
            r5.zzd = r1     // Catch: java.lang.IndexOutOfBoundsException -> L2e com.google.android.gms.internal.mlkit_vision_mediapipe.zznf -> L30
            return
        L47:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzju r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzju
            r0.<init>(r6)
            throw r0
        L4d:
            r5.zzd = r0
            r5.zzC(r6, r1)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw
    public final void zzr(int r1, int r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | r2
            r0.zzt(r1)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw
    public final void zzs(int r1, int r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r0.zzt(r1)
            r0.zzt(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw
    public final void zzt(int r8) throws java.io.IOException {
            r7 = this;
        L0:
            r0 = r8 & (-128(0xffffffffffffff80, float:NaN))
            if (r0 != 0) goto L12
            byte[] r0 = r7.zzb     // Catch: java.lang.IndexOutOfBoundsException -> L10
            int r1 = r7.zzd     // Catch: java.lang.IndexOutOfBoundsException -> L10
            int r2 = r1 + 1
            r7.zzd = r2     // Catch: java.lang.IndexOutOfBoundsException -> L10
            byte r8 = (byte) r8     // Catch: java.lang.IndexOutOfBoundsException -> L10
            r0[r1] = r8     // Catch: java.lang.IndexOutOfBoundsException -> L10
            return
        L10:
            r8 = move-exception
            goto L24
        L12:
            byte[] r0 = r7.zzb     // Catch: java.lang.IndexOutOfBoundsException -> L10
            int r1 = r7.zzd     // Catch: java.lang.IndexOutOfBoundsException -> L10
            int r2 = r1 + 1
            r7.zzd = r2     // Catch: java.lang.IndexOutOfBoundsException -> L10
            r2 = r8 | 128(0x80, float:1.8E-43)
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2     // Catch: java.lang.IndexOutOfBoundsException -> L10
            r0[r1] = r2     // Catch: java.lang.IndexOutOfBoundsException -> L10
            int r8 = r8 >>> 7
            goto L0
        L24:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzju r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzju
            int r1 = r7.zzd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r7.zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r1
            r5[r3] = r2
            r1 = 2
            r5[r1] = r4
            java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r1 = java.lang.String.format(r1, r5)
            r0.<init>(r1, r8)
            throw r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw
    public final void zzu(int r1, long r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r0.zzt(r1)
            r0.zzv(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw
    public final void zzv(long r10) throws java.io.IOException {
            r9 = this;
            boolean r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzD()
            r1 = 7
            r2 = 0
            r4 = -128(0xffffffffffffff80, double:NaN)
            if (r0 == 0) goto L3c
            int r0 = r9.zzc
            int r6 = r9.zzd
            int r0 = r0 - r6
            r6 = 10
            if (r0 < r6) goto L3c
        L14:
            long r6 = r10 & r4
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            int r6 = (int) r10
            if (r0 != 0) goto L29
            byte[] r10 = r9.zzb
            int r11 = r9.zzd
            int r0 = r11 + 1
            r9.zzd = r0
            long r0 = (long) r11
            byte r11 = (byte) r6
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzn(r10, r0, r11)
            return
        L29:
            byte[] r0 = r9.zzb
            int r7 = r9.zzd
            int r8 = r7 + 1
            r9.zzd = r8
            long r7 = (long) r7
            r6 = r6 | 128(0x80, float:1.8E-43)
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzn(r0, r7, r6)
            long r10 = r10 >>> r1
            goto L14
        L3c:
            long r6 = r10 & r4
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L51
            byte[] r0 = r9.zzb     // Catch: java.lang.IndexOutOfBoundsException -> L4f
            int r1 = r9.zzd     // Catch: java.lang.IndexOutOfBoundsException -> L4f
            int r2 = r1 + 1
            r9.zzd = r2     // Catch: java.lang.IndexOutOfBoundsException -> L4f
            int r11 = (int) r10     // Catch: java.lang.IndexOutOfBoundsException -> L4f
            byte r10 = (byte) r11     // Catch: java.lang.IndexOutOfBoundsException -> L4f
            r0[r1] = r10     // Catch: java.lang.IndexOutOfBoundsException -> L4f
            return
        L4f:
            r10 = move-exception
            goto L63
        L51:
            byte[] r0 = r9.zzb     // Catch: java.lang.IndexOutOfBoundsException -> L4f
            int r6 = r9.zzd     // Catch: java.lang.IndexOutOfBoundsException -> L4f
            int r7 = r6 + 1
            r9.zzd = r7     // Catch: java.lang.IndexOutOfBoundsException -> L4f
            int r7 = (int) r10     // Catch: java.lang.IndexOutOfBoundsException -> L4f
            r7 = r7 | 128(0x80, float:1.8E-43)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7     // Catch: java.lang.IndexOutOfBoundsException -> L4f
            r0[r6] = r7     // Catch: java.lang.IndexOutOfBoundsException -> L4f
            long r10 = r10 >>> r1
            goto L3c
        L63:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzju r11 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzju
            int r0 = r9.zzd
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r9.zzc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            r4[r2] = r1
            r0 = 2
            r4[r0] = r3
            java.lang.String r0 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            r11.<init>(r0, r10)
            throw r11
    }
}
