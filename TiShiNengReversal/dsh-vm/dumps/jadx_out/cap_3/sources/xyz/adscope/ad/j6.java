package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class j6 implements xyz.adscope.ad.w3, xyz.adscope.ad.k2 {
    private final android.content.Context a;
    private xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a b;
    private xyz.adscope.ad.h2 c;
    private final xyz.adscope.ad.y3 d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ xyz.adscope.ad.j6 a;

        a(xyz.adscope.ad.j6 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                xyz.adscope.ad.j6 r0 = r4.a
                xyz.adscope.ad.y3 r0 = xyz.adscope.ad.j6.a(r0)
                r0.a()
                xyz.adscope.ad.j6 r0 = r4.a
                xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r0 = xyz.adscope.ad.j6.b(r0)
                r1 = 0
                r0.measure(r1, r1)
                xyz.adscope.ad.j6 r0 = r4.a
                xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r0 = xyz.adscope.ad.j6.b(r0)
                int r0 = r0.getMeasuredHeight()
                xyz.adscope.ad.j6 r1 = r4.a
                xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r1 = xyz.adscope.ad.j6.b(r1)
                int r1 = r1.getMeasuredWidth()
                xyz.adscope.ad.j6 r2 = r4.a
                xyz.adscope.ad.h2 r3 = xyz.adscope.ad.j6.c(r2)
                int[] r0 = new int[]{r1, r0}
                xyz.adscope.ad.j6.a(r2, r3, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b implements xyz.adscope.ad.a4.a {
        final /* synthetic */ xyz.adscope.ad.j6 a;

        private b(xyz.adscope.ad.j6 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(xyz.adscope.ad.j6 r1, xyz.adscope.ad.j6.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // xyz.adscope.ad.a4.a
        public void a(xyz.adscope.ad.o2 r1) {
                r0 = this;
                return
        }

        @Override // xyz.adscope.ad.a4.a
        public void b(xyz.adscope.ad.o2 r2) {
                r1 = this;
                xyz.adscope.ad.j6 r0 = r1.a
                xyz.adscope.ad.j6.a(r0, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements xyz.adscope.ad.b4.a {
        final /* synthetic */ xyz.adscope.ad.j6 a;

        private c(xyz.adscope.ad.j6 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ c(xyz.adscope.ad.j6 r1, xyz.adscope.ad.j6.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // xyz.adscope.ad.b4.a
        public void a(java.lang.String r2) {
                r1 = this;
                xyz.adscope.ad.j6 r0 = r1.a
                xyz.adscope.ad.h2 r0 = xyz.adscope.ad.j6.c(r0)
                if (r0 == 0) goto L25
                xyz.adscope.ad.j6 r0 = r1.a
                xyz.adscope.ad.h2 r0 = xyz.adscope.ad.j6.c(r0)
                xyz.adscope.ad.o2 r2 = r0.a(r2)
                xyz.adscope.ad.b4 r2 = r2.c()
                boolean r0 = r2 instanceof android.view.View
                if (r0 == 0) goto L25
                xyz.adscope.ad.j6 r0 = r1.a
                xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r0 = xyz.adscope.ad.j6.b(r0)
                android.view.View r2 = (android.view.View) r2
                r0.removeView(r2)
            L25:
                return
        }

        @Override // xyz.adscope.ad.b4.a
        public void b(java.lang.String r1) {
                r0 = this;
                return
        }
    }

    public j6(android.content.Context r1, xyz.adscope.ad.a2 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            xyz.adscope.ad.y3 r1 = new xyz.adscope.ad.y3
            r1.<init>()
            r0.d = r1
            return
    }

    static /* synthetic */ xyz.adscope.ad.y3 a(xyz.adscope.ad.j6 r0) {
            xyz.adscope.ad.y3 r0 = r0.d
            return r0
    }

    private void a(xyz.adscope.ad.h2 r3, int[] r4) {
            r2 = this;
            xyz.adscope.ad.o2 r3 = r3.e()
            xyz.adscope.ad.a4 r0 = r3.a()
            if (r0 == 0) goto L36
            int r0 = r4.length
            r1 = 2
            if (r0 != r1) goto L36
            r0 = 0
            r0 = r4[r0]
            r1 = 1
            r4 = r4[r1]
            xyz.adscope.ad.a4 r1 = r3.a()
            r1.b(r0)
            xyz.adscope.ad.a4 r0 = r3.a()
            r0.c(r4)
            xyz.adscope.ad.a4 r4 = r3.a()
            xyz.adscope.ad.j6$b r0 = new xyz.adscope.ad.j6$b
            r1 = 0
            r0.<init>(r2, r1)
            r4.a(r0)
            xyz.adscope.ad.a4 r3 = r3.a()
            r3.d()
        L36:
            return
    }

    static /* synthetic */ void a(xyz.adscope.ad.j6 r0, xyz.adscope.ad.h2 r1, int[] r2) {
            r0.a(r1, r2)
            return
    }

    static /* synthetic */ void a(xyz.adscope.ad.j6 r0, xyz.adscope.ad.o2 r1) {
            r0.a(r1)
            return
    }

    private void a(xyz.adscope.ad.o2 r6) {
            r5 = this;
            xyz.adscope.ad.b4 r0 = r6.c()
            if (r0 == 0) goto L75
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            xyz.adscope.ad.o2 r2 = r6.d()
            if (r2 != 0) goto L12
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r2 = r5.b
            goto L23
        L12:
            xyz.adscope.ad.o2 r2 = r6.d()
            xyz.adscope.ad.b4 r2 = r2.c()
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L21
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L23
        L21:
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r2 = r5.b
        L23:
            xyz.adscope.ad.a4 r3 = r6.a()
            android.widget.RelativeLayout$LayoutParams r3 = r3.e()
            if (r2 == 0) goto L6b
            if (r3 == 0) goto L6b
            boolean r4 = r1 instanceof xyz.adscope.ad.c6
            if (r4 != 0) goto L37
            boolean r4 = r1 instanceof xyz.adscope.ad.z5
            if (r4 == 0) goto L3a
        L37:
            r4 = -2
            r3.width = r4
        L3a:
            r1.setLayoutParams(r3)
            xyz.adscope.ad.y3 r3 = r5.d
            xyz.adscope.ad.z3$a r4 = xyz.adscope.ad.z3.a.c
            r3.a(r4, r6)
            int r6 = r0.getLayer()
            r3 = 1
            if (r6 != r3) goto L4d
            r6 = 0
            goto L51
        L4d:
            int r6 = r2.getChildCount()
        L51:
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r4 = r5.b
            if (r2 != r4) goto L5f
            int r4 = r2.getChildCount()
            if (r4 <= 0) goto L5f
            r2.addView(r1, r3)
            goto L62
        L5f:
            r2.addView(r1, r6)
        L62:
            xyz.adscope.ad.j6$c r6 = new xyz.adscope.ad.j6$c
            r1 = 0
            r6.<init>(r5, r1)
            r0.a(r6)
        L6b:
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r6 = r5.b
            r0.setExpressRoot(r6)
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r6 = r5.b
            r6.requestLayout()
        L75:
            return
    }

    static /* synthetic */ xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a b(xyz.adscope.ad.j6 r0) {
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r0 = r0.b
            return r0
    }

    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel b(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.MediaModel r2) {
            r1 = this;
            if (r2 == 0) goto L11
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.AdModel r0 = r2.a()
            if (r0 == 0) goto L11
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.AdModel r2 = r2.a()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r2 = r2.b()
            return r2
        L11:
            r2 = 0
            return r2
    }

    static /* synthetic */ xyz.adscope.ad.h2 c(xyz.adscope.ad.j6 r0) {
            xyz.adscope.ad.h2 r0 = r0.c
            return r0
    }

    @Override // xyz.adscope.ad.w3
    public void a() {
            r1 = this;
            xyz.adscope.ad.y3 r0 = r1.d
            r0.b()
            return
    }

    public void a(xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r1) {
            r0 = this;
            r0.b = r1
            return
    }

    @Override // xyz.adscope.ad.w3
    public boolean a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.MediaModel r4) {
            r3 = this;
            xyz.adscope.ad.y3 r0 = r3.d
            r1 = 0
            r0.a(r1)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.AdModel r0 = r4.a()
            if (r0 == 0) goto L1c
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r4 = r3.b(r4)
            xyz.adscope.ad.r1 r0 = xyz.adscope.ad.r1.a()
            android.content.Context r2 = r3.a
            xyz.adscope.ad.h2 r4 = r0.b(r2, r4, r1)
            r3.c = r4
        L1c:
            r4 = 0
            return r4
    }

    @Override // xyz.adscope.ad.w3
    public void b() {
            r2 = this;
            xyz.adscope.ad.h2 r0 = r2.c
            if (r0 == 0) goto L14
            boolean r0 = r0.c()
            if (r0 == 0) goto L14
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r0 = r2.b
            xyz.adscope.ad.j6$a r1 = new xyz.adscope.ad.j6$a
            r1.<init>(r2)
            r0.post(r1)
        L14:
            return
    }

    @Override // xyz.adscope.ad.k2
    public xyz.adscope.ad.j2 c() {
            r1 = this;
            xyz.adscope.ad.y3 r0 = r1.d
            return r0
    }

    @Override // xyz.adscope.ad.w3
    public android.view.View getExpressView() {
            r1 = this;
            r0 = 0
            return r0
    }
}
