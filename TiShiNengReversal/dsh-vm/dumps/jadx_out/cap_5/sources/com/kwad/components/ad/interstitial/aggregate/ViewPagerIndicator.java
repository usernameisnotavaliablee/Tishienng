package com.kwad.components.ad.interstitial.aggregate;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ViewPagerIndicator extends android.view.View {
    private float lA;
    private android.graphics.Paint lB;
    private float lC;
    private float lD;
    private float lE;
    private int lF;
    private android.graphics.Paint lG;
    private float lH;
    private com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator.a lI;
    private android.animation.ValueAnimator lJ;
    private int lr;
    private int lw;
    private int lx;
    private int ly;
    private float lz;
    private final android.content.Context mContext;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void I(int r1);
    }

    public ViewPagerIndicator(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ViewPagerIndicator(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ViewPagerIndicator(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            r1.mContext = r2
            r0 = 0
            r1.setWillNotDraw(r0)
            r1.a(r2, r3, r4)
            r1.dE()
            return
    }

    private void K(int r6) {
            r5 = this;
            int r0 = r5.lF
            if (r0 > 0) goto La
            r6 = 8
            r5.setVisibility(r6)
            return
        La:
            float r0 = r5.lE
            float r1 = r5.lD
            r2 = 2
            float[] r2 = new float[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r2)
            r5.lJ = r0
            int r1 = r5.lF
            long r1 = (long) r1
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r5.lJ
            com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator$1 r1 = new com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator$1
            r1.<init>(r5)
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r0 = r5.lJ
            com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator$2 r1 = new com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator$2
            r1.<init>(r5, r6)
            r0.addListener(r1)
            android.animation.ValueAnimator r6 = r5.lJ
            r6.start()
            return
    }

    static /* synthetic */ float a(com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator r0, float r1) {
            r0.lH = r1
            return r1
    }

    static /* synthetic */ int a(com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator r0, int r1) {
            r0.lr = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator.a a(com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator r0) {
            com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator$a r0 = r0.lI
            return r0
    }

    @android.annotation.SuppressLint({"CustomViewStyleable"})
    private void a(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            int[] r0 = com.kwad.sdk.R.styleable.ksad_ViewPagerIndicator
            r1 = 0
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0, r5, r1)
            int r4 = com.kwad.sdk.R.styleable.ksad_ViewPagerIndicator_ksad_dot_distance
            android.content.Context r5 = r2.mContext
            r0 = 1084227584(0x40a00000, float:5.0)
            int r5 = com.kwad.sdk.c.a.a.a(r5, r0)
            float r5 = (float) r5
            float r4 = r3.getDimension(r4, r5)
            r2.lA = r4
            int r4 = com.kwad.sdk.R.styleable.ksad_ViewPagerIndicator_ksad_dot_height
            android.content.Context r5 = r2.mContext
            r0 = 1086324736(0x40c00000, float:6.0)
            int r5 = com.kwad.sdk.c.a.a.a(r5, r0)
            float r5 = (float) r5
            float r4 = r3.getDimension(r4, r5)
            r2.lC = r4
            int r4 = com.kwad.sdk.R.styleable.ksad_ViewPagerIndicator_ksad_dot_selected_width
            android.content.Context r5 = r2.mContext
            r1 = 1112014848(0x42480000, float:50.0)
            int r5 = com.kwad.sdk.c.a.a.a(r5, r1)
            float r5 = (float) r5
            float r4 = r3.getDimension(r4, r5)
            r2.lD = r4
            int r4 = com.kwad.sdk.R.styleable.ksad_ViewPagerIndicator_ksad_dot_unselected_width
            android.content.Context r5 = r2.mContext
            int r5 = com.kwad.sdk.c.a.a.a(r5, r0)
            float r5 = (float) r5
            float r4 = r3.getDimension(r4, r5)
            r2.lE = r4
            int r4 = com.kwad.sdk.R.styleable.ksad_ViewPagerIndicator_ksad_default_color
            android.content.res.Resources r5 = r2.getResources()
            int r0 = com.kwad.sdk.R.color.ksad_88_white
            int r5 = r5.getColor(r0)
            int r4 = r3.getColor(r4, r5)
            r2.lx = r4
            int r4 = com.kwad.sdk.R.styleable.ksad_ViewPagerIndicator_ksad_height_color
            android.content.res.Resources r5 = r2.getResources()
            int r0 = com.kwad.sdk.R.color.ksad_white
            int r5 = r5.getColor(r0)
            int r4 = r3.getColor(r4, r5)
            r2.lw = r4
            r3.recycle()
            return
    }

    private void a(android.graphics.Canvas r10) {
            r9 = this;
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r9.ly
            if (r1 >= r2) goto Lab
            int r2 = r9.lr
            if (r1 >= r2) goto L27
            int r3 = r2 + (-1)
            if (r1 == r3) goto L27
            float r2 = (float) r1
            float r3 = r9.lA
            float r4 = r9.lE
            float r3 = r3 + r4
            float r2 = r2 * r3
            r0.left = r2
            float r2 = r2 + r4
            r0.right = r2
            android.graphics.Paint r2 = r9.lB
            int r3 = r9.lx
            r2.setColor(r3)
            goto L95
        L27:
            int r3 = r2 + (-1)
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r1 != r3) goto L4b
            float r2 = (float) r1
            float r3 = r9.lA
            float r5 = r9.lE
            float r3 = r3 + r5
            float r2 = r2 * r3
            r0.left = r2
            float r2 = r2 + r5
            float r3 = r9.lD
            float r3 = r3 - r5
            float r5 = r9.lz
            float r4 = r4 - r5
            float r3 = r3 * r4
            float r2 = r2 + r3
            r0.right = r2
            android.graphics.Paint r2 = r9.lB
            int r3 = r9.lx
            r2.setColor(r3)
            goto L95
        L4b:
            if (r1 != r2) goto L7a
            if (r2 == 0) goto L52
            float r2 = r9.lz
            goto L54
        L52:
            r2 = 1065353216(0x3f800000, float:1.0)
        L54:
            int r3 = r1 + (-1)
            float r3 = (float) r3
            float r5 = r9.lA
            float r6 = r9.lE
            float r7 = r5 + r6
            float r3 = r3 * r7
            float r3 = r3 + r6
            float r7 = r9.lD
            float r8 = r7 - r6
            float r4 = r4 - r2
            float r8 = r8 * r4
            float r3 = r3 + r8
            float r3 = r3 + r5
            r0.left = r3
            float r7 = r7 - r6
            float r2 = r2 * r7
            float r3 = r3 + r2
            float r3 = r3 + r6
            r0.right = r3
            android.graphics.Paint r2 = r9.lB
            int r3 = r9.lx
            r2.setColor(r3)
            goto L95
        L7a:
            int r2 = r1 + (-1)
            float r2 = (float) r2
            float r3 = r9.lA
            float r4 = r9.lE
            float r5 = r3 + r4
            float r2 = r2 * r5
            float r5 = r9.lD
            float r3 = r3 + r5
            float r2 = r2 + r3
            r0.left = r2
            float r2 = r2 + r4
            r0.right = r2
            android.graphics.Paint r2 = r9.lB
            int r3 = r9.lx
            r2.setColor(r3)
        L95:
            r2 = 0
            r0.top = r2
            float r3 = r9.lC
            float r2 = r2 + r3
            r0.bottom = r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r4 = r3 / r2
            float r3 = r3 / r2
            android.graphics.Paint r2 = r9.lB
            r10.drawRoundRect(r0, r4, r3, r2)
            int r1 = r1 + 1
            goto L6
        Lab:
            return
    }

    static /* synthetic */ float b(com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator r0, float r1) {
            r0.lz = r1
            return r1
    }

    static /* synthetic */ int b(com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator r0) {
            int r0 = r0.ly
            return r0
    }

    private void b(android.graphics.Canvas r8) {
            r7 = this;
            float r0 = r7.lH
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2c
            android.graphics.RectF r0 = new android.graphics.RectF
            int r2 = r7.lr
            float r3 = (float) r2
            float r4 = r7.lA
            float r5 = r7.lE
            float r6 = r4 + r5
            float r3 = r3 * r6
            float r2 = (float) r2
            float r4 = r4 + r5
            float r2 = r2 * r4
            float r4 = r7.lH
            float r2 = r2 + r4
            float r4 = r7.lC
            r0.<init>(r3, r1, r2, r4)
            float r1 = r7.lC
            r2 = 1073741824(0x40000000, float:2.0)
            float r3 = r1 / r2
            float r1 = r1 / r2
            android.graphics.Paint r2 = r7.lG
            r8.drawRoundRect(r0, r3, r1, r2)
        L2c:
            return
    }

    static /* synthetic */ void b(com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator r0, int r1) {
            r0.K(r1)
            return
    }

    private void dE() {
            r5 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r5.lB = r0
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            r0.setStyle(r2)
            android.graphics.Paint r0 = r5.lB
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.setStrokeWidth(r3)
            android.graphics.Paint r0 = r5.lB
            int r4 = r5.lx
            r0.setColor(r4)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r5.lG = r0
            r0.setStyle(r2)
            android.graphics.Paint r0 = r5.lG
            r0.setStrokeWidth(r3)
            android.graphics.Paint r0 = r5.lG
            int r1 = r5.lw
            r0.setColor(r1)
            return
    }

    @androidx.annotation.RequiresApi(api = 19)
    public final void dF() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.lJ
            if (r0 == 0) goto L7
            r0.pause()
        L7:
            return
    }

    @androidx.annotation.RequiresApi(api = 19)
    public final void dG() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.lJ
            if (r0 == 0) goto L7
            r0.resume()
        L7:
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.onDraw(r1)
            r0.a(r1)
            r0.b(r1)
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r6, int r7) {
            r5 = this;
            super.onMeasure(r6, r7)
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            int r6 = android.view.View.MeasureSpec.getMode(r6)
            int r7 = android.view.View.MeasureSpec.getMode(r7)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            if (r7 != r4) goto L1b
            goto L22
        L1b:
            if (r7 != r2) goto L21
            float r7 = r5.lC
            int r1 = (int) r7
            goto L22
        L21:
            r1 = 0
        L22:
            if (r6 != r4) goto L25
            goto L3f
        L25:
            if (r6 != r2) goto L3e
            int r6 = r5.ly
            r7 = 1
            if (r6 <= r7) goto L3a
            float r0 = r5.lD
            int r6 = r6 - r7
            float r6 = (float) r6
            float r7 = r5.lA
            float r2 = r5.lE
            float r7 = r7 + r2
            float r6 = r6 * r7
            float r0 = r0 + r6
            int r0 = (int) r0
            goto L3f
        L3a:
            float r6 = r5.lD
            int r0 = (int) r6
            goto L3f
        L3e:
            r0 = 0
        L3f:
            r5.setMeasuredDimension(r0, r1)
            return
    }

    public void setAdShowTime(int r1) {
            r0 = this;
            r0.lF = r1
            return
    }

    public void setPlayProgressListener(com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator.a r1) {
            r0 = this;
            r0.lI = r1
            return
    }

    public void setViewPager(androidx.viewpager.widget.ViewPager r3) {
            r2 = this;
            androidx.viewpager.widget.PagerAdapter r0 = r3.getAdapter()
            if (r0 != 0) goto L7
            goto L10
        L7:
            int r0 = r0.getCount()
            r2.ly = r0
            r1 = 1
            if (r0 > r1) goto L11
        L10:
            return
        L11:
            com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator$3 r0 = new com.kwad.components.ad.interstitial.aggregate.ViewPagerIndicator$3
            r0.<init>(r2)
            r3.addOnPageChangeListener(r0)
            int r3 = r2.lr
            r2.K(r3)
            return
    }
}
