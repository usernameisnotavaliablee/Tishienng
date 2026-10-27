package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class as implements com.kwad.sdk.core.webview.c.a {
    private android.os.Handler acR;
    private com.kwad.sdk.core.webview.c.c acS;
    private com.kwad.components.core.webview.jshandler.as.b eW;
    private java.lang.String mUrl;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static final class a extends com.kwad.sdk.core.response.a.a {
        public java.lang.String errorMsg;
        public int status;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public final boolean isSuccess() {
                r2 = this;
                int r0 = r2.status
                r1 = 1
                if (r0 != r1) goto L6
                return r1
            L6:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        @androidx.annotation.MainThread
        void a(com.kwad.components.core.webview.jshandler.as.a r1);
    }

    @java.lang.Deprecated
    public as(com.kwad.components.core.webview.jshandler.as.b r2) {
            r1 = this;
            r1.<init>()
            r1.eW = r2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0)
            r1.acR = r2
            return
    }

    public as(com.kwad.components.core.webview.jshandler.as.b r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r1.eW = r2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0)
            r1.acR = r2
            r1.mUrl = r3
            return
    }

    static /* synthetic */ com.kwad.sdk.core.webview.c.c a(com.kwad.components.core.webview.jshandler.as r0) {
            com.kwad.sdk.core.webview.c.c r0 = r0.acS
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.jshandler.as r0, com.kwad.components.core.webview.jshandler.as.a r1) {
            r0.b(r1)
            return
    }

    private void b(com.kwad.components.core.webview.jshandler.as.a r2) {
            r1 = this;
            com.kwad.components.core.webview.jshandler.as$b r0 = r1.eW
            if (r0 == 0) goto L7
            r0.a(r2)
        L7:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r4) {
            r2 = this;
            r2.acS = r4
            com.kwad.components.core.webview.jshandler.as$a r0 = new com.kwad.components.core.webview.jshandler.as$a     // Catch: org.json.JSONException -> L1a
            r0.<init>()     // Catch: org.json.JSONException -> L1a
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1a
            r1.<init>(r3)     // Catch: org.json.JSONException -> L1a
            r0.parseJson(r1)     // Catch: org.json.JSONException -> L1a
            android.os.Handler r3 = r2.acR     // Catch: org.json.JSONException -> L1a
            com.kwad.components.core.webview.jshandler.as$1 r1 = new com.kwad.components.core.webview.jshandler.as$1     // Catch: org.json.JSONException -> L1a
            r1.<init>(r2, r0)     // Catch: org.json.JSONException -> L1a
            r3.post(r1)     // Catch: org.json.JSONException -> L1a
            return
        L1a:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "handleJsCall error: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "WebCardPageStatusHandler"
            com.kwad.sdk.core.d.c.e(r1, r0)
            java.lang.String r0 = r2.mUrl
            java.lang.String r1 = r3.getMessage()
            com.kwad.sdk.core.webview.b.c.b.ag(r0, r1)
            r0 = -1
            java.lang.String r3 = r3.getMessage()
            r4.onError(r0, r3)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "pageStatus"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r2 = this;
            r0 = 0
            r2.eW = r0
            r2.acS = r0
            android.os.Handler r1 = r2.acR
            r1.removeCallbacksAndMessages(r0)
            return
    }
}
