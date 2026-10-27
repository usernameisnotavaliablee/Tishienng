package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class b5 implements xyz.adscope.ad.o2 {
    private xyz.adscope.ad.o2 a;
    private final java.util.Map<java.lang.String, xyz.adscope.ad.o2> b;
    private xyz.adscope.ad.o2 c;
    private final xyz.adscope.ad.b4 d;
    private final xyz.adscope.ad.a4 e;
    private boolean f;
    private final java.util.Map<java.lang.String, xyz.adscope.ad.o2> g;

    b5(xyz.adscope.ad.b4 r2, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r3, java.util.Map<java.lang.String, xyz.adscope.ad.o2> r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            r1.d = r2
            java.lang.String r0 = r3.a()
            r2.setScopeViewID(r0)
            r2.a(r3)
            r1.g = r4
            java.lang.String r0 = r1.e()
            r4.put(r0, r1)
            xyz.adscope.ad.c5 r4 = new xyz.adscope.ad.c5
            android.content.Context r2 = r2.getContext()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.layout.LayoutModel r0 = r3.d()
            java.lang.String r3 = r3.e()
            r4.<init>(r2, r0, r1, r3)
            r1.e = r4
            return
    }

    @Override // xyz.adscope.ad.o2
    public xyz.adscope.ad.a4 a() {
            r1 = this;
            xyz.adscope.ad.a4 r0 = r1.e
            return r0
    }

    public void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r6) {
            r5 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.ImageModel r0 = r6.b()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.VideoModel r1 = r6.d()
            if (r0 == 0) goto L17
            xyz.adscope.ad.a4 r2 = r5.e
            java.lang.String r3 = r0.b()
            java.lang.String r4 = r0.a()
            r2.a(r3, r4)
        L17:
            if (r1 == 0) goto L26
            xyz.adscope.ad.a4 r2 = r5.e
            java.lang.String r3 = r1.f()
            java.lang.String r4 = r1.e()
            r2.a(r3, r4)
        L26:
            if (r0 != 0) goto L2a
            if (r1 == 0) goto L2d
        L2a:
            r0 = 1
            r5.f = r0
        L2d:
            xyz.adscope.ad.b4 r0 = r5.d
            r0.a(r6)
            return
    }

    @Override // xyz.adscope.ad.o2
    public void a(xyz.adscope.ad.o2 r3) {
            r2 = this;
            java.util.Map<java.lang.String, xyz.adscope.ad.o2> r0 = r2.b
            java.lang.String r1 = r3.e()
            r0.put(r1, r3)
            return
    }

    public void b(xyz.adscope.ad.o2 r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // xyz.adscope.ad.o2
    public boolean b() {
            r1 = this;
            boolean r0 = r1.f
            return r0
    }

    @Override // xyz.adscope.ad.o2
    public xyz.adscope.ad.b4 c() {
            r1 = this;
            xyz.adscope.ad.b4 r0 = r1.d
            return r0
    }

    public void c(xyz.adscope.ad.o2 r1) {
            r0 = this;
            r0.c = r1
            return
    }

    @Override // xyz.adscope.ad.o2
    public xyz.adscope.ad.o2 d() {
            r1 = this;
            xyz.adscope.ad.o2 r0 = r1.a
            return r0
    }

    @Override // xyz.adscope.ad.o2
    public java.lang.String e() {
            r1 = this;
            xyz.adscope.ad.b4 r0 = r1.d
            java.lang.String r0 = r0.getScopeViewID()
            return r0
    }

    public int f() {
            r1 = this;
            java.util.Map<java.lang.String, xyz.adscope.ad.o2> r0 = r1.b
            if (r0 == 0) goto L9
            int r0 = r0.size()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.util.List<xyz.adscope.ad.o2> g() {
            r2 = this;
            java.util.Map<java.lang.String, xyz.adscope.ad.o2> r0 = r2.b
            if (r0 == 0) goto L16
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L16
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.String, xyz.adscope.ad.o2> r1 = r2.b
            java.util.Collection r1 = r1.values()
            r0.<init>(r1)
            return r0
        L16:
            r0 = 0
            return r0
    }

    public java.util.Map<java.lang.String, xyz.adscope.ad.o2> h() {
            r1 = this;
            java.util.Map<java.lang.String, xyz.adscope.ad.o2> r0 = r1.g
            return r0
    }
}
