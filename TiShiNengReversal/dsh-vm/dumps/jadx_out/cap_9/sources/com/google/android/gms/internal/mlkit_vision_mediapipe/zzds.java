package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzds extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzdw {
    private static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzdw zza = null;

    static {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzds r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzds
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzds.zza = r0
            return
    }

    private zzds() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_mediapipe.zzdw zzb() {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdw r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzds.zza
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzdw
    public final int zza(com.google.android.gms.internal.mlkit_vision_mediapipe.zzdt r7, int r8, java.lang.String r9, int r10, int r11, int r12) throws com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv {
            r6 = this;
            char r0 = r9.charAt(r12)
            r1 = r0 & 32
            r2 = 0
            if (r1 != 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r11 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzay.zzg(r9, r11, r12, r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzax r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzax.zzc(r0)
            int r3 = r12 + 1
            if (r1 == 0) goto L2a
            boolean r12 = r11.zzi(r1)
            if (r12 == 0) goto L23
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdq r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdq.zza(r8, r1, r11)
            goto L74
        L23:
            java.lang.String r7 = "invalid format specifier"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zzc(r7, r9, r10, r3)
            throw r7
        L2a:
            r1 = 116(0x74, float:1.63E-43)
            r4 = 160(0xa0, float:2.24E-43)
            java.lang.String r5 = "invalid format specification"
            if (r0 == r1) goto L57
            r1 = 84
            if (r0 != r1) goto L37
            goto L57
        L37:
            r12 = 104(0x68, float:1.46E-43)
            if (r0 == r12) goto L45
            r12 = 72
            if (r0 != r12) goto L40
            goto L45
        L40:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zzc(r5, r9, r10, r3)
            throw r7
        L45:
            boolean r12 = r11.zzl(r4, r2)
            if (r12 == 0) goto L52
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdr r9 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdr
            r9.<init>(r11, r8, r11)
            r8 = r9
            goto L74
        L52:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zzc(r5, r9, r10, r3)
            throw r7
        L57:
            boolean r0 = r11.zzl(r4, r2)
            if (r0 == 0) goto L86
            int r12 = r12 + 2
            int r0 = r9.length()
            if (r12 > r0) goto L7f
            char r0 = r9.charAt(r3)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdm r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdm.zzb(r0)
            if (r0 == 0) goto L78
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdo r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdn.zza(r0, r11, r8)
            r3 = r12
        L74:
            r7.zzl(r10, r3, r8)
            return r3
        L78:
            java.lang.String r7 = "illegal date/time conversion"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zza(r7, r9, r3)
            throw r7
        L7f:
            java.lang.String r7 = "truncated format specifier"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zza(r7, r9, r10)
            throw r7
        L86:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r7 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv.zzc(r5, r9, r10, r3)
            throw r7
    }
}
