package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class q4 extends xyz.adscope.ad.q2 {

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
        private final java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.temp.TemplateModel> b;

        private b(android.content.Context r1, java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.temp.TemplateModel> r2) {
                r0 = this;
                r0.<init>()
                android.content.Context r1 = r1.getApplicationContext()
                android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
                r0.a = r1
                r0.b = r2
                return
        }

        /* synthetic */ b(android.content.Context r1, java.util.List r2, xyz.adscope.ad.q4.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                xyz.adscope.ad.m0 r0 = xyz.adscope.ad.m0.a()
                android.content.Context r1 = r2.a
                java.lang.Object r0 = r0.getOrCreateImplement(r1)
                xyz.adscope.ad.l0 r0 = (xyz.adscope.ad.l0) r0
                java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.temp.TemplateModel> r1 = r2.b
                r0.a(r1)
                return
        }
    }

    public q4(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // xyz.adscope.ad.q2
    protected void a(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r4, xyz.adscope.ad.e.a r5) {
            r3 = this;
            if (r4 == 0) goto L25
            java.util.List r5 = r4.m()
            if (r5 == 0) goto L25
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r5 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            android.content.Context r0 = r3.a
            java.lang.Object r5 = r5.getOrCreateImplement(r0)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r5 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r5
            if (r5 == 0) goto L25
            xyz.adscope.ad.q4$b r0 = new xyz.adscope.ad.q4$b
            android.content.Context r1 = r3.a
            java.util.List r4 = r4.m()
            r2 = 0
            r0.<init>(r1, r4, r2)
            r5.executeLocalAsyncTask(r0)
        L25:
            return
    }
}
