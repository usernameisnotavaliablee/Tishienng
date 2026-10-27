package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zacq implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zact zaa;

    zacq(com.google.android.gms.common.api.internal.zact r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.common.api.internal.zact r0 = r3.zaa
            com.google.android.gms.common.api.internal.zacs r0 = com.google.android.gms.common.api.internal.zact.zac(r0)
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            r2 = 4
            r1.<init>(r2)
            r0.zae(r1)
            return
    }
}
