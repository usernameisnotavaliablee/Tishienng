package com.kwad.components.core.webview.tachikoma.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class d implements com.kwad.sdk.components.m {
    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    private com.kwad.sdk.core.response.model.AdTemplate a(com.kwad.components.core.webview.jshandler.n.a r1) {
            r0 = this;
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.adTemplate
            if (r1 == 0) goto L5
            return r1
        L5:
            com.kwad.sdk.core.response.model.AdTemplate r1 = r0.vy()
            return r1
    }

    @Override // com.kwad.sdk.components.m
    public final java.lang.Object call(@androidx.annotation.Nullable java.lang.Object... r3) {
            r2 = this;
            com.kwad.components.core.webview.jshandler.n$a r0 = new com.kwad.components.core.webview.jshandler.n$a     // Catch: java.lang.Throwable -> L1c
            r0.<init>()     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1e
            int r1 = r3.length     // Catch: java.lang.Throwable -> L1c
            if (r1 <= 0) goto L1e
            r1 = 0
            r3 = r3[r1]     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1c
            r0.parseJson(r1)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r3 = move-exception
            goto L30
        L1e:
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.a(r0)     // Catch: java.lang.Throwable -> L1c
            com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)     // Catch: java.lang.Throwable -> L1c
            com.kwad.sdk.core.response.model.AdInfo$AdConversionInfo r3 = r3.adConversionInfo     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = r3.appDownloadUrl     // Catch: java.lang.Throwable -> L1c
            com.kwad.sdk.core.download.a.dM(r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L30:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r3)
            r3 = 0
            return r3
    }

    public abstract com.kwad.sdk.core.response.model.AdTemplate vy();
}
