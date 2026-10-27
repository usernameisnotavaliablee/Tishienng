package com.kwad.components.ad.interstitial.report;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.interstitial.report.a$a, reason: collision with other inner class name */
    static class C0025a {
        private static final com.kwad.components.ad.interstitial.report.a nM = null;

        static {
                com.kwad.components.ad.interstitial.report.a r0 = new com.kwad.components.ad.interstitial.report.a
                r0.<init>()
                com.kwad.components.ad.interstitial.report.a.C0025a.nM = r0
                return
        }

        public C0025a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.ad.interstitial.report.a eP() {
                com.kwad.components.ad.interstitial.report.a r0 = com.kwad.components.ad.interstitial.report.a.C0025a.nM
                return r0
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void a(java.lang.String r3, com.kwad.sdk.commercial.c.a r4) {
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()
            boolean r0 = r0.Bn()
            if (r0 != 0) goto Lb
            return
        Lb:
            com.kwad.sdk.commercial.c r0 = com.kwad.sdk.commercial.c.DS()     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = "ad_client_apm_log"
            com.kwad.sdk.commercial.c r0 = r0.cF(r1)     // Catch: java.lang.Throwable -> L38
            r1 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            com.kwad.sdk.commercial.c r0 = r0.i(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = "ad_sdk_interstitial_callback"
            com.kwad.sdk.commercial.c r3 = r0.O(r1, r3)     // Catch: java.lang.Throwable -> L38
            com.kwai.adclient.kscommerciallogger.model.BusinessType r0 = com.kwai.adclient.kscommerciallogger.model.BusinessType.AD_INTERSTITIAL     // Catch: java.lang.Throwable -> L38
            com.kwad.sdk.commercial.c r3 = r3.b(r0)     // Catch: java.lang.Throwable -> L38
            com.kwad.sdk.commercial.c r3 = r3.z(r4)     // Catch: java.lang.Throwable -> L38
            com.kwai.adclient.kscommerciallogger.model.d r4 = com.kwai.adclient.kscommerciallogger.model.a.bez     // Catch: java.lang.Throwable -> L38
            com.kwad.sdk.commercial.c r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L38
            com.kwad.sdk.commercial.b.d(r3)     // Catch: java.lang.Throwable -> L38
            return
        L38:
            r3 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r3)
            return
    }

    public static com.kwad.components.ad.interstitial.report.a eO() {
            com.kwad.components.ad.interstitial.report.a r0 = com.kwad.components.ad.interstitial.report.a.C0025a.eP()
            return r0
    }

    public final void a(com.kwad.sdk.core.response.model.AdTemplate r4, double r5) {
            r3 = this;
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r0.<init>()
            r1 = 2
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setActionType(r1)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r5 = r0.setVisiblePercent(r5)
            com.kwad.sdk.commercial.c.a r4 = r5.setAdTemplate(r4)
            java.lang.String r5 = "action_type"
            a(r5, r4)
            return
    }

    public final void a(com.kwad.sdk.core.response.model.AdTemplate r4, long r5, long r7) {
            r3 = this;
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r0.<init>()
            r1 = 1
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setActionType(r1)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r5 = r0.setClickSceneType(r5)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r5 = r5.setItemClickType(r7)
            com.kwad.sdk.commercial.c.a r4 = r5.setAdTemplate(r4)
            java.lang.String r5 = "action_type"
            a(r5, r4)
            return
    }

    public final void b(com.kwad.sdk.core.response.model.AdTemplate r4, long r5, long r7) {
            r3 = this;
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r0.<init>()
            r1 = 2
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setCallbackType(r1)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r5 = r0.setClickSceneType(r5)
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r5 = r5.setItemClickType(r7)
            com.kwad.sdk.commercial.c.a r4 = r5.setAdTemplate(r4)
            java.lang.String r5 = "callback_type"
            a(r5, r4)
            return
    }

    public final void v(com.kwad.sdk.core.response.model.AdTemplate r4) {
            r3 = this;
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r0.<init>()
            r1 = 1
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setCallbackType(r1)
            com.kwad.sdk.commercial.c.a r4 = r0.setAdTemplate(r4)
            java.lang.String r0 = "callback_type"
            a(r0, r4)
            return
    }

    public final void w(com.kwad.sdk.core.response.model.AdTemplate r4) {
            r3 = this;
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = new com.kwad.components.ad.interstitial.report.InterstitialReportInfo
            r0.<init>()
            r1 = 3
            com.kwad.components.ad.interstitial.report.InterstitialReportInfo r0 = r0.setCallbackType(r1)
            com.kwad.sdk.commercial.c.a r4 = r0.setAdTemplate(r4)
            java.lang.String r0 = "callback_type"
            a(r0, r4)
            return
    }
}
