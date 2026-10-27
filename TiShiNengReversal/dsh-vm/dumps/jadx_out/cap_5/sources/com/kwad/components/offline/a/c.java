package com.kwad.components.offline.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c implements com.kwad.components.offline.api.adLive.IAdLiveOfflineCompoInitConfig {



    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.offline.api.adLive.IAdLiveOfflineCompoInitConfig
    public final com.kwad.components.offline.api.core.adlive.listener.AdLiveHttpRequestListenerDelegate getAdLiveHttpRequestListenerDelegate() {
            r1 = this;
            com.kwad.components.offline.a.c$2 r0 = new com.kwad.components.offline.a.c$2
            r0.<init>(r1)
            return r0
    }

    @Override // com.kwad.components.offline.api.adLive.IAdLiveOfflineCompoInitConfig
    public final com.kwad.components.offline.api.core.soloader.ISoLoader soLoader() {
            r1 = this;
            com.kwad.components.offline.a.c$1 r0 = new com.kwad.components.offline.a.c$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.kwad.components.offline.api.adLive.IAdLiveOfflineCompoInitConfig
    public final boolean usePhoneStateDisable() {
            r1 = this;
            boolean r0 = com.kwad.sdk.utils.bc.usePhoneStateDisable()
            return r0
    }

    @Override // com.kwad.components.offline.api.IOfflineCompoInitConfig
    public final com.kwad.components.offline.api.core.api.IOfflineCompoWrapper wrapper() {
            r2 = this;
            com.kwad.components.core.o.b.a.l r0 = new com.kwad.components.core.o.b.a.l
            java.lang.String r1 = "com.kwad.components.adLive"
            r0.<init>(r1)
            return r0
    }
}
