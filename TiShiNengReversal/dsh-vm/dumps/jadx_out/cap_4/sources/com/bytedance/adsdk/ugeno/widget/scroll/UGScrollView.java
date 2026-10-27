package com.bytedance.adsdk.ugeno.widget.scroll;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class UGScrollView extends android.widget.ScrollView {
    private com.bytedance.adsdk.ugeno.cw j;

    public UGScrollView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
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

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
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

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            com.bytedance.adsdk.ugeno.cw r0 = r1.j
            if (r0 == 0) goto L7
            r0.j(r3, r4, r5, r6)
        L7:
            super.onLayout(r2, r3, r4, r5, r6)
            return
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
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

    @Override // android.widget.ScrollView, android.view.View
    protected void onSizeChanged(int r2, int r3, int r4, int r5) {
            r1 = this;
            super.onSizeChanged(r2, r3, r4, r5)
            com.bytedance.adsdk.ugeno.cw r0 = r1.j
            if (r0 == 0) goto La
            r0.xt(r2, r3, r4, r5)
        La:
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
}
