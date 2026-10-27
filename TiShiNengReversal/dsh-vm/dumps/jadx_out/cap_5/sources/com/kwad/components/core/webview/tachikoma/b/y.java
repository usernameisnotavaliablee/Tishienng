package com.kwad.components.core.webview.tachikoma.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class y implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.components.core.webview.tachikoma.b.y.a agQ;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(com.kwad.sdk.core.response.model.TKAdLiveShopItemInfo r1);
    }

    public y(com.kwad.components.core.webview.tachikoma.b.y.a r1) {
            r0 = this;
            r0.<init>()
            r0.agQ = r1
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.tachikoma.b.y.a a(com.kwad.components.core.webview.tachikoma.b.y r0) {
            com.kwad.components.core.webview.tachikoma.b.y$a r0 = r0.agQ
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            java.lang.String r4 = "UpdateLiveCurrentShopInfoHandler"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L29
            java.lang.String r1 = "handleJsCall: "
            r0.<init>(r1)     // Catch: java.lang.Exception -> L29
            r0.append(r3)     // Catch: java.lang.Exception -> L29
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L29
            com.kwad.sdk.core.d.c.d(r4, r0)     // Catch: java.lang.Exception -> L29
            com.kwad.sdk.core.response.model.TKAdLiveShopItemInfo r4 = new com.kwad.sdk.core.response.model.TKAdLiveShopItemInfo     // Catch: java.lang.Exception -> L29
            r4.<init>()     // Catch: java.lang.Exception -> L29
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L29
            r0.<init>(r3)     // Catch: java.lang.Exception -> L29
            r4.parseJson(r0)     // Catch: java.lang.Exception -> L29
            com.kwad.components.core.webview.tachikoma.b.y$1 r3 = new com.kwad.components.core.webview.tachikoma.b.y$1     // Catch: java.lang.Exception -> L29
            r3.<init>(r2, r4)     // Catch: java.lang.Exception -> L29
            com.kwad.sdk.utils.bw.postOnUiThread(r3)     // Catch: java.lang.Exception -> L29
            return
        L29:
            r3 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r3)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "updateLiveCurrentShopInfo"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
