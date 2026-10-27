package com.kwad.components.ad.reward.k;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.components.ad.reward.k.d.a Ay;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(com.kwad.components.core.webview.tachikoma.c.q r1);
    }

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a(com.kwad.components.ad.reward.k.d.a r1) {
            r0 = this;
            r0.Ay = r1
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.c.q r3 = new com.kwad.components.core.webview.tachikoma.c.q
            r3.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L14
            r0.<init>(r2)     // Catch: org.json.JSONException -> L14
            r3.parseJson(r0)     // Catch: org.json.JSONException -> L14
            com.kwad.components.ad.reward.k.d$a r2 = r1.Ay     // Catch: org.json.JSONException -> L14
            if (r2 == 0) goto L14
            r2.a(r3)     // Catch: org.json.JSONException -> L14
        L14:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "clickCall"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            r0 = 0
            r1.Ay = r0
            return
    }
}
