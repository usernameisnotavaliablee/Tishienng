package com.google.android.gms.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzv extends com.google.android.gms.common.zzx {
    private final java.util.concurrent.Callable zze;

    /* synthetic */ zzv(java.util.concurrent.Callable r8, com.google.android.gms.common.zzu r9) {
            r7 = this;
            r5 = 0
            r6 = 0
            r1 = 0
            r2 = 1
            r3 = 5
            r4 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.zze = r8
            return
    }

    @Override // com.google.android.gms.common.zzx
    final java.lang.String zza() {
            r2 = this;
            java.util.concurrent.Callable r0 = r2.zze     // Catch: java.lang.Exception -> L9
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L9
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }
}
