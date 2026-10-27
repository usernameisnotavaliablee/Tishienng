package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class bg implements com.kwad.sdk.core.webview.c.a {

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.webview.c.c acS;
    private com.kwad.components.core.webview.jshandler.bg.b aeu;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static final class a extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
        public int visibility;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        @androidx.annotation.MainThread
        void a(com.kwad.components.core.webview.jshandler.bg.a r1);
    }

    public bg(com.kwad.components.core.webview.jshandler.bg.b r1) {
            r0 = this;
            r0.<init>()
            r0.aeu = r1
            return
    }

    static /* synthetic */ com.kwad.sdk.core.webview.c.c a(com.kwad.components.core.webview.jshandler.bg r0) {
            com.kwad.sdk.core.webview.c.c r0 = r0.acS
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.jshandler.bg r0, com.kwad.components.core.webview.jshandler.bg.a r1) {
            r0.b(r1)
            return
    }

    private void b(com.kwad.components.core.webview.jshandler.bg.a r2) {
            r1 = this;
            com.kwad.components.core.webview.jshandler.bg$b r0 = r1.aeu
            if (r0 == 0) goto L7
            r0.a(r2)
        L7:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            r1.acS = r3
            com.kwad.components.core.webview.jshandler.bg$a r3 = new com.kwad.components.core.webview.jshandler.bg$a
            r3.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L10
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L10
            r3.parseJson(r0)     // Catch: java.lang.Throwable -> L10
            goto L14
        L10:
            r2 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r2)
        L14:
            com.kwad.components.core.webview.jshandler.bg$1 r2 = new com.kwad.components.core.webview.jshandler.bg$1
            r2.<init>(r1, r3)
            com.kwad.sdk.utils.bw.postOnUiThread(r2)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "setHeaderBar"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            r0 = 0
            r1.aeu = r0
            r1.acS = r0
            return
    }
}
