package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class g1 implements xyz.adscope.ad.i3<android.view.View, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel>, xyz.adscope.ad.k2 {
    private final xyz.adscope.ad.m3 a;
    protected final java.lang.String b;
    protected final android.content.Context c;
    private xyz.adscope.ad.w2 d;
    protected android.view.View e;
    protected boolean f;
    protected xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel g;
    protected xyz.adscope.ad.c h;

    public g1(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f = r0
            xyz.adscope.ad.m3 r0 = new xyz.adscope.ad.m3
            r0.<init>()
            r1.a = r0
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.c = r2
            r1.b = r3
            return
    }

    @Override // xyz.adscope.ad.i3
    public void a() {
            r1 = this;
            r0 = 1
            r1.f = r0
            xyz.adscope.ad.m3 r0 = r1.a
            r0.a()
            return
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public void a2(android.view.View r1, xyz.adscope.ad.c r2) {
            r0 = this;
            r0.e = r1
            r0.h = r2
            xyz.adscope.ad.m3 r1 = r0.a
            r2 = 0
            r1.a(r2)
            return
    }

    @Override // xyz.adscope.ad.i3
    public /* bridge */ /* synthetic */ void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r1) {
            r0 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r1 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel) r1
            r0.a2(r1)
            return
    }

    @Override // xyz.adscope.ad.i3
    public /* bridge */ /* synthetic */ void a(android.view.View r1, xyz.adscope.ad.c r2) {
            r0 = this;
            android.view.View r1 = (android.view.View) r1
            r0.a2(r1, r2)
            return
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public void a2(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r1) {
            r0 = this;
            r0.g = r1
            r0.d()
            return
    }

    protected void a(xyz.adscope.ad.n3.a r3) {
            r2 = this;
            xyz.adscope.ad.n3$a r0 = xyz.adscope.ad.n3.a.f
            if (r3 == r0) goto L8
            xyz.adscope.ad.n3$a r0 = xyz.adscope.ad.n3.a.e
            if (r3 != r0) goto L19
        L8:
            xyz.adscope.ad.e7 r0 = xyz.adscope.ad.e7.a()
            android.content.Context r1 = r2.c
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.ad.x6 r0 = (xyz.adscope.ad.x6) r0
            xyz.adscope.ad.c r1 = r2.h
            r0.b(r1)
        L19:
            xyz.adscope.ad.m3 r0 = r2.a
            android.view.View r1 = r2.e
            r0.a(r3, r1)
            xyz.adscope.ad.w2 r0 = r2.d
            if (r0 == 0) goto L2d
            android.view.View r1 = r2.e
            int r3 = r3.getEventCode()
            r0.a(r1, r3)
        L2d:
            return
    }

    @Override // xyz.adscope.ad.i3
    public void a(xyz.adscope.ad.w2 r1) {
            r0 = this;
            r0.d = r1
            return
    }

    @Override // xyz.adscope.ad.i3
    public void b() {
            r1 = this;
            r0 = 0
            r1.f = r0
            xyz.adscope.ad.m3 r0 = r1.a
            r0.b()
            return
    }

    @Override // xyz.adscope.ad.k2
    public xyz.adscope.ad.j2 c() {
            r1 = this;
            xyz.adscope.ad.m3 r0 = r1.a
            return r0
    }

    protected abstract void d();
}
