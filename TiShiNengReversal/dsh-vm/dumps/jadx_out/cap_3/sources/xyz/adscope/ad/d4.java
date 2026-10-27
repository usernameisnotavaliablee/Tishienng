package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class d4 extends xyz.adscope.ad.n2 implements xyz.adscope.ad.e2 {
    private final xyz.adscope.ad.d4.b b;
    private final xyz.adscope.ad.c c;
    private final java.util.Map<java.lang.String, xyz.adscope.ad.d4.e> d;
    private xyz.adscope.ad.publish.ASNPInitConfig e;
    private final xyz.adscope.common.v2.thread.pool.IBaseThreadPool f;
    private xyz.adscope.ad.a2 g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare<xyz.adscope.ad.model.impl.resp.cfg.root.strategy.StrategyModel, java.lang.String> {
        final /* synthetic */ xyz.adscope.ad.d4 a;

        a(xyz.adscope.ad.d4 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public boolean a(xyz.adscope.ad.model.impl.resp.cfg.root.strategy.StrategyModel r1, java.lang.String r2) {
                r0 = this;
                if (r1 == 0) goto Lb
                java.lang.String r1 = r1.b()
                boolean r1 = r2.equals(r1)
                return r1
            Lb:
                r1 = 0
                return r1
        }

        @Override // xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare
        public /* bridge */ /* synthetic */ boolean fetch(xyz.adscope.ad.model.impl.resp.cfg.root.strategy.StrategyModel r1, java.lang.String r2) {
                r0 = this;
                xyz.adscope.ad.model.impl.resp.cfg.root.strategy.StrategyModel r1 = (xyz.adscope.ad.model.impl.resp.cfg.root.strategy.StrategyModel) r1
                java.lang.String r2 = (java.lang.String) r2
                boolean r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b extends xyz.adscope.ad.n {
        private xyz.adscope.ad.e3 b;

        private b(android.content.Context r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* synthetic */ b(android.content.Context r1, xyz.adscope.ad.d4.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.d4.b r0, xyz.adscope.ad.e3 r1) {
                r0.a(r1)
                return
        }

        private void a(xyz.adscope.ad.e3 r1) {
                r0 = this;
                r0.b = r1
                return
        }

        @Override // xyz.adscope.ad.n
        public void a(android.os.Message r4) {
                r3 = this;
                if (r4 == 0) goto L25
                xyz.adscope.ad.e3 r0 = r3.b
                if (r0 == 0) goto L25
                int r1 = r4.what
                if (r1 == 0) goto L1a
                r2 = 1
                if (r1 == r2) goto Le
                goto L25
            Le:
                java.lang.Object r4 = r4.obj
                boolean r1 = r4 instanceof java.util.List
                if (r1 == 0) goto L25
                java.util.List r4 = (java.util.List) r4
                r0.onAdLoaded(r4)
                return
            L1a:
                java.lang.Object r4 = r4.obj
                boolean r1 = r4 instanceof xyz.adscope.ad.y0
                if (r1 == 0) goto L25
                xyz.adscope.ad.y0 r4 = (xyz.adscope.ad.y0) r4
                r0.a(r4)
            L25:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements java.lang.Runnable {
        private final xyz.adscope.ad.b1 a;
        private final xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel b;
        private final xyz.adscope.ad.a2 c;
        private final xyz.adscope.ad.s1 d;
        final /* synthetic */ xyz.adscope.ad.d4 e;

        private c(xyz.adscope.ad.d4 r3, xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r4, xyz.adscope.ad.a2 r5, xyz.adscope.ad.b1 r6) {
                r2 = this;
                r2.e = r3
                r2.<init>()
                xyz.adscope.ad.b1 r6 = r6.a()
                r2.a = r6
                xyz.adscope.ad.publish.ASNPInitConfig r0 = xyz.adscope.ad.d4.f(r3)
                r6.a(r0)
                long r0 = java.lang.System.currentTimeMillis()
                r6.a(r0)
                r2.b = r4
                r2.c = r5
                xyz.adscope.ad.l r4 = xyz.adscope.ad.l.a()
                android.content.Context r3 = xyz.adscope.ad.d4.g(r3)
                java.lang.Object r3 = r4.getOrCreateImplement(r3)
                xyz.adscope.ad.s1 r3 = (xyz.adscope.ad.s1) r3
                r2.d = r3
                return
        }

        /* synthetic */ c(xyz.adscope.ad.d4 r1, xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r2, xyz.adscope.ad.a2 r3, xyz.adscope.ad.b1 r4, xyz.adscope.ad.d4.a r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        private java.util.List<xyz.adscope.ad.s3> a(xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel r2, xyz.adscope.ad.a2 r3, xyz.adscope.ad.b1 r4) {
                r1 = this;
                xyz.adscope.ad.d4 r0 = r1.e
                java.util.List r2 = xyz.adscope.ad.d4.a(r0, r2)
                if (r2 == 0) goto L15
                boolean r0 = r2.isEmpty()
                if (r0 != 0) goto L15
                xyz.adscope.ad.d4 r0 = r1.e
                java.util.List r2 = xyz.adscope.ad.d4.a(r0, r2, r3, r4)
                return r2
            L15:
                r2 = 0
                return r2
        }

        private void a(java.util.List<xyz.adscope.ad.s3> r4) {
                r3 = this;
                xyz.adscope.ad.s1 r0 = r3.d
                xyz.adscope.ad.n1 r1 = xyz.adscope.ad.n1.g
                xyz.adscope.ad.b1 r2 = r3.a
                r0.a(r1, r2)
                android.os.Message r0 = android.os.Message.obtain()
                r1 = 1
                r0.what = r1
                r0.obj = r4
                xyz.adscope.ad.d4 r4 = r3.e
                xyz.adscope.ad.d4$b r4 = xyz.adscope.ad.d4.d(r4)
                r4.sendMessage(r0)
                return
        }

        private void a(xyz.adscope.ad.d4.d r9, xyz.adscope.ad.d4.f r10) {
                r8 = this;
                xyz.adscope.ad.d4 r0 = r8.e
                xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r1 = r8.b
                xyz.adscope.ad.model.impl.resp.cfg.root.strategy.cache.AdCacheModel r1 = xyz.adscope.ad.d4.a(r0, r1)
                boolean r0 = xyz.adscope.ad.d4.a(r0, r1)
                if (r0 == 0) goto L3e
                boolean r9 = xyz.adscope.ad.d4.d.a(r9)
                if (r9 == 0) goto L3e
                boolean r9 = xyz.adscope.ad.d4.f.a(r10)
                if (r9 != 0) goto L3e
                xyz.adscope.ad.d4$d r0 = new xyz.adscope.ad.d4$d
                xyz.adscope.ad.d4 r1 = r8.e
                android.content.Context r2 = xyz.adscope.ad.d4.b(r1)
                xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r3 = r8.b
                xyz.adscope.ad.b1 r4 = r8.a
                xyz.adscope.ad.a2 r5 = r8.c
                r6 = 0
                r7 = 1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                xyz.adscope.ad.d4 r9 = r8.e
                xyz.adscope.common.v2.thread.pool.IBaseThreadPool r9 = xyz.adscope.ad.d4.a(r9)
                if (r9 == 0) goto L3e
                xyz.adscope.ad.d4 r9 = r8.e
                xyz.adscope.common.v2.thread.pool.IBaseThreadPool r9 = xyz.adscope.ad.d4.a(r9)
                r9.executeRequestAsyncTask(r0)
            L3e:
                return
        }

        private void a(xyz.adscope.ad.d4.d r3, xyz.adscope.ad.d4.f r4, xyz.adscope.ad.d4.h r5, xyz.adscope.ad.b1 r6) {
                r2 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel r0 = r3.b()
                xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel r4 = r4.b()
                xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel r1 = r5.b()
                if (r0 != 0) goto L34
                if (r4 != 0) goto L34
                if (r1 != 0) goto L34
                xyz.adscope.ad.y0 r4 = r3.a()
                if (r4 == 0) goto L20
                xyz.adscope.ad.y0 r3 = r3.a()
                r2.a(r3)
                return
            L20:
                xyz.adscope.ad.y0 r3 = r5.a()
                if (r3 == 0) goto L2e
                xyz.adscope.ad.y0 r3 = r5.a()
                r2.a(r3)
                return
            L2e:
                xyz.adscope.ad.y0 r3 = xyz.adscope.ad.y0.i
                r2.a(r3)
                return
            L34:
                if (r0 == 0) goto L37
                goto L3c
            L37:
                if (r4 == 0) goto L3b
                r0 = r4
                goto L3c
            L3b:
                r0 = r1
            L3c:
                boolean r3 = r0.hasParseException()
                if (r3 != 0) goto L5d
                xyz.adscope.ad.a2 r3 = r2.c
                java.util.List r3 = r2.a(r0, r3, r6)
                if (r3 == 0) goto L57
                boolean r4 = r3.isEmpty()
                if (r4 != 0) goto L57
                r2.a(r3)
                r2.a(r0)
                return
            L57:
                xyz.adscope.ad.y0 r3 = xyz.adscope.ad.y0.c
                r2.a(r3)
                return
            L5d:
                xyz.adscope.ad.y0 r3 = xyz.adscope.ad.y0.i
                r2.a(r3)
                return
        }

        private void a(xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel r6) {
                r5 = this;
                if (r6 == 0) goto L33
                xyz.adscope.ad.model.impl.resp.ad.resp.ext.ResponseExtModel r0 = r6.a()
                if (r0 == 0) goto L33
                xyz.adscope.ad.model.impl.resp.ad.resp.ext.ResponseExtModel r6 = r6.a()
                boolean r0 = r6.b()
                if (r0 == 0) goto L33
                xyz.adscope.ad.f r0 = xyz.adscope.ad.f.a()
                xyz.adscope.ad.d4 r1 = r5.e
                android.content.Context r1 = xyz.adscope.ad.d4.c(r1)
                java.lang.Object r0 = r0.getOrCreateImplement(r1)
                xyz.adscope.ad.e r0 = (xyz.adscope.ad.e) r0
                if (r0 == 0) goto L33
                long r1 = r0.c()
                long r3 = r6.a()
                int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r6 >= 0) goto L33
                r0.h()
            L33:
                return
        }

        private void a(xyz.adscope.ad.y0 r4) {
                r3 = this;
                xyz.adscope.ad.b1 r0 = r3.a
                r0.a(r4)
                xyz.adscope.ad.s1 r0 = r3.d
                xyz.adscope.ad.n1 r1 = xyz.adscope.ad.n1.h
                xyz.adscope.ad.b1 r2 = r3.a
                r0.a(r1, r2)
                android.os.Message r0 = android.os.Message.obtain()
                r1 = 0
                r0.what = r1
                r0.obj = r4
                xyz.adscope.ad.d4 r4 = r3.e
                xyz.adscope.ad.d4$b r4 = xyz.adscope.ad.d4.d(r4)
                r4.sendMessage(r0)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r11 = this;
                xyz.adscope.ad.k0 r0 = xyz.adscope.ad.k0.a()
                xyz.adscope.ad.d4 r1 = r11.e
                android.content.Context r1 = xyz.adscope.ad.d4.h(r1)
                java.lang.Object r0 = r0.getOrCreateImplement(r1)
                xyz.adscope.ad.j0 r0 = (xyz.adscope.ad.j0) r0
                xyz.adscope.ad.a2 r1 = r11.c
                java.lang.String r1 = r1.getSpaceID()
                xyz.adscope.ad.n1 r2 = xyz.adscope.ad.n1.e
                r0.a(r1, r2)
                xyz.adscope.ad.s1 r0 = r11.d
                xyz.adscope.ad.n1 r1 = xyz.adscope.ad.n1.f
                xyz.adscope.ad.b1 r2 = r11.a
                r0.a(r1, r2)
                java.lang.System.currentTimeMillis()
                java.util.concurrent.CountDownLatch r9 = new java.util.concurrent.CountDownLatch
                r0 = 3
                r9.<init>(r0)
                xyz.adscope.ad.d4$d r3 = new xyz.adscope.ad.d4$d
                xyz.adscope.ad.d4 r4 = r11.e
                android.content.Context r5 = xyz.adscope.ad.d4.i(r4)
                xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r6 = r11.b
                xyz.adscope.ad.b1 r7 = r11.a
                xyz.adscope.ad.a2 r8 = r11.c
                r10 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                r1 = r3
                xyz.adscope.ad.d4$f r3 = new xyz.adscope.ad.d4$f
                xyz.adscope.ad.d4 r4 = r11.e
                android.content.Context r5 = xyz.adscope.ad.d4.j(r4)
                xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r6 = r11.b
                xyz.adscope.ad.b1 r7 = r11.a
                xyz.adscope.ad.a2 r8 = r11.c
                r3.<init>(r4, r5, r6, r7, r8, r9)
                r2 = r3
                xyz.adscope.ad.d4$h r3 = new xyz.adscope.ad.d4$h
                xyz.adscope.ad.d4 r4 = r11.e
                android.content.Context r5 = xyz.adscope.ad.d4.k(r4)
                xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r6 = r11.b
                xyz.adscope.ad.b1 r7 = r11.a
                xyz.adscope.ad.a2 r8 = r11.c
                r3.<init>(r4, r5, r6, r7, r8, r9)
                xyz.adscope.ad.d4 r0 = r11.e
                java.util.Map r0 = xyz.adscope.ad.d4.l(r0)
                java.lang.String r4 = "RunHttp"
                r0.put(r4, r1)
                xyz.adscope.ad.d4 r0 = r11.e
                java.util.Map r0 = xyz.adscope.ad.d4.l(r0)
                java.lang.String r4 = "RunLocal"
                r0.put(r4, r2)
                xyz.adscope.ad.d4$g r0 = new xyz.adscope.ad.d4$g
                xyz.adscope.ad.d4 r4 = r11.e
                java.util.Map r4 = xyz.adscope.ad.d4.l(r4)
                r5 = 0
                r0.<init>(r4, r5)
                r1.a(r0)
                r2.a(r0)
                xyz.adscope.ad.d4 r0 = r11.e
                xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = xyz.adscope.ad.d4.a(r0)
                if (r0 == 0) goto Lae
                xyz.adscope.ad.d4 r0 = r11.e
                xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = xyz.adscope.ad.d4.a(r0)
                r0.executeRequestAsyncTask(r1)
                xyz.adscope.ad.d4 r0 = r11.e
                xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = xyz.adscope.ad.d4.a(r0)
                r0.executeLocalAsyncTask(r2)
                xyz.adscope.ad.d4 r0 = r11.e
                xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = xyz.adscope.ad.d4.a(r0)
                r0.executeLocalAsyncTask(r3)
            Lae:
                r9.await()     // Catch: java.lang.InterruptedException -> Lb2
                goto Lb6
            Lb2:
                r0 = move-exception
                xyz.adscope.common.v2.log.SDKLog.stack(r0)
            Lb6:
                xyz.adscope.ad.b1 r0 = r11.a
                r11.a(r1, r2, r3, r0)
                xyz.adscope.ad.d4 r0 = r11.e
                xyz.adscope.ad.a2 r3 = r11.c
                boolean r0 = xyz.adscope.ad.d4.a(r0, r3)
                if (r0 != 0) goto Lc8
                r11.a(r1, r2)
            Lc8:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class d extends xyz.adscope.ad.d4.e {
        private final boolean j;
        private xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask k;
        private boolean l;
        final /* synthetic */ xyz.adscope.ad.d4 m;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask {
            final /* synthetic */ xyz.adscope.ad.d4.d a;

            a(xyz.adscope.ad.d4.d r1, long r2) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>(r2)
                    return
            }

            @Override // xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask
            protected void onScheduleTimeout() {
                    r2 = this;
                    xyz.adscope.ad.d4$d r0 = r2.a
                    xyz.adscope.ad.y0 r1 = xyz.adscope.ad.y0.h
                    r0.a(r1)
                    xyz.adscope.ad.d4$d r0 = r2.a
                    xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask r0 = xyz.adscope.ad.d4.d.b(r0)
                    r0.cancelCountDown()
                    xyz.adscope.ad.d4$d r0 = r2.a
                    r0.f()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b implements xyz.adscope.common.v2.conn.IBaseHttpResponseCallback {
            final /* synthetic */ xyz.adscope.ad.d4.d a;

            b(xyz.adscope.ad.d4.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // xyz.adscope.common.v2.conn.IBaseHttpResponseCallback
            public void failCallback(xyz.adscope.common.v2.conn.IHttpRequestError r2) {
                    r1 = this;
                    xyz.adscope.ad.d4$d r2 = r1.a
                    boolean r2 = xyz.adscope.ad.d4.d.c(r2)
                    if (r2 == 0) goto L9
                    return
                L9:
                    xyz.adscope.ad.d4$d r2 = r1.a
                    xyz.adscope.ad.y0 r0 = xyz.adscope.ad.y0.i
                    r2.a(r0)
                    xyz.adscope.ad.d4$d r2 = r1.a
                    r2.f()
                    return
            }

            @Override // xyz.adscope.common.v2.conn.IBaseHttpResponseCallback
            public void successCallback(xyz.adscope.common.v2.conn.IBaseHttpResponse r4) {
                    r3 = this;
                    r0 = 1
                    xyz.adscope.ad.y0[] r1 = new xyz.adscope.ad.y0[r0]
                    xyz.adscope.ad.d4$d r2 = r3.a
                    java.lang.String r4 = r4.getResponseResult()
                    xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel r4 = xyz.adscope.ad.d4.d.a(r2, r4, r1)
                    if (r4 == 0) goto L61
                    xyz.adscope.ad.d4$d r1 = r3.a
                    boolean r1 = r1.h
                    if (r1 != 0) goto L2e
                    xyz.adscope.ad.d4$d r1 = r3.a
                    boolean r1 = xyz.adscope.ad.d4.d.c(r1)
                    if (r1 == 0) goto L1e
                    goto L2e
                L1e:
                    xyz.adscope.ad.d4$d r1 = r3.a
                    xyz.adscope.ad.d4.d.a(r1, r0)
                    xyz.adscope.ad.d4$d r0 = r3.a
                    r0.a(r4)
                    xyz.adscope.ad.d4$d r4 = r3.a
                    r4.c()
                    goto L69
                L2e:
                    xyz.adscope.ad.b r0 = xyz.adscope.ad.b.a()
                    xyz.adscope.ad.d4$d r1 = r3.a
                    android.content.Context r1 = r1.a
                    java.lang.Object r0 = r0.getOrCreateImplement(r1)
                    xyz.adscope.ad.a r0 = (xyz.adscope.ad.a) r0
                    if (r0 == 0) goto L69
                    xyz.adscope.ad.d4$d r1 = r3.a
                    xyz.adscope.ad.a2 r1 = r1.c
                    java.lang.String r1 = r1.getSpaceID()
                    r0.a(r1, r4)
                    xyz.adscope.ad.d4$d r1 = r3.a
                    xyz.adscope.ad.d4 r1 = r1.m
                    xyz.adscope.ad.publish.ASNPInitConfig r1 = xyz.adscope.ad.d4.f(r1)
                    java.lang.String r1 = r1.getAppId()
                    xyz.adscope.ad.d4$d r2 = r3.a
                    xyz.adscope.ad.a2 r2 = r2.c
                    java.lang.String r2 = r2.getSpaceID()
                    r0.a(r1, r2, r4)
                    goto L69
                L61:
                    xyz.adscope.ad.d4$d r4 = r3.a
                    r0 = 0
                    r0 = r1[r0]
                    r4.a(r0)
                L69:
                    xyz.adscope.ad.d4$d r4 = r3.a
                    r4.f()
                    return
            }
        }

        d(xyz.adscope.ad.d4 r1, android.content.Context r2, xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r3, xyz.adscope.ad.b1 r4, xyz.adscope.ad.a2 r5, java.util.concurrent.CountDownLatch r6, boolean r7) {
                r0 = this;
                r0.m = r1
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                r2 = 0
                r1.l = r2
                r1.j = r7
                r0.a(r5)
                return
        }

        private java.lang.String a(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r2) {
                r1 = this;
                if (r2 == 0) goto L17
                xyz.adscope.ad.model.impl.resp.cfg.root.requrl.RequestUrlModel r0 = r2.f()
                if (r0 == 0) goto L17
                xyz.adscope.ad.model.impl.resp.cfg.root.requrl.RequestUrlModel r2 = r2.f()
                java.lang.String r2 = r2.a()
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 != 0) goto L17
                return r2
            L17:
                java.lang.String r2 = r1.g()
                return r2
        }

        private xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel a(java.lang.String r7, xyz.adscope.ad.y0[] r8) {
                r6 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r7)
                r1 = 0
                r2 = 0
                if (r0 != 0) goto L61
                xyz.adscope.ad.model.impl.resp.basic.ASNPResponse r0 = new xyz.adscope.ad.model.impl.resp.basic.ASNPResponse
                org.json.JSONObject r7 = xyz.adscope.common.v2.tool.json.JsonUtil.parseJSONObject(r7)
                r0.<init>(r7)
                boolean r7 = r0.b()
                if (r7 == 0) goto L61
                java.lang.String r7 = r0.a()
                android.content.Context r0 = r6.a
                java.lang.String r3 = xyz.adscope.ad.i0.b()
                java.lang.String r4 = "asnpAdPattern"
                java.lang.String r5 = "101,1001"
                java.lang.String r0 = xyz.adscope.ad.i0.a(r0, r3, r4, r5)
                xyz.adscope.common.v2.encrypt.LinkedEncryptManager r3 = xyz.adscope.common.v2.encrypt.LinkedEncryptManager.getInstance()
                android.content.Context r4 = r6.a
                java.lang.Object r3 = r3.getOrCreateImplement(r4)
                xyz.adscope.common.v2.encrypt.ILinkedEncrypt r3 = (xyz.adscope.common.v2.encrypt.ILinkedEncrypt) r3
                xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r4 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.STEP_BY_STEP
                java.lang.String r7 = r3.decrypt(r7, r0, r4, r2)
                boolean r0 = android.text.TextUtils.isEmpty(r7)
                if (r0 != 0) goto L61
                boolean r0 = xyz.adscope.common.v2.tool.json.JsonUtil.isValidJson(r7)
                if (r0 == 0) goto L61
                xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel r0 = new xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel
                org.json.JSONObject r7 = xyz.adscope.common.v2.tool.json.JsonUtil.parseJSONObject(r7)
                r0.<init>(r7)
                boolean r7 = r0.hasParseException()
                if (r7 == 0) goto L60
                if (r8 == 0) goto L5f
                int r7 = r8.length
                if (r7 <= 0) goto L5f
                xyz.adscope.ad.y0 r7 = xyz.adscope.ad.y0.d
                r8[r2] = r7
            L5f:
                return r1
            L60:
                return r0
            L61:
                if (r8 == 0) goto L6a
                int r7 = r8.length
                if (r7 <= 0) goto L6a
                xyz.adscope.ad.y0 r7 = xyz.adscope.ad.y0.i
                r8[r2] = r7
            L6a:
                return r1
        }

        static /* synthetic */ xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel a(xyz.adscope.ad.d4.d r0, java.lang.String r1, xyz.adscope.ad.y0[] r2) {
                xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel r0 = r0.a(r1, r2)
                return r0
        }

        private void a(xyz.adscope.ad.a2 r6) {
                r5 = this;
                if (r6 == 0) goto L1a
                long r0 = r6.getTimeoutMillion()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L11
                long r0 = r6.getTimeoutMillion()
                goto L13
            L11:
                r0 = 10000(0x2710, double:4.9407E-320)
            L13:
                xyz.adscope.ad.d4$d$a r6 = new xyz.adscope.ad.d4$d$a
                r6.<init>(r5, r0)
                r5.k = r6
            L1a:
                return
        }

        static /* synthetic */ boolean a(xyz.adscope.ad.d4.d r0) {
                boolean r0 = r0.l
                return r0
        }

        static /* synthetic */ boolean a(xyz.adscope.ad.d4.d r0, boolean r1) {
                r0.l = r1
                return r1
        }

        static /* synthetic */ xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask b(xyz.adscope.ad.d4.d r0) {
                xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask r0 = r0.k
                return r0
        }

        static /* synthetic */ boolean c(xyz.adscope.ad.d4.d r0) {
                boolean r0 = r0.j
                return r0
        }

        private java.lang.String g() {
                r2 = this;
                xyz.adscope.ad.f r0 = xyz.adscope.ad.f.a()
                android.content.Context r1 = r2.a
                java.lang.Object r0 = r0.getOrCreateImplement(r1)
                xyz.adscope.ad.e r0 = (xyz.adscope.ad.e) r0
                if (r0 == 0) goto L28
                xyz.adscope.ad.publish.ASNPInitConfig r0 = r0.a()
                if (r0 == 0) goto L1d
                boolean r0 = r0.isUseHttps()
                if (r0 == 0) goto L1d
                java.lang.String r0 = "aHR0cHM6Ly9zZGstYXBpLmFkbi1wbHVzLmNvbS5jbi9hcGkvdjIvYWQvZ2V0QWQ="
                goto L1f
            L1d:
                java.lang.String r0 = "aHR0cDovL3Nkay1hcGkuYWRuLXBsdXMuY29tLmNuL2FwaS92Mi9hZC9nZXRBZA=="
            L1f:
                byte[] r0 = r0.getBytes()
                java.lang.String r0 = xyz.adscope.common.v2.encrypt.impl.Base64Util.decodeToString(r0)
                return r0
            L28:
                r0 = 0
                return r0
        }

        @Override // xyz.adscope.ad.d4.e
        protected boolean e() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                xyz.adscope.ad.d4 r0 = r6.m
                xyz.adscope.ad.a2 r1 = r6.c
                boolean r0 = xyz.adscope.ad.d4.a(r0, r1)
                if (r0 == 0) goto Le
                r6.f()
                return
            Le:
                xyz.adscope.ad.d4 r0 = r6.m
                xyz.adscope.ad.publish.ASNPInitConfig r0 = xyz.adscope.ad.d4.f(r0)
                boolean r0 = r0.getIsTestAd()
                if (r0 == 0) goto L1e
                r6.f()
                return
            L1e:
                r0 = 0
                r6.l = r0
                xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask r0 = r6.k
                if (r0 == 0) goto L28
                r0.startCountDown()
            L28:
                xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r0 = r6.b
                java.lang.String r0 = r6.a(r0)
                xyz.adscope.ad.z0 r1 = new xyz.adscope.ad.z0
                android.content.Context r2 = r6.a
                r1.<init>(r2)
                xyz.adscope.ad.a2 r2 = r6.c
                xyz.adscope.ad.d4 r3 = r6.m
                xyz.adscope.ad.publish.ASNPInitConfig r3 = xyz.adscope.ad.d4.f(r3)
                xyz.adscope.ad.d4 r4 = r6.m
                xyz.adscope.ad.c r4 = xyz.adscope.ad.d4.e(r4)
                xyz.adscope.ad.b1 r5 = r6.g
                java.lang.String r5 = r5.t()
                r1.a(r2, r3, r4, r5)
                xyz.adscope.ad.d4$d$b r2 = new xyz.adscope.ad.d4$d$b
                r2.<init>(r6)
                xyz.adscope.ad.d4 r3 = r6.m
                xyz.adscope.ad.d4.a(r3, r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class e implements java.lang.Runnable {
        protected android.content.Context a;
        protected xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel b;
        protected xyz.adscope.ad.a2 c;
        protected java.util.concurrent.CountDownLatch d;
        private xyz.adscope.ad.d4.g e;
        private xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel f;
        protected xyz.adscope.ad.b1 g;
        protected volatile boolean h;
        private xyz.adscope.ad.y0 i;

        e(android.content.Context r2, xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r3, xyz.adscope.ad.b1 r4, xyz.adscope.ad.a2 r5, java.util.concurrent.CountDownLatch r6) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.h = r0
                r1.a = r2
                r1.b = r3
                r1.g = r4
                r1.c = r5
                r1.d = r6
                return
        }

        xyz.adscope.ad.y0 a() {
                r1 = this;
                xyz.adscope.ad.y0 r0 = r1.i
                return r0
        }

        void a(xyz.adscope.ad.d4.g r1) {
                r0 = this;
                r0.e = r1
                return
        }

        protected void a(xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel r2) {
                r1 = this;
                boolean r0 = r1.h
                if (r0 != 0) goto L6
                r1.f = r2
            L6:
                return
        }

        void a(xyz.adscope.ad.y0 r1) {
                r0 = this;
                r0.i = r1
                return
        }

        xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel b() {
                r1 = this;
                xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel r0 = r1.f
                return r0
        }

        void c() {
                r2 = this;
                xyz.adscope.ad.d4$g r0 = r2.e
                if (r0 == 0) goto L12
                boolean r1 = r2.e()
                if (r1 == 0) goto Ld
                java.lang.String r1 = "RunHttp"
                goto Lf
            Ld:
                java.lang.String r1 = "RunLocal"
            Lf:
                xyz.adscope.ad.d4.g.a(r0, r1)
            L12:
                return
        }

        protected synchronized void d() {
                r1 = this;
                monitor-enter(r1)
                r0 = 1
                r1.h = r0     // Catch: java.lang.Throwable -> L9
                r1.f()     // Catch: java.lang.Throwable -> L9
                monitor-exit(r1)
                return
            L9:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
                throw r0
        }

        protected abstract boolean e();

        protected void f() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.d
                if (r0 == 0) goto La
                r0.countDown()
                r0 = 0
                r1.d = r0
            La:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class f extends xyz.adscope.ad.d4.e {
        private xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask j;
        private xyz.adscope.ad.model.impl.resp.cfg.root.strategy.cache.AdCacheModel k;
        private final xyz.adscope.ad.a l;
        private xyz.adscope.ad.model.impl.db.AdvertisingDBModel m;
        private boolean n;
        final /* synthetic */ xyz.adscope.ad.d4 o;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask {
            final /* synthetic */ xyz.adscope.ad.d4.f a;

            a(xyz.adscope.ad.d4.f r1, long r2) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>(r2)
                    return
            }

            @Override // xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask
            protected void onScheduleTimeout() {
                    r1 = this;
                    xyz.adscope.ad.d4$f r0 = r1.a
                    r0.f()
                    return
            }
        }

        f(xyz.adscope.ad.d4 r1, android.content.Context r2, xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r3, xyz.adscope.ad.b1 r4, xyz.adscope.ad.a2 r5, java.util.concurrent.CountDownLatch r6) {
                r0 = this;
                r0.o = r1
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                r2 = 0
                r1.n = r2
                r0.a(r3)
                xyz.adscope.ad.b r2 = xyz.adscope.ad.b.a()
                android.content.Context r3 = r1.a
                java.lang.Object r2 = r2.getOrCreateImplement(r3)
                xyz.adscope.ad.a r2 = (xyz.adscope.ad.a) r2
                r1.l = r2
                return
        }

        private void a(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r5) {
                r4 = this;
                if (r5 == 0) goto L1d
                xyz.adscope.ad.d4 r0 = r4.o
                xyz.adscope.ad.model.impl.resp.cfg.root.strategy.cache.AdCacheModel r5 = xyz.adscope.ad.d4.a(r0, r5)
                r4.k = r5
                if (r5 == 0) goto L1d
                long r0 = r5.b()
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 <= 0) goto L1d
                xyz.adscope.ad.d4$f$a r5 = new xyz.adscope.ad.d4$f$a
                r5.<init>(r4, r0)
                r4.j = r5
            L1d:
                return
        }

        static /* synthetic */ boolean a(xyz.adscope.ad.d4.f r0) {
                boolean r0 = r0.n
                return r0
        }

        @Override // xyz.adscope.ad.d4.e
        protected void d() {
                r2 = this;
                r0 = 0
                r2.a(r0)
                xyz.adscope.ad.model.impl.db.AdvertisingDBModel r0 = r2.m
                if (r0 == 0) goto Lf
                xyz.adscope.ad.a r1 = r2.l
                if (r1 == 0) goto Lf
                r1.a(r0)
            Lf:
                super.d()
                return
        }

        @Override // xyz.adscope.ad.d4.e
        protected boolean e() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                r0 = 0
                r4.n = r0
                xyz.adscope.ad.d4 r0 = r4.o
                xyz.adscope.ad.a2 r1 = r4.c
                boolean r0 = xyz.adscope.ad.d4.a(r0, r1)
                if (r0 == 0) goto L11
                r4.f()
                return
            L11:
                xyz.adscope.ad.d4 r0 = r4.o
                xyz.adscope.ad.model.impl.resp.cfg.root.strategy.cache.AdCacheModel r1 = r4.k
                boolean r0 = xyz.adscope.ad.d4.a(r0, r1)
                if (r0 != 0) goto L1f
                r4.f()
                return
            L1f:
                xyz.adscope.ad.a r0 = r4.l
                if (r0 == 0) goto L80
                xyz.adscope.ad.a2 r1 = r4.c
                java.lang.String r1 = r1.getSpaceID()
                xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel r0 = r0.b(r1)
                if (r0 != 0) goto L69
                xyz.adscope.ad.a r1 = r4.l
                xyz.adscope.ad.d4 r2 = r4.o
                xyz.adscope.ad.publish.ASNPInitConfig r2 = xyz.adscope.ad.d4.f(r2)
                java.lang.String r2 = r2.getAppId()
                xyz.adscope.ad.a2 r3 = r4.c
                java.lang.String r3 = r3.getSpaceID()
                xyz.adscope.ad.model.impl.db.AdvertisingDBModel r1 = r1.a(r2, r3)
                r4.m = r1
                if (r1 == 0) goto L69
                java.lang.String r1 = r1.a()
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L69
                xyz.adscope.ad.model.impl.db.AdvertisingDBModel r1 = r4.m
                java.lang.String r1 = r1.a()
                xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel r2 = new xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel
                org.json.JSONObject r1 = xyz.adscope.common.v2.tool.json.JsonUtil.parseJSONObject(r1)
                r2.<init>(r1)
                boolean r1 = r2.hasParseException()
                if (r1 != 0) goto L69
                r0 = r2
            L69:
                if (r0 == 0) goto L80
                r4.a(r0)
                r0 = 1
                r4.n = r0
                xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask r0 = r4.j
                if (r0 == 0) goto L79
                r0.startCountDown()
                return
            L79:
                r4.c()
                r4.f()
                return
            L80:
                r4.f()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class g {
        private final java.lang.Object a;
        private final java.util.Map<java.lang.String, xyz.adscope.ad.d4.e> b;

        private g(java.util.Map<java.lang.String, xyz.adscope.ad.d4.e> r2) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.a = r0
                r1.b = r2
                return
        }

        /* synthetic */ g(java.util.Map r1, xyz.adscope.ad.d4.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void a(java.lang.String r3) {
                r2 = this;
                java.lang.Object r0 = r2.a
                monitor-enter(r0)
                java.util.Map<java.lang.String, xyz.adscope.ad.d4$e> r1 = r2.b     // Catch: java.lang.Throwable -> L18
                if (r1 == 0) goto L1a
                java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L18
                xyz.adscope.ad.d4$e r3 = (xyz.adscope.ad.d4.e) r3     // Catch: java.lang.Throwable -> L18
                if (r3 == 0) goto L1a
                r3.d()     // Catch: java.lang.Throwable -> L18
                java.util.Map<java.lang.String, xyz.adscope.ad.d4$e> r3 = r2.b     // Catch: java.lang.Throwable -> L18
                r3.clear()     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
                r3 = move-exception
                goto L1c
            L1a:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                return
            L1c:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                throw r3
        }

        static /* synthetic */ void a(xyz.adscope.ad.d4.g r0, java.lang.String r1) {
                r0.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class h extends xyz.adscope.ad.d4.e {
        final /* synthetic */ xyz.adscope.ad.d4 j;

        h(xyz.adscope.ad.d4 r1, android.content.Context r2, xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r3, xyz.adscope.ad.b1 r4, xyz.adscope.ad.a2 r5, java.util.concurrent.CountDownLatch r6) {
                r0 = this;
                r0.j = r1
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                return
        }

        private boolean b(xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel r3) {
                r2 = this;
                r0 = 0
                if (r3 == 0) goto L3c
                xyz.adscope.ad.d4 r1 = r2.j
                java.util.List r3 = xyz.adscope.ad.d4.a(r1, r3)
                if (r3 == 0) goto L3c
                boolean r1 = r3.isEmpty()
                if (r1 != 0) goto L3c
                java.lang.Object r3 = r3.get(r0)
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r3 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel) r3
                if (r3 == 0) goto L3c
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.MediaModel r1 = r3.d()
                if (r1 == 0) goto L3c
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.MediaModel r3 = r3.d()
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.AdModel r3 = r3.a()
                if (r3 == 0) goto L3c
                xyz.adscope.ad.a2 r0 = r2.c
                xyz.adscope.ad.c r0 = r0.getAdType()
                java.lang.String r0 = r0.b()
                java.lang.String r3 = r3.a()
                boolean r3 = r0.equals(r3)
                return r3
            L3c:
                return r0
        }

        @Override // xyz.adscope.ad.d4.e
        protected boolean e() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                xyz.adscope.ad.a2 r0 = r2.c
                xyz.adscope.ad.r5 r0 = r0.getS2SAdImpl()
                if (r0 == 0) goto L2e
                org.json.JSONObject r0 = r0.b()
                if (r0 == 0) goto L2e
                xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel r1 = new xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel
                r1.<init>(r0)
                boolean r0 = r1.hasParseException()
                if (r0 == 0) goto L1f
                xyz.adscope.ad.y0 r0 = xyz.adscope.ad.y0.d
                r2.a(r0)
                goto L2e
            L1f:
                boolean r0 = r2.b(r1)
                if (r0 == 0) goto L29
                r2.a(r1)
                goto L2e
            L29:
                xyz.adscope.ad.y0 r0 = xyz.adscope.ad.y0.r
                r2.a(r0)
            L2e:
                r2.f()
                return
        }
    }

    public d4(android.content.Context r3, xyz.adscope.ad.c r4) {
            r2 = this;
            r2.<init>(r3)
            xyz.adscope.ad.d4$b r0 = new xyz.adscope.ad.d4$b
            r1 = 0
            r0.<init>(r3, r1)
            r2.b = r0
            android.util.ArrayMap r3 = new android.util.ArrayMap
            r3.<init>()
            r2.d = r3
            r2.c = r4
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r3 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            android.content.Context r4 = r2.a
            java.lang.Object r3 = r3.getOrCreateImplement(r4)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r3 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r3
            r2.f = r3
            return
    }

    private java.util.List<xyz.adscope.ad.s3> a(java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel> r5, xyz.adscope.ad.a2 r6, xyz.adscope.ad.b1 r7) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r5.next()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r1 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel) r1
            xyz.adscope.ad.b1 r2 = r7.a()
            r2.a(r1)
            android.content.Context r3 = r4.a
            xyz.adscope.ad.s3 r1 = xyz.adscope.ad.s3.a.a(r3, r1, r6, r2)
            r0.add(r1)
            goto L9
        L26:
            return r0
    }

    static /* synthetic */ java.util.List a(xyz.adscope.ad.d4 r0, java.util.List r1, xyz.adscope.ad.a2 r2, xyz.adscope.ad.b1 r3) {
            java.util.List r0 = r0.a(r1, r2, r3)
            return r0
    }

    static /* synthetic */ java.util.List a(xyz.adscope.ad.d4 r0, xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel r1) {
            java.util.List r0 = r0.a(r1)
            return r0
    }

    private java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel> a(xyz.adscope.ad.model.impl.resp.ad.resp.AdResponseModel r7) {
            r6 = this;
            java.util.List r7 = r7.b()
            if (r7 == 0) goto L68
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L68
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L15:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r7.next()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.SeatBidModel r1 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.SeatBidModel) r1
            java.util.List r2 = r1.a()
            if (r2 == 0) goto L15
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L15
            java.util.Iterator r2 = r2.iterator()
        L31:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L15
            java.lang.Object r3 = r2.next()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r3 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel) r3
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.ext.SeatExtModel r4 = r1.b()
            java.lang.String r5 = ""
            if (r4 == 0) goto L4e
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.ext.SeatExtModel r4 = r1.b()
            java.lang.String r4 = r4.a()
            goto L4f
        L4e:
            r4 = r5
        L4f:
            r3.a(r4)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.ext.SeatExtModel r4 = r1.b()
            if (r4 == 0) goto L60
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.ext.SeatExtModel r4 = r1.b()
            java.lang.String r5 = r4.b()
        L60:
            r3.b(r5)
            r0.add(r3)
            goto L31
        L67:
            return r0
        L68:
            r7 = 0
            return r7
    }

    static /* synthetic */ xyz.adscope.ad.model.impl.resp.cfg.root.strategy.cache.AdCacheModel a(xyz.adscope.ad.d4 r0, xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r1) {
            xyz.adscope.ad.model.impl.resp.cfg.root.strategy.cache.AdCacheModel r0 = r0.a(r1)
            return r0
    }

    private xyz.adscope.ad.model.impl.resp.cfg.root.strategy.cache.AdCacheModel a(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r3) {
            r2 = this;
            if (r3 == 0) goto L1e
            java.util.List r3 = r3.j()
            xyz.adscope.ad.a2 r0 = r2.g
            java.lang.String r0 = r0.getSpaceID()
            xyz.adscope.ad.d4$a r1 = new xyz.adscope.ad.d4$a
            r1.<init>(r2)
            java.lang.Object r3 = xyz.adscope.common.v2.tool.collection.CollectionFetch.fetchFirstFromList(r3, r0, r1)
            xyz.adscope.ad.model.impl.resp.cfg.root.strategy.StrategyModel r3 = (xyz.adscope.ad.model.impl.resp.cfg.root.strategy.StrategyModel) r3
            if (r3 == 0) goto L1e
            xyz.adscope.ad.model.impl.resp.cfg.root.strategy.cache.AdCacheModel r3 = r3.a()
            return r3
        L1e:
            r3 = 0
            return r3
    }

    static /* synthetic */ xyz.adscope.common.v2.thread.pool.IBaseThreadPool a(xyz.adscope.ad.d4 r0) {
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = r0.f
            return r0
    }

    static /* synthetic */ void a(xyz.adscope.ad.d4 r0, java.lang.String r1, xyz.adscope.ad.p2 r2, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r3) {
            r0.a(r1, r2, r3)
            return
    }

    private boolean a(xyz.adscope.ad.a2 r2) {
            r1 = this;
            r0 = 0
            if (r2 == 0) goto Lb
            xyz.adscope.ad.r5 r2 = r2.getS2SAdImpl()
            if (r2 == 0) goto Lb
            r2 = 1
            return r2
        Lb:
            return r0
    }

    static /* synthetic */ boolean a(xyz.adscope.ad.d4 r0, xyz.adscope.ad.a2 r1) {
            boolean r0 = r0.a(r1)
            return r0
    }

    static /* synthetic */ boolean a(xyz.adscope.ad.d4 r0, xyz.adscope.ad.model.impl.resp.cfg.root.strategy.cache.AdCacheModel r1) {
            boolean r0 = r0.a(r1)
            return r0
    }

    private boolean a(xyz.adscope.ad.model.impl.resp.cfg.root.strategy.cache.AdCacheModel r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto Lb
            int r3 = r3.a()
            r1 = 1
            if (r3 != r1) goto Lb
            return r1
        Lb:
            return r0
    }

    static /* synthetic */ android.content.Context b(xyz.adscope.ad.d4 r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* synthetic */ android.content.Context c(xyz.adscope.ad.d4 r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* synthetic */ xyz.adscope.ad.d4.b d(xyz.adscope.ad.d4 r0) {
            xyz.adscope.ad.d4$b r0 = r0.b
            return r0
    }

    static /* synthetic */ xyz.adscope.ad.c e(xyz.adscope.ad.d4 r0) {
            xyz.adscope.ad.c r0 = r0.c
            return r0
    }

    static /* synthetic */ xyz.adscope.ad.publish.ASNPInitConfig f(xyz.adscope.ad.d4 r0) {
            xyz.adscope.ad.publish.ASNPInitConfig r0 = r0.e
            return r0
    }

    static /* synthetic */ android.content.Context g(xyz.adscope.ad.d4 r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* synthetic */ android.content.Context h(xyz.adscope.ad.d4 r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* synthetic */ android.content.Context i(xyz.adscope.ad.d4 r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* synthetic */ android.content.Context j(xyz.adscope.ad.d4 r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* synthetic */ android.content.Context k(xyz.adscope.ad.d4 r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* synthetic */ java.util.Map l(xyz.adscope.ad.d4 r0) {
            java.util.Map<java.lang.String, xyz.adscope.ad.d4$e> r0 = r0.d
            return r0
    }

    @Override // xyz.adscope.ad.e2
    public void a(xyz.adscope.ad.e3 r2) {
            r1 = this;
            xyz.adscope.ad.d4$b r0 = r1.b
            xyz.adscope.ad.d4.b.a(r0, r2)
            return
    }

    @Override // xyz.adscope.ad.e2
    public void a(xyz.adscope.ad.publish.ASNPInitConfig r7, xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r8, xyz.adscope.ad.a2 r9, xyz.adscope.ad.b1 r10) {
            r6 = this;
            r6.e = r7
            r6.g = r9
            xyz.adscope.ad.d4$c r0 = new xyz.adscope.ad.d4$c
            r5 = 0
            r1 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r7 = r1.f
            if (r7 == 0) goto L15
            r7.executeBasicAsyncTask(r0)
        L15:
            return
    }
}
