package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class az extends com.kwad.components.core.webview.tachikoma.b.w {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements com.kwad.sdk.core.b {
        private java.lang.String aeh;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.lang.String a(com.kwad.components.core.webview.jshandler.az.a r0, java.lang.String r1) {
                r0.aeh = r1
                return r1
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
                java.lang.String r1 = "lifeStatus"
                java.lang.String r2 = r3.aeh
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                return r0
        }
    }

    public az() {
            r0 = this;
            r0.<init>()
            return
    }

    private void aY(java.lang.String r2) {
            r1 = this;
            com.kwad.components.core.webview.jshandler.az$a r0 = new com.kwad.components.core.webview.jshandler.az$a
            r0.<init>()
            com.kwad.components.core.webview.jshandler.az.a.a(r0, r2)
            r1.b(r0)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerLifecycleListener"
            return r0
    }

    public final void uF() {
            r1 = this;
            java.lang.String r0 = "showStart"
            r1.aY(r0)
            return
    }

    public final void uG() {
            r1 = this;
            java.lang.String r0 = "showEnd"
            r1.aY(r0)
            return
    }

    public final void uH() {
            r1 = this;
            java.lang.String r0 = "hideStart"
            r1.aY(r0)
            return
    }

    public final void uI() {
            r1 = this;
            java.lang.String r0 = "hideEnd"
            r1.aY(r0)
            return
    }

    public final void uJ() {
            r1 = this;
            java.lang.String r0 = "pageVisiable"
            r1.aY(r0)
            return
    }

    public final void uK() {
            r1 = this;
            java.lang.String r0 = "pageInvisiable"
            r1.aY(r0)
            return
    }
}
