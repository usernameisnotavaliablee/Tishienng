package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zah implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ com.google.android.gms.common.api.internal.ConnectionCallbacks zaa;

    zah(com.google.android.gms.common.api.internal.ConnectionCallbacks r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.ConnectionCallbacks r0 = r1.zaa
            r0.onConnected(r2)
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.ConnectionCallbacks r0 = r1.zaa
            r0.onConnectionSuspended(r2)
            return
    }
}
