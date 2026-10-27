package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class q extends xyz.adscope.ad.n2 implements xyz.adscope.ad.g2 {
    private final xyz.adscope.ad.e b;
    private xyz.adscope.ad.publish.ASNPInitConfig c;
    private final xyz.adscope.ad.q.e d;
    private final xyz.adscope.ad.q.d e;
    private final xyz.adscope.ad.c3 f;
    private final xyz.adscope.common.v2.thread.pool.IBaseThreadPool g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b implements xyz.adscope.ad.c3 {
        private final xyz.adscope.ad.q.c a;
        private boolean b;
        final /* synthetic */ xyz.adscope.ad.q c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends xyz.adscope.ad.q.c {
            final /* synthetic */ xyz.adscope.ad.q.b d;

            a(xyz.adscope.ad.q.b r2, boolean r3) {
                    r1 = this;
                    r1.d = r2
                    xyz.adscope.ad.q r2 = r2.c
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            @Override // xyz.adscope.ad.q.c
            protected void a() {
                    r2 = this;
                    xyz.adscope.ad.q$b r0 = r2.d
                    r1 = 0
                    xyz.adscope.ad.q.b.a(r0, r1)
                    super.a()
                    return
            }

            @Override // xyz.adscope.ad.q.c
            protected void a(xyz.adscope.ad.o r3) {
                    r2 = this;
                    xyz.adscope.ad.q$b r0 = r2.d
                    r1 = 0
                    xyz.adscope.ad.q.b.a(r0, r1)
                    super.a(r3)
                    return
            }
        }

        private b(xyz.adscope.ad.q r2) {
                r1 = this;
                r1.c = r2
                r1.<init>()
                xyz.adscope.ad.q$b$a r2 = new xyz.adscope.ad.q$b$a
                r0 = 0
                r2.<init>(r1, r0)
                r1.a = r2
                r1.b = r0
                return
        }

        /* synthetic */ b(xyz.adscope.ad.q r1, xyz.adscope.ad.q.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ boolean a(xyz.adscope.ad.q.b r0, boolean r1) {
                r0.b = r1
                return r1
        }

        @Override // xyz.adscope.ad.c3
        public void a() {
                r2 = this;
                boolean r0 = r2.b
                if (r0 != 0) goto L21
                xyz.adscope.ad.q r0 = r2.c
                xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = xyz.adscope.ad.q.k(r0)
                if (r0 == 0) goto L21
                java.lang.String r0 = "ASNPInitRouter"
                java.lang.String r1 = "请求强制更新Global配置..."
                xyz.adscope.common.v2.log.SDKLog.d(r0, r1)
                r0 = 1
                r2.b = r0
                xyz.adscope.ad.q r0 = r2.c
                xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = xyz.adscope.ad.q.k(r0)
                xyz.adscope.ad.q$c r1 = r2.a
                r0.executeInitAsyncTask(r1)
            L21:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements java.lang.Runnable {
        private final xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask a;
        private boolean b;
        final /* synthetic */ xyz.adscope.ad.q c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask {
            final /* synthetic */ xyz.adscope.ad.q a;
            final /* synthetic */ xyz.adscope.ad.q.c b;

            a(xyz.adscope.ad.q.c r1, long r2, xyz.adscope.ad.q r4) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r4
                    r0.<init>(r2)
                    return
            }

            @Override // xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask
            protected void onScheduleTimeout() {
                    r2 = this;
                    xyz.adscope.ad.q$c r0 = r2.b
                    xyz.adscope.ad.o r1 = xyz.adscope.ad.o.i
                    r0.a(r1)
                    xyz.adscope.ad.q$c r0 = r2.b
                    xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask r0 = xyz.adscope.ad.q.c.b(r0)
                    r0.cancelCountDown()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b implements xyz.adscope.common.v2.conn.IBaseHttpResponseCallback {
            final /* synthetic */ xyz.adscope.ad.q.c a;

            b(xyz.adscope.ad.q.c r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // xyz.adscope.common.v2.conn.IBaseHttpResponseCallback
            public void failCallback(xyz.adscope.common.v2.conn.IHttpRequestError r3) {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "服务器请求失败 "
                    r0.append(r1)
                    int r1 = r3.getErrorCode()
                    r0.append(r1)
                    java.lang.String r1 = " "
                    r0.append(r1)
                    java.lang.String r3 = r3.getErrorMessage()
                    r0.append(r3)
                    java.lang.String r3 = r0.toString()
                    java.lang.String r0 = "ASNPInitRouter"
                    xyz.adscope.common.v2.log.SDKLog.e(r0, r3)
                    xyz.adscope.ad.q$c r3 = r2.a
                    xyz.adscope.ad.o r0 = xyz.adscope.ad.o.f
                    r3.a(r0)
                    return
            }

            @Override // xyz.adscope.common.v2.conn.IBaseHttpResponseCallback
            public void successCallback(xyz.adscope.common.v2.conn.IBaseHttpResponse r4) {
                    r3 = this;
                    r0 = 1
                    xyz.adscope.ad.o[] r1 = new xyz.adscope.ad.o[r0]
                    xyz.adscope.ad.q$c r2 = r3.a
                    java.lang.String r4 = r4.getResponseResult()
                    xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r4 = xyz.adscope.ad.q.c.a(r2, r4, r1)
                    r2 = 0
                    if (r4 == 0) goto L21
                    xyz.adscope.ad.q$c r1 = r3.a
                    xyz.adscope.ad.q r1 = r1.c
                    xyz.adscope.ad.e r1 = xyz.adscope.ad.q.l(r1)
                    r1.a(r4, r0, r2)
                    xyz.adscope.ad.q$c r4 = r3.a
                    r4.a()
                    return
                L21:
                    xyz.adscope.ad.q$c r4 = r3.a
                    r0 = r1[r2]
                    if (r0 == 0) goto L28
                    goto L2a
                L28:
                    xyz.adscope.ad.o r0 = xyz.adscope.ad.o.e
                L2a:
                    r4.a(r0)
                    return
            }
        }

        private c(xyz.adscope.ad.q r3, boolean r4) {
                r2 = this;
                r2.c = r3
                r2.<init>()
                r2.b = r4
                xyz.adscope.ad.q$c$a r4 = new xyz.adscope.ad.q$c$a
                r0 = 10000(0x2710, double:4.9407E-320)
                r4.<init>(r2, r0, r3)
                r2.a = r4
                return
        }

        /* synthetic */ c(xyz.adscope.ad.q r1, boolean r2, xyz.adscope.ad.q.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private java.lang.String a(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r2) {
                r1 = this;
                if (r2 == 0) goto L17
                xyz.adscope.ad.model.impl.resp.cfg.root.requrl.RequestUrlModel r0 = r2.f()
                if (r0 == 0) goto L17
                xyz.adscope.ad.model.impl.resp.cfg.root.requrl.RequestUrlModel r2 = r2.f()
                java.lang.String r2 = r2.b()
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 != 0) goto L17
                return r2
            L17:
                java.lang.String r2 = r1.b()
                return r2
        }

        private xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel a(java.lang.String r7, xyz.adscope.ad.o[] r8) {
                r6 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r7)
                r1 = 0
                r2 = 0
                if (r0 != 0) goto L69
                xyz.adscope.ad.model.impl.resp.basic.ASNPResponse r0 = new xyz.adscope.ad.model.impl.resp.basic.ASNPResponse
                org.json.JSONObject r7 = xyz.adscope.common.v2.tool.json.JsonUtil.parseJSONObject(r7)
                r0.<init>(r7)
                boolean r7 = r0.b()
                if (r7 == 0) goto L69
                java.lang.String r7 = r0.a()
                xyz.adscope.ad.q r0 = r6.c
                android.content.Context r0 = xyz.adscope.ad.q.c(r0)
                java.lang.String r3 = xyz.adscope.ad.i0.b()
                java.lang.String r4 = "asnpCfgPattern"
                java.lang.String r5 = "101,1001"
                java.lang.String r0 = xyz.adscope.ad.i0.a(r0, r3, r4, r5)
                xyz.adscope.common.v2.encrypt.LinkedEncryptManager r3 = xyz.adscope.common.v2.encrypt.LinkedEncryptManager.getInstance()
                xyz.adscope.ad.q r4 = r6.c
                android.content.Context r4 = xyz.adscope.ad.q.d(r4)
                java.lang.Object r3 = r3.getOrCreateImplement(r4)
                xyz.adscope.common.v2.encrypt.ILinkedEncrypt r3 = (xyz.adscope.common.v2.encrypt.ILinkedEncrypt) r3
                xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r4 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.STEP_BY_STEP
                java.lang.String r7 = r3.decrypt(r7, r0, r4, r2)
                boolean r0 = android.text.TextUtils.isEmpty(r7)
                if (r0 != 0) goto L69
                boolean r0 = xyz.adscope.common.v2.tool.json.JsonUtil.isValidJson(r7)
                if (r0 == 0) goto L69
                xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r0 = new xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel
                org.json.JSONObject r7 = xyz.adscope.common.v2.tool.json.JsonUtil.parseJSONObject(r7)
                r0.<init>(r7)
                boolean r7 = r0.hasParseException()
                if (r7 == 0) goto L68
                if (r8 == 0) goto L67
                int r7 = r8.length
                if (r7 <= 0) goto L67
                xyz.adscope.ad.o r7 = xyz.adscope.ad.o.e
                r8[r2] = r7
            L67:
                return r1
            L68:
                return r0
            L69:
                if (r8 == 0) goto L72
                int r7 = r8.length
                if (r7 <= 0) goto L72
                xyz.adscope.ad.o r7 = xyz.adscope.ad.o.f
                r8[r2] = r7
            L72:
                return r1
        }

        static /* synthetic */ xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel a(xyz.adscope.ad.q.c r0, java.lang.String r1, xyz.adscope.ad.o[] r2) {
                xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r0 = r0.a(r1, r2)
                return r0
        }

        static /* synthetic */ void a(xyz.adscope.ad.q.c r0) {
                r0.c()
                return
        }

        private java.lang.String b() {
                r1 = this;
                xyz.adscope.ad.q r0 = r1.c
                xyz.adscope.ad.publish.ASNPInitConfig r0 = xyz.adscope.ad.q.n(r0)
                if (r0 == 0) goto L17
                xyz.adscope.ad.q r0 = r1.c
                xyz.adscope.ad.publish.ASNPInitConfig r0 = xyz.adscope.ad.q.n(r0)
                boolean r0 = r0.isUseHttps()
                if (r0 == 0) goto L17
                java.lang.String r0 = "aHR0cHM6Ly9zZGstYXBpLmFkbi1wbHVzLmNvbS5jbi9hcGkvdjEvY2ZnL2dldENvbmZpZw=="
                goto L19
            L17:
                java.lang.String r0 = "aHR0cDovL3Nkay1hcGkuYWRuLXBsdXMuY29tLmNuL2FwaS92MS9jZmcvZ2V0Q29uZmln"
            L19:
                byte[] r0 = r0.getBytes()
                java.lang.String r0 = xyz.adscope.common.v2.encrypt.impl.Base64Util.decodeToString(r0)
                return r0
        }

        static /* synthetic */ xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask b(xyz.adscope.ad.q.c r0) {
                xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask r0 = r0.a
                return r0
        }

        private void c() {
                r1 = this;
                r0 = 0
                r1.b = r0
                return
        }

        protected void a() {
                r1 = this;
                xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask r0 = r1.a
                if (r0 == 0) goto L7
                r0.cancelCountDown()
            L7:
                xyz.adscope.ad.q r0 = r1.c
                xyz.adscope.ad.q.a(r0)
                boolean r0 = r1.b
                if (r0 == 0) goto L15
                xyz.adscope.ad.q r0 = r1.c
                xyz.adscope.ad.q.b(r0)
            L15:
                return
        }

        protected void a(xyz.adscope.ad.o r2) {
                r1 = this;
                xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask r0 = r1.a
                if (r0 == 0) goto L7
                r0.cancelCountDown()
            L7:
                boolean r0 = r1.b
                if (r0 == 0) goto L10
                xyz.adscope.ad.q r0 = r1.c
                xyz.adscope.ad.q.a(r0, r2)
            L10:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask r0 = r4.a
                r0.startCountDown()
                xyz.adscope.ad.q r0 = r4.c
                xyz.adscope.ad.e r0 = xyz.adscope.ad.q.l(r0)
                r1 = 0
                xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r0 = r0.a(r1)
                java.lang.String r0 = r4.a(r0)
                xyz.adscope.ad.j1 r1 = new xyz.adscope.ad.j1
                xyz.adscope.ad.q r2 = r4.c
                android.content.Context r2 = xyz.adscope.ad.q.m(r2)
                xyz.adscope.ad.q r3 = r4.c
                xyz.adscope.ad.publish.ASNPInitConfig r3 = xyz.adscope.ad.q.n(r3)
                java.lang.String r3 = r3.getAppId()
                r1.<init>(r2, r3)
                xyz.adscope.ad.q$c$b r2 = new xyz.adscope.ad.q$c$b
                r2.<init>(r4)
                xyz.adscope.ad.q r3 = r4.c
                xyz.adscope.ad.q.a(r3, r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class d implements java.lang.Runnable {
        private final xyz.adscope.ad.q.c a;
        private final xyz.adscope.ad.q.g b;
        final /* synthetic */ xyz.adscope.ad.q c;

        private d(xyz.adscope.ad.q r6) {
                r5 = this;
                r5.c = r6
                r5.<init>()
                xyz.adscope.ad.q$c r0 = new xyz.adscope.ad.q$c
                r1 = 1
                r2 = 0
                r0.<init>(r6, r1, r2)
                r5.a = r0
                xyz.adscope.ad.q$g r0 = new xyz.adscope.ad.q$g
                xyz.adscope.ad.q$f r1 = new xyz.adscope.ad.q$f
                xyz.adscope.ad.q$c r3 = new xyz.adscope.ad.q$c
                r4 = 0
                r3.<init>(r6, r4, r2)
                r1.<init>(r6, r3, r2)
                r0.<init>(r6, r1, r2)
                r5.b = r0
                return
        }

        /* synthetic */ d(xyz.adscope.ad.q r1, xyz.adscope.ad.q.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void a() {
                r1 = this;
                xyz.adscope.ad.q r0 = r1.c
                xyz.adscope.ad.e r0 = xyz.adscope.ad.q.l(r0)
                if (r0 == 0) goto L11
                xyz.adscope.ad.q r0 = r1.c
                xyz.adscope.ad.e r0 = xyz.adscope.ad.q.l(r0)
                r0.f()
            L11:
                return
        }

        private void b() {
                r1 = this;
                xyz.adscope.ad.q$g r0 = r1.b
                xyz.adscope.ad.q.g.a(r0)
                return
        }

        private void c() {
                r1 = this;
                xyz.adscope.ad.q$c r0 = r1.a
                r0.run()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                xyz.adscope.ad.q r0 = r3.c
                android.content.Context r0 = xyz.adscope.ad.q.f(r0)
                boolean r0 = xyz.adscope.ad.g.c(r0)
                if (r0 == 0) goto L10
                r3.c()
                return
            L10:
                r3.b()
                r3.a()
                xyz.adscope.ad.q r0 = r3.c
                xyz.adscope.ad.e r0 = xyz.adscope.ad.q.l(r0)
                if (r0 == 0) goto L62
                long r0 = java.lang.System.currentTimeMillis()
                xyz.adscope.ad.q r2 = r3.c
                xyz.adscope.ad.e r2 = xyz.adscope.ad.q.l(r2)
                boolean r2 = r2.d()
                if (r2 == 0) goto L5e
                xyz.adscope.ad.q r2 = r3.c
                xyz.adscope.ad.e r2 = xyz.adscope.ad.q.l(r2)
                boolean r2 = r2.b(r0)
                if (r2 == 0) goto L3e
                r3.c()
                return
            L3e:
                xyz.adscope.ad.q r2 = r3.c
                xyz.adscope.ad.e r2 = xyz.adscope.ad.q.l(r2)
                boolean r0 = r2.c(r0)
                if (r0 == 0) goto L58
                xyz.adscope.ad.q$c r0 = r3.a
                xyz.adscope.ad.q.c.a(r0)
                r3.c()
                xyz.adscope.ad.q r0 = r3.c
                xyz.adscope.ad.q.b(r0)
                return
            L58:
                xyz.adscope.ad.q r0 = r3.c
                xyz.adscope.ad.q.b(r0)
                return
            L5e:
                r3.c()
                return
            L62:
                xyz.adscope.ad.q r0 = r3.c
                xyz.adscope.ad.o r1 = xyz.adscope.ad.o.j
                xyz.adscope.ad.q.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class e extends xyz.adscope.ad.n {
        private xyz.adscope.ad.f3 b;

        private e(android.content.Context r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* synthetic */ e(android.content.Context r1, xyz.adscope.ad.q.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void a(xyz.adscope.ad.f3 r1) {
                r0 = this;
                r0.b = r1
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.q.e r0, xyz.adscope.ad.f3 r1) {
                r0.a(r1)
                return
        }

        @Override // xyz.adscope.ad.n
        public void a(android.os.Message r3) {
                r2 = this;
                if (r3 == 0) goto L2a
                xyz.adscope.ad.f3 r0 = r2.b
                if (r0 == 0) goto L2a
                int r1 = r3.what
                if (r1 == 0) goto L19
                r3 = 1
                if (r1 == r3) goto L15
                r3 = 2
                if (r1 == r3) goto L11
                goto L2a
            L11:
                r0.a()
                return
            L15:
                r0.initSuccess()
                return
            L19:
                java.lang.Object r3 = r3.obj
                boolean r1 = r3 instanceof xyz.adscope.ad.o
                if (r1 == 0) goto L25
                xyz.adscope.ad.o r3 = (xyz.adscope.ad.o) r3
                r0.a(r3)
                return
            L25:
                xyz.adscope.ad.o r3 = xyz.adscope.ad.o.j
                r0.a(r3)
            L2a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class f implements java.lang.Runnable {
        private final xyz.adscope.ad.q.c a;
        final /* synthetic */ xyz.adscope.ad.q b;

        private f(xyz.adscope.ad.q r1, xyz.adscope.ad.q.c r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        /* synthetic */ f(xyz.adscope.ad.q r1, xyz.adscope.ad.q.c r2, xyz.adscope.ad.q.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                xyz.adscope.ad.f r0 = xyz.adscope.ad.f.a()
                xyz.adscope.ad.q r1 = r3.b
                android.content.Context r1 = xyz.adscope.ad.q.e(r1)
                java.lang.Object r0 = r0.getOrCreateImplement(r1)
                xyz.adscope.ad.e r0 = (xyz.adscope.ad.e) r0
                long r1 = java.lang.System.currentTimeMillis()
                xyz.adscope.ad.e$a r0 = r0.a(r1)
                xyz.adscope.ad.e$a r1 = xyz.adscope.ad.e.a.c
                if (r0 == r1) goto L21
                xyz.adscope.ad.q$c r0 = r3.a
                r0.run()
            L21:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class g extends xyz.adscope.common.v2.thread.pool.IRemoveAbleScheduledTask {
        private final xyz.adscope.ad.d3 a;
        final /* synthetic */ xyz.adscope.ad.q b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements xyz.adscope.ad.d3 {
            final /* synthetic */ xyz.adscope.ad.q.g a;

            a(xyz.adscope.ad.q.g r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            private java.lang.String a(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r4, java.lang.String r5) {
                    r3 = this;
                    if (r4 == 0) goto L20
                    xyz.adscope.common.v2.encrypt.LinkedEncryptManager r0 = xyz.adscope.common.v2.encrypt.LinkedEncryptManager.getInstance()
                    xyz.adscope.ad.q$g r1 = r3.a
                    xyz.adscope.ad.q r1 = r1.b
                    android.content.Context r1 = xyz.adscope.ad.q.j(r1)
                    java.lang.Object r0 = r0.getOrCreateImplement(r1)
                    xyz.adscope.common.v2.encrypt.ILinkedEncrypt r0 = (xyz.adscope.common.v2.encrypt.ILinkedEncrypt) r0
                    java.lang.String r4 = r4.toJsonString()
                    xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r1 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.STEP_BY_STEP
                    r2 = 0
                    java.lang.String r4 = r0.encrypt(r4, r5, r1, r2)
                    return r4
                L20:
                    java.lang.String r4 = ""
                    return r4
            }

            @Override // xyz.adscope.ad.d3
            public void a(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r3, xyz.adscope.ad.e.a r4, boolean r5) {
                    r2 = this;
                    xyz.adscope.ad.q$g r4 = r2.a
                    xyz.adscope.ad.q.g.b(r4)
                    xyz.adscope.ad.q$g r4 = r2.a
                    xyz.adscope.ad.q.g.a(r4, r3)
                    if (r5 == 0) goto L4f
                    xyz.adscope.ad.q$g r4 = r2.a
                    xyz.adscope.ad.q r4 = r4.b
                    android.content.Context r4 = xyz.adscope.ad.q.g(r4)
                    java.lang.String r5 = xyz.adscope.ad.i0.b()
                    java.lang.String r0 = "asnpCfgPattern"
                    java.lang.String r1 = "101,1001"
                    xyz.adscope.ad.i0.b(r4, r5, r0, r1)
                    java.lang.String r3 = r2.a(r3, r1)
                    boolean r4 = android.text.TextUtils.isEmpty(r3)
                    if (r4 != 0) goto L4f
                    xyz.adscope.ad.q$g r4 = r2.a
                    xyz.adscope.ad.q r4 = r4.b
                    android.content.Context r4 = xyz.adscope.ad.q.h(r4)
                    java.lang.String r5 = xyz.adscope.ad.i0.b()
                    java.lang.String r0 = "asnpConfig"
                    xyz.adscope.ad.i0.b(r4, r5, r0, r3)
                    xyz.adscope.ad.q$g r3 = r2.a
                    xyz.adscope.ad.q r3 = r3.b
                    android.content.Context r3 = xyz.adscope.ad.q.i(r3)
                    java.lang.String r4 = xyz.adscope.ad.i0.b()
                    long r0 = java.lang.System.currentTimeMillis()
                    java.lang.String r5 = "asnpConfigLast"
                    xyz.adscope.ad.i0.b(r3, r4, r5, r0)
                L4f:
                    return
            }
        }

        private g(xyz.adscope.ad.q r1, java.lang.Runnable r2) {
                r0 = this;
                r0.b = r1
                r0.<init>(r2)
                xyz.adscope.ad.q$g$a r1 = new xyz.adscope.ad.q$g$a
                r1.<init>(r0)
                r0.a = r1
                return
        }

        /* synthetic */ g(xyz.adscope.ad.q r1, java.lang.Runnable r2, xyz.adscope.ad.q.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private void a() {
                r2 = this;
                xyz.adscope.ad.q r0 = r2.b
                xyz.adscope.ad.e r0 = xyz.adscope.ad.q.l(r0)
                if (r0 == 0) goto L13
                xyz.adscope.ad.q r0 = r2.b
                xyz.adscope.ad.e r0 = xyz.adscope.ad.q.l(r0)
                xyz.adscope.ad.d3 r1 = r2.a
                r0.a(r1)
            L13:
                return
        }

        private void a(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r13) {
                r12 = this;
                if (r13 == 0) goto L27
                xyz.adscope.ad.model.impl.resp.cfg.root.update.UpdateModel r0 = r13.n()
                if (r0 == 0) goto L27
                xyz.adscope.ad.model.impl.resp.cfg.root.update.UpdateModel r13 = r13.n()
                int r13 = r13.a()
                if (r13 <= 0) goto L1b
                long r1 = (long) r13
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
                r3 = r1
                r0 = r12
                r0.startScheduled(r1, r3, r5)
                return
            L1b:
                java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
                r7 = 60000(0xea60, double:2.9644E-319)
                r9 = 60000(0xea60, double:2.9644E-319)
                r6 = r12
                r6.startScheduled(r7, r9, r11)
            L27:
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.q.g r0) {
                r0.a()
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.q.g r0, xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r1) {
                r0.a(r1)
                return
        }

        static /* synthetic */ void b(xyz.adscope.ad.q.g r0) {
                r0.stopScheduled()
                return
        }
    }

    q(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            xyz.adscope.ad.f r0 = xyz.adscope.ad.f.a()
            android.content.Context r1 = r2.a
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.ad.e r0 = (xyz.adscope.ad.e) r0
            r2.b = r0
            xyz.adscope.ad.q$d r0 = new xyz.adscope.ad.q$d
            r1 = 0
            r0.<init>(r2, r1)
            r2.e = r0
            xyz.adscope.ad.q$e r0 = new xyz.adscope.ad.q$e
            r0.<init>(r3, r1)
            r2.d = r0
            xyz.adscope.ad.q$b r0 = new xyz.adscope.ad.q$b
            r0.<init>(r2, r1)
            r2.f = r0
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            java.lang.Object r3 = r0.getOrCreateImplement(r3)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r3 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r3
            r2.g = r3
            return
    }

    private void a() {
            r2 = this;
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = r2.g
            if (r0 == 0) goto L9
            xyz.adscope.ad.q$d r1 = r2.e
            r0.executeInitAsyncTask(r1)
        L9:
            return
    }

    private void a(xyz.adscope.ad.o r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "初始化失败..."
            r0.append(r1)
            int r1 = r3.b()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r3.c()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ASNPInitRouter"
            xyz.adscope.common.v2.log.SDKLog.e(r1, r0)
            android.os.Message r0 = android.os.Message.obtain()
            r1 = 0
            r0.what = r1
            r0.obj = r3
            xyz.adscope.ad.q$e r3 = r2.d
            r3.sendMessage(r0)
            return
    }

    static /* synthetic */ void a(xyz.adscope.ad.q r0) {
            r0.c()
            return
    }

    static /* synthetic */ void a(xyz.adscope.ad.q r0, java.lang.String r1, xyz.adscope.ad.p2 r2, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r3) {
            r0.a(r1, r2, r3)
            return
    }

    static /* synthetic */ void a(xyz.adscope.ad.q r0, xyz.adscope.ad.o r1) {
            r0.a(r1)
            return
    }

    private void b() {
            r2 = this;
            r2.c()
            xyz.adscope.ad.q$e r0 = r2.d
            r1 = 1
            r0.sendEmptyMessage(r1)
            return
    }

    static /* synthetic */ void b(xyz.adscope.ad.q r0) {
            r0.b()
            return
    }

    static /* synthetic */ android.content.Context c(xyz.adscope.ad.q r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    private void c() {
            r2 = this;
            xyz.adscope.ad.q$e r0 = r2.d
            r1 = 2
            r0.sendEmptyMessage(r1)
            return
    }

    static /* synthetic */ android.content.Context d(xyz.adscope.ad.q r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    private void d() {
            r2 = this;
            xyz.adscope.ad.e r0 = r2.b
            xyz.adscope.ad.c3 r1 = r2.f
            r0.a(r1)
            return
    }

    static /* synthetic */ android.content.Context e(xyz.adscope.ad.q r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* synthetic */ android.content.Context f(xyz.adscope.ad.q r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* synthetic */ android.content.Context g(xyz.adscope.ad.q r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* synthetic */ android.content.Context h(xyz.adscope.ad.q r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* synthetic */ android.content.Context i(xyz.adscope.ad.q r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* synthetic */ android.content.Context j(xyz.adscope.ad.q r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* synthetic */ xyz.adscope.common.v2.thread.pool.IBaseThreadPool k(xyz.adscope.ad.q r0) {
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = r0.g
            return r0
    }

    static /* synthetic */ xyz.adscope.ad.e l(xyz.adscope.ad.q r0) {
            xyz.adscope.ad.e r0 = r0.b
            return r0
    }

    static /* synthetic */ android.content.Context m(xyz.adscope.ad.q r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    static /* synthetic */ xyz.adscope.ad.publish.ASNPInitConfig n(xyz.adscope.ad.q r0) {
            xyz.adscope.ad.publish.ASNPInitConfig r0 = r0.c
            return r0
    }

    @Override // xyz.adscope.ad.g2
    public void a(xyz.adscope.ad.f3 r2) {
            r1 = this;
            xyz.adscope.ad.q$e r0 = r1.d
            xyz.adscope.ad.q.e.a(r0, r2)
            return
    }

    @Override // xyz.adscope.ad.g2
    public void a(xyz.adscope.ad.publish.ASNPInitConfig r1) {
            r0 = this;
            r0.c = r1
            r0.d()
            r0.a()
            return
    }
}
