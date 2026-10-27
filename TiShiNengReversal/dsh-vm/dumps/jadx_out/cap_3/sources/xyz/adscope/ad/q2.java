package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class q2 implements xyz.adscope.ad.q3 {
    protected final android.content.Context a;
    private final xyz.adscope.ad.q2.b b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b implements xyz.adscope.ad.d3 {
        final /* synthetic */ xyz.adscope.ad.q2 a;

        private b(xyz.adscope.ad.q2 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(xyz.adscope.ad.q2 r1, xyz.adscope.ad.q2.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // xyz.adscope.ad.d3
        public void a(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r1, xyz.adscope.ad.e.a r2, boolean r3) {
                r0 = this;
                xyz.adscope.ad.e$a r3 = xyz.adscope.ad.e.a.a
                if (r2 == r3) goto L9
                xyz.adscope.ad.q2 r3 = r0.a
                r3.a(r1, r2)
            L9:
                return
        }
    }

    public q2(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.a = r2
            xyz.adscope.ad.q2$b r2 = new xyz.adscope.ad.q2$b
            r0 = 0
            r2.<init>(r1, r0)
            r1.b = r2
            return
    }

    @Override // xyz.adscope.ad.q3
    public final void a() {
            r2 = this;
            xyz.adscope.ad.f r0 = xyz.adscope.ad.f.a()
            android.content.Context r1 = r2.a
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.ad.e r0 = (xyz.adscope.ad.e) r0
            if (r0 == 0) goto L13
            xyz.adscope.ad.q2$b r1 = r2.b
            r0.a(r1)
        L13:
            return
    }

    protected abstract void a(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r1, xyz.adscope.ad.e.a r2);
}
