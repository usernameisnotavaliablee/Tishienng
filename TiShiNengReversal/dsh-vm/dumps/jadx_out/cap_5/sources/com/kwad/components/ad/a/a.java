package com.kwad.components.ad.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.core.request.a {
    public a(com.kwad.components.core.request.model.a r3) {
            r2 = this;
            r2.<init>(r3)
            java.lang.String r3 = "requestTime"
            long r0 = java.lang.System.currentTimeMillis()
            r2.putBody(r3, r0)
            return
    }

    @Override // com.kwad.components.core.request.a, com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.f
    public final java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = com.kwad.sdk.h.AN()
            return r0
    }
}
