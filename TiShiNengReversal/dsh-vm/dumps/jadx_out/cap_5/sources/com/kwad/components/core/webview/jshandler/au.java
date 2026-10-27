package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class au implements com.kwad.sdk.core.webview.c.a {

    @androidx.annotation.Nullable
    private com.kwad.sdk.api.KsAppDownloadListener abU;

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.webview.c.c ack;
    private final com.kwad.sdk.core.webview.b eQ;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static final class a extends com.kwad.sdk.core.response.a.a {
        public double adT;
        public double adU;
        public long soFarBytes;
        public int status;
        public long totalBytes;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static final class b extends com.kwad.sdk.core.response.a.a {
        public long aeb;
        public java.lang.String appName;
        public java.lang.String icon;
        public java.lang.String md5;
        public java.lang.String pkgName;
        public java.lang.String sX;
        public java.lang.String url;
        public java.lang.String version;
        public int versionCode;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public au(com.kwad.sdk.core.webview.b r3) {
            r2 = this;
            r2.<init>()
            r2.eQ = r3
            com.kwad.sdk.core.response.model.AdTemplate r0 = new com.kwad.sdk.core.response.model.AdTemplate     // Catch: java.lang.Exception -> L23
            r0.<init>()     // Catch: java.lang.Exception -> L23
            r2.mAdTemplate = r0     // Catch: java.lang.Exception -> L23
            com.kwad.sdk.core.response.model.AdTemplate r3 = r3.getAdTemplate()     // Catch: java.lang.Exception -> L23
            if (r3 == 0) goto L2e
            java.lang.String r0 = r3.mOriginJString     // Catch: java.lang.Exception -> L23
            if (r0 == 0) goto L25
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate     // Catch: java.lang.Exception -> L23
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L23
            java.lang.String r3 = r3.mOriginJString     // Catch: java.lang.Exception -> L23
            r1.<init>(r3)     // Catch: java.lang.Exception -> L23
            r0.parseJson(r1)     // Catch: java.lang.Exception -> L23
            return
        L23:
            r3 = move-exception
            goto L2f
        L25:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate     // Catch: java.lang.Exception -> L23
            org.json.JSONObject r3 = r3.toJson()     // Catch: java.lang.Exception -> L23
            r0.parseJson(r3)     // Catch: java.lang.Exception -> L23
        L2e:
            return
        L2f:
            com.kwad.sdk.core.d.c.printStackTrace(r3)
            return
    }

    private void a(int r7, float r8) {
            r6 = this;
            com.kwad.sdk.core.webview.c.c r0 = r6.ack
            if (r0 == 0) goto L3f
            com.kwad.components.core.webview.jshandler.au$a r0 = new com.kwad.components.core.webview.jshandler.au$a
            r0.<init>()
            double r1 = (double) r8
            r0.adT = r1
            r0.status = r7
            com.kwad.sdk.core.response.model.AdTemplate r7 = r6.mAdTemplate
            if (r7 == 0) goto L3a
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
            double r7 = (double) r7
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r7 = r7 * r3
            double r1 = (double) r1
            double r7 = r7 / r1
            r0.adU = r7
            goto L3a
        L36:
            r7 = 0
            r0.adU = r7
        L3a:
            com.kwad.sdk.core.webview.c.c r7 = r6.ack
            r7.a(r0)
        L3f:
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.jshandler.au r0, int r1, float r2) {
            r0.a(r1, r2)
            return
    }

    private static void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdInfo r3, @androidx.annotation.NonNull com.kwad.components.core.webview.jshandler.au.b r4) {
            com.kwad.sdk.core.response.model.AdInfo$AdBaseInfo r0 = r3.adBaseInfo
            r1 = 1
            r0.adOperationType = r1
            java.lang.String r1 = r4.pkgName
            r0.appPackageName = r1
            java.lang.String r1 = r4.appName
            r0.appName = r1
            java.lang.String r1 = r4.version
            r0.appVersion = r1
            long r1 = r4.aeb
            r0.packageSize = r1
            java.lang.String r1 = r4.icon
            r0.appIconUrl = r1
            java.lang.String r1 = r4.sX
            r0.appDescription = r1
            com.kwad.sdk.core.response.model.AdInfo$AdConversionInfo r0 = r3.adConversionInfo
            java.lang.String r4 = r4.url
            r0.appDownloadUrl = r4
            java.lang.String r4 = com.kwad.sdk.utils.al.md5(r4)
            r3.downloadId = r4
            return
    }

    private com.kwad.sdk.api.KsAppDownloadListener uz() {
            r1 = this;
            com.kwad.components.core.webview.jshandler.au$1 r0 = new com.kwad.components.core.webview.jshandler.au$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r4, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r5) {
            r3 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            if (r0 != 0) goto Lb
            r4 = -1
            java.lang.String r0 = "native photo is null"
            r5.onError(r4, r0)
            return
        Lb:
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r0)
            if (r0 == 0) goto L29
            com.kwad.components.core.e.d.c r4 = r3.mApkDownloadHelper
            if (r4 != 0) goto L22
            com.kwad.components.core.e.d.c r4 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            r4.<init>(r0)
            r3.mApkDownloadHelper = r4
        L22:
            com.kwad.components.core.e.d.c r4 = r3.mApkDownloadHelper
            r0 = 2
            r4.aG(r0)
            goto L57
        L29:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.components.core.webview.jshandler.au$b r1 = new com.kwad.components.core.webview.jshandler.au$b
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3d
            r2.<init>(r4)     // Catch: java.lang.Exception -> L3d
            r1.parseJson(r2)     // Catch: java.lang.Exception -> L3d
            goto L41
        L3d:
            r4 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r4)
        L41:
            a(r0, r1)
            com.kwad.components.core.e.d.c r4 = r3.mApkDownloadHelper
            if (r4 != 0) goto L51
            com.kwad.components.core.e.d.c r4 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            r4.<init>(r0)
            r3.mApkDownloadHelper = r4
        L51:
            com.kwad.components.core.e.d.c r4 = r3.mApkDownloadHelper
            r0 = 1
            r4.aG(r0)
        L57:
            r3.ack = r5
            com.kwad.sdk.api.KsAppDownloadListener r4 = r3.abU
            if (r4 != 0) goto L69
            com.kwad.sdk.api.KsAppDownloadListener r4 = r3.uz()
            r3.abU = r4
            com.kwad.components.core.e.d.c r5 = r3.mApkDownloadHelper
            r5.b(r4)
            return
        L69:
            com.kwad.components.core.e.d.c r5 = r3.mApkDownloadHelper
            r5.d(r4)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "registerApkStatusListener"
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
}
