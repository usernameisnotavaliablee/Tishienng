package com.kwad.components.ad.interstitial.report;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private static final com.kwad.components.ad.interstitial.report.c nO = null;

        static {
                com.kwad.components.ad.interstitial.report.c r0 = new com.kwad.components.ad.interstitial.report.c
                r0.<init>()
                com.kwad.components.ad.interstitial.report.c.a.nO = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.ad.interstitial.report.c eT() {
                com.kwad.components.ad.interstitial.report.c r0 = com.kwad.components.ad.interstitial.report.c.a.nO
                return r0
        }
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void a(boolean r3, com.kwad.sdk.commercial.c.a r4) {
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()
            boolean r0 = r0.Bn()
            if (r0 != 0) goto Lb
            return
        Lb:
            com.kwad.sdk.commercial.c r0 = com.kwad.sdk.commercial.c.DS()
            if (r3 == 0) goto L14
            java.lang.String r1 = "ad_client_error_log"
            goto L16
        L14:
            java.lang.String r1 = "ad_client_apm_log"
        L16:
            com.kwad.sdk.commercial.c r0 = r0.cF(r1)
            if (r3 == 0) goto L1f
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L24
        L1f:
            r1 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
        L24:
            com.kwad.sdk.commercial.c r3 = r0.i(r1)
            java.lang.String r0 = "ad_sdk_interstitial_load"
            java.lang.String r1 = "status"
            com.kwad.sdk.commercial.c r3 = r3.O(r0, r1)
            com.kwai.adclient.kscommerciallogger.model.BusinessType r0 = com.kwai.adclient.kscommerciallogger.model.BusinessType.AD_INTERSTITIAL
            com.kwad.sdk.commercial.c r3 = r3.b(r0)
            com.kwad.sdk.commercial.c r3 = r3.z(r4)
            com.kwai.adclient.kscommerciallogger.model.d r4 = com.kwai.adclient.kscommerciallogger.model.a.bez
            com.kwad.sdk.commercial.c r3 = r3.a(r4)
            com.kwad.sdk.commercial.b.d(r3)
            return
    }

    public static com.kwad.components.ad.interstitial.report.c eS() {
            com.kwad.components.ad.interstitial.report.c r0 = com.kwad.components.ad.interstitial.report.c.a.eT()
            return r0
    }

    public final void A(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3) {
            r2 = this;
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r0.<init>(r3)
            r1 = 10
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setStatus(r1)
            com.kwad.sdk.commercial.c.a r3 = r0.setAdTemplate(r3)
            r0 = 0
            a(r0, r3)
            return
    }

    public final void B(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3) {
            r2 = this;
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r0.<init>(r3)
            r1 = 7
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setStatus(r1)
            com.kwad.sdk.commercial.c.a r3 = r0.setAdTemplate(r3)
            r0 = 0
            a(r0, r3)
            return
    }

    public final void C(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r4) {
            r3 = this;
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r0.<init>(r4)
            r1 = 12
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setStatus(r1)
            boolean r1 = com.kwad.sdk.core.response.b.b.di(r4)
            r2 = 1
            if (r1 == 0) goto L14
            r1 = 3
            goto L15
        L14:
            r1 = 1
        L15:
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setRenderType(r1)
            com.kwad.sdk.commercial.c.a r4 = r0.setAdTemplate(r4)
            a(r2, r4)
            return
    }

    public final void D(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3) {
            r2 = this;
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r0.<init>(r3)
            r1 = 11
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setStatus(r1)
            r1 = 1
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setRenderType(r1)
            com.kwad.sdk.commercial.c.a r3 = r0.setAdTemplate(r3)
            a(r1, r3)
            return
    }

    public final void a(int r3, java.lang.String r4, long r5) {
            r2 = this;
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r0.<init>()
            r1 = 5
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setStatus(r1)
            com.kwad.sdk.commercial.c.a r3 = r0.setErrorCode(r3)
            com.kwad.sdk.commercial.c.a r3 = r3.setErrorMsg(r4)
            com.kwad.sdk.commercial.c.a r3 = r3.setPosId(r5)
            r4 = 1
            a(r4, r3)
            return
    }

    public final void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r6, int r7) {
            r5 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r6.adShowStartTimeStamp
            long r0 = r0 - r2
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r6)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r3 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r3.<init>(r6)
            r4 = 4
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r3 = r3.setStatus(r4)
            boolean r4 = r6.notNetworkRequest
            if (r4 == 0) goto L1b
            r4 = 2
            goto L1c
        L1b:
            r4 = 1
        L1c:
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r3 = r3.setType(r4)
            int r2 = com.kwad.sdk.core.response.b.a.be(r2)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r2 = r3.setMaterialType(r2)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r2.setRenderDuration(r0)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r7 = r0.setRenderType(r7)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r7 = r7.setExpectedRenderType()
            com.kwad.sdk.commercial.c.a r6 = r7.setAdTemplate(r6)
            r7 = 0
            a(r7, r6)
            return
    }

    public final void a(com.kwad.sdk.core.response.model.AdTemplate r3, int r4, java.lang.String r5) {
            r2 = this;
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r0.<init>(r3)
            r1 = 9
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setStatus(r1)
            com.kwad.sdk.commercial.c.a r4 = r0.setErrorCode(r4)
            com.kwad.sdk.commercial.c.a r4 = r4.setErrorMsg(r5)
            com.kwad.sdk.commercial.c.a r3 = r4.setAdTemplate(r3)
            r4 = 1
            a(r4, r3)
            return
    }

    public final void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3, boolean r4) {
            r2 = this;
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r0.<init>(r3)
            r1 = 2
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setStatus(r1)
            if (r4 == 0) goto Ld
            goto Le
        Ld:
            r1 = 1
        Le:
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r4 = r0.setType(r1)
            long r0 = r3.loadDataTime
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r4 = r4.setLoadDataTime(r0)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r4 = r4.setExpectedRenderType()
            com.kwad.sdk.commercial.c.a r3 = r4.setAdTemplate(r3)
            r4 = 0
            a(r4, r3)
            return
    }

    public final void b(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3, boolean r4) {
            r2 = this;
            r3.notNetworkRequest = r4
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r4 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r4.<init>(r3)
            r0 = 3
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r4 = r4.setStatus(r0)
            boolean r0 = r3.notNetworkRequest
            if (r0 == 0) goto L12
            r0 = 2
            goto L13
        L12:
            r0 = 1
        L13:
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r4 = r4.setType(r0)
            long r0 = r3.downloadDuration
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r4 = r4.setDownloadDuration(r0)
            long r0 = r3.getDownloadSize()
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r4 = r4.setDownloadSize(r0)
            int r0 = r3.getDownloadType()
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r4 = r4.setDownloadType(r0)
            com.kwad.sdk.commercial.c.a r3 = r4.setAdTemplate(r3)
            r4 = 0
            a(r4, r3)
            return
    }

    public final void m(long r3) {
            r2 = this;
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r0.<init>()
            r1 = 1
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setStatus(r1)
            com.kwad.sdk.commercial.c.a r3 = r0.setPosId(r3)
            r4 = 0
            a(r4, r3)
            return
    }

    public final void y(com.kwad.sdk.core.response.model.AdTemplate r3) {
            r2 = this;
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r0.<init>(r3)
            r1 = 6
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setStatus(r1)
            com.kwad.sdk.commercial.c.a r3 = r0.setAdTemplate(r3)
            r0 = 0
            a(r0, r3)
            return
    }

    public final void z(com.kwad.sdk.core.response.model.AdTemplate r4) {
            r3 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r4)     // Catch: java.lang.Throwable -> L2b
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r1 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            r2 = 8
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r1 = r1.setStatus(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r2 = r4.notNetworkRequest     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L15
            r2 = 2
            goto L16
        L15:
            r2 = 1
        L16:
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r1 = r1.setType(r2)     // Catch: java.lang.Throwable -> L2b
            int r0 = com.kwad.sdk.core.response.b.a.be(r0)     // Catch: java.lang.Throwable -> L2b
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r1.setMaterialType(r0)     // Catch: java.lang.Throwable -> L2b
            com.kwad.sdk.commercial.c.a r4 = r0.setAdTemplate(r4)     // Catch: java.lang.Throwable -> L2b
            r0 = 0
            a(r0, r4)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r4 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r4)
            return
    }
}
