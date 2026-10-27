package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class a7 extends xyz.adscope.ad.x4 {
    private boolean h;
    private android.view.View.OnTouchListener i;
    private boolean j;
    private boolean k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnTouchListener {
        final /* synthetic */ xyz.adscope.ad.a7 a;

        a(xyz.adscope.ad.a7 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View r2, android.view.MotionEvent r3) {
                r1 = this;
                int r2 = r3.getAction()
                r3 = 0
                r0 = 1
                if (r2 != r0) goto L20
                xyz.adscope.ad.a7 r2 = r1.a
                boolean r2 = xyz.adscope.ad.a7.a(r2)
                if (r2 == 0) goto L20
                xyz.adscope.ad.a7 r2 = r1.a
                r2.d()
                xyz.adscope.ad.a7 r2 = r1.a
                xyz.adscope.ad.a7.a(r2, r3)
                xyz.adscope.ad.a7 r2 = r1.a
                xyz.adscope.ad.a7.b(r2)
                return r0
            L20:
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.view.View.OnTouchListener {
        final /* synthetic */ xyz.adscope.ad.a7 a;

        b(xyz.adscope.ad.a7 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View r1, android.view.MotionEvent r2) {
                r0 = this;
                int r1 = r2.getAction()
                if (r1 != 0) goto L1f
                xyz.adscope.ad.a7 r1 = r0.a
                r2 = 1
                xyz.adscope.ad.a7.a(r1, r2)
                xyz.adscope.ad.a7 r1 = r0.a
                boolean r1 = xyz.adscope.ad.a7.c(r1)
                if (r1 == 0) goto L1a
                xyz.adscope.ad.a7 r1 = r0.a
                r1.d()
                goto L1f
            L1a:
                xyz.adscope.ad.a7 r1 = r0.a
                xyz.adscope.ad.a7.d(r1)
            L1f:
                r1 = 0
                return r1
        }
    }

    public a7(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.h = r1
            r0.j = r1
            r0.k = r1
            return
    }

    private void a(android.view.View r2, android.view.View.OnTouchListener r3) {
            r1 = this;
            if (r2 == 0) goto L15
            android.view.ViewParent r2 = r2.getParent()
        L6:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L15
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.setOnTouchListener(r3)
            android.view.ViewParent r2 = r2.getParent()
            goto L6
        L15:
            return
    }

    static /* synthetic */ boolean a(xyz.adscope.ad.a7 r0) {
            boolean r0 = r0.h
            return r0
    }

    static /* synthetic */ boolean a(xyz.adscope.ad.a7 r0, boolean r1) {
            r0.h = r1
            return r1
    }

    static /* synthetic */ void b(xyz.adscope.ad.a7 r0) {
            r0.h()
            return
    }

    static /* synthetic */ boolean c(xyz.adscope.ad.a7 r0) {
            boolean r0 = r0.k
            return r0
    }

    static /* synthetic */ void d(xyz.adscope.ad.a7 r0) {
            r0.g()
            return
    }

    private android.view.View.OnTouchListener f() {
            r1 = this;
            xyz.adscope.ad.a7$a r0 = new xyz.adscope.ad.a7$a
            r0.<init>(r1)
            return r0
    }

    private void g() {
            r2 = this;
            android.view.View$OnTouchListener r0 = r2.i
            if (r0 != 0) goto L13
            boolean r0 = r2.j
            if (r0 == 0) goto L13
            android.view.View$OnTouchListener r0 = r2.f()
            r2.i = r0
            android.view.View r1 = r2.f
            r2.a(r1, r0)
        L13:
            return
    }

    private void h() {
            r2 = this;
            android.view.View r0 = r2.f
            r1 = 0
            r2.a(r0, r1)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xyz.adscope.ad.x4
    public void a(android.view.View r1, xyz.adscope.ad.c r2) {
            r0 = this;
            super.a(r1, r2)
            boolean r2 = r1 instanceof xyz.adscope.ad.z6
            if (r2 == 0) goto L15
            xyz.adscope.ad.z6 r1 = (xyz.adscope.ad.z6) r1
            boolean r2 = r1.e()
            r0.j = r2
            boolean r1 = r1.f()
            r0.k = r1
        L15:
            return
    }

    @Override // xyz.adscope.ad.x4, xyz.adscope.ad.i3
    public /* bridge */ /* synthetic */ void a(android.view.View r1, xyz.adscope.ad.c r2) {
            r0 = this;
            android.view.View r1 = (android.view.View) r1
            r0.a(r1, r2)
            return
    }

    @Override // xyz.adscope.ad.x4
    protected void b(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.OptimizeModel r2) {
            r1 = this;
            super.b(r2)
            android.view.View r2 = r1.f
            if (r2 == 0) goto Lf
            xyz.adscope.ad.a7$b r0 = new xyz.adscope.ad.a7$b
            r0.<init>(r1)
            r2.setOnTouchListener(r0)
        Lf:
            return
    }
}
