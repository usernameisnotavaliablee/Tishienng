package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class ae implements com.kwad.sdk.core.webview.c.a {
    protected final com.kwad.sdk.core.webview.b acw;
    protected com.kwad.components.core.webview.jshandler.ae.b adb;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements com.kwad.sdk.core.b {
        public int height;
        public int width;

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
                java.lang.String r1 = "width"
                int r2 = r3.width
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                java.lang.String r1 = "height"
                int r2 = r3.height
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void c(com.kwad.components.core.webview.jshandler.ae.a r1);
    }

    public ae(com.kwad.sdk.core.webview.b r1) {
            r0 = this;
            r0.<init>()
            r0.acw = r1
            return
    }

    public final void a(com.kwad.components.core.webview.jshandler.ae.b r1) {
            r0 = this;
            r0.adb = r1
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            com.kwad.components.core.webview.jshandler.ae$a r2 = new com.kwad.components.core.webview.jshandler.ae$a
            r2.<init>()
            com.kwad.components.core.webview.jshandler.ae$b r0 = r1.adb
            if (r0 == 0) goto Ld
            r0.c(r2)
            goto L21
        Ld:
            com.kwad.sdk.core.webview.b r0 = r1.acw
            android.view.ViewGroup r0 = r0.TG
            int r0 = r0.getWidth()
            r2.width = r0
            com.kwad.sdk.core.webview.b r0 = r1.acw
            android.view.ViewGroup r0 = r0.TG
            int r0 = r0.getHeight()
            r2.height = r0
        L21:
            r3.a(r2)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "getContainerLimit"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
