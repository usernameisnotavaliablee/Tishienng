package com.kwad.components.offline.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.components.core.o.b.a<com.kwad.components.offline.api.tk.ITkOfflineCompo> {
    private static long akg;
    private final java.util.List<com.kwad.components.core.o.a.e.a> akf;
    private final java.util.concurrent.atomic.AtomicBoolean akh;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.offline.d.c$1, reason: invalid class name */
    final class AnonymousClass1 implements com.kwad.components.offline.api.InitCallBack {
        final /* synthetic */ com.kwad.components.offline.api.tk.ITkOfflineCompo aki;
        final /* synthetic */ boolean akj;
        final /* synthetic */ long akk;
        final /* synthetic */ long akl;
        final /* synthetic */ com.kwad.components.offline.d.c akm;
        final /* synthetic */ android.content.Context dq;


        AnonymousClass1(com.kwad.components.offline.d.c r1, com.kwad.components.offline.api.tk.ITkOfflineCompo r2, boolean r3, long r4, long r6, android.content.Context r8) {
                r0 = this;
                r0.akm = r1
                r0.aki = r2
                r0.akj = r3
                r0.akk = r4
                r0.akl = r6
                r0.dq = r8
                r0.<init>()
                return
        }

        @Override // com.kwad.components.offline.api.InitCallBack
        public final void onError(int r2) {
                r1 = this;
                com.kwad.components.offline.d.c r0 = r1.akm
                com.kwad.components.offline.d.c.a(r0, r2)
                return
        }

        @Override // com.kwad.components.offline.api.InitCallBack
        public final void onSuccess(boolean r11) {
                r10 = this;
                com.kwad.components.offline.d.b r0 = new com.kwad.components.offline.d.b     // Catch: java.lang.Throwable -> L91
                com.kwad.components.offline.api.tk.ITkOfflineCompo r1 = r10.aki     // Catch: java.lang.Throwable -> L91
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L91
                java.lang.Class<com.kwad.components.core.o.a.e.c> r1 = com.kwad.components.core.o.a.e.c.class
                com.kwad.sdk.components.d.a(r1, r0)     // Catch: java.lang.Throwable -> L91
                com.kwad.components.offline.d.c r1 = r10.akm     // Catch: java.lang.Throwable -> L91
                java.util.concurrent.atomic.AtomicBoolean r1 = com.kwad.components.offline.d.c.a(r1)     // Catch: java.lang.Throwable -> L91
                r2 = 1
                r1.set(r2)     // Catch: java.lang.Throwable -> L91
                r1 = 2
                if (r11 == 0) goto L1b
                r4 = 2
                goto L1c
            L1b:
                r4 = 1
            L1c:
                boolean r11 = r10.akj     // Catch: java.lang.Throwable -> L91
                if (r11 == 0) goto L22
                r5 = 2
                goto L23
            L22:
                r5 = 1
            L23:
                com.kwad.components.offline.d.c r3 = r10.akm     // Catch: java.lang.Throwable -> L91
                long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L91
                long r6 = r10.akk     // Catch: java.lang.Throwable -> L91
                long r6 = r1 - r6
                long r8 = r10.akl     // Catch: java.lang.Throwable -> L91
                com.kwad.components.offline.d.c.a(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L91
                com.kwad.components.offline.api.tk.TkLoggerReporter r11 = com.kwad.components.offline.api.tk.TkLoggerReporter.get()     // Catch: java.lang.Throwable -> L91
                java.lang.String r1 = "ad_client_apm_log"
                com.kwad.components.offline.api.tk.model.report.TKDownloadMsg r2 = new com.kwad.components.offline.api.tk.model.report.TKDownloadMsg     // Catch: java.lang.Throwable -> L91
                r2.<init>()     // Catch: java.lang.Throwable -> L91
                r3 = 3
                com.kwad.components.offline.api.tk.model.report.TKDownloadMsg r2 = r2.setDownloadState(r3)     // Catch: java.lang.Throwable -> L91
                long r6 = r10.akl     // Catch: java.lang.Throwable -> L91
                com.kwad.components.offline.api.tk.model.report.TKDownloadMsg r2 = r2.setOfflineLoadTime(r6)     // Catch: java.lang.Throwable -> L91
                long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L91
                long r8 = r10.akk     // Catch: java.lang.Throwable -> L91
                long r6 = r6 - r8
                com.kwad.components.offline.api.tk.model.report.TKDownloadMsg r2 = r2.setSoLoadTime(r6)     // Catch: java.lang.Throwable -> L91
                long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L91
                com.kwad.sdk.l r3 = com.kwad.sdk.l.Cf()     // Catch: java.lang.Throwable -> L91
                long r8 = r3.CH()     // Catch: java.lang.Throwable -> L91
                long r6 = r6 - r8
                com.kwad.components.offline.api.tk.model.report.TKDownloadMsg r2 = r2.setInitSdkTimeConsuming(r6)     // Catch: java.lang.Throwable -> L91
                com.kwad.library.solder.lib.i r3 = com.kwad.library.solder.lib.i.zS()     // Catch: java.lang.Throwable -> L91
                com.kwad.library.solder.lib.ext.c r3 = r3.zM()     // Catch: java.lang.Throwable -> L91
                int r3 = r3.An()     // Catch: java.lang.Throwable -> L91
                com.kwad.components.offline.api.tk.model.report.TKDownloadMsg r2 = r2.setThreadPoolCoreSize(r3)     // Catch: java.lang.Throwable -> L91
                com.kwad.components.offline.api.tk.model.report.TKDownloadMsg r2 = r2.setOfflineSource(r5)     // Catch: java.lang.Throwable -> L91
                com.kwad.components.offline.api.tk.model.report.TKDownloadMsg r2 = r2.setSoSource(r4)     // Catch: java.lang.Throwable -> L91
                org.json.JSONObject r2 = r2.toJson()     // Catch: java.lang.Throwable -> L91
                r11.reportTKSOLoad(r1, r2)     // Catch: java.lang.Throwable -> L91
                com.kwad.components.offline.d.c r11 = r10.akm     // Catch: java.lang.Throwable -> L91
                com.kwad.components.offline.d.c.b(r11)     // Catch: java.lang.Throwable -> L91
                com.kwad.components.offline.d.c$1$1 r11 = new com.kwad.components.offline.d.c$1$1     // Catch: java.lang.Throwable -> L91
                r11.<init>(r10, r0)     // Catch: java.lang.Throwable -> L91
                com.kwad.components.core.request.h.b(r11)     // Catch: java.lang.Throwable -> L91
                return
            L91:
                r0 = move-exception
                r11 = r0
                com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r11)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a {
        private static final com.kwad.components.offline.d.c akr = null;

        static {
                com.kwad.components.offline.d.c r0 = new com.kwad.components.offline.d.c
                r1 = 0
                r0.<init>(r1)
                com.kwad.components.offline.d.c.a.akr = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.offline.d.c wy() {
                com.kwad.components.offline.d.c r0 = com.kwad.components.offline.d.c.a.akr
                return r0
        }
    }

    private c() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.akf = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.akh = r0
            return
    }

    /* synthetic */ c(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean a(com.kwad.components.offline.d.c r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.akh
            return r0
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(android.content.Context r11, boolean r12, com.kwad.components.offline.api.tk.ITkOfflineCompo r13) {
            r10 = this;
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = com.kwad.components.offline.d.c.akg
            long r6 = r0 - r2
            com.kwad.components.offline.d.d r9 = new com.kwad.components.offline.d.d
            r9.<init>()
            com.kwad.components.offline.d.c$1 r0 = new com.kwad.components.offline.d.c$1
            r1 = r10
            r8 = r11
            r3 = r12
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r6, r8)
            r2.init(r8, r9, r0)
            return
    }

    static /* synthetic */ void a(com.kwad.components.offline.d.c r0, int r1) {
            r0.aJ(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.offline.d.c r0, int r1, int r2, long r3, long r5) {
            r0.b(r1, r2, r3, r5)
            return
    }

    @com.ksad.annotation.invoker.InvokeBy(invokerClass = com.kwad.components.core.o.b.b.class, methodId = "initOC")
    public static void aF(android.content.Context r2) {
            long r0 = android.os.SystemClock.elapsedRealtime()
            com.kwad.components.offline.d.c.akg = r0
            com.kwad.components.offline.d.c r0 = wx()
            r0.init(r2)
            return
    }

    private void b(int r10, int r11, long r12, long r14) {
            r9 = this;
            java.util.List<com.kwad.components.core.o.a.e.a> r0 = r9.akf
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r1.next()
            r2 = r0
            com.kwad.components.core.o.a.e.a r2 = (com.kwad.components.core.o.a.e.a) r2
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r14
            r2.a(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L1f
        L1a:
            r10 = r3
            r11 = r4
            r12 = r5
            r14 = r7
            goto L6
        L1f:
            r0 = move-exception
            r10 = r0
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r10)
            goto L1a
        L25:
            return
    }

    static /* synthetic */ void b(com.kwad.components.offline.d.c r0) {
            r0.qx()
            return
    }

    public static com.kwad.components.offline.d.c wx() {
            com.kwad.components.offline.d.c r0 = com.kwad.components.offline.d.c.a.wy()
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final /* bridge */ /* synthetic */ void a(android.content.Context r1, boolean r2, com.kwad.components.offline.api.tk.ITkOfflineCompo r3) {
            r0 = this;
            com.kwad.components.offline.api.tk.ITkOfflineCompo r3 = (com.kwad.components.offline.api.tk.ITkOfflineCompo) r3
            r0.a2(r1, r2, r3)
            return
    }

    public final void a(com.kwad.components.core.o.a.e.a r9) {
            r8 = this;
            if (r9 != 0) goto L3
            return
        L3:
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.akh     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L19
            r4 = 0
            r6 = 0
            r2 = 1
            r3 = 1
            r1 = r9
            r1.a(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L16
            goto L1a
        L16:
            r0 = move-exception
            r9 = r0
            goto L20
        L19:
            r1 = r9
        L1a:
            java.util.List<com.kwad.components.core.o.a.e.a> r9 = r8.akf     // Catch: java.lang.Throwable -> L16
            r9.add(r1)     // Catch: java.lang.Throwable -> L16
            return
        L20:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r9)
            return
    }

    public final void b(com.kwad.components.core.o.a.e.a r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.List<com.kwad.components.core.o.a.e.a> r0 = r1.akf
            r0.remove(r2)
            return
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String getTag() {
            r1 = this;
            java.lang.String r0 = "TkInitModule"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final boolean isEnabled() {
            r1 = this;
            boolean r0 = com.kwad.sdk.core.h.a.JO()
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qA() {
            r1 = this;
            java.lang.String r0 = "4.5.20.1"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qB() {
            r1 = this;
            java.lang.String r0 = "https://p2-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/offline_components/tk/ks_so-tachikomaNoSoRelease-4.4.20.2-634ee5d43a-104.zip"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qC() {
            r1 = this;
            java.lang.String r0 = "91ef97cd6a396acd3eaffce69d31b5c5"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qD() {
            r1 = this;
            java.lang.String r0 = "ks_tk_45201"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qE() {
            r1 = this;
            java.lang.String r0 = "com.kwad.tachikoma.TkOfflineCompoImpl"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qy() {
            r1 = this;
            java.lang.String r0 = "TK"
            return r0
    }

    @Override // com.kwad.components.core.o.b.a
    public final java.lang.String qz() {
            r1 = this;
            java.lang.String r0 = "com.kwad.components.tachikoma"
            return r0
    }
}
