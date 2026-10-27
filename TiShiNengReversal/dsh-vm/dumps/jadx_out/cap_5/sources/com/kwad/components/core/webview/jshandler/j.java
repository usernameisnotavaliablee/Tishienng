package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class j implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c ack;
    private com.kwad.components.core.webview.jshandler.p aco;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.core.response.a.a {
        public java.lang.String acp;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public final java.lang.String getTarget() {
                r1 = this;
                java.lang.String r0 = r1.acp
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class b extends com.kwad.sdk.core.response.a.a {
        public int Re;
        public int acq;
        public int acr;
        public java.lang.String acs;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public j(com.kwad.components.core.webview.jshandler.p r1) {
            r0 = this;
            r0.<init>()
            r0.aco = r1
            return
    }

    public final void P(long r2) {
            r1 = this;
            com.kwad.components.core.webview.jshandler.j$b r0 = new com.kwad.components.core.webview.jshandler.j$b
            r0.<init>()
            java.lang.String r2 = java.lang.Long.toString(r2)
            r0.acs = r2
            r1.a(r0)
            return
    }

    public final void a(com.kwad.sdk.core.response.a.a r2) {
            r1 = this;
            com.kwad.sdk.core.webview.c.c r0 = r1.ack
            if (r0 == 0) goto La
            if (r2 != 0) goto L7
            goto La
        L7:
            r0.a(r2)
        La:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            r1.ack = r3
            com.kwad.components.core.webview.jshandler.j$a r3 = new com.kwad.components.core.webview.jshandler.j$a     // Catch: java.lang.Exception -> L1a
            r3.<init>()     // Catch: java.lang.Exception -> L1a
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1a
            r0.<init>(r2)     // Catch: java.lang.Exception -> L1a
            r3.parseJson(r0)     // Catch: java.lang.Exception -> L1a
            java.lang.String r2 = r3.getTarget()     // Catch: java.lang.Exception -> L1a
            com.kwad.components.core.webview.jshandler.p r3 = r1.aco     // Catch: java.lang.Exception -> L1a
            if (r3 == 0) goto L1a
            r3.a(r1, r2)     // Catch: java.lang.Exception -> L1a
        L1a:
            return
    }

    public final void aW(boolean r2) {
            r1 = this;
            com.kwad.components.core.webview.jshandler.j$b r0 = new com.kwad.components.core.webview.jshandler.j$b
            r0.<init>()
            r0.acr = r2
            r1.a(r0)
            return
    }

    public final void be(int r2) {
            r1 = this;
            com.kwad.components.core.webview.jshandler.j$b r0 = new com.kwad.components.core.webview.jshandler.j$b
            r0.<init>()
            r0.Re = r2
            r1.a(r0)
            return
    }

    public final void f(com.kwad.components.core.playable.PlayableSource r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            com.kwad.components.core.webview.jshandler.j$b r0 = new com.kwad.components.core.webview.jshandler.j$b
            r0.<init>()
            int r2 = r2.getCode()
            r0.acq = r2
            r1.a(r0)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "getNativeData"
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
