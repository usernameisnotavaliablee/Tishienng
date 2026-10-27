package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzas implements com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa {
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa zza;
    private final java.lang.Object zzb;

    private zzas(com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa r2, java.lang.Object r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "log site key"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zza(r2, r0)
            r1.zza = r2
            java.lang.String r2 = "log site qualifier"
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzdy.zza(r3, r2)
            r1.zzb = r3
            return
    }

    static com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa zza(com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa r1, java.lang.Object r2) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzas r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzas
            r0.<init>(r1, r2)
            return r0
    }

    public final boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_mediapipe.zzas
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzas r4 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzas) r4
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa r0 = r3.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa r2 = r4.zza
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r3.zzb
            java.lang.Object r4 = r4.zzb
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L1e
            r4 = 1
            return r4
        L1e:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.zzb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa r1 = r2.zza
            int r1 = r1.hashCode()
            int r0 = r0.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.Object r0 = r4.zzb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzaa r1 = r4.zza
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "SpecializedLogSiteKey{ delegate='"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "', qualifier='"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = "' }"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
