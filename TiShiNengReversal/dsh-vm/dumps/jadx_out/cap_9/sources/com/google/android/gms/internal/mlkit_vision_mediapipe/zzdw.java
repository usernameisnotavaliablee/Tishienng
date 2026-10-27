package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zzdw extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzdu {
    private static final java.lang.String zza = null;

    static {
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> Le
            java.lang.String r1 = "\\n|\\r(?:\\n)?"
            boolean r1 = r0.matches(r1)     // Catch: java.lang.SecurityException -> Le
            if (r1 != 0) goto L10
        Le:
            java.lang.String r0 = "\n"
        L10:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdw.zza = r0
            return
    }

    public zzdw() {
            r0 = this;
            r0.<init>()
            return
    }

    static int zze(java.lang.String r3, int r4) throws com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv {
        L0:
            int r0 = r3.length()
            if (r4 >= r0) goto L2e
            int r0 = r4 + 1
            char r1 = r3.charAt(r4)
            r2 = 37
            if (r1 == r2) goto L12
            r4 = r0
            goto L0
        L12:
            int r1 = r3.length()
            if (r0 >= r1) goto L27
            char r0 = r3.charAt(r0)
            if (r0 == r2) goto L24
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 != r1) goto L23
            goto L24
        L23:
            return r4
        L24:
            int r4 = r4 + 2
            goto L0
        L27:
            java.lang.String r0 = "trailing unquoted '%' character"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zzd(r0, r3, r4)
            throw r3
        L2e:
            r3 = -1
            return r3
    }

    abstract int zza(com.google.android.gms.internal.mlkit_vision_mediapipe.zzdt r1, int r2, java.lang.String r3, int r4, int r5, int r6) throws com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv;

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzdu
    protected final void zzc(com.google.android.gms.internal.mlkit_vision_mediapipe.zzdt r15) throws com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv {
            r14 = this;
            java.lang.String r3 = r15.zzk()
            r7 = 0
            int r0 = zze(r3, r7)
            r8 = -1
            r4 = r0
            r0 = 0
            r1 = -1
        Ld:
            if (r4 < 0) goto Lca
            int r2 = r4 + 1
            r5 = r2
            r6 = 0
        L13:
            int r9 = r3.length()
            java.lang.String r10 = "unterminated parameter"
            if (r5 >= r9) goto Lc5
            int r9 = r5 + 1
            char r11 = r3.charAt(r5)
            int r12 = r11 + (-48)
            char r12 = (char) r12
            r13 = 10
            if (r12 >= r13) goto L39
            int r6 = r6 * 10
            int r6 = r6 + r12
            r5 = 1000000(0xf4240, float:1.401298E-39)
            if (r6 >= r5) goto L32
            r5 = r9
            goto L13
        L32:
            java.lang.String r15 = "index too large"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r15 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zzc(r15, r3, r4, r9)
            throw r15
        L39:
            r12 = 36
            if (r11 != r12) goto L6f
            int r1 = r5 - r2
            if (r1 == 0) goto L68
            char r1 = r3.charAt(r2)
            r2 = 48
            if (r1 == r2) goto L61
            int r6 = r6 + (-1)
            int r1 = r3.length()
            if (r9 == r1) goto L5c
            int r5 = r5 + 2
            r3.charAt(r9)
            r2 = r9
            r9 = r0
            r0 = r5
            r5 = r2
            r2 = r6
            goto L98
        L5c:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r15 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zzd(r10, r3, r4)
            throw r15
        L61:
            java.lang.String r15 = "index has leading zero"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r15 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zzc(r15, r3, r4, r9)
            throw r15
        L68:
            java.lang.String r15 = "missing index"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r15 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zzc(r15, r3, r4, r9)
            throw r15
        L6f:
            r6 = 60
            if (r11 != r6) goto L92
            if (r1 == r8) goto L8b
            int r2 = r3.length()
            if (r9 == r2) goto L86
            int r5 = r5 + 2
            r3.charAt(r9)
            r2 = r9
            r9 = r0
            r0 = r5
            r5 = r2
            r2 = r1
            goto L98
        L86:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r15 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zzd(r10, r3, r4)
            throw r15
        L8b:
            java.lang.String r15 = "invalid relative parameter"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r15 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zzc(r15, r3, r4, r9)
            throw r15
        L92:
            int r1 = r0 + 1
            r5 = r2
            r2 = r0
            r0 = r9
            r9 = r1
        L98:
            int r0 = r0 + r8
            r6 = r0
        L9a:
            int r0 = r3.length()
            if (r6 >= r0) goto Lc0
            char r0 = r3.charAt(r6)
            r0 = r0 & (-33)
            int r0 = r0 + (-65)
            char r0 = (char) r0
            r1 = 26
            if (r0 >= r1) goto Lbc
            r0 = r14
            r1 = r15
            int r15 = r0.zza(r1, r2, r3, r4, r5, r6)
            int r4 = zze(r3, r15)
            r15 = r1
            r1 = r2
            r0 = r9
            goto Ld
        Lbc:
            r1 = r15
            int r6 = r6 + 1
            goto L9a
        Lc0:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r15 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zzd(r10, r3, r4)
            throw r15
        Lc5:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r15 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zzd(r10, r3, r4)
            throw r15
        Lca:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzdu
    public final void zzd(java.lang.StringBuilder r5, java.lang.String r6, int r7, int r8) {
            r4 = this;
            r0 = r7
        L1:
            if (r7 >= r8) goto L2d
            int r1 = r7 + 1
            char r2 = r6.charAt(r7)
            r3 = 37
            if (r2 == r3) goto Le
            goto L2b
        Le:
            if (r1 != r8) goto L11
            goto L2d
        L11:
            char r2 = r6.charAt(r1)
            if (r2 != r3) goto L1b
            r5.append(r6, r0, r1)
            goto L27
        L1b:
            r3 = 110(0x6e, float:1.54E-43)
            if (r2 != r3) goto L2b
            r5.append(r6, r0, r7)
            java.lang.String r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdw.zza
            r5.append(r0)
        L27:
            int r0 = r7 + 2
            r7 = r0
            goto L1
        L2b:
            r7 = r1
            goto L1
        L2d:
            if (r0 >= r8) goto L32
            r5.append(r6, r0, r8)
        L32:
            return
    }
}
