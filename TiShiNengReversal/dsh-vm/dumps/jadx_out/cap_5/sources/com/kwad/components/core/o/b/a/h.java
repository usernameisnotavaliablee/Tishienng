package com.kwad.components.core.o.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class h implements com.kwad.components.offline.api.core.api.INet {
    h() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.offline.api.core.api.INet
    public final int getActiveNetworkType(android.content.Context r1) {
            r0 = this;
            int r1 = com.kwad.sdk.utils.ao.getActiveNetworkType(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.api.INet
    public final java.lang.String getCurrHost(@com.kwad.components.offline.api.core.api.INet.HostType java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.kwad.sdk.core.network.idc.a r0 = com.kwad.sdk.core.network.idc.a.HF()
            java.lang.String r2 = r0.W(r2, r3)
            return r2
    }

    @Override // com.kwad.components.offline.api.core.api.INet
    public final void handleSwitchHost(java.lang.String r3, @com.kwad.components.offline.api.core.api.INet.HostType java.lang.String r4, int r5, java.lang.Throwable r6) {
            r2 = this;
            com.kwad.sdk.core.network.idc.a r0 = com.kwad.sdk.core.network.idc.a.HF()
            com.kwad.sdk.core.network.idc.DomainException r1 = new com.kwad.sdk.core.network.idc.DomainException
            r1.<init>(r5, r6)
            r0.a(r3, r4, r1)
            return
    }

    @Override // com.kwad.components.offline.api.core.api.INet
    public final boolean isMobileConnected(android.content.Context r1) {
            r0 = this;
            boolean r1 = com.kwad.sdk.utils.ao.isMobileConnected(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.api.INet
    public final boolean isNetworkConnected(android.content.Context r1) {
            r0 = this;
            boolean r1 = com.kwad.sdk.utils.ao.isNetworkConnected(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.api.INet
    public final boolean isWifiConnected(android.content.Context r1) {
            r0 = this;
            boolean r1 = com.kwad.sdk.utils.ao.isWifiConnected(r1)
            return r1
    }
}
