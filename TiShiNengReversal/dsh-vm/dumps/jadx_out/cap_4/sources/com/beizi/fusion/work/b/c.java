package com.beizi.fusion.work.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c extends com.beizi.fusion.work.b.a {
    private android.widget.LinearLayout V;
    private android.widget.LinearLayout W;
    private android.widget.FrameLayout X;
    private com.beizi.fusion.widget.CustomRoundImageView Y;
    private android.widget.TextView Z;
    private android.widget.TextView aa;
    private android.widget.TextView ab;
    private android.widget.ImageView ac;





    public c(android.content.Context r1, java.lang.String r2, long r3, long r5, com.beizi.fusion.model.AdSpacesBean.BuyerBean r7, com.beizi.fusion.model.AdSpacesBean.ForwardBean r8, com.beizi.fusion.c.d r9, float r10, float r11) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            return
    }

    static /* synthetic */ com.beizi.fusion.events.EventBean a(com.beizi.fusion.work.b.c r0) {
            com.beizi.fusion.events.EventBean r0 = r0.b
            return r0
    }

    static /* synthetic */ void a(com.beizi.fusion.work.b.c r0, java.lang.String r1, int r2) {
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
            java.lang.String r3 = "2"
            r0.a(r1, r2, r3)     // Catch: java.lang.Exception -> L23
            com.beizi.fusion.work.b.c$1 r1 = new com.beizi.fusion.work.b.c$1     // Catch: java.lang.Exception -> L23
            r1.<init>(r4)     // Catch: java.lang.Exception -> L23
            r0.a(r1)     // Catch: java.lang.Exception -> L23
        L23:
            return
    }

    private void aF() {
            r6 = this;
            java.lang.String r0 = "#000000"
            android.widget.LinearLayout r1 = new android.widget.LinearLayout     // Catch: java.lang.Exception -> L7a
            android.content.Context r2 = r6.f153n     // Catch: java.lang.Exception -> L7a
            r1.<init>(r2)     // Catch: java.lang.Exception -> L7a
            r2 = 1
            r1.setOrientation(r2)     // Catch: java.lang.Exception -> L7a
            r2 = 17
            r1.setGravity(r2)     // Catch: java.lang.Exception -> L7a
            java.lang.String r3 = "#FFFFFF"
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Exception -> L7a
            r1.setBackgroundColor(r3)     // Catch: java.lang.Exception -> L7a
            android.widget.ImageView r3 = new android.widget.ImageView     // Catch: java.lang.Exception -> L7a
            android.content.Context r4 = r6.f153n     // Catch: java.lang.Exception -> L7a
            r3.<init>(r4)     // Catch: java.lang.Exception -> L7a
            int r4 = com.beizi.fusion.R.drawable.beizi_icon_checkbox     // Catch: java.lang.Exception -> L7a
            r3.setImageResource(r4)     // Catch: java.lang.Exception -> L7a
            int r4 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Exception -> L7a
            r3.setColorFilter(r4)     // Catch: java.lang.Exception -> L7a
            r1.addView(r3)     // Catch: java.lang.Exception -> L7a
            android.widget.TextView r3 = new android.widget.TextView     // Catch: java.lang.Exception -> L7a
            android.content.Context r4 = r6.f153n     // Catch: java.lang.Exception -> L7a
            r3.<init>(r4)     // Catch: java.lang.Exception -> L7a
            java.lang.String r4 = "投诉成功，我们将重视您的反馈。"
            r3.setText(r4)     // Catch: java.lang.Exception -> L7a
            int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Exception -> L7a
            r3.setTextColor(r0)     // Catch: java.lang.Exception -> L7a
            r0 = 2
            r4 = 1095761920(0x41500000, float:13.0)
            r3.setTextSize(r0, r4)     // Catch: java.lang.Exception -> L7a
            r3.setGravity(r2)     // Catch: java.lang.Exception -> L7a
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Exception -> L7a
            r4 = -1
            r5 = -2
            r0.<init>(r4, r5)     // Catch: java.lang.Exception -> L7a
            r4 = 30
            r5 = 0
            r0.setMargins(r5, r4, r5, r5)     // Catch: java.lang.Exception -> L7a
            r1.addView(r3, r0)     // Catch: java.lang.Exception -> L7a
            android.view.View r0 = r6.f160u     // Catch: java.lang.Exception -> L7a
            r0.measure(r5, r5)     // Catch: java.lang.Exception -> L7a
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L7a
            android.view.View r3 = r6.f160u     // Catch: java.lang.Exception -> L7a
            int r3 = r3.getMeasuredWidth()     // Catch: java.lang.Exception -> L7a
            android.view.View r4 = r6.f160u     // Catch: java.lang.Exception -> L7a
            int r4 = r4.getMeasuredHeight()     // Catch: java.lang.Exception -> L7a
            r0.<init>(r3, r4)     // Catch: java.lang.Exception -> L7a
            r0.gravity = r2     // Catch: java.lang.Exception -> L7a
            android.view.ViewGroup r2 = r6.f159t     // Catch: java.lang.Exception -> L7a
            r2.addView(r1, r0)     // Catch: java.lang.Exception -> L7a
        L7a:
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
            android.widget.FrameLayout r1 = r4.X     // Catch: java.lang.Exception -> L36
            r2 = 0
            r1.measure(r2, r2)     // Catch: java.lang.Exception -> L36
            android.widget.FrameLayout r1 = r4.X     // Catch: java.lang.Exception -> L36
            int r1 = r1.getMeasuredWidth()     // Catch: java.lang.Exception -> L36
            int r1 = r1 * 2
            int r1 = r1 / 3
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L36
            r3 = -2
            r2.<init>(r1, r3)     // Catch: java.lang.Exception -> L36
            r1 = 83
            r2.gravity = r1     // Catch: java.lang.Exception -> L36
            android.widget.FrameLayout r1 = r4.X     // Catch: java.lang.Exception -> L36
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
            com.beizi.fusion.work.b.c$2 r2 = new com.beizi.fusion.work.b.c$2     // Catch: java.lang.Exception -> L16
            r2.<init>(r3)     // Catch: java.lang.Exception -> L16
            r1.a(r0, r2)     // Catch: java.lang.Exception -> L16
        L16:
            return
    }

    private void aI() {
            r7 = this;
            com.beizi.ad.i r0 = r7.K     // Catch: java.lang.Exception -> L96
            if (r0 != 0) goto L6
            goto L96
        L6:
            android.widget.LinearLayout r0 = new android.widget.LinearLayout     // Catch: java.lang.Exception -> L96
            android.content.Context r1 = r7.f153n     // Catch: java.lang.Exception -> L96
            r0.<init>(r1)     // Catch: java.lang.Exception -> L96
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L96
            r2 = 17
            r3 = -2
            r1.<init>(r3, r3, r2)     // Catch: java.lang.Exception -> L96
            r0.setLayoutParams(r1)     // Catch: java.lang.Exception -> L96
            com.beizi.ad.i r1 = r7.K     // Catch: java.lang.Exception -> L96
            com.beizi.ad.internal.f.c$a r1 = r1.l()     // Catch: java.lang.Exception -> L96
            android.content.Context r4 = r7.f153n     // Catch: java.lang.Exception -> L96
            android.widget.FrameLayout r1 = com.beizi.ad.internal.h.u.a(r4, r1)     // Catch: java.lang.Exception -> L96
            r4 = 0
            r1.setVisibility(r4)     // Catch: java.lang.Exception -> L96
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Exception -> L96
            r6 = 1099431936(0x41880000, float:17.0)
            r5.<init>(r3, r3, r6)     // Catch: java.lang.Exception -> L96
            r0.addView(r1, r5)     // Catch: java.lang.Exception -> L96
            com.beizi.ad.i r1 = r7.K     // Catch: java.lang.Exception -> L96
            com.beizi.ad.internal.f.c$a r1 = r1.k()     // Catch: java.lang.Exception -> L96
            android.content.Context r5 = r7.f153n     // Catch: java.lang.Exception -> L96
            android.widget.FrameLayout r1 = com.beizi.ad.internal.h.u.b(r5, r1)     // Catch: java.lang.Exception -> L96
            r1.setVisibility(r4)     // Catch: java.lang.Exception -> L96
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Exception -> L96
            r5.<init>(r3, r3, r6)     // Catch: java.lang.Exception -> L96
            r0.addView(r1, r5)     // Catch: java.lang.Exception -> L96
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()     // Catch: java.lang.Exception -> L96
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5     // Catch: java.lang.Exception -> L96
            r6 = 5
            r5.setMargins(r6, r4, r4, r4)     // Catch: java.lang.Exception -> L96
            r5.gravity = r2     // Catch: java.lang.Exception -> L96
            r1.setLayoutParams(r5)     // Catch: java.lang.Exception -> L96
            android.view.ViewGroup r1 = r7.f159t     // Catch: java.lang.Exception -> L96
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L96
            r5 = 53
            r2.<init>(r3, r3, r5)     // Catch: java.lang.Exception -> L96
            r1.addView(r0, r2)     // Catch: java.lang.Exception -> L96
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()     // Catch: java.lang.Exception -> L96
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1     // Catch: java.lang.Exception -> L96
            boolean r2 = r7.aB()     // Catch: java.lang.Exception -> L96
            r3 = 1098907648(0x41800000, float:16.0)
            if (r2 == 0) goto L84
            android.content.Context r2 = r7.f153n     // Catch: java.lang.Exception -> L96
            int r2 = com.beizi.fusion.tool.ap.a(r2, r3)     // Catch: java.lang.Exception -> L96
            android.content.Context r3 = r7.f153n     // Catch: java.lang.Exception -> L96
            r5 = 1109393408(0x42200000, float:40.0)
            int r3 = com.beizi.fusion.tool.ap.a(r3, r5)     // Catch: java.lang.Exception -> L96
            r1.setMargins(r4, r2, r3, r4)     // Catch: java.lang.Exception -> L96
            goto L93
        L84:
            android.content.Context r2 = r7.f153n     // Catch: java.lang.Exception -> L96
            int r2 = com.beizi.fusion.tool.ap.a(r2, r3)     // Catch: java.lang.Exception -> L96
            android.content.Context r5 = r7.f153n     // Catch: java.lang.Exception -> L96
            int r3 = com.beizi.fusion.tool.ap.a(r5, r3)     // Catch: java.lang.Exception -> L96
            r1.setMargins(r4, r2, r3, r4)     // Catch: java.lang.Exception -> L96
        L93:
            r0.setLayoutParams(r1)     // Catch: java.lang.Exception -> L96
        L96:
            return
    }

    static /* synthetic */ void b(com.beizi.fusion.work.b.c r0) {
            r0.ao()
            return
    }

    static /* synthetic */ void b(com.beizi.fusion.work.b.c r0, java.lang.String r1, int r2) {
            r0.a(r1, r2)
            return
    }

    static /* synthetic */ void c(com.beizi.fusion.work.b.c r0) {
            r0.H()
            return
    }

    static /* synthetic */ void d(com.beizi.fusion.work.b.c r0) {
            r0.aF()
            return
    }

    static /* synthetic */ com.beizi.fusion.c.d e(com.beizi.fusion.work.b.c r0) {
            com.beizi.fusion.c.d r0 = r0.d
            return r0
    }

    static /* synthetic */ com.beizi.fusion.c.d f(com.beizi.fusion.work.b.c r0) {
            com.beizi.fusion.c.d r0 = r0.d
            return r0
    }

    static /* synthetic */ com.beizi.fusion.c.d g(com.beizi.fusion.work.b.c r0) {
            com.beizi.fusion.c.d r0 = r0.d
            return r0
    }

    static /* synthetic */ void h(com.beizi.fusion.work.b.c r0) {
            r0.F()
            return
    }

    static /* synthetic */ android.widget.LinearLayout i(com.beizi.fusion.work.b.c r0) {
            android.widget.LinearLayout r0 = r0.W
            return r0
    }

    static /* synthetic */ com.beizi.fusion.widget.CustomRoundImageView j(com.beizi.fusion.work.b.c r0) {
            com.beizi.fusion.widget.CustomRoundImageView r0 = r0.Y
            return r0
    }

    static /* synthetic */ void k(com.beizi.fusion.work.b.c r0) {
            r0.aE()
            return
    }

    static /* synthetic */ void l(com.beizi.fusion.work.b.c r0) {
            r0.aG()
            return
    }

    static /* synthetic */ void m(com.beizi.fusion.work.b.c r0) {
            r0.aI()
            return
    }

    @Override // com.beizi.fusion.work.b.a
    public void a(com.beizi.ad.i r6) {
            r5 = this;
            android.widget.ImageView r6 = new android.widget.ImageView     // Catch: java.lang.Exception -> L57
            android.content.Context r0 = r5.f153n     // Catch: java.lang.Exception -> L57
            r6.<init>(r0)     // Catch: java.lang.Exception -> L57
            android.content.Context r0 = r5.f153n     // Catch: java.lang.Exception -> L57
            r1 = 1103101952(0x41c00000, float:24.0)
            int r0 = com.beizi.fusion.tool.ap.a(r0, r1)     // Catch: java.lang.Exception -> L57
            int r0 = r0 + 42
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L57
            r1.<init>(r0, r0)     // Catch: java.lang.Exception -> L57
            android.content.Context r2 = r5.f153n     // Catch: java.lang.Exception -> L57
            r3 = 1098907648(0x41800000, float:16.0)
            int r2 = com.beizi.fusion.tool.ap.a(r2, r3)     // Catch: java.lang.Exception -> L57
            android.content.Context r3 = r5.f153n     // Catch: java.lang.Exception -> L57
            r4 = 1090519040(0x41000000, float:8.0)
            int r3 = com.beizi.fusion.tool.ap.a(r3, r4)     // Catch: java.lang.Exception -> L57
            r6.setPadding(r3, r2, r2, r3)     // Catch: java.lang.Exception -> L57
            r6.setLayoutParams(r1)     // Catch: java.lang.Exception -> L57
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch: java.lang.Exception -> L57
            r6.setScaleType(r1)     // Catch: java.lang.Exception -> L57
            r1 = 0
            r6.setVisibility(r1)     // Catch: java.lang.Exception -> L57
            int r1 = com.beizi.fusion.R.drawable.beizi_close_two     // Catch: java.lang.Exception -> L57
            r6.setImageResource(r1)     // Catch: java.lang.Exception -> L57
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> L57
            r1.<init>(r0, r0)     // Catch: java.lang.Exception -> L57
            r0 = 5
            r1.gravity = r0     // Catch: java.lang.Exception -> L57
            android.view.ViewGroup r0 = r5.f159t     // Catch: java.lang.Exception -> L57
            r0.addView(r6, r1)     // Catch: java.lang.Exception -> L57
            com.beizi.fusion.work.b.c$3 r0 = new com.beizi.fusion.work.b.c$3     // Catch: java.lang.Exception -> L57
            r0.<init>(r5)     // Catch: java.lang.Exception -> L57
            r6.setOnTouchListener(r0)     // Catch: java.lang.Exception -> L57
            com.beizi.fusion.work.b.c$4 r0 = new com.beizi.fusion.work.b.c$4     // Catch: java.lang.Exception -> L57
            r0.<init>(r5)     // Catch: java.lang.Exception -> L57
            r6.setOnClickListener(r0)     // Catch: java.lang.Exception -> L57
        L57:
            return
    }

    @Override // com.beizi.fusion.work.b.a
    public void b() {
            r4 = this;
            com.beizi.ad.i r0 = r4.K     // Catch: java.lang.Exception -> L129
            if (r0 != 0) goto La
            r0 = -991(0xfffffffffffffc21, float:NaN)
            r4.c(r0)     // Catch: java.lang.Exception -> L129
            return
        La:
            android.content.Context r0 = r4.f153n     // Catch: java.lang.Exception -> L129
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)     // Catch: java.lang.Exception -> L129
            int r1 = com.beizi.fusion.R.layout.beizi_layout_native_top_picture_bottom_text_view     // Catch: java.lang.Exception -> L129
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)     // Catch: java.lang.Exception -> L129
            r4.M = r0     // Catch: java.lang.Exception -> L129
            int r1 = com.beizi.fusion.R.id.native_ad_tpbt_container_ll     // Catch: java.lang.Exception -> L129
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Exception -> L129
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch: java.lang.Exception -> L129
            r4.V = r0     // Catch: java.lang.Exception -> L129
            android.view.View r0 = r4.M     // Catch: java.lang.Exception -> L129
            int r1 = com.beizi.fusion.R.id.native_ad_tpbt_img_container_fl     // Catch: java.lang.Exception -> L129
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Exception -> L129
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0     // Catch: java.lang.Exception -> L129
            r4.X = r0     // Catch: java.lang.Exception -> L129
            android.view.View r0 = r4.M     // Catch: java.lang.Exception -> L129
            int r1 = com.beizi.fusion.R.id.native_ad_tpbt_image_iv     // Catch: java.lang.Exception -> L129
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Exception -> L129
            com.beizi.fusion.widget.CustomRoundImageView r0 = (com.beizi.fusion.widget.CustomRoundImageView) r0     // Catch: java.lang.Exception -> L129
            r4.Y = r0     // Catch: java.lang.Exception -> L129
            android.view.View r0 = r4.M     // Catch: java.lang.Exception -> L129
            int r1 = com.beizi.fusion.R.id.native_ad_tpbt_content_ll     // Catch: java.lang.Exception -> L129
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Exception -> L129
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch: java.lang.Exception -> L129
            r4.W = r0     // Catch: java.lang.Exception -> L129
            android.view.View r0 = r4.M     // Catch: java.lang.Exception -> L129
            int r1 = com.beizi.fusion.R.id.native_ad_tpbt_title_tv     // Catch: java.lang.Exception -> L129
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Exception -> L129
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Exception -> L129
            r4.Z = r0     // Catch: java.lang.Exception -> L129
            android.view.View r0 = r4.M     // Catch: java.lang.Exception -> L129
            int r1 = com.beizi.fusion.R.id.native_ad_tpbt_subtitle_tv     // Catch: java.lang.Exception -> L129
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Exception -> L129
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Exception -> L129
            r4.aa = r0     // Catch: java.lang.Exception -> L129
            android.view.View r0 = r4.M     // Catch: java.lang.Exception -> L129
            int r1 = com.beizi.fusion.R.id.native_ad_tpbt_go_tv     // Catch: java.lang.Exception -> L129
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Exception -> L129
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Exception -> L129
            r4.ab = r0     // Catch: java.lang.Exception -> L129
            android.view.View r0 = r4.M     // Catch: java.lang.Exception -> L129
            int r1 = com.beizi.fusion.R.id.native_ad_tpbt_go_iv     // Catch: java.lang.Exception -> L129
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Exception -> L129
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch: java.lang.Exception -> L129
            r4.ac = r0     // Catch: java.lang.Exception -> L129
            android.content.Context r0 = r4.f153n     // Catch: java.lang.Exception -> L129
            float r1 = r4.f157r     // Catch: java.lang.Exception -> L129
            int r0 = com.beizi.fusion.tool.ap.a(r0, r1)     // Catch: java.lang.Exception -> L129
            float r1 = r4.f158s     // Catch: java.lang.Exception -> L129
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L8d
            android.content.Context r2 = r4.f153n     // Catch: java.lang.Exception -> L129
            int r1 = com.beizi.fusion.tool.ap.a(r2, r1)     // Catch: java.lang.Exception -> L129
            goto L8e
        L8d:
            r1 = -2
        L8e:
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams     // Catch: java.lang.Exception -> L129
            r2.<init>(r0, r1)     // Catch: java.lang.Exception -> L129
            android.content.Context r0 = r4.f153n     // Catch: java.lang.Exception -> L129
            r1 = 1090519040(0x41000000, float:8.0)
            int r0 = com.beizi.fusion.tool.ap.a(r0, r1)     // Catch: java.lang.Exception -> L129
            android.widget.LinearLayout r3 = r4.V     // Catch: java.lang.Exception -> L129
            if (r3 == 0) goto La7
            r3.setPadding(r0, r0, r0, r0)     // Catch: java.lang.Exception -> L129
            android.widget.LinearLayout r0 = r4.V     // Catch: java.lang.Exception -> L129
            r0.setLayoutParams(r2)     // Catch: java.lang.Exception -> L129
        La7:
            android.widget.LinearLayout r0 = r4.W     // Catch: java.lang.Exception -> L129
            if (r0 == 0) goto Lbb
            android.content.Context r2 = r4.f153n     // Catch: java.lang.Exception -> L129
            int r2 = com.beizi.fusion.tool.ap.a(r2, r1)     // Catch: java.lang.Exception -> L129
            android.content.Context r3 = r4.f153n     // Catch: java.lang.Exception -> L129
            int r1 = com.beizi.fusion.tool.ap.a(r3, r1)     // Catch: java.lang.Exception -> L129
            r3 = 0
            r0.setPadding(r3, r2, r3, r1)     // Catch: java.lang.Exception -> L129
        Lbb:
            com.beizi.ad.i r0 = r4.K     // Catch: java.lang.Exception -> L129
            java.lang.String r0 = r0.a()     // Catch: java.lang.Exception -> L129
            android.widget.TextView r1 = r4.Z     // Catch: java.lang.Exception -> L129
            if (r1 == 0) goto Ld0
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L129
            if (r1 != 0) goto Ld0
            android.widget.TextView r1 = r4.Z     // Catch: java.lang.Exception -> L129
            r1.setText(r0)     // Catch: java.lang.Exception -> L129
        Ld0:
            com.beizi.ad.i r0 = r4.K     // Catch: java.lang.Exception -> L129
            java.lang.String r0 = r0.c()     // Catch: java.lang.Exception -> L129
            android.widget.TextView r1 = r4.aa     // Catch: java.lang.Exception -> L129
            if (r1 == 0) goto Le5
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L129
            if (r1 != 0) goto Le5
            android.widget.TextView r1 = r4.aa     // Catch: java.lang.Exception -> L129
            r1.setText(r0)     // Catch: java.lang.Exception -> L129
        Le5:
            android.widget.TextView r0 = r4.ab     // Catch: java.lang.Exception -> L129
            if (r0 == 0) goto Lf4
            android.content.Context r1 = r4.f153n     // Catch: java.lang.Exception -> L129
            int r2 = com.beizi.fusion.R.drawable.beizi_bg_operate_button     // Catch: java.lang.Exception -> L129
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)     // Catch: java.lang.Exception -> L129
            r0.setBackground(r1)     // Catch: java.lang.Exception -> L129
        Lf4:
            android.widget.ImageView r0 = r4.ac     // Catch: java.lang.Exception -> L129
            if (r0 == 0) goto L119
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams     // Catch: java.lang.Exception -> L129
            android.content.Context r1 = r4.f153n     // Catch: java.lang.Exception -> L129
            r2 = 1115422720(0x427c0000, float:63.0)
            int r1 = com.beizi.fusion.tool.ap.a(r1, r2)     // Catch: java.lang.Exception -> L129
            android.content.Context r2 = r4.f153n     // Catch: java.lang.Exception -> L129
            r3 = 1103101952(0x41c00000, float:24.0)
            int r2 = com.beizi.fusion.tool.ap.a(r2, r3)     // Catch: java.lang.Exception -> L129
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L129
            android.widget.ImageView r1 = r4.ac     // Catch: java.lang.Exception -> L129
            r1.setLayoutParams(r0)     // Catch: java.lang.Exception -> L129
            android.widget.ImageView r0 = r4.ac     // Catch: java.lang.Exception -> L129
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch: java.lang.Exception -> L129
            r0.setScaleType(r1)     // Catch: java.lang.Exception -> L129
        L119:
            android.widget.TextView r0 = r4.ab     // Catch: java.lang.Exception -> L129
            android.widget.ImageView r1 = r4.ac     // Catch: java.lang.Exception -> L129
            r4.a(r0, r1)     // Catch: java.lang.Exception -> L129
            r4.aH()     // Catch: java.lang.Exception -> L129
            r4.az()     // Catch: java.lang.Exception -> L129
            r4.aA()     // Catch: java.lang.Exception -> L129
        L129:
            return
    }
}
