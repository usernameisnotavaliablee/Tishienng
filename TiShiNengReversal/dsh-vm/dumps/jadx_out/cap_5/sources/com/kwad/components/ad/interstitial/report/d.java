package com.kwad.components.ad.interstitial.report;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private static final com.kwad.components.ad.interstitial.report.d nP = null;

        static {
                com.kwad.components.ad.interstitial.report.d r0 = new com.kwad.components.ad.interstitial.report.d
                r0.<init>()
                com.kwad.components.ad.interstitial.report.d.a.nP = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.ad.interstitial.report.d eV() {
                com.kwad.components.ad.interstitial.report.d r0 = com.kwad.components.ad.interstitial.report.d.a.nP
                return r0
        }
    }

    public d() {
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
            java.lang.String r0 = "ad_sdk_interstitial_play"
            java.lang.String r1 = "status"
            com.kwad.sdk.commercial.c r3 = r3.O(r0, r1)     // Catch: java.lang.Throwable -> L34
            com.kwai.adclient.kscommerciallogger.model.BusinessType r0 = com.kwai.adclient.kscommerciallogger.model.BusinessType.AD_INTERSTITIAL     // Catch: java.lang.Throwable -> L34
            com.kwad.sdk.commercial.c r3 = r3.b(r0)     // Catch: java.lang.Throwable -> L34
            com.kwad.sdk.commercial.c r3 = r3.z(r4)     // Catch: java.lang.Throwable -> L34
            com.kwai.adclient.kscommerciallogger.model.d r4 = com.kwai.adclient.kscommerciallogger.model.a.bez     // Catch: java.lang.Throwable -> L34
            com.kwad.sdk.commercial.c r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L34
            com.kwad.sdk.commercial.b.d(r3)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r3 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r3)
            return
    }

    public static com.kwad.components.ad.interstitial.report.d eU() {
            com.kwad.components.ad.interstitial.report.d r0 = com.kwad.components.ad.interstitial.report.d.a.eV()
            return r0
    }

    public final void E(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3) {
            r2 = this;
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r0.<init>(r3)
            r1 = 1
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setStatus(r1)
            com.kwad.sdk.commercial.c.a r3 = r0.setAdTemplate(r3)
            r0 = 0
            a(r0, r3)
            return
    }

    public final void b(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r5, int r6, java.lang.String r7) {
            r4 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r5)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r1 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r1.<init>(r5)
            long r2 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r1 = r1.setCreativeId(r2)
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.K(r0)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r1 = r1.setVideoUrl(r2)
            int r2 = r5.getDownloadType()
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r1 = r1.setDownloadType(r2)
            long r2 = r5.getDownloadSize()
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r1 = r1.setDownloadSize(r2)
            int r0 = com.kwad.sdk.core.response.b.a.L(r0)
            int r0 = r0 * 1000
            long r2 = (long) r0
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r1.setVideoDuration(r2)
            r1 = 2
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setStatus(r1)
            com.kwad.sdk.commercial.c.a r7 = r0.setErrorMsg(r7)
            com.kwad.sdk.commercial.c.a r6 = r7.setErrorCode(r6)
            com.kwad.sdk.commercial.c.a r5 = r6.setAdTemplate(r5)
            r6 = 1
            a(r6, r5)
            return
    }

    public final void b(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r7, long r8) {
            r6 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r7)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r1 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r1.<init>(r7)
            r2 = 3
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r1 = r1.setStatus(r2)
            long r2 = com.kwad.sdk.core.response.b.e.ev(r7)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r1 = r1.setCreativeId(r2)
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.K(r0)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r1 = r1.setVideoUrl(r2)
            int r0 = com.kwad.sdk.core.response.b.a.L(r0)
            long r2 = (long) r0
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r1.setVideoDuration(r2)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r8 = r0.setPlayStartedDuration(r8)
            com.kwad.sdk.commercial.c.a r7 = r8.setAdTemplate(r7)
            r8 = 0
            a(r8, r7)
            return
    }
}
