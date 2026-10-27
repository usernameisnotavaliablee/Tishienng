package com.bytedance.adsdk.ugeno.widget.text;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RichTextView extends android.widget.TextView implements com.bytedance.adsdk.ugeno.j.ae {
    private com.bytedance.adsdk.ugeno.cw j;
    private com.bytedance.adsdk.ugeno.j.tl xt;

    public RichTextView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            com.bytedance.adsdk.ugeno.j.tl r1 = new com.bytedance.adsdk.ugeno.j.tl
            r1.<init>(r0)
            r0.xt = r1
            return
    }

    public float getBorderRadius() {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.xt
            float r0 = r0.j()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.ae
    public float getRipple() {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.xt
            float r0 = r0.getRipple()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.ae
    public float getRubIn() {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.xt
            float r0 = r0.getRubIn()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.ae
    public float getShine() {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.xt
            float r0 = r0.getShine()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.ae
    public float getStretch() {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.xt
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
            if (r0 == 0) goto La
            r0.j(r2)
        La:
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
    protected void onMeasure(int r4, int r5) {
            r3 = this;
            com.bytedance.adsdk.ugeno.cw r0 = r3.j
            if (r0 == 0) goto L12
            int[] r0 = r0.j(r4, r5)
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            r0 = r0[r2]
            super.onMeasure(r1, r0)
            goto L15
        L12:
            super.onMeasure(r4, r5)
        L15:
            super.onMeasure(r4, r5)
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r2, int r3, int r4, int r5) {
            r1 = this;
            super.onSizeChanged(r2, r3, r4, r5)
            com.bytedance.adsdk.ugeno.cw r0 = r1.j
            if (r0 == 0) goto La
            r0.xt(r2, r3, r4, r5)
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
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.xt
            r0.j(r2)
            return
    }

    public void setBorderRadius(float r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.xt
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }

    public void setRichText(java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lc
            r0 = 0
            android.text.Spanned r3 = com.bxkj.base.util.l.a(r3, r0)
            goto L10
        Lc:
            android.text.Spanned r3 = android.text.Html.fromHtml(r3)
        L10:
            r2.setText(r3)
            return
    }

    public void setRipple(float r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.xt
            if (r0 == 0) goto L7
            r0.xt(r2)
        L7:
            return
    }

    public void setRubIn(float r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.xt
            if (r0 == 0) goto L7
            r0.up(r2)
        L7:
            return
    }

    public void setShine(float r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.xt
            if (r0 == 0) goto L7
            r0.cw(r2)
        L7:
            return
    }

    public void setStretch(float r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.xt
            if (r0 == 0) goto L7
            r0.r(r2)
        L7:
            return
    }
}
