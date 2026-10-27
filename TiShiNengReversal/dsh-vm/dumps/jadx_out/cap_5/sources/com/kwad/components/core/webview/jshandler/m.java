package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class m implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.components.core.e.d.c Pc;
    private com.kwad.sdk.api.KsAppDownloadListener abU;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private android.content.Context mContext;
    private com.kwad.sdk.core.webview.c.c qn;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.core.response.a.a {
        public java.lang.String acu;
        public java.lang.String packageName;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class b extends com.kwad.sdk.core.response.a.a {
        public int acv;
        public int progress;
        public long soFarBytes;
        public int status;
        public long totalBytes;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public m(android.content.Context r1, com.kwad.sdk.core.response.model.AdTemplate r2) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            r0.mAdTemplate = r2
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.jshandler.m r0, int r1, int r2) {
            r0.q(r1, r2)
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

    private void q(int r7, int r8) {
            r6 = this;
            com.kwad.sdk.core.webview.c.c r0 = r6.qn
            if (r0 == 0) goto L3e
            com.kwad.components.core.webview.jshandler.m$b r0 = new com.kwad.components.core.webview.jshandler.m$b
            r0.<init>()
            r0.status = r7
            r0.progress = r8
            com.kwad.sdk.core.response.model.AdTemplate r7 = r6.mAdTemplate
            if (r7 == 0) goto L39
            com.kwad.sdk.core.response.model.AdInfo r7 = com.kwad.sdk.core.response.b.e.el(r7)
            long r7 = r7.totalBytes
            r0.totalBytes = r7
            com.kwad.sdk.core.response.model.AdTemplate r7 = r6.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r7 = com.kwad.sdk.core.response.b.e.el(r7)
            long r7 = r7.soFarBytes
            r0.soFarBytes = r7
            long r1 = r0.totalBytes
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r7 = (float) r7
            r8 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 * r8
            float r8 = (float) r1
            float r7 = r7 / r8
            int r7 = (int) r7
            r0.acv = r7
            goto L39
        L36:
            r7 = 0
            r0.acv = r7
        L39:
            com.kwad.sdk.core.webview.c.c r7 = r6.qn
            r7.a(r0)
        L3e:
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
            com.kwad.components.core.webview.jshandler.m$1 r0 = new com.kwad.components.core.webview.jshandler.m$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r4, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r5) {
            r3 = this;
            r3.qn = r5
            com.kwad.components.core.webview.jshandler.m$a r0 = new com.kwad.components.core.webview.jshandler.m$a
            r0.<init>()
            r1 = -1
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L5c
            r2.<init>(r4)     // Catch: java.lang.Exception -> L5c
            r0.parseJson(r2)     // Catch: java.lang.Exception -> L5c
            java.lang.String r4 = r0.acu
            java.lang.String r2 = r0.packageName
            boolean r4 = q(r4, r2)
            if (r4 == 0) goto L20
            java.lang.String r4 = "param is empty"
            r5.onError(r1, r4)
            return
        L20:
            com.kwad.components.core.e.d.c r4 = r3.Pc
            if (r4 != 0) goto L2b
            java.lang.String r4 = r0.acu
            java.lang.String r5 = r0.packageName
            r3.p(r4, r5)
        L2b:
            com.kwad.components.core.e.d.a$a r4 = new com.kwad.components.core.e.d.a$a
            android.content.Context r5 = r3.mContext
            r4.<init>(r5)
            r5 = 1
            com.kwad.components.core.e.d.a$a r4 = r4.aq(r5)
            r5 = 0
            com.kwad.components.core.e.d.a$a r4 = r4.ar(r5)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.components.core.e.d.a$a r4 = r4.aB(r0)
            com.kwad.components.core.e.d.a$a r4 = r4.at(r5)
            com.kwad.components.core.e.d.c r5 = r3.Pc
            boolean r5 = r5.s(r4)
            if (r5 == 0) goto L4f
            return
        L4f:
            com.kwad.components.core.e.d.c r5 = r3.Pc
            com.kwad.sdk.api.KsAppDownloadListener r0 = r3.abU
            r5.d(r0)
            com.kwad.components.core.e.d.c r5 = r3.Pc
            r5.r(r4)
            return
        L5c:
            java.lang.String r4 = "data parse error"
            r5.onError(r1, r4)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "installAppForDownload"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r1 = this;
            r0 = 0
            r1.qn = r0
            return
    }
}
