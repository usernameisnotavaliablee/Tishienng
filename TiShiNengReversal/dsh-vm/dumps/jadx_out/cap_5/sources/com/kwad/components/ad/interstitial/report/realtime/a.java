package com.kwad.components.ad.interstitial.report.realtime;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.interstitial.report.realtime.a$a, reason: collision with other inner class name */
    static class C0026a {
        private static final com.kwad.components.ad.interstitial.report.realtime.a nQ = null;

        static {
                com.kwad.components.ad.interstitial.report.realtime.a r0 = new com.kwad.components.ad.interstitial.report.realtime.a
                r1 = 0
                r0.<init>(r1)
                com.kwad.components.ad.interstitial.report.realtime.a.C0026a.nQ = r0
                return
        }

        public C0026a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.ad.interstitial.report.realtime.a eX() {
                com.kwad.components.ad.interstitial.report.realtime.a r0 = com.kwad.components.ad.interstitial.report.realtime.a.C0026a.nQ
                return r0
        }
    }

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ a(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static void F(com.kwad.sdk.core.response.model.AdTemplate r3) {
            com.kwad.components.ad.interstitial.report.realtime.model.InterstitialRealTimeInfo r0 = new com.kwad.components.ad.interstitial.report.realtime.model.InterstitialRealTimeInfo     // Catch: java.lang.Throwable -> L44
            r0.<init>()     // Catch: java.lang.Throwable -> L44
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r3)     // Catch: java.lang.Throwable -> L44
            com.kwad.sdk.core.response.model.AdMatrixInfo r1 = r1.adMatrixInfo     // Catch: java.lang.Throwable -> L44
            com.kwad.sdk.core.response.model.AdMatrixInfo$AdDataV2 r1 = r1.adDataV2     // Catch: java.lang.Throwable -> L44
            com.kwad.sdk.core.response.model.AdMatrixInfo$InterstitialCardInfo r1 = r1.interstitialCardInfo     // Catch: java.lang.Throwable -> L44
            int r1 = r1.renderType     // Catch: java.lang.Throwable -> L44
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L44
            r0.setRenderType(r1)     // Catch: java.lang.Throwable -> L44
            r0.setAdTemplate(r3)     // Catch: java.lang.Throwable -> L44
            com.kwad.sdk.commercial.c r3 = com.kwad.sdk.commercial.c.DS()     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "ad_client_error_log"
            com.kwad.sdk.commercial.c r3 = r3.cF(r1)     // Catch: java.lang.Throwable -> L44
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.kwad.sdk.commercial.c r3 = r3.i(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "ad_sdk_interstitial_data_check_monitor"
            java.lang.String r2 = "monitor_index"
            com.kwad.sdk.commercial.c r3 = r3.O(r1, r2)     // Catch: java.lang.Throwable -> L44
            com.kwai.adclient.kscommerciallogger.model.BusinessType r1 = com.kwai.adclient.kscommerciallogger.model.BusinessType.AD_INTERSTITIAL     // Catch: java.lang.Throwable -> L44
            com.kwad.sdk.commercial.c r3 = r3.b(r1)     // Catch: java.lang.Throwable -> L44
            com.kwad.sdk.commercial.c r3 = r3.z(r0)     // Catch: java.lang.Throwable -> L44
            com.kwai.adclient.kscommerciallogger.model.d r0 = com.kwai.adclient.kscommerciallogger.model.a.bez     // Catch: java.lang.Throwable -> L44
            com.kwad.sdk.commercial.c r3 = r3.a(r0)     // Catch: java.lang.Throwable -> L44
            com.kwad.sdk.commercial.b.d(r3)     // Catch: java.lang.Throwable -> L44
            return
        L44:
            r3 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r3)
            return
    }

    public static void G(com.kwad.sdk.core.response.model.AdTemplate r3) {
            com.kwad.components.ad.interstitial.report.realtime.model.InterstitialRealTimeInfo r0 = new com.kwad.components.ad.interstitial.report.realtime.model.InterstitialRealTimeInfo     // Catch: java.lang.Throwable -> L34
            r0.<init>()     // Catch: java.lang.Throwable -> L34
            r0.setAdTemplate(r3)     // Catch: java.lang.Throwable -> L34
            com.kwad.sdk.commercial.c r3 = com.kwad.sdk.commercial.c.DS()     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "ad_client_error_log"
            com.kwad.sdk.commercial.c r3 = r3.cF(r1)     // Catch: java.lang.Throwable -> L34
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.kwad.sdk.commercial.c r3 = r3.i(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "ad_sdk_interstitial_service_call_monitor"
            java.lang.String r2 = "monitor_index"
            com.kwad.sdk.commercial.c r3 = r3.O(r1, r2)     // Catch: java.lang.Throwable -> L34
            com.kwai.adclient.kscommerciallogger.model.BusinessType r1 = com.kwai.adclient.kscommerciallogger.model.BusinessType.AD_INTERSTITIAL     // Catch: java.lang.Throwable -> L34
            com.kwad.sdk.commercial.c r3 = r3.b(r1)     // Catch: java.lang.Throwable -> L34
            com.kwad.sdk.commercial.c r3 = r3.z(r0)     // Catch: java.lang.Throwable -> L34
            com.kwai.adclient.kscommerciallogger.model.d r0 = com.kwai.adclient.kscommerciallogger.model.a.bez     // Catch: java.lang.Throwable -> L34
            com.kwad.sdk.commercial.c r3 = r3.a(r0)     // Catch: java.lang.Throwable -> L34
            com.kwad.sdk.commercial.b.d(r3)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r3 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r3)
            return
    }

    public static void a(com.kwad.sdk.core.network.e r3) {
            com.kwad.components.ad.interstitial.report.realtime.model.InterstitialRealTimeInfo r0 = new com.kwad.components.ad.interstitial.report.realtime.model.InterstitialRealTimeInfo     // Catch: java.lang.Throwable -> L36
            r0.<init>()     // Catch: java.lang.Throwable -> L36
            int r3 = r3.errorCode     // Catch: java.lang.Throwable -> L36
            r0.setErrorCode(r3)     // Catch: java.lang.Throwable -> L36
            com.kwad.sdk.commercial.c r3 = com.kwad.sdk.commercial.c.DS()     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "ad_client_error_log"
            com.kwad.sdk.commercial.c r3 = r3.cF(r1)     // Catch: java.lang.Throwable -> L36
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.kwad.sdk.commercial.c r3 = r3.i(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "ad_sdk_interstitial_data_result_monitor"
            java.lang.String r2 = "error_code"
            com.kwad.sdk.commercial.c r3 = r3.O(r1, r2)     // Catch: java.lang.Throwable -> L36
            com.kwai.adclient.kscommerciallogger.model.BusinessType r1 = com.kwai.adclient.kscommerciallogger.model.BusinessType.AD_INTERSTITIAL     // Catch: java.lang.Throwable -> L36
            com.kwad.sdk.commercial.c r3 = r3.b(r1)     // Catch: java.lang.Throwable -> L36
            com.kwad.sdk.commercial.c r3 = r3.z(r0)     // Catch: java.lang.Throwable -> L36
            com.kwai.adclient.kscommerciallogger.model.d r0 = com.kwai.adclient.kscommerciallogger.model.a.bez     // Catch: java.lang.Throwable -> L36
            com.kwad.sdk.commercial.c r3 = r3.a(r0)     // Catch: java.lang.Throwable -> L36
            com.kwad.sdk.commercial.b.d(r3)     // Catch: java.lang.Throwable -> L36
            return
        L36:
            r3 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r3)
            return
    }

    public static void a(java.lang.String r3, com.kwad.sdk.core.response.model.AdTemplate r4) {
            com.kwad.components.ad.interstitial.report.realtime.model.InterstitialRealTimeInfo r0 = new com.kwad.components.ad.interstitial.report.realtime.model.InterstitialRealTimeInfo     // Catch: java.lang.Throwable -> L37
            r0.<init>()     // Catch: java.lang.Throwable -> L37
            r0.setAdTemplate(r4)     // Catch: java.lang.Throwable -> L37
            r0.setErrorMsg(r3)     // Catch: java.lang.Throwable -> L37
            com.kwad.sdk.commercial.c r3 = com.kwad.sdk.commercial.c.DS()     // Catch: java.lang.Throwable -> L37
            java.lang.String r4 = "ad_client_error_log"
            com.kwad.sdk.commercial.c r3 = r3.cF(r4)     // Catch: java.lang.Throwable -> L37
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.kwad.sdk.commercial.c r3 = r3.i(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r4 = "ad_sdk_interstitial_render_result_monitor"
            java.lang.String r1 = "monitor_index"
            com.kwad.sdk.commercial.c r3 = r3.O(r4, r1)     // Catch: java.lang.Throwable -> L37
            com.kwai.adclient.kscommerciallogger.model.BusinessType r4 = com.kwai.adclient.kscommerciallogger.model.BusinessType.AD_INTERSTITIAL     // Catch: java.lang.Throwable -> L37
            com.kwad.sdk.commercial.c r3 = r3.b(r4)     // Catch: java.lang.Throwable -> L37
            com.kwad.sdk.commercial.c r3 = r3.z(r0)     // Catch: java.lang.Throwable -> L37
            com.kwai.adclient.kscommerciallogger.model.d r4 = com.kwai.adclient.kscommerciallogger.model.a.bez     // Catch: java.lang.Throwable -> L37
            com.kwad.sdk.commercial.c r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L37
            com.kwad.sdk.commercial.b.d(r3)     // Catch: java.lang.Throwable -> L37
            return
        L37:
            r3 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r3)
            return
    }

    public static void b(java.lang.String r4, com.kwad.sdk.core.response.model.AdTemplate r5) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r5)     // Catch: java.lang.Throwable -> L42
            com.kwad.components.ad.interstitial.report.realtime.model.InterstitialRealTimeInfo r1 = new com.kwad.components.ad.interstitial.report.realtime.model.InterstitialRealTimeInfo     // Catch: java.lang.Throwable -> L42
            r1.<init>()     // Catch: java.lang.Throwable -> L42
            r1.setAdTemplate(r5)     // Catch: java.lang.Throwable -> L42
            r1.setErrorMsg(r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = com.kwad.sdk.core.response.b.a.K(r0)     // Catch: java.lang.Throwable -> L42
            r1.setMaterialUrl(r4)     // Catch: java.lang.Throwable -> L42
            com.kwad.sdk.commercial.c r4 = com.kwad.sdk.commercial.c.DS()     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = "ad_client_error_log"
            com.kwad.sdk.commercial.c r4 = r4.cF(r5)     // Catch: java.lang.Throwable -> L42
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.kwad.sdk.commercial.c r4 = r4.i(r2)     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = "ad_sdk_interstitial_resource_monitor"
            java.lang.String r0 = "monitor_index"
            com.kwad.sdk.commercial.c r4 = r4.O(r5, r0)     // Catch: java.lang.Throwable -> L42
            com.kwai.adclient.kscommerciallogger.model.BusinessType r5 = com.kwai.adclient.kscommerciallogger.model.BusinessType.AD_INTERSTITIAL     // Catch: java.lang.Throwable -> L42
            com.kwad.sdk.commercial.c r4 = r4.b(r5)     // Catch: java.lang.Throwable -> L42
            com.kwad.sdk.commercial.c r4 = r4.z(r1)     // Catch: java.lang.Throwable -> L42
            com.kwai.adclient.kscommerciallogger.model.d r5 = com.kwai.adclient.kscommerciallogger.model.a.bez     // Catch: java.lang.Throwable -> L42
            com.kwad.sdk.commercial.c r4 = r4.a(r5)     // Catch: java.lang.Throwable -> L42
            com.kwad.sdk.commercial.b.d(r4)     // Catch: java.lang.Throwable -> L42
            return
        L42:
            r4 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r4)
            return
    }

    public static com.kwad.components.ad.interstitial.report.realtime.a eW() {
            com.kwad.components.ad.interstitial.report.realtime.a r0 = com.kwad.components.ad.interstitial.report.realtime.a.C0026a.eX()
            return r0
    }
}
