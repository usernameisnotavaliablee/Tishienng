package com.beizi.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class BannerAdView extends com.beizi.ad.e {

    /* renamed from: b, reason: collision with root package name */
    private int f6427b;

    /* renamed from: c, reason: collision with root package name */
    private int f6428c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f6429d;

    /* renamed from: e, reason: collision with root package name */
    private int f6430e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f6431f;

    /* renamed from: g, reason: collision with root package name */
    private java.util.List<android.util.Pair<java.lang.String, java.lang.Integer>> f6432g;

    /* renamed from: h, reason: collision with root package name */
    private android.view.View f6433h;

    public BannerAdView(android.content.Context r2) {
            r1 = this;
            com.beizi.ad.internal.k r0 = com.beizi.ad.internal.k.f7002d
            r1.<init>(r2, r0)
            return
    }

    public BannerAdView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            com.beizi.ad.internal.k r0 = com.beizi.ad.internal.k.f7002d
            r1.<init>(r2, r3, r0)
            return
    }

    public BannerAdView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            com.beizi.ad.internal.k r0 = com.beizi.ad.internal.k.f7002d
            r1.<init>(r2, r3, r4, r0)
            return
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ void cancel() {
            r0 = this;
            super.cancel()
            return
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ com.beizi.ad.a getAdListener() {
            r1 = this;
            com.beizi.ad.a r0 = super.getAdListener()
            return r0
    }

    public int getAdOptimizePercent() {
            r1 = this;
            int r0 = r1.f6427b
            return r0
    }

    public int getAdOptimizeSize() {
            r1 = this;
            int r0 = r1.f6428c
            return r0
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ com.beizi.ad.c getAdSize() {
            r1 = this;
            com.beizi.ad.c r0 = super.getAdSize()
            return r0
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ java.lang.String getAdUnitId() {
            r1 = this;
            java.lang.String r0 = super.getAdUnitId()
            return r0
    }

    public java.lang.String getDirection() {
            r1 = this;
            java.lang.String r0 = r1.f6431f
            return r0
    }

    public java.util.List<android.util.Pair<java.lang.String, java.lang.Integer>> getOrderOptimizeList() {
            r1 = this;
            java.util.List<android.util.Pair<java.lang.String, java.lang.Integer>> r0 = r1.f6432g
            return r0
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ java.lang.String getPrice() {
            r1 = this;
            java.lang.String r0 = super.getPrice()
            return r0
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ boolean getResizeAdToFitContainer() {
            r1 = this;
            boolean r0 = super.getResizeAdToFitContainer()
            return r0
    }

    public java.lang.String getScrollDistance() {
            r1 = this;
            java.lang.String r0 = r1.f6429d
            return r0
    }

    public int getScrollDistancePercent() {
            r1 = this;
            int r0 = r1.f6430e
            return r0
    }

    public int getValidOptimizePercent() {
            r6 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r6.a
            r1 = -1
            if (r0 == 0) goto L39
            java.lang.String r0 = r0.getLandingPageUrl()
            if (r0 == 0) goto L39
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r6.a
            java.lang.String r0 = r0.getLandingPageUrl()
            java.util.List<android.util.Pair<java.lang.String, java.lang.Integer>> r2 = r6.f6432g
            if (r2 == 0) goto L39
            java.util.Iterator r2 = r2.iterator()
            r3 = -1
        L1a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r2.next()
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r5 = r4.first
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = r0.contains(r5)
            if (r5 == 0) goto L1a
            java.lang.Object r3 = r4.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L1a
        L39:
            r3 = -1
        L3a:
            if (r3 != r1) goto L3f
            int r0 = r6.f6427b
            return r0
        L3f:
            return r3
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ void isAutoRefresh() {
            r0 = this;
            super.isAutoRefresh()
            return
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ boolean isDownloadApp() {
            r1 = this;
            boolean r0 = super.isDownloadApp()
            return r0
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ boolean isLoading() {
            r1 = this;
            boolean r0 = super.isLoading()
            return r0
    }

    @Override // com.beizi.ad.e
    @androidx.annotation.RequiresPermission("android.permission.INTERNET")
    public /* bridge */ /* synthetic */ void loadAd(com.beizi.ad.b r1) {
            r0 = this;
            super.loadAd(r1)
            return
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ void onCreateLifeCycle() {
            r0 = this;
            super.onCreateLifeCycle()
            return
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ void onDestoryLifeCycle() {
            r0 = this;
            super.onDestoryLifeCycle()
            return
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ void onPauseLifeCycle() {
            r0 = this;
            super.onPauseLifeCycle()
            return
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ void onRestartLifeCycle() {
            r0 = this;
            super.onRestartLifeCycle()
            return
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ void onResumeLifeCycle() {
            r0 = this;
            super.onResumeLifeCycle()
            return
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ void onStartLifeCycle() {
            r0 = this;
            super.onStartLifeCycle()
            return
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ void onStopLifeCycle() {
            r0 = this;
            super.onStopLifeCycle()
            return
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ void openAdInNativeBrowser(boolean r1) {
            r0 = this;
            super.openAdInNativeBrowser(r1)
            return
    }

    public void optimizeClickArea(int r5, android.view.View r6, android.view.View r7, java.lang.String r8) {
            r4 = this;
            int r0 = r4.getValidOptimizePercent()
            boolean r1 = com.beizi.ad.lance.a.p.a(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "percent = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ",isPass = "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "BeiZisAd"
            com.beizi.ad.lance.a.m.c(r2, r0)
            if (r1 == 0) goto L2e
            android.view.View r5 = com.beizi.ad.lance.a.g.a(r5, r6, r7, r8)
            r4.f6433h = r5
        L2e:
            return
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ void resume() {
            r0 = this;
            super.resume()
            return
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ void setAdListener(com.beizi.ad.a r1) {
            r0 = this;
            super.setAdListener(r1)
            return
    }

    public void setAdOptimizePercent(int r1) {
            r0 = this;
            r0.f6427b = r1
            return
    }

    public void setAdOptimizeSize(int r1) {
            r0 = this;
            r0.f6428c = r1
            return
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ void setAdUnitId(java.lang.String r1) {
            r0 = this;
            super.setAdUnitId(r1)
            return
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ void setAutoRefresh(boolean r1) {
            r0 = this;
            super.setAutoRefresh(r1)
            return
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ void setCloseMarketDialog(boolean r1) {
            r0 = this;
            super.setCloseMarketDialog(r1)
            return
    }

    public void setDirection(java.lang.String r1) {
            r0 = this;
            r0.f6431f = r1
            return
    }

    public void setOrderOptimizeList(java.util.List<android.util.Pair<java.lang.String, java.lang.Integer>> r1) {
            r0 = this;
            r0.f6432g = r1
            return
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ void setResizeAdToFitContainer(boolean r1) {
            r0 = this;
            super.setResizeAdToFitContainer(r1)
            return
    }

    public void setScrollDistance(java.lang.String r1) {
            r0 = this;
            r0.f6429d = r1
            return
    }

    public void setScrollDistancePercent(int r1) {
            r0 = this;
            r0.f6430e = r1
            return
    }

    public void setTouchAreaNormal() {
            r1 = this;
            android.view.View r0 = r1.f6433h
            if (r0 == 0) goto L7
            com.beizi.ad.internal.h.u.a(r0)
        L7:
            return
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ void setTransitionDerection(com.beizi.ad.internal.animation.g r1) {
            r0 = this;
            super.setTransitionDerection(r1)
            return
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ void setTransitionDuration(int r1) {
            r0 = this;
            super.setTransitionDuration(r1)
            return
    }

    @Override // com.beizi.ad.e
    public /* bridge */ /* synthetic */ void setTransitionType(com.beizi.ad.internal.animation.h r1) {
            r0 = this;
            super.setTransitionType(r1)
            return
    }
}
