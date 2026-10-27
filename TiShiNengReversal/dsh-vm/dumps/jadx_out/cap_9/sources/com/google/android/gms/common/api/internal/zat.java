package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zat implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    public final com.google.android.gms.common.api.Api zaa;
    private final boolean zab;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.api.internal.zau zac;

    public zat(com.google.android.gms.common.api.Api r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    private final com.google.android.gms.common.api.internal.zau zab() {
            r2 = this;
            com.google.android.gms.common.api.internal.zau r0 = r2.zac
            java.lang.String r1 = "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.common.api.internal.zau r0 = r2.zac
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zau r0 = r1.zab()
            r0.onConnected(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r4) {
            r3 = this;
            com.google.android.gms.common.api.Api r0 = r3.zaa
            boolean r1 = r3.zab
            com.google.android.gms.common.api.internal.zau r2 = r3.zab()
            r2.zaa(r4, r0, r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zau r0 = r1.zab()
            r0.onConnectionSuspended(r2)
            return
    }

    public final void zaa(com.google.android.gms.common.api.internal.zau r1) {
            r0 = this;
            r0.zac = r1
            return
    }
}
