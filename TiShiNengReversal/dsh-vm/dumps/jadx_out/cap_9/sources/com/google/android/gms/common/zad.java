package com.google.android.gms.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"HandlerLeak"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zad extends com.google.android.gms.internal.base.zau {
    final /* synthetic */ com.google.android.gms.common.GoogleApiAvailability zaa;
    private final android.content.Context zab;

    public zad(com.google.android.gms.common.GoogleApiAvailability r1, android.content.Context r2) {
            r0 = this;
            r0.zaa = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto Ld
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L11:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.zab = r1
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r3) {
            r2 = this;
            int r3 = r3.what
            r0 = 1
            if (r3 == r0) goto L6
            return
        L6:
            com.google.android.gms.common.GoogleApiAvailability r3 = r2.zaa
            android.content.Context r0 = r2.zab
            int r0 = r3.isGooglePlayServicesAvailable(r0)
            boolean r3 = r3.isUserResolvableError(r0)
            if (r3 == 0) goto L1b
            com.google.android.gms.common.GoogleApiAvailability r3 = r2.zaa
            android.content.Context r1 = r2.zab
            r3.showErrorNotification(r1, r0)
        L1b:
            return
    }
}
