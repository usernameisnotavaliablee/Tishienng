package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzba implements com.google.android.gms.internal.mlkit_vision_mediapipe.zzah {
    private static final java.util.Set zza = null;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.StringBuilder zzd;
    private boolean zze;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 7
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r3 = 0
            r1[r3] = r2
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            r3 = 1
            r1[r3] = r2
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            r3 = 2
            r1[r3] = r2
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r3 = 3
            r1[r3] = r2
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            r3 = 4
            r1[r3] = r2
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            r3 = 5
            r1[r3] = r2
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            r3 = 6
            r1[r3] = r2
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzba.zza = r0
            return
    }

    public zzba(java.lang.String r1, java.lang.String r2, java.lang.StringBuilder r3) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.zze = r1
            java.lang.String r1 = "[CONTEXT "
            r0.zzb = r1
            java.lang.String r1 = " ]"
            r0.zzc = r1
            r0.zzd = r3
            return
    }

    private static int zzc(java.lang.String r2, int r3) {
        L0:
            int r0 = r2.length()
            if (r3 >= r0) goto L1b
            char r0 = r2.charAt(r3)
            r1 = 32
            if (r0 < r1) goto L1a
            r1 = 34
            if (r0 == r1) goto L1a
            r1 = 92
            if (r0 != r1) goto L17
            goto L1a
        L17:
            int r3 = r3 + 1
            goto L0
        L1a:
            return r3
        L1b:
            r2 = -1
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzah
    public final void zza(java.lang.String r8, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r9) {
            r7 = this;
            boolean r0 = r7.zze
            r1 = -1
            r2 = 32
            r3 = 1
            r4 = 10
            if (r0 == 0) goto L10
            java.lang.StringBuilder r0 = r7.zzd
            r0.append(r2)
            goto L3a
        L10:
            java.lang.StringBuilder r0 = r7.zzd
            int r0 = r0.length()
            if (r0 <= 0) goto L31
            java.lang.StringBuilder r0 = r7.zzd
            int r5 = r0.length()
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r5 > r6) goto L2c
            java.lang.StringBuilder r5 = r7.zzd
            java.lang.String r6 = "\n"
            int r5 = r5.indexOf(r6)
            if (r5 == r1) goto L2e
        L2c:
            r2 = 10
        L2e:
            r0.append(r2)
        L31:
            java.lang.StringBuilder r0 = r7.zzd
            java.lang.String r2 = r7.zzb
            r0.append(r2)
            r7.zze = r3
        L3a:
            java.lang.StringBuilder r0 = r7.zzd
            r0.append(r8)
            r8 = 61
            r0.append(r8)
            if (r9 != 0) goto L4a
            r0.append(r3)
            return
        L4a:
            java.util.Set r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzba.zza
            java.lang.Class r2 = r9.getClass()
            boolean r8 = r8.contains(r2)
            if (r8 == 0) goto L5a
            r0.append(r9)
            return
        L5a:
            r8 = 34
            r0.append(r8)
            java.lang.String r9 = r9.toString()
            r2 = 0
        L64:
            int r3 = zzc(r9, r2)
            if (r3 == r1) goto L9b
            r0.append(r9, r2, r3)
            int r2 = r3 + 1
            char r3 = r9.charAt(r3)
            r5 = 9
            if (r3 == r5) goto L90
            if (r3 == r4) goto L8d
            r5 = 13
            if (r3 == r5) goto L8a
            if (r3 == r8) goto L92
            r5 = 92
            if (r3 == r5) goto L92
            r3 = 65533(0xfffd, float:9.1831E-41)
            r0.append(r3)
            goto L64
        L8a:
            r3 = 114(0x72, float:1.6E-43)
            goto L92
        L8d:
            r3 = 110(0x6e, float:1.54E-43)
            goto L92
        L90:
            r3 = 116(0x74, float:1.63E-43)
        L92:
            java.lang.String r5 = "\\"
            r0.append(r5)
            r0.append(r3)
            goto L64
        L9b:
            int r1 = r9.length()
            r0.append(r9, r2, r1)
            r0.append(r8)
            return
    }

    public final void zzb() {
            r2 = this;
            boolean r0 = r2.zze
            if (r0 == 0) goto Lb
            java.lang.StringBuilder r0 = r2.zzd
            java.lang.String r1 = r2.zzc
            r0.append(r1)
        Lb:
            return
    }
}
