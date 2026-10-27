package com.kwad.components.offline.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a implements com.kwad.sdk.core.webview.c.c {
    private final com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoCallBackFunction akt;


    public a(com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoCallBackFunction r1) {
            r0 = this;
            r0.<init>()
            r0.akt = r1
            return
    }

    static /* synthetic */ com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoCallBackFunction a(com.kwad.components.offline.d.a.a r0) {
            com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoCallBackFunction r0 = r0.akt
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.c
    public final void a(com.kwad.sdk.core.b r3) {
            r2 = this;
            boolean r0 = com.kwad.sdk.core.config.e.Fr()
            if (r0 == 0) goto L13
            java.util.concurrent.ExecutorService r0 = com.kwad.sdk.core.threads.GlobalThreadPools.Jy()
            com.kwad.components.offline.d.a.a$1 r1 = new com.kwad.components.offline.d.a.a$1
            r1.<init>(r2, r3)
            r0.submit(r1)
            return
        L13:
            com.kwad.sdk.core.webview.c.f r0 = new com.kwad.sdk.core.webview.c.f
            r0.<init>(r3)
            org.json.JSONObject r3 = r0.toJson()
            java.lang.String r3 = r3.toString()
            com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoCallBackFunction r0 = r2.akt
            if (r0 == 0) goto L27
            r0.onSuccess(r3)
        L27:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.c
    public final void onError(int r2, java.lang.String r3) {
            r1 = this;
            com.kwad.sdk.core.webview.c.e r0 = new com.kwad.sdk.core.webview.c.e
            r0.<init>(r2, r3)
            org.json.JSONObject r2 = r0.toJson()
            java.lang.String r2 = r2.toString()
            com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoCallBackFunction r3 = r1.akt
            if (r3 == 0) goto L14
            r3.onError(r2)
        L14:
            return
    }
}
