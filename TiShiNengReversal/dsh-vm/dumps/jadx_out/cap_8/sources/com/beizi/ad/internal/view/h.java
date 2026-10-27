package com.beizi.ad.internal.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h extends com.beizi.ad.internal.view.a {
    private android.webkit.WebChromeClient.CustomViewCallback a;

    /* renamed from: b, reason: collision with root package name */
    private android.widget.FrameLayout f7227b;

    /* renamed from: c, reason: collision with root package name */
    private android.app.Activity f7228c;

    /* renamed from: d, reason: collision with root package name */
    private com.beizi.ad.internal.view.AdViewImpl f7229d;

    /* renamed from: e, reason: collision with root package name */
    private com.beizi.ad.internal.view.AdWebView f7230e;




    public h(android.app.Activity r1) {
            r0 = this;
            r0.<init>()
            r0.f7228c = r1
            return
    }

    public h(com.beizi.ad.internal.view.AdWebView r2) {
            r1 = this;
            r1.<init>()
            android.content.Context r0 = r2.getContextFromMutableContext()
            android.app.Activity r0 = (android.app.Activity) r0
            r1.f7228c = r0
            r1.f7230e = r2
            com.beizi.ad.internal.view.AdViewImpl r2 = r2.adViewImpl
            r1.f7229d = r2
            return
    }

    private void a(android.widget.FrameLayout r5) {
            r4 = this;
            android.widget.ImageButton r0 = new android.widget.ImageButton
            android.app.Activity r1 = r4.f7228c
            r0.<init>(r1)
            android.app.Activity r1 = r4.f7228c
            android.content.res.Resources r1 = r1.getResources()
            r2 = 17301560(0x1080038, float:2.4979412E-38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setImageDrawable(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -2
            r3 = 53
            r1.<init>(r2, r2, r3)
            r0.setLayoutParams(r1)
            r1 = 0
            r0.setBackgroundColor(r1)
            com.beizi.ad.internal.view.h$1 r1 = new com.beizi.ad.internal.view.h$1
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            r5.addView(r0)
            return
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
            r1 = this;
            com.beizi.ad.internal.view.AdViewImpl r0 = r1.f7229d
            if (r0 == 0) goto L1b
            boolean r0 = r0.e()
            if (r0 != 0) goto L1b
            com.beizi.ad.internal.view.AdViewImpl r0 = r1.f7229d
            boolean r0 = r0.a()
            if (r0 != 0) goto L1b
            com.beizi.ad.internal.view.AdViewImpl r0 = r1.f7229d
            com.beizi.ad.internal.c r0 = r0.getAdDispatcher()
            r0.b()
        L1b:
            return
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(java.lang.String r5, android.webkit.GeolocationPermissions.Callback r6) {
            r4 = this;
            com.beizi.ad.internal.view.AdWebView r0 = r4.f7230e
            if (r0 == 0) goto L9
            android.content.Context r0 = com.beizi.ad.internal.h.u.b(r0)
            goto Lb
        L9:
            android.app.Activity r0 = r4.f7228c
        Lb:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r0)
            android.app.Activity r0 = r4.f7228c
            android.content.res.Resources r0 = r0.getResources()
            int r2 = com.beizi.fusion.R.string.beizi_html5_geo_permission_prompt_title
            java.lang.String r0 = r0.getString(r2)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.setTitle(r0)
            int r0 = com.beizi.fusion.R.string.beizi_html5_geo_permission_prompt
            r1.setMessage(r0)
            int r0 = com.beizi.fusion.R.string.beizi_allow
            com.beizi.ad.internal.view.h$2 r2 = new com.beizi.ad.internal.view.h$2
            r2.<init>(r4, r6, r5)
            r1.setPositiveButton(r0, r2)
            int r0 = com.beizi.fusion.R.string.beizi_deny
            com.beizi.ad.internal.view.h$3 r2 = new com.beizi.ad.internal.view.h$3
            r2.<init>(r4, r6, r5)
            r1.setNegativeButton(r0, r2)
            android.app.AlertDialog r5 = r1.create()
            r5.show()
            com.beizi.ad.internal.view.AdViewImpl r5 = r4.f7229d
            if (r5 == 0) goto L64
            boolean r5 = r5.e()
            if (r5 != 0) goto L64
            com.beizi.ad.internal.view.AdViewImpl r5 = r4.f7229d
            boolean r5 = r5.a()
            if (r5 != 0) goto L64
            com.beizi.ad.internal.view.AdViewImpl r5 = r4.f7229d
            com.beizi.ad.internal.c r5 = r5.getAdDispatcher()
            r5.c()
        L64:
            return
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
            r3 = this;
            super.onHideCustomView()
            android.app.Activity r0 = r3.f7228c
            if (r0 == 0) goto L33
            android.widget.FrameLayout r1 = r3.f7227b
            if (r1 != 0) goto Lc
            goto L33
        Lc:
            com.beizi.ad.internal.view.AdWebView r1 = r3.f7230e
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 == 0) goto L1e
            android.view.View r0 = r1.getRootView()
            android.view.View r0 = r0.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L24
        L1e:
            android.view.View r0 = r0.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L24:
            if (r0 != 0) goto L27
            goto L33
        L27:
            android.widget.FrameLayout r1 = r3.f7227b
            r0.removeView(r1)
            android.webkit.WebChromeClient$CustomViewCallback r0 = r3.a
            if (r0 == 0) goto L33
            r0.onCustomViewHidden()     // Catch: java.lang.NullPointerException -> L33
        L33:
            return
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(android.view.View r1, int r2, android.webkit.WebChromeClient.CustomViewCallback r3) {
            r0 = this;
            r0.onShowCustomView(r1, r3)
            return
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(android.view.View r4, android.webkit.WebChromeClient.CustomViewCallback r5) {
            r3 = this;
            super.onShowCustomView(r4, r5)
            android.app.Activity r0 = r3.f7228c
            if (r0 != 0) goto L8
            goto L48
        L8:
            com.beizi.ad.internal.view.AdWebView r1 = r3.f7230e
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 == 0) goto L1a
            android.view.View r0 = r1.getRootView()
            android.view.View r0 = r0.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L20
        L1a:
            android.view.View r0 = r0.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L20:
            if (r0 != 0) goto L23
            goto L48
        L23:
            r3.a = r5
            boolean r5 = r4 instanceof android.widget.FrameLayout
            if (r5 == 0) goto L49
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r3.f7227b = r4
            r5 = 1
            r4.setClickable(r5)
            android.widget.FrameLayout r4 = r3.f7227b
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4.setBackgroundColor(r5)
            android.widget.FrameLayout r4 = r3.f7227b     // Catch: java.lang.Exception -> L48
            r3.a(r4)     // Catch: java.lang.Exception -> L48
            android.widget.FrameLayout r4 = r3.f7227b     // Catch: java.lang.Exception -> L48
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams     // Catch: java.lang.Exception -> L48
            r1 = -1
            r5.<init>(r1, r1)     // Catch: java.lang.Exception -> L48
            r0.addView(r4, r5)     // Catch: java.lang.Exception -> L48
        L48:
            return
        L49:
            r4 = 0
            r3.f7227b = r4
            return
    }
}
