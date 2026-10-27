package com.google.android.gms.common.internal.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zan extends com.google.android.gms.common.api.Api.AbstractClientBuilder {
    zan() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.ClientSettings r10, java.lang.Object r11, com.google.android.gms.common.api.internal.ConnectionCallbacks r12, com.google.android.gms.common.api.internal.OnConnectionFailedListener r13) {
            r7 = this;
            r4 = r11
            com.google.android.gms.common.internal.TelemetryLoggingOptions r4 = (com.google.android.gms.common.internal.TelemetryLoggingOptions) r4
            com.google.android.gms.common.internal.service.zap r0 = new com.google.android.gms.common.internal.service.zap
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }
}
