package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class j0 {
    private final android.content.Context a;
    private final xyz.adscope.ad.h b;
    private final xyz.adscope.ad.j0.e c;
    private java.util.Map<java.lang.String, java.util.LinkedList<xyz.adscope.ad.model.impl.db.StrategyEventDBModel>> d;
    private final java.util.Map<java.lang.String, xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b implements java.lang.Runnable {
        final /* synthetic */ xyz.adscope.ad.j0 a;

        private b(xyz.adscope.ad.j0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(xyz.adscope.ad.j0 r1, xyz.adscope.ad.j0.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                xyz.adscope.ad.j0 r0 = r3.a
                xyz.adscope.ad.h r0 = xyz.adscope.ad.j0.a(r0)
                java.lang.Class<xyz.adscope.ad.model.impl.db.StrategyEventDBModel> r1 = xyz.adscope.ad.model.impl.db.StrategyEventDBModel.class
                int r0 = r0.queryNumEntries(r1)
                r2 = 1000(0x3e8, float:1.401E-42)
                if (r0 <= r2) goto L2a
                int r0 = r0 / 2
                xyz.adscope.ad.j0 r2 = r3.a
                xyz.adscope.ad.h r2 = xyz.adscope.ad.j0.a(r2)
                long[] r0 = r2.queryPrimerByDeleteCount(r1, r0)
                if (r0 == 0) goto L2a
                int r2 = r0.length
                if (r2 <= 0) goto L2a
                xyz.adscope.ad.j0 r2 = r3.a
                xyz.adscope.ad.h r2 = xyz.adscope.ad.j0.a(r2)
                r2.deleteBetweenPrimaryKey(r1, r0)
            L2a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements java.lang.Runnable {
        private final xyz.adscope.ad.model.impl.db.StrategyEventDBModel a;
        final /* synthetic */ xyz.adscope.ad.j0 b;

        private c(xyz.adscope.ad.j0 r1, xyz.adscope.ad.model.impl.db.StrategyEventDBModel r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        /* synthetic */ c(xyz.adscope.ad.j0 r1, xyz.adscope.ad.model.impl.db.StrategyEventDBModel r2, xyz.adscope.ad.j0.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                xyz.adscope.ad.j0 r0 = r2.b
                xyz.adscope.ad.h r0 = xyz.adscope.ad.j0.a(r0)
                xyz.adscope.ad.model.impl.db.StrategyEventDBModel r1 = r2.a
                r0.insert(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class d implements java.lang.Runnable {
        final /* synthetic */ xyz.adscope.ad.j0 a;

        private d(xyz.adscope.ad.j0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ d(xyz.adscope.ad.j0 r1, xyz.adscope.ad.j0.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                xyz.adscope.ad.j0 r0 = r7.a
                xyz.adscope.ad.h r1 = xyz.adscope.ad.j0.a(r0)
                xyz.adscope.ad.j0 r0 = r7.a
                xyz.adscope.ad.h r0 = xyz.adscope.ad.j0.a(r0)
                java.lang.String r2 = "apiKey"
                java.lang.String r3 = r0.whereEquals(r2)
                java.lang.String r0 = xyz.adscope.ad.f0.a()
                java.lang.String[] r4 = new java.lang.String[]{r0}
                xyz.adscope.ad.j0 r0 = r7.a
                xyz.adscope.ad.h r0 = xyz.adscope.ad.j0.a(r0)
                java.lang.String r2 = "eventTime"
                java.lang.String r5 = r0.getOrderByAsc(r2)
                java.lang.Class<xyz.adscope.ad.model.impl.db.StrategyEventDBModel> r2 = xyz.adscope.ad.model.impl.db.StrategyEventDBModel.class
                r6 = -1
                java.util.List r0 = r1.query(r2, r3, r4, r5, r6)
                if (r0 == 0) goto L4d
                java.util.Iterator r0 = r0.iterator()
            L33:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L4d
                java.lang.Object r1 = r0.next()
                xyz.adscope.ad.model.impl.db.StrategyEventDBModel r1 = (xyz.adscope.ad.model.impl.db.StrategyEventDBModel) r1
                xyz.adscope.ad.j0 r2 = r7.a
                java.lang.String r3 = r1.c()
                java.lang.String r4 = r1.a()
                xyz.adscope.ad.j0.a(r2, r3, r4, r1)
                goto L33
            L4d:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class e implements xyz.adscope.ad.d3 {
        final /* synthetic */ xyz.adscope.ad.j0 a;

        private e(xyz.adscope.ad.j0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ e(xyz.adscope.ad.j0 r1, xyz.adscope.ad.j0.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private java.util.Map<java.lang.String, xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel> a(java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel> r4) {
                r3 = this;
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                if (r4 == 0) goto L25
                boolean r1 = r4.isEmpty()
                if (r1 != 0) goto L25
                java.util.Iterator r4 = r4.iterator()
            L11:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L25
                java.lang.Object r1 = r4.next()
                xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel r1 = (xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel) r1
                java.lang.String r2 = r1.d()
                r0.put(r2, r1)
                goto L11
            L25:
                return r0
        }

        @Override // xyz.adscope.ad.d3
        public void a(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r1, xyz.adscope.ad.e.a r2, boolean r3) {
                r0 = this;
                if (r1 == 0) goto L1c
                xyz.adscope.ad.j0 r2 = r0.a
                java.util.Map r2 = xyz.adscope.ad.j0.b(r2)
                r2.clear()
                xyz.adscope.ad.j0 r2 = r0.a
                java.util.Map r2 = xyz.adscope.ad.j0.b(r2)
                java.util.List r1 = r1.e()
                java.util.Map r1 = r0.a(r1)
                r2.putAll(r1)
            L1c:
                xyz.adscope.ad.j0 r1 = r0.a
                xyz.adscope.ad.j0.c(r1)
                return
        }
    }

    j0(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.e = r0
            r1.a = r2
            xyz.adscope.ad.i r0 = xyz.adscope.ad.i.a()
            java.lang.Object r2 = r0.getOrCreateImplement(r2)
            xyz.adscope.ad.h r2 = (xyz.adscope.ad.h) r2
            r1.b = r2
            xyz.adscope.ad.j0$e r2 = new xyz.adscope.ad.j0$e
            r0 = 0
            r2.<init>(r1, r0)
            r1.c = r2
            return
    }

    private java.lang.String a(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            java.lang.String r3 = "HS_%s_%s"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            return r3
    }

    static /* synthetic */ xyz.adscope.ad.h a(xyz.adscope.ad.j0 r0) {
            xyz.adscope.ad.h r0 = r0.b
            return r0
    }

    private void a() {
            r3 = this;
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            android.content.Context r1 = r3.a
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r0
            xyz.adscope.ad.j0$d r1 = new xyz.adscope.ad.j0$d
            r2 = 0
            r1.<init>(r3, r2)
            r0.executeLocalAsyncTask(r1)
            return
    }

    private void a(java.lang.String r1, java.lang.String r2, xyz.adscope.ad.model.impl.db.StrategyEventDBModel r3) {
            r0 = this;
            java.lang.String r1 = r0.a(r1, r2)
            java.util.Map<java.lang.String, java.util.LinkedList<xyz.adscope.ad.model.impl.db.StrategyEventDBModel>> r2 = r0.d
            if (r2 != 0) goto Lf
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.d = r2
        Lf:
            java.util.Map<java.lang.String, java.util.LinkedList<xyz.adscope.ad.model.impl.db.StrategyEventDBModel>> r2 = r0.d
            java.lang.Object r2 = r2.get(r1)
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            if (r2 != 0) goto L1e
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
        L1e:
            r2.addFirst(r3)
            java.util.Map<java.lang.String, java.util.LinkedList<xyz.adscope.ad.model.impl.db.StrategyEventDBModel>> r3 = r0.d
            r3.put(r1, r2)
            return
    }

    static /* synthetic */ void a(xyz.adscope.ad.j0 r0, java.lang.String r1, java.lang.String r2, xyz.adscope.ad.model.impl.db.StrategyEventDBModel r3) {
            r0.a(r1, r2, r3)
            return
    }

    private void a(xyz.adscope.ad.model.impl.db.StrategyEventDBModel r4) {
            r3 = this;
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            android.content.Context r1 = r3.a
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r0
            xyz.adscope.ad.j0$c r1 = new xyz.adscope.ad.j0$c
            r2 = 0
            r1.<init>(r3, r4, r2)
            r0.executeLocalAsyncTask(r1)
            java.lang.String r0 = r4.c()
            java.lang.String r1 = r4.a()
            r3.a(r0, r1, r4)
            return
    }

    private boolean a(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel> r0 = r2.e
            boolean r0 = r0.containsKey(r3)
            r1 = 0
            if (r0 == 0) goto L21
            java.util.Map<java.lang.String, xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel> r0 = r2.e
            java.lang.Object r3 = r0.get(r3)
            xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel r3 = (xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel) r3
            if (r3 == 0) goto L21
            java.util.List r3 = r3.b()
            if (r3 == 0) goto L21
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L21
            r3 = 1
            return r3
        L21:
            return r1
    }

    static /* synthetic */ java.util.Map b(xyz.adscope.ad.j0 r0) {
            java.util.Map<java.lang.String, xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel> r0 = r0.e
            return r0
    }

    private void b() {
            r3 = this;
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            android.content.Context r1 = r3.a
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r0
            xyz.adscope.ad.j0$b r1 = new xyz.adscope.ad.j0$b
            r2 = 0
            r1.<init>(r3, r2)
            r0.executeLocalAsyncTask(r1)
            return
    }

    static /* synthetic */ void c(xyz.adscope.ad.j0 r0) {
            r0.b()
            return
    }

    public synchronized void a(java.lang.String r5, xyz.adscope.ad.n1 r6) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L4a
            if (r6 == 0) goto L4a
            boolean r0 = r4.a(r5)     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L4a
            xyz.adscope.ad.model.impl.db.StrategyEventDBModel r0 = new xyz.adscope.ad.model.impl.db.StrategyEventDBModel     // Catch: java.lang.Throwable -> L48
            r0.<init>()     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = xyz.adscope.ad.f0.a()     // Catch: java.lang.Throwable -> L48
            r0.a(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r6.getEventCode()     // Catch: java.lang.Throwable -> L48
            r0.b(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r1.<init>()     // Catch: java.lang.Throwable -> L48
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L48
            r1.append(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = ""
            r1.append(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L48
            r0.c(r1)     // Catch: java.lang.Throwable -> L48
            r0.d(r5)     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = r6.getEventCode()     // Catch: java.lang.Throwable -> L48
            r4.a(r5, r6, r0)     // Catch: java.lang.Throwable -> L48
            r4.a(r0)     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            r5 = move-exception
            goto L4c
        L4a:
            monitor-exit(r4)
            return
        L4c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L48
            throw r5
    }

    public synchronized java.util.LinkedList<xyz.adscope.ad.model.impl.db.StrategyEventDBModel> b(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.util.LinkedList<xyz.adscope.ad.model.impl.db.StrategyEventDBModel>> r0 = r1.d     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            java.lang.String r2 = r1.a(r2, r3)     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            java.util.LinkedList r2 = (java.util.LinkedList) r2     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r2
        L11:
            r2 = move-exception
            goto L16
        L13:
            monitor-exit(r1)
            r2 = 0
            return r2
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    public void c() {
            r2 = this;
            xyz.adscope.ad.f r0 = xyz.adscope.ad.f.a()
            android.content.Context r1 = r2.a
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.ad.e r0 = (xyz.adscope.ad.e) r0
            xyz.adscope.ad.j0$e r1 = r2.c
            r0.a(r1)
            r2.a()
            return
    }
}
