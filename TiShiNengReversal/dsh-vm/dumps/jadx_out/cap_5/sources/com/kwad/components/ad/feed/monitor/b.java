package com.kwad.components.ad.feed.monitor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void B(int r2) {
            com.kwad.components.ad.feed.monitor.FeedPageInfo r0 = new com.kwad.components.ad.feed.monitor.FeedPageInfo
            r0.<init>()
            r1 = 1
            com.kwad.components.ad.feed.monitor.FeedPageInfo r0 = r0.setStatus(r1)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r2 = r0.setAdNum(r2)
            a(r2)
            return
    }

    public static void C(int r2) {
            com.kwad.components.ad.feed.monitor.FeedPageInfo r0 = new com.kwad.components.ad.feed.monitor.FeedPageInfo
            r0.<init>()
            r1 = 2
            com.kwad.components.ad.feed.monitor.FeedPageInfo r0 = r0.setStatus(r1)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r2 = r0.setAdNum(r2)
            a(r2)
            return
    }

    public static void a(int r3, int r4, com.kwad.sdk.core.response.model.AdTemplate r5, int r6) {
            com.kwad.components.ad.feed.monitor.FeedErrorInfo r0 = new com.kwad.components.ad.feed.monitor.FeedErrorInfo
            r0.<init>()
            long r1 = (long) r4
            com.kwad.components.ad.feed.monitor.FeedErrorInfo r4 = r0.setMaterialType(r1)
            com.kwad.components.ad.feed.monitor.FeedErrorInfo r4 = r4.setErrorType(r6)
            com.kwad.sdk.commercial.c.a r3 = r4.setErrorCode(r3)
            com.kwad.sdk.commercial.c.a r3 = r3.setAdTemplate(r5)
            com.kwad.components.ad.feed.monitor.FeedErrorInfo r3 = (com.kwad.components.ad.feed.monitor.FeedErrorInfo) r3
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r6 = "ad_sdk_feed_h5_monitor"
            a(r6, r3, r4)
            return
    }

    public static void a(int r3, long r4) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "feedLoadOptimizeType"
            int r2 = com.kwad.sdk.core.config.e.EQ()
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "feedLoadOptimizeExternalEnable"
            int r2 = com.kwad.sdk.core.config.e.ET()
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            com.kwad.sdk.l r1 = com.kwad.sdk.l.Cf()
            boolean r1 = r1.Bk()
            java.lang.String r2 = "isExternal"
            com.kwad.sdk.utils.aa.putValue(r0, r2, r1)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r1 = new com.kwad.components.ad.feed.monitor.FeedPageInfo
            r1.<init>()
            r2 = 6
            com.kwad.components.ad.feed.monitor.FeedPageInfo r1 = r1.setStatus(r2)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r3 = r1.setAdNum(r3)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r3 = r3.setLoadDataDuration(r4)
            java.lang.String r4 = r0.toString()
            com.kwad.components.ad.feed.monitor.FeedPageInfo r3 = r3.setAbParams(r4)
            a(r3)
            return
    }

    public static void a(int r2, com.kwad.sdk.core.response.model.AdTemplate r3, java.lang.String r4, int r5) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r1 = new com.kwad.components.ad.feed.monitor.FeedPageInfo
            r1.<init>()
            com.kwad.components.ad.feed.monitor.FeedPageInfo r2 = r1.setCallbackType(r2)
            int r0 = com.kwad.sdk.core.response.b.a.be(r0)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r2 = r2.setMaterialType(r0)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r2 = r2.setMaterialUrl(r4)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r2 = r2.setRenderType(r5)
            com.kwad.sdk.commercial.c.a r2 = r2.setAdTemplate(r3)
            b(r2)
            return
    }

    public static void a(long r1, int r3, int r4, com.kwad.sdk.core.response.model.AdTemplate r5) {
            com.kwad.components.ad.feed.monitor.FeedErrorInfo r0 = new com.kwad.components.ad.feed.monitor.FeedErrorInfo
            r0.<init>()
            com.kwad.components.ad.feed.monitor.FeedErrorInfo r1 = r0.setWidth(r1)
            long r2 = (long) r3
            com.kwad.components.ad.feed.monitor.FeedErrorInfo r1 = r1.setMaterialType(r2)
            com.kwad.components.ad.feed.monitor.FeedErrorInfo r1 = r1.setFeedType(r4)
            com.kwad.sdk.commercial.c.a r1 = r1.setAdTemplate(r5)
            com.kwad.components.ad.feed.monitor.FeedErrorInfo r1 = (com.kwad.components.ad.feed.monitor.FeedErrorInfo) r1
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r4 = "ad_sdk_feed_width_monitor"
            a(r4, r1, r2)
            return
    }

    public static void a(long r3, java.util.List<com.kwad.sdk.api.KsFeedAd> r5) {
            if (r5 == 0) goto L38
            int r0 = r5.size()
            if (r0 == 0) goto L38
            r0 = 0
            java.lang.Object r1 = r5.get(r0)
            boolean r1 = r1 instanceof com.kwad.components.ad.feed.c
            if (r1 == 0) goto L38
            java.lang.Object r0 = r5.get(r0)
            com.kwad.components.ad.feed.c r0 = (com.kwad.components.ad.feed.c) r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            java.util.List r5 = c(r5)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r1 = new com.kwad.components.ad.feed.monitor.FeedPageInfo
            r1.<init>()
            r2 = 1
            com.kwad.components.ad.feed.monitor.FeedPageInfo r1 = r1.setCallbackType(r2)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r3 = r1.setPosId(r3)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r3 = r3.setMaterialInfoList(r5)
            com.kwad.sdk.commercial.c.a r3 = r3.setAdTemplate(r0)
            b(r3)
        L38:
            return
    }

    private static void a(com.kwad.sdk.commercial.c.a r1) {
            r0 = 0
            b(r1, r0)
            return
    }

    public static void a(com.kwad.sdk.core.response.model.AdTemplate r3, int r4, int r5, long r6, java.lang.String r8) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r1 = new com.kwad.components.ad.feed.monitor.FeedPageInfo
            r1.<init>()
            r2 = 5
            com.kwad.components.ad.feed.monitor.FeedPageInfo r1 = r1.setStatus(r2)
            int r2 = r3.type
            com.kwad.components.ad.feed.monitor.FeedPageInfo r1 = r1.setType(r2)
            int r0 = com.kwad.sdk.core.response.b.a.be(r0)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r0 = r1.setMaterialType(r0)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r0 = r0.setRenderType(r4)
            int r1 = r3.loadType
            long r1 = (long) r1
            com.kwad.components.ad.feed.monitor.FeedPageInfo r0 = r0.setLoadType(r1)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r5 = r0.setExpectedRenderType(r5)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r5 = r5.setErrorMsg(r8)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r5 = r5.setRenderDuration(r6)
            com.kwad.sdk.commercial.c.a r3 = r5.setAdTemplate(r3)
            r5 = 2
            if (r4 == r5) goto L3f
            r5 = 3
            if (r4 == r5) goto L3f
            r4 = 1
            goto L40
        L3f:
            r4 = 0
        L40:
            b(r3, r4)
            return
    }

    public static void a(com.kwad.sdk.core.response.model.AdTemplate r3, int r4, int r5, java.lang.String r6, java.lang.String r7, long r8) {
            r0 = 1
            if (r5 != r0) goto L8
            boolean r1 = r3.mHasReportVideoLoad
            if (r1 == 0) goto L8
            return
        L8:
            if (r5 != r0) goto Lc
            r3.mHasReportVideoLoad = r0
        Lc:
            com.kwad.components.ad.feed.monitor.FeedPageInfo r1 = new com.kwad.components.ad.feed.monitor.FeedPageInfo
            r1.<init>()
            r2 = 3
            com.kwad.components.ad.feed.monitor.FeedPageInfo r1 = r1.setStatus(r2)
            int r2 = r3.type
            com.kwad.components.ad.feed.monitor.FeedPageInfo r1 = r1.setType(r2)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r1 = r1.setLoadStatus(r4)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r8 = r1.setResourceLoadDuration(r8)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r5 = r8.setMaterialType(r5)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r5 = r5.setMaterialUrl(r6)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r5 = r5.setErrorMsg(r7)
            com.kwad.sdk.commercial.c.a r3 = r5.setAdTemplate(r3)
            r5 = 2
            if (r4 != r5) goto L38
            goto L39
        L38:
            r0 = 0
        L39:
            b(r3, r0)
            return
    }

    public static void a(com.kwad.sdk.core.response.model.AdTemplate r3, int r4, long r5) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r1 = new com.kwad.components.ad.feed.monitor.FeedPageInfo
            r1.<init>()
            r2 = 8
            com.kwad.components.ad.feed.monitor.FeedPageInfo r1 = r1.setStatus(r2)
            int r2 = r3.type
            com.kwad.components.ad.feed.monitor.FeedPageInfo r1 = r1.setType(r2)
            int r0 = com.kwad.sdk.core.response.b.a.be(r0)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r0 = r1.setMaterialType(r0)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r4 = r0.setRenderType(r4)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r4 = r4.setConvertDuration(r5)
            com.kwad.sdk.commercial.c.a r3 = r4.setAdTemplate(r3)
            a(r3)
            return
    }

    public static void a(com.kwad.sdk.core.response.model.AdTemplate r2, java.lang.String r3) {
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r0 = new com.kwad.components.ad.feed.monitor.FeedWebViewInfo
            r0.<init>()
            java.lang.String r1 = "webview_load_url"
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r0 = r0.setEvent(r1)
            java.lang.String r1 = "ad_feed"
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r0 = r0.setSceneId(r1)
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r3 = r0.setUrl(r3)
            com.kwad.sdk.commercial.c.a r2 = r3.setAdTemplate(r2)
            com.kwad.sdk.commercial.b.g(r2)
            return
    }

    public static void a(com.kwad.sdk.core.response.model.AdTemplate r2, java.lang.String r3, long r4) {
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r0 = new com.kwad.components.ad.feed.monitor.FeedWebViewInfo
            r0.<init>()
            java.lang.String r1 = "webview_load_finish"
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r0 = r0.setEvent(r1)
            java.lang.String r1 = "ad_feed"
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r0 = r0.setSceneId(r1)
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r4 = r0.setDurationMs(r4)
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r3 = r4.setUrl(r3)
            com.kwad.sdk.commercial.c.a r2 = r3.setAdTemplate(r2)
            com.kwad.sdk.commercial.b.g(r2)
            return
    }

    public static void a(com.kwad.sdk.core.response.model.AdTemplate r2, java.lang.String r3, long r4, int r6) {
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r0 = new com.kwad.components.ad.feed.monitor.FeedWebViewInfo
            r0.<init>()
            java.lang.String r1 = "webview_timeout"
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r0 = r0.setEvent(r1)
            java.lang.String r1 = "ad_feed"
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r0 = r0.setSceneId(r1)
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r6 = r0.setTimeType(r6)
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r4 = r6.setDurationMs(r4)
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r3 = r4.setUrl(r3)
            com.kwad.sdk.commercial.c.a r2 = r3.setAdTemplate(r2)
            com.kwad.sdk.commercial.b.g(r2)
            return
    }

    private static void a(java.lang.String r2, com.kwad.components.ad.feed.monitor.FeedErrorInfo r3, double r4) {
            com.kwad.sdk.commercial.c r0 = com.kwad.sdk.commercial.c.DS()     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = "ad_client_error_log"
            com.kwad.sdk.commercial.c r0 = r0.cF(r1)     // Catch: java.lang.Exception -> L2c
            com.kwai.adclient.kscommerciallogger.model.BusinessType r1 = com.kwai.adclient.kscommerciallogger.model.BusinessType.AD_FEED     // Catch: java.lang.Exception -> L2c
            com.kwad.sdk.commercial.c r0 = r0.b(r1)     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = "default"
            com.kwad.sdk.commercial.c r0 = r0.O(r2, r1)     // Catch: java.lang.Exception -> L2c
            com.kwad.sdk.commercial.c r2 = r0.cG(r2)     // Catch: java.lang.Exception -> L2c
            com.kwai.adclient.kscommerciallogger.model.d r0 = com.kwai.adclient.kscommerciallogger.model.a.bez     // Catch: java.lang.Exception -> L2c
            com.kwad.sdk.commercial.c r2 = r2.a(r0)     // Catch: java.lang.Exception -> L2c
            com.kwad.sdk.commercial.c r2 = r2.z(r3)     // Catch: java.lang.Exception -> L2c
            com.kwad.sdk.commercial.c r2 = r2.i(r4)     // Catch: java.lang.Exception -> L2c
            com.kwad.sdk.commercial.b.d(r2)     // Catch: java.lang.Exception -> L2c
            return
        L2c:
            r2 = move-exception
            java.lang.String r3 = "reportFeedError"
            java.lang.String r2 = r2.toString()
            com.kwad.sdk.core.d.c.d(r3, r2)
            return
    }

    public static void b(int r3, int r4, com.kwad.sdk.core.response.model.AdTemplate r5) {
            com.kwad.components.ad.feed.monitor.FeedErrorInfo r0 = new com.kwad.components.ad.feed.monitor.FeedErrorInfo
            r0.<init>()
            long r1 = (long) r3
            com.kwad.components.ad.feed.monitor.FeedErrorInfo r3 = r0.setMaterialType(r1)
            com.kwad.components.ad.feed.monitor.FeedErrorInfo r3 = r3.setFeedType(r4)
            com.kwad.sdk.commercial.c.a r3 = r3.setAdTemplate(r5)
            com.kwad.components.ad.feed.monitor.FeedErrorInfo r3 = (com.kwad.components.ad.feed.monitor.FeedErrorInfo) r3
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r0 = "ad_sdk_feed_showType_monitor"
            a(r0, r3, r4)
            return
    }

    private static void b(com.kwad.sdk.commercial.c.a r3) {
            com.kwad.sdk.commercial.c r0 = com.kwad.sdk.commercial.c.DS()     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = "ad_client_apm_log"
            com.kwad.sdk.commercial.c r0 = r0.cF(r1)     // Catch: java.lang.Exception -> L2f
            r1 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            com.kwad.sdk.commercial.c r0 = r0.i(r1)     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = "ad_sdk_feed_callback"
            java.lang.String r2 = "callback_type"
            com.kwad.sdk.commercial.c r0 = r0.O(r1, r2)     // Catch: java.lang.Exception -> L2f
            com.kwai.adclient.kscommerciallogger.model.BusinessType r1 = com.kwai.adclient.kscommerciallogger.model.BusinessType.AD_FEED     // Catch: java.lang.Exception -> L2f
            com.kwad.sdk.commercial.c r0 = r0.b(r1)     // Catch: java.lang.Exception -> L2f
            com.kwad.sdk.commercial.c r3 = r0.z(r3)     // Catch: java.lang.Exception -> L2f
            com.kwai.adclient.kscommerciallogger.model.d r0 = com.kwai.adclient.kscommerciallogger.model.a.bez     // Catch: java.lang.Exception -> L2f
            com.kwad.sdk.commercial.c r3 = r3.a(r0)     // Catch: java.lang.Exception -> L2f
            com.kwad.sdk.commercial.b.d(r3)     // Catch: java.lang.Exception -> L2f
            return
        L2f:
            r3 = move-exception
            java.lang.String r0 = "reportFeedCallback"
            java.lang.String r3 = r3.toString()
            com.kwad.sdk.core.d.c.e(r0, r3)
            return
    }

    private static void b(com.kwad.sdk.commercial.c.a r3, boolean r4) {
            com.kwad.sdk.commercial.c r0 = com.kwad.sdk.commercial.c.DS()     // Catch: java.lang.Exception -> L3c
            if (r4 == 0) goto L9
            java.lang.String r1 = "ad_client_error_log"
            goto Lb
        L9:
            java.lang.String r1 = "ad_client_apm_log"
        Lb:
            com.kwad.sdk.commercial.c r0 = r0.cF(r1)     // Catch: java.lang.Exception -> L3c
            if (r4 == 0) goto L17
            r1 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            goto L1c
        L17:
            r1 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
        L1c:
            com.kwad.sdk.commercial.c r4 = r0.i(r1)     // Catch: java.lang.Exception -> L3c
            java.lang.String r0 = "ad_sdk_feed_load"
            java.lang.String r1 = "status"
            com.kwad.sdk.commercial.c r4 = r4.O(r0, r1)     // Catch: java.lang.Exception -> L3c
            com.kwai.adclient.kscommerciallogger.model.BusinessType r0 = com.kwai.adclient.kscommerciallogger.model.BusinessType.AD_FEED     // Catch: java.lang.Exception -> L3c
            com.kwad.sdk.commercial.c r4 = r4.b(r0)     // Catch: java.lang.Exception -> L3c
            com.kwad.sdk.commercial.c r3 = r4.z(r3)     // Catch: java.lang.Exception -> L3c
            com.kwai.adclient.kscommerciallogger.model.d r4 = com.kwai.adclient.kscommerciallogger.model.a.bez     // Catch: java.lang.Exception -> L3c
            com.kwad.sdk.commercial.c r3 = r3.a(r4)     // Catch: java.lang.Exception -> L3c
            com.kwad.sdk.commercial.b.d(r3)     // Catch: java.lang.Exception -> L3c
            return
        L3c:
            r3 = move-exception
            java.lang.String r4 = "reportFeedPageLineLog"
            java.lang.String r3 = r3.toString()
            com.kwad.sdk.core.d.c.e(r4, r3)
            return
    }

    private static java.util.List<com.kwad.components.ad.feed.monitor.FeedPageInfo.a> c(java.util.List<com.kwad.sdk.api.KsFeedAd> r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r5.next()
            com.kwad.sdk.api.KsFeedAd r1 = (com.kwad.sdk.api.KsFeedAd) r1
            boolean r2 = r1 instanceof com.kwad.components.ad.feed.c
            if (r2 == 0) goto L9
            com.kwad.components.ad.feed.c r1 = (com.kwad.components.ad.feed.c) r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.getAdTemplate()
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            com.kwad.components.ad.feed.monitor.FeedPageInfo$a r2 = new com.kwad.components.ad.feed.monitor.FeedPageInfo$a
            r2.<init>()
            long r3 = com.kwad.sdk.core.response.b.a.J(r1)
            com.kwad.components.ad.feed.monitor.FeedPageInfo$a r2 = r2.i(r3)
            int r3 = com.kwad.sdk.core.response.b.a.be(r1)
            com.kwad.components.ad.feed.monitor.FeedPageInfo$a r2 = r2.D(r3)
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.bb(r1)
            com.kwad.components.ad.feed.monitor.FeedPageInfo$a r1 = r2.t(r1)
            r0.add(r1)
            goto L9
        L44:
            return r0
    }

    public static void c(com.kwad.sdk.core.response.model.AdTemplate r5, int r6, int r7) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "feedLoadOptimizeType"
            int r2 = com.kwad.sdk.core.config.e.EQ()
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            java.lang.String r1 = "feedLoadOptimizeExternalEnable"
            int r2 = com.kwad.sdk.core.config.e.ET()
            com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
            com.kwad.sdk.l r1 = com.kwad.sdk.l.Cf()
            boolean r1 = r1.Bk()
            java.lang.String r2 = "isExternal"
            com.kwad.sdk.utils.aa.putValue(r0, r2, r1)
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r5)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r2 = new com.kwad.components.ad.feed.monitor.FeedPageInfo
            r2.<init>()
            r3 = 7
            com.kwad.components.ad.feed.monitor.FeedPageInfo r2 = r2.setStatus(r3)
            int r3 = r5.type
            com.kwad.components.ad.feed.monitor.FeedPageInfo r2 = r2.setType(r3)
            int r3 = r5.loadType
            long r3 = (long) r3
            com.kwad.components.ad.feed.monitor.FeedPageInfo r2 = r2.setLoadType(r3)
            int r1 = com.kwad.sdk.core.response.b.a.be(r1)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r1 = r2.setMaterialType(r1)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r6 = r1.setRenderType(r6)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r6 = r6.setExpectedRenderType(r7)
            java.lang.String r7 = r0.toString()
            com.kwad.components.ad.feed.monitor.FeedPageInfo r6 = r6.setAbParams(r7)
            com.kwad.sdk.commercial.c.a r5 = r6.setAdTemplate(r5)
            a(r5)
            return
    }

    public static void ch() {
            com.kwad.components.ad.feed.monitor.FeedErrorInfo r0 = new com.kwad.components.ad.feed.monitor.FeedErrorInfo
            r0.<init>()
            r1 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            java.lang.String r3 = "ad_sdk_feed_adnum_monitor"
            a(r3, r0, r1)
            return
    }

    public static void ci() {
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r0 = new com.kwad.components.ad.feed.monitor.FeedWebViewInfo
            r0.<init>()
            java.lang.String r1 = "webview_init"
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r0 = r0.setEvent(r1)
            java.lang.String r1 = "ad_feed"
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r0 = r0.setSceneId(r1)
            com.kwad.sdk.commercial.b.g(r0)
            return
    }

    public static void e(int r2, java.lang.String r3) {
            com.kwad.components.ad.feed.monitor.FeedPageInfo r0 = new com.kwad.components.ad.feed.monitor.FeedPageInfo
            r0.<init>()
            r1 = 9
            com.kwad.components.ad.feed.monitor.FeedPageInfo r0 = r0.setStatus(r1)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r2 = r0.setErrorCode(r2)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r2 = r2.setErrorMsg(r3)
            r3 = 1
            b(r2, r3)
            return
    }

    public static void f(int r2, java.lang.String r3) {
            com.kwad.components.ad.feed.monitor.FeedPageInfo r0 = new com.kwad.components.ad.feed.monitor.FeedPageInfo
            r0.<init>()
            r1 = 10
            com.kwad.components.ad.feed.monitor.FeedPageInfo r0 = r0.setStatus(r1)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r0 = r0.setLoadStatus(r2)
            com.kwad.components.ad.feed.monitor.FeedPageInfo r3 = r0.setErrorMsg(r3)
            r0 = 2
            if (r2 != r0) goto L18
            r2 = 1
            goto L19
        L18:
            r2 = 0
        L19:
            b(r3, r2)
            return
    }

    public static void g(int r2, java.lang.String r3) {
            com.kwad.components.ad.feed.monitor.FeedErrorInfo r0 = new com.kwad.components.ad.feed.monitor.FeedErrorInfo
            r0.<init>()
            com.kwad.sdk.commercial.c.a r2 = r0.setErrorCode(r2)
            com.kwad.sdk.commercial.c.a r2 = r2.setErrorMsg(r3)
            com.kwad.components.ad.feed.monitor.FeedErrorInfo r2 = (com.kwad.components.ad.feed.monitor.FeedErrorInfo) r2
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r3 = "ad_sdk_feed_request_monitor"
            a(r3, r2, r0)
            return
    }

    public static void n(com.kwad.sdk.core.response.model.AdTemplate r2) {
            com.kwad.components.ad.feed.monitor.FeedPageInfo r0 = new com.kwad.components.ad.feed.monitor.FeedPageInfo
            r0.<init>()
            r1 = 11
            com.kwad.components.ad.feed.monitor.FeedPageInfo r0 = r0.setStatus(r1)
            com.kwad.sdk.commercial.c.a r2 = r0.setAdTemplate(r2)
            a(r2)
            return
    }

    public static void o(com.kwad.sdk.core.response.model.AdTemplate r2) {
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r0 = new com.kwad.components.ad.feed.monitor.FeedWebViewInfo
            r0.<init>()
            java.lang.String r1 = "ad_show"
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r0 = r0.setEvent(r1)
            java.lang.String r1 = "ad_feed"
            com.kwad.components.ad.feed.monitor.FeedWebViewInfo r0 = r0.setSceneId(r1)
            com.kwad.sdk.commercial.c.a r2 = r0.setAdTemplate(r2)
            com.kwad.sdk.commercial.b.g(r2)
            return
    }
}
