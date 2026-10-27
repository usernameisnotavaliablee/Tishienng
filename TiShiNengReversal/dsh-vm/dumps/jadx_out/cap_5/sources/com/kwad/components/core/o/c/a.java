package com.kwad.components.core.o.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void a(com.kwad.components.core.o.c.b r1) {
            r0 = 0
            a(r1, r0)
            return
    }

    private static void a(com.kwad.components.core.o.c.b r3, boolean r4) {
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
            java.lang.String r0 = "ad_sdk_offline_component_monitor"
            java.lang.String r1 = "load_status"
            com.kwad.sdk.commercial.c r4 = r4.O(r0, r1)
            com.kwad.sdk.commercial.c r3 = r4.z(r3)
            com.kwai.adclient.kscommerciallogger.model.d r4 = com.kwai.adclient.kscommerciallogger.model.a.bez
            com.kwad.sdk.commercial.c r3 = r3.a(r4)
            com.kwad.sdk.commercial.b.d(r3)
            return
    }

    public static void a(java.lang.String r1, long r2, int r4, java.lang.String r5, java.lang.String r6) {
            com.kwad.components.core.o.c.b r0 = new com.kwad.components.core.o.c.b     // Catch: java.lang.Throwable -> L24
            r0.<init>()     // Catch: java.lang.Throwable -> L24
            com.kwad.components.core.o.c.b r1 = r0.at(r1)     // Catch: java.lang.Throwable -> L24
            com.kwad.components.core.o.c.b r1 = r1.G(r2)     // Catch: java.lang.Throwable -> L24
            com.kwad.components.core.o.c.b r1 = r1.aM(r4)     // Catch: java.lang.Throwable -> L24
            com.kwad.components.core.o.c.b r1 = r1.av(r6)     // Catch: java.lang.Throwable -> L24
            com.kwad.components.core.o.c.b r1 = r1.au(r5)     // Catch: java.lang.Throwable -> L24
            r2 = 7
            com.kwad.components.core.o.c.b r1 = r1.F(r2)     // Catch: java.lang.Throwable -> L24
            r2 = 1
            a(r1, r2)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r1 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r1)
            return
    }

    public static void a(java.lang.String r1, long r2, java.lang.String r4) {
            com.kwad.components.core.o.c.b r0 = new com.kwad.components.core.o.c.b     // Catch: java.lang.Throwable -> L1b
            r0.<init>()     // Catch: java.lang.Throwable -> L1b
            com.kwad.components.core.o.c.b r1 = r0.at(r1)     // Catch: java.lang.Throwable -> L1b
            com.kwad.components.core.o.c.b r1 = r1.av(r4)     // Catch: java.lang.Throwable -> L1b
            com.kwad.components.core.o.c.b r1 = r1.G(r2)     // Catch: java.lang.Throwable -> L1b
            r2 = 5
            com.kwad.components.core.o.c.b r1 = r1.F(r2)     // Catch: java.lang.Throwable -> L1b
            a(r1)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r1 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r1)
            return
    }

    public static void b(java.lang.String r1, long r2, int r4) {
            com.kwad.components.core.o.c.b r0 = new com.kwad.components.core.o.c.b     // Catch: java.lang.Throwable -> L1b
            r0.<init>()     // Catch: java.lang.Throwable -> L1b
            com.kwad.components.core.o.c.b r1 = r0.at(r1)     // Catch: java.lang.Throwable -> L1b
            com.kwad.components.core.o.c.b r1 = r1.G(r2)     // Catch: java.lang.Throwable -> L1b
            com.kwad.components.core.o.c.b r1 = r1.aL(r4)     // Catch: java.lang.Throwable -> L1b
            r2 = 2
            com.kwad.components.core.o.c.b r1 = r1.F(r2)     // Catch: java.lang.Throwable -> L1b
            a(r1)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r1 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r1)
            return
    }

    public static void b(java.lang.String r1, long r2, java.lang.String r4) {
            com.kwad.components.core.o.c.b r0 = new com.kwad.components.core.o.c.b     // Catch: java.lang.Throwable -> L1b
            r0.<init>()     // Catch: java.lang.Throwable -> L1b
            com.kwad.components.core.o.c.b r1 = r0.at(r1)     // Catch: java.lang.Throwable -> L1b
            com.kwad.components.core.o.c.b r1 = r1.G(r2)     // Catch: java.lang.Throwable -> L1b
            com.kwad.components.core.o.c.b r1 = r1.av(r4)     // Catch: java.lang.Throwable -> L1b
            r2 = 3
            com.kwad.components.core.o.c.b r1 = r1.F(r2)     // Catch: java.lang.Throwable -> L1b
            a(r1)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r1 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r1)
            return
    }

    public static void c(java.lang.String r1, long r2) {
            com.kwad.components.core.o.c.b r0 = new com.kwad.components.core.o.c.b     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
            com.kwad.components.core.o.c.b r1 = r0.at(r1)     // Catch: java.lang.Throwable -> L17
            com.kwad.components.core.o.c.b r1 = r1.G(r2)     // Catch: java.lang.Throwable -> L17
            r2 = 1
            com.kwad.components.core.o.c.b r1 = r1.F(r2)     // Catch: java.lang.Throwable -> L17
            a(r1)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r1 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r1)
            return
    }

    public static void c(java.lang.String r2, long r3, int r5) {
            com.kwad.components.core.o.c.b r0 = new com.kwad.components.core.o.c.b     // Catch: java.lang.Throwable -> L1b
            r0.<init>()     // Catch: java.lang.Throwable -> L1b
            com.kwad.components.core.o.c.b r2 = r0.at(r2)     // Catch: java.lang.Throwable -> L1b
            r0 = 8
            com.kwad.components.core.o.c.b r2 = r2.F(r0)     // Catch: java.lang.Throwable -> L1b
            com.kwad.components.core.o.c.b r2 = r2.aL(r5)     // Catch: java.lang.Throwable -> L1b
            com.kwad.components.core.o.c.b r2 = r2.G(r3)     // Catch: java.lang.Throwable -> L1b
            a(r2)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r2 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r2)
            return
    }

    public static void c(java.lang.String r1, long r2, java.lang.String r4) {
            com.kwad.components.core.o.c.b r0 = new com.kwad.components.core.o.c.b     // Catch: java.lang.Throwable -> L1b
            r0.<init>()     // Catch: java.lang.Throwable -> L1b
            com.kwad.components.core.o.c.b r1 = r0.at(r1)     // Catch: java.lang.Throwable -> L1b
            com.kwad.components.core.o.c.b r1 = r1.G(r2)     // Catch: java.lang.Throwable -> L1b
            com.kwad.components.core.o.c.b r1 = r1.av(r4)     // Catch: java.lang.Throwable -> L1b
            r2 = 4
            com.kwad.components.core.o.c.b r1 = r1.F(r2)     // Catch: java.lang.Throwable -> L1b
            a(r1)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r1 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r1)
            return
    }

    public static void d(java.lang.String r1, long r2) {
            com.kwad.components.core.o.c.b r0 = new com.kwad.components.core.o.c.b     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
            com.kwad.components.core.o.c.b r1 = r0.at(r1)     // Catch: java.lang.Throwable -> L17
            com.kwad.components.core.o.c.b r1 = r1.G(r2)     // Catch: java.lang.Throwable -> L17
            r2 = 6
            com.kwad.components.core.o.c.b r1 = r1.F(r2)     // Catch: java.lang.Throwable -> L17
            a(r1)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r1 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r1)
            return
    }
}
