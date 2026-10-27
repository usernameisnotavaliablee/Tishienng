package com.bytedance.adsdk.ugeno.widget.image;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt extends com.bytedance.adsdk.ugeno.xt.cw<com.bytedance.adsdk.ugeno.widget.image.RoundImageView> {
    protected java.lang.String j;
    protected android.widget.ImageView.ScaleType ll;
    protected boolean oy;
    private float px;
    private int qe;
    private float xw;
    protected java.lang.String yl;





    public xt(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY
            r0.ll = r1
            r1 = -1
            r0.qe = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.px = r1
            r0.xw = r1
            return
    }

    static /* synthetic */ android.view.View ae(com.bytedance.adsdk.ugeno.widget.image.xt r0) {
            T extends android.view.View r0 = r0.up
            return r0
    }

    static /* synthetic */ android.content.Context av(com.bytedance.adsdk.ugeno.widget.image.xt r0) {
            android.content.Context r0 = r0.xt
            return r0
    }

    static /* synthetic */ com.bytedance.adsdk.ugeno.cw.ae az(com.bytedance.adsdk.ugeno.widget.image.xt r0) {
            com.bytedance.adsdk.ugeno.cw.ae r0 = r0.ik
            return r0
    }

    static /* synthetic */ com.bytedance.adsdk.ugeno.cw.ae cw(com.bytedance.adsdk.ugeno.widget.image.xt r0) {
            com.bytedance.adsdk.ugeno.cw.ae r0 = r0.ik
            return r0
    }

    static /* synthetic */ android.content.Context g(com.bytedance.adsdk.ugeno.widget.image.xt r0) {
            android.content.Context r0 = r0.xt
            return r0
    }

    static /* synthetic */ android.content.Context i(com.bytedance.adsdk.ugeno.widget.image.xt r0) {
            android.content.Context r0 = r0.xt
            return r0
    }

    static /* synthetic */ com.bytedance.adsdk.ugeno.cw.ae j(com.bytedance.adsdk.ugeno.widget.image.xt r0) {
            com.bytedance.adsdk.ugeno.cw.ae r0 = r0.ik
            return r0
    }

    static /* synthetic */ com.bytedance.adsdk.ugeno.cw.ae jy(com.bytedance.adsdk.ugeno.widget.image.xt r0) {
            com.bytedance.adsdk.ugeno.cw.ae r0 = r0.ik
            return r0
    }

    static /* synthetic */ float m(com.bytedance.adsdk.ugeno.widget.image.xt r0) {
            float r0 = r0.px
            return r0
    }

    static /* synthetic */ android.view.View mi(com.bytedance.adsdk.ugeno.widget.image.xt r0) {
            T extends android.view.View r0 = r0.up
            return r0
    }

    static /* synthetic */ android.content.Context oq(com.bytedance.adsdk.ugeno.widget.image.xt r0) {
            android.content.Context r0 = r0.xt
            return r0
    }

    private void qb() {
            r3 = this;
            java.lang.String r0 = r3.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L9
            goto L4a
        L9:
            T extends android.view.View r0 = r3.up
            com.bytedance.adsdk.ugeno.widget.image.RoundImageView r0 = (com.bytedance.adsdk.ugeno.widget.image.RoundImageView) r0
            r1 = 0
            r0.setImageDrawable(r1)
            java.lang.String r0 = r3.j
            java.lang.String r1 = "local://"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L4b
            java.lang.String r0 = r3.j     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = r3.ae()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = "raw"
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L3d
            T extends android.view.View r1 = r3.up     // Catch: java.lang.Throwable -> L4a
            com.bytedance.adsdk.ugeno.widget.image.RoundImageView r1 = (com.bytedance.adsdk.ugeno.widget.image.RoundImageView) r1     // Catch: java.lang.Throwable -> L4a
            android.content.Context r2 = r3.xt     // Catch: java.lang.Throwable -> L4a
            int r0 = com.bytedance.adsdk.ugeno.m.r.j(r2, r0)     // Catch: java.lang.Throwable -> L4a
            r1.setImageResource(r0)     // Catch: java.lang.Throwable -> L4a
            return
        L3d:
            T extends android.view.View r1 = r3.up     // Catch: java.lang.Throwable -> L4a
            com.bytedance.adsdk.ugeno.widget.image.RoundImageView r1 = (com.bytedance.adsdk.ugeno.widget.image.RoundImageView) r1     // Catch: java.lang.Throwable -> L4a
            android.content.Context r2 = r3.xt     // Catch: java.lang.Throwable -> L4a
            int r0 = com.bytedance.adsdk.ugeno.m.r.xt(r2, r0)     // Catch: java.lang.Throwable -> L4a
            r1.setImageResource(r0)     // Catch: java.lang.Throwable -> L4a
        L4a:
            return
        L4b:
            java.lang.String r0 = r3.j
            java.lang.String r1 = "@"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L6d
            java.lang.String r0 = r3.j     // Catch: java.lang.Exception -> L68
            r1 = 1
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Exception -> L68
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L68
            T extends android.view.View r1 = r3.up     // Catch: java.lang.Exception -> L68
            com.bytedance.adsdk.ugeno.widget.image.RoundImageView r1 = (com.bytedance.adsdk.ugeno.widget.image.RoundImageView) r1     // Catch: java.lang.Exception -> L68
            r1.setImageResource(r0)     // Catch: java.lang.Exception -> L68
            return
        L68:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
        L6d:
            r3.ya()
            return
    }

    static /* synthetic */ android.view.View qv(com.bytedance.adsdk.ugeno.widget.image.xt r0) {
            T extends android.view.View r0 = r0.up
            return r0
    }

    private android.widget.ImageView.ScaleType qv(java.lang.String r4) {
            r3 = this;
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
            r4.getClass()
            int r1 = r4.hashCode()
            r2 = -1
            switch(r1) {
                case -1364013995: goto L5c;
                case -1274298614: goto L51;
                case -522179887: goto L46;
                case -340708175: goto L3b;
                case 101393: goto L30;
                case 3062416: goto L25;
                case 520762310: goto L1a;
                case 1161480325: goto Lf;
                default: goto Ld;
            }
        Ld:
            goto L66
        Lf:
            java.lang.String r1 = "centerCrop"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L18
            goto L66
        L18:
            r2 = 7
            goto L66
        L1a:
            java.lang.String r1 = "fitCenter"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L23
            goto L66
        L23:
            r2 = 6
            goto L66
        L25:
            java.lang.String r1 = "crop"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L2e
            goto L66
        L2e:
            r2 = 5
            goto L66
        L30:
            java.lang.String r1 = "fit"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L39
            goto L66
        L39:
            r2 = 4
            goto L66
        L3b:
            java.lang.String r1 = "centerInside"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L44
            goto L66
        L44:
            r2 = 3
            goto L66
        L46:
            java.lang.String r1 = "fitStart"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L4f
            goto L66
        L4f:
            r2 = 2
            goto L66
        L51:
            java.lang.String r1 = "fitEnd"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L5a
            goto L66
        L5a:
            r2 = 1
            goto L66
        L5c:
            java.lang.String r1 = "center"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L65
            goto L66
        L65:
            r2 = 0
        L66:
            switch(r2) {
                case 0: goto L79;
                case 1: goto L76;
                case 2: goto L73;
                case 3: goto L70;
                case 4: goto L6d;
                case 5: goto L6a;
                case 6: goto L6d;
                case 7: goto L6a;
                default: goto L69;
            }
        L69:
            return r0
        L6a:
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_CROP
            return r4
        L6d:
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_CENTER
            return r4
        L70:
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            return r4
        L73:
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_START
            return r4
        L76:
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_END
            return r4
        L79:
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER
            return r4
    }

    static /* synthetic */ com.bytedance.adsdk.ugeno.cw.ae r(com.bytedance.adsdk.ugeno.widget.image.xt r0) {
            com.bytedance.adsdk.ugeno.cw.ae r0 = r0.ik
            return r0
    }

    static /* synthetic */ float tl(com.bytedance.adsdk.ugeno.widget.image.xt r0) {
            float r0 = r0.xw
            return r0
    }

    static /* synthetic */ android.content.Context up(com.bytedance.adsdk.ugeno.widget.image.xt r0) {
            android.content.Context r0 = r0.xt
            return r0
    }

    static /* synthetic */ com.bytedance.adsdk.ugeno.cw.ae vl(com.bytedance.adsdk.ugeno.widget.image.xt r0) {
            com.bytedance.adsdk.ugeno.cw.ae r0 = r0.ik
            return r0
    }

    static /* synthetic */ android.view.View w(com.bytedance.adsdk.ugeno.widget.image.xt r0) {
            T extends android.view.View r0 = r0.up
            return r0
    }

    static /* synthetic */ com.bytedance.adsdk.ugeno.cw.ae ws(com.bytedance.adsdk.ugeno.widget.image.xt r0) {
            com.bytedance.adsdk.ugeno.cw.ae r0 = r0.ik
            return r0
    }

    static /* synthetic */ com.bytedance.adsdk.ugeno.cw.ae xt(com.bytedance.adsdk.ugeno.widget.image.xt r0) {
            com.bytedance.adsdk.ugeno.cw.ae r0 = r0.ik
            return r0
    }

    private void ya() {
            r9 = this;
            float r0 = r9.px
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L23
            com.bytedance.adsdk.ugeno.cw.ae r0 = r9.ik
            if (r0 == 0) goto Le
            r0.j()
        Le:
            com.bytedance.adsdk.ugeno.r r0 = com.bytedance.adsdk.ugeno.r.j()
            com.bytedance.adsdk.ugeno.j r0 = r0.xt()
            com.bytedance.adsdk.ugeno.cw.ws r1 = r9.g
            java.lang.String r2 = r9.j
            com.bytedance.adsdk.ugeno.widget.image.xt$1 r3 = new com.bytedance.adsdk.ugeno.widget.image.xt$1
            r3.<init>(r9)
            r0.j(r1, r2, r3)
            return
        L23:
            com.bytedance.adsdk.ugeno.cw.ae r0 = r9.ik
            if (r0 == 0) goto L2a
            r0.j()
        L2a:
            com.bytedance.adsdk.ugeno.r r0 = com.bytedance.adsdk.ugeno.r.j()
            com.bytedance.adsdk.ugeno.j r2 = r0.xt()
            com.bytedance.adsdk.ugeno.cw.ws r3 = r9.g
            java.lang.String r4 = r9.j
            T extends android.view.View r0 = r9.up
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.bytedance.adsdk.ugeno.widget.image.RoundImageView r0 = (com.bytedance.adsdk.ugeno.widget.image.RoundImageView) r0
            int r6 = r0.getWidth()
            T extends android.view.View r0 = r9.up
            com.bytedance.adsdk.ugeno.widget.image.RoundImageView r0 = (com.bytedance.adsdk.ugeno.widget.image.RoundImageView) r0
            int r7 = r0.getHeight()
            com.bytedance.adsdk.ugeno.widget.image.xt$2 r8 = new com.bytedance.adsdk.ugeno.widget.image.xt$2
            r8.<init>(r9)
            r2.j(r3, r4, r5, r6, r7, r8)
            boolean r0 = r9.oy
            if (r0 != 0) goto L5d
            float r0 = r9.xw
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5c
            goto L5d
        L5c:
            return
        L5d:
            com.bytedance.adsdk.ugeno.r r0 = com.bytedance.adsdk.ugeno.r.j()
            com.bytedance.adsdk.ugeno.j r0 = r0.xt()
            com.bytedance.adsdk.ugeno.cw.ws r1 = r9.g
            java.lang.String r2 = r9.j
            com.bytedance.adsdk.ugeno.widget.image.xt$3 r3 = new com.bytedance.adsdk.ugeno.widget.image.xt$3
            r3.<init>(r9)
            r0.j(r1, r2, r3)
            return
    }

    protected java.lang.String ae() {
            r1 = this;
            java.lang.String r0 = r1.yl
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public /* synthetic */ com.bytedance.adsdk.ugeno.widget.image.RoundImageView j() {
            r1 = this;
            com.bytedance.adsdk.ugeno.widget.image.RoundImageView r0 = r1.tl()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public void j(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L8
            goto L69
        L8:
            super.j(r4, r5)
            r4.getClass()
            int r0 = r4.hashCode()
            r1 = 0
            r2 = -1
            switch(r0) {
                case -1878130163: goto L5a;
                case -1877911644: goto L4f;
                case -878696350: goto L44;
                case -372324943: goto L39;
                case 114148: goto L2e;
                case 1327599912: goto L23;
                case 1675225991: goto L18;
                default: goto L17;
            }
        L17:
            goto L64
        L18:
            java.lang.String r0 = "imageBgBlur"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L21
            goto L64
        L21:
            r2 = 6
            goto L64
        L23:
            java.lang.String r0 = "tintColor"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L2c
            goto L64
        L2c:
            r2 = 5
            goto L64
        L2e:
            java.lang.String r0 = "src"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L37
            goto L64
        L37:
            r2 = 4
            goto L64
        L39:
            java.lang.String r0 = "isBgGaussianBlur"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L42
            goto L64
        L42:
            r2 = 3
            goto L64
        L44:
            java.lang.String r0 = "imageBlur"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L4d
            goto L64
        L4d:
            r2 = 2
            goto L64
        L4f:
            java.lang.String r0 = "scaleType"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L58
            goto L64
        L58:
            r2 = 1
            goto L64
        L5a:
            java.lang.String r0 = "scaleMode"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L63
            goto L64
        L63:
            r2 = 0
        L64:
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r2) {
                case 0: goto L89;
                case 1: goto L89;
                case 2: goto L82;
                case 3: goto L7b;
                case 4: goto L78;
                case 5: goto L71;
                case 6: goto L6a;
                default: goto L69;
            }
        L69:
            return
        L6a:
            float r4 = com.bytedance.adsdk.ugeno.m.cw.j(r5, r4)
            r3.xw = r4
            return
        L71:
            int r4 = com.bytedance.adsdk.ugeno.m.j.j(r5)
            r3.qe = r4
            return
        L78:
            r3.j = r5
            return
        L7b:
            boolean r4 = com.bytedance.adsdk.ugeno.m.cw.j(r5, r1)
            r3.oy = r4
            return
        L82:
            float r4 = com.bytedance.adsdk.ugeno.m.cw.j(r5, r4)
            r3.px = r4
            return
        L89:
            android.widget.ImageView$ScaleType r4 = r3.qv(r5)
            r3.ll = r4
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw, com.bytedance.adsdk.ugeno.cw
    public void m() {
            r3 = this;
            super.m()
            T extends android.view.View r0 = r3.up
            com.bytedance.adsdk.ugeno.widget.image.RoundImageView r0 = (com.bytedance.adsdk.ugeno.widget.image.RoundImageView) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L1e
            boolean r1 = com.bytedance.adsdk.lottie.model.layer.a.a(r0)
            if (r1 == 0) goto L1e
            android.graphics.drawable.AnimatedImageDrawable r0 = com.bytedance.adsdk.lottie.model.layer.b.a(r0)
            com.bytedance.adsdk.lottie.model.layer.f.a(r0)
        L1e:
            return
    }

    public com.bytedance.adsdk.ugeno.widget.image.RoundImageView tl() {
            r2 = this;
            com.bytedance.adsdk.ugeno.widget.image.RoundImageView r0 = new com.bytedance.adsdk.ugeno.widget.image.RoundImageView
            android.content.Context r1 = r2.xt
            r0.<init>(r1)
            r0.j(r2)
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw, com.bytedance.adsdk.ugeno.cw
    public void up() {
            r2 = this;
            super.up()
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.image.RoundImageView r0 = (com.bytedance.adsdk.ugeno.widget.image.RoundImageView) r0
            com.bytedance.adsdk.ugeno.widget.image.xt$4 r1 = new com.bytedance.adsdk.ugeno.widget.image.xt$4
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    public void vl(java.lang.String r1) {
            r0 = this;
            r0.j = r1
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public void xt() {
            r2 = this;
            super.xt()
            r2.qb()
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.image.RoundImageView r0 = (com.bytedance.adsdk.ugeno.widget.image.RoundImageView) r0
            android.widget.ImageView$ScaleType r1 = r2.ll
            r0.setScaleType(r1)
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.image.RoundImageView r0 = (com.bytedance.adsdk.ugeno.widget.image.RoundImageView) r0
            int r1 = r2.xq
            r0.setBorderColor(r1)
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.image.RoundImageView r0 = (com.bytedance.adsdk.ugeno.widget.image.RoundImageView) r0
            float r1 = r2.ol
            r0.setCornerRadius(r1)
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.widget.image.RoundImageView r0 = (com.bytedance.adsdk.ugeno.widget.image.RoundImageView) r0
            float r1 = r2.sm
            r0.setBorderWidth(r1)
            int r0 = r2.qe
            r1 = -1
            if (r0 == r1) goto L36
            T extends android.view.View r1 = r2.up
            com.bytedance.adsdk.ugeno.widget.image.RoundImageView r1 = (com.bytedance.adsdk.ugeno.widget.image.RoundImageView) r1
            r1.setColorFilter(r0)
        L36:
            return
    }

    public void xt(android.graphics.drawable.Drawable r2) {
            r1 = this;
            T extends android.view.View r0 = r1.up
            com.bytedance.adsdk.ugeno.widget.image.RoundImageView r0 = (com.bytedance.adsdk.ugeno.widget.image.RoundImageView) r0
            r0.setImageDrawable(r2)
            return
    }
}
