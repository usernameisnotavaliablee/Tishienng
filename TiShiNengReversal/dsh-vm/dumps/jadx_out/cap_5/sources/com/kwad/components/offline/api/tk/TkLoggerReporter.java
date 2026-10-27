package com.kwad.components.offline.api.tk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class TkLoggerReporter {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.offline.api.tk.TkLoggerReporter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Holder {
        private static final com.kwad.components.offline.api.tk.TkLoggerReporter sInstance = null;

        static {
                com.kwad.components.offline.api.tk.TkLoggerReporter r0 = new com.kwad.components.offline.api.tk.TkLoggerReporter
                r1 = 0
                r0.<init>(r1)
                com.kwad.components.offline.api.tk.TkLoggerReporter.Holder.sInstance = r0
                return
        }

        private Holder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.offline.api.tk.TkLoggerReporter access$100() {
                com.kwad.components.offline.api.tk.TkLoggerReporter r0 = com.kwad.components.offline.api.tk.TkLoggerReporter.Holder.sInstance
                return r0
        }
    }

    private TkLoggerReporter() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ TkLoggerReporter(com.kwad.components.offline.api.tk.TkLoggerReporter.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kwad.components.offline.api.tk.TkLoggerReporter get() {
            com.kwad.components.offline.api.tk.TkLoggerReporter r0 = com.kwad.components.offline.api.tk.TkLoggerReporter.Holder.access$100()
            return r0
    }

    private void reportEvent(java.lang.String r1, java.lang.String r2, org.json.JSONObject r3, com.kwad.sdk.commercial.c r4) {
            r0 = this;
            com.kwad.components.offline.api.core.IOfflineHostApi r1 = com.kwad.components.offline.api.OfflineHostProvider.getApi()
            com.kwad.components.offline.api.core.api.ILoggerReporter r1 = r1.loggerReporter()
            r1.reportEvent(r4)
            return
    }

    public final void reportTKDownload(java.lang.String r4, org.json.JSONObject r5) {
            r3 = this;
            com.kwad.components.offline.api.core.IOfflineHostApi r0 = com.kwad.components.offline.api.OfflineHostProvider.getApi()
            com.kwad.components.offline.api.core.api.ILoggerReporter r0 = r0.loggerReporter()
            com.kwad.sdk.commercial.c r1 = com.kwad.sdk.commercial.c.DS()
            com.kwad.sdk.commercial.c r4 = r1.cF(r4)
            r1 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            com.kwad.sdk.commercial.c r4 = r4.i(r1)
            java.lang.String r1 = "ad_tk_download_performance"
            java.lang.String r2 = "download_state"
            com.kwad.sdk.commercial.c r4 = r4.O(r1, r2)
            com.kwad.sdk.commercial.c r4 = r4.h(r5)
            r0.reportEvent(r4)
            return
    }

    public final void reportTKPerform(java.lang.String r4, org.json.JSONObject r5) {
            r3 = this;
            com.kwad.components.offline.api.core.IOfflineHostApi r0 = com.kwad.components.offline.api.OfflineHostProvider.getApi()
            com.kwad.components.offline.api.core.api.ILoggerReporter r0 = r0.loggerReporter()
            com.kwad.sdk.commercial.c r1 = com.kwad.sdk.commercial.c.DS()
            com.kwad.sdk.commercial.c r4 = r1.cF(r4)
            r1 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            com.kwad.sdk.commercial.c r4 = r4.i(r1)
            r1 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            com.kwad.sdk.commercial.c r4 = r4.k(r1)
            java.lang.String r1 = "ad_tk_render_performance"
            java.lang.String r2 = "render_state"
            com.kwad.sdk.commercial.c r4 = r4.O(r1, r2)
            com.kwad.sdk.commercial.c r4 = r4.h(r5)
            r0.reportEvent(r4)
            return
    }

    public final void reportTKSODownload(java.lang.String r4, org.json.JSONObject r5) {
            r3 = this;
            com.kwad.components.offline.api.core.IOfflineHostApi r0 = com.kwad.components.offline.api.OfflineHostProvider.getApi()
            com.kwad.components.offline.api.core.api.ILoggerReporter r0 = r0.loggerReporter()
            com.kwad.sdk.commercial.c r1 = com.kwad.sdk.commercial.c.DS()
            com.kwad.sdk.commercial.c r4 = r1.cF(r4)
            r1 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            com.kwad.sdk.commercial.c r4 = r4.i(r1)
            java.lang.String r1 = "ad_tk_so_download_event"
            java.lang.String r2 = "download_state"
            com.kwad.sdk.commercial.c r4 = r4.O(r1, r2)
            com.kwad.sdk.commercial.c r4 = r4.h(r5)
            r0.reportEvent(r4)
            return
    }

    public final void reportTKSOLoad(java.lang.String r4, org.json.JSONObject r5) {
            r3 = this;
            com.kwad.components.offline.api.core.IOfflineHostApi r0 = com.kwad.components.offline.api.OfflineHostProvider.getApi()
            com.kwad.components.offline.api.core.api.ILoggerReporter r0 = r0.loggerReporter()
            com.kwad.sdk.commercial.c r1 = com.kwad.sdk.commercial.c.DS()
            com.kwad.sdk.commercial.c r4 = r1.cF(r4)
            r1 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            com.kwad.sdk.commercial.c r4 = r4.i(r1)
            java.lang.String r1 = "ad_tk_so_load_performence"
            java.lang.String r2 = "download_state"
            com.kwad.sdk.commercial.c r4 = r4.O(r1, r2)
            com.kwad.sdk.commercial.c r4 = r4.h(r5)
            r0.reportEvent(r4)
            return
    }
}
