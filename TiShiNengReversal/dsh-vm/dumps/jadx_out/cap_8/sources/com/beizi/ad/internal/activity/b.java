package com.beizi.ad.internal.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b implements com.beizi.ad.AdActivity.a {
    private android.app.Activity a;

    /* renamed from: b, reason: collision with root package name */
    private com.beizi.ad.internal.view.AdWebView f6615b;

    /* renamed from: c, reason: collision with root package name */
    private com.beizi.ad.internal.view.c f6616c;

    /* renamed from: d, reason: collision with root package name */
    private android.widget.FrameLayout f6617d;

    /* renamed from: e, reason: collision with root package name */
    private long f6618e;

    /* renamed from: f, reason: collision with root package name */
    private com.beizi.ad.internal.view.InterstitialAdViewImpl f6619f;

    public b(android.app.Activity r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private void a(com.beizi.ad.internal.view.InterstitialAdViewImpl r7) {
            r6 = this;
            r6.f6619f = r7
            if (r7 != 0) goto L6
            goto L1ba
        L6:
            r7.setAdImplementation(r6)
            android.widget.FrameLayout r7 = r6.f6617d
            com.beizi.ad.internal.view.InterstitialAdViewImpl r0 = r6.f6619f
            int r0 = r0.getBackgroundColor()
            r7.setBackgroundColor(r0)
            android.widget.FrameLayout r7 = r6.f6617d
            r7.removeAllViews()
            com.beizi.ad.internal.view.InterstitialAdViewImpl r7 = r6.f6619f
            android.view.ViewParent r7 = r7.getParent()
            if (r7 == 0) goto L2c
            com.beizi.ad.internal.view.InterstitialAdViewImpl r7 = r6.f6619f
            android.view.ViewParent r7 = r7.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.removeAllViews()
        L2c:
            com.beizi.ad.internal.view.InterstitialAdViewImpl r7 = r6.f6619f
            java.util.Queue r7 = r7.getAdQueue()
            java.lang.Object r7 = r7.poll()
            com.beizi.ad.internal.view.e r7 = (com.beizi.ad.internal.view.e) r7
        L38:
            if (r7 == 0) goto L62
            long r0 = r6.f6618e
            long r2 = r7.a()
            long r0 = r0 - r2
            r2 = 270000(0x41eb0, double:1.333977E-318)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L55
            long r0 = r6.f6618e
            long r2 = r7.a()
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L62
        L55:
            com.beizi.ad.internal.view.InterstitialAdViewImpl r7 = r6.f6619f
            java.util.Queue r7 = r7.getAdQueue()
            java.lang.Object r7 = r7.poll()
            com.beizi.ad.internal.view.e r7 = (com.beizi.ad.internal.view.e) r7
            goto L38
        L62:
            if (r7 == 0) goto L1ba
            android.view.View r0 = r7.d()
            boolean r0 = r0 instanceof com.beizi.ad.internal.view.AdWebView
            if (r0 != 0) goto L6e
            goto L1ba
        L6e:
            android.view.View r7 = r7.d()
            com.beizi.ad.internal.view.AdWebView r7 = (com.beizi.ad.internal.view.AdWebView) r7
            r6.f6615b = r7
            android.content.Context r7 = r7.getContext()
            boolean r7 = r7 instanceof android.content.MutableContextWrapper
            if (r7 == 0) goto L9c
            com.beizi.ad.internal.view.AdWebView r7 = r6.f6615b
            android.content.Context r7 = r7.getContext()
            android.content.MutableContextWrapper r7 = (android.content.MutableContextWrapper) r7
            android.app.Activity r0 = r6.a
            r7.setBaseContext(r0)
            com.beizi.ad.internal.view.AdWebView r7 = r6.f6615b
            com.beizi.ad.internal.video.AdVideoView r7 = r7.mAdVideoView
            if (r7 == 0) goto L9c
            android.content.Context r7 = r7.getContext()
            android.content.MutableContextWrapper r7 = (android.content.MutableContextWrapper) r7
            android.app.Activity r0 = r6.a
            r7.setBaseContext(r0)
        L9c:
            com.beizi.ad.internal.view.AdWebView r7 = r6.f6615b
            int r7 = r7.getCreativeWidth()
            r0 = 1
            if (r7 != r0) goto Lad
            com.beizi.ad.internal.view.AdWebView r7 = r6.f6615b
            int r7 = r7.getCreativeHeight()
            if (r7 == r0) goto Le2
        Lad:
            android.app.Activity r7 = r6.a
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.orientation
            r1 = 2
            if (r7 == r1) goto Le2
            com.beizi.ad.internal.view.InterstitialAdViewImpl r7 = r6.f6619f     // Catch: java.lang.Exception -> Lcd
            com.beizi.ad.internal.e r7 = r7.getAdParameters()     // Catch: java.lang.Exception -> Lcd
            android.content.Context r7 = r7.b()     // Catch: java.lang.Exception -> Lcd
            android.content.pm.ApplicationInfo r7 = r7.getApplicationInfo()     // Catch: java.lang.Exception -> Lcd
            int r7 = r7.targetSdkVersion     // Catch: java.lang.Exception -> Lcd
            goto Lce
        Lcd:
            r7 = 0
        Lce:
            r1 = 26
            if (r7 <= r1) goto Ld7
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 != r1) goto Ld7
            goto Le2
        Ld7:
            android.app.Activity r7 = r6.a
            com.beizi.ad.internal.view.AdWebView r1 = r6.f6615b
            int r1 = r1.getOrientation()
            com.beizi.ad.AdActivity.a(r7, r1)
        Le2:
            com.beizi.ad.internal.view.AdWebView r7 = r6.f6615b
            com.beizi.ad.internal.view.c r7 = r7.getRealDisplayable()
            r6.f6616c = r7
            com.beizi.ad.internal.view.AdWebView r7 = r6.f6615b
            com.beizi.ad.internal.video.AdVideoView r1 = r7.mAdVideoView
            r2 = 17
            if (r1 == 0) goto L107
            android.widget.FrameLayout r0 = r6.f6617d
            com.beizi.ad.internal.view.c r7 = r7.getRealDisplayable()
            android.view.View r7 = r7.getView()
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r3 = -2
            r1.<init>(r3, r3, r2)
            r0.addView(r7, r1)
            goto L1b5
        L107:
            android.app.Activity r7 = r6.a
            int r7 = r7.getRequestedOrientation()
            if (r7 != 0) goto L144
            android.widget.FrameLayout r7 = r6.f6617d
            com.beizi.ad.internal.view.AdWebView r0 = r6.f6615b
            com.beizi.ad.internal.view.c r0 = r0.getRealDisplayable()
            android.view.View r0 = r0.getView()
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            com.beizi.ad.internal.view.AdWebView r3 = r6.f6615b
            int r3 = r3.getCreativeHeight()
            float r3 = (float) r3
            com.beizi.ad.internal.h r4 = com.beizi.ad.internal.h.a()
            float r4 = r4.f6838k
            float r3 = r3 * r4
            int r3 = (int) r3
            com.beizi.ad.internal.view.AdWebView r4 = r6.f6615b
            int r4 = r4.getCreativeWidth()
            float r4 = (float) r4
            com.beizi.ad.internal.h r5 = com.beizi.ad.internal.h.a()
            float r5 = r5.l
            float r4 = r4 * r5
            int r4 = (int) r4
            r1.<init>(r3, r4, r2)
            r7.addView(r0, r1)
            goto L1b5
        L144:
            android.app.Activity r7 = r6.a
            int r7 = r7.getRequestedOrientation()
            if (r7 != r0) goto L181
            android.widget.FrameLayout r7 = r6.f6617d
            com.beizi.ad.internal.view.AdWebView r0 = r6.f6615b
            com.beizi.ad.internal.view.c r0 = r0.getRealDisplayable()
            android.view.View r0 = r0.getView()
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            com.beizi.ad.internal.view.AdWebView r3 = r6.f6615b
            int r3 = r3.getCreativeWidth()
            float r3 = (float) r3
            com.beizi.ad.internal.h r4 = com.beizi.ad.internal.h.a()
            float r4 = r4.f6838k
            float r3 = r3 * r4
            int r3 = (int) r3
            com.beizi.ad.internal.view.AdWebView r4 = r6.f6615b
            int r4 = r4.getCreativeHeight()
            float r4 = (float) r4
            com.beizi.ad.internal.h r5 = com.beizi.ad.internal.h.a()
            float r5 = r5.l
            float r4 = r4 * r5
            int r4 = (int) r4
            r1.<init>(r3, r4, r2)
            r7.addView(r0, r1)
            goto L1b5
        L181:
            android.widget.FrameLayout r7 = r6.f6617d
            com.beizi.ad.internal.view.AdWebView r0 = r6.f6615b
            com.beizi.ad.internal.view.c r0 = r0.getRealDisplayable()
            android.view.View r0 = r0.getView()
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            com.beizi.ad.internal.view.AdWebView r3 = r6.f6615b
            int r3 = r3.getCreativeWidth()
            float r3 = (float) r3
            com.beizi.ad.internal.h r4 = com.beizi.ad.internal.h.a()
            float r4 = r4.f6838k
            float r3 = r3 * r4
            int r3 = (int) r3
            com.beizi.ad.internal.view.AdWebView r4 = r6.f6615b
            int r4 = r4.getCreativeHeight()
            float r4 = (float) r4
            com.beizi.ad.internal.h r5 = com.beizi.ad.internal.h.a()
            float r5 = r5.l
            float r4 = r4 * r5
            int r4 = (int) r4
            r1.<init>(r3, r4, r2)
            r7.addView(r0, r1)
        L1b5:
            com.beizi.ad.internal.view.c r7 = r6.f6616c
            r7.visible()
        L1ba:
            return
    }

    private void h() {
            r1 = this;
            android.app.Activity r0 = r1.a
            if (r0 == 0) goto L1c
            com.beizi.ad.internal.view.InterstitialAdViewImpl r0 = r1.f6619f
            if (r0 == 0) goto L17
            com.beizi.ad.internal.c r0 = r0.getAdDispatcher()
            if (r0 == 0) goto L17
            com.beizi.ad.internal.view.InterstitialAdViewImpl r0 = r1.f6619f
            com.beizi.ad.internal.c r0 = r0.getAdDispatcher()
            r0.b()
        L17:
            android.app.Activity r0 = r1.a
            r0.finish()
        L1c:
            return
    }

    @Override // com.beizi.ad.AdActivity.a
    public void a() {
            r4 = this;
            com.beizi.ad.internal.view.InterstitialAdViewImpl r0 = com.beizi.ad.internal.view.InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE
            if (r0 == 0) goto L95
            java.util.Queue r0 = r0.getAdQueue()
            java.lang.Object r0 = r0.peek()
            if (r0 == 0) goto L95
            com.beizi.ad.internal.view.InterstitialAdViewImpl r0 = com.beizi.ad.internal.view.InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE
            java.util.Queue r0 = r0.getAdQueue()
            java.lang.Object r0 = r0.peek()
            com.beizi.ad.internal.view.e r0 = (com.beizi.ad.internal.view.e) r0
            android.view.View r0 = r0.d()
            boolean r0 = r0 instanceof com.beizi.ad.internal.view.AdWebView
            if (r0 != 0) goto L23
            goto L95
        L23:
            android.app.Activity r0 = r4.a
            int r1 = com.beizi.fusion.R.style.BeiZiDialogStyle
            r0.setTheme(r1)
            com.beizi.ad.internal.view.InterstitialAdViewImpl r0 = com.beizi.ad.internal.view.InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE
            java.util.Queue r0 = r0.getAdQueue()
            java.lang.Object r0 = r0.peek()
            com.beizi.ad.internal.view.e r0 = (com.beizi.ad.internal.view.e) r0
            android.view.View r0 = r0.d()
            com.beizi.ad.internal.view.AdWebView r0 = (com.beizi.ad.internal.view.AdWebView) r0
            android.webkit.WebSettings r1 = r0.getSettings()
            r2 = 1
            r1.setLoadsImagesAutomatically(r2)
            boolean r0 = r0.isVideoFullScreen()
            if (r0 == 0) goto L61
            android.app.Activity r0 = r4.a
            int r1 = com.beizi.fusion.R.style.BeiZiTheme_Transparent
            r0.setTheme(r1)
            android.app.Activity r0 = r4.a
            r0.requestWindowFeature(r2)
            android.app.Activity r0 = r4.a
            android.view.Window r0 = r0.getWindow()
            r1 = 1024(0x400, float:1.435E-42)
            r0.setFlags(r1, r1)
        L61:
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.app.Activity r1 = r4.a
            r0.<init>(r1)
            r4.f6617d = r0
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = 17
            r2 = -1
            r0.<init>(r2, r2, r1)
            android.widget.FrameLayout r1 = r4.f6617d
            r1.setLayoutParams(r0)
            android.app.Activity r0 = r4.a
            android.widget.FrameLayout r1 = r4.f6617d
            r0.setContentView(r1)
            android.app.Activity r0 = r4.a     // Catch: java.lang.Exception -> L90
            android.content.Intent r0 = r0.getIntent()     // Catch: java.lang.Exception -> L90
            java.lang.String r1 = "TIME"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L90
            long r0 = r0.getLongExtra(r1, r2)     // Catch: java.lang.Exception -> L90
            r4.f6618e = r0     // Catch: java.lang.Exception -> L90
        L90:
            com.beizi.ad.internal.view.InterstitialAdViewImpl r0 = com.beizi.ad.internal.view.InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE
            r4.a(r0)
        L95:
            return
    }

    @Override // com.beizi.ad.AdActivity.a
    public void b() {
            r1 = this;
            com.beizi.ad.internal.view.InterstitialAdViewImpl r0 = r1.f6619f
            if (r0 == 0) goto L24
            com.beizi.ad.internal.c r0 = r0.getAdDispatcher()
            if (r0 == 0) goto L24
            com.beizi.ad.internal.view.InterstitialAdViewImpl r0 = r1.f6619f
            boolean r0 = r0.isRewardedVideo()
            if (r0 != 0) goto L24
            android.app.Activity r0 = r1.a
            if (r0 == 0) goto L24
            com.beizi.ad.internal.view.InterstitialAdViewImpl r0 = r1.f6619f
            com.beizi.ad.internal.c r0 = r0.getAdDispatcher()
            r0.b()
            android.app.Activity r0 = r1.a
            r0.finish()
        L24:
            return
    }

    @Override // com.beizi.ad.AdActivity.a
    public void c() {
            r2 = this;
            com.beizi.ad.internal.view.AdWebView r0 = r2.f6615b
            if (r0 == 0) goto L15
            com.beizi.ad.internal.h.u.a(r0)
            com.beizi.ad.internal.view.AdWebView r0 = r2.f6615b
            r0.destroy()
            com.beizi.ad.internal.view.AdWebView r0 = r2.f6615b
            com.beizi.ad.internal.video.AdVideoView r0 = r0.mAdVideoView
            if (r0 == 0) goto L15
            r0.destroy()
        L15:
            com.beizi.ad.internal.view.InterstitialAdViewImpl r0 = r2.f6619f
            if (r0 == 0) goto L1d
            r1 = 0
            r0.setAdImplementation(r1)
        L1d:
            android.app.Activity r0 = r2.a
            r0.finish()
            return
    }

    @Override // com.beizi.ad.AdActivity.a
    public void d() {
            r0 = this;
            return
    }

    @Override // com.beizi.ad.AdActivity.a
    public void e() {
            r1 = this;
            com.beizi.ad.internal.view.InterstitialAdViewImpl r0 = r1.f6619f
            if (r0 == 0) goto Ld
            boolean r0 = r0.shouldDismissOnClick()
            if (r0 == 0) goto Ld
            r1.h()
        Ld:
            return
    }

    @Override // com.beizi.ad.AdActivity.a
    public android.webkit.WebView f() {
            r1 = this;
            com.beizi.ad.internal.view.AdWebView r0 = r1.f6615b
            return r0
    }

    public void g() {
            r5 = this;
            com.beizi.ad.internal.view.AdWebView r0 = r5.f6615b
            if (r0 != 0) goto L5
            goto L3d
        L5:
            com.beizi.ad.internal.view.c r0 = r0.getRealDisplayable()
            com.beizi.ad.internal.view.c r1 = r5.f6616c
            if (r0 == r1) goto L3d
            android.widget.FrameLayout r2 = r5.f6617d
            android.view.View r1 = r1.getView()
            r2.removeView(r1)
            boolean r1 = r0 instanceof com.beizi.ad.internal.video.AdVideoView
            r2 = -1
            if (r1 == 0) goto L2a
            android.widget.FrameLayout r1 = r5.f6617d
            android.view.View r3 = r0.getView()
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r2, r2)
            r1.addView(r3, r4)
            goto L38
        L2a:
            android.widget.FrameLayout r1 = r5.f6617d
            android.view.View r3 = r0.getView()
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r2, r2)
            r1.addView(r3, r4)
        L38:
            r5.f6616c = r0
            r0.visible()
        L3d:
            return
    }
}
