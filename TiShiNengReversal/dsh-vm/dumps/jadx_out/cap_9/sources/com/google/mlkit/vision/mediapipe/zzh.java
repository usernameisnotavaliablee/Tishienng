package com.google.mlkit.vision.mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzh implements com.google.mlkit.vision.mediapipe.MediaPipeInput {
    private final android.graphics.Bitmap zza;
    private final long zzb;

    zzh(android.graphics.Bitmap r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeInput
    public final long zza() {
            r2 = this;
            long r0 = r2.zzb
            return r0
    }

    @Override // com.google.mlkit.vision.mediapipe.MediaPipeInput
    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv zzb(com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl r4) {
            r3 = this;
            android.graphics.Bitmap r0 = r3.zza
            android.graphics.Bitmap$Config r0 = r0.getConfig()
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 == r1) goto L31
            java.lang.String r0 = "MediaPipeInputBitmap"
            r2 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r2)
            if (r0 == 0) goto L22
            android.graphics.Bitmap r0 = r3.zza
            android.graphics.Bitmap$Config r0 = r0.getConfig()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Input bitmap is not ARGB_8888 config. Converting it to ARGB_8888 from "
            r2.concat(r0)
        L22:
            android.graphics.Bitmap r0 = r3.zza
            boolean r2 = r0.isMutable()
            android.graphics.Bitmap r0 = r0.copy(r1, r2)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r4 = r4.zza(r0)
            return r4
        L31:
            android.graphics.Bitmap r0 = r3.zza
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r4 = r4.zza(r0)
            return r4
    }
}
