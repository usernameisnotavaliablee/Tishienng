package com.kwad.components.offline.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b implements com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoBridgeHandler {
    private final com.kwad.sdk.core.webview.c.a aky;

    public b(com.kwad.sdk.core.webview.c.a r1) {
            r0 = this;
            r0.<init>()
            com.kwad.sdk.utils.ax.checkNotNull(r1)
            r0.aky = r1
            return
    }

    @Override // com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoBridgeHandler
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            com.kwad.sdk.core.webview.c.a r0 = r1.aky
            java.lang.String r0 = r0.getKey()
            return r0
    }

    @Override // com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoBridgeHandler
    public final void handleJsCall(java.lang.String r3, @androidx.annotation.NonNull com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoCallBackFunction r4) {
            r2 = this;
            com.kwad.sdk.core.webview.c.a r0 = r2.aky
            com.kwad.components.offline.d.a.a r1 = new com.kwad.components.offline.d.a.a
            r1.<init>(r4)
            r0.a(r3, r1)
            return
    }

    @Override // com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoBridgeHandler
    public final void onDestroy() {
            r1 = this;
            com.kwad.sdk.core.webview.c.a r0 = r1.aky
            r0.onDestroy()
            return
    }
}
