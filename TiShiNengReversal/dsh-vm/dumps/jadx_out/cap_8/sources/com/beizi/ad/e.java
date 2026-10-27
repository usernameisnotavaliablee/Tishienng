package com.beizi.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class e extends android.widget.FrameLayout {
    protected final com.beizi.ad.internal.view.BannerAdViewImpl a;

    public e(android.content.Context r1, android.util.AttributeSet r2, int r3, com.beizi.ad.internal.k r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            com.beizi.ad.internal.view.BannerAdViewImpl r4 = new com.beizi.ad.internal.view.BannerAdViewImpl
            r4.<init>(r1, r2, r3)
            r0.a = r4
            r0.a()
            return
    }

    public e(android.content.Context r1, android.util.AttributeSet r2, com.beizi.ad.internal.k r3) {
            r0 = this;
            r0.<init>(r1, r2)
            com.beizi.ad.internal.view.BannerAdViewImpl r3 = new com.beizi.ad.internal.view.BannerAdViewImpl
            r3.<init>(r1, r2)
            r0.a = r3
            r0.a()
            return
    }

    public e(android.content.Context r1, com.beizi.ad.internal.k r2) {
            r0 = this;
            r0.<init>(r1)
            com.beizi.ad.internal.view.BannerAdViewImpl r2 = new com.beizi.ad.internal.view.BannerAdViewImpl
            r2.<init>(r1)
            r0.a = r2
            r0.a()
            return
    }

    private void a() {
            r1 = this;
            r0 = 0
            r1.setBackgroundColor(r0)
            r1.setPadding(r0, r0, r0, r0)
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            r1.addView(r0)
            return
    }

    public void cancel() {
            r1 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    public com.beizi.ad.a getAdListener() {
            r1 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            com.beizi.ad.a r0 = r0.getAdListener()
            return r0
    }

    public com.beizi.ad.c getAdSize() {
            r1 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            com.beizi.ad.c r0 = r0.getAdSize()
            return r0
    }

    public java.lang.String getAdUnitId() {
            r1 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            java.lang.String r0 = r0.getAdUnitId()
            return r0
    }

    public java.lang.String getPrice() {
            r1 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            java.lang.String r0 = r0.getPrice()
            return r0
    }

    public boolean getResizeAdToFitContainer() {
            r1 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            boolean r0 = r0.getResizeAdToFitContainer()
            return r0
    }

    public void isAutoRefresh() {
            r1 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            r0.isAutoRefresh()
            return
    }

    public boolean isDownloadApp() {
            r1 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.isDownloadApp()
            return r0
    }

    public boolean isLoading() {
            r1 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            boolean r0 = r0.isLoading()
            return r0
    }

    @androidx.annotation.RequiresPermission("android.permission.INTERNET")
    public void loadAd(com.beizi.ad.b r2) {
            r1 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            com.beizi.ad.internal.f.a$a r2 = r2.a()
            r0.loadAd(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            return
    }

    public void onCreateLifeCycle() {
            r0 = this;
            return
    }

    public void onDestoryLifeCycle() {
            r1 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            if (r0 == 0) goto L7
            r0.onDestoryLifeCycle()
        L7:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            if (r0 == 0) goto La
            r0.activityOnDestroy()
        La:
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r8, int r9) {
            r7 = this;
            boolean r0 = r7.getResizeAdToFitContainer()
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L1e
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
            int r9 = android.view.View.MeasureSpec.getSize(r8)
            int r9 = r9 / 6
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r1)
            super.onMeasure(r8, r9)
            return
        L1e:
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            android.view.View.MeasureSpec.getSize(r8)
            int r2 = android.view.View.MeasureSpec.getMode(r9)
            android.view.View.MeasureSpec.getSize(r9)
            r3 = 0
            android.view.View r4 = r7.getChildAt(r3)
            if (r4 == 0) goto L47
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 == r6) goto L47
            r7.measureChild(r4, r8, r9)
            int r3 = r4.getMeasuredWidth()
            int r4 = r4.getMeasuredHeight()
            goto L5f
        L47:
            com.beizi.ad.c r4 = r7.getAdSize()     // Catch: java.lang.NullPointerException -> L4c
            goto L4d
        L4c:
            r4 = 0
        L4d:
            if (r4 == 0) goto L5e
            android.content.Context r3 = r7.getContext()
            int r5 = r4.b(r3)
            int r3 = r4.a(r3)
            r4 = r3
            r3 = r5
            goto L5f
        L5e:
            r4 = 0
        L5f:
            int r5 = r7.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r3, r5)
            int r5 = r7.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r5)
            if (r0 != r1) goto L75
            int r3 = android.view.View.MeasureSpec.getSize(r8)
        L75:
            if (r2 != r1) goto L7b
            int r4 = android.view.View.MeasureSpec.getSize(r9)
        L7b:
            int r8 = android.view.View.resolveSize(r3, r8)
            int r9 = android.view.View.resolveSize(r4, r9)
            r7.setMeasuredDimension(r8, r9)
            return
    }

    public void onPauseLifeCycle() {
            r0 = this;
            return
    }

    public void onRestartLifeCycle() {
            r0 = this;
            return
    }

    public void onResumeLifeCycle() {
            r0 = this;
            return
    }

    public void onStartLifeCycle() {
            r0 = this;
            return
    }

    public void onStopLifeCycle() {
            r0 = this;
            return
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int r2) {
            r1 = this;
            r0 = 8
            if (r2 != r0) goto La
            com.beizi.ad.internal.view.BannerAdViewImpl r2 = r1.a
            r2.activityOnPause()
            return
        La:
            com.beizi.ad.internal.view.BannerAdViewImpl r2 = r1.a
            r2.activityOnResume()
            return
    }

    public void openAdInNativeBrowser(boolean r2) {
            r1 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            r0.openAdInNativeBrowser(r2)
            return
    }

    public void resume() {
            r1 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            r0.activityOnResume()
            return
    }

    public void setAdListener(com.beizi.ad.a r2) {
            r1 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            r0.setAdListener(r2)
            return
    }

    void setAdSize(com.beizi.ad.c r3) {
            r2 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r2.a
            int r1 = r3.b()
            int r3 = r3.a()
            r0.setAdSize(r1, r3)
            return
    }

    public void setAdUnitId(java.lang.String r2) {
            r1 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            r0.setAdUnitId(r2)
            return
    }

    public void setAutoRefresh(boolean r2) {
            r1 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            r0.setAutoRefresh(r2)
            return
    }

    public void setCloseMarketDialog(boolean r2) {
            r1 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            if (r0 == 0) goto L7
            r0.setCloseMarketDialog(r2)
        L7:
            return
    }

    public void setResizeAdToFitContainer(boolean r3) {
            r2 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r2.a
            r0.setResizeAdToFitContainer(r3)
            boolean r3 = r2.getResizeAdToFitContainer()
            if (r3 == 0) goto L16
            com.beizi.ad.internal.view.BannerAdViewImpl r3 = r2.a
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            r3.setLayoutParams(r0)
        L16:
            return
    }

    public void setTransitionDerection(com.beizi.ad.internal.animation.g r2) {
            r1 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            r0.setTransitionDirection(r2)
            return
    }

    public void setTransitionDuration(int r4) {
            r3 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r3.a
            long r1 = (long) r4
            r0.setTransitionDuration(r1)
            return
    }

    public void setTransitionType(com.beizi.ad.internal.animation.h r2) {
            r1 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = r1.a
            r0.setTransitionType(r2)
            return
    }
}
