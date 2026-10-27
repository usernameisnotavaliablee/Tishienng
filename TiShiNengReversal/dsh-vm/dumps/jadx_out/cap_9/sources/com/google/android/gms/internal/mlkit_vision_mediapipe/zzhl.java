package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzhl extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzhx {
    public zzhl(com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private final native long zzh(long r1, android.graphics.Bitmap r3);

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv zza(android.graphics.Bitmap r3) {
            r2 = this;
            android.graphics.Bitmap$Config r0 = r3.getConfig()
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 != r1) goto L17
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r0 = r2.zza
            long r0 = r0.zza()
            long r0 = r2.zzh(r0, r3)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv.zzd(r0)
            return r3
        L17:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "bitmap must use ARGB_8888 config."
            r3.<init>(r0)
            throw r3
    }
}
