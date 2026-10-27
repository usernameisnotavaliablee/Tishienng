package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class f6 extends xyz.adscope.ad.a6 implements xyz.adscope.ad.c4 {
    private android.widget.ImageView f;
    private xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView g;
    private android.widget.RelativeLayout h;
    private android.animation.AnimatorSet i;
    private boolean j;
    private android.widget.TextView k;
    private android.widget.TextView l;
    private java.lang.String m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel a;
        final /* synthetic */ xyz.adscope.ad.f6 b;

        a(xyz.adscope.ad.f6 r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                xyz.adscope.ad.f6 r0 = r8.b
                android.widget.RelativeLayout r0 = xyz.adscope.ad.f6.a(r0)
                int r0 = r0.getMeasuredHeight()
                xyz.adscope.ad.f6 r1 = r8.b
                android.widget.RelativeLayout r1 = xyz.adscope.ad.f6.a(r1)
                int r1 = r1.getMeasuredWidth()
                int r0 = java.lang.Math.min(r0, r1)
                xyz.adscope.ad.f6 r1 = r8.b
                android.content.Context r2 = r1.getContext()
                xyz.adscope.ad.f6 r1 = r8.b
                android.widget.RelativeLayout r3 = xyz.adscope.ad.f6.a(r1)
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r1 = r8.a
                java.lang.String r4 = r1.c()
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r1 = r8.a
                java.lang.String r1 = r1.f()
                int r5 = xyz.adscope.common.v2.tool.str.StringUtil.parseInt(r1)
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r1 = r8.a
                java.lang.String r6 = r1.d()
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r1 = r8.a
                java.lang.String r1 = r1.e()
                int r7 = xyz.adscope.ad.q6.a(r1, r0)
                xyz.adscope.ad.q6.a(r2, r3, r4, r5, r6, r7)
                xyz.adscope.ad.f6 r1 = r8.b
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r2 = r8.a
                xyz.adscope.ad.f6.a(r1, r0, r2)
                xyz.adscope.ad.f6 r1 = r8.b
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r2 = r8.a
                xyz.adscope.ad.f6.b(r1, r0, r2)
                xyz.adscope.ad.f6 r1 = r8.b
                xyz.adscope.ad.f6.a(r1, r0)
                return
        }
    }

    public f6(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.j = r1
            java.lang.String r1 = ""
            r0.m = r1
            return
    }

    static /* synthetic */ android.widget.RelativeLayout a(xyz.adscope.ad.f6 r0) {
            android.widget.RelativeLayout r0 = r0.h
            return r0
    }

    private java.lang.String a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L29
            java.lang.String r0 = "Normal"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lf
            java.lang.String r2 = r2.b()
            return r2
        Lf:
            java.lang.String r0 = "Passive"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1c
            java.lang.String r2 = r2.c()
            return r2
        L1c:
            java.lang.String r0 = "Cooling"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L29
            java.lang.String r2 = r2.a()
            return r2
        L29:
            java.lang.String r2 = ""
            return r2
    }

    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.status.StatusTitleModel r2) {
            r1 = this;
            if (r2 == 0) goto L10
            boolean r0 = r1.j
            if (r0 == 0) goto Lb
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r2 = r2.a()
            return r2
        Lb:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r2 = r2.b()
            return r2
        L10:
            r2 = 0
            return r2
    }

    private void a(int r6) {
            r5 = this;
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r0 = r5.g
            if (r0 == 0) goto L47
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r5.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r0.b()
            if (r0 == 0) goto L47
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r5.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r0.b()
            int r0 = r0.f()
            if (r0 == 0) goto L40
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r0 = r5.g
            r1 = 0
            r0.setVisibility(r1)
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r0 = r5.g
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            double r1 = (double) r6
            r3 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r1 = r1 * r3
            int r1 = (int) r1
            r0.width = r1
            r0.height = r1
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r1 = r5.g
            r1.setLayoutParams(r0)
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r0 = r5.g
            int r6 = r6 / 30
            r0.setLineWidth(r6)
            return
        L40:
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r6 = r5.g
            r0 = 8
            r6.setVisibility(r0)
        L47:
            return
    }

    private void a(int r6, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r7) {
            r5 = this;
            android.widget.ImageView r0 = r5.f
            if (r0 == 0) goto L31
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            double r1 = (double) r6
            r3 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r1 = r1 * r3
            int r6 = (int) r1
            r0.width = r6
            r0.height = r6
            android.widget.ImageView r6 = r5.f
            r6.setLayoutParams(r0)
            java.lang.String r6 = r7.j()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L31
            xyz.adscope.common.v2.image.loader.ImageLoader r6 = xyz.adscope.common.v2.image.loader.ImageLoader.getInstance()
            android.widget.ImageView r0 = r5.f
            java.lang.String r7 = r7.j()
            r1 = 0
            r6.loadPermanentImage(r0, r7, r1)
        L31:
            return
    }

    private void a(android.widget.TextView r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto La
            r2.setText(r3)
            return
        La:
            r3 = 8
            r2.setVisibility(r3)
            return
    }

    private void a(java.util.List<android.animation.Animator> r5, float r6, float r7) {
            r4 = this;
            android.widget.ImageView r0 = r4.f     // Catch: java.lang.Exception -> L1a
            java.lang.String r1 = "rotation"
            r2 = 2
            float[] r2 = new float[r2]     // Catch: java.lang.Exception -> L1a
            r3 = 0
            r2[r3] = r6     // Catch: java.lang.Exception -> L1a
            r6 = 1
            r2[r6] = r7     // Catch: java.lang.Exception -> L1a
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r0, r1, r2)     // Catch: java.lang.Exception -> L1a
            r7 = 100
            long r0 = (long) r7     // Catch: java.lang.Exception -> L1a
            r6.setDuration(r0)     // Catch: java.lang.Exception -> L1a
            r5.add(r6)     // Catch: java.lang.Exception -> L1a
        L1a:
            return
    }

    static /* synthetic */ void a(xyz.adscope.ad.f6 r0, int r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ void a(xyz.adscope.ad.f6 r0, int r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r2) {
            r0.b(r1, r2)
            return
    }

    private java.lang.String b(java.lang.String r2) {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.b
            if (r0 == 0) goto L1d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            if (r0 == 0) goto L1d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.status.StatusTitleModel r0 = r0.l()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r0 = r1.a(r0)
            java.lang.String r2 = r1.a(r0, r2)
            return r2
        L1d:
            java.lang.String r2 = ""
            return r2
    }

    private void b(int r14, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r15) {
            r13 = this;
            android.widget.RelativeLayout r0 = r13.h
            if (r0 == 0) goto L3e
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            r0.width = r14
            r0.height = r14
            android.widget.RelativeLayout r1 = r13.h
            r1.setLayoutParams(r0)
            java.lang.String r0 = r15.c()
            boolean r0 = xyz.adscope.common.v2.tool.str.StringUtil.isValidColor(r0)
            if (r0 == 0) goto L2f
            android.content.Context r1 = r13.getContext()
            android.widget.RelativeLayout r2 = r13.h
            java.lang.String r3 = r15.c()
            int r6 = r14 / 2
            r4 = 0
            r5 = 0
            xyz.adscope.ad.q6.a(r1, r2, r3, r4, r5, r6)
            return
        L2f:
            android.content.Context r7 = r13.getContext()
            android.widget.RelativeLayout r8 = r13.h
            int r12 = r14 / 2
            r10 = 0
            r11 = 0
            java.lang.String r9 = "#66333333"
            xyz.adscope.ad.q6.a(r7, r8, r9, r10, r11, r12)
        L3e:
            return
    }

    static /* synthetic */ void b(xyz.adscope.ad.f6 r0, int r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r2) {
            r0.a(r1, r2)
            return
    }

    private java.lang.String c(java.lang.String r2) {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.b
            if (r0 == 0) goto L1d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            if (r0 == 0) goto L1d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.status.StatusTitleModel r0 = r0.k()
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel r0 = r1.a(r0)
            java.lang.String r2 = r1.a(r0, r2)
            return r2
        L1d:
            java.lang.String r2 = ""
            return r2
    }

    private void d(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = r2.b(r3)
            java.lang.String r3 = r2.c(r3)
            android.widget.TextView r1 = r2.k
            r2.a(r1, r0)
            android.widget.TextView r0 = r2.l
            r2.a(r0, r3)
            return
    }

    private void f() {
            r3 = this;
            android.animation.AnimatorSet r0 = r3.i     // Catch: java.lang.Exception -> Lb
            if (r0 == 0) goto Ld
            boolean r0 = r0.isRunning()     // Catch: java.lang.Exception -> Lb
            if (r0 == 0) goto Ld
            goto L42
        Lb:
            r0 = move-exception
            goto L43
        Ld:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb
            r0.<init>()     // Catch: java.lang.Exception -> Lb
            r1 = 0
            r2 = 1106247680(0x41f00000, float:30.0)
            r3.a(r0, r1, r2)     // Catch: java.lang.Exception -> Lb
            r3.a(r0, r2, r1)     // Catch: java.lang.Exception -> Lb
            r2 = -1041235968(0xffffffffc1f00000, float:-30.0)
            r3.a(r0, r1, r2)     // Catch: java.lang.Exception -> Lb
            r3.a(r0, r2, r1)     // Catch: java.lang.Exception -> Lb
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> Lb
            if (r1 != 0) goto L42
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet     // Catch: java.lang.Exception -> Lb
            r1.<init>()     // Catch: java.lang.Exception -> Lb
            r3.i = r1     // Catch: java.lang.Exception -> Lb
            xyz.adscope.ad.r4 r2 = new xyz.adscope.ad.r4     // Catch: java.lang.Exception -> Lb
            r2.<init>(r1)     // Catch: java.lang.Exception -> Lb
            r1.addListener(r2)     // Catch: java.lang.Exception -> Lb
            android.animation.AnimatorSet r1 = r3.i     // Catch: java.lang.Exception -> Lb
            r1.playSequentially(r0)     // Catch: java.lang.Exception -> Lb
            android.animation.AnimatorSet r0 = r3.i     // Catch: java.lang.Exception -> Lb
            r0.start()     // Catch: java.lang.Exception -> Lb
        L42:
            return
        L43:
            xyz.adscope.common.v2.log.SDKLog.stack(r0)
            return
    }

    private void g() {
            r3 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r3.b
            if (r0 == 0) goto L14
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            if (r0 == 0) goto L14
            android.widget.RelativeLayout r1 = r3.h
            xyz.adscope.ad.f6$a r2 = new xyz.adscope.ad.f6$a
            r2.<init>(r3, r0)
            r1.post(r2)
        L14:
            return
    }

    private void h() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = xyz.adscope.amps.R.layout.asnp_interaction_shake_view
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            r2 = 13
            r1.addRule(r2)
            r3.addView(r0, r1)
            int r1 = xyz.adscope.amps.R.id.adscope_isv_container_rl
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r3.h = r1
            int r1 = xyz.adscope.amps.R.id.adscope_isv_img_iv
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r3.f = r1
            int r1 = xyz.adscope.amps.R.id.adscope_isv_indicate_arrow_view
            android.view.View r1 = r0.findViewById(r1)
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r1 = (xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView) r1
            r3.g = r1
            int r1 = xyz.adscope.amps.R.id.adscope_isv_title
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3.k = r1
            int r1 = xyz.adscope.amps.R.id.adscope_isv_sub_title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.l = r0
            return
    }

    private void i() {
            r8 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r8.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            if (r0 == 0) goto L65
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r8.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            java.lang.String r0 = r0.o()
            boolean r1 = xyz.adscope.common.v2.tool.str.StringUtil.isValidColor(r0)
            if (r1 != 0) goto L1a
            java.lang.String r0 = "#FFFFFFFF"
        L1a:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r1 = r8.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r1 = r1.f()
            int r1 = r1.i()
            if (r1 != 0) goto L28
            r1 = 20
        L28:
            android.widget.TextView r2 = r8.k
            r3 = 1084227584(0x40a00000, float:5.0)
            java.lang.String r4 = "#8C000000"
            r5 = 2
            r6 = 1082130432(0x40800000, float:4.0)
            if (r2 == 0) goto L49
            int r7 = android.graphics.Color.parseColor(r0)
            r2.setTextColor(r7)
            android.widget.TextView r2 = r8.k
            float r7 = (float) r1
            r2.setTextSize(r5, r7)
            android.widget.TextView r2 = r8.k
            int r7 = android.graphics.Color.parseColor(r4)
            r2.setShadowLayer(r3, r6, r6, r7)
        L49:
            android.widget.TextView r2 = r8.l
            if (r2 == 0) goto L65
            int r0 = android.graphics.Color.parseColor(r0)
            r2.setTextColor(r0)
            android.widget.TextView r0 = r8.l
            int r1 = r1 + (-4)
            float r1 = (float) r1
            r0.setTextSize(r5, r1)
            android.widget.TextView r0 = r8.l
            int r1 = android.graphics.Color.parseColor(r4)
            r0.setShadowLayer(r3, r6, r6, r1)
        L65:
            return
    }

    private void j() {
            r2 = this;
            android.animation.AnimatorSet r0 = r2.i
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            r2.i = r0
        La:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r2.i = r0
            xyz.adscope.ad.r4 r1 = new xyz.adscope.ad.r4
            r1.<init>(r0)
            r0.addListener(r1)
            return
    }

    @Override // xyz.adscope.ad.c4
    public void a(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.m
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Ld
            r1.m = r2
            r1.d(r2)
        Ld:
            return
    }

    @Override // xyz.adscope.ad.n6, xyz.adscope.ad.b4
    public void a(xyz.adscope.ad.b4.a r2) {
            r1 = this;
            r0 = 0
            r1.setBackgroundColor(r0)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.b
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.a()
            r2.b(r0)
        Lf:
            return
    }

    @Override // xyz.adscope.ad.n6, xyz.adscope.ad.b4
    public void b() {
            r2 = this;
            super.b()
            r2.j()
            xyz.adscope.ad.i3 r0 = r2.e
            if (r0 == 0) goto L13
            boolean r1 = r0 instanceof xyz.adscope.ad.p6
            if (r1 == 0) goto L13
            xyz.adscope.ad.p6 r0 = (xyz.adscope.ad.p6) r0
            r0.j()
        L13:
            return
    }

    @Override // xyz.adscope.ad.n6, xyz.adscope.ad.b4
    public void c() {
            r2 = this;
            super.c()
            r2.f()
            xyz.adscope.ad.i3 r0 = r2.e
            if (r0 == 0) goto L13
            boolean r1 = r0 instanceof xyz.adscope.ad.p6
            if (r1 == 0) goto L13
            xyz.adscope.ad.p6 r0 = (xyz.adscope.ad.p6) r0
            r0.i()
        L13:
            return
    }

    @Override // xyz.adscope.ad.a6, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0.h()
            r0.g()
            r0.i()
            r0.f()
            return
    }

    @Override // xyz.adscope.ad.a6, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            android.animation.AnimatorSet r0 = r1.i
            if (r0 == 0) goto Ld
            r0.cancel()
            r0 = 0
            r1.i = r0
        Ld:
            return
    }

    public void setMaxProgress(int r4) {
            r3 = this;
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r0 = r3.g
            if (r0 == 0) goto L8
            double r1 = (double) r4
            r0.setMaxProgress(r1)
        L8:
            return
    }

    public void setProgress(int r4) {
            r3 = this;
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r0 = r3.g
            if (r0 == 0) goto L8
            double r1 = (double) r4
            r0.setCurrentProgress(r1)
        L8:
            return
    }

    @Override // xyz.adscope.ad.c4
    public void setRenderWithDownload(boolean r1) {
            r0 = this;
            r0.j = r1
            return
    }
}
