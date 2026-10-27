package com.google.android.gms.internal.mlkit_acceleration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzaw extends java.util.concurrent.locks.AbstractOwnableSynchronizer implements java.lang.Runnable {
    private final com.google.android.gms.internal.mlkit_acceleration.zzaz zza;

    /* synthetic */ zzaw(com.google.android.gms.internal.mlkit_acceleration.zzaz r1, com.google.android.gms.internal.mlkit_acceleration.zzav r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    static /* synthetic */ void zza(com.google.android.gms.internal.mlkit_acceleration.zzaw r0, java.lang.Thread r1) {
            super.setExclusiveOwnerThread(r1)
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r0 = this;
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzaz r0 = r1.zza
            java.lang.String r0 = r0.toString()
            return r0
    }
}
