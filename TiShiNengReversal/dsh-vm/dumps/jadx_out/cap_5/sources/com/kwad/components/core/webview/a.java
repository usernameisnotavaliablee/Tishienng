package com.kwad.components.core.webview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private android.webkit.WebView Ta;
    private final java.util.Map<java.lang.String, com.kwad.sdk.core.webview.c.a> abG;
    private com.kwad.sdk.core.webview.c.a abH;
    private boolean abI;



    public a(android.webkit.WebView r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 32
            r0.<init>(r1)
            r2.abG = r0
            com.kwad.sdk.core.webview.c.d r0 = new com.kwad.sdk.core.webview.c.d
            r0.<init>()
            r2.abH = r0
            r2.Ta = r3
            r2.um()
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.a r0, java.lang.String r1, java.lang.String r2) {
            r0.o(r1, r2)
            return
    }

    private void o(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = r3.abI
            java.lang.String r1 = "KSAdJSBridge"
            if (r0 == 0) goto L18
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "callJS after destroy jsInterface, "
            r4.<init>(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.kwad.sdk.core.d.c.d(r1, r4)
            return
        L18:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L24
            java.lang.String r4 = "callJS callback is empty"
            com.kwad.sdk.core.d.c.d(r1, r4)
            return
        L24:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "callJS callback:+ "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r2 = "--params: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.kwad.sdk.core.d.c.d(r1, r0)
            android.webkit.WebView r0 = r3.Ta
            if (r0 != 0) goto L42
            return
        L42:
            com.kwad.sdk.utils.cc.a(r0, r4, r5)
            return
    }

    private void um() {
            r1 = this;
            com.kwad.sdk.core.webview.d.a r0 = new com.kwad.sdk.core.webview.d.a
            r0.<init>()
            r1.a(r0)
            com.kwad.sdk.core.webview.d.b r0 = new com.kwad.sdk.core.webview.d.b
            r0.<init>()
            r1.a(r0)
            com.kwad.components.core.webview.jshandler.ab r0 = new com.kwad.components.core.webview.jshandler.ab
            r0.<init>()
            r1.a(r0)
            return
    }

    public final void a(com.kwad.sdk.core.webview.c.a r4) {
            r3 = this;
            java.lang.String r0 = "KSAdJSBridge"
            if (r4 == 0) goto L39
            java.lang.String r1 = r4.getKey()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L39
            java.util.Map<java.lang.String, com.kwad.sdk.core.webview.c.a> r1 = r3.abG
            java.lang.String r2 = r4.getKey()
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "cannot register handler again, handler: "
            r1.<init>(r2)
            java.lang.String r2 = r4.getKey()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.kwad.sdk.core.d.c.e(r0, r1)
        L2f:
            java.util.Map<java.lang.String, com.kwad.sdk.core.webview.c.a> r0 = r3.abG
            java.lang.String r1 = r4.getKey()
            r0.put(r1, r4)
            return
        L39:
            java.lang.String r4 = "handler and handler'key cannot be null"
            com.kwad.sdk.core.d.c.e(r0, r4)
            return
    }

    public final void b(com.kwad.sdk.core.webview.c.a r3) {
            r2 = this;
            java.lang.String r0 = r3.getKey()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L14
            java.util.Map<java.lang.String, com.kwad.sdk.core.webview.c.a> r0 = r2.abG
            java.lang.String r1 = r3.getKey()
            r0.put(r1, r3)
            return
        L14:
            java.lang.String r3 = "KSAdJSBridge"
            java.lang.String r0 = "handler and handler'key cannot be null"
            com.kwad.sdk.core.d.c.e(r3, r0)
            return
    }

    @android.webkit.JavascriptInterface
    public final void callAdBridge(java.lang.String r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "callAdBridge =="
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "KSAdJSBridge"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.sdk.core.webview.c.b r0 = new com.kwad.sdk.core.webview.c.b     // Catch: org.json.JSONException -> L2f
            r0.<init>()     // Catch: org.json.JSONException -> L2f
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2f
            r2.<init>(r7)     // Catch: org.json.JSONException -> L2f
            r0.parseJson(r2)     // Catch: org.json.JSONException -> L2f
            java.util.Map<java.lang.String, com.kwad.sdk.core.webview.c.a> r7 = r6.abG     // Catch: org.json.JSONException -> L2f
            java.lang.String r2 = r0.aNF     // Catch: org.json.JSONException -> L2f
            java.lang.Object r7 = r7.get(r2)     // Catch: org.json.JSONException -> L2f
            com.kwad.sdk.core.webview.c.a r7 = (com.kwad.sdk.core.webview.c.a) r7     // Catch: org.json.JSONException -> L2f
            if (r7 != 0) goto L31
            com.kwad.sdk.core.webview.c.a r7 = r6.abH     // Catch: org.json.JSONException -> L2f
            goto L31
        L2f:
            r7 = move-exception
            goto L6b
        L31:
            android.webkit.WebView r2 = r6.Ta     // Catch: org.json.JSONException -> L2f
            if (r2 == 0) goto L4a
            boolean r3 = r2 instanceof com.kwad.sdk.core.webview.KsAdWebView     // Catch: org.json.JSONException -> L2f
            if (r3 == 0) goto L4a
            com.kwad.sdk.core.webview.KsAdWebView r2 = (com.kwad.sdk.core.webview.KsAdWebView) r2     // Catch: org.json.JSONException -> L2f
            java.lang.String r3 = r2.getUniqueId()     // Catch: org.json.JSONException -> L2f
            java.lang.String r2 = r2.getLoadUrl()     // Catch: org.json.JSONException -> L2f
            java.lang.String r4 = r0.aNF     // Catch: org.json.JSONException -> L2f
            java.lang.String r5 = r0.data     // Catch: org.json.JSONException -> L2f
            com.kwad.sdk.core.webview.b.c.b.a(r2, r3, r4, r5)     // Catch: org.json.JSONException -> L2f
        L4a:
            if (r7 == 0) goto L65
            java.lang.String r2 = r0.aNG     // Catch: org.json.JSONException -> L2f
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> L2f
            if (r2 != 0) goto L5a
            com.kwad.components.core.webview.a$1 r2 = new com.kwad.components.core.webview.a$1     // Catch: org.json.JSONException -> L2f
            r2.<init>(r6, r0)     // Catch: org.json.JSONException -> L2f
            goto L5f
        L5a:
            com.kwad.components.core.webview.a$2 r2 = new com.kwad.components.core.webview.a$2     // Catch: org.json.JSONException -> L2f
            r2.<init>(r6)     // Catch: org.json.JSONException -> L2f
        L5f:
            java.lang.String r0 = r0.data     // Catch: org.json.JSONException -> L2f
            r7.a(r0, r2)     // Catch: org.json.JSONException -> L2f
            return
        L65:
            java.lang.String r7 = "bridgeHandler is null"
            com.kwad.sdk.core.d.c.e(r1, r7)     // Catch: org.json.JSONException -> L2f
            return
        L6b:
            com.kwad.sdk.core.d.c.printStackTrace(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "callAdBridge JSONException:"
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.kwad.sdk.core.d.c.e(r1, r7)
            return
    }

    public final void destroy() {
            r2 = this;
            java.lang.String r0 = "KSAdJSBridge"
            java.lang.String r1 = "destroy jsInterface"
            com.kwad.sdk.core.d.c.i(r0, r1)
            java.util.Map<java.lang.String, com.kwad.sdk.core.webview.c.a> r0 = r2.abG
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            com.kwad.sdk.core.webview.c.a r1 = (com.kwad.sdk.core.webview.c.a) r1
            if (r1 == 0) goto L11
            r1.onDestroy()
            goto L11
        L29:
            r0 = 1
            r2.abI = r0
            return
    }
}
