package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class ap implements com.kwad.sdk.core.webview.c.a {
    private final com.kwad.sdk.core.webview.b eQ;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static final class a extends com.kwad.sdk.core.response.a.a {
        public java.lang.String adM;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static final class b extends com.kwad.sdk.core.response.a.a {
        public double adT;
        public double adU;
        public long soFarBytes;
        public int status;
        public long totalBytes;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ap() {
            r1 = this;
            r1.<init>()
            return
    }

    static /* synthetic */ com.kwad.sdk.core.webview.b a(com.kwad.components.core.webview.jshandler.ap r0) {
            com.kwad.sdk.core.webview.b r0 = r0.eQ
            return r0
    }

    private void a(int r7, float r8, com.kwad.sdk.core.webview.c.c r9) {
            r6 = this;
            if (r9 == 0) goto L41
            com.kwad.components.core.webview.jshandler.ap$b r0 = new com.kwad.components.core.webview.jshandler.ap$b
            r0.<init>()
            double r1 = (double) r8
            r0.adT = r1
            r0.status = r7
            com.kwad.sdk.core.webview.b r7 = r6.eQ
            com.kwad.sdk.core.response.model.AdTemplate r7 = r7.getAdTemplate()
            com.kwad.sdk.core.response.model.AdInfo r7 = com.kwad.sdk.core.response.b.e.el(r7)
            long r7 = r7.totalBytes
            r0.totalBytes = r7
            com.kwad.sdk.core.webview.b r7 = r6.eQ
            com.kwad.sdk.core.response.model.AdTemplate r7 = r7.getAdTemplate()
            com.kwad.sdk.core.response.model.AdInfo r7 = com.kwad.sdk.core.response.b.e.el(r7)
            long r7 = r7.soFarBytes
            r0.soFarBytes = r7
            long r1 = r0.totalBytes
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L3a
            double r7 = (double) r7
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r7 = r7 * r3
            double r1 = (double) r1
            double r7 = r7 / r1
            r0.adU = r7
            goto L3e
        L3a:
            r7 = 0
            r0.adU = r7
        L3e:
            r9.a(r0)
        L41:
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.jshandler.ap r0, int r1, float r2, com.kwad.sdk.core.webview.c.c r3) {
            r0.a(r1, r2, r3)
            return
    }

    private com.kwad.sdk.api.KsAppDownloadListener aX(java.lang.String r2) {
            r1 = this;
            com.kwad.components.core.webview.jshandler.ap$1 r0 = new com.kwad.components.core.webview.jshandler.ap$1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r4, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r5) {
            r3 = this;
            com.kwad.components.core.webview.jshandler.ap$a r0 = new com.kwad.components.core.webview.jshandler.ap$a
            r0.<init>()
            com.kwad.sdk.core.response.model.AdTemplate r1 = new com.kwad.sdk.core.response.model.AdTemplate
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1d
            r2.<init>(r4)     // Catch: java.lang.Exception -> L1d
            r0.parseJson(r2)     // Catch: java.lang.Exception -> L1d
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1d
            java.lang.String r0 = r0.adM     // Catch: java.lang.Exception -> L1d
            r4.<init>(r0)     // Catch: java.lang.Exception -> L1d
            r1.parseJson(r4)     // Catch: java.lang.Exception -> L1d
            goto L22
        L1d:
            r4 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r4)
            r1 = 0
        L22:
            if (r1 == 0) goto L4e
            boolean r4 = com.kwad.sdk.core.response.b.e.ed(r1)
            if (r4 == 0) goto L4e
            com.kwad.sdk.core.webview.b r4 = r3.eQ
            com.kwad.sdk.utils.an r4 = r4.aMO
            if (r4 == 0) goto L4e
            com.kwad.components.core.e.d.c r4 = new com.kwad.components.core.e.d.c
            r4.<init>(r1)
            java.lang.String r0 = r4.pC()
            com.kwad.sdk.api.KsAppDownloadListener r1 = r3.aX(r0)
            r4.b(r1)
            com.kwad.sdk.core.webview.b r1 = r3.eQ
            com.kwad.sdk.utils.an r1 = r1.aMO
            r1.a(r0, r4)
            com.kwad.sdk.core.webview.b r4 = r3.eQ
            com.kwad.sdk.utils.an r4 = r4.aMO
            r4.b(r0, r5)
        L4e:
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerProgressListener"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            com.kwad.sdk.core.webview.b r0 = r1.eQ
            com.kwad.sdk.utils.an r0 = r0.aMO
            if (r0 == 0) goto L9
            r0.release()
        L9:
            return
    }
}
