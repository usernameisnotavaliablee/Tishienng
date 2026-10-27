package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzdu implements java.io.Closeable {
    int zza;
    private final java.io.Reader zzb;
    private com.google.android.gms.internal.mlkit_vision_pose_common.zzdd zzc;
    private final char[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzi;
    private int zzj;
    private int[] zzk;
    private int zzl;
    private java.lang.String[] zzm;
    private int[] zzn;

    static {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdt r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdt
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdf.zza = r0
            return
    }

    public zzdu(java.io.Reader r5) {
            r4 = this;
            r4.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdd.zzb
            r4.zzc = r0
            r0 = 1024(0x400, float:1.435E-42)
            char[] r0 = new char[r0]
            r4.zzd = r0
            r0 = 0
            r4.zze = r0
            r4.zzf = r0
            r4.zzg = r0
            r4.zzh = r0
            r4.zza = r0
            r1 = 32
            int[] r2 = new int[r1]
            r4.zzk = r2
            r3 = 1
            r4.zzl = r3
            r3 = 6
            r2[r0] = r3
            java.lang.String[] r0 = new java.lang.String[r1]
            r4.zzm = r0
            int[] r0 = new int[r1]
            r4.zzn = r0
            java.lang.String r0 = "in == null"
            java.util.Objects.requireNonNull(r5, r0)
            r4.zzb = r5
            return
    }

    private final int zzo(boolean r9) throws java.io.IOException {
            r8 = this;
            int r0 = r8.zze
            int r1 = r8.zzf
        L4:
            r2 = 1
            if (r0 != r1) goto L27
            r8.zze = r0
            boolean r0 = r8.zzw(r2)
            if (r0 != 0) goto L23
            if (r9 != 0) goto L13
            r9 = -1
            return r9
        L13:
            java.io.EOFException r9 = new java.io.EOFException
            java.lang.String r0 = r8.zzc()
            java.lang.String r1 = "End of input"
            java.lang.String r0 = r1.concat(r0)
            r9.<init>(r0)
            throw r9
        L23:
            int r0 = r8.zze
            int r1 = r8.zzf
        L27:
            char[] r3 = r8.zzd
            int r4 = r0 + 1
            char r5 = r3[r0]
            r6 = 10
            if (r5 != r6) goto L3a
            int r0 = r8.zzg
            int r0 = r0 + r2
            r8.zzg = r0
            r8.zzh = r4
            goto Ldc
        L3a:
            r7 = 32
            if (r5 == r7) goto Ldc
            r7 = 13
            if (r5 == r7) goto Ldc
            r7 = 9
            if (r5 != r7) goto L48
            goto Ldc
        L48:
            r7 = 47
            if (r5 != r7) goto Lc7
            r8.zze = r4
            r5 = 2
            if (r4 != r1) goto L60
            r8.zze = r0
            boolean r0 = r8.zzw(r5)
            int r1 = r8.zze
            int r1 = r1 + r2
            r8.zze = r1
            if (r0 == 0) goto L5f
            goto L60
        L5f:
            return r7
        L60:
            r8.zzt()
            int r0 = r8.zze
            char r1 = r3[r0]
            r3 = 42
            if (r1 == r3) goto L7a
            if (r1 == r7) goto L6e
            return r7
        L6e:
            int r0 = r0 + 1
            r8.zze = r0
            r8.zzv()
            int r0 = r8.zze
            int r1 = r8.zzf
            goto L4
        L7a:
            int r0 = r0 + 1
            r8.zze = r0
        L7e:
            int r0 = r8.zze
            int r0 = r0 + r5
            int r1 = r8.zzf
            if (r0 <= r1) goto L93
            boolean r0 = r8.zzw(r5)
            if (r0 == 0) goto L8c
            goto L93
        L8c:
            java.lang.String r9 = "Unterminated comment"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdx r9 = r8.zzp(r9)
            throw r9
        L93:
            char[] r0 = r8.zzd
            int r1 = r8.zze
            char r0 = r0[r1]
            if (r0 != r6) goto La5
            int r0 = r8.zzg
            int r0 = r0 + r2
            r8.zzg = r0
            int r1 = r1 + 1
            r8.zzh = r1
            goto Lba
        La5:
            r0 = 0
        La6:
            if (r0 >= r5) goto Lc0
            char[] r1 = r8.zzd
            int r3 = r8.zze
            int r3 = r3 + r0
            char r1 = r1[r3]
            java.lang.String r3 = "*/"
            char r3 = r3.charAt(r0)
            if (r1 != r3) goto Lba
            int r0 = r0 + 1
            goto La6
        Lba:
            int r0 = r8.zze
            int r0 = r0 + r2
            r8.zze = r0
            goto L7e
        Lc0:
            int r0 = r8.zze
            int r0 = r0 + r5
            int r1 = r8.zzf
            goto L4
        Lc7:
            r0 = 35
            if (r5 != r0) goto Ld9
            r8.zze = r4
            r8.zzt()
            r8.zzv()
            int r0 = r8.zze
            int r1 = r8.zzf
            goto L4
        Ld9:
            r8.zze = r4
            return r5
        Ldc:
            r0 = r4
            goto L4
    }

    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzdx zzp(java.lang.String r4) throws com.google.android.gms.internal.mlkit_vision_pose_common.zzdx {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdx r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdx
            java.lang.String r1 = r3.zzc()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r0.<init>(r4)
            throw r0
    }

    private final java.lang.IllegalStateException zzq(java.lang.String r7) throws java.io.IOException {
            r6 = this;
            int r0 = r6.zzn()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            int r2 = r6.zzn()
            java.lang.String r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdv.zza(r2)
            java.lang.String r3 = r6.zzc()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Expected "
            r4.append(r5)
            r4.append(r7)
            java.lang.String r7 = " but was "
            r4.append(r7)
            r4.append(r2)
            r4.append(r3)
            java.lang.String r7 = "\nSee "
            r4.append(r7)
            r7 = 9
            if (r0 != r7) goto L36
            java.lang.String r7 = "adapter-not-null-safe"
            goto L38
        L36:
            java.lang.String r7 = "unexpected-json-structure"
        L38:
            java.lang.String r0 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r7 = r0.concat(r7)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            r1.<init>(r7)
            return r1
    }

    private final java.lang.String zzr(char r12) throws java.io.IOException {
            r11 = this;
            r0 = 0
        L1:
            int r1 = r11.zze
            int r2 = r11.zzf
            r3 = r2
            r2 = r1
        L7:
            char[] r4 = r11.zzd
            r5 = 16
            r6 = 1
            if (r1 >= r3) goto L140
            int r7 = r1 + 1
            char r1 = r4[r1]
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r8 = r11.zzc
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r9 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdd.zzc
            if (r8 != r9) goto L24
            r8 = 32
            if (r1 < r8) goto L1d
            goto L24
        L1d:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdx r12 = r11.zzp(r12)
            throw r12
        L24:
            if (r1 != r12) goto L3c
            int r12 = r7 - r2
            int r12 = r12 + (-1)
            r11.zze = r7
            if (r0 != 0) goto L34
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r2, r12)
            return r0
        L34:
            r0.append(r4, r2, r12)
            java.lang.String r12 = r0.toString()
            return r12
        L3c:
            r8 = 92
            r10 = 10
            if (r1 != r8) goto L134
            int r1 = r7 - r2
            int r3 = r1 + (-1)
            r11.zze = r7
            if (r0 != 0) goto L54
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r1 + r1
            int r1 = java.lang.Math.max(r1, r5)
            r0.<init>(r1)
        L54:
            r0.append(r4, r2, r3)
            int r1 = r11.zze
            int r2 = r11.zzf
            java.lang.String r3 = "Unterminated escape sequence"
            if (r1 != r2) goto L6b
            boolean r1 = r11.zzw(r6)
            if (r1 == 0) goto L66
            goto L6b
        L66:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdx r12 = r11.zzp(r3)
            throw r12
        L6b:
            char[] r1 = r11.zzd
            int r2 = r11.zze
            int r4 = r2 + 1
            r11.zze = r4
            char r1 = r1[r2]
            if (r1 == r10) goto L10c
            r4 = 34
            if (r1 == r4) goto L11b
            r4 = 39
            if (r1 == r4) goto L117
            r4 = 47
            if (r1 == r4) goto L11b
            if (r1 == r8) goto L11b
            r4 = 98
            if (r1 == r4) goto L109
            r4 = 102(0x66, float:1.43E-43)
            if (r1 == r4) goto L106
            r5 = 110(0x6e, float:1.54E-43)
            if (r1 == r5) goto L11c
            r5 = 114(0x72, float:1.6E-43)
            if (r1 == r5) goto L103
            r5 = 116(0x74, float:1.63E-43)
            if (r1 == r5) goto L100
            r5 = 117(0x75, float:1.64E-43)
            if (r1 != r5) goto Lf9
            int r2 = r2 + 5
            int r1 = r11.zzf
            r5 = 4
            if (r2 <= r1) goto Lb0
            boolean r1 = r11.zzw(r5)
            if (r1 == 0) goto Lab
            goto Lb0
        Lab:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdx r12 = r11.zzp(r3)
            throw r12
        Lb0:
            int r1 = r11.zze
            int r2 = r1 + 4
            r3 = 0
        Lb5:
            if (r1 >= r2) goto Lf2
            char[] r6 = r11.zzd
            int r3 = r3 << 4
            char r7 = r6[r1]
            r8 = 48
            if (r7 < r8) goto Lc9
            r8 = 57
            if (r7 > r8) goto Lc9
            int r7 = r7 + (-48)
        Lc7:
            int r3 = r3 + r7
            goto Ldd
        Lc9:
            r8 = 97
            if (r7 < r8) goto Ld2
            if (r7 > r4) goto Ld2
            int r7 = r7 + (-87)
            goto Lc7
        Ld2:
            r8 = 65
            if (r7 < r8) goto Le0
            r8 = 70
            if (r7 > r8) goto Le0
            int r7 = r7 + (-55)
            goto Lc7
        Ldd:
            int r1 = r1 + 1
            goto Lb5
        Le0:
            java.lang.String r12 = new java.lang.String
            int r0 = r11.zze
            r12.<init>(r6, r0, r5)
            java.lang.String r0 = "Malformed Unicode escape \\u"
            java.lang.String r12 = r0.concat(r12)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdx r12 = r11.zzp(r12)
            throw r12
        Lf2:
            int r1 = r11.zze
            int r1 = r1 + r5
            r11.zze = r1
            char r10 = (char) r3
            goto L11c
        Lf9:
            java.lang.String r12 = "Invalid escape sequence"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdx r12 = r11.zzp(r12)
            throw r12
        L100:
            r10 = 9
            goto L11c
        L103:
            r10 = 13
            goto L11c
        L106:
            r10 = 12
            goto L11c
        L109:
            r10 = 8
            goto L11c
        L10c:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r2 = r11.zzc
            if (r2 == r9) goto L12d
            int r2 = r11.zzg
            int r2 = r2 + r6
            r11.zzg = r2
            r11.zzh = r4
        L117:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r2 = r11.zzc
            if (r2 == r9) goto L126
        L11b:
            r10 = r1
        L11c:
            r0.append(r10)
            int r2 = r11.zze
            int r3 = r11.zzf
            r1 = r2
            goto L7
        L126:
            java.lang.String r12 = "Invalid escaped character \"'\" in strict mode"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdx r12 = r11.zzp(r12)
            throw r12
        L12d:
            java.lang.String r12 = "Cannot escape a newline character in strict mode"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdx r12 = r11.zzp(r12)
            throw r12
        L134:
            if (r1 != r10) goto L13d
            int r1 = r11.zzg
            int r1 = r1 + r6
            r11.zzg = r1
            r11.zzh = r7
        L13d:
            r1 = r7
            goto L7
        L140:
            int r3 = r1 - r2
            if (r0 != 0) goto L150
            int r0 = r3 + r3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r0 = java.lang.Math.max(r0, r5)
            r7.<init>(r0)
            r0 = r7
        L150:
            r0.append(r4, r2, r3)
            r11.zze = r1
            boolean r1 = r11.zzw(r6)
            if (r1 == 0) goto L15d
            goto L1
        L15d:
            java.lang.String r12 = "Unterminated string"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdx r12 = r11.zzp(r12)
            throw r12
    }

    private final java.lang.String zzs() throws java.io.IOException {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r5.zze
            int r3 = r3 + r2
            int r4 = r5.zzf
            if (r3 >= r4) goto L4c
            char[] r4 = r5.zzd
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L59
            r4 = 10
            if (r3 == r4) goto L59
            r4 = 12
            if (r3 == r4) goto L59
            r4 = 13
            if (r3 == r4) goto L59
            r4 = 32
            if (r3 == r4) goto L59
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L59
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L59
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L59
            r4 = 58
            if (r3 == r4) goto L59
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L59;
                case 92: goto L48;
                case 93: goto L59;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r5.zzt()
            goto L59
        L4c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5b
            int r3 = r2 + 1
            boolean r3 = r5.zzw(r3)
            if (r3 == 0) goto L59
            goto L3
        L59:
            r0 = r2
            goto L7b
        L5b:
            if (r1 != 0) goto L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L68:
            char[] r3 = r5.zzd
            int r4 = r5.zze
            r1.append(r3, r4, r2)
            int r3 = r5.zze
            int r3 = r3 + r2
            r5.zze = r3
            r2 = 1
            boolean r2 = r5.zzw(r2)
            if (r2 != 0) goto L2
        L7b:
            if (r1 != 0) goto L87
            char[] r1 = r5.zzd
            java.lang.String r2 = new java.lang.String
            int r3 = r5.zze
            r2.<init>(r1, r3, r0)
            goto L92
        L87:
            char[] r2 = r5.zzd
            int r3 = r5.zze
            r1.append(r2, r3, r0)
            java.lang.String r2 = r1.toString()
        L92:
            int r1 = r5.zze
            int r1 = r1 + r0
            r5.zze = r1
            return r2
    }

    private final void zzt() throws com.google.android.gms.internal.mlkit_vision_pose_common.zzdx {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r0 = r2.zzc
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r1 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdd.zza
            if (r0 != r1) goto L7
            return
        L7:
            java.lang.String r0 = "Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdx r0 = r2.zzp(r0)
            throw r0
    }

    private final void zzu(int r4) throws com.google.android.gms.internal.mlkit_vision_pose_common.zzdx {
            r3 = this;
            int r0 = r3.zzl
            int r1 = r0 + (-1)
            r2 = 1280(0x500, float:1.794E-42)
            if (r1 >= r2) goto L31
            int[] r1 = r3.zzk
            int r2 = r1.length
            if (r0 != r2) goto L26
            int r0 = r0 + r0
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.zzk = r1
            int[] r1 = r3.zzn
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.zzn = r1
            java.lang.String[] r1 = r3.zzm
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.zzm = r0
        L26:
            int[] r0 = r3.zzk
            int r1 = r3.zzl
            int r2 = r1 + 1
            r3.zzl = r2
            r0[r1] = r4
            return
        L31:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdx r4 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzdx
            java.lang.String r0 = r3.zzc()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Nesting limit 1280 reached"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
    }

    private final void zzv() throws java.io.IOException {
            r4 = this;
        L0:
            int r0 = r4.zze
            int r1 = r4.zzf
            r2 = 1
            if (r0 < r1) goto Ld
            boolean r0 = r4.zzw(r2)
            if (r0 == 0) goto L27
        Ld:
            char[] r0 = r4.zzd
            int r1 = r4.zze
            int r3 = r1 + 1
            r4.zze = r3
            char r0 = r0[r1]
            r1 = 10
            if (r0 != r1) goto L23
            int r0 = r4.zzg
            int r0 = r0 + r2
            r4.zzg = r0
            r4.zzh = r3
            return
        L23:
            r1 = 13
            if (r0 != r1) goto L0
        L27:
            return
    }

    private final boolean zzw(int r7) throws java.io.IOException {
            r6 = this;
            int r0 = r6.zzh
            int r1 = r6.zze
            int r0 = r0 - r1
            r6.zzh = r0
            char[] r0 = r6.zzd
            int r2 = r6.zzf
            r3 = 0
            if (r2 == r1) goto L15
            int r2 = r2 - r1
            r6.zzf = r2
            java.lang.System.arraycopy(r0, r1, r0, r3, r2)
            goto L17
        L15:
            r6.zzf = r3
        L17:
            r6.zze = r3
        L19:
            java.io.Reader r1 = r6.zzb
            int r2 = r6.zzf
            int r4 = 1024 - r2
            int r1 = r1.read(r0, r2, r4)
            r2 = -1
            if (r1 == r2) goto L49
            int r2 = r6.zzf
            int r2 = r2 + r1
            r6.zzf = r2
            int r1 = r6.zzg
            r4 = 1
            if (r1 != 0) goto L46
            int r1 = r6.zzh
            if (r1 != 0) goto L46
            if (r2 <= 0) goto L46
            char r1 = r0[r3]
            r5 = 65279(0xfeff, float:9.1475E-41)
            if (r1 != r5) goto L46
            int r1 = r6.zze
            int r1 = r1 + r4
            r6.zze = r1
            r6.zzh = r4
            int r7 = r7 + 1
        L46:
            if (r2 < r7) goto L19
            return r4
        L49:
            return r3
    }

    private final boolean zzx(char r2) throws java.io.IOException {
            r1 = this;
            r0 = 9
            if (r2 == r0) goto L3c
            r0 = 10
            if (r2 == r0) goto L3c
            r0 = 12
            if (r2 == r0) goto L3c
            r0 = 13
            if (r2 == r0) goto L3c
            r0 = 32
            if (r2 == r0) goto L3c
            r0 = 35
            if (r2 == r0) goto L39
            r0 = 44
            if (r2 == r0) goto L3c
            r0 = 47
            if (r2 == r0) goto L39
            r0 = 61
            if (r2 == r0) goto L39
            r0 = 123(0x7b, float:1.72E-43)
            if (r2 == r0) goto L3c
            r0 = 125(0x7d, float:1.75E-43)
            if (r2 == r0) goto L3c
            r0 = 58
            if (r2 == r0) goto L3c
            r0 = 59
            if (r2 == r0) goto L39
            switch(r2) {
                case 91: goto L3c;
                case 92: goto L39;
                case 93: goto L3c;
                default: goto L37;
            }
        L37:
            r2 = 1
            return r2
        L39:
            r1.zzt()
        L3c:
            r2 = 0
            return r2
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
            r3 = this;
            r0 = 0
            r3.zza = r0
            int[] r1 = r3.zzk
            r2 = 8
            r1[r0] = r2
            r0 = 1
            r3.zzl = r0
            java.io.Reader r0 = r3.zzb
            r0.close()
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_pose_common.zzdu> r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdu.class
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = r2.zzc()
            java.lang.String r0 = r0.concat(r1)
            return r0
    }

    final int zza() throws java.io.IOException {
            r24 = this;
            r0 = r24
            int[] r1 = r0.zzk
            int r2 = r0.zzl
            r3 = -1
            int r2 = r2 + r3
            r4 = r1[r2]
            r7 = 10
            r8 = 39
            r9 = 93
            r10 = 59
            r11 = 44
            r12 = 6
            r13 = 3
            r14 = 7
            r15 = 4
            r5 = 5
            r6 = 2
            r18 = -1
            r3 = 1
            if (r4 != r3) goto L24
            r1[r2] = r6
        L21:
            r1 = 0
            goto Le5
        L24:
            if (r4 != r6) goto L3e
            int r1 = r0.zzo(r3)
            if (r1 == r11) goto L21
            if (r1 == r10) goto L3a
            if (r1 != r9) goto L33
        L30:
            r13 = 4
            goto L33d
        L33:
            java.lang.String r1 = "Unterminated array"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdx r1 = r0.zzp(r1)
            throw r1
        L3a:
            r0.zzt()
            goto L21
        L3e:
            r6 = 125(0x7d, float:1.75E-43)
            if (r4 == r13) goto L44
            if (r4 != r5) goto L49
        L44:
            r3 = 2
            r19 = 4
            goto L2e7
        L49:
            if (r4 != r15) goto L7d
            r1[r2] = r5
            int r1 = r0.zzo(r3)
            r2 = 58
            if (r1 == r2) goto L21
            r2 = 61
            if (r1 != r2) goto L76
            r0.zzt()
            int r1 = r0.zze
            int r2 = r0.zzf
            if (r1 < r2) goto L68
            boolean r1 = r0.zzw(r3)
            if (r1 == 0) goto L21
        L68:
            char[] r1 = r0.zzd
            int r2 = r0.zze
            char r1 = r1[r2]
            r6 = 62
            if (r1 != r6) goto L21
            int r2 = r2 + r3
            r0.zze = r2
            goto L21
        L76:
            java.lang.String r1 = "Expected ':'"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdx r1 = r0.zzp(r1)
            throw r1
        L7d:
            if (r4 != r12) goto Lc9
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r1 = r0.zzc
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r2 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdd.zza
            if (r1 != r2) goto Lbf
            r0.zzo(r3)
            int r1 = r0.zze
            int r2 = r1 + (-1)
            r0.zze = r2
            int r1 = r1 + r15
            int r2 = r0.zzf
            if (r1 <= r2) goto L9a
            boolean r1 = r0.zzw(r5)
            if (r1 != 0) goto L9a
            goto Lbf
        L9a:
            int r1 = r0.zze
            char[] r2 = r0.zzd
            char r15 = r2[r1]
            r12 = 41
            if (r15 != r12) goto Lbf
            int r12 = r1 + 1
            char r12 = r2[r12]
            if (r12 != r9) goto Lbf
            int r12 = r1 + 2
            char r12 = r2[r12]
            if (r12 != r6) goto Lbf
            int r6 = r1 + 3
            char r6 = r2[r6]
            if (r6 != r8) goto Lbf
            int r6 = r1 + 4
            char r2 = r2[r6]
            if (r2 != r7) goto Lbf
            int r1 = r1 + r5
            r0.zze = r1
        Lbf:
            int[] r1 = r0.zzk
            int r2 = r0.zzl
            int r2 = r2 + (-1)
            r1[r2] = r14
            goto L21
        Lc9:
            if (r4 != r14) goto Le0
            r1 = 0
            int r2 = r0.zzo(r1)
            r6 = -1
            if (r2 != r6) goto Ld7
            r13 = 17
            goto L33d
        Ld7:
            r0.zzt()
            int r2 = r0.zze
            int r2 = r2 + r6
            r0.zze = r2
            goto Le5
        Le0:
            r1 = 0
            r2 = 8
            if (r4 == r2) goto L2df
        Le5:
            int r2 = r0.zzo(r3)
            r6 = 34
            if (r2 == r6) goto L2dc
            if (r2 == r8) goto L2d4
            if (r2 == r11) goto L2b8
            if (r2 == r10) goto L2b8
            r6 = 91
            if (r2 == r6) goto L33d
            if (r2 == r9) goto L2b3
            r4 = 123(0x7b, float:1.72E-43)
            if (r2 == r4) goto L2b0
            int r2 = r0.zze
            r18 = -1
            int r2 = r2 + (-1)
            r0.zze = r2
            char[] r4 = r0.zzd
            char r2 = r4[r2]
            r4 = 116(0x74, float:1.63E-43)
            if (r2 == r4) goto L132
            r4 = 84
            if (r2 != r4) goto L112
            goto L132
        L112:
            r4 = 102(0x66, float:1.43E-43)
            if (r2 == r4) goto L12c
            r4 = 70
            if (r2 != r4) goto L11b
            goto L12c
        L11b:
            r4 = 110(0x6e, float:1.54E-43)
            if (r2 == r4) goto L126
            r4 = 78
            if (r2 != r4) goto L124
            goto L126
        L124:
            r6 = 0
            goto L18e
        L126:
            java.lang.String r2 = "NULL"
            java.lang.String r4 = "null"
            r6 = 7
            goto L137
        L12c:
            java.lang.String r2 = "FALSE"
            java.lang.String r4 = "false"
            r6 = 6
            goto L137
        L132:
            java.lang.String r2 = "TRUE"
            java.lang.String r4 = "true"
            r6 = 5
        L137:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r8 = r0.zzc
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r9 = com.google.android.gms.internal.mlkit_vision_pose_common.zzdd.zzc
            r10 = 0
        L13c:
            int r11 = r4.length()
            if (r10 >= r11) goto L16a
            int r11 = r0.zze
            int r11 = r11 + r10
            int r12 = r0.zzf
            if (r11 < r12) goto L152
            int r11 = r10 + 1
            boolean r11 = r0.zzw(r11)
            if (r11 != 0) goto L152
            goto L124
        L152:
            char[] r11 = r0.zzd
            int r12 = r0.zze
            int r12 = r12 + r10
            char r11 = r11[r12]
            char r12 = r4.charAt(r10)
            if (r11 == r12) goto L167
            if (r8 == r9) goto L124
            char r12 = r2.charAt(r10)
            if (r11 != r12) goto L124
        L167:
            int r10 = r10 + 1
            goto L13c
        L16a:
            int r2 = r0.zze
            int r2 = r2 + r11
            int r4 = r0.zzf
            if (r2 < r4) goto L179
            int r2 = r11 + 1
            boolean r2 = r0.zzw(r2)
            if (r2 == 0) goto L187
        L179:
            char[] r2 = r0.zzd
            int r4 = r0.zze
            int r4 = r4 + r11
            char r2 = r2[r4]
            boolean r2 = r0.zzx(r2)
            if (r2 == 0) goto L187
            goto L124
        L187:
            int r2 = r0.zze
            int r2 = r2 + r11
            r0.zze = r2
            r0.zza = r6
        L18e:
            if (r6 != 0) goto L2af
            char[] r2 = r0.zzd
            int r4 = r0.zze
            int r6 = r0.zzf
            r10 = 0
            r11 = 0
            r15 = 0
            r16 = 1
            r17 = 0
        L19e:
            int r1 = r4 + r10
            if (r1 != r6) goto L1bc
            r1 = 1024(0x400, float:1.435E-42)
            if (r10 != r1) goto L1a9
        L1a6:
            r3 = 0
            goto L293
        L1a9:
            int r1 = r10 + 1
            boolean r1 = r0.zzw(r1)
            if (r1 != 0) goto L1b6
            r20 = 0
        L1b3:
            r8 = 2
            goto L22f
        L1b6:
            int r1 = r0.zze
            int r4 = r0.zzf
            r6 = r4
            r4 = r1
        L1bc:
            int r1 = r4 + r10
            char r1 = r2[r1]
            r20 = 0
            r8 = 43
            if (r1 == r8) goto L286
            r8 = 69
            if (r1 == r8) goto L27b
            r8 = 101(0x65, float:1.42E-43)
            if (r1 == r8) goto L27b
            r8 = 45
            if (r1 == r8) goto L26d
            r8 = 46
            if (r1 == r8) goto L265
            r8 = 48
            if (r1 < r8) goto L227
            r8 = 57
            if (r1 <= r8) goto L1df
            goto L227
        L1df:
            if (r15 == r3) goto L1e3
            if (r15 != 0) goto L1e7
        L1e3:
            r23 = r4
            r3 = 6
            goto L220
        L1e7:
            r8 = 2
            if (r15 != r8) goto L211
            int r8 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r8 != 0) goto L1ef
            goto L1a6
        L1ef:
            int r1 = r1 + (-48)
            r8 = 10
            long r8 = r8 * r11
            r22 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r18 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            r23 = r4
            long r3 = (long) r1
            long r8 = r8 - r3
            if (r18 > 0) goto L208
            if (r18 != 0) goto L20a
            int r1 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r1 >= 0) goto L20a
        L208:
            r1 = 1
            goto L20b
        L20a:
            r1 = 0
        L20b:
            r16 = r16 & r1
            r11 = r8
            r3 = 6
            goto L28c
        L211:
            r23 = r4
            r3 = 6
            if (r15 != r13) goto L219
            r15 = 4
            goto L28c
        L219:
            if (r15 == r5) goto L21d
            if (r15 != r3) goto L28c
        L21d:
            r15 = 7
            goto L28c
        L220:
            int r1 = r1 + (-48)
            int r1 = -r1
            long r11 = (long) r1
            r15 = 2
            goto L28c
        L227:
            boolean r1 = r0.zzx(r1)
            if (r1 == 0) goto L1b3
            goto L1a6
        L22f:
            if (r15 != r8) goto L259
            if (r16 == 0) goto L23d
            r1 = -9223372036854775808
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r3 != 0) goto L240
            if (r17 == 0) goto L23d
            r3 = 1
            goto L242
        L23d:
            r8 = 2
            r15 = 2
            goto L259
        L240:
            r3 = r17
        L242:
            int r1 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r1 != 0) goto L249
            if (r3 != 0) goto L23d
            goto L24c
        L249:
            if (r3 == 0) goto L24c
            goto L24d
        L24c:
            long r11 = -r11
        L24d:
            r0.zzi = r11
            int r1 = r0.zze
            int r1 = r1 + r10
            r0.zze = r1
            r3 = 15
        L256:
            r0.zza = r3
            goto L293
        L259:
            if (r15 == r8) goto L260
            r1 = 4
            if (r15 == r1) goto L260
            if (r15 != r14) goto L1a6
        L260:
            r0.zzj = r10
            r3 = 16
            goto L256
        L265:
            r23 = r4
            r3 = 6
            r8 = 2
            if (r15 != r8) goto L1a6
            r15 = 3
            goto L28c
        L26d:
            r23 = r4
            r3 = 6
            r8 = 2
            if (r15 != 0) goto L277
            r15 = 1
            r17 = 1
            goto L28c
        L277:
            if (r15 != r5) goto L1a6
        L279:
            r15 = 6
            goto L28c
        L27b:
            r23 = r4
            r3 = 6
            r8 = 2
            if (r15 == r8) goto L284
            r1 = 4
            if (r15 != r1) goto L1a6
        L284:
            r15 = 5
            goto L28c
        L286:
            r23 = r4
            r3 = 6
            if (r15 != r5) goto L1a6
            goto L279
        L28c:
            int r10 = r10 + 1
            r4 = r23
            r3 = 1
            goto L19e
        L293:
            if (r3 == 0) goto L296
            return r3
        L296:
            char[] r1 = r0.zzd
            int r2 = r0.zze
            char r1 = r1[r2]
            boolean r1 = r0.zzx(r1)
            if (r1 == 0) goto L2a8
            r0.zzt()
            r0.zza = r7
            return r7
        L2a8:
            java.lang.String r1 = "Expected value"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdx r1 = r0.zzp(r1)
            throw r1
        L2af:
            return r6
        L2b0:
            r13 = 1
            goto L33d
        L2b3:
            r1 = 1
            if (r4 != r1) goto L2b9
            goto L30
        L2b8:
            r1 = 1
        L2b9:
            if (r4 == r1) goto L2c6
            r3 = 2
            if (r4 != r3) goto L2bf
            goto L2c6
        L2bf:
            java.lang.String r1 = "Unexpected value"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdx r1 = r0.zzp(r1)
            throw r1
        L2c6:
            r0.zzt()
            int r1 = r0.zze
            r18 = -1
            int r1 = r1 + (-1)
            r0.zze = r1
            r0.zza = r14
            return r14
        L2d4:
            r0.zzt()
            r2 = 8
            r0.zza = r2
            return r2
        L2dc:
            r13 = 9
            goto L33d
        L2df:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L2e7:
            r1[r2] = r19
            if (r4 != r5) goto L302
            r1 = 1
            int r2 = r0.zzo(r1)
            if (r2 == r11) goto L302
            if (r2 == r10) goto L2ff
            if (r2 != r6) goto L2f8
        L2f6:
            r13 = 2
            goto L33d
        L2f8:
            java.lang.String r1 = "Unterminated object"
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdx r1 = r0.zzp(r1)
            throw r1
        L2ff:
            r0.zzt()
        L302:
            r1 = 1
            int r1 = r0.zzo(r1)
            r2 = 34
            if (r1 == r2) goto L33b
            if (r1 == r8) goto L333
            java.lang.String r2 = "Expected name"
            if (r1 == r6) goto L32b
            r0.zzt()
            int r3 = r0.zze
            r18 = -1
            int r3 = r3 + (-1)
            r0.zze = r3
            char r1 = (char) r1
            boolean r1 = r0.zzx(r1)
            if (r1 == 0) goto L326
            r13 = 14
            goto L33d
        L326:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdx r1 = r0.zzp(r2)
            throw r1
        L32b:
            if (r4 == r5) goto L32e
            goto L2f6
        L32e:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdx r1 = r0.zzp(r2)
            throw r1
        L333:
            r0.zzt()
            r1 = 12
            r0.zza = r1
            return r1
        L33b:
            r13 = 13
        L33d:
            r0.zza = r13
            return r13
    }

    public final com.google.android.gms.internal.mlkit_vision_pose_common.zzdd zzb() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r0 = r1.zzc
            return r0
    }

    final java.lang.String zzc() {
            r6 = this;
            int r0 = r6.zzg
            int r0 = r0 + 1
            int r1 = r6.zze
            int r2 = r6.zzh
            int r1 = r1 - r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 36
            r2.append(r3)
            r3 = 0
        L14:
            int r4 = r6.zzl
            if (r3 >= r4) goto L59
            int[] r4 = r6.zzk
            r4 = r4[r3]
            switch(r4) {
                case 1: goto L45;
                case 2: goto L45;
                case 3: goto L36;
                case 4: goto L36;
                case 5: goto L36;
                case 6: goto L56;
                case 7: goto L56;
                case 8: goto L56;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown scope value: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L36:
            r4 = 46
            r2.append(r4)
            java.lang.String[] r4 = r6.zzm
            r4 = r4[r3]
            if (r4 == 0) goto L56
            r2.append(r4)
            goto L56
        L45:
            int[] r4 = r6.zzn
            r4 = r4[r3]
            r5 = 91
            r2.append(r5)
            r2.append(r4)
            r4 = 93
            r2.append(r4)
        L56:
            int r3 = r3 + 1
            goto L14
        L59:
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = " at line "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " column "
            r3.append(r0)
            int r1 = r1 + 1
            r3.append(r1)
            java.lang.String r0 = " path "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            return r0
    }

    public final java.lang.String zzd() throws java.io.IOException {
            r3 = this;
            int r0 = r3.zza
            if (r0 != 0) goto L8
            int r0 = r3.zza()
        L8:
            r1 = 14
            if (r0 != r1) goto L11
            java.lang.String r0 = r3.zzs()
            goto L26
        L11:
            r1 = 12
            if (r0 != r1) goto L1c
            r0 = 39
            java.lang.String r0 = r3.zzr(r0)
            goto L26
        L1c:
            r1 = 13
            if (r0 != r1) goto L32
            r0 = 34
            java.lang.String r0 = r3.zzr(r0)
        L26:
            r1 = 0
            r3.zza = r1
            java.lang.String[] r1 = r3.zzm
            int r2 = r3.zzl
            int r2 = r2 + (-1)
            r1[r2] = r0
            return r0
        L32:
            java.lang.String r0 = "a name"
            java.lang.IllegalStateException r0 = r3.zzq(r0)
            throw r0
    }

    public final java.lang.String zze() throws java.io.IOException {
            r4 = this;
            int r0 = r4.zza
            if (r0 != 0) goto L8
            int r0 = r4.zza()
        L8:
            r1 = 10
            if (r0 != r1) goto L11
            java.lang.String r0 = r4.zzs()
            goto L4f
        L11:
            r1 = 8
            if (r0 != r1) goto L1c
            r0 = 39
            java.lang.String r0 = r4.zzr(r0)
            goto L4f
        L1c:
            r1 = 9
            if (r0 != r1) goto L27
            r0 = 34
            java.lang.String r0 = r4.zzr(r0)
            goto L4f
        L27:
            r1 = 11
            if (r0 != r1) goto L2d
            r0 = 0
            goto L4f
        L2d:
            r1 = 15
            if (r0 != r1) goto L38
            long r0 = r4.zzi
            java.lang.String r0 = java.lang.Long.toString(r0)
            goto L4f
        L38:
            r1 = 16
            if (r0 != r1) goto L5f
            char[] r0 = r4.zzd
            java.lang.String r1 = new java.lang.String
            int r2 = r4.zze
            int r3 = r4.zzj
            r1.<init>(r0, r2, r3)
            int r0 = r4.zze
            int r2 = r4.zzj
            int r0 = r0 + r2
            r4.zze = r0
            r0 = r1
        L4f:
            r1 = 0
            r4.zza = r1
            int[] r1 = r4.zzn
            int r2 = r4.zzl
            int r2 = r2 + (-1)
            r3 = r1[r2]
            int r3 = r3 + 1
            r1[r2] = r3
            return r0
        L5f:
            java.lang.String r0 = "a string"
            java.lang.IllegalStateException r0 = r4.zzq(r0)
            throw r0
    }

    public final void zzf() throws java.io.IOException {
            r3 = this;
            int r0 = r3.zza
            if (r0 != 0) goto L8
            int r0 = r3.zza()
        L8:
            r1 = 3
            if (r0 != r1) goto L1b
            r0 = 1
            r3.zzu(r0)
            int[] r0 = r3.zzn
            int r1 = r3.zzl
            int r1 = r1 + (-1)
            r2 = 0
            r0[r1] = r2
            r3.zza = r2
            return
        L1b:
            java.lang.String r0 = "BEGIN_ARRAY"
            java.lang.IllegalStateException r0 = r3.zzq(r0)
            throw r0
    }

    public final void zzg() throws java.io.IOException {
            r2 = this;
            int r0 = r2.zza
            if (r0 != 0) goto L8
            int r0 = r2.zza()
        L8:
            r1 = 1
            if (r0 != r1) goto L13
            r0 = 3
            r2.zzu(r0)
            r0 = 0
            r2.zza = r0
            return
        L13:
            java.lang.String r0 = "BEGIN_OBJECT"
            java.lang.IllegalStateException r0 = r2.zzq(r0)
            throw r0
    }

    public final void zzh() throws java.io.IOException {
            r3 = this;
            int r0 = r3.zza
            if (r0 != 0) goto L8
            int r0 = r3.zza()
        L8:
            r1 = 4
            if (r0 != r1) goto L1f
            int r0 = r3.zzl
            int r1 = r0 + (-1)
            r3.zzl = r1
            int[] r1 = r3.zzn
            int r0 = r0 + (-2)
            r2 = r1[r0]
            int r2 = r2 + 1
            r1[r0] = r2
            r0 = 0
            r3.zza = r0
            return
        L1f:
            java.lang.String r0 = "END_ARRAY"
            java.lang.IllegalStateException r0 = r3.zzq(r0)
            throw r0
    }

    public final void zzi() throws java.io.IOException {
            r4 = this;
            int r0 = r4.zza
            if (r0 != 0) goto L8
            int r0 = r4.zza()
        L8:
            r1 = 2
            if (r0 != r1) goto L24
            int r0 = r4.zzl
            int r1 = r0 + (-1)
            r4.zzl = r1
            java.lang.String[] r2 = r4.zzm
            r3 = 0
            r2[r1] = r3
            int[] r1 = r4.zzn
            int r0 = r0 + (-2)
            r2 = r1[r0]
            int r2 = r2 + 1
            r1[r0] = r2
            r0 = 0
            r4.zza = r0
            return
        L24:
            java.lang.String r0 = "END_OBJECT"
            java.lang.IllegalStateException r0 = r4.zzq(r0)
            throw r0
    }

    public final void zzj() throws java.io.IOException {
            r3 = this;
            int r0 = r3.zza
            if (r0 != 0) goto L8
            int r0 = r3.zza()
        L8:
            r1 = 7
            if (r0 != r1) goto L1b
            r0 = 0
            r3.zza = r0
            int[] r0 = r3.zzn
            int r1 = r3.zzl
            int r1 = r1 + (-1)
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            return
        L1b:
            java.lang.String r0 = "null"
            java.lang.IllegalStateException r0 = r3.zzq(r0)
            throw r0
    }

    public final void zzk(com.google.android.gms.internal.mlkit_vision_pose_common.zzdd r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.zzc = r1
            return
    }

    public final boolean zzl() throws java.io.IOException {
            r2 = this;
            int r0 = r2.zza
            if (r0 != 0) goto L8
            int r0 = r2.zza()
        L8:
            r1 = 2
            if (r0 == r1) goto L14
            r1 = 4
            if (r0 == r1) goto L14
            r1 = 17
            if (r0 == r1) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public final boolean zzm() throws java.io.IOException {
            r5 = this;
            int r0 = r5.zza
            if (r0 != 0) goto L8
            int r0 = r5.zza()
        L8:
            r1 = 5
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L1b
            r5.zza = r3
            int[] r0 = r5.zzn
            int r1 = r5.zzl
            int r1 = r1 + (-1)
            r3 = r0[r1]
            int r3 = r3 + r2
            r0[r1] = r3
            return r2
        L1b:
            r1 = 6
            if (r0 != r1) goto L2c
            r5.zza = r3
            int[] r0 = r5.zzn
            int r1 = r5.zzl
            int r1 = r1 + (-1)
            r4 = r0[r1]
            int r4 = r4 + r2
            r0[r1] = r4
            return r3
        L2c:
            java.lang.String r0 = "a boolean"
            java.lang.IllegalStateException r0 = r5.zzq(r0)
            throw r0
    }

    public final int zzn() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zza
            if (r0 != 0) goto L8
            int r0 = r1.zza()
        L8:
            switch(r0) {
                case 1: goto L20;
                case 2: goto L1e;
                case 3: goto L1c;
                case 4: goto L1a;
                case 5: goto L17;
                case 6: goto L17;
                case 7: goto L14;
                case 8: goto L12;
                case 9: goto L12;
                case 10: goto L12;
                case 11: goto L12;
                case 12: goto L10;
                case 13: goto L10;
                case 14: goto L10;
                case 15: goto Le;
                case 16: goto Le;
                default: goto Lb;
            }
        Lb:
            r0 = 10
            return r0
        Le:
            r0 = 7
            return r0
        L10:
            r0 = 5
            return r0
        L12:
            r0 = 6
            return r0
        L14:
            r0 = 9
            return r0
        L17:
            r0 = 8
            return r0
        L1a:
            r0 = 2
            return r0
        L1c:
            r0 = 1
            return r0
        L1e:
            r0 = 4
            return r0
        L20:
            r0 = 3
            return r0
    }
}
