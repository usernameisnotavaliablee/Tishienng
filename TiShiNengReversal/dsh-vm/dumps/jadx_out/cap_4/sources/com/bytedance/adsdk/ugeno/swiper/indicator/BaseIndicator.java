package com.bytedance.adsdk.ugeno.swiper.indicator;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class BaseIndicator extends android.widget.LinearLayout {
    private int ae;
    protected int cw;
    private int g;
    protected android.content.Context j;

    /* renamed from: m, reason: collision with root package name */
    private int f1982m;
    private float oq;
    private float qv;

    /* renamed from: r, reason: collision with root package name */
    private java.util.List<android.view.View> f1983r;
    private boolean tl;
    private int up;
    private java.lang.String vl;
    protected int xt;

    public BaseIndicator(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r1.up = r0
            r0 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r1.f1982m = r0
            r0 = 5
            r1.ae = r0
            r0 = 40
            r1.xt = r0
            r0 = 20
            r1.cw = r0
            java.lang.String r0 = "row"
            r1.vl = r0
            r1.j = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f1983r = r2
            r2 = 0
            r1.setOrientation(r2)
            return
    }

    public int getSize() {
            r1 = this;
            java.util.List<android.view.View> r0 = r1.f1983r
            int r0 = r0.size()
            return r0
    }

    public void j() {
            r4 = this;
            android.view.View r0 = new android.view.View
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r1 = 0
            r0.setClickable(r1)
            boolean r1 = r4 instanceof com.bytedance.adsdk.ugeno.swiper.indicator.DotIndicator
            if (r1 == 0) goto L15
            int r1 = r4.xt
            r4.cw = r1
        L15:
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            int r2 = r4.xt
            int r3 = r4.cw
            r1.<init>(r2, r3)
            int r2 = r4.getOrientation()
            r3 = 1
            if (r2 != r3) goto L2c
            int r2 = r4.ae
            r1.topMargin = r2
            r1.bottomMargin = r2
            goto L32
        L2c:
            int r2 = r4.ae
            r1.leftMargin = r2
            r1.rightMargin = r2
        L32:
            r4.addView(r0, r1)
            int r1 = r4.f1982m
            android.graphics.drawable.Drawable r1 = r4.xt(r1)
            r0.setBackground(r1)
            java.util.List<android.view.View> r1 = r4.f1983r
            r1.add(r0)
            return
    }

    public void j(int r7) {
            r6 = this;
            boolean r0 = r6 instanceof com.bytedance.adsdk.ugeno.swiper.indicator.DotIndicator
            if (r0 == 0) goto L8
            int r0 = r6.xt
            r6.cw = r0
        L8:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            int r1 = r6.xt
            int r2 = r6.cw
            r0.<init>(r1, r2)
            int r1 = r6.getOrientation()
            r2 = 1
            if (r1 != r2) goto L1f
            int r1 = r6.ae
            r0.topMargin = r1
            r0.bottomMargin = r1
            goto L25
        L1f:
            int r1 = r6.ae
            r0.leftMargin = r1
            r0.rightMargin = r1
        L25:
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            int r3 = r6.xt
            int r4 = r6.cw
            r1.<init>(r3, r4)
            int r3 = r6.getOrientation()
            if (r3 != r2) goto L3b
            int r2 = r6.ae
            r1.topMargin = r2
            r1.bottomMargin = r2
            goto L41
        L3b:
            int r2 = r6.ae
            r1.leftMargin = r2
            r1.rightMargin = r2
        L41:
            boolean r2 = r6.tl
            int r3 = r6.g
            java.util.List<android.view.View> r4 = r6.f1983r
            int r4 = r4.size()
            int r2 = com.bytedance.adsdk.ugeno.swiper.xt.j(r2, r3, r4)
            boolean r3 = r6.tl
            java.util.List<android.view.View> r4 = r6.f1983r
            int r4 = r4.size()
            int r3 = com.bytedance.adsdk.ugeno.swiper.xt.j(r3, r7, r4)
            java.util.List<android.view.View> r4 = r6.f1983r
            int r4 = r4.size()
            if (r4 != 0) goto L64
            r3 = 0
        L64:
            java.util.List<android.view.View> r4 = r6.f1983r
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto Lb6
            java.util.List<android.view.View> r4 = r6.f1983r
            boolean r4 = com.bytedance.adsdk.ugeno.swiper.xt.j(r2, r4)
            if (r4 == 0) goto Lb6
            java.util.List<android.view.View> r4 = r6.f1983r
            boolean r4 = com.bytedance.adsdk.ugeno.swiper.xt.j(r3, r4)
            if (r4 == 0) goto Lb6
            java.util.List<android.view.View> r4 = r6.f1983r
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r5 = r6.f1982m
            android.graphics.drawable.Drawable r5 = r6.xt(r5)
            r4.setBackground(r5)
            java.util.List<android.view.View> r4 = r6.f1983r
            java.lang.Object r2 = r4.get(r2)
            android.view.View r2 = (android.view.View) r2
            r2.setLayoutParams(r1)
            java.util.List<android.view.View> r1 = r6.f1983r
            java.lang.Object r1 = r1.get(r3)
            android.view.View r1 = (android.view.View) r1
            int r2 = r6.up
            android.graphics.drawable.Drawable r2 = r6.xt(r2)
            r1.setBackground(r2)
            java.util.List<android.view.View> r1 = r6.f1983r
            java.lang.Object r1 = r1.get(r3)
            android.view.View r1 = (android.view.View) r1
            r1.setLayoutParams(r0)
            r6.g = r7
        Lb6:
            return
    }

    public void j(int r4, int r5) {
            r3 = this;
            java.util.List<android.view.View> r0 = r3.f1983r
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            int r2 = r3.f1982m
            android.graphics.drawable.Drawable r2 = r3.xt(r2)
            r1.setBackground(r2)
            goto L6
        L1c:
            if (r4 < 0) goto L27
            java.util.List<android.view.View> r0 = r3.f1983r
            int r0 = r0.size()
            if (r4 >= r0) goto L27
            goto L28
        L27:
            r4 = 0
        L28:
            java.util.List<android.view.View> r0 = r3.f1983r
            int r0 = r0.size()
            if (r0 <= 0) goto L43
            java.util.List<android.view.View> r0 = r3.f1983r
            java.lang.Object r4 = r0.get(r4)
            android.view.View r4 = (android.view.View) r4
            int r0 = r3.up
            android.graphics.drawable.Drawable r0 = r3.xt(r0)
            r4.setBackground(r0)
            r3.g = r5
        L43:
            return
    }

    public void setIndicatorDirection(java.lang.String r2) {
            r1 = this;
            r1.vl = r2
            java.lang.String r0 = "column"
            boolean r2 = android.text.TextUtils.equals(r2, r0)
            if (r2 == 0) goto Lf
            r2 = 1
            r1.setOrientation(r2)
            return
        Lf:
            r2 = 0
            r1.setOrientation(r2)
            return
    }

    public void setIndicatorHeight(int r1) {
            r0 = this;
            r0.cw = r1
            return
    }

    public void setIndicatorWidth(int r1) {
            r0 = this;
            r0.xt = r1
            return
    }

    public void setIndicatorX(float r1) {
            r0 = this;
            r0.oq = r1
            return
    }

    public void setIndicatorY(float r1) {
            r0 = this;
            r0.qv = r1
            return
    }

    public void setLoop(boolean r1) {
            r0 = this;
            r0.tl = r1
            return
    }

    public void setSelectedColor(int r1) {
            r0 = this;
            r0.up = r1
            return
    }

    public void setUnSelectedColor(int r1) {
            r0 = this;
            r0.f1982m = r1
            return
    }

    public abstract android.graphics.drawable.Drawable xt(int r1);
}
