package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzfi {
    private static final com.google.android.gms.internal.mlkit_acceleration.zzfi zza = null;
    private final com.google.android.gms.internal.mlkit_acceleration.zzfn zzb;
    private final java.util.concurrent.ConcurrentMap zzc;

    static {
            com.google.android.gms.internal.mlkit_acceleration.zzfi r0 = new com.google.android.gms.internal.mlkit_acceleration.zzfi
            r0.<init>()
            com.google.android.gms.internal.mlkit_acceleration.zzfi.zza = r0
            return
    }

    private zzfi() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.zzc = r0
            com.google.android.gms.internal.mlkit_acceleration.zzes r0 = new com.google.android.gms.internal.mlkit_acceleration.zzes
            r0.<init>()
            r1.zzb = r0
            return
    }

    public static com.google.android.gms.internal.mlkit_acceleration.zzfi zza() {
            com.google.android.gms.internal.mlkit_acceleration.zzfi r0 = com.google.android.gms.internal.mlkit_acceleration.zzfi.zza
            return r0
    }

    public final com.google.android.gms.internal.mlkit_acceleration.zzfm zzb(java.lang.Class r3) {
            r2 = this;
            java.lang.String r0 = "messageType"
            com.google.android.gms.internal.mlkit_acceleration.zzeb.zzc(r3, r0)
            java.util.concurrent.ConcurrentMap r1 = r2.zzc
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.internal.mlkit_acceleration.zzfm r1 = (com.google.android.gms.internal.mlkit_acceleration.zzfm) r1
            if (r1 != 0) goto L24
            com.google.android.gms.internal.mlkit_acceleration.zzfn r1 = r2.zzb
            com.google.android.gms.internal.mlkit_acceleration.zzfm r1 = r1.zza(r3)
            com.google.android.gms.internal.mlkit_acceleration.zzeb.zzc(r3, r0)
            java.util.concurrent.ConcurrentMap r0 = r2.zzc
            java.lang.Object r3 = r0.putIfAbsent(r3, r1)
            com.google.android.gms.internal.mlkit_acceleration.zzfm r3 = (com.google.android.gms.internal.mlkit_acceleration.zzfm) r3
            if (r3 != 0) goto L23
            return r1
        L23:
            return r3
        L24:
            return r1
    }
}
