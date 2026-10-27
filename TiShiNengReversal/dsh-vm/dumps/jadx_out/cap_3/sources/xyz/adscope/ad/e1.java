package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class e1 extends xyz.adscope.ad.q2 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b implements java.lang.Runnable {
        private final android.content.Context a;
        private final java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel> b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel, java.lang.Integer> {
            final /* synthetic */ xyz.adscope.ad.e1.b a;

            a(xyz.adscope.ad.e1.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public boolean a(xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel r2, java.lang.Integer r3) {
                    r1 = this;
                    r0 = 0
                    if (r2 == 0) goto Lf
                    int r2 = r2.e()
                    int r3 = r3.intValue()
                    if (r2 != r3) goto Lf
                    r2 = 1
                    return r2
                Lf:
                    return r0
            }

            @Override // xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare
            public /* bridge */ /* synthetic */ boolean fetch(xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel r1, java.lang.Integer r2) {
                    r0 = this;
                    xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel r1 = (xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel) r1
                    java.lang.Integer r2 = (java.lang.Integer) r2
                    boolean r1 = r0.a(r1, r2)
                    return r1
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: xyz.adscope.ad.e1$b$b, reason: collision with other inner class name */
        private class RunnableC0061b implements java.lang.Runnable {
            private final xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel a;
            final /* synthetic */ xyz.adscope.ad.e1.b b;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: xyz.adscope.ad.e1$b$b$a */
            class a implements xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare<xyz.adscope.ad.c1, java.lang.String> {
                final /* synthetic */ xyz.adscope.ad.e1.b.RunnableC0061b a;

                a(xyz.adscope.ad.e1.b.RunnableC0061b r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                public boolean a(xyz.adscope.ad.c1 r1, java.lang.String r2) {
                        r0 = this;
                        if (r1 == 0) goto Le
                        java.lang.String r1 = r1.b()
                        boolean r1 = r1.equals(r2)
                        if (r1 == 0) goto Le
                        r1 = 1
                        return r1
                    Le:
                        r1 = 0
                        return r1
                }

                @Override // xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare
                public /* bridge */ /* synthetic */ boolean fetch(xyz.adscope.ad.c1 r1, java.lang.String r2) {
                        r0 = this;
                        xyz.adscope.ad.c1 r1 = (xyz.adscope.ad.c1) r1
                        java.lang.String r2 = (java.lang.String) r2
                        boolean r1 = r0.a(r1, r2)
                        return r1
                }
            }

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: xyz.adscope.ad.e1$b$b$b, reason: collision with other inner class name */
            class C0062b implements xyz.adscope.common.v2.conn.IBaseHttpResponseCallback {
                final /* synthetic */ xyz.adscope.ad.e1.b.RunnableC0061b a;

                C0062b(xyz.adscope.ad.e1.b.RunnableC0061b r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // xyz.adscope.common.v2.conn.IBaseHttpResponseCallback
                public void failCallback(xyz.adscope.common.v2.conn.IHttpRequestError r1) {
                        r0 = this;
                        return
                }

                @Override // xyz.adscope.common.v2.conn.IBaseHttpResponseCallback
                public void successCallback(xyz.adscope.common.v2.conn.IBaseHttpResponse r1) {
                        r0 = this;
                        return
                }
            }

            private RunnableC0061b(xyz.adscope.ad.e1.b r1, xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel r2) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>()
                    r0.a = r2
                    return
            }

            /* synthetic */ RunnableC0061b(xyz.adscope.ad.e1.b r1, xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel r2, xyz.adscope.ad.e1.a r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            private java.util.List<xyz.adscope.ad.c1> a(java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.pkg.PkgModel> r6, java.util.List<xyz.adscope.ad.c1> r7) {
                    r5 = this;
                    if (r6 == 0) goto L57
                    boolean r0 = r6.isEmpty()
                    if (r0 != 0) goto L57
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.Iterator r6 = r6.iterator()
                L11:
                    boolean r1 = r6.hasNext()
                    if (r1 == 0) goto L56
                    java.lang.Object r1 = r6.next()
                    xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.pkg.PkgModel r1 = (xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.pkg.PkgModel) r1
                    java.lang.String r2 = r1.b()
                    xyz.adscope.ad.e1$b$b$a r3 = new xyz.adscope.ad.e1$b$b$a
                    r3.<init>(r5)
                    java.lang.Object r2 = xyz.adscope.common.v2.tool.collection.CollectionFetch.fetchFirstFromList(r7, r2, r3)
                    xyz.adscope.ad.c1 r2 = (xyz.adscope.ad.c1) r2
                    if (r2 != 0) goto L52
                    xyz.adscope.ad.c1 r2 = new xyz.adscope.ad.c1
                    r2.<init>()
                    java.lang.String r3 = r1.b()
                    r2.a(r3)
                    long r3 = java.lang.System.currentTimeMillis()
                    r2.a(r3)
                    xyz.adscope.ad.e1$b r3 = r5.b
                    android.content.Context r3 = xyz.adscope.ad.e1.b.b(r3)
                    java.lang.String r1 = r1.a()
                    boolean r1 = xyz.adscope.common.v2.dev.info.PackageUtil.isInstall(r3, r1)
                    r2.a(r1)
                L52:
                    r0.add(r2)
                    goto L11
                L56:
                    return r0
                L57:
                    r6 = 0
                    return r6
            }

            private void a(java.util.List<xyz.adscope.ad.c1> r5) {
                    r4 = this;
                    java.util.Set r0 = xyz.adscope.common.v2.tool.str.StringUtil.jsonMappingListToStringSet(r5)
                    xyz.adscope.ad.e1$b r1 = r4.b
                    android.content.Context r1 = xyz.adscope.ad.e1.b.b(r1)
                    java.lang.String r2 = xyz.adscope.ad.i0.a()
                    java.lang.String r3 = "appInstall"
                    xyz.adscope.ad.i0.a(r1, r2, r3, r0)
                    xyz.adscope.ad.k r0 = xyz.adscope.ad.k.a()
                    xyz.adscope.ad.e1$b r1 = r4.b
                    android.content.Context r1 = xyz.adscope.ad.e1.b.b(r1)
                    java.lang.Object r0 = r0.getOrCreateImplement(r1)
                    xyz.adscope.ad.j r0 = (xyz.adscope.ad.j) r0
                    r0.a(r5)
                    return
            }

            private void a(xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel r5, java.util.List<xyz.adscope.ad.c1> r6) {
                    r4 = this;
                    if (r6 == 0) goto L70
                    boolean r0 = r6.isEmpty()
                    if (r0 != 0) goto L70
                    java.lang.String r0 = "[]"
                    java.lang.String r6 = xyz.adscope.common.v2.tool.str.StringUtil.jsonMappingListToString(r6, r0)
                    java.lang.String r6 = xyz.adscope.common.v2.tool.str.StringUtil.escapeJsonAsString(r6)
                    xyz.adscope.ad.e1$b r0 = r4.b
                    android.content.Context r0 = xyz.adscope.ad.e1.b.b(r0)
                    xyz.adscope.ad.n1 r1 = xyz.adscope.ad.n1.s
                    xyz.adscope.common.analyse.model.IBaseEventReportModel r6 = xyz.adscope.ad.d0.a(r0, r1, r6)
                    java.lang.String r0 = r5.getMacros()
                    boolean r1 = android.text.TextUtils.isEmpty(r0)
                    if (r1 != 0) goto L31
                    java.util.Map r6 = r6.getMacrosReplaceMap()
                    java.lang.String r6 = xyz.adscope.common.v2.tool.str.RegexUtil.replaceMacros(r0, r6)
                    goto L33
                L31:
                    java.lang.String r6 = ""
                L33:
                    xyz.adscope.common.v2.encrypt.LinkedEncryptManager r0 = xyz.adscope.common.v2.encrypt.LinkedEncryptManager.getInstance()
                    xyz.adscope.ad.e1$b r1 = r4.b
                    android.content.Context r1 = xyz.adscope.ad.e1.b.b(r1)
                    java.lang.Object r0 = r0.getOrCreateImplement(r1)
                    xyz.adscope.common.v2.encrypt.ILinkedEncrypt r0 = (xyz.adscope.common.v2.encrypt.ILinkedEncrypt) r0
                    xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r1 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.AS_LAST_OR_FIRST
                    java.lang.String r2 = "101,1001"
                    r3 = 0
                    java.lang.String r0 = r0.encrypt(r6, r2, r1, r3)
                    java.lang.String r5 = r5.c()
                    boolean r1 = android.text.TextUtils.isEmpty(r5)
                    if (r1 != 0) goto L70
                    boolean r6 = android.text.TextUtils.isEmpty(r6)
                    if (r6 != 0) goto L70
                    xyz.adscope.ad.v5 r6 = new xyz.adscope.ad.v5
                    xyz.adscope.ad.e1$b r1 = r4.b
                    android.content.Context r1 = xyz.adscope.ad.e1.b.b(r1)
                    r2 = 1
                    r6.<init>(r1, r2)
                    xyz.adscope.ad.e1$b$b$b r1 = new xyz.adscope.ad.e1$b$b$b
                    r1.<init>(r4)
                    r6.requestWithPostMethod(r5, r0, r1)
                L70:
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel r0 = r4.a
                    if (r0 == 0) goto L46
                    java.util.List r0 = r0.b()
                    if (r0 == 0) goto L46
                    boolean r1 = r0.isEmpty()
                    if (r1 != 0) goto L46
                    xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel r1 = r4.a
                    int r1 = r1.d()
                    xyz.adscope.ad.e1$b r2 = r4.b
                    java.util.List r2 = xyz.adscope.ad.e1.b.a(r2)
                    r3 = 1
                    if (r1 == r3) goto L3f
                    r3 = 2
                    if (r1 == r3) goto L31
                    r3 = 999(0x3e7, float:1.4E-42)
                    if (r1 == r3) goto L27
                    goto L46
                L27:
                    java.util.List r0 = r4.a(r0, r2)
                    xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel r1 = r4.a
                    r4.a(r1, r0)
                    return
                L31:
                    java.util.List r0 = r4.a(r0, r2)
                    xyz.adscope.ad.e1$b r1 = r4.b
                    java.util.List r0 = xyz.adscope.ad.e1.b.a(r1, r2, r0)
                    r4.a(r0)
                    return
                L3f:
                    java.util.List r0 = r4.a(r0, r2)
                    r4.a(r0)
                L46:
                    return
            }
        }

        private b(android.content.Context r1, java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel> r2) {
                r0 = this;
                r0.<init>()
                android.content.Context r1 = r1.getApplicationContext()
                android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
                r0.a = r1
                r0.b = r2
                return
        }

        /* synthetic */ b(android.content.Context r1, java.util.List r2, xyz.adscope.ad.e1.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel> a() {
                r3 = this;
                java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel> r0 = r3.b
                if (r0 == 0) goto L1b
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L1b
                java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel> r0 = r3.b
                r1 = 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                xyz.adscope.ad.e1$b$a r2 = new xyz.adscope.ad.e1$b$a
                r2.<init>(r3)
                java.util.List r0 = xyz.adscope.common.v2.tool.collection.CollectionFetch.fetchAllFromList(r0, r1, r2)
                return r0
            L1b:
                r0 = 0
                return r0
        }

        private java.util.List<xyz.adscope.ad.c1> a(java.util.List<xyz.adscope.ad.c1> r2, java.util.List<xyz.adscope.ad.c1> r3) {
                r1 = this;
                if (r2 == 0) goto L14
                boolean r0 = r2.isEmpty()
                if (r0 != 0) goto L14
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.addAll(r2)
                r0.addAll(r3)
                return r0
            L14:
                r2 = 0
                return r2
        }

        static /* synthetic */ java.util.List a(xyz.adscope.ad.e1.b r0) {
                java.util.List r0 = r0.b()
                return r0
        }

        static /* synthetic */ java.util.List a(xyz.adscope.ad.e1.b r0, java.util.List r1, java.util.List r2) {
                java.util.List r0 = r0.a(r1, r2)
                return r0
        }

        private void a(xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel r6) {
                r5 = this;
                if (r6 == 0) goto L20
                int r0 = r6.a()
                xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r1 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
                android.content.Context r2 = r5.a
                java.lang.Object r1 = r1.getOrCreateImplement(r2)
                xyz.adscope.common.v2.thread.pool.IBaseThreadPool r1 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r1
                if (r1 == 0) goto L20
                xyz.adscope.ad.e1$b$b r2 = new xyz.adscope.ad.e1$b$b
                r3 = 0
                r2.<init>(r5, r6, r3)
                long r3 = (long) r0
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
                r1.scheduleAsyncTask(r2, r3, r6)
            L20:
                return
        }

        static /* synthetic */ android.content.Context b(xyz.adscope.ad.e1.b r0) {
                android.content.Context r0 = r0.a
                return r0
        }

        private java.util.List<xyz.adscope.ad.c1> b() {
                r10 = this;
                android.content.Context r0 = r10.a
                java.lang.String r1 = xyz.adscope.ad.i0.a()
                java.lang.String r2 = "appInstall"
                java.util.Set r0 = xyz.adscope.ad.i0.c(r0, r1, r2)
                if (r0 == 0) goto L4c
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L4c
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r2 = 7
                long r2 = xyz.adscope.common.v2.tool.date.DateUtil.getTimeMillisBeforeDay(r2)
                java.util.Iterator r0 = r0.iterator()
            L22:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L4b
                java.lang.Object r4 = r0.next()
                java.lang.String r4 = (java.lang.String) r4
                org.json.JSONObject r4 = xyz.adscope.common.v2.tool.json.JsonUtil.parseJSONObject(r4)
                if (r4 == 0) goto L22
                xyz.adscope.ad.c1 r5 = new xyz.adscope.ad.c1
                r5.<init>(r4)
                long r6 = r5.c()
                r8 = 0
                int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r4 <= 0) goto L22
                int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r4 <= 0) goto L22
                r1.add(r5)
                goto L22
            L4b:
                return r1
            L4c:
                r0 = 0
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.util.List r0 = r2.a()
                if (r0 == 0) goto L20
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L20
                java.util.Iterator r0 = r0.iterator()
            L10:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel r1 = (xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel) r1
                r2.a(r1)
                goto L10
            L20:
                return
        }
    }

    public e1(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // xyz.adscope.ad.q2
    protected void a(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r4, xyz.adscope.ad.e.a r5) {
            r3 = this;
            if (r4 == 0) goto L31
            xyz.adscope.ad.model.impl.resp.cfg.root.statistics.StatisticsModel r5 = r4.h()
            if (r5 == 0) goto L31
            xyz.adscope.ad.model.impl.resp.cfg.root.statistics.StatisticsModel r4 = r4.h()
            java.util.List r4 = r4.b()
            if (r4 == 0) goto L31
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L31
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r5 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            android.content.Context r0 = r3.a
            java.lang.Object r5 = r5.getOrCreateImplement(r0)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r5 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r5
            if (r5 == 0) goto L31
            xyz.adscope.ad.e1$b r0 = new xyz.adscope.ad.e1$b
            android.content.Context r1 = r3.a
            r2 = 0
            r0.<init>(r1, r4, r2)
            r5.executeLocalAsyncTask(r0)
        L31:
            return
    }
}
