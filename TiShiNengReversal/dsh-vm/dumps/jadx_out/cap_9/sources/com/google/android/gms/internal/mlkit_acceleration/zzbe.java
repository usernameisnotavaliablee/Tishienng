package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzbe extends com.google.android.gms.internal.mlkit_acceleration.zzaj.zzi implements java.lang.Runnable {
    private final java.lang.Runnable zzc;

    public zzbe(java.lang.Runnable r1) {
            r0 = this;
            r0.<init>()
            r1.getClass()
            r0.zzc = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            java.lang.Runnable r0 = r1.zzc     // Catch: java.lang.Throwable -> L6
            r0.run()     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r0 = move-exception
            r1.zzl(r0)
            throw r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzaj
    protected final java.lang.String zze() {
            r3 = this;
            java.lang.Runnable r0 = r3.zzc
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "task=["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
