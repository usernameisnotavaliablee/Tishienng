package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class bd implements com.kwad.sdk.core.webview.c.a {

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.webview.c.c ack;

    @androidx.annotation.Nullable
    private com.kwad.components.core.webview.jshandler.bd.a aer;
    private final com.kwad.sdk.core.webview.b eQ;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        @androidx.annotation.MainThread
        void f(com.kwad.sdk.core.response.model.AdTemplate r1);
    }

    public bd(com.kwad.sdk.core.webview.b r1, com.kwad.components.core.webview.jshandler.bd.a r2) {
            r0 = this;
            r0.<init>()
            r0.eQ = r1
            r0.aer = r2
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            com.kwad.sdk.core.webview.d.b.b r4 = new com.kwad.sdk.core.webview.d.b.b
            r4.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Le
            r0.<init>(r3)     // Catch: org.json.JSONException -> Le
            r4.parseJson(r0)     // Catch: org.json.JSONException -> Le
            goto L12
        Le:
            r3 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r3)
        L12:
            com.kwad.components.core.webview.jshandler.bd$a r3 = r2.aer
            if (r3 == 0) goto L3d
            java.lang.String r3 = r4.aNS
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L28
            com.kwad.sdk.core.response.model.AdTemplate r3 = r4.adTemplate
            java.lang.String r0 = r4.aNS
            long r0 = java.lang.Long.parseLong(r0)
            r3.llsid = r0
        L28:
            java.lang.String r3 = r4.extra
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L36
            com.kwad.sdk.core.response.model.AdTemplate r3 = r4.adTemplate
            java.lang.String r0 = r4.extra
            r3.extra = r0
        L36:
            com.kwad.components.core.webview.jshandler.bd$a r3 = r2.aer
            com.kwad.sdk.core.response.model.AdTemplate r4 = r4.adTemplate
            r3.f(r4)
        L3d:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerSetAdTemplateListener"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            r0 = 0
            r1.ack = r0
            return
    }
}
