package com.kwad.components.core.webview.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private com.kwad.components.core.e.d.c Pc;
    private android.webkit.WebView Ta;
    private boolean abI;
    private com.kwad.sdk.api.KsAppDownloadListener abU;
    private int abV;
    private int abW;
    private com.kwad.sdk.core.webview.b eQ;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    /* renamed from: com.kwad.components.core.webview.a.a$a, reason: collision with other inner class name */
    public static final class C0093a extends com.kwad.sdk.core.response.a.a {
        public java.lang.String packageName;
        public java.lang.String url;

        public C0093a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static final class b extends com.kwad.sdk.core.response.a.a {
        public int progress;
        public int status;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public a(android.webkit.WebView r2, com.kwad.sdk.core.webview.b r3) {
            r1 = this;
            r1.<init>()
            r0 = -100
            r1.abV = r0
            r0 = 0
            r1.abW = r0
            r1.Ta = r2
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.getAdTemplate()
            r1.mAdTemplate = r2
            r1.eQ = r3
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.a.a r0, int r1, int r2) {
            r0.q(r1, r2)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.a.a r0, java.lang.String r1) {
            r0.aQ(r1)
            return
    }

    private void aQ(java.lang.String r3) {
            r2 = this;
            com.kwad.components.core.webview.a.a$a r0 = new com.kwad.components.core.webview.a.a$a     // Catch: org.json.JSONException -> L24
            r0.<init>()     // Catch: org.json.JSONException -> L24
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L24
            r1.<init>(r3)     // Catch: org.json.JSONException -> L24
            r0.parseJson(r1)     // Catch: org.json.JSONException -> L24
            java.lang.String r3 = r0.url     // Catch: org.json.JSONException -> L24
            java.lang.String r1 = r0.packageName     // Catch: org.json.JSONException -> L24
            boolean r3 = q(r3, r1)     // Catch: org.json.JSONException -> L24
            if (r3 == 0) goto L18
            goto L4f
        L18:
            com.kwad.components.core.e.d.c r3 = r2.Pc     // Catch: org.json.JSONException -> L24
            if (r3 != 0) goto L26
            java.lang.String r3 = r0.url     // Catch: org.json.JSONException -> L24
            java.lang.String r0 = r0.packageName     // Catch: org.json.JSONException -> L24
            r2.p(r3, r0)     // Catch: org.json.JSONException -> L24
            goto L26
        L24:
            r3 = move-exception
            goto L5d
        L26:
            com.kwad.components.core.e.d.a$a r3 = new com.kwad.components.core.e.d.a$a     // Catch: org.json.JSONException -> L24
            com.kwad.sdk.core.webview.b r0 = r2.eQ     // Catch: org.json.JSONException -> L24
            android.webkit.WebView r0 = r0.Ta     // Catch: org.json.JSONException -> L24
            android.content.Context r0 = r0.getContext()     // Catch: org.json.JSONException -> L24
            r3.<init>(r0)     // Catch: org.json.JSONException -> L24
            r0 = 1
            com.kwad.components.core.e.d.a$a r3 = r3.aq(r0)     // Catch: org.json.JSONException -> L24
            r0 = 0
            com.kwad.components.core.e.d.a$a r3 = r3.ar(r0)     // Catch: org.json.JSONException -> L24
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate     // Catch: org.json.JSONException -> L24
            com.kwad.components.core.e.d.a$a r3 = r3.aB(r1)     // Catch: org.json.JSONException -> L24
            com.kwad.components.core.e.d.a$a r3 = r3.at(r0)     // Catch: org.json.JSONException -> L24
            com.kwad.components.core.e.d.c r0 = r2.Pc     // Catch: org.json.JSONException -> L24
            boolean r0 = r0.s(r3)     // Catch: org.json.JSONException -> L24
            if (r0 == 0) goto L50
        L4f:
            return
        L50:
            com.kwad.components.core.e.d.c r0 = r2.Pc     // Catch: org.json.JSONException -> L24
            com.kwad.sdk.api.KsAppDownloadListener r1 = r2.abU     // Catch: org.json.JSONException -> L24
            r0.d(r1)     // Catch: org.json.JSONException -> L24
            com.kwad.components.core.e.d.c r0 = r2.Pc     // Catch: org.json.JSONException -> L24
            r0.r(r3)     // Catch: org.json.JSONException -> L24
            return
        L5d:
            com.kwad.sdk.core.d.c.printStackTrace(r3)
            return
    }

    private void o(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.abI
            if (r0 == 0) goto L5
            goto L10
        L5:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lc
            goto L10
        Lc:
            android.webkit.WebView r0 = r1.Ta
            if (r0 != 0) goto L11
        L10:
            return
        L11:
            com.kwad.sdk.utils.cc.a(r0, r2, r3)
            return
    }

    private synchronized void p(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            monitor-enter(r3)
            com.kwad.components.core.e.d.c r0 = new com.kwad.components.core.e.d.c     // Catch: java.lang.Throwable -> L1b
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate     // Catch: java.lang.Throwable -> L1b
            r2 = 0
            r0.<init>(r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L1b
            r3.Pc = r0     // Catch: java.lang.Throwable -> L1b
            com.kwad.sdk.api.KsAppDownloadListener r4 = r3.abU     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L1d
            com.kwad.sdk.api.KsAppDownloadListener r4 = r3.uz()     // Catch: java.lang.Throwable -> L1b
            r3.abU = r4     // Catch: java.lang.Throwable -> L1b
            com.kwad.components.core.e.d.c r5 = r3.Pc     // Catch: java.lang.Throwable -> L1b
            r5.b(r4)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r4 = move-exception
            goto L1f
        L1d:
            monitor-exit(r3)
            return
        L1f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            throw r4
    }

    private void q(int r1, int r2) {
            r0 = this;
            r0.abW = r2
            int r2 = r0.abV
            if (r2 == r1) goto L19
            r0.abV = r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "onDownLoadStatusCallback"
            r0.o(r2, r1)
        L19:
            return
    }

    private static boolean q(java.lang.String r0, java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lf
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    private com.kwad.sdk.api.KsAppDownloadListener uz() {
            r1 = this;
            com.kwad.components.core.webview.a.a$2 r0 = new com.kwad.components.core.webview.a.a$2
            r0.<init>(r1)
            return r0
    }

    public final void destroy() {
            r2 = this;
            r0 = 1
            r2.abI = r0
            com.kwad.components.core.e.d.c r0 = r2.Pc
            if (r0 == 0) goto Lc
            com.kwad.sdk.api.KsAppDownloadListener r1 = r2.abU
            r0.c(r1)
        Lc:
            return
    }

    @android.webkit.JavascriptInterface
    public final int getDownLoadStatus(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = q(r2, r3)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            com.kwad.components.core.e.d.c r0 = r1.Pc
            if (r0 != 0) goto Lf
            r1.p(r2, r3)
        Lf:
            com.kwad.components.core.e.d.c r2 = r1.Pc
            int r2 = r2.pB()
            return r2
    }

    @android.webkit.JavascriptInterface
    public final int getProgress(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = q(r2, r3)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            com.kwad.components.core.e.d.c r0 = r1.Pc
            if (r0 != 0) goto Lf
            r1.p(r2, r3)
        Lf:
            int r2 = r1.abW
            return r2
    }

    @android.webkit.JavascriptInterface
    @androidx.annotation.WorkerThread
    public final void handleAdClick(java.lang.String r2) {
            r1 = this;
            com.kwad.components.core.webview.a.a$1 r0 = new com.kwad.components.core.webview.a.a$1
            r0.<init>(r1, r2)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }
}
