package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzdv extends java.lang.RuntimeException {
    private zzdv(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv zza(java.lang.String r2, java.lang.String r3, int r4) {
            int r0 = r4 + 1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv
            java.lang.String r2 = zze(r2, r3, r4, r0)
            r1.<init>(r2, r3)
            return r1
    }

    public static com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv zzb(java.lang.String r1, java.lang.String r2) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv zzc(java.lang.String r1, java.lang.String r2, int r3, int r4) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv
            java.lang.String r1 = zze(r1, r2, r3, r4)
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv zzd(java.lang.String r2, java.lang.String r3, int r4) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv
            r1 = -1
            java.lang.String r2 = zze(r2, r3, r4, r1)
            r0.<init>(r2, r3)
            return r0
    }

    private static java.lang.String zze(java.lang.String r3, java.lang.String r4, int r5, int r6) {
            if (r6 >= 0) goto L6
            int r6 = r4.length()
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            java.lang.String r3 = "..."
            r1 = 8
            if (r5 <= r1) goto L1f
            r0.append(r3)
            int r2 = r5 + (-5)
            r0.append(r4, r2, r5)
            goto L23
        L1f:
            r2 = 0
            r0.append(r4, r2, r5)
        L23:
            r2 = 91
            r0.append(r2)
            java.lang.String r5 = r4.substring(r5, r6)
            r0.append(r5)
            r5 = 93
            r0.append(r5)
            int r5 = r4.length()
            int r5 = r5 - r6
            if (r5 <= r1) goto L44
            int r5 = r6 + 5
            r0.append(r4, r6, r5)
            r0.append(r3)
            goto L4b
        L44:
            int r3 = r4.length()
            r0.append(r4, r6, r3)
        L4b:
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // java.lang.Throwable
    public final synchronized java.lang.Throwable fillInStackTrace() {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return r0
    }
}
