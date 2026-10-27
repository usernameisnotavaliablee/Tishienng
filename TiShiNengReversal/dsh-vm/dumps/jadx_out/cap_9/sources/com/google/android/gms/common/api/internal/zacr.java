package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zacr implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.signin.internal.zak zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zact zab;

    zacr(com.google.android.gms.common.api.internal.zact r1, com.google.android.gms.signin.internal.zak r2) {
            r0 = this;
            r0.zab = r1
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.common.api.internal.zact r0 = r2.zab
            com.google.android.gms.signin.internal.zak r1 = r2.zaa
            com.google.android.gms.common.api.internal.zact.zad(r0, r1)
            return
    }
}
