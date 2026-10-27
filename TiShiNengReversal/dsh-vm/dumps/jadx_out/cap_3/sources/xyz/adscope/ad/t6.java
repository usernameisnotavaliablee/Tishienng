package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class t6 extends xyz.adscope.ad.x4 {
    private android.view.ViewTreeObserver.OnScrollChangedListener h;
    private android.graphics.Rect i;
    private int j;
    private int k;
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.SlideParams l;
    private final long m;
    private boolean n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.ViewTreeObserver.OnScrollChangedListener {
        final /* synthetic */ xyz.adscope.ad.t6 a;

        a(xyz.adscope.ad.t6 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
                r5 = this;
                xyz.adscope.ad.t6 r0 = r5.a
                boolean r0 = xyz.adscope.ad.t6.a(r0)
                if (r0 == 0) goto L7e
                xyz.adscope.ad.t6 r0 = r5.a
                android.view.View r1 = r0.f
                android.graphics.Rect r0 = xyz.adscope.ad.t6.b(r0)
                r1.getGlobalVisibleRect(r0)
                xyz.adscope.ad.t6 r0 = r5.a
                int r0 = xyz.adscope.ad.t6.c(r0)
                if (r0 != 0) goto L26
                xyz.adscope.ad.t6 r0 = r5.a
                android.graphics.Rect r1 = xyz.adscope.ad.t6.b(r0)
                int r1 = r1.top
                xyz.adscope.ad.t6.a(r0, r1)
            L26:
                xyz.adscope.ad.t6 r0 = r5.a
                android.graphics.Rect r1 = xyz.adscope.ad.t6.b(r0)
                int r1 = r1.top
                xyz.adscope.ad.t6 r2 = r5.a
                int r2 = xyz.adscope.ad.t6.c(r2)
                int r1 = r1 - r2
                int r1 = java.lang.Math.abs(r1)
                xyz.adscope.ad.t6.b(r0, r1)
                xyz.adscope.ad.t6 r0 = r5.a
                int r0 = xyz.adscope.ad.t6.d(r0)
                xyz.adscope.ad.t6 r1 = r5.a
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.SlideParams r1 = xyz.adscope.ad.t6.e(r1)
                int r1 = r1.a()
                if (r0 <= r1) goto L7e
                long r0 = java.lang.System.currentTimeMillis()
                xyz.adscope.ad.t6 r2 = r5.a
                long r2 = xyz.adscope.ad.t6.f(r2)
                long r0 = r0 - r2
                xyz.adscope.ad.t6 r2 = r5.a
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.SlideParams r2 = xyz.adscope.ad.t6.e(r2)
                int r2 = r2.b()
                long r2 = (long) r2
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L7e
                xyz.adscope.ad.t6 r0 = r5.a
                r0.d()
                xyz.adscope.ad.t6 r0 = r5.a
                android.view.View r0 = r0.f
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                xyz.adscope.ad.t6 r1 = r5.a
                android.view.ViewTreeObserver$OnScrollChangedListener r1 = xyz.adscope.ad.t6.g(r1)
                r0.removeOnScrollChangedListener(r1)
            L7e:
                return
        }
    }

    public t6(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.n = r1
            long r1 = java.lang.System.currentTimeMillis()
            r0.m = r1
            return
    }

    static /* synthetic */ int a(xyz.adscope.ad.t6 r0, int r1) {
            r0.k = r1
            return r1
    }

    static /* synthetic */ boolean a(xyz.adscope.ad.t6 r0) {
            boolean r0 = r0.n
            return r0
    }

    static /* synthetic */ int b(xyz.adscope.ad.t6 r1, int r2) {
            int r0 = r1.j
            int r0 = r0 + r2
            r1.j = r0
            return r0
    }

    static /* synthetic */ android.graphics.Rect b(xyz.adscope.ad.t6 r0) {
            android.graphics.Rect r0 = r0.i
            return r0
    }

    static /* synthetic */ int c(xyz.adscope.ad.t6 r0) {
            int r0 = r0.k
            return r0
    }

    static /* synthetic */ int d(xyz.adscope.ad.t6 r0) {
            int r0 = r0.j
            return r0
    }

    static /* synthetic */ xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.SlideParams e(xyz.adscope.ad.t6 r0) {
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.SlideParams r0 = r0.l
            return r0
    }

    static /* synthetic */ long f(xyz.adscope.ad.t6 r2) {
            long r0 = r2.m
            return r0
    }

    private android.view.ViewTreeObserver.OnScrollChangedListener f() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.SlideParams r0 = r1.l
            if (r0 == 0) goto L11
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.i = r0
            xyz.adscope.ad.t6$a r0 = new xyz.adscope.ad.t6$a
            r0.<init>(r1)
            return r0
        L11:
            r0 = 0
            return r0
    }

    static /* synthetic */ android.view.ViewTreeObserver.OnScrollChangedListener g(xyz.adscope.ad.t6 r0) {
            android.view.ViewTreeObserver$OnScrollChangedListener r0 = r0.h
            return r0
    }

    @Override // xyz.adscope.ad.x4, xyz.adscope.ad.i3
    public void a() {
            r1 = this;
            super.a()
            r0 = 1
            r1.n = r0
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xyz.adscope.ad.x4
    public void a(android.view.View r1, xyz.adscope.ad.c r2) {
            r0 = this;
            super.a(r1, r2)
            return
    }

    @Override // xyz.adscope.ad.x4, xyz.adscope.ad.i3
    public /* bridge */ /* synthetic */ void a(android.view.View r1, xyz.adscope.ad.c r2) {
            r0 = this;
            android.view.View r1 = (android.view.View) r1
            r0.a(r1, r2)
            return
    }

    @Override // xyz.adscope.ad.x4, xyz.adscope.ad.i3
    public void b() {
            r1 = this;
            super.b()
            r0 = 0
            r1.n = r0
            return
    }

    @Override // xyz.adscope.ad.x4
    protected void b(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.OptimizeModel r2) {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.SlideParams r2 = r2.d()
            r1.l = r2
            android.view.View r2 = r1.f
            if (r2 == 0) goto L1f
            android.view.ViewTreeObserver$OnScrollChangedListener r2 = r1.f()
            r1.h = r2
            android.view.View r2 = r1.f
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            if (r2 == 0) goto L1f
            android.view.ViewTreeObserver$OnScrollChangedListener r0 = r1.h
            if (r0 == 0) goto L1f
            r2.addOnScrollChangedListener(r0)
        L1f:
            return
    }
}
