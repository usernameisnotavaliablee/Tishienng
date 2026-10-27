package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzsv {

    @androidx.annotation.Nullable
    private static com.google.android.gms.internal.mlkit_common.zzsv zza;

    private zzsv() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized com.google.android.gms.internal.mlkit_common.zzsv zza() {
            java.lang.Class<com.google.android.gms.internal.mlkit_common.zzsv> r0 = com.google.android.gms.internal.mlkit_common.zzsv.class
            monitor-enter(r0)
            com.google.android.gms.internal.mlkit_common.zzsv r1 = com.google.android.gms.internal.mlkit_common.zzsv.zza     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.google.android.gms.internal.mlkit_common.zzsv r1 = new com.google.android.gms.internal.mlkit_common.zzsv     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.internal.mlkit_common.zzsv.zza = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            com.google.android.gms.internal.mlkit_common.zzsv r1 = com.google.android.gms.internal.mlkit_common.zzsv.zza     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public static void zzb() {
            com.google.android.gms.internal.mlkit_common.zzsu.zza()
            return
    }
}
