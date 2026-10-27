package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class h6 implements xyz.adscope.ad.w3, xyz.adscope.ad.k2 {
    private xyz.adscope.ad.h2 a;
    private final xyz.adscope.ad.y3 b;
    private final android.content.Context c;
    private final xyz.adscope.ad.a2 d;
    private final xyz.adscope.ad.l0 e;
    private xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a f;
    private java.util.concurrent.atomic.AtomicInteger g;
    private java.lang.String h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements xyz.adscope.ad.h2.a {
        final /* synthetic */ xyz.adscope.ad.h6 a;

        a(xyz.adscope.ad.h6 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // xyz.adscope.ad.h2.a
        public java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel> a(java.lang.String r3) {
                r2 = this;
                xyz.adscope.ad.h6 r0 = r2.a
                xyz.adscope.ad.l0 r0 = xyz.adscope.ad.h6.b(r0)
                xyz.adscope.ad.h6 r1 = r2.a
                xyz.adscope.ad.a2 r1 = xyz.adscope.ad.h6.a(r1)
                xyz.adscope.ad.c r1 = r1.getAdType()
                java.util.List r3 = r0.a(r1, r3)
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b implements xyz.adscope.ad.a4.a {
        final /* synthetic */ xyz.adscope.ad.h6 a;

        private b(xyz.adscope.ad.h6 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(xyz.adscope.ad.h6 r1, xyz.adscope.ad.h6.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // xyz.adscope.ad.a4.a
        public void a(xyz.adscope.ad.o2 r1) {
                r0 = this;
                xyz.adscope.ad.h6 r1 = r0.a
                xyz.adscope.ad.h2 r1 = xyz.adscope.ad.h6.c(r1)
                if (r1 == 0) goto L16
                xyz.adscope.ad.h6 r1 = r0.a
                xyz.adscope.ad.h2 r1 = xyz.adscope.ad.h6.c(r1)
                r1.b()
                xyz.adscope.ad.h6 r1 = r0.a
                r1.b()
            L16:
                return
        }

        @Override // xyz.adscope.ad.a4.a
        public void b(xyz.adscope.ad.o2 r2) {
                r1 = this;
                xyz.adscope.ad.h6 r0 = r1.a
                xyz.adscope.ad.h6.a(r0, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements xyz.adscope.ad.b4.a {
        final /* synthetic */ xyz.adscope.ad.h6 a;

        private c(xyz.adscope.ad.h6 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ c(xyz.adscope.ad.h6 r1, xyz.adscope.ad.h6.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // xyz.adscope.ad.b4.a
        public void a(java.lang.String r2) {
                r1 = this;
                xyz.adscope.ad.h6 r0 = r1.a
                xyz.adscope.ad.h2 r0 = xyz.adscope.ad.h6.c(r0)
                if (r0 == 0) goto L17
                xyz.adscope.ad.h6 r0 = r1.a
                xyz.adscope.ad.h2 r0 = xyz.adscope.ad.h6.c(r0)
                xyz.adscope.ad.o2 r2 = r0.a(r2)
                xyz.adscope.ad.h6 r0 = r1.a
                xyz.adscope.ad.h6.b(r0, r2)
            L17:
                return
        }

        @Override // xyz.adscope.ad.b4.a
        public void b(java.lang.String r4) {
                r3 = this;
                xyz.adscope.ad.h6 r0 = r3.a
                xyz.adscope.ad.h2 r0 = xyz.adscope.ad.h6.c(r0)
                if (r0 == 0) goto L1d
                xyz.adscope.ad.h6 r0 = r3.a
                xyz.adscope.ad.h2 r0 = xyz.adscope.ad.h6.c(r0)
                xyz.adscope.ad.o2 r4 = r0.a(r4)
                xyz.adscope.ad.h6 r0 = r3.a
                xyz.adscope.ad.y3 r0 = xyz.adscope.ad.h6.d(r0)
                xyz.adscope.ad.z3$a r1 = xyz.adscope.ad.z3.a.c
                r0.a(r1, r4)
            L1d:
                xyz.adscope.ad.h6 r4 = r3.a
                java.util.concurrent.atomic.AtomicInteger r4 = xyz.adscope.ad.h6.e(r4)
                if (r4 == 0) goto L7d
                xyz.adscope.ad.h6 r4 = r3.a
                java.util.concurrent.atomic.AtomicInteger r4 = xyz.adscope.ad.h6.e(r4)
                int r4 = r4.decrementAndGet()
                if (r4 != 0) goto L7d
                xyz.adscope.ad.h6 r4 = r3.a
                xyz.adscope.ad.h2 r4 = xyz.adscope.ad.h6.c(r4)
                if (r4 == 0) goto L44
                xyz.adscope.ad.h6 r4 = r3.a
                xyz.adscope.ad.h2 r4 = xyz.adscope.ad.h6.c(r4)
                java.lang.String r4 = r4.f()
                goto L46
            L44:
                java.lang.String r4 = ""
            L46:
                xyz.adscope.ad.h6 r0 = r3.a
                java.lang.String r0 = xyz.adscope.ad.h6.f(r0)
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L71
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 != 0) goto L71
                xyz.adscope.ad.h6 r0 = r3.a
                xyz.adscope.ad.l0 r0 = xyz.adscope.ad.h6.b(r0)
                xyz.adscope.ad.h6 r1 = r3.a
                xyz.adscope.ad.a2 r1 = xyz.adscope.ad.h6.a(r1)
                xyz.adscope.ad.c r1 = r1.getAdType()
                xyz.adscope.ad.h6 r2 = r3.a
                java.lang.String r2 = xyz.adscope.ad.h6.f(r2)
                r0.a(r1, r2, r4)
            L71:
                xyz.adscope.ad.h6 r4 = r3.a
                xyz.adscope.ad.y3 r4 = xyz.adscope.ad.h6.d(r4)
                xyz.adscope.ad.z3$a r0 = xyz.adscope.ad.z3.a.d
                r1 = 0
                r4.a(r0, r1)
            L7d:
                return
        }
    }

    public h6(android.content.Context r1, xyz.adscope.ad.a2 r2) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.d = r2
            xyz.adscope.ad.y3 r2 = new xyz.adscope.ad.y3
            r2.<init>()
            r0.b = r2
            xyz.adscope.ad.m0 r2 = xyz.adscope.ad.m0.a()
            java.lang.Object r1 = r2.getOrCreateImplement(r1)
            xyz.adscope.ad.l0 r1 = (xyz.adscope.ad.l0) r1
            r0.e = r1
            return
    }

    static /* synthetic */ xyz.adscope.ad.a2 a(xyz.adscope.ad.h6 r0) {
            xyz.adscope.ad.a2 r0 = r0.d
            return r0
    }

    private void a(xyz.adscope.ad.h2 r7) {
            r6 = this;
            xyz.adscope.ad.o2 r7 = r7.e()
            xyz.adscope.ad.a4 r0 = r7.a()
            r1 = 0
            if (r0 == 0) goto L61
            xyz.adscope.ad.a2 r0 = r6.d
            float[] r0 = r6.a(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "广告展示大小 "
            r2.append(r3)
            r3 = 0
            r4 = r0[r3]
            r2.append(r4)
            java.lang.String r4 = " "
            r2.append(r4)
            r4 = 1
            r5 = r0[r4]
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "Render"
            xyz.adscope.common.v2.log.SDKLog.i(r5, r2)
            int r2 = r0.length
            r5 = 2
            if (r2 != r5) goto L61
            r2 = r0[r3]
            int r2 = (int) r2
            r0 = r0[r4]
            int r0 = (int) r0
            xyz.adscope.ad.a4 r3 = r7.a()
            r3.b(r2)
            xyz.adscope.ad.a4 r2 = r7.a()
            r2.c(r0)
            xyz.adscope.ad.a4 r0 = r7.a()
            xyz.adscope.ad.h6$b r2 = new xyz.adscope.ad.h6$b
            r2.<init>(r6, r1)
            r0.a(r2)
            xyz.adscope.ad.a4 r7 = r7.a()
            r7.d()
            return
        L61:
            r6.a(r1)
            return
    }

    static /* synthetic */ void a(xyz.adscope.ad.h6 r0, xyz.adscope.ad.o2 r1) {
            r0.b(r1)
            return
    }

    private void a(xyz.adscope.ad.o2 r3) {
            r2 = this;
            xyz.adscope.ad.y3 r0 = r2.b
            xyz.adscope.ad.z3$a r1 = xyz.adscope.ad.z3.a.e
            r0.a(r1, r3)
            return
    }

    private float[] a(xyz.adscope.ad.a2 r4) {
            r3 = this;
            float[] r0 = r4.getExpressViewSizePixel()
            xyz.adscope.ad.c r4 = r4.getAdType()
            xyz.adscope.ad.c r1 = xyz.adscope.ad.c.h
            if (r4 != r1) goto L2d
            r4 = 0
            r1 = r0[r4]
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L1d
            android.content.Context r1 = r3.c
            int r1 = xyz.adscope.common.v2.dev.info.ScreenUtil.getScreenWidth(r1)
            float r1 = (float) r1
            r0[r4] = r1
        L1d:
            r4 = 1
            r1 = r0[r4]
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L2d
            android.content.Context r1 = r3.c
            int r1 = xyz.adscope.common.v2.dev.info.ScreenUtil.getScreenHeight(r1)
            float r1 = (float) r1
            r0[r4] = r1
        L2d:
            return r0
    }

    static /* synthetic */ xyz.adscope.ad.l0 b(xyz.adscope.ad.h6 r0) {
            xyz.adscope.ad.l0 r0 = r0.e
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

    static /* synthetic */ void b(xyz.adscope.ad.h6 r0, xyz.adscope.ad.o2 r1) {
            r0.a(r1)
            return
    }

    private void b(xyz.adscope.ad.o2 r10) {
            r9 = this;
            xyz.adscope.ad.b4 r0 = r10.c()
            if (r0 == 0) goto L81
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            xyz.adscope.ad.o2 r2 = r10.d()
            r3 = 1
            r4 = 0
            r5 = -2
            if (r2 != 0) goto L31
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r2 = r9.f
            xyz.adscope.ad.a2 r6 = r9.d
            float[] r6 = r9.a(r6)
            r7 = r6[r4]
            int r7 = (int) r7
            r6 = r6[r3]
            int r6 = (int) r6
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams
            if (r7 <= 0) goto L25
            goto L26
        L25:
            r7 = -2
        L26:
            if (r6 <= 0) goto L29
            goto L2a
        L29:
            r6 = -2
        L2a:
            r8.<init>(r7, r6)
            r2.setLayoutParams(r8)
            goto L42
        L31:
            xyz.adscope.ad.o2 r2 = r10.d()
            xyz.adscope.ad.b4 r2 = r2.c()
            boolean r6 = r2 instanceof android.view.ViewGroup
            if (r6 == 0) goto L40
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L42
        L40:
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r2 = r9.f
        L42:
            xyz.adscope.ad.a4 r6 = r10.a()
            android.widget.RelativeLayout$LayoutParams r6 = r6.e()
            if (r2 == 0) goto L73
            if (r6 == 0) goto L73
            boolean r10 = r1 instanceof xyz.adscope.ad.c6
            if (r10 != 0) goto L56
            boolean r10 = r1 instanceof xyz.adscope.ad.z5
            if (r10 == 0) goto L58
        L56:
            r6.width = r5
        L58:
            r1.setLayoutParams(r6)
            int r10 = r0.getLayer()
            if (r10 != r3) goto L62
            goto L66
        L62:
            int r4 = r2.getChildCount()
        L66:
            r2.addView(r1, r4)
            xyz.adscope.ad.h6$c r10 = new xyz.adscope.ad.h6$c
            r1 = 0
            r10.<init>(r9, r1)
            r0.a(r10)
            goto L76
        L73:
            r9.a(r10)
        L76:
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r10 = r9.f
            r0.setExpressRoot(r10)
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r10 = r9.f
            r10.requestLayout()
            return
        L81:
            r9.a(r10)
            return
    }

    static /* synthetic */ xyz.adscope.ad.h2 c(xyz.adscope.ad.h6 r0) {
            xyz.adscope.ad.h2 r0 = r0.a
            return r0
    }

    static /* synthetic */ xyz.adscope.ad.y3 d(xyz.adscope.ad.h6 r0) {
            xyz.adscope.ad.y3 r0 = r0.b
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicInteger e(xyz.adscope.ad.h6 r0) {
            java.util.concurrent.atomic.AtomicInteger r0 = r0.g
            return r0
    }

    static /* synthetic */ java.lang.String f(xyz.adscope.ad.h6 r0) {
            java.lang.String r0 = r0.h
            return r0
    }

    @Override // xyz.adscope.ad.w3
    public void a() {
            r1 = this;
            xyz.adscope.ad.h2 r0 = r1.a
            if (r0 == 0) goto La
            r0.a()
            r0 = 0
            r1.a = r0
        La:
            xyz.adscope.ad.y3 r0 = r1.b
            if (r0 == 0) goto L11
            r0.b()
        L11:
            return
    }

    @Override // xyz.adscope.ad.w3
    public boolean a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.MediaModel r4) {
            r3 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.AdModel r0 = r4.a()
            if (r0 == 0) goto L5b
            xyz.adscope.ad.y3 r0 = r3.b
            r1 = 0
            r0.a(r1)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r4 = r3.b(r4)
            xyz.adscope.ad.r1 r0 = xyz.adscope.ad.r1.a()
            android.content.Context r1 = r3.c
            xyz.adscope.ad.h6$a r2 = new xyz.adscope.ad.h6$a
            r2.<init>(r3)
            xyz.adscope.ad.h2 r0 = r0.b(r1, r4, r2)
            r3.a = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            xyz.adscope.ad.h2 r1 = r3.a
            int r1 = r1.d()
            r0.<init>(r1)
            r3.g = r0
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r0 = new xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a
            android.content.Context r1 = r3.c
            xyz.adscope.ad.a2 r2 = r3.d
            java.lang.String r2 = r2.getApiKey()
            r0.<init>(r1, r2)
            r3.f = r0
            xyz.adscope.ad.h2 r0 = r3.a
            if (r0 == 0) goto L5b
            boolean r0 = r0.c()
            if (r0 == 0) goto L5b
            if (r4 == 0) goto L59
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r0 = r4.d()
            if (r0 == 0) goto L59
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r4 = r4.d()
            java.lang.String r4 = r4.f()
            r3.h = r4
        L59:
            r4 = 1
            return r4
        L5b:
            r4 = 0
            return r4
    }

    @Override // xyz.adscope.ad.w3
    public void b() {
            r1 = this;
            xyz.adscope.ad.h2 r0 = r1.a
            if (r0 == 0) goto L15
            boolean r0 = r0.c()
            if (r0 == 0) goto L15
            xyz.adscope.ad.y3 r0 = r1.b
            r0.a()
            xyz.adscope.ad.h2 r0 = r1.a
            r1.a(r0)
            return
        L15:
            r0 = 0
            r1.a(r0)
            return
    }

    @Override // xyz.adscope.ad.k2
    public xyz.adscope.ad.j2 c() {
            r1 = this;
            xyz.adscope.ad.y3 r0 = r1.b
            return r0
    }

    @Override // xyz.adscope.ad.w3
    public android.view.View getExpressView() {
            r1 = this;
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r0 = r1.f
            return r0
    }
}
