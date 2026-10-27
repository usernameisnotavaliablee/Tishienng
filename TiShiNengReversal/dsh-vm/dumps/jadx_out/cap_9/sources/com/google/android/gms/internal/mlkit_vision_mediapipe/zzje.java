package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzje {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static {
            return
    }

    public zzje() {
            r1 = this;
            r1.<init>()
            return
    }

    static int zza(byte[] r2, int r3, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjd r4) throws com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb {
            int r3 = zzh(r2, r3, r4)
            int r0 = r4.zza
            if (r0 < 0) goto L23
            int r1 = r2.length
            int r1 = r1 - r3
            if (r0 > r1) goto L1b
            if (r0 != 0) goto L13
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo.zzb
            r4.zzc = r2
            return r3
        L13:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo.zzj(r2, r3, r0)
            r4.zzc = r2
            int r3 = r3 + r0
            return r3
        L1b:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r2 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            java.lang.String r3 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r2.<init>(r3)
            throw r2
        L23:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r2 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            java.lang.String r3 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r2.<init>(r3)
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

    static int zzc(com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r7, byte[] r8, int r9, int r10, int r11, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjd r12) throws java.io.IOException {
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

    static int zzd(com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjd r10) throws java.io.IOException {
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

    static int zze(com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r2, int r3, byte[] r4, int r5, int r6, com.google.android.gms.internal.mlkit_vision_mediapipe.zzky r7, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjd r8) throws java.io.IOException {
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

    static int zzf(byte[] r2, int r3, com.google.android.gms.internal.mlkit_vision_mediapipe.zzky r4, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjd r5) throws java.io.IOException {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzks r4 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzks) r4
            int r3 = zzh(r2, r3, r5)
            int r0 = r5.zza
            int r0 = r0 + r3
        L9:
            if (r3 >= r0) goto L15
            int r3 = zzh(r2, r3, r5)
            int r1 = r5.zza
            r4.zzg(r1)
            goto L9
        L15:
            if (r3 != r0) goto L18
            return r3
        L18:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r2 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            java.lang.String r3 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r2.<init>(r3)
            throw r2
    }

    static int zzg(int r9, byte[] r10, int r11, int r12, com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r13, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjd r14) throws com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb {
            int r0 = r9 >>> 3
            java.lang.String r1 = "Protocol message contained an invalid tag (zero)."
            if (r0 == 0) goto Lb7
            r0 = r9 & 7
            if (r0 == 0) goto La7
            r2 = 1
            if (r0 == r2) goto L98
            r3 = 2
            if (r0 == r3) goto L69
            r3 = 3
            if (r0 == r3) goto L2a
            r12 = 5
            if (r0 != r12) goto L24
            int r10 = zzb(r10, r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13.zzj(r9, r10)
            int r11 = r11 + 4
            return r11
        L24:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r9 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r9.<init>(r1)
            throw r9
        L2a:
            r0 = r9 & (-8)
            r0 = r0 | 4
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx.zzf()
            int r1 = r14.zze
            int r1 = r1 + r2
            r14.zze = r1
            zzp(r1)
            r1 = 0
        L3b:
            if (r11 >= r12) goto L47
            int r5 = zzh(r10, r11, r14)
            int r3 = r14.zza
            if (r3 != r0) goto L4a
            r1 = r3
            r11 = r5
        L47:
            r6 = r12
            r8 = r14
            goto L53
        L4a:
            r4 = r10
            r6 = r12
            r8 = r14
            int r11 = zzg(r3, r4, r5, r6, r7, r8)
            r1 = r3
            goto L3b
        L53:
            int r10 = r8.zze
            int r10 = r10 + (-1)
            r8.zze = r10
            if (r11 > r6) goto L61
            if (r1 != r0) goto L61
            r13.zzj(r9, r7)
            return r11
        L61:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r9 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            java.lang.String r10 = "Failed to parse the message."
            r9.<init>(r10)
            throw r9
        L69:
            r4 = r10
            r8 = r14
            int r10 = zzh(r4, r11, r8)
            int r11 = r8.zza
            if (r11 < 0) goto L90
            int r12 = r4.length
            int r12 = r12 - r10
            if (r11 > r12) goto L88
            if (r11 != 0) goto L7f
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r12 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo.zzb
            r13.zzj(r9, r12)
            goto L86
        L7f:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r12 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo.zzj(r4, r10, r11)
            r13.zzj(r9, r12)
        L86:
            int r10 = r10 + r11
            return r10
        L88:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r9 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            java.lang.String r10 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r9.<init>(r10)
            throw r9
        L90:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r9 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            java.lang.String r10 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r9.<init>(r10)
            throw r9
        L98:
            r4 = r10
            long r0 = zzo(r4, r11)
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            r13.zzj(r9, r10)
            int r11 = r11 + 8
            return r11
        La7:
            r4 = r10
            r8 = r14
            int r10 = zzk(r4, r11, r8)
            long r11 = r8.zzb
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.zzj(r9, r11)
            return r10
        Lb7:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r9 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r9.<init>(r1)
            throw r9
    }

    static int zzh(byte[] r1, int r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjd r3) {
            int r0 = r2 + 1
            r2 = r1[r2]
            if (r2 < 0) goto L9
            r3.zza = r2
            return r0
        L9:
            int r1 = zzi(r2, r1, r0, r3)
            return r1
    }

    static int zzi(int r2, byte[] r3, int r4, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjd r5) {
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

    static int zzj(int r2, byte[] r3, int r4, int r5, com.google.android.gms.internal.mlkit_vision_mediapipe.zzky r6, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjd r7) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzks r6 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzks) r6
            int r4 = zzh(r3, r4, r7)
            int r0 = r7.zza
            r6.zzg(r0)
        Lb:
            if (r4 >= r5) goto L20
            int r0 = zzh(r3, r4, r7)
            int r1 = r7.zza
            if (r2 == r1) goto L16
            goto L20
        L16:
            int r4 = zzh(r3, r0, r7)
            int r0 = r7.zza
            r6.zzg(r0)
            goto Lb
        L20:
            return r4
    }

    static int zzk(byte[] r9, int r10, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjd r11) {
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

    static int zzl(java.lang.Object r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r3, byte[] r4, int r5, int r6, int r7, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjd r8) throws java.io.IOException {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz r3 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz) r3
            int r0 = r8.zze
            int r0 = r0 + 1
            r8.zze = r0
            zzp(r0)
            r1 = r3
            r3 = r2
            r2 = r1
            int r2 = r2.zzc(r3, r4, r5, r6, r7, r8)
            int r4 = r8.zze
            int r4 = r4 + (-1)
            r8.zze = r4
            r8.zzc = r3
            return r2
    }

    static int zzm(java.lang.Object r6, com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjd r11) throws java.io.IOException {
            int r0 = r9 + 1
            r9 = r8[r9]
            if (r9 >= 0) goto Lc
            int r0 = zzi(r9, r8, r0, r11)
            int r9 = r11.zza
        Lc:
            r3 = r0
            if (r9 < 0) goto L2d
            int r10 = r10 - r3
            if (r9 > r10) goto L2d
            int r10 = r11.zze
            int r10 = r10 + 1
            r11.zze = r10
            zzp(r10)
            int r4 = r3 + r9
            r1 = r6
            r0 = r7
            r2 = r8
            r5 = r11
            r0.zzh(r1, r2, r3, r4, r5)
            int r6 = r5.zze
            int r6 = r6 + (-1)
            r5.zze = r6
            r5.zzc = r1
            return r4
        L2d:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r6 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            java.lang.String r7 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r6.<init>(r7)
            throw r6
    }

    static int zzn(int r3, byte[] r4, int r5, int r6, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjd r7) throws com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb {
            int r0 = r3 >>> 3
            java.lang.String r1 = "Protocol message contained an invalid tag (zero)."
            if (r0 == 0) goto L50
            r0 = r3 & 7
            if (r0 == 0) goto L4b
            r2 = 1
            if (r0 == r2) goto L48
            r2 = 2
            if (r0 == r2) goto L40
            r2 = 3
            if (r0 == r2) goto L1f
            r3 = 5
            if (r0 != r3) goto L19
            int r5 = r5 + 4
            return r5
        L19:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r3 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r3.<init>(r1)
            throw r3
        L1f:
            r3 = r3 & (-8)
            r3 = r3 | 4
            r0 = 0
        L24:
            if (r5 >= r6) goto L33
            int r5 = zzh(r4, r5, r7)
            int r0 = r7.zza
            if (r0 == r3) goto L33
            int r5 = zzn(r0, r4, r5, r6, r7)
            goto L24
        L33:
            if (r5 > r6) goto L38
            if (r0 != r3) goto L38
            return r5
        L38:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r3 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            java.lang.String r4 = "Failed to parse the message."
            r3.<init>(r4)
            throw r3
        L40:
            int r3 = zzh(r4, r5, r7)
            int r4 = r7.zza
            int r3 = r3 + r4
            return r3
        L48:
            int r5 = r5 + 8
            return r5
        L4b:
            int r3 = zzk(r4, r5, r7)
            return r3
        L50:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r3 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r3.<init>(r1)
            throw r3
    }

    static long zzo(byte[] r18, int r19) {
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

    private static void zzp(int r1) throws com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb {
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzb
            if (r1 >= r0) goto L5
            return
        L5:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            java.lang.String r0 = "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."
            r1.<init>(r0)
            throw r1
    }
}
