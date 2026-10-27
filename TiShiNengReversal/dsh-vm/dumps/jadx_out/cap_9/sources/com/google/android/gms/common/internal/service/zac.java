package com.google.android.gms.common.internal.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zac extends com.google.android.gms.common.internal.service.zaf {
    zac(com.google.android.gms.common.internal.service.zae r1, com.google.android.gms.common.api.GoogleApiClient r2) {
            r0 = this;
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.common.internal.service.zah r2 = (com.google.android.gms.common.internal.service.zah) r2
            android.os.IInterface r2 = r2.getService()
            com.google.android.gms.common.internal.service.zal r2 = (com.google.android.gms.common.internal.service.zal) r2
            com.google.android.gms.common.internal.service.zad r0 = new com.google.android.gms.common.internal.service.zad
            r0.<init>(r1)
            r2.zae(r0)
            return
    }
}
