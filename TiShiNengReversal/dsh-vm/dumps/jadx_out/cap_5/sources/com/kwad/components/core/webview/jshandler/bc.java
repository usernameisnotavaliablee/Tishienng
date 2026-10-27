package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class bc implements com.kwad.sdk.core.webview.c.a {

    @androidx.annotation.Nullable
    private com.kwad.sdk.api.KsAppDownloadListener abU;

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.webview.c.c ack;

    @androidx.annotation.Nullable
    private com.kwad.sdk.api.KsAppDownloadListener aen;
    private final com.kwad.sdk.core.webview.b eQ;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements com.kwad.sdk.core.b {
        public float aep;
        public float aeq;
        public long creativeId;
        public long soFarBytes;
        public int status;
        public long totalBytes;

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
                r4 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "progress"
                float r2 = r4.aep
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                java.lang.String r1 = "status"
                int r2 = r4.status
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                java.lang.String r1 = "totalBytes"
                long r2 = r4.totalBytes
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                java.lang.String r1 = "soFarBytes"
                long r2 = r4.soFarBytes
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                java.lang.String r1 = "realProgress"
                float r2 = r4.aeq
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                java.lang.String r1 = "creativeId"
                long r2 = r4.creativeId
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                return r0
        }
    }

    public bc(com.kwad.sdk.core.webview.b r1, @androidx.annotation.Nullable com.kwad.components.core.e.d.c r2) {
            r0 = this;
            r0.<init>()
            r0.eQ = r1
            r0.mApkDownloadHelper = r2
            return
    }

    public bc(com.kwad.sdk.core.webview.b r1, @androidx.annotation.Nullable com.kwad.components.core.e.d.c r2, @androidx.annotation.Nullable com.kwad.sdk.api.KsAppDownloadListener r3) {
            r0 = this;
            r0.<init>()
            r0.eQ = r1
            r0.mApkDownloadHelper = r2
            r0.aen = r3
            return
    }

    static /* synthetic */ com.kwad.sdk.api.KsAppDownloadListener a(com.kwad.components.core.webview.jshandler.bc r0) {
            com.kwad.sdk.api.KsAppDownloadListener r0 = r0.aen
            return r0
    }

    private void a(int r7, float r8) {
            r6 = this;
            com.kwad.sdk.core.webview.c.c r0 = r6.ack
            if (r0 == 0) goto L43
            com.kwad.components.core.webview.jshandler.bc$a r0 = new com.kwad.components.core.webview.jshandler.bc$a
            r0.<init>()
            r0.aep = r8
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
            if (r5 <= 0) goto L3b
            float r7 = (float) r7
            r8 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 * r8
            float r8 = (float) r1
            float r7 = r7 / r8
            r0.aeq = r7
            goto L3e
        L3b:
            r7 = 0
            r0.aeq = r7
        L3e:
            com.kwad.sdk.core.webview.c.c r7 = r6.ack
            r7.a(r0)
        L43:
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.jshandler.bc r0, int r1, float r2) {
            r0.a(r1, r2)
            return
    }

    private com.kwad.sdk.api.KsAppDownloadListener uz() {
            r1 = this;
            com.kwad.components.core.webview.jshandler.bc$1 r0 = new com.kwad.components.core.webview.jshandler.bc$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r3) {
            r1 = this;
            com.kwad.sdk.core.webview.b r2 = r1.eQ
            boolean r2 = r2.KJ()
            if (r2 == 0) goto Lf
            r2 = -1
            java.lang.String r0 = "native photo is null"
            r3.onError(r2, r0)
            return
        Lf:
            r1.ack = r3
            com.kwad.components.core.e.d.c r2 = r1.mApkDownloadHelper
            if (r2 == 0) goto L28
            com.kwad.sdk.api.KsAppDownloadListener r3 = r1.abU
            if (r3 != 0) goto L25
            com.kwad.sdk.api.KsAppDownloadListener r2 = r1.uz()
            r1.abU = r2
            com.kwad.components.core.e.d.c r3 = r1.mApkDownloadHelper
            r3.b(r2)
            return
        L25:
            r2.d(r3)
        L28:
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
            r3 = this;
            r0 = 0
            r3.ack = r0
            com.kwad.components.core.e.d.c r1 = r3.mApkDownloadHelper
            if (r1 == 0) goto L10
            com.kwad.sdk.api.KsAppDownloadListener r2 = r3.abU
            if (r2 == 0) goto L10
            r1.c(r2)
            r3.abU = r0
        L10:
            return
    }

    public final void setApkDownloadHelper(com.kwad.components.core.e.d.c r3) {
            r2 = this;
            com.kwad.components.core.e.d.c r0 = r2.mApkDownloadHelper
            r0.pQ()
            com.kwad.sdk.core.download.b r0 = com.kwad.sdk.core.download.b.GR()
            com.kwad.components.core.e.d.c r1 = r2.mApkDownloadHelper
            r0.a(r1)
            boolean r0 = com.kwad.sdk.core.config.e.FG()
            if (r0 == 0) goto L1d
            com.kwad.sdk.core.NetworkMonitor r0 = com.kwad.sdk.core.NetworkMonitor.getInstance()
            com.kwad.components.core.e.d.c r1 = r2.mApkDownloadHelper
            r0.a(r1)
        L1d:
            r2.mApkDownloadHelper = r3
            com.kwad.sdk.api.KsAppDownloadListener r3 = r2.uz()
            r2.abU = r3
            com.kwad.components.core.e.d.c r0 = r2.mApkDownloadHelper
            r0.b(r3)
            return
    }
}
