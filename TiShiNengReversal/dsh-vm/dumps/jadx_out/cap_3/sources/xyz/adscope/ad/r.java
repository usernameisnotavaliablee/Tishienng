package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class r implements xyz.adscope.ad.t1 {
    private final java.lang.String a;
    private final android.content.Context b;
    private final xyz.adscope.ad.g2 c;
    private final xyz.adscope.ad.j4 d;
    private final xyz.adscope.ad.e e;
    private xyz.adscope.ad.publish.ASNPInitConfig f;
    private xyz.adscope.ad.r.b g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum b extends java.lang.Enum<xyz.adscope.ad.r.b> {
        public static final xyz.adscope.ad.r.b a = null;
        public static final xyz.adscope.ad.r.b b = null;
        public static final xyz.adscope.ad.r.b c = null;
        public static final xyz.adscope.ad.r.b d = null;
        private static final /* synthetic */ xyz.adscope.ad.r.b[] e = null;

        static {
                xyz.adscope.ad.r$b r0 = new xyz.adscope.ad.r$b
                java.lang.String r1 = "STANDBY"
                r2 = 0
                r0.<init>(r1, r2)
                xyz.adscope.ad.r.b.a = r0
                xyz.adscope.ad.r$b r0 = new xyz.adscope.ad.r$b
                java.lang.String r1 = "INITIALING"
                r2 = 1
                r0.<init>(r1, r2)
                xyz.adscope.ad.r.b.b = r0
                xyz.adscope.ad.r$b r0 = new xyz.adscope.ad.r$b
                java.lang.String r1 = "SUCCESS"
                r2 = 2
                r0.<init>(r1, r2)
                xyz.adscope.ad.r.b.c = r0
                xyz.adscope.ad.r$b r0 = new xyz.adscope.ad.r$b
                java.lang.String r1 = "FAILED"
                r2 = 3
                r0.<init>(r1, r2)
                xyz.adscope.ad.r.b.d = r0
                xyz.adscope.ad.r$b[] r0 = a()
                xyz.adscope.ad.r.b.e = r0
                return
        }

        b(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ xyz.adscope.ad.r.b[] a() {
                r0 = 4
                xyz.adscope.ad.r$b[] r0 = new xyz.adscope.ad.r.b[r0]
                xyz.adscope.ad.r$b r1 = xyz.adscope.ad.r.b.a
                r2 = 0
                r0[r2] = r1
                xyz.adscope.ad.r$b r1 = xyz.adscope.ad.r.b.b
                r2 = 1
                r0[r2] = r1
                xyz.adscope.ad.r$b r1 = xyz.adscope.ad.r.b.c
                r2 = 2
                r0[r2] = r1
                xyz.adscope.ad.r$b r1 = xyz.adscope.ad.r.b.d
                r2 = 3
                r0[r2] = r1
                return r0
        }

        public static xyz.adscope.ad.r.b valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.ad.r$b> r0 = xyz.adscope.ad.r.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.ad.r$b r1 = (xyz.adscope.ad.r.b) r1
                return r1
        }

        public static xyz.adscope.ad.r.b[] values() {
                xyz.adscope.ad.r$b[] r0 = xyz.adscope.ad.r.b.e
                java.lang.Object r0 = r0.clone()
                xyz.adscope.ad.r$b[] r0 = (xyz.adscope.ad.r.b[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements xyz.adscope.ad.f3 {
        private xyz.adscope.ad.publish.IInitCallback a;
        final /* synthetic */ xyz.adscope.ad.r b;

        private c(xyz.adscope.ad.r r1, xyz.adscope.ad.publish.IInitCallback r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        /* synthetic */ c(xyz.adscope.ad.r r1, xyz.adscope.ad.publish.IInitCallback r2, xyz.adscope.ad.r.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private void a(xyz.adscope.ad.n1 r4, xyz.adscope.ad.j4 r5) {
                r3 = this;
                if (r4 == 0) goto L39
                if (r5 == 0) goto L39
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "上报初始化事件.  "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = " 耗时 "
                r0.append(r1)
                long r1 = r5.e()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "ASNPInitializeImpl"
                xyz.adscope.common.v2.log.SDKLog.d(r1, r0)
                xyz.adscope.ad.l r0 = xyz.adscope.ad.l.a()
                xyz.adscope.ad.r r1 = r3.b
                android.content.Context r1 = xyz.adscope.ad.r.a(r1)
                java.lang.Object r0 = r0.getOrCreateImplement(r1)
                xyz.adscope.ad.s1 r0 = (xyz.adscope.ad.s1) r0
                r0.a(r4, r5)
            L39:
                return
        }

        private void b() {
                r2 = this;
                xyz.adscope.ad.r r0 = r2.b
                xyz.adscope.ad.e r0 = xyz.adscope.ad.r.b(r0)
                r1 = 0
                xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r0 = r0.a(r1)
                if (r0 == 0) goto L1a
                xyz.adscope.ad.r r1 = r2.b
                xyz.adscope.ad.j4 r1 = xyz.adscope.ad.r.c(r1)
                java.lang.String r0 = r0.d()
                r1.a(r0)
            L1a:
                return
        }

        @Override // xyz.adscope.ad.f3
        public void a() {
                r0 = this;
                r0.b()
                return
        }

        @Override // xyz.adscope.ad.f3
        public void a(xyz.adscope.ad.o r4) {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "初始化失败..."
                r0.append(r1)
                int r1 = r4.b()
                r0.append(r1)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r1 = r4.c()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "ASNPInitializeImpl"
                xyz.adscope.common.v2.log.SDKLog.d(r1, r0)
                xyz.adscope.ad.r r0 = r3.b
                xyz.adscope.ad.r$b r1 = xyz.adscope.ad.r.b.d
                xyz.adscope.ad.r.a(r0, r1)
                xyz.adscope.ad.n1 r0 = xyz.adscope.ad.n1.b
                xyz.adscope.ad.r r1 = r3.b
                xyz.adscope.ad.j4 r1 = xyz.adscope.ad.r.c(r1)
                xyz.adscope.ad.j4 r1 = r1.a()
                r3.a(r0, r1)
                xyz.adscope.ad.r r0 = r3.b
                xyz.adscope.ad.j4 r0 = xyz.adscope.ad.r.c(r0)
                long r1 = java.lang.System.currentTimeMillis()
                r0.a(r1)
                xyz.adscope.ad.n1 r0 = xyz.adscope.ad.n1.d
                xyz.adscope.ad.r r1 = r3.b
                xyz.adscope.ad.j4 r1 = xyz.adscope.ad.r.c(r1)
                xyz.adscope.ad.j4 r1 = r1.a()
                r3.a(r0, r1)
                xyz.adscope.ad.r r0 = r3.b
                xyz.adscope.ad.e r0 = xyz.adscope.ad.r.b(r0)
                xyz.adscope.ad.r r1 = r3.b
                xyz.adscope.ad.j4 r1 = xyz.adscope.ad.r.c(r1)
                xyz.adscope.ad.j4 r1 = r1.a()
                r0.a(r1)
                xyz.adscope.ad.publish.IInitCallback r0 = r3.a
                if (r0 == 0) goto L7a
                int r1 = r4.b()
                java.lang.String r4 = r4.c()
                r0.initFailed(r1, r4)
            L7a:
                return
        }

        @Override // xyz.adscope.ad.f3
        public void initSuccess() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "初始化成功..."
                r0.append(r1)
                long r1 = java.lang.System.currentTimeMillis()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "ASNPInitializeImpl"
                xyz.adscope.common.v2.log.SDKLog.d(r1, r0)
                xyz.adscope.ad.r r0 = r3.b
                xyz.adscope.ad.r$b r1 = xyz.adscope.ad.r.b.c
                xyz.adscope.ad.r.a(r0, r1)
                xyz.adscope.ad.n1 r0 = xyz.adscope.ad.n1.b
                xyz.adscope.ad.r r1 = r3.b
                xyz.adscope.ad.j4 r1 = xyz.adscope.ad.r.c(r1)
                xyz.adscope.ad.j4 r1 = r1.a()
                r3.a(r0, r1)
                xyz.adscope.ad.r r0 = r3.b
                xyz.adscope.ad.j4 r0 = xyz.adscope.ad.r.c(r0)
                long r1 = java.lang.System.currentTimeMillis()
                r0.a(r1)
                xyz.adscope.ad.r r0 = r3.b
                xyz.adscope.ad.e r0 = xyz.adscope.ad.r.b(r0)
                xyz.adscope.ad.r r1 = r3.b
                xyz.adscope.ad.j4 r1 = xyz.adscope.ad.r.c(r1)
                xyz.adscope.ad.j4 r1 = r1.a()
                r0.a(r1)
                xyz.adscope.ad.n1 r0 = xyz.adscope.ad.n1.c
                xyz.adscope.ad.r r1 = r3.b
                xyz.adscope.ad.j4 r1 = xyz.adscope.ad.r.c(r1)
                xyz.adscope.ad.j4 r1 = r1.a()
                r3.a(r0, r1)
                xyz.adscope.ad.publish.IInitCallback r0 = r3.a
                if (r0 == 0) goto L69
                r0.initSuccess()
                r0 = 0
                r3.a = r0
            L69:
                return
        }
    }

    r(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "ASNPInitializeImpl"
            r3.a = r0
            xyz.adscope.ad.r$b r0 = xyz.adscope.ad.r.b.a
            r3.g = r0
            android.content.Context r0 = r4.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            r3.b = r0
            xyz.adscope.ad.j4 r1 = new xyz.adscope.ad.j4
            r1.<init>()
            r3.d = r1
            xyz.adscope.ad.q r2 = new xyz.adscope.ad.q
            r2.<init>(r4)
            r3.c = r2
            xyz.adscope.ad.f r4 = xyz.adscope.ad.f.a()
            java.lang.Object r4 = r4.getOrCreateImplement(r0)
            xyz.adscope.ad.e r4 = (xyz.adscope.ad.e) r4
            r3.e = r4
            r4.a(r1)
            return
    }

    static /* synthetic */ android.content.Context a(xyz.adscope.ad.r r0) {
            android.content.Context r0 = r0.b
            return r0
    }

    static /* synthetic */ xyz.adscope.ad.r.b a(xyz.adscope.ad.r r0, xyz.adscope.ad.r.b r1) {
            r0.g = r1
            return r1
    }

    private void a(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L10
            xyz.adscope.common.v2.dev.info.UserAgentHelper r2 = xyz.adscope.common.v2.dev.info.UserAgentHelper.getInstance()
            android.content.Context r0 = r1.b
            r2.asyncInitUserAgent(r0)
            return
        L10:
            xyz.adscope.common.v2.dev.info.UserAgentHelper r0 = xyz.adscope.common.v2.dev.info.UserAgentHelper.getInstance()
            r0.setCustomUserAgent(r2)
            return
    }

    private void a(xyz.adscope.ad.publish.ASNPInitConfig r2) {
            r1 = this;
            xyz.adscope.ad.e r0 = r1.e
            if (r0 == 0) goto L7
            r0.a(r2)
        L7:
            return
    }

    private void a(xyz.adscope.ad.publish.IInitCallback r4) {
            r3 = this;
            xyz.adscope.ad.g2 r0 = r3.c
            xyz.adscope.ad.r$c r1 = new xyz.adscope.ad.r$c
            r2 = 0
            r1.<init>(r3, r4, r2)
            r0.a(r1)
            xyz.adscope.ad.g2 r4 = r3.c
            xyz.adscope.ad.publish.ASNPInitConfig r0 = r3.f
            r4.a(r0)
            return
    }

    private void a(boolean r3) {
            r2 = this;
            xyz.adscope.common.v2.location.LocationManager r0 = xyz.adscope.common.v2.location.LocationManager.getInstance()
            android.content.Context r1 = r2.b
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.common.v2.location.ILocationHolder r0 = (xyz.adscope.common.v2.location.ILocationHolder) r0
            if (r3 == 0) goto L11
            r0.updatePermissionGranted()
        L11:
            xyz.adscope.ad.publish.ASNPInitConfig r3 = r2.f
            xyz.adscope.ad.publish.loc.ASNPLocation r3 = r3.getCustomLocation()
            r0.setLocalLocation(r3)
            return
    }

    private boolean a(java.lang.String r5, xyz.adscope.ad.publish.IInitCallback r6) {
            r4 = this;
            xyz.adscope.ad.r$b r0 = r4.g
            xyz.adscope.ad.r$b r1 = xyz.adscope.ad.r.b.a
            r2 = 0
            if (r0 == r1) goto L3d
            xyz.adscope.ad.r$b r1 = xyz.adscope.ad.r.b.d
            if (r0 != r1) goto Lc
            goto L3d
        Lc:
            xyz.adscope.ad.r$b r1 = xyz.adscope.ad.r.b.c
            r3 = 1
            if (r0 != r1) goto L33
            if (r6 == 0) goto L32
            xyz.adscope.ad.publish.ASNPInitConfig r0 = r4.f
            if (r0 == 0) goto L25
            java.lang.String r0 = r0.getAppId()
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L25
            r6.alreadyInit()
            goto L32
        L25:
            xyz.adscope.ad.o r5 = xyz.adscope.ad.o.h
            int r0 = r5.b()
            java.lang.String r5 = r5.c()
            r6.initFailed(r0, r5)
        L32:
            return r3
        L33:
            xyz.adscope.ad.r$b r5 = xyz.adscope.ad.r.b.b
            if (r0 != r5) goto L3d
            if (r6 == 0) goto L3d
            r6.initializing()
            return r3
        L3d:
            return r2
    }

    static /* synthetic */ xyz.adscope.ad.e b(xyz.adscope.ad.r r0) {
            xyz.adscope.ad.e r0 = r0.e
            return r0
    }

    private void b() {
            r3 = this;
            xyz.adscope.ad.t7 r0 = new xyz.adscope.ad.t7
            r0.<init>(r3)
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r1 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            android.content.Context r2 = r3.b
            java.lang.Object r1 = r1.getOrCreateImplement(r2)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r1 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r1
            if (r1 == 0) goto L16
            r1.executeLocalAsyncTask(r0)
        L16:
            return
    }

    private void b(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            xyz.adscope.ad.g r2 = new xyz.adscope.ad.g
            android.content.Context r0 = r1.b
            r2.<init>(r0)
            r2.a()
        Lc:
            return
    }

    static /* synthetic */ xyz.adscope.ad.j4 c(xyz.adscope.ad.r r0) {
            xyz.adscope.ad.j4 r0 = r0.d
            return r0
    }

    private void c() {
            r2 = this;
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            android.content.Context r1 = r2.b
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r0
            xyz.adscope.ad.s7 r1 = new xyz.adscope.ad.s7
            r1.<init>(r2)
            r0.executeBasicAsyncTask(r1)
            return
    }

    private void d() {
            r2 = this;
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            android.content.Context r1 = r2.b
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r0
            xyz.adscope.ad.u7 r1 = new xyz.adscope.ad.u7
            r1.<init>(r2)
            r0.executeBasicAsyncTask(r1)
            return
    }

    public static /* synthetic */ void d(xyz.adscope.ad.r r0) {
            r0.i()
            return
    }

    private void e() {
            r2 = this;
            xyz.adscope.ad.k r0 = xyz.adscope.ad.k.a()
            android.content.Context r1 = r2.b
            r0.getOrCreateImplement(r1)
            return
    }

    public static /* synthetic */ void e(xyz.adscope.ad.r r0) {
            r0.j()
            return
    }

    private void f() {
            r2 = this;
            xyz.adscope.common.v2.encrypt.LinkedEncryptManager r0 = xyz.adscope.common.v2.encrypt.LinkedEncryptManager.getInstance()
            android.content.Context r1 = r2.b
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt r0 = (xyz.adscope.common.v2.encrypt.ILinkedEncrypt) r0
            xyz.adscope.ad.d r1 = xyz.adscope.ad.d.c
            r0.initAesConfig(r1)
            return
    }

    public static /* synthetic */ void f(xyz.adscope.ad.r r0) {
            r0.h()
            return
    }

    private void g() {
            r5 = this;
            xyz.adscope.ad.publish.ASNPInitConfig r0 = r5.f
            if (r0 == 0) goto L1d
            xyz.adscope.ad.publish.ASNPConstants$UiModel r0 = r0.getUiModel()
            xyz.adscope.ad.b7 r1 = xyz.adscope.ad.b7.a()
            android.content.Context r2 = r5.b
            xyz.adscope.ad.publish.ASNPInitConfig r3 = r5.f
            java.lang.String r3 = r3.getLightColor()
            xyz.adscope.ad.publish.ASNPInitConfig r4 = r5.f
            java.lang.String r4 = r4.getDarkColor()
            r1.a(r2, r0, r3, r4)
        L1d:
            return
    }

    private /* synthetic */ void h() {
            r1 = this;
            android.content.Context r0 = r1.b
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            xyz.adscope.ad.e0.a(r0)
            return
    }

    private /* synthetic */ void i() {
            r2 = this;
            xyz.adscope.ad.l r0 = xyz.adscope.ad.l.a()
            android.content.Context r1 = r2.b
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.ad.s1 r0 = (xyz.adscope.ad.s1) r0
            r0.a()
            return
    }

    private /* synthetic */ void j() {
            r2 = this;
            xyz.adscope.ad.e7 r0 = xyz.adscope.ad.e7.a()
            android.content.Context r1 = r2.b
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.ad.x6 r0 = (xyz.adscope.ad.x6) r0
            r0.d()
            xyz.adscope.ad.k0 r0 = xyz.adscope.ad.k0.a()
            android.content.Context r1 = r2.b
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.ad.j0 r0 = (xyz.adscope.ad.j0) r0
            r0.c()
            return
    }

    private void k() {
            r2 = this;
            xyz.adscope.ad.x r0 = xyz.adscope.ad.x.a()
            android.content.Context r1 = r2.b
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.ad.r3 r0 = (xyz.adscope.ad.r3) r0
            java.lang.String r1 = "plugins_all"
            r0.a(r1)
            return
    }

    @Override // xyz.adscope.ad.t1
    public void a(xyz.adscope.ad.publish.ASNPInitConfig r4, xyz.adscope.ad.publish.IInitCallback r5) {
            r3 = this;
            java.lang.String r0 = r4.getAppId()
            boolean r0 = r3.a(r0, r5)
            if (r0 == 0) goto Lb
            return
        Lb:
            android.content.Context r0 = r3.b
            xyz.adscope.common.v2.log.SDKLog.initSDKLog(r0)
            xyz.adscope.ad.r$b r0 = xyz.adscope.ad.r.b.b
            r3.g = r0
            r3.f = r4
            r3.f()
            r3.g()
            xyz.adscope.ad.j4 r0 = r3.d
            long r1 = java.lang.System.currentTimeMillis()
            r0.b(r1)
            r3.a(r4)
            r3.c()
            java.lang.String r0 = "customUserAgent"
            java.lang.String r0 = xyz.adscope.ad.p.a(r4, r0)
            r3.a(r0)
            java.lang.String r0 = "isCanHandleUncaughtException"
            r1 = 1
            boolean r0 = xyz.adscope.ad.p.a(r4, r0, r1)
            r3.b(r0)
            boolean r4 = r4.canUpdateLocation()
            r3.a(r4)
            r3.b()
            r3.d()
            r3.e()
            r3.k()
            r3.a(r5)
            return
    }

    @Override // xyz.adscope.ad.t1
    public boolean a() {
            r2 = this;
            xyz.adscope.ad.r$b r0 = r2.g
            xyz.adscope.ad.r$b r1 = xyz.adscope.ad.r.b.c
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
