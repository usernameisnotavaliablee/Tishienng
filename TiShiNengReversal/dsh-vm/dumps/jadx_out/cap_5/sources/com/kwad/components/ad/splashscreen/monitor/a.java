package com.kwad.components.ad.splashscreen.monitor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.splashscreen.monitor.a$a, reason: collision with other inner class name */
    static class C0049a {
        private static final com.kwad.components.ad.splashscreen.monitor.a FS = null;

        static {
                com.kwad.components.ad.splashscreen.monitor.a r0 = new com.kwad.components.ad.splashscreen.monitor.a
                r0.<init>()
                com.kwad.components.ad.splashscreen.monitor.a.C0049a.FS = r0
                return
        }

        public C0049a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.ad.splashscreen.monitor.a lY() {
                com.kwad.components.ad.splashscreen.monitor.a r0 = com.kwad.components.ad.splashscreen.monitor.a.C0049a.FS
                return r0
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo ad(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r4) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r4)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r1.<init>()
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.aZ(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setPreloadId(r2)
            long r2 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setCreativeId(r2)
            boolean r0 = com.kwad.sdk.core.response.b.a.bc(r0)
            if (r0 == 0) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 2
        L22:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r1.setMaterialType(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r0.setAdTemplate(r4)
            return r4
    }

    private static void d(com.kwad.sdk.commercial.c.a r3) {
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()
            boolean r0 = r0.Bn()
            if (r0 != 0) goto Lb
            return
        Lb:
            com.kwad.sdk.commercial.c r0 = com.kwad.sdk.commercial.c.DS()
            java.lang.String r1 = "ad_client_apm_log"
            com.kwad.sdk.commercial.c r0 = r0.cF(r1)
            r1 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            com.kwad.sdk.commercial.c r0 = r0.i(r1)
            java.lang.String r1 = "ad_sdk_splash_callback"
            java.lang.String r2 = "callback_type"
            com.kwad.sdk.commercial.c r0 = r0.O(r1, r2)
            com.kwai.adclient.kscommerciallogger.model.BusinessType r1 = com.kwai.adclient.kscommerciallogger.model.BusinessType.AD_SPLASH
            com.kwad.sdk.commercial.c r0 = r0.b(r1)
            com.kwad.sdk.commercial.c r3 = r0.z(r3)
            com.kwai.adclient.kscommerciallogger.model.d r0 = com.kwai.adclient.kscommerciallogger.model.a.bez
            com.kwad.sdk.commercial.c r3 = r3.a(r0)
            com.kwad.sdk.commercial.b.d(r3)
            return
    }

    private static void e(com.kwad.sdk.commercial.c.a r3) {
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()
            boolean r0 = r0.Bn()
            if (r0 != 0) goto Lb
            return
        Lb:
            com.kwad.sdk.commercial.c r0 = com.kwad.sdk.commercial.c.DS()
            java.lang.String r1 = "ad_client_apm_log"
            com.kwad.sdk.commercial.c r0 = r0.cF(r1)
            r1 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            com.kwad.sdk.commercial.c r0 = r0.i(r1)
            java.lang.String r1 = "ad_sdk_splash_action"
            java.lang.String r2 = "action_type"
            com.kwad.sdk.commercial.c r0 = r0.O(r1, r2)
            com.kwai.adclient.kscommerciallogger.model.BusinessType r1 = com.kwai.adclient.kscommerciallogger.model.BusinessType.AD_SPLASH
            com.kwad.sdk.commercial.c r0 = r0.b(r1)
            com.kwad.sdk.commercial.c r3 = r0.z(r3)
            com.kwai.adclient.kscommerciallogger.model.d r0 = com.kwai.adclient.kscommerciallogger.model.a.bez
            com.kwad.sdk.commercial.c r3 = r3.a(r0)
            com.kwad.sdk.commercial.b.d(r3)
            return
    }

    public static com.kwad.components.ad.splashscreen.monitor.a lX() {
            com.kwad.components.ad.splashscreen.monitor.a r0 = com.kwad.components.ad.splashscreen.monitor.a.C0049a.lY()
            return r0
    }

    public final void ae(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2) {
            r1 = this;
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = ad(r2)
            r0 = 2
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setCallbackType(r0)
            d(r2)
            return
    }

    public final void af(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2) {
            r1 = this;
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = ad(r2)
            r0 = 5
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setCallbackType(r0)
            d(r2)
            return
    }

    public final void ag(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2) {
            r1 = this;
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = ad(r2)
            r0 = 1
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setActionType(r0)
            e(r2)
            return
    }

    public final void ah(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2) {
            r1 = this;
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = ad(r2)
            r0 = 2
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setActionType(r0)
            e(r2)
            return
    }

    public final void t(long r3) {
            r2 = this;
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r0.<init>()
            r1 = 4
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setCallbackType(r1)
            com.kwad.sdk.commercial.c.a r3 = r0.setPosId(r3)
            d(r3)
            return
    }

    public final void v(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2) {
            r1 = this;
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = ad(r2)
            r0 = 1
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setCallbackType(r0)
            d(r2)
            return
    }

    public final void w(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2) {
            r1 = this;
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = ad(r2)
            r0 = 3
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setCallbackType(r0)
            d(r2)
            return
    }
}
