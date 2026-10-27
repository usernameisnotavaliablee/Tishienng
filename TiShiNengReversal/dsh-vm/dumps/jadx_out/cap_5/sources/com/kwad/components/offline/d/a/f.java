package com.kwad.components.offline.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f implements com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoTKBridgeHandler {
    private final com.kwad.sdk.core.webview.c.g akF;

    f(com.kwad.sdk.core.webview.c.g r1) {
            r0 = this;
            r0.<init>()
            r0.akF = r1
            return
    }

    @Override // com.kwad.components.offline.api.tk.jsbridge.IOfflineCompoTKBridgeHandler
    public final void callTKBridge(java.lang.String r2) {
            r1 = this;
            com.kwad.sdk.core.webview.c.g r0 = r1.akF
            if (r0 == 0) goto L7
            r0.callTKBridge(r2)
        L7:
            return
    }
}
