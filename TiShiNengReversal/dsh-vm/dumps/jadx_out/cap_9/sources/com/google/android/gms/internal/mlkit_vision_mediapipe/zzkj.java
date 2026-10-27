package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzkj implements com.google.android.gms.internal.mlkit_vision_mediapipe.zzlu {
    private static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzkj zza = null;

    static {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkj r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzkj
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkj.zza = r0
            return
    }

    private zzkj() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_mediapipe.zzkj zza() {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkj r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkj.zza
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzlu
    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzlt zzb(java.lang.Class r4) {
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr> r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr.class
            boolean r1 = r0.isAssignableFrom(r4)
            if (r1 == 0) goto L2a
            java.lang.Class r0 = r4.asSubclass(r0)     // Catch: java.lang.Exception -> L19
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr.zzs(r0)     // Catch: java.lang.Exception -> L19
            r1 = 3
            r2 = 0
            java.lang.Object r0 = r0.zzb(r1, r2, r2)     // Catch: java.lang.Exception -> L19
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzlt r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzlt) r0     // Catch: java.lang.Exception -> L19
            return r0
        L19:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r4 = r4.getName()
            java.lang.String r2 = "Unable to get message info for "
            java.lang.String r4 = r2.concat(r4)
            r1.<init>(r4, r0)
            throw r1
        L2a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.getName()
            java.lang.String r1 = "Unsupported message type: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzlu
    public final boolean zzc(java.lang.Class r2) {
            r1 = this;
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr> r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr.class
            boolean r2 = r0.isAssignableFrom(r2)
            return r2
    }
}
