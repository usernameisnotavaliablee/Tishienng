package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzhk {
    public zzhk() {
            r1 = this;
            r1.<init>()
            return
    }

    public static synchronized boolean zza(android.content.Context r2) {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_mediapipe.zzhk> r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzhk.class
            monitor-enter(r0)
            java.io.File r1 = r2.getCacheDir()     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L11
            boolean r2 = zzb(r2, r1)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r2
        L11:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    private static native boolean zzb(android.content.Context r0, java.lang.String r1);
}
