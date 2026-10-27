package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class al implements com.kwad.sdk.core.webview.c.a {
    private final android.webkit.WebView Ta;
    private android.os.Handler acR;

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.webview.c.c acS;
    private boolean adz;

    @androidx.annotation.Nullable
    private com.kwad.components.core.webview.jshandler.al.b eU;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements com.kwad.sdk.core.b {
        public int bottomMargin;
        public int height;
        public int leftMargin;
        public int rightMargin;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.kwad.sdk.core.b
        public final void parseJson(@androidx.annotation.Nullable org.json.JSONObject r2) {
                r1 = this;
                if (r2 != 0) goto L3
                return
            L3:
                java.lang.String r0 = "height"
                int r0 = r2.optInt(r0)
                r1.height = r0
                java.lang.String r0 = "leftMargin"
                int r0 = r2.optInt(r0)
                r1.leftMargin = r0
                java.lang.String r0 = "rightMargin"
                int r0 = r2.optInt(r0)
                r1.rightMargin = r0
                java.lang.String r0 = "bottomMargin"
                int r2 = r2.optInt(r0)
                r1.bottomMargin = r2
                return
        }

        @Override // com.kwad.sdk.core.b
        public final org.json.JSONObject toJson() {
                r3 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "height"
                int r2 = r3.height
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                java.lang.String r1 = "leftMargin"
                int r2 = r3.leftMargin
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                java.lang.String r1 = "rightMargin"
                int r2 = r3.rightMargin
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                java.lang.String r1 = "bottomMargin"
                int r2 = r3.bottomMargin
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        @androidx.annotation.MainThread
        void a(@androidx.annotation.NonNull com.kwad.components.core.webview.jshandler.al.a r1);
    }

    public al(com.kwad.sdk.core.webview.b r2, @androidx.annotation.Nullable com.kwad.components.core.webview.jshandler.al.b r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    private al(com.kwad.sdk.core.webview.b r3, @androidx.annotation.Nullable com.kwad.components.core.webview.jshandler.al.b r4, boolean r5) {
            r2 = this;
            r2.<init>()
            r5 = 1
            r2.adz = r5
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.acR = r0
            android.webkit.WebView r3 = r3.Ta
            r2.Ta = r3
            r2.eU = r4
            r2.adz = r5
            return
    }

    static /* synthetic */ android.webkit.WebView a(com.kwad.components.core.webview.jshandler.al r0) {
            android.webkit.WebView r0 = r0.Ta
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.components.core.webview.jshandler.al r0) {
            boolean r0 = r0.adz
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.al.b c(com.kwad.components.core.webview.jshandler.al r0) {
            com.kwad.components.core.webview.jshandler.al$b r0 = r0.eU
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.webview.c.c d(com.kwad.components.core.webview.jshandler.al r0) {
            com.kwad.sdk.core.webview.c.c r0 = r0.acS
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            r2.acS = r4
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L24
            r0.<init>(r3)     // Catch: org.json.JSONException -> L24
            com.kwad.components.core.webview.jshandler.al$a r3 = new com.kwad.components.core.webview.jshandler.al$a     // Catch: org.json.JSONException -> L24
            r3.<init>()     // Catch: org.json.JSONException -> L24
            r3.parseJson(r0)     // Catch: org.json.JSONException -> L24
            android.os.Handler r0 = r2.acR     // Catch: org.json.JSONException -> L24
            com.kwad.components.core.webview.jshandler.al$1 r1 = new com.kwad.components.core.webview.jshandler.al$1     // Catch: org.json.JSONException -> L24
            r1.<init>(r2, r3)     // Catch: org.json.JSONException -> L24
            r0.post(r1)     // Catch: org.json.JSONException -> L24
            android.os.Handler r3 = r2.acR     // Catch: org.json.JSONException -> L24
            com.kwad.components.core.webview.jshandler.al$2 r0 = new com.kwad.components.core.webview.jshandler.al$2     // Catch: org.json.JSONException -> L24
            r0.<init>(r2)     // Catch: org.json.JSONException -> L24
            r3.post(r0)     // Catch: org.json.JSONException -> L24
            return
        L24:
            r3 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r3)
            r0 = -1
            java.lang.String r3 = r3.getMessage()
            r4.onError(r0, r3)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "initKsAdFrame"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r2 = this;
            r0 = 0
            r2.acS = r0
            r2.eU = r0
            android.os.Handler r1 = r2.acR
            r1.removeCallbacksAndMessages(r0)
            return
    }
}
