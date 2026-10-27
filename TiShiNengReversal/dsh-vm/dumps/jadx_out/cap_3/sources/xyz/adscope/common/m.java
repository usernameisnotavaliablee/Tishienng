package xyz.adscope.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
final class m implements xyz.adscope.common.analyse2.publish.IScopeEventAnalyser {
    private final xyz.adscope.common.h a;
    private final java.util.Map<java.lang.String, xyz.adscope.common.g> b;
    private final java.util.Map<java.lang.String, xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel> c;
    private final android.content.Context d;
    private final xyz.adscope.common.v2.persistent.db.IBaseDBOperator e;
    private xyz.adscope.common.m.c f;
    private xyz.adscope.common.analyse2.publish.IScopeAnalyserUpdater g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a implements xyz.adscope.common.f.c {
        final /* synthetic */ xyz.adscope.common.m a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: xyz.adscope.common.m$a$a, reason: collision with other inner class name */
        class C0072a implements xyz.adscope.common.i.b {
            final /* synthetic */ xyz.adscope.common.m.a a;

            C0072a(xyz.adscope.common.m.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // xyz.adscope.common.i.b
            public void a() {
                    r1 = this;
                    xyz.adscope.common.m$a r0 = r1.a
                    xyz.adscope.common.m r0 = r0.a
                    xyz.adscope.common.analyse2.publish.IScopeAnalyserUpdater r0 = xyz.adscope.common.m.d(r0)
                    if (r0 == 0) goto L15
                    xyz.adscope.common.m$a r0 = r1.a
                    xyz.adscope.common.m r0 = r0.a
                    xyz.adscope.common.analyse2.publish.IScopeAnalyserUpdater r0 = xyz.adscope.common.m.d(r0)
                    r0.requireUpdate()
                L15:
                    return
            }
        }

        private a(xyz.adscope.common.m r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ a(xyz.adscope.common.m r1, xyz.adscope.common.m.b r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // xyz.adscope.common.f.c
        public void a(java.util.List<xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog> r6, xyz.adscope.common.analyse2.base.model.init.AnalyseEventModel r7, java.lang.String r8, java.lang.String r9) {
                r5 = this;
                xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
                xyz.adscope.common.m r1 = r5.a
                android.content.Context r1 = xyz.adscope.common.m.a(r1)
                java.lang.Object r0 = r0.getOrCreateImplement(r1)
                xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r0
                xyz.adscope.common.i r1 = new xyz.adscope.common.i
                xyz.adscope.common.m r2 = r5.a
                android.content.Context r2 = xyz.adscope.common.m.a(r2)
                xyz.adscope.common.m r3 = r5.a
                xyz.adscope.common.v2.persistent.db.IBaseDBOperator r3 = xyz.adscope.common.m.b(r3)
                xyz.adscope.common.m r4 = r5.a
                xyz.adscope.common.h r4 = xyz.adscope.common.m.c(r4)
                r1.<init>(r2, r3, r4)
                java.lang.String r2 = r7.g()
                java.util.List r7 = r7.c()
                r1.a(r2, r9, r7, r8)
                r1.c(r6)
                xyz.adscope.common.m$a$a r6 = new xyz.adscope.common.m$a$a
                r6.<init>(r5)
                r1.a(r6)
                r0.executeAnalyseAsyncTask(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class b {
        public b() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c extends xyz.adscope.common.v2.thread.pool.IRemoveAbleScheduledTask {
        public c(java.lang.Runnable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void a() {
                r0 = this;
                r0.stopScheduled()
                return
        }

        private void a(long r1, long r3, java.util.concurrent.TimeUnit r5) {
                r0 = this;
                r0.startScheduled(r1, r3, r5)
                return
        }

        static /* synthetic */ void a(xyz.adscope.common.m.c r0) {
                r0.a()
                return
        }

        static /* synthetic */ void a(xyz.adscope.common.m.c r0, long r1, long r3, java.util.concurrent.TimeUnit r5) {
                r0.a(r1, r3, r5)
                return
        }
    }

    m(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.d = r2
            xyz.adscope.common.e r0 = new xyz.adscope.common.e
            r0.<init>(r2)
            r1.e = r0
            xyz.adscope.common.h r0 = new xyz.adscope.common.h
            r0.<init>(r2)
            r1.a = r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.b = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.c = r2
            return
    }

    static /* synthetic */ android.content.Context a(xyz.adscope.common.m r0) {
            android.content.Context r0 = r0.d
            return r0
    }

    static /* synthetic */ xyz.adscope.common.v2.persistent.db.IBaseDBOperator b(xyz.adscope.common.m r0) {
            xyz.adscope.common.v2.persistent.db.IBaseDBOperator r0 = r0.e
            return r0
    }

    static /* synthetic */ xyz.adscope.common.h c(xyz.adscope.common.m r0) {
            xyz.adscope.common.h r0 = r0.a
            return r0
    }

    static /* synthetic */ xyz.adscope.common.analyse2.publish.IScopeAnalyserUpdater d(xyz.adscope.common.m r0) {
            xyz.adscope.common.analyse2.publish.IScopeAnalyserUpdater r0 = r0.g
            return r0
    }

    org.json.JSONObject a(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1f
            java.util.Map<java.lang.String, xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel> r0 = r1.c
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L1f
            java.util.Map<java.lang.String, xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel> r0 = r1.c
            java.lang.Object r2 = r0.get(r2)
            xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel r2 = (xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel) r2
            if (r2 == 0) goto L1f
            android.content.Context r0 = r1.d
            org.json.JSONObject r2 = r2.a(r0)
            return r2
        L1f:
            r2 = 0
            return r2
    }

    @Override // xyz.adscope.common.analyse2.publish.IScopeEventAnalyser
    public void initializeAnalyse(java.lang.String r9) {
            r8 = this;
            java.lang.Class<xyz.adscope.common.m> r1 = xyz.adscope.common.m.class
            monitor-enter(r1)
            java.lang.String r9 = xyz.adscope.common.v2.encrypt.impl.Base64Util.decodeToString(r9)     // Catch: java.lang.Throwable -> L74
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L77
            xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel r0 = new xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel     // Catch: java.lang.Throwable -> L74
            org.json.JSONObject r9 = xyz.adscope.common.v2.tool.json.JsonUtil.parseJSONObject(r9)     // Catch: java.lang.Throwable -> L74
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L74
            boolean r9 = r0.hasParseException()     // Catch: java.lang.Throwable -> L74
            if (r9 != 0) goto L77
            xyz.adscope.common.analyse2.base.model.init.AnalyseLogStrategyModel r9 = r0.c()     // Catch: java.lang.Throwable -> L74
            if (r9 == 0) goto L77
            java.lang.String r3 = r9.f()     // Catch: java.lang.Throwable -> L74
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L74
            if (r2 != 0) goto L77
            java.util.Map<java.lang.String, xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel> r2 = r8.c     // Catch: java.lang.Throwable -> L74
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L74
            java.util.List r6 = r9.e()     // Catch: java.lang.Throwable -> L74
            if (r6 == 0) goto L77
            boolean r2 = r6.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r2 != 0) goto L77
            java.util.Map<java.lang.String, xyz.adscope.common.g> r2 = r8.b     // Catch: java.lang.Throwable -> L74
            boolean r2 = r2.containsKey(r3)     // Catch: java.lang.Throwable -> L74
            if (r2 != 0) goto L77
            xyz.adscope.common.m$a r7 = new xyz.adscope.common.m$a     // Catch: java.lang.Throwable -> L74
            r2 = 0
            r7.<init>(r8, r2)     // Catch: java.lang.Throwable -> L74
            xyz.adscope.common.g r2 = new xyz.adscope.common.g     // Catch: java.lang.Throwable -> L74
            java.lang.String r4 = r9.b()     // Catch: java.lang.Throwable -> L74
            java.lang.String r5 = r0.b()     // Catch: java.lang.Throwable -> L74
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L74
            java.lang.String r9 = "EventLoggerImpl2"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r0.<init>()     // Catch: java.lang.Throwable -> L74
            java.lang.String r4 = "记录上报队列 tag: "
            r0.append(r4)     // Catch: java.lang.Throwable -> L74
            r0.append(r3)     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L74
            xyz.adscope.common.v2.log.SDKLog.d(r9, r0)     // Catch: java.lang.Throwable -> L74
            java.util.Map<java.lang.String, xyz.adscope.common.g> r9 = r8.b     // Catch: java.lang.Throwable -> L74
            r9.put(r3, r2)     // Catch: java.lang.Throwable -> L74
            goto L77
        L74:
            r0 = move-exception
            r9 = r0
            goto L79
        L77:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L74
            return
        L79:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L74
            throw r9
    }

    @Override // xyz.adscope.common.analyse2.publish.IScopeEventAnalyser
    public void registerAnalyseUpdate(xyz.adscope.common.analyse2.publish.IScopeAnalyserUpdater r1) {
            r0 = this;
            r0.g = r1
            return
    }

    @Override // xyz.adscope.common.analyse2.publish.IScopeEventAnalyser
    public void reportCrash(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r8 = this;
            java.lang.Class<xyz.adscope.common.m> r11 = xyz.adscope.common.m.class
            monitor-enter(r11)
            java.lang.String r9 = xyz.adscope.common.v2.encrypt.impl.Base64Util.decodeToString(r9)     // Catch: java.lang.Throwable -> L42
            org.json.JSONArray r9 = xyz.adscope.common.v2.tool.json.JsonUtil.parseJSONArray(r9)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L9e
            int r0 = r9.length()     // Catch: java.lang.Throwable -> L42
            if (r0 <= 0) goto L9e
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L42
            r0.<init>()     // Catch: java.lang.Throwable -> L42
            r1 = 0
        L19:
            int r2 = r9.length()     // Catch: java.lang.Throwable -> L42
            if (r1 >= r2) goto L4b
            org.json.JSONObject r2 = r9.getJSONObject(r1)     // Catch: java.lang.Throwable -> L42 org.json.JSONException -> L44
            java.lang.String r3 = "affiliated"
            java.lang.String r3 = xyz.adscope.common.v2.tool.json.JsonUtil.getStringFromJson(r2, r3)     // Catch: java.lang.Throwable -> L42 org.json.JSONException -> L44
            java.lang.String r4 = "exception"
            java.lang.String r4 = xyz.adscope.common.v2.tool.json.JsonUtil.getStringFromJson(r2, r4)     // Catch: java.lang.Throwable -> L42 org.json.JSONException -> L44
            java.lang.String r5 = "time"
            java.lang.String r2 = xyz.adscope.common.v2.tool.json.JsonUtil.getStringFromJson(r2, r5)     // Catch: java.lang.Throwable -> L42 org.json.JSONException -> L44
            xyz.adscope.common.v2.crash.ScopeCrashLog r5 = new xyz.adscope.common.v2.crash.ScopeCrashLog     // Catch: java.lang.Throwable -> L42 org.json.JSONException -> L44
            long r6 = xyz.adscope.common.v2.tool.str.StringUtil.parseLong(r2)     // Catch: java.lang.Throwable -> L42 org.json.JSONException -> L44
            r5.<init>(r3, r4, r6)     // Catch: java.lang.Throwable -> L42 org.json.JSONException -> L44
            r0.add(r5)     // Catch: java.lang.Throwable -> L42 org.json.JSONException -> L44
            goto L48
        L42:
            r9 = move-exception
            goto La0
        L44:
            r2 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r2)     // Catch: java.lang.Throwable -> L42
        L48:
            int r1 = r1 + 1
            goto L19
        L4b:
            java.util.Map<java.lang.String, xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel> r9 = r8.c     // Catch: java.lang.Throwable -> L42
            boolean r9 = r9.containsKey(r10)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L9e
            java.util.Map<java.lang.String, xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel> r9 = r8.c     // Catch: java.lang.Throwable -> L42
            java.lang.Object r9 = r9.get(r10)     // Catch: java.lang.Throwable -> L42
            xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel r9 = (xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel) r9     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L9e
            xyz.adscope.common.analyse2.base.model.init.AnalyseLogStrategyModel r9 = r9.c()     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L9e
            xyz.adscope.common.analyse2.base.model.init.AnalyseCrashModel r1 = r9.c()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L9e
            java.lang.String r1 = r1.b()     // Catch: java.lang.Throwable -> L42
            java.lang.String r9 = r9.b()     // Catch: java.lang.Throwable -> L42
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L9e
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L9e
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r2 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()     // Catch: java.lang.Throwable -> L42
            android.content.Context r3 = r8.d     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r2.getOrCreateImplement(r3)     // Catch: java.lang.Throwable -> L42
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r2 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r2     // Catch: java.lang.Throwable -> L42
            xyz.adscope.common.i r3 = new xyz.adscope.common.i     // Catch: java.lang.Throwable -> L42
            android.content.Context r4 = r8.d     // Catch: java.lang.Throwable -> L42
            xyz.adscope.common.v2.persistent.db.IBaseDBOperator r5 = r8.e     // Catch: java.lang.Throwable -> L42
            xyz.adscope.common.h r6 = r8.a     // Catch: java.lang.Throwable -> L42
            r3.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L42
            r4 = 0
            r3.a(r1, r9, r4, r10)     // Catch: java.lang.Throwable -> L42
            r3.a(r0)     // Catch: java.lang.Throwable -> L42
            r2.executeAnalyseAsyncTask(r3)     // Catch: java.lang.Throwable -> L42
        L9e:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L42
            return
        La0:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L42
            throw r9
    }

    @Override // xyz.adscope.common.analyse2.publish.IScopeEventAnalyser
    public void reportEvent(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.Class<xyz.adscope.common.m> r4 = xyz.adscope.common.m.class
            monitor-enter(r4)
            java.lang.String r2 = xyz.adscope.common.v2.encrypt.impl.Base64Util.decodeToString(r2)     // Catch: java.lang.Throwable -> L1b
            org.json.JSONObject r2 = xyz.adscope.common.v2.tool.json.JsonUtil.parseJSONObject(r2)     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L31
            java.lang.String r0 = "amps"
            boolean r0 = r2.has(r0)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            xyz.adscope.common.analyse2.base.model.biz.AMPSExtraLog r0 = new xyz.adscope.common.analyse2.base.model.biz.AMPSExtraLog     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1b
            goto L32
        L1b:
            r2 = move-exception
            goto L4b
        L1d:
            java.lang.String r0 = "asnp"
            boolean r0 = r2.has(r0)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L2b
            xyz.adscope.common.analyse2.base.model.biz.ASNPExtraLog r0 = new xyz.adscope.common.analyse2.base.model.biz.ASNPExtraLog     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1b
            goto L32
        L2b:
            xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog r0 = new xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1b
            goto L32
        L31:
            r0 = 0
        L32:
            if (r0 == 0) goto L49
            java.util.Map<java.lang.String, xyz.adscope.common.g> r2 = r1.b     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r2.containsKey(r3)     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L49
            java.util.Map<java.lang.String, xyz.adscope.common.g> r2 = r1.b     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L1b
            xyz.adscope.common.g r2 = (xyz.adscope.common.g) r2     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L49
            r2.a(r0)     // Catch: java.lang.Throwable -> L1b
        L49:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1b
            return
        L4b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1b
            throw r2
    }

    @Override // xyz.adscope.common.analyse2.publish.IScopeEventAnalyser
    public void scheduleHistoryEvent(long r8, long r10, java.util.concurrent.TimeUnit r12, java.lang.String r13) {
            r7 = this;
            java.lang.String r13 = "EventLoggerImpl2"
            java.lang.String r0 = "上报历史日志..."
            xyz.adscope.common.v2.log.SDKLog.d(r13, r0)
            xyz.adscope.common.m$c r13 = r7.f
            if (r13 == 0) goto Lf
            xyz.adscope.common.m.c.a(r13)
            goto L21
        Lf:
            xyz.adscope.common.b r13 = new xyz.adscope.common.b
            android.content.Context r0 = r7.d
            xyz.adscope.common.v2.persistent.db.IBaseDBOperator r1 = r7.e
            xyz.adscope.common.h r2 = r7.a
            r13.<init>(r0, r1, r2)
            xyz.adscope.common.m$c r0 = new xyz.adscope.common.m$c
            r0.<init>(r13)
            r7.f = r0
        L21:
            xyz.adscope.common.m$c r1 = r7.f
            r2 = r8
            r4 = r10
            r6 = r12
            xyz.adscope.common.m.c.a(r1, r2, r4, r6)
            return
    }
}
