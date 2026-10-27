package com.google.android.gms.common.internal.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zad extends com.google.android.gms.common.internal.service.zaa {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zaa;

    public zad(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    @Override // com.google.android.gms.common.internal.service.zaa, com.google.android.gms.common.internal.service.zak
    public final void zab(int r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r2)
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder r2 = r1.zaa
            r2.setResult(r0)
            return
    }
}
