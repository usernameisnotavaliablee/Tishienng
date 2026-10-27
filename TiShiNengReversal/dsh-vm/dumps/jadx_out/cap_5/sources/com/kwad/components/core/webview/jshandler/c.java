package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c implements com.kwad.sdk.core.webview.c.a {

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.webview.c.c ack;
    private com.kwad.components.core.proxy.launchdialog.b acl;
    private final com.kwad.sdk.core.webview.b eQ;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements com.kwad.sdk.core.b {
        java.lang.String NN;
        int status;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.kwad.sdk.core.b
        public final void parseJson(@androidx.annotation.Nullable org.json.JSONObject r1) {
                r0 = this;
                return
        }

        @Override // com.kwad.sdk.core.b
        public final org.json.JSONObject toJson() {
                r3 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "status"
                int r2 = r3.status
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                java.lang.String r1 = "creativeId"
                java.lang.String r2 = r3.NN
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                return r0
        }
    }

    public c(com.kwad.sdk.core.webview.b r2) {
            r1 = this;
            r1.<init>()
            r1.eQ = r2
            com.kwad.components.core.proxy.launchdialog.b r2 = r1.uA()
            r1.acl = r2
            com.kwad.components.core.proxy.launchdialog.e r2 = com.kwad.components.core.proxy.launchdialog.e.sc()
            com.kwad.components.core.proxy.launchdialog.b r0 = r1.acl
            r2.a(r0)
            return
    }

    static /* synthetic */ com.kwad.sdk.core.webview.b a(com.kwad.components.core.webview.jshandler.c r0) {
            com.kwad.sdk.core.webview.b r0 = r0.eQ
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.webview.c.c b(com.kwad.components.core.webview.jshandler.c r0) {
            com.kwad.sdk.core.webview.c.c r0 = r0.ack
            return r0
    }

    private com.kwad.components.core.proxy.launchdialog.b uA() {
            r1 = this;
            com.kwad.components.core.webview.jshandler.c$1 r0 = new com.kwad.components.core.webview.jshandler.c$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            r0.ack = r2
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "dpInterceptPopupListener"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r3 = this;
            r0 = 0
            r3.ack = r0
            com.kwad.components.core.proxy.launchdialog.e r1 = com.kwad.components.core.proxy.launchdialog.e.sc()
            com.kwad.components.core.proxy.launchdialog.b r2 = r3.acl
            r1.b(r2)
            r3.acl = r0
            return
    }
}
