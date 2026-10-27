package com.kwad.components.offline.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d implements com.kwad.components.offline.api.obiwan.IObiwanOfflineCompoInitConfig {
    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.offline.api.obiwan.IObiwanOfflineCompoInitConfig
    public final java.lang.String getLogDirPath() {
            r1 = this;
            android.content.Context r0 = com.kwad.sdk.service.ServiceProvider.getContext()
            java.io.File r0 = com.kwad.sdk.utils.be.dH(r0)
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
    }

    @Override // com.kwad.components.offline.api.obiwan.IObiwanOfflineCompoInitConfig
    public final java.lang.String getLogObiwanData() {
            r1 = this;
            java.lang.String r0 = com.kwad.sdk.core.config.e.getLogObiwanData()
            return r0
    }

    @Override // com.kwad.components.offline.api.obiwan.IObiwanOfflineCompoInitConfig
    public final long getLogObiwanStorageQuota() {
            r2 = this;
            java.lang.Class<com.kwad.sdk.components.DevelopMangerComponents> r0 = com.kwad.sdk.components.DevelopMangerComponents.class
            com.kwad.sdk.components.d.f(r0)
            com.kwad.sdk.core.config.item.o r0 = com.kwad.sdk.core.config.c.aAy
            long r0 = com.kwad.sdk.core.config.e.a(r0)
            return r0
    }

    @Override // com.kwad.components.offline.api.obiwan.IObiwanOfflineCompoInitConfig
    public final boolean isLogObiwanEnableNow() {
            r1 = this;
            com.kwad.sdk.core.config.item.d r0 = com.kwad.sdk.core.config.c.aAw
            boolean r0 = com.kwad.sdk.core.config.e.a(r0)
            return r0
    }

    @Override // com.kwad.components.offline.api.obiwan.IObiwanOfflineCompoInitConfig
    public final boolean isLogObiwanRecordAll() {
            r1 = this;
            com.kwad.sdk.core.config.item.d r0 = com.kwad.sdk.core.config.c.aAx
            boolean r0 = com.kwad.sdk.core.config.e.a(r0)
            return r0
    }

    @Override // com.kwad.components.offline.api.IOfflineCompoInitConfig
    public final com.kwad.components.offline.api.core.api.IOfflineCompoWrapper wrapper() {
            r2 = this;
            com.kwad.components.core.o.b.a.l r0 = new com.kwad.components.core.o.b.a.l
            java.lang.String r1 = "com.kwad.components.obiwan"
            r0.<init>(r1)
            return r0
    }
}
