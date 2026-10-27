package com.kwad.components.ad.splashscreen.monitor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    private static volatile com.kwad.components.ad.splashscreen.monitor.b FT;

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(long r2, java.util.List<java.lang.String> r4, java.util.List<java.lang.Integer> r5) {
            if (r4 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            int r0 = r4.size()
        L8:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r1.<init>()
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r1.setTotalCount(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r0.setPreloadIds(r4)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setMaterialTypes(r5)
            r5 = 2
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setStatus(r5)
            com.kwad.sdk.commercial.c.a r2 = r4.setPosId(r2)
            com.kwad.sdk.commercial.b.l(r2)
            return
    }

    public static void a(long r2, java.util.List<java.lang.String> r4, java.util.List<java.lang.Integer> r5, int r6, int r7, int r8, int r9) {
            if (r4 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            int r0 = r4.size()
        L8:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r1.<init>()
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r1.setTotalCount(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r0.setPreloadIds(r4)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setMaterialTypes(r5)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setUpdateType(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setClearCount(r7)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setClearImageCount(r8)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setClearVideoCount(r9)
            r5 = 3
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setStatus(r5)
            com.kwad.sdk.commercial.c.a r2 = r4.setPosId(r2)
            com.kwad.sdk.commercial.b.l(r2)
            return
    }

    public static void a(com.kwad.sdk.core.response.model.AdTemplate r3, int r4, int r5, int r6, long r7, long r9) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r1.<init>()
            r2 = 3002(0xbba, float:4.207E-42)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setStatus(r2)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r1.setMaterialType(r4)
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.aZ(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setPreloadId(r1)
            long r1 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setCreativeId(r1)
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r0 = com.kwad.sdk.core.response.b.a.aU(r0)
            java.lang.String r0 = r0.materialUrl
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setUrl(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setShowType(r5)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setLoadType(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setCostTime(r7)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setShowDurationMs(r9)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r3 = r4.setAdTemplate(r3)
            com.kwad.sdk.commercial.b.m(r3)
            return
    }

    public static void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r4, int r5, long r6, long r8) {
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r6
            com.kwad.sdk.core.response.model.AdInfo r6 = com.kwad.sdk.core.response.b.e.el(r4)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r7 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r7.<init>()
            boolean r2 = r4.notNetworkRequest
            if (r2 == 0) goto L14
            r2 = 2
            goto L15
        L14:
            r2 = 1
        L15:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r7 = r7.setType(r2)
            r2 = 3
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r7 = r7.setStatus(r2)
            long r2 = r4.loadDataTime
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r7 = r7.setLoadDataTime(r2)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r7.setCheckStatus(r5)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setCheckDataTime(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setBeforeLoadDataTime(r8)
            com.kwad.sdk.core.config.item.d r7 = com.kwad.components.ad.splashscreen.b.a.FQ
            boolean r7 = com.kwad.sdk.core.config.e.a(r7)
            if (r7 == 0) goto L3b
            r7 = 1
            goto L3d
        L3b:
            r7 = 2
        L3d:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setLoadProcessType(r7)
            long r7 = r4.loadDataTime
            long r7 = r7 + r0
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setLoadAndCheckDataTime(r7)
            com.kwad.sdk.core.config.item.k r7 = com.kwad.sdk.core.config.c.aBQ
            int r7 = com.kwad.sdk.core.config.e.a(r7)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setBuriedPointOptimizeType(r7)
            long r7 = com.kwad.sdk.core.config.e.Gp()
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setVisibleCheckDelayTime(r7)
            java.lang.String r6 = com.kwad.sdk.core.response.b.a.aZ(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setPreloadId(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r5.setAdTemplate(r4)
            com.kwad.sdk.commercial.b.j(r4)
            return
    }

    public static void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r10, long r11, int r13, int r14) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r10)
            boolean r1 = com.kwad.sdk.core.response.b.a.bc(r0)
            if (r1 == 0) goto Lf
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.K(r0)
            goto L15
        Lf:
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r1 = com.kwad.sdk.core.response.b.a.aU(r0)
            java.lang.String r1 = r1.materialUrl
        L15:
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.aZ(r0)
            com.kwad.sdk.core.diskcache.b.a r3 = com.kwad.sdk.core.diskcache.b.a.GP()
            java.io.File r2 = r3.cf(r2)
            if (r2 == 0) goto L2e
            boolean r3 = r2.exists()
            if (r3 == 0) goto L2e
            long r2 = r2.length()
            goto L30
        L2e:
            r2 = 0
        L30:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r4.<init>()
            r5 = 1
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setStatus(r5)
            java.lang.String r6 = com.kwad.sdk.core.response.b.a.aZ(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setPreloadId(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r11 = r4.setCostTime(r11)
            com.kwad.sdk.core.response.model.AdInfo$AdPreloadInfo r12 = r0.adPreloadInfo
            int r12 = r12.validityPeriod
            long r6 = (long) r12
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r11 = r11.setCacheValidTime(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r11 = r11.setSize(r2)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r11 = r11.setUrl(r1)
            boolean r12 = com.kwad.sdk.core.response.b.a.bc(r0)
            if (r12 == 0) goto L62
            goto L63
        L62:
            r5 = 2
        L63:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r11 = r11.setMaterialType(r5)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r11 = r11.setType(r13)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r11 = r11.setRequestType(r14)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r10 = r11.setAdTemplate(r10)
            r11 = 0
            com.kwad.sdk.commercial.b.g(r11, r10)
            return
    }

    public static void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r4, long r5, long r7, long r9) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r4)
            boolean r1 = com.kwad.sdk.core.response.b.a.bd(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r2.<init>()
            int r3 = r4.splashAdLoadType
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setLoadType(r3)
            r3 = 2
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setStatus(r3)
            if (r1 == 0) goto L1b
            goto L1c
        L1b:
            r3 = 1
        L1c:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r2.setType(r3)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r1.setCostTime(r5)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setAddLoadTime(r7)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setRequestLoadTime(r9)
            com.kwad.sdk.core.config.item.k r6 = com.kwad.sdk.core.config.c.aBQ
            int r6 = com.kwad.sdk.core.config.e.a(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setBuriedPointOptimizeType(r6)
            long r6 = com.kwad.sdk.core.config.e.Gp()
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setVisibleCheckDelayTime(r6)
            long r6 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setCreativeId(r6)
            java.lang.String r6 = com.kwad.sdk.core.response.b.a.aZ(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setPreloadId(r6)
            com.kwad.sdk.core.config.item.d r6 = com.kwad.components.ad.splashscreen.b.a.FQ
            boolean r6 = com.kwad.sdk.core.config.e.a(r6)
            if (r6 == 0) goto L59
            r6 = 1
            goto L5b
        L59:
            r6 = 2
        L5b:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setLoadProcessType(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r5.setAdTemplate(r4)
            com.kwad.sdk.commercial.b.m(r4)
            return
    }

    public static void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r5, long r6, boolean r8) {
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r6
            com.kwad.sdk.core.response.model.AdInfo r6 = com.kwad.sdk.core.response.b.e.el(r5)
            boolean r7 = com.kwad.sdk.core.response.b.a.bd(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r2.<init>()
            int r3 = r5.splashAdLoadType
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setLoadType(r3)
            r3 = 6
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setStatus(r3)
            long r3 = com.kwad.sdk.core.response.b.a.J(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r6 = r2.setCreativeId(r3)
            r2 = 2
            r3 = 1
            if (r8 == 0) goto L2b
            r8 = 1
            goto L2c
        L2b:
            r8 = 2
        L2c:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r6 = r6.setViewSource(r8)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r6 = r6.setLoadDataTime(r0)
            if (r7 == 0) goto L37
            goto L38
        L37:
            r2 = 1
        L38:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r6 = r6.setType(r2)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r6.setAdTemplate(r5)
            com.kwad.sdk.commercial.b.m(r5)
            return
    }

    public static void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r5, long r6, boolean r8, boolean r9) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r5)
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r6
            boolean r6 = com.kwad.sdk.core.response.b.a.bd(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r7 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r7.<init>()
            r3 = 203(0xcb, float:2.84E-43)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r7 = r7.setStatus(r3)
            long r3 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r7 = r7.setCreativeId(r3)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r7 = r7.setLoadDataTime(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r7 = r7.setRootVisible(r8)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r7 = r7.setParentVisible(r9)
            if (r6 == 0) goto L30
            r6 = 2
            goto L31
        L30:
            r6 = 1
        L31:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r6 = r7.setType(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r6.setAdTemplate(r5)
            com.kwad.sdk.commercial.b.m(r5)
            return
    }

    public static void a(com.kwad.sdk.core.response.model.AdTemplate r2, com.kwad.components.offline.api.tk.model.StyleTemplate r3) {
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r0.<init>()
            r1 = 101(0x65, float:1.42E-43)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setStatus(r1)
            java.lang.String r1 = r3.templateId
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setTemplateId(r1)
            int r3 = r3.templateVersionCode
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r3 = r0.setTemplateVersionCode(r3)
            int r0 = com.kwad.sdk.core.response.b.b.dx(r2)
            long r0 = (long) r0
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r3 = r3.setTkRenderType(r0)
            com.kwad.sdk.core.response.b.e.el(r2)
            boolean r0 = com.kwad.components.ad.splashscreen.h.ac(r2)
            if (r0 == 0) goto L2e
            long r0 = com.kwad.sdk.core.response.b.b.dw(r2)
            goto L36
        L2e:
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r2)
            long r0 = com.kwad.sdk.core.response.b.b.dG(r0)
        L36:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r3 = r3.setTkDefaultTimeout(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r3.setAdTemplate(r2)
            com.kwad.sdk.commercial.b.m(r2)
            return
    }

    public static void a(com.kwad.sdk.core.response.model.AdTemplate r3, com.kwad.components.offline.api.tk.model.StyleTemplate r4, int r5, long r6, int r8, long r9, long r11, long r13, long r15, long r17) {
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r0.<init>()
            r1 = 104(0x68, float:1.46E-43)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setStatus(r1)
            java.lang.String r1 = r4.templateId
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setTemplateId(r1)
            int r1 = com.kwad.sdk.core.response.b.b.dx(r3)
            long r1 = (long) r1
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setTkRenderType(r1)
            int r4 = r4.templateVersionCode
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r0.setTemplateVersionCode(r4)
            com.kwad.sdk.core.response.b.e.el(r3)
            boolean r0 = com.kwad.components.ad.splashscreen.h.ac(r3)
            if (r0 == 0) goto L2e
            long r0 = com.kwad.sdk.core.response.b.b.dw(r3)
            goto L36
        L2e:
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
            long r0 = com.kwad.sdk.core.response.b.b.dG(r0)
        L36:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setTkDefaultTimeout(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setSoSource(r5)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setSoLoadTime(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setOfflineSource(r8)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setOfflineLoadTime(r9)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setTkFileLoadTime(r11)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setTkInitTime(r13)
            r5 = r15
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setTkRenderTime(r5)
            r5 = r17
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setTkTotalTime(r5)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r3 = r4.setAdTemplate(r3)
            com.kwad.sdk.commercial.b.m(r3)
            return
    }

    public static void a(@androidx.annotation.Nullable com.kwad.sdk.core.response.model.AdTemplate r6, java.lang.String r7, boolean r8) {
            r0 = 2
            r1 = 1
            if (r6 != 0) goto L18
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r6 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r6.<init>()
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r6 = r6.setErrorMsg(r7)
            if (r8 == 0) goto L10
            r0 = 1
        L10:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r6 = r6.setViewSource(r0)
            com.kwad.sdk.commercial.b.n(r6)
            return
        L18:
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r3 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r3.<init>()
            long r4 = com.kwad.sdk.core.response.b.a.J(r2)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r3.setCreativeId(r4)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r7 = r2.setErrorMsg(r7)
            if (r8 == 0) goto L30
            r0 = 1
        L30:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r7 = r7.setViewSource(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r6 = r7.setAdTemplate(r6)
            com.kwad.sdk.commercial.b.n(r6)
            return
    }

    public static void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r5, boolean r6, boolean r7, boolean r8) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r5)
            boolean r1 = com.kwad.sdk.core.response.b.a.bd(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r2.<init>()
            r3 = 202(0xca, float:2.83E-43)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setStatus(r3)
            long r3 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r2.setCreativeId(r3)
            if (r1 == 0) goto L1f
            r1 = 2
            goto L20
        L1f:
            r1 = 1
        L20:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setType(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r6 = r0.setRootVisible(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r6 = r6.setParentVisible(r7)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r6 = r6.setHasUnbind(r8)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r6.setAdTemplate(r5)
            com.kwad.sdk.commercial.b.m(r5)
            return
    }

    public static void a(@androidx.annotation.NonNull java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r3, long r4, long r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r3.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            com.kwad.sdk.core.response.model.AdTemplate r2 = (com.kwad.sdk.core.response.model.AdTemplate) r2
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.aZ(r2)
            r0.add(r2)
            goto L9
        L21:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r1.<init>()
            r2 = 2
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setStatus(r2)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r1.setIds(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r0.setLoadDataTime(r4)
            int r3 = r3.size()
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r3 = r4.setCount(r3)
            com.kwad.sdk.commercial.c.a r3 = r3.setPosId(r6)
            com.kwad.sdk.commercial.b.k(r3)
            return
    }

    public static void ai(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r5) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r5)
            boolean r1 = com.kwad.sdk.core.response.b.a.bd(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r2.<init>()
            int r3 = r5.splashAdLoadType
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setLoadType(r3)
            r3 = 4
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setStatus(r3)
            com.kwad.sdk.core.config.item.k r3 = com.kwad.sdk.core.config.c.aBQ
            int r3 = com.kwad.sdk.core.config.e.a(r3)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setBuriedPointOptimizeType(r3)
            long r3 = com.kwad.sdk.core.config.e.Gp()
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setVisibleCheckDelayTime(r3)
            long r3 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r2.setCreativeId(r3)
            if (r1 == 0) goto L36
            r1 = 2
            goto L37
        L36:
            r1 = 1
        L37:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setType(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r0.setAdTemplate(r5)
            com.kwad.sdk.commercial.b.m(r5)
            return
    }

    public static void aj(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r5) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r5)
            boolean r1 = com.kwad.sdk.core.response.b.a.bd(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r2.<init>()
            r3 = 200(0xc8, float:2.8E-43)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setStatus(r3)
            long r3 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r2.setCreativeId(r3)
            if (r1 == 0) goto L1f
            r1 = 2
            goto L20
        L1f:
            r1 = 1
        L20:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setType(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r0.setAdTemplate(r5)
            com.kwad.sdk.commercial.b.m(r5)
            return
    }

    public static void ak(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r5) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r5)
            boolean r1 = com.kwad.sdk.core.response.b.a.bd(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r2.<init>()
            r3 = 201(0xc9, float:2.82E-43)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setStatus(r3)
            long r3 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r2.setCreativeId(r3)
            if (r1 == 0) goto L1f
            r1 = 2
            goto L20
        L1f:
            r1 = 1
        L20:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setType(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r0.setAdTemplate(r5)
            com.kwad.sdk.commercial.b.m(r5)
            return
    }

    public static void al(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r5) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r5)
            boolean r1 = com.kwad.sdk.core.response.b.a.bd(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r2.<init>()
            r3 = 204(0xcc, float:2.86E-43)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setStatus(r3)
            long r3 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r2.setCreativeId(r3)
            if (r1 == 0) goto L1f
            r1 = 2
            goto L20
        L1f:
            r1 = 1
        L20:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setType(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r0.setAdTemplate(r5)
            com.kwad.sdk.commercial.b.m(r5)
            return
    }

    public static void am(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r5) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r5)
            boolean r1 = com.kwad.sdk.core.response.b.a.bd(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r2.<init>()
            r3 = 205(0xcd, float:2.87E-43)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setStatus(r3)
            long r3 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r2.setCreativeId(r3)
            if (r1 == 0) goto L1f
            r1 = 2
            goto L20
        L1f:
            r1 = 1
        L20:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setType(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r0.setAdTemplate(r5)
            com.kwad.sdk.commercial.b.m(r5)
            return
    }

    public static void an(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r5) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r5)
            boolean r1 = com.kwad.sdk.core.response.b.a.bd(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r2.<init>()
            r3 = 206(0xce, float:2.89E-43)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setStatus(r3)
            long r3 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r2.setCreativeId(r3)
            if (r1 == 0) goto L1f
            r1 = 2
            goto L20
        L1f:
            r1 = 1
        L20:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setType(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r0.setAdTemplate(r5)
            com.kwad.sdk.commercial.b.m(r5)
            return
    }

    public static void ao(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r5) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r5)
            boolean r1 = com.kwad.sdk.core.response.b.a.bd(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r2.<init>()
            r3 = 207(0xcf, float:2.9E-43)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setStatus(r3)
            long r3 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r2.setCreativeId(r3)
            if (r1 == 0) goto L1f
            r1 = 2
            goto L20
        L1f:
            r1 = 1
        L20:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setType(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r0.setAdTemplate(r5)
            com.kwad.sdk.commercial.b.m(r5)
            return
    }

    public static void ap(@androidx.annotation.Nullable com.kwad.sdk.core.response.model.AdTemplate r5) {
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashPlayCardTKInfo r0 = com.kwad.sdk.core.response.b.b.dv(r5)
            java.lang.String r1 = r0.templateId
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 1
            if (r1 == 0) goto L11
            java.lang.String r1 = "template_id_empty"
            r3 = 1
            goto L14
        L11:
            java.lang.String r1 = ""
            r3 = 0
        L14:
            int r4 = r0.renderType
            if (r4 == r2) goto L2c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "template_render_type_error"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            int r0 = r0.renderType
            goto L2e
        L2c:
            r0 = -1
            r2 = r3
        L2e:
            if (r2 != 0) goto L31
            return
        L31:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r2.<init>()
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r2.setErrorMsg(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r1.setErrorCode(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r0.setAdTemplate(r5)
            com.kwad.sdk.commercial.b.o(r5)
            return
    }

    public static void b(int r2, java.lang.String r3, long r4) {
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r0.<init>()
            r1 = 3
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setStatus(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r0.setErrorCode(r2)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setErrorMsg(r3)
            com.kwad.sdk.commercial.c.a r2 = r2.setPosId(r4)
            com.kwad.sdk.commercial.b.k(r2)
            return
    }

    public static void b(com.kwad.sdk.core.response.model.AdTemplate r3, int r4, int r5, int r6, long r7, long r9) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r1.<init>()
            r2 = 3003(0xbbb, float:4.208E-42)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setStatus(r2)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r1.setMaterialType(r4)
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.aZ(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setPreloadId(r1)
            long r1 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setCreativeId(r1)
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r0 = com.kwad.sdk.core.response.b.a.aU(r0)
            java.lang.String r0 = r0.materialUrl
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setUrl(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setShowType(r5)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setLoadType(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setCostTime(r7)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setShowDurationMs(r9)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r3 = r4.setAdTemplate(r3)
            com.kwad.sdk.commercial.b.m(r3)
            return
    }

    public static void b(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r4, int r5, long r6, long r8) {
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r6
            com.kwad.sdk.core.response.model.AdInfo r6 = com.kwad.sdk.core.response.b.e.el(r4)
            boolean r7 = com.kwad.sdk.core.response.b.a.bc(r6)
            if (r7 == 0) goto L14
            java.lang.String r7 = com.kwad.sdk.core.response.b.a.K(r6)
            goto L1a
        L14:
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r7 = com.kwad.sdk.core.response.b.a.aU(r6)
            java.lang.String r7 = r7.materialUrl
        L1a:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r2.<init>()
            boolean r3 = r4.notNetworkRequest
            if (r3 == 0) goto L25
            r3 = 2
            goto L26
        L25:
            r3 = 1
        L26:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setType(r3)
            r3 = 5
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setStatus(r3)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r2.setCheckStatus(r5)
            long r2 = r4.loadDataTime
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setLoadDataTime(r2)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setCheckDataTime(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setBeforeLoadDataTime(r8)
            long r8 = r4.loadDataTime
            long r8 = r8 + r0
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setLoadAndCheckDataTime(r8)
            java.lang.String r6 = com.kwad.sdk.core.response.b.a.aZ(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setPreloadId(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setUrl(r7)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r5.setAdTemplate(r4)
            com.kwad.sdk.commercial.b.j(r4)
            return
    }

    public static void b(com.kwad.sdk.core.response.model.AdTemplate r3, com.kwad.components.offline.api.tk.model.StyleTemplate r4) {
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r0.<init>()
            r1 = 102(0x66, float:1.43E-43)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setStatus(r1)
            java.lang.String r1 = r4.templateId
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setTemplateId(r1)
            int r1 = com.kwad.sdk.core.response.b.b.dx(r3)
            long r1 = (long) r1
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setTkRenderType(r1)
            int r4 = r4.templateVersionCode
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r0.setTemplateVersionCode(r4)
            com.kwad.sdk.core.response.b.e.el(r3)
            boolean r0 = com.kwad.components.ad.splashscreen.h.ac(r3)
            if (r0 == 0) goto L2e
            long r0 = com.kwad.sdk.core.response.b.b.dw(r3)
            goto L36
        L2e:
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
            long r0 = com.kwad.sdk.core.response.b.b.dG(r0)
        L36:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setTkDefaultTimeout(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r3 = r4.setAdTemplate(r3)
            com.kwad.sdk.commercial.b.m(r3)
            return
    }

    public static void b(boolean r2, int r3, java.lang.String r4, long r5) {
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r0.<init>()
            r1 = 4
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setStatus(r1)
            if (r2 == 0) goto Le
            r2 = 2
            goto Lf
        Le:
            r2 = 1
        Lf:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r0.setType(r2)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setErrorCode(r3)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setErrorMsg(r4)
            com.kwad.sdk.commercial.c.a r2 = r2.setPosId(r5)
            com.kwad.sdk.commercial.b.p(r2)
            return
    }

    private static com.kwad.components.offline.api.tk.model.StyleTemplate c(com.kwad.sdk.core.response.model.AdTemplate r3) {
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.dK(r3)
            com.kwad.sdk.core.response.model.AdMatrixInfo$MatrixTemplate r3 = com.kwad.sdk.core.response.b.b.k(r3, r0)
            com.kwad.components.offline.api.tk.model.StyleTemplate r0 = new com.kwad.components.offline.api.tk.model.StyleTemplate
            r0.<init>()
            if (r3 == 0) goto L20
            java.lang.String r1 = r3.templateId
            r0.templateId = r1
            java.lang.String r1 = r3.templateMd5
            r0.templateMd5 = r1
            java.lang.String r1 = r3.templateUrl
            r0.templateUrl = r1
            long r1 = r3.templateVersionCode
            int r3 = (int) r1
            r0.templateVersionCode = r3
        L20:
            return r0
    }

    public static void c(com.kwad.sdk.core.response.model.AdTemplate r3, com.kwad.components.offline.api.tk.model.StyleTemplate r4) {
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r0.<init>()
            r1 = 106(0x6a, float:1.49E-43)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setStatus(r1)
            int r1 = com.kwad.sdk.core.response.b.b.dx(r3)
            long r1 = (long) r1
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setTkRenderType(r1)
            java.lang.String r1 = r4.templateId
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setTemplateId(r1)
            int r4 = r4.templateVersionCode
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r0.setTemplateVersionCode(r4)
            com.kwad.sdk.core.response.b.e.el(r3)
            boolean r0 = com.kwad.components.ad.splashscreen.h.ac(r3)
            if (r0 == 0) goto L2e
            long r0 = com.kwad.sdk.core.response.b.b.dw(r3)
            goto L36
        L2e:
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
            long r0 = com.kwad.sdk.core.response.b.b.dG(r0)
        L36:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setTkDefaultTimeout(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r3 = r4.setAdTemplate(r3)
            com.kwad.sdk.commercial.b.m(r3)
            return
    }

    public static void c(boolean r2, int r3, java.lang.String r4, long r5) {
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r0.<init>()
            r1 = 4
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setStatus(r1)
            if (r2 == 0) goto Le
            r2 = 2
            goto Lf
        Le:
            r2 = 1
        Lf:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r0.setType(r2)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setErrorCode(r3)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setErrorMsg(r4)
            com.kwad.sdk.commercial.c.a r2 = r2.setPosId(r5)
            com.kwad.sdk.commercial.b.j(r2)
            return
    }

    public static void d(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r6, int r7, java.lang.String r8) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r6)
            boolean r1 = com.kwad.sdk.core.response.b.a.bc(r0)
            if (r1 == 0) goto Lf
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.K(r0)
            goto L15
        Lf:
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r1 = com.kwad.sdk.core.response.b.a.aU(r0)
            java.lang.String r1 = r1.materialUrl
        L15:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r2.<init>()
            r3 = 2
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setStatus(r3)
            java.lang.String r4 = com.kwad.sdk.core.response.b.a.aZ(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setPreloadId(r4)
            long r4 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setCreativeId(r4)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r2.setUrl(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r7 = r1.setErrorCode(r7)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r7 = r7.setErrorMsg(r8)
            boolean r8 = com.kwad.sdk.core.response.b.a.bc(r0)
            r0 = 1
            if (r8 == 0) goto L43
            r3 = 1
        L43:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r7 = r7.setMaterialType(r3)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r7 = r7.setType(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r6 = r7.setAdTemplate(r6)
            com.kwad.sdk.commercial.b.g(r0, r6)
            return
    }

    public static void e(com.kwad.sdk.core.response.model.AdTemplate r3, int r4, int r5) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r1.<init>()
            r2 = 3001(0xbb9, float:4.205E-42)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setStatus(r2)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r1.setMaterialType(r4)
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.aZ(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setPreloadId(r1)
            long r1 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setCreativeId(r1)
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r0 = com.kwad.sdk.core.response.b.a.aU(r0)
            java.lang.String r0 = r0.materialUrl
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setUrl(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setShowType(r5)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r3 = r4.setAdTemplate(r3)
            com.kwad.sdk.commercial.b.m(r3)
            return
    }

    public static void e(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r5, int r6, java.lang.String r7) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r5)
            boolean r1 = com.kwad.sdk.core.response.b.a.bd(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r2.<init>()
            int r3 = r5.splashAdLoadType
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setLoadType(r3)
            r3 = 3
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setStatus(r3)
            long r3 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setCreativeId(r3)
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.aZ(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setPreloadId(r3)
            if (r1 == 0) goto L2c
            r3 = 2
            goto L2d
        L2c:
            r3 = 1
        L2d:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setType(r3)
            if (r1 == 0) goto L3a
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r0 = com.kwad.sdk.core.response.b.a.aU(r0)
            java.lang.String r0 = r0.materialUrl
            goto L3e
        L3a:
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.K(r0)
        L3e:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r2.setUrl(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r6 = r0.setErrorCode(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r6 = r6.setErrorMsg(r7)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r6.setAdTemplate(r5)
            com.kwad.sdk.commercial.b.m(r5)
            return
    }

    public static void e(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r4, long r5) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r4)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r1.<init>()
            boolean r2 = r4.notNetworkRequest
            r3 = 2
            if (r2 == 0) goto L10
            r2 = 2
            goto L11
        L10:
            r2 = 1
        L11:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setType(r2)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setStatus(r3)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r1.setBeforeLoadDataTime(r5)
            long r1 = r4.loadDataTime
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setLoadDataTime(r1)
            com.kwad.sdk.core.config.item.d r6 = com.kwad.components.ad.splashscreen.b.a.FQ
            boolean r6 = com.kwad.sdk.core.config.e.a(r6)
            if (r6 == 0) goto L2e
            r1 = 1
            goto L30
        L2e:
            r1 = 2
        L30:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setLoadProcessType(r1)
            com.kwad.sdk.core.config.item.k r6 = com.kwad.sdk.core.config.c.aBQ
            int r6 = com.kwad.sdk.core.config.e.a(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setBuriedPointOptimizeType(r6)
            long r1 = com.kwad.sdk.core.config.e.Gp()
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setVisibleCheckDelayTime(r1)
            java.lang.String r6 = com.kwad.sdk.core.response.b.a.aZ(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setPreloadId(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r5.setAdTemplate(r4)
            com.kwad.sdk.commercial.b.j(r4)
            return
    }

    public static void f(long r2, long r4) {
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r0.<init>()
            r1 = 11
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setStatus(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r0.setBeforeLoadDataTime(r4)
            com.kwad.sdk.core.config.item.d r5 = com.kwad.components.ad.splashscreen.b.a.FQ
            boolean r5 = com.kwad.sdk.core.config.e.a(r5)
            if (r5 == 0) goto L1a
            r0 = 1
            goto L1c
        L1a:
            r0 = 2
        L1c:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setLoadProcessType(r0)
            com.kwad.sdk.core.config.item.k r5 = com.kwad.sdk.core.config.c.aBQ
            int r5 = com.kwad.sdk.core.config.e.a(r5)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setBuriedPointOptimizeType(r5)
            long r0 = com.kwad.sdk.core.config.e.Gp()
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r4.setVisibleCheckDelayTime(r0)
            com.kwad.sdk.commercial.c.a r2 = r4.setPosId(r2)
            com.kwad.sdk.commercial.b.j(r2)
            return
    }

    public static void f(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r5, long r6) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r5)
            boolean r0 = com.kwad.sdk.core.response.b.a.bd(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r1.<init>()
            int r2 = r5.splashAdLoadType
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setLoadType(r2)
            r2 = 1
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setStatus(r2)
            com.kwad.sdk.core.config.item.k r3 = com.kwad.sdk.core.config.c.aBQ
            int r3 = com.kwad.sdk.core.config.e.a(r3)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setBuriedPointOptimizeType(r3)
            long r3 = com.kwad.sdk.core.config.e.Gp()
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setVisibleCheckDelayTime(r3)
            if (r0 == 0) goto L2d
            r2 = 2
        L2d:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r1.setType(r2)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r6 = r0.setCostTime(r6)
            com.kwad.sdk.core.config.item.d r7 = com.kwad.components.ad.splashscreen.b.a.FQ
            boolean r7 = com.kwad.sdk.core.config.e.a(r7)
            if (r7 == 0) goto L40
            r0 = 1
            goto L42
        L40:
            r0 = 2
        L42:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r6 = r6.setLoadProcessType(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r6.setAdTemplate(r5)
            com.kwad.sdk.commercial.b.m(r5)
            return
    }

    public static void g(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r4, long r5) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r4)
            boolean r1 = com.kwad.sdk.core.response.b.a.bd(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r2.<init>()
            r3 = 5
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r2 = r2.setStatus(r3)
            if (r1 == 0) goto L16
            r1 = 2
            goto L17
        L16:
            r1 = 1
        L17:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r2.setType(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r1.setCostTime(r5)
            long r1 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setCreativeId(r1)
            java.lang.String r6 = com.kwad.sdk.core.response.b.a.aZ(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setPreloadId(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r5.setAdTemplate(r4)
            com.kwad.sdk.commercial.b.m(r4)
            return
    }

    public static void k(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r3 = r8.getAdTemplateList()
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r4 = r3.hasNext()
            r5 = 1
            if (r4 == 0) goto L51
            java.lang.Object r4 = r3.next()
            com.kwad.sdk.core.response.model.AdTemplate r4 = (com.kwad.sdk.core.response.model.AdTemplate) r4
            com.kwad.sdk.core.response.model.AdInfo r6 = com.kwad.sdk.core.response.b.e.el(r4)
            long r6 = com.kwad.sdk.core.response.b.a.J(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r0.add(r6)
            com.kwad.sdk.core.response.model.AdInfo r6 = com.kwad.sdk.core.response.b.e.el(r4)
            java.lang.String r6 = com.kwad.sdk.core.response.b.a.aZ(r6)
            r1.add(r6)
            com.kwad.sdk.core.response.model.AdInfo r4 = com.kwad.sdk.core.response.b.e.el(r4)
            boolean r4 = com.kwad.sdk.core.response.b.a.bc(r4)
            if (r4 == 0) goto L49
            r5 = 2
        L49:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r2.add(r4)
            goto L17
        L51:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r3 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r3.<init>()
            java.util.List r4 = r8.getAdTemplateList()
            int r4 = r4.size()
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r3 = r3.setTotalCount(r4)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r3.setCreativeIds(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setPreloadIds(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setMaterialTypes(r2)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setStatus(r5)
            long r1 = r8.getPosId()
            com.kwad.sdk.commercial.c.a r8 = r0.setPosId(r1)
            com.kwad.sdk.commercial.b.l(r8)
            return
    }

    public static com.kwad.components.ad.splashscreen.monitor.b lZ() {
            com.kwad.components.ad.splashscreen.monitor.b r0 = com.kwad.components.ad.splashscreen.monitor.b.FT
            if (r0 != 0) goto L19
            java.lang.Class<com.kwad.components.ad.splashscreen.monitor.b> r0 = com.kwad.components.ad.splashscreen.monitor.b.class
            monitor-enter(r0)
            com.kwad.components.ad.splashscreen.monitor.b r1 = com.kwad.components.ad.splashscreen.monitor.b.FT     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.kwad.components.ad.splashscreen.monitor.b r1 = new com.kwad.components.ad.splashscreen.monitor.b     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.kwad.components.ad.splashscreen.monitor.b.FT = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.kwad.components.ad.splashscreen.monitor.b r0 = com.kwad.components.ad.splashscreen.monitor.b.FT
            return r0
    }

    public static void u(long r3) {
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r0.<init>()
            r1 = 1
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setStatus(r1)
            com.kwad.sdk.core.config.item.d r1 = com.kwad.components.ad.splashscreen.b.a.FQ
            boolean r1 = com.kwad.sdk.core.config.e.a(r1)
            if (r1 == 0) goto L15
            r1 = 1
            goto L17
        L15:
            r1 = 2
        L17:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setLoadProcessType(r1)
            com.kwad.sdk.core.config.item.k r1 = com.kwad.sdk.core.config.c.aBQ
            int r1 = com.kwad.sdk.core.config.e.a(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setBuriedPointOptimizeType(r1)
            long r1 = com.kwad.sdk.core.config.e.Gp()
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setVisibleCheckDelayTime(r1)
            com.kwad.sdk.commercial.c.a r3 = r0.setPosId(r3)
            com.kwad.sdk.commercial.b.j(r3)
            return
    }

    public static void v(long r2) {
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r0.<init>()
            r1 = 1
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setStatus(r1)
            com.kwad.sdk.commercial.c.a r2 = r0.setPosId(r2)
            com.kwad.sdk.commercial.b.k(r2)
            return
    }

    public final void c(com.kwad.sdk.core.response.model.AdTemplate r5, java.lang.String r6) {
            r4 = this;
            com.kwad.components.offline.api.tk.model.StyleTemplate r0 = c(r5)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r1.<init>()
            r2 = 103(0x67, float:1.44E-43)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setStatus(r2)
            int r2 = com.kwad.sdk.core.response.b.b.dx(r5)
            long r2 = (long) r2
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setTkRenderType(r2)
            java.lang.String r2 = r0.templateId
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setTemplateId(r2)
            int r0 = r0.templateVersionCode
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r1.setTemplateVersionCode(r0)
            com.kwad.sdk.core.response.b.e.el(r5)
            boolean r1 = com.kwad.components.ad.splashscreen.h.ac(r5)
            if (r1 == 0) goto L32
            long r1 = com.kwad.sdk.core.response.b.b.dw(r5)
            goto L3a
        L32:
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r5)
            long r1 = com.kwad.sdk.core.response.b.b.dG(r1)
        L3a:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setTkDefaultTimeout(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r6 = r0.setErrorMsg(r6)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r6.setAdTemplate(r5)
            com.kwad.sdk.commercial.b.m(r5)
            return
    }

    public final void d(com.kwad.sdk.core.response.model.AdTemplate r4, java.lang.String r5) {
            r3 = this;
            com.kwad.components.offline.api.tk.model.StyleTemplate r0 = c(r4)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = new com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo
            r1.<init>()
            r2 = 105(0x69, float:1.47E-43)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setStatus(r2)
            java.lang.String r2 = r0.templateId
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r1 = r1.setTemplateId(r2)
            int r0 = r0.templateVersionCode
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r1.setTemplateVersionCode(r0)
            int r1 = com.kwad.sdk.core.response.b.b.dx(r4)
            long r1 = (long) r1
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r0 = r0.setTkRenderType(r1)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r0.setErrorMsg(r5)
            com.kwad.sdk.core.response.b.e.el(r4)
            boolean r0 = com.kwad.components.ad.splashscreen.h.ac(r4)
            if (r0 == 0) goto L36
            long r0 = com.kwad.sdk.core.response.b.b.dw(r4)
            goto L3e
        L36:
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r4)
            long r0 = com.kwad.sdk.core.response.b.b.dG(r0)
        L3e:
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r5 = r5.setTkDefaultTimeout(r0)
            com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo r4 = r5.setAdTemplate(r4)
            com.kwad.sdk.commercial.b.m(r4)
            return
    }
}
