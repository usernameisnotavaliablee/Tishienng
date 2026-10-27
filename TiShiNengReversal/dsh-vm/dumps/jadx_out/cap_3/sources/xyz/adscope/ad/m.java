package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class m implements xyz.adscope.ad.s1 {
    private final android.content.Context a;
    private final xyz.adscope.common.analyse.publish.IEventAnalyser b;
    private final xyz.adscope.common.analyse2.publish.IScopeEventAnalyser c;
    private final xyz.adscope.common.v2.beta.IBetaTest d;
    private java.lang.String e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements xyz.adscope.ad.d3 {
        final /* synthetic */ xyz.adscope.ad.m a;

        a(xyz.adscope.ad.m r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // xyz.adscope.ad.d3
        public void a(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r9, xyz.adscope.ad.e.a r10, boolean r11) {
                r8 = this;
                if (r9 == 0) goto L59
                xyz.adscope.ad.m r10 = r8.a
                xyz.adscope.common.analyse.publish.IEventAnalyser r10 = xyz.adscope.ad.m.a(r10)
                xyz.adscope.ad.m r11 = r8.a
                java.util.List r11 = xyz.adscope.ad.m.a(r11, r9)
                java.lang.String r0 = r9.d()
                r10.initializeQueueLinked(r11, r0)
                xyz.adscope.ad.m r10 = r8.a
                xyz.adscope.ad.m.b(r10, r9)
                xyz.adscope.ad.m r10 = r8.a
                xyz.adscope.ad.m.c(r10, r9)
                xyz.adscope.ad.m r10 = r8.a
                java.lang.String r9 = r9.d()
                xyz.adscope.ad.m.a(r10, r9)
                xyz.adscope.ad.m r0 = r8.a
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
                r1 = 30
                r3 = 300(0x12c, double:1.48E-321)
                r0.a(r1, r3, r5)
                xyz.adscope.ad.m r9 = r8.a
                java.lang.String r10 = "aa2623c4a099eaa875162146c8a9e483"
                boolean r9 = xyz.adscope.ad.m.b(r9, r10)
                if (r9 == 0) goto L59
                xyz.adscope.ad.m r9 = r8.a
                xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r9 = xyz.adscope.ad.m.b(r9)
                if (r9 == 0) goto L59
                xyz.adscope.ad.m r9 = r8.a
                xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r1 = xyz.adscope.ad.m.b(r9)
                xyz.adscope.ad.m r9 = r8.a
                java.lang.String r7 = xyz.adscope.ad.m.c(r9)
                r2 = 30
                r6 = r5
                r4 = 300(0x12c, double:1.48E-321)
                r1.scheduleHistoryEvent(r2, r4, r6, r7)
            L59:
                return
        }
    }

    m(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            r1.a = r0
            xyz.adscope.common.analyse.publish.CommonAnalyserManager r0 = xyz.adscope.common.analyse.publish.CommonAnalyserManager.getInstance()
            java.lang.Object r0 = r0.getOrCreateImplement(r2)
            xyz.adscope.common.analyse.publish.IEventAnalyser r0 = (xyz.adscope.common.analyse.publish.IEventAnalyser) r0
            r1.b = r0
            xyz.adscope.common.analyse2.publish.ScopeEventAnalyserManager r0 = xyz.adscope.common.analyse2.publish.ScopeEventAnalyserManager.getInstance()
            java.lang.Object r0 = r0.getOrCreateImplement(r2)
            xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r0 = (xyz.adscope.common.analyse2.publish.IScopeEventAnalyser) r0
            r1.c = r0
            xyz.adscope.common.v2.beta.BetaTestManager r0 = xyz.adscope.common.v2.beta.BetaTestManager.getInstance()
            java.lang.Object r2 = r0.getOrCreateImplement(r2)
            xyz.adscope.common.v2.beta.IBetaTest r2 = (xyz.adscope.common.v2.beta.IBetaTest) r2
            r1.d = r2
            return
    }

    static /* synthetic */ java.util.List a(xyz.adscope.ad.m r0, xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r1) {
            java.util.List r0 = r0.b(r1)
            return r0
    }

    static /* synthetic */ xyz.adscope.common.analyse.publish.IEventAnalyser a(xyz.adscope.ad.m r0) {
            xyz.adscope.common.analyse.publish.IEventAnalyser r0 = r0.b
            return r0
    }

    private /* synthetic */ void a(java.lang.String r7) {
            r6 = this;
            android.content.Context r0 = r6.a
            java.util.List r0 = xyz.adscope.ad.g.b(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "上报历史崩溃日志..."
            r1.append(r2)
            if (r0 == 0) goto L1b
            int r2 = r0.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L1d
        L1b:
            java.lang.String r2 = " null "
        L1d:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ASNPEvertReporter"
            xyz.adscope.common.v2.log.SDKLog.d(r2, r1)
            if (r0 == 0) goto Lc0
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Lc0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L3a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L52
            java.lang.Object r3 = r2.next()
            xyz.adscope.ad.m1 r3 = (xyz.adscope.ad.m1) r3
            android.content.Context r4 = r6.a
            xyz.adscope.ad.n1 r5 = xyz.adscope.ad.n1.t
            xyz.adscope.common.analyse.model.IBaseEventReportModel r3 = xyz.adscope.ad.d0.a(r4, r5, r3)
            r1.add(r3)
            goto L3a
        L52:
            r6.a(r1, r7)
            java.lang.String r7 = "aa2623c4a099eaa875162146c8a9e483"
            boolean r7 = r6.c(r7)
            if (r7 == 0) goto Lc0
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto Lc0
            org.json.JSONArray r7 = xyz.adscope.common.v2.tool.json.JsonUtil.emptyJSONArray()
            java.util.Iterator r0 = r0.iterator()
        L6b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lab
            java.lang.Object r1 = r0.next()
            xyz.adscope.ad.m1 r1 = (xyz.adscope.ad.m1) r1
            org.json.JSONObject r2 = xyz.adscope.common.v2.tool.json.JsonUtil.emptyJSONObject()
            java.lang.String r3 = r1.a()
            java.lang.String r4 = "affiliated"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r2, r4, r3)
            java.lang.String r3 = r1.b()
            java.lang.String r4 = "exception"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r2, r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            long r4 = r1.c()
            r3.append(r4)
            java.lang.String r1 = ""
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "time"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r2, r3, r1)
            r7.put(r2)
            goto L6b
        Lab:
            xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r0 = r6.c
            if (r0 == 0) goto Lc0
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = xyz.adscope.common.v2.encrypt.impl.Base64Util.encodeToString(r7)
            java.lang.String r1 = r6.e
            java.lang.String r2 = xyz.adscope.ad.f0.e()
            r0.reportCrash(r7, r1, r2)
        Lc0:
            return
    }

    private void a(java.util.List<xyz.adscope.common.analyse.model.IBaseEventReportModel> r2, java.lang.String r3) {
            r1 = this;
            xyz.adscope.common.analyse.publish.IEventAnalyser r0 = r1.b
            if (r0 == 0) goto L7
            r0.reportCrashEvent(r2, r3)
        L7:
            return
    }

    static /* synthetic */ void a(xyz.adscope.ad.m r0, java.lang.String r1) {
            r0.b(r1)
            return
    }

    public static /* synthetic */ void a(xyz.adscope.ad.m r0, xyz.adscope.ad.n1 r1, xyz.adscope.ad.j4 r2) {
            r0.b(r1, r2)
            return
    }

    private void a(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r6) {
            r5 = this;
            r5.d(r6)
            java.lang.String r0 = "aa2623c4a099eaa875162146c8a9e483"
            boolean r0 = r5.c(r0)
            if (r0 == 0) goto Lb8
            xyz.adscope.ad.f r0 = xyz.adscope.ad.f.a()
            android.content.Context r1 = r5.a
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.ad.e r0 = (xyz.adscope.ad.e) r0
            if (r0 == 0) goto Lb8
            xyz.adscope.ad.publish.ASNPInitConfig r1 = r0.a()
            xyz.adscope.ad.j4 r0 = r0.b()
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.NullPointerException -> Lb4
            java.lang.String r0 = r0.f()     // Catch: java.lang.NullPointerException -> Lb4
            java.lang.String r2 = r1.getAppId()     // Catch: java.lang.NullPointerException -> Lb4
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.NullPointerException -> Lb4
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.NullPointerException -> Lb4
            if (r3 != 0) goto Lb8
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.NullPointerException -> Lb4
            if (r3 != 0) goto Lb8
            org.json.JSONObject r3 = xyz.adscope.common.v2.tool.json.JsonUtil.emptyJSONObject()     // Catch: java.lang.NullPointerException -> Lb4
            java.lang.String r4 = "start_id"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r3, r4, r0)     // Catch: java.lang.NullPointerException -> Lb4
            java.lang.String r0 = "app_id"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r3, r0, r2)     // Catch: java.lang.NullPointerException -> Lb4
            java.lang.String r0 = "custom_id"
            java.lang.String r2 = xyz.adscope.ad.f0.e()     // Catch: java.lang.NullPointerException -> Lb4
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r3, r0, r2)     // Catch: java.lang.NullPointerException -> Lb4
            org.json.JSONObject r0 = xyz.adscope.common.v2.tool.json.JsonUtil.emptyJSONObject()     // Catch: java.lang.NullPointerException -> Lb4
            java.lang.String r2 = "user_id"
            java.lang.String r4 = r1.getUserId()     // Catch: java.lang.NullPointerException -> Lb4
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r0, r2, r4)     // Catch: java.lang.NullPointerException -> Lb4
            java.lang.String r2 = "user_custom_data"
            java.lang.String r4 = r1.getOptionInfoJson()     // Catch: java.lang.NullPointerException -> Lb4
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r0, r2, r4)     // Catch: java.lang.NullPointerException -> Lb4
            java.lang.String r2 = "lmt"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NullPointerException -> Lb4
            r4.<init>()     // Catch: java.lang.NullPointerException -> Lb4
            boolean r1 = r1.canUseOAIDInfo()     // Catch: java.lang.NullPointerException -> Lb4
            r4.append(r1)     // Catch: java.lang.NullPointerException -> Lb4
            java.lang.String r1 = ""
            r4.append(r1)     // Catch: java.lang.NullPointerException -> Lb4
            java.lang.String r1 = r4.toString()     // Catch: java.lang.NullPointerException -> Lb4
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r0, r2, r1)     // Catch: java.lang.NullPointerException -> Lb4
            org.json.JSONObject r1 = xyz.adscope.common.v2.tool.json.JsonUtil.emptyJSONObject()     // Catch: java.lang.NullPointerException -> Lb4
            java.lang.String r2 = "version"
            java.lang.String r4 = xyz.adscope.ad.f0.c()     // Catch: java.lang.NullPointerException -> Lb4
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r1, r2, r4)     // Catch: java.lang.NullPointerException -> Lb4
            java.lang.String r2 = "user"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r3, r2, r0)     // Catch: java.lang.NullPointerException -> Lb4
            java.lang.String r0 = "sdk"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r3, r0, r1)     // Catch: java.lang.NullPointerException -> Lb4
            java.lang.String r0 = "logStrategy"
            xyz.adscope.ad.model.impl.resp.cfg.root.log2.Analyse2ConfigModel r6 = r6.b()     // Catch: java.lang.NullPointerException -> Lb4
            org.json.JSONObject r6 = r6.asJsonObject()     // Catch: java.lang.NullPointerException -> Lb4
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r3, r0, r6)     // Catch: java.lang.NullPointerException -> Lb4
            java.lang.String r6 = r3.toString()     // Catch: java.lang.NullPointerException -> Lb4
            java.lang.String r6 = xyz.adscope.common.v2.encrypt.impl.Base64Util.encodeToString(r6)     // Catch: java.lang.NullPointerException -> Lb4
            xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r0 = r5.c     // Catch: java.lang.NullPointerException -> Lb4
            r0.initializeAnalyse(r6)     // Catch: java.lang.NullPointerException -> Lb4
            return
        Lb4:
            r6 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r6)
        Lb8:
            return
    }

    private java.util.List<xyz.adscope.common.analyse.publish.IEventConfigModel> b(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r2) {
            r1 = this;
            if (r2 == 0) goto L1e
            xyz.adscope.ad.model.impl.resp.cfg.root.statistics.StatisticsModel r0 = r2.h()
            if (r0 == 0) goto L1e
            xyz.adscope.ad.model.impl.resp.cfg.root.statistics.StatisticsModel r2 = r2.h()
            java.util.List r2 = r2.a()
            if (r2 == 0) goto L1e
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L1e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            return r0
        L1e:
            r2 = 0
            return r2
    }

    static /* synthetic */ xyz.adscope.common.analyse2.publish.IScopeEventAnalyser b(xyz.adscope.ad.m r0) {
            xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r0 = r0.c
            return r0
    }

    private void b(java.lang.String r3) {
            r2 = this;
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            android.content.Context r1 = r2.a
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r0
            xyz.adscope.ad.m7 r1 = new xyz.adscope.ad.m7
            r1.<init>(r2, r3)
            r0.executeBasicAsyncTask(r1)
            return
    }

    static /* synthetic */ void b(xyz.adscope.ad.m r0, xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r1) {
            r0.c(r1)
            return
    }

    public static /* synthetic */ void b(xyz.adscope.ad.m r0, xyz.adscope.ad.n1 r1, xyz.adscope.ad.b1 r2) {
            r0.b(r1, r2)
            return
    }

    private /* synthetic */ void b(xyz.adscope.ad.n1 r4, xyz.adscope.ad.b1 r5) {
            r3 = this;
            android.content.Context r0 = r3.a
            xyz.adscope.common.analyse.model.IBaseEventReportModel r4 = xyz.adscope.ad.d0.a(r0, r4, r5)
            xyz.adscope.common.analyse.publish.IEventAnalyser r0 = r3.b
            java.lang.String r5 = r5.r()
            r0.reportRealtimeEvent(r4, r5)
            java.lang.String r5 = "aa2623c4a099eaa875162146c8a9e483"
            boolean r5 = r3.c(r5)
            if (r5 == 0) goto L11d
            xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r5 = r3.c
            if (r5 == 0) goto L11d
            java.util.Map r4 = r4.getMacrosReplaceMap()
            if (r4 == 0) goto L11d
            org.json.JSONObject r5 = xyz.adscope.common.v2.tool.json.JsonUtil.emptyJSONObject()
            java.lang.String r0 = "__EVENT_ID__"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r1 = "event_id"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r5, r1, r0)
            java.lang.String r0 = "__EVENT_CODE__"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r1 = "event_code"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r5, r1, r0)
            java.lang.String r0 = "__EVENT_TIME__"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r1 = "event_time"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r5, r1, r0)
            java.lang.String r0 = "__COST_TIME__"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r1 = "cost_time"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r5, r1, r0)
            java.lang.String r0 = "__AD_ERROR_CODE__"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r1 = "error_code"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r5, r1, r0)
            java.lang.String r0 = "__AD_ERROR_INFO__"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r1 = "error_info"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r5, r1, r0)
            java.lang.String r0 = "__DSP_ID__"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r1 = "dsp_id"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r5, r1, r0)
            java.lang.String r0 = "__ORDER_ID__"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r1 = "order_id"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r5, r1, r0)
            java.lang.String r0 = "__CREATIVE_ID__"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r1 = "creative_id"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r5, r1, r0)
            java.lang.String r0 = "__MATERIAL_ID__"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r1 = "material_id"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r5, r1, r0)
            java.lang.String r0 = "__ADN_RENDER_ID__"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r1 = "scheme_id"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r5, r1, r0)
            java.lang.String r0 = "__CLICK_TYPE__"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r1 = "click_type"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r5, r1, r0)
            java.lang.String r0 = "__PRICE__"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r1 = "ecpm"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r5, r1, r0)
            org.json.JSONObject r0 = xyz.adscope.common.v2.tool.json.JsonUtil.emptyJSONObject()
            java.lang.String r1 = "__SPACE_ID__"
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r2 = "space_id"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r0, r2, r1)
            java.lang.String r1 = "__SESSION_ID__"
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r2 = "session_id"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r0, r2, r1)
            java.lang.String r1 = "__AD_TYPE__"
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r2 = "ad_type"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r0, r2, r1)
            java.lang.String r1 = "__CURRENCY__"
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r2 = "currency"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r0, r2, r1)
            java.lang.String r1 = "__USER_CUSTOM_DATA__"
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r2 = "custom_data"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r0, r2, r1)
            java.lang.String r1 = "__MAX_WAIT_TIME__"
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r2 = "time_out"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r0, r2, r1)
            java.lang.String r1 = "__QUANTITY__"
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r1 = "quantity"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r0, r1, r4)
            java.lang.String r4 = "asnp"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r5, r4, r0)
            java.lang.String r4 = r5.toString()
            java.lang.String r4 = xyz.adscope.common.v2.encrypt.impl.Base64Util.encodeToString(r4)
            xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r5 = r3.c
            java.lang.String r0 = r3.e
            java.lang.String r1 = xyz.adscope.ad.f0.e()
            r5.reportEvent(r4, r0, r1)
        L11d:
            return
    }

    private /* synthetic */ void b(xyz.adscope.ad.n1 r3, xyz.adscope.ad.j4 r4) {
            r2 = this;
            android.content.Context r0 = r2.a
            xyz.adscope.common.analyse.model.IBaseEventReportModel r3 = xyz.adscope.ad.d0.a(r0, r3, r4)
            xyz.adscope.common.analyse.publish.IEventAnalyser r0 = r2.b
            java.lang.String r4 = r4.d()
            r0.reportRealtimeEvent(r3, r4)
            java.lang.String r4 = "aa2623c4a099eaa875162146c8a9e483"
            boolean r4 = r2.c(r4)
            if (r4 == 0) goto L7a
            xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r4 = r2.c
            if (r4 == 0) goto L7a
            java.util.Map r3 = r3.getMacrosReplaceMap()
            if (r3 == 0) goto L7a
            org.json.JSONObject r4 = xyz.adscope.common.v2.tool.json.JsonUtil.emptyJSONObject()
            java.lang.String r0 = "__EVENT_ID__"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r1 = "event_id"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r4, r1, r0)
            java.lang.String r0 = "__EVENT_CODE__"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r1 = "event_code"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r4, r1, r0)
            java.lang.String r0 = "__EVENT_TIME__"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r1 = "event_time"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r4, r1, r0)
            java.lang.String r0 = "__COST_TIME__"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r1 = "cost_time"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r4, r1, r0)
            java.lang.String r0 = "__AD_ERROR_CODE__"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r1 = "error_code"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r4, r1, r0)
            java.lang.String r0 = "__AD_ERROR_INFO__"
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r0 = "error_info"
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r4, r0, r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r3 = xyz.adscope.common.v2.encrypt.impl.Base64Util.encodeToString(r3)
            xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r4 = r2.c
            java.lang.String r0 = r2.e
            java.lang.String r1 = xyz.adscope.ad.f0.e()
            r4.reportEvent(r3, r0, r1)
        L7a:
            return
    }

    static /* synthetic */ boolean b(xyz.adscope.ad.m r0, java.lang.String r1) {
            boolean r0 = r0.c(r1)
            return r0
    }

    static /* synthetic */ java.lang.String c(xyz.adscope.ad.m r0) {
            java.lang.String r0 = r0.e
            return r0
    }

    public static /* synthetic */ void c(xyz.adscope.ad.m r0, java.lang.String r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ void c(xyz.adscope.ad.m r0, xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r1) {
            r0.a(r1)
            return
    }

    private void c(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r2) {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.cfg.root.beta.BetaTestPlanModel r2 = r2.c()
            if (r2 == 0) goto Lb
            xyz.adscope.common.v2.beta.IBetaTest r0 = r1.d
            r0.initBetaConfig(r2)
        Lb:
            return
    }

    private boolean c(java.lang.String r4) {
            r3 = this;
            xyz.adscope.common.v2.beta.IBetaTest r0 = r3.d
            if (r0 == 0) goto Lf
            java.lang.String r1 = xyz.adscope.ad.f0.e()
            r2 = 8
            boolean r4 = r0.invokeBetaTest(r4, r1, r2)
            return r4
        Lf:
            r4 = 0
            return r4
    }

    private void d(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r1) {
            r0 = this;
            xyz.adscope.ad.model.impl.resp.cfg.root.log2.Analyse2ConfigModel r1 = r1.b()
            if (r1 == 0) goto Lc
            java.lang.String r1 = r1.a()
            r0.e = r1
        Lc:
            return
    }

    @Override // xyz.adscope.ad.s1
    public void a() {
            r2 = this;
            xyz.adscope.ad.f r0 = xyz.adscope.ad.f.a()
            android.content.Context r1 = r2.a
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.ad.e r0 = (xyz.adscope.ad.e) r0
            xyz.adscope.ad.m$a r1 = new xyz.adscope.ad.m$a
            r1.<init>(r2)
            r0.a(r1)
            return
    }

    public void a(long r7, long r9, java.util.concurrent.TimeUnit r11) {
            r6 = this;
            xyz.adscope.common.analyse.publish.IEventAnalyser r0 = r6.b
            if (r0 == 0) goto La
            r1 = r7
            r3 = r9
            r5 = r11
            r0.scheduleHistoryEvent(r1, r3, r5)
        La:
            return
    }

    @Override // xyz.adscope.ad.s1
    public void a(xyz.adscope.ad.n1 r3, xyz.adscope.ad.b1 r4) {
            r2 = this;
            xyz.adscope.common.analyse.publish.IEventAnalyser r0 = r2.b
            if (r0 == 0) goto L18
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            android.content.Context r1 = r2.a
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r0
            xyz.adscope.ad.l7 r1 = new xyz.adscope.ad.l7
            r1.<init>(r2, r3, r4)
            r0.executeBasicAsyncTask(r1)
        L18:
            return
    }

    @Override // xyz.adscope.ad.s1
    public void a(xyz.adscope.ad.n1 r3, xyz.adscope.ad.j4 r4) {
            r2 = this;
            xyz.adscope.common.analyse.publish.IEventAnalyser r0 = r2.b
            if (r0 == 0) goto L18
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            android.content.Context r1 = r2.a
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r0
            xyz.adscope.ad.n7 r1 = new xyz.adscope.ad.n7
            r1.<init>(r2, r3, r4)
            r0.executeBasicAsyncTask(r1)
        L18:
            return
    }
}
