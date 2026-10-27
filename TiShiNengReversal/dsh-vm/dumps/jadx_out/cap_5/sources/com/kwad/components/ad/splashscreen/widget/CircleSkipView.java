package com.kwad.components.ad.splashscreen.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class CircleSkipView extends com.kwad.sdk.widget.KSFrameLayout implements com.kwad.components.ad.splashscreen.widget.b {
    private int JA;
    private android.animation.ValueAnimator JB;
    private boolean JC;
    private com.kwad.components.ad.splashscreen.widget.SkipView.a JD;
    private long JE;
    private float JF;
    private float Jy;
    private float Jz;
    private android.graphics.Paint mPaint;
    private android.graphics.RectF mRectF;
    private int padding;
    private int radius;
    private boolean vX;





    public CircleSkipView(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public CircleSkipView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public CircleSkipView(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.Nullable android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r2.mPaint = r4
            r4 = 1132920832(0x43870000, float:270.0)
            r2.Jy = r4
            r4 = 1135869952(0x43b40000, float:360.0)
            r2.Jz = r4
            r4 = 0
            r2.radius = r4
            r2.JA = r4
            r2.JC = r4
            r0 = 0
            r2.JE = r0
            r5 = 0
            r2.JF = r5
            r2.padding = r4
            r4 = 1
            r2.vX = r4
            r2.O(r3)
            return
    }

    private void O(android.content.Context r3) {
            r2 = this;
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            r1 = 17
            r0.gravity = r1
            r2.af(r3)
            android.widget.TextView r3 = ag(r3)
            r2.addView(r3, r0)
            com.kwad.components.ad.splashscreen.widget.CircleSkipView$1 r3 = new com.kwad.components.ad.splashscreen.widget.CircleSkipView$1
            r3.<init>(r2)
            r2.setOnClickListener(r3)
            return
    }

    static /* synthetic */ float a(com.kwad.components.ad.splashscreen.widget.CircleSkipView r0, float r1) {
            r0.JF = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.widget.SkipView.a a(com.kwad.components.ad.splashscreen.widget.CircleSkipView r0) {
            com.kwad.components.ad.splashscreen.widget.SkipView$a r0 = r0.JD
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.ad.splashscreen.widget.CircleSkipView r0, int r1) {
            r0.al(r1)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.splashscreen.widget.CircleSkipView r0, boolean r1) {
            r1 = 1
            r0.JC = r1
            return r1
    }

    private void af(android.content.Context r6) {
            r5 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = com.kwad.sdk.c.a.a.a(r6, r0)
            r5.JA = r0
            r0 = 1107296256(0x42000000, float:32.0)
            int r6 = com.kwad.sdk.c.a.a.a(r6, r0)
            int r0 = r5.JA
            int r6 = r6 - r0
            r5.radius = r6
            int r0 = r0 / 2
            r5.padding = r0
            android.graphics.RectF r6 = new android.graphics.RectF
            int r0 = r5.padding
            float r1 = (float) r0
            float r2 = (float) r0
            int r3 = r5.radius
            int r4 = r3 + r0
            float r4 = (float) r4
            int r3 = r3 + r0
            float r0 = (float) r3
            r6.<init>(r1, r2, r4, r0)
            r5.mRectF = r6
            return
    }

    private static android.widget.TextView ag(android.content.Context r2) {
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r2)
            int r1 = com.kwad.sdk.R.string.ksad_skip_text
            java.lang.String r2 = r2.getString(r1)
            r0.setText(r2)
            r2 = -1
            r0.setTextColor(r2)
            r2 = 1094713344(0x41400000, float:12.0)
            r0.setTextSize(r2)
            return r0
    }

    private void al(int r2) {
            r1 = this;
            com.kwad.components.ad.splashscreen.widget.SkipView$a r0 = r1.JD
            if (r0 == 0) goto L7
            r0.am(r2)
        L7:
            return
    }

    static /* synthetic */ float b(com.kwad.components.ad.splashscreen.widget.CircleSkipView r0, float r1) {
            r0.Jy = r1
            return r1
    }

    static /* synthetic */ void b(com.kwad.components.ad.splashscreen.widget.CircleSkipView r0) {
            r0.nm()
            return
    }

    static /* synthetic */ float c(com.kwad.components.ad.splashscreen.widget.CircleSkipView r0) {
            float r0 = r0.JF
            return r0
    }

    static /* synthetic */ float c(com.kwad.components.ad.splashscreen.widget.CircleSkipView r0, float r1) {
            r0.Jz = r1
            return r1
    }

    private void c(int r4, boolean r5) {
            r3 = this;
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0030: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r3.JB = r0
            long r1 = (long) r4
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r3.JB
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r3.JB
            com.kwad.components.ad.splashscreen.widget.CircleSkipView$3 r1 = new com.kwad.components.ad.splashscreen.widget.CircleSkipView$3
            r1.<init>(r3)
            r0.addListener(r1)
            android.animation.ValueAnimator r0 = r3.JB
            com.kwad.components.ad.splashscreen.widget.CircleSkipView$4 r1 = new com.kwad.components.ad.splashscreen.widget.CircleSkipView$4
            r1.<init>(r3, r4, r5)
            r0.addUpdateListener(r1)
            return
    }

    private void nl() {
            r3 = this;
            r0 = 1
            r3.JC = r0
            android.animation.ValueAnimator r0 = r3.JB
            if (r0 == 0) goto L11
            long r1 = r3.JE
            r0.setCurrentPlayTime(r1)
            android.animation.ValueAnimator r0 = r3.JB
            r0.start()
        L11:
            return
    }

    private void nm() {
            r2 = this;
            r0 = 0
            r2.JC = r0
            android.animation.ValueAnimator r0 = r2.JB
            if (r0 == 0) goto L12
            long r0 = r0.getCurrentPlayTime()
            r2.JE = r0
            android.animation.ValueAnimator r0 = r2.JB
            r0.cancel()
        L12:
            return
    }

    private void setAnimationPaint(android.graphics.Paint r2) {
            r1 = this;
            r2.reset()
            r0 = 1
            r2.setAntiAlias(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r0)
            int r0 = r1.JA
            float r0 = (float) r0
            r2.setStrokeWidth(r0)
            r0 = -1
            r2.setColor(r0)
            return
    }

    private void setBgCirclePaint(android.graphics.Paint r2) {
            r1 = this;
            r2.reset()
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r2.setStyle(r0)
            java.lang.String r0 = "#4D000000"
            int r0 = android.graphics.Color.parseColor(r0)
            r2.setColor(r0)
            r0 = 1
            r2.setAntiAlias(r0)
            return
    }

    private void setOuterCirclePaint(android.graphics.Paint r2) {
            r1 = this;
            r2.reset()
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r0)
            int r0 = r1.JA
            float r0 = (float) r0
            r2.setStrokeWidth(r0)
            java.lang.String r0 = "#33FFFFFF"
            int r0 = android.graphics.Color.parseColor(r0)
            r2.setColor(r0)
            r0 = 1
            r2.setAntiAlias(r0)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.b
    public final void A(com.kwad.sdk.core.response.model.AdInfo r1) {
            r0 = this;
            com.kwad.components.ad.splashscreen.widget.CircleSkipView$2 r1 = new com.kwad.components.ad.splashscreen.widget.CircleSkipView$2
            r1.<init>(r0)
            com.kwad.sdk.utils.bw.postOnUiThread(r1)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.b
    public final void B(com.kwad.sdk.core.response.model.AdInfo r1) {
            r0 = this;
            r0.nl()
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.b
    public final void a(com.kwad.components.ad.splashscreen.local.SplashSkipViewModel r2, com.kwad.sdk.core.response.model.AdInfo r3) {
            r1 = this;
            boolean r0 = com.kwad.sdk.core.response.b.a.cD(r3)
            r1.vX = r0
            boolean r3 = com.kwad.sdk.core.response.b.a.cE(r3)
            boolean r0 = r1.vX
            if (r0 == 0) goto L12
            r0 = 0
            r1.setVisibility(r0)
        L12:
            int r2 = r2.skipSecond
            int r2 = r2 * 1000
            r1.c(r2, r3)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.b
    public final int ao(int r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.content.Context r0 = r2.getContext()
            r1 = 1108082688(0x420c0000, float:35.0)
            int r0 = com.kwad.sdk.c.a.a.a(r0, r1)
            r3.height = r0
            int r3 = r2.getWidth()
            return r3
    }

    @Override // com.kwad.components.ad.splashscreen.widget.b
    public final void cq() {
            r0 = this;
            r0.nm()
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas r14) {
            r13 = this;
            int r0 = r13.getWidth()
            int r1 = r13.getHeight()
            int r0 = java.lang.Math.min(r0, r1)
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            android.graphics.Paint r2 = r13.mPaint
            r13.setBgCirclePaint(r2)
            int r2 = r13.getWidth()
            float r2 = (float) r2
            float r2 = r2 / r1
            int r3 = r13.getHeight()
            float r3 = (float) r3
            float r3 = r3 / r1
            int r1 = r13.JA
            float r1 = (float) r1
            float r0 = r0 - r1
            android.graphics.Paint r1 = r13.mPaint
            r14.drawCircle(r2, r3, r0, r1)
            android.graphics.Paint r0 = r13.mPaint
            r13.setOuterCirclePaint(r0)
            android.graphics.RectF r2 = r13.mRectF
            r5 = 0
            android.graphics.Paint r6 = r13.mPaint
            r3 = 0
            r4 = 1135869952(0x43b40000, float:360.0)
            r1 = r14
            r1.drawArc(r2, r3, r4, r5, r6)
            boolean r14 = r13.JC
            if (r14 == 0) goto L52
            android.graphics.Paint r14 = r13.mPaint
            r13.setAnimationPaint(r14)
            android.graphics.RectF r8 = r13.mRectF
            float r9 = r13.Jy
            float r14 = r13.Jz
            float r10 = -r14
            r11 = 0
            android.graphics.Paint r12 = r13.mPaint
            r7 = r1
            r7.drawArc(r8, r9, r10, r11, r12)
        L52:
            super.dispatchDraw(r1)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.widget.b
    public void setOnViewListener(com.kwad.components.ad.splashscreen.widget.SkipView.a r1) {
            r0 = this;
            r0.JD = r1
            return
    }
}
