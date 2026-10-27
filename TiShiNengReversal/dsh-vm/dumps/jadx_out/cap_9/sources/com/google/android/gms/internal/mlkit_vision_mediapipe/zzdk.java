package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
enum zzdk extends java.lang.Enum {
    public static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk zza = null;
    public static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk zzb = null;
    public static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk zzc = null;
    public static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk zzd = null;
    private static final /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk[] zze = null;

    static {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk
            java.lang.String r1 = "BOOLEAN"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk.zza = r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk
            java.lang.String r3 = "STRING"
            r4 = 1
            r1.<init>(r3, r4)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk.zzb = r1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk r3 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk
            java.lang.String r5 = "LONG"
            r6 = 2
            r3.<init>(r5, r6)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk.zzc = r3
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk r5 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk
            java.lang.String r7 = "DOUBLE"
            r8 = 3
            r5.<init>(r7, r8)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk.zzd = r5
            r7 = 4
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk[] r7 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk.zze = r7
            return
    }

    zzdk(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk[] values() {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk[] r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk.zze
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk[] r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk[]) r0
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk zza(java.lang.Object r2) {
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L7
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk.zzb
            return r2
        L7:
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto Le
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk.zza
            return r2
        Le:
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto L15
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk.zzc
            return r2
        L15:
            boolean r0 = r2 instanceof java.lang.Double
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzdk.zzd
            return r2
        L1c:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "invalid tag type: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
    }
}
