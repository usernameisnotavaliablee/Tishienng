package com.kwad.components.ad.interstitial.report;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private static final com.kwad.components.ad.interstitial.report.b nN = null;

        static {
                com.kwad.components.ad.interstitial.report.b r0 = new com.kwad.components.ad.interstitial.report.b
                r0.<init>()
                com.kwad.components.ad.interstitial.report.b.a.nN = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.ad.interstitial.report.b eR() {
                com.kwad.components.ad.interstitial.report.b r0 = com.kwad.components.ad.interstitial.report.b.a.nN
                return r0
        }
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void a(boolean r3, com.kwad.sdk.commercial.c.a r4) {
            com.kwad.sdk.commercial.c r0 = com.kwad.sdk.commercial.c.DS()     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "ad_client_apm_log"
            com.kwad.sdk.commercial.c r0 = r0.cF(r1)     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto Lf
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L14
        Lf:
            r1 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
        L14:
            com.kwad.sdk.commercial.c r3 = r0.i(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "ad_sdk_interstitial_download_error"
            java.lang.String r1 = "status"
            com.kwad.sdk.commercial.c r3 = r3.O(r0, r1)     // Catch: java.lang.Throwable -> L34
            com.kwai.adclient.kscommerciallogger.model.BusinessType r0 = com.kwai.adclient.kscommerciallogger.model.BusinessType.AD_INTERSTITIAL     // Catch: java.lang.Throwable -> L34
            com.kwad.sdk.commercial.c r3 = r3.b(r0)     // Catch: java.lang.Throwable -> L34
            com.kwad.sdk.commercial.c r3 = r3.z(r4)     // Catch: java.lang.Throwable -> L34
            com.kwai.adclient.kscommerciallogger.model.d r4 = com.kwai.adclient.kscommerciallogger.model.b.beS     // Catch: java.lang.Throwable -> L34
            com.kwad.sdk.commercial.c r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L34
            com.kwad.sdk.commercial.b.d(r3)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r3 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r3)
            return
    }

    public static com.kwad.components.ad.interstitial.report.b eQ() {
            com.kwad.components.ad.interstitial.report.b r0 = com.kwad.components.ad.interstitial.report.b.a.eR()
            return r0
    }

    public final void b(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r5, java.lang.String r6) {
            r4 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r5)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r1 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r1.<init>()
            long r2 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r1 = r1.setCreativeId(r2)
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.K(r0)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r1 = r1.setVideoUrl(r2)
            long r2 = r5.getDownloadSize()
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r1 = r1.setDownloadSize(r2)
            int r2 = r5.getDownloadType()
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r1 = r1.setDownloadType(r2)
            int r0 = com.kwad.sdk.core.response.b.a.L(r0)
            int r0 = r0 * 1000
            long r2 = (long) r0
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r1.setVideoDuration(r2)
            r1 = 2
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setStatus(r1)
            com.kwad.sdk.commercial.c.a r6 = r0.setErrorMsg(r6)
            com.kwad.sdk.commercial.c.a r5 = r6.setAdTemplate(r5)
            r6 = 1
            a(r6, r5)
            return
    }

    public final void x(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3) {
            r2 = this;
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r0.<init>()
            int r1 = r3.getDownloadType()
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setDownloadType(r1)
            r1 = 1
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setStatus(r1)
            com.kwad.sdk.commercial.c.a r3 = r0.setAdTemplate(r3)
            r0 = 0
            a(r0, r3)
            return
    }
}
