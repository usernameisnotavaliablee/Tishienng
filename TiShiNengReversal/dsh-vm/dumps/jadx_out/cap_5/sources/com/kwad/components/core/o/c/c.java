package com.kwad.components.core.o.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c {
    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void a(com.kwad.components.core.o.c.d r3, boolean r4) {
            com.kwad.sdk.commercial.c r0 = com.kwad.sdk.commercial.c.DS()
            if (r4 == 0) goto L9
            java.lang.String r1 = "ad_client_error_log"
            goto Lb
        L9:
            java.lang.String r1 = "ad_client_apm_log"
        Lb:
            com.kwad.sdk.commercial.c r0 = r0.cF(r1)
            if (r4 == 0) goto L14
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L19
        L14:
            r1 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
        L19:
            com.kwad.sdk.commercial.c r4 = r0.i(r1)
            java.lang.String r0 = "ad_sdk_offline_component_update"
            java.lang.String r1 = "load_status"
            com.kwad.sdk.commercial.c r4 = r4.O(r0, r1)
            com.kwad.sdk.commercial.c r3 = r4.z(r3)
            com.kwai.adclient.kscommerciallogger.model.d r4 = com.kwai.adclient.kscommerciallogger.model.a.bez
            com.kwad.sdk.commercial.c r3 = r3.a(r4)
            com.kwad.sdk.commercial.b.d(r3)
            return
    }

    public static void a(java.lang.String r1, long r2, long r4, java.lang.String r6) {
            com.kwad.components.core.o.c.d r0 = new com.kwad.components.core.o.c.d     // Catch: java.lang.Throwable -> L20
            r0.<init>()     // Catch: java.lang.Throwable -> L20
            com.kwad.components.core.o.c.d r1 = r0.aw(r1)     // Catch: java.lang.Throwable -> L20
            com.kwad.components.core.o.c.d r1 = r1.I(r2)     // Catch: java.lang.Throwable -> L20
            com.kwad.components.core.o.c.d r1 = r1.J(r4)     // Catch: java.lang.Throwable -> L20
            com.kwad.components.core.o.c.d r1 = r1.ay(r6)     // Catch: java.lang.Throwable -> L20
            r2 = 3
            com.kwad.components.core.o.c.d r1 = r1.H(r2)     // Catch: java.lang.Throwable -> L20
            r2 = 0
            a(r1, r2)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r1 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r1)
            return
    }

    public static void b(java.lang.String r1, long r2, int r4, java.lang.String r5, java.lang.String r6) {
            com.kwad.components.core.o.c.d r0 = new com.kwad.components.core.o.c.d     // Catch: java.lang.Throwable -> L24
            r0.<init>()     // Catch: java.lang.Throwable -> L24
            com.kwad.components.core.o.c.d r1 = r0.aw(r1)     // Catch: java.lang.Throwable -> L24
            com.kwad.components.core.o.c.d r1 = r1.I(r2)     // Catch: java.lang.Throwable -> L24
            com.kwad.components.core.o.c.d r1 = r1.aN(r4)     // Catch: java.lang.Throwable -> L24
            com.kwad.components.core.o.c.d r1 = r1.ay(r5)     // Catch: java.lang.Throwable -> L24
            com.kwad.components.core.o.c.d r1 = r1.ax(r6)     // Catch: java.lang.Throwable -> L24
            r2 = 2
            com.kwad.components.core.o.c.d r1 = r1.H(r2)     // Catch: java.lang.Throwable -> L24
            r2 = 1
            a(r1, r2)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r1 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r1)
            return
    }

    public static void d(java.lang.String r1, long r2, java.lang.String r4) {
            com.kwad.components.core.o.c.d r0 = new com.kwad.components.core.o.c.d     // Catch: java.lang.Throwable -> L1c
            r0.<init>()     // Catch: java.lang.Throwable -> L1c
            com.kwad.components.core.o.c.d r1 = r0.aw(r1)     // Catch: java.lang.Throwable -> L1c
            com.kwad.components.core.o.c.d r1 = r1.ay(r4)     // Catch: java.lang.Throwable -> L1c
            com.kwad.components.core.o.c.d r1 = r1.I(r2)     // Catch: java.lang.Throwable -> L1c
            r2 = 1
            com.kwad.components.core.o.c.d r1 = r1.H(r2)     // Catch: java.lang.Throwable -> L1c
            r2 = 0
            a(r1, r2)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r1 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r1)
            return
    }
}
