package com.beizi.fusion.work.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a extends com.beizi.fusion.work.a implements com.beizi.fusion.c.c {
    protected android.widget.ImageView A;
    protected android.widget.ImageView B;
    protected android.widget.TextView C;
    protected android.widget.TextView D;
    protected android.widget.TextView E;
    protected android.widget.TextView F;
    protected android.widget.TextView G;
    protected long H;
    protected float I;
    protected float J;
    protected boolean K;
    protected boolean L;
    protected boolean M;
    protected android.content.Context N;
    protected android.app.Activity O;
    protected com.beizi.fusion.tool.al P;
    protected com.beizi.fusion.tool.aj Q;
    protected android.os.CountDownTimer R;
    protected com.beizi.fusion.model.AdSpacesBean.RenderViewBean S;
    protected com.beizi.fusion.model.AdSpacesBean.BuyerBean.RenderAds T;
    protected java.util.List<com.beizi.fusion.model.AdSpacesBean.RenderViewBean> U;
    protected java.util.List<android.util.Pair<java.lang.String, java.lang.Integer>> V;

    /* renamed from: n, reason: collision with root package name */
    protected android.view.View f204n;

    /* renamed from: o, reason: collision with root package name */
    protected android.view.View f205o;

    /* renamed from: p, reason: collision with root package name */
    protected android.view.View f206p;

    /* renamed from: q, reason: collision with root package name */
    protected android.view.ViewGroup f207q;

    /* renamed from: r, reason: collision with root package name */
    protected android.view.ViewGroup f208r;

    /* renamed from: s, reason: collision with root package name */
    protected android.view.ViewGroup f209s;

    /* renamed from: t, reason: collision with root package name */
    protected android.view.ViewGroup f210t;

    /* renamed from: u, reason: collision with root package name */
    protected android.view.ViewGroup f211u;

    /* renamed from: v, reason: collision with root package name */
    protected android.view.ViewGroup f212v;

    /* renamed from: w, reason: collision with root package name */
    protected android.view.ViewGroup f213w;

    /* renamed from: x, reason: collision with root package name */
    protected android.view.ViewGroup f214x;

    /* renamed from: y, reason: collision with root package name */
    protected android.widget.ImageView f215y;

    /* renamed from: z, reason: collision with root package name */
    protected android.widget.ImageView f216z;





    public a(android.content.Context r2, long r3, com.beizi.fusion.model.AdSpacesBean.BuyerBean r5, com.beizi.fusion.model.AdSpacesBean.ForwardBean r6, com.beizi.fusion.c.d r7, int r8) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.K = r0
            r1.L = r0
            r1.M = r0
            r1.N = r2
            r1.H = r3
            r1.e = r5
            r1.d = r7
            r1.k = r8
            r1.f = r6
            float r3 = com.beizi.fusion.tool.ap.k(r2)
            r1.I = r3
            float r2 = com.beizi.fusion.tool.ap.l(r2)
            r1.J = r2
            r1.az()
            r1.r()
            return
    }

    private void a(int r3, int r4) {
            r2 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r0 = r2.T
            java.lang.String r0 = r0.getBgCoordinate()
            android.view.ViewGroup r1 = r2.f207q
            r2.a(r1, r0, r3, r4)
            android.view.ViewGroup r3 = r2.f207q
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            int r3 = r3.width
            android.view.ViewGroup r4 = r2.f207q
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            int r4 = r4.height
            r2.b(r3, r4)
            r2.i(r3, r4)
            return
    }

    private void a(int r11, int r12, int r13) {
            r10 = this;
            android.os.CountDownTimer r0 = r10.R
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            com.beizi.fusion.work.e.a$3 r1 = new com.beizi.fusion.work.e.a$3
            long r2 = (long) r13
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r4 = 600(0x258, double:2.964E-321)
            long r2 = r2 + r4
            r5 = 1000(0x3e8, double:4.94E-321)
            r9 = r11
            r8 = r12
            r7 = r13
            r3 = r2
            r2 = r10
            r1.<init>(r2, r3, r5, r7, r8, r9)
            r2.R = r1
            r1.start()
            return
    }

    private void a(android.view.View r11, java.lang.String r12, int r13, int r14) {
            r10 = this;
            if (r11 != 0) goto L4
            goto L13a
        L4:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r1 = 8
            if (r0 == 0) goto L10
            r11.setVisibility(r1)
            return
        L10:
            java.lang.String r0 = "-1:-1:-1:-1:-1:-1:-1:-1:-1"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L1c
            r11.setVisibility(r1)
            return
        L1c:
            com.beizi.fusion.model.CoordinateBean r12 = com.beizi.fusion.model.CoordinateBean.getCoordinate(r12)
            if (r12 != 0) goto L26
            r11.setVisibility(r1)
            return
        L26:
            int[] r0 = r10.a(r12, r13, r14)
            int[] r13 = r10.a(r12, r13, r14, r0)
            boolean r14 = r11 instanceof android.widget.TextView
            r2 = 1
            r3 = 0
            if (r14 == 0) goto L3d
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r5 = r13[r3]
            r6 = -2
            r4.<init>(r5, r6)
            goto L46
        L3d:
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r5 = r13[r3]
            r6 = r13[r2]
            r4.<init>(r5, r6)
        L46:
            r5 = r0[r3]
            r6 = r0[r2]
            r7 = 2
            r8 = r0[r7]
            r9 = 3
            r0 = r0[r9]
            r4.setMargins(r5, r6, r8, r0)
            java.lang.String r0 = r12.getTop()
            java.lang.String r5 = "-1"
            boolean r0 = r0.equals(r5)
            r6 = -1
            if (r0 == 0) goto L71
            java.lang.String r0 = r12.getBottom()
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L71
            r0 = 12
            r4.addRule(r0, r6)
            r0 = 1
            goto L72
        L71:
            r0 = 0
        L72:
            java.lang.String r8 = r12.getLeft()
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L8b
            java.lang.String r8 = r12.getRight()
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L8b
            r8 = 11
            r4.addRule(r8, r6)
        L8b:
            r11.setLayoutParams(r4)
            java.lang.String r4 = r12.getFontOrCorner()
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto Lf7
            if (r14 == 0) goto La9
            java.lang.String r13 = r12.getFontOrCorner()
            float r13 = java.lang.Float.parseFloat(r13)
            r0 = r11
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setTextSize(r13)
            goto Lf7
        La9:
            android.graphics.drawable.Drawable r4 = r11.getBackground()
            boolean r4 = r4 instanceof android.graphics.drawable.GradientDrawable
            if (r4 == 0) goto Lf7
            android.graphics.drawable.Drawable r4 = r11.getBackground()
            android.graphics.drawable.GradientDrawable r4 = (android.graphics.drawable.GradientDrawable) r4
            android.view.ViewGroup r6 = r10.f211u
            if (r11 == r6) goto Lf1
            android.view.ViewGroup r6 = r10.f212v
            if (r11 != r6) goto Lc0
            goto Lf1
        Lc0:
            android.content.Context r13 = r10.N
            java.lang.String r6 = r12.getFontOrCorner()
            float r6 = java.lang.Float.parseFloat(r6)
            int r13 = com.beizi.fusion.tool.ap.a(r13, r6)
            if (r0 == 0) goto Lec
            float r13 = (float) r13
            float[] r0 = new float[r1]
            r0[r3] = r13
            r0[r2] = r13
            r0[r7] = r13
            r0[r9] = r13
            r13 = 4
            r1 = 0
            r0[r13] = r1
            r13 = 5
            r0[r13] = r1
            r13 = 6
            r0[r13] = r1
            r13 = 7
            r0[r13] = r1
            r4.setCornerRadii(r0)
            goto Lf7
        Lec:
            float r13 = (float) r13
            r4.setCornerRadius(r13)
            goto Lf7
        Lf1:
            r13 = r13[r2]
            float r13 = (float) r13
            r4.setCornerRadius(r13)
        Lf7:
            java.lang.String r13 = r12.getColor()
            boolean r13 = r13.equals(r5)
            if (r13 != 0) goto L13a
            if (r14 == 0) goto L111
            android.widget.TextView r11 = (android.widget.TextView) r11
            java.lang.String r12 = r12.getColor()
            int r12 = android.graphics.Color.parseColor(r12)
            r11.setTextColor(r12)
            return
        L111:
            android.view.ViewGroup r13 = r10.f214x
            if (r11 == r13) goto L13a
            android.graphics.drawable.Drawable r13 = r11.getBackground()
            boolean r13 = r13 instanceof android.graphics.drawable.GradientDrawable
            if (r13 == 0) goto L12f
            android.graphics.drawable.Drawable r11 = r11.getBackground()
            android.graphics.drawable.GradientDrawable r11 = (android.graphics.drawable.GradientDrawable) r11
            java.lang.String r12 = r12.getColor()
            int r12 = android.graphics.Color.parseColor(r12)
            r11.setColor(r12)
            return
        L12f:
            java.lang.String r12 = r12.getColor()
            int r12 = android.graphics.Color.parseColor(r12)
            r11.setBackgroundColor(r12)
        L13a:
            return
    }

    private int[] a(com.beizi.fusion.model.CoordinateBean r9, int r10, int r11) {
            r8 = this;
            java.lang.String r0 = r9.getLeft()
            java.lang.String r1 = "0%"
            boolean r2 = r0.equals(r1)
            java.lang.String r3 = "-1"
            java.lang.String r4 = "0"
            r5 = 0
            if (r2 != 0) goto L22
            boolean r2 = r0.equals(r4)
            if (r2 != 0) goto L22
            boolean r2 = r0.equals(r3)
            if (r2 != 0) goto L22
            int r0 = r8.b(r0, r10)
            goto L23
        L22:
            r0 = 0
        L23:
            java.lang.String r2 = r9.getTop()
            boolean r6 = r2.equals(r1)
            if (r6 != 0) goto L3e
            boolean r6 = r2.equals(r4)
            if (r6 != 0) goto L3e
            boolean r6 = r2.equals(r3)
            if (r6 != 0) goto L3e
            int r2 = r8.b(r2, r11)
            goto L3f
        L3e:
            r2 = 0
        L3f:
            java.lang.String r6 = r9.getRight()
            boolean r7 = r6.equals(r1)
            if (r7 != 0) goto L5a
            boolean r7 = r6.equals(r4)
            if (r7 != 0) goto L5a
            boolean r7 = r6.equals(r3)
            if (r7 != 0) goto L5a
            int r10 = r8.b(r6, r10)
            goto L5b
        L5a:
            r10 = 0
        L5b:
            java.lang.String r9 = r9.getBottom()
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L75
            boolean r1 = r9.equals(r4)
            if (r1 != 0) goto L75
            boolean r1 = r9.equals(r3)
            if (r1 != 0) goto L75
            int r5 = r8.b(r9, r11)
        L75:
            int[] r9 = new int[]{r0, r2, r10, r5}
            return r9
    }

    private int[] a(com.beizi.fusion.model.CoordinateBean r4, int r5, int r6, int[] r7) {
            r3 = this;
            java.lang.String r0 = r4.getWidth()
            java.lang.String r1 = "-1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            r0 = 0
            r0 = r7[r0]
            int r5 = r5 - r0
            r0 = 2
            r0 = r7[r0]
            int r5 = r5 - r0
            goto L1d
        L15:
            java.lang.String r0 = r4.getWidth()
            int r5 = r3.b(r0, r5)
        L1d:
            java.lang.String r0 = r4.getScale()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3f
            java.lang.String r0 = r4.getScale()
            java.lang.String r2 = "0"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3f
            float r6 = (float) r5
            java.lang.String r4 = r4.getScale()
            float r4 = java.lang.Float.parseFloat(r4)
            float r6 = r6 / r4
            int r4 = (int) r6
            goto L5b
        L3f:
            java.lang.String r0 = r4.getHeight()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
            r4 = 1
            r4 = r7[r4]
            int r6 = r6 - r4
            r4 = 3
            r4 = r7[r4]
            int r4 = r6 - r4
            goto L5b
        L53:
            java.lang.String r4 = r4.getHeight()
            int r4 = r3.b(r4, r6)
        L5b:
            int[] r4 = new int[]{r5, r4}
            return r4
    }

    private void aR() {
            r3 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r0 = r3.T
            java.util.List r0 = r0.getClickView()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 == 0) goto L7a
            int r2 = r0.size()
            if (r2 <= 0) goto L7a
            java.lang.String r2 = "bg"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L2b
            android.view.ViewGroup r0 = r3.f207q
            r1.add(r0)
            android.view.ViewGroup r0 = r3.f209s
            r1.add(r0)
            android.view.ViewGroup r0 = r3.f213w
            r1.add(r0)
            goto L7a
        L2b:
            java.lang.String r2 = "ad"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L39
            android.view.ViewGroup r0 = r3.f209s
            r1.add(r0)
            goto L7a
        L39:
            java.lang.String r2 = "image"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L46
            android.view.ViewGroup r2 = r3.f210t
            r1.add(r2)
        L46:
            java.lang.String r2 = "title"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L53
            android.widget.TextView r2 = r3.D
            r1.add(r2)
        L53:
            java.lang.String r2 = "desc"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L60
            android.widget.TextView r2 = r3.E
            r1.add(r2)
        L60:
            java.lang.String r2 = "icon"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L6d
            android.widget.ImageView r2 = r3.A
            r1.add(r2)
        L6d:
            java.lang.String r2 = "target"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L7a
            android.view.ViewGroup r0 = r3.f212v
            r1.add(r0)
        L7a:
            r3.a(r1)
            return
    }

    private void aS() {
            r2 = this;
            android.view.View r0 = r2.f204n
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            android.view.View r1 = r2.f206p
            r0.removeView(r1)
            return
    }

    private int b(java.lang.String r3, int r4) {
            r2 = this;
            java.lang.String r0 = "%"
            boolean r1 = r3.contains(r0)
            if (r1 == 0) goto L1b
            r1 = 0
            int r0 = r3.indexOf(r0)
            java.lang.String r3 = r3.substring(r1, r0)
            float r3 = java.lang.Float.parseFloat(r3)
            int r3 = (int) r3
            int r4 = r4 * r3
            int r4 = r4 / 100
            return r4
        L1b:
            android.content.Context r4 = r2.N
            float r3 = java.lang.Float.parseFloat(r3)
            int r3 = com.beizi.fusion.tool.ap.a(r4, r3)
            return r3
    }

    private void b() {
            r3 = this;
            com.beizi.fusion.c.d r0 = r3.d
            if (r0 != 0) goto L5
            goto L3a
        L5:
            java.util.Map r0 = r0.n()
            r3.f()
            r0.toString()
            r3.Z()
            com.beizi.fusion.c.e r0 = r3.g
            com.beizi.fusion.c.e r1 = com.beizi.fusion.c.e.a
            if (r0 != r1) goto L33
            r3.aP()
            android.view.View r0 = r3.f206p
            if (r0 == 0) goto L2b
            com.beizi.fusion.c.d r0 = r3.d
            java.lang.String r1 = r3.f()
            android.view.View r2 = r3.f206p
            r0.a(r1, r2)
            return
        L2b:
            com.beizi.fusion.c.d r0 = r3.d
            r1 = 10140(0x279c, float:1.4209E-41)
            r0.a(r1)
            return
        L33:
            com.beizi.fusion.c.e r1 = com.beizi.fusion.c.e.b
            if (r0 != r1) goto L3a
            r3.f()
        L3a:
            return
    }

    private void b(int r3, int r4) {
            r2 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r0 = r2.T
            java.lang.String r0 = r0.getAdCoordinate()
            android.view.ViewGroup r1 = r2.f209s
            r2.a(r1, r0, r3, r4)
            android.view.ViewGroup r1 = r2.f214x
            r2.a(r1, r0, r3, r4)
            android.view.ViewGroup r3 = r2.f209s
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            int r3 = r3.width
            android.view.ViewGroup r4 = r2.f209s
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            int r4 = r4.height
            r2.c(r3, r4)
            r2.d(r3, r4)
            r2.e(r3, r4)
            r2.f(r3, r4)
            r2.g(r3, r4)
            r2.h(r3, r4)
            r2.aI()
            r2.aR()
            return
    }

    private void b(android.app.Activity r2) {
            r1 = this;
            if (r2 == 0) goto L27
            android.view.View r0 = r1.f206p
            if (r0 == 0) goto L27
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r1.f204n = r2
            boolean r2 = r2 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L27
            android.view.View r2 = r1.f206p
            com.beizi.fusion.tool.ap.a(r2)
            android.view.View r2 = r1.f204n
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            android.view.View r0 = r1.f206p
            r2.addView(r0)
            android.view.ViewGroup r2 = r1.f208r
            r1.b(r2)
        L27:
            return
    }

    private void b(android.view.View r11) {
            r10 = this;
            if (r11 == 0) goto L21
            r0 = 8
            r11.setVisibility(r0)
            android.view.animation.TranslateAnimation r1 = new android.view.animation.TranslateAnimation
            r8 = 1
            r9 = 0
            r2 = 1
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1
            r7 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = 500(0x1f4, double:2.47E-321)
            r1.setDuration(r2)
            r0 = 0
            r11.setVisibility(r0)
            r11.startAnimation(r1)
        L21:
            return
    }

    private void b(android.view.View r20, java.lang.String r21, int r22, int r23) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            r3 = r23
            if (r1 != 0) goto Lc
            goto L2de
        Lc:
            boolean r4 = android.text.TextUtils.isEmpty(r21)
            r5 = 8
            if (r4 == 0) goto L18
            r1.setVisibility(r5)
            return
        L18:
            java.lang.String r4 = "-1:-1:-1:-1:-1:-1:-1:-1:-1"
            r6 = r21
            boolean r7 = r6.equals(r4)
            if (r7 == 0) goto L26
            r1.setVisibility(r5)
            return
        L26:
            com.beizi.fusion.model.CoordinateBean r6 = com.beizi.fusion.model.CoordinateBean.getCoordinate(r6)
            if (r6 != 0) goto L30
            r1.setVisibility(r5)
            return
        L30:
            android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams
            r7 = -2
            r5.<init>(r7, r7)
            java.lang.String r7 = r6.getScale()
            java.lang.String r8 = "-1"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L4b
            android.widget.TextView r7 = r0.G
            java.lang.String r9 = r6.getScale()
            r7.setText(r9)
        L4b:
            java.lang.String r7 = r6.getFontOrCorner()
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L62
            java.lang.String r7 = r6.getFontOrCorner()
            float r7 = java.lang.Float.parseFloat(r7)
            android.widget.TextView r9 = r0.G
            r9.setTextSize(r7)
        L62:
            java.lang.String r7 = r6.getColor()
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L79
            android.widget.TextView r7 = r0.G
            java.lang.String r9 = r6.getColor()
            int r9 = android.graphics.Color.parseColor(r9)
            r7.setTextColor(r9)
        L79:
            java.lang.String r7 = r6.getWidth()
            boolean r7 = r7.equals(r8)
            r9 = 1
            if (r7 != 0) goto Lc3
            android.content.Context r7 = r0.N
            java.lang.String r11 = r6.getWidth()
            float r11 = java.lang.Float.parseFloat(r11)
            int r7 = com.beizi.fusion.tool.ap.a(r7, r11)
            double r11 = (double) r7
            r13 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r11 = r11 / r13
            int r11 = (int) r11
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r7, r11)
            r12.gravity = r9
            android.widget.ImageView r13 = r0.B
            r13.setLayoutParams(r12)
            android.widget.ImageView r12 = r0.B
            android.content.Context r13 = r0.N
            android.content.res.Resources r13 = r13.getResources()
            int r14 = com.beizi.fusion.R.drawable.slide_down_close_ad
            android.graphics.drawable.Drawable r13 = r13.getDrawable(r14)
            r12.setImageDrawable(r13)
            android.widget.ImageView r12 = r0.B
            android.graphics.drawable.Drawable r12 = r12.getDrawable()
            android.graphics.drawable.AnimationDrawable r12 = (android.graphics.drawable.AnimationDrawable) r12
            r12.start()
            goto Lc5
        Lc3:
            r7 = 0
            r11 = 0
        Lc5:
            android.view.ViewGroup r12 = r0.f209s
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            int r12 = r12.width
            android.view.ViewGroup r13 = r0.f209s
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            int r13 = r13.height
            r14 = 1073741823(0x3fffffff, float:1.9999999)
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            r21 = 1
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r15)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r15)
            android.widget.TextView r15 = r0.G
            r15.measure(r9, r14)
            android.widget.TextView r9 = r0.G
            int r9 = r9.getMeasuredWidth()
            android.widget.TextView r14 = r0.G
            int r14 = r14.getMeasuredHeight()
            int r7 = java.lang.Math.max(r9, r7)
            int r14 = r14 + r11
            android.content.Context r9 = r0.N
            java.lang.String r11 = r6.getHeight()
            float r11 = java.lang.Float.parseFloat(r11)
            int r9 = com.beizi.fusion.tool.ap.a(r9, r11)
            int r9 = r9 + r13
            java.lang.String r11 = r6.getHeight()
            boolean r11 = r11.equals(r8)
            r13 = 12
            java.lang.String r15 = "%"
            r10 = -1
            r17 = 2
            if (r11 != 0) goto L191
            r5.addRule(r13, r10)
            java.lang.String r2 = r6.getLeft()
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L147
            java.lang.String r2 = r6.getLeft()
            boolean r2 = r2.contains(r15)
            if (r2 == 0) goto L13d
            java.lang.String r2 = r6.getLeft()
            int r2 = r0.b(r2, r12)
            int r3 = r7 / 2
            int r2 = r2 - r3
            goto L145
        L13d:
            java.lang.String r2 = r6.getLeft()
            int r2 = r0.b(r2, r12)
        L145:
            if (r2 > 0) goto L148
        L147:
            r2 = 0
        L148:
            java.lang.String r3 = r6.getRight()
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L172
            java.lang.String r3 = r6.getRight()
            boolean r3 = r3.contains(r15)
            if (r3 == 0) goto L168
            java.lang.String r3 = r6.getRight()
            int r3 = r0.b(r3, r12)
            int r7 = r7 / 2
            int r3 = r3 - r7
            goto L170
        L168:
            java.lang.String r3 = r6.getRight()
            int r3 = r0.b(r3, r12)
        L170:
            if (r3 > 0) goto L173
        L172:
            r3 = 0
        L173:
            if (r2 > 0) goto L17e
            if (r3 > 0) goto L17e
            r6 = 14
            r5.addRule(r6, r10)
        L17c:
            r11 = 0
            goto L18c
        L17e:
            if (r2 <= 0) goto L186
            r6 = 9
            r5.addRule(r6, r10)
            goto L17c
        L186:
            r6 = 11
            r5.addRule(r6, r10)
            goto L17c
        L18c:
            r5.setMargins(r2, r11, r3, r9)
            goto L2b6
        L191:
            r11 = 0
            r9 = 4
            int[] r9 = new int[r9]
            r9[r11] = r11
            r9[r21] = r11
            r9[r17] = r11
            r12 = 3
            r9[r12] = r11
            java.lang.String r11 = r6.getLeft()
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L1d5
            java.lang.String r11 = r6.getLeft()
            boolean r11 = r11.contains(r15)
            if (r11 == 0) goto L1c3
            java.lang.String r11 = r6.getLeft()
            int r11 = r0.b(r11, r2)
            int r18 = r7 / 2
            int r11 = r11 - r18
            r16 = 0
            r9[r16] = r11
            goto L1cf
        L1c3:
            r16 = 0
            java.lang.String r11 = r6.getLeft()
            int r11 = r0.b(r11, r2)
            r9[r16] = r11
        L1cf:
            r11 = r9[r16]
            if (r11 > 0) goto L1d5
            r9[r16] = r16
        L1d5:
            java.lang.String r11 = r6.getTop()
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L20a
            java.lang.String r11 = r6.getTop()
            boolean r11 = r11.contains(r15)
            if (r11 == 0) goto L1f8
            java.lang.String r11 = r6.getTop()
            int r11 = r0.b(r11, r3)
            int r18 = r14 / 2
            int r11 = r11 - r18
            r9[r21] = r11
            goto L202
        L1f8:
            java.lang.String r11 = r6.getTop()
            int r11 = r0.b(r11, r3)
            r9[r21] = r11
        L202:
            r11 = r9[r21]
            if (r11 > 0) goto L20a
            r16 = 0
            r9[r21] = r16
        L20a:
            java.lang.String r11 = r6.getRight()
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L23e
            java.lang.String r11 = r6.getRight()
            boolean r11 = r11.contains(r15)
            if (r11 == 0) goto L22c
            java.lang.String r11 = r6.getRight()
            int r2 = r0.b(r11, r2)
            int r7 = r7 / 2
            int r2 = r2 - r7
            r9[r17] = r2
            goto L236
        L22c:
            java.lang.String r7 = r6.getRight()
            int r2 = r0.b(r7, r2)
            r9[r17] = r2
        L236:
            r2 = r9[r17]
            if (r2 > 0) goto L23e
            r16 = 0
            r9[r17] = r16
        L23e:
            java.lang.String r2 = r6.getBottom()
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L273
            java.lang.String r2 = r6.getBottom()
            boolean r2 = r2.contains(r15)
            if (r2 == 0) goto L260
            java.lang.String r2 = r6.getBottom()
            int r2 = r0.b(r2, r3)
            int r14 = r14 / 2
            int r2 = r2 - r14
            r9[r12] = r2
            goto L26a
        L260:
            java.lang.String r2 = r6.getBottom()
            int r2 = r0.b(r2, r3)
            r9[r12] = r2
        L26a:
            r2 = r9[r12]
            if (r2 > 0) goto L273
            r16 = 0
            r9[r12] = r16
            goto L275
        L273:
            r16 = 0
        L275:
            r2 = r9[r16]
            if (r2 > 0) goto L283
            r3 = r9[r17]
            if (r3 > 0) goto L283
            r6 = 14
            r5.addRule(r6, r10)
            goto L290
        L283:
            if (r2 <= 0) goto L28b
            r6 = 9
            r5.addRule(r6, r10)
            goto L290
        L28b:
            r6 = 11
            r5.addRule(r6, r10)
        L290:
            r2 = r9[r21]
            if (r2 > 0) goto L29f
            r3 = r9[r12]
            if (r3 > 0) goto L29f
            r2 = 15
            r5.addRule(r2, r10)
        L29d:
            r11 = 0
            goto L2ab
        L29f:
            if (r2 <= 0) goto L2a7
            r2 = 10
            r5.addRule(r2, r10)
            goto L29d
        L2a7:
            r5.addRule(r13, r10)
            goto L29d
        L2ab:
            r2 = r9[r11]
            r3 = r9[r21]
            r6 = r9[r17]
            r7 = r9[r12]
            r5.setMargins(r2, r3, r6, r7)
        L2b6:
            r1.setLayoutParams(r5)
            r1.setVisibility(r11)
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r1 = r0.T
            java.lang.String r1 = r1.getScrollCoordinate()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2de
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r1 = r0.T
            java.lang.String r1 = r1.getScrollCoordinate()
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L2de
            android.view.ViewGroup r1 = r0.f207q
            r0.a(r1)
            android.view.ViewGroup r1 = r0.f214x
            r0.a(r1)
        L2de:
            return
    }

    private void c(int r3, int r4) {
            r2 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r0 = r2.T
            java.lang.String r0 = r0.getImageCoordinate()
            android.view.ViewGroup r1 = r2.f210t
            r2.a(r1, r0, r3, r4)
            r2.aJ()
            return
    }

    private void c(android.app.Activity r2) {
            r1 = this;
            if (r2 == 0) goto L19
            android.view.View r0 = r1.f204n
            if (r0 != 0) goto L10
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r1.f204n = r2
        L10:
            android.view.View r2 = r1.f204n
            boolean r2 = r2 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L19
            r1.aS()
        L19:
            r1.l()
            return
    }

    private void d(int r3, int r4) {
            r2 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r0 = r2.T
            java.lang.String r0 = r0.getTitleCoordinate()
            android.widget.TextView r1 = r2.D
            r2.a(r1, r0, r3, r4)
            java.lang.String r3 = r2.aK()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L1e
            android.widget.TextView r3 = r2.D
            java.lang.String r4 = r2.aK()
            r3.setText(r4)
        L1e:
            return
    }

    private void e(int r3, int r4) {
            r2 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r0 = r2.T
            java.lang.String r0 = r0.getDescCoordinate()
            android.widget.TextView r1 = r2.E
            r2.a(r1, r0, r3, r4)
            java.lang.String r3 = r2.aL()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L1e
            android.widget.TextView r3 = r2.E
            java.lang.String r4 = r2.aL()
            r3.setText(r4)
        L1e:
            return
    }

    private void f(int r3, int r4) {
            r2 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r0 = r2.T
            java.lang.String r0 = r0.getIconCoordinate()
            android.widget.ImageView r1 = r2.A
            r2.a(r1, r0, r3, r4)
            android.widget.ImageView r3 = r2.A
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L2f
            java.lang.String r3 = r2.aM()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L2f
            android.content.Context r3 = r2.N
            com.beizi.fusion.tool.f r3 = com.beizi.fusion.tool.f.a(r3)
            java.lang.String r4 = r2.aM()
            com.beizi.fusion.work.e.a$2 r0 = new com.beizi.fusion.work.e.a$2
            r0.<init>(r2)
            r3.a(r4, r0)
        L2f:
            return
    }

    private void g(int r3, int r4) {
            r2 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r0 = r2.T
            java.lang.String r0 = r0.getActionCoordinate()
            android.view.ViewGroup r1 = r2.f212v
            r2.a(r1, r0, r3, r4)
            java.lang.String r3 = r2.aN()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L1e
            android.widget.TextView r3 = r2.F
            java.lang.String r4 = r2.aN()
            r3.setText(r4)
        L1e:
            return
    }

    private void h(int r3, int r4) {
            r2 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r0 = r2.T
            java.lang.String r0 = r0.getCloseCoordinate()
            android.view.ViewGroup r1 = r2.f211u
            r2.a(r1, r0, r3, r4)
            return
    }

    private void i(int r3, int r4) {
            r2 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r0 = r2.T
            java.lang.String r0 = r0.getScrollCoordinate()
            android.view.ViewGroup r1 = r2.f213w
            r2.b(r1, r0, r3, r4)
            return
    }

    @Override // com.beizi.fusion.work.a
    public void a(android.app.Activity r2) {
            r1 = this;
            boolean r0 = r1.M     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L5
            goto Ld
        L5:
            r0 = 1
            r1.M = r0     // Catch: java.lang.Throwable -> Ld
            r1.O = r2     // Catch: java.lang.Throwable -> Ld
            r1.b(r2)     // Catch: java.lang.Throwable -> Ld
        Ld:
            return
    }

    protected void a(android.view.View r4) {
            r3 = this;
            r0 = 30
            r1 = 0
            java.lang.String r2 = ""
            r3.a(r4, r2, r0, r1)
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    protected void a(android.view.View r8, java.lang.String r9, int r10, com.beizi.fusion.tool.aj.a r11) {
            r7 = this;
            android.content.Context r0 = r7.N
            float r10 = (float) r10
            int r4 = com.beizi.fusion.tool.ap.a(r0, r10)
            android.view.ViewGroup r10 = r7.f207q
            if (r8 != r10) goto Le
            r10 = 1
            r3 = 1
            goto L10
        Le:
            r10 = 0
            r3 = 0
        L10:
            com.beizi.fusion.work.e.a$4 r1 = new com.beizi.fusion.work.e.a$4
            r2 = r7
            r5 = r9
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r8.setOnTouchListener(r1)
            return
    }

    public void a(java.util.List<android.view.View> r1) {
            r0 = this;
            return
    }

    public void aA() {
            r0 = this;
            return
    }

    public void aB() {
            r0 = this;
            return
    }

    protected void aC() {
            r3 = this;
            com.beizi.fusion.c.d r0 = r3.d
            r1 = 2
            if (r0 == 0) goto L14
            int r0 = r0.o()
            if (r0 == r1) goto L14
            com.beizi.fusion.c.d r0 = r3.d
            java.lang.String r2 = r3.f()
            r0.d(r2)
        L14:
            boolean r0 = r3.L
            if (r0 != 0) goto L28
            r0 = 1
            r3.L = r0
            r3.D()
            r3.ad()
            int r0 = r3.k
            if (r0 == r1) goto L28
            r3.aQ()
        L28:
            return
    }

    protected void aD() {
            r2 = this;
            com.beizi.fusion.e.a r0 = com.beizi.fusion.e.a.c
            r2.j = r0
            com.beizi.fusion.c.d r0 = r2.d
            if (r0 == 0) goto L18
            int r0 = r0.o()
            r1 = 2
            if (r0 == r1) goto L18
            com.beizi.fusion.c.d r0 = r2.d
            java.lang.String r1 = r2.f()
            r0.b(r1)
        L18:
            boolean r0 = r2.K
            if (r0 != 0) goto L2b
            r0 = 1
            r2.K = r0
            r2.aO()
            r2.B()
            r2.C()
            r2.ac()
        L2b:
            return
    }

    protected void aE() {
            r1 = this;
            boolean r0 = r1.Y()     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto La
            r1.b()     // Catch: java.lang.Throwable -> Ld
            return
        La:
            r1.P()     // Catch: java.lang.Throwable -> Ld
        Ld:
            return
    }

    protected void aF() {
            r2 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r0 = r2.T
            if (r0 == 0) goto L17
            float r0 = r2.I
            int r0 = (int) r0
            float r1 = r2.J
            int r1 = (int) r1
            r2.a(r0, r1)
            android.widget.ImageView r0 = r2.f216z
            com.beizi.fusion.work.e.a$1 r1 = new com.beizi.fusion.work.e.a$1
            r1.<init>(r2)
            r0.setOnClickListener(r1)
        L17:
            android.view.View r0 = r2.f205o
            r2.f206p = r0
            r2.aH()
            return
    }

    public void aG() {
            r0 = this;
            return
    }

    public void aH() {
            r0 = this;
            return
    }

    public void aI() {
            r0 = this;
            return
    }

    public void aJ() {
            r0 = this;
            return
    }

    public java.lang.String aK() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    public java.lang.String aL() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    public java.lang.String aM() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    public java.lang.String aN() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    protected void aO() {
            r4 = this;
            android.widget.TextView r0 = r4.C
            if (r0 == 0) goto L4c
            android.widget.ImageView r0 = r4.f216z
            if (r0 == 0) goto L4c
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r0 = r4.T
            if (r0 == 0) goto L4c
            int r0 = r0.getAutoClose()
            r1 = 8
            r2 = 0
            if (r0 != 0) goto L28
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r0 = r4.T
            int r0 = r0.getMinTime()
            if (r0 != 0) goto L28
            android.widget.TextView r0 = r4.C
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r4.f216z
            r0.setVisibility(r2)
            goto L47
        L28:
            android.widget.ImageView r0 = r4.f216z
            r0.setVisibility(r1)
            android.widget.TextView r0 = r4.C
            r0.setVisibility(r2)
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r0 = r4.T
            int r0 = r0.getAutoClose()
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r1 = r4.T
            int r1 = r1.getMinTime()
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r3 = r4.T
            int r3 = r3.getMaxTime()
            r4.a(r0, r1, r3)
        L47:
            android.view.ViewGroup r0 = r4.f211u
            r0.setVisibility(r2)
        L4c:
            return
    }

    public void aP() {
            r0 = this;
            return
    }

    protected void aQ() {
            r1 = this;
            com.beizi.fusion.tool.al r0 = r1.P
            if (r0 == 0) goto L7
            r0.c()
        L7:
            com.beizi.fusion.tool.aj r0 = r1.Q
            if (r0 == 0) goto Le
            r0.b()
        Le:
            r1.aa()
            r1.F()
            android.app.Activity r0 = r1.O
            r1.c(r0)
            return
    }

    public int ay() {
            r1 = this;
            r0 = -1
            return r0
    }

    public void az() {
            r3 = this;
            int r0 = r3.ay()
            r1 = -1
            if (r0 != r1) goto L8
            return
        L8:
            android.content.Context r0 = r3.N
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.ay()
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            r3.f205o = r0
            int r1 = com.beizi.fusion.R.id.rl_bg_container
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.f207q = r0
            android.view.View r0 = r3.f205o
            int r1 = com.beizi.fusion.R.id.rl_anim_container
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.f208r = r0
            android.view.View r0 = r3.f205o
            int r1 = com.beizi.fusion.R.id.rl_container
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.f209s = r0
            android.view.View r0 = r3.f205o
            int r1 = com.beizi.fusion.R.id.fl_img_container
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.f210t = r0
            android.view.View r0 = r3.f205o
            int r1 = com.beizi.fusion.R.id.iv_imageview
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.f215y = r0
            android.view.View r0 = r3.f205o
            int r1 = com.beizi.fusion.R.id.rl_close
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.f211u = r0
            android.view.View r0 = r3.f205o
            int r1 = com.beizi.fusion.R.id.tv_close
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.C = r0
            android.view.View r0 = r3.f205o
            int r1 = com.beizi.fusion.R.id.iv_close
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.f216z = r0
            android.view.View r0 = r3.f205o
            int r1 = com.beizi.fusion.R.id.tv_title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.D = r0
            android.view.View r0 = r3.f205o
            int r1 = com.beizi.fusion.R.id.tv_desc
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.E = r0
            android.view.View r0 = r3.f205o
            int r1 = com.beizi.fusion.R.id.iv_icon
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.A = r0
            android.view.View r0 = r3.f205o
            int r1 = com.beizi.fusion.R.id.rl_action
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.f212v = r0
            android.view.View r0 = r3.f205o
            int r1 = com.beizi.fusion.R.id.tv_action
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.F = r0
            android.view.View r0 = r3.f205o
            int r1 = com.beizi.fusion.R.id.rl_slide_down_container
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.f213w = r0
            android.view.View r0 = r3.f205o
            int r1 = com.beizi.fusion.R.id.tv_slide_down_title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.G = r0
            android.view.View r0 = r3.f205o
            int r1 = com.beizi.fusion.R.id.iv_slide_down_arrow
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.B = r0
            android.view.View r0 = r3.f205o
            int r1 = com.beizi.fusion.R.id.fl_event_container
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.f214x = r0
            return
    }

    public void b(boolean r1) {
            r0 = this;
            return
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
            r2 = this;
            com.beizi.fusion.c.d r0 = r2.d
            if (r0 != 0) goto L5
            goto L62
        L5:
            int r0 = r2.ay()
            r1 = -1
            if (r0 != r1) goto Ld
            goto L62
        Ld:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r2.e
            java.lang.String r0 = r0.getAppId()
            r2.h = r0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r2.e
            java.lang.String r0 = r0.getSpaceId()
            r2.i = r0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r2.e
            java.lang.String r0 = r0.getBuyerSpaceUuId()
            r2.c = r0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r2.e
            java.util.List r0 = r0.getRenderView()
            r2.U = r0
            if (r0 == 0) goto L4a
            int r0 = r0.size()
            if (r0 <= 0) goto L4a
            java.util.List<com.beizi.fusion.model.AdSpacesBean$RenderViewBean> r0 = r2.U
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.beizi.fusion.model.AdSpacesBean$RenderViewBean r0 = (com.beizi.fusion.model.AdSpacesBean.RenderViewBean) r0
            r2.S = r0
            java.util.List r0 = r0.getDpLinkUrlList()
            java.util.List r0 = com.beizi.fusion.tool.o.a(r0)
            r2.V = r0
        L4a:
            com.beizi.fusion.events.b r0 = r2.a
            if (r0 == 0) goto L62
            com.beizi.fusion.events.a r0 = r0.a()
            java.lang.String r1 = r2.c
            com.beizi.fusion.events.EventBean r0 = r0.a(r1)
            r2.b = r0
            if (r0 == 0) goto L62
            r2.s()
            r2.aA()
        L62:
            return
    }

    @Override // com.beizi.fusion.work.a
    public void e() {
            r0 = this;
            return
    }

    @Override // com.beizi.fusion.work.a
    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.e.a h() {
            r1 = this;
            com.beizi.fusion.e.a r0 = r1.j
            return r0
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.model.AdSpacesBean.BuyerBean j() {
            r1 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r1.e
            return r0
    }

    @Override // com.beizi.fusion.work.a
    protected void k() {
            r1 = this;
            r1.v()
            r1.ab()
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r1.e
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r0 = r0.getRenderAds()
            r1.T = r0
            r1.aB()
            return
    }

    @Override // com.beizi.fusion.work.a
    public void l() {
            r0 = this;
            return
    }

    @Override // com.beizi.fusion.work.a
    public android.view.View o() {
            r1 = this;
            android.view.View r0 = r1.f206p
            return r0
    }
}
