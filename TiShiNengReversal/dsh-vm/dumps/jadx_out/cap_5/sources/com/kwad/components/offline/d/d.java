package com.kwad.components.offline.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d implements com.kwad.components.offline.api.tk.ITkOfflineCompoInitConfig {


    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.offline.api.tk.ITkOfflineCompoInitConfig
    public final java.lang.String getSpKeyTkSoLoadTimes() {
            r1 = this;
            java.lang.String r0 = "tk_so_load_times"
            return r0
    }

    @Override // com.kwad.components.offline.api.tk.ITkOfflineCompoInitConfig
    public final java.lang.String getSpNameSoLoadTimes() {
            r1 = this;
            java.lang.String r0 = "ksadsdk_so_load_times"
            return r0
    }

    @Override // com.kwad.components.offline.api.tk.ITkOfflineCompoInitConfig
    public final java.lang.String getTkJsFileDir(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r1 = com.kwad.sdk.utils.be.getTkJsFileDir(r1, r2)
            return r1
    }

    @Override // com.kwad.components.offline.api.tk.ITkOfflineCompoInitConfig
    public final java.lang.String getTkJsRootDir(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = com.kwad.sdk.utils.be.getTkJsRootDir(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.tk.ITkOfflineCompoInitConfig
    public final java.lang.String getTkVersion() {
            r1 = this;
            java.lang.String r0 = "6.1.7"
            return r0
    }

    @Override // com.kwad.components.offline.api.tk.ITkOfflineCompoInitConfig
    public final boolean isLocalDebugEnable() {
            r1 = this;
            java.lang.Class<com.kwad.sdk.components.DevelopMangerComponents> r0 = com.kwad.sdk.components.DevelopMangerComponents.class
            com.kwad.sdk.components.d.f(r0)
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.offline.api.tk.ITkOfflineCompoInitConfig
    public final com.kwad.components.offline.api.core.soloader.ISoLoader soLoader() {
            r1 = this;
            com.kwad.components.offline.d.d$1 r0 = new com.kwad.components.offline.d.d$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.kwad.components.offline.api.tk.ITkOfflineCompoInitConfig
    public final boolean useTkLite() {
            r1 = this;
            boolean r0 = com.kwad.components.offline.d.b.a.useTkLite()
            return r0
    }

    @Override // com.kwad.components.offline.api.tk.ITkOfflineCompoInitConfig
    public final boolean useTkSoAll() {
            r1 = this;
            com.kwad.sdk.core.config.item.d r0 = com.kwad.sdk.core.config.c.azk
            boolean r0 = com.kwad.sdk.core.config.e.a(r0)
            return r0
    }

    @Override // com.kwad.components.offline.api.IOfflineCompoInitConfig
    public final com.kwad.components.offline.api.core.api.IOfflineCompoWrapper wrapper() {
            r2 = this;
            com.kwad.components.core.o.b.a.l r0 = new com.kwad.components.core.o.b.a.l
            java.lang.String r1 = "com.kwad.components.tachikoma"
            r0.<init>(r1)
            return r0
    }
}
