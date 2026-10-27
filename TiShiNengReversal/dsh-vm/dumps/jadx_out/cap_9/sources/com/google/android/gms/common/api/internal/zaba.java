package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zaba implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.common.api.internal.StatusPendingResult zaa;

    zaba(com.google.android.gms.common.api.internal.zabe r1, com.google.android.gms.common.api.internal.StatusPendingResult r2) {
            r0 = this;
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r0 = 8
            r2.<init>(r0)
            com.google.android.gms.common.api.internal.StatusPendingResult r0 = r1.zaa
            r0.setResult(r2)
            return
    }
}
