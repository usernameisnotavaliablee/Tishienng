package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class WebCardVideoPositionHandler implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler.a aeA;
    private com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler.VideoPosition aez;
    private android.os.Handler iK;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static final class VideoPosition extends com.kwad.sdk.core.response.a.a implements java.io.Serializable {
        private static final long serialVersionUID = -3445790097441569428L;
        public int borderRadius;
        public com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler.VideoPosition.KSAdJSCornerModel cornerRadius;
        public int height;
        public double heightWidthRation;
        public int leftMargin;
        public double leftMarginRation;
        public int topMargin;
        public double topMarginRation;
        public int width;
        public double widthRation;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @com.ksad.json.annotation.KsJson
        public static class KSAdJSCornerModel extends com.kwad.sdk.core.response.a.a implements java.io.Serializable {
            private static final long serialVersionUID = -1503191931449786332L;
            public double bottomLeft;
            public double bottomRight;
            public double topLeft;
            public double topRight;

            public KSAdJSCornerModel() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        public VideoPosition() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.kwad.sdk.core.response.a.a
        public final void afterParseJson(@androidx.annotation.Nullable org.json.JSONObject r3) {
                r2 = this;
                super.afterParseJson(r3)
                java.lang.String r0 = "cornerRadius"
                boolean r1 = r3.has(r0)
                if (r1 == 0) goto L19
                com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler$VideoPosition$KSAdJSCornerModel r1 = new com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler$VideoPosition$KSAdJSCornerModel
                r1.<init>()
                r2.cornerRadius = r1
                org.json.JSONObject r3 = r3.optJSONObject(r0)
                r1.parseJson(r3)
            L19:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler.VideoPosition r1);
    }

    public WebCardVideoPositionHandler(com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler.a r3) {
            r2 = this;
            r2.<init>()
            com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler$VideoPosition r0 = new com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler$VideoPosition
            r0.<init>()
            r2.aez = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.iK = r0
            r2.aeA = r3
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler.VideoPosition a(com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler r0) {
            com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler$VideoPosition r0 = r0.aez
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler.a b(com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler r0) {
            com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler$a r0 = r0.aeA
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler$VideoPosition r0 = r2.aez     // Catch: org.json.JSONException -> L18
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L18
            r1.<init>(r3)     // Catch: org.json.JSONException -> L18
            r0.parseJson(r1)     // Catch: org.json.JSONException -> L18
            com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler$a r3 = r2.aeA     // Catch: org.json.JSONException -> L18
            if (r3 == 0) goto L18
            android.os.Handler r3 = r2.iK     // Catch: org.json.JSONException -> L18
            com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler$1 r0 = new com.kwad.components.core.webview.jshandler.WebCardVideoPositionHandler$1     // Catch: org.json.JSONException -> L18
            r0.<init>(r2)     // Catch: org.json.JSONException -> L18
            r3.post(r0)     // Catch: org.json.JSONException -> L18
        L18:
            r3 = 0
            r4.a(r3)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "videoPosition"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r2 = this;
            android.os.Handler r0 = r2.iK
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            return
    }
}
