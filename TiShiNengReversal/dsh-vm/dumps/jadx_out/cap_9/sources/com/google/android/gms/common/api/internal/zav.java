package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zav implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaaa zaa;

    zav(com.google.android.gms.common.api.internal.zaaa r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.common.api.internal.zaaa r0 = r2.zaa
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaa.zaj(r0)
            r0.lock()
            com.google.android.gms.common.api.internal.zaaa r0 = r2.zaa     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.common.api.internal.zaaa.zap(r0)     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.common.api.internal.zaaa r0 = r2.zaa
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaa.zaj(r0)
            r0.unlock()
            return
        L18:
            r0 = move-exception
            com.google.android.gms.common.api.internal.zaaa r1 = r2.zaa
            java.util.concurrent.locks.Lock r1 = com.google.android.gms.common.api.internal.zaaa.zaj(r1)
            r1.unlock()
            throw r0
    }
}
