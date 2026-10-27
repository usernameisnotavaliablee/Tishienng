package com.google.android.gms.signin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zaa extends com.google.android.gms.common.api.Api.AbstractClientBuilder {
    zaa() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context r9, android.os.Looper r10, com.google.android.gms.common.internal.ClientSettings r11, java.lang.Object r12, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r13, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r14) {
            r8 = this;
            com.google.android.gms.signin.SignInOptions r12 = (com.google.android.gms.signin.SignInOptions) r12
            com.google.android.gms.signin.internal.SignInClientImpl r0 = new com.google.android.gms.signin.internal.SignInClientImpl
            r3 = 1
            android.os.Bundle r5 = com.google.android.gms.signin.internal.SignInClientImpl.createBundleFromClientSettings(r11)
            r1 = r9
            r2 = r10
            r4 = r11
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }
}
