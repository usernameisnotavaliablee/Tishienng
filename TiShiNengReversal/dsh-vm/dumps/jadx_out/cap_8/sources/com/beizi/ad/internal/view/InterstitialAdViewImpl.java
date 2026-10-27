package com.beizi.ad.internal.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class InterstitialAdViewImpl extends com.beizi.ad.internal.view.AdViewImpl {
    public static final java.lang.String INTENT_KEY_CLOSE_BUTTON_DELAY = "CLOSE_BUTTON_DELAY";
    public static final java.lang.String INTENT_KEY_TIME = "TIME";
    public static com.beizi.ad.internal.view.InterstitialAdViewImpl INTERSTITIALADVIEW_TO_USE = null;
    public static final long MAX_AGE = 270000;
    protected boolean m;
    protected boolean n;
    private int o;
    private int p;
    private boolean q;
    private java.util.Queue<com.beizi.ad.internal.view.e> r;
    private com.beizi.ad.AdActivity.a s;
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean t;

    public InterstitialAdViewImpl(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.o = r1
            r2 = 10000(0x2710, float:1.4013E-41)
            r0.p = r2
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r0.r = r2
            r2 = 0
            r0.s = r2
            r0.m = r1
            r0.n = r1
            return
    }

    public InterstitialAdViewImpl(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.o = r1
            r2 = 10000(0x2710, float:1.4013E-41)
            r0.p = r2
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r0.r = r2
            r2 = 0
            r0.s = r2
            r0.m = r1
            r0.n = r1
            return
    }

    public InterstitialAdViewImpl(android.content.Context r2, boolean r3, boolean r4) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            r1.o = r2
            r0 = 10000(0x2710, float:1.4013E-41)
            r1.p = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.r = r0
            r0 = 0
            r1.s = r0
            r1.m = r2
            r1.n = r2
            r1.f7098j = r3
            r1.f7099k = r4
            if (r3 == 0) goto L23
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.o = r2
            return
        L23:
            if (r4 == 0) goto L28
            r1.o = r2
            return
        L28:
            r3 = 51
            int r2 = android.graphics.Color.argb(r3, r2, r2, r2)
            r1.o = r2
            return
    }

    private boolean a(long r9) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Queue<com.beizi.ad.internal.view.e> r1 = r8.r
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r1.next()
            com.beizi.ad.internal.view.e r2 = (com.beizi.ad.internal.view.e) r2
            if (r2 == 0) goto L45
            long r3 = r2.a()
            long r3 = r9 - r3
            r5 = 270000(0x41eb0, double:1.333977E-318)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L45
            long r3 = r2.a()
            long r3 = r9 - r3
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L45
            boolean r3 = r2.b()
            if (r3 == 0) goto L43
            com.beizi.ad.internal.d.b r3 = r2.c()
            boolean r3 = r3.d()
            if (r3 == 0) goto L43
            goto L45
        L43:
            r9 = 1
            goto L4a
        L45:
            r0.add(r2)
            goto Lb
        L49:
            r9 = 0
        L4a:
            java.util.Iterator r10 = r0.iterator()
        L4e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r0 = r10.next()
            com.beizi.ad.internal.view.e r0 = (com.beizi.ad.internal.view.e) r0
            java.util.Queue<com.beizi.ad.internal.view.e> r1 = r8.r
            r1.remove(r0)
            goto L4e
        L60:
            return r9
    }

    private boolean b(com.beizi.ad.internal.view.c r1) {
            r0 = this;
            if (r1 == 0) goto Lb
            boolean r1 = r1.failed()
            if (r1 == 0) goto L9
            goto Lb
        L9:
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    protected void a(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            super.a(r3, r4)
            com.beizi.ad.internal.d r3 = r2.mAdFetcher
            r4 = -1
            r3.a(r4)
            com.beizi.ad.internal.e r3 = r2.f7096h
            com.beizi.ad.internal.k r4 = com.beizi.ad.internal.k.f7003e
            r3.a(r4)
            android.view.ViewParent r3 = r2.getParent()     // Catch: java.lang.Throwable -> L40
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L40
            int r4 = r3.getMeasuredHeight()     // Catch: java.lang.Throwable -> L40
            int r3 = r3.getMeasuredHeight()     // Catch: java.lang.Throwable -> L40
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()     // Catch: java.lang.Throwable -> L40
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L40
            float r1 = r0.h()     // Catch: java.lang.Throwable -> L40
            float r4 = r4 / r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r1
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L40
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L40
            float r0 = r0.g()     // Catch: java.lang.Throwable -> L40
            float r3 = r3 / r0
            float r3 = r3 + r1
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L40
            com.beizi.ad.internal.e r0 = r2.f7096h     // Catch: java.lang.Throwable -> L40
            r0.c(r3)     // Catch: java.lang.Throwable -> L40
            com.beizi.ad.internal.e r3 = r2.f7096h     // Catch: java.lang.Throwable -> L40
            r3.d(r4)     // Catch: java.lang.Throwable -> L40
        L40:
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    protected void a(com.beizi.ad.internal.d.e r6) {
            r5 = this;
            boolean r0 = r5.b(r6)
            if (r0 != 0) goto L7
            goto L35
        L7:
            com.beizi.ad.internal.view.c r0 = r5.f7091c
            if (r0 == 0) goto Le
            r0.destroy()
        Le:
            boolean r0 = r5.m
            if (r0 != 0) goto L30
            boolean r0 = r5.n
            if (r0 != 0) goto L30
            r5.f7091c = r6
            java.util.Queue<com.beizi.ad.internal.view.e> r0 = r5.r
            com.beizi.ad.internal.view.d r1 = new com.beizi.ad.internal.view.d
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 1
            com.beizi.ad.internal.d.b r4 = r6.a()
            r1.<init>(r6, r2, r3, r4)
            r0.add(r1)
            return
        L30:
            if (r6 == 0) goto L35
            r6.destroy()
        L35:
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    protected void a(com.beizi.ad.internal.view.c r6) {
            r5 = this;
            boolean r0 = r5.b(r6)
            if (r0 != 0) goto L7
            goto L32
        L7:
            com.beizi.ad.internal.view.c r0 = r5.f7091c
            if (r0 == 0) goto Le
            r0.destroy()
        Le:
            boolean r0 = r5.m
            if (r0 != 0) goto L2d
            boolean r0 = r5.n
            if (r0 != 0) goto L2d
            r5.f7091c = r6
            java.util.Queue<com.beizi.ad.internal.view.e> r0 = r5.r
            com.beizi.ad.internal.view.d r1 = new com.beizi.ad.internal.view.d
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r4 = 0
            r1.<init>(r6, r2, r3, r4)
            r0.add(r1)
            return
        L2d:
            if (r6 == 0) goto L32
            r6.destroy()
        L32:
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void activityOnDestroy() {
            r1 = this;
            r0 = 1
            r1.m = r0
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void activityOnPause() {
            r1 = this;
            r0 = 1
            r1.n = r0
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void activityOnResume() {
            r1 = this;
            r0 = 0
            r1.n = r0
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    protected void b(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            int[] r0 = com.beizi.fusion.R.styleable.AdView
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r0)
            int r7 = r6.getIndexCount()
            r0 = 0
            r1 = 0
        Lc:
            if (r1 >= r7) goto L54
            int r2 = r6.getIndex(r1)
            int r3 = com.beizi.fusion.R.styleable.AdView_beizi_adUnitId
            if (r2 != r3) goto L1e
            java.lang.String r2 = r6.getString(r2)
            r5.setAdUnitId(r2)
            goto L51
        L1e:
            int r3 = com.beizi.fusion.R.styleable.AdView_test
            if (r2 != r3) goto L2d
            com.beizi.ad.internal.h r3 = com.beizi.ad.internal.h.a()
            boolean r2 = r6.getBoolean(r2, r0)
            r3.f6834d = r2
            goto L51
        L2d:
            int r3 = com.beizi.fusion.R.styleable.AdView_opens_native_browser
            if (r2 != r3) goto L39
            boolean r2 = r6.getBoolean(r2, r0)
            r5.setOpensNativeBrowser(r2)
            goto L51
        L39:
            int r3 = com.beizi.fusion.R.styleable.AdView_show_loading_indicator
            r4 = 1
            if (r2 != r3) goto L46
            boolean r2 = r6.getBoolean(r2, r4)
            r5.setShowLoadingIndicator(r2)
            goto L51
        L46:
            int r3 = com.beizi.fusion.R.styleable.AdView_load_landing_page_in_background
            if (r2 != r3) goto L51
            boolean r2 = r6.getBoolean(r2, r4)
            r5.setLoadsInBackground(r2)
        L51:
            int r1 = r1 + 1
            goto Lc
        L54:
            r6.recycle()
            return
    }

    public void cancel() {
            r1 = this;
            com.beizi.ad.internal.d r0 = r1.mAdFetcher
            if (r0 == 0) goto L7
            r0.a()
        L7:
            r0 = 0
            com.beizi.ad.internal.view.InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE = r0
            java.util.Queue<com.beizi.ad.internal.view.e> r0 = r1.r
            r0.clear()
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    boolean d() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void destroy() {
            r1 = this;
            super.destroy()
            com.beizi.ad.internal.d r0 = r1.mAdFetcher
            if (r0 == 0) goto La
            r0.a()
        La:
            java.util.Queue<com.beizi.ad.internal.view.e> r0 = r1.r
            r0.clear()
            r0 = 0
            com.beizi.ad.internal.view.InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE = r0
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    boolean e() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    void f() {
            r1 = this;
            com.beizi.ad.AdActivity$a r0 = r1.s
            if (r0 == 0) goto L7
            r0.d()
        L7:
            return
    }

    void g() {
            r1 = this;
            com.beizi.ad.AdActivity$a r0 = r1.s
            if (r0 == 0) goto L7
            r0.e()
        L7:
            return
    }

    public com.beizi.fusion.model.AdSpacesBean.BuyerBean getAdBuyerBean() {
            r1 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r1.t
            return r0
    }

    public com.beizi.ad.AdActivity.a getAdImplementation() {
            r1 = this;
            com.beizi.ad.AdActivity$a r0 = r1.s
            return r0
    }

    public java.util.Queue<com.beizi.ad.internal.view.e> getAdQueue() {
            r1 = this;
            java.util.Queue<com.beizi.ad.internal.view.e> r0 = r1.r
            return r0
    }

    public int getBackgroundColor() {
            r1 = this;
            int r0 = r1.o
            return r0
    }

    public int getCloseButtonDelay() {
            r1 = this;
            int r0 = r1.p
            return r0
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public int getCreativeHeight() {
            r1 = this;
            r0 = -1
            return r0
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public int getCreativeWidth() {
            r1 = this;
            r0 = -1
            return r0
    }

    @Override // com.beizi.ad.internal.a
    public com.beizi.ad.internal.k getMediaType() {
            r1 = this;
            com.beizi.ad.internal.k r0 = com.beizi.ad.internal.k.f7003e
            return r0
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public boolean loadAd(com.beizi.ad.internal.f.a.C0104a r3) {
            r2 = this;
            com.beizi.ad.internal.e r0 = r2.getAdParameters()
            r1 = 0
            r0.a(r1)
            r2.f7097i = r3
            boolean r3 = r2.isReadyToStart()
            if (r3 != 0) goto L11
            return r1
        L11:
            com.beizi.ad.internal.d r3 = r2.mAdFetcher
            if (r3 == 0) goto L23
            r3.a()
            com.beizi.ad.internal.d r3 = r2.mAdFetcher
            r3.b()
            r3 = 1
            r2.loadCount = r3
            r2.clickCount = r1
            return r3
        L23:
            return r1
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void onCreateLifeCycle() {
            r0 = this;
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void onDestoryLifeCycle() {
            r1 = this;
            com.beizi.ad.internal.d r0 = r1.mAdFetcher
            if (r0 == 0) goto L7
            r0.a()
        L7:
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void onPauseLifeCycle() {
            r0 = this;
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void onRestartLifeCycle() {
            r0 = this;
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void onResumeLifeCycle() {
            r0 = this;
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void onStartLifeCycle() {
            r0 = this;
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void onStopLifeCycle() {
            r0 = this;
            return
    }

    public void setAdBuyerBean(com.beizi.fusion.model.AdSpacesBean.BuyerBean r1) {
            r0 = this;
            r0.t = r1
            return
    }

    public void setAdImplementation(com.beizi.ad.AdActivity.a r1) {
            r0 = this;
            r0.s = r1
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r1) {
            r0 = this;
            r0.o = r1
            return
    }

    public void setCloseButtonDelay(int r2) {
            r1 = this;
            r0 = 10000(0x2710, float:1.4013E-41)
            int r2 = java.lang.Math.min(r2, r0)
            r1.p = r2
            return
    }

    public void setDismissOnClick(boolean r1) {
            r0 = this;
            r0.q = r1
            return
    }

    public boolean shouldDismissOnClick() {
            r1 = this;
            boolean r0 = r1.q
            return r0
    }

    public int show() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            boolean r2 = r5.a(r0)
            java.util.Queue<com.beizi.ad.internal.view.e> r3 = r5.r
            java.lang.Object r3 = r3.peek()
            com.beizi.ad.internal.view.e r3 = (com.beizi.ad.internal.view.e) r3
            if (r3 == 0) goto L31
            boolean r4 = r3.b()
            if (r4 == 0) goto L31
            com.beizi.ad.internal.d.b r4 = r3.c()
            if (r4 == 0) goto L31
            com.beizi.ad.internal.d.b r0 = r3.c()
            r0.c()
            java.util.Queue<com.beizi.ad.internal.view.e> r0 = r5.r
            r0.poll()
            java.util.Queue<com.beizi.ad.internal.view.e> r0 = r5.r
            int r0 = r0.size()
            return r0
        L31:
            if (r2 == 0) goto L72
            boolean r2 = r5.m
            if (r2 != 0) goto L72
            java.lang.Class r2 = com.beizi.ad.AdActivity.a()
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r4 = r5.getContext()
            r3.<init>(r4, r2)
            java.lang.String r2 = "ACTIVITY_TYPE"
            java.lang.String r4 = "INTERSTITIAL"
            r3.putExtra(r2, r4)
            java.lang.String r2 = "TIME"
            r3.putExtra(r2, r0)
            java.lang.String r0 = "CLOSE_BUTTON_DELAY"
            int r1 = r5.p
            r3.putExtra(r0, r1)
            com.beizi.ad.internal.view.InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE = r5
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r3.setFlags(r0)     // Catch: android.content.ActivityNotFoundException -> L66
            android.content.Context r0 = r5.getContext()     // Catch: android.content.ActivityNotFoundException -> L66
            r0.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L66
            goto L69
        L66:
            r0 = 0
            com.beizi.ad.internal.view.InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE = r0
        L69:
            java.util.Queue<com.beizi.ad.internal.view.e> r0 = r5.r
            int r0 = r0.size()
            int r0 = r0 + (-1)
            return r0
        L72:
            java.util.Queue<com.beizi.ad.internal.view.e> r0 = r5.r
            int r0 = r0.size()
            return r0
    }

    public void showInterstitial(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "BeiZisAd"
            java.lang.String r1 = "showInterstitial"
            com.beizi.ad.lance.a.m.c(r0, r1)
            com.beizi.ad.internal.view.InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE = r2
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.beizi.ad.internal.activity.BeiZiInterstitialActivity> r1 = com.beizi.ad.internal.activity.BeiZiInterstitialActivity.class
            r0.<init>(r3, r1)
            r3.startActivity(r0)
            return
    }
}
