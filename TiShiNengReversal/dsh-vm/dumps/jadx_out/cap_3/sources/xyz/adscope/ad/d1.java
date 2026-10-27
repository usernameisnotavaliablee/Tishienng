package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class d1 extends xyz.adscope.ad.f1 {
    private final xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.ClickAreaParams d;
    private xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements xyz.adscope.ad.x4.b {
        final /* synthetic */ xyz.adscope.ad.d1 a;

        a(xyz.adscope.ad.d1 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // xyz.adscope.ad.x4.b
        public void a(android.view.View r3, android.view.MotionEvent r4) {
                r2 = this;
                xyz.adscope.ad.d1 r0 = r2.a
                android.view.View r0 = r0.c
                boolean r1 = r0 instanceof xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a
                if (r1 == 0) goto L17
                xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r0 = (xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a) r0
                xyz.adscope.ad.i4 r0 = xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a.c.c(r0)
                if (r0 == 0) goto L17
                xyz.adscope.ad.d1 r1 = r2.a
                android.view.View r1 = r1.c
                r0.a(r3, r1, r4)
            L17:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown {
        final /* synthetic */ xyz.adscope.ad.d1 a;

        b(xyz.adscope.ad.d1 r1, long r2, long r4) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2, r4)
                return
        }

        @Override // xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown
        public void onCancel() {
                r0 = this;
                return
        }

        @Override // xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown
        public void onFinish() {
                r2 = this;
                xyz.adscope.ad.d1 r0 = r2.a
                r1 = 0
                xyz.adscope.ad.d1.a(r0, r1)
                xyz.adscope.ad.d1 r0 = r2.a
                r0.d()
                return
        }

        @Override // xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown
        public void onTick(long r1) {
                r0 = this;
                return
        }
    }

    public d1(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.OptimizeModel r2) {
            r0 = this;
            r0.<init>(r1, r2)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.ClickAreaParams r1 = r2.a()
            r0.d = r1
            r0.f()
            return
    }

    private int a(int r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = xyz.adscope.common.v2.tool.str.StringUtil.modelSizeByPercent(r3)
            if (r0 == 0) goto Lf
            float r3 = xyz.adscope.common.v2.tool.str.StringUtil.parseSizePercent(r3)
            float r2 = (float) r2
            float r2 = r2 * r3
            int r2 = (int) r2
            return r2
        Lf:
            int r2 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r3)
            return r2
    }

    static /* synthetic */ xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown a(xyz.adscope.ad.d1 r0, xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown r1) {
            r0.e = r1
            return r1
    }

    private int[] a(java.lang.String r6, java.lang.String r7, android.graphics.Rect r8, int r9, int r10) {
            r5 = this;
            r0 = 2
            int[] r1 = new int[r0]
            java.lang.String r2 = "top"
            boolean r2 = r6.equalsIgnoreCase(r2)
            r3 = 0
            if (r2 == 0) goto L10
            int r2 = r8.top
            r1[r3] = r2
        L10:
            java.lang.String r2 = "bottom"
            boolean r2 = r6.equalsIgnoreCase(r2)
            if (r2 == 0) goto L1d
            int r2 = r8.bottom
            int r2 = r2 - r10
            r1[r3] = r2
        L1d:
            java.lang.String r2 = "center"
            boolean r6 = r6.equalsIgnoreCase(r2)
            if (r6 == 0) goto L30
            int r6 = r8.top
            int r4 = r8.bottom
            int r4 = r4 - r6
            int r4 = r4 / r0
            int r6 = r6 + r4
            int r10 = r10 / r0
            int r6 = r6 - r10
            r1[r3] = r6
        L30:
            java.lang.String r6 = "left"
            boolean r6 = r7.equalsIgnoreCase(r6)
            r10 = 1
            if (r6 == 0) goto L3d
            int r6 = r8.left
            r1[r10] = r6
        L3d:
            java.lang.String r6 = "right"
            boolean r6 = r7.equalsIgnoreCase(r6)
            if (r6 == 0) goto L4a
            int r6 = r8.right
            int r6 = r6 - r9
            r1[r10] = r6
        L4a:
            boolean r6 = r7.equalsIgnoreCase(r2)
            if (r6 == 0) goto L5b
            int r6 = r8.left
            int r7 = r8.right
            int r7 = r7 - r6
            int r7 = r7 / r0
            int r6 = r6 + r7
            int r9 = r9 / r0
            int r6 = r6 - r9
            r1[r10] = r6
        L5b:
            return r1
    }

    private android.widget.FrameLayout.LayoutParams e() {
            r11 = this;
            android.view.View r0 = r11.c
            if (r0 == 0) goto L76
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.ClickAreaParams r0 = r11.d
            if (r0 == 0) goto L76
            int r0 = r0.f()
            r1 = 0
            if (r0 != 0) goto L1c
            android.view.View r2 = r11.c
            int r2 = r2.getWidth()
            android.view.View r3 = r11.c
            int r3 = r3.getHeight()
            goto L1e
        L1c:
            r2 = 0
            r3 = 0
        L1e:
            r4 = 1
            if (r0 != r4) goto L35
            android.view.View r0 = r11.c
            android.content.Context r0 = r0.getContext()
            int r2 = xyz.adscope.common.v2.dev.info.ScreenUtil.getScreenWidth(r0)
            android.view.View r0 = r11.c
            android.content.Context r0 = r0.getContext()
            int r3 = xyz.adscope.common.v2.dev.info.ScreenUtil.getScreenHeight(r0)
        L35:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.ClickAreaParams r0 = r11.d
            java.lang.String r0 = r0.h()
            int r9 = r11.a(r2, r0)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.ClickAreaParams r0 = r11.d
            java.lang.String r0 = r0.b()
            int r10 = r11.a(r3, r0)
            if (r9 <= 0) goto L76
            if (r10 <= 0) goto L76
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            android.view.View r0 = r11.c
            r0.getGlobalVisibleRect(r8)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.ClickAreaParams r0 = r11.d
            java.lang.String r6 = r0.g()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.ClickAreaParams r0 = r11.d
            java.lang.String r7 = r0.c()
            r5 = r11
            int[] r0 = r5.a(r6, r7, r8, r9, r10)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r9, r10)
            r1 = r0[r1]
            r2.topMargin = r1
            r0 = r0[r4]
            r2.leftMargin = r0
            return r2
        L76:
            r0 = 0
            return r0
    }

    private void f() {
            r7 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.optimize.par.ClickAreaParams r0 = r7.d
            if (r0 == 0) goto L16
            int r0 = r0.a()
            if (r0 <= 0) goto L16
            xyz.adscope.ad.d1$b r1 = new xyz.adscope.ad.d1$b
            long r3 = (long) r0
            r5 = 1000(0x3e8, double:4.94E-321)
            r2 = r7
            r1.<init>(r2, r3, r5)
            r2.e = r1
            return
        L16:
            r2 = r7
            return
    }

    @Override // xyz.adscope.ad.f1
    public void a() {
            r2 = this;
            r2.c()
            android.view.View r0 = r2.c
            if (r0 == 0) goto L23
            android.view.View r0 = r0.getRootView()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L23
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L23
            android.widget.FrameLayout$LayoutParams r1 = r2.e()
            if (r1 == 0) goto L23
            r0.addView(r2, r1)
        L23:
            return
    }

    @Override // xyz.adscope.ad.f1
    public void a(xyz.adscope.ad.i3 r2) {
            r1 = this;
            super.a(r2)
            boolean r0 = r2 instanceof xyz.adscope.ad.x4
            if (r0 == 0) goto L11
            xyz.adscope.ad.x4 r2 = (xyz.adscope.ad.x4) r2
            xyz.adscope.ad.d1$a r0 = new xyz.adscope.ad.d1$a
            r0.<init>(r1)
            r2.a(r0)
        L11:
            return
    }

    @Override // xyz.adscope.ad.f1
    public void b() {
            r0 = this;
            super.b()
            r0.d()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            xyz.adscope.common.v2.thread.timer.cd.PauseAbleCountDown r0 = r1.e
            if (r0 == 0) goto La
            r0.start()
        La:
            return
    }
}
