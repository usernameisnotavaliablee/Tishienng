package com.bytedance.adsdk.ugeno.swiper;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class Swiper extends com.bytedance.adsdk.ugeno.swiper.BaseSwiper<com.bytedance.adsdk.ugeno.xt.cw> {

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.cw f1981r;

    public Swiper(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.swiper.BaseSwiper
    public android.view.View ae(int r2) {
            r1 = this;
            java.util.List<T> r0 = r1.j
            java.lang.Object r2 = r0.get(r2)
            com.bytedance.adsdk.ugeno.xt.cw r2 = (com.bytedance.adsdk.ugeno.xt.cw) r2
            android.view.View r2 = r2.g()
            return r2
    }

    public void j(com.bytedance.adsdk.ugeno.cw r1) {
            r0 = this;
            r0.f1981r = r1
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.bytedance.adsdk.ugeno.cw r0 = r1.f1981r
            if (r0 == 0) goto La
            r0.up()
        La:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            com.bytedance.adsdk.ugeno.cw r0 = r1.f1981r
            if (r0 == 0) goto La
            r0.m()
        La:
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.onDraw(r1)
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            com.bytedance.adsdk.ugeno.cw r0 = r1.f1981r
            if (r0 == 0) goto L7
            r0.r()
        L7:
            super.onLayout(r2, r3, r4, r5, r6)
            r2 = r1
            com.bytedance.adsdk.ugeno.cw r0 = r2.f1981r
            if (r0 == 0) goto L12
            r0.j(r3, r4, r5, r6)
        L12:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            com.bytedance.adsdk.ugeno.cw r0 = r1.f1981r
            if (r0 == 0) goto L12
            int[] r2 = r0.j(r2, r3)
            r3 = 0
            r3 = r2[r3]
            r0 = 1
            r2 = r2[r0]
            super.onMeasure(r3, r2)
            goto L15
        L12:
            super.onMeasure(r2, r3)
        L15:
            com.bytedance.adsdk.ugeno.cw r2 = r1.f1981r
            if (r2 == 0) goto L1c
            r2.cw()
        L1c:
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r2, int r3, int r4, int r5) {
            r1 = this;
            super.onSizeChanged(r2, r3, r4, r5)
            com.bytedance.adsdk.ugeno.cw r0 = r1.f1981r
            if (r0 == 0) goto La
            r0.xt(r2, r3, r4, r5)
        La:
            return
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            super.onWindowFocusChanged(r2)
            com.bytedance.adsdk.ugeno.cw r0 = r1.f1981r
            if (r0 == 0) goto La
            r0.j(r2)
        La:
            return
    }
}
