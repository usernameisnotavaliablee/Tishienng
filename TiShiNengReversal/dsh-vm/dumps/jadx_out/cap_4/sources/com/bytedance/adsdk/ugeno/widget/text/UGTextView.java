package com.bytedance.adsdk.ugeno.widget.text;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class UGTextView extends android.widget.TextView implements com.bytedance.adsdk.ugeno.cw.up, com.bytedance.adsdk.ugeno.j.ae {
    private com.bytedance.adsdk.ugeno.j.tl cw;
    private com.bytedance.adsdk.ugeno.cw j;
    private float xt;

    public UGTextView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            com.bytedance.adsdk.ugeno.j.tl r1 = new com.bytedance.adsdk.ugeno.j.tl
            r1.<init>(r0)
            r0.cw = r1
            return
    }

    public float getBorderRadius() {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.cw
            float r0 = r0.j()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.cw.up, com.bytedance.adsdk.ugeno.j.ae
    public float getRipple() {
            r1 = this;
            float r0 = r1.xt
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.ae
    public float getRubIn() {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.cw
            float r0 = r0.getRubIn()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.ae
    public float getShine() {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.cw
            float r0 = r0.getShine()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.ae
    public float getStretch() {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.cw
            float r0 = r0.getStretch()
            return r0
    }

    public void j(com.bytedance.adsdk.ugeno.cw r1) {
            r0 = this;
            r0.j = r1
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.bytedance.adsdk.ugeno.cw r0 = r1.j
            if (r0 == 0) goto La
            r0.up()
        La:
            return
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            com.bytedance.adsdk.ugeno.cw r0 = r1.j
            if (r0 == 0) goto La
            r0.m()
        La:
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(android.graphics.Canvas r2) {
            r1 = this;
            super.onDraw(r2)
            com.bytedance.adsdk.ugeno.cw r0 = r1.j
            if (r0 == 0) goto Lf
            r0.j(r2, r1)
            com.bytedance.adsdk.ugeno.cw r0 = r1.j
            r0.j(r2)
        Lf:
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            com.bytedance.adsdk.ugeno.cw r0 = r1.j
            if (r0 == 0) goto L7
            r0.j(r3, r4, r5, r6)
        L7:
            super.onLayout(r2, r3, r4, r5, r6)
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            com.bytedance.adsdk.ugeno.cw r0 = r1.j
            if (r0 == 0) goto L12
            int[] r2 = r0.j(r2, r3)
            r3 = 0
            r3 = r2[r3]
            r0 = 1
            r2 = r2[r0]
            super.onMeasure(r3, r2)
            return
        L12:
            super.onMeasure(r2, r3)
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            com.bytedance.adsdk.ugeno.cw r4 = r0.j
            if (r4 == 0) goto La
            r4.xt(r1, r2, r3, r3)
        La:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            super.onWindowFocusChanged(r2)
            com.bytedance.adsdk.ugeno.cw r0 = r1.j
            if (r0 == 0) goto La
            r0.j(r2)
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.cw
            r0.j(r2)
            return
    }

    public void setBorderRadius(float r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.cw
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }

    public void setRipple(float r2) {
            r1 = this;
            r1.xt = r2
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.cw
            if (r0 == 0) goto L9
            r0.xt(r2)
        L9:
            r1.postInvalidate()
            return
    }

    public void setRubIn(float r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.cw
            if (r0 == 0) goto L7
            r0.up(r2)
        L7:
            return
    }

    public void setShine(float r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.cw
            if (r0 == 0) goto L7
            r0.cw(r2)
        L7:
            return
    }

    public void setStretch(float r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.cw
            if (r0 == 0) goto L7
            r0.r(r2)
        L7:
            return
    }
}
