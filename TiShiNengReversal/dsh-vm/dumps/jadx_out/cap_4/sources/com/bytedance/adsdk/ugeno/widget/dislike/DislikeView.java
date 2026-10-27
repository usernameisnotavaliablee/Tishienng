package com.bytedance.adsdk.ugeno.widget.dislike;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class DislikeView extends android.view.View {
    private float ae;
    private int cw;
    private int g;
    private com.bytedance.adsdk.ugeno.cw j;

    /* renamed from: m, reason: collision with root package name */
    private android.graphics.Paint f2008m;

    /* renamed from: r, reason: collision with root package name */
    private android.graphics.RectF f2009r;
    private android.graphics.Paint tl;
    private android.graphics.Paint up;
    private int xt;

    public DislikeView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.j()
            return
    }

    private void j() {
            r2 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.up = r0
            r1 = 1
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.tl = r0
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.f2008m = r0
            r0.setAntiAlias(r1)
            r0 = 0
            r2.setBackgroundColor(r0)
            return
    }

    public void j(com.bytedance.adsdk.ugeno.xt.cw r1) {
            r0 = this;
            r0.j = r1
            return
    }

    @Override // android.view.View
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

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r9) {
            r8 = this;
            super.onDraw(r9)
            r1 = 0
            r8.setBackgroundColor(r1)
            android.graphics.RectF r1 = r8.f2009r
            float r2 = r8.ae
            android.graphics.Paint r3 = r8.f2008m
            r9.drawRoundRect(r1, r2, r2, r3)
            android.graphics.RectF r1 = r8.f2009r
            float r2 = r8.ae
            android.graphics.Paint r3 = r8.up
            r9.drawRoundRect(r1, r2, r2, r3)
            int r1 = r8.xt
            float r2 = (float) r1
            r6 = 1050253722(0x3e99999a, float:0.3)
            float r2 = r2 * r6
            int r3 = r8.cw
            float r4 = (float) r3
            float r4 = r4 * r6
            float r1 = (float) r1
            r7 = 1060320051(0x3f333333, float:0.7)
            float r1 = r1 * r7
            float r3 = (float) r3
            float r3 = r3 * r7
            android.graphics.Paint r5 = r8.tl
            r0 = r3
            r3 = r1
            r1 = r2
            r2 = r4
            r4 = r0
            r0 = r9
            r0.drawLine(r1, r2, r3, r4, r5)
            int r0 = r8.xt
            float r1 = (float) r0
            float r1 = r1 * r7
            int r2 = r8.cw
            float r3 = (float) r2
            float r3 = r3 * r6
            float r0 = (float) r0
            float r0 = r0 * r6
            float r2 = (float) r2
            float r4 = r2 * r7
            android.graphics.Paint r5 = r8.tl
            r2 = r3
            r3 = r0
            r0 = r9
            r0.drawLine(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            com.bytedance.adsdk.ugeno.cw r0 = r1.j
            if (r0 == 0) goto L7
            r0.j(r3, r4, r5, r6)
        L7:
            super.onLayout(r2, r3, r4, r5, r6)
            return
    }

    @Override // android.view.View
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
    protected void onSizeChanged(int r7, int r8, int r9, int r10) {
            r6 = this;
            super.onSizeChanged(r7, r8, r9, r10)
            r6.xt = r7
            r6.cw = r8
            android.graphics.RectF r0 = new android.graphics.RectF
            int r1 = r6.g
            float r2 = (float) r1
            float r3 = (float) r1
            int r4 = r6.xt
            int r4 = r4 - r1
            float r4 = (float) r4
            int r5 = r6.cw
            int r5 = r5 - r1
            float r1 = (float) r5
            r0.<init>(r2, r3, r4, r1)
            r6.f2009r = r0
            com.bytedance.adsdk.ugeno.cw r0 = r6.j
            if (r0 == 0) goto L21
            r0.xt(r7, r8, r9, r10)
        L21:
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

    public void setBgColor(int r3) {
            r2 = this;
            android.graphics.Paint r0 = r2.f2008m
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = r2.f2008m
            r0.setColor(r3)
            return
    }

    public void setDislikeColor(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.tl
            r0.setColor(r2)
            return
    }

    public void setDislikeWidth(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.tl
            float r2 = (float) r2
            r0.setStrokeWidth(r2)
            return
    }

    public void setRadius(float r1) {
            r0 = this;
            r0.ae = r1
            return
    }

    public void setStrokeColor(int r3) {
            r2 = this;
            android.graphics.Paint r0 = r2.up
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint r0 = r2.up
            r0.setColor(r3)
            return
    }

    public void setStrokeWidth(int r3) {
            r2 = this;
            android.graphics.Paint r0 = r2.up
            float r1 = (float) r3
            r0.setStrokeWidth(r1)
            r2.g = r3
            return
    }
}
