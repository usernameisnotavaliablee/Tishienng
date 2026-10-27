package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzay {
    private static final long zza = 0;
    private static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzay zzb = null;
    private final int zzc;
    private final int zzd;
    private final int zze;

    static {
            r0 = 0
            r1 = 0
            r3 = 0
        L4:
            r4 = 7
            if (r3 >= r4) goto L1f
            java.lang.String r4 = " #(+,-0"
            char r4 = r4.charAt(r3)
            int r4 = r4 + (-32)
            long r5 = (long) r3
            long r7 = (long) r4
            r9 = 3
            long r7 = r7 * r9
            r9 = 1
            long r5 = r5 + r9
            int r4 = (int) r7
            long r4 = r5 << r4
            long r1 = r1 | r4
            int r3 = r3 + 1
            goto L4
        L1f:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzay.zza = r1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzay
            r2 = -1
            r1.<init>(r0, r2, r2)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzay.zzb = r1
            return
    }

    private zzay(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzd = r2
            r0.zze = r3
            return
    }

    static int zzd(java.lang.String r3, boolean r4) {
            r0 = 0
            r1 = 1
            if (r1 == r4) goto L6
            r4 = 0
            goto L8
        L6:
            r4 = 128(0x80, float:1.8E-43)
        L8:
            int r2 = r3.length()
            if (r0 >= r2) goto L2a
            char r2 = r3.charAt(r0)
            int r2 = zzm(r2)
            if (r2 < 0) goto L1e
            int r2 = r1 << r2
            r4 = r4 | r2
            int r0 = r0 + 1
            goto L8
        L1e:
            java.lang.String r4 = "invalid flags: "
            java.lang.String r3 = r4.concat(r3)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r3)
            throw r4
        L2a:
            return r4
    }

    public static com.google.android.gms.internal.mlkit_vision_mediapipe.zzay zzf() {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzay.zzb
            return r0
    }

    public static com.google.android.gms.internal.mlkit_vision_mediapipe.zzay zzg(java.lang.String r7, int r8, int r9, boolean r10) throws com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv {
            if (r8 != r9) goto L8
            if (r10 == 0) goto L5
            goto L8
        L5:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzay.zzb
            return r7
        L8:
            r0 = 1
            if (r0 == r10) goto Ld
            r10 = 0
            goto Lf
        Ld:
            r10 = 128(0x80, float:1.8E-43)
        Lf:
            r1 = -1
            if (r8 != r9) goto L18
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r7 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzay
            r7.<init>(r10, r1, r1)
            return r7
        L18:
            int r2 = r8 + 1
            char r3 = r7.charAt(r8)
            r4 = 32
            java.lang.String r5 = "invalid flag"
            r6 = 46
            if (r3 < r4) goto L52
            r4 = 48
            if (r3 <= r4) goto L2b
            goto L52
        L2b:
            int r4 = zzm(r3)
            if (r4 >= 0) goto L42
            if (r3 != r6) goto L3d
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r8 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzay
            int r7 = zzn(r7, r2, r9)
            r8.<init>(r10, r1, r7)
            return r8
        L3d:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zza(r5, r7, r8)
            throw r7
        L42:
            int r1 = r0 << r4
            r3 = r10 & r1
            if (r3 != 0) goto L4b
            r10 = r10 | r1
            r8 = r2
            goto Lf
        L4b:
            java.lang.String r9 = "repeated flag"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zza(r9, r7, r8)
            throw r7
        L52:
            r0 = 57
            if (r3 > r0) goto L91
            int r3 = r3 + (-48)
        L58:
            if (r2 != r9) goto L60
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r7 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzay
            r7.<init>(r10, r3, r1)
            return r7
        L60:
            int r0 = r2 + 1
            char r4 = r7.charAt(r2)
            if (r4 != r6) goto L72
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r8 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzay
            int r7 = zzn(r7, r0, r9)
            r8.<init>(r10, r3, r7)
            return r8
        L72:
            int r4 = r4 + (-48)
            char r4 = (char) r4
            r5 = 10
            if (r4 >= r5) goto L8a
            int r3 = r3 * 10
            int r3 = r3 + r4
            r2 = 999999(0xf423f, float:1.401297E-39)
            if (r3 > r2) goto L83
            r2 = r0
            goto L58
        L83:
            java.lang.String r10 = "width too large"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zzc(r10, r7, r8, r9)
            throw r7
        L8a:
            java.lang.String r8 = "invalid width character"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zza(r8, r7, r2)
            throw r7
        L91:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zza(r5, r7, r8)
            throw r7
    }

    private static int zzm(char r4) {
            int r4 = r4 + (-32)
            long r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzay.zza
            int r4 = r4 * 3
            long r0 = r0 >>> r4
            r2 = 7
            long r0 = r0 & r2
            int r4 = (int) r0
            int r4 = r4 + (-1)
            return r4
    }

    private static int zzn(java.lang.String r5, int r6, int r7) throws com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv {
            if (r6 == r7) goto L3a
            r0 = 0
            r1 = r6
            r2 = 0
        L5:
            if (r1 >= r7) goto L2b
            char r3 = r5.charAt(r1)
            int r3 = r3 + (-48)
            char r3 = (char) r3
            r4 = 10
            if (r3 >= r4) goto L24
            int r2 = r2 * 10
            int r2 = r2 + r3
            r3 = 999999(0xf423f, float:1.401297E-39)
            if (r2 > r3) goto L1d
            int r1 = r1 + 1
            goto L5
        L1d:
            java.lang.String r0 = "precision too large"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zzc(r0, r5, r6, r7)
            throw r5
        L24:
            java.lang.String r6 = "invalid precision character"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zza(r6, r5, r1)
            throw r5
        L2b:
            if (r2 != 0) goto L39
            int r1 = r6 + 1
            if (r7 != r1) goto L32
            return r0
        L32:
            java.lang.String r0 = "invalid precision"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zzc(r0, r5, r6, r7)
            throw r5
        L39:
            return r2
        L3a:
            int r6 = r6 + (-1)
            java.lang.String r7 = "missing precision"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zza(r7, r5, r6)
            throw r5
    }

    public final boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzay
            r2 = 0
            if (r1 == 0) goto L1e
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzay) r5
            int r1 = r5.zzc
            int r3 = r4.zzc
            if (r1 != r3) goto L1e
            int r1 = r5.zzd
            int r3 = r4.zzd
            if (r1 != r3) goto L1e
            int r5 = r5.zze
            int r1 = r4.zze
            if (r5 != r1) goto L1e
            return r0
        L1e:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.zzc
            int r0 = r0 * 31
            int r1 = r2.zzd
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.zze
            int r0 = r0 + r1
            return r0
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    public final int zzb() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    public final int zzc() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzay zze(int r1, boolean r2, boolean r3) {
            r0 = this;
            boolean r1 = r0.zzj()
            if (r1 == 0) goto L7
            goto L19
        L7:
            int r1 = r0.zzc
            r2 = r1 & 128(0x80, float:1.8E-43)
            if (r2 == 0) goto L20
            r3 = -1
            if (r2 != r1) goto L1a
            int r1 = r0.zzd
            if (r1 != r3) goto L1a
            int r1 = r0.zze
            if (r1 == r3) goto L19
            goto L1a
        L19:
            return r0
        L1a:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzay
            r1.<init>(r2, r3, r3)
            return r1
        L20:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzay.zzb
            return r1
    }

    public final java.lang.StringBuilder zzh(java.lang.StringBuilder r5) {
            r4 = this;
            boolean r0 = r4.zzj()
            if (r0 != 0) goto L34
            int r0 = r4.zzc
            r1 = 0
        L9:
            r2 = r0 & (-129(0xffffffffffffff7f, float:NaN))
            r3 = 1
            int r3 = r3 << r1
            if (r3 > r2) goto L1e
            r2 = r2 & r3
            if (r2 == 0) goto L1b
            java.lang.String r2 = " #(+,-0"
            char r2 = r2.charAt(r1)
            r5.append(r2)
        L1b:
            int r1 = r1 + 1
            goto L9
        L1e:
            int r0 = r4.zzd
            r1 = -1
            if (r0 == r1) goto L26
            r5.append(r0)
        L26:
            int r0 = r4.zze
            if (r0 == r1) goto L34
            r0 = 46
            r5.append(r0)
            int r0 = r4.zze
            r5.append(r0)
        L34:
            return r5
    }

    public final boolean zzi(com.google.android.gms.internal.mlkit_vision_mediapipe.zzax r2) {
            r1 = this;
            int r0 = r2.zzb()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzaz r2 = r2.zzd()
            boolean r2 = r2.zza()
            boolean r2 = r1.zzl(r0, r2)
            return r2
    }

    public final boolean zzj() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzay.zzb
            if (r1 != r0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean zzk() {
            r1 = this;
            int r0 = r1.zzc
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean zzl(int r6, boolean r7) {
            r5 = this;
            boolean r0 = r5.zzj()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r5.zzc
            int r6 = ~r6
            r6 = r6 & r0
            r2 = 0
            if (r6 == 0) goto L10
            return r2
        L10:
            r6 = -1
            if (r7 != 0) goto L19
            int r7 = r5.zze
            if (r7 != r6) goto L18
            goto L19
        L18:
            return r2
        L19:
            int r7 = r5.zzd
            r3 = r0 & 9
            r4 = 9
            if (r3 != r4) goto L22
            return r2
        L22:
            r3 = 96
            r0 = r0 & r3
            if (r0 != r3) goto L28
            return r2
        L28:
            if (r0 == 0) goto L2d
            if (r7 != r6) goto L2d
            return r2
        L2d:
            return r1
    }
}
