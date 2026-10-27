package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzbg {
    public zzbg() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.google.android.gms.internal.mlkit_acceleration.zzbb zza(java.util.concurrent.ExecutorService r1) {
            boolean r0 = r1 instanceof com.google.android.gms.internal.mlkit_acceleration.zzbb
            if (r0 == 0) goto L7
            com.google.android.gms.internal.mlkit_acceleration.zzbb r1 = (com.google.android.gms.internal.mlkit_acceleration.zzbb) r1
            return r1
        L7:
            boolean r0 = r1 instanceof java.util.concurrent.ScheduledExecutorService
            if (r0 == 0) goto L13
            com.google.android.gms.internal.mlkit_acceleration.zzbf r0 = new com.google.android.gms.internal.mlkit_acceleration.zzbf
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            r0.<init>(r1)
            return r0
        L13:
            com.google.android.gms.internal.mlkit_acceleration.zzbc r0 = new com.google.android.gms.internal.mlkit_acceleration.zzbc
            r0.<init>(r1)
            return r0
    }
}
