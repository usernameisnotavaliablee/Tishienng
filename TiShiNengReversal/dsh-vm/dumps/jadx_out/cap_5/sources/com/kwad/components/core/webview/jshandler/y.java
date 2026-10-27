package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class y implements com.kwad.sdk.core.webview.c.a {
    private java.util.List<com.kwad.sdk.core.response.model.AdTemplate> acH;
    private com.kwad.sdk.core.webview.b eQ;
    private com.kwad.components.core.webview.jshandler.y.b ry;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.core.response.a.a {
        public int adStyle;
        public long creativeId;

        public a() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.creativeId = r0
                r0 = -1
                r2.adStyle = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void W(com.kwad.sdk.core.response.model.AdTemplate r1);
    }

    public y(com.kwad.sdk.core.webview.b r1) {
            r0 = this;
            r0.<init>()
            r0.eQ = r1
            return
    }

    public y(java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r1) {
            r0 = this;
            r0.<init>()
            r0.acH = r1
            return
    }

    private java.util.List<com.kwad.sdk.core.response.model.AdTemplate> uB() {
            r1 = this;
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r0 = r1.acH
            if (r0 == 0) goto L5
            return r0
        L5:
            com.kwad.sdk.core.webview.b r0 = r1.eQ
            if (r0 == 0) goto Le
            java.util.List r0 = r0.KI()
            return r0
        Le:
            r0 = 0
            return r0
    }

    public final void a(com.kwad.components.core.webview.jshandler.y.b r1) {
            r0 = this;
            r0.ry = r1
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            com.kwad.components.core.webview.jshandler.y$a r4 = new com.kwad.components.core.webview.jshandler.y$a     // Catch: org.json.JSONException -> L20
            r4.<init>()     // Catch: org.json.JSONException -> L20
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L20
            r0.<init>(r3)     // Catch: org.json.JSONException -> L20
            r4.parseJson(r0)     // Catch: org.json.JSONException -> L20
            long r0 = r4.creativeId     // Catch: org.json.JSONException -> L20
            int r3 = r4.adStyle     // Catch: org.json.JSONException -> L20
            java.util.List r4 = r2.uB()     // Catch: org.json.JSONException -> L20
            com.kwad.sdk.core.response.model.AdTemplate r3 = com.kwad.sdk.core.response.b.e.a(r4, r0, r3)     // Catch: org.json.JSONException -> L20
            com.kwad.components.core.webview.jshandler.y$b r4 = r2.ry     // Catch: org.json.JSONException -> L20
            if (r4 == 0) goto L20
            r4.W(r3)     // Catch: org.json.JSONException -> L20
        L20:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "adImpression"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
