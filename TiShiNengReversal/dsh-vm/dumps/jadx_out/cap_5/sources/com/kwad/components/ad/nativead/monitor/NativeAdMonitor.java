package com.kwad.components.ad.nativead.monitor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class NativeAdMonitor {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class NativeReportMsg extends com.kwad.sdk.commercial.c.a implements java.io.Serializable {
        public static final long serialVersionUID = 478072683065430299L;
        public java.lang.String containerName;
        public java.lang.String containerType;
        public int state;

        public NativeReportMsg() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.kwad.components.ad.nativead.monitor.NativeAdMonitor.NativeReportMsg obtain() {
                com.kwad.components.ad.nativead.monitor.NativeAdMonitor$NativeReportMsg r0 = new com.kwad.components.ad.nativead.monitor.NativeAdMonitor$NativeReportMsg
                r0.<init>()
                return r0
        }

        public com.kwad.components.ad.nativead.monitor.NativeAdMonitor.NativeReportMsg setContainerName(java.lang.String r1) {
                r0 = this;
                r0.containerName = r1
                return r0
        }

        public com.kwad.components.ad.nativead.monitor.NativeAdMonitor.NativeReportMsg setContainerType(java.lang.String r1) {
                r0 = this;
                r0.containerType = r1
                return r0
        }

        public com.kwad.components.ad.nativead.monitor.NativeAdMonitor.NativeReportMsg setState(int r1) {
                r0 = this;
                r0.state = r1
                return r0
        }
    }

    public NativeAdMonitor() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.view.ViewGroup r2, int r3) {
            java.lang.String r0 = ""
            if (r2 == 0) goto Lc
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L30
        Lc:
            boolean r1 = r2 instanceof android.widget.FrameLayout     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L16
            java.lang.String r2 = "frameLayout"
            a(r2, r0, r3)     // Catch: java.lang.Throwable -> L30
            return
        L16:
            boolean r1 = r2 instanceof android.widget.LinearLayout     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L20
            java.lang.String r2 = "linearLayout"
            a(r2, r0, r3)     // Catch: java.lang.Throwable -> L30
            return
        L20:
            boolean r2 = r2 instanceof android.widget.RelativeLayout     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L2a
            java.lang.String r2 = "relativeLayout"
            a(r2, r0, r3)     // Catch: java.lang.Throwable -> L30
            return
        L2a:
            java.lang.String r2 = "unknown"
            a(r2, r0, r3)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r2 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r2)
            return
    }

    private static void a(java.lang.String r1, java.lang.String r2, int r3) {
            com.kwad.components.ad.nativead.monitor.NativeAdMonitor$NativeReportMsg r0 = com.kwad.components.ad.nativead.monitor.NativeAdMonitor.NativeReportMsg.obtain()
            com.kwad.components.ad.nativead.monitor.NativeAdMonitor$NativeReportMsg r1 = r0.setContainerType(r1)
            com.kwad.components.ad.nativead.monitor.NativeAdMonitor$NativeReportMsg r1 = r1.setContainerName(r2)
            com.kwad.components.ad.nativead.monitor.NativeAdMonitor$NativeReportMsg r1 = r1.setState(r3)
            c(r1)
            return
    }

    private static void c(com.kwad.sdk.commercial.c.a r3) {
            com.kwad.sdk.commercial.c r0 = com.kwad.sdk.commercial.c.DS()     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = "ad_client_apm_log"
            com.kwad.sdk.commercial.c r0 = r0.cF(r1)     // Catch: java.lang.Exception -> L2f
            r1 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            com.kwad.sdk.commercial.c r0 = r0.i(r1)     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = "ad_sdk_native_container_monitor"
            java.lang.String r2 = "state"
            com.kwad.sdk.commercial.c r0 = r0.O(r1, r2)     // Catch: java.lang.Exception -> L2f
            com.kwai.adclient.kscommerciallogger.model.BusinessType r1 = com.kwai.adclient.kscommerciallogger.model.BusinessType.AD_NATIVE     // Catch: java.lang.Exception -> L2f
            com.kwad.sdk.commercial.c r0 = r0.b(r1)     // Catch: java.lang.Exception -> L2f
            com.kwad.sdk.commercial.c r3 = r0.z(r3)     // Catch: java.lang.Exception -> L2f
            com.kwai.adclient.kscommerciallogger.model.d r0 = com.kwai.adclient.kscommerciallogger.model.a.bez     // Catch: java.lang.Exception -> L2f
            com.kwad.sdk.commercial.c r3 = r3.a(r0)     // Catch: java.lang.Exception -> L2f
            com.kwad.sdk.commercial.b.d(r3)     // Catch: java.lang.Exception -> L2f
            return
        L2f:
            r3 = move-exception
            java.lang.String r0 = "reportNativeContainerLog"
            java.lang.String r3 = r3.toString()
            com.kwad.sdk.core.d.c.e(r0, r3)
            return
    }

    public static void fw() {
            com.kwad.components.ad.nativead.monitor.NativeAdMonitor$NativeReportMsg r0 = com.kwad.components.ad.nativead.monitor.NativeAdMonitor.NativeReportMsg.obtain()
            r1 = 6
            com.kwad.components.ad.nativead.monitor.NativeAdMonitor$NativeReportMsg r0 = r0.setState(r1)
            c(r0)
            return
    }

    public static void fx() {
            com.kwad.components.ad.nativead.monitor.NativeAdMonitor$NativeReportMsg r0 = com.kwad.components.ad.nativead.monitor.NativeAdMonitor.NativeReportMsg.obtain()
            r1 = 7
            com.kwad.components.ad.nativead.monitor.NativeAdMonitor$NativeReportMsg r0 = r0.setState(r1)
            c(r0)
            return
    }
}
