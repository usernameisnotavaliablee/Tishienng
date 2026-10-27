package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzdq extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzdo {
    private static final java.util.Map zza = null;
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzax zzb;

    static {
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_mediapipe.zzax> r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzax.class
            r0.<init>(r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzax[] r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzax.values()
            int r2 = r1.length
            r3 = 0
            r4 = 0
        Le:
            if (r4 >= r2) goto L2d
            r5 = r1[r4]
            r6 = 10
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdq[] r7 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdq[r6]
            r8 = 0
        L17:
            if (r8 >= r6) goto L27
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdq r9 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdq
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r10 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzay.zzf()
            r9.<init>(r8, r5, r10)
            r7[r8] = r9
            int r8 = r8 + 1
            goto L17
        L27:
            r0.put(r5, r7)
            int r4 = r4 + 1
            goto Le
        L2d:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdq.zza = r0
            return
    }

    private zzdq(int r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zzax r3, com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r4) {
            r1 = this;
            r1.<init>(r4, r2)
            java.lang.String r2 = "format char"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zza(r3, r2)
            r1.zzb = r3
            boolean r2 = r4.zzj()
            if (r2 != 0) goto L2d
            char r2 = r3.zza()
            boolean r3 = r4.zzk()
            if (r3 == 0) goto L1e
            r3 = 65503(0xffdf, float:9.1789E-41)
            r2 = r2 & r3
        L1e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "%"
            r3.<init>(r0)
            r4.zzh(r3)
            char r2 = (char) r2
            r3.append(r2)
            return
        L2d:
            r3.zze()
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_mediapipe.zzdq zza(int r1, com.google.android.gms.internal.mlkit_vision_mediapipe.zzax r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r3) {
            r0 = 10
            if (r1 >= r0) goto L15
            boolean r0 = r3.zzj()
            if (r0 == 0) goto L15
            java.util.Map r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdq.zza
            java.lang.Object r2 = r3.get(r2)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdq[] r2 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzdq[]) r2
            r1 = r2[r1]
            return r1
        L15:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdq r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdq
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzdo
    protected final void zzb(com.google.android.gms.internal.mlkit_vision_mediapipe.zzdp r3, java.lang.Object r4) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzax r0 = r2.zzb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzay r1 = r2.zzd()
            r3.zzd(r4, r0, r1)
            return
    }
}
