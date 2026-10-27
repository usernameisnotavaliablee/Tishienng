package com.kwad.components.ad.draw.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void a(com.kwad.sdk.commercial.c.a r3, boolean r4) {
            com.kwad.sdk.commercial.c r0 = com.kwad.sdk.commercial.c.DS()     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L9
            java.lang.String r1 = "ad_client_error_log"
            goto Lb
        L9:
            java.lang.String r1 = "ad_client_apm_log"
        Lb:
            com.kwad.sdk.commercial.c r0 = r0.cF(r1)     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L14
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L19
        L14:
            r1 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
        L19:
            com.kwad.sdk.commercial.c r4 = r0.i(r1)     // Catch: java.lang.Throwable -> L33
            com.kwai.adclient.kscommerciallogger.model.BusinessType r0 = com.kwai.adclient.kscommerciallogger.model.BusinessType.AD_DRAW     // Catch: java.lang.Throwable -> L33
            com.kwad.sdk.commercial.c r4 = r4.b(r0)     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = "ad_sdk_draw_material_load"
            java.lang.String r1 = "status"
            com.kwad.sdk.commercial.c r4 = r4.O(r0, r1)     // Catch: java.lang.Throwable -> L33
            com.kwad.sdk.commercial.c r3 = r4.z(r3)     // Catch: java.lang.Throwable -> L33
            com.kwad.sdk.commercial.b.d(r3)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r3 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r3)
            return
    }

    public static void a(com.kwad.sdk.core.response.model.AdTemplate r3, long r4) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
            com.kwad.components.ad.draw.a.d r1 = com.kwad.components.ad.draw.a.d.aN()
            r2 = 2
            com.kwad.components.ad.draw.a.d r1 = r1.y(r2)
            int r2 = com.kwad.sdk.core.response.b.a.be(r0)
            com.kwad.components.ad.draw.a.d r1 = r1.z(r2)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.bb(r0)
            com.kwad.components.ad.draw.a.d r0 = r1.q(r0)
            com.kwad.components.ad.draw.a.d r4 = r0.h(r4)
            com.kwad.sdk.commercial.c.a r3 = r4.setAdTemplate(r3)
            r4 = 0
            a(r3, r4)
            return
    }

    public static void a(com.kwad.sdk.core.response.model.AdTemplate r3, long r4, java.lang.String r6) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
            com.kwad.components.ad.draw.a.d r1 = com.kwad.components.ad.draw.a.d.aN()
            r2 = 3
            com.kwad.components.ad.draw.a.d r1 = r1.y(r2)
            int r2 = com.kwad.sdk.core.response.b.a.be(r0)
            com.kwad.components.ad.draw.a.d r1 = r1.z(r2)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.bb(r0)
            com.kwad.components.ad.draw.a.d r0 = r1.q(r0)
            com.kwad.components.ad.draw.a.d r4 = r0.h(r4)
            com.kwad.sdk.commercial.c.a r3 = r4.setAdTemplate(r3)
            com.kwad.sdk.commercial.c.a r3 = r3.setErrorMsg(r6)
            r4 = 1
            a(r3, r4)
            return
    }

    public static void g(com.kwad.sdk.core.response.model.AdTemplate r3) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
            com.kwad.components.ad.draw.a.d r1 = com.kwad.components.ad.draw.a.d.aN()
            r2 = 1
            com.kwad.components.ad.draw.a.d r1 = r1.y(r2)
            int r2 = com.kwad.sdk.core.response.b.a.be(r0)
            com.kwad.components.ad.draw.a.d r1 = r1.z(r2)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.bb(r0)
            com.kwad.components.ad.draw.a.d r0 = r1.q(r0)
            com.kwad.sdk.commercial.c.a r3 = r0.setAdTemplate(r3)
            r0 = 0
            a(r3, r0)
            return
    }
}
