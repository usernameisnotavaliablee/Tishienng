package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class t0 extends xyz.adscope.ad.f2 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b implements xyz.adscope.ad.n4.b {
        final /* synthetic */ xyz.adscope.ad.t0 a;

        private b(xyz.adscope.ad.t0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(xyz.adscope.ad.t0 r1, xyz.adscope.ad.t0.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // xyz.adscope.ad.n4.b
        public void a() {
                r2 = this;
                xyz.adscope.ad.t0 r0 = r2.a
                xyz.adscope.ad.y1$a r1 = xyz.adscope.ad.y1.a.n
                xyz.adscope.ad.t0.a(r0, r1)
                return
        }

        @Override // xyz.adscope.ad.n4.b
        public void b() {
                r2 = this;
                xyz.adscope.ad.t0 r0 = r2.a
                xyz.adscope.ad.y1$a r1 = xyz.adscope.ad.y1.a.p
                xyz.adscope.ad.t0.a(r0, r1)
                return
        }

        @Override // xyz.adscope.ad.n4.b
        public void c() {
                r2 = this;
                xyz.adscope.ad.t0 r0 = r2.a
                xyz.adscope.ad.y1$a r1 = xyz.adscope.ad.y1.a.q
                xyz.adscope.ad.t0.a(r0, r1)
                return
        }

        @Override // xyz.adscope.ad.n4.b
        public void d() {
                r2 = this;
                xyz.adscope.ad.t0 r0 = r2.a
                xyz.adscope.ad.y1$a r1 = xyz.adscope.ad.y1.a.l
                xyz.adscope.ad.t0.a(r0, r1)
                return
        }

        @Override // xyz.adscope.ad.n4.b
        public void e() {
                r2 = this;
                xyz.adscope.ad.t0 r0 = r2.a
                xyz.adscope.ad.y1$a r1 = xyz.adscope.ad.y1.a.m
                xyz.adscope.ad.t0.a(r0, r1)
                return
        }

        @Override // xyz.adscope.ad.n4.b
        public void f() {
                r2 = this;
                xyz.adscope.ad.t0 r0 = r2.a
                xyz.adscope.ad.y1$a r1 = xyz.adscope.ad.y1.a.o
                xyz.adscope.ad.t0.a(r0, r1)
                return
        }
    }

    public t0() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void a(xyz.adscope.ad.t0 r0, xyz.adscope.ad.y1.a r1) {
            r0.a(r1)
            return
    }

    private void a(xyz.adscope.ad.y1.a r3) {
            r2 = this;
            xyz.adscope.ad.x1 r0 = r2.a
            r1 = 0
            r0.a(r3, r1)
            return
    }

    protected void a(java.lang.String r2, android.content.Context r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto La
            r0 = 0
            xyz.adscope.ad.n4.a(r3, r2, r0)
        La:
            return
    }

    @Override // xyz.adscope.ad.f2
    protected void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.link.LinkModel r2, android.view.View r3, int r4) {
            r1 = this;
            if (r2 == 0) goto L24
            if (r3 == 0) goto L24
            java.lang.String r4 = r2.a()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            boolean r4 = r1.a(r0, r4)
            if (r4 == 0) goto L19
            goto L24
        L19:
            java.lang.String r2 = r2.d()
            android.content.Context r3 = r3.getContext()
            r1.a(r2, r3)
        L24:
            return
    }

    protected boolean a(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            xyz.adscope.ad.t0$b r0 = new xyz.adscope.ad.t0$b
            r1 = 0
            r0.<init>(r2, r1)
            boolean r3 = xyz.adscope.ad.n4.a(r3, r4, r0)
            return r3
    }
}
