package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class g6 extends xyz.adscope.ad.a6 implements xyz.adscope.ad.c4 {
    private android.widget.ImageView f;
    private android.widget.ImageView g;
    private xyz.adscope.ad.k6 h;
    private android.widget.TextView i;
    private android.widget.TextView j;
    private java.lang.String k;
    private boolean l;
    private android.widget.RelativeLayout m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ xyz.adscope.ad.g6 a;

        a(xyz.adscope.ad.g6 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                xyz.adscope.ad.g6 r0 = r2.a
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                xyz.adscope.ad.g6 r1 = r2.a
                xyz.adscope.ad.g6.a(r1, r0)
                xyz.adscope.ad.g6 r0 = r2.a
                xyz.adscope.ad.g6.a(r0)
                xyz.adscope.ad.g6 r0 = r2.a
                xyz.adscope.ad.g6.b(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b extends xyz.adscope.ad.k6 {
        private final java.lang.String b;
        final /* synthetic */ xyz.adscope.ad.g6 c;

        public b(xyz.adscope.ad.g6 r3, int r4, int r5, java.lang.String r6) {
                r2 = this;
                r2.c = r3
                r0 = 1000(0x3e8, double:4.94E-321)
                r2.<init>(r4, r5, r0)
                r2.b = r6
                r3 = -1
                r4 = 1
                r2.a(r3, r4)
                return
        }

        @Override // xyz.adscope.ad.k6
        protected void a(android.animation.ValueAnimator r5) {
                r4 = this;
                java.lang.Object r5 = r5.getAnimatedValue()
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                xyz.adscope.ad.g6 r0 = r4.c
                android.widget.ImageView r0 = xyz.adscope.ad.g6.c(r0)
                if (r0 == 0) goto L9b
                xyz.adscope.ad.g6 r0 = r4.c
                android.widget.ImageView r0 = xyz.adscope.ad.g6.d(r0)
                if (r0 == 0) goto L9b
                xyz.adscope.ad.g6 r0 = r4.c
                android.widget.ImageView r0 = xyz.adscope.ad.g6.c(r0)
                xyz.adscope.ad.g6 r1 = r4.c
                android.widget.ImageView r1 = xyz.adscope.ad.g6.c(r1)
                int r1 = r1.getTop()
                xyz.adscope.ad.g6 r2 = r4.c
                android.widget.ImageView r2 = xyz.adscope.ad.g6.c(r2)
                int r2 = r2.getWidth()
                int r2 = r2 + r5
                xyz.adscope.ad.g6 r3 = r4.c
                android.widget.ImageView r3 = xyz.adscope.ad.g6.c(r3)
                int r3 = r3.getBottom()
                r0.layout(r5, r1, r2, r3)
                java.lang.String r0 = r4.b
                java.lang.String r1 = "slideleft"
                boolean r0 = r1.equalsIgnoreCase(r0)
                if (r0 == 0) goto L74
                xyz.adscope.ad.g6 r0 = r4.c
                android.widget.ImageView r0 = xyz.adscope.ad.g6.d(r0)
                xyz.adscope.ad.g6 r1 = r4.c
                android.widget.ImageView r1 = xyz.adscope.ad.g6.d(r1)
                int r1 = r1.getTop()
                xyz.adscope.ad.g6 r2 = r4.c
                android.widget.ImageView r2 = xyz.adscope.ad.g6.d(r2)
                int r2 = r2.getRight()
                xyz.adscope.ad.g6 r3 = r4.c
                android.widget.ImageView r3 = xyz.adscope.ad.g6.d(r3)
                int r3 = r3.getBottom()
                r0.layout(r5, r1, r2, r3)
                return
            L74:
                xyz.adscope.ad.g6 r0 = r4.c
                android.widget.ImageView r0 = xyz.adscope.ad.g6.d(r0)
                xyz.adscope.ad.g6 r1 = r4.c
                android.widget.ImageView r1 = xyz.adscope.ad.g6.d(r1)
                int r1 = r1.getLeft()
                xyz.adscope.ad.g6 r2 = r4.c
                android.widget.ImageView r2 = xyz.adscope.ad.g6.d(r2)
                int r2 = r2.getTop()
                xyz.adscope.ad.g6 r3 = r4.c
                android.widget.ImageView r3 = xyz.adscope.ad.g6.d(r3)
                int r3 = r3.getBottom()
                r0.layout(r1, r2, r5, r3)
            L9b:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c extends xyz.adscope.ad.k6 {
        private final java.lang.String b;
        final /* synthetic */ xyz.adscope.ad.g6 c;

        private c(xyz.adscope.ad.g6 r3, int r4, int r5, java.lang.String r6) {
                r2 = this;
                r2.c = r3
                r0 = 1000(0x3e8, double:4.94E-321)
                r2.<init>(r4, r5, r0)
                r2.b = r6
                r3 = -1
                r4 = 1
                r2.a(r3, r4)
                return
        }

        /* synthetic */ c(xyz.adscope.ad.g6 r1, int r2, int r3, java.lang.String r4, xyz.adscope.ad.g6.a r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // xyz.adscope.ad.k6
        protected void a(android.animation.ValueAnimator r5) {
                r4 = this;
                java.lang.Object r5 = r5.getAnimatedValue()
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                xyz.adscope.ad.g6 r0 = r4.c
                android.widget.ImageView r0 = xyz.adscope.ad.g6.c(r0)
                if (r0 == 0) goto L9b
                xyz.adscope.ad.g6 r0 = r4.c
                android.widget.ImageView r0 = xyz.adscope.ad.g6.d(r0)
                if (r0 == 0) goto L9b
                xyz.adscope.ad.g6 r0 = r4.c
                android.widget.ImageView r0 = xyz.adscope.ad.g6.c(r0)
                xyz.adscope.ad.g6 r1 = r4.c
                android.widget.ImageView r1 = xyz.adscope.ad.g6.c(r1)
                int r1 = r1.getLeft()
                xyz.adscope.ad.g6 r2 = r4.c
                android.widget.ImageView r2 = xyz.adscope.ad.g6.c(r2)
                int r2 = r2.getRight()
                xyz.adscope.ad.g6 r3 = r4.c
                android.widget.ImageView r3 = xyz.adscope.ad.g6.c(r3)
                int r3 = r3.getHeight()
                int r3 = r3 + r5
                r0.layout(r1, r5, r2, r3)
                java.lang.String r0 = r4.b
                java.lang.String r1 = "slideup"
                boolean r0 = r1.equalsIgnoreCase(r0)
                if (r0 == 0) goto L74
                xyz.adscope.ad.g6 r0 = r4.c
                android.widget.ImageView r0 = xyz.adscope.ad.g6.d(r0)
                xyz.adscope.ad.g6 r1 = r4.c
                android.widget.ImageView r1 = xyz.adscope.ad.g6.d(r1)
                int r1 = r1.getLeft()
                xyz.adscope.ad.g6 r2 = r4.c
                android.widget.ImageView r2 = xyz.adscope.ad.g6.d(r2)
                int r2 = r2.getRight()
                xyz.adscope.ad.g6 r3 = r4.c
                android.widget.ImageView r3 = xyz.adscope.ad.g6.d(r3)
                int r3 = r3.getBottom()
                r0.layout(r1, r5, r2, r3)
                return
            L74:
                xyz.adscope.ad.g6 r0 = r4.c
                android.widget.ImageView r0 = xyz.adscope.ad.g6.d(r0)
                xyz.adscope.ad.g6 r1 = r4.c
                android.widget.ImageView r1 = xyz.adscope.ad.g6.d(r1)
                int r1 = r1.getLeft()
                xyz.adscope.ad.g6 r2 = r4.c
                android.widget.ImageView r2 = xyz.adscope.ad.g6.d(r2)
                int r2 = r2.getTop()
                xyz.adscope.ad.g6 r3 = r4.c
                android.widget.ImageView r3 = xyz.adscope.ad.g6.d(r3)
                int r3 = r3.getRight()
                r0.layout(r1, r2, r3, r5)
            L9b:
                return
        }
    }

    public g6(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private int a(android.widget.TextView r3) {
            r2 = this;
            if (r3 == 0) goto L13
            int r0 = r3.getVisibility()
            r1 = 8
            if (r0 == r1) goto L13
            android.content.Context r0 = r2.getContext()
            int r3 = xyz.adscope.ad.c5.a.a(r0, r3)
            return r3
        L13:
            r3 = 0
            return r3
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
            boolean r0 = r1.l
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

    private void a(android.view.ViewGroup.LayoutParams r3) {
            r2 = this;
            if (r3 == 0) goto L8e
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r2.b
            if (r0 == 0) goto L8e
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.interaction.InteractionModel r0 = r0.b()
            if (r0 == 0) goto L8e
            int r0 = r3.height
            android.widget.TextView r1 = r2.i
            int r1 = r2.a(r1)
            int r0 = r0 - r1
            android.widget.TextView r1 = r2.j
            int r1 = r2.a(r1)
            int r0 = r0 - r1
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r1 = r2.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r1 = r1.f()
            java.lang.String r1 = r1.a()
            r2.k = r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L32
            java.lang.String r1 = "slideup"
            r2.k = r1
        L32:
            android.widget.RelativeLayout r1 = r2.m
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            int r3 = r3.width
            r1.width = r3
            r1.height = r0
            java.lang.String r3 = r2.k
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L89
            java.lang.String r3 = r2.k
            boolean r3 = r2.c(r3)
            if (r3 == 0) goto L5f
            java.lang.String r3 = r2.k
            java.lang.String r0 = "slidedown"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L5f
            android.widget.ImageView r3 = r2.f
            r0 = 1127481344(0x43340000, float:180.0)
            r3.setRotation(r0)
        L5f:
            java.lang.String r3 = r2.k
            boolean r3 = r2.b(r3)
            if (r3 == 0) goto L89
            java.lang.String r3 = r2.k
            java.lang.String r0 = "slideright"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L78
            android.widget.ImageView r3 = r2.f
            r0 = 1119092736(0x42b40000, float:90.0)
            r3.setRotation(r0)
        L78:
            java.lang.String r3 = r2.k
            java.lang.String r0 = "slideleft"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L89
            android.widget.ImageView r3 = r2.f
            r0 = 1132920832(0x43870000, float:270.0)
            r3.setRotation(r0)
        L89:
            android.widget.RelativeLayout r3 = r2.m
            r3.setLayoutParams(r1)
        L8e:
            return
    }

    static /* synthetic */ void a(xyz.adscope.ad.g6 r0) {
            r0.f()
            return
    }

    static /* synthetic */ void a(xyz.adscope.ad.g6 r0, android.view.ViewGroup.LayoutParams r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ void b(xyz.adscope.ad.g6 r0) {
            r0.j()
            return
    }

    private boolean b(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "slideleft"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L13
            java.lang.String r0 = "slideright"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    static /* synthetic */ android.widget.ImageView c(xyz.adscope.ad.g6 r0) {
            android.widget.ImageView r0 = r0.g
            return r0
    }

    private boolean c(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "slidedown"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L13
            java.lang.String r0 = "slideup"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    static /* synthetic */ android.widget.ImageView d(xyz.adscope.ad.g6 r0) {
            android.widget.ImageView r0 = r0.f
            return r0
    }

    private java.lang.String d(java.lang.String r2) {
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

    private java.lang.String e(java.lang.String r2) {
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

    private void f() {
            r15 = this;
            java.lang.String r0 = r15.k
            int r1 = r0.hashCode()
            r2 = -2119261172(0xffffffff81aea40c, float:-6.41529E-38)
            r3 = 2
            java.lang.String r4 = "slideup"
            java.lang.String r5 = "slidedown"
            java.lang.String r6 = "slideleft"
            r7 = 1
            java.lang.String r8 = "slideright"
            if (r1 == r2) goto L3d
            r2 = -795991597(0xffffffffd08e21d3, float:-1.907665E10)
            if (r1 == r2) goto L35
            r2 = -795763400(0xffffffffd0919d38, float:-1.9543998E10)
            if (r1 == r2) goto L2d
            r2 = 1106799371(0x41f86b0b, float:31.052267)
            if (r1 == r2) goto L25
            goto L45
        L25:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L45
            r0 = 1
            goto L46
        L2d:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L45
            r0 = 0
            goto L46
        L35:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L45
            r0 = 3
            goto L46
        L3d:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L45
            r0 = 2
            goto L46
        L45:
            r0 = -1
        L46:
            if (r0 == 0) goto L89
            if (r0 == r7) goto L76
            if (r0 == r3) goto L62
            android.widget.ImageView r0 = r15.f
            int r0 = r0.getTop()
            android.widget.ImageView r1 = r15.f
            int r1 = r1.getBottom()
            android.widget.ImageView r2 = r15.g
            int r2 = r2.getHeight()
        L5e:
            int r1 = r1 - r2
        L5f:
            r11 = r0
            r12 = r1
            goto L9d
        L62:
            android.widget.ImageView r0 = r15.f
            int r0 = r0.getBottom()
            android.widget.ImageView r1 = r15.g
            int r1 = r1.getHeight()
            int r0 = r0 - r1
            android.widget.ImageView r1 = r15.f
            int r1 = r1.getTop()
            goto L5f
        L76:
            android.widget.ImageView r0 = r15.f
            int r0 = r0.getLeft()
            android.widget.ImageView r1 = r15.f
            int r1 = r1.getRight()
            android.widget.ImageView r2 = r15.g
            int r2 = r2.getWidth()
            goto L5e
        L89:
            android.widget.ImageView r0 = r15.f
            int r0 = r0.getRight()
            android.widget.ImageView r1 = r15.g
            int r1 = r1.getWidth()
            int r0 = r0 - r1
            android.widget.ImageView r1 = r15.f
            int r1 = r1.getLeft()
            goto L5f
        L9d:
            java.lang.String r0 = r15.k
            boolean r0 = r6.equalsIgnoreCase(r0)
            if (r0 != 0) goto Lad
            java.lang.String r0 = r15.k
            boolean r0 = r8.equalsIgnoreCase(r0)
            if (r0 == 0) goto Lb6
        Lad:
            xyz.adscope.ad.g6$b r0 = new xyz.adscope.ad.g6$b
            java.lang.String r1 = r15.k
            r0.<init>(r15, r11, r12, r1)
            r15.h = r0
        Lb6:
            java.lang.String r0 = r15.k
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto Lc8
            java.lang.String r0 = r15.k
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto Lc7
            goto Lc8
        Lc7:
            return
        Lc8:
            xyz.adscope.ad.g6$c r9 = new xyz.adscope.ad.g6$c
            java.lang.String r13 = r15.k
            r14 = 0
            r10 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            r10.h = r9
            return
    }

    private void g() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = xyz.adscope.amps.R.layout.asnp_interaction_slide_view
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            r2 = 14
            r1.addRule(r2)
            r3.addView(r0, r1)
            int r1 = xyz.adscope.amps.R.id.guild_layout
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r3.m = r1
            int r1 = xyz.adscope.amps.R.id.slide_basic_line
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r3.f = r1
            int r1 = xyz.adscope.amps.R.id.slide_guide_icon
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r3.g = r1
            int r1 = xyz.adscope.amps.R.id.main_title
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3.i = r1
            int r1 = xyz.adscope.amps.R.id.sub_title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.j = r0
            return
    }

    private void h() {
            r1 = this;
            xyz.adscope.ad.k6 r0 = r1.h
            if (r0 == 0) goto L7
            r0.b()
        L7:
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
            android.widget.TextView r2 = r8.i
            r3 = 1084227584(0x40a00000, float:5.0)
            java.lang.String r4 = "#8C000000"
            r5 = 2
            r6 = 1082130432(0x40800000, float:4.0)
            if (r2 == 0) goto L49
            int r7 = android.graphics.Color.parseColor(r0)
            r2.setTextColor(r7)
            android.widget.TextView r2 = r8.i
            float r7 = (float) r1
            r2.setTextSize(r5, r7)
            android.widget.TextView r2 = r8.i
            int r7 = android.graphics.Color.parseColor(r4)
            r2.setShadowLayer(r3, r6, r6, r7)
        L49:
            android.widget.TextView r2 = r8.j
            if (r2 == 0) goto L65
            int r0 = android.graphics.Color.parseColor(r0)
            r2.setTextColor(r0)
            android.widget.TextView r0 = r8.j
            int r1 = r1 + (-4)
            float r1 = (float) r1
            r0.setTextSize(r5, r1)
            android.widget.TextView r0 = r8.j
            int r1 = android.graphics.Color.parseColor(r4)
            r0.setShadowLayer(r3, r6, r6, r1)
        L65:
            return
    }

    private void j() {
            r1 = this;
            xyz.adscope.ad.k6 r0 = r1.h
            if (r0 == 0) goto L7
            r0.c()
        L7:
            return
    }

    private void k() {
            r4 = this;
            java.lang.String r0 = "Normal"
            java.lang.String r1 = r4.d(r0)
            android.widget.TextView r2 = r4.i
            r3 = 8
            if (r2 == 0) goto L1d
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L18
            android.widget.TextView r2 = r4.i
            r2.setText(r1)
            goto L1d
        L18:
            android.widget.TextView r1 = r4.i
            r1.setVisibility(r3)
        L1d:
            java.lang.String r0 = r4.e(r0)
            android.widget.TextView r1 = r4.j
            if (r1 == 0) goto L36
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L31
            android.widget.TextView r1 = r4.j
            r1.setText(r0)
            return
        L31:
            android.widget.TextView r0 = r4.j
            r0.setVisibility(r3)
        L36:
            return
    }

    @Override // xyz.adscope.ad.c4
    public void a(java.lang.String r1) {
            r0 = this;
            r0.k()
            return
    }

    @Override // xyz.adscope.ad.n6, xyz.adscope.ad.b4
    public void a(xyz.adscope.ad.b4.a r1) {
            r0 = this;
            super.a(r1)
            return
    }

    @Override // xyz.adscope.ad.n6, xyz.adscope.ad.b4
    public void b() {
            r0 = this;
            super.b()
            r0.h()
            return
    }

    @Override // xyz.adscope.ad.n6, xyz.adscope.ad.b4
    public void c() {
            r0 = this;
            super.c()
            r0.j()
            return
    }

    @Override // xyz.adscope.ad.a6, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r1.g()
            r1.i()
            r1.k()
            xyz.adscope.ad.g6$a r0 = new xyz.adscope.ad.g6$a
            r0.<init>(r1)
            r1.post(r0)
            return
    }

    @Override // xyz.adscope.ad.c4
    public void setRenderWithDownload(boolean r1) {
            r0 = this;
            r0.l = r1
            return
    }
}
