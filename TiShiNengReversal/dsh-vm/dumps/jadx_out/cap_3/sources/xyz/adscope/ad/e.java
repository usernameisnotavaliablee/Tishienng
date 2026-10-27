package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class e {
    private final xyz.adscope.ad.o3 a;
    private final java.lang.Object b;
    private xyz.adscope.ad.publish.ASNPInitConfig c;
    private xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel d;
    private final java.util.concurrent.CopyOnWriteArrayList<xyz.adscope.ad.d3> e;
    private final java.util.concurrent.CopyOnWriteArrayList<xyz.adscope.ad.c3> f;
    private final android.content.Context g;
    private xyz.adscope.ad.j4 h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum a extends java.lang.Enum<xyz.adscope.ad.e.a> {
        public static final xyz.adscope.ad.e.a a = null;
        public static final xyz.adscope.ad.e.a b = null;
        public static final xyz.adscope.ad.e.a c = null;
        private static final /* synthetic */ xyz.adscope.ad.e.a[] d = null;

        static {
                xyz.adscope.ad.e$a r0 = new xyz.adscope.ad.e$a
                java.lang.String r1 = "EXPIRED"
                r2 = 0
                r0.<init>(r1, r2)
                xyz.adscope.ad.e.a.a = r0
                xyz.adscope.ad.e$a r0 = new xyz.adscope.ad.e$a
                java.lang.String r1 = "PREFER_UPDATE"
                r2 = 1
                r0.<init>(r1, r2)
                xyz.adscope.ad.e.a.b = r0
                xyz.adscope.ad.e$a r0 = new xyz.adscope.ad.e$a
                java.lang.String r1 = "VALID"
                r2 = 2
                r0.<init>(r1, r2)
                xyz.adscope.ad.e.a.c = r0
                xyz.adscope.ad.e$a[] r0 = a()
                xyz.adscope.ad.e.a.d = r0
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ xyz.adscope.ad.e.a[] a() {
                r0 = 3
                xyz.adscope.ad.e$a[] r0 = new xyz.adscope.ad.e.a[r0]
                xyz.adscope.ad.e$a r1 = xyz.adscope.ad.e.a.a
                r2 = 0
                r0[r2] = r1
                xyz.adscope.ad.e$a r1 = xyz.adscope.ad.e.a.b
                r2 = 1
                r0[r2] = r1
                xyz.adscope.ad.e$a r1 = xyz.adscope.ad.e.a.c
                r2 = 2
                r0[r2] = r1
                return r0
        }

        public static xyz.adscope.ad.e.a valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.ad.e$a> r0 = xyz.adscope.ad.e.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.ad.e$a r1 = (xyz.adscope.ad.e.a) r1
                return r1
        }

        public static xyz.adscope.ad.e.a[] values() {
                xyz.adscope.ad.e$a[] r0 = xyz.adscope.ad.e.a.d
                java.lang.Object r0 = r0.clone()
                xyz.adscope.ad.e$a[] r0 = (xyz.adscope.ad.e.a[]) r0
                return r0
        }
    }

    e(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.b = r0
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.g = r2
            java.util.concurrent.CopyOnWriteArrayList r2 = new java.util.concurrent.CopyOnWriteArrayList
            r2.<init>()
            r1.e = r2
            java.util.concurrent.CopyOnWriteArrayList r2 = new java.util.concurrent.CopyOnWriteArrayList
            r2.<init>()
            r1.f = r2
            xyz.adscope.ad.v r2 = xyz.adscope.ad.v.a()
            xyz.adscope.ad.o3 r2 = r2.b()
            r1.a = r2
            r1.g()
            return
    }

    private xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel a(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L16
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r0 = new xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel
            org.json.JSONObject r2 = xyz.adscope.common.v2.tool.json.JsonUtil.parseJSONObject(r2)
            r0.<init>(r2)
            boolean r2 = r0.hasParseException()
            if (r2 != 0) goto L16
            return r0
        L16:
            r2 = 0
            return r2
    }

    private /* synthetic */ void a(long r3, boolean r5) {
            r2 = this;
            xyz.adscope.ad.e$a r3 = r2.a(r3)
            java.util.concurrent.CopyOnWriteArrayList<xyz.adscope.ad.d3> r4 = r2.e
            if (r4 == 0) goto L26
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L26
            java.util.concurrent.CopyOnWriteArrayList<xyz.adscope.ad.d3> r4 = r2.e
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r4.next()
            xyz.adscope.ad.d3 r0 = (xyz.adscope.ad.d3) r0
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r1 = r2.d
            r0.a(r1, r3, r5)
            goto L14
        L26:
            return
    }

    public static /* synthetic */ void a(xyz.adscope.ad.e r0, long r1, boolean r3) {
            r0.a(r1, r3)
            return
    }

    private void a(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r2) {
            r1 = this;
            java.lang.Object r0 = r1.b
            monitor-enter(r0)
            r1.d = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    private void b(boolean r5) {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r2 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            android.content.Context r3 = r4.g
            java.lang.Object r2 = r2.getOrCreateImplement(r3)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r2 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r2
            xyz.adscope.ad.h7 r3 = new xyz.adscope.ad.h7
            r3.<init>(r4, r0, r5)
            r2.executeBasicAsyncTask(r3)
            return
    }

    private xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel e() {
            r5 = this;
            xyz.adscope.ad.publish.ASNPInitConfig r0 = r5.c
            if (r0 == 0) goto Ld
            boolean r0 = r0.isUseHttps()
            if (r0 == 0) goto Ld
            java.lang.String r0 = "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"
            goto Lf
        Ld:
            java.lang.String r0 = "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"
        Lf:
            xyz.adscope.common.v2.encrypt.LinkedEncryptManager r1 = xyz.adscope.common.v2.encrypt.LinkedEncryptManager.getInstance()
            android.content.Context r2 = r5.g
            java.lang.Object r1 = r1.getOrCreateImplement(r2)
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt r1 = (xyz.adscope.common.v2.encrypt.ILinkedEncrypt) r1
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r2 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.STEP_BY_STEP
            java.lang.String r3 = "1001"
            r4 = 0
            java.lang.String r0 = r1.decrypt(r0, r3, r2, r4)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L3a
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r1 = new xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel
            org.json.JSONObject r0 = xyz.adscope.common.v2.tool.json.JsonUtil.parseJSONObject(r0)
            r1.<init>(r0)
            boolean r0 = r1.hasParseException()
            if (r0 != 0) goto L3a
            return r1
        L3a:
            r0 = 0
            return r0
    }

    private void g() {
            r3 = this;
            android.content.Context r0 = r3.g
            if (r0 == 0) goto L31
            xyz.adscope.ad.o3 r0 = r3.a
            android.app.Application$ActivityLifecycleCallbacks r0 = r0.a()
            android.content.Context r1 = r3.g
            boolean r2 = r1 instanceof android.app.Application
            if (r2 == 0) goto L16
            android.app.Application r1 = (android.app.Application) r1
            r1.registerActivityLifecycleCallbacks(r0)
            return
        L16:
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L24
            android.app.Activity r1 = (android.app.Activity) r1
            android.app.Application r1 = r1.getApplication()
            r1.registerActivityLifecycleCallbacks(r0)
            return
        L24:
            boolean r2 = r1 instanceof android.app.Service
            if (r2 == 0) goto L31
            android.app.Service r1 = (android.app.Service) r1
            android.app.Application r1 = r1.getApplication()
            r1.registerActivityLifecycleCallbacks(r0)
        L31:
            return
    }

    public xyz.adscope.ad.e.a a(long r2) {
            r1 = this;
            boolean r0 = r1.b(r2)
            if (r0 == 0) goto L12
            boolean r2 = r1.c(r2)
            if (r2 == 0) goto Lf
            xyz.adscope.ad.e$a r2 = xyz.adscope.ad.e.a.b
            return r2
        Lf:
            xyz.adscope.ad.e$a r2 = xyz.adscope.ad.e.a.a
            return r2
        L12:
            xyz.adscope.ad.e$a r2 = xyz.adscope.ad.e.a.c
            return r2
    }

    public xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel a(boolean r1) {
            r0 = this;
            if (r1 == 0) goto Lb
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r1 = r0.d
            if (r1 == 0) goto Lb
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r1 = r1.a()
            return r1
        Lb:
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r1 = r0.d
            return r1
    }

    public xyz.adscope.ad.publish.ASNPInitConfig a() {
            r1 = this;
            xyz.adscope.ad.publish.ASNPInitConfig r0 = r1.c
            return r0
    }

    public void a(xyz.adscope.ad.c3 r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<xyz.adscope.ad.c3> r0 = r1.f
            if (r0 == 0) goto Lf
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto Lf
            java.util.concurrent.CopyOnWriteArrayList<xyz.adscope.ad.c3> r0 = r1.f
            r0.add(r2)
        Lf:
            return
    }

    public void a(xyz.adscope.ad.d3 r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<xyz.adscope.ad.d3> r0 = r1.e
            r0.add(r2)
            return
    }

    public void a(xyz.adscope.ad.j4 r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void a(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r2, boolean r3, boolean r4) {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r0 = r1.d
            if (r0 != 0) goto Ld
            r1.a(r2)
            if (r4 != 0) goto L1a
            r1.b(r3)
            return
        Ld:
            if (r3 == 0) goto L1a
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r2 = r0.a(r2)
            r1.a(r2)
            r2 = 1
            r1.b(r2)
        L1a:
            return
    }

    public void a(xyz.adscope.ad.publish.ASNPInitConfig r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public xyz.adscope.ad.j4 b() {
            r1 = this;
            xyz.adscope.ad.j4 r0 = r1.h
            if (r0 == 0) goto L9
            xyz.adscope.ad.j4 r0 = r0.a()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean b(long r7) {
            r6 = this;
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r0 = r6.d
            r1 = 0
            if (r0 == 0) goto L26
            android.content.Context r0 = r6.g
            java.lang.String r2 = xyz.adscope.ad.i0.b()
            java.lang.String r3 = "asnpConfigLast"
            r4 = 0
            long r2 = xyz.adscope.ad.i0.a(r0, r2, r3, r4)
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r0 = r6.d
            xyz.adscope.ad.model.impl.resp.cfg.root.update.UpdateModel r0 = r0.n()
            if (r0 == 0) goto L26
            long r7 = r7 - r2
            long r2 = r0.c()
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L26
            r7 = 1
            return r7
        L26:
            return r1
    }

    public long c() {
            r2 = this;
            xyz.adscope.ad.j4 r0 = r2.h
            if (r0 == 0) goto L9
            long r0 = r0.b()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean c(long r7) {
            r6 = this;
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r0 = r6.d
            r1 = 0
            if (r0 == 0) goto L2e
            android.content.Context r0 = r6.g
            java.lang.String r2 = xyz.adscope.ad.i0.b()
            java.lang.String r3 = "asnpConfigLast"
            r4 = 0
            long r2 = xyz.adscope.ad.i0.a(r0, r2, r3, r4)
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r0 = r6.d
            xyz.adscope.ad.model.impl.resp.cfg.root.update.UpdateModel r0 = r0.n()
            if (r0 == 0) goto L2e
            long r7 = r7 - r2
            long r2 = r0.b()
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 <= 0) goto L2e
            long r2 = r0.c()
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2e
            r7 = 1
            return r7
        L2e:
            return r1
    }

    public boolean d() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r0 = r1.d
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void f() {
            r5 = this;
            android.content.Context r0 = r5.g
            java.lang.String r1 = xyz.adscope.ad.i0.b()
            java.lang.String r2 = "asnpConfig"
            java.lang.String r3 = ""
            java.lang.String r0 = xyz.adscope.ad.i0.a(r0, r1, r2, r3)
            android.content.Context r1 = r5.g
            java.lang.String r2 = xyz.adscope.ad.i0.b()
            java.lang.String r3 = "asnpCfgPattern"
            java.lang.String r4 = "101,1001"
            java.lang.String r1 = xyz.adscope.ad.i0.a(r1, r2, r3, r4)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r2 != 0) goto L4b
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L4b
            xyz.adscope.common.v2.encrypt.LinkedEncryptManager r2 = xyz.adscope.common.v2.encrypt.LinkedEncryptManager.getInstance()
            android.content.Context r4 = r5.g
            java.lang.Object r2 = r2.getOrCreateImplement(r4)
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt r2 = (xyz.adscope.common.v2.encrypt.ILinkedEncrypt) r2
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r4 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.STEP_BY_STEP
            java.lang.String r0 = r2.decrypt(r0, r1, r4, r3)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L4b
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r0 = r5.a(r0)
            if (r0 == 0) goto L4b
            r5.a(r0, r3, r3)
            return
        L4b:
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r0 = r5.e()
            if (r0 == 0) goto L55
            r1 = 1
            r5.a(r0, r3, r1)
        L55:
            return
    }

    public void h() {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<xyz.adscope.ad.c3> r0 = r2.f
            if (r0 == 0) goto L18
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            xyz.adscope.ad.c3 r1 = (xyz.adscope.ad.c3) r1
            r1.a()
            goto L8
        L18:
            return
    }
}
