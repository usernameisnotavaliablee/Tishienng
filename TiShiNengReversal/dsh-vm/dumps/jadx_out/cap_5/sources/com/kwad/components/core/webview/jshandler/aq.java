package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class aq implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.components.core.webview.jshandler.aq.a adV;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(com.kwad.components.core.webview.a.b r1);
    }

    public aq(com.kwad.components.core.webview.jshandler.aq.a r1) {
            r0 = this;
            r0.<init>()
            r0.adV = r1
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            com.kwad.components.core.webview.a.b r0 = new com.kwad.components.core.webview.a.b
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L15
            r1.<init>(r3)     // Catch: java.lang.Exception -> L15
            r0.parseJson(r1)     // Catch: java.lang.Exception -> L15
            com.kwad.components.core.webview.jshandler.aq$a r3 = r2.adV     // Catch: java.lang.Exception -> L15
            if (r3 == 0) goto L17
            r3.a(r0)     // Catch: java.lang.Exception -> L15
            return
        L15:
            r3 = move-exception
            goto L18
        L17:
            return
        L18:
            r0 = -1
            java.lang.String r1 = ""
            r4.onError(r0, r1)
            com.kwad.sdk.core.d.c.printStackTrace(r3)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "openNewPage"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            r0 = 0
            r1.adV = r0
            return
    }
}
