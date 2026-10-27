package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzlz<T> implements com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi<T> {
    private static final int[] zza = null;
    private static final sun.misc.Unsafe zzb = null;
    private final int[] zzc;
    private final java.lang.Object[] zzd;
    private final int zze;
    private final int zzf;
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzmw zzl;
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzkc zzm;

    static {
            r0 = 0
            int[] r0 = new int[r0]
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zza = r0
            sun.misc.Unsafe r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzg()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zzb = r0
            return
    }

    private zzlz(int[] r1, java.lang.Object[] r2, int r3, int r4, com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r5, boolean r6, int[] r7, int r8, int r9, com.google.android.gms.internal.mlkit_vision_mediapipe.zzmc r10, com.google.android.gms.internal.mlkit_vision_mediapipe.zzlj r11, com.google.android.gms.internal.mlkit_vision_mediapipe.zzmw r12, com.google.android.gms.internal.mlkit_vision_mediapipe.zzkc r13, com.google.android.gms.internal.mlkit_vision_mediapipe.zzlr r14) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzd = r2
            r0.zze = r3
            r0.zzf = r4
            r1 = 0
            if (r13 == 0) goto L13
            boolean r2 = r5 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn
            if (r2 == 0) goto L13
            r1 = 1
        L13:
            r0.zzh = r1
            r0.zzi = r7
            r0.zzj = r8
            r0.zzk = r9
            r0.zzl = r12
            r0.zzm = r13
            r0.zzg = r5
            return
    }

    private static void zzA(java.lang.Object r2) {
            boolean r0 = zzL(r2)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Mutating immutable message: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
    }

    private final void zzB(java.lang.Object r6, java.lang.Object r7, int r8) {
            r5 = this;
            boolean r0 = r5.zzI(r7, r8)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r5.zzs(r8)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            sun.misc.Unsafe r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zzb
            long r2 = (long) r0
            java.lang.Object r0 = r1.getObject(r7, r2)
            if (r0 == 0) goto L53
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r7 = r5.zzv(r8)
            boolean r4 = r5.zzI(r6, r8)
            if (r4 != 0) goto L3a
            boolean r4 = zzL(r0)
            if (r4 != 0) goto L2c
            r1.putObject(r6, r2, r0)
            goto L36
        L2c:
            java.lang.Object r4 = r7.zze()
            r7.zzg(r4, r0)
            r1.putObject(r6, r2, r4)
        L36:
            r5.zzD(r6, r8)
            return
        L3a:
            java.lang.Object r8 = r1.getObject(r6, r2)
            boolean r4 = zzL(r8)
            if (r4 != 0) goto L4f
            java.lang.Object r4 = r7.zze()
            r7.zzg(r4, r8)
            r1.putObject(r6, r2, r4)
            r8 = r4
        L4f:
            r7.zzg(r8, r0)
            return
        L53:
            int[] r6 = r5.zzc
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r6 = r6[r8]
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "Source subfield "
            r8.append(r1)
            r8.append(r6)
            java.lang.String r6 = " is present but null: "
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            r0.<init>(r6)
            throw r0
    }

    private final void zzC(java.lang.Object r7, java.lang.Object r8, int r9) {
            r6 = this;
            int[] r0 = r6.zzc
            r0 = r0[r9]
            boolean r1 = r6.zzM(r8, r0, r9)
            if (r1 != 0) goto Lb
            return
        Lb:
            int r1 = r6.zzs(r9)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            sun.misc.Unsafe r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zzb
            long r3 = (long) r1
            java.lang.Object r1 = r2.getObject(r8, r3)
            if (r1 == 0) goto L57
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r8 = r6.zzv(r9)
            boolean r5 = r6.zzM(r7, r0, r9)
            if (r5 != 0) goto L3e
            boolean r5 = zzL(r1)
            if (r5 != 0) goto L30
            r2.putObject(r7, r3, r1)
            goto L3a
        L30:
            java.lang.Object r5 = r8.zze()
            r8.zzg(r5, r1)
            r2.putObject(r7, r3, r5)
        L3a:
            r6.zzE(r7, r0, r9)
            return
        L3e:
            java.lang.Object r9 = r2.getObject(r7, r3)
            boolean r0 = zzL(r9)
            if (r0 != 0) goto L53
            java.lang.Object r0 = r8.zze()
            r8.zzg(r0, r9)
            r2.putObject(r7, r3, r0)
            r9 = r0
        L53:
            r8.zzg(r9, r1)
            return
        L57:
            int[] r7 = r6.zzc
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r7 = r7[r9]
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "Source subfield "
            r9.append(r1)
            r9.append(r7)
            java.lang.String r7 = " is present but null: "
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
            r0.<init>(r7)
            throw r0
    }

    private final void zzD(java.lang.Object r6, int r7) {
            r5 = this;
            int r7 = r5.zzp(r7)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r7
            long r0 = (long) r0
            r2 = 1048575(0xfffff, double:5.18065E-318)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L11
            return
        L11:
            int r7 = r7 >>> 20
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r6, r0)
            r3 = 1
            int r7 = r3 << r7
            r7 = r7 | r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzq(r6, r0, r7)
            return
    }

    private final void zzE(java.lang.Object r3, int r4, int r5) {
            r2 = this;
            int r5 = r2.zzp(r5)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzq(r3, r0, r4)
            return
    }

    private final void zzF(java.lang.Object r4, int r5, java.lang.Object r6) {
            r3 = this;
            sun.misc.Unsafe r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zzb
            int r1 = r3.zzs(r5)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            long r1 = (long) r1
            r0.putObject(r4, r1, r6)
            r3.zzD(r4, r5)
            return
    }

    private final void zzG(java.lang.Object r4, int r5, int r6, java.lang.Object r7) {
            r3 = this;
            sun.misc.Unsafe r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zzb
            int r1 = r3.zzs(r6)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            long r1 = (long) r1
            r0.putObject(r4, r1, r7)
            r3.zzE(r4, r5, r6)
            return
    }

    private final boolean zzH(java.lang.Object r1, java.lang.Object r2, int r3) {
            r0 = this;
            boolean r1 = r0.zzI(r1, r3)
            boolean r2 = r0.zzI(r2, r3)
            if (r1 != r2) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private final boolean zzI(java.lang.Object r10, int r11) {
            r9 = this;
            int r0 = r9.zzp(r11)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r0 & r1
            long r2 = (long) r2
            r4 = 1048575(0xfffff, double:5.18065E-318)
            r6 = 0
            r7 = 1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto Lee
            int r11 = r9.zzs(r11)
            r0 = r11 & r1
            int r11 = zzr(r11)
            long r0 = (long) r0
            r2 = 0
            switch(r11) {
                case 0: goto Le0;
                case 1: goto Ld4;
                case 2: goto Lca;
                case 3: goto Lc0;
                case 4: goto Lb8;
                case 5: goto Lae;
                case 6: goto La6;
                case 7: goto La1;
                case 8: goto L7b;
                case 9: goto L73;
                case 10: goto L65;
                case 11: goto L5d;
                case 12: goto L55;
                case 13: goto L4d;
                case 14: goto L43;
                case 15: goto L3b;
                case 16: goto L31;
                case 17: goto L29;
                default: goto L23;
            }
        L23:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>()
            throw r10
        L29:
            java.lang.Object r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r10, r0)
            if (r10 == 0) goto L30
            return r7
        L30:
            return r6
        L31:
            long r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r10, r0)
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto L3a
            return r7
        L3a:
            return r6
        L3b:
            int r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r10, r0)
            if (r10 == 0) goto L42
            return r7
        L42:
            return r6
        L43:
            long r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r10, r0)
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto L4c
            return r7
        L4c:
            return r6
        L4d:
            int r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r10, r0)
            if (r10 == 0) goto L54
            return r7
        L54:
            return r6
        L55:
            int r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r10, r0)
            if (r10 == 0) goto L5c
            return r7
        L5c:
            return r6
        L5d:
            int r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r10, r0)
            if (r10 == 0) goto L64
            return r7
        L64:
            return r6
        L65:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r11 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo.zzb
            java.lang.Object r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r10, r0)
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L72
            return r7
        L72:
            return r6
        L73:
            java.lang.Object r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r10, r0)
            if (r10 == 0) goto L7a
            return r7
        L7a:
            return r6
        L7b:
            java.lang.Object r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r10, r0)
            boolean r11 = r10 instanceof java.lang.String
            if (r11 == 0) goto L8d
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L8c
            return r7
        L8c:
            return r6
        L8d:
            boolean r11 = r10 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo
            if (r11 == 0) goto L9b
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r11 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo.zzb
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L9a
            return r7
        L9a:
            return r6
        L9b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>()
            throw r10
        La1:
            boolean r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzw(r10, r0)
            return r10
        La6:
            int r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r10, r0)
            if (r10 == 0) goto Lad
            return r7
        Lad:
            return r6
        Lae:
            long r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r10, r0)
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb7
            return r7
        Lb7:
            return r6
        Lb8:
            int r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r10, r0)
            if (r10 == 0) goto Lbf
            return r7
        Lbf:
            return r6
        Lc0:
            long r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r10, r0)
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto Lc9
            return r7
        Lc9:
            return r6
        Lca:
            long r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r10, r0)
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld3
            return r7
        Ld3:
            return r6
        Ld4:
            float r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzb(r10, r0)
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            if (r10 == 0) goto Ldf
            return r7
        Ldf:
            return r6
        Le0:
            double r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zza(r10, r0)
            long r10 = java.lang.Double.doubleToRawLongBits(r10)
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto Led
            return r7
        Led:
            return r6
        Lee:
            int r11 = r0 >>> 20
            int r11 = r7 << r11
            int r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r10, r2)
            r10 = r10 & r11
            if (r10 == 0) goto Lfa
            return r7
        Lfa:
            return r6
    }

    private final boolean zzJ(java.lang.Object r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != r0) goto La
            boolean r2 = r1.zzI(r2, r3)
            return r2
        La:
            r2 = r5 & r6
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    private static boolean zzK(java.lang.Object r2, int r3, com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r4) {
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r0
            long r0 = (long) r3
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r2, r0)
            boolean r2 = r4.zzk(r2)
            return r2
    }

    private static boolean zzL(java.lang.Object r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r0 = r1 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r1
            boolean r1 = r1.zzH()
            return r1
        Lf:
            r1 = 1
            return r1
    }

    private final boolean zzM(java.lang.Object r3, int r4, int r5) {
            r2 = this;
            int r5 = r2.zzp(r5)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r3, r0)
            if (r3 != r4) goto L11
            r3 = 1
            return r3
        L11:
            r3 = 0
            return r3
    }

    private static boolean zzN(java.lang.Object r0, long r1) {
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    private static final void zzO(int r1, java.lang.Object r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zznj r3) throws java.io.IOException {
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto La
            java.lang.String r2 = (java.lang.String) r2
            r3.zzG(r1, r2)
            return
        La:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo) r2
            r3.zzd(r1, r2)
            return
    }

    static com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx zzd(java.lang.Object r2) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r0 = r2.zzc
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx.zzc()
            if (r0 != r1) goto L10
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx.zzf()
            r2.zzc = r0
        L10:
            return r0
    }

    static com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz zzl(java.lang.Class r32, com.google.android.gms.internal.mlkit_vision_mediapipe.zzlt r33, com.google.android.gms.internal.mlkit_vision_mediapipe.zzmc r34, com.google.android.gms.internal.mlkit_vision_mediapipe.zzlj r35, com.google.android.gms.internal.mlkit_vision_mediapipe.zzmw r36, com.google.android.gms.internal.mlkit_vision_mediapipe.zzkc r37, com.google.android.gms.internal.mlkit_vision_mediapipe.zzlr r38) {
            r0 = r33
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzmh
            if (r1 == 0) goto L410
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmh r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzmh) r0
            java.lang.String r1 = r0.zzd()
            int r2 = r1.length()
            r3 = 0
            char r4 = r1.charAt(r3)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L25
            r4 = 1
        L1b:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L26
            r4 = r7
            goto L1b
        L25:
            r7 = 1
        L26:
            int r4 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L45
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L32:
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L42
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r9
            r7 = r7 | r4
            int r9 = r9 + 13
            r4 = r10
            goto L32
        L42:
            int r4 = r4 << r9
            r7 = r7 | r4
            r4 = r10
        L45:
            if (r7 != 0) goto L55
            int[] r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zza
            r16 = r7
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r17 = 0
            goto L169
        L55:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L74
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L61:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L71
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r4 = r4 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L61
        L71:
            int r7 = r7 << r9
            r4 = r4 | r7
            r7 = r10
        L74:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L93
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L80:
            int r11 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto L90
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r11
            goto L80
        L90:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r11
        L93:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto Lb2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L9f:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto Laf
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r9 = r9 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L9f
        Laf:
            int r10 = r10 << r11
            r9 = r9 | r10
            r10 = r12
        Lb2:
            int r11 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto Ld1
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        Lbe:
            int r13 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto Lce
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto Lbe
        Lce:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        Ld1:
            int r12 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto Lf0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        Ldd:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto Led
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto Ldd
        Led:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        Lf0:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto L10f
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        Lfc:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L10c
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto Lfc
        L10c:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L10f:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L130
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L11b:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L12c
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L11b
        L12c:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L130:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L153
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L13c:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r5) goto L14e
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L13c
        L14e:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L153:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int r16 = r4 + r4
            int r16 = r16 + r7
            int[] r7 = new int[r13]
            r13 = r12
            r12 = r9
            r9 = r13
            r13 = r10
            r17 = r14
            r10 = r16
            r16 = r7
            r7 = r4
            r4 = r15
        L169:
            sun.misc.Unsafe r14 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zzb
            java.lang.Object[] r15 = r0.zze()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r18 = r0.zza()
            java.lang.Class r3 = r18.getClass()
            int r18 = r17 + r9
            int r9 = r11 + r11
            int r11 = r11 * 3
            int[] r11 = new int[r11]
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r21 = r17
            r22 = r18
            r19 = 0
            r20 = 0
        L189:
            if (r4 >= r2) goto L3f6
            int r23 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L1b1
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = r23
            r23 = 13
        L199:
            int r24 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r5) goto L1ab
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r23
            r4 = r4 | r8
            int r23 = r23 + 13
            r8 = r24
            goto L199
        L1ab:
            int r8 = r8 << r23
            r4 = r4 | r8
            r8 = r24
            goto L1b3
        L1b1:
            r8 = r23
        L1b3:
            int r23 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r5) goto L1d9
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r6 = r23
            r23 = 13
        L1c1:
            int r25 = r6 + 1
            char r6 = r1.charAt(r6)
            if (r6 < r5) goto L1d3
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r23
            r8 = r8 | r6
            int r23 = r23 + 13
            r6 = r25
            goto L1c1
        L1d3:
            int r6 = r6 << r23
            r8 = r8 | r6
            r6 = r25
            goto L1db
        L1d9:
            r6 = r23
        L1db:
            r5 = r8 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L1e5
            int r5 = r19 + 1
            r16[r19] = r20
            r19 = r5
        L1e5:
            r5 = r8 & 255(0xff, float:3.57E-43)
            r25 = r0
            r0 = r8 & 2048(0x800, float:2.87E-42)
            r26 = r0
            r0 = 51
            if (r5 < r0) goto L2a8
            int r0 = r6 + 1
            char r6 = r1.charAt(r6)
            r27 = r0
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r0) goto L225
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r30 = r27
            r27 = r6
            r6 = r30
            r30 = 13
        L208:
            int r31 = r6 + 1
            char r6 = r1.charAt(r6)
            if (r6 < r0) goto L21e
            r0 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r30
            r27 = r27 | r0
            int r30 = r30 + 13
            r6 = r31
            r0 = 55296(0xd800, float:7.7486E-41)
            goto L208
        L21e:
            int r0 = r6 << r30
            r6 = r27 | r0
            r0 = r31
            goto L227
        L225:
            r0 = r27
        L227:
            r27 = r0
            int r0 = r5 + (-51)
            r30 = r2
            r2 = 9
            if (r0 == r2) goto L235
            r2 = 17
            if (r0 != r2) goto L237
        L235:
            r2 = 1
            goto L257
        L237:
            r2 = 12
            if (r0 != r2) goto L254
            int r0 = r25.zzc()
            r2 = 1
            if (r0 == r2) goto L247
            if (r26 == 0) goto L245
            goto L247
        L245:
            r0 = 0
            goto L264
        L247:
            int r0 = r10 + 1
            int r24 = r20 / 3
            int r24 = r24 + r24
            int r24 = r24 + 1
            r10 = r15[r10]
            r9[r24] = r10
        L253:
            r10 = r0
        L254:
            r0 = r26
            goto L264
        L257:
            int r0 = r10 + 1
            int r24 = r20 / 3
            int r24 = r24 + r24
            int r28 = r24 + 1
            r2 = r15[r10]
            r9[r28] = r2
            goto L253
        L264:
            int r6 = r6 + r6
            r2 = r15[r6]
            r26 = r0
            boolean r0 = r2 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L273
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
        L26f:
            r28 = r6
            r0 = r7
            goto L27c
        L273:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r2 = zzz(r3, r2)
            r15[r6] = r2
            goto L26f
        L27c:
            long r6 = r14.objectFieldOffset(r2)
            int r2 = (int) r6
            int r6 = r28 + 1
            r7 = r15[r6]
            r31 = r0
            boolean r0 = r7 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L28e
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L296
        L28e:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = zzz(r3, r7)
            r15[r6] = r7
        L296:
            long r6 = r14.objectFieldOffset(r7)
            int r0 = (int) r6
            r7 = r1
            r6 = r27
            r23 = 55296(0xd800, float:7.7486E-41)
            r28 = 0
            r1 = r0
        L2a4:
            r0 = r26
            goto L3ba
        L2a8:
            r30 = r2
            r31 = r7
            int r0 = r10 + 1
            r2 = r15[r10]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r2 = zzz(r3, r2)
            r7 = 9
            if (r5 == r7) goto L2be
            r7 = 17
            if (r5 != r7) goto L2c3
        L2be:
            r28 = r0
            r0 = 1
            goto L336
        L2c3:
            r7 = 27
            if (r5 == r7) goto L328
            r7 = 49
            if (r5 != r7) goto L2d2
            int r10 = r10 + 2
            r28 = r0
            r0 = 1
            goto L32d
        L2d2:
            r7 = 12
            if (r5 == r7) goto L30b
            r7 = 30
            if (r5 == r7) goto L30b
            r7 = 44
            if (r5 != r7) goto L2df
            goto L30b
        L2df:
            r7 = 50
            if (r5 != r7) goto L307
            int r7 = r10 + 2
            int r28 = r21 + 1
            r16[r21] = r20
            int r21 = r20 / 3
            r0 = r15[r0]
            int r21 = r21 + r21
            r9[r21] = r0
            if (r26 == 0) goto L300
            int r21 = r21 + 1
            int r0 = r10 + 3
            r7 = r15[r7]
            r9[r21] = r7
            r10 = r0
            r7 = r1
            r21 = r28
            goto L343
        L300:
            r10 = r7
            r21 = r28
            r26 = 0
        L305:
            r7 = r1
            goto L343
        L307:
            r28 = r0
            r0 = 1
            goto L340
        L30b:
            int r7 = r25.zzc()
            r28 = r0
            r0 = 1
            if (r7 == r0) goto L31d
            if (r26 == 0) goto L317
            goto L31d
        L317:
            r7 = r1
            r10 = r28
            r26 = 0
            goto L343
        L31d:
            int r10 = r10 + 2
            int r7 = r20 / 3
            int r7 = r7 + r7
            int r7 = r7 + r0
            r24 = r15[r28]
            r9[r7] = r24
            goto L305
        L328:
            r28 = r0
            r0 = 1
            int r10 = r10 + 2
        L32d:
            int r7 = r20 / 3
            int r7 = r7 + r7
            int r7 = r7 + r0
            r24 = r15[r28]
            r9[r7] = r24
            goto L305
        L336:
            int r7 = r20 / 3
            int r7 = r7 + r7
            int r7 = r7 + r0
            java.lang.Class r10 = r2.getType()
            r9[r7] = r10
        L340:
            r7 = r1
            r10 = r28
        L343:
            long r0 = r14.objectFieldOffset(r2)
            int r2 = (int) r0
            r0 = r8 & 4096(0x1000, float:5.74E-42)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 == 0) goto L3a5
            r0 = 17
            if (r5 > r0) goto L3a5
            int r0 = r6 + 1
            char r1 = r7.charAt(r6)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r6) goto L378
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r23 = 13
        L362:
            int r28 = r0 + 1
            char r0 = r7.charAt(r0)
            if (r0 < r6) goto L374
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r23
            r1 = r1 | r0
            int r23 = r23 + 13
            r0 = r28
            goto L362
        L374:
            int r0 = r0 << r23
            r1 = r1 | r0
            goto L37a
        L378:
            r28 = r0
        L37a:
            int r0 = r31 + r31
            int r23 = r1 / 32
            int r0 = r0 + r23
            r6 = r15[r0]
            r29 = r0
            boolean r0 = r6 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L38d
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
        L38a:
            r29 = r1
            goto L396
        L38d:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.reflect.Field r6 = zzz(r3, r6)
            r15[r29] = r6
            goto L38a
        L396:
            long r0 = r14.objectFieldOffset(r6)
            int r1 = (int) r0
            int r0 = r29 % 32
            r6 = r28
            r23 = 55296(0xd800, float:7.7486E-41)
            r28 = r0
            goto L3aa
        L3a5:
            r23 = 55296(0xd800, float:7.7486E-41)
            r28 = 0
        L3aa:
            r0 = 18
            if (r5 < r0) goto L2a4
            r0 = 49
            if (r5 > r0) goto L2a4
            int r0 = r22 + 1
            r16[r22] = r2
            r22 = r0
            goto L2a4
        L3ba:
            int r26 = r20 + 1
            r11[r20] = r4
            int r4 = r20 + 2
            r27 = r0
            r0 = r8 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L3c9
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L3ca
        L3c9:
            r0 = 0
        L3ca:
            r8 = r8 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L3d1
            r8 = 268435456(0x10000000, float:2.524355E-29)
            goto L3d2
        L3d1:
            r8 = 0
        L3d2:
            if (r27 == 0) goto L3d7
            r27 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L3d9
        L3d7:
            r27 = 0
        L3d9:
            int r5 = r5 << 20
            r0 = r0 | r8
            r0 = r0 | r27
            r0 = r0 | r5
            r0 = r0 | r2
            r11[r26] = r0
            int r20 = r20 + 3
            int r0 = r28 << 20
            r0 = r0 | r1
            r11[r4] = r0
            r4 = r6
            r1 = r7
            r0 = r25
            r2 = r30
            r7 = r31
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L189
        L3f6:
            r25 = r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r14 = r25.zza()
            r15 = 0
            r19 = r34
            r20 = r35
            r21 = r36
            r22 = r37
            r23 = r38
            r10 = r11
            r11 = r9
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r9
        L410:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmt r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzmt) r0
            r0 = 0
            throw r0
    }

    private static double zzm(java.lang.Object r0, long r1) {
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r0, r1)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            return r0
    }

    private static float zzn(java.lang.Object r0, long r1) {
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r0, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
    }

    private static int zzo(java.lang.Object r0, long r1) {
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    private final int zzp(int r2) {
            r1 = this;
            int[] r0 = r1.zzc
            int r2 = r2 + 2
            r2 = r0[r2]
            return r2
    }

    private final int zzq(int r6, int r7) {
            r5 = this;
            int[] r0 = r5.zzc
            int r0 = r0.length
            int r0 = r0 / 3
            r1 = -1
            int r0 = r0 + r1
        L7:
            if (r7 > r0) goto L1e
            int r2 = r0 + r7
            int r2 = r2 >>> 1
            int r3 = r2 * 3
            int[] r4 = r5.zzc
            r4 = r4[r3]
            if (r6 != r4) goto L16
            return r3
        L16:
            if (r6 >= r4) goto L1b
            int r0 = r2 + (-1)
            goto L7
        L1b:
            int r7 = r2 + 1
            goto L7
        L1e:
            return r1
    }

    private static int zzr(int r0) {
            int r0 = r0 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    private final int zzs(int r2) {
            r1 = this;
            int[] r0 = r1.zzc
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
    }

    private static long zzt(java.lang.Object r0, long r1) {
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzku zzu(int r2) {
            r1 = this;
            int r2 = r2 / 3
            int r2 = r2 + r2
            java.lang.Object[] r0 = r1.zzd
            int r2 = r2 + 1
            r2 = r0[r2]
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzku r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzku) r2
            return r2
    }

    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi zzv(int r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.zzd
            int r4 = r4 / 3
            int r4 = r4 + r4
            r1 = r0[r4]
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi) r1
            if (r1 == 0) goto Lc
            return r1
        Lc:
            int r1 = r4 + 1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf.zza()
            r0 = r0[r1]
            java.lang.Class r0 = (java.lang.Class) r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r0 = r2.zzb(r0)
            java.lang.Object[] r1 = r3.zzd
            r1[r4] = r0
            return r0
    }

    private final java.lang.Object zzw(int r2) {
            r1 = this;
            int r2 = r2 / 3
            java.lang.Object[] r0 = r1.zzd
            int r2 = r2 + r2
            r2 = r0[r2]
            return r2
    }

    private final java.lang.Object zzx(java.lang.Object r4, int r5) {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r0 = r3.zzv(r5)
            int r1 = r3.zzs(r5)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            boolean r5 = r3.zzI(r4, r5)
            if (r5 != 0) goto L17
            java.lang.Object r4 = r0.zze()
            return r4
        L17:
            long r1 = (long) r1
            sun.misc.Unsafe r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zzb
            java.lang.Object r4 = r5.getObject(r4, r1)
            boolean r5 = zzL(r4)
            if (r5 == 0) goto L25
            return r4
        L25:
            java.lang.Object r5 = r0.zze()
            if (r4 == 0) goto L2e
            r0.zzg(r5, r4)
        L2e:
            return r5
    }

    private final java.lang.Object zzy(java.lang.Object r4, int r5, int r6) {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r0 = r3.zzv(r6)
            boolean r5 = r3.zzM(r4, r5, r6)
            if (r5 != 0) goto Lf
            java.lang.Object r4 = r0.zze()
            return r4
        Lf:
            sun.misc.Unsafe r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zzb
            int r6 = r3.zzs(r6)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r1
            long r1 = (long) r6
            java.lang.Object r4 = r5.getObject(r4, r1)
            boolean r5 = zzL(r4)
            if (r5 == 0) goto L25
            return r4
        L25:
            java.lang.Object r5 = r0.zze()
            if (r4 == 0) goto L2e
            r0.zzg(r5, r4)
        L2e:
            return r5
    }

    private static java.lang.reflect.Field zzz(java.lang.Class r5, java.lang.String r6) {
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch: java.lang.NoSuchFieldException -> L5
            return r5
        L5:
            java.lang.reflect.Field[] r0 = r5.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L1d
            r3 = r0[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L1a
            return r3
        L1a:
            int r2 = r2 + 1
            goto Lb
        L1d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Field "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = " for "
            r2.append(r6)
            r2.append(r5)
            java.lang.String r5 = " not found. Known fields are "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi
    public final int zza(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            sun.misc.Unsafe r6 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zzb
            r7 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = 0
            r9 = 0
        L10:
            int[] r5 = r0.zzc
            int r5 = r5.length
            if (r2 >= r5) goto L726
            int r5 = r0.zzs(r2)
            int r10 = zzr(r5)
            int[] r11 = r0.zzc
            int r12 = r2 + 2
            r13 = r11[r2]
            r11 = r11[r12]
            r12 = r11 & r8
            r14 = 17
            r15 = 1
            if (r10 > r14) goto L3e
            if (r12 == r3) goto L39
            if (r12 != r8) goto L32
            r4 = 0
            goto L38
        L32:
            long r3 = (long) r12
            int r3 = r6.getInt(r1, r3)
            r4 = r3
        L38:
            r3 = r12
        L39:
            int r11 = r11 >>> 20
            int r11 = r15 << r11
            goto L3f
        L3e:
            r11 = 0
        L3f:
            r5 = r5 & r8
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkh r12 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkh.zzJ
            int r12 = r12.zza()
            if (r10 < r12) goto L4d
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkh r12 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkh.zzW
            r12.zza()
        L4d:
            r14 = r9
            long r8 = (long) r5
            r16 = 63
            switch(r10) {
                case 0: goto L70a;
                case 1: goto L6fb;
                case 2: goto L6e4;
                case 3: goto L6cd;
                case 4: goto L6b5;
                case 5: goto L6a6;
                case 6: goto L697;
                case 7: goto L687;
                case 8: goto L65b;
                case 9: goto L646;
                case 10: goto L627;
                case 11: goto L611;
                case 12: goto L5fa;
                case 13: goto L5ea;
                case 14: goto L5da;
                case 15: goto L5bf;
                case 16: goto L59a;
                case 17: goto L583;
                case 18: goto L577;
                case 19: goto L56b;
                case 20: goto L548;
                case 21: goto L52c;
                case 22: goto L510;
                case 23: goto L504;
                case 24: goto L4f8;
                case 25: goto L4dd;
                case 26: goto L478;
                case 27: goto L436;
                case 28: goto L403;
                case 29: goto L3e9;
                case 30: goto L3cf;
                case 31: goto L3c3;
                case 32: goto L3b7;
                case 33: goto L39d;
                case 34: goto L37e;
                case 35: goto L366;
                case 36: goto L34e;
                case 37: goto L336;
                case 38: goto L31e;
                case 39: goto L306;
                case 40: goto L2ee;
                case 41: goto L2d6;
                case 42: goto L2bc;
                case 43: goto L2a5;
                case 44: goto L28e;
                case 45: goto L277;
                case 46: goto L260;
                case 47: goto L249;
                case 48: goto L22d;
                case 49: goto L203;
                case 50: goto L1d3;
                case 51: goto L1c5;
                case 52: goto L1b7;
                case 53: goto L1a1;
                case 54: goto L18b;
                case 55: goto L174;
                case 56: goto L166;
                case 57: goto L158;
                case 58: goto L149;
                case 59: goto L11e;
                case 60: goto L10a;
                case 61: goto Lec;
                case 62: goto Ld7;
                case 63: goto Lc1;
                case 64: goto Lb2;
                case 65: goto La3;
                case 66: goto L89;
                case 67: goto L6e;
                case 68: goto L56;
                default: goto L54;
            }
        L54:
            goto L71c
        L56:
            boolean r5 = r0.zzM(r1, r13, r2)
            if (r5 == 0) goto L71c
            java.lang.Object r5 = r6.getObject(r1, r8)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw) r5
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r8 = r0.zzv(r2)
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzw(r13, r5, r8)
        L6a:
            int r9 = r14 + r5
            goto L71d
        L6e:
            boolean r5 = r0.zzM(r1, r13, r2)
            if (r5 == 0) goto L71c
            int r5 = r13 << 3
            long r8 = zzt(r1, r8)
            long r10 = r8 + r8
            long r8 = r8 >> r16
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            long r8 = r8 ^ r10
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzA(r8)
        L87:
            int r5 = r5 + r8
            goto L6a
        L89:
            boolean r5 = r0.zzM(r1, r13, r2)
            if (r5 == 0) goto L71c
            int r5 = r13 << 3
            int r8 = zzo(r1, r8)
            int r9 = r8 + r8
            int r8 = r8 >> 31
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            r8 = r8 ^ r9
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r8)
            goto L87
        La3:
            boolean r5 = r0.zzM(r1, r13, r2)
            if (r5 == 0) goto L71c
            int r5 = r13 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
        Laf:
            int r5 = r5 + 8
            goto L6a
        Lb2:
            boolean r5 = r0.zzM(r1, r13, r2)
            if (r5 == 0) goto L71c
            int r5 = r13 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
        Lbe:
            int r5 = r5 + 4
            goto L6a
        Lc1:
            boolean r5 = r0.zzM(r1, r13, r2)
            if (r5 == 0) goto L71c
            int r5 = r13 << 3
            int r8 = zzo(r1, r8)
            long r8 = (long) r8
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzA(r8)
            goto L87
        Ld7:
            boolean r5 = r0.zzM(r1, r13, r2)
            if (r5 == 0) goto L71c
            int r5 = r13 << 3
            int r8 = zzo(r1, r8)
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r8)
            goto L87
        Lec:
            boolean r5 = r0.zzM(r1, r13, r2)
            if (r5 == 0) goto L71c
            int r5 = r13 << 3
            java.lang.Object r8 = r6.getObject(r1, r8)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r8 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo) r8
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            int r8 = r8.zzd()
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r8)
        L106:
            int r9 = r9 + r8
            int r5 = r5 + r9
            goto L6a
        L10a:
            boolean r5 = r0.zzM(r1, r13, r2)
            if (r5 == 0) goto L71c
            java.lang.Object r5 = r6.getObject(r1, r8)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r8 = r0.zzv(r2)
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzh(r13, r5, r8)
            goto L6a
        L11e:
            boolean r5 = r0.zzM(r1, r13, r2)
            if (r5 == 0) goto L71c
            int r5 = r13 << 3
            java.lang.Object r8 = r6.getObject(r1, r8)
            boolean r9 = r8 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo
            if (r9 == 0) goto L13d
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r8 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo) r8
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            int r8 = r8.zzd()
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r8)
            goto L106
        L13d:
            java.lang.String r8 = (java.lang.String) r8
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzy(r8)
            goto L87
        L149:
            boolean r5 = r0.zzM(r1, r13, r2)
            if (r5 == 0) goto L71c
            int r5 = r13 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            int r5 = r5 + r15
            goto L6a
        L158:
            boolean r5 = r0.zzM(r1, r13, r2)
            if (r5 == 0) goto L71c
            int r5 = r13 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            goto Lbe
        L166:
            boolean r5 = r0.zzM(r1, r13, r2)
            if (r5 == 0) goto L71c
            int r5 = r13 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            goto Laf
        L174:
            boolean r5 = r0.zzM(r1, r13, r2)
            if (r5 == 0) goto L71c
            int r5 = r13 << 3
            int r8 = zzo(r1, r8)
            long r8 = (long) r8
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzA(r8)
            goto L87
        L18b:
            boolean r5 = r0.zzM(r1, r13, r2)
            if (r5 == 0) goto L71c
            int r5 = r13 << 3
            long r8 = zzt(r1, r8)
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzA(r8)
            goto L87
        L1a1:
            boolean r5 = r0.zzM(r1, r13, r2)
            if (r5 == 0) goto L71c
            int r5 = r13 << 3
            long r8 = zzt(r1, r8)
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzA(r8)
            goto L87
        L1b7:
            boolean r5 = r0.zzM(r1, r13, r2)
            if (r5 == 0) goto L71c
            int r5 = r13 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            goto Lbe
        L1c5:
            boolean r5 = r0.zzM(r1, r13, r2)
            if (r5 == 0) goto L71c
            int r5 = r13 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            goto Laf
        L1d3:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.lang.Object r8 = r0.zzw(r2)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlq r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlq) r5
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlp r8 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlp) r8
            boolean r8 = r5.isEmpty()
            if (r8 != 0) goto L71c
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            boolean r8 = r5.hasNext()
            if (r8 != 0) goto L1f5
            goto L71c
        L1f5:
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r1.getKey()
            r1.getValue()
            r1 = 0
            throw r1
        L203:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r8 = r0.zzv(r2)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza
            int r9 = r5.size()
            if (r9 != 0) goto L217
            r11 = 0
            goto L229
        L217:
            r10 = 0
            r11 = 0
        L219:
            if (r10 >= r9) goto L229
            java.lang.Object r15 = r5.get(r10)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r15 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw) r15
            int r15 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzw(r13, r15, r8)
            int r11 = r11 + r15
            int r10 = r10 + 1
            goto L219
        L229:
            int r9 = r14 + r11
            goto L71d
        L22d:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzj(r5)
            if (r5 <= 0) goto L71c
            int r8 = r13 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
        L243:
            int r8 = r8 + r9
            int r8 = r8 + r5
        L245:
            int r9 = r14 + r8
            goto L71d
        L249:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzi(r5)
            if (r5 <= 0) goto L71c
            int r8 = r13 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            goto L243
        L260:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zze(r5)
            if (r5 <= 0) goto L71c
            int r8 = r13 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            goto L243
        L277:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzc(r5)
            if (r5 <= 0) goto L71c
            int r8 = r13 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            goto L243
        L28e:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza(r5)
            if (r5 <= 0) goto L71c
            int r8 = r13 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            goto L243
        L2a5:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzk(r5)
            if (r5 <= 0) goto L71c
            int r8 = r13 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            goto L243
        L2bc:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza
            int r5 = r5.size()
            if (r5 <= 0) goto L71c
            int r8 = r13 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            goto L243
        L2d6:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzc(r5)
            if (r5 <= 0) goto L71c
            int r8 = r13 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            goto L243
        L2ee:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zze(r5)
            if (r5 <= 0) goto L71c
            int r8 = r13 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            goto L243
        L306:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzf(r5)
            if (r5 <= 0) goto L71c
            int r8 = r13 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            goto L243
        L31e:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzl(r5)
            if (r5 <= 0) goto L71c
            int r8 = r13 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            goto L243
        L336:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzg(r5)
            if (r5 <= 0) goto L71c
            int r8 = r13 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            goto L243
        L34e:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzc(r5)
            if (r5 <= 0) goto L71c
            int r8 = r13 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            goto L243
        L366:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zze(r5)
            if (r5 <= 0) goto L71c
            int r8 = r13 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r8)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            goto L243
        L37e:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza
            int r8 = r5.size()
            if (r8 != 0) goto L38f
        L38c:
            r5 = 0
            goto L6a
        L38f:
            int r9 = r13 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzj(r5)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r9)
        L399:
            int r8 = r8 * r9
            goto L87
        L39d:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza
            int r8 = r5.size()
            if (r8 != 0) goto L3ac
            goto L38c
        L3ac:
            int r9 = r13 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzi(r5)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r9)
            goto L399
        L3b7:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzd(r13, r5, r7)
            goto L6a
        L3c3:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzb(r13, r5, r7)
            goto L6a
        L3cf:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza
            int r8 = r5.size()
            if (r8 != 0) goto L3de
            goto L38c
        L3de:
            int r9 = r13 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza(r5)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r9)
            goto L399
        L3e9:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza
            int r8 = r5.size()
            if (r8 != 0) goto L3f8
            goto L38c
        L3f8:
            int r9 = r13 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzk(r5)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r9)
            goto L399
        L403:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza
            int r8 = r5.size()
            if (r8 != 0) goto L414
            r8 = 0
            goto L245
        L414:
            int r9 = r13 << 3
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r9)
            int r8 = r8 * r9
            r9 = 0
        L41d:
            int r10 = r5.size()
            if (r9 >= r10) goto L245
            java.lang.Object r10 = r5.get(r9)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r10 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo) r10
            int r10 = r10.zzd()
            int r11 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r10)
            int r11 = r11 + r10
            int r8 = r8 + r11
            int r9 = r9 + 1
            goto L41d
        L436:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r8 = r0.zzv(r2)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza
            int r9 = r5.size()
            if (r9 != 0) goto L44a
            r10 = 0
            goto L474
        L44a:
            int r10 = r13 << 3
            int r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r10)
            int r10 = r10 * r9
            r11 = 0
        L453:
            if (r11 >= r9) goto L474
            java.lang.Object r13 = r5.get(r11)
            boolean r15 = r13 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzlh
            if (r15 == 0) goto L46a
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlh r13 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlh) r13
            int r13 = r13.zza()
            int r15 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r13)
            int r15 = r15 + r13
            int r10 = r10 + r15
            goto L471
        L46a:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r13 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw) r13
            int r13 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzx(r13, r8)
            int r10 = r10 + r13
        L471:
            int r11 = r11 + 1
            goto L453
        L474:
            int r9 = r14 + r10
            goto L71d
        L478:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza
            int r8 = r5.size()
            if (r8 != 0) goto L488
        L486:
            r9 = 0
            goto L4da
        L488:
            int r9 = r13 << 3
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r9)
            int r9 = r9 * r8
            boolean r10 = r5 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzli
            if (r10 == 0) goto L4b8
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzli r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzli) r5
            r10 = 0
        L497:
            if (r10 >= r8) goto L4da
            java.lang.Object r11 = r5.zza()
            boolean r13 = r11 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo
            if (r13 == 0) goto L4ae
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r11 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo) r11
            int r11 = r11.zzd()
            int r13 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r11)
            int r13 = r13 + r11
            int r9 = r9 + r13
            goto L4b5
        L4ae:
            java.lang.String r11 = (java.lang.String) r11
            int r11 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzy(r11)
            int r9 = r9 + r11
        L4b5:
            int r10 = r10 + 1
            goto L497
        L4b8:
            r10 = 0
        L4b9:
            if (r10 >= r8) goto L4da
            java.lang.Object r11 = r5.get(r10)
            boolean r13 = r11 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo
            if (r13 == 0) goto L4d0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r11 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo) r11
            int r11 = r11.zzd()
            int r13 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r11)
            int r13 = r13 + r11
            int r9 = r9 + r13
            goto L4d7
        L4d0:
            java.lang.String r11 = (java.lang.String) r11
            int r11 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzy(r11)
            int r9 = r9 + r11
        L4d7:
            int r10 = r10 + 1
            goto L4b9
        L4da:
            int r9 = r9 + r14
            goto L71d
        L4dd:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza
            int r5 = r5.size()
            if (r5 != 0) goto L4ed
            goto L38c
        L4ed:
            int r8 = r13 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r8)
            int r8 = r8 + r15
            int r5 = r5 * r8
            goto L6a
        L4f8:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzb(r13, r5, r7)
            goto L6a
        L504:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzd(r13, r5, r7)
            goto L6a
        L510:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza
            int r8 = r5.size()
            if (r8 != 0) goto L520
            goto L38c
        L520:
            int r9 = r13 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzf(r5)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r9)
            goto L399
        L52c:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza
            int r8 = r5.size()
            if (r8 != 0) goto L53c
            goto L38c
        L53c:
            int r9 = r13 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzl(r5)
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r9)
            goto L399
        L548:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza
            int r8 = r5.size()
            if (r8 != 0) goto L558
            goto L486
        L558:
            int r8 = r13 << 3
            int r9 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzg(r5)
            int r5 = r5.size()
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r8)
            int r5 = r5 * r8
            int r9 = r9 + r5
            goto L4da
        L56b:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzb(r13, r5, r7)
            goto L6a
        L577:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzd(r13, r5, r7)
            goto L6a
        L583:
            r5 = r11
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L71c
            java.lang.Object r5 = r6.getObject(r1, r8)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw) r5
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r8 = r0.zzv(r2)
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzw(r13, r5, r8)
            goto L6a
        L59a:
            r5 = r11
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5bb
            int r0 = r13 << 3
            long r8 = r6.getLong(r1, r8)
            long r10 = r8 + r8
            long r8 = r8 >> r16
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r0)
            long r8 = r8 ^ r10
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzA(r8)
        L5b4:
            int r0 = r0 + r5
        L5b5:
            int r9 = r14 + r0
            r0 = r17
            goto L71d
        L5bb:
            r0 = r17
            goto L71c
        L5bf:
            r5 = r11
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5bb
            int r0 = r13 << 3
            int r5 = r6.getInt(r1, r8)
            int r8 = r5 + r5
            int r5 = r5 >> 31
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r0)
            r5 = r5 ^ r8
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            goto L5b4
        L5da:
            r5 = r11
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5bb
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r0)
        L5e7:
            int r0 = r0 + 8
            goto L5b5
        L5ea:
            r5 = r11
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5bb
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r0)
        L5f7:
            int r0 = r0 + 4
            goto L5b5
        L5fa:
            r5 = r11
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5bb
            int r0 = r13 << 3
            int r5 = r6.getInt(r1, r8)
            long r8 = (long) r5
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r0)
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzA(r8)
            goto L5b4
        L611:
            r5 = r11
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5bb
            int r0 = r13 << 3
            int r5 = r6.getInt(r1, r8)
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r0)
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            goto L5b4
        L627:
            r5 = r11
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5bb
            int r0 = r13 << 3
            java.lang.Object r5 = r6.getObject(r1, r8)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo) r5
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r0)
            int r5 = r5.zzd()
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
        L642:
            int r8 = r8 + r5
            int r0 = r0 + r8
            goto L5b5
        L646:
            r5 = r11
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L71c
            java.lang.Object r5 = r6.getObject(r1, r8)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r8 = r0.zzv(r2)
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzh(r13, r5, r8)
            goto L6a
        L65b:
            r5 = r11
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5bb
            int r0 = r13 << 3
            java.lang.Object r5 = r6.getObject(r1, r8)
            boolean r8 = r5 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo
            if (r8 == 0) goto L67b
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo) r5
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r0)
            int r5 = r5.zzd()
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r5)
            goto L642
        L67b:
            java.lang.String r5 = (java.lang.String) r5
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r0)
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzy(r5)
            goto L5b4
        L687:
            r5 = r11
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5bb
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r0)
            int r0 = r0 + r15
            goto L5b5
        L697:
            r5 = r11
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5bb
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r0)
            goto L5f7
        L6a6:
            r5 = r11
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5bb
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r0)
            goto L5e7
        L6b5:
            r5 = r11
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5bb
            int r0 = r13 << 3
            int r5 = r6.getInt(r1, r8)
            long r8 = (long) r5
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r0)
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzA(r8)
            goto L5b4
        L6cd:
            r5 = r11
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5bb
            int r0 = r13 << 3
            long r8 = r6.getLong(r1, r8)
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r0)
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzA(r8)
            goto L5b4
        L6e4:
            r5 = r11
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5bb
            int r0 = r13 << 3
            long r8 = r6.getLong(r1, r8)
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r0)
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzA(r8)
            goto L5b4
        L6fb:
            r5 = r11
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5bb
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r0)
            goto L5f7
        L70a:
            r5 = r11
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L71c
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjw.zzz(r1)
            int r1 = r1 + 8
            int r9 = r14 + r1
            goto L71d
        L71c:
            r9 = r14
        L71d:
            int r2 = r2 + 3
            r1 = r18
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L10
        L726:
            r14 = r9
            r1 = r18
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r1 = r1.zzc
            int r1 = r1.zza()
            int r9 = r14 + r1
            boolean r1 = r0.zzh
            if (r1 == 0) goto L788
            r1 = r18
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn) r1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg r1 = r1.zzb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r2 = r1.zza
            int r2 = r2.zzc()
            r3 = 0
        L744:
            if (r7 >= r2) goto L761
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r4 = r1.zza
            java.util.Map$Entry r4 = r4.zzg(r7)
            r5 = r4
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmm r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzmm) r5
            java.lang.Comparable r5 = r5.zza()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf) r5
            java.lang.Object r4 = r4.getValue()
            int r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg.zzb(r5, r4)
            int r3 = r3 + r4
            int r7 = r7 + 1
            goto L744
        L761:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r1 = r1.zza
            java.lang.Iterable r1 = r1.zzd()
            java.util.Iterator r1 = r1.iterator()
        L76b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L787
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf r4 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkf) r4
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg.zzb(r4, r2)
            int r3 = r3 + r2
            goto L76b
        L787:
            int r9 = r9 + r3
        L788:
            return r9
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi
    public final int zzb(java.lang.Object r9) {
            r8 = this;
            r0 = 0
            r1 = 0
        L2:
            int[] r2 = r8.zzc
            int r2 = r2.length
            if (r0 >= r2) goto L220
            int r2 = r8.zzs(r0)
            int[] r3 = r8.zzc
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            int r2 = zzr(r2)
            r3 = r3[r0]
            long r4 = (long) r4
            r6 = 37
            r7 = 32
            switch(r2) {
                case 0: goto L20e;
                case 1: goto L202;
                case 2: goto L1f8;
                case 3: goto L1ee;
                case 4: goto L1e6;
                case 5: goto L1dc;
                case 6: goto L1d4;
                case 7: goto L1c8;
                case 8: goto L1ba;
                case 9: goto L1ad;
                case 10: goto L1a1;
                case 11: goto L199;
                case 12: goto L191;
                case 13: goto L189;
                case 14: goto L17f;
                case 15: goto L177;
                case 16: goto L16d;
                case 17: goto L15e;
                case 18: goto L152;
                case 19: goto L152;
                case 20: goto L152;
                case 21: goto L152;
                case 22: goto L152;
                case 23: goto L152;
                case 24: goto L152;
                case 25: goto L152;
                case 26: goto L152;
                case 27: goto L152;
                case 28: goto L152;
                case 29: goto L152;
                case 30: goto L152;
                case 31: goto L152;
                case 32: goto L152;
                case 33: goto L152;
                case 34: goto L152;
                case 35: goto L152;
                case 36: goto L152;
                case 37: goto L152;
                case 38: goto L152;
                case 39: goto L152;
                case 40: goto L152;
                case 41: goto L152;
                case 42: goto L152;
                case 43: goto L152;
                case 44: goto L152;
                case 45: goto L152;
                case 46: goto L152;
                case 47: goto L152;
                case 48: goto L152;
                case 49: goto L152;
                case 50: goto L146;
                case 51: goto L132;
                case 52: goto L120;
                case 53: goto L110;
                case 54: goto L100;
                case 55: goto Lf2;
                case 56: goto Le2;
                case 57: goto Ld4;
                case 58: goto Lc2;
                case 59: goto Lae;
                case 60: goto L9d;
                case 61: goto L8c;
                case 62: goto L7f;
                case 63: goto L72;
                case 64: goto L65;
                case 65: goto L56;
                case 66: goto L49;
                case 67: goto L34;
                case 68: goto L21;
                default: goto L1f;
            }
        L1f:
            goto L21c
        L21:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L21c
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r4)
            int r2 = r2.hashCode()
        L31:
            int r1 = r1 + r2
            goto L21c
        L34:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L21c
            int r1 = r1 * 53
            long r2 = zzt(r9, r4)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zzb
        L42:
            long r4 = r2 >>> r7
            long r2 = r2 ^ r4
            int r3 = (int) r2
            int r1 = r1 + r3
            goto L21c
        L49:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L21c
            int r1 = r1 * 53
            int r2 = zzo(r9, r4)
            goto L31
        L56:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L21c
            int r1 = r1 * 53
            long r2 = zzt(r9, r4)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zzb
            goto L42
        L65:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L21c
            int r1 = r1 * 53
            int r2 = zzo(r9, r4)
            goto L31
        L72:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L21c
            int r1 = r1 * 53
            int r2 = zzo(r9, r4)
            goto L31
        L7f:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L21c
            int r1 = r1 * 53
            int r2 = zzo(r9, r4)
            goto L31
        L8c:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L21c
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r4)
            int r2 = r2.hashCode()
            goto L31
        L9d:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L21c
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r4)
            int r2 = r2.hashCode()
            goto L31
        Lae:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L21c
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r4)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.hashCode()
            goto L31
        Lc2:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L21c
            int r1 = r1 * 53
            boolean r2 = zzN(r9, r4)
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zza(r2)
            goto L31
        Ld4:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L21c
            int r1 = r1 * 53
            int r2 = zzo(r9, r4)
            goto L31
        Le2:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L21c
            int r1 = r1 * 53
            long r2 = zzt(r9, r4)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zzb
            goto L42
        Lf2:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L21c
            int r1 = r1 * 53
            int r2 = zzo(r9, r4)
            goto L31
        L100:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L21c
            int r1 = r1 * 53
            long r2 = zzt(r9, r4)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zzb
            goto L42
        L110:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L21c
            int r1 = r1 * 53
            long r2 = zzt(r9, r4)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zzb
            goto L42
        L120:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L21c
            int r1 = r1 * 53
            float r2 = zzn(r9, r4)
            int r2 = java.lang.Float.floatToIntBits(r2)
            goto L31
        L132:
            boolean r2 = r8.zzM(r9, r3, r0)
            if (r2 == 0) goto L21c
            int r1 = r1 * 53
            double r2 = zzm(r9, r4)
            long r2 = java.lang.Double.doubleToLongBits(r2)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zzb
            goto L42
        L146:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r4)
            int r2 = r2.hashCode()
            goto L31
        L152:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r4)
            int r2 = r2.hashCode()
            goto L31
        L15e:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r4)
            if (r2 == 0) goto L16a
            int r6 = r2.hashCode()
        L16a:
            int r1 = r1 + r6
            goto L21c
        L16d:
            int r1 = r1 * 53
            long r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r9, r4)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zzb
            goto L42
        L177:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r9, r4)
            goto L31
        L17f:
            int r1 = r1 * 53
            long r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r9, r4)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zzb
            goto L42
        L189:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r9, r4)
            goto L31
        L191:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r9, r4)
            goto L31
        L199:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r9, r4)
            goto L31
        L1a1:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r4)
            int r2 = r2.hashCode()
            goto L31
        L1ad:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r4)
            if (r2 == 0) goto L16a
            int r6 = r2.hashCode()
            goto L16a
        L1ba:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r4)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.hashCode()
            goto L31
        L1c8:
            int r1 = r1 * 53
            boolean r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzw(r9, r4)
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zza(r2)
            goto L31
        L1d4:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r9, r4)
            goto L31
        L1dc:
            int r1 = r1 * 53
            long r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r9, r4)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zzb
            goto L42
        L1e6:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r9, r4)
            goto L31
        L1ee:
            int r1 = r1 * 53
            long r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r9, r4)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zzb
            goto L42
        L1f8:
            int r1 = r1 * 53
            long r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r9, r4)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zzb
            goto L42
        L202:
            int r1 = r1 * 53
            float r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzb(r9, r4)
            int r2 = java.lang.Float.floatToIntBits(r2)
            goto L31
        L20e:
            int r1 = r1 * 53
            double r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zza(r9, r4)
            long r2 = java.lang.Double.doubleToLongBits(r2)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zzb
            goto L42
        L21c:
            int r0 = r0 + 3
            goto L2
        L220:
            int r1 = r1 * 53
            r0 = r9
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r0 = r0.zzc
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            boolean r0 = r8.zzh
            if (r0 == 0) goto L23d
            int r1 = r1 * 53
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn r9 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn) r9
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg r9 = r9.zzb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r9 = r9.zza
            int r9 = r9.hashCode()
            int r1 = r1 + r9
        L23d:
            return r1
    }

    final int zzc(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjd r42) throws java.io.IOException {
            r36 = this;
            r0 = r36
            r2 = r37
            r3 = r38
            r4 = r40
            r6 = r42
            zzA(r2)
            sun.misc.Unsafe r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zzb
            r11 = 0
            r12 = -1
            r5 = r39
            r7 = -1
            r8 = 0
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r14 = 0
            r15 = 0
        L1a:
            r16 = 0
            if (r5 >= r4) goto Le8f
            int r15 = r5 + 1
            r5 = r3[r5]
            if (r5 >= 0) goto L2a
            int r15 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzi(r5, r3, r15, r6)
            int r5 = r6.zza
        L2a:
            r6 = r15
            r15 = r5
            int r5 = r15 >>> 3
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r13 = 3
            if (r5 <= r7) goto L42
            int r8 = r8 / r13
            int r7 = r0.zze
            if (r5 < r7) goto L4f
            int r7 = r0.zzf
            if (r5 > r7) goto L4f
            int r7 = r0.zzq(r5, r8)
            goto L50
        L42:
            int r7 = r0.zze
            if (r5 < r7) goto L4f
            int r7 = r0.zzf
            if (r5 > r7) goto L4f
            int r7 = r0.zzq(r5, r11)
            goto L50
        L4f:
            r7 = -1
        L50:
            if (r7 != r12) goto L67
            r10 = r42
            r12 = r0
            r25 = r1
            r26 = r9
            r27 = r14
            r13 = r15
            r8 = 0
            r19 = 0
            r0 = r41
            r15 = r2
            r14 = r3
            r9 = r5
            r3 = r6
            goto Le2d
        L67:
            r8 = r15 & 7
            int[] r12 = r0.zzc
            int r18 = r7 + 1
            r11 = r12[r18]
            int r13 = zzr(r11)
            r3 = r11 & r17
            long r3 = (long) r3
            r20 = r3
            r18 = 536870912(0x20000000, float:1.0842022E-19)
            r22 = 0
            java.lang.String r4 = "Protocol message had invalid UTF-8."
            java.lang.String r3 = ""
            r26 = r5
            java.lang.String r5 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r27 = r6
            r28 = 1
            r6 = 17
            if (r13 > r6) goto L4da
            int r6 = r7 + 2
            r6 = r12[r6]
            int r12 = r6 >>> 20
            int r12 = r28 << r12
            r6 = r6 & r17
            r25 = r12
            if (r6 == r9) goto Lb4
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r13
            if (r9 == r12) goto La8
            long r12 = (long) r9
            r1.putInt(r2, r12, r14)
            r12 = 1048575(0xfffff, float:1.469367E-39)
        La8:
            if (r6 != r12) goto Lac
            r9 = 0
            goto Lb1
        Lac:
            long r12 = (long) r6
            int r9 = r1.getInt(r2, r12)
        Lb1:
            r12 = r6
            r14 = r9
            goto Lb7
        Lb4:
            r30 = r13
            r12 = r9
        Lb7:
            switch(r30) {
                case 0: goto L4a1;
                case 1: goto L474;
                case 2: goto L44d;
                case 3: goto L44d;
                case 4: goto L426;
                case 5: goto L3e8;
                case 6: goto L3c4;
                case 7: goto L381;
                case 8: goto L21f;
                case 9: goto L1d5;
                case 10: goto L1b0;
                case 11: goto L426;
                case 12: goto L165;
                case 13: goto L3c4;
                case 14: goto L3e8;
                case 15: goto L13e;
                case 16: goto Lfc;
                default: goto Lba;
            }
        Lba:
            r6 = 3
            if (r8 != r6) goto Lea
            r14 = r14 | r25
            java.lang.Object r3 = r0.zzx(r2, r7)
            int r4 = r26 << 3
            r8 = r4 | 4
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r4 = r0.zzv(r7)
            r5 = r38
            r9 = r42
            r11 = r7
            r13 = r26
            r6 = r27
            r7 = r40
            int r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzl(r3, r4, r5, r6, r7, r8, r9)
            r7 = r5
            r0.zzF(r2, r11, r3)
            r5 = r4
            r3 = r7
            r6 = r9
            r8 = r11
        Le2:
            r9 = r12
            r7 = r13
            r11 = 0
            r12 = -1
            r4 = r40
            goto L1a
        Lea:
            r13 = r26
            r10 = r7
            r20 = r12
            r24 = r14
            r21 = r15
            r7 = r38
            r12 = r42
            r15 = r2
            r2 = r27
            goto L4c6
        Lfc:
            r9 = r42
            r11 = r7
            r13 = r26
            r4 = r27
            r7 = r38
            if (r8 != 0) goto L12c
            r14 = r14 | r25
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzk(r7, r4, r9)
            long r3 = r9.zzb
            long r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjs.zzc(r3)
            r3 = r20
            r1.putLong(r2, r3, r5)
            r32 = r2
            r2 = r1
            r1 = r32
            r3 = r2
            r2 = r1
            r1 = r3
            r4 = r40
            r3 = r7
            r5 = r8
        L124:
            r6 = r9
            r8 = r11
        L126:
            r9 = r12
            r7 = r13
        L128:
            r11 = 0
        L129:
            r12 = -1
            goto L1a
        L12c:
            r32 = r2
            r2 = r1
            r1 = r32
        L131:
            r10 = r11
        L132:
            r20 = r12
            r24 = r14
            r21 = r15
            r15 = r1
            r1 = r2
            r2 = r4
            r12 = r9
            goto L4c6
        L13e:
            r4 = r2
            r2 = r1
            r1 = r4
            r9 = r42
            r11 = r7
            r5 = r20
            r13 = r26
            r4 = r27
            r7 = r38
            if (r8 != 0) goto L131
            r14 = r14 | r25
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r7, r4, r9)
            int r4 = r9.zza
            int r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjs.zzb(r4)
            r2.putInt(r1, r5, r4)
            r4 = r2
            r2 = r1
            r1 = r4
            r4 = r40
            r5 = r3
            r3 = r7
            goto L124
        L165:
            r3 = r2
            r2 = r1
            r1 = r3
            r9 = r42
            r3 = r7
            r5 = r20
            r13 = r26
            r4 = r27
            r7 = r38
            if (r8 != 0) goto L1ae
            int r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r7, r4, r9)
            int r8 = r9.zza
            r39 = r4
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzku r4 = r0.zzu(r3)
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r11 & r16
            if (r11 == 0) goto L1a8
            if (r4 == 0) goto L1a8
            boolean r4 = r4.zza(r8)
            if (r4 == 0) goto L190
            goto L1a8
        L190:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r4 = zzd(r1)
            long r5 = (long) r8
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.zzj(r15, r5)
        L19c:
            r4 = r2
            r2 = r1
            r1 = r4
            r5 = r39
            r4 = r40
            r8 = r3
            r3 = r7
            r6 = r9
            goto L126
        L1a8:
            r14 = r14 | r25
            r2.putInt(r1, r5, r8)
            goto L19c
        L1ae:
            r10 = r3
            goto L132
        L1b0:
            r3 = r2
            r2 = r1
            r1 = r3
            r9 = r42
            r3 = r7
            r5 = r20
            r13 = r26
            r4 = r27
            r11 = 2
            r7 = r38
            if (r8 != r11) goto L1ae
            r14 = r14 | r25
            int r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zza(r7, r4, r9)
            java.lang.Object r8 = r9.zzc
            r2.putObject(r1, r5, r8)
            r5 = r2
            r2 = r1
            r1 = r5
            r8 = r3
            r5 = r4
            r3 = r7
            r6 = r9
            goto Le2
        L1d5:
            r3 = r2
            r2 = r1
            r1 = r3
            r9 = r42
            r3 = r7
            r13 = r26
            r4 = r27
            r11 = 2
            r7 = r38
            if (r8 != r11) goto L20c
            r14 = r14 | r25
            r5 = r1
            java.lang.Object r1 = r0.zzx(r5, r3)
            r6 = r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r2 = r0.zzv(r3)
            r8 = r9
            r9 = r6
            r6 = r8
            r8 = r3
            r3 = r7
            r7 = r5
            r5 = r40
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzm(r1, r2, r3, r4, r5, r6)
            r32 = r3
            r3 = r1
            r1 = r32
            r0.zzF(r7, r8, r3)
            r4 = r40
            r3 = r1
            r5 = r2
            r2 = r7
            r1 = r9
            goto L126
        L20c:
            r6 = r7
            r7 = r1
            r1 = r6
            r6 = r9
            r9 = r2
            r2 = r4
            r10 = r3
            r20 = r12
            r24 = r14
            r21 = r15
        L219:
            r12 = r6
            r15 = r7
            r7 = r1
        L21c:
            r1 = r9
            goto L4c6
        L21f:
            r6 = r42
            r9 = r1
            r24 = r14
            r13 = r26
            r10 = 2
            r1 = r38
            r32 = r7
            r7 = r2
            r2 = r27
            r33 = r12
            r12 = r32
            r34 = r20
            r20 = r33
            r21 = r15
            r14 = r34
            if (r8 != r10) goto L37b
            r8 = r11 & r18
            if (r8 == 0) goto L344
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r1, r2, r6)
            int r8 = r6.zza
            if (r8 < 0) goto L33e
            r5 = r24 | r25
            if (r8 != 0) goto L253
            r6.zzc = r3
            r18 = r5
            r11 = 0
            goto L318
        L253:
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzng.zza
            int r3 = r1.length
            int r10 = r3 - r2
            r11 = r2 | r8
            int r10 = r10 - r8
            r10 = r10 | r11
            if (r10 < 0) goto L31a
            int r3 = r2 + r8
            char[] r8 = new char[r8]
            r10 = 0
        L263:
            if (r2 >= r3) goto L277
            r11 = r1[r2]
            boolean r16 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzne.zzd(r11)
            if (r16 == 0) goto L277
            int r2 = r2 + 1
            int r16 = r10 + 1
            char r11 = (char) r11
            r8[r10] = r11
            r10 = r16
            goto L263
        L277:
            if (r2 >= r3) goto L309
            int r11 = r2 + 1
            r16 = r2
            r2 = r1[r16]
            boolean r18 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzne.zzd(r2)
            if (r18 == 0) goto L29f
            int r16 = r10 + 1
            char r2 = (char) r2
            r8[r10] = r2
            r2 = r11
        L28b:
            r10 = r16
            if (r2 >= r3) goto L277
            r11 = r1[r2]
            boolean r16 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzne.zzd(r11)
            if (r16 == 0) goto L277
            int r2 = r2 + 1
            int r16 = r10 + 1
            char r11 = (char) r11
            r8[r10] = r11
            goto L28b
        L29f:
            r18 = r5
            r5 = -32
            if (r2 >= r5) goto L2bc
            if (r11 >= r3) goto L2b6
            int r5 = r10 + 1
            int r16 = r16 + 2
            r11 = r1[r11]
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzne.zzc(r2, r11, r8, r10)
        L2b0:
            r10 = r5
            r2 = r16
            r5 = r18
            goto L277
        L2b6:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r1.<init>(r4)
            throw r1
        L2bc:
            r5 = -16
            if (r2 >= r5) goto L2dc
            int r5 = r3 + (-1)
            if (r11 >= r5) goto L2d6
            int r5 = r10 + 1
            int r22 = r16 + 2
            r11 = r1[r11]
            int r16 = r16 + 3
            r39 = r3
            r3 = r1[r22]
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzne.zzb(r2, r11, r3, r8, r10)
            r3 = r39
            goto L2b0
        L2d6:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r1.<init>(r4)
            throw r1
        L2dc:
            r39 = r3
            int r3 = r39 + (-2)
            if (r11 >= r3) goto L303
            int r3 = r16 + 2
            r23 = r1[r11]
            int r5 = r16 + 3
            r24 = r1[r3]
            int r3 = r16 + 4
            r25 = r1[r5]
            r22 = r2
            r26 = r8
            r27 = r10
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzne.zza(r22, r23, r24, r25, r26, r27)
            r2 = r26
            int r10 = r10 + 2
            r8 = r2
            r2 = r3
            r5 = r18
            r3 = r39
            goto L277
        L303:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r1.<init>(r4)
            throw r1
        L309:
            r39 = r3
            r18 = r5
            r2 = r8
            java.lang.String r3 = new java.lang.String
            r11 = 0
            r3.<init>(r2, r11, r10)
            r6.zzc = r3
            r2 = r39
        L318:
            r5 = r2
            goto L361
        L31a:
            r11 = 0
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r6 = 3
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r5[r11] = r3
            r5[r28] = r2
            r29 = 2
            r5[r29] = r4
            java.lang.String r2 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r2 = java.lang.String.format(r2, r5)
            r1.<init>(r2)
            throw r1
        L33e:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r1.<init>(r5)
            throw r1
        L344:
            r11 = 0
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r1, r2, r6)
            int r4 = r6.zza
            if (r4 < 0) goto L375
            r5 = r24 | r25
            if (r4 != 0) goto L356
            r6.zzc = r3
        L353:
            r18 = r5
            goto L318
        L356:
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zza
            r3.<init>(r1, r2, r4, r8)
            r6.zzc = r3
            int r2 = r2 + r4
            goto L353
        L361:
            java.lang.Object r2 = r6.zzc
            r9.putObject(r7, r14, r2)
            r4 = r40
            r3 = r1
            r2 = r7
            r1 = r9
            r8 = r12
            r7 = r13
            r14 = r18
            r9 = r20
            r15 = r21
            goto L129
        L375:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r1.<init>(r5)
            throw r1
        L37b:
            r15 = r7
            r10 = r12
            r7 = r1
            r12 = r6
            goto L21c
        L381:
            r6 = r42
            r9 = r1
            r24 = r14
            r13 = r26
            r11 = 0
            r1 = r38
            r32 = r7
            r7 = r2
            r2 = r27
            r33 = r12
            r12 = r32
            r34 = r20
            r20 = r33
            r21 = r15
            r14 = r34
            if (r8 != 0) goto L3c1
            r3 = r24 | r25
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzk(r1, r2, r6)
            r10 = r12
            long r11 = r6.zzb
            int r2 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r2 == 0) goto L3ad
            r2 = 1
            goto L3ae
        L3ad:
            r2 = 0
        L3ae:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzm(r7, r14, r2)
        L3b1:
            r4 = r40
            r14 = r3
            r2 = r7
            r8 = r10
            r7 = r13
            r15 = r21
            r11 = 0
            r12 = -1
            r3 = r1
            r1 = r9
            r9 = r20
            goto L1a
        L3c1:
            r10 = r12
            goto L219
        L3c4:
            r6 = r42
            r9 = r1
            r10 = r7
            r24 = r14
            r13 = r26
            r3 = 5
            r1 = r38
            r7 = r2
            r2 = r27
            r32 = r20
            r20 = r12
            r21 = r15
            r14 = r32
            if (r8 != r3) goto L219
            int r5 = r2 + 4
            r3 = r24 | r25
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzb(r1, r2)
            r9.putInt(r7, r14, r2)
            goto L3b1
        L3e8:
            r6 = r42
            r9 = r1
            r10 = r7
            r24 = r14
            r13 = r26
            r3 = 1
            r1 = r38
            r7 = r2
            r2 = r27
            r32 = r20
            r20 = r12
            r21 = r15
            r14 = r32
            if (r8 != r3) goto L41f
            int r8 = r2 + 8
            r11 = r24 | r25
            long r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzo(r1, r2)
            r12 = r42
            r2 = r7
            r3 = r14
            r7 = r1
            r1 = r9
            r1.putLong(r2, r3, r5)
            r4 = r40
            r3 = r7
            r5 = r8
            r8 = r10
            r14 = r11
        L417:
            r6 = r12
            r7 = r13
        L419:
            r9 = r20
            r15 = r21
            goto L128
        L41f:
            r12 = r7
            r7 = r1
            r1 = r12
            r12 = r6
        L423:
            r15 = r1
            goto L21c
        L426:
            r9 = r1
            r1 = r2
            r10 = r7
            r24 = r14
            r3 = r20
            r13 = r26
            r2 = r27
            r7 = r38
            r20 = r12
            r21 = r15
            r12 = r42
            if (r8 != 0) goto L423
            r14 = r24 | r25
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r7, r2, r12)
            int r2 = r12.zza
            r9.putInt(r1, r3, r2)
            r4 = r40
            r2 = r1
            r3 = r7
            r1 = r9
        L44b:
            r8 = r10
            goto L417
        L44d:
            r9 = r1
            r1 = r2
            r10 = r7
            r24 = r14
            r3 = r20
            r13 = r26
            r2 = r27
            r7 = r38
            r20 = r12
            r21 = r15
            r12 = r42
            if (r8 != 0) goto L423
            r14 = r24 | r25
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzk(r7, r2, r12)
            long r5 = r12.zzb
            r2 = r1
            r1 = r9
            r1.putLong(r2, r3, r5)
            r4 = r40
            r3 = r7
            r5 = r8
            goto L44b
        L474:
            r10 = r7
            r24 = r14
            r3 = r20
            r13 = r26
            r5 = 5
            r7 = r38
            r20 = r12
            r21 = r15
            r12 = r42
            r15 = r2
            r2 = r27
            if (r8 != r5) goto L4c6
            int r5 = r2 + 4
            r14 = r24 | r25
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzb(r7, r2)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzp(r15, r3, r2)
        L498:
            r4 = r40
            r3 = r7
            r8 = r10
            r6 = r12
            r7 = r13
            r2 = r15
            goto L419
        L4a1:
            r10 = r7
            r24 = r14
            r3 = r20
            r13 = r26
            r5 = 1
            r7 = r38
            r20 = r12
            r21 = r15
            r12 = r42
            r15 = r2
            r2 = r27
            if (r8 != r5) goto L4c6
            int r5 = r2 + 8
            r14 = r24 | r25
            long r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzo(r7, r2)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzo(r15, r3, r8)
            goto L498
        L4c6:
            r25 = r1
            r3 = r2
            r14 = r7
            r8 = r10
            r10 = r12
            r9 = r13
            r26 = r20
            r13 = r21
            r27 = r24
            r19 = 0
            r12 = r0
            r0 = r41
            goto Le2d
        L4da:
            r10 = r7
            r30 = r13
            r6 = r20
            r13 = r26
            r19 = 0
            r20 = r12
            r21 = r15
            r12 = r42
            r15 = r2
            r2 = 27
            r25 = 10
            r26 = r9
            r9 = r30
            if (r9 != r2) goto L550
            r2 = 2
            if (r8 != r2) goto L53c
            java.lang.Object r2 = r1.getObject(r15, r6)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzky r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzky) r2
            boolean r3 = r2.zzc()
            if (r3 != 0) goto L517
            int r3 = r2.size()
            if (r3 != 0) goto L50c
            r3 = 10
            goto L510
        L50c:
            int r25 = r3 + r3
            r3 = r25
        L510:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzky r2 = r2.zzd(r3)
            r1.putObject(r15, r6, r2)
        L517:
            r9 = r1
            r6 = r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r1 = r0.zzv(r10)
            r3 = r38
            r5 = r40
            r7 = r12
            r2 = r21
            r4 = r27
            r12 = r9
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zze(r1, r2, r3, r4, r5, r6, r7)
            r3 = r15
            r15 = r2
            r2 = r3
            r3 = r38
            r4 = r40
            r6 = r42
            r5 = r1
            r8 = r10
            r1 = r12
            r7 = r13
            r9 = r26
            goto L128
        L53c:
            r2 = r21
            r21 = r13
            r13 = r2
            r2 = r38
            r5 = r40
            r12 = r0
            r25 = r1
            r0 = r27
            r27 = r14
            r14 = r42
            goto Lba2
        L550:
            r12 = r1
            r2 = r21
            r1 = 49
            if (r9 > r1) goto Lbac
            r21 = r2
            long r1 = (long) r11
            sun.misc.Unsafe r11 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zzb
            java.lang.Object r18 = r11.getObject(r15, r6)
            r30 = r1
            r1 = r18
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzky r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzky) r1
            boolean r2 = r1.zzc()
            if (r2 != 0) goto L580
            int r2 = r1.size()
            if (r2 != 0) goto L575
            r2 = 10
            goto L579
        L575:
            int r25 = r2 + r2
            r2 = r25
        L579:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzky r1 = r1.zzd(r2)
            r11.putObject(r15, r6, r1)
        L580:
            r7 = r1
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            switch(r9) {
                case 18: goto Lb24;
                case 19: goto Lab8;
                case 20: goto La5c;
                case 21: goto La5c;
                case 22: goto La31;
                case 23: goto L9d5;
                case 24: goto L97a;
                case 25: goto L907;
                case 26: goto L822;
                case 27: goto L7f8;
                case 28: goto L77f;
                case 29: goto La31;
                case 30: goto L6c0;
                case 31: goto L97a;
                case 32: goto L9d5;
                case 33: goto L660;
                case 34: goto L5df;
                case 35: goto Lb24;
                case 36: goto Lab8;
                case 37: goto La5c;
                case 38: goto La5c;
                case 39: goto La31;
                case 40: goto L9d5;
                case 41: goto L97a;
                case 42: goto L907;
                case 43: goto La31;
                case 44: goto L6c0;
                case 45: goto L97a;
                case 46: goto L9d5;
                case 47: goto L660;
                case 48: goto L5df;
                default: goto L586;
            }
        L586:
            r6 = 3
            if (r8 != r6) goto L5cb
            r1 = r21 & (-8)
            r5 = r1 | 4
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r1 = r0.zzv(r10)
            r2 = r38
            r4 = r40
            r6 = r42
            r9 = r21
            r3 = r27
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzc(r1, r2, r3, r4, r5, r6)
            r11 = r3
            java.lang.Object r3 = r6.zzc
            r7.add(r3)
        L5a5:
            if (r8 >= r4) goto L5bd
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r8, r6)
            r39 = r1
            int r1 = r6.zza
            if (r9 != r1) goto L5bd
            r1 = r39
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzc(r1, r2, r3, r4, r5, r6)
            java.lang.Object r3 = r6.zzc
            r7.add(r3)
            goto L5a5
        L5bd:
            r5 = r4
            r4 = r11
            r25 = r12
            r21 = r13
            r27 = r14
            r12 = r0
            r14 = r6
            r0 = r8
            r13 = r9
            goto Lb8d
        L5cb:
            r2 = r21
            r21 = r13
            r13 = r2
            r2 = r38
            r5 = r40
            r25 = r12
            r4 = r27
            r12 = r0
            r27 = r14
            r14 = r42
            goto Lb8c
        L5df:
            r2 = r38
            r4 = r40
            r6 = r42
            r9 = r21
            r11 = r27
            r3 = 2
            if (r8 != r3) goto L625
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzll r7 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzll) r7
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r11, r6)
            int r5 = r6.zza
            int r5 = r5 + r3
        L5f7:
            if (r3 >= r5) goto L60f
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzk(r2, r3, r6)
            r25 = r12
            r21 = r13
            long r12 = r6.zzb
            long r12 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjs.zzc(r12)
            r7.zzf(r12)
            r13 = r21
            r12 = r25
            goto L5f7
        L60f:
            r25 = r12
            r21 = r13
            if (r3 != r5) goto L61f
        L615:
            r12 = r0
            r0 = r3
        L617:
            r5 = r4
            r13 = r9
            r4 = r11
            r27 = r14
        L61c:
            r14 = r6
            goto Lb8d
        L61f:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r2 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r2.<init>(r1)
            throw r2
        L625:
            r25 = r12
            r21 = r13
            if (r8 != 0) goto L657
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzll r7 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzll) r7
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzk(r2, r11, r6)
            long r12 = r6.zzb
            long r12 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjs.zzc(r12)
            r7.zzf(r12)
        L63c:
            if (r1 >= r4) goto L654
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r1, r6)
            int r5 = r6.zza
            if (r9 != r5) goto L654
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzk(r2, r3, r6)
            long r12 = r6.zzb
            long r12 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjs.zzc(r12)
            r7.zzf(r12)
            goto L63c
        L654:
            r12 = r0
            r0 = r1
            goto L617
        L657:
            r12 = r0
            r5 = r4
            r13 = r9
            r4 = r11
            r27 = r14
        L65d:
            r14 = r6
            goto Lb8c
        L660:
            r2 = r38
            r4 = r40
            r6 = r42
            r25 = r12
            r9 = r21
            r11 = r27
            r3 = 2
            r21 = r13
            if (r8 != r3) goto L695
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzks r7 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzks) r7
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r11, r6)
            int r5 = r6.zza
            int r5 = r5 + r3
        L67c:
            if (r3 >= r5) goto L68c
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r3, r6)
            int r8 = r6.zza
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjs.zzb(r8)
            r7.zzg(r8)
            goto L67c
        L68c:
            if (r3 != r5) goto L68f
            goto L615
        L68f:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r2 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r2.<init>(r1)
            throw r2
        L695:
            if (r8 != 0) goto L657
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzks r7 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzks) r7
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r11, r6)
            int r3 = r6.zza
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjs.zzb(r3)
            r7.zzg(r3)
        L6a8:
            if (r1 >= r4) goto L654
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r1, r6)
            int r5 = r6.zza
            if (r9 != r5) goto L654
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r3, r6)
            int r3 = r6.zza
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjs.zzb(r3)
            r7.zzg(r3)
            goto L6a8
        L6c0:
            r2 = r38
            r4 = r40
            r6 = r42
            r25 = r12
            r9 = r21
            r11 = r27
            r3 = 2
            r21 = r13
            if (r8 != r3) goto L6d8
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzf(r2, r11, r7, r6)
            r3 = r11
            r11 = r7
            goto L6e3
        L6d8:
            if (r8 != 0) goto L775
            r5 = r7
            r1 = r9
            r3 = r11
            int r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzj(r1, r2, r3, r4, r5, r6)
            r11 = r5
            r1 = r7
        L6e3:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzku r5 = r0.zzu(r10)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmw r7 = r0.zzl
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza
            if (r5 == 0) goto L764
            boolean r8 = androidx.activity.k.a(r11)
            if (r8 == 0) goto L73a
            int r8 = r11.size()
            r39 = r1
            r1 = r16
            r12 = 0
            r13 = 0
        L6fd:
            if (r12 >= r8) goto L72c
            java.lang.Object r18 = r11.get(r12)
            r27 = r14
            r14 = r18
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r0 = r14.intValue()
            boolean r18 = r5.zza(r0)
            if (r18 == 0) goto L71d
            if (r12 == r13) goto L718
            r11.set(r13, r14)
        L718:
            int r13 = r13 + 1
            r14 = r21
            goto L723
        L71d:
            r14 = r21
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzn(r15, r14, r0, r1, r7)
        L723:
            int r12 = r12 + 1
            r0 = r36
            r21 = r14
            r14 = r27
            goto L6fd
        L72c:
            r27 = r14
            r14 = r21
            if (r13 == r8) goto L76a
            java.util.List r0 = r11.subList(r13, r8)
            r0.clear()
            goto L76a
        L73a:
            r39 = r1
            r27 = r14
            r14 = r21
            java.util.Iterator r0 = r11.iterator()
            r1 = r16
        L746:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L76a
            java.lang.Object r8 = r0.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            boolean r11 = r5.zza(r8)
            if (r11 != 0) goto L746
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzn(r15, r14, r8, r1, r7)
            r0.remove()
            goto L746
        L764:
            r39 = r1
            r27 = r14
            r14 = r21
        L76a:
            r12 = r36
            r0 = r39
        L76e:
            r5 = r4
            r13 = r9
            r21 = r14
            r4 = r3
            goto L61c
        L775:
            r27 = r14
            r12 = r36
            r5 = r4
            r14 = r6
        L77b:
            r13 = r9
            r4 = r11
            goto Lb8c
        L77f:
            r2 = r38
            r4 = r40
            r6 = r42
            r11 = r7
            r25 = r12
            r9 = r21
            r3 = r27
            r0 = 2
            r27 = r14
            r14 = r13
            if (r8 != r0) goto L7ef
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r3, r6)
            int r7 = r6.zza
            if (r7 < 0) goto L7e9
            int r8 = r2.length
            int r8 = r8 - r0
            if (r7 > r8) goto L7e3
            if (r7 != 0) goto L7a6
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo.zzb
            r11.add(r7)
            goto L7ae
        L7a6:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo.zzj(r2, r0, r7)
            r11.add(r8)
        L7ad:
            int r0 = r0 + r7
        L7ae:
            if (r0 >= r4) goto L7e0
            int r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r0, r6)
            int r8 = r6.zza
            if (r9 != r8) goto L7e0
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r7, r6)
            int r7 = r6.zza
            if (r7 < 0) goto L7da
            int r8 = r2.length
            int r8 = r8 - r0
            if (r7 > r8) goto L7d4
            if (r7 != 0) goto L7cc
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo.zzb
            r11.add(r7)
            goto L7ae
        L7cc:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo.zzj(r2, r0, r7)
            r11.add(r8)
            goto L7ad
        L7d4:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r0.<init>(r1)
            throw r0
        L7da:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r0.<init>(r5)
            throw r0
        L7e0:
            r12 = r36
            goto L76e
        L7e3:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r0.<init>(r1)
            throw r0
        L7e9:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r0.<init>(r5)
            throw r0
        L7ef:
            r12 = r36
            r5 = r4
            r13 = r9
            r21 = r14
            r4 = r3
            goto L65d
        L7f8:
            r2 = r38
            r4 = r40
            r6 = r42
            r11 = r7
            r25 = r12
            r9 = r21
            r3 = r27
            r0 = 2
            r27 = r14
            r14 = r13
            if (r8 != r0) goto L7ef
            r12 = r36
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r1 = r12.zzv(r10)
            r5 = r4
            r7 = r6
            r6 = r11
            r4 = r3
            r3 = r2
            r2 = r9
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zze(r1, r2, r3, r4, r5, r6, r7)
            r13 = r2
            r2 = r3
            r21 = r14
            r14 = r7
            goto Lb8d
        L822:
            r2 = r38
            r6 = r42
            r25 = r12
            r9 = r21
            r11 = r27
            r12 = r0
            r27 = r14
            r0 = 2
            r14 = r13
            r13 = r7
            r7 = r40
            if (r8 != r0) goto L901
            r0 = 536870912(0x20000000, double:2.65249474E-315)
            long r0 = r30 & r0
            int r8 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r8 != 0) goto L88e
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r11, r6)
            int r1 = r6.zza
            if (r1 < 0) goto L888
            if (r1 != 0) goto L84d
            r13.add(r3)
            goto L858
        L84d:
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zza
            r4.<init>(r2, r0, r1, r8)
            r13.add(r4)
        L857:
            int r0 = r0 + r1
        L858:
            if (r0 >= r7) goto L881
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r0, r6)
            int r4 = r6.zza
            if (r9 != r4) goto L881
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r1, r6)
            int r1 = r6.zza
            if (r1 < 0) goto L87b
            if (r1 != 0) goto L870
            r13.add(r3)
            goto L858
        L870:
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zza
            r4.<init>(r2, r0, r1, r8)
            r13.add(r4)
            goto L857
        L87b:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r0.<init>(r5)
            throw r0
        L881:
            r5 = r7
            r13 = r9
            r4 = r11
            r21 = r14
            goto L61c
        L888:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r0.<init>(r5)
            throw r0
        L88e:
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r11, r6)
            int r1 = r6.zza
            if (r1 < 0) goto L8fb
            if (r1 != 0) goto L89e
            r13.add(r3)
            r21 = r14
            goto L8b6
        L89e:
            int r8 = r0 + r1
            boolean r18 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzng.zzd(r2, r0, r8)
            if (r18 == 0) goto L8f5
            r39 = r8
            java.lang.String r8 = new java.lang.String
            r21 = r14
            java.nio.charset.Charset r14 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zza
            r8.<init>(r2, r0, r1, r14)
            r13.add(r8)
        L8b4:
            r0 = r39
        L8b6:
            if (r0 >= r7) goto L8ef
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r0, r6)
            int r8 = r6.zza
            if (r9 != r8) goto L8ef
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r1, r6)
            int r1 = r6.zza
            if (r1 < 0) goto L8e9
            if (r1 != 0) goto L8ce
            r13.add(r3)
            goto L8b6
        L8ce:
            int r8 = r0 + r1
            boolean r14 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzng.zzd(r2, r0, r8)
            if (r14 == 0) goto L8e3
            java.lang.String r14 = new java.lang.String
            r39 = r8
            java.nio.charset.Charset r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zza
            r14.<init>(r2, r0, r1, r8)
            r13.add(r14)
            goto L8b4
        L8e3:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r0.<init>(r4)
            throw r0
        L8e9:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r0.<init>(r5)
            throw r0
        L8ef:
            r14 = r6
            r5 = r7
            r13 = r9
            r4 = r11
            goto Lb8d
        L8f5:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r0.<init>(r4)
            throw r0
        L8fb:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r0.<init>(r5)
            throw r0
        L901:
            r21 = r14
        L903:
            r14 = r6
            r5 = r7
            goto L77b
        L907:
            r2 = r38
            r6 = r42
            r25 = r12
            r9 = r21
            r11 = r27
            r3 = 2
            r12 = r0
            r21 = r13
            r27 = r14
            r13 = r7
            r7 = r40
            if (r8 != r3) goto L945
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zza
            r0 = r13
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjf r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzjf) r0
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r11, r6)
            int r4 = r6.zza
            int r4 = r4 + r3
        L928:
            if (r3 >= r4) goto L93b
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzk(r2, r3, r6)
            long r13 = r6.zzb
            int r5 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r5 == 0) goto L936
            r5 = 1
            goto L937
        L936:
            r5 = 0
        L937:
            r0.zze(r5)
            goto L928
        L93b:
            if (r3 != r4) goto L93f
        L93d:
            r0 = r3
            goto L8ef
        L93f:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r0.<init>(r1)
            throw r0
        L945:
            if (r8 != 0) goto L903
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zza
            r0 = r13
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjf r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzjf) r0
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzk(r2, r11, r6)
            long r3 = r6.zzb
            int r5 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r5 == 0) goto L958
            r3 = 1
            goto L959
        L958:
            r3 = 0
        L959:
            r0.zze(r3)
        L95c:
            if (r1 >= r7) goto L977
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r1, r6)
            int r4 = r6.zza
            if (r9 != r4) goto L977
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzk(r2, r3, r6)
            long r3 = r6.zzb
            int r5 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r5 == 0) goto L972
            r3 = 1
            goto L973
        L972:
            r3 = 0
        L973:
            r0.zze(r3)
            goto L95c
        L977:
            r0 = r1
            goto L8ef
        L97a:
            r2 = r38
            r6 = r42
            r25 = r12
            r9 = r21
            r11 = r27
            r3 = 2
            r12 = r0
            r21 = r13
            r27 = r14
            r13 = r7
            r7 = r40
            if (r8 != r3) goto L9b0
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zza
            r0 = r13
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzks r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzks) r0
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r11, r6)
            int r4 = r6.zza
            int r4 = r4 + r3
        L99b:
            if (r3 >= r4) goto L9a7
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzb(r2, r3)
            r0.zzg(r5)
            int r3 = r3 + 4
            goto L99b
        L9a7:
            if (r3 != r4) goto L9aa
            goto L93d
        L9aa:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r0.<init>(r1)
            throw r0
        L9b0:
            r3 = 5
            if (r8 != r3) goto L903
            int r0 = r11 + 4
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zza
            r1 = r13
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzks r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzks) r1
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzb(r2, r11)
            r1.zzg(r3)
        L9c1:
            if (r0 >= r7) goto L8ef
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r0, r6)
            int r4 = r6.zza
            if (r9 != r4) goto L8ef
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzb(r2, r3)
            r1.zzg(r0)
            int r0 = r3 + 4
            goto L9c1
        L9d5:
            r2 = r38
            r6 = r42
            r25 = r12
            r9 = r21
            r11 = r27
            r3 = 2
            r12 = r0
            r21 = r13
            r27 = r14
            r13 = r7
            r7 = r40
            if (r8 != r3) goto La0c
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zza
            r0 = r13
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzll r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzll) r0
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r11, r6)
            int r4 = r6.zza
            int r4 = r4 + r3
        L9f6:
            if (r3 >= r4) goto La02
            long r13 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzo(r2, r3)
            r0.zzf(r13)
            int r3 = r3 + 8
            goto L9f6
        La02:
            if (r3 != r4) goto La06
            goto L93d
        La06:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r0.<init>(r1)
            throw r0
        La0c:
            r3 = 1
            if (r8 != r3) goto L903
            int r0 = r11 + 8
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zza
            r1 = r13
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzll r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzll) r1
            long r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzo(r2, r11)
            r1.zzf(r3)
        La1d:
            if (r0 >= r7) goto L8ef
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r0, r6)
            int r4 = r6.zza
            if (r9 != r4) goto L8ef
            long r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzo(r2, r3)
            r1.zzf(r4)
            int r0 = r3 + 8
            goto La1d
        La31:
            r2 = r38
            r6 = r42
            r25 = r12
            r9 = r21
            r11 = r27
            r3 = 2
            r12 = r0
            r21 = r13
            r27 = r14
            r13 = r7
            r7 = r40
            if (r8 != r3) goto La4c
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzf(r2, r11, r13, r6)
            goto L8ef
        La4c:
            if (r8 != 0) goto L903
            r4 = r7
            r1 = r9
            r3 = r11
            r5 = r13
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzj(r1, r2, r3, r4, r5, r6)
            r13 = r1
            r5 = r4
            r14 = r6
            r4 = r3
            goto Lb8d
        La5c:
            r2 = r21
            r21 = r13
            r13 = r2
            r2 = r38
            r5 = r40
            r11 = r7
            r25 = r12
            r4 = r27
            r3 = 2
            r12 = r0
            r27 = r14
            r14 = r42
            if (r8 != r3) goto La94
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zza
            r7 = r11
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzll r7 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzll) r7
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r4, r14)
            int r3 = r14.zza
            int r3 = r3 + r0
        La7e:
            if (r0 >= r3) goto La8a
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzk(r2, r0, r14)
            long r8 = r14.zzb
            r7.zzf(r8)
            goto La7e
        La8a:
            if (r0 != r3) goto La8e
            goto Lb8d
        La8e:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r0.<init>(r1)
            throw r0
        La94:
            if (r8 != 0) goto Lb8c
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zza
            r7 = r11
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzll r7 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzll) r7
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzk(r2, r4, r14)
            long r8 = r14.zzb
            r7.zzf(r8)
        Laa4:
            if (r0 >= r5) goto Lb8d
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r0, r14)
            int r3 = r14.zza
            if (r13 != r3) goto Lb8d
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzk(r2, r1, r14)
            long r8 = r14.zzb
            r7.zzf(r8)
            goto Laa4
        Lab8:
            r2 = r21
            r21 = r13
            r13 = r2
            r2 = r38
            r5 = r40
            r11 = r7
            r25 = r12
            r4 = r27
            r3 = 2
            r12 = r0
            r27 = r14
            r14 = r42
            if (r8 != r3) goto Laf4
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zza
            r7 = r11
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzki r7 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzki) r7
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r4, r14)
            int r3 = r14.zza
            int r3 = r3 + r0
        Lada:
            if (r0 >= r3) goto Laea
            int r6 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzb(r2, r0)
            float r6 = java.lang.Float.intBitsToFloat(r6)
            r7.zzg(r6)
            int r0 = r0 + 4
            goto Lada
        Laea:
            if (r0 != r3) goto Laee
            goto Lb8d
        Laee:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r0.<init>(r1)
            throw r0
        Laf4:
            r3 = 5
            if (r8 != r3) goto Lb8c
            int r6 = r4 + 4
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zza
            r7 = r11
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzki r7 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzki) r7
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzb(r2, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r7.zzg(r0)
        Lb09:
            if (r6 >= r5) goto Lb21
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r6, r14)
            int r1 = r14.zza
            if (r13 != r1) goto Lb21
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzb(r2, r0)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r7.zzg(r1)
            int r6 = r0 + 4
            goto Lb09
        Lb21:
            r0 = r6
            goto Lb8d
        Lb24:
            r2 = r21
            r21 = r13
            r13 = r2
            r2 = r38
            r5 = r40
            r11 = r7
            r25 = r12
            r4 = r27
            r3 = 2
            r12 = r0
            r27 = r14
            r14 = r42
            if (r8 != r3) goto Lb5f
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zza
            r7 = r11
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjy r7 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzjy) r7
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r4, r14)
            int r3 = r14.zza
            int r3 = r3 + r0
        Lb46:
            if (r0 >= r3) goto Lb56
            long r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzo(r2, r0)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r7.zzf(r8)
            int r0 = r0 + 8
            goto Lb46
        Lb56:
            if (r0 != r3) goto Lb59
            goto Lb8d
        Lb59:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r0.<init>(r1)
            throw r0
        Lb5f:
            r3 = 1
            if (r8 != r3) goto Lb8c
            int r6 = r4 + 8
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zza
            r7 = r11
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjy r7 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzjy) r7
            long r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzo(r2, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            r7.zzf(r0)
        Lb74:
            if (r6 >= r5) goto Lb21
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r2, r6, r14)
            int r1 = r14.zza
            if (r13 != r1) goto Lb21
            long r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzo(r2, r0)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r7.zzf(r8)
            int r6 = r0 + 8
            goto Lb74
        Lb8c:
            r0 = r4
        Lb8d:
            if (r0 == r4) goto Lba2
            r3 = r2
            r4 = r5
            r8 = r10
            r6 = r14
            r2 = r15
            r7 = r21
            r1 = r25
            r9 = r26
            r14 = r27
            r11 = 0
            r5 = r0
            r0 = r12
            r15 = r13
            goto L129
        Lba2:
            r3 = r0
            r8 = r10
            r10 = r14
            r9 = r21
            r0 = r41
            r14 = r2
            goto Le2d
        Lbac:
            r5 = r40
            r25 = r12
            r21 = r13
            r12 = r0
            r13 = r2
            r0 = r27
            r2 = r38
            r27 = r14
            r14 = r42
            r1 = 50
            if (r9 != r1) goto Lbe7
            r1 = 2
            if (r8 != r1) goto Lba2
            sun.misc.Unsafe r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zzb
            java.lang.Object r1 = r12.zzw(r10)
            java.lang.Object r2 = r0.getObject(r15, r6)
            r3 = r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlq r3 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlq) r3
            boolean r3 = r3.zze()
            if (r3 != 0) goto Lbe4
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlq r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlq.zza()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlq r3 = r3.zzb()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlr.zza(r3, r2)
            r0.putObject(r15, r6, r3)
        Lbe4:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlp r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlp) r1
            throw r16
        Lbe7:
            int r1 = r10 + 2
            r30 = r0
            sun.misc.Unsafe r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zzb
            r1 = r20[r1]
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r17
            long r1 = (long) r1
            switch(r9) {
                case 51: goto Ldef;
                case 52: goto Ldcd;
                case 53: goto Ldb1;
                case 54: goto Ldb1;
                case 55: goto Ld95;
                case 56: goto Ld78;
                case 57: goto Ld5b;
                case 58: goto Ld34;
                case 59: goto Lcf2;
                case 60: goto Lcc6;
                case 61: goto Lcaf;
                case 62: goto Ld95;
                case 63: goto Lc76;
                case 64: goto Ld5b;
                case 65: goto Ld78;
                case 66: goto Lc55;
                case 67: goto Lc2e;
                case 68: goto Lc03;
                default: goto Lbf8;
            }
        Lbf8:
            r20 = r10
            r10 = r14
            r9 = r21
        Lbfd:
            r11 = r30
            r14 = r38
            goto Le11
        Lc03:
            r6 = 3
            if (r8 != r6) goto Lc28
            r0 = r13 & (-8)
            r6 = r0 | 4
            r9 = r21
            java.lang.Object r1 = r12.zzy(r15, r9, r10)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r2 = r12.zzv(r10)
            r3 = r38
            r7 = r14
            r4 = r30
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzl(r1, r2, r3, r4, r5, r6, r7)
            r12.zzG(r15, r9, r10, r1)
            r5 = r0
        Lc21:
            r11 = r4
            r20 = r10
        Lc24:
            r10 = r14
            r14 = r3
            goto Le12
        Lc28:
            r9 = r21
            r20 = r10
            r10 = r14
            goto Lbfd
        Lc2e:
            r3 = r38
            r9 = r21
            r4 = r30
            if (r8 != 0) goto Lc4e
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzk(r3, r4, r14)
            r20 = r10
            long r10 = r14.zzb
            long r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjs.zzc(r10)
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            r0.putObject(r15, r6, r8)
            r0.putInt(r15, r1, r9)
        Lc4c:
            r11 = r4
            goto Lc24
        Lc4e:
            r11 = r4
            r20 = r10
        Lc51:
            r10 = r14
            r14 = r3
            goto Le11
        Lc55:
            r3 = r38
            r20 = r10
            r9 = r21
            r4 = r30
            if (r8 != 0) goto Lc74
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r3, r4, r14)
            int r8 = r14.zza
            int r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzjs.zzb(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.putObject(r15, r6, r8)
            r0.putInt(r15, r1, r9)
            goto Lc4c
        Lc74:
            r11 = r4
            goto Lc51
        Lc76:
            r3 = r38
            r20 = r10
            r9 = r21
            r4 = r30
            if (r8 != 0) goto Lc74
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r3, r4, r14)
            int r8 = r14.zza
            r10 = r20
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzku r11 = r12.zzu(r10)
            if (r11 == 0) goto Lca3
            boolean r11 = r11.zza(r8)
            if (r11 == 0) goto Lc95
            goto Lca3
        Lc95:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r0 = zzd(r15)
            long r1 = (long) r8
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.zzj(r13, r1)
            goto Lc21
        Lca3:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.putObject(r15, r6, r8)
            r0.putInt(r15, r1, r9)
            goto Lc21
        Lcaf:
            r3 = r38
            r9 = r21
            r4 = r30
            r5 = 2
            if (r8 != r5) goto Lc4e
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zza(r3, r4, r14)
            java.lang.Object r8 = r14.zzc
            r0.putObject(r15, r6, r8)
            r0.putInt(r15, r1, r9)
            goto Lc21
        Lcc6:
            r3 = r38
            r9 = r21
            r4 = r30
            r5 = 2
            if (r8 != r5) goto Lcea
            java.lang.Object r1 = r12.zzy(r15, r9, r10)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r2 = r12.zzv(r10)
            r5 = r40
            r6 = r14
            int r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzm(r1, r2, r3, r4, r5, r6)
            r14 = r3
            r12.zzG(r15, r9, r10, r1)
            r5 = r0
            r11 = r4
            r20 = r10
            r10 = r42
            goto Le12
        Lcea:
            r14 = r3
            r11 = r4
            r20 = r10
            r10 = r42
            goto Le11
        Lcf2:
            r20 = r10
            r39 = r11
            r10 = r14
            r9 = r21
            r11 = r30
            r5 = 2
            r14 = r38
            if (r8 != r5) goto Le11
            int r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r14, r11, r10)
            int r8 = r10.zza
            if (r8 != 0) goto Ld0c
            r0.putObject(r15, r6, r3)
            goto Ld2f
        Ld0c:
            r3 = r39 & r18
            r39 = r3
            int r3 = r5 + r8
            if (r39 == 0) goto Ld21
            boolean r18 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzng.zzd(r14, r5, r3)
            if (r18 == 0) goto Ld1b
            goto Ld21
        Ld1b:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r0.<init>(r4)
            throw r0
        Ld21:
            java.lang.String r4 = new java.lang.String
            r39 = r3
            java.nio.charset.Charset r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkz.zza
            r4.<init>(r14, r5, r8, r3)
            r0.putObject(r15, r6, r4)
            r5 = r39
        Ld2f:
            r0.putInt(r15, r1, r9)
            goto Le12
        Ld34:
            r20 = r10
            r10 = r14
            r9 = r21
            r11 = r30
            r14 = r38
            if (r8 != 0) goto Le11
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzk(r14, r11, r10)
            long r4 = r10.zzb
            int r8 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
            if (r8 == 0) goto Ld4c
            r28 = 1
            goto Ld4e
        Ld4c:
            r28 = 0
        Ld4e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r28)
            r0.putObject(r15, r6, r4)
            r0.putInt(r15, r1, r9)
        Ld58:
            r5 = r3
            goto Le12
        Ld5b:
            r20 = r10
            r10 = r14
            r9 = r21
            r11 = r30
            r3 = 5
            r14 = r38
            if (r8 != r3) goto Le11
            int r3 = r11 + 4
            int r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzb(r14, r11)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.putObject(r15, r6, r4)
            r0.putInt(r15, r1, r9)
            goto Ld58
        Ld78:
            r20 = r10
            r10 = r14
            r9 = r21
            r11 = r30
            r3 = 1
            r14 = r38
            if (r8 != r3) goto Le11
            int r3 = r11 + 8
            long r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzo(r14, r11)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.putObject(r15, r6, r4)
            r0.putInt(r15, r1, r9)
            goto Ld58
        Ld95:
            r20 = r10
            r10 = r14
            r9 = r21
            r11 = r30
            r14 = r38
            if (r8 != 0) goto Le11
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzh(r14, r11, r10)
            int r4 = r10.zza
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.putObject(r15, r6, r4)
            r0.putInt(r15, r1, r9)
            goto Ld58
        Ldb1:
            r20 = r10
            r10 = r14
            r9 = r21
            r11 = r30
            r14 = r38
            if (r8 != 0) goto Le11
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzk(r14, r11, r10)
            long r4 = r10.zzb
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.putObject(r15, r6, r4)
            r0.putInt(r15, r1, r9)
            goto Ld58
        Ldcd:
            r20 = r10
            r10 = r14
            r9 = r21
            r11 = r30
            r3 = 5
            r14 = r38
            if (r8 != r3) goto Le11
            int r3 = r11 + 4
            int r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzb(r14, r11)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r0.putObject(r15, r6, r4)
            r0.putInt(r15, r1, r9)
            goto Ld58
        Ldef:
            r20 = r10
            r10 = r14
            r9 = r21
            r11 = r30
            r3 = 1
            r14 = r38
            if (r8 != r3) goto Le11
            int r3 = r11 + 8
            long r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzo(r14, r11)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r0.putObject(r15, r6, r4)
            r0.putInt(r15, r1, r9)
            goto Ld58
        Le11:
            r5 = r11
        Le12:
            if (r5 == r11) goto Le28
            r4 = r40
            r7 = r9
            r6 = r10
            r0 = r12
            r3 = r14
            r2 = r15
            r8 = r20
            r1 = r25
            r9 = r26
            r14 = r27
            r11 = 0
            r12 = -1
            r15 = r13
            goto L1a
        Le28:
            r0 = r41
            r3 = r5
            r8 = r20
        Le2d:
            if (r13 != r0) goto Le3f
            if (r0 == 0) goto Le3f
            r4 = r40
            r5 = r3
            r2 = r15
            r15 = r13
            r9 = r26
            r14 = r27
        Le3a:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto Le99
        Le3f:
            boolean r1 = r12.zzh
            if (r1 == 0) goto Le6d
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkb r1 = r10.zzd
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkb.zzb
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkb r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkb.zza
            if (r1 == r2) goto Le6d
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r2 = r12.zzg
            int r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkp r1 = r1.zzb(r2, r9)
            if (r1 != 0) goto Le66
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r5 = zzd(r15)
            r4 = r40
            r6 = r10
            r1 = r13
            r2 = r14
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzg(r1, r2, r3, r4, r5, r6)
        Le64:
            r5 = r3
            goto Le7d
        Le66:
            r0 = r15
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn) r0
            r0.zzc()
            throw r16
        Le6d:
            r1 = r13
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r5 = zzd(r15)
            r2 = r38
            r4 = r40
            r6 = r42
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzje.zzg(r1, r2, r3, r4, r5, r6)
            goto Le64
        Le7d:
            r3 = r38
            r6 = r42
            r7 = r9
            r0 = r12
            r2 = r15
            r9 = r26
            r14 = r27
            r11 = 0
            r12 = -1
            r15 = r1
            r1 = r25
            goto L1a
        Le8f:
            r12 = r0
            r25 = r1
            r26 = r9
            r27 = r14
            r0 = r41
            goto Le3a
        Le99:
            if (r9 == r1) goto Lea1
            long r6 = (long) r9
            r1 = r25
            r1.putInt(r2, r6, r14)
        Lea1:
            int r1 = r12.zzj
        Lea3:
            int r3 = r12.zzk
            if (r1 >= r3) goto Led2
            int[] r3 = r12.zzi
            int[] r6 = r12.zzc
            r3 = r3[r1]
            r6 = r6[r3]
            int r6 = r12.zzs(r3)
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r17
            long r6 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r2, r6)
            if (r6 != 0) goto Lec0
            goto Lec6
        Lec0:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzku r7 = r12.zzu(r3)
            if (r7 != 0) goto Lec9
        Lec6:
            int r1 = r1 + 1
            goto Lea3
        Lec9:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlq r6 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlq) r6
            java.lang.Object r0 = r12.zzw(r3)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlp r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlp) r0
            throw r16
        Led2:
            java.lang.String r1 = "Failed to parse the message."
            if (r0 != 0) goto Ledf
            if (r5 != r4) goto Led9
            goto Lee3
        Led9:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r0.<init>(r1)
            throw r0
        Ledf:
            if (r5 > r4) goto Lee4
            if (r15 != r0) goto Lee4
        Lee3:
            return r5
        Lee4:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzlb
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi
    public final java.lang.Object zze() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r0 = r1.zzg
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = r0.zzt()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi
    public final void zzf(java.lang.Object r8) {
            r7 = this;
            boolean r0 = zzL(r8)
            if (r0 != 0) goto L8
            goto L95
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzF(r2)
            r0.zza = r1
            r0.zzD()
        L1b:
            int[] r0 = r7.zzc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L87
            int r2 = r7.zzs(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzr(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L71
            r5 = 60
            if (r2 == r5) goto L59
            r5 = 68
            if (r2 == r5) goto L59
            switch(r2) {
                case 17: goto L71;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L84
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L84
            r6 = r5
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlq r6 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlq) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L84
        L4f:
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r8, r3)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzky r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzky) r2
            r2.zzb()
            goto L84
        L59:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzM(r8, r2, r1)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r2 = r7.zzv(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
            goto L84
        L71:
            boolean r2 = r7.zzI(r8, r1)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r2 = r7.zzv(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L84:
            int r1 = r1 + 3
            goto L1d
        L87:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmw r0 = r7.zzl
            r0.zza(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L95
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkc r0 = r7.zzm
            r0.zza(r8)
        L95:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi
    public final void zzg(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            zzA(r9)
            r10.getClass()
            r0 = 0
        L7:
            int[] r1 = r8.zzc
            int r1 = r1.length
            if (r0 >= r1) goto L1b8
            int r1 = r8.zzs(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            int[] r3 = r8.zzc
            int r1 = zzr(r1)
            r3 = r3[r0]
            long r4 = (long) r2
            switch(r1) {
                case 0: goto L1a4;
                case 1: goto L193;
                case 2: goto L182;
                case 3: goto L171;
                case 4: goto L160;
                case 5: goto L14f;
                case 6: goto L13e;
                case 7: goto L12c;
                case 8: goto L11a;
                case 9: goto L115;
                case 10: goto L103;
                case 11: goto Lf1;
                case 12: goto Ldf;
                case 13: goto Lcd;
                case 14: goto Lbb;
                case 15: goto La9;
                case 16: goto L97;
                case 17: goto L92;
                case 18: goto L63;
                case 19: goto L63;
                case 20: goto L63;
                case 21: goto L63;
                case 22: goto L63;
                case 23: goto L63;
                case 24: goto L63;
                case 25: goto L63;
                case 26: goto L63;
                case 27: goto L63;
                case 28: goto L63;
                case 29: goto L63;
                case 30: goto L63;
                case 31: goto L63;
                case 32: goto L63;
                case 33: goto L63;
                case 34: goto L63;
                case 35: goto L63;
                case 36: goto L63;
                case 37: goto L63;
                case 38: goto L63;
                case 39: goto L63;
                case 40: goto L63;
                case 41: goto L63;
                case 42: goto L63;
                case 43: goto L63;
                case 44: goto L63;
                case 45: goto L63;
                case 46: goto L63;
                case 47: goto L63;
                case 48: goto L63;
                case 49: goto L63;
                case 50: goto L50;
                case 51: goto L3e;
                case 52: goto L3e;
                case 53: goto L3e;
                case 54: goto L3e;
                case 55: goto L3e;
                case 56: goto L3e;
                case 57: goto L3e;
                case 58: goto L3e;
                case 59: goto L3e;
                case 60: goto L39;
                case 61: goto L27;
                case 62: goto L27;
                case 63: goto L27;
                case 64: goto L27;
                case 65: goto L27;
                case 66: goto L27;
                case 67: goto L27;
                case 68: goto L22;
                default: goto L20;
            }
        L20:
            goto L1b4
        L22:
            r8.zzC(r9, r10, r0)
            goto L1b4
        L27:
            boolean r1 = r8.zzM(r10, r3, r0)
            if (r1 == 0) goto L1b4
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r10, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzs(r9, r4, r1)
            r8.zzE(r9, r3, r0)
            goto L1b4
        L39:
            r8.zzC(r9, r10, r0)
            goto L1b4
        L3e:
            boolean r1 = r8.zzM(r10, r3, r0)
            if (r1 == 0) goto L1b4
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r10, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzs(r9, r4, r1)
            r8.zzE(r9, r3, r0)
            goto L1b4
        L50:
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r4)
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r10, r4)
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlr.zza(r1, r2)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzs(r9, r4, r1)
            goto L1b4
        L63:
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzky r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzky) r1
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r10, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzky r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzky) r2
            int r3 = r1.size()
            int r6 = r2.size()
            if (r3 <= 0) goto L89
            if (r6 <= 0) goto L89
            boolean r7 = r1.zzc()
            if (r7 != 0) goto L86
            int r6 = r6 + r3
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzky r1 = r1.zzd(r6)
        L86:
            r1.addAll(r2)
        L89:
            if (r3 > 0) goto L8c
            goto L8d
        L8c:
            r2 = r1
        L8d:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzs(r9, r4, r2)
            goto L1b4
        L92:
            r8.zzB(r9, r10, r0)
            goto L1b4
        L97:
            boolean r1 = r8.zzI(r10, r0)
            if (r1 == 0) goto L1b4
            long r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r10, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzr(r9, r4, r1)
            r8.zzD(r9, r0)
            goto L1b4
        La9:
            boolean r1 = r8.zzI(r10, r0)
            if (r1 == 0) goto L1b4
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r10, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzq(r9, r4, r1)
            r8.zzD(r9, r0)
            goto L1b4
        Lbb:
            boolean r1 = r8.zzI(r10, r0)
            if (r1 == 0) goto L1b4
            long r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r10, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzr(r9, r4, r1)
            r8.zzD(r9, r0)
            goto L1b4
        Lcd:
            boolean r1 = r8.zzI(r10, r0)
            if (r1 == 0) goto L1b4
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r10, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzq(r9, r4, r1)
            r8.zzD(r9, r0)
            goto L1b4
        Ldf:
            boolean r1 = r8.zzI(r10, r0)
            if (r1 == 0) goto L1b4
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r10, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzq(r9, r4, r1)
            r8.zzD(r9, r0)
            goto L1b4
        Lf1:
            boolean r1 = r8.zzI(r10, r0)
            if (r1 == 0) goto L1b4
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r10, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzq(r9, r4, r1)
            r8.zzD(r9, r0)
            goto L1b4
        L103:
            boolean r1 = r8.zzI(r10, r0)
            if (r1 == 0) goto L1b4
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r10, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzs(r9, r4, r1)
            r8.zzD(r9, r0)
            goto L1b4
        L115:
            r8.zzB(r9, r10, r0)
            goto L1b4
        L11a:
            boolean r1 = r8.zzI(r10, r0)
            if (r1 == 0) goto L1b4
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r10, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzs(r9, r4, r1)
            r8.zzD(r9, r0)
            goto L1b4
        L12c:
            boolean r1 = r8.zzI(r10, r0)
            if (r1 == 0) goto L1b4
            boolean r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzw(r10, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzm(r9, r4, r1)
            r8.zzD(r9, r0)
            goto L1b4
        L13e:
            boolean r1 = r8.zzI(r10, r0)
            if (r1 == 0) goto L1b4
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r10, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzq(r9, r4, r1)
            r8.zzD(r9, r0)
            goto L1b4
        L14f:
            boolean r1 = r8.zzI(r10, r0)
            if (r1 == 0) goto L1b4
            long r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r10, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzr(r9, r4, r1)
            r8.zzD(r9, r0)
            goto L1b4
        L160:
            boolean r1 = r8.zzI(r10, r0)
            if (r1 == 0) goto L1b4
            int r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r10, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzq(r9, r4, r1)
            r8.zzD(r9, r0)
            goto L1b4
        L171:
            boolean r1 = r8.zzI(r10, r0)
            if (r1 == 0) goto L1b4
            long r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r10, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzr(r9, r4, r1)
            r8.zzD(r9, r0)
            goto L1b4
        L182:
            boolean r1 = r8.zzI(r10, r0)
            if (r1 == 0) goto L1b4
            long r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r10, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzr(r9, r4, r1)
            r8.zzD(r9, r0)
            goto L1b4
        L193:
            boolean r1 = r8.zzI(r10, r0)
            if (r1 == 0) goto L1b4
            float r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzb(r10, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzp(r9, r4, r1)
            r8.zzD(r9, r0)
            goto L1b4
        L1a4:
            boolean r1 = r8.zzI(r10, r0)
            if (r1 == 0) goto L1b4
            double r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zza(r10, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzo(r9, r4, r1)
            r8.zzD(r9, r0)
        L1b4:
            int r0 = r0 + 3
            goto L7
        L1b8:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmw r0 = r8.zzl
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzp(r0, r9, r10)
            boolean r0 = r8.zzh
            if (r0 == 0) goto L1c6
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkc r0 = r8.zzm
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzo(r0, r9, r10)
        L1c6:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi
    public final void zzh(java.lang.Object r8, byte[] r9, int r10, int r11, com.google.android.gms.internal.mlkit_vision_mediapipe.zzjd r12) throws java.io.IOException {
            r7 = this;
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r0.zzc(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi
    public final void zzi(java.lang.Object r19, com.google.android.gms.internal.mlkit_vision_mediapipe.zznj r20) throws java.io.IOException {
            r18 = this;
            r0 = r18
            r1 = r19
            r6 = r20
            boolean r2 = r0.zzh
            if (r2 == 0) goto L23
            r2 = r1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn) r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg r2 = r2.zzb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzms r3 = r2.zza
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L23
            java.util.Iterator r2 = r2.zzg()
            java.lang.Object r2 = r2.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            r8 = r2
            goto L24
        L23:
            r8 = 0
        L24:
            int[] r9 = r0.zzc
            sun.misc.Unsafe r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zzb
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = 0
        L30:
            int r5 = r9.length
            if (r2 >= r5) goto L509
            int r5 = r0.zzs(r2)
            int[] r13 = r0.zzc
            int r14 = zzr(r5)
            r15 = r13[r2]
            r16 = 0
            r7 = 17
            r12 = 1
            if (r14 > r7) goto L63
            int r7 = r2 + 2
            r7 = r13[r7]
            r13 = r7 & r11
            if (r13 == r3) goto L59
            if (r13 != r11) goto L52
            r4 = 0
            goto L58
        L52:
            long r3 = (long) r13
            int r3 = r10.getInt(r1, r3)
            r4 = r3
        L58:
            r3 = r13
        L59:
            int r7 = r7 >>> 20
            int r7 = r12 << r7
            r17 = r7
            r7 = r5
            r5 = r17
            goto L65
        L63:
            r7 = r5
            r5 = 0
        L65:
            if (r8 != 0) goto L502
            r7 = r7 & r11
            long r11 = (long) r7
            switch(r14) {
                case 0: goto L4eb;
                case 1: goto L4dc;
                case 2: goto L4cd;
                case 3: goto L4be;
                case 4: goto L4af;
                case 5: goto L4a0;
                case 6: goto L491;
                case 7: goto L482;
                case 8: goto L472;
                case 9: goto L45e;
                case 10: goto L44c;
                case 11: goto L43c;
                case 12: goto L42c;
                case 13: goto L41c;
                case 14: goto L40c;
                case 15: goto L3fc;
                case 16: goto L3ec;
                case 17: goto L3d8;
                case 18: goto L3c8;
                case 19: goto L3b8;
                case 20: goto L3a8;
                case 21: goto L398;
                case 22: goto L388;
                case 23: goto L378;
                case 24: goto L368;
                case 25: goto L358;
                case 26: goto L33f;
                case 27: goto L313;
                case 28: goto L2fa;
                case 29: goto L2ea;
                case 30: goto L2da;
                case 31: goto L2ca;
                case 32: goto L2ba;
                case 33: goto L2aa;
                case 34: goto L29a;
                case 35: goto L28a;
                case 36: goto L27a;
                case 37: goto L26a;
                case 38: goto L25a;
                case 39: goto L24a;
                case 40: goto L23a;
                case 41: goto L22a;
                case 42: goto L21a;
                case 43: goto L20a;
                case 44: goto L1fa;
                case 45: goto L1ea;
                case 46: goto L1da;
                case 47: goto L1ca;
                case 48: goto L1ba;
                case 49: goto L18e;
                case 50: goto L17f;
                case 51: goto L170;
                case 52: goto L161;
                case 53: goto L152;
                case 54: goto L143;
                case 55: goto L134;
                case 56: goto L125;
                case 57: goto L116;
                case 58: goto L107;
                case 59: goto Lf8;
                case 60: goto Le5;
                case 61: goto Ld5;
                case 62: goto Lc7;
                case 63: goto Lb9;
                case 64: goto Lab;
                case 65: goto L9d;
                case 66: goto L8f;
                case 67: goto L81;
                case 68: goto L6f;
                default: goto L6c;
            }
        L6c:
            r14 = 0
            goto L4f9
        L6f:
            boolean r5 = r0.zzM(r1, r15, r2)
            if (r5 == 0) goto L6c
            java.lang.Object r5 = r10.getObject(r1, r11)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r7 = r0.zzv(r2)
            r6.zzq(r15, r5, r7)
            goto L6c
        L81:
            boolean r5 = r0.zzM(r1, r15, r2)
            if (r5 == 0) goto L6c
            long r11 = zzt(r1, r11)
            r6.zzD(r15, r11)
            goto L6c
        L8f:
            boolean r5 = r0.zzM(r1, r15, r2)
            if (r5 == 0) goto L6c
            int r5 = zzo(r1, r11)
            r6.zzB(r15, r5)
            goto L6c
        L9d:
            boolean r5 = r0.zzM(r1, r15, r2)
            if (r5 == 0) goto L6c
            long r11 = zzt(r1, r11)
            r6.zzz(r15, r11)
            goto L6c
        Lab:
            boolean r5 = r0.zzM(r1, r15, r2)
            if (r5 == 0) goto L6c
            int r5 = zzo(r1, r11)
            r6.zzx(r15, r5)
            goto L6c
        Lb9:
            boolean r5 = r0.zzM(r1, r15, r2)
            if (r5 == 0) goto L6c
            int r5 = zzo(r1, r11)
            r6.zzi(r15, r5)
            goto L6c
        Lc7:
            boolean r5 = r0.zzM(r1, r15, r2)
            if (r5 == 0) goto L6c
            int r5 = zzo(r1, r11)
            r6.zzI(r15, r5)
            goto L6c
        Ld5:
            boolean r5 = r0.zzM(r1, r15, r2)
            if (r5 == 0) goto L6c
            java.lang.Object r5 = r10.getObject(r1, r11)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo) r5
            r6.zzd(r15, r5)
            goto L6c
        Le5:
            boolean r5 = r0.zzM(r1, r15, r2)
            if (r5 == 0) goto L6c
            java.lang.Object r5 = r10.getObject(r1, r11)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r7 = r0.zzv(r2)
            r6.zzv(r15, r5, r7)
            goto L6c
        Lf8:
            boolean r5 = r0.zzM(r1, r15, r2)
            if (r5 == 0) goto L6c
            java.lang.Object r5 = r10.getObject(r1, r11)
            zzO(r15, r5, r6)
            goto L6c
        L107:
            boolean r5 = r0.zzM(r1, r15, r2)
            if (r5 == 0) goto L6c
            boolean r5 = zzN(r1, r11)
            r6.zzb(r15, r5)
            goto L6c
        L116:
            boolean r5 = r0.zzM(r1, r15, r2)
            if (r5 == 0) goto L6c
            int r5 = zzo(r1, r11)
            r6.zzk(r15, r5)
            goto L6c
        L125:
            boolean r5 = r0.zzM(r1, r15, r2)
            if (r5 == 0) goto L6c
            long r11 = zzt(r1, r11)
            r6.zzm(r15, r11)
            goto L6c
        L134:
            boolean r5 = r0.zzM(r1, r15, r2)
            if (r5 == 0) goto L6c
            int r5 = zzo(r1, r11)
            r6.zzr(r15, r5)
            goto L6c
        L143:
            boolean r5 = r0.zzM(r1, r15, r2)
            if (r5 == 0) goto L6c
            long r11 = zzt(r1, r11)
            r6.zzK(r15, r11)
            goto L6c
        L152:
            boolean r5 = r0.zzM(r1, r15, r2)
            if (r5 == 0) goto L6c
            long r11 = zzt(r1, r11)
            r6.zzt(r15, r11)
            goto L6c
        L161:
            boolean r5 = r0.zzM(r1, r15, r2)
            if (r5 == 0) goto L6c
            float r5 = zzn(r1, r11)
            r6.zzo(r15, r5)
            goto L6c
        L170:
            boolean r5 = r0.zzM(r1, r15, r2)
            if (r5 == 0) goto L6c
            double r11 = zzm(r1, r11)
            r6.zzf(r15, r11)
            goto L6c
        L17f:
            java.lang.Object r5 = r10.getObject(r1, r11)
            if (r5 != 0) goto L187
            goto L6c
        L187:
            java.lang.Object r1 = r0.zzw(r2)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlp r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlp) r1
            throw r16
        L18e:
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r11 = r0.zzv(r2)
            int r12 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza
            if (r7 == 0) goto L6c
            boolean r12 = r7.isEmpty()
            if (r12 != 0) goto L6c
            r12 = 0
        L1a7:
            int r14 = r7.size()
            if (r12 >= r14) goto L6c
            java.lang.Object r14 = r7.get(r12)
            r15 = r6
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjx r15 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzjx) r15
            r15.zzq(r5, r14, r11)
            int r12 = r12 + 1
            goto L1a7
        L1ba:
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            r14 = 1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzB(r5, r7, r6, r14)
            goto L6c
        L1ca:
            r14 = 1
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzA(r5, r7, r6, r14)
            goto L6c
        L1da:
            r14 = 1
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzz(r5, r7, r6, r14)
            goto L6c
        L1ea:
            r14 = 1
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzy(r5, r7, r6, r14)
            goto L6c
        L1fa:
            r14 = 1
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzs(r5, r7, r6, r14)
            goto L6c
        L20a:
            r14 = 1
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzC(r5, r7, r6, r14)
            goto L6c
        L21a:
            r14 = 1
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzq(r5, r7, r6, r14)
            goto L6c
        L22a:
            r14 = 1
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzt(r5, r7, r6, r14)
            goto L6c
        L23a:
            r14 = 1
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzu(r5, r7, r6, r14)
            goto L6c
        L24a:
            r14 = 1
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzw(r5, r7, r6, r14)
            goto L6c
        L25a:
            r14 = 1
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzD(r5, r7, r6, r14)
            goto L6c
        L26a:
            r14 = 1
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzx(r5, r7, r6, r14)
            goto L6c
        L27a:
            r14 = 1
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzv(r5, r7, r6, r14)
            goto L6c
        L28a:
            r14 = 1
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzr(r5, r7, r6, r14)
            goto L6c
        L29a:
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            r14 = 0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzB(r5, r7, r6, r14)
            goto L4f9
        L2aa:
            r14 = 0
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzA(r5, r7, r6, r14)
            goto L4f9
        L2ba:
            r14 = 0
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzz(r5, r7, r6, r14)
            goto L4f9
        L2ca:
            r14 = 0
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzy(r5, r7, r6, r14)
            goto L4f9
        L2da:
            r14 = 0
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzs(r5, r7, r6, r14)
            goto L4f9
        L2ea:
            r14 = 0
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzC(r5, r7, r6, r14)
            goto L4f9
        L2fa:
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            int r11 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza
            if (r7 == 0) goto L6c
            boolean r11 = r7.isEmpty()
            if (r11 != 0) goto L6c
            r6.zze(r5, r7)
            goto L6c
        L313:
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r11 = r0.zzv(r2)
            int r12 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza
            if (r7 == 0) goto L6c
            boolean r12 = r7.isEmpty()
            if (r12 != 0) goto L6c
            r14 = 0
        L32c:
            int r12 = r7.size()
            if (r14 >= r12) goto L6c
            java.lang.Object r12 = r7.get(r14)
            r15 = r6
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjx r15 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzjx) r15
            r15.zzv(r5, r12, r11)
            int r14 = r14 + 1
            goto L32c
        L33f:
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            int r11 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zza
            if (r7 == 0) goto L6c
            boolean r11 = r7.isEmpty()
            if (r11 != 0) goto L6c
            r6.zzH(r5, r7)
            goto L6c
        L358:
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            r14 = 0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzq(r5, r7, r6, r14)
            goto L4f9
        L368:
            r14 = 0
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzt(r5, r7, r6, r14)
            goto L4f9
        L378:
            r14 = 0
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzu(r5, r7, r6, r14)
            goto L4f9
        L388:
            r14 = 0
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzw(r5, r7, r6, r14)
            goto L4f9
        L398:
            r14 = 0
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzD(r5, r7, r6, r14)
            goto L4f9
        L3a8:
            r14 = 0
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzx(r5, r7, r6, r14)
            goto L4f9
        L3b8:
            r14 = 0
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzv(r5, r7, r6, r14)
            goto L4f9
        L3c8:
            r14 = 0
            int[] r5 = r0.zzc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzr(r5, r7, r6, r14)
            goto L4f9
        L3d8:
            r14 = 0
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4f9
            java.lang.Object r5 = r10.getObject(r1, r11)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r7 = r0.zzv(r2)
            r6.zzq(r15, r5, r7)
            goto L4f9
        L3ec:
            r14 = 0
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4f9
            long r11 = r10.getLong(r1, r11)
            r6.zzD(r15, r11)
            goto L4f9
        L3fc:
            r14 = 0
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4f9
            int r0 = r10.getInt(r1, r11)
            r6.zzB(r15, r0)
            goto L4f9
        L40c:
            r14 = 0
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4f9
            long r11 = r10.getLong(r1, r11)
            r6.zzz(r15, r11)
            goto L4f9
        L41c:
            r14 = 0
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4f9
            int r0 = r10.getInt(r1, r11)
            r6.zzx(r15, r0)
            goto L4f9
        L42c:
            r14 = 0
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4f9
            int r0 = r10.getInt(r1, r11)
            r6.zzi(r15, r0)
            goto L4f9
        L43c:
            r14 = 0
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4f9
            int r0 = r10.getInt(r1, r11)
            r6.zzI(r15, r0)
            goto L4f9
        L44c:
            r14 = 0
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4f9
            java.lang.Object r0 = r10.getObject(r1, r11)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzjo) r0
            r6.zzd(r15, r0)
            goto L4f9
        L45e:
            r14 = 0
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4f9
            java.lang.Object r5 = r10.getObject(r1, r11)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r7 = r0.zzv(r2)
            r6.zzv(r15, r5, r7)
            goto L4f9
        L472:
            r14 = 0
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4f9
            java.lang.Object r0 = r10.getObject(r1, r11)
            zzO(r15, r0, r6)
            goto L4f9
        L482:
            r14 = 0
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4f9
            boolean r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzw(r1, r11)
            r6.zzb(r15, r0)
            goto L4f9
        L491:
            r14 = 0
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4f9
            int r0 = r10.getInt(r1, r11)
            r6.zzk(r15, r0)
            goto L4f9
        L4a0:
            r14 = 0
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4f9
            long r11 = r10.getLong(r1, r11)
            r6.zzm(r15, r11)
            goto L4f9
        L4af:
            r14 = 0
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4f9
            int r0 = r10.getInt(r1, r11)
            r6.zzr(r15, r0)
            goto L4f9
        L4be:
            r14 = 0
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4f9
            long r11 = r10.getLong(r1, r11)
            r6.zzK(r15, r11)
            goto L4f9
        L4cd:
            r14 = 0
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4f9
            long r11 = r10.getLong(r1, r11)
            r6.zzt(r15, r11)
            goto L4f9
        L4dc:
            r14 = 0
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4f9
            float r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzb(r1, r11)
            r6.zzo(r15, r0)
            goto L4f9
        L4eb:
            r14 = 0
            boolean r5 = r0.zzJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4f9
            double r11 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zza(r1, r11)
            r6.zzf(r15, r11)
        L4f9:
            int r2 = r2 + 3
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r18
            goto L30
        L502:
            java.lang.Object r0 = r8.getKey()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzko r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzko) r0
            throw r16
        L509:
            r16 = 0
            if (r8 != 0) goto L516
            r0 = r1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r0 = r0.zzc
            r0.zzl(r6)
            return
        L516:
            java.lang.Object r0 = r8.getKey()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzko r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzko) r0
            throw r16
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi
    public final boolean zzj(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            int[] r2 = r7.zzc
            int r2 = r2.length
            if (r1 >= r2) goto L1c5
            int r2 = r7.zzs(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2 & r3
            int r2 = zzr(r2)
            long r4 = (long) r4
            switch(r2) {
                case 0: goto L1a6;
                case 1: goto L18d;
                case 2: goto L17a;
                case 3: goto L167;
                case 4: goto L156;
                case 5: goto L143;
                case 6: goto L131;
                case 7: goto L11f;
                case 8: goto L109;
                case 9: goto Lf3;
                case 10: goto Ldd;
                case 11: goto Lcb;
                case 12: goto Lb9;
                case 13: goto La7;
                case 14: goto L93;
                case 15: goto L81;
                case 16: goto L6d;
                case 17: goto L57;
                case 18: goto L47;
                case 19: goto L47;
                case 20: goto L47;
                case 21: goto L47;
                case 22: goto L47;
                case 23: goto L47;
                case 24: goto L47;
                case 25: goto L47;
                case 26: goto L47;
                case 27: goto L47;
                case 28: goto L47;
                case 29: goto L47;
                case 30: goto L47;
                case 31: goto L47;
                case 32: goto L47;
                case 33: goto L47;
                case 34: goto L47;
                case 35: goto L47;
                case 36: goto L47;
                case 37: goto L47;
                case 38: goto L47;
                case 39: goto L47;
                case 40: goto L47;
                case 41: goto L47;
                case 42: goto L47;
                case 43: goto L47;
                case 44: goto L47;
                case 45: goto L47;
                case 46: goto L47;
                case 47: goto L47;
                case 48: goto L47;
                case 49: goto L47;
                case 50: goto L3a;
                case 51: goto L1a;
                case 52: goto L1a;
                case 53: goto L1a;
                case 54: goto L1a;
                case 55: goto L1a;
                case 56: goto L1a;
                case 57: goto L1a;
                case 58: goto L1a;
                case 59: goto L1a;
                case 60: goto L1a;
                case 61: goto L1a;
                case 62: goto L1a;
                case 63: goto L1a;
                case 64: goto L1a;
                case 65: goto L1a;
                case 66: goto L1a;
                case 67: goto L1a;
                case 68: goto L1a;
                default: goto L18;
            }
        L18:
            goto L1c0
        L1a:
            int r2 = r7.zzp(r1)
            r2 = r2 & r3
            long r2 = (long) r2
            int r6 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r8, r2)
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r9, r2)
            if (r6 != r2) goto L1c4
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r8, r4)
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r4)
            boolean r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzE(r2, r3)
            if (r2 != 0) goto L1c0
            goto L1c4
        L3a:
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r8, r4)
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r4)
            boolean r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzE(r2, r3)
            goto L53
        L47:
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r8, r4)
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r4)
            boolean r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzE(r2, r3)
        L53:
            if (r2 != 0) goto L1c0
            goto L1c4
        L57:
            boolean r2 = r7.zzH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r8, r4)
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r4)
            boolean r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzE(r2, r3)
            if (r2 == 0) goto L1c4
            goto L1c0
        L6d:
            boolean r2 = r7.zzH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            long r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r8, r4)
            long r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r9, r4)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L1c4
            goto L1c0
        L81:
            boolean r2 = r7.zzH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r8, r4)
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r9, r4)
            if (r2 != r3) goto L1c4
            goto L1c0
        L93:
            boolean r2 = r7.zzH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            long r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r8, r4)
            long r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r9, r4)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L1c4
            goto L1c0
        La7:
            boolean r2 = r7.zzH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r8, r4)
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r9, r4)
            if (r2 != r3) goto L1c4
            goto L1c0
        Lb9:
            boolean r2 = r7.zzH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r8, r4)
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r9, r4)
            if (r2 != r3) goto L1c4
            goto L1c0
        Lcb:
            boolean r2 = r7.zzH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r8, r4)
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r9, r4)
            if (r2 != r3) goto L1c4
            goto L1c0
        Ldd:
            boolean r2 = r7.zzH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r8, r4)
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r4)
            boolean r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzE(r2, r3)
            if (r2 == 0) goto L1c4
            goto L1c0
        Lf3:
            boolean r2 = r7.zzH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r8, r4)
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r4)
            boolean r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzE(r2, r3)
            if (r2 == 0) goto L1c4
            goto L1c0
        L109:
            boolean r2 = r7.zzH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r8, r4)
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r4)
            boolean r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmk.zzE(r2, r3)
            if (r2 == 0) goto L1c4
            goto L1c0
        L11f:
            boolean r2 = r7.zzH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            boolean r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzw(r8, r4)
            boolean r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzw(r9, r4)
            if (r2 != r3) goto L1c4
            goto L1c0
        L131:
            boolean r2 = r7.zzH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r8, r4)
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r9, r4)
            if (r2 != r3) goto L1c4
            goto L1c0
        L143:
            boolean r2 = r7.zzH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            long r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r8, r4)
            long r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r9, r4)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L1c4
            goto L1c0
        L156:
            boolean r2 = r7.zzH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            int r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r8, r4)
            int r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzc(r9, r4)
            if (r2 != r3) goto L1c4
            goto L1c0
        L167:
            boolean r2 = r7.zzH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            long r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r8, r4)
            long r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r9, r4)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L1c4
            goto L1c0
        L17a:
            boolean r2 = r7.zzH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            long r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r8, r4)
            long r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzd(r9, r4)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L1c4
            goto L1c0
        L18d:
            boolean r2 = r7.zzH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            float r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzb(r8, r4)
            int r2 = java.lang.Float.floatToIntBits(r2)
            float r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzb(r9, r4)
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r2 != r3) goto L1c4
            goto L1c0
        L1a6:
            boolean r2 = r7.zzH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            double r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zza(r8, r4)
            long r2 = java.lang.Double.doubleToLongBits(r2)
            double r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zza(r9, r4)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L1c4
        L1c0:
            int r1 = r1 + 3
            goto L2
        L1c4:
            return r0
        L1c5:
            r1 = r8
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r1 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r1 = r1.zzc
            r2 = r9
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr) r2
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmx r2 = r2.zzc
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1d6
            return r0
        L1d6:
            boolean r0 = r7.zzh
            if (r0 == 0) goto L1e7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn r8 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn) r8
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg r8 = r8.zzb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn r9 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn) r9
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg r9 = r9.zzb
            boolean r8 = r8.equals(r9)
            return r8
        L1e7:
            r8 = 1
            return r8
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi
    public final boolean zzk(java.lang.Object r15) {
            r14 = this;
            r0 = 0
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = 0
        L9:
            int r5 = r14.zzj
            r6 = 1
            if (r2 >= r5) goto Lcf
            int[] r5 = r14.zzi
            int[] r7 = r14.zzc
            r10 = r5[r2]
            r5 = r7[r10]
            int r7 = r14.zzs(r10)
            int[] r8 = r14.zzc
            int r9 = r10 + 2
            r8 = r8[r9]
            r9 = r8 & r1
            int r8 = r8 >>> 20
            int r13 = r6 << r8
            if (r9 == r3) goto L34
            if (r9 == r1) goto L31
            long r3 = (long) r9
            sun.misc.Unsafe r6 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzlz.zzb
            int r4 = r6.getInt(r15, r3)
        L31:
            r12 = r4
            r11 = r9
            goto L36
        L34:
            r11 = r3
            r12 = r4
        L36:
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r3 = r3 & r7
            r8 = r14
            r9 = r15
            if (r3 == 0) goto L45
            boolean r15 = r8.zzJ(r9, r10, r11, r12, r13)
            if (r15 == 0) goto L44
            goto L45
        L44:
            return r0
        L45:
            int r15 = zzr(r7)
            r3 = 9
            if (r15 == r3) goto Lb7
            r3 = 17
            if (r15 == r3) goto Lb7
            r3 = 27
            if (r15 == r3) goto L8f
            r3 = 60
            if (r15 == r3) goto L7e
            r3 = 68
            if (r15 == r3) goto L7e
            r3 = 49
            if (r15 == r3) goto L8f
            r3 = 50
            if (r15 == r3) goto L66
            goto Lc8
        L66:
            r15 = r7 & r1
            long r3 = (long) r15
            java.lang.Object r15 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r3)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlq r15 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlq) r15
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L76
            goto Lc8
        L76:
            java.lang.Object r15 = r14.zzw(r10)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlp r15 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlp) r15
            r15 = 0
            throw r15
        L7e:
            boolean r15 = r14.zzM(r9, r5, r10)
            if (r15 == 0) goto Lc8
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r15 = r14.zzv(r10)
            boolean r15 = zzK(r9, r7, r15)
            if (r15 != 0) goto Lc8
            return r0
        L8f:
            r15 = r7 & r1
            long r3 = (long) r15
            java.lang.Object r15 = com.google.android.gms.internal.mlkit_vision_mediapipe.zznd.zzf(r9, r3)
            java.util.List r15 = (java.util.List) r15
            boolean r3 = r15.isEmpty()
            if (r3 != 0) goto Lc8
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r3 = r14.zzv(r10)
            r4 = 0
        La3:
            int r5 = r15.size()
            if (r4 >= r5) goto Lc8
            java.lang.Object r5 = r15.get(r4)
            boolean r5 = r3.zzk(r5)
            if (r5 != 0) goto Lb4
            return r0
        Lb4:
            int r4 = r4 + 1
            goto La3
        Lb7:
            boolean r15 = r8.zzJ(r9, r10, r11, r12, r13)
            if (r15 == 0) goto Lc8
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r15 = r14.zzv(r10)
            boolean r15 = zzK(r9, r7, r15)
            if (r15 != 0) goto Lc8
            return r0
        Lc8:
            int r2 = r2 + 1
            r15 = r9
            r3 = r11
            r4 = r12
            goto L9
        Lcf:
            r8 = r14
            r9 = r15
            boolean r15 = r8.zzh
            if (r15 == 0) goto Le1
            r15 = r9
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn r15 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkn) r15
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkg r15 = r15.zzb
            boolean r15 = r15.zzl()
            if (r15 != 0) goto Le1
            return r0
        Le1:
            return r6
    }
}
