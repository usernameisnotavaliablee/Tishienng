package com.beizi.ad.v2.g;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b extends com.beizi.ad.v2.a.b {
    private android.view.ViewGroup G;
    private android.view.View H;
    private com.beizi.ad.a I;
    private android.os.CountDownTimer J;
    private java.lang.String K;
    private com.beizi.ad.model.f.EnumC0124f L;
    private int M;
    private int N;
    private android.webkit.WebView O;
    private com.beizi.ad.v2.b.a P;












    public b(android.content.Context r1, android.view.ViewGroup r2, android.view.View r3, java.lang.String r4) {
            r0 = this;
            com.beizi.ad.internal.k r3 = com.beizi.ad.internal.k.f7000b
            r0.<init>(r1, r4, r3)
            r0.G = r2
            return
    }

    static /* synthetic */ com.beizi.ad.internal.f.c A(com.beizi.ad.v2.g.b r0) {
            com.beizi.ad.internal.f.c r0 = r0.f7480c
            return r0
    }

    private void A() {
            r8 = this;
            android.view.ViewGroup r0 = r8.G     // Catch: java.lang.Exception -> Lae
            if (r0 != 0) goto L6
            goto Lae
        L6:
            boolean r1 = r0 instanceof android.widget.FrameLayout     // Catch: java.lang.Exception -> Lae
            if (r1 == 0) goto Lae
            android.content.Context r0 = r0.getContext()     // Catch: java.lang.Exception -> Lae
            android.widget.LinearLayout r1 = new android.widget.LinearLayout     // Catch: java.lang.Exception -> Lae
            android.view.ViewGroup r2 = r8.G     // Catch: java.lang.Exception -> Lae
            android.content.Context r2 = r2.getContext()     // Catch: java.lang.Exception -> Lae
            r1.<init>(r2)     // Catch: java.lang.Exception -> Lae
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> Lae
            r3 = 17
            r4 = -2
            r2.<init>(r4, r4, r3)     // Catch: java.lang.Exception -> Lae
            r1.setLayoutParams(r2)     // Catch: java.lang.Exception -> Lae
            com.beizi.ad.internal.f.c r2 = r8.f7480c     // Catch: java.lang.Exception -> Lae
            com.beizi.ad.internal.f.c$a r2 = r2.A()     // Catch: java.lang.Exception -> Lae
            java.lang.String r5 = r2.a()     // Catch: java.lang.Exception -> Lae
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> Lae
            r6 = 0
            if (r5 != 0) goto L53
            android.content.MutableContextWrapper r5 = new android.content.MutableContextWrapper     // Catch: java.lang.Exception -> Lae
            r5.<init>(r0)     // Catch: java.lang.Exception -> Lae
            android.widget.FrameLayout r2 = com.beizi.ad.internal.h.u.a(r5, r2)     // Catch: java.lang.Exception -> Lae
            if (r2 == 0) goto L53
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> Lae
            r5.<init>(r4, r4, r3)     // Catch: java.lang.Exception -> Lae
            r1.addView(r2, r5)     // Catch: java.lang.Exception -> Lae
            r2.setVisibility(r6)     // Catch: java.lang.Exception -> Lae
            com.beizi.ad.v2.g.b$8 r5 = new com.beizi.ad.v2.g.b$8     // Catch: java.lang.Exception -> Lae
            r5.<init>(r8)     // Catch: java.lang.Exception -> Lae
            r2.setOnClickListener(r5)     // Catch: java.lang.Exception -> Lae
        L53:
            com.beizi.ad.internal.f.c r2 = r8.f7480c     // Catch: java.lang.Exception -> Lae
            com.beizi.ad.internal.f.c$a r2 = r2.z()     // Catch: java.lang.Exception -> Lae
            java.lang.String r5 = r2.a()     // Catch: java.lang.Exception -> Lae
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> Lae
            if (r5 != 0) goto L8e
            android.content.MutableContextWrapper r5 = new android.content.MutableContextWrapper     // Catch: java.lang.Exception -> Lae
            android.view.ViewGroup r7 = r8.G     // Catch: java.lang.Exception -> Lae
            android.content.Context r7 = r7.getContext()     // Catch: java.lang.Exception -> Lae
            r5.<init>(r7)     // Catch: java.lang.Exception -> Lae
            android.widget.FrameLayout r2 = com.beizi.ad.internal.h.u.b(r5, r2)     // Catch: java.lang.Exception -> Lae
            if (r2 == 0) goto L8e
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> Lae
            r5.<init>(r4, r4, r3)     // Catch: java.lang.Exception -> Lae
            r1.addView(r2, r5)     // Catch: java.lang.Exception -> Lae
            r2.setVisibility(r6)     // Catch: java.lang.Exception -> Lae
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()     // Catch: java.lang.Exception -> Lae
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5     // Catch: java.lang.Exception -> Lae
            r7 = 5
            r5.setMargins(r7, r6, r6, r6)     // Catch: java.lang.Exception -> Lae
            r5.gravity = r3     // Catch: java.lang.Exception -> Lae
            r2.setLayoutParams(r5)     // Catch: java.lang.Exception -> Lae
        L8e:
            android.view.ViewGroup r2 = r8.G     // Catch: java.lang.Exception -> Lae
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2     // Catch: java.lang.Exception -> Lae
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> Lae
            r5 = 85
            r3.<init>(r4, r4, r5)     // Catch: java.lang.Exception -> Lae
            r2.addView(r1, r3)     // Catch: java.lang.Exception -> Lae
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()     // Catch: java.lang.Exception -> Lae
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2     // Catch: java.lang.Exception -> Lae
            r3 = 1094713344(0x41400000, float:12.0)
            int r0 = com.beizi.ad.internal.h.u.a(r0, r3)     // Catch: java.lang.Exception -> Lae
            r2.setMargins(r6, r6, r0, r0)     // Catch: java.lang.Exception -> Lae
            r1.setLayoutParams(r2)     // Catch: java.lang.Exception -> Lae
        Lae:
            return
    }

    static /* synthetic */ com.beizi.ad.internal.f.c B(com.beizi.ad.v2.g.b r0) {
            com.beizi.ad.internal.f.c r0 = r0.f7480c
            return r0
    }

    private void B() {
            r10 = this;
            com.beizi.ad.internal.f.c r0 = r10.f7480c     // Catch: java.lang.Exception -> L8
            if (r0 == 0) goto L8
            android.view.ViewGroup r1 = r10.G     // Catch: java.lang.Exception -> L8
            if (r1 != 0) goto Lb
        L8:
            r3 = r10
            goto Lc2
        Lb:
            int r0 = r0.I()     // Catch: java.lang.Exception -> L8
            r1 = 2
            if (r0 == r1) goto L15
            r2 = 5
            if (r0 != r2) goto L8
        L15:
            com.beizi.ad.internal.f.c r0 = r10.f7480c     // Catch: java.lang.Exception -> L8
            java.lang.String r5 = r0.B()     // Catch: java.lang.Exception -> L8
            com.beizi.ad.internal.f.c r0 = r10.f7480c     // Catch: java.lang.Exception -> L8
            java.lang.String r0 = r0.D()     // Catch: java.lang.Exception -> L8
            com.beizi.ad.internal.f.c r2 = r10.f7480c     // Catch: java.lang.Exception -> L8
            java.lang.String r2 = r2.C()     // Catch: java.lang.Exception -> L8
            com.beizi.ad.internal.f.c r3 = r10.f7480c     // Catch: java.lang.Exception -> L8
            java.lang.String r3 = r3.F()     // Catch: java.lang.Exception -> L8
            com.beizi.ad.internal.f.c r4 = r10.f7480c     // Catch: java.lang.Exception -> L8
            java.lang.String r4 = r4.E()     // Catch: java.lang.Exception -> L8
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L8
            if (r6 != 0) goto L3b
            r7 = r3
            goto L3c
        L3b:
            r7 = r4
        L3c:
            com.beizi.ad.internal.f.c r3 = r10.f7480c     // Catch: java.lang.Exception -> L8
            java.lang.String r6 = r3.G()     // Catch: java.lang.Exception -> L8
            com.beizi.ad.internal.f.c r3 = r10.f7480c     // Catch: java.lang.Exception -> L8
            java.lang.String r8 = r3.H()     // Catch: java.lang.Exception -> L8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8
            r3.<init>()     // Catch: java.lang.Exception -> L8
            java.lang.String r4 = "应用名称："
            r3.append(r4)     // Catch: java.lang.Exception -> L8
            r3.append(r5)     // Catch: java.lang.Exception -> L8
            java.lang.String r4 = " | 开发者："
            r3.append(r4)     // Catch: java.lang.Exception -> L8
            r3.append(r0)     // Catch: java.lang.Exception -> L8
            java.lang.String r0 = " | 应用版本："
            r3.append(r0)     // Catch: java.lang.Exception -> L8
            r3.append(r2)     // Catch: java.lang.Exception -> L8
            java.lang.String r0 = " | <u>权限详情</u> | <u>隐私协议</u> | <u>功能介绍</u>"
            r3.append(r0)     // Catch: java.lang.Exception -> L8
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L8
            android.view.ViewGroup r2 = r10.G     // Catch: java.lang.Exception -> L8
            android.content.Context r4 = r2.getContext()     // Catch: java.lang.Exception -> L8
            android.widget.TextView r9 = new android.widget.TextView     // Catch: java.lang.Exception -> L8
            r9.<init>(r4)     // Catch: java.lang.Exception -> L8
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)     // Catch: java.lang.Exception -> L8
            r9.setText(r0)     // Catch: java.lang.Exception -> L8
            r0 = 1086324736(0x40c00000, float:6.0)
            r9.setTextSize(r1, r0)     // Catch: java.lang.Exception -> L8
            java.lang.String r0 = "#999999"
            int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Exception -> L8
            r9.setTextColor(r0)     // Catch: java.lang.Exception -> L8
            java.lang.String r0 = "#333333"
            int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Exception -> L8
            r2 = 1065353216(0x3f800000, float:1.0)
            r9.setShadowLayer(r2, r2, r2, r0)     // Catch: java.lang.Exception -> L8
            r0 = 10
            r9.setPadding(r0, r0, r0, r0)     // Catch: java.lang.Exception -> L8
            com.beizi.ad.v2.g.b$9 r2 = new com.beizi.ad.v2.g.b$9     // Catch: java.lang.Exception -> L8
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> Lc2
            r9.setOnClickListener(r2)     // Catch: java.lang.Exception -> Lc2
            int r0 = com.beizi.ad.lance.a.q.d(r4)     // Catch: java.lang.Exception -> Lc2
            int r0 = r0 * 2
            int r0 = r0 / 3
            android.view.ViewGroup r1 = r3.G     // Catch: java.lang.Exception -> Lc2
            boolean r2 = r1 instanceof android.widget.FrameLayout     // Catch: java.lang.Exception -> Lc2
            if (r2 == 0) goto Lc2
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1     // Catch: java.lang.Exception -> Lc2
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> Lc2
            r4 = -2
            r5 = 83
            r2.<init>(r0, r4, r5)     // Catch: java.lang.Exception -> Lc2
            r1.addView(r9, r2)     // Catch: java.lang.Exception -> Lc2
        Lc2:
            return
    }

    static /* synthetic */ android.os.CountDownTimer C(com.beizi.ad.v2.g.b r0) {
            android.os.CountDownTimer r0 = r0.J
            return r0
    }

    private void C() {
            r1 = this;
            boolean r0 = r1.f7487j
            if (r0 == 0) goto L5
            goto Lf
        L5:
            r0 = 1
            r1.f7484g = r0
            com.beizi.ad.a r0 = r1.I
            if (r0 == 0) goto Lf
            r0.a()
        Lf:
            return
    }

    private void D() {
            r4 = this;
            com.beizi.ad.model.f$f r0 = r4.L
            com.beizi.ad.model.f$f r1 = com.beizi.ad.model.f.EnumC0124f.f7458c
            if (r0 == r1) goto L7
            goto Lf
        L7:
            java.lang.String r0 = r4.K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
        Lf:
            return
        L10:
            r0 = 0
            com.beizi.ad.internal.h.i r0 = com.beizi.ad.internal.h.i.a(r0)
            java.lang.String r1 = r4.K
            com.beizi.ad.v2.g.b$3 r2 = new com.beizi.ad.v2.g.b$3
            r2.<init>(r4)
            r3 = 0
            r0.a(r1, r3, r2)
            return
    }

    static /* synthetic */ void D(com.beizi.ad.v2.g.b r0) {
            r0.w()
            return
    }

    static /* synthetic */ void a(com.beizi.ad.v2.g.b r0) {
            r0.z()
            return
    }

    static /* synthetic */ boolean a(com.beizi.ad.v2.g.b r0, boolean r1) {
            r0.u = r1
            return r1
    }

    static /* synthetic */ com.beizi.ad.internal.f.c b(com.beizi.ad.v2.g.b r0) {
            com.beizi.ad.internal.f.c r0 = r0.f7480c
            return r0
    }

    static /* synthetic */ android.view.ViewGroup c(com.beizi.ad.v2.g.b r0) {
            android.view.ViewGroup r0 = r0.G
            return r0
    }

    static /* synthetic */ java.lang.String d(com.beizi.ad.v2.g.b r0) {
            java.lang.String r0 = r0.l
            return r0
    }

    static /* synthetic */ com.beizi.ad.internal.f.c e(com.beizi.ad.v2.g.b r0) {
            com.beizi.ad.internal.f.c r0 = r0.f7480c
            return r0
    }

    static /* synthetic */ boolean f(com.beizi.ad.v2.g.b r0) {
            boolean r0 = r0.t
            return r0
    }

    static /* synthetic */ com.beizi.ad.internal.a.b g(com.beizi.ad.v2.g.b r0) {
            com.beizi.ad.internal.a.b r0 = r0.r
            return r0
    }

    static /* synthetic */ com.beizi.ad.a h(com.beizi.ad.v2.g.b r0) {
            com.beizi.ad.a r0 = r0.I
            return r0
    }

    static /* synthetic */ int i(com.beizi.ad.v2.g.b r0) {
            int r0 = r0.M
            return r0
    }

    static /* synthetic */ int j(com.beizi.ad.v2.g.b r0) {
            int r0 = r0.N
            return r0
    }

    static /* synthetic */ boolean k(com.beizi.ad.v2.g.b r0) {
            boolean r0 = r0.B
            return r0
    }

    static /* synthetic */ android.os.Handler l(com.beizi.ad.v2.g.b r0) {
            android.os.Handler r0 = r0.F
            return r0
    }

    static /* synthetic */ android.os.Handler m(com.beizi.ad.v2.g.b r0) {
            android.os.Handler r0 = r0.F
            return r0
    }

    static /* synthetic */ boolean n(com.beizi.ad.v2.g.b r0) {
            boolean r0 = r0.B
            return r0
    }

    static /* synthetic */ boolean o(com.beizi.ad.v2.g.b r0) {
            boolean r0 = r0.E
            return r0
    }

    static /* synthetic */ boolean p(com.beizi.ad.v2.g.b r0) {
            boolean r0 = r0.C
            return r0
    }

    static /* synthetic */ void q(com.beizi.ad.v2.g.b r0) {
            r0.A()
            return
    }

    static /* synthetic */ void r(com.beizi.ad.v2.g.b r0) {
            r0.B()
            return
    }

    static /* synthetic */ com.beizi.ad.v2.b.a s(com.beizi.ad.v2.g.b r0) {
            com.beizi.ad.v2.b.a r0 = r0.P
            return r0
    }

    static /* synthetic */ void t(com.beizi.ad.v2.g.b r0) {
            r0.C()
            return
    }

    static /* synthetic */ boolean u(com.beizi.ad.v2.g.b r0) {
            boolean r0 = r0.B
            return r0
    }

    static /* synthetic */ boolean v(com.beizi.ad.v2.g.b r0) {
            boolean r0 = r0.E
            return r0
    }

    private void w() {
            r4 = this;
            r0 = 3
            com.beizi.ad.model.f$f r1 = r4.L     // Catch: java.lang.Exception -> L52
            com.beizi.ad.model.f$f r2 = com.beizi.ad.model.f.EnumC0124f.f7458c     // Catch: java.lang.Exception -> L52
            java.lang.String r3 = "http"
            if (r1 != r2) goto L26
            java.lang.String r1 = r4.K     // Catch: java.lang.Exception -> L52
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L52
            if (r1 == 0) goto L15
            r4.b(r0)     // Catch: java.lang.Exception -> L52
            return
        L15:
            java.lang.String r1 = r4.K     // Catch: java.lang.Exception -> L52
            boolean r1 = r1.startsWith(r3)     // Catch: java.lang.Exception -> L52
            if (r1 != 0) goto L22
            r1 = 7
            r4.b(r1)     // Catch: java.lang.Exception -> L52
            return
        L22:
            r4.x()     // Catch: java.lang.Exception -> L52
            return
        L26:
            com.beizi.ad.model.f$f r2 = com.beizi.ad.model.f.EnumC0124f.f7459d     // Catch: java.lang.Exception -> L52
            if (r1 != r2) goto L4e
            java.lang.String r1 = r4.K     // Catch: java.lang.Exception -> L52
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L52
            if (r1 == 0) goto L36
            r4.b(r0)     // Catch: java.lang.Exception -> L52
            return
        L36:
            java.lang.String r1 = r4.K     // Catch: java.lang.Exception -> L52
            boolean r1 = r1.startsWith(r3)     // Catch: java.lang.Exception -> L52
            if (r1 == 0) goto L4a
            java.lang.String r1 = "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n  <meta charset=\"UTF-8\">\n  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n  <title>Document</title>\n  <style>\n    html, body { width: 100%; height: 100%; margin: 0; padding: 0 }\n    .material-wrap { overflow: hidden; position: relative; height: 100%; background-repeat: no-repeat; background-position: center center; background-size: cover }\n    .filter-shadow { content: \"\"; position: absolute; z-index: 2; top: -3%; left: -3%; right: -3%; bottom: -3%; background: inherit; filter: blur(10px) }\n    .material-wrap .black-shadow { position: absolute; z-index: 3; top: 0; left: 0; right: 0; bottom: 0; background: rgba(0, 0, 0, .05) }\n    .material-wrap .material { position: absolute; z-index: 3; top: 0; left: 0; width: 100%; height: 100%; background-repeat: no-repeat; background-position: center center; background-size: contain }\n  </style>\n</head>\n<body>\n  <div class=\"material-wrap\" style=\"background-image: url('__IMAGE_SRC_PATH__')\">\n    <div class=\"filter-shadow\"></div>\n    <div class=\"black-shadow\"></div>\n    <div class=\"material\" style=\"background-image: url('__IMAGE_SRC_PATH__')\"></div>\n  </div>\n</body>\n</html>\n"
            java.lang.String r2 = "__IMAGE_SRC_PATH__"
            java.lang.String r3 = r4.K     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = r1.replaceAll(r2, r3)     // Catch: java.lang.Exception -> L52
            r4.K = r1     // Catch: java.lang.Exception -> L52
        L4a:
            r4.y()     // Catch: java.lang.Exception -> L52
            return
        L4e:
            r4.b(r0)     // Catch: java.lang.Exception -> L52
            return
        L52:
            r4.b(r0)
            return
    }

    static /* synthetic */ boolean w(com.beizi.ad.v2.g.b r0) {
            boolean r0 = r0.C
            return r0
    }

    static /* synthetic */ android.webkit.WebView x(com.beizi.ad.v2.g.b r0) {
            android.webkit.WebView r0 = r0.O
            return r0
    }

    private void x() {
            r4 = this;
            boolean r0 = r4.B
            r1 = 0
            if (r0 == 0) goto L28
            android.view.ViewGroup r0 = r4.G     // Catch: java.lang.Exception -> L28
            android.content.Context r0 = r0.getContext()     // Catch: java.lang.Exception -> L28
            android.widget.ImageView r2 = new android.widget.ImageView     // Catch: java.lang.Exception -> L28
            r2.<init>(r0)     // Catch: java.lang.Exception -> L28
            android.view.ViewGroup r0 = r4.G     // Catch: java.lang.Exception -> L29
            r0.addView(r2)     // Catch: java.lang.Exception -> L29
            boolean r0 = r4.E     // Catch: java.lang.Exception -> L29
            if (r0 == 0) goto L1d
            r0 = 0
            r2.setAlpha(r0)     // Catch: java.lang.Exception -> L29
        L1d:
            boolean r0 = r4.C     // Catch: java.lang.Exception -> L29
            if (r0 != 0) goto L29
            r4.A()     // Catch: java.lang.Exception -> L29
            r4.B()     // Catch: java.lang.Exception -> L29
            goto L29
        L28:
            r2 = r1
        L29:
            com.beizi.ad.internal.h.i r0 = com.beizi.ad.internal.h.i.a(r1)
            java.lang.String r1 = r4.K
            com.beizi.ad.v2.g.b$4 r3 = new com.beizi.ad.v2.g.b$4
            r3.<init>(r4, r2)
            r0.a(r1, r3)
            return
    }

    private void y() {
            r8 = this;
            android.view.ViewGroup r0 = r8.G
            if (r0 != 0) goto La
            r0 = 10
            r8.b(r0)
            return
        La:
            android.content.Context r0 = r0.getContext()
            android.webkit.WebView r1 = new android.webkit.WebView
            r1.<init>(r0)
            r8.O = r1
            com.beizi.ad.internal.h.x.a(r1)
            boolean r0 = r8.B
            if (r0 == 0) goto L2d
            android.view.ViewGroup r0 = r8.G
            android.webkit.WebView r1 = r8.O
            r0.addView(r1)
            boolean r0 = r8.C
            if (r0 != 0) goto L2d
            r8.A()
            r8.B()
        L2d:
            android.webkit.WebView r0 = r8.O
            com.beizi.ad.v2.g.b$5 r1 = new com.beizi.ad.v2.g.b$5
            r1.<init>(r8)
            r0.setWebViewClient(r1)
            android.webkit.WebView r2 = r8.O
            java.lang.String r4 = r8.K
            java.lang.String r6 = "UTF-8"
            r7 = 0
            r3 = 0
            java.lang.String r5 = "text/html"
            r2.loadDataWithBaseURL(r3, r4, r5, r6, r7)
            return
    }

    static /* synthetic */ boolean y(com.beizi.ad.v2.g.b r0) {
            boolean r0 = r0.B
            return r0
    }

    private void z() {
            r2 = this;
            android.view.View r0 = r2.H
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r2.H
            com.beizi.ad.v2.g.b$7 r1 = new com.beizi.ad.v2.g.b$7
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    static /* synthetic */ boolean z(com.beizi.ad.v2.g.b r0) {
            boolean r0 = r0.C
            return r0
    }

    public void a(int r1, int r2) {
            r0 = this;
            r0.M = r1
            r0.N = r2
            return
    }

    public void a(android.view.View.OnTouchListener r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L12
        L3:
            android.webkit.WebView r0 = r1.O
            if (r0 == 0) goto Lb
            r0.setOnTouchListener(r2)
            return
        Lb:
            android.view.ViewGroup r0 = r1.G
            if (r0 == 0) goto L12
            r0.setOnTouchListener(r2)
        L12:
            return
    }

    public void a(android.view.View r2) {
            r1 = this;
            android.view.ViewGroup r0 = r1.G
            if (r0 != 0) goto La
            r2 = 11
            r1.b(r2)
            return
        La:
            r1.H = r2
            com.beizi.ad.v2.g.b$1 r2 = new com.beizi.ad.v2.g.b$1
            r2.<init>(r1)
            r0.post(r2)
            return
    }

    public void a(com.beizi.ad.a r1) {
            r0 = this;
            r0.I = r1
            return
    }

    @Override // com.beizi.ad.v2.a.b
    public void a(com.beizi.ad.internal.f.c r2) {
            r1 = this;
            int r0 = r2.s()
            r1.n = r0
            java.lang.String r0 = r2.S()
            r1.K = r0
            com.beizi.ad.model.f$f r0 = r2.T()
            r1.L = r0
            java.lang.String r0 = r2.e()
            r1.b(r0)
            java.lang.String r0 = r2.f()
            r1.c(r0)
            boolean r2 = r2.P()
            r1.a(r2)
            boolean r2 = r1.B
            if (r2 == 0) goto L39
            android.os.Handler r2 = r1.F
            com.beizi.ad.v2.g.b$11 r0 = new com.beizi.ad.v2.g.b$11
            r0.<init>(r1)
            r2.post(r0)
            r1.D()
            return
        L39:
            android.os.Handler r2 = r1.F
            if (r2 == 0) goto L45
            com.beizi.ad.v2.g.b$2 r0 = new com.beizi.ad.v2.g.b$2
            r0.<init>(r1)
            r2.post(r0)
        L45:
            return
    }

    public void a(com.beizi.ad.model.d r12, int r13) {
            r11 = this;
            com.beizi.ad.internal.f.c r0 = r11.f7480c     // Catch: java.lang.Exception -> L40
            if (r0 == 0) goto L40
            android.view.ViewGroup r1 = r11.G     // Catch: java.lang.Exception -> L40
            if (r1 != 0) goto L9
            goto L40
        L9:
            r1 = 1
            r0.a(r1)     // Catch: java.lang.Exception -> L40
            com.beizi.ad.internal.f.c r0 = r11.f7480c     // Catch: java.lang.Exception -> L40
            boolean r2 = r11.f()     // Catch: java.lang.Exception -> L40
            r0.b(r2)     // Catch: java.lang.Exception -> L40
            com.beizi.ad.internal.f.c r3 = r11.f7480c     // Catch: java.lang.Exception -> L40
            android.view.ViewGroup r4 = r11.G     // Catch: java.lang.Exception -> L40
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L40
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> L40
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L40
            r9 = 10
            long r7 = r7 + r9
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Exception -> L40
            boolean r8 = r11.f7486i     // Catch: java.lang.Exception -> L40
            java.lang.String r9 = r11.l     // Catch: java.lang.Exception -> L40
            r5 = r12
            r10 = r13
            r3.a(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L40
            r11.f7486i = r1     // Catch: java.lang.Exception -> L40
            com.beizi.ad.a r12 = r11.I     // Catch: java.lang.Exception -> L40
            if (r12 != 0) goto L3d
            goto L40
        L3d:
            r12.e()     // Catch: java.lang.Exception -> L40
        L40:
            return
    }

    public void a(com.beizi.ad.v2.b.a r1) {
            r0 = this;
            r0.P = r1
            r0.w()
            return
    }

    @Override // com.beizi.ad.v2.a.b
    public void b(int r3) {
            r2 = this;
            com.beizi.ad.a r0 = r2.I
            if (r0 == 0) goto L1c
            boolean r0 = r2.f7487j
            if (r0 != 0) goto L1c
            boolean r0 = r2.f7484g
            if (r0 == 0) goto Ld
            goto L1c
        Ld:
            r0 = 1
            r2.f7487j = r0
            android.os.Handler r0 = r2.F
            if (r0 == 0) goto L1c
            com.beizi.ad.v2.g.b$10 r1 = new com.beizi.ad.v2.g.b$10
            r1.<init>(r2, r3)
            r0.post(r1)
        L1c:
            return
    }

    public void b(android.view.View.OnTouchListener r2) {
            r1 = this;
            android.webkit.WebView r0 = r1.O
            if (r0 == 0) goto L8
            r0.setOnTouchListener(r2)
            return
        L8:
            android.view.ViewGroup r0 = r1.G
            if (r0 == 0) goto Lf
            r0.setOnTouchListener(r2)
        Lf:
            return
    }

    @Override // com.beizi.ad.v2.a.b
    public void c() {
            r2 = this;
            com.beizi.ad.internal.f.c r0 = r2.f7480c     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L8
            r1 = 0
            r0.d(r1)     // Catch: java.lang.Exception -> L16
        L8:
            com.beizi.ad.a r0 = r2.I     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto Lf
            r0.c()     // Catch: java.lang.Exception -> L16
        Lf:
            android.os.CountDownTimer r0 = r2.J     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L16
            r0.cancel()     // Catch: java.lang.Exception -> L16
        L16:
            return
    }

    public void u() {
            r7 = this;
            android.os.CountDownTimer r0 = r7.J
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            int r0 = r7.n
            if (r0 > 0) goto Le
            r0 = 5
            r7.n = r0
        Le:
            com.beizi.ad.v2.g.b$6 r1 = new com.beizi.ad.v2.g.b$6
            int r0 = r7.n
            int r0 = r0 * 1000
            long r3 = (long) r0
            r5 = 200(0xc8, double:9.9E-322)
            r2 = r7
            r1.<init>(r2, r3, r5)
            r2.J = r1
            r1.start()
            return
    }

    public void v() {
            r14 = this;
            com.beizi.ad.internal.f.c r0 = r14.f7480c     // Catch: java.lang.Exception -> L3f
            r1 = 1
            r0.a(r1)     // Catch: java.lang.Exception -> L3f
            com.beizi.ad.internal.f.c r0 = r14.f7480c     // Catch: java.lang.Exception -> L3f
            boolean r2 = r14.f()     // Catch: java.lang.Exception -> L3f
            r0.b(r2)     // Catch: java.lang.Exception -> L3f
            com.beizi.ad.internal.f.c r3 = r14.f7480c     // Catch: java.lang.Exception -> L3f
            android.view.ViewGroup r4 = r14.G     // Catch: java.lang.Exception -> L3f
            java.lang.String r5 = "100"
            java.lang.String r6 = "200"
            java.lang.String r7 = "105"
            java.lang.String r8 = "206"
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L3f
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Exception -> L3f
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L3f
            r12 = 10
            long r10 = r10 + r12
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Exception -> L3f
            boolean r11 = r14.f7486i     // Catch: java.lang.Exception -> L3f
            java.lang.String r12 = r14.l     // Catch: java.lang.Exception -> L3f
            r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L3f
            r14.f7486i = r1     // Catch: java.lang.Exception -> L3f
            com.beizi.ad.a r0 = r14.I     // Catch: java.lang.Exception -> L3f
            if (r0 != 0) goto L3c
            goto L3f
        L3c:
            r0.e()     // Catch: java.lang.Exception -> L3f
        L3f:
            return
    }
}
