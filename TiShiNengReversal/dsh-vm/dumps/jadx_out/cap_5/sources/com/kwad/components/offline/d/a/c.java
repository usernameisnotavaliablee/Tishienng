package com.kwad.components.offline.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c implements com.kwad.components.offline.api.tk.IOfflineHostActionHandler {
    private final com.kwad.sdk.components.r afT;



    public c(com.kwad.sdk.components.r r1) {
            r0 = this;
            r0.<init>()
            r0.afT = r1
            return
    }

    private com.kwad.sdk.components.l a(com.kwad.components.offline.api.tk.IOfflineTKDialog r2) {
            r1 = this;
            com.kwad.components.offline.d.a.c$2 r0 = new com.kwad.components.offline.d.a.c$2
            r0.<init>(r1, r2)
            return r0
    }

    private com.kwad.sdk.components.n a(com.kwad.components.offline.api.tk.IOfflineTKNativeIntent r2) {
            r1 = this;
            com.kwad.components.offline.d.a.c$1 r0 = new com.kwad.components.offline.d.a.c$1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineHostActionHandler
    public final void dismissDialog(com.kwad.components.offline.api.tk.IOfflineTKDialog r2) {
            r1 = this;
            com.kwad.sdk.components.r r0 = r1.afT
            if (r0 == 0) goto Lb
            com.kwad.sdk.components.l r2 = r1.a(r2)
            r0.b(r2)
        Lb:
            return
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineHostActionHandler
    public final void showDialog(com.kwad.components.offline.api.tk.IOfflineTKDialog r2) {
            r1 = this;
            com.kwad.sdk.components.r r0 = r1.afT
            if (r0 == 0) goto Lb
            com.kwad.sdk.components.l r2 = r1.a(r2)
            r0.a(r2)
        Lb:
            return
    }

    @Override // com.kwad.components.offline.api.tk.IOfflineHostActionHandler
    public final void startActivity(com.kwad.components.offline.api.tk.IOfflineTKNativeIntent r2) {
            r1 = this;
            com.kwad.sdk.components.r r0 = r1.afT
            if (r0 == 0) goto Lb
            com.kwad.sdk.components.n r2 = r1.a(r2)
            r0.a(r2)
        Lb:
            return
    }
}
