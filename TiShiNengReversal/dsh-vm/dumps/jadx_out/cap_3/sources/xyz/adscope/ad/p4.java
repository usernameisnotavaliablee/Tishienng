package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class p4 extends xyz.adscope.ad.q2 {

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
            final /* synthetic */ xyz.adscope.ad.p4.b a;

            a(xyz.adscope.ad.p4.b r1) {
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
        /* renamed from: xyz.adscope.ad.p4$b$b, reason: collision with other inner class name */
        private class RunnableC0063b implements java.lang.Runnable {
            private final xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel a;
            final /* synthetic */ xyz.adscope.ad.p4.b b;

            private RunnableC0063b(xyz.adscope.ad.p4.b r1, xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel r2) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>()
                    r0.a = r2
                    return
            }

            /* synthetic */ RunnableC0063b(xyz.adscope.ad.p4.b r1, xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel r2, xyz.adscope.ad.p4.a r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            private /* synthetic */ void a(java.lang.String r3) {
                    r2 = this;
                    xyz.adscope.ad.h0 r0 = xyz.adscope.ad.h0.a()
                    xyz.adscope.ad.p4$b r1 = r2.b
                    android.content.Context r1 = xyz.adscope.ad.p4.b.a(r1)
                    java.lang.Object r0 = r0.getOrCreateImplement(r1)
                    xyz.adscope.ad.w1 r0 = (xyz.adscope.ad.w1) r0
                    r1 = 0
                    r0.a(r3, r1)
                    return
            }

            private void a(xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.taskurl.TaskUrlModel r6) {
                    r5 = this;
                    java.lang.String r0 = r6.a()
                    long r1 = r5.b(r6)
                    java.lang.String r6 = r6.d()
                    boolean r3 = android.text.TextUtils.isEmpty(r6)
                    if (r3 != 0) goto L72
                    xyz.adscope.common.v2.conn.http.RequestMethod r3 = xyz.adscope.common.v2.conn.http.RequestMethod.GET
                    java.lang.String r3 = r3.getMethodName()
                    boolean r3 = r3.equalsIgnoreCase(r0)
                    if (r3 == 0) goto L24
                    xyz.adscope.ad.o7 r0 = new xyz.adscope.ad.o7
                    r0.<init>(r5, r6)
                    goto L53
                L24:
                    xyz.adscope.common.v2.conn.http.RequestMethod r3 = xyz.adscope.common.v2.conn.http.RequestMethod.POST
                    java.lang.String r3 = r3.getMethodName()
                    boolean r3 = r3.equalsIgnoreCase(r0)
                    if (r3 == 0) goto L36
                    xyz.adscope.ad.p7 r0 = new xyz.adscope.ad.p7
                    r0.<init>(r5, r6)
                    goto L53
                L36:
                    java.lang.String r3 = "WEBVIEW"
                    boolean r3 = r3.equalsIgnoreCase(r0)
                    if (r3 == 0) goto L44
                    xyz.adscope.ad.q7 r0 = new xyz.adscope.ad.q7
                    r0.<init>(r5, r6)
                    goto L53
                L44:
                    java.lang.String r3 = "DEEPLINK"
                    boolean r0 = r3.equalsIgnoreCase(r0)
                    if (r0 == 0) goto L52
                    xyz.adscope.ad.r7 r0 = new xyz.adscope.ad.r7
                    r0.<init>(r5, r6)
                    goto L53
                L52:
                    r0 = 0
                L53:
                    if (r0 == 0) goto L72
                    r3 = 0
                    int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r6 < 0) goto L72
                    xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r6 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
                    xyz.adscope.ad.p4$b r3 = r5.b
                    android.content.Context r3 = xyz.adscope.ad.p4.b.a(r3)
                    java.lang.Object r6 = r6.getOrCreateImplement(r3)
                    xyz.adscope.common.v2.thread.pool.IBaseThreadPool r6 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r6
                    if (r6 == 0) goto L72
                    java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
                    r6.scheduleAsyncTask(r0, r1, r3)
                L72:
                    return
            }

            public static /* synthetic */ void a(xyz.adscope.ad.p4.b.RunnableC0063b r0, java.lang.String r1) {
                    r0.c(r1)
                    return
            }

            private long b(xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.taskurl.TaskUrlModel r6) {
                    r5 = this;
                    long r0 = r6.b()
                    java.util.Random r2 = new java.util.Random
                    long r3 = java.lang.System.currentTimeMillis()
                    r2.<init>(r3)
                    long r3 = r6.c()
                    int r6 = (int) r3
                    int r6 = r2.nextInt(r6)
                    int r6 = r6 + 1
                    long r2 = (long) r6
                    long r0 = r0 + r2
                    return r0
            }

            private /* synthetic */ void b(java.lang.String r4) {
                    r3 = this;
                    xyz.adscope.ad.h0 r0 = xyz.adscope.ad.h0.a()
                    xyz.adscope.ad.p4$b r1 = r3.b
                    android.content.Context r1 = xyz.adscope.ad.p4.b.a(r1)
                    java.lang.Object r0 = r0.getOrCreateImplement(r1)
                    xyz.adscope.ad.w1 r0 = (xyz.adscope.ad.w1) r0
                    java.lang.String r1 = ""
                    r2 = 0
                    r0.a(r4, r1, r2)
                    return
            }

            public static /* synthetic */ void b(xyz.adscope.ad.p4.b.RunnableC0063b r0, java.lang.String r1) {
                    r0.a(r1)
                    return
            }

            private /* synthetic */ void c(java.lang.String r3) {
                    r2 = this;
                    xyz.adscope.ad.p4$b r0 = r2.b
                    android.content.Context r0 = xyz.adscope.ad.p4.b.a(r0)
                    r1 = 0
                    xyz.adscope.ad.n4.a(r0, r3, r1)
                    return
            }

            public static /* synthetic */ void c(xyz.adscope.ad.p4.b.RunnableC0063b r0, java.lang.String r1) {
                    r0.b(r1)
                    return
            }

            private /* synthetic */ void d(java.lang.String r2) {
                    r1 = this;
                    xyz.adscope.ad.p4$b r0 = r1.b
                    android.content.Context r0 = xyz.adscope.ad.p4.b.a(r0)
                    xyz.adscope.ad.n4.a(r0, r2)
                    return
            }

            public static /* synthetic */ void d(xyz.adscope.ad.p4.b.RunnableC0063b r0, java.lang.String r1) {
                    r0.d(r1)
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel r0 = r2.a
                    java.util.List r0 = r0.f()
                    if (r0 == 0) goto L22
                    boolean r1 = r0.isEmpty()
                    if (r1 != 0) goto L22
                    java.util.Iterator r0 = r0.iterator()
                L12:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L22
                    java.lang.Object r1 = r0.next()
                    xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.taskurl.TaskUrlModel r1 = (xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.taskurl.TaskUrlModel) r1
                    r2.a(r1)
                    goto L12
                L22:
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

        /* synthetic */ b(android.content.Context r1, java.util.List r2, xyz.adscope.ad.p4.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ android.content.Context a(xyz.adscope.ad.p4.b r0) {
                android.content.Context r0 = r0.a
                return r0
        }

        private java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel> a() {
                r3 = this;
                java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel> r0 = r3.b
                if (r0 == 0) goto L1b
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L1b
                java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel> r0 = r3.b
                r1 = 2
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                xyz.adscope.ad.p4$b$a r2 = new xyz.adscope.ad.p4$b$a
                r2.<init>(r3)
                java.util.List r0 = xyz.adscope.common.v2.tool.collection.CollectionFetch.fetchAllFromList(r0, r1, r2)
                return r0
            L1b:
                r0 = 0
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
                xyz.adscope.ad.p4$b$b r2 = new xyz.adscope.ad.p4$b$b
                r3 = 0
                r2.<init>(r5, r6, r3)
                long r3 = (long) r0
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
                r1.scheduleAsyncTask(r2, r3, r6)
            L20:
                return
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

    public p4(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // xyz.adscope.ad.q2
    protected void a(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r4, xyz.adscope.ad.e.a r5) {
            r3 = this;
            if (r4 == 0) goto L38
            xyz.adscope.ad.model.impl.resp.cfg.root.statistics.StatisticsModel r5 = r4.h()
            if (r5 == 0) goto L38
            xyz.adscope.ad.model.impl.resp.cfg.root.statistics.StatisticsModel r4 = r4.h()
            java.util.List r4 = r4.b()
            if (r4 == 0) goto L38
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L38
            java.lang.String r5 = "InvokeRequestByUpdate"
            java.lang.String r0 = "配置更新, 检查是否存在上报..."
            xyz.adscope.common.v2.log.SDKLog.d(r5, r0)
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r5 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            android.content.Context r0 = r3.a
            java.lang.Object r5 = r5.getOrCreateImplement(r0)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r5 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r5
            if (r5 == 0) goto L38
            xyz.adscope.ad.p4$b r0 = new xyz.adscope.ad.p4$b
            android.content.Context r1 = r3.a
            r2 = 0
            r0.<init>(r1, r4, r2)
            r5.executeLocalAsyncTask(r0)
        L38:
            return
    }
}
