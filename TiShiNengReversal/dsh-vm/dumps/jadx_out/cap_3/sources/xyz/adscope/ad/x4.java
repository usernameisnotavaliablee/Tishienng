package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class x4 implements xyz.adscope.ad.i3<android.view.View, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.OptimizeModel>, xyz.adscope.ad.k2 {
    private final android.content.Context a;
    private final java.lang.String b;
    protected final xyz.adscope.ad.m3 c;
    protected xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.OptimizeModel d;
    private xyz.adscope.ad.w2 e;
    protected android.view.View f;
    protected xyz.adscope.ad.x4.b g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnTouchListener {
        final /* synthetic */ xyz.adscope.ad.x4 a;

        a(xyz.adscope.ad.x4 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View r2, android.view.MotionEvent r3) {
                r1 = this;
                xyz.adscope.ad.x4 r0 = r1.a
                xyz.adscope.ad.x4$b r0 = r0.g
                if (r0 == 0) goto L9
                r0.a(r2, r3)
            L9:
                int r2 = r3.getAction()
                r3 = 1
                if (r2 != r3) goto L15
                xyz.adscope.ad.x4 r2 = r1.a
                r2.d()
            L15:
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a(android.view.View r1, android.view.MotionEvent r2);
    }

    public x4(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            xyz.adscope.ad.m3 r1 = new xyz.adscope.ad.m3
            r1.<init>()
            r0.c = r1
            return
    }

    @Override // xyz.adscope.ad.i3
    public void a() {
            r1 = this;
            xyz.adscope.ad.m3 r0 = r1.c
            r0.a()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    public void a(android.view.View r1, xyz.adscope.ad.c r2) {
            r0 = this;
            r0.f = r1
            xyz.adscope.ad.m3 r1 = r0.c
            r2 = 0
            r1.a(r2)
            return
    }

    @Override // xyz.adscope.ad.i3
    public /* bridge */ /* synthetic */ void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.OptimizeModel r1) {
            r0 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.OptimizeModel r1 = (xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.OptimizeModel) r1
            r0.a2(r1)
            return
    }

    @Override // xyz.adscope.ad.i3
    public /* bridge */ /* synthetic */ void a(android.view.View r1, xyz.adscope.ad.c r2) {
            r0 = this;
            android.view.View r1 = (android.view.View) r1
            r0.a(r1, r2)
            return
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public void a2(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.OptimizeModel r1) {
            r0 = this;
            r0.d = r1
            r0.b(r1)
            return
    }

    @Override // xyz.adscope.ad.i3
    public void a(xyz.adscope.ad.w2 r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void a(xyz.adscope.ad.x4.b r1) {
            r0 = this;
            r0.g = r1
            return
    }

    @Override // xyz.adscope.ad.i3
    public void b() {
            r0 = this;
            return
    }

    protected void b(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.OptimizeModel r2) {
            r1 = this;
            android.view.View r2 = r1.f
            if (r2 == 0) goto Lc
            xyz.adscope.ad.x4$a r0 = new xyz.adscope.ad.x4$a
            r0.<init>(r1)
            r2.setOnTouchListener(r0)
        Lc:
            return
    }

    @Override // xyz.adscope.ad.k2
    public xyz.adscope.ad.j2 c() {
            r1 = this;
            xyz.adscope.ad.m3 r0 = r1.c
            return r0
    }

    protected void d() {
            r3 = this;
            xyz.adscope.ad.m3 r0 = r3.c
            xyz.adscope.ad.n3$a r1 = xyz.adscope.ad.n3.a.g
            android.view.View r2 = r3.f
            r0.a(r1, r2)
            xyz.adscope.ad.w2 r0 = r3.e
            if (r0 == 0) goto L16
            android.view.View r2 = r3.f
            int r1 = r1.getEventCode()
            r0.a(r2, r1)
        L16:
            return
    }

    public void e() {
            r1 = this;
            r0 = 0
            r1.f = r0
            r1.b()
            return
    }
}
