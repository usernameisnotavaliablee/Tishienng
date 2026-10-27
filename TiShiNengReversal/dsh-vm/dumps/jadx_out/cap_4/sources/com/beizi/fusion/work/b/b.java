package com.beizi.fusion.work.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b extends com.beizi.fusion.work.b.a {
    private android.widget.RelativeLayout V;
    private android.widget.TextView W;
    private android.widget.TextView X;
    private android.widget.TextView Y;
    private android.widget.ImageView Z;
    private android.widget.ImageView aa;
    private com.beizi.fusion.widget.CustomRoundImageView ab;





    public b(android.content.Context r1, java.lang.String r2, long r3, long r5, com.beizi.fusion.model.AdSpacesBean.BuyerBean r7, com.beizi.fusion.model.AdSpacesBean.ForwardBean r8, com.beizi.fusion.c.d r9, float r10, float r11) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            return
    }

    static /* synthetic */ com.beizi.fusion.events.EventBean a(com.beizi.fusion.work.b.b r0) {
            com.beizi.fusion.events.EventBean r0 = r0.b
            return r0
    }

    static /* synthetic */ void a(com.beizi.fusion.work.b.b r0, java.lang.String r1, int r2) {
            r0.a(r1, r2)
            return
    }

    private void aE() {
            r4 = this;
            com.beizi.fusion.model.AdSpacesBean$ComplainBean r0 = r4.N     // Catch: java.lang.Exception -> L23
            if (r0 != 0) goto L5
            goto L23
        L5:
            int r0 = r0.getOpen()     // Catch: java.lang.Exception -> L23
            r1 = 1
            if (r0 == r1) goto Ld
            goto L23
        Ld:
            com.beizi.fusion.tool.l r0 = new com.beizi.fusion.tool.l     // Catch: java.lang.Exception -> L23
            r0.<init>()     // Catch: java.lang.Exception -> L23
            android.content.Context r1 = r4.f153n     // Catch: java.lang.Exception -> L23
            android.view.ViewGroup r2 = r4.f159t     // Catch: java.lang.Exception -> L23
            java.lang.String r3 = "3"
            r0.a(r1, r2, r3)     // Catch: java.lang.Exception -> L23
            com.beizi.fusion.work.b.b$1 r1 = new com.beizi.fusion.work.b.b$1     // Catch: java.lang.Exception -> L23
            r1.<init>(r4)     // Catch: java.lang.Exception -> L23
            r0.a(r1)     // Catch: java.lang.Exception -> L23
        L23:
            return
    }

    private void aF() {
            r6 = this;
            java.lang.String r0 = "#000000"
            android.widget.LinearLayout r1 = new android.widget.LinearLayout     // Catch: java.lang.Exception -> L78
            android.content.Context r2 = r6.f153n     // Catch: java.lang.Exception -> L78
            r1.<init>(r2)     // Catch: java.lang.Exception -> L78
            r2 = 0
            r1.setOrientation(r2)     // Catch: java.lang.Exception -> L78
            r3 = 17
            r1.setGravity(r3)     // Catch: java.lang.Exception -> L78
            java.lang.String r4 = "#FFFFFF"
            int r4 = android.graphics.Color.parseColor(r4)     // Catch: java.lang.Exception -> L78
            r1.setBackgroundColor(r4)     // Catch: java.lang.Exception -> L78
            android.widget.ImageView r4 = new android.widget.ImageView     // Catch: java.lang.Exception -> L78
            android.content.Context r5 = r6.f153n     // Catch: java.lang.Exception -> L78
            r4.<init>(r5)     // Catch: java.lang.Exception -> L78
            int r5 = com.beizi.fusion.R.drawable.beizi_icon_checkbox     // Catch: java.lang.Exception -> L78
            r4.setImageResource(r5)     // Catch: java.lang.Exception -> L78
            int r5 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Exception -> L78
            r4.setColorFilter(r5)     // Catch: java.lang.Exception -> L78
            r1.addView(r4)     // Catch: java.lang.Exception -> L78
            android.widget.TextView r4 = new android.widget.TextView     // Catch: java.lang.Exception -> L78
            android.content.Context r5 = r6.f153n     // Catch: java.lang.Exception -> L78
            r4.<init>(r5)     // Catch: java.lang.Exception -> L78
            java.lang.String r5 = "投诉成功，我们将重视您的反馈。"
            r4.setText(r5)     // Catch: java.lang.Exception -> L78
            int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Exception -> L78
            r4.setTextColor(r0)     // Catch: java.lang.Exception -> L78
            r0 = 2
            r5 = 1095761920(0x41500000, float:13.0)
            r4.setTextSize(r0, r5)     // Catch: java.lang.Exception -> L78
            r4.setGravity(r3)     // Catch: java.lang.Exception -> L78
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Exception -> L78
            r5 = -2
            r0.<init>(r5, r5)     // Catch: java.lang.Exception -> L78
            r5 = 20
            r0.setMargins(r5, r2, r2, r2)     // Catch: java.lang.Exception -> L78
            r1.addView(r4, r0)     // Catch: java.lang.Exception -> L78
            android.view.View r0 = r6.f160u     // Catch: java.lang.Exception -> L78
            r0.measure(r2, r2)     // Catch: java.lang.Exception -> L78
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L78
            android.view.View r2 = r6.f160u     // Catch: java.lang.Exception -> L78
            int r2 = r2.getMeasuredWidth()     // Catch: java.lang.Exception -> L78
            android.view.View r4 = r6.f160u     // Catch: java.lang.Exception -> L78
            int r4 = r4.getMeasuredHeight()     // Catch: java.lang.Exception -> L78
            r0.<init>(r2, r4)     // Catch: java.lang.Exception -> L78
            r0.gravity = r3     // Catch: java.lang.Exception -> L78
            android.view.ViewGroup r2 = r6.f159t     // Catch: java.lang.Exception -> L78
            r2.addView(r1, r0)     // Catch: java.lang.Exception -> L78
        L78:
            return
    }

    private void aG() {
            r4 = this;
            com.beizi.ad.i r0 = r4.K     // Catch: java.lang.Exception -> L36
            if (r0 != 0) goto L5
            goto L36
        L5:
            com.beizi.ad.lance.ApkBean r0 = r0.n()     // Catch: java.lang.Exception -> L36
            if (r0 != 0) goto Lc
            goto L36
        Lc:
            android.content.Context r0 = r4.f153n     // Catch: java.lang.Exception -> L36
            com.beizi.ad.i r1 = r4.K     // Catch: java.lang.Exception -> L36
            android.view.View r0 = com.beizi.ad.internal.e.f.a(r0, r1)     // Catch: java.lang.Exception -> L36
            if (r0 != 0) goto L17
            goto L36
        L17:
            android.view.ViewGroup r1 = r4.f159t     // Catch: java.lang.Exception -> L36
            r2 = 0
            r1.measure(r2, r2)     // Catch: java.lang.Exception -> L36
            android.view.ViewGroup r1 = r4.f159t     // Catch: java.lang.Exception -> L36
            int r1 = r1.getMeasuredWidth()     // Catch: java.lang.Exception -> L36
            int r1 = r1 * 2
            int r1 = r1 / 3
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L36
            r3 = -2
            r2.<init>(r1, r3)     // Catch: java.lang.Exception -> L36
            r1 = 83
            r2.gravity = r1     // Catch: java.lang.Exception -> L36
            android.view.ViewGroup r1 = r4.f159t     // Catch: java.lang.Exception -> L36
            r1.addView(r0, r2)     // Catch: java.lang.Exception -> L36
        L36:
            return
    }

    private void aH() {
            r3 = this;
            com.beizi.ad.i r0 = r3.K     // Catch: java.lang.Exception -> L16
            if (r0 != 0) goto L5
            goto L16
        L5:
            java.lang.String r0 = r0.b()     // Catch: java.lang.Exception -> L16
            r1 = 0
            com.beizi.ad.internal.h.i r1 = com.beizi.ad.internal.h.i.a(r1)     // Catch: java.lang.Exception -> L16
            com.beizi.fusion.work.b.b$2 r2 = new com.beizi.fusion.work.b.b$2     // Catch: java.lang.Exception -> L16
            r2.<init>(r3)     // Catch: java.lang.Exception -> L16
            r1.a(r0, r2)     // Catch: java.lang.Exception -> L16
        L16:
            return
    }

    private void aI() {
            r7 = this;
            com.beizi.ad.i r0 = r7.K     // Catch: java.lang.Exception -> L71
            if (r0 != 0) goto L5
            goto L71
        L5:
            android.widget.LinearLayout r0 = new android.widget.LinearLayout     // Catch: java.lang.Exception -> L71
            android.content.Context r1 = r7.f153n     // Catch: java.lang.Exception -> L71
            r0.<init>(r1)     // Catch: java.lang.Exception -> L71
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L71
            r2 = 17
            r3 = -2
            r1.<init>(r3, r3, r2)     // Catch: java.lang.Exception -> L71
            r0.setLayoutParams(r1)     // Catch: java.lang.Exception -> L71
            com.beizi.ad.i r1 = r7.K     // Catch: java.lang.Exception -> L71
            com.beizi.ad.internal.f.c$a r1 = r1.l()     // Catch: java.lang.Exception -> L71
            android.content.Context r4 = r7.f153n     // Catch: java.lang.Exception -> L71
            android.widget.FrameLayout r1 = com.beizi.ad.internal.h.u.a(r4, r1)     // Catch: java.lang.Exception -> L71
            r4 = 0
            r1.setVisibility(r4)     // Catch: java.lang.Exception -> L71
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Exception -> L71
            r6 = 1099431936(0x41880000, float:17.0)
            r5.<init>(r3, r3, r6)     // Catch: java.lang.Exception -> L71
            r0.addView(r1, r5)     // Catch: java.lang.Exception -> L71
            com.beizi.ad.i r1 = r7.K     // Catch: java.lang.Exception -> L71
            com.beizi.ad.internal.f.c$a r1 = r1.k()     // Catch: java.lang.Exception -> L71
            android.content.Context r5 = r7.f153n     // Catch: java.lang.Exception -> L71
            android.widget.FrameLayout r1 = com.beizi.ad.internal.h.u.b(r5, r1)     // Catch: java.lang.Exception -> L71
            r1.setVisibility(r4)     // Catch: java.lang.Exception -> L71
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Exception -> L71
            r5.<init>(r3, r3, r6)     // Catch: java.lang.Exception -> L71
            r0.addView(r1, r5)     // Catch: java.lang.Exception -> L71
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()     // Catch: java.lang.Exception -> L71
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5     // Catch: java.lang.Exception -> L71
            r6 = 5
            r5.setMargins(r6, r4, r4, r4)     // Catch: java.lang.Exception -> L71
            r5.gravity = r2     // Catch: java.lang.Exception -> L71
            r1.setLayoutParams(r5)     // Catch: java.lang.Exception -> L71
            android.view.ViewGroup r1 = r7.f159t     // Catch: java.lang.Exception -> L71
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L71
            r5 = 85
            r2.<init>(r3, r3, r5)     // Catch: java.lang.Exception -> L71
            r1.addView(r0, r2)     // Catch: java.lang.Exception -> L71
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()     // Catch: java.lang.Exception -> L71
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1     // Catch: java.lang.Exception -> L71
            r2 = 15
            r1.setMargins(r4, r4, r2, r2)     // Catch: java.lang.Exception -> L71
            r0.setLayoutParams(r1)     // Catch: java.lang.Exception -> L71
        L71:
            return
    }

    static /* synthetic */ void b(com.beizi.fusion.work.b.b r0) {
            r0.ao()
            return
    }

    static /* synthetic */ void c(com.beizi.fusion.work.b.b r0) {
            r0.H()
            return
    }

    static /* synthetic */ void d(com.beizi.fusion.work.b.b r0) {
            r0.aF()
            return
    }

    static /* synthetic */ com.beizi.fusion.c.d e(com.beizi.fusion.work.b.b r0) {
            com.beizi.fusion.c.d r0 = r0.d
            return r0
    }

    static /* synthetic */ com.beizi.fusion.c.d f(com.beizi.fusion.work.b.b r0) {
            com.beizi.fusion.c.d r0 = r0.d
            return r0
    }

    static /* synthetic */ com.beizi.fusion.c.d g(com.beizi.fusion.work.b.b r0) {
            com.beizi.fusion.c.d r0 = r0.d
            return r0
    }

    static /* synthetic */ void h(com.beizi.fusion.work.b.b r0) {
            r0.F()
            return
    }

    static /* synthetic */ com.beizi.fusion.widget.CustomRoundImageView i(com.beizi.fusion.work.b.b r0) {
            com.beizi.fusion.widget.CustomRoundImageView r0 = r0.ab
            return r0
    }

    static /* synthetic */ void j(com.beizi.fusion.work.b.b r0) {
            r0.aE()
            return
    }

    static /* synthetic */ void k(com.beizi.fusion.work.b.b r0) {
            r0.aG()
            return
    }

    static /* synthetic */ void l(com.beizi.fusion.work.b.b r0) {
            r0.aI()
            return
    }

    @Override // com.beizi.fusion.work.b.a
    public void a(com.beizi.ad.i r5) {
            r4 = this;
            android.widget.ImageView r5 = new android.widget.ImageView     // Catch: java.lang.Exception -> L43
            android.content.Context r0 = r4.f153n     // Catch: java.lang.Exception -> L43
            r5.<init>(r0)     // Catch: java.lang.Exception -> L43
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L43
            r1 = 65
            r0.<init>(r1, r1)     // Catch: java.lang.Exception -> L43
            r2 = 8
            r3 = 15
            r5.setPadding(r3, r2, r2, r3)     // Catch: java.lang.Exception -> L43
            r5.setLayoutParams(r0)     // Catch: java.lang.Exception -> L43
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY     // Catch: java.lang.Exception -> L43
            r5.setScaleType(r0)     // Catch: java.lang.Exception -> L43
            r0 = 0
            r5.setVisibility(r0)     // Catch: java.lang.Exception -> L43
            int r0 = com.beizi.fusion.R.drawable.beizi_close     // Catch: java.lang.Exception -> L43
            r5.setImageResource(r0)     // Catch: java.lang.Exception -> L43
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L43
            r0.<init>(r1, r1)     // Catch: java.lang.Exception -> L43
            r1 = 5
            r0.gravity = r1     // Catch: java.lang.Exception -> L43
            android.view.ViewGroup r1 = r4.f159t     // Catch: java.lang.Exception -> L43
            r1.addView(r5, r0)     // Catch: java.lang.Exception -> L43
            com.beizi.fusion.work.b.b$3 r0 = new com.beizi.fusion.work.b.b$3     // Catch: java.lang.Exception -> L43
            r0.<init>(r4)     // Catch: java.lang.Exception -> L43
            r5.setOnTouchListener(r0)     // Catch: java.lang.Exception -> L43
            com.beizi.fusion.work.b.b$4 r0 = new com.beizi.fusion.work.b.b$4     // Catch: java.lang.Exception -> L43
            r0.<init>(r4)     // Catch: java.lang.Exception -> L43
            r5.setOnClickListener(r0)     // Catch: java.lang.Exception -> L43
        L43:
            return
    }

    @Override // com.beizi.fusion.work.b.a
    public void b() {
            r9 = this;
            com.beizi.ad.i r0 = r9.K     // Catch: java.lang.Exception -> L115
            if (r0 != 0) goto La
            r0 = -991(0xfffffffffffffc21, float:NaN)
            r9.c(r0)     // Catch: java.lang.Exception -> L115
            return
        La:
            android.content.Context r0 = r9.f153n     // Catch: java.lang.Exception -> L115
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)     // Catch: java.lang.Exception -> L115
            int r1 = com.beizi.fusion.R.layout.beizi_layout_native_left_text_right_picture_view     // Catch: java.lang.Exception -> L115
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)     // Catch: java.lang.Exception -> L115
            r9.M = r0     // Catch: java.lang.Exception -> L115
            int r1 = com.beizi.fusion.R.id.native_ad_ltrg_content_rl     // Catch: java.lang.Exception -> L115
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Exception -> L115
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0     // Catch: java.lang.Exception -> L115
            r9.V = r0     // Catch: java.lang.Exception -> L115
            android.view.View r0 = r9.M     // Catch: java.lang.Exception -> L115
            int r1 = com.beizi.fusion.R.id.native_ad_ltrg_title_ll     // Catch: java.lang.Exception -> L115
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Exception -> L115
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch: java.lang.Exception -> L115
            android.view.View r1 = r9.M     // Catch: java.lang.Exception -> L115
            int r3 = com.beizi.fusion.R.id.native_ad_ltrg_title_tv     // Catch: java.lang.Exception -> L115
            android.view.View r1 = r1.findViewById(r3)     // Catch: java.lang.Exception -> L115
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch: java.lang.Exception -> L115
            r9.W = r1     // Catch: java.lang.Exception -> L115
            android.view.View r1 = r9.M     // Catch: java.lang.Exception -> L115
            int r3 = com.beizi.fusion.R.id.native_ad_ltrg_subtitle_rl     // Catch: java.lang.Exception -> L115
            android.view.View r1 = r1.findViewById(r3)     // Catch: java.lang.Exception -> L115
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1     // Catch: java.lang.Exception -> L115
            android.view.View r3 = r9.M     // Catch: java.lang.Exception -> L115
            int r4 = com.beizi.fusion.R.id.native_ad_ltrg_subtitle_tv     // Catch: java.lang.Exception -> L115
            android.view.View r3 = r3.findViewById(r4)     // Catch: java.lang.Exception -> L115
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch: java.lang.Exception -> L115
            r9.X = r3     // Catch: java.lang.Exception -> L115
            android.view.View r3 = r9.M     // Catch: java.lang.Exception -> L115
            int r4 = com.beizi.fusion.R.id.native_ad_ltrg_go_tv     // Catch: java.lang.Exception -> L115
            android.view.View r3 = r3.findViewById(r4)     // Catch: java.lang.Exception -> L115
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch: java.lang.Exception -> L115
            r9.Y = r3     // Catch: java.lang.Exception -> L115
            android.view.View r3 = r9.M     // Catch: java.lang.Exception -> L115
            int r4 = com.beizi.fusion.R.id.native_ad_ltrg_go_iv     // Catch: java.lang.Exception -> L115
            android.view.View r3 = r3.findViewById(r4)     // Catch: java.lang.Exception -> L115
            android.widget.ImageView r3 = (android.widget.ImageView) r3     // Catch: java.lang.Exception -> L115
            r9.Z = r3     // Catch: java.lang.Exception -> L115
            android.view.View r3 = r9.M     // Catch: java.lang.Exception -> L115
            int r4 = com.beizi.fusion.R.id.native_ad_ltrg_image_iv     // Catch: java.lang.Exception -> L115
            android.view.View r3 = r3.findViewById(r4)     // Catch: java.lang.Exception -> L115
            com.beizi.fusion.widget.CustomRoundImageView r3 = (com.beizi.fusion.widget.CustomRoundImageView) r3     // Catch: java.lang.Exception -> L115
            r9.ab = r3     // Catch: java.lang.Exception -> L115
            android.view.View r3 = r9.M     // Catch: java.lang.Exception -> L115
            int r4 = com.beizi.fusion.R.id.native_ad_ltrg_ad_text_iv     // Catch: java.lang.Exception -> L115
            android.view.View r3 = r3.findViewById(r4)     // Catch: java.lang.Exception -> L115
            android.widget.ImageView r3 = (android.widget.ImageView) r3     // Catch: java.lang.Exception -> L115
            r9.aa = r3     // Catch: java.lang.Exception -> L115
            android.widget.RelativeLayout r3 = r9.V     // Catch: java.lang.Exception -> L115
            r4 = 1092616192(0x41200000, float:10.0)
            r5 = 0
            if (r3 == 0) goto L95
            android.content.Context r6 = r9.f153n     // Catch: java.lang.Exception -> L115
            int r6 = com.beizi.fusion.tool.ap.a(r6, r4)     // Catch: java.lang.Exception -> L115
            android.content.Context r7 = r9.f153n     // Catch: java.lang.Exception -> L115
            int r7 = com.beizi.fusion.tool.ap.a(r7, r4)     // Catch: java.lang.Exception -> L115
            r3.setPadding(r5, r6, r7, r5)     // Catch: java.lang.Exception -> L115
        L95:
            if (r0 == 0) goto Lb2
            android.content.Context r3 = r9.f153n     // Catch: java.lang.Exception -> L115
            r6 = 1101004800(0x41a00000, float:20.0)
            int r3 = com.beizi.fusion.tool.ap.a(r3, r6)     // Catch: java.lang.Exception -> L115
            android.content.Context r6 = r9.f153n     // Catch: java.lang.Exception -> L115
            r7 = 1090519040(0x41000000, float:8.0)
            int r6 = com.beizi.fusion.tool.ap.a(r6, r7)     // Catch: java.lang.Exception -> L115
            android.content.Context r7 = r9.f153n     // Catch: java.lang.Exception -> L115
            r8 = 1093664768(0x41300000, float:11.0)
            int r7 = com.beizi.fusion.tool.ap.a(r7, r8)     // Catch: java.lang.Exception -> L115
            r0.setPadding(r3, r6, r7, r5)     // Catch: java.lang.Exception -> L115
        Lb2:
            com.beizi.ad.i r0 = r9.K     // Catch: java.lang.Exception -> L115
            java.lang.String r0 = r0.a()     // Catch: java.lang.Exception -> L115
            android.widget.TextView r3 = r9.W     // Catch: java.lang.Exception -> L115
            if (r3 == 0) goto Lc7
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L115
            if (r3 != 0) goto Lc7
            android.widget.TextView r3 = r9.W     // Catch: java.lang.Exception -> L115
            r3.setText(r0)     // Catch: java.lang.Exception -> L115
        Lc7:
            if (r1 == 0) goto Ld4
            android.content.Context r0 = r9.f153n     // Catch: java.lang.Exception -> L115
            r3 = 1084227584(0x40a00000, float:5.0)
            int r0 = com.beizi.fusion.tool.ap.a(r0, r3)     // Catch: java.lang.Exception -> L115
            r1.setPadding(r5, r0, r5, r5)     // Catch: java.lang.Exception -> L115
        Ld4:
            com.beizi.ad.i r0 = r9.K     // Catch: java.lang.Exception -> L115
            java.lang.String r0 = r0.c()     // Catch: java.lang.Exception -> L115
            android.widget.TextView r1 = r9.X     // Catch: java.lang.Exception -> L115
            if (r1 == 0) goto Le9
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L115
            if (r1 != 0) goto Le9
            android.widget.TextView r1 = r9.X     // Catch: java.lang.Exception -> L115
            r1.setText(r0)     // Catch: java.lang.Exception -> L115
        Le9:
            android.widget.ImageView r0 = r9.aa     // Catch: java.lang.Exception -> L115
            if (r0 == 0) goto Lf6
            android.content.Context r1 = r9.f153n     // Catch: java.lang.Exception -> L115
            int r1 = com.beizi.fusion.tool.ap.a(r1, r4)     // Catch: java.lang.Exception -> L115
            r0.setPadding(r5, r1, r5, r5)     // Catch: java.lang.Exception -> L115
        Lf6:
            android.widget.TextView r0 = r9.Y     // Catch: java.lang.Exception -> L115
            if (r0 == 0) goto L105
            java.lang.String r1 = "#71A0FF"
            android.content.Context r3 = r9.f153n     // Catch: java.lang.Exception -> L115
            int r3 = com.beizi.fusion.tool.ap.a(r3, r4)     // Catch: java.lang.Exception -> L115
            com.beizi.fusion.tool.am.a(r0, r1, r5, r2, r3)     // Catch: java.lang.Exception -> L115
        L105:
            android.widget.TextView r0 = r9.Y     // Catch: java.lang.Exception -> L115
            android.widget.ImageView r1 = r9.Z     // Catch: java.lang.Exception -> L115
            r9.a(r0, r1)     // Catch: java.lang.Exception -> L115
            r9.aH()     // Catch: java.lang.Exception -> L115
            r9.az()     // Catch: java.lang.Exception -> L115
            r9.aA()     // Catch: java.lang.Exception -> L115
        L115:
            return
    }
}
