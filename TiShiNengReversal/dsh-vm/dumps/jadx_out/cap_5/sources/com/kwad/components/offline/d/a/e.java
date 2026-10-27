package com.kwad.components.offline.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e implements com.kwad.components.offline.api.tk.IOfflineApkLoaderHolder {
    private com.kwad.sdk.components.k afU;

    public e(com.kwad.sdk.components.k r1) {
            r0 = this;
            r0.<init>()
            r0.afU = r1
            return
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineApkLoaderHolder
    public final com.kwad.components.offline.api.tk.IOfflineApkLoader getApkLoader(int r2) {
            r1 = this;
            com.kwad.sdk.components.k r0 = r1.afU
            com.kwad.sdk.components.j r2 = r0.bi(r2)
            com.kwad.components.offline.d.a.d r0 = new com.kwad.components.offline.d.a.d
            r0.<init>(r2)
            return r0
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineApkLoaderHolder
    public final com.kwad.components.offline.api.tk.IOfflineApkLoader getApkLoader(java.lang.String r2) {
            r1 = this;
            com.kwad.sdk.components.k r0 = r1.afU
            com.kwad.sdk.components.j r2 = r0.bf(r2)
            com.kwad.components.offline.d.a.d r0 = new com.kwad.components.offline.d.a.d
            r0.<init>(r2)
            return r0
    }
}
