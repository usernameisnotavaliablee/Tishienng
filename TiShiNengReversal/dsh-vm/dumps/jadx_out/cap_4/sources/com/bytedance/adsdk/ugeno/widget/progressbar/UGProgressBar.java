package com.bytedance.adsdk.ugeno.widget.progressbar;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class UGProgressBar extends android.widget.FrameLayout {
    private android.view.View cw;
    private com.bytedance.adsdk.ugeno.cw j;

    /* renamed from: r, reason: collision with root package name */
    private android.widget.TextView f2017r;
    private int up;
    private android.view.View xt;

    public UGProgressBar(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.j(r1)
            return
    }

    private int j(int r3, int r4) {
            r2 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto Ld
            return r4
        Ld:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L15
            int r3 = java.lang.Math.min(r3, r4)
        L15:
            return r3
    }

    private void j(android.content.Context r4) {
            r3 = this;
            android.view.View r0 = new android.view.View
            r0.<init>(r4)
            r3.xt = r0
            android.view.View r0 = new android.view.View
            r0.<init>(r4)
            r3.cw = r0
            android.view.View r0 = r3.xt
            r3.addView(r0)
            android.view.View r0 = r3.cw
            r3.addView(r0)
            android.view.View r0 = r3.xt
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r1 = 0
            r0.width = r1
            r1 = -1
            r0.height = r1
            r2 = 3
            r0.gravity = r2
            android.view.View r2 = r3.xt
            r2.setLayoutParams(r0)
            android.view.View r0 = r3.cw
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r2 = r3.up
            r0.width = r2
            r2 = 5
            r0.gravity = r2
            android.view.View r2 = r3.cw
            r2.setLayoutParams(r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r4)
            r3.f2017r = r0
            r0.setTextColor(r1)
            android.widget.TextView r4 = r3.f2017r
            r0 = 1098907648(0x41800000, float:16.0)
            r4.setTextSize(r0)
            android.widget.TextView r4 = r3.f2017r
            r0 = 17
            r4.setGravity(r0)
            android.widget.TextView r4 = r3.f2017r
            r3.addView(r4)
            return
    }

    public void j(com.bytedance.adsdk.ugeno.cw r1) {
            r0 = this;
            r0.j = r1
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.bytedance.adsdk.ugeno.cw r0 = r1.j
            if (r0 == 0) goto La
            r0.up()
        La:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            com.bytedance.adsdk.ugeno.cw r0 = r1.j
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
            com.bytedance.adsdk.ugeno.cw r0 = r1.j
            if (r0 == 0) goto L7
            r0.j(r3, r4, r5, r6)
        L7:
            super.onLayout(r2, r3, r4, r5, r6)
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            com.bytedance.adsdk.ugeno.cw r0 = r1.j
            if (r0 == 0) goto L7
            r0.j(r2, r3)
        L7:
            super.onMeasure(r2, r3)
            r3 = 0
            int r2 = r1.j(r3, r2)
            r1.up = r2
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r2, int r3, int r4, int r5) {
            r1 = this;
            super.onSizeChanged(r2, r3, r4, r5)
            r1.up = r2
            com.bytedance.adsdk.ugeno.cw r0 = r1.j
            if (r0 == 0) goto Lc
            r0.xt(r2, r3, r4, r5)
        Lc:
            return
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            super.onWindowFocusChanged(r2)
            com.bytedance.adsdk.ugeno.cw r0 = r1.j
            if (r0 == 0) goto La
            r0.j(r2)
        La:
            return
    }

    public void setProgress(float r5) {
            r4 = this;
            int r0 = r4.getWidth()
            android.view.View r1 = r4.xt
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r2 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 / r2
            float r2 = (float) r0
            float r5 = r5 * r2
            int r3 = (int) r5
            r1.width = r3
            android.view.View r3 = r4.xt
            r3.setLayoutParams(r1)
            android.view.View r1 = r4.cw
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            float r2 = r2 - r5
            int r5 = (int) r2
            r1.width = r5
            android.view.View r5 = r4.cw
            r5.setLayoutParams(r1)
            android.widget.TextView r5 = r4.f2017r
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
            r5.width = r0
            r0 = 17
            r5.gravity = r0
            r4.requestLayout()
            return
    }

    public void setProgressBgColor(int r2) {
            r1 = this;
            android.view.View r0 = r1.cw
            r0.setBackgroundColor(r2)
            return
    }

    public void setProgressColor(int r2) {
            r1 = this;
            android.view.View r0 = r1.xt
            r0.setBackgroundColor(r2)
            return
    }

    public void setText(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.f2017r
            r0.setText(r2)
            return
    }

    public void setTextColor(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.f2017r
            r0.setTextColor(r2)
            return
    }
}
