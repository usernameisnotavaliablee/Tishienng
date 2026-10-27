package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class w5 extends xyz.adscope.ad.a6 implements xyz.adscope.ad.c4 {
    private final java.lang.String f;
    private final java.lang.String g;
    private final java.lang.String h;
    private android.widget.RelativeLayout i;
    private android.widget.ImageView j;
    private xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView k;
    private android.widget.LinearLayout l;
    private android.widget.TextView m;
    private android.widget.TextView n;
    private android.animation.AnimatorSet o;
    private boolean p;
    private java.lang.Object q;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel a;
        final /* synthetic */ xyz.adscope.ad.w5 b;

        a(xyz.adscope.ad.w5 r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                xyz.adscope.ad.w5 r0 = r8.b
                android.widget.RelativeLayout r0 = xyz.adscope.ad.w5.a(r0)
                int r0 = r0.getMeasuredHeight()
                xyz.adscope.ad.w5 r1 = r8.b
                android.widget.RelativeLayout r1 = xyz.adscope.ad.w5.a(r1)
                int r1 = r1.getMeasuredWidth()
                int r0 = java.lang.Math.min(r0, r1)
                xyz.adscope.ad.w5 r1 = r8.b
                android.content.Context r2 = r1.getContext()
                xyz.adscope.ad.w5 r1 = r8.b
                android.widget.RelativeLayout r3 = xyz.adscope.ad.w5.a(r1)
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
                xyz.adscope.ad.w5 r1 = r8.b
                xyz.adscope.ad.w5.a(r1, r0)
                xyz.adscope.ad.w5 r1 = r8.b
                xyz.adscope.ad.w5.b(r1, r0)
                xyz.adscope.ad.w5 r1 = r8.b
                xyz.adscope.ad.w5.c(r1, r0)
                return
        }
    }

    public w5(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = "rotationX"
            r0.f = r1
            java.lang.String r1 = "rotationY"
            r0.g = r1
            java.lang.String r1 = "rotation"
            r0.h = r1
            java.lang.String r1 = ""
            r0.q = r1
            return
    }

    static /* synthetic */ android.widget.RelativeLayout a(xyz.adscope.ad.w5 r0) {
            android.widget.RelativeLayout r0 = r0.i
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

    private java.util.List<android.animation.Animator> a(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L4f
            java.lang.String r0 = "rotationX"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto Lf
            goto L17
        Lf:
            java.lang.String r0 = "rotationY"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L1a
        L17:
            r0 = 1114636288(0x42700000, float:60.0)
            goto L1c
        L1a:
            r0 = 1106247680(0x41f00000, float:30.0)
        L1c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "2"
            boolean r2 = r2.equalsIgnoreCase(r5)
            r3 = 0
            if (r2 == 0) goto L32
            float r5 = -r0
            r4.a(r1, r6, r3, r5)
            r4.a(r1, r6, r5, r3)
            return r1
        L32:
            java.lang.String r2 = "1"
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L41
            r4.a(r1, r6, r3, r0)
            r4.a(r1, r6, r0, r3)
            return r1
        L41:
            r4.a(r1, r6, r3, r0)
            r4.a(r1, r6, r0, r3)
            float r5 = -r0
            r4.a(r1, r6, r3, r5)
            r4.a(r1, r6, r5, r3)
            return r1
        L4f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            return r5
    }

    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.form.par.StatusParamModel a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.status.StatusTitleModel r2) {
            r1 = this;
            if (r2 == 0) goto L10
            boolean r0 = r1.p
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
            android.widget.ImageView r0 = r5.j
            if (r0 == 0) goto L21
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            double r1 = (double) r6
            r3 = 4599976659396224614(0x3fd6666666666666, double:0.35)
            double r3 = r3 * r1
            int r6 = (int) r3
            r0.width = r6
            r3 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r1 = r1 * r3
            int r6 = (int) r1
            r0.height = r6
            android.widget.ImageView r6 = r5.j
            r6.setLayoutParams(r0)
        L21:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r6 = r5.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r6 = r6.f()
            java.lang.String r6 = r6.j()
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L3b
            xyz.adscope.common.v2.image.loader.ImageLoader r0 = xyz.adscope.common.v2.image.loader.ImageLoader.getInstance()
            android.widget.ImageView r1 = r5.j
            r2 = 0
            r0.loadPermanentImage(r1, r6, r2)
        L3b:
            return
    }

    private void a(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            java.lang.String r0 = "2"
            java.lang.String r1 = "1"
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r2 = r3.k     // Catch: java.lang.Exception -> L71
            if (r2 != 0) goto L9
            goto L71
        L9:
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L71
            r2 = 0
            if (r4 != 0) goto L16
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r4 = r3.k     // Catch: java.lang.Exception -> L71
            r4.setArrowDirection(r2)     // Catch: java.lang.Exception -> L71
            return
        L16:
            boolean r4 = r1.equals(r5)     // Catch: java.lang.Exception -> L71
            if (r4 == 0) goto L22
            boolean r4 = r1.equals(r6)     // Catch: java.lang.Exception -> L71
            if (r4 != 0) goto L3a
        L22:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L71
            if (r4 == 0) goto L2e
            boolean r4 = r1.equals(r6)     // Catch: java.lang.Exception -> L71
            if (r4 != 0) goto L3a
        L2e:
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L71
            if (r4 == 0) goto L41
            boolean r4 = r1.equals(r5)     // Catch: java.lang.Exception -> L71
            if (r4 == 0) goto L41
        L3a:
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r4 = r3.k     // Catch: java.lang.Exception -> L71
            r5 = 1
            r4.setArrowDirection(r5)     // Catch: java.lang.Exception -> L71
            return
        L41:
            boolean r4 = r0.equals(r5)     // Catch: java.lang.Exception -> L71
            if (r4 == 0) goto L4d
            boolean r4 = r0.equals(r6)     // Catch: java.lang.Exception -> L71
            if (r4 != 0) goto L65
        L4d:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L71
            if (r4 == 0) goto L59
            boolean r4 = r0.equals(r6)     // Catch: java.lang.Exception -> L71
            if (r4 != 0) goto L65
        L59:
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L71
            if (r4 == 0) goto L6c
            boolean r4 = r0.equals(r5)     // Catch: java.lang.Exception -> L71
            if (r4 == 0) goto L6c
        L65:
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r4 = r3.k     // Catch: java.lang.Exception -> L71
            r5 = 2
            r4.setArrowDirection(r5)     // Catch: java.lang.Exception -> L71
            return
        L6c:
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r4 = r3.k     // Catch: java.lang.Exception -> L71
            r4.setArrowDirection(r2)     // Catch: java.lang.Exception -> L71
        L71:
            return
    }

    private void a(java.util.List<android.animation.Animator> r4, java.lang.String r5, float r6, float r7) {
            r3 = this;
            android.widget.ImageView r0 = r3.j     // Catch: java.lang.Exception -> L18
            r1 = 2
            float[] r1 = new float[r1]     // Catch: java.lang.Exception -> L18
            r2 = 0
            r1[r2] = r6     // Catch: java.lang.Exception -> L18
            r6 = 1
            r1[r6] = r7     // Catch: java.lang.Exception -> L18
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r0, r5, r1)     // Catch: java.lang.Exception -> L18
            r6 = 350(0x15e, float:4.9E-43)
            long r6 = (long) r6     // Catch: java.lang.Exception -> L18
            r5.setDuration(r6)     // Catch: java.lang.Exception -> L18
            r4.add(r5)     // Catch: java.lang.Exception -> L18
        L18:
            return
    }

    static /* synthetic */ void a(xyz.adscope.ad.w5 r0, int r1) {
            r0.c(r1)
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

    private void b(int r6) {
            r5 = this;
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r0 = r5.k     // Catch: java.lang.Exception -> L44
            if (r0 != 0) goto L5
            goto L44
        L5:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r5.b     // Catch: java.lang.Exception -> L44
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r0.b()     // Catch: java.lang.Exception -> L44
            r1 = 0
            if (r0 == 0) goto L13
            int r0 = r0.f()     // Catch: java.lang.Exception -> L44
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 != 0) goto L1e
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r6 = r5.k     // Catch: java.lang.Exception -> L44
            r0 = 8
            r6.setVisibility(r0)     // Catch: java.lang.Exception -> L44
            return
        L1e:
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r0 = r5.k     // Catch: java.lang.Exception -> L44
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L44
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r0 = r5.k     // Catch: java.lang.Exception -> L44
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Exception -> L44
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0     // Catch: java.lang.Exception -> L44
            double r1 = (double) r6     // Catch: java.lang.Exception -> L44
            r3 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r1 = r1 * r3
            int r1 = (int) r1     // Catch: java.lang.Exception -> L44
            r0.width = r1     // Catch: java.lang.Exception -> L44
            r0.height = r1     // Catch: java.lang.Exception -> L44
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r1 = r5.k     // Catch: java.lang.Exception -> L44
            r1.setLayoutParams(r0)     // Catch: java.lang.Exception -> L44
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r0 = r5.k     // Catch: java.lang.Exception -> L44
            int r6 = r6 / 30
            r0.setLineWidth(r6)     // Catch: java.lang.Exception -> L44
        L44:
            return
    }

    static /* synthetic */ void b(xyz.adscope.ad.w5 r0, int r1) {
            r0.a(r1)
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

    private void c(int r11) {
            r10 = this;
            android.widget.RelativeLayout r0 = r10.i
            if (r0 == 0) goto L3f
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            r0.width = r11
            r0.height = r11
            android.widget.RelativeLayout r1 = r10.i
            r1.setLayoutParams(r0)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r10.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            java.lang.String r3 = r0.c()
            int r6 = r11 / 2
            boolean r11 = xyz.adscope.common.v2.tool.str.StringUtil.isValidColor(r3)
            if (r11 == 0) goto L31
            android.content.Context r1 = r10.getContext()
            android.widget.RelativeLayout r2 = r10.i
            r4 = 0
            r5 = 0
            xyz.adscope.ad.q6.a(r1, r2, r3, r4, r5, r6)
            return
        L31:
            android.content.Context r4 = r10.getContext()
            android.widget.RelativeLayout r5 = r10.i
            r7 = 0
            r8 = 0
            r9 = r6
            java.lang.String r6 = "#66333333"
            xyz.adscope.ad.q6.a(r4, r5, r6, r7, r8, r9)
        L3f:
            return
    }

    static /* synthetic */ void c(xyz.adscope.ad.w5 r0, int r1) {
            r0.b(r1)
            return
    }

    private void d(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = r5.b(r6)
            java.lang.String r6 = r5.c(r6)
            android.widget.LinearLayout r1 = r5.l     // Catch: java.lang.Exception -> L57
            r2 = 0
            if (r1 == 0) goto L10
            r1.setVisibility(r2)     // Catch: java.lang.Exception -> L57
        L10:
            android.widget.TextView r1 = r5.m     // Catch: java.lang.Exception -> L57
            r3 = 1
            r4 = 8
            if (r1 == 0) goto L35
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L57
            if (r1 != 0) goto L35
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L57
            if (r1 != 0) goto L2e
            android.widget.TextView r1 = r5.m     // Catch: java.lang.Exception -> L57
            r1.setVisibility(r2)     // Catch: java.lang.Exception -> L57
            android.widget.TextView r1 = r5.m     // Catch: java.lang.Exception -> L57
            r1.setText(r0)     // Catch: java.lang.Exception -> L57
            goto L35
        L2e:
            android.widget.TextView r0 = r5.m     // Catch: java.lang.Exception -> L57
            r0.setVisibility(r4)     // Catch: java.lang.Exception -> L57
            r0 = 1
            goto L36
        L35:
            r0 = 0
        L36:
            android.widget.TextView r1 = r5.n     // Catch: java.lang.Exception -> L57
            if (r1 == 0) goto L51
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L57
            if (r1 != 0) goto L4b
            android.widget.TextView r1 = r5.n     // Catch: java.lang.Exception -> L57
            r1.setVisibility(r2)     // Catch: java.lang.Exception -> L57
            android.widget.TextView r1 = r5.n     // Catch: java.lang.Exception -> L57
            r1.setText(r6)     // Catch: java.lang.Exception -> L57
            goto L51
        L4b:
            android.widget.TextView r6 = r5.n     // Catch: java.lang.Exception -> L57
            r6.setVisibility(r4)     // Catch: java.lang.Exception -> L57
            goto L52
        L51:
            r3 = r0
        L52:
            if (r3 == 0) goto L57
            r5.f()     // Catch: java.lang.Exception -> L57
        L57:
            return
    }

    private void f() {
            r3 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r3.b
            if (r0 == 0) goto L14
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            if (r0 == 0) goto L14
            android.widget.RelativeLayout r1 = r3.i
            xyz.adscope.ad.w5$a r2 = new xyz.adscope.ad.w5$a
            r2.<init>(r3, r0)
            r1.post(r2)
        L14:
            return
    }

    private void g() {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            int r1 = xyz.adscope.amps.R.layout.asnp_interaction_euler_angle_view
            r2 = 0
            android.view.View r0 = android.view.View.inflate(r0, r1, r2)
            int r1 = xyz.adscope.amps.R.id.adscope_ieav_container_rl
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r4.i = r1
            int r1 = xyz.adscope.amps.R.id.adscope_ieav_img_iv
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r4.j = r1
            int r1 = xyz.adscope.amps.R.id.adscope_ieav_indicate_arrow_view
            android.view.View r1 = r0.findViewById(r1)
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r1 = (xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView) r1
            r4.k = r1
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            r1.setMaxProgress(r2)
            int r1 = xyz.adscope.amps.R.id.adscope_ieav_title_container_ll
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r4.l = r1
            int r1 = xyz.adscope.amps.R.id.adscope_ieav_title_tv
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r4.m = r1
            int r1 = xyz.adscope.amps.R.id.adscope_ieav_subtitle_tv
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r4.n = r1
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r2 = 13
            r1.addRule(r2)
            r4.addView(r0, r1)
            return
    }

    private void h() {
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
            android.widget.TextView r2 = r8.m
            r3 = 1084227584(0x40a00000, float:5.0)
            java.lang.String r4 = "#8C000000"
            r5 = 2
            r6 = 1082130432(0x40800000, float:4.0)
            if (r2 == 0) goto L49
            int r7 = android.graphics.Color.parseColor(r0)
            r2.setTextColor(r7)
            android.widget.TextView r2 = r8.m
            float r7 = (float) r1
            r2.setTextSize(r5, r7)
            android.widget.TextView r2 = r8.m
            int r7 = android.graphics.Color.parseColor(r4)
            r2.setShadowLayer(r3, r6, r6, r7)
        L49:
            android.widget.TextView r2 = r8.n
            if (r2 == 0) goto L65
            int r0 = android.graphics.Color.parseColor(r0)
            r2.setTextColor(r0)
            android.widget.TextView r0 = r8.n
            int r1 = r1 + (-4)
            float r1 = (float) r1
            r0.setTextSize(r5, r1)
            android.widget.TextView r0 = r8.n
            int r1 = android.graphics.Color.parseColor(r4)
            r0.setShadowLayer(r3, r6, r6, r1)
        L65:
            return
    }

    private void i() {
            r2 = this;
            android.animation.AnimatorSet r0 = r2.o
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            r2.o = r0
        La:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r2.o = r0
            xyz.adscope.ad.r4 r1 = new xyz.adscope.ad.r4
            r1.<init>(r0)
            r0.addListener(r1)
            return
    }

    @Override // xyz.adscope.ad.n6, xyz.adscope.ad.b4
    public void a() {
            r1 = this;
            android.animation.AnimatorSet r0 = r1.o
            if (r0 == 0) goto Lc
            r0.cancel()
            android.animation.AnimatorSet r0 = r1.o
            r0.removeAllListeners()
        Lc:
            r0 = 0
            r1.o = r0
            super.a()
            return
    }

    @Override // xyz.adscope.ad.c4
    public void a(java.lang.String r2) {
            r1 = this;
            java.lang.Object r0 = r1.q
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Ld
            r1.q = r2
            r1.d(r2)
        Ld:
            return
    }

    @Override // xyz.adscope.ad.n6, xyz.adscope.ad.b4
    public void a(xyz.adscope.ad.b4.a r2) {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.b
            if (r0 == 0) goto L11
            r0 = 0
            r1.setBackgroundColor(r0)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r1.b
            java.lang.String r0 = r0.a()
            r2.b(r0)
        L11:
            return
    }

    @Override // xyz.adscope.ad.n6, xyz.adscope.ad.b4
    public void b() {
            r2 = this;
            super.b()
            xyz.adscope.ad.i3 r0 = r2.e
            if (r0 == 0) goto L10
            boolean r1 = r0 instanceof xyz.adscope.ad.p6
            if (r1 == 0) goto L10
            xyz.adscope.ad.p6 r0 = (xyz.adscope.ad.p6) r0
            r0.j()
        L10:
            r2.i()
            return
    }

    public void b(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            android.animation.AnimatorSet r0 = r2.o     // Catch: java.lang.Exception -> Lb
            if (r0 == 0) goto Ld
            boolean r0 = r0.isRunning()     // Catch: java.lang.Exception -> Lb
            if (r0 == 0) goto Ld
            goto L4f
        Lb:
            r3 = move-exception
            goto L50
        Ld:
            r2.a(r3, r4, r5)     // Catch: java.lang.Exception -> Lb
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb
            r0.<init>()     // Catch: java.lang.Exception -> Lb
            java.lang.String r1 = "rotationX"
            java.util.List r3 = r2.a(r3, r1)     // Catch: java.lang.Exception -> Lb
            r0.addAll(r3)     // Catch: java.lang.Exception -> Lb
            java.lang.String r3 = "rotationY"
            java.util.List r3 = r2.a(r4, r3)     // Catch: java.lang.Exception -> Lb
            r0.addAll(r3)     // Catch: java.lang.Exception -> Lb
            java.lang.String r3 = "rotation"
            java.util.List r3 = r2.a(r5, r3)     // Catch: java.lang.Exception -> Lb
            r0.addAll(r3)     // Catch: java.lang.Exception -> Lb
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Exception -> Lb
            if (r3 != 0) goto L4f
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet     // Catch: java.lang.Exception -> Lb
            r3.<init>()     // Catch: java.lang.Exception -> Lb
            r2.o = r3     // Catch: java.lang.Exception -> Lb
            xyz.adscope.ad.r4 r4 = new xyz.adscope.ad.r4     // Catch: java.lang.Exception -> Lb
            r4.<init>(r3)     // Catch: java.lang.Exception -> Lb
            r3.addListener(r4)     // Catch: java.lang.Exception -> Lb
            android.animation.AnimatorSet r3 = r2.o     // Catch: java.lang.Exception -> Lb
            r3.playSequentially(r0)     // Catch: java.lang.Exception -> Lb
            android.animation.AnimatorSet r3 = r2.o     // Catch: java.lang.Exception -> Lb
            r3.start()     // Catch: java.lang.Exception -> Lb
        L4f:
            return
        L50:
            xyz.adscope.common.v2.log.SDKLog.stack(r3)
            return
    }

    @Override // xyz.adscope.ad.n6, xyz.adscope.ad.b4
    public void c() {
            r2 = this;
            super.c()
            xyz.adscope.ad.i3 r0 = r2.e
            if (r0 == 0) goto L10
            boolean r1 = r0 instanceof xyz.adscope.ad.p6
            if (r1 == 0) goto L10
            xyz.adscope.ad.p6 r0 = (xyz.adscope.ad.p6) r0
            r0.i()
        L10:
            return
    }

    @Override // xyz.adscope.ad.a6, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0.g()
            r0.h()
            r0.f()
            return
    }

    @Override // xyz.adscope.ad.a6, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            android.animation.AnimatorSet r0 = r1.o
            if (r0 == 0) goto Ld
            r0.cancel()
            r0 = 0
            r1.o = r0
        Ld:
            return
    }

    public void setCurrentProgress(double r2) {
            r1 = this;
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.ScopeIndicateArrowView r0 = r1.k     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.setCurrentProgress(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    @Override // xyz.adscope.ad.c4
    public void setRenderWithDownload(boolean r1) {
            r0 = this;
            r0.p = r1
            return
    }
}
