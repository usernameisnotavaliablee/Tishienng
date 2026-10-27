package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class aj implements com.kwad.sdk.core.webview.c.a {
    private final android.os.Handler acR;
    private final com.kwad.sdk.core.webview.b acw;
    private final com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static final class a extends com.kwad.sdk.core.response.a.a {
        public int adr;
        public java.lang.String ads;
        public java.lang.String adt;

        @java.lang.Deprecated
        public boolean adu;
        public boolean adv;
        public boolean adw;
        public java.lang.String appId;
        public java.lang.String appName;
        public java.lang.String icon;
        public java.lang.String md5;
        public java.lang.String pkgName;
        public java.lang.String sX;
        public int type;
        public java.lang.String url;
        public java.lang.String version;
        public int versionCode;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public aj(com.kwad.sdk.core.webview.b r3) {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.acR = r0
            r2.acw = r3
            com.kwad.sdk.core.response.model.AdTemplate r0 = new com.kwad.sdk.core.response.model.AdTemplate
            r0.<init>()
            r2.mAdTemplate = r0
            com.kwad.sdk.core.response.model.AdTemplate r3 = r3.getAdTemplate()     // Catch: java.lang.Exception -> L2c
            if (r3 == 0) goto L35
            java.lang.String r1 = r3.mOriginJString     // Catch: java.lang.Exception -> L2c
            if (r1 == 0) goto L2e
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2c
            java.lang.String r3 = r3.mOriginJString     // Catch: java.lang.Exception -> L2c
            r1.<init>(r3)     // Catch: java.lang.Exception -> L2c
            r0.parseJson(r1)     // Catch: java.lang.Exception -> L2c
            return
        L2c:
            r3 = move-exception
            goto L36
        L2e:
            org.json.JSONObject r3 = r3.toJson()     // Catch: java.lang.Exception -> L2c
            r0.parseJson(r3)     // Catch: java.lang.Exception -> L2c
        L35:
            return
        L36:
            com.kwad.sdk.core.d.c.printStackTrace(r3)
            return
    }

    static /* synthetic */ com.kwad.components.core.e.d.c a(com.kwad.components.core.webview.jshandler.aj r0) {
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
            return r0
    }

    private static void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdInfo r3, @androidx.annotation.NonNull com.kwad.components.core.webview.jshandler.aj.a r4) {
            com.kwad.sdk.core.response.model.AdInfo$AdConversionInfo r0 = r3.adConversionInfo
            java.lang.String r1 = r4.ads
            r0.deeplinkUrl = r1
            java.lang.String r1 = r4.adt
            r0.marketUrl = r1
            com.kwad.sdk.core.response.model.AdInfo$AdBaseInfo r0 = r3.adBaseInfo
            int r1 = r4.type
            r0.adOperationType = r1
            java.lang.String r1 = r4.pkgName
            r0.appPackageName = r1
            java.lang.String r1 = r4.appName
            r0.appName = r1
            java.lang.String r1 = r4.version
            r0.appVersion = r1
            int r1 = r4.adr
            long r1 = (long) r1
            r0.packageSize = r1
            java.lang.String r1 = r4.icon
            r0.appIconUrl = r1
            java.lang.String r1 = r4.sX
            r0.appDescription = r1
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r3)
            if (r0 == 0) goto L3c
            com.kwad.sdk.core.response.model.AdInfo$AdConversionInfo r0 = r3.adConversionInfo
            java.lang.String r4 = r4.url
            r0.appDownloadUrl = r4
            java.lang.String r4 = com.kwad.sdk.utils.al.md5(r4)
            r3.downloadId = r4
            return
        L3c:
            com.kwad.sdk.core.response.model.AdInfo$AdConversionInfo r3 = r3.adConversionInfo
            java.lang.String r4 = r4.url
            r3.h5Url = r4
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate b(com.kwad.components.core.webview.jshandler.aj r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.webview.b c(com.kwad.components.core.webview.jshandler.aj r0) {
            com.kwad.sdk.core.webview.b r0 = r0.acw
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r4, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r5) {
            r3 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r0)
            if (r0 == 0) goto L20
            com.kwad.components.core.e.d.c r4 = r3.mApkDownloadHelper
            if (r4 != 0) goto L19
            com.kwad.components.core.e.d.c r4 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            r4.<init>(r0)
            r3.mApkDownloadHelper = r4
        L19:
            com.kwad.components.core.e.d.c r4 = r3.mApkDownloadHelper
            r0 = 2
            r4.aG(r0)
            goto L4e
        L20:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.components.core.webview.jshandler.aj$a r1 = new com.kwad.components.core.webview.jshandler.aj$a
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L34
            r2.<init>(r4)     // Catch: java.lang.Exception -> L34
            r1.parseJson(r2)     // Catch: java.lang.Exception -> L34
            goto L38
        L34:
            r4 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r4)
        L38:
            a(r0, r1)
            com.kwad.components.core.e.d.c r4 = r3.mApkDownloadHelper
            if (r4 != 0) goto L48
            com.kwad.components.core.e.d.c r4 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            r4.<init>(r0)
            r3.mApkDownloadHelper = r4
        L48:
            com.kwad.components.core.e.d.c r4 = r3.mApkDownloadHelper
            r0 = 1
            r4.aG(r0)
        L4e:
            android.os.Handler r4 = r3.acR
            com.kwad.components.core.webview.jshandler.aj$1 r0 = new com.kwad.components.core.webview.jshandler.aj$1
            r0.<init>(r3)
            r4.post(r0)
            r4 = 0
            r5.a(r4)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "handleAdUrl"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r2 = this;
            android.os.Handler r0 = r2.acR
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            return
    }
}
