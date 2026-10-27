package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class af implements com.kwad.sdk.core.webview.c.a {
    private final com.kwad.sdk.core.webview.b acw;
    private final boolean adc;
    private com.kwad.sdk.core.network.l<com.kwad.components.core.request.a, com.kwad.sdk.core.response.model.AdResultData> add;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements com.kwad.sdk.core.b {
        com.kwad.sdk.core.response.model.AdResultData mAdResultData;

        public a(com.kwad.sdk.core.response.model.AdResultData r1) {
                r0 = this;
                r0.<init>()
                r0.mAdResultData = r1
                return
        }

        @Override // com.kwad.sdk.core.b
        public final void parseJson(@androidx.annotation.Nullable org.json.JSONObject r1) {
                r0 = this;
                return
        }

        @Override // com.kwad.sdk.core.b
        public final org.json.JSONObject toJson() {
                r6 = this;
                com.kwad.sdk.core.response.model.AdResultData r0 = r6.mAdResultData
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                org.json.JSONObject r0 = r0.toJson()
                if (r0 != 0) goto Ld
                return r1
            Ld:
                org.json.JSONArray r1 = new org.json.JSONArray
                r1.<init>()
                com.kwad.sdk.core.response.model.AdResultData r2 = r6.mAdResultData
                java.util.List r2 = r2.getAdTemplateList()
                java.util.Iterator r2 = r2.iterator()
            L1c:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L4f
                java.lang.Object r3 = r2.next()
                com.kwad.sdk.core.response.model.AdTemplate r3 = (com.kwad.sdk.core.response.model.AdTemplate) r3
                java.lang.String r4 = r3.mOriginJString
                boolean r4 = android.text.TextUtils.isEmpty(r4)
                if (r4 != 0) goto L47
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3b
                java.lang.String r5 = r3.mOriginJString     // Catch: org.json.JSONException -> L3b
                r4.<init>(r5)     // Catch: org.json.JSONException -> L3b
                r1.put(r4)     // Catch: org.json.JSONException -> L3b
                goto L1c
            L3b:
                r4 = move-exception
                com.kwad.sdk.core.d.c.printStackTrace(r4)
                org.json.JSONObject r3 = r3.toJson()
                r1.put(r3)
                goto L1c
            L47:
                org.json.JSONObject r3 = r3.toJson()
                r1.put(r3)
                goto L1c
            L4f:
                java.lang.String r2 = "impAdInfo"
                com.kwad.sdk.utils.aa.putValue(r0, r2, r1)
                return r0
        }
    }

    public af(com.kwad.sdk.core.webview.b r1) {
            r0 = this;
            r0.<init>()
            r0.acw = r1
            r1 = 0
            r0.adc = r1
            return
    }

    private void a(com.kwad.components.core.request.model.ImpInfo r2, com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            com.kwad.sdk.core.network.l<com.kwad.components.core.request.a, com.kwad.sdk.core.response.model.AdResultData> r0 = r1.add
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            com.kwad.components.core.webview.jshandler.af$1 r0 = new com.kwad.components.core.webview.jshandler.af$1
            r0.<init>(r1, r2)
            r1.add = r0
            com.kwad.components.core.webview.jshandler.af$2 r2 = new com.kwad.components.core.webview.jshandler.af$2
            r2.<init>(r1, r3)
            r0.request(r2)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.jshandler.af r0, com.kwad.sdk.core.webview.c.c r1) {
            r0.a(r1)
            return
    }

    private void a(com.kwad.sdk.core.webview.c.c r2) {
            r1 = this;
            com.kwad.components.core.webview.jshandler.af$3 r0 = new com.kwad.components.core.webview.jshandler.af$3
            r0.<init>(r1, r2)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r4, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r5) {
            r3 = this;
            boolean r4 = r3.adc
            if (r4 == 0) goto L31
            com.kwad.sdk.core.webview.b r4 = r3.acw
            com.kwad.sdk.core.response.model.AdTemplate r4 = r4.getAdTemplate()
            com.kwad.components.core.request.model.ImpInfo r0 = new com.kwad.components.core.request.model.ImpInfo
            com.kwad.sdk.internal.api.SceneImpl r1 = r4.mAdScene
            r0.<init>(r1)
            com.kwad.sdk.internal.api.SceneImpl r1 = r4.mAdScene
            if (r1 == 0) goto L1c
            int r1 = r1.getPageScene()
            long r1 = (long) r1
            r0.pageScene = r1
        L1c:
            r1 = 106(0x6a, double:5.24E-322)
            r0.subPageScene = r1
            com.kwad.sdk.internal.api.SceneImpl r1 = r0.adScene
            r2 = 12
            r1.setAdNum(r2)
            java.lang.String r4 = com.kwad.sdk.core.response.b.e.eu(r4)
            r0.sdkExtraData = r4
            r3.a(r0, r5)
            return
        L31:
            com.kwad.sdk.core.webview.b r4 = r3.acw
            boolean r4 = r4.KJ()
            if (r4 == 0) goto L40
            r4 = -1
            java.lang.String r0 = "native adTemplate is null"
            r5.onError(r4, r0)
            return
        L40:
            com.kwad.components.core.webview.jshandler.af$a r4 = new com.kwad.components.core.webview.jshandler.af$a
            com.kwad.sdk.core.webview.b r0 = r3.acw
            com.kwad.sdk.core.response.model.AdResultData r0 = r0.iu()
            r4.<init>(r0)
            r5.a(r4)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "getKsAdData"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            com.kwad.sdk.core.network.l<com.kwad.components.core.request.a, com.kwad.sdk.core.response.model.AdResultData> r0 = r1.add
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }
}
