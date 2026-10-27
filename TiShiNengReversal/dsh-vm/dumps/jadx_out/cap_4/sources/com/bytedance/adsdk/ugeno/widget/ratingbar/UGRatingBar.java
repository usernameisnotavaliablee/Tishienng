package com.bytedance.adsdk.ugeno.widget.ratingbar;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class UGRatingBar extends android.widget.FrameLayout {
    private android.content.Context ae;
    private double cw;
    private float j;

    /* renamed from: m, reason: collision with root package name */
    private android.widget.LinearLayout f2018m;

    /* renamed from: r, reason: collision with root package name */
    private float f2019r;
    private com.bytedance.adsdk.ugeno.cw tl;
    private android.widget.LinearLayout up;
    private float xt;

    public UGRatingBar(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r2.ae = r3
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r3)
            r2.up = r0
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r3)
            r2.f2018m = r0
            android.widget.LinearLayout r3 = r2.up
            r0 = 0
            r3.setOrientation(r0)
            android.widget.LinearLayout r3 = r2.up
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r1)
            android.widget.LinearLayout r3 = r2.f2018m
            r3.setOrientation(r0)
            android.widget.LinearLayout r3 = r2.f2018m
            r3.setGravity(r1)
            return
    }

    private android.widget.ImageView getStarImageView() {
            r4 = this;
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            float r2 = r4.j
            int r2 = (int) r2
            float r3 = r4.xt
            int r3 = (int) r3
            r1.<init>(r2, r3)
            float r2 = r4.f2019r
            int r3 = (int) r2
            r1.leftMargin = r3
            r3 = 0
            r1.topMargin = r3
            int r2 = (int) r2
            r1.rightMargin = r2
            r2 = 1
            r1.bottomMargin = r2
            r0.setLayoutParams(r1)
            return r0
    }

    public void j(double r2, int r4, int r5, float r6, int r7) {
            r1 = this;
            r1.removeAllViews()
            android.widget.LinearLayout r0 = r1.up
            r0.removeAllViews()
            android.widget.LinearLayout r0 = r1.f2018m
            r0.removeAllViews()
            android.content.Context r0 = r1.ae
            float r0 = com.bytedance.adsdk.ugeno.m.tl.j(r0, r6)
            int r0 = (int) r0
            float r0 = (float) r0
            r1.j = r0
            android.content.Context r0 = r1.ae
            float r6 = com.bytedance.adsdk.ugeno.m.tl.j(r0, r6)
            int r6 = (int) r6
            float r6 = (float) r6
            r1.xt = r6
            r1.cw = r2
            float r2 = (float) r7
            r1.f2019r = r2
            r2 = 0
            r3 = 0
        L28:
            java.lang.String r6 = "tt_ugen_rating_star"
            r7 = 5
            if (r3 >= r7) goto L4c
            android.widget.ImageView r7 = r1.getStarImageView()
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
            r7.setScaleType(r0)
            android.content.Context r0 = r1.ae
            int r6 = com.bytedance.adsdk.ugeno.m.r.xt(r0, r6)
            r7.setImageResource(r6)
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_IN
            r7.setColorFilter(r4, r6)
            android.widget.LinearLayout r6 = r1.f2018m
            r6.addView(r7)
            int r3 = r3 + 1
            goto L28
        L4c:
            if (r2 >= r7) goto L6b
            android.widget.ImageView r3 = r1.getStarImageView()
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_XY
            r3.setScaleType(r4)
            android.content.Context r4 = r1.ae
            int r4 = com.bytedance.adsdk.ugeno.m.r.xt(r4, r6)
            r3.setImageResource(r4)
            r3.setColorFilter(r5)
            android.widget.LinearLayout r4 = r1.up
            r4.addView(r3)
            int r2 = r2 + 1
            goto L4c
        L6b:
            android.widget.LinearLayout r2 = r1.up
            r1.addView(r2)
            android.widget.LinearLayout r2 = r1.f2018m
            r1.addView(r2)
            r1.requestLayout()
            return
    }

    public void j(com.bytedance.adsdk.ugeno.cw r1) {
            r0 = this;
            r0.tl = r1
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.bytedance.adsdk.ugeno.cw r0 = r1.tl
            if (r0 == 0) goto La
            r0.up()
        La:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            com.bytedance.adsdk.ugeno.cw r0 = r1.tl
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
            com.bytedance.adsdk.ugeno.cw r0 = r1.tl
            if (r0 == 0) goto L7
            r0.j(r3, r4, r5, r6)
        L7:
            super.onLayout(r2, r3, r4, r5, r6)
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r6, int r7) {
            r5 = this;
            com.bytedance.adsdk.ugeno.cw r0 = r5.tl
            if (r0 == 0) goto L7
            r0.j(r6, r7)
        L7:
            super.onMeasure(r6, r7)
            android.widget.LinearLayout r0 = r5.up
            r0.measure(r6, r7)
            double r6 = r5.cw
            double r6 = java.lang.Math.floor(r6)
            float r0 = r5.f2019r
            float r1 = r0 + r0
            float r2 = r5.j
            float r1 = r1 + r2
            double r3 = (double) r1
            double r3 = r3 * r6
            double r0 = (double) r0
            double r3 = r3 + r0
            double r0 = r5.cw
            double r0 = r0 - r6
            double r6 = (double) r2
            double r0 = r0 * r6
            double r3 = r3 + r0
            android.widget.LinearLayout r6 = r5.f2018m
            int r7 = (int) r3
            r0 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r0)
            android.widget.LinearLayout r1 = r5.up
            int r1 = r1.getMeasuredHeight()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            r6.measure(r7, r0)
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r2, int r3, int r4, int r5) {
            r1 = this;
            super.onSizeChanged(r2, r3, r4, r5)
            com.bytedance.adsdk.ugeno.cw r0 = r1.tl
            if (r0 == 0) goto La
            r0.xt(r2, r3, r4, r5)
        La:
            return
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            super.onWindowFocusChanged(r2)
            com.bytedance.adsdk.ugeno.cw r0 = r1.tl
            if (r0 == 0) goto La
            r0.j(r2)
        La:
            return
    }
}
