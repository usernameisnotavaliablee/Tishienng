package com.kwad.components.ad.reward.k;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class k implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.components.ad.reward.k.k.a AG;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void d(com.kwad.components.core.webview.tachikoma.c.r r1);
    }

    public k() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a(com.kwad.components.ad.reward.k.k.a r1) {
            r0 = this;
            r0.AG = r1
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            com.kwad.components.ad.reward.k.k$a r3 = r1.AG
            if (r3 == 0) goto L16
            com.kwad.components.core.webview.tachikoma.c.r r3 = new com.kwad.components.core.webview.tachikoma.c.r
            r3.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L16
            r0.<init>(r2)     // Catch: org.json.JSONException -> L16
            r3.parseJson(r0)     // Catch: org.json.JSONException -> L16
            com.kwad.components.ad.reward.k.k$a r2 = r1.AG     // Catch: org.json.JSONException -> L16
            r2.d(r3)     // Catch: org.json.JSONException -> L16
        L16:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "showPlayEnd"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            r0 = 0
            r1.AG = r0
            return
    }
}
