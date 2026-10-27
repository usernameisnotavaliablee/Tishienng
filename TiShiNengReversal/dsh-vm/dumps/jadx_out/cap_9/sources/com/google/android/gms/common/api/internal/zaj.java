package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zaj implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    public final int zaa;
    public final com.google.android.gms.common.api.GoogleApiClient zab;

    @androidx.annotation.Nullable
    public final com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener zac;
    final /* synthetic */ com.google.android.gms.common.api.internal.zak zad;

    public zaj(com.google.android.gms.common.api.internal.zak r1, int r2, @androidx.annotation.Nullable com.google.android.gms.common.api.GoogleApiClient r3, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r4) {
            r0 = this;
            r0.zad = r1
            r0.<init>()
            r0.zaa = r2
            r0.zab = r3
            r0.zac = r4
            return
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r3) {
            r2 = this;
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "beginFailureResolution for "
            r1.concat(r0)
            int r0 = r2.zaa
            com.google.android.gms.common.api.internal.zak r1 = r2.zad
            r1.zah(r3, r0)
            return
    }
}
