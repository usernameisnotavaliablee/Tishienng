package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e implements com.kwad.sdk.core.webview.c.a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public boolean acn;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
        public final org.json.JSONObject toJson() {
                r3 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "isInstalled"
                boolean r2 = r3.acn
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class b extends com.kwad.sdk.core.response.a.a {
        public java.lang.String packageName;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean aT(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            android.content.Context r0 = com.kwad.sdk.service.ServiceProvider.getContext()
            boolean r1 = com.kwad.sdk.utils.as.ap(r0, r1)
            return r1
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            java.lang.String r2 = r1.aS(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lb
            return
        Lb:
            com.kwad.components.core.webview.jshandler.e$a r0 = new com.kwad.components.core.webview.jshandler.e$a
            r0.<init>()
            boolean r2 = aT(r2)
            r0.acn = r2
            r3.a(r0)
            return
    }

    protected java.lang.String aS(java.lang.String r3) {
            r2 = this;
            com.kwad.components.core.webview.jshandler.e$b r0 = new com.kwad.components.core.webview.jshandler.e$b
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L10
            r1.<init>(r3)     // Catch: java.lang.Exception -> L10
            r0.parseJson(r1)     // Catch: java.lang.Exception -> L10
            java.lang.String r3 = r0.packageName     // Catch: java.lang.Exception -> L10
            return r3
        L10:
            r3 = 0
            return r3
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "isAppInstalled"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
