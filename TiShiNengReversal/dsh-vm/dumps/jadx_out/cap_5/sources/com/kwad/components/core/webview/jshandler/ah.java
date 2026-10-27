package com.kwad.components.core.webview.jshandler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class ah implements com.kwad.sdk.core.webview.c.a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static final class a extends com.kwad.sdk.core.response.a.a {
        public java.lang.String LN;
        public int Qv;
        public int Qw;
        public java.lang.String SDKVersion;
        public int SDKVersionCode;
        public java.lang.String adg;
        public java.lang.String adh;
        public int adi;
        public java.lang.String adj;
        public int adk;
        public java.lang.String adl;
        public java.lang.String adm;
        public int adn;
        public int ado;
        public java.lang.String appId;
        public java.lang.String appName;
        public java.lang.String appVersion;
        public java.lang.String model;
        public java.lang.String sdkApiVersion;
        public int sdkApiVersionCode;
        public int sdkType;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.kwad.components.core.webview.jshandler.ah.a uC() {
                com.kwad.components.core.webview.jshandler.ah$a r0 = new com.kwad.components.core.webview.jshandler.ah$a
                r0.<init>()
                java.lang.String r1 = "4.6.30.1"
                r0.SDKVersion = r1
                r1 = 4063001(0x3dff19, float:5.693477E-39)
                r0.SDKVersionCode = r1
                java.lang.Class<com.kwad.sdk.service.a.f> r1 = com.kwad.sdk.service.a.f.class
                java.lang.Object r2 = com.kwad.sdk.service.ServiceProvider.get(r1)
                com.kwad.sdk.service.a.f r2 = (com.kwad.sdk.service.a.f) r2
                java.lang.String r2 = r2.getApiVersion()
                r0.sdkApiVersion = r2
                java.lang.Object r2 = com.kwad.sdk.service.ServiceProvider.get(r1)
                com.kwad.sdk.service.a.f r2 = (com.kwad.sdk.service.a.f) r2
                int r2 = r2.getApiVersionCode()
                r0.sdkApiVersionCode = r2
                r2 = 1
                r0.sdkType = r2
                java.lang.Object r3 = com.kwad.sdk.service.ServiceProvider.get(r1)
                com.kwad.sdk.service.a.f r3 = (com.kwad.sdk.service.a.f) r3
                android.content.Context r3 = r3.getContext()
                java.lang.String r4 = com.kwad.sdk.utils.m.cE(r3)
                r0.appVersion = r4
                java.lang.Object r4 = com.kwad.sdk.service.ServiceProvider.get(r1)
                com.kwad.sdk.service.a.f r4 = (com.kwad.sdk.service.a.f) r4
                java.lang.String r4 = r4.getAppName()
                r0.appName = r4
                java.lang.Object r1 = com.kwad.sdk.service.ServiceProvider.get(r1)
                com.kwad.sdk.service.a.f r1 = (com.kwad.sdk.service.a.f) r1
                java.lang.String r1 = r1.getAppId()
                r0.appId = r1
                int r1 = com.kwad.sdk.utils.ao.df(r3)
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r0.adg = r1
                java.lang.String r1 = com.kwad.sdk.utils.br.Sd()
                r0.adh = r1
                java.lang.String r1 = com.kwad.sdk.utils.br.RT()
                r0.model = r1
                java.lang.String r1 = com.kwad.sdk.utils.br.RV()
                r0.LN = r1
                r0.adi = r2
                java.lang.String r1 = com.kwad.sdk.utils.br.getOsVersion()
                r0.adj = r1
                int r1 = com.kwad.sdk.utils.br.Sg()
                r0.adk = r1
                java.lang.String r1 = com.kwad.sdk.utils.br.getLanguage()
                r0.adl = r1
                java.lang.String r1 = com.kwad.sdk.utils.br.getLocale()
                r0.adm = r1
                int r1 = com.kwad.sdk.utils.br.getScreenWidth(r3)
                r0.Qw = r1
                int r1 = com.kwad.sdk.utils.br.getScreenHeight(r3)
                r0.Qv = r1
                int r1 = com.kwad.sdk.c.a.a.getStatusBarHeight(r3)
                r0.adn = r1
                r1 = 1112014848(0x42480000, float:50.0)
                int r1 = com.kwad.sdk.c.a.a.a(r3, r1)
                r0.ado = r1
                return r0
        }
    }

    public ah() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(java.lang.String r1, @androidx.annotation.NonNull com.kwad.sdk.core.webview.c.c r2) {
            r0 = this;
            com.kwad.components.core.webview.jshandler.ah$a r1 = com.kwad.components.core.webview.jshandler.ah.a.uC()
            r2.a(r1)
            return
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @androidx.annotation.NonNull
    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = "getKsPlayableDeviceInfo"
            return r0
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
            r0 = this;
            return
    }
}
