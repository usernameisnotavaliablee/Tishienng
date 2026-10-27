package com.kwad.components.ad.draw.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c {
    public c() {
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
            java.lang.String r0 = "ad_sdk_draw_load"
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

    public static void a(com.kwad.sdk.core.response.model.AdTemplate r2, int r3, int r4) {
            com.kwad.components.ad.draw.a.a r0 = com.kwad.components.ad.draw.a.a.aM()
            r1 = 9
            com.kwad.components.ad.draw.a.a r0 = r0.s(r1)
            com.kwad.components.ad.draw.a.a r3 = r0.v(r3)
            com.kwad.components.ad.draw.a.a r3 = r3.w(r4)
            com.kwad.sdk.commercial.c.a r2 = r3.setAdTemplate(r2)
            r3 = 0
            a(r2, r3)
            return
    }

    public static void a(com.kwad.sdk.core.response.model.AdTemplate r3, long r4, int r6, int r7, boolean r8) {
            com.kwad.sdk.commercial.c r0 = com.kwad.sdk.commercial.c.DS()     // Catch: java.lang.Throwable -> L4f
            if (r8 == 0) goto L9
            java.lang.String r1 = "ad_client_error_log"
            goto Lb
        L9:
            java.lang.String r1 = "ad_client_apm_log"
        Lb:
            com.kwad.sdk.commercial.c r0 = r0.cF(r1)     // Catch: java.lang.Throwable -> L4f
            if (r8 == 0) goto L17
            r1 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            goto L1c
        L17:
            r1 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
        L1c:
            com.kwad.sdk.commercial.c r8 = r0.i(r1)     // Catch: java.lang.Throwable -> L4f
            com.kwai.adclient.kscommerciallogger.model.BusinessType r0 = com.kwai.adclient.kscommerciallogger.model.BusinessType.AD_DRAW     // Catch: java.lang.Throwable -> L4f
            com.kwad.sdk.commercial.c r8 = r8.b(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = "ad_sdk_draw_load"
            java.lang.String r1 = "status"
            com.kwad.sdk.commercial.c r8 = r8.O(r0, r1)     // Catch: java.lang.Throwable -> L4f
            com.kwad.components.ad.draw.a.a r0 = com.kwad.components.ad.draw.a.a.aM()     // Catch: java.lang.Throwable -> L4f
            r1 = 7
            com.kwad.components.ad.draw.a.a r0 = r0.s(r1)     // Catch: java.lang.Throwable -> L4f
            com.kwad.components.ad.draw.a.a r4 = r0.f(r4)     // Catch: java.lang.Throwable -> L4f
            com.kwad.components.ad.draw.a.a r4 = r4.v(r6)     // Catch: java.lang.Throwable -> L4f
            com.kwad.components.ad.draw.a.a r4 = r4.w(r7)     // Catch: java.lang.Throwable -> L4f
            com.kwad.sdk.commercial.c.a r3 = r4.setAdTemplate(r3)     // Catch: java.lang.Throwable -> L4f
            com.kwad.sdk.commercial.c r3 = r8.z(r3)     // Catch: java.lang.Throwable -> L4f
            com.kwad.sdk.commercial.b.d(r3)     // Catch: java.lang.Throwable -> L4f
            return
        L4f:
            r3 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r3)
            return
    }

    public static void a(com.kwad.sdk.internal.api.SceneImpl r2, int r3, long r4) {
            com.kwad.components.ad.draw.a.a r0 = com.kwad.components.ad.draw.a.a.aM()
            r1 = 2
            com.kwad.components.ad.draw.a.a r0 = r0.s(r1)
            com.kwad.components.ad.draw.a.a r4 = r0.g(r4)
            com.kwad.components.ad.draw.a.a r3 = r4.t(r3)
            long r4 = r2.getPosId()
            com.kwad.sdk.commercial.c.a r2 = r3.setPosId(r4)
            r3 = 0
            a(r2, r3)
            return
    }

    public static void a(com.kwad.sdk.internal.api.SceneImpl r3, int r4, java.lang.String r5, long r6) {
            com.kwad.sdk.commercial.c r0 = com.kwad.sdk.commercial.c.DS()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = "ad_client_error_log"
            com.kwad.sdk.commercial.c r0 = r0.cF(r1)     // Catch: java.lang.Throwable -> L4b
            r1 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            com.kwad.sdk.commercial.c r0 = r0.i(r1)     // Catch: java.lang.Throwable -> L4b
            com.kwai.adclient.kscommerciallogger.model.BusinessType r1 = com.kwai.adclient.kscommerciallogger.model.BusinessType.AD_DRAW     // Catch: java.lang.Throwable -> L4b
            com.kwad.sdk.commercial.c r0 = r0.b(r1)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = "ad_sdk_draw_load"
            java.lang.String r2 = "status"
            com.kwad.sdk.commercial.c r0 = r0.O(r1, r2)     // Catch: java.lang.Throwable -> L4b
            com.kwad.components.ad.draw.a.a r1 = com.kwad.components.ad.draw.a.a.aM()     // Catch: java.lang.Throwable -> L4b
            r2 = 3
            com.kwad.components.ad.draw.a.a r1 = r1.s(r2)     // Catch: java.lang.Throwable -> L4b
            com.kwad.components.ad.draw.a.a r6 = r1.g(r6)     // Catch: java.lang.Throwable -> L4b
            r7 = 0
            com.kwad.components.ad.draw.a.a r6 = r6.t(r7)     // Catch: java.lang.Throwable -> L4b
            long r1 = r3.getPosId()     // Catch: java.lang.Throwable -> L4b
            com.kwad.sdk.commercial.c.a r3 = r6.setPosId(r1)     // Catch: java.lang.Throwable -> L4b
            com.kwad.sdk.commercial.c.a r3 = r3.setErrorCode(r4)     // Catch: java.lang.Throwable -> L4b
            com.kwad.sdk.commercial.c.a r3 = r3.setErrorMsg(r5)     // Catch: java.lang.Throwable -> L4b
            com.kwad.sdk.commercial.c r3 = r0.z(r3)     // Catch: java.lang.Throwable -> L4b
            com.kwad.sdk.commercial.b.d(r3)     // Catch: java.lang.Throwable -> L4b
            return
        L4b:
            r3 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r3)
            return
    }

    public static void a(com.kwad.sdk.internal.api.SceneImpl r3, java.lang.String r4) {
            com.kwad.sdk.commercial.c r0 = com.kwad.sdk.commercial.c.DS()     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "ad_client_error_log"
            com.kwad.sdk.commercial.c r0 = r0.cF(r1)     // Catch: java.lang.Throwable -> L36
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.kwad.sdk.commercial.c r0 = r0.i(r1)     // Catch: java.lang.Throwable -> L36
            com.kwai.adclient.kscommerciallogger.model.BusinessType r1 = com.kwai.adclient.kscommerciallogger.model.BusinessType.AD_DRAW     // Catch: java.lang.Throwable -> L36
            com.kwad.sdk.commercial.c r0 = r0.b(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "ad_sdk_draw_params_monitor"
            java.lang.String r2 = "method_name"
            com.kwad.sdk.commercial.c r0 = r0.O(r1, r2)     // Catch: java.lang.Throwable -> L36
            com.kwad.components.ad.draw.a.a r1 = com.kwad.components.ad.draw.a.a.aM()     // Catch: java.lang.Throwable -> L36
            com.kwad.components.ad.draw.a.a r4 = r1.o(r4)     // Catch: java.lang.Throwable -> L36
            long r1 = r3.getPosId()     // Catch: java.lang.Throwable -> L36
            com.kwad.sdk.commercial.c.a r3 = r4.setPosId(r1)     // Catch: java.lang.Throwable -> L36
            com.kwad.sdk.commercial.c r3 = r0.z(r3)     // Catch: java.lang.Throwable -> L36
            com.kwad.sdk.commercial.b.d(r3)     // Catch: java.lang.Throwable -> L36
            return
        L36:
            r3 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r3)
            return
    }

    public static void b(com.kwad.sdk.core.response.model.AdTemplate r2, int r3, int r4) {
            com.kwad.components.ad.draw.a.a r0 = com.kwad.components.ad.draw.a.a.aM()
            r1 = 10
            com.kwad.components.ad.draw.a.a r0 = r0.s(r1)
            com.kwad.components.ad.draw.a.a r3 = r0.v(r3)
            com.kwad.components.ad.draw.a.a r3 = r3.w(r4)
            com.kwad.sdk.commercial.c.a r2 = r3.setAdTemplate(r2)
            r3 = 0
            a(r2, r3)
            return
    }

    public static void b(com.kwad.sdk.core.response.model.AdTemplate r2, long r3, java.lang.String r5) {
            com.kwad.components.ad.draw.a.a r0 = com.kwad.components.ad.draw.a.a.aM()
            r1 = 8
            com.kwad.components.ad.draw.a.a r0 = r0.s(r1)
            com.kwad.components.ad.draw.a.a r3 = r0.f(r3)
            com.kwad.sdk.commercial.c.a r2 = r3.setAdTemplate(r2)
            com.kwad.sdk.commercial.c.a r2 = r2.setErrorMsg(r5)
            r3 = 1
            a(r2, r3)
            return
    }

    public static void b(com.kwad.sdk.internal.api.SceneImpl r3) {
            com.kwad.components.ad.draw.a.a r0 = com.kwad.components.ad.draw.a.a.aM()
            r1 = 1
            com.kwad.components.ad.draw.a.a r0 = r0.s(r1)
            int r1 = r3.getAdNum()
            com.kwad.components.ad.draw.a.a r0 = r0.t(r1)
            long r1 = r3.getPosId()
            com.kwad.sdk.commercial.c.a r3 = r0.setPosId(r1)
            r0 = 0
            a(r3, r0)
            return
    }

    public static void b(com.kwad.sdk.internal.api.SceneImpl r2, int r3, long r4) {
            com.kwad.components.ad.draw.a.a r0 = com.kwad.components.ad.draw.a.a.aM()
            r1 = 5
            com.kwad.components.ad.draw.a.a r0 = r0.s(r1)
            com.kwad.components.ad.draw.a.a r4 = r0.e(r4)
            com.kwad.components.ad.draw.a.a r3 = r4.t(r3)
            long r4 = r2.getPosId()
            com.kwad.sdk.commercial.c.a r2 = r3.setPosId(r4)
            r3 = 0
            a(r2, r3)
            return
    }

    public static void h(com.kwad.sdk.core.response.model.AdTemplate r3) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
            com.kwad.components.ad.draw.a.a r1 = com.kwad.components.ad.draw.a.a.aM()
            int r2 = com.kwad.sdk.core.response.b.a.be(r0)
            com.kwad.components.ad.draw.a.a r1 = r1.u(r2)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.K(r0)
            com.kwad.components.ad.draw.a.a r0 = r1.p(r0)
            int r1 = r3.adStyle
            com.kwad.components.ad.draw.a.a r0 = r0.x(r1)
            r1 = 4
            com.kwad.components.ad.draw.a.a r0 = r0.s(r1)
            com.kwad.sdk.commercial.c.a r3 = r0.setAdTemplate(r3)
            r0 = 1
            a(r3, r0)
            return
    }

    public static void i(com.kwad.sdk.core.response.model.AdTemplate r2) {
            com.kwad.components.ad.draw.a.a r0 = com.kwad.components.ad.draw.a.a.aM()
            r1 = 6
            com.kwad.components.ad.draw.a.a r0 = r0.s(r1)
            com.kwad.sdk.commercial.c.a r2 = r0.setAdTemplate(r2)
            r0 = 0
            a(r2, r0)
            return
    }
}
