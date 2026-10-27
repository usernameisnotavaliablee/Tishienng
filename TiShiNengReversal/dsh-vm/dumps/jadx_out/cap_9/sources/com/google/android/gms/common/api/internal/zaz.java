package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zaz implements com.google.android.gms.common.api.internal.zabz {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaaa zaa;

    /* synthetic */ zaz(com.google.android.gms.common.api.internal.zaaa r1, com.google.android.gms.common.api.internal.zay r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zaaa r0 = r1.zaa
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaa.zaj(r0)
            r0.lock()
            com.google.android.gms.common.api.internal.zaaa r0 = r1.zaa     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.common.api.internal.zaaa.zal(r0, r2)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.common.api.internal.zaaa r2 = r1.zaa     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.common.api.internal.zaaa.zap(r2)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.common.api.internal.zaaa r2 = r1.zaa
            java.util.concurrent.locks.Lock r2 = com.google.android.gms.common.api.internal.zaaa.zaj(r2)
            r2.unlock()
            return
        L1d:
            r2 = move-exception
            com.google.android.gms.common.api.internal.zaaa r0 = r1.zaa
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaa.zaj(r0)
            r0.unlock()
            throw r2
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zaaa r2 = r1.zaa
            java.util.concurrent.locks.Lock r2 = com.google.android.gms.common.api.internal.zaaa.zaj(r2)
            r2.lock()
            com.google.android.gms.common.api.internal.zaaa r2 = r1.zaa     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.common.ConnectionResult r0 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.common.api.internal.zaaa.zal(r2, r0)     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.common.api.internal.zaaa r2 = r1.zaa     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.common.api.internal.zaaa.zap(r2)     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.common.api.internal.zaaa r2 = r1.zaa
            java.util.concurrent.locks.Lock r2 = com.google.android.gms.common.api.internal.zaaa.zaj(r2)
            r2.unlock()
            return
        L1f:
            r2 = move-exception
            com.google.android.gms.common.api.internal.zaaa r0 = r1.zaa
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaa.zaj(r0)
            r0.unlock()
            throw r2
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int r3, boolean r4) {
            r2 = this;
            com.google.android.gms.common.api.internal.zaaa r0 = r2.zaa
            java.util.concurrent.locks.Lock r0 = com.google.android.gms.common.api.internal.zaaa.zaj(r0)
            r0.lock()
            com.google.android.gms.common.api.internal.zaaa r0 = r2.zaa     // Catch: java.lang.Throwable -> L1b
            boolean r1 = com.google.android.gms.common.api.internal.zaaa.zav(r0)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            r1 = 0
            com.google.android.gms.common.api.internal.zaaa.zam(r0, r1)     // Catch: java.lang.Throwable -> L1b
            com.google.android.gms.common.api.internal.zaaa r0 = r2.zaa     // Catch: java.lang.Throwable -> L1b
            com.google.android.gms.common.api.internal.zaaa.zan(r0, r3, r4)     // Catch: java.lang.Throwable -> L1b
            goto L2a
        L1b:
            r3 = move-exception
            goto L34
        L1d:
            r4 = 1
            com.google.android.gms.common.api.internal.zaaa.zam(r0, r4)     // Catch: java.lang.Throwable -> L1b
            com.google.android.gms.common.api.internal.zaaa r4 = r2.zaa     // Catch: java.lang.Throwable -> L1b
            com.google.android.gms.common.api.internal.zabi r4 = com.google.android.gms.common.api.internal.zaaa.zah(r4)     // Catch: java.lang.Throwable -> L1b
            r4.onConnectionSuspended(r3)     // Catch: java.lang.Throwable -> L1b
        L2a:
            com.google.android.gms.common.api.internal.zaaa r3 = r2.zaa
            java.util.concurrent.locks.Lock r3 = com.google.android.gms.common.api.internal.zaaa.zaj(r3)
            r3.unlock()
            return
        L34:
            com.google.android.gms.common.api.internal.zaaa r4 = r2.zaa
            java.util.concurrent.locks.Lock r4 = com.google.android.gms.common.api.internal.zaaa.zaj(r4)
            r4.unlock()
            throw r3
    }
}
