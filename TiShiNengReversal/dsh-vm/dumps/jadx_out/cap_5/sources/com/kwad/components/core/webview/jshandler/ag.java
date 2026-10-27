package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class ag implements com.kwad.sdk.core.webview.c.a {
    private final com.kwad.sdk.core.webview.b acw;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static final class a extends com.kwad.sdk.core.response.a.a {
        public java.lang.String playableExtraData;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ag(com.kwad.sdk.core.webview.b r1) {
            r0 = this;
            r0.<init>()
            r0.acw = r1
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            com.kwad.sdk.core.webview.b r3 = r2.acw
            boolean r3 = r3.KJ()
            if (r3 == 0) goto Lf
            r3 = -1
            java.lang.String r0 = "native adTemplate is null"
            r4.onError(r3, r0)
            return
        Lf:
            com.kwad.components.core.webview.jshandler.ag$a r3 = new com.kwad.components.core.webview.jshandler.ag$a
            r3.<init>()
            com.kwad.sdk.core.webview.b r0 = r2.acw     // Catch: java.lang.Exception -> L2a
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()     // Catch: java.lang.Exception -> L2a
            java.util.List<com.kwad.sdk.core.response.model.AdInfo> r0 = r0.adInfoList     // Catch: java.lang.Exception -> L2a
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L2a
            com.kwad.sdk.core.response.model.AdInfo r0 = (com.kwad.sdk.core.response.model.AdInfo) r0     // Catch: java.lang.Exception -> L2a
            com.kwad.sdk.core.response.model.AdStyleInfo r0 = r0.adStyleInfo     // Catch: java.lang.Exception -> L2a
            java.lang.String r0 = r0.playableExtraData     // Catch: java.lang.Exception -> L2a
            r3.playableExtraData = r0     // Catch: java.lang.Exception -> L2a
            goto L2e
        L2a:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
        L2e:
            r4.a(r3)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "getKsPlayableAdData"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
