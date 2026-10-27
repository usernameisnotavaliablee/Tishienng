package com.kwad.components.ad.splashscreen.monitor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c {
    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(com.kwad.sdk.core.response.model.AdTemplate r2, java.lang.String r3, long r4, int r6, java.lang.String r7) {
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r0 = new com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo
            r0.<init>()
            java.lang.String r1 = "webview_timeout"
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r0 = r0.setEvent(r1)
            java.lang.String r1 = "ad_splash"
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r0 = r0.setSceneId(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r4 = r0.setDurationMs(r4)
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r4 = r4.setTimeType(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r3 = r4.setUrl(r3)
            com.kwad.sdk.commercial.c.a r3 = r3.setErrorMsg(r7)
            com.kwad.sdk.commercial.c.a r2 = r3.setAdTemplate(r2)
            com.kwad.sdk.commercial.b.g(r2)
            return
    }

    public static void aq(com.kwad.sdk.core.response.model.AdTemplate r2) {
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r0 = new com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo
            r0.<init>()
            java.lang.String r1 = "ad_show"
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r0 = r0.setEvent(r1)
            java.lang.String r1 = "ad_splash"
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r0 = r0.setSceneId(r1)
            com.kwad.sdk.commercial.c.a r2 = r0.setAdTemplate(r2)
            com.kwad.sdk.commercial.b.g(r2)
            return
    }

    public static void ar(com.kwad.sdk.core.response.model.AdTemplate r2) {
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r0 = new com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo
            r0.<init>()
            java.lang.String r1 = "webview_init"
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r0 = r0.setEvent(r1)
            java.lang.String r1 = "ad_splash"
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r0 = r0.setSceneId(r1)
            com.kwad.sdk.commercial.c.a r2 = r0.setAdTemplate(r2)
            com.kwad.sdk.commercial.b.g(r2)
            return
    }

    public static void b(com.kwad.sdk.core.response.model.AdTemplate r2, java.lang.String r3, long r4) {
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r0 = new com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo
            r0.<init>()
            java.lang.String r1 = "webview_load_finish"
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r0 = r0.setEvent(r1)
            java.lang.String r1 = "ad_splash"
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r0 = r0.setSceneId(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r4 = r0.setDurationMs(r4)
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r3 = r4.setUrl(r3)
            com.kwad.sdk.commercial.c.a r2 = r3.setAdTemplate(r2)
            com.kwad.sdk.commercial.b.g(r2)
            return
    }

    public static void d(java.lang.String r2, com.kwad.sdk.core.response.model.AdTemplate r3) {
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r0 = new com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo
            r0.<init>()
            java.lang.String r1 = "webview_load_url"
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r0 = r0.setEvent(r1)
            java.lang.String r1 = "ad_splash"
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r0 = r0.setSceneId(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashWebMonitorInfo r2 = r0.setUrl(r2)
            com.kwad.sdk.commercial.c.a r2 = r2.setAdTemplate(r3)
            com.kwad.sdk.commercial.b.g(r2)
            return
    }
}
