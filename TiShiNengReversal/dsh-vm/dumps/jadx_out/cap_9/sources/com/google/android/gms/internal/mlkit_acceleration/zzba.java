package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzba {
    private final java.lang.String zza;
    private volatile java.util.logging.Logger zzb;

    zzba(java.lang.Class r1) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = r1.getName()
            r0.zza = r1
            return
    }

    final java.util.logging.Logger zza() {
            r1 = this;
            java.util.logging.Logger r0 = r1.zzb
            if (r0 == 0) goto L5
            return r0
        L5:
            monitor-enter(r1)
            java.util.logging.Logger r0 = r1.zzb     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            return r0
        Lc:
            r0 = move-exception
            goto L18
        Le:
            java.lang.String r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)     // Catch: java.lang.Throwable -> Lc
            r1.zzb = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            return r0
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }
}
